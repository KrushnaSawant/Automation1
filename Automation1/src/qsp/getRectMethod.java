package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getRectMethod {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.zomato.com/");
	int height = driver.findElement(By.xpath("(//img[@class='high-res-image'])[2]")).getRect().getHeight();
	int width = driver.findElement(By.xpath("(//img[@class='high-res-image'])[2]")).getRect().getWidth();
	int x = driver.findElement(By.xpath("(//img[@class='high-res-image'])[2]")).getRect().getX();
	int y = driver.findElement(By.xpath("(//img[@class='high-res-image'])[2]")).getRect().getY();
	System.out.println("Height="+height);
	System.out.println("width="+width);
	System.out.println("X axis="+x);
	System.out.println("Y axis="+y);
	driver.close();
}
}
