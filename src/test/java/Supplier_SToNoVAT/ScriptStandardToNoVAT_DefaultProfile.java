package Supplier_SToNoVAT;

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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/b962c57b-e736-44d2-bf2a-a87e9aa8cc70
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 877, profileId = 100757)
public class ScriptStandardToNoVAT_DefaultProfile extends TestBase
{
	String sTestCaseID=null;
	String[] data=null;
	String Sheet = null;
  
    @Test  (groups= {"ScriptStandardToFlat","ScriptStandardToFlat - Default Profile"})
    @TestModellerPath(guid = "a31ff5c7-b479-4c4e-99ce-753ccd14ceb5")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlCl1() throws InterruptedException, InvalidFormatException, HeadlessException, IOException, AWTException
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
    

pages.StandardToFlat _StandardToFlat = new pages.StandardToFlat(driver);
//    TestModellerLogger.SetLastNodeGuid("78f4e742-ca7d-4c20-a6ad-983318b03b31");
//    _StandardToFlat.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("9f7475c5-36e8-4718-896c-b46054d5e5f0");
//    _StandardToFlat.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("37ef2e2b-f555-487e-a068-0cfe5139f16d");
    _StandardToFlat.Click_SettingsTab();
    

    TestModellerLogger.SetLastNodeGuid("0ce13996-b4ad-44b0-a53e-37086e66ad21");
    _StandardToFlat.Click_VATTAB();
    

    TestModellerLogger.SetLastNodeGuid("8d57d627-56c2-4987-b91e-0232c689faa0");
    _StandardToFlat.Click_EditButton();
    

    TestModellerLogger.SetLastNodeGuid("7908546c-882d-4070-a1f5-93887407b27b");
    _StandardToFlat.Click_AddTab();
    

    TestModellerLogger.SetLastNodeGuid("4aeed1f7-ac65-4327-843e-31ab2119f7ba");
    _StandardToFlat.Select_VATStatus(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("514df5f7-6f52-45a6-a507-9859d88e21ca");
    _StandardToFlat.Enter_SchemeEffectiveDate(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("dbb0d99a-73dd-4431-80dd-1b5b97944c00");
    _StandardToFlat.Click_DefaultFlatRate();
    

    TestModellerLogger.SetLastNodeGuid("eae0b017-1107-4fd4-9e16-1b5f073c567d");
    _StandardToFlat.Enter_OverrideFlatRate(data[7]);
    

    TestModellerLogger.SetLastNodeGuid("48636868-2074-45b3-80b7-74db27e7a625");
    _StandardToFlat.Click_SaveButton();
    

    }

 /* @Test  (groups= {"ScriptStandardToFlat","ScriptStandardToFlat - Default Profile"})
    @TestModellerPath(guid = "81d2c6da-d6c8-43a9-88e4-33be94ce41b5")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlCl2() throws InterruptedException, InvalidFormatException
    {
	   
	   sTestCaseID="TC8";
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
    

pages.StandardToFlat _StandardToFlat = new pages.StandardToFlat(driver);
//    TestModellerLogger.SetLastNodeGuid("78f4e742-ca7d-4c20-a6ad-983318b03b31");
//    _StandardToFlat.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("9f7475c5-36e8-4718-896c-b46054d5e5f0");
//    _StandardToFlat.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("37ef2e2b-f555-487e-a068-0cfe5139f16d");
    _StandardToFlat.Click_SettingsTab();
    

    TestModellerLogger.SetLastNodeGuid("0ce13996-b4ad-44b0-a53e-37086e66ad21");
    _StandardToFlat.Click_VATTAB();
    

    TestModellerLogger.SetLastNodeGuid("8d57d627-56c2-4987-b91e-0232c689faa0");
    _StandardToFlat.Click_EditButton();
    

    TestModellerLogger.SetLastNodeGuid("7908546c-882d-4070-a1f5-93887407b27b");
    _StandardToFlat.Click_AddTab();
    

    TestModellerLogger.SetLastNodeGuid("4aeed1f7-ac65-4327-843e-31ab2119f7ba");
    _StandardToFlat.Select_VATStatus(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("514df5f7-6f52-45a6-a507-9859d88e21ca");
    _StandardToFlat.Enter_SchemeEffectiveDate(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("dbb0d99a-73dd-4431-80dd-1b5b97944c00");
    _StandardToFlat.Click_DefaultFlatRate();
    

    TestModellerLogger.SetLastNodeGuid("eae0b017-1107-4fd4-9e16-1b5f073c567d");
    _StandardToFlat.Enter_OverrideFlatRate(data[7]);
    

    TestModellerLogger.SetLastNodeGuid("48636868-2074-45b3-80b7-74db27e7a625");
    _StandardToFlat.Click_SaveButton();
    

    }

   /* @Test  (groups= {"ScriptStandardToFlat","ScriptStandardToFlat - Default Profile"})
    @TestModellerPath(guid = "569f474d-5c9e-41bf-ad01-d8008d55d324")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlCl3() throws InterruptedException
    {
        
        pages.Login1VAT _Login1VAT = new pages.Login1VAT(driver);
    TestModellerLogger.SetLastNodeGuid("93e4a214-3f97-41d2-8063-dd91c879e847");
    _Login1VAT.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7eff8b4c-1e47-48a4-bcad-b3639d0cdfd5");
    _Login1VAT.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ceaa193b-d8c0-48f9-911f-018e2571da20");
    _Login1VAT.Enter_UserName("Alyce.Boehm");
    

    TestModellerLogger.SetLastNodeGuid("95b31ed9-af0a-49e7-8bfa-8471d379cdff");
    _Login1VAT.Enter_Password("iX30TSPm66");
    

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
    _AgentsSelect.Enter_AgentName("omnis");
    

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
    _ClientSelect.Enter_ClientName("sit");
    

    TestModellerLogger.SetLastNodeGuid("ed3e4750-33a4-4d75-a14c-9d75935c79c7");
    _ClientSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("e537c9d6-4166-4745-b27e-a178d69d2884");
    _ClientSelect.Click_SelectClient();
    

pages.StandardToFlat _StandardToFlat = new pages.StandardToFlat(driver);
    TestModellerLogger.SetLastNodeGuid("78f4e742-ca7d-4c20-a6ad-983318b03b31");
    _StandardToFlat.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("9f7475c5-36e8-4718-896c-b46054d5e5f0");
    _StandardToFlat.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("37ef2e2b-f555-487e-a068-0cfe5139f16d");
    _StandardToFlat.Click_SettingsTab();
    

    TestModellerLogger.SetLastNodeGuid("0ce13996-b4ad-44b0-a53e-37086e66ad21");
    _StandardToFlat.Click_VATTAB();
    

    TestModellerLogger.SetLastNodeGuid("8d57d627-56c2-4987-b91e-0232c689faa0");
    _StandardToFlat.Click_EditButton();
    

    TestModellerLogger.SetLastNodeGuid("7908546c-882d-4070-a1f5-93887407b27b");
    _StandardToFlat.Click_AddTab();
    

    TestModellerLogger.SetLastNodeGuid("4aeed1f7-ac65-4327-843e-31ab2119f7ba");
    _StandardToFlat.Select_VATStatus("FLATRATE VAT");
    

    TestModellerLogger.SetLastNodeGuid("514df5f7-6f52-45a6-a507-9859d88e21ca");
    _StandardToFlat.Enter_SchemeEffectiveDate("44216");
    

    TestModellerLogger.SetLastNodeGuid("dbb0d99a-73dd-4431-80dd-1b5b97944c00");
    _StandardToFlat.Click_DefaultFlatRate();
    

    TestModellerLogger.SetLastNodeGuid("eae0b017-1107-4fd4-9e16-1b5f073c567d");
    _StandardToFlat.Enter_OverrideFlatRate("");
    

    TestModellerLogger.SetLastNodeGuid("48636868-2074-45b3-80b7-74db27e7a625");
    _StandardToFlat.Click_SaveButton();
    

    }*/

}
