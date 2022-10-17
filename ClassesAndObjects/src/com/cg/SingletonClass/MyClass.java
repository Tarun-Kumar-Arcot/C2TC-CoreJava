/*
 * demo on singleton classes
 */

package com.cg.SingletonClass;

public class MyClass {
	
	static MyClass obj = new MyClass();
	static int countobj;
	
	public static void count() {
		countobj++;
		System.out.println("Total objects are:"+ countobj);
	}
	
	public static MyClass getInstance() {
		return obj;
	}
	
}
