package com.Try.Catch.Finally.java.xamples;

public class Try_Catch_Finally_Examples2 {

	public static void main(String[] args) {
		
		
		
		try {
			System.out.println("Insicde try Block");
			throw new Exception(); // A exception is occurring here to execute catch block
		} 
		catch (Exception e) {
			System.out.println("Inside Catch Block");
		}
		
		finally {
			System.out.println("Inside finally Block");
		}
		
		
	/*	
		There is no finally block without try/catch, not mandatory but its best to include finally ()
		Exception will occur in finally block as well, Finally blocl will execute all the time 
		
		Finally block will not execute if thread is dead
		When Sysytem.exit
		When an uncoverable exception occurs in finally block

*/	}

}
