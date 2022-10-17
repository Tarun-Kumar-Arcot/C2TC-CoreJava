package com.cg.fundamentals;

public class ByteWiseOperator {

	public static void main(String[] args) {
		int i;
		int num = 16;
		
		num = num >>1; // --> 1000 - 0100
		System.out.println(num);
		num = 16;
		num = num << 1; // -> 1000 -> 10000
		System.out.println(num);
		
		for(i=0;i<4;i++) {
			num = num >>1; // --> 1000 - 0100
			System.out.println(num);
		}
	}

}
