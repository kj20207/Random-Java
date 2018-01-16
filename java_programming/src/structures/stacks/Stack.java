package structures.stacks;

import structures.nodes.Node;
import structures.nodes.SinglyLinkedNode;

public class Stack {
	
	private Node top;

	private int size;
	
	public Stack(){
		this.top = null;
		this.size = 0;
	}
	
	public void push(int n){
		SinglyLinkedNode node = new SinglyLinkedNode(n);
		node.setNext(this.top);
		this.top = node;
		this.size++;
	}
	
	public Node pop(){
		SinglyLinkedNode tmp = (SinglyLinkedNode) this.top;
		//tmp.setNext(null);
		
		this.top = ((SinglyLinkedNode) this.top).next();
		this.size--;
		return tmp;
	}
	
	public int peek(){
		return this.top.getValue();
	}
	
	public int size(){
		return this.size;
	}
}
