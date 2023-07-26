package Test.Scripts.Conventional.Import;

import POM.PageObject;
import Test.General.BaseClass;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FTForPrepaidExpense extends BaseClass {

    @Test(groups = {"ImportInputter"}, dataProvider = "FTForPrepaidExpense")
    public void FTForPrepaidExpense(Map<String, String> testData) throws IOException {

        PageObject.menu_Dropdown("FRANKLIN MACHINE");
        PageObject.menu_Link("FT For Prepaid Expense ");
        PageObject.switchToChildWindow();
        driver.manage().window().maximize();
        PageObject.img_Button("New Deal");
        PageObject.switchToChildWindow();
        //PageObject.textinput_Locator("fieldName:TRANSACTION.TYPE",testData.get("TRANSACTION.TYPE"));
        //PageObject.textinput_Locator("fieldName:DEBIT.ACCT.NO",testData.get("DEBIT.ACCT.NO"));
        PageObject.textinput_Locator("fieldName:DEBIT.CURRENCY",testData.get("DEBIT.CURRENCY"));
        PageObject.textinput_Locator("fieldName:DEBIT.AMOUNT",testData.get("DEBIT.AMOUNT"));
        PageObject.textinput_Locator("fieldName:DEBIT.VALUE.DATE",testData.get("DEBIT.VALUE.DATE"));
        PageObject.textinput_Locator("fieldName:DEBIT.THEIR.REF",testData.get("DEBIT.THEIR.REF"));
        PageObject.textinput_Locator("fieldName:ORDERING.CUST:1",testData.get("ORDERING.CUST"));
        PageObject.textinput_Locator("fieldName:CREDIT.ACCT.NO",testData.get("CREDIT.ACCT.NO"));
        PageObject.textinput_Locator("fieldName:CREDIT.CURRENCY",testData.get("CREDIT.CURRENCY"));
        PageObject.textinput_Locator("fieldName:CREDIT.AMOUNT",testData.get("CREDIT.AMOUNT"));
        PageObject.textinput_Locator("fieldName:CREDIT.VALUE.DATE",testData.get("CREDIT.VALUE.DATE"));
        PageObject.textinput_Locator("fieldName:CREDIT.THEIR.REF",testData.get("CREDIT.THEIR.REF"));
        PageObject.textinput_Locator("fieldName:ORDERING.BANK:1",testData.get("ORDERING.BANK"));

    }
    private static final String FILE_PATH = "path/to/your/excel/file.xlsx"; // Update with your file path
    @DataProvider(name = "excelData")
    public Object[][] readExcelData() throws IOException {
        FileInputStream fis = new FileInputStream(FILE_PATH);
        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheetAt(0); // Assuming data is in the first sheet
        int rowCount = sheet.getPhysicalNumberOfRows();
        int colCount = sheet.getRow(0).getPhysicalNumberOfCells();
        Object[][] data = new Object[rowCount - 1][1]; // One column to store the HashMap

        for (int i = 1; i < rowCount; i++) { // Start from row 1 to exclude header row
            Row row = sheet.getRow(i);
            Map<String, String> map = new HashMap<String, String>();
            for (int j = 0; j < colCount; j++) {
                Cell cell = row.getCell(j);
                DataFormatter formatter = new DataFormatter();
                String value = formatter.formatCellValue(cell);
                map.put(sheet.getRow(0).getCell(j).toString(), value); // Assuming the first row contains column names
            }
            data[i - 1][0] = map;
        }

        workbook.close();
        fis.close();
        return data;
    }
}
