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
import utilities.ExcelUtility;
import utilities.testmodeller.TestModellerLogger;

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/f27b71ae-8791-4857-91a0-a7923c864a26
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1030, profileId = 100935)
public class VerifyUnreconcilledtrans_UnreconciledTran extends TestBase
{
	String sTestCaseID=null;
    String[] data=null;
    
    String Sheet =null;
  
    @Test  (groups= {"Verify Unreconcilled_trans","Verify Unreconcilled_trans - Unreconciled_Tran"})
    @TestModellerPath(guid = "37307f2a-03b8-4685-9cec-cc3df7f6f297")
    public void UnreconciledTranGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAsser1() throws InterruptedException, IOException, InvalidFormatException, HeadlessException, AWTException
    {
    	sTestCaseID="TC1";
    	Sheet="Sheet1";
    	data =ExcelUtility.toReadExcelData("TC1", "Sheet1");
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
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

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
    

pages.PartialReconciledCases.bankmenu _bankmenu = new pages.PartialReconciledCases.bankmenu(driver);
    TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
    _bankmenu.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
//    _bankmenu.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
    _bankmenu.Click_Bankingmenu();
    

    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
    _bankmenu.Click_Newmenu();
    

pages.PartialReconciledCases.nBANKTRN _nBANKTRN = new pages.PartialReconciledCases.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

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
    

    TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
    _nBANKTRN.Select_Select_VATRate(data[10]);
    

//    TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
//    _nBANKTRN.Click_Select_Option1();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
//    _nBANKTRN.Enter_BOX2(data[11]);
    

//    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
//    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

pages.PartialReconciledCases.unconcilledbutn _unconcilledbutn = new pages.PartialReconciledCases.unconcilledbutn(driver);
    TestModellerLogger.SetLastNodeGuid("dd35ab3f-9a3f-41c8-b46a-f878062d2bd4");
    _unconcilledbutn.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("23d80cba-07ce-43f2-a76a-1d33bb41b05a");
//    _unconcilledbutn.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("3707d400-fede-4a41-968e-5d3eb200b18e");
    _unconcilledbutn.Click_Unreconciled_Transactions_button1();
    

pages.PartialReconciledCases.UnreconciledSearch _UnreconciledSearch = new pages.PartialReconciledCases.UnreconciledSearch(driver);
    TestModellerLogger.SetLastNodeGuid("3846d5f2-85cb-4331-8ccf-bb60a8dfac36");
    _UnreconciledSearch.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("a9f96659-b0f0-46ef-89bc-1484dae69392");
//    _UnreconciledSearch.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("8a7edde5-a78b-402b-81df-9d97b660150b");
    _UnreconciledSearch.Select_BNK_Account("nidhi2");
    

    TestModellerLogger.SetLastNodeGuid("ac3ace08-4d39-4b7c-97f3-78d3616dcab3");
    _UnreconciledSearch.Select_Date_Range("This Month");
    

    TestModellerLogger.SetLastNodeGuid("a0e3ae95-061e-4cf4-b06d-2edc81e5debe");
    _UnreconciledSearch.Enter_DateFrom11("02/02/2021");
    

    TestModellerLogger.SetLastNodeGuid("325bf592-ccb5-4649-b30d-6826c5c0d452");
    _UnreconciledSearch.Enter_DateTo12("31/12/2021");
    

    TestModellerLogger.SetLastNodeGuid("d030e7a9-5261-4df2-b2d2-6cc07e70504d");
    _UnreconciledSearch.Click_Update_BTNN();
    

pages.PartialReconciledCases.unconsiledgrid _unconsiledgrid = new pages.PartialReconciledCases.unconsiledgrid(driver);
    TestModellerLogger.SetLastNodeGuid("3d411e3c-5c3f-4153-b926-4e346a8a622e");
    _unconsiledgrid.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("b9b2843c-608d-48cc-a40d-37a9536817a3");
//    _unconsiledgrid.AssertUrl();
  

    TestModellerLogger.SetLastNodeGuid("bda1776b-d5b9-4cb9-a48d-3bb511b93e58");
    _unconsiledgrid.Click_checkbox1();
    

    TestModellerLogger.SetLastNodeGuid("5e358f1f-8cf3-4256-81c2-c8eeceee3c19");
    _unconsiledgrid.Click_Select_an_option3();
    

    TestModellerLogger.SetLastNodeGuid("daee70a0-1b56-4d5e-bae4-47f9d0b01817");
    _unconsiledgrid.Enter_innerbox("1070 - Nidhi");
    

    TestModellerLogger.SetLastNodeGuid("18fa7be0-bc13-46ae-af3a-34d2550b7a23");
    _unconsiledgrid.Click_Reconcile_btn1();
    
    }
   

}
/*


    @Test  (groups= {"Verify Unreconcilled_trans","Verify Unreconcilled_trans - Unreconciled_Tran"})
    @TestModellerPath(guid = "80558782-003a-4f65-b9e0-a8ea88570426")
    public void UnreconciledTranGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAsser2() throws InterruptedException, IOException
    {
        
    	sTestCaseID="TC2";
    	Sheet="Sheet1";
    	data =ExcelData.toReadExcelData("TC2", "Sheet1");
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
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    
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
    

pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
    _bankmenu.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
//    _bankmenu.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
    _bankmenu.Click_Bankingmenu();
    

    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
    _bankmenu.Click_Newmenu();
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    
//
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
    

    TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
    _nBANKTRN.Select_Select_VATRate(data[10]);
    

//    TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
//    _nBANKTRN.Click_Select_Option1();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
//    _nBANKTRN.Enter_BOX2(data[11]);
//    

//    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
//    _nBANKTRN.Click__1400_DATA();
//    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

pages.unconcilledbutn _unconcilledbutn = new pages.unconcilledbutn(driver);
    TestModellerLogger.SetLastNodeGuid("dd35ab3f-9a3f-41c8-b46a-f878062d2bd4");
    _unconcilledbutn.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("23d80cba-07ce-43f2-a76a-1d33bb41b05a");
//    _unconcilledbutn.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("3707d400-fede-4a41-968e-5d3eb200b18e");
    _unconcilledbutn.Click_Unreconciled_Transactions_button1();
    

pages.UnreconciledSearch _UnreconciledSearch = new pages.UnreconciledSearch(driver);
    TestModellerLogger.SetLastNodeGuid("3846d5f2-85cb-4331-8ccf-bb60a8dfac36");
    _UnreconciledSearch.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("a9f96659-b0f0-46ef-89bc-1484dae69392");
//    _UnreconciledSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8a7edde5-a78b-402b-81df-9d97b660150b");
    _UnreconciledSearch.Select_BNK_Account("nidhi2");
    

    TestModellerLogger.SetLastNodeGuid("ac3ace08-4d39-4b7c-97f3-78d3616dcab3");
    _UnreconciledSearch.Select_Date_Range("This Month");
   

    TestModellerLogger.SetLastNodeGuid("a0e3ae95-061e-4cf4-b06d-2edc81e5debe");
    _UnreconciledSearch.Enter_DateFrom11("02/02/2021");
    

    TestModellerLogger.SetLastNodeGuid("325bf592-ccb5-4649-b30d-6826c5c0d452");
    _UnreconciledSearch.Enter_DateTo12("31/12/2021");
    

    TestModellerLogger.SetLastNodeGuid("d030e7a9-5261-4df2-b2d2-6cc07e70504d");
    _UnreconciledSearch.Click_Update_BTNN();
    

pages.unconsiledgrid _unconsiledgrid = new pages.unconsiledgrid(driver);
    TestModellerLogger.SetLastNodeGuid("3d411e3c-5c3f-4153-b926-4e346a8a622e");
    _unconsiledgrid.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("b9b2843c-608d-48cc-a40d-37a9536817a3");
//    _unconsiledgrid.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("bda1776b-d5b9-4cb9-a48d-3bb511b93e58");
    _unconsiledgrid.Click_checkbox1();
    

    TestModellerLogger.SetLastNodeGuid("5e358f1f-8cf3-4256-81c2-c8eeceee3c19");
    _unconsiledgrid.Click_Select_an_option3();
    

    TestModellerLogger.SetLastNodeGuid("daee70a0-1b56-4d5e-bae4-47f9d0b01817");
    _unconsiledgrid.Enter_innerbox("1070 - Nidhi");
    

    TestModellerLogger.SetLastNodeGuid("18fa7be0-bc13-46ae-af3a-34d2550b7a23");
    _unconsiledgrid.Click_Reconcile_btn1();
    

    }

    @Test  (groups= {"Verify Unreconcilled_trans","Verify Unreconcilled_trans - Unreconciled_Tran"})
    @TestModellerPath(guid = "ed147655-7ed7-4146-b8cc-f04e08c4d865")
    public void UnreconciledTranGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAsser3() throws InterruptedException, IOException
    {
    	sTestCaseID="TC3";
    	Sheet="Sheet1";
    	data =ExcelData.toReadExcelData("TC3", "Sheet1");
        pages.nlogin _nlogin = new pages.nlogin(driver); 
    	

    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    
//
//    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN(data[1]);
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS(data[2]);
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    
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
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
//    _Searchclient.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
    _bankmenu.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
//    _bankmenu.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
    _bankmenu.Click_Bankingmenu();
    

    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
    _bankmenu.Click_Newmenu();
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

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
    

    TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
    _nBANKTRN.Select_Select_VATRate(data[10]);
    

//    TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
//    _nBANKTRN.Click_Select_Option1();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
//    _nBANKTRN.Enter_BOX2(data[11]);
    
//
//    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
//    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

pages.unconcilledbutn _unconcilledbutn = new pages.unconcilledbutn(driver);
    TestModellerLogger.SetLastNodeGuid("dd35ab3f-9a3f-41c8-b46a-f878062d2bd4");
    _unconcilledbutn.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("23d80cba-07ce-43f2-a76a-1d33bb41b05a");
//    _unconcilledbutn.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("3707d400-fede-4a41-968e-5d3eb200b18e");
    _unconcilledbutn.Click_Unreconciled_Transactions_button1();
    

pages.UnreconciledSearch _UnreconciledSearch = new pages.UnreconciledSearch(driver);
    TestModellerLogger.SetLastNodeGuid("3846d5f2-85cb-4331-8ccf-bb60a8dfac36");
    _UnreconciledSearch.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("a9f96659-b0f0-46ef-89bc-1484dae69392");
//    _UnreconciledSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8a7edde5-a78b-402b-81df-9d97b660150b");
    _UnreconciledSearch.Select_BNK_Account("nidhi2");
    

//    TestModellerLogger.SetLastNodeGuid("ac3ace08-4d39-4b7c-97f3-78d3616dcab3");
//    _UnreconciledSearch.Select_Date_Range("This Month");
    

    TestModellerLogger.SetLastNodeGuid("a0e3ae95-061e-4cf4-b06d-2edc81e5debe");
    _UnreconciledSearch.Enter_DateFrom11("02/02/2021");
    

    TestModellerLogger.SetLastNodeGuid("325bf592-ccb5-4649-b30d-6826c5c0d452");
    _UnreconciledSearch.Enter_DateTo12("31/12/2021");
    

    TestModellerLogger.SetLastNodeGuid("d030e7a9-5261-4df2-b2d2-6cc07e70504d");
    _UnreconciledSearch.Click_Update_BTNN();
    

pages.unconsiledgrid _unconsiledgrid = new pages.unconsiledgrid(driver);
    TestModellerLogger.SetLastNodeGuid("3d411e3c-5c3f-4153-b926-4e346a8a622e");
    _unconsiledgrid.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("b9b2843c-608d-48cc-a40d-37a9536817a3");
//    _unconsiledgrid.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("bda1776b-d5b9-4cb9-a48d-3bb511b93e58");
    _unconsiledgrid.Click_checkbox1();
    

    TestModellerLogger.SetLastNodeGuid("5e358f1f-8cf3-4256-81c2-c8eeceee3c19");
    _unconsiledgrid.Click_Select_an_option3();
    

    TestModellerLogger.SetLastNodeGuid("daee70a0-1b56-4d5e-bae4-47f9d0b01817");
    _unconsiledgrid.Enter_innerbox("1070 - Nidhi");
    

    TestModellerLogger.SetLastNodeGuid("18fa7be0-bc13-46ae-af3a-34d2550b7a23");
    _unconsiledgrid.Click_Reconcile_btn1();
    

    }

    @Test  (groups= {"Verify Unreconcilled_trans","Verify Unreconcilled_trans - Unreconciled_Tran"})
    @TestModellerPath(guid = "d7570810-a0e9-48d6-8426-dc1294d9d20c")
    public void UnreconciledTranGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAsser4() throws InterruptedException, IOException
    {
        
    	sTestCaseID="TC4";
    	Sheet="Sheet1";
    	data =ExcelData.toReadExcelData("TC1", "Sheet1");
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
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

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
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
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
    

pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
    _bankmenu.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
//    _bankmenu.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
    _bankmenu.Click_Bankingmenu();
    

    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
    _bankmenu.Click_Newmenu();
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
//    _nBANKTRN.AssertUrl();
//    

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
    

    TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
    _nBANKTRN.Select_Select_VATRate(data[10]);
    
//
//    TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
//    _nBANKTRN.Click_Select_Option1();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
//    _nBANKTRN.Enter_BOX2(data[11]);
    

//    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
//    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

pages.unconcilledbutn _unconcilledbutn = new pages.unconcilledbutn(driver);
    TestModellerLogger.SetLastNodeGuid("dd35ab3f-9a3f-41c8-b46a-f878062d2bd4");
    _unconcilledbutn.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("23d80cba-07ce-43f2-a76a-1d33bb41b05a");
//    _unconcilledbutn.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("3707d400-fede-4a41-968e-5d3eb200b18e");
    _unconcilledbutn.Click_Unreconciled_Transactions_button1();
    

pages.UnreconciledSearch _UnreconciledSearch = new pages.UnreconciledSearch(driver);
    TestModellerLogger.SetLastNodeGuid("3846d5f2-85cb-4331-8ccf-bb60a8dfac36");
    _UnreconciledSearch.GoToUrl();
    
//
//    TestModellerLogger.SetLastNodeGuid("a9f96659-b0f0-46ef-89bc-1484dae69392");
//    _UnreconciledSearch.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("8a7edde5-a78b-402b-81df-9d97b660150b");
    _UnreconciledSearch.Select_BNK_Account("nidhi2");
    

//    TestModellerLogger.SetLastNodeGuid("ac3ace08-4d39-4b7c-97f3-78d3616dcab3");
//    _UnreconciledSearch.Select_Date_Range("This Month");
    

    TestModellerLogger.SetLastNodeGuid("a0e3ae95-061e-4cf4-b06d-2edc81e5debe");
    _UnreconciledSearch.Enter_DateFrom11("02/02/2021");
    

    TestModellerLogger.SetLastNodeGuid("325bf592-ccb5-4649-b30d-6826c5c0d452");
    _UnreconciledSearch.Enter_DateTo12("31/12/2021");
    

    TestModellerLogger.SetLastNodeGuid("d030e7a9-5261-4df2-b2d2-6cc07e70504d");
    _UnreconciledSearch.Click_Update_BTNN();
    

pages.unconsiledgrid _unconsiledgrid = new pages.unconsiledgrid(driver);
    TestModellerLogger.SetLastNodeGuid("3d411e3c-5c3f-4153-b926-4e346a8a622e");
    _unconsiledgrid.GoToUrl();
    
//
//    TestModellerLogger.SetLastNodeGuid("b9b2843c-608d-48cc-a40d-37a9536817a3");
//    _unconsiledgrid.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("bda1776b-d5b9-4cb9-a48d-3bb511b93e58");
    _unconsiledgrid.Click_checkbox1();
    

    TestModellerLogger.SetLastNodeGuid("5e358f1f-8cf3-4256-81c2-c8eeceee3c19");
    _unconsiledgrid.Click_Select_an_option3();
    

    TestModellerLogger.SetLastNodeGuid("daee70a0-1b56-4d5e-bae4-47f9d0b01817");
    _unconsiledgrid.Enter_innerbox("1070 - Nidhi");
    

    TestModellerLogger.SetLastNodeGuid("18fa7be0-bc13-46ae-af3a-34d2550b7a23");
    _unconsiledgrid.Click_Reconcile_btn1();
    

    }

    @Test  (groups= {"Verify Unreconcilled_trans","Verify Unreconcilled_trans - Unreconciled_Tran"})
    @TestModellerPath(guid = "43e9f8cb-59b3-42d3-a42d-f7d840f76735")
    public void UnreconciledTranGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAsser5() throws InterruptedException, IOException
    {
        
    	sTestCaseID="TC5";
    	Sheet="Sheet1";
    	data =ExcelData.toReadExcelData("TC5", "Sheet1");
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
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    
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
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
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
    

pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
    _bankmenu.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
//    _bankmenu.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
    _bankmenu.Click_Bankingmenu();
    

    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
    _bankmenu.Click_Newmenu();
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
//    _nBANKTRN.AssertUrl();
//    

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
    

    TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
    _nBANKTRN.Select_Select_VATRate(data[10]);
    

//    TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
//    _nBANKTRN.Click_Select_Option1();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
//    _nBANKTRN.Enter_BOX2(data[11]);
    

//    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
//    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

pages.unconcilledbutn _unconcilledbutn = new pages.unconcilledbutn(driver);
    TestModellerLogger.SetLastNodeGuid("dd35ab3f-9a3f-41c8-b46a-f878062d2bd4");
    _unconcilledbutn.GoToUrl();
    
//
//    TestModellerLogger.SetLastNodeGuid("23d80cba-07ce-43f2-a76a-1d33bb41b05a");
//    _unconcilledbutn.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("3707d400-fede-4a41-968e-5d3eb200b18e");
    _unconcilledbutn.Click_Unreconciled_Transactions_button1();
    

pages.UnreconciledSearch _UnreconciledSearch = new pages.UnreconciledSearch(driver);
    TestModellerLogger.SetLastNodeGuid("3846d5f2-85cb-4331-8ccf-bb60a8dfac36");
    _UnreconciledSearch.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("a9f96659-b0f0-46ef-89bc-1484dae69392");
//    _UnreconciledSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8a7edde5-a78b-402b-81df-9d97b660150b");
    _UnreconciledSearch.Select_BNK_Account("nidhi2");
    

    TestModellerLogger.SetLastNodeGuid("ac3ace08-4d39-4b7c-97f3-78d3616dcab3");
    _UnreconciledSearch.Select_Date_Range("This Month");
    

    TestModellerLogger.SetLastNodeGuid("a0e3ae95-061e-4cf4-b06d-2edc81e5debe");
    _UnreconciledSearch.Enter_DateFrom11("02/02/2021");
    

    TestModellerLogger.SetLastNodeGuid("325bf592-ccb5-4649-b30d-6826c5c0d452");
    _UnreconciledSearch.Enter_DateTo12("31/12/2021");
    

    TestModellerLogger.SetLastNodeGuid("d030e7a9-5261-4df2-b2d2-6cc07e70504d");
    _UnreconciledSearch.Click_Update_BTNN();
    

pages.unconsiledgrid _unconsiledgrid = new pages.unconsiledgrid(driver);
    TestModellerLogger.SetLastNodeGuid("3d411e3c-5c3f-4153-b926-4e346a8a622e");
    _unconsiledgrid.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("b9b2843c-608d-48cc-a40d-37a9536817a3");
//    _unconsiledgrid.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("bda1776b-d5b9-4cb9-a48d-3bb511b93e58");
    _unconsiledgrid.Click_checkbox1();
    

    TestModellerLogger.SetLastNodeGuid("5e358f1f-8cf3-4256-81c2-c8eeceee3c19");
    _unconsiledgrid.Click_Select_an_option3();
    

    TestModellerLogger.SetLastNodeGuid("daee70a0-1b56-4d5e-bae4-47f9d0b01817");
    _unconsiledgrid.Enter_innerbox("1070 - Nidhi");
    

    TestModellerLogger.SetLastNodeGuid("18fa7be0-bc13-46ae-af3a-34d2550b7a23");
    _unconsiledgrid.Click_Reconcile_btn1();
    

    }

    @Test  (groups= {"Verify Unreconcilled_trans","Verify Unreconcilled_trans - Unreconciled_Tran"})
    @TestModellerPath(guid = "67663cbe-937c-4748-9420-a0e2e638be7c")
    public void UnreconciledTranGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAsser6() throws InterruptedException, IOException
    {
    	sTestCaseID="TC6";
    	Sheet="Sheet1";
    	data =ExcelData.toReadExcelData("TC6", "Sheet1");
 
        pages.nlogin _nlogin = new pages.nlogin(driver);
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
    

pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

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
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
//    _Searchclient.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
    _bankmenu.GoToUrl();
    
//
//    TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
//    _bankmenu.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
    _bankmenu.Click_Bankingmenu();
    

    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
    _bankmenu.Click_Newmenu();
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
//    _nBANKTRN.AssertUrl();
//    

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
    

    TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
    _nBANKTRN.Select_Select_VATRate(data[10]);
    

//    TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
//    _nBANKTRN.Click_Select_Option1();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
//    _nBANKTRN.Enter_BOX2(data[11]);
    

//    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
//    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

pages.unconcilledbutn _unconcilledbutn = new pages.unconcilledbutn(driver);
    TestModellerLogger.SetLastNodeGuid("dd35ab3f-9a3f-41c8-b46a-f878062d2bd4");
    _unconcilledbutn.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("23d80cba-07ce-43f2-a76a-1d33bb41b05a");
//    _unconcilledbutn.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("3707d400-fede-4a41-968e-5d3eb200b18e");
    _unconcilledbutn.Click_Unreconciled_Transactions_button1();
    

pages.UnreconciledSearch _UnreconciledSearch = new pages.UnreconciledSearch(driver);
    TestModellerLogger.SetLastNodeGuid("3846d5f2-85cb-4331-8ccf-bb60a8dfac36");
    _UnreconciledSearch.GoToUrl();
    
//
//    TestModellerLogger.SetLastNodeGuid("a9f96659-b0f0-46ef-89bc-1484dae69392");
//    _UnreconciledSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8a7edde5-a78b-402b-81df-9d97b660150b");
    _UnreconciledSearch.Select_BNK_Account("nidhi2");
    

    TestModellerLogger.SetLastNodeGuid("ac3ace08-4d39-4b7c-97f3-78d3616dcab3");
    _UnreconciledSearch.Select_Date_Range("This Quarter");
    

    TestModellerLogger.SetLastNodeGuid("a0e3ae95-061e-4cf4-b06d-2edc81e5debe");
    _UnreconciledSearch.Enter_DateFrom11("02/02/2021");
    

    TestModellerLogger.SetLastNodeGuid("325bf592-ccb5-4649-b30d-6826c5c0d452");
    _UnreconciledSearch.Enter_DateTo12("31/12/2021");
    

    TestModellerLogger.SetLastNodeGuid("d030e7a9-5261-4df2-b2d2-6cc07e70504d");
    _UnreconciledSearch.Click_Update_BTNN();
    

pages.unconsiledgrid _unconsiledgrid = new pages.unconsiledgrid(driver);
    TestModellerLogger.SetLastNodeGuid("3d411e3c-5c3f-4153-b926-4e346a8a622e");
    _unconsiledgrid.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("b9b2843c-608d-48cc-a40d-37a9536817a3");
//    _unconsiledgrid.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("bda1776b-d5b9-4cb9-a48d-3bb511b93e58");
    _unconsiledgrid.Click_checkbox1();
    

    TestModellerLogger.SetLastNodeGuid("5e358f1f-8cf3-4256-81c2-c8eeceee3c19");
    _unconsiledgrid.Click_Select_an_option3();
    

    TestModellerLogger.SetLastNodeGuid("daee70a0-1b56-4d5e-bae4-47f9d0b01817");
    _unconsiledgrid.Enter_innerbox("1070 - Nidhi");
    

    TestModellerLogger.SetLastNodeGuid("18fa7be0-bc13-46ae-af3a-34d2550b7a23");
    _unconsiledgrid.Click_Reconcile_btn1();
    

    }

    @Test  (groups= {"Verify Unreconcilled_trans","Verify Unreconcilled_trans - Unreconciled_Tran"})
    @TestModellerPath(guid = "d621dca2-e58b-4686-8002-06b8ee6f84a4")
    public void UnreconciledTranGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAsser7() throws InterruptedException, IOException
    {
    	sTestCaseID="TC7";
    	Sheet="Sheet1";
    	data =ExcelData.toReadExcelData("TC7", "Sheet1");
        pages.nlogin _nlogin = new pages.nlogin(driver); 
       
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
    

pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
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
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
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
    

pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
    _bankmenu.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
//    _bankmenu.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
    _bankmenu.Click_Bankingmenu();
    

    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
    _bankmenu.Click_Newmenu();
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    
//
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
    

    TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
    _nBANKTRN.Select_Select_VATRate(data[10]);
    

//    TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
//    _nBANKTRN.Click_Select_Option1();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
//    _nBANKTRN.Enter_BOX2(data[11]);
//    

//    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
//    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

pages.unconcilledbutn _unconcilledbutn = new pages.unconcilledbutn(driver);
    TestModellerLogger.SetLastNodeGuid("dd35ab3f-9a3f-41c8-b46a-f878062d2bd4");
    _unconcilledbutn.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("23d80cba-07ce-43f2-a76a-1d33bb41b05a");
//    _unconcilledbutn.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("3707d400-fede-4a41-968e-5d3eb200b18e");
    _unconcilledbutn.Click_Unreconciled_Transactions_button1();
    

pages.UnreconciledSearch _UnreconciledSearch = new pages.UnreconciledSearch(driver);
    TestModellerLogger.SetLastNodeGuid("3846d5f2-85cb-4331-8ccf-bb60a8dfac36");
    _UnreconciledSearch.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("a9f96659-b0f0-46ef-89bc-1484dae69392");
//    _UnreconciledSearch.AssertUrl();

    TestModellerLogger.SetLastNodeGuid("8a7edde5-a78b-402b-81df-9d97b660150b");
    _UnreconciledSearch.Select_BNK_Account("nidhi2");
    

 TestModellerLogger.SetLastNodeGuid("ac3ace08-4d39-4b7c-97f3-78d3616dcab3");
    _UnreconciledSearch.Select_Date_Range("This Financial Year");
    

    TestModellerLogger.SetLastNodeGuid("a0e3ae95-061e-4cf4-b06d-2edc81e5debe");
    _UnreconciledSearch.Enter_DateFrom11("02/02/2021");
    

    TestModellerLogger.SetLastNodeGuid("325bf592-ccb5-4649-b30d-6826c5c0d452");
    _UnreconciledSearch.Enter_DateTo12("31/12/2021");
    

    TestModellerLogger.SetLastNodeGuid("d030e7a9-5261-4df2-b2d2-6cc07e70504d");
    _UnreconciledSearch.Click_Update_BTNN();
    

pages.unconsiledgrid _unconsiledgrid = new pages.unconsiledgrid(driver);
    TestModellerLogger.SetLastNodeGuid("3d411e3c-5c3f-4153-b926-4e346a8a622e");
    _unconsiledgrid.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("b9b2843c-608d-48cc-a40d-37a9536817a3");
//    _unconsiledgrid.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("bda1776b-d5b9-4cb9-a48d-3bb511b93e58");
    _unconsiledgrid.Click_checkbox1();
    

    TestModellerLogger.SetLastNodeGuid("5e358f1f-8cf3-4256-81c2-c8eeceee3c19");
    _unconsiledgrid.Click_Select_an_option3();
    

    TestModellerLogger.SetLastNodeGuid("daee70a0-1b56-4d5e-bae4-47f9d0b01817");
    _unconsiledgrid.Enter_innerbox("1070 - Nidhi");
    

    TestModellerLogger.SetLastNodeGuid("18fa7be0-bc13-46ae-af3a-34d2550b7a23");
    _unconsiledgrid.Click_Reconcile_btn1();
    
    }
    
    @Test  (groups= {"Verify Unreconcilled_trans","Verify Unreconcilled_trans - Unreconciled_Tran"})
    @TestModellerPath(guid = "994f8c3b-4109-41cd-81b7-05f965c8a265")
    public void UnreconciledTranGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAsser8() throws InterruptedException, IOException
    {
        
    	sTestCaseID="TC8";
    	Sheet="Sheet1";
    	data =ExcelData.toReadExcelData("TC8", "Sheet1");
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
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
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
    

pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
    _bankmenu.GoToUrl();
    
//
//    TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
//    _bankmenu.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
    _bankmenu.Click_Bankingmenu();
    

    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
    _bankmenu.Click_Newmenu();
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

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
    

    TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
    _nBANKTRN.Select_Select_VATRate(data[10]);
    

//    TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
//    _nBANKTRN.Click_Select_Option1();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
//    _nBANKTRN.Enter_BOX2(data[11]);
 

//    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
//    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

pages.unconcilledbutn _unconcilledbutn = new pages.unconcilledbutn(driver);
    TestModellerLogger.SetLastNodeGuid("dd35ab3f-9a3f-41c8-b46a-f878062d2bd4");
    _unconcilledbutn.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("23d80cba-07ce-43f2-a76a-1d33bb41b05a");
//    _unconcilledbutn.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("3707d400-fede-4a41-968e-5d3eb200b18e");
    _unconcilledbutn.Click_Unreconciled_Transactions_button1();
    

pages.UnreconciledSearch _UnreconciledSearch = new pages.UnreconciledSearch(driver);
    TestModellerLogger.SetLastNodeGuid("3846d5f2-85cb-4331-8ccf-bb60a8dfac36");
    _UnreconciledSearch.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("a9f96659-b0f0-46ef-89bc-1484dae69392");
//    _UnreconciledSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8a7edde5-a78b-402b-81df-9d97b660150b");
    _UnreconciledSearch.Select_BNK_Account("nidhi2");
    

    TestModellerLogger.SetLastNodeGuid("ac3ace08-4d39-4b7c-97f3-78d3616dcab3");
    _UnreconciledSearch.Select_Date_Range("This Financial Year");
    

    TestModellerLogger.SetLastNodeGuid("a0e3ae95-061e-4cf4-b06d-2edc81e5debe");
    _UnreconciledSearch.Enter_DateFrom11("02/02/2021");
    

    TestModellerLogger.SetLastNodeGuid("325bf592-ccb5-4649-b30d-6826c5c0d452");
    _UnreconciledSearch.Enter_DateTo12("31/12/2021");
    

    TestModellerLogger.SetLastNodeGuid("d030e7a9-5261-4df2-b2d2-6cc07e70504d");
    _UnreconciledSearch.Click_Update_BTNN();
    

pages.unconsiledgrid _unconsiledgrid = new pages.unconsiledgrid(driver);
    TestModellerLogger.SetLastNodeGuid("3d411e3c-5c3f-4153-b926-4e346a8a622e");
    _unconsiledgrid.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("b9b2843c-608d-48cc-a40d-37a9536817a3");
//    _unconsiledgrid.AssertUrl();
 

    TestModellerLogger.SetLastNodeGuid("bda1776b-d5b9-4cb9-a48d-3bb511b93e58");
    _unconsiledgrid.Click_checkbox1();
    

    TestModellerLogger.SetLastNodeGuid("5e358f1f-8cf3-4256-81c2-c8eeceee3c19");
    _unconsiledgrid.Click_Select_an_option3();
    

    TestModellerLogger.SetLastNodeGuid("daee70a0-1b56-4d5e-bae4-47f9d0b01817");
    _unconsiledgrid.Enter_innerbox("1070 - Nidhi");
    

    TestModellerLogger.SetLastNodeGuid("18fa7be0-bc13-46ae-af3a-34d2550b7a23");
    _unconsiledgrid.Click_Reconcile_btn1();
    

    }

    @Test  (groups= {"Verify Unreconcilled_trans","Verify Unreconcilled_trans - Unreconciled_Tran"})
    @TestModellerPath(guid = "33d9b9e8-2adc-462e-af73-cc1087226f12")
    public void UnreconciledTranGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAsser9() throws InterruptedException, IOException
    {
        
    	sTestCaseID="TC9";
    	Sheet="Sheet1";
    	data =ExcelData.toReadExcelData("TC9", "Sheet1");
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
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
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
    

pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
    _bankmenu.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
//    _bankmenu.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
    _bankmenu.Click_Bankingmenu();
    

    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
    _bankmenu.Click_Newmenu();
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

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
    

    TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
    _nBANKTRN.Select_Select_VATRate(data[10]);
    

//    TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
//    _nBANKTRN.Click_Select_Option1();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
//    _nBANKTRN.Enter_BOX2(data[11]);
    

//    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
//    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

pages.unconcilledbutn _unconcilledbutn = new pages.unconcilledbutn(driver);
    TestModellerLogger.SetLastNodeGuid("dd35ab3f-9a3f-41c8-b46a-f878062d2bd4");
    _unconcilledbutn.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("23d80cba-07ce-43f2-a76a-1d33bb41b05a");
//    _unconcilledbutn.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("3707d400-fede-4a41-968e-5d3eb200b18e");
    _unconcilledbutn.Click_Unreconciled_Transactions_button1();
    

pages.UnreconciledSearch _UnreconciledSearch = new pages.UnreconciledSearch(driver);
    TestModellerLogger.SetLastNodeGuid("3846d5f2-85cb-4331-8ccf-bb60a8dfac36");
    _UnreconciledSearch.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("a9f96659-b0f0-46ef-89bc-1484dae69392");
//    _UnreconciledSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8a7edde5-a78b-402b-81df-9d97b660150b");
    _UnreconciledSearch.Select_BNK_Account("nidhi2");
    

    TestModellerLogger.SetLastNodeGuid("ac3ace08-4d39-4b7c-97f3-78d3616dcab3");
    _UnreconciledSearch.Select_Date_Range("Last Quarter");
    

    TestModellerLogger.SetLastNodeGuid("a0e3ae95-061e-4cf4-b06d-2edc81e5debe");
    _UnreconciledSearch.Enter_DateFrom11("02/02/2021");
    

    TestModellerLogger.SetLastNodeGuid("325bf592-ccb5-4649-b30d-6826c5c0d452");
    _UnreconciledSearch.Enter_DateTo12("31/12/2021");
    

    TestModellerLogger.SetLastNodeGuid("d030e7a9-5261-4df2-b2d2-6cc07e70504d");
    _UnreconciledSearch.Click_Update_BTNN();
    

pages.unconsiledgrid _unconsiledgrid = new pages.unconsiledgrid(driver);
    TestModellerLogger.SetLastNodeGuid("3d411e3c-5c3f-4153-b926-4e346a8a622e");
    _unconsiledgrid.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("b9b2843c-608d-48cc-a40d-37a9536817a3");
//    _unconsiledgrid.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("bda1776b-d5b9-4cb9-a48d-3bb511b93e58");
    _unconsiledgrid.Click_checkbox1();
    

//    TestModellerLogger.SetLastNodeGuid("5e358f1f-8cf3-4256-81c2-c8eeceee3c19");
//    _unconsiledgrid.Click_Select_an_option3();
//    
//
//    TestModellerLogger.SetLastNodeGuid("daee70a0-1b56-4d5e-bae4-47f9d0b01817");
//    _unconsiledgrid.Enter_innerbox("1070 - Nidhi");
    

    TestModellerLogger.SetLastNodeGuid("18fa7be0-bc13-46ae-af3a-34d2550b7a23");
    _unconsiledgrid.Click_Reconcile_btn1();
    

    }

    @Test  (groups= {"Verify Unreconcilled_trans","Verify Unreconcilled_trans - Unreconciled_Tran"})
    @TestModellerPath(guid = "87115034-833b-4c47-a62a-f0ec7fb5f621")
    public void UnreconciledTranGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAsse10() throws InterruptedException, IOException
    {
        
    	sTestCaseID="TC10";
    	Sheet="Sheet1";
    	data =ExcelData.toReadExcelData("TC10", "Sheet1");
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
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
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
    

pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
    _bankmenu.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
//    _bankmenu.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
    _bankmenu.Click_Bankingmenu();
    

    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
    _bankmenu.Click_Newmenu();
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

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
    

    TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
    _nBANKTRN.Select_Select_VATRate(data[10]);
    

//    TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
//    _nBANKTRN.Click_Select_Option1();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
//    _nBANKTRN.Enter_BOX2(data[11]);
    

//    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
//    _nBANKTRN.Click__1400_DATA();
   

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

pages.unconcilledbutn _unconcilledbutn = new pages.unconcilledbutn(driver);
    TestModellerLogger.SetLastNodeGuid("dd35ab3f-9a3f-41c8-b46a-f878062d2bd4");
    _unconcilledbutn.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("23d80cba-07ce-43f2-a76a-1d33bb41b05a");
//    _unconcilledbutn.AssertUrl();


    TestModellerLogger.SetLastNodeGuid("3707d400-fede-4a41-968e-5d3eb200b18e");
    _unconcilledbutn.Click_Unreconciled_Transactions_button1();
    

pages.UnreconciledSearch _UnreconciledSearch = new pages.UnreconciledSearch(driver);
    TestModellerLogger.SetLastNodeGuid("3846d5f2-85cb-4331-8ccf-bb60a8dfac36");
    _UnreconciledSearch.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("a9f96659-b0f0-46ef-89bc-1484dae69392");
//    _UnreconciledSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8a7edde5-a78b-402b-81df-9d97b660150b");
    _UnreconciledSearch.Select_BNK_Account("nidhi2");
    

    TestModellerLogger.SetLastNodeGuid("ac3ace08-4d39-4b7c-97f3-78d3616dcab3");
    _UnreconciledSearch.Select_Date_Range("Last Financial Year");
    

    TestModellerLogger.SetLastNodeGuid("a0e3ae95-061e-4cf4-b06d-2edc81e5debe");
    _UnreconciledSearch.Enter_DateFrom11("02/02/2021");
    

    TestModellerLogger.SetLastNodeGuid("325bf592-ccb5-4649-b30d-6826c5c0d452");
    _UnreconciledSearch.Enter_DateTo12("31/12/2021");
    

    TestModellerLogger.SetLastNodeGuid("d030e7a9-5261-4df2-b2d2-6cc07e70504d");
    _UnreconciledSearch.Click_Update_BTNN();
    

pages.unconsiledgrid _unconsiledgrid = new pages.unconsiledgrid(driver);
    TestModellerLogger.SetLastNodeGuid("3d411e3c-5c3f-4153-b926-4e346a8a622e");
    _unconsiledgrid.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("b9b2843c-608d-48cc-a40d-37a9536817a3");
//    _unconsiledgrid.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("bda1776b-d5b9-4cb9-a48d-3bb511b93e58");
    _unconsiledgrid.Click_checkbox1();
    

    TestModellerLogger.SetLastNodeGuid("5e358f1f-8cf3-4256-81c2-c8eeceee3c19");
    _unconsiledgrid.Click_Select_an_option3();
    

    TestModellerLogger.SetLastNodeGuid("daee70a0-1b56-4d5e-bae4-47f9d0b01817");
    _unconsiledgrid.Enter_innerbox("1070 - nidhi");
    

    TestModellerLogger.SetLastNodeGuid("18fa7be0-bc13-46ae-af3a-34d2550b7a23");
    _unconsiledgrid.Click_Reconcile_btn1();
    

    }

    @Test  (groups= {"Verify Unreconcilled_trans","Verify Unreconcilled_trans - Unreconciled_Tran"})
    @TestModellerPath(guid = "88b3f318-6d71-448c-97d9-83a2229ea4c6")
    public void UnreconciledTranGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAsse11() throws InterruptedException, IOException
    {
        
    	sTestCaseID="TC11";
    	Sheet="Sheet1";
    	data =ExcelData.toReadExcelData("TC11", "Sheet1");
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
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
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
    

pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
    _bankmenu.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
//    _bankmenu.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
    _bankmenu.Click_Bankingmenu();
    

    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
    _bankmenu.Click_Newmenu();
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

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
    

    TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
    _nBANKTRN.Select_Select_VATRate(data[10]);
    

//    TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
//    _nBANKTRN.Click_Select_Option1();
   

//    TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
//    _nBANKTRN.Enter_BOX2(data[11]);
    

//    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
//    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

pages.unconcilledbutn _unconcilledbutn = new pages.unconcilledbutn(driver);
    TestModellerLogger.SetLastNodeGuid("dd35ab3f-9a3f-41c8-b46a-f878062d2bd4");
    _unconcilledbutn.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("23d80cba-07ce-43f2-a76a-1d33bb41b05a");
//    _unconcilledbutn.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("3707d400-fede-4a41-968e-5d3eb200b18e");
    _unconcilledbutn.Click_Unreconciled_Transactions_button1();
    

pages.UnreconciledSearch _UnreconciledSearch = new pages.UnreconciledSearch(driver);
    TestModellerLogger.SetLastNodeGuid("3846d5f2-85cb-4331-8ccf-bb60a8dfac36");
    _UnreconciledSearch.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("a9f96659-b0f0-46ef-89bc-1484dae69392");
//    _UnreconciledSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8a7edde5-a78b-402b-81df-9d97b660150b");
    _UnreconciledSearch.Select_BNK_Account("nidhi2");
    

    TestModellerLogger.SetLastNodeGuid("ac3ace08-4d39-4b7c-97f3-78d3616dcab3");
    _UnreconciledSearch.Select_Date_Range("Month To Date");
    

    TestModellerLogger.SetLastNodeGuid("a0e3ae95-061e-4cf4-b06d-2edc81e5debe");
    _UnreconciledSearch.Enter_DateFrom11("02/02/2021");
    

    TestModellerLogger.SetLastNodeGuid("325bf592-ccb5-4649-b30d-6826c5c0d452");
    _UnreconciledSearch.Enter_DateTo12("31/12/2021");
    

    TestModellerLogger.SetLastNodeGuid("d030e7a9-5261-4df2-b2d2-6cc07e70504d");
    _UnreconciledSearch.Click_Update_BTNN();
    

pages.unconsiledgrid _unconsiledgrid = new pages.unconsiledgrid(driver);
    TestModellerLogger.SetLastNodeGuid("3d411e3c-5c3f-4153-b926-4e346a8a622e");
    _unconsiledgrid.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("b9b2843c-608d-48cc-a40d-37a9536817a3");
//    _unconsiledgrid.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("bda1776b-d5b9-4cb9-a48d-3bb511b93e58");
    _unconsiledgrid.Click_checkbox1();
    

    TestModellerLogger.SetLastNodeGuid("5e358f1f-8cf3-4256-81c2-c8eeceee3c19");
    _unconsiledgrid.Click_Select_an_option3();
    

    TestModellerLogger.SetLastNodeGuid("daee70a0-1b56-4d5e-bae4-47f9d0b01817");
    _unconsiledgrid.Enter_innerbox("1070 - Nidhi");
    

    TestModellerLogger.SetLastNodeGuid("18fa7be0-bc13-46ae-af3a-34d2550b7a23");
    _unconsiledgrid.Click_Reconcile_btn1();
    

    }

    @Test  (groups= {"Verify Unreconcilled_trans","Verify Unreconcilled_trans - Unreconciled_Tran"})
    @TestModellerPath(guid = "69e06da6-6514-4535-941b-f5bae7fd7a27")
    public void UnreconciledTranGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAsse12() throws InterruptedException, IOException
    {
        
    	sTestCaseID="TC12";
    	Sheet="Sheet1";
    	data =ExcelData.toReadExcelData("TC12", "Sheet1");
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
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
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
    

pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
    _bankmenu.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
//    _bankmenu.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
    _bankmenu.Click_Bankingmenu();
    

    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
    _bankmenu.Click_Newmenu();
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

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
    

    TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
    _nBANKTRN.Select_Select_VATRate(data[10]);
    

//    TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
//    _nBANKTRN.Click_Select_Option1();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
//    _nBANKTRN.Enter_BOX2("");
    

//    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
//    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

pages.unconcilledbutn _unconcilledbutn = new pages.unconcilledbutn(driver);
    TestModellerLogger.SetLastNodeGuid("dd35ab3f-9a3f-41c8-b46a-f878062d2bd4");
    _unconcilledbutn.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("23d80cba-07ce-43f2-a76a-1d33bb41b05a");
//    _unconcilledbutn.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("3707d400-fede-4a41-968e-5d3eb200b18e");
    _unconcilledbutn.Click_Unreconciled_Transactions_button1();
    

pages.UnreconciledSearch _UnreconciledSearch = new pages.UnreconciledSearch(driver);
    TestModellerLogger.SetLastNodeGuid("3846d5f2-85cb-4331-8ccf-bb60a8dfac36");
    _UnreconciledSearch.GoToUrl();

//    TestModellerLogger.SetLastNodeGuid("a9f96659-b0f0-46ef-89bc-1484dae69392");
//    _UnreconciledSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8a7edde5-a78b-402b-81df-9d97b660150b");
    _UnreconciledSearch.Select_BNK_Account("nidhi2");
    

    TestModellerLogger.SetLastNodeGuid("ac3ace08-4d39-4b7c-97f3-78d3616dcab3");
    _UnreconciledSearch.Select_Date_Range("Quarter To Date");
    

    TestModellerLogger.SetLastNodeGuid("a0e3ae95-061e-4cf4-b06d-2edc81e5debe");
    _UnreconciledSearch.Enter_DateFrom11("02/02/2021");
    

    TestModellerLogger.SetLastNodeGuid("325bf592-ccb5-4649-b30d-6826c5c0d452");
    _UnreconciledSearch.Enter_DateTo12("31/12/2021");
    

    TestModellerLogger.SetLastNodeGuid("d030e7a9-5261-4df2-b2d2-6cc07e70504d");
    _UnreconciledSearch.Click_Update_BTNN();
    

pages.unconsiledgrid _unconsiledgrid = new pages.unconsiledgrid(driver);
    TestModellerLogger.SetLastNodeGuid("3d411e3c-5c3f-4153-b926-4e346a8a622e");
    _unconsiledgrid.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("b9b2843c-608d-48cc-a40d-37a9536817a3");
//    _unconsiledgrid.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("bda1776b-d5b9-4cb9-a48d-3bb511b93e58");
    _unconsiledgrid.Click_checkbox1();
    

    TestModellerLogger.SetLastNodeGuid("5e358f1f-8cf3-4256-81c2-c8eeceee3c19");
    _unconsiledgrid.Click_Select_an_option3();
    

    TestModellerLogger.SetLastNodeGuid("daee70a0-1b56-4d5e-bae4-47f9d0b01817");
    _unconsiledgrid.Enter_innerbox("1070 - Nidhi");
    

    TestModellerLogger.SetLastNodeGuid("18fa7be0-bc13-46ae-af3a-34d2550b7a23");
    _unconsiledgrid.Click_Reconcile_btn1();
    

    }

    @Test  (groups= {"Verify Unreconcilled_trans","Verify Unreconcilled_trans - Unreconciled_Tran"})
    @TestModellerPath(guid = "7b65ab1f-b0c6-433b-88e5-9521b21b37b7")
    public void UnreconciledTranGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAsse13() throws InterruptedException, IOException
    {
        
    	sTestCaseID="TC13";
    	Sheet="Sheet1";
    	data =ExcelData.toReadExcelData("TC13", "Sheet1");
        pages.nlogin _nlogin = new pages.nlogin(driver);
        
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    
//
//    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN(data[1]);
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS(data[2]);
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
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
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
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
    

pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
    _bankmenu.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
//    _bankmenu.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
    _bankmenu.Click_Bankingmenu();
    

    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
    _bankmenu.Click_Newmenu();
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

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
    

    TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
    _nBANKTRN.Select_Select_VATRate(data[10]);
    

//    TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
//    _nBANKTRN.Click_Select_Option1();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
//    _nBANKTRN.Enter_BOX2("1070");
    

//    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
//    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

pages.unconcilledbutn _unconcilledbutn = new pages.unconcilledbutn(driver);
    TestModellerLogger.SetLastNodeGuid("dd35ab3f-9a3f-41c8-b46a-f878062d2bd4");
    _unconcilledbutn.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("23d80cba-07ce-43f2-a76a-1d33bb41b05a");
//    _unconcilledbutn.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("3707d400-fede-4a41-968e-5d3eb200b18e");
    _unconcilledbutn.Click_Unreconciled_Transactions_button1();
    

pages.UnreconciledSearch _UnreconciledSearch = new pages.UnreconciledSearch(driver);
    TestModellerLogger.SetLastNodeGuid("3846d5f2-85cb-4331-8ccf-bb60a8dfac36");
    _UnreconciledSearch.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("a9f96659-b0f0-46ef-89bc-1484dae69392");
//    _UnreconciledSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8a7edde5-a78b-402b-81df-9d97b660150b");
    _UnreconciledSearch.Select_BNK_Account("nidhi2");
    

    TestModellerLogger.SetLastNodeGuid("ac3ace08-4d39-4b7c-97f3-78d3616dcab3");
    _UnreconciledSearch.Select_Date_Range("Year To Date");
    

    TestModellerLogger.SetLastNodeGuid("a0e3ae95-061e-4cf4-b06d-2edc81e5debe");
    _UnreconciledSearch.Enter_DateFrom11("02/02/2021");
    

    TestModellerLogger.SetLastNodeGuid("325bf592-ccb5-4649-b30d-6826c5c0d452");
    _UnreconciledSearch.Enter_DateTo12("31/12/2021");
    

    TestModellerLogger.SetLastNodeGuid("d030e7a9-5261-4df2-b2d2-6cc07e70504d");
    _UnreconciledSearch.Click_Update_BTNN();
    

pages.unconsiledgrid _unconsiledgrid = new pages.unconsiledgrid(driver);
    TestModellerLogger.SetLastNodeGuid("3d411e3c-5c3f-4153-b926-4e346a8a622e");
    _unconsiledgrid.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("b9b2843c-608d-48cc-a40d-37a9536817a3");
//    _unconsiledgrid.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("bda1776b-d5b9-4cb9-a48d-3bb511b93e58");
    _unconsiledgrid.Click_checkbox1();
    

    TestModellerLogger.SetLastNodeGuid("5e358f1f-8cf3-4256-81c2-c8eeceee3c19");
    _unconsiledgrid.Click_Select_an_option3();
    

    TestModellerLogger.SetLastNodeGuid("daee70a0-1b56-4d5e-bae4-47f9d0b01817");
    _unconsiledgrid.Enter_innerbox("1070 - Nidhi");
    

    TestModellerLogger.SetLastNodeGuid("18fa7be0-bc13-46ae-af3a-34d2550b7a23");
    _unconsiledgrid.Click_Reconcile_btn1();
    

    }

    @Test  (groups= {"Verify Unreconcilled_trans","Verify Unreconcilled_trans - Unreconciled_Tran"})
    @TestModellerPath(guid = "37033e2c-5b85-4fb7-84c3-f0197dcff1d7")
    public void UnreconciledTranGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAsse14() throws InterruptedException, IOException
    {
        
    	sTestCaseID="TC14";
    	Sheet="Sheet1";
    	data =ExcelData.toReadExcelData("TC14", "Sheet1");
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
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
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
    

pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
    _bankmenu.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
//    _bankmenu.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
    _bankmenu.Click_Bankingmenu();
    

    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
    _bankmenu.Click_Newmenu();
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
//    _nBANKTRN.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
    _nBANKTRN.Select_BK_SELECT(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
    _nBANKTRN.Enter_NDate(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
    _nBANKTRN.Enter_n_desc(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
    _nBANKTRN.Enter_Recived_amt(data[7]);
    

    TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
    _nBANKTRN.Enter_spnt_amt(data[8]);
    

    TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
    _nBANKTRN.Select_Select_VATRate(data[9]);
    

//    TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
//    _nBANKTRN.Click_Select_Option1();
   

//    TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
//    _nBANKTRN.Enter_BOX2(data[]);
    

//    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
//    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

pages.unconcilledbutn _unconcilledbutn = new pages.unconcilledbutn(driver);
    TestModellerLogger.SetLastNodeGuid("dd35ab3f-9a3f-41c8-b46a-f878062d2bd4");
    _unconcilledbutn.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("23d80cba-07ce-43f2-a76a-1d33bb41b05a");
//    _unconcilledbutn.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("3707d400-fede-4a41-968e-5d3eb200b18e");
    _unconcilledbutn.Click_Unreconciled_Transactions_button1();
    

pages.UnreconciledSearch _UnreconciledSearch = new pages.UnreconciledSearch(driver);
    TestModellerLogger.SetLastNodeGuid("3846d5f2-85cb-4331-8ccf-bb60a8dfac36");
    _UnreconciledSearch.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("a9f96659-b0f0-46ef-89bc-1484dae69392");
//    _UnreconciledSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8a7edde5-a78b-402b-81df-9d97b660150b");
    _UnreconciledSearch.Select_BNK_Account("nidhi2");
    

    TestModellerLogger.SetLastNodeGuid("ac3ace08-4d39-4b7c-97f3-78d3616dcab3");
    _UnreconciledSearch.Select_Date_Range("Custom");
    

    TestModellerLogger.SetLastNodeGuid("a0e3ae95-061e-4cf4-b06d-2edc81e5debe");
    _UnreconciledSearch.Enter_DateFrom11("02/02/2021");
    

    TestModellerLogger.SetLastNodeGuid("325bf592-ccb5-4649-b30d-6826c5c0d452");
    _UnreconciledSearch.Enter_DateTo12("31/12/2021");
    

    TestModellerLogger.SetLastNodeGuid("d030e7a9-5261-4df2-b2d2-6cc07e70504d");
    _UnreconciledSearch.Click_Update_BTNN();
    

pages.unconsiledgrid _unconsiledgrid = new pages.unconsiledgrid(driver);
    TestModellerLogger.SetLastNodeGuid("3d411e3c-5c3f-4153-b926-4e346a8a622e");
    _unconsiledgrid.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("b9b2843c-608d-48cc-a40d-37a9536817a3");
//    _unconsiledgrid.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("bda1776b-d5b9-4cb9-a48d-3bb511b93e58");
    _unconsiledgrid.Click_checkbox1();
    

    TestModellerLogger.SetLastNodeGuid("5e358f1f-8cf3-4256-81c2-c8eeceee3c19");
    _unconsiledgrid.Click_Select_an_option3();
    

    TestModellerLogger.SetLastNodeGuid("daee70a0-1b56-4d5e-bae4-47f9d0b01817");
    _unconsiledgrid.Enter_innerbox("1070 - Nidhi");
    

    TestModellerLogger.SetLastNodeGuid("18fa7be0-bc13-46ae-af3a-34d2550b7a23");
    _unconsiledgrid.Click_Reconcile_btn1();
    

    }

    @Test  (groups= {"Verify Unreconcilled_trans","Verify Unreconcilled_trans - Unreconciled_Tran"})
    @TestModellerPath(guid = "bd354e35-81ba-4c32-95d3-788bc7998776")
    public void UnreconciledTranGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAsse15() throws InterruptedException, IOException
    {
        
    	sTestCaseID="TC14";
    	Sheet="Sheet1";
    	data =ExcelData.toReadExcelData("TC14", "Sheet1");
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
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
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
    

pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
    _bankmenu.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
//    _bankmenu.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
    _bankmenu.Click_Bankingmenu();
    

    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
    _bankmenu.Click_Newmenu();
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

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
    

    TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
    _nBANKTRN.Select_Select_VATRate(data[10]);
    

//    TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
//    _nBANKTRN.Click_Select_Option1();


//    TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
//    _nBANKTRN.Enter_BOX2("");
    

//    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
//    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

pages.unconcilledbutn _unconcilledbutn = new pages.unconcilledbutn(driver);
    TestModellerLogger.SetLastNodeGuid("dd35ab3f-9a3f-41c8-b46a-f878062d2bd4");
    _unconcilledbutn.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("23d80cba-07ce-43f2-a76a-1d33bb41b05a");
//    _unconcilledbutn.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("3707d400-fede-4a41-968e-5d3eb200b18e");
    _unconcilledbutn.Click_Unreconciled_Transactions_button1();
    

pages.UnreconciledSearch _UnreconciledSearch = new pages.UnreconciledSearch(driver);
    TestModellerLogger.SetLastNodeGuid("3846d5f2-85cb-4331-8ccf-bb60a8dfac36");
    _UnreconciledSearch.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("a9f96659-b0f0-46ef-89bc-1484dae69392");
//    _UnreconciledSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8a7edde5-a78b-402b-81df-9d97b660150b");
    _UnreconciledSearch.Select_BNK_Account("nidhi2");
    

    TestModellerLogger.SetLastNodeGuid("ac3ace08-4d39-4b7c-97f3-78d3616dcab3");
    _UnreconciledSearch.Select_Date_Range("This Month");
    

    TestModellerLogger.SetLastNodeGuid("a0e3ae95-061e-4cf4-b06d-2edc81e5debe");
    _UnreconciledSearch.Enter_DateFrom11("02/02/2021");
    

    TestModellerLogger.SetLastNodeGuid("325bf592-ccb5-4649-b30d-6826c5c0d452");
    _UnreconciledSearch.Enter_DateTo12("31/12/2021");
    

    TestModellerLogger.SetLastNodeGuid("d030e7a9-5261-4df2-b2d2-6cc07e70504d");
    _UnreconciledSearch.Click_Update_BTNN();
    

pages.unconsiledgrid _unconsiledgrid = new pages.unconsiledgrid(driver);
    TestModellerLogger.SetLastNodeGuid("3d411e3c-5c3f-4153-b926-4e346a8a622e");
    _unconsiledgrid.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("b9b2843c-608d-48cc-a40d-37a9536817a3");
//    _unconsiledgrid.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("bda1776b-d5b9-4cb9-a48d-3bb511b93e58");
    _unconsiledgrid.Click_checkbox1();
    

    TestModellerLogger.SetLastNodeGuid("5e358f1f-8cf3-4256-81c2-c8eeceee3c19");
    _unconsiledgrid.Click_Select_an_option3();
    

    TestModellerLogger.SetLastNodeGuid("daee70a0-1b56-4d5e-bae4-47f9d0b01817");
    _unconsiledgrid.Enter_innerbox("1070 - Nidhi");
    

    TestModellerLogger.SetLastNodeGuid("18fa7be0-bc13-46ae-af3a-34d2550b7a23");
    _unconsiledgrid.Click_Reconcile_btn1();
    

    }
}
/*
    @Test  (groups= {"Verify Unreconcilled_trans","Verify Unreconcilled_trans - Unreconciled_Tran"})
    @TestModellerPath(guid = "06a6752b-13df-47e3-9e9f-c7c85e517822")
    public void UnreconciledTranGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAsse16()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("EM2oH6FFuS");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
//    _AgentSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("rerum");
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
//    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Pagac - Bayer");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
    _bankmenu.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
//    _bankmenu.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
    _bankmenu.Click_Bankingmenu();
    

    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
    _bankmenu.Click_Newmenu();
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
//    _nBANKTRN.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
    _nBANKTRN.Select_BK_SELECT("nidhibank");
    

    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
    _nBANKTRN.Enter_NDate("44237");
    

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
    

//    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
//    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

pages.unconcilledbutn _unconcilledbutn = new pages.unconcilledbutn(driver);
    TestModellerLogger.SetLastNodeGuid("dd35ab3f-9a3f-41c8-b46a-f878062d2bd4");
    _unconcilledbutn.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("23d80cba-07ce-43f2-a76a-1d33bb41b05a");
//    _unconcilledbutn.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("3707d400-fede-4a41-968e-5d3eb200b18e");
    _unconcilledbutn.Click_Unreconciled_Transactions_button1();
    

pages.UnreconciledSearch _UnreconciledSearch = new pages.UnreconciledSearch(driver);
    TestModellerLogger.SetLastNodeGuid("3846d5f2-85cb-4331-8ccf-bb60a8dfac36");
    _UnreconciledSearch.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("a9f96659-b0f0-46ef-89bc-1484dae69392");
//    _UnreconciledSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8a7edde5-a78b-402b-81df-9d97b660150b");
    _UnreconciledSearch.Select_BNK_Account("fdfds");
    

    TestModellerLogger.SetLastNodeGuid("ac3ace08-4d39-4b7c-97f3-78d3616dcab3");
    _UnreconciledSearch.Select_Date_Range("This Month");
    

    TestModellerLogger.SetLastNodeGuid("a0e3ae95-061e-4cf4-b06d-2edc81e5debe");
    _UnreconciledSearch.Enter_DateFrom11("44237");
    

    TestModellerLogger.SetLastNodeGuid("325bf592-ccb5-4649-b30d-6826c5c0d452");
    _UnreconciledSearch.Enter_DateTo12("44237");
    

    TestModellerLogger.SetLastNodeGuid("d030e7a9-5261-4df2-b2d2-6cc07e70504d");
    _UnreconciledSearch.Click_Update_BTNN();
    

pages.unconsiledgrid _unconsiledgrid = new pages.unconsiledgrid(driver);
    TestModellerLogger.SetLastNodeGuid("3d411e3c-5c3f-4153-b926-4e346a8a622e");
    _unconsiledgrid.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("b9b2843c-608d-48cc-a40d-37a9536817a3");
//    _unconsiledgrid.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("bda1776b-d5b9-4cb9-a48d-3bb511b93e58");
    _unconsiledgrid.Click_checkbox1();
    

    TestModellerLogger.SetLastNodeGuid("5e358f1f-8cf3-4256-81c2-c8eeceee3c19");
    _unconsiledgrid.Click_Select_an_option3();
    

    TestModellerLogger.SetLastNodeGuid("daee70a0-1b56-4d5e-bae4-47f9d0b01817");
    _unconsiledgrid.Enter_innerbox("");
    

    TestModellerLogger.SetLastNodeGuid("18fa7be0-bc13-46ae-af3a-34d2550b7a23");
    _unconsiledgrid.Click_Reconcile_btn1();
    

    }

    @Test  (groups= {"Verify Unreconcilled_trans","Verify Unreconcilled_trans - Unreconciled_Tran"})
    @TestModellerPath(guid = "8881cb60-8cdc-4743-9d0b-e620cee8cd97")
    public void UnreconciledTranGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAsse17()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("a5LSJk3Knr");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
//    _AgentSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("amet");
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
//    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Beatty, Bernhard and Senger");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
    _bankmenu.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
//    _bankmenu.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
    _bankmenu.Click_Bankingmenu();
    

    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
    _bankmenu.Click_Newmenu();
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
//    _nBANKTRN.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
    _nBANKTRN.Select_BK_SELECT("nidhibank");
    

    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
    _nBANKTRN.Enter_NDate("44237");
    

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
    

//    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
//    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

pages.unconcilledbutn _unconcilledbutn = new pages.unconcilledbutn(driver);
    TestModellerLogger.SetLastNodeGuid("dd35ab3f-9a3f-41c8-b46a-f878062d2bd4");
    _unconcilledbutn.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("23d80cba-07ce-43f2-a76a-1d33bb41b05a");
//    _unconcilledbutn.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("3707d400-fede-4a41-968e-5d3eb200b18e");
    _unconcilledbutn.Click_Unreconciled_Transactions_button1();
    

pages.UnreconciledSearch _UnreconciledSearch = new pages.UnreconciledSearch(driver);
    TestModellerLogger.SetLastNodeGuid("3846d5f2-85cb-4331-8ccf-bb60a8dfac36");
    _UnreconciledSearch.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("a9f96659-b0f0-46ef-89bc-1484dae69392");
//    _UnreconciledSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8a7edde5-a78b-402b-81df-9d97b660150b");
    _UnreconciledSearch.Select_BNK_Account("N and N corportaion1");
    

    TestModellerLogger.SetLastNodeGuid("ac3ace08-4d39-4b7c-97f3-78d3616dcab3");
    _UnreconciledSearch.Select_Date_Range("This Month");
    

    TestModellerLogger.SetLastNodeGuid("a0e3ae95-061e-4cf4-b06d-2edc81e5debe");
    _UnreconciledSearch.Enter_DateFrom11("44237");
    

    TestModellerLogger.SetLastNodeGuid("325bf592-ccb5-4649-b30d-6826c5c0d452");
    _UnreconciledSearch.Enter_DateTo12("44237");
    

    TestModellerLogger.SetLastNodeGuid("d030e7a9-5261-4df2-b2d2-6cc07e70504d");
    _UnreconciledSearch.Click_Update_BTNN();
    

pages.unconsiledgrid _unconsiledgrid = new pages.unconsiledgrid(driver);
    TestModellerLogger.SetLastNodeGuid("3d411e3c-5c3f-4153-b926-4e346a8a622e");
    _unconsiledgrid.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("b9b2843c-608d-48cc-a40d-37a9536817a3");
//    _unconsiledgrid.AssertUrl();


    TestModellerLogger.SetLastNodeGuid("bda1776b-d5b9-4cb9-a48d-3bb511b93e58");
    _unconsiledgrid.Click_checkbox1();
    

    TestModellerLogger.SetLastNodeGuid("5e358f1f-8cf3-4256-81c2-c8eeceee3c19");
    _unconsiledgrid.Click_Select_an_option3();
    

    TestModellerLogger.SetLastNodeGuid("daee70a0-1b56-4d5e-bae4-47f9d0b01817");
    _unconsiledgrid.Enter_innerbox("");
    

    TestModellerLogger.SetLastNodeGuid("18fa7be0-bc13-46ae-af3a-34d2550b7a23");
    _unconsiledgrid.Click_Reconcile_btn1();
    

    }

    @Test  (groups= {"Verify Unreconcilled_trans","Verify Unreconcilled_trans - Unreconciled_Tran"})
    @TestModellerPath(guid = "81de8d04-7195-4e31-b1a6-2e405948cb60")
    public void UnreconciledTranGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAsse18()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("1QWi3rqOHC");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
//    _AgentSearch.AssertUrl();
    

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
    

//    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
//    _Searchclient.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Hintz LLC");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
    _bankmenu.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
//    _bankmenu.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
    _bankmenu.Click_Bankingmenu();
    

    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
    _bankmenu.Click_Newmenu();
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
//    _nBANKTRN.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
    _nBANKTRN.Select_BK_SELECT("nidhibank");
    

    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
    _nBANKTRN.Enter_NDate("44237");
    

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
    

//    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
//    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

pages.unconcilledbutn _unconcilledbutn = new pages.unconcilledbutn(driver);
    TestModellerLogger.SetLastNodeGuid("dd35ab3f-9a3f-41c8-b46a-f878062d2bd4");
    _unconcilledbutn.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("23d80cba-07ce-43f2-a76a-1d33bb41b05a");
//    _unconcilledbutn.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("3707d400-fede-4a41-968e-5d3eb200b18e");
    _unconcilledbutn.Click_Unreconciled_Transactions_button1();
    

pages.UnreconciledSearch _UnreconciledSearch = new pages.UnreconciledSearch(driver);
    TestModellerLogger.SetLastNodeGuid("3846d5f2-85cb-4331-8ccf-bb60a8dfac36");
    _UnreconciledSearch.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("a9f96659-b0f0-46ef-89bc-1484dae69392");
//    _UnreconciledSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8a7edde5-a78b-402b-81df-9d97b660150b");
    _UnreconciledSearch.Select_BNK_Account("N and N corportaion2");
    

    TestModellerLogger.SetLastNodeGuid("ac3ace08-4d39-4b7c-97f3-78d3616dcab3");
    _UnreconciledSearch.Select_Date_Range("This Month");
    

    TestModellerLogger.SetLastNodeGuid("a0e3ae95-061e-4cf4-b06d-2edc81e5debe");
    _UnreconciledSearch.Enter_DateFrom11("44237");
    

    TestModellerLogger.SetLastNodeGuid("325bf592-ccb5-4649-b30d-6826c5c0d452");
    _UnreconciledSearch.Enter_DateTo12("44237");
    

    TestModellerLogger.SetLastNodeGuid("d030e7a9-5261-4df2-b2d2-6cc07e70504d");
    _UnreconciledSearch.Click_Update_BTNN();
    

pages.unconsiledgrid _unconsiledgrid = new pages.unconsiledgrid(driver);
    TestModellerLogger.SetLastNodeGuid("3d411e3c-5c3f-4153-b926-4e346a8a622e");
    _unconsiledgrid.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("b9b2843c-608d-48cc-a40d-37a9536817a3");
//    _unconsiledgrid.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("bda1776b-d5b9-4cb9-a48d-3bb511b93e58");
    _unconsiledgrid.Click_checkbox1();
    

    TestModellerLogger.SetLastNodeGuid("5e358f1f-8cf3-4256-81c2-c8eeceee3c19");
    _unconsiledgrid.Click_Select_an_option3();
    

    TestModellerLogger.SetLastNodeGuid("daee70a0-1b56-4d5e-bae4-47f9d0b01817");
    _unconsiledgrid.Enter_innerbox("");
    

    TestModellerLogger.SetLastNodeGuid("18fa7be0-bc13-46ae-af3a-34d2550b7a23");
    _unconsiledgrid.Click_Reconcile_btn1();
    

    }

    @Test  (groups= {"Verify Unreconcilled_trans","Verify Unreconcilled_trans - Unreconciled_Tran"})
    @TestModellerPath(guid = "44e21c2e-7056-4a7e-80f7-6ad6fdefb4b1")
    public void UnreconciledTranGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAsse19()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("9b7nt5rms1");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
//    _AgentSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("laboriosam");
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
//    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Quigley - Bailey");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
    _bankmenu.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
//    _bankmenu.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
    _bankmenu.Click_Bankingmenu();
    

    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
    _bankmenu.Click_Newmenu();
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
//    _nBANKTRN.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
    _nBANKTRN.Select_BK_SELECT("nidhibank");
    

    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
    _nBANKTRN.Enter_NDate("44237");
    

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
    

//    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
//    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

pages.unconcilledbutn _unconcilledbutn = new pages.unconcilledbutn(driver);
    TestModellerLogger.SetLastNodeGuid("dd35ab3f-9a3f-41c8-b46a-f878062d2bd4");
    _unconcilledbutn.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("23d80cba-07ce-43f2-a76a-1d33bb41b05a");
//    _unconcilledbutn.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("3707d400-fede-4a41-968e-5d3eb200b18e");
    _unconcilledbutn.Click_Unreconciled_Transactions_button1();
    

pages.UnreconciledSearch _UnreconciledSearch = new pages.UnreconciledSearch(driver);
    TestModellerLogger.SetLastNodeGuid("3846d5f2-85cb-4331-8ccf-bb60a8dfac36");
    _UnreconciledSearch.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("a9f96659-b0f0-46ef-89bc-1484dae69392");
//    _UnreconciledSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8a7edde5-a78b-402b-81df-9d97b660150b");
    _UnreconciledSearch.Select_BNK_Account("Nid and N corportaion1");
    

    TestModellerLogger.SetLastNodeGuid("ac3ace08-4d39-4b7c-97f3-78d3616dcab3");
    _UnreconciledSearch.Select_Date_Range("This Month");
    

    TestModellerLogger.SetLastNodeGuid("a0e3ae95-061e-4cf4-b06d-2edc81e5debe");
    _UnreconciledSearch.Enter_DateFrom11("44237");
    

    TestModellerLogger.SetLastNodeGuid("325bf592-ccb5-4649-b30d-6826c5c0d452");
    _UnreconciledSearch.Enter_DateTo12("44237");
    

    TestModellerLogger.SetLastNodeGuid("d030e7a9-5261-4df2-b2d2-6cc07e70504d");
    _UnreconciledSearch.Click_Update_BTNN();
    

pages.unconsiledgrid _unconsiledgrid = new pages.unconsiledgrid(driver);
    TestModellerLogger.SetLastNodeGuid("3d411e3c-5c3f-4153-b926-4e346a8a622e");
    _unconsiledgrid.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("b9b2843c-608d-48cc-a40d-37a9536817a3");
//    _unconsiledgrid.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("bda1776b-d5b9-4cb9-a48d-3bb511b93e58");
    _unconsiledgrid.Click_checkbox1();
    

    TestModellerLogger.SetLastNodeGuid("5e358f1f-8cf3-4256-81c2-c8eeceee3c19");
    _unconsiledgrid.Click_Select_an_option3();
    

    TestModellerLogger.SetLastNodeGuid("daee70a0-1b56-4d5e-bae4-47f9d0b01817");
    _unconsiledgrid.Enter_innerbox("");
    

    TestModellerLogger.SetLastNodeGuid("18fa7be0-bc13-46ae-af3a-34d2550b7a23");
    _unconsiledgrid.Click_Reconcile_btn1();
    

    }

    @Test  (groups= {"Verify Unreconcilled_trans","Verify Unreconcilled_trans - Unreconciled_Tran"})
    @TestModellerPath(guid = "acc0aa40-4a6f-4d57-b76b-bafe55546528")
    public void UnreconciledTranGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAsse20()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("BsPon0ZBoo");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
//    _AgentSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("maxime");
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
//    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Macejkovic - Watsica");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
    _bankmenu.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
//    _bankmenu.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
    _bankmenu.Click_Bankingmenu();
    

    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
    _bankmenu.Click_Newmenu();
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
//    _nBANKTRN.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
    _nBANKTRN.Select_BK_SELECT("nidhibank");
    

    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
    _nBANKTRN.Enter_NDate("44237");
    

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
    

//    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
//    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

pages.unconcilledbutn _unconcilledbutn = new pages.unconcilledbutn(driver);
    TestModellerLogger.SetLastNodeGuid("dd35ab3f-9a3f-41c8-b46a-f878062d2bd4");
    _unconcilledbutn.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("23d80cba-07ce-43f2-a76a-1d33bb41b05a");
//    _unconcilledbutn.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("3707d400-fede-4a41-968e-5d3eb200b18e");
    _unconcilledbutn.Click_Unreconciled_Transactions_button1();
    

pages.UnreconciledSearch _UnreconciledSearch = new pages.UnreconciledSearch(driver);
    TestModellerLogger.SetLastNodeGuid("3846d5f2-85cb-4331-8ccf-bb60a8dfac36");
    _UnreconciledSearch.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("a9f96659-b0f0-46ef-89bc-1484dae69392");
//    _UnreconciledSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8a7edde5-a78b-402b-81df-9d97b660150b");
    _UnreconciledSearch.Select_BNK_Account("Nid0and N corportaion1");
    

    TestModellerLogger.SetLastNodeGuid("ac3ace08-4d39-4b7c-97f3-78d3616dcab3");
    _UnreconciledSearch.Select_Date_Range("This Month");
    

    TestModellerLogger.SetLastNodeGuid("a0e3ae95-061e-4cf4-b06d-2edc81e5debe");
    _UnreconciledSearch.Enter_DateFrom11("44237");
    

    TestModellerLogger.SetLastNodeGuid("325bf592-ccb5-4649-b30d-6826c5c0d452");
    _UnreconciledSearch.Enter_DateTo12("44237");
    

    TestModellerLogger.SetLastNodeGuid("d030e7a9-5261-4df2-b2d2-6cc07e70504d");
    _UnreconciledSearch.Click_Update_BTNN();
    

pages.unconsiledgrid _unconsiledgrid = new pages.unconsiledgrid(driver);
    TestModellerLogger.SetLastNodeGuid("3d411e3c-5c3f-4153-b926-4e346a8a622e");
    _unconsiledgrid.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("b9b2843c-608d-48cc-a40d-37a9536817a3");
//    _unconsiledgrid.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("bda1776b-d5b9-4cb9-a48d-3bb511b93e58");
    _unconsiledgrid.Click_checkbox1();
    

    TestModellerLogger.SetLastNodeGuid("5e358f1f-8cf3-4256-81c2-c8eeceee3c19");
    _unconsiledgrid.Click_Select_an_option3();
    

    TestModellerLogger.SetLastNodeGuid("daee70a0-1b56-4d5e-bae4-47f9d0b01817");
    _unconsiledgrid.Enter_innerbox("");
    

    TestModellerLogger.SetLastNodeGuid("18fa7be0-bc13-46ae-af3a-34d2550b7a23");
    _unconsiledgrid.Click_Reconcile_btn1();
    

    }

    @Test  (groups= {"Verify Unreconcilled_trans","Verify Unreconcilled_trans - Unreconciled_Tran"})
    @TestModellerPath(guid = "87b7e471-5521-4b34-8448-c5547de86bbd")
    public void UnreconciledTranGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAsse21()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//    _nlogin.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("jBVBqaeyQ7");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
//    _AgentSearch.AssertUrl();
//    

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
    

//    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
//    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Brekke - Borer");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
    _bankmenu.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
//    _bankmenu.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
    _bankmenu.Click_Bankingmenu();
    

    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
    _bankmenu.Click_Newmenu();
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
//    _nBANKTRN.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
    _nBANKTRN.Select_BK_SELECT("nidhibank");
    

    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
    _nBANKTRN.Enter_NDate("44237");
    

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
    

//    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
//    _nBANKTRN.Click__1400_DATA();
//    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

pages.unconcilledbutn _unconcilledbutn = new pages.unconcilledbutn(driver);
    TestModellerLogger.SetLastNodeGuid("dd35ab3f-9a3f-41c8-b46a-f878062d2bd4");
    _unconcilledbutn.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("23d80cba-07ce-43f2-a76a-1d33bb41b05a");
//    _unconcilledbutn.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("3707d400-fede-4a41-968e-5d3eb200b18e");
    _unconcilledbutn.Click_Unreconciled_Transactions_button1();
    

pages.UnreconciledSearch _UnreconciledSearch = new pages.UnreconciledSearch(driver);
    TestModellerLogger.SetLastNodeGuid("3846d5f2-85cb-4331-8ccf-bb60a8dfac36");
    _UnreconciledSearch.GoToUrl();
    
//
//    TestModellerLogger.SetLastNodeGuid("a9f96659-b0f0-46ef-89bc-1484dae69392");
//    _UnreconciledSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8a7edde5-a78b-402b-81df-9d97b660150b");
    _UnreconciledSearch.Select_BNK_Account("Nid0and N corportaion1");
    

    TestModellerLogger.SetLastNodeGuid("ac3ace08-4d39-4b7c-97f3-78d3616dcab3");
    _UnreconciledSearch.Select_Date_Range("This Month");
    

    TestModellerLogger.SetLastNodeGuid("a0e3ae95-061e-4cf4-b06d-2edc81e5debe");
    _UnreconciledSearch.Enter_DateFrom11("44237");
    

    TestModellerLogger.SetLastNodeGuid("325bf592-ccb5-4649-b30d-6826c5c0d452");
    _UnreconciledSearch.Enter_DateTo12("44237");
    

    TestModellerLogger.SetLastNodeGuid("d030e7a9-5261-4df2-b2d2-6cc07e70504d");
    _UnreconciledSearch.Click_Update_BTNN();
    

pages.unconsiledgrid _unconsiledgrid = new pages.unconsiledgrid(driver);
    TestModellerLogger.SetLastNodeGuid("3d411e3c-5c3f-4153-b926-4e346a8a622e");
    _unconsiledgrid.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("b9b2843c-608d-48cc-a40d-37a9536817a3");
//    _unconsiledgrid.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("bda1776b-d5b9-4cb9-a48d-3bb511b93e58");
    _unconsiledgrid.Click_checkbox1();
    

    TestModellerLogger.SetLastNodeGuid("5e358f1f-8cf3-4256-81c2-c8eeceee3c19");
    _unconsiledgrid.Click_Select_an_option3();
    

    TestModellerLogger.SetLastNodeGuid("daee70a0-1b56-4d5e-bae4-47f9d0b01817");
    _unconsiledgrid.Enter_innerbox("");
    

    TestModellerLogger.SetLastNodeGuid("18fa7be0-bc13-46ae-af3a-34d2550b7a23");
    _unconsiledgrid.Click_Reconcile_btn1();
    

    }

    @Test  (groups= {"Verify Unreconcilled_trans","Verify Unreconcilled_trans - Unreconciled_Tran"})
    @TestModellerPath(guid = "6c280e5c-6bdd-4a7e-979a-ae45a854d6fd")
    public void UnreconciledTranGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAsse22()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("kwgKHs4ZfD");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
//    _AgentSearch.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("eaque");
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
//    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Hamill - Hand");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
    _bankmenu.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
//    _bankmenu.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
    _bankmenu.Click_Bankingmenu();
    

    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
    _bankmenu.Click_Newmenu();
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
//    _nBANKTRN.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
    _nBANKTRN.Select_BK_SELECT("nidhibank");
    

    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
    _nBANKTRN.Enter_NDate("44237");
    

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
    

//    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
//    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

pages.unconcilledbutn _unconcilledbutn = new pages.unconcilledbutn(driver);
    TestModellerLogger.SetLastNodeGuid("dd35ab3f-9a3f-41c8-b46a-f878062d2bd4");
    _unconcilledbutn.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("23d80cba-07ce-43f2-a76a-1d33bb41b05a");
//    _unconcilledbutn.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("3707d400-fede-4a41-968e-5d3eb200b18e");
    _unconcilledbutn.Click_Unreconciled_Transactions_button1();
    

pages.UnreconciledSearch _UnreconciledSearch = new pages.UnreconciledSearch(driver);
    TestModellerLogger.SetLastNodeGuid("3846d5f2-85cb-4331-8ccf-bb60a8dfac36");
    _UnreconciledSearch.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("a9f96659-b0f0-46ef-89bc-1484dae69392");
//    _UnreconciledSearch.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("8a7edde5-a78b-402b-81df-9d97b660150b");
    _UnreconciledSearch.Select_BNK_Account("Nid4 and N corportaion1");
    

    TestModellerLogger.SetLastNodeGuid("ac3ace08-4d39-4b7c-97f3-78d3616dcab3");
    _UnreconciledSearch.Select_Date_Range("This Month");
    

    TestModellerLogger.SetLastNodeGuid("a0e3ae95-061e-4cf4-b06d-2edc81e5debe");
    _UnreconciledSearch.Enter_DateFrom11("44237");
    

    TestModellerLogger.SetLastNodeGuid("325bf592-ccb5-4649-b30d-6826c5c0d452");
    _UnreconciledSearch.Enter_DateTo12("44237");
    

    TestModellerLogger.SetLastNodeGuid("d030e7a9-5261-4df2-b2d2-6cc07e70504d");
    _UnreconciledSearch.Click_Update_BTNN();
    

pages.unconsiledgrid _unconsiledgrid = new pages.unconsiledgrid(driver);
    TestModellerLogger.SetLastNodeGuid("3d411e3c-5c3f-4153-b926-4e346a8a622e");
    _unconsiledgrid.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("b9b2843c-608d-48cc-a40d-37a9536817a3");
//    _unconsiledgrid.AssertUrl();


    TestModellerLogger.SetLastNodeGuid("bda1776b-d5b9-4cb9-a48d-3bb511b93e58");
    _unconsiledgrid.Click_checkbox1();
    

    TestModellerLogger.SetLastNodeGuid("5e358f1f-8cf3-4256-81c2-c8eeceee3c19");
    _unconsiledgrid.Click_Select_an_option3();
    

    TestModellerLogger.SetLastNodeGuid("daee70a0-1b56-4d5e-bae4-47f9d0b01817");
    _unconsiledgrid.Enter_innerbox("");
    

    TestModellerLogger.SetLastNodeGuid("18fa7be0-bc13-46ae-af3a-34d2550b7a23");
    _unconsiledgrid.Click_Reconcile_btn1();
    

    }

    @Test  (groups= {"Verify Unreconcilled_trans","Verify Unreconcilled_trans - Unreconciled_Tran"})
    @TestModellerPath(guid = "09f6daf4-7a92-4926-9ac8-95a004179410")
    public void UnreconciledTranGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAsse23()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//    _nlogin.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("FA_VOwZvaM");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
//    _AgentSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("consequatur");
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
//    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Hermann - Kuhn");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
    _bankmenu.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
//    _bankmenu.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
    _bankmenu.Click_Bankingmenu();
    

    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
    _bankmenu.Click_Newmenu();
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
//    _nBANKTRN.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
    _nBANKTRN.Select_BK_SELECT("nidhibank");
    

    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
    _nBANKTRN.Enter_NDate("44237");
    

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
    

//    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
//    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

pages.unconcilledbutn _unconcilledbutn = new pages.unconcilledbutn(driver);
    TestModellerLogger.SetLastNodeGuid("dd35ab3f-9a3f-41c8-b46a-f878062d2bd4");
    _unconcilledbutn.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("23d80cba-07ce-43f2-a76a-1d33bb41b05a");
//    _unconcilledbutn.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("3707d400-fede-4a41-968e-5d3eb200b18e");
    _unconcilledbutn.Click_Unreconciled_Transactions_button1();
    

pages.UnreconciledSearch _UnreconciledSearch = new pages.UnreconciledSearch(driver);
    TestModellerLogger.SetLastNodeGuid("3846d5f2-85cb-4331-8ccf-bb60a8dfac36");
    _UnreconciledSearch.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("a9f96659-b0f0-46ef-89bc-1484dae69392");
//    _UnreconciledSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8a7edde5-a78b-402b-81df-9d97b660150b");
    _UnreconciledSearch.Select_BNK_Account("Nid6 and N corportaion1");
    

    TestModellerLogger.SetLastNodeGuid("ac3ace08-4d39-4b7c-97f3-78d3616dcab3");
    _UnreconciledSearch.Select_Date_Range("This Month");
    

    TestModellerLogger.SetLastNodeGuid("a0e3ae95-061e-4cf4-b06d-2edc81e5debe");
    _UnreconciledSearch.Enter_DateFrom11("44237");
    

    TestModellerLogger.SetLastNodeGuid("325bf592-ccb5-4649-b30d-6826c5c0d452");
    _UnreconciledSearch.Enter_DateTo12("44237");
    

    TestModellerLogger.SetLastNodeGuid("d030e7a9-5261-4df2-b2d2-6cc07e70504d");
    _UnreconciledSearch.Click_Update_BTNN();
    

pages.unconsiledgrid _unconsiledgrid = new pages.unconsiledgrid(driver);
    TestModellerLogger.SetLastNodeGuid("3d411e3c-5c3f-4153-b926-4e346a8a622e");
    _unconsiledgrid.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("b9b2843c-608d-48cc-a40d-37a9536817a3");
//    _unconsiledgrid.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("bda1776b-d5b9-4cb9-a48d-3bb511b93e58");
    _unconsiledgrid.Click_checkbox1();
    

    TestModellerLogger.SetLastNodeGuid("5e358f1f-8cf3-4256-81c2-c8eeceee3c19");
    _unconsiledgrid.Click_Select_an_option3();
    

    TestModellerLogger.SetLastNodeGuid("daee70a0-1b56-4d5e-bae4-47f9d0b01817");
    _unconsiledgrid.Enter_innerbox("");
    

    TestModellerLogger.SetLastNodeGuid("18fa7be0-bc13-46ae-af3a-34d2550b7a23");
    _unconsiledgrid.Click_Reconcile_btn1();
    

    }

    @Test  (groups= {"Verify Unreconcilled_trans","Verify Unreconcilled_trans - Unreconciled_Tran"})
    @TestModellerPath(guid = "a7afa90a-4ce1-4fab-943b-32372bc43cce")
    public void UnreconciledTranGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAsse24()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("N7zTxxcjVt");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
//    _AgentSearch.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("laboriosam");
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
//    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Towne - Watsica");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
    _bankmenu.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
//    _bankmenu.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
    _bankmenu.Click_Bankingmenu();
    

    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
    _bankmenu.Click_Newmenu();
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
//    _nBANKTRN.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
    _nBANKTRN.Select_BK_SELECT("nidhibank");
    

    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
    _nBANKTRN.Enter_NDate("44237");
    

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
    

//    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
//    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

pages.unconcilledbutn _unconcilledbutn = new pages.unconcilledbutn(driver);
    TestModellerLogger.SetLastNodeGuid("dd35ab3f-9a3f-41c8-b46a-f878062d2bd4");
    _unconcilledbutn.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("23d80cba-07ce-43f2-a76a-1d33bb41b05a");
//    _unconcilledbutn.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("3707d400-fede-4a41-968e-5d3eb200b18e");
    _unconcilledbutn.Click_Unreconciled_Transactions_button1();
    

pages.UnreconciledSearch _UnreconciledSearch = new pages.UnreconciledSearch(driver);
    TestModellerLogger.SetLastNodeGuid("3846d5f2-85cb-4331-8ccf-bb60a8dfac36");
    _UnreconciledSearch.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("a9f96659-b0f0-46ef-89bc-1484dae69392");
//    _UnreconciledSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8a7edde5-a78b-402b-81df-9d97b660150b");
    _UnreconciledSearch.Select_BNK_Account("Nid6 and N corportaion1");
    

    TestModellerLogger.SetLastNodeGuid("ac3ace08-4d39-4b7c-97f3-78d3616dcab3");
    _UnreconciledSearch.Select_Date_Range("This Month");
    

    TestModellerLogger.SetLastNodeGuid("a0e3ae95-061e-4cf4-b06d-2edc81e5debe");
    _UnreconciledSearch.Enter_DateFrom11("44237");
    

    TestModellerLogger.SetLastNodeGuid("325bf592-ccb5-4649-b30d-6826c5c0d452");
    _UnreconciledSearch.Enter_DateTo12("44237");
    

    TestModellerLogger.SetLastNodeGuid("d030e7a9-5261-4df2-b2d2-6cc07e70504d");
    _UnreconciledSearch.Click_Update_BTNN();
    

pages.unconsiledgrid _unconsiledgrid = new pages.unconsiledgrid(driver);
    TestModellerLogger.SetLastNodeGuid("3d411e3c-5c3f-4153-b926-4e346a8a622e");
    _unconsiledgrid.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("b9b2843c-608d-48cc-a40d-37a9536817a3");
//    _unconsiledgrid.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("bda1776b-d5b9-4cb9-a48d-3bb511b93e58");
    _unconsiledgrid.Click_checkbox1();
    

    TestModellerLogger.SetLastNodeGuid("5e358f1f-8cf3-4256-81c2-c8eeceee3c19");
    _unconsiledgrid.Click_Select_an_option3();
    

    TestModellerLogger.SetLastNodeGuid("daee70a0-1b56-4d5e-bae4-47f9d0b01817");
    _unconsiledgrid.Enter_innerbox("");
    

    TestModellerLogger.SetLastNodeGuid("18fa7be0-bc13-46ae-af3a-34d2550b7a23");
    _unconsiledgrid.Click_Reconcile_btn1();
    

    }

    @Test  (groups= {"Verify Unreconcilled_trans","Verify Unreconcilled_trans - Unreconciled_Tran"})
    @TestModellerPath(guid = "6a1c030f-d61e-4bcc-9682-b91a6560c1ca")
    public void UnreconciledTranGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAsse25()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("VVaFuoPMQ3");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    
//
//    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
//    _AgentSearch.AssertUrl();
    

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
    

//    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
//    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Braun, Armstrong and Dooley");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
    _bankmenu.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
//    _bankmenu.AssertUrl();
  

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
    _bankmenu.Click_Bankingmenu();
    

    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
    _bankmenu.Click_Newmenu();
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
//    _nBANKTRN.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
    _nBANKTRN.Select_BK_SELECT("nidhibank");
    

    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
    _nBANKTRN.Enter_NDate("44237");
    

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
    

//    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
//    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

pages.unconcilledbutn _unconcilledbutn = new pages.unconcilledbutn(driver);
    TestModellerLogger.SetLastNodeGuid("dd35ab3f-9a3f-41c8-b46a-f878062d2bd4");
    _unconcilledbutn.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("23d80cba-07ce-43f2-a76a-1d33bb41b05a");
//    _unconcilledbutn.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("3707d400-fede-4a41-968e-5d3eb200b18e");
    _unconcilledbutn.Click_Unreconciled_Transactions_button1();
    

pages.UnreconciledSearch _UnreconciledSearch = new pages.UnreconciledSearch(driver);
    TestModellerLogger.SetLastNodeGuid("3846d5f2-85cb-4331-8ccf-bb60a8dfac36");
    _UnreconciledSearch.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("a9f96659-b0f0-46ef-89bc-1484dae69392");
//    _UnreconciledSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8a7edde5-a78b-402b-81df-9d97b660150b");
    _UnreconciledSearch.Select_BNK_Account("Nid7N corportaion1");
    

    TestModellerLogger.SetLastNodeGuid("ac3ace08-4d39-4b7c-97f3-78d3616dcab3");
    _UnreconciledSearch.Select_Date_Range("This Month");
    

    TestModellerLogger.SetLastNodeGuid("a0e3ae95-061e-4cf4-b06d-2edc81e5debe");
    _UnreconciledSearch.Enter_DateFrom11("44237");
    

    TestModellerLogger.SetLastNodeGuid("325bf592-ccb5-4649-b30d-6826c5c0d452");
    _UnreconciledSearch.Enter_DateTo12("44237");
    

    TestModellerLogger.SetLastNodeGuid("d030e7a9-5261-4df2-b2d2-6cc07e70504d");
    _UnreconciledSearch.Click_Update_BTNN();
    

pages.unconsiledgrid _unconsiledgrid = new pages.unconsiledgrid(driver);
    TestModellerLogger.SetLastNodeGuid("3d411e3c-5c3f-4153-b926-4e346a8a622e");
    _unconsiledgrid.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("b9b2843c-608d-48cc-a40d-37a9536817a3");
//    _unconsiledgrid.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("bda1776b-d5b9-4cb9-a48d-3bb511b93e58");
    _unconsiledgrid.Click_checkbox1();
    

    TestModellerLogger.SetLastNodeGuid("5e358f1f-8cf3-4256-81c2-c8eeceee3c19");
    _unconsiledgrid.Click_Select_an_option3();
    

    TestModellerLogger.SetLastNodeGuid("daee70a0-1b56-4d5e-bae4-47f9d0b01817");
    _unconsiledgrid.Enter_innerbox("");
    

    TestModellerLogger.SetLastNodeGuid("18fa7be0-bc13-46ae-af3a-34d2550b7a23");
    _unconsiledgrid.Click_Reconcile_btn1();
    

    }

    @Test  (groups= {"Verify Unreconcilled_trans","Verify Unreconcilled_trans - Unreconciled_Tran"})
    @TestModellerPath(guid = "e176f682-cca8-4a9c-95c0-7096a2926b11")
    public void UnreconciledTranGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAsse26()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("C9l3WGwV78");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
//    _AgentSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("quidem");
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
//    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Cummings Inc");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
    _bankmenu.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
//    _bankmenu.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
    _bankmenu.Click_Bankingmenu();
    

    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
    _bankmenu.Click_Newmenu();
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
//    _nBANKTRN.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
    _nBANKTRN.Select_BK_SELECT("nidhibank");
    

    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
    _nBANKTRN.Enter_NDate("44237");
    

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
    

//    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
//    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

pages.unconcilledbutn _unconcilledbutn = new pages.unconcilledbutn(driver);
    TestModellerLogger.SetLastNodeGuid("dd35ab3f-9a3f-41c8-b46a-f878062d2bd4");
    _unconcilledbutn.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("23d80cba-07ce-43f2-a76a-1d33bb41b05a");
//    _unconcilledbutn.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("3707d400-fede-4a41-968e-5d3eb200b18e");
    _unconcilledbutn.Click_Unreconciled_Transactions_button1();
    

pages.UnreconciledSearch _UnreconciledSearch = new pages.UnreconciledSearch(driver);
    TestModellerLogger.SetLastNodeGuid("3846d5f2-85cb-4331-8ccf-bb60a8dfac36");
    _UnreconciledSearch.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("a9f96659-b0f0-46ef-89bc-1484dae69392");
//    _UnreconciledSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8a7edde5-a78b-402b-81df-9d97b660150b");
    _UnreconciledSearch.Select_BNK_Account("Nid7N corportaion1");
    

    TestModellerLogger.SetLastNodeGuid("ac3ace08-4d39-4b7c-97f3-78d3616dcab3");
    _UnreconciledSearch.Select_Date_Range("This Month");
    

    TestModellerLogger.SetLastNodeGuid("a0e3ae95-061e-4cf4-b06d-2edc81e5debe");
    _UnreconciledSearch.Enter_DateFrom11("44237");
    

    TestModellerLogger.SetLastNodeGuid("325bf592-ccb5-4649-b30d-6826c5c0d452");
    _UnreconciledSearch.Enter_DateTo12("44237");
    

    TestModellerLogger.SetLastNodeGuid("d030e7a9-5261-4df2-b2d2-6cc07e70504d");
    _UnreconciledSearch.Click_Update_BTNN();
    

pages.unconsiledgrid _unconsiledgrid = new pages.unconsiledgrid(driver);
    TestModellerLogger.SetLastNodeGuid("3d411e3c-5c3f-4153-b926-4e346a8a622e");
    _unconsiledgrid.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("b9b2843c-608d-48cc-a40d-37a9536817a3");
//    _unconsiledgrid.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("bda1776b-d5b9-4cb9-a48d-3bb511b93e58");
    _unconsiledgrid.Click_checkbox1();
    

    TestModellerLogger.SetLastNodeGuid("5e358f1f-8cf3-4256-81c2-c8eeceee3c19");
    _unconsiledgrid.Click_Select_an_option3();
    

    TestModellerLogger.SetLastNodeGuid("daee70a0-1b56-4d5e-bae4-47f9d0b01817");
    _unconsiledgrid.Enter_innerbox("");
    

    TestModellerLogger.SetLastNodeGuid("18fa7be0-bc13-46ae-af3a-34d2550b7a23");
    _unconsiledgrid.Click_Reconcile_btn1();
    

    }

    @Test  (groups= {"Verify Unreconcilled_trans","Verify Unreconcilled_trans - Unreconciled_Tran"})
    @TestModellerPath(guid = "cb2cfa1b-de7a-4633-b135-27e7f210d765")
    public void UnreconciledTranGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAsse27()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("8BZOre2WA7");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    
//
//    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
//    _AgentSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("architecto");
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
//    _Searchclient.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Brakus, Pollich and Hagenes");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
    _bankmenu.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
//    _bankmenu.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
    _bankmenu.Click_Bankingmenu();
    

    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
    _bankmenu.Click_Newmenu();
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
//    _nBANKTRN.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
    _nBANKTRN.Select_BK_SELECT("nidhibank");
    

    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
    _nBANKTRN.Enter_NDate("44237");
    

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
    

//    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
//    _nBANKTRN.Click__1400_DATA();
//    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

pages.unconcilledbutn _unconcilledbutn = new pages.unconcilledbutn(driver);
    TestModellerLogger.SetLastNodeGuid("dd35ab3f-9a3f-41c8-b46a-f878062d2bd4");
    _unconcilledbutn.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("23d80cba-07ce-43f2-a76a-1d33bb41b05a");
//    _unconcilledbutn.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("3707d400-fede-4a41-968e-5d3eb200b18e");
    _unconcilledbutn.Click_Unreconciled_Transactions_button1();
    

pages.UnreconciledSearch _UnreconciledSearch = new pages.UnreconciledSearch(driver);
    TestModellerLogger.SetLastNodeGuid("3846d5f2-85cb-4331-8ccf-bb60a8dfac36");
    _UnreconciledSearch.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("a9f96659-b0f0-46ef-89bc-1484dae69392");
//    _UnreconciledSearch.AssertUrl();
 

    TestModellerLogger.SetLastNodeGuid("8a7edde5-a78b-402b-81df-9d97b660150b");
    _UnreconciledSearch.Select_BNK_Account("nidhibank");
    

    TestModellerLogger.SetLastNodeGuid("ac3ace08-4d39-4b7c-97f3-78d3616dcab3");
    _UnreconciledSearch.Select_Date_Range("This Month");
    

    TestModellerLogger.SetLastNodeGuid("a0e3ae95-061e-4cf4-b06d-2edc81e5debe");
    _UnreconciledSearch.Enter_DateFrom11("44237");
    

    TestModellerLogger.SetLastNodeGuid("325bf592-ccb5-4649-b30d-6826c5c0d452");
    _UnreconciledSearch.Enter_DateTo12("44237");
    

    TestModellerLogger.SetLastNodeGuid("d030e7a9-5261-4df2-b2d2-6cc07e70504d");
    _UnreconciledSearch.Click_Update_BTNN();
    

pages.unconsiledgrid _unconsiledgrid = new pages.unconsiledgrid(driver);
    TestModellerLogger.SetLastNodeGuid("3d411e3c-5c3f-4153-b926-4e346a8a622e");
    _unconsiledgrid.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("b9b2843c-608d-48cc-a40d-37a9536817a3");
//    _unconsiledgrid.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("bda1776b-d5b9-4cb9-a48d-3bb511b93e58");
    _unconsiledgrid.Click_checkbox1();
    

    TestModellerLogger.SetLastNodeGuid("5e358f1f-8cf3-4256-81c2-c8eeceee3c19");
    _unconsiledgrid.Click_Select_an_option3();
    

    TestModellerLogger.SetLastNodeGuid("daee70a0-1b56-4d5e-bae4-47f9d0b01817");
    _unconsiledgrid.Enter_innerbox("");
    

    TestModellerLogger.SetLastNodeGuid("18fa7be0-bc13-46ae-af3a-34d2550b7a23");
    _unconsiledgrid.Click_Reconcile_btn1();
    

    }

    @Test  (groups= {"Verify Unreconcilled_trans","Verify Unreconcilled_trans - Unreconciled_Tran"})
    @TestModellerPath(guid = "a78850c4-a7cd-40ef-abd5-2cc188ed5700")
    public void UnreconciledTranGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAsse28()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("U1_LLlAvqQ");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
//    _AgentSearch.AssertUrl();
    

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
    

//    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
//    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Shanahan, Lemke and Quigley");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
    _bankmenu.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
//    _bankmenu.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
    _bankmenu.Click_Bankingmenu();
    

    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
    _bankmenu.Click_Newmenu();
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
//    _nBANKTRN.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
    _nBANKTRN.Select_BK_SELECT("nidhibank");
    

    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
    _nBANKTRN.Enter_NDate("44237");
    

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
    

//    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
//    _nBANKTRN.Click__1400_DATA();
//    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

pages.unconcilledbutn _unconcilledbutn = new pages.unconcilledbutn(driver);
    TestModellerLogger.SetLastNodeGuid("dd35ab3f-9a3f-41c8-b46a-f878062d2bd4");
    _unconcilledbutn.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("23d80cba-07ce-43f2-a76a-1d33bb41b05a");
//    _unconcilledbutn.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("3707d400-fede-4a41-968e-5d3eb200b18e");
    _unconcilledbutn.Click_Unreconciled_Transactions_button1();
    

pages.UnreconciledSearch _UnreconciledSearch = new pages.UnreconciledSearch(driver);
    TestModellerLogger.SetLastNodeGuid("3846d5f2-85cb-4331-8ccf-bb60a8dfac36");
    _UnreconciledSearch.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("a9f96659-b0f0-46ef-89bc-1484dae69392");
//    _UnreconciledSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8a7edde5-a78b-402b-81df-9d97b660150b");
    _UnreconciledSearch.Select_BNK_Account("Nidhilimited1");
    

    TestModellerLogger.SetLastNodeGuid("ac3ace08-4d39-4b7c-97f3-78d3616dcab3");
    _UnreconciledSearch.Select_Date_Range("This Month");
    

    TestModellerLogger.SetLastNodeGuid("a0e3ae95-061e-4cf4-b06d-2edc81e5debe");
    _UnreconciledSearch.Enter_DateFrom11("44237");
    

    TestModellerLogger.SetLastNodeGuid("325bf592-ccb5-4649-b30d-6826c5c0d452");
    _UnreconciledSearch.Enter_DateTo12("44237");
    

    TestModellerLogger.SetLastNodeGuid("d030e7a9-5261-4df2-b2d2-6cc07e70504d");
    _UnreconciledSearch.Click_Update_BTNN();
    

pages.unconsiledgrid _unconsiledgrid = new pages.unconsiledgrid(driver);
    TestModellerLogger.SetLastNodeGuid("3d411e3c-5c3f-4153-b926-4e346a8a622e");
    _unconsiledgrid.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("b9b2843c-608d-48cc-a40d-37a9536817a3");
//    _unconsiledgrid.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("bda1776b-d5b9-4cb9-a48d-3bb511b93e58");
    _unconsiledgrid.Click_checkbox1();
    

    TestModellerLogger.SetLastNodeGuid("5e358f1f-8cf3-4256-81c2-c8eeceee3c19");
    _unconsiledgrid.Click_Select_an_option3();
    

    TestModellerLogger.SetLastNodeGuid("daee70a0-1b56-4d5e-bae4-47f9d0b01817");
    _unconsiledgrid.Enter_innerbox("");
    

    TestModellerLogger.SetLastNodeGuid("18fa7be0-bc13-46ae-af3a-34d2550b7a23");
    _unconsiledgrid.Click_Reconcile_btn1();
    

    }

    @Test  (groups= {"Verify Unreconcilled_trans","Verify Unreconcilled_trans - Unreconciled_Tran"})
    @TestModellerPath(guid = "be9310fb-4ca9-46f2-ac01-6a453b0c766c")
    public void UnreconciledTranGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAsse29()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//    _nlogin.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("cad0VuECwF");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
//    _AgentSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("dolorem");
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
//    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Bartoletti - Bernhard");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
    _bankmenu.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
//    _bankmenu.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
    _bankmenu.Click_Bankingmenu();
    

    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
    _bankmenu.Click_Newmenu();
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
//    _nBANKTRN.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
    _nBANKTRN.Select_BK_SELECT("nidhibank");
    

    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
    _nBANKTRN.Enter_NDate("44237");
    

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
    

//    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
//    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

pages.unconcilledbutn _unconcilledbutn = new pages.unconcilledbutn(driver);
    TestModellerLogger.SetLastNodeGuid("dd35ab3f-9a3f-41c8-b46a-f878062d2bd4");
    _unconcilledbutn.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("23d80cba-07ce-43f2-a76a-1d33bb41b05a");
//    _unconcilledbutn.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("3707d400-fede-4a41-968e-5d3eb200b18e");
    _unconcilledbutn.Click_Unreconciled_Transactions_button1();
    

pages.UnreconciledSearch _UnreconciledSearch = new pages.UnreconciledSearch(driver);
    TestModellerLogger.SetLastNodeGuid("3846d5f2-85cb-4331-8ccf-bb60a8dfac36");
    _UnreconciledSearch.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("a9f96659-b0f0-46ef-89bc-1484dae69392");
//    _UnreconciledSearch.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("8a7edde5-a78b-402b-81df-9d97b660150b");
    _UnreconciledSearch.Select_BNK_Account("Nidlimited");
    

    TestModellerLogger.SetLastNodeGuid("ac3ace08-4d39-4b7c-97f3-78d3616dcab3");
    _UnreconciledSearch.Select_Date_Range("This Month");
    

    TestModellerLogger.SetLastNodeGuid("a0e3ae95-061e-4cf4-b06d-2edc81e5debe");
    _UnreconciledSearch.Enter_DateFrom11("44237");
    

    TestModellerLogger.SetLastNodeGuid("325bf592-ccb5-4649-b30d-6826c5c0d452");
    _UnreconciledSearch.Enter_DateTo12("44237");
    

    TestModellerLogger.SetLastNodeGuid("d030e7a9-5261-4df2-b2d2-6cc07e70504d");
    _UnreconciledSearch.Click_Update_BTNN();
    

pages.unconsiledgrid _unconsiledgrid = new pages.unconsiledgrid(driver);
    TestModellerLogger.SetLastNodeGuid("3d411e3c-5c3f-4153-b926-4e346a8a622e");
    _unconsiledgrid.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("b9b2843c-608d-48cc-a40d-37a9536817a3");
//    _unconsiledgrid.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("bda1776b-d5b9-4cb9-a48d-3bb511b93e58");
    _unconsiledgrid.Click_checkbox1();
    

    TestModellerLogger.SetLastNodeGuid("5e358f1f-8cf3-4256-81c2-c8eeceee3c19");
    _unconsiledgrid.Click_Select_an_option3();
    

    TestModellerLogger.SetLastNodeGuid("daee70a0-1b56-4d5e-bae4-47f9d0b01817");
    _unconsiledgrid.Enter_innerbox("");
    

    TestModellerLogger.SetLastNodeGuid("18fa7be0-bc13-46ae-af3a-34d2550b7a23");
    _unconsiledgrid.Click_Reconcile_btn1();
    

    }

    @Test  (groups= {"Verify Unreconcilled_trans","Verify Unreconcilled_trans - Unreconciled_Tran"})
    @TestModellerPath(guid = "72b2d288-ecbd-48af-9b3e-f9bfaee6dd05")
    public void UnreconciledTranGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAsse30()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    
//
//    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("ebp7ednYBy");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
//    _AgentSearch.AssertUrl();

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("quo");
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
//    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("O'Hara Inc");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
    _bankmenu.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
//    _bankmenu.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
    _bankmenu.Click_Bankingmenu();
    

    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
    _bankmenu.Click_Newmenu();
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
//    _nBANKTRN.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
    _nBANKTRN.Select_BK_SELECT("nidhibank");
    

    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
    _nBANKTRN.Enter_NDate("44237");
    

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
    

//    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
//    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

pages.unconcilledbutn _unconcilledbutn = new pages.unconcilledbutn(driver);
    TestModellerLogger.SetLastNodeGuid("dd35ab3f-9a3f-41c8-b46a-f878062d2bd4");
    _unconcilledbutn.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("23d80cba-07ce-43f2-a76a-1d33bb41b05a");
//    _unconcilledbutn.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("3707d400-fede-4a41-968e-5d3eb200b18e");
    _unconcilledbutn.Click_Unreconciled_Transactions_button1();
    

pages.UnreconciledSearch _UnreconciledSearch = new pages.UnreconciledSearch(driver);
    TestModellerLogger.SetLastNodeGuid("3846d5f2-85cb-4331-8ccf-bb60a8dfac36");
    _UnreconciledSearch.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("a9f96659-b0f0-46ef-89bc-1484dae69392");
//    _UnreconciledSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8a7edde5-a78b-402b-81df-9d97b660150b");
    _UnreconciledSearch.Select_BNK_Account("test");
    

    TestModellerLogger.SetLastNodeGuid("ac3ace08-4d39-4b7c-97f3-78d3616dcab3");
    _UnreconciledSearch.Select_Date_Range("This Month");
    

    TestModellerLogger.SetLastNodeGuid("a0e3ae95-061e-4cf4-b06d-2edc81e5debe");
    _UnreconciledSearch.Enter_DateFrom11("44237");
    

    TestModellerLogger.SetLastNodeGuid("325bf592-ccb5-4649-b30d-6826c5c0d452");
    _UnreconciledSearch.Enter_DateTo12("44237");
    

    TestModellerLogger.SetLastNodeGuid("d030e7a9-5261-4df2-b2d2-6cc07e70504d");
    _UnreconciledSearch.Click_Update_BTNN();
    

pages.unconsiledgrid _unconsiledgrid = new pages.unconsiledgrid(driver);
    TestModellerLogger.SetLastNodeGuid("3d411e3c-5c3f-4153-b926-4e346a8a622e");
    _unconsiledgrid.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("b9b2843c-608d-48cc-a40d-37a9536817a3");
//    _unconsiledgrid.AssertUrl();


    TestModellerLogger.SetLastNodeGuid("bda1776b-d5b9-4cb9-a48d-3bb511b93e58");
    _unconsiledgrid.Click_checkbox1();
    

    TestModellerLogger.SetLastNodeGuid("5e358f1f-8cf3-4256-81c2-c8eeceee3c19");
    _unconsiledgrid.Click_Select_an_option3();
    

    TestModellerLogger.SetLastNodeGuid("daee70a0-1b56-4d5e-bae4-47f9d0b01817");
    _unconsiledgrid.Enter_innerbox("");
    

    TestModellerLogger.SetLastNodeGuid("18fa7be0-bc13-46ae-af3a-34d2550b7a23");
    _unconsiledgrid.Click_Reconcile_btn1();
    

    }

    @Test  (groups= {"Verify Unreconcilled_trans","Verify Unreconcilled_trans - Unreconciled_Tran"})
    @TestModellerPath(guid = "8d556ef4-e0e4-4dce-964c-0e45c3422e65")
    public void UnreconciledTranGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAsse31()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("UHOKx6QDsw");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
//    _AgentSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("quaerat");
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
//    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Farrell - Orn");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
    _bankmenu.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
//    _bankmenu.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
    _bankmenu.Click_Bankingmenu();
    

    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
    _bankmenu.Click_Newmenu();
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
//    _nBANKTRN.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
    _nBANKTRN.Select_BK_SELECT("nidhibank");
    

    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
    _nBANKTRN.Enter_NDate("44237");
    

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
    

//    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
//    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

pages.unconcilledbutn _unconcilledbutn = new pages.unconcilledbutn(driver);
    TestModellerLogger.SetLastNodeGuid("dd35ab3f-9a3f-41c8-b46a-f878062d2bd4");
    _unconcilledbutn.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("23d80cba-07ce-43f2-a76a-1d33bb41b05a");
//    _unconcilledbutn.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("3707d400-fede-4a41-968e-5d3eb200b18e");
    _unconcilledbutn.Click_Unreconciled_Transactions_button1();
    

pages.UnreconciledSearch _UnreconciledSearch = new pages.UnreconciledSearch(driver);
    TestModellerLogger.SetLastNodeGuid("3846d5f2-85cb-4331-8ccf-bb60a8dfac36");
    _UnreconciledSearch.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("a9f96659-b0f0-46ef-89bc-1484dae69392");
//    _UnreconciledSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8a7edde5-a78b-402b-81df-9d97b660150b");
    _UnreconciledSearch.Select_BNK_Account("NidhiLimited");
    

    TestModellerLogger.SetLastNodeGuid("ac3ace08-4d39-4b7c-97f3-78d3616dcab3");
    _UnreconciledSearch.Select_Date_Range("This Month");
    

    TestModellerLogger.SetLastNodeGuid("a0e3ae95-061e-4cf4-b06d-2edc81e5debe");
    _UnreconciledSearch.Enter_DateFrom11("44237");
    

    TestModellerLogger.SetLastNodeGuid("325bf592-ccb5-4649-b30d-6826c5c0d452");
    _UnreconciledSearch.Enter_DateTo12("44237");
    

    TestModellerLogger.SetLastNodeGuid("d030e7a9-5261-4df2-b2d2-6cc07e70504d");
    _UnreconciledSearch.Click_Update_BTNN();
    

pages.unconsiledgrid _unconsiledgrid = new pages.unconsiledgrid(driver);
    TestModellerLogger.SetLastNodeGuid("3d411e3c-5c3f-4153-b926-4e346a8a622e");
    _unconsiledgrid.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("b9b2843c-608d-48cc-a40d-37a9536817a3");
//    _unconsiledgrid.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("bda1776b-d5b9-4cb9-a48d-3bb511b93e58");
    _unconsiledgrid.Click_checkbox1();
    

    TestModellerLogger.SetLastNodeGuid("5e358f1f-8cf3-4256-81c2-c8eeceee3c19");
    _unconsiledgrid.Click_Select_an_option3();
    

    TestModellerLogger.SetLastNodeGuid("daee70a0-1b56-4d5e-bae4-47f9d0b01817");
    _unconsiledgrid.Enter_innerbox("");
    

    TestModellerLogger.SetLastNodeGuid("18fa7be0-bc13-46ae-af3a-34d2550b7a23");
    _unconsiledgrid.Click_Reconcile_btn1();
    

    }

    @Test  (groups= {"Verify Unreconcilled_trans","Verify Unreconcilled_trans - Unreconciled_Tran"})
    @TestModellerPath(guid = "8a983470-7aa0-4052-82fa-925941f3914f")
    public void UnreconciledTranGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAsse32()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//    _nlogin.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("S75254WzGG");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
//    _AgentSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("maxime");
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
//    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Swaniawski, Barrows and Gleichner");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
    _bankmenu.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
//    _bankmenu.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
    _bankmenu.Click_Bankingmenu();
    

    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
    _bankmenu.Click_Newmenu();
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
//    _nBANKTRN.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
    _nBANKTRN.Select_BK_SELECT("nidhibank");
    

    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
    _nBANKTRN.Enter_NDate("44237");
    

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
    

//    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
//    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

pages.unconcilledbutn _unconcilledbutn = new pages.unconcilledbutn(driver);
    TestModellerLogger.SetLastNodeGuid("dd35ab3f-9a3f-41c8-b46a-f878062d2bd4");
    _unconcilledbutn.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("23d80cba-07ce-43f2-a76a-1d33bb41b05a");
//    _unconcilledbutn.AssertUrl();


    TestModellerLogger.SetLastNodeGuid("3707d400-fede-4a41-968e-5d3eb200b18e");
    _unconcilledbutn.Click_Unreconciled_Transactions_button1();
    

pages.UnreconciledSearch _UnreconciledSearch = new pages.UnreconciledSearch(driver);
    TestModellerLogger.SetLastNodeGuid("3846d5f2-85cb-4331-8ccf-bb60a8dfac36");
    _UnreconciledSearch.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("a9f96659-b0f0-46ef-89bc-1484dae69392");
//    _UnreconciledSearch.AssertUrl();


    TestModellerLogger.SetLastNodeGuid("8a7edde5-a78b-402b-81df-9d97b660150b");
    _UnreconciledSearch.Select_BNK_Account("NidhiLimited");
    

    TestModellerLogger.SetLastNodeGuid("ac3ace08-4d39-4b7c-97f3-78d3616dcab3");
    _UnreconciledSearch.Select_Date_Range("This Month");
    

    TestModellerLogger.SetLastNodeGuid("a0e3ae95-061e-4cf4-b06d-2edc81e5debe");
    _UnreconciledSearch.Enter_DateFrom11("44237");
    

    TestModellerLogger.SetLastNodeGuid("325bf592-ccb5-4649-b30d-6826c5c0d452");
    _UnreconciledSearch.Enter_DateTo12("44237");
    

    TestModellerLogger.SetLastNodeGuid("d030e7a9-5261-4df2-b2d2-6cc07e70504d");
    _UnreconciledSearch.Click_Update_BTNN();
    

pages.unconsiledgrid _unconsiledgrid = new pages.unconsiledgrid(driver);
    TestModellerLogger.SetLastNodeGuid("3d411e3c-5c3f-4153-b926-4e346a8a622e");
    _unconsiledgrid.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("b9b2843c-608d-48cc-a40d-37a9536817a3");
//    _unconsiledgrid.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("bda1776b-d5b9-4cb9-a48d-3bb511b93e58");
    _unconsiledgrid.Click_checkbox1();
    

    TestModellerLogger.SetLastNodeGuid("5e358f1f-8cf3-4256-81c2-c8eeceee3c19");
    _unconsiledgrid.Click_Select_an_option3();
    

    TestModellerLogger.SetLastNodeGuid("daee70a0-1b56-4d5e-bae4-47f9d0b01817");
    _unconsiledgrid.Enter_innerbox("");
    

    TestModellerLogger.SetLastNodeGuid("18fa7be0-bc13-46ae-af3a-34d2550b7a23");
    _unconsiledgrid.Click_Reconcile_btn1();
    

    }

    @Test  (groups= {"Verify Unreconcilled_trans","Verify Unreconcilled_trans - Unreconciled_Tran"})
    @TestModellerPath(guid = "191de43f-e3ac-4a3e-9ff5-8d15b25a817f")
    public void UnreconciledTranGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAsse33()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("WhiwdzzEPG");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
//    _AgentSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("deserunt");
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
//    _Searchclient.AssertUrl();


    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Sauer and Sons");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
    _bankmenu.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
//    _bankmenu.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
    _bankmenu.Click_Bankingmenu();
    

    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
    _bankmenu.Click_Newmenu();
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
//    _nBANKTRN.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
    _nBANKTRN.Select_BK_SELECT("nidhibank");
    

    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
    _nBANKTRN.Enter_NDate("44237");
    

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
    

//    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
//    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

pages.unconcilledbutn _unconcilledbutn = new pages.unconcilledbutn(driver);
    TestModellerLogger.SetLastNodeGuid("dd35ab3f-9a3f-41c8-b46a-f878062d2bd4");
    _unconcilledbutn.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("23d80cba-07ce-43f2-a76a-1d33bb41b05a");
//    _unconcilledbutn.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("3707d400-fede-4a41-968e-5d3eb200b18e");
    _unconcilledbutn.Click_Unreconciled_Transactions_button1();
    

pages.UnreconciledSearch _UnreconciledSearch = new pages.UnreconciledSearch(driver);
    TestModellerLogger.SetLastNodeGuid("3846d5f2-85cb-4331-8ccf-bb60a8dfac36");
    _UnreconciledSearch.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("a9f96659-b0f0-46ef-89bc-1484dae69392");
//    _UnreconciledSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8a7edde5-a78b-402b-81df-9d97b660150b");
    _UnreconciledSearch.Select_BNK_Account("All");
    

    TestModellerLogger.SetLastNodeGuid("ac3ace08-4d39-4b7c-97f3-78d3616dcab3");
    _UnreconciledSearch.Select_Date_Range("This Month");
    

    TestModellerLogger.SetLastNodeGuid("a0e3ae95-061e-4cf4-b06d-2edc81e5debe");
    _UnreconciledSearch.Enter_DateFrom11("44237");
    

    TestModellerLogger.SetLastNodeGuid("325bf592-ccb5-4649-b30d-6826c5c0d452");
    _UnreconciledSearch.Enter_DateTo12("44237");
    

    TestModellerLogger.SetLastNodeGuid("d030e7a9-5261-4df2-b2d2-6cc07e70504d");
    _UnreconciledSearch.Click_Update_BTNN();
    

pages.unconsiledgrid _unconsiledgrid = new pages.unconsiledgrid(driver);
    TestModellerLogger.SetLastNodeGuid("3d411e3c-5c3f-4153-b926-4e346a8a622e");
    _unconsiledgrid.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("b9b2843c-608d-48cc-a40d-37a9536817a3");
//    _unconsiledgrid.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("bda1776b-d5b9-4cb9-a48d-3bb511b93e58");
    _unconsiledgrid.Click_checkbox1();
    

    TestModellerLogger.SetLastNodeGuid("5e358f1f-8cf3-4256-81c2-c8eeceee3c19");
    _unconsiledgrid.Click_Select_an_option3();
    

    TestModellerLogger.SetLastNodeGuid("daee70a0-1b56-4d5e-bae4-47f9d0b01817");
    _unconsiledgrid.Enter_innerbox("");
    

    TestModellerLogger.SetLastNodeGuid("18fa7be0-bc13-46ae-af3a-34d2550b7a23");
    _unconsiledgrid.Click_Reconcile_btn1();
    

    }

    @Test  (groups= {"Verify Unreconcilled_trans","Verify Unreconcilled_trans - Unreconciled_Tran"})
    @TestModellerPath(guid = "90a42ec8-69c9-4cd6-86c1-030e83ba4bfd")
    public void UnreconciledTranGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAsse34()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("lxT5rld5zL");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
//    _AgentSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("quia");
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
//    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Quigley - Dooley");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
    _bankmenu.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
//    _bankmenu.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
    _bankmenu.Click_Bankingmenu();
    

    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
    _bankmenu.Click_Newmenu();
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
//    _nBANKTRN.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
    _nBANKTRN.Select_BK_SELECT("nidhibank");
    

    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
    _nBANKTRN.Enter_NDate("44237");
    

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
    

//    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
//    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

pages.unconcilledbutn _unconcilledbutn = new pages.unconcilledbutn(driver);
    TestModellerLogger.SetLastNodeGuid("dd35ab3f-9a3f-41c8-b46a-f878062d2bd4");
    _unconcilledbutn.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("23d80cba-07ce-43f2-a76a-1d33bb41b05a");
//    _unconcilledbutn.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("3707d400-fede-4a41-968e-5d3eb200b18e");
    _unconcilledbutn.Click_Unreconciled_Transactions_button1();
    

pages.UnreconciledSearch _UnreconciledSearch = new pages.UnreconciledSearch(driver);
    TestModellerLogger.SetLastNodeGuid("3846d5f2-85cb-4331-8ccf-bb60a8dfac36");
    _UnreconciledSearch.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("a9f96659-b0f0-46ef-89bc-1484dae69392");
//    _UnreconciledSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8a7edde5-a78b-402b-81df-9d97b660150b");
    _UnreconciledSearch.Select_BNK_Account("All");
    

    TestModellerLogger.SetLastNodeGuid("ac3ace08-4d39-4b7c-97f3-78d3616dcab3");
    _UnreconciledSearch.Select_Date_Range("This Month");
    

    TestModellerLogger.SetLastNodeGuid("a0e3ae95-061e-4cf4-b06d-2edc81e5debe");
    _UnreconciledSearch.Enter_DateFrom11("44237");
    

    TestModellerLogger.SetLastNodeGuid("325bf592-ccb5-4649-b30d-6826c5c0d452");
    _UnreconciledSearch.Enter_DateTo12("44237");
    

    TestModellerLogger.SetLastNodeGuid("d030e7a9-5261-4df2-b2d2-6cc07e70504d");
    _UnreconciledSearch.Click_Update_BTNN();
    

pages.unconsiledgrid _unconsiledgrid = new pages.unconsiledgrid(driver);
    TestModellerLogger.SetLastNodeGuid("3d411e3c-5c3f-4153-b926-4e346a8a622e");
    _unconsiledgrid.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("b9b2843c-608d-48cc-a40d-37a9536817a3");
//    _unconsiledgrid.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("bda1776b-d5b9-4cb9-a48d-3bb511b93e58");
    _unconsiledgrid.Click_checkbox1();
    

    TestModellerLogger.SetLastNodeGuid("5e358f1f-8cf3-4256-81c2-c8eeceee3c19");
    _unconsiledgrid.Click_Select_an_option3();
    

    TestModellerLogger.SetLastNodeGuid("daee70a0-1b56-4d5e-bae4-47f9d0b01817");
    _unconsiledgrid.Enter_innerbox("");
    

    TestModellerLogger.SetLastNodeGuid("18fa7be0-bc13-46ae-af3a-34d2550b7a23");
    _unconsiledgrid.Click_Reconcile_btn1();
    

    }

    @Test  (groups= {"Verify Unreconcilled_trans","Verify Unreconcilled_trans - Unreconciled_Tran"})
    @TestModellerPath(guid = "c5c88cc2-07f1-4ef7-aa22-9f9428065f1d")
    public void UnreconciledTranGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAsse35()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("EwztLLab7S");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
//    _AgentSearch.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("illum");
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
//    _Searchclient.AssertUrl();


    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Nader, Kuhic and Torp");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
    _bankmenu.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
//    _bankmenu.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
    _bankmenu.Click_Bankingmenu();
    

    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
    _bankmenu.Click_Newmenu();
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
//    _nBANKTRN.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
    _nBANKTRN.Select_BK_SELECT("nidhibank");
    

    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
    _nBANKTRN.Enter_NDate("44237");
    

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
    

//    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
//    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

pages.unconcilledbutn _unconcilledbutn = new pages.unconcilledbutn(driver);
    TestModellerLogger.SetLastNodeGuid("dd35ab3f-9a3f-41c8-b46a-f878062d2bd4");
    _unconcilledbutn.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("23d80cba-07ce-43f2-a76a-1d33bb41b05a");
//    _unconcilledbutn.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("3707d400-fede-4a41-968e-5d3eb200b18e");
    _unconcilledbutn.Click_Unreconciled_Transactions_button1();
    

pages.UnreconciledSearch _UnreconciledSearch = new pages.UnreconciledSearch(driver);
    TestModellerLogger.SetLastNodeGuid("3846d5f2-85cb-4331-8ccf-bb60a8dfac36");
    _UnreconciledSearch.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("a9f96659-b0f0-46ef-89bc-1484dae69392");
//    _UnreconciledSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8a7edde5-a78b-402b-81df-9d97b660150b");
    _UnreconciledSearch.Select_BNK_Account("All");
    

    TestModellerLogger.SetLastNodeGuid("ac3ace08-4d39-4b7c-97f3-78d3616dcab3");
    _UnreconciledSearch.Select_Date_Range("This Month");
    

    TestModellerLogger.SetLastNodeGuid("a0e3ae95-061e-4cf4-b06d-2edc81e5debe");
    _UnreconciledSearch.Enter_DateFrom11("44237");
    

    TestModellerLogger.SetLastNodeGuid("325bf592-ccb5-4649-b30d-6826c5c0d452");
    _UnreconciledSearch.Enter_DateTo12("44237");
    

    TestModellerLogger.SetLastNodeGuid("d030e7a9-5261-4df2-b2d2-6cc07e70504d");
    _UnreconciledSearch.Click_Update_BTNN();
    

pages.unconsiledgrid _unconsiledgrid = new pages.unconsiledgrid(driver);
    TestModellerLogger.SetLastNodeGuid("3d411e3c-5c3f-4153-b926-4e346a8a622e");
    _unconsiledgrid.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("b9b2843c-608d-48cc-a40d-37a9536817a3");
//    _unconsiledgrid.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("bda1776b-d5b9-4cb9-a48d-3bb511b93e58");
    _unconsiledgrid.Click_checkbox1();
    

    TestModellerLogger.SetLastNodeGuid("5e358f1f-8cf3-4256-81c2-c8eeceee3c19");
    _unconsiledgrid.Click_Select_an_option3();
    

    TestModellerLogger.SetLastNodeGuid("daee70a0-1b56-4d5e-bae4-47f9d0b01817");
    _unconsiledgrid.Enter_innerbox("");
    

    TestModellerLogger.SetLastNodeGuid("18fa7be0-bc13-46ae-af3a-34d2550b7a23");
    _unconsiledgrid.Click_Reconcile_btn1();
    

    }

    @Test  (groups= {"Verify Unreconcilled_trans","Verify Unreconcilled_trans - Unreconciled_Tran"})
    @TestModellerPath(guid = "e5b1a73d-3b14-4716-9a30-2b21f8b5fcbf")
    public void UnreconciledTranGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAsse36()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("yMHK3ONvnl");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
//    _AgentSearch.AssertUrl();
    

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
    

//    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
//    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Ortiz Inc");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
    _bankmenu.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
//    _bankmenu.AssertUrl();


    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
    _bankmenu.Click_Bankingmenu();
    

    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
    _bankmenu.Click_Newmenu();
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
//    _nBANKTRN.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
    _nBANKTRN.Select_BK_SELECT("nidhibank");
    

    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
    _nBANKTRN.Enter_NDate("44237");
    

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
    

//    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
//    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

pages.unconcilledbutn _unconcilledbutn = new pages.unconcilledbutn(driver);
    TestModellerLogger.SetLastNodeGuid("dd35ab3f-9a3f-41c8-b46a-f878062d2bd4");
    _unconcilledbutn.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("23d80cba-07ce-43f2-a76a-1d33bb41b05a");
//    _unconcilledbutn.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("3707d400-fede-4a41-968e-5d3eb200b18e");
    _unconcilledbutn.Click_Unreconciled_Transactions_button1();
    

pages.UnreconciledSearch _UnreconciledSearch = new pages.UnreconciledSearch(driver);
    TestModellerLogger.SetLastNodeGuid("3846d5f2-85cb-4331-8ccf-bb60a8dfac36");
    _UnreconciledSearch.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("a9f96659-b0f0-46ef-89bc-1484dae69392");
//    _UnreconciledSearch.AssertUrl();
   

    TestModellerLogger.SetLastNodeGuid("8a7edde5-a78b-402b-81df-9d97b660150b");
    _UnreconciledSearch.Select_BNK_Account("All");
    

    TestModellerLogger.SetLastNodeGuid("ac3ace08-4d39-4b7c-97f3-78d3616dcab3");
    _UnreconciledSearch.Select_Date_Range("This Month");
    

    TestModellerLogger.SetLastNodeGuid("a0e3ae95-061e-4cf4-b06d-2edc81e5debe");
    _UnreconciledSearch.Enter_DateFrom11("44237");
    

    TestModellerLogger.SetLastNodeGuid("325bf592-ccb5-4649-b30d-6826c5c0d452");
    _UnreconciledSearch.Enter_DateTo12("44237");
    

    TestModellerLogger.SetLastNodeGuid("d030e7a9-5261-4df2-b2d2-6cc07e70504d");
    _UnreconciledSearch.Click_Update_BTNN();
    

pages.unconsiledgrid _unconsiledgrid = new pages.unconsiledgrid(driver);
    TestModellerLogger.SetLastNodeGuid("3d411e3c-5c3f-4153-b926-4e346a8a622e");
    _unconsiledgrid.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("b9b2843c-608d-48cc-a40d-37a9536817a3");
//    _unconsiledgrid.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("bda1776b-d5b9-4cb9-a48d-3bb511b93e58");
    _unconsiledgrid.Click_checkbox1();
    

    TestModellerLogger.SetLastNodeGuid("5e358f1f-8cf3-4256-81c2-c8eeceee3c19");
    _unconsiledgrid.Click_Select_an_option3();
    

    TestModellerLogger.SetLastNodeGuid("daee70a0-1b56-4d5e-bae4-47f9d0b01817");
    _unconsiledgrid.Enter_innerbox("");
    

    TestModellerLogger.SetLastNodeGuid("18fa7be0-bc13-46ae-af3a-34d2550b7a23");
    _unconsiledgrid.Click_Reconcile_btn1();
    

    }

    @Test  (groups= {"Verify Unreconcilled_trans","Verify Unreconcilled_trans - Unreconciled_Tran"})
    @TestModellerPath(guid = "3ef4e978-c169-4b28-b908-76b083c2aeae")
    public void UnreconciledTranGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAsse37()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("kPKGztMXU1");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
//    _AgentSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("velit");
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
//    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Smith LLC");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
    _bankmenu.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
//    _bankmenu.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
    _bankmenu.Click_Bankingmenu();
    

    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
    _bankmenu.Click_Newmenu();
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
//    _nBANKTRN.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
    _nBANKTRN.Select_BK_SELECT("nidhibank");
    

    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
    _nBANKTRN.Enter_NDate("2020-03-20 09:22:25");
    

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
    

//    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
//    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

pages.unconcilledbutn _unconcilledbutn = new pages.unconcilledbutn(driver);
    TestModellerLogger.SetLastNodeGuid("dd35ab3f-9a3f-41c8-b46a-f878062d2bd4");
    _unconcilledbutn.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("23d80cba-07ce-43f2-a76a-1d33bb41b05a");
//    _unconcilledbutn.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("3707d400-fede-4a41-968e-5d3eb200b18e");
    _unconcilledbutn.Click_Unreconciled_Transactions_button1();
    

pages.UnreconciledSearch _UnreconciledSearch = new pages.UnreconciledSearch(driver);
    TestModellerLogger.SetLastNodeGuid("3846d5f2-85cb-4331-8ccf-bb60a8dfac36");
    _UnreconciledSearch.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("a9f96659-b0f0-46ef-89bc-1484dae69392");
//    _UnreconciledSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8a7edde5-a78b-402b-81df-9d97b660150b");
    _UnreconciledSearch.Select_BNK_Account("All");
    

    TestModellerLogger.SetLastNodeGuid("ac3ace08-4d39-4b7c-97f3-78d3616dcab3");
    _UnreconciledSearch.Select_Date_Range("This Month");
    

    TestModellerLogger.SetLastNodeGuid("a0e3ae95-061e-4cf4-b06d-2edc81e5debe");
    _UnreconciledSearch.Enter_DateFrom11("44237");
    

    TestModellerLogger.SetLastNodeGuid("325bf592-ccb5-4649-b30d-6826c5c0d452");
    _UnreconciledSearch.Enter_DateTo12("44237");
    

    TestModellerLogger.SetLastNodeGuid("d030e7a9-5261-4df2-b2d2-6cc07e70504d");
    _UnreconciledSearch.Click_Update_BTNN();
    

pages.unconsiledgrid _unconsiledgrid = new pages.unconsiledgrid(driver);
    TestModellerLogger.SetLastNodeGuid("3d411e3c-5c3f-4153-b926-4e346a8a622e");
    _unconsiledgrid.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("b9b2843c-608d-48cc-a40d-37a9536817a3");
//    _unconsiledgrid.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("bda1776b-d5b9-4cb9-a48d-3bb511b93e58");
    _unconsiledgrid.Click_checkbox1();
    

    TestModellerLogger.SetLastNodeGuid("5e358f1f-8cf3-4256-81c2-c8eeceee3c19");
    _unconsiledgrid.Click_Select_an_option3();
    

    TestModellerLogger.SetLastNodeGuid("daee70a0-1b56-4d5e-bae4-47f9d0b01817");
    _unconsiledgrid.Enter_innerbox("");
    

    TestModellerLogger.SetLastNodeGuid("18fa7be0-bc13-46ae-af3a-34d2550b7a23");
    _unconsiledgrid.Click_Reconcile_btn1();
    

    }

    @Test  (groups= {"Verify Unreconcilled_trans","Verify Unreconcilled_trans - Unreconciled_Tran"})
    @TestModellerPath(guid = "f56ad62d-28a3-4ee6-9402-e939bd388835")
    public void UnreconciledTranGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAsse38()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//    _nlogin.AssertUrl();
   

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("hdARHOjquR");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
//    _AgentSearch.AssertUrl();


    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("ratione");
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
//    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Ritchie, Pouros and Hills");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
    _bankmenu.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
//    _bankmenu.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
    _bankmenu.Click_Bankingmenu();
    

    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
    _bankmenu.Click_Newmenu();
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
//    _nBANKTRN.AssertUrl();


    TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
    _nBANKTRN.Select_BK_SELECT("nidhibank");
    

    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
    _nBANKTRN.Enter_NDate("2021-10-16 20:31:58");
    

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
    

//    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
//    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

pages.unconcilledbutn _unconcilledbutn = new pages.unconcilledbutn(driver);
    TestModellerLogger.SetLastNodeGuid("dd35ab3f-9a3f-41c8-b46a-f878062d2bd4");
    _unconcilledbutn.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("23d80cba-07ce-43f2-a76a-1d33bb41b05a");
//    _unconcilledbutn.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("3707d400-fede-4a41-968e-5d3eb200b18e");
    _unconcilledbutn.Click_Unreconciled_Transactions_button1();
    

pages.UnreconciledSearch _UnreconciledSearch = new pages.UnreconciledSearch(driver);
    TestModellerLogger.SetLastNodeGuid("3846d5f2-85cb-4331-8ccf-bb60a8dfac36");
    _UnreconciledSearch.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("a9f96659-b0f0-46ef-89bc-1484dae69392");
//    _UnreconciledSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8a7edde5-a78b-402b-81df-9d97b660150b");
    _UnreconciledSearch.Select_BNK_Account("All");
    

    TestModellerLogger.SetLastNodeGuid("ac3ace08-4d39-4b7c-97f3-78d3616dcab3");
    _UnreconciledSearch.Select_Date_Range("This Month");
    

    TestModellerLogger.SetLastNodeGuid("a0e3ae95-061e-4cf4-b06d-2edc81e5debe");
    _UnreconciledSearch.Enter_DateFrom11("44237");
    

    TestModellerLogger.SetLastNodeGuid("325bf592-ccb5-4649-b30d-6826c5c0d452");
    _UnreconciledSearch.Enter_DateTo12("44237");
    

    TestModellerLogger.SetLastNodeGuid("d030e7a9-5261-4df2-b2d2-6cc07e70504d");
    _UnreconciledSearch.Click_Update_BTNN();
    

pages.unconsiledgrid _unconsiledgrid = new pages.unconsiledgrid(driver);
    TestModellerLogger.SetLastNodeGuid("3d411e3c-5c3f-4153-b926-4e346a8a622e");
    _unconsiledgrid.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("b9b2843c-608d-48cc-a40d-37a9536817a3");
//    _unconsiledgrid.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("bda1776b-d5b9-4cb9-a48d-3bb511b93e58");
    _unconsiledgrid.Click_checkbox1();
    

    TestModellerLogger.SetLastNodeGuid("5e358f1f-8cf3-4256-81c2-c8eeceee3c19");
    _unconsiledgrid.Click_Select_an_option3();
    

    TestModellerLogger.SetLastNodeGuid("daee70a0-1b56-4d5e-bae4-47f9d0b01817");
    _unconsiledgrid.Enter_innerbox("");
    

    TestModellerLogger.SetLastNodeGuid("18fa7be0-bc13-46ae-af3a-34d2550b7a23");
    _unconsiledgrid.Click_Reconcile_btn1();
    

    }

    @Test  (groups= {"Verify Unreconcilled_trans","Verify Unreconcilled_trans - Unreconciled_Tran"})
    @TestModellerPath(guid = "2d30dcac-72a3-4f9f-9988-5f28955daec4")
    public void UnreconciledTranGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAsse39()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//    _nlogin.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("NDzqF5GLHN");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
//    _AgentSearch.AssertUrl();
//    

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
    

//    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
//    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Smith LLC");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
    _bankmenu.GoToUrl();
    
//
//    TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
//    _bankmenu.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
    _bankmenu.Click_Bankingmenu();
    

    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
    _bankmenu.Click_Newmenu();
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
//    _nBANKTRN.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
    _nBANKTRN.Select_BK_SELECT("Nidhilimited1");
    

    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
    _nBANKTRN.Enter_NDate("44237");
    

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
    

//    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
//    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

pages.unconcilledbutn _unconcilledbutn = new pages.unconcilledbutn(driver);
    TestModellerLogger.SetLastNodeGuid("dd35ab3f-9a3f-41c8-b46a-f878062d2bd4");
    _unconcilledbutn.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("23d80cba-07ce-43f2-a76a-1d33bb41b05a");
//    _unconcilledbutn.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("3707d400-fede-4a41-968e-5d3eb200b18e");
    _unconcilledbutn.Click_Unreconciled_Transactions_button1();
    

pages.UnreconciledSearch _UnreconciledSearch = new pages.UnreconciledSearch(driver);
    TestModellerLogger.SetLastNodeGuid("3846d5f2-85cb-4331-8ccf-bb60a8dfac36");
    _UnreconciledSearch.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("a9f96659-b0f0-46ef-89bc-1484dae69392");
//    _UnreconciledSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8a7edde5-a78b-402b-81df-9d97b660150b");
    _UnreconciledSearch.Select_BNK_Account("All");
    

    TestModellerLogger.SetLastNodeGuid("ac3ace08-4d39-4b7c-97f3-78d3616dcab3");
    _UnreconciledSearch.Select_Date_Range("This Month");
    

    TestModellerLogger.SetLastNodeGuid("a0e3ae95-061e-4cf4-b06d-2edc81e5debe");
    _UnreconciledSearch.Enter_DateFrom11("44237");
    

    TestModellerLogger.SetLastNodeGuid("325bf592-ccb5-4649-b30d-6826c5c0d452");
    _UnreconciledSearch.Enter_DateTo12("44237");
    

    TestModellerLogger.SetLastNodeGuid("d030e7a9-5261-4df2-b2d2-6cc07e70504d");
    _UnreconciledSearch.Click_Update_BTNN();
    

pages.unconsiledgrid _unconsiledgrid = new pages.unconsiledgrid(driver);
    TestModellerLogger.SetLastNodeGuid("3d411e3c-5c3f-4153-b926-4e346a8a622e");
    _unconsiledgrid.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("b9b2843c-608d-48cc-a40d-37a9536817a3");
//    _unconsiledgrid.AssertUrl();


    TestModellerLogger.SetLastNodeGuid("bda1776b-d5b9-4cb9-a48d-3bb511b93e58");
    _unconsiledgrid.Click_checkbox1();
    

    TestModellerLogger.SetLastNodeGuid("5e358f1f-8cf3-4256-81c2-c8eeceee3c19");
    _unconsiledgrid.Click_Select_an_option3();
    

    TestModellerLogger.SetLastNodeGuid("daee70a0-1b56-4d5e-bae4-47f9d0b01817");
    _unconsiledgrid.Enter_innerbox("");
    

    TestModellerLogger.SetLastNodeGuid("18fa7be0-bc13-46ae-af3a-34d2550b7a23");
    _unconsiledgrid.Click_Reconcile_btn1();
    

    }

    @Test  (groups= {"Verify Unreconcilled_trans","Verify Unreconcilled_trans - Unreconciled_Tran"})
    @TestModellerPath(guid = "ca771e7e-fdb4-4ca4-bc4d-e7289f2cadf5")
    public void UnreconciledTranGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAsse40()
  
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("bK8888VVso");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
//    _AgentSearch.AssertUrl();


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
    

//    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
//    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Pfeffer, Swift and Cartwright");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
    _bankmenu.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
//    _bankmenu.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
    _bankmenu.Click_Bankingmenu();
    

    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
    _bankmenu.Click_Newmenu();
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
//    _nBANKTRN.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
    _nBANKTRN.Select_BK_SELECT("Nidlimited");
    

    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
    _nBANKTRN.Enter_NDate("44237");
    

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
    

//    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
//    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

pages.unconcilledbutn _unconcilledbutn = new pages.unconcilledbutn(driver);
    TestModellerLogger.SetLastNodeGuid("dd35ab3f-9a3f-41c8-b46a-f878062d2bd4");
    _unconcilledbutn.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("23d80cba-07ce-43f2-a76a-1d33bb41b05a");
//    _unconcilledbutn.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("3707d400-fede-4a41-968e-5d3eb200b18e");
    _unconcilledbutn.Click_Unreconciled_Transactions_button1();
    

pages.UnreconciledSearch _UnreconciledSearch = new pages.UnreconciledSearch(driver);
    TestModellerLogger.SetLastNodeGuid("3846d5f2-85cb-4331-8ccf-bb60a8dfac36");
    _UnreconciledSearch.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("a9f96659-b0f0-46ef-89bc-1484dae69392");
//    _UnreconciledSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8a7edde5-a78b-402b-81df-9d97b660150b");
    _UnreconciledSearch.Select_BNK_Account("All");
    

    TestModellerLogger.SetLastNodeGuid("ac3ace08-4d39-4b7c-97f3-78d3616dcab3");
    _UnreconciledSearch.Select_Date_Range("This Month");
    

    TestModellerLogger.SetLastNodeGuid("a0e3ae95-061e-4cf4-b06d-2edc81e5debe");
    _UnreconciledSearch.Enter_DateFrom11("44237");
    

    TestModellerLogger.SetLastNodeGuid("325bf592-ccb5-4649-b30d-6826c5c0d452");
    _UnreconciledSearch.Enter_DateTo12("44237");
    

    TestModellerLogger.SetLastNodeGuid("d030e7a9-5261-4df2-b2d2-6cc07e70504d");
    _UnreconciledSearch.Click_Update_BTNN();
    

pages.unconsiledgrid _unconsiledgrid = new pages.unconsiledgrid(driver);
    TestModellerLogger.SetLastNodeGuid("3d411e3c-5c3f-4153-b926-4e346a8a622e");
    _unconsiledgrid.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("b9b2843c-608d-48cc-a40d-37a9536817a3");
//    _unconsiledgrid.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("bda1776b-d5b9-4cb9-a48d-3bb511b93e58");
    _unconsiledgrid.Click_checkbox1();
    

    TestModellerLogger.SetLastNodeGuid("5e358f1f-8cf3-4256-81c2-c8eeceee3c19");
    _unconsiledgrid.Click_Select_an_option3();
    

    TestModellerLogger.SetLastNodeGuid("daee70a0-1b56-4d5e-bae4-47f9d0b01817");
    _unconsiledgrid.Enter_innerbox("");
    

    TestModellerLogger.SetLastNodeGuid("18fa7be0-bc13-46ae-af3a-34d2550b7a23");
    _unconsiledgrid.Click_Reconcile_btn1();
    



}
    */