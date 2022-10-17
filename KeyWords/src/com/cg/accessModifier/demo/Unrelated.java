package com.cg.accessModifier.demo;

public class Unrelated {
	public Unrelated() {
		/*Assigning values to the variables directly which are there in the base class*/
		/*var_default = 10;
		var_public = 20;
		var_protected = 30;
		var_private = 40;
		Not accessible directly
		*/
		
		/*Invoking methods from the base class
		 * method_default(); // not accessible directly
		 * method_public(); //not accessible directly
		 * method_protected(); // not accessible directly
		 * method_private(); // not accessible directly
		 */
		/* Access by using objects of class 'Base'*/
		// Accessing variables
		Base objBase = new Base();
		objBase.var_default = 10;
		objBase.var_public = 20;
		objBase.var_protected = 30;
		// objBase.var_private = 40;
		
		objBase.method_default();
		objBase.method_public();
		objBase.method_protected();
		//objBase.method_private();
		
	}
	
}
