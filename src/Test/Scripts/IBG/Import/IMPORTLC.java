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

public class IMPORTLC extends BaseClass {

    @Test(groups = {"IBGImportInputter"}, dataProvider = "SIGHTLC")
    public void SIGHTLC(Map<String, String> testData) throws IOException{

        PageObject.menu_Dropdown("Import LC",1);
        PageObject.menu_Link("Sight LC ");
        PageObject.switchToChildWindow();
        driver.manage().window().maximize();
        PageObject.img_Button("New Deal");
        PageObject.switchToChildWindow();
        PageObject.textinput_Locator("fieldName:CURRENCY.MARKET",testData.get("CURRENCY.MARKET"));
        PageObject.textinput_Locator("fieldName:LC.TYPE",testData.get("LC.TYPE"));
        PageObject.textinput_Locator("fieldName:APPLICANT.CUSTNO",testData.get("APPLICANT.CUSTNO"));
        PageObject.textinput_Locator("fieldName:APPLICANT:1",testData.get("APPLICANT"));
        PageObject.textinput_Locator("fieldName:LC.CURRENCY",testData.get("LC.CURRENCY"));
        PageObject.textinput_Locator("fieldName:ACUDOLLAR",testData.get("ACUDOLLAR"));
        PageObject.textinput_Locator("radio:tab1:ACUDOLLAR",testData.get("tab1"));
        PageObject.textinput_Locator("fieldName:LC.AMOUNT",testData.get("LC.AMOUNT"));
        PageObject.textinput_Locator("fieldName:INCO.TERMS.LC",testData.get("INCO.TERMS.LC"));
        PageObject.textinput_Locator("fieldName:PERCENTAGE.CR.AMT",testData.get("PERCENTAGE.CR.AMT"));
        PageObject.textinput_Locator("fieldName:PERCENTAGE.DR.AMT",testData.get("PERCENTAGE.DR.AMT"));
        PageObject.textinput_Locator("fieldName:ISSUE.DATE",testData.get("ISSUE.DATE"));
        PageObject.textinput_Locator("fieldName:ADVICE.EXPIRY.DATE",testData.get("ADVICE.EXPIRY.DATE"));
        PageObject.textinput_Locator("fieldName:EXPIRY.PLACE",testData.get("EXPIRY.PLACE"));
        PageObject.textinput_Locator("fieldName:EXPIRY.DATE",testData.get("EXPIRY.DATE"));
        PageObject.textinput_Locator("fieldName:PORT.LIM.REF:1",testData.get("PORT.LIM.REF"));
        PageObject.textinput_Locator("fieldName:BENEFICIARY.CUSTNO",testData.get("BENEFICIARY.CUSTNO"));
        PageObject.textinput_Locator("fieldName:BENEFICIARY:1",testData.get("BENEFICIARY"));
        PageObject.textinput_Locator("fieldName:CLIENT.CNTRY:1",testData.get("CLIENT.CNTRY"));
        PageObject.textinput_Locator("fieldName:EXP.NAME",testData.get("EXP.NAME"));
        PageObject.textinput_Locator("fieldName:EXP.ADDRESS:1",testData.get("EXP.ADDRESS"));
        PageObject.textinput_Locator("fieldName:EXP.CNTRY",testData.get("EXP.CNTRY"));
        PageObject.textinput_Locator("fieldName:ADVISING.BK.CUSTNO",testData.get("ADVISING.BK.CUSTNO"));
        PageObject.textinput_Locator("fieldName:ADVISING.BK:1",testData.get("ADVISING.BK"));
        PageObject.textinput_Locator("fieldName:FW.BOOKING.NO",testData.get("FW.BOOKING.NO"));
        PageObject.textinput_Locator("fieldName:FW.BOOKING.DATE",testData.get("FW.BOOKING.DATE"));
        PageObject.textinput_Locator("fieldName:INV.NUMBER:1",testData.get("INV.NUMBER"));
        PageObject.textinput_Locator("fieldName:INV.DATE:1",testData.get("INV.DATE"));
        PageObject.textinput_Locator("fieldName:AVAIL.WITH.CUSTNO",testData.get("AVAIL.WITH.CUSTNO"));
        PageObject.textinput_Locator("fieldName:AVAILABLE.WITH:1",testData.get("AVAILABLE.WITH"));
        PageObject.textinput_Locator("fieldName:ACCOUNT.OFFICER",testData.get("ACCOUNT.OFFICER"));
        PageObject.textinput_Locator("fieldName:ADV.PAY.PERCENT",testData.get("ADV.PAY.PERCENT"));
        PageObject.textinput_Locator("fieldName:SIGHT.PERCENT",testData.get("SIGHT.PERCENT"));
        PageObject.textinput_Locator("fieldName:USANCE.PERCENT",testData.get("USANCE.PERCENT"));
        PageObject.textinput_Locator("fieldName:NO.OF.DAYS",testData.get("NO.OF.DAYS"));
        PageObject.textinput_Locator("fieldName:EIF.NUMBER:1",testData.get("EIF.NUMBER"));
        PageObject.textinput_Locator("fieldName:EIF.DATE:1",testData.get("EIF.DATE"));
        PageObject.textinput_Locator("fieldName:EIF.AMOUNT:1",testData.get("EIF.AMOUNT"));

        PageObject.form_Tab("Charges and Margin");

        PageObject.textinput_Locator("fieldName:CHARGES.FROM",testData.get("CHARGES.FROM"));
        PageObject.textinput_Locator("radio:tab2:CHARGES.FROM",testData.get("tab2"));
        PageObject.textinput_Locator("fieldName:CHARGES.ACCOUNT",testData.get("CHARGES.ACCOUNT"));
        PageObject.textinput_Locator("fieldName:WAIVE.CHARGES",testData.get("WAIVE.CHARGES"));
        PageObject.textinput_Locator("fieldName:QRATE:1",testData.get("QRATE"));
        PageObject.textinput_Locator("fieldName:CHARGE.CODE:1",testData.get("CHARGE.CODE"));
        PageObject.textinput_Locator("fieldName:CHARGE.ACCT:1",testData.get("CHARGE.ACCT"));
        PageObject.textinput_Locator("fieldName:CHARGE.CURRENCY:1",testData.get("CHARGE.CURRENCY"));
        PageObject.textinput_Locator("fieldName:CHARGE.XCHG:1",testData.get("CHARGE.XCHG"));
        PageObject.textinput_Locator("fieldName:CHARGE.AMOUNT:1",testData.get("CHARGE.AMOUNT"));
        PageObject.textinput_Locator("fieldName:PROVISION",testData.get("PROVISION"));
        PageObject.textinput_Locator("radio:tab2:PROVISION",testData.get("tab2"));
        PageObject.textinput_Locator("fieldName:PROVIS.ACC",testData.get("PROVIS.ACC"));
        PageObject.textinput_Locator("fieldName:PROVIS.PERCENT",testData.get("PROVIS.PERCENT"));
        PageObject.textinput_Locator("fieldName:PROVIS.AMOUNT",testData.get("PROVIS.AMOUNT"));
        PageObject.textinput_Locator("fieldName:CREDIT.PROVIS.ACC",testData.get("CREDIT.PROVIS.ACC"));
        PageObject.textinput_Locator("fieldName:BLOCK.ACCT",testData.get("BLOCK.ACCT"));
        PageObject.textinput_Locator("fieldName:BLK.AMT",testData.get("BLK.AMT"));
        PageObject.textinput_Locator("fieldName:COURIER.REF",testData.get("COURIER.REF"));

        PageObject.form_Tab("Insurance/Forward Cont / Credit Rep Ref Details");

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
        PageObject.textinput_Locator("fieldName:FWD.CONT",testData.get("FWD.CONT"));
        PageObject.textinput_Locator("radio:tab3:FWD.CONT",testData.get("tab3"));
        PageObject.textinput_Locator("fieldName:CREP.REFERENCE",testData.get("CREP.REFERENCE"));

        PageObject.form_Tab("Terms and Conditions");

        PageObject.textinput_Locator("fieldName:ADD.AMT.COVERED:1",testData.get("ADD.AMT.COVERED"));
        PageObject.textinput_Locator("fieldName:SHIP.DESPATCH",testData.get("SHIP.DESPATCH"));
        PageObject.textinput_Locator("fieldName:OTHER.DESPATCH.DET",testData.get("OTHER.DESPATCH.DET"));
        PageObject.textinput_Locator("fieldName:TRANSPORTATION",testData.get("TRANSPORTATION"));
        PageObject.textinput_Locator("fieldName:FINAL.DESTINATION",testData.get("FINAL.DESTINATION"));
        PageObject.textinput_Locator("fieldName:LATEST.SHIPMENT",testData.get("LATEST.SHIPMENT"));
        PageObject.textinput_Locator("fieldName:SHIPMENT.PERIOD:1",testData.get("SHIPMENT.PERIOD"));
        PageObject.textinput_Locator("fieldName:CONT.OF.ORIGIN:1",testData.get("CONT.OF.ORIGIN"));
        PageObject.textinput_Locator("fieldName:DOCUMENT.CODE:1",testData.get("DOCUMENT.CODE"));
        PageObject.textinput_Locator("fieldName:APPLICANT.BANK:1",testData.get("APPLICANT.BANK"));
        PageObject.textinput_Locator("fieldName:ADVISE.THRU.CUSTNO",testData.get("ADVISE.THRU.CUSTNO"));
        PageObject.textinput_Locator("fieldName:ADVISE.THRU:1",testData.get("ADVISE.THRU"));
        PageObject.textinput_Locator("fieldName:THIRD.PARTY.CUSTNO",testData.get("THIRD.PARTY.CUSTNO"));
        PageObject.textinput_Locator("fieldName:THIRD.PARTY:1",testData.get("THIRD.PARTY"));
        PageObject.textinput_Locator("fieldName:DRAFTS.AT:1",testData.get("DRAFTS.AT"));
        PageObject.textinput_Locator("fieldName:DRAWEE.CUST.NO",testData.get("DRAWEE.CUST.NO"));
        PageObject.textinput_Locator("fieldName:DRAWEE:1",testData.get("DRAWEE"));
        PageObject.textinput_Locator("fieldName:MIXED.PAYMENT:1",testData.get("MIXED.PAYMENT"));
        PageObject.textinput_Locator("fieldName:DEFERRED.PAY:1",testData.get("DEFERRED.PAY"));
        PageObject.textinput_Locator("fieldName:CONFIRM.INST",testData.get("CONFIRM.INST"));
        PageObject.textinput_Locator("radio:tab4:CONFIRM.INST",testData.get("tab4"));
        PageObject.textinput_Locator("fieldName:CONFIRM.INST",testData.get("CONFIRM.INST"));
        PageObject.textinput_Locator("radio:tab4:CONFIRM.INST",testData.get("tab4"));
        PageObject.textarea_Locator("fieldName:INSTRUCTIONS",testData.get(""));

        PageObject.form_Tab("SBP Reports");

        PageObject.textinput_Locator("fieldName:HS.CODE:1",testData.get("HS.CODE"));
        PageObject.textinput_Locator("fieldName:HS.QUANTITY:1",testData.get("HS.QUANTITY"));
        PageObject.textinput_Locator("fieldName:UNIT.PRICE:1",testData.get("UNIT.PRICE"));
        PageObject.textinput_Locator("fieldName:BAF.DESC.GOODS:1",testData.get("BAF.DESC.GOODS"));
        PageObject.textinput_Locator("fieldName:HS.SAMPLE.VALUE:1",testData.get("HS.SAMPLE.VALUE"));
        PageObject.textinput_Locator("fieldName:CONT.OF.ORIGIN:1",testData.get("CONT.OF.ORIGIN"));
        PageObject.textinput_Locator("fieldName:BAF.HS.BPRICE:1",testData.get("BAF.HS.BPRICE"));
        PageObject.textinput_Locator("fieldName:LC.UNDER",testData.get("LC.UNDER"));
        PageObject.textinput_Locator("radio:tab5:LC.UNDER",testData.get("tab5"));
        PageObject.textinput_Locator("fieldName:AGREE.UNDER",testData.get("AGREE.UNDER"));
        PageObject.textinput_Locator("radio:tab5:AGREE.UNDER",testData.get("tab5"));
        PageObject.textinput_Locator("fieldName:LC.COUNTRY",testData.get("LC.COUNTRY"));
        PageObject.textinput_Locator("fieldName:INS.PPR.AMT",testData.get("INS.PPR.AMT"));
        PageObject.textinput_Locator("fieldName:FREIGHT.CHARGE",testData.get("FREIGHT.CHARGE"));
        PageObject.textinput_Locator("fieldName:FOB.VALUE",testData.get("FOB.VALUE"));
        PageObject.textinput_Locator("fieldName:INTEND.DATE",testData.get("INTEND.DATE"));
        PageObject.textinput_Locator("fieldName:REMARKS",testData.get("REMARKS"));
        PageObject.textinput_Locator("fieldName:DR.SHIP.TIME:1",testData.get("DR.SHIP.TIME"));
        PageObject.textinput_Locator("fieldName:LATEST.SHIPMENT",testData.get("LATEST.SHIPMENT"));

        PageObject.form_Tab("Payment/Revol Details");

        PageObject.textinput_Locator("fieldName:PAYMENT.PCT:1",testData.get("PAYMENT.PCT"));
        PageObject.textinput_Locator("fieldName:PAY.PORTION:1",testData.get("PAY.PORTION"));
        PageObject.textinput_Locator("fieldName:ACPT.TM.BAND:1",testData.get("ACPT.TM.BAND"));
        PageObject.textinput_Locator("fieldName:ADD.COVERED.AMT:1",testData.get("ADD.COVERED.AMT"));
        PageObject.textinput_Locator("fieldName:PORT.LIM.REF:1",testData.get("PORT.LIM.REF"));
        PageObject.textinput_Locator("fieldName:T.CHARGE.AMT",testData.get("T.CHARGE.AMT"));
        PageObject.textinput_Locator("fieldName:REVOLVING.TYPE",testData.get("REVOLVING.TYPE"));
        PageObject.textinput_Locator("radio:tab6:REVOLVING.TYPE",testData.get("tab6"));
        PageObject.textinput_Locator("fieldName:NO.OF.REVOLVING",testData.get("NO.OF.REVOLVING"));
        PageObject.textinput_Locator("fieldName:REVOLVING.FQY",testData.get("REVOLVING.FQY"));

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

        PageObject.form_Tab("MT 700/701");

        PageObject.textinput_Locator("fieldName:PRE.ADV.REF",testData.get("PRE.ADV.REF"));
        PageObject.textinput_Locator("fieldName:ISSUE.DATE",testData.get("ISSUE.DATE"));
        PageObject.textinput_Locator("fieldName:APPL.RULE.DESC",testData.get("APPL.RULE.DESC"));
        PageObject.textinput_Locator("fieldName:ADVICE.EXPIRY.DATE",testData.get("ADVICE.EXPIRY.DATE"));
        PageObject.textinput_Locator("fieldName:EXPIRY.PLACE",testData.get("EXPIRY.PLACE"));
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
        PageObject.textinput_Locator("fieldName:OTHER.DESPATCH.DET",testData.get("OTHER.DESPATCH.DET"));
        PageObject.textinput_Locator("fieldName:TRANSPORTATION",testData.get("TRANSPORTATION"));
        PageObject.textinput_Locator("fieldName:FINAL.DESTINATION",testData.get("FINAL.DESTINATION"));
        PageObject.textinput_Locator("fieldName:LATEST.SHIPMENT",testData.get("LATEST.SHIPMENT"));
        PageObject.textinput_Locator("fieldName:SHIPMENT.PERIOD:1",testData.get("SHIPMENT.PERIOD"));
        PageObject.textinput_Locator("fieldName:DOCUMENT.CODE:1",testData.get("DOCUMENT.CODE"));
        PageObject.textarea_Locator("fieldName:NARRATIVE.CHRGS",testData.get(""));
        PageObject.textinput_Locator("fieldName:PRES.DAY.PERIOD",testData.get("PRES.DAY.PERIOD"));
        PageObject.textinput_Locator("fieldName:CONFIRM.INST",testData.get("CONFIRM.INST"));
        PageObject.textinput_Locator("radio:tab8:CONFIRM.INST",testData.get("tab8"));
        PageObject.textinput_Locator("fieldName:THIRD.PARTY.CUSTNO",testData.get("THIRD.PARTY.CUSTNO"));
        PageObject.textinput_Locator("fieldName:THIRD.PARTY:1",testData.get("THIRD.PARTY"));
        PageObject.textinput_Locator("fieldName:ADVISE.THRU.CUSTNO",testData.get("ADVISE.THRU.CUSTNO"));
        PageObject.textinput_Locator("fieldName:ADVISE.THRU:1",testData.get("ADVISE.THRU"));
        PageObject.textinput_Locator("fieldName:BANK.TO.BANK:1",testData.get("BANK.TO.BANK"));
        PageObject.textinput_Locator("fieldName:REQ.CONF.BNK",testData.get("REQ.CONF.BNK"));
        PageObject.textinput_Locator("fieldName:CONF.BNK.NAME:1",testData.get("CONF.BNK.NAME"));
        PageObject.textinput_Locator("fieldName:TRANS.SHIP.CODE",testData.get("TRANS.SHIP.CODE"));
        PageObject.textinput_Locator("radio:tab8:TRANS.SHIP.CODE",testData.get("tab8"));
        PageObject.textinput_Locator("fieldName:PART.SHIP.CODE",testData.get("PART.SHIP.CODE"));
        PageObject.textinput_Locator("radio:tab8:PART.SHIP.CODE",testData.get("tab8"));
        PageObject.textinput_Locator("fieldName:MT759.ALT.REF",testData.get("MT759.ALT.REF"));
        PageObject.textinput_Locator("fieldName:MT759.FORM.UNDK",testData.get("MT759.FORM.UNDK"));
        PageObject.textinput_Locator("radio:tab8:MT759.FORM.UNDK",testData.get("tab8"));

        PageObject.form_Tab("MT 740");

        PageObject.textinput_Locator("fieldName:THIRD.PARTY.CUSTNO",testData.get("THIRD.PARTY.CUSTNO"));
        PageObject.textinput_Locator("fieldName:THIRD.PARTY:1",testData.get("THIRD.PARTY"));
        PageObject.textinput_Locator("fieldName:CONFIRM.INST",testData.get("CONFIRM.INST"));
        PageObject.textinput_Locator("radio:tab9:CONFIRM.INST",testData.get("tab9"));
        PageObject.textinput_Locator("fieldName:SEND.MT740",testData.get("SEND.MT740"));
        PageObject.textinput_Locator("radio:tab9:SEND.MT740",testData.get("tab9"));
        PageObject.textinput_Locator("fieldName:THIRD.PARTY.ACC",testData.get("THIRD.PARTY.ACC"));
        PageObject.textinput_Locator("fieldName:ADVICE.EXPIRY.DATE",testData.get("ADVICE.EXPIRY.DATE"));
        PageObject.textinput_Locator("fieldName:EXPIRY.PLACE",testData.get("EXPIRY.PLACE"));
        PageObject.textinput_Locator("fieldName:NEG.WITH.BANK:1",testData.get("NEG.WITH.BANK"));
        PageObject.textinput_Locator("fieldName:BENEFICIARY.CUSTNO",testData.get("BENEFICIARY.CUSTNO"));
        PageObject.textinput_Locator("fieldName:BENEFICIARY:1",testData.get("BENEFICIARY"));
        PageObject.textinput_Locator("fieldName:LC.CURRENCY",testData.get("LC.CURRENCY"));
        PageObject.textinput_Locator("fieldName:LC.AMOUNT",testData.get("LC.AMOUNT"));
        PageObject.textinput_Locator("fieldName:PERCENTAGE.CR.AMT",testData.get("PERCENTAGE.CR.AMT"));
        PageObject.textinput_Locator("fieldName:PERCENTAGE.DR.AMT",testData.get("PERCENTAGE.DR.AMT"));
        PageObject.textinput_Locator("fieldName:ADD.AMT.COVERED:1",testData.get("ADD.AMT.COVERED"));
        PageObject.textinput_Locator("fieldName:APPL.RULE.MT740",testData.get("APPL.RULE.MT740"));
        PageObject.textinput_Locator("radio:tab9:APPL.RULE.MT740",testData.get("tab9"));
        PageObject.textinput_Locator("fieldName:AVAIL.WITH.CUSTNO",testData.get("AVAIL.WITH.CUSTNO"));
        PageObject.textinput_Locator("fieldName:AVAILABLE.WITH:1",testData.get("AVAILABLE.WITH"));
        PageObject.textinput_Locator("fieldName:DRAFTS.AT:1",testData.get("DRAFTS.AT"));
        PageObject.textinput_Locator("fieldName:DRAWEE.CUST.NO",testData.get("DRAWEE.CUST.NO"));
        PageObject.textinput_Locator("fieldName:DRAWEE:1",testData.get("DRAWEE"));
        PageObject.textinput_Locator("fieldName:MIXED.PAYMENT:1",testData.get("MIXED.PAYMENT"));
        PageObject.textinput_Locator("fieldName:DEFERRED.PAY:1",testData.get("DEFERRED.PAY"));
        PageObject.textinput_Locator("fieldName:REIMB.BK.CHGS",testData.get("REIMB.BK.CHGS"));
        PageObject.textinput_Locator("radio:tab9:REIMB.BK.CHGS",testData.get("tab9"));
        PageObject.textinput_Locator("fieldName:CHARGES.DET:1",testData.get("CHARGES.DET"));
        PageObject.textinput_Locator("fieldName:BANK.TO.BK740:1",testData.get("BANK.TO.BK740"));

        PageObject.form_Tab("Delivery Info");

        PageObject.textinput_Locator("fieldName:MESSAGE.TYPE:1",testData.get("MESSAGE.TYPE"));
        PageObject.textinput_Locator("fieldName:MSG.CLASS.NO:1",testData.get("MSG.CLASS.NO"));
        PageObject.textinput_Locator("fieldName:OVR.CARRIER:1",testData.get("OVR.CARRIER"));
        PageObject.textinput_Locator("fieldName:ADDRESSEE:1:1",testData.get("ADDRESSEE"));
        PageObject.textinput_Locator("fieldName:SWIFT.BIC",testData.get("SWIFT.BIC"));
        PageObject.textinput_Locator("fieldName:BPM.REQ.ID",testData.get("BPM.REQ.ID"));
        PageObject.textinput_Locator("fieldName:SEND.ACCUITY",testData.get("SEND.ACCUITY"));
        PageObject.textinput_Locator("radio:tab10:SEND.ACCUITY",testData.get("tab10"));
        PageObject.textinput_Locator("fieldName:ACCUITY.RESP",testData.get("ACCUITY.RESP"));
        PageObject.textinput_Locator("fieldName:ACCUITY.REF",testData.get("ACCUITY.REF"));
        PageObject.textinput_Locator("fieldName:SEND.PSW",testData.get("SEND.PSW"));
        PageObject.textinput_Locator("radio:tab10:SEND.PSW",testData.get("tab10"));
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
//
//        PageObject.commitTxn();
//        PageObject.commitDeal("SIGHTLC");



    }

    @Test(groups = {"IBGImportInputter"}, dataProvider = "USANCELC")
    public void USANCELC(Map<String, String> testData) throws IOException{

        PageObject.menu_Dropdown("Import LC",1);
        PageObject.menu_Link("Usance LC ");
        PageObject.switchToChildWindow();
        driver.manage().window().maximize();
        PageObject.img_Button("New Deal");
        PageObject.switchToChildWindow();
        PageObject.textinput_Locator("fieldName:CURRENCY.MARKET",testData.get("CURRENCY.MARKET"));
        PageObject.textinput_Locator("fieldName:LC.TYPE",testData.get("LC.TYPE"));
        PageObject.textinput_Locator("fieldName:APPLICANT.CUSTNO",testData.get("APPLICANT.CUSTNO"));
        PageObject.textinput_Locator("fieldName:APPLICANT:1",testData.get("APPLICANT"));
        PageObject.textinput_Locator("fieldName:LC.CURRENCY",testData.get("LC.CURRENCY"));
        PageObject.textinput_Locator("fieldName:ACUDOLLAR",testData.get("ACUDOLLAR"));
        PageObject.textinput_Locator("radio:tab1:ACUDOLLAR",testData.get("tab1"));
        PageObject.textinput_Locator("fieldName:LC.AMOUNT",testData.get("LC.AMOUNT"));
        PageObject.textinput_Locator("fieldName:INCO.TERMS.LC",testData.get("INCO.TERMS.LC"));
        PageObject.textinput_Locator("fieldName:PERCENTAGE.CR.AMT",testData.get("PERCENTAGE.CR.AMT"));
        PageObject.textinput_Locator("fieldName:PERCENTAGE.DR.AMT",testData.get("PERCENTAGE.DR.AMT"));
        //PageObject.textinput_Locator("fieldName:ISSUE.DATE",testData.get("ISSUE.DATE"));
        PageObject.textinput_Locator("fieldName:ADVICE.EXPIRY.DATE",testData.get("ADVICE.EXPIRY.DATE"));
        PageObject.textinput_Locator("fieldName:EXPIRY.PLACE",testData.get("EXPIRY.PLACE"));
        PageObject.textinput_Locator("fieldName:EXPIRY.DATE",testData.get("EXPIRY.DATE"));
        PageObject.textinput_Locator("fieldName:PORT.LIM.REF:1",testData.get("PORT.LIM.REF"));
        PageObject.textinput_Locator("fieldName:BENEFICIARY.CUSTNO",testData.get("BENEFICIARY.CUSTNO"));
        PageObject.textinput_Locator("fieldName:BENEFICIARY:1",testData.get("BENEFICIARY"));
        PageObject.textinput_Locator("fieldName:CLIENT.CNTRY:1",testData.get("CLIENT.CNTRY"));
        PageObject.textinput_Locator("fieldName:EXP.NAME",testData.get("EXP.NAME"));
        PageObject.textinput_Locator("fieldName:EXP.ADDRESS:1",testData.get("EXP.ADDRESS"));
        PageObject.textinput_Locator("fieldName:EXP.CNTRY",testData.get("EXP.CNTRY"));
        PageObject.textinput_Locator("fieldName:ADVISING.BK.CUSTNO",testData.get("ADVISING.BK.CUSTNO"));
        PageObject.textinput_Locator("fieldName:ADVISING.BK:1",testData.get("ADVISING.BK"));
        PageObject.textinput_Locator("fieldName:FW.BOOKING.NO",testData.get("FW.BOOKING.NO"));
        PageObject.textinput_Locator("fieldName:FW.BOOKING.DATE",testData.get("FW.BOOKING.DATE"));
        PageObject.textinput_Locator("fieldName:INV.NUMBER:1",testData.get("INV.NUMBER"));
        PageObject.textinput_Locator("fieldName:INV.DATE:1",testData.get("INV.DATE"));
        PageObject.textinput_Locator("fieldName:AVAIL.WITH.CUSTNO",testData.get("AVAIL.WITH.CUSTNO"));
        PageObject.textinput_Locator("fieldName:AVAILABLE.WITH:1",testData.get("AVAILABLE.WITH"));
        //PageObject.textinput_Locator("fieldName:ACCOUNT.OFFICER",testData.get("ACCOUNT.OFFICER"));
        PageObject.textinput_Locator("fieldName:ADV.PAY.PERCENT",testData.get("ADV.PAY.PERCENT"));
        PageObject.textinput_Locator("fieldName:SIGHT.PERCENT",testData.get("SIGHT.PERCENT"));
        PageObject.textinput_Locator("fieldName:USANCE.PERCENT",testData.get("USANCE.PERCENT"));
        PageObject.textinput_Locator("fieldName:NO.OF.DAYS",testData.get("NO.OF.DAYS"));
        PageObject.textinput_Locator("fieldName:EIF.NUMBER:1",testData.get("EIF.NUMBER"));
        PageObject.textinput_Locator("fieldName:EIF.DATE:1",testData.get("EIF.DATE"));
        PageObject.textinput_Locator("fieldName:EIF.AMOUNT:1",testData.get("EIF.AMOUNT"));

        PageObject.form_Tab("Charges and Margin");

        PageObject.textinput_Locator("fieldName:CHARGES.FROM",testData.get("CHARGES.FROM"));
        PageObject.textinput_Locator("radio:tab2:CHARGES.FROM",testData.get("tab2"));
        PageObject.textinput_Locator("fieldName:CHARGES.ACCOUNT",testData.get("CHARGES.ACCOUNT"));
        PageObject.textinput_Locator("fieldName:WAIVE.CHARGES",testData.get("WAIVE.CHARGES"));
        PageObject.textinput_Locator("fieldName:QRATE:1",testData.get("QRATE"));
        PageObject.textinput_Locator("fieldName:CHARGE.CODE:1",testData.get("CHARGE.CODE"));
        PageObject.textinput_Locator("fieldName:CHARGE.ACCT:1",testData.get("CHARGE.ACCT"));
        PageObject.textinput_Locator("fieldName:CHARGE.CURRENCY:1",testData.get("CHARGE.CURRENCY"));
        PageObject.textinput_Locator("fieldName:CHARGE.XCHG:1",testData.get("CHARGE.XCHG"));
        PageObject.textinput_Locator("fieldName:CHARGE.AMOUNT:1",testData.get("CHARGE.AMOUNT"));
        PageObject.textinput_Locator("fieldName:PROVISION",testData.get("PROVISION"));
        PageObject.textinput_Locator("radio:tab2:PROVISION",testData.get("tab2"));
        PageObject.textinput_Locator("fieldName:PROVIS.ACC",testData.get("PROVIS.ACC"));
        PageObject.textinput_Locator("fieldName:PROVIS.PERCENT",testData.get("PROVIS.PERCENT"));
        PageObject.textinput_Locator("fieldName:PROVIS.AMOUNT",testData.get("PROVIS.AMOUNT"));
        PageObject.textinput_Locator("fieldName:CREDIT.PROVIS.ACC",testData.get("CREDIT.PROVIS.ACC"));
        PageObject.textinput_Locator("fieldName:BLOCK.ACCT",testData.get("BLOCK.ACCT"));
        PageObject.textinput_Locator("fieldName:BLK.AMT",testData.get("BLK.AMT"));
        PageObject.textinput_Locator("fieldName:COURIER.REF",testData.get("COURIER.REF"));

        PageObject.form_Tab("Insurance/Forward Cont / Credit Rep Ref Details");

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
        PageObject.textinput_Locator("fieldName:FWD.CONT",testData.get("FWD.CONT"));
        PageObject.textinput_Locator("radio:tab3:FWD.CONT",testData.get("tab3"));
        PageObject.textinput_Locator("fieldName:CREP.REFERENCE",testData.get("CREP.REFERENCE"));

        PageObject.form_Tab("Terms and Conditions");

        PageObject.textinput_Locator("fieldName:ADD.AMT.COVERED:1",testData.get("ADD.AMT.COVERED"));
        PageObject.textinput_Locator("fieldName:SHIP.DESPATCH",testData.get("SHIP.DESPATCH"));
        PageObject.textinput_Locator("fieldName:OTHER.DESPATCH.DET",testData.get("OTHER.DESPATCH.DET"));
        PageObject.textinput_Locator("fieldName:TRANSPORTATION",testData.get("TRANSPORTATION"));
        PageObject.textinput_Locator("fieldName:FINAL.DESTINATION",testData.get("FINAL.DESTINATION"));
        PageObject.textinput_Locator("fieldName:LATEST.SHIPMENT",testData.get("LATEST.SHIPMENT"));
        PageObject.textinput_Locator("fieldName:SHIPMENT.PERIOD:1",testData.get("SHIPMENT.PERIOD"));
        PageObject.textinput_Locator("fieldName:CONT.OF.ORIGIN:1",testData.get("CONT.OF.ORIGIN"));
        PageObject.textinput_Locator("fieldName:DOCUMENT.CODE:1",testData.get("DOCUMENT.CODE"));
        PageObject.textinput_Locator("fieldName:APPLICANT.BANK:1",testData.get("APPLICANT.BANK"));
        PageObject.textinput_Locator("fieldName:ADVISE.THRU.CUSTNO",testData.get("ADVISE.THRU.CUSTNO"));
        PageObject.textinput_Locator("fieldName:ADVISE.THRU:1",testData.get("ADVISE.THRU"));
        PageObject.textinput_Locator("fieldName:THIRD.PARTY.CUSTNO",testData.get("THIRD.PARTY.CUSTNO"));
        PageObject.textinput_Locator("fieldName:THIRD.PARTY:1",testData.get("THIRD.PARTY"));
        PageObject.textinput_Locator("fieldName:DRAFTS.AT:1",testData.get("DRAFTS.AT"));
        PageObject.textinput_Locator("fieldName:DRAWEE.CUST.NO",testData.get("DRAWEE.CUST.NO"));
        PageObject.textinput_Locator("fieldName:DRAWEE:1",testData.get("DRAWEE"));
        PageObject.textinput_Locator("fieldName:MIXED.PAYMENT:1",testData.get("MIXED.PAYMENT"));
        PageObject.textinput_Locator("fieldName:DEFERRED.PAY:1",testData.get("DEFERRED.PAY"));
        PageObject.textarea_Locator("fieldName:NARRATIVE.CHRGS",testData.get(""));
        PageObject.textinput_Locator("fieldName:CONFIRM.INST",testData.get("CONFIRM.INST"));
        PageObject.textinput_Locator("radio:tab4:CONFIRM.INST",testData.get("tab4"));
        PageObject.textarea_Locator("fieldName:INSTRUCTIONS",testData.get(""));
        PageObject.textinput_Locator("fieldName:BANK.TO.BANK:1",testData.get("BANK.TO.BANK"));

        PageObject.form_Tab("SBP Reports");

        PageObject.textinput_Locator("fieldName:HS.CODE:1",testData.get("HS.CODE"));
        PageObject.textinput_Locator("fieldName:HS.QUANTITY:1",testData.get("HS.QUANTITY"));
        PageObject.textinput_Locator("fieldName:UNIT.PRICE:1",testData.get("UNIT.PRICE"));
        PageObject.textinput_Locator("fieldName:BAF.DESC.GOODS:1",testData.get("BAF.DESC.GOODS"));
        PageObject.textinput_Locator("fieldName:HS.SAMPLE.VALUE:1",testData.get("HS.SAMPLE.VALUE"));
        PageObject.textinput_Locator("fieldName:CONT.OF.ORIGIN:1",testData.get("CONT.OF.ORIGIN"));
        PageObject.textinput_Locator("fieldName:BAF.HS.BPRICE:1",testData.get("BAF.HS.BPRICE"));
        PageObject.textinput_Locator("fieldName:LC.UNDER",testData.get("LC.UNDER"));
        PageObject.textinput_Locator("radio:tab5:LC.UNDER",testData.get("tab5"));
        PageObject.textinput_Locator("fieldName:AGREE.UNDER",testData.get("AGREE.UNDER"));
        PageObject.textinput_Locator("radio:tab5:AGREE.UNDER",testData.get("tab5"));
        PageObject.textinput_Locator("fieldName:LC.COUNTRY",testData.get("LC.COUNTRY"));
        PageObject.textinput_Locator("fieldName:INS.PPR.AMT",testData.get("INS.PPR.AMT"));
        PageObject.textinput_Locator("fieldName:FREIGHT.CHARGE",testData.get("FREIGHT.CHARGE"));
        PageObject.textinput_Locator("fieldName:FOB.VALUE",testData.get("FOB.VALUE"));
        PageObject.textinput_Locator("fieldName:INTEND.DATE",testData.get("INTEND.DATE"));
        PageObject.textinput_Locator("fieldName:REMARKS",testData.get("REMARKS"));
        PageObject.textinput_Locator("fieldName:DR.SHIP.TIME:1",testData.get("DR.SHIP.TIME"));
        PageObject.textinput_Locator("fieldName:LATEST.SHIPMENT",testData.get("LATEST.SHIPMENT"));

        PageObject.form_Tab("Payment/Revol Details");

        PageObject.textinput_Locator("fieldName:PAYMENT.PCT:1",testData.get("PAYMENT.PCT"));
        PageObject.textinput_Locator("fieldName:PAY.PORTION:1",testData.get("PAY.PORTION"));
        PageObject.textinput_Locator("fieldName:ACPT.TM.BAND:1",testData.get("ACPT.TM.BAND"));
        PageObject.textinput_Locator("fieldName:ADD.COVERED.AMT:1",testData.get("ADD.COVERED.AMT"));
        PageObject.textinput_Locator("fieldName:PORT.LIM.REF:1",testData.get("PORT.LIM.REF"));
        PageObject.textinput_Locator("fieldName:T.CHARGE.AMT",testData.get("T.CHARGE.AMT"));
        PageObject.textinput_Locator("fieldName:REVOLVING.TYPE",testData.get("REVOLVING.TYPE"));
        PageObject.textinput_Locator("radio:tab6:REVOLVING.TYPE",testData.get("tab6"));
        PageObject.textinput_Locator("fieldName:NO.OF.REVOLVING",testData.get("NO.OF.REVOLVING"));
        PageObject.textinput_Locator("fieldName:REVOLVING.FQY",testData.get("REVOLVING.FQY"));

        PageObject.form_Tab("MT 700/701");

        PageObject.textinput_Locator("fieldName:PRE.ADV.REF",testData.get("PRE.ADV.REF"));
        PageObject.textinput_Locator("fieldName:ISSUE.DATE",testData.get("ISSUE.DATE"));
        PageObject.textinput_Locator("fieldName:APPL.RULE.DESC",testData.get("APPL.RULE.DESC"));
        PageObject.textinput_Locator("fieldName:ADVICE.EXPIRY.DATE",testData.get("ADVICE.EXPIRY.DATE"));
        PageObject.textinput_Locator("fieldName:EXPIRY.PLACE",testData.get("EXPIRY.PLACE"));
        PageObject.textinput_Locator("fieldName:APPLICANT.BANK:1",testData.get("APPLICANT.BANK"));
        PageObject.textinput_Locator("fieldName:APPLICANT:1",testData.get("APPLICANT"));
        PageObject.textinput_Locator("fieldName:BENEFICIARY:1",testData.get("BENEFICIARY"));
        PageObject.textinput_Locator("fieldName:LC.CURRENCY",testData.get("LC.CURRENCY"));
        PageObject.textinput_Locator("fieldName:LC.AMOUNT",testData.get("LC.AMOUNT"));
        PageObject.textinput_Locator("fieldName:PERCENTAGE.CR.AMT",testData.get("PERCENTAGE.CR.AMT"));
        PageObject.textinput_Locator("fieldName:PERCENTAGE.DR.AMT",testData.get("PERCENTAGE.DR.AMT"));
        PageObject.textinput_Locator("fieldName:MAXIMUM.CR.AMT",testData.get("MAXIMUM.CR.AMT"));
        PageObject.textinput_Locator("fieldName:ADD.AMT.COVERED:1",testData.get("ADD.AMT.COVERED"));
        PageObject.textinput_Locator("fieldName:AVAIL.WITH.CUSTNO",testData.get("AVAIL.WITH.CUSTNO"));
        PageObject.textinput_Locator("fieldName:AVAILABLE.WITH:1",testData.get("AVAILABLE.WITH"));
        PageObject.textinput_Locator("fieldName:DRAFTS.AT:1",testData.get("DRAFTS.AT"));
        PageObject.textinput_Locator("fieldName:DRAWEE.CUST.NO",testData.get("DRAWEE.CUST.NO"));
        PageObject.textinput_Locator("fieldName:DRAWEE:1",testData.get("DRAWEE"));
        PageObject.textinput_Locator("fieldName:MIXED.PAYMENT:1",testData.get("MIXED.PAYMENT"));
        PageObject.textinput_Locator("fieldName:DEFERRED.PAY:1",testData.get("DEFERRED.PAY"));
        PageObject.textinput_Locator("fieldName:SHIP.DESPATCH",testData.get("SHIP.DESPATCH"));
        PageObject.textinput_Locator("fieldName:OTHER.DESPATCH.DET",testData.get("OTHER.DESPATCH.DET"));
        PageObject.textinput_Locator("fieldName:TRANSPORTATION",testData.get("TRANSPORTATION"));
        PageObject.textinput_Locator("fieldName:FINAL.DESTINATION",testData.get("FINAL.DESTINATION"));
        PageObject.textinput_Locator("fieldName:LATEST.SHIPMENT",testData.get("LATEST.SHIPMENT"));
        PageObject.textinput_Locator("fieldName:SHIPMENT.PERIOD:1",testData.get("SHIPMENT.PERIOD"));
        PageObject.textinput_Locator("fieldName:DOCUMENT.CODE:1",testData.get("DOCUMENT.CODE"));
        PageObject.textarea_Locator("fieldName:NARRATIVE.CHRGS",testData.get(""));
        PageObject.textinput_Locator("fieldName:PRES.DAY.PERIOD",testData.get("PRES.DAY.PERIOD"));
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

        PageObject.form_Tab("MT 740");

        PageObject.textinput_Locator("fieldName:THIRD.PARTY.CUSTNO",testData.get("THIRD.PARTY.CUSTNO"));
        PageObject.textinput_Locator("fieldName:THIRD.PARTY:1",testData.get("THIRD.PARTY"));
        PageObject.textinput_Locator("fieldName:CONFIRM.INST",testData.get("CONFIRM.INST"));
        PageObject.textinput_Locator("radio:tab8:CONFIRM.INST",testData.get("tab8"));
        PageObject.textinput_Locator("fieldName:SEND.MT740",testData.get("SEND.MT740"));
        PageObject.textinput_Locator("radio:tab8:SEND.MT740",testData.get("tab8"));
        PageObject.textinput_Locator("fieldName:THIRD.PARTY.ACC",testData.get("THIRD.PARTY.ACC"));
        PageObject.textinput_Locator("fieldName:ADVICE.EXPIRY.DATE",testData.get("ADVICE.EXPIRY.DATE"));
        PageObject.textinput_Locator("fieldName:EXPIRY.PLACE",testData.get("EXPIRY.PLACE"));
        PageObject.textinput_Locator("fieldName:NEG.WITH.BANK:1",testData.get("NEG.WITH.BANK"));
        PageObject.textinput_Locator("fieldName:BENEFICIARY.CUSTNO",testData.get("BENEFICIARY.CUSTNO"));
        PageObject.textinput_Locator("fieldName:BENEFICIARY:1",testData.get("BENEFICIARY"));
        PageObject.textinput_Locator("fieldName:LC.CURRENCY",testData.get("LC.CURRENCY"));
        PageObject.textinput_Locator("fieldName:LC.AMOUNT",testData.get("LC.AMOUNT"));
        PageObject.textinput_Locator("fieldName:PERCENTAGE.CR.AMT",testData.get("PERCENTAGE.CR.AMT"));
        PageObject.textinput_Locator("fieldName:PERCENTAGE.DR.AMT",testData.get("PERCENTAGE.DR.AMT"));
        PageObject.textinput_Locator("fieldName:ADD.AMT.COVERED:1",testData.get("ADD.AMT.COVERED"));
        PageObject.textinput_Locator("fieldName:APPL.RULE.MT740",testData.get("APPL.RULE.MT740"));
        PageObject.textinput_Locator("radio:tab8:APPL.RULE.MT740",testData.get("tab8"));
        PageObject.textinput_Locator("fieldName:AVAIL.WITH.CUSTNO",testData.get("AVAIL.WITH.CUSTNO"));
        PageObject.textinput_Locator("fieldName:AVAILABLE.WITH:1",testData.get("AVAILABLE.WITH"));
        PageObject.textinput_Locator("fieldName:DRAFTS.AT:1",testData.get("DRAFTS.AT"));
        PageObject.textinput_Locator("fieldName:DRAWEE.CUST.NO",testData.get("DRAWEE.CUST.NO"));
        PageObject.textinput_Locator("fieldName:DRAWEE:1",testData.get("DRAWEE"));
        PageObject.textinput_Locator("fieldName:MIXED.PAYMENT:1",testData.get("MIXED.PAYMENT"));
        PageObject.textinput_Locator("fieldName:DEFERRED.PAY:1",testData.get("DEFERRED.PAY"));
        PageObject.textinput_Locator("fieldName:REIMB.BK.CHGS",testData.get("REIMB.BK.CHGS"));
        PageObject.textinput_Locator("radio:tab8:REIMB.BK.CHGS",testData.get("tab8"));
        PageObject.textinput_Locator("fieldName:CHARGES.DET:1",testData.get("CHARGES.DET"));
        PageObject.textinput_Locator("fieldName:BANK.TO.BK740:1",testData.get("BANK.TO.BK740"));


        PageObject.form_Tab("Delivery Info");

        PageObject.textinput_Locator("fieldName:MESSAGE.TYPE:1",testData.get("MESSAGE.TYPE"));
        PageObject.textinput_Locator("fieldName:MSG.CLASS.NO:1",testData.get("MSG.CLASS.NO"));
        PageObject.textinput_Locator("fieldName:OVR.CARRIER:1",testData.get("OVR.CARRIER"));
        PageObject.textinput_Locator("fieldName:ADDRESSEE:1:1",testData.get("ADDRESSEE"));
        PageObject.textinput_Locator("fieldName:SWIFT.BIC",testData.get("SWIFT.BIC"));
        //PageObject.textinput_Locator("fieldName:DELIVERY.REF:1",testData.get("DELIVERY.REF"));
        PageObject.textinput_Locator("fieldName:BPM.REQ.ID",testData.get("BPM.REQ.ID"));
        PageObject.textinput_Locator("fieldName:SEND.ACCUITY",testData.get("SEND.ACCUITY"));
        PageObject.textinput_Locator("radio:tab9:SEND.ACCUITY",testData.get("tab9"));
        PageObject.textinput_Locator("fieldName:ACCUITY.RESP",testData.get("ACCUITY.RESP"));
        PageObject.textinput_Locator("fieldName:ACCUITY.REF",testData.get("ACCUITY.REF"));
        PageObject.textinput_Locator("fieldName:SEND.PSW",testData.get("SEND.PSW"));
        PageObject.textinput_Locator("radio:tab9:SEND.PSW",testData.get("tab9"));
        PageObject.textinput_Locator("fieldName:PSW.REFERENCE:1",testData.get("PSW.REFERENCE"));

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

//        PageObject.commitTxn();
//        PageObject.form_Tab("USANCELC");

    }
    private static final String FILE_PATH = "path/to/your/excel/file.xlsx"; // Update with your file path
    @DataProvider(name = "SIGHTLC")
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

    @DataProvider(name = "USANCELC")
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
