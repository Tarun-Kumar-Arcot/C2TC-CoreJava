package com.cg.ConstructorExample;
/**
 * No Argument constructor and parameterized constructor
 */
public class Employee {
	int id;
	String name;
	float salary;
	
	public Employee(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public Employee() {
		System.out.println("user defined no-argument"+"constructor executed");
	}
	void display() {
		System.out.println(id + " " + name + " " + salary);
	}
}
