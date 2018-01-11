package algorithms.strings;

import algorithms.sorting.Sort;

public class Anagram {

	public static boolean anagram(Sort<Character> algorithm, String s1, String s2){
		
		if(s1.length() != s2.length())
			return false;
		Character one[] = new Character[s1.length()];
		Character two[] = new Character[s2.length()];
		
		for(int i = 0; i < s1.length(); i++){
			one[i] = s1.charAt(i);
			two[i] = s2.charAt(i);
		}
		
		one = algorithm.sortAscendingRange(one);
		two = algorithm.sortAscendingRange(two);
		
		for(int i = 0; i < s1.length(); i++){
			if(one[i].compareTo(two[i]) != 0){
				return false;
			}
		}
		return true;
	}
	
}
