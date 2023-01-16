package TestCases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.CardPage;
import Pages.InventoryPage;
import Pages.LoginPage;

public class CardPageTest extends TestBase{
LoginPage login;
InventoryPage invent;
CardPage card;
	@BeforeMethod
	public void setup() throws Exception {
		initialization();
		card=new CardPage();
		login = new LoginPage();
		 invent=new InventoryPage();
		login.loginBtn();
		invent.addProduct();		
}
	@Test
	public void verifyCardPageLabelTest() {
		boolean result = card.verifyCardPageLabel();
		assertEquals(result, true);
		
	}
	@Test(enabled = false)
   public void verifyCardPageUrl() {
		String actResult = "https://www.saucedemo.com/cart.html";
		String exptResult = card.verifyCardPageUrl();
		assertEquals(actResult, exptResult);
	}
	@Test
	public void removeElementBtnText() {
		String result = card.removeElementBtn();
		assertEquals(result, "2");
	}
	@Test
	public void continueBtnTest() {
		String actResult = "https://www.saucedemo.com/inventory.html";
		String expResult = card.continueBtn();
		assertEquals(actResult, expResult);
	}
	@Test
	public void checkOutBtnTest() {
		String actResult = "https://www.saucedemo.com/checkout-step-one.html";
		String expResult = card.VerifyCardcheckOutBtn();
		assertEquals(actResult, expResult);
	}
//	@Test
//	public void productPriceTest() {
//		String result1 = card.firstProductPrice();
//		//String result2 = card.secondProductPrice();
//		assertEquals(result1, "49.99");
//		//assertEquals(result2, "7.99");
//	}
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
}
