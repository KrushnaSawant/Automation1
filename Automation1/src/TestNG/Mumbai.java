package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Mumbai extends BaseClass {
	@Test
	public void Mayanagari() {
		Reporter.log("Mumbai is dream city", true);
	}
	
	@Test
	public void Dhoni() {
		Reporter.log("captain cool", true);
	}
}
