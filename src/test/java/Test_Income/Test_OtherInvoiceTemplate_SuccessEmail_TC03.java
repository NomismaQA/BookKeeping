package Test_Income;

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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/a4939bc3-94e7-4a72-89a4-6857d021667e
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1454, profileId = 101299)
public class Test_OtherInvoiceTemplate_SuccessEmail_TC03 extends TestBase
{
    
	String sTestCaseID=null;
    String[] data=null;
    String Sheet =null;
    
    @Test  (groups= {"E_mail","E_mail - Default Profile"})
    @TestModellerPath(guid = "d30f948f-9e30-4024-9c2a-1abf2f80cd8e")
    public void GoToUrlAssertUrlPositiveSelectSelectInvoicePositiveSelectEmailTemplateEnterEntermailidSendEmailSuccessEmailMsgOtherInvoiceTemp_TC03() throws HeadlessException, IOException, AWTException, InterruptedException, InvalidFormatException
    {
    	sTestCaseID="TC03_OtherInvoiceTemplate";
    	Sheet="Fin-3821";
    	data =ExcelUtility.toReadExcelData(sTestCaseID, Sheet);
        
    	 pages.banking.ashiv.nlogin _nlogin = new  pages.banking.ashiv.nlogin(driver);
 	    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
 	    _nlogin.GoToUrl();
 	    

// 	    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
// 	    _nlogin.AssertUrl();
 	    

 	    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
 	    _nlogin.Enter_nLOGIN(data[1]);
 	    

 	    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
 	    _nlogin.Enter_nPASS(data[2]);
 	    

 	    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
 	    _nlogin.Click_Login();
 	    

 	   pages.banking.ashiv.AgentSearch _AgentSearch = new  pages.banking.ashiv.AgentSearch(driver);
// 	    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
// 	    _AgentSearch.GoToUrl();
// 	    

// 	    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
// 	    _AgentSearch.AssertUrl();
 	    

 	    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
 	    _AgentSearch.Click_Agents();
 	    

 	    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
 	    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
 	    

 	    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
 	    _AgentSearch.Click_Search();
 	    

 	    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
 	    _AgentSearch.Click__Nidhi1_();
 	    

 	   pages.banking.ashiv.Searchclient _Searchclient = new  pages.banking.ashiv.Searchclient(driver);
// 	    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
// 	    _Searchclient.GoToUrl();
// 	    

// 	    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
 	   // _Searchclient.AssertUrl();
 	    

 	    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
 	    _Searchclient.Click__Clients_();
 	    

 	    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
 	    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
 	    

 	    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
 	    _Searchclient.Click_Searchbtn();
 	    

 	    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
 	    _Searchclient.Click__NidhiEnt();
 	    
 	   pages.banking.ashiv.SaleInvoice _SaleInvoice = new pages.banking.ashiv.SaleInvoice(driver);
//	    TestModellerLogger.SetLastNodeGuid("2f331494-c0ec-443e-b258-bdf3d2f9d9fc");
//	    _SaleInvoice.GoToUrl();
	//    
	//
//	    TestModellerLogger.SetLastNodeGuid("281121da-f0ce-4629-a4d1-0bc9b4260347");
//	    _SaleInvoice.AssertUrl();
//	    Thread.sleep(15000);

	    TestModellerLogger.SetLastNodeGuid("38510c8a-daac-4ff8-83f3-54b176440787");
	    _SaleInvoice.Click_SalesTab();
	    
	    Pages_Income.NewPreviewPage _NewPreviewPage = new Pages_Income.NewPreviewPage(driver);
	    
	    TestModellerLogger.SetLastNodeGuid("ad68166f-4045-401c-85cf-3a60a429becd");
	    _NewPreviewPage.Click_ClickOnMail();
	    
	    _NewPreviewPage.popupOfEmail();
	    
		Pages_Income.MailPlus _MailPlus = new Pages_Income.MailPlus(driver);
		
		
		
       //  _MailPlus.SelectTemplate();
		
		_MailPlus.SendEmail2("muhammad.ashiv@nomisma.co.uk");
		
		//_MailPlus.Click_Plus_Sign();
		
		//_MailPlus.Select_InvoiceTemplate(data[5]);

		
		//_MailPlus.Click_SaveButton();
		
		//_MailPlus.Select_InvoiceTemplate(data[6]);
		
		
	//	_MailPlus.plusSignPopup();
    }
}