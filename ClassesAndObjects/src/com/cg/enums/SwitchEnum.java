/*
 * Demo on switch case and enum 
 * */

package com.cg.enums;

public class SwitchEnum {
	enum Choice{
		Choice1,Choice2,Choice3
	}
	public static void main(String[] args) {
		Choice ch = Choice.Choice2;
		switch(ch) {
		case Choice1 :
			System.out.println("choice1 is choosen");
			break;
		case Choice2:
			System.out.println("choice2 is chosen ");
			break;
		case Choice3:
			System.out.println("choice3 is chosen ");
			break;
		default:
			System.out.println("No choice taken");
			break;
		}
	}

}
