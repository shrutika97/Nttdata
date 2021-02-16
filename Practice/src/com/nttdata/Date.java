package com.nttdata;

import java.time.LocalDateTime;
import java.time.chrono.JapaneseDate;
import java.time.chrono.ThaiBuddhistDate;
import java.time.format.*;

public class Date {
	
	public static void main(String[] args) {
		
		demo_Date();
	}
	public static void demo_Date() {
		
		LocalDateTime mydate=LocalDateTime.now();
		System.out.println("The date right now is(Gregorian without formatting): "+ mydate);
		
		String mydate1=mydate.format(DateTimeFormatter.ISO_DATE_TIME);
		System.out.println("The date right now is(Gregorian with formatting ISO format): "+ mydate1);
		
		String mydate2=mydate.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
		System.out.println("The date right now is(Gregorian with formatting medium format): "+ mydate2);
		
//		JapaneseDate jDate=JapaneseDate.from(mydate);
//		System.out.println("The date right now is(Japanese)"+ jDate);
//
//		ThaiBuddhistDate tDate=ThaiBuddhistDate.from(mydate);
//		System.out.println("The date right now is(Thai): "+ tDate);


//		System.out.println("The hour right now is: "+ mydate.getHour());
//		System.out.println("The day right now is: "+ mydate.getDayOfMonth());
//		System.out.println("The minute right now is: "+ mydate.getMinute());
//		System.out.println("The date before 5 days from right now is: "+ mydate.minusDays(5));
//		System.out.println("The year right now is: "+ mydate.getYear());
	}
}
