package com.cg.fundamentals;

public class TypeCasting {

	public static void main(String[] args) {
		// Wide casting
		int myInt1 = 9;
        double myDouble1 = myInt1;
        System.out.println(myDouble1);
        System.out.println(myInt1);
        
        // Narrow casting
        double myDouble2 = 9.78;
        int myInt2 = (int) myDouble2;
        System.out.println(myDouble2);
        System.out.println(myInt2);
        
        float f = (1 / 4) * 10;

        int i =(int) f;

        System.out.println(i);
	}

}
