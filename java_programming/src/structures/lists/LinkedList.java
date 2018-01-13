package structures.lists;

import structures.nodes.Node;
import structures.nodes.SinglyLinkedNode;

public class LinkedList {
	
	protected Node head;
	
	protected int size;
	
	public LinkedList(){
		this.head = new SinglyLinkedNode(0);
		this.size = 0;
	}
	
	protected void setHead(Node n){
		this.head = n;
	}
	
	protected Node getHead(){
		return this.head;
	}
	
	public int size(){
		return this.size;
	}
	
	public boolean isEmpty(){
		return this.size == 0;
	}
	
	public Node getIndex(int index){
		
		if(index >= this.size)
			return null;
		
		SinglyLinkedNode n = (SinglyLinkedNode) ((SinglyLinkedNode) this.head).next();
		for(int i = 0; i < index; i++){
			n = (SinglyLinkedNode) n.next();
		}
		
		return n;
	}
	
	public void insert(int n){
		SinglyLinkedNode curr = (SinglyLinkedNode) this.head;
		
		while(curr.next() != null){
			curr = (SinglyLinkedNode) curr.next();
		}
		
		SinglyLinkedNode node = new SinglyLinkedNode(n);
		curr.setNext(node);
		this.size++;
	}
	
	public boolean insertIndex(int n, int index){
		if(index > this.size) return false;
		
		SinglyLinkedNode curr = (SinglyLinkedNode) this.head;
		SinglyLinkedNode prev = null;
		for(int i = 0; i <= index; i++){
			prev = curr;
			curr = (SinglyLinkedNode) curr.next();
		}
		
		SinglyLinkedNode node = new SinglyLinkedNode(n);
		
		prev.setNext(node);
		node.setNext(curr);
		this.size++;
		return true;
	}
	
	public boolean remove(int n){
		if(this.isEmpty()) return false;
	
		SinglyLinkedNode curr = (SinglyLinkedNode) this.head;
		SinglyLinkedNode prev = null;
		
		while(curr != null && curr.getValue() != n){
			prev = curr;
			curr = (SinglyLinkedNode) curr.next();
		}
		
		if(curr == this.head) return false;
		
		prev.setNext((SinglyLinkedNode) curr.next());
		curr = null;
		this.size--;
		
		return true;
	}
	
	public boolean removeIndex(int index){
		if(this.isEmpty()) return false;
		
		SinglyLinkedNode curr = (SinglyLinkedNode) this.head;
		SinglyLinkedNode prev = null;
		
		for(int i = 0; i <= index && curr != null; i++){
			prev = curr;
			curr = (SinglyLinkedNode) curr.next();
		}
		
		if(curr == this.head) return false;
		
		prev.setNext((SinglyLinkedNode) curr.next());
		curr = null;
		this.size--;
		
		return true;
	}
	
	public void printInOrder(){
		SinglyLinkedNode n = (SinglyLinkedNode) this.head;
		for(int i = 0; i < this.size(); i++){
			n = (SinglyLinkedNode) n.next();
			System.out.print(n.getValue() + " ");
		}
	}
	

}
