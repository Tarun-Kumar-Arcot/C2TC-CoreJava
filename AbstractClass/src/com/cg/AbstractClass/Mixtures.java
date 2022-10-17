package com.cg.AbstractClass;

public class Mixtures extends KaraItem{
	public Mixtures() {
		System.out.println("Mixture");
	}
	@Override
	public void makeKaraItem() {
		System.out.println("Search how to make mixture and make it.");
	}

	@Override
	public String consume() {
		System.out.println(whoAmI);
		prepareToEat();
		return "eat the mixture before the expiry date.";
	}

}
