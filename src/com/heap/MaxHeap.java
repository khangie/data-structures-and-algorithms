package com.heap;

public class MaxHeap {

	private int[] heap;
	private int size;
	
	public MaxHeap(int capacity) {
		heap = new int[capacity];
	}
	
	public void insert(int value) {
		
		if (isFull()) {
			throw new IndexOutOfBoundsException("Heap is full");
		}
		
		heap[size] = value;

		// Move the element to its correct position in the heap
		fixHeapAbove(size);
		
		size++;
		
	}
	
	private void fixHeapAbove(int index) {
		
		// This is the value that was just inserted
		int newValue = heap[index];
		
		// Move the element to its correct position in the heap by bubbling the element up and shifting parents down
		while ((index > 0) && (newValue > heap[getParent(index)])) {
			
			// Assign the parent to where the new value current lives
			heap[index] = heap[getParent(index)];
			
			// Set the index of the element to the index of the parent
			index = getParent(index);
			
		}
		
		// Assign the final location of the element
		heap[index] = newValue;
	}
	
	/**
	 * @return whether or not the heap is full
	 */
	
	public boolean isFull() {
		return size == heap.length;
	}
	
	/**
	 * @param index of the heap element
	 * @return index of the parent
	 */
	
	public int getParent(int index) {
		return (index - 1) / 2;
	}
	
}
