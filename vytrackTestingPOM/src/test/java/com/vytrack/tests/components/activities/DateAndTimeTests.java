package com.vytrack.tests.components.activities;

import com.vytrack.Pages.CalendarEvents;
import com.vytrack.Pages.LoginPage;
import com.vytrack.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.awt.event.KeyEvent;
import java.rmi.server.ExportException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;

import static com.vytrack.Pages.navigationBar.selectMenuOption;
import static com.vytrack.utilities.DateTimeUtils.*;
import static com.vytrack.utilities.Utilities.waitForUIOverlay;

public class DateAndTimeTests extends LoginPage {
	String managerUser = ConfigurationReader.get("manager_username");
	String managerPassword = ConfigurationReader.get("password");
	LoginPage login;
	CalendarEvents calendarEvents;
	SoftAssert soft;
	private String startDatestr ;
	private String endDatestr;
	
	@BeforeMethod
	public void makingItWork(){
		login = new LoginPage();
		calendarEvents = new CalendarEvents();
		login.login(managerUser,managerPassword);
		
		waitForUIOverlay();
		selectMenuOption("Activities","Calendar Events");
		waitForUIOverlay();
        calendarEvents.createCalendarEvents.click();
		waitForUIOverlay();
	}
	/**
	 * this method test the effect of changing start date to future date and the effect on end date
	 * Test case 1 :
	 * 1) Date Time, End date auto adjust
	 * 1. Log in as Valid user
	 * 2. Go to Activities -> Calendar Events
	 * 3. Click on create new calendar event
	 * 4. Change the start date to future date
	 * 5. Verify that end date changes to the same date
	 * 6. Change back the start date to today’s date
	 * 7. Verify that end date changes back to today’s date
	 */
	
	@Test
	public void verifingDate() throws InterruptedException {
		 calendarEvents = new CalendarEvents();
		soft = new SoftAssert();
		wait = new WebDriverWait(Driver.get(),5);
		calendarEvents.startDate.clear();
		calendarEvents.startDate.sendKeys(setDate()+ Keys.ENTER);
		startDatestr = calendarEvents.startDate.getAttribute("value");
		endDatestr = calendarEvents.endDate.getAttribute("value");
		soft.assertEquals(endDatestr,startDatestr);
		calendarEvents.today.click();
		calendarEvents.today.click();
		startDatestr = calendarEvents.startDate.getAttribute("value");
		String startDateNow =formatDate(LocalDate.now());
		soft.assertEquals(startDateNow,startDatestr);
		soft.assertAll();
	}
	/**
	 * this method test the effect of changing time in activities > calender model
	 * Test case 2 :
	 * 2) Date Time, End time auto adjust
	 * 1. Log in as Valid user
	 * 2. Go to Activities -> Calendar Events
	 * 3. Click on create new calendar event
	 * 4. Change the start time to any other time
	 * 5. Verify that end time changes exactly 1 hours later
	 */
	@Test
	public void verifingTimeRandom(){
		 calendarEvents = new CalendarEvents();
		soft = new SoftAssert();
		waitForUIOverlay();
		calendarEvents.startTime.click();
		calendarEvents.getTimes().get(new Random().nextInt(48)).click();
		String start= calendarEvents.startTime.getAttribute("value");
		String end= calendarEvents.endTime.getAttribute("value");
		soft.assertTrue(checkTime(start,end,1));
		soft.assertAll();
	}
	
	/**
	 *3) Date Time, End date/time auto adjust
	 * 1. Log in as Valid user
	 * 2. Go to Activities -> Calendar Events
	 * 3. Click on create new calendar event
	 * 4. Change the start time to 11.30 PM
	 * 5. Verify that end date shows tomorrows date
	 * 6. Verify that end time is 12:30 AM
	 *
	 */
	
	@Test
	public void verifingTimeSet() throws ParseException {
		calendarEvents = new CalendarEvents();
		soft = new SoftAssert();
		waitForUIOverlay();
		calendarEvents.startTime.click();
		calendarEvents.getTimes().get(47).click();
		String startTime= calendarEvents.startTime.getAttribute("value");
		String endTime= calendarEvents.endTime.getAttribute("value");
		String startDateStr= calendarEvents.startDate.getAttribute("value");
		String endDateStr= calendarEvents.endDate.getAttribute("value");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM d, yyyy");
		LocalDate startDate = LocalDate.parse(startDateStr,formatter);
		LocalDate endDate = LocalDate.parse(endDateStr,formatter);
		soft.assertTrue(checkTime(startTime,endTime, 1));
		soft.assertEquals(startDate.plusDays(1),endDate);
		soft.assertAll();
	}
	
	
	
	
	
}

