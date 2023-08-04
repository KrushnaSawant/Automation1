package listbox;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptions {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("file:///C:/Users/Krushna%20Sawant/Desktop/Rolex%20Hotel.html");
		
		WebElement element = driver.findElement(By.id("doremon"));
		Select s = new Select(element);
		s.selectByIndex(2);
		s.selectByValue("mt");
		s.selectByVisibleText("Dora cake");
		
		List<WebElement> option = s.getAllSelectedOptions();
		int count = option.size();
		for (int i = 0; i < count; i++) {
			String AllOptions = option.get(i).getText();
			System.out.println(AllOptions);
		}
		
		Thread.sleep(5000);
		driver.close();
		
	}
	}


