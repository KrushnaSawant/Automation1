package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class Zomato {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver", "./driver/chromedriver.exe");
		ChromeDriver s = new ChromeDriver();
		s.manage().window().maximize();
		s.get("https://www.zomato.com/");
		Thread.sleep(2000);
		s.manage().window().minimize();
		Thread.sleep(2000);
		s.manage().window().maximize();
		Thread.sleep(5000);
		s.close();
	}

}
