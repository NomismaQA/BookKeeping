package tests;

import reports.TestNGListener;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ie.curiositysoftware.allocation.dto.ResultMergeMethod;
import ie.curiositysoftware.allocation.dto.DataAllocationRow;
import reports.ExtentTestListener;
import ie.curiositysoftware.allocation.dto.DataAllocationResult;
import ie.curiositysoftware.allocation.engine.DataAllocation;
import utilities.ExcelUtility;
import utilities.testmodeller.TestModellerLogger;

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/08fe4ffb-ce41-4038-a082-19bb47b307e0
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1058, profileId = 100960)
public class ScriptVerifyByTrialBalanceScreenshotDefaultProfile_DefaultProfile extends TestBase
{
	String sTestCaseID=null;
	String[] data=null;
	String Sheet = null;

    
    @Test  (groups= {"ScriptVerifyByTrialBalanceNEW_DefaultProfile","ScriptVerifyByTrialBalanceNEW_DefaultProfile - Default Profile"})
    @TestModellerPath(guid = "b97fefdb-8e1e-40ef-a08d-651b66ebe4a3")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlCl() throws InterruptedException, InvalidFormatException, HeadlessException, IOException, AWTException
    {
    	sTestCaseID="TC24";
    	Sheet="Sale_NewInvoice";
    data = ExcelUtility.toReadExcelData(sTestCaseID, Sheet);
        
        pages.Login1VAT _Login1VAT = new pages.Login1VAT(driver);
    TestModellerLogger.SetLastNodeGuid("93e4a214-3f97-41d2-8063-dd91c879e847");
    _Login1VAT.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7eff8b4c-1e47-48a4-bcad-b3639d0cdfd5");
    _Login1VAT.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ceaa193b-d8c0-48f9-911f-018e2571da20");
    _Login1VAT.Enter_UserName(data[1]);
    

    TestModellerLogger.SetLastNodeGuid("95b31ed9-af0a-49e7-8bfa-8471d379cdff");
    _Login1VAT.Enter_Password(data[2]);
    

    TestModellerLogger.SetLastNodeGuid("942414e4-1d0e-45ba-bdd1-43293b97e0ff");
    _Login1VAT.Click_LoginButton();
    

pages.AgentsSelect _AgentsSelect = new pages.AgentsSelect(driver);
//    TestModellerLogger.SetLastNodeGuid("69016c4b-a736-45bf-a682-5c03ee8d17cd");
//    _AgentsSelect.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("bd071d41-148c-42e8-8300-984c9dd4df87");
//    _AgentsSelect.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("bd031a68-650a-4b8c-8e7c-0ce87415e17e");
    _AgentsSelect.Click_AgentsTab();
    

    TestModellerLogger.SetLastNodeGuid("d5b61053-e5d4-479f-87c7-e4be6b5f054a");
    _AgentsSelect.Enter_AgentName(data[3]);
    

    TestModellerLogger.SetLastNodeGuid("2bae82eb-0e45-434c-b1bd-7336f304d4f9");
    _AgentsSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("be317b25-3125-4191-86a5-e8ffee0d0334");
    _AgentsSelect.Click_SelectAgent();
    

pages.ClientSelect _ClientSelect = new pages.ClientSelect(driver);
//    TestModellerLogger.SetLastNodeGuid("1243c994-d23d-40d1-bc93-38dfdab760ed");
//    _ClientSelect.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("b42ff41f-2fec-4f5c-b77b-2742ec894ec7");
//    _ClientSelect.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ff5edd38-07b0-452b-95d6-f33e07e1e975");
    _ClientSelect.Click_ClientsTAB();
    

    TestModellerLogger.SetLastNodeGuid("14a94a5a-c1ac-4e4f-afd4-69a84ffa5a24");
    _ClientSelect.Enter_ClientName(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("ed3e4750-33a4-4d75-a14c-9d75935c79c7");
    _ClientSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("e537c9d6-4166-4745-b27e-a178d69d2884");
    _ClientSelect.Click_SelectClient();
    

pages.VerifyByTrialBalanceReportNew _VerifyByTrialBalanceReportNew = new pages.VerifyByTrialBalanceReportNew(driver);
//    TestModellerLogger.SetLastNodeGuid("32edf43e-eef8-4b1b-b476-c73e31c0e0dd");
//    _VerifyByTrialBalanceReportNew.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("11ba86a1-94b2-4ea4-aa97-bebc328dcf80");
//    _VerifyByTrialBalanceReportNew.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8131f2a6-1cd7-4563-977a-53240d99ed78");
    _VerifyByTrialBalanceReportNew.Click_ReportsTAB();
    

    TestModellerLogger.SetLastNodeGuid("00ae12e0-ffa4-4cc0-a12a-958c710c501f");
    _VerifyByTrialBalanceReportNew.Click_TrialBalance();
    

//    TestModellerLogger.SetLastNodeGuid("96e2ddcb-6ea4-48d5-ae86-c778ba30cfb8");
//    _VerifyByTrialBalanceReportNew.Click__31_Dec_2021();
    

//    TestModellerLogger.SetLastNodeGuid("ac8428f1-2dc1-4e70-ba10-840c3a9077ef");
//    _VerifyByTrialBalanceReportNew.Click__280000_();
//    
//
//   TestModellerLogger.SetLastNodeGuid("9d0944cd-d4f3-46eb-beb0-95a34ea0b0ca");
//   _VerifyByTrialBalanceReportNew.Click__25000();
//    

    }

}
