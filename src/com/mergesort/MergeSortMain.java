package com.mergesort;

/**
 * Summary
 * 1) Divide and conquer algorithm
 * 2) Recursive algorithm
 * 3) Two phases: Splitting and Merging
 * 4) Splitting phase leads to faster sort during merging phase
 * 5) Splitting is logical.  We don't create new arrays.
 * 6) Not in-place
 * 7) Stable algorithm
 * 
 * Time Complexity
 * - O(nlogn) since we are repeatedly dividing the array in half during the spltting phase
 * 
 * Space Complexity
 * - O(n) since we need to copy the items to a temp array
 * 
 * Splitting Phase
 * 1) Start with an unsorted array
 * 2) Divide the arrays into two arrays, which are unsorted
 *    a) The first array is the left array
 *    b) The second array is the right array
 * 3) Split the left and right arrays into two arrays each
 * 4) Keep splitting until all the arrays have only one element each
 *    a) These arrays are sorted
 * 
 * Merging Phase
 * 1) Merge every left/right pair of sibling arrays into a sorted array
 * 2) After the first merge, we'll have a bunch of 2-element sorted arrays
 * 3) Then merge those sorted arrays (left/right siblings) to end up with a bunch of 4-element sorted arrays
 * 4) Repeat until you have a single sorted array
 * 5) Not in-place.  Uses temporary arrays.
 * 
 * Merging Process
 * 1) Merge the sibling left and right arrays
 * 2) Create a temporary array large enough to hold all the elements in the arrays we are merging
 * 3) Set i to the first index of the left array
 * 4) Set j to the first index of the right array
 * 5) Compare left[i] to right[j]
 * 6) If left is smaller, copy it to the temp array and increment i by 1
 * 7) If right is smaller, copy it to the temp array and increment j by 1
 * 8) Repeat this process until all elements in the two arrays have been processed
 * 9) At this point, the temporary array contains the merged values in sorted order
 * 10) Copy the temporary array back to the original input array at the correct positions
 * 11) If the left array is at positions x to y, and the right array is at positions y + 1 to z, then the result will be sorted
 */

public class MergeSortMain {
	
	public static void main(String[] args) {

		int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
	
		mergeSort(intArray, new int[intArray.length], 0, intArray.length -1);
		
		System.out.print("\n");
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		
	}
		
	/**
	 * Performs a merge sort on an array 
	 * 
	 * @param array array to be sorted
	 * @param temp temp array used for merging
	 * @param leftStart beginning index to be sorted
	 * @param rightEnd end index to be sorted
	 */
	
	public static void mergeSort(int[] array, int[] temp, int leftStart, int rightEnd) {

		// If there is one or fewer elements left in the array, then it is sorted
		if (leftStart >= rightEnd) {
			return;
		}
		
		int mid = (leftStart + rightEnd) / 2;
		
		// Sort the left side
		mergeSort(array, temp, leftStart, mid);
		
		// Sort the right side
		mergeSort(array, temp, mid + 1, rightEnd);
		
		// Merge the left and right side together
		mergeHalves(array, temp, leftStart, rightEnd);
		
	}
	
	/**
	 * Merges two halves of an array together
	 * 
	 * @param array array to be sorted
	 * @param temp temp array used for merging
	 * @param leftStart beginning index to be sorted
	 * @param rightEnd end index to be sorted
	 */
	
	public static void mergeHalves(int[] array, int[] temp, int leftStart, int rightEnd) {
		
		// Define the index at the end of the left array
		int leftEnd = (leftStart + rightEnd) / 2;
		
		// Define the index at the start of the right array
		int rightStart = leftEnd + 1;
		
		// Define the size of the temp array
		int size = rightEnd - leftStart + 1;
		
		// Define the initial index for the left array
		int leftIndex = leftStart;
		
		// Define the initial index for the right array
		int rightIndex = rightStart;
		
		// Define the initial index for the temp array
		int tempIndex = leftStart;
		
		// Loop until either the leftIndex or rightIndex reaches the end
		while ((leftIndex <= leftEnd) && (rightIndex <= rightEnd)) {
			
			// Copy the lowest value element into the temp array
			if (array[leftIndex] <= array[rightIndex]) {
				temp[tempIndex] = array[leftIndex];
				leftIndex++;
			} else {
				temp[tempIndex] = array[rightIndex];
				rightIndex++;
			}
		
			tempIndex++;
			
		}
		
		/*
		 * NOTE:
		 * 1) When either leftIndex or rightIndex reaches the end, the remaining elements are in sorted order
		 * 2) Only one of the following two functions will actually execute
		 */
		
		// Copy the remaining elements from the left side into the temp array
		System.arraycopy(array, leftIndex, temp, tempIndex, leftEnd - leftIndex + 1);
		
		// Copy the remaining elements from the right side into the temp array
		System.arraycopy(array, rightIndex, temp, tempIndex, rightEnd - rightIndex + 1);	
		
		
		
		// Copy the temp array back into the main array
		System.arraycopy(temp, leftStart, array, leftStart, size);
		
	}
	
}
