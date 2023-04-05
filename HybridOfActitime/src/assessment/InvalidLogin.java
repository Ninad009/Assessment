package assessment;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class InvalidLogin extends BaseTest
{
     public static void main(String[] args) throws IOException, InterruptedException
     {
		 BaseTest bt=new BaseTest();
		   bt.openBrowser();
		   
		   Aflib flib=new Aflib();
		   
		   Data d=new Data(driver);
		   
		  int rc = flib.rowCount(EXCEL_PATH, "InvalidData");
		   
		   for(int i=1;i<=rc;i++)
		   {
			   String email = flib.readExcelData(EXCEL_PATH, "InvalidData", i,0);
			  String password = flib.readExcelData(EXCEL_PATH, "InvalidData",i, i);
			  
			       d.invalidLogin(email, password);
			      
		   }
		   
		   bt.closeBrowser();
	}
}
