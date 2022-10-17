package com.cg.exceptionhandling;

public class MultiCatch {
	public static void main(String[] args) {
		
		try {
			int a = args.length;
			System.out.println("a= "+a);
			
			int b = 42/a;
			System.out.println(b);
			
			int c[] = {1};
			c[42] = 101;
			System.out.println(c[42]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		} catch (ArithmeticException e) {
			System.out.println("Divide by 0: "+e);
		}
		System.out.println("After try catch blocks");
	}
}
