package com.methodoverloading.overriding.learning;

public class TC02_MethodOverrring_Child  extends TC01_MethodOverriding_Parent{

	
	
	@Override
	public void marriage() {
		
		System.out.println("My marrige is my rules");
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		TC01_MethodOverriding_Parent parent = new TC02_MethodOverrring_Child();
		parent.marriage();

		
	}

}
