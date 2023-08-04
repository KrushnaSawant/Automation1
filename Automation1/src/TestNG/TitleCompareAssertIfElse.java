package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TitleCompareAssertIfElse {
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
	if (expectedTitle.equals(actualTitle)) {
		Reporter.log("title is matching", true);
	} else {
		Reporter.log("title is not matching", true);

	}
	
	driver.close();
}
}
