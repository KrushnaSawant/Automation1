package listbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class singleSelectEdureka {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.edureka.co/");
	driver.findElement(By.linkText("Corporate Training")).click();
	driver.findElement(By.xpath("//button[.='CONNECT WITH US']")).click();
	
	driver.findElement(By.xpath("(//input[@placeholder='Name'])[3]")).sendKeys("krushna");
	driver.findElement(By.xpath("(//input[@placeholder='Enter Company Name'])[3]")).sendKeys("xyz");
	driver.findElement(By.xpath("(//input[@placeholder='Email ID'])[3]")).sendKeys("abc@gmail.com");
	driver.findElement(By.xpath("(//textarea[@placeholder='Enter your Query'])[3]")).sendKeys("no query");
	driver.findElement(By.xpath("(//input[@placeholder='Phone Number'])[3]")).sendKeys("1234567890");
	
	WebElement element = driver.findElement(By.xpath("(//select[@name='learnerCount'])[3]"));
	Select s = new Select(element);
	//s.selectByIndex(2);
	//s.selectByValue("individual");
	s.selectByVisibleText("For Myself");
	
	driver.findElement(By.id("corp-talk-modal-submit")).click();
	Thread.sleep(5000);
	driver.close();
	
}
}
