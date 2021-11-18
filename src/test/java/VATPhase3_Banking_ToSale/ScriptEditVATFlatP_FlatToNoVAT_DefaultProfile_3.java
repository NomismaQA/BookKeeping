package VATPhase3_Banking_ToSale;

import reports.TestNGListener;
import tests.TestBase;
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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/417315e1-5540-483d-a955-b651f8fe2f83
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1080, profileId = 100980)
public class ScriptEditVATFlatP_FlatToNoVAT_DefaultProfile_3 extends TestBase
{
    
	String sTestCaseID=null;
	String[] data=null;
	String Sheet = null;
    
   /* @Test  (groups= {"ScriptEditVATFlatP","ScriptEditVATFlatP - Default Profile"})
    @TestModellerPath(guid = "ee264de2-5641-4153-b096-c9c23eed3a23")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlCl1()
    {
        
        pages.Login1VAT _Login1VAT = new pages.Login1VAT(driver);
    TestModellerLogger.SetLastNodeGuid("93e4a214-3f97-41d2-8063-dd91c879e847");
    _Login1VAT.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7eff8b4c-1e47-48a4-bcad-b3639d0cdfd5");
    _Login1VAT.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ceaa193b-d8c0-48f9-911f-018e2571da20");
    _Login1VAT.Enter_UserName("Lucio_Ryan59");
    

    TestModellerLogger.SetLastNodeGuid("95b31ed9-af0a-49e7-8bfa-8471d379cdff");
    _Login1VAT.Enter_Password("4wINcwA0fj");
    

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
    _AgentsSelect.Enter_AgentName("rerum");
    

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
    _ClientSelect.Enter_ClientName("animi");
    

    TestModellerLogger.SetLastNodeGuid("ed3e4750-33a4-4d75-a14c-9d75935c79c7");
    _ClientSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("e537c9d6-4166-4745-b27e-a178d69d2884");
    _ClientSelect.Click_SelectClient();
    

pages.EditVATFlatP _EditVATFlatP = new pages.EditVATFlatP(driver);
    TestModellerLogger.SetLastNodeGuid("dd1e0200-f5fc-4cc1-ac8c-c3f3f54ef89a");
    _EditVATFlatP.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("19cbed58-237a-4425-9611-58873165753f");
    _EditVATFlatP.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("abe69003-cc9b-4fe2-bbc2-c91a09307cee");
    _EditVATFlatP.Click_SettingsTAB();
    

    TestModellerLogger.SetLastNodeGuid("20f7cfd4-2457-438d-a422-4da939a89fbb");
    _EditVATFlatP.Click_VATTAB();
    

    TestModellerLogger.SetLastNodeGuid("54505770-a1e8-4377-ac49-541fb0a1966a");
    _EditVATFlatP.Click_EditButton();
    

    TestModellerLogger.SetLastNodeGuid("f2dbde37-f5f4-4a6b-9d62-e6abd0838d7f");
    _EditVATFlatP.Click_EditButton2();
    

    TestModellerLogger.SetLastNodeGuid("24de4095-7d42-45e1-8736-b89e52159258");
    _EditVATFlatP.Select_VATStatus("NO VAT");
    

    TestModellerLogger.SetLastNodeGuid("be7c6bc8-01b6-47f4-8c1e-d0f3eb10f652");
    _EditVATFlatP.Enter_Date("44245");
    

    TestModellerLogger.SetLastNodeGuid("63f4ddd4-cb02-49f7-829f-adc6ad538cba");
    _EditVATFlatP.Click_UseDefaultRate();
    

    TestModellerLogger.SetLastNodeGuid("d8142d91-2dbf-4e7f-a99e-b52e2ea1b76b");
    _EditVATFlatP.Enter_OverrideFLATRate();
    

    TestModellerLogger.SetLastNodeGuid("21d0d0a3-6097-481d-b1e2-bde9881160a0");
    _EditVATFlatP.Click_SaveButton();
    

    }

    @Test  (groups= {"ScriptEditVATFlatP","ScriptEditVATFlatP - Default Profile"})
    @TestModellerPath(guid = "6d883401-4262-4d90-b45d-2de9d0717241")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlCl2()
    {
        
        pages.Login1VAT _Login1VAT = new pages.Login1VAT(driver);
    TestModellerLogger.SetLastNodeGuid("93e4a214-3f97-41d2-8063-dd91c879e847");
    _Login1VAT.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7eff8b4c-1e47-48a4-bcad-b3639d0cdfd5");
    _Login1VAT.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ceaa193b-d8c0-48f9-911f-018e2571da20");
    _Login1VAT.Enter_UserName("Hayley.Abbott5");
    

    TestModellerLogger.SetLastNodeGuid("95b31ed9-af0a-49e7-8bfa-8471d379cdff");
    _Login1VAT.Enter_Password("W7PxKPDbK3");
    

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
    _AgentsSelect.Enter_AgentName("animi");
    

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
    _ClientSelect.Enter_ClientName("dolorem");
    

    TestModellerLogger.SetLastNodeGuid("ed3e4750-33a4-4d75-a14c-9d75935c79c7");
    _ClientSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("e537c9d6-4166-4745-b27e-a178d69d2884");
    _ClientSelect.Click_SelectClient();
    

pages.EditVATFlatP _EditVATFlatP = new pages.EditVATFlatP(driver);
    TestModellerLogger.SetLastNodeGuid("dd1e0200-f5fc-4cc1-ac8c-c3f3f54ef89a");
    _EditVATFlatP.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("19cbed58-237a-4425-9611-58873165753f");
    _EditVATFlatP.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("abe69003-cc9b-4fe2-bbc2-c91a09307cee");
    _EditVATFlatP.Click_SettingsTAB();
    

    TestModellerLogger.SetLastNodeGuid("20f7cfd4-2457-438d-a422-4da939a89fbb");
    _EditVATFlatP.Click_VATTAB();
    

    TestModellerLogger.SetLastNodeGuid("54505770-a1e8-4377-ac49-541fb0a1966a");
    _EditVATFlatP.Click_EditButton();
    

    TestModellerLogger.SetLastNodeGuid("f2dbde37-f5f4-4a6b-9d62-e6abd0838d7f");
    _EditVATFlatP.Click_EditButton2();
    

    TestModellerLogger.SetLastNodeGuid("24de4095-7d42-45e1-8736-b89e52159258");
    _EditVATFlatP.Select_VATStatus("STANDARD VAT");
    

    TestModellerLogger.SetLastNodeGuid("be7c6bc8-01b6-47f4-8c1e-d0f3eb10f652");
    _EditVATFlatP.Enter_Date("44245");
    

    TestModellerLogger.SetLastNodeGuid("63f4ddd4-cb02-49f7-829f-adc6ad538cba");
    _EditVATFlatP.Click_UseDefaultRate();
    

    TestModellerLogger.SetLastNodeGuid("d8142d91-2dbf-4e7f-a99e-b52e2ea1b76b");
    _EditVATFlatP.Enter_OverrideFLATRate();
    

    TestModellerLogger.SetLastNodeGuid("21d0d0a3-6097-481d-b1e2-bde9881160a0");
    _EditVATFlatP.Click_SaveButton();
    

    }*/

    @Test  (groups= {"ScriptEditVATFlatP","ScriptEditVATFlatP - Default Profile"})
    @TestModellerPath(guid = "e640ed48-5d15-47cf-a385-f005e6b29cb9")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlCl3() throws InterruptedException, InvalidFormatException, HeadlessException, IOException, AWTException
    {
    	sTestCaseID="TC29";
    	Sheet="VATP3";
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
    

pages.EditVATFlatP _EditVATFlatP = new pages.EditVATFlatP(driver);
//    TestModellerLogger.SetLastNodeGuid("dd1e0200-f5fc-4cc1-ac8c-c3f3f54ef89a");
//    _EditVATFlatP.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("19cbed58-237a-4425-9611-58873165753f");
//    _EditVATFlatP.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("abe69003-cc9b-4fe2-bbc2-c91a09307cee");
    _EditVATFlatP.Click_SettingsTAB();
    

    TestModellerLogger.SetLastNodeGuid("20f7cfd4-2457-438d-a422-4da939a89fbb");
    _EditVATFlatP.Click_VATTAB();
    

    TestModellerLogger.SetLastNodeGuid("54505770-a1e8-4377-ac49-541fb0a1966a");
    _EditVATFlatP.Click_EditButton();
    

    TestModellerLogger.SetLastNodeGuid("f2dbde37-f5f4-4a6b-9d62-e6abd0838d7f");
    _EditVATFlatP.Click_EditButton2();
    

    TestModellerLogger.SetLastNodeGuid("24de4095-7d42-45e1-8736-b89e52159258");
    _EditVATFlatP.Select_VATStatus(data[5]);
    

//    TestModellerLogger.SetLastNodeGuid("be7c6bc8-01b6-47f4-8c1e-d0f3eb10f652");
//    _EditVATFlatP.Enter_Date(data[6]);
//    

//   TestModellerLogger.SetLastNodeGuid("63f4ddd4-cb02-49f7-829f-adc6ad538cba");
//  _EditVATFlatP.Click_UseDefaultRate();
//   

//   TestModellerLogger.SetLastNodeGuid("d8142d91-2dbf-4e7f-a99e-b52e2ea1b76b");
//    _EditVATFlatP.Enter_OverrideFLATRate(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("21d0d0a3-6097-481d-b1e2-bde9881160a0");
    _EditVATFlatP.Click_SaveButton();
    

    }

}
