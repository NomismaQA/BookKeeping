package VAT2.F2NOVAT;

import reports.TestNGListener;
import tests.TestBase;
import pages.nlogin;
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
import utilities.ExcelData;
import utilities.testmodeller.TestModellerLogger;

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/47c92856-78ee-4b1a-a893-c561a22d7ce2
@Test
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1183, profileId = 101073)
public class F2noVat_SaleInToReconcile_1 extends TestBase
{
	public String sTestCaseID=null;
	String[] data=null;
	String Sheet = null;
	
    
    @TestModellerPath(guid = "8c7c840e-6086-4f3d-b9ff-7b3f3724775c")
    public void GoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClickAgentsP1() throws InterruptedException, IOException, InvalidFormatException, HeadlessException, AWTException
    {
    	sTestCaseID="TC68";
       	Sheet="VAT2";
        data = ExcelData.toReadExcelData(sTestCaseID,Sheet);
        pages.nlogin _nlogin = new pages.nlogin(driver);
        
      
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN(data[1]);
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS(data[2]);
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);

    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);


    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.SaleInvoice _SaleInvoice = new pages.SaleInvoice(driver);

    

    TestModellerLogger.SetLastNodeGuid("38510c8a-daac-4ff8-83f3-54b176440787");
    _SaleInvoice.Click_SalesTab();
    

    TestModellerLogger.SetLastNodeGuid("2ce6ef22-01ee-4e82-bcb0-f7ce06badd95");
    _SaleInvoice.Click_NewButton();
    

    TestModellerLogger.SetLastNodeGuid("b605bf48-53b8-4f7f-a009-9ea8d59b69ba");
    _SaleInvoice.Click_NewInvoice();
    

    TestModellerLogger.SetLastNodeGuid("4e83b316-7f8b-49b7-a97f-e85cefb020f0");
    _SaleInvoice.Select_CustomerName(data[13]);
    

    TestModellerLogger.SetLastNodeGuid("f3edcc35-8d70-4902-81f0-9c5d760fac46");
    _SaleInvoice.Enter_InvoiceNo(data[15]);
    

    TestModellerLogger.SetLastNodeGuid("6f885a16-e34c-4d0d-914a-a726c1fa9617");
    _SaleInvoice.Enter_InvoiceDate(data[14]);
    

    TestModellerLogger.SetLastNodeGuid("294097b8-ccc5-4eb7-baec-1a26ca1364f0");
    _SaleInvoice.Select_IncomeType(data[16]);
    

    TestModellerLogger.SetLastNodeGuid("5ccbf01b-65a3-47f5-b916-dab48aab691f");
    _SaleInvoice.Enter_Description(data[17]);
    

    TestModellerLogger.SetLastNodeGuid("73677a32-1892-47f6-9783-a1072478778a");
    _SaleInvoice.Enter_UnitPrice(data[18]);
    

    TestModellerLogger.SetLastNodeGuid("d810d5bf-a960-434c-9172-1671dd383495");
    _SaleInvoice.Enter_Quantity(data[19]);
    

    TestModellerLogger.SetLastNodeGuid("516c7236-f043-4de9-b128-99997ccf1604");
    _SaleInvoice.Select_VATRate(data[20]);
    

//    TestModellerLogger.SetLastNodeGuid("cb6d5101-0be0-4519-b1aa-5e71dcdfbef3");
//    _SaleInvoice.Click_Tickformorelineitems();
    

 //   TestModellerLogger.SetLastNodeGuid("6aeae28b-fd85-4712-8710-18e4b190dd19");
 //   _SaleInvoice.Enter_Note(data[21]);
    

    TestModellerLogger.SetLastNodeGuid("2508d3fa-348f-48f2-914a-4d43591ded90");
    _SaleInvoice.Click_SaveButton();

    pages.bankmenu _bankmenu = new pages.bankmenu(driver);

     TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
     _bankmenu.Click_Bankingmenu();
     

     TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
     _bankmenu.Click_Newmenu();
    
     TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
     _bankmenu.Click_New_Transactionclick();

     pages.PartialReconciledCases.nBANKTRN _nBANKTRN = new pages.PartialReconciledCases.nBANKTRN(driver);
   

    TestModellerLogger.SetLastNodeGuid("32c9440758-2f86-4894-829c-0d5b167b4d77");
    _nBANKTRN.Select_BK_SELECT(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
    _nBANKTRN.Enter_NDate(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
    _nBANKTRN.Enter_n_desc(data[7]);
    

    TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
    _nBANKTRN.Enter_Recived_amt(data[8]);
    

    TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
    _nBANKTRN.Enter_spnt_amt(data[9]);
    

  TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
   _nBANKTRN.Select_Select_VATRate(data[10]);
    

    TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
    _nBANKTRN.Click_Select_Option1();
    

    TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
    _nBANKTRN.Enter_BOX2(data[11]);
    

//    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
//    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

pages.Reconcilation _Reconcilation = new pages.Reconcilation(driver);
//    TestModellerLogger.SetLastNodeGuid("fc1c2835-8b62-466d-8b91-b2d2b6852de5");
//    _Reconcilation.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("30a799ca-18ec-4e8a-9931-57fc4ea2c02b");
//    _Reconcilation.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5fa7c856-5fe6-458c-94fd-c74460dd9b1f");
    _Reconcilation.Click_Acntantleftmenu();
    

    TestModellerLogger.SetLastNodeGuid("2f750f49-e648-45ca-898e-d60728db5570");
    _Reconcilation.Click_plussign();
    

    TestModellerLogger.SetLastNodeGuid("a3808a66-3e56-4e52-b2c1-61b7d5d15b32");
    _Reconcilation.Select_SelectAccountType1(data[12]);
    

    TestModellerLogger.SetLastNodeGuid("2018e2d9-51c8-4e54-8424-0f5147db31d6");
    _Reconcilation.Select_SelectAccount1(data[13]);
    
    pages.PartialReconciledCases.PartialReconcilationLAtest _PartialReconcilationLAtest = new pages.PartialReconciledCases.PartialReconcilationLAtest(driver);
    //TestModellerLogger.SetLastNodeGuid("511bd3c6-4bfe-44f1-85bd-d9c919623efb");
    //_PartialReconcilationLAtest.GoToUrl();
    //
    //
    //TestModellerLogger.SetLastNodeGuid("6e247121-1606-4c0e-beb4-b3e6cb7495a3");
    //_PartialReconcilationLAtest.AssertUrl();


    TestModellerLogger.SetLastNodeGuid("af0c7fbd-9d1e-4a30-9e46-78b9d63e1c8f");
    _PartialReconcilationLAtest.Click_SelectALL();


    //TestModellerLogger.SetLastNodeGuid("d60148fa-f80f-4012-b7db-ab2180373216");
    //_PartialReconcilationLAtest.Click_ReconcileSelected();


    TestModellerLogger.SetLastNodeGuid("56eb2524-f022-46bb-bfc6-e57cfeaf10b8");
    _PartialReconcilationLAtest.Click_UngroupSelected();


    TestModellerLogger.SetLastNodeGuid("ca75e642-3957-4d56-af81-a254557876ea");
    _PartialReconcilationLAtest.Click_R1();


    TestModellerLogger.SetLastNodeGuid("4be1345f-a7ab-4379-ac1b-071bba6eebd1");
    _PartialReconcilationLAtest.Click_R2();


    TestModellerLogger.SetLastNodeGuid("0a7bb1d7-72ea-4dd0-9b74-37bf18c628a1");
    _PartialReconcilationLAtest.Click_ReconcileLink();


 
  
    
    }




   @TestModellerPath(guid = "6cb57d3d-4a0e-45f3-b5f2-ef11cf334916")
    public void GoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClickAgentsP2() throws InterruptedException, IOException, HeadlessException, AWTException, InvalidFormatException
    {
        
	   sTestCaseID="TC69";
      	Sheet="VAT2";
       data = ExcelData.toReadExcelData(sTestCaseID,Sheet);
       pages.nlogin _nlogin = new pages.nlogin(driver);
       TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
       _nlogin.GoToUrl();
       

//       TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//       _nlogin.AssertUrl();
       

       TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
       _nlogin.Enter_nLOGIN(data[1]);
       

       TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
       _nlogin.Enter_nPASS(data[2]);
       

       TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
       _nlogin.Click_Login();
       

   pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
//       TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
//       _AgentSearch.GoToUrl();
   //    

//       TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
//       _AgentSearch.AssertUrl();
       

       TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
       _AgentSearch.Click_Agents();
       

       TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
       _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
       

       TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
       _AgentSearch.Click_Search();
       

       TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
       _AgentSearch.Click__Nidhi1_();
       

   pages.Searchclient _Searchclient = new pages.Searchclient(driver);
//       TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
//       _Searchclient.GoToUrl();
   //    
   //
//       TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
//       _Searchclient.AssertUrl();
       

       TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
       _Searchclient.Click__Clients_();
       

       TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
       _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
       

       TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
       _Searchclient.Click_Searchbtn();
       

       TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
       _Searchclient.Click__NidhiEnt();
       

   pages.SaleInvoice _SaleInvoice = new pages.SaleInvoice(driver);
//       TestModellerLogger.SetLastNodeGuid("2f331494-c0ec-443e-b258-bdf3d2f9d9fc");
//       _SaleInvoice.GoToUrl();
   //    
   //
//       TestModellerLogger.SetLastNodeGuid("281121da-f0ce-4629-a4d1-0bc9b4260347");
//       _SaleInvoice.AssertUrl();
       

       TestModellerLogger.SetLastNodeGuid("38510c8a-daac-4ff8-83f3-54b176440787");
       _SaleInvoice.Click_SalesTab();
       

       TestModellerLogger.SetLastNodeGuid("2ce6ef22-01ee-4e82-bcb0-f7ce06badd95");
       _SaleInvoice.Click_NewButton();
       

       TestModellerLogger.SetLastNodeGuid("b605bf48-53b8-4f7f-a009-9ea8d59b69ba");
       _SaleInvoice.Click_NewInvoice();
       

       TestModellerLogger.SetLastNodeGuid("4e83b316-7f8b-49b7-a97f-e85cefb020f0");
       _SaleInvoice.Select_CustomerName(data[13]);
       

       TestModellerLogger.SetLastNodeGuid("f3edcc35-8d70-4902-81f0-9c5d760fac46");
       _SaleInvoice.Enter_InvoiceNo(data[15]);
       

       TestModellerLogger.SetLastNodeGuid("6f885a16-e34c-4d0d-914a-a726c1fa9617");
       _SaleInvoice.Enter_InvoiceDate(data[14]);
       

       TestModellerLogger.SetLastNodeGuid("294097b8-ccc5-4eb7-baec-1a26ca1364f0");
       _SaleInvoice.Select_IncomeType(data[16]);
       

       TestModellerLogger.SetLastNodeGuid("5ccbf01b-65a3-47f5-b916-dab48aab691f");
       _SaleInvoice.Enter_Description(data[17]);
       

       TestModellerLogger.SetLastNodeGuid("73677a32-1892-47f6-9783-a1072478778a");
       _SaleInvoice.Enter_UnitPrice(data[18]);
       

       TestModellerLogger.SetLastNodeGuid("d810d5bf-a960-434c-9172-1671dd383495");
       _SaleInvoice.Enter_Quantity(data[19]);
       

       TestModellerLogger.SetLastNodeGuid("516c7236-f043-4de9-b128-99997ccf1604");
       _SaleInvoice.Select_VATRate(data[20]);
       
   //
//       TestModellerLogger.SetLastNodeGuid("cb6d5101-0be0-4519-b1aa-5e71dcdfbef3");
//       _SaleInvoice.Click_Tickformorelineitems();
       

    //   TestModellerLogger.SetLastNodeGuid("6aeae28b-fd85-4712-8710-18e4b190dd19");
//       _SaleInvoice.Enter_Note(data[21]);
       

       TestModellerLogger.SetLastNodeGuid("2508d3fa-348f-48f2-914a-4d43591ded90");
       _SaleInvoice.Click_SaveButton();

   pages.bankmenu _bankmenu = new pages.bankmenu(driver);
   
       
       TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
       _bankmenu.Click_Bankingmenu();
       

       TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
       _bankmenu.Click_Newmenu();
       
       TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
       _bankmenu.Click_New_Transactionclick();

       pages.PartialReconciledCases.nBANKTRN _nBANKTRN = new pages.PartialReconciledCases.nBANKTRN(driver);

       TestModellerLogger.SetLastNodeGuid("32c9440758-2f86-4894-829c-0d5b167b4d77");
       _nBANKTRN.Select_BK_SELECT(data[5]);
       

       TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
       _nBANKTRN.Enter_NDate(data[6]);
       

       TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
       _nBANKTRN.Enter_n_desc(data[7]);
       

       TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
       _nBANKTRN.Enter_Recived_amt(data[8]);
       

       TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
       _nBANKTRN.Enter_spnt_amt(data[9]);
       

     TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
      _nBANKTRN.Select_Select_VATRate(data[10]);
       

       TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
       _nBANKTRN.Click_Select_Option1();
       

       TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
       _nBANKTRN.Enter_BOX2(data[11]);
       

//       TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
//       _nBANKTRN.Click__1400_DATA();
       

       TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
       _nBANKTRN.Click__Save_();
       

   pages.Reconcilation _Reconcilation = new pages.Reconcilation(driver);
//       TestModellerLogger.SetLastNodeGuid("fc1c2835-8b62-466d-8b91-b2d2b6852de5");
//       _Reconcilation.GoToUrl();
   //    
   //
//       TestModellerLogger.SetLastNodeGuid("30a799ca-18ec-4e8a-9931-57fc4ea2c02b");
//       _Reconcilation.AssertUrl();
       

       TestModellerLogger.SetLastNodeGuid("5fa7c856-5fe6-458c-94fd-c74460dd9b1f");
       _Reconcilation.Click_Acntantleftmenu();
       

       TestModellerLogger.SetLastNodeGuid("2f750f49-e648-45ca-898e-d60728db5570");
       _Reconcilation.Click_plussign();
       

       TestModellerLogger.SetLastNodeGuid("a3808a66-3e56-4e52-b2c1-61b7d5d15b32");
       _Reconcilation.Select_SelectAccountType1(data[12]);
       

       TestModellerLogger.SetLastNodeGuid("2018e2d9-51c8-4e54-8424-0f5147db31d6");
       _Reconcilation.Select_SelectAccount1(data[13]);
       

//       TestModellerLogger.SetLastNodeGuid("0892baec-0422-496a-93f9-1028cef59d2c");
//       _Reconcilation.Click_View_Reconciled_button1();


      

       pages.PartialReconciledCases.PartialReconcilationLAtest _PartialReconcilationLAtest = new pages.PartialReconciledCases.PartialReconcilationLAtest(driver);
       //TestModellerLogger.SetLastNodeGuid("511bd3c6-4bfe-44f1-85bd-d9c919623efb");
       //_PartialReconcilationLAtest.GoToUrl();
       //
       //
       //TestModellerLogger.SetLastNodeGuid("6e247121-1606-4c0e-beb4-b3e6cb7495a3");
       //_PartialReconcilationLAtest.AssertUrl();


       TestModellerLogger.SetLastNodeGuid("af0c7fbd-9d1e-4a30-9e46-78b9d63e1c8f");
       _PartialReconcilationLAtest.Click_SelectALL();


       //TestModellerLogger.SetLastNodeGuid("d60148fa-f80f-4012-b7db-ab2180373216");
       //_PartialReconcilationLAtest.Click_ReconcileSelected();


       TestModellerLogger.SetLastNodeGuid("56eb2524-f022-46bb-bfc6-e57cfeaf10b8");
       _PartialReconcilationLAtest.Click_UngroupSelected();


       TestModellerLogger.SetLastNodeGuid("ca75e642-3957-4d56-af81-a254557876ea");
       _PartialReconcilationLAtest.Click_R1();


       TestModellerLogger.SetLastNodeGuid("4be1345f-a7ab-4379-ac1b-071bba6eebd1");
       _PartialReconcilationLAtest.Click_R2();


       TestModellerLogger.SetLastNodeGuid("0a7bb1d7-72ea-4dd0-9b74-37bf18c628a1");
       _PartialReconcilationLAtest.Click_ReconcileLink();
       
    }

    @Test  (groups= {"SaleInToReconcile","SaleInToReconcile - Default Profile"})
    @TestModellerPath(guid = "61014dc1-dcc3-47fb-bb1e-81a966da499f")
    public void GoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClickAgentsP4() throws InterruptedException, IOException, HeadlessException, AWTException, InvalidFormatException
    {
        
    	sTestCaseID="TC70";
       	Sheet="VAT2";
        data = ExcelData.toReadExcelData(sTestCaseID,Sheet);
        pages.nlogin _nlogin = new pages.nlogin(driver);
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
        

    pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);

        

        TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
        _AgentSearch.Click_Agents();
        

        TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
        _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
        

        TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
        _AgentSearch.Click_Search();
        

        TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
        _AgentSearch.Click__Nidhi1_();
        

    pages.Searchclient _Searchclient = new pages.Searchclient(driver);

        

        TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
        _Searchclient.Click__Clients_();
        

        TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
        _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
        

        TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
        _Searchclient.Click_Searchbtn();
        

        TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
        _Searchclient.Click__NidhiEnt();
        

    pages.SaleInvoice _SaleInvoice = new pages.SaleInvoice(driver);


        TestModellerLogger.SetLastNodeGuid("38510c8a-daac-4ff8-83f3-54b176440787");
        _SaleInvoice.Click_SalesTab();
        

        TestModellerLogger.SetLastNodeGuid("2ce6ef22-01ee-4e82-bcb0-f7ce06badd95");
        _SaleInvoice.Click_NewButton();
        

        TestModellerLogger.SetLastNodeGuid("b605bf48-53b8-4f7f-a009-9ea8d59b69ba");
        _SaleInvoice.Click_NewInvoice();
        

        TestModellerLogger.SetLastNodeGuid("4e83b316-7f8b-49b7-a97f-e85cefb020f0");
        _SaleInvoice.Select_CustomerName(data[13]);
        

        TestModellerLogger.SetLastNodeGuid("f3edcc35-8d70-4902-81f0-9c5d760fac46");
        _SaleInvoice.Enter_InvoiceNo(data[15]);
        

        TestModellerLogger.SetLastNodeGuid("6f885a16-e34c-4d0d-914a-a726c1fa9617");
        _SaleInvoice.Enter_InvoiceDate(data[14]);
        

        TestModellerLogger.SetLastNodeGuid("294097b8-ccc5-4eb7-baec-1a26ca1364f0");
        _SaleInvoice.Select_IncomeType(data[16]);
        

        TestModellerLogger.SetLastNodeGuid("5ccbf01b-65a3-47f5-b916-dab48aab691f");
        _SaleInvoice.Enter_Description(data[17]);
        

        TestModellerLogger.SetLastNodeGuid("73677a32-1892-47f6-9783-a1072478778a");
        _SaleInvoice.Enter_UnitPrice(data[18]);
        

        TestModellerLogger.SetLastNodeGuid("d810d5bf-a960-434c-9172-1671dd383495");
        _SaleInvoice.Enter_Quantity(data[19]);
        

        TestModellerLogger.SetLastNodeGuid("516c7236-f043-4de9-b128-99997ccf1604");
        _SaleInvoice.Select_VATRate(data[20]);
        
    //
//        TestModellerLogger.SetLastNodeGuid("cb6d5101-0be0-4519-b1aa-5e71dcdfbef3");
//        _SaleInvoice.Click_Tickformorelineitems();
        

    //    TestModellerLogger.SetLastNodeGuid("6aeae28b-fd85-4712-8710-18e4b190dd19");
   //     _SaleInvoice.Enter_Note(data[21]);
        

        TestModellerLogger.SetLastNodeGuid("2508d3fa-348f-48f2-914a-4d43591ded90");
        _SaleInvoice.Click_SaveButton();

    pages.bankmenu _bankmenu = new pages.bankmenu(driver);
     
        
    //
//        TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
//        _bankmenu.AssertUrl();
    //    

        TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
        _bankmenu.Click_Bankingmenu();
        

        TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
        _bankmenu.Click_Newmenu();
        

TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
_bankmenu.Click_New_Transactionclick();

pages.PartialReconciledCases.nBANKTRN _nBANKTRN = new pages.PartialReconciledCases.nBANKTRN(driver);

        

//        TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
//        _nBANKTRN.AssertUrl();
    //    

        TestModellerLogger.SetLastNodeGuid("32c9440758-2f86-4894-829c-0d5b167b4d77");
        _nBANKTRN.Select_BK_SELECT(data[5]);
        

        TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
        _nBANKTRN.Enter_NDate(data[6]);
        

        TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
        _nBANKTRN.Enter_n_desc(data[7]);
        

        TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
        _nBANKTRN.Enter_Recived_amt(data[8]);
        

        TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
        _nBANKTRN.Enter_spnt_amt(data[9]);
        

      TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
       _nBANKTRN.Select_Select_VATRate(data[10]);
        

        TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
        _nBANKTRN.Click_Select_Option1();
        

        TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
        _nBANKTRN.Enter_BOX2(data[11]);
        

//        TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
//        _nBANKTRN.Click__1400_DATA();
        

        TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
        _nBANKTRN.Click__Save_();
        

    pages.Reconcilation _Reconcilation = new pages.Reconcilation(driver);
//        TestModellerLogger.SetLastNodeGuid("fc1c2835-8b62-466d-8b91-b2d2b6852de5");
//        _Reconcilation.GoToUrl();
    //    
    //
//        TestModellerLogger.SetLastNodeGuid("30a799ca-18ec-4e8a-9931-57fc4ea2c02b");
//        _Reconcilation.AssertUrl();
        

        TestModellerLogger.SetLastNodeGuid("5fa7c856-5fe6-458c-94fd-c74460dd9b1f");
        _Reconcilation.Click_Acntantleftmenu();
        

        TestModellerLogger.SetLastNodeGuid("2f750f49-e648-45ca-898e-d60728db5570");
        _Reconcilation.Click_plussign();
        

        TestModellerLogger.SetLastNodeGuid("a3808a66-3e56-4e52-b2c1-61b7d5d15b32");
        _Reconcilation.Select_SelectAccountType1(data[12]);
        

        TestModellerLogger.SetLastNodeGuid("2018e2d9-51c8-4e54-8424-0f5147db31d6");
        _Reconcilation.Select_SelectAccount1(data[13]);
        

//        TestModellerLogger.SetLastNodeGuid("0892baec-0422-496a-93f9-1028cef59d2c");
//        _Reconcilation.Click_View_Reconciled_button1();


       
        pages.PartialReconciledCases.PartialReconcilationLAtest _PartialReconcilationLAtest = new pages.PartialReconciledCases.PartialReconcilationLAtest(driver);
        //TestModellerLogger.SetLastNodeGuid("511bd3c6-4bfe-44f1-85bd-d9c919623efb");
        //_PartialReconcilationLAtest.GoToUrl();
        //
        //
        //TestModellerLogger.SetLastNodeGuid("6e247121-1606-4c0e-beb4-b3e6cb7495a3");
        //_PartialReconcilationLAtest.AssertUrl();


        TestModellerLogger.SetLastNodeGuid("af0c7fbd-9d1e-4a30-9e46-78b9d63e1c8f");
        _PartialReconcilationLAtest.Click_SelectALL();


        //TestModellerLogger.SetLastNodeGuid("d60148fa-f80f-4012-b7db-ab2180373216");
        //_PartialReconcilationLAtest.Click_ReconcileSelected();


        TestModellerLogger.SetLastNodeGuid("56eb2524-f022-46bb-bfc6-e57cfeaf10b8");
        _PartialReconcilationLAtest.Click_UngroupSelected();


        TestModellerLogger.SetLastNodeGuid("ca75e642-3957-4d56-af81-a254557876ea");
        _PartialReconcilationLAtest.Click_R1();


        TestModellerLogger.SetLastNodeGuid("4be1345f-a7ab-4379-ac1b-071bba6eebd1");
        _PartialReconcilationLAtest.Click_R2();


        TestModellerLogger.SetLastNodeGuid("0a7bb1d7-72ea-4dd0-9b74-37bf18c628a1");
        _PartialReconcilationLAtest.Click_ReconcileLink();

    }

    @Test  (groups= {"SaleInToReconcile","SaleInToReconcile - Default Profile"})
    @TestModellerPath(guid = "70501952-6587-4385-a613-e1be47be081b")
    public void GoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClickAgentsP5() throws InterruptedException, IOException, HeadlessException, AWTException, InvalidFormatException
    {
    	sTestCaseID="TC71";
       	Sheet="VAT2";
        data = ExcelData.toReadExcelData(sTestCaseID,Sheet);
        pages.nlogin _nlogin = new pages.nlogin(driver);
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
        

    pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);


        

        TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
        _AgentSearch.Click_Agents();
        

        TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
        _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
        

        TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
        _AgentSearch.Click_Search();
        

        TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
        _AgentSearch.Click__Nidhi1_();
        

    pages.Searchclient _Searchclient = new pages.Searchclient(driver);


        TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
        _Searchclient.Click__Clients_();
        

        TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
        _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
        

        TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
        _Searchclient.Click_Searchbtn();
        

        TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
        _Searchclient.Click__NidhiEnt();
        

    pages.SaleInvoice _SaleInvoice = new pages.SaleInvoice(driver);
//        TestModellerLogger.SetLastNodeGuid("2f331494-c0ec-443e-b258-bdf3d2f9d9fc");
//        _SaleInvoice.GoToUrl();
    //    
    //
//        TestModellerLogger.SetLastNodeGuid("281121da-f0ce-4629-a4d1-0bc9b4260347");
//        _SaleInvoice.AssertUrl();
        

        TestModellerLogger.SetLastNodeGuid("38510c8a-daac-4ff8-83f3-54b176440787");
        _SaleInvoice.Click_SalesTab();
        

        TestModellerLogger.SetLastNodeGuid("2ce6ef22-01ee-4e82-bcb0-f7ce06badd95");
        _SaleInvoice.Click_NewButton();
        

        TestModellerLogger.SetLastNodeGuid("b605bf48-53b8-4f7f-a009-9ea8d59b69ba");
        _SaleInvoice.Click_NewInvoice();
        

        TestModellerLogger.SetLastNodeGuid("4e83b316-7f8b-49b7-a97f-e85cefb020f0");
        _SaleInvoice.Select_CustomerName(data[13]);
        

        TestModellerLogger.SetLastNodeGuid("f3edcc35-8d70-4902-81f0-9c5d760fac46");
        _SaleInvoice.Enter_InvoiceNo(data[15]);
        

        TestModellerLogger.SetLastNodeGuid("6f885a16-e34c-4d0d-914a-a726c1fa9617");
        _SaleInvoice.Enter_InvoiceDate(data[14]);
        

        TestModellerLogger.SetLastNodeGuid("294097b8-ccc5-4eb7-baec-1a26ca1364f0");
        _SaleInvoice.Select_IncomeType(data[16]);
        

        TestModellerLogger.SetLastNodeGuid("5ccbf01b-65a3-47f5-b916-dab48aab691f");
        _SaleInvoice.Enter_Description(data[17]);
        

        TestModellerLogger.SetLastNodeGuid("73677a32-1892-47f6-9783-a1072478778a");
        _SaleInvoice.Enter_UnitPrice(data[18]);
        

        TestModellerLogger.SetLastNodeGuid("d810d5bf-a960-434c-9172-1671dd383495");
        _SaleInvoice.Enter_Quantity(data[19]);
        

        TestModellerLogger.SetLastNodeGuid("516c7236-f043-4de9-b128-99997ccf1604");
        _SaleInvoice.Select_VATRate(data[20]);
        
    //
//        TestModellerLogger.SetLastNodeGuid("cb6d5101-0be0-4519-b1aa-5e71dcdfbef3");
//        _SaleInvoice.Click_Tickformorelineitems();
        

    //    TestModellerLogger.SetLastNodeGuid("6aeae28b-fd85-4712-8710-18e4b190dd19");
    //    _SaleInvoice.Enter_Note(data[21]);
        

        TestModellerLogger.SetLastNodeGuid("2508d3fa-348f-48f2-914a-4d43591ded90");
        _SaleInvoice.Click_SaveButton();

    pages.bankmenu _bankmenu = new pages.bankmenu(driver);
   
    //
//        TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
//        _bankmenu.AssertUrl();
    //    

        TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
        _bankmenu.Click_Bankingmenu();
        

        TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
        _bankmenu.Click_Newmenu();
        
        TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
        _bankmenu.Click_New_Transactionclick();
        
        pages.PartialReconciledCases.nBANKTRN _nBANKTRN = new pages.PartialReconciledCases.nBANKTRN(driver);
  
        

//        TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
//        _nBANKTRN.AssertUrl();
    //    

        TestModellerLogger.SetLastNodeGuid("32c9440758-2f86-4894-829c-0d5b167b4d77");
        _nBANKTRN.Select_BK_SELECT(data[5]);
        

        TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
        _nBANKTRN.Enter_NDate(data[6]);
        

        TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
        _nBANKTRN.Enter_n_desc(data[7]);
        

        TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
        _nBANKTRN.Enter_Recived_amt(data[8]);
        

        TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
        _nBANKTRN.Enter_spnt_amt(data[9]);
        

      TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
       _nBANKTRN.Select_Select_VATRate(data[10]);
        

        TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
        _nBANKTRN.Click_Select_Option1();
        

        TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
        _nBANKTRN.Enter_BOX2(data[11]);
        

//        TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
//        _nBANKTRN.Click__1400_DATA();
        

        TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
        _nBANKTRN.Click__Save_();
        

    pages.Reconcilation _Reconcilation = new pages.Reconcilation(driver);
//        TestModellerLogger.SetLastNodeGuid("fc1c2835-8b62-466d-8b91-b2d2b6852de5");
//        _Reconcilation.GoToUrl();
    //    
    //
//        TestModellerLogger.SetLastNodeGuid("30a799ca-18ec-4e8a-9931-57fc4ea2c02b");
//        _Reconcilation.AssertUrl();
        

        TestModellerLogger.SetLastNodeGuid("5fa7c856-5fe6-458c-94fd-c74460dd9b1f");
        _Reconcilation.Click_Acntantleftmenu();
        

        TestModellerLogger.SetLastNodeGuid("2f750f49-e648-45ca-898e-d60728db5570");
        _Reconcilation.Click_plussign();
        

        TestModellerLogger.SetLastNodeGuid("a3808a66-3e56-4e52-b2c1-61b7d5d15b32");
        _Reconcilation.Select_SelectAccountType1(data[12]);
        

        TestModellerLogger.SetLastNodeGuid("2018e2d9-51c8-4e54-8424-0f5147db31d6");
        _Reconcilation.Select_SelectAccount1(data[13]);
        

//        TestModellerLogger.SetLastNodeGuid("0892baec-0422-496a-93f9-1028cef59d2c");
//        _Reconcilation.Click_View_Reconciled_button1();


        pages.PartialReconciledCases.PartialReconcilationLAtest _PartialReconcilationLAtest = new pages.PartialReconciledCases.PartialReconcilationLAtest(driver);
        //TestModellerLogger.SetLastNodeGuid("511bd3c6-4bfe-44f1-85bd-d9c919623efb");
        //_PartialReconcilationLAtest.GoToUrl();
        //
        //
        //TestModellerLogger.SetLastNodeGuid("6e247121-1606-4c0e-beb4-b3e6cb7495a3");
        //_PartialReconcilationLAtest.AssertUrl();


        TestModellerLogger.SetLastNodeGuid("af0c7fbd-9d1e-4a30-9e46-78b9d63e1c8f");
        _PartialReconcilationLAtest.Click_SelectALL();


        //TestModellerLogger.SetLastNodeGuid("d60148fa-f80f-4012-b7db-ab2180373216");
        //_PartialReconcilationLAtest.Click_ReconcileSelected();


        TestModellerLogger.SetLastNodeGuid("56eb2524-f022-46bb-bfc6-e57cfeaf10b8");
        _PartialReconcilationLAtest.Click_UngroupSelected();


        TestModellerLogger.SetLastNodeGuid("ca75e642-3957-4d56-af81-a254557876ea");
        _PartialReconcilationLAtest.Click_R1();


        TestModellerLogger.SetLastNodeGuid("4be1345f-a7ab-4379-ac1b-071bba6eebd1");
        _PartialReconcilationLAtest.Click_R2();


        TestModellerLogger.SetLastNodeGuid("0a7bb1d7-72ea-4dd0-9b74-37bf18c628a1");
        _PartialReconcilationLAtest.Click_ReconcileLink();


    }

    @Test  (groups= {"SaleInToReconcile","SaleInToReconcile - Default Profile"})
    @TestModellerPath(guid = "7bcbc9d5-95fd-476f-8583-90d5c3eb232d")
    public void GoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClickAgentsP6() throws InterruptedException, IOException, HeadlessException, AWTException, InvalidFormatException
    {
        
    	sTestCaseID="TC72";
       	Sheet="VAT2";
        data = ExcelData.toReadExcelData(sTestCaseID,Sheet);
        pages.nlogin _nlogin = new pages.nlogin(driver);
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
    //    
    //
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
        

    pages.SaleInvoice _SaleInvoice = new pages.SaleInvoice(driver);
//        TestModellerLogger.SetLastNodeGuid("2f331494-c0ec-443e-b258-bdf3d2f9d9fc");
//        _SaleInvoice.GoToUrl();
    //    
    //
//        TestModellerLogger.SetLastNodeGuid("281121da-f0ce-4629-a4d1-0bc9b4260347");
//        _SaleInvoice.AssertUrl();
        

        TestModellerLogger.SetLastNodeGuid("38510c8a-daac-4ff8-83f3-54b176440787");
        _SaleInvoice.Click_SalesTab();
        

        TestModellerLogger.SetLastNodeGuid("2ce6ef22-01ee-4e82-bcb0-f7ce06badd95");
        _SaleInvoice.Click_NewButton();
        

        TestModellerLogger.SetLastNodeGuid("b605bf48-53b8-4f7f-a009-9ea8d59b69ba");
        _SaleInvoice.Click_NewInvoice();
        

        TestModellerLogger.SetLastNodeGuid("4e83b316-7f8b-49b7-a97f-e85cefb020f0");
        _SaleInvoice.Select_CustomerName(data[13]);
        

        TestModellerLogger.SetLastNodeGuid("f3edcc35-8d70-4902-81f0-9c5d760fac46");
        _SaleInvoice.Enter_InvoiceNo(data[15]);
        

        TestModellerLogger.SetLastNodeGuid("6f885a16-e34c-4d0d-914a-a726c1fa9617");
        _SaleInvoice.Enter_InvoiceDate(data[14]);
        

        TestModellerLogger.SetLastNodeGuid("294097b8-ccc5-4eb7-baec-1a26ca1364f0");
        _SaleInvoice.Select_IncomeType(data[16]);
        

        TestModellerLogger.SetLastNodeGuid("5ccbf01b-65a3-47f5-b916-dab48aab691f");
        _SaleInvoice.Enter_Description(data[17]);
        

        TestModellerLogger.SetLastNodeGuid("73677a32-1892-47f6-9783-a1072478778a");
        _SaleInvoice.Enter_UnitPrice(data[18]);
        

        TestModellerLogger.SetLastNodeGuid("d810d5bf-a960-434c-9172-1671dd383495");
        _SaleInvoice.Enter_Quantity(data[19]);
        

        TestModellerLogger.SetLastNodeGuid("516c7236-f043-4de9-b128-99997ccf1604");
        _SaleInvoice.Select_VATRate(data[20]);
        
    //
//        TestModellerLogger.SetLastNodeGuid("cb6d5101-0be0-4519-b1aa-5e71dcdfbef3");
//        _SaleInvoice.Click_Tickformorelineitems();
        

 //       TestModellerLogger.SetLastNodeGuid("6aeae28b-fd85-4712-8710-18e4b190dd19");
   //     _SaleInvoice.Enter_Note(data[21]);
        

        TestModellerLogger.SetLastNodeGuid("2508d3fa-348f-48f2-914a-4d43591ded90");
        _SaleInvoice.Click_SaveButton();

    pages.bankmenu _bankmenu = new pages.bankmenu(driver);

        TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
        _bankmenu.Click_Bankingmenu();
        

        TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
        _bankmenu.Click_Newmenu();
        
        TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
        _bankmenu.Click_New_Transactionclick();
        
        pages.PartialReconciledCases.nBANKTRN _nBANKTRN = new pages.PartialReconciledCases.nBANKTRN(driver);

        TestModellerLogger.SetLastNodeGuid("32c9440758-2f86-4894-829c-0d5b167b4d77");
        _nBANKTRN.Select_BK_SELECT(data[5]);
        

        TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
        _nBANKTRN.Enter_NDate(data[6]);
        

        TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
        _nBANKTRN.Enter_n_desc(data[7]);
        

        TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
        _nBANKTRN.Enter_Recived_amt(data[8]);
        

        TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
        _nBANKTRN.Enter_spnt_amt(data[9]);
        

      TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
       _nBANKTRN.Select_Select_VATRate(data[10]);
        

        TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
        _nBANKTRN.Click_Select_Option1();
        

        TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
        _nBANKTRN.Enter_BOX2(data[11]);
        

//        TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
//        _nBANKTRN.Click__1400_DATA();
        

        TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
        _nBANKTRN.Click__Save_();
        

    pages.Reconcilation _Reconcilation = new pages.Reconcilation(driver);

        

        TestModellerLogger.SetLastNodeGuid("5fa7c856-5fe6-458c-94fd-c74460dd9b1f");
        _Reconcilation.Click_Acntantleftmenu();
        

        TestModellerLogger.SetLastNodeGuid("2f750f49-e648-45ca-898e-d60728db5570");
        _Reconcilation.Click_plussign();
        

        TestModellerLogger.SetLastNodeGuid("a3808a66-3e56-4e52-b2c1-61b7d5d15b32");
        _Reconcilation.Select_SelectAccountType1(data[12]);
        

        TestModellerLogger.SetLastNodeGuid("2018e2d9-51c8-4e54-8424-0f5147db31d6");
        _Reconcilation.Select_SelectAccount1(data[13]);
        

//        TestModellerLogger.SetLastNodeGuid("0892baec-0422-496a-93f9-1028cef59d2c");
//        _Reconcilation.Click_View_Reconciled_button1();


        pages.PartialReconciledCases.PartialReconcilationLAtest _PartialReconcilationLAtest = new pages.PartialReconciledCases.PartialReconcilationLAtest(driver);
        //TestModellerLogger.SetLastNodeGuid("511bd3c6-4bfe-44f1-85bd-d9c919623efb");
        //_PartialReconcilationLAtest.GoToUrl();
        //
        //
        //TestModellerLogger.SetLastNodeGuid("6e247121-1606-4c0e-beb4-b3e6cb7495a3");
        //_PartialReconcilationLAtest.AssertUrl();


        TestModellerLogger.SetLastNodeGuid("af0c7fbd-9d1e-4a30-9e46-78b9d63e1c8f");
        _PartialReconcilationLAtest.Click_SelectALL();


        //TestModellerLogger.SetLastNodeGuid("d60148fa-f80f-4012-b7db-ab2180373216");
        //_PartialReconcilationLAtest.Click_ReconcileSelected();


        TestModellerLogger.SetLastNodeGuid("56eb2524-f022-46bb-bfc6-e57cfeaf10b8");
        _PartialReconcilationLAtest.Click_UngroupSelected();


        TestModellerLogger.SetLastNodeGuid("ca75e642-3957-4d56-af81-a254557876ea");
        _PartialReconcilationLAtest.Click_R1();


        TestModellerLogger.SetLastNodeGuid("4be1345f-a7ab-4379-ac1b-071bba6eebd1");
        _PartialReconcilationLAtest.Click_R2();


        TestModellerLogger.SetLastNodeGuid("0a7bb1d7-72ea-4dd0-9b74-37bf18c628a1");
        _PartialReconcilationLAtest.Click_ReconcileLink();

    }

    @Test  (groups= {"SaleInToReconcile","SaleInToReconcile - Default Profile"})
    @TestModellerPath(guid = "e0a24dbb-8b0f-4d96-9d24-7a2ff2feb0fb")
    public void GoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClickAgentsP7() throws InterruptedException, IOException, HeadlessException, AWTException, InvalidFormatException
    {
    	sTestCaseID="TC73";
       	Sheet="VAT2";
        data = ExcelData.toReadExcelData(sTestCaseID,Sheet);
        pages.nlogin _nlogin = new pages.nlogin(driver);
        
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
    //    
    //
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
        

    pages.SaleInvoice _SaleInvoice = new pages.SaleInvoice(driver);
//        TestModellerLogger.SetLastNodeGuid("2f331494-c0ec-443e-b258-bdf3d2f9d9fc");
//        _SaleInvoice.GoToUrl();
    //    
    //
//        TestModellerLogger.SetLastNodeGuid("281121da-f0ce-4629-a4d1-0bc9b4260347");
//        _SaleInvoice.AssertUrl();
        

        TestModellerLogger.SetLastNodeGuid("38510c8a-daac-4ff8-83f3-54b176440787");
        _SaleInvoice.Click_SalesTab();
        

        TestModellerLogger.SetLastNodeGuid("2ce6ef22-01ee-4e82-bcb0-f7ce06badd95");
        _SaleInvoice.Click_NewButton();
        

        TestModellerLogger.SetLastNodeGuid("b605bf48-53b8-4f7f-a009-9ea8d59b69ba");
        _SaleInvoice.Click_NewInvoice();
        

        TestModellerLogger.SetLastNodeGuid("4e83b316-7f8b-49b7-a97f-e85cefb020f0");
        _SaleInvoice.Select_CustomerName(data[13]);
        

        TestModellerLogger.SetLastNodeGuid("f3edcc35-8d70-4902-81f0-9c5d760fac46");
        _SaleInvoice.Enter_InvoiceNo(data[15]);
        

        TestModellerLogger.SetLastNodeGuid("6f885a16-e34c-4d0d-914a-a726c1fa9617");
        _SaleInvoice.Enter_InvoiceDate(data[14]);
        

        TestModellerLogger.SetLastNodeGuid("294097b8-ccc5-4eb7-baec-1a26ca1364f0");
        _SaleInvoice.Select_IncomeType(data[16]);
        

        TestModellerLogger.SetLastNodeGuid("5ccbf01b-65a3-47f5-b916-dab48aab691f");
        _SaleInvoice.Enter_Description(data[17]);
        

        TestModellerLogger.SetLastNodeGuid("73677a32-1892-47f6-9783-a1072478778a");
        _SaleInvoice.Enter_UnitPrice(data[18]);
        

        TestModellerLogger.SetLastNodeGuid("d810d5bf-a960-434c-9172-1671dd383495");
        _SaleInvoice.Enter_Quantity(data[19]);
        

        TestModellerLogger.SetLastNodeGuid("516c7236-f043-4de9-b128-99997ccf1604");
        _SaleInvoice.Select_VATRate(data[20]);
        
    //
//        TestModellerLogger.SetLastNodeGuid("cb6d5101-0be0-4519-b1aa-5e71dcdfbef3");
//        _SaleInvoice.Click_Tickformorelineitems();
        

  //      TestModellerLogger.SetLastNodeGuid("6aeae28b-fd85-4712-8710-18e4b190dd19");
 //       _SaleInvoice.Enter_Note(data[21]);
        

        TestModellerLogger.SetLastNodeGuid("2508d3fa-348f-48f2-914a-4d43591ded90");
        _SaleInvoice.Click_SaveButton();

    pages.bankmenu _bankmenu = new pages.bankmenu(driver);

        TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
        _bankmenu.Click_Bankingmenu();
        

        TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
        _bankmenu.Click_Newmenu();
        
        TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
        _bankmenu.Click_New_Transactionclick();

        pages.PartialReconciledCases.nBANKTRN _nBANKTRN = new pages.PartialReconciledCases.nBANKTRN(driver);


        TestModellerLogger.SetLastNodeGuid("32c9440758-2f86-4894-829c-0d5b167b4d77");
        _nBANKTRN.Select_BK_SELECT(data[5]);
        

        TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
        _nBANKTRN.Enter_NDate(data[6]);
        

        TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
        _nBANKTRN.Enter_n_desc(data[7]);
        

        TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
        _nBANKTRN.Enter_Recived_amt(data[8]);
        

        TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
        _nBANKTRN.Enter_spnt_amt(data[9]);
        

      TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
       _nBANKTRN.Select_Select_VATRate(data[10]);
        

        TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
        _nBANKTRN.Click_Select_Option1();
        

        TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
        _nBANKTRN.Enter_BOX2(data[11]);
        

//        TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
//        _nBANKTRN.Click__1400_DATA();
        

        TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
        _nBANKTRN.Click__Save_();
        

    pages.Reconcilation _Reconcilation = new pages.Reconcilation(driver);


        TestModellerLogger.SetLastNodeGuid("5fa7c856-5fe6-458c-94fd-c74460dd9b1f");
        _Reconcilation.Click_Acntantleftmenu();
        

        TestModellerLogger.SetLastNodeGuid("2f750f49-e648-45ca-898e-d60728db5570");
        _Reconcilation.Click_plussign();
        

        TestModellerLogger.SetLastNodeGuid("a3808a66-3e56-4e52-b2c1-61b7d5d15b32");
        _Reconcilation.Select_SelectAccountType1(data[12]);
        

        TestModellerLogger.SetLastNodeGuid("2018e2d9-51c8-4e54-8424-0f5147db31d6");
        _Reconcilation.Select_SelectAccount1(data[13]);
        

//        TestModellerLogger.SetLastNodeGuid("0892baec-0422-496a-93f9-1028cef59d2c");
//        _Reconcilation.Click_View_Reconciled_button1();


        pages.PartialReconciledCases.PartialReconcilationLAtest _PartialReconcilationLAtest = new pages.PartialReconciledCases.PartialReconcilationLAtest(driver);
        //TestModellerLogger.SetLastNodeGuid("511bd3c6-4bfe-44f1-85bd-d9c919623efb");
        //_PartialReconcilationLAtest.GoToUrl();
        //
        //
        //TestModellerLogger.SetLastNodeGuid("6e247121-1606-4c0e-beb4-b3e6cb7495a3");
        //_PartialReconcilationLAtest.AssertUrl();


        TestModellerLogger.SetLastNodeGuid("af0c7fbd-9d1e-4a30-9e46-78b9d63e1c8f");
        _PartialReconcilationLAtest.Click_SelectALL();


        //TestModellerLogger.SetLastNodeGuid("d60148fa-f80f-4012-b7db-ab2180373216");
        //_PartialReconcilationLAtest.Click_ReconcileSelected();


        TestModellerLogger.SetLastNodeGuid("56eb2524-f022-46bb-bfc6-e57cfeaf10b8");
        _PartialReconcilationLAtest.Click_UngroupSelected();


        TestModellerLogger.SetLastNodeGuid("ca75e642-3957-4d56-af81-a254557876ea");
        _PartialReconcilationLAtest.Click_R1();


        TestModellerLogger.SetLastNodeGuid("4be1345f-a7ab-4379-ac1b-071bba6eebd1");
        _PartialReconcilationLAtest.Click_R2();


        TestModellerLogger.SetLastNodeGuid("0a7bb1d7-72ea-4dd0-9b74-37bf18c628a1");
        _PartialReconcilationLAtest.Click_ReconcileLink();

    }
}
/*
    @Test  (groups= {"SaleInToReconcile","SaleInToReconcile - Default Profile"})
    @TestModellerPath(guid = "dd3e1164-fe76-4ce1-8939-e1c6b4f030ba")
    public void GoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClickAgentsP8() throws InterruptedException, IOException
    {
    	sTestCaseID="TC6";
       	Sheet="Sheet1";
        data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
        
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
    //    
    //
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
        

    pages.SaleInvoice _SaleInvoice = new pages.SaleInvoice(driver);
//        TestModellerLogger.SetLastNodeGuid("2f331494-c0ec-443e-b258-bdf3d2f9d9fc");
//        _SaleInvoice.GoToUrl();
    //    
    //
//        TestModellerLogger.SetLastNodeGuid("281121da-f0ce-4629-a4d1-0bc9b4260347");
//        _SaleInvoice.AssertUrl();
        

        TestModellerLogger.SetLastNodeGuid("38510c8a-daac-4ff8-83f3-54b176440787");
        _SaleInvoice.Click_SalesTab();
        

        TestModellerLogger.SetLastNodeGuid("2ce6ef22-01ee-4e82-bcb0-f7ce06badd95");
        _SaleInvoice.Click_NewButton();
        

        TestModellerLogger.SetLastNodeGuid("b605bf48-53b8-4f7f-a009-9ea8d59b69ba");
        _SaleInvoice.Click_NewInvoice();
        

        TestModellerLogger.SetLastNodeGuid("4e83b316-7f8b-49b7-a97f-e85cefb020f0");
        _SaleInvoice.Select_CustomerName(data[13]);
        

        TestModellerLogger.SetLastNodeGuid("f3edcc35-8d70-4902-81f0-9c5d760fac46");
        _SaleInvoice.Enter_InvoiceNo(data[15]);
        

        TestModellerLogger.SetLastNodeGuid("6f885a16-e34c-4d0d-914a-a726c1fa9617");
        _SaleInvoice.Enter_InvoiceDate(data[14]);
        

        TestModellerLogger.SetLastNodeGuid("294097b8-ccc5-4eb7-baec-1a26ca1364f0");
        _SaleInvoice.Select_IncomeType(data[16]);
        

        TestModellerLogger.SetLastNodeGuid("5ccbf01b-65a3-47f5-b916-dab48aab691f");
        _SaleInvoice.Enter_Description(data[17]);
        

        TestModellerLogger.SetLastNodeGuid("73677a32-1892-47f6-9783-a1072478778a");
        _SaleInvoice.Enter_UnitPrice(data[18]);
        

        TestModellerLogger.SetLastNodeGuid("d810d5bf-a960-434c-9172-1671dd383495");
        _SaleInvoice.Enter_Quantity(data[19]);
        

        TestModellerLogger.SetLastNodeGuid("516c7236-f043-4de9-b128-99997ccf1604");
        _SaleInvoice.Select_VATRate(data[20]);
        
    //
//        TestModellerLogger.SetLastNodeGuid("cb6d5101-0be0-4519-b1aa-5e71dcdfbef3");
//        _SaleInvoice.Click_Tickformorelineitems();
        

        TestModellerLogger.SetLastNodeGuid("6aeae28b-fd85-4712-8710-18e4b190dd19");
        _SaleInvoice.Enter_Note(data[21]);
        

        TestModellerLogger.SetLastNodeGuid("2508d3fa-348f-48f2-914a-4d43591ded90");
        _SaleInvoice.Click_SaveButton();

    pages.bankmenu _bankmenu = new pages.bankmenu(driver);
       TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
        _bankmenu.GoToUrl();
        
    //
//        TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
//        _bankmenu.AssertUrl();
    //    

        TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
        _bankmenu.Click_Bankingmenu();
        

        TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
        _bankmenu.Click_Newmenu();
        

    pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
     TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
        _nBANKTRN.GoToUrl();
        

//        TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
//        _nBANKTRN.AssertUrl();
    //    

        TestModellerLogger.SetLastNodeGuid("32c9440758-2f86-4894-829c-0d5b167b4d77");
        _nBANKTRN.Select_BK_SELECT(data[5]);
        

        TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
        _nBANKTRN.Enter_NDate(data[6]);
        

        TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
        _nBANKTRN.Enter_n_desc(data[7]);
        

        TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
        _nBANKTRN.Enter_Recived_amt(data[8]);
        

        TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
        _nBANKTRN.Enter_spnt_amt(data[9]);
        

      TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
       _nBANKTRN.Select_Select_VATRate(data[10]);
        

        TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
        _nBANKTRN.Click_Select_Option1();
        

        TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
        _nBANKTRN.Enter_BOX2(data[11]);
        

//        TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
//        _nBANKTRN.Click__1400_DATA();
        

        TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
        _nBANKTRN.Click__Save_();
        

    pages.Reconcilation _Reconcilation = new pages.Reconcilation(driver);
//        TestModellerLogger.SetLastNodeGuid("fc1c2835-8b62-466d-8b91-b2d2b6852de5");
//        _Reconcilation.GoToUrl();
    //    
    //
//        TestModellerLogger.SetLastNodeGuid("30a799ca-18ec-4e8a-9931-57fc4ea2c02b");
//        _Reconcilation.AssertUrl();
        

        TestModellerLogger.SetLastNodeGuid("5fa7c856-5fe6-458c-94fd-c74460dd9b1f");
        _Reconcilation.Click_Acntantleftmenu();
        

        TestModellerLogger.SetLastNodeGuid("2f750f49-e648-45ca-898e-d60728db5570");
        _Reconcilation.Click_plussign();
        

        TestModellerLogger.SetLastNodeGuid("a3808a66-3e56-4e52-b2c1-61b7d5d15b32");
        _Reconcilation.Select_SelectAccountType1("Customer");
        

        TestModellerLogger.SetLastNodeGuid("2018e2d9-51c8-4e54-8424-0f5147db31d6");
        _Reconcilation.Select_SelectAccount1("Nidhis");
        

//        TestModellerLogger.SetLastNodeGuid("0892baec-0422-496a-93f9-1028cef59d2c");
//        _Reconcilation.Click_View_Reconciled_button1();


     pages.Reconsilecount _Reconsilecount = new pages.Reconsilecount(driver);
//        TestModellerLogger.SetLastNodeGuid("20ec992d-e923-4cd2-946b-1f6e59b73bf6");
//        _Reconsilecount.GoToUrl();
     pages.ungroup _ungroup = new pages.ungroup(driver);

     TestModellerLogger.SetLastNodeGuid("8579422c-5a13-4d28-bcdb-80684455e0ac");
     _ungroup.Click_selectallcheckbbox();
     

     TestModellerLogger.SetLastNodeGuid("e8d9d338-eb30-4309-96e4-dc0de1ba572c");
     _ungroup.Click_Ungroup_linkselected();

        TestModellerLogger.SetLastNodeGuid("778b3b22-188b-4954-8194-ffafa2c2d9c2");
        _Reconsilecount.Click_R1();
        
        

       TestModellerLogger.SetLastNodeGuid("0fc72130-6b3a-4342-9d0e-19804563923c");
        _Reconsilecount.Click_R2();
        
    

    }
    /*

    @Test  (groups= {"SaleInToReconcile","SaleInToReconcile - Default Profile"})
    @TestModellerPath(guid = "f3f33e29-1cf2-42e1-b7eb-e40e2a9271e9")
    public void GoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClickAgentsP9()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("pWhuMuCYzi");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
    _AgentSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("doloremque");
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Johnson, Hermann and Bahringer");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.SaleInvoice _SaleInvoice = new pages.SaleInvoice(driver);
    TestModellerLogger.SetLastNodeGuid("2f331494-c0ec-443e-b258-bdf3d2f9d9fc");
    _SaleInvoice.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("281121da-f0ce-4629-a4d1-0bc9b4260347");
    _SaleInvoice.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("38510c8a-daac-4ff8-83f3-54b176440787");
    _SaleInvoice.Click_SalesTab();
    

    TestModellerLogger.SetLastNodeGuid("2ce6ef22-01ee-4e82-bcb0-f7ce06badd95");
    _SaleInvoice.Click_NewButton();
    

    TestModellerLogger.SetLastNodeGuid("b605bf48-53b8-4f7f-a009-9ea8d59b69ba");
    _SaleInvoice.Click_NewInvoice();
    

    TestModellerLogger.SetLastNodeGuid("4e83b316-7f8b-49b7-a97f-e85cefb020f0");
    _SaleInvoice.Select_CustomerName("nid");
    

    TestModellerLogger.SetLastNodeGuid("f3edcc35-8d70-4902-81f0-9c5d760fac46");
    _SaleInvoice.Enter_InvoiceNo("");
    

    TestModellerLogger.SetLastNodeGuid("6f885a16-e34c-4d0d-914a-a726c1fa9617");
    _SaleInvoice.Enter_InvoiceDate("44266");
    

    TestModellerLogger.SetLastNodeGuid("294097b8-ccc5-4eb7-baec-1a26ca1364f0");
    _SaleInvoice.Select_IncomeType("");
    

    TestModellerLogger.SetLastNodeGuid("5ccbf01b-65a3-47f5-b916-dab48aab691f");
    _SaleInvoice.Enter_Description("Accusantium in quo vel numquam ipsum veniam ea.
Autem sapiente perferendis sint.
At molestiae sint quaerat quidem nemo.
Laboriosam rerum iste quo consequuntur nihil est veritatis voluptatem.
Laborum et quia iste quasi.
Hic nobis rerum aut consequuntur id est voluptate dolores.
Deleniti qui pariatur enim nesciunt porro porro voluptates.
Eligendi minima reiciendis sunt placeat molestias exercitationem ut.
Ut non quod.
Repellendus magni similique sunt facere nihil harum id aut voluptatem.");
    

    TestModellerLogger.SetLastNodeGuid("73677a32-1892-47f6-9783-a1072478778a");
    _SaleInvoice.Enter_UnitPrice("");
    

    TestModellerLogger.SetLastNodeGuid("d810d5bf-a960-434c-9172-1671dd383495");
    _SaleInvoice.Enter_Quantity("");
    

    TestModellerLogger.SetLastNodeGuid("516c7236-f043-4de9-b128-99997ccf1604");
    _SaleInvoice.Select_VATRate("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("cb6d5101-0be0-4519-b1aa-5e71dcdfbef3");
    _SaleInvoice.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("6aeae28b-fd85-4712-8710-18e4b190dd19");
    _SaleInvoice.Enter_Note("");
    

    TestModellerLogger.SetLastNodeGuid("2508d3fa-348f-48f2-914a-4d43591ded90");
    _SaleInvoice.Click_SaveButton();
    

    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("TzpFw5acM6");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
    _AgentSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("nihil");
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Kreiger LLC");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
    _bankmenu.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
    _bankmenu.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
    _bankmenu.Click_Bankingmenu();
    

    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
    _bankmenu.Click_Newmenu();
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
    _nBANKTRN.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
    _nBANKTRN.Select_BK_SELECT("nidhibank");
    

    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
    _nBANKTRN.Enter_NDate("44266");
    

    TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
    _nBANKTRN.Enter_n_desc("");
    

    TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
    _nBANKTRN.Enter_Recived_amt("");
    

    TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
    _nBANKTRN.Enter_spnt_amt("");
    

    TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
    _nBANKTRN.Select_Select_VATRate("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
    _nBANKTRN.Click_Select_Option1();
    

    TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
    _nBANKTRN.Enter_BOX2("");
    

    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

pages.Reconcilation _Reconcilation = new pages.Reconcilation(driver);
    TestModellerLogger.SetLastNodeGuid("fc1c2835-8b62-466d-8b91-b2d2b6852de5");
    _Reconcilation.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("30a799ca-18ec-4e8a-9931-57fc4ea2c02b");
    _Reconcilation.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5fa7c856-5fe6-458c-94fd-c74460dd9b1f");
    _Reconcilation.Click_Acntantleftmenu();
    

    TestModellerLogger.SetLastNodeGuid("2f750f49-e648-45ca-898e-d60728db5570");
    _Reconcilation.Click_plussign();
    

    TestModellerLogger.SetLastNodeGuid("a3808a66-3e56-4e52-b2c1-61b7d5d15b32");
    _Reconcilation.Select_SelectAccountType1("Debtor");
    

    TestModellerLogger.SetLastNodeGuid("2018e2d9-51c8-4e54-8424-0f5147db31d6");
    _Reconcilation.Select_SelectAccount1("All");
    

    TestModellerLogger.SetLastNodeGuid("0892baec-0422-496a-93f9-1028cef59d2c");
    _Reconcilation.Click_View_Reconciled_button1();
    

pages.Reconsilecount _Reconsilecount = new pages.Reconsilecount(driver);
    TestModellerLogger.SetLastNodeGuid("20ec992d-e923-4cd2-946b-1f6e59b73bf6");
    _Reconsilecount.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("778b3b22-188b-4954-8194-ffafa2c2d9c2");
    _Reconsilecount.Click_R1();
    

    TestModellerLogger.SetLastNodeGuid("0fc72130-6b3a-4342-9d0e-19804563923c");
    _Reconsilecount.Click_R2();
    

    TestModellerLogger.SetLastNodeGuid("bccac54a-cf91-4c34-b5de-3168f47f6c6c");
    _Reconsilecount.Click_R3();
    

    TestModellerLogger.SetLastNodeGuid("afa85278-aa67-42ac-9a2e-9d7e8178cae9");
    _Reconsilecount.Click_R4();
    

    TestModellerLogger.SetLastNodeGuid("8be2e142-f2d6-40b4-9f1a-b4f6c31f9776");
    _Reconsilecount.Click_R5();
    

    TestModellerLogger.SetLastNodeGuid("e4e26451-eebc-4ddc-84aa-2abdfce286c3");
    _Reconsilecount.Click_R6();
    

    TestModellerLogger.SetLastNodeGuid("24bb6ec6-e35c-424b-97bf-7d95cfb0c096");
    _Reconsilecount.Click_R7();
    

    TestModellerLogger.SetLastNodeGuid("605ff86c-cdca-413d-8743-6d540ebe0d6f");
    _Reconsilecount.Click_R8();
    

    TestModellerLogger.SetLastNodeGuid("5e13f8d0-f1e2-4527-b2df-049aaf7e1d0e");
    _Reconsilecount.Click_R9();
    

    TestModellerLogger.SetLastNodeGuid("3f0eb811-3a59-4e4e-9972-944ae4cc0d33");
    _Reconsilecount.Click_R10();
    

    TestModellerLogger.SetLastNodeGuid("0ae57fc9-3f5d-4114-951b-51a967c72977");
    _Reconsilecount.Click_R100();
    

    TestModellerLogger.SetLastNodeGuid("bc70be77-e7a6-40c0-94d7-4c667fba43a8");
    _Reconsilecount.Click_R11();
    

    TestModellerLogger.SetLastNodeGuid("40cafd20-4a4a-423c-b1f8-b6457dcfc293");
    _Reconsilecount.Click_R12();
    

    TestModellerLogger.SetLastNodeGuid("333f5500-78ad-458f-a383-b6440369d3de");
    _Reconsilecount.Click_R13();
    

    TestModellerLogger.SetLastNodeGuid("ab08b36a-2f76-46cc-8cf0-f6dc93b8213c");
    _Reconsilecount.Click_R14();
    

    TestModellerLogger.SetLastNodeGuid("ab7f2182-853d-4064-8d23-3ed12179a136");
    _Reconsilecount.Click_R15();
    

    TestModellerLogger.SetLastNodeGuid("6966e097-d89b-4907-b08e-0e68c988cac1");
    _Reconsilecount.Click_R16();
    

    TestModellerLogger.SetLastNodeGuid("5f153217-83e2-4727-89af-4b63829d3f86");
    _Reconsilecount.Click_R17();
    

    TestModellerLogger.SetLastNodeGuid("2437587a-af3c-4c95-8b5f-bba6c149170e");
    _Reconsilecount.Click_R18();
    

    TestModellerLogger.SetLastNodeGuid("2459c2b4-3bfc-481c-a024-a8b07ffb4253");
    _Reconsilecount.Click_R19();
    

    TestModellerLogger.SetLastNodeGuid("7afa71ce-7cce-4ada-8b31-6b446ee3611f");
    _Reconsilecount.Click_R20();
    

    TestModellerLogger.SetLastNodeGuid("130229df-4174-47ff-b315-4e797e797be2");
    _Reconsilecount.Click_R21();
    

    TestModellerLogger.SetLastNodeGuid("67a8a70d-5168-4f86-8da8-7838512ad558");
    _Reconsilecount.Click_R22();
    

    TestModellerLogger.SetLastNodeGuid("69e73e5a-7c35-43b8-b74e-686f7b89d6f5");
    _Reconsilecount.Click_R23();
    

    TestModellerLogger.SetLastNodeGuid("37e489d4-7649-4e8e-8982-e68c437511f0");
    _Reconsilecount.Click_R24();
    

    TestModellerLogger.SetLastNodeGuid("b295b7ea-4eae-4326-90c8-7bc01145c021");
    _Reconsilecount.Click_R25();
    

    TestModellerLogger.SetLastNodeGuid("0016602a-7419-4e1c-843c-4f82ce17b4f9");
    _Reconsilecount.Click_R26();
    

    TestModellerLogger.SetLastNodeGuid("fcf9dc5c-45e6-4309-bceb-fde0aeeaeec2");
    _Reconsilecount.Click_R27();
    

    TestModellerLogger.SetLastNodeGuid("95a7e0ac-fd21-408c-9d9c-027004930449");
    _Reconsilecount.Click_R28();
    

    TestModellerLogger.SetLastNodeGuid("4aa503fb-8b18-4e77-bcda-9559679043d5");
    _Reconsilecount.Click_R29();
    

    TestModellerLogger.SetLastNodeGuid("bc0de1d6-d59c-4900-899d-8bb3da5f1abd");
    _Reconsilecount.Click_R30();
    

    TestModellerLogger.SetLastNodeGuid("9bcccc53-1773-466b-b426-6ee41539f8e3");
    _Reconsilecount.Select_R31("Partial Reconcile");
    

    TestModellerLogger.SetLastNodeGuid("154f0835-2441-4733-9a24-ba5927a5e7e1");
    _Reconsilecount.Click_Success_Transactions_reconciled_successfully();
    

    }

    @Test  (groups= {"SaleInToReconcile","SaleInToReconcile - Default Profile"})
    @TestModellerPath(guid = "97d91016-2478-4b1f-8c98-11e39e3e04e2")
    public void GoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClickAgents10() throws InterruptedException, IOException
    {
    	sTestCaseID="TC2";
       	Sheet="Sheet1";
        data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
      
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
    //    
    //
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
        

    pages.SaleInvoice _SaleInvoice = new pages.SaleInvoice(driver);
//        TestModellerLogger.SetLastNodeGuid("2f331494-c0ec-443e-b258-bdf3d2f9d9fc");
//        _SaleInvoice.GoToUrl();
    //    
    //
//        TestModellerLogger.SetLastNodeGuid("281121da-f0ce-4629-a4d1-0bc9b4260347");
//        _SaleInvoice.AssertUrl();
        

        TestModellerLogger.SetLastNodeGuid("38510c8a-daac-4ff8-83f3-54b176440787");
        _SaleInvoice.Click_SalesTab();
        

        TestModellerLogger.SetLastNodeGuid("2ce6ef22-01ee-4e82-bcb0-f7ce06badd95");
        _SaleInvoice.Click_NewButton();
        

        TestModellerLogger.SetLastNodeGuid("b605bf48-53b8-4f7f-a009-9ea8d59b69ba");
        _SaleInvoice.Click_NewInvoice();
        

        TestModellerLogger.SetLastNodeGuid("4e83b316-7f8b-49b7-a97f-e85cefb020f0");
        _SaleInvoice.Select_CustomerName(data[13]);
        

        TestModellerLogger.SetLastNodeGuid("f3edcc35-8d70-4902-81f0-9c5d760fac46");
        _SaleInvoice.Enter_InvoiceNo(data[15]);
        

        TestModellerLogger.SetLastNodeGuid("6f885a16-e34c-4d0d-914a-a726c1fa9617");
        _SaleInvoice.Enter_InvoiceDate(data[14]);
        

        TestModellerLogger.SetLastNodeGuid("294097b8-ccc5-4eb7-baec-1a26ca1364f0");
        _SaleInvoice.Select_IncomeType(data[16]);
        

        TestModellerLogger.SetLastNodeGuid("5ccbf01b-65a3-47f5-b916-dab48aab691f");
        _SaleInvoice.Enter_Description(data[17]);
        

        TestModellerLogger.SetLastNodeGuid("73677a32-1892-47f6-9783-a1072478778a");
        _SaleInvoice.Enter_UnitPrice(data[18]);
        

        TestModellerLogger.SetLastNodeGuid("d810d5bf-a960-434c-9172-1671dd383495");
        _SaleInvoice.Enter_Quantity(data[19]);
        

        TestModellerLogger.SetLastNodeGuid("516c7236-f043-4de9-b128-99997ccf1604");
        _SaleInvoice.Select_VATRate(data[20]);
        
    //
//        TestModellerLogger.SetLastNodeGuid("cb6d5101-0be0-4519-b1aa-5e71dcdfbef3");
//        _SaleInvoice.Click_Tickformorelineitems();
        

        TestModellerLogger.SetLastNodeGuid("6aeae28b-fd85-4712-8710-18e4b190dd19");
        _SaleInvoice.Enter_Note(data[21]);
        

        TestModellerLogger.SetLastNodeGuid("2508d3fa-348f-48f2-914a-4d43591ded90");
        _SaleInvoice.Click_SaveButton();

    pages.bankmenu _bankmenu = new pages.bankmenu(driver);
       TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
        _bankmenu.GoToUrl();
        
    //
//        TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
//        _bankmenu.AssertUrl();
    //    

        TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
        _bankmenu.Click_Bankingmenu();
        

        TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
        _bankmenu.Click_Newmenu();
        

    pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
     TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
        _nBANKTRN.GoToUrl();
        

//        TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
//        _nBANKTRN.AssertUrl();
    //    

        TestModellerLogger.SetLastNodeGuid("32c9440758-2f86-4894-829c-0d5b167b4d77");
        _nBANKTRN.Select_BK_SELECT(data[5]);
        

        TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
        _nBANKTRN.Enter_NDate(data[6]);
        

        TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
        _nBANKTRN.Enter_n_desc(data[7]);
        

        TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
        _nBANKTRN.Enter_Recived_amt(data[8]);
        

        TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
        _nBANKTRN.Enter_spnt_amt(data[9]);
        

      TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
       _nBANKTRN.Select_Select_VATRate(data[10]);
        

        TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
        _nBANKTRN.Click_Select_Option1();
        

        TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
        _nBANKTRN.Enter_BOX2(data[11]);
        

//        TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
//        _nBANKTRN.Click__1400_DATA();
        

        TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
        _nBANKTRN.Click__Save_();
        

    pages.Reconcilation _Reconcilation = new pages.Reconcilation(driver);
//        TestModellerLogger.SetLastNodeGuid("fc1c2835-8b62-466d-8b91-b2d2b6852de5");
//        _Reconcilation.GoToUrl();
    //    
    //
//        TestModellerLogger.SetLastNodeGuid("30a799ca-18ec-4e8a-9931-57fc4ea2c02b");
//        _Reconcilation.AssertUrl();
        

        TestModellerLogger.SetLastNodeGuid("5fa7c856-5fe6-458c-94fd-c74460dd9b1f");
        _Reconcilation.Click_Acntantleftmenu();
        

        TestModellerLogger.SetLastNodeGuid("2f750f49-e648-45ca-898e-d60728db5570");
        _Reconcilation.Click_plussign();
        

        TestModellerLogger.SetLastNodeGuid("a3808a66-3e56-4e52-b2c1-61b7d5d15b32");
        _Reconcilation.Select_SelectAccountType1("Customer");
        

        TestModellerLogger.SetLastNodeGuid("2018e2d9-51c8-4e54-8424-0f5147db31d6");
        _Reconcilation.Select_SelectAccount1("Nidhis");
        

//        TestModellerLogger.SetLastNodeGuid("0892baec-0422-496a-93f9-1028cef59d2c");
//        _Reconcilation.Click_View_Reconciled_button1();


     pages.Reconsilecount _Reconsilecount = new pages.Reconsilecount(driver);
//        TestModellerLogger.SetLastNodeGuid("20ec992d-e923-4cd2-946b-1f6e59b73bf6");
//        _Reconsilecount.GoToUrl();
     pages.ungroup _ungroup = new pages.ungroup(driver);

     TestModellerLogger.SetLastNodeGuid("8579422c-5a13-4d28-bcdb-80684455e0ac");
     _ungroup.Click_selectallcheckbbox();
     

     TestModellerLogger.SetLastNodeGuid("e8d9d338-eb30-4309-96e4-dc0de1ba572c");
     _ungroup.Click_Ungroup_linkselected();

        TestModellerLogger.SetLastNodeGuid("778b3b22-188b-4954-8194-ffafa2c2d9c2");
        _Reconsilecount.Click_R1();
               

       TestModellerLogger.SetLastNodeGuid("0fc72130-6b3a-4342-9d0e-19804563923c");
        _Reconsilecount.Click_R2();
        

    //  TestModellerLogger.SetLastNodeGuid("9bcccc53-1773-466b-b426-6ee41539f8e3"); 
    //  _Reconsilecount.Select_R31(data[22]);
    //    

    //  TestModellerLogger.SetLastNodeGuid("154f0835-2441-4733-9a24-ba5927a5e7e1");
    //  _Reconsilecount.Click_Success_Transactions_reconciled_successfully();
    
    }

    @Test  (groups= {"SaleInToReconcile","SaleInToReconcile - Default Profile"})
    @TestModellerPath(guid = "43c535e6-2acf-4ebd-8507-1f49c314ca02")
    public void GoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClickAgents11() throws InterruptedException, IOException
    {
    	sTestCaseID="TC3";
       	Sheet="Sheet1";
        data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
        

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
    //    
    //
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
        

    pages.SaleInvoice _SaleInvoice = new pages.SaleInvoice(driver);
//        TestModellerLogger.SetLastNodeGuid("2f331494-c0ec-443e-b258-bdf3d2f9d9fc");
//        _SaleInvoice.GoToUrl();
    //    
    //
//        TestModellerLogger.SetLastNodeGuid("281121da-f0ce-4629-a4d1-0bc9b4260347");
//        _SaleInvoice.AssertUrl();
        

        TestModellerLogger.SetLastNodeGuid("38510c8a-daac-4ff8-83f3-54b176440787");
        _SaleInvoice.Click_SalesTab();
        

        TestModellerLogger.SetLastNodeGuid("2ce6ef22-01ee-4e82-bcb0-f7ce06badd95");
        _SaleInvoice.Click_NewButton();
        

        TestModellerLogger.SetLastNodeGuid("b605bf48-53b8-4f7f-a009-9ea8d59b69ba");
        _SaleInvoice.Click_NewInvoice();
        

        TestModellerLogger.SetLastNodeGuid("4e83b316-7f8b-49b7-a97f-e85cefb020f0");
        _SaleInvoice.Select_CustomerName(data[13]);
        

        TestModellerLogger.SetLastNodeGuid("f3edcc35-8d70-4902-81f0-9c5d760fac46");
        _SaleInvoice.Enter_InvoiceNo(data[15]);
        

        TestModellerLogger.SetLastNodeGuid("6f885a16-e34c-4d0d-914a-a726c1fa9617");
        _SaleInvoice.Enter_InvoiceDate(data[14]);
        

        TestModellerLogger.SetLastNodeGuid("294097b8-ccc5-4eb7-baec-1a26ca1364f0");
        _SaleInvoice.Select_IncomeType(data[16]);
        

        TestModellerLogger.SetLastNodeGuid("5ccbf01b-65a3-47f5-b916-dab48aab691f");
        _SaleInvoice.Enter_Description(data[17]);
        

        TestModellerLogger.SetLastNodeGuid("73677a32-1892-47f6-9783-a1072478778a");
        _SaleInvoice.Enter_UnitPrice(data[18]);
        

        TestModellerLogger.SetLastNodeGuid("d810d5bf-a960-434c-9172-1671dd383495");
        _SaleInvoice.Enter_Quantity(data[19]);
        

        TestModellerLogger.SetLastNodeGuid("516c7236-f043-4de9-b128-99997ccf1604");
        _SaleInvoice.Select_VATRate(data[20]);
        
    //
//        TestModellerLogger.SetLastNodeGuid("cb6d5101-0be0-4519-b1aa-5e71dcdfbef3");
//        _SaleInvoice.Click_Tickformorelineitems();
        

        TestModellerLogger.SetLastNodeGuid("6aeae28b-fd85-4712-8710-18e4b190dd19");
        _SaleInvoice.Enter_Note(data[21]);
        

        TestModellerLogger.SetLastNodeGuid("2508d3fa-348f-48f2-914a-4d43591ded90");
        _SaleInvoice.Click_SaveButton();

    pages.bankmenu _bankmenu = new pages.bankmenu(driver);
       TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
        _bankmenu.GoToUrl();
        
    //
//        TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
//        _bankmenu.AssertUrl();
    //    

        TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
        _bankmenu.Click_Bankingmenu();
        

        TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
        _bankmenu.Click_Newmenu();
        

    pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
     TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
        _nBANKTRN.GoToUrl();
        

//        TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
//        _nBANKTRN.AssertUrl();
    //    

        TestModellerLogger.SetLastNodeGuid("32c9440758-2f86-4894-829c-0d5b167b4d77");
        _nBANKTRN.Select_BK_SELECT(data[5]);
        

        TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
        _nBANKTRN.Enter_NDate(data[6]);
        

        TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
        _nBANKTRN.Enter_n_desc(data[7]);
        

        TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
        _nBANKTRN.Enter_Recived_amt(data[8]);
        

        TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
        _nBANKTRN.Enter_spnt_amt(data[9]);
        

      TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
       _nBANKTRN.Select_Select_VATRate(data[10]);
        

        TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
        _nBANKTRN.Click_Select_Option1();
        

        TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
        _nBANKTRN.Enter_BOX2(data[11]);
        

//        TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
//        _nBANKTRN.Click__1400_DATA();
        

        TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
        _nBANKTRN.Click__Save_();
        

    pages.Reconcilation _Reconcilation = new pages.Reconcilation(driver);
//        TestModellerLogger.SetLastNodeGuid("fc1c2835-8b62-466d-8b91-b2d2b6852de5");
//        _Reconcilation.GoToUrl();
    //    
    //
//        TestModellerLogger.SetLastNodeGuid("30a799ca-18ec-4e8a-9931-57fc4ea2c02b");
//        _Reconcilation.AssertUrl();
        

        TestModellerLogger.SetLastNodeGuid("5fa7c856-5fe6-458c-94fd-c74460dd9b1f");
        _Reconcilation.Click_Acntantleftmenu();
        

        TestModellerLogger.SetLastNodeGuid("2f750f49-e648-45ca-898e-d60728db5570");
        _Reconcilation.Click_plussign();
        

        TestModellerLogger.SetLastNodeGuid("a3808a66-3e56-4e52-b2c1-61b7d5d15b32");
        _Reconcilation.Select_SelectAccountType1("Customer");
        

        TestModellerLogger.SetLastNodeGuid("2018e2d9-51c8-4e54-8424-0f5147db31d6");
        _Reconcilation.Select_SelectAccount1("Nidhis");
        

//        TestModellerLogger.SetLastNodeGuid("0892baec-0422-496a-93f9-1028cef59d2c");
//        _Reconcilation.Click_View_Reconciled_button1();


     pages.Reconsilecount _Reconsilecount = new pages.Reconsilecount(driver);
//        TestModellerLogger.SetLastNodeGuid("20ec992d-e923-4cd2-946b-1f6e59b73bf6");
//        _Reconsilecount.GoToUrl();
     pages.ungroup _ungroup = new pages.ungroup(driver);

     TestModellerLogger.SetLastNodeGuid("8579422c-5a13-4d28-bcdb-80684455e0ac");
     _ungroup.Click_selectallcheckbbox();
     

     TestModellerLogger.SetLastNodeGuid("e8d9d338-eb30-4309-96e4-dc0de1ba572c");
     _ungroup.Click_Ungroup_linkselected();

        TestModellerLogger.SetLastNodeGuid("778b3b22-188b-4954-8194-ffafa2c2d9c2");
        _Reconsilecount.Click_R1();
               

       TestModellerLogger.SetLastNodeGuid("0fc72130-6b3a-4342-9d0e-19804563923c");
        _Reconsilecount.Click_R2();
        

    //  TestModellerLogger.SetLastNodeGuid("9bcccc53-1773-466b-b426-6ee41539f8e3"); 
    //  _Reconsilecount.Select_R31(data[22]);
    //    

    //  TestModellerLogger.SetLastNodeGuid("154f0835-2441-4733-9a24-ba5927a5e7e1");
    //  _Reconsilecount.Click_Success_Transactions_reconciled_successfully();
    
    }
      

    @Test  (groups= {"SaleInToReconcile","SaleInToReconcile - Default Profile"})
    @TestModellerPath(guid = "14bdcfe5-5355-4f13-9276-b7fcbf038c37")
    public void GoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClickAgents12() throws InterruptedException, IOException
    {
        
    	sTestCaseID="TC3";
       	Sheet="Sheet1";
        data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
        

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
    //    
    //
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
        

    pages.SaleInvoice _SaleInvoice = new pages.SaleInvoice(driver);
//        TestModellerLogger.SetLastNodeGuid("2f331494-c0ec-443e-b258-bdf3d2f9d9fc");
//        _SaleInvoice.GoToUrl();
    //    
    //
//        TestModellerLogger.SetLastNodeGuid("281121da-f0ce-4629-a4d1-0bc9b4260347");
//        _SaleInvoice.AssertUrl();
        

        TestModellerLogger.SetLastNodeGuid("38510c8a-daac-4ff8-83f3-54b176440787");
        _SaleInvoice.Click_SalesTab();
        

        TestModellerLogger.SetLastNodeGuid("2ce6ef22-01ee-4e82-bcb0-f7ce06badd95");
        _SaleInvoice.Click_NewButton();
        

        TestModellerLogger.SetLastNodeGuid("b605bf48-53b8-4f7f-a009-9ea8d59b69ba");
        _SaleInvoice.Click_NewInvoice();
        

        TestModellerLogger.SetLastNodeGuid("4e83b316-7f8b-49b7-a97f-e85cefb020f0");
        _SaleInvoice.Select_CustomerName(data[13]);
        

        TestModellerLogger.SetLastNodeGuid("f3edcc35-8d70-4902-81f0-9c5d760fac46");
        _SaleInvoice.Enter_InvoiceNo(data[15]);
        

        TestModellerLogger.SetLastNodeGuid("6f885a16-e34c-4d0d-914a-a726c1fa9617");
        _SaleInvoice.Enter_InvoiceDate(data[14]);
        

        TestModellerLogger.SetLastNodeGuid("294097b8-ccc5-4eb7-baec-1a26ca1364f0");
        _SaleInvoice.Select_IncomeType(data[16]);
        

        TestModellerLogger.SetLastNodeGuid("5ccbf01b-65a3-47f5-b916-dab48aab691f");
        _SaleInvoice.Enter_Description(data[17]);
        

        TestModellerLogger.SetLastNodeGuid("73677a32-1892-47f6-9783-a1072478778a");
        _SaleInvoice.Enter_UnitPrice(data[18]);
        

        TestModellerLogger.SetLastNodeGuid("d810d5bf-a960-434c-9172-1671dd383495");
        _SaleInvoice.Enter_Quantity(data[19]);
        

        TestModellerLogger.SetLastNodeGuid("516c7236-f043-4de9-b128-99997ccf1604");
        _SaleInvoice.Select_VATRate(data[20]);
        
    //
//        TestModellerLogger.SetLastNodeGuid("cb6d5101-0be0-4519-b1aa-5e71dcdfbef3");
//        _SaleInvoice.Click_Tickformorelineitems();
        

        TestModellerLogger.SetLastNodeGuid("6aeae28b-fd85-4712-8710-18e4b190dd19");
        _SaleInvoice.Enter_Note(data[21]);
        

        TestModellerLogger.SetLastNodeGuid("2508d3fa-348f-48f2-914a-4d43591ded90");
        _SaleInvoice.Click_SaveButton();

    pages.bankmenu _bankmenu = new pages.bankmenu(driver);
       TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
        _bankmenu.GoToUrl();
        
    //
//        TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
//        _bankmenu.AssertUrl();
    //    

        TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
        _bankmenu.Click_Bankingmenu();
        

        TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
        _bankmenu.Click_Newmenu();
        

    pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
     TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
        _nBANKTRN.GoToUrl();
        

//        TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
//        _nBANKTRN.AssertUrl();
    //    

        TestModellerLogger.SetLastNodeGuid("32c9440758-2f86-4894-829c-0d5b167b4d77");
        _nBANKTRN.Select_BK_SELECT(data[5]);
        

        TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
        _nBANKTRN.Enter_NDate(data[6]);
        

        TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
        _nBANKTRN.Enter_n_desc(data[7]);
        

        TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
        _nBANKTRN.Enter_Recived_amt(data[8]);
        

        TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
        _nBANKTRN.Enter_spnt_amt(data[9]);
        

      TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
       _nBANKTRN.Select_Select_VATRate(data[10]);
        

        TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
        _nBANKTRN.Click_Select_Option1();
        

        TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
        _nBANKTRN.Enter_BOX2(data[11]);
        

//        TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
//        _nBANKTRN.Click__1400_DATA();
        

        TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
        _nBANKTRN.Click__Save_();
        

    pages.Reconcilation _Reconcilation = new pages.Reconcilation(driver);
//        TestModellerLogger.SetLastNodeGuid("fc1c2835-8b62-466d-8b91-b2d2b6852de5");
//        _Reconcilation.GoToUrl();
    //    
    //
//        TestModellerLogger.SetLastNodeGuid("30a799ca-18ec-4e8a-9931-57fc4ea2c02b");
//        _Reconcilation.AssertUrl();
        

        TestModellerLogger.SetLastNodeGuid("5fa7c856-5fe6-458c-94fd-c74460dd9b1f");
        _Reconcilation.Click_Acntantleftmenu();
        

        TestModellerLogger.SetLastNodeGuid("2f750f49-e648-45ca-898e-d60728db5570");
        _Reconcilation.Click_plussign();
        

        TestModellerLogger.SetLastNodeGuid("a3808a66-3e56-4e52-b2c1-61b7d5d15b32");
        _Reconcilation.Select_SelectAccountType1("Customer");
        

        TestModellerLogger.SetLastNodeGuid("2018e2d9-51c8-4e54-8424-0f5147db31d6");
        _Reconcilation.Select_SelectAccount1("Nidhis");
        

//        TestModellerLogger.SetLastNodeGuid("0892baec-0422-496a-93f9-1028cef59d2c");
//        _Reconcilation.Click_View_Reconciled_button1();


     pages.Reconsilecount _Reconsilecount = new pages.Reconsilecount(driver);
//        TestModellerLogger.SetLastNodeGuid("20ec992d-e923-4cd2-946b-1f6e59b73bf6");
//        _Reconsilecount.GoToUrl();
     pages.ungroup _ungroup = new pages.ungroup(driver);

     TestModellerLogger.SetLastNodeGuid("8579422c-5a13-4d28-bcdb-80684455e0ac");
     _ungroup.Click_selectallcheckbbox();
     

     TestModellerLogger.SetLastNodeGuid("e8d9d338-eb30-4309-96e4-dc0de1ba572c");
     _ungroup.Click_Ungroup_linkselected();

        TestModellerLogger.SetLastNodeGuid("778b3b22-188b-4954-8194-ffafa2c2d9c2");
        _Reconsilecount.Click_R1();
               

       TestModellerLogger.SetLastNodeGuid("0fc72130-6b3a-4342-9d0e-19804563923c");
        _Reconsilecount.Click_R2();
        

    //  TestModellerLogger.SetLastNodeGuid("9bcccc53-1773-466b-b426-6ee41539f8e3"); 
    //  _Reconsilecount.Select_R31(data[22]);
    //    

    //  TestModellerLogger.SetLastNodeGuid("154f0835-2441-4733-9a24-ba5927a5e7e1");
    //  _Reconsilecount.Click_Success_Transactions_reconciled_successfully();
    
    }
      @Test  (groups= {"SaleInToReconcile","SaleInToReconcile - Default Profile"})
    @TestModellerPath(guid = "bbfe076b-0fa2-4051-b5e5-ed77c398bee3")
    public void GoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClickAgents13() throws InterruptedException, IOException
    {
    	sTestCaseID="TC4";
       	Sheet="Sheet1";
        data = ExcelData.toReadExcelData(sTestCaseID, Sheet);

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
    //    
    //
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
        

    pages.SaleInvoice _SaleInvoice = new pages.SaleInvoice(driver);
//        TestModellerLogger.SetLastNodeGuid("2f331494-c0ec-443e-b258-bdf3d2f9d9fc");
//        _SaleInvoice.GoToUrl();
    //    
    //
//        TestModellerLogger.SetLastNodeGuid("281121da-f0ce-4629-a4d1-0bc9b4260347");
//        _SaleInvoice.AssertUrl();
        

        TestModellerLogger.SetLastNodeGuid("38510c8a-daac-4ff8-83f3-54b176440787");
        _SaleInvoice.Click_SalesTab();
        

        TestModellerLogger.SetLastNodeGuid("2ce6ef22-01ee-4e82-bcb0-f7ce06badd95");
        _SaleInvoice.Click_NewButton();
        

        TestModellerLogger.SetLastNodeGuid("b605bf48-53b8-4f7f-a009-9ea8d59b69ba");
        _SaleInvoice.Click_NewInvoice();
        

        TestModellerLogger.SetLastNodeGuid("4e83b316-7f8b-49b7-a97f-e85cefb020f0");
        _SaleInvoice.Select_CustomerName(data[13]);
        

        TestModellerLogger.SetLastNodeGuid("f3edcc35-8d70-4902-81f0-9c5d760fac46");
        _SaleInvoice.Enter_InvoiceNo(data[15]);
        

        TestModellerLogger.SetLastNodeGuid("6f885a16-e34c-4d0d-914a-a726c1fa9617");
        _SaleInvoice.Enter_InvoiceDate(data[14]);
        

        TestModellerLogger.SetLastNodeGuid("294097b8-ccc5-4eb7-baec-1a26ca1364f0");
        _SaleInvoice.Select_IncomeType(data[16]);
        

        TestModellerLogger.SetLastNodeGuid("5ccbf01b-65a3-47f5-b916-dab48aab691f");
        _SaleInvoice.Enter_Description(data[17]);
        

        TestModellerLogger.SetLastNodeGuid("73677a32-1892-47f6-9783-a1072478778a");
        _SaleInvoice.Enter_UnitPrice(data[18]);
        

        TestModellerLogger.SetLastNodeGuid("d810d5bf-a960-434c-9172-1671dd383495");
        _SaleInvoice.Enter_Quantity(data[19]);
        

        TestModellerLogger.SetLastNodeGuid("516c7236-f043-4de9-b128-99997ccf1604");
        _SaleInvoice.Select_VATRate(data[20]);
        
    //
//        TestModellerLogger.SetLastNodeGuid("cb6d5101-0be0-4519-b1aa-5e71dcdfbef3");
//        _SaleInvoice.Click_Tickformorelineitems();
        

        TestModellerLogger.SetLastNodeGuid("6aeae28b-fd85-4712-8710-18e4b190dd19");
        _SaleInvoice.Enter_Note(data[21]);
        

        TestModellerLogger.SetLastNodeGuid("2508d3fa-348f-48f2-914a-4d43591ded90");
        _SaleInvoice.Click_SaveButton();

    pages.bankmenu _bankmenu = new pages.bankmenu(driver);
       TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
        _bankmenu.GoToUrl();
        
    //
//        TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
//        _bankmenu.AssertUrl();
    //    

        TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
        _bankmenu.Click_Bankingmenu();
        

        TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
        _bankmenu.Click_Newmenu();
        

    pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
     TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
        _nBANKTRN.GoToUrl();
        

//        TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
//        _nBANKTRN.AssertUrl();
    //    

        TestModellerLogger.SetLastNodeGuid("32c9440758-2f86-4894-829c-0d5b167b4d77");
        _nBANKTRN.Select_BK_SELECT(data[5]);
        

        TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
        _nBANKTRN.Enter_NDate(data[6]);
        

        TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
        _nBANKTRN.Enter_n_desc(data[7]);
        

        TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
        _nBANKTRN.Enter_Recived_amt(data[8]);
        

        TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
        _nBANKTRN.Enter_spnt_amt(data[9]);
        

      TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
       _nBANKTRN.Select_Select_VATRate(data[10]);
        

        TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
        _nBANKTRN.Click_Select_Option1();
        

        TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
        _nBANKTRN.Enter_BOX2(data[11]);
        

//        TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
//        _nBANKTRN.Click__1400_DATA();
        

        TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
        _nBANKTRN.Click__Save_();
        

    pages.Reconcilation _Reconcilation = new pages.Reconcilation(driver);
//        TestModellerLogger.SetLastNodeGuid("fc1c2835-8b62-466d-8b91-b2d2b6852de5");
//        _Reconcilation.GoToUrl();
    //    
    //
//        TestModellerLogger.SetLastNodeGuid("30a799ca-18ec-4e8a-9931-57fc4ea2c02b");
//        _Reconcilation.AssertUrl();
        

        TestModellerLogger.SetLastNodeGuid("5fa7c856-5fe6-458c-94fd-c74460dd9b1f");
        _Reconcilation.Click_Acntantleftmenu();
        

        TestModellerLogger.SetLastNodeGuid("2f750f49-e648-45ca-898e-d60728db5570");
        _Reconcilation.Click_plussign();
        

        TestModellerLogger.SetLastNodeGuid("a3808a66-3e56-4e52-b2c1-61b7d5d15b32");
        _Reconcilation.Select_SelectAccountType1("Customer");
        

        TestModellerLogger.SetLastNodeGuid("2018e2d9-51c8-4e54-8424-0f5147db31d6");
        _Reconcilation.Select_SelectAccount1("Nidhis");
        

//        TestModellerLogger.SetLastNodeGuid("0892baec-0422-496a-93f9-1028cef59d2c");
//        _Reconcilation.Click_View_Reconciled_button1();


     pages.Reconsilecount _Reconsilecount = new pages.Reconsilecount(driver);
//        TestModellerLogger.SetLastNodeGuid("20ec992d-e923-4cd2-946b-1f6e59b73bf6");
//        _Reconsilecount.GoToUrl();
     pages.ungroup _ungroup = new pages.ungroup(driver);

     TestModellerLogger.SetLastNodeGuid("8579422c-5a13-4d28-bcdb-80684455e0ac");
     _ungroup.Click_selectallcheckbbox();
     

     TestModellerLogger.SetLastNodeGuid("e8d9d338-eb30-4309-96e4-dc0de1ba572c");
     _ungroup.Click_Ungroup_linkselected();

        TestModellerLogger.SetLastNodeGuid("778b3b22-188b-4954-8194-ffafa2c2d9c2");
        _Reconsilecount.Click_R1();
               

       TestModellerLogger.SetLastNodeGuid("0fc72130-6b3a-4342-9d0e-19804563923c");
        _Reconsilecount.Click_R2();
        

    //  TestModellerLogger.SetLastNodeGuid("9bcccc53-1773-466b-b426-6ee41539f8e3"); 
    //  _Reconsilecount.Select_R31(data[22]);
    //    

    //  TestModellerLogger.SetLastNodeGuid("154f0835-2441-4733-9a24-ba5927a5e7e1");
    //  _Reconsilecount.Click_Success_Transactions_reconciled_successfully();
    
    }
   
    @Test  (groups= {"SaleInToReconcile","SaleInToReconcile - Default Profile"})
    @TestModellerPath(guid = "52b2a363-2a8c-449b-8494-61baeba1c87b")
    public void GoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClickAgents14() throws InterruptedException, IOException
    {
    	sTestCaseID="TC5";
       	Sheet="Sheet1";
        data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
        

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
    //    
    //
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
        

    pages.SaleInvoice _SaleInvoice = new pages.SaleInvoice(driver);
//        TestModellerLogger.SetLastNodeGuid("2f331494-c0ec-443e-b258-bdf3d2f9d9fc");
//        _SaleInvoice.GoToUrl();
    //    
    //
//        TestModellerLogger.SetLastNodeGuid("281121da-f0ce-4629-a4d1-0bc9b4260347");
//        _SaleInvoice.AssertUrl();
        

        TestModellerLogger.SetLastNodeGuid("38510c8a-daac-4ff8-83f3-54b176440787");
        _SaleInvoice.Click_SalesTab();
        

        TestModellerLogger.SetLastNodeGuid("2ce6ef22-01ee-4e82-bcb0-f7ce06badd95");
        _SaleInvoice.Click_NewButton();
        

        TestModellerLogger.SetLastNodeGuid("b605bf48-53b8-4f7f-a009-9ea8d59b69ba");
        _SaleInvoice.Click_NewInvoice();
        

        TestModellerLogger.SetLastNodeGuid("4e83b316-7f8b-49b7-a97f-e85cefb020f0");
        _SaleInvoice.Select_CustomerName(data[13]);
        

        TestModellerLogger.SetLastNodeGuid("f3edcc35-8d70-4902-81f0-9c5d760fac46");
        _SaleInvoice.Enter_InvoiceNo(data[15]);
        

        TestModellerLogger.SetLastNodeGuid("6f885a16-e34c-4d0d-914a-a726c1fa9617");
        _SaleInvoice.Enter_InvoiceDate(data[14]);
        

        TestModellerLogger.SetLastNodeGuid("294097b8-ccc5-4eb7-baec-1a26ca1364f0");
        _SaleInvoice.Select_IncomeType(data[16]);
        

        TestModellerLogger.SetLastNodeGuid("5ccbf01b-65a3-47f5-b916-dab48aab691f");
        _SaleInvoice.Enter_Description(data[17]);
        

        TestModellerLogger.SetLastNodeGuid("73677a32-1892-47f6-9783-a1072478778a");
        _SaleInvoice.Enter_UnitPrice(data[18]);
        

        TestModellerLogger.SetLastNodeGuid("d810d5bf-a960-434c-9172-1671dd383495");
        _SaleInvoice.Enter_Quantity(data[19]);
        

        TestModellerLogger.SetLastNodeGuid("516c7236-f043-4de9-b128-99997ccf1604");
        _SaleInvoice.Select_VATRate(data[20]);
        
    //
//        TestModellerLogger.SetLastNodeGuid("cb6d5101-0be0-4519-b1aa-5e71dcdfbef3");
//        _SaleInvoice.Click_Tickformorelineitems();
        

        TestModellerLogger.SetLastNodeGuid("6aeae28b-fd85-4712-8710-18e4b190dd19");
        _SaleInvoice.Enter_Note(data[21]);
        

        TestModellerLogger.SetLastNodeGuid("2508d3fa-348f-48f2-914a-4d43591ded90");
        _SaleInvoice.Click_SaveButton();

    pages.bankmenu _bankmenu = new pages.bankmenu(driver);
       TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
        _bankmenu.GoToUrl();
        
    //
//        TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
//        _bankmenu.AssertUrl();
    //    

        TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
        _bankmenu.Click_Bankingmenu();
        

        TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
        _bankmenu.Click_Newmenu();
        

    pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
     TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
        _nBANKTRN.GoToUrl();
        

//        TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
//        _nBANKTRN.AssertUrl();
    //    

        TestModellerLogger.SetLastNodeGuid("32c9440758-2f86-4894-829c-0d5b167b4d77");
        _nBANKTRN.Select_BK_SELECT(data[5]);
        

        TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
        _nBANKTRN.Enter_NDate(data[6]);
        

        TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
        _nBANKTRN.Enter_n_desc(data[7]);
        

        TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
        _nBANKTRN.Enter_Recived_amt(data[8]);
        

        TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
        _nBANKTRN.Enter_spnt_amt(data[9]);
        

      TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
       _nBANKTRN.Select_Select_VATRate(data[10]);
        

        TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
        _nBANKTRN.Click_Select_Option1();
        

        TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
        _nBANKTRN.Enter_BOX2(data[11]);
        

//        TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
//        _nBANKTRN.Click__1400_DATA();
        

        TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
        _nBANKTRN.Click__Save_();
        

    pages.Reconcilation _Reconcilation = new pages.Reconcilation(driver);
//        TestModellerLogger.SetLastNodeGuid("fc1c2835-8b62-466d-8b91-b2d2b6852de5");
//        _Reconcilation.GoToUrl();
    //    
    //
//        TestModellerLogger.SetLastNodeGuid("30a799ca-18ec-4e8a-9931-57fc4ea2c02b");
//        _Reconcilation.AssertUrl();
        

        TestModellerLogger.SetLastNodeGuid("5fa7c856-5fe6-458c-94fd-c74460dd9b1f");
        _Reconcilation.Click_Acntantleftmenu();
        

        TestModellerLogger.SetLastNodeGuid("2f750f49-e648-45ca-898e-d60728db5570");
        _Reconcilation.Click_plussign();
        

        TestModellerLogger.SetLastNodeGuid("a3808a66-3e56-4e52-b2c1-61b7d5d15b32");
        _Reconcilation.Select_SelectAccountType1("Customer");
        

        TestModellerLogger.SetLastNodeGuid("2018e2d9-51c8-4e54-8424-0f5147db31d6");
        _Reconcilation.Select_SelectAccount1("Nidhis");
        

//        TestModellerLogger.SetLastNodeGuid("0892baec-0422-496a-93f9-1028cef59d2c");
//        _Reconcilation.Click_View_Reconciled_button1();


     pages.Reconsilecount _Reconsilecount = new pages.Reconsilecount(driver);
//        TestModellerLogger.SetLastNodeGuid("20ec992d-e923-4cd2-946b-1f6e59b73bf6");
//        _Reconsilecount.GoToUrl();
     pages.ungroup _ungroup = new pages.ungroup(driver);

     TestModellerLogger.SetLastNodeGuid("8579422c-5a13-4d28-bcdb-80684455e0ac");
     _ungroup.Click_selectallcheckbbox();
     

     TestModellerLogger.SetLastNodeGuid("e8d9d338-eb30-4309-96e4-dc0de1ba572c");
     _ungroup.Click_Ungroup_linkselected();

        TestModellerLogger.SetLastNodeGuid("778b3b22-188b-4954-8194-ffafa2c2d9c2");
        _Reconsilecount.Click_R1();
               

       TestModellerLogger.SetLastNodeGuid("0fc72130-6b3a-4342-9d0e-19804563923c");
        _Reconsilecount.Click_R2();
        

    //  TestModellerLogger.SetLastNodeGuid("9bcccc53-1773-466b-b426-6ee41539f8e3"); 
    //  _Reconsilecount.Select_R31(data[22]);
    //    

    //  TestModellerLogger.SetLastNodeGuid("154f0835-2441-4733-9a24-ba5927a5e7e1");
    //  _Reconsilecount.Click_Success_Transactions_reconciled_successfully();
    
    }

    @Test  (groups= {"SaleInToReconcile","SaleInToReconcile - Default Profile"})
    @TestModellerPath(guid = "33eca6ec-565d-4ed3-a849-194bcb33a030")
    public void GoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClickAgents15() throws InterruptedException, IOException
    {
        
    	sTestCaseID="TC6";
       	Sheet="Sheet1";
        data = ExcelData.toReadExcelData(sTestCaseID, Sheet);

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
    //    
    //
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
        

    pages.SaleInvoice _SaleInvoice = new pages.SaleInvoice(driver);
//        TestModellerLogger.SetLastNodeGuid("2f331494-c0ec-443e-b258-bdf3d2f9d9fc");
//        _SaleInvoice.GoToUrl();
    //    
    //
//        TestModellerLogger.SetLastNodeGuid("281121da-f0ce-4629-a4d1-0bc9b4260347");
//        _SaleInvoice.AssertUrl();
        

        TestModellerLogger.SetLastNodeGuid("38510c8a-daac-4ff8-83f3-54b176440787");
        _SaleInvoice.Click_SalesTab();
        

        TestModellerLogger.SetLastNodeGuid("2ce6ef22-01ee-4e82-bcb0-f7ce06badd95");
        _SaleInvoice.Click_NewButton();
        

        TestModellerLogger.SetLastNodeGuid("b605bf48-53b8-4f7f-a009-9ea8d59b69ba");
        _SaleInvoice.Click_NewInvoice();
        

        TestModellerLogger.SetLastNodeGuid("4e83b316-7f8b-49b7-a97f-e85cefb020f0");
        _SaleInvoice.Select_CustomerName(data[13]);
        

        TestModellerLogger.SetLastNodeGuid("f3edcc35-8d70-4902-81f0-9c5d760fac46");
        _SaleInvoice.Enter_InvoiceNo(data[15]);
        

        TestModellerLogger.SetLastNodeGuid("6f885a16-e34c-4d0d-914a-a726c1fa9617");
        _SaleInvoice.Enter_InvoiceDate(data[14]);
        

        TestModellerLogger.SetLastNodeGuid("294097b8-ccc5-4eb7-baec-1a26ca1364f0");
        _SaleInvoice.Select_IncomeType(data[16]);
        

        TestModellerLogger.SetLastNodeGuid("5ccbf01b-65a3-47f5-b916-dab48aab691f");
        _SaleInvoice.Enter_Description(data[17]);
        

        TestModellerLogger.SetLastNodeGuid("73677a32-1892-47f6-9783-a1072478778a");
        _SaleInvoice.Enter_UnitPrice(data[18]);
        

        TestModellerLogger.SetLastNodeGuid("d810d5bf-a960-434c-9172-1671dd383495");
        _SaleInvoice.Enter_Quantity(data[19]);
        

        TestModellerLogger.SetLastNodeGuid("516c7236-f043-4de9-b128-99997ccf1604");
        _SaleInvoice.Select_VATRate(data[20]);
        
    //
//        TestModellerLogger.SetLastNodeGuid("cb6d5101-0be0-4519-b1aa-5e71dcdfbef3");
//        _SaleInvoice.Click_Tickformorelineitems();
        

        TestModellerLogger.SetLastNodeGuid("6aeae28b-fd85-4712-8710-18e4b190dd19");
        _SaleInvoice.Enter_Note(data[21]);
        

        TestModellerLogger.SetLastNodeGuid("2508d3fa-348f-48f2-914a-4d43591ded90");
        _SaleInvoice.Click_SaveButton();

    pages.bankmenu _bankmenu = new pages.bankmenu(driver);
       TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
        _bankmenu.GoToUrl();
        
    //
//        TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
//        _bankmenu.AssertUrl();
    //    

        TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
        _bankmenu.Click_Bankingmenu();
        

        TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
        _bankmenu.Click_Newmenu();
        

    pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
     TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
        _nBANKTRN.GoToUrl();
        

//        TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
//        _nBANKTRN.AssertUrl();
    //    

        TestModellerLogger.SetLastNodeGuid("32c9440758-2f86-4894-829c-0d5b167b4d77");
        _nBANKTRN.Select_BK_SELECT(data[5]);
        

        TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
        _nBANKTRN.Enter_NDate(data[6]);
        

        TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
        _nBANKTRN.Enter_n_desc(data[7]);
        

        TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
        _nBANKTRN.Enter_Recived_amt(data[8]);
        

        TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
        _nBANKTRN.Enter_spnt_amt(data[9]);
        

      TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
       _nBANKTRN.Select_Select_VATRate(data[10]);
        

        TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
        _nBANKTRN.Click_Select_Option1();
        

        TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
        _nBANKTRN.Enter_BOX2(data[11]);
        

//        TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
//        _nBANKTRN.Click__1400_DATA();
        

        TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
        _nBANKTRN.Click__Save_();
        

    pages.Reconcilation _Reconcilation = new pages.Reconcilation(driver);
//        TestModellerLogger.SetLastNodeGuid("fc1c2835-8b62-466d-8b91-b2d2b6852de5");
//        _Reconcilation.GoToUrl();
    //    
    //
//        TestModellerLogger.SetLastNodeGuid("30a799ca-18ec-4e8a-9931-57fc4ea2c02b");
//        _Reconcilation.AssertUrl();
        

        TestModellerLogger.SetLastNodeGuid("5fa7c856-5fe6-458c-94fd-c74460dd9b1f");
        _Reconcilation.Click_Acntantleftmenu();
        

        TestModellerLogger.SetLastNodeGuid("2f750f49-e648-45ca-898e-d60728db5570");
        _Reconcilation.Click_plussign();
        

        TestModellerLogger.SetLastNodeGuid("a3808a66-3e56-4e52-b2c1-61b7d5d15b32");
        _Reconcilation.Select_SelectAccountType1("Customer");
        

        TestModellerLogger.SetLastNodeGuid("2018e2d9-51c8-4e54-8424-0f5147db31d6");
        _Reconcilation.Select_SelectAccount1("Nidhis");
        

//        TestModellerLogger.SetLastNodeGuid("0892baec-0422-496a-93f9-1028cef59d2c");
//        _Reconcilation.Click_View_Reconciled_button1();


     pages.Reconsilecount _Reconsilecount = new pages.Reconsilecount(driver);
//        TestModellerLogger.SetLastNodeGuid("20ec992d-e923-4cd2-946b-1f6e59b73bf6");
//        _Reconsilecount.GoToUrl();
     pages.ungroup _ungroup = new pages.ungroup(driver);

     TestModellerLogger.SetLastNodeGuid("8579422c-5a13-4d28-bcdb-80684455e0ac");
     _ungroup.Click_selectallcheckbbox();
     

     TestModellerLogger.SetLastNodeGuid("e8d9d338-eb30-4309-96e4-dc0de1ba572c");
     _ungroup.Click_Ungroup_linkselected();

        TestModellerLogger.SetLastNodeGuid("778b3b22-188b-4954-8194-ffafa2c2d9c2");
        _Reconsilecount.Click_R1();
               

       TestModellerLogger.SetLastNodeGuid("0fc72130-6b3a-4342-9d0e-19804563923c");
        _Reconsilecount.Click_R2();
        

    //  TestModellerLogger.SetLastNodeGuid("9bcccc53-1773-466b-b426-6ee41539f8e3"); 
    //  _Reconsilecount.Select_R31(data[22]);
    //    

    //  TestModellerLogger.SetLastNodeGuid("154f0835-2441-4733-9a24-ba5927a5e7e1");
    //  _Reconsilecount.Click_Success_Transactions_reconciled_successfully();
    
    }
        

    }
    /*

    @Test  (groups= {"SaleInToReconcile","SaleInToReconcile - Default Profile"})
    @TestModellerPath(guid = "d2148afc-294a-4725-8112-e82155de2583")
    public void GoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClickAgents16()
    {
    	sTestCaseID="TC6";
       	Sheet="Sheet1";
        data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("exzFQLjEeZ");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
    _AgentSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("sed");
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Stiedemann, Hessel and Beer");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.SaleInvoice _SaleInvoice = new pages.SaleInvoice(driver);
    TestModellerLogger.SetLastNodeGuid("2f331494-c0ec-443e-b258-bdf3d2f9d9fc");
    _SaleInvoice.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("281121da-f0ce-4629-a4d1-0bc9b4260347");
    _SaleInvoice.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("38510c8a-daac-4ff8-83f3-54b176440787");
    _SaleInvoice.Click_SalesTab();
    

    TestModellerLogger.SetLastNodeGuid("2ce6ef22-01ee-4e82-bcb0-f7ce06badd95");
    _SaleInvoice.Click_NewButton();
    

    TestModellerLogger.SetLastNodeGuid("b605bf48-53b8-4f7f-a009-9ea8d59b69ba");
    _SaleInvoice.Click_NewInvoice();
    

    TestModellerLogger.SetLastNodeGuid("4e83b316-7f8b-49b7-a97f-e85cefb020f0");
    _SaleInvoice.Select_CustomerName("nid");
    

    TestModellerLogger.SetLastNodeGuid("f3edcc35-8d70-4902-81f0-9c5d760fac46");
    _SaleInvoice.Enter_InvoiceNo("");
    

    TestModellerLogger.SetLastNodeGuid("6f885a16-e34c-4d0d-914a-a726c1fa9617");
    _SaleInvoice.Enter_InvoiceDate("44266");
    

    TestModellerLogger.SetLastNodeGuid("294097b8-ccc5-4eb7-baec-1a26ca1364f0");
    _SaleInvoice.Select_IncomeType("");
    

    TestModellerLogger.SetLastNodeGuid("5ccbf01b-65a3-47f5-b916-dab48aab691f");
    _SaleInvoice.Enter_Description("Dolores aliquam odio quo enim tempora consectetur provident.
Vero ullam id esse temporibus quia.
Velit quis quos qui veniam dicta at ut.
Non molestias provident voluptates eaque laboriosam sed.
Dignissimos saepe rerum exercitationem nostrum ea cumque voluptas.
Aut est fugiat suscipit quis id velit et rem similique.
Voluptatum nihil velit in eveniet sit laboriosam porro expedita.
Vel sint dolor ab ut eveniet odio.
Quia rerum temporibus illum ea voluptatibus.
Impedit adipisci natus et.");
    

    TestModellerLogger.SetLastNodeGuid("73677a32-1892-47f6-9783-a1072478778a");
    _SaleInvoice.Enter_UnitPrice("");
    

    TestModellerLogger.SetLastNodeGuid("d810d5bf-a960-434c-9172-1671dd383495");
    _SaleInvoice.Enter_Quantity("");
    

    TestModellerLogger.SetLastNodeGuid("516c7236-f043-4de9-b128-99997ccf1604");
    _SaleInvoice.Select_VATRate("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("cb6d5101-0be0-4519-b1aa-5e71dcdfbef3");
    _SaleInvoice.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("6aeae28b-fd85-4712-8710-18e4b190dd19");
    _SaleInvoice.Enter_Note("");
    

    TestModellerLogger.SetLastNodeGuid("2508d3fa-348f-48f2-914a-4d43591ded90");
    _SaleInvoice.Click_SaveButton();
    

    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("kK8s6VDGIr");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
    _AgentSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("quia");
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Ullrich, O'Conner and Crooks");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
    _bankmenu.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
    _bankmenu.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
    _bankmenu.Click_Bankingmenu();
    

    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
    _bankmenu.Click_Newmenu();
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
    _nBANKTRN.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
    _nBANKTRN.Select_BK_SELECT("nidhibank");
    

    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
    _nBANKTRN.Enter_NDate("44266");
    

    TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
    _nBANKTRN.Enter_n_desc("");
    

    TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
    _nBANKTRN.Enter_Recived_amt("");
    

    TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
    _nBANKTRN.Enter_spnt_amt("");
    

    TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
    _nBANKTRN.Select_Select_VATRate("Zero Rate");
    

    TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
    _nBANKTRN.Click_Select_Option1();
    

    TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
    _nBANKTRN.Enter_BOX2("");
    

    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

pages.Reconcilation _Reconcilation = new pages.Reconcilation(driver);
    TestModellerLogger.SetLastNodeGuid("fc1c2835-8b62-466d-8b91-b2d2b6852de5");
    _Reconcilation.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("30a799ca-18ec-4e8a-9931-57fc4ea2c02b");
    _Reconcilation.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5fa7c856-5fe6-458c-94fd-c74460dd9b1f");
    _Reconcilation.Click_Acntantleftmenu();
    

    TestModellerLogger.SetLastNodeGuid("2f750f49-e648-45ca-898e-d60728db5570");
    _Reconcilation.Click_plussign();
    

    TestModellerLogger.SetLastNodeGuid("a3808a66-3e56-4e52-b2c1-61b7d5d15b32");
    _Reconcilation.Select_SelectAccountType1("Creditors due after one year");
    

    TestModellerLogger.SetLastNodeGuid("2018e2d9-51c8-4e54-8424-0f5147db31d6");
    _Reconcilation.Select_SelectAccount1("All");
    

    TestModellerLogger.SetLastNodeGuid("0892baec-0422-496a-93f9-1028cef59d2c");
    _Reconcilation.Click_View_Reconciled_button1();
    

pages.Reconsilecount _Reconsilecount = new pages.Reconsilecount(driver);
    TestModellerLogger.SetLastNodeGuid("20ec992d-e923-4cd2-946b-1f6e59b73bf6");
    _Reconsilecount.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("778b3b22-188b-4954-8194-ffafa2c2d9c2");
    _Reconsilecount.Click_R1();
    

    TestModellerLogger.SetLastNodeGuid("0fc72130-6b3a-4342-9d0e-19804563923c");
    _Reconsilecount.Click_R2();
    

    TestModellerLogger.SetLastNodeGuid("bccac54a-cf91-4c34-b5de-3168f47f6c6c");
    _Reconsilecount.Click_R3();
    

    TestModellerLogger.SetLastNodeGuid("afa85278-aa67-42ac-9a2e-9d7e8178cae9");
    _Reconsilecount.Click_R4();
    

    TestModellerLogger.SetLastNodeGuid("8be2e142-f2d6-40b4-9f1a-b4f6c31f9776");
    _Reconsilecount.Click_R5();
    

    TestModellerLogger.SetLastNodeGuid("e4e26451-eebc-4ddc-84aa-2abdfce286c3");
    _Reconsilecount.Click_R6();
    

    TestModellerLogger.SetLastNodeGuid("24bb6ec6-e35c-424b-97bf-7d95cfb0c096");
    _Reconsilecount.Click_R7();
    

    TestModellerLogger.SetLastNodeGuid("605ff86c-cdca-413d-8743-6d540ebe0d6f");
    _Reconsilecount.Click_R8();
    

    TestModellerLogger.SetLastNodeGuid("5e13f8d0-f1e2-4527-b2df-049aaf7e1d0e");
    _Reconsilecount.Click_R9();
    

    TestModellerLogger.SetLastNodeGuid("3f0eb811-3a59-4e4e-9972-944ae4cc0d33");
    _Reconsilecount.Click_R10();
    

    TestModellerLogger.SetLastNodeGuid("0ae57fc9-3f5d-4114-951b-51a967c72977");
    _Reconsilecount.Click_R100();
    

    TestModellerLogger.SetLastNodeGuid("bc70be77-e7a6-40c0-94d7-4c667fba43a8");
    _Reconsilecount.Click_R11();
    

    TestModellerLogger.SetLastNodeGuid("40cafd20-4a4a-423c-b1f8-b6457dcfc293");
    _Reconsilecount.Click_R12();
    

    TestModellerLogger.SetLastNodeGuid("333f5500-78ad-458f-a383-b6440369d3de");
    _Reconsilecount.Click_R13();
    

    TestModellerLogger.SetLastNodeGuid("ab08b36a-2f76-46cc-8cf0-f6dc93b8213c");
    _Reconsilecount.Click_R14();
    

    TestModellerLogger.SetLastNodeGuid("ab7f2182-853d-4064-8d23-3ed12179a136");
    _Reconsilecount.Click_R15();
    

    TestModellerLogger.SetLastNodeGuid("6966e097-d89b-4907-b08e-0e68c988cac1");
    _Reconsilecount.Click_R16();
    

    TestModellerLogger.SetLastNodeGuid("5f153217-83e2-4727-89af-4b63829d3f86");
    _Reconsilecount.Click_R17();
    

    TestModellerLogger.SetLastNodeGuid("2437587a-af3c-4c95-8b5f-bba6c149170e");
    _Reconsilecount.Click_R18();
    

    TestModellerLogger.SetLastNodeGuid("2459c2b4-3bfc-481c-a024-a8b07ffb4253");
    _Reconsilecount.Click_R19();
    

    TestModellerLogger.SetLastNodeGuid("7afa71ce-7cce-4ada-8b31-6b446ee3611f");
    _Reconsilecount.Click_R20();
    

    TestModellerLogger.SetLastNodeGuid("130229df-4174-47ff-b315-4e797e797be2");
    _Reconsilecount.Click_R21();
    

    TestModellerLogger.SetLastNodeGuid("67a8a70d-5168-4f86-8da8-7838512ad558");
    _Reconsilecount.Click_R22();
    

    TestModellerLogger.SetLastNodeGuid("69e73e5a-7c35-43b8-b74e-686f7b89d6f5");
    _Reconsilecount.Click_R23();
    

    TestModellerLogger.SetLastNodeGuid("37e489d4-7649-4e8e-8982-e68c437511f0");
    _Reconsilecount.Click_R24();
    

    TestModellerLogger.SetLastNodeGuid("b295b7ea-4eae-4326-90c8-7bc01145c021");
    _Reconsilecount.Click_R25();
    

    TestModellerLogger.SetLastNodeGuid("0016602a-7419-4e1c-843c-4f82ce17b4f9");
    _Reconsilecount.Click_R26();
    

    TestModellerLogger.SetLastNodeGuid("fcf9dc5c-45e6-4309-bceb-fde0aeeaeec2");
    _Reconsilecount.Click_R27();
    

    TestModellerLogger.SetLastNodeGuid("95a7e0ac-fd21-408c-9d9c-027004930449");
    _Reconsilecount.Click_R28();
    

    TestModellerLogger.SetLastNodeGuid("4aa503fb-8b18-4e77-bcda-9559679043d5");
    _Reconsilecount.Click_R29();
    

    TestModellerLogger.SetLastNodeGuid("bc0de1d6-d59c-4900-899d-8bb3da5f1abd");
    _Reconsilecount.Click_R30();
    

    TestModellerLogger.SetLastNodeGuid("9bcccc53-1773-466b-b426-6ee41539f8e3");
    _Reconsilecount.Select_R31("Partial Reconcile");
    

    TestModellerLogger.SetLastNodeGuid("154f0835-2441-4733-9a24-ba5927a5e7e1");
    _Reconsilecount.Click_Success_Transactions_reconciled_successfully();
    

    }
    /*

    @Test  (groups= {"SaleInToReconcile","SaleInToReconcile - Default Profile"})
    @TestModellerPath(guid = "6f9316c3-84a1-4d90-a797-7b720f2a3268")
    public void GoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClickAgents17()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("9J9uLux1Kk");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
    _AgentSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("alias");
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Kuvalis - Cassin");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.SaleInvoice _SaleInvoice = new pages.SaleInvoice(driver);
    TestModellerLogger.SetLastNodeGuid("2f331494-c0ec-443e-b258-bdf3d2f9d9fc");
    _SaleInvoice.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("281121da-f0ce-4629-a4d1-0bc9b4260347");
    _SaleInvoice.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("38510c8a-daac-4ff8-83f3-54b176440787");
    _SaleInvoice.Click_SalesTab();
    

    TestModellerLogger.SetLastNodeGuid("2ce6ef22-01ee-4e82-bcb0-f7ce06badd95");
    _SaleInvoice.Click_NewButton();
    

    TestModellerLogger.SetLastNodeGuid("b605bf48-53b8-4f7f-a009-9ea8d59b69ba");
    _SaleInvoice.Click_NewInvoice();
    

    TestModellerLogger.SetLastNodeGuid("4e83b316-7f8b-49b7-a97f-e85cefb020f0");
    _SaleInvoice.Select_CustomerName("nid");
    

    TestModellerLogger.SetLastNodeGuid("f3edcc35-8d70-4902-81f0-9c5d760fac46");
    _SaleInvoice.Enter_InvoiceNo("");
    

    TestModellerLogger.SetLastNodeGuid("6f885a16-e34c-4d0d-914a-a726c1fa9617");
    _SaleInvoice.Enter_InvoiceDate("44266");
    

    TestModellerLogger.SetLastNodeGuid("294097b8-ccc5-4eb7-baec-1a26ca1364f0");
    _SaleInvoice.Select_IncomeType("");
    

    TestModellerLogger.SetLastNodeGuid("5ccbf01b-65a3-47f5-b916-dab48aab691f");
    _SaleInvoice.Enter_Description("Qui consectetur libero voluptatem itaque temporibus ut.
Inventore debitis nihil et quis non eveniet minus in.
Provident ab animi maxime excepturi eum.
Molestias dolorem odit doloremque est temporibus.
Libero suscipit molestias ut deleniti facilis sequi libero.
Praesentium officia alias.
Sit cumque dolorem excepturi nihil nostrum ipsum.
Architecto aut qui cum voluptas nihil et dolorum et assumenda.
Sunt consequatur in eaque nihil.
Magnam non incidunt et eaque eos sequi excepturi nostrum sed.");
    

    TestModellerLogger.SetLastNodeGuid("73677a32-1892-47f6-9783-a1072478778a");
    _SaleInvoice.Enter_UnitPrice("");
    

    TestModellerLogger.SetLastNodeGuid("d810d5bf-a960-434c-9172-1671dd383495");
    _SaleInvoice.Enter_Quantity("");
    

    TestModellerLogger.SetLastNodeGuid("516c7236-f043-4de9-b128-99997ccf1604");
    _SaleInvoice.Select_VATRate("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("cb6d5101-0be0-4519-b1aa-5e71dcdfbef3");
    _SaleInvoice.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("6aeae28b-fd85-4712-8710-18e4b190dd19");
    _SaleInvoice.Enter_Note("");
    

    TestModellerLogger.SetLastNodeGuid("2508d3fa-348f-48f2-914a-4d43591ded90");
    _SaleInvoice.Click_SaveButton();
    

    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("3MNE8dFcNA");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
    _AgentSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("aut");
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Rutherford - Fritsch");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
    _bankmenu.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
    _bankmenu.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
    _bankmenu.Click_Bankingmenu();
    

    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
    _bankmenu.Click_Newmenu();
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
    _nBANKTRN.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
    _nBANKTRN.Select_BK_SELECT("nidhibank");
    

    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
    _nBANKTRN.Enter_NDate("44266");
    

    TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
    _nBANKTRN.Enter_n_desc("");
    

    TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
    _nBANKTRN.Enter_Recived_amt("");
    

    TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
    _nBANKTRN.Enter_spnt_amt("");
    

    TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
    _nBANKTRN.Select_Select_VATRate("Reduced Rate");
    

    TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
    _nBANKTRN.Click_Select_Option1();
    

    TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
    _nBANKTRN.Enter_BOX2("");
    

    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

pages.Reconcilation _Reconcilation = new pages.Reconcilation(driver);
    TestModellerLogger.SetLastNodeGuid("fc1c2835-8b62-466d-8b91-b2d2b6852de5");
    _Reconcilation.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("30a799ca-18ec-4e8a-9931-57fc4ea2c02b");
    _Reconcilation.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5fa7c856-5fe6-458c-94fd-c74460dd9b1f");
    _Reconcilation.Click_Acntantleftmenu();
    

    TestModellerLogger.SetLastNodeGuid("2f750f49-e648-45ca-898e-d60728db5570");
    _Reconcilation.Click_plussign();
    

    TestModellerLogger.SetLastNodeGuid("a3808a66-3e56-4e52-b2c1-61b7d5d15b32");
    _Reconcilation.Select_SelectAccountType1("Creditors due after one year");
    

    TestModellerLogger.SetLastNodeGuid("2018e2d9-51c8-4e54-8424-0f5147db31d6");
    _Reconcilation.Select_SelectAccount1("All");
    

    TestModellerLogger.SetLastNodeGuid("0892baec-0422-496a-93f9-1028cef59d2c");
    _Reconcilation.Click_View_Reconciled_button1();
    

pages.Reconsilecount _Reconsilecount = new pages.Reconsilecount(driver);
    TestModellerLogger.SetLastNodeGuid("20ec992d-e923-4cd2-946b-1f6e59b73bf6");
    _Reconsilecount.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("778b3b22-188b-4954-8194-ffafa2c2d9c2");
    _Reconsilecount.Click_R1();
    

    TestModellerLogger.SetLastNodeGuid("0fc72130-6b3a-4342-9d0e-19804563923c");
    _Reconsilecount.Click_R2();
    

    TestModellerLogger.SetLastNodeGuid("bccac54a-cf91-4c34-b5de-3168f47f6c6c");
    _Reconsilecount.Click_R3();
    

    TestModellerLogger.SetLastNodeGuid("afa85278-aa67-42ac-9a2e-9d7e8178cae9");
    _Reconsilecount.Click_R4();
    

    TestModellerLogger.SetLastNodeGuid("8be2e142-f2d6-40b4-9f1a-b4f6c31f9776");
    _Reconsilecount.Click_R5();
    

    TestModellerLogger.SetLastNodeGuid("e4e26451-eebc-4ddc-84aa-2abdfce286c3");
    _Reconsilecount.Click_R6();
    

    TestModellerLogger.SetLastNodeGuid("24bb6ec6-e35c-424b-97bf-7d95cfb0c096");
    _Reconsilecount.Click_R7();
    

    TestModellerLogger.SetLastNodeGuid("605ff86c-cdca-413d-8743-6d540ebe0d6f");
    _Reconsilecount.Click_R8();
    

    TestModellerLogger.SetLastNodeGuid("5e13f8d0-f1e2-4527-b2df-049aaf7e1d0e");
    _Reconsilecount.Click_R9();
    

    TestModellerLogger.SetLastNodeGuid("3f0eb811-3a59-4e4e-9972-944ae4cc0d33");
    _Reconsilecount.Click_R10();
    

    TestModellerLogger.SetLastNodeGuid("0ae57fc9-3f5d-4114-951b-51a967c72977");
    _Reconsilecount.Click_R100();
    

    TestModellerLogger.SetLastNodeGuid("bc70be77-e7a6-40c0-94d7-4c667fba43a8");
    _Reconsilecount.Click_R11();
    

    TestModellerLogger.SetLastNodeGuid("40cafd20-4a4a-423c-b1f8-b6457dcfc293");
    _Reconsilecount.Click_R12();
    

    TestModellerLogger.SetLastNodeGuid("333f5500-78ad-458f-a383-b6440369d3de");
    _Reconsilecount.Click_R13();
    

    TestModellerLogger.SetLastNodeGuid("ab08b36a-2f76-46cc-8cf0-f6dc93b8213c");
    _Reconsilecount.Click_R14();
    

    TestModellerLogger.SetLastNodeGuid("ab7f2182-853d-4064-8d23-3ed12179a136");
    _Reconsilecount.Click_R15();
    

    TestModellerLogger.SetLastNodeGuid("6966e097-d89b-4907-b08e-0e68c988cac1");
    _Reconsilecount.Click_R16();
    

    TestModellerLogger.SetLastNodeGuid("5f153217-83e2-4727-89af-4b63829d3f86");
    _Reconsilecount.Click_R17();
    

    TestModellerLogger.SetLastNodeGuid("2437587a-af3c-4c95-8b5f-bba6c149170e");
    _Reconsilecount.Click_R18();
    

    TestModellerLogger.SetLastNodeGuid("2459c2b4-3bfc-481c-a024-a8b07ffb4253");
    _Reconsilecount.Click_R19();
    

    TestModellerLogger.SetLastNodeGuid("7afa71ce-7cce-4ada-8b31-6b446ee3611f");
    _Reconsilecount.Click_R20();
    

    TestModellerLogger.SetLastNodeGuid("130229df-4174-47ff-b315-4e797e797be2");
    _Reconsilecount.Click_R21();
    

    TestModellerLogger.SetLastNodeGuid("67a8a70d-5168-4f86-8da8-7838512ad558");
    _Reconsilecount.Click_R22();
    

    TestModellerLogger.SetLastNodeGuid("69e73e5a-7c35-43b8-b74e-686f7b89d6f5");
    _Reconsilecount.Click_R23();
    

    TestModellerLogger.SetLastNodeGuid("37e489d4-7649-4e8e-8982-e68c437511f0");
    _Reconsilecount.Click_R24();
    

    TestModellerLogger.SetLastNodeGuid("b295b7ea-4eae-4326-90c8-7bc01145c021");
    _Reconsilecount.Click_R25();
    

    TestModellerLogger.SetLastNodeGuid("0016602a-7419-4e1c-843c-4f82ce17b4f9");
    _Reconsilecount.Click_R26();
    

    TestModellerLogger.SetLastNodeGuid("fcf9dc5c-45e6-4309-bceb-fde0aeeaeec2");
    _Reconsilecount.Click_R27();
    

    TestModellerLogger.SetLastNodeGuid("95a7e0ac-fd21-408c-9d9c-027004930449");
    _Reconsilecount.Click_R28();
    

    TestModellerLogger.SetLastNodeGuid("4aa503fb-8b18-4e77-bcda-9559679043d5");
    _Reconsilecount.Click_R29();
    

    TestModellerLogger.SetLastNodeGuid("bc0de1d6-d59c-4900-899d-8bb3da5f1abd");
    _Reconsilecount.Click_R30();
    

    TestModellerLogger.SetLastNodeGuid("9bcccc53-1773-466b-b426-6ee41539f8e3");
    _Reconsilecount.Select_R31("Partial Reconcile");
    

    TestModellerLogger.SetLastNodeGuid("154f0835-2441-4733-9a24-ba5927a5e7e1");
    _Reconsilecount.Click_Success_Transactions_reconciled_successfully();
    

    }

    @Test  (groups= {"SaleInToReconcile","SaleInToReconcile - Default Profile"})
    @TestModellerPath(guid = "c129d6f2-dab7-4093-9887-d0f4e97aa1a0")
    public void GoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClickAgents18()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("aH2imRZmfx");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
    _AgentSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("fugiat");
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Wiegand, Johns and Wilderman");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.SaleInvoice _SaleInvoice = new pages.SaleInvoice(driver);
    TestModellerLogger.SetLastNodeGuid("2f331494-c0ec-443e-b258-bdf3d2f9d9fc");
    _SaleInvoice.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("281121da-f0ce-4629-a4d1-0bc9b4260347");
    _SaleInvoice.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("38510c8a-daac-4ff8-83f3-54b176440787");
    _SaleInvoice.Click_SalesTab();
    

    TestModellerLogger.SetLastNodeGuid("2ce6ef22-01ee-4e82-bcb0-f7ce06badd95");
    _SaleInvoice.Click_NewButton();
    

    TestModellerLogger.SetLastNodeGuid("b605bf48-53b8-4f7f-a009-9ea8d59b69ba");
    _SaleInvoice.Click_NewInvoice();
    

    TestModellerLogger.SetLastNodeGuid("4e83b316-7f8b-49b7-a97f-e85cefb020f0");
    _SaleInvoice.Select_CustomerName("nid");
    

    TestModellerLogger.SetLastNodeGuid("f3edcc35-8d70-4902-81f0-9c5d760fac46");
    _SaleInvoice.Enter_InvoiceNo("");
    

    TestModellerLogger.SetLastNodeGuid("6f885a16-e34c-4d0d-914a-a726c1fa9617");
    _SaleInvoice.Enter_InvoiceDate("44266");
    

    TestModellerLogger.SetLastNodeGuid("294097b8-ccc5-4eb7-baec-1a26ca1364f0");
    _SaleInvoice.Select_IncomeType("");
    

    TestModellerLogger.SetLastNodeGuid("5ccbf01b-65a3-47f5-b916-dab48aab691f");
    _SaleInvoice.Enter_Description("Perferendis illum aut.
Ratione quaerat sequi illo repudiandae nesciunt velit voluptatem.
Numquam dicta quia unde repellat ab sit.
Quia quis ipsum in.
Et ut qui odio qui nostrum voluptatem rem.
Et enim tenetur officiis dolorem.
Eos architecto dolorum.
Eum aut animi expedita facere exercitationem tenetur.
Dolorum consequatur saepe provident quidem.
Quas ex aut quia.");
    

    TestModellerLogger.SetLastNodeGuid("73677a32-1892-47f6-9783-a1072478778a");
    _SaleInvoice.Enter_UnitPrice("");
    

    TestModellerLogger.SetLastNodeGuid("d810d5bf-a960-434c-9172-1671dd383495");
    _SaleInvoice.Enter_Quantity("");
    

    TestModellerLogger.SetLastNodeGuid("516c7236-f043-4de9-b128-99997ccf1604");
    _SaleInvoice.Select_VATRate("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("cb6d5101-0be0-4519-b1aa-5e71dcdfbef3");
    _SaleInvoice.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("6aeae28b-fd85-4712-8710-18e4b190dd19");
    _SaleInvoice.Enter_Note("");
    

    TestModellerLogger.SetLastNodeGuid("2508d3fa-348f-48f2-914a-4d43591ded90");
    _SaleInvoice.Click_SaveButton();
    

    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("IDeCXvkx4Y");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
    _AgentSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("rem");
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Reilly Group");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
    _bankmenu.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
    _bankmenu.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
    _bankmenu.Click_Bankingmenu();
    

    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
    _bankmenu.Click_Newmenu();
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
    _nBANKTRN.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
    _nBANKTRN.Select_BK_SELECT("nidhibank");
    

    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
    _nBANKTRN.Enter_NDate("44266");
    

    TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
    _nBANKTRN.Enter_n_desc("");
    

    TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
    _nBANKTRN.Enter_Recived_amt("");
    

    TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
    _nBANKTRN.Enter_spnt_amt("");
    

    TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
    _nBANKTRN.Select_Select_VATRate("No VAT");
    

    TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
    _nBANKTRN.Click_Select_Option1();
    

    TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
    _nBANKTRN.Enter_BOX2("");
    

    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

pages.Reconcilation _Reconcilation = new pages.Reconcilation(driver);
    TestModellerLogger.SetLastNodeGuid("fc1c2835-8b62-466d-8b91-b2d2b6852de5");
    _Reconcilation.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("30a799ca-18ec-4e8a-9931-57fc4ea2c02b");
    _Reconcilation.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5fa7c856-5fe6-458c-94fd-c74460dd9b1f");
    _Reconcilation.Click_Acntantleftmenu();
    

    TestModellerLogger.SetLastNodeGuid("2f750f49-e648-45ca-898e-d60728db5570");
    _Reconcilation.Click_plussign();
    

    TestModellerLogger.SetLastNodeGuid("a3808a66-3e56-4e52-b2c1-61b7d5d15b32");
    _Reconcilation.Select_SelectAccountType1("Creditors due after one year");
    

    TestModellerLogger.SetLastNodeGuid("2018e2d9-51c8-4e54-8424-0f5147db31d6");
    _Reconcilation.Select_SelectAccount1("All");
    

    TestModellerLogger.SetLastNodeGuid("0892baec-0422-496a-93f9-1028cef59d2c");
    _Reconcilation.Click_View_Reconciled_button1();
    

pages.Reconsilecount _Reconsilecount = new pages.Reconsilecount(driver);
    TestModellerLogger.SetLastNodeGuid("20ec992d-e923-4cd2-946b-1f6e59b73bf6");
    _Reconsilecount.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("778b3b22-188b-4954-8194-ffafa2c2d9c2");
    _Reconsilecount.Click_R1();
    

    TestModellerLogger.SetLastNodeGuid("0fc72130-6b3a-4342-9d0e-19804563923c");
    _Reconsilecount.Click_R2();
    

    TestModellerLogger.SetLastNodeGuid("bccac54a-cf91-4c34-b5de-3168f47f6c6c");
    _Reconsilecount.Click_R3();
    

    TestModellerLogger.SetLastNodeGuid("afa85278-aa67-42ac-9a2e-9d7e8178cae9");
    _Reconsilecount.Click_R4();
    

    TestModellerLogger.SetLastNodeGuid("8be2e142-f2d6-40b4-9f1a-b4f6c31f9776");
    _Reconsilecount.Click_R5();
    

    TestModellerLogger.SetLastNodeGuid("e4e26451-eebc-4ddc-84aa-2abdfce286c3");
    _Reconsilecount.Click_R6();
    

    TestModellerLogger.SetLastNodeGuid("24bb6ec6-e35c-424b-97bf-7d95cfb0c096");
    _Reconsilecount.Click_R7();
    

    TestModellerLogger.SetLastNodeGuid("605ff86c-cdca-413d-8743-6d540ebe0d6f");
    _Reconsilecount.Click_R8();
    

    TestModellerLogger.SetLastNodeGuid("5e13f8d0-f1e2-4527-b2df-049aaf7e1d0e");
    _Reconsilecount.Click_R9();
    

    TestModellerLogger.SetLastNodeGuid("3f0eb811-3a59-4e4e-9972-944ae4cc0d33");
    _Reconsilecount.Click_R10();
    

    TestModellerLogger.SetLastNodeGuid("0ae57fc9-3f5d-4114-951b-51a967c72977");
    _Reconsilecount.Click_R100();
    

    TestModellerLogger.SetLastNodeGuid("bc70be77-e7a6-40c0-94d7-4c667fba43a8");
    _Reconsilecount.Click_R11();
    

    TestModellerLogger.SetLastNodeGuid("40cafd20-4a4a-423c-b1f8-b6457dcfc293");
    _Reconsilecount.Click_R12();
    

    TestModellerLogger.SetLastNodeGuid("333f5500-78ad-458f-a383-b6440369d3de");
    _Reconsilecount.Click_R13();
    

    TestModellerLogger.SetLastNodeGuid("ab08b36a-2f76-46cc-8cf0-f6dc93b8213c");
    _Reconsilecount.Click_R14();
    

    TestModellerLogger.SetLastNodeGuid("ab7f2182-853d-4064-8d23-3ed12179a136");
    _Reconsilecount.Click_R15();
    

    TestModellerLogger.SetLastNodeGuid("6966e097-d89b-4907-b08e-0e68c988cac1");
    _Reconsilecount.Click_R16();
    

    TestModellerLogger.SetLastNodeGuid("5f153217-83e2-4727-89af-4b63829d3f86");
    _Reconsilecount.Click_R17();
    

    TestModellerLogger.SetLastNodeGuid("2437587a-af3c-4c95-8b5f-bba6c149170e");
    _Reconsilecount.Click_R18();
    

    TestModellerLogger.SetLastNodeGuid("2459c2b4-3bfc-481c-a024-a8b07ffb4253");
    _Reconsilecount.Click_R19();
    

    TestModellerLogger.SetLastNodeGuid("7afa71ce-7cce-4ada-8b31-6b446ee3611f");
    _Reconsilecount.Click_R20();
    

    TestModellerLogger.SetLastNodeGuid("130229df-4174-47ff-b315-4e797e797be2");
    _Reconsilecount.Click_R21();
    

    TestModellerLogger.SetLastNodeGuid("67a8a70d-5168-4f86-8da8-7838512ad558");
    _Reconsilecount.Click_R22();
    

    TestModellerLogger.SetLastNodeGuid("69e73e5a-7c35-43b8-b74e-686f7b89d6f5");
    _Reconsilecount.Click_R23();
    

    TestModellerLogger.SetLastNodeGuid("37e489d4-7649-4e8e-8982-e68c437511f0");
    _Reconsilecount.Click_R24();
    

    TestModellerLogger.SetLastNodeGuid("b295b7ea-4eae-4326-90c8-7bc01145c021");
    _Reconsilecount.Click_R25();
    

    TestModellerLogger.SetLastNodeGuid("0016602a-7419-4e1c-843c-4f82ce17b4f9");
    _Reconsilecount.Click_R26();
    

    TestModellerLogger.SetLastNodeGuid("fcf9dc5c-45e6-4309-bceb-fde0aeeaeec2");
    _Reconsilecount.Click_R27();
    

    TestModellerLogger.SetLastNodeGuid("95a7e0ac-fd21-408c-9d9c-027004930449");
    _Reconsilecount.Click_R28();
    

    TestModellerLogger.SetLastNodeGuid("4aa503fb-8b18-4e77-bcda-9559679043d5");
    _Reconsilecount.Click_R29();
    

    TestModellerLogger.SetLastNodeGuid("bc0de1d6-d59c-4900-899d-8bb3da5f1abd");
    _Reconsilecount.Click_R30();
    

    TestModellerLogger.SetLastNodeGuid("9bcccc53-1773-466b-b426-6ee41539f8e3");
    _Reconsilecount.Select_R31("Partial Reconcile");
    

    TestModellerLogger.SetLastNodeGuid("154f0835-2441-4733-9a24-ba5927a5e7e1");
    _Reconsilecount.Click_Success_Transactions_reconciled_successfully();
    

    }

    @Test  (groups= {"SaleInToReconcile","SaleInToReconcile - Default Profile"})
    @TestModellerPath(guid = "5ff2208e-f2de-47a7-befe-fcb68c63b5c1")
    public void GoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClickAgents19()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("XEZeXByda4");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
    _AgentSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("impedit");
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Smitham - Gerlach");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.SaleInvoice _SaleInvoice = new pages.SaleInvoice(driver);
    TestModellerLogger.SetLastNodeGuid("2f331494-c0ec-443e-b258-bdf3d2f9d9fc");
    _SaleInvoice.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("281121da-f0ce-4629-a4d1-0bc9b4260347");
    _SaleInvoice.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("38510c8a-daac-4ff8-83f3-54b176440787");
    _SaleInvoice.Click_SalesTab();
    

    TestModellerLogger.SetLastNodeGuid("2ce6ef22-01ee-4e82-bcb0-f7ce06badd95");
    _SaleInvoice.Click_NewButton();
    

    TestModellerLogger.SetLastNodeGuid("b605bf48-53b8-4f7f-a009-9ea8d59b69ba");
    _SaleInvoice.Click_NewInvoice();
    

    TestModellerLogger.SetLastNodeGuid("4e83b316-7f8b-49b7-a97f-e85cefb020f0");
    _SaleInvoice.Select_CustomerName("nid");
    

    TestModellerLogger.SetLastNodeGuid("f3edcc35-8d70-4902-81f0-9c5d760fac46");
    _SaleInvoice.Enter_InvoiceNo("");
    

    TestModellerLogger.SetLastNodeGuid("6f885a16-e34c-4d0d-914a-a726c1fa9617");
    _SaleInvoice.Enter_InvoiceDate("44266");
    

    TestModellerLogger.SetLastNodeGuid("294097b8-ccc5-4eb7-baec-1a26ca1364f0");
    _SaleInvoice.Select_IncomeType("");
    

    TestModellerLogger.SetLastNodeGuid("5ccbf01b-65a3-47f5-b916-dab48aab691f");
    _SaleInvoice.Enter_Description("Voluptate vel ut nulla sed.
Doloribus est doloribus pariatur provident aut illum facere.
Eius soluta facere quod repellendus dolore id saepe.
Ea odit ut optio soluta doloremque ad nisi adipisci.
Nihil nihil possimus vitae ipsam ex quia.
Quod cupiditate veritatis doloremque aut quia voluptatibus.
Et eveniet explicabo.
Consequatur aut et fugit corrupti aut.
Nostrum explicabo sapiente sunt.
Nobis ad voluptas tempora.");
    

    TestModellerLogger.SetLastNodeGuid("73677a32-1892-47f6-9783-a1072478778a");
    _SaleInvoice.Enter_UnitPrice("");
    

    TestModellerLogger.SetLastNodeGuid("d810d5bf-a960-434c-9172-1671dd383495");
    _SaleInvoice.Enter_Quantity("");
    

    TestModellerLogger.SetLastNodeGuid("516c7236-f043-4de9-b128-99997ccf1604");
    _SaleInvoice.Select_VATRate("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("cb6d5101-0be0-4519-b1aa-5e71dcdfbef3");
    _SaleInvoice.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("6aeae28b-fd85-4712-8710-18e4b190dd19");
    _SaleInvoice.Enter_Note("");
    

    TestModellerLogger.SetLastNodeGuid("2508d3fa-348f-48f2-914a-4d43591ded90");
    _SaleInvoice.Click_SaveButton();
    

    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("5uXs_U2SaO");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
    _AgentSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("laudantium");
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Champlin, Batz and Thompson");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
    _bankmenu.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
    _bankmenu.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
    _bankmenu.Click_Bankingmenu();
    

    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
    _bankmenu.Click_Newmenu();
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
    _nBANKTRN.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
    _nBANKTRN.Select_BK_SELECT("nidhibank");
    

    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
    _nBANKTRN.Enter_NDate("44266");
    

    TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
    _nBANKTRN.Enter_n_desc("");
    

    TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
    _nBANKTRN.Enter_Recived_amt("");
    

    TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
    _nBANKTRN.Enter_spnt_amt("");
    

    TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
    _nBANKTRN.Select_Select_VATRate("Exempt");
    

    TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
    _nBANKTRN.Click_Select_Option1();
    

    TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
    _nBANKTRN.Enter_BOX2("");
    

    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

pages.Reconcilation _Reconcilation = new pages.Reconcilation(driver);
    TestModellerLogger.SetLastNodeGuid("fc1c2835-8b62-466d-8b91-b2d2b6852de5");
    _Reconcilation.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("30a799ca-18ec-4e8a-9931-57fc4ea2c02b");
    _Reconcilation.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5fa7c856-5fe6-458c-94fd-c74460dd9b1f");
    _Reconcilation.Click_Acntantleftmenu();
    

    TestModellerLogger.SetLastNodeGuid("2f750f49-e648-45ca-898e-d60728db5570");
    _Reconcilation.Click_plussign();
    

    TestModellerLogger.SetLastNodeGuid("a3808a66-3e56-4e52-b2c1-61b7d5d15b32");
    _Reconcilation.Select_SelectAccountType1("Creditors due after one year");
    

    TestModellerLogger.SetLastNodeGuid("2018e2d9-51c8-4e54-8424-0f5147db31d6");
    _Reconcilation.Select_SelectAccount1("All");
    

    TestModellerLogger.SetLastNodeGuid("0892baec-0422-496a-93f9-1028cef59d2c");
    _Reconcilation.Click_View_Reconciled_button1();
    

pages.Reconsilecount _Reconsilecount = new pages.Reconsilecount(driver);
    TestModellerLogger.SetLastNodeGuid("20ec992d-e923-4cd2-946b-1f6e59b73bf6");
    _Reconsilecount.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("778b3b22-188b-4954-8194-ffafa2c2d9c2");
    _Reconsilecount.Click_R1();
    

    TestModellerLogger.SetLastNodeGuid("0fc72130-6b3a-4342-9d0e-19804563923c");
    _Reconsilecount.Click_R2();
    

    TestModellerLogger.SetLastNodeGuid("bccac54a-cf91-4c34-b5de-3168f47f6c6c");
    _Reconsilecount.Click_R3();
    

    TestModellerLogger.SetLastNodeGuid("afa85278-aa67-42ac-9a2e-9d7e8178cae9");
    _Reconsilecount.Click_R4();
    

    TestModellerLogger.SetLastNodeGuid("8be2e142-f2d6-40b4-9f1a-b4f6c31f9776");
    _Reconsilecount.Click_R5();
    

    TestModellerLogger.SetLastNodeGuid("e4e26451-eebc-4ddc-84aa-2abdfce286c3");
    _Reconsilecount.Click_R6();
    

    TestModellerLogger.SetLastNodeGuid("24bb6ec6-e35c-424b-97bf-7d95cfb0c096");
    _Reconsilecount.Click_R7();
    

    TestModellerLogger.SetLastNodeGuid("605ff86c-cdca-413d-8743-6d540ebe0d6f");
    _Reconsilecount.Click_R8();
    

    TestModellerLogger.SetLastNodeGuid("5e13f8d0-f1e2-4527-b2df-049aaf7e1d0e");
    _Reconsilecount.Click_R9();
    

    TestModellerLogger.SetLastNodeGuid("3f0eb811-3a59-4e4e-9972-944ae4cc0d33");
    _Reconsilecount.Click_R10();
    

    TestModellerLogger.SetLastNodeGuid("0ae57fc9-3f5d-4114-951b-51a967c72977");
    _Reconsilecount.Click_R100();
    

    TestModellerLogger.SetLastNodeGuid("bc70be77-e7a6-40c0-94d7-4c667fba43a8");
    _Reconsilecount.Click_R11();
    

    TestModellerLogger.SetLastNodeGuid("40cafd20-4a4a-423c-b1f8-b6457dcfc293");
    _Reconsilecount.Click_R12();
    

    TestModellerLogger.SetLastNodeGuid("333f5500-78ad-458f-a383-b6440369d3de");
    _Reconsilecount.Click_R13();
    

    TestModellerLogger.SetLastNodeGuid("ab08b36a-2f76-46cc-8cf0-f6dc93b8213c");
    _Reconsilecount.Click_R14();
    

    TestModellerLogger.SetLastNodeGuid("ab7f2182-853d-4064-8d23-3ed12179a136");
    _Reconsilecount.Click_R15();
    

    TestModellerLogger.SetLastNodeGuid("6966e097-d89b-4907-b08e-0e68c988cac1");
    _Reconsilecount.Click_R16();
    

    TestModellerLogger.SetLastNodeGuid("5f153217-83e2-4727-89af-4b63829d3f86");
    _Reconsilecount.Click_R17();
    

    TestModellerLogger.SetLastNodeGuid("2437587a-af3c-4c95-8b5f-bba6c149170e");
    _Reconsilecount.Click_R18();
    

    TestModellerLogger.SetLastNodeGuid("2459c2b4-3bfc-481c-a024-a8b07ffb4253");
    _Reconsilecount.Click_R19();
    

    TestModellerLogger.SetLastNodeGuid("7afa71ce-7cce-4ada-8b31-6b446ee3611f");
    _Reconsilecount.Click_R20();
    

    TestModellerLogger.SetLastNodeGuid("130229df-4174-47ff-b315-4e797e797be2");
    _Reconsilecount.Click_R21();
    

    TestModellerLogger.SetLastNodeGuid("67a8a70d-5168-4f86-8da8-7838512ad558");
    _Reconsilecount.Click_R22();
    

    TestModellerLogger.SetLastNodeGuid("69e73e5a-7c35-43b8-b74e-686f7b89d6f5");
    _Reconsilecount.Click_R23();
    

    TestModellerLogger.SetLastNodeGuid("37e489d4-7649-4e8e-8982-e68c437511f0");
    _Reconsilecount.Click_R24();
    

    TestModellerLogger.SetLastNodeGuid("b295b7ea-4eae-4326-90c8-7bc01145c021");
    _Reconsilecount.Click_R25();
    

    TestModellerLogger.SetLastNodeGuid("0016602a-7419-4e1c-843c-4f82ce17b4f9");
    _Reconsilecount.Click_R26();
    

    TestModellerLogger.SetLastNodeGuid("fcf9dc5c-45e6-4309-bceb-fde0aeeaeec2");
    _Reconsilecount.Click_R27();
    

    TestModellerLogger.SetLastNodeGuid("95a7e0ac-fd21-408c-9d9c-027004930449");
    _Reconsilecount.Click_R28();
    

    TestModellerLogger.SetLastNodeGuid("4aa503fb-8b18-4e77-bcda-9559679043d5");
    _Reconsilecount.Click_R29();
    

    TestModellerLogger.SetLastNodeGuid("bc0de1d6-d59c-4900-899d-8bb3da5f1abd");
    _Reconsilecount.Click_R30();
    

    TestModellerLogger.SetLastNodeGuid("9bcccc53-1773-466b-b426-6ee41539f8e3");
    _Reconsilecount.Select_R31("Partial Reconcile");
    

    TestModellerLogger.SetLastNodeGuid("154f0835-2441-4733-9a24-ba5927a5e7e1");
    _Reconsilecount.Click_Success_Transactions_reconciled_successfully();
    

    }

    @Test  (groups= {"SaleInToReconcile","SaleInToReconcile - Default Profile"})
    @TestModellerPath(guid = "ad734309-1d5c-42cc-9281-c9c41e8c8e99")
    public void GoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClickAgents20()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("xE_InCm2mY");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
    _AgentSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("repudiandae");
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Purdy, Gerhold and Bergnaum");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.SaleInvoice _SaleInvoice = new pages.SaleInvoice(driver);
    TestModellerLogger.SetLastNodeGuid("2f331494-c0ec-443e-b258-bdf3d2f9d9fc");
    _SaleInvoice.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("281121da-f0ce-4629-a4d1-0bc9b4260347");
    _SaleInvoice.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("38510c8a-daac-4ff8-83f3-54b176440787");
    _SaleInvoice.Click_SalesTab();
    

    TestModellerLogger.SetLastNodeGuid("2ce6ef22-01ee-4e82-bcb0-f7ce06badd95");
    _SaleInvoice.Click_NewButton();
    

    TestModellerLogger.SetLastNodeGuid("b605bf48-53b8-4f7f-a009-9ea8d59b69ba");
    _SaleInvoice.Click_NewInvoice();
    

    TestModellerLogger.SetLastNodeGuid("4e83b316-7f8b-49b7-a97f-e85cefb020f0");
    _SaleInvoice.Select_CustomerName("nid");
    

    TestModellerLogger.SetLastNodeGuid("f3edcc35-8d70-4902-81f0-9c5d760fac46");
    _SaleInvoice.Enter_InvoiceNo("");
    

    TestModellerLogger.SetLastNodeGuid("6f885a16-e34c-4d0d-914a-a726c1fa9617");
    _SaleInvoice.Enter_InvoiceDate("44266");
    

    TestModellerLogger.SetLastNodeGuid("294097b8-ccc5-4eb7-baec-1a26ca1364f0");
    _SaleInvoice.Select_IncomeType("");
    

    TestModellerLogger.SetLastNodeGuid("5ccbf01b-65a3-47f5-b916-dab48aab691f");
    _SaleInvoice.Enter_Description("Iusto pariatur optio eum deleniti nostrum quod nulla.
Beatae itaque delectus illo fugit aliquid quia non voluptatibus.
Autem odio rerum ut assumenda facere quasi dolores.
Ducimus facere at itaque rem.
Aliquam quia ducimus libero ducimus odit et.
Rem iste necessitatibus ea omnis vitae praesentium.
Cumque quisquam non est minima.
Qui non beatae voluptate nesciunt atque in.
Modi alias quos.
Vero incidunt debitis perspiciatis sed dolorum.");
    

    TestModellerLogger.SetLastNodeGuid("73677a32-1892-47f6-9783-a1072478778a");
    _SaleInvoice.Enter_UnitPrice("");
    

    TestModellerLogger.SetLastNodeGuid("d810d5bf-a960-434c-9172-1671dd383495");
    _SaleInvoice.Enter_Quantity("");
    

    TestModellerLogger.SetLastNodeGuid("516c7236-f043-4de9-b128-99997ccf1604");
    _SaleInvoice.Select_VATRate("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("cb6d5101-0be0-4519-b1aa-5e71dcdfbef3");
    _SaleInvoice.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("6aeae28b-fd85-4712-8710-18e4b190dd19");
    _SaleInvoice.Enter_Note("");
    

    TestModellerLogger.SetLastNodeGuid("2508d3fa-348f-48f2-914a-4d43591ded90");
    _SaleInvoice.Click_SaveButton();
    

    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("XIDqCkBcC7");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
    _AgentSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("nulla");
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Roob - O'Reilly");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
    _bankmenu.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
    _bankmenu.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
    _bankmenu.Click_Bankingmenu();
    

    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
    _bankmenu.Click_Newmenu();
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
    _nBANKTRN.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
    _nBANKTRN.Select_BK_SELECT("nidhibank");
    

    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
    _nBANKTRN.Enter_NDate("44266.731128599538");
    

    TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
    _nBANKTRN.Enter_n_desc("");
    

    TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
    _nBANKTRN.Enter_Recived_amt("");
    

    TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
    _nBANKTRN.Enter_spnt_amt("");
    

    TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
    _nBANKTRN.Select_Select_VATRate("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
    _nBANKTRN.Click_Select_Option1();
    

    TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
    _nBANKTRN.Enter_BOX2("");
    

    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

pages.Reconcilation _Reconcilation = new pages.Reconcilation(driver);
    TestModellerLogger.SetLastNodeGuid("fc1c2835-8b62-466d-8b91-b2d2b6852de5");
    _Reconcilation.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("30a799ca-18ec-4e8a-9931-57fc4ea2c02b");
    _Reconcilation.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5fa7c856-5fe6-458c-94fd-c74460dd9b1f");
    _Reconcilation.Click_Acntantleftmenu();
    

    TestModellerLogger.SetLastNodeGuid("2f750f49-e648-45ca-898e-d60728db5570");
    _Reconcilation.Click_plussign();
    

    TestModellerLogger.SetLastNodeGuid("a3808a66-3e56-4e52-b2c1-61b7d5d15b32");
    _Reconcilation.Select_SelectAccountType1("Creditors due after one year");
    

    TestModellerLogger.SetLastNodeGuid("2018e2d9-51c8-4e54-8424-0f5147db31d6");
    _Reconcilation.Select_SelectAccount1("All");
    

    TestModellerLogger.SetLastNodeGuid("0892baec-0422-496a-93f9-1028cef59d2c");
    _Reconcilation.Click_View_Reconciled_button1();
    

pages.Reconsilecount _Reconsilecount = new pages.Reconsilecount(driver);
    TestModellerLogger.SetLastNodeGuid("20ec992d-e923-4cd2-946b-1f6e59b73bf6");
    _Reconsilecount.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("778b3b22-188b-4954-8194-ffafa2c2d9c2");
    _Reconsilecount.Click_R1();
    

    TestModellerLogger.SetLastNodeGuid("0fc72130-6b3a-4342-9d0e-19804563923c");
    _Reconsilecount.Click_R2();
    

    TestModellerLogger.SetLastNodeGuid("bccac54a-cf91-4c34-b5de-3168f47f6c6c");
    _Reconsilecount.Click_R3();
    

    TestModellerLogger.SetLastNodeGuid("afa85278-aa67-42ac-9a2e-9d7e8178cae9");
    _Reconsilecount.Click_R4();
    

    TestModellerLogger.SetLastNodeGuid("8be2e142-f2d6-40b4-9f1a-b4f6c31f9776");
    _Reconsilecount.Click_R5();
    

    TestModellerLogger.SetLastNodeGuid("e4e26451-eebc-4ddc-84aa-2abdfce286c3");
    _Reconsilecount.Click_R6();
    

    TestModellerLogger.SetLastNodeGuid("24bb6ec6-e35c-424b-97bf-7d95cfb0c096");
    _Reconsilecount.Click_R7();
    

    TestModellerLogger.SetLastNodeGuid("605ff86c-cdca-413d-8743-6d540ebe0d6f");
    _Reconsilecount.Click_R8();
    

    TestModellerLogger.SetLastNodeGuid("5e13f8d0-f1e2-4527-b2df-049aaf7e1d0e");
    _Reconsilecount.Click_R9();
    

    TestModellerLogger.SetLastNodeGuid("3f0eb811-3a59-4e4e-9972-944ae4cc0d33");
    _Reconsilecount.Click_R10();
    

    TestModellerLogger.SetLastNodeGuid("0ae57fc9-3f5d-4114-951b-51a967c72977");
    _Reconsilecount.Click_R100();
    

    TestModellerLogger.SetLastNodeGuid("bc70be77-e7a6-40c0-94d7-4c667fba43a8");
    _Reconsilecount.Click_R11();
    

    TestModellerLogger.SetLastNodeGuid("40cafd20-4a4a-423c-b1f8-b6457dcfc293");
    _Reconsilecount.Click_R12();
    

    TestModellerLogger.SetLastNodeGuid("333f5500-78ad-458f-a383-b6440369d3de");
    _Reconsilecount.Click_R13();
    

    TestModellerLogger.SetLastNodeGuid("ab08b36a-2f76-46cc-8cf0-f6dc93b8213c");
    _Reconsilecount.Click_R14();
    

    TestModellerLogger.SetLastNodeGuid("ab7f2182-853d-4064-8d23-3ed12179a136");
    _Reconsilecount.Click_R15();
    

    TestModellerLogger.SetLastNodeGuid("6966e097-d89b-4907-b08e-0e68c988cac1");
    _Reconsilecount.Click_R16();
    

    TestModellerLogger.SetLastNodeGuid("5f153217-83e2-4727-89af-4b63829d3f86");
    _Reconsilecount.Click_R17();
    

    TestModellerLogger.SetLastNodeGuid("2437587a-af3c-4c95-8b5f-bba6c149170e");
    _Reconsilecount.Click_R18();
    

    TestModellerLogger.SetLastNodeGuid("2459c2b4-3bfc-481c-a024-a8b07ffb4253");
    _Reconsilecount.Click_R19();
    

    TestModellerLogger.SetLastNodeGuid("7afa71ce-7cce-4ada-8b31-6b446ee3611f");
    _Reconsilecount.Click_R20();
    

    TestModellerLogger.SetLastNodeGuid("130229df-4174-47ff-b315-4e797e797be2");
    _Reconsilecount.Click_R21();
    

    TestModellerLogger.SetLastNodeGuid("67a8a70d-5168-4f86-8da8-7838512ad558");
    _Reconsilecount.Click_R22();
    

    TestModellerLogger.SetLastNodeGuid("69e73e5a-7c35-43b8-b74e-686f7b89d6f5");
    _Reconsilecount.Click_R23();
    

    TestModellerLogger.SetLastNodeGuid("37e489d4-7649-4e8e-8982-e68c437511f0");
    _Reconsilecount.Click_R24();
    

    TestModellerLogger.SetLastNodeGuid("b295b7ea-4eae-4326-90c8-7bc01145c021");
    _Reconsilecount.Click_R25();
    

    TestModellerLogger.SetLastNodeGuid("0016602a-7419-4e1c-843c-4f82ce17b4f9");
    _Reconsilecount.Click_R26();
    

    TestModellerLogger.SetLastNodeGuid("fcf9dc5c-45e6-4309-bceb-fde0aeeaeec2");
    _Reconsilecount.Click_R27();
    

    TestModellerLogger.SetLastNodeGuid("95a7e0ac-fd21-408c-9d9c-027004930449");
    _Reconsilecount.Click_R28();
    

    TestModellerLogger.SetLastNodeGuid("4aa503fb-8b18-4e77-bcda-9559679043d5");
    _Reconsilecount.Click_R29();
    

    TestModellerLogger.SetLastNodeGuid("bc0de1d6-d59c-4900-899d-8bb3da5f1abd");
    _Reconsilecount.Click_R30();
    

    TestModellerLogger.SetLastNodeGuid("9bcccc53-1773-466b-b426-6ee41539f8e3");
    _Reconsilecount.Select_R31("Partial Reconcile");
    

    TestModellerLogger.SetLastNodeGuid("154f0835-2441-4733-9a24-ba5927a5e7e1");
    _Reconsilecount.Click_Success_Transactions_reconciled_successfully();
    

    }

    @Test  (groups= {"SaleInToReconcile","SaleInToReconcile - Default Profile"})
    @TestModellerPath(guid = "d70d9531-4dfb-402d-b914-db8cebbbfa44")
    public void GoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClickAgents21()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("KrBxe5S_z_");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
    _AgentSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("esse");
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Lind, Mosciski and Labadie");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.SaleInvoice _SaleInvoice = new pages.SaleInvoice(driver);
    TestModellerLogger.SetLastNodeGuid("2f331494-c0ec-443e-b258-bdf3d2f9d9fc");
    _SaleInvoice.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("281121da-f0ce-4629-a4d1-0bc9b4260347");
    _SaleInvoice.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("38510c8a-daac-4ff8-83f3-54b176440787");
    _SaleInvoice.Click_SalesTab();
    

    TestModellerLogger.SetLastNodeGuid("2ce6ef22-01ee-4e82-bcb0-f7ce06badd95");
    _SaleInvoice.Click_NewButton();
    

    TestModellerLogger.SetLastNodeGuid("b605bf48-53b8-4f7f-a009-9ea8d59b69ba");
    _SaleInvoice.Click_NewInvoice();
    

    TestModellerLogger.SetLastNodeGuid("4e83b316-7f8b-49b7-a97f-e85cefb020f0");
    _SaleInvoice.Select_CustomerName("nid");
    

    TestModellerLogger.SetLastNodeGuid("f3edcc35-8d70-4902-81f0-9c5d760fac46");
    _SaleInvoice.Enter_InvoiceNo("");
    

    TestModellerLogger.SetLastNodeGuid("6f885a16-e34c-4d0d-914a-a726c1fa9617");
    _SaleInvoice.Enter_InvoiceDate("44266");
    

    TestModellerLogger.SetLastNodeGuid("294097b8-ccc5-4eb7-baec-1a26ca1364f0");
    _SaleInvoice.Select_IncomeType("");
    

    TestModellerLogger.SetLastNodeGuid("5ccbf01b-65a3-47f5-b916-dab48aab691f");
    _SaleInvoice.Enter_Description("Mollitia nemo nesciunt fugiat sint dolor hic officiis.
Optio nulla possimus sed quia.
Impedit vel quis earum omnis voluptas.
Officiis eum culpa esse.
Adipisci itaque sapiente id impedit est dolorem alias magni.
Eum sed vitae esse.
Voluptatibus iusto sint a qui repellendus sint perspiciatis et dolorem.
Hic enim iusto et sit magnam aut molestiae.
Recusandae eum sapiente eos aperiam impedit voluptatem voluptas deleniti.
Aliquam vero dolores voluptate quia iusto ipsam dolorum enim et.");
    

    TestModellerLogger.SetLastNodeGuid("73677a32-1892-47f6-9783-a1072478778a");
    _SaleInvoice.Enter_UnitPrice("");
    

    TestModellerLogger.SetLastNodeGuid("d810d5bf-a960-434c-9172-1671dd383495");
    _SaleInvoice.Enter_Quantity("");
    

    TestModellerLogger.SetLastNodeGuid("516c7236-f043-4de9-b128-99997ccf1604");
    _SaleInvoice.Select_VATRate("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("cb6d5101-0be0-4519-b1aa-5e71dcdfbef3");
    _SaleInvoice.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("6aeae28b-fd85-4712-8710-18e4b190dd19");
    _SaleInvoice.Enter_Note("");
    

    TestModellerLogger.SetLastNodeGuid("2508d3fa-348f-48f2-914a-4d43591ded90");
    _SaleInvoice.Click_SaveButton();
    

    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("kFjcSQXzI2");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
    _AgentSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("ad");
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Thiel, Heidenreich and Hahn");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
    _bankmenu.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
    _bankmenu.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
    _bankmenu.Click_Bankingmenu();
    

    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
    _bankmenu.Click_Newmenu();
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
    _nBANKTRN.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
    _nBANKTRN.Select_BK_SELECT("nidhibank");
    

    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
    _nBANKTRN.Enter_NDate("44266.731128634259");
    

    TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
    _nBANKTRN.Enter_n_desc("");
    

    TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
    _nBANKTRN.Enter_Recived_amt("");
    

    TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
    _nBANKTRN.Enter_spnt_amt("");
    

    TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
    _nBANKTRN.Select_Select_VATRate("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
    _nBANKTRN.Click_Select_Option1();
    

    TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
    _nBANKTRN.Enter_BOX2("");
    

    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

pages.Reconcilation _Reconcilation = new pages.Reconcilation(driver);
    TestModellerLogger.SetLastNodeGuid("fc1c2835-8b62-466d-8b91-b2d2b6852de5");
    _Reconcilation.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("30a799ca-18ec-4e8a-9931-57fc4ea2c02b");
    _Reconcilation.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5fa7c856-5fe6-458c-94fd-c74460dd9b1f");
    _Reconcilation.Click_Acntantleftmenu();
    

    TestModellerLogger.SetLastNodeGuid("2f750f49-e648-45ca-898e-d60728db5570");
    _Reconcilation.Click_plussign();
    

    TestModellerLogger.SetLastNodeGuid("a3808a66-3e56-4e52-b2c1-61b7d5d15b32");
    _Reconcilation.Select_SelectAccountType1("Creditors due after one year");
    

    TestModellerLogger.SetLastNodeGuid("2018e2d9-51c8-4e54-8424-0f5147db31d6");
    _Reconcilation.Select_SelectAccount1("All");
    

    TestModellerLogger.SetLastNodeGuid("0892baec-0422-496a-93f9-1028cef59d2c");
    _Reconcilation.Click_View_Reconciled_button1();
    

pages.Reconsilecount _Reconsilecount = new pages.Reconsilecount(driver);
    TestModellerLogger.SetLastNodeGuid("20ec992d-e923-4cd2-946b-1f6e59b73bf6");
    _Reconsilecount.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("778b3b22-188b-4954-8194-ffafa2c2d9c2");
    _Reconsilecount.Click_R1();
    

    TestModellerLogger.SetLastNodeGuid("0fc72130-6b3a-4342-9d0e-19804563923c");
    _Reconsilecount.Click_R2();
    

    TestModellerLogger.SetLastNodeGuid("bccac54a-cf91-4c34-b5de-3168f47f6c6c");
    _Reconsilecount.Click_R3();
    

    TestModellerLogger.SetLastNodeGuid("afa85278-aa67-42ac-9a2e-9d7e8178cae9");
    _Reconsilecount.Click_R4();
    

    TestModellerLogger.SetLastNodeGuid("8be2e142-f2d6-40b4-9f1a-b4f6c31f9776");
    _Reconsilecount.Click_R5();
    

    TestModellerLogger.SetLastNodeGuid("e4e26451-eebc-4ddc-84aa-2abdfce286c3");
    _Reconsilecount.Click_R6();
    

    TestModellerLogger.SetLastNodeGuid("24bb6ec6-e35c-424b-97bf-7d95cfb0c096");
    _Reconsilecount.Click_R7();
    

    TestModellerLogger.SetLastNodeGuid("605ff86c-cdca-413d-8743-6d540ebe0d6f");
    _Reconsilecount.Click_R8();
    

    TestModellerLogger.SetLastNodeGuid("5e13f8d0-f1e2-4527-b2df-049aaf7e1d0e");
    _Reconsilecount.Click_R9();
    

    TestModellerLogger.SetLastNodeGuid("3f0eb811-3a59-4e4e-9972-944ae4cc0d33");
    _Reconsilecount.Click_R10();
    

    TestModellerLogger.SetLastNodeGuid("0ae57fc9-3f5d-4114-951b-51a967c72977");
    _Reconsilecount.Click_R100();
    

    TestModellerLogger.SetLastNodeGuid("bc70be77-e7a6-40c0-94d7-4c667fba43a8");
    _Reconsilecount.Click_R11();
    

    TestModellerLogger.SetLastNodeGuid("40cafd20-4a4a-423c-b1f8-b6457dcfc293");
    _Reconsilecount.Click_R12();
    

    TestModellerLogger.SetLastNodeGuid("333f5500-78ad-458f-a383-b6440369d3de");
    _Reconsilecount.Click_R13();
    

    TestModellerLogger.SetLastNodeGuid("ab08b36a-2f76-46cc-8cf0-f6dc93b8213c");
    _Reconsilecount.Click_R14();
    

    TestModellerLogger.SetLastNodeGuid("ab7f2182-853d-4064-8d23-3ed12179a136");
    _Reconsilecount.Click_R15();
    

    TestModellerLogger.SetLastNodeGuid("6966e097-d89b-4907-b08e-0e68c988cac1");
    _Reconsilecount.Click_R16();
    

    TestModellerLogger.SetLastNodeGuid("5f153217-83e2-4727-89af-4b63829d3f86");
    _Reconsilecount.Click_R17();
    

    TestModellerLogger.SetLastNodeGuid("2437587a-af3c-4c95-8b5f-bba6c149170e");
    _Reconsilecount.Click_R18();
    

    TestModellerLogger.SetLastNodeGuid("2459c2b4-3bfc-481c-a024-a8b07ffb4253");
    _Reconsilecount.Click_R19();
    

    TestModellerLogger.SetLastNodeGuid("7afa71ce-7cce-4ada-8b31-6b446ee3611f");
    _Reconsilecount.Click_R20();
    

    TestModellerLogger.SetLastNodeGuid("130229df-4174-47ff-b315-4e797e797be2");
    _Reconsilecount.Click_R21();
    

    TestModellerLogger.SetLastNodeGuid("67a8a70d-5168-4f86-8da8-7838512ad558");
    _Reconsilecount.Click_R22();
    

    TestModellerLogger.SetLastNodeGuid("69e73e5a-7c35-43b8-b74e-686f7b89d6f5");
    _Reconsilecount.Click_R23();
    

    TestModellerLogger.SetLastNodeGuid("37e489d4-7649-4e8e-8982-e68c437511f0");
    _Reconsilecount.Click_R24();
    

    TestModellerLogger.SetLastNodeGuid("b295b7ea-4eae-4326-90c8-7bc01145c021");
    _Reconsilecount.Click_R25();
    

    TestModellerLogger.SetLastNodeGuid("0016602a-7419-4e1c-843c-4f82ce17b4f9");
    _Reconsilecount.Click_R26();
    

    TestModellerLogger.SetLastNodeGuid("fcf9dc5c-45e6-4309-bceb-fde0aeeaeec2");
    _Reconsilecount.Click_R27();
    

    TestModellerLogger.SetLastNodeGuid("95a7e0ac-fd21-408c-9d9c-027004930449");
    _Reconsilecount.Click_R28();
    

    TestModellerLogger.SetLastNodeGuid("4aa503fb-8b18-4e77-bcda-9559679043d5");
    _Reconsilecount.Click_R29();
    

    TestModellerLogger.SetLastNodeGuid("bc0de1d6-d59c-4900-899d-8bb3da5f1abd");
    _Reconsilecount.Click_R30();
    

    TestModellerLogger.SetLastNodeGuid("9bcccc53-1773-466b-b426-6ee41539f8e3");
    _Reconsilecount.Select_R31("Partial Reconcile");
    

    TestModellerLogger.SetLastNodeGuid("154f0835-2441-4733-9a24-ba5927a5e7e1");
    _Reconsilecount.Click_Success_Transactions_reconciled_successfully();
    

    }

    @Test  (groups= {"SaleInToReconcile","SaleInToReconcile - Default Profile"})
    @TestModellerPath(guid = "93deaecf-275f-491b-bff6-5df7220af4a0")
    public void GoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClickAgents22()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("Btv55F1v6I");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
    _AgentSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("quasi");
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Swaniawski Inc");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.SaleInvoice _SaleInvoice = new pages.SaleInvoice(driver);
    TestModellerLogger.SetLastNodeGuid("2f331494-c0ec-443e-b258-bdf3d2f9d9fc");
    _SaleInvoice.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("281121da-f0ce-4629-a4d1-0bc9b4260347");
    _SaleInvoice.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("38510c8a-daac-4ff8-83f3-54b176440787");
    _SaleInvoice.Click_SalesTab();
    

    TestModellerLogger.SetLastNodeGuid("2ce6ef22-01ee-4e82-bcb0-f7ce06badd95");
    _SaleInvoice.Click_NewButton();
    

    TestModellerLogger.SetLastNodeGuid("b605bf48-53b8-4f7f-a009-9ea8d59b69ba");
    _SaleInvoice.Click_NewInvoice();
    

    TestModellerLogger.SetLastNodeGuid("4e83b316-7f8b-49b7-a97f-e85cefb020f0");
    _SaleInvoice.Select_CustomerName("nid");
    

    TestModellerLogger.SetLastNodeGuid("f3edcc35-8d70-4902-81f0-9c5d760fac46");
    _SaleInvoice.Enter_InvoiceNo("");
    

    TestModellerLogger.SetLastNodeGuid("6f885a16-e34c-4d0d-914a-a726c1fa9617");
    _SaleInvoice.Enter_InvoiceDate("44266");
    

    TestModellerLogger.SetLastNodeGuid("294097b8-ccc5-4eb7-baec-1a26ca1364f0");
    _SaleInvoice.Select_IncomeType("");
    

    TestModellerLogger.SetLastNodeGuid("5ccbf01b-65a3-47f5-b916-dab48aab691f");
    _SaleInvoice.Enter_Description("Aspernatur odit est incidunt inventore sunt deserunt quo.
Ratione eligendi ea hic.
Libero aut et inventore autem doloribus.
Voluptatem dolorem similique voluptas necessitatibus rerum.
Perspiciatis accusamus culpa nam totam eos earum.
Facere delectus ullam et ullam velit quia beatae sed.
Non est labore.
Dolor quasi dolores veritatis.
Architecto minima sed laudantium ipsum.
Sunt dolorem exercitationem similique.");
    

    TestModellerLogger.SetLastNodeGuid("73677a32-1892-47f6-9783-a1072478778a");
    _SaleInvoice.Enter_UnitPrice("");
    

    TestModellerLogger.SetLastNodeGuid("d810d5bf-a960-434c-9172-1671dd383495");
    _SaleInvoice.Enter_Quantity("");
    

    TestModellerLogger.SetLastNodeGuid("516c7236-f043-4de9-b128-99997ccf1604");
    _SaleInvoice.Select_VATRate("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("cb6d5101-0be0-4519-b1aa-5e71dcdfbef3");
    _SaleInvoice.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("6aeae28b-fd85-4712-8710-18e4b190dd19");
    _SaleInvoice.Enter_Note("");
    

    TestModellerLogger.SetLastNodeGuid("2508d3fa-348f-48f2-914a-4d43591ded90");
    _SaleInvoice.Click_SaveButton();
    

    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("VBCUZ6QCka");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
    _AgentSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("accusantium");
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Klein - Hessel");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
    _bankmenu.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
    _bankmenu.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
    _bankmenu.Click_Bankingmenu();
    

    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
    _bankmenu.Click_Newmenu();
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
    _nBANKTRN.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
    _nBANKTRN.Select_BK_SELECT("Nidhilimited1");
    

    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
    _nBANKTRN.Enter_NDate("44266");
    

    TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
    _nBANKTRN.Enter_n_desc("");
    

    TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
    _nBANKTRN.Enter_Recived_amt("");
    

    TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
    _nBANKTRN.Enter_spnt_amt("");
    

    TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
    _nBANKTRN.Select_Select_VATRate("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
    _nBANKTRN.Click_Select_Option1();
    

    TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
    _nBANKTRN.Enter_BOX2("");
    

    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

pages.Reconcilation _Reconcilation = new pages.Reconcilation(driver);
    TestModellerLogger.SetLastNodeGuid("fc1c2835-8b62-466d-8b91-b2d2b6852de5");
    _Reconcilation.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("30a799ca-18ec-4e8a-9931-57fc4ea2c02b");
    _Reconcilation.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5fa7c856-5fe6-458c-94fd-c74460dd9b1f");
    _Reconcilation.Click_Acntantleftmenu();
    

    TestModellerLogger.SetLastNodeGuid("2f750f49-e648-45ca-898e-d60728db5570");
    _Reconcilation.Click_plussign();
    

    TestModellerLogger.SetLastNodeGuid("a3808a66-3e56-4e52-b2c1-61b7d5d15b32");
    _Reconcilation.Select_SelectAccountType1("Creditors due after one year");
    

    TestModellerLogger.SetLastNodeGuid("2018e2d9-51c8-4e54-8424-0f5147db31d6");
    _Reconcilation.Select_SelectAccount1("All");
    

    TestModellerLogger.SetLastNodeGuid("0892baec-0422-496a-93f9-1028cef59d2c");
    _Reconcilation.Click_View_Reconciled_button1();
    

pages.Reconsilecount _Reconsilecount = new pages.Reconsilecount(driver);
    TestModellerLogger.SetLastNodeGuid("20ec992d-e923-4cd2-946b-1f6e59b73bf6");
    _Reconsilecount.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("778b3b22-188b-4954-8194-ffafa2c2d9c2");
    _Reconsilecount.Click_R1();
    

    TestModellerLogger.SetLastNodeGuid("0fc72130-6b3a-4342-9d0e-19804563923c");
    _Reconsilecount.Click_R2();
    

    TestModellerLogger.SetLastNodeGuid("bccac54a-cf91-4c34-b5de-3168f47f6c6c");
    _Reconsilecount.Click_R3();
    

    TestModellerLogger.SetLastNodeGuid("afa85278-aa67-42ac-9a2e-9d7e8178cae9");
    _Reconsilecount.Click_R4();
    

    TestModellerLogger.SetLastNodeGuid("8be2e142-f2d6-40b4-9f1a-b4f6c31f9776");
    _Reconsilecount.Click_R5();
    

    TestModellerLogger.SetLastNodeGuid("e4e26451-eebc-4ddc-84aa-2abdfce286c3");
    _Reconsilecount.Click_R6();
    

    TestModellerLogger.SetLastNodeGuid("24bb6ec6-e35c-424b-97bf-7d95cfb0c096");
    _Reconsilecount.Click_R7();
    

    TestModellerLogger.SetLastNodeGuid("605ff86c-cdca-413d-8743-6d540ebe0d6f");
    _Reconsilecount.Click_R8();
    

    TestModellerLogger.SetLastNodeGuid("5e13f8d0-f1e2-4527-b2df-049aaf7e1d0e");
    _Reconsilecount.Click_R9();
    

    TestModellerLogger.SetLastNodeGuid("3f0eb811-3a59-4e4e-9972-944ae4cc0d33");
    _Reconsilecount.Click_R10();
    

    TestModellerLogger.SetLastNodeGuid("0ae57fc9-3f5d-4114-951b-51a967c72977");
    _Reconsilecount.Click_R100();
    

    TestModellerLogger.SetLastNodeGuid("bc70be77-e7a6-40c0-94d7-4c667fba43a8");
    _Reconsilecount.Click_R11();
    

    TestModellerLogger.SetLastNodeGuid("40cafd20-4a4a-423c-b1f8-b6457dcfc293");
    _Reconsilecount.Click_R12();
    

    TestModellerLogger.SetLastNodeGuid("333f5500-78ad-458f-a383-b6440369d3de");
    _Reconsilecount.Click_R13();
    

    TestModellerLogger.SetLastNodeGuid("ab08b36a-2f76-46cc-8cf0-f6dc93b8213c");
    _Reconsilecount.Click_R14();
    

    TestModellerLogger.SetLastNodeGuid("ab7f2182-853d-4064-8d23-3ed12179a136");
    _Reconsilecount.Click_R15();
    

    TestModellerLogger.SetLastNodeGuid("6966e097-d89b-4907-b08e-0e68c988cac1");
    _Reconsilecount.Click_R16();
    

    TestModellerLogger.SetLastNodeGuid("5f153217-83e2-4727-89af-4b63829d3f86");
    _Reconsilecount.Click_R17();
    

    TestModellerLogger.SetLastNodeGuid("2437587a-af3c-4c95-8b5f-bba6c149170e");
    _Reconsilecount.Click_R18();
    

    TestModellerLogger.SetLastNodeGuid("2459c2b4-3bfc-481c-a024-a8b07ffb4253");
    _Reconsilecount.Click_R19();
    

    TestModellerLogger.SetLastNodeGuid("7afa71ce-7cce-4ada-8b31-6b446ee3611f");
    _Reconsilecount.Click_R20();
    

    TestModellerLogger.SetLastNodeGuid("130229df-4174-47ff-b315-4e797e797be2");
    _Reconsilecount.Click_R21();
    

    TestModellerLogger.SetLastNodeGuid("67a8a70d-5168-4f86-8da8-7838512ad558");
    _Reconsilecount.Click_R22();
    

    TestModellerLogger.SetLastNodeGuid("69e73e5a-7c35-43b8-b74e-686f7b89d6f5");
    _Reconsilecount.Click_R23();
    

    TestModellerLogger.SetLastNodeGuid("37e489d4-7649-4e8e-8982-e68c437511f0");
    _Reconsilecount.Click_R24();
    

    TestModellerLogger.SetLastNodeGuid("b295b7ea-4eae-4326-90c8-7bc01145c021");
    _Reconsilecount.Click_R25();
    

    TestModellerLogger.SetLastNodeGuid("0016602a-7419-4e1c-843c-4f82ce17b4f9");
    _Reconsilecount.Click_R26();
    

    TestModellerLogger.SetLastNodeGuid("fcf9dc5c-45e6-4309-bceb-fde0aeeaeec2");
    _Reconsilecount.Click_R27();
    

    TestModellerLogger.SetLastNodeGuid("95a7e0ac-fd21-408c-9d9c-027004930449");
    _Reconsilecount.Click_R28();
    

    TestModellerLogger.SetLastNodeGuid("4aa503fb-8b18-4e77-bcda-9559679043d5");
    _Reconsilecount.Click_R29();
    

    TestModellerLogger.SetLastNodeGuid("bc0de1d6-d59c-4900-899d-8bb3da5f1abd");
    _Reconsilecount.Click_R30();
    

    TestModellerLogger.SetLastNodeGuid("9bcccc53-1773-466b-b426-6ee41539f8e3");
    _Reconsilecount.Select_R31("Partial Reconcile");
    

    TestModellerLogger.SetLastNodeGuid("154f0835-2441-4733-9a24-ba5927a5e7e1");
    _Reconsilecount.Click_Success_Transactions_reconciled_successfully();
    

    }

    @Test  (groups= {"SaleInToReconcile","SaleInToReconcile - Default Profile"})
    @TestModellerPath(guid = "e93b340e-850c-4068-9fe2-3286f2cb5b7f")
    public void GoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClickAgents23()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("EViPUbuVXM");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
    _AgentSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("necessitatibus");
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Brakus, Bashirian and Skiles");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.SaleInvoice _SaleInvoice = new pages.SaleInvoice(driver);
    TestModellerLogger.SetLastNodeGuid("2f331494-c0ec-443e-b258-bdf3d2f9d9fc");
    _SaleInvoice.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("281121da-f0ce-4629-a4d1-0bc9b4260347");
    _SaleInvoice.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("38510c8a-daac-4ff8-83f3-54b176440787");
    _SaleInvoice.Click_SalesTab();
    

    TestModellerLogger.SetLastNodeGuid("2ce6ef22-01ee-4e82-bcb0-f7ce06badd95");
    _SaleInvoice.Click_NewButton();
    

    TestModellerLogger.SetLastNodeGuid("b605bf48-53b8-4f7f-a009-9ea8d59b69ba");
    _SaleInvoice.Click_NewInvoice();
    

    TestModellerLogger.SetLastNodeGuid("4e83b316-7f8b-49b7-a97f-e85cefb020f0");
    _SaleInvoice.Select_CustomerName("nid");
    

    TestModellerLogger.SetLastNodeGuid("f3edcc35-8d70-4902-81f0-9c5d760fac46");
    _SaleInvoice.Enter_InvoiceNo("");
    

    TestModellerLogger.SetLastNodeGuid("6f885a16-e34c-4d0d-914a-a726c1fa9617");
    _SaleInvoice.Enter_InvoiceDate("44266");
    

    TestModellerLogger.SetLastNodeGuid("294097b8-ccc5-4eb7-baec-1a26ca1364f0");
    _SaleInvoice.Select_IncomeType("");
    

    TestModellerLogger.SetLastNodeGuid("5ccbf01b-65a3-47f5-b916-dab48aab691f");
    _SaleInvoice.Enter_Description("Saepe sint qui qui distinctio.
Esse autem debitis deserunt.
Ea fugit dolor sequi est qui incidunt dignissimos porro.
Minima doloribus in quam consequuntur nulla.
Est non ut quasi tempore rerum fugiat.
A eligendi aut voluptas tempora debitis adipisci maiores.
Sit qui quo vitae repudiandae incidunt debitis.
Ut officiis et non sit.
Sed laboriosam qui quasi.
Et nobis nobis voluptatum rerum.");
    

    TestModellerLogger.SetLastNodeGuid("73677a32-1892-47f6-9783-a1072478778a");
    _SaleInvoice.Enter_UnitPrice("");
    

    TestModellerLogger.SetLastNodeGuid("d810d5bf-a960-434c-9172-1671dd383495");
    _SaleInvoice.Enter_Quantity("");
    

    TestModellerLogger.SetLastNodeGuid("516c7236-f043-4de9-b128-99997ccf1604");
    _SaleInvoice.Select_VATRate("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("cb6d5101-0be0-4519-b1aa-5e71dcdfbef3");
    _SaleInvoice.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("6aeae28b-fd85-4712-8710-18e4b190dd19");
    _SaleInvoice.Enter_Note("");
    

    TestModellerLogger.SetLastNodeGuid("2508d3fa-348f-48f2-914a-4d43591ded90");
    _SaleInvoice.Click_SaveButton();
    

    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("8aha6ugd89");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
    _AgentSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("labore");
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Lynch Group");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
    _bankmenu.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
    _bankmenu.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
    _bankmenu.Click_Bankingmenu();
    

    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
    _bankmenu.Click_Newmenu();
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
    _nBANKTRN.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
    _nBANKTRN.Select_BK_SELECT("Nidlimited");
    

    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
    _nBANKTRN.Enter_NDate("44266");
    

    TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
    _nBANKTRN.Enter_n_desc("");
    

    TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
    _nBANKTRN.Enter_Recived_amt("");
    

    TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
    _nBANKTRN.Enter_spnt_amt("");
    

    TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
    _nBANKTRN.Select_Select_VATRate("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
    _nBANKTRN.Click_Select_Option1();
    

    TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
    _nBANKTRN.Enter_BOX2("");
    

    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

pages.Reconcilation _Reconcilation = new pages.Reconcilation(driver);
    TestModellerLogger.SetLastNodeGuid("fc1c2835-8b62-466d-8b91-b2d2b6852de5");
    _Reconcilation.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("30a799ca-18ec-4e8a-9931-57fc4ea2c02b");
    _Reconcilation.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5fa7c856-5fe6-458c-94fd-c74460dd9b1f");
    _Reconcilation.Click_Acntantleftmenu();
    

    TestModellerLogger.SetLastNodeGuid("2f750f49-e648-45ca-898e-d60728db5570");
    _Reconcilation.Click_plussign();
    

    TestModellerLogger.SetLastNodeGuid("a3808a66-3e56-4e52-b2c1-61b7d5d15b32");
    _Reconcilation.Select_SelectAccountType1("Creditors due after one year");
    

    TestModellerLogger.SetLastNodeGuid("2018e2d9-51c8-4e54-8424-0f5147db31d6");
    _Reconcilation.Select_SelectAccount1("All");
    

    TestModellerLogger.SetLastNodeGuid("0892baec-0422-496a-93f9-1028cef59d2c");
    _Reconcilation.Click_View_Reconciled_button1();
    

pages.Reconsilecount _Reconsilecount = new pages.Reconsilecount(driver);
    TestModellerLogger.SetLastNodeGuid("20ec992d-e923-4cd2-946b-1f6e59b73bf6");
    _Reconsilecount.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("778b3b22-188b-4954-8194-ffafa2c2d9c2");
    _Reconsilecount.Click_R1();
    

    TestModellerLogger.SetLastNodeGuid("0fc72130-6b3a-4342-9d0e-19804563923c");
    _Reconsilecount.Click_R2();
    

    TestModellerLogger.SetLastNodeGuid("bccac54a-cf91-4c34-b5de-3168f47f6c6c");
    _Reconsilecount.Click_R3();
    

    TestModellerLogger.SetLastNodeGuid("afa85278-aa67-42ac-9a2e-9d7e8178cae9");
    _Reconsilecount.Click_R4();
    

    TestModellerLogger.SetLastNodeGuid("8be2e142-f2d6-40b4-9f1a-b4f6c31f9776");
    _Reconsilecount.Click_R5();
    

    TestModellerLogger.SetLastNodeGuid("e4e26451-eebc-4ddc-84aa-2abdfce286c3");
    _Reconsilecount.Click_R6();
    

    TestModellerLogger.SetLastNodeGuid("24bb6ec6-e35c-424b-97bf-7d95cfb0c096");
    _Reconsilecount.Click_R7();
    

    TestModellerLogger.SetLastNodeGuid("605ff86c-cdca-413d-8743-6d540ebe0d6f");
    _Reconsilecount.Click_R8();
    

    TestModellerLogger.SetLastNodeGuid("5e13f8d0-f1e2-4527-b2df-049aaf7e1d0e");
    _Reconsilecount.Click_R9();
    

    TestModellerLogger.SetLastNodeGuid("3f0eb811-3a59-4e4e-9972-944ae4cc0d33");
    _Reconsilecount.Click_R10();
    

    TestModellerLogger.SetLastNodeGuid("0ae57fc9-3f5d-4114-951b-51a967c72977");
    _Reconsilecount.Click_R100();
    

    TestModellerLogger.SetLastNodeGuid("bc70be77-e7a6-40c0-94d7-4c667fba43a8");
    _Reconsilecount.Click_R11();
    

    TestModellerLogger.SetLastNodeGuid("40cafd20-4a4a-423c-b1f8-b6457dcfc293");
    _Reconsilecount.Click_R12();
    

    TestModellerLogger.SetLastNodeGuid("333f5500-78ad-458f-a383-b6440369d3de");
    _Reconsilecount.Click_R13();
    

    TestModellerLogger.SetLastNodeGuid("ab08b36a-2f76-46cc-8cf0-f6dc93b8213c");
    _Reconsilecount.Click_R14();
    

    TestModellerLogger.SetLastNodeGuid("ab7f2182-853d-4064-8d23-3ed12179a136");
    _Reconsilecount.Click_R15();
    

    TestModellerLogger.SetLastNodeGuid("6966e097-d89b-4907-b08e-0e68c988cac1");
    _Reconsilecount.Click_R16();
    

    TestModellerLogger.SetLastNodeGuid("5f153217-83e2-4727-89af-4b63829d3f86");
    _Reconsilecount.Click_R17();
    

    TestModellerLogger.SetLastNodeGuid("2437587a-af3c-4c95-8b5f-bba6c149170e");
    _Reconsilecount.Click_R18();
    

    TestModellerLogger.SetLastNodeGuid("2459c2b4-3bfc-481c-a024-a8b07ffb4253");
    _Reconsilecount.Click_R19();
    

    TestModellerLogger.SetLastNodeGuid("7afa71ce-7cce-4ada-8b31-6b446ee3611f");
    _Reconsilecount.Click_R20();
    

    TestModellerLogger.SetLastNodeGuid("130229df-4174-47ff-b315-4e797e797be2");
    _Reconsilecount.Click_R21();
    

    TestModellerLogger.SetLastNodeGuid("67a8a70d-5168-4f86-8da8-7838512ad558");
    _Reconsilecount.Click_R22();
    

    TestModellerLogger.SetLastNodeGuid("69e73e5a-7c35-43b8-b74e-686f7b89d6f5");
    _Reconsilecount.Click_R23();
    

    TestModellerLogger.SetLastNodeGuid("37e489d4-7649-4e8e-8982-e68c437511f0");
    _Reconsilecount.Click_R24();
    

    TestModellerLogger.SetLastNodeGuid("b295b7ea-4eae-4326-90c8-7bc01145c021");
    _Reconsilecount.Click_R25();
    

    TestModellerLogger.SetLastNodeGuid("0016602a-7419-4e1c-843c-4f82ce17b4f9");
    _Reconsilecount.Click_R26();
    

    TestModellerLogger.SetLastNodeGuid("fcf9dc5c-45e6-4309-bceb-fde0aeeaeec2");
    _Reconsilecount.Click_R27();
    

    TestModellerLogger.SetLastNodeGuid("95a7e0ac-fd21-408c-9d9c-027004930449");
    _Reconsilecount.Click_R28();
    

    TestModellerLogger.SetLastNodeGuid("4aa503fb-8b18-4e77-bcda-9559679043d5");
    _Reconsilecount.Click_R29();
    

    TestModellerLogger.SetLastNodeGuid("bc0de1d6-d59c-4900-899d-8bb3da5f1abd");
    _Reconsilecount.Click_R30();
    

    TestModellerLogger.SetLastNodeGuid("9bcccc53-1773-466b-b426-6ee41539f8e3");
    _Reconsilecount.Select_R31("Partial Reconcile");
    

    TestModellerLogger.SetLastNodeGuid("154f0835-2441-4733-9a24-ba5927a5e7e1");
    _Reconsilecount.Click_Success_Transactions_reconciled_successfully();
    

    }

    @Test  (groups= {"SaleInToReconcile","SaleInToReconcile - Default Profile"})
    @TestModellerPath(guid = "af4c7845-c39a-44a8-9dbd-e2946b868c77")
    public void GoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClickAgents24()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("P0FVrUO3nP");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
    _AgentSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("vel");
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Cremin - Cartwright");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.SaleInvoice _SaleInvoice = new pages.SaleInvoice(driver);
    TestModellerLogger.SetLastNodeGuid("2f331494-c0ec-443e-b258-bdf3d2f9d9fc");
    _SaleInvoice.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("281121da-f0ce-4629-a4d1-0bc9b4260347");
    _SaleInvoice.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("38510c8a-daac-4ff8-83f3-54b176440787");
    _SaleInvoice.Click_SalesTab();
    

    TestModellerLogger.SetLastNodeGuid("2ce6ef22-01ee-4e82-bcb0-f7ce06badd95");
    _SaleInvoice.Click_NewButton();
    

    TestModellerLogger.SetLastNodeGuid("b605bf48-53b8-4f7f-a009-9ea8d59b69ba");
    _SaleInvoice.Click_NewInvoice();
    

    TestModellerLogger.SetLastNodeGuid("4e83b316-7f8b-49b7-a97f-e85cefb020f0");
    _SaleInvoice.Select_CustomerName("nid");
    

    TestModellerLogger.SetLastNodeGuid("f3edcc35-8d70-4902-81f0-9c5d760fac46");
    _SaleInvoice.Enter_InvoiceNo("");
    

    TestModellerLogger.SetLastNodeGuid("6f885a16-e34c-4d0d-914a-a726c1fa9617");
    _SaleInvoice.Enter_InvoiceDate("44266");
    

    TestModellerLogger.SetLastNodeGuid("294097b8-ccc5-4eb7-baec-1a26ca1364f0");
    _SaleInvoice.Select_IncomeType("");
    

    TestModellerLogger.SetLastNodeGuid("5ccbf01b-65a3-47f5-b916-dab48aab691f");
    _SaleInvoice.Enter_Description("Velit ut explicabo enim.
Quis illo dolor non sunt.
Corrupti saepe dolorem at quia inventore vero corrupti.
Eligendi quaerat fuga amet et eaque atque.
Quasi et occaecati similique.
Quia at nisi asperiores velit consequatur aperiam.
Est eaque perspiciatis possimus rerum sed vel.
Dolorum ducimus et libero.
Odio voluptatem ut voluptates soluta quia necessitatibus.
Odit quis similique quia non assumenda aut molestias numquam.");
    

    TestModellerLogger.SetLastNodeGuid("73677a32-1892-47f6-9783-a1072478778a");
    _SaleInvoice.Enter_UnitPrice("");
    

    TestModellerLogger.SetLastNodeGuid("d810d5bf-a960-434c-9172-1671dd383495");
    _SaleInvoice.Enter_Quantity("");
    

    TestModellerLogger.SetLastNodeGuid("516c7236-f043-4de9-b128-99997ccf1604");
    _SaleInvoice.Select_VATRate("Zero Rate");
    

    TestModellerLogger.SetLastNodeGuid("cb6d5101-0be0-4519-b1aa-5e71dcdfbef3");
    _SaleInvoice.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("6aeae28b-fd85-4712-8710-18e4b190dd19");
    _SaleInvoice.Enter_Note("");
    

    TestModellerLogger.SetLastNodeGuid("2508d3fa-348f-48f2-914a-4d43591ded90");
    _SaleInvoice.Click_SaveButton();
    

    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("wvmmv8nqNR");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
    _AgentSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("eos");
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Kerluke, Kohler and Medhurst");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
    _bankmenu.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
    _bankmenu.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
    _bankmenu.Click_Bankingmenu();
    

    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
    _bankmenu.Click_Newmenu();
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
    _nBANKTRN.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
    _nBANKTRN.Select_BK_SELECT("nidhibank");
    

    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
    _nBANKTRN.Enter_NDate("44266");
    

    TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
    _nBANKTRN.Enter_n_desc("");
    

    TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
    _nBANKTRN.Enter_Recived_amt("");
    

    TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
    _nBANKTRN.Enter_spnt_amt("");
    

    TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
    _nBANKTRN.Select_Select_VATRate("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
    _nBANKTRN.Click_Select_Option1();
    

    TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
    _nBANKTRN.Enter_BOX2("");
    

    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

pages.Reconcilation _Reconcilation = new pages.Reconcilation(driver);
    TestModellerLogger.SetLastNodeGuid("fc1c2835-8b62-466d-8b91-b2d2b6852de5");
    _Reconcilation.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("30a799ca-18ec-4e8a-9931-57fc4ea2c02b");
    _Reconcilation.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5fa7c856-5fe6-458c-94fd-c74460dd9b1f");
    _Reconcilation.Click_Acntantleftmenu();
    

    TestModellerLogger.SetLastNodeGuid("2f750f49-e648-45ca-898e-d60728db5570");
    _Reconcilation.Click_plussign();
    

    TestModellerLogger.SetLastNodeGuid("a3808a66-3e56-4e52-b2c1-61b7d5d15b32");
    _Reconcilation.Select_SelectAccountType1("Creditors due after one year");
    

    TestModellerLogger.SetLastNodeGuid("2018e2d9-51c8-4e54-8424-0f5147db31d6");
    _Reconcilation.Select_SelectAccount1("All");
    

    TestModellerLogger.SetLastNodeGuid("0892baec-0422-496a-93f9-1028cef59d2c");
    _Reconcilation.Click_View_Reconciled_button1();
    

pages.Reconsilecount _Reconsilecount = new pages.Reconsilecount(driver);
    TestModellerLogger.SetLastNodeGuid("20ec992d-e923-4cd2-946b-1f6e59b73bf6");
    _Reconsilecount.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("778b3b22-188b-4954-8194-ffafa2c2d9c2");
    _Reconsilecount.Click_R1();
    

    TestModellerLogger.SetLastNodeGuid("0fc72130-6b3a-4342-9d0e-19804563923c");
    _Reconsilecount.Click_R2();
    

    TestModellerLogger.SetLastNodeGuid("bccac54a-cf91-4c34-b5de-3168f47f6c6c");
    _Reconsilecount.Click_R3();
    

    TestModellerLogger.SetLastNodeGuid("afa85278-aa67-42ac-9a2e-9d7e8178cae9");
    _Reconsilecount.Click_R4();
    

    TestModellerLogger.SetLastNodeGuid("8be2e142-f2d6-40b4-9f1a-b4f6c31f9776");
    _Reconsilecount.Click_R5();
    

    TestModellerLogger.SetLastNodeGuid("e4e26451-eebc-4ddc-84aa-2abdfce286c3");
    _Reconsilecount.Click_R6();
    

    TestModellerLogger.SetLastNodeGuid("24bb6ec6-e35c-424b-97bf-7d95cfb0c096");
    _Reconsilecount.Click_R7();
    

    TestModellerLogger.SetLastNodeGuid("605ff86c-cdca-413d-8743-6d540ebe0d6f");
    _Reconsilecount.Click_R8();
    

    TestModellerLogger.SetLastNodeGuid("5e13f8d0-f1e2-4527-b2df-049aaf7e1d0e");
    _Reconsilecount.Click_R9();
    

    TestModellerLogger.SetLastNodeGuid("3f0eb811-3a59-4e4e-9972-944ae4cc0d33");
    _Reconsilecount.Click_R10();
    

    TestModellerLogger.SetLastNodeGuid("0ae57fc9-3f5d-4114-951b-51a967c72977");
    _Reconsilecount.Click_R100();
    

    TestModellerLogger.SetLastNodeGuid("bc70be77-e7a6-40c0-94d7-4c667fba43a8");
    _Reconsilecount.Click_R11();
    

    TestModellerLogger.SetLastNodeGuid("40cafd20-4a4a-423c-b1f8-b6457dcfc293");
    _Reconsilecount.Click_R12();
    

    TestModellerLogger.SetLastNodeGuid("333f5500-78ad-458f-a383-b6440369d3de");
    _Reconsilecount.Click_R13();
    

    TestModellerLogger.SetLastNodeGuid("ab08b36a-2f76-46cc-8cf0-f6dc93b8213c");
    _Reconsilecount.Click_R14();
    

    TestModellerLogger.SetLastNodeGuid("ab7f2182-853d-4064-8d23-3ed12179a136");
    _Reconsilecount.Click_R15();
    

    TestModellerLogger.SetLastNodeGuid("6966e097-d89b-4907-b08e-0e68c988cac1");
    _Reconsilecount.Click_R16();
    

    TestModellerLogger.SetLastNodeGuid("5f153217-83e2-4727-89af-4b63829d3f86");
    _Reconsilecount.Click_R17();
    

    TestModellerLogger.SetLastNodeGuid("2437587a-af3c-4c95-8b5f-bba6c149170e");
    _Reconsilecount.Click_R18();
    

    TestModellerLogger.SetLastNodeGuid("2459c2b4-3bfc-481c-a024-a8b07ffb4253");
    _Reconsilecount.Click_R19();
    

    TestModellerLogger.SetLastNodeGuid("7afa71ce-7cce-4ada-8b31-6b446ee3611f");
    _Reconsilecount.Click_R20();
    

    TestModellerLogger.SetLastNodeGuid("130229df-4174-47ff-b315-4e797e797be2");
    _Reconsilecount.Click_R21();
    

    TestModellerLogger.SetLastNodeGuid("67a8a70d-5168-4f86-8da8-7838512ad558");
    _Reconsilecount.Click_R22();
    

    TestModellerLogger.SetLastNodeGuid("69e73e5a-7c35-43b8-b74e-686f7b89d6f5");
    _Reconsilecount.Click_R23();
    

    TestModellerLogger.SetLastNodeGuid("37e489d4-7649-4e8e-8982-e68c437511f0");
    _Reconsilecount.Click_R24();
    

    TestModellerLogger.SetLastNodeGuid("b295b7ea-4eae-4326-90c8-7bc01145c021");
    _Reconsilecount.Click_R25();
    

    TestModellerLogger.SetLastNodeGuid("0016602a-7419-4e1c-843c-4f82ce17b4f9");
    _Reconsilecount.Click_R26();
    

    TestModellerLogger.SetLastNodeGuid("fcf9dc5c-45e6-4309-bceb-fde0aeeaeec2");
    _Reconsilecount.Click_R27();
    

    TestModellerLogger.SetLastNodeGuid("95a7e0ac-fd21-408c-9d9c-027004930449");
    _Reconsilecount.Click_R28();
    

    TestModellerLogger.SetLastNodeGuid("4aa503fb-8b18-4e77-bcda-9559679043d5");
    _Reconsilecount.Click_R29();
    

    TestModellerLogger.SetLastNodeGuid("bc0de1d6-d59c-4900-899d-8bb3da5f1abd");
    _Reconsilecount.Click_R30();
    

    TestModellerLogger.SetLastNodeGuid("9bcccc53-1773-466b-b426-6ee41539f8e3");
    _Reconsilecount.Select_R31("Partial Reconcile");
    

    TestModellerLogger.SetLastNodeGuid("154f0835-2441-4733-9a24-ba5927a5e7e1");
    _Reconsilecount.Click_Success_Transactions_reconciled_successfully();
    

    }

    @Test  (groups= {"SaleInToReconcile","SaleInToReconcile - Default Profile"})
    @TestModellerPath(guid = "988be653-2172-433e-923b-a3e4d568fcdb")
    public void GoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClickAgents25()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("TW9JLXZPnt");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
    _AgentSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("quae");
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Huels Inc");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.SaleInvoice _SaleInvoice = new pages.SaleInvoice(driver);
    TestModellerLogger.SetLastNodeGuid("2f331494-c0ec-443e-b258-bdf3d2f9d9fc");
    _SaleInvoice.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("281121da-f0ce-4629-a4d1-0bc9b4260347");
    _SaleInvoice.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("38510c8a-daac-4ff8-83f3-54b176440787");
    _SaleInvoice.Click_SalesTab();
    

    TestModellerLogger.SetLastNodeGuid("2ce6ef22-01ee-4e82-bcb0-f7ce06badd95");
    _SaleInvoice.Click_NewButton();
    

    TestModellerLogger.SetLastNodeGuid("b605bf48-53b8-4f7f-a009-9ea8d59b69ba");
    _SaleInvoice.Click_NewInvoice();
    

    TestModellerLogger.SetLastNodeGuid("4e83b316-7f8b-49b7-a97f-e85cefb020f0");
    _SaleInvoice.Select_CustomerName("nid");
    

    TestModellerLogger.SetLastNodeGuid("f3edcc35-8d70-4902-81f0-9c5d760fac46");
    _SaleInvoice.Enter_InvoiceNo("");
    

    TestModellerLogger.SetLastNodeGuid("6f885a16-e34c-4d0d-914a-a726c1fa9617");
    _SaleInvoice.Enter_InvoiceDate("44266");
    

    TestModellerLogger.SetLastNodeGuid("294097b8-ccc5-4eb7-baec-1a26ca1364f0");
    _SaleInvoice.Select_IncomeType("");
    

    TestModellerLogger.SetLastNodeGuid("5ccbf01b-65a3-47f5-b916-dab48aab691f");
    _SaleInvoice.Enter_Description("Adipisci possimus et culpa velit.
Cumque voluptatum nihil in.
Recusandae optio quo id soluta suscipit dolores expedita numquam tenetur.
Corporis nihil aut rerum sit ullam quia.
Enim vitae ad nam labore impedit.
Atque excepturi cum sed nisi atque nobis doloremque vitae recusandae.
Aliquam et sed consectetur id saepe nemo officia blanditiis et.
Laudantium illo ea ullam aut corporis aut distinctio.
Animi eveniet porro.
Fuga voluptatibus explicabo laborum consequuntur dolorum tempore quibusdam aut.");
    

    TestModellerLogger.SetLastNodeGuid("73677a32-1892-47f6-9783-a1072478778a");
    _SaleInvoice.Enter_UnitPrice("");
    

    TestModellerLogger.SetLastNodeGuid("d810d5bf-a960-434c-9172-1671dd383495");
    _SaleInvoice.Enter_Quantity("");
    

    TestModellerLogger.SetLastNodeGuid("516c7236-f043-4de9-b128-99997ccf1604");
    _SaleInvoice.Select_VATRate("Reduced Rate");
    

    TestModellerLogger.SetLastNodeGuid("cb6d5101-0be0-4519-b1aa-5e71dcdfbef3");
    _SaleInvoice.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("6aeae28b-fd85-4712-8710-18e4b190dd19");
    _SaleInvoice.Enter_Note("");
    

    TestModellerLogger.SetLastNodeGuid("2508d3fa-348f-48f2-914a-4d43591ded90");
    _SaleInvoice.Click_SaveButton();
    

    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("5HoJkruzbP");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
    _AgentSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("consectetur");
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Zieme - Abshire");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
    _bankmenu.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
    _bankmenu.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
    _bankmenu.Click_Bankingmenu();
    

    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
    _bankmenu.Click_Newmenu();
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
    _nBANKTRN.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
    _nBANKTRN.Select_BK_SELECT("nidhibank");
    

    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
    _nBANKTRN.Enter_NDate("44266");
    

    TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
    _nBANKTRN.Enter_n_desc("");
    

    TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
    _nBANKTRN.Enter_Recived_amt("");
    

    TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
    _nBANKTRN.Enter_spnt_amt("");
    

    TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
    _nBANKTRN.Select_Select_VATRate("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
    _nBANKTRN.Click_Select_Option1();
    

    TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
    _nBANKTRN.Enter_BOX2("");
    

    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

pages.Reconcilation _Reconcilation = new pages.Reconcilation(driver);
    TestModellerLogger.SetLastNodeGuid("fc1c2835-8b62-466d-8b91-b2d2b6852de5");
    _Reconcilation.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("30a799ca-18ec-4e8a-9931-57fc4ea2c02b");
    _Reconcilation.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5fa7c856-5fe6-458c-94fd-c74460dd9b1f");
    _Reconcilation.Click_Acntantleftmenu();
    

    TestModellerLogger.SetLastNodeGuid("2f750f49-e648-45ca-898e-d60728db5570");
    _Reconcilation.Click_plussign();
    

    TestModellerLogger.SetLastNodeGuid("a3808a66-3e56-4e52-b2c1-61b7d5d15b32");
    _Reconcilation.Select_SelectAccountType1("Creditors due after one year");
    

    TestModellerLogger.SetLastNodeGuid("2018e2d9-51c8-4e54-8424-0f5147db31d6");
    _Reconcilation.Select_SelectAccount1("All");
    

    TestModellerLogger.SetLastNodeGuid("0892baec-0422-496a-93f9-1028cef59d2c");
    _Reconcilation.Click_View_Reconciled_button1();
    

pages.Reconsilecount _Reconsilecount = new pages.Reconsilecount(driver);
    TestModellerLogger.SetLastNodeGuid("20ec992d-e923-4cd2-946b-1f6e59b73bf6");
    _Reconsilecount.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("778b3b22-188b-4954-8194-ffafa2c2d9c2");
    _Reconsilecount.Click_R1();
    

    TestModellerLogger.SetLastNodeGuid("0fc72130-6b3a-4342-9d0e-19804563923c");
    _Reconsilecount.Click_R2();
    

    TestModellerLogger.SetLastNodeGuid("bccac54a-cf91-4c34-b5de-3168f47f6c6c");
    _Reconsilecount.Click_R3();
    

    TestModellerLogger.SetLastNodeGuid("afa85278-aa67-42ac-9a2e-9d7e8178cae9");
    _Reconsilecount.Click_R4();
    

    TestModellerLogger.SetLastNodeGuid("8be2e142-f2d6-40b4-9f1a-b4f6c31f9776");
    _Reconsilecount.Click_R5();
    

    TestModellerLogger.SetLastNodeGuid("e4e26451-eebc-4ddc-84aa-2abdfce286c3");
    _Reconsilecount.Click_R6();
    

    TestModellerLogger.SetLastNodeGuid("24bb6ec6-e35c-424b-97bf-7d95cfb0c096");
    _Reconsilecount.Click_R7();
    

    TestModellerLogger.SetLastNodeGuid("605ff86c-cdca-413d-8743-6d540ebe0d6f");
    _Reconsilecount.Click_R8();
    

    TestModellerLogger.SetLastNodeGuid("5e13f8d0-f1e2-4527-b2df-049aaf7e1d0e");
    _Reconsilecount.Click_R9();
    

    TestModellerLogger.SetLastNodeGuid("3f0eb811-3a59-4e4e-9972-944ae4cc0d33");
    _Reconsilecount.Click_R10();
    

    TestModellerLogger.SetLastNodeGuid("0ae57fc9-3f5d-4114-951b-51a967c72977");
    _Reconsilecount.Click_R100();
    

    TestModellerLogger.SetLastNodeGuid("bc70be77-e7a6-40c0-94d7-4c667fba43a8");
    _Reconsilecount.Click_R11();
    

    TestModellerLogger.SetLastNodeGuid("40cafd20-4a4a-423c-b1f8-b6457dcfc293");
    _Reconsilecount.Click_R12();
    

    TestModellerLogger.SetLastNodeGuid("333f5500-78ad-458f-a383-b6440369d3de");
    _Reconsilecount.Click_R13();
    

    TestModellerLogger.SetLastNodeGuid("ab08b36a-2f76-46cc-8cf0-f6dc93b8213c");
    _Reconsilecount.Click_R14();
    

    TestModellerLogger.SetLastNodeGuid("ab7f2182-853d-4064-8d23-3ed12179a136");
    _Reconsilecount.Click_R15();
    

    TestModellerLogger.SetLastNodeGuid("6966e097-d89b-4907-b08e-0e68c988cac1");
    _Reconsilecount.Click_R16();
    

    TestModellerLogger.SetLastNodeGuid("5f153217-83e2-4727-89af-4b63829d3f86");
    _Reconsilecount.Click_R17();
    

    TestModellerLogger.SetLastNodeGuid("2437587a-af3c-4c95-8b5f-bba6c149170e");
    _Reconsilecount.Click_R18();
    

    TestModellerLogger.SetLastNodeGuid("2459c2b4-3bfc-481c-a024-a8b07ffb4253");
    _Reconsilecount.Click_R19();
    

    TestModellerLogger.SetLastNodeGuid("7afa71ce-7cce-4ada-8b31-6b446ee3611f");
    _Reconsilecount.Click_R20();
    

    TestModellerLogger.SetLastNodeGuid("130229df-4174-47ff-b315-4e797e797be2");
    _Reconsilecount.Click_R21();
    

    TestModellerLogger.SetLastNodeGuid("67a8a70d-5168-4f86-8da8-7838512ad558");
    _Reconsilecount.Click_R22();
    

    TestModellerLogger.SetLastNodeGuid("69e73e5a-7c35-43b8-b74e-686f7b89d6f5");
    _Reconsilecount.Click_R23();
    

    TestModellerLogger.SetLastNodeGuid("37e489d4-7649-4e8e-8982-e68c437511f0");
    _Reconsilecount.Click_R24();
    

    TestModellerLogger.SetLastNodeGuid("b295b7ea-4eae-4326-90c8-7bc01145c021");
    _Reconsilecount.Click_R25();
    

    TestModellerLogger.SetLastNodeGuid("0016602a-7419-4e1c-843c-4f82ce17b4f9");
    _Reconsilecount.Click_R26();
    

    TestModellerLogger.SetLastNodeGuid("fcf9dc5c-45e6-4309-bceb-fde0aeeaeec2");
    _Reconsilecount.Click_R27();
    

    TestModellerLogger.SetLastNodeGuid("95a7e0ac-fd21-408c-9d9c-027004930449");
    _Reconsilecount.Click_R28();
    

    TestModellerLogger.SetLastNodeGuid("4aa503fb-8b18-4e77-bcda-9559679043d5");
    _Reconsilecount.Click_R29();
    

    TestModellerLogger.SetLastNodeGuid("bc0de1d6-d59c-4900-899d-8bb3da5f1abd");
    _Reconsilecount.Click_R30();
    

    TestModellerLogger.SetLastNodeGuid("9bcccc53-1773-466b-b426-6ee41539f8e3");
    _Reconsilecount.Select_R31("Partial Reconcile");
    

    TestModellerLogger.SetLastNodeGuid("154f0835-2441-4733-9a24-ba5927a5e7e1");
    _Reconsilecount.Click_Success_Transactions_reconciled_successfully();
    

    }

    @Test  (groups= {"SaleInToReconcile","SaleInToReconcile - Default Profile"})
    @TestModellerPath(guid = "4509270d-bb3a-4641-9f40-f4654dd988ff")
    public void GoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClickAgents26()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("N_VgWcIF_F");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
    _AgentSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("ducimus");
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Mohr - Emard");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.SaleInvoice _SaleInvoice = new pages.SaleInvoice(driver);
    TestModellerLogger.SetLastNodeGuid("2f331494-c0ec-443e-b258-bdf3d2f9d9fc");
    _SaleInvoice.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("281121da-f0ce-4629-a4d1-0bc9b4260347");
    _SaleInvoice.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("38510c8a-daac-4ff8-83f3-54b176440787");
    _SaleInvoice.Click_SalesTab();
    

    TestModellerLogger.SetLastNodeGuid("2ce6ef22-01ee-4e82-bcb0-f7ce06badd95");
    _SaleInvoice.Click_NewButton();
    

    TestModellerLogger.SetLastNodeGuid("b605bf48-53b8-4f7f-a009-9ea8d59b69ba");
    _SaleInvoice.Click_NewInvoice();
    

    TestModellerLogger.SetLastNodeGuid("4e83b316-7f8b-49b7-a97f-e85cefb020f0");
    _SaleInvoice.Select_CustomerName("nid");
    

    TestModellerLogger.SetLastNodeGuid("f3edcc35-8d70-4902-81f0-9c5d760fac46");
    _SaleInvoice.Enter_InvoiceNo("");
    

    TestModellerLogger.SetLastNodeGuid("6f885a16-e34c-4d0d-914a-a726c1fa9617");
    _SaleInvoice.Enter_InvoiceDate("44266");
    

    TestModellerLogger.SetLastNodeGuid("294097b8-ccc5-4eb7-baec-1a26ca1364f0");
    _SaleInvoice.Select_IncomeType("");
    

    TestModellerLogger.SetLastNodeGuid("5ccbf01b-65a3-47f5-b916-dab48aab691f");
    _SaleInvoice.Enter_Description("Et non voluptatem deleniti eligendi corrupti repellendus.
Expedita quos nihil enim reiciendis dicta ad molestias magni.
Error nemo voluptas molestiae totam.
Nulla minima ea.
Ex quae non quaerat est laboriosam magnam assumenda.
Id dolorem repellat commodi nulla et voluptatem ut.
Minus ut consequuntur neque ad.
Quae et veniam consequatur.
Sequi harum velit dicta dicta totam.
Veniam ducimus qui quidem quo molestias est.");
    

    TestModellerLogger.SetLastNodeGuid("73677a32-1892-47f6-9783-a1072478778a");
    _SaleInvoice.Enter_UnitPrice("");
    

    TestModellerLogger.SetLastNodeGuid("d810d5bf-a960-434c-9172-1671dd383495");
    _SaleInvoice.Enter_Quantity("");
    

    TestModellerLogger.SetLastNodeGuid("516c7236-f043-4de9-b128-99997ccf1604");
    _SaleInvoice.Select_VATRate("No VAT");
    

    TestModellerLogger.SetLastNodeGuid("cb6d5101-0be0-4519-b1aa-5e71dcdfbef3");
    _SaleInvoice.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("6aeae28b-fd85-4712-8710-18e4b190dd19");
    _SaleInvoice.Enter_Note("");
    

    TestModellerLogger.SetLastNodeGuid("2508d3fa-348f-48f2-914a-4d43591ded90");
    _SaleInvoice.Click_SaveButton();
    

    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("JxXhBRrTRr");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
    _AgentSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("cupiditate");
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Kirlin - Erdman");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
    _bankmenu.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
    _bankmenu.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
    _bankmenu.Click_Bankingmenu();
    

    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
    _bankmenu.Click_Newmenu();
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
    _nBANKTRN.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
    _nBANKTRN.Select_BK_SELECT("nidhibank");
    

    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
    _nBANKTRN.Enter_NDate("44266");
    

    TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
    _nBANKTRN.Enter_n_desc("");
    

    TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
    _nBANKTRN.Enter_Recived_amt("");
    

    TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
    _nBANKTRN.Enter_spnt_amt("");
    

    TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
    _nBANKTRN.Select_Select_VATRate("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
    _nBANKTRN.Click_Select_Option1();
    

    TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
    _nBANKTRN.Enter_BOX2("");
    

    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

pages.Reconcilation _Reconcilation = new pages.Reconcilation(driver);
    TestModellerLogger.SetLastNodeGuid("fc1c2835-8b62-466d-8b91-b2d2b6852de5");
    _Reconcilation.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("30a799ca-18ec-4e8a-9931-57fc4ea2c02b");
    _Reconcilation.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5fa7c856-5fe6-458c-94fd-c74460dd9b1f");
    _Reconcilation.Click_Acntantleftmenu();
    

    TestModellerLogger.SetLastNodeGuid("2f750f49-e648-45ca-898e-d60728db5570");
    _Reconcilation.Click_plussign();
    

    TestModellerLogger.SetLastNodeGuid("a3808a66-3e56-4e52-b2c1-61b7d5d15b32");
    _Reconcilation.Select_SelectAccountType1("Creditors due after one year");
    

    TestModellerLogger.SetLastNodeGuid("2018e2d9-51c8-4e54-8424-0f5147db31d6");
    _Reconcilation.Select_SelectAccount1("All");
    

    TestModellerLogger.SetLastNodeGuid("0892baec-0422-496a-93f9-1028cef59d2c");
    _Reconcilation.Click_View_Reconciled_button1();
    

pages.Reconsilecount _Reconsilecount = new pages.Reconsilecount(driver);
    TestModellerLogger.SetLastNodeGuid("20ec992d-e923-4cd2-946b-1f6e59b73bf6");
    _Reconsilecount.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("778b3b22-188b-4954-8194-ffafa2c2d9c2");
    _Reconsilecount.Click_R1();
    

    TestModellerLogger.SetLastNodeGuid("0fc72130-6b3a-4342-9d0e-19804563923c");
    _Reconsilecount.Click_R2();
    

    TestModellerLogger.SetLastNodeGuid("bccac54a-cf91-4c34-b5de-3168f47f6c6c");
    _Reconsilecount.Click_R3();
    

    TestModellerLogger.SetLastNodeGuid("afa85278-aa67-42ac-9a2e-9d7e8178cae9");
    _Reconsilecount.Click_R4();
    

    TestModellerLogger.SetLastNodeGuid("8be2e142-f2d6-40b4-9f1a-b4f6c31f9776");
    _Reconsilecount.Click_R5();
    

    TestModellerLogger.SetLastNodeGuid("e4e26451-eebc-4ddc-84aa-2abdfce286c3");
    _Reconsilecount.Click_R6();
    

    TestModellerLogger.SetLastNodeGuid("24bb6ec6-e35c-424b-97bf-7d95cfb0c096");
    _Reconsilecount.Click_R7();
    

    TestModellerLogger.SetLastNodeGuid("605ff86c-cdca-413d-8743-6d540ebe0d6f");
    _Reconsilecount.Click_R8();
    

    TestModellerLogger.SetLastNodeGuid("5e13f8d0-f1e2-4527-b2df-049aaf7e1d0e");
    _Reconsilecount.Click_R9();
    

    TestModellerLogger.SetLastNodeGuid("3f0eb811-3a59-4e4e-9972-944ae4cc0d33");
    _Reconsilecount.Click_R10();
    

    TestModellerLogger.SetLastNodeGuid("0ae57fc9-3f5d-4114-951b-51a967c72977");
    _Reconsilecount.Click_R100();
    

    TestModellerLogger.SetLastNodeGuid("bc70be77-e7a6-40c0-94d7-4c667fba43a8");
    _Reconsilecount.Click_R11();
    

    TestModellerLogger.SetLastNodeGuid("40cafd20-4a4a-423c-b1f8-b6457dcfc293");
    _Reconsilecount.Click_R12();
    

    TestModellerLogger.SetLastNodeGuid("333f5500-78ad-458f-a383-b6440369d3de");
    _Reconsilecount.Click_R13();
    

    TestModellerLogger.SetLastNodeGuid("ab08b36a-2f76-46cc-8cf0-f6dc93b8213c");
    _Reconsilecount.Click_R14();
    

    TestModellerLogger.SetLastNodeGuid("ab7f2182-853d-4064-8d23-3ed12179a136");
    _Reconsilecount.Click_R15();
    

    TestModellerLogger.SetLastNodeGuid("6966e097-d89b-4907-b08e-0e68c988cac1");
    _Reconsilecount.Click_R16();
    

    TestModellerLogger.SetLastNodeGuid("5f153217-83e2-4727-89af-4b63829d3f86");
    _Reconsilecount.Click_R17();
    

    TestModellerLogger.SetLastNodeGuid("2437587a-af3c-4c95-8b5f-bba6c149170e");
    _Reconsilecount.Click_R18();
    

    TestModellerLogger.SetLastNodeGuid("2459c2b4-3bfc-481c-a024-a8b07ffb4253");
    _Reconsilecount.Click_R19();
    

    TestModellerLogger.SetLastNodeGuid("7afa71ce-7cce-4ada-8b31-6b446ee3611f");
    _Reconsilecount.Click_R20();
    

    TestModellerLogger.SetLastNodeGuid("130229df-4174-47ff-b315-4e797e797be2");
    _Reconsilecount.Click_R21();
    

    TestModellerLogger.SetLastNodeGuid("67a8a70d-5168-4f86-8da8-7838512ad558");
    _Reconsilecount.Click_R22();
    

    TestModellerLogger.SetLastNodeGuid("69e73e5a-7c35-43b8-b74e-686f7b89d6f5");
    _Reconsilecount.Click_R23();
    

    TestModellerLogger.SetLastNodeGuid("37e489d4-7649-4e8e-8982-e68c437511f0");
    _Reconsilecount.Click_R24();
    

    TestModellerLogger.SetLastNodeGuid("b295b7ea-4eae-4326-90c8-7bc01145c021");
    _Reconsilecount.Click_R25();
    

    TestModellerLogger.SetLastNodeGuid("0016602a-7419-4e1c-843c-4f82ce17b4f9");
    _Reconsilecount.Click_R26();
    

    TestModellerLogger.SetLastNodeGuid("fcf9dc5c-45e6-4309-bceb-fde0aeeaeec2");
    _Reconsilecount.Click_R27();
    

    TestModellerLogger.SetLastNodeGuid("95a7e0ac-fd21-408c-9d9c-027004930449");
    _Reconsilecount.Click_R28();
    

    TestModellerLogger.SetLastNodeGuid("4aa503fb-8b18-4e77-bcda-9559679043d5");
    _Reconsilecount.Click_R29();
    

    TestModellerLogger.SetLastNodeGuid("bc0de1d6-d59c-4900-899d-8bb3da5f1abd");
    _Reconsilecount.Click_R30();
    

    TestModellerLogger.SetLastNodeGuid("9bcccc53-1773-466b-b426-6ee41539f8e3");
    _Reconsilecount.Select_R31("Partial Reconcile");
    

    TestModellerLogger.SetLastNodeGuid("154f0835-2441-4733-9a24-ba5927a5e7e1");
    _Reconsilecount.Click_Success_Transactions_reconciled_successfully();
    

    }

    @Test  (groups= {"SaleInToReconcile","SaleInToReconcile - Default Profile"})
    @TestModellerPath(guid = "9603f74e-e7f3-46e9-a5ab-1cc40501d2d1")
    public void GoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClickAgents27()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("C7DB8jZdPD");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
    _AgentSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("cupiditate");
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Kuhn, Lesch and Bogan");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.SaleInvoice _SaleInvoice = new pages.SaleInvoice(driver);
    TestModellerLogger.SetLastNodeGuid("2f331494-c0ec-443e-b258-bdf3d2f9d9fc");
    _SaleInvoice.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("281121da-f0ce-4629-a4d1-0bc9b4260347");
    _SaleInvoice.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("38510c8a-daac-4ff8-83f3-54b176440787");
    _SaleInvoice.Click_SalesTab();
    

    TestModellerLogger.SetLastNodeGuid("2ce6ef22-01ee-4e82-bcb0-f7ce06badd95");
    _SaleInvoice.Click_NewButton();
    

    TestModellerLogger.SetLastNodeGuid("b605bf48-53b8-4f7f-a009-9ea8d59b69ba");
    _SaleInvoice.Click_NewInvoice();
    

    TestModellerLogger.SetLastNodeGuid("4e83b316-7f8b-49b7-a97f-e85cefb020f0");
    _SaleInvoice.Select_CustomerName("nid");
    

    TestModellerLogger.SetLastNodeGuid("f3edcc35-8d70-4902-81f0-9c5d760fac46");
    _SaleInvoice.Enter_InvoiceNo("");
    

    TestModellerLogger.SetLastNodeGuid("6f885a16-e34c-4d0d-914a-a726c1fa9617");
    _SaleInvoice.Enter_InvoiceDate("44266");
    

    TestModellerLogger.SetLastNodeGuid("294097b8-ccc5-4eb7-baec-1a26ca1364f0");
    _SaleInvoice.Select_IncomeType("");
    

    TestModellerLogger.SetLastNodeGuid("5ccbf01b-65a3-47f5-b916-dab48aab691f");
    _SaleInvoice.Enter_Description("Sunt aliquid aspernatur nihil.
Dolore dolore odio aliquam est doloribus officiis tenetur quo quis.
Minima qui eum corporis similique temporibus.
Corrupti dicta voluptatem sunt.
Autem est molestiae ratione porro molestias non quidem voluptate in.
Sed eligendi nesciunt.
Officia ratione distinctio illo aperiam nam dolore.
Velit qui similique natus ullam.
Laborum suscipit laborum.
Nemo facilis est nisi voluptas sequi ducimus enim.");
    

    TestModellerLogger.SetLastNodeGuid("73677a32-1892-47f6-9783-a1072478778a");
    _SaleInvoice.Enter_UnitPrice("");
    

    TestModellerLogger.SetLastNodeGuid("d810d5bf-a960-434c-9172-1671dd383495");
    _SaleInvoice.Enter_Quantity("");
    

    TestModellerLogger.SetLastNodeGuid("516c7236-f043-4de9-b128-99997ccf1604");
    _SaleInvoice.Select_VATRate("Exempt");
    

    TestModellerLogger.SetLastNodeGuid("cb6d5101-0be0-4519-b1aa-5e71dcdfbef3");
    _SaleInvoice.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("6aeae28b-fd85-4712-8710-18e4b190dd19");
    _SaleInvoice.Enter_Note("");
    

    TestModellerLogger.SetLastNodeGuid("2508d3fa-348f-48f2-914a-4d43591ded90");
    _SaleInvoice.Click_SaveButton();
    

    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("P3oRTV2i4j");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
    _AgentSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("alias");
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("West - Kshlerin");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
    _bankmenu.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
    _bankmenu.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
    _bankmenu.Click_Bankingmenu();
    

    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
    _bankmenu.Click_Newmenu();
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
    _nBANKTRN.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
    _nBANKTRN.Select_BK_SELECT("nidhibank");
    

    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
    _nBANKTRN.Enter_NDate("44266");
    

    TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
    _nBANKTRN.Enter_n_desc("");
    

    TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
    _nBANKTRN.Enter_Recived_amt("");
    

    TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
    _nBANKTRN.Enter_spnt_amt("");
    

    TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
    _nBANKTRN.Select_Select_VATRate("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
    _nBANKTRN.Click_Select_Option1();
    

    TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
    _nBANKTRN.Enter_BOX2("");
    

    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

pages.Reconcilation _Reconcilation = new pages.Reconcilation(driver);
    TestModellerLogger.SetLastNodeGuid("fc1c2835-8b62-466d-8b91-b2d2b6852de5");
    _Reconcilation.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("30a799ca-18ec-4e8a-9931-57fc4ea2c02b");
    _Reconcilation.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5fa7c856-5fe6-458c-94fd-c74460dd9b1f");
    _Reconcilation.Click_Acntantleftmenu();
    

    TestModellerLogger.SetLastNodeGuid("2f750f49-e648-45ca-898e-d60728db5570");
    _Reconcilation.Click_plussign();
    

    TestModellerLogger.SetLastNodeGuid("a3808a66-3e56-4e52-b2c1-61b7d5d15b32");
    _Reconcilation.Select_SelectAccountType1("Creditors due after one year");
    

    TestModellerLogger.SetLastNodeGuid("2018e2d9-51c8-4e54-8424-0f5147db31d6");
    _Reconcilation.Select_SelectAccount1("All");
    

    TestModellerLogger.SetLastNodeGuid("0892baec-0422-496a-93f9-1028cef59d2c");
    _Reconcilation.Click_View_Reconciled_button1();
    

pages.Reconsilecount _Reconsilecount = new pages.Reconsilecount(driver);
    TestModellerLogger.SetLastNodeGuid("20ec992d-e923-4cd2-946b-1f6e59b73bf6");
    _Reconsilecount.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("778b3b22-188b-4954-8194-ffafa2c2d9c2");
    _Reconsilecount.Click_R1();
    

    TestModellerLogger.SetLastNodeGuid("0fc72130-6b3a-4342-9d0e-19804563923c");
    _Reconsilecount.Click_R2();
    

    TestModellerLogger.SetLastNodeGuid("bccac54a-cf91-4c34-b5de-3168f47f6c6c");
    _Reconsilecount.Click_R3();
    

    TestModellerLogger.SetLastNodeGuid("afa85278-aa67-42ac-9a2e-9d7e8178cae9");
    _Reconsilecount.Click_R4();
    

    TestModellerLogger.SetLastNodeGuid("8be2e142-f2d6-40b4-9f1a-b4f6c31f9776");
    _Reconsilecount.Click_R5();
    

    TestModellerLogger.SetLastNodeGuid("e4e26451-eebc-4ddc-84aa-2abdfce286c3");
    _Reconsilecount.Click_R6();
    

    TestModellerLogger.SetLastNodeGuid("24bb6ec6-e35c-424b-97bf-7d95cfb0c096");
    _Reconsilecount.Click_R7();
    

    TestModellerLogger.SetLastNodeGuid("605ff86c-cdca-413d-8743-6d540ebe0d6f");
    _Reconsilecount.Click_R8();
    

    TestModellerLogger.SetLastNodeGuid("5e13f8d0-f1e2-4527-b2df-049aaf7e1d0e");
    _Reconsilecount.Click_R9();
    

    TestModellerLogger.SetLastNodeGuid("3f0eb811-3a59-4e4e-9972-944ae4cc0d33");
    _Reconsilecount.Click_R10();
    

    TestModellerLogger.SetLastNodeGuid("0ae57fc9-3f5d-4114-951b-51a967c72977");
    _Reconsilecount.Click_R100();
    

    TestModellerLogger.SetLastNodeGuid("bc70be77-e7a6-40c0-94d7-4c667fba43a8");
    _Reconsilecount.Click_R11();
    

    TestModellerLogger.SetLastNodeGuid("40cafd20-4a4a-423c-b1f8-b6457dcfc293");
    _Reconsilecount.Click_R12();
    

    TestModellerLogger.SetLastNodeGuid("333f5500-78ad-458f-a383-b6440369d3de");
    _Reconsilecount.Click_R13();
    

    TestModellerLogger.SetLastNodeGuid("ab08b36a-2f76-46cc-8cf0-f6dc93b8213c");
    _Reconsilecount.Click_R14();
    

    TestModellerLogger.SetLastNodeGuid("ab7f2182-853d-4064-8d23-3ed12179a136");
    _Reconsilecount.Click_R15();
    

    TestModellerLogger.SetLastNodeGuid("6966e097-d89b-4907-b08e-0e68c988cac1");
    _Reconsilecount.Click_R16();
    

    TestModellerLogger.SetLastNodeGuid("5f153217-83e2-4727-89af-4b63829d3f86");
    _Reconsilecount.Click_R17();
    

    TestModellerLogger.SetLastNodeGuid("2437587a-af3c-4c95-8b5f-bba6c149170e");
    _Reconsilecount.Click_R18();
    

    TestModellerLogger.SetLastNodeGuid("2459c2b4-3bfc-481c-a024-a8b07ffb4253");
    _Reconsilecount.Click_R19();
    

    TestModellerLogger.SetLastNodeGuid("7afa71ce-7cce-4ada-8b31-6b446ee3611f");
    _Reconsilecount.Click_R20();
    

    TestModellerLogger.SetLastNodeGuid("130229df-4174-47ff-b315-4e797e797be2");
    _Reconsilecount.Click_R21();
    

    TestModellerLogger.SetLastNodeGuid("67a8a70d-5168-4f86-8da8-7838512ad558");
    _Reconsilecount.Click_R22();
    

    TestModellerLogger.SetLastNodeGuid("69e73e5a-7c35-43b8-b74e-686f7b89d6f5");
    _Reconsilecount.Click_R23();
    

    TestModellerLogger.SetLastNodeGuid("37e489d4-7649-4e8e-8982-e68c437511f0");
    _Reconsilecount.Click_R24();
    

    TestModellerLogger.SetLastNodeGuid("b295b7ea-4eae-4326-90c8-7bc01145c021");
    _Reconsilecount.Click_R25();
    

    TestModellerLogger.SetLastNodeGuid("0016602a-7419-4e1c-843c-4f82ce17b4f9");
    _Reconsilecount.Click_R26();
    

    TestModellerLogger.SetLastNodeGuid("fcf9dc5c-45e6-4309-bceb-fde0aeeaeec2");
    _Reconsilecount.Click_R27();
    

    TestModellerLogger.SetLastNodeGuid("95a7e0ac-fd21-408c-9d9c-027004930449");
    _Reconsilecount.Click_R28();
    

    TestModellerLogger.SetLastNodeGuid("4aa503fb-8b18-4e77-bcda-9559679043d5");
    _Reconsilecount.Click_R29();
    

    TestModellerLogger.SetLastNodeGuid("bc0de1d6-d59c-4900-899d-8bb3da5f1abd");
    _Reconsilecount.Click_R30();
    

    TestModellerLogger.SetLastNodeGuid("9bcccc53-1773-466b-b426-6ee41539f8e3");
    _Reconsilecount.Select_R31("Partial Reconcile");
    

    TestModellerLogger.SetLastNodeGuid("154f0835-2441-4733-9a24-ba5927a5e7e1");
    _Reconsilecount.Click_Success_Transactions_reconciled_successfully();
    

    }

    @Test  (groups= {"SaleInToReconcile","SaleInToReconcile - Default Profile"})
    @TestModellerPath(guid = "235d32c7-23dc-4d3f-98b2-a043af884c90")
    public void GoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClickAgents28() throws InterruptedException, IOException
    {
        
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
    //    
    //
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
        

    pages.SaleInvoice _SaleInvoice = new pages.SaleInvoice(driver);
//        TestModellerLogger.SetLastNodeGuid("2f331494-c0ec-443e-b258-bdf3d2f9d9fc");
//        _SaleInvoice.GoToUrl();
    //    
    //
//        TestModellerLogger.SetLastNodeGuid("281121da-f0ce-4629-a4d1-0bc9b4260347");
//        _SaleInvoice.AssertUrl();
        

        TestModellerLogger.SetLastNodeGuid("38510c8a-daac-4ff8-83f3-54b176440787");
        _SaleInvoice.Click_SalesTab();
        

        TestModellerLogger.SetLastNodeGuid("2ce6ef22-01ee-4e82-bcb0-f7ce06badd95");
        _SaleInvoice.Click_NewButton();
        

        TestModellerLogger.SetLastNodeGuid("b605bf48-53b8-4f7f-a009-9ea8d59b69ba");
        _SaleInvoice.Click_NewInvoice();
        

        TestModellerLogger.SetLastNodeGuid("4e83b316-7f8b-49b7-a97f-e85cefb020f0");
        _SaleInvoice.Select_CustomerName(data[13]);
        

        TestModellerLogger.SetLastNodeGuid("f3edcc35-8d70-4902-81f0-9c5d760fac46");
        _SaleInvoice.Enter_InvoiceNo(data[15]);
        

        TestModellerLogger.SetLastNodeGuid("6f885a16-e34c-4d0d-914a-a726c1fa9617");
        _SaleInvoice.Enter_InvoiceDate(data[14]);
        

        TestModellerLogger.SetLastNodeGuid("294097b8-ccc5-4eb7-baec-1a26ca1364f0");
        _SaleInvoice.Select_IncomeType(data[16]);
        

        TestModellerLogger.SetLastNodeGuid("5ccbf01b-65a3-47f5-b916-dab48aab691f");
        _SaleInvoice.Enter_Description(data[17]);
        

        TestModellerLogger.SetLastNodeGuid("73677a32-1892-47f6-9783-a1072478778a");
        _SaleInvoice.Enter_UnitPrice(data[18]);
        

        TestModellerLogger.SetLastNodeGuid("d810d5bf-a960-434c-9172-1671dd383495");
        _SaleInvoice.Enter_Quantity(data[19]);
        

        TestModellerLogger.SetLastNodeGuid("516c7236-f043-4de9-b128-99997ccf1604");
        _SaleInvoice.Select_VATRate(data[20]);
        
    //
//        TestModellerLogger.SetLastNodeGuid("cb6d5101-0be0-4519-b1aa-5e71dcdfbef3");
//        _SaleInvoice.Click_Tickformorelineitems();
        

        TestModellerLogger.SetLastNodeGuid("6aeae28b-fd85-4712-8710-18e4b190dd19");
        _SaleInvoice.Enter_Note(data[21]);
        

        TestModellerLogger.SetLastNodeGuid("2508d3fa-348f-48f2-914a-4d43591ded90");
        _SaleInvoice.Click_SaveButton();

    pages.bankmenu _bankmenu = new pages.bankmenu(driver);
       TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
        _bankmenu.GoToUrl();
        
    //
//        TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
//        _bankmenu.AssertUrl();
    //    

        TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
        _bankmenu.Click_Bankingmenu();
        

        TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
        _bankmenu.Click_Newmenu();
        

    pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
     TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
        _nBANKTRN.GoToUrl();
        

//        TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
//        _nBANKTRN.AssertUrl();
    //    

        TestModellerLogger.SetLastNodeGuid("32c9440758-2f86-4894-829c-0d5b167b4d77");
        _nBANKTRN.Select_BK_SELECT(data[5]);
        

        TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
        _nBANKTRN.Enter_NDate(data[6]);
        

        TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
        _nBANKTRN.Enter_n_desc(data[7]);
        

        TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
        _nBANKTRN.Enter_Recived_amt(data[8]);
        

        TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
        _nBANKTRN.Enter_spnt_amt(data[9]);
        

      TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
       _nBANKTRN.Select_Select_VATRate(data[10]);
        

        TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
        _nBANKTRN.Click_Select_Option1();
        

        TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
        _nBANKTRN.Enter_BOX2(data[11]);
        

//        TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
//        _nBANKTRN.Click__1400_DATA();
        

        TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
        _nBANKTRN.Click__Save_();
        

    pages.Reconcilation _Reconcilation = new pages.Reconcilation(driver);
//        TestModellerLogger.SetLastNodeGuid("fc1c2835-8b62-466d-8b91-b2d2b6852de5");
//        _Reconcilation.GoToUrl();
    //    
    //
//        TestModellerLogger.SetLastNodeGuid("30a799ca-18ec-4e8a-9931-57fc4ea2c02b");
//        _Reconcilation.AssertUrl();
        

        TestModellerLogger.SetLastNodeGuid("5fa7c856-5fe6-458c-94fd-c74460dd9b1f");
        _Reconcilation.Click_Acntantleftmenu();
        

        TestModellerLogger.SetLastNodeGuid("2f750f49-e648-45ca-898e-d60728db5570");
        _Reconcilation.Click_plussign();
        

        TestModellerLogger.SetLastNodeGuid("a3808a66-3e56-4e52-b2c1-61b7d5d15b32");
        _Reconcilation.Select_SelectAccountType1("Customer");
        

        TestModellerLogger.SetLastNodeGuid("2018e2d9-51c8-4e54-8424-0f5147db31d6");
        _Reconcilation.Select_SelectAccount1("Nidhis");
        

//        TestModellerLogger.SetLastNodeGuid("0892baec-0422-496a-93f9-1028cef59d2c");
//        _Reconcilation.Click_View_Reconciled_button1();


     pages.Reconsilecount _Reconsilecount = new pages.Reconsilecount(driver);
//        TestModellerLogger.SetLastNodeGuid("20ec992d-e923-4cd2-946b-1f6e59b73bf6");
//        _Reconsilecount.GoToUrl();
     pages.ungroup _ungroup = new pages.ungroup(driver);

     TestModellerLogger.SetLastNodeGuid("8579422c-5a13-4d28-bcdb-80684455e0ac");
     _ungroup.Click_selectallcheckbbox();
     

     TestModellerLogger.SetLastNodeGuid("e8d9d338-eb30-4309-96e4-dc0de1ba572c");
     _ungroup.Click_Ungroup_linkselected();

        TestModellerLogger.SetLastNodeGuid("778b3b22-188b-4954-8194-ffafa2c2d9c2");
        _Reconsilecount.Click_R1();
        
        

       TestModellerLogger.SetLastNodeGuid("0fc72130-6b3a-4342-9d0e-19804563923c");
        _Reconsilecount.Click_R2();
        

    }
*/
