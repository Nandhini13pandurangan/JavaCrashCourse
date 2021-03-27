package com.collections.java.learning.examples;

import java.util.LinkedHashSet;
import java.util.Set;

public class TC04_LinkedHashSet_Examples {

	
	public void linkedHashSet() {
		
		LinkedHashSet<String> hashSet = new LinkedHashSet<String>();
		
		hashSet.add("Raja");
		hashSet.add("durai");
		hashSet.add("Thangaraj");
		hashSet.add("Kamatchi");
		hashSet.add("Raja"); // Duplicates will not be allowed
		
		System.out.println(hashSet); // Insertion order will be maintain here in linkedhashset
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TC04_LinkedHashSet_Examples examples = new TC04_LinkedHashSet_Examples();
		examples.linkedHashSet();
	}

}
