package com.cg.finalkey;

import java.security.PublicKey;

public final class Base {
	final int var_final = 4;
	
	/*
	 * Constructor cant be final hence
	 * it is illegal to write final public Base(){}
	 */
	
	public Base() {
		System.out.println("Default Constuctor in base");
	}
	
	public void methodX() {
		System.out.println("This is method X in base class");
	}
	
	public final void methodx()
	{
		System.out.println("This is final method Y in Base");
	}

}
