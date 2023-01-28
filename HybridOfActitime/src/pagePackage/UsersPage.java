package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPage {
	@FindBy(xpath="(//img[@class='sizer'])[3]") 
	private WebElement userTab;
	@FindBy(xpath = "//input[@type='button' and (@value='Create New User')]")
	private WebElement userButton;
	@FindBy(name = "username")
	private WebElement Username;
	@FindBy(name = "passwordText")
	private WebElement Password;
	@FindBy(name = "passwordTextRetype")
	private WebElement ReType;
	@FindBy(name = "firstName")
	private WebElement Firstname;
	@FindBy(name = "lastName")
	private WebElement lastname;
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement createButton;
	@FindBy(xpath = "//input[@type='button' and  (@value='      Cancel      ')]")
	private WebElement cancelButton;

	public UsersPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getUserTab() {
		return userTab;
	}

	public WebElement getUserButton() {
		return userButton;
	}

	public WebElement getUsername() {
		return Username;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getReType() {
		return ReType;
	}

	public WebElement getFirstname() {
		return Firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getCreateButton() {
		return createButton;
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}

	// operational method

	public void CreateUser1() throws InterruptedException {
		userTab.click();
		Thread.sleep(2000);
		userButton.click();
		}
		public void CreateUser2(String usn, String pass) throws InterruptedException {
		Username.sendKeys(usn);
		Thread.sleep(3000);
		Password.sendKeys(pass);
		}
		public void CreateUser3(String pass) throws InterruptedException
		{
		ReType.sendKeys(pass);
		Thread.sleep(3000);
		
	}
		public void CreateUser4(String fname,String lname)
		{
			Firstname.sendKeys(fname);
			lastname.sendKeys(lname);
		}
		public void CreateUser5() {
			createButton.click();
		}

}
