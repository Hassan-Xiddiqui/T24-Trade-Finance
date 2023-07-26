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

public class ManualFIIssuanceAndCancellation extends BaseClass {

    @Test(groups = {"IBGImportInputter"}, dataProvider = "SendManualFIImport")
    public void SendManualFIImport (Map<String, String> testData) throws IOException{

        PageObject.menu_Dropdown("SendManualFIImport");
        PageObject.menu_Link("Send Manual FI - Import ");
        PageObject.switchToChildWindow();
        driver.manage().window().maximize();
        PageObject.img_Button("New Deal");
        PageObject.switchToChildWindow();
        PageObject.textinput_Locator("fieldName:TXN.REFERENCE",testData.get("TXN.REFERENCE"));
        PageObject.textinput_Locator("fieldName:CUSTOMER.NO",testData.get("CUSTOMER.NO"));
        PageObject.textinput_Locator("fieldName:CUSTOMER.NTN",testData.get("CUSTOMER.NTN"));
        PageObject.textinput_Locator("fieldName:CUSTOMER.IBAN",testData.get("CUSTOMER.IBAN"));
        PageObject.textinput_Locator("fieldName:ADVANCE.PERCENT",testData.get("ADVANCE.PERCENT"));
        PageObject.textinput_Locator("fieldName:DP.PERCENT",testData.get("DP.PERCENT"));
        PageObject.textinput_Locator("fieldName:DA.PERCENT",testData.get("DA.PERCENT"));
        PageObject.textinput_Locator("fieldName:USANCE.DAYS",testData.get("USANCE.DAYS"));
        PageObject.textinput_Locator("fieldName:CASH.MGN.PERCENT",testData.get("CASH.MGN.PERCENT"));
        PageObject.textinput_Locator("fieldName:CASH.MGN.VALUE",testData.get("CASH.MGN.VALUE"));
        PageObject.textinput_Locator("fieldName:GD.NUMBER:1",testData.get("GD.NUMBER"));
        PageObject.textinput_Locator("fieldName:BENEFICIARY.NAME",testData.get("BENEFICIARY.NAME"));
        PageObject.textinput_Locator("fieldName:BENEFICIARY.ADDR:1",testData.get("BENEFICIARY.ADDR"));
        PageObject.textinput_Locator("fieldName:BENEFICIARY.CNTRY",testData.get("BENEFICIARY.CNTRY"));
        PageObject.textinput_Locator("fieldName:BENEFICIARY.IBAN",testData.get("BENEFICIARY.IBAN"));
        PageObject.textinput_Locator("fieldName:EXPORTER.NAME",testData.get("EXPORTER.NAME"));
        PageObject.textinput_Locator("fieldName:EXPORTER.ADDR:1",testData.get("EXPORTER.ADDR"));
        PageObject.textinput_Locator("fieldName:EXPORTER.CNTRY",testData.get("EXPORTER.CNTRY"));
        PageObject.textinput_Locator("fieldName:PORT.OF.SHIPMENT",testData.get("PORT.OF.SHIPMENT"));
        PageObject.textinput_Locator("fieldName:DELIVERY.TERMS",testData.get("DELIVERY.TERMS"));
        PageObject.textinput_Locator("fieldName:FI.VALUE",testData.get("FI.VALUE"));
        PageObject.textinput_Locator("fieldName:FI.CURRENCY",testData.get("FI.CURRENCY"));
        PageObject.textinput_Locator("fieldName:EXCH.RATE",testData.get("EXCH.RATE"));
        PageObject.textinput_Locator("fieldName:HS.CODE:1",testData.get("HS.CODE"));
        PageObject.textinput_Locator("fieldName:GOODS.DESC:1",testData.get("GOODS.DESC"));
        PageObject.textinput_Locator("fieldName:HS.QUANTITY:1",testData.get("HS.QUANTITY"));
        PageObject.textinput_Locator("fieldName:ORIGIN.COUNTRY:1",testData.get("ORIGIN.COUNTRY"));
        PageObject.textinput_Locator("fieldName:HS.SAMPLE:1",testData.get("HS.SAMPLE"));
        PageObject.textinput_Locator("fieldName:HSSAMPLE.VALUE:1",testData.get("HSSAMPLE.VALUE"));
        PageObject.textinput_Locator("fieldName:INTENDED.DATE",testData.get("INTENDED.DATE"));
        PageObject.textinput_Locator("fieldName:TRANSPORT.DATE",testData.get("TRANSPORT.DATE"));
        PageObject.textinput_Locator("fieldName:FINAL.SHIPMENT",testData.get("FINAL.SHIPMENT"));
        PageObject.textinput_Locator("fieldName:EXPIRY.DATE",testData.get("EXPIRY.DATE"));
        PageObject.textinput_Locator("fieldName:REMARKS",testData.get("REMARKS"));
        PageObject.textinput_Locator("fieldName:PSW.REFERENCE",testData.get("PSW.REFERENCE"));

        PageObject.form_Tab("Audit Details");

//        2PageObject.textinput_Locator("fieldName:OVERRIDE:1",testData.get("OVERRIDE"));
//        PageObject.textinput_Locator("fieldName:CURR.NO",testData.get("CURR.NO"));
//        PageObject.textinput_Locator("fieldName:RECORD.STATUS",testData.get("RECORD.STATUS"));
//        PageObject.textinput_Locator("fieldName:INPUTTER:1",testData.get("INPUTTER"));
//        PageObject.textinput_Locator("fieldName:DATE.TIME:1",testData.get("DATE.TIME"));
//        PageObject.textinput_Locator("fieldName:AUTHORISER",testData.get("AUTHORISER"));
//        PageObject.textinput_Locator("fieldName:CO.CODE",testData.get("CO.CODE"));
//        PageObject.textinput_Locator("fieldName:DEPT.CODE",testData.get("DEPT.CODE"));


        PageObject.commitTxn();
        PageObject.commitDeal("SendManualFIImport");
    }

    @Test(groups = {"IBGImportInputter"}, dataProvider = "ManualFIUpdateImport")
    public void ManualFIUpdateImport (Map<String, String> testData) throws IOException{

        PageObject.menu_Dropdown("SendManualFIImport");
        PageObject.menu_Link("Manual FI Update - Import ");
        PageObject.switchToChildWindow();
        driver.manage().window().maximize();
        PageObject.img_Button("New Deal");
        PageObject.switchToChildWindow();
        PageObject.textinput_Locator("fieldName:TXN.REFERENCE",testData.get("TXN.REFERENCE"));
        PageObject.textinput_Locator("fieldName:PAYMENT.MODE",testData.get("PAYMENT.MODE"));
        PageObject.textinput_Locator("fieldName:CUSTOMER.NO",testData.get("CUSTOMER.NO"));
        PageObject.textinput_Locator("fieldName:CUSTOMER.NTN",testData.get("CUSTOMER.NTN"));
        PageObject.textinput_Locator("fieldName:CUSTOMER.IBAN",testData.get("CUSTOMER.IBAN"));
        PageObject.textinput_Locator("fieldName:ADVANCE.PERCENT",testData.get("ADVANCE.PERCENT"));
        PageObject.textinput_Locator("fieldName:DP.PERCENT",testData.get("DP.PERCENT"));
        PageObject.textinput_Locator("fieldName:DA.PERCENT",testData.get("DA.PERCENT"));
        PageObject.textinput_Locator("fieldName:USANCE.DAYS",testData.get("USANCE.DAYS"));
        PageObject.textinput_Locator("fieldName:CASH.MGN.PERCENT",testData.get("CASH.MGN.PERCENT"));
        PageObject.textinput_Locator("fieldName:CASH.MGN.VALUE",testData.get("CASH.MGN.VALUE"));
        PageObject.textinput_Locator("fieldName:GD.NUMBER:1",testData.get("GD.NUMBER"));
        PageObject.textinput_Locator("fieldName:BENEFICIARY.NAME",testData.get("BENEFICIARY.NAME"));
        PageObject.textinput_Locator("fieldName:BENEFICIARY.ADDR:1",testData.get("BENEFICIARY.ADDR"));
        PageObject.textinput_Locator("fieldName:BENEFICIARY.CNTRY",testData.get("BENEFICIARY.CNTRY"));
        PageObject.textinput_Locator("fieldName:BENEFICIARY.IBAN",testData.get("BENEFICIARY.IBAN"));
        PageObject.textinput_Locator("fieldName:EXPORTER.NAME",testData.get("EXPORTER.NAME"));
        PageObject.textinput_Locator("fieldName:EXPORTER.ADDR:1",testData.get("EXPORTER.ADDR"));
        PageObject.textinput_Locator("fieldName:EXPORTER.CNTRY",testData.get("EXPORTER.CNTRY"));
        PageObject.textinput_Locator("fieldName:PORT.OF.SHIPMENT",testData.get("PORT.OF.SHIPMENT"));
        PageObject.textinput_Locator("fieldName:DELIVERY.TERMS",testData.get("DELIVERY.TERMS"));
        PageObject.textinput_Locator("fieldName:FI.VALUE",testData.get("FI.VALUE"));
        PageObject.textinput_Locator("fieldName:FI.CURRENCY",testData.get("FI.CURRENCY"));
        PageObject.textinput_Locator("fieldName:EXCH.RATE",testData.get("EXCH.RATE"));
        PageObject.textinput_Locator("fieldName:HS.CODE:1",testData.get("HS.CODE"));
        PageObject.textinput_Locator("fieldName:GOODS.DESC:1",testData.get("GOODS.DESC"));
        PageObject.textinput_Locator("fieldName:HS.QUANTITY:1",testData.get("HS.QUANTITY"));
        PageObject.textinput_Locator("fieldName:ORIGIN.COUNTRY:1",testData.get("ORIGIN.COUNTRY"));
        PageObject.textinput_Locator("fieldName:HS.SAMPLE:1",testData.get("HS.SAMPLE"));
        PageObject.textinput_Locator("fieldName:HSSAMPLE.VALUE:1",testData.get("HSSAMPLE.VALUE"));
        PageObject.textinput_Locator("fieldName:INTENDED.DATE",testData.get("INTENDED.DATE"));
        PageObject.textinput_Locator("fieldName:TRANSPORT.DATE",testData.get("TRANSPORT.DATE"));
        PageObject.textinput_Locator("fieldName:FINAL.SHIPMENT",testData.get("FINAL.SHIPMENT"));
        PageObject.textinput_Locator("fieldName:EXPIRY.DATE",testData.get("EXPIRY.DATE"));
        PageObject.textinput_Locator("fieldName:REMARKS",testData.get("REMARKS"));
        PageObject.textinput_Locator("fieldName:PSW.REFERENCE",testData.get("PSW.REFERENCE"));

        PageObject.form_Tab("Audit Details");

//        PageObject.textinput_Locator("fieldName:OVERRIDE:1",testData.get("OVERRIDE"));
//        PageObject.textinput_Locator("fieldName:CURR.NO",testData.get("CURR.NO"));
//        PageObject.textinput_Locator("fieldName:RECORD.STATUS",testData.get("RECORD.STATUS"));
//        PageObject.textinput_Locator("fieldName:INPUTTER:1",testData.get("INPUTTER"));
//        PageObject.textinput_Locator("fieldName:DATE.TIME:1",testData.get("DATE.TIME"));
//        PageObject.textinput_Locator("fieldName:AUTHORISER",testData.get("AUTHORISER"));
//        PageObject.textinput_Locator("fieldName:CO.CODE",testData.get("CO.CODE"));
//        PageObject.textinput_Locator("fieldName:DEPT.CODE",testData.get("DEPT.CODE"));


        PageObject.commitTxn();
        PageObject.commitDeal("ManualFIUpdateImport");

    }

    @Test(groups = {"IBGImportInputter"}, dataProvider = "CancelFIImport")
    public void CancelFIImport (Map<String, String> testData) throws IOException{

        PageObject.menu_Dropdown("SendManualFIImport");
        PageObject.menu_Link("Cancel FI - Import ");
        PageObject.switchToChildWindow();
        driver.manage().window().maximize();
        PageObject.img_Button("New Deal");
        PageObject.switchToChildWindow();
        PageObject.textinput_Locator("fieldName:TXN.REFERENCE",testData.get("TXN.REFERENCE"));
        PageObject.textinput_Locator("fieldName:CUSTOMER.NTN",testData.get("CUSTOMER.NTN"));
        PageObject.textinput_Locator("fieldName:CUSTOMER.IBAN",testData.get("CUSTOMER.IBAN"));
        PageObject.textinput_Locator("fieldName:PSW.REFERENCE",testData.get("PSW.REFERENCE"));

        PageObject.form_Tab("Audit Details");

//        PageObject.textinput_Locator("fieldName:OVERRIDE:1",testData.get("OVERRIDE"));
//        PageObject.textinput_Locator("fieldName:CURR.NO",testData.get("CURR.NO"));
//        PageObject.textinput_Locator("fieldName:RECORD.STATUS",testData.get("RECORD.STATUS"));
//        PageObject.textinput_Locator("fieldName:INPUTTER:1",testData.get("INPUTTER"));
//        PageObject.textinput_Locator("fieldName:DATE.TIME:1",testData.get("DATE.TIME"));
//        PageObject.textinput_Locator("fieldName:AUTHORISER",testData.get("AUTHORISER"));
//        PageObject.textinput_Locator("fieldName:CO.CODE",testData.get("CO.CODE"));
//        PageObject.textinput_Locator("fieldName:DEPT.CODE",testData.get("DEPT.CODE"));

        PageObject.commitTxn();
        PageObject.commitDeal("CancelFIImport");


    }

    private static final String FILE_PATH = "path/to/your/excel/file.xlsx"; // Update with your file path
    @DataProvider(name = "SendManualFIImport")
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
    @DataProvider(name = "ManualFIUpdateImport")
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
    @DataProvider(name = "CancelFIImport")
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
