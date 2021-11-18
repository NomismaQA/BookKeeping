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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/e3b55d21-3246-444a-b1d7-d6c562e506d6
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 905, profileId = 100801)
public class Script_Suopplier_StandardToNOVAT_DefaultProfile extends TestBase
{
	String sTestCaseID=null;
	String[] data=null;
	
	String Sheet = null;

    
    @Test  (groups= {"ScriptStandardToNOVAT","ScriptStandardToNOVAT - Default Profile"})
    @TestModellerPath(guid = "a416f6b6-3d05-4a7a-8d99-67e3bc0b8079")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlCl1() throws InterruptedException, InvalidFormatException
    {
    	sTestCaseID="TC177";
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
    

pages.StandardToNoVAT _StandardToNoVAT = new pages.StandardToNoVAT(driver);
//    TestModellerLogger.SetLastNodeGuid("966dec01-c823-4135-808e-d24eb2d03157");
//    _StandardToNoVAT.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("6e094f84-0e86-4a07-a5eb-3e7cae1d42e1");
//    _StandardToNoVAT.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("9cfa961e-ba07-4816-92ec-6f23c7648601");
    _StandardToNoVAT.Click_SettingsTAB();
    

    TestModellerLogger.SetLastNodeGuid("ff070664-6141-4cf4-8ae0-43351679f732");
    _StandardToNoVAT.Click_VATTAB();
    

    TestModellerLogger.SetLastNodeGuid("e90f4267-7405-4b6f-970b-8eb23a0d807a");
    _StandardToNoVAT.Click_EditTab();
    

    TestModellerLogger.SetLastNodeGuid("4b98baf8-36fd-4519-815e-ce754903d415");
    _StandardToNoVAT.Click_AddButton();
    

    TestModellerLogger.SetLastNodeGuid("d2bfe41d-3a6b-4f9e-80c7-ef10fda3ee16");
    _StandardToNoVAT.Select_VATType(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("91008dff-a94d-4433-a631-10a33f0b4411");
    _StandardToNoVAT.Enter_SchemeEffectiveDate(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("865846cd-f217-40e2-97ae-9b8616f6e984");
    _StandardToNoVAT.Click_SaveButton();
    

    }

 /*   @Test  (groups= {"ScriptStandardToNOVAT","ScriptStandardToNOVAT - Default Profile"})
    @TestModellerPath(guid = "b3f8dbc0-d349-4271-9b83-cac93c7dea01")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlCl2() throws InterruptedException, InvalidFormatException
    {
        
    	sTestCaseID="TC15";
    	Sheet="Sale_NewInvoice";
    data = ExcelUtility.toReadExcelData(sTestCaseID, Sheet);
    
        pages.Login1VAT _Login1VAT = new pages.Login1VAT(driver);
    TestModellerLogger.SetLastNodeGuid("93e4a214-3f97-41d2-8063-dd91c879e847");
    _Login1VAT.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7eff8b4c-1e47-48a4-bcad-b3639d0cdfd5");
    _Login1VAT.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ceaa193b-d8c0-48f9-911f-018e2571da20");
    _Login1VAT.Enter_UserName("Zaria_Gulgowski");
    

    TestModellerLogger.SetLastNodeGuid("95b31ed9-af0a-49e7-8bfa-8471d379cdff");
    _Login1VAT.Enter_Password("S9vbIHg6YI");
    

    TestModellerLogger.SetLastNodeGuid("942414e4-1d0e-45ba-bdd1-43293b97e0ff");
    _Login1VAT.Click_LoginButton();
    

pages.AgentsSelect _AgentsSelect = new pages.AgentsSelect(driver);
    TestModellerLogger.SetLastNodeGuid("69016c4b-a736-45bf-a682-5c03ee8d17cd");
    _AgentsSelect.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("bd071d41-148c-42e8-8300-984c9dd4df87");
    _AgentsSelect.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("bd031a68-650a-4b8c-8e7c-0ce87415e17e");
    _AgentsSelect.Click_AgentsTab();
    

    TestModellerLogger.SetLastNodeGuid("d5b61053-e5d4-479f-87c7-e4be6b5f054a");
    _AgentsSelect.Enter_AgentName("odit");
    

    TestModellerLogger.SetLastNodeGuid("2bae82eb-0e45-434c-b1bd-7336f304d4f9");
    _AgentsSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("be317b25-3125-4191-86a5-e8ffee0d0334");
    _AgentsSelect.Click_SelectAgent();
    

pages.ClientSelect _ClientSelect = new pages.ClientSelect(driver);
    TestModellerLogger.SetLastNodeGuid("1243c994-d23d-40d1-bc93-38dfdab760ed");
    _ClientSelect.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("b42ff41f-2fec-4f5c-b77b-2742ec894ec7");
    _ClientSelect.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ff5edd38-07b0-452b-95d6-f33e07e1e975");
    _ClientSelect.Click_ClientsTAB();
    

    TestModellerLogger.SetLastNodeGuid("14a94a5a-c1ac-4e4f-afd4-69a84ffa5a24");
    _ClientSelect.Enter_ClientName("exercitationem");
    

    TestModellerLogger.SetLastNodeGuid("ed3e4750-33a4-4d75-a14c-9d75935c79c7");
    _ClientSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("e537c9d6-4166-4745-b27e-a178d69d2884");
    _ClientSelect.Click_SelectClient();
    

pages.StandardToNoVAT _StandardToNoVAT = new pages.StandardToNoVAT(driver);
    TestModellerLogger.SetLastNodeGuid("966dec01-c823-4135-808e-d24eb2d03157");
    _StandardToNoVAT.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("6e094f84-0e86-4a07-a5eb-3e7cae1d42e1");
    _StandardToNoVAT.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("9cfa961e-ba07-4816-92ec-6f23c7648601");
    _StandardToNoVAT.Click_SettingsTAB();
    

    TestModellerLogger.SetLastNodeGuid("ff070664-6141-4cf4-8ae0-43351679f732");
    _StandardToNoVAT.Click_VATTAB();
    

    TestModellerLogger.SetLastNodeGuid("e90f4267-7405-4b6f-970b-8eb23a0d807a");
    _StandardToNoVAT.Click_EditTab();
    

    TestModellerLogger.SetLastNodeGuid("4b98baf8-36fd-4519-815e-ce754903d415");
    _StandardToNoVAT.Click_AddButton();
    

    TestModellerLogger.SetLastNodeGuid("d2bfe41d-3a6b-4f9e-80c7-ef10fda3ee16");
    _StandardToNoVAT.Select_VATType("STANDARD VAT");
    

    TestModellerLogger.SetLastNodeGuid("91008dff-a94d-4433-a631-10a33f0b4411");
    _StandardToNoVAT.Enter_SchemeEffectiveDate("44221");
    

    TestModellerLogger.SetLastNodeGuid("865846cd-f217-40e2-97ae-9b8616f6e984");
    _StandardToNoVAT.Click_SaveButton();
    

    }

    @Test  (groups= {"ScriptStandardToNOVAT","ScriptStandardToNOVAT - Default Profile"})
    @TestModellerPath(guid = "0232ee13-e353-41cb-be5a-05bd7497d0f1")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlCl3() throws InterruptedException
    {
        
        pages.Login1VAT _Login1VAT = new pages.Login1VAT(driver);
    TestModellerLogger.SetLastNodeGuid("93e4a214-3f97-41d2-8063-dd91c879e847");
    _Login1VAT.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7eff8b4c-1e47-48a4-bcad-b3639d0cdfd5");
    _Login1VAT.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ceaa193b-d8c0-48f9-911f-018e2571da20");
    _Login1VAT.Enter_UserName("Tyree_Tremblay");
    

    TestModellerLogger.SetLastNodeGuid("95b31ed9-af0a-49e7-8bfa-8471d379cdff");
    _Login1VAT.Enter_Password("2i8MfyExZ2");
    

    TestModellerLogger.SetLastNodeGuid("942414e4-1d0e-45ba-bdd1-43293b97e0ff");
    _Login1VAT.Click_LoginButton();
    

pages.AgentsSelect _AgentsSelect = new pages.AgentsSelect(driver);
    TestModellerLogger.SetLastNodeGuid("69016c4b-a736-45bf-a682-5c03ee8d17cd");
    _AgentsSelect.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("bd071d41-148c-42e8-8300-984c9dd4df87");
    _AgentsSelect.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("bd031a68-650a-4b8c-8e7c-0ce87415e17e");
    _AgentsSelect.Click_AgentsTab();
    

    TestModellerLogger.SetLastNodeGuid("d5b61053-e5d4-479f-87c7-e4be6b5f054a");
    _AgentsSelect.Enter_AgentName("repellat");
    

    TestModellerLogger.SetLastNodeGuid("2bae82eb-0e45-434c-b1bd-7336f304d4f9");
    _AgentsSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("be317b25-3125-4191-86a5-e8ffee0d0334");
    _AgentsSelect.Click_SelectAgent();
    

pages.ClientSelect _ClientSelect = new pages.ClientSelect(driver);
    TestModellerLogger.SetLastNodeGuid("1243c994-d23d-40d1-bc93-38dfdab760ed");
    _ClientSelect.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("b42ff41f-2fec-4f5c-b77b-2742ec894ec7");
    _ClientSelect.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ff5edd38-07b0-452b-95d6-f33e07e1e975");
    _ClientSelect.Click_ClientsTAB();
    

    TestModellerLogger.SetLastNodeGuid("14a94a5a-c1ac-4e4f-afd4-69a84ffa5a24");
    _ClientSelect.Enter_ClientName("eveniet");
    

    TestModellerLogger.SetLastNodeGuid("ed3e4750-33a4-4d75-a14c-9d75935c79c7");
    _ClientSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("e537c9d6-4166-4745-b27e-a178d69d2884");
    _ClientSelect.Click_SelectClient();
    

pages.StandardToNoVAT _StandardToNoVAT = new pages.StandardToNoVAT(driver);
    TestModellerLogger.SetLastNodeGuid("966dec01-c823-4135-808e-d24eb2d03157");
    _StandardToNoVAT.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("6e094f84-0e86-4a07-a5eb-3e7cae1d42e1");
    _StandardToNoVAT.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("9cfa961e-ba07-4816-92ec-6f23c7648601");
    _StandardToNoVAT.Click_SettingsTAB();
    

    TestModellerLogger.SetLastNodeGuid("ff070664-6141-4cf4-8ae0-43351679f732");
    _StandardToNoVAT.Click_VATTAB();
    

    TestModellerLogger.SetLastNodeGuid("e90f4267-7405-4b6f-970b-8eb23a0d807a");
    _StandardToNoVAT.Click_EditTab();
    

    TestModellerLogger.SetLastNodeGuid("4b98baf8-36fd-4519-815e-ce754903d415");
    _StandardToNoVAT.Click_AddButton();
    

    TestModellerLogger.SetLastNodeGuid("d2bfe41d-3a6b-4f9e-80c7-ef10fda3ee16");
    _StandardToNoVAT.Select_VATType("FLATRATE VAT");
    

    TestModellerLogger.SetLastNodeGuid("91008dff-a94d-4433-a631-10a33f0b4411");
    _StandardToNoVAT.Enter_SchemeEffectiveDate("44221");
    

    TestModellerLogger.SetLastNodeGuid("865846cd-f217-40e2-97ae-9b8616f6e984");
    _StandardToNoVAT.Click_SaveButton();
    

    }*/

}
