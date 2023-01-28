package testPackage;

import java.io.IOException;

import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.Flib;
import pagePackage.LoginPage;
import pagePackage.UsersPage;

public class ActiTimeCreateUser extends BaseTest {
	
	@Test
	public void CreateUser() throws InterruptedException, IOException
	{      
		Flib flib = new Flib();
		 LoginPage lp = new LoginPage(driver);
		 
		 lp.ActitimeValidInput(flib.readPropertiesData(PROP_PATH, "Username"),flib.readPropertiesData(PROP_PATH, "Password"));
		 
		   UsersPage up = new  UsersPage(driver);
		   
		    up.CreateUser1(); // 1
		    up.CreateUser2(flib.readExcelData(EXCEL_PATH, "userdata",1, 0),flib.readExcelData(EXCEL_PATH,"userdata",1,1));
		    up.CreateUser3(flib.readExcelData(EXCEL_PATH,"userdata",1,1));
		    up.CreateUser4(flib.readExcelData(EXCEL_PATH,"userdata",1,2), flib.readExcelData(EXCEL_PATH,"userdata",1,3));
		    up.CreateUser5();
		 
		   
		
	}
	


}
