package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver(); 
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Krushna%20Sawant/Desktop/webpage.html");
	driver.findElement(By.tagName("a")).click();
	Thread.sleep(5000);
	driver.close();
	
}
}
