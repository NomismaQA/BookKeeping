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
public class TC01NewPreviewPage_DefaultProfile extends TestBase
{
	String sTestCaseID=null;
    String[] data=null;
    String Sheet =null;


    
    @Test  (groups= {"NewPreviewPage","NewPreviewPage - Default Profile"})
    @TestModellerPath(guid = "5de2b20b-b8d1-41d8-9713-d3be134556c9")
    public void GoToUrlAssertUrlClickClickOnPreviewClickSaveButtonClickPDFDumpClickCancelButtonClickClickOnMa() throws InterruptedException, HeadlessException, IOException, AWTException, InvalidFormatException
    {
        
    	sTestCaseID="Ican_Preview";
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
    	    	    	
    	    saledasboard _saledasboard = new saledasboard(driver);
//    TestModellerLogger.SetLastNodeGuid("7e28a082-b5cd-463d-86de-ebca3d9067b6");
//    _saledasboard.GoToUrl();
    
    

  //  TestModellerLogger.SetLastNodeGuid("6d02b2ac-e775-4904-954a-ef38f8931998");
  //  _saledasboard.Select_Select_customer(data[5]);
    

 //   TestModellerLogger.SetLastNodeGuid("914c514b-eec0-46fe-a8f5-9d8d7e056b79");
 //   _saledasboard.Select_search_cate(data[6]);
    

//    TestModellerLogger.SetLastNodeGuid("70b1bde3-d0ad-4960-af62-c02b0aa80340");
//    _saledasboard.Enter_Enter_transcode("");
    

//    TestModellerLogger.SetLastNodeGuid("3372815d-16cb-4b05-936e-133db74399c4");
//    _saledasboard.Click_payment_status();
//    
//
//    TestModellerLogger.SetLastNodeGuid("bb1c8e93-d2ab-401e-9e95-d57dc8563a5c");
//    _saledasboard.Select_select_Duestatus("All");
//    
//
//    TestModellerLogger.SetLastNodeGuid("7ab2ad70-28d0-4306-98bb-6028be366a7d");
//    _saledasboard.Enter_daterange_from("44303");
    
//
//    TestModellerLogger.SetLastNodeGuid("1fe060ef-e8c0-4452-8e82-aaaa50a2eb78");
//    _saledasboard.Enter_daterange_to("2020-12-05 23:38:45");
    

  //  TestModellerLogger.SetLastNodeGuid("563fb128-954e-4474-bad9-254789e60b81");
  //  _saledasboard.Click_Click_Update_btn();
    	
    	    pages.PartialReconciledCases.SaleInvoice _SaleInvoice = new pages.PartialReconciledCases.SaleInvoice(driver);
//    	    TestModellerLogger.SetLastNodeGuid("2f331494-c0ec-443e-b258-bdf3d2f9d9fc");
//    	    _SaleInvoice.GoToUrl();
    	//    
    	//
//    	    TestModellerLogger.SetLastNodeGuid("281121da-f0ce-4629-a4d1-0bc9b4260347");
//    	    _SaleInvoice.AssertUrl();
    	    

    	    TestModellerLogger.SetLastNodeGuid("38510c8a-daac-4ff8-83f3-54b176440787");
    	    _SaleInvoice.Click_SalesTab();
    	
    	Pages_Income.NewPreviewPage _NewPreviewPage = new Pages_Income.NewPreviewPage(driver);
  //  TestModellerLogger.SetLastNodeGuid("dbbb77d9-da5b-418b-8bf9-81bcb95327cf");
  //  _NewPreviewPage.GoToUrl();
    

  //  TestModellerLogger.SetLastNodeGuid("d7e4fdde-c2c7-46a8-83a5-5be45ffa1225");
 //   _NewPreviewPage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("715cfaaf-aba7-40a9-82e6-410e09784e97");
    _NewPreviewPage.Click_ClickOnPreview();
    

    TestModellerLogger.SetLastNodeGuid("23d6006a-2648-4df5-a3f3-c2e17c157827");
    _NewPreviewPage.Click_SaveButton();
    

//    TestModellerLogger.SetLastNodeGuid("54b70d53-1986-4341-b00c-5f332860cd9d");
//    _NewPreviewPage.Click_PDFDump();
//    

    TestModellerLogger.SetLastNodeGuid("c672a06c-43df-4da3-b0e6-c89aec1ad026");
    _NewPreviewPage.Click_CancelButton();
    

//    TestModellerLogger.SetLastNodeGuid("ad68166f-4045-401c-85cf-3a60a429becd");
//    _NewPreviewPage.Click_ClickOnMail();
    

    }

}
