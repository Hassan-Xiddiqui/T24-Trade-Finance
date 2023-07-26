package Test.Scripts.Conventional.Export;

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

public class LoanAmendDecreasePartialRepayment extends BaseClass {

    @Test(groups = {"ExportInputter"}, dataProvider = "LoanAmendDecPartialRepay")
    public void LoanAmendDecPartialRepay(Map<String, String> testData) throws IOException{

        PageObject.menu_Dropdown("Rupee Base Discounting", 1);
        PageObject.menu_Link("Loan Amend Decrease / Partial Repayment ");
        PageObject.switchToChildWindow();
        driver.manage().window().maximize();
        PageObject.img_Button("New Deal");
        PageObject.switchToChildWindow();
        PageObject.textinput_Locator("fieldName:CUSTOMER.ID",testData.get("CUSTOMER.ID"));
        PageObject.textinput_Locator("fieldName:LC.REF.ID",testData.get("LC.REF.ID"));
        PageObject.textinput_Locator("fieldName:LIMIT.REFERENCE",testData.get("LIMIT.REFERENCE"));
        PageObject.textinput_Locator("fieldName:AMOUNT:1",testData.get("AMOUNT"));
        PageObject.textinput_Locator("fieldName:CURRENCY.CODE:1",testData.get("CURRENCY.CODE"));
        PageObject.textinput_Locator("fieldName:EXCG.RATE:1",testData.get("EXCG.RATE"));
        PageObject.textinput_Locator("fieldName:VALUE.DATE",testData.get("VALUE.DATE"));
        PageObject.textinput_Locator("fieldName:FIN.MAT.DATE",testData.get("FIN.MAT.DATE"));
        PageObject.textinput_Locator("fieldName:INTEREST.RATE:1",testData.get("INTEREST.RATE"));
        PageObject.textinput_Locator("",testData.get("undefined"));
        PageObject.textinput_Locator("fieldName:PRIN.LIQ.ACCT",testData.get("PRIN.LIQ.ACCT"));
        PageObject.textinput_Locator("fieldName:INT.LIQ.ACCT",testData.get("INT.LIQ.ACCT"));
        PageObject.textinput_Locator("fieldName:DEP.REF.ID",testData.get("DEP.REF.ID"));
        PageObject.textinput_Locator("fieldName:LIQUIDATION.MODE",testData.get("LIQUIDATION.MODE"));

        PageObject.form_Tab("Account and Charge Details");

        PageObject.textinput_Locator("fieldName:DRAWDOWN.ACCOUNT",testData.get("DRAWDOWN.ACCOUNT"));
        PageObject.textinput_Locator("fieldName:COM.LIQ.ACCT",testData.get("COM.LIQ.ACCT"));
        PageObject.textinput_Locator("fieldName:PRIN.LIQ.ACCT",testData.get("PRIN.LIQ.ACCT"));
        PageObject.textinput_Locator("fieldName:PRIN.BEN.BANK.1",testData.get("PRIN.BEN.BANK.1"));
        PageObject.textinput_Locator("fieldName:PRIN.BEN.BANK.2",testData.get("PRIN.BEN.BANK.2"));
        PageObject.textinput_Locator("fieldName:PRIN.ADDRESS:1",testData.get("PRIN.ADDRESS"));
        PageObject.textinput_Locator("fieldName:BENEF.PRIN.ACCT",testData.get("BENEF.PRIN.ACCT"));
        PageObject.textinput_Locator("fieldName:INT.LIQ.ACCT",testData.get("INT.LIQ.ACCT"));
        PageObject.textinput_Locator("fieldName:INT.BEN.BANK.1",testData.get("INT.BEN.BANK.1"));
        PageObject.textinput_Locator("fieldName:INT.BEN.BANK.2",testData.get("INT.BEN.BANK.2"));
        PageObject.textinput_Locator("fieldName:INT.ADDRESS:1",testData.get("INT.ADDRESS"));
        PageObject.textinput_Locator("fieldName:BEN.INT.ACCT",testData.get("BEN.INT.ACCT"));
        PageObject.textinput_Locator("fieldName:BK.TO.BK.INFO:1",testData.get("BK.TO.BK.INFO"));
        PageObject.textinput_Locator("fieldName:CHRG.LIQ.ACCT",testData.get("CHRG.LIQ.ACCT"));
        PageObject.textinput_Locator("fieldName:CHRG.CODE:1",testData.get("CHRG.CODE"));
        PageObject.textinput_Locator("fieldName:CHRG.AMOUNT:1",testData.get("CHRG.AMOUNT"));
        PageObject.textinput_Locator("fieldName:CHRG.CLAIM.DATE:1",testData.get("CHRG.CLAIM.DATE"));

        PageObject.form_Tab("Advice Details");

        PageObject.textinput_Locator("fieldName:SEND.PAYMENT",testData.get("SEND.PAYMENT"));
        PageObject.textinput_Locator("radio:tab3:SEND.PAYMENT",testData.get("tab3"));
        PageObject.textinput_Locator("fieldName:SEND.CONFIRMATION",testData.get("SEND.CONFIRMATION"));
        PageObject.textinput_Locator("radio:tab3:SEND.CONFIRMATION",testData.get("tab3"));
        PageObject.textinput_Locator("fieldName:CUSTOMER.REF",testData.get("CUSTOMER.REF"));
        PageObject.textinput_Locator("fieldName:CUST.REMARKS:1",testData.get("CUST.REMARKS"));
        PageObject.textinput_Locator("fieldName:BPM.REQ.ID",testData.get("BPM.REQ.ID"));
        PageObject.textinput_Locator("fieldName:EARLY.CL.CHRG",testData.get("EARLY.CL.CHRG"));
        PageObject.textinput_Locator("radio:tab3:EARLY.CL.CHRG",testData.get("tab3"));

        PageObject.form_Tab("Audit");

//        PageObject.textinput_Locator("fieldName:OVERRIDE:1",testData.get("OVERRIDE"));
//        PageObject.textinput_Locator("fieldName:RECORD.STATUS",testData.get("RECORD.STATUS"));
//        PageObject.textinput_Locator("fieldName:CURR.NO",testData.get("CURR.NO"));
//        PageObject.textinput_Locator("fieldName:INPUTTER:1",testData.get("INPUTTER"));
//        PageObject.textinput_Locator("fieldName:AUTHORISER",testData.get("AUTHORISER"));
//        PageObject.textinput_Locator("fieldName:DATE.TIME:1",testData.get("DATE.TIME"));
//        PageObject.textinput_Locator("fieldName:CO.CODE",testData.get("CO.CODE"));
//        PageObject.textinput_Locator("fieldName:DEPT.CODE",testData.get("DEPT.CODE"));
//        PageObject.textinput_Locator("fieldName:AUDITOR.CODE",testData.get("AUDITOR.CODE"));
//        PageObject.textinput_Locator("fieldName:AUDIT.DATE.TIME",testData.get("AUDIT.DATE.TIME"));


        //PageObject.img_Button("Validate a deal");



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
