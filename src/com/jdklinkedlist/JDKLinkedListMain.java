package com.jdklinkedlist;

import java.util.Iterator;
import java.util.LinkedList;

import com.pojo.Employee;

public class JDKLinkedListMain {

	public static void main(String[] args) {
		
		Employee janeJones = new Employee("Jane", "Jones", 123);
		Employee johnDoe = new Employee("John", "Doe", 4567);
		Employee marySmith = new Employee("Mary", "Smith", 22);
		Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
		Employee billEnd = new Employee("Bill", "End", 78);
		
		LinkedList<Employee> list = new LinkedList<>();
		
		// Add to front
		list.addFirst(janeJones);
		list.addFirst(johnDoe);
		list.addFirst(marySmith);
		list.addFirst(mikeWilson);
		printList(list);
		
		// Add to end (add works too)
		list.addLast(billEnd);
		printList(list);
		
		// Remove first (remove first too)
		list.removeFirst();
		printList(list);
		
		// Remove last
		list.removeLast();
		printList(list);
		
	}
	
	static void printList(LinkedList<Employee> list) {
		
		System.out.print("HEAD -> ");
		Iterator<Employee> it = list.iterator();
		while (it.hasNext()) {
			System.out.print(it.next());
			System.out.print(" <=> ");
		}
		System.out.println("null");
		
	}
	
}
