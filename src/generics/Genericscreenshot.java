package generics;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Genericscreenshot implements Auto_const
{
	public static void getPhoto(WebDriver driver,String tcname)
	  {
		  String images=Photo_Path;
		  Date d=new Date();
		  String d1=d.toString();
		  String date=d1.replaceAll(":", "-");
		  TakesScreenshot ts=(TakesScreenshot) driver;
		  File src=ts.getScreenshotAs(OutputType.FILE);
		  File dst=new File(images+date+".jpeg");
		  try {
			FileUtils.copyFile(src, dst);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	  }
	public void scroll(int X,int Y,WebDriver driver)
    {
    	
    	JavascriptExecutor js=(JavascriptExecutor)driver; 
        js.executeScript("window.scrollBy("+X+","+Y+")");
    	    
    }
}
