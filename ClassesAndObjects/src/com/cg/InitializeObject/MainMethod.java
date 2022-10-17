package com.cg.InitializeObject;

public class MainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentMethod s1 = new StudentMethod();
		StudentMethod s2 = new StudentMethod();
		
		s1.insertRecord(111, "Karan");
		s2.insertRecord(222, "Aryan");
		s1.displayInformation();
		s2.displayInformation();
	}

}
