package test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PimTest extends BaseTest{
	
	@BeforeMethod
	public void login() {
		loginPage.loginMethod();
	}
	
	@Test(priority=2, groups={"smoke","regression"})
	public void verifyPimPage() {
		AssertJUnit.assertEquals(pimPage.titleOfPimPage(), "PIM");
	}
}
