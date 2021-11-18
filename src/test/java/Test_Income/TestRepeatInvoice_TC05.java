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
public class TestRepeatInvoice_TC05 extends TestBase
{
	public String sTestCaseID=null;
    String[] data=null;
    String Sheet = null;

    
    @Test  (groups= {"Test_Repeat_invoicesTC02","Test_Repeat_invoicesTC02 - Default Profile"})
    @TestModellerPath(guid = "7365bfda-2e50-4e47-ab8c-65cae2cd74a3")
    public void GoToUrlClickView1ClickRepeatInvoice2ClickAddRepeatInvoice3PositiveSelectSelectCustomer4PosititCSVSampleDownload_Updoad_TC05() throws InterruptedException, InvalidFormatException, HeadlessException, IOException, AWTException
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
       
       

//       TestModellerLogger.SetLastNodeGuid("d9ba9b36-8311-4a59-9152-1a3d2921f4e3");
//       _Repeat_Invoice.Click_Add_Repeat_Invoice_3();
   //    
   //
//       TestModellerLogger.SetLastNodeGuid("ccf70a83-8187-487b-b3a5-eceb4aac5534");
//       _Repeat_Invoice.Select_Select_Customer_4("Invoices_001");
   //    
   //
//       TestModellerLogger.SetLastNodeGuid("6cf9bd87-f527-4624-af81-220e41a1c4a8");
//       _Repeat_Invoice.Enter_EnterStartDate5("25/10/2021");
   //    
   //
//       TestModellerLogger.SetLastNodeGuid("346e921e-22de-475c-b126-1dbebe605082");
//       _Repeat_Invoice.Enter_EnterEndDt6("25/11/2021");
   //    
   //
//       TestModellerLogger.SetLastNodeGuid("9cc49f34-1866-4f9d-9bea-5982a5ac68bc");
//       _Repeat_Invoice.Select_Select_IncomeType_7("Sale");
   //    
   //
//       TestModellerLogger.SetLastNodeGuid("f3a4bb1e-fc4f-4e15-9a7b-3b9c1a310aa7");
//       _Repeat_Invoice.Enter_Enter_Description_8("Testing");
   //    
   //
//       TestModellerLogger.SetLastNodeGuid("0f465ac6-f2e3-4f24-8ae7-e78786461337");
//       _Repeat_Invoice.Enter_EnterUnitPrice9("1000");
   //    
   //
//       TestModellerLogger.SetLastNodeGuid("942a7022-a179-4647-9703-dc3a3709ebcf");
//       _Repeat_Invoice.Enter_EnterQuantity10("2");
   //    
   //
//       TestModellerLogger.SetLastNodeGuid("d9663229-7722-4652-a445-16c996b94d02");
//       _Repeat_Invoice.Select_SelectVATRate11("No VAT");
   //    
   //
//       TestModellerLogger.SetLastNodeGuid("b144a919-adaa-4207-9409-4a5187a2a356");
//       _Repeat_Invoice.Click_Advance_12();
   //    
   //
//       TestModellerLogger.SetLastNodeGuid("57c1db67-0a8f-4544-a985-dc3a9f40b062");
//       _Repeat_Invoice.Select_SelectBank_13("Default Bank");
   //    
   //
   //    
   //
//       TestModellerLogger.SetLastNodeGuid("96b1019e-7ee1-4d1f-95fb-aa54cec8d337");
//       _Repeat_Invoice.Select_SelectFrequency16("Weekly");
   //    
   //
   //
//       TestModellerLogger.SetLastNodeGuid("78800cd5-c273-4318-8b6c-211404dccc8c");
//       _Repeat_Invoice.Click_Save_22();
       
       Pages_Income.Repeat_Invoice_Upload _Repeat_Invoice_Upload = new Pages_Income.Repeat_Invoice_Upload(driver);
       
       TestModellerLogger.SetLastNodeGuid("ce914b44-0ca0-4a1e-8909-a36aeeb2c69c");
       _Repeat_Invoice_Upload.Click_UploadBtn_1();
       

       TestModellerLogger.SetLastNodeGuid("54cad36e-62e1-48ba-a1f8-a87cd1b25bb8");
       _Repeat_Invoice_Upload.Click_CSV_Sample_2();
       

       TestModellerLogger.SetLastNodeGuid("ac84b8a2-9521-4bbc-920b-0bd2c07cc094");
       _Repeat_Invoice_Upload.Enter_EnterFileUpload_3("D:\\New folder\\RepeatingInvoiceBatchUploadSample.csv");
       
      _Repeat_Invoice_Upload.screenshotupload();

       TestModellerLogger.SetLastNodeGuid("c4f66ca1-fc60-4856-a755-1a243fd6a62d");
       _Repeat_Invoice_Upload.Click_UploadBtn_4();
       

       TestModellerLogger.SetLastNodeGuid("09067b0c-89b4-4f38-a3ed-375c1f9dcae2");
       _Repeat_Invoice_Upload.Select_StartDate_5("Start Date");
       

       TestModellerLogger.SetLastNodeGuid("ef12a424-d8bc-4ee4-9862-af5a0c937eb9");
       _Repeat_Invoice_Upload.Select_Customer_6("Customer");
       

       TestModellerLogger.SetLastNodeGuid("0d50c9fa-9739-4a68-8873-4b4576033d83");
       _Repeat_Invoice_Upload.Select_Income_Type_7("Income Type");
       

       TestModellerLogger.SetLastNodeGuid("29ad6f0c-e57d-4d43-ba5b-8a4031d88433");
       _Repeat_Invoice_Upload.Select_Dis_8("Description");
       

       TestModellerLogger.SetLastNodeGuid("6dc21ef9-4eaf-43ae-83fc-82c9e4166b7f");
       _Repeat_Invoice_Upload.Select_Amount_9("Amount");
       

       TestModellerLogger.SetLastNodeGuid("66380919-1005-4640-9173-f100d149ebff");
       _Repeat_Invoice_Upload.Select_Vat_10("VAT");
       

       TestModellerLogger.SetLastNodeGuid("7f0b6012-d790-41c8-97b6-8266eaf4dfac");
       _Repeat_Invoice_Upload.Select_Vat_Rate_Type_11("VAT Rate Type");
       

       TestModellerLogger.SetLastNodeGuid("2f6245d9-4b13-4bd1-a78a-b2021fdb1bed");
       _Repeat_Invoice_Upload.Select_Frequency_12("Frequency");
       

       TestModellerLogger.SetLastNodeGuid("7e670a6e-3533-48bb-a806-07ed0bd67261");
       _Repeat_Invoice_Upload.Select_Total_Occurence_13("Total Occurences");
       
       _Repeat_Invoice_Upload.screenshotMapping();
       
       TestModellerLogger.SetLastNodeGuid("9238fec8-30b8-46e6-9d19-b04043713e44");
       _Repeat_Invoice_Upload.Click_Submit_14();
       

       TestModellerLogger.SetLastNodeGuid("3a2fafe9-44bc-4066-a3b4-30f0683ea3ad");
       _Repeat_Invoice_Upload.Select_Select_Customer_15("Default Customer");
       

       TestModellerLogger.SetLastNodeGuid("ff0173f3-1e66-439e-be29-4e084b588ff9");
       _Repeat_Invoice_Upload.Select_Select_Income_Type_16("Sale");
       

       TestModellerLogger.SetLastNodeGuid("a94e1313-b19e-499c-a270-22741a537a64");
       _Repeat_Invoice_Upload.Select_Select_Customer_17("Default Customer");
       

       TestModellerLogger.SetLastNodeGuid("e436cb6d-cb59-4527-a790-1150447008af");
       _Repeat_Invoice_Upload.Select_Select_Income_Type_18("Sale");
       

       TestModellerLogger.SetLastNodeGuid("6cccb26d-bab4-412c-a331-71dd9bf7e2bf");
       _Repeat_Invoice_Upload.Click_Import_19();
       
       _Repeat_Invoice_Upload.screenshotsucc();

       
    }
}