package com.recursion;

public class RecursionMain {

	public static void main(String[] args) {
		
		System.out.println(recursiveFactorial(5));
		System.out.println(recursiveSum(5));
		
		System.out.print("\n");
		
		buildLayerHead(4);
		
		System.out.print("\n");
		
		buildLayerTail(4);
		
		System.out.print("\n");
		System.out.println(gcdIterative(2, 6));
		
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
	
	/**
	 * Example of head recursion
	 * @param height
	 */
	
	public static void buildLayerHead(int height) {
		
		if (height == 0) {
			return;
		}
		
		buildLayerHead(height - 1);
		
		System.out.println(height);
		
	}
	
	/**
	 * Example of tail recursion
	 * @param height
	 */
	
	public static void buildLayerTail(int height) {
		
		if (height == 0) {
			return;
		}
		
		System.out.println(height);
		
		buildLayerHead(height - 1);
		
	}

	
	public static int gcdIterative(int num1, int num2) {
		
		while (num2 != 0) {
			
			int temp = num2;
			num2 = num1 % num2;
			num1 = temp;
			
		}
		
		return num1;
		
	}
	
}
