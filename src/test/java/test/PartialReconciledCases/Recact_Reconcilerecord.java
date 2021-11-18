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
import utilities.testmodeller.TestModellerLogger;

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/9412fd56-7ea8-4b2a-8c6f-578d91616d71
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1086, profileId = 100985)
public class Recact_Reconcilerecord extends TestBase
{
	String sTestCaseID=null;
    String[] data=null;
    String Sheet =null;
        
    @Test  (groups= {"Rec_act","Rec_act - Reconcilerecord"})
    @TestModellerPath(guid = "bbfc9649-1f1e-4887-9ead-e3983ad1e1d0")
    public void ReconcilerecordGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertU1() throws InterruptedException, IOException, InvalidFormatException, HeadlessException, AWTException
    {
    	sTestCaseID="TC1";
		Sheet="Reconcillation";
		data =ExcelUtility.toReadExcelData(sTestCaseID,Sheet);
    	
        pages.PartialReconciledCases.nlogin _nlogin = new pages.PartialReconciledCases.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("admin");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("sandbox@test");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("Nidhi1");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("NidhiEnt");
    
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.PartialReconciledCases.Reconcilation _Reconcilation = new pages.PartialReconciledCases.Reconcilation(driver);
//    TestModellerLogger.SetLastNodeGuid("fc1c2835-8b62-466d-8b91-b2d2b6852de5");
//    _Reconcilation.GoToUrl();
//    

//    TestModellerLogger.SetLastNodeGuid("30a799ca-18ec-4e8a-9931-57fc4ea2c02b");
//    _Reconcilation.AssertUrl();
  

    TestModellerLogger.SetLastNodeGuid("5fa7c856-5fe6-458c-94fd-c74460dd9b1f");
    _Reconcilation.Click_Acntantleftmenu();
    

    TestModellerLogger.SetLastNodeGuid("2f750f49-e648-45ca-898e-d60728db5570");
    _Reconcilation.Click_plussign();
    Thread.sleep(1000);

    TestModellerLogger.SetLastNodeGuid("a3808a66-3e56-4e52-b2c1-61b7d5d15b32");
    _Reconcilation.Select_SelectAccountType1("Customer");
    

    TestModellerLogger.SetLastNodeGuid("2018e2d9-51c8-4e54-8424-0f5147db31d6");
    _Reconcilation.Select_SelectAccount1("Nidhis");
    

//    TestModellerLogger.SetLastNodeGuid("0892baec-0422-496a-93f9-1028cef59d2c");
//   _Reconcilation.Click_View_Reconciled_button1();
    

pages.PartialReconciledCases.Reconsilecount _Reconsilecount = new pages.PartialReconciledCases.Reconsilecount(driver);
//    TestModellerLogger.SetLastNodeGuid("20ec992d-e923-4cd2-946b-1f6e59b73bf6");
//    _Reconsilecount.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("778b3b22-188b-4954-8194-ffafa2c2d9c2");
    _Reconsilecount.Click_R1();
    

    TestModellerLogger.SetLastNodeGuid("0fc72130-6b3a-4342-9d0e-19804563923c");
    _Reconsilecount.Click_R2();
    

//    TestModellerLogger.SetLastNodeGuid("bccac54a-cf91-4c34-b5de-3168f47f6c6c");
//    _Reconsilecount.Click_R3();
//    

//    TestModellerLogger.SetLastNodeGuid("afa85278-aa67-42ac-9a2e-9d7e8178cae9");
//    _Reconsilecount.Click_R4();
    
//
//    TestModellerLogger.SetLastNodeGuid("8be2e142-f2d6-40b4-9f1a-b4f6c31f9776");
//    _Reconsilecount.Click_R5();
//    
//
//    TestModellerLogger.SetLastNodeGuid("e4e26451-eebc-4ddc-84aa-2abdfce286c3");
//    _Reconsilecount.Click_R6();
//    

//    TestModellerLogger.SetLastNodeGuid("24bb6ec6-e35c-424b-97bf-7d95cfb0c096");
// _Reconsilecount.Click_R7();
//    
//    TestModellerLogger.SetLastNodeGuid("605ff86c-cdca-413d-8743-6d540ebe0d6f");
// _Reconsilecount.Click_R8();
    

//    TestModellerLogger.SetLastNodeGuid("5e13f8d0-f1e2-4527-b2df-049aaf7e1d0e");
//    _Reconsilecount.Click_R9();
    

//    TestModellerLogger.SetLastNodeGuid("3f0eb811-3a59-4e4e-9972-944ae4cc0d33");
//    _Reconsilecount.Click_R10();
    

//    TestModellerLogger.SetLastNodeGuid("0ae57fc9-3f5d-4114-951b-51a967c72977");
//    _Reconsilecount.Click_R100();
//    
//
//    TestModellerLogger.SetLastNodeGuid("bc70be77-e7a6-40c0-94d7-4c667fba43a8");
//    _Reconsilecount.Click_R11();
    

//    TestModellerLogger.SetLastNodeGuid("40cafd20-4a4a-423c-b1f8-b6457dcfc293");
//    _Reconsilecount.Click_R12();
//    
//
//    TestModellerLogger.SetLastNodeGuid("333f5500-78ad-458f-a383-b6440369d3de");
//    _Reconsilecount.Click_R13();
//    
//
//    TestModellerLogger.SetLastNodeGuid("ab08b36a-2f76-46cc-8cf0-f6dc93b8213c");
//    _Reconsilecount.Click_R14();
    

//    TestModellerLogger.SetLastNodeGuid("ab7f2182-853d-4064-8d23-3ed12179a136");
//    _Reconsilecount.Click_R15();
//    
//
//    TestModellerLogger.SetLastNodeGuid("6966e097-d89b-4907-b08e-0e68c988cac1");
//    _Reconsilecount.Click_R16();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5f153217-83e2-4727-89af-4b63829d3f86");
//    _Reconsilecount.Click_R17();
//    
//
//    TestModellerLogger.SetLastNodeGuid("2437587a-af3c-4c95-8b5f-bba6c149170e");
//    _Reconsilecount.Click_R18();
//    
//
//    TestModellerLogger.SetLastNodeGuid("2459c2b4-3bfc-481c-a024-a8b07ffb4253");
//    _Reconsilecount.Click_R19();
//    

//    TestModellerLogger.SetLastNodeGuid("7afa71ce-7cce-4ada-8b31-6b446ee3611f");
//    _Reconsilecount.Click_R20();
//    
//
//    TestModellerLogger.SetLastNodeGuid("130229df-4174-47ff-b315-4e797e797be2");
//    _Reconsilecount.Click_R21();
//    
//
//    TestModellerLogger.SetLastNodeGuid("67a8a70d-5168-4f86-8da8-7838512ad558");
//    _Reconsilecount.Click_R22();
//    
//
//    TestModellerLogger.SetLastNodeGuid("69e73e5a-7c35-43b8-b74e-686f7b89d6f5");
//    _Reconsilecount.Click_R23();
//    
//
//    TestModellerLogger.SetLastNodeGuid("37e489d4-7649-4e8e-8982-e68c437511f0");
//    _Reconsilecount.Click_R24();
//    
//
//    TestModellerLogger.SetLastNodeGuid("b295b7ea-4eae-4326-90c8-7bc01145c021");
//    _Reconsilecount.Click_R25();
//    
//
//    TestModellerLogger.SetLastNodeGuid("0016602a-7419-4e1c-843c-4f82ce17b4f9");
//    _Reconsilecount.Click_R26();
//    
//
//    TestModellerLogger.SetLastNodeGuid("fcf9dc5c-45e6-4309-bceb-fde0aeeaeec2");
//    _Reconsilecount.Click_R27();
//    
//
//    TestModellerLogger.SetLastNodeGuid("95a7e0ac-fd21-408c-9d9c-027004930449");
//    _Reconsilecount.Click_R28();
//    
//
//    TestModellerLogger.SetLastNodeGuid("4aa503fb-8b18-4e77-bcda-9559679043d5");
//    _Reconsilecount.Click_R29();
//    
//
//    TestModellerLogger.SetLastNodeGuid("bc0de1d6-d59c-4900-899d-8bb3da5f1abd");
//    _Reconsilecount.Click_R30();
//
//    TestModellerLogger.SetLastNodeGuid("d71b7b01-a58a-4f38-b66e-80fb55df0a8a");
//    Object _testlink;
//	((Object) _testlink).Click_Reconcile_link_click();
//    TestModellerLogger.SetLastNodeGuid("9bcccc53-1773-466b-b426-6ee41539f8e3");
//    _Reconsilecount.Select_R31("Partial Reconcile");
//    
//
//    TestModellerLogger.SetLastNodeGuid("154f0835-2441-4733-9a24-ba5927a5e7e1");
//    _Reconsilecount.Click_Success_Transactions_reconciled_successfully();
//    Thread.sleep(1000);
    

    }
}
    /*

    @Test  (groups= {"Rec_act","Rec_act - Reconcilerecord"})
    @TestModellerPath(guid = "c98abd53-32fd-494d-bb02-77b8422ae984")
    public void ReconcilerecordGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertU2()
    {
        
        pages.PartialReconciledCases.nlogin _nlogin = new pages.PartialReconciledCases.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("gR0etc_r5r");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("error");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Christiansen, Sporer and Strosin");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.PartialReconciledCases.Reconcilation _Reconcilation = new pages.PartialReconciledCases.Reconcilation(driver);
    TestModellerLogger.SetLastNodeGuid("fc1c2835-8b62-466d-8b91-b2d2b6852de5");
    _Reconcilation.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("30a799ca-18ec-4e8a-9931-57fc4ea2c02b");
//    _Reconcilation.AssertUrl();
    

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
    

pages.PartialReconciledCases.Reconsilecount _Reconsilecount = new pages.PartialReconciledCases.Reconsilecount(driver);
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
    _Reconsilecount.Select_R31("Reconcile with Journal Entry");
    

    TestModellerLogger.SetLastNodeGuid("154f0835-2441-4733-9a24-ba5927a5e7e1");
    _Reconsilecount.Click_Success_Transactions_reconciled_successfully();
    

    }
/*
    @Test  (groups= {"Rec_act","Rec_act - Reconcilerecord"})
    @TestModellerPath(guid = "8ca2a69b-0647-443d-9e25-40d1d95d33c9")
    public void ReconcilerecordGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertU3()
    {
        
        pages.PartialReconciledCases.nlogin _nlogin = new pages.PartialReconciledCases.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("rcGna535gX");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("voluptates");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Green and Sons");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

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
    

pages.PartialReconciledCases.Reconsilecount _Reconsilecount = new pages.PartialReconciledCases.Reconsilecount(driver);
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
    _Reconsilecount.Select_R31("Reconcile with Write Off");
    

    TestModellerLogger.SetLastNodeGuid("154f0835-2441-4733-9a24-ba5927a5e7e1");
    _Reconsilecount.Click_Success_Transactions_reconciled_successfully();
    

    }

    @Test  (groups= {"Rec_act","Rec_act - Reconcilerecord"})
    @TestModellerPath(guid = "06f82b93-ad09-4ab1-bd5b-f6bc5bd38a67")
    public void ReconcilerecordGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertU4()
    {
        
        pages.PartialReconciledCases.nlogin _nlogin = new pages.PartialReconciledCases.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("AIuZWgat0C");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("nihil");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Schuster LLC");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

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
    

pages.PartialReconciledCases.Reconsilecount _Reconsilecount = new pages.PartialReconciledCases.Reconsilecount(driver);
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
    _Reconsilecount.Select_R31("Reconcile with Advance");
    

    TestModellerLogger.SetLastNodeGuid("154f0835-2441-4733-9a24-ba5927a5e7e1");
    _Reconsilecount.Click_Success_Transactions_reconciled_successfully();
    

    }

    @Test  (groups= {"Rec_act","Rec_act - Reconcilerecord"})
    @TestModellerPath(guid = "240d2b3c-260b-4901-b19b-1d1aecfb10b5")
    public void ReconcilerecordGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertU5()
    {
        
        pages.PartialReconciledCases.nlogin _nlogin = new pages.PartialReconciledCases.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("hu2WP9znAK");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("autem");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Williamson Group");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

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
    

pages.PartialReconciledCases.Reconsilecount _Reconsilecount = new pages.PartialReconciledCases.Reconsilecount(driver);
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

    @Test  (groups= {"Rec_act","Rec_act - Reconcilerecord"})
    @TestModellerPath(guid = "36469f2c-29f9-4bde-aa25-f29ebbb4a61b")
    public void ReconcilerecordGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertU6()
    {
        
        pages.PartialReconciledCases.nlogin _nlogin = new pages.PartialReconciledCases.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("qQ9il7fyI9");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Oberbrunner, Mosciski and White");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

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
    

pages.PartialReconciledCases.Reconsilecount _Reconsilecount = new pages.PartialReconciledCases.Reconsilecount(driver);
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

    @Test  (groups= {"Rec_act","Rec_act - Reconcilerecord"})
    @TestModellerPath(guid = "eac97a0e-91d6-4026-af33-83a588e90c2e")
    public void ReconcilerecordGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertU7()
    {
        
        pages.PartialReconciledCases.nlogin _nlogin = new pages.PartialReconciledCases.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("Fotokgx48U");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("id");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Sporer - Williamson");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

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
    

pages.PartialReconciledCases.Reconsilecount _Reconsilecount = new pages.PartialReconciledCases.Reconsilecount(driver);
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

    @Test  (groups= {"Rec_act","Rec_act - Reconcilerecord"})
    @TestModellerPath(guid = "37ae28d2-7625-4248-9e55-457c41f0112f")
    public void ReconcilerecordGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertU8()
    {
        
        pages.PartialReconciledCases.nlogin _nlogin = new pages.PartialReconciledCases.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    
//
//    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("B87WL3F7Fz");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("molestiae");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Wisozk LLC");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.PartialReconciledCases.Reconcilation _Reconcilation = new pages.PartialReconciledCases.Reconcilation(driver);
    TestModellerLogger.SetLastNodeGuid("fc1c2835-8b62-466d-8b91-b2d2b6852de5");
    _Reconcilation.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("30a799ca-18ec-4e8a-9931-57fc4ea2c02b");
//    _Reconcilation.AssertUrl();


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
    

pages.PartialReconciledCases.Reconsilecount _Reconsilecount = new pages.PartialReconciledCases.Reconsilecount(driver);
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

    @Test  (groups= {"Rec_act","Rec_act - Reconcilerecord"})
    @TestModellerPath(guid = "1f1567b2-9289-4cf2-b4f1-37f3745e05b3")
    public void ReconcilerecordGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertU9()
    {
        
        pages.PartialReconciledCases.nlogin _nlogin = new pages.PartialReconciledCases.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("MNloTY4qsB");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.PartialReconciledCases.AgentSearch _AgentSearch = new pages.PartialReconciledCases.AgentSearch(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
//    _AgentSearch.AssertUrl();
//    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Ritchie, Medhurst and Durgan");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

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
    

pages.PartialReconciledCases.Reconsilecount _Reconsilecount = new pages.PartialReconciledCases.Reconsilecount(driver);
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

    @Test  (groups= {"Rec_act","Rec_act - Reconcilerecord"})
    @TestModellerPath(guid = "5dab4f2c-cacf-4ed1-9e1e-367f082aedc2")
    public void ReconcilerecordGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssert10()
    {
        
        pages.PartialReconciledCases.nlogin _nlogin = new pages.PartialReconciledCases.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("ATQ759kXam");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("nesciunt");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Moen - Balistreri");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

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
    

pages.PartialReconciledCases.Reconsilecount _Reconsilecount = new pages.PartialReconciledCases.Reconsilecount(driver);
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
}
/*

    @Test  (groups= {"Rec_act","Rec_act - Reconcilerecord"})
    @TestModellerPath(guid = "41ff7c19-80b9-4edd-969a-7d41b9d75567")
    public void ReconcilerecordGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssert11()
    {
        
        pages.PartialReconciledCases.nlogin _nlogin = new pages.PartialReconciledCases.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//    _nlogin.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("Zgvb22RXF5");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("dicta");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Yost Group");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

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
    

pages.PartialReconciledCases.Reconsilecount _Reconsilecount = new pages.PartialReconciledCases.Reconsilecount(driver);
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

    @Test  (groups= {"Rec_act","Rec_act - Reconcilerecord"})
    @TestModellerPath(guid = "459e5ee1-8583-479a-8a50-4e30ee065cc4")
    public void ReconcilerecordGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssert12()
    {
        
        pages.PartialReconciledCases.nlogin _nlogin = new pages.PartialReconciledCases.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("yFEV4mKjX3");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.PartialReconciledCases.AgentSearch _AgentSearch = new pages.PartialReconciledCases.AgentSearch(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    
//
//    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
//    _AgentSearch.AssertUrl();
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Rath Group");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

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
    

pages.PartialReconciledCases.Reconsilecount _Reconsilecount = new pages.PartialReconciledCases.Reconsilecount(driver);
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

    @Test  (groups= {"Rec_act","Rec_act - Reconcilerecord"})
    @TestModellerPath(guid = "b69f3553-981a-43a0-88b3-87d42b73a4e5")
    public void ReconcilerecordGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssert13()
    {
        
        pages.PartialReconciledCases.nlogin _nlogin = new pages.PartialReconciledCases.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("K7EbEBlc43");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("delectus");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Daniel LLC");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.PartialReconciledCases.Reconcilation _Reconcilation = new pages.PartialReconciledCases.Reconcilation(driver);
    TestModellerLogger.SetLastNodeGuid("fc1c2835-8b62-466d-8b91-b2d2b6852de5");
    _Reconcilation.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("30a799ca-18ec-4e8a-9931-57fc4ea2c02b");
//    _Reconcilation.AssertUrl();
//    

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
    

pages.PartialReconciledCases.Reconsilecount _Reconsilecount = new pages.PartialReconciledCases.Reconsilecount(driver);
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

    @Test  (groups= {"Rec_act","Rec_act - Reconcilerecord"})
    @TestModellerPath(guid = "b81c3b71-8f1a-42f8-8b11-3aed51757ccb")
    public void ReconcilerecordGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssert14()
    {
        
        pages.PartialReconciledCases.nlogin _nlogin = new pages.PartialReconciledCases.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("sbGCLD90Ql");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("quod");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Lowe Group");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.PartialReconciledCases.Reconcilation _Reconcilation = new pages.PartialReconciledCases.Reconcilation(driver);
    TestModellerLogger.SetLastNodeGuid("fc1c2835-8b62-466d-8b91-b2d2b6852de5");
    _Reconcilation.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("30a799ca-18ec-4e8a-9931-57fc4ea2c02b");
//    _Reconcilation.AssertUrl();
    

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
    

pages.PartialReconciledCases.Reconsilecount _Reconsilecount = new pages.PartialReconciledCases.Reconsilecount(driver);
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

    @Test  (groups= {"Rec_act","Rec_act - Reconcilerecord"})
    @TestModellerPath(guid = "3fed55cf-2341-4bfc-bf0e-b7d87889bf5a")
    public void ReconcilerecordGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssert15()
    {
        
        pages.PartialReconciledCases.nlogin _nlogin = new pages.PartialReconciledCases.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("Abu3H2sifg");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("quis");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Rutherford - Pouros");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

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
    

pages.PartialReconciledCases.Reconsilecount _Reconsilecount = new pages.PartialReconciledCases.Reconsilecount(driver);
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

}*/