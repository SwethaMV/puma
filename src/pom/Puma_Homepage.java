package pom;

import generics.Base_Page;
import generics.GenericActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Puma_Homepage extends Base_Page
{
	@FindBy(xpath="//a[.='My Account']")
	private WebElement acct;
	@FindBy(xpath="//a[.='Sign Out']")
	private WebElement exit;
	public Puma_Homepage(WebDriver driver)
	{
		super(driver);
	}
	public void logout()
	{
		GenericActions ga=new GenericActions(driver);
		ga.moveEle(acct);
		exit.click();
	}
	
}
