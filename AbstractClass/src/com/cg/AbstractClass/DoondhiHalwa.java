package com.cg.AbstractClass;

public class DoondhiHalwa extends Halwa {
	public DoondhiHalwa() {
		System.out.println("Doondhi Halwa");
	}
	
	@Override
	public void makeHalwa() {
		System.out.println("search the recipe for Doondhi halwa and make it");
	}

	@Override
	public String consume() {
		System.out.println(whoAmI);
		prepareToEat();
		return "eat Doodhi Halwa when it is hot or cold";
	}
	
	
}
