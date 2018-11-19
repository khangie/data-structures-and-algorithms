package com.stack;

import com.pojo.Employee;

public class StackMain {

	/**
	 *  Summary
	 *  1) LIFO (last in, first out)
	 *  2) Push - adds item to top of stack (addToFront)
	 *  3) Pop - removes the top item on the stack (removeFromFront)
	 *  4) Peek - gets the top item without popping it (retrieve head)
	 *  5) Backing data structure is linked list
	 *  6) Should use the Deque interface rather than the built-in stack type, for example LinkedList
	 *  
	 *  Time Complexity
	 *  1) O(1) - push, pop, and peek
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
			
		Employee janeJones = new Employee("Jane", "Jones", 123);
		Employee johnDoe = new Employee("John", "Doe", 4567);
		Employee marySmith = new Employee("Mary", "Smith", 22);
		Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
		Employee billEnd = new Employee("Bill", "End", 78);
		
		LinkedStack stack = new LinkedStack();
		stack.push(janeJones);
		stack.push(johnDoe);
		stack.push(marySmith);
		stack.push(mikeWilson);
		stack.push(billEnd);
		
		stack.printStack();
		
		System.out.println("Peek - " + stack.peek());
		System.out.println("Pop - " + stack.pop());
		
		stack.printStack();
		
	}
	
}
