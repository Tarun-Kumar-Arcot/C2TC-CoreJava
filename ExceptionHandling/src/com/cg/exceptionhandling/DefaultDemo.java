package com.cg.exceptionhandling;

public class DefaultDemo {

	public static void main(String[] args) {
		String str = null;
		try {
			str.equals("Hello");
		} catch (Exception e) {
			// TODO: handle exception
			str = new String("Hello");
			System.out.println(str.equals("Hello"));
			e.printStackTrace();
			System.out.println("exception caught");
		}
		//str.equals("Hello");// null pointer exception cannot compare 
		System.out.println("welcome");
		System.out.println("hi good morning");
	}

}
