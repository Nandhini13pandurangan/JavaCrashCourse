package com.staticskeyword.java.learning;

public class TC01_StaticsMethods {

	
	public static void staticmethod() {
		System.out.println("Its a static method");
	}
	public void nonStaticMethod() {
		System.out.println("Non Static Method");
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		staticmethod();   // *** Static : No Object created***
		

		TC01_StaticsMethods methods = new TC01_StaticsMethods();   // ***Object created as its non static***
		methods.nonStaticMethod();
	}

}
