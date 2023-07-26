package Test.Scripts.Conventional.Guarantee;

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

public class MaintainanceOfGuarantee extends BaseClass {

    @Test(groups = {"GuaranteeInputter"}, dataProvider = "ExternalAmendToGuarantee")
    public void ExternalAmendToGuarantee(Map<String, String> testData) throws IOException{


        PageObject.menu_Dropdown("Maintenance of Guarantees");
        PageObject.menu_Link("Amendment of Guarantee  ( External ) ");
        PageObject.switchToChildWindow();
        driver.manage().window().maximize();
        PageObject.img_Button("New Deal");
        PageObject.switchToChildWindow();
        PageObject.textinput_Locator("fieldName:BAF.SWIFT.REF",testData.get("BAF.SWIFT.REF"));
        PageObject.textinput_Locator("fieldName:CUSTOMER",testData.get("CUSTOMER"));
        PageObject.textinput_Locator("fieldName:CUSTOMER.TYPE",testData.get("CUSTOMER.TYPE"));
        PageObject.textinput_Locator("fieldName:CATEGORY",testData.get("CATEGORY"));
        PageObject.textinput_Locator("fieldName:LIMIT.REFERENCE",testData.get("LIMIT.REFERENCE"));
        PageObject.textinput_Locator("fieldName:COUNTRY.RISK",testData.get("COUNTRY.RISK"));
        PageObject.textinput_Locator("fieldName:CURRENCY",testData.get("CURRENCY"));
        PageObject.textinput_Locator("fieldName:PRINCIPAL.AMOUNT",testData.get("PRINCIPAL.AMOUNT"));
        PageObject.textinput_Locator("fieldName:VALUE.DATE",testData.get("VALUE.DATE"));
        PageObject.textinput_Locator("fieldName:ADVICE.EXPIRY.DATE",testData.get("ADVICE.EXPIRY.DATE"));
        PageObject.textinput_Locator("fieldName:MATURITY.DATE",testData.get("MATURITY.DATE"));
        PageObject.textinput_Locator("fieldName:EXP.DATE",testData.get("EXP.DATE"));
        PageObject.textinput_Locator("fieldName:COMMCHG.UPTO",testData.get("COMMCHG.UPTO"));
        PageObject.textinput_Locator("fieldName:BENEF.CUST.1:1",testData.get("BENEF.CUST.1"));
        PageObject.textinput_Locator("fieldName:BEN.ADDRESS:1",testData.get("BEN.ADDRESS"));
        PageObject.textinput_Locator("fieldName:BENEFICIERY.TYP",testData.get("BENEFICIERY.TYP"));
        PageObject.textinput_Locator("fieldName:REFERENCE.2",testData.get("REFERENCE.2"));
        PageObject.textinput_Locator("fieldName:AUTO.EXPIRY",testData.get("AUTO.EXPIRY"));
        PageObject.textinput_Locator("radio:tab1:AUTO.EXPIRY",testData.get("tab1"));
        PageObject.textinput_Locator("fieldName:PRIN.MOVEMENT:1",testData.get("PRIN.MOVEMENT"));
        PageObject.textinput_Locator("fieldName:MOVEMENT.DATE:1",testData.get("MOVEMENT.DATE"));
        PageObject.textinput_Locator("fieldName:PROV.AMT:1",testData.get("PROV.AMT"));
        PageObject.textinput_Locator("fieldName:REL.AMT:1",testData.get("REL.AMT"));
        PageObject.textinput_Locator("fieldName:REFERENCE.1",testData.get("REFERENCE.1"));
        PageObject.textinput_Locator("fieldName:TEXT.2:1",testData.get("TEXT.2"));

        PageObject.form_Tab("Charges / Commission");

        PageObject.textinput_Locator("fieldName:CSN.CRATE",testData.get("CSN.CRATE"));
        PageObject.textinput_Locator("fieldName:QTR.COMM",testData.get("QTR.COMM"));
        PageObject.textinput_Locator("fieldName:CHARGE.DATE:1",testData.get("CHARGE.DATE"));
        PageObject.textinput_Locator("fieldName:CHARGE.CURR:1",testData.get("CHARGE.CURR"));
        PageObject.textinput_Locator("fieldName:CHARGE.ACCOUNT:1",testData.get("CHARGE.ACCOUNT"));
        PageObject.textinput_Locator("fieldName:CHARGE.CODE:1:1",testData.get("CHARGE.CODE"));
        PageObject.textinput_Locator("fieldName:CHARGE.AMT:1:1",testData.get("CHARGE.AMT"));
        PageObject.textinput_Locator("fieldName:COMMCHG.UPTO",testData.get("COMMCHG.UPTO"));
        PageObject.textinput_Locator("fieldName:TEXT.1:1",testData.get("TEXT.1"));
        PageObject.textinput_Locator("fieldName:DEFERRED.COMM",testData.get("DEFERRED.COMM"));
        PageObject.textinput_Locator("radio:tab2:DEFERRED.COMM",testData.get("tab2"));
        PageObject.textinput_Locator("fieldName:CSN.PAYMENT.TYPE",testData.get("CSN.PAYMENT.TYPE"));
        PageObject.textinput_Locator("radio:tab2:CSN.PAYMENT.TYPE",testData.get("tab2"));
        PageObject.textinput_Locator("fieldName:INTEREST.BASIS",testData.get("INTEREST.BASIS"));
        PageObject.textinput_Locator("fieldName:FIXED.AMOUNT",testData.get("FIXED.AMOUNT"));
        PageObject.textinput_Locator("radio:tab2:FIXED.AMOUNT",testData.get("tab2"));
        PageObject.textinput_Locator("fieldName:CSN.DATE:1",testData.get("CSN.DATE"));
        PageObject.textinput_Locator("fieldName:CSN.AMOUNT:1",testData.get("CSN.AMOUNT"));
        PageObject.textinput_Locator("fieldName:CSN.ACCOUNT:1",testData.get("CSN.ACCOUNT"));
        PageObject.textinput_Locator("fieldName:TAX.KEY",testData.get("TAX.KEY"));

        PageObject.form_Tab("Cash Margin");

        PageObject.textinput_Locator("fieldName:LIMIT.UPD.REQD",testData.get("LIMIT.UPD.REQD"));
        PageObject.textinput_Locator("radio:tab3:LIMIT.UPD.REQD",testData.get("tab3"));
        PageObject.textinput_Locator("fieldName:INCLUDE.PROVISION",testData.get("INCLUDE.PROVISION"));
        PageObject.textinput_Locator("radio:tab3:INCLUDE.PROVISION",testData.get("tab3"));
        PageObject.textinput_Locator("fieldName:PROVISION",testData.get("PROVISION"));
        PageObject.textinput_Locator("radio:tab3:PROVISION",testData.get("tab3"));
        PageObject.textinput_Locator("fieldName:PROV.PERCENT",testData.get("PROV.PERCENT"));
        PageObject.textinput_Locator("fieldName:PROV.AMOUNT",testData.get("PROV.AMOUNT"));
        PageObject.textinput_Locator("fieldName:PROV.DR.ACCOUNT",testData.get("PROV.DR.ACCOUNT"));
        PageObject.textinput_Locator("fieldName:PROV.CR.ACCOUNT",testData.get("PROV.CR.ACCOUNT"));
        PageObject.textinput_Locator("fieldName:PROV.REL.ACCOUNT",testData.get("PROV.REL.ACCOUNT"));
        PageObject.textinput_Locator("fieldName:PROV.REL.DATE",testData.get("PROV.REL.DATE"));

        PageObject.form_Tab("MT 767");

        PageObject.textinput_Locator("fieldName:CB.LIMIT.UPDATE",testData.get("CB.LIMIT.UPDATE"));
        PageObject.textinput_Locator("radio:tab4:CB.LIMIT.UPDATE",testData.get("tab4"));
        PageObject.textinput_Locator("fieldName:RECEIVING.BANK",testData.get("RECEIVING.BANK"));
        PageObject.textinput_Locator("fieldName:BANK.ADDRESS:1",testData.get("BANK.ADDRESS"));
        PageObject.textinput_Locator("fieldName:REFERENCE.1",testData.get("REFERENCE.1"));
        PageObject.textinput_Locator("fieldName:FURTHER.ID",testData.get("FURTHER.ID"));
        PageObject.textinput_Locator("radio:tab4:FURTHER.ID",testData.get("tab4"));
        PageObject.textinput_Locator("fieldName:AMENDMENT.NO",testData.get("AMENDMENT.NO"));
        PageObject.textinput_Locator("fieldName:DEAL.DATE",testData.get("DEAL.DATE"));
        PageObject.textinput_Locator("fieldName:NARRATIVE",testData.get("NARRATIVE"));

        PageObject.form_Tab("MT 768");

        PageObject.textinput_Locator("fieldName:RECEIVING.BANK",testData.get("RECEIVING.BANK"));
        PageObject.textinput_Locator("fieldName:BANK.ADDRESS:1",testData.get("BANK.ADDRESS"));
        PageObject.textinput_Locator("fieldName:REFERENCE.1",testData.get("REFERENCE.1"));
        PageObject.textinput_Locator("fieldName:SETTLE.ACCOUNT",testData.get("SETTLE.ACCOUNT"));
        PageObject.textinput_Locator("fieldName:AMT.OF.CHGS",testData.get("AMT.OF.CHGS"));
        PageObject.textinput_Locator("fieldName:ACCT.WITH.BANK:1",testData.get("ACCT.WITH.BANK"));
        PageObject.textinput_Locator("fieldName:CHG.DETAILS:1",testData.get("CHG.DETAILS"));
        PageObject.textinput_Locator("fieldName:FURTHER.ID",testData.get("FURTHER.ID"));
        PageObject.textinput_Locator("radio:tab5:FURTHER.ID",testData.get("tab5"));

        PageObject.form_Tab("Delivery Info");

        PageObject.textinput_Locator("fieldName:ADVICE.REQD",testData.get("ADVICE.REQD"));
        PageObject.textinput_Locator("radio:tab6:ADVICE.REQD",testData.get("tab6"));
        PageObject.textinput_Locator("fieldName:ACTIVITY.CODE",testData.get("ACTIVITY.CODE"));
        PageObject.textinput_Locator("fieldName:MSG.NO:1",testData.get("MSG.NO"));
        PageObject.textinput_Locator("fieldName:MSG.CLASS:1",testData.get("MSG.CLASS"));
        PageObject.textinput_Locator("fieldName:OVR.CARRIER:1",testData.get("OVR.CARRIER"));
        PageObject.textinput_Locator("fieldName:OVR.ADDRESS:1:1",testData.get("OVR.ADDRESS"));
        PageObject.textinput_Locator("fieldName:SWIFT.BIC",testData.get("SWIFT.BIC"));
        PageObject.textinput_Locator("fieldName:BPM.REQ.ID",testData.get("BPM.REQ.ID"));
        PageObject.textinput_Locator("fieldName:SEND.ACCUITY",testData.get("SEND.ACCUITY"));
        PageObject.textinput_Locator("radio:tab6:SEND.ACCUITY",testData.get("tab6"));
        PageObject.textinput_Locator("fieldName:ACCUITY.RESP",testData.get("ACCUITY.RESP"));
        PageObject.textinput_Locator("fieldName:ACCUITY.REF",testData.get("ACCUITY.REF"));

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


        //PageObject.img_Button("Validate a deal");

    }

    @Test(groups = {"GuaranteeInputter"}, dataProvider = "ExternalAmendToSBLCGuarantee")
    public void ExternalAmendToSBLCGuarantee(Map<String, String> testData) throws IOException{

        PageObject.menu_Dropdown("Maintenance of Guarantees");
        PageObject.menu_Link("Amendment of SBLC Guarantee ( External ) ");
        PageObject.switchToChildWindow();
        driver.manage().window().maximize();
        PageObject.img_Button("New Deal");
        PageObject.switchToChildWindow();
        PageObject.textinput_Locator("fieldName:BAF.SWIFT.REF",testData.get("BAF.SWIFT.REF"));
        PageObject.textinput_Locator("fieldName:CUSTOMER",testData.get("CUSTOMER"));
        PageObject.textinput_Locator("fieldName:CUSTOMER.TYPE",testData.get("CUSTOMER.TYPE"));
        PageObject.textinput_Locator("fieldName:CATEGORY",testData.get("CATEGORY"));
        PageObject.textinput_Locator("fieldName:LIMIT.REFERENCE",testData.get("LIMIT.REFERENCE"));
        PageObject.textinput_Locator("fieldName:COUNTRY.RISK",testData.get("COUNTRY.RISK"));
        PageObject.textinput_Locator("fieldName:CURRENCY",testData.get("CURRENCY"));
        PageObject.textinput_Locator("fieldName:PRINCIPAL.AMOUNT",testData.get("PRINCIPAL.AMOUNT"));
        PageObject.textinput_Locator("fieldName:VALUE.DATE",testData.get("VALUE.DATE"));
        PageObject.textinput_Locator("fieldName:ADVICE.EXPIRY.DATE",testData.get("ADVICE.EXPIRY.DATE"));
        PageObject.textinput_Locator("fieldName:MATURITY.DATE",testData.get("MATURITY.DATE"));
        PageObject.textinput_Locator("fieldName:EXP.DATE",testData.get("EXP.DATE"));
        PageObject.textinput_Locator("fieldName:COMMCHG.UPTO",testData.get("COMMCHG.UPTO"));
        PageObject.textinput_Locator("fieldName:BENEF.CUST.1:1",testData.get("BENEF.CUST.1"));
        PageObject.textinput_Locator("fieldName:BEN.ADDRESS:1",testData.get("BEN.ADDRESS"));
        PageObject.textinput_Locator("fieldName:BENEFICIERY.TYP",testData.get("BENEFICIERY.TYP"));
        PageObject.textinput_Locator("fieldName:REFERENCE.2",testData.get("REFERENCE.2"));
        PageObject.textinput_Locator("fieldName:AUTO.EXPIRY",testData.get("AUTO.EXPIRY"));
        PageObject.textinput_Locator("radio:tab1:AUTO.EXPIRY",testData.get("tab1"));
        PageObject.textinput_Locator("fieldName:PRIN.MOVEMENT:1",testData.get("PRIN.MOVEMENT"));
        PageObject.textinput_Locator("fieldName:MOVEMENT.DATE:1",testData.get("MOVEMENT.DATE"));
        PageObject.textinput_Locator("fieldName:PROV.AMT:1",testData.get("PROV.AMT"));
        PageObject.textinput_Locator("fieldName:REL.AMT:1",testData.get("REL.AMT"));
        PageObject.textinput_Locator("fieldName:REFERENCE.1",testData.get("REFERENCE.1"));
        PageObject.textinput_Locator("fieldName:TEXT.2:1",testData.get("TEXT.2"));

        PageObject.form_Tab("Charges / Commission");

        PageObject.textinput_Locator("fieldName:CSN.CRATE",testData.get("CSN.CRATE"));
        PageObject.textinput_Locator("fieldName:QTR.COMM",testData.get("QTR.COMM"));
        PageObject.textinput_Locator("fieldName:CHARGE.DATE:1",testData.get("CHARGE.DATE"));
        PageObject.textinput_Locator("fieldName:CHARGE.CURR:1",testData.get("CHARGE.CURR"));
        PageObject.textinput_Locator("fieldName:CHARGE.ACCOUNT:1",testData.get("CHARGE.ACCOUNT"));
        PageObject.textinput_Locator("fieldName:CHARGE.CODE:1:1",testData.get("CHARGE.CODE"));
        PageObject.textinput_Locator("fieldName:CHARGE.AMT:1:1",testData.get("CHARGE.AMT"));
        PageObject.textinput_Locator("fieldName:COMMCHG.UPTO",testData.get("COMMCHG.UPTO"));
        PageObject.textinput_Locator("fieldName:TEXT.1:1",testData.get("TEXT.1"));
        PageObject.textinput_Locator("fieldName:DEFERRED.COMM",testData.get("DEFERRED.COMM"));
        PageObject.textinput_Locator("radio:tab2:DEFERRED.COMM",testData.get("tab2"));
        PageObject.textinput_Locator("fieldName:CSN.PAYMENT.TYPE",testData.get("CSN.PAYMENT.TYPE"));
        PageObject.textinput_Locator("radio:tab2:CSN.PAYMENT.TYPE",testData.get("tab2"));
        PageObject.textinput_Locator("fieldName:INTEREST.BASIS",testData.get("INTEREST.BASIS"));
        PageObject.textinput_Locator("fieldName:FIXED.AMOUNT",testData.get("FIXED.AMOUNT"));
        PageObject.textinput_Locator("radio:tab2:FIXED.AMOUNT",testData.get("tab2"));
        PageObject.textinput_Locator("fieldName:CSN.DATE:1",testData.get("CSN.DATE"));
        PageObject.textinput_Locator("fieldName:CSN.AMOUNT:1",testData.get("CSN.AMOUNT"));
        PageObject.textinput_Locator("fieldName:CSN.ACCOUNT:1",testData.get("CSN.ACCOUNT"));
        PageObject.textinput_Locator("fieldName:TAX.KEY",testData.get("TAX.KEY"));

        PageObject.form_Tab("Cash Margin");

        PageObject.textinput_Locator("fieldName:LIMIT.UPD.REQD",testData.get("LIMIT.UPD.REQD"));
        PageObject.textinput_Locator("radio:tab3:LIMIT.UPD.REQD",testData.get("tab3"));
        PageObject.textinput_Locator("fieldName:INCLUDE.PROVISION",testData.get("INCLUDE.PROVISION"));
        PageObject.textinput_Locator("radio:tab3:INCLUDE.PROVISION",testData.get("tab3"));
        PageObject.textinput_Locator("fieldName:PROVISION",testData.get("PROVISION"));
        PageObject.textinput_Locator("radio:tab3:PROVISION",testData.get("tab3"));
        PageObject.textinput_Locator("fieldName:PROV.PERCENT",testData.get("PROV.PERCENT"));
        PageObject.textinput_Locator("fieldName:PROV.AMOUNT",testData.get("PROV.AMOUNT"));
        PageObject.textinput_Locator("fieldName:PROV.DR.ACCOUNT",testData.get("PROV.DR.ACCOUNT"));
        PageObject.textinput_Locator("fieldName:PROV.CR.ACCOUNT",testData.get("PROV.CR.ACCOUNT"));
        PageObject.textinput_Locator("fieldName:PROV.REL.ACCOUNT",testData.get("PROV.REL.ACCOUNT"));
        PageObject.textinput_Locator("fieldName:PROV.REL.DATE",testData.get("PROV.REL.DATE"));

        PageObject.form_Tab("MT 767");

        PageObject.textinput_Locator("fieldName:CB.LIMIT.UPDATE",testData.get("CB.LIMIT.UPDATE"));
        PageObject.textinput_Locator("radio:tab4:CB.LIMIT.UPDATE",testData.get("tab4"));
        PageObject.textinput_Locator("fieldName:RECEIVING.BANK",testData.get("RECEIVING.BANK"));
        PageObject.textinput_Locator("fieldName:BANK.ADDRESS:1",testData.get("BANK.ADDRESS"));
        PageObject.textinput_Locator("fieldName:REFERENCE.1",testData.get("REFERENCE.1"));
        PageObject.textinput_Locator("fieldName:FURTHER.ID",testData.get("FURTHER.ID"));
        PageObject.textinput_Locator("radio:tab4:FURTHER.ID",testData.get("tab4"));
        PageObject.textinput_Locator("fieldName:AMENDMENT.NO",testData.get("AMENDMENT.NO"));
        PageObject.textinput_Locator("fieldName:DEAL.DATE",testData.get("DEAL.DATE"));
        PageObject.textinput_Locator("fieldName:NARRATIVE",testData.get("NARRATIVE"));

        PageObject.form_Tab("MT 768");

        PageObject.textinput_Locator("fieldName:RECEIVING.BANK",testData.get("RECEIVING.BANK"));
        PageObject.textinput_Locator("fieldName:BANK.ADDRESS:1",testData.get("BANK.ADDRESS"));
        PageObject.textinput_Locator("fieldName:REFERENCE.1",testData.get("REFERENCE.1"));
        PageObject.textinput_Locator("fieldName:SETTLE.ACCOUNT",testData.get("SETTLE.ACCOUNT"));
        PageObject.textinput_Locator("fieldName:AMT.OF.CHGS",testData.get("AMT.OF.CHGS"));
        PageObject.textinput_Locator("fieldName:ACCT.WITH.BANK:1",testData.get("ACCT.WITH.BANK"));
        PageObject.textinput_Locator("fieldName:CHG.DETAILS:1",testData.get("CHG.DETAILS"));
        PageObject.textinput_Locator("fieldName:FURTHER.ID",testData.get("FURTHER.ID"));
        PageObject.textinput_Locator("radio:tab5:FURTHER.ID",testData.get("tab5"));

        PageObject.form_Tab("Delivery Info");

        PageObject.textinput_Locator("fieldName:ADVICE.REQD",testData.get("ADVICE.REQD"));
        PageObject.textinput_Locator("radio:tab6:ADVICE.REQD",testData.get("tab6"));
        PageObject.textinput_Locator("fieldName:ACTIVITY.CODE",testData.get("ACTIVITY.CODE"));
        PageObject.textinput_Locator("fieldName:MSG.NO:1",testData.get("MSG.NO"));
        PageObject.textinput_Locator("fieldName:MSG.CLASS:1",testData.get("MSG.CLASS"));
        PageObject.textinput_Locator("fieldName:OVR.CARRIER:1",testData.get("OVR.CARRIER"));
        PageObject.textinput_Locator("fieldName:OVR.ADDRESS:1:1",testData.get("OVR.ADDRESS"));
        PageObject.textinput_Locator("fieldName:SWIFT.BIC",testData.get("SWIFT.BIC"));
        PageObject.textinput_Locator("fieldName:BPM.REQ.ID",testData.get("BPM.REQ.ID"));
        PageObject.textinput_Locator("fieldName:SEND.ACCUITY",testData.get("SEND.ACCUITY"));
        PageObject.textinput_Locator("radio:tab6:SEND.ACCUITY",testData.get("tab6"));
        PageObject.textinput_Locator("fieldName:ACCUITY.RESP",testData.get("ACCUITY.RESP"));
        PageObject.textinput_Locator("fieldName:ACCUITY.REF",testData.get("ACCUITY.REF"));

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


        //PageObject.img_Button("Validate a deal");

    }

    @Test(groups = {"GuaranteeInputter"}, dataProvider = "InternalAmendToGuarantee")
    public void InternalAmendToGuarantee(Map<String, String> testData) throws IOException{

        PageObject.menu_Dropdown("Maintenance of Guarantees");
        PageObject.menu_Link("Amendment of Guarantee  ( Internal ) ");
        PageObject.switchToChildWindow();
        driver.manage().window().maximize();
        PageObject.img_Button("New Deal");
        PageObject.switchToChildWindow();
        PageObject.textinput_Locator("fieldName:CUSTOMER",testData.get("CUSTOMER"));
        PageObject.textinput_Locator("fieldName:CUSTOMER.TYPE",testData.get("CUSTOMER.TYPE"));
        PageObject.textinput_Locator("fieldName:CATEGORY",testData.get("CATEGORY"));
        PageObject.textinput_Locator("fieldName:LIMIT.REFERENCE",testData.get("LIMIT.REFERENCE"));
        PageObject.textinput_Locator("fieldName:COUNTRY.RISK",testData.get("COUNTRY.RISK"));
        PageObject.textinput_Locator("fieldName:CURRENCY",testData.get("CURRENCY"));
        PageObject.textinput_Locator("fieldName:PRINCIPAL.AMOUNT",testData.get("PRINCIPAL.AMOUNT"));
        PageObject.textinput_Locator("fieldName:VALUE.DATE",testData.get("VALUE.DATE"));
        PageObject.textinput_Locator("fieldName:ADVICE.EXPIRY.DATE",testData.get("ADVICE.EXPIRY.DATE"));
        PageObject.textinput_Locator("fieldName:MATURITY.DATE",testData.get("MATURITY.DATE"));
        PageObject.textinput_Locator("fieldName:EXP.DATE",testData.get("EXP.DATE"));
        PageObject.textinput_Locator("fieldName:COMMCHG.UPTO",testData.get("COMMCHG.UPTO"));
        PageObject.textinput_Locator("fieldName:BENEF.CUST.1:1",testData.get("BENEF.CUST.1"));
        PageObject.textinput_Locator("fieldName:BEN.ADDRESS:1",testData.get("BEN.ADDRESS"));
        PageObject.textinput_Locator("fieldName:BENEFICIERY.TYP",testData.get("BENEFICIERY.TYP"));
        PageObject.textinput_Locator("fieldName:REFERENCE.2",testData.get("REFERENCE.2"));
        PageObject.textinput_Locator("fieldName:AUTO.EXPIRY",testData.get("AUTO.EXPIRY"));
        PageObject.textinput_Locator("radio:tab1:AUTO.EXPIRY",testData.get("tab1"));
        PageObject.textinput_Locator("fieldName:PRIN.MOVEMENT:1",testData.get("PRIN.MOVEMENT"));
        PageObject.textinput_Locator("fieldName:MOVEMENT.DATE:1",testData.get("MOVEMENT.DATE"));
        PageObject.textinput_Locator("fieldName:PROV.AMT:1",testData.get("PROV.AMT"));
        PageObject.textinput_Locator("fieldName:REL.AMT:1",testData.get("REL.AMT"));
        PageObject.textinput_Locator("fieldName:REFERENCE.1",testData.get("REFERENCE.1"));
        PageObject.textinput_Locator("fieldName:TEXT.2:1",testData.get("TEXT.2"));
        PageObject.textinput_Locator("fieldName:ACCOUNT.OFFICER",testData.get("ACCOUNT.OFFICER"));

        PageObject.form_Tab("Charges / Commission");

        PageObject.textinput_Locator("fieldName:CSN.CRATE",testData.get("CSN.CRATE"));
        PageObject.textinput_Locator("fieldName:QTR.COMM",testData.get("QTR.COMM"));
        PageObject.textinput_Locator("fieldName:CHARGE.DATE:1",testData.get("CHARGE.DATE"));
        PageObject.textinput_Locator("fieldName:CHARGE.CURR:1",testData.get("CHARGE.CURR"));
        PageObject.textinput_Locator("fieldName:CHARGE.ACCOUNT:1",testData.get("CHARGE.ACCOUNT"));
        PageObject.textinput_Locator("fieldName:CHARGE.CODE:1:1",testData.get("CHARGE.CODE"));
        PageObject.textinput_Locator("fieldName:CHARGE.AMT:1:1",testData.get("CHARGE.AMT"));
        PageObject.textinput_Locator("fieldName:COMMCHG.UPTO",testData.get("COMMCHG.UPTO"));
        PageObject.textinput_Locator("fieldName:TEXT.1:1",testData.get("TEXT.1"));
        PageObject.textinput_Locator("fieldName:DEFERRED.COMM",testData.get("DEFERRED.COMM"));
        PageObject.textinput_Locator("radio:tab2:DEFERRED.COMM",testData.get("tab2"));
        PageObject.textinput_Locator("fieldName:CSN.PAYMENT.TYPE",testData.get("CSN.PAYMENT.TYPE"));
        PageObject.textinput_Locator("radio:tab2:CSN.PAYMENT.TYPE",testData.get("tab2"));
        PageObject.textinput_Locator("fieldName:INTEREST.BASIS",testData.get("INTEREST.BASIS"));
        PageObject.textinput_Locator("fieldName:FIXED.AMOUNT",testData.get("FIXED.AMOUNT"));
        PageObject.textinput_Locator("radio:tab2:FIXED.AMOUNT",testData.get("tab2"));
        PageObject.textinput_Locator("fieldName:CSN.DATE:1",testData.get("CSN.DATE"));
        PageObject.textinput_Locator("fieldName:CSN.AMOUNT:1",testData.get("CSN.AMOUNT"));
        PageObject.textinput_Locator("fieldName:CSN.ACCOUNT:1",testData.get("CSN.ACCOUNT"));
        PageObject.textinput_Locator("fieldName:TAX.KEY",testData.get("TAX.KEY"));

        PageObject.form_Tab("Cash Margin");

        PageObject.textinput_Locator("fieldName:LIMIT.UPD.REQD",testData.get("LIMIT.UPD.REQD"));
        PageObject.textinput_Locator("radio:tab3:LIMIT.UPD.REQD",testData.get("tab3"));
        PageObject.textinput_Locator("fieldName:INCLUDE.PROVISION",testData.get("INCLUDE.PROVISION"));
        PageObject.textinput_Locator("radio:tab3:INCLUDE.PROVISION",testData.get("tab3"));
        PageObject.textinput_Locator("fieldName:PROVISION",testData.get("PROVISION"));
        PageObject.textinput_Locator("radio:tab3:PROVISION",testData.get("tab3"));
        PageObject.textinput_Locator("fieldName:PROV.PERCENT",testData.get("PROV.PERCENT"));
        PageObject.textinput_Locator("fieldName:PROV.AMOUNT",testData.get("PROV.AMOUNT"));
        PageObject.textinput_Locator("fieldName:PROV.DR.ACCOUNT",testData.get("PROV.DR.ACCOUNT"));
        PageObject.textinput_Locator("fieldName:PROV.CR.ACCOUNT",testData.get("PROV.CR.ACCOUNT"));
        PageObject.textinput_Locator("fieldName:PROV.REL.ACCOUNT",testData.get("PROV.REL.ACCOUNT"));
        PageObject.textinput_Locator("fieldName:PROV.REL.DATE",testData.get("PROV.REL.DATE"));

        PageObject.form_Tab("Delivery Info");

        PageObject.textinput_Locator("fieldName:ADVICE.REQD",testData.get("ADVICE.REQD"));
        PageObject.textinput_Locator("radio:tab4:ADVICE.REQD",testData.get("tab4"));
        PageObject.textinput_Locator("fieldName:ACTIVITY.CODE",testData.get("ACTIVITY.CODE"));
        PageObject.textinput_Locator("fieldName:MSG.NO:1",testData.get("MSG.NO"));
        PageObject.textinput_Locator("fieldName:MSG.CLASS:1",testData.get("MSG.CLASS"));
        PageObject.textinput_Locator("fieldName:OVR.CARRIER:1",testData.get("OVR.CARRIER"));
        PageObject.textinput_Locator("fieldName:OVR.ADDRESS:1:1",testData.get("OVR.ADDRESS"));
        PageObject.textinput_Locator("fieldName:SWIFT.BIC",testData.get("SWIFT.BIC"));
        PageObject.textinput_Locator("fieldName:BPM.REQ.ID",testData.get("BPM.REQ.ID"));
        PageObject.textinput_Locator("fieldName:SEND.ACCUITY",testData.get("SEND.ACCUITY"));
        PageObject.textinput_Locator("radio:tab4:SEND.ACCUITY",testData.get("tab4"));
        PageObject.textinput_Locator("fieldName:ACCUITY.RESP",testData.get("ACCUITY.RESP"));
        PageObject.textinput_Locator("fieldName:ACCUITY.REF",testData.get("ACCUITY.REF"));

        //PageObject.form_Tab("Audit Info");

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

        //PageObject.img_Button("Validate a deal");




    }

    @Test(groups = {"GuaranteeInputter"}, dataProvider = "ExpiryOfGuarantee")
    public void ExpiryOfGuarantee(Map<String, String> testData) throws IOException{

        PageObject.menu_Dropdown("Maintenance of Guarantees");
        PageObject.menu_Link("Expiry of Guarantee ");
        PageObject.switchToChildWindow();
        driver.manage().window().maximize();
        PageObject.img_Button("New Deal");
        PageObject.switchToChildWindow();
        PageObject.textinput_Locator("fieldName:ALTERNATE.ID",testData.get("ALTERNATE.ID"));
        PageObject.textinput_Locator("fieldName:CUSTOMER",testData.get("CUSTOMER"));
        PageObject.textinput_Locator("fieldName:DEAL.SUB.TYPE",testData.get("DEAL.SUB.TYPE"));
        PageObject.textinput_Locator("fieldName:CATEGORY",testData.get("CATEGORY"));
        PageObject.textinput_Locator("fieldName:LIMIT.REFERENCE",testData.get("LIMIT.REFERENCE"));
        PageObject.textinput_Locator("fieldName:CURRENCY",testData.get("CURRENCY"));
        PageObject.textinput_Locator("fieldName:PRINCIPAL.AMOUNT",testData.get("PRINCIPAL.AMOUNT"));
        PageObject.textinput_Locator("fieldName:VALUE.DATE",testData.get("VALUE.DATE"));
        PageObject.textinput_Locator("fieldName:ADVICE.EXPIRY.DATE",testData.get("ADVICE.EXPIRY.DATE"));
        PageObject.textinput_Locator("fieldName:MATURITY.DATE",testData.get("MATURITY.DATE"));
        PageObject.textinput_Locator("fieldName:BENEF.CUST.1:1",testData.get("BENEF.CUST.1"));
        PageObject.textinput_Locator("fieldName:BEN.ADDRESS:1",testData.get("BEN.ADDRESS"));
        PageObject.textinput_Locator("fieldName:EVENTS.PROCESSING",testData.get("EVENTS.PROCESSING"));
        PageObject.textinput_Locator("radio:mainTab:EVENTS.PROCESSING",testData.get("mainTab"));
        PageObject.textinput_Locator("fieldName:PRIN.MOVEMENT:1",testData.get("PRIN.MOVEMENT"));
        PageObject.textinput_Locator("fieldName:MOVEMENT.DATE:1",testData.get("MOVEMENT.DATE"));
        PageObject.textinput_Locator("fieldName:REFERENCE.1",testData.get("REFERENCE.1"));
        PageObject.textinput_Locator("fieldName:AUTO.EXPIRY",testData.get("AUTO.EXPIRY"));
        PageObject.textinput_Locator("radio:mainTab:AUTO.EXPIRY",testData.get("mainTab"));
        PageObject.textinput_Locator("fieldName:WAIVE.CHARGES",testData.get("WAIVE.CHARGES"));
        PageObject.textinput_Locator("radio:tab1:WAIVE.CHARGES",testData.get("tab1"));
        PageObject.textinput_Locator("fieldName:CHARGE.DATE:1",testData.get("CHARGE.DATE"));
        PageObject.textinput_Locator("fieldName:CHARGE.CURR:1",testData.get("CHARGE.CURR"));
        PageObject.textinput_Locator("fieldName:CHARGE.ACCOUNT:1",testData.get("CHARGE.ACCOUNT"));
        PageObject.textinput_Locator("fieldName:CHARGE.CODE:1:1",testData.get("CHARGE.CODE"));
        PageObject.textinput_Locator("fieldName:CHARGE.AMT:1:1",testData.get("CHARGE.AMT"));

        PageObject.form_Tab("Cash Margin");

        PageObject.textinput_Locator("fieldName:LIMIT.UPD.REQD",testData.get("LIMIT.UPD.REQD"));
        PageObject.textinput_Locator("radio:tab2:LIMIT.UPD.REQD",testData.get("tab2"));
        PageObject.textinput_Locator("fieldName:INCLUDE.PROVISION",testData.get("INCLUDE.PROVISION"));
        PageObject.textinput_Locator("radio:tab2:INCLUDE.PROVISION",testData.get("tab2"));
        PageObject.textinput_Locator("fieldName:PROVISION",testData.get("PROVISION"));
        PageObject.textinput_Locator("radio:tab2:PROVISION",testData.get("tab2"));
        PageObject.textinput_Locator("fieldName:PROV.PERCENT",testData.get("PROV.PERCENT"));
        PageObject.textinput_Locator("fieldName:PROV.AMOUNT",testData.get("PROV.AMOUNT"));
        PageObject.textinput_Locator("fieldName:PROV.DR.ACCOUNT",testData.get("PROV.DR.ACCOUNT"));
        PageObject.textinput_Locator("fieldName:PROV.CR.ACCOUNT",testData.get("PROV.CR.ACCOUNT"));
        PageObject.textinput_Locator("fieldName:PROV.REL.ACCOUNT",testData.get("PROV.REL.ACCOUNT"));

        PageObject.form_Tab("MT 769");

        PageObject.textinput_Locator("fieldName:RECEIVING.BANK",testData.get("RECEIVING.BANK"));
        PageObject.textinput_Locator("fieldName:BANK.ADDRESS:1",testData.get("BANK.ADDRESS"));
        PageObject.textinput_Locator("fieldName:ALTERNATE.ID",testData.get("ALTERNATE.ID"));
        PageObject.textinput_Locator("fieldName:REFERENCE.1",testData.get("REFERENCE.1"));
        PageObject.textinput_Locator("fieldName:SETTLE.ACCOUNT",testData.get("SETTLE.ACCOUNT"));
        PageObject.textinput_Locator("fieldName:PRIN.MOVEMENT:1",testData.get("PRIN.MOVEMENT"));
        PageObject.textinput_Locator("fieldName:MOVEMENT.DATE:1",testData.get("MOVEMENT.DATE"));
        PageObject.textinput_Locator("fieldName:AMT.OF.CHGS",testData.get("AMT.OF.CHGS"));
        PageObject.textinput_Locator("fieldName:PRINCIPAL.AMOUNT",testData.get("PRINCIPAL.AMOUNT"));
        PageObject.textinput_Locator("fieldName:ACCT.WITH.BANK:1",testData.get("ACCT.WITH.BANK"));
        PageObject.textinput_Locator("fieldName:CHG.DETAILS:1",testData.get("CHG.DETAILS"));
        PageObject.textinput_Locator("fieldName:FURTHER.ID",testData.get("FURTHER.ID"));
        PageObject.textinput_Locator("radio:tab3:FURTHER.ID",testData.get("tab3"));

        PageObject.form_Tab("Delivery Info");

        PageObject.textinput_Locator("fieldName:ADVICE.REQD",testData.get("ADVICE.REQD"));
        PageObject.textinput_Locator("radio:tab4:ADVICE.REQD",testData.get("tab4"));
        PageObject.textinput_Locator("fieldName:ACTIVITY.CODE",testData.get("ACTIVITY.CODE"));
        PageObject.textinput_Locator("fieldName:MSG.NO:1",testData.get("MSG.NO"));
        PageObject.textinput_Locator("fieldName:MSG.CLASS:1",testData.get("MSG.CLASS"));
        PageObject.textinput_Locator("fieldName:OVR.CARRIER:1",testData.get("OVR.CARRIER"));
        PageObject.textinput_Locator("fieldName:OVR.ADDRESS:1:1",testData.get("OVR.ADDRESS"));
        PageObject.textinput_Locator("fieldName:SWIFT.BIC",testData.get("SWIFT.BIC"));
        PageObject.textinput_Locator("fieldName:BPM.REQ.ID",testData.get("BPM.REQ.ID"));
        PageObject.textinput_Locator("fieldName:SEND.ACCUITY",testData.get("SEND.ACCUITY"));
        PageObject.textinput_Locator("radio:tab4:SEND.ACCUITY",testData.get("tab4"));
        PageObject.textinput_Locator("fieldName:ACCUITY.RESP",testData.get("ACCUITY.RESP"));
        PageObject.textinput_Locator("fieldName:ACCUITY.REF",testData.get("ACCUITY.REF"));

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

        //PageObject.img_Button("Validate a deal");

    }

    @Test(groups = {"GuaranteeInputter"}, dataProvider = "RefundOfCharges")
    public void RefundOfCharges(Map<String, String> testData) throws IOException{

        PageObject.menu_Dropdown("Maintenance of Guarantees");
        PageObject.menu_Link("Refund Guarantee  Charges ");
        PageObject.switchToChildWindow();
        driver.manage().window().maximize();
        PageObject.textinput_Locator("transactionId","MD0934600001");
        PageObject.img_Button("Edit a contract");
        PageObject.switchToChildWindow();
        PageObject.textinput_Locator("fieldName:CHARGE.DATE:1",testData.get("CHARGE.DATE"));
        PageObject.textinput_Locator("fieldName:CHARGE.ACCOUNT:1",testData.get("CHARGE.ACCOUNT"));
        PageObject.textinput_Locator("fieldName:REFUND.AMT:1",testData.get("REFUND.AMT"));

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

        //PageObject.img_Button("Validate a deal");
    }

    @Test(groups = {"GuaranteeInputter"}, dataProvider = "ReinstateOfExpireGuarantee")
    public void ReinstateOfExpireGuarantee(Map<String, String> testData) throws IOException{

        PageObject.menu_Dropdown("Maintenance of Guarantees");
        PageObject.menu_Link("Gurantee Reinstate ");
        PageObject.switchToChildWindow();
        driver.manage().window().maximize();
        PageObject.textinput_Locator("transactionId","MD0934600001");
        PageObject.img_Button("Edit a contract");
        PageObject.switchToChildWindow();
        PageObject.textinput_Locator("fieldName:ALTERNATE.ID",testData.get("ALTERNATE.ID"));
        PageObject.textinput_Locator("fieldName:REFERENCE.1",testData.get("REFERENCE.1"));
        PageObject.textinput_Locator("fieldName:REFERENCE.2",testData.get("REFERENCE.2"));
        PageObject.textinput_Locator("fieldName:CATEGORY",testData.get("CATEGORY"));
        PageObject.textinput_Locator("fieldName:ADVICE.EXPIRY.DATE",testData.get("ADVICE.EXPIRY.DATE"));
        PageObject.textinput_Locator("fieldName:MATURITY.DATE",testData.get("MATURITY.DATE"));

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

        //PageObject.img_Button("Validate a deal");


    }

    private static final String FILE_PATH = "path/to/your/excel/file.xlsx"; // Update with your file path
    @DataProvider(name = "ExternalAmendToGuarantee")
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

    @DataProvider(name = "ExternalAmendToSBLCGuarantee")
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

    @DataProvider(name = "InternalAmendToGuarantee")
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

    @DataProvider(name = "ExpiryOfGuarantee")
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

    @DataProvider(name = "RefundOfCharges")
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

    @DataProvider(name = "ReinstateOfExpireGuarantee")
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
