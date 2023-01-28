package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(name = "username")
	private WebElement UsernameTB;
	@FindBy(name = "pwd")
	private WebElement PasswordTB;
	@FindBy(id = "loginButton")
	private WebElement loginButton;
	@FindBy(id = "keepLoggedInCheckBox")
	private WebElement keepLoggedInCheckBox;
	@FindBy(xpath = "//a[.='Actimind Inc.']")
	private WebElement ActiMindLink;
	@FindBy(id = "licenseLink")
	private WebElement licenseLink;

	//
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	// utilization

	public WebElement getUsernameTB() {
		return UsernameTB;
	}

	public WebElement getPasswordTB() {
		return PasswordTB;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getKeepLoggedInCheckBox() {
		return keepLoggedInCheckBox;
	}

	public WebElement getActiMindLink() {
		return ActiMindLink;
	}

	public WebElement getLicenseLink() {
		return licenseLink;
	}

	public void ActitimeValidInput(String username, String password) throws InterruptedException {
		UsernameTB.sendKeys(username);
		Thread.sleep(3000);
		PasswordTB.sendKeys(password);
		loginButton.click();
	}

	public void ActiTimeInvalid(String invalidusername, String invalidpassword) throws InterruptedException {
		UsernameTB.sendKeys(invalidusername);
		Thread.sleep(3000);
		PasswordTB.sendKeys(invalidpassword);
		Thread.sleep(3000);
		loginButton.click();
		Thread.sleep(2000);
		UsernameTB.clear();
	}

}
