package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

import org.testng.Assert;

public class Acterss {
	@Test(invocationCount=5, priority = 3)
	public void create_customer(){
		Assert.fail();
		Reporter.log("HI selenium advanced", true);
	}
	@Test(priority=1)
	public void deleteCustomer() {
		Reporter.log("Krushna",true);
	}
	@Test(priority=2)
	public void modify() {
		Reporter.log("customer modified",true);
	}
	@Test(enabled=false)
	public void modifyCustomer() {
		Reporter.log("customer modified",true);
	}
}
