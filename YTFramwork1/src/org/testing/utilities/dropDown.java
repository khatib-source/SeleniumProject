package org.testing.utilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class dropDown 
{
	public static void DropdownselectionByIndex(WebElement objelement , int indexnumber)
	{
		Select objselect = new Select(objelement);
		objselect.selectByIndex(indexnumber);		
		
	}
	public static void DropdownselectionByValue(WebElement objdropmonth , String value)
	{				
		Select objmonth = new Select(objdropmonth);
		objmonth.selectByValue(value);		
			
	}
	public static void DropdownselectionByVisibleText(WebElement objdropyear , String text)
	{
		
		Select objyear = new Select(objdropyear);
		objyear.selectByVisibleText(text);		
	}


}
