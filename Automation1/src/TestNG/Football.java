package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenerImplementation.class)
public class Football extends BaseClass{
	@Test
	public void Messi() {
		Reporter.log("best football player", true);
		Assert.fail();
   }
	@Test
	public void ronaldo() {
		Reporter.log("best football player", true);
		Assert.fail();
	}
}