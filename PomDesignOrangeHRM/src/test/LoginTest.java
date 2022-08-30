 package test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.Assert;

public class LoginTest extends BaseTest {
	
	
	@Test(priority=3, groups={"smoke","regression"})
	public void verifyLogin() {
		loginPage.loginMethod();
		Assert.assertEquals(pimPage.titleOfPimPage(),"PIM");
	}
	
	@Test(priority=2)
	public void verifyLoginPageIsDisplayed() {
		Assert.assertEquals(loginPage.titleLoginPage(),"Login");
	}
	
	@Test(priority=1, groups="smoke")
	public void verifyUrlOfPage() {
		Assert.assertEquals(loginPage.currentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

}
