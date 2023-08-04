package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLogin {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws IOException, InterruptedException {
	WebDriver driver = new	ChromeDriver();
	driver.manage().window().maximize();
	FileInputStream fis = new FileInputStream("./Testdata/commondata.property");
	Properties p = new Properties();
	p.load(fis);
	
	String LINK = p.getProperty("url");
	driver.get(LINK);
	
	String UN = p.getProperty("username");
	String PW = p.getProperty("password");
	
	driver.findElement(By.id("username")).sendKeys(UN);
	driver.findElement(By.name("pwd")).sendKeys(PW);
	
	driver.findElement(By.xpath("//div[.='Login']")).click();
	
	Thread.sleep(5000);
	driver.close();
	
	

	
}
}
