package genericmethods;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Generic1

    {
	
	
	public void scroll(int X,int Y,WebDriver driver)
    {
    	
    	JavascriptExecutor js=(JavascriptExecutor)driver; 
        js.executeScript("window.scrollBy("+X+","+Y+")");
    	    
    }
    	public void clr(WebElement ele)
    	{
    		ele.clear();
    	}
    	public void clk(WebElement ele)
    	{
    		ele.click();
    	}
    	public void getAtt(WebElement ele,String att)
    	{
    		ele.getAttribute(att);
    	}
    	public void getcss(WebElement ele,String css)
    	{
    		ele.getCssValue(css);
    	}
    	public void getLoc(WebElement ele)
    	{
    		Point loc = ele.getLocation();
    		int x=loc.getX();
    		System.out.println(x);
    		int y = loc.getY();
    		System.out.println(y);
    	}
    	public void gettxt(WebElement ele)
    	{
    		String txt = ele.getText();
    		System.out.println(txt);
    	}
    	public void getrect(WebElement ele,Rectangle r)
    	{
    		ele.getRect();
    	}
    	public void getsize(WebElement ele,int size)
    	{
    		ele.getSize();
    	}
    	public void tag(WebElement ele,String name)
    	{
    		ele.getTagName();
    	}
    	public void display(WebElement ele)
    	{
    		ele.isDisplayed();
    	}
    	public void enable(WebElement ele)
    	{
    		ele.isEnabled();
    	}
    	public void select(WebElement ele)
    	{
    		ele.isSelected();
    	}
    	public void submitting(WebElement ele)
    	{
    		ele.submit();
    	}
    	
    	public void send(WebElement ele,CharSequence[] ch)
    	{
    		ele.sendKeys(ch);
    	}
    	
    	public void selectIndex(WebElement ele,int i)
    	{
    	Select s=new Select(ele);
    	s.selectByIndex(i);
    	}
    	public void selectVisible(WebElement ele,String str)
    	{
    	Select s=new Select(ele);
    	s.selectByVisibleText(str);
    	}
    	public void selectValue(WebElement ele,String value)
    	{
    	Select s=new Select(ele);
    	s.selectByValue(value);
    	}
    	public void deselectAl(WebElement ele)
    	{
    	Select s=new Select(ele);
    	s.deselectAll();
    	}
    	public void deselectIndex(WebElement ele,int i)
    	{
    	Select s=new Select(ele);
    	s.deselectByIndex(i);
    	}
    	public void deselectvalue(WebElement ele,String value)
    	{
    	Select s=new Select(ele);
    	s.deselectByValue(value);
    	}
    	public void isMultiple1(WebElement ele)
    	{

    	Select s=new Select(ele);
    	s.isMultiple();
    	}
    	public void moveEle(WebDriver driver,WebElement ele)
    	{
    		Actions a=new Actions(driver);
    		a.moveToElement(ele).perform();
    	}
    	public void dragdrop(WebDriver driver,WebElement e1,WebElement e2)
    	{
    		Actions a=new Actions(driver);
    		a.dragAndDrop(e1,e2).perform();
    	}
    	public void doubleclickaction(WebDriver driver,WebElement block)
    	{
    		Actions a=new Actions(driver);
    		a.doubleClick(block).perform();
    	}
    	public void rightclick(WebDriver driver,WebElement ele)
    	{
    		Actions a=new Actions(driver);
    		a.contextClick(ele).perform();
    	}
    	public void newtab(WebDriver driver,WebElement tab)
    	{
    		Actions a=new Actions(driver);
    		a.sendKeys(Keys.CONTROL).click(tab).perform();
    	}
    	public void newwindow(WebDriver driver,WebElement tab)
    	{
    		Actions a=new Actions(driver);
    		a.sendKeys(Keys.SHIFT).click(tab).perform();
    	}
    	
    	public  void getPhoto(WebDriver driver) throws IOException
    	  {
    		  String images="./Snaps/";
    		  Date d=new Date();
    		  String d1=d.toString();
    		  String date=d1.replaceAll(":", "-");
    		  TakesScreenshot ts=(TakesScreenshot) driver;
    		  File src=ts.getScreenshotAs(OutputType.FILE);
    		  File dst=new File(images+date+".jpeg");
    		  FileUtils.copyFile(src, dst);
    	  }
    	public void sendData(WebElement ele,String s)
    	{
    		ele.sendKeys(s);
    	}
    	
    }

