package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import mainjava.AdminPage;
import mainjava.BaseClass;
import mainjava.LoginPage;
import mainjava.PimPage;

public class BaseTest extends BaseClass {
	
	
	@BeforeClass
	public void launchBrowser() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().getPageLoadTimeout();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().timeouts().getImplicitWaitTimeout();
	}
	
	@BeforeClass
	public void pageObject() {
		loginPage = new LoginPage(driver);
		pimPage = new PimPage(driver);
		adminPage = new AdminPage(driver);
		
	}
	
	
	@AfterClass
	public void tearDownEnvironment() {
		driver.quit();
	}

}
