package Test.Scripts.IBG.Import;

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

public class PSWTraderProfile extends BaseClass {

    @Test(groups = {"IBGImportInputter"}, dataProvider = "ExportContractTemplate")
    public void ExportContractTemplate (Map<String, String> testData) throws IOException{

        PageObject.menu_Dropdown("PSW Trader Profile");
        PageObject.menu_Link("Export Contract Template ");
        PageObject.switchToChildWindow();
        driver.manage().window().maximize();
        PageObject.img_Button("New Deal");
        PageObject.switchToChildWindow();
        PageObject.textinput_Locator("fieldName:CONT.TYPE",testData.get("CONT.TYPE"));
        PageObject.textinput_Locator("fieldName:CUSTOMER.ID",testData.get("CUSTOMER.ID"));
        PageObject.textinput_Locator("fieldName:ADVANCE.PERCENT",testData.get("ADVANCE.PERCENT"));
        PageObject.textinput_Locator("fieldName:DP.PERCENT",testData.get("DP.PERCENT"));
        PageObject.textinput_Locator("fieldName:DA.PERCENT",testData.get("DA.PERCENT"));
        PageObject.textinput_Locator("fieldName:USANCE.DAYS",testData.get("USANCE.DAYS"));
        PageObject.textinput_Locator("fieldName:CONSIGNEE.NAME",testData.get("CONSIGNEE.NAME"));
        PageObject.textinput_Locator("fieldName:CONSIGNEE.ADDR:1",testData.get("CONSIGNEE.ADDR"));
        PageObject.textinput_Locator("fieldName:CONSIGNEE.CNTRY",testData.get("CONSIGNEE.CNTRY"));
        PageObject.textinput_Locator("fieldName:CONSIGNEE.IBAN",testData.get("CONSIGNEE.IBAN"));
        PageObject.textinput_Locator("fieldName:PORT.OF.DISCHARGE",testData.get("PORT.OF.DISCHARGE"));
        PageObject.textinput_Locator("fieldName:DELIVERY.TERMS",testData.get("DELIVERY.TERMS"));
        PageObject.textinput_Locator("fieldName:INSTRUMENT.CURR",testData.get("INSTRUMENT.CURR"));
        PageObject.textinput_Locator("fieldName:INSTRUMENT.VALUE",testData.get("INSTRUMENT.VALUE"));
        PageObject.textinput_Locator("fieldName:ISSUE.DATE",testData.get("ISSUE.DATE"));
        PageObject.textinput_Locator("fieldName:EXPIRY.DATE",testData.get("EXPIRY.DATE"));
        PageObject.textinput_Locator("fieldName:CONT.TENOR",testData.get("CONT.TENOR"));
        PageObject.textinput_Locator("fieldName:CONT.DESTINATION",testData.get("CONT.DESTINATION"));
        PageObject.textinput_Locator("fieldName:HS.CODE:1",testData.get("HS.CODE"));
        PageObject.textinput_Locator("fieldName:HS.QUANTITY:1",testData.get("HS.QUANTITY"));
        PageObject.textinput_Locator("fieldName:UNIT.PRICE:1",testData.get("UNIT.PRICE"));
        PageObject.textinput_Locator("fieldName:GOODS.DESC:1",testData.get("GOODS.DESC"));
        PageObject.textinput_Locator("fieldName:HS.BPRICE:1",testData.get("HS.BPRICE"));
        PageObject.textinput_Locator("fieldName:ITEM.INV.VALUE:1",testData.get("ITEM.INV.VALUE"));
        PageObject.textinput_Locator("fieldName:ORIGIN.COUNTRY:1",testData.get("ORIGIN.COUNTRY"));
        PageObject.textinput_Locator("fieldName:REMARKS:1",testData.get("REMARKS"));
        PageObject.textinput_Locator("fieldName:LODGEMENT.ID:1",testData.get("LODGEMENT.ID"));
        PageObject.textinput_Locator("fieldName:DOCUMENT.AMT:1",testData.get("DOCUMENT.AMT"));
        PageObject.textinput_Locator("fieldName:PAYMENT.ID:1:1",testData.get("PAYMENT.ID"));
        PageObject.textinput_Locator("fieldName:PAYMENT.AMT:1:1",testData.get("PAYMENT.AMT"));
        PageObject.textinput_Locator("fieldName:SEND.PSW",testData.get("SEND.PSW"));
        PageObject.textinput_Locator("radio:tab1:SEND.PSW",testData.get("tab1"));
        PageObject.textinput_Locator("fieldName:PSW.RESPONSE",testData.get("PSW.RESPONSE"));
        PageObject.textinput_Locator("fieldName:PSW.REFERENCE:1",testData.get("PSW.REFERENCE"));
        PageObject.textinput_Locator("fieldName:SEND.ACCUITY",testData.get("SEND.ACCUITY"));
        PageObject.textinput_Locator("radio:tab1:SEND.ACCUITY",testData.get("tab1"));
        PageObject.textinput_Locator("fieldName:ACCUITY.REF",testData.get("ACCUITY.REF"));
        PageObject.textinput_Locator("fieldName:ACCUITY.RESP",testData.get("ACCUITY.RESP"));
        PageObject.textinput_Locator("fieldName:USED.VERSION",testData.get("USED.VERSION"));
        PageObject.textinput_Locator("fieldName:CONT.BALANCE",testData.get("CONT.BALANCE"));
        PageObject.textinput_Locator("fieldName:PAY.DR.ID:1",testData.get("PAY.DR.ID"));
        PageObject.textinput_Locator("fieldName:PAY.DR.AMT:1",testData.get("PAY.DR.AMT"));
        PageObject.textinput_Locator("fieldName:PAY.DR.DATE:1",testData.get("PAY.DR.DATE"));
        PageObject.textinput_Locator("fieldName:FULLY.UTILISED",testData.get("FULLY.UTILISED"));
        PageObject.textinput_Locator("radio:tab1:FULLY.UTILISED",testData.get("tab1"));
        PageObject.textinput_Locator("fieldName:INVOICE.CONT",testData.get("INVOICE.CONT"));
        PageObject.textinput_Locator("fieldName:WAIVE.CHARGES",testData.get("WAIVE.CHARGES"));
        PageObject.textinput_Locator("radio:tab1:WAIVE.CHARGES",testData.get("tab1"));
        PageObject.textinput_Locator("fieldName:CHARGE.REFERENCE:1",testData.get("CHARGE.REFERENCE"));
        PageObject.textinput_Locator("fieldName:IMPORTER.NAME",testData.get("IMPORTER.NAME"));
        PageObject.textinput_Locator("fieldName:IMPORTER.ADDR:1",testData.get("IMPORTER.ADDR"));
        PageObject.textinput_Locator("fieldName:IMPORTER.CNTRY",testData.get("IMPORTER.CNTRY"));
        PageObject.textinput_Locator("fieldName:THIRD.PARTY",testData.get("THIRD.PARTY"));
        PageObject.textinput_Locator("radio:tab1:THIRD.PARTY",testData.get("tab1"));

        PageObject.commitTxn();
        PageObject.commitDeal("ExportContractTemplate");

    }

    private static final String FILE_PATH = "path/to/your/excel/file.xlsx"; // Update with your file path
    @DataProvider(name = "ExportContractTemplate")
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
}
