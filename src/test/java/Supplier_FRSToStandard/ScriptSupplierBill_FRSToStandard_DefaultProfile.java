package Supplier_FRSToStandard;

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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/7cab5ac6-3fc3-47d1-8ab9-d75ea3123ee4
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1100, profileId = 100999)
public class ScriptSupplierBill_FRSToStandard_DefaultProfile extends TestBase
{
	public String sTestCaseID=null;
	String[] data=null;
	String Sheet = null;

    
    @Test  (groups= {"ScriptSupplierBillSToFRS","ScriptSupplierBillSToFRS - Default Profile"})
    @TestModellerPath(guid = "e71d23e0-36b9-450a-9aa3-0fc9a974b214")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlCl1() throws InterruptedException, InvalidFormatException, HeadlessException, IOException, AWTException
    {
    	sTestCaseID="TC213";
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
//    

    TestModellerLogger.SetLastNodeGuid("ff5edd38-07b0-452b-95d6-f33e07e1e975");
    _ClientSelect.Click_ClientsTAB();
    

    TestModellerLogger.SetLastNodeGuid("14a94a5a-c1ac-4e4f-afd4-69a84ffa5a24");
    _ClientSelect.Enter_ClientName(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("ed3e4750-33a4-4d75-a14c-9d75935c79c7");
    _ClientSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("e537c9d6-4166-4745-b27e-a178d69d2884");
    _ClientSelect.Click_SelectClient();
    

    Supplier_pages.SupplierBillSToFRS _SupplierBillSToFRS = new Supplier_pages.SupplierBillSToFRS(driver);
//    TestModellerLogger.SetLastNodeGuid("7b21b860-8f6c-4e5e-8f4d-0ef9aedf75e5");
//    _SupplierBillSToFRS.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("3d11c569-a0da-4838-a238-3d3cd071f91d");
//    _SupplierBillSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5c30d940-2a3c-4ce2-9f6d-f491e71a1755");
    _SupplierBillSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("02bea7d1-9589-4278-8c66-58e376721799");
    _SupplierBillSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("fc395eef-59ac-4e0c-8092-d11ecdb61b84");
    _SupplierBillSToFRS.Click_NewSupplierBill();
    

    TestModellerLogger.SetLastNodeGuid("9ed916b8-79f8-4b59-a274-ed9c520242c8");
    _SupplierBillSToFRS.Select_SupplierName(data[5]);
    

//    TestModellerLogger.SetLastNodeGuid("6cbb598e-673a-45cd-9f0a-ec53cb56f09d");
//    _SupplierBillSToFRS.Enter_DefaultCurrency(data[6]);
//    

    TestModellerLogger.SetLastNodeGuid("6516ccf8-ae24-42b1-b271-2bb390a6f8c3");
    _SupplierBillSToFRS.Enter_BillNo(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("12466744-0bd3-4135-9300-e044e7148e58");
    _SupplierBillSToFRS.Enter_Date(data[7]);
    

    TestModellerLogger.SetLastNodeGuid("7ea52093-1dd7-4979-8034-aeaef336d945");
    _SupplierBillSToFRS.Select_ExpenseType(data[8]);
    

    TestModellerLogger.SetLastNodeGuid("de8f87b1-ff3a-421c-9290-6ddaef339bf2");
    _SupplierBillSToFRS.Enter_Description(data[9]);
    

    TestModellerLogger.SetLastNodeGuid("31e40f93-4cb6-45b2-bb91-cdd42e0f2f68");
    _SupplierBillSToFRS.Enter_UnitPrice(data[10]);
    

    TestModellerLogger.SetLastNodeGuid("956a775c-cdf6-4d7d-949f-76ac35f8991c");
    _SupplierBillSToFRS.Select_VATRateType(data[11]);
    

//    TestModellerLogger.SetLastNodeGuid("5be5550e-c06b-4dbd-bcbf-748aedd3b634");
//    _SupplierBillSToFRS.Enter_VATRate(data[12]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("1721e266-7328-4f01-8af9-62c60f672a82");
//    _SupplierBillSToFRS.Enter_VATAmount(data[13]);
//    

//    TestModellerLogger.SetLastNodeGuid("86be5d84-b080-4b00-b39a-57ef6d127c84");
//    _SupplierBillSToFRS.Enter_Amount(data[5]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("d76e980e-6867-446d-a13a-3bbe2cc719a9");
//    _SupplierBillSToFRS.Click_Tickformorelineitems();
//    

    TestModellerLogger.SetLastNodeGuid("9720f223-ad75-48cf-9a78-a8a001ca0dfb");
    _SupplierBillSToFRS.Click_SaveButton();
    

    }

 @Test  (groups= {"ScriptSupplierBillSToFRS","ScriptSupplierBillSToFRS - Default Profile"})
 
    @TestModellerPath(guid = "ade71e4a-42f6-4a3a-8c4b-822c5ae41d7d")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlCl2() throws HeadlessException, InterruptedException, IOException, AWTException, InvalidFormatException
    {
        
	   sTestCaseID="TC214";
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
    

    Supplier_pages.SupplierBillSToFRS _SupplierBillSToFRS = new Supplier_pages.SupplierBillSToFRS(driver);
//    TestModellerLogger.SetLastNodeGuid("7b21b860-8f6c-4e5e-8f4d-0ef9aedf75e5");
//    _SupplierBillSToFRS.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("3d11c569-a0da-4838-a238-3d3cd071f91d");
//    _SupplierBillSToFRS.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("5c30d940-2a3c-4ce2-9f6d-f491e71a1755");
    _SupplierBillSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("02bea7d1-9589-4278-8c66-58e376721799");
    _SupplierBillSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("fc395eef-59ac-4e0c-8092-d11ecdb61b84");
    _SupplierBillSToFRS.Click_NewSupplierBill();
    

    TestModellerLogger.SetLastNodeGuid("9ed916b8-79f8-4b59-a274-ed9c520242c8");
    _SupplierBillSToFRS.Select_SupplierName(data[5]);
    

//    TestModellerLogger.SetLastNodeGuid("6cbb598e-673a-45cd-9f0a-ec53cb56f09d");
//    _SupplierBillSToFRS.Enter_DefaultCurrency(null);
//    

    TestModellerLogger.SetLastNodeGuid("6516ccf8-ae24-42b1-b271-2bb390a6f8c3");
    _SupplierBillSToFRS.Enter_BillNo(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("12466744-0bd3-4135-9300-e044e7148e58");
    _SupplierBillSToFRS.Enter_Date(data[7]);
    

    TestModellerLogger.SetLastNodeGuid("7ea52093-1dd7-4979-8034-aeaef336d945");
    _SupplierBillSToFRS.Select_ExpenseType(data[8]);
    

    TestModellerLogger.SetLastNodeGuid("de8f87b1-ff3a-421c-9290-6ddaef339bf2");
    _SupplierBillSToFRS.Enter_Description(data[9]);
    

    TestModellerLogger.SetLastNodeGuid("31e40f93-4cb6-45b2-bb91-cdd42e0f2f68");
    _SupplierBillSToFRS.Enter_UnitPrice(data[10]);
    

    TestModellerLogger.SetLastNodeGuid("956a775c-cdf6-4d7d-949f-76ac35f8991c");
    _SupplierBillSToFRS.Select_VATRateType(data[11]);
    

//    TestModellerLogger.SetLastNodeGuid("5be5550e-c06b-4dbd-bcbf-748aedd3b634");
//    _SupplierBillSToFRS.Enter_VATRate();
//    
//
//    TestModellerLogger.SetLastNodeGuid("1721e266-7328-4f01-8af9-62c60f672a82");
//    _SupplierBillSToFRS.Enter_VATAmount("100");
//    
//
//    TestModellerLogger.SetLastNodeGuid("86be5d84-b080-4b00-b39a-57ef6d127c84");
//    _SupplierBillSToFRS.Enter_Amount("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("d76e980e-6867-446d-a13a-3bbe2cc719a9");
//    _SupplierBillSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("9720f223-ad75-48cf-9a78-a8a001ca0dfb");
    _SupplierBillSToFRS.Click_SaveButton();
    

    }

    @Test  (groups= {"ScriptSupplierBillSToFRS","ScriptSupplierBillSToFRS - Default Profile"})
    @TestModellerPath(guid = "50a31ea6-8685-4923-a0d1-1d3e36c05a1d")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlCl3() throws InterruptedException, InvalidFormatException, HeadlessException, IOException, AWTException
    {
    	 sTestCaseID="TC215";
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
    

Supplier_pages.SupplierBillSToFRS _SupplierBillSToFRS = new Supplier_pages.SupplierBillSToFRS(driver);
//    TestModellerLogger.SetLastNodeGuid("7b21b860-8f6c-4e5e-8f4d-0ef9aedf75e5");
//    _SupplierBillSToFRS.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("3d11c569-a0da-4838-a238-3d3cd071f91d");
//    _SupplierBillSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5c30d940-2a3c-4ce2-9f6d-f491e71a1755");
    _SupplierBillSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("02bea7d1-9589-4278-8c66-58e376721799");
    _SupplierBillSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("fc395eef-59ac-4e0c-8092-d11ecdb61b84");
    _SupplierBillSToFRS.Click_NewSupplierBill();
    

    TestModellerLogger.SetLastNodeGuid("9ed916b8-79f8-4b59-a274-ed9c520242c8");
    _SupplierBillSToFRS.Select_SupplierName(data[5]);
    

//    TestModellerLogger.SetLastNodeGuid("6cbb598e-673a-45cd-9f0a-ec53cb56f09d");
//    _SupplierBillSToFRS.Enter_DefaultCurrency();
    

    TestModellerLogger.SetLastNodeGuid("6516ccf8-ae24-42b1-b271-2bb390a6f8c3");
    _SupplierBillSToFRS.Enter_BillNo(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("12466744-0bd3-4135-9300-e044e7148e58");
    _SupplierBillSToFRS.Enter_Date(data[7]);
    

    TestModellerLogger.SetLastNodeGuid("7ea52093-1dd7-4979-8034-aeaef336d945");
    _SupplierBillSToFRS.Select_ExpenseType(data[8]);
    

    TestModellerLogger.SetLastNodeGuid("de8f87b1-ff3a-421c-9290-6ddaef339bf2");
    _SupplierBillSToFRS.Enter_Description(data[9]);
    

    TestModellerLogger.SetLastNodeGuid("31e40f93-4cb6-45b2-bb91-cdd42e0f2f68");
    _SupplierBillSToFRS.Enter_UnitPrice(data[10]);
    

    TestModellerLogger.SetLastNodeGuid("956a775c-cdf6-4d7d-949f-76ac35f8991c");
    _SupplierBillSToFRS.Select_VATRateType(data[11]);
    

//    TestModellerLogger.SetLastNodeGuid("5be5550e-c06b-4dbd-bcbf-748aedd3b634");
//    _SupplierBillSToFRS.Enter_VATRate();
//    
//
//    TestModellerLogger.SetLastNodeGuid("1721e266-7328-4f01-8af9-62c60f672a82");
//    _SupplierBillSToFRS.Enter_VATAmount("100");
//    
//
//    TestModellerLogger.SetLastNodeGuid("86be5d84-b080-4b00-b39a-57ef6d127c84");
//    _SupplierBillSToFRS.Enter_Amount("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("d76e980e-6867-446d-a13a-3bbe2cc719a9");
//    _SupplierBillSToFRS.Click_Tickformorelineitems();
//    

    TestModellerLogger.SetLastNodeGuid("9720f223-ad75-48cf-9a78-a8a001ca0dfb");
    _SupplierBillSToFRS.Click_SaveButton();
    

    }

    @Test  (groups= {"ScriptSupplierBillSToFRS","ScriptSupplierBillSToFRS - Default Profile"})
    @TestModellerPath(guid = "679e4bb2-a4eb-4a1f-a25d-e23c70abe1de")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlCl4() throws HeadlessException, InterruptedException, IOException, AWTException, InvalidFormatException
    {
    	sTestCaseID="TC216";
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
    

Supplier_pages.SupplierBillSToFRS _SupplierBillSToFRS = new Supplier_pages.SupplierBillSToFRS(driver);
//    TestModellerLogger.SetLastNodeGuid("7b21b860-8f6c-4e5e-8f4d-0ef9aedf75e5");
//    _SupplierBillSToFRS.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("3d11c569-a0da-4838-a238-3d3cd071f91d");
//    _SupplierBillSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5c30d940-2a3c-4ce2-9f6d-f491e71a1755");
    _SupplierBillSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("02bea7d1-9589-4278-8c66-58e376721799");
    _SupplierBillSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("fc395eef-59ac-4e0c-8092-d11ecdb61b84");
    _SupplierBillSToFRS.Click_NewSupplierBill();
    

    TestModellerLogger.SetLastNodeGuid("9ed916b8-79f8-4b59-a274-ed9c520242c8");
    _SupplierBillSToFRS.Select_SupplierName(data[5]);
    

//    TestModellerLogger.SetLastNodeGuid("6cbb598e-673a-45cd-9f0a-ec53cb56f09d");
//    _SupplierBillSToFRS.Enter_DefaultCurrency();
//    

    TestModellerLogger.SetLastNodeGuid("6516ccf8-ae24-42b1-b271-2bb390a6f8c3");
    _SupplierBillSToFRS.Enter_BillNo(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("12466744-0bd3-4135-9300-e044e7148e58");
    _SupplierBillSToFRS.Enter_Date(data[7]);
    

    TestModellerLogger.SetLastNodeGuid("7ea52093-1dd7-4979-8034-aeaef336d945");
    _SupplierBillSToFRS.Select_ExpenseType(data[8]);
    

    TestModellerLogger.SetLastNodeGuid("de8f87b1-ff3a-421c-9290-6ddaef339bf2");
    _SupplierBillSToFRS.Enter_Description(data[9]);
    

    TestModellerLogger.SetLastNodeGuid("31e40f93-4cb6-45b2-bb91-cdd42e0f2f68");
    _SupplierBillSToFRS.Enter_UnitPrice(data[10]);
    

    TestModellerLogger.SetLastNodeGuid("956a775c-cdf6-4d7d-949f-76ac35f8991c");
    _SupplierBillSToFRS.Select_VATRateType(data[11]);
    

//    TestModellerLogger.SetLastNodeGuid("5be5550e-c06b-4dbd-bcbf-748aedd3b634");
//    _SupplierBillSToFRS.Enter_VATRate();
//    
//
//    TestModellerLogger.SetLastNodeGuid("1721e266-7328-4f01-8af9-62c60f672a82");
//    _SupplierBillSToFRS.Enter_VATAmount("100");
//    
//
//    TestModellerLogger.SetLastNodeGuid("86be5d84-b080-4b00-b39a-57ef6d127c84");
//    _SupplierBillSToFRS.Enter_Amount("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("d76e980e-6867-446d-a13a-3bbe2cc719a9");
//    _SupplierBillSToFRS.Click_Tickformorelineitems();
//    

    TestModellerLogger.SetLastNodeGuid("9720f223-ad75-48cf-9a78-a8a001ca0dfb");
    _SupplierBillSToFRS.Click_SaveButton();
    

    }

    @Test  (groups= {"ScriptSupplierBillSToFRS","ScriptSupplierBillSToFRS - Default Profile"})
    @TestModellerPath(guid = "5922da68-a59f-45c4-aa0a-2b7161597992")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlCl5() throws HeadlessException, InterruptedException, IOException, AWTException, InvalidFormatException
    {
    	
    	sTestCaseID="TC217";
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
//    

    TestModellerLogger.SetLastNodeGuid("ff5edd38-07b0-452b-95d6-f33e07e1e975");
    _ClientSelect.Click_ClientsTAB();
    

    TestModellerLogger.SetLastNodeGuid("14a94a5a-c1ac-4e4f-afd4-69a84ffa5a24");
    _ClientSelect.Enter_ClientName(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("ed3e4750-33a4-4d75-a14c-9d75935c79c7");
    _ClientSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("e537c9d6-4166-4745-b27e-a178d69d2884");
    _ClientSelect.Click_SelectClient();
    

Supplier_pages.SupplierBillSToFRS _SupplierBillSToFRS = new Supplier_pages.SupplierBillSToFRS(driver);
//    TestModellerLogger.SetLastNodeGuid("7b21b860-8f6c-4e5e-8f4d-0ef9aedf75e5");
//    _SupplierBillSToFRS.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("3d11c569-a0da-4838-a238-3d3cd071f91d");
//    _SupplierBillSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5c30d940-2a3c-4ce2-9f6d-f491e71a1755");
    _SupplierBillSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("02bea7d1-9589-4278-8c66-58e376721799");
    _SupplierBillSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("fc395eef-59ac-4e0c-8092-d11ecdb61b84");
    _SupplierBillSToFRS.Click_NewSupplierBill();
    

    TestModellerLogger.SetLastNodeGuid("9ed916b8-79f8-4b59-a274-ed9c520242c8");
    _SupplierBillSToFRS.Select_SupplierName(data[5]);
    

//    TestModellerLogger.SetLastNodeGuid("6cbb598e-673a-45cd-9f0a-ec53cb56f09d");
//    _SupplierBillSToFRS.Enter_DefaultCurrency();
    

    TestModellerLogger.SetLastNodeGuid("6516ccf8-ae24-42b1-b271-2bb390a6f8c3");
    _SupplierBillSToFRS.Enter_BillNo(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("12466744-0bd3-4135-9300-e044e7148e58");
    _SupplierBillSToFRS.Enter_Date(data[7]);
    

    TestModellerLogger.SetLastNodeGuid("7ea52093-1dd7-4979-8034-aeaef336d945");
    _SupplierBillSToFRS.Select_ExpenseType(data[8]);
    

    TestModellerLogger.SetLastNodeGuid("de8f87b1-ff3a-421c-9290-6ddaef339bf2");
    _SupplierBillSToFRS.Enter_Description(data[9]);
    

    TestModellerLogger.SetLastNodeGuid("31e40f93-4cb6-45b2-bb91-cdd42e0f2f68");
    _SupplierBillSToFRS.Enter_UnitPrice(data[10]);
    

    TestModellerLogger.SetLastNodeGuid("956a775c-cdf6-4d7d-949f-76ac35f8991c");
    _SupplierBillSToFRS.Select_VATRateType(data[11]);
    

//    TestModellerLogger.SetLastNodeGuid("5be5550e-c06b-4dbd-bcbf-748aedd3b634");
//    _SupplierBillSToFRS.Enter_VATRate();
//    
//
//    TestModellerLogger.SetLastNodeGuid("1721e266-7328-4f01-8af9-62c60f672a82");
//    _SupplierBillSToFRS.Enter_VATAmount("100");
//    
//
//    TestModellerLogger.SetLastNodeGuid("86be5d84-b080-4b00-b39a-57ef6d127c84");
//    _SupplierBillSToFRS.Enter_Amount("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("d76e980e-6867-446d-a13a-3bbe2cc719a9");
//    _SupplierBillSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("9720f223-ad75-48cf-9a78-a8a001ca0dfb");
    _SupplierBillSToFRS.Click_SaveButton();
    

    }

    @Test  (groups= {"ScriptSupplierBillSToFRS","ScriptSupplierBillSToFRS - Default Profile"})
    @TestModellerPath(guid = "34cf1b5a-92b8-46c2-ba7f-8422d9db733e")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlCl6() throws InterruptedException, InvalidFormatException, HeadlessException, IOException, AWTException
    {
    	sTestCaseID="TC218";
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
//    

    TestModellerLogger.SetLastNodeGuid("ff5edd38-07b0-452b-95d6-f33e07e1e975");
    _ClientSelect.Click_ClientsTAB();
    

    TestModellerLogger.SetLastNodeGuid("14a94a5a-c1ac-4e4f-afd4-69a84ffa5a24");
    _ClientSelect.Enter_ClientName(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("ed3e4750-33a4-4d75-a14c-9d75935c79c7");
    _ClientSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("e537c9d6-4166-4745-b27e-a178d69d2884");
    _ClientSelect.Click_SelectClient();
    

Supplier_pages.SupplierBillSToFRS _SupplierBillSToFRS = new Supplier_pages.SupplierBillSToFRS(driver);
//    TestModellerLogger.SetLastNodeGuid("7b21b860-8f6c-4e5e-8f4d-0ef9aedf75e5");
//    _SupplierBillSToFRS.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("3d11c569-a0da-4838-a238-3d3cd071f91d");
//    _SupplierBillSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5c30d940-2a3c-4ce2-9f6d-f491e71a1755");
    _SupplierBillSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("02bea7d1-9589-4278-8c66-58e376721799");
    _SupplierBillSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("fc395eef-59ac-4e0c-8092-d11ecdb61b84");
    _SupplierBillSToFRS.Click_NewSupplierBill();
    

    TestModellerLogger.SetLastNodeGuid("9ed916b8-79f8-4b59-a274-ed9c520242c8");
    _SupplierBillSToFRS.Select_SupplierName(data[5]);
    

//    TestModellerLogger.SetLastNodeGuid("6cbb598e-673a-45cd-9f0a-ec53cb56f09d");
//    _SupplierBillSToFRS.Enter_DefaultCurrency();
    

    TestModellerLogger.SetLastNodeGuid("6516ccf8-ae24-42b1-b271-2bb390a6f8c3");
    _SupplierBillSToFRS.Enter_BillNo(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("12466744-0bd3-4135-9300-e044e7148e58");
    _SupplierBillSToFRS.Enter_Date(data[7]);
    

    TestModellerLogger.SetLastNodeGuid("7ea52093-1dd7-4979-8034-aeaef336d945");
    _SupplierBillSToFRS.Select_ExpenseType(data[8]);
    

    TestModellerLogger.SetLastNodeGuid("de8f87b1-ff3a-421c-9290-6ddaef339bf2");
    _SupplierBillSToFRS.Enter_Description(data[9]);
    

    TestModellerLogger.SetLastNodeGuid("31e40f93-4cb6-45b2-bb91-cdd42e0f2f68");
    _SupplierBillSToFRS.Enter_UnitPrice(data[10]);
    

    TestModellerLogger.SetLastNodeGuid("956a775c-cdf6-4d7d-949f-76ac35f8991c");
    _SupplierBillSToFRS.Select_VATRateType(data[11]);
    

//    TestModellerLogger.SetLastNodeGuid("5be5550e-c06b-4dbd-bcbf-748aedd3b634");
//    _SupplierBillSToFRS.Enter_VATRate();
//    
//
//    TestModellerLogger.SetLastNodeGuid("1721e266-7328-4f01-8af9-62c60f672a82");
//    _SupplierBillSToFRS.Enter_VATAmount("100");
//    
//
//    TestModellerLogger.SetLastNodeGuid("86be5d84-b080-4b00-b39a-57ef6d127c84");
//    _SupplierBillSToFRS.Enter_Amount("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("d76e980e-6867-446d-a13a-3bbe2cc719a9");
//    _SupplierBillSToFRS.Click_Tickformorelineitems();
//    

    TestModellerLogger.SetLastNodeGuid("9720f223-ad75-48cf-9a78-a8a001ca0dfb");
    _SupplierBillSToFRS.Click_SaveButton();
    

    }

    /*  @Test  (groups= {"ScriptSupplierBillSToFRS","ScriptSupplierBillSToFRS - Default Profile"})
    @TestModellerPath(guid = "b6a5348c-796c-4bc7-a2c8-49ea88d99810")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlCl7()
    {
        
        pages.Login1VAT _Login1VAT = new pages.Login1VAT(driver);
    TestModellerLogger.SetLastNodeGuid("93e4a214-3f97-41d2-8063-dd91c879e847");
    _Login1VAT.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7eff8b4c-1e47-48a4-bcad-b3639d0cdfd5");
    _Login1VAT.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ceaa193b-d8c0-48f9-911f-018e2571da20");
    _Login1VAT.Enter_UserName("Garth.Heaney73");
    

    TestModellerLogger.SetLastNodeGuid("95b31ed9-af0a-49e7-8bfa-8471d379cdff");
    _Login1VAT.Enter_Password("sPQOuJrl2L");
    

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
    _AgentsSelect.Enter_AgentName("quas");
    

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
    _ClientSelect.Enter_ClientName("tempore");
    

    TestModellerLogger.SetLastNodeGuid("ed3e4750-33a4-4d75-a14c-9d75935c79c7");
    _ClientSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("e537c9d6-4166-4745-b27e-a178d69d2884");
    _ClientSelect.Click_SelectClient();
    

pages.SupplierBillSToFRS _SupplierBillSToFRS = new pages.SupplierBillSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("7b21b860-8f6c-4e5e-8f4d-0ef9aedf75e5");
    _SupplierBillSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3d11c569-a0da-4838-a238-3d3cd071f91d");
    _SupplierBillSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5c30d940-2a3c-4ce2-9f6d-f491e71a1755");
    _SupplierBillSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("02bea7d1-9589-4278-8c66-58e376721799");
    _SupplierBillSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("fc395eef-59ac-4e0c-8092-d11ecdb61b84");
    _SupplierBillSToFRS.Click_NewSupplierBill();
    

    TestModellerLogger.SetLastNodeGuid("9ed916b8-79f8-4b59-a274-ed9c520242c8");
    _SupplierBillSToFRS.Select_SupplierName("Generic Purchase Supplier");
    

    TestModellerLogger.SetLastNodeGuid("6cbb598e-673a-45cd-9f0a-ec53cb56f09d");
    _SupplierBillSToFRS.Enter_DefaultCurrency();
    

    TestModellerLogger.SetLastNodeGuid("6516ccf8-ae24-42b1-b271-2bb390a6f8c3");
    _SupplierBillSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("12466744-0bd3-4135-9300-e044e7148e58");
    _SupplierBillSToFRS.Enter_Date("44249");
    

    TestModellerLogger.SetLastNodeGuid("7ea52093-1dd7-4979-8034-aeaef336d945");
    _SupplierBillSToFRS.Select_ExpenseType("Purchases");
    

    TestModellerLogger.SetLastNodeGuid("de8f87b1-ff3a-421c-9290-6ddaef339bf2");
    _SupplierBillSToFRS.Enter_Description("Qui placeat molestiae accusamus quas numquam quia illo.
Consequatur aut excepturi omnis nobis nihil.
Itaque voluptas enim quasi sequi sint.
Sequi culpa provident vel assumenda magnam facere consectetur odio ab.
Perspiciatis quae ipsa.
Omnis in error.
Itaque vero facilis nisi a voluptatum.
Aliquam labore fuga labore id culpa fuga accusamus est.
Ut quo ea et quidem.
Commodi laudantium soluta qui.");
    

    TestModellerLogger.SetLastNodeGuid("31e40f93-4cb6-45b2-bb91-cdd42e0f2f68");
    _SupplierBillSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("956a775c-cdf6-4d7d-949f-76ac35f8991c");
    _SupplierBillSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("5be5550e-c06b-4dbd-bcbf-748aedd3b634");
    _SupplierBillSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("1721e266-7328-4f01-8af9-62c60f672a82");
    _SupplierBillSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("86be5d84-b080-4b00-b39a-57ef6d127c84");
    _SupplierBillSToFRS.Enter_Amount("");
    

    TestModellerLogger.SetLastNodeGuid("d76e980e-6867-446d-a13a-3bbe2cc719a9");
    _SupplierBillSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("9720f223-ad75-48cf-9a78-a8a001ca0dfb");
    _SupplierBillSToFRS.Click_SaveButton();
    

    }

    @Test  (groups= {"ScriptSupplierBillSToFRS","ScriptSupplierBillSToFRS - Default Profile"})
    @TestModellerPath(guid = "79b9754c-0f72-4ec7-ad17-baf9c120c53c")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlCl8()
    {
        
        pages.Login1VAT _Login1VAT = new pages.Login1VAT(driver);
    TestModellerLogger.SetLastNodeGuid("93e4a214-3f97-41d2-8063-dd91c879e847");
    _Login1VAT.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7eff8b4c-1e47-48a4-bcad-b3639d0cdfd5");
    _Login1VAT.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ceaa193b-d8c0-48f9-911f-018e2571da20");
    _Login1VAT.Enter_UserName("Scotty70");
    

    TestModellerLogger.SetLastNodeGuid("95b31ed9-af0a-49e7-8bfa-8471d379cdff");
    _Login1VAT.Enter_Password("QkGHWG5gO0");
    

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
    _ClientSelect.Enter_ClientName("assumenda");
    

    TestModellerLogger.SetLastNodeGuid("ed3e4750-33a4-4d75-a14c-9d75935c79c7");
    _ClientSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("e537c9d6-4166-4745-b27e-a178d69d2884");
    _ClientSelect.Click_SelectClient();
    

pages.SupplierBillSToFRS _SupplierBillSToFRS = new pages.SupplierBillSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("7b21b860-8f6c-4e5e-8f4d-0ef9aedf75e5");
    _SupplierBillSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3d11c569-a0da-4838-a238-3d3cd071f91d");
    _SupplierBillSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5c30d940-2a3c-4ce2-9f6d-f491e71a1755");
    _SupplierBillSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("02bea7d1-9589-4278-8c66-58e376721799");
    _SupplierBillSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("fc395eef-59ac-4e0c-8092-d11ecdb61b84");
    _SupplierBillSToFRS.Click_NewSupplierBill();
    

    TestModellerLogger.SetLastNodeGuid("9ed916b8-79f8-4b59-a274-ed9c520242c8");
    _SupplierBillSToFRS.Select_SupplierName("Generic Purchase Supplier");
    

    TestModellerLogger.SetLastNodeGuid("6cbb598e-673a-45cd-9f0a-ec53cb56f09d");
    _SupplierBillSToFRS.Enter_DefaultCurrency();
    

    TestModellerLogger.SetLastNodeGuid("6516ccf8-ae24-42b1-b271-2bb390a6f8c3");
    _SupplierBillSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("12466744-0bd3-4135-9300-e044e7148e58");
    _SupplierBillSToFRS.Enter_Date("44249");
    

    TestModellerLogger.SetLastNodeGuid("7ea52093-1dd7-4979-8034-aeaef336d945");
    _SupplierBillSToFRS.Select_ExpenseType("Subcontractors");
    

    TestModellerLogger.SetLastNodeGuid("de8f87b1-ff3a-421c-9290-6ddaef339bf2");
    _SupplierBillSToFRS.Enter_Description("Culpa voluptatem excepturi ut in ut repellat repellat.
Error sed dignissimos et sint dolor enim.
Autem id nesciunt est ullam soluta minima aut minima.
Qui voluptates ut unde quas.
Voluptas ipsa pariatur.
Illo qui recusandae voluptate aut.
Laborum neque sit dolor.
Velit architecto magni quis.
Nisi magni veniam nisi incidunt aliquid exercitationem similique animi dicta.
Sit optio ut distinctio.");
    

    TestModellerLogger.SetLastNodeGuid("31e40f93-4cb6-45b2-bb91-cdd42e0f2f68");
    _SupplierBillSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("956a775c-cdf6-4d7d-949f-76ac35f8991c");
    _SupplierBillSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("5be5550e-c06b-4dbd-bcbf-748aedd3b634");
    _SupplierBillSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("1721e266-7328-4f01-8af9-62c60f672a82");
    _SupplierBillSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("86be5d84-b080-4b00-b39a-57ef6d127c84");
    _SupplierBillSToFRS.Enter_Amount("");
    

    TestModellerLogger.SetLastNodeGuid("d76e980e-6867-446d-a13a-3bbe2cc719a9");
    _SupplierBillSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("9720f223-ad75-48cf-9a78-a8a001ca0dfb");
    _SupplierBillSToFRS.Click_SaveButton();
    

    }

    @Test  (groups= {"ScriptSupplierBillSToFRS","ScriptSupplierBillSToFRS - Default Profile"})
    @TestModellerPath(guid = "c08d7e30-11bb-4fb2-8fd2-11a8e4a761ae")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlCl9()
    {
        
        pages.Login1VAT _Login1VAT = new pages.Login1VAT(driver);
    TestModellerLogger.SetLastNodeGuid("93e4a214-3f97-41d2-8063-dd91c879e847");
    _Login1VAT.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7eff8b4c-1e47-48a4-bcad-b3639d0cdfd5");
    _Login1VAT.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ceaa193b-d8c0-48f9-911f-018e2571da20");
    _Login1VAT.Enter_UserName("Cristobal.Tromp46");
    

    TestModellerLogger.SetLastNodeGuid("95b31ed9-af0a-49e7-8bfa-8471d379cdff");
    _Login1VAT.Enter_Password("87QXfz9ofx");
    

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
    _AgentsSelect.Enter_AgentName("aut");
    

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
    

pages.SupplierBillSToFRS _SupplierBillSToFRS = new pages.SupplierBillSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("7b21b860-8f6c-4e5e-8f4d-0ef9aedf75e5");
    _SupplierBillSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3d11c569-a0da-4838-a238-3d3cd071f91d");
    _SupplierBillSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5c30d940-2a3c-4ce2-9f6d-f491e71a1755");
    _SupplierBillSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("02bea7d1-9589-4278-8c66-58e376721799");
    _SupplierBillSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("fc395eef-59ac-4e0c-8092-d11ecdb61b84");
    _SupplierBillSToFRS.Click_NewSupplierBill();
    

    TestModellerLogger.SetLastNodeGuid("9ed916b8-79f8-4b59-a274-ed9c520242c8");
    _SupplierBillSToFRS.Select_SupplierName("Generic Purchase Supplier");
    

    TestModellerLogger.SetLastNodeGuid("6cbb598e-673a-45cd-9f0a-ec53cb56f09d");
    _SupplierBillSToFRS.Enter_DefaultCurrency();
    

    TestModellerLogger.SetLastNodeGuid("6516ccf8-ae24-42b1-b271-2bb390a6f8c3");
    _SupplierBillSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("12466744-0bd3-4135-9300-e044e7148e58");
    _SupplierBillSToFRS.Enter_Date("44249");
    

    TestModellerLogger.SetLastNodeGuid("7ea52093-1dd7-4979-8034-aeaef336d945");
    _SupplierBillSToFRS.Select_ExpenseType("Accountancy fee");
    

    TestModellerLogger.SetLastNodeGuid("de8f87b1-ff3a-421c-9290-6ddaef339bf2");
    _SupplierBillSToFRS.Enter_Description("Facere aut quia et sed et aspernatur odit velit.
Numquam voluptatem excepturi facere impedit omnis molestias accusantium cumque.
Commodi aut porro.
Mollitia laudantium tempore occaecati aliquid accusamus veritatis molestiae rerum consectetur.
Quia aut ad aut corrupti velit praesentium.
Dolore hic possimus amet deserunt hic.
Qui maiores consequatur.
Odio rerum sunt numquam rem.
Adipisci culpa possimus voluptas omnis temporibus autem voluptatem.
Eum et incidunt repudiandae.");
    

    TestModellerLogger.SetLastNodeGuid("31e40f93-4cb6-45b2-bb91-cdd42e0f2f68");
    _SupplierBillSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("956a775c-cdf6-4d7d-949f-76ac35f8991c");
    _SupplierBillSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("5be5550e-c06b-4dbd-bcbf-748aedd3b634");
    _SupplierBillSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("1721e266-7328-4f01-8af9-62c60f672a82");
    _SupplierBillSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("86be5d84-b080-4b00-b39a-57ef6d127c84");
    _SupplierBillSToFRS.Enter_Amount("");
    

    TestModellerLogger.SetLastNodeGuid("d76e980e-6867-446d-a13a-3bbe2cc719a9");
    _SupplierBillSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("9720f223-ad75-48cf-9a78-a8a001ca0dfb");
    _SupplierBillSToFRS.Click_SaveButton();
    

    }

    @Test  (groups= {"ScriptSupplierBillSToFRS","ScriptSupplierBillSToFRS - Default Profile"})
    @TestModellerPath(guid = "c34a8f7d-11e3-46a6-a33c-df45ac4c62ae")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlC10()
    {
        
        pages.Login1VAT _Login1VAT = new pages.Login1VAT(driver);
    TestModellerLogger.SetLastNodeGuid("93e4a214-3f97-41d2-8063-dd91c879e847");
    _Login1VAT.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7eff8b4c-1e47-48a4-bcad-b3639d0cdfd5");
    _Login1VAT.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ceaa193b-d8c0-48f9-911f-018e2571da20");
    _Login1VAT.Enter_UserName("Precious_Runte30");
    

    TestModellerLogger.SetLastNodeGuid("95b31ed9-af0a-49e7-8bfa-8471d379cdff");
    _Login1VAT.Enter_Password("8yclPlqYB8");
    

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
    _AgentsSelect.Enter_AgentName("repudiandae");
    

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
    _ClientSelect.Enter_ClientName("ut");
    

    TestModellerLogger.SetLastNodeGuid("ed3e4750-33a4-4d75-a14c-9d75935c79c7");
    _ClientSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("e537c9d6-4166-4745-b27e-a178d69d2884");
    _ClientSelect.Click_SelectClient();
    

pages.SupplierBillSToFRS _SupplierBillSToFRS = new pages.SupplierBillSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("7b21b860-8f6c-4e5e-8f4d-0ef9aedf75e5");
    _SupplierBillSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3d11c569-a0da-4838-a238-3d3cd071f91d");
    _SupplierBillSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5c30d940-2a3c-4ce2-9f6d-f491e71a1755");
    _SupplierBillSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("02bea7d1-9589-4278-8c66-58e376721799");
    _SupplierBillSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("fc395eef-59ac-4e0c-8092-d11ecdb61b84");
    _SupplierBillSToFRS.Click_NewSupplierBill();
    

    TestModellerLogger.SetLastNodeGuid("9ed916b8-79f8-4b59-a274-ed9c520242c8");
    _SupplierBillSToFRS.Select_SupplierName("Generic Purchase Supplier");
    

    TestModellerLogger.SetLastNodeGuid("6cbb598e-673a-45cd-9f0a-ec53cb56f09d");
    _SupplierBillSToFRS.Enter_DefaultCurrency();
    

    TestModellerLogger.SetLastNodeGuid("6516ccf8-ae24-42b1-b271-2bb390a6f8c3");
    _SupplierBillSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("12466744-0bd3-4135-9300-e044e7148e58");
    _SupplierBillSToFRS.Enter_Date("44249");
    

    TestModellerLogger.SetLastNodeGuid("7ea52093-1dd7-4979-8034-aeaef336d945");
    _SupplierBillSToFRS.Select_ExpenseType("Advertising, sales promotion, marketing");
    

    TestModellerLogger.SetLastNodeGuid("de8f87b1-ff3a-421c-9290-6ddaef339bf2");
    _SupplierBillSToFRS.Enter_Description("Minima beatae similique labore ab architecto quam qui facere.
Ut saepe aut praesentium nostrum dolorum nihil beatae.
Nesciunt eum et et error praesentium.
Quasi temporibus ea sed perspiciatis fuga sed.
Quis fugit aut occaecati minima cumque consequatur temporibus.
Sint voluptatem possimus molestiae blanditiis et minima.
Quia asperiores pariatur blanditiis.
Est consequatur omnis praesentium consequatur harum.
Eius aut est eligendi.
Dicta dolor est amet.");
    

    TestModellerLogger.SetLastNodeGuid("31e40f93-4cb6-45b2-bb91-cdd42e0f2f68");
    _SupplierBillSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("956a775c-cdf6-4d7d-949f-76ac35f8991c");
    _SupplierBillSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("5be5550e-c06b-4dbd-bcbf-748aedd3b634");
    _SupplierBillSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("1721e266-7328-4f01-8af9-62c60f672a82");
    _SupplierBillSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("86be5d84-b080-4b00-b39a-57ef6d127c84");
    _SupplierBillSToFRS.Enter_Amount("");
    

    TestModellerLogger.SetLastNodeGuid("d76e980e-6867-446d-a13a-3bbe2cc719a9");
    _SupplierBillSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("9720f223-ad75-48cf-9a78-a8a001ca0dfb");
    _SupplierBillSToFRS.Click_SaveButton();
    

    }

    @Test  (groups= {"ScriptSupplierBillSToFRS","ScriptSupplierBillSToFRS - Default Profile"})
    @TestModellerPath(guid = "8a0b3db7-0065-4f0e-aee4-42fe1734a4b0")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlC11()
    {
        
        pages.Login1VAT _Login1VAT = new pages.Login1VAT(driver);
    TestModellerLogger.SetLastNodeGuid("93e4a214-3f97-41d2-8063-dd91c879e847");
    _Login1VAT.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7eff8b4c-1e47-48a4-bcad-b3639d0cdfd5");
    _Login1VAT.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ceaa193b-d8c0-48f9-911f-018e2571da20");
    _Login1VAT.Enter_UserName("Devonte6");
    

    TestModellerLogger.SetLastNodeGuid("95b31ed9-af0a-49e7-8bfa-8471d379cdff");
    _Login1VAT.Enter_Password("3gFogvSyz0");
    

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
    _AgentsSelect.Enter_AgentName("sunt");
    

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
    _ClientSelect.Enter_ClientName("dolor");
    

    TestModellerLogger.SetLastNodeGuid("ed3e4750-33a4-4d75-a14c-9d75935c79c7");
    _ClientSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("e537c9d6-4166-4745-b27e-a178d69d2884");
    _ClientSelect.Click_SelectClient();
    

pages.SupplierBillSToFRS _SupplierBillSToFRS = new pages.SupplierBillSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("7b21b860-8f6c-4e5e-8f4d-0ef9aedf75e5");
    _SupplierBillSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3d11c569-a0da-4838-a238-3d3cd071f91d");
    _SupplierBillSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5c30d940-2a3c-4ce2-9f6d-f491e71a1755");
    _SupplierBillSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("02bea7d1-9589-4278-8c66-58e376721799");
    _SupplierBillSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("fc395eef-59ac-4e0c-8092-d11ecdb61b84");
    _SupplierBillSToFRS.Click_NewSupplierBill();
    

    TestModellerLogger.SetLastNodeGuid("9ed916b8-79f8-4b59-a274-ed9c520242c8");
    _SupplierBillSToFRS.Select_SupplierName("Generic Purchase Supplier");
    

    TestModellerLogger.SetLastNodeGuid("6cbb598e-673a-45cd-9f0a-ec53cb56f09d");
    _SupplierBillSToFRS.Enter_DefaultCurrency();
    

    TestModellerLogger.SetLastNodeGuid("6516ccf8-ae24-42b1-b271-2bb390a6f8c3");
    _SupplierBillSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("12466744-0bd3-4135-9300-e044e7148e58");
    _SupplierBillSToFRS.Enter_Date("44249");
    

    TestModellerLogger.SetLastNodeGuid("7ea52093-1dd7-4979-8034-aeaef336d945");
    _SupplierBillSToFRS.Select_ExpenseType("Bank, card and overdraft charges");
    

    TestModellerLogger.SetLastNodeGuid("de8f87b1-ff3a-421c-9290-6ddaef339bf2");
    _SupplierBillSToFRS.Enter_Description("Nihil neque et accusamus quia suscipit.
Et ex dolor a.
Alias quod illum optio id laborum.
Esse ut et aliquam quis.
Libero perferendis cupiditate tempora inventore et fugit id.
Architecto exercitationem iure voluptas illo aut aut.
Suscipit asperiores consequuntur porro est dignissimos voluptatibus quasi illo voluptatibus.
Et officiis quidem voluptates et consequuntur blanditiis voluptatem optio in.
Ipsam nulla qui velit libero.
Enim aut iste laudantium provident natus qui.");
    

    TestModellerLogger.SetLastNodeGuid("31e40f93-4cb6-45b2-bb91-cdd42e0f2f68");
    _SupplierBillSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("956a775c-cdf6-4d7d-949f-76ac35f8991c");
    _SupplierBillSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("5be5550e-c06b-4dbd-bcbf-748aedd3b634");
    _SupplierBillSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("1721e266-7328-4f01-8af9-62c60f672a82");
    _SupplierBillSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("86be5d84-b080-4b00-b39a-57ef6d127c84");
    _SupplierBillSToFRS.Enter_Amount("");
    

    TestModellerLogger.SetLastNodeGuid("d76e980e-6867-446d-a13a-3bbe2cc719a9");
    _SupplierBillSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("9720f223-ad75-48cf-9a78-a8a001ca0dfb");
    _SupplierBillSToFRS.Click_SaveButton();
    

    }

    @Test  (groups= {"ScriptSupplierBillSToFRS","ScriptSupplierBillSToFRS - Default Profile"})
    @TestModellerPath(guid = "c49ed21d-bdff-4068-9d64-33feb7897751")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlC12()
    {
        
        pages.Login1VAT _Login1VAT = new pages.Login1VAT(driver);
    TestModellerLogger.SetLastNodeGuid("93e4a214-3f97-41d2-8063-dd91c879e847");
    _Login1VAT.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7eff8b4c-1e47-48a4-bcad-b3639d0cdfd5");
    _Login1VAT.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ceaa193b-d8c0-48f9-911f-018e2571da20");
    _Login1VAT.Enter_UserName("Kaleb.Ebert33");
    

    TestModellerLogger.SetLastNodeGuid("95b31ed9-af0a-49e7-8bfa-8471d379cdff");
    _Login1VAT.Enter_Password("WurpFjC1Eu");
    

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
    _AgentsSelect.Enter_AgentName("placeat");
    

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
    _ClientSelect.Enter_ClientName("omnis");
    

    TestModellerLogger.SetLastNodeGuid("ed3e4750-33a4-4d75-a14c-9d75935c79c7");
    _ClientSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("e537c9d6-4166-4745-b27e-a178d69d2884");
    _ClientSelect.Click_SelectClient();
    

pages.SupplierBillSToFRS _SupplierBillSToFRS = new pages.SupplierBillSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("7b21b860-8f6c-4e5e-8f4d-0ef9aedf75e5");
    _SupplierBillSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3d11c569-a0da-4838-a238-3d3cd071f91d");
    _SupplierBillSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5c30d940-2a3c-4ce2-9f6d-f491e71a1755");
    _SupplierBillSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("02bea7d1-9589-4278-8c66-58e376721799");
    _SupplierBillSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("fc395eef-59ac-4e0c-8092-d11ecdb61b84");
    _SupplierBillSToFRS.Click_NewSupplierBill();
    

    TestModellerLogger.SetLastNodeGuid("9ed916b8-79f8-4b59-a274-ed9c520242c8");
    _SupplierBillSToFRS.Select_SupplierName("Generic Purchase Supplier");
    

    TestModellerLogger.SetLastNodeGuid("6cbb598e-673a-45cd-9f0a-ec53cb56f09d");
    _SupplierBillSToFRS.Enter_DefaultCurrency();
    

    TestModellerLogger.SetLastNodeGuid("6516ccf8-ae24-42b1-b271-2bb390a6f8c3");
    _SupplierBillSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("12466744-0bd3-4135-9300-e044e7148e58");
    _SupplierBillSToFRS.Enter_Date("44249");
    

    TestModellerLogger.SetLastNodeGuid("7ea52093-1dd7-4979-8034-aeaef336d945");
    _SupplierBillSToFRS.Select_ExpenseType("Business entertaining");
    

    TestModellerLogger.SetLastNodeGuid("de8f87b1-ff3a-421c-9290-6ddaef339bf2");
    _SupplierBillSToFRS.Enter_Description("Nesciunt alias aut neque ut porro iusto.
Qui quidem animi natus sit culpa.
Soluta minima maiores.
Est praesentium omnis beatae.
Corrupti delectus ipsam et est repellat.
Reprehenderit placeat nesciunt.
Nostrum et nobis quos.
Incidunt eos dolorem suscipit tenetur ut aliquid reiciendis.
Culpa delectus eaque accusamus quibusdam vitae in et.
Tempore ut ea non id ratione.");
    

    TestModellerLogger.SetLastNodeGuid("31e40f93-4cb6-45b2-bb91-cdd42e0f2f68");
    _SupplierBillSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("956a775c-cdf6-4d7d-949f-76ac35f8991c");
    _SupplierBillSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("5be5550e-c06b-4dbd-bcbf-748aedd3b634");
    _SupplierBillSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("1721e266-7328-4f01-8af9-62c60f672a82");
    _SupplierBillSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("86be5d84-b080-4b00-b39a-57ef6d127c84");
    _SupplierBillSToFRS.Enter_Amount("");
    

    TestModellerLogger.SetLastNodeGuid("d76e980e-6867-446d-a13a-3bbe2cc719a9");
    _SupplierBillSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("9720f223-ad75-48cf-9a78-a8a001ca0dfb");
    _SupplierBillSToFRS.Click_SaveButton();
    

    }

    @Test  (groups= {"ScriptSupplierBillSToFRS","ScriptSupplierBillSToFRS - Default Profile"})
    @TestModellerPath(guid = "82a85633-36ae-4670-8ad2-2b03905e2df7")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlC13()
    {
        
        pages.Login1VAT _Login1VAT = new pages.Login1VAT(driver);
    TestModellerLogger.SetLastNodeGuid("93e4a214-3f97-41d2-8063-dd91c879e847");
    _Login1VAT.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7eff8b4c-1e47-48a4-bcad-b3639d0cdfd5");
    _Login1VAT.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ceaa193b-d8c0-48f9-911f-018e2571da20");
    _Login1VAT.Enter_UserName("Yasmeen.Walker");
    

    TestModellerLogger.SetLastNodeGuid("95b31ed9-af0a-49e7-8bfa-8471d379cdff");
    _Login1VAT.Enter_Password("QmjJEyN9cb");
    

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
    _AgentsSelect.Enter_AgentName("iure");
    

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
    _ClientSelect.Enter_ClientName("expedita");
    

    TestModellerLogger.SetLastNodeGuid("ed3e4750-33a4-4d75-a14c-9d75935c79c7");
    _ClientSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("e537c9d6-4166-4745-b27e-a178d69d2884");
    _ClientSelect.Click_SelectClient();
    

pages.SupplierBillSToFRS _SupplierBillSToFRS = new pages.SupplierBillSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("7b21b860-8f6c-4e5e-8f4d-0ef9aedf75e5");
    _SupplierBillSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3d11c569-a0da-4838-a238-3d3cd071f91d");
    _SupplierBillSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5c30d940-2a3c-4ce2-9f6d-f491e71a1755");
    _SupplierBillSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("02bea7d1-9589-4278-8c66-58e376721799");
    _SupplierBillSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("fc395eef-59ac-4e0c-8092-d11ecdb61b84");
    _SupplierBillSToFRS.Click_NewSupplierBill();
    

    TestModellerLogger.SetLastNodeGuid("9ed916b8-79f8-4b59-a274-ed9c520242c8");
    _SupplierBillSToFRS.Select_SupplierName("Generic Purchase Supplier");
    

    TestModellerLogger.SetLastNodeGuid("6cbb598e-673a-45cd-9f0a-ec53cb56f09d");
    _SupplierBillSToFRS.Enter_DefaultCurrency();
    

    TestModellerLogger.SetLastNodeGuid("6516ccf8-ae24-42b1-b271-2bb390a6f8c3");
    _SupplierBillSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("12466744-0bd3-4135-9300-e044e7148e58");
    _SupplierBillSToFRS.Enter_Date("44249");
    

    TestModellerLogger.SetLastNodeGuid("7ea52093-1dd7-4979-8034-aeaef336d945");
    _SupplierBillSToFRS.Select_ExpenseType("Equipment expensed");
    

    TestModellerLogger.SetLastNodeGuid("de8f87b1-ff3a-421c-9290-6ddaef339bf2");
    _SupplierBillSToFRS.Enter_Description("Mollitia dolores et perspiciatis.
Deserunt maxime rem qui et.
Eius et aperiam veritatis cupiditate.
Architecto nulla consequatur aut aut tempora nostrum cumque ea voluptatem.
Quod sunt quia rerum earum suscipit quis perspiciatis consequatur.
Voluptas aut dolor maiores sunt.
Et enim tempore aut voluptatum est eos hic.
Vel ad qui ut quia nulla.
Sunt rerum qui quos exercitationem optio minima minus nam sint.
Cumque enim eaque consectetur.");
    

    TestModellerLogger.SetLastNodeGuid("31e40f93-4cb6-45b2-bb91-cdd42e0f2f68");
    _SupplierBillSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("956a775c-cdf6-4d7d-949f-76ac35f8991c");
    _SupplierBillSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("5be5550e-c06b-4dbd-bcbf-748aedd3b634");
    _SupplierBillSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("1721e266-7328-4f01-8af9-62c60f672a82");
    _SupplierBillSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("86be5d84-b080-4b00-b39a-57ef6d127c84");
    _SupplierBillSToFRS.Enter_Amount("");
    

    TestModellerLogger.SetLastNodeGuid("d76e980e-6867-446d-a13a-3bbe2cc719a9");
    _SupplierBillSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("9720f223-ad75-48cf-9a78-a8a001ca0dfb");
    _SupplierBillSToFRS.Click_SaveButton();
    

    }

    @Test  (groups= {"ScriptSupplierBillSToFRS","ScriptSupplierBillSToFRS - Default Profile"})
    @TestModellerPath(guid = "5ffecf0c-75c2-421b-b1f7-733293cb50c6")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlC14()
    {
        
        pages.Login1VAT _Login1VAT = new pages.Login1VAT(driver);
    TestModellerLogger.SetLastNodeGuid("93e4a214-3f97-41d2-8063-dd91c879e847");
    _Login1VAT.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7eff8b4c-1e47-48a4-bcad-b3639d0cdfd5");
    _Login1VAT.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ceaa193b-d8c0-48f9-911f-018e2571da20");
    _Login1VAT.Enter_UserName("Sarina.Daniel");
    

    TestModellerLogger.SetLastNodeGuid("95b31ed9-af0a-49e7-8bfa-8471d379cdff");
    _Login1VAT.Enter_Password("yvZKVglpmj");
    

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
    _ClientSelect.Enter_ClientName("iure");
    

    TestModellerLogger.SetLastNodeGuid("ed3e4750-33a4-4d75-a14c-9d75935c79c7");
    _ClientSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("e537c9d6-4166-4745-b27e-a178d69d2884");
    _ClientSelect.Click_SelectClient();
    

pages.SupplierBillSToFRS _SupplierBillSToFRS = new pages.SupplierBillSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("7b21b860-8f6c-4e5e-8f4d-0ef9aedf75e5");
    _SupplierBillSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3d11c569-a0da-4838-a238-3d3cd071f91d");
    _SupplierBillSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5c30d940-2a3c-4ce2-9f6d-f491e71a1755");
    _SupplierBillSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("02bea7d1-9589-4278-8c66-58e376721799");
    _SupplierBillSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("fc395eef-59ac-4e0c-8092-d11ecdb61b84");
    _SupplierBillSToFRS.Click_NewSupplierBill();
    

    TestModellerLogger.SetLastNodeGuid("9ed916b8-79f8-4b59-a274-ed9c520242c8");
    _SupplierBillSToFRS.Select_SupplierName("Generic Purchase Supplier");
    

    TestModellerLogger.SetLastNodeGuid("6cbb598e-673a-45cd-9f0a-ec53cb56f09d");
    _SupplierBillSToFRS.Enter_DefaultCurrency();
    

    TestModellerLogger.SetLastNodeGuid("6516ccf8-ae24-42b1-b271-2bb390a6f8c3");
    _SupplierBillSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("12466744-0bd3-4135-9300-e044e7148e58");
    _SupplierBillSToFRS.Enter_Date("44249");
    

    TestModellerLogger.SetLastNodeGuid("7ea52093-1dd7-4979-8034-aeaef336d945");
    _SupplierBillSToFRS.Select_ExpenseType("Insurance");
    

    TestModellerLogger.SetLastNodeGuid("de8f87b1-ff3a-421c-9290-6ddaef339bf2");
    _SupplierBillSToFRS.Enter_Description("Voluptates voluptatem illo incidunt quis ratione error inventore.
Ad neque voluptate nulla ut ut aliquam mollitia ex.
Aperiam itaque ducimus sapiente provident.
Rerum blanditiis amet quis.
Eligendi voluptatibus blanditiis sit distinctio fuga cum voluptatem.
Unde quo tempore debitis et asperiores nostrum laudantium aut tenetur.
Voluptas eius vero ex autem laudantium ea cupiditate.
Minus eligendi autem.
Quia qui dolor tenetur distinctio sunt est culpa sit.
Qui voluptatem voluptatem similique quisquam ut.");
    

    TestModellerLogger.SetLastNodeGuid("31e40f93-4cb6-45b2-bb91-cdd42e0f2f68");
    _SupplierBillSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("956a775c-cdf6-4d7d-949f-76ac35f8991c");
    _SupplierBillSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("5be5550e-c06b-4dbd-bcbf-748aedd3b634");
    _SupplierBillSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("1721e266-7328-4f01-8af9-62c60f672a82");
    _SupplierBillSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("86be5d84-b080-4b00-b39a-57ef6d127c84");
    _SupplierBillSToFRS.Enter_Amount("");
    

    TestModellerLogger.SetLastNodeGuid("d76e980e-6867-446d-a13a-3bbe2cc719a9");
    _SupplierBillSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("9720f223-ad75-48cf-9a78-a8a001ca0dfb");
    _SupplierBillSToFRS.Click_SaveButton();
    

    }

    @Test  (groups= {"ScriptSupplierBillSToFRS","ScriptSupplierBillSToFRS - Default Profile"})
    @TestModellerPath(guid = "401e4529-477b-4688-b246-e2c4ee774694")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlC15()
    {
        
        pages.Login1VAT _Login1VAT = new pages.Login1VAT(driver);
    TestModellerLogger.SetLastNodeGuid("93e4a214-3f97-41d2-8063-dd91c879e847");
    _Login1VAT.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7eff8b4c-1e47-48a4-bcad-b3639d0cdfd5");
    _Login1VAT.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ceaa193b-d8c0-48f9-911f-018e2571da20");
    _Login1VAT.Enter_UserName("Karson_Roob");
    

    TestModellerLogger.SetLastNodeGuid("95b31ed9-af0a-49e7-8bfa-8471d379cdff");
    _Login1VAT.Enter_Password("iUVOq9p8bO");
    

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
    _AgentsSelect.Enter_AgentName("vero");
    

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
    _ClientSelect.Enter_ClientName("consequatur");
    

    TestModellerLogger.SetLastNodeGuid("ed3e4750-33a4-4d75-a14c-9d75935c79c7");
    _ClientSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("e537c9d6-4166-4745-b27e-a178d69d2884");
    _ClientSelect.Click_SelectClient();
    

pages.SupplierBillSToFRS _SupplierBillSToFRS = new pages.SupplierBillSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("7b21b860-8f6c-4e5e-8f4d-0ef9aedf75e5");
    _SupplierBillSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3d11c569-a0da-4838-a238-3d3cd071f91d");
    _SupplierBillSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5c30d940-2a3c-4ce2-9f6d-f491e71a1755");
    _SupplierBillSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("02bea7d1-9589-4278-8c66-58e376721799");
    _SupplierBillSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("fc395eef-59ac-4e0c-8092-d11ecdb61b84");
    _SupplierBillSToFRS.Click_NewSupplierBill();
    

    TestModellerLogger.SetLastNodeGuid("9ed916b8-79f8-4b59-a274-ed9c520242c8");
    _SupplierBillSToFRS.Select_SupplierName("Generic Purchase Supplier");
    

    TestModellerLogger.SetLastNodeGuid("6cbb598e-673a-45cd-9f0a-ec53cb56f09d");
    _SupplierBillSToFRS.Enter_DefaultCurrency();
    

    TestModellerLogger.SetLastNodeGuid("6516ccf8-ae24-42b1-b271-2bb390a6f8c3");
    _SupplierBillSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("12466744-0bd3-4135-9300-e044e7148e58");
    _SupplierBillSToFRS.Enter_Date("44249");
    

    TestModellerLogger.SetLastNodeGuid("7ea52093-1dd7-4979-8034-aeaef336d945");
    _SupplierBillSToFRS.Select_ExpenseType("Membership and subscriptions");
    

    TestModellerLogger.SetLastNodeGuid("de8f87b1-ff3a-421c-9290-6ddaef339bf2");
    _SupplierBillSToFRS.Enter_Description("Rem quia aut reprehenderit velit.
Sequi velit amet vero laboriosam.
Facere expedita vel laboriosam et incidunt nisi sequi repellat repellendus.
Aperiam non saepe.
Voluptatibus adipisci iste ipsa qui eius temporibus aut.
Pariatur enim quis.
Molestiae dolores dolore delectus reiciendis.
Illum veritatis qui provident quis.
Necessitatibus qui laboriosam est dicta et.
Nemo dolorum ipsum alias et vel velit nobis delectus.");
    

    TestModellerLogger.SetLastNodeGuid("31e40f93-4cb6-45b2-bb91-cdd42e0f2f68");
    _SupplierBillSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("956a775c-cdf6-4d7d-949f-76ac35f8991c");
    _SupplierBillSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("5be5550e-c06b-4dbd-bcbf-748aedd3b634");
    _SupplierBillSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("1721e266-7328-4f01-8af9-62c60f672a82");
    _SupplierBillSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("86be5d84-b080-4b00-b39a-57ef6d127c84");
    _SupplierBillSToFRS.Enter_Amount("");
    

    TestModellerLogger.SetLastNodeGuid("d76e980e-6867-446d-a13a-3bbe2cc719a9");
    _SupplierBillSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("9720f223-ad75-48cf-9a78-a8a001ca0dfb");
    _SupplierBillSToFRS.Click_SaveButton();
    

    }

    @Test  (groups= {"ScriptSupplierBillSToFRS","ScriptSupplierBillSToFRS - Default Profile"})
    @TestModellerPath(guid = "d60907e0-5630-401d-bcf2-c5e63b9f83cb")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlC16()
    {
        
        pages.Login1VAT _Login1VAT = new pages.Login1VAT(driver);
    TestModellerLogger.SetLastNodeGuid("93e4a214-3f97-41d2-8063-dd91c879e847");
    _Login1VAT.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7eff8b4c-1e47-48a4-bcad-b3639d0cdfd5");
    _Login1VAT.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ceaa193b-d8c0-48f9-911f-018e2571da20");
    _Login1VAT.Enter_UserName("Frankie.Corwin95");
    

    TestModellerLogger.SetLastNodeGuid("95b31ed9-af0a-49e7-8bfa-8471d379cdff");
    _Login1VAT.Enter_Password("xJy1gd3WcW");
    

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
    _ClientSelect.Enter_ClientName("magni");
    

    TestModellerLogger.SetLastNodeGuid("ed3e4750-33a4-4d75-a14c-9d75935c79c7");
    _ClientSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("e537c9d6-4166-4745-b27e-a178d69d2884");
    _ClientSelect.Click_SelectClient();
    

pages.SupplierBillSToFRS _SupplierBillSToFRS = new pages.SupplierBillSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("7b21b860-8f6c-4e5e-8f4d-0ef9aedf75e5");
    _SupplierBillSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3d11c569-a0da-4838-a238-3d3cd071f91d");
    _SupplierBillSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5c30d940-2a3c-4ce2-9f6d-f491e71a1755");
    _SupplierBillSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("02bea7d1-9589-4278-8c66-58e376721799");
    _SupplierBillSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("fc395eef-59ac-4e0c-8092-d11ecdb61b84");
    _SupplierBillSToFRS.Click_NewSupplierBill();
    

    TestModellerLogger.SetLastNodeGuid("9ed916b8-79f8-4b59-a274-ed9c520242c8");
    _SupplierBillSToFRS.Select_SupplierName("Generic Purchase Supplier");
    

    TestModellerLogger.SetLastNodeGuid("6cbb598e-673a-45cd-9f0a-ec53cb56f09d");
    _SupplierBillSToFRS.Enter_DefaultCurrency();
    

    TestModellerLogger.SetLastNodeGuid("6516ccf8-ae24-42b1-b271-2bb390a6f8c3");
    _SupplierBillSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("12466744-0bd3-4135-9300-e044e7148e58");
    _SupplierBillSToFRS.Enter_Date("44249");
    

    TestModellerLogger.SetLastNodeGuid("7ea52093-1dd7-4979-8034-aeaef336d945");
    _SupplierBillSToFRS.Select_ExpenseType("Postage, stationery, office supplies");
    

    TestModellerLogger.SetLastNodeGuid("de8f87b1-ff3a-421c-9290-6ddaef339bf2");
    _SupplierBillSToFRS.Enter_Description("Qui et sed architecto illo dolorem beatae culpa aliquam nam.
Fuga aliquam qui qui.
Aut repellendus voluptate et est aliquam.
Et voluptatem dolor tempore.
Sint aut ipsa voluptas iste necessitatibus libero voluptatum voluptatem.
Aut eligendi incidunt.
Repudiandae suscipit dignissimos.
Rerum et excepturi quia.
Nihil quia autem ad voluptatum minus sint et ad.
Tempora et veniam dolorum nisi quasi.");
    

    TestModellerLogger.SetLastNodeGuid("31e40f93-4cb6-45b2-bb91-cdd42e0f2f68");
    _SupplierBillSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("956a775c-cdf6-4d7d-949f-76ac35f8991c");
    _SupplierBillSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("5be5550e-c06b-4dbd-bcbf-748aedd3b634");
    _SupplierBillSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("1721e266-7328-4f01-8af9-62c60f672a82");
    _SupplierBillSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("86be5d84-b080-4b00-b39a-57ef6d127c84");
    _SupplierBillSToFRS.Enter_Amount("");
    

    TestModellerLogger.SetLastNodeGuid("d76e980e-6867-446d-a13a-3bbe2cc719a9");
    _SupplierBillSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("9720f223-ad75-48cf-9a78-a8a001ca0dfb");
    _SupplierBillSToFRS.Click_SaveButton();
    

    }

    @Test  (groups= {"ScriptSupplierBillSToFRS","ScriptSupplierBillSToFRS - Default Profile"})
    @TestModellerPath(guid = "c0d1322b-3478-416a-a672-970cbc6a81b0")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlC17()
    {
        
        pages.Login1VAT _Login1VAT = new pages.Login1VAT(driver);
    TestModellerLogger.SetLastNodeGuid("93e4a214-3f97-41d2-8063-dd91c879e847");
    _Login1VAT.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7eff8b4c-1e47-48a4-bcad-b3639d0cdfd5");
    _Login1VAT.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ceaa193b-d8c0-48f9-911f-018e2571da20");
    _Login1VAT.Enter_UserName("Brennon.Grimes");
    

    TestModellerLogger.SetLastNodeGuid("95b31ed9-af0a-49e7-8bfa-8471d379cdff");
    _Login1VAT.Enter_Password("OIgi3s8BAu");
    

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
    _AgentsSelect.Enter_AgentName("corporis");
    

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
    _ClientSelect.Enter_ClientName("magni");
    

    TestModellerLogger.SetLastNodeGuid("ed3e4750-33a4-4d75-a14c-9d75935c79c7");
    _ClientSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("e537c9d6-4166-4745-b27e-a178d69d2884");
    _ClientSelect.Click_SelectClient();
    

pages.SupplierBillSToFRS _SupplierBillSToFRS = new pages.SupplierBillSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("7b21b860-8f6c-4e5e-8f4d-0ef9aedf75e5");
    _SupplierBillSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3d11c569-a0da-4838-a238-3d3cd071f91d");
    _SupplierBillSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5c30d940-2a3c-4ce2-9f6d-f491e71a1755");
    _SupplierBillSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("02bea7d1-9589-4278-8c66-58e376721799");
    _SupplierBillSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("fc395eef-59ac-4e0c-8092-d11ecdb61b84");
    _SupplierBillSToFRS.Click_NewSupplierBill();
    

    TestModellerLogger.SetLastNodeGuid("9ed916b8-79f8-4b59-a274-ed9c520242c8");
    _SupplierBillSToFRS.Select_SupplierName("Generic Purchase Supplier");
    

    TestModellerLogger.SetLastNodeGuid("6cbb598e-673a-45cd-9f0a-ec53cb56f09d");
    _SupplierBillSToFRS.Enter_DefaultCurrency();
    

    TestModellerLogger.SetLastNodeGuid("6516ccf8-ae24-42b1-b271-2bb390a6f8c3");
    _SupplierBillSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("12466744-0bd3-4135-9300-e044e7148e58");
    _SupplierBillSToFRS.Enter_Date("44249");
    

    TestModellerLogger.SetLastNodeGuid("7ea52093-1dd7-4979-8034-aeaef336d945");
    _SupplierBillSToFRS.Select_ExpenseType("Professional, consultancy and legal fees");
    

    TestModellerLogger.SetLastNodeGuid("de8f87b1-ff3a-421c-9290-6ddaef339bf2");
    _SupplierBillSToFRS.Enter_Description("Quo soluta laboriosam autem ipsum delectus fugiat aut.
Reprehenderit consectetur laboriosam porro voluptas.
Adipisci quod incidunt sunt id velit alias.
Harum quo aut sed culpa quo sed pariatur qui non.
Tenetur deserunt dolores itaque placeat a.
Est rerum tempore explicabo veniam et.
Placeat a ut ipsa accusamus.
Sint fugiat nihil.
Beatae quasi nulla magnam explicabo et ut consequatur.
Nemo vel voluptatem inventore et atque.");
    

    TestModellerLogger.SetLastNodeGuid("31e40f93-4cb6-45b2-bb91-cdd42e0f2f68");
    _SupplierBillSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("956a775c-cdf6-4d7d-949f-76ac35f8991c");
    _SupplierBillSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("5be5550e-c06b-4dbd-bcbf-748aedd3b634");
    _SupplierBillSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("1721e266-7328-4f01-8af9-62c60f672a82");
    _SupplierBillSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("86be5d84-b080-4b00-b39a-57ef6d127c84");
    _SupplierBillSToFRS.Enter_Amount("");
    

    TestModellerLogger.SetLastNodeGuid("d76e980e-6867-446d-a13a-3bbe2cc719a9");
    _SupplierBillSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("9720f223-ad75-48cf-9a78-a8a001ca0dfb");
    _SupplierBillSToFRS.Click_SaveButton();
    

    }

    @Test  (groups= {"ScriptSupplierBillSToFRS","ScriptSupplierBillSToFRS - Default Profile"})
    @TestModellerPath(guid = "f55d3ba1-8e07-47b0-a047-7416e9558c5b")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlC18()
    {
        
        pages.Login1VAT _Login1VAT = new pages.Login1VAT(driver);
    TestModellerLogger.SetLastNodeGuid("93e4a214-3f97-41d2-8063-dd91c879e847");
    _Login1VAT.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7eff8b4c-1e47-48a4-bcad-b3639d0cdfd5");
    _Login1VAT.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ceaa193b-d8c0-48f9-911f-018e2571da20");
    _Login1VAT.Enter_UserName("Destany7");
    

    TestModellerLogger.SetLastNodeGuid("95b31ed9-af0a-49e7-8bfa-8471d379cdff");
    _Login1VAT.Enter_Password("kfKpysvTUH");
    

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
    _AgentsSelect.Enter_AgentName("voluptas");
    

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
    _ClientSelect.Enter_ClientName("autem");
    

    TestModellerLogger.SetLastNodeGuid("ed3e4750-33a4-4d75-a14c-9d75935c79c7");
    _ClientSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("e537c9d6-4166-4745-b27e-a178d69d2884");
    _ClientSelect.Click_SelectClient();
    

pages.SupplierBillSToFRS _SupplierBillSToFRS = new pages.SupplierBillSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("7b21b860-8f6c-4e5e-8f4d-0ef9aedf75e5");
    _SupplierBillSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3d11c569-a0da-4838-a238-3d3cd071f91d");
    _SupplierBillSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5c30d940-2a3c-4ce2-9f6d-f491e71a1755");
    _SupplierBillSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("02bea7d1-9589-4278-8c66-58e376721799");
    _SupplierBillSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("fc395eef-59ac-4e0c-8092-d11ecdb61b84");
    _SupplierBillSToFRS.Click_NewSupplierBill();
    

    TestModellerLogger.SetLastNodeGuid("9ed916b8-79f8-4b59-a274-ed9c520242c8");
    _SupplierBillSToFRS.Select_SupplierName("Generic Purchase Supplier");
    

    TestModellerLogger.SetLastNodeGuid("6cbb598e-673a-45cd-9f0a-ec53cb56f09d");
    _SupplierBillSToFRS.Enter_DefaultCurrency();
    

    TestModellerLogger.SetLastNodeGuid("6516ccf8-ae24-42b1-b271-2bb390a6f8c3");
    _SupplierBillSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("12466744-0bd3-4135-9300-e044e7148e58");
    _SupplierBillSToFRS.Enter_Date("44249");
    

    TestModellerLogger.SetLastNodeGuid("7ea52093-1dd7-4979-8034-aeaef336d945");
    _SupplierBillSToFRS.Select_ExpenseType("Staff welfare");
    

    TestModellerLogger.SetLastNodeGuid("de8f87b1-ff3a-421c-9290-6ddaef339bf2");
    _SupplierBillSToFRS.Enter_Description("Molestiae voluptatum vel fugiat possimus ullam consequatur.
Saepe saepe sed rerum molestiae eos cum aut amet mollitia.
Magni qui debitis.
Quos est ut iusto iste.
Quod alias porro in ipsum est mollitia doloremque.
Suscipit quas qui velit excepturi velit.
Dolores harum earum aut voluptatem odit sint aperiam.
Consequatur omnis sequi quia.
At et aliquam.
Voluptatem necessitatibus in corrupti.");
    

    TestModellerLogger.SetLastNodeGuid("31e40f93-4cb6-45b2-bb91-cdd42e0f2f68");
    _SupplierBillSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("956a775c-cdf6-4d7d-949f-76ac35f8991c");
    _SupplierBillSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("5be5550e-c06b-4dbd-bcbf-748aedd3b634");
    _SupplierBillSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("1721e266-7328-4f01-8af9-62c60f672a82");
    _SupplierBillSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("86be5d84-b080-4b00-b39a-57ef6d127c84");
    _SupplierBillSToFRS.Enter_Amount("");
    

    TestModellerLogger.SetLastNodeGuid("d76e980e-6867-446d-a13a-3bbe2cc719a9");
    _SupplierBillSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("9720f223-ad75-48cf-9a78-a8a001ca0dfb");
    _SupplierBillSToFRS.Click_SaveButton();
    

    }

    @Test  (groups= {"ScriptSupplierBillSToFRS","ScriptSupplierBillSToFRS - Default Profile"})
    @TestModellerPath(guid = "f7f6e1c8-add0-4535-a180-afcf3e356eb3")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlC19()
    {
        
        pages.Login1VAT _Login1VAT = new pages.Login1VAT(driver);
    TestModellerLogger.SetLastNodeGuid("93e4a214-3f97-41d2-8063-dd91c879e847");
    _Login1VAT.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7eff8b4c-1e47-48a4-bcad-b3639d0cdfd5");
    _Login1VAT.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ceaa193b-d8c0-48f9-911f-018e2571da20");
    _Login1VAT.Enter_UserName("Lexus_Boehm");
    

    TestModellerLogger.SetLastNodeGuid("95b31ed9-af0a-49e7-8bfa-8471d379cdff");
    _Login1VAT.Enter_Password("dwWMkWysq_");
    

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
    _AgentsSelect.Enter_AgentName("aut");
    

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
    _ClientSelect.Enter_ClientName("at");
    

    TestModellerLogger.SetLastNodeGuid("ed3e4750-33a4-4d75-a14c-9d75935c79c7");
    _ClientSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("e537c9d6-4166-4745-b27e-a178d69d2884");
    _ClientSelect.Click_SelectClient();
    

pages.SupplierBillSToFRS _SupplierBillSToFRS = new pages.SupplierBillSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("7b21b860-8f6c-4e5e-8f4d-0ef9aedf75e5");
    _SupplierBillSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3d11c569-a0da-4838-a238-3d3cd071f91d");
    _SupplierBillSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5c30d940-2a3c-4ce2-9f6d-f491e71a1755");
    _SupplierBillSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("02bea7d1-9589-4278-8c66-58e376721799");
    _SupplierBillSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("fc395eef-59ac-4e0c-8092-d11ecdb61b84");
    _SupplierBillSToFRS.Click_NewSupplierBill();
    

    TestModellerLogger.SetLastNodeGuid("9ed916b8-79f8-4b59-a274-ed9c520242c8");
    _SupplierBillSToFRS.Select_SupplierName("Generic Purchase Supplier");
    

    TestModellerLogger.SetLastNodeGuid("6cbb598e-673a-45cd-9f0a-ec53cb56f09d");
    _SupplierBillSToFRS.Enter_DefaultCurrency();
    

    TestModellerLogger.SetLastNodeGuid("6516ccf8-ae24-42b1-b271-2bb390a6f8c3");
    _SupplierBillSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("12466744-0bd3-4135-9300-e044e7148e58");
    _SupplierBillSToFRS.Enter_Date("44249");
    

    TestModellerLogger.SetLastNodeGuid("7ea52093-1dd7-4979-8034-aeaef336d945");
    _SupplierBillSToFRS.Select_ExpenseType("Sundry expenses");
    

    TestModellerLogger.SetLastNodeGuid("de8f87b1-ff3a-421c-9290-6ddaef339bf2");
    _SupplierBillSToFRS.Enter_Description("Culpa in ipsam consequatur voluptates.
Deserunt enim quos facere porro harum dicta nobis tempora.
Aspernatur dignissimos impedit ipsam deleniti.
Voluptatum adipisci commodi occaecati nostrum est quis qui.
Earum laboriosam expedita qui est dolores amet dolore.
Sint qui quis quas et sint aut.
Voluptatem eveniet fugit rerum quis qui omnis rerum.
Sed alias iure quas rerum eveniet voluptas doloremque est nostrum.
Ut blanditiis et repudiandae velit sit.
Eveniet ut aut optio nulla porro culpa eum voluptatum.");
    

    TestModellerLogger.SetLastNodeGuid("31e40f93-4cb6-45b2-bb91-cdd42e0f2f68");
    _SupplierBillSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("956a775c-cdf6-4d7d-949f-76ac35f8991c");
    _SupplierBillSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("5be5550e-c06b-4dbd-bcbf-748aedd3b634");
    _SupplierBillSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("1721e266-7328-4f01-8af9-62c60f672a82");
    _SupplierBillSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("86be5d84-b080-4b00-b39a-57ef6d127c84");
    _SupplierBillSToFRS.Enter_Amount("");
    

    TestModellerLogger.SetLastNodeGuid("d76e980e-6867-446d-a13a-3bbe2cc719a9");
    _SupplierBillSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("9720f223-ad75-48cf-9a78-a8a001ca0dfb");
    _SupplierBillSToFRS.Click_SaveButton();
    

    }

    @Test  (groups= {"ScriptSupplierBillSToFRS","ScriptSupplierBillSToFRS - Default Profile"})
    @TestModellerPath(guid = "bdf22b6c-c8ae-490b-a82f-7c8e86801fb5")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlC20()
    {
        
        pages.Login1VAT _Login1VAT = new pages.Login1VAT(driver);
    TestModellerLogger.SetLastNodeGuid("93e4a214-3f97-41d2-8063-dd91c879e847");
    _Login1VAT.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7eff8b4c-1e47-48a4-bcad-b3639d0cdfd5");
    _Login1VAT.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ceaa193b-d8c0-48f9-911f-018e2571da20");
    _Login1VAT.Enter_UserName("Beatrice_Bailey");
    

    TestModellerLogger.SetLastNodeGuid("95b31ed9-af0a-49e7-8bfa-8471d379cdff");
    _Login1VAT.Enter_Password("H65SDUM2GQ");
    

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
    _AgentsSelect.Enter_AgentName("voluptatem");
    

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
    _ClientSelect.Enter_ClientName("rerum");
    

    TestModellerLogger.SetLastNodeGuid("ed3e4750-33a4-4d75-a14c-9d75935c79c7");
    _ClientSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("e537c9d6-4166-4745-b27e-a178d69d2884");
    _ClientSelect.Click_SelectClient();
    

pages.SupplierBillSToFRS _SupplierBillSToFRS = new pages.SupplierBillSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("7b21b860-8f6c-4e5e-8f4d-0ef9aedf75e5");
    _SupplierBillSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3d11c569-a0da-4838-a238-3d3cd071f91d");
    _SupplierBillSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5c30d940-2a3c-4ce2-9f6d-f491e71a1755");
    _SupplierBillSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("02bea7d1-9589-4278-8c66-58e376721799");
    _SupplierBillSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("fc395eef-59ac-4e0c-8092-d11ecdb61b84");
    _SupplierBillSToFRS.Click_NewSupplierBill();
    

    TestModellerLogger.SetLastNodeGuid("9ed916b8-79f8-4b59-a274-ed9c520242c8");
    _SupplierBillSToFRS.Select_SupplierName("Generic Purchase Supplier");
    

    TestModellerLogger.SetLastNodeGuid("6cbb598e-673a-45cd-9f0a-ec53cb56f09d");
    _SupplierBillSToFRS.Enter_DefaultCurrency();
    

    TestModellerLogger.SetLastNodeGuid("6516ccf8-ae24-42b1-b271-2bb390a6f8c3");
    _SupplierBillSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("12466744-0bd3-4135-9300-e044e7148e58");
    _SupplierBillSToFRS.Enter_Date("44249");
    

    TestModellerLogger.SetLastNodeGuid("7ea52093-1dd7-4979-8034-aeaef336d945");
    _SupplierBillSToFRS.Select_ExpenseType("Telephone, internet and broadband");
    

    TestModellerLogger.SetLastNodeGuid("de8f87b1-ff3a-421c-9290-6ddaef339bf2");
    _SupplierBillSToFRS.Enter_Description("Nulla autem sit vero voluptatem sunt est.
Rem qui modi autem deleniti aut aperiam.
Dignissimos amet et aut.
Hic nihil nesciunt tempore molestiae natus nihil ratione.
Velit ea unde qui est corrupti qui laboriosam neque incidunt.
Expedita et delectus dolorum.
Aspernatur culpa odio esse rerum.
Ut alias dolorem saepe tenetur voluptatem.
Explicabo perferendis voluptatem praesentium.
Non qui dolorem placeat velit perspiciatis totam.");
    

    TestModellerLogger.SetLastNodeGuid("31e40f93-4cb6-45b2-bb91-cdd42e0f2f68");
    _SupplierBillSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("956a775c-cdf6-4d7d-949f-76ac35f8991c");
    _SupplierBillSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("5be5550e-c06b-4dbd-bcbf-748aedd3b634");
    _SupplierBillSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("1721e266-7328-4f01-8af9-62c60f672a82");
    _SupplierBillSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("86be5d84-b080-4b00-b39a-57ef6d127c84");
    _SupplierBillSToFRS.Enter_Amount("");
    

    TestModellerLogger.SetLastNodeGuid("d76e980e-6867-446d-a13a-3bbe2cc719a9");
    _SupplierBillSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("9720f223-ad75-48cf-9a78-a8a001ca0dfb");
    _SupplierBillSToFRS.Click_SaveButton();
    

    }

    @Test  (groups= {"ScriptSupplierBillSToFRS","ScriptSupplierBillSToFRS - Default Profile"})
    @TestModellerPath(guid = "9b409ce0-7444-4cdf-929d-189a81550ca9")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlC21()
    {
        
        pages.Login1VAT _Login1VAT = new pages.Login1VAT(driver);
    TestModellerLogger.SetLastNodeGuid("93e4a214-3f97-41d2-8063-dd91c879e847");
    _Login1VAT.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7eff8b4c-1e47-48a4-bcad-b3639d0cdfd5");
    _Login1VAT.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ceaa193b-d8c0-48f9-911f-018e2571da20");
    _Login1VAT.Enter_UserName("Shawn.Denesik");
    

    TestModellerLogger.SetLastNodeGuid("95b31ed9-af0a-49e7-8bfa-8471d379cdff");
    _Login1VAT.Enter_Password("2t5jDV83pr");
    

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
    _AgentsSelect.Enter_AgentName("id");
    

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
    _ClientSelect.Enter_ClientName("quas");
    

    TestModellerLogger.SetLastNodeGuid("ed3e4750-33a4-4d75-a14c-9d75935c79c7");
    _ClientSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("e537c9d6-4166-4745-b27e-a178d69d2884");
    _ClientSelect.Click_SelectClient();
    

pages.SupplierBillSToFRS _SupplierBillSToFRS = new pages.SupplierBillSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("7b21b860-8f6c-4e5e-8f4d-0ef9aedf75e5");
    _SupplierBillSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3d11c569-a0da-4838-a238-3d3cd071f91d");
    _SupplierBillSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5c30d940-2a3c-4ce2-9f6d-f491e71a1755");
    _SupplierBillSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("02bea7d1-9589-4278-8c66-58e376721799");
    _SupplierBillSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("fc395eef-59ac-4e0c-8092-d11ecdb61b84");
    _SupplierBillSToFRS.Click_NewSupplierBill();
    

    TestModellerLogger.SetLastNodeGuid("9ed916b8-79f8-4b59-a274-ed9c520242c8");
    _SupplierBillSToFRS.Select_SupplierName("Generic Purchase Supplier");
    

    TestModellerLogger.SetLastNodeGuid("6cbb598e-673a-45cd-9f0a-ec53cb56f09d");
    _SupplierBillSToFRS.Enter_DefaultCurrency();
    

    TestModellerLogger.SetLastNodeGuid("6516ccf8-ae24-42b1-b271-2bb390a6f8c3");
    _SupplierBillSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("12466744-0bd3-4135-9300-e044e7148e58");
    _SupplierBillSToFRS.Enter_Date("44249");
    

    TestModellerLogger.SetLastNodeGuid("7ea52093-1dd7-4979-8034-aeaef336d945");
    _SupplierBillSToFRS.Select_ExpenseType("Travel and overseas travelling");
    

    TestModellerLogger.SetLastNodeGuid("de8f87b1-ff3a-421c-9290-6ddaef339bf2");
    _SupplierBillSToFRS.Enter_Description("Blanditiis ut sit dolorem voluptatibus voluptatibus.
Nemo illum dolorem unde et quo sed impedit.
Quasi eius rerum adipisci.
Iusto et sint aliquid vel saepe rerum sed ea vel.
Aut dignissimos dolores atque at.
Doloremque veniam minus modi quo.
Minima nulla corrupti aut omnis hic tenetur quia.
Dolorem voluptatum voluptatem id illum voluptatum animi dicta.
Assumenda blanditiis ex numquam aut ut eaque modi corporis.
Amet distinctio laudantium facere est voluptatem ut molestias saepe.");
    

    TestModellerLogger.SetLastNodeGuid("31e40f93-4cb6-45b2-bb91-cdd42e0f2f68");
    _SupplierBillSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("956a775c-cdf6-4d7d-949f-76ac35f8991c");
    _SupplierBillSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("5be5550e-c06b-4dbd-bcbf-748aedd3b634");
    _SupplierBillSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("1721e266-7328-4f01-8af9-62c60f672a82");
    _SupplierBillSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("86be5d84-b080-4b00-b39a-57ef6d127c84");
    _SupplierBillSToFRS.Enter_Amount("");
    

    TestModellerLogger.SetLastNodeGuid("d76e980e-6867-446d-a13a-3bbe2cc719a9");
    _SupplierBillSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("9720f223-ad75-48cf-9a78-a8a001ca0dfb");
    _SupplierBillSToFRS.Click_SaveButton();
    

    }

    @Test  (groups= {"ScriptSupplierBillSToFRS","ScriptSupplierBillSToFRS - Default Profile"})
    @TestModellerPath(guid = "4b64bb4c-6307-4a13-b333-1ae06c3b76e4")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlC22()
    {
        
        pages.Login1VAT _Login1VAT = new pages.Login1VAT(driver);
    TestModellerLogger.SetLastNodeGuid("93e4a214-3f97-41d2-8063-dd91c879e847");
    _Login1VAT.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7eff8b4c-1e47-48a4-bcad-b3639d0cdfd5");
    _Login1VAT.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ceaa193b-d8c0-48f9-911f-018e2571da20");
    _Login1VAT.Enter_UserName("Dolores.Miller82");
    

    TestModellerLogger.SetLastNodeGuid("95b31ed9-af0a-49e7-8bfa-8471d379cdff");
    _Login1VAT.Enter_Password("AuQSW942DC");
    

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
    _AgentsSelect.Enter_AgentName("id");
    

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
    _ClientSelect.Enter_ClientName("mollitia");
    

    TestModellerLogger.SetLastNodeGuid("ed3e4750-33a4-4d75-a14c-9d75935c79c7");
    _ClientSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("e537c9d6-4166-4745-b27e-a178d69d2884");
    _ClientSelect.Click_SelectClient();
    

pages.SupplierBillSToFRS _SupplierBillSToFRS = new pages.SupplierBillSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("7b21b860-8f6c-4e5e-8f4d-0ef9aedf75e5");
    _SupplierBillSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3d11c569-a0da-4838-a238-3d3cd071f91d");
    _SupplierBillSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5c30d940-2a3c-4ce2-9f6d-f491e71a1755");
    _SupplierBillSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("02bea7d1-9589-4278-8c66-58e376721799");
    _SupplierBillSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("fc395eef-59ac-4e0c-8092-d11ecdb61b84");
    _SupplierBillSToFRS.Click_NewSupplierBill();
    

    TestModellerLogger.SetLastNodeGuid("9ed916b8-79f8-4b59-a274-ed9c520242c8");
    _SupplierBillSToFRS.Select_SupplierName("Generic Purchase Supplier");
    

    TestModellerLogger.SetLastNodeGuid("6cbb598e-673a-45cd-9f0a-ec53cb56f09d");
    _SupplierBillSToFRS.Enter_DefaultCurrency();
    

    TestModellerLogger.SetLastNodeGuid("6516ccf8-ae24-42b1-b271-2bb390a6f8c3");
    _SupplierBillSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("12466744-0bd3-4135-9300-e044e7148e58");
    _SupplierBillSToFRS.Enter_Date("44249");
    

    TestModellerLogger.SetLastNodeGuid("7ea52093-1dd7-4979-8034-aeaef336d945");
    _SupplierBillSToFRS.Select_ExpenseType("Commercial vehicles additions");
    

    TestModellerLogger.SetLastNodeGuid("de8f87b1-ff3a-421c-9290-6ddaef339bf2");
    _SupplierBillSToFRS.Enter_Description("Reiciendis delectus voluptatum maxime eaque temporibus et.
Hic qui quaerat exercitationem.
Maxime eius ut.
Est sequi voluptatem et commodi est exercitationem.
Qui ut impedit sed mollitia sit ab.
Laborum quia ullam error voluptatum voluptatem aut facere totam.
Ullam totam at ipsum voluptas tempore repudiandae.
Earum magnam qui sed et et dolor nesciunt.
Qui est doloribus ex enim quia.
Qui dolorum sint voluptate veritatis eum qui.");
    

    TestModellerLogger.SetLastNodeGuid("31e40f93-4cb6-45b2-bb91-cdd42e0f2f68");
    _SupplierBillSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("956a775c-cdf6-4d7d-949f-76ac35f8991c");
    _SupplierBillSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("5be5550e-c06b-4dbd-bcbf-748aedd3b634");
    _SupplierBillSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("1721e266-7328-4f01-8af9-62c60f672a82");
    _SupplierBillSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("86be5d84-b080-4b00-b39a-57ef6d127c84");
    _SupplierBillSToFRS.Enter_Amount("");
    

    TestModellerLogger.SetLastNodeGuid("d76e980e-6867-446d-a13a-3bbe2cc719a9");
    _SupplierBillSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("9720f223-ad75-48cf-9a78-a8a001ca0dfb");
    _SupplierBillSToFRS.Click_SaveButton();
    

    }

    @Test  (groups= {"ScriptSupplierBillSToFRS","ScriptSupplierBillSToFRS - Default Profile"})
    @TestModellerPath(guid = "88b4409a-3153-46c8-8491-2410f9252d67")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlC23()
    {
        
        pages.Login1VAT _Login1VAT = new pages.Login1VAT(driver);
    TestModellerLogger.SetLastNodeGuid("93e4a214-3f97-41d2-8063-dd91c879e847");
    _Login1VAT.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7eff8b4c-1e47-48a4-bcad-b3639d0cdfd5");
    _Login1VAT.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ceaa193b-d8c0-48f9-911f-018e2571da20");
    _Login1VAT.Enter_UserName("Dedric_Bartoletti57");
    

    TestModellerLogger.SetLastNodeGuid("95b31ed9-af0a-49e7-8bfa-8471d379cdff");
    _Login1VAT.Enter_Password("vO5IJtTui4");
    

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
    _AgentsSelect.Enter_AgentName("doloribus");
    

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
    _ClientSelect.Enter_ClientName("velit");
    

    TestModellerLogger.SetLastNodeGuid("ed3e4750-33a4-4d75-a14c-9d75935c79c7");
    _ClientSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("e537c9d6-4166-4745-b27e-a178d69d2884");
    _ClientSelect.Click_SelectClient();
    

pages.SupplierBillSToFRS _SupplierBillSToFRS = new pages.SupplierBillSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("7b21b860-8f6c-4e5e-8f4d-0ef9aedf75e5");
    _SupplierBillSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3d11c569-a0da-4838-a238-3d3cd071f91d");
    _SupplierBillSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5c30d940-2a3c-4ce2-9f6d-f491e71a1755");
    _SupplierBillSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("02bea7d1-9589-4278-8c66-58e376721799");
    _SupplierBillSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("fc395eef-59ac-4e0c-8092-d11ecdb61b84");
    _SupplierBillSToFRS.Click_NewSupplierBill();
    

    TestModellerLogger.SetLastNodeGuid("9ed916b8-79f8-4b59-a274-ed9c520242c8");
    _SupplierBillSToFRS.Select_SupplierName("Generic Purchase Supplier");
    

    TestModellerLogger.SetLastNodeGuid("6cbb598e-673a-45cd-9f0a-ec53cb56f09d");
    _SupplierBillSToFRS.Enter_DefaultCurrency();
    

    TestModellerLogger.SetLastNodeGuid("6516ccf8-ae24-42b1-b271-2bb390a6f8c3");
    _SupplierBillSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("12466744-0bd3-4135-9300-e044e7148e58");
    _SupplierBillSToFRS.Enter_Date("44249");
    

    TestModellerLogger.SetLastNodeGuid("7ea52093-1dd7-4979-8034-aeaef336d945");
    _SupplierBillSToFRS.Select_ExpenseType("Commercial vehicles cost b/f");
    

    TestModellerLogger.SetLastNodeGuid("de8f87b1-ff3a-421c-9290-6ddaef339bf2");
    _SupplierBillSToFRS.Enter_Description("Quia aperiam nostrum hic labore quibusdam.
Beatae molestias inventore eum.
Consequatur consectetur doloremque voluptatum nesciunt.
Quaerat nemo quisquam.
Facere quas qui natus.
Ipsam itaque voluptas.
Aliquid quam ipsa et est cumque ea doloremque velit.
Quis aut eos voluptatem quod sunt.
Ut consequuntur eligendi qui similique molestiae eligendi veritatis minima repellendus.
Soluta est pariatur eos maxime.");
    

    TestModellerLogger.SetLastNodeGuid("31e40f93-4cb6-45b2-bb91-cdd42e0f2f68");
    _SupplierBillSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("956a775c-cdf6-4d7d-949f-76ac35f8991c");
    _SupplierBillSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("5be5550e-c06b-4dbd-bcbf-748aedd3b634");
    _SupplierBillSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("1721e266-7328-4f01-8af9-62c60f672a82");
    _SupplierBillSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("86be5d84-b080-4b00-b39a-57ef6d127c84");
    _SupplierBillSToFRS.Enter_Amount("");
    

    TestModellerLogger.SetLastNodeGuid("d76e980e-6867-446d-a13a-3bbe2cc719a9");
    _SupplierBillSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("9720f223-ad75-48cf-9a78-a8a001ca0dfb");
    _SupplierBillSToFRS.Click_SaveButton();
    

    }

    @Test  (groups= {"ScriptSupplierBillSToFRS","ScriptSupplierBillSToFRS - Default Profile"})
    @TestModellerPath(guid = "a92d7806-0282-488e-b87a-30c96aa29cb9")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlC24()
    {
        
        pages.Login1VAT _Login1VAT = new pages.Login1VAT(driver);
    TestModellerLogger.SetLastNodeGuid("93e4a214-3f97-41d2-8063-dd91c879e847");
    _Login1VAT.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7eff8b4c-1e47-48a4-bcad-b3639d0cdfd5");
    _Login1VAT.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ceaa193b-d8c0-48f9-911f-018e2571da20");
    _Login1VAT.Enter_UserName("Eve_Ryan84");
    

    TestModellerLogger.SetLastNodeGuid("95b31ed9-af0a-49e7-8bfa-8471d379cdff");
    _Login1VAT.Enter_Password("aPE_rx6bXw");
    

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
    _AgentsSelect.Enter_AgentName("quam");
    

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
    _ClientSelect.Enter_ClientName("delectus");
    

    TestModellerLogger.SetLastNodeGuid("ed3e4750-33a4-4d75-a14c-9d75935c79c7");
    _ClientSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("e537c9d6-4166-4745-b27e-a178d69d2884");
    _ClientSelect.Click_SelectClient();
    

pages.SupplierBillSToFRS _SupplierBillSToFRS = new pages.SupplierBillSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("7b21b860-8f6c-4e5e-8f4d-0ef9aedf75e5");
    _SupplierBillSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3d11c569-a0da-4838-a238-3d3cd071f91d");
    _SupplierBillSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5c30d940-2a3c-4ce2-9f6d-f491e71a1755");
    _SupplierBillSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("02bea7d1-9589-4278-8c66-58e376721799");
    _SupplierBillSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("fc395eef-59ac-4e0c-8092-d11ecdb61b84");
    _SupplierBillSToFRS.Click_NewSupplierBill();
    

    TestModellerLogger.SetLastNodeGuid("9ed916b8-79f8-4b59-a274-ed9c520242c8");
    _SupplierBillSToFRS.Select_SupplierName("Generic Purchase Supplier");
    

    TestModellerLogger.SetLastNodeGuid("6cbb598e-673a-45cd-9f0a-ec53cb56f09d");
    _SupplierBillSToFRS.Enter_DefaultCurrency();
    

    TestModellerLogger.SetLastNodeGuid("6516ccf8-ae24-42b1-b271-2bb390a6f8c3");
    _SupplierBillSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("12466744-0bd3-4135-9300-e044e7148e58");
    _SupplierBillSToFRS.Enter_Date("44249");
    

    TestModellerLogger.SetLastNodeGuid("7ea52093-1dd7-4979-8034-aeaef336d945");
    _SupplierBillSToFRS.Select_ExpenseType("Commercial vehicles depreciation");
    

    TestModellerLogger.SetLastNodeGuid("de8f87b1-ff3a-421c-9290-6ddaef339bf2");
    _SupplierBillSToFRS.Enter_Description("Aut autem saepe ut itaque in quisquam et ut.
Iure corporis occaecati.
Non assumenda voluptas libero dolorem dolore et quam.
Recusandae eos quo.
Quia qui fugit distinctio ad dolores alias sit.
Amet laudantium dolores sit veritatis quos alias occaecati voluptatem.
Occaecati expedita adipisci omnis et cumque autem.
Recusandae eum ex sapiente corrupti modi placeat mollitia.
Incidunt consequatur fugit.
Occaecati excepturi maxime culpa et sed aut amet esse.");
    

    TestModellerLogger.SetLastNodeGuid("31e40f93-4cb6-45b2-bb91-cdd42e0f2f68");
    _SupplierBillSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("956a775c-cdf6-4d7d-949f-76ac35f8991c");
    _SupplierBillSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("5be5550e-c06b-4dbd-bcbf-748aedd3b634");
    _SupplierBillSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("1721e266-7328-4f01-8af9-62c60f672a82");
    _SupplierBillSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("86be5d84-b080-4b00-b39a-57ef6d127c84");
    _SupplierBillSToFRS.Enter_Amount("");
    

    TestModellerLogger.SetLastNodeGuid("d76e980e-6867-446d-a13a-3bbe2cc719a9");
    _SupplierBillSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("9720f223-ad75-48cf-9a78-a8a001ca0dfb");
    _SupplierBillSToFRS.Click_SaveButton();
    

    }

    @Test  (groups= {"ScriptSupplierBillSToFRS","ScriptSupplierBillSToFRS - Default Profile"})
    @TestModellerPath(guid = "97cc45d2-76aa-468e-9bed-b5fbbafa3d14")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlC25()
    {
        
        pages.Login1VAT _Login1VAT = new pages.Login1VAT(driver);
    TestModellerLogger.SetLastNodeGuid("93e4a214-3f97-41d2-8063-dd91c879e847");
    _Login1VAT.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7eff8b4c-1e47-48a4-bcad-b3639d0cdfd5");
    _Login1VAT.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ceaa193b-d8c0-48f9-911f-018e2571da20");
    _Login1VAT.Enter_UserName("Timothy89");
    

    TestModellerLogger.SetLastNodeGuid("95b31ed9-af0a-49e7-8bfa-8471d379cdff");
    _Login1VAT.Enter_Password("r6uG1uEPBJ");
    

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
    _AgentsSelect.Enter_AgentName("voluptatem");
    

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
    _ClientSelect.Enter_ClientName("explicabo");
    

    TestModellerLogger.SetLastNodeGuid("ed3e4750-33a4-4d75-a14c-9d75935c79c7");
    _ClientSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("e537c9d6-4166-4745-b27e-a178d69d2884");
    _ClientSelect.Click_SelectClient();
    

pages.SupplierBillSToFRS _SupplierBillSToFRS = new pages.SupplierBillSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("7b21b860-8f6c-4e5e-8f4d-0ef9aedf75e5");
    _SupplierBillSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3d11c569-a0da-4838-a238-3d3cd071f91d");
    _SupplierBillSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5c30d940-2a3c-4ce2-9f6d-f491e71a1755");
    _SupplierBillSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("02bea7d1-9589-4278-8c66-58e376721799");
    _SupplierBillSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("fc395eef-59ac-4e0c-8092-d11ecdb61b84");
    _SupplierBillSToFRS.Click_NewSupplierBill();
    

    TestModellerLogger.SetLastNodeGuid("9ed916b8-79f8-4b59-a274-ed9c520242c8");
    _SupplierBillSToFRS.Select_SupplierName("Generic Purchase Supplier");
    

    TestModellerLogger.SetLastNodeGuid("6cbb598e-673a-45cd-9f0a-ec53cb56f09d");
    _SupplierBillSToFRS.Enter_DefaultCurrency();
    

    TestModellerLogger.SetLastNodeGuid("6516ccf8-ae24-42b1-b271-2bb390a6f8c3");
    _SupplierBillSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("12466744-0bd3-4135-9300-e044e7148e58");
    _SupplierBillSToFRS.Enter_Date("44249");
    

    TestModellerLogger.SetLastNodeGuid("7ea52093-1dd7-4979-8034-aeaef336d945");
    _SupplierBillSToFRS.Select_ExpenseType("Commercial vehicles depreciation b/f");
    

    TestModellerLogger.SetLastNodeGuid("de8f87b1-ff3a-421c-9290-6ddaef339bf2");
    _SupplierBillSToFRS.Enter_Description("Repudiandae magnam adipisci asperiores non harum.
Sapiente deleniti facere et.
Molestiae tempora aut voluptates enim totam iure assumenda sequi.
Aut repellat ratione ducimus sit eaque neque maiores iste occaecati.
At ab ut accusantium possimus libero totam voluptatem voluptate harum.
Blanditiis quo voluptatem.
Necessitatibus fuga sed porro accusantium.
Ut consequatur ducimus velit pariatur deleniti qui ipsum.
Dolores velit perspiciatis fugiat sunt dolor quod aut sint.
Sint placeat maxime ad placeat ut et consequuntur dolorem.");
    

    TestModellerLogger.SetLastNodeGuid("31e40f93-4cb6-45b2-bb91-cdd42e0f2f68");
    _SupplierBillSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("956a775c-cdf6-4d7d-949f-76ac35f8991c");
    _SupplierBillSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("5be5550e-c06b-4dbd-bcbf-748aedd3b634");
    _SupplierBillSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("1721e266-7328-4f01-8af9-62c60f672a82");
    _SupplierBillSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("86be5d84-b080-4b00-b39a-57ef6d127c84");
    _SupplierBillSToFRS.Enter_Amount("");
    

    TestModellerLogger.SetLastNodeGuid("d76e980e-6867-446d-a13a-3bbe2cc719a9");
    _SupplierBillSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("9720f223-ad75-48cf-9a78-a8a001ca0dfb");
    _SupplierBillSToFRS.Click_SaveButton();
    

    }

    @Test  (groups= {"ScriptSupplierBillSToFRS","ScriptSupplierBillSToFRS - Default Profile"})
    @TestModellerPath(guid = "a67d0979-79de-4d25-8518-66aa612750b1")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlC26()
    {
        
        pages.Login1VAT _Login1VAT = new pages.Login1VAT(driver);
    TestModellerLogger.SetLastNodeGuid("93e4a214-3f97-41d2-8063-dd91c879e847");
    _Login1VAT.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7eff8b4c-1e47-48a4-bcad-b3639d0cdfd5");
    _Login1VAT.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ceaa193b-d8c0-48f9-911f-018e2571da20");
    _Login1VAT.Enter_UserName("Jayne.Spinka8");
    

    TestModellerLogger.SetLastNodeGuid("95b31ed9-af0a-49e7-8bfa-8471d379cdff");
    _Login1VAT.Enter_Password("8ayKA2c9p5");
    

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
    _AgentsSelect.Enter_AgentName("corporis");
    

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
    _ClientSelect.Enter_ClientName("reiciendis");
    

    TestModellerLogger.SetLastNodeGuid("ed3e4750-33a4-4d75-a14c-9d75935c79c7");
    _ClientSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("e537c9d6-4166-4745-b27e-a178d69d2884");
    _ClientSelect.Click_SelectClient();
    

pages.SupplierBillSToFRS _SupplierBillSToFRS = new pages.SupplierBillSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("7b21b860-8f6c-4e5e-8f4d-0ef9aedf75e5");
    _SupplierBillSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3d11c569-a0da-4838-a238-3d3cd071f91d");
    _SupplierBillSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5c30d940-2a3c-4ce2-9f6d-f491e71a1755");
    _SupplierBillSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("02bea7d1-9589-4278-8c66-58e376721799");
    _SupplierBillSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("fc395eef-59ac-4e0c-8092-d11ecdb61b84");
    _SupplierBillSToFRS.Click_NewSupplierBill();
    

    TestModellerLogger.SetLastNodeGuid("9ed916b8-79f8-4b59-a274-ed9c520242c8");
    _SupplierBillSToFRS.Select_SupplierName("Generic Purchase Supplier");
    

    TestModellerLogger.SetLastNodeGuid("6cbb598e-673a-45cd-9f0a-ec53cb56f09d");
    _SupplierBillSToFRS.Enter_DefaultCurrency();
    

    TestModellerLogger.SetLastNodeGuid("6516ccf8-ae24-42b1-b271-2bb390a6f8c3");
    _SupplierBillSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("12466744-0bd3-4135-9300-e044e7148e58");
    _SupplierBillSToFRS.Enter_Date("44249");
    

    TestModellerLogger.SetLastNodeGuid("7ea52093-1dd7-4979-8034-aeaef336d945");
    _SupplierBillSToFRS.Select_ExpenseType("Commercial vehicles depreciation disposals");
    

    TestModellerLogger.SetLastNodeGuid("de8f87b1-ff3a-421c-9290-6ddaef339bf2");
    _SupplierBillSToFRS.Enter_Description("Qui quo dolores ipsam molestias ipsa temporibus.
Voluptates amet sit pariatur est eos vero voluptates debitis.
Dolor voluptatem quod voluptatem sint odit eveniet animi.
Optio expedita esse aliquid et voluptatem quaerat ipsa.
Ab sint veritatis dolores hic.
Id laborum ut.
Eos eos necessitatibus harum omnis vel facilis repellat quibusdam et.
Iure esse voluptates ipsam sunt quia quos fugiat iure dolorem.
Explicabo dolores eos ea est.
Sed est esse.");
    

    TestModellerLogger.SetLastNodeGuid("31e40f93-4cb6-45b2-bb91-cdd42e0f2f68");
    _SupplierBillSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("956a775c-cdf6-4d7d-949f-76ac35f8991c");
    _SupplierBillSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("5be5550e-c06b-4dbd-bcbf-748aedd3b634");
    _SupplierBillSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("1721e266-7328-4f01-8af9-62c60f672a82");
    _SupplierBillSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("86be5d84-b080-4b00-b39a-57ef6d127c84");
    _SupplierBillSToFRS.Enter_Amount("");
    

    TestModellerLogger.SetLastNodeGuid("d76e980e-6867-446d-a13a-3bbe2cc719a9");
    _SupplierBillSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("9720f223-ad75-48cf-9a78-a8a001ca0dfb");
    _SupplierBillSToFRS.Click_SaveButton();
    

    }

    @Test  (groups= {"ScriptSupplierBillSToFRS","ScriptSupplierBillSToFRS - Default Profile"})
    @TestModellerPath(guid = "ee81b68b-76ba-457b-ac29-5be734f42a7b")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlC27()
    {
        
        pages.Login1VAT _Login1VAT = new pages.Login1VAT(driver);
    TestModellerLogger.SetLastNodeGuid("93e4a214-3f97-41d2-8063-dd91c879e847");
    _Login1VAT.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7eff8b4c-1e47-48a4-bcad-b3639d0cdfd5");
    _Login1VAT.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ceaa193b-d8c0-48f9-911f-018e2571da20");
    _Login1VAT.Enter_UserName("Randi_Bins");
    

    TestModellerLogger.SetLastNodeGuid("95b31ed9-af0a-49e7-8bfa-8471d379cdff");
    _Login1VAT.Enter_Password("ybx6EBurRd");
    

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
    _AgentsSelect.Enter_AgentName("mollitia");
    

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
    _ClientSelect.Enter_ClientName("non");
    

    TestModellerLogger.SetLastNodeGuid("ed3e4750-33a4-4d75-a14c-9d75935c79c7");
    _ClientSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("e537c9d6-4166-4745-b27e-a178d69d2884");
    _ClientSelect.Click_SelectClient();
    

pages.SupplierBillSToFRS _SupplierBillSToFRS = new pages.SupplierBillSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("7b21b860-8f6c-4e5e-8f4d-0ef9aedf75e5");
    _SupplierBillSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3d11c569-a0da-4838-a238-3d3cd071f91d");
    _SupplierBillSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5c30d940-2a3c-4ce2-9f6d-f491e71a1755");
    _SupplierBillSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("02bea7d1-9589-4278-8c66-58e376721799");
    _SupplierBillSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("fc395eef-59ac-4e0c-8092-d11ecdb61b84");
    _SupplierBillSToFRS.Click_NewSupplierBill();
    

    TestModellerLogger.SetLastNodeGuid("9ed916b8-79f8-4b59-a274-ed9c520242c8");
    _SupplierBillSToFRS.Select_SupplierName("Generic Purchase Supplier");
    

    TestModellerLogger.SetLastNodeGuid("6cbb598e-673a-45cd-9f0a-ec53cb56f09d");
    _SupplierBillSToFRS.Enter_DefaultCurrency();
    

    TestModellerLogger.SetLastNodeGuid("6516ccf8-ae24-42b1-b271-2bb390a6f8c3");
    _SupplierBillSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("12466744-0bd3-4135-9300-e044e7148e58");
    _SupplierBillSToFRS.Enter_Date("44249");
    

    TestModellerLogger.SetLastNodeGuid("7ea52093-1dd7-4979-8034-aeaef336d945");
    _SupplierBillSToFRS.Select_ExpenseType("Commercial vehicles depreciation revaluation");
    

    TestModellerLogger.SetLastNodeGuid("de8f87b1-ff3a-421c-9290-6ddaef339bf2");
    _SupplierBillSToFRS.Enter_Description("Repellat praesentium officia consequatur.
Eos aut maiores.
Praesentium laborum odio.
Aspernatur sequi qui vero aut aut omnis sint.
Temporibus quae qui.
Consectetur eligendi mollitia quibusdam aut perferendis et sit quam.
Est veniam ratione harum eos ea.
Necessitatibus atque inventore adipisci voluptatem provident tempora nisi consequatur.
Cupiditate est et libero perspiciatis.
Magnam libero veniam iure tempora ut.");
    

    TestModellerLogger.SetLastNodeGuid("31e40f93-4cb6-45b2-bb91-cdd42e0f2f68");
    _SupplierBillSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("956a775c-cdf6-4d7d-949f-76ac35f8991c");
    _SupplierBillSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("5be5550e-c06b-4dbd-bcbf-748aedd3b634");
    _SupplierBillSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("1721e266-7328-4f01-8af9-62c60f672a82");
    _SupplierBillSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("86be5d84-b080-4b00-b39a-57ef6d127c84");
    _SupplierBillSToFRS.Enter_Amount("");
    

    TestModellerLogger.SetLastNodeGuid("d76e980e-6867-446d-a13a-3bbe2cc719a9");
    _SupplierBillSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("9720f223-ad75-48cf-9a78-a8a001ca0dfb");
    _SupplierBillSToFRS.Click_SaveButton();
    

    }

    @Test  (groups= {"ScriptSupplierBillSToFRS","ScriptSupplierBillSToFRS - Default Profile"})
    @TestModellerPath(guid = "31cc65ed-7806-4286-9a92-da65c2daffc7")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlC28()
    {
        
        pages.Login1VAT _Login1VAT = new pages.Login1VAT(driver);
    TestModellerLogger.SetLastNodeGuid("93e4a214-3f97-41d2-8063-dd91c879e847");
    _Login1VAT.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7eff8b4c-1e47-48a4-bcad-b3639d0cdfd5");
    _Login1VAT.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ceaa193b-d8c0-48f9-911f-018e2571da20");
    _Login1VAT.Enter_UserName("Zachery.Heidenreich");
    

    TestModellerLogger.SetLastNodeGuid("95b31ed9-af0a-49e7-8bfa-8471d379cdff");
    _Login1VAT.Enter_Password("F6Gx5I4MBi");
    

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
    _ClientSelect.Enter_ClientName("itaque");
    

    TestModellerLogger.SetLastNodeGuid("ed3e4750-33a4-4d75-a14c-9d75935c79c7");
    _ClientSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("e537c9d6-4166-4745-b27e-a178d69d2884");
    _ClientSelect.Click_SelectClient();
    

pages.SupplierBillSToFRS _SupplierBillSToFRS = new pages.SupplierBillSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("7b21b860-8f6c-4e5e-8f4d-0ef9aedf75e5");
    _SupplierBillSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3d11c569-a0da-4838-a238-3d3cd071f91d");
    _SupplierBillSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5c30d940-2a3c-4ce2-9f6d-f491e71a1755");
    _SupplierBillSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("02bea7d1-9589-4278-8c66-58e376721799");
    _SupplierBillSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("fc395eef-59ac-4e0c-8092-d11ecdb61b84");
    _SupplierBillSToFRS.Click_NewSupplierBill();
    

    TestModellerLogger.SetLastNodeGuid("9ed916b8-79f8-4b59-a274-ed9c520242c8");
    _SupplierBillSToFRS.Select_SupplierName("Generic Purchase Supplier");
    

    TestModellerLogger.SetLastNodeGuid("6cbb598e-673a-45cd-9f0a-ec53cb56f09d");
    _SupplierBillSToFRS.Enter_DefaultCurrency();
    

    TestModellerLogger.SetLastNodeGuid("6516ccf8-ae24-42b1-b271-2bb390a6f8c3");
    _SupplierBillSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("12466744-0bd3-4135-9300-e044e7148e58");
    _SupplierBillSToFRS.Enter_Date("44249");
    

    TestModellerLogger.SetLastNodeGuid("7ea52093-1dd7-4979-8034-aeaef336d945");
    _SupplierBillSToFRS.Select_ExpenseType("Commercial vehicles depreciation transfers");
    

    TestModellerLogger.SetLastNodeGuid("de8f87b1-ff3a-421c-9290-6ddaef339bf2");
    _SupplierBillSToFRS.Enter_Description("Atque soluta impedit explicabo in minus deleniti sint fugit.
Ut error suscipit in non.
Quis blanditiis corporis quo.
Quos dolores omnis.
Accusamus eveniet sapiente culpa.
Sunt ut rerum.
Quo culpa dolorem magni.
Architecto dolorem est in facilis assumenda voluptatibus beatae cum.
Quia perferendis est quae rerum minus doloribus sit.
Sint nihil quo sint suscipit aspernatur nihil commodi cum aut.");
    

    TestModellerLogger.SetLastNodeGuid("31e40f93-4cb6-45b2-bb91-cdd42e0f2f68");
    _SupplierBillSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("956a775c-cdf6-4d7d-949f-76ac35f8991c");
    _SupplierBillSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("5be5550e-c06b-4dbd-bcbf-748aedd3b634");
    _SupplierBillSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("1721e266-7328-4f01-8af9-62c60f672a82");
    _SupplierBillSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("86be5d84-b080-4b00-b39a-57ef6d127c84");
    _SupplierBillSToFRS.Enter_Amount("");
    

    TestModellerLogger.SetLastNodeGuid("d76e980e-6867-446d-a13a-3bbe2cc719a9");
    _SupplierBillSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("9720f223-ad75-48cf-9a78-a8a001ca0dfb");
    _SupplierBillSToFRS.Click_SaveButton();
    

    }

    @Test  (groups= {"ScriptSupplierBillSToFRS","ScriptSupplierBillSToFRS - Default Profile"})
    @TestModellerPath(guid = "44975f1e-7f02-458e-8abb-8cb47977fdd0")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlC29()
    {
        
        pages.Login1VAT _Login1VAT = new pages.Login1VAT(driver);
    TestModellerLogger.SetLastNodeGuid("93e4a214-3f97-41d2-8063-dd91c879e847");
    _Login1VAT.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7eff8b4c-1e47-48a4-bcad-b3639d0cdfd5");
    _Login1VAT.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ceaa193b-d8c0-48f9-911f-018e2571da20");
    _Login1VAT.Enter_UserName("Tatum_Batz");
    

    TestModellerLogger.SetLastNodeGuid("95b31ed9-af0a-49e7-8bfa-8471d379cdff");
    _Login1VAT.Enter_Password("UAcf_d9FAX");
    

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
    _AgentsSelect.Enter_AgentName("fuga");
    

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
    _ClientSelect.Enter_ClientName("dolor");
    

    TestModellerLogger.SetLastNodeGuid("ed3e4750-33a4-4d75-a14c-9d75935c79c7");
    _ClientSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("e537c9d6-4166-4745-b27e-a178d69d2884");
    _ClientSelect.Click_SelectClient();
    

pages.SupplierBillSToFRS _SupplierBillSToFRS = new pages.SupplierBillSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("7b21b860-8f6c-4e5e-8f4d-0ef9aedf75e5");
    _SupplierBillSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3d11c569-a0da-4838-a238-3d3cd071f91d");
    _SupplierBillSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5c30d940-2a3c-4ce2-9f6d-f491e71a1755");
    _SupplierBillSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("02bea7d1-9589-4278-8c66-58e376721799");
    _SupplierBillSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("fc395eef-59ac-4e0c-8092-d11ecdb61b84");
    _SupplierBillSToFRS.Click_NewSupplierBill();
    

    TestModellerLogger.SetLastNodeGuid("9ed916b8-79f8-4b59-a274-ed9c520242c8");
    _SupplierBillSToFRS.Select_SupplierName("Generic Purchase Supplier");
    

    TestModellerLogger.SetLastNodeGuid("6cbb598e-673a-45cd-9f0a-ec53cb56f09d");
    _SupplierBillSToFRS.Enter_DefaultCurrency();
    

    TestModellerLogger.SetLastNodeGuid("6516ccf8-ae24-42b1-b271-2bb390a6f8c3");
    _SupplierBillSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("12466744-0bd3-4135-9300-e044e7148e58");
    _SupplierBillSToFRS.Enter_Date("44249");
    

    TestModellerLogger.SetLastNodeGuid("7ea52093-1dd7-4979-8034-aeaef336d945");
    _SupplierBillSToFRS.Select_ExpenseType("Commercial vehicles disposals");
    

    TestModellerLogger.SetLastNodeGuid("de8f87b1-ff3a-421c-9290-6ddaef339bf2");
    _SupplierBillSToFRS.Enter_Description("Suscipit labore est tempora necessitatibus.
Repudiandae at aut adipisci autem eius.
Praesentium repellat quibusdam quos.
Quas est qui saepe numquam inventore labore nemo enim deleniti.
Ea nemo reiciendis vel iure repellendus omnis vitae illum repellat.
Architecto sit et quisquam.
Et exercitationem debitis aspernatur voluptates accusamus cum mollitia eos tenetur.
Accusantium et maiores culpa non iusto.
Id necessitatibus vel ea quo tempore modi quo tempore alias.
Est et ut quos ratione.");
    

    TestModellerLogger.SetLastNodeGuid("31e40f93-4cb6-45b2-bb91-cdd42e0f2f68");
    _SupplierBillSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("956a775c-cdf6-4d7d-949f-76ac35f8991c");
    _SupplierBillSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("5be5550e-c06b-4dbd-bcbf-748aedd3b634");
    _SupplierBillSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("1721e266-7328-4f01-8af9-62c60f672a82");
    _SupplierBillSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("86be5d84-b080-4b00-b39a-57ef6d127c84");
    _SupplierBillSToFRS.Enter_Amount("");
    

    TestModellerLogger.SetLastNodeGuid("d76e980e-6867-446d-a13a-3bbe2cc719a9");
    _SupplierBillSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("9720f223-ad75-48cf-9a78-a8a001ca0dfb");
    _SupplierBillSToFRS.Click_SaveButton();
    

    }

    @Test  (groups= {"ScriptSupplierBillSToFRS","ScriptSupplierBillSToFRS - Default Profile"})
    @TestModellerPath(guid = "8c195326-e4ea-4a6c-8986-6a669801f985")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlC30()
    {
        
        pages.Login1VAT _Login1VAT = new pages.Login1VAT(driver);
    TestModellerLogger.SetLastNodeGuid("93e4a214-3f97-41d2-8063-dd91c879e847");
    _Login1VAT.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7eff8b4c-1e47-48a4-bcad-b3639d0cdfd5");
    _Login1VAT.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ceaa193b-d8c0-48f9-911f-018e2571da20");
    _Login1VAT.Enter_UserName("Justine_Feeney");
    

    TestModellerLogger.SetLastNodeGuid("95b31ed9-af0a-49e7-8bfa-8471d379cdff");
    _Login1VAT.Enter_Password("c150SvnRgI");
    

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
    _AgentsSelect.Enter_AgentName("non");
    

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
    _ClientSelect.Enter_ClientName("dolor");
    

    TestModellerLogger.SetLastNodeGuid("ed3e4750-33a4-4d75-a14c-9d75935c79c7");
    _ClientSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("e537c9d6-4166-4745-b27e-a178d69d2884");
    _ClientSelect.Click_SelectClient();
    

pages.SupplierBillSToFRS _SupplierBillSToFRS = new pages.SupplierBillSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("7b21b860-8f6c-4e5e-8f4d-0ef9aedf75e5");
    _SupplierBillSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3d11c569-a0da-4838-a238-3d3cd071f91d");
    _SupplierBillSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5c30d940-2a3c-4ce2-9f6d-f491e71a1755");
    _SupplierBillSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("02bea7d1-9589-4278-8c66-58e376721799");
    _SupplierBillSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("fc395eef-59ac-4e0c-8092-d11ecdb61b84");
    _SupplierBillSToFRS.Click_NewSupplierBill();
    

    TestModellerLogger.SetLastNodeGuid("9ed916b8-79f8-4b59-a274-ed9c520242c8");
    _SupplierBillSToFRS.Select_SupplierName("Generic Purchase Supplier");
    

    TestModellerLogger.SetLastNodeGuid("6cbb598e-673a-45cd-9f0a-ec53cb56f09d");
    _SupplierBillSToFRS.Enter_DefaultCurrency();
    

    TestModellerLogger.SetLastNodeGuid("6516ccf8-ae24-42b1-b271-2bb390a6f8c3");
    _SupplierBillSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("12466744-0bd3-4135-9300-e044e7148e58");
    _SupplierBillSToFRS.Enter_Date("44249");
    

    TestModellerLogger.SetLastNodeGuid("7ea52093-1dd7-4979-8034-aeaef336d945");
    _SupplierBillSToFRS.Select_ExpenseType("Commercial vehicles revaluation");
    

    TestModellerLogger.SetLastNodeGuid("de8f87b1-ff3a-421c-9290-6ddaef339bf2");
    _SupplierBillSToFRS.Enter_Description("Reprehenderit eum doloremque.
Et vel cum et nisi facere blanditiis.
Esse aperiam rerum esse ipsam fugiat aspernatur non blanditiis.
Officiis adipisci velit cum.
Quos necessitatibus rem provident atque.
Similique qui illo rerum architecto.
Iusto qui ea voluptas rem.
Voluptas qui modi consequatur et.
Distinctio quae velit iste amet molestias fugiat suscipit.
Ipsa amet perspiciatis accusamus modi ut totam nulla numquam officia.");
    

    TestModellerLogger.SetLastNodeGuid("31e40f93-4cb6-45b2-bb91-cdd42e0f2f68");
    _SupplierBillSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("956a775c-cdf6-4d7d-949f-76ac35f8991c");
    _SupplierBillSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("5be5550e-c06b-4dbd-bcbf-748aedd3b634");
    _SupplierBillSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("1721e266-7328-4f01-8af9-62c60f672a82");
    _SupplierBillSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("86be5d84-b080-4b00-b39a-57ef6d127c84");
    _SupplierBillSToFRS.Enter_Amount("");
    

    TestModellerLogger.SetLastNodeGuid("d76e980e-6867-446d-a13a-3bbe2cc719a9");
    _SupplierBillSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("9720f223-ad75-48cf-9a78-a8a001ca0dfb");
    _SupplierBillSToFRS.Click_SaveButton();
    

    }*/

}
