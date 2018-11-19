package com.recursion;

public class RecursionMain {

	public static void main(String[] args) {
		
		System.out.println(recursiveFactorial(5));
		
	}
	
	// n! = n * (n - 1)!
	public static int recursiveFactorial(int num) {
		
		if (num == 0) {
			return 1;
		}
		
		return num * recursiveFactorial(num - 1);
		
	}
	
}
