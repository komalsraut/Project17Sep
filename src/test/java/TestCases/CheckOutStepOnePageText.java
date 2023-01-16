package TestCases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.CardPage;
import Pages.CheckOutStepOnePage;
import Pages.InventoryPage;
import Pages.LoginPage;

public class CheckOutStepOnePageText extends TestBase{
      CheckOutStepOnePage checkOutOne;
      LoginPage login;
      InventoryPage invent;
      CardPage card;
	
	@BeforeMethod
	public void setup() throws Exception {
		initialization();
		login=new LoginPage();
		invent=new InventoryPage();
		card=new CardPage();
		checkOutOne=new CheckOutStepOnePage();
		login.loginBtn();
		invent.addProduct();
		card.VerifyCardcheckOutBtn();
	}
	@Test
	public void verifyCheckOutStepOneUrlTest() {
String actResult = "https://www.saucedemo.com/checkout-step-one.html";
	String expResult = checkOutOne.verifyCheckOutStepOneUrl();
	assertEquals(expResult,actResult);
	}
	@Test
	public void verifyInfoTest() {
		checkOutOne.veirfyInfo();
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
}
