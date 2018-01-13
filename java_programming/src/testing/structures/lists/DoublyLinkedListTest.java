package testing.structures.lists;

import structures.lists.DoublyLinkedList;

public class DoublyLinkedListTest {

	public static void main(String args[]){
		DoublyLinkedList d = new DoublyLinkedList();
		
		for(int i = 0; i < 10; i++){
			d.insert(i + 1);
		}
		
		d.printInOrder();
		System.out.println();
		d.printReverseOrder();
		
		
		System.out.println("\n-- Removing Nodes");
		System.out.println(d.remove(3));
		System.out.println(d.removeIndex(6));
		System.out.println(d.removeIndex(0));
		System.out.println(d.removeIndex(d.size() - 1));
		
		for(int i = 0; i < d.size(); i++){
			System.out.println("- Index, Value: " + i + ", " +  d.getIndex((i)).getValue());
		}
		
		System.out.println("-- Size: " + d.size());
		
		d.printInOrder();
		System.out.println();
		d.printReverseOrder();
	}
	
}
