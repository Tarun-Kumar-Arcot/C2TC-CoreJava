package com.cg.AbstractClass;

public class Murku extends KaraItem{
	public Murku() {
		System.out.println("Murku");
	}
	@Override
	public void makeKaraItem() {
		System.out.println("Search for the recipe of murku and make it.");
	}

	@Override
	public String consume() {
		System.out.println(whoAmI);
		prepareToEat();
		return "eat the murku when ever you want";
	}

}
