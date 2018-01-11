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
	}

}
