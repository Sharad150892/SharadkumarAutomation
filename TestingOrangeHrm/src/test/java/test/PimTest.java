package test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PimTest extends BaseTest {
	
	@BeforeMethod
	public void login() {
		loginPage.loginMethod();
	}
	
	@Test(priority=4)
	public void verifyPimPage() {
		Assert.assertEquals(pimPage.titlePimPage(),"PIM");
	}
	
	@Test(priority=5)
	public void verifyIdCheckBoxIsSelected() {
		pimPage.checkAllSelect();
		AssertJUnit.assertEquals(pimPage.checkIsSelected(), true);
	}
}

