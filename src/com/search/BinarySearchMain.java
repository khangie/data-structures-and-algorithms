package com.search;

public class BinarySearchMain {
	
	/**
	 *  Summary
	 *  1) Data must be sorted
	 *  2) Chooses the element in the middle of the array and compares it against the search value
	 *  3) If element is equal to value, we're done
	 *  4) If element is greater than value, search the left half of the array
	 *  5) If element is less than the value, search the right half of the array
	 * 
	 *  Time Complexity
	 *  1) O(LogN)
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		int[] intArray = { -22, -15, 1, 7, 20, 35, 55 };

		System.out.println("iterativeBinarySearch(-15) = " + iterativeBinarySearch(intArray, -15));
		System.out.println("iterativeBinarySearch(80) = " + iterativeBinarySearch(intArray, 80));
		
		
		System.out.println("recursiveBinarySearch(-15) = " + recursiveBinarySearch(intArray, -15));
		System.out.println("recursiveBinarySearch(80) = " + recursiveBinarySearch(intArray, 80));
		
		
	}

	public static int iterativeBinarySearch(int[] input, int value) {

		int start = 0;
		int end = input.length - 1;
		
		while (start <= end) {
			int midPoint = (start + end) / 2;
			System.out.println("start=" + start + " midPoint=" + midPoint + " end=" + end);
			if (value == input[midPoint]) {
				return midPoint;
			} else if (value > input[midPoint]) {
				start = midPoint + 1;
			} else {
				end = midPoint;
			}
		}
		
		// If loop exits without a return, then value not found
		System.out.println("start=" + start + " end=" + end);
		return -1;
		
	}
	
	public static int recursiveBinarySearch(int[] input, int value) {
		
		return recursiveBinarySearch(input, 0, input.length - 1, value);
		
	}
	
	public static int recursiveBinarySearch(int[] input, int start, int end, int value) {
		
		// Value not found
		if (start > end) {
			System.out.println("start=" + start + " end=" + end);
			return -1;
		}
		
		int midPoint = (start + end) / 2;
		System.out.println("start=" + start + " midPoint=" + midPoint + " input[midPoint]=" + input[midPoint] + " end=" + end);
		
		if (value == input[midPoint]) {
			return midPoint;
		} else if (value > input[midPoint]) {
			return recursiveBinarySearch(input, midPoint + 1, end, value);
		} else {
			return recursiveBinarySearch(input, start, midPoint, value);
		}
	}
	
}
