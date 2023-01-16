package TestNG_Kewords;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class Group_LoginPageTest extends TestBase{
	LoginPage login;

	@BeforeMethod(alwaysRun=true)
     public void setup() throws Exception 
    {
	initialization();
	login=new LoginPage();
	}
	@Test(priority=1 , groups = {"Sanity","regression"})
	public void verifyLogoTest() {
		boolean result = login.verifyLogo();
		assertEquals(result,true);
	}
	@Test(priority=2 , groups = "Smoke")
	public void verifyBotLogoTest() {
		boolean result=login.botLogo();
		assertEquals(result, true);

	}
@Test(groups = "Smoke")
public void verifyTitleTest() {
	String expTitle = "Swag Labs";
	String actTile = login.verifyTitle();
	Assert.assertEquals(expTitle, actTile);
			
}
@Test(groups = "Sanity")
public void verifyUrlTest() {
	String expUrl="https://www.saucedemo.com/";
	String actUrl = login.verifyUrl();
	assertEquals(actUrl,expUrl);	
}

@AfterMethod(alwaysRun=true)
public void closeBrowser()
{
driver.close();
}
}
