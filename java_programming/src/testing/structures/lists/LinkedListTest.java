package testing.structures.lists;

import structures.lists.LinkedList;

public class LinkedListTest {

	public static void main(String args[]){
		LinkedList n = new LinkedList();
		
		System.out.println("--- LinkedList Testing");
		for(int i = 0; i < 10; i++){
			System.out.println("- Inserting: " + (i+1));
			n.insert(i+1);
		}
		
		System.out.println("-- Size: " + n.size());
		
		for(int i = 0; i < n.size(); i++){
			System.out.println("- Index, Value: " + i + ", " +  n.getIndex((i)).getValue());
		}
		
		System.out.println("-- Removing Nodes");
		System.out.println(n.remove(3));
		System.out.println(n.removeIndex(6));
		System.out.println(n.removeIndex(0));
		System.out.println(n.removeIndex(n.size() - 1));
		
		for(int i = 0; i < n.size(); i++){
			System.out.println("- Index, Value: " + i + ", " +  n.getIndex((i)).getValue());
		}
		
		System.out.println("-- Size: " + n.size());
		
		n.printInOrder();
		
	}
	
	
}
