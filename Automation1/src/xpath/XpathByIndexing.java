package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByIndexing {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@ placeholder = 'Search for products, brands and more']")).sendKeys("t shirts");
		driver.findElement(By.xpath("//a[@ class = 'desktop-submit']")).click();
		String text = driver.findElement(By.xpath("(//h3[text()='HRX by Hrithik Roshan'])[3]")).getText();
		System.out.println(text);
		Thread.sleep(5000);
		driver.close();
		
	}

}
