package listbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectListbox {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("file:///C:/Users/Krushna%20Sawant/Desktop/Rolex%20Hotel.html");
	
	WebElement element = driver.findElement(By.id("doremon"));
	Select s = new Select(element);
	s.selectByValue("br");
	Thread.sleep(3000);
	s.selectByVisibleText("chana koli vada");
	Thread.sleep(3000);
	s.selectByIndex(3);
	Thread.sleep(3000);
	s.selectByValue("lp");
	Thread.sleep(3000);
	
	//s.deselectByIndex(3);
	s.deselectAll();
	Thread.sleep(3000);
	
	driver.close();
}
}
