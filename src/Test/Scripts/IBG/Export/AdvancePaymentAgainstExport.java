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

public class AdvancePaymentAgainstExport extends BaseClass {

    @Test(groups = {"IBGExportInputter"}, dataProvider = "ExportAdvancePayment")
    public void ExportAdvancePayment(Map<String, String> testData) throws IOException{

        PageObject.menu_Dropdown("Advance Payment Against Export",1);
        PageObject.menu_Link("Export Advance Payment ");
        PageObject.switchToChildWindow();
        driver.manage().window().maximize();
        PageObject.img_Button("New Deal");
        PageObject.switchToChildWindow();
        PageObject.textinput_Locator("fieldName:BAF.SWIFT.REF",testData.get("BAF.SWIFT.REF"));
        PageObject.textinput_Locator("fieldName:BAF.DEAL.TIME",testData.get("BAF.DEAL.TIME"));
        PageObject.textinput_Locator("fieldName:DEBIT.CURRENCY",testData.get("DEBIT.CURRENCY"));
        PageObject.textinput_Locator("fieldName:DEBIT.ACCT.NO",testData.get("DEBIT.ACCT.NO"));
        PageObject.textinput_Locator("fieldName:DEBIT.AMOUNT",testData.get("DEBIT.AMOUNT"));
        PageObject.textinput_Locator("fieldName:DEBIT.VALUE.DATE",testData.get("DEBIT.VALUE.DATE"));
        PageObject.textinput_Locator("fieldName:NOSTRO.CR.DATE",testData.get("NOSTRO.CR.DATE"));
        PageObject.textinput_Locator("fieldName:FOB.VALUE",testData.get("FOB.VALUE"));
        PageObject.textinput_Locator("fieldName:BANK.CHARGES",testData.get("BANK.CHARGES"));
        PageObject.textinput_Locator("fieldName:DEBIT.THEIR.REF",testData.get("DEBIT.THEIR.REF"));
        PageObject.textinput_Locator("fieldName:CREDIT.ACCT.NO",testData.get("CREDIT.ACCT.NO"));
        PageObject.textinput_Locator("fieldName:CREDIT.VALUE.DATE",testData.get("CREDIT.VALUE.DATE"));
        PageObject.textinput_Locator("fieldName:CREDIT.THEIR.REF",testData.get("CREDIT.THEIR.REF"));
        PageObject.textinput_Locator("fieldName:ACUDOLLAR",testData.get("ACUDOLLAR"));
        PageObject.textinput_Locator("radio:tab1:ACUDOLLAR",testData.get("tab1"));
        PageObject.textinput_Locator("fieldName:TREASURY.RATE",testData.get("TREASURY.RATE"));
        PageObject.textinput_Locator("fieldName:CUSTOMER.SPREAD",testData.get("CUSTOMER.SPREAD"));
        PageObject.textinput_Locator("fieldName:CUSTOMER.RATE",testData.get("CUSTOMER.RATE"));
        PageObject.textinput_Locator("fieldName:PROFIT.CENTRE.DEPT",testData.get("PROFIT.CENTRE.DEPT"));
        PageObject.textinput_Locator("fieldName:BK.TO.BK.INFO:1",testData.get("BK.TO.BK.INFO"));
        PageObject.textinput_Locator("fieldName:ORDERING.CUST:1",testData.get("ORDERING.CUST"));
        PageObject.textinput_Locator("fieldName:CLIENT.CNTRY",testData.get("CLIENT.CNTRY"));
        PageObject.textinput_Locator("fieldName:PAYMENT.DETAILS:1",testData.get("PAYMENT.DETAILS"));
        PageObject.textinput_Locator("fieldName:INCO.TERMS.LC",testData.get("INCO.TERMS.LC"));
        PageObject.textinput_Locator("",testData.get("undefined"));
        PageObject.textinput_Locator("fieldName:LC.EXP.ADV",testData.get("LC.EXP.ADV"));
        PageObject.textinput_Locator("fieldName:COMMISSION.CODE",testData.get("COMMISSION.CODE"));
        PageObject.textinput_Locator("radio:tab1:COMMISSION.CODE",testData.get("tab1"));
        PageObject.textinput_Locator("fieldName:COMMISSION.TYPE:1",testData.get("COMMISSION.TYPE"));
        PageObject.textinput_Locator("fieldName:COMMISSION.AMT:1",testData.get("COMMISSION.AMT"));
        PageObject.textinput_Locator("fieldName:PROCESSING.DATE",testData.get("PROCESSING.DATE"));
        PageObject.textinput_Locator("fieldName:HS.CODE:1",testData.get("HS.CODE"));
        PageObject.textinput_Locator("fieldName:HS.QUANTITY:1",testData.get("HS.QUANTITY"));
        PageObject.textinput_Locator("fieldName:UNIT.PRICE:1",testData.get("UNIT.PRICE"));
        PageObject.textinput_Locator("fieldName:HS.INV.AMT:1",testData.get("HS.INV.AMT"));
        PageObject.textinput_Locator("fieldName:PYMT.NARRATION:1",testData.get("PYMT.NARRATION"));
        PageObject.textinput_Locator("fieldName:BAF.HS.BPRICE:1",testData.get("BAF.HS.BPRICE"));
        PageObject.textinput_Locator("fieldName:SHIP.MARKS",testData.get("SHIP.MARKS"));
        PageObject.textinput_Locator("fieldName:PORT.ISO.CODE",testData.get("PORT.ISO.CODE"));
        PageObject.textinput_Locator("fieldName:PK.DAO",testData.get("PK.DAO"));
        PageObject.textinput_Locator("fieldName:A.REMARKS",testData.get("A.REMARKS"));
        PageObject.textinput_Locator("fieldName:FX.LINK.ID",testData.get("FX.LINK.ID"));
        PageObject.textinput_Locator("fieldName:BPM.REQ.ID",testData.get("BPM.REQ.ID"));
        PageObject.textinput_Locator("fieldName:SBP.DATE",testData.get("SBP.DATE"));
        PageObject.textinput_Locator("fieldName:ADJ.FCY.ACCT",testData.get("ADJ.FCY.ACCT"));
        PageObject.textinput_Locator("fieldName:DISC.SETTLE.REM",testData.get("DISC.SETTLE.REM"));
        PageObject.textinput_Locator("radio:tab1:DISC.SETTLE.REM",testData.get("tab1"));
        PageObject.textinput_Locator("fieldName:DISC.AMT",testData.get("DISC.AMT"));
        PageObject.textinput_Locator("fieldName:FIN.CURR.DIFF",testData.get("FIN.CURR.DIFF"));
        PageObject.textinput_Locator("radio:tab1:FIN.CURR.DIFF",testData.get("tab1"));
        PageObject.textinput_Locator("fieldName:REAL.CURRENCY",testData.get("REAL.CURRENCY"));
        PageObject.textinput_Locator("fieldName:SEND.ACCUITY",testData.get("SEND.ACCUITY"));
        PageObject.textinput_Locator("radio:tab1:SEND.ACCUITY",testData.get("tab1"));
        PageObject.textinput_Locator("fieldName:ACCUITY.REF",testData.get("ACCUITY.REF"));
        PageObject.textinput_Locator("fieldName:ACCUITY.RESP",testData.get("ACCUITY.RESP"));
        PageObject.textinput_Locator("fieldName:SEND.PSW",testData.get("SEND.PSW"));
        PageObject.textinput_Locator("radio:tab1:SEND.PSW",testData.get("tab1"));
        PageObject.textinput_Locator("fieldName:PSW.REFERENCE",testData.get("PSW.REFERENCE"));

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
        PageObject.textinput_Locator("fieldName:PURP.REMITT:1",testData.get("PURP.REMITT"));
        PageObject.textinput_Locator("fieldName:REMITTER.NAME",testData.get("REMITTER.NAME"));
        PageObject.textinput_Locator("fieldName:REMIT.COUNTRY",testData.get("REMIT.COUNTRY"));
        PageObject.textinput_Locator("fieldName:TTA.RET.AMOUNT",testData.get("TTA.RET.AMOUNT"));
        PageObject.textinput_Locator("fieldName:FREIGHT.CHARGE",testData.get("FREIGHT.CHARGE"));

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

        PageObject.commitTxn();
        PageObject.commitDeal("ExportAdvancePayment");


    }

    @Test(groups = {"IBGExportInputter"}, dataProvider = "RepatriateExportAdvancePayment")
    public void RepatriateExportAdvancePayment(Map<String, String> testData) throws IOException{

        PageObject.menu_Dropdown("Advance Payment Against Export",1);
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

        PageObject.commitTxn();
        PageObject.commitDeal("RepatriateExportAdvancePayment");

    }

    @Test(groups = {"IBGExportInputter"}, dataProvider = "DocRegisterAgainstExportAdvancePayment")
    public void DocRegisterAgainstExportAdvancePayment(Map<String, String> testData) throws IOException{

        PageObject.menu_Dropdown("Advance Payment Against Export",1);
        PageObject.menu_Link("Doc Register Against Export Advance Payment ");
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

        PageObject.commitTxn();
        PageObject.commitDeal("RepatriateExportAdvancePayment");

    }

    @Test(groups = {"IBGExportInputter"}, dataProvider = "AmendDocRegisterAgainstExpAdvPayment")
    public void AmendDocRegisterAgainstExpAdvPayment(Map<String, String> testData) throws IOException{

        PageObject.menu_Dropdown("Advance Payment Against Export",1);
        PageObject.menu_Link("Amend Doc Register Against Exp Adv Payment ");
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

    @Test(groups = {"IBGExportInputter"}, dataProvider = "DocRegisterExpAdvPayOtherBankGD")
    public void DocRegisterExpAdvPayOtherBankGD(Map<String, String> testData) throws IOException{

        PageObject.menu_Dropdown("Advance Payment Against Export",1);
        PageObject.menu_Link("Doc Register - Exp Adv Pay - Other Bank GD ");
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
        PageObject.textinput_Locator("fieldName:INV.NUMBER",testData.get("INV.NUMBER"));
        PageObject.textinput_Locator("fieldName:INV.DATE",testData.get("INV.DATE"));
        PageObject.textinput_Locator("fieldName:INV.AMT",testData.get("INV.AMT"));
        PageObject.textinput_Locator("fieldName:BAF.OTHGD:1",testData.get("BAF.OTHGD"));
        PageObject.textinput_Locator("fieldName:COMMISSION",testData.get("COMMISSION"));
        PageObject.textinput_Locator("fieldName:EDS.AMT",testData.get("EDS.AMT"));
        PageObject.textinput_Locator("fieldName:WH.TAX.AMT",testData.get("WH.TAX.AMT"));
        PageObject.textinput_Locator("fieldName:FOREIGN.CHGS",testData.get("FOREIGN.CHGS"));
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

        PageObject.commitTxn();
        PageObject.commitDeal("DocRegisterExpAdvPayOtherBankGD");



    }

    @Test(groups = {"IBGExportInputter"}, dataProvider = "AuthoriseDeleteAdvancePayment")
    public void AuthoriseDeleteAdvancePayment(Map<String, String> testData) throws IOException{

        PageObject.menu_Dropdown("Advance Payment Against Export",1);
        PageObject.menu_Link("Authorise / Delete Advance Payment ");
        PageObject.switchToChildWindow();
        driver.manage().window().maximize();
        PageObject.img_Button("New Deal");
        PageObject.switchToChildWindow();
        PageObject.textinput_Locator("fieldName:BAF.SWIFT.REF",testData.get("BAF.SWIFT.REF"));
        PageObject.textinput_Locator("fieldName:BAF.DEAL.TIME",testData.get("BAF.DEAL.TIME"));
        PageObject.textinput_Locator("fieldName:DEBIT.CURRENCY",testData.get("DEBIT.CURRENCY"));
        PageObject.textinput_Locator("fieldName:DEBIT.ACCT.NO",testData.get("DEBIT.ACCT.NO"));
        PageObject.textinput_Locator("fieldName:DEBIT.AMOUNT",testData.get("DEBIT.AMOUNT"));
        PageObject.textinput_Locator("fieldName:DEBIT.VALUE.DATE",testData.get("DEBIT.VALUE.DATE"));
        PageObject.textinput_Locator("fieldName:NOSTRO.CR.DATE",testData.get("NOSTRO.CR.DATE"));
        PageObject.textinput_Locator("fieldName:FOB.VALUE",testData.get("FOB.VALUE"));
        PageObject.textinput_Locator("fieldName:BANK.CHARGES",testData.get("BANK.CHARGES"));
        PageObject.textinput_Locator("fieldName:DEBIT.THEIR.REF",testData.get("DEBIT.THEIR.REF"));
        PageObject.textinput_Locator("fieldName:CREDIT.ACCT.NO",testData.get("CREDIT.ACCT.NO"));
        PageObject.textinput_Locator("fieldName:CREDIT.VALUE.DATE",testData.get("CREDIT.VALUE.DATE"));
        PageObject.textinput_Locator("fieldName:CREDIT.THEIR.REF",testData.get("CREDIT.THEIR.REF"));
        PageObject.textinput_Locator("fieldName:ACUDOLLAR",testData.get("ACUDOLLAR"));
        PageObject.textinput_Locator("radio:tab1:ACUDOLLAR",testData.get("tab1"));
        PageObject.textinput_Locator("fieldName:TREASURY.RATE",testData.get("TREASURY.RATE"));
        PageObject.textinput_Locator("fieldName:CUSTOMER.SPREAD",testData.get("CUSTOMER.SPREAD"));
        PageObject.textinput_Locator("fieldName:CUSTOMER.RATE",testData.get("CUSTOMER.RATE"));
        PageObject.textinput_Locator("fieldName:PROFIT.CENTRE.DEPT",testData.get("PROFIT.CENTRE.DEPT"));
        PageObject.textinput_Locator("fieldName:BK.TO.BK.INFO:1",testData.get("BK.TO.BK.INFO"));
        PageObject.textinput_Locator("fieldName:ORDERING.CUST:1",testData.get("ORDERING.CUST"));
        PageObject.textinput_Locator("fieldName:CLIENT.CNTRY",testData.get("CLIENT.CNTRY"));
        PageObject.textinput_Locator("fieldName:PAYMENT.DETAILS:1",testData.get("PAYMENT.DETAILS"));
        PageObject.textinput_Locator("fieldName:INCO.TERMS.LC",testData.get("INCO.TERMS.LC"));
        PageObject.textinput_Locator("",testData.get("undefined"));
        PageObject.textinput_Locator("fieldName:LC.EXP.ADV",testData.get("LC.EXP.ADV"));
        PageObject.textinput_Locator("fieldName:COMMISSION.CODE",testData.get("COMMISSION.CODE"));
        PageObject.textinput_Locator("radio:tab1:COMMISSION.CODE",testData.get("tab1"));
        PageObject.textinput_Locator("fieldName:COMMISSION.TYPE:1",testData.get("COMMISSION.TYPE"));
        PageObject.textinput_Locator("fieldName:COMMISSION.AMT:1",testData.get("COMMISSION.AMT"));
        PageObject.textinput_Locator("fieldName:PROCESSING.DATE",testData.get("PROCESSING.DATE"));
        PageObject.textinput_Locator("fieldName:HS.CODE:1",testData.get("HS.CODE"));
        PageObject.textinput_Locator("fieldName:HS.QUANTITY:1",testData.get("HS.QUANTITY"));
        PageObject.textinput_Locator("fieldName:UNIT.PRICE:1",testData.get("UNIT.PRICE"));
        PageObject.textinput_Locator("fieldName:HS.INV.AMT:1",testData.get("HS.INV.AMT"));
        PageObject.textinput_Locator("fieldName:PYMT.NARRATION:1",testData.get("PYMT.NARRATION"));
        PageObject.textinput_Locator("fieldName:BAF.HS.BPRICE:1",testData.get("BAF.HS.BPRICE"));
        PageObject.textinput_Locator("fieldName:SHIP.MARKS",testData.get("SHIP.MARKS"));
        PageObject.textinput_Locator("fieldName:PORT.ISO.CODE",testData.get("PORT.ISO.CODE"));
        PageObject.textinput_Locator("fieldName:PK.DAO",testData.get("PK.DAO"));
        PageObject.textinput_Locator("fieldName:A.REMARKS",testData.get("A.REMARKS"));
        PageObject.textinput_Locator("fieldName:FX.LINK.ID",testData.get("FX.LINK.ID"));
        PageObject.textinput_Locator("fieldName:BPM.REQ.ID",testData.get("BPM.REQ.ID"));
        PageObject.textinput_Locator("fieldName:SBP.DATE",testData.get("SBP.DATE"));
        PageObject.textinput_Locator("fieldName:ADJ.FCY.ACCT",testData.get("ADJ.FCY.ACCT"));
        PageObject.textinput_Locator("fieldName:DISC.SETTLE.REM",testData.get("DISC.SETTLE.REM"));
        PageObject.textinput_Locator("radio:tab1:DISC.SETTLE.REM",testData.get("tab1"));
        PageObject.textinput_Locator("fieldName:DISC.AMT",testData.get("DISC.AMT"));
        PageObject.textinput_Locator("fieldName:FIN.CURR.DIFF",testData.get("FIN.CURR.DIFF"));
        PageObject.textinput_Locator("radio:tab1:FIN.CURR.DIFF",testData.get("tab1"));
        PageObject.textinput_Locator("fieldName:REAL.CURRENCY",testData.get("REAL.CURRENCY"));
        PageObject.textinput_Locator("fieldName:SEND.ACCUITY",testData.get("SEND.ACCUITY"));
        PageObject.textinput_Locator("radio:tab1:SEND.ACCUITY",testData.get("tab1"));
        PageObject.textinput_Locator("fieldName:ACCUITY.REF",testData.get("ACCUITY.REF"));
        PageObject.textinput_Locator("fieldName:ACCUITY.RESP",testData.get("ACCUITY.RESP"));
        PageObject.textinput_Locator("fieldName:SEND.PSW",testData.get("SEND.PSW"));
        PageObject.textinput_Locator("radio:tab1:SEND.PSW",testData.get("tab1"));
        PageObject.textinput_Locator("fieldName:PSW.REFERENCE",testData.get("PSW.REFERENCE"));

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
        PageObject.textinput_Locator("fieldName:PURP.REMITT:1",testData.get("PURP.REMITT"));
        PageObject.textinput_Locator("fieldName:REMITTER.NAME",testData.get("REMITTER.NAME"));
        PageObject.textinput_Locator("fieldName:REMIT.COUNTRY",testData.get("REMIT.COUNTRY"));
        PageObject.textinput_Locator("fieldName:TTA.RET.AMOUNT",testData.get("TTA.RET.AMOUNT"));
        PageObject.textinput_Locator("fieldName:FREIGHT.CHARGE",testData.get("FREIGHT.CHARGE"));

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

        PageObject.commitTxn();
        PageObject.commitDeal("AuthoriseDeleteAdvancePayment");


    }

    @Test(groups = {"IBGExportInputter"}, dataProvider = "AuthoriseDeleteRepatriation")
    public void AuthoriseDeleteRepatriation(Map<String, String> testData) throws IOException{

        PageObject.menu_Dropdown("Advance Payment Against Export",1);
        PageObject.menu_Link("Authorise / Delete Advance Payment ");
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

        PageObject.textinput_Locator("fieldName:AMOUNT.DEBITED",testData.get("AMOUNT.DEBITED"));
        PageObject.textinput_Locator("fieldName:AMOUNT.CREDITED",testData.get("AMOUNT.CREDITED"));
        PageObject.textinput_Locator("fieldName:DELIVERY.OUTREF:1",testData.get("DELIVERY.OUTREF"));
        PageObject.textinput_Locator("fieldName:OVERRIDE:1",testData.get("OVERRIDE"));
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

        PageObject.commitTxn();
        PageObject.commitDeal("AuthoriseDeleteRepatriation");


    }

    @Test(groups = {"IBGExportInputter"}, dataProvider = "AuthoriseDeleteDocRegAdvPayment")
    public void AuthoriseDeleteDocRegAdvPayment(Map<String, String> testData) throws IOException{

        PageObject.menu_Dropdown("Advance Payment Against Export",1);
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

        PageObject.commitTxn();
        PageObject.commitDeal("AuthoriseDeleteDocRegAdvPayment");

    }

    @Test(groups = {"IBGExportInputter"}, dataProvider = "AuthoriseDeleteAmendDocRegAdvPayment")
    public void AuthoriseDeleteAmendDocRegAdvPayment(Map<String, String> testData) throws IOException{

        PageObject.menu_Dropdown("Advance Payment Against Export",1);
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

        PageObject.commitTxn();
        PageObject.commitDeal("AuthoriseDeleteAmendDocRegAdvPayment");

    }

    private static final String FILE_PATH = "path/to/your/excel/file.xlsx"; // Update with your file path

    @DataProvider(name = "ExportAdvancePayment")
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

    @DataProvider(name = "RepatriateExportAdvancePayment")
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

    @DataProvider(name = "DocRegisterAgainstExportAdvancePayment")
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

    @DataProvider(name = "AmendDocRegisterAgainstExpAdvPayment")
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

    @DataProvider(name = "DocRegisterExpAdvPayOtherBankGD")
    public Object[][] readExcelData5() throws IOException {
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

    @DataProvider(name = "AuthoriseDeleteAdvancePayment")
    public Object[][] readExcelData6() throws IOException {
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

    @DataProvider(name = "AuthoriseDeleteRepatriation")
    public Object[][] readExcelData7() throws IOException {
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

    @DataProvider(name = "AuthoriseDeleteDocRegAdvPayment")
    public Object[][] readExcelData8() throws IOException {
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

    @DataProvider(name = "AuthoriseDeleteAmendDocRegAdvPayment")
    public Object[][] readExcelData9() throws IOException {
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
