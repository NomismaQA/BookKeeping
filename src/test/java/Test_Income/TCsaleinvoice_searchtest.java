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
//import ie.curiositysoftware.allocation.dto.;
import ie.curiositysoftware.allocation.dto.DataAllocationRow;
import reports.ExtentTestListener;
import ie.curiositysoftware.allocation.dto.DataAllocationResult;
import ie.curiositysoftware.allocation.engine.DataAllocation;
import utilities.ExcelData;
import utilities.ExcelUtility;
import utilities.testmodeller.TestModellerLogger;

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/0274c5f4-766f-44e6-bd47-2e27a0b93042
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1145, profileId = 101035)
public class TCsaleinvoice_searchtest extends TestBase
{
    
	public String sTestCaseID=null;
    String[] data=null;
    String Sheet = null;

    
 @Test  (groups= {"saleinvoice","saleinvoice - saleinvoice1"})
    @TestModellerPath(guid = "0578891d-3b2e-442e-bea1-d368c6889eb6")
    public void saleinvoice1GoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrl1() throws InterruptedException, IOException, InvalidFormatException, HeadlessException, AWTException
    {
	 sTestCaseID="salesinvoice";
     Sheet="Fin-3821";
  data = ExcelData.toReadExcelData(sTestCaseID, Sheet);

 	pages.PartialReconciledCases.nlogin _nlogin = new pages.PartialReconciledCases.nlogin(driver);
        TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
        _nlogin.GoToUrl();
        

//        TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//        _nlogin.AssertUrl();
        

        TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
        _nlogin.Enter_nLOGIN(data[1]);
        

        TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
        _nlogin.Enter_nPASS(data[2]);
        

        TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
        _nlogin.Click_Login();
        

        pages.PartialReconciledCases.AgentSearch _AgentSearch = new pages.PartialReconciledCases.AgentSearch(driver);
//        TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
//        _AgentSearch.GoToUrl();
    //    

//        TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
//        _AgentSearch.AssertUrl();
        

        TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
        _AgentSearch.Click_Agents();
        

        TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
        _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
        

        TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
        _AgentSearch.Click_Search();
        

        TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
        _AgentSearch.Click__Nidhi1_();
        

        pages.PartialReconciledCases.Searchclient _Searchclient = new pages.PartialReconciledCases.Searchclient(driver);
//        TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
//        _Searchclient.GoToUrl();
     
    
//        TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
//        _Searchclient.AssertUrl();
        

        TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
        _Searchclient.Click__Clients_();
        

        TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
        _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
        


        TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
        _Searchclient.Click_Searchbtn();
        

        TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
        _Searchclient.Click__NidhiEnt();
        

        pages.PartialReconciledCases.SaleInvoice _SaleInvoice = new pages.PartialReconciledCases.SaleInvoice(driver);

//        TestModellerLogger.SetLastNodeGuid("2f331494-c0ec-443e-b258-bdf3d2f9d9fc");
//        _SaleInvoice.GoToUrl();

//        TestModellerLogger.SetLastNodeGuid("281121da-f0ce-4629-a4d1-0bc9b4260347");
//        _SaleInvoice.AssertUrl();
        

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
        _SaleInvoice.Enter_InvoiceDate(data[7]);
        

        TestModellerLogger.SetLastNodeGuid("294097b8-ccc5-4eb7-baec-1a26ca1364f0");
        _SaleInvoice.Select_IncomeType("Sale");
        

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
/*        
   //     _SaleInvoice.GetSuccessText();
        SaleDashboardPage.saledasboard _saledasboard= new  SaleDashboardPage.saledasboard(driver);

    
   TestModellerLogger.SetLastNodeGuid("6d02b2ac-e775-4904-954a-ef38f8931998");
    _saledasboard.Select_Select_customer(data[14]);

  TestModellerLogger.SetLastNodeGuid("914c514b-eec0-46fe-a8f5-9d8d7e056b79");
    _saledasboard.Select_search_cate("Tran#");
    
//    TestModellerLogger.SetLastNodeGuid("70b1bde3-d0ad-4960-af62-c02b0aa80340");
// _saledasboard.Enter_Enter_transcode("");
    
    
    TestModellerLogger.SetLastNodeGuid("563fb128-954e-4474-bad9-254789e60b81");
    _saledasboard.Click_Click_Update_btn();
    
//    sm457.preview _preview = new sm457.preview(driver);
////    TestModellerLogger.SetLastNodeGuid("58360469-e285-4b81-88e5-161658be4bbb");
////    _preview.GoToUrl();
////    
////
////    TestModellerLogger.SetLastNodeGuid("ba5b548d-d4bc-40f8-b170-d1600beb12c6");
////    _preview.AssertUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("1c8fe61d-dd6a-4afb-b3bc-dbc9989b820c");
//    _preview.Click_Clickeyeicon();
//    
//
//    TestModellerLogger.SetLastNodeGuid("74271fdb-c684-467b-9fb4-2789c62a2612");
//    _preview.Click_save_icon();
    
    SaleDashboardPage.NewPreviewPage _NewPreviewPage = new SaleDashboardPage.NewPreviewPage (driver);
//    TestModellerLogger.SetLastNodeGuid("dbbb77d9-da5b-418b-8bf9-81bcb95327cf");
//    _NewPreviewPage.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("d7e4fdde-c2c7-46a8-83a5-5be45ffa1225");
//    _NewPreviewPage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("715cfaaf-aba7-40a9-82e6-410e09784e97");
    _NewPreviewPage.Click_ClickOnPreview();
    

   TestModellerLogger.SetLastNodeGuid("23d6006a-2648-4df5-a3f3-c2e17c157827");
   _NewPreviewPage.Click_SaveButton();
   

  TestModellerLogger.SetLastNodeGuid("54b70d53-1986-4341-b00c-5f332860cd9d");
    _NewPreviewPage.Click_PDFDump();
    

    TestModellerLogger.SetLastNodeGuid("c672a06c-43df-4da3-b0e6-c89aec1ad026");
   _NewPreviewPage.Click_CancelButton();
    

    TestModellerLogger.SetLastNodeGuid("ad68166f-4045-401c-85cf-3a60a429becd");
    _NewPreviewPage.Click_ClickOnMail();
     
    SaleDashboardPage.mails _mails = new SaleDashboardPage.mails(driver);
//    TestModellerLogger.SetLastNodeGuid("a51e0f3b-19dd-45ae-9370-d3609e2e0894");
//    _mails.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("3660f942-cc68-4cef-bb82-82cb35bc37d8");
//    _mails.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("42ab91d4-7379-4404-a11e-6a50d2ca8760");
    _mails.Select_Select_InvoiceTemp(data[15]);
    

    TestModellerLogger.SetLastNodeGuid("3a1cbf88-20ac-48ea-be7c-61c45d03bf6e");
    _mails.Select_Email_Template(data[16]);
    

  TestModellerLogger.SetLastNodeGuid("2192c6c5-80e8-48b1-8207-cd86f583f7c6");
   _mails.Enter_Enter_mailid(Sheet);
    

    TestModellerLogger.SetLastNodeGuid("9942e2fa-2b79-4968-876b-4883effef066");
    _mails.Enter_Enter_Subject(data[18]);
    

    TestModellerLogger.SetLastNodeGuid("f8d8b4d0-e489-4043-8848-c64ac08e4975");
    _mails.Click_Sendbtn_clicked();
    

    TestModellerLogger.SetLastNodeGuid("cff924d0-3f00-4dd0-abb5-64fbf61324ee");
    _mails.Click_confirmation_msges();
    */
    }
}
/*

   	@Test  (groups= {"saleinvoice","saleinvoice - saleinvoice1"})
    	@TestModellerPath(guid = "131c2ec3-cf01-42aa-88c6-03fa5c03374f")
    	public void saleinvoice1GoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrl2() throws InterruptedException, HeadlessException, IOException, AWTException, InvalidFormatException
    	{
        
    	sTestCaseID="TC2";
    	Sheet="sm457";
    	data =ExcelData.toReadExcelData(sTestCaseID, Sheet);
    	
    	pages.nlogin _nlogin = new pages.nlogin(driver);
        TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
        _nlogin.GoToUrl();

    	   TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
        _nlogin.Enter_nLOGIN(data[1]);
        

        TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
        _nlogin.Enter_nPASS(data[2]);
        

        TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
        _nlogin.Click_Login();
        

    pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
//        TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
//        _AgentSearch.GoToUrl();
    //    

//        TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
//        _AgentSearch.AssertUrl();
        

        TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
        _AgentSearch.Click_Agents();
        

        TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
        _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
        

        TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
        _AgentSearch.Click_Search();
        

        TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
        _AgentSearch.Click__Nidhi1_();
        

    pages.Searchclient _Searchclient = new pages.Searchclient(driver);
//        TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
//        _Searchclient.GoToUrl();
     
    
//        TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
//        _Searchclient.AssertUrl();
        

        TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
        _Searchclient.Click__Clients_();
        

        TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
        _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
        


        TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
        _Searchclient.Click_Searchbtn();
        

        TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
        _Searchclient.Click__NidhiEnt();
        

   pages.SM457.Sale_Invoice2 _SaleInvoice = new    pages.SM457.Sale_Invoice2(driver);
//        TestModellerLogger.SetLastNodeGuid("2f331494-c0ec-443e-b258-bdf3d2f9d9fc");
//        _SaleInvoice.GoToUrl();

//        TestModellerLogger.SetLastNodeGuid("281121da-f0ce-4629-a4d1-0bc9b4260347");
//        _SaleInvoice.AssertUrl();
        

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
        _SaleInvoice.Enter_InvoiceDate(data[7]);
        

        TestModellerLogger.SetLastNodeGuid("294097b8-ccc5-4eb7-baec-1a26ca1364f0");
        _SaleInvoice.Select_IncomeType("Sale");
        

        TestModellerLogger.SetLastNodeGuid("5ccbf01b-65a3-47f5-b916-dab48aab691f");
        _SaleInvoice.Enter_Description(data[9]);
        

        TestModellerLogger.SetLastNodeGuid("73677a32-1892-47f6-9783-a1072478778a");
        _SaleInvoice.Enter_UnitPrice(data[10]);
        

        TestModellerLogger.SetLastNodeGuid("d810d5bf-a960-434c-9172-1671dd383495");
        _SaleInvoice.Enter_Quantity(data[11]);
        

        TestModellerLogger.SetLastNodeGuid("516c7236-f043-4de9-b128-99997ccf1604");
        _SaleInvoice.Select_VATRate(data[12]);
        

//        TestModellerLogger.SetLastNodeGuid("cb6d5101-0be0-4519-b1aa-5e71dcdfbef3");
//        _SaleInvoice.Click_Tickformorelineitems();
        

        TestModellerLogger.SetLastNodeGuid("6aeae28b-fd85-4712-8710-18e4b190dd19");
        _SaleInvoice.Enter_Note(data[13]);
        

        TestModellerLogger.SetLastNodeGuid("2508d3fa-348f-48f2-914a-4d43591ded90");
        _SaleInvoice.Click_SaveButton();
        _SaleInvoice.GetSuccessText();
	
   pages.SM457.saledasboard _saledasboard= new  pages.SM457.saledasboard(driver);
//    TestModellerLogger.SetLastNodeGuid("7e28a082-b5cd-463d-86de-ebca3d9067b6");
//    _saledasboard.GoToUrl();
//    
    
   TestModellerLogger.SetLastNodeGuid("6d02b2ac-e775-4904-954a-ef38f8931998");
    _saledasboard.Select_Select_customer(data[14]);

  TestModellerLogger.SetLastNodeGuid("914c514b-eec0-46fe-a8f5-9d8d7e056b79");
    _saledasboard.Select_search_cate("Tran#");
    
//    TestModellerLogger.SetLastNodeGuid("70b1bde3-d0ad-4960-af62-c02b0aa80340");
// _saledasboard.Enter_Enter_transcode("");
    
    
    TestModellerLogger.SetLastNodeGuid("563fb128-954e-4474-bad9-254789e60b81");
    _saledasboard.Click_Click_Update_btn();
    
//    sm457.preview _preview = new sm457.preview(driver);
////    TestModellerLogger.SetLastNodeGuid("58360469-e285-4b81-88e5-161658be4bbb");
////    _preview.GoToUrl();
////    
////
////    TestModellerLogger.SetLastNodeGuid("ba5b548d-d4bc-40f8-b170-d1600beb12c6");
////    _preview.AssertUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("1c8fe61d-dd6a-4afb-b3bc-dbc9989b820c");
//    _preview.Click_Clickeyeicon();
//    
//
//    TestModellerLogger.SetLastNodeGuid("74271fdb-c684-467b-9fb4-2789c62a2612");
//    _preview.Click_save_icon();
    
	pages.SM457.NewPreviewPage _NewPreviewPage = new pages.SM457.NewPreviewPage (driver);
//    TestModellerLogger.SetLastNodeGuid("dbbb77d9-da5b-418b-8bf9-81bcb95327cf");
//    _NewPreviewPage.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("d7e4fdde-c2c7-46a8-83a5-5be45ffa1225");
//    _NewPreviewPage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("715cfaaf-aba7-40a9-82e6-410e09784e97");
    _NewPreviewPage.Click_ClickOnPreview();
    

   TestModellerLogger.SetLastNodeGuid("23d6006a-2648-4df5-a3f3-c2e17c157827");
   _NewPreviewPage.Click_SaveButton();
   

  TestModellerLogger.SetLastNodeGuid("54b70d53-1986-4341-b00c-5f332860cd9d");
    _NewPreviewPage.Click_PDFDump();
    

    TestModellerLogger.SetLastNodeGuid("c672a06c-43df-4da3-b0e6-c89aec1ad026");
   _NewPreviewPage.Click_CancelButton();
    

    TestModellerLogger.SetLastNodeGuid("ad68166f-4045-401c-85cf-3a60a429becd");
    _NewPreviewPage.Click_ClickOnMail();
     
   pages.SM457.mails _mails = new pages.SM457.mails(driver);
//    TestModellerLogger.SetLastNodeGuid("a51e0f3b-19dd-45ae-9370-d3609e2e0894");
//    _mails.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("3660f942-cc68-4cef-bb82-82cb35bc37d8");
//    _mails.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("42ab91d4-7379-4404-a11e-6a50d2ca8760");
    _mails.Select_Select_InvoiceTemp(data[15]);
    

    TestModellerLogger.SetLastNodeGuid("3a1cbf88-20ac-48ea-be7c-61c45d03bf6e");
    _mails.Select_Email_Template(data[16]);
    

    TestModellerLogger.SetLastNodeGuid("2192c6c5-80e8-48b1-8207-cd86f583f7c6");
    _mails.Enter_Enter_mailid(data[17]);
    

    TestModellerLogger.SetLastNodeGuid("9942e2fa-2b79-4968-876b-4883effef066");
    _mails.Enter_Enter_Subject(data[18]);
    

    TestModellerLogger.SetLastNodeGuid("f8d8b4d0-e489-4043-8848-c64ac08e4975");
    _mails.Click_Sendbtn_clicked();
    

    TestModellerLogger.SetLastNodeGuid("cff924d0-3f00-4dd0-abb5-64fbf61324ee");
    _mails.Click_confirmation_msges();
    
    
  }

   @Test  (groups= {"saleinvoice","saleinvoice - saleinvoice1"})
    @TestModellerPath(guid = "fbd3452b-fd08-438d-b992-c4319e511d90")
    public void saleinvoice1GoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrl3() throws HeadlessException, IOException, AWTException, InterruptedException, InvalidFormatException
    {
        
    	sTestCaseID="TC3";
    	Sheet="sm457";
    	data =ExcelData.toReadExcelData(sTestCaseID, Sheet);
    	pages.nlogin _nlogin = new pages.nlogin(driver);
        TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
        _nlogin.GoToUrl();

    	TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
        _nlogin.Enter_nLOGIN(data[1]);
        

        TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
        _nlogin.Enter_nPASS(data[2]);
        

        TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
        _nlogin.Click_Login();
        

    pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
//        TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
//        _AgentSearch.GoToUrl();
    //    

//        TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
//        _AgentSearch.AssertUrl();
        

        TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
        _AgentSearch.Click_Agents();
        

        TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
        _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
        

        TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
        _AgentSearch.Click_Search();
        

        TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
        _AgentSearch.Click__Nidhi1_();
        

    pages.Searchclient _Searchclient = new pages.Searchclient(driver);
//        TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
//        _Searchclient.GoToUrl();
     
    
//        TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
//        _Searchclient.AssertUrl();
        

        TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
        _Searchclient.Click__Clients_();
        

        TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
        _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
        


        TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
        _Searchclient.Click_Searchbtn();
        

        TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
        _Searchclient.Click__NidhiEnt();
        

   pages.SM457.Sale_Invoice2 _SaleInvoice = new    pages.SM457.Sale_Invoice2(driver);
//        TestModellerLogger.SetLastNodeGuid("2f331494-c0ec-443e-b258-bdf3d2f9d9fc");
//        _SaleInvoice.GoToUrl();

//        TestModellerLogger.SetLastNodeGuid("281121da-f0ce-4629-a4d1-0bc9b4260347");
//        _SaleInvoice.AssertUrl();
        

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
        _SaleInvoice.Enter_InvoiceDate(data[7]);
        

        TestModellerLogger.SetLastNodeGuid("294097b8-ccc5-4eb7-baec-1a26ca1364f0");
        _SaleInvoice.Select_IncomeType("Sale");
        

        TestModellerLogger.SetLastNodeGuid("5ccbf01b-65a3-47f5-b916-dab48aab691f");
        _SaleInvoice.Enter_Description(data[9]);
        

        TestModellerLogger.SetLastNodeGuid("73677a32-1892-47f6-9783-a1072478778a");
        _SaleInvoice.Enter_UnitPrice(data[10]);
        

        TestModellerLogger.SetLastNodeGuid("d810d5bf-a960-434c-9172-1671dd383495");
        _SaleInvoice.Enter_Quantity(data[11]);
        

        TestModellerLogger.SetLastNodeGuid("516c7236-f043-4de9-b128-99997ccf1604");
        _SaleInvoice.Select_VATRate(data[12]);
        

//        TestModellerLogger.SetLastNodeGuid("cb6d5101-0be0-4519-b1aa-5e71dcdfbef3");
//        _SaleInvoice.Click_Tickformorelineitems();
        

        TestModellerLogger.SetLastNodeGuid("6aeae28b-fd85-4712-8710-18e4b190dd19");
        _SaleInvoice.Enter_Note(data[13]);
        

        TestModellerLogger.SetLastNodeGuid("2508d3fa-348f-48f2-914a-4d43591ded90");
        _SaleInvoice.Click_SaveButton();
	
        _SaleInvoice.GetSuccessText();
   pages.SM457.saledasboard _saledasboard= new  pages.SM457.saledasboard(driver);
//    TestModellerLogger.SetLastNodeGuid("7e28a082-b5cd-463d-86de-ebca3d9067b6");
//    _saledasboard.GoToUrl();
//    
    
   TestModellerLogger.SetLastNodeGuid("6d02b2ac-e775-4904-954a-ef38f8931998");
    _saledasboard.Select_Select_customer(data[14]);

  TestModellerLogger.SetLastNodeGuid("914c514b-eec0-46fe-a8f5-9d8d7e056b79");
    _saledasboard.Select_search_cate("Tran#");
    
//    TestModellerLogger.SetLastNodeGuid("70b1bde3-d0ad-4960-af62-c02b0aa80340");
// _saledasboard.Enter_Enter_transcode("");
    
    
    TestModellerLogger.SetLastNodeGuid("563fb128-954e-4474-bad9-254789e60b81");
    _saledasboard.Click_Click_Update_btn();
    
//    sm457.preview _preview = new sm457.preview(driver);
////    TestModellerLogger.SetLastNodeGuid("58360469-e285-4b81-88e5-161658be4bbb");
////    _preview.GoToUrl();
////    
////
////    TestModellerLogger.SetLastNodeGuid("ba5b548d-d4bc-40f8-b170-d1600beb12c6");
////    _preview.AssertUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("1c8fe61d-dd6a-4afb-b3bc-dbc9989b820c");
//    _preview.Click_Clickeyeicon();
//    
//
//    TestModellerLogger.SetLastNodeGuid("74271fdb-c684-467b-9fb4-2789c62a2612");
//    _preview.Click_save_icon();
    
	pages.SM457.NewPreviewPage _NewPreviewPage = new pages.SM457.NewPreviewPage (driver);
//    TestModellerLogger.SetLastNodeGuid("dbbb77d9-da5b-418b-8bf9-81bcb95327cf");
//    _NewPreviewPage.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("d7e4fdde-c2c7-46a8-83a5-5be45ffa1225");
//    _NewPreviewPage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("715cfaaf-aba7-40a9-82e6-410e09784e97");
    _NewPreviewPage.Click_ClickOnPreview();
    

   TestModellerLogger.SetLastNodeGuid("23d6006a-2648-4df5-a3f3-c2e17c157827");
   _NewPreviewPage.Click_SaveButton();
   

  TestModellerLogger.SetLastNodeGuid("54b70d53-1986-4341-b00c-5f332860cd9d");
    _NewPreviewPage.Click_PDFDump();
    

    TestModellerLogger.SetLastNodeGuid("c672a06c-43df-4da3-b0e6-c89aec1ad026");
   _NewPreviewPage.Click_CancelButton();
    

    TestModellerLogger.SetLastNodeGuid("ad68166f-4045-401c-85cf-3a60a429becd");
    _NewPreviewPage.Click_ClickOnMail();
     
   pages.SM457.mails _mails = new pages.SM457.mails(driver);
//    TestModellerLogger.SetLastNodeGuid("a51e0f3b-19dd-45ae-9370-d3609e2e0894");
//    _mails.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("3660f942-cc68-4cef-bb82-82cb35bc37d8");
//    _mails.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("42ab91d4-7379-4404-a11e-6a50d2ca8760");
    _mails.Select_Select_InvoiceTemp(data[15]);
    

    TestModellerLogger.SetLastNodeGuid("3a1cbf88-20ac-48ea-be7c-61c45d03bf6e");
    _mails.Select_Email_Template(data[16]);
    

    TestModellerLogger.SetLastNodeGuid("2192c6c5-80e8-48b1-8207-cd86f583f7c6");
    _mails.Enter_Enter_mailid(data[17]);
    

    TestModellerLogger.SetLastNodeGuid("9942e2fa-2b79-4968-876b-4883effef066");
    _mails.Enter_Enter_Subject(data[18]);
    

    TestModellerLogger.SetLastNodeGuid("f8d8b4d0-e489-4043-8848-c64ac08e4975");
    _mails.Click_Sendbtn_clicked();
    

    TestModellerLogger.SetLastNodeGuid("cff924d0-3f00-4dd0-abb5-64fbf61324ee");
    _mails.Click_confirmation_msges();
    
        }

    @Test  (groups= {"saleinvoice","saleinvoice - saleinvoice1"})
    @TestModellerPath(guid = "fb544b63-fff5-4416-8004-06e8a4d786c1")
    public void saleinvoice1GoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrl4() throws InterruptedException, HeadlessException, IOException, AWTException, InvalidFormatException
    {
    	sTestCaseID="TC4";
    	Sheet="sm457";
    	data =ExcelData.toReadExcelData(sTestCaseID, Sheet);
    	
    	pages.nlogin _nlogin = new pages.nlogin(driver);
        TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
        _nlogin.GoToUrl();

        
    	TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
        _nlogin.Enter_nLOGIN(data[1]);
        

        TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
        _nlogin.Enter_nPASS(data[2]);
        

        TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
        _nlogin.Click_Login();
        

    pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
//        TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
//        _AgentSearch.GoToUrl();
    //    

//        TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
//        _AgentSearch.AssertUrl();
        

        TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
        _AgentSearch.Click_Agents();
        

        TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
        _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
        

        TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
        _AgentSearch.Click_Search();
        

        TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
        _AgentSearch.Click__Nidhi1_();
        

    pages.Searchclient _Searchclient = new pages.Searchclient(driver);
//        TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
//        _Searchclient.GoToUrl();
     
    
//        TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
//        _Searchclient.AssertUrl();
        

        TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
        _Searchclient.Click__Clients_();
        

        TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
        _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
        


        TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
        _Searchclient.Click_Searchbtn();
        

        TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
        _Searchclient.Click__NidhiEnt();
        

   pages.SM457.Sale_Invoice2 _SaleInvoice = new    pages.SM457.Sale_Invoice2(driver);
//        TestModellerLogger.SetLastNodeGuid("2f331494-c0ec-443e-b258-bdf3d2f9d9fc");
//        _SaleInvoice.GoToUrl();

//        TestModellerLogger.SetLastNodeGuid("281121da-f0ce-4629-a4d1-0bc9b4260347");
//        _SaleInvoice.AssertUrl();
        

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
        _SaleInvoice.Enter_InvoiceDate(data[7]);
        

        TestModellerLogger.SetLastNodeGuid("294097b8-ccc5-4eb7-baec-1a26ca1364f0");
        _SaleInvoice.Select_IncomeType("Sale");
        

        TestModellerLogger.SetLastNodeGuid("5ccbf01b-65a3-47f5-b916-dab48aab691f");
        _SaleInvoice.Enter_Description(data[9]);
        

        TestModellerLogger.SetLastNodeGuid("73677a32-1892-47f6-9783-a1072478778a");
        _SaleInvoice.Enter_UnitPrice(data[10]);
        

        TestModellerLogger.SetLastNodeGuid("d810d5bf-a960-434c-9172-1671dd383495");
        _SaleInvoice.Enter_Quantity(data[11]);
        

        TestModellerLogger.SetLastNodeGuid("516c7236-f043-4de9-b128-99997ccf1604");
        _SaleInvoice.Select_VATRate(data[12]);
        

//        TestModellerLogger.SetLastNodeGuid("cb6d5101-0be0-4519-b1aa-5e71dcdfbef3");
//        _SaleInvoice.Click_Tickformorelineitems();
        

        TestModellerLogger.SetLastNodeGuid("6aeae28b-fd85-4712-8710-18e4b190dd19");
        _SaleInvoice.Enter_Note(data[13]);
        

        TestModellerLogger.SetLastNodeGuid("2508d3fa-348f-48f2-914a-4d43591ded90");
        _SaleInvoice.Click_SaveButton();
        _SaleInvoice.GetSuccessText();
        
   pages.SM457.saledasboard _saledasboard= new  pages.SM457.saledasboard(driver);
//    TestModellerLogger.SetLastNodeGuid("7e28a082-b5cd-463d-86de-ebca3d9067b6");
//    _saledasboard.GoToUrl();
//    
    
   TestModellerLogger.SetLastNodeGuid("6d02b2ac-e775-4904-954a-ef38f8931998");
    _saledasboard.Select_Select_customer(data[14]);

  TestModellerLogger.SetLastNodeGuid("914c514b-eec0-46fe-a8f5-9d8d7e056b79");
    _saledasboard.Select_search_cate("Tran#");
    
//    TestModellerLogger.SetLastNodeGuid("70b1bde3-d0ad-4960-af62-c02b0aa80340");
// _saledasboard.Enter_Enter_transcode("");
    
    
    TestModellerLogger.SetLastNodeGuid("563fb128-954e-4474-bad9-254789e60b81");
    _saledasboard.Click_Click_Update_btn();
    
//    sm457.preview _preview = new sm457.preview(driver);
////    TestModellerLogger.SetLastNodeGuid("58360469-e285-4b81-88e5-161658be4bbb");
////    _preview.GoToUrl();
////    
////
////    TestModellerLogger.SetLastNodeGuid("ba5b548d-d4bc-40f8-b170-d1600beb12c6");
////    _preview.AssertUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("1c8fe61d-dd6a-4afb-b3bc-dbc9989b820c");
//    _preview.Click_Clickeyeicon();
//    
//
//    TestModellerLogger.SetLastNodeGuid("74271fdb-c684-467b-9fb4-2789c62a2612");
//    _preview.Click_save_icon();
    
	pages.SM457.NewPreviewPage _NewPreviewPage = new pages.SM457.NewPreviewPage (driver);
//    TestModellerLogger.SetLastNodeGuid("dbbb77d9-da5b-418b-8bf9-81bcb95327cf");
//    _NewPreviewPage.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("d7e4fdde-c2c7-46a8-83a5-5be45ffa1225");
//    _NewPreviewPage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("715cfaaf-aba7-40a9-82e6-410e09784e97");
    _NewPreviewPage.Click_ClickOnPreview();
    

   TestModellerLogger.SetLastNodeGuid("23d6006a-2648-4df5-a3f3-c2e17c157827");
   _NewPreviewPage.Click_SaveButton();
   

  TestModellerLogger.SetLastNodeGuid("54b70d53-1986-4341-b00c-5f332860cd9d");
    _NewPreviewPage.Click_PDFDump();
    

    TestModellerLogger.SetLastNodeGuid("c672a06c-43df-4da3-b0e6-c89aec1ad026");
   _NewPreviewPage.Click_CancelButton();
    

    TestModellerLogger.SetLastNodeGuid("ad68166f-4045-401c-85cf-3a60a429becd");
    _NewPreviewPage.Click_ClickOnMail();
     
   pages.SM457.mails _mails = new pages.SM457.mails(driver);
//    TestModellerLogger.SetLastNodeGuid("a51e0f3b-19dd-45ae-9370-d3609e2e0894");
//    _mails.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("3660f942-cc68-4cef-bb82-82cb35bc37d8");
//    _mails.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("42ab91d4-7379-4404-a11e-6a50d2ca8760");
    _mails.Select_Select_InvoiceTemp(data[15]);
    

    TestModellerLogger.SetLastNodeGuid("3a1cbf88-20ac-48ea-be7c-61c45d03bf6e");
    _mails.Select_Email_Template(data[16]);
    

    TestModellerLogger.SetLastNodeGuid("2192c6c5-80e8-48b1-8207-cd86f583f7c6");
    _mails.Enter_Enter_mailid(data[17]);
    

    TestModellerLogger.SetLastNodeGuid("9942e2fa-2b79-4968-876b-4883effef066");
    _mails.Enter_Enter_Subject(data[18]);
    

    TestModellerLogger.SetLastNodeGuid("f8d8b4d0-e489-4043-8848-c64ac08e4975");
    _mails.Click_Sendbtn_clicked();
    

    TestModellerLogger.SetLastNodeGuid("cff924d0-3f00-4dd0-abb5-64fbf61324ee");
    _mails.Click_confirmation_msges();
    
    }

    

    @Test  (groups= {"saleinvoice","saleinvoice - saleinvoice1"})
    @TestModellerPath(guid = "4045661e-791f-4e5e-aa88-4e820a16c80e")
    public void saleinvoice1GoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrl5() throws HeadlessException, IOException, AWTException, InterruptedException, InvalidFormatException
    {
    	sTestCaseID="TC5";
    	Sheet="sm457";
    	data =ExcelData.toReadExcelData(sTestCaseID, Sheet);

    	pages.nlogin _nlogin = new pages.nlogin(driver);
        TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
        _nlogin.GoToUrl();
    	
    	TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
        _nlogin.Enter_nLOGIN(data[1]);
        

        TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
        _nlogin.Enter_nPASS(data[2]);
        

        TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
        _nlogin.Click_Login();
        

    pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
//        TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
//        _AgentSearch.GoToUrl();
    //    

//        TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
//        _AgentSearch.AssertUrl();
        

        TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
        _AgentSearch.Click_Agents();
        

        TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
        _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
        

        TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
        _AgentSearch.Click_Search();
        

        TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
        _AgentSearch.Click__Nidhi1_();
        

    pages.Searchclient _Searchclient = new pages.Searchclient(driver);
//        TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
//        _Searchclient.GoToUrl();
     
    
//        TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
//        _Searchclient.AssertUrl();
        

        TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
        _Searchclient.Click__Clients_();
        

        TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
        _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
        


        TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
        _Searchclient.Click_Searchbtn();
        

        TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
        _Searchclient.Click__NidhiEnt();
        

   pages.SM457.Sale_Invoice2 _SaleInvoice = new    pages.SM457.Sale_Invoice2(driver);
//        TestModellerLogger.SetLastNodeGuid("2f331494-c0ec-443e-b258-bdf3d2f9d9fc");
//        _SaleInvoice.GoToUrl();

//        TestModellerLogger.SetLastNodeGuid("281121da-f0ce-4629-a4d1-0bc9b4260347");
//        _SaleInvoice.AssertUrl();
        

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
        _SaleInvoice.Enter_InvoiceDate(data[7]);
        

        TestModellerLogger.SetLastNodeGuid("294097b8-ccc5-4eb7-baec-1a26ca1364f0");
        _SaleInvoice.Select_IncomeType("Sale");
        

        TestModellerLogger.SetLastNodeGuid("5ccbf01b-65a3-47f5-b916-dab48aab691f");
        _SaleInvoice.Enter_Description(data[9]);
        

        TestModellerLogger.SetLastNodeGuid("73677a32-1892-47f6-9783-a1072478778a");
        _SaleInvoice.Enter_UnitPrice(data[10]);
        

        TestModellerLogger.SetLastNodeGuid("d810d5bf-a960-434c-9172-1671dd383495");
        _SaleInvoice.Enter_Quantity(data[11]);
        

        TestModellerLogger.SetLastNodeGuid("516c7236-f043-4de9-b128-99997ccf1604");
        _SaleInvoice.Select_VATRate(data[12]);
        

//        TestModellerLogger.SetLastNodeGuid("cb6d5101-0be0-4519-b1aa-5e71dcdfbef3");
//        _SaleInvoice.Click_Tickformorelineitems();
        

        TestModellerLogger.SetLastNodeGuid("6aeae28b-fd85-4712-8710-18e4b190dd19");
        _SaleInvoice.Enter_Note(data[13]);
        

        TestModellerLogger.SetLastNodeGuid("2508d3fa-348f-48f2-914a-4d43591ded90");
        _SaleInvoice.Click_SaveButton();
        _SaleInvoice.GetSuccessText();
   pages.SM457.saledasboard _saledasboard= new  pages.SM457.saledasboard(driver);
//    TestModellerLogger.SetLastNodeGuid("7e28a082-b5cd-463d-86de-ebca3d9067b6");
//    _saledasboard.GoToUrl();
//    
    
   TestModellerLogger.SetLastNodeGuid("6d02b2ac-e775-4904-954a-ef38f8931998");
    _saledasboard.Select_Select_customer(data[14]);

  TestModellerLogger.SetLastNodeGuid("914c514b-eec0-46fe-a8f5-9d8d7e056b79");
    _saledasboard.Select_search_cate("Tran#");
    
//    TestModellerLogger.SetLastNodeGuid("70b1bde3-d0ad-4960-af62-c02b0aa80340");
// _saledasboard.Enter_Enter_transcode("");
    
    
    TestModellerLogger.SetLastNodeGuid("563fb128-954e-4474-bad9-254789e60b81");
    _saledasboard.Click_Click_Update_btn();
    
//    sm457.preview _preview = new sm457.preview(driver);
////    TestModellerLogger.SetLastNodeGuid("58360469-e285-4b81-88e5-161658be4bbb");
////    _preview.GoToUrl();
////    
////
////    TestModellerLogger.SetLastNodeGuid("ba5b548d-d4bc-40f8-b170-d1600beb12c6");
////    _preview.AssertUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("1c8fe61d-dd6a-4afb-b3bc-dbc9989b820c");
//    _preview.Click_Clickeyeicon();
//    
//
//    TestModellerLogger.SetLastNodeGuid("74271fdb-c684-467b-9fb4-2789c62a2612");
//    _preview.Click_save_icon();
    
	pages.SM457.NewPreviewPage _NewPreviewPage = new pages.SM457.NewPreviewPage (driver);
//    TestModellerLogger.SetLastNodeGuid("dbbb77d9-da5b-418b-8bf9-81bcb95327cf");
//    _NewPreviewPage.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("d7e4fdde-c2c7-46a8-83a5-5be45ffa1225");
//    _NewPreviewPage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("715cfaaf-aba7-40a9-82e6-410e09784e97");
    _NewPreviewPage.Click_ClickOnPreview();
    

   TestModellerLogger.SetLastNodeGuid("23d6006a-2648-4df5-a3f3-c2e17c157827");
   _NewPreviewPage.Click_SaveButton();
   

  TestModellerLogger.SetLastNodeGuid("54b70d53-1986-4341-b00c-5f332860cd9d");
    _NewPreviewPage.Click_PDFDump();
    

    TestModellerLogger.SetLastNodeGuid("c672a06c-43df-4da3-b0e6-c89aec1ad026");
   _NewPreviewPage.Click_CancelButton();
    

    TestModellerLogger.SetLastNodeGuid("ad68166f-4045-401c-85cf-3a60a429becd");
    _NewPreviewPage.Click_ClickOnMail();
     
   pages.SM457.mails _mails = new pages.SM457.mails(driver);
//    TestModellerLogger.SetLastNodeGuid("a51e0f3b-19dd-45ae-9370-d3609e2e0894");
//    _mails.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("3660f942-cc68-4cef-bb82-82cb35bc37d8");
//    _mails.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("42ab91d4-7379-4404-a11e-6a50d2ca8760");
    _mails.Select_Select_InvoiceTemp(data[15]);
    

    TestModellerLogger.SetLastNodeGuid("3a1cbf88-20ac-48ea-be7c-61c45d03bf6e");
    _mails.Select_Email_Template(data[16]);
    

    TestModellerLogger.SetLastNodeGuid("2192c6c5-80e8-48b1-8207-cd86f583f7c6");
    _mails.Enter_Enter_mailid(data[17]);
    

    TestModellerLogger.SetLastNodeGuid("9942e2fa-2b79-4968-876b-4883effef066");
    _mails.Enter_Enter_Subject(data[18]);
    

    TestModellerLogger.SetLastNodeGuid("f8d8b4d0-e489-4043-8848-c64ac08e4975");
    _mails.Click_Sendbtn_clicked();
    

    TestModellerLogger.SetLastNodeGuid("cff924d0-3f00-4dd0-abb5-64fbf61324ee");
    _mails.Click_confirmation_msges();
    

    }


   @Test  (groups= {"saleinvoice","saleinvoice - saleinvoice1"})
    @TestModellerPath(guid = "ae051802-46ed-4137-96f3-524cd8e157fb")
    public void saleinvoice1GoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrl6() throws HeadlessException, IOException, AWTException, InvalidFormatException, InterruptedException
    {
        
	   sTestCaseID="TC6";
   	Sheet="sm457";
   	data =ExcelData.toReadExcelData(sTestCaseID, Sheet);

	pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();   
   	
   	TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN(data[1]);
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS(data[2]);
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
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
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
//    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
//    _Searchclient.GoToUrl();
 

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
    

pages.SM457.Sale_Invoice2 _SaleInvoice = new    pages.SM457.Sale_Invoice2(driver);
//    TestModellerLogger.SetLastNodeGuid("2f331494-c0ec-443e-b258-bdf3d2f9d9fc");
//    _SaleInvoice.GoToUrl();

//    TestModellerLogger.SetLastNodeGuid("281121da-f0ce-4629-a4d1-0bc9b4260347");
//    _SaleInvoice.AssertUrl();
    

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
    _SaleInvoice.Enter_InvoiceDate(data[7]);
    

    TestModellerLogger.SetLastNodeGuid("294097b8-ccc5-4eb7-baec-1a26ca1364f0");
    _SaleInvoice.Select_IncomeType("Sale");
    

    TestModellerLogger.SetLastNodeGuid("5ccbf01b-65a3-47f5-b916-dab48aab691f");
    _SaleInvoice.Enter_Description(data[9]);
    

    TestModellerLogger.SetLastNodeGuid("73677a32-1892-47f6-9783-a1072478778a");
    _SaleInvoice.Enter_UnitPrice(data[10]);
    

    TestModellerLogger.SetLastNodeGuid("d810d5bf-a960-434c-9172-1671dd383495");
    _SaleInvoice.Enter_Quantity(data[11]);
    

    TestModellerLogger.SetLastNodeGuid("516c7236-f043-4de9-b128-99997ccf1604");
    _SaleInvoice.Select_VATRate(data[12]);
    

//    TestModellerLogger.SetLastNodeGuid("cb6d5101-0be0-4519-b1aa-5e71dcdfbef3");
//    _SaleInvoice.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("6aeae28b-fd85-4712-8710-18e4b190dd19");
    _SaleInvoice.Enter_Note(data[13]);
    

    TestModellerLogger.SetLastNodeGuid("2508d3fa-348f-48f2-914a-4d43591ded90");
    _SaleInvoice.Click_SaveButton();
    _SaleInvoice.GetSuccessText();

pages.SM457.saledasboard _saledasboard= new  pages.SM457.saledasboard(driver);
//TestModellerLogger.SetLastNodeGuid("7e28a082-b5cd-463d-86de-ebca3d9067b6");
//_saledasboard.GoToUrl();
//

TestModellerLogger.SetLastNodeGuid("6d02b2ac-e775-4904-954a-ef38f8931998");
_saledasboard.Select_Select_customer(data[14]);

TestModellerLogger.SetLastNodeGuid("914c514b-eec0-46fe-a8f5-9d8d7e056b79");
_saledasboard.Select_search_cate("Tran#");

//TestModellerLogger.SetLastNodeGuid("70b1bde3-d0ad-4960-af62-c02b0aa80340");
//_saledasboard.Enter_Enter_transcode("");


TestModellerLogger.SetLastNodeGuid("563fb128-954e-4474-bad9-254789e60b81");
_saledasboard.Click_Click_Update_btn();

//sm457.preview _preview = new sm457.preview(driver);
////TestModellerLogger.SetLastNodeGuid("58360469-e285-4b81-88e5-161658be4bbb");
////_preview.GoToUrl();
////
////
////TestModellerLogger.SetLastNodeGuid("ba5b548d-d4bc-40f8-b170-d1600beb12c6");
////_preview.AssertUrl();
//
//
//TestModellerLogger.SetLastNodeGuid("1c8fe61d-dd6a-4afb-b3bc-dbc9989b820c");
//_preview.Click_Clickeyeicon();
//
//
//TestModellerLogger.SetLastNodeGuid("74271fdb-c684-467b-9fb4-2789c62a2612");
//_preview.Click_save_icon();

pages.SM457.NewPreviewPage _NewPreviewPage = new pages.SM457.NewPreviewPage (driver);
//TestModellerLogger.SetLastNodeGuid("dbbb77d9-da5b-418b-8bf9-81bcb95327cf");
//_NewPreviewPage.GoToUrl();
//
//
//TestModellerLogger.SetLastNodeGuid("d7e4fdde-c2c7-46a8-83a5-5be45ffa1225");
//_NewPreviewPage.AssertUrl();


TestModellerLogger.SetLastNodeGuid("715cfaaf-aba7-40a9-82e6-410e09784e97");
_NewPreviewPage.Click_ClickOnPreview();


TestModellerLogger.SetLastNodeGuid("23d6006a-2648-4df5-a3f3-c2e17c157827");
_NewPreviewPage.Click_SaveButton();


TestModellerLogger.SetLastNodeGuid("54b70d53-1986-4341-b00c-5f332860cd9d");
_NewPreviewPage.Click_PDFDump();


TestModellerLogger.SetLastNodeGuid("c672a06c-43df-4da3-b0e6-c89aec1ad026");
_NewPreviewPage.Click_CancelButton();


TestModellerLogger.SetLastNodeGuid("ad68166f-4045-401c-85cf-3a60a429becd");
_NewPreviewPage.Click_ClickOnMail();
 
pages.SM457.mails _mails = new pages.SM457.mails(driver);
//TestModellerLogger.SetLastNodeGuid("a51e0f3b-19dd-45ae-9370-d3609e2e0894");
//_mails.GoToUrl();
//
//
//TestModellerLogger.SetLastNodeGuid("3660f942-cc68-4cef-bb82-82cb35bc37d8");
//_mails.AssertUrl();
//

TestModellerLogger.SetLastNodeGuid("42ab91d4-7379-4404-a11e-6a50d2ca8760");
_mails.Select_Select_InvoiceTemp(data[15]);


TestModellerLogger.SetLastNodeGuid("3a1cbf88-20ac-48ea-be7c-61c45d03bf6e");
_mails.Select_Email_Template(data[16]);


TestModellerLogger.SetLastNodeGuid("2192c6c5-80e8-48b1-8207-cd86f583f7c6");
_mails.Enter_Enter_mailid(data[17]);


TestModellerLogger.SetLastNodeGuid("9942e2fa-2b79-4968-876b-4883effef066");
_mails.Enter_Enter_Subject(data[18]);


TestModellerLogger.SetLastNodeGuid("f8d8b4d0-e489-4043-8848-c64ac08e4975");
_mails.Click_Sendbtn_clicked();


TestModellerLogger.SetLastNodeGuid("cff924d0-3f00-4dd0-abb5-64fbf61324ee");
_mails.Click_confirmation_msges();

    

    }
   
   @Test  (groups= {"saleinvoice","saleinvoice - saleinvoice1"})
   @TestModellerPath(guid = "ae051802-46ed-4137-96f3-524cd8e157fb")
   public void saleinvoice1GoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrl7() throws HeadlessException, IOException, AWTException, InvalidFormatException, InterruptedException
   {
       
	   sTestCaseID="TC7";
  	Sheet="sm457";
  	data =ExcelData.toReadExcelData(sTestCaseID, Sheet);

	pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
  	
      
  	TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN(data[1]);
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS(data[2]);
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
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
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
//    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
//    _Searchclient.GoToUrl();
 

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
    

pages.SM457.Sale_Invoice2 _SaleInvoice = new    pages.SM457.Sale_Invoice2(driver);
//    TestModellerLogger.SetLastNodeGuid("2f331494-c0ec-443e-b258-bdf3d2f9d9fc");
//    _SaleInvoice.GoToUrl();

//    TestModellerLogger.SetLastNodeGuid("281121da-f0ce-4629-a4d1-0bc9b4260347");
//    _SaleInvoice.AssertUrl();
    

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
    _SaleInvoice.Enter_InvoiceDate(data[7]);
    

    TestModellerLogger.SetLastNodeGuid("294097b8-ccc5-4eb7-baec-1a26ca1364f0");
    _SaleInvoice.Select_IncomeType("Sale");
    

    TestModellerLogger.SetLastNodeGuid("5ccbf01b-65a3-47f5-b916-dab48aab691f");
    _SaleInvoice.Enter_Description(data[9]);
    

    TestModellerLogger.SetLastNodeGuid("73677a32-1892-47f6-9783-a1072478778a");
    _SaleInvoice.Enter_UnitPrice(data[10]);
    

    TestModellerLogger.SetLastNodeGuid("d810d5bf-a960-434c-9172-1671dd383495");
    _SaleInvoice.Enter_Quantity(data[11]);
    

    TestModellerLogger.SetLastNodeGuid("516c7236-f043-4de9-b128-99997ccf1604");
    _SaleInvoice.Select_VATRate(data[12]);
    

//    TestModellerLogger.SetLastNodeGuid("cb6d5101-0be0-4519-b1aa-5e71dcdfbef3");
//    _SaleInvoice.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("6aeae28b-fd85-4712-8710-18e4b190dd19");
    _SaleInvoice.Enter_Note(data[13]);
    

    TestModellerLogger.SetLastNodeGuid("2508d3fa-348f-48f2-914a-4d43591ded90");
    _SaleInvoice.Click_SaveButton();
    _SaleInvoice.GetSuccessText();

pages.SM457.saledasboard _saledasboard= new  pages.SM457.saledasboard(driver);
//TestModellerLogger.SetLastNodeGuid("7e28a082-b5cd-463d-86de-ebca3d9067b6");
//_saledasboard.GoToUrl();
//

TestModellerLogger.SetLastNodeGuid("6d02b2ac-e775-4904-954a-ef38f8931998");
_saledasboard.Select_Select_customer(data[14]);

TestModellerLogger.SetLastNodeGuid("914c514b-eec0-46fe-a8f5-9d8d7e056b79");
_saledasboard.Select_search_cate("Tran#");

//TestModellerLogger.SetLastNodeGuid("70b1bde3-d0ad-4960-af62-c02b0aa80340");
//_saledasboard.Enter_Enter_transcode("");


TestModellerLogger.SetLastNodeGuid("563fb128-954e-4474-bad9-254789e60b81");
_saledasboard.Click_Click_Update_btn();

//sm457.preview _preview = new sm457.preview(driver);
////TestModellerLogger.SetLastNodeGuid("58360469-e285-4b81-88e5-161658be4bbb");
////_preview.GoToUrl();
////
////
////TestModellerLogger.SetLastNodeGuid("ba5b548d-d4bc-40f8-b170-d1600beb12c6");
////_preview.AssertUrl();
//
//
//TestModellerLogger.SetLastNodeGuid("1c8fe61d-dd6a-4afb-b3bc-dbc9989b820c");
//_preview.Click_Clickeyeicon();
//
//
//TestModellerLogger.SetLastNodeGuid("74271fdb-c684-467b-9fb4-2789c62a2612");
//_preview.Click_save_icon();

pages.SM457.NewPreviewPage _NewPreviewPage = new pages.SM457.NewPreviewPage (driver);
//TestModellerLogger.SetLastNodeGuid("dbbb77d9-da5b-418b-8bf9-81bcb95327cf");
//_NewPreviewPage.GoToUrl();
//
//
//TestModellerLogger.SetLastNodeGuid("d7e4fdde-c2c7-46a8-83a5-5be45ffa1225");
//_NewPreviewPage.AssertUrl();


TestModellerLogger.SetLastNodeGuid("715cfaaf-aba7-40a9-82e6-410e09784e97");
_NewPreviewPage.Click_ClickOnPreview();


TestModellerLogger.SetLastNodeGuid("23d6006a-2648-4df5-a3f3-c2e17c157827");
_NewPreviewPage.Click_SaveButton();


TestModellerLogger.SetLastNodeGuid("54b70d53-1986-4341-b00c-5f332860cd9d");
_NewPreviewPage.Click_PDFDump();


TestModellerLogger.SetLastNodeGuid("c672a06c-43df-4da3-b0e6-c89aec1ad026");
_NewPreviewPage.Click_CancelButton();


TestModellerLogger.SetLastNodeGuid("ad68166f-4045-401c-85cf-3a60a429becd");
_NewPreviewPage.Click_ClickOnMail();
 
pages.SM457.mails _mails = new pages.SM457.mails(driver);
//TestModellerLogger.SetLastNodeGuid("a51e0f3b-19dd-45ae-9370-d3609e2e0894");
//_mails.GoToUrl();
//
//
//TestModellerLogger.SetLastNodeGuid("3660f942-cc68-4cef-bb82-82cb35bc37d8");
//_mails.AssertUrl();
//

TestModellerLogger.SetLastNodeGuid("42ab91d4-7379-4404-a11e-6a50d2ca8760");
_mails.Select_Select_InvoiceTemp(data[15]);


TestModellerLogger.SetLastNodeGuid("3a1cbf88-20ac-48ea-be7c-61c45d03bf6e");
_mails.Select_Email_Template(data[16]);


TestModellerLogger.SetLastNodeGuid("2192c6c5-80e8-48b1-8207-cd86f583f7c6");
_mails.Enter_Enter_mailid(data[17]);


TestModellerLogger.SetLastNodeGuid("9942e2fa-2b79-4968-876b-4883effef066");
_mails.Enter_Enter_Subject(data[18]);


TestModellerLogger.SetLastNodeGuid("f8d8b4d0-e489-4043-8848-c64ac08e4975");
_mails.Click_Sendbtn_clicked();


TestModellerLogger.SetLastNodeGuid("cff924d0-3f00-4dd0-abb5-64fbf61324ee");
_mails.Click_confirmation_msges();

   }
   @Test  (groups= {"saleinvoice","saleinvoice - saleinvoice1"})
   @TestModellerPath(guid = "ae051802-46ed-4137-96f3-524cd8e157fb")
   public void saleinvoice1GoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrl8() throws HeadlessException, IOException, AWTException, InvalidFormatException, InterruptedException
   {
       
	   sTestCaseID="TC8";
  	Sheet="sm457";
  	data =ExcelData.toReadExcelData(sTestCaseID, Sheet);

	pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    
  	TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN(data[1]);
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS(data[2]);
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
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
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
//    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
//    _Searchclient.GoToUrl();
 

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
    

pages.SM457.Sale_Invoice2 _SaleInvoice = new    pages.SM457.Sale_Invoice2(driver);
//    TestModellerLogger.SetLastNodeGuid("2f331494-c0ec-443e-b258-bdf3d2f9d9fc");
//    _SaleInvoice.GoToUrl();

//    TestModellerLogger.SetLastNodeGuid("281121da-f0ce-4629-a4d1-0bc9b4260347");
//    _SaleInvoice.AssertUrl();
    

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
    _SaleInvoice.Enter_InvoiceDate(data[7]);
    

    TestModellerLogger.SetLastNodeGuid("294097b8-ccc5-4eb7-baec-1a26ca1364f0");
    _SaleInvoice.Select_IncomeType("Sale");
    

    TestModellerLogger.SetLastNodeGuid("5ccbf01b-65a3-47f5-b916-dab48aab691f");
    _SaleInvoice.Enter_Description(data[9]);
    

    TestModellerLogger.SetLastNodeGuid("73677a32-1892-47f6-9783-a1072478778a");
    _SaleInvoice.Enter_UnitPrice(data[10]);
    

    TestModellerLogger.SetLastNodeGuid("d810d5bf-a960-434c-9172-1671dd383495");
    _SaleInvoice.Enter_Quantity(data[11]);
    

    TestModellerLogger.SetLastNodeGuid("516c7236-f043-4de9-b128-99997ccf1604");
    _SaleInvoice.Select_VATRate(data[12]);
    

//    TestModellerLogger.SetLastNodeGuid("cb6d5101-0be0-4519-b1aa-5e71dcdfbef3");
//    _SaleInvoice.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("6aeae28b-fd85-4712-8710-18e4b190dd19");
    _SaleInvoice.Enter_Note(data[13]);
    

    TestModellerLogger.SetLastNodeGuid("2508d3fa-348f-48f2-914a-4d43591ded90");
    _SaleInvoice.Click_SaveButton();

    _SaleInvoice.GetSuccessText();
pages.SM457.saledasboard _saledasboard= new  pages.SM457.saledasboard(driver);
//TestModellerLogger.SetLastNodeGuid("7e28a082-b5cd-463d-86de-ebca3d9067b6");
//_saledasboard.GoToUrl();
//

TestModellerLogger.SetLastNodeGuid("6d02b2ac-e775-4904-954a-ef38f8931998");
_saledasboard.Select_Select_customer(data[14]);

TestModellerLogger.SetLastNodeGuid("914c514b-eec0-46fe-a8f5-9d8d7e056b79");
_saledasboard.Select_search_cate("Tran#");

//TestModellerLogger.SetLastNodeGuid("70b1bde3-d0ad-4960-af62-c02b0aa80340");
//_saledasboard.Enter_Enter_transcode("");


TestModellerLogger.SetLastNodeGuid("563fb128-954e-4474-bad9-254789e60b81");
_saledasboard.Click_Click_Update_btn();

//sm457.preview _preview = new sm457.preview(driver);
////TestModellerLogger.SetLastNodeGuid("58360469-e285-4b81-88e5-161658be4bbb");
////_preview.GoToUrl();
////
////
////TestModellerLogger.SetLastNodeGuid("ba5b548d-d4bc-40f8-b170-d1600beb12c6");
////_preview.AssertUrl();
//
//
//TestModellerLogger.SetLastNodeGuid("1c8fe61d-dd6a-4afb-b3bc-dbc9989b820c");
//_preview.Click_Clickeyeicon();
//
//
//TestModellerLogger.SetLastNodeGuid("74271fdb-c684-467b-9fb4-2789c62a2612");
//_preview.Click_save_icon();

pages.SM457.NewPreviewPage _NewPreviewPage = new pages.SM457.NewPreviewPage (driver);
//TestModellerLogger.SetLastNodeGuid("dbbb77d9-da5b-418b-8bf9-81bcb95327cf");
//_NewPreviewPage.GoToUrl();
//
//
//TestModellerLogger.SetLastNodeGuid("d7e4fdde-c2c7-46a8-83a5-5be45ffa1225");
//_NewPreviewPage.AssertUrl();


TestModellerLogger.SetLastNodeGuid("715cfaaf-aba7-40a9-82e6-410e09784e97");
_NewPreviewPage.Click_ClickOnPreview();


TestModellerLogger.SetLastNodeGuid("23d6006a-2648-4df5-a3f3-c2e17c157827");
_NewPreviewPage.Click_SaveButton();


TestModellerLogger.SetLastNodeGuid("54b70d53-1986-4341-b00c-5f332860cd9d");
_NewPreviewPage.Click_PDFDump();


TestModellerLogger.SetLastNodeGuid("c672a06c-43df-4da3-b0e6-c89aec1ad026");
_NewPreviewPage.Click_CancelButton();


TestModellerLogger.SetLastNodeGuid("ad68166f-4045-401c-85cf-3a60a429becd");
_NewPreviewPage.Click_ClickOnMail();
 
pages.SM457.mails _mails = new pages.SM457.mails(driver);
//TestModellerLogger.SetLastNodeGuid("a51e0f3b-19dd-45ae-9370-d3609e2e0894");
//_mails.GoToUrl();
//
//
//TestModellerLogger.SetLastNodeGuid("3660f942-cc68-4cef-bb82-82cb35bc37d8");
//_mails.AssertUrl();
//

TestModellerLogger.SetLastNodeGuid("42ab91d4-7379-4404-a11e-6a50d2ca8760");
_mails.Select_Select_InvoiceTemp(data[15]);


TestModellerLogger.SetLastNodeGuid("3a1cbf88-20ac-48ea-be7c-61c45d03bf6e");
_mails.Select_Email_Template(data[16]);


TestModellerLogger.SetLastNodeGuid("2192c6c5-80e8-48b1-8207-cd86f583f7c6");
_mails.Enter_Enter_mailid(data[17]);


TestModellerLogger.SetLastNodeGuid("9942e2fa-2b79-4968-876b-4883effef066");
_mails.Enter_Enter_Subject(data[18]);


TestModellerLogger.SetLastNodeGuid("f8d8b4d0-e489-4043-8848-c64ac08e4975");
_mails.Click_Sendbtn_clicked();


TestModellerLogger.SetLastNodeGuid("cff924d0-3f00-4dd0-abb5-64fbf61324ee");
_mails.Click_confirmation_msges();


   }
   @Test  (groups= {"saleinvoice","saleinvoice - saleinvoice1"})
   @TestModellerPath(guid = "ae051802-46ed-4137-96f3-524cd8e157fb")
   public void saleinvoice1GoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrl9() throws HeadlessException, IOException, AWTException, InvalidFormatException, InterruptedException
   {
       
	   sTestCaseID="TC9";
  	Sheet="sm457";
  	data =ExcelData.toReadExcelData(sTestCaseID, Sheet);

	pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();  
  	
  	TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN(data[1]);
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS(data[2]);
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
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
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
//    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
//    _Searchclient.GoToUrl();
 

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
    

pages.SM457.Sale_Invoice2 _SaleInvoice = new    pages.SM457.Sale_Invoice2(driver);
//    TestModellerLogger.SetLastNodeGuid("2f331494-c0ec-443e-b258-bdf3d2f9d9fc");
//    _SaleInvoice.GoToUrl();

//    TestModellerLogger.SetLastNodeGuid("281121da-f0ce-4629-a4d1-0bc9b4260347");
//    _SaleInvoice.AssertUrl();
    

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
    _SaleInvoice.Enter_InvoiceDate(data[7]);
    

    TestModellerLogger.SetLastNodeGuid("294097b8-ccc5-4eb7-baec-1a26ca1364f0");
    _SaleInvoice.Select_IncomeType("Sale");
    

    TestModellerLogger.SetLastNodeGuid("5ccbf01b-65a3-47f5-b916-dab48aab691f");
    _SaleInvoice.Enter_Description(data[9]);
    

    TestModellerLogger.SetLastNodeGuid("73677a32-1892-47f6-9783-a1072478778a");
    _SaleInvoice.Enter_UnitPrice(data[10]);
    

    TestModellerLogger.SetLastNodeGuid("d810d5bf-a960-434c-9172-1671dd383495");
    _SaleInvoice.Enter_Quantity(data[11]);
    

    TestModellerLogger.SetLastNodeGuid("516c7236-f043-4de9-b128-99997ccf1604");
    _SaleInvoice.Select_VATRate(data[12]);
    

//    TestModellerLogger.SetLastNodeGuid("cb6d5101-0be0-4519-b1aa-5e71dcdfbef3");
//    _SaleInvoice.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("6aeae28b-fd85-4712-8710-18e4b190dd19");
    _SaleInvoice.Enter_Note(data[13]);
    

    TestModellerLogger.SetLastNodeGuid("2508d3fa-348f-48f2-914a-4d43591ded90");
    _SaleInvoice.Click_SaveButton();
    _SaleInvoice.GetSuccessText();

pages.SM457.saledasboard _saledasboard= new  pages.SM457.saledasboard(driver);
//TestModellerLogger.SetLastNodeGuid("7e28a082-b5cd-463d-86de-ebca3d9067b6");
//_saledasboard.GoToUrl();
//

TestModellerLogger.SetLastNodeGuid("6d02b2ac-e775-4904-954a-ef38f8931998");
_saledasboard.Select_Select_customer(data[14]);

TestModellerLogger.SetLastNodeGuid("914c514b-eec0-46fe-a8f5-9d8d7e056b79");
_saledasboard.Select_search_cate("Tran#");

//TestModellerLogger.SetLastNodeGuid("70b1bde3-d0ad-4960-af62-c02b0aa80340");
//_saledasboard.Enter_Enter_transcode("");


TestModellerLogger.SetLastNodeGuid("563fb128-954e-4474-bad9-254789e60b81");
_saledasboard.Click_Click_Update_btn();

//sm457.preview _preview = new sm457.preview(driver);
////TestModellerLogger.SetLastNodeGuid("58360469-e285-4b81-88e5-161658be4bbb");
////_preview.GoToUrl();
////
////
////TestModellerLogger.SetLastNodeGuid("ba5b548d-d4bc-40f8-b170-d1600beb12c6");
////_preview.AssertUrl();
//
//
//TestModellerLogger.SetLastNodeGuid("1c8fe61d-dd6a-4afb-b3bc-dbc9989b820c");
//_preview.Click_Clickeyeicon();
//
//
//TestModellerLogger.SetLastNodeGuid("74271fdb-c684-467b-9fb4-2789c62a2612");
//_preview.Click_save_icon();

pages.SM457.NewPreviewPage _NewPreviewPage = new pages.SM457.NewPreviewPage (driver);
//TestModellerLogger.SetLastNodeGuid("dbbb77d9-da5b-418b-8bf9-81bcb95327cf");
//_NewPreviewPage.GoToUrl();
//
//
//TestModellerLogger.SetLastNodeGuid("d7e4fdde-c2c7-46a8-83a5-5be45ffa1225");
//_NewPreviewPage.AssertUrl();


TestModellerLogger.SetLastNodeGuid("715cfaaf-aba7-40a9-82e6-410e09784e97");
_NewPreviewPage.Click_ClickOnPreview();


TestModellerLogger.SetLastNodeGuid("23d6006a-2648-4df5-a3f3-c2e17c157827");
_NewPreviewPage.Click_SaveButton();


TestModellerLogger.SetLastNodeGuid("54b70d53-1986-4341-b00c-5f332860cd9d");
_NewPreviewPage.Click_PDFDump();


TestModellerLogger.SetLastNodeGuid("c672a06c-43df-4da3-b0e6-c89aec1ad026");
_NewPreviewPage.Click_CancelButton();


TestModellerLogger.SetLastNodeGuid("ad68166f-4045-401c-85cf-3a60a429becd");
_NewPreviewPage.Click_ClickOnMail();
 
pages.SM457.mails _mails = new pages.SM457.mails(driver);
//TestModellerLogger.SetLastNodeGuid("a51e0f3b-19dd-45ae-9370-d3609e2e0894");
//_mails.GoToUrl();
//
//
//TestModellerLogger.SetLastNodeGuid("3660f942-cc68-4cef-bb82-82cb35bc37d8");
//_mails.AssertUrl();
//

TestModellerLogger.SetLastNodeGuid("42ab91d4-7379-4404-a11e-6a50d2ca8760");
_mails.Select_Select_InvoiceTemp(data[15]);


TestModellerLogger.SetLastNodeGuid("3a1cbf88-20ac-48ea-be7c-61c45d03bf6e");
_mails.Select_Email_Template(data[16]);


TestModellerLogger.SetLastNodeGuid("2192c6c5-80e8-48b1-8207-cd86f583f7c6");
_mails.Enter_Enter_mailid(data[17]);


TestModellerLogger.SetLastNodeGuid("9942e2fa-2b79-4968-876b-4883effef066");
_mails.Enter_Enter_Subject(data[18]);


TestModellerLogger.SetLastNodeGuid("f8d8b4d0-e489-4043-8848-c64ac08e4975");
_mails.Click_Sendbtn_clicked();


TestModellerLogger.SetLastNodeGuid("cff924d0-3f00-4dd0-abb5-64fbf61324ee");
_mails.Click_confirmation_msges();

   	    
   }

   }*/




