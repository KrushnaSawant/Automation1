package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class Shaadi {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.shaadi.com/");
		Thread.sleep(5000);
		driver.close();
	}
}
