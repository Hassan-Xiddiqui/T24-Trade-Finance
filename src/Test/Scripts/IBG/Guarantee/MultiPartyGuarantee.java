package Test.Scripts.IBG.Guarantee;

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

public class MultiPartyGuarantee extends BaseClass {

    @Test(groups = {"IBGGuaranteeInputter"}, dataProvider = "IssueMultiPartyGuarantee")
    public void IssueMultiPartyGuarantee(Map<String, String> testData) throws IOException{

        PageObject.menu_Dropdown("Multi-Party/Participation Guarantees",1);
        PageObject.menu_Link("Issue Of Multi-Party Guarantee ");
        PageObject.switchToChildWindow();
        driver.manage().window().maximize();
        PageObject.img_Button("New Deal");
        PageObject.switchToChildWindow();
        PageObject.textinput_Locator("fieldName:CUSTOMER",testData.get("CUSTOMER"));
        PageObject.textinput_Locator("fieldName:CUSTOMER.TYPE",testData.get("CUSTOMER.TYPE"));
        PageObject.textinput_Locator("fieldName:CATEGORY",testData.get("CATEGORY"));
        PageObject.textinput_Locator("fieldName:LIMIT.REFERENCE",testData.get("LIMIT.REFERENCE"));
        //PageObject.textinput_Locator("fieldName:CURRENCY",testData.get("CURRENCY"));
        PageObject.textinput_Locator("fieldName:PRINCIPAL.AMOUNT",testData.get("PRINCIPAL.AMOUNT"));
        PageObject.textinput_Locator("fieldName:VALUE.DATE",testData.get("VALUE.DATE"));
        PageObject.textinput_Locator("fieldName:EXP.DATE",testData.get("EXP.DATE"));
        PageObject.textinput_Locator("fieldName:MATURITY.DATE",testData.get("MATURITY.DATE"));
        PageObject.textinput_Locator("fieldName:BENEF.CUST.1:1",testData.get("BENEF.CUST.1"));
        PageObject.textinput_Locator("fieldName:BENEFICIERY.TYP",testData.get("BENEFICIERY.TYP"));
        PageObject.textinput_Locator("fieldName:BEN.ADDRESS:1",testData.get("BEN.ADDRESS"));
        PageObject.textinput_Locator("fieldName:PARTICIPANT:1",testData.get("PARTICIPANT"));
        PageObject.textinput_Locator("fieldName:AMT.PARTICIPATE:1",testData.get("AMT.PARTICIPATE"));
        PageObject.textinput_Locator("fieldName:ASSET.LIAB.NETTING",testData.get("ASSET.LIAB.NETTING"));
        PageObject.textinput_Locator("radio:tab1:ASSET.LIAB.NETTING",testData.get("tab1"));
        PageObject.textinput_Locator("fieldName:REFERENCE.2",testData.get("REFERENCE.2"));
        PageObject.textinput_Locator("fieldName:TEXT.1:1",testData.get("TEXT.1"));
        PageObject.textinput_Locator("fieldName:ACCOUNT.OFFICER",testData.get("ACCOUNT.OFFICER"));
        PageObject.textinput_Locator("fieldName:GTN.BR.CO",testData.get("GTN.BR.CO"));
        PageObject.textinput_Locator("fieldName:LIQUIDATION.MODE",testData.get("LIQUIDATION.MODE"));
        PageObject.textinput_Locator("radio:tab1:LIQUIDATION.MODE",testData.get("tab1"));
        PageObject.textinput_Locator("fieldName:VALID.UPTO",testData.get("VALID.UPTO"));
        PageObject.textinput_Locator("fieldName:A.REMARKS",testData.get("A.REMARKS"));

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
        PageObject.textinput_Locator("fieldName:CSN.RATE",testData.get("CSN.RATE"));
        PageObject.textinput_Locator("fieldName:CSN.SPREAD",testData.get("CSN.SPREAD"));
        PageObject.textinput_Locator("fieldName:FIXED.AMOUNT",testData.get("FIXED.AMOUNT"));
        PageObject.textinput_Locator("radio:tab2:FIXED.AMOUNT",testData.get("tab2"));
        PageObject.textinput_Locator("fieldName:CSN.FREQUENCY",testData.get("CSN.FREQUENCY"));
        PageObject.textinput_Locator("fieldName:BACK.FORWARD.KEY",testData.get("BACK.FORWARD.KEY"));
        PageObject.textinput_Locator("radio:tab2:BACK.FORWARD.KEY",testData.get("tab2"));
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

        PageObject.form_Tab("MT 760");

        PageObject.textinput_Locator("fieldName:CB.LIMIT.UPDATE",testData.get("CB.LIMIT.UPDATE"));
        PageObject.textinput_Locator("radio:tab4:CB.LIMIT.UPDATE",testData.get("tab4"));
        PageObject.textinput_Locator("fieldName:RECEIVING.BANK",testData.get("RECEIVING.BANK"));
        PageObject.textinput_Locator("fieldName:BANK.ADDRESS:1",testData.get("BANK.ADDRESS"));
        PageObject.textinput_Locator("fieldName:FURTHER.ID",testData.get("FURTHER.ID"));
        PageObject.textinput_Locator("radio:tab4:FURTHER.ID",testData.get("tab4"));
        PageObject.textinput_Locator("fieldName:DEAL.DATE",testData.get("DEAL.DATE"));
        PageObject.textinput_Locator("fieldName:NARRATIVE",testData.get("NARRATIVE"));

        PageObject.form_Tab("Delivery Info");

        PageObject.textinput_Locator("fieldName:ADVICE.REQD",testData.get("ADVICE.REQD"));
        PageObject.textinput_Locator("radio:tab5:ADVICE.REQD",testData.get("tab5"));
        PageObject.textinput_Locator("fieldName:ACTIVITY.CODE",testData.get("ACTIVITY.CODE"));
        PageObject.textinput_Locator("fieldName:MSG.NO:1",testData.get("MSG.NO"));
        PageObject.textinput_Locator("fieldName:MSG.CLASS:1",testData.get("MSG.CLASS"));
        PageObject.textinput_Locator("fieldName:OVR.CARRIER:1",testData.get("OVR.CARRIER"));
        PageObject.textinput_Locator("fieldName:OVR.ADDRESS:1:1",testData.get("OVR.ADDRESS"));
        PageObject.textinput_Locator("fieldName:SWIFT.BIC",testData.get("SWIFT.BIC"));
        PageObject.textinput_Locator("fieldName:BPM.REQ.ID",testData.get("BPM.REQ.ID"));
        PageObject.textinput_Locator("fieldName:SEND.ACCUITY",testData.get("SEND.ACCUITY"));
        PageObject.textinput_Locator("radio:tab5:SEND.ACCUITY",testData.get("tab5"));
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

        PageObject.commitTxn();
        PageObject.commitDeal("IssueMultiPartyGuarantee");

    }

    @Test(groups = {"IBGGuaranteeInputter"}, dataProvider = "AmendToMultiPartyGuarantee")
    public void AmendToMultiPartyGuarantee(Map<String, String> testData) throws IOException{

        PageObject.menu_Dropdown("Multi-Party/Participation Guarantees",1);
        PageObject.menu_Link("Amendmend Of Multi-Party Guarantee ");
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
        PageObject.textinput_Locator("fieldName:EXP.DATE",testData.get("EXP.DATE"));
        PageObject.textinput_Locator("fieldName:MATURITY.DATE",testData.get("MATURITY.DATE"));
        PageObject.textinput_Locator("fieldName:PARTICIPANT:1",testData.get("PARTICIPANT"));
        PageObject.textinput_Locator("fieldName:AMT.PARTICIPATE:1",testData.get("AMT.PARTICIPATE"));
        PageObject.textinput_Locator("fieldName:BENEF.CUST.1:1",testData.get("BENEF.CUST.1"));
        PageObject.textinput_Locator("fieldName:BEN.ADDRESS:1",testData.get("BEN.ADDRESS"));
        PageObject.textinput_Locator("fieldName:BENEFICIERY.TYP",testData.get("BENEFICIERY.TYP"));
        PageObject.textinput_Locator("fieldName:REFERENCE.2",testData.get("REFERENCE.2"));
        PageObject.textinput_Locator("fieldName:PRIN.MOVEMENT:1",testData.get("PRIN.MOVEMENT"));
        PageObject.textinput_Locator("fieldName:PART.CUS:1:1",testData.get("PART.CUS"));
        PageObject.textinput_Locator("fieldName:PAR.PRN.MVMT:1:1",testData.get("PAR.PRN.MVMT"));
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
        PageObject.textinput_Locator("fieldName:CSN.RATE",testData.get("CSN.RATE"));
        PageObject.textinput_Locator("fieldName:CSN.SPREAD",testData.get("CSN.SPREAD"));
        PageObject.textinput_Locator("fieldName:FIXED.AMOUNT",testData.get("FIXED.AMOUNT"));
        PageObject.textinput_Locator("radio:tab2:FIXED.AMOUNT",testData.get("tab2"));
        PageObject.textinput_Locator("fieldName:CSN.FREQUENCY",testData.get("CSN.FREQUENCY"));
        PageObject.textinput_Locator("fieldName:BACK.FORWARD.KEY",testData.get("BACK.FORWARD.KEY"));
        PageObject.textinput_Locator("radio:tab2:BACK.FORWARD.KEY",testData.get("tab2"));
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
        PageObject.textinput_Locator("fieldName:ALTERNATE.ID",testData.get("ALTERNATE.ID"));
        PageObject.textinput_Locator("fieldName:REFERENCE.1",testData.get("REFERENCE.1"));
        PageObject.textinput_Locator("fieldName:FURTHER.ID",testData.get("FURTHER.ID"));
        PageObject.textinput_Locator("radio:tab4:FURTHER.ID",testData.get("tab4"));
        PageObject.textinput_Locator("fieldName:AMENDMENT.NO",testData.get("AMENDMENT.NO"));
        PageObject.textinput_Locator("fieldName:DEAL.DATE",testData.get("DEAL.DATE"));
        PageObject.textinput_Locator("fieldName:NARRATIVE",testData.get("NARRATIVE"));

        PageObject.form_Tab("Delivery Info");

        PageObject.textinput_Locator("fieldName:ADVICE.REQD",testData.get("ADVICE.REQD"));
        PageObject.textinput_Locator("radio:tab5:ADVICE.REQD",testData.get("tab5"));
        PageObject.textinput_Locator("fieldName:ACTIVITY.CODE",testData.get("ACTIVITY.CODE"));
        PageObject.textinput_Locator("fieldName:MSG.NO:1",testData.get("MSG.NO"));
        PageObject.textinput_Locator("fieldName:MSG.CLASS:1",testData.get("MSG.CLASS"));
        PageObject.textinput_Locator("fieldName:OVR.CARRIER:1",testData.get("OVR.CARRIER"));
        PageObject.textinput_Locator("fieldName:OVR.ADDRESS:1:1",testData.get("OVR.ADDRESS"));
        PageObject.textinput_Locator("fieldName:SWIFT.BIC",testData.get("SWIFT.BIC"));
        PageObject.textinput_Locator("fieldName:BPM.REQ.ID",testData.get("BPM.REQ.ID"));
        PageObject.textinput_Locator("fieldName:SEND.ACCUITY",testData.get("SEND.ACCUITY"));
        PageObject.textinput_Locator("radio:tab5:SEND.ACCUITY",testData.get("tab5"));
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

        PageObject.commitTxn();
        PageObject.commitDeal("AmendToMultiPartyGuarantee");


    }

    @Test(groups = {"IBGGuaranteeInputter"}, dataProvider = "ParticipantTaken")
    public void ParticipantTaken(Map<String, String> testData) throws IOException   {

        PageObject.menu_Dropdown("Multi-Party/Participation Guarantees",1);
        PageObject.menu_Link("Participation Taken ");
        PageObject.switchToChildWindow();
        driver.manage().window().maximize();
        PageObject.img_Button("New Deal");
        PageObject.switchToChildWindow();
        PageObject.textinput_Locator("fieldName:ISSUE.CUSTOMER",testData.get("ISSUE.CUSTOMER"));
        PageObject.textinput_Locator("fieldName:CUSTOMER",testData.get("CUSTOMER"));
        PageObject.textinput_Locator("fieldName:CATEGORY",testData.get("CATEGORY"));
        PageObject.textinput_Locator("fieldName:COUNTRY.RISK",testData.get("COUNTRY.RISK"));
        PageObject.textinput_Locator("fieldName:CURRENCY",testData.get("CURRENCY"));
        PageObject.textinput_Locator("fieldName:PRINCIPAL.AMOUNT",testData.get("PRINCIPAL.AMOUNT"));
        PageObject.textinput_Locator("fieldName:VALUE.DATE",testData.get("VALUE.DATE"));
        PageObject.textinput_Locator("fieldName:MATURITY.DATE",testData.get("MATURITY.DATE"));
        PageObject.textinput_Locator("fieldName:BENEF.CUST.1:1",testData.get("BENEF.CUST.1"));
        PageObject.textinput_Locator("fieldName:BEN.ADDRESS:1",testData.get("BEN.ADDRESS"));
        PageObject.textinput_Locator("fieldName:REFERENCE.1",testData.get("REFERENCE.1"));
        PageObject.textinput_Locator("fieldName:TEXT.1:1",testData.get("TEXT.1"));
        PageObject.textinput_Locator("fieldName:ACCOUNT.OFFICER",testData.get("ACCOUNT.OFFICER"));
        PageObject.textinput_Locator("fieldName:GTN.BR.CO",testData.get("GTN.BR.CO"));
        PageObject.textinput_Locator("fieldName:LIQUIDATION.MODE",testData.get("LIQUIDATION.MODE"));
        PageObject.textinput_Locator("radio:tab1:LIQUIDATION.MODE",testData.get("tab1"));
        PageObject.textinput_Locator("fieldName:A.REMARKS",testData.get("A.REMARKS"));
        PageObject.textinput_Locator("fieldName:VALID.UPTO",testData.get("VALID.UPTO"));

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
        PageObject.textinput_Locator("fieldName:CSN.RATE",testData.get("CSN.RATE"));
        PageObject.textinput_Locator("fieldName:CSN.SPREAD",testData.get("CSN.SPREAD"));
        PageObject.textinput_Locator("fieldName:FIXED.AMOUNT",testData.get("FIXED.AMOUNT"));
        PageObject.textinput_Locator("radio:tab2:FIXED.AMOUNT",testData.get("tab2"));
        PageObject.textinput_Locator("fieldName:CSN.FREQUENCY",testData.get("CSN.FREQUENCY"));
        PageObject.textinput_Locator("fieldName:BACK.FORWARD.KEY",testData.get("BACK.FORWARD.KEY"));
        PageObject.textinput_Locator("radio:tab2:BACK.FORWARD.KEY",testData.get("tab2"));
        PageObject.textinput_Locator("fieldName:CSN.DATE:1",testData.get("CSN.DATE"));
        PageObject.textinput_Locator("fieldName:CSN.AMOUNT:1",testData.get("CSN.AMOUNT"));
        PageObject.textinput_Locator("fieldName:CSN.ACCOUNT:1",testData.get("CSN.ACCOUNT"));
        PageObject.textinput_Locator("fieldName:TAX.KEY",testData.get("TAX.KEY"));

        PageObject.form_Tab("MT 768");

        PageObject.textinput_Locator("fieldName:RECEIVING.BANK",testData.get("RECEIVING.BANK"));
        PageObject.textinput_Locator("fieldName:BANK.ADDRESS:1",testData.get("BANK.ADDRESS"));
        PageObject.textinput_Locator("fieldName:REFERENCE.1",testData.get("REFERENCE.1"));
        PageObject.textinput_Locator("fieldName:SETTLE.ACCOUNT",testData.get("SETTLE.ACCOUNT"));
        PageObject.textinput_Locator("fieldName:AMT.OF.CHGS",testData.get("AMT.OF.CHGS"));
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

        PageObject.commitTxn();
        PageObject.commitDeal("ParticipantTaken");

    }

    private static final String FILE_PATH = "path/to/your/excel/file.xlsx"; // Update with your file path

    @DataProvider(name = "IssueMultiPartyGuarantee")
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

    @DataProvider(name = "AmendToMultiPartyGuarantee")
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

    @DataProvider(name = "ParticipantTaken")
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
