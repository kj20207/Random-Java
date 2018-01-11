package structures.nodes;

public class SinglyLinkedNode extends Node {

	private SinglyLinkedNode next;
	
	public SinglyLinkedNode(int value) {
		super(value);
		this.next = null;
	}
	
	public SinglyLinkedNode(int value, SinglyLinkedNode next) {
		super(value);
		this.next = next;
	}
	
	public void setNext(SinglyLinkedNode next){
		this.next = next;
	}
	
	public Node next(){
		return this.next;
	}
}
