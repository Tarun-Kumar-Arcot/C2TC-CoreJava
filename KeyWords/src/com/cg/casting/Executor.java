package com.cg.casting;

public class Executor {
	public static void main(String[] args) {
		Base b=new Base(); //allowed
		Derived d=new Derived(); //allowed
		Base b1=new Derived(); //allowed
		//Derived d1=new Base(); //Not allowed
		Base b2=d; //Upcasting is allowed
		//Derived d2=b1; direct Downcasting not allowed
		//Derived d3=b; direct Downcasting not allowed
		Derived d2=(Derived)b1;//allowed as reference is base and object is derived
		/*
		 * Derived d3=(Derived)b;
		 * Not allowed as object b is of base class
		 * No compilation error, but will produce
		 * java.lang.ClassCastException 
		 */
		b.methodx(); //valid
		//b.methodY(); invalid
		
		d.methodx(); //valid
		d.methodY(); //valid
		
		b2.methodx(); //valid
		//b2.methodY(); invalid
	
		d2.methodx(); //valid
		d2.methodY(); //valid

	}
}
