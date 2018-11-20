package com.binarysearchtree;

public class TreeNode {

	private int data;
	private TreeNode leftChild;
	private TreeNode rightChild;
	
	public TreeNode(int data) {
		this.data = data;
	}
	
	/**
	 * Inserts a value in the binary tree
	 * 
	 * Implementation
	 * 1) If value == data, then duplicate data so do nothing
	 * 2) If value < data, then insert into the left side of the tree
	 *    a) If leftChild == null, then create a new leftChild node
	 *    a) If leftChild != null, then recursively insert into left child
	 * 3) If value => data, then insert into the right side of the tree
	 *    a) If rightChild == null, then create a new rightChild node
	 *    a) If rightChild != null, then recursively insert into right child
	 * 
	 * @param value value to be inserted
	 */
	
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
	
	/**
	 * Retrieves a node from the binary tree
	 * 
	 * Implementation
	 * 1) If value == data, then return the node
	 * 2) If value < data, then get the node from the left side of the tree
	 *    a) If leftChild != null, then call the get function recursively on the left child
	 * 3) If value >= data, then get the node from the right side of the tree
	 *    a) If rightChild != null, then call the get function recursively on the right child
	 * 4) If data is not found, return null
	 * 
	 * @param value
	 * @return
	 */
	
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
	
	/**
	 * Traverses the tree in order (left->parent->right)
	 * 
	 * Implementation
	 * 1) If leftChild != null, then recursively traverse the left child
	 * 2) Print the data for the parent (this node)
	 * 3) If rightChild != null, then recursively traverse the right child
	 * 
	 */
	
	public void traverseInOrder() {
		
		if (leftChild != null) {
			leftChild.traverseInOrder();
		}
 
		System.out.print(data + ", ");
		
		if (rightChild != null) {
			rightChild.traverseInOrder();
		}
		
	}
	
	/**
	 * Returns the min value in the tree
	 * 
	 * Implementation
	 * 1) If left child == null, return data for the parent (this node)
	 * 2) If left child != null, then recursively call the min function on the left child
	 * 
	 * @return
	 */
	
	public int min() {
		if (leftChild == null) {
			// If leftChild does not exist, then this node contains the min
			return data;
		} else {
			return leftChild.min();
		}
	}
	
	/**
	 * Returns the max value in the tree
	 * 
	 * Implementation
	 * 1) If right child == null, return data for the parent (this node)
	 * 2) If right child != null, then recursively call the nax function on the right child
	 * 
	 * @return
	 */
	
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
