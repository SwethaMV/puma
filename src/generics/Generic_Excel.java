package generics;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;

public class Generic_Excel implements Auto_const
{
   public static String readData(String sheet,int row,int cell)
   {
	   String v="";
	   try{
		   FileInputStream fis=new FileInputStream(Excel_Path);
		   Workbook wb = WorkbookFactory.create(fis);
		   Cell c = wb.getSheet(sheet).getRow(row).getCell(cell);
		   v=c.toString();
	   }
	   catch(Exception e)
	   {
		   Reporter.log("path is invalid", true);
	   }
	   return v;
   }
   public static void writeData(String sheet,int row,int cell,String data)
   {
	   try{
	   FileInputStream fis=new FileInputStream(Excel_Path);
	   Workbook wb = WorkbookFactory.create(fis);
	   Sheet sh = wb.getSheet(sheet);
	   Row r = sh.createRow(row);
	   Cell c = r.createCell(cell);
	   c.setCellValue(data);
	   FileOutputStream fos=new FileOutputStream(Excel_Path);
	   wb.write(fos);
	   }
	   catch(Exception e)
	   {
		   Reporter.log("invalid path", true);
	   }	   
   }
}
