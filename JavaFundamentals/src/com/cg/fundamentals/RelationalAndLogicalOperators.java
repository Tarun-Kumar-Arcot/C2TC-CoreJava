package com.cg.fundamentals;

import java.util.Random;

public class RelationalAndLogicalOperators {

	public static void main(String[] args) {
		Random random = new Random(); // className objectName = new className();
		int i = random.nextInt(100);
		int j = random.nextInt(100);
		System.out.println("First Number = "+ i);
		System.out.println("Second Number = "+ j);
		
		// Relational operators
		System.out.println("-----Relational Operators-------");
		System.out.println(" i > j ? " + (i > j));
		System.out.println("i < j ? " + (i < j));
		System.out.println("i >= j ? " + (i >= j));
		System.out.println("i <= j ? " + (i <= j));
		System.out.println("i == j ? " + (i == j));
		System.out.println("i != j ? " + (i != j));
		
		//Logical Operators
		System.out.println("-----Logical Operators-------");
		int a = 50;
		int b = 4;
		System.out.println((a<10)&&(b<10));
		System.out.println((a<10)||(b<10));
		
	}

}
