package com.cg.AbstractClass;

//import java.lang.reflect.Constructor;

public abstract class Spicy extends Foods{
	public Spicy() {
		System.out.println("is spicy");
	}
	@Override
	public String taste() {
		return "Spicy";
		
	}
}
