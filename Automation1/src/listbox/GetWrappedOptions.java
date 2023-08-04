package listbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetWrappedOptions {
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
	String options = s.getWrappedElement().getText();
	System.out.println(options);
	
	Thread.sleep(5000);
	driver.close();
}
}
