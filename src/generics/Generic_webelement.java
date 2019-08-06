package generics;

import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;

public class Generic_webelement
{
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
	public void sendData(WebElement ele,String s)
	{
		ele.sendKeys(s);
	}
}
