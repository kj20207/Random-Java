package structures.nodes;

public class DoublyLinkedNode extends SinglyLinkedNode {

	public DoublyLinkedNode prev;
	
	public DoublyLinkedNode(int value) {
		super(value);
		this.prev = null;
	}

	public DoublyLinkedNode(int value, SinglyLinkedNode next) {
		super(value, next);
		this.prev = null;
	}
	
	public DoublyLinkedNode(int value, SinglyLinkedNode next, DoublyLinkedNode prev){
		super(value, next);
		this.prev = prev;
	}
	
	public void setPrevious(DoublyLinkedNode prev){
		this.prev = prev;
	}
	
	public DoublyLinkedNode previous(){
		return this.prev;
	}
	
}
