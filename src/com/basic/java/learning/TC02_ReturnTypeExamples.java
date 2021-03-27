package com.basic.java.learning;

public class TC02_ReturnTypeExamples {

	int PriceAmount = 1000;
	
	public int getPriceAmount() {
		//Son
		
		System.out.println("Dad I have collected the Gift Amount "+PriceAmount +"sent it to you");
		return PriceAmount;
	}
	
	public static void main(String[] args) {
		// Father

		TC02_ReturnTypeExamples Amount = new TC02_ReturnTypeExamples();
		int pricamount = Amount.getPriceAmount();
		System.out.println("Got the amount my son "+pricamount);
	}

}
