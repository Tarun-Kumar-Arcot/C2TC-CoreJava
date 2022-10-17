package com.cg.AnimalCarnivoresHerbivores;

public class Carnivores extends Animal{

	public static void main(String[] args) {
		Animal goat = new Carnivores();
		goat.eat();
		
		Carnivores lion = new Carnivores();
		lion.eat();
		
	}

	void eat() {
		System.out.println("I am a non-vegetarian");
	}

}
