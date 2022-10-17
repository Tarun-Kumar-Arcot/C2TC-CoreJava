package com.cg.comparabledemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/*
 * This interface imposes a total ordering on the objects of each class that implements it. 
 * This ordering is referred to as the class's natural ordering, and the class's compareTo method is referred to as its natural comparison method.*/
public class Car implements Comparable<Car>{
	
	private String name;
	private int id;
	
	
	public Car(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public int compareTo(Car o) {
		if (this.getId()==o.getId()) {
			return 0;
		} else if (this.getId() > o.getId()) {
			return 1;
		} else {
			return -1;
		}
	}

	public int getId() {
		return id;
	}

	public static void main(String[] args) {
		Car c1 = new Car("BMW",119);
		Car c2 = new Car("Lambhorgini", 89);
		Car c3 = new Car("Wolkwagen", 899);
		Car c4 = new Car("Fiat", 67);
		Car c5 = new Car("Bugatti", 210);
		
		List<Car> list = new ArrayList<>();
		list.add(c1);
		list.add(c2);
		list.add(c3);
		list.add(c4);
		list.add(c5);
		
		// before sorting
		System.out.println("Before sorting");
		for(Car c:list)
			System.out.println(c.id);
		
		Collections.sort(list);
		System.out.println("After sorting in ascending");
		//after sorting in ascending
		for(Car c:list)
			System.out.println(c.id);
		
		Collections.sort(list,Collections.reverseOrder());
		System.out.println("After sorting in descending");
		//After sorting in descending
		for(Car c:list)
			System.out.println(c.id);
	}

	
}
