package test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.Assert;

public class LoginTest extends BaseTest {
	
	
	@Test(priority=1, groups={"smoke","regression"})
	public void verifyLogin() {
		loginPage.loginMethod();
		AssertJUnit.assertEquals(pimPage.titleOfPimPage(),"PIM");
	}
	
	@Test(priority=0)
	public void verifyLoginPageIsDisplayed() {
		AssertJUnit.assertEquals(loginPage.titleLoginPage(),"Login");
	}
	
	@Test(priority=-1, groups="smoke")
	public void verifyUrlOfPage() {
		AssertJUnit.assertEquals(loginPage.currentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

}
