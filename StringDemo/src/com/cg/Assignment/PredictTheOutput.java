package com.cg.Assignment;

import java.util.Iterator;

public class PredictTheOutput {

	public static void main(String[] args) {
		/*String s1 = "";
		String s2 = "Wonderla";
		
		if (s1.length() == 0 || s1.isEmpty()) {
			System.out.println("s1 is empty");
		} else {
			System.out.println(s1);
		}
		
		if (s2.length() == 0 || s2.isEmpty()) {
			System.out.println("s2 is empty");
		} else {
			System.out.println(s2);
		}
		
		String s3 = 50 + 50 + "error" + 50;
		System.out.println(s3);
		// after a string literal, all the + will be treated as string concatenation operator.
		
		String s4 = "Apple";
		int a = 10;
		System.out.println(s4 + a);
		//System.out.println(s4.concat(a));
		
		String r = null;
		System.out.println(s4 + r);
		System.out.println(s4.concat(r));
		*
		String s5 = "Great", tString = "H";
		String uString = s5.concat(tString);
		if (uString == s5) {
			System.out.println("Same");
		} else {
			System.out.println("Not same");
		}
		
		String e = s5 + tString; 
		if (e == s5) {
			System.out.println("Same");
		} else {
			System.out.println("Not same");
		}
		
		String s6 = "This is the example";
		int index = s6.indexOf("example", 1);
		System.out.println(index);
		index = s6.indexOf("example", 20);
		System.out.println(index);
		*/
		float f = 10.05645f;
		double d = 10.02;
		String s7 = String.valueOf(f);
		String s8 = String.valueOf(d);
		System.out.println(s7);
		System.out.println(s8);
		
		String s9 = "this is he world";
		int index1 = s9.lastIndexOf('s',5);
		System.out.println(index1);
		
		String s10 = "This is last index of example";
		int index = s10.lastIndexOf("last");
		System.out.println(index);
		index = s10.lastIndexOf(index);
		
		String s11 = "Welcome to Jumanji";
		char[] ch1 = s11.toCharArray();
		int len = ch1.length;
		System.out.println(len);
		for(int i = 0; i < len; i++) {
			System.out.println(ch1[i]);
		}
	}

}
