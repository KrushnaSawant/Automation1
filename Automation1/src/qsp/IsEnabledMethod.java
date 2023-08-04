package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethod {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.facebook.com/");
	boolean button = driver.findElement(By.name("login")).isEnabled();
	if (button==true) {
		System.out.println("button is clickable");
	} else {
		System.out.println("button is not clickable");
	}
	driver.close();
	
}
}
