package com.cg.comparabledemo;

import java.sql.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

class Employee {
	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}

class AgeComaparator implements Comparator{

	@Override
	public int compare(Object emp1, Object emp2) {
		int emp1Age = ((Employee) emp1).getAge();
		int emp2Age = ((Employee) emp2).getAge();
		
		if (emp1Age > emp2Age) {
			return 1;
		} else if (emp1Age<emp2Age) {
			return -1;
		}else {
			return 0;
		}
	}
	
}



public class ComparatorExample {

	public static void main(String[] args) {
		Employee employee[] = new Employee[2];
		
		employee[0] = new Employee();
		employee[0].setAge(45);
		employee[0].setName("Tarun");
		
		employee[1] = new Employee();
		employee[1].setAge(26);
		employee[1].setName("John");
		
		System.out.println("order of employee before sorting:");
		for(int i=0;i<employee.length;i++) {
			System.out.println("Employee "+(i+1)+" name:"+employee[i].getName()+" Age:"+employee[i].getAge());
		}
		
		System.out.println("Order of the employee after sorting:");
		Arrays.sort(employee,new AgeComaparator());
		
		for(int i=0;i<employee.length;i++) {
			System.out.println("Employee "+(i+1)+" name:"+employee[i].getName()+" Age:"+employee[i].getAge());
		}
	}

}
