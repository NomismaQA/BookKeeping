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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/14eb8328-ae4f-4751-ba83-1c707a8af554
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1839, profileId = 102357)
public class TestMappingBalance1_DefaultProfile extends TestBase
{
	String sTestCaseID=null;
	String[] data=null;
	String Sheet =null;

    
    @Test  (groups= {"Test_MappingBalance","Test_MappingBalance - Default Profile"})
    @TestModellerPath(guid = "3e829ebe-0d8e-495d-8af1-28d8cfee90dc")
    public void GotoUrlClickAdvisorToolsClickImportTrialBalanceClickChooseFileClickUploadPositiveSelectLedgerCodePosi() throws InvalidFormatException, InterruptedException, HeadlessException, IOException, AWTException
    {
    	  sTestCaseID="TC10"; 
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
    	  
        
    	   pages.banking.ashiv.TrialBalance _TrialBalance = new  pages.banking.ashiv.TrialBalance(driver);
    	   
    	    TestModellerLogger.SetLastNodeGuid("5923dbf4-8fbb-41f4-8513-9225273ef446");
    	    _TrialBalance.Click_Advisor_Tools_1();
    	    

    	    TestModellerLogger.SetLastNodeGuid("97bc4db5-06c4-442f-b325-9ae6fd93052a");
    	    _TrialBalance.Click_Import_Trial_Balance2();
    	    
    	   
    	  //  _TrialBalance.ClickUploadFile("D:\\New folder\\TrialBalanceImportSample.csv");
    	    

//    	    TestModellerLogger.SetLastNodeGuid("09526522-582d-4f13-8e40-c19a0eaf927e");
//    	    _TrialBalance.Click_Upload4();
//    	    
//
//    	    TestModellerLogger.SetLastNodeGuid("6e9d1b1e-9f00-4122-8c82-7995952f8442");
//    	    _TrialBalance.Click_Next8();
//    	    
//
//    	    TestModellerLogger.SetLastNodeGuid("86986ecc-c97d-4f38-adf8-3134538f27e4");
//    	    _TrialBalance.Click_Mas9();
//    	    
//
//    	    TestModellerLogger.SetLastNodeGuid("8edaec91-bb50-4ed8-84e9-4224b66323bf");
//    	    _TrialBalance.Click_Addentry10();
//    	    
//
//    	    TestModellerLogger.SetLastNodeGuid("6e522f40-af05-4d89-bf8d-9eb1b476a33d");
//    	    _TrialBalance.Click_RemoveEntry11();
//    	    
//
//    	    TestModellerLogger.SetLastNodeGuid("7f979133-b62d-4d2d-8968-e56b28f21f0a");
//    	    _TrialBalance.Click_Import12();
//    	    

    	    TestModellerLogger.SetLastNodeGuid("b2882e60-da8e-4923-b370-36050cefe656");
    	//    _TrialBalance.Click_Msg13();
    }

}