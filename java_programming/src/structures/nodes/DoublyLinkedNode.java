package structures.nodes;

public class DoublyLinkedNode extends SinglyLinkedNode {

	public Node prev;
	
	public DoublyLinkedNode(int value) {
		super(value);
		this.prev = null;
	}
	
	public void setPrevious(Node prev){
		this.prev = prev;
	}
	
	public Node previous(){
		return this.prev;
	}
	
}
