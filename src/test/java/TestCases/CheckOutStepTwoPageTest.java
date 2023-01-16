package TestCases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.CardPage;
import Pages.CheckOutStepOnePage;
import Pages.CheckOutStepTwoPage;
import Pages.InventoryPage;
import Pages.LoginPage;

public class CheckOutStepTwoPageTest extends TestBase {

	CheckOutStepTwoPage checkOutTwo;
	LoginPage login;
	InventoryPage invent;
	CardPage card;
	CheckOutStepOnePage checkOutOne;
	@BeforeMethod
	public void setup() throws Exception {
		initialization();
		checkOutTwo=new CheckOutStepTwoPage();
		login=new LoginPage();
		invent=new InventoryPage();
		card=new CardPage();
		checkOutOne=new CheckOutStepOnePage();
		login.loginBtn();
		invent.addProduct();
		card.VerifyCardcheckOutBtn();
		checkOutOne.veirfyInfo();	
	}
	
	@Test
	public void verifyUrlTest() {
		String actResult="https://www.saucedemo.com/checkout-step-two.html";
		String expResult = checkOutTwo.verifyUrl();
		assertEquals(actResult, expResult);
	}
	
	@AfterMethod
	public void browserClose() {
		driver.close();
	}
}


