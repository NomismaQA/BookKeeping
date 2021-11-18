package tests;

import reports.TestNGListener;
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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/dd22fbce-e304-441f-bf5a-8302f8974db9
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 913, profileId = 100807)
public class ScriptFRSTOStandard_DefaultProfile extends TestBase
{
	String sTestCaseID=null;
	String[] data=null;
	
	String Sheet = null;

    
    @Test  (groups= {"ScriptFRSTOStandard","ScriptFRSTOStandard - Default Profile"})
    @TestModellerPath(guid = "663dda07-83b8-4897-aadd-0dd54b8d6fc7")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlCl() throws InterruptedException, InvalidFormatException
    {
    	sTestCaseID="TC32";
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
    

pages.FRSTOStandard _FRSTOStandard = new pages.FRSTOStandard(driver);
//    TestModellerLogger.SetLastNodeGuid("0ca7f55c-2ba6-41bc-9913-e1bc043f9eb6");
//    _FRSTOStandard.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("40188b13-352a-4a07-ba20-767d2f1e3f19");
//    _FRSTOStandard.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ba9c4013-bb0a-4aa2-b07e-6d10250d6996");
    _FRSTOStandard.Click_SettingsTAB();
    

    TestModellerLogger.SetLastNodeGuid("61fb1481-b897-43e7-8618-7cd21332b3d5");
    _FRSTOStandard.Click_VATTAB();
    

    TestModellerLogger.SetLastNodeGuid("2b875b67-a4c8-4895-baf1-15bd936fd4ae");
    _FRSTOStandard.Click_EditButton();
    

    TestModellerLogger.SetLastNodeGuid("c2fb97ff-6a3c-4463-b96d-81a1ca82e291");
    _FRSTOStandard.Click_AddButton();
    

    TestModellerLogger.SetLastNodeGuid("fd12b291-9f7c-4722-8708-8d4948b67736");
    _FRSTOStandard.Select_VATStatus(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("e1b7d37c-3b60-43fb-9d6c-479201ae892c");
    _FRSTOStandard.Enter_Date(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("e590a803-8a33-4d89-ae28-fb5ecc8577ec");
    _FRSTOStandard.Click_SaveButton();
    

    }

}
