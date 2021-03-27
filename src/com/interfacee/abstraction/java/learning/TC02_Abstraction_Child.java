package com.interfacee.abstraction.java.learning;

public class TC02_Abstraction_Child extends TC01_Abstraction_Parent {

	
	@Override
	public void  engineSecret() {
		System.out.println("Engine Secret");
	}
	
	
	@Override
	public void productPrice() {
		System.out.println("Product price");
		
	}
	
	
	public static void main(String[] args) {
		TC01_Abstraction_Parent parent = new TC02_Abstraction_Child();
		parent.engineSecret();
		parent.employee();
		parent.productPrice();

		
	}

}
