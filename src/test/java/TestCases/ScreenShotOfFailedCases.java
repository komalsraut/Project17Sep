package TestCases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.internal.annotations.ITest;

import Base.TestBase;
import Pages.LoginPage;
import Utility.UtilityMethod;

public class ScreenShotOfFailedCases extends TestBase{
		LoginPage login;
		@BeforeMethod
		     public void setup() throws Exception 
		    {
			initialization();
			login=new LoginPage();
			}
			@Test
			public void verifyLogoTest() {
				boolean result = login.verifyLogo();
				assertEquals(result,true);
			}
			@Test(enabled = false)
			public void verifyBotLogoTest() {
				boolean result=login.botLogo();
				assertEquals(result, true);
			
			}
		@Test
		public void verifyTitleTest() {
			String expTitle = "Swag .Labs";
			String actTile = login.verifyTitle();
			Assert.assertEquals(expTitle, actTile);
					
		}
		@Test
		public void verifyUrlTest() {
			String expUrl="https://www.saucedemo.com/";
			String actUrl = login.verifyUrl();
			assertEquals(actUrl,expUrl);	
		}
		public void swagLogoTest() {
			boolean result = login.swagLogo();
			assertEquals(result,true);	
		}

		@AfterMethod
		public void closeBrowser(ITestResult a) throws Exception
		{
			if(ITestResult.FAILURE == a.getStatus()) {
				//UtilityMethod.ScreenShotMethod();//ya method ni aplyala pratek ss la name dyav lagel ani nemk kdnr pn nhi kuthli method fail zali kdnr pn nhi ,so mhanun apn get name method use krto
UtilityMethod.ScreenShotMethod(a.getName());//ethe para pass kele mhnaun utility chy ss() mdhe pn para pass krave lagnr
			}
		driver.close();
		}
}
