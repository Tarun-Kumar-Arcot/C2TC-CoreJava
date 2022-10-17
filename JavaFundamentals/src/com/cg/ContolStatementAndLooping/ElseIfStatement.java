package com.cg.ContolStatementAndLooping;

import java.util.Scanner;

public class ElseIfStatement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String lang = sc.next();
		if(lang == "Python") {
			System.out.println("language is python");
		} else if(lang == "Java") {
			System.out.println("language is java");
		} else if(lang == "c++") {
			System.out.println("language");
		} else {
			System.out.println(lang);
		}
		sc.close();
	}

}
