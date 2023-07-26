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

public class AuthoriseDeleteDocRegAdvPayment extends BaseClass {

    @Test(groups = {"ExportInputter"}, dataProvider = "AuthoriseDeleteAdvancePayment")
    public void AuthoriseDeleteAdvancePayment(Map<String, String> testData) throws IOException {

        PageObject.menu_Dropdown("Advance Payment Against Export", 1);
        PageObject.menu_Link("Authorise / Delete Doc Reg Adv Payment ");
        PageObject.switchToChildWindow();
        driver.manage().window().maximize();
        PageObject.img_Button("New Deal");
        PageObject.switchToChildWindow();
        PageObject.textinput_Locator("fieldName:EXP.ADV.PAY.REF",testData.get("EXP.ADV.PAY.REF"));
        PageObject.textinput_Locator("fieldName:DOC.REC.DATE",testData.get("DOC.REC.DATE"));
        PageObject.textinput_Locator("fieldName:NAME.OF.VESS:1",testData.get("NAME.OF.VESS"));
        PageObject.textinput_Locator("fieldName:HS.CODE:1:1",testData.get("HS.CODE"));
        PageObject.textinput_Locator("fieldName:HS.QUANTITY:1:1",testData.get("HS.QUANTITY"));
        PageObject.textinput_Locator("fieldName:UNIT.PRICE:1",testData.get("UNIT.PRICE"));
        PageObject.textinput_Locator("fieldName:BAF.HS.BPRICE:1",testData.get("BAF.HS.BPRICE"));
        PageObject.textinput_Locator("fieldName:BAF.DESC.GOODS:1",testData.get("BAF.DESC.GOODS"));
        PageObject.textinput_Locator("fieldName:INCOTERM",testData.get("INCOTERM"));
        PageObject.textinput_Locator("fieldName:BL.No",testData.get("BL.No"));
        PageObject.textinput_Locator("fieldName:SHIPMENT.DATE",testData.get("SHIPMENT.DATE"));
        PageObject.textinput_Locator("fieldName:AMOUNT",testData.get("AMOUNT"));
        PageObject.textinput_Locator("fieldName:INV.NUMBER",testData.get("INV.NUMBER"));
        PageObject.textinput_Locator("fieldName:INV.DATE",testData.get("INV.DATE"));
        PageObject.textinput_Locator("fieldName:INV.AMT",testData.get("INV.AMT"));
        PageObject.textinput_Locator("fieldName:GD.NUM:1",testData.get("GD.NUM"));
        PageObject.textinput_Locator("fieldName:GD.DATE:1",testData.get("GD.DATE"));
        PageObject.textinput_Locator("fieldName:COMMISSION",testData.get("COMMISSION"));
        PageObject.textinput_Locator("fieldName:EDS.AMT",testData.get("EDS.AMT"));
        PageObject.textinput_Locator("fieldName:WH.TAX.AMT",testData.get("WH.TAX.AMT"));
        PageObject.textinput_Locator("fieldName:FOREIGN.CHGS",testData.get("FOREIGN.CHGS"));
        PageObject.textinput_Locator("fieldName:T.CHARGE.AMT",testData.get("T.CHARGE.AMT"));
        PageObject.textinput_Locator("fieldName:EDSCOMM",testData.get("EDSCOMM"));
        PageObject.textinput_Locator("fieldName:REALIZE.AMT",testData.get("REALIZE.AMT"));
        PageObject.textinput_Locator("fieldName:TTA.RET.AMOUNT",testData.get("TTA.RET.AMOUNT"));
        PageObject.textinput_Locator("fieldName:DOC.SUB.SBP",testData.get("DOC.SUB.SBP"));
        PageObject.textinput_Locator("radio:tab1:DOC.SUB.SBP",testData.get("tab1"));
        PageObject.textinput_Locator("fieldName:SEND.ACCUITY",testData.get("SEND.ACCUITY"));
        PageObject.textinput_Locator("radio:tab1:SEND.ACCUITY",testData.get("tab1"));
        PageObject.textinput_Locator("fieldName:ACCUITY.REF",testData.get("ACCUITY.REF"));
        PageObject.textinput_Locator("fieldName:ACCUITY.RESP",testData.get("ACCUITY.RESP"));
        PageObject.textinput_Locator("fieldName:SEND.PSW",testData.get("SEND.PSW"));
        PageObject.textinput_Locator("radio:tab1:SEND.PSW",testData.get("tab1"));
        PageObject.textinput_Locator("fieldName:PSW.REFERENCE:1",testData.get("PSW.REFERENCE"));
        PageObject.textinput_Locator("fieldName:REMARKS",testData.get("REMARKS"));
        PageObject.textinput_Locator("fieldName:ITRS.FREIGHT",testData.get("ITRS.FREIGHT"));

        PageObject.form_Tab("Other Information");

        PageObject.textinput_Locator("fieldName:SHIPPER.NAME:1",testData.get("SHIPPER.NAME"));
        PageObject.textinput_Locator("fieldName:SHIPPER.COUNTRY:1",testData.get("SHIPPER.COUNTRY"));
        PageObject.textinput_Locator("fieldName:CONSIGNEE.NAME:1",testData.get("CONSIGNEE.NAME"));
        PageObject.textinput_Locator("fieldName:CONSIGNEE.COUNTRY:1",testData.get("CONSIGNEE.COUNTRY"));
        PageObject.textinput_Locator("fieldName:NP.NAME:1",testData.get("NP.NAME"));
        PageObject.textinput_Locator("fieldName:NP.COUNTRY:1",testData.get("NP.COUNTRY"));
        PageObject.textinput_Locator("fieldName:SL.NAME:1",testData.get("SL.NAME"));
        PageObject.textinput_Locator("fieldName:SL.COUNTRY:1",testData.get("SL.COUNTRY"));
        PageObject.textinput_Locator("fieldName:SA.NAME:1",testData.get("SA.NAME"));
        PageObject.textinput_Locator("fieldName:SA.COUNTRY:1",testData.get("SA.COUNTRY"));
        PageObject.textinput_Locator("fieldName:PLACE.RECEIPT:1",testData.get("PLACE.RECEIPT"));
        PageObject.textinput_Locator("fieldName:PORT.LOADING:1",testData.get("PORT.LOADING"));
        PageObject.textinput_Locator("fieldName:PORT.DISCHARGE:1",testData.get("PORT.DISCHARGE"));
        PageObject.textinput_Locator("fieldName:PLACE.DELIVERY:1",testData.get("PLACE.DELIVERY"));

        PageObject.form_Tab("Audit Trail");

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
