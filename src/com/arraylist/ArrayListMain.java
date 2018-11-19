package com.arraylist;

import java.util.ArrayList;
import java.util.List;

import com.pojo.Employee;

public class ArrayListMain {

	/**
	 * 	Summary
	 *  1) Implements the List interface
	 *  2) Is a re-sizable implementation of the List interface
	 *  3) A backing array is used and is resized if necessary
	 *  4) Can be instantiated with a specified capacity for the backing array (10 default)
	 *  5) Vector is similar to ArrayList but is synchronized and thread safe
	 * 
	 * 	1) O(1) - Retrieve with index
	 * 	2) O(1) - Add/delete element at the end of array
	 *  3) O(n) - Retrieve without index
	 *  4) O(n) - Add/delete element at the front or middle of the array
	 */
	
	public static void main(String[] args) {
		
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee("Jane", "Jones", 123));
		employeeList.add(new Employee("John", "Doe", 4567));
		employeeList.add(new Employee("Mary", "Smith", 22));
		employeeList.add(new Employee("Mike", "Wilson", 3245));
		
		for (Employee employee : employeeList) {
			System.out.println(employee);
		}
		
		System.out.print("\n");
		
		// Check to see if ArrayList is empty
		System.out.println("isEmpty = " + employeeList.isEmpty());
		
		// Check size of the ArrayList
		System.out.println("size = " + employeeList.size());
		
		// Check to see if an object exists in the ArrayList (requires isEquals method in Employee class)
		System.out.println("contains = " + employeeList.contains(new Employee("Mary", "Smith", 22)));
		
		// Check the index of an object
		System.out.println("indexOf = " + employeeList.indexOf(new Employee("John", "Doe", 4567)));
		
		System.out.print("\n");
		
		// Replace an element
		employeeList.set(1, new Employee("John", "Adams", 4568));
		
		// Add a new element shifting everything forward
		employeeList.add(3, new Employee("John", "Doe", 4567));
		
		// Lambda expression
		employeeList.forEach(employee -> System.out.println(employee));
	
		// Remove an element
		employeeList.remove(2);
		
		System.out.print("\n");
		
		// Convert to array
		Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
		for (int i = 0; i < employeeArray.length; i++) {
			System.out.println(employeeArray[i]);
		}
		
	}
	
}
