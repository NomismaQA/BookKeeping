package Test_Trial_Balance_RE_Jour_Bank_Supp;

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
public class TC_64_3_FixedAsset_600_609__JournalEntry_Bank_Supplier extends TestBase
{
	public String sTestCaseID=null;
	String[] data=null;
	String Sheet = null;
	
    @Test  (groups= {"SaleInToReconcile","SaleInToReconcile - Default Profile"})
    @TestModellerPath(guid = "8c7c840e-6086-4f3d-b9ff-7b3f3724775c")
    public void GoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClickAgentsP1()throws InterruptedException, IOException, InvalidFormatException, HeadlessException, AWTException
    {
    	sTestCaseID="TC_64";
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
   

//   TestModellerLogger.SetLastNodeGuid("cb49d4cd-87fd-4a49-afab-fd5672342bd1");
//   _JournalEntry.Enter_Clickaccountbox3(data[13]);
//   
//   _JournalEntry.Enter_Enter_Debit_3(data[14]);
   
  // TestModellerLogger.SetLastNodeGuid("2876ec19-50d6-4414-9db3-998398799181");
  // _JournalEntry.Enter_Enter_Note(data[23]);
   
     TestModellerLogger.SetLastNodeGuid("e322cae3-c645-4e40-989d-753f1b48ea5a");
   _JournalEntry.Click_Click_Save_btn();
   
   Trial_Balance.Pages_TrailBalancereport _Pages_TrailBalancereport = new Trial_Balance.Pages_TrailBalancereport(driver);
	
   TestModellerLogger.SetLastNodeGuid("863019ea-a567-4a80-818a-de09361d2451");
   _Pages_TrailBalancereport.Click__Reports_();
   

   TestModellerLogger.SetLastNodeGuid("f852c836-f8c0-4074-9e4e-97622dcbba0e");
   _Pages_TrailBalancereport.Click_Trial_Balance();
   

   TestModellerLogger.SetLastNodeGuid("2afd176b-6534-4f2a-92e0-ad9abd52ad58");
   _Pages_TrailBalancereport.Click_Export_CSV_8();
   

   TestModellerLogger.SetLastNodeGuid("76293cf2-9e97-404e-bc1d-1a8e5cb06826");
   _Pages_TrailBalancereport.Click_Exports_PDF_9();
   
//   _JournalEntry.verifyData();
   
   utilities.Screenshotcapture.FullScreenshot("TC_64_jurnalEntry_Value In Fixed Asset");
//   
//   
    }

    @Test  (groups= {"SaleInToReconcile","SaleInToReconcile - Default Profile"})
    @TestModellerPath(guid = "8c7c840e-6086-4f3d-b9ff-7b3f3724775c")
    public void GoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClickAgentsP2()throws InterruptedException, IOException, InvalidFormatException, HeadlessException, AWTException
    {
    	sTestCaseID="TC_64";
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
//   
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
 

 Trial_Balance.nBANKTRN _nBANKTRN = new Trial_Balance.nBANKTRN(driver);
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
 _nBANKTRN.Enter_Recived_amt(data[14]);
 

 TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
 _nBANKTRN.Enter_spnt_amt(data[10]);
 

// TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
// _nBANKTRN.Select_Select_VATRate("Standard Rate");
 

 TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
 _nBANKTRN.Click_Select_Option1();
 

 TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
 _nBANKTRN.Enter_BOX2(data[9]);
 

// TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
// _nBANKTRN.Click__1400_DATA();
 

 TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
 _nBANKTRN.Click__Save_();
 
 //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 
 TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
 _bankmenu.Click_Bankingmenu();
 

 TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
 _bankmenu.Click_Newmenu();
   
 //TestModellerLogger.SetLastNodeGuid("32c9440758-2f86-4894-829c-0d5b167b4d77");
//_nBANKTRN.Select_BK_SELECT(data[5]);


TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
_nBANKTRN.Enter_NDate(data[5]);


TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
_nBANKTRN.Enter_n_desc(data[8]);


TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
_nBANKTRN.Enter_Recived_amt(data[12]);


TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
_nBANKTRN.Enter_spnt_amt(data[14]);


//TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
//_nBANKTRN.Select_Select_VATRate("Standard Rate");


TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
_nBANKTRN.Click_Select_Option1();


TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
_nBANKTRN.Enter_BOX2(data[11]);


//TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
//_nBANKTRN.Click__1400_DATA();


       TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
     _nBANKTRN.Click__Save_();
 
    Trial_Balance.Pages_TrailBalancereport _Pages_TrailBalancereport = new Trial_Balance.Pages_TrailBalancereport(driver);
	
    TestModellerLogger.SetLastNodeGuid("863019ea-a567-4a80-818a-de09361d2451");
    _Pages_TrailBalancereport.Click__Reports_();
    

    TestModellerLogger.SetLastNodeGuid("f852c836-f8c0-4074-9e4e-97622dcbba0e");
    _Pages_TrailBalancereport.Click_Trial_Balance();
    

    TestModellerLogger.SetLastNodeGuid("2afd176b-6534-4f2a-92e0-ad9abd52ad58");
    _Pages_TrailBalancereport.Click_Export_CSV_8();
    

   // TestModellerLogger.SetLastNodeGuid("76293cf2-9e97-404e-bc1d-1a8e5cb06826");
 //   _Pages_TrailBalancereport.Click_Exports_PDF_9();
    
//    _JournalEntry.verifyData();
    
    utilities.Screenshotcapture.FullScreenshot("TC_64_journalEntry_With_BankEntry_Value In Fixed Asset");
    }
    @Test  (groups= {"SaleInToReconcile","SaleInToReconcile - Default Profile"})
    @TestModellerPath(guid = "8c7c840e-6086-4f3d-b9ff-7b3f3724775c")
    public void GoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClickAgentsP3()throws InterruptedException, IOException, InvalidFormatException, HeadlessException, AWTException
    {
    	sTestCaseID="TC_64";
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

       Trial_Balance .SupplierBillSToFRS _SupplierBillSToFRS = new Trial_Balance.SupplierBillSToFRS(driver);
//  TestModellerLogger.SetLastNodeGuid("7b21b860-8f6c-4e5e-8f4d-0ef9aedf75e5");
//  _SupplierBillSToFRS.GoToUrl();
//  
//
//  TestModellerLogger.SetLastNodeGuid("3d11c569-a0da-4838-a238-3d3cd071f91d");
//  _SupplierBillSToFRS.AssertUrl();
  

  TestModellerLogger.SetLastNodeGuid("5c30d940-2a3c-4ce2-9f6d-f491e71a1755");
  _SupplierBillSToFRS.Click_ExpenditureTAB();
  

  TestModellerLogger.SetLastNodeGuid("02bea7d1-9589-4278-8c66-58e376721799");
  _SupplierBillSToFRS.Click_NewTAB();
  

  TestModellerLogger.SetLastNodeGuid("fc395eef-59ac-4e0c-8092-d11ecdb61b84");
  _SupplierBillSToFRS.Click_NewSupplierBill();
//  

  TestModellerLogger.SetLastNodeGuid("9ed916b8-79f8-4b59-a274-ed9c520242c8");
  _SupplierBillSToFRS.Select_SupplierName(data[15]);
  

//  TestModellerLogger.SetLastNodeGuid("6cbb598e-673a-45cd-9f0a-ec53cb56f09d");
//  _SupplierBillSToFRS.Enter_DefaultCurrency(data[6]);
//  

  TestModellerLogger.SetLastNodeGuid("6516ccf8-ae24-42b1-b271-2bb390a6f8c3");
  _SupplierBillSToFRS.Enter_BillNo(data[16]);
  

  TestModellerLogger.SetLastNodeGuid("12466744-0bd3-4135-9300-e044e7148e58");
  _SupplierBillSToFRS.Enter_Date(data[5]);
  

  TestModellerLogger.SetLastNodeGuid("7ea52093-1dd7-4979-8034-aeaef336d945");
  _SupplierBillSToFRS.Select_ExpenseType(data[9]);
  

  TestModellerLogger.SetLastNodeGuid("de8f87b1-ff3a-421c-9290-6ddaef339bf2");
  _SupplierBillSToFRS.Enter_Description(data[8]);
  

  TestModellerLogger.SetLastNodeGuid("31e40f93-4cb6-45b2-bb91-cdd42e0f2f68");
  _SupplierBillSToFRS.Enter_UnitPrice(data[10]);
  

  //TestModellerLogger.SetLastNodeGuid("956a775c-cdf6-4d7d-949f-76ac35f8991c");
 // _SupplierBillSToFRS.Select_VATRateType(data[11]);
  

//  TestModellerLogger.SetLastNodeGuid("5be5550e-c06b-4dbd-bcbf-748aedd3b634");
//  _SupplierBillSToFRS.Enter_VATRate(data[12]);
//  
//
//  TestModellerLogger.SetLastNodeGuid("1721e266-7328-4f01-8af9-62c60f672a82");
//  _SupplierBillSToFRS.Enter_VATAmount(data[13]);
//  

//  TestModellerLogger.SetLastNodeGuid("86be5d84-b080-4b00-b39a-57ef6d127c84");
//  _SupplierBillSToFRS.Enter_Amount(data[5]);
//  
//
//  TestModellerLogger.SetLastNodeGuid("d76e980e-6867-446d-a13a-3bbe2cc719a9");
//  _SupplierBillSToFRS.Click_Tickformorelineitems();
//  

  TestModellerLogger.SetLastNodeGuid("9720f223-ad75-48cf-9a78-a8a001ca0dfb");
  _SupplierBillSToFRS.Click_SaveButton();
  
    
 Trial_Balance.DebitNoteSToFRS _DebitNoteSToFRS = new Trial_Balance.DebitNoteSToFRS(driver);
//TestModellerLogger.SetLastNodeGuid("a9ac356a-1ff8-48d1-98c6-5613b1e1ba5a");
//_DebitNoteSToFRS.GoToUrl();
//
//
//TestModellerLogger.SetLastNodeGuid("281ed0ae-1966-4313-83f9-f02959a1af8f");
//_DebitNoteSToFRS.AssertUrl();


TestModellerLogger.SetLastNodeGuid("f4ead229-e1a6-4686-9726-2a8d72975380");
_DebitNoteSToFRS.Click_ExpenditureTAB();


TestModellerLogger.SetLastNodeGuid("13d7978e-e074-45d2-8c0b-01b123aa6311");
_DebitNoteSToFRS.Click_NewTAB();


TestModellerLogger.SetLastNodeGuid("e0eca6d7-6b04-416d-855d-2a9e825dcd28");
_DebitNoteSToFRS.Click_NewDebitNote();


TestModellerLogger.SetLastNodeGuid("190c6323-be0b-4dd1-b552-dbe6423a4af8");
_DebitNoteSToFRS.Select_SupplierName(data[17]);


TestModellerLogger.SetLastNodeGuid("c9f1fef7-60b9-4d4b-a4a0-825e5638fb6e");
_DebitNoteSToFRS.Enter_BillNo(data[18]);


TestModellerLogger.SetLastNodeGuid("a8f7d6e5-89f8-4f36-a154-0755a90aa5e9");
_DebitNoteSToFRS.Enter_Date(data[5]);


TestModellerLogger.SetLastNodeGuid("d0e22573-153e-435a-8026-8e497c35f9ee");
_DebitNoteSToFRS.Select_ExpenseType(data[11]);


TestModellerLogger.SetLastNodeGuid("3f663a04-c82a-4f31-a2c8-3238da8ddb0c");
_DebitNoteSToFRS.Enter_Description(data[8]);


TestModellerLogger.SetLastNodeGuid("3b383dc0-235e-4780-9859-f151196feb92");
_DebitNoteSToFRS.Enter_UnitPrice(data[12]);


//TestModellerLogger.SetLastNodeGuid("62f8964d-0533-4137-b19f-ed7484c16874");
//_DebitNoteSToFRS.Select_VATRateType(data[11]);


//TestModellerLogger.SetLastNodeGuid("0c1c1062-a24e-491f-b466-c4f25be009dc");
//_DebitNoteSToFRS.Enter_VATRate();
//
//
//TestModellerLogger.SetLastNodeGuid("df34f121-e6c7-4386-b83d-071d26d7877e");
//_DebitNoteSToFRS.Enter_VATAmount("100");
//
//
//TestModellerLogger.SetLastNodeGuid("d9ad9e73-0fa4-4130-8856-5d6c154b68b4");
//_DebitNoteSToFRS.Enter_Amount_Net("100");
//
//
//TestModellerLogger.SetLastNodeGuid("afe47079-aab8-40ac-8075-8edfd92c146a");
//_DebitNoteSToFRS.Click_Tickformorelineitems();


TestModellerLogger.SetLastNodeGuid("093d78cf-a676-401c-9139-02e7e7db005f");
_DebitNoteSToFRS.Click__Save_();

Trial_Balance.Pages_TrailBalancereport _Pages_TrailBalancereport = new Trial_Balance.Pages_TrailBalancereport(driver);
//
TestModellerLogger.SetLastNodeGuid("863019ea-a567-4a80-818a-de09361d2451");
_Pages_TrailBalancereport.Click__Reports_();


TestModellerLogger.SetLastNodeGuid("f852c836-f8c0-4074-9e4e-97622dcbba0e");
_Pages_TrailBalancereport.Click_Trial_Balance();


TestModellerLogger.SetLastNodeGuid("2afd176b-6534-4f2a-92e0-ad9abd52ad58");
_Pages_TrailBalancereport.Click_Export_CSV_8();


TestModellerLogger.SetLastNodeGuid("76293cf2-9e97-404e-bc1d-1a8e5cb06826");
_Pages_TrailBalancereport.Click_Exports_PDF_9();

//_JournalEntry.verifyData();

utilities.Screenshotcapture.FullScreenshot("TC_64_jurnalEntry_BankEntry_Supplier_Value In Fixed Asset");



    
    }
 

}
    