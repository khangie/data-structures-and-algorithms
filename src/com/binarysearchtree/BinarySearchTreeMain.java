package com.binarysearchtree;

public class BinarySearchTreeMain {

	public static void main(String[] args) {
		
		/*
		 *  Traversal
		 *  1) Level - visit nodes on each level (not used often)
		 *     a) Order: 25, 20, 27, 15, 22, 26, 30, 29, 32
		 *  2) Pre-order - visit the root of every subtree first
		 *     a) Order: 25, 20, 15, 22, 27, 26, 30, 29, 32
		 *  3) Post-order - visit the root of every subtree last
		 *     a) Order: 15, 22, 20, 16, 29, 32, 30, 27, 25
		 *  4) In-order - visit left child, then root, then right child like a triangle (data ends up sorted)
		 *     a) Order: 15, 20, 22, 25, 26, 27, 29, 30, 32
		 *     
		 *  Cases for delete
		 *  1) Node is a leaf
		 *     a) Remove the reference to the child
		 *  2) Node has one child
		 *     b) Replace the child with the sub-child
		 *  3) Node has two children
		 */
		
		Tree intTree = new Tree();
		intTree.insert(25);
		intTree.insert(20);
		intTree.insert(15);
		intTree.insert(27);
		intTree.insert(30);
		intTree.insert(29);
		intTree.insert(26);
		intTree.insert(22);
		intTree.insert(32);
		intTree.insert(17);
		
		intTree.traverseInOrder();
		
		System.out.println("\n");
		System.out.println(intTree.get(27));
		System.out.println(intTree.get(17));
		System.out.println(intTree.get(8888));
		
		System.out.println("\n");
		System.out.println("min() = " + intTree.min());
		System.out.println("max() = " + intTree.max());
		
	}
	
}
