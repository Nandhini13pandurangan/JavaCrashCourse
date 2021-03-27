package com.collections.java.learning.examples;

import java.util.TreeMap;

public class TC08_TreeMap_Examples {

	public static void main(String[] args) {
		
		
		TreeMap<String, String> treeMap = new TreeMap<String, String>();
		treeMap.put("Aritharimanagalam", "Tiruvannamalai");
		treeMap.put("Kanji", "Tiruvannamalai");
		treeMap.put("Pudhupalayam", "Tiruvannamalai");
		treeMap.put("Nammiyandal", "Tiruvannamalai");
		
		System.out.println("TreeMap values are "+treeMap); // print as per Keys accending order 
		
		System.out.println("***************************************************************");

		
		treeMap.put("Tiruvannamalai", "ABC");
		treeMap.put("Tiruvannamalai", "XYZ");
		//treeMap.put(null, "VWX");  //null value will not allow, not able to compare
		
				
		
		System.out.println("TreeMap values are "+treeMap); //Will override the latest value for same key
		
		// When try to add duplicate key , the latest value will be override by the key as above sysout
		
		
		System.out.println("***Java Crash courses are completed..Happyyyyyyyyyyyyy..Love you Java ***");

	}

}
