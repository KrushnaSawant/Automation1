package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getLocationMethod {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.zomato.com/");
	int x = driver.findElement(By.xpath("(//img[@class='high-res-image'])[2]")).getLocation().getX();
	int y = driver.findElement(By.xpath("(//img[@class='high-res-image'])[2]")).getLocation().getY();
	System.out.println("X="+x);
	System.out.println("Y="+y);
	driver.close();
}
}
