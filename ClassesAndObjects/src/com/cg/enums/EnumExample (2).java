package com.cg.enums;

enum Months {
	Jan(31),Feb(28),Mar(31),Apr(30),May(31),Jun(30),July(31),Aug(31),Sep(30),Oct(31),Nov(30),Dec(31);
	
	//attribute to hold the no of days
	private int days;
	
	// constructor will accept the no of days in the months
	Months(int days){
		this.days = days;
	}
	//return the no of days
	public int getDays() {
		return days;
	}
}

public class EnumExample {

	public static void main(String[] args) {
		System.out.println("Days in the month of November are: " + Months.Nov.getDays());
		System.out.println("Days in the month of November are: " + Months.Feb.getDays());
	}
	
}
