package com.cg.StaticKeyword;
/*
 * Static is illegal modifier for constructor
 * Hence, public static class MyClass
 * is invalid*/

public class UsingStatic {
		/*
	 * Static is illegal modifer for Constructor
	 */
	public UsingStatic()
	{
		System.out.println("Constructor invoked");
	}

	// Declaring an instance variable
    int var_instance;
 // Declaring static variable
 	static int var_static;	
 	
 	//Declaring non static method
 	public  void methodX()
 	{
 		var_instance=4;
 		var_static=5;
 	}
 	/*
	 * Non static method has access to static as well as non static variables
	 */
	
	/*
	 * static and abstract can not be used together.
	 * hence 
	 * public static abstract void methodY();
 	 * is invalid
	 */
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UsingStatic obj = new UsingStatic();
		obj.methodX();
		System.out.println("Non static keyword " + obj.var_instance);
		System.out.println("Static keyword "+ UsingStatic.var_static);
	}
	

}
