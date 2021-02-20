package DataProviderPackage;
import java.io.File;
import java.io.IOException;
import org.apache.poi.hslf.model.Sheet;
import org.testing.Base.Base;
import org.testing.Pages.LoginPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import jxl.Cell;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class TestCase1 extends Base
 {	//
	@Test(dataProvider="ReadData")
	public void login(String username, String Password) throws InterruptedException
	{
		if (username !=null && Password!=null   )
		{
			LoginPage obj = new LoginPage(objdriver, objpr);			
			obj.SignIn(username, Password);
			objdriver.navigate().back();
		}
	}

	@DataProvider
	public Object[][] ReadData() throws BiffException, IOException
	{
		
		File objfile = new File("../YTFramwork1/MultiuserCredentials.xls");
		Workbook Objworkbook = Workbook.getWorkbook(objfile);
		jxl.Sheet objsheet =  Objworkbook.getSheet(0);
		int Rows  = objsheet.getRows();
		int  col = objsheet.getColumns();		
		Object Obj[][] = new Object[Rows][col];		
		for(int i=0; i<Rows; i++)		
		{
			for(int j=0 ; j<col; j++)
			{
				if (i>0 )
				{
				Cell objcell = objsheet.getCell(j, i);
				Obj[i][j] = objcell.getContents();
				}
				
			}
			
		}
		return Obj;	
	}	
	
}