package com.doublelinkedlist;

import com.pojo.Employee;

public class EmployeeDoubleLinkedList {

	private EmployeeDoubleNode head;
	private EmployeeDoubleNode tail;
	int size;
	
	/**
	 * Adds a node to the front of the list
	 * 
	 * Implementation
	 * 1) If head == null, then the list is empty
	 *    a) Set tail to new node
	 *    b) Set head to new node
	 *
	 * 2) If head != null
	 * 	  a) Create a new node
     *    b) Set prev of head to the new node
	 *    c) Set next of the new node to head
	 *    d) Set head to the new node
	 * 
	 * @param employee object to be inserted
	 */
	
	public void addToFront(Employee employee) {
		
		System.out.println("addToFront() - " + employee.toString());
		EmployeeDoubleNode node = new EmployeeDoubleNode(employee);
		
		if (head == null) {
			tail = node;
		} else {
			head.setPrev(node);
			node.setNext(head);
		}
		
		head = node;
		
		size++;
		
	}
	
	public void addToEnd(Employee employee) {
		System.out.println("addToEnd() - " + employee.toString());
		EmployeeDoubleNode node = new EmployeeDoubleNode(employee);
		
		if (tail == null) {
			// Empty list
			head = node;
		} else {
			tail.setNext(node);
			node.setPrev(tail);
		}
		
		tail = node;
		
		size++;
	}
	
	/**
	 * Removes a node from the front of the list
	 * 
	 *  1) If head == null, then the list is empty
     *     a) return null;
	 *  
     *  2) If head.getNext() == null, then list only has one node
	 *     a) Set head = null
	 *     a) Set tail = null
	 *  
	 *  3) If head.getNext() != null, then list has more than one node
	 *     a) Create a temporary node from head
	 *     b) Set head to next node
	 *     c) Set prev of head to null
     *     d) Set next of temporary node to null
	 * 
	 * @return node that was removed
	 */
	
	public EmployeeDoubleNode removeFromFront() {

		if (isEmpty()) {
			return null;
		}
		
		EmployeeDoubleNode removedNode = head;
		
		if (head.getNext() == null) {
			// Removing only node
			tail = null;
		} else {
			// More than one node left
			head.getNext().setPrev(null);
		}
		
		head = head.getNext();
		size--;
		removedNode.setNext(null);
		return removedNode;
		
	}
	
	public EmployeeDoubleNode removeFromEnd() {
		
		if (isEmpty()) {
			return null;
		}
		
		EmployeeDoubleNode removedNode = tail;
		
		if (tail.getPrev() == null) {
			// Removing only node
			head = null;
		} else {
			tail.getPrev().setNext(null);
		}
		
		tail = tail.getPrev();
		size--;
		removedNode.setPrev(null);
		return removedNode;
		
	}
		
	public int getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void printList() {
		EmployeeDoubleNode current = head;
		System.out.print("HEAD -> ");
		while (current != null) {
			System.out.print(current);
			System.out.print(" <=> ");
			current = current.getNext();
		}
		System.out.println("null");
	}
	
	public EmployeeDoubleNode getHead() {
		return head;
	}
	public void setHead(EmployeeDoubleNode head) {
		this.head = head;
	}
	public EmployeeDoubleNode getTail() {
		return tail;
	}
	public void setTail(EmployeeDoubleNode tail) {
		this.tail = tail;
	}
	
	
	
}
