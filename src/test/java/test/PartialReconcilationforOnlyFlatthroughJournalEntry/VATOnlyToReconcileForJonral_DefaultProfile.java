package test.PartialReconcilationforOnlyFlatthroughJournalEntry;

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
public class VATOnlyToReconcileForJonral_DefaultProfile extends TestBase
{
	public String sTestCaseID=null;
	String[] data=null;
	String Sheet = null;
	
 @Test  (groups= {"SaleInToReconcile","SaleInToReconcile - Default Profile"})
    @TestModellerPath(guid = "8c7c840e-6086-4f3d-b9ff-7b3f3724775c")
    public void GoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClickAgentsP1() throws InterruptedException, IOException, InvalidFormatException, HeadlessException, AWTException
    {
    	sTestCaseID="TC551";
       	Sheet="JournalReconcile";
        data = ExcelUtility.toReadExcelData(sTestCaseID, Sheet);
        
        pages.PartialReconciledCases.nlogin _nlogin = new pages.PartialReconciledCases.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN(data[1]);
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS(data[2]);
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.PartialReconciledCases.AgentSearch _AgentSearch = new pages.PartialReconciledCases.AgentSearch(driver);
//    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
//    _AgentSearch.GoToUrl();
//    

//    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
//    _AgentSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.PartialReconciledCases.Searchclient _Searchclient = new pages.PartialReconciledCases.Searchclient(driver);
//    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
//    _Searchclient.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
//    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

    pages.PartialReconciledCases.VATOnlyInvoice _VATOnlyInvoice = new pages.PartialReconciledCases.VATOnlyInvoice(driver);
//  TestModellerLogger.SetLastNodeGuid("022b9dec-7d48-413f-862f-046626f82bd5");
//  _VATOnlyInvoice.GoToUrl();
//  
//
//  TestModellerLogger.SetLastNodeGuid("56572bdb-37f0-4286-88f7-beee95c645c7");
//  _VATOnlyInvoice.AssertUrl();
  

  TestModellerLogger.SetLastNodeGuid("f0e2d203-a051-48b0-b278-8778e9dd05d2");
  _VATOnlyInvoice.Click_SalesTAB();
  

  TestModellerLogger.SetLastNodeGuid("274df502-bd54-494b-ac44-5675d06e691c");
  _VATOnlyInvoice.Click_NewTAB();
  

  TestModellerLogger.SetLastNodeGuid("d36b3d17-9a87-4ed1-b5ec-4c04544f4fc7");
  _VATOnlyInvoice.Click_VATOnlyInvoice();
  

  TestModellerLogger.SetLastNodeGuid("af5213eb-5d8a-417b-a6c7-f9001ab08632");
  _VATOnlyInvoice.Select_CustomerName(data[5]);
  

  TestModellerLogger.SetLastNodeGuid("fb8ddf53-f049-479e-bc7f-7616b0c519b3");
  _VATOnlyInvoice.Enter_InvoiceNo(data[6]);
  

  TestModellerLogger.SetLastNodeGuid("8c89f2f4-6bf3-42a1-88c1-ca505b8030fd");
  _VATOnlyInvoice.Enter_InvoiceDate(data[7]);
  

  TestModellerLogger.SetLastNodeGuid("06ffea53-9b87-4d49-94a9-5911b6d93cf5");
  _VATOnlyInvoice.Enter_SubTotal(data[8]);
  

  TestModellerLogger.SetLastNodeGuid("17ab7377-3f0f-4615-b7e3-000f92b59dc3");
  _VATOnlyInvoice.Select_VATRateType(data[9]);
  
  

//  TestModellerLogger.SetLastNodeGuid("83b15b8a-fef9-45c4-99a5-7b6bf52e2e39");
//  _VATOnlyInvoice.Enter_VATRate("");
//  
//
//  TestModellerLogger.SetLastNodeGuid("0b562ab8-e40c-4f33-b2d0-0682cb23afb6");
//  _VATOnlyInvoice.Enter_VATAmount("");
//  
//
//  TestModellerLogger.SetLastNodeGuid("945fc6d7-6180-473c-a32b-0a95f5a89bac");
//  _VATOnlyInvoice.Enter_GrossTotal("");
//  

//  TestModellerLogger.SetLastNodeGuid("1b120cb0-aa11-4b86-a6d8-2e40fc7e36ef");
//  _VATOnlyInvoice.Enter_ConvertedAmount("100");
  

  TestModellerLogger.SetLastNodeGuid("a2bdfe37-c194-4ea0-b657-4d576468655c");
  _VATOnlyInvoice.Click_SaveButton();

    pages.PartialReconciledCases.Reconcilation _Reconcilation = new pages.PartialReconciledCases.Reconcilation(driver);
  //TestModellerLogger.SetLastNodeGuid("fc1c2835-8b62-466d-8b91-b2d2b6852de5");
  //_Reconcilation.GoToUrl();
  //
  //
  //TestModellerLogger.SetLastNodeGuid("30a799ca-18ec-4e8a-9931-57fc4ea2c02b");
  //_Reconcilation.AssertUrl();


  TestModellerLogger.SetLastNodeGuid("5fa7c856-5fe6-458c-94fd-c74460dd9b1f");
  _Reconcilation.Click_Acntantleftmenu();


//  TestModellerLogger.SetLastNodeGuid("2f750f49-e648-45ca-898e-d60728db5570");
//  _Reconcilation.Click_plussign();
//
//
//  TestModellerLogger.SetLastNodeGuid("a3808a66-3e56-4e52-b2c1-61b7d5d15b32");
//  _Reconcilation.Select_SelectAccountType1(data[22]);
//
//  //
  //TestModellerLogger.SetLastNodeGuid("2018e2d9-51c8-4e54-8424-0f5147db31d6");
  //_Reconcilation.Select_SelectAccount1(data[21]);
   
    
    pages.JournalEntry _JournalEntry = new pages.JournalEntry(driver);
// TestModellerLogger.SetLastNodeGuid("d0c3eb81-6771-4b77-bb75-55a02294146e");
// _JournalEntry.GoToUrl();
// 

// TestModellerLogger.SetLastNodeGuid("f6e8ad6d-3564-4c46-83cb-581c6935ddc6");
// _JournalEntry.AssertUrl();
// 


 

 TestModellerLogger.SetLastNodeGuid("6147744d-5b4e-4fbe-b7a3-333858b16f4a");
 _JournalEntry.Click_plusiconclick();
 

 TestModellerLogger.SetLastNodeGuid("e9c9ea8e-b958-43ca-8728-3b429b4aaecb");
 _JournalEntry.Enter_Enter_tDate(data[10]);
 
 TestModellerLogger.SetLastNodeGuid("e9c9ea8e-b958-43ca-8728-3b429b4aaecb");
 _JournalEntry.Enter_Reverse_Date(data[11]);
 
 TestModellerLogger.SetLastNodeGuid("82bd70b7-b343-40f6-959b-ab6331ed8fbe");
 _JournalEntry.Select_Slect_Currency(data[12]);

 TestModellerLogger.SetLastNodeGuid("94504f9f-098b-42ad-82b3-a743456020fc");
 _JournalEntry.Enter_Enter_Description(data[13]);

 TestModellerLogger.SetLastNodeGuid("cb49d4cd-87fd-4a49-afab-fd5672342bd1");
 _JournalEntry.Enter_Clickaccountbox(data[14]);
 

 TestModellerLogger.SetLastNodeGuid("9bffefbc-952c-4681-b0f1-4d6cdd9abcb1");
 _JournalEntry.Enter_Enter_Debit(data[15]);
 
// TestModellerLogger.SetLastNodeGuid("2876ec19-50d6-4414-9db3-998398799181");
// _JournalEntry.Enter_Enter_Note(data[20]);
 
 TestModellerLogger.SetLastNodeGuid("cb49d4cd-87fd-4a49-afab-fd5672342bd1");
 _JournalEntry.Enter_Clickaccountbox2(data[16]);

 TestModellerLogger.SetLastNodeGuid("248e3484-b1c0-489f-b3aa-53b8d02b9c80");
 _JournalEntry.Enter_Enter_Credit(data[17]);
 

// TestModellerLogger.SetLastNodeGuid("2876ec19-50d6-4414-9db3-998398799181");
// _JournalEntry.Enter_Enter_Note(data[23]);
 
   TestModellerLogger.SetLastNodeGuid("e322cae3-c645-4e40-989d-753f1b48ea5a");
 _JournalEntry.Click_Click_Save_btn();
 
 //    TestModellerLogger.SetLastNodeGuid("0892baec-0422-496a-93f9-1028cef59d2c");
//    _Reconcilation.Click_View_Reconciled_button1();
//    
// TestModellerLogger.SetLastNodeGuid("5fa7c856-5fe6-458c-94fd-c74460dd9b1f");
// _Reconcilation.Click_Acntantleftmenu();


 TestModellerLogger.SetLastNodeGuid("2f750f49-e648-45ca-898e-d60728db5570");
 _Reconcilation.Click_plussign();


 TestModellerLogger.SetLastNodeGuid("a3808a66-3e56-4e52-b2c1-61b7d5d15b32");
 _Reconcilation.Select_SelectAccountType1(data[18]);

 TestModellerLogger.SetLastNodeGuid("2018e2d9-51c8-4e54-8424-0f5147db31d6");
_Reconcilation.Select_SelectAccount1(data[19]);

    pages.PartialReconciledCases.PartialReconcilationLAtestInvoice_JonralEntry _PartialReconcilationLAtest = new pages.PartialReconciledCases.PartialReconcilationLAtestInvoice_JonralEntry(driver);
  //TestModellerLogger.SetLastNodeGuid("511bd3c6-4bfe-44f1-85bd-d9c919623efb");
  //_PartialReconcilationLAtest.GoToUrl();
  //
  //
  //TestModellerLogger.SetLastNodeGuid("6e247121-1606-4c0e-beb4-b3e6cb7495a3");
  //_PartialReconcilationLAtest.AssertUrl();


  TestModellerLogger.SetLastNodeGuid("af0c7fbd-9d1e-4a30-9e46-78b9d63e1c8f");
  _PartialReconcilationLAtest.Click_SelectALL();


  //TestModellerLogger.SetLastNodeGuid("d60148fa-f80f-4012-b7db-ab2180373216");
  //_PartialReconcilationLAtest.Click_ReconcileSelected();


  TestModellerLogger.SetLastNodeGuid("56eb2524-f022-46bb-bfc6-e57cfeaf10b8");
  _PartialReconcilationLAtest.Click_UngroupSelected();


  TestModellerLogger.SetLastNodeGuid("ca75e642-3957-4d56-af81-a254557876ea");
  _PartialReconcilationLAtest.Click_R1();


  TestModellerLogger.SetLastNodeGuid("4be1345f-a7ab-4379-ac1b-071bba6eebd1");
  _PartialReconcilationLAtest.Click_R2();

  TestModellerLogger.SetLastNodeGuid("4be1345f-a7ab-4379-ac1b-071bba6eebd1");
  _PartialReconcilationLAtest.Click_R3();

  TestModellerLogger.SetLastNodeGuid("0a7bb1d7-72ea-4dd0-9b74-37bf18c628a1");
  _PartialReconcilationLAtest.Click_ReconcileLink();


  TestModellerLogger.SetLastNodeGuid("f4325ab9-a0c9-4fd8-a969-0b4fa579e258");
  _PartialReconcilationLAtest.Select_SelectReconcileType("Partial Reconcile");


  TestModellerLogger.SetLastNodeGuid("fca7e12e-3436-4301-8150-392d2dcdc819");
  _PartialReconcilationLAtest.Click_ReconcileButton();
 
   }

 @Test  (groups= {"SaleInToReconcile","SaleInToReconcile - Default Profile"})
    @TestModellerPath(guid = "6cb57d3d-4a0e-45f3-b5f2-ef11cf334916")
    public void GoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClickAgentsP2() throws HeadlessException, IOException, InterruptedException, AWTException, InvalidFormatException
    {
    	
	 sTestCaseID="TC552";
    	Sheet="JournalReconcile";
     data = ExcelUtility.toReadExcelData(sTestCaseID, Sheet);
     
     pages.PartialReconciledCases.nlogin _nlogin = new pages.PartialReconciledCases.nlogin(driver);
     TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
     _nlogin.GoToUrl();
     

//     TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//     _nlogin.AssertUrl();
     

     TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
     _nlogin.Enter_nLOGIN(data[1]);
     

     TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
     _nlogin.Enter_nPASS(data[2]);
     

     TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
     _nlogin.Click_Login();
     

 pages.PartialReconciledCases.AgentSearch _AgentSearch = new pages.PartialReconciledCases.AgentSearch(driver);
//     TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
//     _AgentSearch.GoToUrl();
 //    

//     TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
//     _AgentSearch.AssertUrl();
     

     TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
     _AgentSearch.Click_Agents();
     

     TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
     _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
     

     TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
     _AgentSearch.Click_Search();
     

     TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
     _AgentSearch.Click__Nidhi1_();
     

 pages.PartialReconciledCases.Searchclient _Searchclient = new pages.PartialReconciledCases.Searchclient(driver);
//     TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
//     _Searchclient.GoToUrl();
 //    
 //
//     TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
//     _Searchclient.AssertUrl();
     

     TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
     _Searchclient.Click__Clients_();
     

     TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
     _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
     

     TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
     _Searchclient.Click_Searchbtn();
     

     TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
     _Searchclient.Click__NidhiEnt();
     

     pages.PartialReconciledCases.VATOnlyInvoice _VATOnlyInvoice = new pages.PartialReconciledCases.VATOnlyInvoice(driver);
 //  TestModellerLogger.SetLastNodeGuid("022b9dec-7d48-413f-862f-046626f82bd5");
 //  _VATOnlyInvoice.GoToUrl();
 //  
 //
 //  TestModellerLogger.SetLastNodeGuid("56572bdb-37f0-4286-88f7-beee95c645c7");
 //  _VATOnlyInvoice.AssertUrl();
   

   TestModellerLogger.SetLastNodeGuid("f0e2d203-a051-48b0-b278-8778e9dd05d2");
   _VATOnlyInvoice.Click_SalesTAB();
   

   TestModellerLogger.SetLastNodeGuid("274df502-bd54-494b-ac44-5675d06e691c");
   _VATOnlyInvoice.Click_NewTAB();
   

   TestModellerLogger.SetLastNodeGuid("d36b3d17-9a87-4ed1-b5ec-4c04544f4fc7");
   _VATOnlyInvoice.Click_VATOnlyInvoice();
   

   TestModellerLogger.SetLastNodeGuid("af5213eb-5d8a-417b-a6c7-f9001ab08632");
   _VATOnlyInvoice.Select_CustomerName(data[5]);
   

   TestModellerLogger.SetLastNodeGuid("fb8ddf53-f049-479e-bc7f-7616b0c519b3");
   _VATOnlyInvoice.Enter_InvoiceNo(data[6]);
   

   TestModellerLogger.SetLastNodeGuid("8c89f2f4-6bf3-42a1-88c1-ca505b8030fd");
   _VATOnlyInvoice.Enter_InvoiceDate(data[7]);
   

   TestModellerLogger.SetLastNodeGuid("06ffea53-9b87-4d49-94a9-5911b6d93cf5");
   _VATOnlyInvoice.Enter_SubTotal(data[8]);
   

   TestModellerLogger.SetLastNodeGuid("17ab7377-3f0f-4615-b7e3-000f92b59dc3");
   _VATOnlyInvoice.Select_VATRateType(data[9]);
   
   

 //  TestModellerLogger.SetLastNodeGuid("83b15b8a-fef9-45c4-99a5-7b6bf52e2e39");
 //  _VATOnlyInvoice.Enter_VATRate("");
 //  
 //
 //  TestModellerLogger.SetLastNodeGuid("0b562ab8-e40c-4f33-b2d0-0682cb23afb6");
 //  _VATOnlyInvoice.Enter_VATAmount("");
 //  
 //
 //  TestModellerLogger.SetLastNodeGuid("945fc6d7-6180-473c-a32b-0a95f5a89bac");
 //  _VATOnlyInvoice.Enter_GrossTotal("");
 //  

 //  TestModellerLogger.SetLastNodeGuid("1b120cb0-aa11-4b86-a6d8-2e40fc7e36ef");
 //  _VATOnlyInvoice.Enter_ConvertedAmount("100");
   

   TestModellerLogger.SetLastNodeGuid("a2bdfe37-c194-4ea0-b657-4d576468655c");
   _VATOnlyInvoice.Click_SaveButton();

     pages.PartialReconciledCases.Reconcilation _Reconcilation = new pages.PartialReconciledCases.Reconcilation(driver);
   //TestModellerLogger.SetLastNodeGuid("fc1c2835-8b62-466d-8b91-b2d2b6852de5");
   //_Reconcilation.GoToUrl();
   //
   //
   //TestModellerLogger.SetLastNodeGuid("30a799ca-18ec-4e8a-9931-57fc4ea2c02b");
   //_Reconcilation.AssertUrl();


   TestModellerLogger.SetLastNodeGuid("5fa7c856-5fe6-458c-94fd-c74460dd9b1f");
   _Reconcilation.Click_Acntantleftmenu();


 //  TestModellerLogger.SetLastNodeGuid("2f750f49-e648-45ca-898e-d60728db5570");
 //  _Reconcilation.Click_plussign();
 //
 //
 //  TestModellerLogger.SetLastNodeGuid("a3808a66-3e56-4e52-b2c1-61b7d5d15b32");
 //  _Reconcilation.Select_SelectAccountType1(data[22]);
 //
 //  //
   //TestModellerLogger.SetLastNodeGuid("2018e2d9-51c8-4e54-8424-0f5147db31d6");
   //_Reconcilation.Select_SelectAccount1(data[21]);
    
     
     pages.JournalEntry _JournalEntry = new pages.JournalEntry(driver);
 // TestModellerLogger.SetLastNodeGuid("d0c3eb81-6771-4b77-bb75-55a02294146e");
 // _JournalEntry.GoToUrl();
 // 

 // TestModellerLogger.SetLastNodeGuid("f6e8ad6d-3564-4c46-83cb-581c6935ddc6");
 // _JournalEntry.AssertUrl();
 // 


  

  TestModellerLogger.SetLastNodeGuid("6147744d-5b4e-4fbe-b7a3-333858b16f4a");
  _JournalEntry.Click_plusiconclick();
  

  TestModellerLogger.SetLastNodeGuid("e9c9ea8e-b958-43ca-8728-3b429b4aaecb");
  _JournalEntry.Enter_Enter_tDate(data[10]);
  
  TestModellerLogger.SetLastNodeGuid("e9c9ea8e-b958-43ca-8728-3b429b4aaecb");
  _JournalEntry.Enter_Reverse_Date(data[11]);
  
  TestModellerLogger.SetLastNodeGuid("82bd70b7-b343-40f6-959b-ab6331ed8fbe");
  _JournalEntry.Select_Slect_Currency(data[12]);

  TestModellerLogger.SetLastNodeGuid("94504f9f-098b-42ad-82b3-a743456020fc");
  _JournalEntry.Enter_Enter_Description(data[13]);

  TestModellerLogger.SetLastNodeGuid("cb49d4cd-87fd-4a49-afab-fd5672342bd1");
  _JournalEntry.Enter_Clickaccountbox(data[14]);
  

  TestModellerLogger.SetLastNodeGuid("9bffefbc-952c-4681-b0f1-4d6cdd9abcb1");
  _JournalEntry.Enter_Enter_Debit(data[15]);
  
 // TestModellerLogger.SetLastNodeGuid("2876ec19-50d6-4414-9db3-998398799181");
 // _JournalEntry.Enter_Enter_Note(data[20]);
  
  TestModellerLogger.SetLastNodeGuid("cb49d4cd-87fd-4a49-afab-fd5672342bd1");
  _JournalEntry.Enter_Clickaccountbox2(data[16]);

  TestModellerLogger.SetLastNodeGuid("248e3484-b1c0-489f-b3aa-53b8d02b9c80");
  _JournalEntry.Enter_Enter_Credit(data[17]);
  

 // TestModellerLogger.SetLastNodeGuid("2876ec19-50d6-4414-9db3-998398799181");
 // _JournalEntry.Enter_Enter_Note(data[23]);
  
    TestModellerLogger.SetLastNodeGuid("e322cae3-c645-4e40-989d-753f1b48ea5a");
  _JournalEntry.Click_Click_Save_btn();
  
  //    TestModellerLogger.SetLastNodeGuid("0892baec-0422-496a-93f9-1028cef59d2c");
//     _Reconcilation.Click_View_Reconciled_button1();
 //    
 // TestModellerLogger.SetLastNodeGuid("5fa7c856-5fe6-458c-94fd-c74460dd9b1f");
 // _Reconcilation.Click_Acntantleftmenu();


  TestModellerLogger.SetLastNodeGuid("2f750f49-e648-45ca-898e-d60728db5570");
  _Reconcilation.Click_plussign();


  TestModellerLogger.SetLastNodeGuid("a3808a66-3e56-4e52-b2c1-61b7d5d15b32");
  _Reconcilation.Select_SelectAccountType1(data[18]);

  TestModellerLogger.SetLastNodeGuid("2018e2d9-51c8-4e54-8424-0f5147db31d6");
 _Reconcilation.Select_SelectAccount1(data[19]);

     pages.PartialReconciledCases.PartialReconcilationLAtestInvoice_JonralEntry _PartialReconcilationLAtest = new pages.PartialReconciledCases.PartialReconcilationLAtestInvoice_JonralEntry(driver);
   //TestModellerLogger.SetLastNodeGuid("511bd3c6-4bfe-44f1-85bd-d9c919623efb");
   //_PartialReconcilationLAtest.GoToUrl();
   //
   //
   //TestModellerLogger.SetLastNodeGuid("6e247121-1606-4c0e-beb4-b3e6cb7495a3");
   //_PartialReconcilationLAtest.AssertUrl();


   TestModellerLogger.SetLastNodeGuid("af0c7fbd-9d1e-4a30-9e46-78b9d63e1c8f");
   _PartialReconcilationLAtest.Click_SelectALL();


   //TestModellerLogger.SetLastNodeGuid("d60148fa-f80f-4012-b7db-ab2180373216");
   //_PartialReconcilationLAtest.Click_ReconcileSelected();


   TestModellerLogger.SetLastNodeGuid("56eb2524-f022-46bb-bfc6-e57cfeaf10b8");
   _PartialReconcilationLAtest.Click_UngroupSelected();


   TestModellerLogger.SetLastNodeGuid("ca75e642-3957-4d56-af81-a254557876ea");
   _PartialReconcilationLAtest.Click_R1();


   TestModellerLogger.SetLastNodeGuid("4be1345f-a7ab-4379-ac1b-071bba6eebd1");
   _PartialReconcilationLAtest.Click_R2();

   TestModellerLogger.SetLastNodeGuid("4be1345f-a7ab-4379-ac1b-071bba6eebd1");
   _PartialReconcilationLAtest.Click_R3();

   TestModellerLogger.SetLastNodeGuid("0a7bb1d7-72ea-4dd0-9b74-37bf18c628a1");
   _PartialReconcilationLAtest.Click_ReconcileLink();


   TestModellerLogger.SetLastNodeGuid("f4325ab9-a0c9-4fd8-a969-0b4fa579e258");
   _PartialReconcilationLAtest.Select_SelectReconcileType("Partial Reconcile");


   TestModellerLogger.SetLastNodeGuid("fca7e12e-3436-4301-8150-392d2dcdc819");
   _PartialReconcilationLAtest.Click_ReconcileButton();

   }
}

