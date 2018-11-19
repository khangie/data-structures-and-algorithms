package com.search;

public class LinearSearchMain {
	
	public static void main(String[] args) {

		/*
		 *  Time complexity O(n)
		 */
		
		int[] intArray = { 20, 35, -15, 7, 55, 1, -22};
		
		System.out.println("linearSearch(-15) = " + linearSearch(intArray, -15));
		System.out.println("linearSearch(80) = " + linearSearch(intArray, 80));
		
	}

	public static int linearSearch(int[] input, int value) {
		for (int i = 0; i < input.length; i++) {
			if (input[i] == value) {
				return i;
			}
		}
		
		return -1;
	}
	
}
