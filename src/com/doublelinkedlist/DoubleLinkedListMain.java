package com.doublelinkedlist;

import com.pojo.Employee;

public class DoubleLinkedListMain {

	/**
	 * Summary
	 * 1) Each item has next and previous fields
	 * 2) The list has a head and a tail
     * 3) With a circular linked list, tail points to a node and you can traverse starting at any node
	 *  
	 * Time Complexity
	 * 1) O(1) - insert/delete a node at the beginning or end of list
	 * 2) O(n) - insert/delete node in the middle of a list 
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		EmployeeDoubleLinkedList employeeLinkedList = new EmployeeDoubleLinkedList();

		System.out.println("getSize() - " + employeeLinkedList.getSize());
		System.out.println("isEmpty() - " + employeeLinkedList.isEmpty());
		
		Employee janeJones = new Employee("Jane", "Jones", 123);
		Employee johnDoe = new Employee("John", "Doe", 4567);
		Employee marySmith = new Employee("Mary", "Smith", 22);
		Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
		Employee billEnd = new Employee("Bill", "End", 78);
		
		employeeLinkedList.addToFront(janeJones);
		employeeLinkedList.addToFront(johnDoe);
		employeeLinkedList.addToFront(marySmith);
		employeeLinkedList.addToFront(mikeWilson);
		
		System.out.println("getSize() - " + employeeLinkedList.getSize());
		System.out.println("isEmpty() - " + employeeLinkedList.isEmpty());
		employeeLinkedList.printList();
		

		employeeLinkedList.addToEnd(billEnd);
		
		System.out.println("getSize() - " + employeeLinkedList.getSize());
		System.out.println("isEmpty() - " + employeeLinkedList.isEmpty());
		employeeLinkedList.printList();
		
		employeeLinkedList.removeFromFront();
		
		System.out.println("getSize() - " + employeeLinkedList.getSize());
		System.out.println("isEmpty() - " + employeeLinkedList.isEmpty());
		employeeLinkedList.printList();
		
		employeeLinkedList.removeFromEnd();
		
		System.out.println("getSize() - " + employeeLinkedList.getSize());
		System.out.println("isEmpty() - " + employeeLinkedList.isEmpty());
		employeeLinkedList.printList();
		
	}
	
}
