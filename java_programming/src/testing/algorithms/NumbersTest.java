package testing.algorithms;

import algorithms.numbers.*;

public class NumbersTest {

	public static void main(String args[]){
		FibonacciTest(10);
	}

	public static void FibonacciTest(int inst){
		System.out.println("--- Fibonacci Recursive Test ---");
		for(int i = 0; i < inst; i++){
			System.out.println("Fib Num " + i + ": " + Fibonacci.fibRecursive(i));
		}
		System.out.println("--- Fibonacci Dynamic Programming Test ---");
		for(int i = 0; i < inst; i++){
			System.out.println("Fib Num " + i + ": " + Fibonacci.fibDynamic(i));
		}
		
		System.out.println("--- Special Series Sum ---");
		System.out.println(SpecialSeriesSum.specialSeries(5));
		System.out.println(SpecialSeriesSum.specialSeries(10));
	
		
		System.out.println("--- Sum Terms Nth Row ---");
		System.out.println(SumTermsNthRow.nthRow(2));
		System.out.println(SumTermsNthRow.nthRow(4));
	}

}
