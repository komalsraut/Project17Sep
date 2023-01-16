package TestNG_Kewords;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class Hard_Assertion extends TestBase{

	LoginPage login;
	@BeforeMethod(alwaysRun=true)
    public void setup() throws Exception 
   {
	initialization();
	login=new LoginPage();
	}
	@Test
	public void verifyLogoTest() {
		boolean result = login.verifyLogo();
		assertTrue(result);
	}
	@Test
	public void verifyBotLogoTest() {
		boolean result=login.botLogo();
		assertEquals(result, true);
		}
	@Test
	public void verifyTitleTest() {
		String expTitle = "Swag Labs1";
		String actTitle = login.verifyTitle();
		Assert.assertEquals(expTitle, actTitle,"why test case get failed");// if Test case only then msg displayed otherwise no 
				
	}
	@AfterMethod(alwaysRun = true)
	public void closeBrowser() {
		driver.close();
	}
}
