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

public class LodgmentOtherBankGD extends BaseClass {

    @Test(groups = {"ExportInputter"}, dataProvider = "LodgmentOtherBankGD")
    public void LodgmentOtherBankGD(Map<String, String> testData) throws IOException{

        PageObject.menu_Dropdown("Other Bank GD - Lodge And Pay",1);
        PageObject.menu_Link("Lodgment - Other Bank GD ");
        PageObject.switchToChildWindow();
        driver.manage().window().maximize();
        PageObject.img_Button("New Deal");
        PageObject.switchToChildWindow();
        PageObject.textinput_Locator("fieldName:EXTERNAL.REFERENCE",testData.get("EXTERNAL.REFERENCE"));
        PageObject.textinput_Locator("fieldName:LC.TYPE",testData.get("LC.TYPE"));
        PageObject.textinput_Locator("fieldName:GD.NUM:1",testData.get("GD.NUM"));
        PageObject.textinput_Locator("fieldName:BAF.OTHGD:1",testData.get("BAF.OTHGD"));
        PageObject.textinput_Locator("fieldName:CURRENCY.MARKET",testData.get("CURRENCY.MARKET"));
        PageObject.textinput_Locator("fieldName:COURIER.REF",testData.get("COURIER.REF"));
        PageObject.textinput_Locator("fieldName:APPLICANT.CUSTNO",testData.get("APPLICANT.CUSTNO"));
        PageObject.textinput_Locator("fieldName:APPLICANT:1",testData.get("APPLICANT"));
        PageObject.textinput_Locator("fieldName:APPLICANT.ACC",testData.get("APPLICANT.ACC"));
        PageObject.textinput_Locator("fieldName:LC.CURRENCY",testData.get("LC.CURRENCY"));
        PageObject.textinput_Locator("fieldName:ACUDOLLAR",testData.get("ACUDOLLAR"));
        PageObject.textinput_Locator("radio:tab1:ACUDOLLAR",testData.get("tab1"));
        PageObject.textinput_Locator("fieldName:LC.AMOUNT",testData.get("LC.AMOUNT"));
        PageObject.textinput_Locator("fieldName:FOB.VALUE",testData.get("FOB.VALUE"));
        PageObject.textinput_Locator("fieldName:DISC.AMT",testData.get("DISC.AMT"));
        PageObject.textinput_Locator("fieldName:LATEST.SHIPMENT",testData.get("LATEST.SHIPMENT"));
        PageObject.textinput_Locator("fieldName:ISSUE.DATE",testData.get("ISSUE.DATE"));
        PageObject.textinput_Locator("fieldName:EXPIRY.DATE",testData.get("EXPIRY.DATE"));
        PageObject.textinput_Locator("fieldName:DAYS",testData.get("DAYS"));
        PageObject.textinput_Locator("fieldName:TENOR",testData.get("TENOR"));
        PageObject.textinput_Locator("fieldName:TRACER.DATE",testData.get("TRACER.DATE"));
        PageObject.textinput_Locator("fieldName:TRACER.DAYS",testData.get("TRACER.DAYS"));
        PageObject.textinput_Locator("fieldName:ACCOUNT.OFFICER",testData.get("ACCOUNT.OFFICER"));
        PageObject.textinput_Locator("fieldName:ISSUING.BANK.NO",testData.get("ISSUING.BANK.NO"));
        PageObject.textinput_Locator("fieldName:ISSUING.BANK:1",testData.get("ISSUING.BANK"));
        PageObject.textinput_Locator("fieldName:LC.COUNTRY",testData.get("LC.COUNTRY"));
        PageObject.textinput_Locator("fieldName:BENEFICIARY.CUSTNO",testData.get("BENEFICIARY.CUSTNO"));
        PageObject.textinput_Locator("fieldName:BENEFICIARY:1",testData.get("BENEFICIARY"));
        PageObject.textinput_Locator("fieldName:CLIENT.CNTRY:1",testData.get("CLIENT.CNTRY"));
        PageObject.textinput_Locator("fieldName:REC.DATE",testData.get("REC.DATE"));
        PageObject.textinput_Locator("fieldName:ADVICE.EXPIRY.DATE",testData.get("ADVICE.EXPIRY.DATE"));

        PageObject.form_Tab("Documents and Instructions");

        PageObject.textinput_Locator("fieldName:DOCUMENT.CODE:1",testData.get("DOCUMENT.CODE"));
        PageObject.textinput_Locator("fieldName:DOC.1ST.COPIES:1",testData.get("DOC.1ST.COPIES"));
        PageObject.textinput_Locator("fieldName:DOC.2ND.COPIES:1",testData.get("DOC.2ND.COPIES"));
        PageObject.textinput_Locator("fieldName:SHIPDOC:1",testData.get("SHIPDOC"));
        PageObject.textinput_Locator("fieldName:DR.SHIP.TIME:1",testData.get("DR.SHIP.TIME"));
        PageObject.textinput_Locator("fieldName:SHIP.DATE:1",testData.get("SHIP.DATE"));
        PageObject.textinput_Locator("fieldName:BAF.OTHGD:1",testData.get("BAF.OTHGD"));
        PageObject.textinput_Locator("fieldName:INV.NUMBER:1",testData.get("INV.NUMBER"));
        PageObject.textinput_Locator("fieldName:INV.DATE:1",testData.get("INV.DATE"));
        PageObject.textinput_Locator("fieldName:INV.AMT:1",testData.get("INV.AMT"));
        PageObject.textinput_Locator("",testData.get("undefined"));
        PageObject.textinput_Locator("fieldName:BANK.TO.BANK:1",testData.get("BANK.TO.BANK"));

        PageObject.form_Tab("SALAM / FBP Detail / SBP Report");

        PageObject.textinput_Locator("fieldName:LC.FWD.CONT.NO",testData.get("LC.FWD.CONT.NO"));
        PageObject.textinput_Locator("fieldName:LD.TYPE",testData.get("LD.TYPE"));
        PageObject.textinput_Locator("fieldName:LD.CATEG",testData.get("LD.CATEG"));
        PageObject.textinput_Locator("fieldName:FBP.DATE",testData.get("FBP.DATE"));
        PageObject.textinput_Locator("fieldName:LD.REF",testData.get("LD.REF"));
        PageObject.textinput_Locator("fieldName:TR.RATE",testData.get("TR.RATE"));
        PageObject.textinput_Locator("fieldName:CUS.RATE",testData.get("CUS.RATE"));
        PageObject.textinput_Locator("fieldName:LC.NO.DAYS",testData.get("LC.NO.DAYS"));
        PageObject.textinput_Locator("fieldName:M.FORM:1",testData.get("M.FORM"));
        PageObject.textinput_Locator("fieldName:FOB.VALUE",testData.get("FOB.VALUE"));
        PageObject.textinput_Locator("fieldName:FX.LINK.ID",testData.get("FX.LINK.ID"));
        PageObject.textinput_Locator("fieldName:FREIGHT.CHARGE",testData.get("FREIGHT.CHARGE"));
        PageObject.textinput_Locator("fieldName:AMOUNT",testData.get("AMOUNT"));

        PageObject.form_Tab("Charges");

        PageObject.textinput_Locator("fieldName:CHARGES.FROM",testData.get("CHARGES.FROM"));
        PageObject.textinput_Locator("radio:tab4:CHARGES.FROM",testData.get("tab4"));
        PageObject.textinput_Locator("fieldName:CHARGES.ACCOUNT",testData.get("CHARGES.ACCOUNT"));
        PageObject.textinput_Locator("fieldName:WAIVE.CHARGES",testData.get("WAIVE.CHARGES"));
        PageObject.textinput_Locator("fieldName:CHARGE.CODE:1",testData.get("CHARGE.CODE"));
        PageObject.textinput_Locator("fieldName:CHARGE.ACCT:1",testData.get("CHARGE.ACCT"));
        PageObject.textinput_Locator("fieldName:CHARGE.CURRENCY:1",testData.get("CHARGE.CURRENCY"));
        PageObject.textinput_Locator("fieldName:CHARGE.XCHG:1",testData.get("CHARGE.XCHG"));
        PageObject.textinput_Locator("fieldName:CHARGE.AMOUNT:1",testData.get("CHARGE.AMOUNT"));

        PageObject.form_Tab("Other Information");

        PageObject.textinput_Locator("fieldName:MD.NAME.OF.VESS:1",testData.get("MD.NAME.OF.VESS"));
        PageObject.textinput_Locator("fieldName:SHIPPER.NAME:1",testData.get("SHIPPER.NAME"));
        PageObject.textinput_Locator("fieldName:SHIPPER.COUNTRY:1",testData.get("SHIPPER.COUNTRY"));
        PageObject.textinput_Locator("fieldName:NT.PARTY.NAME:1",testData.get("NT.PARTY.NAME"));
        PageObject.textinput_Locator("fieldName:NT.PARTY.CNTRY:1",testData.get("NT.PARTY.CNTRY"));
        PageObject.textinput_Locator("fieldName:SH.LINE.NAME:1",testData.get("SH.LINE.NAME"));
        PageObject.textinput_Locator("fieldName:SH.LINE.CNTRY:1",testData.get("SH.LINE.CNTRY"));
        PageObject.textinput_Locator("fieldName:SH.AGENT.NAME:1",testData.get("SH.AGENT.NAME"));
        PageObject.textinput_Locator("fieldName:SH.AGENT.CNTRY:1",testData.get("SH.AGENT.CNTRY"));
        PageObject.textinput_Locator("fieldName:RECEIPT.PLACE:1",testData.get("RECEIPT.PLACE"));
        PageObject.textinput_Locator("fieldName:LOADING.PORT:1",testData.get("LOADING.PORT"));
        PageObject.textinput_Locator("fieldName:DISCHARGE.PORT:1",testData.get("DISCHARGE.PORT"));
        PageObject.textinput_Locator("fieldName:DELIVERY.PLACE:1",testData.get("DELIVERY.PLACE"));
        PageObject.textinput_Locator("fieldName:VESSEL.IMO:1",testData.get("VESSEL.IMO"));
        PageObject.textinput_Locator("fieldName:THIRDPARTY.UBO:1",testData.get("THIRDPARTY.UBO"));
        PageObject.textinput_Locator("fieldName:BAF.INSCO.NAME:1",testData.get("BAF.INSCO.NAME"));
        PageObject.textinput_Locator("fieldName:BAF.INSCO.ADDR:1",testData.get("BAF.INSCO.ADDR"));
        PageObject.textinput_Locator("fieldName:INDENTER.NAME:1",testData.get("INDENTER.NAME"));

        PageObject.form_Tab("FWD Contract / HS Code Details");

        PageObject.textinput_Locator("fieldName:FWD.CONT",testData.get("FWD.CONT"));
        PageObject.textinput_Locator("radio:tab6:FWD.CONT",testData.get("tab6"));
        PageObject.textinput_Locator("fieldName:INCO.TERMS.LC",testData.get("INCO.TERMS.LC"));
        PageObject.textinput_Locator("fieldName:HS.CODE:1",testData.get("HS.CODE"));
        PageObject.textinput_Locator("fieldName:HS.QUANTITY:1",testData.get("HS.QUANTITY"));
        PageObject.textinput_Locator("fieldName:UNIT.PRICE:1",testData.get("UNIT.PRICE"));
        PageObject.textinput_Locator("fieldName:HS.INV.AMT:1",testData.get("HS.INV.AMT"));
        PageObject.textinput_Locator("fieldName:BAF.DESC.GOODS:1",testData.get("BAF.DESC.GOODS"));
        PageObject.textinput_Locator("fieldName:BAF.HS.BPRICE:1",testData.get("BAF.HS.BPRICE"));
        PageObject.textinput_Locator("fieldName:SCRUTINY.REF",testData.get("SCRUTINY.REF"));

        PageObject.form_Tab("Delivery Info");

        PageObject.textinput_Locator("fieldName:MESSAGE.TYPE:1",testData.get("MESSAGE.TYPE"));
        PageObject.textinput_Locator("fieldName:MSG.CLASS.NO:1",testData.get("MSG.CLASS.NO"));
        PageObject.textinput_Locator("fieldName:OVR.CARRIER:1",testData.get("OVR.CARRIER"));
        PageObject.textinput_Locator("fieldName:ADDRESSEE:1:1",testData.get("ADDRESSEE"));
        PageObject.textinput_Locator("fieldName:SWIFT.BIC",testData.get("SWIFT.BIC"));
        PageObject.textinput_Locator("fieldName:DELIVERY.REF:1",testData.get("DELIVERY.REF"));
        PageObject.textinput_Locator("fieldName:BPM.REQ.ID",testData.get("BPM.REQ.ID"));
        PageObject.textinput_Locator("fieldName:SEND.ACCUITY",testData.get("SEND.ACCUITY"));
        PageObject.textinput_Locator("radio:tab7:SEND.ACCUITY",testData.get("tab7"));
        PageObject.textinput_Locator("fieldName:ACCUITY.RESP",testData.get("ACCUITY.RESP"));
        PageObject.textinput_Locator("fieldName:ACCUITY.REF",testData.get("ACCUITY.REF"));
        PageObject.textinput_Locator("fieldName:SEND.PSW",testData.get("SEND.PSW"));
        PageObject.textinput_Locator("radio:tab7:SEND.PSW",testData.get("tab7"));
        PageObject.textinput_Locator("fieldName:PSW.REFERENCE:1",testData.get("PSW.REFERENCE"));

        PageObject.form_Tab("Audit Info");

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
