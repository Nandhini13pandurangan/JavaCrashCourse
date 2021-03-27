package com.constructors.java.learning;

// Parameterized Constructors

public class Animal {
	
	String AnimalName;
	int AnimalAge;

	public Animal(String name, int age) {
		
		AnimalName = name;
		AnimalAge = age;
		System.out.println("Animal name is "+AnimalName);
		System.out.println("Animal age is "+AnimalAge);
	}
	
	
	public static void main(String[] args) {
		

		Animal animal = new Animal("Dog", 46);
		
	}

}
