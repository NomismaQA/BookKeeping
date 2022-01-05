package tests.BalanceSheet;

import reports.TestNGListener;
import tests.TestBase;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;
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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/ad3470e2-4e2b-48f1-9b97-eed564c19238
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 538, profileId = 100448)
public class BSEmployee1322_DefaultProfile extends TestBase
{
    

	String sTestCaseID=null;
    String[] sData=null;
    String Sheet =null;
    @Test  (retryAnalyzer = RetryAnalyzer.class,groups= {"5dec7cfc-54f7-4fb1-89f7-12a87281bcbc","BS_Employee-1322","BS_Employee-1322 - Default Profile"})
    @TestModellerPath(guid = "5dec7cfc-54f7-4fb1-89f7-12a87281bcbc")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginBtnsuccessfulloginGoToUrl() throws SecurityException, Exception
    {
    	sTestCaseID="TB_Employee_1322_2";
    	Sheet="BalanceSheet";
        sData = ReadExcelData.toReadExcelData(sTestCaseID, Sheet);
        pages.SandboxPreLogin _pagesSandboxPreLogin = new pages.SandboxPreLogin(driver);
    TestModellerLogger.SetLastNodeGuid("85a68a19-1db3-462f-92e0-8295f3024e24");
    _pagesSandboxPreLogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("f2674d01-df05-4f92-af31-f0ff398ac7e1");
    _pagesSandboxPreLogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("6d0c9a3a-65b1-4d69-97f9-e0818cfefbd2");
    _pagesSandboxPreLogin.Enter_UserName(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("1b2abea1-38e3-49b5-ab32-9a210c036081");
    _pagesSandboxPreLogin.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("4645956e-34e5-4f4a-9aea-1cb87ad0b003");
    _pagesSandboxPreLogin.Click_LoginBtn();
    

pages.Search_Agents _pagesSearch_Agents = new pages.Search_Agents(driver);
    

    TestModellerLogger.SetLastNodeGuid("ad7105a0-ca0b-42bd-b187-ea4bd10c1ca5");
    _pagesSearch_Agents.Enter_ctl00cPHFiltertxtAgentName(sData[3],driver);


    TestModellerLogger.SetLastNodeGuid("4d08981e-bded-4841-a18c-00d7c319d524");
    _pagesSearch_Agents.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("c9c694b7-7143-42e9-a8fe-eb2e05ad2c02");
    _pagesSearch_Agents.Click__Demo_Agent_();
    

pages.Search_Business _pagesSearch_Business = new pages.Search_Business(driver);
   
    TestModellerLogger.SetLastNodeGuid("2714a67d-87fd-42a3-96d9-efd09aee5080");
    _pagesSearch_Business.Click_Businesses();
    

    TestModellerLogger.SetLastNodeGuid("f039bffc-aa28-4f46-a412-1eb6214091e7");
    _pagesSearch_Business.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("a7b135dd-2fb1-423f-81ac-0b6c00587590");
    _pagesSearch_Business.Click_Search_();
    

    TestModellerLogger.SetLastNodeGuid("a9ef7b06-b298-4b0b-89e2-7a0187789cab");
    _pagesSearch_Business.Click__Raggaz_ltd();
    

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
  	_pagesAddjournalEntry10incBnk.Enter_Account1_way3(sData[8]);
    

    TestModellerLogger.SetLastNodeGuid("5bc7905c-42b2-48fd-bdc0-67b56ebee64f");
    _pagesAddjournalEntry10incBnk.Enter_Debit1(sData[9]);
    

    TestModellerLogger.SetLastNodeGuid("5baf4171-eaae-42df-913a-fd780fd55012");
    _pagesAddjournalEntry10incBnk.Enter_Account2_way3(sData[10]);
    

    TestModellerLogger.SetLastNodeGuid("7d4b5d8c-b9a4-4fd9-99b2-f6024b3fadda");
    _pagesAddjournalEntry10incBnk.Enter_Debit2(sData[11]);
    

  
    TestModellerLogger.SetLastNodeGuid("7dd19a67-8d19-4799-8c04-9c45ce0b6f55");
    _pagesAddjournalEntry10incBnk.Enter_Account3_way3(sData[12]);
    

    TestModellerLogger.SetLastNodeGuid("eb440455-aafb-442d-a019-2005211a4440");
    _pagesAddjournalEntry10incBnk.Enter_Debit3(sData[13]);
    

   
    TestModellerLogger.SetLastNodeGuid("3a449702-02bb-41c0-8896-be8229361f57");
    _pagesAddjournalEntry10incBnk.Enter_Account4_way3(sData[14]);
    

    TestModellerLogger.SetLastNodeGuid("08296264-ac9c-4615-bd37-f8bcb01d9874");
    _pagesAddjournalEntry10incBnk.Enter_Debit4(sData[15]);
    

    TestModellerLogger.SetLastNodeGuid("d1edcd0a-eefd-44c5-b8c8-7cacf22f0c5f");
    _pagesAddjournalEntry10incBnk.Enter_Account5_way3(sData[16]);
    

    TestModellerLogger.SetLastNodeGuid("a061acf6-a397-472a-b247-bb6b4a391a5f");
    _pagesAddjournalEntry10incBnk.Enter_Debit5(sData[17]);
    

    TestModellerLogger.SetLastNodeGuid("488015a8-2d46-4aa6-8aeb-afe5658ccaa3");
    _pagesAddjournalEntry10incBnk.Click_Tick_for_more_line_items();
    

    TestModellerLogger.SetLastNodeGuid("6ad08b13-a1b8-4f93-a331-545d921c7bcf");
    _pagesAddjournalEntry10incBnk.Enter_Account6(sData[18]);
    

    TestModellerLogger.SetLastNodeGuid("e77c2469-ef09-4da5-811f-08ca7f072194");
    _pagesAddjournalEntry10incBnk.Enter_Credit6(sData[19]);
    
    TestModellerLogger.SetLastNodeGuid("9963b6a8-a3d3-45d6-a6da-c43a423333fc");
    _pagesAddjournalEntry10incBnk.Click__Save_();
    Thread.sleep(10000);

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
    _pagesverifyBS.Select_selectFinancialYear(sData[20]);
    
    _pagesAddjournalEntry10incBnk.verify_BS_BF_Employee_1322(sData[21]);
    

    }

}
