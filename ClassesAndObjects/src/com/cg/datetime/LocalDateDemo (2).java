package com.cg.datetime;

import java.time.LocalDate;
import java.time.Month;

/**
* This program demonstrates on use of LocalDate class
*
*/
public class LocalDateDemo {

	public static void main(String[] args) {
			LocalDate currentDate = LocalDate.now();
				LocalDate independanceDay = LocalDate.of(1947,Month.AUGUST,15);
				System.out.println("Independance:"+ independanceDay);
				System.out.println("Today:"+ currentDate);
				System.out.println("Tomorrow:"+ currentDate.minusDays(1));
				System.out.println("Last Month:"+currentDate.plusMonths(1));
				System.out.println("Is Leap?:"+ currentDate.isLeapYear());
				System.out.println("Number of days in this month:"+ currentDate.lengthOfMonth());
				
			}
		

	}


