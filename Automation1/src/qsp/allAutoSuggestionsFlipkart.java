package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class allAutoSuggestionsFlipkart {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(3000);
	driver.findElement(By.name("q")).sendKeys("iphone 14");
	Thread.sleep(3000);
	List<WebElement> allSugg = driver.findElements(By.xpath("//div[@class='lrtEPN _17d0yO']"));
	int count = allSugg.size();
	System.out.println(count);
	for (int i = 0; i < count; i++) {
		String Sugg = allSugg.get(i).getText();
		System.out.println(Sugg);
		Thread.sleep(1000);
	}
	driver.close();
}
}
