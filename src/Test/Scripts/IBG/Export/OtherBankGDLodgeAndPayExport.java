package Test.Scripts.IBG.Export;

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

public class OtherBankGDLodgeAndPayExport extends BaseClass {

    @Test(groups = {"IBGExportInputter"}, dataProvider = "LodgmentOtherBankGD")
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

        PageObject.commitTxn();
        PageObject.commitDeal("LodgmentOtherBankGD");

    }

    @Test(groups = {"IBGExportInputter"}, dataProvider = "AmendOtherGDLodgment")
    public void AmendOtherGDLodgment(Map<String, String> testData) throws IOException{

        PageObject.menu_Dropdown("Other Bank GD - Lodge And Pay",1);
        PageObject.menu_Link("Amend Other GD Lodgment ");
        PageObject.switchToChildWindow();
        driver.manage().window().maximize();
        PageObject.textinput_Locator("transactionId","TF1810365853");
        PageObject.img_Button("Edit a contract");
        PageObject.switchToChildWindow();
        PageObject.textinput_Locator("fieldName:EXTERNAL.REFERENCE",testData.get("EXTERNAL.REFERENCE"));
        PageObject.textinput_Locator("fieldName:COURIER.REF",testData.get("COURIER.REF"));
        PageObject.textinput_Locator("fieldName:LC.TYPE",testData.get("LC.TYPE"));
        PageObject.textinput_Locator("fieldName:GD.NUM:1",testData.get("GD.NUM"));
        PageObject.textinput_Locator("fieldName:BAF.OTHGD:1",testData.get("BAF.OTHGD"));
        PageObject.textinput_Locator("fieldName:APPLICANT:1",testData.get("APPLICANT"));
        PageObject.textinput_Locator("fieldName:APPLICANT:2",testData.get("APPLICANT"));
        PageObject.textinput_Locator("fieldName:APPLICANT.ACC",testData.get("APPLICANT.ACC"));
        PageObject.textinput_Locator("fieldName:CHARGES.ACCOUNT",testData.get("CHARGES.ACCOUNT"));
        PageObject.textinput_Locator("fieldName:ACUDOLLAR",testData.get("ACUDOLLAR"));
        PageObject.textinput_Locator("radio:tab1:ACUDOLLAR",testData.get("tab1"));
        PageObject.textinput_Locator("fieldName:LC.AMOUNT",testData.get("LC.AMOUNT"));
        PageObject.textinput_Locator("fieldName:FOB.VALUE",testData.get("FOB.VALUE"));
        PageObject.textinput_Locator("",testData.get("undefined"));
        PageObject.textinput_Locator("fieldName:LATEST.SHIPMENT",testData.get("LATEST.SHIPMENT"));
        PageObject.textinput_Locator("fieldName:EXPIRY.DATE",testData.get("EXPIRY.DATE"));
        PageObject.textinput_Locator("fieldName:ADVICE.EXPIRY.DATE",testData.get("ADVICE.EXPIRY.DATE"));
        PageObject.textinput_Locator("fieldName:TRACER.DATE",testData.get("TRACER.DATE"));
        PageObject.textinput_Locator("fieldName:TRACER.DAYS",testData.get("TRACER.DAYS"));
        PageObject.textinput_Locator("fieldName:TENOR",testData.get("TENOR"));
        PageObject.textinput_Locator("fieldName:DAYS",testData.get("DAYS"));
        PageObject.textinput_Locator("fieldName:DATE.ACCEPTED",testData.get("DATE.ACCEPTED"));
        PageObject.textinput_Locator("fieldName:ACCOUNT.OFFICER",testData.get("ACCOUNT.OFFICER"));
        PageObject.textinput_Locator("fieldName:ISSUING.BANK.NO",testData.get("ISSUING.BANK.NO"));
        PageObject.textinput_Locator("fieldName:ISSUING.BANK:1",testData.get("ISSUING.BANK"));
        PageObject.textinput_Locator("fieldName:LC.COUNTRY",testData.get("LC.COUNTRY"));
        PageObject.textinput_Locator("fieldName:BENEFICIARY.CUSTNO",testData.get("BENEFICIARY.CUSTNO"));
        PageObject.textinput_Locator("fieldName:BENEFICIARY:1",testData.get("BENEFICIARY"));
        PageObject.textinput_Locator("fieldName:BENEFICIARY:2",testData.get("BENEFICIARY"));
        PageObject.textinput_Locator("fieldName:BENEFICIARY:3",testData.get("BENEFICIARY"));
        PageObject.textinput_Locator("fieldName:BENEFICIARY:4",testData.get("BENEFICIARY"));
        PageObject.textinput_Locator("fieldName:CLIENT.CNTRY:1",testData.get("CLIENT.CNTRY"));
        PageObject.textinput_Locator("fieldName:REC.DATE",testData.get("REC.DATE"));
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

        PageObject.form_Tab("FWD Contract / HS Code Details");

        PageObject.textinput_Locator("fieldName:FWD.CONT",testData.get("FWD.CONT"));
        PageObject.textinput_Locator("radio:tab5:FWD.CONT",testData.get("tab5"));
        PageObject.textinput_Locator("fieldName:INCO.TERMS.LC",testData.get("INCO.TERMS.LC"));
        PageObject.textinput_Locator("fieldName:HS.CODE:1",testData.get("HS.CODE"));
        PageObject.textinput_Locator("fieldName:HS.QUANTITY:1",testData.get("HS.QUANTITY"));
        PageObject.textinput_Locator("fieldName:UNIT.PRICE:1",testData.get("UNIT.PRICE"));
        PageObject.textinput_Locator("fieldName:HS.INV.AMT:1",testData.get("HS.INV.AMT"));
        PageObject.textinput_Locator("fieldName:BAF.DESC.GOODS:1",testData.get("BAF.DESC.GOODS"));
        PageObject.textinput_Locator("fieldName:BAF.HS.BPRICE:1",testData.get("BAF.HS.BPRICE"));
        PageObject.textinput_Locator("fieldName:SCRUTINY.REF",testData.get("SCRUTINY.REF"));

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

        PageObject.form_Tab("Delivery Info");

        PageObject.textinput_Locator("fieldName:MESSAGE.TYPE:1",testData.get("MESSAGE.TYPE"));
        PageObject.textinput_Locator("fieldName:MSG.CLASS.NO:1",testData.get("MSG.CLASS.NO"));
        PageObject.textinput_Locator("fieldName:OVR.CARRIER:1",testData.get("OVR.CARRIER"));
        PageObject.textinput_Locator("fieldName:ADDRESSEE:1:1",testData.get("ADDRESSEE"));
        PageObject.textinput_Locator("fieldName:SWIFT.BIC",testData.get("SWIFT.BIC"));
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

        PageObject.commitTxn();
        PageObject.commitDeal("AmendOtherGDLodgment");

    }

    @Test(groups = {"IBGExportInputter"}, dataProvider = "PaymentOtherBankGD")
    public void PaymentOtherBankGD(Map<String, String> testData) throws IOException{

        PageObject.menu_Dropdown("Other Bank GD - Lodge And Pay",1);
        PageObject.menu_Link("Payment - Other Bank GD ");
        PageObject.switchToChildWindow();
        driver.manage().window().maximize();
        PageObject.textinput_Locator("transactionId","TF1810365853");
        PageObject.img_Button("Edit a contract");
        PageObject.switchToChildWindow();
        PageObject.textinput_Locator("fieldName:BAF.OTHGD:1",testData.get("BAF.OTHGD"));
        PageObject.textinput_Locator("fieldName:GD.NUM:1",testData.get("GD.NUM"));
        PageObject.textinput_Locator("fieldName:BAF.PAY.TYPE",testData.get("BAF.PAY.TYPE"));
        PageObject.textinput_Locator("radio:tab1:BAF.PAY.TYPE",testData.get("tab1"));
        PageObject.textinput_Locator("fieldName:BAF.SWIFT.REF",testData.get("BAF.SWIFT.REF"));
        PageObject.textinput_Locator("fieldName:FULLY.UTILISED",testData.get("FULLY.UTILISED"));
        PageObject.textinput_Locator("fieldName:DRAW.CURRENCY",testData.get("DRAW.CURRENCY"));
        PageObject.textinput_Locator("fieldName:DOCUMENT.AMOUNT",testData.get("DOCUMENT.AMOUNT"));
        PageObject.textinput_Locator("fieldName:FOB.VALUE",testData.get("FOB.VALUE"));
        PageObject.textinput_Locator("fieldName:LC.FWD.CONT.NO",testData.get("LC.FWD.CONT.NO"));
        PageObject.textinput_Locator("fieldName:SHR.REALIZ",testData.get("SHR.REALIZ"));
        PageObject.textinput_Locator("fieldName:ADJ.FCY.ACCT",testData.get("ADJ.FCY.ACCT"));
        PageObject.textinput_Locator("fieldName:DISC.SETTLE.REM",testData.get("DISC.SETTLE.REM"));
        PageObject.textinput_Locator("radio:tab1:DISC.SETTLE.REM",testData.get("tab1"));
        PageObject.textinput_Locator("fieldName:DISC.AMT",testData.get("DISC.AMT"));
        PageObject.textinput_Locator("fieldName:AGENT.COMM",testData.get("AGENT.COMM"));
        PageObject.textinput_Locator("fieldName:FIN.CURR.DIFF",testData.get("FIN.CURR.DIFF"));
        PageObject.textinput_Locator("radio:tab1:FIN.CURR.DIFF",testData.get("tab1"));
        PageObject.textinput_Locator("fieldName:REAL.CURRENCY",testData.get("REAL.CURRENCY"));
        PageObject.textinput_Locator("fieldName:NOSTRO.CR.DATE",testData.get("NOSTRO.CR.DATE"));
        PageObject.textinput_Locator("fieldName:RATE.BOOKED",testData.get("RATE.BOOKED"));
        PageObject.textinput_Locator("fieldName:RATE.SPREAD",testData.get("RATE.SPREAD"));
        PageObject.textinput_Locator("fieldName:DRAWDOWN.ACCOUNT",testData.get("DRAWDOWN.ACCOUNT"));
        PageObject.textinput_Locator("fieldName:PAYMENT.ACCOUNT",testData.get("PAYMENT.ACCOUNT"));
        PageObject.textinput_Locator("fieldName:CUS.RATE",testData.get("CUS.RATE"));
        PageObject.textinput_Locator("fieldName:CUSTOMER.SPREAD",testData.get("CUSTOMER.SPREAD"));
        PageObject.textinput_Locator("fieldName:DR.CARRIER.NAME",testData.get("DR.CARRIER.NAME"));

        PageObject.form_Tab("FWD Cont Detail");

        PageObject.textinput_Locator("fieldName:INV.NO:1",testData.get("INV.NO"));
        PageObject.textinput_Locator("fieldName:INV.DATE:1",testData.get("INV.DATE"));
        PageObject.textinput_Locator("fieldName:SHIP.BLNO:1",testData.get("SHIP.BLNO"));
        PageObject.textinput_Locator("fieldName:SHIP.BLDT:1",testData.get("SHIP.BLDT"));
        PageObject.textinput_Locator("fieldName:FWD.CONT",testData.get("FWD.CONT"));
        PageObject.textinput_Locator("radio:tab2:FWD.CONT",testData.get("tab2"));
        PageObject.textinput_Locator("fieldName:FX.LINK.ID",testData.get("FX.LINK.ID"));
        PageObject.textinput_Locator("fieldName:LAST.VERSION",testData.get("LAST.VERSION"));
        PageObject.textinput_Locator("fieldName:TTA.RET.ACCT",testData.get("TTA.RET.ACCT"));
        PageObject.textinput_Locator("fieldName:TTA.RET.AMOUNT",testData.get("TTA.RET.AMOUNT"));

        PageObject.form_Tab("Payment Details");

        PageObject.textinput_Locator("fieldName:PRESENTOR.CUST",testData.get("PRESENTOR.CUST"));
        PageObject.textinput_Locator("fieldName:PRESENTOR:1",testData.get("PRESENTOR"));
        PageObject.textinput_Locator("fieldName:PRESENTOR.REF",testData.get("PRESENTOR.REF"));
        PageObject.textinput_Locator("fieldName:RECEIVERS.BANK:1",testData.get("RECEIVERS.BANK"));
        PageObject.textinput_Locator("fieldName:RECEIVERS.CORR:1",testData.get("RECEIVERS.CORR"));
        PageObject.textinput_Locator("fieldName:INTERMED.BANK:1",testData.get("INTERMED.BANK"));
        PageObject.textinput_Locator("fieldName:ACCOUNT.WITH:1",testData.get("ACCOUNT.WITH"));
        PageObject.textinput_Locator("fieldName:SENDER.CORR:1",testData.get("SENDER.CORR"));
        PageObject.textinput_Locator("fieldName:202.BK.TO.BK:1",testData.get("202.BK.TO.BK"));
        PageObject.textinput_Locator("fieldName:BANK.TO.BANK:1",testData.get("BANK.TO.BANK"));
        PageObject.textinput_Locator("fieldName:CONF.NARRATIVE:1",testData.get("CONF.NARRATIVE"));

        PageObject.form_Tab("Charges");

        PageObject.textinput_Locator("fieldName:WAIVE.CHARGES",testData.get("WAIVE.CHARGES"));
        PageObject.textinput_Locator("fieldName:CHARGE.CODE:1",testData.get("CHARGE.CODE"));
        PageObject.textinput_Locator("fieldName:CHARGE.ACCOUNT:1",testData.get("CHARGE.ACCOUNT"));
        PageObject.textinput_Locator("fieldName:CHARGE.CURRENCY:1",testData.get("CHARGE.CURRENCY"));
        PageObject.textinput_Locator("fieldName:CHARGE.XCHG:1",testData.get("CHARGE.XCHG"));
        PageObject.textinput_Locator("fieldName:CHARGE.AMOUNT:1",testData.get("CHARGE.AMOUNT"));
        PageObject.textinput_Locator("fieldName:TAX.DR.ACCT:1",testData.get("TAX.DR.ACCT"));

        PageObject.form_Tab("SBP Reports");

        PageObject.textinput_Locator("fieldName:HS.CODE:1",testData.get("HS.CODE"));
        PageObject.textinput_Locator("fieldName:HS.QUANTITY:1",testData.get("HS.QUANTITY"));
        PageObject.textinput_Locator("fieldName:UNIT.PRICE:1",testData.get("UNIT.PRICE"));
        PageObject.textinput_Locator("fieldName:M.FORM:1",testData.get("M.FORM"));
        PageObject.textinput_Locator("fieldName:BAF.DESC.GOODS:1",testData.get("BAF.DESC.GOODS"));
        PageObject.textinput_Locator("fieldName:BAF.HS.BPRICE:1",testData.get("BAF.HS.BPRICE"));
        PageObject.textinput_Locator("fieldName:FREIGHT.CHARGE",testData.get("FREIGHT.CHARGE"));
        PageObject.textinput_Locator("fieldName:BAF.DEAL.TIME",testData.get("BAF.DEAL.TIME"));
        PageObject.textinput_Locator("fieldName:AMOUNT",testData.get("AMOUNT"));

        PageObject.form_Tab("Other Information");

        PageObject.textinput_Locator("fieldName:NT.PARTY.NAME:1",testData.get("NT.PARTY.NAME"));
        PageObject.textinput_Locator("fieldName:NT.PARTY.CNTRY:1",testData.get("NT.PARTY.CNTRY"));
        PageObject.textinput_Locator("fieldName:THIRDPARTY.UBO:1",testData.get("THIRDPARTY.UBO"));
        PageObject.textinput_Locator("fieldName:REMITTER.NAME",testData.get("REMITTER.NAME"));
        PageObject.textinput_Locator("fieldName:REMIT.COUNTRY",testData.get("REMIT.COUNTRY"));

        PageObject.form_Tab("MT 202");

        PageObject.textinput_Locator("fieldName:PRESENTOR.REF",testData.get("PRESENTOR.REF"));
        PageObject.textinput_Locator("fieldName:NOSTRO.CR.DATE",testData.get("NOSTRO.CR.DATE"));
        PageObject.textinput_Locator("fieldName:SENDER.CORR:1",testData.get("SENDER.CORR"));
        PageObject.textinput_Locator("fieldName:RECEIVERS.CORR:1",testData.get("RECEIVERS.CORR"));
        PageObject.textinput_Locator("fieldName:INTERMED.BANK:1",testData.get("INTERMED.BANK"));
        PageObject.textinput_Locator("fieldName:ACCOUNT.WITH:1",testData.get("ACCOUNT.WITH"));
        PageObject.textinput_Locator("fieldName:BENEFICIARY.ACCT",testData.get("BENEFICIARY.ACCT"));
        PageObject.textinput_Locator("fieldName:RECEIVERS.BANK:1",testData.get("RECEIVERS.BANK"));
        PageObject.textinput_Locator("fieldName:202.BK.TO.BK:1",testData.get("202.BK.TO.BK"));

        PageObject.form_Tab("Delivery Info");

        PageObject.textinput_Locator("fieldName:MESSAGE.TYPE:1",testData.get("MESSAGE.TYPE"));
        PageObject.textinput_Locator("fieldName:MSG.CLASS.NO:1",testData.get("MSG.CLASS.NO"));
        PageObject.textinput_Locator("fieldName:MSG.SEND.DATE:1",testData.get("MSG.SEND.DATE"));
        PageObject.textinput_Locator("fieldName:OVR.CARRIER:1",testData.get("OVR.CARRIER"));
        PageObject.textinput_Locator("fieldName:ADDRESSEE:1:1",testData.get("ADDRESSEE"));
        PageObject.textinput_Locator("fieldName:SWIFT.BIC",testData.get("SWIFT.BIC"));
        PageObject.textinput_Locator("fieldName:BPM.REQ.ID",testData.get("BPM.REQ.ID"));
        PageObject.textinput_Locator("fieldName:SEND.ACCUITY",testData.get("SEND.ACCUITY"));
        PageObject.textinput_Locator("radio:tab8:SEND.ACCUITY",testData.get("tab8"));
        PageObject.textinput_Locator("fieldName:ACCUITY.RESP",testData.get("ACCUITY.RESP"));
        PageObject.textinput_Locator("fieldName:ACCUITY.REF",testData.get("ACCUITY.REF"));
        PageObject.textinput_Locator("fieldName:SEND.PSW",testData.get("SEND.PSW"));
        PageObject.textinput_Locator("radio:tab8:SEND.PSW",testData.get("tab8"));
        PageObject.textinput_Locator("fieldName:PSW.REFERENCE",testData.get("PSW.REFERENCE"));
        PageObject.textinput_Locator("fieldName:PSW.PAY.REF",testData.get("PSW.PAY.REF"));

        PageObject.form_Tab("Audit Information");

        PageObject.textinput_Locator("fieldName:GD.NUM:1",testData.get("GD.NUM"));
        PageObject.textinput_Locator("fieldName:GD.DATE:1",testData.get("GD.DATE"));
        PageObject.textinput_Locator("fieldName:INV.AMT:1",testData.get("INV.AMT"));
        PageObject.textinput_Locator("fieldName:UNIT.PRICE:1",testData.get("UNIT.PRICE"));
        PageObject.textinput_Locator("fieldName:DISC.AMT",testData.get("DISC.AMT"));
        PageObject.textinput_Locator("fieldName:DISC.PERC",testData.get("DISC.PERC"));
        PageObject.textinput_Locator("fieldName:AGENT.COMM",testData.get("AGENT.COMM"));
        PageObject.textinput_Locator("fieldName:REALIZE.AMT",testData.get("REALIZE.AMT"));
        PageObject.textinput_Locator("fieldName:EXP.PFT.RATE",testData.get("EXP.PFT.RATE"));
        PageObject.textinput_Locator("fieldName:NO.OF.DAYS",testData.get("NO.OF.DAYS"));
        PageObject.textinput_Locator("fieldName:BILL.DATE",testData.get("BILL.DATE"));
        PageObject.textinput_Locator("fieldName:SWIFT.BIC",testData.get("SWIFT.BIC"));
        PageObject.textinput_Locator("fieldName:BENEF.CUST:1",testData.get("BENEF.CUST"));

        PageObject.commitTxn();
        PageObject.commitDeal("PaymentOtherBankGD");

    }

    @Test(groups = {"IBGExportInputter"}, dataProvider = "OtherBankFIUpdate")
    public void OtherBankFIUpdate(Map<String, String> testData) throws IOException{

        PageObject.menu_Dropdown("Other Bank GD - Lodge And Pay",1);
        PageObject.menu_Link("Payment - Other Bank GD ");
        PageObject.switchToChildWindow();
        driver.manage().window().maximize();
        PageObject.textinput_Locator("transactionId","TF1810365853");
        PageObject.img_Button("Edit a contract");
        PageObject.switchToChildWindow();
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

        PageObject.commitTxn();
        PageObject.commitDeal("OtherBankFIUpdate");

    }

    private static final String FILE_PATH = "path/to/your/excel/file.xlsx"; // Update with your file path

    @DataProvider(name = "LodgmentOtherBankGD")
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

    @DataProvider(name = "AmendOtherGDLodgment")
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

    @DataProvider(name = "PaymentOtherBankGD")
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

    @DataProvider(name = "OtherBankFIUpdate")
    public Object[][] readExcelData4() throws IOException {
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
