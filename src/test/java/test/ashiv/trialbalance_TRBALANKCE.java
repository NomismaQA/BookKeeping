package test.ashiv;

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
import utilities.ExcelData;
import utilities.testmodeller.TestModellerLogger;

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/71d71064-9d87-4828-a2d0-7f38c5d1be86
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1841, profileId = 102363)
public class trialbalance_TRBALANKCE extends TestBase
{
	public String sTestCaseID=null;
	String[] data=null;
	String Sheet = null;
	
    @Test  (groups= {"trialbalance","trialbalance - TRBALANKCE"})
    @TestModellerPath(guid = "7517827a-0cd9-40cd-9eb5-888089f12589")
    public void GoToUrlClickAdvisortl1ClickTrialbalanceEntry2PositiveEnterctl00cPHFileUploadcsv1ClickUploadBtnMappingClickNextBtnAddRemoveEntryClickImportBalance() throws InterruptedException, InvalidFormatException, HeadlessException, IOException, AWTException
    {
    	sTestCaseID="TC10";
      	Sheet="BankingBank";
       data = ExcelData.toReadExcelData(sTestCaseID,Sheet);
       pages.banking.ashiv.nlogin _nlogin = new  pages.banking.ashiv.nlogin(driver);
       
       TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
       _nlogin.GoToUrl();
       


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
       

       pages.banking.ashiv.Searchclient _Searchclient = new  pages.banking.ashiv.Searchclient(driver);

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
    	   
    	Import_trial_Balance.trialbalance _trialbalance = new	Import_trial_Balance.trialbalance(driver);
//    TestModellerLogger.SetLastNodeGuid("7d054288-4841-40fa-9015-ca89cacca609");
//    _trialbalance.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("bb3a96ad-4aff-4897-ada8-e5acd26714df");
    _trialbalance.Click_Advisortl1();
    

    TestModellerLogger.SetLastNodeGuid("f1c47465-f246-4ca9-af81-46a8071d9c28");
    _trialbalance.Click_TrialbalanceEntry2();
    

    TestModellerLogger.SetLastNodeGuid("c30deb0c-17fe-4fdb-bdd5-91a12642dde5");
    _trialbalance.Enter_ctl00cPHFileUpload_csv1("D:\\New folder\\TrialBalanceImportSample.csv");
    utilities.Screenshotcapture.Getscreenshot("UploadFile", "Trial_Balance");

    TestModellerLogger.SetLastNodeGuid("004283af-9996-45c4-b995-c041e7403883");
    _trialbalance.Click_Upload_button3();
	
    
    _trialbalance.Select_LadgerCode5(data[5]);
    _trialbalance.Select_AccountName6(data[6]);
    _trialbalance.Select_Balance7(data[7]);
    
    _trialbalance.Click_Next8();
    
    _trialbalance.Click_Mas9(data[10]);
    
   	utilities.Screenshotcapture.Getscreenshot("Trial balance upload successfully", "Validation");
    _trialbalance.Add_RemoveEntry();
   _trialbalance.Click_Import12();
   utilities.Screenshotcapture.Getscreenshot("files successfully imported ", "Validation");
   // _trialbalance.CancelBtn(data[12]);
	 
    //_trialbalance.Click_Msg13(data[9]);
   
    Thread.sleep(5000);
    
    
    }
	
	
	  @Test (groups= {"trialbalance","trialbalance - TRBALANKCE"})
	  
	  @TestModellerPath(guid = "7517827a-0cd9-40cd-9eb5-888089f12589")
	  
	  public void
	  GoToUrlClickAdvisortl1ClickTrialbalanceEntry2PositiveEnterctl00cPHFileUploadcsv1ClickUploadBtnMappingClickNextBtnAddRemoveEntryClickImportCRDR () throws InterruptedException, InvalidFormatException, HeadlessException, IOException, AWTException { 
		  sTestCaseID="TC11";
		  Sheet="BankingBank";
		  data = ExcelData.toReadExcelData(sTestCaseID,Sheet); 
	 
		  pages.banking.ashiv.nlogin _nlogin = new pages.banking.ashiv.nlogin(driver);
	  
	  TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
	  _nlogin.GoToUrl();
	  
	  
	  
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
	  
	  
	  pages.banking.ashiv.Searchclient _Searchclient = new  pages.banking.ashiv.Searchclient(driver);
	 
	  
	  // //
	  TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
	  // _Searchclient.AssertUrl();
	  
	  
	  TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
	  _Searchclient.Click__Clients_();
	  
	  
	  TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
	  _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
	  
	  
	  TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
	  _Searchclient.Click_Searchbtn();
	  
	  
	  TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
	  _Searchclient.Click__NidhiEnt();
	  
	  Import_trial_Balance.trialbalance _trialbalance = new   Import_trial_Balance.trialbalance(driver);
	 //
	  TestModellerLogger.SetLastNodeGuid("7d054288-4841-40fa-9015-ca89cacca609");
	  // _trialbalance.GoToUrl();
	  
	  
	  TestModellerLogger.SetLastNodeGuid("bb3a96ad-4aff-4897-ada8-e5acd26714df");
	  _trialbalance.Click_Advisortl1();
	  
	  
	  TestModellerLogger.SetLastNodeGuid("f1c47465-f246-4ca9-af81-46a8071d9c28");
	  _trialbalance.Click_TrialbalanceEntry2();
	  
	  
	  TestModellerLogger.SetLastNodeGuid("c30deb0c-17fe-4fdb-bdd5-91a12642dde5");
	  _trialbalance. Enter_ctl00cPHFileUpload_csv1("D:\\New folder\\TrialBalanceImportSample (2).csv" ); 
			 
	 utilities.Screenshotcapture.Getscreenshot("UploadFile2", "Trial_Balance");
	  
	  TestModellerLogger.SetLastNodeGuid("004283af-9996-45c4-b995-c041e7403883");
	  _trialbalance.Click_Upload_button3();
	  
	  _trialbalance.Select_LadgerCode5(data[5]);
	  _trialbalance.Select_AccountName6(data[6]);
	  
	  _trialbalance.Select_Credit(data[7]); 
	  _trialbalance.Select_Debit(data[8]); 
	 // _trialbalance.Select_Balance7(data[9]);
	  
            _trialbalance.Click_Next8(); 
	  
	   _trialbalance.Click_Mas9(data[10]);
	  utilities.Screenshotcapture.Getscreenshot("Trial balance upload successfully2" , "Trial_Balance"); 
	  //_trialbalance.Add_RemoveEntry();
	  //
	  Thread.sleep(4000);
	  _trialbalance.Click_Import12();
	  Thread.sleep(2000);
	  utilities.Screenshotcapture.Getscreenshot("files successfully imported2","Trial_Balance");
	//  _trialbalance.CancelBtn(data[12]);
	//  _trialbalance.Click_Msg13(data[10]);
	   Thread.sleep(5000);
	  
	  
	  }
	  
	  
	 
	  @Test  (groups= {"trialbalance","trialbalance - TRBALANKCE"})
	    @TestModellerPath(guid = "7517827a-0cd9-40cd-9eb5-888089f12589")
	    
	    public void GoToUrlClickAdvisortl1ClickTrialbalanceEntry2PositiveEnterctl00cPHFileUploadcsv1ClickUploadBtnCreditandDebitandBalanceAsColumnMappingClickNextBtnNagitiveTC1() throws InterruptedException, InvalidFormatException, HeadlessException, IOException, AWTException
	    {
	    	sTestCaseID="TC12";
	      	Sheet="BankingBank";
	       data = ExcelData.toReadExcelData(sTestCaseID,Sheet);
	       pages.banking.ashiv.nlogin _nlogin = new  pages.banking.ashiv.nlogin(driver);
	       
	       TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
	       _nlogin.GoToUrl();
	       


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
	       

	       pages.banking.ashiv.Searchclient _Searchclient = new  pages.banking.ashiv.Searchclient(driver);

	   //
//	       TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
//	       _Searchclient.AssertUrl();
	       

	       TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
	       _Searchclient.Click__Clients_();
	       

	       TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
	       _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
	       

	       TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
	       _Searchclient.Click_Searchbtn();
	       

	       TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
	       _Searchclient.Click__NidhiEnt();
	    	   
	    	Import_trial_Balance.trialbalance _trialbalance = new	Import_trial_Balance.trialbalance(driver);
//	    TestModellerLogger.SetLastNodeGuid("7d054288-4841-40fa-9015-ca89cacca609");
//	    _trialbalance.GoToUrl();
	    

	    TestModellerLogger.SetLastNodeGuid("bb3a96ad-4aff-4897-ada8-e5acd26714df");
	    _trialbalance.Click_Advisortl1();
	    

	    TestModellerLogger.SetLastNodeGuid("f1c47465-f246-4ca9-af81-46a8071d9c28");
	    _trialbalance.Click_TrialbalanceEntry2();
	    

	    TestModellerLogger.SetLastNodeGuid("c30deb0c-17fe-4fdb-bdd5-91a12642dde5");
	    _trialbalance.Enter_ctl00cPHFileUpload_csv1("D:\\New folder\\TrialBalanceImportSample (3).csv");
	    

	    TestModellerLogger.SetLastNodeGuid("004283af-9996-45c4-b995-c041e7403883");
	    _trialbalance.Click_Upload_button3();
	  //  utilities.Screenshotcapture.Getscreenshot("select either Balance or Debit and credit & File Not upload", "Validation3");
	    
	    _trialbalance.Select_LadgerCode5(data[5]);
	    _trialbalance.Select_AccountName6(data[6]);
	   
	    _trialbalance.Select_Credit(data[7]);
	    _trialbalance.Select_Debit(data[8]);
	    _trialbalance.Select_Balance7(data[9]);
	    
	    _trialbalance.Click_Next8();
//	    _trialbalance.Click_Mas9(data[10]);
//	    utilities.Screenshotcapture.Getscreenshot("Trial balance upload successfully", "Validation3");
//	    _trialbalance.Add_RemoveEntry();
//	  //  _trialbalance.Click_Import12();
//	    _trialbalance.CancelBtn(data[12]);
//	    //_trialbalance.Click_Msg13(data[11]);
	    utilities.Screenshotcapture.Getscreenshot("Credit and Debit and Balance As Column Mapping/NegitiveTC", "Trial_Balance");
	    _trialbalance.Click_Msg_Error(data[10]);
	    
	    Thread.sleep(5000);
	    
	    
	    }
  
	  @Test  (groups= {"trialbalance","trialbalance - TRBALANKCE"})
	    @TestModellerPath(guid = "7517827a-0cd9-40cd-9eb5-888089f12589")
	    
	    public void GoToUrlClickAdvisortl1ClickTrialbalanceEntry2PositiveEnterctl00cPHFileUploadcsv1ClickUploadBtnCreditandDebitandBalanceAsColumnMappingClickNextBtnAndBalanceColumnIsNILinCsvFileNagitiveTC2() throws InterruptedException, InvalidFormatException, HeadlessException, IOException, AWTException
	    {
	    	sTestCaseID="TC12";
	      	Sheet="BankingBank";
	       data = ExcelData.toReadExcelData(sTestCaseID,Sheet);
	       pages.banking.ashiv.nlogin _nlogin = new  pages.banking.ashiv.nlogin(driver);
	       
	       TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
	       _nlogin.GoToUrl();
	       


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
	       

	       pages.banking.ashiv.Searchclient _Searchclient = new  pages.banking.ashiv.Searchclient(driver);

	   //
//	       TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
//	       _Searchclient.AssertUrl();
	       

	       TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
	       _Searchclient.Click__Clients_();
	       

	       TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
	       _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
	       

	       TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
	       _Searchclient.Click_Searchbtn();
	       

	       TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
	       _Searchclient.Click__NidhiEnt();
	    	   
	    	Import_trial_Balance.trialbalance _trialbalance = new	Import_trial_Balance.trialbalance(driver);
//	    TestModellerLogger.SetLastNodeGuid("7d054288-4841-40fa-9015-ca89cacca609");
//	    _trialbalance.GoToUrl();
	    

	    TestModellerLogger.SetLastNodeGuid("bb3a96ad-4aff-4897-ada8-e5acd26714df");
	    _trialbalance.Click_Advisortl1();
	    

	    TestModellerLogger.SetLastNodeGuid("f1c47465-f246-4ca9-af81-46a8071d9c28");
	    _trialbalance.Click_TrialbalanceEntry2();
	    

	    TestModellerLogger.SetLastNodeGuid("c30deb0c-17fe-4fdb-bdd5-91a12642dde5");
	    _trialbalance.Enter_ctl00cPHFileUpload_csv1("D:\\New folder\\TrialBalanceImportSample (4).csv");
	    

	    TestModellerLogger.SetLastNodeGuid("004283af-9996-45c4-b995-c041e7403883");
	    _trialbalance.Click_Upload_button3();
	  //  utilities.Screenshotcapture.Getscreenshot("select either Balance or Debit and credit & File Not upload", "Validation3");
	    
	    _trialbalance.Select_LadgerCode5(data[5]);
	    _trialbalance.Select_AccountName6(data[6]);
	   
	    _trialbalance.Select_Credit(data[7]);
	    _trialbalance.Select_Debit(data[8]);
	    _trialbalance.Select_Balance7(data[9]);
	    
	    _trialbalance.Click_Next8();
//	    _trialbalance.Click_Mas9(data[10]);
//	    utilities.Screenshotcapture.Getscreenshot("Trial balance upload successfully", "Validation3");
//	    _trialbalance.Add_RemoveEntry();
//	  //  _trialbalance.Click_Import12();
//	    _trialbalance.CancelBtn(data[12]);
//	    //_trialbalance.Click_Msg13(data[11]);
	    utilities.Screenshotcapture.Getscreenshot("Credit and Debit and Balance As Column Mapping and Balance Column is NIL in Csv File/NegitiveTC", "Trial_Balance");
	    _trialbalance.Click_Msg_Error(data[10]);
	    
	    
	    
	    Thread.sleep(5000);
	    
	    
	    }

    @Test  (groups= {"trialbalance","trialbalance - TRBALANKCE"})
    @TestModellerPath(guid = "7517827a-0cd9-40cd-9eb5-888089f12589")
    public void GoToUrlClickAdvisortl1ClickTrialbalanceEntry2PositiveEnterctl00cPHFileUploadcsv1ClickUploadBtnBalanceMappingClickNextBtnAndBalanceColumnIsNil_in_CsvFileNegitiveTC3() throws InterruptedException, InvalidFormatException, HeadlessException, IOException, AWTException
    {
    	sTestCaseID="TC12";
      	Sheet="BankingBank";
       data = ExcelData.toReadExcelData(sTestCaseID,Sheet);
       pages.banking.ashiv.nlogin _nlogin = new  pages.banking.ashiv.nlogin(driver);
       
       TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
       _nlogin.GoToUrl();
       


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
       

       pages.banking.ashiv.Searchclient _Searchclient = new  pages.banking.ashiv.Searchclient(driver);

   
     // TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
    //   _Searchclient.AssertUrl();
       

       TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
       _Searchclient.Click__Clients_();
       

       TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
       _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
       

       TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
       _Searchclient.Click_Searchbtn();
       

       TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
       _Searchclient.Click__NidhiEnt();
    	   
    	Import_trial_Balance.trialbalance _trialbalance = new	Import_trial_Balance.trialbalance(driver);
    	
//    TestModellerLogger.SetLastNodeGuid("7d054288-4841-40fa-9015-ca89cacca609");
//    _trialbalance.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("bb3a96ad-4aff-4897-ada8-e5acd26714df");
    _trialbalance.Click_Advisortl1();
    

    TestModellerLogger.SetLastNodeGuid("f1c47465-f246-4ca9-af81-46a8071d9c28");
    _trialbalance.Click_TrialbalanceEntry2();
    

    TestModellerLogger.SetLastNodeGuid("c30deb0c-17fe-4fdb-bdd5-91a12642dde5");
    _trialbalance.Enter_ctl00cPHFileUpload_csv1("D:\\New folder\\TrialBalanceImportSample (5).csv");
   // utilities.Screenshotcapture.Getscreenshot("UploadFile", "Validation");

    TestModellerLogger.SetLastNodeGuid("004283af-9996-45c4-b995-c041e7403883");
    _trialbalance.Click_Upload_button3();
	
//    
    _trialbalance.Select_LadgerCode5(data[5]);
    _trialbalance.Select_AccountName6(data[6]);
    _trialbalance.Select_Balance7(data[9]);
    _trialbalance.Click_Next8();
 
    utilities.Screenshotcapture.Getscreenshot("Balance Mapping And Balance Column is Nil in CsvFile/NegitiveTC", "Trial_Balance");
  //  utilities.Screenshotcapture.Getscreenshot("files successfully imported ", "Validation");
    Thread.sleep(5000);
    
    
    }
    
    @Test  (groups= {"trialbalance","trialbalance - TRBALANKCE"})
    @TestModellerPath(guid = "7517827a-0cd9-40cd-9eb5-888089f12589")
    public void GoToUrlClickAdvisortl1ClickTrialbalanceEntry2PositiveEnterctl00cPHFileUploadcsv1ClickUploadBtnInterchangingTheColumnMappingFromDebitToCreditAndCreditToDebitClickNextBtnNegitiveTC4() throws InterruptedException, InvalidFormatException, HeadlessException, IOException, AWTException
    {
    	sTestCaseID="TC12";
      	Sheet="BankingBank";
       data = ExcelData.toReadExcelData(sTestCaseID,Sheet);
       pages.banking.ashiv.nlogin _nlogin = new  pages.banking.ashiv.nlogin(driver);
       
       TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
       _nlogin.GoToUrl();
       


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
       

       pages.banking.ashiv.Searchclient _Searchclient = new  pages.banking.ashiv.Searchclient(driver);

   
     // TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
    //   _Searchclient.AssertUrl();
       

       TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
       _Searchclient.Click__Clients_();
       

       TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
       _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
       

       TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
       _Searchclient.Click_Searchbtn();
       

       TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
       _Searchclient.Click__NidhiEnt();
    	   
    	Import_trial_Balance.trialbalance _trialbalance = new	Import_trial_Balance.trialbalance(driver);
    	
//    TestModellerLogger.SetLastNodeGuid("7d054288-4841-40fa-9015-ca89cacca609");
//    _trialbalance.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("bb3a96ad-4aff-4897-ada8-e5acd26714df");
    _trialbalance.Click_Advisortl1();
    

    TestModellerLogger.SetLastNodeGuid("f1c47465-f246-4ca9-af81-46a8071d9c28");
    _trialbalance.Click_TrialbalanceEntry2();
    

    TestModellerLogger.SetLastNodeGuid("c30deb0c-17fe-4fdb-bdd5-91a12642dde5");
    _trialbalance.Enter_ctl00cPHFileUpload_csv1("D:\\New folder\\TrialBalanceImportSample (2).csv");
   // utilities.Screenshotcapture.Getscreenshot("UploadFile", "Validation");

    TestModellerLogger.SetLastNodeGuid("004283af-9996-45c4-b995-c041e7403883");
    _trialbalance.Click_Upload_button3();
	
//    
    _trialbalance.Select_LadgerCode5(data[5]);
    _trialbalance.Select_AccountName6(data[6]);
    _trialbalance.Select_Credit(data[8]);
    _trialbalance.Select_Debit(data[7]);
  
   
    _trialbalance.Click_Next8();
   
    utilities.Screenshotcapture.Getscreenshot("Interchanging The Column Mapping From Debit To Credit/NegitiveTC", "Trial_Balance");
  //  utilities.Screenshotcapture.Getscreenshot("files successfully imported ", "Validation");
    Thread.sleep(5000);
}
    
    
    @Test  (groups= {"trialbalance","trialbalance - TRBALANKCE"})
    @TestModellerPath(guid = "7517827a-0cd9-40cd-9eb5-888089f12589")
    public void GoToUrlClickAdvisortl1ClickTrialbalanceEntry2PositiveEnterctl00cPHFileUploadcsv1ClickUploadBtnDebitColumnMappingClickNextBtnNegitiveTC5() throws InterruptedException, InvalidFormatException, HeadlessException, IOException, AWTException
    {
    	sTestCaseID="TC12";
      	Sheet="BankingBank";
       data = ExcelData.toReadExcelData(sTestCaseID,Sheet);
       pages.banking.ashiv.nlogin _nlogin = new  pages.banking.ashiv.nlogin(driver);
       
       TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
       _nlogin.GoToUrl();
       


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
       

       pages.banking.ashiv.Searchclient _Searchclient = new  pages.banking.ashiv.Searchclient(driver);

   
     // TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
    //   _Searchclient.AssertUrl();
       

       TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
       _Searchclient.Click__Clients_();
       

       TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
       _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
       

       TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
       _Searchclient.Click_Searchbtn();
       

       TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
       _Searchclient.Click__NidhiEnt();
    	   
    	Import_trial_Balance.trialbalance _trialbalance = new	Import_trial_Balance.trialbalance(driver);
    	
//    TestModellerLogger.SetLastNodeGuid("7d054288-4841-40fa-9015-ca89cacca609");
//    _trialbalance.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("bb3a96ad-4aff-4897-ada8-e5acd26714df");
    _trialbalance.Click_Advisortl1();
    

    TestModellerLogger.SetLastNodeGuid("f1c47465-f246-4ca9-af81-46a8071d9c28");
    _trialbalance.Click_TrialbalanceEntry2();
    

    TestModellerLogger.SetLastNodeGuid("c30deb0c-17fe-4fdb-bdd5-91a12642dde5");
    _trialbalance.Enter_ctl00cPHFileUpload_csv1("D:\\New folder\\TrialBalanceImportSample (6).csv");
   // utilities.Screenshotcapture.Getscreenshot("UploadFile", "Validation");

    TestModellerLogger.SetLastNodeGuid("004283af-9996-45c4-b995-c041e7403883");
    _trialbalance.Click_Upload_button3();
	
//    
    _trialbalance.Select_LadgerCode5(data[5]);
    _trialbalance.Select_AccountName6(data[6]);
  
       _trialbalance.Debit2(data[7]);
  
   
    _trialbalance.Click_Next8();
   
    utilities.Screenshotcapture.Getscreenshot("Only Debit Column Mapping/NegitiveTC", "Trial_Balance");
  //  utilities.Screenshotcapture.Getscreenshot("files successfully imported ", "Validation");
    Thread.sleep(5000);
}
    @Test  (groups= {"trialbalance","trialbalance - TRBALANKCE"})
    @TestModellerPath(guid = "7517827a-0cd9-40cd-9eb5-888089f12589")
    public void GoToUrlClickAdvisortl1ClickTrialbalanceEntry2PositiveEnterctl00cPHFileUploadcsv1ClickUploadBtnCrditColumnMappingClickNextBtnNegitiveTC5() throws InterruptedException, InvalidFormatException, HeadlessException, IOException, AWTException
    {
    	sTestCaseID="TC12";
      	Sheet="BankingBank";
       data = ExcelData.toReadExcelData(sTestCaseID,Sheet);
       pages.banking.ashiv.nlogin _nlogin = new  pages.banking.ashiv.nlogin(driver);
       
       TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
       _nlogin.GoToUrl();
       


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
       

       pages.banking.ashiv.Searchclient _Searchclient = new  pages.banking.ashiv.Searchclient(driver);

   
     // TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
    //   _Searchclient.AssertUrl();
       

       TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
       _Searchclient.Click__Clients_();
       

       TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
       _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
       

       TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
       _Searchclient.Click_Searchbtn();
       

       TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
       _Searchclient.Click__NidhiEnt();
    	   
    	Import_trial_Balance.trialbalance _trialbalance = new	Import_trial_Balance.trialbalance(driver);
    	
//    TestModellerLogger.SetLastNodeGuid("7d054288-4841-40fa-9015-ca89cacca609");
//    _trialbalance.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("bb3a96ad-4aff-4897-ada8-e5acd26714df");
    _trialbalance.Click_Advisortl1();
    

    TestModellerLogger.SetLastNodeGuid("f1c47465-f246-4ca9-af81-46a8071d9c28");
    _trialbalance.Click_TrialbalanceEntry2();
    

    TestModellerLogger.SetLastNodeGuid("c30deb0c-17fe-4fdb-bdd5-91a12642dde5");
    _trialbalance.Enter_ctl00cPHFileUpload_csv1("D:\\New folder\\TrialBalanceImportSample (7).csv");
   // utilities.Screenshotcapture.Getscreenshot("UploadFile", "Validation");

    TestModellerLogger.SetLastNodeGuid("004283af-9996-45c4-b995-c041e7403883");
    _trialbalance.Click_Upload_button3();
	
//    
    _trialbalance.Select_LadgerCode5(data[5]);
    _trialbalance.Select_AccountName6(data[6]);
   _trialbalance.Select_Credit(data[8]);
   // _trialbalance.Select_Debit(data[7]);
  
   
    _trialbalance.Click_Next8();
   
    utilities.Screenshotcapture.Getscreenshot("Only Crdit Column Mapping/NegitiveTC", "Trial_Balance");
  //  utilities.Screenshotcapture.Getscreenshot("files successfully imported ", "Validation");
    Thread.sleep(5000);
}

//    @Test  (groups= {"trialbalance","trialbalance - TRBALANKCE"})
//    @TestModellerPath(guid = "7517827a-0cd9-40cd-9eb5-888089f12589")
//    public void GoToUrlClickAdvisortl1ClickTrialbalanceEntry2PositiveEnterctl00cPHFileUploadcsv1ClickUploadBtnLedgeCodeIsWrongOrNotExistInTheSystemInCsvFileClickNextBtnNegitiveTC6() throws InterruptedException, InvalidFormatException, HeadlessException, IOException, AWTException
//    {
//    	sTestCaseID="TC12";
//      	Sheet="BankingBank";
//       data = ExcelData.toReadExcelData(sTestCaseID,Sheet);
//       pages.banking.ashiv.nlogin _nlogin = new  pages.banking.ashiv.nlogin(driver);
//       
//       TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
//       _nlogin.GoToUrl();
//       
//
//
//       TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
//       _nlogin.Enter_nLOGIN(data[1]);
//       
//
//       TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
//       _nlogin.Enter_nPASS(data[2]);
//       
//
//       TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
//       _nlogin.Click_Login();
//       
//
//       pages.banking.ashiv.AgentSearch _AgentSearch = new  pages.banking.ashiv.AgentSearch(driver);
//
//
//       TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
//       _AgentSearch.Click_Agents();
//       
//
//       TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
//       _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
//       
//
//       TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
//       _AgentSearch.Click_Search();
//       
//
//       TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
//       _AgentSearch.Click__Nidhi1_();
//       
//
//       pages.banking.ashiv.Searchclient _Searchclient = new  pages.banking.ashiv.Searchclient(driver);
//
//   
//     // TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
//    //   _Searchclient.AssertUrl();
//       
//
//       TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
//       _Searchclient.Click__Clients_();
//       
//
//       TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
//       _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
//       
//
//       TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
//       _Searchclient.Click_Searchbtn();
//       
//
//       TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
//       _Searchclient.Click__NidhiEnt();
//    	   
//    	Import_trial_Balance.trialbalance _trialbalance = new	Import_trial_Balance.trialbalance(driver);
//    	
////    TestModellerLogger.SetLastNodeGuid("7d054288-4841-40fa-9015-ca89cacca609");
////    _trialbalance.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("bb3a96ad-4aff-4897-ada8-e5acd26714df");
//    _trialbalance.Click_Advisortl1();
//    
//
//    TestModellerLogger.SetLastNodeGuid("f1c47465-f246-4ca9-af81-46a8071d9c28");
//    _trialbalance.Click_TrialbalanceEntry2();
//    
//
//    TestModellerLogger.SetLastNodeGuid("c30deb0c-17fe-4fdb-bdd5-91a12642dde5");
//    _trialbalance.Enter_ctl00cPHFileUpload_csv1("D:\\New folder\\TrialBalanceImportSample (7).csv");
//   // utilities.Screenshotcapture.Getscreenshot("UploadFile", "Validation");
//
//    TestModellerLogger.SetLastNodeGuid("004283af-9996-45c4-b995-c041e7403883");
//    _trialbalance.Click_Upload_button3();
//	
////    
//    _trialbalance.Select_LadgerCode5(data[5]);
//    _trialbalance.Select_AccountName6(data[6]);
//   _trialbalance.Select_Credit(data[7]);
//    _trialbalance.Select_Debit(data[8]);
//  
//   
//    _trialbalance.Click_Next8();
//   
//    utilities.Screenshotcapture.Getscreenshot("Ledge Code Is Wrong Or Not ExistIn The System'", "NegitiveTC");
//  //  utilities.Screenshotcapture.Getscreenshot("files successfully imported ", "Validation");
//    Thread.sleep(5000);
//}
    @Test  (groups= {"trialbalance","trialbalance - TRBALANKCE"})
    @TestModellerPath(guid = "7517827a-0cd9-40cd-9eb5-888089f12589")
    public void GoToUrlClickAdvisortl1ClickTrialbalanceEntry2PositiveEnterctl00cPHFileUploadcsv1ClickUploadBtnImportTrialBalance_if_it_isGetImportedOnceNegitiveTC7() throws InterruptedException, InvalidFormatException, HeadlessException, IOException, AWTException
    {
    	sTestCaseID="TC14";
      	Sheet="BankingBank";
       data = ExcelData.toReadExcelData(sTestCaseID,Sheet);
       pages.banking.ashiv.nlogin _nlogin = new  pages.banking.ashiv.nlogin(driver);
       
       TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
       _nlogin.GoToUrl();
       


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
       

       pages.banking.ashiv.Searchclient _Searchclient = new  pages.banking.ashiv.Searchclient(driver);

   
     // TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
    //   _Searchclient.AssertUrl();
       

       TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
       _Searchclient.Click__Clients_();
       

       TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
       _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
       

       TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
       _Searchclient.Click_Searchbtn();
       

       TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
       _Searchclient.Click__NidhiEnt();
    	   
    	Import_trial_Balance.trialbalance _trialbalance = new	Import_trial_Balance.trialbalance(driver);
    	
//    TestModellerLogger.SetLastNodeGuid("7d054288-4841-40fa-9015-ca89cacca609");
//    _trialbalance.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("bb3a96ad-4aff-4897-ada8-e5acd26714df");
    _trialbalance.Click_Advisortl1();
    

    TestModellerLogger.SetLastNodeGuid("f1c47465-f246-4ca9-af81-46a8071d9c28");
    _trialbalance.Click_TrialbalanceEntry2();
    

//    TestModellerLogger.SetLastNodeGuid("c30deb0c-17fe-4fdb-bdd5-91a12642dde5");
//    _trialbalance.Enter_ctl00cPHFileUpload_csv1("D:\\New folder\\TrialBalanceImportSample (7).csv");
//   // utilities.Screenshotcapture.Getscreenshot("UploadFile", "Validation");
//
//    TestModellerLogger.SetLastNodeGuid("004283af-9996-45c4-b995-c041e7403883");
//    _trialbalance.Click_Upload_button3();
	
//    
   // _trialbalance.Select_LadgerCode5(data[5]);
   // _trialbalance.Select_AccountName6(data[6]);
 //  _trialbalance.Select_Credit(data[8]);
   // _trialbalance.Select_Debit(data[7]);
  
   
   // _trialbalance.Click_Next8();
    _trialbalance.AllredyImportFile();
    utilities.Screenshotcapture.Getscreenshot("Import Trial Balance if it is Get Imported Once/NegitiveTC", "Trial_Balance");
  //  utilities.Screenshotcapture.Getscreenshot("files successfully imported ", "Validation");
    Thread.sleep(5000);
}
    
    
    @Test  (groups= {"trialbalance","trialbalance - TRBALANKCE"})
    @TestModellerPath(guid = "7517827a-0cd9-40cd-9eb5-888089f12589")
    public void GoToUrlClickAdvisortl1ClickTrialbalanceEntry2PositiveEnterctl00cPHFileUploadcsvImportCreditDebitButCreditDebitAmountNotMatchTC08() throws InterruptedException, InvalidFormatException, HeadlessException, IOException, AWTException
    {
    	sTestCaseID="TC10_1";
      	Sheet="BankingBank";
       data = ExcelData.toReadExcelData(sTestCaseID,Sheet);
       pages.banking.ashiv.nlogin _nlogin = new  pages.banking.ashiv.nlogin(driver);
       
       TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
       _nlogin.GoToUrl();
       


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
       

       pages.banking.ashiv.Searchclient _Searchclient = new  pages.banking.ashiv.Searchclient(driver);

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
    	   
    	Import_trial_Balance.trialbalance _trialbalance = new	Import_trial_Balance.trialbalance(driver);
//    TestModellerLogger.SetLastNodeGuid("7d054288-4841-40fa-9015-ca89cacca609");
//    _trialbalance.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("bb3a96ad-4aff-4897-ada8-e5acd26714df");
    _trialbalance.Click_Advisortl1();
    

    TestModellerLogger.SetLastNodeGuid("f1c47465-f246-4ca9-af81-46a8071d9c28");
    _trialbalance.Click_TrialbalanceEntry2();
    

    TestModellerLogger.SetLastNodeGuid("c30deb0c-17fe-4fdb-bdd5-91a12642dde5");
    _trialbalance.Enter_ctl00cPHFileUpload_csv1("D:\\New folder\\TrialBalanceCreditDebitnotmatch.csv");
    utilities.Screenshotcapture.Getscreenshot("UploadFileCredit_Debit", "Trial_Balance");

    TestModellerLogger.SetLastNodeGuid("004283af-9996-45c4-b995-c041e7403883");
    _trialbalance.Click_Upload_button3();
	
    
    _trialbalance.Select_LadgerCode5(data[5]);
    _trialbalance.Select_AccountName6(data[6]);
    _trialbalance.Select_Credit(data[7]);
    _trialbalance.Select_Debit(data[8]);
    
    
    _trialbalance.Click_Next8();
    
    //_trialbalance.Click_Mas9(data[10]);
    
   	utilities.Screenshotcapture.Getscreenshot("Trial balance upload successfully CreditDebit", "Trial_Balance");
  //  _trialbalance.Add_RemoveEntry();
   _trialbalance.Click_Import12();
   utilities.Screenshotcapture.Getscreenshot("Debit and  Credit not matched.", "Trial_Balance");
   // _trialbalance.CancelBtn(data[12]);
	 
    //_trialbalance.Click_Msg13(data[9]);
   
    Thread.sleep(5000);
    
    
    }
	
    
    
}