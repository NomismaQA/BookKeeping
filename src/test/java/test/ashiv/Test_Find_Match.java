package test.ashiv;

import reports.TestNGListener;
import tests.TestBase;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.event.KeyAdapter;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Keys;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ie.curiositysoftware.allocation.dto.ResultMergeMethod;
import ie.curiositysoftware.allocation.dto.DataAllocationRow;
import reports.ExtentTestListener;
import ie.curiositysoftware.allocation.dto.DataAllocationResult;
import ie.curiositysoftware.allocation.engine.DataAllocation;
import utilities.ExcelData;
import utilities.testmodeller.GetScreenShot;
import utilities.testmodeller.TestModellerLogger;

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/fb0f9883-f69a-4ca6-ac9f-a272ee61fa46
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 779, profileId = 100672)
public class Test_Find_Match extends TestBase
{
	String sTestCaseID=null;
	String[] data=null;
	String Sheet =null;

  
	@Test  (groups= {"SaleInvoice","SaleInvoice - Default Profile"})
	@TestModellerPath(guid = "a6ea7f10-1830-474a-b799-15d8c748d678")
    public void GoToUrlAssertUrlClickSalesTabClickNewButtonClickNewInvoicePositiveSelectCustomerNamePositiveGoToUrlAssertUrlClickSalesTabClickNewButtonClickNewInvoicePositiveSelectCustomerNamePositiveunreconciledtTransactionNewTransactionLedgerCode1070FindAndSearchIconInvoiceReconciledClickReconcileButton_1() throws InterruptedException, HeadlessException, IOException, AWTException, InvalidFormatException
    {
		 sTestCaseID="TC7"; 
		  Sheet="BankingBank"; 
		  data =ExcelData.toReadExcelData(sTestCaseID, Sheet);
   	  
   	
   	  pages.banking.ashiv.nlogin _nlogin = new pages.banking.ashiv.nlogin(driver);
   	  
   	  TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
   	  _nlogin.GoToUrl();
   	  
   	  TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
   	  // _nlogin.AssertUrl();
   	  
   	  
   	  TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
   	  _nlogin.Enter_nLOGIN(data[1]);
   	  
   	  
   	  TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
   	  _nlogin.Enter_nPASS(data[2]);
   	  
   
   	  TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
   	  _nlogin.Click_Login();
   	  
   	pages.banking.ashiv.AgentSearch _AgentSearch = new pages.banking.ashiv.AgentSearch(driver);
	 
	  
	  TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
	  _AgentSearch.Click_Agents();
	  
	  TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
	  _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
	  
	  
	  TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
	  _AgentSearch.Click_Search(); 
	  
	  TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
	  _AgentSearch.Click__Nidhi1_(); 
	  
	 pages.banking.ashiv.Searchclient _Searchclient = new pages.banking.ashiv.Searchclient(driver); 
	 
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
		  _SaleInvoice.Enter_InvoiceDate(data[13]);
		  
		  
		  
		  
		  TestModellerLogger.SetLastNodeGuid("294097b8-ccc5-4eb7-baec-1a26ca1364f0");
		  _SaleInvoice.Select_IncomeType(data[8]);
		  
		  
		  TestModellerLogger.SetLastNodeGuid("5ccbf01b-65a3-47f5-b916-dab48aab691f");
		  _SaleInvoice.Enter_Description(data[9]);
		  
		  
		  TestModellerLogger.SetLastNodeGuid("73677a32-1892-47f6-9783-a1072478778a");
		  _SaleInvoice.Enter_UnitPrice(data[10]);
		  
		  
		  TestModellerLogger.SetLastNodeGuid("d810d5bf-a960-434c-9172-1671dd383495");
		  _SaleInvoice.Enter_Quantity(data[11]);
		  
		  
		  TestModellerLogger.SetLastNodeGuid("516c7236-f043-4de9-b128-99997ccf1604");
		  _SaleInvoice.Select_VATRate(data[16]);
		  
		  TestModellerLogger.SetLastNodeGuid("2508d3fa-348f-48f2-914a-4d43591ded90");
		  _SaleInvoice.Click_SaveButton();
		  
		  pages.banking.ashiv.SaleCreditNote _SaleCreditNote = new  pages.banking.ashiv.SaleCreditNote(driver);
		 
		  
		  TestModellerLogger.SetLastNodeGuid("41f6f46c-f112-4637-917e-dbdc89c9bae5");
		  _SaleCreditNote.Click_SalesTab();
		  
		  
		  TestModellerLogger.SetLastNodeGuid("a1dedc7e-b8d5-4e5d-8d02-93387c7d697a");
		  _SaleCreditNote.Click_NewButton();
		  
		  
		  TestModellerLogger.SetLastNodeGuid("1d0f5c26-1f07-4ad5-8953-adfe5634232b");
		  _SaleCreditNote.Click_NewCreditNote();
		  
		  
		  TestModellerLogger.SetLastNodeGuid("8f0ac483-4b81-4ec8-b63a-c9243e4da070");
		  _SaleCreditNote.Select_CustomerName(data[5]);
		  
		  
		  TestModellerLogger.SetLastNodeGuid("1062d571-8265-4c35-b27d-4d4ef9dad8d7");
		  _SaleCreditNote.Enter_CreditNoteNo(data[7]);
		  
		  
		  TestModellerLogger.SetLastNodeGuid("783d5ff9-7311-4812-8e73-f0e433fdc8a4");
		  _SaleCreditNote.Enter_CreditNoteDate(data[13]);
		  
		  
		  
		  TestModellerLogger.SetLastNodeGuid("749d2d39-5d01-4ef9-ad4d-6af022daeea6");
		  _SaleCreditNote.Select_IncomeType1(data[8]);
		  
		  
		  TestModellerLogger.SetLastNodeGuid("91d673df-2732-4b8e-8bd9-2ade1408cd1b");
		  _SaleCreditNote.Enter_InvoiceNo(data[7]);
		  
		  
		  TestModellerLogger.SetLastNodeGuid("410b9063-8412-49e5-b62c-950ec76f591d");
		  _SaleCreditNote.Enter_CreditDescription(data[9]);
		  
		  
		  TestModellerLogger.SetLastNodeGuid("10a0cb0a-3cf3-483a-bcee-368d1ddad071");
		  _SaleCreditNote.Enter_UnitPrice(data[12]);
		  
		  
		  TestModellerLogger.SetLastNodeGuid("93095997-7b8d-4e46-8903-a2a5b64060d3");
		  _SaleCreditNote.Enter_Quantity(data[11]);
		  
		  
		  TestModellerLogger.SetLastNodeGuid("f454ded6-253b-491a-9317-c1ad823e1c7c");
		  _SaleCreditNote.Select_VATRateType("Out of Scope");
		  
		  TestModellerLogger.SetLastNodeGuid("ff1a8f18-679c-4fbe-b321-b4eb48b484a1");
		  _SaleCreditNote.Click_SaveButton();
		  
		  
		  
		  pages.banking.ashiv.VATOnlyInvoice _VATOnlyInvoice = new pages.banking.ashiv.VATOnlyInvoice(driver); //
		
		  
		  
		  TestModellerLogger.SetLastNodeGuid("f0e2d203-a051-48b0-b278-8778e9dd05d2");
		  _VATOnlyInvoice.Click_SalesTAB();
		  
		  
		  TestModellerLogger.SetLastNodeGuid("274df502-bd54-494b-ac44-5675d06e691c");
		  _VATOnlyInvoice.Click_NewTAB();
		  
		  
		  TestModellerLogger.SetLastNodeGuid("d36b3d17-9a87-4ed1-b5ec-4c04544f4fc7");
		  _VATOnlyInvoice.Click_VATOnlyInvoice();
		  
		  
		  TestModellerLogger.SetLastNodeGuid("af5213eb-5d8a-417b-a6c7-f9001ab08632");
		  _VATOnlyInvoice.Select_CustomerName(data[5]);
		  
		  
		  TestModellerLogger.SetLastNodeGuid("fb8ddf53-f049-479e-bc7f-7616b0c519b3");
		  _VATOnlyInvoice.Enter_InvoiceNo(data[17]);
		  
		  
		  TestModellerLogger.SetLastNodeGuid("8c89f2f4-6bf3-42a1-88c1-ca505b8030fd");
		  _VATOnlyInvoice.Enter_InvoiceDate(data[14]);
		  
		  
		  TestModellerLogger.SetLastNodeGuid("06ffea53-9b87-4d49-94a9-5911b6d93cf5");
		  _VATOnlyInvoice.Enter_SubTotal(data[10]);
		  
		  
		  TestModellerLogger.SetLastNodeGuid("17ab7377-3f0f-4615-b7e3-000f92b59dc3");
		  _VATOnlyInvoice.Select_VATRateType("Standard Rate");
		  
		  
		  
		
		  
		  TestModellerLogger.SetLastNodeGuid("a2bdfe37-c194-4ea0-b657-4d576468655c");
		  _VATOnlyInvoice.Click_SaveButton();
		 
  
  pages.BankNewTransaction _ReconcilationTransaction = new  pages.BankNewTransaction(driver); 

  
 TestModellerLogger.SetLastNodeGuid("00b70107-cc4a-4697-a71f-dbb0d1c0ef03");
  _ReconcilationTransaction.Click_BankingTAB(); 
  
  TestModellerLogger.SetLastNodeGuid("94a4fa93-d2d5-4ff6-837c-ef202411eca4");
  _ReconcilationTransaction.Click_NewTAB(); 
  
TestModellerLogger.SetLastNodeGuid("d0e7d4a2-32cb-48b0-b4da-56a9fea2e49b");
  _ReconcilationTransaction.Click_NewTransaction();
//    

  
      pages.banking.ashiv.Fill_Bank_tran _ob=new pages.banking.ashiv.Fill_Bank_tran(driver);
//  
      _ob.Fill_Recnl_Bank_Recon();
     
  
  pages.BankNewTransaction _ReconcilationTransaction1 = new  pages.BankNewTransaction(driver); 
  
  
  
  TestModellerLogger.SetLastNodeGuid("00b70107-cc4a-4697-a71f-dbb0d1c0ef03");
  _ReconcilationTransaction1.Click_BankingTAB(); 
  
  pages.banking.ashiv.unconcilledbutn _obb=new pages.banking.ashiv.unconcilledbutn(driver);
  _obb.Click_Unreconciled_Transactions_button1();
  
  pages.banking.ashiv.Find_Match _ff=new  pages.banking.ashiv.Find_Match (driver);
  _ff.Select_All0(data[18]);
  
  
  
  pages.banking.ashiv.Search_Find _Search_Find = new     pages.banking.ashiv.Search_Find(driver);
  
  TestModellerLogger.SetLastNodeGuid("8a9dde95-9204-4033-889c-99593994af4a");
  _Search_Find.Click_Clickon_search_icon1();
  

  TestModellerLogger.SetLastNodeGuid("8b872776-6a72-4212-b8dd-cfa7c0b0026a");
  _Search_Find.Enter_Search_Amount3("2500");
  
  _Search_Find.Click_Search_btn_click6();
	utilities.Screenshotcapture.Getscreenshot("pass", "AmountFilter");
  
  Thread.sleep(2000);
  
  
  
  _Search_Find.Enter_Search_Amount4("500");
  
 _Search_Find.Click_Search_btn_click6();
 utilities.Screenshotcapture.Getscreenshot("pass1", "AmountFilter");
 
  Thread.sleep(2000);
  
  _Search_Find.Enter_Search_Amount5("");
  
  //_Search_Find.Click_Search_btn_click6();
  
   Thread.sleep(3000);
  
   
  
  TestModellerLogger.SetLastNodeGuid("2c787bb2-a391-48c0-b8ef-fc06ebd08f5f");
  _Search_Find.Enter_Search_DateFrom4(data[13]);
  

  TestModellerLogger.SetLastNodeGuid("31a91c84-e7f9-4bfe-86a3-8dadcdce99a3");
  _Search_Find.Enter_Search_DateTo5(data[13]);
  Thread.sleep(3000);
  
  

  TestModellerLogger.SetLastNodeGuid("8712bbe3-9979-4ba2-8bdd-bc3927522ce5");
  _Search_Find.Click_Search_btn_click6();
  utilities.Screenshotcapture.Getscreenshot("pass", "FullAmount_DateFilter");
  
  
  TestModellerLogger.SetLastNodeGuid("2c787bb2-a391-48c0-b8ef-fc06ebd08f5f");
  _Search_Find.Enter_Search_DateFrom4(data[14]);
  

  TestModellerLogger.SetLastNodeGuid("31a91c84-e7f9-4bfe-86a3-8dadcdce99a3");
  _Search_Find.Enter_Search_DateTo5(data[14]);
  
  

  TestModellerLogger.SetLastNodeGuid("8712bbe3-9979-4ba2-8bdd-bc3927522ce5");
  _Search_Find.Click_Search_btn_click6();
  utilities.Screenshotcapture.Getscreenshot("pass1", "FullAmount_DateFilter");
  
  
  TestModellerLogger.SetLastNodeGuid("2c787bb2-a391-48c0-b8ef-fc06ebd08f5f");
  _Search_Find.Enter_Search_DateFrom4("01/01/2022");
  

  TestModellerLogger.SetLastNodeGuid("31a91c84-e7f9-4bfe-86a3-8dadcdce99a3");
  _Search_Find.Enter_Search_DateTo5("01/12/2022");
  
  

  TestModellerLogger.SetLastNodeGuid("8712bbe3-9979-4ba2-8bdd-bc3927522ce5");
  _Search_Find.Click_Search_btn_click6();
  utilities.Screenshotcapture.Getscreenshot("pass3", "FullAmount_DateFilter");
  
  Thread.sleep(5000);
  
  _Search_Find.Select_Invoice(data[7]);
  
  pages.BankNewTransaction _ReconcilationTransaction2 = new  pages.BankNewTransaction(driver); 

  TestModellerLogger.SetLastNodeGuid("00b70107-cc4a-4697-a71f-dbb0d1c0ef03");
   _ReconcilationTransaction2.Click_BankingTAB(); 
   
   TestModellerLogger.SetLastNodeGuid("94a4fa93-d2d5-4ff6-837c-ef202411eca4");
   _ReconcilationTransaction2.Click_NewTAB(); 
   
 TestModellerLogger.SetLastNodeGuid("d0e7d4a2-32cb-48b0-b4da-56a9fea2e49b");
   _ReconcilationTransaction2.Click_NewTransaction();
 //    

   
       pages.banking.ashiv.Fill_Bank_tran _ob1=new pages.banking.ashiv.Fill_Bank_tran(driver);
 //  
       _ob1.Fill_Recnl_Bank_Recon1();      
   
   pages.BankNewTransaction _ReconcilationTransaction3 = new  pages.BankNewTransaction(driver); 
  
   TestModellerLogger.SetLastNodeGuid("00b70107-cc4a-4697-a71f-dbb0d1c0ef03");
   _ReconcilationTransaction3.Click_BankingTAB(); 
   
   pages.banking.ashiv.unconcilledbutn _obb1=new pages.banking.ashiv.unconcilledbutn(driver);
   _obb1.Click_Unreconciled_Transactions_button1();
   
   pages.banking.ashiv.Find_Match _ff1=new  pages.banking.ashiv.Find_Match (driver);
   _ff1.Select_All0(data[18]);
   
  
  
  
  
pages.banking.ashiv.Search_Find _Search_Find1 = new     pages.banking.ashiv.Search_Find(driver);
  
  TestModellerLogger.SetLastNodeGuid("8a9dde95-9204-4033-889c-99593994af4a");
  
  _Search_Find1.Click_Clickon_search_icon1();
  _Search_Find1.Select_InvoiceCr();

  
  

  //  TestModellerLogger.SetLastNodeGuid("cb6d5101-0be0-4519-b1aa-5e71dcdfbef3");
  //  _SaleInvoice.Click_Tickformorelineitems();
    

  //  TestModellerLogger.SetLastNodeGuid("6aeae28b-fd85-4712-8710-18e4b190dd19");
  //  _SaleInvoice.Enter_Note("");

    }

////    
    @Test  (groups= {"SaleInvoice","SaleInvoice - Default Profile"})
    @TestModellerPath(guid = "a6ea7f10-1830-474a-b799-15d8c748d678")
    public void GoToUrlAssertUrlClickSalesTabClickNewButtonClickNewInvoicePositiveSelectCustomerNamePositiveunreconciledtTransactionNewTransactionLedgerCode1070FindAndSearchIconInvoiceReconciledClickReconcileButtonPartialReconcilation() throws InterruptedException, HeadlessException, IOException, AWTException, InvalidFormatException
    {
    	 sTestCaseID="TC8"; 
   	  Sheet="BankingBank"; 
   	  data =ExcelData.toReadExcelData(sTestCaseID, Sheet);
   	  
   	
   	  pages.banking.ashiv.nlogin _nlogin = new pages.banking.ashiv.nlogin(driver);
   	  
   	  TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
   	  _nlogin.GoToUrl();
   	  
   	  TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
   	  // _nlogin.AssertUrl();
   	  
   	  
   	  TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
   	  _nlogin.Enter_nLOGIN(data[1]);
   	  
   	  
   	  TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
   	  _nlogin.Enter_nPASS(data[2]);
   	  
   	  
   	  TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
   	  _nlogin.Click_Login();
   	  
   	pages.banking.ashiv.AgentSearch _AgentSearch = new pages.banking.ashiv.AgentSearch(driver);
	 
	  
	  TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
	  _AgentSearch.Click_Agents();
	  
	  TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
	  _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
	  
	  
	  TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
	  _AgentSearch.Click_Search(); 
	  
	  TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
	  _AgentSearch.Click__Nidhi1_(); 
	  
	  
	 pages.banking.ashiv.Searchclient _Searchclient = new pages.banking.ashiv.Searchclient(driver); 
	 
	  TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
	  _Searchclient.Click__Clients_(); 

	  TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
	  _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);


	  TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
	  _Searchclient.Click_Searchbtn(); 
	  
	  TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
	  _Searchclient.Click__NidhiEnt(); 
   	  
		
		  pages.banking.ashiv.SaleInvoice _SaleInvoice = new pages.banking.ashiv.SaleInvoice(driver);
		  
		  //
		  TestModellerLogger.SetLastNodeGuid("2f331494-c0ec-443e-b258-bdf3d2f9d9fc");
		  // _SaleInvoice.GoToUrl();
		  
		  
		  //
		  TestModellerLogger.SetLastNodeGuid("281121da-f0ce-4629-a4d1-0bc9b4260347");
		  // _SaleInvoice.AssertUrl();
		  
		  
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
		  _SaleInvoice.Enter_InvoiceDate(data[13]);
		  
		  
		  
		  
		  TestModellerLogger.SetLastNodeGuid("294097b8-ccc5-4eb7-baec-1a26ca1364f0");
		  _SaleInvoice.Select_IncomeType(data[8]);
		  
		  
		  TestModellerLogger.SetLastNodeGuid("5ccbf01b-65a3-47f5-b916-dab48aab691f");
		  _SaleInvoice.Enter_Description(data[9]);
		  
		  
		  TestModellerLogger.SetLastNodeGuid("73677a32-1892-47f6-9783-a1072478778a");
		  _SaleInvoice.Enter_UnitPrice(data[10]);
		  
		  
		  TestModellerLogger.SetLastNodeGuid("d810d5bf-a960-434c-9172-1671dd383495");
		  _SaleInvoice.Enter_Quantity(data[11]);
		  
		  
		  TestModellerLogger.SetLastNodeGuid("516c7236-f043-4de9-b128-99997ccf1604");
		  _SaleInvoice.Select_VATRate(data[16]);
		  
		  TestModellerLogger.SetLastNodeGuid("2508d3fa-348f-48f2-914a-4d43591ded90");
		  _SaleInvoice.Click_SaveButton();
		  
		  pages.banking.ashiv.SaleCreditNote _SaleCreditNote = new pages.banking.ashiv.SaleCreditNote(driver);
		  
		  TestModellerLogger.SetLastNodeGuid("41f6f46c-f112-4637-917e-dbdc89c9bae5");
		  _SaleCreditNote.Click_SalesTab();
		  
		  
		  TestModellerLogger.SetLastNodeGuid("a1dedc7e-b8d5-4e5d-8d02-93387c7d697a");
		  _SaleCreditNote.Click_NewButton();
		  
		  
		  TestModellerLogger.SetLastNodeGuid("1d0f5c26-1f07-4ad5-8953-adfe5634232b");
		  _SaleCreditNote.Click_NewCreditNote();
		  
		  
		  TestModellerLogger.SetLastNodeGuid("8f0ac483-4b81-4ec8-b63a-c9243e4da070");
		  _SaleCreditNote.Select_CustomerName(data[20]);
		  
		  
		  TestModellerLogger.SetLastNodeGuid("1062d571-8265-4c35-b27d-4d4ef9dad8d7");
		  _SaleCreditNote.Enter_CreditNoteNo(data[7]);
		  
		  
		  TestModellerLogger.SetLastNodeGuid("783d5ff9-7311-4812-8e73-f0e433fdc8a4");
		  _SaleCreditNote.Enter_CreditNoteDate(data[13]);
		  
		  
		  
		  TestModellerLogger.SetLastNodeGuid("749d2d39-5d01-4ef9-ad4d-6af022daeea6");
		  _SaleCreditNote.Select_IncomeType1(data[8]);
		  
		  
		  TestModellerLogger.SetLastNodeGuid("91d673df-2732-4b8e-8bd9-2ade1408cd1b");
		  _SaleCreditNote.Enter_InvoiceNo(data[7]);
		  
		  
		  TestModellerLogger.SetLastNodeGuid("410b9063-8412-49e5-b62c-950ec76f591d");
		  _SaleCreditNote.Enter_CreditDescription(data[9]);
		  
		  
		  TestModellerLogger.SetLastNodeGuid("10a0cb0a-3cf3-483a-bcee-368d1ddad071");
		  _SaleCreditNote.Enter_UnitPrice(data[12]);
		  
		  
		  TestModellerLogger.SetLastNodeGuid("93095997-7b8d-4e46-8903-a2a5b64060d3");
		  _SaleCreditNote.Enter_Quantity(data[11]);
		  
		  
		  TestModellerLogger.SetLastNodeGuid("f454ded6-253b-491a-9317-c1ad823e1c7c");
		  _SaleCreditNote.Select_VATRateType("Out of Scope");
		  
		  TestModellerLogger.SetLastNodeGuid("ff1a8f18-679c-4fbe-b321-b4eb48b484a1");
		  _SaleCreditNote.Click_SaveButton();
		  
		  
		  
		  pages.banking.ashiv.VATOnlyInvoice _VATOnlyInvoice = new
		  pages.banking.ashiv.VATOnlyInvoice(driver); //
		  TestModellerLogger.SetLastNodeGuid("022b9dec-7d48-413f-862f-046626f82bd5");
		  // _VATOnlyInvoice.GoToUrl(); // // //
		  TestModellerLogger.SetLastNodeGuid("56572bdb-37f0-4286-88f7-beee95c645c7");
		  // _VATOnlyInvoice.AssertUrl();
		  
		  
		  TestModellerLogger.SetLastNodeGuid("f0e2d203-a051-48b0-b278-8778e9dd05d2");
		  _VATOnlyInvoice.Click_SalesTAB();
		  
		  
		  TestModellerLogger.SetLastNodeGuid("274df502-bd54-494b-ac44-5675d06e691c");
		  _VATOnlyInvoice.Click_NewTAB();
		  
		  
		  TestModellerLogger.SetLastNodeGuid("d36b3d17-9a87-4ed1-b5ec-4c04544f4fc7");
		  _VATOnlyInvoice.Click_VATOnlyInvoice();
		  
		  
		  TestModellerLogger.SetLastNodeGuid("af5213eb-5d8a-417b-a6c7-f9001ab08632");
		  _VATOnlyInvoice.Select_CustomerName(data[5]);
		  
		  
		  TestModellerLogger.SetLastNodeGuid("fb8ddf53-f049-479e-bc7f-7616b0c519b3");
		  _VATOnlyInvoice.Enter_InvoiceNo(data[17]);
		  
		  
		  TestModellerLogger.SetLastNodeGuid("8c89f2f4-6bf3-42a1-88c1-ca505b8030fd");
		  _VATOnlyInvoice.Enter_InvoiceDate(data[14]);
		  
		  
		  TestModellerLogger.SetLastNodeGuid("06ffea53-9b87-4d49-94a9-5911b6d93cf5");
		  _VATOnlyInvoice.Enter_SubTotal(data[10]);
		  
		  
		  TestModellerLogger.SetLastNodeGuid("17ab7377-3f0f-4615-b7e3-000f92b59dc3");
		  _VATOnlyInvoice.Select_VATRateType("Standard Rate");
		  
		  
		  
		  //
		  TestModellerLogger.SetLastNodeGuid("83b15b8a-fef9-45c4-99a5-7b6bf52e2e39");
		  // _VATOnlyInvoice.Enter_VATRate(""); // // //
		  TestModellerLogger.SetLastNodeGuid("0b562ab8-e40c-4f33-b2d0-0682cb23afb6");
		  // _VATOnlyInvoice.Enter_VATAmount(""); // // //
		  TestModellerLogger.SetLastNodeGuid("945fc6d7-6180-473c-a32b-0a95f5a89bac");
		  // _VATOnlyInvoice.Enter_GrossTotal(""); //
		  
		  //
		  TestModellerLogger.SetLastNodeGuid("1b120cb0-aa11-4b86-a6d8-2e40fc7e36ef");
		  // _VATOnlyInvoice.Enter_ConvertedAmount("100");
		  
		  
		  TestModellerLogger.SetLastNodeGuid("a2bdfe37-c194-4ea0-b657-4d576468655c");
		  _VATOnlyInvoice.Click_SaveButton();
		 
  
  pages.BankNewTransaction _ReconcilationTransaction = new  pages.BankNewTransaction(driver); 

 TestModellerLogger.SetLastNodeGuid("00b70107-cc4a-4697-a71f-dbb0d1c0ef03");
  _ReconcilationTransaction.Click_BankingTAB(); 
  
  TestModellerLogger.SetLastNodeGuid("94a4fa93-d2d5-4ff6-837c-ef202411eca4");
  _ReconcilationTransaction.Click_NewTAB(); 
  
TestModellerLogger.SetLastNodeGuid("d0e7d4a2-32cb-48b0-b4da-56a9fea2e49b");
  _ReconcilationTransaction.Click_NewTransaction();
//    

  
      pages.banking.ashiv.Fill_Bank_tran _ob=new pages.banking.ashiv.Fill_Bank_tran(driver);
//  
      _ob.Fill_Recnl_Bank_ReconParAmount();
     
  
  pages.BankNewTransaction _ReconcilationTransaction1 = new  pages.BankNewTransaction(driver); 
  
  TestModellerLogger.SetLastNodeGuid("00b70107-cc4a-4697-a71f-dbb0d1c0ef03");
  _ReconcilationTransaction1.Click_BankingTAB(); 
  
  pages.banking.ashiv.unconcilledbutn _obb=new pages.banking.ashiv.unconcilledbutn(driver);
  _obb.Click_Unreconciled_Transactions_button1();
  
  pages.banking.ashiv.Find_Match _ff=new  pages.banking.ashiv.Find_Match (driver);
  _ff.Select_All0(data[18]);
  
  
  
  pages.banking.ashiv.Search_Find _Search_Find = new     pages.banking.ashiv.Search_Find(driver);
  
  TestModellerLogger.SetLastNodeGuid("8a9dde95-9204-4033-889c-99593994af4a");
  _Search_Find.Click_Clickon_search_icon1();
  

  TestModellerLogger.SetLastNodeGuid("8b872776-6a72-4212-b8dd-cfa7c0b0026a");
  _Search_Find.Enter_Search_Amount3("2500");
  
  _Search_Find.Click_Search_btn_click6();
  Thread.sleep(2000);
  
  
  
  _Search_Find.Enter_Search_Amount4("500");
  
 _Search_Find.Click_Search_btn_click6();
  Thread.sleep(2000);
  
  _Search_Find.Enter_Search_Amount5("");
  
  //_Search_Find.Click_Search_btn_click6();
  
   Thread.sleep(3000);
  
   
  
  TestModellerLogger.SetLastNodeGuid("2c787bb2-a391-48c0-b8ef-fc06ebd08f5f");
  _Search_Find.Enter_Search_DateFrom4(data[13]);
  

  TestModellerLogger.SetLastNodeGuid("31a91c84-e7f9-4bfe-86a3-8dadcdce99a3");
  _Search_Find.Enter_Search_DateTo5(data[13]);
  Thread.sleep(3000);
  
  

  TestModellerLogger.SetLastNodeGuid("8712bbe3-9979-4ba2-8bdd-bc3927522ce5");
  _Search_Find.Click_Search_btn_click6();
  
  TestModellerLogger.SetLastNodeGuid("2c787bb2-a391-48c0-b8ef-fc06ebd08f5f");
  _Search_Find.Enter_Search_DateFrom4(data[14]);
  

  TestModellerLogger.SetLastNodeGuid("31a91c84-e7f9-4bfe-86a3-8dadcdce99a3");
  _Search_Find.Enter_Search_DateTo5(data[14]);
  
  

  TestModellerLogger.SetLastNodeGuid("8712bbe3-9979-4ba2-8bdd-bc3927522ce5");
  _Search_Find.Click_Search_btn_click6();
  
  TestModellerLogger.SetLastNodeGuid("2c787bb2-a391-48c0-b8ef-fc06ebd08f5f");
  _Search_Find.Enter_Search_DateFrom4("01/01/2022");
  

  TestModellerLogger.SetLastNodeGuid("31a91c84-e7f9-4bfe-86a3-8dadcdce99a3");
  _Search_Find.Enter_Search_DateTo5("01/12/2022");
  
  

  TestModellerLogger.SetLastNodeGuid("8712bbe3-9979-4ba2-8bdd-bc3927522ce5");
  _Search_Find.Click_Search_btn_click6();
  
  Thread.sleep(5000);
  
  _Search_Find.Select_Invoicepartial(data[7]);
  
  pages.BankNewTransaction _ReconcilationTransaction2 = new  pages.BankNewTransaction(driver); 

  TestModellerLogger.SetLastNodeGuid("00b70107-cc4a-4697-a71f-dbb0d1c0ef03");
   _ReconcilationTransaction2.Click_BankingTAB(); 
   
   TestModellerLogger.SetLastNodeGuid("94a4fa93-d2d5-4ff6-837c-ef202411eca4");
   _ReconcilationTransaction2.Click_NewTAB(); 
   
 TestModellerLogger.SetLastNodeGuid("d0e7d4a2-32cb-48b0-b4da-56a9fea2e49b");
   _ReconcilationTransaction2.Click_NewTransaction();
 //    

   
       pages.banking.ashiv.Fill_Bank_tran _ob1=new pages.banking.ashiv.Fill_Bank_tran(driver);
 //  
       _ob1.Fill_Recnl_Bank_Recon_PCR_Amout();
   
   pages.BankNewTransaction _ReconcilationTransaction3 = new  pages.BankNewTransaction(driver); 
  
   TestModellerLogger.SetLastNodeGuid("00b70107-cc4a-4697-a71f-dbb0d1c0ef03");
   _ReconcilationTransaction3.Click_BankingTAB(); 
   
   pages.banking.ashiv.unconcilledbutn _obb1=new pages.banking.ashiv.unconcilledbutn(driver);
   _obb1.Click_Unreconciled_Transactions_button1();
   
   pages.banking.ashiv.Find_Match _ff1=new  pages.banking.ashiv.Find_Match (driver);
   _ff1.Select_All02(data[19]);
   
  
  
  
  
pages.banking.ashiv.Search_Find _Search_Find1 = new     pages.banking.ashiv.Search_Find(driver);
  
  TestModellerLogger.SetLastNodeGuid("8a9dde95-9204-4033-889c-99593994af4a");
  
  _Search_Find1.Click_Clickon_search_icon1();
  _Search_Find1.Select_InvoiceCrPar();

  
    

  //  TestModellerLogger.SetLastNodeGuid("cb6d5101-0be0-4519-b1aa-5e71dcdfbef3");
  //  _SaleInvoice.Click_Tickformorelineitems();
    

  //  TestModellerLogger.SetLastNodeGuid("6aeae28b-fd85-4712-8710-18e4b190dd19");
  //  _SaleInvoice.Enter_Note("");

    }

@Test  (groups= {"SaleInvoice","SaleInvoice - Default Profile"})
@TestModellerPath(guid = "a6ea7f10-1830-474a-b799-15d8c748d678")
public void GoToUrlAssertUrlClickSalesTabClickNewButtonClickNewInvoicePositiveSelectCustomerNamePositiveunreconciledtTransactionNewTransactionLedgerCode1070FindAndSearchIconInvoiceReconciledClickReconcileButtonJournalReconcilation() throws InterruptedException, HeadlessException, IOException, AWTException, InvalidFormatException
{
	 sTestCaseID="TC9"; 
	  Sheet="BankingBank"; 
	  data =ExcelData.toReadExcelData(sTestCaseID, Sheet);
	  
	
	  pages.banking.ashiv.nlogin _nlogin = new pages.banking.ashiv.nlogin(driver);
	  
	  TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
	  _nlogin.GoToUrl();
	  
	  TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
	  // _nlogin.AssertUrl();
	  
	  
	  TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
	  _nlogin.Enter_nLOGIN(data[1]);
	  
	  
	  TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
	  _nlogin.Enter_nPASS(data[2]);
	  
	  
	  TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
	  _nlogin.Click_Login();
	  
	pages.banking.ashiv.AgentSearch _AgentSearch = new pages.banking.ashiv.AgentSearch(driver);
 
  
  TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
  _AgentSearch.Click_Agents();
  
  TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
  _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
  
  
  TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
  _AgentSearch.Click_Search(); 
  
  TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
  _AgentSearch.Click__Nidhi1_(); 
  
  
 pages.banking.ashiv.Searchclient _Searchclient = new pages.banking.ashiv.Searchclient(driver); 
 
  TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
  _Searchclient.Click__Clients_(); 

  TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
  _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);


  TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
  _Searchclient.Click_Searchbtn(); 
  
  TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
  _Searchclient.Click__NidhiEnt(); 
	  
	
	  pages.banking.ashiv.SaleInvoice _SaleInvoice = new pages.banking.ashiv.SaleInvoice(driver);
	  
	  //
	  TestModellerLogger.SetLastNodeGuid("2f331494-c0ec-443e-b258-bdf3d2f9d9fc");
	  // _SaleInvoice.GoToUrl();
	  
	  
	  //
	  TestModellerLogger.SetLastNodeGuid("281121da-f0ce-4629-a4d1-0bc9b4260347");
	  // _SaleInvoice.AssertUrl();
	  
	  
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
	  _SaleInvoice.Enter_InvoiceDate(data[13]);
	  
	  
	  
	  
	  TestModellerLogger.SetLastNodeGuid("294097b8-ccc5-4eb7-baec-1a26ca1364f0");
	  _SaleInvoice.Select_IncomeType(data[8]);
	  
	  
	  TestModellerLogger.SetLastNodeGuid("5ccbf01b-65a3-47f5-b916-dab48aab691f");
	  _SaleInvoice.Enter_Description(data[9]);
	  
	  
	  TestModellerLogger.SetLastNodeGuid("73677a32-1892-47f6-9783-a1072478778a");
	  _SaleInvoice.Enter_UnitPrice(data[10]);
	  
	  
	  TestModellerLogger.SetLastNodeGuid("d810d5bf-a960-434c-9172-1671dd383495");
	  _SaleInvoice.Enter_Quantity(data[11]);
	  
	  
	  TestModellerLogger.SetLastNodeGuid("516c7236-f043-4de9-b128-99997ccf1604");
	  _SaleInvoice.Select_VATRate(data[16]);
	  
	  TestModellerLogger.SetLastNodeGuid("2508d3fa-348f-48f2-914a-4d43591ded90");
	  _SaleInvoice.Click_SaveButton();
	  
	  pages.banking.ashiv.SaleCreditNote _SaleCreditNote = new
	  pages.banking.ashiv.SaleCreditNote(driver);
	  
	  TestModellerLogger.SetLastNodeGuid("41f6f46c-f112-4637-917e-dbdc89c9bae5");
	  _SaleCreditNote.Click_SalesTab();
	  
	  
	  TestModellerLogger.SetLastNodeGuid("a1dedc7e-b8d5-4e5d-8d02-93387c7d697a");
	  _SaleCreditNote.Click_NewButton();
	  
	  
	  TestModellerLogger.SetLastNodeGuid("1d0f5c26-1f07-4ad5-8953-adfe5634232b");
	  _SaleCreditNote.Click_NewCreditNote();
	  
	  
	  TestModellerLogger.SetLastNodeGuid("8f0ac483-4b81-4ec8-b63a-c9243e4da070");
	  _SaleCreditNote.Select_CustomerName(data[20]);
	  
	  
	  TestModellerLogger.SetLastNodeGuid("1062d571-8265-4c35-b27d-4d4ef9dad8d7");
	  _SaleCreditNote.Enter_CreditNoteNo(data[7]);
	  
	  
	  TestModellerLogger.SetLastNodeGuid("783d5ff9-7311-4812-8e73-f0e433fdc8a4");
	  _SaleCreditNote.Enter_CreditNoteDate(data[13]);
	  
	  
	  
	  TestModellerLogger.SetLastNodeGuid("749d2d39-5d01-4ef9-ad4d-6af022daeea6");
	  _SaleCreditNote.Select_IncomeType1(data[8]);
	  
	  
	  TestModellerLogger.SetLastNodeGuid("91d673df-2732-4b8e-8bd9-2ade1408cd1b");
	  _SaleCreditNote.Enter_InvoiceNo(data[7]);
	  
	  
	  TestModellerLogger.SetLastNodeGuid("410b9063-8412-49e5-b62c-950ec76f591d");
	  _SaleCreditNote.Enter_CreditDescription(data[9]);
	  
	  
	  TestModellerLogger.SetLastNodeGuid("10a0cb0a-3cf3-483a-bcee-368d1ddad071");
	  _SaleCreditNote.Enter_UnitPrice(data[12]);
	  
	  
	  TestModellerLogger.SetLastNodeGuid("93095997-7b8d-4e46-8903-a2a5b64060d3");
	  _SaleCreditNote.Enter_Quantity(data[11]);
	  
	  
	  TestModellerLogger.SetLastNodeGuid("f454ded6-253b-491a-9317-c1ad823e1c7c");
	  _SaleCreditNote.Select_VATRateType("Out of Scope");
	  
	  TestModellerLogger.SetLastNodeGuid("ff1a8f18-679c-4fbe-b321-b4eb48b484a1");
	  _SaleCreditNote.Click_SaveButton();
	  
	  
	  
	  pages.banking.ashiv.VATOnlyInvoice _VATOnlyInvoice = new
	  pages.banking.ashiv.VATOnlyInvoice(driver); //
	  TestModellerLogger.SetLastNodeGuid("022b9dec-7d48-413f-862f-046626f82bd5");
	  // _VATOnlyInvoice.GoToUrl(); // // //
	  TestModellerLogger.SetLastNodeGuid("56572bdb-37f0-4286-88f7-beee95c645c7");
	  // _VATOnlyInvoice.AssertUrl();
	  
	  
	  TestModellerLogger.SetLastNodeGuid("f0e2d203-a051-48b0-b278-8778e9dd05d2");
	  _VATOnlyInvoice.Click_SalesTAB();
	  
	  
	  TestModellerLogger.SetLastNodeGuid("274df502-bd54-494b-ac44-5675d06e691c");
	  _VATOnlyInvoice.Click_NewTAB();
	  
	  
	  TestModellerLogger.SetLastNodeGuid("d36b3d17-9a87-4ed1-b5ec-4c04544f4fc7");
	  _VATOnlyInvoice.Click_VATOnlyInvoice();
	  
	  
	  TestModellerLogger.SetLastNodeGuid("af5213eb-5d8a-417b-a6c7-f9001ab08632");
	  _VATOnlyInvoice.Select_CustomerName(data[5]);
	  
	  
	  TestModellerLogger.SetLastNodeGuid("fb8ddf53-f049-479e-bc7f-7616b0c519b3");
	  _VATOnlyInvoice.Enter_InvoiceNo(data[17]);
	  
	  
	  TestModellerLogger.SetLastNodeGuid("8c89f2f4-6bf3-42a1-88c1-ca505b8030fd");
	  _VATOnlyInvoice.Enter_InvoiceDate(data[14]);
	  
	  
	  TestModellerLogger.SetLastNodeGuid("06ffea53-9b87-4d49-94a9-5911b6d93cf5");
	  _VATOnlyInvoice.Enter_SubTotal(data[10]);
	  
	  
	  TestModellerLogger.SetLastNodeGuid("17ab7377-3f0f-4615-b7e3-000f92b59dc3");
	  _VATOnlyInvoice.Select_VATRateType("Standard Rate");
	  
	  
	  
	  //
	  TestModellerLogger.SetLastNodeGuid("83b15b8a-fef9-45c4-99a5-7b6bf52e2e39");
	  // _VATOnlyInvoice.Enter_VATRate(""); // // //
	  TestModellerLogger.SetLastNodeGuid("0b562ab8-e40c-4f33-b2d0-0682cb23afb6");
	  // _VATOnlyInvoice.Enter_VATAmount(""); // // //
	  TestModellerLogger.SetLastNodeGuid("945fc6d7-6180-473c-a32b-0a95f5a89bac");
	  // _VATOnlyInvoice.Enter_GrossTotal(""); //
	  
	  //
	  TestModellerLogger.SetLastNodeGuid("1b120cb0-aa11-4b86-a6d8-2e40fc7e36ef");
	  // _VATOnlyInvoice.Enter_ConvertedAmount("100");
	  
	  
	  TestModellerLogger.SetLastNodeGuid("a2bdfe37-c194-4ea0-b657-4d576468655c");
	  _VATOnlyInvoice.Click_SaveButton();
	 

pages.BankNewTransaction _ReconcilationTransaction = new  pages.BankNewTransaction(driver); 

TestModellerLogger.SetLastNodeGuid("00b70107-cc4a-4697-a71f-dbb0d1c0ef03");
_ReconcilationTransaction.Click_BankingTAB(); 

TestModellerLogger.SetLastNodeGuid("94a4fa93-d2d5-4ff6-837c-ef202411eca4");
_ReconcilationTransaction.Click_NewTAB(); 

TestModellerLogger.SetLastNodeGuid("d0e7d4a2-32cb-48b0-b4da-56a9fea2e49b");
_ReconcilationTransaction.Click_NewTransaction();
//


  pages.banking.ashiv.Fill_Bank_tran _ob=new pages.banking.ashiv.Fill_Bank_tran(driver);
//
  _ob.Fill_Recnl_Bank_Recon_Jou();
 

pages.BankNewTransaction _ReconcilationTransaction1 = new  pages.BankNewTransaction(driver); 

TestModellerLogger.SetLastNodeGuid("00b70107-cc4a-4697-a71f-dbb0d1c0ef03");
_ReconcilationTransaction1.Click_BankingTAB(); 

pages.banking.ashiv.unconcilledbutn _obb=new pages.banking.ashiv.unconcilledbutn(driver);
_obb.Click_Unreconciled_Transactions_button1();

pages.banking.ashiv.Find_Match _ff=new  pages.banking.ashiv.Find_Match (driver);
_ff.Select_All0(data[18]);



pages.banking.ashiv.Search_Find _Search_Find = new     pages.banking.ashiv.Search_Find(driver);

TestModellerLogger.SetLastNodeGuid("8a9dde95-9204-4033-889c-99593994af4a");
_Search_Find.Click_Clickon_search_icon1();


TestModellerLogger.SetLastNodeGuid("8b872776-6a72-4212-b8dd-cfa7c0b0026a");
_Search_Find.Enter_Search_Amount3("2500");

_Search_Find.Click_Search_btn_click6();
Thread.sleep(2000);



_Search_Find.Enter_Search_Amount4("500");

_Search_Find.Click_Search_btn_click6();
Thread.sleep(2000);

_Search_Find.Enter_Search_Amount5("");

//_Search_Find.Click_Search_btn_click6();

Thread.sleep(3000);



TestModellerLogger.SetLastNodeGuid("2c787bb2-a391-48c0-b8ef-fc06ebd08f5f");
_Search_Find.Enter_Search_DateFrom4(data[13]);


TestModellerLogger.SetLastNodeGuid("31a91c84-e7f9-4bfe-86a3-8dadcdce99a3");
_Search_Find.Enter_Search_DateTo5(data[13]);
Thread.sleep(2000);



TestModellerLogger.SetLastNodeGuid("8712bbe3-9979-4ba2-8bdd-bc3927522ce5");
_Search_Find.Click_Search_btn_click6();
Thread.sleep(3000);
TestModellerLogger.SetLastNodeGuid("2c787bb2-a391-48c0-b8ef-fc06ebd08f5f");
_Search_Find.Enter_Search_DateFrom4(data[14]);


TestModellerLogger.SetLastNodeGuid("31a91c84-e7f9-4bfe-86a3-8dadcdce99a3");
_Search_Find.Enter_Search_DateTo5(data[14]);



TestModellerLogger.SetLastNodeGuid("8712bbe3-9979-4ba2-8bdd-bc3927522ce5");
_Search_Find.Click_Search_btn_click6();
Thread.sleep(3000);
TestModellerLogger.SetLastNodeGuid("2c787bb2-a391-48c0-b8ef-fc06ebd08f5f");
_Search_Find.Enter_Search_DateFrom4("01/01/2022");


TestModellerLogger.SetLastNodeGuid("31a91c84-e7f9-4bfe-86a3-8dadcdce99a3");
_Search_Find.Enter_Search_DateTo5("01/12/2022");



TestModellerLogger.SetLastNodeGuid("8712bbe3-9979-4ba2-8bdd-bc3927522ce5");
_Search_Find.Click_Search_btn_click6();

Thread.sleep(5000);

_Search_Find.Select_Invoicejou(data[7]);
//
pages.BankNewTransaction _ReconcilationTransaction2 = new  pages.BankNewTransaction(driver); 

TestModellerLogger.SetLastNodeGuid("00b70107-cc4a-4697-a71f-dbb0d1c0ef03");
_ReconcilationTransaction2.Click_BankingTAB(); 

TestModellerLogger.SetLastNodeGuid("94a4fa93-d2d5-4ff6-837c-ef202411eca4");
_ReconcilationTransaction2.Click_NewTAB(); 

TestModellerLogger.SetLastNodeGuid("d0e7d4a2-32cb-48b0-b4da-56a9fea2e49b");
_ReconcilationTransaction2.Click_NewTransaction();
//    


   pages.banking.ashiv.Fill_Bank_tran _ob1=new pages.banking.ashiv.Fill_Bank_tran(driver);
//  
   _ob1.Fill_Recnl_Bank_Recon_Jou1();

pages.BankNewTransaction _ReconcilationTransaction3 = new  pages.BankNewTransaction(driver); 

TestModellerLogger.SetLastNodeGuid("00b70107-cc4a-4697-a71f-dbb0d1c0ef03");
_ReconcilationTransaction3.Click_BankingTAB(); 

pages.banking.ashiv.unconcilledbutn _obb1=new pages.banking.ashiv.unconcilledbutn(driver);
_obb1.Click_Unreconciled_Transactions_button1();

pages.banking.ashiv.Find_Match _ff1=new  pages.banking.ashiv.Find_Match (driver);
_ff1.Select_All02(data[19]);





pages.banking.ashiv.Search_Find _Search_Find1 = new     pages.banking.ashiv.Search_Find(driver);

TestModellerLogger.SetLastNodeGuid("8a9dde95-9204-4033-889c-99593994af4a");

_Search_Find1.Click_Clickon_search_icon1();
_Search_Find1.Select_InvoiceCrJou();


}

//  TestModellerLogger.SetLastNodeGuid("cb6d5101-0be0-4519-b1aa-5e71dcdfbef3");
//  _SaleInvoice.Click_Tickformorelineitems();


//  TestModellerLogger.SetLastNodeGuid("6aeae28b-fd85-4712-8710-18e4b190dd19");
//  _SaleInvoice.Enter_Note("");

}
/*
 * @Test (groups= {"SaleInvoice","SaleInvoice - Default Profile"})
 * 
 * @TestModellerPath(guid = "fa711c71-7c01-4457-8fa3-607252f548a9") public void
 * GoToUrlAssertUrlClickSalesTabClickNewButtonClickNewInvoicePositiveSelectCustomerNamePositiveE2
 * () throws InterruptedException, HeadlessException, IOException, AWTException
 * {
 * 
 * pages.SaleInvoice _SaleInvoice = new pages.SaleInvoice(driver);
 * TestModellerLogger.SetLastNodeGuid("2f331494-c0ec-443e-b258-bdf3d2f9d9fc");
 * _SaleInvoice.GoToUrl();
 * 
 * 
 * TestModellerLogger.SetLastNodeGuid("281121da-f0ce-4629-a4d1-0bc9b4260347");
 * _SaleInvoice.AssertUrl();
 * 
 * 
 * TestModellerLogger.SetLastNodeGuid("38510c8a-daac-4ff8-83f3-54b176440787");
 * _SaleInvoice.Click_SalesTab();
 * 
 * 
 * TestModellerLogger.SetLastNodeGuid("2ce6ef22-01ee-4e82-bcb0-f7ce06badd95");
 * _SaleInvoice.Click_NewButton();
 * 
 * 
 * TestModellerLogger.SetLastNodeGuid("b605bf48-53b8-4f7f-a009-9ea8d59b69ba");
 * _SaleInvoice.Click_NewInvoice();
 * 
 * 
 * TestModellerLogger.SetLastNodeGuid("4e83b316-7f8b-49b7-a97f-e85cefb020f0");
 * _SaleInvoice.Select_CustomerName("nid");
 * 
 * 
 * TestModellerLogger.SetLastNodeGuid("f3edcc35-8d70-4902-81f0-9c5d760fac46");
 * _SaleInvoice.Enter_InvoiceNo("");
 * 
 * 
 * TestModellerLogger.SetLastNodeGuid("6f885a16-e34c-4d0d-914a-a726c1fa9617");
 * _SaleInvoice.Enter_InvoiceDate("44204");
 * 
 * 
 * TestModellerLogger.SetLastNodeGuid("294097b8-ccc5-4eb7-baec-1a26ca1364f0");
 * _SaleInvoice.Select_IncomeType("");
 * 
 * 
 * TestModellerLogger.SetLastNodeGuid("5ccbf01b-65a3-47f5-b916-dab48aab691f");
 * _SaleInvoice.Enter_Description("bbb");
 * 
 * 
 * TestModellerLogger.SetLastNodeGuid("73677a32-1892-47f6-9783-a1072478778a");
 * _SaleInvoice.Enter_UnitPrice("");
 * 
 * 
 * TestModellerLogger.SetLastNodeGuid("d810d5bf-a960-434c-9172-1671dd383495");
 * _SaleInvoice.Enter_Quantity("");
 * 
 * 
 * TestModellerLogger.SetLastNodeGuid("516c7236-f043-4de9-b128-99997ccf1604");
 * _SaleInvoice.Select_VATRate("Zero Rate");
 * 
 * 
 * TestModellerLogger.SetLastNodeGuid("cb6d5101-0be0-4519-b1aa-5e71dcdfbef3");
 * _SaleInvoice.Click_Tickformorelineitems();
 * 
 * 
 * TestModellerLogger.SetLastNodeGuid("6aeae28b-fd85-4712-8710-18e4b190dd19");
 * _SaleInvoice.Enter_Note("");
 * 
 * 
 * TestModellerLogger.SetLastNodeGuid("2508d3fa-348f-48f2-914a-4d43591ded90");
 * _SaleInvoice.Click_SaveButton(); }
 * 
 * @Test (groups= {"SaleInvoice","SaleInvoice - Default Profile"})
 * 
 * @TestModellerPath(guid = "96835c87-8a52-456a-ae71-5ab73f019d82") public void
 * GoToUrlAssertUrlClickSalesTabClickNewButtonClickNewInvoicePositiveSelectCustomerNamePositiveE3
 * () throws InterruptedException, HeadlessException, IOException, AWTException
 * {
 * 
 * pages.SaleInvoice _SaleInvoice = new pages.SaleInvoice(driver);
 * TestModellerLogger.SetLastNodeGuid("2f331494-c0ec-443e-b258-bdf3d2f9d9fc");
 * _SaleInvoice.GoToUrl();
 * 
 * 
 * TestModellerLogger.SetLastNodeGuid("281121da-f0ce-4629-a4d1-0bc9b4260347");
 * _SaleInvoice.AssertUrl();
 * 
 * 
 * TestModellerLogger.SetLastNodeGuid("38510c8a-daac-4ff8-83f3-54b176440787");
 * _SaleInvoice.Click_SalesTab();
 * 
 * 
 * TestModellerLogger.SetLastNodeGuid("2ce6ef22-01ee-4e82-bcb0-f7ce06badd95");
 * _SaleInvoice.Click_NewButton();
 * 
 * 
 * TestModellerLogger.SetLastNodeGuid("b605bf48-53b8-4f7f-a009-9ea8d59b69ba");
 * _SaleInvoice.Click_NewInvoice();
 * 
 * 
 * TestModellerLogger.SetLastNodeGuid("4e83b316-7f8b-49b7-a97f-e85cefb020f0");
 * _SaleInvoice.Select_CustomerName("nid");
 * 
 * 
 * TestModellerLogger.SetLastNodeGuid("f3edcc35-8d70-4902-81f0-9c5d760fac46");
 * _SaleInvoice.Enter_InvoiceNo("");
 * 
 * 
 * TestModellerLogger.SetLastNodeGuid("6f885a16-e34c-4d0d-914a-a726c1fa9617");
 * _SaleInvoice.Enter_InvoiceDate("44204");
 * 
 * 
 * TestModellerLogger.SetLastNodeGuid("294097b8-ccc5-4eb7-baec-1a26ca1364f0");
 * _SaleInvoice.Select_IncomeType("");
 * 
 * 
 * TestModellerLogger.SetLastNodeGuid("5ccbf01b-65a3-47f5-b916-dab48aab691f");
 * _SaleInvoice.Enter_Description("CCCC");
 * 
 * 
 * TestModellerLogger.SetLastNodeGuid("73677a32-1892-47f6-9783-a1072478778a");
 * _SaleInvoice.Enter_UnitPrice("");
 * 
 * 
 * TestModellerLogger.SetLastNodeGuid("d810d5bf-a960-434c-9172-1671dd383495");
 * _SaleInvoice.Enter_Quantity("");
 * 
 * 
 * TestModellerLogger.SetLastNodeGuid("516c7236-f043-4de9-b128-99997ccf1604");
 * _SaleInvoice.Select_VATRate("Reduced Rate");
 * 
 * 
 * TestModellerLogger.SetLastNodeGuid("cb6d5101-0be0-4519-b1aa-5e71dcdfbef3");
 * _SaleInvoice.Click_Tickformorelineitems();
 * 
 * 
 * TestModellerLogger.SetLastNodeGuid("6aeae28b-fd85-4712-8710-18e4b190dd19");
 * _SaleInvoice.Enter_Note("");
 * 
 * 
 * TestModellerLogger.SetLastNodeGuid("2508d3fa-348f-48f2-914a-4d43591ded90");
 * _SaleInvoice.Click_SaveButton();
 * 
 * 
 * }
 * 
 * @Test (groups= {"SaleInvoice","SaleInvoice - Default Profile"})
 * 
 * @TestModellerPath(guid = "a6a32aae-63a4-45fa-b979-d673668bc4a5") public void
 * GoToUrlAssertUrlClickSalesTabClickNewButtonClickNewInvoicePositiveSelectCustomerNamePositiveE4
 * () throws InterruptedException, HeadlessException, IOException, AWTException
 * {
 * 
 * pages.SaleInvoice _SaleInvoice = new pages.SaleInvoice(driver);
 * TestModellerLogger.SetLastNodeGuid("2f331494-c0ec-443e-b258-bdf3d2f9d9fc");
 * _SaleInvoice.GoToUrl();
 * 
 * 
 * TestModellerLogger.SetLastNodeGuid("281121da-f0ce-4629-a4d1-0bc9b4260347");
 * _SaleInvoice.AssertUrl();
 * 
 * 
 * TestModellerLogger.SetLastNodeGuid("38510c8a-daac-4ff8-83f3-54b176440787");
 * _SaleInvoice.Click_SalesTab();
 * 
 * 
 * TestModellerLogger.SetLastNodeGuid("2ce6ef22-01ee-4e82-bcb0-f7ce06badd95");
 * _SaleInvoice.Click_NewButton();
 * 
 * 
 * TestModellerLogger.SetLastNodeGuid("b605bf48-53b8-4f7f-a009-9ea8d59b69ba");
 * _SaleInvoice.Click_NewInvoice();
 * 
 * 
 * TestModellerLogger.SetLastNodeGuid("4e83b316-7f8b-49b7-a97f-e85cefb020f0");
 * _SaleInvoice.Select_CustomerName("nid");
 * 
 * 
 * TestModellerLogger.SetLastNodeGuid("f3edcc35-8d70-4902-81f0-9c5d760fac46");
 * _SaleInvoice.Enter_InvoiceNo("");
 * 
 * 
 * TestModellerLogger.SetLastNodeGuid("6f885a16-e34c-4d0d-914a-a726c1fa9617");
 * _SaleInvoice.Enter_InvoiceDate("44204");
 * 
 * 
 * TestModellerLogger.SetLastNodeGuid("294097b8-ccc5-4eb7-baec-1a26ca1364f0");
 * _SaleInvoice.Select_IncomeType("");
 * 
 * 
 * TestModellerLogger.SetLastNodeGuid("5ccbf01b-65a3-47f5-b916-dab48aab691f");
 * _SaleInvoice.Enter_Description("ddd");
 * 
 * 
 * TestModellerLogger.SetLastNodeGuid("73677a32-1892-47f6-9783-a1072478778a");
 * _SaleInvoice.Enter_UnitPrice("");
 * 
 * 
 * TestModellerLogger.SetLastNodeGuid("d810d5bf-a960-434c-9172-1671dd383495");
 * _SaleInvoice.Enter_Quantity("");
 * 
 * 
 * TestModellerLogger.SetLastNodeGuid("516c7236-f043-4de9-b128-99997ccf1604");
 * _SaleInvoice.Select_VATRate("No VAT");
 * 
 * 
 * TestModellerLogger.SetLastNodeGuid("cb6d5101-0be0-4519-b1aa-5e71dcdfbef3");
 * _SaleInvoice.Click_Tickformorelineitems();
 * 
 * 
 * TestModellerLogger.SetLastNodeGuid("6aeae28b-fd85-4712-8710-18e4b190dd19");
 * _SaleInvoice.Enter_Note("");
 * 
 * 
 * TestModellerLogger.SetLastNodeGuid("2508d3fa-348f-48f2-914a-4d43591ded90");
 * _SaleInvoice.Click_SaveButton();
 * 
 * 
 * }
 * 
 * @Test (groups= {"SaleInvoice","SaleInvoice - Default Profile"})
 * 
 * @TestModellerPath(guid = "566b082e-1e4a-46ef-8e24-951589dba807") public void
 * GoToUrlAssertUrlClickSalesTabClickNewButtonClickNewInvoicePositiveSelectCustomerNamePositiveE5
 * () throws InterruptedException, HeadlessException, IOException, AWTException
 * {
 * 
 * pages.SaleInvoice _SaleInvoice = new pages.SaleInvoice(driver);
 * TestModellerLogger.SetLastNodeGuid("2f331494-c0ec-443e-b258-bdf3d2f9d9fc");
 * _SaleInvoice.GoToUrl();
 * 
 * 
 * TestModellerLogger.SetLastNodeGuid("281121da-f0ce-4629-a4d1-0bc9b4260347");
 * _SaleInvoice.AssertUrl();
 * 
 * 
 * TestModellerLogger.SetLastNodeGuid("38510c8a-daac-4ff8-83f3-54b176440787");
 * _SaleInvoice.Click_SalesTab();
 * 
 * 
 * TestModellerLogger.SetLastNodeGuid("2ce6ef22-01ee-4e82-bcb0-f7ce06badd95");
 * _SaleInvoice.Click_NewButton();
 * 
 * 
 * TestModellerLogger.SetLastNodeGuid("b605bf48-53b8-4f7f-a009-9ea8d59b69ba");
 * _SaleInvoice.Click_NewInvoice();
 * 
 * 
 * TestModellerLogger.SetLastNodeGuid("4e83b316-7f8b-49b7-a97f-e85cefb020f0");
 * _SaleInvoice.Select_CustomerName("nid");
 * 
 * 
 * TestModellerLogger.SetLastNodeGuid("f3edcc35-8d70-4902-81f0-9c5d760fac46");
 * _SaleInvoice.Enter_InvoiceNo("");
 * 
 * 
 * TestModellerLogger.SetLastNodeGuid("6f885a16-e34c-4d0d-914a-a726c1fa9617");
 * _SaleInvoice.Enter_InvoiceDate("44204");
 * 
 * 
 * TestModellerLogger.SetLastNodeGuid("294097b8-ccc5-4eb7-baec-1a26ca1364f0");
 * _SaleInvoice.Select_IncomeType("");
 * 
 * 
 * TestModellerLogger.SetLastNodeGuid("5ccbf01b-65a3-47f5-b916-dab48aab691f");
 * _SaleInvoice.Enter_Description("eee");
 * 
 * 
 * TestModellerLogger.SetLastNodeGuid("73677a32-1892-47f6-9783-a1072478778a");
 * _SaleInvoice.Enter_UnitPrice("");
 * 
 * 
 * TestModellerLogger.SetLastNodeGuid("d810d5bf-a960-434c-9172-1671dd383495");
 * _SaleInvoice.Enter_Quantity("");
 * 
 * 
 * TestModellerLogger.SetLastNodeGuid("516c7236-f043-4de9-b128-99997ccf1604");
 * _SaleInvoice.Select_VATRate("Exempt");
 * 
 * 
 * TestModellerLogger.SetLastNodeGuid("cb6d5101-0be0-4519-b1aa-5e71dcdfbef3");
 * _SaleInvoice.Click_Tickformorelineitems();
 * 
 * 
 * TestModellerLogger.SetLastNodeGuid("6aeae28b-fd85-4712-8710-18e4b190dd19");
 * _SaleInvoice.Enter_Note("");
 * 
 * 
 * TestModellerLogger.SetLastNodeGuid("2508d3fa-348f-48f2-914a-4d43591ded90");
 * _SaleInvoice.Click_SaveButton();
 * 
 * 
 * }
 * 
 * @Test (groups= {"SaleInvoice","SaleInvoice - Default Profile"})
 * 
 * @TestModellerPath(guid = "f9fbea29-8f7d-4bcb-b2c1-b97c93016f83") public void
 * GoToUrlAssertUrlClickSalesTabClickNewButtonClickNewInvoicePositiveSelectCustomerNamePositiveE7
 * () throws InterruptedException, HeadlessException, IOException, AWTException
 * {
 * 
 * pages.SaleInvoice _SaleInvoice = new pages.SaleInvoice(driver);
 * TestModellerLogger.SetLastNodeGuid("2f331494-c0ec-443e-b258-bdf3d2f9d9fc");
 * _SaleInvoice.GoToUrl();
 * 
 * 
 * TestModellerLogger.SetLastNodeGuid("281121da-f0ce-4629-a4d1-0bc9b4260347");
 * _SaleInvoice.AssertUrl();
 * 
 * 
 * TestModellerLogger.SetLastNodeGuid("38510c8a-daac-4ff8-83f3-54b176440787");
 * _SaleInvoice.Click_SalesTab();
 * 
 * 
 * TestModellerLogger.SetLastNodeGuid("2ce6ef22-01ee-4e82-bcb0-f7ce06badd95");
 * _SaleInvoice.Click_NewButton();
 * 
 * 
 * TestModellerLogger.SetLastNodeGuid("b605bf48-53b8-4f7f-a009-9ea8d59b69ba");
 * _SaleInvoice.Click_NewInvoice();
 * 
 * 
 * TestModellerLogger.SetLastNodeGuid("4e83b316-7f8b-49b7-a97f-e85cefb020f0");
 * _SaleInvoice.Select_CustomerName("nid");
 * 
 * 
 * TestModellerLogger.SetLastNodeGuid("f3edcc35-8d70-4902-81f0-9c5d760fac46");
 * _SaleInvoice.Enter_InvoiceNo("");
 * 
 * 
 * TestModellerLogger.SetLastNodeGuid("6f885a16-e34c-4d0d-914a-a726c1fa9617");
 * _SaleInvoice.Enter_InvoiceDate("44204");
 * 
 * 
 * TestModellerLogger.SetLastNodeGuid("294097b8-ccc5-4eb7-baec-1a26ca1364f0");
 * _SaleInvoice.Select_IncomeType("");
 * 
 * 
 * TestModellerLogger.SetLastNodeGuid("5ccbf01b-65a3-47f5-b916-dab48aab691f");
 * _SaleInvoice.Enter_Description("ffff");
 * 
 * 
 * TestModellerLogger.SetLastNodeGuid("73677a32-1892-47f6-9783-a1072478778a");
 * _SaleInvoice.Enter_UnitPrice("");
 * 
 * 
 * TestModellerLogger.SetLastNodeGuid("d810d5bf-a960-434c-9172-1671dd383495");
 * _SaleInvoice.Enter_Quantity("");
 * 
 * 
 * TestModellerLogger.SetLastNodeGuid("516c7236-f043-4de9-b128-99997ccf1604");
 * _SaleInvoice.Select_VATRate("Out of Scope");
 * 
 * 
 * TestModellerLogger.SetLastNodeGuid("cb6d5101-0be0-4519-b1aa-5e71dcdfbef3");
 * _SaleInvoice.Click_Tickformorelineitems();
 * 
 * 
 * TestModellerLogger.SetLastNodeGuid("6aeae28b-fd85-4712-8710-18e4b190dd19");
 * _SaleInvoice.Enter_Note("");
 * 
 * 
 * TestModellerLogger.SetLastNodeGuid("2508d3fa-348f-48f2-914a-4d43591ded90");
 * _SaleInvoice.Click_SaveButton();
 * 
 * 
 * }
 * 
 * }
 */