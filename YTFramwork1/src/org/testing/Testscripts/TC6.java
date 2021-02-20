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

public class TC6 extends Base
{
	
	@Test
	public void TestCase6()
	{
	
		try
		{
		 VideoPlayPage objVideo = new VideoPlayPage(objdriver, objpr);
		 LoginPage objloginpage = new LoginPage(objdriver, objpr);
		 LogoutPage objlogout = new LogoutPage(objdriver, objpr);		
			 
		 String username="khatib1.beg1@gmail.com";
		 String password ="khatib#123";
		 // code to login page
		 objloginpage.SignIn(username, password);
			 
	    // code to play video
		objVideo.VideoPlay();
		Thread.sleep(15000);
		Actions objActions = new Actions(objdriver);
		objActions.sendKeys(Keys.PAGE_DOWN).perform();
		
		// code to comments on a video 
		Thread.sleep(10000);
		WebElement objComments = objdriver.findElement(By.xpath(objpr.getProperty("yt-enablecommentsbox")));
		objComments.click();
		Thread.sleep(10000);
		WebElement objCommentdiv = objdriver.findElement(By.xpath(objpr.getProperty("yt-commentbox")));
		objCommentdiv.sendKeys("Nice song");	
		
		WebElement objbtnComments = objdriver.findElement(By.xpath(objpr.getProperty("yt-btncomment")));
		objbtnComments.click();
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
