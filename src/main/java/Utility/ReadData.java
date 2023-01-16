package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData {

	public static String readPropertyFile(String value) throws Exception {
		Properties p=new Properties();
		FileInputStream dest=new FileInputStream("C:\\Users\\q\\eclipse-workspace\\Project17Sep\\TestData\\Config.Property");
		p.load(dest);
		return p.getProperty(value);
		}
	
	public static String readExcelFile(int row,int col) throws Exception
	{
	FileInputStream file = new FileInputStream("C:\\Users\\q\\eclipse-workspace\\Project17Sep\\TestData\\Book1.xlsx");
	 Sheet excel = WorkbookFactory.create(file).getSheet("Sheet1");
	 String value = excel.getRow(row).getCell(col).getStringCellValue();
	return value;	
	}

	}
