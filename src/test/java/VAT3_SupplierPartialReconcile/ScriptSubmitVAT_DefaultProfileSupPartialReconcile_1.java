package VAT3_SupplierPartialReconcile;

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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/259baa6e-bb21-438c-bb56-b2ec82a7209c
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 978, profileId = 100869)
public class ScriptSubmitVAT_DefaultProfileSupPartialReconcile_1 extends TestBase
{
	String sTestCaseID=null;
	String[] data=null;
	String Sheet = null;

    
    @Test  (groups= {"ScriptVATReturn1stVATReturnReport","ScriptVATReturn1stVATReturnReport - Default Profile"})
    @TestModellerPath(guid = "0851a750-a8bf-40e7-a71b-cab9aa2d47fd")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlCl() throws InterruptedException, InvalidFormatException
    {
    	
    	sTestCaseID="TC586";
    	Sheet="VAT3_SupplierPArtial";
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
//    

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
    

    pages.SubmitVAT_input _SubmitVAT = new pages.SubmitVAT_input(driver);
//    TestModellerLogger.SetLastNodeGuid("15f9fa4a-8532-4032-b0bf-cafbb3b4e392");
//    _SubmitVAT.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("935de893-b654-454a-b8a7-b14007778b92");
//    _SubmitVAT.AssertUrl();
    
    TestModellerLogger.SetLastNodeGuid("4a2f95d8-3539-411e-9137-64e9b56f2b10");
    _SubmitVAT.Click_VATReturnsTAB();
    

    TestModellerLogger.SetLastNodeGuid("0f96de08-35de-4dce-970d-0a6ddc281f00");
    _SubmitVAT.Click_ClickOnEditLink();
    

    TestModellerLogger.SetLastNodeGuid("e82ad76f-ea2f-4a04-943b-aaf520f978d0");
    _SubmitVAT.Select_VATTypeCategory(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("e82d1a89-7cd9-4dd7-87c2-1c9887ff7252");
    _SubmitVAT.Click_SaveContinue();
    

    TestModellerLogger.SetLastNodeGuid("39a36972-765d-4cda-8ecb-33e496954625");
    _SubmitVAT.Click_MarkasFiled();
    

    }

}
