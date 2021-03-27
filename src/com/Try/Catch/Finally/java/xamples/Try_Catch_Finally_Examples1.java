package com.Try.Catch.Finally.java.xamples;

public class Try_Catch_Finally_Examples1 {

	public static void main(String[] args) {
	
		try {
			
			int number1 = 0;
			int number2= 3;
			int result = number2/number1;
			System.out.println(result);
					
		} 
		catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println(" Dont divide a number by 0 ");
		}
		
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("Drink a Lemon Juice and Dont divide a number by 0");
		}
		
	/*	
		Exception: Checked exception : Complitime exception, Unchecked exception : Runtime exception 
		Multiple catch blocks possible and Exception e block will be last one as its a parent one
		
	*/
	}

}
