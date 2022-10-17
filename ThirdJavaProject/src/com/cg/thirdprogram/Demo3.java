package com.cg.thirdprogram;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long salary = sc.nextLong();
		double tax;
		
		if(salary > 10_00_000 && salary < 50_00_000) {
			tax = 0.30*salary;
			System.out.println("Tax(salary between 10 lakhs to 50 lakhs)= "+ tax);
		} else if(salary > 50_00_000) {
			tax = 0.20*50_00_000;
			System.out.println("Tax(Salary greater than 50 lakhs)= "+ tax);
		} else {
			tax = 0.50*salary;
			System.out.println("Tax(Salary having less than 10 lakhs )= "+ tax);
		}
		
		
	}

}
/*
 Tax for an employee is based on the following constraints,
 1. If the salary is greater than 10,00,000 per annum, the tax is 30%
 2. If the salary is greater than 50,00,000 per annum, the tax is 20 %
 3. In other cases tax is 50%.
 
 Note housing loan emi and education loan emi should be considered and can be detected from salary before calculating
 tax
 */