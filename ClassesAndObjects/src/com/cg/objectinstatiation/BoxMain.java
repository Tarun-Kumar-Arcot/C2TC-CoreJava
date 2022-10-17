/*Default constructor*/
package com.cg.objectinstatiation;

public class BoxMain {
	double width;
	double length;
	double depth;
	public static void main(String[] args) {
		// constructor call
		BoxMain mybox1 = new BoxMain();
		BoxMain mybox2 = new BoxMain();
		double vol;
		
		// assign values to mybox1 instance variables
		mybox1.width = 10;
		mybox1.length = 20;
		mybox1.depth = 30;
		
		// assign values to mybox2 instance variables
		mybox2.width = 3;
		mybox2.length = 6;
		mybox2.depth = 9;
		
		//compute volume of first box
		vol = mybox1.width * mybox1.length * mybox1.depth;
		System.out.println("Volume of box1 is "+ vol);
		
		// compute volume of second box
		vol = mybox2.width * mybox2.length * mybox2.depth;
		System.out.println("Volume of box2 is "+ vol);
	}

}
