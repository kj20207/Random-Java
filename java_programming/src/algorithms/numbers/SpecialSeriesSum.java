package algorithms.numbers;

//https://practice.geeksforgeeks.org/problems/special-series-sum/0
public class SpecialSeriesSum {


	public static int specialSeries(int n){
		int sums[] = new int[n+1];
		sums[0] = 1;
		
		for(int i = 2; i <= n; i++){
			sums[i-1] = sums[i-2] + i;
		}
		
		int specialSum = 0;
		for(int i = 0; i < n; i++){
			specialSum += sums[i];
		}
		
		return specialSum;
	}

}
