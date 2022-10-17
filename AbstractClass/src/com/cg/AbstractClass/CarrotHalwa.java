package com.cg.AbstractClass;

public class CarrotHalwa extends Halwa{
	public CarrotHalwa() {
		System.out.println("Carrot Halwa");
	}
	@Override
	public void makeHalwa() {
		System.out.println("Search the recipe for carrot halwa and make it");
	}
	// concrete class has to implement all the abstract methods in the parent abstract class 
	@Override
	public String consume() {
		// TODO Auto-generated method stub
		System.out.println(whoAmI);
		prepareToEat();
		return "eat when it is hot or cold";
	}
	
	     
}
