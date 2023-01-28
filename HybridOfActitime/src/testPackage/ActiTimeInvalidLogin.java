package testPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.Flib;
import pagePackage.LoginPage;

public class ActiTimeInvalidLogin extends BaseTest {
	@Test
	public void InvalidLogin() throws EncryptedDocumentException, IOException, InterruptedException {
		Flib flib = new Flib();
		LoginPage lp = new LoginPage(driver);

		int rc = flib.rowCount(EXCEL_PATH, "invalidcreds");

		for (int i = 1; i <= rc; i++) {
			String usn = flib.readExcelData(EXCEL_PATH, "invalidcreds", i, 0);
			String pass = flib.readExcelData(EXCEL_PATH, "invalidcreds", i, 1);

			lp.ActiTimeInvalid(usn, pass);

		}

	}

}
