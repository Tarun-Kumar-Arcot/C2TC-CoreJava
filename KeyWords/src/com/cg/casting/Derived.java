package com.cg.casting;

import java.security.PublicKey;

public class Derived extends Base{
	public Derived() {
		System.out.println("Constructor in derived class");
	}
	
	public void methodY() {
		System.out.println("Y method in base class");
	}
}
