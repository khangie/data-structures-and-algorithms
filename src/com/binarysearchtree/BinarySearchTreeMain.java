package com.binarysearchtree;

public class BinarySearchTreeMain {

	/**
	 * Summary (general tree)
	 * 	1) Hierarchical data structure
	 *  2) Ideal when things can contain other things or descend from other things
	 *  3) Each node can only have one parent
	 *  4) A tree can only have one root node
	 *  5) A leaf node has no children
	 *  6) A singleton tree has only one node which is the root node
	 *  7) A subtree is a node and all of its descendants
	 *  8) An edge links nodes on the outside of a tree or subtree
	 *  9) A path is sequence of nodes required to go from one node to another
	 *  10) Cannot have a cyclic path
	 *  11) A root path is a path going from a node to the root
	 *  12) The depth of a node is the number of edges to the root
	 *  13) The height of a node is the max number of edges to the farthest leaf
	 *  14) The height of the root is the height of the tree
	 *  15) A level of a tree contains all of the nodes at the same depth
	 *  16) A node is an ancestor of another node if it is in the node's path
	 *  
	 *  Summary (binary search tree)
	 *  1) Every node has 0, 1, or 2 children
	 *  2) Children are referred to as left child and right child
	 *  3) In practice, we use binary search trees 
	 *  4) A binary search tree is complete if:
	 *     a) Every level except the last level has two children
	 *     b) On the last level, all nodes are as left as possible
	 *     
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
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		
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
