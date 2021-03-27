package com.collections.java.learning.examples;

import java.util.HashSet;

public class TC03_HashSet_Examples {

	public void hashSetEamples() {
		
	/* Nature of SET
	 * 
	 * SET is the one of the child interfaces of Collection
	
	 * ***** Duplicate values are not allowed *****
	 
	 * Insertion order is not maintained  
		
	 * Data are stored based on hashcode, so search is very effective */
	 
		HashSet<String> hashSet = new HashSet<String>();
		
		hashSet.add("A");
		hashSet.add("B");
		hashSet.add("C");
		hashSet.add("D");
		hashSet.add("A"); // Duplicate will not be allowed
		hashSet.add(null); //will accept null value
		
		System.out.println("Set values are "+hashSet); // Insertion order will not be maintained 
		// But insertion order will be maintanining in Linked hashset
		
		for (String string : hashSet) {
			System.out.println("For each iterator values is : "+string);
		}
	  
	
	}
	
	
	public static void main(String[] args) {
		TC03_HashSet_Examples examples = new TC03_HashSet_Examples();
		examples.hashSetEamples();

	}

}
