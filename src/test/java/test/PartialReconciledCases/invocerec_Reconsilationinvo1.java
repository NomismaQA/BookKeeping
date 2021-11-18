package test.PartialReconciledCases;

import reports.TestNGListener;
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
//import utilities.ExcelUtility;
import utilities.testmodeller.TestModellerLogger;

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/aba8a08c-20c3-4865-8886-1946d70f4a17
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1167, profileId = 101057)
public class invocerec_Reconsilationinvo1 extends TestBase
{
    
	String sTestCaseID=null;
    String[] data=null;
    String Sheet =null;
    
    @Test  (groups= {"invoce_rec","invoce_rec - Reconsilation_invo1"})
    @TestModellerPath(guid = "064ebf4a-3c70-4734-9159-5b0c33a40efd")
    public void ReconsilationinvoGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAsse1() throws InterruptedException, IOException, InvalidFormatException, HeadlessException, AWTException
    {
    	sTestCaseID="TC1";
    	Sheet="Sheet1";
    	data =ExcelUtility.toReadExcelData("TC1", "Sheet1");
        
        pages.PartialReconciledCases.nlogin _nlogin = new pages.PartialReconciledCases.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//    _nlogin.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN(data[1]);
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS(data[2]);
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.PartialReconciledCases.AgentSearch _AgentSearch = new pages.PartialReconciledCases.AgentSearch(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

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
    

pages.PartialReconciledCases.Searchclient _Searchclient = new pages.PartialReconciledCases.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

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
    

pages.PartialReconciledCases.SaleInvoice _SaleInvoice = new pages.PartialReconciledCases.SaleInvoice(driver);
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
    _SaleInvoice.Select_CustomerName(data[13]);
    

    TestModellerLogger.SetLastNodeGuid("6f885a16-e34c-4d0d-914a-a726c1fa9617");
    _SaleInvoice.Enter_InvoiceDate(data[14]);
    
    TestModellerLogger.SetLastNodeGuid("f3edcc35-8d70-4902-81f0-9c5d760fac46");
    _SaleInvoice.Enter_InvoiceNo(data[15]);
    

    

    TestModellerLogger.SetLastNodeGuid("294097b8-ccc5-4eb7-baec-1a26ca1364f0");
    _SaleInvoice.Select_IncomeType(data[16]);
    

    TestModellerLogger.SetLastNodeGuid("5ccbf01b-65a3-47f5-b916-dab48aab691f");
    _SaleInvoice.Enter_Description(data[17]);
    

    TestModellerLogger.SetLastNodeGuid("73677a32-1892-47f6-9783-a1072478778a");
    _SaleInvoice.Enter_UnitPrice(data[18]);
    

    TestModellerLogger.SetLastNodeGuid("d810d5bf-a960-434c-9172-1671dd383495");
    _SaleInvoice.Enter_Quantity("2");
    

    TestModellerLogger.SetLastNodeGuid("516c7236-f043-4de9-b128-99997ccf1604");
    _SaleInvoice.Select_VATRate(data[20]);
    

//    TestModellerLogger.SetLastNodeGuid("cb6d5101-0be0-4519-b1aa-5e71dcdfbef3");
//    _SaleInvoice.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("6aeae28b-fd85-4712-8710-18e4b190dd19");
    _SaleInvoice.Enter_Note(data[21]);
    

    TestModellerLogger.SetLastNodeGuid("2508d3fa-348f-48f2-914a-4d43591ded90");
    _SaleInvoice.Click_SaveButton();
    Thread.sleep(1000);

pages.PartialReconciledCases.Reconcilation _Reconcilation = new pages.PartialReconciledCases.Reconcilation(driver);
    TestModellerLogger.SetLastNodeGuid("fc1c2835-8b62-466d-8b91-b2d2b6852de5");
    _Reconcilation.GoToUrl();
    
//
//    TestModellerLogger.SetLastNodeGuid("30a799ca-18ec-4e8a-9931-57fc4ea2c02b");
//    _Reconcilation.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5fa7c856-5fe6-458c-94fd-c74460dd9b1f");
    _Reconcilation.Click_Acntantleftmenu();
    

    TestModellerLogger.SetLastNodeGuid("2f750f49-e648-45ca-898e-d60728db5570");
    _Reconcilation.Click_plussign();
    

    TestModellerLogger.SetLastNodeGuid("a3808a66-3e56-4e52-b2c1-61b7d5d15b32");
    _Reconcilation.Select_SelectAccountType1("Customer");
    

    TestModellerLogger.SetLastNodeGuid("2018e2d9-51c8-4e54-8424-0f5147db31d6");
    _Reconcilation.Select_SelectAccount1("Nidhis");
    

//    TestModellerLogger.SetLastNodeGuid("0892baec-0422-496a-93f9-1028cef59d2c");
//    _Reconcilation.Click_View_Reconciled_button1();
    

pages.PartialReconciledCases.Reconcillation2 _Reconcillation2 = new pages.PartialReconciledCases.Reconcillation2(driver);
//    TestModellerLogger.SetLastNodeGuid("a8b9145f-210e-422a-9f7b-2cbbedbe5c75");
//    _Reconcillation2.GoToUrl();
//    

//    TestModellerLogger.SetLastNodeGuid("42a7c59c-1ed5-4922-b665-62936da42b94");
//    _Reconcillation2.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("02ae2364-ec2d-495d-80be-45a263ada09d");
    _Reconcillation2.Click_RCheckbox();
    

    TestModellerLogger.SetLastNodeGuid("fac2fd41-e03f-432c-a1c7-7996872464c1");
    _Reconcillation2.Click_Trans_invo();
    

//    TestModellerLogger.SetLastNodeGuid("11863898-c23f-49f4-a940-569e2f27ec53");
//    _Reconcillation2.Click_RCheckbnox2();
//    
//
//    TestModellerLogger.SetLastNodeGuid("3bb7749b-d96b-417c-a0b1-25bc3e3da18d");
//    _Reconcillation2.Click_Trans_invo2();
    

    TestModellerLogger.SetLastNodeGuid("8906486f-eb0d-4d50-8f8b-984a6b7e7279");
    _Reconcillation2.Click_PageReconcilebutton();

//    TestModellerLogger.SetLastNodeGuid("23721aaf-c33b-485e-b4e0-c177d5e10082");
//    _Reconcillation2.Select_ctl00cPHddReconcileType1("Reconcile with Write Off");
//    
//
//    TestModellerLogger.SetLastNodeGuid("9fac4423-264a-4602-a907-7a4f0cc7fbf0");
//    _Reconcillation2.Click__Reconcile_();
//    

//    TestModellerLogger.SetLastNodeGuid("9e53d15f-7873-4de1-ae7d-a5d943aae65a");
//    _Reconcillation2.Click_Confirmationmessag1();
    

    }
}
/*

    @Test  (groups= {"invoce_rec","invoce_rec - Reconsilation_invo1"})
    @TestModellerPath(guid = "8fa13156-d4c3-47bc-9f91-0ada02507eb5")
    public void ReconsilationinvoGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAsse2()
    {
        
        pages.PartialReconciledCases.nlogin _nlogin = new pages.PartialReconciledCases.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("EjILjFOvow");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.PartialReconciledCases.AgentSearch _AgentSearch = new pages.PartialReconciledCases.AgentSearch(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
    _AgentSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("aspernatur");
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.PartialReconciledCases.Searchclient _Searchclient = new pages.PartialReconciledCases.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Morissette LLC");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.PartialReconciledCases.SaleInvoice _SaleInvoice = new pages.PartialReconciledCases.SaleInvoice(driver);
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
    _SaleInvoice.Enter_InvoiceDate("44261");
    

    TestModellerLogger.SetLastNodeGuid("294097b8-ccc5-4eb7-baec-1a26ca1364f0");
    _SaleInvoice.Select_IncomeType("");
    

    TestModellerLogger.SetLastNodeGuid("5ccbf01b-65a3-47f5-b916-dab48aab691f");
    _SaleInvoice.Enter_Description("Maxime vel quidem distinctio.
Sed et voluptatem.
Magni consequatur ipsa incidunt sapiente ut quia nemo temporibus.
Adipisci est nihil et.
Tempora hic ad accusantium nisi quibusdam quae.
Nihil reiciendis autem officia.
Omnis error ut ut.
Sit ad est blanditiis soluta debitis aut mollitia.
Ut deleniti praesentium excepturi quia et quae iusto aut.
Numquam sint eaque dicta quia et magnam ipsum cum dolor.");
    

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
    

pages.PartialReconciledCases.Reconcilation _Reconcilation = new pages.PartialReconciledCases.Reconcilation(driver);
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
    

pages.PartialReconciledCases.Reconcillation2 _Reconcillation2 = new pages.PartialReconciledCases.Reconcillation2(driver);
    TestModellerLogger.SetLastNodeGuid("a8b9145f-210e-422a-9f7b-2cbbedbe5c75");
    _Reconcillation2.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("42a7c59c-1ed5-4922-b665-62936da42b94");
    _Reconcillation2.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("02ae2364-ec2d-495d-80be-45a263ada09d");
    _Reconcillation2.Click_RCheckbox();
    

    TestModellerLogger.SetLastNodeGuid("fac2fd41-e03f-432c-a1c7-7996872464c1");
    _Reconcillation2.Click_Trans_invo();
    

    TestModellerLogger.SetLastNodeGuid("11863898-c23f-49f4-a940-569e2f27ec53");
    _Reconcillation2.Click_RCheckbnox2();
    

    TestModellerLogger.SetLastNodeGuid("3bb7749b-d96b-417c-a0b1-25bc3e3da18d");
    _Reconcillation2.Click_Trans_invo2();
    

    TestModellerLogger.SetLastNodeGuid("8906486f-eb0d-4d50-8f8b-984a6b7e7279");
    _Reconcillation2.Click_PageReconcilebutton();
    

    TestModellerLogger.SetLastNodeGuid("23721aaf-c33b-485e-b4e0-c177d5e10082");
    _Reconcillation2.Select_ctl00cPHddReconcileType1("Reconcile with Advance");
    

    TestModellerLogger.SetLastNodeGuid("9fac4423-264a-4602-a907-7a4f0cc7fbf0");
    _Reconcillation2.Click__Reconcile_();
    

    TestModellerLogger.SetLastNodeGuid("9e53d15f-7873-4de1-ae7d-a5d943aae65a");
    _Reconcillation2.Click_Confirmationmessag1();
    

    }

    @Test  (groups= {"invoce_rec","invoce_rec - Reconsilation_invo1"})
    @TestModellerPath(guid = "64beb359-84d1-479d-95d7-8a14ec635aac")
    public void ReconsilationinvoGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAsse3()
    {
        
        pages.PartialReconciledCases.nlogin _nlogin = new pages.PartialReconciledCases.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("R5rzri9E5f");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.PartialReconciledCases.AgentSearch _AgentSearch = new pages.PartialReconciledCases.AgentSearch(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
    _AgentSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("consequatur");
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.PartialReconciledCases.Searchclient _Searchclient = new pages.PartialReconciledCases.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Ratke, Wintheiser and Konopelski");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.PartialReconciledCases.SaleInvoice _SaleInvoice = new pages.PartialReconciledCases.SaleInvoice(driver);
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
    _SaleInvoice.Enter_InvoiceDate("44261");
    

    TestModellerLogger.SetLastNodeGuid("294097b8-ccc5-4eb7-baec-1a26ca1364f0");
    _SaleInvoice.Select_IncomeType("");
    

    TestModellerLogger.SetLastNodeGuid("5ccbf01b-65a3-47f5-b916-dab48aab691f");
    _SaleInvoice.Enter_Description("Soluta aut nisi blanditiis laboriosam quia.
Exercitationem amet omnis voluptas et nihil consequuntur quam ut.
Laborum aut iste incidunt.
Dolor nam voluptas provident asperiores.
Aperiam reprehenderit praesentium et.
Nihil asperiores beatae amet voluptas provident voluptas qui quibusdam.
Enim non quo est explicabo voluptas.
Sunt aut nesciunt voluptates labore voluptate et cum.
Aut sit rerum voluptatem quibusdam explicabo amet.
Alias dolores nisi beatae ea vitae deleniti velit.");
    

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
    

pages.PartialReconciledCases.Reconcilation _Reconcilation = new pages.PartialReconciledCases.Reconcilation(driver);
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
    

pages.PartialReconciledCases.Reconcillation2 _Reconcillation2 = new pages.PartialReconciledCases.Reconcillation2(driver);
    TestModellerLogger.SetLastNodeGuid("a8b9145f-210e-422a-9f7b-2cbbedbe5c75");
    _Reconcillation2.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("42a7c59c-1ed5-4922-b665-62936da42b94");
    _Reconcillation2.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("02ae2364-ec2d-495d-80be-45a263ada09d");
    _Reconcillation2.Click_RCheckbox();
    

    TestModellerLogger.SetLastNodeGuid("fac2fd41-e03f-432c-a1c7-7996872464c1");
    _Reconcillation2.Click_Trans_invo();
    

    TestModellerLogger.SetLastNodeGuid("11863898-c23f-49f4-a940-569e2f27ec53");
    _Reconcillation2.Click_RCheckbnox2();
    

    TestModellerLogger.SetLastNodeGuid("3bb7749b-d96b-417c-a0b1-25bc3e3da18d");
    _Reconcillation2.Click_Trans_invo2();
    

    TestModellerLogger.SetLastNodeGuid("8906486f-eb0d-4d50-8f8b-984a6b7e7279");
    _Reconcillation2.Click_PageReconcilebutton();
    

    TestModellerLogger.SetLastNodeGuid("23721aaf-c33b-485e-b4e0-c177d5e10082");
    _Reconcillation2.Select_ctl00cPHddReconcileType1("Reconcile with Journal Entry");
    

    TestModellerLogger.SetLastNodeGuid("9fac4423-264a-4602-a907-7a4f0cc7fbf0");
    _Reconcillation2.Click__Reconcile_();
    

    TestModellerLogger.SetLastNodeGuid("9e53d15f-7873-4de1-ae7d-a5d943aae65a");
    _Reconcillation2.Click_Confirmationmessag1();
    

    }

    @Test  (groups= {"invoce_rec","invoce_rec - Reconsilation_invo1"})
    @TestModellerPath(guid = "4046245f-99d1-422a-9eaf-d9aaf84a389f")
    public void ReconsilationinvoGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAsse4()
    {
        
        pages.PartialReconciledCases.nlogin _nlogin = new pages.PartialReconciledCases.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("IoreoupmAO");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.PartialReconciledCases.AgentSearch _AgentSearch = new pages.PartialReconciledCases.AgentSearch(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
    _AgentSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("officiis");
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.PartialReconciledCases.Searchclient _Searchclient = new pages.PartialReconciledCases.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("McGlynn - Crist");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.PartialReconciledCases.SaleInvoice _SaleInvoice = new pages.PartialReconciledCases.SaleInvoice(driver);
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
    _SaleInvoice.Enter_InvoiceDate("44261");
    

    TestModellerLogger.SetLastNodeGuid("294097b8-ccc5-4eb7-baec-1a26ca1364f0");
    _SaleInvoice.Select_IncomeType("");
    

    TestModellerLogger.SetLastNodeGuid("5ccbf01b-65a3-47f5-b916-dab48aab691f");
    _SaleInvoice.Enter_Description("Sequi est repellat quas sed facilis eius.
Consectetur est sapiente voluptatibus distinctio non voluptatem cum.
Aut in illo itaque id delectus iusto.
Ut reiciendis id est assumenda sed perspiciatis consectetur similique.
Ex atque voluptates eveniet.
Est doloribus vel sequi.
Eos harum est suscipit illum autem distinctio aut aspernatur sunt.
Omnis error nihil similique nam atque illo.
Voluptatem quam autem explicabo aut nam.
Deserunt et eum voluptate.");
    

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
    

pages.PartialReconciledCases.Reconcilation _Reconcilation = new pages.PartialReconciledCases.Reconcilation(driver);
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
    

pages.PartialReconciledCases.Reconcillation2 _Reconcillation2 = new pages.PartialReconciledCases.Reconcillation2(driver);
    TestModellerLogger.SetLastNodeGuid("a8b9145f-210e-422a-9f7b-2cbbedbe5c75");
    _Reconcillation2.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("42a7c59c-1ed5-4922-b665-62936da42b94");
    _Reconcillation2.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("02ae2364-ec2d-495d-80be-45a263ada09d");
    _Reconcillation2.Click_RCheckbox();
    

    TestModellerLogger.SetLastNodeGuid("fac2fd41-e03f-432c-a1c7-7996872464c1");
    _Reconcillation2.Click_Trans_invo();
    

    TestModellerLogger.SetLastNodeGuid("11863898-c23f-49f4-a940-569e2f27ec53");
    _Reconcillation2.Click_RCheckbnox2();
    

    TestModellerLogger.SetLastNodeGuid("3bb7749b-d96b-417c-a0b1-25bc3e3da18d");
    _Reconcillation2.Click_Trans_invo2();
    

    TestModellerLogger.SetLastNodeGuid("8906486f-eb0d-4d50-8f8b-984a6b7e7279");
    _Reconcillation2.Click_PageReconcilebutton();
    

    TestModellerLogger.SetLastNodeGuid("23721aaf-c33b-485e-b4e0-c177d5e10082");
    _Reconcillation2.Select_ctl00cPHddReconcileType1("Partial Reconcile");
    

    TestModellerLogger.SetLastNodeGuid("9fac4423-264a-4602-a907-7a4f0cc7fbf0");
    _Reconcillation2.Click__Reconcile_();
    

    TestModellerLogger.SetLastNodeGuid("9e53d15f-7873-4de1-ae7d-a5d943aae65a");
    _Reconcillation2.Click_Confirmationmessag1();
    

    }

    @Test  (groups= {"invoce_rec","invoce_rec - Reconsilation_invo1"})
    @TestModellerPath(guid = "8bd2a180-c342-48d6-a29b-732193cb3392")
    public void ReconsilationinvoGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAsse5()
    {
        
        pages.PartialReconciledCases.nlogin _nlogin = new pages.PartialReconciledCases.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("zkmOxCFrEs");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.PartialReconciledCases.AgentSearch _AgentSearch = new pages.PartialReconciledCases.AgentSearch(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
    _AgentSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("provident");
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.PartialReconciledCases.Searchclient _Searchclient = new pages.PartialReconciledCases.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Ziemann LLC");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.PartialReconciledCases.SaleInvoice _SaleInvoice = new pages.PartialReconciledCases.SaleInvoice(driver);
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
    _SaleInvoice.Enter_InvoiceDate("44261");
    

    TestModellerLogger.SetLastNodeGuid("294097b8-ccc5-4eb7-baec-1a26ca1364f0");
    _SaleInvoice.Select_IncomeType("");
    

    TestModellerLogger.SetLastNodeGuid("5ccbf01b-65a3-47f5-b916-dab48aab691f");
    _SaleInvoice.Enter_Description("Et sed sit cupiditate dolorem itaque reprehenderit.
Sint quasi sed.
Libero fuga dolor facere et est fuga.
Rerum veritatis est incidunt nostrum vitae sit accusantium enim.
Nihil aut aliquid quasi ad iure sunt eos et aut.
Consequatur maiores et et est minus.
Laborum quia et in.
Eveniet est vero et aut.
Dicta facere commodi qui.
Consequatur iusto dolore mollitia ut reprehenderit dolor voluptas.");
    

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
    

pages.PartialReconciledCases.Reconcilation _Reconcilation = new pages.PartialReconciledCases.Reconcilation(driver);
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
    _Reconcilation.Select_SelectAccount1("nid");
    

    TestModellerLogger.SetLastNodeGuid("0892baec-0422-496a-93f9-1028cef59d2c");
    _Reconcilation.Click_View_Reconciled_button1();
    

pages.PartialReconciledCases.Reconcillation2 _Reconcillation2 = new pages.PartialReconciledCases.Reconcillation2(driver);
    TestModellerLogger.SetLastNodeGuid("a8b9145f-210e-422a-9f7b-2cbbedbe5c75");
    _Reconcillation2.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("42a7c59c-1ed5-4922-b665-62936da42b94");
    _Reconcillation2.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("02ae2364-ec2d-495d-80be-45a263ada09d");
    _Reconcillation2.Click_RCheckbox();
    

    TestModellerLogger.SetLastNodeGuid("fac2fd41-e03f-432c-a1c7-7996872464c1");
    _Reconcillation2.Click_Trans_invo();
    

    TestModellerLogger.SetLastNodeGuid("11863898-c23f-49f4-a940-569e2f27ec53");
    _Reconcillation2.Click_RCheckbnox2();
    

    TestModellerLogger.SetLastNodeGuid("3bb7749b-d96b-417c-a0b1-25bc3e3da18d");
    _Reconcillation2.Click_Trans_invo2();
    

    TestModellerLogger.SetLastNodeGuid("8906486f-eb0d-4d50-8f8b-984a6b7e7279");
    _Reconcillation2.Click_PageReconcilebutton();
    

    TestModellerLogger.SetLastNodeGuid("23721aaf-c33b-485e-b4e0-c177d5e10082");
    _Reconcillation2.Select_ctl00cPHddReconcileType1("Reconcile with Write Off");
    

    TestModellerLogger.SetLastNodeGuid("9fac4423-264a-4602-a907-7a4f0cc7fbf0");
    _Reconcillation2.Click__Reconcile_();
    

    TestModellerLogger.SetLastNodeGuid("9e53d15f-7873-4de1-ae7d-a5d943aae65a");
    _Reconcillation2.Click_Confirmationmessag1();
    

    }

    @Test  (groups= {"invoce_rec","invoce_rec - Reconsilation_invo1"})
    @TestModellerPath(guid = "c5f0a0ce-dc66-4471-9c5f-1712097b8847")
    public void ReconsilationinvoGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAsse6()
    {
        
        pages.PartialReconciledCases.nlogin _nlogin = new pages.PartialReconciledCases.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("JZBvHQAxGe");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.PartialReconciledCases.AgentSearch _AgentSearch = new pages.PartialReconciledCases.AgentSearch(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
    _AgentSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("blanditiis");
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.PartialReconciledCases.Searchclient _Searchclient = new pages.PartialReconciledCases.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Johnson - Williamson");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.PartialReconciledCases.SaleInvoice _SaleInvoice = new pages.PartialReconciledCases.SaleInvoice(driver);
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
    _SaleInvoice.Enter_InvoiceDate("44261");
    

    TestModellerLogger.SetLastNodeGuid("294097b8-ccc5-4eb7-baec-1a26ca1364f0");
    _SaleInvoice.Select_IncomeType("");
    

    TestModellerLogger.SetLastNodeGuid("5ccbf01b-65a3-47f5-b916-dab48aab691f");
    _SaleInvoice.Enter_Description("Et nesciunt aliquam aperiam beatae aliquid.
Commodi non dolores ut eius earum.
Tenetur possimus ut excepturi.
Cupiditate tempore quo id qui hic culpa expedita veritatis.
Temporibus quia non iusto impedit dolores quis ea.
Inventore est voluptate veritatis asperiores.
Aperiam adipisci quia fugiat.
Aut repudiandae repudiandae quidem iusto.
Sint nihil iusto dicta et optio iusto distinctio id.
Ut repellendus ut consequatur nam in eius qui illo fugit.");
    

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
    

pages.PartialReconciledCases.Reconcilation _Reconcilation = new pages.PartialReconciledCases.Reconcilation(driver);
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
    _Reconcilation.Select_SelectAccount1("Nidhi");
    

    TestModellerLogger.SetLastNodeGuid("0892baec-0422-496a-93f9-1028cef59d2c");
    _Reconcilation.Click_View_Reconciled_button1();
    

pages.PartialReconciledCases.Reconcillation2 _Reconcillation2 = new pages.PartialReconciledCases.Reconcillation2(driver);
    TestModellerLogger.SetLastNodeGuid("a8b9145f-210e-422a-9f7b-2cbbedbe5c75");
    _Reconcillation2.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("42a7c59c-1ed5-4922-b665-62936da42b94");
    _Reconcillation2.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("02ae2364-ec2d-495d-80be-45a263ada09d");
    _Reconcillation2.Click_RCheckbox();
    

    TestModellerLogger.SetLastNodeGuid("fac2fd41-e03f-432c-a1c7-7996872464c1");
    _Reconcillation2.Click_Trans_invo();
    

    TestModellerLogger.SetLastNodeGuid("11863898-c23f-49f4-a940-569e2f27ec53");
    _Reconcillation2.Click_RCheckbnox2();
    

    TestModellerLogger.SetLastNodeGuid("3bb7749b-d96b-417c-a0b1-25bc3e3da18d");
    _Reconcillation2.Click_Trans_invo2();
    

    TestModellerLogger.SetLastNodeGuid("8906486f-eb0d-4d50-8f8b-984a6b7e7279");
    _Reconcillation2.Click_PageReconcilebutton();
    

    TestModellerLogger.SetLastNodeGuid("23721aaf-c33b-485e-b4e0-c177d5e10082");
    _Reconcillation2.Select_ctl00cPHddReconcileType1("Reconcile with Write Off");
    

    TestModellerLogger.SetLastNodeGuid("9fac4423-264a-4602-a907-7a4f0cc7fbf0");
    _Reconcillation2.Click__Reconcile_();
    

    TestModellerLogger.SetLastNodeGuid("9e53d15f-7873-4de1-ae7d-a5d943aae65a");
    _Reconcillation2.Click_Confirmationmessag1();
    

    }

    @Test  (groups= {"invoce_rec","invoce_rec - Reconsilation_invo1"})
    @TestModellerPath(guid = "6e507ce5-1af5-4762-8070-bbce53dc8b7e")
    public void ReconsilationinvoGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAsse7()
    {
        
        pages.PartialReconciledCases.nlogin _nlogin = new pages.PartialReconciledCases.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("YdQjgCmces");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.PartialReconciledCases.AgentSearch _AgentSearch = new pages.PartialReconciledCases.AgentSearch(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
    _AgentSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("voluptatem");
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.PartialReconciledCases.Searchclient _Searchclient = new pages.PartialReconciledCases.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Zulauf Group");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.PartialReconciledCases.SaleInvoice _SaleInvoice = new pages.PartialReconciledCases.SaleInvoice(driver);
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
    _SaleInvoice.Enter_InvoiceDate("44261");
    

    TestModellerLogger.SetLastNodeGuid("294097b8-ccc5-4eb7-baec-1a26ca1364f0");
    _SaleInvoice.Select_IncomeType("");
    

    TestModellerLogger.SetLastNodeGuid("5ccbf01b-65a3-47f5-b916-dab48aab691f");
    _SaleInvoice.Enter_Description("Et et ut natus.
Ut ea aliquam.
Veritatis voluptate aut eum est.
Optio praesentium qui voluptatem amet velit ut.
Sit consequuntur debitis qui non et eligendi cum.
Quia temporibus quibusdam voluptatum voluptatibus saepe voluptatem qui quia.
Ut est ut in doloribus voluptatem.
Quia aut impedit cum.
Sit delectus ad et et sequi et voluptatum.
Natus iure dolorum et eaque necessitatibus.");
    

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
    

pages.PartialReconciledCases.Reconcilation _Reconcilation = new pages.PartialReconciledCases.Reconcilation(driver);
    TestModellerLogger.SetLastNodeGuid("fc1c2835-8b62-466d-8b91-b2d2b6852de5");
    _Reconcilation.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("30a799ca-18ec-4e8a-9931-57fc4ea2c02b");
    _Reconcilation.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5fa7c856-5fe6-458c-94fd-c74460dd9b1f");
    _Reconcilation.Click_Acntantleftmenu();
    

    TestModellerLogger.SetLastNodeGuid("2f750f49-e648-45ca-898e-d60728db5570");
    _Reconcilation.Click_plussign();
    

    TestModellerLogger.SetLastNodeGuid("a3808a66-3e56-4e52-b2c1-61b7d5d15b32");
    _Reconcilation.Select_SelectAccountType1("Creditors due within one year");
    

    TestModellerLogger.SetLastNodeGuid("2018e2d9-51c8-4e54-8424-0f5147db31d6");
    _Reconcilation.Select_SelectAccount1("All");
    

    TestModellerLogger.SetLastNodeGuid("0892baec-0422-496a-93f9-1028cef59d2c");
    _Reconcilation.Click_View_Reconciled_button1();
    

pages.PartialReconciledCases.Reconcillation2 _Reconcillation2 = new pages.PartialReconciledCases.Reconcillation2(driver);
    TestModellerLogger.SetLastNodeGuid("a8b9145f-210e-422a-9f7b-2cbbedbe5c75");
    _Reconcillation2.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("42a7c59c-1ed5-4922-b665-62936da42b94");
    _Reconcillation2.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("02ae2364-ec2d-495d-80be-45a263ada09d");
    _Reconcillation2.Click_RCheckbox();
    

    TestModellerLogger.SetLastNodeGuid("fac2fd41-e03f-432c-a1c7-7996872464c1");
    _Reconcillation2.Click_Trans_invo();
    

    TestModellerLogger.SetLastNodeGuid("11863898-c23f-49f4-a940-569e2f27ec53");
    _Reconcillation2.Click_RCheckbnox2();
    

    TestModellerLogger.SetLastNodeGuid("3bb7749b-d96b-417c-a0b1-25bc3e3da18d");
    _Reconcillation2.Click_Trans_invo2();
    

    TestModellerLogger.SetLastNodeGuid("8906486f-eb0d-4d50-8f8b-984a6b7e7279");
    _Reconcillation2.Click_PageReconcilebutton();
    

    TestModellerLogger.SetLastNodeGuid("23721aaf-c33b-485e-b4e0-c177d5e10082");
    _Reconcillation2.Select_ctl00cPHddReconcileType1("Reconcile with Write Off");
    

    TestModellerLogger.SetLastNodeGuid("9fac4423-264a-4602-a907-7a4f0cc7fbf0");
    _Reconcillation2.Click__Reconcile_();
    

    TestModellerLogger.SetLastNodeGuid("9e53d15f-7873-4de1-ae7d-a5d943aae65a");
    _Reconcillation2.Click_Confirmationmessag1();
    

    }

    @Test  (groups= {"invoce_rec","invoce_rec - Reconsilation_invo1"})
    @TestModellerPath(guid = "817b6f5c-f6ae-4325-9eea-5f70a596a649")
    public void ReconsilationinvoGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAsse8()
    {
        
        pages.PartialReconciledCases.nlogin _nlogin = new pages.PartialReconciledCases.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("dUU0ewetci");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.PartialReconciledCases.AgentSearch _AgentSearch = new pages.PartialReconciledCases.AgentSearch(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
    _AgentSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("est");
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.PartialReconciledCases.Searchclient _Searchclient = new pages.PartialReconciledCases.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Wisozk, Brown and Miller");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.PartialReconciledCases.SaleInvoice _SaleInvoice = new pages.PartialReconciledCases.SaleInvoice(driver);
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
    _SaleInvoice.Enter_InvoiceDate("44261");
    

    TestModellerLogger.SetLastNodeGuid("294097b8-ccc5-4eb7-baec-1a26ca1364f0");
    _SaleInvoice.Select_IncomeType("");
    

    TestModellerLogger.SetLastNodeGuid("5ccbf01b-65a3-47f5-b916-dab48aab691f");
    _SaleInvoice.Enter_Description("Eum sed beatae laudantium accusamus ut minus architecto nihil.
Qui placeat tenetur magni illo.
Labore qui et quod veniam suscipit.
Et nihil ut ut cumque.
Tempore esse molestias ab ut veritatis eveniet quidem.
Eligendi ad magnam.
Molestiae officia aliquam reiciendis non in quisquam tempora.
Dolorem est eos corrupti dolores pariatur nesciunt possimus.
Ea aperiam quis aperiam sint eius optio.
Quasi sequi qui dolores qui modi corrupti fuga.");
    

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
    

pages.PartialReconciledCases.Reconcilation _Reconcilation = new pages.PartialReconciledCases.Reconcilation(driver);
    TestModellerLogger.SetLastNodeGuid("fc1c2835-8b62-466d-8b91-b2d2b6852de5");
    _Reconcilation.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("30a799ca-18ec-4e8a-9931-57fc4ea2c02b");
    _Reconcilation.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5fa7c856-5fe6-458c-94fd-c74460dd9b1f");
    _Reconcilation.Click_Acntantleftmenu();
    

    TestModellerLogger.SetLastNodeGuid("2f750f49-e648-45ca-898e-d60728db5570");
    _Reconcilation.Click_plussign();
    

    TestModellerLogger.SetLastNodeGuid("a3808a66-3e56-4e52-b2c1-61b7d5d15b32");
    _Reconcilation.Select_SelectAccountType1("Customer");
    

    TestModellerLogger.SetLastNodeGuid("2018e2d9-51c8-4e54-8424-0f5147db31d6");
    _Reconcilation.Select_SelectAccount1("All");
    

    TestModellerLogger.SetLastNodeGuid("0892baec-0422-496a-93f9-1028cef59d2c");
    _Reconcilation.Click_View_Reconciled_button1();
    

pages.PartialReconciledCases.Reconcillation2 _Reconcillation2 = new pages.PartialReconciledCases.Reconcillation2(driver);
    TestModellerLogger.SetLastNodeGuid("a8b9145f-210e-422a-9f7b-2cbbedbe5c75");
    _Reconcillation2.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("42a7c59c-1ed5-4922-b665-62936da42b94");
    _Reconcillation2.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("02ae2364-ec2d-495d-80be-45a263ada09d");
    _Reconcillation2.Click_RCheckbox();
    

    TestModellerLogger.SetLastNodeGuid("fac2fd41-e03f-432c-a1c7-7996872464c1");
    _Reconcillation2.Click_Trans_invo();
    

    TestModellerLogger.SetLastNodeGuid("11863898-c23f-49f4-a940-569e2f27ec53");
    _Reconcillation2.Click_RCheckbnox2();
    

    TestModellerLogger.SetLastNodeGuid("3bb7749b-d96b-417c-a0b1-25bc3e3da18d");
    _Reconcillation2.Click_Trans_invo2();
    

    TestModellerLogger.SetLastNodeGuid("8906486f-eb0d-4d50-8f8b-984a6b7e7279");
    _Reconcillation2.Click_PageReconcilebutton();
    

    TestModellerLogger.SetLastNodeGuid("23721aaf-c33b-485e-b4e0-c177d5e10082");
    _Reconcillation2.Select_ctl00cPHddReconcileType1("Reconcile with Write Off");
    

    TestModellerLogger.SetLastNodeGuid("9fac4423-264a-4602-a907-7a4f0cc7fbf0");
    _Reconcillation2.Click__Reconcile_();
    

    TestModellerLogger.SetLastNodeGuid("9e53d15f-7873-4de1-ae7d-a5d943aae65a");
    _Reconcillation2.Click_Confirmationmessag1();
    

    }

    @Test  (groups= {"invoce_rec","invoce_rec - Reconsilation_invo1"})
    @TestModellerPath(guid = "3298739e-a6cd-43d3-a2a5-6086ed86ff1f")
    public void ReconsilationinvoGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAsse9()
    {
        
        pages.PartialReconciledCases.nlogin _nlogin = new pages.PartialReconciledCases.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("Fh_dMXu2iU");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.PartialReconciledCases.AgentSearch _AgentSearch = new pages.PartialReconciledCases.AgentSearch(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
    _AgentSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("ab");
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.PartialReconciledCases.Searchclient _Searchclient = new pages.PartialReconciledCases.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Hegmann - Botsford");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.PartialReconciledCases.SaleInvoice _SaleInvoice = new pages.PartialReconciledCases.SaleInvoice(driver);
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
    _SaleInvoice.Enter_InvoiceDate("44261");
    

    TestModellerLogger.SetLastNodeGuid("294097b8-ccc5-4eb7-baec-1a26ca1364f0");
    _SaleInvoice.Select_IncomeType("");
    

    TestModellerLogger.SetLastNodeGuid("5ccbf01b-65a3-47f5-b916-dab48aab691f");
    _SaleInvoice.Enter_Description("Eius nostrum necessitatibus libero eaque veniam et quas similique ea.
Autem eum quis et sunt sunt quos.
Voluptatem in illo.
Perferendis voluptas voluptatem quas voluptates quas odit laboriosam temporibus ea.
Enim suscipit sint sunt fuga.
Explicabo praesentium velit quasi quas eius.
Qui voluptates voluptatum a doloribus enim eum.
Neque qui debitis nisi quisquam omnis suscipit.
Praesentium et est.
Architecto aspernatur provident.");
    

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
    

pages.PartialReconciledCases.Reconcilation _Reconcilation = new pages.PartialReconciledCases.Reconcilation(driver);
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
    

pages.PartialReconciledCases.Reconcillation2 _Reconcillation2 = new pages.PartialReconciledCases.Reconcillation2(driver);
    TestModellerLogger.SetLastNodeGuid("a8b9145f-210e-422a-9f7b-2cbbedbe5c75");
    _Reconcillation2.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("42a7c59c-1ed5-4922-b665-62936da42b94");
    _Reconcillation2.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("02ae2364-ec2d-495d-80be-45a263ada09d");
    _Reconcillation2.Click_RCheckbox();
    

    TestModellerLogger.SetLastNodeGuid("fac2fd41-e03f-432c-a1c7-7996872464c1");
    _Reconcillation2.Click_Trans_invo();
    

    TestModellerLogger.SetLastNodeGuid("11863898-c23f-49f4-a940-569e2f27ec53");
    _Reconcillation2.Click_RCheckbnox2();
    

    TestModellerLogger.SetLastNodeGuid("3bb7749b-d96b-417c-a0b1-25bc3e3da18d");
    _Reconcillation2.Click_Trans_invo2();
    

    TestModellerLogger.SetLastNodeGuid("8906486f-eb0d-4d50-8f8b-984a6b7e7279");
    _Reconcillation2.Click_PageReconcilebutton();
    

    TestModellerLogger.SetLastNodeGuid("23721aaf-c33b-485e-b4e0-c177d5e10082");
    _Reconcillation2.Select_ctl00cPHddReconcileType1("Reconcile with Write Off");
    

    TestModellerLogger.SetLastNodeGuid("9fac4423-264a-4602-a907-7a4f0cc7fbf0");
    _Reconcillation2.Click__Reconcile_();
    

    TestModellerLogger.SetLastNodeGuid("9e53d15f-7873-4de1-ae7d-a5d943aae65a");
    _Reconcillation2.Click_Confirmationmessag1();
    

    }

    @Test  (groups= {"invoce_rec","invoce_rec - Reconsilation_invo1"})
    @TestModellerPath(guid = "4b7d3f91-f0c8-4f8f-ad26-cd51f7ca7d19")
    public void ReconsilationinvoGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAss10()
    {
        
        pages.PartialReconciledCases.nlogin _nlogin = new pages.PartialReconciledCases.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("VrX0ynPlAM");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.PartialReconciledCases.AgentSearch _AgentSearch = new pages.PartialReconciledCases.AgentSearch(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
    _AgentSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("non");
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.PartialReconciledCases.Searchclient _Searchclient = new pages.PartialReconciledCases.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Braun, Wehner and Nikolaus");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.PartialReconciledCases.SaleInvoice _SaleInvoice = new pages.PartialReconciledCases.SaleInvoice(driver);
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
    _SaleInvoice.Enter_InvoiceDate("44261");
    

    TestModellerLogger.SetLastNodeGuid("294097b8-ccc5-4eb7-baec-1a26ca1364f0");
    _SaleInvoice.Select_IncomeType("");
    

    TestModellerLogger.SetLastNodeGuid("5ccbf01b-65a3-47f5-b916-dab48aab691f");
    _SaleInvoice.Enter_Description("Et distinctio possimus blanditiis hic consequatur omnis sed.
Quisquam autem ut sapiente quia quisquam.
In occaecati sunt commodi ut sint explicabo suscipit.
Ipsam quo dolore corrupti veniam asperiores mollitia recusandae dolore sapiente.
Velit atque optio vel minus et ea sapiente fuga consequuntur.
Tempora possimus accusamus numquam.
Consequatur ad sint maiores similique nihil atque.
Exercitationem non quo nesciunt est dolor ut quo.
Temporibus dolore explicabo dolorem.
Harum voluptas natus dolores quo nulla magni atque quos.");
    

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
    

pages.PartialReconciledCases.Reconcilation _Reconcilation = new pages.PartialReconciledCases.Reconcilation(driver);
    TestModellerLogger.SetLastNodeGuid("fc1c2835-8b62-466d-8b91-b2d2b6852de5");
    _Reconcilation.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("30a799ca-18ec-4e8a-9931-57fc4ea2c02b");
    _Reconcilation.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5fa7c856-5fe6-458c-94fd-c74460dd9b1f");
    _Reconcilation.Click_Acntantleftmenu();
    

    TestModellerLogger.SetLastNodeGuid("2f750f49-e648-45ca-898e-d60728db5570");
    _Reconcilation.Click_plussign();
    

    TestModellerLogger.SetLastNodeGuid("a3808a66-3e56-4e52-b2c1-61b7d5d15b32");
    _Reconcilation.Select_SelectAccountType1("Director");
    

    TestModellerLogger.SetLastNodeGuid("2018e2d9-51c8-4e54-8424-0f5147db31d6");
    _Reconcilation.Select_SelectAccount1("All");
    

    TestModellerLogger.SetLastNodeGuid("0892baec-0422-496a-93f9-1028cef59d2c");
    _Reconcilation.Click_View_Reconciled_button1();
    

pages.PartialReconciledCases.Reconcillation2 _Reconcillation2 = new pages.PartialReconciledCases.Reconcillation2(driver);
    TestModellerLogger.SetLastNodeGuid("a8b9145f-210e-422a-9f7b-2cbbedbe5c75");
    _Reconcillation2.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("42a7c59c-1ed5-4922-b665-62936da42b94");
    _Reconcillation2.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("02ae2364-ec2d-495d-80be-45a263ada09d");
    _Reconcillation2.Click_RCheckbox();
    

    TestModellerLogger.SetLastNodeGuid("fac2fd41-e03f-432c-a1c7-7996872464c1");
    _Reconcillation2.Click_Trans_invo();
    

    TestModellerLogger.SetLastNodeGuid("11863898-c23f-49f4-a940-569e2f27ec53");
    _Reconcillation2.Click_RCheckbnox2();
    

    TestModellerLogger.SetLastNodeGuid("3bb7749b-d96b-417c-a0b1-25bc3e3da18d");
    _Reconcillation2.Click_Trans_invo2();
    

    TestModellerLogger.SetLastNodeGuid("8906486f-eb0d-4d50-8f8b-984a6b7e7279");
    _Reconcillation2.Click_PageReconcilebutton();
    

    TestModellerLogger.SetLastNodeGuid("23721aaf-c33b-485e-b4e0-c177d5e10082");
    _Reconcillation2.Select_ctl00cPHddReconcileType1("Reconcile with Write Off");
    

    TestModellerLogger.SetLastNodeGuid("9fac4423-264a-4602-a907-7a4f0cc7fbf0");
    _Reconcillation2.Click__Reconcile_();
    

    TestModellerLogger.SetLastNodeGuid("9e53d15f-7873-4de1-ae7d-a5d943aae65a");
    _Reconcillation2.Click_Confirmationmessag1();
    

    }

    @Test  (groups= {"invoce_rec","invoce_rec - Reconsilation_invo1"})
    @TestModellerPath(guid = "c78ce3a1-fb3d-421a-bd92-81518fdf1717")
    public void ReconsilationinvoGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAss11()
    {
        
        pages.PartialReconciledCases.nlogin _nlogin = new pages.PartialReconciledCases.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("ZF5eBQ3236");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.PartialReconciledCases.AgentSearch _AgentSearch = new pages.PartialReconciledCases.AgentSearch(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
    _AgentSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("voluptas");
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.PartialReconciledCases.Searchclient _Searchclient = new pages.PartialReconciledCases.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Kovacek Inc");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.PartialReconciledCases.SaleInvoice _SaleInvoice = new pages.PartialReconciledCases.SaleInvoice(driver);
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
    _SaleInvoice.Enter_InvoiceDate("44261");
    

    TestModellerLogger.SetLastNodeGuid("294097b8-ccc5-4eb7-baec-1a26ca1364f0");
    _SaleInvoice.Select_IncomeType("");
    

    TestModellerLogger.SetLastNodeGuid("5ccbf01b-65a3-47f5-b916-dab48aab691f");
    _SaleInvoice.Enter_Description("Fuga sed omnis est facilis amet nihil iusto quo rerum.
Consequatur eaque explicabo sunt voluptatem omnis enim.
Amet molestiae aliquam aspernatur omnis ut molestiae magni ea eveniet.
Est distinctio esse cupiditate repellat hic est dolorum perferendis.
Omnis non minima ea natus quo dolorem.
Aut sint quis.
Corrupti aut ut consequatur voluptatem alias quis numquam illo.
Sed voluptas hic.
Reprehenderit excepturi explicabo qui libero recusandae exercitationem iusto quidem.
Reiciendis quod velit cupiditate voluptatem doloremque.");
    

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
    

pages.PartialReconciledCases.Reconcilation _Reconcilation = new pages.PartialReconciledCases.Reconcilation(driver);
    TestModellerLogger.SetLastNodeGuid("fc1c2835-8b62-466d-8b91-b2d2b6852de5");
    _Reconcilation.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("30a799ca-18ec-4e8a-9931-57fc4ea2c02b");
    _Reconcilation.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5fa7c856-5fe6-458c-94fd-c74460dd9b1f");
    _Reconcilation.Click_Acntantleftmenu();
    

    TestModellerLogger.SetLastNodeGuid("2f750f49-e648-45ca-898e-d60728db5570");
    _Reconcilation.Click_plussign();
    

    TestModellerLogger.SetLastNodeGuid("a3808a66-3e56-4e52-b2c1-61b7d5d15b32");
    _Reconcilation.Select_SelectAccountType1("Employee");
    

    TestModellerLogger.SetLastNodeGuid("2018e2d9-51c8-4e54-8424-0f5147db31d6");
    _Reconcilation.Select_SelectAccount1("All");
    

    TestModellerLogger.SetLastNodeGuid("0892baec-0422-496a-93f9-1028cef59d2c");
    _Reconcilation.Click_View_Reconciled_button1();
    

pages.PartialReconciledCases.Reconcillation2 _Reconcillation2 = new pages.PartialReconciledCases.Reconcillation2(driver);
    TestModellerLogger.SetLastNodeGuid("a8b9145f-210e-422a-9f7b-2cbbedbe5c75");
    _Reconcillation2.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("42a7c59c-1ed5-4922-b665-62936da42b94");
    _Reconcillation2.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("02ae2364-ec2d-495d-80be-45a263ada09d");
    _Reconcillation2.Click_RCheckbox();
    

    TestModellerLogger.SetLastNodeGuid("fac2fd41-e03f-432c-a1c7-7996872464c1");
    _Reconcillation2.Click_Trans_invo();
    

    TestModellerLogger.SetLastNodeGuid("11863898-c23f-49f4-a940-569e2f27ec53");
    _Reconcillation2.Click_RCheckbnox2();
    

    TestModellerLogger.SetLastNodeGuid("3bb7749b-d96b-417c-a0b1-25bc3e3da18d");
    _Reconcillation2.Click_Trans_invo2();
    

    TestModellerLogger.SetLastNodeGuid("8906486f-eb0d-4d50-8f8b-984a6b7e7279");
    _Reconcillation2.Click_PageReconcilebutton();
    

    TestModellerLogger.SetLastNodeGuid("23721aaf-c33b-485e-b4e0-c177d5e10082");
    _Reconcillation2.Select_ctl00cPHddReconcileType1("Reconcile with Write Off");
    

    TestModellerLogger.SetLastNodeGuid("9fac4423-264a-4602-a907-7a4f0cc7fbf0");
    _Reconcillation2.Click__Reconcile_();
    

    TestModellerLogger.SetLastNodeGuid("9e53d15f-7873-4de1-ae7d-a5d943aae65a");
    _Reconcillation2.Click_Confirmationmessag1();
    

    }

    @Test  (groups= {"invoce_rec","invoce_rec - Reconsilation_invo1"})
    @TestModellerPath(guid = "f1d43ef2-6522-4f69-86c6-679c748a3ab2")
    public void ReconsilationinvoGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAss12()
    {
        
        pages.PartialReconciledCases.nlogin _nlogin = new pages.PartialReconciledCases.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("7Wo0Rx7lNM");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.PartialReconciledCases.AgentSearch _AgentSearch = new pages.PartialReconciledCases.AgentSearch(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
    _AgentSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("reprehenderit");
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.PartialReconciledCases.Searchclient _Searchclient = new pages.PartialReconciledCases.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Jaskolski - Reichert");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.PartialReconciledCases.SaleInvoice _SaleInvoice = new pages.PartialReconciledCases.SaleInvoice(driver);
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
    _SaleInvoice.Enter_InvoiceDate("44261");
    

    TestModellerLogger.SetLastNodeGuid("294097b8-ccc5-4eb7-baec-1a26ca1364f0");
    _SaleInvoice.Select_IncomeType("");
    

    TestModellerLogger.SetLastNodeGuid("5ccbf01b-65a3-47f5-b916-dab48aab691f");
    _SaleInvoice.Enter_Description("Et consequatur delectus dolore aliquid.
Illo dolore quae reprehenderit veniam et nulla.
Accusantium illum natus aliquam aut nam eos provident laudantium numquam.
Nobis quos rerum.
Aut sed suscipit voluptatum.
Laborum voluptatem veniam qui.
Nostrum quia quis itaque.
Facilis voluptas ea at.
Libero fugiat sit exercitationem inventore praesentium.
Perspiciatis placeat modi.");
    

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
    

pages.PartialReconciledCases.Reconcilation _Reconcilation = new pages.PartialReconciledCases.Reconcilation(driver);
    TestModellerLogger.SetLastNodeGuid("fc1c2835-8b62-466d-8b91-b2d2b6852de5");
    _Reconcilation.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("30a799ca-18ec-4e8a-9931-57fc4ea2c02b");
    _Reconcilation.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5fa7c856-5fe6-458c-94fd-c74460dd9b1f");
    _Reconcilation.Click_Acntantleftmenu();
    

    TestModellerLogger.SetLastNodeGuid("2f750f49-e648-45ca-898e-d60728db5570");
    _Reconcilation.Click_plussign();
    

    TestModellerLogger.SetLastNodeGuid("a3808a66-3e56-4e52-b2c1-61b7d5d15b32");
    _Reconcilation.Select_SelectAccountType1("Person");
    

    TestModellerLogger.SetLastNodeGuid("2018e2d9-51c8-4e54-8424-0f5147db31d6");
    _Reconcilation.Select_SelectAccount1("All");
    

    TestModellerLogger.SetLastNodeGuid("0892baec-0422-496a-93f9-1028cef59d2c");
    _Reconcilation.Click_View_Reconciled_button1();
    

pages.PartialReconciledCases.Reconcillation2 _Reconcillation2 = new pages.PartialReconciledCases.Reconcillation2(driver);
    TestModellerLogger.SetLastNodeGuid("a8b9145f-210e-422a-9f7b-2cbbedbe5c75");
    _Reconcillation2.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("42a7c59c-1ed5-4922-b665-62936da42b94");
    _Reconcillation2.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("02ae2364-ec2d-495d-80be-45a263ada09d");
    _Reconcillation2.Click_RCheckbox();
    

    TestModellerLogger.SetLastNodeGuid("fac2fd41-e03f-432c-a1c7-7996872464c1");
    _Reconcillation2.Click_Trans_invo();
    

    TestModellerLogger.SetLastNodeGuid("11863898-c23f-49f4-a940-569e2f27ec53");
    _Reconcillation2.Click_RCheckbnox2();
    

    TestModellerLogger.SetLastNodeGuid("3bb7749b-d96b-417c-a0b1-25bc3e3da18d");
    _Reconcillation2.Click_Trans_invo2();
    

    TestModellerLogger.SetLastNodeGuid("8906486f-eb0d-4d50-8f8b-984a6b7e7279");
    _Reconcillation2.Click_PageReconcilebutton();
    

    TestModellerLogger.SetLastNodeGuid("23721aaf-c33b-485e-b4e0-c177d5e10082");
    _Reconcillation2.Select_ctl00cPHddReconcileType1("Reconcile with Write Off");
    

    TestModellerLogger.SetLastNodeGuid("9fac4423-264a-4602-a907-7a4f0cc7fbf0");
    _Reconcillation2.Click__Reconcile_();
    

    TestModellerLogger.SetLastNodeGuid("9e53d15f-7873-4de1-ae7d-a5d943aae65a");
    _Reconcillation2.Click_Confirmationmessag1();
    

    }
}
    /*
    @Test  (groups= {"invoce_rec","invoce_rec - Reconsilation_invo1"})
    @TestModellerPath(guid = "fca5bee3-9d78-4cc3-bf30-869b82a091b8")
    public void ReconsilationinvoGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAss13()
    {
        
        pages.PartialReconciledCases.nlogin _nlogin = new pages.PartialReconciledCases.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("_yqzRnmSVX");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.PartialReconciledCases.AgentSearch _AgentSearch = new pages.PartialReconciledCases.AgentSearch(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
    _AgentSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("tempora");
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.PartialReconciledCases.Searchclient _Searchclient = new pages.PartialReconciledCases.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Deckow - Goyette");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.PartialReconciledCases.SaleInvoice _SaleInvoice = new pages.PartialReconciledCases.SaleInvoice(driver);
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
    _SaleInvoice.Enter_InvoiceDate("44261");
    

    TestModellerLogger.SetLastNodeGuid("294097b8-ccc5-4eb7-baec-1a26ca1364f0");
    _SaleInvoice.Select_IncomeType("");
    

    TestModellerLogger.SetLastNodeGuid("5ccbf01b-65a3-47f5-b916-dab48aab691f");
    _SaleInvoice.Enter_Description("Deleniti atque enim aliquid eaque quam placeat quos.
Sed quas error ut perferendis amet.
Iure optio sint voluptas excepturi laudantium dolores consequatur neque deleniti.
Rerum cupiditate ipsam dolor ipsa iure esse.
Laborum tempore et voluptates et necessitatibus nulla occaecati.
Quia praesentium qui non iure animi quo officiis nam sint.
Sit ut voluptatem consectetur.
Voluptates et delectus neque ea laudantium quia.
Reprehenderit sunt quia rerum repellendus est officiis libero earum.
Soluta cumque saepe voluptatibus.");
    

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
    

pages.PartialReconciledCases.Reconcilation _Reconcilation = new pages.PartialReconciledCases.Reconcilation(driver);
    TestModellerLogger.SetLastNodeGuid("fc1c2835-8b62-466d-8b91-b2d2b6852de5");
    _Reconcilation.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("30a799ca-18ec-4e8a-9931-57fc4ea2c02b");
    _Reconcilation.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5fa7c856-5fe6-458c-94fd-c74460dd9b1f");
    _Reconcilation.Click_Acntantleftmenu();
    

    TestModellerLogger.SetLastNodeGuid("2f750f49-e648-45ca-898e-d60728db5570");
    _Reconcilation.Click_plussign();
    

    TestModellerLogger.SetLastNodeGuid("a3808a66-3e56-4e52-b2c1-61b7d5d15b32");
    _Reconcilation.Select_SelectAccountType1("Provisions for liabilities");
    

    TestModellerLogger.SetLastNodeGuid("2018e2d9-51c8-4e54-8424-0f5147db31d6");
    _Reconcilation.Select_SelectAccount1("All");
    

    TestModellerLogger.SetLastNodeGuid("0892baec-0422-496a-93f9-1028cef59d2c");
    _Reconcilation.Click_View_Reconciled_button1();
    

pages.PartialReconciledCases.Reconcillation2 _Reconcillation2 = new pages.PartialReconciledCases.Reconcillation2(driver);
    TestModellerLogger.SetLastNodeGuid("a8b9145f-210e-422a-9f7b-2cbbedbe5c75");
    _Reconcillation2.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("42a7c59c-1ed5-4922-b665-62936da42b94");
    _Reconcillation2.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("02ae2364-ec2d-495d-80be-45a263ada09d");
    _Reconcillation2.Click_RCheckbox();
    

    TestModellerLogger.SetLastNodeGuid("fac2fd41-e03f-432c-a1c7-7996872464c1");
    _Reconcillation2.Click_Trans_invo();
    

    TestModellerLogger.SetLastNodeGuid("11863898-c23f-49f4-a940-569e2f27ec53");
    _Reconcillation2.Click_RCheckbnox2();
    

    TestModellerLogger.SetLastNodeGuid("3bb7749b-d96b-417c-a0b1-25bc3e3da18d");
    _Reconcillation2.Click_Trans_invo2();
    

    TestModellerLogger.SetLastNodeGuid("8906486f-eb0d-4d50-8f8b-984a6b7e7279");
    _Reconcillation2.Click_PageReconcilebutton();
    

    TestModellerLogger.SetLastNodeGuid("23721aaf-c33b-485e-b4e0-c177d5e10082");
    _Reconcillation2.Select_ctl00cPHddReconcileType1("Reconcile with Write Off");
    

    TestModellerLogger.SetLastNodeGuid("9fac4423-264a-4602-a907-7a4f0cc7fbf0");
    _Reconcillation2.Click__Reconcile_();
    

    TestModellerLogger.SetLastNodeGuid("9e53d15f-7873-4de1-ae7d-a5d943aae65a");
    _Reconcillation2.Click_Confirmationmessag1();
    

    }

    @Test  (groups= {"invoce_rec","invoce_rec - Reconsilation_invo1"})
    @TestModellerPath(guid = "99129646-aee7-4848-8d46-daba6049774d")
    public void ReconsilationinvoGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAss14()
    {
        
        pages.PartialReconciledCases.nlogin _nlogin = new pages.PartialReconciledCases.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("OwMCrY9FAs");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.PartialReconciledCases.AgentSearch _AgentSearch = new pages.PartialReconciledCases.AgentSearch(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
    _AgentSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("ea");
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.PartialReconciledCases.Searchclient _Searchclient = new pages.PartialReconciledCases.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Stokes - Graham");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.PartialReconciledCases.SaleInvoice _SaleInvoice = new pages.PartialReconciledCases.SaleInvoice(driver);
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
    _SaleInvoice.Enter_InvoiceDate("44261");
    

    TestModellerLogger.SetLastNodeGuid("294097b8-ccc5-4eb7-baec-1a26ca1364f0");
    _SaleInvoice.Select_IncomeType("");
    

    TestModellerLogger.SetLastNodeGuid("5ccbf01b-65a3-47f5-b916-dab48aab691f");
    _SaleInvoice.Enter_Description("Eos vel ad hic dicta illo rerum praesentium beatae.
Culpa quos nam molestiae.
Eaque nobis illo sunt corporis.
Dolor nemo repudiandae culpa iusto laborum pariatur.
Qui et dolorem esse consequuntur voluptas nobis est non.
Voluptatem incidunt dolorem non.
Dolorem illum nobis.
Distinctio voluptas tempore.
Assumenda voluptatibus ut ex molestias commodi quis.
Dignissimos autem cum dolores nihil possimus architecto sed.");
    

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
    

pages.PartialReconciledCases.Reconcilation _Reconcilation = new pages.PartialReconciledCases.Reconcilation(driver);
    TestModellerLogger.SetLastNodeGuid("fc1c2835-8b62-466d-8b91-b2d2b6852de5");
    _Reconcilation.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("30a799ca-18ec-4e8a-9931-57fc4ea2c02b");
    _Reconcilation.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5fa7c856-5fe6-458c-94fd-c74460dd9b1f");
    _Reconcilation.Click_Acntantleftmenu();
    

    TestModellerLogger.SetLastNodeGuid("2f750f49-e648-45ca-898e-d60728db5570");
    _Reconcilation.Click_plussign();
    

    TestModellerLogger.SetLastNodeGuid("a3808a66-3e56-4e52-b2c1-61b7d5d15b32");
    _Reconcilation.Select_SelectAccountType1("Supplier");
    

    TestModellerLogger.SetLastNodeGuid("2018e2d9-51c8-4e54-8424-0f5147db31d6");
    _Reconcilation.Select_SelectAccount1("All");
    

    TestModellerLogger.SetLastNodeGuid("0892baec-0422-496a-93f9-1028cef59d2c");
    _Reconcilation.Click_View_Reconciled_button1();
    

pages.PartialReconciledCases.Reconcillation2 _Reconcillation2 = new pages.PartialReconciledCases.Reconcillation2(driver);
    TestModellerLogger.SetLastNodeGuid("a8b9145f-210e-422a-9f7b-2cbbedbe5c75");
    _Reconcillation2.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("42a7c59c-1ed5-4922-b665-62936da42b94");
    _Reconcillation2.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("02ae2364-ec2d-495d-80be-45a263ada09d");
    _Reconcillation2.Click_RCheckbox();
    

    TestModellerLogger.SetLastNodeGuid("fac2fd41-e03f-432c-a1c7-7996872464c1");
    _Reconcillation2.Click_Trans_invo();
    

    TestModellerLogger.SetLastNodeGuid("11863898-c23f-49f4-a940-569e2f27ec53");
    _Reconcillation2.Click_RCheckbnox2();
    

    TestModellerLogger.SetLastNodeGuid("3bb7749b-d96b-417c-a0b1-25bc3e3da18d");
    _Reconcillation2.Click_Trans_invo2();
    

    TestModellerLogger.SetLastNodeGuid("8906486f-eb0d-4d50-8f8b-984a6b7e7279");
    _Reconcillation2.Click_PageReconcilebutton();
    

    TestModellerLogger.SetLastNodeGuid("23721aaf-c33b-485e-b4e0-c177d5e10082");
    _Reconcillation2.Select_ctl00cPHddReconcileType1("Reconcile with Write Off");
    

    TestModellerLogger.SetLastNodeGuid("9fac4423-264a-4602-a907-7a4f0cc7fbf0");
    _Reconcillation2.Click__Reconcile_();
    

    TestModellerLogger.SetLastNodeGuid("9e53d15f-7873-4de1-ae7d-a5d943aae65a");
    _Reconcillation2.Click_Confirmationmessag1();
    

    }

    @Test  (groups= {"invoce_rec","invoce_rec - Reconsilation_invo1"})
    @TestModellerPath(guid = "ac2bcc86-0b58-433a-95a9-d1501f9584ad")
    public void ReconsilationinvoGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAss15()
    {
        
        pages.PartialReconciledCases.nlogin _nlogin = new pages.PartialReconciledCases.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("Eohc87hgS1");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.PartialReconciledCases.AgentSearch _AgentSearch = new pages.PartialReconciledCases.AgentSearch(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
    _AgentSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("rerum");
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.PartialReconciledCases.Searchclient _Searchclient = new pages.PartialReconciledCases.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("VonRueden, Becker and Kertzmann");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.PartialReconciledCases.SaleInvoice _SaleInvoice = new pages.PartialReconciledCases.SaleInvoice(driver);
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
    _SaleInvoice.Enter_InvoiceDate("44261");
    

    TestModellerLogger.SetLastNodeGuid("294097b8-ccc5-4eb7-baec-1a26ca1364f0");
    _SaleInvoice.Select_IncomeType("");
    

    TestModellerLogger.SetLastNodeGuid("5ccbf01b-65a3-47f5-b916-dab48aab691f");
    _SaleInvoice.Enter_Description("Atque dolor quis sequi error debitis iusto voluptatem aperiam ex.
Maxime ratione maiores.
Qui sint quod alias et non aut quaerat enim laborum.
Ut id minus qui repellendus nihil quidem facilis animi et.
Alias ad necessitatibus.
Iste eius necessitatibus voluptatem perferendis id iste quia.
Reprehenderit quia ab non commodi vel.
Perferendis perspiciatis distinctio reiciendis eum quam qui similique ea odit.
Iure deleniti ut sint laudantium aut enim.
Rerum consequatur magnam mollitia ullam ut qui labore consectetur est.");
    

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
    

pages.PartialReconciledCases.Reconcilation _Reconcilation = new pages.PartialReconciledCases.Reconcilation(driver);
    TestModellerLogger.SetLastNodeGuid("fc1c2835-8b62-466d-8b91-b2d2b6852de5");
    _Reconcilation.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("30a799ca-18ec-4e8a-9931-57fc4ea2c02b");
    _Reconcilation.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5fa7c856-5fe6-458c-94fd-c74460dd9b1f");
    _Reconcilation.Click_Acntantleftmenu();
    

    TestModellerLogger.SetLastNodeGuid("2f750f49-e648-45ca-898e-d60728db5570");
    _Reconcilation.Click_plussign();
    

    TestModellerLogger.SetLastNodeGuid("a3808a66-3e56-4e52-b2c1-61b7d5d15b32");
    _Reconcilation.Select_SelectAccountType1("Taxation");
    

    TestModellerLogger.SetLastNodeGuid("2018e2d9-51c8-4e54-8424-0f5147db31d6");
    _Reconcilation.Select_SelectAccount1("All");
    

    TestModellerLogger.SetLastNodeGuid("0892baec-0422-496a-93f9-1028cef59d2c");
    _Reconcilation.Click_View_Reconciled_button1();
    

pages.PartialReconciledCases.Reconcillation2 _Reconcillation2 = new pages.PartialReconciledCases.Reconcillation2(driver);
    TestModellerLogger.SetLastNodeGuid("a8b9145f-210e-422a-9f7b-2cbbedbe5c75");
    _Reconcillation2.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("42a7c59c-1ed5-4922-b665-62936da42b94");
    _Reconcillation2.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("02ae2364-ec2d-495d-80be-45a263ada09d");
    _Reconcillation2.Click_RCheckbox();
    

    TestModellerLogger.SetLastNodeGuid("fac2fd41-e03f-432c-a1c7-7996872464c1");
    _Reconcillation2.Click_Trans_invo();
    

    TestModellerLogger.SetLastNodeGuid("11863898-c23f-49f4-a940-569e2f27ec53");
    _Reconcillation2.Click_RCheckbnox2();
    

    TestModellerLogger.SetLastNodeGuid("3bb7749b-d96b-417c-a0b1-25bc3e3da18d");
    _Reconcillation2.Click_Trans_invo2();
    

    TestModellerLogger.SetLastNodeGuid("8906486f-eb0d-4d50-8f8b-984a6b7e7279");
    _Reconcillation2.Click_PageReconcilebutton();
    

    TestModellerLogger.SetLastNodeGuid("23721aaf-c33b-485e-b4e0-c177d5e10082");
    _Reconcillation2.Select_ctl00cPHddReconcileType1("Reconcile with Write Off");
    

    TestModellerLogger.SetLastNodeGuid("9fac4423-264a-4602-a907-7a4f0cc7fbf0");
    _Reconcillation2.Click__Reconcile_();
    

    TestModellerLogger.SetLastNodeGuid("9e53d15f-7873-4de1-ae7d-a5d943aae65a");
    _Reconcillation2.Click_Confirmationmessag1();
    

    }

    @Test  (groups= {"invoce_rec","invoce_rec - Reconsilation_invo1"})
    @TestModellerPath(guid = "bc5816a1-045b-459e-b4a5-8a4e29fabd96")
    public void ReconsilationinvoGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAss16()
    {
        
        pages.PartialReconciledCases.nlogin _nlogin = new pages.PartialReconciledCases.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("4WKZvlhves");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.PartialReconciledCases.AgentSearch _AgentSearch = new pages.PartialReconciledCases.AgentSearch(driver);
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
    

pages.PartialReconciledCases.Searchclient _Searchclient = new pages.PartialReconciledCases.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Gerhold, Huels and Kunze");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.PartialReconciledCases.SaleInvoice _SaleInvoice = new pages.PartialReconciledCases.SaleInvoice(driver);
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
    _SaleInvoice.Enter_InvoiceDate("44261");
    

    TestModellerLogger.SetLastNodeGuid("294097b8-ccc5-4eb7-baec-1a26ca1364f0");
    _SaleInvoice.Select_IncomeType("");
    

    TestModellerLogger.SetLastNodeGuid("5ccbf01b-65a3-47f5-b916-dab48aab691f");
    _SaleInvoice.Enter_Description("Voluptas rerum commodi harum et dolor quaerat.
Impedit repellat modi ipsum saepe voluptatem inventore at velit laudantium.
Sed quae officia est velit dolor libero explicabo ipsam.
Quo pariatur rerum quisquam aperiam quia excepturi magnam veniam quis.
Molestias commodi tenetur voluptates debitis asperiores fugiat aut qui vero.
Autem natus autem quas quia quaerat dolorem qui.
Dicta rerum veritatis asperiores voluptatem laboriosam qui eos earum.
Animi sint explicabo debitis est nobis quidem.
Quia amet fugiat non quos eaque aut inventore voluptas.
Non ratione magnam vitae fugiat.");
    

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
    

pages.PartialReconciledCases.Reconcilation _Reconcilation = new pages.PartialReconciledCases.Reconcilation(driver);
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
    

pages.PartialReconciledCases.Reconcillation2 _Reconcillation2 = new pages.PartialReconciledCases.Reconcillation2(driver);
    TestModellerLogger.SetLastNodeGuid("a8b9145f-210e-422a-9f7b-2cbbedbe5c75");
    _Reconcillation2.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("42a7c59c-1ed5-4922-b665-62936da42b94");
    _Reconcillation2.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("02ae2364-ec2d-495d-80be-45a263ada09d");
    _Reconcillation2.Click_RCheckbox();
    

    TestModellerLogger.SetLastNodeGuid("fac2fd41-e03f-432c-a1c7-7996872464c1");
    _Reconcillation2.Click_Trans_invo();
    

    TestModellerLogger.SetLastNodeGuid("11863898-c23f-49f4-a940-569e2f27ec53");
    _Reconcillation2.Click_RCheckbnox2();
    

    TestModellerLogger.SetLastNodeGuid("3bb7749b-d96b-417c-a0b1-25bc3e3da18d");
    _Reconcillation2.Click_Trans_invo2();
    

    TestModellerLogger.SetLastNodeGuid("8906486f-eb0d-4d50-8f8b-984a6b7e7279");
    _Reconcillation2.Click_PageReconcilebutton();
    

    TestModellerLogger.SetLastNodeGuid("23721aaf-c33b-485e-b4e0-c177d5e10082");
    _Reconcillation2.Select_ctl00cPHddReconcileType1("Reconcile with Write Off");
    

    TestModellerLogger.SetLastNodeGuid("9fac4423-264a-4602-a907-7a4f0cc7fbf0");
    _Reconcillation2.Click__Reconcile_();
    

    TestModellerLogger.SetLastNodeGuid("9e53d15f-7873-4de1-ae7d-a5d943aae65a");
    _Reconcillation2.Click_Confirmationmessag1();
    

    }

    @Test  (groups= {"invoce_rec","invoce_rec - Reconsilation_invo1"})
    @TestModellerPath(guid = "1114de35-0ea3-4293-a988-480466ae7545")
    public void ReconsilationinvoGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAss17()
    {
        
        pages.PartialReconciledCases.nlogin _nlogin = new pages.PartialReconciledCases.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("YrUhRSy8nb");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.PartialReconciledCases.AgentSearch _AgentSearch = new pages.PartialReconciledCases.AgentSearch(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
    _AgentSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("soluta");
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.PartialReconciledCases.Searchclient _Searchclient = new pages.PartialReconciledCases.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Schuster, Littel and Kshlerin");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.PartialReconciledCases.SaleInvoice _SaleInvoice = new pages.PartialReconciledCases.SaleInvoice(driver);
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
    _SaleInvoice.Enter_InvoiceDate("44261");
    

    TestModellerLogger.SetLastNodeGuid("294097b8-ccc5-4eb7-baec-1a26ca1364f0");
    _SaleInvoice.Select_IncomeType("");
    

    TestModellerLogger.SetLastNodeGuid("5ccbf01b-65a3-47f5-b916-dab48aab691f");
    _SaleInvoice.Enter_Description("Voluptatem recusandae officiis qui voluptatem voluptatem sunt aut odit.
Quibusdam exercitationem occaecati vitae corrupti.
Quae vel cum.
Repellendus rerum vero.
Numquam dolor ratione ea facilis.
Impedit id assumenda labore similique tempore asperiores.
Minima itaque libero.
Odio rerum ratione voluptatibus id quod non.
Quisquam odio et praesentium inventore fuga architecto id.
Labore officiis minus consequatur.");
    

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
    

pages.PartialReconciledCases.Reconcilation _Reconcilation = new pages.PartialReconciledCases.Reconcilation(driver);
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
    

pages.PartialReconciledCases.Reconcillation2 _Reconcillation2 = new pages.PartialReconciledCases.Reconcillation2(driver);
    TestModellerLogger.SetLastNodeGuid("a8b9145f-210e-422a-9f7b-2cbbedbe5c75");
    _Reconcillation2.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("42a7c59c-1ed5-4922-b665-62936da42b94");
    _Reconcillation2.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("02ae2364-ec2d-495d-80be-45a263ada09d");
    _Reconcillation2.Click_RCheckbox();
    

    TestModellerLogger.SetLastNodeGuid("fac2fd41-e03f-432c-a1c7-7996872464c1");
    _Reconcillation2.Click_Trans_invo();
    

    TestModellerLogger.SetLastNodeGuid("11863898-c23f-49f4-a940-569e2f27ec53");
    _Reconcillation2.Click_RCheckbnox2();
    

    TestModellerLogger.SetLastNodeGuid("3bb7749b-d96b-417c-a0b1-25bc3e3da18d");
    _Reconcillation2.Click_Trans_invo2();
    

    TestModellerLogger.SetLastNodeGuid("8906486f-eb0d-4d50-8f8b-984a6b7e7279");
    _Reconcillation2.Click_PageReconcilebutton();
    

    TestModellerLogger.SetLastNodeGuid("23721aaf-c33b-485e-b4e0-c177d5e10082");
    _Reconcillation2.Select_ctl00cPHddReconcileType1("Reconcile with Write Off");
    

    TestModellerLogger.SetLastNodeGuid("9fac4423-264a-4602-a907-7a4f0cc7fbf0");
    _Reconcillation2.Click__Reconcile_();
    

    TestModellerLogger.SetLastNodeGuid("9e53d15f-7873-4de1-ae7d-a5d943aae65a");
    _Reconcillation2.Click_Confirmationmessag1();
    

    }

    @Test  (groups= {"invoce_rec","invoce_rec - Reconsilation_invo1"})
    @TestModellerPath(guid = "47ecdec3-de81-4888-b16c-d4eea25bc36b")
    public void ReconsilationinvoGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAss18()
    {
        
        pages.PartialReconciledCases.nlogin _nlogin = new pages.PartialReconciledCases.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("R2QPmxeA83");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.PartialReconciledCases.AgentSearch _AgentSearch = new pages.PartialReconciledCases.AgentSearch(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
    _AgentSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("eius");
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.PartialReconciledCases.Searchclient _Searchclient = new pages.PartialReconciledCases.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Feil Inc");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.PartialReconciledCases.SaleInvoice _SaleInvoice = new pages.PartialReconciledCases.SaleInvoice(driver);
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
    _SaleInvoice.Enter_InvoiceDate("44261");
    

    TestModellerLogger.SetLastNodeGuid("294097b8-ccc5-4eb7-baec-1a26ca1364f0");
    _SaleInvoice.Select_IncomeType("");
    

    TestModellerLogger.SetLastNodeGuid("5ccbf01b-65a3-47f5-b916-dab48aab691f");
    _SaleInvoice.Enter_Description("Ratione ut vero ut id enim.
Rerum mollitia reprehenderit officiis.
Et itaque nesciunt.
Perferendis tenetur blanditiis praesentium tempora qui distinctio repellendus laboriosam magni.
Quibusdam quam vero.
Alias adipisci rem qui qui tempore.
Blanditiis numquam aspernatur similique eius.
Et inventore tempore esse aut nostrum sed.
Dolor qui dolor placeat.
Quasi molestiae est sed eum.");
    

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
    

pages.PartialReconciledCases.Reconcilation _Reconcilation = new pages.PartialReconciledCases.Reconcilation(driver);
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
    

pages.PartialReconciledCases.Reconcillation2 _Reconcillation2 = new pages.PartialReconciledCases.Reconcillation2(driver);
    TestModellerLogger.SetLastNodeGuid("a8b9145f-210e-422a-9f7b-2cbbedbe5c75");
    _Reconcillation2.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("42a7c59c-1ed5-4922-b665-62936da42b94");
    _Reconcillation2.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("02ae2364-ec2d-495d-80be-45a263ada09d");
    _Reconcillation2.Click_RCheckbox();
    

    TestModellerLogger.SetLastNodeGuid("fac2fd41-e03f-432c-a1c7-7996872464c1");
    _Reconcillation2.Click_Trans_invo();
    

    TestModellerLogger.SetLastNodeGuid("11863898-c23f-49f4-a940-569e2f27ec53");
    _Reconcillation2.Click_RCheckbnox2();
    

    TestModellerLogger.SetLastNodeGuid("3bb7749b-d96b-417c-a0b1-25bc3e3da18d");
    _Reconcillation2.Click_Trans_invo2();
    

    TestModellerLogger.SetLastNodeGuid("8906486f-eb0d-4d50-8f8b-984a6b7e7279");
    _Reconcillation2.Click_PageReconcilebutton();
    

    TestModellerLogger.SetLastNodeGuid("23721aaf-c33b-485e-b4e0-c177d5e10082");
    _Reconcillation2.Select_ctl00cPHddReconcileType1("Reconcile with Write Off");
    

    TestModellerLogger.SetLastNodeGuid("9fac4423-264a-4602-a907-7a4f0cc7fbf0");
    _Reconcillation2.Click__Reconcile_();
    

    TestModellerLogger.SetLastNodeGuid("9e53d15f-7873-4de1-ae7d-a5d943aae65a");
    _Reconcillation2.Click_Confirmationmessag1();
    

    }

    @Test  (groups= {"invoce_rec","invoce_rec - Reconsilation_invo1"})
    @TestModellerPath(guid = "b4091c14-40f9-4ae9-82b1-8ac3de791165")
    public void ReconsilationinvoGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAss19()
    {
        
        pages.PartialReconciledCases.nlogin _nlogin = new pages.PartialReconciledCases.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("QfvrpXAh6O");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.PartialReconciledCases.AgentSearch _AgentSearch = new pages.PartialReconciledCases.AgentSearch(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
    _AgentSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("et");
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.PartialReconciledCases.Searchclient _Searchclient = new pages.PartialReconciledCases.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("O'Kon - Dare");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.PartialReconciledCases.SaleInvoice _SaleInvoice = new pages.PartialReconciledCases.SaleInvoice(driver);
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
    _SaleInvoice.Enter_InvoiceDate("44261");
    

    TestModellerLogger.SetLastNodeGuid("294097b8-ccc5-4eb7-baec-1a26ca1364f0");
    _SaleInvoice.Select_IncomeType("");
    

    TestModellerLogger.SetLastNodeGuid("5ccbf01b-65a3-47f5-b916-dab48aab691f");
    _SaleInvoice.Enter_Description("Quisquam veniam praesentium.
Optio magni expedita corporis modi est nostrum fugiat.
Animi et pariatur.
Porro quae deleniti.
Adipisci non beatae veritatis laboriosam ab perspiciatis cum.
Tempora occaecati in ut aliquid facilis ratione.
Est reprehenderit vitae est est labore corporis.
Cum facilis tempora est incidunt rerum est.
Sit cupiditate quasi eum et ex vitae aut.
Nobis eum est quaerat illum dolore temporibus cumque.");
    

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
    

pages.PartialReconciledCases.Reconcilation _Reconcilation = new pages.PartialReconciledCases.Reconcilation(driver);
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
    

pages.PartialReconciledCases.Reconcillation2 _Reconcillation2 = new pages.PartialReconciledCases.Reconcillation2(driver);
    TestModellerLogger.SetLastNodeGuid("a8b9145f-210e-422a-9f7b-2cbbedbe5c75");
    _Reconcillation2.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("42a7c59c-1ed5-4922-b665-62936da42b94");
    _Reconcillation2.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("02ae2364-ec2d-495d-80be-45a263ada09d");
    _Reconcillation2.Click_RCheckbox();
    

    TestModellerLogger.SetLastNodeGuid("fac2fd41-e03f-432c-a1c7-7996872464c1");
    _Reconcillation2.Click_Trans_invo();
    

    TestModellerLogger.SetLastNodeGuid("11863898-c23f-49f4-a940-569e2f27ec53");
    _Reconcillation2.Click_RCheckbnox2();
    

    TestModellerLogger.SetLastNodeGuid("3bb7749b-d96b-417c-a0b1-25bc3e3da18d");
    _Reconcillation2.Click_Trans_invo2();
    

    TestModellerLogger.SetLastNodeGuid("8906486f-eb0d-4d50-8f8b-984a6b7e7279");
    _Reconcillation2.Click_PageReconcilebutton();
    

    TestModellerLogger.SetLastNodeGuid("23721aaf-c33b-485e-b4e0-c177d5e10082");
    _Reconcillation2.Select_ctl00cPHddReconcileType1("Reconcile with Write Off");
    

    TestModellerLogger.SetLastNodeGuid("9fac4423-264a-4602-a907-7a4f0cc7fbf0");
    _Reconcillation2.Click__Reconcile_();
    

    TestModellerLogger.SetLastNodeGuid("9e53d15f-7873-4de1-ae7d-a5d943aae65a");
    _Reconcillation2.Click_Confirmationmessag1();
    

    }

    @Test  (groups= {"invoce_rec","invoce_rec - Reconsilation_invo1"})
    @TestModellerPath(guid = "9718c953-0827-46e4-bf95-fb67998a1df1")
    public void ReconsilationinvoGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAss20()
    {
        
        pages.PartialReconciledCases.nlogin _nlogin = new pages.PartialReconciledCases.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("OESiT_FWvs");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.PartialReconciledCases.AgentSearch _AgentSearch = new pages.PartialReconciledCases.AgentSearch(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
    _AgentSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("itaque");
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.PartialReconciledCases.Searchclient _Searchclient = new pages.PartialReconciledCases.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Marquardt, Runolfsson and Thiel");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.PartialReconciledCases.SaleInvoice _SaleInvoice = new pages.PartialReconciledCases.SaleInvoice(driver);
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
    _SaleInvoice.Enter_InvoiceDate("44261");
    

    TestModellerLogger.SetLastNodeGuid("294097b8-ccc5-4eb7-baec-1a26ca1364f0");
    _SaleInvoice.Select_IncomeType("");
    

    TestModellerLogger.SetLastNodeGuid("5ccbf01b-65a3-47f5-b916-dab48aab691f");
    _SaleInvoice.Enter_Description("Nemo aut voluptatibus sapiente at.
Aliquam vero qui odio hic qui laborum.
Ullam incidunt reiciendis aspernatur est vitae eligendi cum quibusdam animi.
Quibusdam eos vel aut quam numquam.
Fuga optio nisi nihil sed qui sed dolore exercitationem aut.
Officiis architecto in.
Tenetur qui nihil pariatur voluptatum nesciunt quibusdam rerum harum quia.
Qui inventore libero officiis reiciendis reiciendis.
Sit odit repudiandae laborum.
Fugit qui reiciendis commodi repellendus rerum libero et non.");
    

    TestModellerLogger.SetLastNodeGuid("73677a32-1892-47f6-9783-a1072478778a");
    _SaleInvoice.Enter_UnitPrice("");
    

    TestModellerLogger.SetLastNodeGuid("d810d5bf-a960-434c-9172-1671dd383495");
    _SaleInvoice.Enter_Quantity("");
    

    TestModellerLogger.SetLastNodeGuid("516c7236-f043-4de9-b128-99997ccf1604");
    _SaleInvoice.Select_VATRate("Out of Scope");
    

    TestModellerLogger.SetLastNodeGuid("cb6d5101-0be0-4519-b1aa-5e71dcdfbef3");
    _SaleInvoice.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("6aeae28b-fd85-4712-8710-18e4b190dd19");
    _SaleInvoice.Enter_Note("");
    

    TestModellerLogger.SetLastNodeGuid("2508d3fa-348f-48f2-914a-4d43591ded90");
    _SaleInvoice.Click_SaveButton();
    

pages.PartialReconciledCases.Reconcilation _Reconcilation = new pages.PartialReconciledCases.Reconcilation(driver);
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
    

pages.PartialReconciledCases.Reconcillation2 _Reconcillation2 = new pages.PartialReconciledCases.Reconcillation2(driver);
    TestModellerLogger.SetLastNodeGuid("a8b9145f-210e-422a-9f7b-2cbbedbe5c75");
    _Reconcillation2.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("42a7c59c-1ed5-4922-b665-62936da42b94");
    _Reconcillation2.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("02ae2364-ec2d-495d-80be-45a263ada09d");
    _Reconcillation2.Click_RCheckbox();
    

    TestModellerLogger.SetLastNodeGuid("fac2fd41-e03f-432c-a1c7-7996872464c1");
    _Reconcillation2.Click_Trans_invo();
    

    TestModellerLogger.SetLastNodeGuid("11863898-c23f-49f4-a940-569e2f27ec53");
    _Reconcillation2.Click_RCheckbnox2();
    

    TestModellerLogger.SetLastNodeGuid("3bb7749b-d96b-417c-a0b1-25bc3e3da18d");
    _Reconcillation2.Click_Trans_invo2();
    

    TestModellerLogger.SetLastNodeGuid("8906486f-eb0d-4d50-8f8b-984a6b7e7279");
    _Reconcillation2.Click_PageReconcilebutton();
    

    TestModellerLogger.SetLastNodeGuid("23721aaf-c33b-485e-b4e0-c177d5e10082");
    _Reconcillation2.Select_ctl00cPHddReconcileType1("Reconcile with Write Off");
    

    TestModellerLogger.SetLastNodeGuid("9fac4423-264a-4602-a907-7a4f0cc7fbf0");
    _Reconcillation2.Click__Reconcile_();
    

    TestModellerLogger.SetLastNodeGuid("9e53d15f-7873-4de1-ae7d-a5d943aae65a");
    _Reconcillation2.Click_Confirmationmessag1();
    

    }

}*/