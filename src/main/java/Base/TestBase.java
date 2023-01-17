package Base;

import java.time.Duration;

import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utility.OrangeReadData;
import Utility.ReadData;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriver driver;
	
public void initialization()throws Exception {
	//launching chrome browser
	WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	driver.manage().deleteAllCookies();
	driver.get(ReadData.readPropertyFile("url"));//read excel file
	//driver.get("https://www.saucedemo.com/");
	//komal raut

}
}
