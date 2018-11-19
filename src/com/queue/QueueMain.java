package com.queue;

import com.pojo.Employee;

public class QueueMain {

	/**
	 *  Summary
	 *  1) FIFO - first in, first out
	 *  2) add (enqueue) - add an item to end of the queue
	 *  3) remove (dequeue) - remove item at the front of the queue
	 *  4) peek - get item at the front of the queue but don't remove it
	 *  
	 *  Time Complexity
	 *  1) O(1) - add, remove, and peek
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
			
		Employee janeJones = new Employee("Jane", "Jones", 123);
		Employee johnDoe = new Employee("John", "Doe", 4567);
		Employee marySmith = new Employee("Mary", "Smith", 22);
		Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
		Employee billEnd = new Employee("Bill", "End", 78);
	
		LinkedQueue queue = new LinkedQueue();
		queue.add(janeJones);
		queue.add(johnDoe);
		queue.add(marySmith);
		queue.add(mikeWilson);
		queue.add(billEnd);
		queue.printQueue();
		
		System.out.print("\n");
		
		queue.remove();
		queue.remove();
		queue.printQueue();
		
		System.out.print("\n");
		
		System.out.println("Peek - " + queue.peek());
		queue.printQueue();
	
	}
	
}
