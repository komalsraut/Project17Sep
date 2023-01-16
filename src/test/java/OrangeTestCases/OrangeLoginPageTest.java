package OrangeTestCases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Base.TestBaseOrange;
import OrangePages.OrangeLoginPage;
import Pages.LoginPage;

public class OrangeLoginPageTest extends TestBaseOrange {
OrangeLoginPage orangeLogin;

	@BeforeMethod
	public void setup() throws Exception {
		initilization();
		orangeLogin=new OrangeLoginPage();
	}
	@Test(enabled = false)
	public void orangeTitleTest() {
		String actTitle = "OrangeHRM";
		String expTitle = orangeLogin.orangeTitle();
		assertEquals(actTitle, expTitle);
	}
	@Test(enabled = false)
	public void orangeUrlTest() {
		String actUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		String expUrl = orangeLogin.orangeUrl();
		assertEquals(actUrl, expUrl);
	}
//	@Test
//	public void orangeLogoTest() {
//	boolean result = orangeLogin.orangeLogoPage();
//	assertEquals(result, true);
//	}
	@Test
	public void orangeInfo() throws Exception {
		orangeLogin.orangeInfo();
	
	}
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
}
