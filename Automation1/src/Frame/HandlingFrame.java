package Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrame {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Krushna%20Sawant/Desktop/Page1.html");
	driver.findElement(By.id("abc")).sendKeys("QSP");
	
	driver.switchTo().frame(0);
	driver.findElement(By.id("xyz")).sendKeys("JSP");
	
	driver.switchTo().parentFrame();
	driver.findElement(By.id("abc")).sendKeys(" training");
	
	Thread.sleep(5000);
	driver.close();
	
	
}
}
