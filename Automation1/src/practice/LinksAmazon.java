package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksAmazon {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver .manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.amazon.in/");
	List<WebElement> links = driver.findElements(By.xpath("//a"));
	int count = links.size();
	System.out.println(count);
	for (int i = 0; i < count; i++) {
		String alllinks = links.get(i).getText();
		System.out.println(alllinks);	
	}
	driver.close();
}

}
