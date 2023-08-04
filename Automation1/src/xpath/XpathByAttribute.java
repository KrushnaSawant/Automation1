package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAttribute{
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	Thread.sleep(3000);
    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
    Thread.sleep(3000);
    driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
    Thread.sleep(3000);
    driver.findElement(By.xpath("//input[@value='on']")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//div[text()='Login ']")).click();
    Thread.sleep(5000);
    driver.close();
    
}
}
