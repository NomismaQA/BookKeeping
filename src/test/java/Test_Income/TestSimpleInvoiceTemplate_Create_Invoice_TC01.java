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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/7473dbcb-9e2a-4101-a2e1-119e14acf5ad
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1869, profileId = 102423)
public class TestSimpleInvoiceTemplate_Create_Invoice_TC01 extends TestBase
{
	public String sTestCaseID=null;
    String[] data=null;
    String Sheet = null;

    
    @Test  (groups= {"Test_Customer_List","Test_Customer_List - Default Profile"})
    @TestModellerPath(guid = "1956db1c-1a3c-4084-943e-f3e2ca108b9c")
    public void GoToUrlLoginApplicationWithValidCredentialsClickNewClickCreateInvoiceCreateNewInvoiceVerifyNewCustomerAddedSuccessfully_TC01() throws InvalidFormatException, InterruptedException, HeadlessException, IOException, AWTException
    {
   	 sTestCaseID="TC01_SimpleInvoiceTemplate";
     Sheet="Fin-3821";
     data = ExcelData.toReadExcelData(sTestCaseID, Sheet);

      pages.banking.ashiv.nlogin _nlogin = new pages.banking.ashiv.nlogin(driver);

        TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
        _nlogin.GoToUrl();
        

//        TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//        _nlogin.AssertUrl();
        

        TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
        _nlogin.Enter_nLOGIN(data[1]);
        

        TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
        _nlogin.Enter_nPASS(data[2]);
        

        TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
        _nlogin.Click_Login();
        

        pages.banking.ashiv.AgentSearch _AgentSearch = new pages.banking.ashiv.AgentSearch(driver);

//        TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
//        _AgentSearch.GoToUrl();
    //    

//        TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
//        _AgentSearch.AssertUrl();
        

        TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
        _AgentSearch.Click_Agents();
        

        TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
        _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
        

        TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
        _AgentSearch.Click_Search();
        

        TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
        _AgentSearch.Click__Nidhi1_();
        

        pages.banking.ashiv.Searchclient _Searchclient = new pages.banking.ashiv.Searchclient(driver);

//        TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
//        _Searchclient.GoToUrl();
     
    
//        TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
//        _Searchclient.AssertUrl();
        

        TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
        _Searchclient.Click__Clients_();
        

        TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
        _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
        


        TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
        _Searchclient.Click_Searchbtn();
        

        TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
        _Searchclient.Click__NidhiEnt();
        
        pages.banking.ashiv.SaleInvoice _SaleInvoice = new    pages.banking.ashiv.SaleInvoice(driver);

//      TestModellerLogger.SetLastNodeGuid("2f331494-c0ec-443e-b258-bdf3d2f9d9fc");
//      _SaleInvoice.GoToUrl();

//      TestModellerLogger.SetLastNodeGuid("281121da-f0ce-4629-a4d1-0bc9b4260347");
//      _SaleInvoice.AssertUrl();
      

      TestModellerLogger.SetLastNodeGuid("38510c8a-daac-4ff8-83f3-54b176440787");
      _SaleInvoice.Click_SalesTab();
      

      TestModellerLogger.SetLastNodeGuid("2ce6ef22-01ee-4e82-bcb0-f7ce06badd95");
      _SaleInvoice.Click_NewButton();
      

      TestModellerLogger.SetLastNodeGuid("b605bf48-53b8-4f7f-a009-9ea8d59b69ba");
      _SaleInvoice.Click_NewInvoice();
      
      _SaleInvoice.ScreenshotINC();
      
      _SaleInvoice.NewCreateIncomeType("Ashiv");
      
      TestModellerLogger.SetLastNodeGuid("4e83b316-7f8b-49b7-a97f-e85cefb020f0");
      _SaleInvoice.Select_CustomerName(data[5]);
      

      TestModellerLogger.SetLastNodeGuid("f3edcc35-8d70-4902-81f0-9c5d760fac46");
      _SaleInvoice.Enter_InvoiceNo1("");
      

      TestModellerLogger.SetLastNodeGuid("6f885a16-e34c-4d0d-914a-a726c1fa9617");
      _SaleInvoice.Enter_InvoiceDate("");
      

      TestModellerLogger.SetLastNodeGuid("294097b8-ccc5-4eb7-baec-1a26ca1364f0");
      _SaleInvoice.Select_IncomeType("Sale");
      
      utilities.Screenshotcapture.Getscreenshot("Blank line should be set as default in Description", "Simple Invoice Template");
      
      TestModellerLogger.SetLastNodeGuid("5ccbf01b-65a3-47f5-b916-dab48aab691f");
      _SaleInvoice.Enter_Description(data[9]);
      

      TestModellerLogger.SetLastNodeGuid("73677a32-1892-47f6-9783-a1072478778a");
      _SaleInvoice.Enter_UnitPrice(data[10]);
      

     
      

      
  

      TestModellerLogger.SetLastNodeGuid("6aeae28b-fd85-4712-8710-18e4b190dd19");
      _SaleInvoice.Enter_Note(data[13]);
      

   //   TestModellerLogger.SetLastNodeGuid("2508d3fa-348f-48f2-914a-4d43591ded90");
  //    _SaleInvoice.Click_SaveButton();
      
      utilities.Screenshotcapture.Getscreenshot("Please enter a valid unit price and quantity for sale", "Simple Invoice Template");
      
      TestModellerLogger.SetLastNodeGuid("d810d5bf-a960-434c-9172-1671dd383495");
      _SaleInvoice.Enter_Quantity(data[11]);
      
      utilities.Screenshotcapture.Getscreenshot("Unit Price box must be multiply with the quantity", "Simple Invoice Template");
      
      _SaleInvoice.Discount("5");
      
      TestModellerLogger.SetLastNodeGuid("516c7236-f043-4de9-b128-99997ccf1604");
      _SaleInvoice.Select_VATRate(data[12]);
      
      utilities.Screenshotcapture.Getscreenshot("Discount", "Simple Invoice Template");
      
      TestModellerLogger.SetLastNodeGuid("2508d3fa-348f-48f2-914a-4d43591ded90");
      _SaleInvoice.Click_SaveButton();
      
      
      _SaleInvoice.VerifyData();
      
      
    //////////////////////////////////////////////////////////////////////////////////////////
      

      TestModellerLogger.SetLastNodeGuid("2ce6ef22-01ee-4e82-bcb0-f7ce06badd95");
      _SaleInvoice.Click_NewButton();
      

      TestModellerLogger.SetLastNodeGuid("b605bf48-53b8-4f7f-a009-9ea8d59b69ba");
      _SaleInvoice.Click_NewInvoice();
      
     // _SaleInvoice.ScreenshotINC();
      
    //  _SaleInvoice.NewCreateIncomeType("Ashiv");
      
      TestModellerLogger.SetLastNodeGuid("4e83b316-7f8b-49b7-a97f-e85cefb020f0");
      _SaleInvoice.Select_CustomerName(data[5]);
      

      TestModellerLogger.SetLastNodeGuid("f3edcc35-8d70-4902-81f0-9c5d760fac46");
      _SaleInvoice.Enter_InvoiceNo("");
      

      TestModellerLogger.SetLastNodeGuid("6f885a16-e34c-4d0d-914a-a726c1fa9617");
      _SaleInvoice.Enter_InvoiceDate("");
      

      TestModellerLogger.SetLastNodeGuid("294097b8-ccc5-4eb7-baec-1a26ca1364f0");
      _SaleInvoice.Select_IncomeType("CIS");
      
    //  utilities.Screenshotcapture.Getscreenshot("Blank line should be set as default in Description", "Simple Invoice Template");
      
      TestModellerLogger.SetLastNodeGuid("5ccbf01b-65a3-47f5-b916-dab48aab691f");
      _SaleInvoice.Enter_Description(data[9]);
      

      TestModellerLogger.SetLastNodeGuid("73677a32-1892-47f6-9783-a1072478778a");
      _SaleInvoice.Enter_UnitPrice(data[10]);
      
      TestModellerLogger.SetLastNodeGuid("d810d5bf-a960-434c-9172-1671dd383495");
      _SaleInvoice.Enter_Quantity(data[11]);
     
      
       //utilities.Screenshotcapture.Getscreenshot("Unit Price box must be multiply with the quantity", "Simple Invoice Template");
      
      _SaleInvoice.Discount("5");
      
    //  TestModellerLogger.SetLastNodeGuid("516c7236-f043-4de9-b128-99997ccf1604");
     // _SaleInvoice.Select_VATRate(data[12]);

      TestModellerLogger.SetLastNodeGuid("6aeae28b-fd85-4712-8710-18e4b190dd19");
      _SaleInvoice.Enter_Note(data[13]);
      
    

   //   TestModellerLogger.SetLastNodeGuid("2508d3fa-348f-48f2-914a-4d43591ded90");
  //    _SaleInvoice.Click_SaveButton();
      
    //  utilities.Screenshotcapture.Getscreenshot("Please enter a valid unit price and quantity for sale", "Simple Invoice Template");
      
      
      
      
      
      
      
    //  utilities.Screenshotcapture.Getscreenshot("Discount", "Simple Invoice Template");
      
      TestModellerLogger.SetLastNodeGuid("2508d3fa-348f-48f2-914a-4d43591ded90");
      _SaleInvoice.Click_SaveButtonCIS();
      
    
  //  _SaleInvoice.GetSuccessText();
      
    }
}
    	