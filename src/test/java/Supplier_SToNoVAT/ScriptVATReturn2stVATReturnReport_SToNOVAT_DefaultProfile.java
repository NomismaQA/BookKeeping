package Supplier_SToNoVAT;

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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/2a0650a1-85af-44b2-b854-57d71eba6013
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 979, profileId = 100870)
public class ScriptVATReturn2stVATReturnReport_SToNOVAT_DefaultProfile extends TestBase
{
	String sTestCaseID=null;
	String[] data=null;
	String Sheet = null;

    
    @Test  (groups= {"ScriptVATReturn2stVATReturnReport","ScriptVATReturn2stVATReturnReport - Default Profile"})
    @TestModellerPath(guid = "9d44cf6f-3ba5-4fa8-9eca-3e2f661fe1a6")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlCl() throws InterruptedException, InvalidFormatException
    {
    	sTestCaseID="TC175";
    	Sheet="Supplier";
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
    

pages.VATReturn2stVATReturnReport _VATReturn2stVATReturnReport = new pages.VATReturn2stVATReturnReport(driver);
//    TestModellerLogger.SetLastNodeGuid("575d6d54-f8f3-46ae-86f4-44bbb4110820");
//    _VATReturn2stVATReturnReport.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5783c53f-8aa4-434c-9fda-b7cf007f2190");
//    _VATReturn2stVATReturnReport.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("21719f97-70cf-400b-841d-fcd475e03ef5");
    _VATReturn2stVATReturnReport.Click_VATReturnsTAB2();
    

    TestModellerLogger.SetLastNodeGuid("49135dbe-f8dd-4acd-9409-1debc577f7b8");
    _VATReturn2stVATReturnReport.Click_SettingTab2();
    

    TestModellerLogger.SetLastNodeGuid("b488bec7-fb80-418d-8dc7-0900b85c7edc");
    _VATReturn2stVATReturnReport.Click_VATReturnBackupReport();
    

    TestModellerLogger.SetLastNodeGuid("0c8031b0-9c4a-476d-bbe8-18cc99d8d3f9");
    _VATReturn2stVATReturnReport.Click_DownloadVATReturnBackupReport();
    

    TestModellerLogger.SetLastNodeGuid("c52ffb87-ef26-4e2f-8f01-55c75ec823b6");
    _VATReturn2stVATReturnReport.Click__VATReturnBackupReportClose();
    

    }

}
