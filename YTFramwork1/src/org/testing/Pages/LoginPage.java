package org.testing.Pages;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage 
{
	public ChromeDriver objdriver ;
//	public FirefoxDriver objfirefoxdriver;
	public Properties  objpr ;
	
	
	public LoginPage(ChromeDriver objdriver, Properties objpr) 
	{
		
		this.objdriver = objdriver;
		this.objpr = objpr;   
	}
	/*
	public LoginPage(FirefoxDriver objdriver, Properties objpr) 
	{
		
		this.objfirefoxdriver = objdriver;
		this.objpr = objpr;   
	}
	*/
	public void SignIn(String username, String Password ) throws InterruptedException
	{
		objdriver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);	
		WebElement objsignIn = objdriver.findElement(By.xpath(objpr.getProperty("google-signin")));
		objsignIn.click();
	     WebElement objsignInEmail = objdriver.findElement(By.xpath(objpr.getProperty("google-signInEmail")));
		 objsignInEmail.sendKeys(username);
		
		WebElement objNext = objdriver.findElement(By.xpath(objpr.getProperty("google-btnNext")));
		objNext.click();		
		 WebElement objemailpassword = objdriver.findElement(By.xpath(objpr.getProperty("google-emailpwd")));
		objemailpassword.sendKeys(Password);		
		Thread.sleep(10000);
		WebElement objbtnNext = objdriver.findElement(By.xpath(objpr.getProperty("google-btnNext1")));
		objbtnNext.click();
		
		
	}	
	

}
