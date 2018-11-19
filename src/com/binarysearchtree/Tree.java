package com.binarysearchtree;

public class Tree {
	
	private TreeNode root;
	
	public void insert(int value) {
			
		if (root == null) {
			// If root does not exist, create a new root
			root = new TreeNode(value);
		} else {
			// If root exists, insert value into existing root9
			root.insert(value);
		}
		
	}
	
	public void traverseInOrder() {
		if (root != null) {
			root.traverseInOrder();
		}
	}
	
	public TreeNode get(int value) {
		if (root != null) {
			return root.get(value);
		}
		
		return null;
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
	
	public int min() {
		if (root == null) {
			return Integer.MIN_VALUE;
		} else {
			return root.min();
		}
	}
	
	public int max() {
		if (root == null) {
			return Integer.MAX_VALUE;
		} else {
			return root.max();
		}
	}
	
}
