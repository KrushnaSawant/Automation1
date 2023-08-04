package ObjectRepositoryPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ActitimeLogin {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}

@Test
public void actitimelogin() {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	LoginPage lp = new LoginPage(driver);
	lp.getUntbx().sendKeys("admin");
	driver.navigate().refresh();
	lp.getUntbx().sendKeys("admin");
	lp.getPwdbx().sendKeys("manager");
	lp.getLgbtn().click();
	driver.close();
}

}
