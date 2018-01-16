package structures.trees;

import structures.nodes.TreeNode;

public class BinarySearchTree {

	private TreeNode root;

	private int size;
	

	public BinarySearchTree(){
		this.size = 0;
		this.root = null;
	}

	public TreeNode root(){
		return this.root;
	}
	
	public void insert(int n){
		insert(n, this.root);
	}

	private void insert(int n, TreeNode parent){
		if(parent == null){
			this.root = new TreeNode(n, null, null, null);
		}
		else if(n <= parent.getValue()){
			if(parent.left() == null){
				parent.setLeftChild(new TreeNode(n, parent, null, null));
			}
			else{
				insert(n, parent.left());
				return;
			}
		}
		else{
			if(parent.right() == null){
				parent.setRightChild(new TreeNode(n, parent, null, null));
			}
			else{
				insert(n, parent.right());
				return;
			}
			
		}
		
		this.size++;
	}

	public boolean remove(int n){
		return remove(n, this.root);
	}
	
	// TODO
	private boolean removeRoot(){
		
		if(this.root.left() == null && this.root.right() == null)
			this.root = null;
		else if(this.root.left() != null && this.root.right() == null)
			this.root = this.root.left();
		else if(this.root.left() == null && this.root.right() != null)
			this.root = this.root.right();
		
		this.size--;
		return true;
	}

	//TODO
	private boolean remove(int n, TreeNode subRoot){
		
		if(subRoot == null) return false;
		else if(subRoot == this.root && subRoot.getValue() == n)
			return removeRoot();
		else if(n < subRoot.getValue())
			return remove(n, subRoot.left());
		else if(n > subRoot.getValue())
			return remove(n, subRoot.right());
		
		subRoot = null;
		this.size--;
		return true;
	}

	public boolean contains(int n){
		return contains(n, this.root);
	}

	public boolean contains(int n, TreeNode subRoot){
		if(subRoot == null)
			return false;
		else if(subRoot.getValue() == n)
			return true;
		else if(subRoot.getValue() <= n)
			return contains(n, subRoot.left());
		else return contains(n, subRoot.right());
	}

	public boolean isEmpty(){
		return this.size == 0;
	}

	public int size(){
		return this.size;
	}
	
	public void traverseInOrder(){
		traverseInOrder(this.root);
	}

	// Left Middle Right
	public void traverseInOrder(TreeNode subRoot){
		if(subRoot != null){
			traverseInOrder(subRoot.left());
			System.out.print(subRoot.getValue() + " ");
			traverseInOrder(subRoot.right());
		}
	}

	
	public void traversePreOrder(){
		traversePreOrder(this.root);
	}
	
	// Middle Left Right
	public void traversePreOrder(TreeNode subRoot){
		if(subRoot != null){
			System.out.print(subRoot.getValue() + " ");
			traverseInOrder(subRoot.left());
			traverseInOrder(subRoot.right());
		}
	}

	public void traversePostOrder(){
		traversePostOrder(this.root);
	}
	
	// Left Right Middle
	public void traversePostOrder(TreeNode subRoot){
		if(subRoot != null){
			traverseInOrder(subRoot.left());
			traverseInOrder(subRoot.right());
			System.out.print(subRoot.getValue() + " ");
		}
	}

}
