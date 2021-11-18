package test.ashiv;

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

import Supplier_pages.VATOnlyBillSToFRS;
import ie.curiositysoftware.allocation.dto.ResultMergeMethod;
import ie.curiositysoftware.allocation.dto.DataAllocationRow;
import reports.ExtentTestListener;
import ie.curiositysoftware.allocation.dto.DataAllocationResult;
import ie.curiositysoftware.allocation.engine.DataAllocation;
import utilities.ExcelUtility;
import utilities.testmodeller.TestModellerLogger;

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/c3bdae63-7510-48d6-8952-f97fe64afa7c
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1111, profileId = 101007)
public class ScriptVATOnlyBillSToFRS_DefaultProfile extends TestBase
{
	String sTestCaseID=null;
	String[] data=null;
	String Sheet = null;

    
    @Test  (groups= {"ScriptVATOnlyBillSToFRS","ScriptVATOnlyBillSToFRS - Default Profile"})
    @TestModellerPath(guid = "9a8b9293-6c32-4caa-9f07-10898f43c585")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonAgentClientBusinessExpenditure_NewVatOnly_SaveBtnSuccessMessageScreenWithBillNumRecallLastTrnschangeBillNum() throws InterruptedException, InvalidFormatException, HeadlessException, IOException, AWTException
    {
    	sTestCaseID="TC18";
       	Sheet="BankingBank";
        data = ExcelUtility.toReadExcelData(sTestCaseID, Sheet);
        
        pages.banking.ashiv.Login1VAT _Login1VAT = new pages.banking.ashiv.Login1VAT(driver);
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
    

    pages.banking.ashiv.AgentsSelect _AgentsSelect = new pages.banking.ashiv.AgentsSelect(driver);
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
    

    pages.banking.ashiv.ClientSelect _ClientSelect = new pages.banking.ashiv.ClientSelect(driver);
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
    

As_Supplier.VATOnlyBillSToFRS _VATOnlyBillSToFRS = new As_Supplier.VATOnlyBillSToFRS(driver);

    

    TestModellerLogger.SetLastNodeGuid("c417c41a-8713-4207-87ff-9e40aaa5b5dd");
    _VATOnlyBillSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("c9060188-9c7f-4b7d-b4de-189d420922e0");
    _VATOnlyBillSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("0f8e7c26-8531-4862-a7d6-2c0652fee79e");
    _VATOnlyBillSToFRS.Click_VATOnlyBill();
    
    utilities.Screenshotcapture.Getscreenshot("Open Vat only From", "VAT Bill Only");

    TestModellerLogger.SetLastNodeGuid("67342eec-57d7-4a58-b4f5-43beeda93632");
    _VATOnlyBillSToFRS.Select_SupplierName(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("b8f5e167-8590-4e61-9e2a-a0ef55e1317f");
    _VATOnlyBillSToFRS.Enter_InvoiceNo(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("13f1744c-b332-4c44-a0ae-1468bbef2b1b");
    _VATOnlyBillSToFRS.Enter_InvoiceDate("");
    

    TestModellerLogger.SetLastNodeGuid("9b3cc656-f690-47a5-bb04-95921b8cd7ad");
    _VATOnlyBillSToFRS.Enter_SubTotal(data[8]);
    

    TestModellerLogger.SetLastNodeGuid("75fcc555-aa18-4673-8841-61cd4a7bf1a7");
    _VATOnlyBillSToFRS.Select_VATRateType(data[9]);
    

//    TestModellerLogger.SetLastNodeGuid("c9a1d57b-b2d4-4f32-a2de-15fc9d1eb7e1");
//    _VATOnlyBillSToFRS.Enter_VatRate(data[10]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("c1931af2-592a-456b-b6ee-4196c4d2a512");
//    _VATOnlyBillSToFRS.Enter_VAT(data[8]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("725f4abb-1b5c-4fe1-874f-fa21b9133e51");
//    _VATOnlyBillSToFRS.Enter_GrossTotal();
//    

    TestModellerLogger.SetLastNodeGuid("40701513-cd33-4fbf-9230-e580a1c49022");
    _VATOnlyBillSToFRS.Click_SaveButton();
    utilities.Screenshotcapture.Getscreenshot("Success Message Screen With Invoice Num", "VAT Bill Only");

    TestModellerLogger.SetLastNodeGuid("c9060188-9c7f-4b7d-b4de-189d420922e0");
    _VATOnlyBillSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("0f8e7c26-8531-4862-a7d6-2c0652fee79e");
    _VATOnlyBillSToFRS.Click_VATOnlyBill();
    
     _VATOnlyBillSToFRS.Recell_Last_Entry();
    
    TestModellerLogger.SetLastNodeGuid("b8f5e167-8590-4e61-9e2a-a0ef55e1317f");
    _VATOnlyBillSToFRS.Enter_InvoiceNo(data[14]);
    
    TestModellerLogger.SetLastNodeGuid("40701513-cd33-4fbf-9230-e580a1c49022");
    _VATOnlyBillSToFRS.Click_SaveButton();
    utilities.Screenshotcapture.Getscreenshot("Recall Last Trns change Bill Num", "VAT Bill Only");
    
    TestModellerLogger.SetLastNodeGuid("c9060188-9c7f-4b7d-b4de-189d420922e0");
    _VATOnlyBillSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("0f8e7c26-8531-4862-a7d6-2c0652fee79e");
    _VATOnlyBillSToFRS.Click_VATOnlyBill();
    
    _VATOnlyBillSToFRS.Click_CancelBtn();
    
    }
//
//    @Test  (groups= {"ScriptVATOnlyBillSToFRS","ScriptVATOnlyBillSToFRS - Default Profile"})
//    @TestModellerPath(guid = "ccfbb529-c908-4cc5-921b-c5bbf98ea04c")
//    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlCl2() throws InterruptedException, InvalidFormatException, HeadlessException, IOException, AWTException
//    {
//    	sTestCaseID="TC145";
//       	Sheet="Supplier";
//        data = ExcelUtility.toReadExcelData(sTestCaseID, Sheet);
//        
//        pages.Login1VAT _Login1VAT = new pages.Login1VAT(driver);
//    TestModellerLogger.SetLastNodeGuid("93e4a214-3f97-41d2-8063-dd91c879e847");
//    _Login1VAT.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("7eff8b4c-1e47-48a4-bcad-b3639d0cdfd5");
//    _Login1VAT.AssertUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("ceaa193b-d8c0-48f9-911f-018e2571da20");
//    _Login1VAT.Enter_UserName(data[1]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("95b31ed9-af0a-49e7-8bfa-8471d379cdff");
//    _Login1VAT.Enter_Password(data[2]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("942414e4-1d0e-45ba-bdd1-43293b97e0ff");
//    _Login1VAT.Click_LoginButton();
//    
//
//pages.AgentsSelect _AgentsSelect = new pages.AgentsSelect(driver);
////    TestModellerLogger.SetLastNodeGuid("69016c4b-a736-45bf-a682-5c03ee8d17cd");
////    _AgentsSelect.GoToUrl();
////    
////
////    TestModellerLogger.SetLastNodeGuid("bd071d41-148c-42e8-8300-984c9dd4df87");
////    _AgentsSelect.AssertUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("bd031a68-650a-4b8c-8e7c-0ce87415e17e");
//    _AgentsSelect.Click_AgentsTab();
//    
//
//    TestModellerLogger.SetLastNodeGuid("d5b61053-e5d4-479f-87c7-e4be6b5f054a");
//    _AgentsSelect.Enter_AgentName(data[3]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("2bae82eb-0e45-434c-b1bd-7336f304d4f9");
//    _AgentsSelect.Click_SearchButton();
//    
//
//    TestModellerLogger.SetLastNodeGuid("be317b25-3125-4191-86a5-e8ffee0d0334");
//    _AgentsSelect.Click_SelectAgent();
//    
//
//pages.ClientSelect _ClientSelect = new pages.ClientSelect(driver);
////    TestModellerLogger.SetLastNodeGuid("1243c994-d23d-40d1-bc93-38dfdab760ed");
////    _ClientSelect.GoToUrl();
////    
////
////    TestModellerLogger.SetLastNodeGuid("b42ff41f-2fec-4f5c-b77b-2742ec894ec7");
////    _ClientSelect.AssertUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("ff5edd38-07b0-452b-95d6-f33e07e1e975");
//    _ClientSelect.Click_ClientsTAB();
//    
//
//    TestModellerLogger.SetLastNodeGuid("14a94a5a-c1ac-4e4f-afd4-69a84ffa5a24");
//    _ClientSelect.Enter_ClientName(data[4]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("ed3e4750-33a4-4d75-a14c-9d75935c79c7");
//    _ClientSelect.Click_SearchButton();
//    
//
//    TestModellerLogger.SetLastNodeGuid("e537c9d6-4166-4745-b27e-a178d69d2884");
//    _ClientSelect.Click_SelectClient();
//    
//
//    Supplier_pages.VATOnlyBillSToFRS _VATOnlyBillSToFRS = new Supplier_pages.VATOnlyBillSToFRS(driver);
////    TestModellerLogger.SetLastNodeGuid("43b71837-169a-4003-8f22-a676f3b67070");
////    _VATOnlyBillSToFRS.GoToUrl();
////    
////
////    TestModellerLogger.SetLastNodeGuid("0984096e-2d45-4d04-8694-0425ef32eba0");
////    _VATOnlyBillSToFRS.AssertUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("c417c41a-8713-4207-87ff-9e40aaa5b5dd");
//    _VATOnlyBillSToFRS.Click_ExpenditureTAB();
//    
//
//    TestModellerLogger.SetLastNodeGuid("c9060188-9c7f-4b7d-b4de-189d420922e0");
//    _VATOnlyBillSToFRS.Click_NewTAB();
//    
//
//    TestModellerLogger.SetLastNodeGuid("0f8e7c26-8531-4862-a7d6-2c0652fee79e");
//    _VATOnlyBillSToFRS.Click_VATOnlyBill();
//    
//
//    TestModellerLogger.SetLastNodeGuid("67342eec-57d7-4a58-b4f5-43beeda93632");
//    _VATOnlyBillSToFRS.Select_SupplierName(data[5]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("b8f5e167-8590-4e61-9e2a-a0ef55e1317f");
//    _VATOnlyBillSToFRS.Enter_InvoiceNo(data[6]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("13f1744c-b332-4c44-a0ae-1468bbef2b1b");
//    _VATOnlyBillSToFRS.Enter_InvoiceDate(data[7]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("9b3cc656-f690-47a5-bb04-95921b8cd7ad");
//    _VATOnlyBillSToFRS.Enter_SubTotal(data[8]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("75fcc555-aa18-4673-8841-61cd4a7bf1a7");
//    _VATOnlyBillSToFRS.Select_VATRateType(data[9]);
//    
//
////    TestModellerLogger.SetLastNodeGuid("c9a1d57b-b2d4-4f32-a2de-15fc9d1eb7e1");
////    _VATOnlyBillSToFRS.Enter_VatRate();
////    
////
////    TestModellerLogger.SetLastNodeGuid("c1931af2-592a-456b-b6ee-4196c4d2a512");
////    _VATOnlyBillSToFRS.Enter_VAT();
////    
////
////    TestModellerLogger.SetLastNodeGuid("725f4abb-1b5c-4fe1-874f-fa21b9133e51");
////    _VATOnlyBillSToFRS.Enter_GrossTotal();
//    
//
//    TestModellerLogger.SetLastNodeGuid("40701513-cd33-4fbf-9230-e580a1c49022");
//    _VATOnlyBillSToFRS.Click_SaveButton();
// 
//    }

  /* @Test  (groups= {"ScriptVATOnlyBillSToFRS","ScriptVATOnlyBillSToFRS - Default Profile"})
    @TestModellerPath(guid = "4cf19f61-330e-4e9f-8141-3822b1327a92")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlCl3()
    {
        
        pages.Login1VAT _Login1VAT = new pages.Login1VAT(driver);
    TestModellerLogger.SetLastNodeGuid("93e4a214-3f97-41d2-8063-dd91c879e847");
    _Login1VAT.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7eff8b4c-1e47-48a4-bcad-b3639d0cdfd5");
    _Login1VAT.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ceaa193b-d8c0-48f9-911f-018e2571da20");
    _Login1VAT.Enter_UserName("Chelsey_Sanford");
    

    TestModellerLogger.SetLastNodeGuid("95b31ed9-af0a-49e7-8bfa-8471d379cdff");
    _Login1VAT.Enter_Password("GpG9oKANQh");
    

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
    _AgentsSelect.Enter_AgentName("quaerat");
    

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
    _ClientSelect.Enter_ClientName("harum");
    

    TestModellerLogger.SetLastNodeGuid("ed3e4750-33a4-4d75-a14c-9d75935c79c7");
    _ClientSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("e537c9d6-4166-4745-b27e-a178d69d2884");
    _ClientSelect.Click_SelectClient();
    

pages.VATOnlyBill _VATOnlyBillSToFRS = new pages.VATOnlyBill(driver);
    TestModellerLogger.SetLastNodeGuid("43b71837-169a-4003-8f22-a676f3b67070");
    _VATOnlyBillSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("0984096e-2d45-4d04-8694-0425ef32eba0");
    _VATOnlyBillSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c417c41a-8713-4207-87ff-9e40aaa5b5dd");
    _VATOnlyBillSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("c9060188-9c7f-4b7d-b4de-189d420922e0");
    _VATOnlyBillSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("0f8e7c26-8531-4862-a7d6-2c0652fee79e");
    _VATOnlyBillSToFRS.Click_VATOnlyBill();
    

    TestModellerLogger.SetLastNodeGuid("67342eec-57d7-4a58-b4f5-43beeda93632");
    _VATOnlyBillSToFRS.Select_SupplierName("");
    

    TestModellerLogger.SetLastNodeGuid("b8f5e167-8590-4e61-9e2a-a0ef55e1317f");
    _VATOnlyBillSToFRS.Enter_InvoiceNo();
    

    TestModellerLogger.SetLastNodeGuid("13f1744c-b332-4c44-a0ae-1468bbef2b1b");
    _VATOnlyBillSToFRS.Enter_InvoiceDate("44251");
    

    TestModellerLogger.SetLastNodeGuid("9b3cc656-f690-47a5-bb04-95921b8cd7ad");
    _VATOnlyBillSToFRS.Enter_SubTotal();
    

    TestModellerLogger.SetLastNodeGuid("75fcc555-aa18-4673-8841-61cd4a7bf1a7");
    _VATOnlyBillSToFRS.Select_VATRateType("Reduced Rate");
    

    TestModellerLogger.SetLastNodeGuid("c9a1d57b-b2d4-4f32-a2de-15fc9d1eb7e1");
    _VATOnlyBillSToFRS.Enter_VatRate();
    

    TestModellerLogger.SetLastNodeGuid("c1931af2-592a-456b-b6ee-4196c4d2a512");
    _VATOnlyBillSToFRS.Enter_VAT();
    

    TestModellerLogger.SetLastNodeGuid("725f4abb-1b5c-4fe1-874f-fa21b9133e51");
    _VATOnlyBillSToFRS.Enter_GrossTotal();
    

    TestModellerLogger.SetLastNodeGuid("40701513-cd33-4fbf-9230-e580a1c49022");
    _VATOnlyBillSToFRS.Click_SaveButton();
    

    }

    @Test  (groups= {"ScriptVATOnlyBillSToFRS","ScriptVATOnlyBillSToFRS - Default Profile"})
    @TestModellerPath(guid = "84efdf86-46b1-467b-9ded-8da5f6a37f76")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlCl4()
    {
        
        pages.Login1VAT _Login1VAT = new pages.Login1VAT(driver);
    TestModellerLogger.SetLastNodeGuid("93e4a214-3f97-41d2-8063-dd91c879e847");
    _Login1VAT.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7eff8b4c-1e47-48a4-bcad-b3639d0cdfd5");
    _Login1VAT.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ceaa193b-d8c0-48f9-911f-018e2571da20");
    _Login1VAT.Enter_UserName("Armand_Bashirian");
    

    TestModellerLogger.SetLastNodeGuid("95b31ed9-af0a-49e7-8bfa-8471d379cdff");
    _Login1VAT.Enter_Password("H2vnacTOrm");
    

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
    _AgentsSelect.Enter_AgentName("est");
    

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
    _ClientSelect.Enter_ClientName("iusto");
    

    TestModellerLogger.SetLastNodeGuid("ed3e4750-33a4-4d75-a14c-9d75935c79c7");
    _ClientSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("e537c9d6-4166-4745-b27e-a178d69d2884");
    _ClientSelect.Click_SelectClient();
    

pages.VATOnlyBill _VATOnlyBillSToFRS = new pages.VATOnlyBill(driver);
    TestModellerLogger.SetLastNodeGuid("43b71837-169a-4003-8f22-a676f3b67070");
    _VATOnlyBillSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("0984096e-2d45-4d04-8694-0425ef32eba0");
    _VATOnlyBillSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c417c41a-8713-4207-87ff-9e40aaa5b5dd");
    _VATOnlyBillSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("c9060188-9c7f-4b7d-b4de-189d420922e0");
    _VATOnlyBillSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("0f8e7c26-8531-4862-a7d6-2c0652fee79e");
    _VATOnlyBillSToFRS.Click_VATOnlyBill();
    

    TestModellerLogger.SetLastNodeGuid("67342eec-57d7-4a58-b4f5-43beeda93632");
    _VATOnlyBillSToFRS.Select_SupplierName("");
    

    TestModellerLogger.SetLastNodeGuid("b8f5e167-8590-4e61-9e2a-a0ef55e1317f");
    _VATOnlyBillSToFRS.Enter_InvoiceNo();
    

    TestModellerLogger.SetLastNodeGuid("13f1744c-b332-4c44-a0ae-1468bbef2b1b");
    _VATOnlyBillSToFRS.Enter_InvoiceDate("44251");
    

    TestModellerLogger.SetLastNodeGuid("9b3cc656-f690-47a5-bb04-95921b8cd7ad");
    _VATOnlyBillSToFRS.Enter_SubTotal();
    

    TestModellerLogger.SetLastNodeGuid("75fcc555-aa18-4673-8841-61cd4a7bf1a7");
    _VATOnlyBillSToFRS.Select_VATRateType("No VAT");
    

    TestModellerLogger.SetLastNodeGuid("c9a1d57b-b2d4-4f32-a2de-15fc9d1eb7e1");
    _VATOnlyBillSToFRS.Enter_VatRate();
    

    TestModellerLogger.SetLastNodeGuid("c1931af2-592a-456b-b6ee-4196c4d2a512");
    _VATOnlyBillSToFRS.Enter_VAT();
    

    TestModellerLogger.SetLastNodeGuid("725f4abb-1b5c-4fe1-874f-fa21b9133e51");
    _VATOnlyBillSToFRS.Enter_GrossTotal();
    

    TestModellerLogger.SetLastNodeGuid("40701513-cd33-4fbf-9230-e580a1c49022");
    _VATOnlyBillSToFRS.Click_SaveButton();
    

    }

    @Test  (groups= {"ScriptVATOnlyBillSToFRS","ScriptVATOnlyBillSToFRS - Default Profile"})
    @TestModellerPath(guid = "9d16335d-105c-451f-bd54-b05ef3cd6ec5")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlCl5()
    {
        
        pages.Login1VAT _Login1VAT = new pages.Login1VAT(driver);
    TestModellerLogger.SetLastNodeGuid("93e4a214-3f97-41d2-8063-dd91c879e847");
    _Login1VAT.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7eff8b4c-1e47-48a4-bcad-b3639d0cdfd5");
    _Login1VAT.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ceaa193b-d8c0-48f9-911f-018e2571da20");
    _Login1VAT.Enter_UserName("Deon.Friesen");
    

    TestModellerLogger.SetLastNodeGuid("95b31ed9-af0a-49e7-8bfa-8471d379cdff");
    _Login1VAT.Enter_Password("49og1P2iR4");
    

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
    _AgentsSelect.Enter_AgentName("deleniti");
    

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
    _ClientSelect.Enter_ClientName("quidem");
    

    TestModellerLogger.SetLastNodeGuid("ed3e4750-33a4-4d75-a14c-9d75935c79c7");
    _ClientSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("e537c9d6-4166-4745-b27e-a178d69d2884");
    _ClientSelect.Click_SelectClient();
    

pages.VATOnlyBill _VATOnlyBillSToFRS = new pages.VATOnlyBill(driver);
    TestModellerLogger.SetLastNodeGuid("43b71837-169a-4003-8f22-a676f3b67070");
    _VATOnlyBillSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("0984096e-2d45-4d04-8694-0425ef32eba0");
    _VATOnlyBillSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c417c41a-8713-4207-87ff-9e40aaa5b5dd");
    _VATOnlyBillSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("c9060188-9c7f-4b7d-b4de-189d420922e0");
    _VATOnlyBillSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("0f8e7c26-8531-4862-a7d6-2c0652fee79e");
    _VATOnlyBillSToFRS.Click_VATOnlyBill();
    

    TestModellerLogger.SetLastNodeGuid("67342eec-57d7-4a58-b4f5-43beeda93632");
    _VATOnlyBillSToFRS.Select_SupplierName("");
    

    TestModellerLogger.SetLastNodeGuid("b8f5e167-8590-4e61-9e2a-a0ef55e1317f");
    _VATOnlyBillSToFRS.Enter_InvoiceNo();
    

    TestModellerLogger.SetLastNodeGuid("13f1744c-b332-4c44-a0ae-1468bbef2b1b");
    _VATOnlyBillSToFRS.Enter_InvoiceDate("44251");
    

    TestModellerLogger.SetLastNodeGuid("9b3cc656-f690-47a5-bb04-95921b8cd7ad");
    _VATOnlyBillSToFRS.Enter_SubTotal();
    

    TestModellerLogger.SetLastNodeGuid("75fcc555-aa18-4673-8841-61cd4a7bf1a7");
    _VATOnlyBillSToFRS.Select_VATRateType("Exempt");
    

    TestModellerLogger.SetLastNodeGuid("c9a1d57b-b2d4-4f32-a2de-15fc9d1eb7e1");
    _VATOnlyBillSToFRS.Enter_VatRate();
    

    TestModellerLogger.SetLastNodeGuid("c1931af2-592a-456b-b6ee-4196c4d2a512");
    _VATOnlyBillSToFRS.Enter_VAT();
    

    TestModellerLogger.SetLastNodeGuid("725f4abb-1b5c-4fe1-874f-fa21b9133e51");
    _VATOnlyBillSToFRS.Enter_GrossTotal();
    

    TestModellerLogger.SetLastNodeGuid("40701513-cd33-4fbf-9230-e580a1c49022");
    _VATOnlyBillSToFRS.Click_SaveButton();
    

    }

    @Test  (groups= {"ScriptVATOnlyBillSToFRS","ScriptVATOnlyBillSToFRS - Default Profile"})
    @TestModellerPath(guid = "d617dc33-ea22-4538-ab8c-e025d77c0caa")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlCl6()
    {
        
        pages.Login1VAT _Login1VAT = new pages.Login1VAT(driver);
    TestModellerLogger.SetLastNodeGuid("93e4a214-3f97-41d2-8063-dd91c879e847");
    _Login1VAT.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7eff8b4c-1e47-48a4-bcad-b3639d0cdfd5");
    _Login1VAT.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ceaa193b-d8c0-48f9-911f-018e2571da20");
    _Login1VAT.Enter_UserName("Verner_Stark46");
    

    TestModellerLogger.SetLastNodeGuid("95b31ed9-af0a-49e7-8bfa-8471d379cdff");
    _Login1VAT.Enter_Password("pYWFHsR5jw");
    

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
    _AgentsSelect.Enter_AgentName("quis");
    

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
    _ClientSelect.Enter_ClientName("in");
    

    TestModellerLogger.SetLastNodeGuid("ed3e4750-33a4-4d75-a14c-9d75935c79c7");
    _ClientSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("e537c9d6-4166-4745-b27e-a178d69d2884");
    _ClientSelect.Click_SelectClient();
    

pages.VATOnlyBill _VATOnlyBillSToFRS = new pages.VATOnlyBill(driver);
    TestModellerLogger.SetLastNodeGuid("43b71837-169a-4003-8f22-a676f3b67070");
    _VATOnlyBillSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("0984096e-2d45-4d04-8694-0425ef32eba0");
    _VATOnlyBillSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c417c41a-8713-4207-87ff-9e40aaa5b5dd");
    _VATOnlyBillSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("c9060188-9c7f-4b7d-b4de-189d420922e0");
    _VATOnlyBillSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("0f8e7c26-8531-4862-a7d6-2c0652fee79e");
    _VATOnlyBillSToFRS.Click_VATOnlyBill();
    

    TestModellerLogger.SetLastNodeGuid("67342eec-57d7-4a58-b4f5-43beeda93632");
    _VATOnlyBillSToFRS.Select_SupplierName("");
    

    TestModellerLogger.SetLastNodeGuid("b8f5e167-8590-4e61-9e2a-a0ef55e1317f");
    _VATOnlyBillSToFRS.Enter_InvoiceNo();
    

    TestModellerLogger.SetLastNodeGuid("13f1744c-b332-4c44-a0ae-1468bbef2b1b");
    _VATOnlyBillSToFRS.Enter_InvoiceDate("44251");
    

    TestModellerLogger.SetLastNodeGuid("9b3cc656-f690-47a5-bb04-95921b8cd7ad");
    _VATOnlyBillSToFRS.Enter_SubTotal();
    

    TestModellerLogger.SetLastNodeGuid("75fcc555-aa18-4673-8841-61cd4a7bf1a7");
    _VATOnlyBillSToFRS.Select_VATRateType("Out of Scope");
    

    TestModellerLogger.SetLastNodeGuid("c9a1d57b-b2d4-4f32-a2de-15fc9d1eb7e1");
    _VATOnlyBillSToFRS.Enter_VatRate();
    

    TestModellerLogger.SetLastNodeGuid("c1931af2-592a-456b-b6ee-4196c4d2a512");
    _VATOnlyBillSToFRS.Enter_VAT();
    

    TestModellerLogger.SetLastNodeGuid("725f4abb-1b5c-4fe1-874f-fa21b9133e51");
    _VATOnlyBillSToFRS.Enter_GrossTotal();
    

    TestModellerLogger.SetLastNodeGuid("40701513-cd33-4fbf-9230-e580a1c49022");
    _VATOnlyBillSToFRS.Click_SaveButton();
    

    }*/

}
