package Supplier_test;

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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/d524bf91-30d3-42d4-915e-c5e06a23a5a0
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1106, profileId = 101005)
public class ScriptDebitNoteSToFRS_DefaultProfile extends TestBase
{
	public String sTestCaseID=null;
	String[] data=null;
	String Sheet = null;

    
    @Test  (groups= {"ScriptDebitNoteSToFRS","ScriptDebitNoteSToFRS - Default Profile"})
    @TestModellerPath(guid = "3e0064e9-38a6-4912-be21-7073afebf84a")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlCl1() throws InterruptedException, InvalidFormatException, HeadlessException, IOException, AWTException
    {
    	sTestCaseID="TC138";
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
    

Supplier_pages.DebitNoteSToFRS _DebitNoteSToFRS = new Supplier_pages.DebitNoteSToFRS(driver);
//    TestModellerLogger.SetLastNodeGuid("a9ac356a-1ff8-48d1-98c6-5613b1e1ba5a");
//    _DebitNoteSToFRS.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("281ed0ae-1966-4313-83f9-f02959a1af8f");
//    _DebitNoteSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f4ead229-e1a6-4686-9726-2a8d72975380");
    _DebitNoteSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("13d7978e-e074-45d2-8c0b-01b123aa6311");
    _DebitNoteSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("e0eca6d7-6b04-416d-855d-2a9e825dcd28");
    _DebitNoteSToFRS.Click_NewDebitNote();
    

    TestModellerLogger.SetLastNodeGuid("190c6323-be0b-4dd1-b552-dbe6423a4af8");
    _DebitNoteSToFRS.Select_SupplierName(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("c9f1fef7-60b9-4d4b-a4a0-825e5638fb6e");
    _DebitNoteSToFRS.Enter_BillNo(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("a8f7d6e5-89f8-4f36-a154-0755a90aa5e9");
    _DebitNoteSToFRS.Enter_Date(data[7]);
    

    TestModellerLogger.SetLastNodeGuid("d0e22573-153e-435a-8026-8e497c35f9ee");
    _DebitNoteSToFRS.Select_ExpenseType(data[8]);
    

    TestModellerLogger.SetLastNodeGuid("3f663a04-c82a-4f31-a2c8-3238da8ddb0c");
    _DebitNoteSToFRS.Enter_Description(data[9]);
    

    TestModellerLogger.SetLastNodeGuid("3b383dc0-235e-4780-9859-f151196feb92");
    _DebitNoteSToFRS.Enter_UnitPrice(data[10]);
    

    TestModellerLogger.SetLastNodeGuid("62f8964d-0533-4137-b19f-ed7484c16874");
    _DebitNoteSToFRS.Select_VATRateType(data[11]);
    

//    TestModellerLogger.SetLastNodeGuid("0c1c1062-a24e-491f-b466-c4f25be009dc");
//    _DebitNoteSToFRS.Enter_VATRate();
//    
//
//    TestModellerLogger.SetLastNodeGuid("df34f121-e6c7-4386-b83d-071d26d7877e");
//    _DebitNoteSToFRS.Enter_VATAmount("100");
//    
//
//    TestModellerLogger.SetLastNodeGuid("d9ad9e73-0fa4-4130-8856-5d6c154b68b4");
//    _DebitNoteSToFRS.Enter_Amount_Net("100");
//    
//
//    TestModellerLogger.SetLastNodeGuid("afe47079-aab8-40ac-8075-8edfd92c146a");
//    _DebitNoteSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("093d78cf-a676-401c-9139-02e7e7db005f");
    _DebitNoteSToFRS.Click__Save_();
    

    }

   @Test  (groups= {"ScriptDebitNoteSToFRS","ScriptDebitNoteSToFRS - Default Profile"})
    @TestModellerPath(guid = "a39e748e-0b27-4d4d-9b9a-500de909c61b")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlCl2() throws InterruptedException, InvalidFormatException, HeadlessException, IOException, AWTException
    {
    	sTestCaseID="TC139";
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
    

Supplier_pages.DebitNoteSToFRS _DebitNoteSToFRS = new Supplier_pages.DebitNoteSToFRS(driver);
//    TestModellerLogger.SetLastNodeGuid("a9ac356a-1ff8-48d1-98c6-5613b1e1ba5a");
//    _DebitNoteSToFRS.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("281ed0ae-1966-4313-83f9-f02959a1af8f");
//    _DebitNoteSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f4ead229-e1a6-4686-9726-2a8d72975380");
    _DebitNoteSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("13d7978e-e074-45d2-8c0b-01b123aa6311");
    _DebitNoteSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("e0eca6d7-6b04-416d-855d-2a9e825dcd28");
    _DebitNoteSToFRS.Click_NewDebitNote();
    

    TestModellerLogger.SetLastNodeGuid("190c6323-be0b-4dd1-b552-dbe6423a4af8");
    _DebitNoteSToFRS.Select_SupplierName(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("c9f1fef7-60b9-4d4b-a4a0-825e5638fb6e");
    _DebitNoteSToFRS.Enter_BillNo(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("a8f7d6e5-89f8-4f36-a154-0755a90aa5e9");
    _DebitNoteSToFRS.Enter_Date(data[7]);
    

    TestModellerLogger.SetLastNodeGuid("d0e22573-153e-435a-8026-8e497c35f9ee");
    _DebitNoteSToFRS.Select_ExpenseType(data[8]);
    

    TestModellerLogger.SetLastNodeGuid("3f663a04-c82a-4f31-a2c8-3238da8ddb0c");
    _DebitNoteSToFRS.Enter_Description(data[9]);
    

    TestModellerLogger.SetLastNodeGuid("3b383dc0-235e-4780-9859-f151196feb92");
    _DebitNoteSToFRS.Enter_UnitPrice(data[10]);
    

    TestModellerLogger.SetLastNodeGuid("62f8964d-0533-4137-b19f-ed7484c16874");
    _DebitNoteSToFRS.Select_VATRateType(data[11]);
    

//    TestModellerLogger.SetLastNodeGuid("0c1c1062-a24e-491f-b466-c4f25be009dc");
//    _DebitNoteSToFRS.Enter_VATRate();
//    
//
//    TestModellerLogger.SetLastNodeGuid("df34f121-e6c7-4386-b83d-071d26d7877e");
//    _DebitNoteSToFRS.Enter_VATAmount("100");
//    
//
//    TestModellerLogger.SetLastNodeGuid("d9ad9e73-0fa4-4130-8856-5d6c154b68b4");
//    _DebitNoteSToFRS.Enter_Amount_Net("100");
//    
//
//    TestModellerLogger.SetLastNodeGuid("afe47079-aab8-40ac-8075-8edfd92c146a");
//    _DebitNoteSToFRS.Click_Tickformorelineitems();
//    

    TestModellerLogger.SetLastNodeGuid("093d78cf-a676-401c-9139-02e7e7db005f");
    _DebitNoteSToFRS.Click__Save_();
    

    }

    @Test  (groups= {"ScriptDebitNoteSToFRS","ScriptDebitNoteSToFRS - Default Profile"})
    @TestModellerPath(guid = "0b86f6d2-d83a-43cd-af5a-44105c9c70ca")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlCl3() throws InvalidFormatException, InterruptedException, HeadlessException, IOException, AWTException
    {
    	sTestCaseID="TC140";
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
    

Supplier_pages.DebitNoteSToFRS _DebitNoteSToFRS = new Supplier_pages.DebitNoteSToFRS(driver);
//    TestModellerLogger.SetLastNodeGuid("a9ac356a-1ff8-48d1-98c6-5613b1e1ba5a");
//    _DebitNoteSToFRS.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("281ed0ae-1966-4313-83f9-f02959a1af8f");
//    _DebitNoteSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f4ead229-e1a6-4686-9726-2a8d72975380");
    _DebitNoteSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("13d7978e-e074-45d2-8c0b-01b123aa6311");
    _DebitNoteSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("e0eca6d7-6b04-416d-855d-2a9e825dcd28");
    _DebitNoteSToFRS.Click_NewDebitNote();
    

    TestModellerLogger.SetLastNodeGuid("190c6323-be0b-4dd1-b552-dbe6423a4af8");
    _DebitNoteSToFRS.Select_SupplierName(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("c9f1fef7-60b9-4d4b-a4a0-825e5638fb6e");
    _DebitNoteSToFRS.Enter_BillNo(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("a8f7d6e5-89f8-4f36-a154-0755a90aa5e9");
    _DebitNoteSToFRS.Enter_Date(data[7]);
    

    TestModellerLogger.SetLastNodeGuid("d0e22573-153e-435a-8026-8e497c35f9ee");
    _DebitNoteSToFRS.Select_ExpenseType(data[8]);
    

    TestModellerLogger.SetLastNodeGuid("3f663a04-c82a-4f31-a2c8-3238da8ddb0c");
    _DebitNoteSToFRS.Enter_Description(data[9]);
    

    TestModellerLogger.SetLastNodeGuid("3b383dc0-235e-4780-9859-f151196feb92");
    _DebitNoteSToFRS.Enter_UnitPrice(data[10]);
    

    TestModellerLogger.SetLastNodeGuid("62f8964d-0533-4137-b19f-ed7484c16874");
    _DebitNoteSToFRS.Select_VATRateType(data[11]);
    

//    TestModellerLogger.SetLastNodeGuid("0c1c1062-a24e-491f-b466-c4f25be009dc");
//    _DebitNoteSToFRS.Enter_VATRate();
//    
//
//    TestModellerLogger.SetLastNodeGuid("df34f121-e6c7-4386-b83d-071d26d7877e");
//    _DebitNoteSToFRS.Enter_VATAmount("100");
//    
//
//    TestModellerLogger.SetLastNodeGuid("d9ad9e73-0fa4-4130-8856-5d6c154b68b4");
//    _DebitNoteSToFRS.Enter_Amount_Net("100");
//    
//
//    TestModellerLogger.SetLastNodeGuid("afe47079-aab8-40ac-8075-8edfd92c146a");
//    _DebitNoteSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("093d78cf-a676-401c-9139-02e7e7db005f");
    _DebitNoteSToFRS.Click__Save_();
    

    }

    @Test  (groups= {"ScriptDebitNoteSToFRS","ScriptDebitNoteSToFRS - Default Profile"})
    @TestModellerPath(guid = "77f8eed1-b776-4656-b684-0c6643661a6e")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlCl4() throws InterruptedException, InvalidFormatException, HeadlessException, IOException, AWTException
    {
    	sTestCaseID="TC141";
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
    

Supplier_pages.DebitNoteSToFRS _DebitNoteSToFRS = new Supplier_pages.DebitNoteSToFRS(driver);
//    TestModellerLogger.SetLastNodeGuid("a9ac356a-1ff8-48d1-98c6-5613b1e1ba5a");
//    _DebitNoteSToFRS.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("281ed0ae-1966-4313-83f9-f02959a1af8f");
//    _DebitNoteSToFRS.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("f4ead229-e1a6-4686-9726-2a8d72975380");
    _DebitNoteSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("13d7978e-e074-45d2-8c0b-01b123aa6311");
    _DebitNoteSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("e0eca6d7-6b04-416d-855d-2a9e825dcd28");
    _DebitNoteSToFRS.Click_NewDebitNote();
    

    TestModellerLogger.SetLastNodeGuid("190c6323-be0b-4dd1-b552-dbe6423a4af8");
    _DebitNoteSToFRS.Select_SupplierName(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("c9f1fef7-60b9-4d4b-a4a0-825e5638fb6e");
    _DebitNoteSToFRS.Enter_BillNo(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("a8f7d6e5-89f8-4f36-a154-0755a90aa5e9");
    _DebitNoteSToFRS.Enter_Date(data[7]);
    

    TestModellerLogger.SetLastNodeGuid("d0e22573-153e-435a-8026-8e497c35f9ee");
    _DebitNoteSToFRS.Select_ExpenseType(data[8]);
    

    TestModellerLogger.SetLastNodeGuid("3f663a04-c82a-4f31-a2c8-3238da8ddb0c");
    _DebitNoteSToFRS.Enter_Description(data[9]);
    

    TestModellerLogger.SetLastNodeGuid("3b383dc0-235e-4780-9859-f151196feb92");
    _DebitNoteSToFRS.Enter_UnitPrice(data[10]);
    

    TestModellerLogger.SetLastNodeGuid("62f8964d-0533-4137-b19f-ed7484c16874");
    _DebitNoteSToFRS.Select_VATRateType(data[11]);
    

//    TestModellerLogger.SetLastNodeGuid("0c1c1062-a24e-491f-b466-c4f25be009dc");
//    _DebitNoteSToFRS.Enter_VATRate();
//    
//
//    TestModellerLogger.SetLastNodeGuid("df34f121-e6c7-4386-b83d-071d26d7877e");
//    _DebitNoteSToFRS.Enter_VATAmount("100");
//    
//
//    TestModellerLogger.SetLastNodeGuid("d9ad9e73-0fa4-4130-8856-5d6c154b68b4");
//    _DebitNoteSToFRS.Enter_Amount_Net("100");
//    
//
//    TestModellerLogger.SetLastNodeGuid("afe47079-aab8-40ac-8075-8edfd92c146a");
//    _DebitNoteSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("093d78cf-a676-401c-9139-02e7e7db005f");
    _DebitNoteSToFRS.Click__Save_();
    

    }

    @Test  (groups= {"ScriptDebitNoteSToFRS","ScriptDebitNoteSToFRS - Default Profile"})
    @TestModellerPath(guid = "cf15d8e2-1216-4e0b-a037-d45ce781160b")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlCl5() throws InvalidFormatException, InterruptedException, HeadlessException, IOException, AWTException
    {
    	sTestCaseID="TC142";
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
    

Supplier_pages.DebitNoteSToFRS _DebitNoteSToFRS = new Supplier_pages.DebitNoteSToFRS(driver);
//    TestModellerLogger.SetLastNodeGuid("a9ac356a-1ff8-48d1-98c6-5613b1e1ba5a");
//    _DebitNoteSToFRS.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("281ed0ae-1966-4313-83f9-f02959a1af8f");
//    _DebitNoteSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f4ead229-e1a6-4686-9726-2a8d72975380");
    _DebitNoteSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("13d7978e-e074-45d2-8c0b-01b123aa6311");
    _DebitNoteSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("e0eca6d7-6b04-416d-855d-2a9e825dcd28");
    _DebitNoteSToFRS.Click_NewDebitNote();
    

    TestModellerLogger.SetLastNodeGuid("190c6323-be0b-4dd1-b552-dbe6423a4af8");
    _DebitNoteSToFRS.Select_SupplierName(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("c9f1fef7-60b9-4d4b-a4a0-825e5638fb6e");
    _DebitNoteSToFRS.Enter_BillNo(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("a8f7d6e5-89f8-4f36-a154-0755a90aa5e9");
    _DebitNoteSToFRS.Enter_Date(data[7]);
    

    TestModellerLogger.SetLastNodeGuid("d0e22573-153e-435a-8026-8e497c35f9ee");
    _DebitNoteSToFRS.Select_ExpenseType(data[8]);
    

    TestModellerLogger.SetLastNodeGuid("3f663a04-c82a-4f31-a2c8-3238da8ddb0c");
    _DebitNoteSToFRS.Enter_Description(data[9]);
    

    TestModellerLogger.SetLastNodeGuid("3b383dc0-235e-4780-9859-f151196feb92");
    _DebitNoteSToFRS.Enter_UnitPrice(data[10]);
    

    TestModellerLogger.SetLastNodeGuid("62f8964d-0533-4137-b19f-ed7484c16874");
    _DebitNoteSToFRS.Select_VATRateType(data[11]);
    

//    TestModellerLogger.SetLastNodeGuid("0c1c1062-a24e-491f-b466-c4f25be009dc");
//    _DebitNoteSToFRS.Enter_VATRate();
//    
//
//    TestModellerLogger.SetLastNodeGuid("df34f121-e6c7-4386-b83d-071d26d7877e");
//    _DebitNoteSToFRS.Enter_VATAmount("100");
//    
//
//    TestModellerLogger.SetLastNodeGuid("d9ad9e73-0fa4-4130-8856-5d6c154b68b4");
//    _DebitNoteSToFRS.Enter_Amount_Net("100");
//    
//
//    TestModellerLogger.SetLastNodeGuid("afe47079-aab8-40ac-8075-8edfd92c146a");
//    _DebitNoteSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("093d78cf-a676-401c-9139-02e7e7db005f");
    _DebitNoteSToFRS.Click__Save_();
    

    }

    @Test  (groups= {"ScriptDebitNoteSToFRS","ScriptDebitNoteSToFRS - Default Profile"})
    @TestModellerPath(guid = "bf956506-7d80-405b-985e-a7a222d43be4")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlCl6() throws InvalidFormatException, InterruptedException, HeadlessException, IOException, AWTException
    {
    	sTestCaseID="TC143";
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
    

Supplier_pages.DebitNoteSToFRS _DebitNoteSToFRS = new Supplier_pages.DebitNoteSToFRS(driver);
//    TestModellerLogger.SetLastNodeGuid("a9ac356a-1ff8-48d1-98c6-5613b1e1ba5a");
//    _DebitNoteSToFRS.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("281ed0ae-1966-4313-83f9-f02959a1af8f");
//    _DebitNoteSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f4ead229-e1a6-4686-9726-2a8d72975380");
    _DebitNoteSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("13d7978e-e074-45d2-8c0b-01b123aa6311");
    _DebitNoteSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("e0eca6d7-6b04-416d-855d-2a9e825dcd28");
    _DebitNoteSToFRS.Click_NewDebitNote();
    

    TestModellerLogger.SetLastNodeGuid("190c6323-be0b-4dd1-b552-dbe6423a4af8");
    _DebitNoteSToFRS.Select_SupplierName(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("c9f1fef7-60b9-4d4b-a4a0-825e5638fb6e");
    _DebitNoteSToFRS.Enter_BillNo(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("a8f7d6e5-89f8-4f36-a154-0755a90aa5e9");
    _DebitNoteSToFRS.Enter_Date(data[7]);
    

    TestModellerLogger.SetLastNodeGuid("d0e22573-153e-435a-8026-8e497c35f9ee");
    _DebitNoteSToFRS.Select_ExpenseType(data[8]);
    

    TestModellerLogger.SetLastNodeGuid("3f663a04-c82a-4f31-a2c8-3238da8ddb0c");
    _DebitNoteSToFRS.Enter_Description(data[9]);
    

    TestModellerLogger.SetLastNodeGuid("3b383dc0-235e-4780-9859-f151196feb92");
    _DebitNoteSToFRS.Enter_UnitPrice(data[10]);
    

    TestModellerLogger.SetLastNodeGuid("62f8964d-0533-4137-b19f-ed7484c16874");
    _DebitNoteSToFRS.Select_VATRateType(data[11]);
    

//    TestModellerLogger.SetLastNodeGuid("0c1c1062-a24e-491f-b466-c4f25be009dc");
//    _DebitNoteSToFRS.Enter_VATRate();
//    
//
//    TestModellerLogger.SetLastNodeGuid("df34f121-e6c7-4386-b83d-071d26d7877e");
//    _DebitNoteSToFRS.Enter_VATAmount("100");
//    
//
//    TestModellerLogger.SetLastNodeGuid("d9ad9e73-0fa4-4130-8856-5d6c154b68b4");
//    _DebitNoteSToFRS.Enter_Amount_Net("100");
//    
//
//    TestModellerLogger.SetLastNodeGuid("afe47079-aab8-40ac-8075-8edfd92c146a");
//    _DebitNoteSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("093d78cf-a676-401c-9139-02e7e7db005f");
    _DebitNoteSToFRS.Click__Save_();
    

    }

   /* @Test  (groups= {"ScriptDebitNoteSToFRS","ScriptDebitNoteSToFRS - Default Profile"})
    @TestModellerPath(guid = "ca04bec1-03b8-4d4f-9f06-03cb7571610c")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlCl7()
    {
        
        pages.Login1VAT _Login1VAT = new pages.Login1VAT(driver);
    TestModellerLogger.SetLastNodeGuid("93e4a214-3f97-41d2-8063-dd91c879e847");
    _Login1VAT.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7eff8b4c-1e47-48a4-bcad-b3639d0cdfd5");
    _Login1VAT.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ceaa193b-d8c0-48f9-911f-018e2571da20");
    _Login1VAT.Enter_UserName("Kristofer.McDermott44");
    

    TestModellerLogger.SetLastNodeGuid("95b31ed9-af0a-49e7-8bfa-8471d379cdff");
    _Login1VAT.Enter_Password("JmVQ3RDO8K");
    

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
    _AgentsSelect.Enter_AgentName("quia");
    

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
    _ClientSelect.Enter_ClientName("impedit");
    

    TestModellerLogger.SetLastNodeGuid("ed3e4750-33a4-4d75-a14c-9d75935c79c7");
    _ClientSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("e537c9d6-4166-4745-b27e-a178d69d2884");
    _ClientSelect.Click_SelectClient();
    

pages.DebitNoteSToFRS _DebitNoteSToFRS = new pages.DebitNoteSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("a9ac356a-1ff8-48d1-98c6-5613b1e1ba5a");
    _DebitNoteSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("281ed0ae-1966-4313-83f9-f02959a1af8f");
    _DebitNoteSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f4ead229-e1a6-4686-9726-2a8d72975380");
    _DebitNoteSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("13d7978e-e074-45d2-8c0b-01b123aa6311");
    _DebitNoteSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("e0eca6d7-6b04-416d-855d-2a9e825dcd28");
    _DebitNoteSToFRS.Click_NewDebitNote();
    

    TestModellerLogger.SetLastNodeGuid("190c6323-be0b-4dd1-b552-dbe6423a4af8");
    _DebitNoteSToFRS.Select_SupplierName("ABCSupplier");
    

    TestModellerLogger.SetLastNodeGuid("c9f1fef7-60b9-4d4b-a4a0-825e5638fb6e");
    _DebitNoteSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("a8f7d6e5-89f8-4f36-a154-0755a90aa5e9");
    _DebitNoteSToFRS.Enter_Date("44250");
    

    TestModellerLogger.SetLastNodeGuid("d0e22573-153e-435a-8026-8e497c35f9ee");
    _DebitNoteSToFRS.Select_ExpenseType("Purchases");
    

    TestModellerLogger.SetLastNodeGuid("3f663a04-c82a-4f31-a2c8-3238da8ddb0c");
    _DebitNoteSToFRS.Enter_Description("Id magni cum qui.
Aut sequi ratione temporibus qui dolor laboriosam.
Ut nostrum perspiciatis soluta asperiores vero sit magnam.
Non natus quibusdam non ratione.
Eligendi reiciendis perferendis voluptatem.
Sint voluptate possimus.
Amet commodi animi debitis.
Illum placeat inventore accusantium rerum dolor quidem.
Molestiae qui quisquam et voluptates.
Sed fugit voluptatem doloribus expedita.");
    

    TestModellerLogger.SetLastNodeGuid("3b383dc0-235e-4780-9859-f151196feb92");
    _DebitNoteSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("62f8964d-0533-4137-b19f-ed7484c16874");
    _DebitNoteSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("0c1c1062-a24e-491f-b466-c4f25be009dc");
    _DebitNoteSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("df34f121-e6c7-4386-b83d-071d26d7877e");
    _DebitNoteSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("d9ad9e73-0fa4-4130-8856-5d6c154b68b4");
    _DebitNoteSToFRS.Enter_Amount_Net("100");
    

    TestModellerLogger.SetLastNodeGuid("afe47079-aab8-40ac-8075-8edfd92c146a");
    _DebitNoteSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("093d78cf-a676-401c-9139-02e7e7db005f");
    _DebitNoteSToFRS.Click__Save_();
    

    }

    @Test  (groups= {"ScriptDebitNoteSToFRS","ScriptDebitNoteSToFRS - Default Profile"})
    @TestModellerPath(guid = "23ccf9c9-9809-4d8c-893f-4d5fc9079279")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlCl8()
    {
        
        pages.Login1VAT _Login1VAT = new pages.Login1VAT(driver);
    TestModellerLogger.SetLastNodeGuid("93e4a214-3f97-41d2-8063-dd91c879e847");
    _Login1VAT.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7eff8b4c-1e47-48a4-bcad-b3639d0cdfd5");
    _Login1VAT.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ceaa193b-d8c0-48f9-911f-018e2571da20");
    _Login1VAT.Enter_UserName("Lera.Marvin");
    

    TestModellerLogger.SetLastNodeGuid("95b31ed9-af0a-49e7-8bfa-8471d379cdff");
    _Login1VAT.Enter_Password("dEOZFERIv7");
    

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
    _ClientSelect.Enter_ClientName("quibusdam");
    

    TestModellerLogger.SetLastNodeGuid("ed3e4750-33a4-4d75-a14c-9d75935c79c7");
    _ClientSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("e537c9d6-4166-4745-b27e-a178d69d2884");
    _ClientSelect.Click_SelectClient();
    

pages.DebitNoteSToFRS _DebitNoteSToFRS = new pages.DebitNoteSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("a9ac356a-1ff8-48d1-98c6-5613b1e1ba5a");
    _DebitNoteSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("281ed0ae-1966-4313-83f9-f02959a1af8f");
    _DebitNoteSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f4ead229-e1a6-4686-9726-2a8d72975380");
    _DebitNoteSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("13d7978e-e074-45d2-8c0b-01b123aa6311");
    _DebitNoteSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("e0eca6d7-6b04-416d-855d-2a9e825dcd28");
    _DebitNoteSToFRS.Click_NewDebitNote();
    

    TestModellerLogger.SetLastNodeGuid("190c6323-be0b-4dd1-b552-dbe6423a4af8");
    _DebitNoteSToFRS.Select_SupplierName("ABCSupplier");
    

    TestModellerLogger.SetLastNodeGuid("c9f1fef7-60b9-4d4b-a4a0-825e5638fb6e");
    _DebitNoteSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("a8f7d6e5-89f8-4f36-a154-0755a90aa5e9");
    _DebitNoteSToFRS.Enter_Date("44250");
    

    TestModellerLogger.SetLastNodeGuid("d0e22573-153e-435a-8026-8e497c35f9ee");
    _DebitNoteSToFRS.Select_ExpenseType("Subcontractors");
    

    TestModellerLogger.SetLastNodeGuid("3f663a04-c82a-4f31-a2c8-3238da8ddb0c");
    _DebitNoteSToFRS.Enter_Description("Dolor et est qui consequatur dolores voluptate.
Consectetur perspiciatis odit.
Eos omnis quae neque quis earum at.
Consequatur dolor perspiciatis.
Id est aut et et consectetur laudantium qui.
Maxime voluptatem laborum magnam.
Nostrum cupiditate quae omnis vel ut.
Animi asperiores voluptatibus suscipit.
Quaerat ipsam animi et sint.
A architecto nulla.");
    

    TestModellerLogger.SetLastNodeGuid("3b383dc0-235e-4780-9859-f151196feb92");
    _DebitNoteSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("62f8964d-0533-4137-b19f-ed7484c16874");
    _DebitNoteSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("0c1c1062-a24e-491f-b466-c4f25be009dc");
    _DebitNoteSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("df34f121-e6c7-4386-b83d-071d26d7877e");
    _DebitNoteSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("d9ad9e73-0fa4-4130-8856-5d6c154b68b4");
    _DebitNoteSToFRS.Enter_Amount_Net("100");
    

    TestModellerLogger.SetLastNodeGuid("afe47079-aab8-40ac-8075-8edfd92c146a");
    _DebitNoteSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("093d78cf-a676-401c-9139-02e7e7db005f");
    _DebitNoteSToFRS.Click__Save_();
    

    }

    @Test  (groups= {"ScriptDebitNoteSToFRS","ScriptDebitNoteSToFRS - Default Profile"})
    @TestModellerPath(guid = "d3e60aca-2ee6-4746-b5b2-fdb320d267d7")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlCl9()
    {
        
        pages.Login1VAT _Login1VAT = new pages.Login1VAT(driver);
    TestModellerLogger.SetLastNodeGuid("93e4a214-3f97-41d2-8063-dd91c879e847");
    _Login1VAT.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7eff8b4c-1e47-48a4-bcad-b3639d0cdfd5");
    _Login1VAT.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ceaa193b-d8c0-48f9-911f-018e2571da20");
    _Login1VAT.Enter_UserName("Karine_Hilpert");
    

    TestModellerLogger.SetLastNodeGuid("95b31ed9-af0a-49e7-8bfa-8471d379cdff");
    _Login1VAT.Enter_Password("pPqYZzhDHy");
    

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
    _ClientSelect.Enter_ClientName("sed");
    

    TestModellerLogger.SetLastNodeGuid("ed3e4750-33a4-4d75-a14c-9d75935c79c7");
    _ClientSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("e537c9d6-4166-4745-b27e-a178d69d2884");
    _ClientSelect.Click_SelectClient();
    

pages.DebitNoteSToFRS _DebitNoteSToFRS = new pages.DebitNoteSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("a9ac356a-1ff8-48d1-98c6-5613b1e1ba5a");
    _DebitNoteSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("281ed0ae-1966-4313-83f9-f02959a1af8f");
    _DebitNoteSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f4ead229-e1a6-4686-9726-2a8d72975380");
    _DebitNoteSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("13d7978e-e074-45d2-8c0b-01b123aa6311");
    _DebitNoteSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("e0eca6d7-6b04-416d-855d-2a9e825dcd28");
    _DebitNoteSToFRS.Click_NewDebitNote();
    

    TestModellerLogger.SetLastNodeGuid("190c6323-be0b-4dd1-b552-dbe6423a4af8");
    _DebitNoteSToFRS.Select_SupplierName("ABCSupplier");
    

    TestModellerLogger.SetLastNodeGuid("c9f1fef7-60b9-4d4b-a4a0-825e5638fb6e");
    _DebitNoteSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("a8f7d6e5-89f8-4f36-a154-0755a90aa5e9");
    _DebitNoteSToFRS.Enter_Date("44250");
    

    TestModellerLogger.SetLastNodeGuid("d0e22573-153e-435a-8026-8e497c35f9ee");
    _DebitNoteSToFRS.Select_ExpenseType("Accountancy fee");
    

    TestModellerLogger.SetLastNodeGuid("3f663a04-c82a-4f31-a2c8-3238da8ddb0c");
    _DebitNoteSToFRS.Enter_Description("Voluptatum dolores expedita quia similique aspernatur non.
At officia tempora voluptatem.
Dolor natus sunt magni perspiciatis eos autem necessitatibus.
Velit mollitia ducimus ut quam nostrum libero.
Similique enim sed iure mollitia.
Et ad recusandae occaecati quasi itaque et illum.
Molestias dolor minus ea.
Velit quas odit.
Soluta et itaque inventore tempore libero.
Quidem deleniti culpa sit a illum ut qui.");
    

    TestModellerLogger.SetLastNodeGuid("3b383dc0-235e-4780-9859-f151196feb92");
    _DebitNoteSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("62f8964d-0533-4137-b19f-ed7484c16874");
    _DebitNoteSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("0c1c1062-a24e-491f-b466-c4f25be009dc");
    _DebitNoteSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("df34f121-e6c7-4386-b83d-071d26d7877e");
    _DebitNoteSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("d9ad9e73-0fa4-4130-8856-5d6c154b68b4");
    _DebitNoteSToFRS.Enter_Amount_Net("100");
    

    TestModellerLogger.SetLastNodeGuid("afe47079-aab8-40ac-8075-8edfd92c146a");
    _DebitNoteSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("093d78cf-a676-401c-9139-02e7e7db005f");
    _DebitNoteSToFRS.Click__Save_();
    

    }

    @Test  (groups= {"ScriptDebitNoteSToFRS","ScriptDebitNoteSToFRS - Default Profile"})
    @TestModellerPath(guid = "823e58d1-6339-4b8c-a94f-fd4d0eb4f44e")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlC10()
    {
        
        pages.Login1VAT _Login1VAT = new pages.Login1VAT(driver);
    TestModellerLogger.SetLastNodeGuid("93e4a214-3f97-41d2-8063-dd91c879e847");
    _Login1VAT.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7eff8b4c-1e47-48a4-bcad-b3639d0cdfd5");
    _Login1VAT.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ceaa193b-d8c0-48f9-911f-018e2571da20");
    _Login1VAT.Enter_UserName("Louvenia_Okuneva43");
    

    TestModellerLogger.SetLastNodeGuid("95b31ed9-af0a-49e7-8bfa-8471d379cdff");
    _Login1VAT.Enter_Password("Sb76XGMyLF");
    

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
    _AgentsSelect.Enter_AgentName("provident");
    

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
    _ClientSelect.Enter_ClientName("officiis");
    

    TestModellerLogger.SetLastNodeGuid("ed3e4750-33a4-4d75-a14c-9d75935c79c7");
    _ClientSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("e537c9d6-4166-4745-b27e-a178d69d2884");
    _ClientSelect.Click_SelectClient();
    

pages.DebitNoteSToFRS _DebitNoteSToFRS = new pages.DebitNoteSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("a9ac356a-1ff8-48d1-98c6-5613b1e1ba5a");
    _DebitNoteSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("281ed0ae-1966-4313-83f9-f02959a1af8f");
    _DebitNoteSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f4ead229-e1a6-4686-9726-2a8d72975380");
    _DebitNoteSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("13d7978e-e074-45d2-8c0b-01b123aa6311");
    _DebitNoteSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("e0eca6d7-6b04-416d-855d-2a9e825dcd28");
    _DebitNoteSToFRS.Click_NewDebitNote();
    

    TestModellerLogger.SetLastNodeGuid("190c6323-be0b-4dd1-b552-dbe6423a4af8");
    _DebitNoteSToFRS.Select_SupplierName("ABCSupplier");
    

    TestModellerLogger.SetLastNodeGuid("c9f1fef7-60b9-4d4b-a4a0-825e5638fb6e");
    _DebitNoteSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("a8f7d6e5-89f8-4f36-a154-0755a90aa5e9");
    _DebitNoteSToFRS.Enter_Date("44250");
    

    TestModellerLogger.SetLastNodeGuid("d0e22573-153e-435a-8026-8e497c35f9ee");
    _DebitNoteSToFRS.Select_ExpenseType("Advertising, sales promotion, marketing");
    

    TestModellerLogger.SetLastNodeGuid("3f663a04-c82a-4f31-a2c8-3238da8ddb0c");
    _DebitNoteSToFRS.Enter_Description("Necessitatibus officia architecto et dolorem dolor nihil est.
Consequatur animi voluptatem quo et praesentium modi quibusdam non.
Excepturi voluptatem omnis sunt laboriosam saepe atque sed.
Eos omnis et minus unde repellat placeat necessitatibus.
Tenetur temporibus eaque error saepe architecto et.
Ut dolor officiis quos unde.
Eius magnam id provident laboriosam sit minus.
Soluta nam aut omnis.
Autem accusamus porro quo.
Similique quo voluptas quam et hic quaerat deleniti.");
    

    TestModellerLogger.SetLastNodeGuid("3b383dc0-235e-4780-9859-f151196feb92");
    _DebitNoteSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("62f8964d-0533-4137-b19f-ed7484c16874");
    _DebitNoteSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("0c1c1062-a24e-491f-b466-c4f25be009dc");
    _DebitNoteSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("df34f121-e6c7-4386-b83d-071d26d7877e");
    _DebitNoteSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("d9ad9e73-0fa4-4130-8856-5d6c154b68b4");
    _DebitNoteSToFRS.Enter_Amount_Net("100");
    

    TestModellerLogger.SetLastNodeGuid("afe47079-aab8-40ac-8075-8edfd92c146a");
    _DebitNoteSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("093d78cf-a676-401c-9139-02e7e7db005f");
    _DebitNoteSToFRS.Click__Save_();
    

    }

    @Test  (groups= {"ScriptDebitNoteSToFRS","ScriptDebitNoteSToFRS - Default Profile"})
    @TestModellerPath(guid = "937b0ab4-0803-4907-8c5c-278f93503287")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlC11()
    {
        
        pages.Login1VAT _Login1VAT = new pages.Login1VAT(driver);
    TestModellerLogger.SetLastNodeGuid("93e4a214-3f97-41d2-8063-dd91c879e847");
    _Login1VAT.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7eff8b4c-1e47-48a4-bcad-b3639d0cdfd5");
    _Login1VAT.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ceaa193b-d8c0-48f9-911f-018e2571da20");
    _Login1VAT.Enter_UserName("Gladys_Lubowitz65");
    

    TestModellerLogger.SetLastNodeGuid("95b31ed9-af0a-49e7-8bfa-8471d379cdff");
    _Login1VAT.Enter_Password("5BH3APN1di");
    

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
    _AgentsSelect.Enter_AgentName("dolorem");
    

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
    _ClientSelect.Enter_ClientName("vel");
    

    TestModellerLogger.SetLastNodeGuid("ed3e4750-33a4-4d75-a14c-9d75935c79c7");
    _ClientSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("e537c9d6-4166-4745-b27e-a178d69d2884");
    _ClientSelect.Click_SelectClient();
    

pages.DebitNoteSToFRS _DebitNoteSToFRS = new pages.DebitNoteSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("a9ac356a-1ff8-48d1-98c6-5613b1e1ba5a");
    _DebitNoteSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("281ed0ae-1966-4313-83f9-f02959a1af8f");
    _DebitNoteSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f4ead229-e1a6-4686-9726-2a8d72975380");
    _DebitNoteSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("13d7978e-e074-45d2-8c0b-01b123aa6311");
    _DebitNoteSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("e0eca6d7-6b04-416d-855d-2a9e825dcd28");
    _DebitNoteSToFRS.Click_NewDebitNote();
    

    TestModellerLogger.SetLastNodeGuid("190c6323-be0b-4dd1-b552-dbe6423a4af8");
    _DebitNoteSToFRS.Select_SupplierName("ABCSupplier");
    

    TestModellerLogger.SetLastNodeGuid("c9f1fef7-60b9-4d4b-a4a0-825e5638fb6e");
    _DebitNoteSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("a8f7d6e5-89f8-4f36-a154-0755a90aa5e9");
    _DebitNoteSToFRS.Enter_Date("44250");
    

    TestModellerLogger.SetLastNodeGuid("d0e22573-153e-435a-8026-8e497c35f9ee");
    _DebitNoteSToFRS.Select_ExpenseType("Bank, card and overdraft charges");
    

    TestModellerLogger.SetLastNodeGuid("3f663a04-c82a-4f31-a2c8-3238da8ddb0c");
    _DebitNoteSToFRS.Enter_Description("Dolor aut autem officia nisi pariatur quia iure harum.
Consectetur et fugiat maxime et animi expedita ad vero rerum.
Fuga voluptatibus quam id a quaerat delectus reprehenderit.
Quis ad optio itaque veritatis enim ad ea sint.
Rerum optio repudiandae possimus illo ipsam possimus modi.
Aut quis consectetur omnis molestiae consequuntur nesciunt.
A pariatur eum deserunt.
Asperiores vero sunt repudiandae.
Saepe nobis corrupti quia.
Ea incidunt repellat hic impedit.");
    

    TestModellerLogger.SetLastNodeGuid("3b383dc0-235e-4780-9859-f151196feb92");
    _DebitNoteSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("62f8964d-0533-4137-b19f-ed7484c16874");
    _DebitNoteSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("0c1c1062-a24e-491f-b466-c4f25be009dc");
    _DebitNoteSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("df34f121-e6c7-4386-b83d-071d26d7877e");
    _DebitNoteSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("d9ad9e73-0fa4-4130-8856-5d6c154b68b4");
    _DebitNoteSToFRS.Enter_Amount_Net("100");
    

    TestModellerLogger.SetLastNodeGuid("afe47079-aab8-40ac-8075-8edfd92c146a");
    _DebitNoteSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("093d78cf-a676-401c-9139-02e7e7db005f");
    _DebitNoteSToFRS.Click__Save_();
    

    }

    @Test  (groups= {"ScriptDebitNoteSToFRS","ScriptDebitNoteSToFRS - Default Profile"})
    @TestModellerPath(guid = "07eed2ca-0d12-42e6-b43c-575064ad669a")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlC12()
    {
        
        pages.Login1VAT _Login1VAT = new pages.Login1VAT(driver);
    TestModellerLogger.SetLastNodeGuid("93e4a214-3f97-41d2-8063-dd91c879e847");
    _Login1VAT.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7eff8b4c-1e47-48a4-bcad-b3639d0cdfd5");
    _Login1VAT.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ceaa193b-d8c0-48f9-911f-018e2571da20");
    _Login1VAT.Enter_UserName("Araceli53");
    

    TestModellerLogger.SetLastNodeGuid("95b31ed9-af0a-49e7-8bfa-8471d379cdff");
    _Login1VAT.Enter_Password("jhmT3dxkrB");
    

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
    _AgentsSelect.Enter_AgentName("sed");
    

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
    

pages.DebitNoteSToFRS _DebitNoteSToFRS = new pages.DebitNoteSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("a9ac356a-1ff8-48d1-98c6-5613b1e1ba5a");
    _DebitNoteSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("281ed0ae-1966-4313-83f9-f02959a1af8f");
    _DebitNoteSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f4ead229-e1a6-4686-9726-2a8d72975380");
    _DebitNoteSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("13d7978e-e074-45d2-8c0b-01b123aa6311");
    _DebitNoteSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("e0eca6d7-6b04-416d-855d-2a9e825dcd28");
    _DebitNoteSToFRS.Click_NewDebitNote();
    

    TestModellerLogger.SetLastNodeGuid("190c6323-be0b-4dd1-b552-dbe6423a4af8");
    _DebitNoteSToFRS.Select_SupplierName("ABCSupplier");
    

    TestModellerLogger.SetLastNodeGuid("c9f1fef7-60b9-4d4b-a4a0-825e5638fb6e");
    _DebitNoteSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("a8f7d6e5-89f8-4f36-a154-0755a90aa5e9");
    _DebitNoteSToFRS.Enter_Date("44250");
    

    TestModellerLogger.SetLastNodeGuid("d0e22573-153e-435a-8026-8e497c35f9ee");
    _DebitNoteSToFRS.Select_ExpenseType("Business entertaining");
    

    TestModellerLogger.SetLastNodeGuid("3f663a04-c82a-4f31-a2c8-3238da8ddb0c");
    _DebitNoteSToFRS.Enter_Description("Sit voluptatem excepturi provident aperiam temporibus cumque inventore amet eos.
Eos ut quia.
Doloribus fugiat voluptatem molestiae quia ducimus ut.
Molestiae sit iste aut corrupti quis reprehenderit.
Qui vitae dolor nemo.
Repellendus dolorem adipisci.
Dolore et eaque tempora.
Laboriosam dolores incidunt tenetur dolores.
In nulla quidem blanditiis minima.
Vitae aliquid voluptatum voluptatibus numquam nobis quibusdam rerum.");
    

    TestModellerLogger.SetLastNodeGuid("3b383dc0-235e-4780-9859-f151196feb92");
    _DebitNoteSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("62f8964d-0533-4137-b19f-ed7484c16874");
    _DebitNoteSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("0c1c1062-a24e-491f-b466-c4f25be009dc");
    _DebitNoteSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("df34f121-e6c7-4386-b83d-071d26d7877e");
    _DebitNoteSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("d9ad9e73-0fa4-4130-8856-5d6c154b68b4");
    _DebitNoteSToFRS.Enter_Amount_Net("100");
    

    TestModellerLogger.SetLastNodeGuid("afe47079-aab8-40ac-8075-8edfd92c146a");
    _DebitNoteSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("093d78cf-a676-401c-9139-02e7e7db005f");
    _DebitNoteSToFRS.Click__Save_();
    

    }

    @Test  (groups= {"ScriptDebitNoteSToFRS","ScriptDebitNoteSToFRS - Default Profile"})
    @TestModellerPath(guid = "3ad8b937-1a80-4e08-bb3b-0e98de55fae0")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlC13()
    {
        
        pages.Login1VAT _Login1VAT = new pages.Login1VAT(driver);
    TestModellerLogger.SetLastNodeGuid("93e4a214-3f97-41d2-8063-dd91c879e847");
    _Login1VAT.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7eff8b4c-1e47-48a4-bcad-b3639d0cdfd5");
    _Login1VAT.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ceaa193b-d8c0-48f9-911f-018e2571da20");
    _Login1VAT.Enter_UserName("Rowan.Douglas96");
    

    TestModellerLogger.SetLastNodeGuid("95b31ed9-af0a-49e7-8bfa-8471d379cdff");
    _Login1VAT.Enter_Password("_4jlrlokX5");
    

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
    _AgentsSelect.Enter_AgentName("vel");
    

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
    _ClientSelect.Enter_ClientName("sunt");
    

    TestModellerLogger.SetLastNodeGuid("ed3e4750-33a4-4d75-a14c-9d75935c79c7");
    _ClientSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("e537c9d6-4166-4745-b27e-a178d69d2884");
    _ClientSelect.Click_SelectClient();
    

pages.DebitNoteSToFRS _DebitNoteSToFRS = new pages.DebitNoteSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("a9ac356a-1ff8-48d1-98c6-5613b1e1ba5a");
    _DebitNoteSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("281ed0ae-1966-4313-83f9-f02959a1af8f");
    _DebitNoteSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f4ead229-e1a6-4686-9726-2a8d72975380");
    _DebitNoteSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("13d7978e-e074-45d2-8c0b-01b123aa6311");
    _DebitNoteSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("e0eca6d7-6b04-416d-855d-2a9e825dcd28");
    _DebitNoteSToFRS.Click_NewDebitNote();
    

    TestModellerLogger.SetLastNodeGuid("190c6323-be0b-4dd1-b552-dbe6423a4af8");
    _DebitNoteSToFRS.Select_SupplierName("ABCSupplier");
    

    TestModellerLogger.SetLastNodeGuid("c9f1fef7-60b9-4d4b-a4a0-825e5638fb6e");
    _DebitNoteSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("a8f7d6e5-89f8-4f36-a154-0755a90aa5e9");
    _DebitNoteSToFRS.Enter_Date("44250");
    

    TestModellerLogger.SetLastNodeGuid("d0e22573-153e-435a-8026-8e497c35f9ee");
    _DebitNoteSToFRS.Select_ExpenseType("Equipment expensed");
    

    TestModellerLogger.SetLastNodeGuid("3f663a04-c82a-4f31-a2c8-3238da8ddb0c");
    _DebitNoteSToFRS.Enter_Description("Veritatis sunt provident debitis ipsa autem est dignissimos quia.
Minima cumque voluptatum.
Tempora doloremque ut et minima optio iste id.
Ea quis laboriosam ad magni impedit.
Esse commodi doloribus molestias esse velit soluta aut.
Sequi doloremque suscipit iusto repellendus enim quas sed voluptate.
Eveniet dolorem fuga dicta qui quis.
Sequi magni officia nihil sint.
Id distinctio laborum sint impedit delectus.
Illum ut neque quos quia.");
    

    TestModellerLogger.SetLastNodeGuid("3b383dc0-235e-4780-9859-f151196feb92");
    _DebitNoteSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("62f8964d-0533-4137-b19f-ed7484c16874");
    _DebitNoteSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("0c1c1062-a24e-491f-b466-c4f25be009dc");
    _DebitNoteSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("df34f121-e6c7-4386-b83d-071d26d7877e");
    _DebitNoteSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("d9ad9e73-0fa4-4130-8856-5d6c154b68b4");
    _DebitNoteSToFRS.Enter_Amount_Net("100");
    

    TestModellerLogger.SetLastNodeGuid("afe47079-aab8-40ac-8075-8edfd92c146a");
    _DebitNoteSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("093d78cf-a676-401c-9139-02e7e7db005f");
    _DebitNoteSToFRS.Click__Save_();
    

    }

    @Test  (groups= {"ScriptDebitNoteSToFRS","ScriptDebitNoteSToFRS - Default Profile"})
    @TestModellerPath(guid = "2f202d17-4aba-49a0-bbf1-38235af80405")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlC14()
    {
        
        pages.Login1VAT _Login1VAT = new pages.Login1VAT(driver);
    TestModellerLogger.SetLastNodeGuid("93e4a214-3f97-41d2-8063-dd91c879e847");
    _Login1VAT.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7eff8b4c-1e47-48a4-bcad-b3639d0cdfd5");
    _Login1VAT.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ceaa193b-d8c0-48f9-911f-018e2571da20");
    _Login1VAT.Enter_UserName("Chloe12");
    

    TestModellerLogger.SetLastNodeGuid("95b31ed9-af0a-49e7-8bfa-8471d379cdff");
    _Login1VAT.Enter_Password("_tr_7Wn6SO");
    

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
    _AgentsSelect.Enter_AgentName("iusto");
    

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
    _ClientSelect.Enter_ClientName("qui");
    

    TestModellerLogger.SetLastNodeGuid("ed3e4750-33a4-4d75-a14c-9d75935c79c7");
    _ClientSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("e537c9d6-4166-4745-b27e-a178d69d2884");
    _ClientSelect.Click_SelectClient();
    

pages.DebitNoteSToFRS _DebitNoteSToFRS = new pages.DebitNoteSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("a9ac356a-1ff8-48d1-98c6-5613b1e1ba5a");
    _DebitNoteSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("281ed0ae-1966-4313-83f9-f02959a1af8f");
    _DebitNoteSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f4ead229-e1a6-4686-9726-2a8d72975380");
    _DebitNoteSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("13d7978e-e074-45d2-8c0b-01b123aa6311");
    _DebitNoteSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("e0eca6d7-6b04-416d-855d-2a9e825dcd28");
    _DebitNoteSToFRS.Click_NewDebitNote();
    

    TestModellerLogger.SetLastNodeGuid("190c6323-be0b-4dd1-b552-dbe6423a4af8");
    _DebitNoteSToFRS.Select_SupplierName("ABCSupplier");
    

    TestModellerLogger.SetLastNodeGuid("c9f1fef7-60b9-4d4b-a4a0-825e5638fb6e");
    _DebitNoteSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("a8f7d6e5-89f8-4f36-a154-0755a90aa5e9");
    _DebitNoteSToFRS.Enter_Date("44250");
    

    TestModellerLogger.SetLastNodeGuid("d0e22573-153e-435a-8026-8e497c35f9ee");
    _DebitNoteSToFRS.Select_ExpenseType("Insurance");
    

    TestModellerLogger.SetLastNodeGuid("3f663a04-c82a-4f31-a2c8-3238da8ddb0c");
    _DebitNoteSToFRS.Enter_Description("Omnis numquam quae rerum omnis.
Omnis ipsum ex autem similique odit tempore.
Distinctio magni sapiente qui et accusantium cupiditate.
Aut ut est quo molestiae dolorem qui quidem fugit maxime.
Natus quibusdam rerum dignissimos.
Fugit dolorum occaecati praesentium omnis maiores.
Possimus ut quaerat quia.
Ipsam et sequi veritatis minus iste velit ratione.
Porro tempore tenetur ut porro soluta dolorem eveniet aut facere.
Est voluptatum laborum dignissimos molestias veritatis eius illum.");
    

    TestModellerLogger.SetLastNodeGuid("3b383dc0-235e-4780-9859-f151196feb92");
    _DebitNoteSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("62f8964d-0533-4137-b19f-ed7484c16874");
    _DebitNoteSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("0c1c1062-a24e-491f-b466-c4f25be009dc");
    _DebitNoteSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("df34f121-e6c7-4386-b83d-071d26d7877e");
    _DebitNoteSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("d9ad9e73-0fa4-4130-8856-5d6c154b68b4");
    _DebitNoteSToFRS.Enter_Amount_Net("100");
    

    TestModellerLogger.SetLastNodeGuid("afe47079-aab8-40ac-8075-8edfd92c146a");
    _DebitNoteSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("093d78cf-a676-401c-9139-02e7e7db005f");
    _DebitNoteSToFRS.Click__Save_();
    

    }

    @Test  (groups= {"ScriptDebitNoteSToFRS","ScriptDebitNoteSToFRS - Default Profile"})
    @TestModellerPath(guid = "d816dbd4-daf6-46ad-a8aa-7d05ec2305ac")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlC15()
    {
        
        pages.Login1VAT _Login1VAT = new pages.Login1VAT(driver);
    TestModellerLogger.SetLastNodeGuid("93e4a214-3f97-41d2-8063-dd91c879e847");
    _Login1VAT.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7eff8b4c-1e47-48a4-bcad-b3639d0cdfd5");
    _Login1VAT.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ceaa193b-d8c0-48f9-911f-018e2571da20");
    _Login1VAT.Enter_UserName("Serenity_Harris96");
    

    TestModellerLogger.SetLastNodeGuid("95b31ed9-af0a-49e7-8bfa-8471d379cdff");
    _Login1VAT.Enter_Password("vIBZ5VW_TN");
    

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
    _AgentsSelect.Enter_AgentName("porro");
    

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
    

pages.DebitNoteSToFRS _DebitNoteSToFRS = new pages.DebitNoteSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("a9ac356a-1ff8-48d1-98c6-5613b1e1ba5a");
    _DebitNoteSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("281ed0ae-1966-4313-83f9-f02959a1af8f");
    _DebitNoteSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f4ead229-e1a6-4686-9726-2a8d72975380");
    _DebitNoteSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("13d7978e-e074-45d2-8c0b-01b123aa6311");
    _DebitNoteSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("e0eca6d7-6b04-416d-855d-2a9e825dcd28");
    _DebitNoteSToFRS.Click_NewDebitNote();
    

    TestModellerLogger.SetLastNodeGuid("190c6323-be0b-4dd1-b552-dbe6423a4af8");
    _DebitNoteSToFRS.Select_SupplierName("ABCSupplier");
    

    TestModellerLogger.SetLastNodeGuid("c9f1fef7-60b9-4d4b-a4a0-825e5638fb6e");
    _DebitNoteSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("a8f7d6e5-89f8-4f36-a154-0755a90aa5e9");
    _DebitNoteSToFRS.Enter_Date("44250");
    

    TestModellerLogger.SetLastNodeGuid("d0e22573-153e-435a-8026-8e497c35f9ee");
    _DebitNoteSToFRS.Select_ExpenseType("Membership and subscriptions");
    

    TestModellerLogger.SetLastNodeGuid("3f663a04-c82a-4f31-a2c8-3238da8ddb0c");
    _DebitNoteSToFRS.Enter_Description("Similique aut veritatis nemo velit eos eos molestias praesentium ut.
Magnam quo iste libero laboriosam deserunt atque aspernatur pariatur.
Corporis amet qui.
Labore placeat minima sint dolor reprehenderit.
Numquam dolores itaque tenetur nesciunt excepturi magnam doloremque consequatur nesciunt.
Consectetur deleniti asperiores debitis.
Neque ut rerum vel qui unde earum.
Molestiae nam debitis quia fugit.
Doloribus veniam culpa eos aperiam numquam dolorum.
Sit vitae incidunt et nulla nulla sed asperiores.");
    

    TestModellerLogger.SetLastNodeGuid("3b383dc0-235e-4780-9859-f151196feb92");
    _DebitNoteSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("62f8964d-0533-4137-b19f-ed7484c16874");
    _DebitNoteSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("0c1c1062-a24e-491f-b466-c4f25be009dc");
    _DebitNoteSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("df34f121-e6c7-4386-b83d-071d26d7877e");
    _DebitNoteSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("d9ad9e73-0fa4-4130-8856-5d6c154b68b4");
    _DebitNoteSToFRS.Enter_Amount_Net("100");
    

    TestModellerLogger.SetLastNodeGuid("afe47079-aab8-40ac-8075-8edfd92c146a");
    _DebitNoteSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("093d78cf-a676-401c-9139-02e7e7db005f");
    _DebitNoteSToFRS.Click__Save_();
    

    }

    @Test  (groups= {"ScriptDebitNoteSToFRS","ScriptDebitNoteSToFRS - Default Profile"})
    @TestModellerPath(guid = "00723c77-2f16-4f2e-8022-2e580a1437cc")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlC16()
    {
        
        pages.Login1VAT _Login1VAT = new pages.Login1VAT(driver);
    TestModellerLogger.SetLastNodeGuid("93e4a214-3f97-41d2-8063-dd91c879e847");
    _Login1VAT.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7eff8b4c-1e47-48a4-bcad-b3639d0cdfd5");
    _Login1VAT.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ceaa193b-d8c0-48f9-911f-018e2571da20");
    _Login1VAT.Enter_UserName("Dallas59");
    

    TestModellerLogger.SetLastNodeGuid("95b31ed9-af0a-49e7-8bfa-8471d379cdff");
    _Login1VAT.Enter_Password("KikMaE2GWz");
    

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
    _AgentsSelect.Enter_AgentName("perferendis");
    

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
    _ClientSelect.Enter_ClientName("dolore");
    

    TestModellerLogger.SetLastNodeGuid("ed3e4750-33a4-4d75-a14c-9d75935c79c7");
    _ClientSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("e537c9d6-4166-4745-b27e-a178d69d2884");
    _ClientSelect.Click_SelectClient();
    

pages.DebitNoteSToFRS _DebitNoteSToFRS = new pages.DebitNoteSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("a9ac356a-1ff8-48d1-98c6-5613b1e1ba5a");
    _DebitNoteSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("281ed0ae-1966-4313-83f9-f02959a1af8f");
    _DebitNoteSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f4ead229-e1a6-4686-9726-2a8d72975380");
    _DebitNoteSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("13d7978e-e074-45d2-8c0b-01b123aa6311");
    _DebitNoteSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("e0eca6d7-6b04-416d-855d-2a9e825dcd28");
    _DebitNoteSToFRS.Click_NewDebitNote();
    

    TestModellerLogger.SetLastNodeGuid("190c6323-be0b-4dd1-b552-dbe6423a4af8");
    _DebitNoteSToFRS.Select_SupplierName("ABCSupplier");
    

    TestModellerLogger.SetLastNodeGuid("c9f1fef7-60b9-4d4b-a4a0-825e5638fb6e");
    _DebitNoteSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("a8f7d6e5-89f8-4f36-a154-0755a90aa5e9");
    _DebitNoteSToFRS.Enter_Date("44250");
    

    TestModellerLogger.SetLastNodeGuid("d0e22573-153e-435a-8026-8e497c35f9ee");
    _DebitNoteSToFRS.Select_ExpenseType("Postage, stationery, office supplies");
    

    TestModellerLogger.SetLastNodeGuid("3f663a04-c82a-4f31-a2c8-3238da8ddb0c");
    _DebitNoteSToFRS.Enter_Description("Sint nihil ipsum.
Laborum dolorum a distinctio aut ducimus quisquam et qui sit.
Explicabo ratione recusandae placeat odio vel a laudantium.
Illo consequatur minima consequatur expedita rerum.
Eligendi dignissimos voluptatem voluptatem nihil cum numquam vel.
Voluptatum cumque sit tempore saepe.
Doloribus aliquam ut laudantium non.
Quod adipisci ut.
A autem pariatur est laboriosam deserunt consequatur doloremque omnis doloremque.
Iusto dolor ad esse recusandae omnis.");
    

    TestModellerLogger.SetLastNodeGuid("3b383dc0-235e-4780-9859-f151196feb92");
    _DebitNoteSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("62f8964d-0533-4137-b19f-ed7484c16874");
    _DebitNoteSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("0c1c1062-a24e-491f-b466-c4f25be009dc");
    _DebitNoteSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("df34f121-e6c7-4386-b83d-071d26d7877e");
    _DebitNoteSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("d9ad9e73-0fa4-4130-8856-5d6c154b68b4");
    _DebitNoteSToFRS.Enter_Amount_Net("100");
    

    TestModellerLogger.SetLastNodeGuid("afe47079-aab8-40ac-8075-8edfd92c146a");
    _DebitNoteSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("093d78cf-a676-401c-9139-02e7e7db005f");
    _DebitNoteSToFRS.Click__Save_();
    

    }

    @Test  (groups= {"ScriptDebitNoteSToFRS","ScriptDebitNoteSToFRS - Default Profile"})
    @TestModellerPath(guid = "e1246d52-9057-4da7-9839-a501bafa45a0")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlC17()
    {
        
        pages.Login1VAT _Login1VAT = new pages.Login1VAT(driver);
    TestModellerLogger.SetLastNodeGuid("93e4a214-3f97-41d2-8063-dd91c879e847");
    _Login1VAT.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7eff8b4c-1e47-48a4-bcad-b3639d0cdfd5");
    _Login1VAT.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ceaa193b-d8c0-48f9-911f-018e2571da20");
    _Login1VAT.Enter_UserName("Amelie70");
    

    TestModellerLogger.SetLastNodeGuid("95b31ed9-af0a-49e7-8bfa-8471d379cdff");
    _Login1VAT.Enter_Password("kGmPzBXqDS");
    

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
    _AgentsSelect.Enter_AgentName("earum");
    

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
    _ClientSelect.Enter_ClientName("vitae");
    

    TestModellerLogger.SetLastNodeGuid("ed3e4750-33a4-4d75-a14c-9d75935c79c7");
    _ClientSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("e537c9d6-4166-4745-b27e-a178d69d2884");
    _ClientSelect.Click_SelectClient();
    

pages.DebitNoteSToFRS _DebitNoteSToFRS = new pages.DebitNoteSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("a9ac356a-1ff8-48d1-98c6-5613b1e1ba5a");
    _DebitNoteSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("281ed0ae-1966-4313-83f9-f02959a1af8f");
    _DebitNoteSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f4ead229-e1a6-4686-9726-2a8d72975380");
    _DebitNoteSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("13d7978e-e074-45d2-8c0b-01b123aa6311");
    _DebitNoteSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("e0eca6d7-6b04-416d-855d-2a9e825dcd28");
    _DebitNoteSToFRS.Click_NewDebitNote();
    

    TestModellerLogger.SetLastNodeGuid("190c6323-be0b-4dd1-b552-dbe6423a4af8");
    _DebitNoteSToFRS.Select_SupplierName("ABCSupplier");
    

    TestModellerLogger.SetLastNodeGuid("c9f1fef7-60b9-4d4b-a4a0-825e5638fb6e");
    _DebitNoteSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("a8f7d6e5-89f8-4f36-a154-0755a90aa5e9");
    _DebitNoteSToFRS.Enter_Date("44250");
    

    TestModellerLogger.SetLastNodeGuid("d0e22573-153e-435a-8026-8e497c35f9ee");
    _DebitNoteSToFRS.Select_ExpenseType("Professional, consultancy and legal fees");
    

    TestModellerLogger.SetLastNodeGuid("3f663a04-c82a-4f31-a2c8-3238da8ddb0c");
    _DebitNoteSToFRS.Enter_Description("Consectetur totam rerum commodi est tenetur rerum eligendi voluptatem voluptates.
Rerum iste architecto eligendi quae mollitia unde veniam ut.
Sit dolorem nemo neque.
Voluptatem velit vel laborum quia beatae ipsum.
Doloribus consequatur non similique omnis et architecto.
Fuga aut dolorum maxime praesentium hic.
Qui qui ipsa nam perferendis qui consequatur ullam.
Sed sit quidem est debitis ut id.
Est consequatur dicta rerum sint accusantium assumenda repellendus nesciunt.
Natus veniam est quam magni consequatur dolores libero.");
    

    TestModellerLogger.SetLastNodeGuid("3b383dc0-235e-4780-9859-f151196feb92");
    _DebitNoteSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("62f8964d-0533-4137-b19f-ed7484c16874");
    _DebitNoteSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("0c1c1062-a24e-491f-b466-c4f25be009dc");
    _DebitNoteSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("df34f121-e6c7-4386-b83d-071d26d7877e");
    _DebitNoteSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("d9ad9e73-0fa4-4130-8856-5d6c154b68b4");
    _DebitNoteSToFRS.Enter_Amount_Net("100");
    

    TestModellerLogger.SetLastNodeGuid("afe47079-aab8-40ac-8075-8edfd92c146a");
    _DebitNoteSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("093d78cf-a676-401c-9139-02e7e7db005f");
    _DebitNoteSToFRS.Click__Save_();
    

    }

    @Test  (groups= {"ScriptDebitNoteSToFRS","ScriptDebitNoteSToFRS - Default Profile"})
    @TestModellerPath(guid = "94e91065-2163-4862-a350-d324366dff9f")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlC18()
    {
        
        pages.Login1VAT _Login1VAT = new pages.Login1VAT(driver);
    TestModellerLogger.SetLastNodeGuid("93e4a214-3f97-41d2-8063-dd91c879e847");
    _Login1VAT.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7eff8b4c-1e47-48a4-bcad-b3639d0cdfd5");
    _Login1VAT.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ceaa193b-d8c0-48f9-911f-018e2571da20");
    _Login1VAT.Enter_UserName("Jovanny_Schaefer");
    

    TestModellerLogger.SetLastNodeGuid("95b31ed9-af0a-49e7-8bfa-8471d379cdff");
    _Login1VAT.Enter_Password("zlsChQgfpB");
    

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
    _AgentsSelect.Enter_AgentName("dolores");
    

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
    _ClientSelect.Enter_ClientName("natus");
    

    TestModellerLogger.SetLastNodeGuid("ed3e4750-33a4-4d75-a14c-9d75935c79c7");
    _ClientSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("e537c9d6-4166-4745-b27e-a178d69d2884");
    _ClientSelect.Click_SelectClient();
    

pages.DebitNoteSToFRS _DebitNoteSToFRS = new pages.DebitNoteSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("a9ac356a-1ff8-48d1-98c6-5613b1e1ba5a");
    _DebitNoteSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("281ed0ae-1966-4313-83f9-f02959a1af8f");
    _DebitNoteSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f4ead229-e1a6-4686-9726-2a8d72975380");
    _DebitNoteSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("13d7978e-e074-45d2-8c0b-01b123aa6311");
    _DebitNoteSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("e0eca6d7-6b04-416d-855d-2a9e825dcd28");
    _DebitNoteSToFRS.Click_NewDebitNote();
    

    TestModellerLogger.SetLastNodeGuid("190c6323-be0b-4dd1-b552-dbe6423a4af8");
    _DebitNoteSToFRS.Select_SupplierName("ABCSupplier");
    

    TestModellerLogger.SetLastNodeGuid("c9f1fef7-60b9-4d4b-a4a0-825e5638fb6e");
    _DebitNoteSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("a8f7d6e5-89f8-4f36-a154-0755a90aa5e9");
    _DebitNoteSToFRS.Enter_Date("44250");
    

    TestModellerLogger.SetLastNodeGuid("d0e22573-153e-435a-8026-8e497c35f9ee");
    _DebitNoteSToFRS.Select_ExpenseType("Staff welfare");
    

    TestModellerLogger.SetLastNodeGuid("3f663a04-c82a-4f31-a2c8-3238da8ddb0c");
    _DebitNoteSToFRS.Enter_Description("Fugiat ut blanditiis et.
Et quibusdam enim aut at repellat dignissimos perferendis necessitatibus.
Ab ut adipisci quia placeat id autem laborum sit.
Autem error distinctio.
Molestiae est consectetur voluptatum.
At ducimus cum quas.
Ipsa asperiores eos provident nemo qui ut dolores.
Qui perspiciatis deserunt.
Suscipit suscipit ut praesentium.
Enim voluptas dignissimos veritatis dolores.");
    

    TestModellerLogger.SetLastNodeGuid("3b383dc0-235e-4780-9859-f151196feb92");
    _DebitNoteSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("62f8964d-0533-4137-b19f-ed7484c16874");
    _DebitNoteSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("0c1c1062-a24e-491f-b466-c4f25be009dc");
    _DebitNoteSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("df34f121-e6c7-4386-b83d-071d26d7877e");
    _DebitNoteSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("d9ad9e73-0fa4-4130-8856-5d6c154b68b4");
    _DebitNoteSToFRS.Enter_Amount_Net("100");
    

    TestModellerLogger.SetLastNodeGuid("afe47079-aab8-40ac-8075-8edfd92c146a");
    _DebitNoteSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("093d78cf-a676-401c-9139-02e7e7db005f");
    _DebitNoteSToFRS.Click__Save_();
    

    }

    @Test  (groups= {"ScriptDebitNoteSToFRS","ScriptDebitNoteSToFRS - Default Profile"})
    @TestModellerPath(guid = "83feaa20-89a3-4a43-b6a5-a20520587a68")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlC19()
    {
        
        pages.Login1VAT _Login1VAT = new pages.Login1VAT(driver);
    TestModellerLogger.SetLastNodeGuid("93e4a214-3f97-41d2-8063-dd91c879e847");
    _Login1VAT.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7eff8b4c-1e47-48a4-bcad-b3639d0cdfd5");
    _Login1VAT.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ceaa193b-d8c0-48f9-911f-018e2571da20");
    _Login1VAT.Enter_UserName("Arlene.Keebler");
    

    TestModellerLogger.SetLastNodeGuid("95b31ed9-af0a-49e7-8bfa-8471d379cdff");
    _Login1VAT.Enter_Password("fE2lDmU46Y");
    

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
    _AgentsSelect.Enter_AgentName("perferendis");
    

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
    

pages.DebitNoteSToFRS _DebitNoteSToFRS = new pages.DebitNoteSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("a9ac356a-1ff8-48d1-98c6-5613b1e1ba5a");
    _DebitNoteSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("281ed0ae-1966-4313-83f9-f02959a1af8f");
    _DebitNoteSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f4ead229-e1a6-4686-9726-2a8d72975380");
    _DebitNoteSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("13d7978e-e074-45d2-8c0b-01b123aa6311");
    _DebitNoteSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("e0eca6d7-6b04-416d-855d-2a9e825dcd28");
    _DebitNoteSToFRS.Click_NewDebitNote();
    

    TestModellerLogger.SetLastNodeGuid("190c6323-be0b-4dd1-b552-dbe6423a4af8");
    _DebitNoteSToFRS.Select_SupplierName("ABCSupplier");
    

    TestModellerLogger.SetLastNodeGuid("c9f1fef7-60b9-4d4b-a4a0-825e5638fb6e");
    _DebitNoteSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("a8f7d6e5-89f8-4f36-a154-0755a90aa5e9");
    _DebitNoteSToFRS.Enter_Date("44250");
    

    TestModellerLogger.SetLastNodeGuid("d0e22573-153e-435a-8026-8e497c35f9ee");
    _DebitNoteSToFRS.Select_ExpenseType("Sundry expenses");
    

    TestModellerLogger.SetLastNodeGuid("3f663a04-c82a-4f31-a2c8-3238da8ddb0c");
    _DebitNoteSToFRS.Enter_Description("Quas architecto harum sit in at qui animi qui sunt.
Quod incidunt voluptatibus vero voluptas in.
Perferendis similique dolorum accusantium.
Ipsum eum cum ipsum culpa.
Laborum illo voluptates sed error iste veritatis laudantium fuga.
Tenetur eum ad quidem et ut voluptatem.
Sit eveniet reiciendis ut beatae.
Doloribus quaerat voluptatum dolorem laudantium.
Ut nobis error aut repellendus eaque dolores.
Nam nihil quibusdam ullam tenetur quisquam veritatis.");
    

    TestModellerLogger.SetLastNodeGuid("3b383dc0-235e-4780-9859-f151196feb92");
    _DebitNoteSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("62f8964d-0533-4137-b19f-ed7484c16874");
    _DebitNoteSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("0c1c1062-a24e-491f-b466-c4f25be009dc");
    _DebitNoteSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("df34f121-e6c7-4386-b83d-071d26d7877e");
    _DebitNoteSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("d9ad9e73-0fa4-4130-8856-5d6c154b68b4");
    _DebitNoteSToFRS.Enter_Amount_Net("100");
    

    TestModellerLogger.SetLastNodeGuid("afe47079-aab8-40ac-8075-8edfd92c146a");
    _DebitNoteSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("093d78cf-a676-401c-9139-02e7e7db005f");
    _DebitNoteSToFRS.Click__Save_();
    

    }

    @Test  (groups= {"ScriptDebitNoteSToFRS","ScriptDebitNoteSToFRS - Default Profile"})
    @TestModellerPath(guid = "4d721bc8-9721-475d-b171-3d31d411213d")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlC20()
    {
        
        pages.Login1VAT _Login1VAT = new pages.Login1VAT(driver);
    TestModellerLogger.SetLastNodeGuid("93e4a214-3f97-41d2-8063-dd91c879e847");
    _Login1VAT.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7eff8b4c-1e47-48a4-bcad-b3639d0cdfd5");
    _Login1VAT.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ceaa193b-d8c0-48f9-911f-018e2571da20");
    _Login1VAT.Enter_UserName("Lolita70");
    

    TestModellerLogger.SetLastNodeGuid("95b31ed9-af0a-49e7-8bfa-8471d379cdff");
    _Login1VAT.Enter_Password("CgLoFJBUG4");
    

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
    _AgentsSelect.Enter_AgentName("eum");
    

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
    

pages.DebitNoteSToFRS _DebitNoteSToFRS = new pages.DebitNoteSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("a9ac356a-1ff8-48d1-98c6-5613b1e1ba5a");
    _DebitNoteSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("281ed0ae-1966-4313-83f9-f02959a1af8f");
    _DebitNoteSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f4ead229-e1a6-4686-9726-2a8d72975380");
    _DebitNoteSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("13d7978e-e074-45d2-8c0b-01b123aa6311");
    _DebitNoteSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("e0eca6d7-6b04-416d-855d-2a9e825dcd28");
    _DebitNoteSToFRS.Click_NewDebitNote();
    

    TestModellerLogger.SetLastNodeGuid("190c6323-be0b-4dd1-b552-dbe6423a4af8");
    _DebitNoteSToFRS.Select_SupplierName("ABCSupplier");
    

    TestModellerLogger.SetLastNodeGuid("c9f1fef7-60b9-4d4b-a4a0-825e5638fb6e");
    _DebitNoteSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("a8f7d6e5-89f8-4f36-a154-0755a90aa5e9");
    _DebitNoteSToFRS.Enter_Date("44250");
    

    TestModellerLogger.SetLastNodeGuid("d0e22573-153e-435a-8026-8e497c35f9ee");
    _DebitNoteSToFRS.Select_ExpenseType("Telephone, internet and broadband");
    

    TestModellerLogger.SetLastNodeGuid("3f663a04-c82a-4f31-a2c8-3238da8ddb0c");
    _DebitNoteSToFRS.Enter_Description("Rem at quia voluptatum atque.
Possimus aspernatur cum ipsam ex veniam dolore.
Dicta qui voluptatem optio sint eligendi aut voluptatibus odio veritatis.
Voluptas ea laboriosam error ullam fugiat quia autem voluptatum officiis.
Quibusdam est quia voluptas incidunt qui qui.
Et minima sapiente.
Repellat esse id quam dicta sunt.
Corrupti esse ratione ut sequi voluptatem.
Sed autem atque ut quos est.
Unde voluptatem ut.");
    

    TestModellerLogger.SetLastNodeGuid("3b383dc0-235e-4780-9859-f151196feb92");
    _DebitNoteSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("62f8964d-0533-4137-b19f-ed7484c16874");
    _DebitNoteSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("0c1c1062-a24e-491f-b466-c4f25be009dc");
    _DebitNoteSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("df34f121-e6c7-4386-b83d-071d26d7877e");
    _DebitNoteSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("d9ad9e73-0fa4-4130-8856-5d6c154b68b4");
    _DebitNoteSToFRS.Enter_Amount_Net("100");
    

    TestModellerLogger.SetLastNodeGuid("afe47079-aab8-40ac-8075-8edfd92c146a");
    _DebitNoteSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("093d78cf-a676-401c-9139-02e7e7db005f");
    _DebitNoteSToFRS.Click__Save_();
    

    }

    @Test  (groups= {"ScriptDebitNoteSToFRS","ScriptDebitNoteSToFRS - Default Profile"})
    @TestModellerPath(guid = "063d2bb2-4892-4628-9632-cb9bbb7fec7d")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlC21()
    {
        
        pages.Login1VAT _Login1VAT = new pages.Login1VAT(driver);
    TestModellerLogger.SetLastNodeGuid("93e4a214-3f97-41d2-8063-dd91c879e847");
    _Login1VAT.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7eff8b4c-1e47-48a4-bcad-b3639d0cdfd5");
    _Login1VAT.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ceaa193b-d8c0-48f9-911f-018e2571da20");
    _Login1VAT.Enter_UserName("Dario_Jacobson40");
    

    TestModellerLogger.SetLastNodeGuid("95b31ed9-af0a-49e7-8bfa-8471d379cdff");
    _Login1VAT.Enter_Password("Z0KbO_wGov");
    

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
    _AgentsSelect.Enter_AgentName("distinctio");
    

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
    _ClientSelect.Enter_ClientName("deserunt");
    

    TestModellerLogger.SetLastNodeGuid("ed3e4750-33a4-4d75-a14c-9d75935c79c7");
    _ClientSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("e537c9d6-4166-4745-b27e-a178d69d2884");
    _ClientSelect.Click_SelectClient();
    

pages.DebitNoteSToFRS _DebitNoteSToFRS = new pages.DebitNoteSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("a9ac356a-1ff8-48d1-98c6-5613b1e1ba5a");
    _DebitNoteSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("281ed0ae-1966-4313-83f9-f02959a1af8f");
    _DebitNoteSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f4ead229-e1a6-4686-9726-2a8d72975380");
    _DebitNoteSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("13d7978e-e074-45d2-8c0b-01b123aa6311");
    _DebitNoteSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("e0eca6d7-6b04-416d-855d-2a9e825dcd28");
    _DebitNoteSToFRS.Click_NewDebitNote();
    

    TestModellerLogger.SetLastNodeGuid("190c6323-be0b-4dd1-b552-dbe6423a4af8");
    _DebitNoteSToFRS.Select_SupplierName("ABCSupplier");
    

    TestModellerLogger.SetLastNodeGuid("c9f1fef7-60b9-4d4b-a4a0-825e5638fb6e");
    _DebitNoteSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("a8f7d6e5-89f8-4f36-a154-0755a90aa5e9");
    _DebitNoteSToFRS.Enter_Date("44250");
    

    TestModellerLogger.SetLastNodeGuid("d0e22573-153e-435a-8026-8e497c35f9ee");
    _DebitNoteSToFRS.Select_ExpenseType("Travel and overseas travelling");
    

    TestModellerLogger.SetLastNodeGuid("3f663a04-c82a-4f31-a2c8-3238da8ddb0c");
    _DebitNoteSToFRS.Enter_Description("Sed et sit dolorem et vel.
Assumenda unde vel.
Consectetur nisi ducimus reprehenderit velit quae suscipit aut dicta.
Consequatur optio rerum autem quis architecto iure illum.
Sed enim soluta.
Molestiae quis ex non magnam est magnam quasi.
Quasi accusamus quia et eveniet possimus ea consequatur cumque.
Consequatur id fugit.
Ullam autem numquam quod distinctio hic voluptatum dolor sint excepturi.
Sit sit nulla fugiat vitae praesentium quo in.");
    

    TestModellerLogger.SetLastNodeGuid("3b383dc0-235e-4780-9859-f151196feb92");
    _DebitNoteSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("62f8964d-0533-4137-b19f-ed7484c16874");
    _DebitNoteSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("0c1c1062-a24e-491f-b466-c4f25be009dc");
    _DebitNoteSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("df34f121-e6c7-4386-b83d-071d26d7877e");
    _DebitNoteSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("d9ad9e73-0fa4-4130-8856-5d6c154b68b4");
    _DebitNoteSToFRS.Enter_Amount_Net("100");
    

    TestModellerLogger.SetLastNodeGuid("afe47079-aab8-40ac-8075-8edfd92c146a");
    _DebitNoteSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("093d78cf-a676-401c-9139-02e7e7db005f");
    _DebitNoteSToFRS.Click__Save_();
    

    }

    @Test  (groups= {"ScriptDebitNoteSToFRS","ScriptDebitNoteSToFRS - Default Profile"})
    @TestModellerPath(guid = "fdad8c5d-0ccc-4531-9b04-52e97de4dfb0")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlC22()
    {
        
        pages.Login1VAT _Login1VAT = new pages.Login1VAT(driver);
    TestModellerLogger.SetLastNodeGuid("93e4a214-3f97-41d2-8063-dd91c879e847");
    _Login1VAT.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7eff8b4c-1e47-48a4-bcad-b3639d0cdfd5");
    _Login1VAT.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ceaa193b-d8c0-48f9-911f-018e2571da20");
    _Login1VAT.Enter_UserName("Rita_Stokes");
    

    TestModellerLogger.SetLastNodeGuid("95b31ed9-af0a-49e7-8bfa-8471d379cdff");
    _Login1VAT.Enter_Password("9TYjoBPwU4");
    

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
    _AgentsSelect.Enter_AgentName("dolore");
    

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
    

pages.DebitNoteSToFRS _DebitNoteSToFRS = new pages.DebitNoteSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("a9ac356a-1ff8-48d1-98c6-5613b1e1ba5a");
    _DebitNoteSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("281ed0ae-1966-4313-83f9-f02959a1af8f");
    _DebitNoteSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f4ead229-e1a6-4686-9726-2a8d72975380");
    _DebitNoteSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("13d7978e-e074-45d2-8c0b-01b123aa6311");
    _DebitNoteSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("e0eca6d7-6b04-416d-855d-2a9e825dcd28");
    _DebitNoteSToFRS.Click_NewDebitNote();
    

    TestModellerLogger.SetLastNodeGuid("190c6323-be0b-4dd1-b552-dbe6423a4af8");
    _DebitNoteSToFRS.Select_SupplierName("ABCSupplier");
    

    TestModellerLogger.SetLastNodeGuid("c9f1fef7-60b9-4d4b-a4a0-825e5638fb6e");
    _DebitNoteSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("a8f7d6e5-89f8-4f36-a154-0755a90aa5e9");
    _DebitNoteSToFRS.Enter_Date("44250");
    

    TestModellerLogger.SetLastNodeGuid("d0e22573-153e-435a-8026-8e497c35f9ee");
    _DebitNoteSToFRS.Select_ExpenseType("Commercial vehicles additions");
    

    TestModellerLogger.SetLastNodeGuid("3f663a04-c82a-4f31-a2c8-3238da8ddb0c");
    _DebitNoteSToFRS.Enter_Description("Iure necessitatibus ex.
Earum debitis id sint provident et est ipsum.
Ut voluptas quis possimus.
Similique doloremque dolores est cum ex voluptas.
Nihil id temporibus repellat quae omnis et praesentium possimus.
Distinctio tenetur porro exercitationem saepe itaque ipsum rerum.
Et omnis nisi sunt voluptas vitae atque.
Natus fuga laborum numquam alias.
Ipsum quia dolores est provident similique explicabo molestiae cumque.
Officia et et quo.");
    

    TestModellerLogger.SetLastNodeGuid("3b383dc0-235e-4780-9859-f151196feb92");
    _DebitNoteSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("62f8964d-0533-4137-b19f-ed7484c16874");
    _DebitNoteSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("0c1c1062-a24e-491f-b466-c4f25be009dc");
    _DebitNoteSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("df34f121-e6c7-4386-b83d-071d26d7877e");
    _DebitNoteSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("d9ad9e73-0fa4-4130-8856-5d6c154b68b4");
    _DebitNoteSToFRS.Enter_Amount_Net("100");
    

    TestModellerLogger.SetLastNodeGuid("afe47079-aab8-40ac-8075-8edfd92c146a");
    _DebitNoteSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("093d78cf-a676-401c-9139-02e7e7db005f");
    _DebitNoteSToFRS.Click__Save_();
    

    }

    @Test  (groups= {"ScriptDebitNoteSToFRS","ScriptDebitNoteSToFRS - Default Profile"})
    @TestModellerPath(guid = "f476edac-acc3-4f8c-84e6-b58d39cfdbd8")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlC23()
    {
        
        pages.Login1VAT _Login1VAT = new pages.Login1VAT(driver);
    TestModellerLogger.SetLastNodeGuid("93e4a214-3f97-41d2-8063-dd91c879e847");
    _Login1VAT.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7eff8b4c-1e47-48a4-bcad-b3639d0cdfd5");
    _Login1VAT.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ceaa193b-d8c0-48f9-911f-018e2571da20");
    _Login1VAT.Enter_UserName("Ford.Lebsack56");
    

    TestModellerLogger.SetLastNodeGuid("95b31ed9-af0a-49e7-8bfa-8471d379cdff");
    _Login1VAT.Enter_Password("Bwdzed4WZm");
    

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
    _AgentsSelect.Enter_AgentName("hic");
    

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
    _ClientSelect.Enter_ClientName("et");
    

    TestModellerLogger.SetLastNodeGuid("ed3e4750-33a4-4d75-a14c-9d75935c79c7");
    _ClientSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("e537c9d6-4166-4745-b27e-a178d69d2884");
    _ClientSelect.Click_SelectClient();
    

pages.DebitNoteSToFRS _DebitNoteSToFRS = new pages.DebitNoteSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("a9ac356a-1ff8-48d1-98c6-5613b1e1ba5a");
    _DebitNoteSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("281ed0ae-1966-4313-83f9-f02959a1af8f");
    _DebitNoteSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f4ead229-e1a6-4686-9726-2a8d72975380");
    _DebitNoteSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("13d7978e-e074-45d2-8c0b-01b123aa6311");
    _DebitNoteSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("e0eca6d7-6b04-416d-855d-2a9e825dcd28");
    _DebitNoteSToFRS.Click_NewDebitNote();
    

    TestModellerLogger.SetLastNodeGuid("190c6323-be0b-4dd1-b552-dbe6423a4af8");
    _DebitNoteSToFRS.Select_SupplierName("ABCSupplier");
    

    TestModellerLogger.SetLastNodeGuid("c9f1fef7-60b9-4d4b-a4a0-825e5638fb6e");
    _DebitNoteSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("a8f7d6e5-89f8-4f36-a154-0755a90aa5e9");
    _DebitNoteSToFRS.Enter_Date("44250");
    

    TestModellerLogger.SetLastNodeGuid("d0e22573-153e-435a-8026-8e497c35f9ee");
    _DebitNoteSToFRS.Select_ExpenseType("Commercial vehicles cost b/f");
    

    TestModellerLogger.SetLastNodeGuid("3f663a04-c82a-4f31-a2c8-3238da8ddb0c");
    _DebitNoteSToFRS.Enter_Description("Qui occaecati distinctio magni unde sed omnis numquam quidem.
Quam in inventore magni quas.
Minima est quasi molestiae.
Perferendis molestiae nesciunt.
Neque illum dolorum cumque et consequatur.
Et et quasi et ut libero nostrum voluptatem autem nisi.
Rem nihil omnis hic incidunt aut rerum rerum sint ratione.
Assumenda magni explicabo et facilis.
Corporis eos excepturi voluptatem ipsam sed.
Adipisci inventore iusto ipsum est.");
    

    TestModellerLogger.SetLastNodeGuid("3b383dc0-235e-4780-9859-f151196feb92");
    _DebitNoteSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("62f8964d-0533-4137-b19f-ed7484c16874");
    _DebitNoteSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("0c1c1062-a24e-491f-b466-c4f25be009dc");
    _DebitNoteSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("df34f121-e6c7-4386-b83d-071d26d7877e");
    _DebitNoteSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("d9ad9e73-0fa4-4130-8856-5d6c154b68b4");
    _DebitNoteSToFRS.Enter_Amount_Net("100");
    

    TestModellerLogger.SetLastNodeGuid("afe47079-aab8-40ac-8075-8edfd92c146a");
    _DebitNoteSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("093d78cf-a676-401c-9139-02e7e7db005f");
    _DebitNoteSToFRS.Click__Save_();
    

    }

    @Test  (groups= {"ScriptDebitNoteSToFRS","ScriptDebitNoteSToFRS - Default Profile"})
    @TestModellerPath(guid = "f0587baa-2c34-446c-879e-0d36f36cbf40")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlC24()
    {
        
        pages.Login1VAT _Login1VAT = new pages.Login1VAT(driver);
    TestModellerLogger.SetLastNodeGuid("93e4a214-3f97-41d2-8063-dd91c879e847");
    _Login1VAT.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7eff8b4c-1e47-48a4-bcad-b3639d0cdfd5");
    _Login1VAT.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ceaa193b-d8c0-48f9-911f-018e2571da20");
    _Login1VAT.Enter_UserName("Dina_Kertzmann");
    

    TestModellerLogger.SetLastNodeGuid("95b31ed9-af0a-49e7-8bfa-8471d379cdff");
    _Login1VAT.Enter_Password("eyLvp6oytH");
    

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
    _AgentsSelect.Enter_AgentName("nihil");
    

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
    _ClientSelect.Enter_ClientName("quo");
    

    TestModellerLogger.SetLastNodeGuid("ed3e4750-33a4-4d75-a14c-9d75935c79c7");
    _ClientSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("e537c9d6-4166-4745-b27e-a178d69d2884");
    _ClientSelect.Click_SelectClient();
    

pages.DebitNoteSToFRS _DebitNoteSToFRS = new pages.DebitNoteSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("a9ac356a-1ff8-48d1-98c6-5613b1e1ba5a");
    _DebitNoteSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("281ed0ae-1966-4313-83f9-f02959a1af8f");
    _DebitNoteSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f4ead229-e1a6-4686-9726-2a8d72975380");
    _DebitNoteSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("13d7978e-e074-45d2-8c0b-01b123aa6311");
    _DebitNoteSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("e0eca6d7-6b04-416d-855d-2a9e825dcd28");
    _DebitNoteSToFRS.Click_NewDebitNote();
    

    TestModellerLogger.SetLastNodeGuid("190c6323-be0b-4dd1-b552-dbe6423a4af8");
    _DebitNoteSToFRS.Select_SupplierName("ABCSupplier");
    

    TestModellerLogger.SetLastNodeGuid("c9f1fef7-60b9-4d4b-a4a0-825e5638fb6e");
    _DebitNoteSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("a8f7d6e5-89f8-4f36-a154-0755a90aa5e9");
    _DebitNoteSToFRS.Enter_Date("44250");
    

    TestModellerLogger.SetLastNodeGuid("d0e22573-153e-435a-8026-8e497c35f9ee");
    _DebitNoteSToFRS.Select_ExpenseType("Commercial vehicles depreciation");
    

    TestModellerLogger.SetLastNodeGuid("3f663a04-c82a-4f31-a2c8-3238da8ddb0c");
    _DebitNoteSToFRS.Enter_Description("Voluptatum doloremque quo incidunt perspiciatis autem ut temporibus sint.
Et deleniti voluptatem sapiente qui incidunt exercitationem.
Facere totam ratione velit voluptates earum.
Excepturi animi enim rerum quia voluptatem commodi.
Sed consequatur soluta explicabo.
Quia nihil harum reiciendis cumque sit natus qui inventore.
Doloremque fugit aspernatur atque eos doloremque facilis.
Sed eveniet soluta.
Consectetur sapiente voluptas.
Laudantium iusto aliquid qui tenetur.");
    

    TestModellerLogger.SetLastNodeGuid("3b383dc0-235e-4780-9859-f151196feb92");
    _DebitNoteSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("62f8964d-0533-4137-b19f-ed7484c16874");
    _DebitNoteSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("0c1c1062-a24e-491f-b466-c4f25be009dc");
    _DebitNoteSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("df34f121-e6c7-4386-b83d-071d26d7877e");
    _DebitNoteSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("d9ad9e73-0fa4-4130-8856-5d6c154b68b4");
    _DebitNoteSToFRS.Enter_Amount_Net("100");
    

    TestModellerLogger.SetLastNodeGuid("afe47079-aab8-40ac-8075-8edfd92c146a");
    _DebitNoteSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("093d78cf-a676-401c-9139-02e7e7db005f");
    _DebitNoteSToFRS.Click__Save_();
    

    }

    @Test  (groups= {"ScriptDebitNoteSToFRS","ScriptDebitNoteSToFRS - Default Profile"})
    @TestModellerPath(guid = "46c522f7-76ca-4ef9-a07e-9b8f55eae8e3")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlC25()
    {
        
        pages.Login1VAT _Login1VAT = new pages.Login1VAT(driver);
    TestModellerLogger.SetLastNodeGuid("93e4a214-3f97-41d2-8063-dd91c879e847");
    _Login1VAT.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7eff8b4c-1e47-48a4-bcad-b3639d0cdfd5");
    _Login1VAT.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ceaa193b-d8c0-48f9-911f-018e2571da20");
    _Login1VAT.Enter_UserName("Liana_Gutkowski32");
    

    TestModellerLogger.SetLastNodeGuid("95b31ed9-af0a-49e7-8bfa-8471d379cdff");
    _Login1VAT.Enter_Password("g0VdU53hwc");
    

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
    _AgentsSelect.Enter_AgentName("soluta");
    

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
    _ClientSelect.Enter_ClientName("earum");
    

    TestModellerLogger.SetLastNodeGuid("ed3e4750-33a4-4d75-a14c-9d75935c79c7");
    _ClientSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("e537c9d6-4166-4745-b27e-a178d69d2884");
    _ClientSelect.Click_SelectClient();
    

pages.DebitNoteSToFRS _DebitNoteSToFRS = new pages.DebitNoteSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("a9ac356a-1ff8-48d1-98c6-5613b1e1ba5a");
    _DebitNoteSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("281ed0ae-1966-4313-83f9-f02959a1af8f");
    _DebitNoteSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f4ead229-e1a6-4686-9726-2a8d72975380");
    _DebitNoteSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("13d7978e-e074-45d2-8c0b-01b123aa6311");
    _DebitNoteSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("e0eca6d7-6b04-416d-855d-2a9e825dcd28");
    _DebitNoteSToFRS.Click_NewDebitNote();
    

    TestModellerLogger.SetLastNodeGuid("190c6323-be0b-4dd1-b552-dbe6423a4af8");
    _DebitNoteSToFRS.Select_SupplierName("ABCSupplier");
    

    TestModellerLogger.SetLastNodeGuid("c9f1fef7-60b9-4d4b-a4a0-825e5638fb6e");
    _DebitNoteSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("a8f7d6e5-89f8-4f36-a154-0755a90aa5e9");
    _DebitNoteSToFRS.Enter_Date("44250");
    

    TestModellerLogger.SetLastNodeGuid("d0e22573-153e-435a-8026-8e497c35f9ee");
    _DebitNoteSToFRS.Select_ExpenseType("Commercial vehicles depreciation b/f");
    

    TestModellerLogger.SetLastNodeGuid("3f663a04-c82a-4f31-a2c8-3238da8ddb0c");
    _DebitNoteSToFRS.Enter_Description("Molestiae sed voluptas fugiat.
Impedit qui vel aspernatur.
Et et fugiat beatae nam tempora.
Iste earum error.
Sit ipsum ut tempore.
Ea porro quia aut.
Culpa voluptatem reiciendis libero.
Vel velit deleniti ex iure.
Qui culpa consequuntur quisquam aut voluptatem et.
Magnam voluptatem perferendis ratione.");
    

    TestModellerLogger.SetLastNodeGuid("3b383dc0-235e-4780-9859-f151196feb92");
    _DebitNoteSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("62f8964d-0533-4137-b19f-ed7484c16874");
    _DebitNoteSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("0c1c1062-a24e-491f-b466-c4f25be009dc");
    _DebitNoteSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("df34f121-e6c7-4386-b83d-071d26d7877e");
    _DebitNoteSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("d9ad9e73-0fa4-4130-8856-5d6c154b68b4");
    _DebitNoteSToFRS.Enter_Amount_Net("100");
    

    TestModellerLogger.SetLastNodeGuid("afe47079-aab8-40ac-8075-8edfd92c146a");
    _DebitNoteSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("093d78cf-a676-401c-9139-02e7e7db005f");
    _DebitNoteSToFRS.Click__Save_();
    

    }

    @Test  (groups= {"ScriptDebitNoteSToFRS","ScriptDebitNoteSToFRS - Default Profile"})
    @TestModellerPath(guid = "8f0458a6-fc7d-43e9-88ff-f334b50405fe")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlC26()
    {
        
        pages.Login1VAT _Login1VAT = new pages.Login1VAT(driver);
    TestModellerLogger.SetLastNodeGuid("93e4a214-3f97-41d2-8063-dd91c879e847");
    _Login1VAT.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7eff8b4c-1e47-48a4-bcad-b3639d0cdfd5");
    _Login1VAT.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ceaa193b-d8c0-48f9-911f-018e2571da20");
    _Login1VAT.Enter_UserName("Van_Bogan");
    

    TestModellerLogger.SetLastNodeGuid("95b31ed9-af0a-49e7-8bfa-8471d379cdff");
    _Login1VAT.Enter_Password("Qa5lLbWJmt");
    

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
    _AgentsSelect.Enter_AgentName("rem");
    

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
    _ClientSelect.Enter_ClientName("molestias");
    

    TestModellerLogger.SetLastNodeGuid("ed3e4750-33a4-4d75-a14c-9d75935c79c7");
    _ClientSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("e537c9d6-4166-4745-b27e-a178d69d2884");
    _ClientSelect.Click_SelectClient();
    

pages.DebitNoteSToFRS _DebitNoteSToFRS = new pages.DebitNoteSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("a9ac356a-1ff8-48d1-98c6-5613b1e1ba5a");
    _DebitNoteSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("281ed0ae-1966-4313-83f9-f02959a1af8f");
    _DebitNoteSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f4ead229-e1a6-4686-9726-2a8d72975380");
    _DebitNoteSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("13d7978e-e074-45d2-8c0b-01b123aa6311");
    _DebitNoteSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("e0eca6d7-6b04-416d-855d-2a9e825dcd28");
    _DebitNoteSToFRS.Click_NewDebitNote();
    

    TestModellerLogger.SetLastNodeGuid("190c6323-be0b-4dd1-b552-dbe6423a4af8");
    _DebitNoteSToFRS.Select_SupplierName("ABCSupplier");
    

    TestModellerLogger.SetLastNodeGuid("c9f1fef7-60b9-4d4b-a4a0-825e5638fb6e");
    _DebitNoteSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("a8f7d6e5-89f8-4f36-a154-0755a90aa5e9");
    _DebitNoteSToFRS.Enter_Date("44250");
    

    TestModellerLogger.SetLastNodeGuid("d0e22573-153e-435a-8026-8e497c35f9ee");
    _DebitNoteSToFRS.Select_ExpenseType("Commercial vehicles depreciation disposals");
    

    TestModellerLogger.SetLastNodeGuid("3f663a04-c82a-4f31-a2c8-3238da8ddb0c");
    _DebitNoteSToFRS.Enter_Description("Doloremque explicabo neque doloremque.
Perferendis quaerat asperiores non atque.
Vero voluptate eum esse ut beatae officia quia soluta animi.
Aut hic consequuntur aspernatur sint repudiandae at.
Similique ipsum eaque nihil aliquam porro aperiam ducimus alias autem.
Officia consequatur facilis quibusdam sequi.
Esse quibusdam ut amet nihil aut quaerat facilis odio.
Numquam ut aliquam explicabo ut qui ut repudiandae facere illum.
Consequuntur optio accusamus et qui quibusdam molestiae aut modi laudantium.
Aut et et fugit.");
    

    TestModellerLogger.SetLastNodeGuid("3b383dc0-235e-4780-9859-f151196feb92");
    _DebitNoteSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("62f8964d-0533-4137-b19f-ed7484c16874");
    _DebitNoteSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("0c1c1062-a24e-491f-b466-c4f25be009dc");
    _DebitNoteSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("df34f121-e6c7-4386-b83d-071d26d7877e");
    _DebitNoteSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("d9ad9e73-0fa4-4130-8856-5d6c154b68b4");
    _DebitNoteSToFRS.Enter_Amount_Net("100");
    

    TestModellerLogger.SetLastNodeGuid("afe47079-aab8-40ac-8075-8edfd92c146a");
    _DebitNoteSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("093d78cf-a676-401c-9139-02e7e7db005f");
    _DebitNoteSToFRS.Click__Save_();
    

    }

    @Test  (groups= {"ScriptDebitNoteSToFRS","ScriptDebitNoteSToFRS - Default Profile"})
    @TestModellerPath(guid = "a92f9fbe-38c5-48bb-aa33-9f7eac53bc0d")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlC27()
    {
        
        pages.Login1VAT _Login1VAT = new pages.Login1VAT(driver);
    TestModellerLogger.SetLastNodeGuid("93e4a214-3f97-41d2-8063-dd91c879e847");
    _Login1VAT.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7eff8b4c-1e47-48a4-bcad-b3639d0cdfd5");
    _Login1VAT.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ceaa193b-d8c0-48f9-911f-018e2571da20");
    _Login1VAT.Enter_UserName("Creola.Sauer");
    

    TestModellerLogger.SetLastNodeGuid("95b31ed9-af0a-49e7-8bfa-8471d379cdff");
    _Login1VAT.Enter_Password("lpKGyRPjqo");
    

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
    _AgentsSelect.Enter_AgentName("officia");
    

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
    _ClientSelect.Enter_ClientName("numquam");
    

    TestModellerLogger.SetLastNodeGuid("ed3e4750-33a4-4d75-a14c-9d75935c79c7");
    _ClientSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("e537c9d6-4166-4745-b27e-a178d69d2884");
    _ClientSelect.Click_SelectClient();
    

pages.DebitNoteSToFRS _DebitNoteSToFRS = new pages.DebitNoteSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("a9ac356a-1ff8-48d1-98c6-5613b1e1ba5a");
    _DebitNoteSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("281ed0ae-1966-4313-83f9-f02959a1af8f");
    _DebitNoteSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f4ead229-e1a6-4686-9726-2a8d72975380");
    _DebitNoteSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("13d7978e-e074-45d2-8c0b-01b123aa6311");
    _DebitNoteSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("e0eca6d7-6b04-416d-855d-2a9e825dcd28");
    _DebitNoteSToFRS.Click_NewDebitNote();
    

    TestModellerLogger.SetLastNodeGuid("190c6323-be0b-4dd1-b552-dbe6423a4af8");
    _DebitNoteSToFRS.Select_SupplierName("ABCSupplier");
    

    TestModellerLogger.SetLastNodeGuid("c9f1fef7-60b9-4d4b-a4a0-825e5638fb6e");
    _DebitNoteSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("a8f7d6e5-89f8-4f36-a154-0755a90aa5e9");
    _DebitNoteSToFRS.Enter_Date("44250");
    

    TestModellerLogger.SetLastNodeGuid("d0e22573-153e-435a-8026-8e497c35f9ee");
    _DebitNoteSToFRS.Select_ExpenseType("Commercial vehicles depreciation revaluation");
    

    TestModellerLogger.SetLastNodeGuid("3f663a04-c82a-4f31-a2c8-3238da8ddb0c");
    _DebitNoteSToFRS.Enter_Description("Qui adipisci omnis dolor illum minus qui unde placeat.
Voluptates ducimus dolores qui ipsa.
Accusamus nostrum aspernatur deleniti iste.
Dolor fugiat quidem numquam occaecati veritatis molestiae perferendis mollitia.
Quidem dignissimos assumenda natus.
Sed enim sapiente.
Beatae quo sint.
Error dicta id aut rerum quis non.
Doloremque ut corporis.
Rerum ratione animi.");
    

    TestModellerLogger.SetLastNodeGuid("3b383dc0-235e-4780-9859-f151196feb92");
    _DebitNoteSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("62f8964d-0533-4137-b19f-ed7484c16874");
    _DebitNoteSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("0c1c1062-a24e-491f-b466-c4f25be009dc");
    _DebitNoteSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("df34f121-e6c7-4386-b83d-071d26d7877e");
    _DebitNoteSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("d9ad9e73-0fa4-4130-8856-5d6c154b68b4");
    _DebitNoteSToFRS.Enter_Amount_Net("100");
    

    TestModellerLogger.SetLastNodeGuid("afe47079-aab8-40ac-8075-8edfd92c146a");
    _DebitNoteSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("093d78cf-a676-401c-9139-02e7e7db005f");
    _DebitNoteSToFRS.Click__Save_();
    

    }

    @Test  (groups= {"ScriptDebitNoteSToFRS","ScriptDebitNoteSToFRS - Default Profile"})
    @TestModellerPath(guid = "15d036af-b579-4d62-aa3f-5e7f6e728871")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlC28()
    {
        
        pages.Login1VAT _Login1VAT = new pages.Login1VAT(driver);
    TestModellerLogger.SetLastNodeGuid("93e4a214-3f97-41d2-8063-dd91c879e847");
    _Login1VAT.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7eff8b4c-1e47-48a4-bcad-b3639d0cdfd5");
    _Login1VAT.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ceaa193b-d8c0-48f9-911f-018e2571da20");
    _Login1VAT.Enter_UserName("Eli_Grady13");
    

    TestModellerLogger.SetLastNodeGuid("95b31ed9-af0a-49e7-8bfa-8471d379cdff");
    _Login1VAT.Enter_Password("bfctxJEvcM");
    

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
    _ClientSelect.Enter_ClientName("quia");
    

    TestModellerLogger.SetLastNodeGuid("ed3e4750-33a4-4d75-a14c-9d75935c79c7");
    _ClientSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("e537c9d6-4166-4745-b27e-a178d69d2884");
    _ClientSelect.Click_SelectClient();
    

pages.DebitNoteSToFRS _DebitNoteSToFRS = new pages.DebitNoteSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("a9ac356a-1ff8-48d1-98c6-5613b1e1ba5a");
    _DebitNoteSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("281ed0ae-1966-4313-83f9-f02959a1af8f");
    _DebitNoteSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f4ead229-e1a6-4686-9726-2a8d72975380");
    _DebitNoteSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("13d7978e-e074-45d2-8c0b-01b123aa6311");
    _DebitNoteSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("e0eca6d7-6b04-416d-855d-2a9e825dcd28");
    _DebitNoteSToFRS.Click_NewDebitNote();
    

    TestModellerLogger.SetLastNodeGuid("190c6323-be0b-4dd1-b552-dbe6423a4af8");
    _DebitNoteSToFRS.Select_SupplierName("ABCSupplier");
    

    TestModellerLogger.SetLastNodeGuid("c9f1fef7-60b9-4d4b-a4a0-825e5638fb6e");
    _DebitNoteSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("a8f7d6e5-89f8-4f36-a154-0755a90aa5e9");
    _DebitNoteSToFRS.Enter_Date("44250");
    

    TestModellerLogger.SetLastNodeGuid("d0e22573-153e-435a-8026-8e497c35f9ee");
    _DebitNoteSToFRS.Select_ExpenseType("Commercial vehicles depreciation transfers");
    

    TestModellerLogger.SetLastNodeGuid("3f663a04-c82a-4f31-a2c8-3238da8ddb0c");
    _DebitNoteSToFRS.Enter_Description("Dolorum id nobis soluta vel est a atque exercitationem.
Reiciendis eos et voluptatum alias distinctio ipsam architecto.
Dolor tenetur quis rerum.
Numquam id non totam ut explicabo.
Quo maxime quis.
Aut fugiat quo placeat in dolor.
Ut nihil incidunt debitis mollitia possimus corporis ea.
Architecto rem iusto consequatur suscipit explicabo ullam laudantium.
Deleniti quos earum velit.
Ut reprehenderit ratione sit eveniet eum deleniti.");
    

    TestModellerLogger.SetLastNodeGuid("3b383dc0-235e-4780-9859-f151196feb92");
    _DebitNoteSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("62f8964d-0533-4137-b19f-ed7484c16874");
    _DebitNoteSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("0c1c1062-a24e-491f-b466-c4f25be009dc");
    _DebitNoteSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("df34f121-e6c7-4386-b83d-071d26d7877e");
    _DebitNoteSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("d9ad9e73-0fa4-4130-8856-5d6c154b68b4");
    _DebitNoteSToFRS.Enter_Amount_Net("100");
    

    TestModellerLogger.SetLastNodeGuid("afe47079-aab8-40ac-8075-8edfd92c146a");
    _DebitNoteSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("093d78cf-a676-401c-9139-02e7e7db005f");
    _DebitNoteSToFRS.Click__Save_();
    

    }

    @Test  (groups= {"ScriptDebitNoteSToFRS","ScriptDebitNoteSToFRS - Default Profile"})
    @TestModellerPath(guid = "39f0e80f-0a64-4e61-9c67-eb59dde0e228")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlC29()
    {
        
        pages.Login1VAT _Login1VAT = new pages.Login1VAT(driver);
    TestModellerLogger.SetLastNodeGuid("93e4a214-3f97-41d2-8063-dd91c879e847");
    _Login1VAT.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7eff8b4c-1e47-48a4-bcad-b3639d0cdfd5");
    _Login1VAT.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ceaa193b-d8c0-48f9-911f-018e2571da20");
    _Login1VAT.Enter_UserName("Sheila_Reichel98");
    

    TestModellerLogger.SetLastNodeGuid("95b31ed9-af0a-49e7-8bfa-8471d379cdff");
    _Login1VAT.Enter_Password("XbU8Mcxg4r");
    

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
    _AgentsSelect.Enter_AgentName("blanditiis");
    

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
    _ClientSelect.Enter_ClientName("dolore");
    

    TestModellerLogger.SetLastNodeGuid("ed3e4750-33a4-4d75-a14c-9d75935c79c7");
    _ClientSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("e537c9d6-4166-4745-b27e-a178d69d2884");
    _ClientSelect.Click_SelectClient();
    

pages.DebitNoteSToFRS _DebitNoteSToFRS = new pages.DebitNoteSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("a9ac356a-1ff8-48d1-98c6-5613b1e1ba5a");
    _DebitNoteSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("281ed0ae-1966-4313-83f9-f02959a1af8f");
    _DebitNoteSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f4ead229-e1a6-4686-9726-2a8d72975380");
    _DebitNoteSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("13d7978e-e074-45d2-8c0b-01b123aa6311");
    _DebitNoteSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("e0eca6d7-6b04-416d-855d-2a9e825dcd28");
    _DebitNoteSToFRS.Click_NewDebitNote();
    

    TestModellerLogger.SetLastNodeGuid("190c6323-be0b-4dd1-b552-dbe6423a4af8");
    _DebitNoteSToFRS.Select_SupplierName("ABCSupplier");
    

    TestModellerLogger.SetLastNodeGuid("c9f1fef7-60b9-4d4b-a4a0-825e5638fb6e");
    _DebitNoteSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("a8f7d6e5-89f8-4f36-a154-0755a90aa5e9");
    _DebitNoteSToFRS.Enter_Date("44250");
    

    TestModellerLogger.SetLastNodeGuid("d0e22573-153e-435a-8026-8e497c35f9ee");
    _DebitNoteSToFRS.Select_ExpenseType("Commercial vehicles disposals");
    

    TestModellerLogger.SetLastNodeGuid("3f663a04-c82a-4f31-a2c8-3238da8ddb0c");
    _DebitNoteSToFRS.Enter_Description("Alias voluptas itaque recusandae sequi suscipit aut blanditiis.
Sit laudantium voluptatibus labore.
Voluptatum quia consequatur provident quis.
Sint nostrum soluta ratione explicabo delectus atque.
Id voluptate provident voluptatem placeat quod.
Deleniti qui nesciunt ratione consequuntur adipisci.
Voluptas omnis id.
Doloremque beatae libero eveniet necessitatibus exercitationem odit dolor.
Impedit facilis autem voluptas consectetur pariatur natus porro possimus.
Enim incidunt dolores debitis asperiores qui pariatur iure.");
    

    TestModellerLogger.SetLastNodeGuid("3b383dc0-235e-4780-9859-f151196feb92");
    _DebitNoteSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("62f8964d-0533-4137-b19f-ed7484c16874");
    _DebitNoteSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("0c1c1062-a24e-491f-b466-c4f25be009dc");
    _DebitNoteSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("df34f121-e6c7-4386-b83d-071d26d7877e");
    _DebitNoteSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("d9ad9e73-0fa4-4130-8856-5d6c154b68b4");
    _DebitNoteSToFRS.Enter_Amount_Net("100");
    

    TestModellerLogger.SetLastNodeGuid("afe47079-aab8-40ac-8075-8edfd92c146a");
    _DebitNoteSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("093d78cf-a676-401c-9139-02e7e7db005f");
    _DebitNoteSToFRS.Click__Save_();
    

    }

    @Test  (groups= {"ScriptDebitNoteSToFRS","ScriptDebitNoteSToFRS - Default Profile"})
    @TestModellerPath(guid = "6307efd3-5958-4022-8fd1-70299a25415c")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlC30()
    {
        
        pages.Login1VAT _Login1VAT = new pages.Login1VAT(driver);
    TestModellerLogger.SetLastNodeGuid("93e4a214-3f97-41d2-8063-dd91c879e847");
    _Login1VAT.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7eff8b4c-1e47-48a4-bcad-b3639d0cdfd5");
    _Login1VAT.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ceaa193b-d8c0-48f9-911f-018e2571da20");
    _Login1VAT.Enter_UserName("Marina.Jacobson69");
    

    TestModellerLogger.SetLastNodeGuid("95b31ed9-af0a-49e7-8bfa-8471d379cdff");
    _Login1VAT.Enter_Password("h4kBxOHEtt");
    

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
    _ClientSelect.Enter_ClientName("sint");
    

    TestModellerLogger.SetLastNodeGuid("ed3e4750-33a4-4d75-a14c-9d75935c79c7");
    _ClientSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("e537c9d6-4166-4745-b27e-a178d69d2884");
    _ClientSelect.Click_SelectClient();
    

pages.DebitNoteSToFRS _DebitNoteSToFRS = new pages.DebitNoteSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("a9ac356a-1ff8-48d1-98c6-5613b1e1ba5a");
    _DebitNoteSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("281ed0ae-1966-4313-83f9-f02959a1af8f");
    _DebitNoteSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f4ead229-e1a6-4686-9726-2a8d72975380");
    _DebitNoteSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("13d7978e-e074-45d2-8c0b-01b123aa6311");
    _DebitNoteSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("e0eca6d7-6b04-416d-855d-2a9e825dcd28");
    _DebitNoteSToFRS.Click_NewDebitNote();
    

    TestModellerLogger.SetLastNodeGuid("190c6323-be0b-4dd1-b552-dbe6423a4af8");
    _DebitNoteSToFRS.Select_SupplierName("ABCSupplier");
    

    TestModellerLogger.SetLastNodeGuid("c9f1fef7-60b9-4d4b-a4a0-825e5638fb6e");
    _DebitNoteSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("a8f7d6e5-89f8-4f36-a154-0755a90aa5e9");
    _DebitNoteSToFRS.Enter_Date("44250");
    

    TestModellerLogger.SetLastNodeGuid("d0e22573-153e-435a-8026-8e497c35f9ee");
    _DebitNoteSToFRS.Select_ExpenseType("Commercial vehicles revaluation");
    

    TestModellerLogger.SetLastNodeGuid("3f663a04-c82a-4f31-a2c8-3238da8ddb0c");
    _DebitNoteSToFRS.Enter_Description("Saepe sapiente et velit laudantium.
Ea omnis voluptas sint ut quae ut non est quo.
Voluptatem tenetur ad quidem nemo sunt odit.
Qui provident sed cum ipsum ipsa.
Eos iusto sint placeat quisquam vel autem aliquam dignissimos dolor.
Et esse voluptatem voluptatem similique sequi nesciunt quia provident et.
Impedit officia reprehenderit vel maiores quasi ea sed aut libero.
Voluptas amet sed perferendis aut fugit.
Earum cumque eum at.
Sit est neque dolores sapiente ab.");
    

    TestModellerLogger.SetLastNodeGuid("3b383dc0-235e-4780-9859-f151196feb92");
    _DebitNoteSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("62f8964d-0533-4137-b19f-ed7484c16874");
    _DebitNoteSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("0c1c1062-a24e-491f-b466-c4f25be009dc");
    _DebitNoteSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("df34f121-e6c7-4386-b83d-071d26d7877e");
    _DebitNoteSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("d9ad9e73-0fa4-4130-8856-5d6c154b68b4");
    _DebitNoteSToFRS.Enter_Amount_Net("100");
    

    TestModellerLogger.SetLastNodeGuid("afe47079-aab8-40ac-8075-8edfd92c146a");
    _DebitNoteSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("093d78cf-a676-401c-9139-02e7e7db005f");
    _DebitNoteSToFRS.Click__Save_();
    

    }*/

}
