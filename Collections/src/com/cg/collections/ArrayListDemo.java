package com.cg.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		List list = new ArrayList<>();
		System.out.println("initial size of the list is : "+list.size());
		
		// add elements to the array list 
		list.add("Rahul");
		list.add(true);
		list.add(5.2f);
		list.add('c');
		list.add("Tarun");
		list.add(null);
		System.out.println("size of the list after adding elements: "+list.size());
		
		//display the arraylist		
		System.out.println("list of elements in the array: "+list);
		
		//deletion from a list
		list.remove(3);
		
		System.out.println(list);
	}
}
