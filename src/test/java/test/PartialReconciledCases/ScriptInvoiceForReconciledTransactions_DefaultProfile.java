package test.PartialReconciledCases;

import reports.TestNGListener;
import tests.TestBase;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;
import pages.BankNewTransaction;
import pages.Reconcilation1;

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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/fe5d1728-9889-4d32-a59a-5458d2352158
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1095, profileId = 100850)
public class ScriptInvoiceForReconciledTransactions_DefaultProfile extends TestBase
{
    
	String sTestCaseID=null;
	String[] data=null;
	String Sheet = null;
    
    @Test  (groups= {"ScriptInvoiceForReconciledTransactions","ScriptInvoiceForReconciledTransactions - Default Profile"})
    @TestModellerPath(guid = "c106168c-336d-40a0-9a76-bfd749663843")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlCl1() throws InterruptedException, HeadlessException, IOException, AWTException, InvalidFormatException
    {
    	
    	sTestCaseID="TC266";
    	Sheet="Reconcile";
    	data = ExcelUtility.toReadExcelData(sTestCaseID, Sheet);
        
        pages.Login1VAT _Login1VAT = new pages.Login1VAT(driver);
    TestModellerLogger.SetLastNodeGuid("93e4a214-3f97-41d2-8063-dd91c879e847");
    _Login1VAT.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7eff8b4c-1e47-48a4-bcad-b3639d0cdfd5");
    _Login1VAT.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ceaa193b-d8c0-48f9-911f-018e2571da20");
    _Login1VAT.Enter_UserName(data[1]);
    

    TestModellerLogger.SetLastNodeGuid("95b31ed9-af0a-49e7-8bfa-8471d379cdff");
    _Login1VAT.Enter_Password(data[2]);
    

    TestModellerLogger.SetLastNodeGuid("942414e4-1d0e-45ba-bdd1-43293b97e0ff");
    _Login1VAT.Click_LoginButton();
    

pages.AgentsSelect _AgentsSelect = new pages.AgentsSelect(driver);
//    TestModellerLogger.SetLastNodeGuid("69016c4b-a736-45bf-a682-5c03ee8d17cd");
//    _AgentsSelect.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("bd071d41-148c-42e8-8300-984c9dd4df87");
//    _AgentsSelect.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("bd031a68-650a-4b8c-8e7c-0ce87415e17e");
    _AgentsSelect.Click_AgentsTab();
    

    TestModellerLogger.SetLastNodeGuid("d5b61053-e5d4-479f-87c7-e4be6b5f054a");
    _AgentsSelect.Enter_AgentName(data[3]);
    

    TestModellerLogger.SetLastNodeGuid("2bae82eb-0e45-434c-b1bd-7336f304d4f9");
    _AgentsSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("be317b25-3125-4191-86a5-e8ffee0d0334");
    _AgentsSelect.Click_SelectAgent();
    

pages.ClientSelect _ClientSelect = new pages.ClientSelect(driver);
//    TestModellerLogger.SetLastNodeGuid("1243c994-d23d-40d1-bc93-38dfdab760ed");
//    _ClientSelect.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("b42ff41f-2fec-4f5c-b77b-2742ec894ec7");
//    _ClientSelect.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ff5edd38-07b0-452b-95d6-f33e07e1e975");
    _ClientSelect.Click_ClientsTAB();
    

    TestModellerLogger.SetLastNodeGuid("14a94a5a-c1ac-4e4f-afd4-69a84ffa5a24");
    _ClientSelect.Enter_ClientName(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("ed3e4750-33a4-4d75-a14c-9d75935c79c7");
    _ClientSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("e537c9d6-4166-4745-b27e-a178d69d2884");
    _ClientSelect.Click_SelectClient();
    

pages.SaleInvoiceRecon _SaleInvoice = new pages.SaleInvoiceRecon(driver);
//    TestModellerLogger.SetLastNodeGuid("2f331494-c0ec-443e-b258-bdf3d2f9d9fc");
//    _SaleInvoice.GoToUrl();
//    
//
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
    _SaleInvoice.Select_IncomeType(data[8]);
    

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
//    

    TestModellerLogger.SetLastNodeGuid("6aeae28b-fd85-4712-8710-18e4b190dd19");
    _SaleInvoice.Enter_Note(data[13]);
    

    TestModellerLogger.SetLastNodeGuid("2508d3fa-348f-48f2-914a-4d43591ded90");
    _SaleInvoice.Click_SaveButton();
    

BankNewTransaction _BankNewTransaction = new BankNewTransaction(driver);
//    TestModellerLogger.SetLastNodeGuid("749d812e-6ce5-40e7-a772-65e7fb0254fd");
//    _BankNewTransaction.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("90aa0df5-01d7-437b-aa15-b1e333d31a77");
//    _BankNewTransaction.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("00b70107-cc4a-4697-a71f-dbb0d1c0ef03");
    _BankNewTransaction.Click_BankingTAB();
    

    TestModellerLogger.SetLastNodeGuid("94a4fa93-d2d5-4ff6-837c-ef202411eca4");
    _BankNewTransaction.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("d0e7d4a2-32cb-48b0-b4da-56a9fea2e49b");
    _BankNewTransaction.Click_NewTransaction();
    

    TestModellerLogger.SetLastNodeGuid("555c6b39-680f-4865-8d40-608a332942d5");
    _BankNewTransaction.Select_BankName(data[14]);
    

    TestModellerLogger.SetLastNodeGuid("ce3257a1-b75f-4eb6-b402-ae8fae76edeb");
    _BankNewTransaction.Enter_Date(data[15]);
    

    TestModellerLogger.SetLastNodeGuid("7944d2f0-3c7c-4e24-9587-0042391db73f");
    _BankNewTransaction.Enter_Description(data[16]);
    

    TestModellerLogger.SetLastNodeGuid("8eaf3156-c404-4861-b137-cd99ca75a203");
    _BankNewTransaction.Enter_ReceivedAmount(data[17]);
    

//    TestModellerLogger.SetLastNodeGuid("ef855a7e-0884-43f7-bf3f-38745eaac39d");
//    _BankNewTransaction.Enter_SpentAmount(data[18]);
//    

//    TestModellerLogger.SetLastNodeGuid("7a8babab-b1f5-4e2d-bbe5-6034eeffc428");
//    _BankNewTransaction.Select_VATRateType("Standard Rate");
    

//    TestModellerLogger.SetLastNodeGuid("c9f25a3d-bb87-4aef-bca1-41d264f6b770");
//    _BankNewTransaction.Enter_VATAmount("100");
//    

    TestModellerLogger.SetLastNodeGuid("59ffb8ed-2011-45c5-a461-586d33787838");
    _BankNewTransaction.Click_AllocateTo();
    

    TestModellerLogger.SetLastNodeGuid("e1e045f4-55c1-41b2-900d-fd565680b006");
    _BankNewTransaction.Enter_AllocateTo1Inside(data[18]);
    

    TestModellerLogger.SetLastNodeGuid("90fe1e3b-a5c7-4859-9f3c-68f1c0d3cec9");
    _BankNewTransaction.Click_SaveButton();
    

pages.Reconcilation1 _Reconcilation1 = new pages.Reconcilation1(driver);
//    TestModellerLogger.SetLastNodeGuid("fa2fbd69-b20c-499d-aab8-a028282e1c7d");
//    _Reconcilation1.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("c3f2362d-da03-41a2-b0f1-a5d4c27eaf3d");
//    _Reconcilation1.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("d3a4fea0-340e-411b-bd7e-df22c1bc2a4c");
    _Reconcilation1.Click_AccountantTAB();
    

    TestModellerLogger.SetLastNodeGuid("45e9b458-be61-46fe-ae0e-ce9cf6653294");
    _Reconcilation1.Click_ReconciledTAB();
    

//    TestModellerLogger.SetLastNodeGuid("cebdd3f7-5fb6-4db3-af96-64efcd5380b2");
//    _Reconcilation1.Click_ReconcilationPlus1();
//    

 /*   TestModellerLogger.SetLastNodeGuid("6f4fed47-23f4-40d3-9e2e-528a977e6a18");
    _Reconcilation1.Select_AccountType1(data[19]);
    

    TestModellerLogger.SetLastNodeGuid("cafc0994-25a6-4b15-87d2-7e36c8d6a011");
    _Reconcilation1.Select_Account1(data[20]);
   

    TestModellerLogger.SetLastNodeGuid("c7ed949d-10df-430a-8c1e-dbeb92d7b3da");
    _Reconcilation1.Click_SelectCheck1();
    

    TestModellerLogger.SetLastNodeGuid("dbe69ad3-4479-4704-bedc-0b689b0bcf62");
    _Reconcilation1.Click_ClickRecord();
    

    TestModellerLogger.SetLastNodeGuid("da11af47-6864-43c2-aae3-eb9924ae2002");
    _Reconcilation1.Click_SelectCheck2();
    

    TestModellerLogger.SetLastNodeGuid("ee929282-b3bf-406b-9f71-c1eff3f93b9b");
    _Reconcilation1.Click_ClickRecord2();
    

    TestModellerLogger.SetLastNodeGuid("38250a23-50c5-4021-82d9-f58af153d40b");
    _Reconcilation1.Click_ReconcileLink();
    

//    TestModellerLogger.SetLastNodeGuid("96760120-28d1-4314-871a-d9c5f3fc77c8");
//    _Reconcilation1.Select_ReconcileType("Partial Reconcile");
    

    TestModellerLogger.SetLastNodeGuid("4be2e433-bded-42dc-99a2-7cedb07674b0");
    _Reconcilation1.Click_ReconcileButton2();
    

//    TestModellerLogger.SetLastNodeGuid("a1af2e76-606b-4212-8605-726133cd5ce1");
//    _Reconcilation1.Click_closeButton();
    

//    TestModellerLogger.SetLastNodeGuid("c32a3b0c-a198-4505-b33a-fc3581499a80");
//    _Reconcilation1.Click_ReconciledTAB();*/
//    

    }

 /*   @Test  (groups= {"ScriptInvoiceForReconciledTransactions","ScriptInvoiceForReconciledTransactions - Default Profile"})
    @TestModellerPath(guid = "6aee8faf-40e2-4022-bb6c-0a6ba7c58254")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlCl2()
    {
        
        pages.Login1VAT _Login1VAT = new pages.Login1VAT(driver);
    TestModellerLogger.SetLastNodeGuid("93e4a214-3f97-41d2-8063-dd91c879e847");
    _Login1VAT.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7eff8b4c-1e47-48a4-bcad-b3639d0cdfd5");
    _Login1VAT.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ceaa193b-d8c0-48f9-911f-018e2571da20");
    _Login1VAT.Enter_UserName("Cassie83");
    

    TestModellerLogger.SetLastNodeGuid("95b31ed9-af0a-49e7-8bfa-8471d379cdff");
    _Login1VAT.Enter_Password("f_ZbRi0eDH");
    

    TestModellerLogger.SetLastNodeGuid("942414e4-1d0e-45ba-bdd1-43293b97e0ff");
    _Login1VAT.Click_LoginButton();
    

pages.AgentsSelect _AgentsSelect = new pages.AgentsSelect(driver);
    TestModellerLogger.SetLastNodeGuid("69016c4b-a736-45bf-a682-5c03ee8d17cd");
    _AgentsSelect.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("bd071d41-148c-42e8-8300-984c9dd4df87");
    _AgentsSelect.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("bd031a68-650a-4b8c-8e7c-0ce87415e17e");
    _AgentsSelect.Click_AgentsTab();
    

    TestModellerLogger.SetLastNodeGuid("d5b61053-e5d4-479f-87c7-e4be6b5f054a");
    _AgentsSelect.Enter_AgentName("reprehenderit");
    

    TestModellerLogger.SetLastNodeGuid("2bae82eb-0e45-434c-b1bd-7336f304d4f9");
    _AgentsSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("be317b25-3125-4191-86a5-e8ffee0d0334");
    _AgentsSelect.Click_SelectAgent();
    

pages.ClientSelect _ClientSelect = new pages.ClientSelect(driver);
    TestModellerLogger.SetLastNodeGuid("1243c994-d23d-40d1-bc93-38dfdab760ed");
    _ClientSelect.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("b42ff41f-2fec-4f5c-b77b-2742ec894ec7");
    _ClientSelect.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ff5edd38-07b0-452b-95d6-f33e07e1e975");
    _ClientSelect.Click_ClientsTAB();
    

    TestModellerLogger.SetLastNodeGuid("14a94a5a-c1ac-4e4f-afd4-69a84ffa5a24");
    _ClientSelect.Enter_ClientName("odio");
    

    TestModellerLogger.SetLastNodeGuid("ed3e4750-33a4-4d75-a14c-9d75935c79c7");
    _ClientSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("e537c9d6-4166-4745-b27e-a178d69d2884");
    _ClientSelect.Click_SelectClient();
    

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
    _SaleInvoice.Enter_InvoiceDate("44248");
    

    TestModellerLogger.SetLastNodeGuid("294097b8-ccc5-4eb7-baec-1a26ca1364f0");
    _SaleInvoice.Select_IncomeType("");
    

    TestModellerLogger.SetLastNodeGuid("5ccbf01b-65a3-47f5-b916-dab48aab691f");
    _SaleInvoice.Enter_Description("123");
    

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
    

pages.ReconcilationTransaction _BankNewTransaction = new pages.ReconcilationTransaction(driver);
    TestModellerLogger.SetLastNodeGuid("749d812e-6ce5-40e7-a772-65e7fb0254fd");
    _BankNewTransaction.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("90aa0df5-01d7-437b-aa15-b1e333d31a77");
    _BankNewTransaction.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("00b70107-cc4a-4697-a71f-dbb0d1c0ef03");
    _BankNewTransaction.Click_BankingTAB();
    

    TestModellerLogger.SetLastNodeGuid("94a4fa93-d2d5-4ff6-837c-ef202411eca4");
    _BankNewTransaction.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("d0e7d4a2-32cb-48b0-b4da-56a9fea2e49b");
    _BankNewTransaction.Click_NewTransaction();
    

    TestModellerLogger.SetLastNodeGuid("555c6b39-680f-4865-8d40-608a332942d5");
    _BankNewTransaction.Select_BankName("James");
    

    TestModellerLogger.SetLastNodeGuid("ce3257a1-b75f-4eb6-b402-ae8fae76edeb");
    _BankNewTransaction.Enter_Date("44248");
    

    TestModellerLogger.SetLastNodeGuid("7944d2f0-3c7c-4e24-9587-0042391db73f");
    _BankNewTransaction.Enter_Description("Et expedita aliquid voluptas voluptatibus quia et.
Molestias earum ipsum corrupti dignissimos sint.
Rerum repellat distinctio et ut.
Nam iusto architecto aliquam exercitationem commodi est dignissimos.
Et aliquid et occaecati dolor quia ex id molestias earum.
Minus maxime quis delectus non enim sunt et.
Accusamus quis sapiente quos aut.
Modi minima architecto est vel et doloribus id dignissimos qui.
Molestiae minus sit provident.
Voluptatem molestiae adipisci alias et voluptatem.");
    

    TestModellerLogger.SetLastNodeGuid("8eaf3156-c404-4861-b137-cd99ca75a203");
    _BankNewTransaction.Enter_ReceivedAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("ef855a7e-0884-43f7-bf3f-38745eaac39d");
    _BankNewTransaction.Enter_SpentAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("7a8babab-b1f5-4e2d-bbe5-6034eeffc428");
    _BankNewTransaction.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("c9f25a3d-bb87-4aef-bca1-41d264f6b770");
    _BankNewTransaction.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("59ffb8ed-2011-45c5-a461-586d33787838");
    _BankNewTransaction.Click_AllocateTo();
    

    TestModellerLogger.SetLastNodeGuid("e1e045f4-55c1-41b2-900d-fd565680b006");
    _BankNewTransaction.Enter_AllocateTo1Inside();
    

    TestModellerLogger.SetLastNodeGuid("90fe1e3b-a5c7-4859-9f3c-68f1c0d3cec9");
    _BankNewTransaction.Click_SaveButton();
    

pages.Reconcilation1 _Reconcilation1 = new pages.Reconcilation1(driver);
    TestModellerLogger.SetLastNodeGuid("fa2fbd69-b20c-499d-aab8-a028282e1c7d");
    _Reconcilation1.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c3f2362d-da03-41a2-b0f1-a5d4c27eaf3d");
    _Reconcilation1.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("d3a4fea0-340e-411b-bd7e-df22c1bc2a4c");
    _Reconcilation1.Click_AccountantTAB();
    

    TestModellerLogger.SetLastNodeGuid("45e9b458-be61-46fe-ae0e-ce9cf6653294");
    _Reconcilation1.Click_ReconciledTAB();
    

    TestModellerLogger.SetLastNodeGuid("cebdd3f7-5fb6-4db3-af96-64efcd5380b2");
    _Reconcilation1.Click_ReconcilationPlus1();
    

    TestModellerLogger.SetLastNodeGuid("6f4fed47-23f4-40d3-9e2e-528a977e6a18");
    _Reconcilation1.Select_AccountType1("Customer");
    

    TestModellerLogger.SetLastNodeGuid("cafc0994-25a6-4b15-87d2-7e36c8d6a011");
    _Reconcilation1.Select_Account1("No Available Accounts to Reconcile");
    

    TestModellerLogger.SetLastNodeGuid("c7ed949d-10df-430a-8c1e-dbeb92d7b3da");
    _Reconcilation1.Click_SelectCheck1();
    

    TestModellerLogger.SetLastNodeGuid("dbe69ad3-4479-4704-bedc-0b689b0bcf62");
    _Reconcilation1.Click_ClickRecord();
    

    TestModellerLogger.SetLastNodeGuid("da11af47-6864-43c2-aae3-eb9924ae2002");
    _Reconcilation1.Click_SelectCheck2();
    

    TestModellerLogger.SetLastNodeGuid("ee929282-b3bf-406b-9f71-c1eff3f93b9b");
    _Reconcilation1.Click_ClickRecord2();
    

    TestModellerLogger.SetLastNodeGuid("38250a23-50c5-4021-82d9-f58af153d40b");
    _Reconcilation1.Click_ReconcileLink();
    

    TestModellerLogger.SetLastNodeGuid("96760120-28d1-4314-871a-d9c5f3fc77c8");
    _Reconcilation1.Select_ReconcileType("Partial Reconcile");
    

    TestModellerLogger.SetLastNodeGuid("4be2e433-bded-42dc-99a2-7cedb07674b0");
    _Reconcilation1.Click_ReconcileButton2();
    

    TestModellerLogger.SetLastNodeGuid("a1af2e76-606b-4212-8605-726133cd5ce1");
    _Reconcilation1.Click_closeButton();
    

    TestModellerLogger.SetLastNodeGuid("c32a3b0c-a198-4505-b33a-fc3581499a80");
    _Reconcilation1.Click_ReconciledTAB();
    

    }

    @Test  (groups= {"ScriptInvoiceForReconciledTransactions","ScriptInvoiceForReconciledTransactions - Default Profile"})
    @TestModellerPath(guid = "12a369c3-667f-4044-aa42-7313e0730d0f")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlCl3()
    {
        
        pages.Login1VAT _Login1VAT = new pages.Login1VAT(driver);
    TestModellerLogger.SetLastNodeGuid("93e4a214-3f97-41d2-8063-dd91c879e847");
    _Login1VAT.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7eff8b4c-1e47-48a4-bcad-b3639d0cdfd5");
    _Login1VAT.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ceaa193b-d8c0-48f9-911f-018e2571da20");
    _Login1VAT.Enter_UserName("Bernita79");
    

    TestModellerLogger.SetLastNodeGuid("95b31ed9-af0a-49e7-8bfa-8471d379cdff");
    _Login1VAT.Enter_Password("B2v_9yHkA3");
    

    TestModellerLogger.SetLastNodeGuid("942414e4-1d0e-45ba-bdd1-43293b97e0ff");
    _Login1VAT.Click_LoginButton();
    

pages.AgentsSelect _AgentsSelect = new pages.AgentsSelect(driver);
    TestModellerLogger.SetLastNodeGuid("69016c4b-a736-45bf-a682-5c03ee8d17cd");
    _AgentsSelect.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("bd071d41-148c-42e8-8300-984c9dd4df87");
    _AgentsSelect.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("bd031a68-650a-4b8c-8e7c-0ce87415e17e");
    _AgentsSelect.Click_AgentsTab();
    

    TestModellerLogger.SetLastNodeGuid("d5b61053-e5d4-479f-87c7-e4be6b5f054a");
    _AgentsSelect.Enter_AgentName("vero");
    

    TestModellerLogger.SetLastNodeGuid("2bae82eb-0e45-434c-b1bd-7336f304d4f9");
    _AgentsSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("be317b25-3125-4191-86a5-e8ffee0d0334");
    _AgentsSelect.Click_SelectAgent();
    

pages.ClientSelect _ClientSelect = new pages.ClientSelect(driver);
    TestModellerLogger.SetLastNodeGuid("1243c994-d23d-40d1-bc93-38dfdab760ed");
    _ClientSelect.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("b42ff41f-2fec-4f5c-b77b-2742ec894ec7");
    _ClientSelect.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ff5edd38-07b0-452b-95d6-f33e07e1e975");
    _ClientSelect.Click_ClientsTAB();
    

    TestModellerLogger.SetLastNodeGuid("14a94a5a-c1ac-4e4f-afd4-69a84ffa5a24");
    _ClientSelect.Enter_ClientName("atque");
    

    TestModellerLogger.SetLastNodeGuid("ed3e4750-33a4-4d75-a14c-9d75935c79c7");
    _ClientSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("e537c9d6-4166-4745-b27e-a178d69d2884");
    _ClientSelect.Click_SelectClient();
    

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
    _SaleInvoice.Enter_InvoiceDate("44248");
    

    TestModellerLogger.SetLastNodeGuid("294097b8-ccc5-4eb7-baec-1a26ca1364f0");
    _SaleInvoice.Select_IncomeType("");
    

    TestModellerLogger.SetLastNodeGuid("5ccbf01b-65a3-47f5-b916-dab48aab691f");
    _SaleInvoice.Enter_Description("Omnis sed debitis.
Sunt dolorum accusantium.
Est deleniti ad culpa molestias voluptatem nemo et velit consequatur.
Beatae ad assumenda ipsa voluptas atque iure consequatur ut.
Nobis hic aut similique omnis nulla neque possimus.
Fuga corrupti rerum in.
Ratione repellat ex.
Hic atque est vero libero odio voluptate quibusdam asperiores nesciunt.
Et sit laborum inventore sit sapiente non.
Aut tenetur quia qui officiis aut.");
    

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
    

pages.ReconcilationTransaction _BankNewTransaction = new pages.ReconcilationTransaction(driver);
    TestModellerLogger.SetLastNodeGuid("749d812e-6ce5-40e7-a772-65e7fb0254fd");
    _BankNewTransaction.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("90aa0df5-01d7-437b-aa15-b1e333d31a77");
    _BankNewTransaction.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("00b70107-cc4a-4697-a71f-dbb0d1c0ef03");
    _BankNewTransaction.Click_BankingTAB();
    

    TestModellerLogger.SetLastNodeGuid("94a4fa93-d2d5-4ff6-837c-ef202411eca4");
    _BankNewTransaction.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("d0e7d4a2-32cb-48b0-b4da-56a9fea2e49b");
    _BankNewTransaction.Click_NewTransaction();
    

    TestModellerLogger.SetLastNodeGuid("555c6b39-680f-4865-8d40-608a332942d5");
    _BankNewTransaction.Select_BankName("James");
    

    TestModellerLogger.SetLastNodeGuid("ce3257a1-b75f-4eb6-b402-ae8fae76edeb");
    _BankNewTransaction.Enter_Date("44248");
    

    TestModellerLogger.SetLastNodeGuid("7944d2f0-3c7c-4e24-9587-0042391db73f");
    _BankNewTransaction.Enter_Description("Aperiam magni iure facere.
Eum tenetur beatae non qui consequuntur et quod.
Voluptas ratione veniam ut.
Soluta placeat deleniti eius aperiam exercitationem et accusantium quasi.
Aliquid nam voluptatem quae.
Similique ipsam et quos quia ut incidunt qui eos.
Quibusdam reprehenderit quaerat dolor nemo.
Odio cum tenetur dolor velit iste voluptates aliquid blanditiis repudiandae.
Aut repudiandae dolor sequi odit facere repudiandae sunt non.
Temporibus eos recusandae ducimus ullam dolorum necessitatibus labore.");
    

    TestModellerLogger.SetLastNodeGuid("8eaf3156-c404-4861-b137-cd99ca75a203");
    _BankNewTransaction.Enter_ReceivedAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("ef855a7e-0884-43f7-bf3f-38745eaac39d");
    _BankNewTransaction.Enter_SpentAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("7a8babab-b1f5-4e2d-bbe5-6034eeffc428");
    _BankNewTransaction.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("c9f25a3d-bb87-4aef-bca1-41d264f6b770");
    _BankNewTransaction.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("59ffb8ed-2011-45c5-a461-586d33787838");
    _BankNewTransaction.Click_AllocateTo();
    

    TestModellerLogger.SetLastNodeGuid("e1e045f4-55c1-41b2-900d-fd565680b006");
    _BankNewTransaction.Enter_AllocateTo1Inside();
    

    TestModellerLogger.SetLastNodeGuid("90fe1e3b-a5c7-4859-9f3c-68f1c0d3cec9");
    _BankNewTransaction.Click_SaveButton();
    

pages.Reconcilation1 _Reconcilation1 = new pages.Reconcilation1(driver);
    TestModellerLogger.SetLastNodeGuid("fa2fbd69-b20c-499d-aab8-a028282e1c7d");
    _Reconcilation1.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c3f2362d-da03-41a2-b0f1-a5d4c27eaf3d");
    _Reconcilation1.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("d3a4fea0-340e-411b-bd7e-df22c1bc2a4c");
    _Reconcilation1.Click_AccountantTAB();
    

    TestModellerLogger.SetLastNodeGuid("45e9b458-be61-46fe-ae0e-ce9cf6653294");
    _Reconcilation1.Click_ReconciledTAB();
    

    TestModellerLogger.SetLastNodeGuid("cebdd3f7-5fb6-4db3-af96-64efcd5380b2");
    _Reconcilation1.Click_ReconcilationPlus1();
    

    TestModellerLogger.SetLastNodeGuid("6f4fed47-23f4-40d3-9e2e-528a977e6a18");
    _Reconcilation1.Select_AccountType1("Customer");
    

    TestModellerLogger.SetLastNodeGuid("cafc0994-25a6-4b15-87d2-7e36c8d6a011");
    _Reconcilation1.Select_Account1("No Available Accounts to Reconcile");
    

    TestModellerLogger.SetLastNodeGuid("c7ed949d-10df-430a-8c1e-dbeb92d7b3da");
    _Reconcilation1.Click_SelectCheck1();
    

    TestModellerLogger.SetLastNodeGuid("dbe69ad3-4479-4704-bedc-0b689b0bcf62");
    _Reconcilation1.Click_ClickRecord();
    

    TestModellerLogger.SetLastNodeGuid("da11af47-6864-43c2-aae3-eb9924ae2002");
    _Reconcilation1.Click_SelectCheck2();
    

    TestModellerLogger.SetLastNodeGuid("ee929282-b3bf-406b-9f71-c1eff3f93b9b");
    _Reconcilation1.Click_ClickRecord2();
    

    TestModellerLogger.SetLastNodeGuid("38250a23-50c5-4021-82d9-f58af153d40b");
    _Reconcilation1.Click_ReconcileLink();
    

    TestModellerLogger.SetLastNodeGuid("96760120-28d1-4314-871a-d9c5f3fc77c8");
    _Reconcilation1.Select_ReconcileType("Partial Reconcile");
    

    TestModellerLogger.SetLastNodeGuid("4be2e433-bded-42dc-99a2-7cedb07674b0");
    _Reconcilation1.Click_ReconcileButton2();
    

    TestModellerLogger.SetLastNodeGuid("a1af2e76-606b-4212-8605-726133cd5ce1");
    _Reconcilation1.Click_closeButton();
    

    TestModellerLogger.SetLastNodeGuid("c32a3b0c-a198-4505-b33a-fc3581499a80");
    _Reconcilation1.Click_ReconciledTAB();
    

    }

    @Test  (groups= {"ScriptInvoiceForReconciledTransactions","ScriptInvoiceForReconciledTransactions - Default Profile"})
    @TestModellerPath(guid = "c6aada3c-b0e6-4a82-8202-5edefccc833c")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlCl4()
    {
        
        pages.Login1VAT _Login1VAT = new pages.Login1VAT(driver);
    TestModellerLogger.SetLastNodeGuid("93e4a214-3f97-41d2-8063-dd91c879e847");
    _Login1VAT.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7eff8b4c-1e47-48a4-bcad-b3639d0cdfd5");
    _Login1VAT.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ceaa193b-d8c0-48f9-911f-018e2571da20");
    _Login1VAT.Enter_UserName("Steve76");
    

    TestModellerLogger.SetLastNodeGuid("95b31ed9-af0a-49e7-8bfa-8471d379cdff");
    _Login1VAT.Enter_Password("f2sfuLNnBg");
    

    TestModellerLogger.SetLastNodeGuid("942414e4-1d0e-45ba-bdd1-43293b97e0ff");
    _Login1VAT.Click_LoginButton();
    

pages.AgentsSelect _AgentsSelect = new pages.AgentsSelect(driver);
    TestModellerLogger.SetLastNodeGuid("69016c4b-a736-45bf-a682-5c03ee8d17cd");
    _AgentsSelect.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("bd071d41-148c-42e8-8300-984c9dd4df87");
    _AgentsSelect.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("bd031a68-650a-4b8c-8e7c-0ce87415e17e");
    _AgentsSelect.Click_AgentsTab();
    

    TestModellerLogger.SetLastNodeGuid("d5b61053-e5d4-479f-87c7-e4be6b5f054a");
    _AgentsSelect.Enter_AgentName("velit");
    

    TestModellerLogger.SetLastNodeGuid("2bae82eb-0e45-434c-b1bd-7336f304d4f9");
    _AgentsSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("be317b25-3125-4191-86a5-e8ffee0d0334");
    _AgentsSelect.Click_SelectAgent();
    

pages.ClientSelect _ClientSelect = new pages.ClientSelect(driver);
    TestModellerLogger.SetLastNodeGuid("1243c994-d23d-40d1-bc93-38dfdab760ed");
    _ClientSelect.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("b42ff41f-2fec-4f5c-b77b-2742ec894ec7");
    _ClientSelect.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ff5edd38-07b0-452b-95d6-f33e07e1e975");
    _ClientSelect.Click_ClientsTAB();
    

    TestModellerLogger.SetLastNodeGuid("14a94a5a-c1ac-4e4f-afd4-69a84ffa5a24");
    _ClientSelect.Enter_ClientName("at");
    

    TestModellerLogger.SetLastNodeGuid("ed3e4750-33a4-4d75-a14c-9d75935c79c7");
    _ClientSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("e537c9d6-4166-4745-b27e-a178d69d2884");
    _ClientSelect.Click_SelectClient();
    

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
    _SaleInvoice.Enter_InvoiceDate("44248");
    

    TestModellerLogger.SetLastNodeGuid("294097b8-ccc5-4eb7-baec-1a26ca1364f0");
    _SaleInvoice.Select_IncomeType("");
    

    TestModellerLogger.SetLastNodeGuid("5ccbf01b-65a3-47f5-b916-dab48aab691f");
    _SaleInvoice.Enter_Description("Sed natus odio.
Dolorem eius inventore et cupiditate nisi ut est laboriosam pariatur.
Molestiae neque numquam et magnam voluptatem modi et porro.
Sunt neque dolores dolore odit pariatur sed.
Eos tempore qui corporis ea.
Expedita nobis minima aut repellendus.
Veniam qui ipsum voluptatibus ex sed.
Eum animi maxime reiciendis veritatis quisquam voluptatem aliquam inventore molestiae.
Quam quos assumenda qui sed.
Qui dolorum omnis pariatur.");
    

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
    

pages.ReconcilationTransaction _BankNewTransaction = new pages.ReconcilationTransaction(driver);
    TestModellerLogger.SetLastNodeGuid("749d812e-6ce5-40e7-a772-65e7fb0254fd");
    _BankNewTransaction.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("90aa0df5-01d7-437b-aa15-b1e333d31a77");
    _BankNewTransaction.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("00b70107-cc4a-4697-a71f-dbb0d1c0ef03");
    _BankNewTransaction.Click_BankingTAB();
    

    TestModellerLogger.SetLastNodeGuid("94a4fa93-d2d5-4ff6-837c-ef202411eca4");
    _BankNewTransaction.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("d0e7d4a2-32cb-48b0-b4da-56a9fea2e49b");
    _BankNewTransaction.Click_NewTransaction();
    

    TestModellerLogger.SetLastNodeGuid("555c6b39-680f-4865-8d40-608a332942d5");
    _BankNewTransaction.Select_BankName("James");
    

    TestModellerLogger.SetLastNodeGuid("ce3257a1-b75f-4eb6-b402-ae8fae76edeb");
    _BankNewTransaction.Enter_Date("44248");
    

    TestModellerLogger.SetLastNodeGuid("7944d2f0-3c7c-4e24-9587-0042391db73f");
    _BankNewTransaction.Enter_Description("Doloribus et accusamus esse perferendis ea beatae aperiam exercitationem aspernatur.
Ut soluta quia eligendi rerum.
Quia omnis magnam et sed.
Qui fugit itaque.
Fugit iste consequatur.
Fugit quo ut dolorem ipsa rerum dolores.
Quia quidem facere voluptas quo aspernatur possimus.
Quo unde voluptatem adipisci eaque doloribus hic quaerat blanditiis quae.
Ullam architecto eum delectus.
Molestiae ut labore eum esse aut.");
    

    TestModellerLogger.SetLastNodeGuid("8eaf3156-c404-4861-b137-cd99ca75a203");
    _BankNewTransaction.Enter_ReceivedAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("ef855a7e-0884-43f7-bf3f-38745eaac39d");
    _BankNewTransaction.Enter_SpentAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("7a8babab-b1f5-4e2d-bbe5-6034eeffc428");
    _BankNewTransaction.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("c9f25a3d-bb87-4aef-bca1-41d264f6b770");
    _BankNewTransaction.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("59ffb8ed-2011-45c5-a461-586d33787838");
    _BankNewTransaction.Click_AllocateTo();
    

    TestModellerLogger.SetLastNodeGuid("e1e045f4-55c1-41b2-900d-fd565680b006");
    _BankNewTransaction.Enter_AllocateTo1Inside();
    

    TestModellerLogger.SetLastNodeGuid("90fe1e3b-a5c7-4859-9f3c-68f1c0d3cec9");
    _BankNewTransaction.Click_SaveButton();
    

pages.Reconcilation1 _Reconcilation1 = new pages.Reconcilation1(driver);
    TestModellerLogger.SetLastNodeGuid("fa2fbd69-b20c-499d-aab8-a028282e1c7d");
    _Reconcilation1.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c3f2362d-da03-41a2-b0f1-a5d4c27eaf3d");
    _Reconcilation1.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("d3a4fea0-340e-411b-bd7e-df22c1bc2a4c");
    _Reconcilation1.Click_AccountantTAB();
    

    TestModellerLogger.SetLastNodeGuid("45e9b458-be61-46fe-ae0e-ce9cf6653294");
    _Reconcilation1.Click_ReconciledTAB();
    

    TestModellerLogger.SetLastNodeGuid("cebdd3f7-5fb6-4db3-af96-64efcd5380b2");
    _Reconcilation1.Click_ReconcilationPlus1();
    

    TestModellerLogger.SetLastNodeGuid("6f4fed47-23f4-40d3-9e2e-528a977e6a18");
    _Reconcilation1.Select_AccountType1("Customer");
    

    TestModellerLogger.SetLastNodeGuid("cafc0994-25a6-4b15-87d2-7e36c8d6a011");
    _Reconcilation1.Select_Account1("No Available Accounts to Reconcile");
    

    TestModellerLogger.SetLastNodeGuid("c7ed949d-10df-430a-8c1e-dbeb92d7b3da");
    _Reconcilation1.Click_SelectCheck1();
    

    TestModellerLogger.SetLastNodeGuid("dbe69ad3-4479-4704-bedc-0b689b0bcf62");
    _Reconcilation1.Click_ClickRecord();
    

    TestModellerLogger.SetLastNodeGuid("da11af47-6864-43c2-aae3-eb9924ae2002");
    _Reconcilation1.Click_SelectCheck2();
    

    TestModellerLogger.SetLastNodeGuid("ee929282-b3bf-406b-9f71-c1eff3f93b9b");
    _Reconcilation1.Click_ClickRecord2();
    

    TestModellerLogger.SetLastNodeGuid("38250a23-50c5-4021-82d9-f58af153d40b");
    _Reconcilation1.Click_ReconcileLink();
    

    TestModellerLogger.SetLastNodeGuid("96760120-28d1-4314-871a-d9c5f3fc77c8");
    _Reconcilation1.Select_ReconcileType("Partial Reconcile");
    

    TestModellerLogger.SetLastNodeGuid("4be2e433-bded-42dc-99a2-7cedb07674b0");
    _Reconcilation1.Click_ReconcileButton2();
    

    TestModellerLogger.SetLastNodeGuid("a1af2e76-606b-4212-8605-726133cd5ce1");
    _Reconcilation1.Click_closeButton();
    

    TestModellerLogger.SetLastNodeGuid("c32a3b0c-a198-4505-b33a-fc3581499a80");
    _Reconcilation1.Click_ReconciledTAB();
    

    }

    @Test  (groups= {"ScriptInvoiceForReconciledTransactions","ScriptInvoiceForReconciledTransactions - Default Profile"})
    @TestModellerPath(guid = "32561c22-3e9d-4309-a935-486b02ba1a1c")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlCl5()
    {
        
        pages.Login1VAT _Login1VAT = new pages.Login1VAT(driver);
    TestModellerLogger.SetLastNodeGuid("93e4a214-3f97-41d2-8063-dd91c879e847");
    _Login1VAT.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7eff8b4c-1e47-48a4-bcad-b3639d0cdfd5");
    _Login1VAT.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ceaa193b-d8c0-48f9-911f-018e2571da20");
    _Login1VAT.Enter_UserName("Mabelle_Rolfson65");
    

    TestModellerLogger.SetLastNodeGuid("95b31ed9-af0a-49e7-8bfa-8471d379cdff");
    _Login1VAT.Enter_Password("9UGc59Htuu");
    

    TestModellerLogger.SetLastNodeGuid("942414e4-1d0e-45ba-bdd1-43293b97e0ff");
    _Login1VAT.Click_LoginButton();
    

pages.AgentsSelect _AgentsSelect = new pages.AgentsSelect(driver);
    TestModellerLogger.SetLastNodeGuid("69016c4b-a736-45bf-a682-5c03ee8d17cd");
    _AgentsSelect.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("bd071d41-148c-42e8-8300-984c9dd4df87");
    _AgentsSelect.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("bd031a68-650a-4b8c-8e7c-0ce87415e17e");
    _AgentsSelect.Click_AgentsTab();
    

    TestModellerLogger.SetLastNodeGuid("d5b61053-e5d4-479f-87c7-e4be6b5f054a");
    _AgentsSelect.Enter_AgentName("et");
    

    TestModellerLogger.SetLastNodeGuid("2bae82eb-0e45-434c-b1bd-7336f304d4f9");
    _AgentsSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("be317b25-3125-4191-86a5-e8ffee0d0334");
    _AgentsSelect.Click_SelectAgent();
    

pages.ClientSelect _ClientSelect = new pages.ClientSelect(driver);
    TestModellerLogger.SetLastNodeGuid("1243c994-d23d-40d1-bc93-38dfdab760ed");
    _ClientSelect.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("b42ff41f-2fec-4f5c-b77b-2742ec894ec7");
    _ClientSelect.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ff5edd38-07b0-452b-95d6-f33e07e1e975");
    _ClientSelect.Click_ClientsTAB();
    

    TestModellerLogger.SetLastNodeGuid("14a94a5a-c1ac-4e4f-afd4-69a84ffa5a24");
    _ClientSelect.Enter_ClientName("quis");
    

    TestModellerLogger.SetLastNodeGuid("ed3e4750-33a4-4d75-a14c-9d75935c79c7");
    _ClientSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("e537c9d6-4166-4745-b27e-a178d69d2884");
    _ClientSelect.Click_SelectClient();
    

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
    _SaleInvoice.Enter_InvoiceDate("44248");
    

    TestModellerLogger.SetLastNodeGuid("294097b8-ccc5-4eb7-baec-1a26ca1364f0");
    _SaleInvoice.Select_IncomeType("");
    

    TestModellerLogger.SetLastNodeGuid("5ccbf01b-65a3-47f5-b916-dab48aab691f");
    _SaleInvoice.Enter_Description("Qui eligendi iure qui vitae aut animi omnis.
Eum nostrum est fugiat earum repellat qui id dignissimos aspernatur.
Aperiam omnis natus ut dolores ab dolorem.
Assumenda deleniti sint.
In qui consequatur deleniti consequatur eaque cum.
Nam aut architecto aperiam quam quas iusto corrupti.
Similique sequi praesentium consequatur aut nobis harum magni eaque dicta.
Quis provident doloribus.
Accusamus nihil quia odit dolores sint.
Optio voluptas ea eveniet tempora est non.");
    

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
    

pages.ReconcilationTransaction _BankNewTransaction = new pages.ReconcilationTransaction(driver);
    TestModellerLogger.SetLastNodeGuid("749d812e-6ce5-40e7-a772-65e7fb0254fd");
    _BankNewTransaction.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("90aa0df5-01d7-437b-aa15-b1e333d31a77");
    _BankNewTransaction.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("00b70107-cc4a-4697-a71f-dbb0d1c0ef03");
    _BankNewTransaction.Click_BankingTAB();
    

    TestModellerLogger.SetLastNodeGuid("94a4fa93-d2d5-4ff6-837c-ef202411eca4");
    _BankNewTransaction.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("d0e7d4a2-32cb-48b0-b4da-56a9fea2e49b");
    _BankNewTransaction.Click_NewTransaction();
    

    TestModellerLogger.SetLastNodeGuid("555c6b39-680f-4865-8d40-608a332942d5");
    _BankNewTransaction.Select_BankName("James");
    

    TestModellerLogger.SetLastNodeGuid("ce3257a1-b75f-4eb6-b402-ae8fae76edeb");
    _BankNewTransaction.Enter_Date("44248");
    

    TestModellerLogger.SetLastNodeGuid("7944d2f0-3c7c-4e24-9587-0042391db73f");
    _BankNewTransaction.Enter_Description("Eligendi sit harum ea repellat nemo similique nostrum ipsum cupiditate.
Omnis aut impedit asperiores.
Adipisci atque quod tempore ad repudiandae ullam vero.
Cupiditate nihil eveniet excepturi nisi iure suscipit sit commodi omnis.
Quas earum beatae beatae qui consectetur possimus sit aut.
Voluptate ullam expedita.
Expedita neque repudiandae.
Fuga omnis rerum est et voluptatum animi tempore dolor dolorem.
Autem et facilis hic.
Et magnam voluptate distinctio.");
    

    TestModellerLogger.SetLastNodeGuid("8eaf3156-c404-4861-b137-cd99ca75a203");
    _BankNewTransaction.Enter_ReceivedAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("ef855a7e-0884-43f7-bf3f-38745eaac39d");
    _BankNewTransaction.Enter_SpentAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("7a8babab-b1f5-4e2d-bbe5-6034eeffc428");
    _BankNewTransaction.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("c9f25a3d-bb87-4aef-bca1-41d264f6b770");
    _BankNewTransaction.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("59ffb8ed-2011-45c5-a461-586d33787838");
    _BankNewTransaction.Click_AllocateTo();
    

    TestModellerLogger.SetLastNodeGuid("e1e045f4-55c1-41b2-900d-fd565680b006");
    _BankNewTransaction.Enter_AllocateTo1Inside();
    

    TestModellerLogger.SetLastNodeGuid("90fe1e3b-a5c7-4859-9f3c-68f1c0d3cec9");
    _BankNewTransaction.Click_SaveButton();
    

pages.Reconcilation1 _Reconcilation1 = new pages.Reconcilation1(driver);
    TestModellerLogger.SetLastNodeGuid("fa2fbd69-b20c-499d-aab8-a028282e1c7d");
    _Reconcilation1.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c3f2362d-da03-41a2-b0f1-a5d4c27eaf3d");
    _Reconcilation1.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("d3a4fea0-340e-411b-bd7e-df22c1bc2a4c");
    _Reconcilation1.Click_AccountantTAB();
    

    TestModellerLogger.SetLastNodeGuid("45e9b458-be61-46fe-ae0e-ce9cf6653294");
    _Reconcilation1.Click_ReconciledTAB();
    

    TestModellerLogger.SetLastNodeGuid("cebdd3f7-5fb6-4db3-af96-64efcd5380b2");
    _Reconcilation1.Click_ReconcilationPlus1();
    

    TestModellerLogger.SetLastNodeGuid("6f4fed47-23f4-40d3-9e2e-528a977e6a18");
    _Reconcilation1.Select_AccountType1("Customer");
    

    TestModellerLogger.SetLastNodeGuid("cafc0994-25a6-4b15-87d2-7e36c8d6a011");
    _Reconcilation1.Select_Account1("No Available Accounts to Reconcile");
    

    TestModellerLogger.SetLastNodeGuid("c7ed949d-10df-430a-8c1e-dbeb92d7b3da");
    _Reconcilation1.Click_SelectCheck1();
    

    TestModellerLogger.SetLastNodeGuid("dbe69ad3-4479-4704-bedc-0b689b0bcf62");
    _Reconcilation1.Click_ClickRecord();
    

    TestModellerLogger.SetLastNodeGuid("da11af47-6864-43c2-aae3-eb9924ae2002");
    _Reconcilation1.Click_SelectCheck2();
    

    TestModellerLogger.SetLastNodeGuid("ee929282-b3bf-406b-9f71-c1eff3f93b9b");
    _Reconcilation1.Click_ClickRecord2();
    

    TestModellerLogger.SetLastNodeGuid("38250a23-50c5-4021-82d9-f58af153d40b");
    _Reconcilation1.Click_ReconcileLink();
    

    TestModellerLogger.SetLastNodeGuid("96760120-28d1-4314-871a-d9c5f3fc77c8");
    _Reconcilation1.Select_ReconcileType("Partial Reconcile");
    

    TestModellerLogger.SetLastNodeGuid("4be2e433-bded-42dc-99a2-7cedb07674b0");
    _Reconcilation1.Click_ReconcileButton2();
    

    TestModellerLogger.SetLastNodeGuid("a1af2e76-606b-4212-8605-726133cd5ce1");
    _Reconcilation1.Click_closeButton();
    

    TestModellerLogger.SetLastNodeGuid("c32a3b0c-a198-4505-b33a-fc3581499a80");
    _Reconcilation1.Click_ReconciledTAB();
    

    }

    @Test  (groups= {"ScriptInvoiceForReconciledTransactions","ScriptInvoiceForReconciledTransactions - Default Profile"})
    @TestModellerPath(guid = "39a6c2c5-a85c-45dd-a8f7-17c09d9cb57d")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlCl6()
    {
        
        pages.Login1VAT _Login1VAT = new pages.Login1VAT(driver);
    TestModellerLogger.SetLastNodeGuid("93e4a214-3f97-41d2-8063-dd91c879e847");
    _Login1VAT.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7eff8b4c-1e47-48a4-bcad-b3639d0cdfd5");
    _Login1VAT.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ceaa193b-d8c0-48f9-911f-018e2571da20");
    _Login1VAT.Enter_UserName("Dorris28");
    

    TestModellerLogger.SetLastNodeGuid("95b31ed9-af0a-49e7-8bfa-8471d379cdff");
    _Login1VAT.Enter_Password("xZ3jX0AzJm");
    

    TestModellerLogger.SetLastNodeGuid("942414e4-1d0e-45ba-bdd1-43293b97e0ff");
    _Login1VAT.Click_LoginButton();
    

pages.AgentsSelect _AgentsSelect = new pages.AgentsSelect(driver);
    TestModellerLogger.SetLastNodeGuid("69016c4b-a736-45bf-a682-5c03ee8d17cd");
    _AgentsSelect.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("bd071d41-148c-42e8-8300-984c9dd4df87");
    _AgentsSelect.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("bd031a68-650a-4b8c-8e7c-0ce87415e17e");
    _AgentsSelect.Click_AgentsTab();
    

    TestModellerLogger.SetLastNodeGuid("d5b61053-e5d4-479f-87c7-e4be6b5f054a");
    _AgentsSelect.Enter_AgentName("placeat");
    

    TestModellerLogger.SetLastNodeGuid("2bae82eb-0e45-434c-b1bd-7336f304d4f9");
    _AgentsSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("be317b25-3125-4191-86a5-e8ffee0d0334");
    _AgentsSelect.Click_SelectAgent();
    

pages.ClientSelect _ClientSelect = new pages.ClientSelect(driver);
    TestModellerLogger.SetLastNodeGuid("1243c994-d23d-40d1-bc93-38dfdab760ed");
    _ClientSelect.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("b42ff41f-2fec-4f5c-b77b-2742ec894ec7");
    _ClientSelect.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ff5edd38-07b0-452b-95d6-f33e07e1e975");
    _ClientSelect.Click_ClientsTAB();
    

    TestModellerLogger.SetLastNodeGuid("14a94a5a-c1ac-4e4f-afd4-69a84ffa5a24");
    _ClientSelect.Enter_ClientName("facilis");
    

    TestModellerLogger.SetLastNodeGuid("ed3e4750-33a4-4d75-a14c-9d75935c79c7");
    _ClientSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("e537c9d6-4166-4745-b27e-a178d69d2884");
    _ClientSelect.Click_SelectClient();
    

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
    _SaleInvoice.Enter_InvoiceDate("44248");
    

    TestModellerLogger.SetLastNodeGuid("294097b8-ccc5-4eb7-baec-1a26ca1364f0");
    _SaleInvoice.Select_IncomeType("");
    

    TestModellerLogger.SetLastNodeGuid("5ccbf01b-65a3-47f5-b916-dab48aab691f");
    _SaleInvoice.Enter_Description("Porro dolor sit ex.
Doloribus praesentium eligendi ducimus et blanditiis.
Id aut explicabo esse hic blanditiis repellendus aut consequatur et.
Veritatis a dolorem laborum maxime sed voluptates voluptas.
Ipsa commodi non vel veniam voluptatibus.
Non et commodi sit nobis officia incidunt.
Vero vero incidunt et cum doloremque ut ex.
Ducimus enim in enim vel quo in ut qui.
Ut et eveniet.
Dolores delectus vero in labore.");
    

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
    

pages.ReconcilationTransaction _BankNewTransaction = new pages.ReconcilationTransaction(driver);
    TestModellerLogger.SetLastNodeGuid("749d812e-6ce5-40e7-a772-65e7fb0254fd");
    _BankNewTransaction.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("90aa0df5-01d7-437b-aa15-b1e333d31a77");
    _BankNewTransaction.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("00b70107-cc4a-4697-a71f-dbb0d1c0ef03");
    _BankNewTransaction.Click_BankingTAB();
    

    TestModellerLogger.SetLastNodeGuid("94a4fa93-d2d5-4ff6-837c-ef202411eca4");
    _BankNewTransaction.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("d0e7d4a2-32cb-48b0-b4da-56a9fea2e49b");
    _BankNewTransaction.Click_NewTransaction();
    

    TestModellerLogger.SetLastNodeGuid("555c6b39-680f-4865-8d40-608a332942d5");
    _BankNewTransaction.Select_BankName("James");
    

    TestModellerLogger.SetLastNodeGuid("ce3257a1-b75f-4eb6-b402-ae8fae76edeb");
    _BankNewTransaction.Enter_Date("44248");
    

    TestModellerLogger.SetLastNodeGuid("7944d2f0-3c7c-4e24-9587-0042391db73f");
    _BankNewTransaction.Enter_Description("Sed voluptate labore molestias est tempora quam iure quod.
Voluptatibus qui excepturi animi voluptatum est velit non rerum voluptatem.
Omnis aliquid provident possimus ea facere magnam libero.
Et id accusantium similique ea adipisci et.
Eos et autem ipsa et.
Ratione excepturi id consequatur amet omnis tempore incidunt qui molestiae.
Ex inventore impedit facere.
Rem dolorem porro velit consequatur.
Nihil rerum et minima nostrum qui.
Reiciendis rerum deserunt at iure eum et libero rerum.");
    

    TestModellerLogger.SetLastNodeGuid("8eaf3156-c404-4861-b137-cd99ca75a203");
    _BankNewTransaction.Enter_ReceivedAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("ef855a7e-0884-43f7-bf3f-38745eaac39d");
    _BankNewTransaction.Enter_SpentAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("7a8babab-b1f5-4e2d-bbe5-6034eeffc428");
    _BankNewTransaction.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("c9f25a3d-bb87-4aef-bca1-41d264f6b770");
    _BankNewTransaction.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("59ffb8ed-2011-45c5-a461-586d33787838");
    _BankNewTransaction.Click_AllocateTo();
    

    TestModellerLogger.SetLastNodeGuid("e1e045f4-55c1-41b2-900d-fd565680b006");
    _BankNewTransaction.Enter_AllocateTo1Inside();
    

    TestModellerLogger.SetLastNodeGuid("90fe1e3b-a5c7-4859-9f3c-68f1c0d3cec9");
    _BankNewTransaction.Click_SaveButton();
    

pages.Reconcilation1 _Reconcilation1 = new pages.Reconcilation1(driver);
    TestModellerLogger.SetLastNodeGuid("fa2fbd69-b20c-499d-aab8-a028282e1c7d");
    _Reconcilation1.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c3f2362d-da03-41a2-b0f1-a5d4c27eaf3d");
    _Reconcilation1.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("d3a4fea0-340e-411b-bd7e-df22c1bc2a4c");
    _Reconcilation1.Click_AccountantTAB();
    

    TestModellerLogger.SetLastNodeGuid("45e9b458-be61-46fe-ae0e-ce9cf6653294");
    _Reconcilation1.Click_ReconciledTAB();
    

    TestModellerLogger.SetLastNodeGuid("cebdd3f7-5fb6-4db3-af96-64efcd5380b2");
    _Reconcilation1.Click_ReconcilationPlus1();
    

    TestModellerLogger.SetLastNodeGuid("6f4fed47-23f4-40d3-9e2e-528a977e6a18");
    _Reconcilation1.Select_AccountType1("Customer");
    

    TestModellerLogger.SetLastNodeGuid("cafc0994-25a6-4b15-87d2-7e36c8d6a011");
    _Reconcilation1.Select_Account1("No Available Accounts to Reconcile");
    

    TestModellerLogger.SetLastNodeGuid("c7ed949d-10df-430a-8c1e-dbeb92d7b3da");
    _Reconcilation1.Click_SelectCheck1();
    

    TestModellerLogger.SetLastNodeGuid("dbe69ad3-4479-4704-bedc-0b689b0bcf62");
    _Reconcilation1.Click_ClickRecord();
    

    TestModellerLogger.SetLastNodeGuid("da11af47-6864-43c2-aae3-eb9924ae2002");
    _Reconcilation1.Click_SelectCheck2();
    

    TestModellerLogger.SetLastNodeGuid("ee929282-b3bf-406b-9f71-c1eff3f93b9b");
    _Reconcilation1.Click_ClickRecord2();
    

    TestModellerLogger.SetLastNodeGuid("38250a23-50c5-4021-82d9-f58af153d40b");
    _Reconcilation1.Click_ReconcileLink();
    

    TestModellerLogger.SetLastNodeGuid("96760120-28d1-4314-871a-d9c5f3fc77c8");
    _Reconcilation1.Select_ReconcileType("Partial Reconcile");
    

    TestModellerLogger.SetLastNodeGuid("4be2e433-bded-42dc-99a2-7cedb07674b0");
    _Reconcilation1.Click_ReconcileButton2();
    

    TestModellerLogger.SetLastNodeGuid("a1af2e76-606b-4212-8605-726133cd5ce1");
    _Reconcilation1.Click_closeButton();
    

    TestModellerLogger.SetLastNodeGuid("c32a3b0c-a198-4505-b33a-fc3581499a80");
    _Reconcilation1.Click_ReconciledTAB();
    

    }*/

}

