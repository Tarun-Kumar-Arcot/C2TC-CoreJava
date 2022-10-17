package com.cg.AbstractClass;

import java.util.Scanner;

public class Executor {

	public static void main(String[] args) {
		// Food f = new Food(); --> we cannot create an object of an abstract class
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("what type of food item you want?");
		System.out.println("1. Spicy \n 2. Sweet");
		String food = scanner.next();
		
		switch(food) {
		case "Sweet":
			System.out.println("Do you like\n 1. Carrot halwa or 2. Doodhalwa ");
			int sweetItem = scanner.nextInt();
			switch(sweetItem) {
			case 1:
				System.out.println("creating obj of carrot halwa");
				System.out.println("Description of carrot halwa");
				Foods carrotHalwa = new CarrotHalwa();
				System.out.println("Preparing Carrot halwa");
				CarrotHalwa carrotHalwa1 = new CarrotHalwa();
				carrotHalwa1.makeHalwa();
				System.out.println(carrotHalwa.consume());
				break;
			case 2:
				System.out.println("creating obj of carrot halwa");
				System.out.println("description of doondhihalwa");
				Foods doondhiHalwa = new DoondhiHalwa();
				System.out.println("Preparing Doondhi halwa");
				DoondhiHalwa dhoondhiHalwa = new DoondhiHalwa();
				System.out.println(doondhiHalwa.consume());
				break;
			default:
				System.out.println("Wrong option!! Please check with the chef deparment");
				break;
			}
			break;
		case "Spicy" :
			System.out.println("Do you like\n 1. Mixtures or 2. Murku ");
			int spicyItem = scanner.nextInt();
			switch(spicyItem) {
			case 1: 
				System.out.println("creating obj of mixtures");
				System.out.println("description of mixtures");
				Foods mixtures = new Mixtures();
				System.out.println("preparing mixtures");
				Mixtures mixtures1 = new Mixtures();
				System.out.println(mixtures1.consume());
				break;
			case 2:
				System.out.println("creating obj of murku");
				System.out.println("description of murku");
				Foods murku = new Murku();
				System.out.println("preparing murku");
				Murku murku1 = new Murku();
				System.out.println(murku1.consume());
				break;
			}
			break;
		default:
			System.out.println("Wrong option!!");
		}
		/*System.out.println("creating obj of carrot halwa");
		Foods carrotHalwa = new CarrotHalwa();
		
		System.out.println("creating obj of doodhi halwa");
		Foods doodhihalwa = new DoondhiHalwa();
		
		CarrotHalwa carrotHalwa1 = new CarrotHalwa();
		carrotHalwa1.makeHalwa();
		System.out.println(carrotHalwa.consume());
		
		System.out.println("creating obj of mixtures");
		Foods mixtures = new Mixtures();
		
		System.out.println("creating obj of doodhi halwa");
		Foods murku = new Murku();
		
		Mixtures mixtures1 = new Mixtures();
		mixtures1.makeKaraItem();
		System.out.println(mixtures1.consume());*/
	}

}
