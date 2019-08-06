package scripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import generics.Generic_Test;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pom.CheckMultipleData;

public class MultipleData extends Generic_Test
{

	@DataProvider(name="Authentication")
	public static Object[][] getData() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
//		return new Object[][]
//				{
//				{"swethumv@gmail.com","Qspiders02"},
//				{"swethumv12@gmail.com","Qspiders02"},
//				{"swethumv@gmail.com","Qspiders045"},
//				{"swethumv123@gmail.com","Qspiders0211"}
//				
//					};
		FileInputStream fis=new FileInputStream("./Excel/datafile.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("MultipleData");
		Row r = sh.getRow(0);
		int rowNum = sh.getLastRowNum();
		short cellNum = r.getLastCellNum();
		Object Data[][]=new Object[rowNum+1][cellNum];
		for(int i=0;i<=rowNum;i++)
		{
			Row r1=sh.getRow(i);
			for(int j=0;j<cellNum;j++)
			{
				if(r1==null)
				Data[i][j]="";
				else{
					Cell c = r.getCell(j);
					if(c==null)
						Data[i][j]="";
					else{
						String value=c.getStringCellValue();
						System.out.println(value);
						Data[i][j]=value;
					}
				}
			}
		}
		
			return Data;
		
	}

	@Test(dataProvider="Authentication")
	public void login(String id1,String pwd1)
	{
		driver.get("https://in.puma.com/");
		CheckMultipleData c=new CheckMultipleData(driver);
		c.login(id1, pwd1);
		String title = driver.getTitle();
		
		try{
		Assert.assertEquals(title, "PUMA.COM | Forever Faster");
		Reporter.log("valid username and password", true);
		}catch(Error e)
		{
			Reporter.log("invalid username and password", true);
			Assert.fail();
		}
	}
}
