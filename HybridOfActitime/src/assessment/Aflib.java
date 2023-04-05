package assessment;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Aflib {
	public String readExcelData(String path, String sheetname, int row1, int cell1) throws EncryptedDocumentException, IOException
	 {
		FileInputStream file = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(file);
		Sheet sheet = wb.getSheet(sheetname);
		Row row = sheet.getRow(row1);
		Cell cell = row.getCell(cell1);
		String data = cell.getStringCellValue();
		return data;
	}
	
	public int rowCount(String path, String sheetname) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(file);
		Sheet sheet = wb.getSheet(sheetname);
		int rc = sheet.getLastRowNum();
		return rc;
	}
	
	public String readPropertiesData(String propath, String Keyvalue) throws IOException {
		FileInputStream file = new FileInputStream(propath);

		Properties prop = new Properties();
		prop.load(file);

		String data = prop.getProperty(Keyvalue);
		return data;
	}
	
}