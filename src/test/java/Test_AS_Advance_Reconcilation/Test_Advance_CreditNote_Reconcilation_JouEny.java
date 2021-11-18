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
public class Test_Advance_CreditNote_Reconcilation_JouEny extends TestBase
{
	public String sTestCaseID=null;
	String[] data=null;
	String Sheet = null;
	
 
 
 
 
 @Test  (groups= {"SaleInToReconcile","SaleInToReconcile - Default Profile"})
 @TestModellerPath(guid = "8c7c840e-6086-4f3d-b9ff-7b3f3724775c")
public void GoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClickAgentsTC02() throws InterruptedException, IOException, InvalidFormatException, HeadlessException, AWTException
{
	sTestCaseID="TC399CreditNote1";
 	Sheet="Fin-3821";
    data = ExcelUtility.toReadExcelData(sTestCaseID, Sheet);
  
  pages.banking.ashiv.nlogin _nlogin = new  pages.banking.ashiv.nlogin(driver);
  
TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
_nlogin.GoToUrl();


//TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//_nlogin.AssertUrl();


TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
_nlogin.Enter_nLOGIN(data[1]);
 

TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
_nlogin.Enter_nPASS(data[2]);


TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
_nlogin.Click_Login();


pages.banking.ashiv.AgentSearch _AgentSearch = new pages.banking.ashiv.AgentSearch(driver);
//TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
//_AgentSearch.GoToUrl();
//

//TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
//_AgentSearch.AssertUrl();


TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
_AgentSearch.Click_Agents();


TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
_AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);


TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
_AgentSearch.Click_Search();


TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
_AgentSearch.Click__Nidhi1_();


pages.banking.ashiv.Searchclient _Searchclient = new pages.banking.ashiv.Searchclient(driver);
//TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
//_Searchclient.GoToUrl();
//
//
//TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
//_Searchclient.AssertUrl();


TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
_Searchclient.Click__Clients_();


TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
_Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);


TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
_Searchclient.Click_Searchbtn();


TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
_Searchclient.Click__NidhiEnt();


pages.banking.ashiv.SaleCreditNote _SaleCreditNote = new pages.banking.ashiv.SaleCreditNote(driver);
TestModellerLogger.SetLastNodeGuid("4a368791-50ba-4762-9daa-e6881663c7c5");



TestModellerLogger.SetLastNodeGuid("41f6f46c-f112-4637-917e-dbdc89c9bae5");
_SaleCreditNote.Click_SalesTab();


TestModellerLogger.SetLastNodeGuid("a1dedc7e-b8d5-4e5d-8d02-93387c7d697a");
_SaleCreditNote.Click_NewButton();


TestModellerLogger.SetLastNodeGuid("1d0f5c26-1f07-4ad5-8953-adfe5634232b");
_SaleCreditNote.Click_NewCreditNote();


TestModellerLogger.SetLastNodeGuid("8f0ac483-4b81-4ec8-b63a-c9243e4da070");
_SaleCreditNote.Select_CustomerName(data[5]);


TestModellerLogger.SetLastNodeGuid("1062d571-8265-4c35-b27d-4d4ef9dad8d7");
_SaleCreditNote.Enter_CreditNoteNo(data[6]);


//TestModellerLogger.SetLastNodeGuid("783d5ff9-7311-4812-8e73-f0e433fdc8a4");
//_SaleCreditNote.Enter_CreditNoteDate("");



TestModellerLogger.SetLastNodeGuid("749d2d39-5d01-4ef9-ad4d-6af022daeea6");
_SaleCreditNote.Select_IncomeType1(data[8]);


TestModellerLogger.SetLastNodeGuid("91d673df-2732-4b8e-8bd9-2ade1408cd1b");
_SaleCreditNote.Enter_InvoiceNo(data[6]);


TestModellerLogger.SetLastNodeGuid("410b9063-8412-49e5-b62c-950ec76f591d");
_SaleCreditNote.Enter_CreditDescription("Ashiv");


TestModellerLogger.SetLastNodeGuid("10a0cb0a-3cf3-483a-bcee-368d1ddad071");
_SaleCreditNote.Enter_UnitPrice(data[10]);


TestModellerLogger.SetLastNodeGuid("93095997-7b8d-4e46-8903-a2a5b64060d3");
_SaleCreditNote.Enter_Quantity(data[11]);


TestModellerLogger.SetLastNodeGuid("f454ded6-253b-491a-9317-c1ad823e1c7c");
_SaleCreditNote.Select_VATRateType("Out of Scope");


TestModellerLogger.SetLastNodeGuid("fa3946b2-757a-40c9-9974-911d0544a386");
_SaleCreditNote.Enter_Note("ASSSS");


TestModellerLogger.SetLastNodeGuid("ff1a8f18-679c-4fbe-b321-b4eb48b484a1");
_SaleCreditNote.Click_SaveButton();



Pages_Reconcilation_TC.JournalEntry _Jun=new Pages_Reconcilation_TC.JournalEntry(driver);

_Jun.Click_Accountantlefttab();
_Jun.Click_plusiconclick();
_Jun.Enter_Enter_tDate(data[7]);
// _Jun.Enter_Reverse_Date("");
// _Jun.Select_Slect_Currency("");
_Jun.Enter_Enter_Description(data[5]);
_Jun.Enter_Clickaccountbox(data[19]);
_Jun.Enter_Enter_Debit(data[18]);
  _Jun.Enter_Enter_Note("AS");

_Jun.Enter_Clickaccountbox2("7400 - Accountancy, Bookkeeping and Auditing Fees");
_Jun.Enter_Credit2(data[18]);
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
 _PartialReconcilationLAtest.SS1();




Pages_Reconcilation_TC.Advance_Reconcilation _Ledger_Reconciliation2 = new Pages_Reconcilation_TC.Advance_Reconcilation(driver);


_Ledger_Reconciliation2.Click_Sale_1();

_Ledger_Reconciliation2.Search(data[6]);

_Ledger_Reconciliation2.dsbBlanceZeroCreditNotejour();


	Pages_Reconcilation_TC.NewPreviewPage _NewPreviewPage = new Pages_Reconcilation_TC.NewPreviewPage(driver);
	  //  TestModellerLogger.SetLastNodeGuid("dbbb77d9-da5b-418b-8bf9-81bcb95327cf");
	  //  _NewPreviewPage.GoToUrl();
	    

	  //  TestModellerLogger.SetLastNodeGuid("d7e4fdde-c2c7-46a8-83a5-5be45ffa1225");
	 //   _NewPreviewPage.AssertUrl();
	    

	    TestModellerLogger.SetLastNodeGuid("715cfaaf-aba7-40a9-82e6-410e09784e97");
	    _NewPreviewPage.Click_ClickOnPreview();
	    
	    _NewPreviewPage.Screenshot2();
	    
	    TestModellerLogger.SetLastNodeGuid("23d6006a-2648-4df5-a3f3-c2e17c157827");
	    _NewPreviewPage.Click_SaveButtonCreditNote();
	    
   
      
//	    TestModellerLogger.SetLastNodeGuid("54b70d53-1986-4341-b00c-5f332860cd9d");
//	    _NewPreviewPage.Click_PDFDump();
	//    
	    

	    TestModellerLogger.SetLastNodeGuid("c672a06c-43df-4da3-b0e6-c89aec1ad026");
	    _NewPreviewPage.Click_CancelButton();
	    

//	    TestModellerLogger.SetLastNodeGuid("ad68166f-4045-401c-85cf-3a60a429becd");
//	    _NewPreviewPage.Click_ClickOnMail();

}
}