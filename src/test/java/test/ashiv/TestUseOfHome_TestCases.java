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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/c4df32b7-cadf-4d76-b2a3-0c45949e8c4c
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1856, profileId = 102399)
public class TestUseOfHome_TestCases extends TestBase
{
	String sTestCaseID=null;
	String[] data=null;
	String Sheet = null;


    
    @Test  (groups= {"Test_UseOfHome","Test_UseOfHome - Test Cases"})
    @TestModellerPath(guid = "5fae1ae3-9f93-4e49-8021-a87117a41a09")
    public void GoToUrlClickExpenditureClickViewClickUseofHomeasOfficePositiveSelectSelectPersonPositiveSelect() throws InvalidFormatException, InterruptedException
    {
        
    	sTestCaseID="TC22";
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
    
        As_Supplier.Use_Of_Home _Use_Of_Home = new As_Supplier.Use_Of_Home(driver);
//        
//    TestModellerLogger.SetLastNodeGuid("1665c449-ea10-4e25-ab3c-48b48069d71e");
//    _Use_Of_Home.GoToUrl();
//    

    TestModellerLogger.SetLastNodeGuid("76b2026b-0e66-478e-a214-5929d57fa942");
    _Use_Of_Home.Click_Expenditure();
    

    TestModellerLogger.SetLastNodeGuid("96b0003b-a81c-43f1-80f7-a47138026f43");
    _Use_Of_Home.Click_View_();
    

    TestModellerLogger.SetLastNodeGuid("a52f8bca-a6b3-4f3d-9c3d-445a80b2433b");
    _Use_Of_Home.Click_Use_of_Home_as_Office();
    

    TestModellerLogger.SetLastNodeGuid("49503686-3f24-4c5f-8f1f-490754d12ee9");
    _Use_Of_Home.Select_SelectPerson("Mohd Ashiv");
    

    TestModellerLogger.SetLastNodeGuid("97cc5a30-9975-4b39-b3f0-caca613af24f");
    _Use_Of_Home.Select_SelectStatus("Active");
    

    TestModellerLogger.SetLastNodeGuid("97155423-0ad7-4597-9a76-e8c373f51d36");
    _Use_Of_Home.Enter_Enter_Address("047 Weber Wall, Huntermouth, Canada");
    

    _Use_Of_Home.Select_SelectStatusCheak();
    
    }

//    @Test  (groups= {"Test_UseOfHome","Test_UseOfHome - Test Cases"})
//    @TestModellerPath(guid = "c4c6947d-b992-4103-a25a-e5266db393e9")
//    public void GoToUrlClickExpenditureClickViewClickUseofHomeasOfficePositiveSelectSelectPersonPositiveSelect1()
//    {
//        
//        pages.Use_Of_Home _Use_Of_Home = new pages.Use_Of_Home(driver);
//    TestModellerLogger.SetLastNodeGuid("1665c449-ea10-4e25-ab3c-48b48069d71e");
//    _Use_Of_Home.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("76b2026b-0e66-478e-a214-5929d57fa942");
//    _Use_Of_Home.Click_Expenditure();
//    
//
//    TestModellerLogger.SetLastNodeGuid("96b0003b-a81c-43f1-80f7-a47138026f43");
//    _Use_Of_Home.Click_View_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("a52f8bca-a6b3-4f3d-9c3d-445a80b2433b");
//    _Use_Of_Home.Click_Use_of_Home_as_Office();
//    
//
//    TestModellerLogger.SetLastNodeGuid("49503686-3f24-4c5f-8f1f-490754d12ee9");
//    _Use_Of_Home.Select_SelectPerson("Mohd Ashiv");
//    
//
//    TestModellerLogger.SetLastNodeGuid("97cc5a30-9975-4b39-b3f0-caca613af24f");
//    _Use_Of_Home.Select_SelectStatus("In-Active");
//    
//
//    TestModellerLogger.SetLastNodeGuid("97155423-0ad7-4597-9a76-e8c373f51d36");
//    _Use_Of_Home.Enter_Enter_Address("22690 Renner Flat, East Estevanhaven, Fiji");
//    
//
//    }

}