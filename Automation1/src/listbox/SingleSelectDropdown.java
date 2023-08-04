package listbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectDropdown {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.facebook.com/");
	driver.findElement(By.linkText("Create new account")).click();
	
	WebElement day = driver.findElement(By.id("day"));
	Select s = new Select(day);
	s.selectByIndex(14);
	
	WebElement month = driver.findElement(By.id("month"));
	Select s1 = new Select(month);
	s1.selectByIndex(8);
	
	WebElement year = driver.findElement(By.id("year"));
	Select s2 = new Select(year);
	//s2.selectByIndex(24);
	s2.selectByValue("1999");
	//s2.selectByVisibleText("1999");
	
	Thread.sleep(5000);
	driver.close();
	
}
}
