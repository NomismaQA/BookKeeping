package tests.BalanceSheet_Bf;

import reports.TestNGListener;
import tests.TestBase;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Generic.ReadExcelData;
import ie.curiositysoftware.allocation.dto.ResultMergeMethod;
import ie.curiositysoftware.allocation.dto.DataAllocationRow;
import reports.ExtentTestListener;
import ie.curiositysoftware.allocation.dto.DataAllocationResult;
import ie.curiositysoftware.allocation.engine.DataAllocation;
import utilities.ExcelUtility;
import utilities.testmodeller.TestModellerLogger;

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/aa4ea734-f014-4ea9-b0f7-dea3028217fc
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 544, profileId = 100454)
public class TC_42_BSBFTaxation11011102_DefaultProfile_JBEI extends TestBase
{
    

	public String sTestCaseID=null;
	String[] data=null;
	String Sheet = null;
	 @Test  (groups= {"SaleInToReconcile","SaleInToReconcile - Default Profile"})
	    @TestModellerPath(guid = "8c7c840e-6086-4f3d-b9ff-7b3f3724775c")
	    public void GoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClickAgentsP1()throws Exception
	    {
	    	sTestCaseID="BSBF_Taxation110102_io";
	       	Sheet="BalanceSheetBf";
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
	    

	pages.UncloseAccountPeriod2 _pagesUncloseAccountPeriod2 = new pages.UncloseAccountPeriod2(driver);
	    /* TestModellerLogger.SetLastNodeGuid("3b262e73-48c7-4120-a392-cf7d291f9ead");
	     _pagesUncloseAccountPeriod2.GoToUrl();
	     

	     TestModellerLogger.SetLastNodeGuid("a07ef1d8-2af2-4bad-a375-14d736995baa");
	     _pagesUncloseAccountPeriod2.AssertUrl();*/
	     

	     TestModellerLogger.SetLastNodeGuid("4c963487-1d24-440a-9a40-16b18f3a3530");
	     _pagesUncloseAccountPeriod2.Click_SettingsTab();
	     

	     TestModellerLogger.SetLastNodeGuid("3360a87e-bba2-4067-aaaa-5361756fc079");
	     _pagesUncloseAccountPeriod2.Click_Accounting_PeriodLink();
	     

	     TestModellerLogger.SetLastNodeGuid("19608699-3695-4c7d-85d7-d03adc776a57");
	     _pagesUncloseAccountPeriod2.Click_EditLink();
	     

	     TestModellerLogger.SetLastNodeGuid("338f84df-6a3b-4ba0-9f79-8663a41facce");
	     _pagesUncloseAccountPeriod2.Click_EditImg();
	     

	     TestModellerLogger.SetLastNodeGuid("af2c0f87-b059-42d6-8c46-79ed82d9eed1");
	     _pagesUncloseAccountPeriod2.Click_UnClosePeriod();
	   
	    
	pages.DeletejournalEntry1 _pagesDeletejournalEntry1 = new pages.DeletejournalEntry1(driver);
	    
	    
	     //driver.navigate().refresh();
	    TestModellerLogger.SetLastNodeGuid("658a1a6a-4df2-4aa5-9d3d-a5ac35030b4c");
	    _pagesDeletejournalEntry1.Click_Accountant();
	    

	    TestModellerLogger.SetLastNodeGuid("c22ad20b-472b-436f-8a21-aaef00c48180");
	    _pagesDeletejournalEntry1.Click_Journals();
	    

	    TestModellerLogger.SetLastNodeGuid("5cf0a328-ae76-4d0a-ae9e-9cc8fba22bdc");
	    _pagesDeletejournalEntry1.Select_ctl00ddlFinancialYear(data[5]);
	    

	    TestModellerLogger.SetLastNodeGuid("f8f4724e-9e6f-4bbb-baf2-1ae01e6a4b64");
	    _pagesDeletejournalEntry1.Click_xPath_idchAllRTI();
	    

	    TestModellerLogger.SetLastNodeGuid("d4e4d3ec-a2d4-4667-9023-6eb47e216d04");
	    _pagesDeletejournalEntry1.Click_xPath_htmlbodyformmaindiv10div3headerdiva1i();
	    
	    pages.PartialReconciledCases.bankmenu _bankmenu = new pages.PartialReconciledCases.bankmenu(driver);
	    
	    _bankmenu.Click_Bankingmenu();
	  //  
	      Trial_Balance.Delete_Bank_entry Bk=new Trial_Balance.Delete_Bank_entry(driver);
	      Bk.delete_BankEntry();
	      
	      Bk.Supplier();
	      Bk.Invoice();
	      
	    
	pages.UncloseAccountPeriod2 _pagesUncloseAccountPeriod = new pages.UncloseAccountPeriod2(driver);


//	    TestModellerLogger.SetLastNodeGuid("4c963487-1d24-440a-9a40-16b18f3a3530");
  //  _pagesUncloseAccountPeriod.Click_SettingsTab();    
//
	pages.EnabledCashVat enabledCashVat = new pages.EnabledCashVat(driver);
	    /*TestModellerLogger.SetLastNodeGuid("6d0a3545-53fe-46b8-bbbf-b5fa29d4922c");
	    _pagesRaggaz_ltd.GoToUrl();
	    

	    TestModellerLogger.SetLastNodeGuid("55da693f-7305-46d9-a03e-6a118ee18b4c");
	    _pagesRaggaz_ltd.AssertUrl();*/
	    
//	    TestModellerLogger.SetLastNodeGuid("06b01013-179a-47f4-a4b9-c84ac741a792");
//	    enabledCashVat.Click_VAT_tab();
//	    
////
//	    TestModellerLogger.SetLastNodeGuid("1ad889fa-54da-4c6f-aba9-60ad4ef75188");
//	    enabledCashVat.Click__Edit();
//	    
//
//	    TestModellerLogger.SetLastNodeGuid("f0dd2f09-671b-45a4-9f11-6e6cd4700830");
//	    enabledCashVat.Click_chkEnableVATCashScheme();
//	    
//
//	    TestModellerLogger.SetLastNodeGuid("fb68cb23-73e9-4d99-8247-f656c42ebdac");
//	    enabledCashVat.Enter_EffectiveStartDate(data[6]);
//	    
//
//	    TestModellerLogger.SetLastNodeGuid("e199d96d-1e7e-40ba-b6ab-bdb0085f816f");
//	    enabledCashVat.Enter_EffectiveEndDate(data[7]);
//	    
//
//	    TestModellerLogger.SetLastNodeGuid("b566a050-0e80-4217-bfcf-1412106d43a2");
//	    enabledCashVat.Click_Save_btn();
//	    

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
	  _SaleInvoice.Enter_InvoiceDate(data[10]);
	  

	  TestModellerLogger.SetLastNodeGuid("294097b8-ccc5-4eb7-baec-1a26ca1364f0");
	  _SaleInvoice.Select_IncomeType(data[11]);
	  

	  TestModellerLogger.SetLastNodeGuid("5ccbf01b-65a3-47f5-b916-dab48aab691f");
	  _SaleInvoice.Enter_Description(data[12]);
	  

	  TestModellerLogger.SetLastNodeGuid("73677a32-1892-47f6-9783-a1072478778a");
	  _SaleInvoice.Enter_UnitPrice(data[13]);
	  

	  TestModellerLogger.SetLastNodeGuid("d810d5bf-a960-434c-9172-1671dd383495");
	  _SaleInvoice.Enter_Quantity(data[14]);
	  

	  TestModellerLogger.SetLastNodeGuid("516c7236-f043-4de9-b128-99997ccf1604");
	  _SaleInvoice.Select_VATRate(data[15]);
	  

	  //TestModellerLogger.SetLastNodeGuid("cb6d5101-0be0-4519-b1aa-5e71dcdfbef3");
	  //_SaleInvoice.Click_Tickformorelineitems();
	  

	//  TestModellerLogger.SetLastNodeGuid("6aeae28b-fd85-4712-8710-18e4b190dd19");
	//   _SaleInvoice.Enter_Note(data[13]);
	  

	  TestModellerLogger.SetLastNodeGuid("2508d3fa-348f-48f2-914a-4d43591ded90");
	  _SaleInvoice.Click_SaveButton();
	    //TestModellerLogger.SetLastNodeGuid("32b656e2-6d40-4cd5-ad44-6eb3d2c5ca47");
	    //_pagesNew_Invoice.Click_Information();
	    

	  Trial_Balance .SupplierBillSToFRS _SupplierBillSToFRS = new Trial_Balance.SupplierBillSToFRS(driver);
	//TestModellerLogger.SetLastNodeGuid("7b21b860-8f6c-4e5e-8f4d-0ef9aedf75e5");
	//_SupplierBillSToFRS.GoToUrl();
	//
	//
	//TestModellerLogger.SetLastNodeGuid("3d11c569-a0da-4838-a238-3d3cd071f91d");
	//_SupplierBillSToFRS.AssertUrl();


	TestModellerLogger.SetLastNodeGuid("5c30d940-2a3c-4ce2-9f6d-f491e71a1755");
	_SupplierBillSToFRS.Click_ExpenditureTAB();


	TestModellerLogger.SetLastNodeGuid("02bea7d1-9589-4278-8c66-58e376721799");
	_SupplierBillSToFRS.Click_NewTAB();


	TestModellerLogger.SetLastNodeGuid("fc395eef-59ac-4e0c-8092-d11ecdb61b84");
	_SupplierBillSToFRS.Click_NewSupplierBill();
	//

	TestModellerLogger.SetLastNodeGuid("9ed916b8-79f8-4b59-a274-ed9c520242c8");
	_SupplierBillSToFRS.Select_SupplierName(data[30]);


	//TestModellerLogger.SetLastNodeGuid("6cbb598e-673a-45cd-9f0a-ec53cb56f09d");
	//_SupplierBillSToFRS.Enter_DefaultCurrency(data[6]);
	//

	// TestModellerLogger.SetLastNodeGuid("6516ccf8-ae24-42b1-b271-2bb390a6f8c3");
	// _SupplierBillSToFRS.Enter_BillNo(data[29]);


	TestModellerLogger.SetLastNodeGuid("12466744-0bd3-4135-9300-e044e7148e58");
	_SupplierBillSToFRS.Enter_Date(data[19]);


	TestModellerLogger.SetLastNodeGuid("7ea52093-1dd7-4979-8034-aeaef336d945");
	_SupplierBillSToFRS.Select_ExpenseType(data[20]);


	TestModellerLogger.SetLastNodeGuid("de8f87b1-ff3a-421c-9290-6ddaef339bf2");
	_SupplierBillSToFRS.Enter_Description(data[21]);


	TestModellerLogger.SetLastNodeGuid("31e40f93-4cb6-45b2-bb91-cdd42e0f2f68");
	_SupplierBillSToFRS.Enter_UnitPrice(data[22]);

	_SupplierBillSToFRS.Select_VATRateType(data[23]);


	TestModellerLogger.SetLastNodeGuid("9720f223-ad75-48cf-9a78-a8a001ca0dfb");
	_SupplierBillSToFRS.Click_SaveButton();
	    
	    pages.CloseAccountingPeriod2 _pagesCloseAccountingPeriod = new pages.CloseAccountingPeriod2(driver);
	    /*TestModellerLogger.SetLastNodeGuid("3aaa0cf4-77e0-43b5-a991-ca045ff69419");
	    _pagesCloseAccountingPeriod.GoToUrl();
	    

	    TestModellerLogger.SetLastNodeGuid("4cc81e3d-d117-47e9-941c-af29cb976e8a");
	    _pagesCloseAccountingPeriod.AssertUrl();*/
	    

	    TestModellerLogger.SetLastNodeGuid("8aaebb63-3c29-46fa-8ffa-5314c9107226");
	    _pagesCloseAccountingPeriod.Click_SettingsTab();
	    

	    TestModellerLogger.SetLastNodeGuid("03194efa-68e0-40ed-8ff4-d90dac08aa94");
	    _pagesCloseAccountingPeriod.Click_Accounting_Period_Link();
	    

	    TestModellerLogger.SetLastNodeGuid("3fee9235-8c97-47c0-a6be-3717105c3557");
	    _pagesCloseAccountingPeriod.Click_Edit_Link();
	    

	    TestModellerLogger.SetLastNodeGuid("0d2c04da-0f72-4458-9251-82dac9cbd27f");
	    _pagesCloseAccountingPeriod.Click_Edit_img();
	    

	    TestModellerLogger.SetLastNodeGuid("82837be0-d3f9-4f2d-86e8-ec97dcc3906d");
	    _pagesCloseAccountingPeriod.Click__Close_Accounting_Period_();
	    
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
	    _pagesverifyBS.Select_selectFinancialYear(data[24]);
	    
	    utilities.Screenshotcapture.FullScreenshot1("TC_42_BSBF_Taxation11011102_With Invoice_Expense");
	    
	pages.AddjournalEntry10incBnkOld _pagesAddjournalEntry10incBnk = new pages.AddjournalEntry10incBnkOld(driver);

	    _pagesAddjournalEntry10incBnk.verify_BS_DefferedTaxation_1103_1104(data[25],data[26],data[27],data[28],data[13],data[14],data[22]);
	    
	    utilities.Screenshotcapture.FullScreenshot1("TC_42_BSBF_Taxation11011102_NextFollowingYear_With Invoice_Expense");
	    
	    TestModellerLogger.SetLastNodeGuid("4c963487-1d24-440a-9a40-16b18f3a3530");
	    _pagesUncloseAccountPeriod2.Click_SettingsTab();
	    

	    TestModellerLogger.SetLastNodeGuid("3360a87e-bba2-4067-aaaa-5361756fc079");
	    _pagesUncloseAccountPeriod2.Click_Accounting_PeriodLink();
	    
	    
	    TestModellerLogger.SetLastNodeGuid("19608699-3695-4c7d-85d7-d03adc776a57");
	    _pagesUncloseAccountPeriod2.Click_EditLink();
	    

	    TestModellerLogger.SetLastNodeGuid("338f84df-6a3b-4ba0-9f79-8663a41facce");
	    _pagesUncloseAccountPeriod2.Click_EditImg();
	    

	    TestModellerLogger.SetLastNodeGuid("af2c0f87-b059-42d6-8c46-79ed82d9eed1");
	    _pagesUncloseAccountPeriod2.Click_UnClosePeriod();

	    TestModellerLogger.SetLastNodeGuid("4c963487-1d24-440a-9a40-16b18f3a3530");
	    _pagesUncloseAccountPeriod.Click_SettingsTab();
	    
	    
	//    TestModellerLogger.SetLastNodeGuid("06b01013-179a-47f4-a4b9-c84ac741a792");
	//    enabledCashVat.Click_VAT_tab();
	    

	//    TestModellerLogger.SetLastNodeGuid("1ad889fa-54da-4c6f-aba9-60ad4ef75188");
	//    enabledCashVat.Click__Edit();
	    

	//    TestModellerLogger.SetLastNodeGuid("f0dd2f09-671b-45a4-9f11-6e6cd4700830");
	//    enabledCashVat.Click_chkEnableVATCashScheme();
	    

	    /*TestModellerLogger.SetLastNodeGuid("fb68cb23-73e9-4d99-8247-f656c42ebdac");
	    enabledCashVat.Enter_EffectiveStartDate(sData[6]);
	    

	    TestModellerLogger.SetLastNodeGuid("e199d96d-1e7e-40ba-b6ab-bdb0085f816f");
	    enabledCashVat.Enter_EffectiveEndDate(sData[7]);*/
	    

	//    TestModellerLogger.SetLastNodeGuid("b566a050-0e80-4217-bfcf-1412106d43a2");
//	    enabledCashVat.Click_Save_btn();
	    
	    //pages.UncloseAccountPeriod2 _pagesUncloseAccountPeriod2 = new pages.UncloseAccountPeriod2(driver);
	    /* TestModellerLogger.SetLastNodeGuid("3b262e73-48c7-4120-a392-cf7d291f9ead");
	     _pagesUncloseAccountPeriod2.GoToUrl();
	     

	     TestModellerLogger.SetLastNodeGuid("a07ef1d8-2af2-4bad-a375-14d736995baa");
	     _pagesUncloseAccountPeriod2.AssertUrl();*/
	     

	    

	pages.Invoice_Delete _pagesInvoice_Delete = new pages.Invoice_Delete(driver);

	TestModellerLogger.SetLastNodeGuid("9ba74e0e-0171-424f-bac4-7796f1552c86");
	_pagesInvoice_Delete.Click_Sales_tab();


	TestModellerLogger.SetLastNodeGuid("3fc8824e-4eb7-4757-aadc-52d44367e54b");
	_pagesInvoice_Delete.Select_SelectFinancialYear(data[5]);


	TestModellerLogger.SetLastNodeGuid("65374758-2a17-4c32-a6de-bcf68cc50769");
	_pagesInvoice_Delete.Click_checkNtodel();


	TestModellerLogger.SetLastNodeGuid("fa16ca29-a6e8-4013-94f5-df6848e532c6");
	_pagesInvoice_Delete.Click_DelImg();


	TestModellerLogger.SetLastNodeGuid("be4770a8-d74d-4a69-b97d-be3985eab0bb");
	_pagesInvoice_Delete.Click_Delete_tab();


	//TestModellerLogger.SetLastNodeGuid("f53c852e-68c7-4c28-b668-c2f19700f050");
	//_pagesInvoice_Delete.Click_Success_msg();


	pages.Del_Bill _pagesDel_Bill = new pages.Del_Bill(driver);
	/*TestModellerLogger.SetLastNodeGuid("15c4d21e-4942-46ea-9efb-869855af5a74");
	_pagesDel_Bill.GoToUrl();


	TestModellerLogger.SetLastNodeGuid("41710b94-f6c2-43ac-b3b9-9e0d327d1853");
	_pagesDel_Bill.AssertUrl();*/


	TestModellerLogger.SetLastNodeGuid("946b9645-19ad-4090-9604-6d9d24003a98");
	_pagesDel_Bill.Click_Expenditure_tab();


	TestModellerLogger.SetLastNodeGuid("35424716-2717-459b-902b-37e8dd4f1a2a");
	_pagesDel_Bill.Select_SelectFinancialYear(data[5]);


	TestModellerLogger.SetLastNodeGuid("db10441a-3533-44c4-8606-32a4d0972d6a");
	_pagesDel_Bill.Click_Chkboxbill();


	TestModellerLogger.SetLastNodeGuid("8445471e-7035-458c-9c06-a7f546715a92");
	_pagesDel_Bill.Click_DelimgBill();


	TestModellerLogger.SetLastNodeGuid("6b8d851a-148a-4f12-baa7-e03ab39306db");
	_pagesDel_Bill.Click_Delete_tab();


	//TestModellerLogger.SetLastNodeGuid("5a77265c-2375-438d-8ba5-b12794924176");
	//_pagesDel_Bill.Click_Success_msg();  
	    

	    }

	

	
    @Test  (groups= {"SaleInToReconcile","SaleInToReconcile - Default Profile"})
    @TestModellerPath(guid = "8c7c840e-6086-4f3d-b9ff-7b3f3724775c")
    public void GoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClickAgentsP2()throws Exception
    {
    	sTestCaseID="BSBF_Taxation110102";
       	Sheet="BalanceSheetBf";
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
   
/*pages.UncloseAccountingPeriod _pagesUncloseAccountingPeriod = new pages.UncloseAccountingPeriod(driver);
    

    TestModellerLogger.SetLastNodeGuid("92232ea2-3f6e-49c3-8057-c62ac27b6573");
    _pagesUncloseAccountingPeriod.Click_Setting_Img();
    

    TestModellerLogger.SetLastNodeGuid("eca7b81a-4d34-4e6b-b1fd-ee986b7c696d");
    _pagesUncloseAccountingPeriod.Click_Accounting_Period_Tab();
    

    TestModellerLogger.SetLastNodeGuid("be4a59b5-fa6a-4662-937c-128491feccbe");
    _pagesUncloseAccountingPeriod.Click_Accounting_Period_Edit();
    

    TestModellerLogger.SetLastNodeGuid("33f8affa-a5f2-447d-9b75-b66caac33ce9");
    _pagesUncloseAccountingPeriod.Click__Unclose_Accounting_Period_();*/
    

/*pages.unlockPeriod _pagesunlockPeriod = new pages.unlockPeriod(driver);
    TestModellerLogger.SetLastNodeGuid("7a7be6e9-1906-428b-bd84-f3f8a9fca409");
    _pagesunlockPeriod.Click_PeriodEdit();
    

    TestModellerLogger.SetLastNodeGuid("fee49715-d9d5-4682-9d47-3019b9d7a7fb");
    _pagesunlockPeriod.Click__Unlock_Accounting_Period_();*/
    
pages.UncloseAccountPeriod2 _pagesUncloseAccountPeriod2 = new pages.UncloseAccountPeriod2(driver);
    /* TestModellerLogger.SetLastNodeGuid("3b262e73-48c7-4120-a392-cf7d291f9ead");
     _pagesUncloseAccountPeriod2.GoToUrl();
     

     TestModellerLogger.SetLastNodeGuid("a07ef1d8-2af2-4bad-a375-14d736995baa");
     _pagesUncloseAccountPeriod2.AssertUrl();*/
     

     TestModellerLogger.SetLastNodeGuid("4c963487-1d24-440a-9a40-16b18f3a3530");
     _pagesUncloseAccountPeriod2.Click_SettingsTab();
     

     TestModellerLogger.SetLastNodeGuid("3360a87e-bba2-4067-aaaa-5361756fc079");
     _pagesUncloseAccountPeriod2.Click_Accounting_PeriodLink();
     

     TestModellerLogger.SetLastNodeGuid("19608699-3695-4c7d-85d7-d03adc776a57");
     _pagesUncloseAccountPeriod2.Click_EditLink();
     

     TestModellerLogger.SetLastNodeGuid("338f84df-6a3b-4ba0-9f79-8663a41facce");
     _pagesUncloseAccountPeriod2.Click_EditImg();
     

     TestModellerLogger.SetLastNodeGuid("af2c0f87-b059-42d6-8c46-79ed82d9eed1");
     _pagesUncloseAccountPeriod2.Click_UnClosePeriod();
         
    
pages.DeletejournalEntry1 _pagesDeletejournalEntry1 = new pages.DeletejournalEntry1(driver);
    
    
     //driver.navigate().refresh();
    TestModellerLogger.SetLastNodeGuid("658a1a6a-4df2-4aa5-9d3d-a5ac35030b4c");
    _pagesDeletejournalEntry1.Click_Accountant();
    

    TestModellerLogger.SetLastNodeGuid("c22ad20b-472b-436f-8a21-aaef00c48180");
    _pagesDeletejournalEntry1.Click_Journals();
    

    TestModellerLogger.SetLastNodeGuid("5cf0a328-ae76-4d0a-ae9e-9cc8fba22bdc");
    _pagesDeletejournalEntry1.Select_ctl00ddlFinancialYear(data[5]);
    
 

    

 
    TestModellerLogger.SetLastNodeGuid("f8f4724e-9e6f-4bbb-baf2-1ae01e6a4b64");
    _pagesDeletejournalEntry1.Click_xPath_idchAllRTI();
    

    TestModellerLogger.SetLastNodeGuid("d4e4d3ec-a2d4-4667-9023-6eb47e216d04");
    _pagesDeletejournalEntry1.Click_xPath_htmlbodyformmaindiv10div3headerdiva1i();
    
    pages.PartialReconciledCases.bankmenu _bankmenu = new pages.PartialReconciledCases.bankmenu(driver);
 
    _bankmenu.Click_Bankingmenu();
  //  
      Trial_Balance.Delete_Bank_entry Bk=new Trial_Balance.Delete_Bank_entry(driver);
      Bk.delete_BankEntry();
      
      Bk.Supplier();
      Bk.Invoice();


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
    _pagesAddjournalEntry10incBnk.Enter_ctl00cPHtxtDate(data[6]);
    
    _pagesAddjournalEntry10incBnk.Select_Slect_Currency("GBP");
    
    TestModellerLogger.SetLastNodeGuid("441a2306-a64b-4432-8d04-bfd6ce2c3d11");
    _pagesAddjournalEntry10incBnk.Enter_ctl00cPHtxtDescription(data[7]);
    

    TestModellerLogger.SetLastNodeGuid("335212ec-d991-4d36-b04a-604fd17dccf5");
    _pagesAddjournalEntry10incBnk.Enter_Account1(data[8]);
    

    TestModellerLogger.SetLastNodeGuid("5bc7905c-42b2-48fd-bdc0-67b56ebee64f");
    _pagesAddjournalEntry10incBnk.Enter_Debit1(data[9]);
    

    //TestModellerLogger.SetLastNodeGuid("87cb26ed-6df5-40d9-819a-de80ed8573d2");
    //_pagesAddjournalEntry10incBnk.Enter_Credit1("");
    

    //TestModellerLogger.SetLastNodeGuid("242ed94c-7fbe-4bd4-b314-a9c171017499");
    //_pagesAddjournalEntry10incBnk.Enter_Note1("note1");
    

    TestModellerLogger.SetLastNodeGuid("5baf4171-eaae-42df-913a-fd780fd55012");
    _pagesAddjournalEntry10incBnk.Enter_Account2(data[10]);
    

    TestModellerLogger.SetLastNodeGuid("7d4b5d8c-b9a4-4fd9-99b2-f6024b3fadda");
    _pagesAddjournalEntry10incBnk.Enter_Debit2(data[11]);
    

    //TestModellerLogger.SetLastNodeGuid("bc79c15b-b79e-4f4a-a4eb-8ce3499686ca");
    //_pagesAddjournalEntry10incBnk.Enter_Credit2("");
    

    //TestModellerLogger.SetLastNodeGuid("1a3d2f92-f18f-41b3-a1ab-2ddb675eb0f5");
    //_pagesAddjournalEntry10incBnk.Enter_Note2("note2");
    

    TestModellerLogger.SetLastNodeGuid("7dd19a67-8d19-4799-8c04-9c45ce0b6f55");
    _pagesAddjournalEntry10incBnk.Enter_Account3(data[12]);
    

    TestModellerLogger.SetLastNodeGuid("eb440455-aafb-442d-a019-2005211a4440");
    _pagesAddjournalEntry10incBnk.Enter_Credit3(data[13]);
    

    //TestModellerLogger.SetLastNodeGuid("86a10612-459e-485c-96ef-7c5455bd695d");
    //_pagesAddjournalEntry10incBnk.Enter_Credit3("");
    

    //TestModellerLogger.SetLastNodeGuid("643a02c5-96cd-412f-9ee4-76aa9663e792");
    //_pagesAddjournalEntry10incBnk.Enter_Note3("note3");
    

//    TestModellerLogger.SetLastNodeGuid("3a449702-02bb-41c0-8896-be8229361f57");
//    _pagesAddjournalEntry10incBnk.Enter_Account4(data[14]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("08296264-ac9c-4615-bd37-f8bcb01d9874");
//    _pagesAddjournalEntry10incBnk.Enter_Debit4(data[15]);
    

    //TestModellerLogger.SetLastNodeGuid("eabfb995-70a2-4327-95df-5d110513112a");
    //_pagesAddjournalEntry10incBnk.Enter_Credit4("");
    

    //TestModellerLogger.SetLastNodeGuid("869cf6f4-895a-4290-b9e4-d2d8c1b45fc5");
    //_pagesAddjournalEntry10incBnk.Enter_Note4("note4");
    

//    TestModellerLogger.SetLastNodeGuid("d1edcd0a-eefd-44c5-b8c8-7cacf22f0c5f");
//    _pagesAddjournalEntry10incBnk.Enter_Account5(data[16]);
    

    //TestModellerLogger.SetLastNodeGuid("a061acf6-a397-472a-b247-bb6b4a391a5f");
    //_pagesAddjournalEntry10incBnk.Enter_Debit5(data[17]);
    

//    TestModellerLogger.SetLastNodeGuid("483f5e4b-e6be-459b-969a-762f2d2c9467");
//    _pagesAddjournalEntry10incBnk.Enter_Credit5(data[17]);
    

    //TestModellerLogger.SetLastNodeGuid("50083141-32bb-4d37-9c73-e5a538134279");
    //_pagesAddjournalEntry10incBnk.Enter_Note5("note5");
    
Thread.sleep(8000);
   
    TestModellerLogger.SetLastNodeGuid("9963b6a8-a3d3-45d6-a6da-c43a423333fc");
    _pagesAddjournalEntry10incBnk.Click__Save_();
    

pages.CloseAccountingPeriod2 _pagesCloseAccountingPeriod = new pages.CloseAccountingPeriod2(driver);
    /*TestModellerLogger.SetLastNodeGuid("3aaa0cf4-77e0-43b5-a991-ca045ff69419");
    _pagesCloseAccountingPeriod.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("4cc81e3d-d117-47e9-941c-af29cb976e8a");
    _pagesCloseAccountingPeriod.AssertUrl();*/
    

    TestModellerLogger.SetLastNodeGuid("8aaebb63-3c29-46fa-8ffa-5314c9107226");
    _pagesCloseAccountingPeriod.Click_SettingsTab();
    

    TestModellerLogger.SetLastNodeGuid("03194efa-68e0-40ed-8ff4-d90dac08aa94");
    _pagesCloseAccountingPeriod.Click_Accounting_Period_Link();
    

    TestModellerLogger.SetLastNodeGuid("3fee9235-8c97-47c0-a6be-3717105c3557");
    _pagesCloseAccountingPeriod.Click_Edit_Link();
    

    TestModellerLogger.SetLastNodeGuid("0d2c04da-0f72-4458-9251-82dac9cbd27f");
    _pagesCloseAccountingPeriod.Click_Edit_img();
    

    TestModellerLogger.SetLastNodeGuid("82837be0-d3f9-4f2d-86e8-ec97dcc3906d");
    _pagesCloseAccountingPeriod.Click__Close_Accounting_Period_();
    
    

pages.verifyBS _pagesverifyBS = new pages.verifyBS(driver);
    /*TestModellerLogger.SetLastNodeGuid("66735795-46bb-49fc-ba78-5039790bd03c");
    _pagesverifyBS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("79019ec2-ec76-4854-8388-63145ba9d001");
    _pagesverifyBS.AssertUrl();*/
    

    TestModellerLogger.SetLastNodeGuid("fc2cdb54-4d1d-4c5e-905e-5ccde4200e69");
    _pagesverifyBS.Click_Reports_tab();
    

    TestModellerLogger.SetLastNodeGuid("195ad398-7e22-49e2-8770-a8548e1fa1a0");
    _pagesverifyBS.Click_Balance_Sheet_link();
    
    _pagesAddjournalEntry10incBnk.verify_BS_1330_1339();
    
    utilities.Screenshotcapture.FullScreenshot1("TC_42_BSBF_Taxation11011102_With JournalEntry");
    
    TestModellerLogger.SetLastNodeGuid("489eb3fd-e97e-49f7-aba2-610610f074e6");
    _pagesverifyBS.Select_selectFinancialYear(data[14]);
    
    _pagesAddjournalEntry10incBnk.verify_BS_Taxation_109091();
    
    utilities.Screenshotcapture.FullScreenshot2("TC_42_BSBF_Taxation11011102_NextFollowingYear_With JournalEntry");

    }
    
    
//   @Test  (groups= {"SaleInToReconcile","SaleInToReconcile - Default Profile"})
//    @TestModellerPath(guid = "8c7c840e-6086-4f3d-b9ff-7b3f3724775c")
//    public void GoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClickAgentsP2()throws Exception
//    {
//    	sTestCaseID="BSBF_FixedAsset630632_BE";
//       	Sheet="BalanceSheetBf";
//        data = ExcelUtility.toReadExcelData(sTestCaseID, Sheet);
//        
//        pages.nlogin _nlogin = new pages.nlogin(driver);
//       TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
//    _nlogin.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
//    _nlogin.Enter_nLOGIN(data[1]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
//    _nlogin.Enter_nPASS(data[2]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
//    _nlogin.Click_Login();
//    
//
//pages.PartialReconciledCases.AgentSearch _AgentSearch = new pages.PartialReconciledCases.AgentSearch(driver);
//
//    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
//    _AgentSearch.Click_Agents();
//    
//
//    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
//    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
//    _AgentSearch.Click_Search();
//    
//
//    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
//    _AgentSearch.Click__Nidhi1_();
//    
//
//pages.PartialReconciledCases.Searchclient _Searchclient = new pages.PartialReconciledCases.Searchclient(driver);
//
//    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
//    _Searchclient.Click__Clients_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
//    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
//    _Searchclient.Click_Searchbtn();
//    
//
//    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
//    _Searchclient.Click__NidhiEnt();
//    
//    pages.UncloseAccountPeriod2 _pagesUncloseAccountPeriod2 = new pages.UncloseAccountPeriod2(driver);
//    /* TestModellerLogger.SetLastNodeGuid("3b262e73-48c7-4120-a392-cf7d291f9ead");
//     _pagesUncloseAccountPeriod2.GoToUrl();
//     
//
//     TestModellerLogger.SetLastNodeGuid("a07ef1d8-2af2-4bad-a375-14d736995baa");
//     _pagesUncloseAccountPeriod2.AssertUrl();*/
//     
//
//     TestModellerLogger.SetLastNodeGuid("4c963487-1d24-440a-9a40-16b18f3a3530");
//     _pagesUncloseAccountPeriod2.Click_SettingsTab();
//     
//
//     TestModellerLogger.SetLastNodeGuid("3360a87e-bba2-4067-aaaa-5361756fc079");
//     _pagesUncloseAccountPeriod2.Click_Accounting_PeriodLink();
//     
//
//     TestModellerLogger.SetLastNodeGuid("19608699-3695-4c7d-85d7-d03adc776a57");
//     _pagesUncloseAccountPeriod2.Click_EditLink();
//     
//
//     TestModellerLogger.SetLastNodeGuid("338f84df-6a3b-4ba0-9f79-8663a41facce");
//     _pagesUncloseAccountPeriod2.Click_EditImg();
//     
//
//     TestModellerLogger.SetLastNodeGuid("af2c0f87-b059-42d6-8c46-79ed82d9eed1");
//     _pagesUncloseAccountPeriod2.Click_UnClosePeriod();
//     
//     pages.DeletejournalEntry1 _pagesDeletejournalEntry1 = new pages.DeletejournalEntry1(driver);
//     
//     
//     //driver.navigate().refresh();
////    TestModellerLogger.SetLastNodeGuid("658a1a6a-4df2-4aa5-9d3d-a5ac35030b4c");
////    _pagesDeletejournalEntry1.Click_Accountant();
////    
////
////    TestModellerLogger.SetLastNodeGuid("c22ad20b-472b-436f-8a21-aaef00c48180");
////    _pagesDeletejournalEntry1.Click_Journals();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5cf0a328-ae76-4d0a-ae9e-9cc8fba22bdc");
//    _pagesDeletejournalEntry1.Select_ctl00ddlFinancialYear(data[5]);
//    
//   
//    
//    Trial_Balance .SupplierBillSToFRS _SupplierBillSToFRS = new Trial_Balance.SupplierBillSToFRS(driver);
////  TestModellerLogger.SetLastNodeGuid("7b21b860-8f6c-4e5e-8f4d-0ef9aedf75e5");
////  _SupplierBillSToFRS.GoToUrl();
////  
////
////  TestModellerLogger.SetLastNodeGuid("3d11c569-a0da-4838-a238-3d3cd071f91d");
////  _SupplierBillSToFRS.AssertUrl();
//  
//
//  TestModellerLogger.SetLastNodeGuid("5c30d940-2a3c-4ce2-9f6d-f491e71a1755");
//  _SupplierBillSToFRS.Click_ExpenditureTAB();
//  
//
//  TestModellerLogger.SetLastNodeGuid("02bea7d1-9589-4278-8c66-58e376721799");
//  _SupplierBillSToFRS.Click_NewTAB();
//  
//
//  TestModellerLogger.SetLastNodeGuid("fc395eef-59ac-4e0c-8092-d11ecdb61b84");
//  _SupplierBillSToFRS.Click_NewSupplierBill();
////  
//
//  TestModellerLogger.SetLastNodeGuid("9ed916b8-79f8-4b59-a274-ed9c520242c8");
//  _SupplierBillSToFRS.Select_SupplierName(data[30]);
//  
//
////  TestModellerLogger.SetLastNodeGuid("6cbb598e-673a-45cd-9f0a-ec53cb56f09d");
////  _SupplierBillSToFRS.Enter_DefaultCurrency(data[6]);
////  
//
// // TestModellerLogger.SetLastNodeGuid("6516ccf8-ae24-42b1-b271-2bb390a6f8c3");
// // _SupplierBillSToFRS.Enter_BillNo(data[29]);
//  
//
//  TestModellerLogger.SetLastNodeGuid("12466744-0bd3-4135-9300-e044e7148e58");
//  _SupplierBillSToFRS.Enter_Date(data[6]);
//  
//
//  TestModellerLogger.SetLastNodeGuid("7ea52093-1dd7-4979-8034-aeaef336d945");
//  _SupplierBillSToFRS.Select_ExpenseType(data[8]);
//  
//
//  TestModellerLogger.SetLastNodeGuid("de8f87b1-ff3a-421c-9290-6ddaef339bf2");
//  _SupplierBillSToFRS.Enter_Description(data[7]);
//  
//
//  TestModellerLogger.SetLastNodeGuid("31e40f93-4cb6-45b2-bb91-cdd42e0f2f68");
//  _SupplierBillSToFRS.Enter_UnitPrice(data[9]);
//  
//
//
//
//  TestModellerLogger.SetLastNodeGuid("9720f223-ad75-48cf-9a78-a8a001ca0dfb");
//  _SupplierBillSToFRS.Click_SaveButton();
//  
//  /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//  
//  TestModellerLogger.SetLastNodeGuid("5c30d940-2a3c-4ce2-9f6d-f491e71a1755");
//  _SupplierBillSToFRS.Click_ExpenditureTAB();
//  
//
//  TestModellerLogger.SetLastNodeGuid("02bea7d1-9589-4278-8c66-58e376721799");
//  _SupplierBillSToFRS.Click_NewTAB();
//  
//
//  TestModellerLogger.SetLastNodeGuid("fc395eef-59ac-4e0c-8092-d11ecdb61b84");
//  _SupplierBillSToFRS.Click_NewSupplierBill();
////  
//
//  TestModellerLogger.SetLastNodeGuid("9ed916b8-79f8-4b59-a274-ed9c520242c8");
//  _SupplierBillSToFRS.Select_SupplierName(data[30]);
//  
//
////  TestModellerLogger.SetLastNodeGuid("6cbb598e-673a-45cd-9f0a-ec53cb56f09d");
////  _SupplierBillSToFRS.Enter_DefaultCurrency(data[6]);
////  
//
// // TestModellerLogger.SetLastNodeGuid("6516ccf8-ae24-42b1-b271-2bb390a6f8c3");
// // _SupplierBillSToFRS.Enter_BillNo(data[29]);
//  
//
//  TestModellerLogger.SetLastNodeGuid("12466744-0bd3-4135-9300-e044e7148e58");
//  _SupplierBillSToFRS.Enter_Date(data[6]);
//  
//
//  TestModellerLogger.SetLastNodeGuid("7ea52093-1dd7-4979-8034-aeaef336d945");
//  _SupplierBillSToFRS.Select_ExpenseType(data[10]);
//  
//
//  TestModellerLogger.SetLastNodeGuid("de8f87b1-ff3a-421c-9290-6ddaef339bf2");
//  _SupplierBillSToFRS.Enter_Description(data[7]);
//  
//
//  TestModellerLogger.SetLastNodeGuid("31e40f93-4cb6-45b2-bb91-cdd42e0f2f68");
//  _SupplierBillSToFRS.Enter_UnitPrice(data[11]);
//  
//
//
//
//  TestModellerLogger.SetLastNodeGuid("9720f223-ad75-48cf-9a78-a8a001ca0dfb");
//  _SupplierBillSToFRS.Click_SaveButton();
// 
//  //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//  
////  TestModellerLogger.SetLastNodeGuid("5c30d940-2a3c-4ce2-9f6d-f491e71a1755");
////  _SupplierBillSToFRS.Click_ExpenditureTAB();
////  
////
////  TestModellerLogger.SetLastNodeGuid("02bea7d1-9589-4278-8c66-58e376721799");
////  _SupplierBillSToFRS.Click_NewTAB();
////  
////
////  TestModellerLogger.SetLastNodeGuid("fc395eef-59ac-4e0c-8092-d11ecdb61b84");
////  _SupplierBillSToFRS.Click_NewSupplierBill();
//////  
////
////  TestModellerLogger.SetLastNodeGuid("9ed916b8-79f8-4b59-a274-ed9c520242c8");
////  _SupplierBillSToFRS.Select_SupplierName(data[30]);
////  
////
//////  TestModellerLogger.SetLastNodeGuid("6cbb598e-673a-45cd-9f0a-ec53cb56f09d");
//////  _SupplierBillSToFRS.Enter_DefaultCurrency(data[6]);
//////  
////
//// // TestModellerLogger.SetLastNodeGuid("6516ccf8-ae24-42b1-b271-2bb390a6f8c3");
//// // _SupplierBillSToFRS.Enter_BillNo(data[29]);
////  
////
////  TestModellerLogger.SetLastNodeGuid("12466744-0bd3-4135-9300-e044e7148e58");
////  _SupplierBillSToFRS.Enter_Date(data[6]);
////  
////
////  TestModellerLogger.SetLastNodeGuid("7ea52093-1dd7-4979-8034-aeaef336d945");
////  _SupplierBillSToFRS.Select_ExpenseType(data[12]);
////  
////
////  TestModellerLogger.SetLastNodeGuid("de8f87b1-ff3a-421c-9290-6ddaef339bf2");
////  _SupplierBillSToFRS.Enter_Description(data[7]);
////  
////
////  TestModellerLogger.SetLastNodeGuid("31e40f93-4cb6-45b2-bb91-cdd42e0f2f68");
////  _SupplierBillSToFRS.Enter_UnitPrice(data[13]);
////  
////
////
////
////  TestModellerLogger.SetLastNodeGuid("9720f223-ad75-48cf-9a78-a8a001ca0dfb");
////  _SupplierBillSToFRS.Click_SaveButton();
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////  
////  TestModellerLogger.SetLastNodeGuid("5c30d940-2a3c-4ce2-9f6d-f491e71a1755");
////  _SupplierBillSToFRS.Click_ExpenditureTAB();
////  
////
////  TestModellerLogger.SetLastNodeGuid("02bea7d1-9589-4278-8c66-58e376721799");
////  _SupplierBillSToFRS.Click_NewTAB();
////  
////
////  TestModellerLogger.SetLastNodeGuid("fc395eef-59ac-4e0c-8092-d11ecdb61b84");
////  _SupplierBillSToFRS.Click_NewSupplierBill();
//////  
////
////  TestModellerLogger.SetLastNodeGuid("9ed916b8-79f8-4b59-a274-ed9c520242c8");
////  _SupplierBillSToFRS.Select_SupplierName(data[30]);
////  
////
//////  TestModellerLogger.SetLastNodeGuid("6cbb598e-673a-45cd-9f0a-ec53cb56f09d");
//////  _SupplierBillSToFRS.Enter_DefaultCurrency(data[6]);
//////  
////
//// // TestModellerLogger.SetLastNodeGuid("6516ccf8-ae24-42b1-b271-2bb390a6f8c3");
//// // _SupplierBillSToFRS.Enter_BillNo(data[29]);
////  
////
////  TestModellerLogger.SetLastNodeGuid("12466744-0bd3-4135-9300-e044e7148e58");
////  _SupplierBillSToFRS.Enter_Date(data[6]);
////  
////
////  TestModellerLogger.SetLastNodeGuid("7ea52093-1dd7-4979-8034-aeaef336d945");
////  _SupplierBillSToFRS.Select_ExpenseType(data[14]);
////  
////
////  TestModellerLogger.SetLastNodeGuid("de8f87b1-ff3a-421c-9290-6ddaef339bf2");
////  _SupplierBillSToFRS.Enter_Description(data[7]);
////  
////
////  TestModellerLogger.SetLastNodeGuid("31e40f93-4cb6-45b2-bb91-cdd42e0f2f68");
////  _SupplierBillSToFRS.Enter_UnitPrice(data[15]);
////  
////
////
////
////  TestModellerLogger.SetLastNodeGuid("9720f223-ad75-48cf-9a78-a8a001ca0dfb");
////  _SupplierBillSToFRS.Click_SaveButton();
//  
// 
//  
//  pages.CloseAccountingPeriod2 _pagesCloseAccountingPeriod = new pages.CloseAccountingPeriod2(driver);
//  /*TestModellerLogger.SetLastNodeGuid("3aaa0cf4-77e0-43b5-a991-ca045ff69419");
//  _pagesCloseAccountingPeriod.GoToUrl();
//  
//
//  TestModellerLogger.SetLastNodeGuid("4cc81e3d-d117-47e9-941c-af29cb976e8a");
//  _pagesCloseAccountingPeriod.AssertUrl();*/
//  
//  TestModellerLogger.SetLastNodeGuid("8aaebb63-3c29-46fa-8ffa-5314c9107226");
//  _pagesCloseAccountingPeriod.Click_SettingsTab();
//  
//
//  TestModellerLogger.SetLastNodeGuid("03194efa-68e0-40ed-8ff4-d90dac08aa94");
//  _pagesCloseAccountingPeriod.Click_Accounting_Period_Link();
//  
//
//  TestModellerLogger.SetLastNodeGuid("3fee9235-8c97-47c0-a6be-3717105c3557");
//  _pagesCloseAccountingPeriod.Click_Edit_Link();
//  
//
//  TestModellerLogger.SetLastNodeGuid("0d2c04da-0f72-4458-9251-82dac9cbd27f");
//  _pagesCloseAccountingPeriod.Click_Edit_img();
//  
//
//  TestModellerLogger.SetLastNodeGuid("82837be0-d3f9-4f2d-86e8-ec97dcc3906d");
//  _pagesCloseAccountingPeriod.Click__Close_Accounting_Period_();
//  
//  
//
//pages.verifyBS _pagesverifyBS = new pages.verifyBS(driver);
//  /*TestModellerLogger.SetLastNodeGuid("66735795-46bb-49fc-ba78-5039790bd03c");
//  _pagesverifyBS.GoToUrl();
//  
//
//  TestModellerLogger.SetLastNodeGuid("79019ec2-ec76-4854-8388-63145ba9d001");
//  _pagesverifyBS.AssertUrl();*/
//  
//
//  TestModellerLogger.SetLastNodeGuid("fc2cdb54-4d1d-4c5e-905e-5ccde4200e69");
//  _pagesverifyBS.Click_Reports_tab();
//  
//
//  TestModellerLogger.SetLastNodeGuid("195ad398-7e22-49e2-8770-a8548e1fa1a0");
//  _pagesverifyBS.Click_Balance_Sheet_link();
//  
//  utilities.Screenshotcapture.FullScreenshot1("TC_29_BSBF_FixedAsset630632_With JournalEntry_Expense");
//  
//  TestModellerLogger.SetLastNodeGuid("489eb3fd-e97e-49f7-aba2-610610f074e6");
//  _pagesverifyBS.Select_selectFinancialYear(data[14]);
//  
//  //pages.AddjournalEntry10incBnk _pagesAddjournalEntry10incBnk = new pages.AddjournalEntry10incBnk(driver);
//  
//  //_pagesAddjournalEntry10incBnk.verify_BS_BF_FixedAsset_10_14(data[19], data[20]);
//  
//    
//  
//   
//   utilities.Screenshotcapture.FullScreenshot2("TC_29_BSBF_FixedAsset630632_NextFollowingYear_With JournalEntry_Expense");
//}
    
    
    @Test  (groups= {"SaleInToReconcile","SaleInToReconcile - Default Profile"})
    @TestModellerPath(guid = "8c7c840e-6086-4f3d-b9ff-7b3f3724775c")
    public void GoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClickAgentsP3()throws Exception
    {
    	sTestCaseID="BSBF_Taxation110102_BE";
       	Sheet="BalanceSheetBf";
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
    
    pages.UncloseAccountPeriod2 _pagesUncloseAccountPeriod2 = new pages.UncloseAccountPeriod2(driver);
   
     TestModellerLogger.SetLastNodeGuid("4c963487-1d24-440a-9a40-16b18f3a3530");
     _pagesUncloseAccountPeriod2.Click_SettingsTab();
     

     TestModellerLogger.SetLastNodeGuid("3360a87e-bba2-4067-aaaa-5361756fc079");
     _pagesUncloseAccountPeriod2.Click_Accounting_PeriodLink();
     

     TestModellerLogger.SetLastNodeGuid("19608699-3695-4c7d-85d7-d03adc776a57");
     _pagesUncloseAccountPeriod2.Click_EditLink();
     

     TestModellerLogger.SetLastNodeGuid("338f84df-6a3b-4ba0-9f79-8663a41facce");
     _pagesUncloseAccountPeriod2.Click_EditImg();
     

     TestModellerLogger.SetLastNodeGuid("af2c0f87-b059-42d6-8c46-79ed82d9eed1");
     _pagesUncloseAccountPeriod2.Click_UnClosePeriod();
     
  pages.DeletejournalEntry1 _pagesDeletejournalEntry1 = new pages.DeletejournalEntry1(driver);
     
     
     //driver.navigate().refresh();
//    TestModellerLogger.SetLastNodeGuid("658a1a6a-4df2-4aa5-9d3d-a5ac35030b4c");
//    _pagesDeletejournalEntry1.Click_Accountant();
//    
//
//    TestModellerLogger.SetLastNodeGuid("c22ad20b-472b-436f-8a21-aaef00c48180");
//    _pagesDeletejournalEntry1.Click_Journals();
    

    TestModellerLogger.SetLastNodeGuid("5cf0a328-ae76-4d0a-ae9e-9cc8fba22bdc");
    _pagesDeletejournalEntry1.Select_ctl00ddlFinancialYear(data[5]);
     
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

// TestModellerLogger.SetLastNodeGuid("32c9440758-2f86-4894-829c-0d5b167b4d77");
// _nBANKTRN.Select_BK_SELECT(data[5]);


TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
_nBANKTRN.Enter_NDate(data[6]);


TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
_nBANKTRN.Enter_n_desc(data[7]);


TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
_nBANKTRN.Enter_Recived_amt(data[31]);


TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
_nBANKTRN.Enter_spnt_amt(data[9]);


// TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
// _nBANKTRN.Select_Select_VATRate("Standard Rate");


TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
_nBANKTRN.Click_Select_Option1();


TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
_nBANKTRN.Enter_BOX2(data[8]);



TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
_nBANKTRN.Click__Save_();

TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
_bankmenu.Click_Bankingmenu();

TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
_bankmenu.Click_Newmenu();

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
_nBANKTRN.Enter_NDate(data[6]);


TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
_nBANKTRN.Enter_n_desc(data[7]);


TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
_nBANKTRN.Enter_Recived_amt(data[31]);


TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
_nBANKTRN.Enter_spnt_amt(data[11]);


// TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
// _nBANKTRN.Select_Select_VATRate("Standard Rate");


TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
_nBANKTRN.Click_Select_Option1();


TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
_nBANKTRN.Enter_BOX2(data[10]);



TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
_nBANKTRN.Click__Save_();

//TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
//_bankmenu.Click_Bankingmenu();
//
//TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
//_bankmenu.Click_Newmenu();
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
//_nBANKTRN.Enter_NDate(data[6]);
//
//
//TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
//_nBANKTRN.Enter_n_desc(data[7]);
//
//
//TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
//_nBANKTRN.Enter_Recived_amt(data[31]);
//
//
//TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
//_nBANKTRN.Enter_spnt_amt(data[13]);
//
//
//// TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
//// _nBANKTRN.Select_Select_VATRate("Standard Rate");
//
//
//TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
//_nBANKTRN.Click_Select_Option1();
//
//
//TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
//_nBANKTRN.Enter_BOX2(data[12]);
//
//
//
//TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
//_nBANKTRN.Click__Save_();
//
//TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
//_bankmenu.Click_Bankingmenu();
//
//TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
//_bankmenu.Click_Newmenu();
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
//_nBANKTRN.Enter_NDate(data[6]);
//
//
//TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
//_nBANKTRN.Enter_n_desc(data[7]);
//
//
//TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
//_nBANKTRN.Enter_Recived_amt(data[31]);
//
//
//TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
//_nBANKTRN.Enter_spnt_amt(data[15]);
//
//
//// TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
//// _nBANKTRN.Select_Select_VATRate("Standard Rate");
//
//
//TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
//_nBANKTRN.Click_Select_Option1();
//
//
//TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
//_nBANKTRN.Enter_BOX2(data[14]);
//
//TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
//_nBANKTRN.Click__Save_();
pages.CloseAccountingPeriod2 _pagesCloseAccountingPeriod = new pages.CloseAccountingPeriod2(driver);
/*TestModellerLogger.SetLastNodeGuid("3aaa0cf4-77e0-43b5-a991-ca045ff69419");
_pagesCloseAccountingPeriod.GoToUrl();


TestModellerLogger.SetLastNodeGuid("4cc81e3d-d117-47e9-941c-af29cb976e8a");
_pagesCloseAccountingPeriod.AssertUrl();*/


TestModellerLogger.SetLastNodeGuid("8aaebb63-3c29-46fa-8ffa-5314c9107226");
_pagesCloseAccountingPeriod.Click_SettingsTab();


TestModellerLogger.SetLastNodeGuid("03194efa-68e0-40ed-8ff4-d90dac08aa94");
_pagesCloseAccountingPeriod.Click_Accounting_Period_Link();


TestModellerLogger.SetLastNodeGuid("3fee9235-8c97-47c0-a6be-3717105c3557");
_pagesCloseAccountingPeriod.Click_Edit_Link();


TestModellerLogger.SetLastNodeGuid("0d2c04da-0f72-4458-9251-82dac9cbd27f");
_pagesCloseAccountingPeriod.Click_Edit_img();


TestModellerLogger.SetLastNodeGuid("82837be0-d3f9-4f2d-86e8-ec97dcc3906d");
_pagesCloseAccountingPeriod.Click__Close_Accounting_Period_();



pages.verifyBS _pagesverifyBS = new pages.verifyBS(driver);
/*TestModellerLogger.SetLastNodeGuid("66735795-46bb-49fc-ba78-5039790bd03c");
_pagesverifyBS.GoToUrl();


TestModellerLogger.SetLastNodeGuid("79019ec2-ec76-4854-8388-63145ba9d001");
_pagesverifyBS.AssertUrl();*/


TestModellerLogger.SetLastNodeGuid("fc2cdb54-4d1d-4c5e-905e-5ccde4200e69");
_pagesverifyBS.Click_Reports_tab();


TestModellerLogger.SetLastNodeGuid("195ad398-7e22-49e2-8770-a8548e1fa1a0");
_pagesverifyBS.Click_Balance_Sheet_link();

utilities.Screenshotcapture.FullScreenshot1("TC_42_BSBF_Taxation11011102_With JournalEntry_Expense_Bank");

TestModellerLogger.SetLastNodeGuid("489eb3fd-e97e-49f7-aba2-610610f074e6");
_pagesverifyBS.Select_selectFinancialYear(data[14]);

//pages.AddjournalEntry10incBnk _pagesAddjournalEntry10incBnk = new pages.AddjournalEntry10incBnk(driver);

//_pagesAddjournalEntry10incBnk.verify_BS_BF_FixedAsset_10_14(data[19], data[20]);

  

 
 utilities.Screenshotcapture.FullScreenshot2("TC_42_BSBF_Taxation11011102_NextFollowingYear_With JournalEntry_Expense_Bank");






















    }

}
