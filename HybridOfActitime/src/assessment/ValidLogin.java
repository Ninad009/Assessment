package assessment;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class ValidLogin extends BaseTest
{
    public static void main(String[] args) throws IOException 
    {
		BaseTest bt=new BaseTest();
		    bt.openBrowser();
		    
		    Aflib flib=new Aflib();
		    
		    
			Data d=new Data(driver);
			
			d.validLogin(flib.readPropertiesData(PROP_PATH, "Email"),flib.readPropertiesData(PROP_PATH, "Password") );
		    
	}
}

