package com.cg.thisKeyword;

public class Base2 extends Base1{
	Base2() {
		System.out.println("Default constructor in Base 2");
	}
	
	Base2(int i) {
		//super(i);
		this(i,10);
		System.out.println("constructor with int arg in BASE 2, i is " + i);
	}
	
	Base2(int i,int j) {
		super();
		System.out.println("constructor with int arg in BASE 2, i is "+ i + " and j is "+j);
	}
	
	
}
