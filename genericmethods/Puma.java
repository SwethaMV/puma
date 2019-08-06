package Assignments;

import genericmethods.Generic1;
import genericmethods.Generic2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Puma {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException 
	   {
		  System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		  WebDriver driver=new FirefoxDriver();
		  driver.get("https://in.puma.com/");
		  Generic1 g1=new Generic1();
		  Thread.sleep(2000);
		  WebElement ele = driver.findElement(By.xpath("//a[.=' MEN ']"));
		  Thread.sleep(2000);
		  Actions act=new Actions(driver);
		  act.moveToElement(ele).perform();
		  Thread.sleep(3000);
		  WebElement e1 = driver.findElement(By.xpath("(//a[.='Running'])[6]"));
		  e1.click();
		  
		  
//		  driver.findElement(By.xpath("(//a[@class='amshopby-price amshopby-attr'])[1]")).click();
//		  Thread.sleep(2000);
		  WebElement loc = driver.findElement(By.xpath("//a[@href='http://www.aceturtle.com/']"));
		  Point w = loc.getLocation();
		  System.out.println(w);
		  for(int i=0;i<=4;i++)
		  {
		  g1.scroll(0, 800, driver);
		  }
		 
		 
		  Thread.sleep(15000);
		  List<WebElement> l1 = driver.findElements(By.xpath("//li[@class='item last']/div/h2/a"));
		  
		  //List<WebElement> l2 = driver.findElements(By.xpath("\\img"));
		  //int count1 = l2.size();
		  
		  int count = l1.size();
		  System.out.println(count);
		  Thread.sleep(5000);
		  for(int i=0;i<count;i++)
		  {
			  String p = l1.get(i).getText();
			 // String all = p.getAttribute("alt");
			
			  System.out.println(p);
		  }
		  driver.findElement(By.xpath("(//a[@class='amshopby-price amshopby-attr'])[2]")).click();
		  Thread.sleep(4000);
		  driver.findElement(By.xpath("(//a[@class='amshopby-attr'])[1]")).click();
		  Thread.sleep(2000);
		  List<WebElement> l2 = driver.findElements(By.xpath("//li[@class='item last']/a/img"));
		  int count2 = l2.size();
		  System.out.println(count2);
		  int diff=count-count2;
		  System.out.println(diff);
		  FileInputStream fis=new FileInputStream("./Excel/data.xlsx");
		 	Workbook wb = WorkbookFactory.create(fis);
		 	Sheet sh1 = wb.getSheet("sheet1");

		 	for(int i=0;i<count;i++)
		 	{
		 		
		 	Row r = sh1.createRow(i);
		 	Cell c = r.createCell(0);
		 	c.setCellValue(l2.get(i).getText());
		 	
		 	}
		 	
		 	FileOutputStream fos=new FileOutputStream("./Excel/data.xlsx");
		 	wb.write(fos);

	}

}
