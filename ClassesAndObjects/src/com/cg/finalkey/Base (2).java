package com.cg.finalkey;

public final class Base {
	final int var_final=4;
	

	/* constructor cant be final hence
	 * it is illegal to write final public Base(){}
	 */
	
	public Base() {
		System.out.println("Default Constructor in base");
	}
	
	public void methodX()
	{
		System.out.println("This is method x in Base");
	}
	
	public final void methodY()
	{
		System.out.println("This is final method Y in Base");
	}

}
