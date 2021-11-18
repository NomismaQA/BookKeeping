package VAT3_InvoiceFullyReconcile;

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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/d4f97ecf-f641-437f-b445-fe65851ef39b
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1014, profileId = 100913)
public class ScriptEditSettingToVATType_DefaultProfileFullyReconcile_1 extends TestBase
{
	String sTestCaseID=null;
	String[] data=null;
	String Sheet = null;

    
 /*   @Test  (groups= {"ScriptEditSettingToVATType","ScriptEditSettingToVATType - Default Profile"})
    @TestModellerPath(guid = "d8352694-2a70-45cd-bee4-6ead99fb26d7")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlCl1() throws InterruptedException, InvalidFormatException
    {
    	sTestCaseID="TC1";
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
    

pages.EditSettingToStandard _EditSettingToStandard = new pages.EditSettingToStandard(driver);
//    TestModellerLogger.SetLastNodeGuid("be5994ab-08fc-491b-93e9-7e0d982cadb3");
//    _EditSettingToStandard.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("fce56750-e722-4b5b-a6b4-a88c3fc2a3f7");
//    _EditSettingToStandard.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f503a66c-5a3a-4197-b3ae-159ed01aa52c");
    _EditSettingToStandard.Click_SettingsTab();
    

    TestModellerLogger.SetLastNodeGuid("c92f0a95-9832-4576-a4fb-7c5179e2bd74");
    _EditSettingToStandard.Click_VATTab();
    

    TestModellerLogger.SetLastNodeGuid("af7a0151-5ddf-4c3a-9108-d2ee93cf17fd");
    _EditSettingToStandard.Click_EditButton();
    

    TestModellerLogger.SetLastNodeGuid("6d5eefd9-4f52-460d-a46c-cee2ff36ecef");
    _EditSettingToStandard.Click_VATTypeEdit();
    

    TestModellerLogger.SetLastNodeGuid("caa4ec7f-5c3f-4dc5-a5a0-b798ccb83a18");
    _EditSettingToStandard.Select_SelectVATType(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("e4d8d7c9-bc58-407d-bc46-cbb6f678bad3");
    _EditSettingToStandard.Click_SaveButton();
    

    }*/

    @Test  (groups= {"ScriptEditSettingToVATType","ScriptEditSettingToVATType - Default Profile"})
    @TestModellerPath(guid = "cc30fcac-6ce6-48e3-a27a-39ce73a6c042")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlCl2() throws InterruptedException, InvalidFormatException, HeadlessException, IOException, AWTException
    {
    	sTestCaseID="TC436";
    	Sheet="VAT3_Invoice";
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
//  TestModellerLogger.SetLastNodeGuid("69016c4b-a736-45bf-a682-5c03ee8d17cd");
//  _AgentsSelect.GoToUrl();
//  
//
//  TestModellerLogger.SetLastNodeGuid("bd071d41-148c-42e8-8300-984c9dd4df87");
//  _AgentsSelect.AssertUrl();
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
//    

    TestModellerLogger.SetLastNodeGuid("ff5edd38-07b0-452b-95d6-f33e07e1e975");
    _ClientSelect.Click_ClientsTAB();
    

    TestModellerLogger.SetLastNodeGuid("14a94a5a-c1ac-4e4f-afd4-69a84ffa5a24");
    _ClientSelect.Enter_ClientName(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("ed3e4750-33a4-4d75-a14c-9d75935c79c7");
    _ClientSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("e537c9d6-4166-4745-b27e-a178d69d2884");
    _ClientSelect.Click_SelectClient();
    
    pages.EditSettingToStandard _EditSettingToStandard = new pages.EditSettingToStandard(driver);
//  TestModellerLogger.SetLastNodeGuid("be5994ab-08fc-491b-93e9-7e0d982cadb3");
//  _EditSettingToStandard.GoToUrl();
//  
//
//  TestModellerLogger.SetLastNodeGuid("fce56750-e722-4b5b-a6b4-a88c3fc2a3f7");
//  _EditSettingToStandard.AssertUrl();
  

  TestModellerLogger.SetLastNodeGuid("f503a66c-5a3a-4197-b3ae-159ed01aa52c");
  _EditSettingToStandard.Click_SettingsTab();
  

  TestModellerLogger.SetLastNodeGuid("c92f0a95-9832-4576-a4fb-7c5179e2bd74");
  _EditSettingToStandard.Click_VATTab();
  

  TestModellerLogger.SetLastNodeGuid("af7a0151-5ddf-4c3a-9108-d2ee93cf17fd");
  _EditSettingToStandard.Click_EditButton();
  

  TestModellerLogger.SetLastNodeGuid("6d5eefd9-4f52-460d-a46c-cee2ff36ecef");
  _EditSettingToStandard.Click_VATTypeEdit();
  

  TestModellerLogger.SetLastNodeGuid("caa4ec7f-5c3f-4dc5-a5a0-b798ccb83a18");
  _EditSettingToStandard.Select_SelectVATType(data[5]);
  

  TestModellerLogger.SetLastNodeGuid("e4d8d7c9-bc58-407d-bc46-cbb6f678bad3");
  _EditSettingToStandard.Click_SaveButton();
  
//    pages.EditVATFlatPercentchange _EditVATFlatP = new pages.EditVATFlatPercentchange(driver);
////  TestModellerLogger.SetLastNodeGuid("dd1e0200-f5fc-4cc1-ac8c-c3f3f54ef89a");
////  _EditVATFlatP.GoToUrl();
////  
////
////  TestModellerLogger.SetLastNodeGuid("19cbed58-237a-4425-9611-58873165753f");
////  _EditVATFlatP.AssertUrl();
////  
//
//  TestModellerLogger.SetLastNodeGuid("abe69003-cc9b-4fe2-bbc2-c91a09307cee");
//  _EditVATFlatP.Click_SettingsTAB();
//  
//
//  TestModellerLogger.SetLastNodeGuid("20f7cfd4-2457-438d-a422-4da939a89fbb");
//  _EditVATFlatP.Click_VATTAB();
//  
//
//  TestModellerLogger.SetLastNodeGuid("54505770-a1e8-4377-ac49-541fb0a1966a");
//  _EditVATFlatP.Click_EditButton();
//  
//
//  TestModellerLogger.SetLastNodeGuid("f2dbde37-f5f4-4a6b-9d62-e6abd0838d7f");
//  _EditVATFlatP.Click_EditButton2();
//  
//
//  TestModellerLogger.SetLastNodeGuid("24de4095-7d42-45e1-8736-b89e52159258");
//  _EditVATFlatP.Select_VATStatus(data[5]);
//  
//
//  TestModellerLogger.SetLastNodeGuid("be7c6bc8-01b6-47f4-8c1e-d0f3eb10f652");
//  _EditVATFlatP.Enter_Date(data[6]);
//  
//
// TestModellerLogger.SetLastNodeGuid("63f4ddd4-cb02-49f7-829f-adc6ad538cba");
//  _EditVATFlatP.Click_UseDefaultRate();
//  
//
//  TestModellerLogger.SetLastNodeGuid("d8142d91-2dbf-4e7f-a99e-b52e2ea1b76b");
//  _EditVATFlatP.Enter_OverrideFLATRate(data[7]);
//  
//
//  TestModellerLogger.SetLastNodeGuid("21d0d0a3-6097-481d-b1e2-bde9881160a0");
//  _EditVATFlatP.Click_SaveButton();

    }

/*    @Test  (groups= {"ScriptEditSettingToVATType","ScriptEditSettingToVATType - Default Profile"})
    @TestModellerPath(guid = "6a60b533-63a6-4610-87bd-cac7e5cc0c21")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlCl3() throws InterruptedException
    {
        sTestCaseID="TC1";
    	Sheet="Sale_NewInvoice";
    	data = ExcelUtility.toReadExcelData(sTestCaseID, Sheet);
    	
        pages.Login1VAT _Login1VAT = new pages.Login1VAT(driver);
    TestModellerLogger.SetLastNodeGuid("93e4a214-3f97-41d2-8063-dd91c879e847");
    _Login1VAT.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7eff8b4c-1e47-48a4-bcad-b3639d0cdfd5");
    _Login1VAT.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ceaa193b-d8c0-48f9-911f-018e2571da20");
    _Login1VAT.Enter_UserName("Francis11");
    

    TestModellerLogger.SetLastNodeGuid("95b31ed9-af0a-49e7-8bfa-8471d379cdff");
    _Login1VAT.Enter_Password("JpixU1CE07");
    

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
    _AgentsSelect.Enter_AgentName("qui");
    

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
    _ClientSelect.Enter_ClientName("quisquam");
    

    TestModellerLogger.SetLastNodeGuid("ed3e4750-33a4-4d75-a14c-9d75935c79c7");
    _ClientSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("e537c9d6-4166-4745-b27e-a178d69d2884");
    _ClientSelect.Click_SelectClient();
    

pages.EditSettingToStandard _EditSettingToStandard = new pages.EditSettingToStandard(driver);
//    TestModellerLogger.SetLastNodeGuid("be5994ab-08fc-491b-93e9-7e0d982cadb3");
//    _EditSettingToStandard.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("fce56750-e722-4b5b-a6b4-a88c3fc2a3f7");
//    _EditSettingToStandard.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f503a66c-5a3a-4197-b3ae-159ed01aa52c");
    _EditSettingToStandard.Click_SettingsTab();
    

    TestModellerLogger.SetLastNodeGuid("c92f0a95-9832-4576-a4fb-7c5179e2bd74");
    _EditSettingToStandard.Click_VATTab();
    

    TestModellerLogger.SetLastNodeGuid("af7a0151-5ddf-4c3a-9108-d2ee93cf17fd");
    _EditSettingToStandard.Click_EditButton();
    

    TestModellerLogger.SetLastNodeGuid("6d5eefd9-4f52-460d-a46c-cee2ff36ecef");
    _EditSettingToStandard.Click_VATTypeEdit();
    

    TestModellerLogger.SetLastNodeGuid("caa4ec7f-5c3f-4dc5-a5a0-b798ccb83a18");
    _EditSettingToStandard.Select_SelectVATType("FLATRATE VAT");
    

    TestModellerLogger.SetLastNodeGuid("e4d8d7c9-bc58-407d-bc46-cbb6f678bad3");
    _EditSettingToStandard.Click_SaveButton();
    

    }*/

}
