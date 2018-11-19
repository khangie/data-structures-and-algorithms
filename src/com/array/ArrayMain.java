package com.array;

public class ArrayMain {

	/**
	 * Summary
	 * 1) Stored in a contiguous block in memory
	 * 2) Every element occupies the same amount of space in memory
	 * 3) In an array of objects, a reference to the object is stored in the array element
	 * 4) If an array starts a memory address x, and the size of each element is y, then the memory address of the ith element is x + i * y
	 * 5) If we know the index of an element, the time to retrieve the element is always the same
	 * 
	 * Time Complexity
	 * 	1) O(1) - Retrieve with index
	 * 	4) O(1) - Add/delete element at the end of array
	 *  2) O(n) - Retrieve without index
	 *  3) O(n) - Add/delete element to the front or middle of the array
	 */
	
	public static void main(String[] args) {


		
		int[] intArray = new int[7];
	
		intArray[0] = 20;
		intArray[1] = 35;
		intArray[2] = -15;
		intArray[3] = 7;
		intArray[4] = 55;
		intArray[5] = 1;
		intArray[6] = -22;
		
		// Search for the number 7
		int index = -1;
		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] == 7) {
				index = i;
				break;
			}
		}
		System.out.println("index = " + index);
		
	}

}
