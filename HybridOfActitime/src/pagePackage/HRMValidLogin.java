package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HRMValidLogin {
	@FindBy (name="username") private WebElement user;
	@FindBy (name="password") private WebElement pass;
	@FindBy (xpath="//button[.=' Login ']") private WebElement button;
	
	public HRMValidLogin(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getUser() {
		return user;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getButton() {
		return button;
	}
	
	public void Login(String us,String pa) throws InterruptedException
	{    user.sendKeys(us);
	      Thread.sleep(3000);
	      pass.sendKeys(pa);
	      Thread.sleep(3000);
	      button.click();
	      Thread.sleep(3000);
		
		
	}
	

}
