package com.cg.Assignment;

public class Main {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "Hello";
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		System.out.println(str1 == str2);
        System.out.println(str2 == s1);
        System.out.println(s1 == s2);
	}

}
/*
 * str1== str2 true 
 * str1 == s1 false --> object data stored in different address
 * s1 == s2 false --> object data stored in different address
 * 
 * */
 