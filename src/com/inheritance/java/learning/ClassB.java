package com.inheritance.java.learning;

public class ClassB extends ClassA {

	public static void main(String[] args) {
		
		ClassA classA = new ClassA();
		classA.engine();
		System.out.println(classA.Wheels);

	}

}


// *** Multiple inheritance not possible in java(Interface), Multilevel inheritance is possible***///