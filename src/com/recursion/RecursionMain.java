package com.recursion;

public class RecursionMain {

	public static void main(String[] args) {
		
		System.out.println(recursiveFactorial(5));
		System.out.println(recursiveSum(5));
		
	}
	
	/**
	 * Calculates the factorial of n
	 * 
	 * Assumptions
	 * - n! = n * (n - 1)!
	 * - 0! = 1
	 * 
	 * @param num
	 * @return
	 */
	
	public static int recursiveFactorial(int num) {
		
		if (num == 0) {
			return 1;
		}
		
		return num * recursiveFactorial(num - 1);
		
	}
	
	/**
	 * Sums the values from 1 to n
	 * @param n
	 * @return
	 */
	
	public static int recursiveSum(int n) {
		
		if (n == 1) {
			return 1;
		}
		
		return n + recursiveSum(n - 1);
		
	}
	
}
