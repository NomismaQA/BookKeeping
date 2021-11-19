package tests.Bank_Upload_CSV;

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
import utilities.ExcelData;
import utilities.testmodeller.TestModellerLogger;

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/61b5dd83-2acc-4843-a50f-e6b8932c3db5
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1819, profileId = 102309)
public class DownloadCSV_Template extends TestBase
{
	public String sTestCaseID=null;
	String[] data=null;
	String Sheet = null;

    
    @Test  (groups= {"Upload_CSV","Upload_CSV - Download_Sample"})
    @TestModellerPath(guid = "88a93c0b-70a3-42f1-8a22-da000b2058e4")
    public void GoToUrlClickbankmenu1ClickUploadCSV2ClickDownloadCSV3() throws InvalidFormatException, InterruptedException
    {
        
    	  sTestCaseID="TC35";
         	Sheet="Banking";
          data = ExcelData.toReadExcelData(sTestCaseID,Sheet);
          pages.nlogin _nlogin = new pages.nlogin(driver);
          
          TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
          _nlogin.GoToUrl();
          

//          TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//          _nlogin.AssertUrl();
          

          TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
          _nlogin.Enter_nLOGIN(data[1]);
          

          TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
          _nlogin.Enter_nPASS(data[2]);
          

          TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
          _nlogin.Click_Login();
          

      pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
//          TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
//          _AgentSearch.GoToUrl();
      //    

//          TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
//          _AgentSearch.AssertUrl();
          

          TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
          _AgentSearch.Click_Agents();
          

          TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
          _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
          

          TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
          _AgentSearch.Click_Search();
          

          TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
          _AgentSearch.Click__Nidhi1_();
          

      pages.Searchclient _Searchclient = new pages.Searchclient(driver);

      //
//          TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
//          _Searchclient.AssertUrl();
          

          TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
          _Searchclient.Click__Clients_();
          

          TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
          _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
          

          TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
          _Searchclient.Click_Searchbtn();
          

          TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
          _Searchclient.Click__NidhiEnt();
          pages.bankmenu _bankmenu = new pages.bankmenu(driver);
          

          TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
           _bankmenu.Click_Bankingmenu();
          
    	 pages.Bank_UploadCSV.UploadCSV _UploadCSV = new  pages.Bank_UploadCSV.UploadCSV(driver);
    
//    	 TestModellerLogger.SetLastNodeGuid("91bd9ef5-dd4f-4770-8ea5-6259628c0ef9");
//    _UploadCSV.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("1c8ee5d6-9619-47b1-90d5-093adb88a815");
//    _UploadCSV.Click_bank_menu_1();
    

    TestModellerLogger.SetLastNodeGuid("6c5e1eec-2620-409c-896a-ef45860c0432");
    _UploadCSV.Click_Upload_CSV2();
    

    TestModellerLogger.SetLastNodeGuid("1f8b3db8-5b08-4828-aae6-90d9253bbb3d");
    _UploadCSV.Click_Download_CSV3();
    

    }

}