package com.vytrack.utilities;

import static com.vytrack.utilities.LoginFunctionality.login;

public class TestDataSelection {
	static String user;
	public static String expectedCar;
	public static String expectedCarTitle;
	public static String expectedAccount;
	public static String expectedAccountTitle;
	public static String expectedContact;
	public static String expectedContactTitle;
	public static String expectedEvents;
	public static String expectedOpertunities;
	public static String expectedOpertunitiesTitle;
	public static String expectedActivitiesTitle;
	public static String expectedActivities;
	
	public  static void setDriverInfo() {
		expectedCar = "Cars";
		expectedCarTitle = "Car - Entities - System - Car - Entities - System";
		expectedAccount = "Accounts";
		expectedAccountTitle = "Accounts - Customers";
		expectedContact = "Contacts";
		expectedContactTitle ="Contacts - Customers";
		expectedEvents = "Calendar Events";
		
		user = "driver";
		//login(driver, user);
	}
	
	public static void setMangerInfo() {
		expectedCar = "All Cars";
		expectedCarTitle = "All - Car - Entities - System - Car - Entities - System";
		expectedAccount = "All Accounts";
		expectedAccountTitle = "All - Accounts - Customers";
		expectedContact = "All Contacts";
		expectedContactTitle ="All - Contacts - Customers";
		expectedEvents = "All Calendar Events";
		expectedOpertunities = "Open Opportunities";
		expectedOpertunitiesTitle= "Open Opportunities - Opportunities - Sales";
		expectedActivitiesTitle ="All - Calls - Activities";
		expectedActivities = "All Calls";
		
		
		user ="Store Manager";
		//login(driver, user);
	}
}
