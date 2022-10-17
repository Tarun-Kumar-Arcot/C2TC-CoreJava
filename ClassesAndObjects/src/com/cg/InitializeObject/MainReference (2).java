package com.cg.InitializeObject;
/*
 * Using reference variable 
 */
public class MainReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentReference s1 = new StudentReference();
		s1.id = 101;
		s1.name = "Tarun";
		/**
		 * obj.referenced_variable
		 */
		System.out.println(s1.id+ " " + s1.name);
	}

}
