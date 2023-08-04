package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.youtube.com/");
	Thread.sleep(5000);
	driver.findElement(By.name("search_query")).sendKeys("Kesariya");
	driver.findElement(By.id("search-icon-legacy")).click();
	driver.findElement(By.xpath("//yt-formatted-string[@aria-label='Kesariya - Brahmāstra | Ranbir Kapoor | Alia Bhatt | Pritam | Arijit Singh | Amitabh Bhattacharya by Sony Music India 10 months ago 2 minutes, 53 seconds 462,197,476 views']")).click();
	Thread.sleep(5000);
	
}
}
