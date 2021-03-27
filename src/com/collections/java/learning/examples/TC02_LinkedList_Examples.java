package com.collections.java.learning.examples;

import java.util.LinkedList;

public class TC02_LinkedList_Examples {

	
	public void linkedListExamples() {
		
	LinkedList<Integer> linkedList = new LinkedList<Integer>();
	linkedList.add(0);
	linkedList.add(10);
	linkedList.add(20);
	linkedList.add(30);
	linkedList.add(40);
	linkedList.add(50);
	linkedList.add(0); // Duplicate allowed
	System.out.println(linkedList); // insertion order will maintain
	
	Integer first = linkedList.getFirst(); // get first value
	System.out.println(first);
	
	Integer last = linkedList.getLast();  // last value
	System.out.println(last);
	
	// remove,poll - remove elemet
	// polllast - remove last element
	//removefirstoccurance, removelastoccurance - remove by value
System.out.println("******************************************************");	
	for (Integer integer : linkedList) {
		System.out.println("List is : "+integer);
	}
	
	
	
	// Linked list : Suitable for Insertion and deletion, other elements will not get affected by changes.
	// not suitable for search since it will search one by one in the whole list
	
	
	}
	public static void main(String[] args) {
		TC02_LinkedList_Examples examples = new TC02_LinkedList_Examples();
		examples.linkedListExamples();
	}

}
