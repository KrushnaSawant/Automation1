package MouseActions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
static {
	System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	
	WebElement click = driver.findElement(By.xpath("//button[.='Double-Click Me To See Alert']"));
	Actions a = new Actions(driver);
	a.doubleClick(click).perform();
	Thread.sleep(3000);
	
	driver.switchTo().alert().accept();
	
	//Alert al = driver.switchTo().alert();
	//al.accept();
	
	Thread.sleep(3000);
	driver.close();
	
}
}
