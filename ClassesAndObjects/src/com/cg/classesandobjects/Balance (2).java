package com.cg.classesandobjects;

public class Balance {
	private String name;
	private double balance;
	
	// creation of constructor
	
	public Balance(String name, double balance) {
		super();
		this.name = name;
		this.balance = balance;
	}
	
	// creation of method
	public void show() {
		if(balance<0) 
			System.out.println("your balance is low");
			System.out.print("-->> ");
			System.out.println(name + ": $" + balance);
	}


}
