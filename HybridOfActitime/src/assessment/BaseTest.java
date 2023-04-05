package assessment;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest implements TestI
{
     static WebDriver driver;
     public void openBrowser() throws IOException
     {
    	 Aflib flib=new Aflib();
    	String browser = flib.readPropertiesData(PROP_PATH, "Browser");
        String url = flib.readPropertiesData(PROP_PATH, "Url");
        
        if(browser.equals("chrome"))
        {   
       	 ChromeOptions op=new ChromeOptions();
  	     op.addArguments("--remote-allow-origins=*");
  	   
        	driver=new ChromeDriver(op);
        	driver.manage().window().maximize();
        	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        	driver.get(url);
        }
        
        else
        {
        	System.out.println("Enter valid browser");
        }
     }
     
     public void closeBrowser()
     {
    	 driver.quit();
     }
}
