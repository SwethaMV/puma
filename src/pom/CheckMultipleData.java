package pom;

import generics.Base_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.DataProvider;

public class CheckMultipleData extends Base_Page
{
	
	@FindBy(xpath="(//a[.='Sign In'])[2]")
	private WebElement s1;
	@FindBy(xpath="//input[@name='socialogin_email']")
	   private WebElement t1;
	   @FindBy(name="socialogin_password")
	   private WebElement t2;
	   @FindBy(xpath="(//span[.='Login'])[2]")
	   private WebElement b;
	   @FindBy(xpath="//a[.='My Account']")
	   private static WebElement acct;
	   public CheckMultipleData(WebDriver driver)
	   {
		   super(driver);
		  // PageFactory.initElements(driver, this);
	   }
	   
	   public void login(String id,String pwd)
	   {
		   
		   s1.click();
		   t1.sendKeys(id);
		   t2.sendKeys(pwd);
		   b.click();
	   }
	   public static void gettheText()
	   {
		   String text = acct.getText();
		   System.out.println(text);
	   }
}
