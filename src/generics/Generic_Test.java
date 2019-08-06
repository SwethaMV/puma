package generics;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Generic_Test implements Auto_const
{
  
public WebDriver driver;
  static
  {
	  System.setProperty(GECKO_KEY,GECKO_VALUE);
	 // System.setProperty(CHROME_KEY, CHROME_VALUE);
	  
  }
 //@Parameters({"browser"})
  @BeforeMethod
  public void openApp() throws FileNotFoundException, IOException
  {
//	  if(browser.equals("Firefox"))
//     {
	  driver=new FirefoxDriver();
	  Generic_propertyfile gp=new Generic_propertyfile();
	  String url = gp.propertyfile("./pf.properties", "url");
	  driver.get(url);
	  //driver.get("https://in.puma.com/");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//     }else{
//	  driver=new ChromeDriver();
//	  //driver.get("https://in.puma.com/");
//	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//     }
  }
  @AfterMethod
  public void closeApp(ITestResult res)
  {
	  int status = res.getStatus();
	  String tcname = res.getName();
	  if(status==2)
	  {
		  Genericscreenshot.getPhoto(driver,tcname);
	  }
	 driver.quit();
  }
  
}
