package com.quicksort;

public class QuickSortMain {

	/**
	 * Summary
	 * 1) Divide and conquer algorithm
	 * 2) Recursive algorithm
	 * 3) Uses a pivot element to partition the array into two parts
	 * 4) Elements < pivot to its left
	 * 5) Elements > pivot to its right
	 * 6) Pivot will then be in its correct sorted position
	 * 7) Process is not repeated for the left and right array
	 * 8) Eventually, every element has ben the pivot, so every element will be in its correct sorted position
	 * 9) As with merge sort, we'll end up partitioning the array into a series of 1-element arrays
	 * 10) In-place algorithm (unlike merge sort)
	 * 11) Unstable algorithm
	 * 
	 * Time Complexity
	 * 1) O(nlogn)
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		
		quickSort(intArray, 0, intArray.length - 1);
		
		System.out.print("\n");
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		
	}

	public static void quickSort(int[] array, int left, int right) {
		
		if (left >= right) {
			return;
		}
		
		// Choose the pivot at the center of the array
		int pivot = array[(left + right) / 2];
		
		// Partition the array into two sides
		int index = partition(array, left, right, pivot);
		
		// Perform quickSort on the left side
		quickSort(array, left, index - 1);
		
		// Perform quickSort on the right side
		quickSort(array, index, right);
		
	}
	
	public static int partition(int[] array, int left, int right, int pivot) {
		
		while (left <= right) {
			
			// Move left until you find an element that is out of order
			while (array[left] < pivot) {
				left++;
			}
			
			// Move right until you find an element that is out of order
			while (array[right] > pivot) {
				right--;
			}
			
			// Swap the elements if left <= right
			if (left <= right) {
				swap(array, left, right);
				left++;
				right--;
			}
 			
		}
		
		// Left is the partition point
		return left;
		
	}
	
	public static void swap(int[] array, int left, int right) {
		int tempValue = array[left];
		array[left] = array[right];
		array[right] = tempValue;
	}
	
}
