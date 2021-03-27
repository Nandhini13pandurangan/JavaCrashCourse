package com.collections.java.learning.examples;

import java.util.LinkedHashMap;

public class TC07_LinkedHashMap_Examples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
	
		linkedHashMap.put(1, "Divya");
		linkedHashMap.put(2, "Dharshini");
		linkedHashMap.put(3, "Priya");
		linkedHashMap.put(null, "Sam");
		
		System.out.println("Linkedhashmap values are "+linkedHashMap); // insertion order will maintain
		
        /*
		
		* It represent data in key-value as pairs
		* Duplicate keys are not allowed
		* Duplicate values are allowed
		* Null key will be allowed, values will override if multiple null key available
		
		*/
		
		
		
		
		
	}

}
