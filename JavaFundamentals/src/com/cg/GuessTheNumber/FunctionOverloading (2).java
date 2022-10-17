package com.cg.GuessTheNumber;

public class FunctionOverloading {
	static void test(float x) {
        System.out.print("float");
    }
    static void test(double x) {
        System.out.print("double");
    }
	public static void main(String[] args) {
		test(99.9);
		test(99.9001000111111111f);
	}

}
