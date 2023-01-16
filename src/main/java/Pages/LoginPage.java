package Pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import Utility.ReadData;

	public class LoginPage extends TestBase{
		
		@FindBy(xpath = "//div[@class='login_logo']")private WebElement LoginLogo;
		@FindBy(xpath = "//div[@class='bot_column']")private WebElement botLogo;
		@FindBy(xpath = "//img[@alt='Swag Bot Footer']")private WebElement swagLogo;
		@FindBy(xpath = "//span[text()='Products']")private WebElement loginSuccess;
		@FindBy(xpath = "//input[@placeholder='Username']")private WebElement username;
		@FindBy(xpath = "//input[@placeholder='Password']")private WebElement password;
		@FindBy(xpath = "//input[@class='submit-button btn_action']")private WebElement loginbtn;
		@FindBy(xpath = "//div[@class='peek']")private WebElement labeliInventoryPage;
		
		public LoginPage(){
			PageFactory.initElements(driver, this);
			}
		
		public boolean verifyLogo() {
			return LoginLogo.isDisplayed();
		}
		public boolean botLogo() {
			return botLogo.isDisplayed();
		}
		
		public String verifyTitle() {
			return driver.getTitle();
		}
		
		public String verifyUrl() {
			return driver.getCurrentUrl();
		}
		public boolean swagLogo() {
			return swagLogo.isDisplayed();
		}
		public String loginBtn() throws Exception{
//		username.sendKeys(ReadData.readPropertyFile("username"));
//		password.sendKeys(ReadData.readPropertyFile("password"));
			username.sendKeys(ReadData.readExcelFile(0, 0));
			password.sendKeys(ReadData.readExcelFile(0, 1));
			loginbtn.click();
		return driver.getCurrentUrl();
		}
		public boolean labelInventoryPage() throws Exception {
			loginBtn();
			return labeliInventoryPage.isDisplayed();
			
		}
 	

		}
		

