package com.cg.ConstructorExample;

public class Main {

	public static void main(String[] args) {
		Employee e1 = new Employee(101, "Tarun", 45000); // calling parameterized constructor
		Employee e2 = new Employee();// calling Noarg constructor
		Employee e3 = new Employee(102,"Rahul",12000); // calling parameterized constructor
		
		// calling display method
		e1.display();
		e2.display();
		e3.display();
	}

}
