package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeMethod {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://tinder.com/");
	Thread.sleep(3000);
	String tag = driver.findElement(By.xpath("//h1[.='Start something epic.']")).getAttribute("class");
	System.out.println(tag);
	Thread.sleep(3000);
	driver.close();
	
}
}
