package testPackage;



import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.CustomListner;
import genericPackage.Flib;
import pagePackage.LoginPage;
@Listeners(CustomListner.class)
public class ActiTimeValidLogin extends BaseTest{
	
	@Test
	public void validTest() throws IOException, InterruptedException
	{
		Flib flib = new Flib();
		LoginPage lp = new LoginPage(driver);
		lp.ActiTimeInvalid(flib.readPropertiesData(PROP_PATH, "Username"),flib.readPropertiesData(PROP_PATH, "Password"));
		
	}

}

