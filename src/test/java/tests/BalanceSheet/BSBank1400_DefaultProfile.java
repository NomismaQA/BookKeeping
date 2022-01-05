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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/e1f3cfc2-0e12-4574-a388-e698ac0ead53
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 525, profileId = 100436)
public class BSBank1400_DefaultProfile extends TestBase
{
    

	String sTestCaseID=null;
    String[] sData=null;
    String Sheet =null;
    @Test  (retryAnalyzer = RetryAnalyzer.class,groups= {"e186a73f-a420-4210-8ed7-29e7235b1e65","BS_Bank-1400","BS_Bank-1400 - Default Profile"})
    @TestModellerPath(guid = "e186a73f-a420-4210-8ed7-29e7235b1e65")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginBtnsuccessfulloginGoToUrl() throws NoSuchFieldException, SecurityException, IllegalArgumentException, Exception, AWTException
    {
    	sTestCaseID="BSBank1400_2";
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
    

//pages.Add_Transaction _pagesAdd_Transaction = new pages.Add_Transaction(driver);
    /*TestModellerLogger.SetLastNodeGuid("d7c91a28-698c-4257-9132-82c7ea4e8617");
    _pagesAdd_Transaction.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7604d10f-3014-4be3-922c-cec712485993");
    _pagesAdd_Transaction.AssertUrl();*/
    

    /*TestModellerLogger.SetLastNodeGuid("dba06c22-76c5-4428-8d68-96f45e3e659e");
    _pagesAdd_Transaction.Click_Banking_tab();
    

    TestModellerLogger.SetLastNodeGuid("4341fe8b-5b65-4843-a7e9-c59a3c91a0bd");
    _pagesAdd_Transaction.Click__Transaction_();
    

    TestModellerLogger.SetLastNodeGuid("f8d6c1a5-c249-4f7e-80d0-ed4ec43e8280");
    _pagesAdd_Transaction.Click_addTransaction();
    

    TestModellerLogger.SetLastNodeGuid("ee8699ec-1615-4b0b-8c4b-02024eece9cf");
    _pagesAdd_Transaction.Select_SelectAccount(sData[6]);
    

    TestModellerLogger.SetLastNodeGuid("8425d083-c260-4b20-b8b0-9dfa79ea392f");
    _pagesAdd_Transaction.Enter_txtDate(sData[7]);
    

    TestModellerLogger.SetLastNodeGuid("09b0604d-d523-4df8-8a82-54e30c413c2d");
    _pagesAdd_Transaction.Enter_txtDescription(sData[8]);
    

    //TestModellerLogger.SetLastNodeGuid("5f6dfc3e-0ac7-4e78-bef7-63c5a9321f83");
    //_pagesAdd_Transaction.Enter_DbAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("2414e476-38cf-4d3f-9de3-f12dd0376feb");
    _pagesAdd_Transaction.Enter_CrAmount(sData[9]);
    

    TestModellerLogger.SetLastNodeGuid("5f56d442-d11b-492f-a402-11ca75a3660f");
    _pagesAdd_Transaction.Select_ddVATRate(sData[10]);
    

    TestModellerLogger.SetLastNodeGuid("75b98bf3-8491-483a-80a4-0b1240c2df03");
    _pagesAdd_Transaction.Enter_Allocated_to(sData[11]);
    
    TestModellerLogger.SetLastNodeGuid("654a17d5-e665-43a9-8b83-15c3d6605fc3");
    _pagesAdd_Transaction.Click__Save_();
    

    TestModellerLogger.SetLastNodeGuid("4a0e4bd3-a5de-419b-a7d0-072fc96e8722");
    _pagesAdd_Transaction.Click_Success_msg();*/

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
    
//pages.AddjournalEntry10incBnk _pagesAddjournalEntry10incBnk = new pages.AddjournalEntry10incBnk(driver);    
    //_pagesAddjournalEntry10incBnk.verify_TrialBalance_BS_Bank_1400(sData[13], sData[14], sData[9]);
    _pagesAddjournalEntry10incBnk.verify_BS_Bank1400();

    //pages.DelTransaction2 DelTransaction2 = new pages.DelTransaction2(driver);
    /*TestModellerLogger.SetLastNodeGuid("3af6181c-0d37-4a86-a36e-9b6bb6a76943");
    DelTransaction2.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("143bf20f-be8a-4f56-b4be-37427418dc22");
    DelTransaction2.AssertUrl();*/
    

    /*TestModellerLogger.SetLastNodeGuid("2a51c1c2-f863-40c5-867d-631a6d4edb77");
    DelTransaction2.Click_Banking_tab();
    

    TestModellerLogger.SetLastNodeGuid("c1e455bc-bb54-4af8-8bda-75628e3cb8b9");
    DelTransaction2.Select_SelectFinancialYear(sData[5]);
    

    TestModellerLogger.SetLastNodeGuid("5b4998bd-4ebd-4a1e-8276-4f82dbc5d75c");
    DelTransaction2.Select_Select_Account(sData[6]);
    

    TestModellerLogger.SetLastNodeGuid("5e930f7c-147d-4bba-ba71-1041a24ce201");
    DelTransaction2.Enter_DateFrom(sData[15]);
    

    TestModellerLogger.SetLastNodeGuid("e9e19320-8a1c-4c8e-9b88-cc0cc7dedced");
    DelTransaction2.Enter_DateTo(sData[16]);
    

    TestModellerLogger.SetLastNodeGuid("cf9c1bcd-9c66-4ba7-a3fe-065d3f048770");
    DelTransaction2.Click_Update_();
    

    TestModellerLogger.SetLastNodeGuid("ca0a418e-1afe-4a46-850b-8310b62df4ac");
    DelTransaction2.Click_del_Option();
    

    TestModellerLogger.SetLastNodeGuid("1ab263c7-0b70-4c57-9c22-3704e73319f6");
    DelTransaction2.Click__Delete_();
    

    TestModellerLogger.SetLastNodeGuid("f4e96bac-c788-4bbd-ad77-3f0682aff566");
    DelTransaction2.Click_Yes();*/
    

    }

}
