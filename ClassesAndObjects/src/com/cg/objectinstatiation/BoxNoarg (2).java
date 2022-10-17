package com.cg.objectinstatiation;

public class BoxNoarg {
	int length;
	int width;
	int depth;
	BoxNoarg() {
		System.out.println("No argument Constructor called");
		length = 20;
		width = 30;
		depth = 40;
	}
	public static void main(String[] args) {
		BoxNoarg obj = new BoxNoarg();
		double vol = obj.length * obj.width * obj.depth;
		System.out.println(vol);
	}

}
