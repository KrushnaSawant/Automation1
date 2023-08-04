package popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalenderPopup {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
	
	driver.findElement(By.id("policynumber")).sendKeys("123");
	driver.findElement(By.id("dob")).click();
	
	WebElement element = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
	Select s = new Select(element);
	s.selectByVisibleText("Oct");
	
	WebElement element1 = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
	Select s1 = new Select(element1);
	s1.selectByValue("2001");
	
	driver.findElement(By.linkText("27")).click();
	
	Thread.sleep(5000);
	driver.close();
	
	
}
}
