package test.ashiv;

import reports.TestNGListener;
import tests.TestBase;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;

//import pages.BankRule.BankRuleCreate_Standard;
import pages.banking.ashiv.BankRuleUNR_Runrl;

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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/f05343ee-f6c2-439d-8b9f-8285da5a75ae
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1779, profileId = 102234)
public class Rule2_rule2 extends TestBase
{
	String sTestCaseID=null;
	String[] data=null;
	String Sheet =null;






	
	  @Test (groups= {"Rule1","Rule1 - rule1"})
	  
	  @TestModellerPath(guid = "d4b18723-b1dd-48ba-a67c-35968eb4301f") 
	  
	  public void  GoToUrlClickMenuBankRulesPositiveSelectConditionFormulaEnterRuleDescClickAccountSelectcodePositiveSelectGetdataOpenBankTrnsfillZRCrBankTrns () throws Exception {
	  sTestCaseID="TC4.1"; 
	  Sheet="BankingBank"; 
	  data =ExcelData.toReadExcelData(sTestCaseID, Sheet);
	  
	
	  pages.banking.ashiv.nlogin _nlogin = new pages.banking.ashiv.nlogin(driver);
	  
	  
	  TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
	  _nlogin.GoToUrl();
	  
	  TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
	  // _nlogin.AssertUrl();
	  
	  
	  TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
	  _nlogin.Enter_nLOGIN(data[1]);
	  
	  
	  TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
	  _nlogin.Enter_nPASS(data[2]);
	  
	  
	  TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
	  _nlogin.Click_Login();
	  
	  
	  pages.banking.ashiv.AgentSearch _AgentSearch = new pages.banking.ashiv.AgentSearch(driver);
	 
	  
	  TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
	  _AgentSearch.Click_Agents();
	  
	  TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
	  _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
	  
	  
	  TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
	  _AgentSearch.Click_Search(); 
	  
	  TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
	  _AgentSearch.Click__Nidhi1_(); 
	  
	 pages.banking.ashiv.Searchclient _Searchclient = new pages.banking.ashiv.Searchclient(driver); 
	 
	  TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
	  _Searchclient.Click__Clients_(); 

	  TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
	  _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);


	  TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
	  _Searchclient.Click_Searchbtn(); 
	  
	  TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
	  _Searchclient.Click__NidhiEnt(); 
	  
	   pages.banking.ashiv.bankmenu _bankmenu  = new pages.banking.ashiv.bankmenu(driver); 
	   
	   _bankmenu.Click_Bankingmenu(); 
	
	  pages.banking.ashiv.bankview _bankview = new pages.banking.ashiv.bankview(driver);
	  
	    _bankview.Click_Bank_Menu_View(); 
	    
	  _bankview.Click_Bank__Rules_dropdown(); 
	  
	  pages.banking.ashiv.BankRuleCr_ZroRate_Credit _rulecreate2=new  pages.banking.ashiv.BankRuleCr_ZroRate_Credit(driver);
	 
	   _rulecreate2.ASEnterRuleData();
	   _rulecreate2.GetTData(); 
	  
	  pages.BankNewTransaction _ReconcilationTransaction = new  pages.BankNewTransaction(driver); 

	  TestModellerLogger.SetLastNodeGuid("00b70107-cc4a-4697-a71f-dbb0d1c0ef03");
	  _ReconcilationTransaction.Click_BankingTAB(); 
	  
	  TestModellerLogger.SetLastNodeGuid("94a4fa93-d2d5-4ff6-837c-ef202411eca4");
	  _ReconcilationTransaction.Click_NewTAB(); 
	  
	  TestModellerLogger.SetLastNodeGuid("d0e7d4a2-32cb-48b0-b4da-56a9fea2e49b");
	  _ReconcilationTransaction.Click_NewTransaction();
	  
	  
	  pages.banking.ashiv.Fill_Bank_tran _ob=new pages.banking.ashiv.Fill_Bank_tran(driver);
	
	  _ob.Fill_Recnl_Bank_ZR_CR();
	  
	  pages.banking.ashiv.bankmenu _bankmenu1 = new  pages.banking.ashiv.bankmenu(driver);
	 _bankmenu1.Click_Bankingmenu();
	  
	  pages.banking.ashiv.Pages_Ashiv_Unrec1 _Unrec1 = new pages.banking.ashiv.Pages_Ashiv_Unrec1(driver);
	 
	  
	  TestModellerLogger.SetLastNodeGuid("c5396966-5d41-4fa9-aeb2-41a0420025e9");
	  _Unrec1.Click_Un_reco_Trans(); 
	  _Unrec1.Click_Tab_RunRules1_btn();
		utilities.Screenshotcapture.Getscreenshot("Success!51 transaction(s) allocated successfully ZrCR", "BankRunRule");
	  Thread.sleep(4000);
	  
	  
	  
	  
	  // pages.banking.ashiv.fnyr _fnyr=new pages.banking.ashiv.fnyr(driver); //
	 // _fnyr.Select_Financial_yr_dropdown("Jan 2021 - Dec 2021");
	  
	  
	  //
	 // TestModellerLogger.SetLastNodeGuid("5ba0e2d6-0b34-4a31-a53c-138e9f98ad0e");
	  // _Unrec1.Select_sel_bnk_dropdown("AA@Ashiv");
	  
	  
	  } 
//	  
	  @Test (groups= {"Rule1","Rule1 - rule1"})
	  
	  @TestModellerPath(guid = "4484047e-1435-40bf-84e4-93295b93c6c4") public void
	  GoToUrlClickMenuBankRulesPositiveSelectConditionFormulaEnterRuleDescClickAccountPositiveSelectGetdataOpenBankTrnsfillOutsCRBankTrns () throws Exception {
	  sTestCaseID="TC6.1"; 
	  Sheet="BankingBank"; 
	  data=ExcelData.toReadExcelData(sTestCaseID, Sheet);
	  
	  
	  pages.banking.ashiv.nlogin _nlogin = new pages.banking.ashiv.nlogin(driver);
	  TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
	  _nlogin.GoToUrl();
	  
	  TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
	  // _nlogin.AssertUrl();
	  
	  
	  TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
	  _nlogin.Enter_nLOGIN(data[1]);
	  
	  
	  TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
	  _nlogin.Enter_nPASS(data[2]);
	  
	  
	  TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
	  _nlogin.Click_Login();
	  
	  
	  pages.banking.ashiv.AgentSearch _AgentSearch = new pages.banking.ashiv.AgentSearch(driver);
	  
	  
	  TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
	  _AgentSearch.Click_Agents();
	  
	  TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
	  _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
	  
	  
	  TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
	  _AgentSearch.Click_Search(); 

	  TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
	  _AgentSearch.Click__Nidhi1_();
	  
	  pages.banking.ashiv.Searchclient  _Searchclient = new pages.banking.ashiv.Searchclient(driver); 
	 
	  TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
	  _Searchclient.Click__Clients_();
	  
	  TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
	  _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
	 
	  TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
	  _Searchclient.Click_Searchbtn(); 
	  
	  TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
	  _Searchclient.Click__NidhiEnt(); 
	  
	   pages.banking.ashiv.bankmenu _bankmenu= new pages.banking.ashiv.bankmenu(driver);
	   
	   _bankmenu.Click_Bankingmenu(); 
	   
	  pages.banking.ashiv.bankview _bankview = new  pages.banking.ashiv.bankview(driver); 
	
	   _bankview.Click_Bank_Menu_View(); 
	   
	  _bankview.Click_Bank__Rules_dropdown(); 
	  
	  pages.banking.ashiv.BankRuleCr_Outofscope_Crdit _rulecreate2=new  pages.banking.ashiv.BankRuleCr_Outofscope_Crdit(driver);
	
	  
	 _rulecreate2.ASEnterRuleData();
	  _rulecreate2.GetTData();
	  
	  
	  pages.BankNewTransaction _ReconcilationTransaction = new pages.BankNewTransaction(driver);
	  //
	  TestModellerLogger.SetLastNodeGuid("00b70107-cc4a-4697-a71f-dbb0d1c0ef03");
	  _ReconcilationTransaction.Click_BankingTAB(); 

	  TestModellerLogger.SetLastNodeGuid("94a4fa93-d2d5-4ff6-837c-ef202411eca4");
	  _ReconcilationTransaction.Click_NewTAB(); 

	  TestModellerLogger.SetLastNodeGuid("d0e7d4a2-32cb-48b0-b4da-56a9fea2e49b");
	  _ReconcilationTransaction.Click_NewTransaction();
	  
	  
	  pages.banking.ashiv.Fill_Bank_tran _ob=new pages.banking.ashiv.Fill_Bank_tran(driver);
	 
	  _ob.Fill_Recnl_Bank_OutS_CR();
	  
	  pages.banking.ashiv.bankmenu _bankmenu1 = new pages.banking.ashiv.bankmenu(driver);
	  
	  _bankmenu1.Click_Bankingmenu();
	  
	  pages.banking.ashiv.Pages_Ashiv_Unrec1 _Unrec1 = new pages.banking.ashiv.Pages_Ashiv_Unrec1(driver);
	  
	  _Unrec1.Click_Un_reco_Trans();
	  _Unrec1.Click_Tab_RunRules1_btn();
	  utilities.Screenshotcapture.Getscreenshot("Success!51 transaction(s) allocated successfully OutsCR", "BankRunRule");
	  Thread.sleep(4000);
	  
	  
	  
	  // pages.banking.ashiv.fnyr _fnyr=new pages.banking.ashiv.fnyr(driver); //
	 // _fnyr.Select_Financial_yr_dropdown("Jan 2021 - Dec 2021");
	  
	  
	  //
	//  TestModellerLogger.SetLastNodeGuid("5ba0e2d6-0b34-4a31-a53c-138e9f98ad0e");
	  // _Unrec1.Select_sel_bnk_dropdown("AA@Ashiv");
	  
	  }
	  
	  
	  @Test (groups= {"Rule1","Rule1 - rule1"})
	  
	  @TestModellerPath(guid = "fed4dbec-783a-45fa-8a62-35a8dff836c0") public void
	  GoToUrlClickMenuBankRulesPositiveSelectConditionFormulaEnterRuleDescClickAccountSelectcodePositiveSelectGetdataOpenBankTrnsfillRRDRBankTrns() throws Exception {
	  
	  sTestCaseID="TC2.2";
	  Sheet="BankingBank"; 
	  data =ExcelData.toReadExcelData(sTestCaseID, Sheet);
	 
	  
	  pages.banking.ashiv.nlogin _nlogin = new pages.banking.ashiv.nlogin(driver);
	  
	  TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
	  _nlogin.GoToUrl();
	  
	  TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
	  // _nlogin.AssertUrl();
	  
	  
	  TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
	  _nlogin.Enter_nLOGIN(data[1]);
	  
	  
	  TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
	  _nlogin.Enter_nPASS(data[2]);
	  
	  
	  TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
	  _nlogin.Click_Login();
	  
	  
	  pages.banking.ashiv.AgentSearch _AgentSearch = new pages.banking.ashiv.AgentSearch(driver);
	 
	  
	  TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
	  _AgentSearch.Click_Agents();
	  
	  TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
	  _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
	  
	  
	  TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
	  _AgentSearch.Click_Search();
	  
	  TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
	  _AgentSearch.Click__Nidhi1_();
	  
	 pages.banking.ashiv.Searchclient _Searchclient = new pages.banking.ashiv.Searchclient(driver);
	  
	  TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
	  _Searchclient.Click__Clients_(); 
	  
	  TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
	  _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
	 
	  TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
	  _Searchclient.Click_Searchbtn(); 
	  
	  TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
	  _Searchclient.Click__NidhiEnt(); 
	  
	 pages.banking.ashiv.bankmenu _bankmenu = new pages.banking.ashiv.bankmenu(driver);
	 
	  _bankmenu.Click_Bankingmenu(); 
	  
	  pages.banking.ashiv.bankview _bankview = new pages.banking.ashiv.bankview(driver);
	  
	   _bankview.Click_Bank_Menu_View(); 
	   
	  _bankview.Click_Bank__Rules_dropdown(); 
	  
	  pages.banking.ashiv.BankRuleCr_Reducedrte_Debit _rulecreate2=new pages.banking.ashiv.BankRuleCr_Reducedrte_Debit(driver);
	 
	  
	  _rulecreate2.ASEnterRuleData();
	  _rulecreate2.GetTData(); 
	  
	  pages.BankNewTransaction _ReconcilationTransaction = new pages.BankNewTransaction(driver);
	  
	  TestModellerLogger.SetLastNodeGuid("00b70107-cc4a-4697-a71f-dbb0d1c0ef03");
	  _ReconcilationTransaction.Click_BankingTAB(); 
	  
	  TestModellerLogger.SetLastNodeGuid("94a4fa93-d2d5-4ff6-837c-ef202411eca4");
	  _ReconcilationTransaction.Click_NewTAB(); 
	  
	  TestModellerLogger.SetLastNodeGuid("d0e7d4a2-32cb-48b0-b4da-56a9fea2e49b");
	  _ReconcilationTransaction.Click_NewTransaction();
	  
	  
	  pages.banking.ashiv.Fill_Bank_tran _ob=new pages.banking.ashiv.Fill_Bank_tran(driver);
	  
	  _ob.Fill_Recnl_Bank_RR_Dr();
	  
	  pages.banking.ashiv.bankmenu _bankmenu1 = new  pages.banking.ashiv.bankmenu(driver); 
	
	  _bankmenu1.Click_Bankingmenu();
	  
	  pages.banking.ashiv.Pages_Ashiv_Unrec1 _Unrec1 = new pages.banking.ashiv.Pages_Ashiv_Unrec1(driver);
	  
	  
	  
	  
	  TestModellerLogger.SetLastNodeGuid("c5396966-5d41-4fa9-aeb2-41a0420025e9");
	  _Unrec1.Click_Un_reco_Trans();
	  _Unrec1.Click_Tab_RunRules1_btn();
	  utilities.Screenshotcapture.Getscreenshot("Success!51 transaction(s) allocated successfully RRDR", "BankRunRule");
	  
	  // pages.banking.ashiv.fnyr _fnyr=new pages.banking.ashiv.fnyr(driver); //
	  //_fnyr.Select_Financial_yr_dropdown("Jan 2021 - Dec 2021");
	  
	  
	  //
	 // TestModellerLogger.SetLastNodeGuid("5ba0e2d6-0b34-4a31-a53c-138e9f98ad0e");
	  // _Unrec1.Select_sel_bnk_dropdown("AA@Ashiv");
	  
	  }
	  
	  
	  @Test (groups= {"Rule1","Rule1 - rule1"})
	  
	  @TestModellerPath(guid = "240d72a4-3691-48ed-876b-b7104e2d7fff") public void
	  GoToUrlClickMenuBankRulesPositiveSelectConditionFormulaEnterRuleDescClickAccountSelectcodePositiveSelectGetdataOpenBankTrnsfillZRDRBankTrns
	  () throws Exception {
	  sTestCaseID="TC4.2"; 
	  Sheet="BankingBank";
	  data =ExcelData.toReadExcelData(sTestCaseID, Sheet);
	  
	 
	  pages.banking.ashiv.nlogin _nlogin = new pages.banking.ashiv.nlogin(driver);
	  
	  TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
	  _nlogin.GoToUrl();
	  
	  TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
	  // _nlogin.AssertUrl();
	  
	  
	  TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
	  _nlogin.Enter_nLOGIN(data[1]);
	  
	  
	  TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
	  _nlogin.Enter_nPASS(data[2]);
	  
	  
	  TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
	  _nlogin.Click_Login();
	  
	  
	  pages.banking.ashiv.AgentSearch _AgentSearch = new  pages.banking.ashiv.AgentSearch(driver);
	
	  
	  TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
	  _AgentSearch.Click_Agents();
	  
	  TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
	  _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
	  
	  
	  TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
	  _AgentSearch.Click_Search(); 
	  
	  TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
	  _AgentSearch.Click__Nidhi1_(); 
	  
	  pages.banking.ashiv.Searchclient _Searchclient = new pages.banking.ashiv.Searchclient(driver);
	   
	  TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
	  _Searchclient.Click__Clients_();
	  
	  TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
	  _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
	
	  TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
	  _Searchclient.Click_Searchbtn();
	  
	  TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
	  _Searchclient.Click__NidhiEnt(); 
	  
	 pages.banking.ashiv.bankmenu _bankmenu = new pages.banking.ashiv.bankmenu(driver);
	 
	 _bankmenu.Click_Bankingmenu(); 
	 
	  pages.banking.ashiv.bankview _bankview = new pages.banking.ashiv.bankview(driver); 
	
	 _bankview.Click_Bank_Menu_View(); 
	 
	  _bankview.Click_Bank__Rules_dropdown();
	  
	  pages.banking.ashiv.BankRuleCr_ZroRate_Debit _rulecreate2=new  pages.banking.ashiv.BankRuleCr_ZroRate_Debit(driver);
	
	  
	  _rulecreate2.ASEnterRuleData();
	  _rulecreate2.GetTData(); 
	  
	  pages.BankNewTransaction _ReconcilationTransaction = new pages.BankNewTransaction(driver); 
	 
	  
	  TestModellerLogger.SetLastNodeGuid("00b70107-cc4a-4697-a71f-dbb0d1c0ef03");
	  _ReconcilationTransaction.Click_BankingTAB(); 
	  
	  TestModellerLogger.SetLastNodeGuid("94a4fa93-d2d5-4ff6-837c-ef202411eca4");
	  _ReconcilationTransaction.Click_NewTAB(); 
	  
	  TestModellerLogger.SetLastNodeGuid("d0e7d4a2-32cb-48b0-b4da-56a9fea2e49b");
	  _ReconcilationTransaction.Click_NewTransaction();
	  
	  
	  pages.banking.ashiv.Fill_Bank_tran _ob=new pages.banking.ashiv.Fill_Bank_tran(driver);
	 
	  _ob.Fill_Recnl_Bank_ZR_Dr();
	  
	  pages.banking.ashiv.bankmenu _bankmenu1 = new  pages.banking.ashiv.bankmenu(driver);
	
	  _bankmenu1.Click_Bankingmenu();
	  
	  pages.banking.ashiv.Pages_Ashiv_Unrec1 _Unrec1 = new pages.banking.ashiv.Pages_Ashiv_Unrec1(driver);
	  
	  
	  
	  
	  TestModellerLogger.SetLastNodeGuid("c5396966-5d41-4fa9-aeb2-41a0420025e9");
	  _Unrec1.Click_Un_reco_Trans(); 
	  _Unrec1.Click_Tab_RunRules1_btn();
	  utilities.Screenshotcapture.Getscreenshot("Success!51 transaction(s) allocated successfully ZRDR", "BankRunRule");
	  
	  // pages.banking.ashiv.fnyr _fnyr=new pages.banking.ashiv.fnyr(driver); //
	//  _fnyr.Select_Financial_yr_dropdown("Jan 2021 - Dec 2021");
	  
	  
	  //
	 // TestModellerLogger.SetLastNodeGuid("5ba0e2d6-0b34-4a31-a53c-138e9f98ad0e");
	  // _Unrec1.Select_sel_bnk_dropdown("AA@Ashiv"); } //
	  }
//	  @Test (groups= {"Rule1","Rule1 - rule1"})
//	  
//	  @TestModellerPath(guid = "4520f772-f383-4c13-847a-fa828635477f") 
//	  public void  GoToUrlClickMenuBankRulesPositiveSelectConditionFormulaEnterRuleDescClickAccountSelectcodePositiveSelectGetdataOpenBankTrnsfillZRBothBankTrns() throws Exception 
//	 {
//	  sTestCaseID="TC4.1"; 
//	  Sheet="BankingBank"; 
//	  data=ExcelData.toReadExcelData(sTestCaseID, Sheet);
//	  
//	  
//	  pages.banking.ashiv.nlogin _nlogin = new pages.banking.ashiv.nlogin(driver);
//	  TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
//	  _nlogin.GoToUrl();
//	  
//	  TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//	  // _nlogin.AssertUrl();
//	  
//	  
//	  TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
//	  _nlogin.Enter_nLOGIN(data[1]);
//	  
//	  
//	  TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
//	  _nlogin.Enter_nPASS(data[2]);
//	  
//	  
//	  TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
//	  _nlogin.Click_Login();
//	  
//	  
//	  pages.banking.ashiv.AgentSearch _AgentSearch = new pages.banking.ashiv.AgentSearch(driver);
//	  
//	  
//	  TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
//	  _AgentSearch.Click_Agents();
//	  
//	  TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
//	  _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
//	  
//	  
//	  TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
//	  _AgentSearch.Click_Search(); 
//	  
//	  TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
//	  _AgentSearch.Click__Nidhi1_();
//	  
//	  pages.banking.ashiv.Searchclient  _Searchclient = new pages.banking.ashiv.Searchclient(driver); 
//	
//	  TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
//	  _Searchclient.Click__Clients_(); 
//	  
//	  TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
//	  _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
//	 
//	  TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
//	  _Searchclient.Click_Searchbtn(); 
//	  
//	  TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
//	  _Searchclient.Click__NidhiEnt();
//	  
//	  pages.banking.ashiv.bankmenu _bankmenu= new pages.banking.ashiv.bankmenu(driver);
//	  
//	   _bankmenu.Click_Bankingmenu(); 
//	   
//	  pages.banking.ashiv.bankview _bankview = new  pages.banking.ashiv.bankview(driver); 
//	
//	  _bankview.Click_Bank_Menu_View(); 
//	  
//	  _bankview.Click_Bank__Rules_dropdown();
//
//	  pages.banking.ashiv.BankRuleCr_ZroRate_Credit _rulecreate2=new pages.banking.ashiv.BankRuleCr_ZroRate_Credit(driver);
//	 
//	  
//	  _rulecreate2.ASEnterRuleData();
//	  _rulecreate2.GetTData(); 
//	  
//	  pages.BankNewTransaction _ReconcilationTransaction = new  pages.BankNewTransaction(driver);
//	
//	  TestModellerLogger.SetLastNodeGuid("00b70107-cc4a-4697-a71f-dbb0d1c0ef03");
//	  _ReconcilationTransaction.Click_BankingTAB(); 
//
//	  TestModellerLogger.SetLastNodeGuid("94a4fa93-d2d5-4ff6-837c-ef202411eca4");
//	  _ReconcilationTransaction.Click_NewTAB(); 
//
//	  TestModellerLogger.SetLastNodeGuid("d0e7d4a2-32cb-48b0-b4da-56a9fea2e49b");
//	  _ReconcilationTransaction.Click_NewTransaction();
//	  
//	  
//	  pages.banking.ashiv.Fill_Bank_tran _ob=new pages.banking.ashiv.Fill_Bank_tran(driver);
//	  
//	   _ob.Fill_Recnl_Bank_ZR_CR();
//	  
//	  pages.banking.ashiv.bankmenu _bankmenu1 = new pages.banking.ashiv.bankmenu(driver); 
//	  
//	  _bankmenu1.Click_Bankingmenu();
//	  
//	  pages.banking.ashiv.Pages_Ashiv_Unrec1 _Unrec1 = new pages.banking.ashiv.Pages_Ashiv_Unrec1(driver);
//	 
//	  
//	  
//	  
//	  TestModellerLogger.SetLastNodeGuid("c5396966-5d41-4fa9-aeb2-41a0420025e9");
//	  
//	  _Unrec1.Click_Un_reco_Trans();
//	  
//	  _Unrec1.Click_Tab_RunRules1_btn();
//	  
//	  
//	  // pages.banking.ashiv.fnyr _fnyr=new pages.banking.ashiv.fnyr(driver); //
//	//  _fnyr.Select_Financial_yr_dropdown("Jan 2021 - Dec 2021");
//	  
//	  
//	  //
//	 // TestModellerLogger.SetLastNodeGuid("5ba0e2d6-0b34-4a31-a53c-138e9f98ad0e");
//	  // _Unrec1.Select_sel_bnk_dropdown("AA@Ashiv"); }
//	 
//	 }
//	    @Test  (groups= {"Rule1","Rule1 - rule1"})
//	    @TestModellerPath(guid = "90709375-ff5b-4f7f-b6a2-5f594f1c3ca7")
//	    public void GoToUrlClickMenuBankRulesPositiveSelectConditionFormulaEnterRuleDescClickAccountSelectcodePositiveSelectGetdataOpenBankTrnsfillOutsBothBankTrns() throws Exception
//	    {
//	        sTestCaseID="TC6.1"; 
//			Sheet="BankingBank"; 
//			data =ExcelData.toReadExcelData(sTestCaseID, Sheet);
//			
//			pages.banking.ashiv.nlogin _nlogin = new pages.banking.ashiv.nlogin(driver);
//			
//			TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
//			_nlogin.GoToUrl();
//
//			TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//			// _nlogin.AssertUrl();
//
//
//			TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
//			_nlogin.Enter_nLOGIN(data[1]);
//
//
//			TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
//			_nlogin.Enter_nPASS(data[2]);
//
//
//			TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
//			_nlogin.Click_Login();
//
//
//			pages.banking.ashiv.AgentSearch _AgentSearch = new pages.banking.ashiv.AgentSearch(driver);
//
//			TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
//			_AgentSearch.Click_Agents();
//
//			TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
//			_AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
//
//
//			TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
//			_AgentSearch.Click_Search();
//			//		  
//			//		  
//			TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
//			_AgentSearch.Click__Nidhi1_();
//			//		  
//			//		  
//			pages.banking.ashiv.Searchclient _Searchclient = new pages.banking.ashiv.Searchclient(driver);
//			//		  
//			//		  
//			TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
//			_Searchclient.Click__Clients_();
//			//		  
//			//		  
//			TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
//			_Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
//			//		  ;
//			//		  
//			//		  
//			TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
//			_Searchclient.Click_Searchbtn();
//			//		  
//			//		  
//			TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
//			_Searchclient.Click__NidhiEnt();
//			//		  
//			//		  
//			pages.banking.ashiv.bankmenu _bankmenu = new pages.banking.ashiv.bankmenu(driver); 
//			
//			_bankmenu.Click_Bankingmenu();
//			//		  
//			pages.banking.ashiv.bankview _bankview = new pages.banking.ashiv.bankview(driver);
//			//		  
//			_bankview.Click_Bank_Menu_View();
//			//		  
//			_bankview.Click_Bank__Rules_dropdown();
//			//		  
//			pages.banking.ashiv.BankRuleCr_Outofscope_Crdit _rulecreate2 =new pages.banking.ashiv.BankRuleCr_Outofscope_Crdit(driver);
//
//			_rulecreate2.ASEnterRuleData();
//			_rulecreate2.GetTData();
//					  
//
//			pages.BankNewTransaction _ReconcilationTransaction = new pages.BankNewTransaction(driver);
//				  
//			TestModellerLogger.SetLastNodeGuid("00b70107-cc4a-4697-a71f-dbb0d1c0ef03");
//			_ReconcilationTransaction.Click_BankingTAB();
//					  
//					  
//			TestModellerLogger.SetLastNodeGuid("94a4fa93-d2d5-4ff6-837c-ef202411eca4");
//			_ReconcilationTransaction.Click_NewTAB();
//					  
//				  
//			TestModellerLogger.SetLastNodeGuid("d0e7d4a2-32cb-48b0-b4da-56a9fea2e49b");
//			_ReconcilationTransaction.Click_NewTransaction(); 
//
//
//			pages.banking.ashiv.Fill_Bank_tran _ob=new pages.banking.ashiv.Fill_Bank_tran(driver); 
//		_ob.Fill_Recnl_Bank_OutS_CR();
//
//			pages.banking.ashiv.bankmenu _bankmenu1 = new pages.banking.ashiv.bankmenu(driver); 
//			
//			_bankmenu1.Click_Bankingmenu();
//
//			pages.banking.ashiv.Pages_Ashiv_Unrec1 _Unrec1 = new       pages.banking.ashiv.Pages_Ashiv_Unrec1(driver);
//
//
//
//			TestModellerLogger.SetLastNodeGuid("c5396966-5d41-4fa9-aeb2-41a0420025e9");
//			_Unrec1.Click_Un_reco_Trans();
//	     	_Unrec1.Click_Tab_RunRules1_btn();
//
//
//			//  pages.banking.ashiv.fnyr _fnyr=new   pages.banking.ashiv.fnyr(driver);
//			//    _fnyr.Select_Financial_yr_dropdown("Jan 2021 - Dec 2021");
//
//
//			//   TestModellerLogger.SetLastNodeGuid("5ba0e2d6-0b34-4a31-a53c-138e9f98ad0e");
//			//    _Unrec1.Select_sel_bnk_dropdown("AA@Ashiv");
//	    }
}
	 