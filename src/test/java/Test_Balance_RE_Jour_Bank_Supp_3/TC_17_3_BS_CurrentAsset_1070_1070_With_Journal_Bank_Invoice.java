package Test_Balance_RE_Jour_Bank_Supp_3;

import reports.TestNGListener;
import tests.TestBase;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;
import pages.banking.ashiv.TrialBalance;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Generic.ReadExcelData;
import Generic.RetryAnalyzer;
import ie.curiositysoftware.allocation.dto.ResultMergeMethod;
import ie.curiositysoftware.allocation.dto.DataAllocationRow;
import reports.ExtentTestListener;
import ie.curiositysoftware.allocation.dto.DataAllocationResult;
import ie.curiositysoftware.allocation.engine.DataAllocation;
import utilities.ExcelUtility;
import utilities.testmodeller.TestModellerLogger;

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/6cfe1e1e-5a67-48da-b4df-ddfb9ed56645
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 505, profileId = 100420)
public class TC_17_3_BS_CurrentAsset_1070_1070_With_Journal_Bank_Invoice extends TestBase
{
    

	public String sTestCaseID=null;
	String[] data=null;
	String Sheet = null;
	
    @Test  (groups= {"SaleInToReconcile","SaleInToReconcile - Default Profile"})
    @TestModellerPath(guid = "8c7c840e-6086-4f3d-b9ff-7b3f3724775c")
    public void GoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClickAgentsP1()throws Exception
    {
    	sTestCaseID="TC_33";
       	Sheet="TrailBalanceReport_2";
        data = ExcelUtility.toReadExcelData(sTestCaseID, Sheet);
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
       TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
   

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN(data[1]);
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS(data[2]);
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.PartialReconciledCases.AgentSearch _AgentSearch = new pages.PartialReconciledCases.AgentSearch(driver);

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.PartialReconciledCases.Searchclient _Searchclient = new pages.PartialReconciledCases.Searchclient(driver);

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

   

//    pages.DeletejournalEntry1 _pagesDeletejournalEntry1 = new pages.DeletejournalEntry1(driver);
//    /*TestModellerLogger.SetLastNodeGuid("884591c1-7014-4090-9162-f02306bb6d71");
//    _pagesDeletejournalEntry1.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8ae0f19b-10df-4104-b056-4d66f9123654");
//    _pagesDeletejournalEntry1.AssertUrl();*/
//    
//
//    TestModellerLogger.SetLastNodeGuid("658a1a6a-4df2-4aa5-9d3d-a5ac35030b4c");
//    _pagesDeletejournalEntry1.Click_Accountant();
//    
//
//    TestModellerLogger.SetLastNodeGuid("c22ad20b-472b-436f-8a21-aaef00c48180");
//    _pagesDeletejournalEntry1.Click_Journals();
//    
//
//  //  TestModellerLogger.SetLastNodeGuid("5cf0a328-ae76-4d0a-ae9e-9cc8fba22bdc");
// //   _pagesDeletejournalEntry1.Select_ctl00ddlFinancialYear(data[5]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("f8f4724e-9e6f-4bbb-baf2-1ae01e6a4b64");
//    _pagesDeletejournalEntry1.Click_xPath_idchAllRTI();
//    
//
//    TestModellerLogger.SetLastNodeGuid("d4e4d3ec-a2d4-4667-9023-6eb47e216d04");
//    _pagesDeletejournalEntry1.Click_xPath_htmlbodyformmaindiv10div3headerdiva1i();
    
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
	_pagesAddjournalEntry10incBnk.Enter_ctl00cPHtxtDate(data[5]);
 
	_pagesAddjournalEntry10incBnk.Select_Slect_Currency(data[7]);

  	TestModellerLogger.SetLastNodeGuid("441a2306-a64b-4432-8d04-bfd6ce2c3d11");
  	_pagesAddjournalEntry10incBnk.Enter_ctl00cPHtxtDescription(data[8]);


    TestModellerLogger.SetLastNodeGuid("335212ec-d991-4d36-b04a-604fd17dccf5");
    _pagesAddjournalEntry10incBnk.Enter_Account1(data[9]);
    

    TestModellerLogger.SetLastNodeGuid("5bc7905c-42b2-48fd-bdc0-67b56ebee64f");
    _pagesAddjournalEntry10incBnk.Enter_Debit1(data[10]);
    

    TestModellerLogger.SetLastNodeGuid("5baf4171-eaae-42df-913a-fd780fd55012");
    _pagesAddjournalEntry10incBnk.Enter_Account2(data[11]);
    

    TestModellerLogger.SetLastNodeGuid("7d4b5d8c-b9a4-4fd9-99b2-f6024b3fadda");
   
    _pagesAddjournalEntry10incBnk.Enter_Credit2(data[12]);

    //TestModellerLogger.SetLastNodeGuid("1a3d2f92-f18f-41b3-a1ab-2ddb675eb0f5");
    //_pagesAddjournalEntry10incBnk.Enter_Note2("note2");
    

//    TestModellerLogger.SetLastNodeGuid("7dd19a67-8d19-4799-8c04-9c45ce0b6f55");
//    _pagesAddjournalEntry10incBnk.Enter_Account3(data[13]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("eb440455-aafb-442d-a019-2005211a4440");
//    _pagesAddjournalEntry10incBnk.Enter_Debit3(data[14]);
//    
//
//
//    //TestModellerLogger.SetLastNodeGuid("643a02c5-96cd-412f-9ee4-76aa9663e792");
//    //_pagesAddjournalEntry10incBnk.Enter_Note3("note3");
//    
//
//    TestModellerLogger.SetLastNodeGuid("3a449702-02bb-41c0-8896-be8229361f57");
//    _pagesAddjournalEntry10incBnk.Enter_Account4(data[15]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("08296264-ac9c-4615-bd37-f8bcb01d9874");
//    _pagesAddjournalEntry10incBnk.Enter_Debit4(data[16]);
//    
//
//   
//    //TestModellerLogger.SetLastNodeGuid("869cf6f4-895a-4290-b9e4-d2d8c1b45fc5");
//    //_pagesAddjournalEntry10incBnk.Enter_Note4("note4");
//    
//
//    TestModellerLogger.SetLastNodeGuid("d1edcd0a-eefd-44c5-b8c8-7cacf22f0c5f");
//    _pagesAddjournalEntry10incBnk.Enter_Account5(data[17]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("a061acf6-a397-472a-b247-bb6b4a391a5f");
//    _pagesAddjournalEntry10incBnk.Enter_Debit5(data[18]);
//    
//
//    //TestModellerLogger.SetLastNodeGuid("50083141-32bb-4d37-9c73-e5a538134279");
//    //_pagesAddjournalEntry10incBnk.Enter_Note5("note5");
//    
//
//    TestModellerLogger.SetLastNodeGuid("488015a8-2d46-4aa6-8aeb-afe5658ccaa3");
//    _pagesAddjournalEntry10incBnk.Click_Tick_for_more_line_items();
//    
//
//    TestModellerLogger.SetLastNodeGuid("6ad08b13-a1b8-4f93-a331-545d921c7bcf");
//    _pagesAddjournalEntry10incBnk.Enter_Account6(data[19]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("f2dca219-3424-4522-a898-ea0f2a4b56c1");
//    _pagesAddjournalEntry10incBnk.Enter_Debit6(data[20]);
//    
//
//    //TestModellerLogger.SetLastNodeGuid("141f9cd4-35d2-4f33-bec9-f9f64579d965");
//    //_pagesAddjournalEntry10incBnk.Enter_Note6("note6");
//    
////
////    TestModellerLogger.SetLastNodeGuid("ced5ca5f-583d-4d2d-92af-225462dd30c9");
////    _pagesAddjournalEntry10incBnk.Enter_Account7(data[21]);
////    
////
////    TestModellerLogger.SetLastNodeGuid("4863b1a6-6581-4b2a-9f9e-b1d6cbe7ee86");
////    _pagesAddjournalEntry10incBnk.Enter_Debit7(data[22]);
////    
//
//
////    //TestModellerLogger.SetLastNodeGuid("3a783214-5979-4339-b693-0af5471f24c1");
////    //_pagesAddjournalEntry10incBnk.Enter_Note7("note7");
////    
////
////    TestModellerLogger.SetLastNodeGuid("4182e525-b9dd-4a57-b253-33883c936d7e");
////    _pagesAddjournalEntry10incBnk.Enter_Account8(data[23]);
////    
////
////    TestModellerLogger.SetLastNodeGuid("d7c5d242-62f4-4eb9-80a8-730645de5a35");
////    _pagesAddjournalEntry10incBnk.Enter_Debit8(data[24]);
////    
////
////    //TestModellerLogger.SetLastNodeGuid("8d8b6a65-a4ad-44c8-b380-7593908347fa");
////    //_pagesAddjournalEntry10incBnk.Enter_Note8("note8");
////    
//
////    TestModellerLogger.SetLastNodeGuid("77043df3-8ed7-4403-b124-30f3a3606e6b");
////    _pagesAddjournalEntry10incBnk.Enter_Account9(data[25]);
////    
////
////    //TestModellerLogger.SetLastNodeGuid("a28d1f7d-d811-4d4e-a3d8-db36de973a9b");
////   // _pagesAddjournalEntry10incBnk.Enter_Debit9("1800");
////    
////
////    TestModellerLogger.SetLastNodeGuid("8244b198-d419-4a83-92ae-fcbf4383fd00");
////    _pagesAddjournalEntry10incBnk.Enter_Debit9(data[26]);
////    
////
////    //TestModellerLogger.SetLastNodeGuid("12350f95-ca27-4a99-a27a-a3923f6581e0");
////    //_pagesAddjournalEntry10incBnk.Enter_Note9("note9");
////    
////    
//    TestModellerLogger.SetLastNodeGuid("77043df3-8ed7-4403-b124-30f3a3606e6b");
//    _pagesAddjournalEntry10incBnk.Enter_Account7(data[21]);
//    
//
//    //TestModellerLogger.SetLastNodeGuid("a28d1f7d-d811-4d4e-a3d8-db36de973a9b");
//   // _pagesAddjournalEntry10incBnk.Enter_Debit9("1800");
//    
//
//    TestModellerLogger.SetLastNodeGuid("8244b198-d419-4a83-92ae-fcbf4383fd00");
//    _pagesAddjournalEntry10incBnk.Enter_Credit7(data[22]);
//    
    

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
    

   // TestModellerLogger.SetLastNodeGuid("489eb3fd-e97e-49f7-aba2-610610f074e6");
   // _pagesverifyBS.Select_selectFinancialYear(data[26]);
    
    _pagesAddjournalEntry10incBnk.verify_BS_BF_TradeDebtor_1070();
    
utilities.Screenshotcapture.FullScreenshot("TC_17_FixedAsset_Report_Ladger Code_1070-1070_With JournalEntry");
      

    }
    
   

   
        
        @Test  (groups= {"SaleInToReconcile","SaleInToReconcile - Default Profile"})
        @TestModellerPath(guid = "8c7c840e-6086-4f3d-b9ff-7b3f3724775c")
        public void GoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClickAgentsP3()throws Exception
        {
        	sTestCaseID="TC_34";
           	Sheet="TrailBalanceReport_2";
            data = ExcelUtility.toReadExcelData(sTestCaseID, Sheet);
            
            pages.nlogin _nlogin = new pages.nlogin(driver);
           TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
        _nlogin.GoToUrl();
       

        TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
        _nlogin.Enter_nLOGIN(data[1]);
        

        TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
        _nlogin.Enter_nPASS(data[2]);
        

        TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
        _nlogin.Click_Login();
        

    pages.PartialReconciledCases.AgentSearch _AgentSearch = new pages.PartialReconciledCases.AgentSearch(driver);

        TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
        _AgentSearch.Click_Agents();
        

        TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
        _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
        

        TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
        _AgentSearch.Click_Search();
        

        TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
        _AgentSearch.Click__Nidhi1_();
        

    pages.PartialReconciledCases.Searchclient _Searchclient = new pages.PartialReconciledCases.Searchclient(driver);

        TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
        _Searchclient.Click__Clients_();
        

        TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
        _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
        

        TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
        _Searchclient.Click_Searchbtn();
        

        TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
        _Searchclient.Click__NidhiEnt();
        
        pages.PartialReconciledCases.bankmenu _bankmenu = new pages.PartialReconciledCases.bankmenu(driver);
     // TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
     // _bankmenu.GoToUrl();
      
     //
     // TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
     // _bankmenu.AssertUrl();
     // 

      TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
      _bankmenu.Click_Bankingmenu();
      

      TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
      _bankmenu.Click_Newmenu();
      
      Trial_Balance.nBANKTRN_2 _nBANKTRN = new Trial_Balance.nBANKTRN_2(driver);
   // TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
   // _nBANKTRN.GoToUrl();
   // 
   //
   // TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
   // _nBANKTRN.AssertUrl();
   // 

    //TestModellerLogger.SetLastNodeGuid("32c9440758-2f86-4894-829c-0d5b167b4d77");
   // _nBANKTRN.Select_BK_SELECT(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
    _nBANKTRN.Enter_NDate(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
    _nBANKTRN.Enter_n_desc(data[8]);
    

    TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
    _nBANKTRN.Enter_Recived_amt(data[40]);
    

    TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
    _nBANKTRN.Enter_spnt_amt(data[10]);
    

   // TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
   // _nBANKTRN.Select_Select_VATRate("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
    _nBANKTRN.Click_Select_Option1();
    

    TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
    _nBANKTRN.Enter_BOX2(data[9]);
    


    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    
//    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
//    _bankmenu.Click_Bankingmenu();
//    
//    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
//    _bankmenu.Click_Newmenu();
//    
//    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//    
//    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
//    _nBANKTRN.Enter_NDate(data[5]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
//    _nBANKTRN.Enter_n_desc(data[8]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
//    _nBANKTRN.Enter_Recived_amt(data[12]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
//    _nBANKTRN.Enter_spnt_amt(data[40]);
//    
//
//   // TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
//   // _nBANKTRN.Select_Select_VATRate("Standard Rate");
//    
//
//    TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
//    _nBANKTRN.Click_Select_Option1();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
//    _nBANKTRN.Enter_BOX2(data[11]);
//    
//
//
//    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
//    _nBANKTRN.Click__Save_();
    
//    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
//    _bankmenu.Click_Bankingmenu();
//    
//    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
//    _bankmenu.Click_Newmenu();
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
//    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
//    _nBANKTRN.Enter_NDate(data[5]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
//    _nBANKTRN.Enter_n_desc(data[8]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
//    _nBANKTRN.Enter_Recived_amt(data[40]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
//    _nBANKTRN.Enter_spnt_amt(data[14]);
//    
//
//   // TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
//   // _nBANKTRN.Select_Select_VATRate("Standard Rate");
//    
//
//    TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
//    _nBANKTRN.Click_Select_Option1();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
//    _nBANKTRN.Enter_BOX2(data[13]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
//    _nBANKTRN.Click__Save_();
//    
//    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
//    _bankmenu.Click_Bankingmenu();
//    
//    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
//    _bankmenu.Click_Newmenu();
//   ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
//    _nBANKTRN.Enter_NDate(data[5]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
//    _nBANKTRN.Enter_n_desc(data[8]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
//    _nBANKTRN.Enter_Recived_amt(data[40]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
//    _nBANKTRN.Enter_spnt_amt(data[16]);
//    
//
//   // TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
//   // _nBANKTRN.Select_Select_VATRate("Standard Rate");
//    
//
//    TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
//    _nBANKTRN.Click_Select_Option1();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
//    _nBANKTRN.Enter_BOX2(data[15]);
//    
//
//
//    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
//    _nBANKTRN.Click__Save_();
//    
//    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
//    _bankmenu.Click_Bankingmenu();
//    
//    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
//    _bankmenu.Click_Newmenu();
//    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//    
//    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
//    _nBANKTRN.Enter_NDate(data[5]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
//    _nBANKTRN.Enter_n_desc(data[8]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
//    _nBANKTRN.Enter_Recived_amt(data[40]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
//    _nBANKTRN.Enter_spnt_amt(data[18]);
//    
//
//   // TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
//   // _nBANKTRN.Select_Select_VATRate("Standard Rate");
//    
//
//    TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
//    _nBANKTRN.Click_Select_Option1();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
//    _nBANKTRN.Enter_BOX2(data[17]);
//    
//
//
//    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
//    _nBANKTRN.Click__Save_();
//    
//    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
//    _bankmenu.Click_Bankingmenu();
//    
//    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
//    _bankmenu.Click_Newmenu();
//    
//    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//    
//    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
//    _nBANKTRN.Enter_NDate(data[5]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
//    _nBANKTRN.Enter_n_desc(data[8]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
//    _nBANKTRN.Enter_Recived_amt(data[40]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
//    _nBANKTRN.Enter_spnt_amt(data[20]);
//    
//
//   // TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
//   // _nBANKTRN.Select_Select_VATRate("Standard Rate");
//    
//
//    TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
//    _nBANKTRN.Click_Select_Option1();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
//    _nBANKTRN.Enter_BOX2(data[19]);
//    
//
//
//    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
//    _nBANKTRN.Click__Save_();
//    
//    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
//    _bankmenu.Click_Bankingmenu();
//    
//    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
//    _bankmenu.Click_Newmenu();
//    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//    
////    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
////    _nBANKTRN.Enter_NDate(data[5]);
////    
////
////    TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
////    _nBANKTRN.Enter_n_desc(data[8]);
////    
////
////    TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
////    _nBANKTRN.Enter_Recived_amt(data[40]);
////    
////
////    TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
////    _nBANKTRN.Enter_spnt_amt(data[22]);
////    
////
////   // TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
////   // _nBANKTRN.Select_Select_VATRate("Standard Rate");
////    
////
////    TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
////    _nBANKTRN.Click_Select_Option1();
////    
////
////    TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
////    _nBANKTRN.Enter_BOX2(data[21]);
////    
////
////
////    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
////    _nBANKTRN.Click__Save_();
////    
////    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
////    _bankmenu.Click_Bankingmenu();
////    
////    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
////    _bankmenu.Click_Newmenu();
////    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////    
////    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
////    _nBANKTRN.Enter_NDate(data[5]);
////    
////
////    TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
////    _nBANKTRN.Enter_n_desc(data[8]);
////    
////
////    TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
////    _nBANKTRN.Enter_Recived_amt(data[40]);
////    
////
////    TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
////    _nBANKTRN.Enter_spnt_amt(data[24]);
////    
////
////   // TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
////   // _nBANKTRN.Select_Select_VATRate("Standard Rate");
////    
////
////    TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
////    _nBANKTRN.Click_Select_Option1();
////    
////
////    TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
////    _nBANKTRN.Enter_BOX2(data[23]);
////    
////
////
////    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
////    _nBANKTRN.Click__Save_();
////    
////    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
////    _bankmenu.Click_Bankingmenu();
////    
////    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
////    _bankmenu.Click_Newmenu();
////    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////    
////    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
////    _nBANKTRN.Enter_NDate(data[5]);
////    
////
////    TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
////    _nBANKTRN.Enter_n_desc(data[8]);
////    
////
////    TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
////    _nBANKTRN.Enter_Recived_amt(data[40]);
////    
////
////    TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
////    _nBANKTRN.Enter_spnt_amt(data[26]);
////    
////
////   // TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
////   // _nBANKTRN.Select_Select_VATRate("Standard Rate");
////    
////
////  TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
////  _nBANKTRN.Click_Select_Option1();
////    
////
////    TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
////    _nBANKTRN.Enter_BOX2(data[25]);
////    
////
////
////    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
////    _nBANKTRN.Click__Save_();
////    
////    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
////    _bankmenu.Click_Bankingmenu();
////    
////    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
////    _bankmenu.Click_Newmenu();
//    
//    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//    
//    
//    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
//    _nBANKTRN.Enter_NDate(data[5]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
//    _nBANKTRN.Enter_n_desc(data[8]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
//    _nBANKTRN.Enter_Recived_amt(data[22]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
//    _nBANKTRN.Enter_spnt_amt(data[40]);
//    
//
//   // TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
//   // _nBANKTRN.Select_Select_VATRate("Standard Rate");
//    
//
//    TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
//    _nBANKTRN.Click_Select_Option1();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
//    _nBANKTRN.Enter_BOX2(data[21]);
//    
//
//
//    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
//    _nBANKTRN.Click__Save_();
//    
    
    
    pages.verifyBS _pagesverifyBS = new pages.verifyBS(driver);
    /*TestModellerLogger.SetLastNodeGuid("66735795-46bb-49fc-ba78-5039790bd03c");
    _pagesverifyBS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("79019ec2-ec76-4854-8388-63145ba9d001");
    _pagesverifyBS.AssertUrl();*/
    

    TestModellerLogger.SetLastNodeGuid("fc2cdb54-4d1d-4c5e-905e-5ccde4200e69");
    _pagesverifyBS.Click_Reports_tab();
    

    TestModellerLogger.SetLastNodeGuid("195ad398-7e22-49e2-8770-a8548e1fa1a0");
    _pagesverifyBS.Click_Balance_Sheet_link();
    
    _pagesverifyBS.CSVDownload();
    
    
    utilities.Screenshotcapture.FullScreenshot("TC_17_FixedAsset_Report_Ladger Code_1070-1070_With JournalEntry_Bank");
        }
    
    @Test  (groups= {"SaleInToReconcile","SaleInToReconcile - Default Profile"})
    @TestModellerPath(guid = "8c7c840e-6086-4f3d-b9ff-7b3f3724775c")
    public void GoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClickAgentsP2()throws Exception
    {
    	sTestCaseID="TC_34";
       	Sheet="TrailBalanceReport_2";
        data = ExcelUtility.toReadExcelData(sTestCaseID, Sheet);
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
       TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
   

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN(data[1]);
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS(data[2]);
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.PartialReconciledCases.AgentSearch _AgentSearch = new pages.PartialReconciledCases.AgentSearch(driver);

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.PartialReconciledCases.Searchclient _Searchclient = new pages.PartialReconciledCases.Searchclient(driver);

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    
    
    
    
    Trial_Balance.SaleInvoice _SaleInvoice = new Trial_Balance.SaleInvoice(driver);
//  TestModellerLogger.SetLastNodeGuid("2f331494-c0ec-443e-b258-bdf3d2f9d9fc");
//  _SaleInvoice.GoToUrl();
//  
//
//  TestModellerLogger.SetLastNodeGuid("281121da-f0ce-4629-a4d1-0bc9b4260347");
//  _SaleInvoice.AssertUrl();
//  

  TestModellerLogger.SetLastNodeGuid("38510c8a-daac-4ff8-83f3-54b176440787");
  _SaleInvoice.Click_SalesTab();
  

  TestModellerLogger.SetLastNodeGuid("2ce6ef22-01ee-4e82-bcb0-f7ce06badd95");
  _SaleInvoice.Click_NewButton();
  

  TestModellerLogger.SetLastNodeGuid("b605bf48-53b8-4f7f-a009-9ea8d59b69ba");
  _SaleInvoice.Click_NewInvoice();
  

 // TestModellerLogger.SetLastNodeGuid("4e83b316-7f8b-49b7-a97f-e85cefb020f0");
 // _SaleInvoice.Select_CustomerName(data[5]);
  

 // TestModellerLogger.SetLastNodeGuid("f3edcc35-8d70-4902-81f0-9c5d760fac46");
  //_SaleInvoice.Enter_InvoiceNo(data[6]);
  

  TestModellerLogger.SetLastNodeGuid("6f885a16-e34c-4d0d-914a-a726c1fa9617");
  _SaleInvoice.Enter_InvoiceDate(data[5]);
  

  TestModellerLogger.SetLastNodeGuid("294097b8-ccc5-4eb7-baec-1a26ca1364f0");
  _SaleInvoice.Select_IncomeType("Sale");
  

  TestModellerLogger.SetLastNodeGuid("5ccbf01b-65a3-47f5-b916-dab48aab691f");
  _SaleInvoice.Enter_Description(data[8]);
  

  TestModellerLogger.SetLastNodeGuid("73677a32-1892-47f6-9783-a1072478778a");
  _SaleInvoice.Enter_UnitPrice(data[10]);
  

  TestModellerLogger.SetLastNodeGuid("d810d5bf-a960-434c-9172-1671dd383495");
  _SaleInvoice.Enter_Quantity("1");
  

  //TestModellerLogger.SetLastNodeGuid("516c7236-f043-4de9-b128-99997ccf1604");
  //_SaleInvoice.Select_VATRate(data[12]);
  

  //TestModellerLogger.SetLastNodeGuid("cb6d5101-0be0-4519-b1aa-5e71dcdfbef3");
  //_SaleInvoice.Click_Tickformorelineitems();
  

//  TestModellerLogger.SetLastNodeGuid("6aeae28b-fd85-4712-8710-18e4b190dd19");
//   _SaleInvoice.Enter_Note(data[13]);
  

  TestModellerLogger.SetLastNodeGuid("2508d3fa-348f-48f2-914a-4d43591ded90");
  _SaleInvoice.Click_SaveButton();
        
  pages.verifyBS _pagesverifyBS = new pages.verifyBS(driver);
  /*TestModellerLogger.SetLastNodeGuid("66735795-46bb-49fc-ba78-5039790bd03c");
  _pagesverifyBS.GoToUrl();
  

  TestModellerLogger.SetLastNodeGuid("79019ec2-ec76-4854-8388-63145ba9d001");
  _pagesverifyBS.AssertUrl();*/
  

  TestModellerLogger.SetLastNodeGuid("fc2cdb54-4d1d-4c5e-905e-5ccde4200e69");
  _pagesverifyBS.Click_Reports_tab();
  

  TestModellerLogger.SetLastNodeGuid("195ad398-7e22-49e2-8770-a8548e1fa1a0");
  _pagesverifyBS.Click_Balance_Sheet_link();
  
  _pagesverifyBS.CSVDownload();
  
  
  utilities.Screenshotcapture.FullScreenshot("TC_17_FixedAsset_Report_Ladger Code_1070-1070_With Invoice");
    
    
    
    
    
    
    

}
}
