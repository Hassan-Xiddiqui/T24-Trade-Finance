package Test.Scripts.IBG.Guarantee;

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

public class GuaranteeLetters extends BaseClass {

    @Test(groups = {"IBGGuaranteeInputter"}, dataProvider = "GuaranteeGenuinenessConfirmation")
    public void GuaranteeGenuinenessConfirmation(Map<String, String> testData) throws IOException{

        PageObject.menu_Dropdown("Guarantee Letters",1);
        PageObject.menu_Link("Gtee Genuiness Confirmation Letter  MT799 ");
        PageObject.switchToChildWindow();
        driver.manage().window().maximize();
        PageObject.img_Button("New Deal");
        PageObject.switchToChildWindow();
        PageObject.textinput_Locator("fieldName:TXN.REFERENCE",testData.get("TXN.REFERENCE"));
        PageObject.textinput_Locator("fieldName:CUSTOMER.NO",testData.get("CUSTOMER.NO"));
        PageObject.textinput_Locator("fieldName:RECV.ADDR:1",testData.get("RECV.ADDR"));
        PageObject.textinput_Locator("fieldName:REMARK:1",testData.get("REMARK"));
        PageObject.textinput_Locator("fieldName:THEIR.REFERENCE",testData.get("THEIR.REFERENCE"));
        PageObject.textinput_Locator("fieldName:SWIFT.BIC",testData.get("SWIFT.BIC"));
        PageObject.textinput_Locator("fieldName:TRACER.STAT",testData.get("TRACER.STAT"));
        PageObject.textinput_Locator("radio:tab1:TRACER.STAT",testData.get("tab1"));

        PageObject.commitTxn();
        PageObject.commitDeal("GuaranteeGenuinenessConfirmation");

    }

    @Test(groups = {"IBGGuaranteeInputter"}, dataProvider = "AssignmentLetterOtherBank")
    public void AssignmentLetterOtherBank(Map<String, String> testData) throws IOException{

        PageObject.menu_Dropdown("Guarantee Letters",1);
        PageObject.menu_Link("Assignment Letter for Other Bank ");
        PageObject.switchToChildWindow();
        driver.manage().window().maximize();
        PageObject.img_Button("New Deal");
        PageObject.switchToChildWindow();
        PageObject.textinput_Locator("fieldName:TXN.REFERENCE",testData.get("TXN.REFERENCE"));
        PageObject.textinput_Locator("fieldName:CUSTOMER.NO",testData.get("CUSTOMER.NO"));
        PageObject.textinput_Locator("fieldName:RECV.ADDR:1",testData.get("RECV.ADDR"));
        PageObject.textinput_Locator("fieldName:REMARK:1",testData.get("REMARK"));
        PageObject.textinput_Locator("fieldName:THEIR.REFERENCE",testData.get("THEIR.REFERENCE"));
        PageObject.textinput_Locator("fieldName:SWIFT.BIC",testData.get("SWIFT.BIC"));
        PageObject.textinput_Locator("fieldName:TRACER.STAT",testData.get("TRACER.STAT"));
        PageObject.textinput_Locator("radio:tab1:TRACER.STAT",testData.get("tab1"));

        PageObject.form_Tab("Assignment Details");

        //PageObject.textinput_Locator("fieldName:ASSIGN.TYPE",testData.get("ASSIGN.TYPE"));
        PageObject.textinput_Locator("fieldName:ASSIGN.BANK",testData.get("ASSIGN.BANK"));
        PageObject.textinput_Locator("fieldName:ASSIGN.PERSON",testData.get("ASSIGN.PERSON"));
        PageObject.textinput_Locator("fieldName:ASSIGN.TITLE",testData.get("ASSIGN.TITLE"));
        PageObject.textinput_Locator("fieldName:ASSIGN.ADDRESS",testData.get("ASSIGN.ADDRESS"));
        PageObject.textinput_Locator("fieldName:ASSIGN.BANK.REF",testData.get("ASSIGN.BANK.REF"));
        PageObject.textinput_Locator("fieldName:ASSIGN.DATE",testData.get("ASSIGN.DATE"));
        PageObject.textinput_Locator("fieldName:ASSIGN.LET.REF",testData.get("ASSIGN.LET.REF"));
        PageObject.textinput_Locator("fieldName:ASSIGN.LET.DATE",testData.get("ASSIGN.LET.DATE"));

        PageObject.commitTxn();
        PageObject.commitDeal("AssignmentLetterOtherBank");

    }

    @Test(groups = {"IBGGuaranteeInputter"}, dataProvider = "AssignmentLetterOurBank")
    public void AssignmentLetterOurBank(Map<String, String> testData) throws IOException{

        PageObject.menu_Dropdown("Guarantee Letters",1);
        PageObject.menu_Link("Assignment Letter for Our Bank ");
        PageObject.switchToChildWindow();
        driver.manage().window().maximize();
        PageObject.img_Button("New Deal");
        PageObject.switchToChildWindow();
        PageObject.textinput_Locator("fieldName:TXN.REFERENCE",testData.get("TXN.REFERENCE"));
        PageObject.textinput_Locator("fieldName:CUSTOMER.NO",testData.get("CUSTOMER.NO"));
        PageObject.textinput_Locator("fieldName:RECV.ADDR:1",testData.get("RECV.ADDR"));
        PageObject.textinput_Locator("fieldName:REMARK:1",testData.get("REMARK"));
        PageObject.textinput_Locator("fieldName:THEIR.REFERENCE",testData.get("THEIR.REFERENCE"));
        PageObject.textinput_Locator("fieldName:SWIFT.BIC",testData.get("SWIFT.BIC"));
        PageObject.textinput_Locator("fieldName:TRACER.STAT",testData.get("TRACER.STAT"));
        PageObject.textinput_Locator("radio:tab1:TRACER.STAT",testData.get("tab1"));

        PageObject.form_Tab("Assignment Details");

        //PageObject.textinput_Locator("fieldName:ASSIGN.TYPE",testData.get("ASSIGN.TYPE"));
        PageObject.textinput_Locator("fieldName:ASSIGN.BANK",testData.get("ASSIGN.BANK"));
        PageObject.textinput_Locator("fieldName:ASSIGN.PERSON",testData.get("ASSIGN.PERSON"));
        PageObject.textinput_Locator("fieldName:ASSIGN.TITLE",testData.get("ASSIGN.TITLE"));
        PageObject.textinput_Locator("fieldName:ASSIGN.ADDRESS",testData.get("ASSIGN.ADDRESS"));
        PageObject.textinput_Locator("fieldName:ASSIGN.BANK.REF",testData.get("ASSIGN.BANK.REF"));
        PageObject.textinput_Locator("fieldName:ASSIGN.DATE",testData.get("ASSIGN.DATE"));
        PageObject.textinput_Locator("fieldName:ASSIGN.LET.REF",testData.get("ASSIGN.LET.REF"));
        PageObject.textinput_Locator("fieldName:ASSIGN.LET.DATE",testData.get("ASSIGN.LET.DATE"));

        PageObject.commitTxn();
        PageObject.commitDeal("AssignmentLetterOurBank");

    }

    private static final String FILE_PATH = "path/to/your/excel/file.xlsx"; // Update with your file path

    @DataProvider(name = "GuaranteeGenuinenessConfirmation")
    public Object[][] readExcelData1() throws IOException {
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

    @DataProvider(name = "AssignmentLetterOtherBank")
    public Object[][] readExcelData2() throws IOException {
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

    @DataProvider(name = "AssignmentLetterOurBank")
    public Object[][] readExcelData3() throws IOException {
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
