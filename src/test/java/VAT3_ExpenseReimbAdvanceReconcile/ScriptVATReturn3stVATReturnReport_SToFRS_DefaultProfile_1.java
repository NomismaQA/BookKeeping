package VAT3_ExpenseReimbAdvanceReconcile;

import reports.TestNGListener;
import tests.TestBase;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;

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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/b5d42ceb-4526-4531-bacd-4b7a732130c3
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 994, profileId = 100890)
public class ScriptVATReturn3stVATReturnReport_SToFRS_DefaultProfile_1 extends TestBase
{
	String sTestCaseID=null;
	String[] data=null;
	String Sheet = null;

    
    @Test  (groups= {"ScriptVATReturn3stVATReturnReport","ScriptVATReturn3stVATReturnReport - Default Profile"})
    @TestModellerPath(guid = "8e1bf2bb-635b-4652-bcac-189d64c48f01")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlCl() throws InterruptedException, InvalidFormatException
    {
    	sTestCaseID="TC270";
    	Sheet="VAT3_ExpenseRein";
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
//    

    TestModellerLogger.SetLastNodeGuid("ff5edd38-07b0-452b-95d6-f33e07e1e975");
    _ClientSelect.Click_ClientsTAB();
    

    TestModellerLogger.SetLastNodeGuid("14a94a5a-c1ac-4e4f-afd4-69a84ffa5a24");
    _ClientSelect.Enter_ClientName(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("ed3e4750-33a4-4d75-a14c-9d75935c79c7");
    _ClientSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("e537c9d6-4166-4745-b27e-a178d69d2884");
    _ClientSelect.Click_SelectClient();
    

pages.VATReturn3rdVATRetrunReport _VATReturn3rdVATRetrunReport = new pages.VATReturn3rdVATRetrunReport(driver);
//    TestModellerLogger.SetLastNodeGuid("4def1fd0-159a-438c-923f-b533feef9558");
//    _VATReturn3rdVATRetrunReport.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8c630d5c-8762-4ec9-9817-4841428a2bb8");
//    _VATReturn3rdVATRetrunReport.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("b9664ea4-797d-42b0-aaa5-91e5e63868e5");
    _VATReturn3rdVATRetrunReport.Click__VAT_Returns_();
    

    TestModellerLogger.SetLastNodeGuid("c9648fad-a8df-454a-b978-f289b2d9ad43");
    _VATReturn3rdVATRetrunReport.Click_SettingsTAB();
    

    TestModellerLogger.SetLastNodeGuid("0fbe2754-ff07-48b5-9eba-62d27ad2c158");
    _VATReturn3rdVATRetrunReport.Click_VATReturnReportTAB();
    

    TestModellerLogger.SetLastNodeGuid("aa0261eb-3bee-45f1-8d96-b15ed02c4bdc");
    _VATReturn3rdVATRetrunReport.Click_DownLoadLink();
    

    TestModellerLogger.SetLastNodeGuid("c2605320-1dd6-42c3-aca6-d07eb87b9080");
    _VATReturn3rdVATRetrunReport.Click_PDFOption();
    

    TestModellerLogger.SetLastNodeGuid("ac28e009-0bef-4304-b299-83ae3b2bcbb3");
    _VATReturn3rdVATRetrunReport.Click__VATReturnReportClose();
    

    }

}
