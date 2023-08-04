package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class Qtalk {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver s = new ChromeDriver();
		s.manage().window().maximize();
		s.get("https://app.qtalk.com/");
		String csk = s.getCurrentUrl();
	    System.out.println(csk);
		Thread.sleep(5000);
		s.close();
	}

}
