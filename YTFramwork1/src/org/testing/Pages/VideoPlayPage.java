package org.testing.Pages;
import java.util.Properties;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class VideoPlayPage 
{
	
	public ChromeDriver objdriver ;
	public Properties  objpr ;	
	
	public VideoPlayPage(ChromeDriver objdriver, Properties objpr) 
	{		
		this.objdriver = objdriver;
		this.objpr = objpr;
	}
	
	public void VideoPlay() throws InterruptedException
	{
		Thread.sleep(15000);
		WebElement objyoutubevideoId = objdriver.findElement(By.xpath(objpr.getProperty("yt-videoid")));
		Actions objActions = new Actions(objdriver);
		String strfirstwindowAddress = objdriver.getWindowHandle();
		Thread.sleep(15000);
		objActions.keyDown(Keys.CONTROL).click(objyoutubevideoId).keyUp(Keys.CONTROL).build().perform();
		Set<String> strAllwindowAddress = objdriver.getWindowHandles();
		for (String str:strAllwindowAddress)
		{
			
		  objdriver.switchTo().window(str);
		}
	}

}
