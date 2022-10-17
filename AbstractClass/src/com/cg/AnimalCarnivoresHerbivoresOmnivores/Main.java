package com.cg.AnimalCarnivoresHerbivoresOmnivores;

public class Main {

	public static void main(String[] args) {
		Animal goat = new Herbivores();
		Animal tiger = new Carnivores();
		Animal bear = new Omnivores();
		goat.eat();
		tiger.eat();
		bear.eat();
	}

}
