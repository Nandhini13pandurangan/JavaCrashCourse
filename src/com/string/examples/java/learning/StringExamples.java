package com.string.examples.java.learning;

public class StringExamples {

	//**** String : A String is sequence of Characters and String is Immutable ****\\
	
	
	public static void main(String[] args) {

		String name = "Rajadurai";  // String literal
		String name1 = " Love ";
		int number=7;
		
		//Here we will see the list of String methods and examples
		
		
		//return the character values of particular index
		System.out.println(name.charAt(1));
		
		// String length
		System.out.println(name.length());
		
		//String equals
		System.out.println(name.equals("rajadurai"));
		
		//String equalsIgnoreCase
		System.out.println(name.equalsIgnoreCase("RAJADURAI"));
		
		//String Empty check
		System.out.println(name.isEmpty());
		
		//String contains
		System.out.println(name.contains("j"));
		
		//Substring begin index will include and separate sub string from the string
		System.out.println(name.substring(4));
		
		//substring begin and end index **Begin index will include and End index will exclude***
		System.out.println(name.substring(0, 4));
		
		//String concat will add the string with existing string
		System.out.println(name.concat("Ravi"));
		
		//String replace a single character and word
		System.out.println(name.replace("j", "J"));
		System.out.println(name.replace("durai", "Ravi"));
		
		//Find the string position
		System.out.println(name.indexOf("a"));
		
		//Find the character specified from the index position
		System.out.println(name.indexOf("j", 0));
		System.out.println(name.indexOf("dur", 0));
		
		// remove the space of begin and end of a string
		System.out.println(name1.trim());
		
		//Convert the given datatype to sting
		System.out.println(String.valueOf(number));
		
		//UpperCase to Lowercase
		String UpperCase = "LOVEYOU";
		System.out.println(UpperCase.toLowerCase());
		
		//LowerCase to UpperCase
		String Lowercase = "loveyou";
		System.out.println(Lowercase.toUpperCase());
		
		//String Join 
		
		System.out.println(String.join("_", "Raja","Durai","Ravi"));
		System.out.println(String.join("/", "20","03","2021"));
		
		//String Spilit
		
		String splithis = "Am,I,Teaching,Good";
		String[] splitword = splithis.split(",");
		for (String string : splitword) {
			
			System.out.println(string);
		}
		
	}

}
