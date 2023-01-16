package OrangePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import Base.TestBaseOrange;
import Utility.OrangeReadData;

public class OrangeLoginPage extends TestBaseOrange{
 //@FindBy(xpath ="(//img[@src='/web/images/ohrm_logo.png'])[1]") private WebElement orangeLogo;
@FindBy(xpath = "//input[@name='username']")private WebElement username;
@FindBy(xpath = "//input[@name='password']")private WebElement password;
@FindBy(xpath = "//button[@type='submit']")private WebElement loginBtn;	
	
public OrangeLoginPage()
{
	PageFactory.initElements(driver, this);
}
//public boolean orangeLogoPage() {
//	return orangeLogo.isDisplayed();
//}
public String orangeTitle() {
	return driver.getTitle();
}
public String orangeUrl() {
	return driver.getCurrentUrl();
}
public void orangeInfo() throws Exception {
	Thread.sleep(3000);
	int j=0;
	int i = 0;
	//username.sendKeys(OrangeReadData.orangeConflictFile("username"));
//password.sendKeys(OrangeReadData.orangeConflictFile("password"));
	username.sendKeys(OrangeReadData.excelFileRead(0, 0));
	password.sendKeys(OrangeReadData.excelFileRead(0, 1));
loginBtn.click();

}

}
