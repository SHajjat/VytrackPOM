package com.vytrack.Pages;

import com.vytrack.utilities.Driver;
import com.vytrack.utilities.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase{
	public LoginPage() {
		PageFactory.initElements(Driver.get(), this);
	}
	
	@FindBy(id = "prependedInput")
	public WebElement username;
	@FindBy(id = "prependedInput2")
	public WebElement password;
	
	@FindBy (css = ".alert.alert-error")
	public WebElement invalidUser;
	
	@FindBy(id = "_submit")
	public WebElement submitBtn;
	@FindBy(className = "custom-checkbox__icon")
	public WebElement checkbox;
	@FindBy(linkText = "Forgot your password?")
	public WebElement forgotPw;
	@FindBy(className = "oro-subtitle")
	public WebElement pagename;

	public void login(String usernameStr, String passwordStr) {
		username.sendKeys(usernameStr);
		password.sendKeys(passwordStr);
		submitBtn.click();
	}
	
}