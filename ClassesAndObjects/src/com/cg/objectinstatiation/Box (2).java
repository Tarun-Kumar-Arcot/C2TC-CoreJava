package com.cg.objectinstatiation;

public class Box {
	double length;
	double breadth;
	double height;
	public Box() {
		super();
	}
	
	public Box(double length,double breadth, double height) {
		super();
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}
	double calculateVolume() {
		return length*breadth*height;
	}
	public static void main(String[] args) {
		Box box1 = new Box();
		System.out.println(box1.calculateVolume());
		
		Box box2 =  new Box(10,20,30);
		System.out.println(box2.calculateVolume());
	}

}
