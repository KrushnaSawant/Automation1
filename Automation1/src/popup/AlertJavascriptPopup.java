package popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertJavascriptPopup {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://demo.actitime.com/login.do");
	
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
    driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
    driver.findElement(By.xpath("//input[@value='on']")).click();
    driver.findElement(By.xpath("//div[text()='Login ']")).click();
    
    driver.findElement(By.id("container_tasks")).click();
    driver.findElement(By.xpath("//div[.='Add New']")).click();
    driver.findElement(By.xpath("//div[.='+ New Customer']")).click();
    driver.findElement(By.xpath("(//input[@placeholder='Enter Customer Name'])[2]")).sendKeys("krushna");
    driver.findElement(By.xpath("//div[@class='greyButton cancelBtn']")).click();
    
    Thread.sleep(5000);
    Alert a = driver.switchTo().alert();
    //a.accept();
   String text = a.getText();
   System.out.println(text);
   a.dismiss();
    
    Thread.sleep(5000);
    driver.close();
}
}
