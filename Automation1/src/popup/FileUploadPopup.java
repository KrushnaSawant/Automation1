package popup;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.foundit.in/");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//div[@class='heroSection-buttonContainer_secondaryBtn__text']")).click();
	Thread.sleep(3000);
	File f = new File("./testdata/123.pdf");
	String path = f.getAbsolutePath();
	driver.findElement(By.id("file-upload")).sendKeys(path);
	Thread.sleep(3000);
	driver.close();
}
}
