package com.hashtable;

import com.pojo.Employee;
import com.pojo.StoredEmployee;

public class SimpleHashTable {

	private StoredEmployee[] hashTable;
	
	public SimpleHashTable() {
		hashTable = new StoredEmployee[10];
	}

	/**
	 * Adds a new object to the HashTable.
	 * 
	 * Time complexity O(1)
	 * 
	 * Implementation
	 * 1) Create a hash from the key
	 * 2) Use linear probing to find an open position
	 * 3) Populate the array with the key
	 * 
	 * @param key
	 * @param employee
	 */
	
	public void put(String key, Employee employee) {
		
		int hashedKey = hashKey(key);
		
		if (isOccupied(hashedKey)) {
			int stopIndex = hashedKey;
			
			// Set the hashedKey to the next position in the array
			if (hashedKey == hashTable.length - 1) {
				hashedKey = 0;
			} else {
				hashedKey++;
			}
			
			// Loop through the array until an open position is found
			while (isOccupied(hashedKey) && hashedKey != stopIndex) {
				hashedKey = (hashedKey + 1) % hashTable.length;
			}
			
		}
		
		if (isOccupied(hashedKey)) {
			System.out.println("Cannot add " + employee.toString() + " at position " + hashedKey + " because the hash is full");
		} else {
			System.out.println("Adding " + employee.toString() + " at position " + hashedKey);
			hashTable[hashedKey] = new StoredEmployee(key, employee);
		}
	}
	
	/**
	 * Creates a hash from a key
	 * 
	 * Time complexity O(1)
	 * 
	 * @param key
	 * @return hashed key
	 */
	
	private int hashKey(String key) {
		return key.length() % hashTable.length;
	}
	
	/**
	 * Determines whether the specified position is occupied
	 * 
	 * @param index
	 * @return
	 */
	
	private boolean isOccupied(int index) {
		return hashTable[index] != null;
	}
	
	private int findKey(String key) {
		
		int hashedKey = hashKey(key);
		if ((hashTable[hashedKey] != null) && (hashTable[hashedKey].getKey().equals(key))) {
			return hashedKey;
		}
		
		int stopIndex = hashedKey;
		
		// Set the hashedKey to the next position in the array
		if (hashedKey == hashTable.length - 1) {
			hashedKey = 0;
		} else {
			hashedKey++;
		}
		
		// Loop through the array until an open position is found
		while ((hashedKey != stopIndex) && (hashTable[hashedKey] != null) && (!hashTable[hashedKey].getKey().equals(key))) {
			hashedKey = (hashedKey + 1) % hashTable.length;
		}
		
		if (stopIndex == hashedKey) {
			return -1;
		} else {
			return hashedKey;
		}
			
	}
	
	public Employee get(String key) {
		int hashedKey = findKey(key);
		if (hashedKey == -1) {
			return null;
		} else {
			return hashTable[hashedKey].getEmployee();
		}

	}
	
	public void printHashTable() {
		for (StoredEmployee storedEmployee : hashTable) {
			System.out.println(storedEmployee.getEmployee().toString());
		}
	}
	
}
