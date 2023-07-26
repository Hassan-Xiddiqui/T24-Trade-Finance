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

public class InputFranklinMachineVendorDetails extends BaseClass {

    @Test(groups = {"ImportInputter"}, dataProvider = "InputFranklinMachineVendorDetails")
    public void InputFranklinMachineVendorDetails(Map<String, String> testData) throws IOException {

        PageObject.menu_Dropdown("FRANKLIN MACHINE");
        PageObject.menu_Link("Input Franklin Machine Vendor Details ");
        PageObject.switchToChildWindow();
        driver.manage().window().maximize();
        PageObject.textinput_Locator("transactionId","TF1922800080");
        PageObject.img_Button("Edit a contract");
        PageObject.switchToChildWindow();
        PageObject.textinput_Locator("fieldName:NAME",testData.get("NAME"));
        PageObject.textinput_Locator("fieldName:ADDRESS",testData.get("ADDRESS"));
        PageObject.textinput_Locator("fieldName:COMM.TYPE",testData.get("COMM.TYPE"));
        PageObject.textinput_Locator("fieldName:COMM.RATE",testData.get("COMM.RATE"));
        PageObject.textinput_Locator("fieldName:LICENSE.VALIDITY",testData.get("LICENSE.VALIDITY"));
        PageObject.textinput_Locator("fieldName:VEN.COUNTRY",testData.get("VEN.COUNTRY"));
        PageObject.textinput_Locator("fieldName:PO.NUMBER:1",testData.get("PO.NUMBER"));
        PageObject.textinput_Locator("fieldName:PO.AMOUNT:1",testData.get("PO.AMOUNT"));
        PageObject.textinput_Locator("fieldName:PO.DATE:1",testData.get("PO.DATE"));
        PageObject.textinput_Locator("fieldName:LETTER.NO",testData.get("LETTER.NO"));
        PageObject.textinput_Locator("fieldName:LETTER.DATE",testData.get("LETTER.DATE"));
        PageObject.textinput_Locator("fieldName:CHALLAN.NO",testData.get("CHALLAN.NO"));
        PageObject.textinput_Locator("fieldName:CHALLAN.DATE",testData.get("CHALLAN.DATE"));
        PageObject.textinput_Locator("fieldName:FT.STAMP",testData.get("FT.STAMP"));
        PageObject.textinput_Locator("fieldName:FT.EXPENSE",testData.get("FT.EXPENSE"));



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
