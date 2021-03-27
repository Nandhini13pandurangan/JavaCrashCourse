package com.conditions.java.learning;

public class TC01_LetsHaveACoffe {

	boolean isCupEmpty;   // false will be here as default if don't mention anything here
	
	public static void main(String[] args) {
		
		TC01_LetsHaveACoffe coffe = new TC01_LetsHaveACoffe();
		
		if (coffe.isCupEmpty) {  //condition will be true if don't mention anything here
			
			System.out.println("Fill the cup and and have a coffe");
			
		} else {

			System.err.println("Enjoyyyyy the coffe");
		}

	}

}
