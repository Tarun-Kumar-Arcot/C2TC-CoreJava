package com.cg.finalkey;

import com.cg.casting.Base;

public class Derived extends Base{
	
	// legal override as methodx is non final method
	public void methodX() {
		System.out.println("This is methodX in base class");
	}
	
	/* following override is invalid as this method is
	 * declared as final in Base class.
	public void methodY()
	{
	}
	*/
	
	/*
	 * Following declaration is invalid
	 * as we can not decrease access
	 * while overriding.
	 * void methodX()
		{
		}
	*/

}
