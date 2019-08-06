package genericmethods;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Generic_Select
{
  Select s;
  public Generic_Select(WebElement ele)
  {
	     s=new Select(ele);
  }
  public void selectIndex(int i)
	{
	     s.selectByIndex(i);
	}
	public void selectVisible(String str)
	{
         s.selectByVisibleText(str);
	}
	public void selectValue(String value)
	{
	     s.selectByValue(value);
	}
	public void deselectAl()
	{
	     s.deselectAll();
	}
	public void deselectIndex(int i)
	{
	     s.deselectByIndex(i);
	}
	public void deselectvalue(String value)
	{
	     s.deselectByValue(value);
	}
	public void isMultiple1()
	{
		 s.isMultiple();
	}
	public List<WebElement> alloptions()
	{
		List<WebElement> options = s.getOptions();
		return options;
		
	}
}
