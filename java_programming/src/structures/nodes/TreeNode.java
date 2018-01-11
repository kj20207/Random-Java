package structures.nodes;

public class TreeNode extends Node {

	private TreeNode parent;
	
	private TreeNode leftChild;
	
	private TreeNode rightChild;
	
	public TreeNode(int value, TreeNode parent, TreeNode leftChild, TreeNode rightChild) {
		super(value);
		this.parent = parent;
		this.leftChild = leftChild;
		this.rightChild = rightChild;
	}
	
	public TreeNode parent(){
		return this.parent;
	}
	
	public TreeNode left(){
		return this.leftChild;
	}
	
	public TreeNode right(){
		return this.rightChild;
	}
	
	public void setParent(TreeNode parent){
		this.parent = parent;
	}
	
	public void setleftChild(TreeNode leftChild){
		this.leftChild = leftChild;
	}
	
	public void setRightChild(TreeNode rightChild){
		this.rightChild = rightChild;
	}

}
