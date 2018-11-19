package com.singlelinkedlist;

import com.pojo.Employee;

public class EmployeeSingleLinkedList {

	private EmployeeSingleNode head;
	private int size;
	
	/**
	 *  Inserts a new node to front of the list
	 *  
	 *  Implementation
	 *  1) Create a new node
	 *  2) Assign the "next" field to the current node pointed to by "head"
	 *  3) Assign the "head" pointer to the new node
	 * 
	 * @param employee object to be inserted
	 */
	
	public void addToFront(Employee employee) {
		System.out.println("addToFront() - " + employee.toString());
		EmployeeSingleNode node = new EmployeeSingleNode(employee);
		node.setNext(head);
		head = node;
		size++;
	}
	
	/**
	 * Deletes a node from the front of the list
	 * 
	 * Implementation
	 * 1) Assign the node pointed to by "head" to a temporary variable called "removedNode"
	 * 2) Assign the "head" pointer to the next node
	 * 3) Set the next pointer of the removed node to null
	 * 4) return "removedNode"
	 * 
	 * @return node that was removed
	 */
	
	public EmployeeSingleNode removeFromFront() {

		if (isEmpty()) {
			return null;
		}
		
		EmployeeSingleNode removedNode = head;
		head = head.getNext();
		size--;
		removedNode.setNext(null);
		
		return removedNode;
	}
	
	public int getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void printList() {
		EmployeeSingleNode current = head;
		System.out.print("HEAD -> ");
		while (current != null) {
			System.out.print(current);
			System.out.print(" -> ");
			current = current.getNext();
		}
		System.out.println("null");
	}	
}
