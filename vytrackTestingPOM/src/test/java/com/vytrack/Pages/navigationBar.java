package com.vytrack.Pages;

import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class navigationBar extends LoginPage {
	
	
	@FindBy (id ="user-menu")
	public WebElement userName;
	
	@FindBy (id ="user-menu")
	public WebElement userDropDown;
	
	@FindBy (linkText = "My User")
	public WebElement MyUser;
	
	@FindBy (linkText = "My Configuration")
	public WebElement MyConfiguration;
	
	@FindBy (linkText = "My Calendar")
	public WebElement MyCalendar;
	
	@FindBy (linkText = "Logout")
	public WebElement logout;
	
	
	public static void selectMenuOption(String tab, String module)  {
		WebDriver driver = Driver.get();
		String tabXpath = "//span[@class='title title-level-1' and contains(text(), '"+tab+"')]";
		WebElement tabEl = driver.findElement(By.xpath(tabXpath));
		BrowserUtils.hover(tabEl);
		
		String moduleXpath = "//span[@class='title title-level-2' and contains(text(), '"+module+"')]";
		WebElement moduleEl = driver.findElement(By.xpath(moduleXpath));
		BrowserUtils.waitForClickablility(moduleEl, 5).click();
		if(module.equals("Vehicles")){
			module= "Car";
		}
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.titleContains(module));
	}
	
}
