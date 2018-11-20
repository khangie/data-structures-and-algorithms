package com.binarysearchtree;

public class Tree {
	
	private TreeNode root;
	
	/**
	 * Inserts a value into the binary tree
	 * 
	 * Implementation
	 * 1) If root == null, then create a new root node
	 * 2) If root != null, then recursively insert a new value in the root
	 * 
	 * @param value value to be inserted
	 */
	
	public void insert(int value) {
			
		if (root == null) {
			// If root does not exist, create a new root
			root = new TreeNode(value);
		} else {
			// If root exists, insert value into existing root
			root.insert(value);
		}
		
	}
	
	/**
	 * Traverses the binary tree
	 * 
	 * Implementation
	 * 1) If root != null, then recursively traverse in order
	 */
	
	public void traverseInOrder() {
		if (root != null) {
			root.traverseInOrder();
		}
	}
	
	/**
	 * Retrieves a value from the binary tree
	 * 
	 * Implementation
	 * 1) If root != null, then recursively get the value from the binary tree
	 * 
	 * @param value
	 * @return
	 */
	
	public TreeNode get(int value) {
		if (root != null) {
			return root.get(value);
		}
		
		return null;
	}
	
	/**
	 * Retrieves the min value from the binary tree
	 * 
	 * Implementation
	 * 1) If root == null, then return the smallest int value
	 * 2) If root != null, then recursively find the min value
	 * 
	 * @return
	 */
	
	public int min() {
		if (root == null) {
			return Integer.MIN_VALUE;
		} else {
			return root.min();
		}
	}
	
	/**
	 * Retrieves the max value from the binary tree
	 * 
	 * Implementation
	 * 1) If root == null, then return the largest int value
	 * 2) If root != null, then recursively find the max value
	 * 
	 * @return
	 */
	
	public int max() {
		if (root == null) {
			return Integer.MAX_VALUE;
		} else {
			return root.max();
		}
	}
	
	public void delete(int value) {
		root = delete(root, value);
	}
	
	private TreeNode delete(TreeNode subtreeRoot, int value) {
		
		if (subtreeRoot == null) {
			return null;
		}
		
		if (value == subtreeRoot.getData()) {
			// Assumption: node to delete has 0 or 1 children
			if (subtreeRoot.getLeftChild() == null) {
				// If leftChild does not exist, replace the deleted node with the rightChild which could also be null
				return subtreeRoot.getRightChild();
			} else if (subtreeRoot.getRightChild() == null) {
				// If rightChild does not exist, replace the deleted node with the leftChild which could also be null
				return subtreeRoot.getLeftChild();
			}			
		} else if (value < subtreeRoot.getData()) {
			// Replace the left child with the result of the delete
			subtreeRoot.setLeftChild(delete(subtreeRoot.getLeftChild(), value));
		} else {
			// Replace the left child with the result of the delete
			subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(), value));
		} 
		
		// This is not the node we want to delete so return the same node
		return subtreeRoot;
		
	}
	
}
