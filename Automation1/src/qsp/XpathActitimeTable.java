package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathActitimeTable {
static {
	System.setProperty("webdriver.chrome.driver.", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	Thread.sleep(3000);
    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
    driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
    driver.findElement(By.xpath("//input[@value='on']")).click();
    driver.findElement(By.xpath("//div[text()='Login ']")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("(//div[@class='popup_menu_icon'])[2]")).click();
    Thread.sleep(3000);
    driver.findElement(By.id("popup_menu_item_2")).click();
    Thread.sleep(3000);
    String rate = driver.findElement(By.xpath("//a[.='engineering']/../../td[4]/span")).getText();
    String rates = driver.findElement(By.xpath("//a[.='manufacturing']/../../td[4]/span")).getText();
    String text = driver.findElement(By.xpath("//a[.='testing']/../../td[4]/span")).getText();
    System.out.println(rate);
    System.out.println(rates);
    System.out.println(text);
    Thread.sleep(5000);
    driver.close();
}
}
