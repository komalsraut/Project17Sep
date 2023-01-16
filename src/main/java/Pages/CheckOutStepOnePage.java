package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class CheckOutStepOnePage extends TestBase{

	
	@FindBy(xpath = "//input[@placeholder='First Name']")private WebElement firstName;
	@FindBy(xpath = "//input[@placeholder='Last Name']")private WebElement lastName;
	@FindBy(xpath = "//input[@placeholder='Zip/Postal Code']")private WebElement zipCode;
	@FindBy(id="continue")private WebElement CheckoutStepOneCountinueBTn;
	
	public CheckOutStepOnePage() {
		PageFactory.initElements(driver, this);
	}
	public String verifyCheckOutStepOneUrl() {
		return driver.getCurrentUrl();
	}
	public void veirfyInfo() {
		firstName.sendKeys("ab");
		lastName.sendKeys("xyz");
		zipCode.sendKeys("453321");
		CheckoutStepOneCountinueBTn.click();
	}
	

}
