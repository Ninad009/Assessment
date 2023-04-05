package assessment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Data
{
     @FindBy (xpath="//input[@type='text']") private  WebElement username;
     @FindBy (xpath="//input[@type='password']") private WebElement password;
     @FindBy (xpath="//button[.='Submit']") private WebElement button;
     
     public Data(WebDriver driver)
     {
    	 PageFactory.initElements(driver, this);
     }

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getButton() {
		return button;
	}
     
     public void validLogin(String user,String pass)
     {
    	 username.sendKeys(user);
    	 password.sendKeys(pass);
    	 button.click();
    	 
     }
     
     public void invalidLogin(String user,String pass) throws InterruptedException
     {
    	 username.sendKeys(user);
    	 Thread.sleep(2000);
    	 password.sendKeys(pass);
    	 Thread.sleep(2000);
    	 button.click();
    	 username.clear();
    	 password.clear();
    	 
     }
}
