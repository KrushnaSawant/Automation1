package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextFacebook {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.linkText("Create new account")).click();
	Thread.sleep(3000);
	driver.findElement(By.name("firstname")).sendKeys("Krushna");
	driver.findElement(By.name("lastname")).sendKeys("Sawant");
	driver.findElement(By.name("reg_email__")).sendKeys("9372073912");
	driver.findElement(By.name("reg_passwd__")).sendKeys("123456");
	driver.findElement(By.name("birthday_day")).sendKeys("17");
	Thread.sleep(5000);
	driver.close();
}
}
