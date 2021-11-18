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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/0d413259-3736-4b26-9604-87d9ecee8286
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 871, profileId = 100750)
public class NewScripWithVATType_DefaultProfile extends TestBase
{
    
	String sTestCaseID=null;
	String[] data=null;
	String Sheet = null;
    
    @Test  (groups= {"NewScripWithVATType","NewScripWithVATType - Default Profile"})
    @TestModellerPath(guid = "0ac5d5cd-ffe5-4b0b-b2e9-4b5921045156")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlCl1() throws InterruptedException, InvalidFormatException, HeadlessException, IOException, AWTException
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
    

    TestModellerLogger.SetLastNodeGuid("eae0b017-17-4fd4-9e16-1b5f073c567d");
    _StandardToFlat.Enter_OverrideFlatRate(data[7]);
    

    TestModellerLogger.SetLastNodeGuid("48636868-2074-45b3-80b7-74db27e7a625");
    _StandardToFlat.Click_SaveButton();
    

pages.SaleInvoice _SaleInvoice = new pages.SaleInvoice(driver);

//    TestModellerLogger.SetLastNodeGuid("2f331494-c0ec-443e-b258-bdf3d2f9d9fc");
//    _SaleInvoice.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("281121da-f0ce-4629-a4d1-0bc9b4260347");
//    _SaleInvoice.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("38510c8a-daac-4ff8-83f3-54b176440787");
    _SaleInvoice.Click_SalesTab();
    

    TestModellerLogger.SetLastNodeGuid("2ce6ef22-01ee-4e82-bcb0-f7ce06badd95");
    _SaleInvoice.Click_NewButton();
    

    TestModellerLogger.SetLastNodeGuid("b605bf48-53b8-4f7f-a009-9ea8d59b69ba");
    _SaleInvoice.Click_NewInvoice();
    

    TestModellerLogger.SetLastNodeGuid("4e83b316-7f8b-49b7-a97f-e85cefb020f0");
    _SaleInvoice.Select_CustomerName(data[8]);
    

    TestModellerLogger.SetLastNodeGuid("f3edcc35-8d70-4902-81f0-9c5d760fac46");
    _SaleInvoice.Enter_InvoiceNo(data[9]);
    

    TestModellerLogger.SetLastNodeGuid("6f885a16-e34c-4d0d-914a-a726c1fa9617");
    _SaleInvoice.Enter_InvoiceDate(data[10]);
    

    TestModellerLogger.SetLastNodeGuid("294097b8-ccc5-4eb7-baec-1a26ca1364f0");
    _SaleInvoice.Select_IncomeType(data[11]);
    

    TestModellerLogger.SetLastNodeGuid("5ccbf01b-65a3-47f5-b916-dab48aab691f");
    _SaleInvoice.Enter_Description(data[12]);
    

    TestModellerLogger.SetLastNodeGuid("73677a32-1892-47f6-9783-a1072478778a");
    _SaleInvoice.Enter_UnitPrice(data[13]);
    

    TestModellerLogger.SetLastNodeGuid("d810d5bf-a960-434c-9172-1671dd383495");
    _SaleInvoice.Enter_Quantity(data[14]);
    

    TestModellerLogger.SetLastNodeGuid("516c7236-f043-4de9-b128-99997ccf1604");
    _SaleInvoice.Select_VATRate(data[15]);
    

    TestModellerLogger.SetLastNodeGuid("cb6d5101-0be0-4519-b1aa-5e71dcdfbef3");
    _SaleInvoice.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("6aeae28b-fd85-4712-8710-18e4b190dd19");
    _SaleInvoice.Enter_Note(data[16]);
    

    TestModellerLogger.SetLastNodeGuid("2508d3fa-348f-48f2-914a-4d43591ded90");
    _SaleInvoice.Click_SaveButton();
    

//pages.VerifyVATType _VerifyVATType = new pages.VerifyVATType(driver);
//   TestModellerLogger.SetLastNodeGuid("33bfee7d-07ef-4f6b-b603-c0c11c635aec");
//    _VerifyVATType.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("94b51cb9-9f8f-4c45-aeee-e72bc55702c4");
//    _VerifyVATType.AssertUrl();
    

//    TestModellerLogger.SetLastNodeGuid("0ed3bf93-1b63-4256-9d75-87c23eed1f27");
//    _VerifyVATType.Click_VerifyVATType();
//  

    }

  /*  @Test  (groups= {"NewScripWithVATTdype","NewScripWithVATType - Default Profile"})
    @TestModellerPath(guid = "6cf10cd1-8a8f-4948-92cf-9316abc01ac2")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlCl2() throws InterruptedException
    {
        
        pages.Login1VAT _Login1VAT = new pages.Login1VAT(driver);
    TestModellerLogger.SetLastNodeGuid("93e4a214-3f97-41d2-8063-dd91c879e847");
    _Login1VAT.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7eff8b4c-1e47-48a4-bcad-b3639d0cdfd5");
    _Login1VAT.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ceaa193b-d8c0-48f9-911f-018e2571da20");
    _Login1VAT.Enter_UserName("Jude26");
    

    TestModellerLogger.SetLastNodeGuid("95b31ed9-af0a-49e7-8bfa-8471d379cdff");
    _Login1VAT.Enter_Password("zgmprZmUP5");
    

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
    _AgentsSelect.Enter_AgentName("et");
    

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
    _ClientSelect.Enter_ClientName("praesentium");
    

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
    _StandardToFlat.Select_VATStatus("NO VAT");
    

    TestModellerLogger.SetLastNodeGuid("514df5f7-6f52-45a6-a507-9859d88e21ca");
    _StandardToFlat.Enter_SchemeEffectiveDate("44214");
    

    TestModellerLogger.SetLastNodeGuid("dbb0d99a-73dd-4431-80dd-1b5b97944c00");
    _StandardToFlat.Click_DefaultFlatRate();
    

    TestModellerLogger.SetLastNodeGuid("eae0b017-1107-4fd4-9e16-1b5f073c567d");
    _StandardToFlat.Enter_OverrideFlatRate("");
    

    TestModellerLogger.SetLastNodeGuid("48636868-2074-45b3-80b7-74db27e7a625");
    _StandardToFlat.Click_SaveButton();
    

pages.SaleInvoice _SaleInvoice = new pages.SaleInvoice(driver);
    TestModellerLogger.SetLastNodeGuid("2f331494-c0ec-443e-b258-bdf3d2f9d9fc");
    _SaleInvoice.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("281121da-f0ce-4629-a4d1-0bc9b4260347");
    _SaleInvoice.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("38510c8a-daac-4ff8-83f3-54b176440787");
    _SaleInvoice.Click_SalesTab();
    

    TestModellerLogger.SetLastNodeGuid("2ce6ef22-01ee-4e82-bcb0-f7ce06badd95");
    _SaleInvoice.Click_NewButton();
    

    TestModellerLogger.SetLastNodeGuid("b605bf48-53b8-4f7f-a009-9ea8d59b69ba");
    _SaleInvoice.Click_NewInvoice();
    

    TestModellerLogger.SetLastNodeGuid("4e83b316-7f8b-49b7-a97f-e85cefb020f0");
    _SaleInvoice.Select_CustomerName("nid");
    

    TestModellerLogger.SetLastNodeGuid("f3edcc35-8d70-4902-81f0-9c5d760fac46");
    _SaleInvoice.Enter_InvoiceNo("");
    

    TestModellerLogger.SetLastNodeGuid("6f885a16-e34c-4d0d-914a-a726c1fa9617");
    _SaleInvoice.Enter_InvoiceDate("44214");
    

    TestModellerLogger.SetLastNodeGuid("294097b8-ccc5-4eb7-baec-1a26ca1364f0");
    _SaleInvoice.Select_IncomeType("");
    

    TestModellerLogger.SetLastNodeGuid("5ccbf01b-65a3-47f5-b916-dab48aab691f");
    _SaleInvoice.Enter_Description("ppp");
    

    TestModellerLogger.SetLastNodeGuid("73677a32-1892-47f6-9783-a1072478778a");
    _SaleInvoice.Enter_UnitPrice("");
    

    TestModellerLogger.SetLastNodeGuid("d810d5bf-a960-434c-9172-1671dd383495");
    _SaleInvoice.Enter_Quantity("");
    

    TestModellerLogger.SetLastNodeGuid("516c7236-f043-4de9-b128-99997ccf1604");
    _SaleInvoice.Select_VATRate("Zero Rate");
    

    TestModellerLogger.SetLastNodeGuid("cb6d5101-0be0-4519-b1aa-5e71dcdfbef3");
    _SaleInvoice.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("6aeae28b-fd85-4712-8710-18e4b190dd19");
    _SaleInvoice.Enter_Note("");
    

    TestModellerLogger.SetLastNodeGuid("2508d3fa-348f-48f2-914a-4d43591ded90");
    _SaleInvoice.Click_SaveButton();
    

pages.VerifyVATType _VerifyVATType = new pages.VerifyVATType(driver);
    TestModellerLogger.SetLastNodeGuid("33bfee7d-07ef-4f6b-b603-c0c11c635aec");
    _VerifyVATType.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("94b51cb9-9f8f-4c45-aeee-e72bc55702c4");
    _VerifyVATType.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("0ed3bf93-1b63-4256-9d75-87c23eed1f27");
    _VerifyVATType.Click_VerifyVATType();
    

    }

    @Test  (groups= {"NewScripWithVATType","NewScripWithVATType - Default Profile"})
    @TestModellerPath(guid = "e76ee5b7-a81f-4d7c-9965-3f57846d573f")
    public void 
    GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlCl3() throws InterruptedException
    {
        
        pages.Login1VAT _Login1VAT = new pages.Login1VAT(driver);
    TestModellerLogger.SetLastNodeGuid("93e4a214-3f97-41d2-8063-dd91c879e847");
    _Login1VAT.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7eff8b4c-1e47-48a4-bcad-b3639d0cdfd5");
    _Login1VAT.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ceaa193b-d8c0-48f9-911f-018e2571da20");
    _Login1VAT.Enter_UserName("Scottie12");
    

    TestModellerLogger.SetLastNodeGuid("95b31ed9-af0a-49e7-8bfa-8471d379cdff");
    _Login1VAT.Enter_Password("s3UiYZsZhP");
    

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
    _AgentsSelect.Enter_AgentName("eius");
    

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
    _ClientSelect.Enter_ClientName("repellat");
    

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
    _StandardToFlat.Select_VATStatus("NO VAT");
    

    TestModellerLogger.SetLastNodeGuid("514df5f7-6f52-45a6-a507-9859d88e21ca");
    _StandardToFlat.Enter_SchemeEffectiveDate("44214");
    

    TestModellerLogger.SetLastNodeGuid("dbb0d99a-73dd-4431-80dd-1b5b97944c00");
    _StandardToFlat.Click_DefaultFlatRate();
    

    TestModellerLogger.SetLastNodeGuid("eae0b017-1107-4fd4-9e16-1b5f073c567d");
    _StandardToFlat.Enter_OverrideFlatRate("");
    

    TestModellerLogger.SetLastNodeGuid("48636868-2074-45b3-80b7-74db27e7a625");
    _StandardToFlat.Click_SaveButton();
    

pages.SaleInvoice _SaleInvoice = new pages.SaleInvoice(driver);
    TestModellerLogger.SetLastNodeGuid("2f331494-c0ec-443e-b258-bdf3d2f9d9fc");
    _SaleInvoice.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("281121da-f0ce-4629-a4d1-0bc9b4260347");
    _SaleInvoice.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("38510c8a-daac-4ff8-83f3-54b176440787");
    _SaleInvoice.Click_SalesTab();
    

    TestModellerLogger.SetLastNodeGuid("2ce6ef22-01ee-4e82-bcb0-f7ce06badd95");
    _SaleInvoice.Click_NewButton();
    

    TestModellerLogger.SetLastNodeGuid("b605bf48-53b8-4f7f-a009-9ea8d59b69ba");
    _SaleInvoice.Click_NewInvoice();
    

    TestModellerLogger.SetLastNodeGuid("4e83b316-7f8b-49b7-a97f-e85cefb020f0");
    _SaleInvoice.Select_CustomerName("nid");
    

    TestModellerLogger.SetLastNodeGuid("f3edcc35-8d70-4902-81f0-9c5d760fac46");
    _SaleInvoice.Enter_InvoiceNo("");
    

    TestModellerLogger.SetLastNodeGuid("6f885a16-e34c-4d0d-914a-a726c1fa9617");
    _SaleInvoice.Enter_InvoiceDate("44214");
    

    TestModellerLogger.SetLastNodeGuid("294097b8-ccc5-4eb7-baec-1a26ca1364f0");
    _SaleInvoice.Select_IncomeType("");
    

    TestModellerLogger.SetLastNodeGuid("5ccbf01b-65a3-47f5-b916-dab48aab691f");
    _SaleInvoice.Enter_Description("LLL");
    

    TestModellerLogger.SetLastNodeGuid("73677a32-1892-47f6-9783-a1072478778a");
    _SaleInvoice.Enter_UnitPrice("");
    

    TestModellerLogger.SetLastNodeGuid("d810d5bf-a960-434c-9172-1671dd383495");
    _SaleInvoice.Enter_Quantity("");
    

    TestModellerLogger.SetLastNodeGuid("516c7236-f043-4de9-b128-99997ccf1604");
    _SaleInvoice.Select_VATRate("Reduced Rate");
    

    TestModellerLogger.SetLastNodeGuid("cb6d5101-0be0-4519-b1aa-5e71dcdfbef3");
    _SaleInvoice.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("6aeae28b-fd85-4712-8710-18e4b190dd19");
    _SaleInvoice.Enter_Note("");
    

    TestModellerLogger.SetLastNodeGuid("2508d3fa-348f-48f2-914a-4d43591ded90");
    _SaleInvoice.Click_SaveButton();
    

pages.VerifyVATType _VerifyVATType = new pages.VerifyVATType(driver);
    TestModellerLogger.SetLastNodeGuid("33bfee7d-07ef-4f6b-b603-c0c11c635aec");
    _VerifyVATType.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("94b51cb9-9f8f-4c45-aeee-e72bc55702c4");
    _VerifyVATType.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("0ed3bf93-1b63-4256-9d75-87c23eed1f27");
    _VerifyVATType.Click_VerifyVATType();
    

    }

    @Test  (groups= {"NewScripWithVATType","NewScripWithVATType - Default Profile"})
    @TestModellerPath(guid = "2ec9b489-f656-4df4-8308-9bd6dc0c7efe")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlCl4() throws InterruptedException
    {
        
        pages.Login1VAT _Login1VAT = new pages.Login1VAT(driver);
    TestModellerLogger.SetLastNodeGuid("93e4a214-3f97-41d2-8063-dd91c879e847");
    _Login1VAT.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7eff8b4c-1e47-48a4-bcad-b3639d0cdfd5");
    _Login1VAT.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ceaa193b-d8c0-48f9-911f-018e2571da20");
    _Login1VAT.Enter_UserName("Aisha.Littel");
    

    TestModellerLogger.SetLastNodeGuid("95b31ed9-af0a-49e7-8bfa-8471d379cdff");
    _Login1VAT.Enter_Password("70hCg64Bdk");
    

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
    _AgentsSelect.Enter_AgentName("eos");
    

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
    _ClientSelect.Enter_ClientName("recusandae");
    

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
    _StandardToFlat.Select_VATStatus("NO VAT");
    

    TestModellerLogger.SetLastNodeGuid("514df5f7-6f52-45a6-a507-9859d88e21ca");
    _StandardToFlat.Enter_SchemeEffectiveDate("44214");
    

    TestModellerLogger.SetLastNodeGuid("dbb0d99a-73dd-4431-80dd-1b5b97944c00");
    _StandardToFlat.Click_DefaultFlatRate();
    

    TestModellerLogger.SetLastNodeGuid("eae0b017-1107-4fd4-9e16-1b5f073c567d");
    _StandardToFlat.Enter_OverrideFlatRate("");
    

    TestModellerLogger.SetLastNodeGuid("48636868-2074-45b3-80b7-74db27e7a625");
    _StandardToFlat.Click_SaveButton();
    

pages.SaleInvoice _SaleInvoice = new pages.SaleInvoice(driver);
    TestModellerLogger.SetLastNodeGuid("2f331494-c0ec-443e-b258-bdf3d2f9d9fc");
    _SaleInvoice.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("281121da-f0ce-4629-a4d1-0bc9b4260347");
    _SaleInvoice.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("38510c8a-daac-4ff8-83f3-54b176440787");
    _SaleInvoice.Click_SalesTab();
    

    TestModellerLogger.SetLastNodeGuid("2ce6ef22-01ee-4e82-bcb0-f7ce06badd95");
    _SaleInvoice.Click_NewButton();
    

    TestModellerLogger.SetLastNodeGuid("b605bf48-53b8-4f7f-a009-9ea8d59b69ba");
    _SaleInvoice.Click_NewInvoice();
    

    TestModellerLogger.SetLastNodeGuid("4e83b316-7f8b-49b7-a97f-e85cefb020f0");
    _SaleInvoice.Select_CustomerName("nid");
    

    TestModellerLogger.SetLastNodeGuid("f3edcc35-8d70-4902-81f0-9c5d760fac46");
    _SaleInvoice.Enter_InvoiceNo("");
    

    TestModellerLogger.SetLastNodeGuid("6f885a16-e34c-4d0d-914a-a726c1fa9617");
    _SaleInvoice.Enter_InvoiceDate("44214");
    

    TestModellerLogger.SetLastNodeGuid("294097b8-ccc5-4eb7-baec-1a26ca1364f0");
    _SaleInvoice.Select_IncomeType("");
    

    TestModellerLogger.SetLastNodeGuid("5ccbf01b-65a3-47f5-b916-dab48aab691f");
    _SaleInvoice.Enter_Description("ppllk");
    

    TestModellerLogger.SetLastNodeGuid("73677a32-1892-47f6-9783-a1072478778a");
    _SaleInvoice.Enter_UnitPrice("");
    

    TestModellerLogger.SetLastNodeGuid("d810d5bf-a960-434c-9172-1671dd383495");
    _SaleInvoice.Enter_Quantity("");
    

    TestModellerLogger.SetLastNodeGuid("516c7236-f043-4de9-b128-99997ccf1604");
    _SaleInvoice.Select_VATRate("No VAT");
    

    TestModellerLogger.SetLastNodeGuid("cb6d5101-0be0-4519-b1aa-5e71dcdfbef3");
    _SaleInvoice.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("6aeae28b-fd85-4712-8710-18e4b190dd19");
    _SaleInvoice.Enter_Note("");
    

    TestModellerLogger.SetLastNodeGuid("2508d3fa-348f-48f2-914a-4d43591ded90");
    _SaleInvoice.Click_SaveButton();
    

pages.VerifyVATType _VerifyVATType = new pages.VerifyVATType(driver);
    TestModellerLogger.SetLastNodeGuid("33bfee7d-07ef-4f6b-b603-c0c11c635aec");
    _VerifyVATType.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("94b51cb9-9f8f-4c45-aeee-e72bc55702c4");
    _VerifyVATType.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("0ed3bf93-1b63-4256-9d75-87c23eed1f27");
    _VerifyVATType.Click_VerifyVATType();
    

    }

    @Test  (groups= {"NewScripWithVATType","NewScripWithVATType - Default Profile"})
    @TestModellerPath(guid = "72a59d9a-9c6e-4002-b2c0-02596c04310a")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlCl5() throws InterruptedException
    {
        
        pages.Login1VAT _Login1VAT = new pages.Login1VAT(driver);
    TestModellerLogger.SetLastNodeGuid("93e4a214-3f97-41d2-8063-dd91c879e847");
    _Login1VAT.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7eff8b4c-1e47-48a4-bcad-b3639d0cdfd5");
    _Login1VAT.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ceaa193b-d8c0-48f9-911f-018e2571da20");
    _Login1VAT.Enter_UserName("Theo.Kassulke96");
    

    TestModellerLogger.SetLastNodeGuid("95b31ed9-af0a-49e7-8bfa-8471d379cdff");
    _Login1VAT.Enter_Password("ibFNqN0LaF");
    

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
    _AgentsSelect.Enter_AgentName("unde");
    

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
    _ClientSelect.Enter_ClientName("odio");
    

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
    _StandardToFlat.Select_VATStatus("NO VAT");
    

    TestModellerLogger.SetLastNodeGuid("514df5f7-6f52-45a6-a507-9859d88e21ca");
    _StandardToFlat.Enter_SchemeEffectiveDate("44214");
    

    TestModellerLogger.SetLastNodeGuid("dbb0d99a-73dd-4431-80dd-1b5b97944c00");
    _StandardToFlat.Click_DefaultFlatRate();
    

    TestModellerLogger.SetLastNodeGuid("eae0b017-1107-4fd4-9e16-1b5f073c567d");
    _StandardToFlat.Enter_OverrideFlatRate("");
    

    TestModellerLogger.SetLastNodeGuid("48636868-2074-45b3-80b7-74db27e7a625");
    _StandardToFlat.Click_SaveButton();
    

pages.SaleInvoice _SaleInvoice = new pages.SaleInvoice(driver);
    TestModellerLogger.SetLastNodeGuid("2f331494-c0ec-443e-b258-bdf3d2f9d9fc");
    _SaleInvoice.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("281121da-f0ce-4629-a4d1-0bc9b4260347");
    _SaleInvoice.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("38510c8a-daac-4ff8-83f3-54b176440787");
    _SaleInvoice.Click_SalesTab();
    

    TestModellerLogger.SetLastNodeGuid("2ce6ef22-01ee-4e82-bcb0-f7ce06badd95");
    _SaleInvoice.Click_NewButton();
    

    TestModellerLogger.SetLastNodeGuid("b605bf48-53b8-4f7f-a009-9ea8d59b69ba");
    _SaleInvoice.Click_NewInvoice();
    

    TestModellerLogger.SetLastNodeGuid("4e83b316-7f8b-49b7-a97f-e85cefb020f0");
    _SaleInvoice.Select_CustomerName("nid");
    

    TestModellerLogger.SetLastNodeGuid("f3edcc35-8d70-4902-81f0-9c5d760fac46");
    _SaleInvoice.Enter_InvoiceNo("");
    

    TestModellerLogger.SetLastNodeGuid("6f885a16-e34c-4d0d-914a-a726c1fa9617");
    _SaleInvoice.Enter_InvoiceDate("44214");
    

    TestModellerLogger.SetLastNodeGuid("294097b8-ccc5-4eb7-baec-1a26ca1364f0");
    _SaleInvoice.Select_IncomeType("");
    

    TestModellerLogger.SetLastNodeGuid("5ccbf01b-65a3-47f5-b916-dab48aab691f");
    _SaleInvoice.Enter_Description("KKK");
    

    TestModellerLogger.SetLastNodeGuid("73677a32-1892-47f6-9783-a1072478778a");
    _SaleInvoice.Enter_UnitPrice("");
    

    TestModellerLogger.SetLastNodeGuid("d810d5bf-a960-434c-9172-1671dd383495");
    _SaleInvoice.Enter_Quantity("");
    

    TestModellerLogger.SetLastNodeGuid("516c7236-f043-4de9-b128-99997ccf1604");
    _SaleInvoice.Select_VATRate("Exempt");
    

    TestModellerLogger.SetLastNodeGuid("cb6d5101-0be0-4519-b1aa-5e71dcdfbef3");
    _SaleInvoice.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("6aeae28b-fd85-4712-8710-18e4b190dd19");
    _SaleInvoice.Enter_Note("");
    

    TestModellerLogger.SetLastNodeGuid("2508d3fa-348f-48f2-914a-4d43591ded90");
    _SaleInvoice.Click_SaveButton();
    

pages.VerifyVATType _VerifyVATType = new pages.VerifyVATType(driver);
    TestModellerLogger.SetLastNodeGuid("33bfee7d-07ef-4f6b-b603-c0c11c635aec");
    _VerifyVATType.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("94b51cb9-9f8f-4c45-aeee-e72bc55702c4");
    _VerifyVATType.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("0ed3bf93-1b63-4256-9d75-87c23eed1f27");
    _VerifyVATType.Click_VerifyVATType();
    

    }

    @Test  (groups= {"NewScripWithVATType","NewScripWithVATType - Default Profile"})
    @TestModellerPath(guid = "25075a0c-46d2-4e4e-adf8-f682809e4684")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlCl6() throws InterruptedException
    {
        
        pages.Login1VAT _Login1VAT = new pages.Login1VAT(driver);
    TestModellerLogger.SetLastNodeGuid("93e4a214-3f97-41d2-8063-dd91c879e847");
    _Login1VAT.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7eff8b4c-1e47-48a4-bcad-b3639d0cdfd5");
    _Login1VAT.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ceaa193b-d8c0-48f9-911f-018e2571da20");
    _Login1VAT.Enter_UserName("Vinnie.Schmitt57");
    

    TestModellerLogger.SetLastNodeGuid("95b31ed9-af0a-49e7-8bfa-8471d379cdff");
    _Login1VAT.Enter_Password("btTMyY8aXD");
    

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
    _AgentsSelect.Enter_AgentName("in");
    

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
    _ClientSelect.Enter_ClientName("quisquam");
    

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
    _StandardToFlat.Select_VATStatus("NO VAT");
    

    TestModellerLogger.SetLastNodeGuid("514df5f7-6f52-45a6-a507-9859d88e21ca");
    _StandardToFlat.Enter_SchemeEffectiveDate("44214");
    

    TestModellerLogger.SetLastNodeGuid("dbb0d99a-73dd-4431-80dd-1b5b97944c00");
    _StandardToFlat.Click_DefaultFlatRate();
    

    TestModellerLogger.SetLastNodeGuid("eae0b017-1107-4fd4-9e16-1b5f073c567d");
    _StandardToFlat.Enter_OverrideFlatRate("");
    

    TestModellerLogger.SetLastNodeGuid("48636868-2074-45b3-80b7-74db27e7a625");
    _StandardToFlat.Click_SaveButton();
    

pages.SaleInvoice _SaleInvoice = new pages.SaleInvoice(driver);
    TestModellerLogger.SetLastNodeGuid("2f331494-c0ec-443e-b258-bdf3d2f9d9fc");
    _SaleInvoice.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("281121da-f0ce-4629-a4d1-0bc9b4260347");
    _SaleInvoice.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("38510c8a-daac-4ff8-83f3-54b176440787");
    _SaleInvoice.Click_SalesTab();
    

    TestModellerLogger.SetLastNodeGuid("2ce6ef22-01ee-4e82-bcb0-f7ce06badd95");
    _SaleInvoice.Click_NewButton();
    

    TestModellerLogger.SetLastNodeGuid("b605bf48-53b8-4f7f-a009-9ea8d59b69ba");
    _SaleInvoice.Click_NewInvoice();
    

    TestModellerLogger.SetLastNodeGuid("4e83b316-7f8b-49b7-a97f-e85cefb020f0");
    _SaleInvoice.Select_CustomerName("nid");
    

    TestModellerLogger.SetLastNodeGuid("f3edcc35-8d70-4902-81f0-9c5d760fac46");
    _SaleInvoice.Enter_InvoiceNo("");
    

    TestModellerLogger.SetLastNodeGuid("6f885a16-e34c-4d0d-914a-a726c1fa9617");
    _SaleInvoice.Enter_InvoiceDate("44214");
    

    TestModellerLogger.SetLastNodeGuid("294097b8-ccc5-4eb7-baec-1a26ca1364f0");
    _SaleInvoice.Select_IncomeType("");
    

    TestModellerLogger.SetLastNodeGuid("5ccbf01b-65a3-47f5-b916-dab48aab691f");
    _SaleInvoice.Enter_Description("HHH");
    

    TestModellerLogger.SetLastNodeGuid("73677a32-1892-47f6-9783-a1072478778a");
    _SaleInvoice.Enter_UnitPrice("");
    

    TestModellerLogger.SetLastNodeGuid("d810d5bf-a960-434c-9172-1671dd383495");
    _SaleInvoice.Enter_Quantity("");
    

    TestModellerLogger.SetLastNodeGuid("516c7236-f043-4de9-b128-99997ccf1604");
    _SaleInvoice.Select_VATRate("Out of Scope");
    

    TestModellerLogger.SetLastNodeGuid("cb6d5101-0be0-4519-b1aa-5e71dcdfbef3");
    _SaleInvoice.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("6aeae28b-fd85-4712-8710-18e4b190dd19");
    _SaleInvoice.Enter_Note("");
    

    TestModellerLogger.SetLastNodeGuid("2508d3fa-348f-48f2-914a-4d43591ded90");
    _SaleInvoice.Click_SaveButton();
    

pages.VerifyVATType _VerifyVATType = new pages.VerifyVATType(driver);
    TestModellerLogger.SetLastNodeGuid("33bfee7d-07ef-4f6b-b603-c0c11c635aec");
    _VerifyVATType.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("94b51cb9-9f8f-4c45-aeee-e72bc55702c4");
    _VerifyVATType.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("0ed3bf93-1b63-4256-9d75-87c23eed1f27");
    _VerifyVATType.Click_VerifyVATType();
    

    }

    @Test  (groups= {"NewScripWithVATType","NewScripWithVATType - Default Profile"})
    @TestModellerPath(guid = "dbedf1c3-40dc-4a86-9d9d-03c9da2f2553")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlCl7() throws InterruptedException
    {
        
        pages.Login1VAT _Login1VAT = new pages.Login1VAT(driver);
    TestModellerLogger.SetLastNodeGuid("93e4a214-3f97-41d2-8063-dd91c879e847");
    _Login1VAT.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7eff8b4c-1e47-48a4-bcad-b3639d0cdfd5");
    _Login1VAT.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ceaa193b-d8c0-48f9-911f-018e2571da20");
    _Login1VAT.Enter_UserName("Colleen.Waters");
    

    TestModellerLogger.SetLastNodeGuid("95b31ed9-af0a-49e7-8bfa-8471d379cdff");
    _Login1VAT.Enter_Password("KQVibidFlq");
    

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
    _AgentsSelect.Enter_AgentName("natus");
    

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
    _ClientSelect.Enter_ClientName("nobis");
    

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
    _StandardToFlat.Select_VATStatus("STANDARD VAT");
    

    TestModellerLogger.SetLastNodeGuid("514df5f7-6f52-45a6-a507-9859d88e21ca");
    _StandardToFlat.Enter_SchemeEffectiveDate("44214");
    

    TestModellerLogger.SetLastNodeGuid("dbb0d99a-73dd-4431-80dd-1b5b97944c00");
    _StandardToFlat.Click_DefaultFlatRate();
    

    TestModellerLogger.SetLastNodeGuid("eae0b017-1107-4fd4-9e16-1b5f073c567d");
    _StandardToFlat.Enter_OverrideFlatRate("");
    

    TestModellerLogger.SetLastNodeGuid("48636868-2074-45b3-80b7-74db27e7a625");
    _StandardToFlat.Click_SaveButton();
    

pages.SaleInvoice _SaleInvoice = new pages.SaleInvoice(driver);
    TestModellerLogger.SetLastNodeGuid("2f331494-c0ec-443e-b258-bdf3d2f9d9fc");
    _SaleInvoice.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("281121da-f0ce-4629-a4d1-0bc9b4260347");
    _SaleInvoice.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("38510c8a-daac-4ff8-83f3-54b176440787");
    _SaleInvoice.Click_SalesTab();
    

    TestModellerLogger.SetLastNodeGuid("2ce6ef22-01ee-4e82-bcb0-f7ce06badd95");
    _SaleInvoice.Click_NewButton();
    

    TestModellerLogger.SetLastNodeGuid("b605bf48-53b8-4f7f-a009-9ea8d59b69ba");
    _SaleInvoice.Click_NewInvoice();
    

    TestModellerLogger.SetLastNodeGuid("4e83b316-7f8b-49b7-a97f-e85cefb020f0");
    _SaleInvoice.Select_CustomerName("nid");
    

    TestModellerLogger.SetLastNodeGuid("f3edcc35-8d70-4902-81f0-9c5d760fac46");
    _SaleInvoice.Enter_InvoiceNo("");
    

    TestModellerLogger.SetLastNodeGuid("6f885a16-e34c-4d0d-914a-a726c1fa9617");
    _SaleInvoice.Enter_InvoiceDate("44214");
    

    TestModellerLogger.SetLastNodeGuid("294097b8-ccc5-4eb7-baec-1a26ca1364f0");
    _SaleInvoice.Select_IncomeType("");
    

    TestModellerLogger.SetLastNodeGuid("5ccbf01b-65a3-47f5-b916-dab48aab691f");
    _SaleInvoice.Enter_Description("DDD");
    

    TestModellerLogger.SetLastNodeGuid("73677a32-1892-47f6-9783-a1072478778a");
    _SaleInvoice.Enter_UnitPrice("");
    

    TestModellerLogger.SetLastNodeGuid("d810d5bf-a960-434c-9172-1671dd383495");
    _SaleInvoice.Enter_Quantity("");
    

    TestModellerLogger.SetLastNodeGuid("516c7236-f043-4de9-b128-99997ccf1604");
    _SaleInvoice.Select_VATRate("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("cb6d5101-0be0-4519-b1aa-5e71dcdfbef3");
    _SaleInvoice.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("6aeae28b-fd85-4712-8710-18e4b190dd19");
    _SaleInvoice.Enter_Note("");
    

    TestModellerLogger.SetLastNodeGuid("2508d3fa-348f-48f2-914a-4d43591ded90");
    _SaleInvoice.Click_SaveButton();
    

pages.VerifyVATType _VerifyVATType = new pages.VerifyVATType(driver);
    TestModellerLogger.SetLastNodeGuid("33bfee7d-07ef-4f6b-b603-c0c11c635aec");
    _VerifyVATType.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("94b51cb9-9f8f-4c45-aeee-e72bc55702c4");
    _VerifyVATType.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("0ed3bf93-1b63-4256-9d75-87c23eed1f27");
    _VerifyVATType.Click_VerifyVATType();
    

    }

    @Test  (groups= {"NewScripWithVATType","NewScripWithVATType - Default Profile"})
    @TestModellerPath(guid = "5b6deb99-9344-43e4-8362-16a7cf2e47ce")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlCl8() throws InterruptedException
    {
        
        pages.Login1VAT _Login1VAT = new pages.Login1VAT(driver);
    TestModellerLogger.SetLastNodeGuid("93e4a214-3f97-41d2-8063-dd91c879e847");
    _Login1VAT.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7eff8b4c-1e47-48a4-bcad-b3639d0cdfd5");
    _Login1VAT.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ceaa193b-d8c0-48f9-911f-018e2571da20");
    _Login1VAT.Enter_UserName("Melisa_Koelpin");
    

    TestModellerLogger.SetLastNodeGuid("95b31ed9-af0a-49e7-8bfa-8471d379cdff");
    _Login1VAT.Enter_Password("0bz4K6NgJv");
    

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
    _AgentsSelect.Enter_AgentName("modi");
    

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
    _ClientSelect.Enter_ClientName("est");
    

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
    _StandardToFlat.Enter_SchemeEffectiveDate("44214");
    

    TestModellerLogger.SetLastNodeGuid("dbb0d99a-73dd-4431-80dd-1b5b97944c00");
    _StandardToFlat.Click_DefaultFlatRate();
    

    TestModellerLogger.SetLastNodeGuid("eae0b017-1107-4fd4-9e16-1b5f073c567d");
    _StandardToFlat.Enter_OverrideFlatRate("");
    

    TestModellerLogger.SetLastNodeGuid("48636868-2074-45b3-80b7-74db27e7a625");
    _StandardToFlat.Click_SaveButton();
    

pages.SaleInvoice _SaleInvoice = new pages.SaleInvoice(driver);
    TestModellerLogger.SetLastNodeGuid("2f331494-c0ec-443e-b258-bdf3d2f9d9fc");
    _SaleInvoice.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("281121da-f0ce-4629-a4d1-0bc9b4260347");
    _SaleInvoice.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("38510c8a-daac-4ff8-83f3-54b176440787");
    _SaleInvoice.Click_SalesTab();
    

    TestModellerLogger.SetLastNodeGuid("2ce6ef22-01ee-4e82-bcb0-f7ce06badd95");
    _SaleInvoice.Click_NewButton();
    

    TestModellerLogger.SetLastNodeGuid("b605bf48-53b8-4f7f-a009-9ea8d59b69ba");
    _SaleInvoice.Click_NewInvoice();
    

    TestModellerLogger.SetLastNodeGuid("4e83b316-7f8b-49b7-a97f-e85cefb020f0");
    _SaleInvoice.Select_CustomerName("nid");
    

    TestModellerLogger.SetLastNodeGuid("f3edcc35-8d70-4902-81f0-9c5d760fac46");
    _SaleInvoice.Enter_InvoiceNo("");
    

    TestModellerLogger.SetLastNodeGuid("6f885a16-e34c-4d0d-914a-a726c1fa9617");
    _SaleInvoice.Enter_InvoiceDate("44214");
    

    TestModellerLogger.SetLastNodeGuid("294097b8-ccc5-4eb7-baec-1a26ca1364f0");
    _SaleInvoice.Select_IncomeType("");
    

    TestModellerLogger.SetLastNodeGuid("5ccbf01b-65a3-47f5-b916-dab48aab691f");
    _SaleInvoice.Enter_Description("VVV");
    

    TestModellerLogger.SetLastNodeGuid("73677a32-1892-47f6-9783-a1072478778a");
    _SaleInvoice.Enter_UnitPrice("");
    

    TestModellerLogger.SetLastNodeGuid("d810d5bf-a960-434c-9172-1671dd383495");
    _SaleInvoice.Enter_Quantity("");
    

    TestModellerLogger.SetLastNodeGuid("516c7236-f043-4de9-b128-99997ccf1604");
    _SaleInvoice.Select_VATRate("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("cb6d5101-0be0-4519-b1aa-5e71dcdfbef3");
    _SaleInvoice.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("6aeae28b-fd85-4712-8710-18e4b190dd19");
    _SaleInvoice.Enter_Note("");
    

    TestModellerLogger.SetLastNodeGuid("2508d3fa-348f-48f2-914a-4d43591ded90");
    _SaleInvoice.Click_SaveButton();
    

pages.VerifyVATType _VerifyVATType = new pages.VerifyVATType(driver);
    TestModellerLogger.SetLastNodeGuid("33bfee7d-07ef-4f6b-b603-c0c11c635aec");
    _VerifyVATType.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("94b51cb9-9f8f-4c45-aeee-e72bc55702c4");
    _VerifyVATType.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("0ed3bf93-1b63-4256-9d75-87c23eed1f27");
    _VerifyVATType.Click_VerifyVATType();
    

    }*/

}
