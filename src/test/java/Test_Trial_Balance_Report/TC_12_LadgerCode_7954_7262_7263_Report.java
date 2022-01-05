package Test_Trial_Balance_Report;

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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/47c92856-78ee-4b1a-a893-c561a22d7ce2
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1183, profileId = 101073)
public class TC_12_LadgerCode_7954_7262_7263_Report extends TestBase
{
	public String sTestCaseID=null;
	String[] data=null;
	String Sheet = null;
	
 @Test  (groups= {"SaleInToReconcile","SaleInToReconcile - Default Profile"})
    @TestModellerPath(guid = "8c7c840e-6086-4f3d-b9ff-7b3f3724775c")
    public void GoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClickAgentsP1() throws InterruptedException, IOException, InvalidFormatException, HeadlessException, AWTException
    {
    	sTestCaseID="TC_12";
       	Sheet="TrailBalanceReport";
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
    
    
    

    pages.DeletejournalEntry1 _pagesDeletejournalEntry1 = new pages.DeletejournalEntry1(driver);
  
    

    TestModellerLogger.SetLastNodeGuid("658a1a6a-4df2-4aa5-9d3d-a5ac35030b4c");
    _pagesDeletejournalEntry1.Click_Accountant();
    

    TestModellerLogger.SetLastNodeGuid("c22ad20b-472b-436f-8a21-aaef00c48180");
    _pagesDeletejournalEntry1.Click_Journals();
    

   // TestModellerLogger.SetLastNodeGuid("5cf0a328-ae76-4d0a-ae9e-9cc8fba22bdc");
  //  _pagesDeletejournalEntry1.Select_ctl00ddlFinancialYear(sData[5]);
    

    TestModellerLogger.SetLastNodeGuid("f8f4724e-9e6f-4bbb-baf2-1ae01e6a4b64");
    _pagesDeletejournalEntry1.Click_xPath_idchAllRTI();
    

    TestModellerLogger.SetLastNodeGuid("d4e4d3ec-a2d4-4667-9023-6eb47e216d04");
    _pagesDeletejournalEntry1.Click_xPath_htmlbodyformmaindiv10div3headerdiva1i();
      
    pages.PartialReconciledCases.Reconcilation _Reconcilation = new pages.PartialReconciledCases.Reconcilation(driver);
    

    TestModellerLogger.SetLastNodeGuid("5fa7c856-5fe6-458c-94fd-c74460dd9b1f");
    _Reconcilation.Click_Acntantleftmenu();
    
    Trial_Balance.JournalEntry _JournalEntry = new Trial_Balance.JournalEntry(driver);
   

   TestModellerLogger.SetLastNodeGuid("6147744d-5b4e-4fbe-b7a3-333858b16f4a");
   _JournalEntry.Click_plusiconclick();
   

   TestModellerLogger.SetLastNodeGuid("e9c9ea8e-b958-43ca-8728-3b429b4aaecb");
   _JournalEntry.Enter_Enter_tDate(data[5]);
   
 //  TestModellerLogger.SetLastNodeGuid("e9c9ea8e-b958-43ca-8728-3b429b4aaecb");
 //  _JournalEntry.Enter_Reverse_Date(data[6]);
   
   TestModellerLogger.SetLastNodeGuid("82bd70b7-b343-40f6-959b-ab6331ed8fbe");
   _JournalEntry.Select_Slect_Currency(data[7]);

   TestModellerLogger.SetLastNodeGuid("94504f9f-098b-42ad-82b3-a743456020fc");
   _JournalEntry.Enter_Enter_Description(data[8]);

   TestModellerLogger.SetLastNodeGuid("cb49d4cd-87fd-4a49-afab-fd5672342bd1");
   _JournalEntry.Enter_Clickaccountbox(data[9]);
   

   TestModellerLogger.SetLastNodeGuid("9bffefbc-952c-4681-b0f1-4d6cdd9abcb1");
   _JournalEntry.Enter_Enter_Debit(data[10]);
   
  // TestModellerLogger.SetLastNodeGuid("2876ec19-50d6-4414-9db3-998398799181");
  // _JournalEntry.Enter_Enter_Note(data[20]);
   
   TestModellerLogger.SetLastNodeGuid("cb49d4cd-87fd-4a49-afab-fd5672342bd1");
   _JournalEntry.Enter_Clickaccountbox2(data[11]);

   TestModellerLogger.SetLastNodeGuid("248e3484-b1c0-489f-b3aa-53b8d02b9c80");
   _JournalEntry.Enter_Enter_Credit(data[12]);
   

   TestModellerLogger.SetLastNodeGuid("cb49d4cd-87fd-4a49-afab-fd5672342bd1");
   _JournalEntry.Enter_Clickaccountbox3(data[13]);
   
   _JournalEntry.Enter_Enter_Debit_3(data[14]);
   
  // TestModellerLogger.SetLastNodeGuid("2876ec19-50d6-4414-9db3-998398799181");
  // _JournalEntry.Enter_Enter_Note(data[23]);
   
     TestModellerLogger.SetLastNodeGuid("e322cae3-c645-4e40-989d-753f1b48ea5a");
   _JournalEntry.Click_Click_Save_btn();
   
 
	Trial_Balance.Pages_TrailBalancereport _Pages_TrailBalancereport = new Trial_Balance.Pages_TrailBalancereport(driver);
	
    TestModellerLogger.SetLastNodeGuid("863019ea-a567-4a80-818a-de09361d2451");
    _Pages_TrailBalancereport.Click__Reports_();
    

    TestModellerLogger.SetLastNodeGuid("f852c836-f8c0-4074-9e4e-97622dcbba0e");
    _Pages_TrailBalancereport.Click_Trial_Balance();
    

//    TestModellerLogger.SetLastNodeGuid("abc4a879-d2a9-488f-810e-9389b3abf07d");
//    _Pages_TrailBalancereport.Select_Select_CompareTo_3("End of This Financial Year");
//    
//
//    TestModellerLogger.SetLastNodeGuid("591564cd-f922-49a8-845f-d0d27a343127");
//    _Pages_TrailBalancereport.Enter_Enter_DateFrom_4("44545");
//    
//
//    TestModellerLogger.SetLastNodeGuid("56fee559-eaff-416c-adbf-f3568aaa7ac9");
//    _Pages_TrailBalancereport.Enter_Enter_CompareWith_5("1122");
//    
//
//    TestModellerLogger.SetLastNodeGuid("8f279cda-136e-460b-8de5-4bf9479dd92e");
//    _Pages_TrailBalancereport.Click_Update_6();
//    
//
//    TestModellerLogger.SetLastNodeGuid("82ef5f23-22a7-4088-97b1-0b115f4cd94a");
//    _Pages_TrailBalancereport.Click_Show_Detail_7();
    
    


    TestModellerLogger.SetLastNodeGuid("2afd176b-6534-4f2a-92e0-ad9abd52ad58");
    _Pages_TrailBalancereport.Click_Export_CSV_8();
    

    TestModellerLogger.SetLastNodeGuid("76293cf2-9e97-404e-bc1d-1a8e5cb06826");
    _Pages_TrailBalancereport.Click_Exports_PDF_9();
    
    utilities.Screenshotcapture.Full("TC_12_LadgerCode_7954_7262_7263_Report_DEBIT=CREDIT");
    
 
    TestModellerLogger.SetLastNodeGuid("5fa7c856-5fe6-458c-94fd-c74460dd9b1f");
    _Reconcilation.Click_Acntantleftmenu();
    
   
   

   TestModellerLogger.SetLastNodeGuid("6147744d-5b4e-4fbe-b7a3-333858b16f4a");
   _JournalEntry.Click_plusiconclick();
   

   TestModellerLogger.SetLastNodeGuid("e9c9ea8e-b958-43ca-8728-3b429b4aaecb");
   _JournalEntry.Enter_Enter_tDate(data[5]);
   
 //  TestModellerLogger.SetLastNodeGuid("e9c9ea8e-b958-43ca-8728-3b429b4aaecb");
 //  _JournalEntry.Enter_Reverse_Date(data[6]);
   
   TestModellerLogger.SetLastNodeGuid("82bd70b7-b343-40f6-959b-ab6331ed8fbe");
   _JournalEntry.Select_Slect_Currency(data[7]);

   TestModellerLogger.SetLastNodeGuid("94504f9f-098b-42ad-82b3-a743456020fc");
   _JournalEntry.Enter_Enter_Description(data[8]);

   TestModellerLogger.SetLastNodeGuid("cb49d4cd-87fd-4a49-afab-fd5672342bd1");
   _JournalEntry.Enter_Clickaccountbox(data[9]);
   

   TestModellerLogger.SetLastNodeGuid("9bffefbc-952c-4681-b0f1-4d6cdd9abcb1");
   _JournalEntry.Enter_Enter_Debit(data[10]);
   
  // TestModellerLogger.SetLastNodeGuid("2876ec19-50d6-4414-9db3-998398799181");
  // _JournalEntry.Enter_Enter_Note(data[20]);
   
   TestModellerLogger.SetLastNodeGuid("cb49d4cd-87fd-4a49-afab-fd5672342bd1");
   _JournalEntry.Enter_Clickaccountbox2(data[11]);

   TestModellerLogger.SetLastNodeGuid("248e3484-b1c0-489f-b3aa-53b8d02b9c80");
   _JournalEntry.Enter_Enter_Credit(data[12]);
   

   TestModellerLogger.SetLastNodeGuid("cb49d4cd-87fd-4a49-afab-fd5672342bd1");
   _JournalEntry.Enter_Clickaccountbox3(data[13]);
   
   _JournalEntry.Enter_Enter_Debit_3(data[14]);
   
  // TestModellerLogger.SetLastNodeGuid("2876ec19-50d6-4414-9db3-998398799181");
  // _JournalEntry.Enter_Enter_Note(data[23]);
   
     TestModellerLogger.SetLastNodeGuid("e322cae3-c645-4e40-989d-753f1b48ea5a");
   _JournalEntry.Click_Click_Save_btn();
   
   
	
   TestModellerLogger.SetLastNodeGuid("863019ea-a567-4a80-818a-de09361d2451");
   _Pages_TrailBalancereport.Click__Reports_();
   

   TestModellerLogger.SetLastNodeGuid("f852c836-f8c0-4074-9e4e-97622dcbba0e");
   _Pages_TrailBalancereport.Click_Trial_Balance();
   

//   TestModellerLogger.SetLastNodeGuid("abc4a879-d2a9-488f-810e-9389b3abf07d");
//   _Pages_TrailBalancereport.Select_Select_CompareTo_3("End of This Financial Year");
//   
//
//   TestModellerLogger.SetLastNodeGuid("591564cd-f922-49a8-845f-d0d27a343127");
//   _Pages_TrailBalancereport.Enter_Enter_DateFrom_4("44545");
//   
//
//   TestModellerLogger.SetLastNodeGuid("56fee559-eaff-416c-adbf-f3568aaa7ac9");
//   _Pages_TrailBalancereport.Enter_Enter_CompareWith_5("1122");
//   
//
//   TestModellerLogger.SetLastNodeGuid("8f279cda-136e-460b-8de5-4bf9479dd92e");
//   _Pages_TrailBalancereport.Click_Update_6();
//   
//
//   TestModellerLogger.SetLastNodeGuid("82ef5f23-22a7-4088-97b1-0b115f4cd94a");
//   _Pages_TrailBalancereport.Click_Show_Detail_7();
   
   


   TestModellerLogger.SetLastNodeGuid("2afd176b-6534-4f2a-92e0-ad9abd52ad58");
   _Pages_TrailBalancereport.Click_Export_CSV_8();
   

   TestModellerLogger.SetLastNodeGuid("76293cf2-9e97-404e-bc1d-1a8e5cb06826");
   _Pages_TrailBalancereport.Click_Exports_PDF_9();
    
    
    
   utilities.Screenshotcapture.Full("TC_12_One More Entry_LadgerCode_7954_7262_7263_Report_DEBIT=CREDIT");
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
}
    