package algorithms.strings;

import java.util.ArrayList;

/*
 * Source of problem: https://practice.geeksforgeeks.org/problems/sum-of-numbers-or-number/0
 */

public class BigNumber {

	/*
	 * For each test case, if the number of digits in sum (X+Y) 
	 * are equal to the number of digits in X, then print sum, else print X.
	 */
	public static String addLargeInteger(String x, String y){
		String sum = "";

		ArrayList<Integer> sumList = new ArrayList<Integer>();
		int remainder = 0;
		int tmp = 0;

		for(int i = 0; i < Math.max(x.length(), y.length()) + 1; i++){

			if(i >= x.length() && i >= y.length()){
				if(remainder > 0){
					sumList.add(remainder);
				}
				break;
			}
			else{ 
				if(i < x.length() && i >= y.length()){
					tmp = Integer.parseInt("" + x.charAt(i)) + remainder;
					if(tmp > 9){
						tmp = tmp / 10;
						remainder = tmp % 10;
					}
					else{
						remainder = 0;
					}
				}
				else if(i >= x.length() && i < y.length()){
					tmp = Integer.parseInt("" + y.charAt(i)) + remainder;
					if(tmp > 9){
						tmp = tmp / 10;
						remainder = tmp % 10;
					}
					else{
						remainder = 0;
					}
				}
				else{
					tmp = Integer.parseInt("" + x.charAt(i)) + Integer.parseInt("" + y.charAt(i)) + remainder;
					if(tmp > 9){
						tmp = tmp / 10;
						remainder = tmp % 10;
					}
					else{
						remainder = 0;
					}
				}
				//sumList.add(tmp);
			}
		}
		for(int i = 0; i < sumList.size(); i++){
			sum += ("" + sumList.get(sumList.size() - i));
			System.out.println(sumList.get(sumList.size() - i));
		}

		if(x.length() == sum.length()){
			return sum;
		}
		else return x;
	}

}
