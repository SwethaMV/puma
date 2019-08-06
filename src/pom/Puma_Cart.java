package pom;

import java.util.Set;

import generics.Auto_const;
import generics.Base_Page;
import generics.GenericActions;
import generics.Generic_webelement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Puma_Cart extends Base_Page
{
	public WebDriver driver;
	
  public Puma_Cart(WebDriver driver) {
	  
	  super(driver);
	  this.driver=driver;
		
		// TODO Auto-generated constructor stub
	}
@FindBy(xpath="//a[.=' WOMEN ']")//mousehover on women
  private WebElement w1;
  @FindBy(xpath="(//a[.='Running'])[8]")//click on running
  private WebElement r1;
  @FindBy(xpath="(//li[@class='item last']/div/h2/a)[3]")//select 3rd shoe and click on it
  private WebElement s1 ;
//  @FindBy(xpath="(//span[@class='swatch-label2'])[2]")
//  private WebElement size;
//  @FindBy(xpath="//button[@title='Add to Cart']")
//  private WebElement cart;

  public void addtoCart() throws InterruptedException
  {
	  
	  GenericActions ga=new GenericActions(driver);
	  
	  ga.moveEle(w1);
	  Generic_webelement gw=new Generic_webelement();
	  gw.clk(r1);
	  Set<String> wh1 = driver.getWindowHandles();
	  for(String sw1:wh1)
	  {
		  driver.switchTo().window(sw1);
	  }
	  Thread.sleep(2000);
	  gw.clk(s1);
	  Set<String> wh = driver.getWindowHandles();
	  for (String sw : wh) 
	  {
		driver.switchTo().window(sw);
	  }
//	  Thread.sleep(3000);
//	  gw.clk(size);
//	  gw.clk(cart);
  }
  
}
