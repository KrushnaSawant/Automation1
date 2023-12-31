package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getSizeMethod {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		int height = driver.findElement(By.id("passContainer")).getSize().getHeight();
		int width = driver.findElement(By.id("passContainer")).getSize().getWidth();
		System.out.println("Height="+height);
		System.out.println("Width="+width);
		driver.close();
	}
}
