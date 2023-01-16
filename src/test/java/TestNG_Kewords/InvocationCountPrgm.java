package TestNG_Kewords;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class InvocationCountPrgm extends TestBase {
	
	LoginPage login;
	@BeforeMethod(alwaysRun=true)
    public void setup() throws Exception 
   {
	initialization();
	login=new LoginPage();
	}
	@Test(invocationCount = 3)//Test Case run 3 times
	public void verifyLogoTest() {
		boolean result = login.verifyLogo();
		assertEquals(result,true);
	}
	@AfterMethod(alwaysRun = true)
	public void closeBrowser() {
		driver.close();
	}
}
