package Test_Income;

import reports.TestNGListener;
import sm457.saledasboard;
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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/a56d7f52-12d3-469f-ad9d-f752870e8379
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1469, profileId = 101341)
public class TC07UpdateButton extends TestBase
{
	String sTestCaseID=null;
    String[] data=null;
    String Sheet =null;


    
    @Test  (groups= {"NewPreviewPage","NewPreviewPage - Default Profile"})
    @TestModellerPath(guid = "5de2b20b-b8d1-41d8-9713-d3be134556c9")
    public void GoToUrlAssertUrlClickClickOnPreviewClickSaveButtonClickPDFDumpClickCancelButtonClickClickOnMa() throws InterruptedException, HeadlessException, IOException, AWTException, InvalidFormatException
    {
        
    	sTestCaseID="TC07DateRange";
    	Sheet="Fin-3821";
    	data =ExcelUtility.toReadExcelData(sTestCaseID, Sheet);
    	
    	  pages.PartialReconciledCases.nlogin _nlogin = new pages.PartialReconciledCases.nlogin(driver);
    	    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    	    _nlogin.GoToUrl();
    	    

//    	    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//    	    _nlogin.AssertUrl();
    	    

    	    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    	    _nlogin.Enter_nLOGIN(data[1]);
    	    

    	    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    	    _nlogin.Enter_nPASS(data[2]);
    	    

    	    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    	    _nlogin.Click_Login();
    	    

    	pages.PartialReconciledCases.AgentSearch _AgentSearch = new pages.PartialReconciledCases.AgentSearch(driver);
//    	    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
//    	    _AgentSearch.GoToUrl();
//    	    

//    	    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
//    	    _AgentSearch.AssertUrl();
    	    

    	    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    	    _AgentSearch.Click_Agents();
    	    

    	    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    	    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
    	    

    	    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    	    _AgentSearch.Click_Search();
    	    

    	    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    	    _AgentSearch.Click__Nidhi1_();
    	    

    	pages.PartialReconciledCases.Searchclient _Searchclient = new pages.PartialReconciledCases.Searchclient(driver);
//    	    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
//    	    _Searchclient.GoToUrl();
//    	    

//    	    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
    	   // _Searchclient.AssertUrl();
    	    

    	    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    	    _Searchclient.Click__Clients_();
    	    

    	    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    	    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
    	    

    	    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    	    _Searchclient.Click_Searchbtn();
    	    

    	    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    	    _Searchclient.Click__NidhiEnt();
    	    	    	

    	    pages.PartialReconciledCases.SaleInvoice _SaleInvoice = new pages.PartialReconciledCases.SaleInvoice(driver);

    	    TestModellerLogger.SetLastNodeGuid("38510c8a-daac-4ff8-83f3-54b176440787");
    	    _SaleInvoice.Click_SalesTab();
    	    
    	    
    	    Pages_Income.selectionfordashboard _selectionfordashboard = new Pages_Income.selectionfordashboard(driver);
    	    
    	    TestModellerLogger.SetLastNodeGuid("bbc8b2fa-4807-4c9a-8aee-71a2ad73b247");
    	    _selectionfordashboard.Enter_DateFrom(data[7]);
    	    

    	    TestModellerLogger.SetLastNodeGuid("ad183bfe-0b4d-42b2-8a0e-5fe8fd263317");
    	    _selectionfordashboard.Enter_DateTo(data[8]);
    	    

    	    TestModellerLogger.SetLastNodeGuid("929122f7-0132-4c0e-9eae-d33a3fa657dc");
    	    _selectionfordashboard.Click_Update_();
    	    
    	    TestModellerLogger.SetLastNodeGuid("38510c8a-daac-4ff8-83f3-54b176440787");
    	    _SaleInvoice.VerifyDateRange();
    	    
    	    TestModellerLogger.SetLastNodeGuid("bbc8b2fa-4807-4c9a-8aee-71a2ad73b247");
    	    _selectionfordashboard.Enter_DateFrom(data[5]);
    	    

    	    TestModellerLogger.SetLastNodeGuid("ad183bfe-0b4d-42b2-8a0e-5fe8fd263317");
    	    _selectionfordashboard.Enter_DateTo(data[6]);
    	    

    	    TestModellerLogger.SetLastNodeGuid("929122f7-0132-4c0e-9eae-d33a3fa657dc");
    	    _selectionfordashboard.Click_Update_();
    	    
    	   
    	
  
    }

}
