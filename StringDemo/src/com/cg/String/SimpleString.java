package com.cg.String;

public class SimpleString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c[] = {'J','A','V','A'};
		String S1 = new String(c);
		
		System.out.println(S1);
		
		String sentence = "Welcome to session. " + "The session begins at 10:30 A M. " + "We are learning string class and in built methods.";
		System.out.println(sentence);
		
		String name1 = "Tarun ";
		String name2 = "Kumar ";
		String name3 = "Arcot ";
		String storedName = name1.concat(name2.concat(name3));
		System.out.println(storedName);
	}

}
