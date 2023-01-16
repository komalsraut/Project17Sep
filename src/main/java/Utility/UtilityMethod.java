package Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import Base.TestBase;

public class UtilityMethod extends TestBase {
public static void inventorySelectClass(WebElement ele,String option) {
	
	Select s1=new Select(ele);
s1.selectByVisibleText(option);
}

public static void ScreenShotMethod(String name) throws Exception {
	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File dest=new File("C:\\Users\\q\\eclipse-workspace\\Project17Sep\\Screenshot/"+name+".jpg");

	
	FileHandler.copy(source, dest);
	
}
}