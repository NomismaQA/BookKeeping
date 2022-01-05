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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/db7c38f7-8a05-4a1a-8118-b0de4e160118
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 527, profileId = 100438)
public class BSCreditorDueAfterOneYear23322339_DefaultProfile extends TestBase
{
    

	String sTestCaseID=null;
    String[] sData=null;
    String Sheet =null;
    @Test  (retryAnalyzer = RetryAnalyzer.class,groups= {"fea78b7f-6904-48d5-b36b-99cd3a2e3a82","BS_CreditorDueAfterOneYear-2332-2339","BS_CreditorDueAfterOneYear-2332-2339 - Default Profile"})
    @TestModellerPath(guid = "fea78b7f-6904-48d5-b36b-99cd3a2e3a82")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginBtnsuccessfulloginGoToUrl() throws NoSuchFieldException, Exception
    {
    	sTestCaseID="BSCreditorDueAfterOneYear23322339";
    	Sheet="BalanceSheet";
        sData = ReadExcelData.toReadExcelData(sTestCaseID, Sheet);
        pages.Login1VAT _pagesSandboxPreLogin = new pages.Login1VAT(driver);
       TestModellerLogger.SetLastNodeGuid("85a68a19-1db3-462f-92e0-8295f3024e24");
      _pagesSandboxPreLogin.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("f2674d01-df05-4f92-af31-f0ff398ac7e1");
//    _pagesSandboxPreLogin.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("6d0c9a3a-65b1-4d69-97f9-e0818cfefbd2");
  //  _pagesSandboxPreLogin.Enter_UserName(sData[1]);
    _pagesSandboxPreLogin.Enter_UserName("admin");
    

    TestModellerLogger.SetLastNodeGuid("1b2abea1-38e3-49b5-ab32-9a210c036081");
   // _pagesSandboxPreLogin.Enter_Password(sData[2]);
    _pagesSandboxPreLogin.Enter_Password("admin1@1");

    TestModellerLogger.SetLastNodeGuid("4645956e-34e5-4f4a-9aea-1cb87ad0b003");
    _pagesSandboxPreLogin.Click_LoginButton();
    

pages.AgentSearch _pagesSearch_Agents = new pages.AgentSearch(driver);
    

    TestModellerLogger.SetLastNodeGuid("ad7105a0-ca0b-42bd-b187-ea4bd10c1ca5");
    _pagesSearch_Agents.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
   // _pagesSearch_Agents.Enter_ctl00cPHFiltertxtAgentName(sData[3],driver);

    TestModellerLogger.SetLastNodeGuid("4d08981e-bded-4841-a18c-00d7c319d524");
    _pagesSearch_Agents.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("c9c694b7-7143-42e9-a8fe-eb2e05ad2c02");
    _pagesSearch_Agents.Click__Nidhi1_();
    

pages.Searchclient _pagesSearch_Business = new pages.Searchclient(driver);
   
    TestModellerLogger.SetLastNodeGuid("2714a67d-87fd-42a3-96d9-efd09aee5080");
    _pagesSearch_Business.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("f039bffc-aa28-4f46-a412-1eb6214091e7");
    _pagesSearch_Business.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("a7b135dd-2fb1-423f-81ac-0b6c00587590");
    _pagesSearch_Business.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("a9ef7b06-b298-4b0b-89e2-7a0187789cab");
    _pagesSearch_Business.Click__NidhiEnt();
    
    

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
    _pagesAddjournalEntry10incBnk.Enter_Account1(sData[8]);
    

    TestModellerLogger.SetLastNodeGuid("5bc7905c-42b2-48fd-bdc0-67b56ebee64f");
    _pagesAddjournalEntry10incBnk.Enter_Debit1(sData[9]);
    


    //TestModellerLogger.SetLastNodeGuid("242ed94c-7fbe-4bd4-b314-a9c171017499");
    //_pagesAddjournalEntry10incBnk.Enter_Note1("note1");
    

    TestModellerLogger.SetLastNodeGuid("5baf4171-eaae-42df-913a-fd780fd55012");
    _pagesAddjournalEntry10incBnk.Enter_Account2(sData[10]);
    

    TestModellerLogger.SetLastNodeGuid("7d4b5d8c-b9a4-4fd9-99b2-f6024b3fadda");
    _pagesAddjournalEntry10incBnk.Enter_Debit2(sData[11]);
    

    //TestModellerLogger.SetLastNodeGuid("1a3d2f92-f18f-41b3-a1ab-2ddb675eb0f5");
    //_pagesAddjournalEntry10incBnk.Enter_Note2("note2");
    

    TestModellerLogger.SetLastNodeGuid("7dd19a67-8d19-4799-8c04-9c45ce0b6f55");
    _pagesAddjournalEntry10incBnk.Enter_Account3(sData[12]);
    

    TestModellerLogger.SetLastNodeGuid("eb440455-aafb-442d-a019-2005211a4440");
    _pagesAddjournalEntry10incBnk.Enter_Debit3(sData[13]);
    


    //TestModellerLogger.SetLastNodeGuid("643a02c5-96cd-412f-9ee4-76aa9663e792");
    //_pagesAddjournalEntry10incBnk.Enter_Note3("note3");
    

    TestModellerLogger.SetLastNodeGuid("3a449702-02bb-41c0-8896-be8229361f57");
    _pagesAddjournalEntry10incBnk.Enter_Account4(sData[14]);
    

    TestModellerLogger.SetLastNodeGuid("08296264-ac9c-4615-bd37-f8bcb01d9874");
    _pagesAddjournalEntry10incBnk.Enter_Debit4(sData[15]);
    

   
    //TestModellerLogger.SetLastNodeGuid("869cf6f4-895a-4290-b9e4-d2d8c1b45fc5");
    //_pagesAddjournalEntry10incBnk.Enter_Note4("note4");
    

    TestModellerLogger.SetLastNodeGuid("d1edcd0a-eefd-44c5-b8c8-7cacf22f0c5f");
    _pagesAddjournalEntry10incBnk.Enter_Account5(sData[16]);
    

    TestModellerLogger.SetLastNodeGuid("a061acf6-a397-472a-b247-bb6b4a391a5f");
    _pagesAddjournalEntry10incBnk.Enter_Debit5(sData[17]);
    

    //TestModellerLogger.SetLastNodeGuid("50083141-32bb-4d37-9c73-e5a538134279");
    //_pagesAddjournalEntry10incBnk.Enter_Note5("note5");
    

    TestModellerLogger.SetLastNodeGuid("488015a8-2d46-4aa6-8aeb-afe5658ccaa3");
    _pagesAddjournalEntry10incBnk.Click_Tick_for_more_line_items();
    
    

    TestModellerLogger.SetLastNodeGuid("6ad08b13-a1b8-4f93-a331-545d921c7bcf");
    _pagesAddjournalEntry10incBnk.Enter_Account6(sData[18]);
    

    TestModellerLogger.SetLastNodeGuid("f2dca219-3424-4522-a898-ea0f2a4b56c1");
    _pagesAddjournalEntry10incBnk.Enter_Debit6(sData[19]);
    

    //TestModellerLogger.SetLastNodeGuid("141f9cd4-35d2-4f33-bec9-f9f64579d965");
    //_pagesAddjournalEntry10incBnk.Enter_Note6("note6");
    

    TestModellerLogger.SetLastNodeGuid("ced5ca5f-583d-4d2d-92af-225462dd30c9");
    _pagesAddjournalEntry10incBnk.Enter_Account7(sData[20]);
    

    TestModellerLogger.SetLastNodeGuid("4863b1a6-6581-4b2a-9f9e-b1d6cbe7ee86");
    _pagesAddjournalEntry10incBnk.Enter_Debit7(sData[21]);
    

    //TestModellerLogger.SetLastNodeGuid("85471c96-5e6e-4fad-ba7f-1fe280aa1b60");
    //_pagesAddjournalEntry10incBnk.Enter_Credit7("");
    

   // TestModellerLogger.SetLastNodeGuid("3a783214-5979-4339-b693-0af5471f24c1");
    //_pagesAddjournalEntry10incBnk.Enter_Note7("note7");
    

    TestModellerLogger.SetLastNodeGuid("4182e525-b9dd-4a57-b253-33883c936d7e");
    _pagesAddjournalEntry10incBnk.Enter_Account8(sData[22]);
    

    TestModellerLogger.SetLastNodeGuid("d7c5d242-62f4-4eb9-80a8-730645de5a35");
    _pagesAddjournalEntry10incBnk.Enter_Debit8(sData[23]);
    

    //TestModellerLogger.SetLastNodeGuid("33a9fe25-0531-4aa3-8446-b55cc15c78a0");
    //_pagesAddjournalEntry10incBnk.Enter_Credit8("");
    

    //TestModellerLogger.SetLastNodeGuid("8d8b6a65-a4ad-44c8-b380-7593908347fa");
   // _pagesAddjournalEntry10incBnk.Enter_Note8("note8");
    

    TestModellerLogger.SetLastNodeGuid("77043df3-8ed7-4403-b124-30f3a3606e6b");
    _pagesAddjournalEntry10incBnk.Enter_Account9(sData[24]);
    

    TestModellerLogger.SetLastNodeGuid("a28d1f7d-d811-4d4e-a3d8-db36de973a9b");
    _pagesAddjournalEntry10incBnk.Enter_Debit9(sData[25]);
    

    //TestModellerLogger.SetLastNodeGuid("8244b198-d419-4a83-92ae-fcbf4383fd00");
    //_pagesAddjournalEntry10incBnk.Enter_Credit9("");
    

    //TestModellerLogger.SetLastNodeGuid("12350f95-ca27-4a99-a27a-a3923f6581e0");
    //_pagesAddjournalEntry10incBnk.Enter_Note9("note9");
    

    TestModellerLogger.SetLastNodeGuid("49473a48-e765-4be1-a015-f4017661532b");
    _pagesAddjournalEntry10incBnk.Enter_Account10(sData[26]);
    

   // TestModellerLogger.SetLastNodeGuid("90bb698a-a84e-48d1-b7ca-623c52860357");
    //_pagesAddjournalEntry10incBnk.Enter_Debit10("1900");
    

    TestModellerLogger.SetLastNodeGuid("d200f683-06cc-44bc-82ac-471a1441ebfd");
    _pagesAddjournalEntry10incBnk.Enter_Credit10(sData[27]);
    

    //TestModellerLogger.SetLastNodeGuid("7d8dcec6-9008-49d2-9413-ee694e1db577");
    //_pagesAddjournalEntry10incBnk.Enter_Note10("note10");
    

    

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
    _pagesverifyBS.Select_selectFinancialYear(sData[28]);
    
    _pagesAddjournalEntry10incBnk.verify_BS_CreditorDueAfterYear_2332_2339();
    

    }

}
