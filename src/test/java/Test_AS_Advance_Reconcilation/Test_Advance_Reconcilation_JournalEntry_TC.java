package Test_AS_Advance_Reconcilation;

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
public class Test_Advance_Reconcilation_JournalEntry_TC extends TestBase
{
	public String sTestCaseID=null;
	String[] data=null;
	String Sheet = null;
	
 @Test  (groups= {"SaleInToReconcile","SaleInToReconcile - Default Profile"})
    @TestModellerPath(guid = "8c7c840e-6086-4f3d-b9ff-7b3f3724775c")
    public void GoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClickAgentsTC01() throws InterruptedException, IOException, InvalidFormatException, HeadlessException, AWTException
    {
    	sTestCaseID="TC399Journal";
       	Sheet="Fin-3821";
        data = ExcelUtility.toReadExcelData(sTestCaseID, Sheet);
        
        pages.banking.ashiv.nlogin _nlogin = new  pages.banking.ashiv.nlogin(driver);
        
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
    

pages.banking.ashiv.AgentSearch _AgentSearch = new pages.banking.ashiv.AgentSearch(driver);
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
    

pages.banking.ashiv.Searchclient _Searchclient = new pages.banking.ashiv.Searchclient(driver);
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
    

pages.banking.ashiv.SaleInvoice _SaleInvoice = new pages.banking.ashiv.SaleInvoice(driver);


    TestModellerLogger.SetLastNodeGuid("38510c8a-daac-4ff8-83f3-54b176440787");
    _SaleInvoice.Click_SalesTab();
    

    TestModellerLogger.SetLastNodeGuid("2ce6ef22-01ee-4e82-bcb0-f7ce06badd95");
    _SaleInvoice.Click_NewButton();
    

    TestModellerLogger.SetLastNodeGuid("b605bf48-53b8-4f7f-a009-9ea8d59b69ba");
    _SaleInvoice.Click_NewInvoice();
    

    TestModellerLogger.SetLastNodeGuid("4e83b316-7f8b-49b7-a97f-e85cefb020f0");
    _SaleInvoice.Select_CustomerName(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("f3edcc35-8d70-4902-81f0-9c5d760fac46");
    _SaleInvoice.Enter_InvoiceNo(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("6f885a16-e34c-4d0d-914a-a726c1fa9617");
    _SaleInvoice.Enter_InvoiceDate("");
    

    TestModellerLogger.SetLastNodeGuid("294097b8-ccc5-4eb7-baec-1a26ca1364f0");
    _SaleInvoice.Select_IncomeType(data[8]);
    

    TestModellerLogger.SetLastNodeGuid("5ccbf01b-65a3-47f5-b916-dab48aab691f");
    _SaleInvoice.Enter_Description(data[9]);
    

    TestModellerLogger.SetLastNodeGuid("73677a32-1892-47f6-9783-a1072478778a");
    _SaleInvoice.Enter_UnitPrice(data[10]);
    

    TestModellerLogger.SetLastNodeGuid("d810d5bf-a960-434c-9172-1671dd383495");
    _SaleInvoice.Enter_Quantity(data[11]);
    

    TestModellerLogger.SetLastNodeGuid("516c7236-f043-4de9-b128-99997ccf1604");
    _SaleInvoice.Select_VATRate(data[12]);
    

    

    TestModellerLogger.SetLastNodeGuid("6aeae28b-fd85-4712-8710-18e4b190dd19");
    _SaleInvoice.Enter_Note(data[13]);
    

    TestModellerLogger.SetLastNodeGuid("2508d3fa-348f-48f2-914a-4d43591ded90");
    _SaleInvoice.Click_SaveButton();



    
 Pages_Reconcilation_TC.JournalEntry _Jun=new Pages_Reconcilation_TC.JournalEntry(driver);
    
    _Jun.Click_Accountantlefttab();
    _Jun.Click_plusiconclick();
    _Jun.Enter_Enter_tDate(data[7]);
   // _Jun.Enter_Reverse_Date("");
   // _Jun.Select_Slect_Currency("");
    _Jun.Enter_Enter_Description(data[5]);
    _Jun.Enter_Clickaccountbox("7400 - Accountancy, Bookkeeping and Auditing Fees");
    _Jun.Enter_Enter_Debit(data[17]);
      _Jun.Enter_Enter_Note("AS");
    
    _Jun.Enter_Clickaccountbox2(data[5]);
    _Jun.Enter_Credit2(data[17]);
    _Jun.Enter_Note2("AA");
    _Jun.Click_Click_Save_btn();
    
    Pages_Reconcilation_TC.PartialReconcilationLAtestInvoice_JonralEntry _PartialReconcilationLAtest = new Pages_Reconcilation_TC.PartialReconcilationLAtestInvoice_JonralEntry(driver);

 _PartialReconcilationLAtest.click_Adem();
    _PartialReconcilationLAtest.click_ReconBtn();
    
    //_PartialReconcilationLAtest.Select_Accounttype(data[20]);
    _PartialReconcilationLAtest.Select_AccountType_4__8(data[20]);
    
    _PartialReconcilationLAtest.Select_Account(data[5]);
    
    
    _PartialReconcilationLAtest.Advance_Reconcilation1("Reconcile with Advance");
    
    _PartialReconcilationLAtest.ViewRecon(data[20], data[5]);
    _PartialReconcilationLAtest.SS();
   
    
//    TestModellerLogger.SetLastNodeGuid("af0c7fbd-9d1e-4a30-9e46-78b9d63e1c8f");
//    _PartialReconcilationLAtest.Click_SelectALL();
//
//
//    //TestModellerLogger.SetLastNodeGuid("d60148fa-f80f-4012-b7db-ab2180373216");
//    //_PartialReconcilationLAtest.Click_ReconcileSelected();
//
//
//    TestModellerLogger.SetLastNodeGuid("56eb2524-f022-46bb-bfc6-e57cfeaf10b8");
//    _PartialReconcilationLAtest.Click_UngroupSelected();
//
//
//    
//    TestModellerLogger.SetLastNodeGuid("ca75e642-3957-4d56-af81-a254557876ea");
//    _PartialReconcilationLAtest.Click_R1();
//
//
//    TestModellerLogger.SetLastNodeGuid("4be1345f-a7ab-4379-ac1b-071bba6eebd1");
//    _PartialReconcilationLAtest.Click_R2();
//
//    TestModellerLogger.SetLastNodeGuid("4be1345f-a7ab-4379-ac1b-071bba6eebd1");
//    _PartialReconcilationLAtest.Click_R3();

//    TestModellerLogger.SetLastNodeGuid("0a7bb1d7-72ea-4dd0-9b74-37bf18c628a1");
//    _PartialReconcilationLAtest.Click_ReconcileLink();


   // TestModellerLogger.SetLastNodeGuid("f4325ab9-a0c9-4fd8-a969-0b4fa579e258");
   // _PartialReconcilationLAtest.Select_SelectReconcileType("Partial Reconcile");

//
//    TestModellerLogger.SetLastNodeGuid("fca7e12e-3436-4301-8150-392d2dcdc819");
//    _PartialReconcilationLAtest.Click_ReconcileButton();
//   
     }
    
  
   

 @Test  (groups= {"SaleInToReconcile","SaleInToReconcile - Default Profile"})
 @TestModellerPath(guid = "8c7c840e-6086-4f3d-b9ff-7b3f3724775c")
 public void GoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClickAgentsTC02() throws InterruptedException, IOException, InvalidFormatException, HeadlessException, AWTException
 {
 	sTestCaseID="TC399Journal";
    	Sheet="Fin-3821";
     data = ExcelUtility.toReadExcelData(sTestCaseID, Sheet);
     
     pages.banking.ashiv.nlogin _nlogin = new  pages.banking.ashiv.nlogin(driver);
     
 TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
 _nlogin.GoToUrl();
 

// TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
// _nlogin.AssertUrl();
 

 TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
 _nlogin.Enter_nLOGIN(data[1]);
    

 TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
 _nlogin.Enter_nPASS(data[2]);
 

 TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
 _nlogin.Click_Login();
 

pages.banking.ashiv.AgentSearch _AgentSearch = new pages.banking.ashiv.AgentSearch(driver);
// TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
// _AgentSearch.GoToUrl();
// 

// TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
// _AgentSearch.AssertUrl();
 

 TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
 _AgentSearch.Click_Agents();
 

 TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
 _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
 

 TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
 _AgentSearch.Click_Search();
 

 TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
 _AgentSearch.Click__Nidhi1_();
 

pages.banking.ashiv.Searchclient _Searchclient = new pages.banking.ashiv.Searchclient(driver);
// TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
// _Searchclient.GoToUrl();
// 
//
// TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
// _Searchclient.AssertUrl();
 

 TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
 _Searchclient.Click__Clients_();
 

 TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
 _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
 

 TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
 _Searchclient.Click_Searchbtn();
 

 TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
 _Searchclient.Click__NidhiEnt();
 

 Pages_Reconcilation_TC.Advance_Reconcilation _Ledger_Reconciliation2 = new Pages_Reconcilation_TC.Advance_Reconcilation(driver);
 
 _Ledger_Reconciliation2.Click_Sale_1();

 _Ledger_Reconciliation2.Search(data[6]);
 

 _Ledger_Reconciliation2.dsbBlanceZero1();
}
  
 
 @Test  (groups= {"SaleInToReconcile","SaleInToReconcile - Default Profile"})
 @TestModellerPath(guid = "8c7c840e-6086-4f3d-b9ff-7b3f3724775c")
 
 public void GoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClickAgentsTC03() throws InterruptedException, IOException, InvalidFormatException, HeadlessException, AWTException
 {
 	sTestCaseID="TC399Journal";
    	Sheet="Fin-3821";
     data = ExcelUtility.toReadExcelData(sTestCaseID, Sheet);
     
     pages.banking.ashiv.nlogin _nlogin = new  pages.banking.ashiv.nlogin(driver);
     
 TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
 _nlogin.GoToUrl();
 

// TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
// _nlogin.AssertUrl();
 

 TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
 _nlogin.Enter_nLOGIN(data[1]);
    

 TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
 _nlogin.Enter_nPASS(data[2]);
 

 TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
 _nlogin.Click_Login();
 

pages.banking.ashiv.AgentSearch _AgentSearch = new pages.banking.ashiv.AgentSearch(driver);
// TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
// _AgentSearch.GoToUrl();
// 

// TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
// _AgentSearch.AssertUrl();
 

 TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
 _AgentSearch.Click_Agents();
 

 TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
 _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
 

 TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
 _AgentSearch.Click_Search();
 

 TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
 _AgentSearch.Click__Nidhi1_();
 

pages.banking.ashiv.Searchclient _Searchclient = new pages.banking.ashiv.Searchclient(driver);
// TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
// _Searchclient.GoToUrl();
// 
//
// TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
// _Searchclient.AssertUrl();
 

 TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
 _Searchclient.Click__Clients_();
 

 TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
 _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
 

 TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
 _Searchclient.Click_Searchbtn();
 

 TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
 _Searchclient.Click__NidhiEnt();
 

 Pages_Reconcilation_TC.Advance_Reconcilation _Ledger_Reconciliation2 = new Pages_Reconcilation_TC.Advance_Reconcilation(driver);
 

 _Ledger_Reconciliation2.Click_Sale_1();

 _Ledger_Reconciliation2.Search(data[6]);

	Pages_Reconcilation_TC.NewPreviewPage _NewPreviewPage = new Pages_Reconcilation_TC.NewPreviewPage(driver);
	  //  TestModellerLogger.SetLastNodeGuid("dbbb77d9-da5b-418b-8bf9-81bcb95327cf");
	  //  _NewPreviewPage.GoToUrl();
	    

	  //  TestModellerLogger.SetLastNodeGuid("d7e4fdde-c2c7-46a8-83a5-5be45ffa1225");
	 //   _NewPreviewPage.AssertUrl();
	    

	    TestModellerLogger.SetLastNodeGuid("715cfaaf-aba7-40a9-82e6-410e09784e97");
	    _NewPreviewPage.Click_ClickOnPreview();
	    
	    _NewPreviewPage.ScreenshotJou();
	    
	    TestModellerLogger.SetLastNodeGuid("23d6006a-2648-4df5-a3f3-c2e17c157827");
	    _NewPreviewPage.Click_SaveButton();
	    
        
           
//	    TestModellerLogger.SetLastNodeGuid("54b70d53-1986-4341-b00c-5f332860cd9d");
//	    _NewPreviewPage.Click_PDFDump();
	//    
	    

	    TestModellerLogger.SetLastNodeGuid("c672a06c-43df-4da3-b0e6-c89aec1ad026");
	    _NewPreviewPage.Click_CancelButton();
	    

//	    TestModellerLogger.SetLastNodeGuid("ad68166f-4045-401c-85cf-3a60a429becd");
//	    _NewPreviewPage.Click_ClickOnMail();
	    
	    
}
 
 @Test  (groups= {"SaleInToReconcile","SaleInToReconcile - Default Profile"})
 @TestModellerPath(guid = "8c7c840e-6086-4f3d-b9ff-7b3f3724775c")
 
 public void GoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClickAgentsTC04() throws InterruptedException, IOException, InvalidFormatException, HeadlessException, AWTException
 {
 	sTestCaseID="TC399Journal";
    	Sheet="Fin-3821";
     data = ExcelUtility.toReadExcelData(sTestCaseID, Sheet);
     
     pages.banking.ashiv.nlogin _nlogin = new  pages.banking.ashiv.nlogin(driver);
     
 TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
 _nlogin.GoToUrl();
 

// TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
// _nlogin.AssertUrl();
 

 TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
 _nlogin.Enter_nLOGIN(data[1]);
    

 TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
 _nlogin.Enter_nPASS(data[2]);
 

 TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
 _nlogin.Click_Login();
 

pages.banking.ashiv.AgentSearch _AgentSearch = new pages.banking.ashiv.AgentSearch(driver);
// TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
// _AgentSearch.GoToUrl();
// 

// TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
// _AgentSearch.AssertUrl();
 

 TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
 _AgentSearch.Click_Agents();
 

 TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
 _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
 

 TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
 _AgentSearch.Click_Search();
 

 TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
 _AgentSearch.Click__Nidhi1_();
 

pages.banking.ashiv.Searchclient _Searchclient = new pages.banking.ashiv.Searchclient(driver);
// TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
// _Searchclient.GoToUrl();
// 
//
// TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
// _Searchclient.AssertUrl();
 

 TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
 _Searchclient.Click__Clients_();
 

 TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
 _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
 

 TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
 _Searchclient.Click_Searchbtn();
 

 TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
 _Searchclient.Click__NidhiEnt();
 

 Pages_Reconcilation_TC.Advance_Reconcilation _Ledger_Reconciliation2 = new Pages_Reconcilation_TC.Advance_Reconcilation(driver);
 

 _Ledger_Reconciliation2.Click_Sale_1();

_Ledger_Reconciliation2.Search(data[6]);

_Ledger_Reconciliation2.screenshot3();

	_Ledger_Reconciliation2.clickTrn();
	
_Ledger_Reconciliation2.screenshot4();
	
	    
	    
}
  
 

}

    