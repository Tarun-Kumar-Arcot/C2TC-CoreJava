package com.cg.ExampleProgramsClassesandObjects;

public class Company {
	String name;
	public static void main(String[] args) {
		Company c = new Company();
		Company c1 = c;
		c1.name ="C2TC";
		c = null;
		System.out.println(c.name);
		/**
		 * No , null is not an object.
		 * It is a reference type and its value does not refer to any object and so there is no representation of null in memory.
		 * Cannot read field "name" because "c" is null at com.cg.ExamplePrograms.Company.main
		 */
	}

}
