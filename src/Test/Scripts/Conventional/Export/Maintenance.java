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

public class Maintenance extends BaseClass {

    @Test(groups = {"ExportInputter"}, dataProvider = "MaintenanceExternal")
    public void MaintenanceExternal(Map<String, String> testData) throws IOException {

        PageObject.menu_Dropdown("Maintenance");
        //PageObject.img_Button("External Amendment");
        PageObject.menu_Link("External Amendment ");
        PageObject.switchToChildWindow();
        driver.manage().window().maximize();
        PageObject.textinput_Locator("transactionId","TF1922800080");
        PageObject.img_Button("Edit a contract");
        PageObject.switchToChildWindow();
        PageObject.textinput_Locator("fieldName:FULLY.UTILISED",testData.get("FULLY.UTILISED"));
        PageObject.textinput_Locator("fieldName:OLD.LC.NUMBER",testData.get("OLD.LC.NUMBER"));
        PageObject.textinput_Locator("fieldName:AMENDMENT.DEL",testData.get("AMENDMENT.DEL"));
        PageObject.textinput_Locator("fieldName:ISS.BANK.REF",testData.get("ISS.BANK.REF"));
        PageObject.textinput_Locator("fieldName:EXTERNAL.REFERENCE",testData.get("EXTERNAL.REFERENCE"));
        PageObject.textinput_Locator("fieldName:LC.TYPE",testData.get("LC.TYPE"));
        PageObject.textinput_Locator("fieldName:ISSUING.BANK:1",testData.get("ISSUING.BANK"));
        PageObject.textinput_Locator("fieldName:ISSUE.DATE",testData.get("ISSUE.DATE"));
        PageObject.textinput_Locator("fieldName:LC.CURRENCY",testData.get("LC.CURRENCY"));
        PageObject.textinput_Locator("fieldName:LC.AMOUNT",testData.get("LC.AMOUNT"));
        PageObject.textinput_Locator("fieldName:LIABILITY.AMT",testData.get("LIABILITY.AMT"));
        PageObject.textinput_Locator("fieldName:PERCENTAGE.CR.AMT",testData.get("PERCENTAGE.CR.AMT"));
        PageObject.textinput_Locator("fieldName:PERCENTAGE.DR.AMT",testData.get("PERCENTAGE.DR.AMT"));
        PageObject.textinput_Locator("fieldName:ADD.AMT.COVERED:1",testData.get("ADD.AMT.COVERED"));
        PageObject.textinput_Locator("fieldName:ADVICE.EXPIRY.DATE",testData.get("ADVICE.EXPIRY.DATE"));
        PageObject.textinput_Locator("fieldName:EXPIRY.PLACE",testData.get("EXPIRY.PLACE"));
        PageObject.textinput_Locator("fieldName:EXPIRY.DATE",testData.get("EXPIRY.DATE"));
        PageObject.textinput_Locator("fieldName:PORT.LIM.REF:1",testData.get("PORT.LIM.REF"));
        PageObject.textinput_Locator("fieldName:BENEFICIARY.CUSTNO",testData.get("BENEFICIARY.CUSTNO"));
        PageObject.textinput_Locator("fieldName:BENEFICIARY:1",testData.get("BENEFICIARY"));
        PageObject.textinput_Locator("fieldName:BENEFICIARY:2",testData.get("BENEFICIARY"));
        PageObject.textinput_Locator("fieldName:BENEFICIARY:3",testData.get("BENEFICIARY"));
        PageObject.textinput_Locator("fieldName:BENEFICIARY:4",testData.get("BENEFICIARY"));
        PageObject.textinput_Locator("fieldName:CLIENT.CNTRY:1",testData.get("CLIENT.CNTRY"));
        PageObject.textinput_Locator("fieldName:SHIP.DESPATCH",testData.get("SHIP.DESPATCH"));
        PageObject.textinput_Locator("fieldName:TRANSPORTATION",testData.get("TRANSPORTATION"));
        PageObject.textinput_Locator("fieldName:LATEST.SHIPMENT",testData.get("LATEST.SHIPMENT"));
        PageObject.textinput_Locator("fieldName:SHIPMENT.PERIOD:1",testData.get("SHIPMENT.PERIOD"));
        PageObject.textinput_Locator("fieldName:BANK.TO.BANK:1",testData.get("BANK.TO.BANK"));
        PageObject.textinput_Locator("fieldName:BANK.TO.BANK:2",testData.get("BANK.TO.BANK"));
        PageObject.textinput_Locator("fieldName:ADVISE.THRU.CUSTNO",testData.get("ADVISE.THRU.CUSTNO"));
        PageObject.textinput_Locator("fieldName:ADVISE.THRU:1",testData.get("ADVISE.THRU"));
        PageObject.textinput_Locator("fieldName:ADV.PAY.PERCENT",testData.get("ADV.PAY.PERCENT"));
        PageObject.textinput_Locator("fieldName:SIGHT.PERCENT",testData.get("SIGHT.PERCENT"));
        PageObject.textinput_Locator("fieldName:USANCE.PERCENT",testData.get("USANCE.PERCENT"));
        PageObject.textinput_Locator("fieldName:OVERRIDE:1",testData.get("OVERRIDE"));
        PageObject.textinput_Locator("fieldName:OVERRIDE:2",testData.get("OVERRIDE"));
        PageObject.textinput_Locator("fieldName:OVERRIDE:3",testData.get("OVERRIDE"));
        PageObject.textinput_Locator("fieldName:OVERRIDE:4",testData.get("OVERRIDE"));
        PageObject.textinput_Locator("fieldName:LD.REF.ID:1",testData.get("LD.REF.ID"));

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
        PageObject.textinput_Locator("fieldName:TAX.CCY:1",testData.get("TAX.CCY"));
        PageObject.textinput_Locator("fieldName:TAX.AMT:1",testData.get("TAX.AMT"));

        PageObject.form_Tab("FWD Contract / HS Code Details");

        PageObject.textinput_Locator("fieldName:FWD.CONT",testData.get("FWD.CONT"));
        PageObject.textinput_Locator("radio:tab3:FWD.CONT",testData.get("tab3"));
        PageObject.textinput_Locator("fieldName:INCO.TERMS.LC",testData.get("INCO.TERMS.LC"));
        PageObject.textinput_Locator("fieldName:HS.CODE:1",testData.get("HS.CODE"));
        PageObject.textinput_Locator("fieldName:HS.QUANTITY:1",testData.get("HS.QUANTITY"));
        PageObject.textinput_Locator("fieldName:UNIT.PRICE:1",testData.get("UNIT.PRICE"));
        PageObject.textinput_Locator("fieldName:HS.INV.AMT:1",testData.get("HS.INV.AMT"));
        PageObject.textinput_Locator("fieldName:BAF.DESC.GOODS:1",testData.get("BAF.DESC.GOODS"));
        PageObject.textinput_Locator("fieldName:BAF.HS.BPRICE:1",testData.get("BAF.HS.BPRICE"));
        PageObject.textinput_Locator("fieldName:SCRUTINY.REF",testData.get("SCRUTINY.REF"));

        PageObject.form_Tab("Terms and Conditions");

        PageObject.textinput_Locator("fieldName:ADD.AMT.COVERED:1",testData.get("ADD.AMT.COVERED"));
        PageObject.textinput_Locator("fieldName:SHIP.DESPATCH",testData.get("SHIP.DESPATCH"));
        PageObject.textinput_Locator("fieldName:TRANSPORTATION",testData.get("TRANSPORTATION"));
        PageObject.textinput_Locator("fieldName:LATEST.SHIPMENT",testData.get("LATEST.SHIPMENT"));
        PageObject.textinput_Locator("fieldName:SHIPMENT.PERIOD:1",testData.get("SHIPMENT.PERIOD"));
        PageObject.textinput_Locator("fieldName:APPLICANT.BANK:1",testData.get("APPLICANT.BANK"));
        PageObject.textinput_Locator("fieldName:ADVISE.THRU.CUSTNO",testData.get("ADVISE.THRU.CUSTNO"));
        PageObject.textinput_Locator("fieldName:ADVISE.THRU:1",testData.get("ADVISE.THRU"));
        PageObject.textinput_Locator("fieldName:DRAFTS.AT:1",testData.get("DRAFTS.AT"));
        PageObject.textinput_Locator("fieldName:DRAWEE.CUST.NO",testData.get("DRAWEE.CUST.NO"));
        PageObject.textinput_Locator("fieldName:DRAWEE:1",testData.get("DRAWEE"));
        PageObject.textinput_Locator("fieldName:MIXED.PAYMENT:1",testData.get("MIXED.PAYMENT"));
        PageObject.textinput_Locator("fieldName:DEFERRED.PAY:1",testData.get("DEFERRED.PAY"));
        PageObject.textinput_Locator("fieldName:PRESENT.PERIOD",testData.get("PRESENT.PERIOD"));
        PageObject.textinput_Locator("fieldName:CONFIRM.INST",testData.get("CONFIRM.INST"));
        PageObject.textinput_Locator("radio:tab4:CONFIRM.INST",testData.get("tab4"));
        PageObject.textinput_Locator("fieldName:BANK.TO.BANK:1",testData.get("BANK.TO.BANK"));
        PageObject.textinput_Locator("fieldName:BANK.TO.BANK:2",testData.get("BANK.TO.BANK"));

        PageObject.form_Tab("MT 707");

        PageObject.textinput_Locator("fieldName:OLD.LC.NUMBER",testData.get("OLD.LC.NUMBER"));
        PageObject.textinput_Locator("fieldName:EXTERNAL.REFERENCE",testData.get("EXTERNAL.REFERENCE"));
        PageObject.textinput_Locator("fieldName:ISSUE.DATE",testData.get("ISSUE.DATE"));
        PageObject.textinput_Locator("fieldName:AMENDMENT.NO",testData.get("AMENDMENT.NO"));
        PageObject.textinput_Locator("fieldName:BENEFICIARY.CUSTNO",testData.get("BENEFICIARY.CUSTNO"));
        PageObject.textinput_Locator("fieldName:BENEFICIARY:1",testData.get("BENEFICIARY"));
        PageObject.textinput_Locator("fieldName:BENEFICIARY:2",testData.get("BENEFICIARY"));
        PageObject.textinput_Locator("fieldName:BENEFICIARY:3",testData.get("BENEFICIARY"));
        PageObject.textinput_Locator("fieldName:BENEFICIARY:4",testData.get("BENEFICIARY"));
        PageObject.textinput_Locator("fieldName:ADVICE.EXPIRY.DATE",testData.get("ADVICE.EXPIRY.DATE"));
        PageObject.textinput_Locator("fieldName:LC.CURRENCY",testData.get("LC.CURRENCY"));
        PageObject.textinput_Locator("fieldName:LC.AMOUNT",testData.get("LC.AMOUNT"));
        PageObject.textinput_Locator("fieldName:PERCENTAGE.CR.AMT",testData.get("PERCENTAGE.CR.AMT"));
        PageObject.textinput_Locator("fieldName:PERCENTAGE.DR.AMT",testData.get("PERCENTAGE.DR.AMT"));
        PageObject.textinput_Locator("fieldName:ADD.AMT.COVERED:1",testData.get("ADD.AMT.COVERED"));
        PageObject.textinput_Locator("fieldName:SHIP.DESPATCH",testData.get("SHIP.DESPATCH"));
        PageObject.textinput_Locator("fieldName:OTHER.DESPATCH.DET",testData.get("OTHER.DESPATCH.DET"));
        PageObject.textinput_Locator("fieldName:TRANSPORTATION",testData.get("TRANSPORTATION"));
        PageObject.textinput_Locator("fieldName:FINAL.DESTINATION",testData.get("FINAL.DESTINATION"));
        PageObject.textinput_Locator("fieldName:LATEST.SHIPMENT",testData.get("LATEST.SHIPMENT"));
        PageObject.textinput_Locator("fieldName:SHIPMENT.PERIOD:1",testData.get("SHIPMENT.PERIOD"));
        PageObject.textinput_Locator("fieldName:BANK.TO.BANK:1",testData.get("BANK.TO.BANK"));
        PageObject.textinput_Locator("fieldName:BANK.TO.BANK:2",testData.get("BANK.TO.BANK"));
        PageObject.textinput_Locator("fieldName:PURP.OF.MSG",testData.get("PURP.OF.MSG"));
        PageObject.textinput_Locator("radio:tab5:PURP.OF.MSG",testData.get("tab5"));
        PageObject.textinput_Locator("fieldName:EXPIRY.PLACE",testData.get("EXPIRY.PLACE"));
        PageObject.textinput_Locator("fieldName:APPLICANT:1",testData.get("APPLICANT"));
        PageObject.textinput_Locator("fieldName:APPLICANT:2",testData.get("APPLICANT"));
        PageObject.textinput_Locator("fieldName:APPLICANT:3",testData.get("APPLICANT"));
        PageObject.textinput_Locator("fieldName:AVAIL.WITH.CUSTNO",testData.get("AVAIL.WITH.CUSTNO"));
        PageObject.textinput_Locator("fieldName:AVAILABLE.WITH:1",testData.get("AVAILABLE.WITH"));
        PageObject.textinput_Locator("fieldName:DRAFTS.AT:1",testData.get("DRAFTS.AT"));
        PageObject.textinput_Locator("fieldName:DRAWEE.CUST.NO",testData.get("DRAWEE.CUST.NO"));
        PageObject.textinput_Locator("fieldName:DRAWEE:1",testData.get("DRAWEE"));
        PageObject.textinput_Locator("fieldName:MIXED.PAYMENT:1",testData.get("MIXED.PAYMENT"));
        PageObject.textinput_Locator("fieldName:DEFERRED.PAY:1",testData.get("DEFERRED.PAY"));
        PageObject.textinput_Locator("fieldName:PART.SHIP.CODE",testData.get("PART.SHIP.CODE"));
        PageObject.textinput_Locator("radio:tab5:PART.SHIP.CODE",testData.get("tab5"));
        PageObject.textinput_Locator("fieldName:TRANS.SHIP.CODE",testData.get("TRANS.SHIP.CODE"));
        PageObject.textinput_Locator("radio:tab5:TRANS.SHIP.CODE",testData.get("tab5"));
        PageObject.textinput_Locator("fieldName:PRES.DAY.PERIOD",testData.get("PRES.DAY.PERIOD"));
        PageObject.textinput_Locator("fieldName:THIRD.PARTY.CUSTNO",testData.get("THIRD.PARTY.CUSTNO"));
        PageObject.textinput_Locator("fieldName:THIRD.PARTY:1",testData.get("THIRD.PARTY"));
        PageObject.textinput_Locator("fieldName:CONFIRM.INST",testData.get("CONFIRM.INST"));
        PageObject.textinput_Locator("radio:tab5:CONFIRM.INST",testData.get("tab5"));
        PageObject.textinput_Locator("fieldName:ADVISE.THRU.CUSTNO",testData.get("ADVISE.THRU.CUSTNO"));
        PageObject.textinput_Locator("fieldName:ADVISE.THRU:1",testData.get("ADVISE.THRU"));
        PageObject.textinput_Locator("fieldName:REQ.CONF.BNK",testData.get("REQ.CONF.BNK"));
        PageObject.textinput_Locator("fieldName:CONF.BNK.NAME:1",testData.get("CONF.BNK.NAME"));

        PageObject.form_Tab("Delivery Info");

        PageObject.textinput_Locator("fieldName:MESSAGE.TYPE:1",testData.get("MESSAGE.TYPE"));
        PageObject.textinput_Locator("fieldName:MSG.CLASS.NO:1",testData.get("MSG.CLASS.NO"));
        PageObject.textinput_Locator("fieldName:OVR.CARRIER:1",testData.get("OVR.CARRIER"));
        PageObject.textinput_Locator("fieldName:ADDRESSEE:1:1",testData.get("ADDRESSEE"));
        PageObject.textinput_Locator("fieldName:SWIFT.BIC",testData.get("SWIFT.BIC"));
        PageObject.textinput_Locator("fieldName:BPM.REQ.ID",testData.get("BPM.REQ.ID"));
        PageObject.textinput_Locator("fieldName:SEND.ACCUITY",testData.get("SEND.ACCUITY"));
        PageObject.textinput_Locator("radio:tab6:SEND.ACCUITY",testData.get("tab6"));
        PageObject.textinput_Locator("fieldName:ACCUITY.RESP",testData.get("ACCUITY.RESP"));
        PageObject.textinput_Locator("fieldName:ACCUITY.REF",testData.get("ACCUITY.REF"));
        PageObject.textinput_Locator("fieldName:SEND.PSW",testData.get("SEND.PSW"));
        PageObject.textinput_Locator("radio:tab6:SEND.PSW",testData.get("tab6"));
        PageObject.textinput_Locator("fieldName:PSW.REFERENCE:1",testData.get("PSW.REFERENCE"));

        PageObject.form_Tab("Audit Info");

//        PageObject.textinput_Locator("fieldName:OVERRIDE:1",testData.get("OVERRIDE"));
//        PageObject.textinput_Locator("fieldName:OVERRIDE:2",testData.get("OVERRIDE"));
//        PageObject.textinput_Locator("fieldName:OVERRIDE:3",testData.get("OVERRIDE"));
//        PageObject.textinput_Locator("fieldName:OVERRIDE:4",testData.get("OVERRIDE"));
//        PageObject.textinput_Locator("fieldName:RECORD.STATUS",testData.get("RECORD.STATUS"));
//        PageObject.textinput_Locator("fieldName:CURR.NO",testData.get("CURR.NO"));
//        PageObject.textinput_Locator("fieldName:INPUTTER:1",testData.get("INPUTTER"));
//        PageObject.textinput_Locator("fieldName:INPUTTER:2",testData.get("INPUTTER"));
//        PageObject.textinput_Locator("fieldName:INPUTTER:3",testData.get("INPUTTER"));
//        PageObject.textinput_Locator("fieldName:INPUTTER:4",testData.get("INPUTTER"));
//        PageObject.textinput_Locator("fieldName:INPUTTER:5",testData.get("INPUTTER"));
//        PageObject.textinput_Locator("fieldName:DATE.TIME:1",testData.get("DATE.TIME"));
//        PageObject.textinput_Locator("fieldName:DATE.TIME:2",testData.get("DATE.TIME"));
//        PageObject.textinput_Locator("fieldName:AUTHORISER",testData.get("AUTHORISER"));
//        PageObject.textinput_Locator("fieldName:CO.CODE",testData.get("CO.CODE"));
//        PageObject.textinput_Locator("fieldName:DEPT.CODE",testData.get("DEPT.CODE"));





    }

    @Test(groups = {"ExportInputter"}, dataProvider = "MaintenanceInternal")
    public void MaintenanceInternal(Map<String, String> testData) throws IOException{

        PageObject.menu_Dropdown("Maintenance");
        //PageObject.img_Button("External Amendment");
        PageObject.menu_Link("Internal Amendment ");
        PageObject.switchToChildWindow();
        driver.manage().window().maximize();
        PageObject.textinput_Locator("transactionId","TF0903500460");
        PageObject.img_Button("Edit a contract");
        PageObject.switchToChildWindow();
        PageObject.textinput_Locator("fieldName:CATEGORY.CODE",testData.get("CATEGORY.CODE"));
        PageObject.textinput_Locator("fieldName:AMENDMENT.DEL",testData.get("AMENDMENT.DEL"));
        PageObject.textinput_Locator("fieldName:ISS.BANK.REF",testData.get("ISS.BANK.REF"));
        PageObject.textinput_Locator("fieldName:EXTERNAL.REFERENCE",testData.get("EXTERNAL.REFERENCE"));
        PageObject.textinput_Locator("fieldName:LC.TYPE",testData.get("LC.TYPE"));
        PageObject.textinput_Locator("fieldName:HS.CODE:1",testData.get("HS.CODE"));
        PageObject.textinput_Locator("fieldName:ISSUING.BANK.NO",testData.get("ISSUING.BANK.NO"));
        PageObject.textinput_Locator("fieldName:ISSUING.BANK:1",testData.get("ISSUING.BANK"));
        PageObject.textinput_Locator("fieldName:ISSUE.DATE",testData.get("ISSUE.DATE"));
        PageObject.textinput_Locator("fieldName:LC.CURRENCY",testData.get("LC.CURRENCY"));
        PageObject.textinput_Locator("fieldName:ACUDOLLAR",testData.get("ACUDOLLAR"));
        PageObject.textinput_Locator("fieldName:LC.AMOUNT",testData.get("LC.AMOUNT"));
        PageObject.textinput_Locator("fieldName:PERCENTAGE.CR.AMT",testData.get("PERCENTAGE.CR.AMT"));
        PageObject.textinput_Locator("fieldName:PERCENTAGE.DR.AMT",testData.get("PERCENTAGE.DR.AMT"));
        PageObject.textinput_Locator("fieldName:ADVICE.EXPIRY.DATE",testData.get("ADVICE.EXPIRY.DATE"));
        PageObject.textinput_Locator("fieldName:EXPIRY.PLACE",testData.get("EXPIRY.PLACE"));
        PageObject.textinput_Locator("fieldName:EXPIRY.DATE",testData.get("EXPIRY.DATE"));
        PageObject.textinput_Locator("fieldName:PORT.LIM.REF:1",testData.get("PORT.LIM.REF"));
        PageObject.textinput_Locator("fieldName:BENEFICIARY.CUSTNO",testData.get("BENEFICIARY.CUSTNO"));
        PageObject.textinput_Locator("fieldName:BENEFICIARY:1",testData.get("BENEFICIARY"));
        PageObject.textinput_Locator("fieldName:APPLICANT.CUSTNO",testData.get("APPLICANT.CUSTNO"));
        PageObject.textinput_Locator("fieldName:APPLICANT:1",testData.get("APPLICANT"));
        PageObject.textinput_Locator("fieldName:APPLICANT:2",testData.get("APPLICANT"));
        PageObject.textinput_Locator("fieldName:APPLICANT:3",testData.get("APPLICANT"));
        PageObject.textinput_Locator("fieldName:CLIENT.CNTRY:1",testData.get("CLIENT.CNTRY"));
        PageObject.textinput_Locator("fieldName:AVAIL.WITH.CUSTNO",testData.get("AVAIL.WITH.CUSTNO"));
        PageObject.textinput_Locator("fieldName:AVAILABLE.WITH:1",testData.get("AVAILABLE.WITH"));
        PageObject.textinput_Locator("fieldName:ADVISE.THRU.CUSTNO",testData.get("ADVISE.THRU.CUSTNO"));
        PageObject.textinput_Locator("fieldName:ADVISE.THRU:1",testData.get("ADVISE.THRU"));
        PageObject.textinput_Locator("fieldName:ADV.PAY.PERCENT",testData.get("ADV.PAY.PERCENT"));
        PageObject.textinput_Locator("fieldName:SIGHT.PERCENT",testData.get("SIGHT.PERCENT"));
        PageObject.textinput_Locator("fieldName:USANCE.PERCENT",testData.get("USANCE.PERCENT"));
        //PageObject.textinput_Locator("fieldName:OVERRIDE:1",testData.get("OVERRIDE"));
        PageObject.textinput_Locator("fieldName:ACCOUNT.OFFICER",testData.get("ACCOUNT.OFFICER"));
        PageObject.textinput_Locator("fieldName:LD.REF.ID:1",testData.get("LD.REF.ID"));

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
        PageObject.textinput_Locator("fieldName:AMOUNT",testData.get("AMOUNT"));
        PageObject.textinput_Locator("fieldName:BASIS.INS",testData.get("BASIS.INS"));
        PageObject.textinput_Locator("radio:tab3:BASIS.INS",testData.get("tab3"));
        PageObject.textinput_Locator("fieldName:RISK.COV",testData.get("RISK.COV"));
        PageObject.textinput_Locator("radio:tab3:RISK.COV",testData.get("tab3"));
        PageObject.textinput_Locator("fieldName:GOODS.COV",testData.get("GOODS.COV"));
        PageObject.textinput_Locator("radio:tab3:GOODS.COV",testData.get("tab3"));

        PageObject.form_Tab("FWD Contract / HS Code Details");

        PageObject.textinput_Locator("fieldName:FWD.CONT",testData.get("FWD.CONT"));
        PageObject.textinput_Locator("radio:tab4:FWD.CONT",testData.get("tab4"));
        PageObject.textinput_Locator("fieldName:INCO.TERMS.LC",testData.get("INCO.TERMS.LC"));
        PageObject.textinput_Locator("fieldName:HS.CODE:1",testData.get("HS.CODE"));
        PageObject.textinput_Locator("fieldName:HS.QUANTITY:1",testData.get("HS.QUANTITY"));
        PageObject.textinput_Locator("fieldName:UNIT.PRICE:1",testData.get("UNIT.PRICE"));
        PageObject.textinput_Locator("fieldName:HS.INV.AMT:1",testData.get("HS.INV.AMT"));
        PageObject.textinput_Locator("fieldName:BAF.DESC.GOODS:1",testData.get("BAF.DESC.GOODS"));
        PageObject.textinput_Locator("fieldName:BAF.HS.BPRICE:1",testData.get("BAF.HS.BPRICE"));
        PageObject.textinput_Locator("fieldName:SCRUTINY.REF",testData.get("SCRUTINY.REF"));

        PageObject.form_Tab("Terms and Conditions");

        PageObject.textinput_Locator("fieldName:ADD.AMT.COVERED:1",testData.get("ADD.AMT.COVERED"));
        PageObject.textinput_Locator("fieldName:SHIP.DESPATCH",testData.get("SHIP.DESPATCH"));
        PageObject.textinput_Locator("fieldName:TRANSPORTATION",testData.get("TRANSPORTATION"));
        PageObject.textinput_Locator("fieldName:LATEST.SHIPMENT",testData.get("LATEST.SHIPMENT"));
        PageObject.textinput_Locator("fieldName:SHIPMENT.PERIOD:1",testData.get("SHIPMENT.PERIOD"));
        PageObject.textinput_Locator("fieldName:HS.CODE:1",testData.get("HS.CODE"));
        PageObject.textinput_Locator("fieldName:HS.QUANTITY:1",testData.get("HS.QUANTITY"));
        PageObject.textinput_Locator("fieldName:DOCUMENT.CODE:1",testData.get("DOCUMENT.CODE"));
        PageObject.textinput_Locator("fieldName:APPLICANT.BANK:1",testData.get("APPLICANT.BANK"));
        PageObject.textinput_Locator("fieldName:ADVISE.THRU.CUSTNO",testData.get("ADVISE.THRU.CUSTNO"));
        PageObject.textinput_Locator("fieldName:ADVISE.THRU:1",testData.get("ADVISE.THRU"));
        PageObject.textinput_Locator("fieldName:DRAFTS.AT:1",testData.get("DRAFTS.AT"));
        PageObject.textinput_Locator("fieldName:DRAWEE.CUST.NO",testData.get("DRAWEE.CUST.NO"));
        PageObject.textinput_Locator("fieldName:DRAWEE:1",testData.get("DRAWEE"));
        PageObject.textinput_Locator("fieldName:MIXED.PAYMENT:1",testData.get("MIXED.PAYMENT"));
        PageObject.textinput_Locator("fieldName:DEFERRED.PAY:1",testData.get("DEFERRED.PAY"));
        PageObject.textinput_Locator("fieldName:PRESENT.PERIOD",testData.get("PRESENT.PERIOD"));
        PageObject.textinput_Locator("fieldName:CONFIRM.INST",testData.get("CONFIRM.INST"));
        PageObject.textinput_Locator("radio:tab5:CONFIRM.INST",testData.get("tab5"));

        PageObject.form_Tab("Reimb Info");

        PageObject.textinput_Locator("fieldName:THIRD.PARTY.CUSTNO",testData.get("THIRD.PARTY.CUSTNO"));
        PageObject.textinput_Locator("fieldName:THIRD.PARTY:1",testData.get("THIRD.PARTY"));
        PageObject.textinput_Locator("fieldName:REIMB.BK.CHGS",testData.get("REIMB.BK.CHGS"));
        PageObject.textinput_Locator("radio:tab6:REIMB.BK.CHGS",testData.get("tab6"));
        PageObject.textinput_Locator("fieldName:CHARGES.DET:1",testData.get("CHARGES.DET"));
        PageObject.textinput_Locator("fieldName:NEG.WITH.BANK:1",testData.get("NEG.WITH.BANK"));
        PageObject.textinput_Locator("fieldName:BANK.TO.BK740:1",testData.get("BANK.TO.BK740"));
        PageObject.textinput_Locator("fieldName:BENEFICIARY.ACC",testData.get("BENEFICIARY.ACC"));

        PageObject.form_Tab("Revolving Info");

        PageObject.form_Tab("Delivery Info");

        PageObject.textinput_Locator("fieldName:MESSAGE.TYPE:1",testData.get("MESSAGE.TYPE"));
        PageObject.textinput_Locator("fieldName:MSG.CLASS.NO:1",testData.get("MSG.CLASS.NO"));
        PageObject.textinput_Locator("fieldName:OVR.CARRIER:1",testData.get("OVR.CARRIER"));
        PageObject.textinput_Locator("fieldName:ADDRESSEE:1:1",testData.get("ADDRESSEE"));
        PageObject.textinput_Locator("fieldName:SWIFT.BIC",testData.get("SWIFT.BIC"));
        PageObject.textinput_Locator("fieldName:DELIVERY.REF:1",testData.get("DELIVERY.REF"));
        PageObject.textinput_Locator("fieldName:BPM.REQ.ID",testData.get("BPM.REQ.ID"));
        PageObject.textinput_Locator("fieldName:SEND.ACCUITY",testData.get("SEND.ACCUITY"));
        PageObject.textinput_Locator("radio:tab8:SEND.ACCUITY",testData.get("tab8"));
        PageObject.textinput_Locator("fieldName:ACCUITY.RESP",testData.get("ACCUITY.RESP"));
        PageObject.textinput_Locator("fieldName:ACCUITY.REF",testData.get("ACCUITY.REF"));
        PageObject.textinput_Locator("fieldName:SEND.PSW",testData.get("SEND.PSW"));
        PageObject.textinput_Locator("radio:tab8:SEND.PSW",testData.get("tab8"));
        PageObject.textinput_Locator("fieldName:PSW.REFERENCE:1",testData.get("PSW.REFERENCE"));

        PageObject.form_Tab("Audit Info");

//        PageObject.textinput_Locator("fieldName:OVERRIDE:1",testData.get("OVERRIDE"));
//        PageObject.textinput_Locator("fieldName:OVERRIDE:2",testData.get("OVERRIDE"));
//        PageObject.textinput_Locator("fieldName:OVERRIDE:3",testData.get("OVERRIDE"));
//        PageObject.textinput_Locator("fieldName:OVERRIDE:4",testData.get("OVERRIDE"));
//        PageObject.textinput_Locator("fieldName:RECORD.STATUS",testData.get("RECORD.STATUS"));
//        PageObject.textinput_Locator("fieldName:CURR.NO",testData.get("CURR.NO"));
//        PageObject.textinput_Locator("fieldName:INPUTTER:1",testData.get("INPUTTER"));
//        PageObject.textinput_Locator("fieldName:INPUTTER:2",testData.get("INPUTTER"));
//        PageObject.textinput_Locator("fieldName:INPUTTER:3",testData.get("INPUTTER"));
//        PageObject.textinput_Locator("fieldName:INPUTTER:4",testData.get("INPUTTER"));
//        PageObject.textinput_Locator("fieldName:INPUTTER:5",testData.get("INPUTTER"));
//        PageObject.textinput_Locator("fieldName:DATE.TIME:1",testData.get("DATE.TIME"));
//        PageObject.textinput_Locator("fieldName:DATE.TIME:2",testData.get("DATE.TIME"));
//        PageObject.textinput_Locator("fieldName:AUTHORISER",testData.get("AUTHORISER"));
//        PageObject.textinput_Locator("fieldName:CO.CODE",testData.get("CO.CODE"));
//        PageObject.textinput_Locator("fieldName:DEPT.CODE",testData.get("DEPT.CODE"));
//        PageObject.textinput_Locator("fieldName:AUDITOR.CODE",testData.get("AUDITOR.CODE"));
//        PageObject.textinput_Locator("fieldName:AUDIT.DATE.TIME",testData.get("AUDIT.DATE.TIME"));



    }

    private static final String FILE_PATH = "path/to/your/excel/file.xlsx"; // Update with your file path

    @DataProvider(name = "MaintenanceExternal")
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

    @DataProvider(name = "MaintenanceInternal")
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

}
