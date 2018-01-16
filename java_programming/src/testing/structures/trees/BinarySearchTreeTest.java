package testing.structures.trees;

import structures.trees.BinarySearchTree;

public class BinarySearchTreeTest {

	public static void main(String args[]){
		BinarySearchTree bst = new BinarySearchTree();
		
		bst.insert(5);
		bst.insert(2);
		bst.insert(0);
		bst.insert(1);
		bst.insert(4);
		bst.insert(3);
		bst.insert(8);
		bst.insert(10);
		bst.insert(9);
		bst.insert(6);
		bst.insert(7);
		
		System.out.println("--- Size: " + bst.size());
		bst.traverseInOrder();
		System.out.println();
		bst.traversePreOrder();
		System.out.println();
		bst.traversePostOrder();
		System.out.println();
		
		bst.remove(2);
		//bst.remove(7);
		
		//System.out.println(bst.root().getValue());
		//bst.remove(5);
		
		System.out.println("--- Size: " + bst.size());
		bst.traverseInOrder();
		System.out.println();
		bst.traversePreOrder();
		System.out.println();
		bst.traversePostOrder();
		System.out.println();
	}
	
	
}
