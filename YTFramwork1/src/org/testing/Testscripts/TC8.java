package org.testing.Testscripts;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testing.Base.Base;
import org.testing.Pages.LoginPage;
import org.testing.Pages.LogoutPage;
import org.testing.Pages.VideoPlayPage;
import org.testng.annotations.*;

public class TC8 extends Base
{
	@Test
	public void TestCase8()
	{	
		try
		{
		LoginPage objloginpage = new LoginPage(objdriver, objpr);
		LogoutPage objlogout = new LogoutPage(objdriver, objpr);		
			 
		String username="khatib1.beg1@gmail.com";
		String password ="khatib#123";
		objloginpage.SignIn(username, password);
		
		// code to click the library 
		Thread.sleep(10000);
		WebElement objWatchlibrary = objdriver.findElement(By.xpath(objpr.getProperty("yt-librarylink")));
		objWatchlibrary.click();
		
		// code to logout		
		Thread.sleep(10000);
		objlogout.Signout();
		
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}


}
