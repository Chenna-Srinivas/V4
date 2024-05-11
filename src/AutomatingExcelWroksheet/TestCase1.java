package AutomatingExcelWroksheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class TestCase1 {
@Test
public void tcc() throws EncryptedDocumentException, IOException {
	
	FileInputStream fs = new FileInputStream("C:\\Program Files\\ECLIPSE PROJECTS\\Selenium_V4\\ExcelSheetss\\TrainersandSubs.xlsx");
	Workbook w = WorkbookFactory.create(fs);
	Sheet s = w.getSheet("sheet1");
	
	int rowsize = s.getPhysicalNumberOfRows();
	int cellsize = s.getRow(0).getPhysicalNumberOfCells();
	
	String data1 = null;
	for (int i = 0; i < rowsize; i++) {
		for (int j = 0; j < cellsize; j++) {
			data1 = s.getRow(i).getCell(j).toString();
			
			System.out.print(data1+" ");
		}
		System.out.println();
	}
	}
}
