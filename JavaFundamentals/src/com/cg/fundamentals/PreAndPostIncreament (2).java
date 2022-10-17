package com.cg.fundamentals;

public class PreAndPostIncreament {

	public static void main(String[] args) {
		int a = 5;
		int b = 2;
		int c;
		int d;
		c = ++b; // LINE A
		d = ++a; // LINE B
		c++;
		System.out.println("a= "+a+" b= "+b+" c= "+c+" d= "+d);
		/*a=5
		  b=2
		  ++b = 3
		  c = 3
		  ++a= 6
		  d = 6
		  c++ = 4
		  Final values --> a = 6, b = 3, c = 4, d = 6
		  */
	}

}
