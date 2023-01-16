package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utility.OrangeReadData;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBaseOrange {
	protected static WebDriver driver;
	
		public void initilization() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//driver.get(OrangeReadData.orangeConflictFile("url"));
		}
	}
	
	

