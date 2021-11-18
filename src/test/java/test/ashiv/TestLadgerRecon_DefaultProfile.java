package test.ashiv;

import reports.TestNGListener;
import tests.TestBase;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;

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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/9e2550af-c124-461c-bf54-1c62874f72ec
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1852, profileId = 102387)
public class TestLadgerRecon_DefaultProfile extends TestBase
{
	String sTestCaseID=null;
	String[] data=null;
	String Sheet = null;

    
    @Test  (groups= {"Test_Ladger_Recon","Test_Ladger_Recon - Default Profile"})
    @TestModellerPath(guid = "82ef9ee9-c1b2-4820-b60b-562ed89ab5e2")
    public void GoToUrlClickView2ClickLedgerReconciliation3PositiveSelectAccountType48PositiveSelectAccount59C() throws InvalidFormatException, InterruptedException

    {
    	sTestCaseID="TC22";
       	Sheet="BankingBank";
        data = ExcelUtility.toReadExcelData(sTestCaseID, Sheet);
        
        pages.banking.ashiv.Login1VAT _Login1VAT = new pages.banking.ashiv.Login1VAT(driver);
        
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
    

    pages.banking.ashiv.AgentsSelect _AgentsSelect = new pages.banking.ashiv.AgentsSelect(driver);
//    TestModellerLogger.SetLastNodeGuid("69016c4b-a736-45bf-a682-5c03ee8d17cd");
//    _AgentsSelect.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("bd071d41-148c-42e8-8300-984c9dd4df87");
//    _AgentsSelect.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("bd031a68-650a-4b8c-8e7c-0ce87415e17e");
    _AgentsSelect.Click_AgentsTab();
    

    TestModellerLogger.SetLastNodeGuid("d5b61053-e5d4-479f-87c7-e4be6b5f054a");
    _AgentsSelect.Enter_AgentName(data[3]);
    

    TestModellerLogger.SetLastNodeGuid("2bae82eb-0e45-434c-b1bd-7336f304d4f9");
    _AgentsSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("be317b25-3125-4191-86a5-e8ffee0d0334");
    _AgentsSelect.Click_SelectAgent();
    

    pages.banking.ashiv.ClientSelect _ClientSelect = new pages.banking.ashiv.ClientSelect(driver);

    

    TestModellerLogger.SetLastNodeGuid("ff5edd38-07b0-452b-95d6-f33e07e1e975");
    _ClientSelect.Click_ClientsTAB();
    

    TestModellerLogger.SetLastNodeGuid("14a94a5a-c1ac-4e4f-afd4-69a84ffa5a24");
    _ClientSelect.Enter_ClientName(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("ed3e4750-33a4-4d75-a14c-9d75935c79c7");
    _ClientSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("e537c9d6-4166-4745-b27e-a178d69d2884");
    _ClientSelect.Click_SelectClient();
    
      As_Supplier.Ledger_Reconciliation2 _Ledger_Reconciliation2 = new As_Supplier.Ledger_Reconciliation2(driver);
      
//    TestModellerLogger.SetLastNodeGuid("0d7f3efc-1d9e-4c1d-82a1-54adf0eed4d4");
//    _Ledger_Reconciliation2.GoToUrl();
//    
      _Ledger_Reconciliation2.Click_Expenditure_1();

    TestModellerLogger.SetLastNodeGuid("3bbba1f2-1686-481c-904c-293f9e258faa");
    _Ledger_Reconciliation2.Click_View_2();
    

    TestModellerLogger.SetLastNodeGuid("ceeb3185-e7d3-4c4f-963c-3dca1344a8e1");
    _Ledger_Reconciliation2.Click_Ledger_Reconciliation_3();
    

    TestModellerLogger.SetLastNodeGuid("a40112ac-ceca-4485-9a53-7ce64043f539");
    _Ledger_Reconciliation2.Select_AccountType_4__8(data[5]);
    

  //  TestModellerLogger.SetLastNodeGuid("0c690154-2fcd-4c8e-ae48-7ddbebb785ab");
 //   _Ledger_Reconciliation2.Select_Account_5__9("");
    

    TestModellerLogger.SetLastNodeGuid("94e09692-250a-4696-acf0-8f65e335505b");
    _Ledger_Reconciliation2.Click_Reconcile_All_6();
    utilities.Screenshotcapture.Getscreenshot("Success! Transactions reconciled successfully", "Ledger Reconciliation");

    TestModellerLogger.SetLastNodeGuid("76e9cd84-1d64-4dd3-bbdd-f043aa917f68");
    _Ledger_Reconciliation2.Click_View_Reconciled_7();
    

    TestModellerLogger.SetLastNodeGuid("02394ba8-e51a-483d-a7f6-63c3be685403");
    _Ledger_Reconciliation2.Select_AccountType_4__8(data[5]);
    

  //  TestModellerLogger.SetLastNodeGuid("edfac3dd-25bc-4f57-98ba-614554f63c52");
  //  _Ledger_Reconciliation2.Select_Account_5__9("");
    

//    TestModellerLogger.SetLastNodeGuid("4f11b6bd-18d8-4cac-935c-f1d6b2c3a47b");
//    _Ledger_Reconciliation2.Select_Months_10("Yearly");
//    
//
//    TestModellerLogger.SetLastNodeGuid("70d4f520-5d26-4d6d-930a-9e28f6b9c068");
//    _Ledger_Reconciliation2.Enter_DateFrom_11("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("dd2e997b-64af-4971-b4e7-3de0747bdefc");
//    _Ledger_Reconciliation2.Enter_DateTo_12("");
    

    TestModellerLogger.SetLastNodeGuid("bd3772d2-8362-4883-88d5-d41840bb15f4");
    _Ledger_Reconciliation2.Click_Undo_Reconcile_13();
    utilities.Screenshotcapture.Getscreenshot("Success! Reconciliation cancelled successfully", "Ledger_Reconciliation");
    
    
    

    }
    
    
  
    
    
    

//    @Test  (groups= {"Test_Ladger_Recon","Test_Ladger_Recon - Default Profile"})
//    @TestModellerPath(guid = "93b8f503-a84c-4dc1-8a35-3f2128783b30")
//    public void GoToUrlClickView2ClickLedgerReconciliation3PositiveSelectAccountType48PositiveSelectAccount59C1()
//    {
//        
//        pages.Ledger_Reconciliation2 _Ledger_Reconciliation2 = new pages.Ledger_Reconciliation2(driver);
//    TestModellerLogger.SetLastNodeGuid("0d7f3efc-1d9e-4c1d-82a1-54adf0eed4d4");
//    _Ledger_Reconciliation2.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("3bbba1f2-1686-481c-904c-293f9e258faa");
//    _Ledger_Reconciliation2.Click_View_2();
//    
//
//    TestModellerLogger.SetLastNodeGuid("ceeb3185-e7d3-4c4f-963c-3dca1344a8e1");
//    _Ledger_Reconciliation2.Click_Ledger_Reconciliation_3();
//    
//
//    TestModellerLogger.SetLastNodeGuid("a40112ac-ceca-4485-9a53-7ce64043f539");
//    _Ledger_Reconciliation2.Select_AccountType_4__8("Customer");
//    
//
//    TestModellerLogger.SetLastNodeGuid("0c690154-2fcd-4c8e-ae48-7ddbebb785ab");
//    _Ledger_Reconciliation2.Select_Account_5__9("No Available Accounts to Reconcile");
//    
//
//    TestModellerLogger.SetLastNodeGuid("94e09692-250a-4696-acf0-8f65e335505b");
//    _Ledger_Reconciliation2.Click_Reconcile_All_6();
//    
//
//    TestModellerLogger.SetLastNodeGuid("76e9cd84-1d64-4dd3-bbdd-f043aa917f68");
//    _Ledger_Reconciliation2.Click_View_Reconciled_7();
//    
//
//    TestModellerLogger.SetLastNodeGuid("02394ba8-e51a-483d-a7f6-63c3be685403");
//    _Ledger_Reconciliation2.Select_AccountType_4__8("Creditors due after one year");
//    
//
//    TestModellerLogger.SetLastNodeGuid("edfac3dd-25bc-4f57-98ba-614554f63c52");
//    _Ledger_Reconciliation2.Select_Account_5__9("No Available Accounts to Reconcile");
//    
//
//    TestModellerLogger.SetLastNodeGuid("4f11b6bd-18d8-4cac-935c-f1d6b2c3a47b");
//    _Ledger_Reconciliation2.Select_Months_10("Yearly");
//    
//
//    TestModellerLogger.SetLastNodeGuid("70d4f520-5d26-4d6d-930a-9e28f6b9c068");
//    _Ledger_Reconciliation2.Enter_DateFrom_11("44487");
//    
//
//    TestModellerLogger.SetLastNodeGuid("dd2e997b-64af-4971-b4e7-3de0747bdefc");
//    _Ledger_Reconciliation2.Enter_DateTo_12("2021-04-13 10:40:40");
//    
//
//    TestModellerLogger.SetLastNodeGuid("bd3772d2-8362-4883-88d5-d41840bb15f4");
//    _Ledger_Reconciliation2.Click_Undo_Reconcile_13();
//    
//
//    }
//
//    @Test  (groups= {"Test_Ladger_Recon","Test_Ladger_Recon - Default Profile"})
//    @TestModellerPath(guid = "cbe0cd84-352e-49d4-9622-420dcaa224b6")
//    public void GoToUrlClickView2ClickLedgerReconciliation3PositiveSelectAccountType48PositiveSelectAccount59C2()
//    {
//        
//        pages.Ledger_Reconciliation2 _Ledger_Reconciliation2 = new pages.Ledger_Reconciliation2(driver);
//    TestModellerLogger.SetLastNodeGuid("0d7f3efc-1d9e-4c1d-82a1-54adf0eed4d4");
//    _Ledger_Reconciliation2.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("3bbba1f2-1686-481c-904c-293f9e258faa");
//    _Ledger_Reconciliation2.Click_View_2();
//    
//
//    TestModellerLogger.SetLastNodeGuid("ceeb3185-e7d3-4c4f-963c-3dca1344a8e1");
//    _Ledger_Reconciliation2.Click_Ledger_Reconciliation_3();
//    
//
//    TestModellerLogger.SetLastNodeGuid("a40112ac-ceca-4485-9a53-7ce64043f539");
//    _Ledger_Reconciliation2.Select_AccountType_4__8("Creditors due after one year");
//    
//
//    TestModellerLogger.SetLastNodeGuid("0c690154-2fcd-4c8e-ae48-7ddbebb785ab");
//    _Ledger_Reconciliation2.Select_Account_5__9("No Available Accounts to Reconcile");
//    
//
//    TestModellerLogger.SetLastNodeGuid("94e09692-250a-4696-acf0-8f65e335505b");
//    _Ledger_Reconciliation2.Click_Reconcile_All_6();
//    
//
//    TestModellerLogger.SetLastNodeGuid("76e9cd84-1d64-4dd3-bbdd-f043aa917f68");
//    _Ledger_Reconciliation2.Click_View_Reconciled_7();
//    
//
//    TestModellerLogger.SetLastNodeGuid("02394ba8-e51a-483d-a7f6-63c3be685403");
//    _Ledger_Reconciliation2.Select_AccountType_4__8("Creditors due after one year");
//    
//
//    TestModellerLogger.SetLastNodeGuid("edfac3dd-25bc-4f57-98ba-614554f63c52");
//    _Ledger_Reconciliation2.Select_Account_5__9("No Available Accounts to Reconcile");
//    
//
//    TestModellerLogger.SetLastNodeGuid("4f11b6bd-18d8-4cac-935c-f1d6b2c3a47b");
//    _Ledger_Reconciliation2.Select_Months_10("Yearly");
//    
//
//    TestModellerLogger.SetLastNodeGuid("70d4f520-5d26-4d6d-930a-9e28f6b9c068");
//    _Ledger_Reconciliation2.Enter_DateFrom_11("44487");
//    
//
//    TestModellerLogger.SetLastNodeGuid("dd2e997b-64af-4971-b4e7-3de0747bdefc");
//    _Ledger_Reconciliation2.Enter_DateTo_12("44487");
//    
//
//    TestModellerLogger.SetLastNodeGuid("bd3772d2-8362-4883-88d5-d41840bb15f4");
//    _Ledger_Reconciliation2.Click_Undo_Reconcile_13();
//    
//
//    }
//
//    @Test  (groups= {"Test_Ladger_Recon","Test_Ladger_Recon - Default Profile"})
//    @TestModellerPath(guid = "633fbdb0-da9d-4bec-aa02-4824f4d2f031")
//    public void GoToUrlClickView2ClickLedgerReconciliation3PositiveSelectAccountType48PositiveSelectAccount59C3()
//    {
//        
//        pages.Ledger_Reconciliation2 _Ledger_Reconciliation2 = new pages.Ledger_Reconciliation2(driver);
//    TestModellerLogger.SetLastNodeGuid("0d7f3efc-1d9e-4c1d-82a1-54adf0eed4d4");
//    _Ledger_Reconciliation2.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("3bbba1f2-1686-481c-904c-293f9e258faa");
//    _Ledger_Reconciliation2.Click_View_2();
//    
//
//    TestModellerLogger.SetLastNodeGuid("ceeb3185-e7d3-4c4f-963c-3dca1344a8e1");
//    _Ledger_Reconciliation2.Click_Ledger_Reconciliation_3();
//    
//
//    TestModellerLogger.SetLastNodeGuid("a40112ac-ceca-4485-9a53-7ce64043f539");
//    _Ledger_Reconciliation2.Select_AccountType_4__8("Person");
//    
//
//    TestModellerLogger.SetLastNodeGuid("0c690154-2fcd-4c8e-ae48-7ddbebb785ab");
//    _Ledger_Reconciliation2.Select_Account_5__9("No Available Accounts to Reconcile");
//    
//
//    TestModellerLogger.SetLastNodeGuid("94e09692-250a-4696-acf0-8f65e335505b");
//    _Ledger_Reconciliation2.Click_Reconcile_All_6();
//    
//
//    TestModellerLogger.SetLastNodeGuid("76e9cd84-1d64-4dd3-bbdd-f043aa917f68");
//    _Ledger_Reconciliation2.Click_View_Reconciled_7();
//    
//
//    TestModellerLogger.SetLastNodeGuid("02394ba8-e51a-483d-a7f6-63c3be685403");
//    _Ledger_Reconciliation2.Select_AccountType_4__8("Creditors due after one year");
//    
//
//    TestModellerLogger.SetLastNodeGuid("edfac3dd-25bc-4f57-98ba-614554f63c52");
//    _Ledger_Reconciliation2.Select_Account_5__9("No Available Accounts to Reconcile");
//    
//
//    TestModellerLogger.SetLastNodeGuid("4f11b6bd-18d8-4cac-935c-f1d6b2c3a47b");
//    _Ledger_Reconciliation2.Select_Months_10("Yearly");
//    
//
//    TestModellerLogger.SetLastNodeGuid("70d4f520-5d26-4d6d-930a-9e28f6b9c068");
//    _Ledger_Reconciliation2.Enter_DateFrom_11("2021-09-25 16:33:27");
//    
//
//    TestModellerLogger.SetLastNodeGuid("dd2e997b-64af-4971-b4e7-3de0747bdefc");
//    _Ledger_Reconciliation2.Enter_DateTo_12("2021-11-08 16:14:38");
//    
//
//    TestModellerLogger.SetLastNodeGuid("bd3772d2-8362-4883-88d5-d41840bb15f4");
//    _Ledger_Reconciliation2.Click_Undo_Reconcile_13();
//    
//
//    }
//
//    @Test  (groups= {"Test_Ladger_Recon","Test_Ladger_Recon - Default Profile"})
//    @TestModellerPath(guid = "052ee9b9-c3c8-4f7e-93f0-cbd399e8d67d")
//    public void GoToUrlClickView2ClickLedgerReconciliation3PositiveSelectAccountType48PositiveSelectAccount59C4()
//    {
//        
//        pages.Ledger_Reconciliation2 _Ledger_Reconciliation2 = new pages.Ledger_Reconciliation2(driver);
//    TestModellerLogger.SetLastNodeGuid("0d7f3efc-1d9e-4c1d-82a1-54adf0eed4d4");
//    _Ledger_Reconciliation2.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("3bbba1f2-1686-481c-904c-293f9e258faa");
//    _Ledger_Reconciliation2.Click_View_2();
//    
//
//    TestModellerLogger.SetLastNodeGuid("ceeb3185-e7d3-4c4f-963c-3dca1344a8e1");
//    _Ledger_Reconciliation2.Click_Ledger_Reconciliation_3();
//    
//
//    TestModellerLogger.SetLastNodeGuid("a40112ac-ceca-4485-9a53-7ce64043f539");
//    _Ledger_Reconciliation2.Select_AccountType_4__8("Supplier");
//    
//
//    TestModellerLogger.SetLastNodeGuid("0c690154-2fcd-4c8e-ae48-7ddbebb785ab");
//    _Ledger_Reconciliation2.Select_Account_5__9("No Available Accounts to Reconcile");
//    
//
//    TestModellerLogger.SetLastNodeGuid("94e09692-250a-4696-acf0-8f65e335505b");
//    _Ledger_Reconciliation2.Click_Reconcile_All_6();
//    
//
//    TestModellerLogger.SetLastNodeGuid("76e9cd84-1d64-4dd3-bbdd-f043aa917f68");
//    _Ledger_Reconciliation2.Click_View_Reconciled_7();
//    
//
//    TestModellerLogger.SetLastNodeGuid("02394ba8-e51a-483d-a7f6-63c3be685403");
//    _Ledger_Reconciliation2.Select_AccountType_4__8("Creditors due after one year");
//    
//
//    TestModellerLogger.SetLastNodeGuid("edfac3dd-25bc-4f57-98ba-614554f63c52");
//    _Ledger_Reconciliation2.Select_Account_5__9("No Available Accounts to Reconcile");
//    
//
//    TestModellerLogger.SetLastNodeGuid("4f11b6bd-18d8-4cac-935c-f1d6b2c3a47b");
//    _Ledger_Reconciliation2.Select_Months_10("Yearly");
//    
//
//    TestModellerLogger.SetLastNodeGuid("70d4f520-5d26-4d6d-930a-9e28f6b9c068");
//    _Ledger_Reconciliation2.Enter_DateFrom_11("2022-07-07 15:33:10");
//    
//
//    TestModellerLogger.SetLastNodeGuid("dd2e997b-64af-4971-b4e7-3de0747bdefc");
//    _Ledger_Reconciliation2.Enter_DateTo_12("2022-01-24 16:49:44");
//    
//
//    TestModellerLogger.SetLastNodeGuid("bd3772d2-8362-4883-88d5-d41840bb15f4");
//    _Ledger_Reconciliation2.Click_Undo_Reconcile_13();
//    
//
//    }
//
//    @Test  (groups= {"Test_Ladger_Recon","Test_Ladger_Recon - Default Profile"})
//    @TestModellerPath(guid = "91358a85-c51f-49e3-972d-b7152c182012")
//    public void GoToUrlClickView2ClickLedgerReconciliation3PositiveSelectAccountType48PositiveSelectAccount59C5()
//    {
//        
//        pages.Ledger_Reconciliation2 _Ledger_Reconciliation2 = new pages.Ledger_Reconciliation2(driver);
//    TestModellerLogger.SetLastNodeGuid("0d7f3efc-1d9e-4c1d-82a1-54adf0eed4d4");
//    _Ledger_Reconciliation2.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("3bbba1f2-1686-481c-904c-293f9e258faa");
//    _Ledger_Reconciliation2.Click_View_2();
//    
//
//    TestModellerLogger.SetLastNodeGuid("ceeb3185-e7d3-4c4f-963c-3dca1344a8e1");
//    _Ledger_Reconciliation2.Click_Ledger_Reconciliation_3();
//    
//
//    TestModellerLogger.SetLastNodeGuid("a40112ac-ceca-4485-9a53-7ce64043f539");
//    _Ledger_Reconciliation2.Select_AccountType_4__8("Employee");
//    
//
//    TestModellerLogger.SetLastNodeGuid("0c690154-2fcd-4c8e-ae48-7ddbebb785ab");
//    _Ledger_Reconciliation2.Select_Account_5__9("No Available Accounts to Reconcile");
//    
//
//    TestModellerLogger.SetLastNodeGuid("94e09692-250a-4696-acf0-8f65e335505b");
//    _Ledger_Reconciliation2.Click_Reconcile_All_6();
//    
//
//    TestModellerLogger.SetLastNodeGuid("76e9cd84-1d64-4dd3-bbdd-f043aa917f68");
//    _Ledger_Reconciliation2.Click_View_Reconciled_7();
//    
//
//    TestModellerLogger.SetLastNodeGuid("02394ba8-e51a-483d-a7f6-63c3be685403");
//    _Ledger_Reconciliation2.Select_AccountType_4__8("Creditors due after one year");
//    
//
//    TestModellerLogger.SetLastNodeGuid("edfac3dd-25bc-4f57-98ba-614554f63c52");
//    _Ledger_Reconciliation2.Select_Account_5__9("No Available Accounts to Reconcile");
//    
//
//    TestModellerLogger.SetLastNodeGuid("4f11b6bd-18d8-4cac-935c-f1d6b2c3a47b");
//    _Ledger_Reconciliation2.Select_Months_10("December");
//    
//
//    TestModellerLogger.SetLastNodeGuid("70d4f520-5d26-4d6d-930a-9e28f6b9c068");
//    _Ledger_Reconciliation2.Enter_DateFrom_11("44487");
//    
//
//    TestModellerLogger.SetLastNodeGuid("dd2e997b-64af-4971-b4e7-3de0747bdefc");
//    _Ledger_Reconciliation2.Enter_DateTo_12("2022-10-11 03:46:46");
//    
//
//    TestModellerLogger.SetLastNodeGuid("bd3772d2-8362-4883-88d5-d41840bb15f4");
//    _Ledger_Reconciliation2.Click_Undo_Reconcile_13();
//    
//
//    }
//
//    @Test  (groups= {"Test_Ladger_Recon","Test_Ladger_Recon - Default Profile"})
//    @TestModellerPath(guid = "60195d98-38cb-4738-96bd-7f6badf8354b")
//    public void GoToUrlClickView2ClickLedgerReconciliation3PositiveSelectAccountType48PositiveSelectAccount59C6()
//    {
//        
//        pages.Ledger_Reconciliation2 _Ledger_Reconciliation2 = new pages.Ledger_Reconciliation2(driver);
//    TestModellerLogger.SetLastNodeGuid("0d7f3efc-1d9e-4c1d-82a1-54adf0eed4d4");
//    _Ledger_Reconciliation2.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("3bbba1f2-1686-481c-904c-293f9e258faa");
//    _Ledger_Reconciliation2.Click_View_2();
//    
//
//    TestModellerLogger.SetLastNodeGuid("ceeb3185-e7d3-4c4f-963c-3dca1344a8e1");
//    _Ledger_Reconciliation2.Click_Ledger_Reconciliation_3();
//    
//
//    TestModellerLogger.SetLastNodeGuid("a40112ac-ceca-4485-9a53-7ce64043f539");
//    _Ledger_Reconciliation2.Select_AccountType_4__8("Director");
//    
//
//    TestModellerLogger.SetLastNodeGuid("0c690154-2fcd-4c8e-ae48-7ddbebb785ab");
//    _Ledger_Reconciliation2.Select_Account_5__9("No Available Accounts to Reconcile");
//    
//
//    TestModellerLogger.SetLastNodeGuid("94e09692-250a-4696-acf0-8f65e335505b");
//    _Ledger_Reconciliation2.Click_Reconcile_All_6();
//    
//
//    TestModellerLogger.SetLastNodeGuid("76e9cd84-1d64-4dd3-bbdd-f043aa917f68");
//    _Ledger_Reconciliation2.Click_View_Reconciled_7();
//    
//
//    TestModellerLogger.SetLastNodeGuid("02394ba8-e51a-483d-a7f6-63c3be685403");
//    _Ledger_Reconciliation2.Select_AccountType_4__8("Creditors due after one year");
//    
//
//    TestModellerLogger.SetLastNodeGuid("edfac3dd-25bc-4f57-98ba-614554f63c52");
//    _Ledger_Reconciliation2.Select_Account_5__9("No Available Accounts to Reconcile");
//    
//
//    TestModellerLogger.SetLastNodeGuid("4f11b6bd-18d8-4cac-935c-f1d6b2c3a47b");
//    _Ledger_Reconciliation2.Select_Months_10("October");
//    
//
//    TestModellerLogger.SetLastNodeGuid("70d4f520-5d26-4d6d-930a-9e28f6b9c068");
//    _Ledger_Reconciliation2.Enter_DateFrom_11("44487");
//    
//
//    TestModellerLogger.SetLastNodeGuid("dd2e997b-64af-4971-b4e7-3de0747bdefc");
//    _Ledger_Reconciliation2.Enter_DateTo_12("2022-04-06 00:35:52");
//    
//
//    TestModellerLogger.SetLastNodeGuid("bd3772d2-8362-4883-88d5-d41840bb15f4");
//    _Ledger_Reconciliation2.Click_Undo_Reconcile_13();
//    
//
//    }
//
//    @Test  (groups= {"Test_Ladger_Recon","Test_Ladger_Recon - Default Profile"})
//    @TestModellerPath(guid = "6e51675c-96f7-47ca-a145-6d0b876cca81")
//    public void GoToUrlClickView2ClickLedgerReconciliation3PositiveSelectAccountType48PositiveSelectAccount59C7()
//    {
//        
//        pages.Ledger_Reconciliation2 _Ledger_Reconciliation2 = new pages.Ledger_Reconciliation2(driver);
//    TestModellerLogger.SetLastNodeGuid("0d7f3efc-1d9e-4c1d-82a1-54adf0eed4d4");
//    _Ledger_Reconciliation2.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("3bbba1f2-1686-481c-904c-293f9e258faa");
//    _Ledger_Reconciliation2.Click_View_2();
//    
//
//    TestModellerLogger.SetLastNodeGuid("ceeb3185-e7d3-4c4f-963c-3dca1344a8e1");
//    _Ledger_Reconciliation2.Click_Ledger_Reconciliation_3();
//    
//
//    TestModellerLogger.SetLastNodeGuid("a40112ac-ceca-4485-9a53-7ce64043f539");
//    _Ledger_Reconciliation2.Select_AccountType_4__8("Taxation");
//    
//
//    TestModellerLogger.SetLastNodeGuid("0c690154-2fcd-4c8e-ae48-7ddbebb785ab");
//    _Ledger_Reconciliation2.Select_Account_5__9("No Available Accounts to Reconcile");
//    
//
//    TestModellerLogger.SetLastNodeGuid("94e09692-250a-4696-acf0-8f65e335505b");
//    _Ledger_Reconciliation2.Click_Reconcile_All_6();
//    
//
//    TestModellerLogger.SetLastNodeGuid("76e9cd84-1d64-4dd3-bbdd-f043aa917f68");
//    _Ledger_Reconciliation2.Click_View_Reconciled_7();
//    
//
//    TestModellerLogger.SetLastNodeGuid("02394ba8-e51a-483d-a7f6-63c3be685403");
//    _Ledger_Reconciliation2.Select_AccountType_4__8("Creditors due after one year");
//    
//
//    TestModellerLogger.SetLastNodeGuid("edfac3dd-25bc-4f57-98ba-614554f63c52");
//    _Ledger_Reconciliation2.Select_Account_5__9("No Available Accounts to Reconcile");
//    
//
//    TestModellerLogger.SetLastNodeGuid("4f11b6bd-18d8-4cac-935c-f1d6b2c3a47b");
//    _Ledger_Reconciliation2.Select_Months_10("February");
//    
//
//    TestModellerLogger.SetLastNodeGuid("70d4f520-5d26-4d6d-930a-9e28f6b9c068");
//    _Ledger_Reconciliation2.Enter_DateFrom_11("44487");
//    
//
//    TestModellerLogger.SetLastNodeGuid("dd2e997b-64af-4971-b4e7-3de0747bdefc");
//    _Ledger_Reconciliation2.Enter_DateTo_12("2021-10-30 20:02:52");
//    
//
//    TestModellerLogger.SetLastNodeGuid("bd3772d2-8362-4883-88d5-d41840bb15f4");
//    _Ledger_Reconciliation2.Click_Undo_Reconcile_13();
//    
//
//    }
//
//    @Test  (groups= {"Test_Ladger_Recon","Test_Ladger_Recon - Default Profile"})
//    @TestModellerPath(guid = "9c05f9e0-250f-41ba-8049-43aafa887aeb")
//    public void GoToUrlClickView2ClickLedgerReconciliation3PositiveSelectAccountType48PositiveSelectAccount59C8()
//    {
//        
//        pages.Ledger_Reconciliation2 _Ledger_Reconciliation2 = new pages.Ledger_Reconciliation2(driver);
//    TestModellerLogger.SetLastNodeGuid("0d7f3efc-1d9e-4c1d-82a1-54adf0eed4d4");
//    _Ledger_Reconciliation2.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("3bbba1f2-1686-481c-904c-293f9e258faa");
//    _Ledger_Reconciliation2.Click_View_2();
//    
//
//    TestModellerLogger.SetLastNodeGuid("ceeb3185-e7d3-4c4f-963c-3dca1344a8e1");
//    _Ledger_Reconciliation2.Click_Ledger_Reconciliation_3();
//    
//
//    TestModellerLogger.SetLastNodeGuid("a40112ac-ceca-4485-9a53-7ce64043f539");
//    _Ledger_Reconciliation2.Select_AccountType_4__8("Debtor");
//    
//
//    TestModellerLogger.SetLastNodeGuid("0c690154-2fcd-4c8e-ae48-7ddbebb785ab");
//    _Ledger_Reconciliation2.Select_Account_5__9("No Available Accounts to Reconcile");
//    
//
//    TestModellerLogger.SetLastNodeGuid("94e09692-250a-4696-acf0-8f65e335505b");
//    _Ledger_Reconciliation2.Click_Reconcile_All_6();
//    
//
//    TestModellerLogger.SetLastNodeGuid("76e9cd84-1d64-4dd3-bbdd-f043aa917f68");
//    _Ledger_Reconciliation2.Click_View_Reconciled_7();
//    
//
//    TestModellerLogger.SetLastNodeGuid("02394ba8-e51a-483d-a7f6-63c3be685403");
//    _Ledger_Reconciliation2.Select_AccountType_4__8("Creditors due after one year");
//    
//
//    TestModellerLogger.SetLastNodeGuid("edfac3dd-25bc-4f57-98ba-614554f63c52");
//    _Ledger_Reconciliation2.Select_Account_5__9("No Available Accounts to Reconcile");
//    
//
//    TestModellerLogger.SetLastNodeGuid("4f11b6bd-18d8-4cac-935c-f1d6b2c3a47b");
//    _Ledger_Reconciliation2.Select_Months_10("July");
//    
//
//    TestModellerLogger.SetLastNodeGuid("70d4f520-5d26-4d6d-930a-9e28f6b9c068");
//    _Ledger_Reconciliation2.Enter_DateFrom_11("44487");
//    
//
//    TestModellerLogger.SetLastNodeGuid("dd2e997b-64af-4971-b4e7-3de0747bdefc");
//    _Ledger_Reconciliation2.Enter_DateTo_12("2022-07-27 14:16:28");
//    
//
//    TestModellerLogger.SetLastNodeGuid("bd3772d2-8362-4883-88d5-d41840bb15f4");
//    _Ledger_Reconciliation2.Click_Undo_Reconcile_13();
//    
//
//    }
//
//    @Test  (groups= {"Test_Ladger_Recon","Test_Ladger_Recon - Default Profile"})
//    @TestModellerPath(guid = "427408a8-2c3d-4919-94e5-cd1100063f5a")
//    public void GoToUrlClickView2ClickLedgerReconciliation3PositiveSelectAccountType48PositiveSelectAccount59()
//    {
//        
//        pages.Ledger_Reconciliation2 _Ledger_Reconciliation2 = new pages.Ledger_Reconciliation2(driver);
//    TestModellerLogger.SetLastNodeGuid("0d7f3efc-1d9e-4c1d-82a1-54adf0eed4d4");
//    _Ledger_Reconciliation2.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("3bbba1f2-1686-481c-904c-293f9e258faa");
//    _Ledger_Reconciliation2.Click_View_2();
//    
//
//    TestModellerLogger.SetLastNodeGuid("ceeb3185-e7d3-4c4f-963c-3dca1344a8e1");
//    _Ledger_Reconciliation2.Click_Ledger_Reconciliation_3();
//    
//
//    TestModellerLogger.SetLastNodeGuid("a40112ac-ceca-4485-9a53-7ce64043f539");
//    _Ledger_Reconciliation2.Select_AccountType_4__8("Creditors due within one year");
//    
//
//    TestModellerLogger.SetLastNodeGuid("0c690154-2fcd-4c8e-ae48-7ddbebb785ab");
//    _Ledger_Reconciliation2.Select_Account_5__9("No Available Accounts to Reconcile");
//    
//
//    TestModellerLogger.SetLastNodeGuid("94e09692-250a-4696-acf0-8f65e335505b");
//    _Ledger_Reconciliation2.Click_Reconcile_All_6();
//    
//
//    TestModellerLogger.SetLastNodeGuid("76e9cd84-1d64-4dd3-bbdd-f043aa917f68");
//    _Ledger_Reconciliation2.Click_View_Reconciled_7();
//    
//
//    TestModellerLogger.SetLastNodeGuid("02394ba8-e51a-483d-a7f6-63c3be685403");
//    _Ledger_Reconciliation2.Select_AccountType_4__8("Creditors due after one year");
//    
//
//    TestModellerLogger.SetLastNodeGuid("edfac3dd-25bc-4f57-98ba-614554f63c52");
//    _Ledger_Reconciliation2.Select_Account_5__9("No Available Accounts to Reconcile");
//    
//
//    TestModellerLogger.SetLastNodeGuid("4f11b6bd-18d8-4cac-935c-f1d6b2c3a47b");
//    _Ledger_Reconciliation2.Select_Months_10("May");
//    
//
//    TestModellerLogger.SetLastNodeGuid("70d4f520-5d26-4d6d-930a-9e28f6b9c068");
//    _Ledger_Reconciliation2.Enter_DateFrom_11("44487");
//    
//
//    TestModellerLogger.SetLastNodeGuid("dd2e997b-64af-4971-b4e7-3de0747bdefc");
//    _Ledger_Reconciliation2.Enter_DateTo_12("2022-05-01 19:54:28");
//    
//
//    TestModellerLogger.SetLastNodeGuid("bd3772d2-8362-4883-88d5-d41840bb15f4");
//    _Ledger_Reconciliation2.Click_Undo_Reconcile_13();
//    
//
//    }
//
//    @Test  (groups= {"Test_Ladger_Recon","Test_Ladger_Recon - Default Profile"})
//    @TestModellerPath(guid = "51da1f8b-6770-40b9-a357-97186796b5c4")
//    public void GoToUrlClickView2ClickLedgerReconciliation3PositiveSelectAccountType48PositiveSelectAccount591()
//    {
//        
//        pages.Ledger_Reconciliation2 _Ledger_Reconciliation2 = new pages.Ledger_Reconciliation2(driver);
//    TestModellerLogger.SetLastNodeGuid("0d7f3efc-1d9e-4c1d-82a1-54adf0eed4d4");
//    _Ledger_Reconciliation2.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("3bbba1f2-1686-481c-904c-293f9e258faa");
//    _Ledger_Reconciliation2.Click_View_2();
//    
//
//    TestModellerLogger.SetLastNodeGuid("ceeb3185-e7d3-4c4f-963c-3dca1344a8e1");
//    _Ledger_Reconciliation2.Click_Ledger_Reconciliation_3();
//    
//
//    TestModellerLogger.SetLastNodeGuid("a40112ac-ceca-4485-9a53-7ce64043f539");
//    _Ledger_Reconciliation2.Select_AccountType_4__8("Provisions for liabilities");
//    
//
//    TestModellerLogger.SetLastNodeGuid("0c690154-2fcd-4c8e-ae48-7ddbebb785ab");
//    _Ledger_Reconciliation2.Select_Account_5__9("No Available Accounts to Reconcile");
//    
//
//    TestModellerLogger.SetLastNodeGuid("94e09692-250a-4696-acf0-8f65e335505b");
//    _Ledger_Reconciliation2.Click_Reconcile_All_6();
//    
//
//    TestModellerLogger.SetLastNodeGuid("76e9cd84-1d64-4dd3-bbdd-f043aa917f68");
//    _Ledger_Reconciliation2.Click_View_Reconciled_7();
//    
//
//    TestModellerLogger.SetLastNodeGuid("02394ba8-e51a-483d-a7f6-63c3be685403");
//    _Ledger_Reconciliation2.Select_AccountType_4__8("Person");
//    
//
//    TestModellerLogger.SetLastNodeGuid("edfac3dd-25bc-4f57-98ba-614554f63c52");
//    _Ledger_Reconciliation2.Select_Account_5__9("No Available Accounts to Reconcile");
//    
//
//    TestModellerLogger.SetLastNodeGuid("4f11b6bd-18d8-4cac-935c-f1d6b2c3a47b");
//    _Ledger_Reconciliation2.Select_Months_10("September");
//    
//
//    TestModellerLogger.SetLastNodeGuid("70d4f520-5d26-4d6d-930a-9e28f6b9c068");
//    _Ledger_Reconciliation2.Enter_DateFrom_11("44487");
//    
//
//    TestModellerLogger.SetLastNodeGuid("dd2e997b-64af-4971-b4e7-3de0747bdefc");
//    _Ledger_Reconciliation2.Enter_DateTo_12("2022-08-23 10:38:21");
//    
//
//    TestModellerLogger.SetLastNodeGuid("bd3772d2-8362-4883-88d5-d41840bb15f4");
//    _Ledger_Reconciliation2.Click_Undo_Reconcile_13();
//    
//
//    }
//
//    @Test  (groups= {"Test_Ladger_Recon","Test_Ladger_Recon - Default Profile"})
//    @TestModellerPath(guid = "6bc1bc6f-1887-4696-b934-3784b492399a")
//    public void GoToUrlClickView2ClickLedgerReconciliation3PositiveSelectAccountType48PositiveSelectAccount592()
//    {
//        
//        pages.Ledger_Reconciliation2 _Ledger_Reconciliation2 = new pages.Ledger_Reconciliation2(driver);
//    TestModellerLogger.SetLastNodeGuid("0d7f3efc-1d9e-4c1d-82a1-54adf0eed4d4");
//    _Ledger_Reconciliation2.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("3bbba1f2-1686-481c-904c-293f9e258faa");
//    _Ledger_Reconciliation2.Click_View_2();
//    
//
//    TestModellerLogger.SetLastNodeGuid("ceeb3185-e7d3-4c4f-963c-3dca1344a8e1");
//    _Ledger_Reconciliation2.Click_Ledger_Reconciliation_3();
//    
//
//    TestModellerLogger.SetLastNodeGuid("a40112ac-ceca-4485-9a53-7ce64043f539");
//    _Ledger_Reconciliation2.Select_AccountType_4__8("Provisions for liabilities");
//    
//
//    TestModellerLogger.SetLastNodeGuid("0c690154-2fcd-4c8e-ae48-7ddbebb785ab");
//    _Ledger_Reconciliation2.Select_Account_5__9("No Available Accounts to Reconcile");
//    
//
//    TestModellerLogger.SetLastNodeGuid("94e09692-250a-4696-acf0-8f65e335505b");
//    _Ledger_Reconciliation2.Click_Reconcile_All_6();
//    
//
//    TestModellerLogger.SetLastNodeGuid("76e9cd84-1d64-4dd3-bbdd-f043aa917f68");
//    _Ledger_Reconciliation2.Click_View_Reconciled_7();
//    
//
//    TestModellerLogger.SetLastNodeGuid("02394ba8-e51a-483d-a7f6-63c3be685403");
//    _Ledger_Reconciliation2.Select_AccountType_4__8("Debtor");
//    
//
//    TestModellerLogger.SetLastNodeGuid("edfac3dd-25bc-4f57-98ba-614554f63c52");
//    _Ledger_Reconciliation2.Select_Account_5__9("No Available Accounts to Reconcile");
//    
//
//    TestModellerLogger.SetLastNodeGuid("4f11b6bd-18d8-4cac-935c-f1d6b2c3a47b");
//    _Ledger_Reconciliation2.Select_Months_10("November");
//    
//
//    TestModellerLogger.SetLastNodeGuid("70d4f520-5d26-4d6d-930a-9e28f6b9c068");
//    _Ledger_Reconciliation2.Enter_DateFrom_11("44487");
//    
//
//    TestModellerLogger.SetLastNodeGuid("dd2e997b-64af-4971-b4e7-3de0747bdefc");
//    _Ledger_Reconciliation2.Enter_DateTo_12("2022-06-01 17:40:50");
//    
//
//    TestModellerLogger.SetLastNodeGuid("bd3772d2-8362-4883-88d5-d41840bb15f4");
//    _Ledger_Reconciliation2.Click_Undo_Reconcile_13();
//    
//
//    }
//
//    @Test  (groups= {"Test_Ladger_Recon","Test_Ladger_Recon - Default Profile"})
//    @TestModellerPath(guid = "a39fbdbb-dfc3-4272-8733-27b143081fc0")
//    public void GoToUrlClickView2ClickLedgerReconciliation3PositiveSelectAccountType48PositiveSelectAccount593()
//    {
//        
//        pages.Ledger_Reconciliation2 _Ledger_Reconciliation2 = new pages.Ledger_Reconciliation2(driver);
//    TestModellerLogger.SetLastNodeGuid("0d7f3efc-1d9e-4c1d-82a1-54adf0eed4d4");
//    _Ledger_Reconciliation2.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("3bbba1f2-1686-481c-904c-293f9e258faa");
//    _Ledger_Reconciliation2.Click_View_2();
//    
//
//    TestModellerLogger.SetLastNodeGuid("ceeb3185-e7d3-4c4f-963c-3dca1344a8e1");
//    _Ledger_Reconciliation2.Click_Ledger_Reconciliation_3();
//    
//
//    TestModellerLogger.SetLastNodeGuid("a40112ac-ceca-4485-9a53-7ce64043f539");
//    _Ledger_Reconciliation2.Select_AccountType_4__8("Provisions for liabilities");
//    
//
//    TestModellerLogger.SetLastNodeGuid("0c690154-2fcd-4c8e-ae48-7ddbebb785ab");
//    _Ledger_Reconciliation2.Select_Account_5__9("No Available Accounts to Reconcile");
//    
//
//    TestModellerLogger.SetLastNodeGuid("94e09692-250a-4696-acf0-8f65e335505b");
//    _Ledger_Reconciliation2.Click_Reconcile_All_6();
//    
//
//    TestModellerLogger.SetLastNodeGuid("76e9cd84-1d64-4dd3-bbdd-f043aa917f68");
//    _Ledger_Reconciliation2.Click_View_Reconciled_7();
//    
//
//    TestModellerLogger.SetLastNodeGuid("02394ba8-e51a-483d-a7f6-63c3be685403");
//    _Ledger_Reconciliation2.Select_AccountType_4__8("Director");
//    
//
//    TestModellerLogger.SetLastNodeGuid("edfac3dd-25bc-4f57-98ba-614554f63c52");
//    _Ledger_Reconciliation2.Select_Account_5__9("No Available Accounts to Reconcile");
//    
//
//    TestModellerLogger.SetLastNodeGuid("4f11b6bd-18d8-4cac-935c-f1d6b2c3a47b");
//    _Ledger_Reconciliation2.Select_Months_10("March");
//    
//
//    TestModellerLogger.SetLastNodeGuid("70d4f520-5d26-4d6d-930a-9e28f6b9c068");
//    _Ledger_Reconciliation2.Enter_DateFrom_11("44487");
//    
//
//    TestModellerLogger.SetLastNodeGuid("dd2e997b-64af-4971-b4e7-3de0747bdefc");
//    _Ledger_Reconciliation2.Enter_DateTo_12("2022-09-20 02:48:11");
//    
//
//    TestModellerLogger.SetLastNodeGuid("bd3772d2-8362-4883-88d5-d41840bb15f4");
//    _Ledger_Reconciliation2.Click_Undo_Reconcile_13();
//    
//
//    }
//
//    @Test  (groups= {"Test_Ladger_Recon","Test_Ladger_Recon - Default Profile"})
//    @TestModellerPath(guid = "d27c3c55-866a-48a6-8dc9-b358f007e6fc")
//    public void GoToUrlClickView2ClickLedgerReconciliation3PositiveSelectAccountType48PositiveSelectAccount594()
//    {
//        
//        pages.Ledger_Reconciliation2 _Ledger_Reconciliation2 = new pages.Ledger_Reconciliation2(driver);
//    TestModellerLogger.SetLastNodeGuid("0d7f3efc-1d9e-4c1d-82a1-54adf0eed4d4");
//    _Ledger_Reconciliation2.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("3bbba1f2-1686-481c-904c-293f9e258faa");
//    _Ledger_Reconciliation2.Click_View_2();
//    
//
//    TestModellerLogger.SetLastNodeGuid("ceeb3185-e7d3-4c4f-963c-3dca1344a8e1");
//    _Ledger_Reconciliation2.Click_Ledger_Reconciliation_3();
//    
//
//    TestModellerLogger.SetLastNodeGuid("a40112ac-ceca-4485-9a53-7ce64043f539");
//    _Ledger_Reconciliation2.Select_AccountType_4__8("Provisions for liabilities");
//    
//
//    TestModellerLogger.SetLastNodeGuid("0c690154-2fcd-4c8e-ae48-7ddbebb785ab");
//    _Ledger_Reconciliation2.Select_Account_5__9("No Available Accounts to Reconcile");
//    
//
//    TestModellerLogger.SetLastNodeGuid("94e09692-250a-4696-acf0-8f65e335505b");
//    _Ledger_Reconciliation2.Click_Reconcile_All_6();
//    
//
//    TestModellerLogger.SetLastNodeGuid("76e9cd84-1d64-4dd3-bbdd-f043aa917f68");
//    _Ledger_Reconciliation2.Click_View_Reconciled_7();
//    
//
//    TestModellerLogger.SetLastNodeGuid("02394ba8-e51a-483d-a7f6-63c3be685403");
//    _Ledger_Reconciliation2.Select_AccountType_4__8("Supplier");
//    
//
//    TestModellerLogger.SetLastNodeGuid("edfac3dd-25bc-4f57-98ba-614554f63c52");
//    _Ledger_Reconciliation2.Select_Account_5__9("No Available Accounts to Reconcile");
//    
//
//    TestModellerLogger.SetLastNodeGuid("4f11b6bd-18d8-4cac-935c-f1d6b2c3a47b");
//    _Ledger_Reconciliation2.Select_Months_10("August");
//    
//
//    TestModellerLogger.SetLastNodeGuid("70d4f520-5d26-4d6d-930a-9e28f6b9c068");
//    _Ledger_Reconciliation2.Enter_DateFrom_11("44487");
//    
//
//    TestModellerLogger.SetLastNodeGuid("dd2e997b-64af-4971-b4e7-3de0747bdefc");
//    _Ledger_Reconciliation2.Enter_DateTo_12("2021-10-28 05:55:42");
//    
//
//    TestModellerLogger.SetLastNodeGuid("bd3772d2-8362-4883-88d5-d41840bb15f4");
//    _Ledger_Reconciliation2.Click_Undo_Reconcile_13();
//    
//
//    }
//
//    @Test  (groups= {"Test_Ladger_Recon","Test_Ladger_Recon - Default Profile"})
//    @TestModellerPath(guid = "f16813aa-a538-499b-ada3-1594fb4bbe5f")
//    public void GoToUrlClickView2ClickLedgerReconciliation3PositiveSelectAccountType48PositiveSelectAccount595()
//    {
//        
//        pages.Ledger_Reconciliation2 _Ledger_Reconciliation2 = new pages.Ledger_Reconciliation2(driver);
//    TestModellerLogger.SetLastNodeGuid("0d7f3efc-1d9e-4c1d-82a1-54adf0eed4d4");
//    _Ledger_Reconciliation2.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("3bbba1f2-1686-481c-904c-293f9e258faa");
//    _Ledger_Reconciliation2.Click_View_2();
//    
//
//    TestModellerLogger.SetLastNodeGuid("ceeb3185-e7d3-4c4f-963c-3dca1344a8e1");
//    _Ledger_Reconciliation2.Click_Ledger_Reconciliation_3();
//    
//
//    TestModellerLogger.SetLastNodeGuid("a40112ac-ceca-4485-9a53-7ce64043f539");
//    _Ledger_Reconciliation2.Select_AccountType_4__8("Provisions for liabilities");
//    
//
//    TestModellerLogger.SetLastNodeGuid("0c690154-2fcd-4c8e-ae48-7ddbebb785ab");
//    _Ledger_Reconciliation2.Select_Account_5__9("No Available Accounts to Reconcile");
//    
//
//    TestModellerLogger.SetLastNodeGuid("94e09692-250a-4696-acf0-8f65e335505b");
//    _Ledger_Reconciliation2.Click_Reconcile_All_6();
//    
//
//    TestModellerLogger.SetLastNodeGuid("76e9cd84-1d64-4dd3-bbdd-f043aa917f68");
//    _Ledger_Reconciliation2.Click_View_Reconciled_7();
//    
//
//    TestModellerLogger.SetLastNodeGuid("02394ba8-e51a-483d-a7f6-63c3be685403");
//    _Ledger_Reconciliation2.Select_AccountType_4__8("Provisions for liabilities");
//    
//
//    TestModellerLogger.SetLastNodeGuid("edfac3dd-25bc-4f57-98ba-614554f63c52");
//    _Ledger_Reconciliation2.Select_Account_5__9("No Available Accounts to Reconcile");
//    
//
//    TestModellerLogger.SetLastNodeGuid("4f11b6bd-18d8-4cac-935c-f1d6b2c3a47b");
//    _Ledger_Reconciliation2.Select_Months_10("June");
//    
//
//    TestModellerLogger.SetLastNodeGuid("70d4f520-5d26-4d6d-930a-9e28f6b9c068");
//    _Ledger_Reconciliation2.Enter_DateFrom_11("44487");
//    
//
//    TestModellerLogger.SetLastNodeGuid("dd2e997b-64af-4971-b4e7-3de0747bdefc");
//    _Ledger_Reconciliation2.Enter_DateTo_12("2021-12-06 19:30:56");
//    
//
//    TestModellerLogger.SetLastNodeGuid("bd3772d2-8362-4883-88d5-d41840bb15f4");
//    _Ledger_Reconciliation2.Click_Undo_Reconcile_13();
//    
//
//    }
//
//    @Test  (groups= {"Test_Ladger_Recon","Test_Ladger_Recon - Default Profile"})
//    @TestModellerPath(guid = "84bd5e01-763b-46c6-b223-3d22fb7d165c")
//    public void GoToUrlClickView2ClickLedgerReconciliation3PositiveSelectAccountType48PositiveSelectAccount596()
//    {
//        
//        pages.Ledger_Reconciliation2 _Ledger_Reconciliation2 = new pages.Ledger_Reconciliation2(driver);
//    TestModellerLogger.SetLastNodeGuid("0d7f3efc-1d9e-4c1d-82a1-54adf0eed4d4");
//    _Ledger_Reconciliation2.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("3bbba1f2-1686-481c-904c-293f9e258faa");
//    _Ledger_Reconciliation2.Click_View_2();
//    
//
//    TestModellerLogger.SetLastNodeGuid("ceeb3185-e7d3-4c4f-963c-3dca1344a8e1");
//    _Ledger_Reconciliation2.Click_Ledger_Reconciliation_3();
//    
//
//    TestModellerLogger.SetLastNodeGuid("a40112ac-ceca-4485-9a53-7ce64043f539");
//    _Ledger_Reconciliation2.Select_AccountType_4__8("Provisions for liabilities");
//    
//
//    TestModellerLogger.SetLastNodeGuid("0c690154-2fcd-4c8e-ae48-7ddbebb785ab");
//    _Ledger_Reconciliation2.Select_Account_5__9("No Available Accounts to Reconcile");
//    
//
//    TestModellerLogger.SetLastNodeGuid("94e09692-250a-4696-acf0-8f65e335505b");
//    _Ledger_Reconciliation2.Click_Reconcile_All_6();
//    
//
//    TestModellerLogger.SetLastNodeGuid("76e9cd84-1d64-4dd3-bbdd-f043aa917f68");
//    _Ledger_Reconciliation2.Click_View_Reconciled_7();
//    
//
//    TestModellerLogger.SetLastNodeGuid("02394ba8-e51a-483d-a7f6-63c3be685403");
//    _Ledger_Reconciliation2.Select_AccountType_4__8("Creditors due within one year");
//    
//
//    TestModellerLogger.SetLastNodeGuid("edfac3dd-25bc-4f57-98ba-614554f63c52");
//    _Ledger_Reconciliation2.Select_Account_5__9("No Available Accounts to Reconcile");
//    
//
//    TestModellerLogger.SetLastNodeGuid("4f11b6bd-18d8-4cac-935c-f1d6b2c3a47b");
//    _Ledger_Reconciliation2.Select_Months_10("April");
//    
//
//    TestModellerLogger.SetLastNodeGuid("70d4f520-5d26-4d6d-930a-9e28f6b9c068");
//    _Ledger_Reconciliation2.Enter_DateFrom_11("44487");
//    
//
//    TestModellerLogger.SetLastNodeGuid("dd2e997b-64af-4971-b4e7-3de0747bdefc");
//    _Ledger_Reconciliation2.Enter_DateTo_12("2022-07-27 15:16:23");
//    
//
//    TestModellerLogger.SetLastNodeGuid("bd3772d2-8362-4883-88d5-d41840bb15f4");
//    _Ledger_Reconciliation2.Click_Undo_Reconcile_13();
//    
//
//    }
//
//    @Test  (groups= {"Test_Ladger_Recon","Test_Ladger_Recon - Default Profile"})
//    @TestModellerPath(guid = "e7d925e2-ac4d-44ee-9511-519b3449551f")
//    public void GoToUrlClickView2ClickLedgerReconciliation3PositiveSelectAccountType48PositiveSelectAccount597()
//    {
//        
//        pages.Ledger_Reconciliation2 _Ledger_Reconciliation2 = new pages.Ledger_Reconciliation2(driver);
//    TestModellerLogger.SetLastNodeGuid("0d7f3efc-1d9e-4c1d-82a1-54adf0eed4d4");
//    _Ledger_Reconciliation2.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("3bbba1f2-1686-481c-904c-293f9e258faa");
//    _Ledger_Reconciliation2.Click_View_2();
//    
//
//    TestModellerLogger.SetLastNodeGuid("ceeb3185-e7d3-4c4f-963c-3dca1344a8e1");
//    _Ledger_Reconciliation2.Click_Ledger_Reconciliation_3();
//    
//
//    TestModellerLogger.SetLastNodeGuid("a40112ac-ceca-4485-9a53-7ce64043f539");
//    _Ledger_Reconciliation2.Select_AccountType_4__8("Provisions for liabilities");
//    
//
//    TestModellerLogger.SetLastNodeGuid("0c690154-2fcd-4c8e-ae48-7ddbebb785ab");
//    _Ledger_Reconciliation2.Select_Account_5__9("No Available Accounts to Reconcile");
//    
//
//    TestModellerLogger.SetLastNodeGuid("94e09692-250a-4696-acf0-8f65e335505b");
//    _Ledger_Reconciliation2.Click_Reconcile_All_6();
//    
//
//    TestModellerLogger.SetLastNodeGuid("76e9cd84-1d64-4dd3-bbdd-f043aa917f68");
//    _Ledger_Reconciliation2.Click_View_Reconciled_7();
//    
//
//    TestModellerLogger.SetLastNodeGuid("02394ba8-e51a-483d-a7f6-63c3be685403");
//    _Ledger_Reconciliation2.Select_AccountType_4__8("Customer");
//    
//
//    TestModellerLogger.SetLastNodeGuid("edfac3dd-25bc-4f57-98ba-614554f63c52");
//    _Ledger_Reconciliation2.Select_Account_5__9("No Available Accounts to Reconcile");
//    
//
//    TestModellerLogger.SetLastNodeGuid("4f11b6bd-18d8-4cac-935c-f1d6b2c3a47b");
//    _Ledger_Reconciliation2.Select_Months_10("January");
//    
//
//    TestModellerLogger.SetLastNodeGuid("70d4f520-5d26-4d6d-930a-9e28f6b9c068");
//    _Ledger_Reconciliation2.Enter_DateFrom_11("44487");
//    
//
//    TestModellerLogger.SetLastNodeGuid("dd2e997b-64af-4971-b4e7-3de0747bdefc");
//    _Ledger_Reconciliation2.Enter_DateTo_12("2022-07-23 20:27:05");
//    
//
//    TestModellerLogger.SetLastNodeGuid("bd3772d2-8362-4883-88d5-d41840bb15f4");
//    _Ledger_Reconciliation2.Click_Undo_Reconcile_13();
//    
//
//    }
//
//    @Test  (groups= {"Test_Ladger_Recon","Test_Ladger_Recon - Default Profile"})
//    @TestModellerPath(guid = "fcd4299b-b402-4b84-b021-edf5b6422d71")
//    public void GoToUrlClickView2ClickLedgerReconciliation3PositiveSelectAccountType48PositiveSelectAccount598()
//    {
//        
//        pages.Ledger_Reconciliation2 _Ledger_Reconciliation2 = new pages.Ledger_Reconciliation2(driver);
//    TestModellerLogger.SetLastNodeGuid("0d7f3efc-1d9e-4c1d-82a1-54adf0eed4d4");
//    _Ledger_Reconciliation2.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("3bbba1f2-1686-481c-904c-293f9e258faa");
//    _Ledger_Reconciliation2.Click_View_2();
//    
//
//    TestModellerLogger.SetLastNodeGuid("ceeb3185-e7d3-4c4f-963c-3dca1344a8e1");
//    _Ledger_Reconciliation2.Click_Ledger_Reconciliation_3();
//    
//
//    TestModellerLogger.SetLastNodeGuid("a40112ac-ceca-4485-9a53-7ce64043f539");
//    _Ledger_Reconciliation2.Select_AccountType_4__8("Provisions for liabilities");
//    
//
//    TestModellerLogger.SetLastNodeGuid("0c690154-2fcd-4c8e-ae48-7ddbebb785ab");
//    _Ledger_Reconciliation2.Select_Account_5__9("No Available Accounts to Reconcile");
//    
//
//    TestModellerLogger.SetLastNodeGuid("94e09692-250a-4696-acf0-8f65e335505b");
//    _Ledger_Reconciliation2.Click_Reconcile_All_6();
//    
//
//    TestModellerLogger.SetLastNodeGuid("76e9cd84-1d64-4dd3-bbdd-f043aa917f68");
//    _Ledger_Reconciliation2.Click_View_Reconciled_7();
//    
//
//    TestModellerLogger.SetLastNodeGuid("02394ba8-e51a-483d-a7f6-63c3be685403");
//    _Ledger_Reconciliation2.Select_AccountType_4__8("Taxation");
//    
//
//    TestModellerLogger.SetLastNodeGuid("edfac3dd-25bc-4f57-98ba-614554f63c52");
//    _Ledger_Reconciliation2.Select_Account_5__9("No Available Accounts to Reconcile");
//    
//
//    TestModellerLogger.SetLastNodeGuid("4f11b6bd-18d8-4cac-935c-f1d6b2c3a47b");
//    _Ledger_Reconciliation2.Select_Months_10("Yearly");
//    
//
//    TestModellerLogger.SetLastNodeGuid("70d4f520-5d26-4d6d-930a-9e28f6b9c068");
//    _Ledger_Reconciliation2.Enter_DateFrom_11("44487");
//    
//
//    TestModellerLogger.SetLastNodeGuid("dd2e997b-64af-4971-b4e7-3de0747bdefc");
//    _Ledger_Reconciliation2.Enter_DateTo_12("2022-05-15 01:46:43");
//    
//
//    TestModellerLogger.SetLastNodeGuid("bd3772d2-8362-4883-88d5-d41840bb15f4");
//    _Ledger_Reconciliation2.Click_Undo_Reconcile_13();
//    
//
//    }
//
//    @Test  (groups= {"Test_Ladger_Recon","Test_Ladger_Recon - Default Profile"})
//    @TestModellerPath(guid = "59a371ec-412a-435d-a263-a6e1543d28b7")
//    public void GoToUrlClickView2ClickLedgerReconciliation3PositiveSelectAccountType48PositiveSelectAccount599()
//    {
//        
//        pages.Ledger_Reconciliation2 _Ledger_Reconciliation2 = new pages.Ledger_Reconciliation2(driver);
//    TestModellerLogger.SetLastNodeGuid("0d7f3efc-1d9e-4c1d-82a1-54adf0eed4d4");
//    _Ledger_Reconciliation2.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("3bbba1f2-1686-481c-904c-293f9e258faa");
//    _Ledger_Reconciliation2.Click_View_2();
//    
//
//    TestModellerLogger.SetLastNodeGuid("ceeb3185-e7d3-4c4f-963c-3dca1344a8e1");
//    _Ledger_Reconciliation2.Click_Ledger_Reconciliation_3();
//    
//
//    TestModellerLogger.SetLastNodeGuid("a40112ac-ceca-4485-9a53-7ce64043f539");
//    _Ledger_Reconciliation2.Select_AccountType_4__8("Provisions for liabilities");
//    
//
//    TestModellerLogger.SetLastNodeGuid("0c690154-2fcd-4c8e-ae48-7ddbebb785ab");
//    _Ledger_Reconciliation2.Select_Account_5__9("No Available Accounts to Reconcile");
//    
//
//    TestModellerLogger.SetLastNodeGuid("94e09692-250a-4696-acf0-8f65e335505b");
//    _Ledger_Reconciliation2.Click_Reconcile_All_6();
//    
//
//    TestModellerLogger.SetLastNodeGuid("76e9cd84-1d64-4dd3-bbdd-f043aa917f68");
//    _Ledger_Reconciliation2.Click_View_Reconciled_7();
//    
//
//    TestModellerLogger.SetLastNodeGuid("02394ba8-e51a-483d-a7f6-63c3be685403");
//    _Ledger_Reconciliation2.Select_AccountType_4__8("Employee");
//    
//
//    TestModellerLogger.SetLastNodeGuid("edfac3dd-25bc-4f57-98ba-614554f63c52");
//    _Ledger_Reconciliation2.Select_Account_5__9("No Available Accounts to Reconcile");
//    
//
//    TestModellerLogger.SetLastNodeGuid("4f11b6bd-18d8-4cac-935c-f1d6b2c3a47b");
//    _Ledger_Reconciliation2.Select_Months_10("Yearly");
//    
//
//    TestModellerLogger.SetLastNodeGuid("70d4f520-5d26-4d6d-930a-9e28f6b9c068");
//    _Ledger_Reconciliation2.Enter_DateFrom_11("44487");
//    
//
//    TestModellerLogger.SetLastNodeGuid("dd2e997b-64af-4971-b4e7-3de0747bdefc");
//    _Ledger_Reconciliation2.Enter_DateTo_12("2022-09-05 21:13:05");
//    
//
//    TestModellerLogger.SetLastNodeGuid("bd3772d2-8362-4883-88d5-d41840bb15f4");
//    _Ledger_Reconciliation2.Click_Undo_Reconcile_13();
//    
//
//    }
//
}