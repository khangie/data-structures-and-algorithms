package com.queue;

import java.util.LinkedList;
import java.util.ListIterator;

import com.pojo.Employee;

public class LinkedQueue {

	private LinkedList<Employee> queue;
	
	public LinkedQueue() {
		queue = new LinkedList<Employee>();
	}
	
	public void add(Employee employee) {
		queue.addLast(employee);
	}
	
	public Employee remove() {
		return queue.removeFirst();
	}
	
	public Employee peek() {
		return queue.peekFirst();
	}
	
	public boolean isEmpty() {
		return queue.isEmpty();
	}
	
	public void printQueue() {
		ListIterator<Employee> it = queue.listIterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
}
