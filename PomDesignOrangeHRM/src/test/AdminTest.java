package test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AdminTest extends BaseTest {
	
	@BeforeMethod
	public void login() {
		loginPage.loginMethod();
	}
	
	@Test(priority=6, groups={"smoke","regression"})
	public void verifyAdminPage() {
		adminPage.clickOnAdmin();
		Assert.assertEquals(adminPage.titleOfAdminpage(), "Admin");
	}

}
