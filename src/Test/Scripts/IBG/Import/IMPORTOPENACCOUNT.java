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

public class IMPORTOPENACCOUNT extends BaseClass {

    @Test(groups = {"IBGImportInputter"}, dataProvider = "ImportOpenAccountWithMargin")
    public void ImportOpenAccountWithMargin(Map<String, String> testData) throws IOException{

        PageObject.menu_Dropdown("Import Open Account",1);
        PageObject.menu_Link("Import Open Account - With Margin ");
        PageObject.switchToChildWindow();
        driver.manage().window().maximize();
        PageObject.img_Button("New Deal");
        PageObject.switchToChildWindow();
        PageObject.textinput_Locator("fieldName:MT.CURRENCY",testData.get("MT.CURRENCY"));
        PageObject.textinput_Locator("fieldName:INV.AMT",testData.get("INV.AMT"));
        PageObject.textinput_Locator("fieldName:DEBIT.ACCT.NO",testData.get("DEBIT.ACCT.NO"));
        PageObject.textinput_Locator("fieldName:DEBIT.CURRENCY",testData.get("DEBIT.CURRENCY"));
        PageObject.textinput_Locator("fieldName:OPEN.AC.PERCENT",testData.get("OPEN.AC.PERCENT"));
        PageObject.textinput_Locator("fieldName:DEBIT.AMOUNT",testData.get("DEBIT.AMOUNT"));
        PageObject.textinput_Locator("fieldName:DEBIT.VALUE.DATE",testData.get("DEBIT.VALUE.DATE"));
        PageObject.textinput_Locator("fieldName:CREDIT.ACCT.NO",testData.get("CREDIT.ACCT.NO"));
        PageObject.textinput_Locator("fieldName:CREDIT.CURRENCY",testData.get("CREDIT.CURRENCY"));
        PageObject.textinput_Locator("fieldName:ORDERING.CUST:1",testData.get("ORDERING.CUST"));
        PageObject.textinput_Locator("fieldName:CLIENT.CNTRY",testData.get("CLIENT.CNTRY"));
        PageObject.textinput_Locator("fieldName:EXP.NAME",testData.get("EXP.NAME"));
        PageObject.textinput_Locator("fieldName:EXP.ADDRESS:1",testData.get("EXP.ADDRESS"));
        PageObject.textinput_Locator("fieldName:EXP.CNTRY",testData.get("EXP.CNTRY"));
        PageObject.textinput_Locator("fieldName:INCO.TERMS.LC",testData.get("INCO.TERMS.LC"));
        PageObject.textinput_Locator("fieldName:HS.CODE:1",testData.get("HS.CODE"));
        PageObject.textinput_Locator("fieldName:HS.QUANTITY:1",testData.get("HS.QUANTITY"));
        PageObject.textinput_Locator("fieldName:UNIT.PRICE:1",testData.get("UNIT.PRICE"));
        PageObject.textinput_Locator("fieldName:HS.SAMPLE.VALUE:1",testData.get("HS.SAMPLE.VALUE"));
        PageObject.textinput_Locator("fieldName:PYMT.NARRATION:1",testData.get("PYMT.NARRATION"));
        PageObject.textinput_Locator("fieldName:BAF.HS.BPRICE:1",testData.get("BAF.HS.BPRICE"));
        PageObject.textinput_Locator("fieldName:LC.COUNTRY:1",testData.get("LC.COUNTRY"));
        PageObject.textinput_Locator("fieldName:INV.NO:1",testData.get("INV.NO"));
        PageObject.textinput_Locator("fieldName:INV.DATE:1",testData.get("INV.DATE"));
        PageObject.textinput_Locator("fieldName:INTEND.DATE",testData.get("INTEND.DATE"));
        PageObject.textinput_Locator("fieldName:SHIP.DATE:1",testData.get("SHIP.DATE"));
        PageObject.textinput_Locator("fieldName:SBP.DATE",testData.get("SBP.DATE"));
        PageObject.textinput_Locator("fieldName:A.REMARKS",testData.get("A.REMARKS"));
        PageObject.textinput_Locator("fieldName:PORT.ISO.CODE",testData.get("PORT.ISO.CODE"));
        PageObject.textinput_Locator("fieldName:PURPOSE:1",testData.get("PURPOSE"));
        PageObject.textinput_Locator("fieldName:PK.DAO",testData.get("PK.DAO"));
        PageObject.textinput_Locator("fieldName:SEND.PSW",testData.get("SEND.PSW"));
        PageObject.textinput_Locator("radio:mainTab:SEND.PSW",testData.get("mainTab"));
        PageObject.textinput_Locator("fieldName:PSW.REFERENCE",testData.get("PSW.REFERENCE"));
        PageObject.textinput_Locator("fieldName:SEND.ACCUITY",testData.get("SEND.ACCUITY"));
        PageObject.textinput_Locator("radio:mainTab:SEND.ACCUITY",testData.get("mainTab"));
        PageObject.textinput_Locator("fieldName:ACCUITY.REF",testData.get("ACCUITY.REF"));
        PageObject.textinput_Locator("fieldName:ACCUITY.RESP",testData.get("ACCUITY.RESP"));
        PageObject.textinput_Locator("fieldName:ITRS.FREIGHT",testData.get("ITRS.FREIGHT"));

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
        PageObject.commitDeal("ImportOpenAccountWithMargin");

    }

    @Test(groups = {"IBGImportInputter"}, dataProvider = "ImportOpenAccountPaymentWithMargin")
    public void ImportOpenAccountPaymentWithMargin(Map<String, String> testData) throws IOException{

        PageObject.menu_Dropdown("Import Open Account",1);
        PageObject.menu_Link("Import Open Account Payment - With Margin ");
        PageObject.switchToChildWindow();
        driver.manage().window().maximize();
        PageObject.img_Button("New Deal");
        PageObject.switchToChildWindow();
        PageObject.textinput_Locator("fieldName:FT.ID",testData.get("FT.ID"));
        PageObject.textinput_Locator("fieldName:PURPOSE:1",testData.get("PURPOSE"));
        PageObject.textinput_Locator("fieldName:CREDIT.AMOUNT",testData.get("CREDIT.AMOUNT"));
        PageObject.textinput_Locator("fieldName:CREDIT.CURRENCY",testData.get("CREDIT.CURRENCY"));
        PageObject.textinput_Locator("fieldName:CREDIT.VALUE.DATE",testData.get("CREDIT.VALUE.DATE"));
        PageObject.textinput_Locator("fieldName:CREDIT.ACCT.NO",testData.get("CREDIT.ACCT.NO"));
        PageObject.textinput_Locator("fieldName:DEBIT.ACCT.NO",testData.get("DEBIT.ACCT.NO"));
        PageObject.textinput_Locator("fieldName:DEBIT.VALUE.DATE",testData.get("DEBIT.VALUE.DATE"));
        PageObject.textinput_Locator("fieldName:DEBIT.THEIR.REF",testData.get("DEBIT.THEIR.REF"));
        PageObject.textinput_Locator("fieldName:ACUDOLLAR",testData.get("ACUDOLLAR"));
        PageObject.textinput_Locator("radio:tab1:ACUDOLLAR",testData.get("tab1"));
        PageObject.textinput_Locator("fieldName:CREDIT.THEIR.REF",testData.get("CREDIT.THEIR.REF"));
        PageObject.textinput_Locator("fieldName:TREASURY.RATE",testData.get("TREASURY.RATE"));
        PageObject.textinput_Locator("",testData.get("undefined"));
        PageObject.textinput_Locator("fieldName:CUSTOMER.RATE",testData.get("CUSTOMER.RATE"));
        PageObject.textinput_Locator("fieldName:INCO.TERMS.LC",testData.get("INCO.TERMS.LC"));
        PageObject.textinput_Locator("fieldName:BEN.CUSTOMER:1",testData.get("BEN.CUSTOMER"));
        PageObject.textinput_Locator("fieldName:ORDERING.CUST:1",testData.get("ORDERING.CUST"));
        PageObject.textinput_Locator("fieldName:ORDERING.BANK:1",testData.get("ORDERING.BANK"));
        PageObject.textinput_Locator("fieldName:BEN.OUR.CHARGES",testData.get("BEN.OUR.CHARGES"));
        PageObject.textinput_Locator("radio:tab1:BEN.OUR.CHARGES",testData.get("tab1"));
        PageObject.textinput_Locator("fieldName:CHARGES.ACCT.NO",testData.get("CHARGES.ACCT.NO"));
        PageObject.textinput_Locator("fieldName:COMMISSION.CODE",testData.get("COMMISSION.CODE"));
        PageObject.textinput_Locator("radio:tab1:COMMISSION.CODE",testData.get("tab1"));
        PageObject.textinput_Locator("fieldName:COMMISSION.TYPE:1",testData.get("COMMISSION.TYPE"));
        PageObject.textinput_Locator("fieldName:COMMISSION.AMT:1",testData.get("COMMISSION.AMT"));
        PageObject.textinput_Locator("",testData.get("undefined"));
        PageObject.textinput_Locator("fieldName:TIME.IND:1:1",testData.get("TIME.IND"));
        PageObject.textinput_Locator("fieldName:SBP.RET.CODE",testData.get("SBP.RET.CODE"));
        PageObject.textinput_Locator("fieldName:PK.DAO",testData.get("PK.DAO"));
        PageObject.textinput_Locator("fieldName:HS.CODE:1",testData.get("HS.CODE"));
        PageObject.textinput_Locator("fieldName:HS.QUANTITY:1",testData.get("HS.QUANTITY"));
        PageObject.textinput_Locator("fieldName:UNIT.PRICE:1",testData.get("UNIT.PRICE"));
        PageObject.textinput_Locator("fieldName:PYMT.NARRATION:1",testData.get("PYMT.NARRATION"));
        PageObject.textinput_Locator("fieldName:BAF.HS.BPRICE:1",testData.get("BAF.HS.BPRICE"));
        PageObject.textinput_Locator("fieldName:LC.COUNTRY:1",testData.get("LC.COUNTRY"));
        PageObject.textinput_Locator("fieldName:GD.NUM:1",testData.get("GD.NUM"));
        PageObject.textinput_Locator("fieldName:GD.DATE:1",testData.get("GD.DATE"));
        PageObject.textinput_Locator("fieldName:SHIPDOC:1",testData.get("SHIPDOC"));
        PageObject.textinput_Locator("fieldName:SHIP.DATE:1",testData.get("SHIP.DATE"));
        PageObject.textinput_Locator("fieldName:INV.NO:1",testData.get("INV.NO"));
        PageObject.textinput_Locator("fieldName:INV.DATE:1",testData.get("INV.DATE"));
        PageObject.textinput_Locator("fieldName:DISCHARGE.PORT:1",testData.get("DISCHARGE.PORT"));
        PageObject.textinput_Locator("fieldName:PORT.ISO.CODE",testData.get("PORT.ISO.CODE"));
        PageObject.textinput_Locator("fieldName:SWIFT.BIC",testData.get("SWIFT.BIC"));
        PageObject.textinput_Locator("fieldName:ORD.CUST.ACCT",testData.get("ORD.CUST.ACCT"));
        PageObject.textinput_Locator("fieldName:FREIGHT.CHARGE",testData.get("FREIGHT.CHARGE"));
        PageObject.textinput_Locator("fieldName:BPM.REQ.ID",testData.get("BPM.REQ.ID"));
        PageObject.textinput_Locator("fieldName:BAF.DEAL.TIME",testData.get("BAF.DEAL.TIME"));
        PageObject.textinput_Locator("fieldName:SEND.ACCUITY",testData.get("SEND.ACCUITY"));
        PageObject.textinput_Locator("radio:tab1:SEND.ACCUITY",testData.get("tab1"));
        PageObject.textinput_Locator("fieldName:ACCUITY.REF",testData.get("ACCUITY.REF"));
        PageObject.textinput_Locator("fieldName:ACCUITY.RESP",testData.get("ACCUITY.RESP"));
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
        PageObject.commitDeal("ImportOpenAccountPaymentWithMargin");



    }
    @Test(groups = {"IBGImportInputter"}, dataProvider = "LodgeImportOpenAcctWithoutMargin")
    public void LodgeImportOpenAcctWithoutMargin (Map<String, String> testData) throws IOException{

        PageObject.menu_Dropdown("Import Open Account",1);
        PageObject.menu_Link("Lodge Import Open Acct - Without Margin ");
        PageObject.switchToChildWindow();
        driver.manage().window().maximize();
        PageObject.img_Button("New Deal");
        PageObject.switchToChildWindow();
        PageObject.textinput_Locator("fieldName:FT.CUST",testData.get("FT.CUST"));
        PageObject.textinput_Locator("fieldName:GD.NUM:1",testData.get("GD.NUM"));
        PageObject.textinput_Locator("fieldName:GD.DATE:1",testData.get("GD.DATE"));
        PageObject.textinput_Locator("fieldName:EXPRT.NAME:1",testData.get("EXPRT.NAME"));
        PageObject.textinput_Locator("fieldName:EXPRT.STREET:1",testData.get("EXPRT.STREET"));
        PageObject.textinput_Locator("fieldName:EXPRT.TOWN:1",testData.get("EXPRT.TOWN"));
        PageObject.textinput_Locator("fieldName:EXP.NAME",testData.get("EXP.NAME"));
        PageObject.textinput_Locator("fieldName:EXP.ADDRESS:1",testData.get("EXP.ADDRESS"));
        PageObject.textinput_Locator("fieldName:EXP.CNTRY",testData.get("EXP.CNTRY"));
        PageObject.textinput_Locator("fieldName:PORT",testData.get("PORT"));
        PageObject.textinput_Locator("fieldName:INCOTERM",testData.get("INCOTERM"));
        PageObject.textinput_Locator("fieldName:FT.AMT",testData.get("FT.AMT"));
        PageObject.textinput_Locator("fieldName:FT.CCY",testData.get("FT.CCY"));
        PageObject.textinput_Locator("fieldName:HS.CODE:1:1",testData.get("HS.CODE"));
        PageObject.textinput_Locator("fieldName:HS.QUANTITY:1:1",testData.get("HS.QUANTITY"));
        PageObject.textinput_Locator("fieldName:HS.SAMPLE.VALUE:1",testData.get("HS.SAMPLE.VALUE"));
        PageObject.textinput_Locator("fieldName:UNIT.PRICE:1",testData.get("UNIT.PRICE"));
        PageObject.textinput_Locator("fieldName:BAF.HS.BPRICE:1",testData.get("BAF.HS.BPRICE"));
        PageObject.textinput_Locator("fieldName:CONT.OF.ORIGIN:1",testData.get("CONT.OF.ORIGIN"));
        PageObject.textinput_Locator("fieldName:BAF.DESC.GOODS:1",testData.get("BAF.DESC.GOODS"));
        PageObject.textinput_Locator("fieldName:FT.DATE",testData.get("FT.DATE"));
        PageObject.textinput_Locator("fieldName:SHIPMENT.DATE",testData.get("SHIPMENT.DATE"));
        PageObject.textinput_Locator("fieldName:SHIP.BL.DATE",testData.get("SHIP.BL.DATE"));
        PageObject.textinput_Locator("fieldName:TRANS.DATE:1",testData.get("TRANS.DATE"));
        PageObject.textinput_Locator("fieldName:REMARKS",testData.get("REMARKS"));
        PageObject.textinput_Locator("fieldName:ADV.PAY.IMP",testData.get("ADV.PAY.IMP"));
        PageObject.textinput_Locator("fieldName:SEND.PSW",testData.get("SEND.PSW"));
        PageObject.textinput_Locator("radio:tab1:SEND.PSW",testData.get("tab1"));
        PageObject.textinput_Locator("fieldName:PSW.REFERENCE:1",testData.get("PSW.REFERENCE"));

        PageObject.form_Tab("Other Information");

        PageObject.textinput_Locator("fieldName:NAME.OF.VESS:1",testData.get("NAME.OF.VESS"));
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
        PageObject.textinput_Locator("fieldName:VESSEL.IMO:1",testData.get("VESSEL.IMO"));
        PageObject.textinput_Locator("fieldName:THIRDPARTY.UBO:1",testData.get("THIRDPARTY.UBO"));
        PageObject.textinput_Locator("fieldName:OTHER.BANK:1",testData.get("OTHER.BANK"));

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
        PageObject.commitDeal("LodgeImportOpenAcctWithoutMargin");


    }

    @Test(groups = {"IBGImportInputter"}, dataProvider = "ImportOpenAccountPaymentWithoutMargin")
    public void ImportOpenAccountPaymentWithoutMargin (Map<String, String> testData) throws IOException{

        PageObject.menu_Dropdown("Import Open Account",1);
        PageObject.menu_Link("Import Open Account Payment - Without Margin ");
        PageObject.switchToChildWindow();
        driver.manage().window().maximize();
        PageObject.img_Button("New Deal");
        PageObject.switchToChildWindow();
        PageObject.textinput_Locator("fieldName:FT.ID.NO",testData.get("FT.ID.NO"));
        PageObject.textinput_Locator("fieldName:PURPOSE:1",testData.get("PURPOSE"));
        PageObject.textinput_Locator("fieldName:CREDIT.AMOUNT",testData.get("CREDIT.AMOUNT"));
        PageObject.textinput_Locator("fieldName:CREDIT.CURRENCY",testData.get("CREDIT.CURRENCY"));
        PageObject.textinput_Locator("fieldName:CREDIT.VALUE.DATE",testData.get("CREDIT.VALUE.DATE"));
        PageObject.textinput_Locator("fieldName:CREDIT.ACCT.NO",testData.get("CREDIT.ACCT.NO"));
        PageObject.textinput_Locator("fieldName:DEBIT.ACCT.NO",testData.get("DEBIT.ACCT.NO"));
        PageObject.textinput_Locator("fieldName:DEBIT.VALUE.DATE",testData.get("DEBIT.VALUE.DATE"));
        PageObject.textinput_Locator("fieldName:DEBIT.THEIR.REF",testData.get("DEBIT.THEIR.REF"));
        PageObject.textinput_Locator("fieldName:ACUDOLLAR",testData.get("ACUDOLLAR"));
        PageObject.textinput_Locator("radio:tab1:ACUDOLLAR",testData.get("tab1"));
        PageObject.textinput_Locator("fieldName:CREDIT.THEIR.REF",testData.get("CREDIT.THEIR.REF"));
        PageObject.textinput_Locator("fieldName:TREASURY.RATE",testData.get("TREASURY.RATE"));
        PageObject.textinput_Locator("",testData.get("undefined"));
        PageObject.textinput_Locator("fieldName:CUSTOMER.RATE",testData.get("CUSTOMER.RATE"));
        PageObject.textinput_Locator("fieldName:INCO.TERMS.LC",testData.get("INCO.TERMS.LC"));
        PageObject.textinput_Locator("fieldName:BEN.CUSTOMER:1",testData.get("BEN.CUSTOMER"));
        PageObject.textinput_Locator("fieldName:ORDERING.CUST:1",testData.get("ORDERING.CUST"));
        PageObject.textinput_Locator("fieldName:ORDERING.BANK:1",testData.get("ORDERING.BANK"));
        PageObject.textinput_Locator("fieldName:BEN.OUR.CHARGES",testData.get("BEN.OUR.CHARGES"));
        PageObject.textinput_Locator("radio:tab1:BEN.OUR.CHARGES",testData.get("tab1"));
        PageObject.textinput_Locator("fieldName:CHARGES.ACCT.NO",testData.get("CHARGES.ACCT.NO"));
        PageObject.textinput_Locator("fieldName:COMMISSION.CODE",testData.get("COMMISSION.CODE"));
        PageObject.textinput_Locator("radio:tab1:COMMISSION.CODE",testData.get("tab1"));
        PageObject.textinput_Locator("fieldName:COMMISSION.TYPE:1",testData.get("COMMISSION.TYPE"));
        PageObject.textinput_Locator("fieldName:COMMISSION.AMT:1",testData.get("COMMISSION.AMT"));
        PageObject.textinput_Locator("",testData.get("undefined"));
        PageObject.textinput_Locator("fieldName:TIME.IND:1:1",testData.get("TIME.IND"));
        PageObject.textinput_Locator("fieldName:SBP.RET.CODE",testData.get("SBP.RET.CODE"));
        PageObject.textinput_Locator("fieldName:PK.DAO",testData.get("PK.DAO"));
        PageObject.textinput_Locator("fieldName:HS.CODE:1",testData.get("HS.CODE"));
        PageObject.textinput_Locator("fieldName:HS.QUANTITY:1",testData.get("HS.QUANTITY"));
        PageObject.textinput_Locator("fieldName:UNIT.PRICE:1",testData.get("UNIT.PRICE"));
        PageObject.textinput_Locator("fieldName:PYMT.NARRATION:1",testData.get("PYMT.NARRATION"));
        PageObject.textinput_Locator("fieldName:BAF.HS.BPRICE:1",testData.get("BAF.HS.BPRICE"));
        PageObject.textinput_Locator("fieldName:LC.COUNTRY:1",testData.get("LC.COUNTRY"));
        PageObject.textinput_Locator("fieldName:GD.NUM:1",testData.get("GD.NUM"));
        PageObject.textinput_Locator("fieldName:GD.DATE:1",testData.get("GD.DATE"));
        PageObject.textinput_Locator("fieldName:SHIPDOC:1",testData.get("SHIPDOC"));
        PageObject.textinput_Locator("fieldName:SHIP.DATE:1",testData.get("SHIP.DATE"));
        PageObject.textinput_Locator("fieldName:INV.NO:1",testData.get("INV.NO"));
        PageObject.textinput_Locator("fieldName:INV.DATE:1",testData.get("INV.DATE"));
        PageObject.textinput_Locator("fieldName:DISCHARGE.PORT:1",testData.get("DISCHARGE.PORT"));
        PageObject.textinput_Locator("fieldName:PORT.ISO.CODE",testData.get("PORT.ISO.CODE"));
        PageObject.textinput_Locator("fieldName:SWIFT.BIC",testData.get("SWIFT.BIC"));
        PageObject.textinput_Locator("fieldName:ORD.CUST.ACCT",testData.get("ORD.CUST.ACCT"));
        PageObject.textinput_Locator("fieldName:FREIGHT.CHARGE",testData.get("FREIGHT.CHARGE"));
        PageObject.textinput_Locator("fieldName:BPM.REQ.ID",testData.get("BPM.REQ.ID"));
        PageObject.textinput_Locator("fieldName:BAF.DEAL.TIME",testData.get("BAF.DEAL.TIME"));
        PageObject.textinput_Locator("fieldName:SEND.ACCUITY",testData.get("SEND.ACCUITY"));
        PageObject.textinput_Locator("radio:tab1:SEND.ACCUITY",testData.get("tab1"));
        PageObject.textinput_Locator("fieldName:ACCUITY.REF",testData.get("ACCUITY.REF"));
        PageObject.textinput_Locator("fieldName:ACCUITY.RESP",testData.get("ACCUITY.RESP"));
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
        PageObject.commitDeal("ImportOpenAccountPaymentWithoutMargin");


    }

    @Test(groups = {"IBGImportInputter"}, dataProvider = "ImportOpenAccountPaymentWithoutMargin")
    public void LodgeOPACOtherBankGD (Map<String, String> testData) throws IOException{

        PageObject.menu_Dropdown("Import Open Account",1);
        PageObject.menu_Link("Lodge - OPAC Other Bank GD ");
        PageObject.switchToChildWindow();
        driver.manage().window().maximize();
        PageObject.img_Button("New Deal");
        PageObject.switchToChildWindow();
        PageObject.textinput_Locator("fieldName:FT.CUST",testData.get("FT.CUST"));
        PageObject.textinput_Locator("fieldName:BAF.OTHGD:1",testData.get("BAF.OTHGD"));
        PageObject.textinput_Locator("fieldName:GD.DATE:1",testData.get("GD.DATE"));
        PageObject.textinput_Locator("fieldName:EXPRT.NAME:1",testData.get("EXPRT.NAME"));
        PageObject.textinput_Locator("fieldName:EXPRT.STREET:1",testData.get("EXPRT.STREET"));
        PageObject.textinput_Locator("fieldName:EXPRT.TOWN:1",testData.get("EXPRT.TOWN"));
        PageObject.textinput_Locator("fieldName:EXP.NAME",testData.get("EXP.NAME"));
        PageObject.textinput_Locator("fieldName:EXP.ADDRESS:1",testData.get("EXP.ADDRESS"));
        PageObject.textinput_Locator("fieldName:EXP.CNTRY",testData.get("EXP.CNTRY"));
        PageObject.textinput_Locator("fieldName:PORT",testData.get("PORT"));
        PageObject.textinput_Locator("fieldName:INCOTERM",testData.get("INCOTERM"));
        PageObject.textinput_Locator("fieldName:FT.AMT",testData.get("FT.AMT"));
        PageObject.textinput_Locator("fieldName:FT.CCY",testData.get("FT.CCY"));
        PageObject.textinput_Locator("",testData.get("undefined"));
        PageObject.textinput_Locator("fieldName:HS.CODE:1:1",testData.get("HS.CODE"));
        PageObject.textinput_Locator("fieldName:HS.QUANTITY:1:1",testData.get("HS.QUANTITY"));
        PageObject.textinput_Locator("fieldName:HS.SAMPLE.VALUE:1",testData.get("HS.SAMPLE.VALUE"));
        PageObject.textinput_Locator("fieldName:UNIT.PRICE:1",testData.get("UNIT.PRICE"));
        PageObject.textinput_Locator("fieldName:BAF.HS.BPRICE:1",testData.get("BAF.HS.BPRICE"));
        PageObject.textinput_Locator("fieldName:CONT.OF.ORIGIN:1",testData.get("CONT.OF.ORIGIN"));
        PageObject.textinput_Locator("fieldName:BAF.DESC.GOODS:1",testData.get("BAF.DESC.GOODS"));
        PageObject.textinput_Locator("fieldName:FT.DATE",testData.get("FT.DATE"));
        PageObject.textinput_Locator("fieldName:SHIPMENT.DATE",testData.get("SHIPMENT.DATE"));
        PageObject.textinput_Locator("fieldName:SHIP.BL.DATE",testData.get("SHIP.BL.DATE"));
        PageObject.textinput_Locator("fieldName:TRANS.DATE:1",testData.get("TRANS.DATE"));
        PageObject.textinput_Locator("fieldName:REMARKS",testData.get("REMARKS"));
        PageObject.textinput_Locator("fieldName:SEND.PSW",testData.get("SEND.PSW"));
        PageObject.textinput_Locator("radio:tab1:SEND.PSW",testData.get("tab1"));

        PageObject.form_Tab("Other Information");

        PageObject.textinput_Locator("fieldName:NAME.OF.VESS:1",testData.get("NAME.OF.VESS"));
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
        PageObject.textinput_Locator("fieldName:VESSEL.IMO:1",testData.get("VESSEL.IMO"));
        PageObject.textinput_Locator("fieldName:THIRDPARTY.UBO:1",testData.get("THIRDPARTY.UBO"));
        PageObject.textinput_Locator("fieldName:OTHER.BANK:1",testData.get("OTHER.BANK"));

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
        PageObject.commitDeal("LodgeOPACOtherBankGD");

    }

    @Test(groups = {"IBGImportInputter"}, dataProvider = "PaymentOPACOtherBankGD")
    public void PaymentOPACOtherBankGD (Map<String, String> testData) throws IOException{

        PageObject.menu_Dropdown("Import Open Account",1);
        PageObject.menu_Link("Payment - OPAC Other Bank GD ");
        PageObject.switchToChildWindow();
        driver.manage().window().maximize();
        PageObject.img_Button("New Deal");
        PageObject.switchToChildWindow();
        PageObject.textinput_Locator("fieldName:FT.ID.NO",testData.get("FT.ID.NO"));
        PageObject.textinput_Locator("fieldName:PURPOSE:1",testData.get("PURPOSE"));
        PageObject.textinput_Locator("fieldName:CREDIT.AMOUNT",testData.get("CREDIT.AMOUNT"));
        PageObject.textinput_Locator("fieldName:CREDIT.CURRENCY",testData.get("CREDIT.CURRENCY"));
        PageObject.textinput_Locator("fieldName:CREDIT.VALUE.DATE",testData.get("CREDIT.VALUE.DATE"));
        PageObject.textinput_Locator("fieldName:CREDIT.ACCT.NO",testData.get("CREDIT.ACCT.NO"));
        PageObject.textinput_Locator("fieldName:DEBIT.ACCT.NO",testData.get("DEBIT.ACCT.NO"));
        PageObject.textinput_Locator("fieldName:DEBIT.VALUE.DATE",testData.get("DEBIT.VALUE.DATE"));
        PageObject.textinput_Locator("fieldName:DEBIT.THEIR.REF",testData.get("DEBIT.THEIR.REF"));
        PageObject.textinput_Locator("fieldName:ACUDOLLAR",testData.get("ACUDOLLAR"));
        PageObject.textinput_Locator("radio:tab1:ACUDOLLAR",testData.get("tab1"));
        PageObject.textinput_Locator("fieldName:CREDIT.THEIR.REF",testData.get("CREDIT.THEIR.REF"));
        PageObject.textinput_Locator("fieldName:TREASURY.RATE",testData.get("TREASURY.RATE"));
        PageObject.textinput_Locator("",testData.get("undefined"));
        PageObject.textinput_Locator("fieldName:CUSTOMER.RATE",testData.get("CUSTOMER.RATE"));
        PageObject.textinput_Locator("fieldName:INCO.TERMS.LC",testData.get("INCO.TERMS.LC"));
        PageObject.textinput_Locator("fieldName:BEN.CUSTOMER:1",testData.get("BEN.CUSTOMER"));
        PageObject.textinput_Locator("fieldName:ORDERING.CUST:1",testData.get("ORDERING.CUST"));
        PageObject.textinput_Locator("fieldName:ORDERING.BANK:1",testData.get("ORDERING.BANK"));
        PageObject.textinput_Locator("fieldName:BEN.OUR.CHARGES",testData.get("BEN.OUR.CHARGES"));
        PageObject.textinput_Locator("radio:tab1:BEN.OUR.CHARGES",testData.get("tab1"));
        PageObject.textinput_Locator("fieldName:CHARGES.ACCT.NO",testData.get("CHARGES.ACCT.NO"));
        PageObject.textinput_Locator("fieldName:COMMISSION.CODE",testData.get("COMMISSION.CODE"));
        PageObject.textinput_Locator("radio:tab1:COMMISSION.CODE",testData.get("tab1"));
        PageObject.textinput_Locator("fieldName:COMMISSION.TYPE:1",testData.get("COMMISSION.TYPE"));
        PageObject.textinput_Locator("fieldName:COMMISSION.AMT:1",testData.get("COMMISSION.AMT"));
        PageObject.textinput_Locator("",testData.get("undefined"));
        PageObject.textinput_Locator("fieldName:TIME.IND:1:1",testData.get("TIME.IND"));
        PageObject.textinput_Locator("fieldName:SBP.RET.CODE",testData.get("SBP.RET.CODE"));
        //PageObject.textinput_Locator("fieldName:DELIVERY.OUTREF:1",testData.get("DELIVERY.OUTREF"));
        PageObject.textinput_Locator("fieldName:PK.DAO",testData.get("PK.DAO"));
        //PageObject.textinput_Locator("fieldName:IMP.ADV.PAY",testData.get("IMP.ADV.PAY"));
        PageObject.textinput_Locator("fieldName:HS.CODE:1",testData.get("HS.CODE"));
        PageObject.textinput_Locator("fieldName:HS.QUANTITY:1",testData.get("HS.QUANTITY"));
        PageObject.textinput_Locator("fieldName:UNIT.PRICE:1",testData.get("UNIT.PRICE"));
        PageObject.textinput_Locator("fieldName:PYMT.NARRATION:1",testData.get("PYMT.NARRATION"));
        PageObject.textinput_Locator("fieldName:BAF.HS.BPRICE:1",testData.get("BAF.HS.BPRICE"));
        PageObject.textinput_Locator("fieldName:LC.COUNTRY:1",testData.get("LC.COUNTRY"));
        PageObject.textinput_Locator("fieldName:BAF.OTHGD:1",testData.get("BAF.OTHGD"));
        PageObject.textinput_Locator("fieldName:SHIPDOC:1",testData.get("SHIPDOC"));
        PageObject.textinput_Locator("fieldName:SHIP.DATE:1",testData.get("SHIP.DATE"));
        PageObject.textinput_Locator("fieldName:INV.NO:1",testData.get("INV.NO"));
        PageObject.textinput_Locator("fieldName:INV.DATE:1",testData.get("INV.DATE"));
        PageObject.textinput_Locator("fieldName:SWIFT.BIC",testData.get("SWIFT.BIC"));
        PageObject.textinput_Locator("fieldName:ORD.CUST.ACCT",testData.get("ORD.CUST.ACCT"));
        PageObject.textinput_Locator("fieldName:FREIGHT.CHARGE",testData.get("FREIGHT.CHARGE"));
        PageObject.textinput_Locator("fieldName:BPM.REQ.ID",testData.get("BPM.REQ.ID"));
        PageObject.textinput_Locator("fieldName:SEND.ACCUITY",testData.get("SEND.ACCUITY"));
        PageObject.textinput_Locator("radio:tab1:SEND.ACCUITY",testData.get("tab1"));
        PageObject.textinput_Locator("fieldName:ACCUITY.REF",testData.get("ACCUITY.REF"));
        PageObject.textinput_Locator("fieldName:ACCUITY.RESP",testData.get("ACCUITY.RESP"));
        PageObject.textinput_Locator("fieldName:SEND.PSW",testData.get("SEND.PSW"));
        PageObject.textinput_Locator("radio:tab1:SEND.PSW",testData.get("tab1"));
        PageObject.textinput_Locator("fieldName:PSW.REFERENCE",testData.get("PSW.REFERENCE"));
        PageObject.textinput_Locator("fieldName:BAF.DEAL.TIME",testData.get("BAF.DEAL.TIME"));

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
        PageObject.commitDeal("PaymentOPACOtherBankGD");



    }
    private static final String FILE_PATH = "path/to/your/excel/file.xlsx"; // Update with your file path
    @DataProvider(name = "ImportOpenAccountWithMargin")
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
    @DataProvider(name = "ImportOpenAccountPaymentWithMargin")
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

    @DataProvider(name = "LodgeImportOpenAcctWithoutMargin")
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

    @DataProvider(name = "ImportOpenAccountPaymentWithoutMargin")
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
    @DataProvider(name = "LodgeOPACOtherBankGD")
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
    @DataProvider(name = "PaymentOPACOtherBankGD")
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
}
