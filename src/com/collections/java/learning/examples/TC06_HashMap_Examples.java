package com.collections.java.learning.examples;

import java.util.HashMap;

public class TC06_HashMap_Examples {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();// key & value
		// need to give 2 data types one is key and other one is value
		
		hashMap.put(1, "Raja");  // put method to insert a values in map
		hashMap.put(2, "Anandhi");//Entry = combination of key and value
		hashMap.put(3, "Prabhu");
		hashMap.put(4, "Elaa");
		hashMap.put(null, "Thangam");
		System.out.println("Hashmap values are"+hashMap); //insertion order will not maintain,random order
		                                                 // check keys and values as string for an idea
		
		HashMap<Integer, String> othermap = new HashMap<Integer, String>();
		othermap.putAll(hashMap);                               // putAll method for duplicatemap
		System.out.println("othermap values are "+othermap);
		
		System.out.println(hashMap.keySet()); // print all keys alone
		System.out.println(hashMap.values()); //values alone
		/*
		
		* It represent data in key-value as pairs
		* Duplicate keys are not allowed
		* Duplicate values are allowed
	    * Null key will be allowed, values will override if multiple null key available
		
		*/
		

	}

}
