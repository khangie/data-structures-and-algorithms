package com.binarysearchtree;

public class TreeNode {

	private int data;
	private TreeNode leftChild;
	private TreeNode rightChild;
	
	public TreeNode(int data) {
		this.data = data;
	}
	
	public void insert(int value) {
		
		// Don't insert duplicate values
		if (value == data) {
			return;
		}
		
		if (value < data) {
			if (leftChild == null) {
				// If leftChild does not exist, create leftChild and insert value
				leftChild = new TreeNode(value);
			} else {
				// If leftChild exists, insert value in leftChild
				leftChild.insert(value);
			}
		} else {
			if (rightChild == null) {
				// If rightChild does not exist, create leftChild and insert value
				rightChild = new TreeNode(value);
			} else {
				// If rightChild does not exist, create leftChild and insert value
				rightChild.insert(value);
			}
		}
		
	}
	
	public TreeNode get(int value) {
		
		// Value found in current node
		if (value == data) {
			return this;
		}
		
		if (value < data) {
			if (leftChild != null) {
				return leftChild.get(value);
			}
		} else {
			if (rightChild != null) {
				return rightChild.get(value);
			}
		}
		
		// No value found
		return null;
		
	}
	
	public void traverseInOrder() {
		
		if (leftChild != null) {
			leftChild.traverseInOrder();
		}
 
		System.out.print(data + ", ");
		
		if (rightChild != null) {
			rightChild.traverseInOrder();
		}
		
	}
	
	public int min() {
		if (leftChild == null) {
			// If leftChild does not exist, then this node contains the min
			return data;
		} else {
			return leftChild.min();
		}
	}
	
	public int max() {
		if (rightChild == null) {
			// If rightChild does not exist, then this node contains the max
			return data;
		} else {
			return rightChild.max();
		}
	}
	
	@Override
	public String toString() {
		return "TreeNode [data=" + data + "]";
	}

	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public TreeNode getLeftChild() {
		return leftChild;
	}
	public void setLeftChild(TreeNode leftChild) {
		this.leftChild = leftChild;
	}
	public TreeNode getRightChild() {
		return rightChild;
	}
	public void setRightChild(TreeNode rightChild) {
		this.rightChild = rightChild;
	}
	
}
