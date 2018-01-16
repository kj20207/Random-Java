package testing.structures.stacks;

import structures.stacks.Stack;

public class StackTest {

	public static void main(String args[]){
		
		Stack s = new Stack();
		
		for(int i = 0; i < 5; i++){
			s.push(i+1);
			System.out.print(s.peek() + " ");
		}
		
		System.out.println();
		
		for(int i = s.size(); i > 0; i--){
			System.out.print(s.pop().getValue() + " ");
		}
	}
	
	
}
