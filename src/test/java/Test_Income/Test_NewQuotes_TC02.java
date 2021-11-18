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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/ca2c2b33-1cbf-4854-94c4-923e8e332220
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1879, profileId = 102456)
public class Test_NewQuotes_TC02 extends TestBase
{
	public String sTestCaseID=null;
    String[] data=null;
    String Sheet = null;

    
    @Test  (groups= {"Test_New_Quotes","Test_New_Quotes - User Stories"})
    @TestModellerPath(guid = "e3f9711b-7029-4fa4-9528-ad6148b3d69e")
    public void ClickNew1ClickNewQuote2PositiveSelectSelectCustomer3EnterEnterInvoiceNo4PositiveEnterEnterInvoiCreateQuoteWithoutQuoteNoShowMsg_TC02() throws InvalidFormatException, InterruptedException, HeadlessException, IOException, AWTException
    {
    	 sTestCaseID="TC01_New Quotes";
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
            
//        TestModellerLogger.SetLastNodeGuid("4a368791-50ba-4762-9daa-e6881663c7c5");
//        _SaleCreditNote.GoToUrl();
    //    
    //    
    //
//        TestModellerLogger.SetLastNodeGuid("86a841d0-4d6c-4c47-9128-fdf96874a918");
//        _SaleCreditNote.AssertUrl();
        

        TestModellerLogger.SetLastNodeGuid("41f6f46c-f112-4637-917e-dbdc89c9bae5");
        _SaleCreditNote.Click_SalesTab();
    	
        Pages_Income.New_Quotes _New_Quotes = new Pages_Income.New_Quotes(driver);
        
    TestModellerLogger.SetLastNodeGuid("1802f614-9682-4899-b2b0-997722c05be0");
    _New_Quotes.Click_New_1();
    

    TestModellerLogger.SetLastNodeGuid("e6258a71-2ca5-4130-95c0-8c9a0734e503");
    _New_Quotes.Click_New_Quote_2();
    
   // TestModellerLogger.SetLastNodeGuid("ed34f1f2-d577-4c1a-a901-d68841e475ae");
  //  _New_Quotes.Click_Income_Type_Btn_8();
    

    //TestModellerLogger.SetLastNodeGuid("26ca5656-7455-4eb2-a9ba-8db504ef6f5f");
  //  _New_Quotes.Enter_Enter_IncomeHeadName_9("Cis");
    

 //   TestModellerLogger.SetLastNodeGuid("085cb375-e7ce-4d42-b046-6c5a4c9f7944");
  //  _New_Quotes.Select_Selete_VatType_10("Standard Rate");
    

  //  TestModellerLogger.SetLastNodeGuid("3e19320c-9d5e-4c17-a014-99d48100f558");
   // _New_Quotes.Click_Click_More_Details_11();
    

  //  TestModellerLogger.SetLastNodeGuid("68e1b83e-1ce2-466b-81db-d8a11a9d5e7b");
  //  _New_Quotes.Click_Click_chk_CIS12();
    

  //  TestModellerLogger.SetLastNodeGuid("939a2d64-4b40-49b8-b27b-c905e8ed9017");
  //  _New_Quotes.Click_Save_13();
    

    TestModellerLogger.SetLastNodeGuid("2969c497-f8f5-449e-8898-979cd071f4fc");
    _New_Quotes.Select_Select_Customer_3("Default Customer");
    

    TestModellerLogger.SetLastNodeGuid("9d81aa56-a561-44dd-a214-246de99d0cd8");
    _New_Quotes.Enter_Enter_InvoiceNo_4("");
    

    TestModellerLogger.SetLastNodeGuid("dfb821ec-6cb2-4308-ae72-ad89a80a592b");
    _New_Quotes.Enter_Enter_InvoiceDate_5("");
    

  //  TestModellerLogger.SetLastNodeGuid("7f15e090-d2ad-4b8a-84a9-310fdede16e3");
   // _New_Quotes.Click_Click_chk_AutoEmail_6();
    

  //  TestModellerLogger.SetLastNodeGuid("0d8b33d0-d466-468c-bdd7-664f8620dbf4");
 //   _New_Quotes.Click_Click_Chk_Non_Vat_Quote7();
    

   
    

    TestModellerLogger.SetLastNodeGuid("8ac84b36-5be2-4966-9312-605b04a83987");
    _New_Quotes.Select_Select_Income_type_14("Sale");
    

    TestModellerLogger.SetLastNodeGuid("5c67cbe0-da2d-472e-ae93-c167890eb9d9");
    _New_Quotes.Enter_Enter_Description_15("Ashiv");
    

    TestModellerLogger.SetLastNodeGuid("558e6801-e03f-4685-8f5a-9f827e0e4a41");
    _New_Quotes.Enter_Enter_UnitPrice_16("1000");
    

    TestModellerLogger.SetLastNodeGuid("b3d3aa35-6520-45e1-b042-357c7872fa05");
    _New_Quotes.Enter_Enter_Quantity_17("1");
    

    TestModellerLogger.SetLastNodeGuid("0303ce72-a464-4b4b-be20-8a9a4d320987");
    _New_Quotes.Enter_Enter_DiscountRate_18("5");
    

    TestModellerLogger.SetLastNodeGuid("0001d694-396c-4ab8-8b72-752b15e3a4ae");
    _New_Quotes.Select_Select_VATRate_19("No VAT");
    

    TestModellerLogger.SetLastNodeGuid("515f0ebb-755d-4d9c-837b-be91c5fada37");
    _New_Quotes.Click_Save_20();
    
    _New_Quotes.WithoutQuoteNo_message();
    
    
    

    }

}