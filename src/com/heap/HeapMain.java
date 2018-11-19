package com.heap;

public class HeapMain {

	/**
	 * Summary
	 * 1) Complete binary tree
	 *    a) Every level of the tree is full except for the last level
	 *    b) If there is any space at the bottom, it needs to be as far to the left as possible
	 * 2) Max Heap: Every parent is greater or equal to its children
	 * 3) Min Heap: Every parent is less than or equal to its children
	 * 
	 * Binary Heap
	 * 1) Must be a complete tree
	 * 2) Children are added at each level from left to right
	 * 3) Usually implemented as arrays
	 * 4) The maximum or minimum value will always be the root of the tree
	 *    a) This is the advantage of using a heap
	 * 5) Heapify: The process of converting a binary tree into a heap
	 *    a) This often has to be done after insertion or deletion
	 * 6) No required order between siblings
	 * 
	 * Heaps as Arrays
	 * 1) Put the root at array[0]
	 * 2) We then traverse each level from left to right
	 *    a) The left child of the root would to to array[1]
	 *    b) The right child of the root would go to array[2]
	 * 3) For the node at array[i]:
	 *    a) Left Child =  2i + 1
	 *    b) Right Child = 2i + 2
	 *    c) Parent = floor((i - 1) / 2)
	 *    
	 * Insert into Heap
	 * 1) Always add new items to the end of the array
	 * 2) Then we have to fix the heap (heapify)
	 *    a) Compare the new item against its parent
	 *    b) If the item is greater than its parent, we swap it with its parent
	 *    c) We then rinse and repeat
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		
		
	}
	
}
