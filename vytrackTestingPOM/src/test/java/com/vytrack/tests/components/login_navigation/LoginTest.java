package com.vytrack.tests.components.login_navigation;

import com.github.javafaker.Faker;
import com.vytrack.Pages.LoginPage;
import com.vytrack.Pages.navigationBar;
import com.vytrack.utilities.ConfigurationReader;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import java.util.*;
import static com.vytrack.utilities.Utilities.waitForUIOverlay;

public class LoginTest extends LoginPage {
	String[] userNames = {ConfigurationReader.get("driver_username"), ConfigurationReader.get("manager_username"),
			ConfigurationReader.get("sales_user")};
	List<String> names = new ArrayList<>();
	String[] expected = {"Quick Launchpad", "Dashboard", "Dashboard"};
	String password = ConfigurationReader.get("password");
	SoftAssert soft;
	LoginPage loginPage;
	navigationBar navigationBar;
	Faker faker ;
	
	@Test
	public void positiveLoginTest() {
		loginPage= new LoginPage();
		navigationBar = new navigationBar();
		soft = new SoftAssert();
		for ( int i = 0; i < 3; i++ ) {
			loginPage.login(userNames[i],password);
			waitForUIOverlay();
			soft.assertEquals(loginPage.pagename.getText(), expected[i]);
			String tempName = navigationBar.userName.getText();
			soft.assertFalse(names.contains(tempName));
			names.add(navigationBar.userName.getText());
			navigationBar.userDropDown.click();
			navigationBar.logout.click();
		}
		soft.assertAll();
		
	}
	
	@Test
	public void negativeLoginTest(){
		faker = new Faker();
		loginPage = new LoginPage();
		soft =new SoftAssert();
		loginPage.login(userNames[new Random().nextInt(3)],faker.chuckNorris().fact().trim().replace(" ",""));
		soft.assertEquals(loginPage.invalidUser.getText(),"Invalid user name or password.");
		soft.assertTrue(driver.getCurrentUrl().contains(driver.getTitle().toLowerCase()));
		soft.assertAll();
	}
	
	
}
