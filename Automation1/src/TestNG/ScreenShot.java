package TestNG;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShot {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws IOException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	TakesScreenshot t = (TakesScreenshot) driver;
	File src = t.getScreenshotAs(OutputType.FILE);
	File dest = new File("./ScreenShot/dhoni.png");
	Files.copy(src, dest);
	driver.close();
	
}
}
