package com.cg.classAB;

public class B extends A{

	public static void main(String[] args) {
		B b = new B();
		b.abstract_method();
		b.normal();
	}

	@Override
	void abstract_method() {
		// TODO Auto-generated method stub
		System.out.println("I am inevitable");
	}

}
