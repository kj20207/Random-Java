package algorithms.numbers;

public class SumTermsNthRow {

	public static int nthRow(int n){
		
		int left = 1;
		int right = 2;
		
		for(int i = 1; i < n; i++){
			left += 2 * i;
			right += 2 * (i+1);
		}
		
		int sum = 0;
		for(int i = left; i <= right; i++){
			sum += i;
		}
		
		return sum;
		
		
	}
	
}
