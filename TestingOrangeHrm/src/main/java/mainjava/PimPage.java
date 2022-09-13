package mainjava;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PimPage extends BaseClass{
	
	@FindBy(xpath="//h6[text()='PIM']")
	WebElement txtPage;
	
	@FindBy(xpath="//span[contains(@class,'oxd-checkbox-input oxd-checkbox-input--active --label-right oxd-checkbox-input')]")
	List<WebElement> checkAll;
	
	@FindBy(xpath="//i[contains(@class,'checkbox')]")
	List<WebElement> checkinput;
	

	public PimPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public String titlePimPage() {
		return txtPage.getText();
	}
	
	public void checkAllSelect() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		checkAll.get(0).click();
	}
	
	public boolean checkIsSelected() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		return checkinput.get(0).isSelected();
	}
	
}
