package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class ActitimeBaseclass {
public static WebDriver driver;
	
	@BeforeSuite
	public void databaseConnection() {
		Reporter.log("database connected", true);
	}
	
	@BeforeTest
	public void launchBrowser() {
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Reporter.log("browser is launched", true);
	}
	
	@BeforeMethod
	public void login() {
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		Reporter.log("logged in successfully", true);
	}
	
//	@Test
//	public void createCustomer() {
//		Reporter.log("customer created successfully", true);
//	}
	
	@AfterMethod
	public void logout() {
		driver.findElement(By.id("logoutLink")).click();
		Reporter.log("logout successfully", true);
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.close();
		Reporter.log("browser closed successfully", true);
	}
	
	@AfterSuite
	public void databaseDisconnection() {
		Reporter.log("database disconnected", true);
	}
	
}


