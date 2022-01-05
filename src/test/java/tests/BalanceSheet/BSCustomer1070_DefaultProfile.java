package tests.BalanceSheet;

import reports.TestNGListener;
import tests.TestBase;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;

import java.awt.AWTException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Generic.ReadExcelData;
import Generic.RetryAnalyzer;
import ie.curiositysoftware.allocation.dto.ResultMergeMethod;
import ie.curiositysoftware.allocation.dto.DataAllocationRow;
import reports.ExtentTestListener;
import ie.curiositysoftware.allocation.dto.DataAllocationResult;
import ie.curiositysoftware.allocation.engine.DataAllocation;
import utilities.testmodeller.TestModellerLogger;

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/ae453725-156b-4f2f-985d-7b77ac0f4538
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 517, profileId = 100430)
public class BSCustomer1070_DefaultProfile extends TestBase
{
    

	String sTestCaseID=null;
    String[] sData=null;
    String Sheet =null;
    @Test  (retryAnalyzer = RetryAnalyzer.class,groups= {"71ed6dad-f2b7-46ac-a977-c74abbd17a8b","BS_Customer-1070","BS_Customer-1070 - Default Profile"})
    @TestModellerPath(guid = "71ed6dad-f2b7-46ac-a977-c74abbd17a8b")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginBtnsuccessfulloginGoToUrl() throws NoSuchFieldException, Exception, IllegalArgumentException, IllegalAccessException, AWTException
    {
    	sTestCaseID="BS_Customer_1070";
    	Sheet="BalanceSheet";
        sData = ReadExcelData.toReadExcelData(sTestCaseID, Sheet);
    //    pages.SandboxPreLogin _pagesSandboxPreLogin = new pages.SandboxPreLogin(driver);
//    TestModellerLogger.SetLastNodeGuid("85a68a19-1db3-462f-92e0-8295f3024e24");
//    _pagesSandboxPreLogin.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("f2674d01-df05-4f92-af31-f0ff398ac7e1");
//    _pagesSandboxPreLogin.AssertUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("6d0c9a3a-65b1-4d69-97f9-e0818cfefbd2");
//   // _pagesSandboxPreLogin.Enter_UserName(sData[1]);
//    _pagesSandboxPreLogin.Enter_UserName("admin");
//
//    TestModellerLogger.SetLastNodeGuid("1b2abea1-38e3-49b5-ab32-9a210c036081");
//   // _pagesSandboxPreLogin.Enter_Password(sData[2]);
//    _pagesSandboxPreLogin.Enter_Password("admin1@1");
//
//    TestModellerLogger.SetLastNodeGuid("4645956e-34e5-4f4a-9aea-1cb87ad0b003");
//    _pagesSandboxPreLogin.Click_LoginBtn();
//    
//
//pages.Search_Agents _pagesSearch_Agents = new pages.Search_Agents(driver);
//    
//
//    TestModellerLogger.SetLastNodeGuid("ad7105a0-ca0b-42bd-b187-ea4bd10c1ca5");
//    _pagesSearch_Agents.Enter_ctl00cPHFiltertxtAgentName(sData[3], driver);
//
//
//    TestModellerLogger.SetLastNodeGuid("4d08981e-bded-4841-a18c-00d7c319d524");
//    _pagesSearch_Agents.Click_Search();
//    
//
//    TestModellerLogger.SetLastNodeGuid("c9c694b7-7143-42e9-a8fe-eb2e05ad2c02");
//    _pagesSearch_Agents.Click__Demo_Agent_();
//    
//
//pages.Search_Business _pagesSearch_Business = new pages.Search_Business(driver);
//   
//    TestModellerLogger.SetLastNodeGuid("2714a67d-87fd-42a3-96d9-efd09aee5080");
//    _pagesSearch_Business.Click_Businesses();
//    
//
//    TestModellerLogger.SetLastNodeGuid("f039bffc-aa28-4f46-a412-1eb6214091e7");
//    _pagesSearch_Business.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("a7b135dd-2fb1-423f-81ac-0b6c00587590");
//    _pagesSearch_Business.Click_Search_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("a9ef7b06-b298-4b0b-89e2-7a0187789cab");
//    _pagesSearch_Business.Click__Raggaz_ltd();
//    
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
  	  
  	  
  	  TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
  	  _nlogin.GoToUrl();
  	  
  	  TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
  	  // _nlogin.AssertUrl();
  	  
  	  
  	  TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
  	  _nlogin.Enter_nLOGIN(sData[1]);
  	  
  	  
  	  TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
  	  _nlogin.Enter_nPASS(sData[2]);
  	  
  	  
  	  TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
  	  _nlogin.Click_Login();
  	  
  	  
  	  pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
  	 
  	  
  	  TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
  	  _AgentSearch.Click_Agents();
  	  
  	  TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
  	  _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
  	  
  	  
  	  TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
  	  _AgentSearch.Click_Search(); 
  	  
  	  TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
  	  _AgentSearch.Click__Nidhi1_(); 
  	  
  	 pages.Searchclient _Searchclient = new pages.Searchclient(driver); 
  	 
  	  TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
  	  _Searchclient.Click__Clients_(); 

  	  TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
  	  _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4]);


  	  TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
  	  _Searchclient.Click_Searchbtn(); 
  	  
  	  TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
  	  _Searchclient.Click__NidhiEnt(); 
  	  
  	  
  	  

pages.DeletejournalEntry1 _pagesDeletejournalEntry1 = new pages.DeletejournalEntry1(driver);
    /*TestModellerLogger.SetLastNodeGuid("884591c1-7014-4090-9162-f02306bb6d71");
    _pagesDeletejournalEntry1.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("8ae0f19b-10df-4104-b056-4d66f9123654");
    _pagesDeletejournalEntry1.AssertUrl();*/
    

    TestModellerLogger.SetLastNodeGuid("658a1a6a-4df2-4aa5-9d3d-a5ac35030b4c");
    _pagesDeletejournalEntry1.Click_Accountant();
    

    TestModellerLogger.SetLastNodeGuid("c22ad20b-472b-436f-8a21-aaef00c48180");
    _pagesDeletejournalEntry1.Click_Journals();
    

    TestModellerLogger.SetLastNodeGuid("5cf0a328-ae76-4d0a-ae9e-9cc8fba22bdc");
    _pagesDeletejournalEntry1.Select_ctl00ddlFinancialYear(sData[5]);
    

    TestModellerLogger.SetLastNodeGuid("f8f4724e-9e6f-4bbb-baf2-1ae01e6a4b64");
    _pagesDeletejournalEntry1.Click_xPath_idchAllRTI();
    

    TestModellerLogger.SetLastNodeGuid("d4e4d3ec-a2d4-4667-9023-6eb47e216d04");
    _pagesDeletejournalEntry1.Click_xPath_htmlbodyformmaindiv10div3headerdiva1i();
    
pages.AddjournalEntry10incBnk _pagesAddjournalEntry10incBnk = new pages.AddjournalEntry10incBnk(driver);
	/*TestModellerLogger.SetLastNodeGuid("dd92d21a-9691-4ca6-8066-4bd4bcfa646e");
	_pagesAddjournalEntry10incBnk.GoToUrl();


	TestModellerLogger.SetLastNodeGuid("8e565b66-dd8d-4599-a401-e5d54ce3d332");
	_pagesAddjournalEntry10incBnk.AssertUrl();*/


	TestModellerLogger.SetLastNodeGuid("38cbd912-3e75-4efc-8738-666f991004c0");
	_pagesAddjournalEntry10incBnk.Click_Accountant();


	TestModellerLogger.SetLastNodeGuid("b58e3147-d8db-4022-856e-f56469789c33");
	_pagesAddjournalEntry10incBnk.Click_clickjournalplus();


	TestModellerLogger.SetLastNodeGuid("6f297d36-f476-4760-8faa-1a2681a6d36a");
	_pagesAddjournalEntry10incBnk.Enter_ctl00cPHtxtDate(sData[6]);


  	TestModellerLogger.SetLastNodeGuid("441a2306-a64b-4432-8d04-bfd6ce2c3d11");
  	_pagesAddjournalEntry10incBnk.Enter_ctl00cPHtxtDescription(sData[7]);


    TestModellerLogger.SetLastNodeGuid("335212ec-d991-4d36-b04a-604fd17dccf5");
    _pagesAddjournalEntry10incBnk.Enter_Account1select2(sData[8]);
    

    //TestModellerLogger.SetLastNodeGuid("5bc7905c-42b2-48fd-bdc0-67b56ebee64f");
    //_pagesAddjournalEntry10incBnk.Enter_Debit1("1000");
    

    TestModellerLogger.SetLastNodeGuid("87cb26ed-6df5-40d9-819a-de80ed8573d2");
    _pagesAddjournalEntry10incBnk.Enter_Credit1(sData[9]);
    

    //TestModellerLogger.SetLastNodeGuid("242ed94c-7fbe-4bd4-b314-a9c171017499");
    //_pagesAddjournalEntry10incBnk.Enter_Note1("note1");
    

    TestModellerLogger.SetLastNodeGuid("5baf4171-eaae-42df-913a-fd780fd55012");
    _pagesAddjournalEntry10incBnk.Enter_Account2(sData[10]);
    

    TestModellerLogger.SetLastNodeGuid("7d4b5d8c-b9a4-4fd9-99b2-f6024b3fadda");
    _pagesAddjournalEntry10incBnk.Enter_Debit2(sData[11]);
    

    //TestModellerLogger.SetLastNodeGuid("bc79c15b-b79e-4f4a-a4eb-8ce3499686ca");
    //_pagesAddjournalEntry10incBnk.Enter_Credit2("");
    

    //TestModellerLogger.SetLastNodeGuid("1a3d2f92-f18f-41b3-a1ab-2ddb675eb0f5");
    //_pagesAddjournalEntry10incBnk.Enter_Note2("note2");
    

   
    

    TestModellerLogger.SetLastNodeGuid("9963b6a8-a3d3-45d6-a6da-c43a423333fc");
    _pagesAddjournalEntry10incBnk.Click__Save_();
    

pages.verifyBS _pagesverifyBS = new pages.verifyBS(driver);
    /*TestModellerLogger.SetLastNodeGuid("66735795-46bb-49fc-ba78-5039790bd03c");
    _pagesverifyBS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("79019ec2-ec76-4854-8388-63145ba9d001");
    _pagesverifyBS.AssertUrl();*/
    

    TestModellerLogger.SetLastNodeGuid("fc2cdb54-4d1d-4c5e-905e-5ccde4200e69");
    _pagesverifyBS.Click_Reports_tab();
    

    TestModellerLogger.SetLastNodeGuid("195ad398-7e22-49e2-8770-a8548e1fa1a0");
    _pagesverifyBS.Click_Balance_Sheet_link();
    

    TestModellerLogger.SetLastNodeGuid("489eb3fd-e97e-49f7-aba2-610610f074e6");
    _pagesverifyBS.Select_selectFinancialYear(sData[12]);
    
    _pagesAddjournalEntry10incBnk.verify_BS_Customer_1070();
    

    }

}
