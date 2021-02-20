package org.testing.Testscripts;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testing.Base.Base;
import org.testing.Pages.*;
import org.testing.utilities.LogsCapture;
import org.testing.utilities.ScreenShotCapture;
import org.testng.Assert;
import org.testng.annotations.*;
import Assertions.Assertion;

public class TC1 extends Base 
{

	@Test
	public void TestCase1() throws IOException
	{
	
		try
		{
		  LoginPage objloginpage = new LoginPage(objdriver, objpr);
		  LogoutPage objlogout = new LogoutPage(objdriver, objpr);		  
		  String username="khatib1.beg1@gmail.com";
		  String password ="khatib#123";
		  // Hard Assertion
		  //https://www.youtube.com/
		   Assert.assertEquals(objdriver.getCurrentUrl(), "https://www.youtube.com/");
		   // Code for login  
		   objloginpage.SignIn(username, password);		  
		   
		   // code to take screenshot after login successful 	 	  
		   ScreenShotCapture.TakeScreenshot(objdriver, "../YTFramwork1/Screenshot/TC1_login.png");
		  
		   // Log capture code 
		  LogsCapture.takeLogs("Login successfully for Test case1", "TC1");
		  // code to click on trending  text
		  Thread.sleep(20000);	
		  WebElement objtrending = objdriver.findElement(By.xpath(objpr.getProperty("yt-Trending")));
		  objtrending.click();
		  
		  // code to logout	
		   objlogout.Signout();
		
		}
		catch(Exception e)
		{
			LogsCapture.takeLogs(e.toString(), "TC1");
			
			ScreenShotCapture.TakeScreenshot(objdriver, "../YTFramwork1/Screenshot/TC1_loginfailed.png");
			
			System.out.println(e.toString());
		}
	}
	
	
}
