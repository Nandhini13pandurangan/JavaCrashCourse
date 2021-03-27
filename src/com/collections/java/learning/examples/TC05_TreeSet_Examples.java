package com.collections.java.learning.examples;

import java.util.TreeSet;

public class TC05_TreeSet_Examples {

	
	public void treeSetExamples() {
		
		
		TreeSet<Integer> treeSet = new TreeSet<Integer>(); //Multiple data types will not be allowed
		treeSet.add(1);                                   // Sould be same datatype
		treeSet.add(10);
		treeSet.add(15);
		treeSet.add(20);
		treeSet.add(30);
		treeSet.add(45);
		
		System.out.println("TreeSet order values are "+ treeSet); // Order will be Accending order 
		                                                         // Not insertion order
		//First
		System.out.println(treeSet.first()); // print first element
		//Last
		System.out.println(treeSet.last());  // print last element 
		//headset
		System.out.println(treeSet.headSet(30));// values lessaer than given value
		//tailset
		System.out.println(treeSet.tailSet(15)); // values greater than given value
		//subset
		System.out.println(treeSet.subSet(10, 30));// Subset b/w values from given numbers
		//comperator
	    System.out.println(treeSet.comparator());//comparator returns null if sorting is default natural order
	
	    //treeset will not allow null values, it was allowed till java 1.6 version
	    
	    //higher
	    System.out.println(treeSet.higher(30)); // immediate higher value
	    
	    //lower
	    System.out.println(treeSet.lower(45)); // immediate lower value
	    
	    //pollfirst
	    System.out.println(treeSet.pollFirst()); //first value will print and same will get delete
	    
	    //polllast
	    System.out.println(treeSet.pollLast()); //last value will print and same will get delete
	    
	    System.out.println(treeSet);
	   
	    //decending set
	    System.out.println(treeSet.descendingSet()); // will initiate decending order
	    
	    //iterate by foreach
	    
		for (Integer integer : treeSet) {
			System.out.println("foreach values is : "+integer);
		}	
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TC05_TreeSet_Examples examples = new TC05_TreeSet_Examples();
		examples.treeSetExamples();
	}

}
