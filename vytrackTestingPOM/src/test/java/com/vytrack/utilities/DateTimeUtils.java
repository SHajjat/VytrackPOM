package com.vytrack.utilities;

import org.openqa.selenium.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Random;

public class DateTimeUtils {
	
	public static boolean checkTime(String startTime,String endTime, int add){
		String hour = startTime.substring(0,startTime.indexOf(":"));
		String min = startTime.substring(startTime.indexOf(":"),startTime.indexOf(" "));
		String AmOrPm=startTime.substring(startTime.indexOf(" "));
		String reverseAmOrPm = AmOrPm.equalsIgnoreCase(" AM")?" PM":" AM";
		String newTime =Integer.parseInt(hour)+add==12?12+min+reverseAmOrPm: Integer.parseInt(hour)+add >12? Integer.parseInt(hour)+add -12+min+reverseAmOrPm
				:Integer.parseInt(hour)+add+min+AmOrPm;
		
		
		return newTime.equalsIgnoreCase(endTime);
	}
	
	public static String setDate(){
		Random random = new Random();
		String now = LocalDate.now() +"";
		String [] dateString = now.split("-");
		int year =Integer.parseInt( dateString[0]);
		int month =Integer.parseInt( dateString[1]);
		int day =Integer.parseInt( dateString[2]);
		LocalDate date = LocalDate.of(random.nextInt(100)+year,random.nextInt(12-month)+1+month,random.nextInt(Math.abs(28-day))+1);
		String senddate =date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
		return  senddate;
	}
	public static String formatDate(LocalDate date){
		return date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
		
	}
}
