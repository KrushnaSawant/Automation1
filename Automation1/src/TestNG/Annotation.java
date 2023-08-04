package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation {

	@Test
	public void CreateCustomer() {
		Reporter.log("customer created successfully", true);
	}
	
	@AfterSuite
	public void databaseDisconnetion() {
		Reporter.log("database disconnected", true);
	}
	
	@BeforeTest
	public void launchBrowser() {
		Reporter.log("browser is launched", true);
	}
	
	@AfterMethod
	public void logout() {
		Reporter.log("logout successfully", true);
	}
	
	@BeforeMethod
	public void login() {
		Reporter.log("logged in successfully", true);
	}
	
	@AfterTest
	public void closeBrowser() {
		Reporter.log("browser closed successfully", true);
	}
	
	@BeforeSuite
	public void databaseConnection() {
		Reporter.log("database connected", true);
	}
	
}
