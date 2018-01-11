package algorithms.numbers;

public class Fibonacci {

	public static int fibRecursive(int n){
		if(n == 0) return 0;
		else if(n == 1) return 1;
		else return fibRecursive(n-1) + fibRecursive(n-2);
	}
	
	public static int fibDynamic(int n){
		int fib[] = new int[n+1];
		if(n > 0)
			fib[0] = 0;
		if(n > 1)
			fib[1] = 1;
		
		for(int i = 2; i <= n; i++){
			fib[i] = fib[i-1] + fib[i-2];
		}
		
		return fib[n];
		
	}
	
}
