package com.hashtable;

import com.pojo.Employee;

public class HashTableMain {

	/*
	 *  Summary
	 *  1) Provides access to data using keys
	 *  2) Key does not have to be an integer
	 *  3) Consists of key/value pairs - data types don't have to match
	 *  4) Optimized for retrieval (when you know the key)
	 *  5) Associative array is one type of hash table
	 *  
	 *  Hashing
	 *  1) Map keys of any data type to an integer
	 *  2) Hash function maps kesy to int
	 *  3) In Java, hash function is Object.hashCode()
	 *  4) Collision occurs when more than one value has the same hased value
	 * 
	 *  Load Factor
	 *  1) Tells us how full a hash table is
	 *  2) Load factor = # of items / capacity = size / capacity
	 *  3) Load factor is used to decide when to resize the array backing the hash table
	 *  4) Don't want load factor too low (lots of empty space)
	 *  5) Don't want load factor too high (will increase the likelihood of collisions)
	 *  6) Can play a role in determining the time complexity for retrieval
	 * 
	 *  Add to a Hash Table backed by an array
	 *  1) Provide key/value pair
	 *  2) Use hash function to hash the key to an int value
	 *  3) Store the value at the hashed key value - this is the index into the array
	 * 
	 *  Retrieve a value from a hash table
	 *  1) Provide the key
	 *  2) Use the same hash function to hash the key to an int value
	 *  3) Retrieve the value stored at the hashed key value
	 * 
	 */
	
	public static void main(String[] args) {
	
		Employee janeJones = new Employee("Jane", "Jones", 123);
		Employee johnDoe = new Employee("John", "Doe", 4567);
		Employee marySmith = new Employee("Mary", "Smith", 22);
		Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
		Employee billEnd = new Employee("Bill", "End", 78);
	
		SimpleHashTable ht = new SimpleHashTable();
		ht.put("Jones", janeJones);
		ht.put("Doe", johnDoe);
		ht.put("Wilson", mikeWilson);
		ht.put("Smith", marySmith);
		ht.put("End", billEnd);
		
		System.out.println("Retrieve key Wilson: " + ht.get("Wilson"));
		System.out.println("Retrieve key Smith: " + ht.get("Smith"));
		
		System.out.print("\n");
		
		ChainedHashtable ht1 = new ChainedHashtable();
		ht1.put("Jones", janeJones);
		ht1.put("Doe", johnDoe);
		ht1.put("Wilson", mikeWilson);
		ht1.put("Smith", marySmith);
		ht1.put("End", billEnd);
		
		ht1.printHashtable();
		
		System.out.println("Retrieve key Wilson: " + ht.get("Wilson"));
		System.out.println("Retrieve key Smith: " + ht.get("Smith"));
		
	}
}
