package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoSuggestionsGoogle {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	Thread.sleep(3000);
	driver.findElement(By.id("APjFqb")).sendKeys("selenium");
	Thread.sleep(5000);
	//List<WebElement> allSugg = driver.findElements(By.xpath("//li[@class='sbct']"));
	//List<WebElement> allSugg = driver.findElements(By.xpath("//ul[@role='listbox']"));
	List<WebElement> allSugg = driver.findElements(By.xpath("//div[@class='pcTkSc']"));
	int count = allSugg.size();
	System.out.println(count);
	for (int i = 0; i < count; i++) {
		String Suggestions = allSugg.get(i).getText();
		System.out.println(Suggestions);
	}
	//driver.close();
	
}
}
