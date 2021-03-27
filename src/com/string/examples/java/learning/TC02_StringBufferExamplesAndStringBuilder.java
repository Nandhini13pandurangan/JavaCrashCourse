package com.string.examples.java.learning;

public class TC02_StringBufferExamplesAndStringBuilder{

	public static void main(String[] args) {
		
		String name = "Raja";
		StringBuffer name1 = new StringBuffer("Love");
		
		System.out.println("STRING IS IMMUTABLE");
		System.out.println("after include value is "+name.concat("durai"));
		System.out.println("The original value is "+name);
		
		System.out.println("STRING IS MUTABLE");
		System.out.println("after include value is "+name1.append("you"));
		System.out.println("Original name is "+name1);
		
		//StringBuffer reverse
		System.out.println("Reversded name is "+name1.reverse());
		
		//StringBuffer Replace
		StringBuffer replacethis = new StringBuffer("Nature");
		System.out.println("Updated name is "+replacethis.replace(0, 4, "Mixtu") );
		
		//StringBuffer Delete
		StringBuffer deletethis = new StringBuffer("LoveyouRaja");
		System.out.println("After deletion the value is "+ deletethis.delete(0, 7));
		
		//StringBuffer Insert 
		StringBuffer insertthis = new StringBuffer("Moni");
		System.out.println("After insert the value is "+insertthis.insert(4, "sha"));
		
		//StringBuffer capacity
		System.out.println(insertthis.capacity());   // standard is 20
		
		//Like String we have charAt,Substring,length methods as well
		
		//** All StringBuffer methods applicable for StringBuilder **\\
		
		//StingBuffer is synchronised - thread-safe, multiple threads can not access it simultaneously
		
		//StingBuilder is non Synchronised  - multiple threads can access it simultaneously
		
		
		
		
		
		
		

	}

}
