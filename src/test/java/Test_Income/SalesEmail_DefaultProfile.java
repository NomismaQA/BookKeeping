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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/ead4c229-7af1-433a-bc83-04c9e7d9742d
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1798, profileId = 102270)
public class SalesEmail_DefaultProfile extends TestBase
{
	String sTestCaseID=null;
    String[] data=null;
    String Sheet =null;

    
    @Test  (groups= {"SalesEmail","SalesEmail - Default Profile"})
    @TestModellerPath(guid = "46c1f268-6c08-42ac-a798-e4f9ba991867")
    public void GoToUrlAssertUrlClickEmailIconClickpreviewButtonClickclicksignPositiveSelectInvoiceTemplateEn() throws InterruptedException, InvalidFormatException, HeadlessException, IOException, AWTException
    {
    	
    	sTestCaseID="Ican_mail";
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
    	    	    	
//    	    saledasboard _saledasboard = new saledasboard(driver);

    	    pages.PartialReconciledCases.SaleInvoice _SaleInvoice = new pages.PartialReconciledCases.SaleInvoice(driver);


    	    TestModellerLogger.SetLastNodeGuid("38510c8a-daac-4ff8-83f3-54b176440787");
    	    _SaleInvoice.Click_SalesTab();
        
    	Pages_Income.SalesEmail _SalesEmail = new Pages_Income.SalesEmail(driver);
//    TestModellerLogger.SetLastNodeGuid("6be7de1c-784b-4a70-9769-e551066fb215");
//    _SalesEmail.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("81c1fa6e-dc3e-4277-8d76-d780942106d6");
//    _SalesEmail.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("db99dace-dd68-424d-acb1-c8292524982e");
    _SalesEmail.Click_EmailIcon();
    

    TestModellerLogger.SetLastNodeGuid("724f7f28-74f4-42d5-b8e6-5f381078d6d3");
    _SalesEmail.emaillogoclicksc();
    

    TestModellerLogger.SetLastNodeGuid("e97eaf75-f75d-4ccc-9d93-031c104efa39");
    _SalesEmail.Click_clicksign();
    

//    TestModellerLogger.SetLastNodeGuid("735c9b44-bd72-455c-a088-40962d075435");
//    _SalesEmail.Select_InvoiceTemplate("Portal Invoice Template#2");
//    
//
//    TestModellerLogger.SetLastNodeGuid("58fc8420-d50e-4a9e-886e-acd21a5c5cb7");
//    _SalesEmail.Enter_HeaderLine1("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("5ddc4da3-f60e-4932-bc49-df53bbcf3879");
//    _SalesEmail.Enter_HeaderLine2("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("1fe8b96d-c691-4f1f-a639-5d07a056f899");
//    _SalesEmail.Enter_FooterLine1("");
//    
//
    TestModellerLogger.SetLastNodeGuid("2c921512-7cea-4b31-86b5-0ff8fb3292cd");
    _SalesEmail.plusclicksc();
    

    TestModellerLogger.SetLastNodeGuid("688f8cff-4716-43c5-8f7e-39641d961c9c");
    _SalesEmail.Click_clickSave();
    

//    TestModellerLogger.SetLastNodeGuid("32269e43-2bba-4609-bb8d-470bb18e3627");
//    _SalesEmail.Select_Template("Custom Template #1");
//    
//
//    TestModellerLogger.SetLastNodeGuid("e9b8ee09-9bac-481d-9297-e7f358d13ea8");
//    _SalesEmail.Select_EmailTemplate("Send Credit Note");
    

    TestModellerLogger.SetLastNodeGuid("8874c8ed-6ade-4b62-ac0d-a15ef2a6ec16");
    _SalesEmail.Click_checkMyself();
    

//    TestModellerLogger.SetLastNodeGuid("b82c2e88-6f7a-49e5-8999-60d4e265d377");
//    _SalesEmail.Click_EmailIcon();
//    
//
//    TestModellerLogger.SetLastNodeGuid("e994cbff-fcae-4cc2-85bb-c9f7a6d33608");
//    _SalesEmail.Click_EmailBody();
    

    TestModellerLogger.SetLastNodeGuid("b6b7efa4-c877-4b25-9072-3267561443f3");
    _SalesEmail.Click_clickSend2();
    

    }

}