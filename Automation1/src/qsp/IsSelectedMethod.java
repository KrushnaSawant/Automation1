package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {
static {
	System.setProperty("erbdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://demo.actitime.com/login.do");
	boolean box = driver.findElement(By.name("remember")).isSelected();
	if (box==true) {
		System.out.println("checkbox is selected");
	} else {
		System.out.println("checkbox is not selected");
	}
	driver.close();
}

}
