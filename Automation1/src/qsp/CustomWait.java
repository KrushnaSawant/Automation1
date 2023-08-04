package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomWait {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
    driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
    driver.findElement(By.xpath("//input[@value='on']")).click();
    driver.findElement(By.xpath("//div[text()='Login ']")).click();
	
    int i=0;
	while (i<500) {
    	try {
    		driver.findElement(By.id("logoutLink")).click();
		break;
    	} 
    	catch (Exception e) {
			i++;
		}	
	}
 
	//Thread.sleep(5000);
	driver.close();

}
}

