package com.vytrack.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;


public  abstract class TestBase {
	protected  WebDriver driver;
	protected Actions actions;
	protected WebDriverWait wait;
	@BeforeMethod
	public void setup(){
		driver = Driver.get();
		actions = new Actions(driver);
		wait = new WebDriverWait(driver,7);
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.get(ConfigurationReader.get("url"));
		
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(1000);
		//logout(driver);
		Driver.closeDriver();
	}
}
