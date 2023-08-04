package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartSuggestion {
static {
	System .setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.name("q")).sendKeys("iphone 13");
	List<WebElement> sugg = driver.findElements(By.xpath("//div[@class='lrtEPN _17d0yO']"));
	  int count = sugg.size();
	  System.out.println(count);
	  for (int i = 0; i < count; i++) {
		String allsugg = sugg.get(i).getText();
		System.out.println(allsugg);
	}
	  driver.close();
	
}
}
