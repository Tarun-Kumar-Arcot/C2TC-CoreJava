package com.cg.datetimeexample;

/** Display ofPattern()
 * Class                 Description

 * LocalDate             Represents a date (year, month, day(yyyy-MM-dd))
 * LocalTime             Represents a time (hour, minute, second and milliseconds (HH-mm-ss.zzz))
 * LocalDateTime         Represents both a date and a time (yyyy-MM-dd-HH-mm-ss.zzz )
 * DateTimeFormatter     Formatter for displaying and parsing date-time objects
 */

import java.time.LocalDate; 
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class MyDateTimeFormatter {

	public static void main(String[] args) {
		// LocalDate
		System.out.println("----LocalDate-----");
		LocalDate myobj1 = LocalDate.now(); 
		System.out.println(myobj1);
		
		//LocalTime
		System.out.println("-----LocalTime-----");
		LocalTime myobj2 = LocalTime.now();
		System.out.println(myobj2);
		
		//LocalDateTime
		System.out.println("-----LocalDateTime-----");
		LocalDateTime myobj3 = LocalDateTime.now();
		System.out.println(myobj3);
		
		//DateTimeFormatter --> dd-MM-yyyy HH:mm:ss 
		//The "T" in the example above is used to separate the date from the time
		System.out.println("-----Date Time Formatter (dd-MM-yyyy HH:mm:ss)------");
		System.out.println("Before formatting :"+myobj3);
		DateTimeFormatter myFormatObj1 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formattedDate1 = myobj3.format(myFormatObj1);
		System.out.println("After formatting :"+ formattedDate1);
		
		//DateTimeFormatter --> dd/MM/yyyy HH:mm:ss
		System.out.println("-----Date Time Formatter (dd/MM/yyyy HH:mm:ss)------");
		System.out.println("Before formatting :"+myobj3);
		DateTimeFormatter myFormatObj2 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formattedDate2 = myobj3.format(myFormatObj2);
		System.out.println("After formatting :"+ formattedDate2);
		
		//DateTimeFormatter --> dd-MMM-yyyy HH:mm:ss 
		System.out.println("-----Date Time Formatter (dd-MMM-yyyy HH:mm:ss)------");
		System.out.println("Before formatting :"+myobj3);
		DateTimeFormatter myFormatObj3 = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss");
		String formattedDate3 = myobj3.format(myFormatObj3);
		System.out.println("After formatting :"+ formattedDate3);
		
		// DateTimeFormatter --> E,MMM dd yyyy HH:mm:ss
		System.out.println("-----Date Time Formatter (E,MMM dd yyyy HH:mm:ss)------");
		System.out.println("Before formatting :"+myobj3);
		DateTimeFormatter myFormatObj4 = DateTimeFormatter.ofPattern("E,MMM dd yyyy HH:mm:ss");
		String formattedDate4 = myobj3.format(myFormatObj4);
		System.out.println("After formatting :"+ formattedDate4);
	}

}
