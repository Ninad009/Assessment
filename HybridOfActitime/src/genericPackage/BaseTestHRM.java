package genericPackage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTestHRM implements IHRM {
public 	static WebDriver driver;

	@BeforeMethod
	public void setUp() throws IOException {
		Flib flib = new Flib();
		String BrowserValue = flib.readPropertiesData(PROP_PATH, "Browser");
		String url = flib.readPropertiesData(PROP_PATH, "URL");

		if (BrowserValue.equals("chrome")) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(url);
		}

		else {
			System.out.println("Use valid Browser");
		}

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
