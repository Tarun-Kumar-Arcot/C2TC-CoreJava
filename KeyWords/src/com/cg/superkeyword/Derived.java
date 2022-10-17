package com.cg.superkeyword;

public class Derived extends Base2{
	Derived() {
		System.out.println("Default constructor in the derived class");
	}
	
	Derived(int i,int j) {
		super(i);
		System.out.println("constructor with int arg in derived class, i is "+ i + " and j is "+j);
	}
	
	Derived(int i) {
		System.out.println("constructor with int arg or derived class, i is "+i);
	}
}
