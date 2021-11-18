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
public class Test_Supplier_Reconciled_With_Advanced_Journal extends TestBase
{
	public String sTestCaseID=null;
	String[] data=null;
	String Sheet = null;
	
 @Test  (groups= {"SaleInToReconcile","SaleInToReconcile - Default Profile"})
    @TestModellerPath(guid = "8c7c840e-6086-4f3d-b9ff-7b3f3724775c")
 public void GoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClickAgentsCreateSupplierBankTrnsAndAdvanceReconcilationTC01() throws InterruptedException, IOException, InvalidFormatException, HeadlessException, AWTException
 {
 	sTestCaseID="TC400Supplier1";
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
 

///////////
 Pages_Reconcilation_TC.SupplierBillSToFRS _SupplierBillSToFRS = new Pages_Reconcilation_TC.SupplierBillSToFRS(driver);


TestModellerLogger.SetLastNodeGuid("5c30d940-2a3c-4ce2-9f6d-f491e71a1755");
_SupplierBillSToFRS.Click_ExpenditureTAB();


TestModellerLogger.SetLastNodeGuid("02bea7d1-9589-4278-8c66-58e376721799");
_SupplierBillSToFRS.Click_NewTAB();


TestModellerLogger.SetLastNodeGuid("fc395eef-59ac-4e0c-8092-d11ecdb61b84");
_SupplierBillSToFRS.Click_NewSupplierBill();



TestModellerLogger.SetLastNodeGuid("9ed916b8-79f8-4b59-a274-ed9c520242c8");
_SupplierBillSToFRS.Select_SupplierName(data[5]);





TestModellerLogger.SetLastNodeGuid("6516ccf8-ae24-42b1-b271-2bb390a6f8c3");
_SupplierBillSToFRS.Enter_BillNo(data[6]);


TestModellerLogger.SetLastNodeGuid("12466744-0bd3-4135-9300-e044e7148e58");
_SupplierBillSToFRS.Enter_Date("");


TestModellerLogger.SetLastNodeGuid("7ea52093-1dd7-4979-8034-aeaef336d945");
_SupplierBillSToFRS.Select_ExpenseType(data[8]);


TestModellerLogger.SetLastNodeGuid("de8f87b1-ff3a-421c-9290-6ddaef339bf2");
_SupplierBillSToFRS.Enter_Description("Ashiv");


TestModellerLogger.SetLastNodeGuid("31e40f93-4cb6-45b2-bb91-cdd42e0f2f68");
_SupplierBillSToFRS.Enter_UnitPrice(data[10]);


TestModellerLogger.SetLastNodeGuid("956a775c-cdf6-4d7d-949f-76ac35f8991c");
_SupplierBillSToFRS.Select_VATRateType(data[9]);


_SupplierBillSToFRS.Click_SaveButton();

///////////////

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
 
 _PartialReconcilationLAtest.Advance_Supplier_Reconcilation_Journal();
 
 
 
 

	
  
}
 
 @Test  (groups= {"SaleInToReconcile","SaleInToReconcile - Default Profile"})
 @TestModellerPath(guid = "8c7c840e-6086-4f3d-b9ff-7b3f3724775c")
public void GoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClickAgentsTC02() throws InterruptedException, IOException, InvalidFormatException, HeadlessException, AWTException
{
	sTestCaseID="TC400Supplier";
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


Pages_Reconcilation_TC.SupplierBillSToFRS _SupplierBillSToFRS = new Pages_Reconcilation_TC.SupplierBillSToFRS(driver);

TestModellerLogger.SetLastNodeGuid("5c30d940-2a3c-4ce2-9f6d-f491e71a1755");
_SupplierBillSToFRS.Click_ExpenditureTAB();

_SupplierBillSToFRS.Search("Supplier Name", data[5]);

_SupplierBillSToFRS.SupplierScreenshot_1();


}
 
}