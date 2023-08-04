package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dependantIndependantLaptop {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.name("q")).sendKeys("asus laptop");
		driver.findElement(By.className("L0Z3Pu")).click();
		Thread.sleep(5000);
		String price = driver.findElement(By.xpath("//div[.='ASUS TUF Gaming A15 Ryzen 5 Hexa Core AMD R5-4600H - (8 GB/1 TB SSD/Windows 11 Home/4 GB Graphics/NVID...']/../../../div[2]/div[2]/div[1]/div[1]/div[1]")).getText();
		System.out.println(price);
		Thread.sleep(5000);
		driver.close();
	
	}
}
