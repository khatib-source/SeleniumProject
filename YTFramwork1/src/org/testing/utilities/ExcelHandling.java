package org.testing.utilities;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHandling 
{	

	public void ReadDataBasedUponRowNumberandColumnNumber(int r, int c) throws IOException 
	{
		
		File f = new File("../YTFramwork1/Read.xlsx");		
		FileInputStream fi = new FileInputStream(f);
		XSSFWorkbook xs = new XSSFWorkbook(fi);
		XSSFSheet  xt = xs.getSheetAt(0);
		XSSFRow objr =  xt.getRow(r);
		XSSFCell objcell= objr.getCell(c);
		objcell.getStringCellValue();
		System.out.println(objcell.getStringCellValue());

	}
	
	public void ReaddataBaseUponRowNumber( int rownumber) throws IOException
	{
		
		File f = new File("../YTFramwork1/Read.xlsx");		
		FileInputStream fi = new FileInputStream(f);
		XSSFWorkbook xs = new XSSFWorkbook(fi);
		XSSFSheet  xt = xs.getSheetAt(0);
		int r = xt.getPhysicalNumberOfRows();		
		for(int i=0; i<r; i++)
		{
			if ( i == rownumber )
			{
			XSSFRow objr =  xt.getRow(i);
			int c = objr.getPhysicalNumberOfCells();
			for(int j=0; j<c ;j++)
			{			
				XSSFCell objcell= objr.getCell(j);
			    int celltype =	objcell.getCellType();
				if (celltype == 1)
			    System.out.println(objcell.getStringCellValue());
				else 
				System.out.println(objcell.getNumericCellValue());
				
			}
			}
			
		}		
	}

	public static  void ReadDataBasedUponRange( int initialrow, int endrow) throws IOException
	{
		
		File f = new File("../Automation_ApacheyPOI/Read.xlsx");		
		FileInputStream fi = new FileInputStream(f);
		XSSFWorkbook xs = new XSSFWorkbook(fi);
		XSSFSheet  xt = xs.getSheetAt(0);
		int r = xt.getPhysicalNumberOfRows();		
		for(int i=0; i<r; i++)
		{
			if ( i >= initialrow && i<= endrow )
			{
			XSSFRow objr =  xt.getRow(i);
			int c = objr.getPhysicalNumberOfCells();
			for(int j=0; j<c ;j++)
			{			
				XSSFCell objcell= objr.getCell(j);
			    int celltype =	objcell.getCellType();
				if (celltype == 1)
			    System.out.println(objcell.getStringCellValue());
				else 
				System.out.println(objcell.getNumericCellValue());
				
			}
			}

	}

	}

}
