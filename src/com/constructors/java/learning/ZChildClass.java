package com.constructors.java.learning;

public class ZChildClass extends ZParentClass {

	public ZChildClass() {
		
	//	super(); - Super keyword is available here as invisible
		
		System.out.println("Childclass constructor");
	}
	
	public static void main(String[] args) {
		
		ZChildClass childclass = new ZChildClass();
	}
}
