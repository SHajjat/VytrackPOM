package com.vytrack.tests.smoke_tests;

import com.vytrack.Pages.LoginPage;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.TestBase;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static com.vytrack.Pages.navigationBar.selectMenuOption;
import static com.vytrack.utilities.Data.*;
import static com.vytrack.utilities.Utilities.waitForUIOverlay;

public class MenuOptionsTest extends TestBase {
	String usernameDriver = ConfigurationReader.get("driver_username");
	String passwordDriver = ConfigurationReader.get("password");
	String usernameManager = ConfigurationReader.get("manager_username");
	String passwordManager = ConfigurationReader.get("password");
	
	SoftAssert s = new SoftAssert();
	WebDriverWait wait;
	
	
	@Test
	public void menuOptionsDriver() {
		LoginPage login = new LoginPage();
		login.login(usernameDriver, passwordDriver);
		waitForUIOverlay();
		selectMenuOption("Fleet", "Vehicles");
		s.assertEquals(driver.getTitle(), getVehiclesTitle());
		s.assertEquals(login.pagename.getText(), getVehiclesName());
		waitForUIOverlay();
		selectMenuOption("Customers", "Accounts");
		s.assertEquals(driver.getTitle(), getAccountsTitle());
		s.assertEquals(login.pagename.getText(), getAccountsName());
		waitForUIOverlay();
		selectMenuOption("Customers", "Contacts");
		s.assertEquals(driver.getTitle(), getContactsTitle());
		s.assertEquals(login.pagename.getText(), getContactsName());
		waitForUIOverlay();
		selectMenuOption("Activities", "Calendar Events");
		s.assertEquals(driver.getTitle(), getActivitiesTitle());
		s.assertEquals(login.pagename.getText(), getActivitiesName());
		s.assertAll();
	}
	
	@Test
	public void menuOptionsManager() {
		wait = new WebDriverWait(driver, 5);
		LoginPage login = new LoginPage();
		login.login(usernameManager, passwordManager);
		waitForUIOverlay();
		selectMenuOption("Dashboards", "Dashboard");
		wait.until(ExpectedConditions.titleContains("-"));
		s.assertEquals(driver.getTitle(), "Dashboard - Dashboards");
		s.assertEquals(login.pagename.getText(), "Dashboard");
		selectMenuOption("Fleet", "Vehicles");
		wait.until(ExpectedConditions.titleContains("All"));
		s.assertEquals(driver.getTitle(), "All - " + getVehiclesTitle());
		s.assertEquals(login.pagename.getText(), "All " + getVehiclesName());
		wait.until(ExpectedConditions.titleContains("All"));
		selectMenuOption("Customers", "Accounts");
		s.assertEquals(driver.getTitle(), "All - " + getAccountsTitle());
		s.assertEquals(login.pagename.getText(), "All " + getAccountsName());
		selectMenuOption("Customers", "Contacts");
		wait.until(ExpectedConditions.titleContains("All"));
		s.assertEquals(driver.getTitle(), "All - " + getContactsTitle());
		s.assertEquals(login.pagename.getText(), "All " + getContactsName());
		waitForUIOverlay();
		selectMenuOption("Activities", "Calendar Events");
		wait.until(ExpectedConditions.titleContains("All"));
		s.assertEquals(driver.getTitle(), "All - " + getActivitiesTitle());
		s.assertEquals(login.pagename.getText(), "All " + getActivitiesName());
		selectMenuOption("Sales", "Opportunities");
		wait.until(ExpectedConditions.titleContains("Open Opportunities"));
		s.assertEquals(driver.getTitle(), getOpportunitiesTitle());
		s.assertEquals(login.pagename.getText(), getOpportunitiesName());
		selectMenuOption("Activities", "Calls");
		wait.until(ExpectedConditions.titleContains("All"));
		s.assertEquals(driver.getTitle(), getCallsTitle());
		s.assertEquals(login.pagename.getText(), getCallsName());
		s.assertAll();
	}

}
