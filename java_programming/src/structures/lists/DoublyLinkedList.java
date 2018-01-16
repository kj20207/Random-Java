package structures.lists;

import structures.nodes.DoublyLinkedNode;
import structures.nodes.Node;

public class DoublyLinkedList extends LinkedList {

	private Node tail;


	public DoublyLinkedList(){
		super();
		this.setHead(new DoublyLinkedNode(0));
		tail = new DoublyLinkedNode(0);
		((DoublyLinkedNode) this.head).setNext(this.tail);
		((DoublyLinkedNode) this.tail).setPrevious(this.head);
	}

	@Override
	public void insert(int n){
		DoublyLinkedNode d = new DoublyLinkedNode(n);
		
		d.setNext(tail);
		d.setPrevious((DoublyLinkedNode) ((DoublyLinkedNode) tail).previous());
		
		((DoublyLinkedNode) ((DoublyLinkedNode) tail).previous()).setNext(d);
		((DoublyLinkedNode) tail).setPrevious(d);
		
		this.size++;
	}

	//TODO
	@Override
	public boolean insertIndex(int n, int index){
		if(index > this.size) return false;

		DoublyLinkedNode curr = (DoublyLinkedNode) this.getHead();
		
		for(int i = 0; i <= index; i++){
			curr = (DoublyLinkedNode) curr.next();
		}

		DoublyLinkedNode node = new DoublyLinkedNode(n);

		//prev.setNext(node);
		//node.setNext(curr);
		
		node.setNext(curr);
		node.setPrevious((DoublyLinkedNode) ((DoublyLinkedNode) curr).previous());
		
		((DoublyLinkedNode) ((DoublyLinkedNode) curr).previous()).setNext(node);
		((DoublyLinkedNode) curr).setPrevious(node);
		
		this.size++;
		return true;
	}

	//TODO
	@Override
	public boolean remove(int n){
		if(this.isEmpty()) return false;

		DoublyLinkedNode curr = (DoublyLinkedNode) this.getHead();

		while(curr != null && curr.getValue() != n){
			curr = (DoublyLinkedNode) curr.next();
		}

		if(curr == this.getHead()) return false;

		//prev.setNext((DoublyLinkedNode) curr.next());
		((DoublyLinkedNode) ((DoublyLinkedNode) curr).previous()).setNext(curr.next());
		((DoublyLinkedNode) curr.next()).setPrevious(curr.previous());
		
		
		curr = null;
		this.size--;

		return true;
	}

	//TODO
	@Override
	public boolean removeIndex(int index){
		if(this.isEmpty()) return false;

		DoublyLinkedNode curr = (DoublyLinkedNode) this.getHead();

		for(int i = 0; i <= index && curr != null; i++){
			curr = (DoublyLinkedNode) curr.next();
		}

		if(curr == this.getHead()) return false;

		((DoublyLinkedNode) ((DoublyLinkedNode) curr).previous()).setNext(curr.next());
		((DoublyLinkedNode) curr.next()).setPrevious(curr.previous());
		curr = null;
		this.size--;

		return true;
	}


	public void printReverseOrder(){
		DoublyLinkedNode n = (DoublyLinkedNode) this.tail;
		for(int i = this.size(); i > 0; i--){
			n = (DoublyLinkedNode) n.previous();
			System.out.print(n.getValue() + " ");
		}
	}
}
