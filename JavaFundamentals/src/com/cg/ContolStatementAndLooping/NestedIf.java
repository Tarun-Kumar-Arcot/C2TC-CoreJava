package com.cg.ContolStatementAndLooping;

public class NestedIf {

	public static void main(String[] args) {
		String lang = "Java";
		if(lang== "HLL & IL") {
			if(lang=="Python")
				System.out.println("language is python");
		} else if(lang == "Java") {
			System.out.println("language is java");
		} else if(lang == "c++") {
			System.out.println("language");
		} else {
			System.out.println(lang);
		}
	}

}
