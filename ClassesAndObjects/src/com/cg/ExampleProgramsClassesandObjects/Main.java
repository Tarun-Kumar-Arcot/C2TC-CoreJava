package com.cg.ExampleProgramsClassesandObjects;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple a1 = new Apple();
		Apple a2 = new Apple();
		a1.weight = 1;
		a2.weight = 2;
		a2 = a1;
		System.out.println(a2.weight);
	}

}
