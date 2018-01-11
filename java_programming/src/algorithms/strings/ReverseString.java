package algorithms.strings;

public class ReverseString {

	public String reverse(String s){
		if(s == null) return null;
		else if(s.length() < 2) return s;
		else return s.charAt(s.length() - 1) + reverse(s.substring(0, s.length() - 2));
	}
}
