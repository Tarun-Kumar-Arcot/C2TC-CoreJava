package com.cg.MovieTicket;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String title = scanner.nextLine();
		MyMovie m = new MyMovie();
		m.setTitle(title);
		System.out.println("The title is: "+m.getTitle());
		scanner.close();
	}

}
