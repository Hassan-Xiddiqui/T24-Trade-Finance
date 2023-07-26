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

public class Drawings extends BaseClass {

    @Test(groups = {"IBGImportInputter"}, dataProvider = "RegisterCleanDocumentLCContract")
    public void RegisterCleanDocumentLCContract(Map<String, String> testData) throws IOException{

        PageObject.menu_Dropdown("Drawings",4);
        PageObject.menu_Link("Register Clean Document - LC / Contract ");
        PageObject.switchToChildWindow();
        driver.manage().window().maximize();
        PageObject.textinput_Locator("transactionId","TF1810365853");
        PageObject.img_Button("Edit a contract");
        PageObject.switchToChildWindow();
        PageObject.textinput_Locator("fieldName:COURIER.REF",testData.get("COURIER.REF"));
        PageObject.textinput_Locator("fieldName:SPCL.RATE",testData.get("SPCL.RATE"));
        PageObject.textinput_Locator("radio:tab1:SPCL.RATE",testData.get("tab1"));
        PageObject.textinput_Locator("fieldName:SHIPDOC:1",testData.get("SHIPDOC"));
        PageObject.textinput_Locator("fieldName:DR.SHIP.TIME:1",testData.get("DR.SHIP.TIME"));
        PageObject.textinput_Locator("fieldName:PRESENTOR.CUST",testData.get("PRESENTOR.CUST"));
        PageObject.textinput_Locator("fieldName:PRESENTOR:1",testData.get("PRESENTOR"));
        PageObject.textinput_Locator("fieldName:PRESENTOR.REF",testData.get("PRESENTOR.REF"));
        PageObject.textinput_Locator("fieldName:MMFA.DATE",testData.get("MMFA.DATE"));
        PageObject.textinput_Locator("fieldName:FULLY.UTILISED",testData.get("FULLY.UTILISED"));
        PageObject.textinput_Locator("fieldName:DRAWING.TYPE",testData.get("DRAWING.TYPE"));
        PageObject.textinput_Locator("fieldName:DRAW.CURRENCY",testData.get("DRAW.CURRENCY"));
        PageObject.textinput_Locator("fieldName:ACUDOLLAR",testData.get("ACUDOLLAR"));
        PageObject.textinput_Locator("fieldName:DOCUMENT.AMOUNT",testData.get("DOCUMENT.AMOUNT"));
        PageObject.textinput_Locator("fieldName:VALUE.DATE",testData.get("VALUE.DATE"));
        PageObject.textinput_Locator("fieldName:TRACE.DATE",testData.get("TRACE.DATE"));
        PageObject.textinput_Locator("fieldName:MATURITY.REVIEW",testData.get("MATURITY.REVIEW"));
        PageObject.textinput_Locator("fieldName:DISCREPANCY:1",testData.get("DISCREPANCY"));
        PageObject.textinput_Locator("fieldName:DOCUMENT.CODE:1",testData.get("DOCUMENT.CODE"));
        PageObject.textinput_Locator("fieldName:DOC.1ST.COPIES:1",testData.get("DOC.1ST.COPIES"));
        PageObject.textinput_Locator("fieldName:DOC.2ND.COPIES:1",testData.get("DOC.2ND.COPIES"));
        PageObject.textinput_Locator("fieldName:ADDITIONAL.DOCS:1",testData.get("ADDITIONAL.DOCS"));
        PageObject.textinput_Locator("",testData.get("undefined"));
        PageObject.textinput_Locator("fieldName:GD.NUM:1",testData.get("GD.NUM"));
        PageObject.textinput_Locator("fieldName:GD.DATE:1",testData.get("GD.DATE"));
        PageObject.textinput_Locator("",testData.get("undefined"));
        PageObject.textinput_Locator("fieldName:MD.ID",testData.get("MD.ID"));

        PageObject.form_Tab("Other Information");

        PageObject.textinput_Locator("fieldName:MD.NAME.OF.VESS:1",testData.get("MD.NAME.OF.VESS"));
        PageObject.textinput_Locator("fieldName:SHIPPER.NAME:1",testData.get("SHIPPER.NAME"));
        PageObject.textinput_Locator("fieldName:SHIPPER.COUNTRY:1",testData.get("SHIPPER.COUNTRY"));
        PageObject.textinput_Locator("fieldName:CONSIGNEE.NAME:1",testData.get("CONSIGNEE.NAME"));
        PageObject.textinput_Locator("fieldName:CONSIGNEE.CNTRY:1",testData.get("CONSIGNEE.CNTRY"));
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

        PageObject.form_Tab("Shipment Details");

        PageObject.textinput_Locator("fieldName:SHIPDOC:1",testData.get("SHIPDOC"));
        PageObject.textinput_Locator("fieldName:DR.SHIP.TIME:1",testData.get("DR.SHIP.TIME"));
        PageObject.textinput_Locator("fieldName:DR.CARRIER.NAME",testData.get("DR.CARRIER.NAME"));
        PageObject.textinput_Locator("fieldName:HS.CODE:1",testData.get("HS.CODE"));
        PageObject.textinput_Locator("fieldName:HS.QUANTITY:1",testData.get("HS.QUANTITY"));
        PageObject.textinput_Locator("fieldName:UNIT.PRICE:1",testData.get("UNIT.PRICE"));
        PageObject.textinput_Locator("fieldName:BAF.DESC.GOODS:1",testData.get("BAF.DESC.GOODS"));
        PageObject.textinput_Locator("fieldName:BAF.HS.BPRICE:1",testData.get("BAF.HS.BPRICE"));
        PageObject.textinput_Locator("fieldName:FREIGHT.CHARGE",testData.get("FREIGHT.CHARGE"));
        PageObject.textinput_Locator("fieldName:FOB.VALUE",testData.get("FOB.VALUE"));
        PageObject.textinput_Locator("fieldName:INV.NO:1",testData.get("INV.NO"));
        PageObject.textinput_Locator("fieldName:INV.DATE:1",testData.get("INV.DATE"));
        PageObject.textinput_Locator("fieldName:ITRS.FREIGHT",testData.get("ITRS.FREIGHT"));

        PageObject.form_Tab("Delivery Info");

        PageObject.textinput_Locator("fieldName:MESSAGE.TYPE:1",testData.get("MESSAGE.TYPE"));
        PageObject.textinput_Locator("fieldName:MSG.CLASS.NO:1",testData.get("MSG.CLASS.NO"));
        PageObject.textinput_Locator("fieldName:MSG.SEND.DATE:1",testData.get("MSG.SEND.DATE"));
        PageObject.textinput_Locator("fieldName:OVR.CARRIER:1",testData.get("OVR.CARRIER"));
        PageObject.textinput_Locator("fieldName:ADDRESSEE:1:1",testData.get("ADDRESSEE"));
        PageObject.textinput_Locator("fieldName:SWIFT.BIC",testData.get("SWIFT.BIC"));
        //PageObject.textinput_Locator("fieldName:DELIVERY.REF:1",testData.get("DELIVERY.REF"));
        PageObject.textinput_Locator("fieldName:BPM.REQ.ID",testData.get("BPM.REQ.ID"));
        PageObject.textinput_Locator("fieldName:SEND.ACCUITY",testData.get("SEND.ACCUITY"));
        PageObject.textinput_Locator("radio:tab4:SEND.ACCUITY",testData.get("tab4"));
        PageObject.textinput_Locator("fieldName:ACCUITY.RESP",testData.get("ACCUITY.RESP"));
        PageObject.textinput_Locator("fieldName:ACCUITY.REF",testData.get("ACCUITY.REF"));
        PageObject.textinput_Locator("fieldName:SEND.PSW",testData.get("SEND.PSW"));
        PageObject.textinput_Locator("radio:tab4:SEND.PSW",testData.get("tab4"));
        PageObject.textinput_Locator("fieldName:PSW.REFERENCE",testData.get("PSW.REFERENCE"));
        PageObject.textinput_Locator("fieldName:PSW.PAY.REF",testData.get("PSW.PAY.REF"));

        PageObject.form_Tab("Audit Information");

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


//        PageObject.commitTxn();
//        PageObject.commitDeal("RegisterCleanDocumentLCContract");

    }

    @Test(groups = {"IBGImportInputter"}, dataProvider = "RegisterDiscrepantDocumentLCContract")
    public void RegisterDiscrepantDocumentLCContract(Map<String, String> testData) throws IOException{

        PageObject.menu_Dropdown("Drawings",4);
        PageObject.menu_Link("Register Discrepant Document - LC / Contract ");
        PageObject.switchToChildWindow();
        driver.manage().window().maximize();
        PageObject.textinput_Locator("transactionIdTF1810365853","TF1810365853");
        PageObject.img_Button("Edit a contract");
        PageObject.switchToChildWindow();
        PageObject.textinput_Locator("fieldName:COURIER.REF",testData.get("COURIER.REF"));
        PageObject.textinput_Locator("fieldName:SPCL.RATE",testData.get("SPCL.RATE"));
        PageObject.textinput_Locator("radio:tab1:SPCL.RATE",testData.get("tab1"));
        PageObject.textinput_Locator("fieldName:SHIPDOC:1",testData.get("SHIPDOC"));
        PageObject.textinput_Locator("fieldName:DR.SHIP.TIME:1",testData.get("DR.SHIP.TIME"));
        PageObject.textinput_Locator("fieldName:PRESENTOR.CUST",testData.get("PRESENTOR.CUST"));
        PageObject.textinput_Locator("fieldName:PRESENTOR:1",testData.get("PRESENTOR"));
        PageObject.textinput_Locator("fieldName:PRESENTOR.REF",testData.get("PRESENTOR.REF"));
        PageObject.textinput_Locator("fieldName:MMFA.DATE",testData.get("MMFA.DATE"));
        PageObject.textinput_Locator("fieldName:FULLY.UTILISED",testData.get("FULLY.UTILISED"));
        PageObject.textinput_Locator("fieldName:DRAW.CURRENCY",testData.get("DRAW.CURRENCY"));
        PageObject.textinput_Locator("fieldName:ACUDOLLAR",testData.get("ACUDOLLAR"));
        PageObject.textinput_Locator("fieldName:DOCUMENT.AMOUNT",testData.get("DOCUMENT.AMOUNT"));
        PageObject.textinput_Locator("fieldName:VALUE.DATE",testData.get("VALUE.DATE"));
        PageObject.textinput_Locator("fieldName:TRACE.DATE",testData.get("TRACE.DATE"));
        PageObject.textinput_Locator("fieldName:MATURITY.REVIEW",testData.get("MATURITY.REVIEW"));
        PageObject.textinput_Locator("fieldName:DISCREPANCY:1",testData.get("DISCREPANCY"));
        PageObject.textinput_Locator("fieldName:DOCUMENT.CODE:1",testData.get("DOCUMENT.CODE"));
        PageObject.textinput_Locator("fieldName:DOC.1ST.COPIES:1",testData.get("DOC.1ST.COPIES"));
        PageObject.textinput_Locator("fieldName:DOC.2ND.COPIES:1",testData.get("DOC.2ND.COPIES"));
        PageObject.textinput_Locator("fieldName:ADDITIONAL.DOCS:1",testData.get("ADDITIONAL.DOCS"));
        PageObject.textinput_Locator("",testData.get("undefined"));
        PageObject.textinput_Locator("fieldName:GD.NUM:1",testData.get("GD.NUM"));
        PageObject.textinput_Locator("fieldName:GD.DATE:1",testData.get("GD.DATE"));
        PageObject.textinput_Locator("",testData.get("undefined"));
        PageObject.textinput_Locator("fieldName:MD.ID",testData.get("MD.ID"));

        PageObject.form_Tab("Other Information");

        PageObject.textinput_Locator("fieldName:MD.ID",testData.get("MD.ID"));
        PageObject.textinput_Locator("fieldName:OVERRIDE:1",testData.get("OVERRIDE"));
        PageObject.textinput_Locator("fieldName:MD.NAME.OF.VESS:1",testData.get("MD.NAME.OF.VESS"));
        PageObject.textinput_Locator("fieldName:SHIPPER.NAME:1",testData.get("SHIPPER.NAME"));
        PageObject.textinput_Locator("fieldName:SHIPPER.COUNTRY:1",testData.get("SHIPPER.COUNTRY"));
        PageObject.textinput_Locator("fieldName:CONSIGNEE.NAME:1",testData.get("CONSIGNEE.NAME"));
        PageObject.textinput_Locator("fieldName:CONSIGNEE.CNTRY:1",testData.get("CONSIGNEE.CNTRY"));
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

        PageObject.form_Tab("Shipment Details");

        PageObject.textinput_Locator("fieldName:SHIPDOC:1",testData.get("SHIPDOC"));
        PageObject.textinput_Locator("fieldName:DR.SHIP.TIME:1",testData.get("DR.SHIP.TIME"));
        PageObject.textinput_Locator("fieldName:DR.CARRIER.NAME",testData.get("DR.CARRIER.NAME"));
        PageObject.textinput_Locator("fieldName:HS.CODE:1",testData.get("HS.CODE"));
        PageObject.textinput_Locator("fieldName:HS.QUANTITY:1",testData.get("HS.QUANTITY"));
        PageObject.textinput_Locator("fieldName:UNIT.PRICE:1",testData.get("UNIT.PRICE"));
        PageObject.textinput_Locator("fieldName:BAF.DESC.GOODS:1",testData.get("BAF.DESC.GOODS"));
        PageObject.textinput_Locator("fieldName:BAF.HS.BPRICE:1",testData.get("BAF.HS.BPRICE"));
        PageObject.textinput_Locator("fieldName:FREIGHT.CHARGE",testData.get("FREIGHT.CHARGE"));
        PageObject.textinput_Locator("fieldName:FOB.VALUE",testData.get("FOB.VALUE"));
        PageObject.textinput_Locator("fieldName:INV.NO:1",testData.get("INV.NO"));
        PageObject.textinput_Locator("fieldName:INV.DATE:1",testData.get("INV.DATE"));
        PageObject.textinput_Locator("fieldName:ITRS.FREIGHT",testData.get("ITRS.FREIGHT"));

        PageObject.form_Tab("Delivery Info");

        PageObject.textinput_Locator("fieldName:MESSAGE.TYPE:1",testData.get("MESSAGE.TYPE"));
        PageObject.textinput_Locator("fieldName:MSG.CLASS.NO:1",testData.get("MSG.CLASS.NO"));
        PageObject.textinput_Locator("fieldName:MSG.SEND.DATE:1",testData.get("MSG.SEND.DATE"));
        PageObject.textinput_Locator("fieldName:OVR.CARRIER:1",testData.get("OVR.CARRIER"));
        PageObject.textinput_Locator("fieldName:ADDRESSEE:1:1",testData.get("ADDRESSEE"));
        PageObject.textinput_Locator("fieldName:USANCE.ACT.SENT:1",testData.get("USANCE.ACT.SENT"));
        PageObject.textinput_Locator("fieldName:SWIFT.BIC",testData.get("SWIFT.BIC"));
        PageObject.textinput_Locator("fieldName:DELIVERY.REF:1",testData.get("DELIVERY.REF"));
        PageObject.textinput_Locator("fieldName:BPM.REQ.ID",testData.get("BPM.REQ.ID"));
        PageObject.textinput_Locator("fieldName:SEND.ACCUITY",testData.get("SEND.ACCUITY"));
        PageObject.textinput_Locator("radio:tab4:SEND.ACCUITY",testData.get("tab4"));
        PageObject.textinput_Locator("fieldName:ACCUITY.RESP",testData.get("ACCUITY.RESP"));
        PageObject.textinput_Locator("fieldName:ACCUITY.REF",testData.get("ACCUITY.REF"));
        PageObject.textinput_Locator("fieldName:SEND.PSW",testData.get("SEND.PSW"));
        PageObject.textinput_Locator("radio:tab4:SEND.PSW",testData.get("tab4"));
        PageObject.textinput_Locator("fieldName:PSW.REFERENCE",testData.get("PSW.REFERENCE"));
        PageObject.textinput_Locator("fieldName:PSW.PAY.REF",testData.get("PSW.PAY.REF"));

        PageObject.form_Tab("Audit Information");

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

//        PageObject.commitTxn();
//        PageObject.commitDeal("");



    }

    @Test(groups = {"IBGImportInputter"}, dataProvider = "OnlineMaturityOfAcceptance")
    public void OnlineMaturityOfAcceptance(Map<String, String> testData) throws IOException{

        PageObject.menu_Dropdown("Drawings",4);
        PageObject.menu_Link("Online Maturity Of Acceptance ");
        PageObject.switchToChildWindow();
        driver.manage().window().maximize();
        PageObject.textinput_Locator("transactionId","TF1810365853");
        PageObject.img_Button("Edit a contract");
        PageObject.switchToChildWindow();
        PageObject.textinput_Locator("fieldName:SHIPDOC:1",testData.get("SHIPDOC"));
        PageObject.click_Locator("fieldName:DRAWING.TYPE");
        PageObject.textinput_Locator("fieldName:DRAWING.TYPE","s");
        PageObject.click_Locator("fieldName:DRAW.CURRENCY");
        PageObject.textinput_Locator("fieldName:DRAW.CURRENCY",testData.get("DRAW.CURRENCY"));
        PageObject.textinput_Locator("fieldName:DOCUMENT.AMOUNT",testData.get("DOCUMENT.AMOUNT"));
        PageObject.textinput_Locator("fieldName:MATURITY.REVIEW",testData.get("MATURITY.REVIEW"));
        PageObject.textinput_Locator("fieldName:RATE.BOOKED",testData.get("RATE.BOOKED"));
        PageObject.textinput_Locator("",testData.get("undefined"));
        PageObject.textinput_Locator("fieldName:DRAWDOWN.ACCOUNT",testData.get("DRAWDOWN.ACCOUNT"));
        PageObject.textinput_Locator("fieldName:PAYMENT.METHOD",testData.get("PAYMENT.METHOD"));
        PageObject.textinput_Locator("fieldName:PAYMENT.ACCOUNT",testData.get("PAYMENT.ACCOUNT"));
        PageObject.textinput_Locator("fieldName:TREASURY.RATE",testData.get("TREASURY.RATE"));
        PageObject.textinput_Locator("",testData.get("undefined"));
        PageObject.textinput_Locator("fieldName:GTEE.REFERENCE",testData.get("GTEE.REFERENCE"));

        PageObject.form_Tab("Charges and Margin");

        PageObject.textinput_Locator("fieldName:WAIVE.CHARGES",testData.get("WAIVE.CHARGES"));
        PageObject.textinput_Locator("fieldName:DR.RATE",testData.get("DR.RATE"));
        PageObject.textinput_Locator("fieldName:CHARGE.CODE:1",testData.get("CHARGE.CODE"));
        PageObject.textinput_Locator("fieldName:CHARGE.ACCOUNT:1",testData.get("CHARGE.ACCOUNT"));
        PageObject.textinput_Locator("fieldName:CHARGE.CURRENCY:1",testData.get("CHARGE.CURRENCY"));
        PageObject.textinput_Locator("fieldName:CHARGE.XCHG:1",testData.get("CHARGE.XCHG"));
        PageObject.textinput_Locator("fieldName:CHARGE.AMOUNT:1",testData.get("CHARGE.AMOUNT"));
        PageObject.textinput_Locator("fieldName:PARTY.CHARGED:1",testData.get("PARTY.CHARGED"));
        PageObject.textinput_Locator("fieldName:AMORT.CHARGES:1",testData.get("AMORT.CHARGES"));
        PageObject.textinput_Locator("fieldName:CHARGE.STATUS:1",testData.get("CHARGE.STATUS"));
        PageObject.textinput_Locator("fieldName:TAX.DR.ACCT:1",testData.get("TAX.DR.ACCT"));
        PageObject.textinput_Locator("fieldName:PROV.AMT.REL",testData.get("PROV.AMT.REL"));
        PageObject.textinput_Locator("fieldName:PROV.COVER.ACCT",testData.get("PROV.COVER.ACCT"));
        PageObject.textinput_Locator("fieldName:PROV.EXCH.RATE",testData.get("PROV.EXCH.RATE"));

        PageObject.form_Tab("Shipment Details");

        PageObject.textinput_Locator("fieldName:SHIPDOC:1",testData.get("SHIPDOC"));
        PageObject.textinput_Locator("fieldName:DR.SHIP.TIME:1",testData.get("DR.SHIP.TIME"));
        PageObject.textinput_Locator("fieldName:DR.CARRIER.NAME",testData.get("DR.CARRIER.NAME"));
        PageObject.textinput_Locator("fieldName:HS.CODE:1",testData.get("HS.CODE"));
        PageObject.textinput_Locator("fieldName:HS.QUANTITY:1",testData.get("HS.QUANTITY"));
        PageObject.textinput_Locator("fieldName:UNIT.PRICE:1",testData.get("UNIT.PRICE"));
        PageObject.textinput_Locator("fieldName:BAF.DESC.GOODS:1",testData.get("BAF.DESC.GOODS"));
        PageObject.textinput_Locator("fieldName:BAF.HS.BPRICE:1",testData.get("BAF.HS.BPRICE"));
        PageObject.textinput_Locator("fieldName:FREIGHT.CHARGE",testData.get("FREIGHT.CHARGE"));
        PageObject.textinput_Locator("fieldName:FOB.VALUE",testData.get("FOB.VALUE"));
        PageObject.textinput_Locator("fieldName:INV.NO:1",testData.get("INV.NO"));
        PageObject.textinput_Locator("fieldName:INV.DATE:1",testData.get("INV.DATE"));
        PageObject.textinput_Locator("fieldName:ITRS.FREIGHT",testData.get("ITRS.FREIGHT"));

        PageObject.form_Tab("FWD Cont / SBP Reports");

        PageObject.textinput_Locator("fieldName:LC.REF",testData.get("LC.REF"));
        PageObject.textinput_Locator("fieldName:M.FORM:1",testData.get("M.FORM"));
        PageObject.textinput_Locator("fieldName:FWD.CONT",testData.get("FWD.CONT"));
        PageObject.textinput_Locator("radio:tab4:FWD.CONT",testData.get("tab4"));
        PageObject.textinput_Locator("fieldName:FX.LINK.ID",testData.get("FX.LINK.ID"));
        PageObject.textinput_Locator("fieldName:BAF.DEAL.TIME",testData.get("BAF.DEAL.TIME"));
        PageObject.textinput_Locator("fieldName:GD.NUM:1",testData.get("GD.NUM"));
        PageObject.textinput_Locator("fieldName:GD.DATE:1",testData.get("GD.DATE"));

        PageObject.form_Tab("Bank and Doc Details");

        PageObject.textinput_Locator("fieldName:PRESENTOR.CUST",testData.get("PRESENTOR.CUST"));
        PageObject.textinput_Locator("fieldName:PRESENTOR:1",testData.get("PRESENTOR"));
        PageObject.textinput_Locator("fieldName:PRESENTOR.REF",testData.get("PRESENTOR.REF"));
        PageObject.textinput_Locator("fieldName:RECEIVERS.BANK:1",testData.get("RECEIVERS.BANK"));
        PageObject.textinput_Locator("fieldName:RECEIVERS.CORR:1",testData.get("RECEIVERS.CORR"));
        PageObject.textinput_Locator("fieldName:INTERMED.BANK:1",testData.get("INTERMED.BANK"));
        PageObject.textinput_Locator("fieldName:ACCOUNT.WITH:1",testData.get("ACCOUNT.WITH"));
        PageObject.textinput_Locator("fieldName:SENDER.CORR:1",testData.get("SENDER.CORR"));
        PageObject.textinput_Locator("fieldName:BANK.TO.BANK:1",testData.get("BANK.TO.BANK"));
        PageObject.textinput_Locator("fieldName:202.BK.TO.BK:1",testData.get("202.BK.TO.BK"));
        PageObject.textinput_Locator("fieldName:756.BK.TO.BK:1",testData.get("756.BK.TO.BK"));
        PageObject.textinput_Locator("fieldName:DOCUMENT.CODE:1",testData.get("DOCUMENT.CODE"));
        PageObject.textinput_Locator("fieldName:DOC.1ST.COPIES:1",testData.get("DOC.1ST.COPIES"));
        PageObject.textinput_Locator("fieldName:DOC.2ND.COPIES:1",testData.get("DOC.2ND.COPIES"));
        PageObject.textinput_Locator("fieldName:ADDITIONAL.DOCS:1",testData.get("ADDITIONAL.DOCS"));
        PageObject.textinput_Locator("fieldName:CLAUSES.TEXT:1",testData.get("CLAUSES.TEXT"));
        PageObject.textinput_Locator("fieldName:INV.NO:1",testData.get("INV.NO"));
        PageObject.textinput_Locator("fieldName:INV.DATE:1",testData.get("INV.DATE"));
        PageObject.textinput_Locator("fieldName:CONF.NARRATIVE:1",testData.get("CONF.NARRATIVE"));

        PageObject.form_Tab("Assignment");

        PageObject.textinput_Locator("fieldName:APP.DRAW.AMT",testData.get("APP.DRAW.AMT"));
        PageObject.textinput_Locator("fieldName:BEN.DRAW.AMT",testData.get("BEN.DRAW.AMT"));
        PageObject.textinput_Locator("fieldName:ASSIGNMENT.REF:1",testData.get("ASSIGNMENT.REF"));
        PageObject.textinput_Locator("fieldName:ASSN.CUST.NO:1",testData.get("ASSN.CUST.NO"));
        PageObject.textinput_Locator("fieldName:ASSN.ADD:1:1",testData.get("ASSN.ADD"));
        PageObject.textinput_Locator("fieldName:RECV.BANK:1:1",testData.get("RECV.BANK"));
        PageObject.textinput_Locator("fieldName:RECV.CORR:1:1",testData.get("RECV.CORR"));
        PageObject.textinput_Locator("fieldName:INTMD.BANK:1:1",testData.get("INTMD.BANK"));
        PageObject.textinput_Locator("fieldName:ACCT.WITH:1:1",testData.get("ACCT.WITH"));
        PageObject.textinput_Locator("fieldName:BNK.TO.BNK:1:1",testData.get("BNK.TO.BNK"));
        PageObject.textinput_Locator("fieldName:202.BKBK:1:1",testData.get("202.BKBK"));
        PageObject.textinput_Locator("fieldName:ASSN.CR.ACCT:1",testData.get("ASSN.CR.ACCT"));
        PageObject.textinput_Locator("fieldName:ASSN.XRATE:1",testData.get("ASSN.XRATE"));
        PageObject.textinput_Locator("fieldName:ASSN.AMOUNT:1",testData.get("ASSN.AMOUNT"));

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
        PageObject.textinput_Locator("fieldName:SEND.MESSAGE:1",testData.get("SEND.MESSAGE"));
        //PageObject.textinput_Locator("fieldName:USANCE.ACT.SENT:1",testData.get("USANCE.ACT.SENT"));
        PageObject.textinput_Locator("fieldName:SWIFT.BIC",testData.get("SWIFT.BIC"));
        //PageObject.textinput_Locator("fieldName:DELIVERY.REF:1",testData.get("DELIVERY.REF"));
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
        PageObject.commitDeal("OnlineMaturityOfAcceptance");







    }

    private static final String FILE_PATH = "path/to/your/excel/file.xlsx"; // Update with your file path
    @DataProvider(name = "RegisterCleanDocumentLCContract")
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

    @DataProvider(name = "RegisterDiscrepantDocumentLCContract")
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

    @DataProvider(name = "OnlineMaturityOfAcceptance")
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
