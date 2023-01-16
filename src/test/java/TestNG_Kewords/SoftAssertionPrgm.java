package TestNG_Kewords;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Base.TestBase;
import Pages.LoginPage;

public class SoftAssertionPrgm extends TestBase{
	LoginPage login;
	@BeforeMethod(alwaysRun=true)
    public void setup() throws Exception 
   {
	initialization();
	login=new LoginPage();
	}
	@Test
	public void verifyTitle() {
       SoftAssert soft=new SoftAssert();
       String expTitle = "Swag Labs1";
		String actTitle = login.verifyTitle();
		soft.assertEquals(expTitle, actTitle);//test case fail houn pn next statement execute honr,ani method pass pn dakhvnr
		System.out.println("what is the result of test case");
		soft.assertAll();//assetAll exception trow krto ani correct result show krto
	}
	@AfterMethod(alwaysRun = true)
	public void closeBrowser() {
		driver.close();
	}
}
