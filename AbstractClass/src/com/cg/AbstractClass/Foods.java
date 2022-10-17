package com.cg.AbstractClass;

public abstract class Foods {
	/**
	 * abstract keyword can be used for class or method
	 * it can't be used for variables & constructors
	 */
	public static final String whoAmI = "I am eatable";
	
	public Foods() {
		System.out.println("is a food");
	}
	
	// If at least one abstract method is there then the class has to be abstract 
	public abstract String consume(); // abstract method
	public abstract String taste();
	
	// An abstract class can have non abstract protected and private method
	 protected void prepareToEat() { // non abstract method
		System.out.println("clean your hand");
	}
	
	private void wash() {
		System.out.println("Have you washed your hands?");
	}
	
	
}
