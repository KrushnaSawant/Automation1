package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSource {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String source = driver.getPageSource();
		System.out.println(source);
		Thread.sleep(5000);
		driver.close();
	}
 
}
