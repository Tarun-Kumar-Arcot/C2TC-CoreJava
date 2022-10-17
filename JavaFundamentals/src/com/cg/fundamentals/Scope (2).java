package com.cg.fundamentals;

public class Scope {

	public static void main(String[] args) {
		int outer = 1;
		
		{
			int inner = 2;
			System.out.println("inner variable = "+ inner);
			System.out.println("outer variable = "+ outer);
		}
		
		int inner = 3;
		System.out.println("inner variable = "+ inner);
		System.out.println("outer variable = "+ outer);
	}

}
