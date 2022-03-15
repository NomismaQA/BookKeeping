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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/156fd206-cd9e-4195-9786-b6b6ae16bc46
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1878, profileId = 102453)
public class TestNewBatchEntry_TC03 extends TestBase
{
	public String sTestCaseID=null;
    String[] data=null;
    String Sheet = null;

    
    @Test  (groups= {"Test_NewBatchEntry","Test_NewBatchEntry - Test Cases"})
    @TestModellerPath(guid = "54a185ea-15ac-44ce-86a6-50d2541583dc")
    public void ClickNew1ClickNewBatchEntry2PositiveEnterInvoiceDate3PositiveSelectSelectCustomer4PositiveSelecClickSaveAndAddMoreOpennewEntryTab_TC03 () throws InvalidFormatException, InterruptedException, HeadlessException, IOException, AWTException
    {
    	 sTestCaseID="TC01_NewBatchEntry";
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
    	
        
        Pages_Income.New_Batch_entry _New_Batch_entry = new Pages_Income.New_Batch_entry(driver);
        
    TestModellerLogger.SetLastNodeGuid("5fba1ce9-08c6-4272-bc8c-ec39124fa69f");
    _New_Batch_entry.Click_New_1();
    

    TestModellerLogger.SetLastNodeGuid("cc9f1d9d-eb49-41be-b3ab-5b0be8674d1a");
    _New_Batch_entry.Click_New_Batch_Entry_2();
    

    TestModellerLogger.SetLastNodeGuid("59e5c823-487b-4d03-bc05-a5a04e0a5d10");
    _New_Batch_entry.Enter_InvoiceDate_3("");
    
  //  _New_Batch_entry.CustomerList();
    
    TestModellerLogger.SetLastNodeGuid("e0960b29-e2ed-445c-8b63-7477a316eff9");
    _New_Batch_entry.Select_Select_Customer_4(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("d38928b1-daff-46f0-917f-957e834a2cd9");
    _New_Batch_entry.Select_Select_InvoiceType_5(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("3067f98f-8c67-4494-92b5-a774f0aebdbe");
    _New_Batch_entry.Enter_EnterInvoiceNo_6("");
    

    TestModellerLogger.SetLastNodeGuid("7552c8da-6515-465a-a544-b3dcb0f26cd8");
    _New_Batch_entry.Select_Seletc_Income_Type7(data[7]);
    

    TestModellerLogger.SetLastNodeGuid("261577c0-8cf2-4f3a-8956-71081a61b8cc");
    _New_Batch_entry.Enter_Enter_Description_8(data[8]);
    

    TestModellerLogger.SetLastNodeGuid("2542408f-cb5f-40e4-8472-0824b905b2ce");
    _New_Batch_entry.Enter_Enter_Amount_9(data[9]);
    

    TestModellerLogger.SetLastNodeGuid("0831a80b-b59b-4dbf-9738-afd15ad6ae32");
    _New_Batch_entry.Select_Select_VATRate_10(data[10]);
    

    TestModellerLogger.SetLastNodeGuid("7fb72128-ca93-4af1-9550-9076eef92927");
    _New_Batch_entry.Click_Save_Add_More_11();
    
    Thread.sleep(3000);
   utilities.Screenshotcapture.Getscreenshot(" Save fill line items & add more line items", "New Batch Entry");
    

  //  TestModellerLogger.SetLastNodeGuid("d32c65c6-014d-4c92-be8c-8518d4753851");
  //  _New_Batch_entry.Click_Save_12();
    

    }

}