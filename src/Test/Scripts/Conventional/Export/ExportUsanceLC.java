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

public class ExportUsanceLC extends BaseClass {

    @Test(groups = {"ExportInputter"}, dataProvider = "ExportUsanceLC")
    public void ExportUsanceLC(Map<String, String> testData) throws IOException {

        PageObject.menu_Dropdown("Export LC",3);
        //PageObject.img_Button("Export LC");
        PageObject.menu_Link("Usance LC ");
        PageObject.switchToChildWindow();
        driver.manage().window().maximize();
        PageObject.img_Button("New Deal");
        PageObject.switchToChildWindow();
        PageObject.textinput_Locator("fieldName:ADVICE.BY",testData.get("ADVICE.BY"));
        PageObject.textinput_Locator("radio:tab1:ADVICE.BY",testData.get("tab1"));
        PageObject.textinput_Locator("fieldName:CURRENCY.MARKET",testData.get("CURRENCY.MARKET"));
        PageObject.textinput_Locator("fieldName:LC.TYPE",testData.get("LC.TYPE"));
        PageObject.textinput_Locator("fieldName:BAF.SWIFT.REF",testData.get("BAF.SWIFT.REF"));
        PageObject.textinput_Locator("fieldName:EXTERNAL.REFERENCE",testData.get("EXTERNAL.REFERENCE"));
        PageObject.textinput_Locator("fieldName:ISS.BANK.REF",testData.get("ISS.BANK.REF"));
        PageObject.textinput_Locator("fieldName:ISSUING.BANK.NO",testData.get("ISSUING.BANK.NO"));
        PageObject.textinput_Locator("fieldName:ISSUING.BANK:1",testData.get("ISSUING.BANK"));
        PageObject.textinput_Locator("fieldName:LC.CURRENCY",testData.get("LC.CURRENCY"));
        PageObject.textinput_Locator("fieldName:ACUDOLLAR",testData.get("ACUDOLLAR"));
        PageObject.textinput_Locator("radio:tab1:ACUDOLLAR",testData.get("tab1"));
        PageObject.textinput_Locator("fieldName:LC.AMOUNT",testData.get("LC.AMOUNT"));
        PageObject.textinput_Locator("fieldName:PERCENTAGE.CR.AMT",testData.get("PERCENTAGE.CR.AMT"));
        PageObject.textinput_Locator("fieldName:PERCENTAGE.DR.AMT",testData.get("PERCENTAGE.DR.AMT"));
        PageObject.textinput_Locator("fieldName:ISSUE.DATE",testData.get("ISSUE.DATE"));
        PageObject.textinput_Locator("fieldName:ADVICE.EXPIRY.DATE",testData.get("ADVICE.EXPIRY.DATE"));
        PageObject.textinput_Locator("fieldName:EXPIRY.PLACE",testData.get("EXPIRY.PLACE"));
        PageObject.textinput_Locator("fieldName:EXPIRY.DATE",testData.get("EXPIRY.DATE"));
        PageObject.textinput_Locator("fieldName:PORT.LIM.REF:1",testData.get("PORT.LIM.REF"));
        PageObject.textinput_Locator("fieldName:BENEFICIARY.CUSTNO",testData.get("BENEFICIARY.CUSTNO"));
        PageObject.textinput_Locator("fieldName:BENEFICIARY:1",testData.get("BENEFICIARY"));
        PageObject.textinput_Locator("fieldName:APPLICANT.CUSTNO",testData.get("APPLICANT.CUSTNO"));
        PageObject.textinput_Locator("fieldName:APPLICANT:1",testData.get("APPLICANT"));
        PageObject.textinput_Locator("fieldName:CLIENT.CNTRY:1",testData.get("CLIENT.CNTRY"));
        PageObject.textinput_Locator("fieldName:AVAIL.WITH.CUSTNO",testData.get("AVAIL.WITH.CUSTNO"));
        PageObject.textinput_Locator("fieldName:AVAILABLE.WITH:1",testData.get("AVAILABLE.WITH"));
        PageObject.textinput_Locator("fieldName:ADVISE.THRU.CUSTNO",testData.get("ADVISE.THRU.CUSTNO"));
        PageObject.textinput_Locator("fieldName:ADVISE.THRU:1",testData.get("ADVISE.THRU"));
        PageObject.textinput_Locator("fieldName:ACCOUNT.OFFICER",testData.get("ACCOUNT.OFFICER"));
        PageObject.textinput_Locator("fieldName:ADV.PAY.PERCENT",testData.get("ADV.PAY.PERCENT"));
        PageObject.textinput_Locator("fieldName:SIGHT.PERCENT",testData.get("SIGHT.PERCENT"));
        PageObject.textinput_Locator("fieldName:USANCE.PERCENT",testData.get("USANCE.PERCENT"));
        PageObject.textinput_Locator("fieldName:NO.OF.DAYS",testData.get("NO.OF.DAYS"));

        PageObject.form_Tab("Charges");

        PageObject.textinput_Locator("fieldName:CHARGES.FROM",testData.get("CHARGES.FROM"));
        PageObject.textinput_Locator("radio:tab2:CHARGES.FROM",testData.get("tab2"));
        PageObject.textinput_Locator("fieldName:CHARGES.ACCOUNT",testData.get("CHARGES.ACCOUNT"));
        PageObject.textinput_Locator("fieldName:WAIVE.CHARGES",testData.get("WAIVE.CHARGES"));
        PageObject.textinput_Locator("fieldName:CHARGE.CODE:1",testData.get("CHARGE.CODE"));
        PageObject.textinput_Locator("fieldName:CHARGE.ACCT:1",testData.get("CHARGE.ACCT"));
        PageObject.textinput_Locator("fieldName:CHARGE.CURRENCY:1",testData.get("CHARGE.CURRENCY"));
        PageObject.textinput_Locator("fieldName:CHARGE.XCHG:1",testData.get("CHARGE.XCHG"));
        PageObject.textinput_Locator("fieldName:CHARGE.AMOUNT:1",testData.get("CHARGE.AMOUNT"));

        PageObject.form_Tab("Insurance Details");

        PageObject.textinput_Locator("fieldName:LC.INS.COMP",testData.get("LC.INS.COMP"));
        PageObject.textinput_Locator("fieldName:COV.NOTE.POL",testData.get("COV.NOTE.POL"));
        PageObject.textinput_Locator("radio:tab3:COV.NOTE.POL",testData.get("tab3"));
        PageObject.textinput_Locator("fieldName:POL.COV.NOTE",testData.get("POL.COV.NOTE"));
        PageObject.textinput_Locator("fieldName:DATE.OF.ISS",testData.get("DATE.OF.ISS"));
        PageObject.textinput_Locator("fieldName:DATE.OF.EXP",testData.get("DATE.OF.EXP"));
        PageObject.textinput_Locator("fieldName:BASIS.INS",testData.get("BASIS.INS"));
        PageObject.textinput_Locator("radio:tab3:BASIS.INS",testData.get("tab3"));
        PageObject.textinput_Locator("fieldName:RISK.COV",testData.get("RISK.COV"));
        PageObject.textinput_Locator("radio:tab3:RISK.COV",testData.get("tab3"));
        PageObject.textinput_Locator("fieldName:GOODS.COV",testData.get("GOODS.COV"));
        PageObject.textinput_Locator("radio:tab3:GOODS.COV",testData.get("tab3"));

        PageObject.form_Tab("FWD Contract / HS Code Details");

        PageObject.textinput_Locator("fieldName:INCO.TERMS.LC",testData.get("INCO.TERMS.LC"));
        PageObject.textinput_Locator("fieldName:HS.CODE:1",testData.get("HS.CODE"));
        PageObject.textinput_Locator("fieldName:HS.QUANTITY:1",testData.get("HS.QUANTITY"));
        PageObject.textinput_Locator("fieldName:UNIT.PRICE:1",testData.get("UNIT.PRICE"));
        PageObject.textinput_Locator("fieldName:HS.INV.AMT:1",testData.get("HS.INV.AMT"));
        PageObject.textinput_Locator("fieldName:BAF.DESC.GOODS:1",testData.get("BAF.DESC.GOODS"));
        PageObject.textinput_Locator("fieldName:BAF.HS.BPRICE:1",testData.get("BAF.HS.BPRICE"));
        PageObject.textinput_Locator("fieldName:SCRUTINY.REF",testData.get("SCRUTINY.REF"));

        PageObject.form_Tab("Reimb Info");

        PageObject.textinput_Locator("fieldName:THIRD.PARTY.CUSTNO",testData.get("THIRD.PARTY.CUSTNO"));
        PageObject.textinput_Locator("fieldName:THIRD.PARTY:1",testData.get("THIRD.PARTY"));
        PageObject.textinput_Locator("fieldName:REIMB.BK.CHGS",testData.get("REIMB.BK.CHGS"));
        PageObject.textinput_Locator("radio:tab5:REIMB.BK.CHGS",testData.get("tab5"));
        PageObject.textinput_Locator("fieldName:CHARGES.DET:1",testData.get("CHARGES.DET"));
        PageObject.textinput_Locator("fieldName:NEG.WITH.BANK:1",testData.get("NEG.WITH.BANK"));
        PageObject.textinput_Locator("fieldName:BANK.TO.BK740:1",testData.get("BANK.TO.BK740"));
        PageObject.textinput_Locator("fieldName:BENEFICIARY.ACC",testData.get("BENEFICIARY.ACC"));

        PageObject.form_Tab("Pay/Confirm/Assign/Revol");

        PageObject.textinput_Locator("fieldName:PAYMENT.PCT:1",testData.get("PAYMENT.PCT"));
        PageObject.textinput_Locator("fieldName:PAY.PORTION:1",testData.get("PAY.PORTION"));
        PageObject.textinput_Locator("fieldName:ACPT.TM.BAND:1",testData.get("ACPT.TM.BAND"));
        PageObject.textinput_Locator("fieldName:ADD.COVERED.AMT:1",testData.get("ADD.COVERED.AMT"));
        PageObject.textinput_Locator("fieldName:PORT.LIM.REF:1",testData.get("PORT.LIM.REF"));
        PageObject.textinput_Locator("fieldName:T.CHARGE.AMT",testData.get("T.CHARGE.AMT"));
        PageObject.textinput_Locator("fieldName:CONFIRM.INST",testData.get("CONFIRM.INST"));
        PageObject.textinput_Locator("radio:tab6:CONFIRM.INST",testData.get("tab6"));
        PageObject.textinput_Locator("fieldName:RISK.PARTY",testData.get("RISK.PARTY"));
        PageObject.textinput_Locator("fieldName:CONFIRMATION.AMT",testData.get("CONFIRMATION.AMT"));
        PageObject.textinput_Locator("fieldName:CONFIRM.PERIOD",testData.get("CONFIRM.PERIOD"));
        PageObject.textinput_Locator("fieldName:CONFIRM.RATE",testData.get("CONFIRM.RATE"));
        PageObject.textinput_Locator("fieldName:UNCONF.LIMIT.REF",testData.get("UNCONF.LIMIT.REF"));
        PageObject.textinput_Locator("fieldName:ASSN.REFERENCE:1",testData.get("ASSN.REFERENCE"));
        PageObject.textinput_Locator("fieldName:ASSN.CUSTNO:1",testData.get("ASSN.CUSTNO"));
        PageObject.textinput_Locator("fieldName:ASSN.ADD:1:1",testData.get("ASSN.ADD"));
        PageObject.textinput_Locator("fieldName:ASSN.AMOUNT:1",testData.get("ASSN.AMOUNT"));
        PageObject.textinput_Locator("fieldName:ASSN.NOTE:1:1",testData.get("ASSN.NOTE"));
        PageObject.textinput_Locator("fieldName:REVOLVING.TYPE",testData.get("REVOLVING.TYPE"));
        PageObject.textinput_Locator("radio:tab6:REVOLVING.TYPE",testData.get("tab6"));
        PageObject.textinput_Locator("fieldName:NO.OF.REVOLVING",testData.get("NO.OF.REVOLVING"));
        PageObject.textinput_Locator("fieldName:REVOLVING.FQY",testData.get("REVOLVING.FQY"));

        PageObject.form_Tab("MT 700/710/720/");

        PageObject.textinput_Locator("fieldName:CONF.ADDL.INST",testData.get("CONF.ADDL.INST"));
        PageObject.textinput_Locator("radio:tab7:CONF.ADDL.INST",testData.get("tab7"));
        PageObject.textinput_Locator("fieldName:ISS.BANK.REF",testData.get("ISS.BANK.REF"));
        PageObject.textinput_Locator("fieldName:PRE.ADV.REF",testData.get("PRE.ADV.REF"));
        PageObject.textinput_Locator("fieldName:ISSUE.DATE",testData.get("ISSUE.DATE"));
        PageObject.textinput_Locator("fieldName:ADVICE.EXPIRY.DATE",testData.get("ADVICE.EXPIRY.DATE"));
        PageObject.textinput_Locator("fieldName:EXPIRY.PLACE",testData.get("EXPIRY.PLACE"));
        PageObject.textinput_Locator("fieldName:ISSUING.BANK.NO",testData.get("ISSUING.BANK.NO"));
        PageObject.textinput_Locator("fieldName:ISSUING.BANK:1",testData.get("ISSUING.BANK"));
        PageObject.textinput_Locator("fieldName:APPLICANT.BANK:1",testData.get("APPLICANT.BANK"));
        PageObject.textinput_Locator("fieldName:APPLICANT:1",testData.get("APPLICANT"));
        PageObject.textinput_Locator("fieldName:BENEFICIARY:1",testData.get("BENEFICIARY"));
        PageObject.textinput_Locator("fieldName:LC.CURRENCY",testData.get("LC.CURRENCY"));
        PageObject.textinput_Locator("fieldName:LC.AMOUNT",testData.get("LC.AMOUNT"));
        PageObject.textinput_Locator("fieldName:PERCENTAGE.CR.AMT",testData.get("PERCENTAGE.CR.AMT"));
        PageObject.textinput_Locator("fieldName:PERCENTAGE.DR.AMT",testData.get("PERCENTAGE.DR.AMT"));
        PageObject.textinput_Locator("fieldName:ADD.AMT.COVERED:1",testData.get("ADD.AMT.COVERED"));
        PageObject.textinput_Locator("fieldName:AVAIL.WITH.CUSTNO",testData.get("AVAIL.WITH.CUSTNO"));
        PageObject.textinput_Locator("fieldName:AVAILABLE.WITH:1",testData.get("AVAILABLE.WITH"));
        PageObject.textinput_Locator("fieldName:DRAFTS.AT:1",testData.get("DRAFTS.AT"));
        PageObject.textinput_Locator("fieldName:DRAWEE.CUST.NO",testData.get("DRAWEE.CUST.NO"));
        PageObject.textinput_Locator("fieldName:DRAWEE:1",testData.get("DRAWEE"));
        PageObject.textinput_Locator("fieldName:MIXED.PAYMENT:1",testData.get("MIXED.PAYMENT"));
        PageObject.textinput_Locator("fieldName:DEFERRED.PAY:1",testData.get("DEFERRED.PAY"));
        PageObject.textinput_Locator("fieldName:SHIP.DESPATCH",testData.get("SHIP.DESPATCH"));
        PageObject.textinput_Locator("fieldName:TRANSPORTATION",testData.get("TRANSPORTATION"));
        PageObject.textinput_Locator("fieldName:LATEST.SHIPMENT",testData.get("LATEST.SHIPMENT"));
        PageObject.textinput_Locator("fieldName:SHIPMENT.PERIOD:1",testData.get("SHIPMENT.PERIOD"));
        PageObject.textinput_Locator("fieldName:PRESENT.PERIOD",testData.get("PRESENT.PERIOD"));
        PageObject.textinput_Locator("fieldName:CONFIRM.INST",testData.get("CONFIRM.INST"));
        PageObject.textinput_Locator("radio:tab7:CONFIRM.INST",testData.get("tab7"));
        PageObject.textinput_Locator("fieldName:THIRD.PARTY.CUSTNO",testData.get("THIRD.PARTY.CUSTNO"));
        PageObject.textinput_Locator("fieldName:THIRD.PARTY:1",testData.get("THIRD.PARTY"));
        PageObject.textinput_Locator("fieldName:ADVISE.THRU.CUSTNO",testData.get("ADVISE.THRU.CUSTNO"));
        PageObject.textinput_Locator("fieldName:ADVISE.THRU:1",testData.get("ADVISE.THRU"));
        PageObject.textinput_Locator("fieldName:BANK.TO.BANK:1",testData.get("BANK.TO.BANK"));
        PageObject.textinput_Locator("fieldName:REQ.CONF.BNK",testData.get("REQ.CONF.BNK"));
        PageObject.textinput_Locator("fieldName:CONF.BNK.NAME:1",testData.get("CONF.BNK.NAME"));
        PageObject.textinput_Locator("fieldName:TRANS.SHIP.CODE",testData.get("TRANS.SHIP.CODE"));
        PageObject.textinput_Locator("radio:tab7:TRANS.SHIP.CODE",testData.get("tab7"));
        PageObject.textinput_Locator("fieldName:PART.SHIP.CODE",testData.get("PART.SHIP.CODE"));
        PageObject.textinput_Locator("radio:tab7:PART.SHIP.CODE",testData.get("tab7"));
        PageObject.textinput_Locator("fieldName:MT759.ALT.REF",testData.get("MT759.ALT.REF"));
        PageObject.textinput_Locator("fieldName:MT759.RECV.REF",testData.get("MT759.RECV.REF"));
        PageObject.textinput_Locator("fieldName:MT759.RECV.BANK",testData.get("MT759.RECV.BANK"));
        PageObject.textinput_Locator("fieldName:MT759.FORM.UNDK",testData.get("MT759.FORM.UNDK"));
        PageObject.textinput_Locator("radio:tab7:MT759.FORM.UNDK",testData.get("tab7"));

        PageObject.form_Tab("MT 730");

        PageObject.textinput_Locator("fieldName:ISS.BANK.REF",testData.get("ISS.BANK.REF"));
        PageObject.textinput_Locator("fieldName:ISSUE.DATE",testData.get("ISSUE.DATE"));
        PageObject.textinput_Locator("fieldName:ACK.CHG.CLAIM",testData.get("ACK.CHG.CLAIM"));
        PageObject.textinput_Locator("fieldName:730.ACC.WITH.BK:1",testData.get("730.ACC.WITH.BK"));
        PageObject.textinput_Locator("fieldName:CHARGES.DET:1",testData.get("CHARGES.DET"));
        PageObject.textinput_Locator("fieldName:730.SND.RCV.INF:1",testData.get("730.SND.RCV.INF"));

        PageObject.form_Tab("Delivery Info");

        PageObject.textinput_Locator("fieldName:MESSAGE.TYPE:1",testData.get("MESSAGE.TYPE"));
        PageObject.textinput_Locator("fieldName:MSG.CLASS.NO:1",testData.get("MSG.CLASS.NO"));
        PageObject.textinput_Locator("fieldName:OVR.CARRIER:1",testData.get("OVR.CARRIER"));
        PageObject.textinput_Locator("fieldName:ADDRESSEE:1:1",testData.get("ADDRESSEE"));
        PageObject.textinput_Locator("fieldName:SWIFT.BIC",testData.get("SWIFT.BIC"));
        PageObject.textinput_Locator("fieldName:DELIVERY.REF:1",testData.get("DELIVERY.REF"));
        PageObject.textinput_Locator("fieldName:BPM.REQ.ID",testData.get("BPM.REQ.ID"));
        PageObject.textinput_Locator("fieldName:SEND.ACCUITY",testData.get("SEND.ACCUITY"));
        PageObject.textinput_Locator("radio:tab9:SEND.ACCUITY",testData.get("tab9"));
        PageObject.textinput_Locator("fieldName:ACCUITY.RESP",testData.get("ACCUITY.RESP"));
        PageObject.textinput_Locator("fieldName:ACCUITY.REF",testData.get("ACCUITY.REF"));
        PageObject.textinput_Locator("fieldName:SEND.PSW",testData.get("SEND.PSW"));
        PageObject.textinput_Locator("radio:tab9:SEND.PSW",testData.get("tab9"));

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
