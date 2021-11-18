package Test_Income;

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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/13df620c-5daa-4f14-b847-b5346f55134c
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1877, profileId = 102450)
public class Test_Newjob_Delete_TC03 extends TestBase
{
	public String sTestCaseID=null;
    String[] data=null;
    String Sheet = null;

    
    @Test  (groups= {"Test New job","Test New job - User Stories"})
    @TestModellerPath(guid = "e53de6c7-5925-46b6-9b72-fea0d3163e34")
    public void ClickNew1ClickNewJob2ClickAddJob3PositiveEnterJobName4EnterJobNo5PositiveSelectJobStatus6ClickDeleteJob_TC03() throws InvalidFormatException, InterruptedException, HeadlessException, IOException, AWTException
    {
    	 sTestCaseID="TC01_New Job";
         Sheet="Fin-3821";
         data = ExcelData.toReadExcelData(sTestCaseID, Sheet);

          pages.banking.ashiv.nlogin _nlogin = new pages.banking.ashiv.nlogin(driver);

            TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
            _nlogin.GoToUrl();
            

//            TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//            _nlogin.AssertUrl();
            

            TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
            _nlogin.Enter_nLOGIN(data[1]);
            

            TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
            _nlogin.Enter_nPASS(data[2]);
            

            TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
            _nlogin.Click_Login();
            

            pages.banking.ashiv.AgentSearch _AgentSearch = new pages.banking.ashiv.AgentSearch(driver);

//            TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
//            _AgentSearch.GoToUrl();
        //    

//            TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
//            _AgentSearch.AssertUrl();
            

            TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
            _AgentSearch.Click_Agents();
            

            TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
            _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
            

            TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
            _AgentSearch.Click_Search();
            

            TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
            _AgentSearch.Click__Nidhi1_();
            
          
            

            pages.banking.ashiv.Searchclient _Searchclient = new pages.banking.ashiv.Searchclient(driver);

//            TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
//            _Searchclient.GoToUrl();
         
        
//            TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
//            _Searchclient.AssertUrl();
            

            TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
            _Searchclient.Click__Clients_();
            

            TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
            _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
            


            TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
            _Searchclient.Click_Searchbtn();
            

            TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
            _Searchclient.Click__NidhiEnt();
            
  pages.SaleCreditNote _SaleCreditNote = new pages.SaleCreditNote(driver);
            
//          TestModellerLogger.SetLastNodeGuid("4a368791-50ba-4762-9daa-e6881663c7c5");
//          _SaleCreditNote.GoToUrl();
      //    
      //    
      //
//          TestModellerLogger.SetLastNodeGuid("86a841d0-4d6c-4c47-9128-fdf96874a918");
//          _SaleCreditNote.AssertUrl();
          

          TestModellerLogger.SetLastNodeGuid("41f6f46c-f112-4637-917e-dbdc89c9bae5");
          _SaleCreditNote.Click_SalesTab();
    	
    	
        Pages_Income.New_Job _New_Job = new Pages_Income.New_Job(driver);
        
    TestModellerLogger.SetLastNodeGuid("df9506b0-94c5-4eae-8b55-175d3759318a");
    _New_Job.Click_New_1();
    

    TestModellerLogger.SetLastNodeGuid("f699cf20-ae0b-44bd-b074-82fa833b83af");
    _New_Job.Click_New_Job_2();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8ea7ea46-7ecf-4222-ae95-43d772d7fd05");
//    _New_Job.Click_Add_Job_3();
//    
//
//    TestModellerLogger.SetLastNodeGuid("edee8023-778c-4468-a671-f96c44d96560");
//    _New_Job.Enter_Job_Name_4(data[5]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("da93afe8-89e9-4261-9712-c7bd8b35a5b7");
//    _New_Job.Enter_JobNo_5(data[6]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("28bbb5eb-3902-4673-bb07-3004bd600f37");
//    _New_Job.Select_JobStatus_6("Open");
//    
//
//    TestModellerLogger.SetLastNodeGuid("1a6773f5-c5d0-4c09-a1b5-928e6fac7200");
//    _New_Job.Click_Save_8();
    
   // utilities.Screenshotcapture.Getscreenshot("Add Job Success", "New Job");

//    TestModellerLogger.SetLastNodeGuid("1665b5de-9b0d-41ba-8c6c-10555a692509");
//    _New_Job.Click_Edit_9();
//    
//
//    TestModellerLogger.SetLastNodeGuid("533e9616-1882-40b3-a0c6-f71170e75fa9");
//    _New_Job.Enter_Job_Name_4("Job_Edit");
//    
//
//    TestModellerLogger.SetLastNodeGuid("83b59b6d-fbaa-481f-b016-56bbe97aa629");
//    _New_Job.Enter_JobNo_5("1122");
//    
//
//    TestModellerLogger.SetLastNodeGuid("86a19bc8-4e93-4508-bd58-9b9fb04b5526");
//    _New_Job.Click_Save_8();
//    
//    utilities.Screenshotcapture.Getscreenshot("Edit Job Success", "New Job");
//    

    TestModellerLogger.SetLastNodeGuid("167848ae-9cd6-4d7e-89a6-7d72b2599ad6");
    _New_Job.Click_Delete_10();
    
    utilities.Screenshotcapture.Getscreenshot("Delete Job page", "New Job");
    _New_Job.Delete_Job();
    
  
    
//
    }

}