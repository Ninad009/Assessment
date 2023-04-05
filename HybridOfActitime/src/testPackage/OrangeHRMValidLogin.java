package testPackage;

import java.io.IOException;

import org.testng.annotations.Test;

import genericPackage.BaseTestHRM;
import genericPackage.Flib;
import pagePackage.HRMValidLogin;

public class OrangeHRMValidLogin extends BaseTestHRM {
	@Test
	
	public void login() throws InterruptedException, IOException {
		Flib flib = new Flib();
	HRMValidLogin lp = new	HRMValidLogin(driver);
	
	lp.Login(flib.readPropertiesData(PROP_PATH, "Username"),flib.readPropertiesData(PROP_PATH, "Password"));
	

	}
	

}
