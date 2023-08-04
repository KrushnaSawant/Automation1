package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContains {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	//Thread.sleep(5000);
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	driver.findElement(By.name("q")).sendKeys("hp laptop");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(5000);
	 String text = driver.findElement(By.xpath("//div[contains(text(),'HP 14s Intel Core i3 11th Gen - (8 GB/512 GB SSD')]")).getText();
	System.out.println(text);
	//Thread.sleep(5000);
	driver.close();
	
}

}
