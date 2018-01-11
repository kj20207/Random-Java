package algorithms.strings;

public class Palindrome {

	public static boolean palindrome(String s){
		return s.equals(ReverseString.reverse(s));
	}
	
}