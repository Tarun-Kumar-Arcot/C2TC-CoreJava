package com.cg.acessmodifier.demo;

public class Derived extends Base{
	Derived(){
		/*
		 * Assigning values to variables declared in Base
		 */
		var_default = 10;
		var_public = 20;
		var_protected = 40;
		//var_private = 30; This done not work as it is private
		
		/*
		 * Invoking methods from the base class
		 */
		method_default();
		method_public();
		method_protected();	
		//method_private(); This does not work as it is private
	}
}
