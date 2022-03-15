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

import Pages_Income.Customer_LIst;
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
public class TC02Email_DefaultProfile extends TestBase
{
    
	String sTestCaseID=null;
    String[] data=null;
    String Sheet =null;
    
    @Test  (groups= {"E_mail","E_mail - Default Profile"})
    @TestModellerPath(guid = "d30f948f-9e30-4024-9c2a-1abf2f80cd8e")
    public void GoToUrlAssertUrlPositiveSelectSelectInvoiceTempPositiveSelectEmailTemplateEnterEntermailidEnte1() throws HeadlessException, IOException, AWTException, InterruptedException, InvalidFormatException
    {
    	sTestCaseID="Ican_mail";
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
		
		
		
         _MailPlus.SelectTemplate(data[5]);
		
		_MailPlus.SendEmail("muhammad.ashiv@nomisma.co.uk", data[5]);
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
    @Test  (groups= {"E_mail","E_mail - Default Profile"})
    @TestModellerPath(guid = "d30f948f-9e30-4024-9c2a-1abf2f80cd8e")
    public void GoToUrlAssertUrlPositiveSelectSelectInvoiceTempPositiveSelectEmailTemplateEnterEntermailidEnte2() throws HeadlessException, IOException, AWTException, InterruptedException, InvalidFormatException
    {
    	sTestCaseID="Ican_mail";
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
		
		
		    _MailPlus.SelectTemplate(data[6]);
			
			_MailPlus.SendEmail("muhammad.ashiv@nomisma.co.uk", data[6]);
		    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Test  (groups= {"E_mail","E_mail - Default Profile"})
    @TestModellerPath(guid = "d30f948f-9e30-4024-9c2a-1abf2f80cd8e")
    public void GoToUrlAssertUrlPositiveSelectSelectInvoiceTempPositiveSelectEmailTemplateEnterEntermailidEnte3() throws HeadlessException, IOException, AWTException, InterruptedException, InvalidFormatException
    {
    	sTestCaseID="Ican_mail";
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


_MailPlus.SelectTemplate(data[7]);

_MailPlus.SendEmail("muhammad.ashiv@nomisma.co.uk", data[7]);
    }
		
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    @Test  (groups= {"E_mail","E_mail - Default Profile"})
    @TestModellerPath(guid = "d30f948f-9e30-4024-9c2a-1abf2f80cd8e")
    public void GoToUrlAssertUrlPositiveSelectSelectInvoiceTempPositiveSelectEmailTemplateEnterEntermailidEnte4() throws HeadlessException, IOException, AWTException, InterruptedException, InvalidFormatException
    {
    	sTestCaseID="Ican_mail";
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


_MailPlus.SelectTemplate(data[8]);

_MailPlus.SendEmail("muhammad.ashiv@nomisma.co.uk", data[8]);
    }
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Test  (groups= {"E_mail","E_mail - Default Profile"})
    @TestModellerPath(guid = "d30f948f-9e30-4024-9c2a-1abf2f80cd8e")
    public void GoToUrlAssertUrlPositiveSelectSelectInvoiceTempPositiveSelectEmailTemplateEnterEntermailidEnte5() throws HeadlessException, IOException, AWTException, InterruptedException, InvalidFormatException
    {
    	sTestCaseID="Ican_mail";
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


_MailPlus.SelectTemplate(data[9]);

_MailPlus.SendEmail("muhammad.ashiv@nomisma.co.uk", data[9]);
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Test  (groups= {"E_mail","E_mail - Default Profile"})
    @TestModellerPath(guid = "d30f948f-9e30-4024-9c2a-1abf2f80cd8e")
    public void GoToUrlAssertUrlPositiveSelectSelectInvoiceTempPositiveSelectEmailTemplateEnterEntermailidEnte6() throws HeadlessException, IOException, AWTException, InterruptedException, InvalidFormatException
    {
    	sTestCaseID="Ican_mail";
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


_MailPlus.SelectTemplate(data[10]);

_MailPlus.SendEmail("muhammad.ashiv@nomisma.co.uk", data[10]);
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Test  (groups= {"E_mail","E_mail - Default Profile"})
    @TestModellerPath(guid = "d30f948f-9e30-4024-9c2a-1abf2f80cd8e")
    public void GoToUrlAssertUrlPositiveSelectSelectInvoiceTempPositiveSelectEmailTemplateEnterEntermailidEnte7() throws HeadlessException, IOException, AWTException, InterruptedException, InvalidFormatException
    {
    	sTestCaseID="Ican_mail";
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


_MailPlus.SelectTemplate(data[11]);

_MailPlus.SendEmail("muhammad.ashiv@nomisma.co.uk", data[11]);
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Test  (groups= {"E_mail","E_mail - Default Profile"})
    @TestModellerPath(guid = "d30f948f-9e30-4024-9c2a-1abf2f80cd8e")
    public void GoToUrlAssertUrlPositiveSelectSelectInvoiceTempPositiveSelectEmailTemplateEnterEntermailidEnte8() throws HeadlessException, IOException, AWTException, InterruptedException, InvalidFormatException
    {
    	sTestCaseID="Ican_mail";
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


_MailPlus.SelectTemplate(data[12]);

_MailPlus.SendEmail("muhammad.ashiv@nomisma.co.uk", data[12]);
	
    }
		
		
		
		//_MailPlus.Click_Plus_Sign();
		
	//	_MailPlus.Select_InvoiceTemplate(data[5]);

		
		//_MailPlus.Click_SaveButton();
		
		//_MailPlus.Select_InvoiceTemplate(data[6]);
		
		
	//	_MailPlus.plusSignPopup();
		
		
		
		
		
		
//	    TestModellerLogger.SetLastNodeGuid("af1e3e3f-a66b-4397-afdb-2b2dc2734325");
//	    _MailPlus.GoToUrl();
//	    
//
//	    TestModellerLogger.SetLastNodeGuid("a249bd4d-efff-4dd8-b352-f74cc0b15a3b");
//	    _MailPlus.AssertUrl();
//	    

		/*
		 * TestModellerLogger.SetLastNodeGuid("df98e0de-b4de-42a8-bef8-4d76827c39e9");
		 * _MailPlus.Click_Plus_Sign();
		 * 
		 * 
		 * TestModellerLogger.SetLastNodeGuid("cde98790-4e81-4ee7-9612-3bd6c8188e38");
		 * _MailPlus.Select_InvoiceTemplate(data[5]);
		 * 
		 * TestModellerLogger.SetLastNodeGuid("5b958c13-72ff-4278-80e1-9b4b86f73b61");
		 * _MailPlus.Click_SaveButton();
		 */
	    
//        SaleDashboardPage.mails _mails = new SaleDashboardPage.mails(driver);
//    TestModellerLogger.SetLastNodeGuid("a51e0f3b-19dd-45ae-9370-d3609e2e0894");
//    _mails.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("3660f942-cc68-4cef-bb82-82cb35bc37d8");
//    _mails.AssertUrl();
    

//    TestModellerLogger.SetLastNodeGuid("42ab91d4-7379-4404-a11e-6a50d2ca8760");
//        _mails.Select_Select_InvoiceTemp(data[6]);
//   
//
//    TestModellerLogger.SetLastNodeGuid("3a1cbf88-20ac-48ea-be7c-61c45d03bf6e");
//    _mails.Select_Email_Template("Send Invoice");
//    
//
//    TestModellerLogger.SetLastNodeGuid("2192c6c5-80e8-48b1-8207-cd86f583f7c6");
//    _mails.Enter_Enter_mailid("poonam.sharma@nomisma.co.uk");
    

//    TestModellerLogger.SetLastNodeGuid("9942e2fa-2b79-4968-876b-4883effef066");
//    _mails.Enter_Enter_Subject("hi");
    

//    TestModellerLogger.SetLastNodeGuid("f8d8b4d0-e489-4043-8848-c64ac08e4975");
//    _mails.Click_Sendbtn_clicked();
//    
//
//    TestModellerLogger.SetLastNodeGuid("cff924d0-3f00-4dd0-abb5-64fbf61324ee");
//    _mails.Click_confirmation_msges();
    

    }

//    @Test  (groups= {"E_mail","E_mail - Default Profile"})
//    @TestModellerPath(guid = "1b269799-d5d3-422d-8165-520c9902105b")
//    public void GoToUrlAssertUrlPositiveSelectSelectInvoiceTempPositiveSelectEmailTemplateEnterEntermailidEnte2() throws HeadlessException, IOException, AWTException, InterruptedException
//    {
//        
//    	sm457.mails _mails = new sm457.mails(driver);
//    TestModellerLogger.SetLastNodeGuid("a51e0f3b-19dd-45ae-9370-d3609e2e0894");
//    _mails.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("3660f942-cc68-4cef-bb82-82cb35bc37d8");
//    _mails.AssertUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("42ab91d4-7379-4404-a11e-6a50d2ca8760");
//    _mails.Select_Select_InvoiceTemp("Standard Invoice Template");
//    
//
//    TestModellerLogger.SetLastNodeGuid("3a1cbf88-20ac-48ea-be7c-61c45d03bf6e");
//    _mails.Select_Email_Template("Send Credit Note");
//    
//
//    TestModellerLogger.SetLastNodeGuid("2192c6c5-80e8-48b1-8207-cd86f583f7c6");
//    _mails.Enter_Enter_mailid("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("9942e2fa-2b79-4968-876b-4883effef066");
//    _mails.Enter_Enter_Subject("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("f8d8b4d0-e489-4043-8848-c64ac08e4975");
//    _mails.Click_Sendbtn_clicked();
//    
//
//    TestModellerLogger.SetLastNodeGuid("cff924d0-3f00-4dd0-abb5-64fbf61324ee");
//    _mails.Click_confirmation_msges();
//    
//
//    }
//
//    @Test  (groups= {"E_mail","E_mail - Default Profile"})
//    @TestModellerPath(guid = "3be8b341-88bb-4bf5-8b1f-73736ac03cb7")
//    public void GoToUrlAssertUrlPositiveSelectSelectInvoiceTempPositiveSelectEmailTemplateEnterEntermailidEnte3() throws HeadlessException, IOException, AWTException, InterruptedException
//    {
//        
//      sm457.mails _mails = new sm457.mails(driver);
//    TestModellerLogger.SetLastNodeGuid("a51e0f3b-19dd-45ae-9370-d3609e2e0894");
//    _mails.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("3660f942-cc68-4cef-bb82-82cb35bc37d8");
//    _mails.AssertUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("42ab91d4-7379-4404-a11e-6a50d2ca8760");
//    _mails.Select_Select_InvoiceTemp("Header Footer Image Template");
//    
//
//    TestModellerLogger.SetLastNodeGuid("3a1cbf88-20ac-48ea-be7c-61c45d03bf6e");
//    _mails.Select_Email_Template("Send Invoice");
//    
//
//    TestModellerLogger.SetLastNodeGuid("2192c6c5-80e8-48b1-8207-cd86f583f7c6");
//    _mails.Enter_Enter_mailid("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("9942e2fa-2b79-4968-876b-4883effef066");
//    _mails.Enter_Enter_Subject("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("f8d8b4d0-e489-4043-8848-c64ac08e4975");
//    _mails.Click_Sendbtn_clicked();
//    
//
//    TestModellerLogger.SetLastNodeGuid("cff924d0-3f00-4dd0-abb5-64fbf61324ee");
//    _mails.Click_confirmation_msges();
//    
//
//    }
//
//    @Test  (groups= {"E_mail","E_mail - Default Profile"})
//    @TestModellerPath(guid = "aaf5463f-6950-4e0c-b092-910a781e93f8")
//    public void GoToUrlAssertUrlPositiveSelectSelectInvoiceTempPositiveSelectEmailTemplateEnterEntermailidEnte4() throws HeadlessException, IOException, AWTException, InterruptedException
//    {
//        
//    	sm457.mails _mails = new sm457.mails(driver);
//    TestModellerLogger.SetLastNodeGuid("a51e0f3b-19dd-45ae-9370-d3609e2e0894");
//    _mails.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("3660f942-cc68-4cef-bb82-82cb35bc37d8");
//    _mails.AssertUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("42ab91d4-7379-4404-a11e-6a50d2ca8760");
//    _mails.Select_Select_InvoiceTemp("Portal Invoice Template#1");
//    
//
//    TestModellerLogger.SetLastNodeGuid("3a1cbf88-20ac-48ea-be7c-61c45d03bf6e");
//    _mails.Select_Email_Template("Send Invoice");
//    
//
//    TestModellerLogger.SetLastNodeGuid("2192c6c5-80e8-48b1-8207-cd86f583f7c6");
//    _mails.Enter_Enter_mailid("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("9942e2fa-2b79-4968-876b-4883effef066");
//    _mails.Enter_Enter_Subject("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("f8d8b4d0-e489-4043-8848-c64ac08e4975");
//    _mails.Click_Sendbtn_clicked();
//    
//
//    TestModellerLogger.SetLastNodeGuid("cff924d0-3f00-4dd0-abb5-64fbf61324ee");
//    _mails.Click_confirmation_msges();
//    
//
//    }
//
//    @Test  (groups= {"E_mail","E_mail - Default Profile"})
//    @TestModellerPath(guid = "220f693c-e07b-45b8-867e-f7263fd25f73")
//    public void GoToUrlAssertUrlPositiveSelectSelectInvoiceTempPositiveSelectEmailTemplateEnterEntermailidEnte5() throws HeadlessException, IOException, AWTException, InterruptedException
//    {
//        
//    	sm457.mails _mails = new sm457.mails(driver);
//    TestModellerLogger.SetLastNodeGuid("a51e0f3b-19dd-45ae-9370-d3609e2e0894");
//    _mails.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("3660f942-cc68-4cef-bb82-82cb35bc37d8");
//    _mails.AssertUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("42ab91d4-7379-4404-a11e-6a50d2ca8760");
//    _mails.Select_Select_InvoiceTemp("Custom Template");
//    
//
//    TestModellerLogger.SetLastNodeGuid("3a1cbf88-20ac-48ea-be7c-61c45d03bf6e");
//    _mails.Select_Email_Template("Send Invoice");
//    
//
//    TestModellerLogger.SetLastNodeGuid("2192c6c5-80e8-48b1-8207-cd86f583f7c6");
//    _mails.Enter_Enter_mailid("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("9942e2fa-2b79-4968-876b-4883effef066");
//    _mails.Enter_Enter_Subject("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("f8d8b4d0-e489-4043-8848-c64ac08e4975");
//    _mails.Click_Sendbtn_clicked();
//    
//
//    TestModellerLogger.SetLastNodeGuid("cff924d0-3f00-4dd0-abb5-64fbf61324ee");
//    _mails.Click_confirmation_msges();
//    
//
//    }
//
//    @Test  (groups= {"E_mail","E_mail - Default Profile"})
//    @TestModellerPath(guid = "783d3af3-11ce-4aa5-a3a3-1105402094c2")
//    public void GoToUrlAssertUrlPositiveSelectSelectInvoiceTempPositiveSelectEmailTemplateEnterEntermailidEnte6() throws HeadlessException, IOException, AWTException, InterruptedException
//    {
//        
//    	sm457.mails _mails = new sm457.mails(driver);
//    TestModellerLogger.SetLastNodeGuid("a51e0f3b-19dd-45ae-9370-d3609e2e0894");
//    _mails.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("3660f942-cc68-4cef-bb82-82cb35bc37d8");
//    _mails.AssertUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("42ab91d4-7379-4404-a11e-6a50d2ca8760");
//    _mails.Select_Select_InvoiceTemp("Legacy Invoice Template");
//    
//
//    TestModellerLogger.SetLastNodeGuid("3a1cbf88-20ac-48ea-be7c-61c45d03bf6e");
//    _mails.Select_Email_Template("Send Invoice");
//    
//
//    TestModellerLogger.SetLastNodeGuid("2192c6c5-80e8-48b1-8207-cd86f583f7c6");
//    _mails.Enter_Enter_mailid("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("9942e2fa-2b79-4968-876b-4883effef066");
//    _mails.Enter_Enter_Subject("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("f8d8b4d0-e489-4043-8848-c64ac08e4975");
//    _mails.Click_Sendbtn_clicked();
//    
//
//    TestModellerLogger.SetLastNodeGuid("cff924d0-3f00-4dd0-abb5-64fbf61324ee");
//    _mails.Click_confirmation_msges();
//    
//
//    }
//
//    @Test  (groups= {"E_mail","E_mail - Default Profile"})
//    @TestModellerPath(guid = "2bff1dd7-ec5e-4cef-8fda-e48e469a861d")
//    public void GoToUrlAssertUrlPositiveSelectSelectInvoiceTempPositiveSelectEmailTemplateEnterEntermailidEnte7() throws HeadlessException, IOException, AWTException, InterruptedException
//    {
//        
//    	sm457.mails _mails = new sm457.mails(driver);
//    TestModellerLogger.SetLastNodeGuid("a51e0f3b-19dd-45ae-9370-d3609e2e0894");
//    _mails.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("3660f942-cc68-4cef-bb82-82cb35bc37d8");
//    _mails.AssertUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("42ab91d4-7379-4404-a11e-6a50d2ca8760");
//    _mails.Select_Select_InvoiceTemp("New Generic Invoice Template");
//    
//
//    TestModellerLogger.SetLastNodeGuid("3a1cbf88-20ac-48ea-be7c-61c45d03bf6e");
//    _mails.Select_Email_Template("Send Invoice");
//    
//
//    TestModellerLogger.SetLastNodeGuid("2192c6c5-80e8-48b1-8207-cd86f583f7c6");
//    _mails.Enter_Enter_mailid("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("9942e2fa-2b79-4968-876b-4883effef066");
//    _mails.Enter_Enter_Subject("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("f8d8b4d0-e489-4043-8848-c64ac08e4975");
//    _mails.Click_Sendbtn_clicked();
//    
//
//    TestModellerLogger.SetLastNodeGuid("cff924d0-3f00-4dd0-abb5-64fbf61324ee");
//    _mails.Click_confirmation_msges();
    

   // }


