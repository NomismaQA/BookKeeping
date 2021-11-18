 package FIN_3821;

import reports.TestNGListener;
import tests.TestBase;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;

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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/7f3be873-a8e3-4a56-95bf-dbe7b82f99e4
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1525, profileId = 101511)
public class BankFeedbnkact_Bankfeed extends TestBase
{
	public String sTestCaseID=null;
	String[] data=null;
	String Sheet = null;

    
    @Test  (groups= {"Bank_Feed_bnkact","Bank_Feed_bnkact - Bankfeed"})
    @TestModellerPath(guid = "cadd47ec-ab18-4f1c-b82b-b35877182fcc")
    public void GoToUrlClickBNKFDLinkClickReportsmenu4ClickClientBnkActlinkPositiveEnterClientName2PositiveSel() throws InvalidFormatException, IOException, InterruptedException
    {
        
    	sTestCaseID="Without_Bank_Feed";
       	Sheet="Fin-3821";
        data = ExcelUtility.toReadExcelData(sTestCaseID,Sheet);
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
    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
       
      
      FIN_3821.BankFeed _BankFeed = new FIN_3821.BankFeed(driver);
//    TestModellerLogger.SetLastNodeGuid("7b4ea64a-62cc-4420-9ae5-21929965cb15");
//    _BankFeed.GoToUrl();
//    

    TestModellerLogger.SetLastNodeGuid("2cc5427a-9cd8-43c8-b7dc-5a2556fcd26c");
    _BankFeed.Click_BNK_FD_Link();
    

    FIN_3821.clientbankct _clientbankct = new   FIN_3821.clientbankct(driver);
    TestModellerLogger.SetLastNodeGuid("e0458110-032b-4eed-bb63-912211e60a97");
    _clientbankct.Click_Reportsmenu_4();
    
    TestModellerLogger.SetLastNodeGuid("b80fd689-c752-4969-a316-f64acd0ced90");
    _clientbankct.Click_Client_Bnk_Act_link1();
    

//    TestModellerLogger.SetLastNodeGuid("b292caf5-e9d6-4b7e-964a-1fc12ce8300f");
//    _clientbankct.Enter_Client_Name2("p");
//    

    TestModellerLogger.SetLastNodeGuid("fdfe879f-3bff-49b0-8d72-2bdc0e2a20b4");
    _clientbankct.Select_Client_Type2("Show All");
    

    TestModellerLogger.SetLastNodeGuid("6e6fd002-acc8-4dd9-9347-431bc98eb5e9");
    _clientbankct.Select_Without_Feeds("Show All");
    

    TestModellerLogger.SetLastNodeGuid("ff3463ea-164a-4161-aed7-894c35fa69aa");
    _clientbankct.Select_Unre_Tran("Show All");
    

    TestModellerLogger.SetLastNodeGuid("7eecec73-eb7a-43b5-91b1-43fb469589f9");
    _clientbankct.Click_Update_bttn();
    

    }
}
/*
    @Test  (groups= {"Bank_Feed_bnkact","Bank_Feed_bnkact - Bankfeed"})
    @TestModellerPath(guid = "730931e9-1a97-49a1-8fc4-185ca0f7dd3c")
    public void GoToUrlClickBNKFDLinkClickReportsmenu4ClickClientBnkActlinkPositiveEnterClientName2PositiveSel1()
    {
        
        pages.BankFeed _BankFeed = new pages.BankFeed(driver);
    TestModellerLogger.SetLastNodeGuid("7b4ea64a-62cc-4420-9ae5-21929965cb15");
    _BankFeed.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("2cc5427a-9cd8-43c8-b7dc-5a2556fcd26c");
    _BankFeed.Click_BNK_FD_Link();
    

pages.clientbankct _clientbankct = new pages.clientbankct(driver);
    TestModellerLogger.SetLastNodeGuid("e0458110-032b-4eed-bb63-912211e60a97");
    _clientbankct.Click_Reportsmenu_4();
    

    TestModellerLogger.SetLastNodeGuid("b80fd689-c752-4969-a316-f64acd0ced90");
    _clientbankct.Click_Client_Bnk_Act_link();
    

    TestModellerLogger.SetLastNodeGuid("b292caf5-e9d6-4b7e-964a-1fc12ce8300f");
    _clientbankct.Enter_Client_Name2("odio");
    

    TestModellerLogger.SetLastNodeGuid("fdfe879f-3bff-49b0-8d72-2bdc0e2a20b4");
    _clientbankct.Select_Client_Type2("Show All");
    

    TestModellerLogger.SetLastNodeGuid("6e6fd002-acc8-4dd9-9347-431bc98eb5e9");
    _clientbankct.Select_Without_Feeds("Show All");
    

    TestModellerLogger.SetLastNodeGuid("ff3463ea-164a-4161-aed7-894c35fa69aa");
    _clientbankct.Select_Unre_Tran("Hide Zeros");
    

    TestModellerLogger.SetLastNodeGuid("7eecec73-eb7a-43b5-91b1-43fb469589f9");
    _clientbankct.Click_Update_bttn();
    

    }

    @Test  (groups= {"Bank_Feed_bnkact","Bank_Feed_bnkact - Bankfeed"})
    @TestModellerPath(guid = "4a70c14c-fb51-46bd-97fb-d62b3600d7fa")
    public void GoToUrlClickBNKFDLinkClickReportsmenu4ClickClientBnkActlinkPositiveEnterClientName2PositiveSel2()
    {
        
        pages.BankFeed _BankFeed = new pages.BankFeed(driver);
    TestModellerLogger.SetLastNodeGuid("7b4ea64a-62cc-4420-9ae5-21929965cb15");
    _BankFeed.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("2cc5427a-9cd8-43c8-b7dc-5a2556fcd26c");
    _BankFeed.Click_BNK_FD_Link();
    

pages.clientbankct _clientbankct = new pages.clientbankct(driver);
    TestModellerLogger.SetLastNodeGuid("e0458110-032b-4eed-bb63-912211e60a97");
    _clientbankct.Click_Reportsmenu_4();
    

    TestModellerLogger.SetLastNodeGuid("b80fd689-c752-4969-a316-f64acd0ced90");
    _clientbankct.Click_Client_Bnk_Act_link();
    

    TestModellerLogger.SetLastNodeGuid("b292caf5-e9d6-4b7e-964a-1fc12ce8300f");
    _clientbankct.Enter_Client_Name2("placeat");
    

    TestModellerLogger.SetLastNodeGuid("fdfe879f-3bff-49b0-8d72-2bdc0e2a20b4");
    _clientbankct.Select_Client_Type2("Show All");
    

    TestModellerLogger.SetLastNodeGuid("6e6fd002-acc8-4dd9-9347-431bc98eb5e9");
    _clientbankct.Select_Without_Feeds("Hide Zeros");
    

    TestModellerLogger.SetLastNodeGuid("ff3463ea-164a-4161-aed7-894c35fa69aa");
    _clientbankct.Select_Unre_Tran("Show All");
    

    TestModellerLogger.SetLastNodeGuid("7eecec73-eb7a-43b5-91b1-43fb469589f9");
    _clientbankct.Click_Update_bttn();
    

    }

    @Test  (groups= {"Bank_Feed_bnkact","Bank_Feed_bnkact - Bankfeed"})
    @TestModellerPath(guid = "a1c1a70f-5101-4887-b5fa-ea76722bdb97")
    public void GoToUrlClickBNKFDLinkClickReportsmenu4ClickClientBnkActlinkPositiveEnterClientName2PositiveSel3()
    {
        
        pages.BankFeed _BankFeed = new pages.BankFeed(driver);
    TestModellerLogger.SetLastNodeGuid("7b4ea64a-62cc-4420-9ae5-21929965cb15");
    _BankFeed.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("2cc5427a-9cd8-43c8-b7dc-5a2556fcd26c");
    _BankFeed.Click_BNK_FD_Link();
    

pages.clientbankct _clientbankct = new pages.clientbankct(driver);
    TestModellerLogger.SetLastNodeGuid("e0458110-032b-4eed-bb63-912211e60a97");
    _clientbankct.Click_Reportsmenu_4();
    

    TestModellerLogger.SetLastNodeGuid("b80fd689-c752-4969-a316-f64acd0ced90");
    _clientbankct.Click_Client_Bnk_Act_link();
    

    TestModellerLogger.SetLastNodeGuid("b292caf5-e9d6-4b7e-964a-1fc12ce8300f");
    _clientbankct.Enter_Client_Name2("placeat");
    

    TestModellerLogger.SetLastNodeGuid("fdfe879f-3bff-49b0-8d72-2bdc0e2a20b4");
    _clientbankct.Select_Client_Type2("Individual");
    

    TestModellerLogger.SetLastNodeGuid("6e6fd002-acc8-4dd9-9347-431bc98eb5e9");
    _clientbankct.Select_Without_Feeds("Show All");
    

    TestModellerLogger.SetLastNodeGuid("ff3463ea-164a-4161-aed7-894c35fa69aa");
    _clientbankct.Select_Unre_Tran("Show All");
    

    TestModellerLogger.SetLastNodeGuid("7eecec73-eb7a-43b5-91b1-43fb469589f9");
    _clientbankct.Click_Update_bttn();
    

    }

    @Test  (groups= {"Bank_Feed_bnkact","Bank_Feed_bnkact - Bankfeed"})
    @TestModellerPath(guid = "e68591e7-369f-491d-beec-70c95c764a14")
    public void GoToUrlClickBNKFDLinkClickReportsmenu4ClickClientBnkActlinkPositiveEnterClientName2PositiveSel4()
    {
        
        pages.BankFeed _BankFeed = new pages.BankFeed(driver);
    TestModellerLogger.SetLastNodeGuid("7b4ea64a-62cc-4420-9ae5-21929965cb15");
    _BankFeed.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("2cc5427a-9cd8-43c8-b7dc-5a2556fcd26c");
    _BankFeed.Click_BNK_FD_Link();
    

pages.clientbankct _clientbankct = new pages.clientbankct(driver);
    TestModellerLogger.SetLastNodeGuid("e0458110-032b-4eed-bb63-912211e60a97");
    _clientbankct.Click_Reportsmenu_4();
    

    TestModellerLogger.SetLastNodeGuid("b80fd689-c752-4969-a316-f64acd0ced90");
    _clientbankct.Click_Client_Bnk_Act_link();
    

    TestModellerLogger.SetLastNodeGuid("b292caf5-e9d6-4b7e-964a-1fc12ce8300f");
    _clientbankct.Enter_Client_Name2("maiores");
    

    TestModellerLogger.SetLastNodeGuid("fdfe879f-3bff-49b0-8d72-2bdc0e2a20b4");
    _clientbankct.Select_Client_Type2("LimitedCompany");
    

    TestModellerLogger.SetLastNodeGuid("6e6fd002-acc8-4dd9-9347-431bc98eb5e9");
    _clientbankct.Select_Without_Feeds("Show All");
    

    TestModellerLogger.SetLastNodeGuid("ff3463ea-164a-4161-aed7-894c35fa69aa");
    _clientbankct.Select_Unre_Tran("Show All");
    

    TestModellerLogger.SetLastNodeGuid("7eecec73-eb7a-43b5-91b1-43fb469589f9");
    _clientbankct.Click_Update_bttn();
    

    }

    @Test  (groups= {"Bank_Feed_bnkact","Bank_Feed_bnkact - Bankfeed"})
    @TestModellerPath(guid = "c6f5abd9-6c5a-4bae-93ba-a4425ebefcf3")
    public void GoToUrlClickBNKFDLinkClickReportsmenu4ClickClientBnkActlinkPositiveEnterClientName2PositiveSel5()
    {
        
        pages.BankFeed _BankFeed = new pages.BankFeed(driver);
    TestModellerLogger.SetLastNodeGuid("7b4ea64a-62cc-4420-9ae5-21929965cb15");
    _BankFeed.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("2cc5427a-9cd8-43c8-b7dc-5a2556fcd26c");
    _BankFeed.Click_BNK_FD_Link();
    

pages.clientbankct _clientbankct = new pages.clientbankct(driver);
    TestModellerLogger.SetLastNodeGuid("e0458110-032b-4eed-bb63-912211e60a97");
    _clientbankct.Click_Reportsmenu_4();
    

    TestModellerLogger.SetLastNodeGuid("b80fd689-c752-4969-a316-f64acd0ced90");
    _clientbankct.Click_Client_Bnk_Act_link();
    

    TestModellerLogger.SetLastNodeGuid("b292caf5-e9d6-4b7e-964a-1fc12ce8300f");
    _clientbankct.Enter_Client_Name2("praesentium");
    

    TestModellerLogger.SetLastNodeGuid("fdfe879f-3bff-49b0-8d72-2bdc0e2a20b4");
    _clientbankct.Select_Client_Type2("LLP");
    

    TestModellerLogger.SetLastNodeGuid("6e6fd002-acc8-4dd9-9347-431bc98eb5e9");
    _clientbankct.Select_Without_Feeds("Show All");
    

    TestModellerLogger.SetLastNodeGuid("ff3463ea-164a-4161-aed7-894c35fa69aa");
    _clientbankct.Select_Unre_Tran("Show All");
    

    TestModellerLogger.SetLastNodeGuid("7eecec73-eb7a-43b5-91b1-43fb469589f9");
    _clientbankct.Click_Update_bttn();
    

    }

    @Test  (groups= {"Bank_Feed_bnkact","Bank_Feed_bnkact - Bankfeed"})
    @TestModellerPath(guid = "c5649d1c-5aa8-47a1-844c-da7801b5ac59")
    public void GoToUrlClickBNKFDLinkClickReportsmenu4ClickClientBnkActlinkPositiveEnterClientName2PositiveSel6()
    {
        
        pages.BankFeed _BankFeed = new pages.BankFeed(driver);
    TestModellerLogger.SetLastNodeGuid("7b4ea64a-62cc-4420-9ae5-21929965cb15");
    _BankFeed.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("2cc5427a-9cd8-43c8-b7dc-5a2556fcd26c");
    _BankFeed.Click_BNK_FD_Link();
    

pages.clientbankct _clientbankct = new pages.clientbankct(driver);
    TestModellerLogger.SetLastNodeGuid("e0458110-032b-4eed-bb63-912211e60a97");
    _clientbankct.Click_Reportsmenu_4();
    

    TestModellerLogger.SetLastNodeGuid("b80fd689-c752-4969-a316-f64acd0ced90");
    _clientbankct.Click_Client_Bnk_Act_link();
    

    TestModellerLogger.SetLastNodeGuid("b292caf5-e9d6-4b7e-964a-1fc12ce8300f");
    _clientbankct.Enter_Client_Name2("incidunt");
    

    TestModellerLogger.SetLastNodeGuid("fdfe879f-3bff-49b0-8d72-2bdc0e2a20b4");
    _clientbankct.Select_Client_Type2("Partnership");
    

    TestModellerLogger.SetLastNodeGuid("6e6fd002-acc8-4dd9-9347-431bc98eb5e9");
    _clientbankct.Select_Without_Feeds("Show All");
    

    TestModellerLogger.SetLastNodeGuid("ff3463ea-164a-4161-aed7-894c35fa69aa");
    _clientbankct.Select_Unre_Tran("Show All");
    

    TestModellerLogger.SetLastNodeGuid("7eecec73-eb7a-43b5-91b1-43fb469589f9");
    _clientbankct.Click_Update_bttn();
    

    }

    @Test  (groups= {"Bank_Feed_bnkact","Bank_Feed_bnkact - Bankfeed"})
    @TestModellerPath(guid = "23987198-91b6-4b01-9719-42f44c52760b")
    public void GoToUrlClickBNKFDLinkClickReportsmenu4ClickClientBnkActlinkPositiveEnterClientName2PositiveSel7()
    {
        
        pages.BankFeed _BankFeed = new pages.BankFeed(driver);
    TestModellerLogger.SetLastNodeGuid("7b4ea64a-62cc-4420-9ae5-21929965cb15");
    _BankFeed.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("2cc5427a-9cd8-43c8-b7dc-5a2556fcd26c");
    _BankFeed.Click_BNK_FD_Link();
    

pages.clientbankct _clientbankct = new pages.clientbankct(driver);
    TestModellerLogger.SetLastNodeGuid("e0458110-032b-4eed-bb63-912211e60a97");
    _clientbankct.Click_Reportsmenu_4();
    

    TestModellerLogger.SetLastNodeGuid("b80fd689-c752-4969-a316-f64acd0ced90");
    _clientbankct.Click_Client_Bnk_Act_link();
    

    TestModellerLogger.SetLastNodeGuid("b292caf5-e9d6-4b7e-964a-1fc12ce8300f");
    _clientbankct.Enter_Client_Name2("et");
    

    TestModellerLogger.SetLastNodeGuid("fdfe879f-3bff-49b0-8d72-2bdc0e2a20b4");
    _clientbankct.Select_Client_Type2("PLC");
    

    TestModellerLogger.SetLastNodeGuid("6e6fd002-acc8-4dd9-9347-431bc98eb5e9");
    _clientbankct.Select_Without_Feeds("Show All");
    

    TestModellerLogger.SetLastNodeGuid("ff3463ea-164a-4161-aed7-894c35fa69aa");
    _clientbankct.Select_Unre_Tran("Show All");
    

    TestModellerLogger.SetLastNodeGuid("7eecec73-eb7a-43b5-91b1-43fb469589f9");
    _clientbankct.Click_Update_bttn();
    

    }

    @Test  (groups= {"Bank_Feed_bnkact","Bank_Feed_bnkact - Bankfeed"})
    @TestModellerPath(guid = "4dae8cf1-8a41-44e2-a6b3-0c2d797f79cf")
    public void GoToUrlClickBNKFDLinkClickReportsmenu4ClickClientBnkActlinkPositiveEnterClientName2PositiveSel8()
    {
        
        pages.BankFeed _BankFeed = new pages.BankFeed(driver);
    TestModellerLogger.SetLastNodeGuid("7b4ea64a-62cc-4420-9ae5-21929965cb15");
    _BankFeed.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("2cc5427a-9cd8-43c8-b7dc-5a2556fcd26c");
    _BankFeed.Click_BNK_FD_Link();
    

pages.clientbankct _clientbankct = new pages.clientbankct(driver);
    TestModellerLogger.SetLastNodeGuid("e0458110-032b-4eed-bb63-912211e60a97");
    _clientbankct.Click_Reportsmenu_4();
    

    TestModellerLogger.SetLastNodeGuid("b80fd689-c752-4969-a316-f64acd0ced90");
    _clientbankct.Click_Client_Bnk_Act_link();
    

    TestModellerLogger.SetLastNodeGuid("b292caf5-e9d6-4b7e-964a-1fc12ce8300f");
    _clientbankct.Enter_Client_Name2("hic");
    

    TestModellerLogger.SetLastNodeGuid("fdfe879f-3bff-49b0-8d72-2bdc0e2a20b4");
    _clientbankct.Select_Client_Type2("SoleTrader");
    

    TestModellerLogger.SetLastNodeGuid("6e6fd002-acc8-4dd9-9347-431bc98eb5e9");
    _clientbankct.Select_Without_Feeds("Show All");
    

    TestModellerLogger.SetLastNodeGuid("ff3463ea-164a-4161-aed7-894c35fa69aa");
    _clientbankct.Select_Unre_Tran("Show All");
    

    TestModellerLogger.SetLastNodeGuid("7eecec73-eb7a-43b5-91b1-43fb469589f9");
    _clientbankct.Click_Update_bttn();
    

    }*/
