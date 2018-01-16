package structures.queues;

import structures.nodes.Node;
import structures.nodes.SinglyLinkedNode;

public class Queue {

	private int size;
	
	private Node front;
	
	public Queue(){
		this.size = 0;
		this.front = null;
	}
	
	public void queue(int n){
		if(this.size == 0)
			this.front = new SinglyLinkedNode(n);
		else{
			SinglyLinkedNode node = (SinglyLinkedNode) this.front;
			while(node.next() != null) node = (SinglyLinkedNode) node.next();
			node.setNext(new SinglyLinkedNode(n));
		}
		this.size++;
	}
	
	public int peek(){
		return this.front.getValue();
	}
	
	public Node dequeue(){
		SinglyLinkedNode node = (SinglyLinkedNode) this.front;
		this.front = ((SinglyLinkedNode) this.front).next();
		
		return node;
	}
	
	public int size(){
		return this.size;
	}
	
}

