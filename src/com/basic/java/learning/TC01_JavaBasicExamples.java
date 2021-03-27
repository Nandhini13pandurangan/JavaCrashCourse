package com.basic.java.learning;

public class TC01_JavaBasicExamples {

	
	Long AccountNumber = 1234567890l;
	String HolderName = "Raja";
	int AccountBalance = 350;
	
	public void getBalance() {
		System.out.println("The Balance is "+AccountBalance);
	}
	public static void main(String[] args) {
		TC01_JavaBasicExamples object = new TC01_JavaBasicExamples();
		object.getBalance();

	}

}
