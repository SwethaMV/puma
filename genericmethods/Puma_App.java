package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Puma_App 
{
	@FindBy(xpath="(//a[.='Sign In'])[2]")
	private WebElement s1;
	@FindBy(xpath="(//input[@type='text'])[2]")
	   private WebElement t1;
	   @FindBy(xpath="//input[@type='password']")
	   private WebElement t2;
	   @FindBy(xpath="(//span[.='Login'])[3]")
	   private WebElement b;
	   public Puma_App(WebDriver driver)
	   {
		   PageFactory.initElements(driver, this);
	   }
//	   public void clickaction()
//	   {
//		   log.click();
//	   }
	   public void setmobile(String mob)
	   {
		   t1.sendKeys(mob);
	   }
	   public void setPassword(String pwd)
	   {
		   t2.sendKeys(pwd);
	   }
	   public void clicking()
	   {
		   b.click();
	   }
}
