package com.enumeration;

public enum Person {

	JOHN("male", 22),
	JANE("female", 18),
	CHARLIE("male", 30),
	BOB("male", 25);
	
	private final String gender;
	private final int age;
	
	private Person(String gender, int age) {
		this.gender = gender;
		this.age = age;
	}
	
	public String getGender() {
		return gender;
	}

	public int getAge() {
		return age;
	}
	
}
