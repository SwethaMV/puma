package genericmethods;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebElement;

public class Generic2 {
	FileInputStream fis;
	String sheet;
	String path;
	
	public Generic2(FileInputStream fis,String sheet, String path) {
		super();
		this.fis = fis;
		this.sheet=sheet;
		this.path=path;
	}

	public List<String> readExcelData(String sheet) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
			
		Workbook wb = WorkbookFactory.create(fis);
	
		Sheet sh = wb.getSheet(sheet);
		LinkedList<String> l= new LinkedList<String>();
		int rows = sh.getLastRowNum();
	
		for(int i=0;i<=rows;i++)
		{
			Row r =sh.getRow(i);
			short cells = r.getLastCellNum();
		  
			for(int j=0;j<cells;j++)
			{
			 	Cell c = r.getCell(j);
			 	
			 	try{
			 			 					 	 
			 		String v = c.getStringCellValue();
			 		l.add(v);
			 	    }
			 	catch(NullPointerException n)
			 	{
			 		
			 	}
			}
		}
         //Collections.sort(l);
		// Collections.sort(l,Collections.reverseOrder());
	   return l;
	}
	public void writeDataToExcel(int count,List<WebElement> ele,int index) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
				
		Workbook wb= WorkbookFactory.create(fis);
		
		Sheet sh= wb.getSheet(sheet);
		
		for(int i=0;i<count;i++)
		{
			Row r = sh.createRow(i);
		
			Cell c = r.createCell(index);
			
			c.setCellValue(ele.get(i).getText());
		}
		   FileOutputStream fos =  new FileOutputStream(path);
		 
		   wb.write(fos);

	}

}
