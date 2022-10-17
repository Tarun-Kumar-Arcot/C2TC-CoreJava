package com.cg.AnimalLion;

public class Lion extends Animal{

	@Override
	void sound() {
		// TODO Auto-generated method stub
		System.out.println("Roar");
	}
	
	public static void main(String[] args) {
		Animal obj = new Lion();
		obj.sound();
	}
	
}
