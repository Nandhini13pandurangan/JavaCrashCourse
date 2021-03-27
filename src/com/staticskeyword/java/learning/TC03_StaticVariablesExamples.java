package com.staticskeyword.java.learning;

public class TC03_StaticVariablesExamples {

	
	static String FlowerName = "Rose";
	int flowerprice = 150;
	
	
	
	
	public static void main(String[] args) {
		
		FlowerName = "Jasmin";
		
		System.out.println(FlowerName);   // Latest value for static varibale will print

		//****We can not print a non static varible without static
	}

}
