package com.vytrack.tests.components.activities;

import com.vytrack.Pages.CalendarEvents;
import com.vytrack.Pages.LoginPage;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.Random;

import static com.vytrack.Pages.navigationBar.selectMenuOption;
import static com.vytrack.utilities.Utilities.waitForUIOverlay;

public class DailyRepeatTests extends LoginPage {
	String managerUser = ConfigurationReader.get("manager_username");
	String managerPassword = ConfigurationReader.get("password");
	LoginPage login;
	CalendarEvents calendarEvents;
	SoftAssert soft;
	WebDriverWait wait;
	private String startDate ;
	private String endDate;
	
	@BeforeMethod
	public void makingItWorkTest(){
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
	 *1) Daily repeat option, Repeat every, summary
	 * 1. Log in as Valid user
	 * 2. Go to Activities -> Calendar Events
	 * 3. Click on create new calendar event
	 * 4. Click on Repeat checkbox
	 * 5. Verify that Daily is selected by default
	 * 6. Verify day(s) checkbox is selected and default value is 1
	 * 7. Verify summary says Daily every 1 day
	 * 8. Check the weekday checkbox
	 * 9. Verify that days input now disabled
	 * 10. Verify summary says Daily every weekday
	 *
	 */
	@Test
	public void dailyRepeatTest() throws InterruptedException {
		soft = new SoftAssert();
		wait = new WebDriverWait(Driver.get(),5);
		CalendarEvents calendarEvents = new CalendarEvents();
		calendarEvents.repeat.click();
		Select select = new Select(calendarEvents.repeatsList);
		soft.assertEquals(select.getFirstSelectedOption().getText(),"Daily");
		soft.assertTrue(calendarEvents.RepeatEveryButton.isSelected());
		wait.until(ExpectedConditions.visibilityOf(calendarEvents.repeatBox));
		soft.assertEquals(calendarEvents.repeatBox.getAttribute("value"),"1");
		soft.assertEquals(calendarEvents.summary.getText(),"Daily every 1 day");
		calendarEvents.RepeatWeekdayButton.click();
		soft.assertFalse(calendarEvents.repeatBox.isEnabled());
		soft.assertEquals(calendarEvents.summary.getText(),"Daily, every weekday");
		soft.assertAll();
	}
	
	/**
	 *2) Daily repeat option, Repeat every, default values
	 * 1. Log in as Valid user
	 * 2. Go to Activities -> Calendar Events
	 * 3. Click on create new calendar event
	 * 4. Click on Repeat checkbox
	 * 5. Verify that Daily is selected by default
	 * 6. Verify day(s) checkbox is selected and default value is 1
	 * 7. Verify summary says Daily every 1 day
	 */
	@Test
	public void repeateveryDefaultValuesTest(){
		soft = new SoftAssert();
		CalendarEvents calendarEvents = new CalendarEvents();
		calendarEvents.repeat.click();
		soft.assertEquals(calendarEvents.repeatBox.getAttribute("value"),"1");
		soft.assertEquals(calendarEvents.summary.getText(),"Daily every 1 day");
		soft.assertAll();
		
	}
	
	/**
	 * 3) Daily repeat option, Repeat every day(s), error messages
	 * 1. Log in as Valid user
	 * 2. Go to Activities -> Calendar Events
	 * 3. Click on create new calendar event
	 * 4. Click on Repeat checkbox
	 * 5. Test the day(s) input entering different values (boundary value analysis)
	 * 6. Verify error messages The value have not to be less than 1. and The value have not to be
	 * more than 99. occur when values are too big or small
	 * 7. Verify that error messages disappear when valid values are entered
	 */
	@Test
	public void daysInputBoundaryTest(){
		soft = new SoftAssert();
		Random random = new Random();
		WebDriverWait wait = new WebDriverWait(Driver.get(),5);
		CalendarEvents calendarEvents = new CalendarEvents();
		calendarEvents.repeat.click();
		wait.until(ExpectedConditions.visibilityOf(calendarEvents.repeatBox));
		calendarEvents.repeatBox.sendKeys((random.nextInt(100)+99)+""+Keys.ENTER);
		soft.assertEquals(calendarEvents.errorMsgOverLimitDays.getText(),"The value have not to be more than 99.");
		//calendarEvents.repeatBox.clear();
		calendarEvents.repeatBox.sendKeys((random.nextInt(100)*-1)+""+Keys.ENTER);
		soft.assertEquals(calendarEvents.errorMsgOverLimitDays.getText(),"The value have not to be less than 1.");
		soft.assertAll();
		
	}
	
	
}
