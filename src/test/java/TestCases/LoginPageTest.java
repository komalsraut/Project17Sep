package TestCases;

import static org.testng.Assert.assertEquals;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SendKeysAction;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Base.TestBase;
import Pages.LoginPage;

public class LoginPageTest extends TestBase {
LoginPage login;
//@BeforeClass
//@BeforeTest
	@BeforeMethod
     public void setup() throws Exception 
    {
	initialization();
	login=new LoginPage();
	}
	@Test(enabled = false)
	public void verifyLogoTest() {
		boolean result = login.verifyLogo();
		assertEquals(result,true);
	}
	@Test(enabled = false)
	public void verifyBotLogoTest() {
		boolean result=login.botLogo();
		assertEquals(result, true);
	
	}
@Test//(enabled = false)
public void verifyTitleTest() {
	String expTitle = "Swag Labs";
	String actTile = login.verifyTitle();
	Assert.assertEquals(expTitle, actTile);
			
}
@Test(enabled = false)
public void verifyUrlTest() {
	String expUrl="https://www.saucedemo.com/";
	String actUrl = login.verifyUrl();
	assertEquals(actUrl,expUrl);	
}
public void swagLogoTest() {
	boolean result = login.swagLogo();
	assertEquals(result,true);	
}
@Test(enabled = false)
public void loginButtonTest()throws Exception {
	String expRes = "https://www.saucedemo.com/inventory.html";
	String actRes = login.loginBtn();
	Assert.assertEquals(expRes, actRes);
}
@Test//(enabled=false)
public void labeinventoryPageTest() throws Exception {
	boolean result=login.labelInventoryPage();
	assertEquals(result, true);
}
//@AfterClass
//@AfterTest
@AfterMethod
public void closeBrowser()
{
driver.close();
}
}