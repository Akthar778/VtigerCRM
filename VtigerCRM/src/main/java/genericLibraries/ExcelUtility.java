package genericLibraries;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class ExcelUtility implements IAutoConstants {

	public String readingSingleData(String sheetName, int rowNum, int colNum)
			throws EncryptedDocumentException, IOException {
		File file = new File(EXCELFILE);
		Workbook workbook = WorkbookFactory.create(file);
		return workbook.getSheet(sheetName).getRow(rowNum).getCell(colNum).toString();
	}

	@DataProvider(name = "testdata")

	public Object[][] readingMutipleData() throws EncryptedDocumentException, IOException {
		// Giving Path
		File file = new File(EXCELFILE);

		// converting into workbook and add it
		Workbook workbook = WorkbookFactory.create(file);

		// getting sheetName
		Sheet sheet = workbook.getSheet("Sheet2");

		// getting all rows in the form of int
		int rowCount = sheet.getPhysicalNumberOfRows();

		// getting all the cells in the form of int
		int cellCount = sheet.getRow(0).getPhysicalNumberOfCells();

		// here storing in array Object
		Object[][] data = new Object[rowCount][cellCount];

		// retriving the data
		Row actualRow;

		for (int row = 0; row < rowCount; row++) {
			// taking all rows which are present in sheet
			actualRow = sheet.getRow(row);

			for (int cell = 0; cell < actualRow.getLastCellNum(); cell++) {
				// taking all cells - storing in array
				data[row][cell] = actualRow.getCell(cell).toString();
			}
		}

		// returing the all data
		return data;

	}

}
