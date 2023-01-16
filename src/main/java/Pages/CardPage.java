package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class CardPage extends TestBase{
@FindBy(xpath = "//span[text()='Your Cart']")private WebElement CardLalel;
@FindBy(xpath = "//button[@data-test='remove-sauce-labs-fleece-jacket']")private WebElement removelement;
@FindBy(xpath = "//a[@class='shopping_cart_link']")private WebElement productCount;
@FindBy(id="continue-shopping")private WebElement continueBtn;
@FindBy(id="checkout")private WebElement checkOutBtn;
@FindBy(xpath = "//div[text()='49.99']")private WebElement firstProductPrice;
@FindBy(xpath = "/(//div[@class='inventory_item_price'])[2]")private WebElement secondProductPrice;

public CardPage() {
	PageFactory.initElements(driver, this);
}
public boolean verifyCardPageLabel() {
	return CardLalel.isDisplayed();
}
public String verifyCardPageUrl() {
	return driver.getCurrentUrl();
}
public String removeElementBtn() {
	removelement.click();
return productCount.getText();
}
public String continueBtn() {
	 continueBtn.click();
	 return driver.getCurrentUrl();
}
public String VerifyCardcheckOutBtn() {
	 checkOutBtn.click();
	 return driver.getCurrentUrl();
}
//public String firstProductPrice() {
//	 return firstProductPrice.getText();
//	 
//}
//public String secondProductPrice() {
//	 return secondProductPrice.getText();

	 
}

