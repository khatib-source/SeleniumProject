package org.testing.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotCapture 
{
	public  static void TakeScreenshot(ChromeDriver objdriver, String Path) throws IOException
	{
		File objfile = objdriver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(objfile, new  File(Path));		
	}

}
