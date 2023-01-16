package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Reader;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class OrangeReadData {
static int i,j;
	public static String orangeConflictFile(String value1) throws Exception {
		Properties p=new Properties();
		FileInputStream dest =new FileInputStream("C:\\Users\\q\\eclipse-workspace\\Project17Sep\\TestData\\OrangeConflict.property");
	     p.load(dest);
	return p.getProperty(value1);
	}
	public static String excelFileRead(int row,int col) throws Exception {
		FileInputStream dest=new FileInputStream("C:\\Users\\q\\eclipse-workspace\\Project17Sep\\TestData\\Book1.xlsx");
	Sheet excel = WorkbookFactory.create(dest).getSheet("Sheet2");
//	for(int i=0;i<=5;i++) {
//		for(int j=0;j<=5;j++) {
			String result = excel.getRow(i).getCell(j).getStringCellValue();
			//Thread.sleep(1000);
			return result;

		}

	}
	

