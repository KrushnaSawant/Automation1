package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TitleCompareSoftAssert {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
@Test
public void titlecompare() {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	String expectedTitle = "Soogle";
	String actualTitle = driver.getTitle();
	SoftAssert s = new SoftAssert();
	s.assertEquals(actualTitle, expectedTitle);
	
	driver.close();
	s.assertAll();
			
}
}
