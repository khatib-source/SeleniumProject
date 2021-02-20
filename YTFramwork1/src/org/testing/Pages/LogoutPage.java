package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogoutPage 
{
	public ChromeDriver objdriver ;
	public Properties  objpr ;
	
	
	public LogoutPage(ChromeDriver objdriver, Properties objpr) 
	{
		
		this.objdriver = objdriver;
		this.objpr = objpr;
	}	
	public void Signout() throws InterruptedException
	{
	
	        // code to logout		
			Thread.sleep(10000); 
			WebElement objlogoutimg = objdriver.findElement(By.xpath(objpr.getProperty("logout-img")));
			objlogoutimg.click();
			WebElement objlogouttext = objdriver.findElement(By.xpath(objpr.getProperty("Signout")));
			objlogouttext.click();				
			
	}

}
