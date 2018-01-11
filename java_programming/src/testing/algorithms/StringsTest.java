package testing.algorithms;

import testing.Generator;
import algorithms.strings.*;

public class StringsTest {

	public static void main(String args[]){
		
		Generator g = Generator.getInstance();
		String original = g.randomStringAlpha(15);
		
		System.out.println("--- String: " + original);
		System.out.println("- Reversed: " + ReverseString.reverse(original));
	}
	
}
