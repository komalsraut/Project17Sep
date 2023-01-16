package Pages;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.github.dockerjava.api.model.Driver;

import Base.TestBase;
import Utility.UtilityMethod;

public class InventoryPage extends TestBase{

	@FindBy(xpath = "//span[text()='Products']")private WebElement inventoryproductLabel;
	@FindBy(xpath = "//div[@class='app_logo']")private WebElement inventoryLogo;
	@FindBy(id="add-to-cart-sauce-labs-backpack")private WebElement backPack;
	@FindBy(id="add-to-cart-sauce-labs-fleece-jacket")private WebElement fleeceJacket;
	@FindBy(id="add-to-cart-sauce-labs-onesie")private WebElement onesie;
	@FindBy(xpath = "//select[@class='product_sort_container']")private WebElement sortProductDrawpdawn;
	@FindBy(xpath = "//a[@class='shopping_cart_link']")private WebElement productCount;
	@FindBy(xpath = "//span[text()='Your Cart']")private WebElement cardPage;
	
	public InventoryPage(){//@find bt lihil mhanun const class kela,bcz te intance var ahe,te call krayla object pahije
		PageFactory.initElements(driver, this);
	}
	public String inventoryUrl() {
		return driver.getCurrentUrl();
	}
	public boolean inventoryPageLogo() {
		return inventoryLogo.isDisplayed();
	}
	public boolean inventoryPageLabel() {
		return inventoryproductLabel.isDisplayed();
	}
	public String addProduct() throws Exception {
		UtilityMethod.inventorySelectClass(sortProductDrawpdawn, "Price (low to high)");
	backPack.click();
	fleeceJacket.click();
	onesie.click();
	productCount.click();
	return productCount.getText();
}
	public String verifyCardPage() throws Exception {
		return driver.getCurrentUrl();
	}
}