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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/9f95fe00-58bb-4c28-a5de-bcf29474cdb9
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1169, profileId = 101058)
public class bankrecbank_bankamountreconcilationnid extends TestBase
{

	public String sTestCaseID=null;
	String[] data=null;
	String Sheet = null;
    
    @Test  (groups= {"bankrec_bank","bankrec_bank - bankamountreconcilation_nid"})
    @TestModellerPath(guid = "8e271d9c-015a-4c9f-8cd2-e12033feb12e")
    public void bankamountreconcilationnidGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoT1() throws InterruptedException, IOException, InvalidFormatException, HeadlessException, AWTException
    {
        
    	sTestCaseID="TC268";
       	Sheet="Reconcile";
        data = ExcelUtility.toReadExcelData(sTestCaseID, Sheet);
        
        pages.PartialReconciledCases.nlogin _nlogin = new pages.PartialReconciledCases.nlogin(driver);
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
    

pages.PartialReconciledCases.AgentSearch _AgentSearch = new pages.PartialReconciledCases.AgentSearch(driver);
//    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
//    _AgentSearch.GoToUrl();
//    

//    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
//    _AgentSearch.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.PartialReconciledCases.Searchclient _Searchclient = new pages.PartialReconciledCases.Searchclient(driver);
//    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
//    _Searchclient.GoToUrl();
    
//
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
    

pages.PartialReconciledCases.bankmenu _bankmenu = new pages.PartialReconciledCases.bankmenu(driver);
//    TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
//    _bankmenu.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
//    _bankmenu.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
    _bankmenu.Click_Bankingmenu();
    

    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
    _bankmenu.Click_Newmenu();
    

pages.PartialReconciledCases.nBANKTRN _nBANKTRN = new pages.PartialReconciledCases.nBANKTRN(driver);
//    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
//    _nBANKTRN.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
//    _nBANKTRN.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
    _nBANKTRN.Select_BK_SELECT(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
    _nBANKTRN.Enter_NDate(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
    _nBANKTRN.Enter_n_desc(data[7]);
    

    TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
    _nBANKTRN.Enter_Recived_amt(data[8]);
    

   TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
   _nBANKTRN.Enter_spnt_amt(data[9]);
    

//    TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
//    _nBANKTRN.Select_Select_VATRate("NO VAT");
//    

    TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
    _nBANKTRN.Click_Select_Option1();
    

    TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
    _nBANKTRN.Enter_BOX2(data[10]);
    
//
//    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
//    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
   

pages.PartialReconciledCases.Reconcilation _Reconcilation = new pages.PartialReconciledCases.Reconcilation(driver);
//    TestModellerLogger.SetLastNodeGuid("fc1c2835-8b62-466d-8b91-b2d2b6852de5");
//    _Reconcilation.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("30a799ca-18ec-4e8a-9931-57fc4ea2c02b");
//    _Reconcilation.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5fa7c856-5fe6-458c-94fd-c74460dd9b1f");
    _Reconcilation.Click_Acntantleftmenu();
    

    TestModellerLogger.SetLastNodeGuid("2f750f49-e648-45ca-898e-d60728db5570");
    _Reconcilation.Click_plussign();
    

    TestModellerLogger.SetLastNodeGuid("a3808a66-3e56-4e52-b2c1-61b7d5d15b32");
    _Reconcilation.Select_SelectAccountType1(data[11]);
    

    TestModellerLogger.SetLastNodeGuid("2018e2d9-51c8-4e54-8424-0f5147db31d6");
    _Reconcilation.Select_SelectAccount1(data[12]);
    

//    TestModellerLogger.SetLastNodeGuid("0892baec-0422-496a-93f9-1028cef59d2c");
//    _Reconcilation.Click_View_Reconciled_button1();
    

pages.PartialReconciledCases.Reconsilecount _Reconsilecount = new pages.PartialReconciledCases.Reconsilecount(driver);
//    TestModellerLogger.SetLastNodeGuid("20ec992d-e923-4cd2-946b-1f6e59b73bf6");
//    _Reconsilecount.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("778b3b22-188b-4954-8194-ffafa2c2d9c2");
    _Reconsilecount.Click_R1();
    

    TestModellerLogger.SetLastNodeGuid("0fc72130-6b3a-4342-9d0e-19804563923c");
    _Reconsilecount.Click_R2();
  
//    TestModellerLogger.SetLastNodeGuid("9bcccc53-1773-466b-b426-6ee41539f8e3");
//    _Reconsilecount.Select_R31("Partial Reconcile");
//    
//
//    TestModellerLogger.SetLastNodeGuid("154f0835-2441-4733-9a24-ba5927a5e7e1");
//    _Reconsilecount.Click_Success_Transactions_reconciled_successfully();
//    

    }
}


/*

    @Test  (groups= {"bankrec_bank","bankrec_bank - bankamountreconcilation_nid"})
    @TestModellerPath(guid = "ba58924f-1ac5-430e-bf75-d8c015b7405b")
    public void bankamountreconcilationnidGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoT2()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("Q7MbpOyClZ");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("occaecati");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Emard, Stokes and Wuckert");
    

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
    _nBANKTRN.Enter_NDate("44261");
    

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
    _Reconsilecount.Select_R31("Reconcile with Journal Entry");
    

    TestModellerLogger.SetLastNodeGuid("154f0835-2441-4733-9a24-ba5927a5e7e1");
    _Reconsilecount.Click_Success_Transactions_reconciled_successfully();
    

    }

    @Test  (groups= {"bankrec_bank","bankrec_bank - bankamountreconcilation_nid"})
    @TestModellerPath(guid = "f74b3b7c-d50d-4697-8ba4-641558ebc0df")
    public void bankamountreconcilationnidGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoT3()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("4IvF02qPEQ");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("aut");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Mertz, Gusikowski and Sporer");
    

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
    _nBANKTRN.Enter_NDate("44261");
    

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
    _Reconsilecount.Select_R31("Reconcile with Write Off");
    

    TestModellerLogger.SetLastNodeGuid("154f0835-2441-4733-9a24-ba5927a5e7e1");
    _Reconsilecount.Click_Success_Transactions_reconciled_successfully();
    

    }

    @Test  (groups= {"bankrec_bank","bankrec_bank - bankamountreconcilation_nid"})
    @TestModellerPath(guid = "de99051c-058e-45a1-bf4b-31ac1da24099")
    public void bankamountreconcilationnidGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoT4()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("zoamTuBQN1");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("eos");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Mayert, Howe and Kessler");
    

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
    _nBANKTRN.Enter_NDate("44261");
    

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
    _Reconsilecount.Select_R31("Reconcile with Advance");
    

    TestModellerLogger.SetLastNodeGuid("154f0835-2441-4733-9a24-ba5927a5e7e1");
    _Reconsilecount.Click_Success_Transactions_reconciled_successfully();
    

    }

    @Test  (groups= {"bankrec_bank","bankrec_bank - bankamountreconcilation_nid"})
    @TestModellerPath(guid = "bd832020-b6ed-45c2-a7e1-cb47d1fb32df")
    public void bankamountreconcilationnidGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoT5()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("Ldu5StqoyQ");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("nisi");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Hayes - Labadie");
    

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
    _nBANKTRN.Enter_NDate("44261");
    

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
    _Reconcilation.Select_SelectAccount1("nid");
    

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

    @Test  (groups= {"bankrec_bank","bankrec_bank - bankamountreconcilation_nid"})
    @TestModellerPath(guid = "344d712a-ef07-44e5-9570-3bab66b1b0a3")
    public void bankamountreconcilationnidGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoT6()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("qo4shRwdxB");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("officia");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Rippin and Sons");
    

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
    _nBANKTRN.Enter_NDate("44261");
    

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
    _Reconcilation.Select_SelectAccount1("Nidhi");
    

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

    @Test  (groups= {"bankrec_bank","bankrec_bank - bankamountreconcilation_nid"})
    @TestModellerPath(guid = "cea32d0a-e587-4f65-82ab-78fd5d3b8703")
    public void bankamountreconcilationnidGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoT7()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("Q1opE3rAAt");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("sint");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Kihn, Pacocha and Johnston");
    

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
    _nBANKTRN.Enter_NDate("44261");
    

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
    _Reconcilation.Select_SelectAccountType1("Creditors due within one year");
    

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

    @Test  (groups= {"bankrec_bank","bankrec_bank - bankamountreconcilation_nid"})
    @TestModellerPath(guid = "b2cab7bf-7db9-4330-96eb-9f4d85b2cdb6")
    public void bankamountreconcilationnidGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoT8()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("UGGIgWI6wa");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("autem");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Osinski, Gaylord and Boyer");
    

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
    _nBANKTRN.Enter_NDate("44261");
    

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
    _Reconcilation.Select_SelectAccountType1("Customer");
    

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

    @Test  (groups= {"bankrec_bank","bankrec_bank - bankamountreconcilation_nid"})
    @TestModellerPath(guid = "2196374c-f41a-4422-b8a6-1ef174f4d962")
    public void bankamountreconcilationnidGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoT9()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("s5dqrb9iyi");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("eveniet");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Ruecker - Runte");
    

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
    _nBANKTRN.Enter_NDate("44261");
    

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

    @Test  (groups= {"bankrec_bank","bankrec_bank - bankamountreconcilation_nid"})
    @TestModellerPath(guid = "438618a0-e89b-49f6-bdf5-26fdea83f161")
    public void bankamountreconcilationnidGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGo10()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("ZHfHeo4N1b");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("qui");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Runte, Windler and Fisher");
    

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
    _nBANKTRN.Enter_NDate("44261");
    

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
    _Reconcilation.Select_SelectAccountType1("Director");
    

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

    @Test  (groups= {"bankrec_bank","bankrec_bank - bankamountreconcilation_nid"})
    @TestModellerPath(guid = "c770a506-7383-41d3-bcd9-b334c08acd50")
    public void bankamountreconcilationnidGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGo11()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("QW9ADjUakR");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("aut");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("DuBuque Inc");
    

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
    _nBANKTRN.Enter_NDate("44261");
    

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
    _Reconcilation.Select_SelectAccountType1("Employee");
    

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

    @Test  (groups= {"bankrec_bank","bankrec_bank - bankamountreconcilation_nid"})
    @TestModellerPath(guid = "54b0f618-2724-4b47-b3a1-101ca3186d55")
    public void bankamountreconcilationnidGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGo12()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("rWIMk_ZKiU");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Boyer and Sons");
    

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
    _nBANKTRN.Enter_NDate("44261");
    

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
    _Reconcilation.Select_SelectAccountType1("Person");
    

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

    @Test  (groups= {"bankrec_bank","bankrec_bank - bankamountreconcilation_nid"})
    @TestModellerPath(guid = "8114242a-ddf6-4ddd-a19a-763bb635bf0b")
    public void bankamountreconcilationnidGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGo13()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("mDAfQblsY0");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("beatae");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Barrows and Sons");
    

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
    _nBANKTRN.Enter_NDate("44261");
    

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
    _Reconcilation.Select_SelectAccountType1("Provisions for liabilities");
    

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

    @Test  (groups= {"bankrec_bank","bankrec_bank - bankamountreconcilation_nid"})
    @TestModellerPath(guid = "72813973-65a6-42bc-a3c9-92a75b51be45")
    public void bankamountreconcilationnidGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGo14()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("kYanLjic9f");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("et");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Blick - Mohr");
    

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
    _nBANKTRN.Enter_NDate("44261");
    

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
    _Reconcilation.Select_SelectAccountType1("Supplier");
    

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

    @Test  (groups= {"bankrec_bank","bankrec_bank - bankamountreconcilation_nid"})
    @TestModellerPath(guid = "872c0b50-bfb1-4afc-81a9-2e94896995ca")
    public void bankamountreconcilationnidGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGo15()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("9lEMLXM7HJ");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("et");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Huels - Rice");
    

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
    _nBANKTRN.Enter_NDate("44261");
    

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
    _Reconcilation.Select_SelectAccountType1("Taxation");
    

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

    @Test  (groups= {"bankrec_bank","bankrec_bank - bankamountreconcilation_nid"})
    @TestModellerPath(guid = "3935f907-0330-4ec3-a4e1-0dccb8e1868c")
    public void bankamountreconcilationnidGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGo16()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("VzEcL8StK4");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("enim");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Champlin - Hagenes");
    

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
    _nBANKTRN.Enter_NDate("44261");
    

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

    @Test  (groups= {"bankrec_bank","bankrec_bank - bankamountreconcilation_nid"})
    @TestModellerPath(guid = "578bbb90-aad0-420d-a141-160875b714b6")
    public void bankamountreconcilationnidGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGo17()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("o1e5A9mbwH");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("aut");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Murazik - Terry");
    

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
    _nBANKTRN.Enter_NDate("44261");
    

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

    @Test  (groups= {"bankrec_bank","bankrec_bank - bankamountreconcilation_nid"})
    @TestModellerPath(guid = "891e7592-3ba4-489d-893c-0a22f8af8185")
    public void bankamountreconcilationnidGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGo18()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("r84x9M3dx7");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("harum");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Schuster - Satterfield");
    

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
    _nBANKTRN.Enter_NDate("44261");
    

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

    @Test  (groups= {"bankrec_bank","bankrec_bank - bankamountreconcilation_nid"})
    @TestModellerPath(guid = "b54c705c-3347-419b-90de-445542e11f00")
    public void bankamountreconcilationnidGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGo19()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("g6ge12vsER");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("nam");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Effertz, Gibson and Russel");
    

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
    _nBANKTRN.Enter_NDate("44261");
    

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

    @Test  (groups= {"bankrec_bank","bankrec_bank - bankamountreconcilation_nid"})
    @TestModellerPath(guid = "9a757412-1fd8-4696-ac28-6f36e0525d73")
    public void bankamountreconcilationnidGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGo20()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("ucOVi_kBUS");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("tempora");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Lehner - Hoppe");
    

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
    _nBANKTRN.Enter_NDate("2021-01-20 18:16:06");
    

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

    @Test  (groups= {"bankrec_bank","bankrec_bank - bankamountreconcilation_nid"})
    @TestModellerPath(guid = "6bb935a2-1305-42c6-8e6c-a483974ac8ad")
    public void bankamountreconcilationnidGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGo21()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("imXUd7r47A");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("libero");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Blick and Sons");
    

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
    _nBANKTRN.Enter_NDate("2021-05-27 20:05:20");
    

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

    @Test  (groups= {"bankrec_bank","bankrec_bank - bankamountreconcilation_nid"})
    @TestModellerPath(guid = "41554bab-7464-4858-8da3-843b32b7281a")
    public void bankamountreconcilationnidGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGo22()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("GQwPoQTHou");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("nihil");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Stehr - Nicolas");
    

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
    _nBANKTRN.Enter_NDate("44261");
    

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

    @Test  (groups= {"bankrec_bank","bankrec_bank - bankamountreconcilation_nid"})
    @TestModellerPath(guid = "85d24672-887f-424e-a7f6-850ec21e8464")
    public void bankamountreconcilationnidGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGo23()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("kS3zT7yqxI");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("itaque");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Keebler, Gottlieb and Little");
    

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
    _nBANKTRN.Enter_NDate("44261");
    

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

}*/