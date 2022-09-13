package mainjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
	
	@FindBy(xpath="//input[@name='username']")
	WebElement userName;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement passWord;
	
	@FindBy(xpath="//button[text()=' Login ']")
	WebElement btnLogin;
	
	@FindBy(xpath="//h5[text()='Login']")
	WebElement titleLogin;
	
	public LoginPage(WebDriver diver) {
		this.driver=driver;
		PageFactory.initElements(diver,this);
	}
	
	public void loginMethod() {
		userName.sendKeys("Admin");
		passWord.sendKeys("admin123");
		btnLogin.click();
	}
	
	public String loginTitlePage() {
		return titleLogin.getText();
	}
	
	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}

}
