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
	
		mergeSort(intArray, 0, intArray.length);
		
		System.out.print("\n");
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		
	}
	
	/**
	 * 
	 * @param input array to sort
	 * @param start start index
	 * @param end end index (one greater than the last valid index of the input)
	 */
	
	public static void mergeSort(int[] input, int start, int end) {
		
		// A one element array is by definition sorted
		if (end - start <= 1) {
			return;
		}
		
		// Extra elements to into the right array
		int mid = (start + end) / 2;
		
		// Perform mergeSort on the left array
		mergeSort(input, start, mid);
		
		// Perform mergeSort on the right array
		mergeSort(input, mid, end);
		
		// Perform the merge
		merge(input, start, mid, end);
		
	}
	
	public static void merge(int[] input, int start, int mid, int end) {
		
		// [Optimization] If the last element in the left partition is less than or equal to the first element in the right partition, then the array is sorted
		if (input[mid - 1] <= input[mid]) {
			return;
		}
		
		int i = start;
		int j = mid;
		
		// Keeps track of where we are in the temporary array
		int tempIndex = 0;
		
		int[] temp = new int[end - start];
		
		// Loop until i reaches the mid or j reaches the end
		while ((i < mid) && (j < end)) {
			// Place the lesser of the item of the left or right array in the temp array
			// Note the <= operator which maintains the stability of duplicate items
			temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
		}
	
		/*
		 * Copy the remaining items from the left array back into the main array
		 * 1) i: the index of the left array to be copied from
		 * 2) start + tempIndex: the index where the element at i will be copied to
		 * 3) mid - i: The number of elements to copy
		 * 
		 * NOTE: There is no need to copy the elements from the right away because it is already sorted
		 */ 
		System.arraycopy(input, i, input, start + tempIndex, mid - i);
	
		// Copy over the temp array
		System.arraycopy(temp, 0, input, start, tempIndex);
		
	}
	
}
