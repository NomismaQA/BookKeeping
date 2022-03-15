package test.ashiv;

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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/cd595c1c-b4bc-4b89-8958-3e764a2f8732
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1844, profileId = 102369)
public class TestSupplierList_TestCases extends TestBase
{
	
	String sTestCaseID=null;
	String[] data=null;
	String Sheet = null;

    
    @Test  (groups= {"Test_Supplier_List","Test_Supplier_List - Test Cases"})
    @TestModellerPath(guid = "b421e3a7-766b-4238-81a3-af28b1719e06")
    public void GoToUrlAssertUrlClickExpenditure1ClickView2ClickSupplierList3PositiveSelectCategorySearch4Ent() throws InterruptedException, InvalidFormatException
    {
    	
    	sTestCaseID="TC19";
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

    

    TestModellerLogger.SetLastNodeGuid("ff5edd38-07b0-452b-95d6-f33e07e1e975");
    _ClientSelect.Click_ClientsTAB();
    

    TestModellerLogger.SetLastNodeGuid("14a94a5a-c1ac-4e4f-afd4-69a84ffa5a24");
    _ClientSelect.Enter_ClientName(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("ed3e4750-33a4-4d75-a14c-9d75935c79c7");
    _ClientSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("e537c9d6-4166-4745-b27e-a178d69d2884");
    _ClientSelect.Click_SelectClient();
        
        As_Supplier.SupplierList _SupplierList = new As_Supplier.SupplierList(driver);
        
//    TestModellerLogger.SetLastNodeGuid("6606f792-ce73-46bd-a5e1-adb4816ea7ad");
//    _SupplierList.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("c27a0602-656a-45fc-819f-a4e287cd3bba");
//    _SupplierList.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("85988836-cee8-442f-8667-7912641cd55d");
    _SupplierList.Click_Expenditure1();
    

    TestModellerLogger.SetLastNodeGuid("d22faf0f-87d5-4908-8735-d9359cde36e4");
    _SupplierList.Click_View2();
    

    TestModellerLogger.SetLastNodeGuid("8c80aafd-8b2e-4930-8c5f-ad65ed8ca448");
    _SupplierList.Click_Supplier_List_3();
    

    TestModellerLogger.SetLastNodeGuid("98d5f0a2-0aa4-412f-97c5-8c8a30449239");
    _SupplierList.Select_Category_Search4(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("dc5d5b0d-633b-4499-8fc3-eeced31cb3b5");
    _SupplierList.Enter_Enter_Test_to_Search5(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("6cc7f2b6-ce5d-4a25-9100-76b3822b80c0");
    _SupplierList.Click_SearchBtn_6();
    
    
    
    
  //  _SupplierList.All_Supplier();
    
    }
    
    @Test  (groups= {"Test_Supplier_List","Test_Supplier_List - Test Cases"})
    @TestModellerPath(guid = "b421e3a7-766b-4238-81a3-af28b1719e06")
    public void GoToUrlAssertUrlClickExpenditure1ClickView2ClickSupplierList3PositiveSelectCategorySearch4Ent_1() throws InterruptedException, InvalidFormatException
    {
    	
    	sTestCaseID="TC19";
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

    

    TestModellerLogger.SetLastNodeGuid("ff5edd38-07b0-452b-95d6-f33e07e1e975");
    _ClientSelect.Click_ClientsTAB();
    

    TestModellerLogger.SetLastNodeGuid("14a94a5a-c1ac-4e4f-afd4-69a84ffa5a24");
    _ClientSelect.Enter_ClientName(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("ed3e4750-33a4-4d75-a14c-9d75935c79c7");
    _ClientSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("e537c9d6-4166-4745-b27e-a178d69d2884");
    _ClientSelect.Click_SelectClient();
        
        As_Supplier.SupplierList _SupplierList = new As_Supplier.SupplierList(driver);
        
//    TestModellerLogger.SetLastNodeGuid("6606f792-ce73-46bd-a5e1-adb4816ea7ad");
//    _SupplierList.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("c27a0602-656a-45fc-819f-a4e287cd3bba");
//    _SupplierList.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("85988836-cee8-442f-8667-7912641cd55d");
    _SupplierList.Click_Expenditure1();
    

    TestModellerLogger.SetLastNodeGuid("d22faf0f-87d5-4908-8735-d9359cde36e4");
    _SupplierList.Click_View2();
    

    TestModellerLogger.SetLastNodeGuid("8c80aafd-8b2e-4930-8c5f-ad65ed8ca448");
    _SupplierList.Click_Supplier_List_3();
    
    
    TestModellerLogger.SetLastNodeGuid("9b7de803-6d7c-485c-886f-8fb340104c72");
    _SupplierList.Click_Add_SupplierBtn7();
    
    _SupplierList.Enter_EnterSupplierName8(data[7]);
    
    TestModellerLogger.SetLastNodeGuid("310a8534-114c-472c-9572-d56eb10b79cd");
    _SupplierList.Click_SaveBtn9();
    
    }
    @Test  (groups= {"Test_Supplier_List","Test_Supplier_List - Test Cases"})
    @TestModellerPath(guid = "b421e3a7-766b-4238-81a3-af28b1719e06")
    public void GoToUrlAssertUrlClickExpenditure1ClickView2ClickSupplierList3PositiveSelectCategorySearch4Ent_2() throws InterruptedException, InvalidFormatException
    {
    	
    	sTestCaseID="TC19";
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

    

    TestModellerLogger.SetLastNodeGuid("ff5edd38-07b0-452b-95d6-f33e07e1e975");
    _ClientSelect.Click_ClientsTAB();
    

    TestModellerLogger.SetLastNodeGuid("14a94a5a-c1ac-4e4f-afd4-69a84ffa5a24");
    _ClientSelect.Enter_ClientName(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("ed3e4750-33a4-4d75-a14c-9d75935c79c7");
    _ClientSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("e537c9d6-4166-4745-b27e-a178d69d2884");
    _ClientSelect.Click_SelectClient();
        
        As_Supplier.SupplierList _SupplierList = new As_Supplier.SupplierList(driver);
        
//    TestModellerLogger.SetLastNodeGuid("6606f792-ce73-46bd-a5e1-adb4816ea7ad");
//    _SupplierList.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("c27a0602-656a-45fc-819f-a4e287cd3bba");
//    _SupplierList.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("85988836-cee8-442f-8667-7912641cd55d");
    _SupplierList.Click_Expenditure1();
    

    TestModellerLogger.SetLastNodeGuid("d22faf0f-87d5-4908-8735-d9359cde36e4");
    _SupplierList.Click_View2();
    

    TestModellerLogger.SetLastNodeGuid("8c80aafd-8b2e-4930-8c5f-ad65ed8ca448");
    _SupplierList.Click_Supplier_List_3();
    

    TestModellerLogger.SetLastNodeGuid("bc2e046f-78b2-4574-abc2-135d84145d16");
    _SupplierList.Click_Edit_SupplierBtn10();
    
    _SupplierList.Enter_Enter_Edit_Supplier_Name11(data[8]);

    TestModellerLogger.SetLastNodeGuid("9cd2921c-107c-4277-9a8c-3b707424860f");
    _SupplierList.Click_SaveBtn12();
    }
    
    @Test  (groups= {"Test_Supplier_List","Test_Supplier_List - Test Cases"})
    @TestModellerPath(guid = "b421e3a7-766b-4238-81a3-af28b1719e06")
    public void GoToUrlAssertUrlClickExpenditure1ClickView2ClickSupplierList3PositiveSelectCategorySearch4Ent_3() throws InterruptedException, InvalidFormatException
    {
    	
    	sTestCaseID="TC19";
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

    

    TestModellerLogger.SetLastNodeGuid("ff5edd38-07b0-452b-95d6-f33e07e1e975");
    _ClientSelect.Click_ClientsTAB();
    

    TestModellerLogger.SetLastNodeGuid("14a94a5a-c1ac-4e4f-afd4-69a84ffa5a24");
    _ClientSelect.Enter_ClientName(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("ed3e4750-33a4-4d75-a14c-9d75935c79c7");
    _ClientSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("e537c9d6-4166-4745-b27e-a178d69d2884");
    _ClientSelect.Click_SelectClient();
        
        As_Supplier.SupplierList _SupplierList = new As_Supplier.SupplierList(driver);
        
//    TestModellerLogger.SetLastNodeGuid("6606f792-ce73-46bd-a5e1-adb4816ea7ad");
//    _SupplierList.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("c27a0602-656a-45fc-819f-a4e287cd3bba");
//    _SupplierList.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("85988836-cee8-442f-8667-7912641cd55d");
    _SupplierList.Click_Expenditure1();
    

    TestModellerLogger.SetLastNodeGuid("d22faf0f-87d5-4908-8735-d9359cde36e4");
    _SupplierList.Click_View2();
    

    TestModellerLogger.SetLastNodeGuid("8c80aafd-8b2e-4930-8c5f-ad65ed8ca448");
    _SupplierList.Click_Supplier_List_3();

    TestModellerLogger.SetLastNodeGuid("6b2893ca-b88f-42bb-9412-2cde59a21726");
    _SupplierList.Click_DeleteBtn13();
    
    }
    
    @Test  (groups= {"Test_Supplier_List","Test_Supplier_List - Test Cases"})
    @TestModellerPath(guid = "b421e3a7-766b-4238-81a3-af28b1719e06")
    public void GoToUrlAssertUrlClickExpenditure1ClickView2ClickSupplierList3PositiveSelectCategorySearch4Ent_4() throws InterruptedException, InvalidFormatException
    {
    	
    	sTestCaseID="TC19";
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

    

    TestModellerLogger.SetLastNodeGuid("ff5edd38-07b0-452b-95d6-f33e07e1e975");
    _ClientSelect.Click_ClientsTAB();
    

    TestModellerLogger.SetLastNodeGuid("14a94a5a-c1ac-4e4f-afd4-69a84ffa5a24");
    _ClientSelect.Enter_ClientName(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("ed3e4750-33a4-4d75-a14c-9d75935c79c7");
    _ClientSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("e537c9d6-4166-4745-b27e-a178d69d2884");
    _ClientSelect.Click_SelectClient();
        
        As_Supplier.SupplierList _SupplierList = new As_Supplier.SupplierList(driver);
        
//    TestModellerLogger.SetLastNodeGuid("6606f792-ce73-46bd-a5e1-adb4816ea7ad");
//    _SupplierList.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("c27a0602-656a-45fc-819f-a4e287cd3bba");
//    _SupplierList.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("85988836-cee8-442f-8667-7912641cd55d");
    _SupplierList.Click_Expenditure1();
    

    TestModellerLogger.SetLastNodeGuid("d22faf0f-87d5-4908-8735-d9359cde36e4");
    _SupplierList.Click_View2();
    

    TestModellerLogger.SetLastNodeGuid("8c80aafd-8b2e-4930-8c5f-ad65ed8ca448");
    _SupplierList.Click_Supplier_List_3();
    
    TestModellerLogger.SetLastNodeGuid("2f8db58b-4d7e-4c69-ae78-d2e0b6d28052");
    _SupplierList.Click_Download_Csv14();
    
    
    _SupplierList.UploadFile("D:\\New folder\\SupplierBatchUploadSample.csv");
    
    }
    
    @Test  (groups= {"Test_Supplier_List","Test_Supplier_List - Test Cases"})
    @TestModellerPath(guid = "b421e3a7-766b-4238-81a3-af28b1719e06")
    public void GoToUrlAssertUrlClickExpenditure1ClickView2ClickSupplierList3PositiveSelectCategorySearch4Ent_5() throws InterruptedException, InvalidFormatException
    {
    	
    	sTestCaseID="TC19";
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

    

    TestModellerLogger.SetLastNodeGuid("ff5edd38-07b0-452b-95d6-f33e07e1e975");
    _ClientSelect.Click_ClientsTAB();
    

    TestModellerLogger.SetLastNodeGuid("14a94a5a-c1ac-4e4f-afd4-69a84ffa5a24");
    _ClientSelect.Enter_ClientName(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("ed3e4750-33a4-4d75-a14c-9d75935c79c7");
    _ClientSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("e537c9d6-4166-4745-b27e-a178d69d2884");
    _ClientSelect.Click_SelectClient();
        
        As_Supplier.SupplierList _SupplierList = new As_Supplier.SupplierList(driver);
        
//    TestModellerLogger.SetLastNodeGuid("6606f792-ce73-46bd-a5e1-adb4816ea7ad");
//    _SupplierList.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("c27a0602-656a-45fc-819f-a4e287cd3bba");
//    _SupplierList.AssertUrl();
    



    TestModellerLogger.SetLastNodeGuid("85988836-cee8-442f-8667-7912641cd55d");
    _SupplierList.Click_Expenditure1();
    

    TestModellerLogger.SetLastNodeGuid("d22faf0f-87d5-4908-8735-d9359cde36e4");
    _SupplierList.Click_View2();
    

    TestModellerLogger.SetLastNodeGuid("8c80aafd-8b2e-4930-8c5f-ad65ed8ca448");
    _SupplierList.Click_Supplier_List_3();
    
    TestModellerLogger.SetLastNodeGuid("98d5f0a2-0aa4-412f-97c5-8c8a30449239");
    _SupplierList.Select_Category_Search4(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("dc5d5b0d-633b-4499-8fc3-eeced31cb3b5");
    _SupplierList.Enter_Enter_Test_to_Search5(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("6cc7f2b6-ce5d-4a25-9100-76b3822b80c0");
    _SupplierList.Click_SearchBtn_6();
    
    
    _SupplierList.AlreadyExistsSupplierDel();
    
    }
    

	/*
	 * @Test (groups= {"Test_Supplier_List","Test_Supplier_List - Test Cases"})
	 * 
	 * @TestModellerPath(guid = "ffa417bb-bf71-4302-a4fa-7fa79222088a") public void
	 * GoToUrlAssertUrlClickExpenditure1ClickView2ClickSupplierList3PositiveSelectCategorySearch4Ent1
	 * () throws InterruptedException {
	 * 
	 * As_Supplier.SupplierList _SupplierList = new
	 * As_Supplier.SupplierList(driver);
	 * TestModellerLogger.SetLastNodeGuid("6606f792-ce73-46bd-a5e1-adb4816ea7ad");
	 * _SupplierList.GoToUrl();
	 * 
	 * 
	 * TestModellerLogger.SetLastNodeGuid("c27a0602-656a-45fc-819f-a4e287cd3bba");
	 * _SupplierList.AssertUrl();
	 * 
	 * 
	 * TestModellerLogger.SetLastNodeGuid("85988836-cee8-442f-8667-7912641cd55d");
	 * _SupplierList.Click_Expenditure1();
	 * 
	 * 
	 * TestModellerLogger.SetLastNodeGuid("d22faf0f-87d5-4908-8735-d9359cde36e4");
	 * _SupplierList.Click_View2();
	 * 
	 * 
	 * TestModellerLogger.SetLastNodeGuid("8c80aafd-8b2e-4930-8c5f-ad65ed8ca448");
	 * _SupplierList.Click_Supplier_List_3();
	 * 
	 * 
	 * TestModellerLogger.SetLastNodeGuid("98d5f0a2-0aa4-412f-97c5-8c8a30449239");
	 * _SupplierList.Select_Category_Search4("Address");
	 * 
	 * 
	 * TestModellerLogger.SetLastNodeGuid("dc5d5b0d-633b-4499-8fc3-eeced31cb3b5");
	 * _SupplierList.Enter_Enter_Test_to_Search5("As");
	 * 
	 * 
	 * TestModellerLogger.SetLastNodeGuid("6cc7f2b6-ce5d-4a25-9100-76b3822b80c0");
	 * _SupplierList.Click_SearchBtn_6();
	 * 
	 * 
	 * TestModellerLogger.SetLastNodeGuid("9b7de803-6d7c-485c-886f-8fb340104c72");
	 * _SupplierList.Click_Add_SupplierBtn7();
	 * 
	 * 
	 * TestModellerLogger.SetLastNodeGuid("310a8534-114c-472c-9572-d56eb10b79cd");
	 * _SupplierList.Click_SaveBtn9();
	 * 
	 * 
	 * TestModellerLogger.SetLastNodeGuid("bc2e046f-78b2-4574-abc2-135d84145d16");
	 * _SupplierList.Click_Edit_SupplierBtn10();
	 * 
	 * 
	 * TestModellerLogger.SetLastNodeGuid("9cd2921c-107c-4277-9a8c-3b707424860f");
	 * _SupplierList.Click_SaveBtn12();
	 * 
	 * 
	 * TestModellerLogger.SetLastNodeGuid("6b2893ca-b88f-42bb-9412-2cde59a21726");
	 * _SupplierList.Click_DeleteBtn13();
	 * 
	 * 
	 * TestModellerLogger.SetLastNodeGuid("2f8db58b-4d7e-4c69-ae78-d2e0b6d28052");
	 * _SupplierList.Click_Download_Csv14();
	 * 
	 * 
	 * }
	 * 
	 * @Test (groups= {"Test_Supplier_List","Test_Supplier_List - Test Cases"})
	 * 
	 * @TestModellerPath(guid = "fa590faa-dec2-49e7-b2d0-c978e6d28c0a") public void
	 * GoToUrlAssertUrlClickExpenditure1ClickView2ClickSupplierList3PositiveSelectCategorySearch4Ent2
	 * () throws InterruptedException {
	 * 
	 * As_Supplier.SupplierList _SupplierList = new
	 * As_Supplier.SupplierList(driver);
	 * TestModellerLogger.SetLastNodeGuid("6606f792-ce73-46bd-a5e1-adb4816ea7ad");
	 * _SupplierList.GoToUrl();
	 * 
	 * 
	 * TestModellerLogger.SetLastNodeGuid("c27a0602-656a-45fc-819f-a4e287cd3bba");
	 * _SupplierList.AssertUrl();
	 * 
	 * 
	 * TestModellerLogger.SetLastNodeGuid("85988836-cee8-442f-8667-7912641cd55d");
	 * _SupplierList.Click_Expenditure1();
	 * 
	 * 
	 * TestModellerLogger.SetLastNodeGuid("d22faf0f-87d5-4908-8735-d9359cde36e4");
	 * _SupplierList.Click_View2();
	 * 
	 * 
	 * TestModellerLogger.SetLastNodeGuid("8c80aafd-8b2e-4930-8c5f-ad65ed8ca448");
	 * _SupplierList.Click_Supplier_List_3();
	 * 
	 * 
	 * TestModellerLogger.SetLastNodeGuid("98d5f0a2-0aa4-412f-97c5-8c8a30449239");
	 * _SupplierList.Select_Category_Search4("Supplier Name");
	 * 
	 * 
	 * TestModellerLogger.SetLastNodeGuid("dc5d5b0d-633b-4499-8fc3-eeced31cb3b5");
	 * _SupplierList.Enter_Enter_Test_to_Search5("As");
	 * 
	 * 
	 * TestModellerLogger.SetLastNodeGuid("6cc7f2b6-ce5d-4a25-9100-76b3822b80c0");
	 * _SupplierList.Click_SearchBtn_6();
	 * 
	 * 
	 * TestModellerLogger.SetLastNodeGuid("9b7de803-6d7c-485c-886f-8fb340104c72");
	 * _SupplierList.Click_Add_SupplierBtn7();
	 * 
	 * 
	 * TestModellerLogger.SetLastNodeGuid("310a8534-114c-472c-9572-d56eb10b79cd");
	 * _SupplierList.Click_SaveBtn9();
	 * 
	 * 
	 * TestModellerLogger.SetLastNodeGuid("bc2e046f-78b2-4574-abc2-135d84145d16");
	 * _SupplierList.Click_Edit_SupplierBtn10();
	 * 
	 * 
	 * TestModellerLogger.SetLastNodeGuid("9cd2921c-107c-4277-9a8c-3b707424860f");
	 * _SupplierList.Click_SaveBtn12();
	 * 
	 * 
	 * TestModellerLogger.SetLastNodeGuid("6b2893ca-b88f-42bb-9412-2cde59a21726");
	 * _SupplierList.Click_DeleteBtn13();
	 * 
	 * 
	 * TestModellerLogger.SetLastNodeGuid("2f8db58b-4d7e-4c69-ae78-d2e0b6d28052");
	 * _SupplierList.Click_Download_Csv14();
	 * 
	 * 
	 * }
	 * 
	 * @Test (groups= {"Test_Supplier_List","Test_Supplier_List - Test Cases"})
	 * 
	 * @TestModellerPath(guid = "4847fcb5-c8a0-4d0f-b082-0fc30778778c") public void
	 * GoToUrlAssertUrlClickExpenditure1ClickView2ClickSupplierList3PositiveSelectCategorySearch4Ent3
	 * () throws InterruptedException {
	 * 
	 * As_Supplier.SupplierList _SupplierList = new
	 * As_Supplier.SupplierList(driver);
	 * TestModellerLogger.SetLastNodeGuid("6606f792-ce73-46bd-a5e1-adb4816ea7ad");
	 * _SupplierList.GoToUrl();
	 * 
	 * 
	 * TestModellerLogger.SetLastNodeGuid("c27a0602-656a-45fc-819f-a4e287cd3bba");
	 * _SupplierList.AssertUrl();
	 * 
	 * 
	 * TestModellerLogger.SetLastNodeGuid("85988836-cee8-442f-8667-7912641cd55d");
	 * _SupplierList.Click_Expenditure1();
	 * 
	 * 
	 * TestModellerLogger.SetLastNodeGuid("d22faf0f-87d5-4908-8735-d9359cde36e4");
	 * _SupplierList.Click_View2();
	 * 
	 * 
	 * TestModellerLogger.SetLastNodeGuid("8c80aafd-8b2e-4930-8c5f-ad65ed8ca448");
	 * _SupplierList.Click_Supplier_List_3();
	 * 
	 * 
	 * TestModellerLogger.SetLastNodeGuid("98d5f0a2-0aa4-412f-97c5-8c8a30449239");
	 * _SupplierList.Select_Category_Search4("Contact Name");
	 * 
	 * 
	 * TestModellerLogger.SetLastNodeGuid("dc5d5b0d-633b-4499-8fc3-eeced31cb3b5");
	 * _SupplierList.Enter_Enter_Test_to_Search5("As");
	 * 
	 * 
	 * TestModellerLogger.SetLastNodeGuid("6cc7f2b6-ce5d-4a25-9100-76b3822b80c0");
	 * _SupplierList.Click_SearchBtn_6();
	 * 
	 * 
	 * TestModellerLogger.SetLastNodeGuid("9b7de803-6d7c-485c-886f-8fb340104c72");
	 * _SupplierList.Click_Add_SupplierBtn7();
	 * 
	 * 
	 * TestModellerLogger.SetLastNodeGuid("310a8534-114c-472c-9572-d56eb10b79cd");
	 * _SupplierList.Click_SaveBtn9();
	 * 
	 * 
	 * TestModellerLogger.SetLastNodeGuid("bc2e046f-78b2-4574-abc2-135d84145d16");
	 * _SupplierList.Click_Edit_SupplierBtn10();
	 * 
	 * 
	 * TestModellerLogger.SetLastNodeGuid("9cd2921c-107c-4277-9a8c-3b707424860f");
	 * _SupplierList.Click_SaveBtn12();
	 * 
	 * 
	 * TestModellerLogger.SetLastNodeGuid("6b2893ca-b88f-42bb-9412-2cde59a21726");
	 * _SupplierList.Click_DeleteBtn13();
	 * 
	 * 
	 * TestModellerLogger.SetLastNodeGuid("2f8db58b-4d7e-4c69-ae78-d2e0b6d28052");
	 * _SupplierList.Click_Download_Csv14();
	 * 
	 * 
	 * }
	 * 
	 * @Test (groups= {"Test_Supplier_List","Test_Supplier_List - Test Cases"})
	 * 
	 * @TestModellerPath(guid = "6ce50ff2-3f49-4668-ac56-5d5ca59a3229") public void
	 * GoToUrlAssertUrlClickExpenditure1ClickView2ClickSupplierList3PositiveSelectCategorySearch4Ent4
	 * () throws InterruptedException {
	 * 
	 * As_Supplier.SupplierList _SupplierList = new
	 * As_Supplier.SupplierList(driver);
	 * TestModellerLogger.SetLastNodeGuid("6606f792-ce73-46bd-a5e1-adb4816ea7ad");
	 * _SupplierList.GoToUrl();
	 * 
	 * 
	 * TestModellerLogger.SetLastNodeGuid("c27a0602-656a-45fc-819f-a4e287cd3bba");
	 * _SupplierList.AssertUrl();
	 * 
	 * 
	 * TestModellerLogger.SetLastNodeGuid("85988836-cee8-442f-8667-7912641cd55d");
	 * _SupplierList.Click_Expenditure1();
	 * 
	 * 
	 * TestModellerLogger.SetLastNodeGuid("d22faf0f-87d5-4908-8735-d9359cde36e4");
	 * _SupplierList.Click_View2();
	 * 
	 * 
	 * TestModellerLogger.SetLastNodeGuid("8c80aafd-8b2e-4930-8c5f-ad65ed8ca448");
	 * _SupplierList.Click_Supplier_List_3();
	 * 
	 * 
	 * TestModellerLogger.SetLastNodeGuid("98d5f0a2-0aa4-412f-97c5-8c8a30449239");
	 * _SupplierList.Select_Category_Search4("Email");
	 * 
	 * 
	 * TestModellerLogger.SetLastNodeGuid("dc5d5b0d-633b-4499-8fc3-eeced31cb3b5");
	 * _SupplierList.Enter_Enter_Test_to_Search5("As");
	 * 
	 * 
	 * TestModellerLogger.SetLastNodeGuid("6cc7f2b6-ce5d-4a25-9100-76b3822b80c0");
	 * _SupplierList.Click_SearchBtn_6();
	 * 
	 * 
	 * TestModellerLogger.SetLastNodeGuid("9b7de803-6d7c-485c-886f-8fb340104c72");
	 * _SupplierList.Click_Add_SupplierBtn7();
	 * 
	 * 
	 * TestModellerLogger.SetLastNodeGuid("310a8534-114c-472c-9572-d56eb10b79cd");
	 * _SupplierList.Click_SaveBtn9();
	 * 
	 * 
	 * TestModellerLogger.SetLastNodeGuid("bc2e046f-78b2-4574-abc2-135d84145d16");
	 * _SupplierList.Click_Edit_SupplierBtn10();
	 * 
	 * 
	 * TestModellerLogger.SetLastNodeGuid("9cd2921c-107c-4277-9a8c-3b707424860f");
	 * _SupplierList.Click_SaveBtn12();
	 * 
	 * 
	 * TestModellerLogger.SetLastNodeGuid("6b2893ca-b88f-42bb-9412-2cde59a21726");
	 * _SupplierList.Click_DeleteBtn13();
	 * 
	 * 
	 * TestModellerLogger.SetLastNodeGuid("2f8db58b-4d7e-4c69-ae78-d2e0b6d28052");
	 * _SupplierList.Click_Download_Csv14();
	 * 
	 * 
	 * }
	 * 
	 * @Test (groups= {"Test_Supplier_List","Test_Supplier_List - Test Cases"})
	 * 
	 * @TestModellerPath(guid = "cc64209a-9693-4a17-93b8-c360d211c751") public void
	 * GoToUrlAssertUrlClickExpenditure1ClickView2ClickSupplierList3PositiveSelectCategorySearch4Ent5
	 * () throws InterruptedException {
	 * 
	 * As_Supplier.SupplierList _SupplierList = new
	 * As_Supplier.SupplierList(driver);
	 * TestModellerLogger.SetLastNodeGuid("6606f792-ce73-46bd-a5e1-adb4816ea7ad");
	 * _SupplierList.GoToUrl();
	 * 
	 * 
	 * TestModellerLogger.SetLastNodeGuid("c27a0602-656a-45fc-819f-a4e287cd3bba");
	 * _SupplierList.AssertUrl();
	 * 
	 * 
	 * TestModellerLogger.SetLastNodeGuid("85988836-cee8-442f-8667-7912641cd55d");
	 * _SupplierList.Click_Expenditure1();
	 * 
	 * 
	 * TestModellerLogger.SetLastNodeGuid("d22faf0f-87d5-4908-8735-d9359cde36e4");
	 * _SupplierList.Click_View2();
	 * 
	 * 
	 * TestModellerLogger.SetLastNodeGuid("8c80aafd-8b2e-4930-8c5f-ad65ed8ca448");
	 * _SupplierList.Click_Supplier_List_3();
	 * 
	 * 
	 * TestModellerLogger.SetLastNodeGuid("98d5f0a2-0aa4-412f-97c5-8c8a30449239");
	 * _SupplierList.Select_Category_Search4("Select");
	 * 
	 * 
	 * TestModellerLogger.SetLastNodeGuid("dc5d5b0d-633b-4499-8fc3-eeced31cb3b5");
	 * _SupplierList.Enter_Enter_Test_to_Search5("As");
	 * 
	 * 
	 * TestModellerLogger.SetLastNodeGuid("6cc7f2b6-ce5d-4a25-9100-76b3822b80c0");
	 * _SupplierList.Click_SearchBtn_6();
	 * 
	 * 
	 * TestModellerLogger.SetLastNodeGuid("9b7de803-6d7c-485c-886f-8fb340104c72");
	 * _SupplierList.Click_Add_SupplierBtn7();
	 * 
	 * 
	 * TestModellerLogger.SetLastNodeGuid("310a8534-114c-472c-9572-d56eb10b79cd");
	 * _SupplierList.Click_SaveBtn9();
	 * 
	 * 
	 * TestModellerLogger.SetLastNodeGuid("bc2e046f-78b2-4574-abc2-135d84145d16");
	 * _SupplierList.Click_Edit_SupplierBtn10();
	 * 
	 * 
	 * TestModellerLogger.SetLastNodeGuid("9cd2921c-107c-4277-9a8c-3b707424860f");
	 * _SupplierList.Click_SaveBtn12();
	 * 
	 * 
	 * TestModellerLogger.SetLastNodeGuid("6b2893ca-b88f-42bb-9412-2cde59a21726");
	 * 
	 * _SupplierList.Click_DeleteBtn13();
	 * 
	 * 
	 * TestModellerLogger.SetLastNodeGuid("2f8db58b-4d7e-4c69-ae78-d2e0b6d28052");
	 * _SupplierList.Click_Download_Csv14();
	 * 
	 * 
	 * }
	 * 
	 * @Test (groups= {"Test_Supplier_List","Test_Supplier_List - Test Cases"})
	 * 
	 * @TestModellerPath(guid = "0579f802-d9af-4969-a8ec-7a61324e95cf") public void
	 * GoToUrlAssertUrlClickExpenditure1ClickView2ClickSupplierList3PositiveSelectCategorySearch4Ent6
	 * () throws InterruptedException {
	 * 
	 * As_Supplier.SupplierList _SupplierList = new
	 * As_Supplier.SupplierList(driver);
	 * TestModellerLogger.SetLastNodeGuid("6606f792-ce73-46bd-a5e1-adb4816ea7ad");
	 * _SupplierList.GoToUrl();
	 * 
	 * 
	 * TestModellerLogger.SetLastNodeGuid("c27a0602-656a-45fc-819f-a4e287cd3bba");
	 * _SupplierList.AssertUrl();
	 * 
	 * 
	 * TestModellerLogger.SetLastNodeGuid("85988836-cee8-442f-8667-7912641cd55d");
	 * _SupplierList.Click_Expenditure1();
	 * 
	 * 
	 * TestModellerLogger.SetLastNodeGuid("d22faf0f-87d5-4908-8735-d9359cde36e4");
	 * _SupplierList.Click_View2();
	 * 
	 * 
	 * TestModellerLogger.SetLastNodeGuid("8c80aafd-8b2e-4930-8c5f-ad65ed8ca448");
	 * _SupplierList.Click_Supplier_List_3();
	 * 
	 * 
	 * TestModellerLogger.SetLastNodeGuid("98d5f0a2-0aa4-412f-97c5-8c8a30449239");
	 * _SupplierList.Select_Category_Search4("Ref No");
	 * 
	 * 
	 * TestModellerLogger.SetLastNodeGuid("dc5d5b0d-633b-4499-8fc3-eeced31cb3b5");
	 * _SupplierList.Enter_Enter_Test_to_Search5("As");
	 * 
	 * 
	 * TestModellerLogger.SetLastNodeGuid("6cc7f2b6-ce5d-4a25-9100-76b3822b80c0");
	 * _SupplierList.Click_SearchBtn_6();
	 * 
	 * 
	 * TestModellerLogger.SetLastNodeGuid("9b7de803-6d7c-485c-886f-8fb340104c72");
	 * _SupplierList.Click_Add_SupplierBtn7();
	 * 
	 * 
	 * TestModellerLogger.SetLastNodeGuid("310a8534-114c-472c-9572-d56eb10b79cd");
	 * _SupplierList.Click_SaveBtn9();
	 * 
	 * 
	 * TestModellerLogger.SetLastNodeGuid("bc2e046f-78b2-4574-abc2-135d84145d16");
	 * _SupplierList.Click_Edit_SupplierBtn10();
	 * 
	 * 
	 * TestModellerLogger.SetLastNodeGuid("9cd2921c-107c-4277-9a8c-3b707424860f");
	 * _SupplierList.Click_SaveBtn12();
	 * 
	 * 
	 * TestModellerLogger.SetLastNodeGuid("6b2893ca-b88f-42bb-9412-2cde59a21726");
	 * 
	 * _SupplierList.Click_DeleteBtn13();
	 * 
	 * 
	 * TestModellerLogger.SetLastNodeGuid("2f8db58b-4d7e-4c69-ae78-d2e0b6d28052");
	 * _SupplierList.Click_Download_Csv14();
	 * 
	 * 
	 * }
	 * 
	 */}