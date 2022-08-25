package mainjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.BaseTest;

public class LoginPage extends BaseTest {
	
	//All the Locator of Page
	
	@FindBy(xpath="//input[@name='username']")
	WebElement userName;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement passWord;
	
	@FindBy(xpath="//button[text()=' Login ']")
	WebElement btnLogin;
	
	@FindBy(xpath="//h5[text()='Login']")
	WebElement txtLoginPage;

	
	//Initialization of locator/variable
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//method required to perform test steps
	
	
	
	public void loginMethod() {
		userName.sendKeys("Admin");
		passWord.sendKeys("admin123");
		btnLogin.click();		
	}
	
	public String titleLoginPage() {
		return txtLoginPage.getText();
	}
	
	public String currentUrl() {
		return driver.getCurrentUrl();
	}
}





















