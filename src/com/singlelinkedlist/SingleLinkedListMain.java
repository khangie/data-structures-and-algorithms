package com.singlelinkedlist;

import com.pojo.Employee;

public class SingleLinkedListMain {

	/**
	 * Summary
	 * 1) Each item in the list is called a node
	 * 2) The first item in the list is the head of the list
	 * 3) A pointer called "head" points to the first item
	 * 4) Can grow without having to be resized
	 * 5) Requires more memory than an array to provision the nodes
	 *
	 * Time Complexity
     * 1) O(1) - Insert/delete at the front of the list
     * 2) O(n) - Insert/delete after the front of the list
	 */
	
	public static void main(String[] args) {
		
		Employee janeJones = new Employee("Jane", "Jones", 123);
		Employee johnDoe = new Employee("John", "Doe", 4567);
		Employee marySmith = new Employee("Mary", "Smith", 22);
		Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
		
		EmployeeSingleLinkedList employeeLinkedList = new EmployeeSingleLinkedList();
		
		System.out.println("getSize() - " + employeeLinkedList.getSize());
		System.out.println("isEmpty() - " + employeeLinkedList.isEmpty());
		
		employeeLinkedList.addToFront(janeJones);
		employeeLinkedList.addToFront(johnDoe);
		employeeLinkedList.addToFront(marySmith);
		employeeLinkedList.addToFront(mikeWilson);

		System.out.println("getSize() - " + employeeLinkedList.getSize());
		System.out.println("isEmpty() - " + employeeLinkedList.isEmpty());
		employeeLinkedList.printList();
		
		employeeLinkedList.removeFromFront();
		
		System.out.println("getSize() - " + employeeLinkedList.getSize());
		System.out.println("isEmpty() - " + employeeLinkedList.isEmpty());
		employeeLinkedList.printList();
		
	}
	
}
