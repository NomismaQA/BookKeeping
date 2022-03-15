package Test_Balance_RE_Jour_Bank_Supp_3;

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
import ie.curiositysoftware.allocation.dto.ResultMergeMethod;
import ie.curiositysoftware.allocation.dto.DataAllocationRow;
import reports.ExtentTestListener;
import ie.curiositysoftware.allocation.dto.DataAllocationResult;
import ie.curiositysoftware.allocation.engine.DataAllocation;
import utilities.ExcelUtility;
import utilities.testmodeller.TestModellerLogger;

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/47c92856-78ee-4b1a-a893-c561a22d7ce2
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1183, profileId = 101073)
public class Clear_Data extends TestBase
{
	public String sTestCaseID=null;
	String[] data=null;
	String Sheet = null;
	
 @Test  (groups= {"SaleInToReconcile","SaleInToReconcile - Default Profile"})
    @TestModellerPath(guid = "8c7c840e-6086-4f3d-b9ff-7b3f3724775c")
    public void GoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClickAgentsP1_TC_01_LadgerCode_7016_7400_2091_Report() throws InterruptedException, IOException, InvalidFormatException, HeadlessException, AWTException
    {
    	sTestCaseID="TC_30";
       	Sheet="TrailBalanceReport_2";
        data = ExcelUtility.toReadExcelData(sTestCaseID, Sheet);
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
       TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
   

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN(data[1]);
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS(data[2]);
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.PartialReconciledCases.AgentSearch _AgentSearch = new pages.PartialReconciledCases.AgentSearch(driver);

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.PartialReconciledCases.Searchclient _Searchclient = new pages.PartialReconciledCases.Searchclient(driver);

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    
    
    
//
    pages.DeletejournalEntry1 _pagesDeletejournalEntry1 = new pages.DeletejournalEntry1(driver);
  
    

    TestModellerLogger.SetLastNodeGuid("658a1a6a-4df2-4aa5-9d3d-a5ac35030b4c");
    _pagesDeletejournalEntry1.Click_Accountant();
    

    TestModellerLogger.SetLastNodeGuid("c22ad20b-472b-436f-8a21-aaef00c48180");
    _pagesDeletejournalEntry1.Click_Journals();
    

   // TestModellerLogger.SetLastNodeGuid("5cf0a328-ae76-4d0a-ae9e-9cc8fba22bdc");
  //  _pagesDeletejournalEntry1.Select_ctl00ddlFinancialYear(sData[5]);
    

    TestModellerLogger.SetLastNodeGuid("f8f4724e-9e6f-4bbb-baf2-1ae01e6a4b64");
    _pagesDeletejournalEntry1.Click_xPath_idchAllRTI();
    
    TestModellerLogger.SetLastNodeGuid("d4e4d3ec-a2d4-4667-9023-6eb47e216d04");
    _pagesDeletejournalEntry1.Click_xPath_htmlbodyformmaindiv10div3headerdiva1i();
    
    pages.PartialReconciledCases.bankmenu _bankmenu = new pages.PartialReconciledCases.bankmenu(driver);

 

  TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
  _bankmenu.Click_Bankingmenu();
//  
    Trial_Balance.Delete_Bank_entry Bk=new Trial_Balance.Delete_Bank_entry(driver);
    Bk.delete_BankEntry();
    
    Bk.Supplier();





 
    }
 @Test  (groups= {"SaleInToReconcile","SaleInToReconcile - Default Profile"})
 @TestModellerPath(guid = "8c7c840e-6086-4f3d-b9ff-7b3f3724775c")
 public void GoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClickAgentsP2_TC_01_LadgerCode_7016_7400_2091_Report() throws InterruptedException, IOException, InvalidFormatException, HeadlessException, AWTException
 {
 	sTestCaseID="TC_40";
    	Sheet="TrailBalanceReport_2";
     data = ExcelUtility.toReadExcelData(sTestCaseID, Sheet);
     
     pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
 _nlogin.GoToUrl();


 TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
 _nlogin.Enter_nLOGIN(data[1]);
 

 TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
 _nlogin.Enter_nPASS(data[2]);
 

 TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
 _nlogin.Click_Login();
 

pages.PartialReconciledCases.AgentSearch _AgentSearch = new pages.PartialReconciledCases.AgentSearch(driver);

 TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
 _AgentSearch.Click_Agents();
 

 TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
 _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
 

 TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
 _AgentSearch.Click_Search();
 

 TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
 _AgentSearch.Click__Nidhi1_();
 

pages.PartialReconciledCases.Searchclient _Searchclient = new pages.PartialReconciledCases.Searchclient(driver);

 TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
 _Searchclient.Click__Clients_();
 

 TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
 _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
 

 TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
 _Searchclient.Click_Searchbtn();
 

 TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
 _Searchclient.Click__NidhiEnt();
 
 
 
//
 pages.DeletejournalEntry1 _pagesDeletejournalEntry1 = new pages.DeletejournalEntry1(driver);

 

 TestModellerLogger.SetLastNodeGuid("658a1a6a-4df2-4aa5-9d3d-a5ac35030b4c");
 _pagesDeletejournalEntry1.Click_Accountant();
 

 TestModellerLogger.SetLastNodeGuid("c22ad20b-472b-436f-8a21-aaef00c48180");
 _pagesDeletejournalEntry1.Click_Journals();
 

// TestModellerLogger.SetLastNodeGuid("5cf0a328-ae76-4d0a-ae9e-9cc8fba22bdc");
//  _pagesDeletejournalEntry1.Select_ctl00ddlFinancialYear(sData[5]);
 

 TestModellerLogger.SetLastNodeGuid("f8f4724e-9e6f-4bbb-baf2-1ae01e6a4b64");
 _pagesDeletejournalEntry1.Click_xPath_idchAllRTI();
 
 TestModellerLogger.SetLastNodeGuid("d4e4d3ec-a2d4-4667-9023-6eb47e216d04");
 _pagesDeletejournalEntry1.Click_xPath_htmlbodyformmaindiv10div3headerdiva1i();
 
 pages.PartialReconciledCases.bankmenu _bankmenu = new pages.PartialReconciledCases.bankmenu(driver);



TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
_bankmenu.Click_Bankingmenu();
//
 Trial_Balance.Delete_Bank_entry Bk=new Trial_Balance.Delete_Bank_entry(driver);
 Bk.delete_BankEntry();
 
 Bk.Supplier();






 }
// @Test  (groups= {"SaleInToReconcile","SaleInToReconcile - Default Profile"})
// @TestModellerPath(guid = "8c7c840e-6086-4f3d-b9ff-7b3f3724775c")
// public void GoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClickAgentsP3_TC_01_LadgerCode_7016_7400_2091_Report() throws InterruptedException, IOException, InvalidFormatException, HeadlessException, AWTException
// {
// 	sTestCaseID="TC_05";
//    	Sheet="TrailBalanceReport_2";
//     data = ExcelUtility.toReadExcelData(sTestCaseID, Sheet);
//     
//     pages.nlogin _nlogin = new pages.nlogin(driver);
//    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
// _nlogin.GoToUrl();
//
//
// TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
// _nlogin.Enter_nLOGIN(data[1]);
// 
//
// TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
// _nlogin.Enter_nPASS(data[2]);
// 
//
// TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
// _nlogin.Click_Login();
// 
//
//pages.PartialReconciledCases.AgentSearch _AgentSearch = new pages.PartialReconciledCases.AgentSearch(driver);
//
// TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
// _AgentSearch.Click_Agents();
// 
//
// TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
// _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
// 
//
// TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
// _AgentSearch.Click_Search();
// 
//
// TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
// _AgentSearch.Click__Nidhi1_();
// 
//
//pages.PartialReconciledCases.Searchclient _Searchclient = new pages.PartialReconciledCases.Searchclient(driver);
//
// TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
// _Searchclient.Click__Clients_();
// 
//
// TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
// _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
// 
//
// TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
// _Searchclient.Click_Searchbtn();
// 
//
// TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
// _Searchclient.Click__NidhiEnt();
// 
// 
// 
////
// pages.DeletejournalEntry1 _pagesDeletejournalEntry1 = new pages.DeletejournalEntry1(driver);
//
// 
//
// TestModellerLogger.SetLastNodeGuid("658a1a6a-4df2-4aa5-9d3d-a5ac35030b4c");
// _pagesDeletejournalEntry1.Click_Accountant();
// 
//
// TestModellerLogger.SetLastNodeGuid("c22ad20b-472b-436f-8a21-aaef00c48180");
// _pagesDeletejournalEntry1.Click_Journals();
// 
//
//// TestModellerLogger.SetLastNodeGuid("5cf0a328-ae76-4d0a-ae9e-9cc8fba22bdc");
////  _pagesDeletejournalEntry1.Select_ctl00ddlFinancialYear(sData[5]);
// 
//
// TestModellerLogger.SetLastNodeGuid("f8f4724e-9e6f-4bbb-baf2-1ae01e6a4b64");
// _pagesDeletejournalEntry1.Click_xPath_idchAllRTI();
// 
// TestModellerLogger.SetLastNodeGuid("d4e4d3ec-a2d4-4667-9023-6eb47e216d04");
// _pagesDeletejournalEntry1.Click_xPath_htmlbodyformmaindiv10div3headerdiva1i();
// 
// pages.PartialReconciledCases.bankmenu _bankmenu = new pages.PartialReconciledCases.bankmenu(driver);
//
//
//
//TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
//_bankmenu.Click_Bankingmenu();
////
// Trial_Balance.Delete_Bank_entry Bk=new Trial_Balance.Delete_Bank_entry(driver);
// Bk.delete_BankEntry();
// 
// Bk.Supplier();
//
//
//
//
//
//
// }
// 
// @Test  (groups= {"SaleInToReconcile","SaleInToReconcile - Default Profile"})
// @TestModellerPath(guid = "8c7c840e-6086-4f3d-b9ff-7b3f3724775c")
// public void GoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClickAgentsP4_TC_01_LadgerCode_7016_7400_2091_Report() throws InterruptedException, IOException, InvalidFormatException, HeadlessException, AWTException
// {
// 	sTestCaseID="TC_07";
//    	Sheet="TrailBalanceReport_2";
//     data = ExcelUtility.toReadExcelData(sTestCaseID, Sheet);
//     
//     pages.nlogin _nlogin = new pages.nlogin(driver);
//    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
// _nlogin.GoToUrl();
//
//
// TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
// _nlogin.Enter_nLOGIN(data[1]);
// 
//
// TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
// _nlogin.Enter_nPASS(data[2]);
// 
//
// TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
// _nlogin.Click_Login();
// 
//
//pages.PartialReconciledCases.AgentSearch _AgentSearch = new pages.PartialReconciledCases.AgentSearch(driver);
//
// TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
// _AgentSearch.Click_Agents();
// 
//
// TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
// _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
// 
//
// TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
// _AgentSearch.Click_Search();
// 
//
// TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
// _AgentSearch.Click__Nidhi1_();
// 
//
//pages.PartialReconciledCases.Searchclient _Searchclient = new pages.PartialReconciledCases.Searchclient(driver);
//
// TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
// _Searchclient.Click__Clients_();
// 
//
// TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
// _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
// 
//
// TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
// _Searchclient.Click_Searchbtn();
// 
//
// TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
// _Searchclient.Click__NidhiEnt();
// 
// 
// 
////
// pages.DeletejournalEntry1 _pagesDeletejournalEntry1 = new pages.DeletejournalEntry1(driver);
//
// 
//
// TestModellerLogger.SetLastNodeGuid("658a1a6a-4df2-4aa5-9d3d-a5ac35030b4c");
// _pagesDeletejournalEntry1.Click_Accountant();
// 
//
// TestModellerLogger.SetLastNodeGuid("c22ad20b-472b-436f-8a21-aaef00c48180");
// _pagesDeletejournalEntry1.Click_Journals();
// 
//
//// TestModellerLogger.SetLastNodeGuid("5cf0a328-ae76-4d0a-ae9e-9cc8fba22bdc");
////  _pagesDeletejournalEntry1.Select_ctl00ddlFinancialYear(sData[5]);
// 
//
// TestModellerLogger.SetLastNodeGuid("f8f4724e-9e6f-4bbb-baf2-1ae01e6a4b64");
// _pagesDeletejournalEntry1.Click_xPath_idchAllRTI();
// 
// TestModellerLogger.SetLastNodeGuid("d4e4d3ec-a2d4-4667-9023-6eb47e216d04");
// _pagesDeletejournalEntry1.Click_xPath_htmlbodyformmaindiv10div3headerdiva1i();
// 
// pages.PartialReconciledCases.bankmenu _bankmenu = new pages.PartialReconciledCases.bankmenu(driver);
//
//
//
//TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
//_bankmenu.Click_Bankingmenu();
////
// Trial_Balance.Delete_Bank_entry Bk=new Trial_Balance.Delete_Bank_entry(driver);
// Bk.delete_BankEntry();
// 
// Bk.Supplier();
//
//
//
//
//
//
// }
// @Test  (groups= {"SaleInToReconcile","SaleInToReconcile - Default Profile"})
// @TestModellerPath(guid = "8c7c840e-6086-4f3d-b9ff-7b3f3724775c")
// public void GoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClickAgentsP5_TC_01_LadgerCode_7016_7400_2091_Report() throws InterruptedException, IOException, InvalidFormatException, HeadlessException, AWTException
// {
// 	sTestCaseID="TC_09";
//    	Sheet="TrailBalanceReport_2";
//     data = ExcelUtility.toReadExcelData(sTestCaseID, Sheet);
//     
//     pages.nlogin _nlogin = new pages.nlogin(driver);
//    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
// _nlogin.GoToUrl();
//
//
// TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
// _nlogin.Enter_nLOGIN(data[1]);
// 
//
// TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
// _nlogin.Enter_nPASS(data[2]);
// 
//
// TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
// _nlogin.Click_Login();
// 
//
//pages.PartialReconciledCases.AgentSearch _AgentSearch = new pages.PartialReconciledCases.AgentSearch(driver);
//
// TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
// _AgentSearch.Click_Agents();
// 
//
// TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
// _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
// 
//
// TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
// _AgentSearch.Click_Search();
// 
//
// TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
// _AgentSearch.Click__Nidhi1_();
// 
//
//pages.PartialReconciledCases.Searchclient _Searchclient = new pages.PartialReconciledCases.Searchclient(driver);
//
// TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
// _Searchclient.Click__Clients_();
// 
//
// TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
// _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
// 
//
// TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
// _Searchclient.Click_Searchbtn();
// 
//
// TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
// _Searchclient.Click__NidhiEnt();
// 
// 
// 
////
// pages.DeletejournalEntry1 _pagesDeletejournalEntry1 = new pages.DeletejournalEntry1(driver);
//
// 
//
// TestModellerLogger.SetLastNodeGuid("658a1a6a-4df2-4aa5-9d3d-a5ac35030b4c");
// _pagesDeletejournalEntry1.Click_Accountant();
// 
//
// TestModellerLogger.SetLastNodeGuid("c22ad20b-472b-436f-8a21-aaef00c48180");
// _pagesDeletejournalEntry1.Click_Journals();
// 
//
//// TestModellerLogger.SetLastNodeGuid("5cf0a328-ae76-4d0a-ae9e-9cc8fba22bdc");
////  _pagesDeletejournalEntry1.Select_ctl00ddlFinancialYear(sData[5]);
// 
//
// TestModellerLogger.SetLastNodeGuid("f8f4724e-9e6f-4bbb-baf2-1ae01e6a4b64");
// _pagesDeletejournalEntry1.Click_xPath_idchAllRTI();
// 
// TestModellerLogger.SetLastNodeGuid("d4e4d3ec-a2d4-4667-9023-6eb47e216d04");
// _pagesDeletejournalEntry1.Click_xPath_htmlbodyformmaindiv10div3headerdiva1i();
// 
// pages.PartialReconciledCases.bankmenu _bankmenu = new pages.PartialReconciledCases.bankmenu(driver);
//
//
//
//TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
//_bankmenu.Click_Bankingmenu();
////
// Trial_Balance.Delete_Bank_entry Bk=new Trial_Balance.Delete_Bank_entry(driver);
// Bk.delete_BankEntry();
// 
// Bk.Supplier();
//
//
//
//
//
//
// }
// @Test  (groups= {"SaleInToReconcile","SaleInToReconcile - Default Profile"})
// @TestModellerPath(guid = "8c7c840e-6086-4f3d-b9ff-7b3f3724775c")
// public void GoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClickAgentsP6_TC_01_LadgerCode_7016_7400_2091_Report() throws InterruptedException, IOException, InvalidFormatException, HeadlessException, AWTException
// {
// 	sTestCaseID="TC_11";
//    	Sheet="TrailBalanceReport_2";
//     data = ExcelUtility.toReadExcelData(sTestCaseID, Sheet);
//     
//     pages.nlogin _nlogin = new pages.nlogin(driver);
//    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
// _nlogin.GoToUrl();
//
//
// TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
// _nlogin.Enter_nLOGIN(data[1]);
// 
//
// TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
// _nlogin.Enter_nPASS(data[2]);
// 
//
// TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
// _nlogin.Click_Login();
// 
//
//pages.PartialReconciledCases.AgentSearch _AgentSearch = new pages.PartialReconciledCases.AgentSearch(driver);
//
// TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
// _AgentSearch.Click_Agents();
// 
//
// TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
// _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
// 
//
// TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
// _AgentSearch.Click_Search();
// 
//
// TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
// _AgentSearch.Click__Nidhi1_();
// 
//
//pages.PartialReconciledCases.Searchclient _Searchclient = new pages.PartialReconciledCases.Searchclient(driver);
//
// TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
// _Searchclient.Click__Clients_();
// 
//
// TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
// _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
// 
//
// TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
// _Searchclient.Click_Searchbtn();
// 
//
// TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
// _Searchclient.Click__NidhiEnt();
// 
// 
// 
////
// pages.DeletejournalEntry1 _pagesDeletejournalEntry1 = new pages.DeletejournalEntry1(driver);
//
// 
//
// TestModellerLogger.SetLastNodeGuid("658a1a6a-4df2-4aa5-9d3d-a5ac35030b4c");
// _pagesDeletejournalEntry1.Click_Accountant();
// 
//
// TestModellerLogger.SetLastNodeGuid("c22ad20b-472b-436f-8a21-aaef00c48180");
// _pagesDeletejournalEntry1.Click_Journals();
// 
//
//// TestModellerLogger.SetLastNodeGuid("5cf0a328-ae76-4d0a-ae9e-9cc8fba22bdc");
////  _pagesDeletejournalEntry1.Select_ctl00ddlFinancialYear(sData[5]);
// 
//
// TestModellerLogger.SetLastNodeGuid("f8f4724e-9e6f-4bbb-baf2-1ae01e6a4b64");
// _pagesDeletejournalEntry1.Click_xPath_idchAllRTI();
// 
// TestModellerLogger.SetLastNodeGuid("d4e4d3ec-a2d4-4667-9023-6eb47e216d04");
// _pagesDeletejournalEntry1.Click_xPath_htmlbodyformmaindiv10div3headerdiva1i();
// 
// pages.PartialReconciledCases.bankmenu _bankmenu = new pages.PartialReconciledCases.bankmenu(driver);
//
//
//
//TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
//_bankmenu.Click_Bankingmenu();
////
// Trial_Balance.Delete_Bank_entry Bk=new Trial_Balance.Delete_Bank_entry(driver);
// Bk.delete_BankEntry();
// 
// Bk.Supplier();
//
//
//
//
//
//
// }
// @Test  (groups= {"SaleInToReconcile","SaleInToReconcile - Default Profile"})
// @TestModellerPath(guid = "8c7c840e-6086-4f3d-b9ff-7b3f3724775c")
// public void GoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClickAgentsP7_TC_01_LadgerCode_7016_7400_2091_Report() throws InterruptedException, IOException, InvalidFormatException, HeadlessException, AWTException
// {
// 	sTestCaseID="TC_13";
//    	Sheet="TrailBalanceReport_2";
//     data = ExcelUtility.toReadExcelData(sTestCaseID, Sheet);
//     
//     pages.nlogin _nlogin = new pages.nlogin(driver);
//    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
// _nlogin.GoToUrl();
//
//
// TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
// _nlogin.Enter_nLOGIN(data[1]);
// 
//
// TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
// _nlogin.Enter_nPASS(data[2]);
// 
//
// TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
// _nlogin.Click_Login();
// 
//
//pages.PartialReconciledCases.AgentSearch _AgentSearch = new pages.PartialReconciledCases.AgentSearch(driver);
//
// TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
// _AgentSearch.Click_Agents();
// 
//
// TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
// _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
// 
//
// TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
// _AgentSearch.Click_Search();
// 
//
// TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
// _AgentSearch.Click__Nidhi1_();
// 
//
//pages.PartialReconciledCases.Searchclient _Searchclient = new pages.PartialReconciledCases.Searchclient(driver);
//
// TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
// _Searchclient.Click__Clients_();
// 
//
// TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
// _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
// 
//
// TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
// _Searchclient.Click_Searchbtn();
// 
//
// TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
// _Searchclient.Click__NidhiEnt();
// 
// 
// 
////
// pages.DeletejournalEntry1 _pagesDeletejournalEntry1 = new pages.DeletejournalEntry1(driver);
//
// 
//
// TestModellerLogger.SetLastNodeGuid("658a1a6a-4df2-4aa5-9d3d-a5ac35030b4c");
// _pagesDeletejournalEntry1.Click_Accountant();
// 
//
// TestModellerLogger.SetLastNodeGuid("c22ad20b-472b-436f-8a21-aaef00c48180");
// _pagesDeletejournalEntry1.Click_Journals();
// 
//
//// TestModellerLogger.SetLastNodeGuid("5cf0a328-ae76-4d0a-ae9e-9cc8fba22bdc");
////  _pagesDeletejournalEntry1.Select_ctl00ddlFinancialYear(sData[5]);
// 
//
// TestModellerLogger.SetLastNodeGuid("f8f4724e-9e6f-4bbb-baf2-1ae01e6a4b64");
// _pagesDeletejournalEntry1.Click_xPath_idchAllRTI();
// 
// TestModellerLogger.SetLastNodeGuid("d4e4d3ec-a2d4-4667-9023-6eb47e216d04");
// _pagesDeletejournalEntry1.Click_xPath_htmlbodyformmaindiv10div3headerdiva1i();
// 
// pages.PartialReconciledCases.bankmenu _bankmenu = new pages.PartialReconciledCases.bankmenu(driver);
//
//
//
//TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
//_bankmenu.Click_Bankingmenu();
////
// Trial_Balance.Delete_Bank_entry Bk=new Trial_Balance.Delete_Bank_entry(driver);
// Bk.delete_BankEntry();
// 
// Bk.Supplier();
//
//
//
//
//
//
// }
// @Test  (groups= {"SaleInToReconcile","SaleInToReconcile - Default Profile"})
// @TestModellerPath(guid = "8c7c840e-6086-4f3d-b9ff-7b3f3724775c")
// public void GoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClickAgentsP8_TC_01_LadgerCode_7016_7400_2091_Report() throws InterruptedException, IOException, InvalidFormatException, HeadlessException, AWTException
// {
// 	sTestCaseID="TC_15";
//    	Sheet="TrailBalanceReport_2";
//     data = ExcelUtility.toReadExcelData(sTestCaseID, Sheet);
//     
//     pages.nlogin _nlogin = new pages.nlogin(driver);
//    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
// _nlogin.GoToUrl();
//
//
// TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
// _nlogin.Enter_nLOGIN(data[1]);
// 
//
// TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
// _nlogin.Enter_nPASS(data[2]);
// 
//
// TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
// _nlogin.Click_Login();
// 
//
//pages.PartialReconciledCases.AgentSearch _AgentSearch = new pages.PartialReconciledCases.AgentSearch(driver);
//
// TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
// _AgentSearch.Click_Agents();
// 
//
// TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
// _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
// 
//
// TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
// _AgentSearch.Click_Search();
// 
//
// TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
// _AgentSearch.Click__Nidhi1_();
// 
//
//pages.PartialReconciledCases.Searchclient _Searchclient = new pages.PartialReconciledCases.Searchclient(driver);
//
// TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
// _Searchclient.Click__Clients_();
// 
//
// TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
// _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
// 
//
// TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
// _Searchclient.Click_Searchbtn();
// 
//
// TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
// _Searchclient.Click__NidhiEnt();
// 
// 
// 
////
// pages.DeletejournalEntry1 _pagesDeletejournalEntry1 = new pages.DeletejournalEntry1(driver);
//
// 
//
// TestModellerLogger.SetLastNodeGuid("658a1a6a-4df2-4aa5-9d3d-a5ac35030b4c");
// _pagesDeletejournalEntry1.Click_Accountant();
// 
//
// TestModellerLogger.SetLastNodeGuid("c22ad20b-472b-436f-8a21-aaef00c48180");
// _pagesDeletejournalEntry1.Click_Journals();
// 
//
//// TestModellerLogger.SetLastNodeGuid("5cf0a328-ae76-4d0a-ae9e-9cc8fba22bdc");
////  _pagesDeletejournalEntry1.Select_ctl00ddlFinancialYear(sData[5]);
// 
//
// TestModellerLogger.SetLastNodeGuid("f8f4724e-9e6f-4bbb-baf2-1ae01e6a4b64");
// _pagesDeletejournalEntry1.Click_xPath_idchAllRTI();
// 
// TestModellerLogger.SetLastNodeGuid("d4e4d3ec-a2d4-4667-9023-6eb47e216d04");
// _pagesDeletejournalEntry1.Click_xPath_htmlbodyformmaindiv10div3headerdiva1i();
// 
// pages.PartialReconciledCases.bankmenu _bankmenu = new pages.PartialReconciledCases.bankmenu(driver);
//
//
//
//TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
//_bankmenu.Click_Bankingmenu();
////
// Trial_Balance.Delete_Bank_entry Bk=new Trial_Balance.Delete_Bank_entry(driver);
// Bk.delete_BankEntry();
// 
// Bk.Supplier();
//
//
//
//
//
//
// }
// @Test  (groups= {"SaleInToReconcile","SaleInToReconcile - Default Profile"})
// @TestModellerPath(guid = "8c7c840e-6086-4f3d-b9ff-7b3f3724775c")
// public void GoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClickAgentsP9_TC_01_LadgerCode_7016_7400_2091_Report() throws InterruptedException, IOException, InvalidFormatException, HeadlessException, AWTException
// {
// 	sTestCaseID="TC_17";
//    	Sheet="TrailBalanceReport_2";
//     data = ExcelUtility.toReadExcelData(sTestCaseID, Sheet);
//     
//     pages.nlogin _nlogin = new pages.nlogin(driver);
//    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
// _nlogin.GoToUrl();
//
//
// TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
// _nlogin.Enter_nLOGIN(data[1]);
// 
//
// TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
// _nlogin.Enter_nPASS(data[2]);
// 
//
// TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
// _nlogin.Click_Login();
// 
//
//pages.PartialReconciledCases.AgentSearch _AgentSearch = new pages.PartialReconciledCases.AgentSearch(driver);
//
// TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
// _AgentSearch.Click_Agents();
// 
//
// TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
// _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
// 
//
// TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
// _AgentSearch.Click_Search();
// 
//
// TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
// _AgentSearch.Click__Nidhi1_();
// 
//
//pages.PartialReconciledCases.Searchclient _Searchclient = new pages.PartialReconciledCases.Searchclient(driver);
//
// TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
// _Searchclient.Click__Clients_();
// 
//
// TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
// _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
// 
//
// TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
// _Searchclient.Click_Searchbtn();
// 
//
// TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
// _Searchclient.Click__NidhiEnt();
// 
// 
// 
////
// pages.DeletejournalEntry1 _pagesDeletejournalEntry1 = new pages.DeletejournalEntry1(driver);
//
// 
//
// TestModellerLogger.SetLastNodeGuid("658a1a6a-4df2-4aa5-9d3d-a5ac35030b4c");
// _pagesDeletejournalEntry1.Click_Accountant();
// 
//
// TestModellerLogger.SetLastNodeGuid("c22ad20b-472b-436f-8a21-aaef00c48180");
// _pagesDeletejournalEntry1.Click_Journals();
// 
//
//// TestModellerLogger.SetLastNodeGuid("5cf0a328-ae76-4d0a-ae9e-9cc8fba22bdc");
////  _pagesDeletejournalEntry1.Select_ctl00ddlFinancialYear(sData[5]);
// 
//
// TestModellerLogger.SetLastNodeGuid("f8f4724e-9e6f-4bbb-baf2-1ae01e6a4b64");
// _pagesDeletejournalEntry1.Click_xPath_idchAllRTI();
// 
// TestModellerLogger.SetLastNodeGuid("d4e4d3ec-a2d4-4667-9023-6eb47e216d04");
// _pagesDeletejournalEntry1.Click_xPath_htmlbodyformmaindiv10div3headerdiva1i();
// 
// pages.PartialReconciledCases.bankmenu _bankmenu = new pages.PartialReconciledCases.bankmenu(driver);
//
//
//
//TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
//_bankmenu.Click_Bankingmenu();
////
// Trial_Balance.Delete_Bank_entry Bk=new Trial_Balance.Delete_Bank_entry(driver);
// Bk.delete_BankEntry();
// 
// Bk.Supplier();
//
//
//
//
//
//
// }
// @Test  (groups= {"SaleInToReconcile","SaleInToReconcile - Default Profile"})
// @TestModellerPath(guid = "8c7c840e-6086-4f3d-b9ff-7b3f3724775c")
// public void GoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClickAgentsP10_TC_01_LadgerCode_7016_7400_2091_Report() throws InterruptedException, IOException, InvalidFormatException, HeadlessException, AWTException
// {
// 	sTestCaseID="TC_19";
//    	Sheet="TrailBalanceReport_2";
//     data = ExcelUtility.toReadExcelData(sTestCaseID, Sheet);
//     
//     pages.nlogin _nlogin = new pages.nlogin(driver);
//    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
// _nlogin.GoToUrl();
//
//
// TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
// _nlogin.Enter_nLOGIN(data[1]);
// 
//
// TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
// _nlogin.Enter_nPASS(data[2]);
// 
//
// TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
// _nlogin.Click_Login();
// 
//
//pages.PartialReconciledCases.AgentSearch _AgentSearch = new pages.PartialReconciledCases.AgentSearch(driver);
//
// TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
// _AgentSearch.Click_Agents();
// 
//
// TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
// _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
// 
//
// TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
// _AgentSearch.Click_Search();
// 
//
// TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
// _AgentSearch.Click__Nidhi1_();
// 
//
//pages.PartialReconciledCases.Searchclient _Searchclient = new pages.PartialReconciledCases.Searchclient(driver);
//
// TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
// _Searchclient.Click__Clients_();
// 
//
// TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
// _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
// 
//
// TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
// _Searchclient.Click_Searchbtn();
// 
//
// TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
// _Searchclient.Click__NidhiEnt();
// 
// 
// 
////
// pages.DeletejournalEntry1 _pagesDeletejournalEntry1 = new pages.DeletejournalEntry1(driver);
//
// 
//
// TestModellerLogger.SetLastNodeGuid("658a1a6a-4df2-4aa5-9d3d-a5ac35030b4c");
// _pagesDeletejournalEntry1.Click_Accountant();
// 
//
// TestModellerLogger.SetLastNodeGuid("c22ad20b-472b-436f-8a21-aaef00c48180");
// _pagesDeletejournalEntry1.Click_Journals();
// 
//
//// TestModellerLogger.SetLastNodeGuid("5cf0a328-ae76-4d0a-ae9e-9cc8fba22bdc");
////  _pagesDeletejournalEntry1.Select_ctl00ddlFinancialYear(sData[5]);
// 
//
// TestModellerLogger.SetLastNodeGuid("f8f4724e-9e6f-4bbb-baf2-1ae01e6a4b64");
// _pagesDeletejournalEntry1.Click_xPath_idchAllRTI();
// 
// TestModellerLogger.SetLastNodeGuid("d4e4d3ec-a2d4-4667-9023-6eb47e216d04");
// _pagesDeletejournalEntry1.Click_xPath_htmlbodyformmaindiv10div3headerdiva1i();
// 
// pages.PartialReconciledCases.bankmenu _bankmenu = new pages.PartialReconciledCases.bankmenu(driver);
//
//
//
//TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
//_bankmenu.Click_Bankingmenu();
////
// Trial_Balance.Delete_Bank_entry Bk=new Trial_Balance.Delete_Bank_entry(driver);
// Bk.delete_BankEntry();
// 
// Bk.Supplier();
//
//
//
//
//
//
// }
}