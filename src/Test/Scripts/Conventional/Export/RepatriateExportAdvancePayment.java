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

public class RepatriateExportAdvancePayment extends BaseClass {

    @Test(groups = {"ExportInputter"}, dataProvider = "RepatriateExportAdvancePayment")
    public void RepatriateExportAdvancePayment(Map<String, String> testData) throws IOException {

        PageObject.menu_Dropdown("Advance Payment Against Export", 1);
        PageObject.menu_Link("Repatriate Export Advance Payment ");
        PageObject.switchToChildWindow();
        driver.manage().window().maximize();
        PageObject.img_Button("New Deal");
        PageObject.switchToChildWindow();
        PageObject.textinput_Locator("fieldName:DEBIT.THEIR.REF",testData.get("DEBIT.THEIR.REF"));
        PageObject.textinput_Locator("fieldName:CREDIT.CURRENCY",testData.get("CREDIT.CURRENCY"));
        PageObject.textinput_Locator("fieldName:CREDIT.ACCT.NO",testData.get("CREDIT.ACCT.NO"));
        PageObject.textinput_Locator("fieldName:CREDIT.AMOUNT",testData.get("CREDIT.AMOUNT"));
        PageObject.textinput_Locator("fieldName:DEBIT.VALUE.DATE",testData.get("DEBIT.VALUE.DATE"));
        PageObject.textinput_Locator("fieldName:DEBIT.ACCT.NO",testData.get("DEBIT.ACCT.NO"));
        PageObject.textinput_Locator("fieldName:CREDIT.VALUE.DATE",testData.get("CREDIT.VALUE.DATE"));
        PageObject.textinput_Locator("fieldName:CREDIT.THEIR.REF",testData.get("CREDIT.THEIR.REF"));
        PageObject.textinput_Locator("fieldName:TREASURY.RATE",testData.get("TREASURY.RATE"));
        PageObject.textinput_Locator("fieldName:CUSTOMER.SPREAD",testData.get("CUSTOMER.SPREAD"));
        PageObject.textinput_Locator("fieldName:CUSTOMER.RATE",testData.get("CUSTOMER.RATE"));
        PageObject.textinput_Locator("fieldName:PROFIT.CENTRE.DEPT",testData.get("PROFIT.CENTRE.DEPT"));
        PageObject.textinput_Locator("fieldName:BK.TO.BK.INFO:1",testData.get("BK.TO.BK.INFO"));
        PageObject.textinput_Locator("fieldName:BEN.CUSTOMER:1",testData.get("BEN.CUSTOMER"));
        PageObject.textinput_Locator("fieldName:ORDERING.CUST:1",testData.get("ORDERING.CUST"));
        PageObject.textinput_Locator("fieldName:PAYMENT.DETAILS:1",testData.get("PAYMENT.DETAILS"));
        PageObject.textinput_Locator("fieldName:LC.EXP.ADV",testData.get("LC.EXP.ADV"));
        PageObject.textinput_Locator("fieldName:COMMISSION.AMT:1",testData.get("COMMISSION.AMT"));
        PageObject.textinput_Locator("fieldName:PROCESSING.DATE",testData.get("PROCESSING.DATE"));
        PageObject.textinput_Locator("fieldName:HS.CODE:1",testData.get("HS.CODE"));
        PageObject.textinput_Locator("fieldName:HS.QUANTITY:1",testData.get("HS.QUANTITY"));
        PageObject.textinput_Locator("fieldName:UNIT.PRICE:1",testData.get("UNIT.PRICE"));
        PageObject.textinput_Locator("fieldName:PYMT.NARRATION:1",testData.get("PYMT.NARRATION"));
        PageObject.textinput_Locator("fieldName:BAF.HS.BPRICE:1",testData.get("BAF.HS.BPRICE"));
        PageObject.textinput_Locator("fieldName:PK.DAO",testData.get("PK.DAO"));
        PageObject.textinput_Locator("fieldName:SEND.PSW",testData.get("SEND.PSW"));
        PageObject.textinput_Locator("radio:tab1:SEND.PSW",testData.get("tab1"));
        PageObject.textinput_Locator("fieldName:PSW.REFERENCE",testData.get("PSW.REFERENCE"));

        PageObject.form_Tab("MT 103 Details");

        PageObject.textinput_Locator("fieldName:TIME.IND:1:1",testData.get("TIME.IND"));
        PageObject.textinput_Locator("fieldName:INSTRCTN.CODE:1",testData.get("INSTRCTN.CODE"));
        PageObject.textinput_Locator("fieldName:NOSTRO.CR.DATE",testData.get("NOSTRO.CR.DATE"));
        PageObject.textinput_Locator("fieldName:CREDIT.VALUE.DATE",testData.get("CREDIT.VALUE.DATE"));
        PageObject.textinput_Locator("fieldName:CREDIT.CURRENCY",testData.get("CREDIT.CURRENCY"));
        PageObject.textinput_Locator("fieldName:CREDIT.AMOUNT",testData.get("CREDIT.AMOUNT"));
        PageObject.textinput_Locator("fieldName:MT.CURRENCY",testData.get("MT.CURRENCY"));
        PageObject.textinput_Locator("fieldName:INSTRUCT.AMT",testData.get("INSTRUCT.AMT"));
        PageObject.textinput_Locator("fieldName:EXCHG.RATE",testData.get("EXCHG.RATE"));
        PageObject.textinput_Locator("fieldName:ORDERING.CUST:1",testData.get("ORDERING.CUST"));
        PageObject.textinput_Locator("fieldName:ORDERING.BANK:1",testData.get("ORDERING.BANK"));
        PageObject.textinput_Locator("fieldName:INTERMED.BANK:1",testData.get("INTERMED.BANK"));
        PageObject.textinput_Locator("fieldName:INTERMED.BANK.ACC",testData.get("INTERMED.BANK.ACC"));
        PageObject.textinput_Locator("fieldName:ACCT.WITH.BANK:1",testData.get("ACCT.WITH.BANK"));
        PageObject.textinput_Locator("fieldName:ACCT.WITH.BANK.ACC",testData.get("ACCT.WITH.BANK.ACC"));
        PageObject.textinput_Locator("fieldName:BEN.CUSTOMER:1",testData.get("BEN.CUSTOMER"));
        PageObject.textinput_Locator("fieldName:BEN.ACCT.NO",testData.get("BEN.ACCT.NO"));
        PageObject.textinput_Locator("fieldName:PAYMENT.DETAILS:1",testData.get("PAYMENT.DETAILS"));
        PageObject.textinput_Locator("fieldName:BEN.OUR.CHARGES",testData.get("BEN.OUR.CHARGES"));
        PageObject.textinput_Locator("radio:tab2:BEN.OUR.CHARGES",testData.get("tab2"));
        PageObject.textinput_Locator("fieldName:BK.TO.BK.OUT:1:1",testData.get("BK.TO.BK.OUT"));
        PageObject.textinput_Locator("fieldName:BAF.REG.REPORT:1",testData.get("BAF.REG.REPORT"));
        PageObject.textinput_Locator("fieldName:SEND.PAYMENT.Y.N",testData.get("SEND.PAYMENT.Y.N"));
        PageObject.textinput_Locator("radio:tab2:SEND.PAYMENT.Y.N",testData.get("tab2"));
        PageObject.textinput_Locator("fieldName:DR.ADVICE.REQD.Y.N",testData.get("DR.ADVICE.REQD.Y.N"));
        PageObject.textinput_Locator("radio:tab2:DR.ADVICE.REQD.Y.N",testData.get("tab2"));
        PageObject.textinput_Locator("fieldName:CR.ADVICE.REQD.Y.N",testData.get("CR.ADVICE.REQD.Y.N"));
        PageObject.textinput_Locator("radio:tab2:CR.ADVICE.REQD.Y.N",testData.get("tab2"));

        PageObject.form_Tab("Audit Details");

//        PageObject.textinput_Locator("fieldName:OVERRIDE:1",testData.get("OVERRIDE"));
//        PageObject.textinput_Locator("fieldName:RECORD.STATUS",testData.get("RECORD.STATUS"));
//        PageObject.textinput_Locator("fieldName:CURR.NO",testData.get("CURR.NO"));
//        PageObject.textinput_Locator("fieldName:INPUTTER:1",testData.get("INPUTTER"));
//        PageObject.textinput_Locator("fieldName:DATE.TIME:1",testData.get("DATE.TIME"));
//        PageObject.textinput_Locator("fieldName:AUTHORISER",testData.get("AUTHORISER"));
//        PageObject.textinput_Locator("fieldName:CO.CODE",testData.get("CO.CODE"));
//        PageObject.textinput_Locator("fieldName:DEPT.CODE",testData.get("DEPT.CODE"));
//        PageObject.textinput_Locator("fieldName:AUDITOR.CODE",testData.get("AUDITOR.CODE"));
//        PageObject.textinput_Locator("fieldName:AUDIT.DATE.TIME",testData.get("AUDIT.DATE.TIME"));



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
