package generics;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class GenericActions
{
	Actions a;
	  
	  public GenericActions(WebDriver driver)
	  {
		    a=new Actions(driver);
	  }
	  public void moveEle(WebElement ele)
		{
			a.moveToElement(ele).perform();
		}
		public void dragdrop(WebElement e1,WebElement e2)
		{
			a.dragAndDrop(e1,e2).perform();
		}
		public void doubleclickaction(WebElement block)
		{
			a.doubleClick(block).perform();
		}
		public void rightclick(WebElement ele)
		{
			a.contextClick(ele).perform();
		}
		public void newtab(WebElement tab)
		{
			a.sendKeys(Keys.CONTROL).click(tab).perform();
		}
		public void newwindow(WebElement tab)
		{
			a.sendKeys(Keys.SHIFT).click(tab).perform();
		}
}
