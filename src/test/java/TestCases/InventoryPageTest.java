package TestCases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.InventoryPage;
import Pages.LoginPage;

public class InventoryPageTest extends TestBase {
	LoginPage login;
	InventoryPage invent;//object of the class
	
	@BeforeMethod
	public void setup() throws Exception {
		initialization();
	 login = new LoginPage();
	 invent=new InventoryPage();
		login.loginBtn();
	}
	@Test(enabled =false)
	public void inventoryUrlLogin() throws Exception {
	String expUrl="https://www.saucedemo.com/inventory.html";
	String actUrl = invent.inventoryUrl();
	assertEquals(actUrl,expUrl);

	}
	@Test(enabled =false)
	public void inventoryPageLabelTest() {
		boolean result = invent.inventoryPageLabel();
		assertEquals(result, true);
		Reporter.log("inventoryLebal"+result);
	}
	@Test(enabled =false)
	public void inventoryPageLogoTest() {
		boolean result = invent.inventoryPageLogo();
		assertEquals(result, true);
		Reporter.log("inventoryLogo"+result);
	}
	@Test
	public void addProductTest() throws Exception {
		String result = invent.addProduct();
		assertEquals(result, "3");
		Reporter.log("total product added"+result);
	}
	@Test(enabled =false)
	public void verifyCardPageTest() throws Exception {
		String actResult="https://www.saucedemo.com/cart.html";
		       String expResult = invent.verifyCardPage();
		       assertEquals(actResult, expResult);

	}
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
}
