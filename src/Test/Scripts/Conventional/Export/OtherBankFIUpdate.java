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

public class OtherBankFIUpdate extends BaseClass {
    @Test(groups = {"ExportInputter"}, dataProvider = "OtherBankFIUpdate")
    public void OtherBankFIUpdate(Map<String, String> testData) throws IOException {

        PageObject.menu_Dropdown("Other Bank GD - Lodge And Pay", 1);
        PageObject.menu_Link("Other Bank FI Update ");
        PageObject.switchToChildWindow();
        driver.manage().window().maximize();
        PageObject.textinput_Locator("transactionId","TF1922800080");
        PageObject.img_Button("Edit a contract");
        PageObject.textinput_Locator("fieldName:CUSTOMER.ID",testData.get("CUSTOMER.ID"));
        PageObject.textinput_Locator("fieldName:EXPORTER.NTN",testData.get("EXPORTER.NTN"));
        PageObject.textinput_Locator("fieldName:EXPORTER.NAME",testData.get("EXPORTER.NAME"));
        PageObject.textinput_Locator("fieldName:EXPORTER.IBAN",testData.get("EXPORTER.IBAN"));
        PageObject.textinput_Locator("fieldName:PAYMENT.MODE:1",testData.get("PAYMENT.MODE"));
        PageObject.textinput_Locator("fieldName:UNIQUE.NO:1",testData.get("UNIQUE.NO"));
        PageObject.textinput_Locator("fieldName:ADV.PAY.PERCENT",testData.get("ADV.PAY.PERCENT"));
        PageObject.textinput_Locator("fieldName:SIGHT.PERCENT",testData.get("SIGHT.PERCENT"));
        PageObject.textinput_Locator("fieldName:USANCE.PERCENT",testData.get("USANCE.PERCENT"));
        PageObject.textinput_Locator("fieldName:NO.OF.DAYS",testData.get("NO.OF.DAYS"));
        PageObject.textinput_Locator("fieldName:TOTAL.PERCENT",testData.get("TOTAL.PERCENT"));
        PageObject.textinput_Locator("fieldName:CONSIGNEE.NAME",testData.get("CONSIGNEE.NAME"));
        PageObject.textinput_Locator("fieldName:CONSIGNEE.ADDR",testData.get("CONSIGNEE.ADDR"));
        PageObject.textinput_Locator("fieldName:CONSIGNEE.CNTRY",testData.get("CONSIGNEE.CNTRY"));
        PageObject.textinput_Locator("fieldName:CONSIGNEE.IBAN",testData.get("CONSIGNEE.IBAN"));
        PageObject.textinput_Locator("fieldName:PORT.OF.DISCHARGE",testData.get("PORT.OF.DISCHARGE"));
        PageObject.textinput_Locator("fieldName:DELIVERY.TERMS",testData.get("DELIVERY.TERMS"));
        PageObject.textinput_Locator("fieldName:REMAINING.INV.VALUE",testData.get("REMAINING.INV.VALUE"));
        PageObject.textinput_Locator("fieldName:INV.CURRENCY",testData.get("INV.CURRENCY"));
        PageObject.textinput_Locator("fieldName:INSTRUMENT.VALUE",testData.get("INSTRUMENT.VALUE"));
        PageObject.textinput_Locator("fieldName:EXPIRY.DATE",testData.get("EXPIRY.DATE"));
        PageObject.textinput_Locator("fieldName:HS.CODE:1",testData.get("HS.CODE"));
        PageObject.textinput_Locator("fieldName:GOODS.DESC:1",testData.get("GOODS.DESC"));
        PageObject.textinput_Locator("fieldName:HS.QUANTITY:1",testData.get("HS.QUANTITY"));
        PageObject.textinput_Locator("fieldName:HS.UNIT:1",testData.get("HS.UNIT"));
        PageObject.textinput_Locator("fieldName:ORIGIN.COUNTRY:1",testData.get("ORIGIN.COUNTRY"));
        PageObject.textinput_Locator("fieldName:HS.INVOICE.AMT:1",testData.get("HS.INVOICE.AMT"));
        PageObject.textinput_Locator("fieldName:CBR.NUMBER",testData.get("CBR.NUMBER"));

        PageObject.form_Tab("Audit Details");

//        PageObject.textinput_Locator("fieldName:CURR.NO",testData.get("CURR.NO"));
//        PageObject.textinput_Locator("fieldName:RECORD.STATUS",testData.get("RECORD.STATUS"));
//        PageObject.textinput_Locator("fieldName:INPUTTER:1",testData.get("INPUTTER"));
//        PageObject.textinput_Locator("fieldName:DATE.TIME:1",testData.get("DATE.TIME"));
//        PageObject.textinput_Locator("fieldName:AUTHORISER",testData.get("AUTHORISER"));
//        PageObject.textinput_Locator("fieldName:CO.CODE",testData.get("CO.CODE"));
//        PageObject.textinput_Locator("fieldName:DEPT.CODE",testData.get("DEPT.CODE"));


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
