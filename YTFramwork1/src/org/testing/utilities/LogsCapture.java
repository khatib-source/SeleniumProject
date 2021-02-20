package org.testing.utilities;
import org.apache.log4j.xml.DOMConfigurator;

public class LogsCapture 
{
	public static void takeLogs(String message, String Classname)
	{
		// configure the layoutfile 
		DOMConfigurator.configure("../YTFramwork1/Layout.xml");
		org.apache.log4j.Logger l = org.apache.log4j.Logger.getLogger(Classname);
		l.info(message);		
	}

}
