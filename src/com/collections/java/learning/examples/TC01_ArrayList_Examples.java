package com.collections.java.learning.examples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TC01_ArrayList_Examples {

	public void arrayListExamples() {
		
		List<String> arraylist = new ArrayList<String>(); // Initialize Arraylist
		
		arraylist.add("Raja"); // add in ArrayList
		arraylist.add("Prakash");
		arraylist.add("Murugan");
		arraylist.add("Raja"); // Duplicate value is allowed in ArrayList
		arraylist.add("Venkat");
		System.out.println(arraylist);  // Insertion order will maintain in ArrayList
		
		System.out.println(arraylist.get(0)); // get method in Arraylist
		
		System.out.println(arraylist.indexOf("Raja"));  // Position of element(first)
		System.out.println(arraylist.lastIndexOf("Raja")); // Last position of element
		// if the element is not eixst on list it will return -1
		
		List<String> anotherlist = new ArrayList<String>();
		anotherlist.addAll(arraylist);  // Copy all elements from one list to another list
		System.out.println(anotherlist);
		
		anotherlist.clear();            // Delete all the elements of List
		System.out.println(anotherlist);
		
		System.out.println(arraylist);
		arraylist.remove(0);               // remove a element by index in arraylist
		System.out.println(arraylist);
		
		arraylist.remove("Raja");               // remove a element by String Value in arraylist
		System.out.println(arraylist);
		
		arraylist.add(null);   // list will accept null insertion
		System.out.println(arraylist);
		
		arraylist.set(0, "Krish");  // replace a element in List
		System.out.println(arraylist);
		
		
		System.out.println(arraylist.isEmpty()); // Check if the list is Empty 
		
		System.out.println("**********************************************");
		
		for (String string : arraylist) {
			System.out.println("using for each loop "+string);
		}
		System.out.println("**********************************************");
		
		for (int i = 0; i < arraylist.size(); i++) {
			
			System.out.println("Using for loop "+arraylist.get(i));
			
		}
		
		System.out.println("**********************************************");
		ListIterator<String> iterator = arraylist.listIterator();
		while (iterator.hasNext()) {
			System.out.println("List iterator "+iterator.next());
		}
		
		while (iterator.hasPrevious()) {
			System.out.println("List iterator "+iterator.previous());
		}
		
		Iterator<String> iterator1 = arraylist.iterator();
		while (iterator1.hasNext()) {
			System.out.println("iterato class: "+iterator1.next());
		}
		// ArrayList -Exception : Concurrent modification exception
		// Synchronized = NO , multi thread = NO
		// Default size : 10
		// new list = total element / 2
		//*** Best suited for search operations and performs worst on insertion and deletion ***
		//*** Choose Arraylist for Search operations and not for deletion and insertion ****
		//** if we add or delete a element other elements has to change their place as well ***
		
		//** Arraylist implements Random access interface
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		TC01_ArrayList_Examples examples = new TC01_ArrayList_Examples();
		examples.arrayListExamples();

	}

}
