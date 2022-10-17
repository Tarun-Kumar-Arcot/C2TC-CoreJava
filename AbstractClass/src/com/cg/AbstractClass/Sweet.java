package com.cg.AbstractClass;

public abstract class Sweet extends Foods{
	public Sweet() {
		System.out.println("is a sweet");
	}
	
	@Override
	public String taste() {
		return "Sweet";
	}
}
