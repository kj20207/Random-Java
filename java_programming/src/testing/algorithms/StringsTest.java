package testing.algorithms;

import testing.Generator;
import algorithms.sorting.InsertionSort;
import algorithms.strings.*;

public class StringsTest {

	public static void main(String args[]){
		
		
		Generator g = Generator.getInstance();
		InsertionSort<Character> algorithm = new InsertionSort<Character>();
		
		String original = g.randomStringAlpha(15);
		
		System.out.println("--- String: " + original);
		System.out.println("- Reversed: " + ReverseString.reverse(original));
		
		String anagram1 = "listen";
		String anagram2 = "silent";
		String anagram3 = "wowowo";
		System.out.println("-- Anagram: " + Anagram.anagram(algorithm, anagram1, anagram2));
		System.out.println("-- Anagram: " + Anagram.anagram(algorithm, anagram2, anagram3));
	}
	
}
