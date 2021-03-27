package com.constructors.java.learning;


// No Arguements Constructor

public class Employee {
	
	int employeeID;
	
	public Employee() {
		
		employeeID = 12345;
		System.out.println("Employee constructor is created");
		
	}

	public static void main(String[] args) {
		Employee employee = new Employee();
		System.out.println(employee.employeeID);

	}

}
