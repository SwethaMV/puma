package scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import pom.Puma_Cart;
import pom.Puma_Homepage;
import pom.Puma_login;
import generics.Generic_Excel;
import generics.Generic_Test;

public class HomepageVerify extends Generic_Test 
{
  @Test
  public void testlogintoPuma()
  {
	driver.get("https://in.puma.com/");
	String id1 = Generic_Excel.readData("Puma_Test", 1, 0);
	String pwd1 = Generic_Excel.readData("Puma_Test", 1, 1);
	Puma_login p=new Puma_login(driver);
	p.login(id1,pwd1);
	String title=driver.getTitle();
	Reporter.log(title,true);
	String hometitle = Generic_Excel.readData("Puma_Test", 1, 2);
	p.verifyTitle(hometitle);
	
	Puma_Homepage ph=new Puma_Homepage(driver);
	ph.logout();
	
	
  }
}
