package org.testing.Base;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import junit.framework.Assert;

public class Base 
{
	public ChromeDriver objdriver;
	public Properties objpr;
	
	
	@BeforeMethod
	public void initi() throws IOException
	{
		
		System.setProperty("webdriver.chrome.driver","../YTFramwork1/chromedriver.exe");
		objdriver = new ChromeDriver();
		
		objdriver.get("https://www.youtube.com/");	
	//	Assert.assertEquals(objdriver.getCurrentUrl(), "https://www.youtube.com/");
		
		
		objdriver.manage().window().maximize();
		
		// Create the properties file 		
		File objfile = new File("../YTFramwork1/Object.properties");
		objpr = new Properties();
		FileReader objfr = new FileReader(objfile);
		objpr.load(objfr);
		
	}
	
	@AfterMethod
	public void After()
	{
	  objdriver.quit();
	}
	
	
	

}
