package com.vytrack.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends LoginPage{

	@FindBy (xpath = "(//div[@class='message'])[2]")
	public WebElement errorMsg;
	
}
