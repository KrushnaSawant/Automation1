package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * This class contains all the generic methods for read data from property and excel sheet.
 * @author Krushna Sawant
 *
 */
public class GenericMethods {
	/**
	 * This method is a non static method designed to read data from property file.
	 * @param key
	 * @return
	 * @throws IOException
	 */
public String readDataFromProperty(String key) throws IOException {
	FileInputStream fis = new FileInputStream("./Testdata/commondata.property");
	Properties p = new Properties();
	p.load(fis);
	String value = p.getProperty(key);
	return value;
}
	/**
	 * This is a non static method used to read data from excel sheet.
	 * @param sheetname
	 * @param row
	 * @param cell
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String readDataFromExcel(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException {
	FileInputStream fis = new FileInputStream("./Testdata/AutomationTestdata.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	String value = wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
	return value;
	

	}
			

}
