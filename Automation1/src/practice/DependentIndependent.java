package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DependentIndependent {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 14");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(3000);
		String price = driver.findElement(By.xpath("//span[.='Apple iPhone 14 Pro (128 GB) - Space Black']/../../../../../../../div[2]/div/div/div[3]/div[1]/div/div[1]/div[1]/a/span/span[2]")).getText();
		System.out.println(price);
		Thread.sleep(5000);
		driver.close();
		}

}
