package com.hashtable;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import com.pojo.Employee;
import com.pojo.StoredEmployee;

public class ChainedHashtable {

	private List<StoredEmployee>[] hashtable;
	
	public ChainedHashtable() {
		hashtable = new LinkedList[10];
		for (int i = 0; i < hashtable.length; i++) {
			hashtable[i] = new LinkedList<StoredEmployee>();
		}
	}
	
	public void put(String key, Employee employee) {
		int hashedKey = hashKey(key);
		hashtable[hashedKey].add(new StoredEmployee(key, employee));
	}
	
	public Employee get(String key) {
		int hashedKey = hashKey(key);
		ListIterator<StoredEmployee> iterator = hashtable[hashedKey].listIterator();
		StoredEmployee employee = null;
		while (iterator.hasNext()) {
			employee = iterator.next();
			if (employee.getKey().equals(key)) {
				return employee.getEmployee();
			}
		}
		
		return null;
		
	}
	
	private int hashKey(String key) {
		return key.length() % hashtable.length;
	}
	
	public void printHashtable() {
		for (int i = 0; i < hashtable.length; i++) {
			if (hashtable[i].isEmpty()) {
				System.out.println("Position " + i + " is empty");
			} else {
				System.out.print("Position " + i + " : ");
				ListIterator<StoredEmployee> iterator = hashtable[i].listIterator();
				while (iterator.hasNext()) {
					System.out.print(iterator.next().getEmployee() + " -> ");
				}
				System.out.println("null");
			}
		}
	}
	
}
