package structures.nodes;

public class SinglyLinkedNode extends Node {

	private Node next;
	
	public SinglyLinkedNode(int value) {
		super(value);
		this.next = null;
	}
	
	public void setNext(Node next){
		this.next = next;
	}
	
	public Node next(){
		return this.next;
	}
}
