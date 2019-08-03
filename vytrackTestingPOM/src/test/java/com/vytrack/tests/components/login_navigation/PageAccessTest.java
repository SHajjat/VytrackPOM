package com.vytrack.tests.components.login_navigation;
import com.vytrack.Pages.DashboardPage;
import com.vytrack.Pages.LoginPage;
import com.vytrack.utilities.ConfigurationReader;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import static com.vytrack.Pages.navigationBar.selectMenuOption;
import static com.vytrack.utilities.Utilities.waitForUIOverlay;
import static org.testng.Assert.*;

public class PageAccessTest extends LoginPage {
	
	@Test
	public void VehicleContractManagerTest(){
		LoginPage loginPage = new LoginPage();
		loginPage.login(ConfigurationReader.get("manager_username"),ConfigurationReader.get("password"));
		waitForUIOverlay();
		selectMenuOption("Fleet","Vehicle Contract");
		waitForUIOverlay();
		assertEquals(loginPage.pagename.getText(),"All Vehicle Contract");
	}
	
	@Test
	public void VehicleContractDriver(){
		
		LoginPage loginPage = new LoginPage();
		DashboardPage dashboardPage = new DashboardPage();
		SoftAssert soft = new SoftAssert();
		loginPage.login(ConfigurationReader.get("driver_username"),ConfigurationReader.get("password"));
		try {
			selectMenuOption("Fleet", "Vehicle Contract");
		}catch (Exception e){}
		waitForUIOverlay();
		soft.assertEquals(dashboardPage.errorMsg,"You do not have permission to perform this action.");
		
		
		
		
	}
}
