package com.cg.fundamentals;
class Company {

	  String name;

	    public static void main(String[] args) {

	  Company c = new Company();

	  Company c1 = c;

	  c1.name = "C2TC";

	  c = null;

	  System.out. println(c.name);

	}

	}