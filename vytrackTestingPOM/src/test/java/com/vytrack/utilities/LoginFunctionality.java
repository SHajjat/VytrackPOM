package com.vytrack.utilities;

import org.openqa.selenium.*;

import static com.vytrack.utilities.Data.*;
import static com.vytrack.utilities.Sleep.sleep;
import static org.testng.AssertJUnit.assertEquals;

public class LoginFunctionality {
	static String  location;
	public static void login(WebDriver driver,String user) {
////		driver.get(getLoginPage());
////		location = driver.getCurrentUrl();
////		if (!location.equals(getLoginPage())) logout(driver);
////		WebElement userName = driver.findElement(By.id("prependedInput"));
////		WebElement password = driver.findElement(By.id("prependedInput2"));
////		userName.clear();
////		password.clear();
////		userName.sendKeys(getUser(user));
////		password.sendKeys(getPassword()+Keys.ENTER);
////		sleep(4);
////		location = driver.getCurrentUrl();
////		assertEquals(location,getHomePage());
//	}
//	public static void logout(WebDriver driver){
//		sleep(2);
//		driver.findElement(By.className("dropdown-toggle")).click();
//		driver.findElement(By.linkText("Logout")).click();
//		assertEquals(driver.getCurrentUrl(),getLoginPage());
//	}
//
//
//	public static void login(WebDriver driver,String user , String pass){
//		driver.get(getLoginPage());
//		sleep(2);
//		location = driver.getCurrentUrl();
//		if (!location.equals(getLoginPage())) logout(driver);
//		WebElement userName = driver.findElement(By.id("prependedInput"));
//		WebElement password = driver.findElement(By.id("prependedInput2"));
//		userName.sendKeys(getUser(user));
//		password.sendKeys(pass+Keys.ENTER);
//		sleep(4);
//	}
	
	}}
