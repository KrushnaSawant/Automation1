package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoSuggestionsAmazon {
static {
	System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.amazon.in/");
	 Thread.sleep(3000);
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("asus laptop");
	Thread.sleep(3000);
	List<WebElement> allSugg = driver.findElements(By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction']"));
	int count = allSugg.size();
	System.out.println(count);
	for (int i = 0; i < count; i++) {
		 String Suggestions = allSugg.get(i).getText();
		 System.out.println(Suggestions);
		 //Thread.sleep(1000);
	}
	 driver.close();
}
}
