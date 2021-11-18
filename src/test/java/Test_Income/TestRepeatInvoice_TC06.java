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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/c1f05e49-6f5b-47e7-9d68-a8bc7bd01ca4
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1875, profileId = 102444)
public class TestRepeatInvoice_TC06 extends TestBase
{
	public String sTestCaseID=null;
    String[] data=null;
    String Sheet = null;

    
    @Test  (groups= {"Test_Repeat_invoicesTC02","Test_Repeat_invoicesTC02 - Default Profile"})
    @TestModellerPath(guid = "7365bfda-2e50-4e47-ab8c-65cae2cd74a3")
    public void GoToUrlClickView1ClickRepeatInvoice2ClickAddRepeatInvoice3PositiveSelectSelectCustomer4PosititDownloadCSVFile_TC06() throws InterruptedException, InvalidFormatException, HeadlessException, IOException, AWTException
    {
    	
      	 sTestCaseID="TC01_Repeat Invoice";
        Sheet="Fin-3821";
        data = ExcelData.toReadExcelData(sTestCaseID, Sheet);

         pages.banking.ashiv.nlogin _nlogin = new pages.banking.ashiv.nlogin(driver);

           TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
           _nlogin.GoToUrl();
           

//           TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//           _nlogin.AssertUrl();
           

           TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
           _nlogin.Enter_nLOGIN(data[1]);
           

           TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
           _nlogin.Enter_nPASS(data[2]);
           

           TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
           _nlogin.Click_Login();
           

           pages.banking.ashiv.AgentSearch _AgentSearch = new pages.banking.ashiv.AgentSearch(driver);

//           TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
//           _AgentSearch.GoToUrl();
       //    

//           TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
//           _AgentSearch.AssertUrl();
           

           TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
           _AgentSearch.Click_Agents();
           

           TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
           _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
           

           TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
           _AgentSearch.Click_Search();
           

           TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
           _AgentSearch.Click__Nidhi1_();
           

           pages.banking.ashiv.Searchclient _Searchclient = new pages.banking.ashiv.Searchclient(driver);

//           TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
//           _Searchclient.GoToUrl();
        
       
//           TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
//           _Searchclient.AssertUrl();
           

           TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
           _Searchclient.Click__Clients_();
           

           TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
           _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
           


           TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
           _Searchclient.Click_Searchbtn();
           

           TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
           _Searchclient.Click__NidhiEnt();
           
           pages.SaleCreditNote _SaleCreditNote = new pages.SaleCreditNote(driver);
           
//       TestModellerLogger.SetLastNodeGuid("4a368791-50ba-4762-9daa-e6881663c7c5");
//       _SaleCreditNote.GoToUrl();
   //    
   //    
   //
//       TestModellerLogger.SetLastNodeGuid("86a841d0-4d6c-4c47-9128-fdf96874a918");
//       _SaleCreditNote.AssertUrl();
       

       TestModellerLogger.SetLastNodeGuid("41f6f46c-f112-4637-917e-dbdc89c9bae5");
       _SaleCreditNote.Click_SalesTab();
           
           pages.banking.ashiv.Repeat_Invoice _Repeat_Invoice = new  pages.banking.ashiv.Repeat_Invoice(driver);
           
//       TestModellerLogger.SetLastNodeGuid("36f7dcf5-75c6-44ac-a870-2696de786c06");
//       _Repeat_Invoice.GoToUrl();
   //    

       TestModellerLogger.SetLastNodeGuid("c151a6a7-f304-4d5f-be5b-c3c07fd0bf8c");
       _Repeat_Invoice.Click_View_1();
       

       TestModellerLogger.SetLastNodeGuid("394c947a-245b-4589-9310-3d02182bcf0b");
       _Repeat_Invoice.Click_Repeat_Invoice_2();
       
       _Repeat_Invoice.downloadCSV();
       
       
       
       
    }
}