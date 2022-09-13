package test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
	
	@Test(priority=1)
	public void verifyCurrentUrl() {
		AssertJUnit.assertEquals(loginPage.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test(priority=2)
	public void verifyLoginTitle() {
		AssertJUnit.assertEquals(loginPage.loginTitlePage(), "Login");
	}
	
	@Test(priority=3)
	public void verifyLoginPage() {
		loginPage.loginMethod();
		AssertJUnit.assertEquals(pimPage.titlePimPage(),"PIM");
	}

}
