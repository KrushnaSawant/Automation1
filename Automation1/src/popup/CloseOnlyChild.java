package popup;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseOnlyChild {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://demoqa.com/browser-windows");
	String pwin = driver.getWindowHandle();
	
	driver.findElement(By.id("windowButton")).click();
	driver.findElement(By.id("windowButton")).click();
	driver.findElement(By.id("windowButton")).click();
	
	Set<String> allwinid = driver.getWindowHandles();
	for (String win : allwinid) {
		if (!(pwin.equals(win))) {
			driver.switchTo().window(win);
			Thread.sleep(2000);
			driver.close();
		}
		
	}
	
}
}
