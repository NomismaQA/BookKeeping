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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/d0ea13dd-2831-42ca-b9ab-ae35d7808d34
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 846, profileId = 100721)
public class IncomeCreditNote_TC04 extends TestBase
{
    
	public String sTestCaseID=null;
    String[] data=null;
    String Sheet = null;
    
    @Test  (groups= {"SaleCreditNote","SaleCreditNote - Default Profile"})
    @TestModellerPath(guid = "5cc2e76f-4944-4ac8-a56e-7a14352f4686")
    public void GoToUrlAssertUrlClickSalesTabClickNewButtonClickNewCreditNotePositiveSelectCustomerNamePositi1StartedWithAlphaNoCNNumericCreditNoteIncome_TC01() throws InterruptedException, IOException, HeadlessException, AWTException, InvalidFormatException
    {
    	
   	 sTestCaseID="TC01_Credit Note";
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
        
        pages.SaleCreditNote _SaleCreditNote = new pages.SaleCreditNote(driver);
        
//    TestModellerLogger.SetLastNodeGuid("4a368791-50ba-4762-9daa-e6881663c7c5");
//    _SaleCreditNote.GoToUrl();
//    
//    
//
//    TestModellerLogger.SetLastNodeGuid("86a841d0-4d6c-4c47-9128-fdf96874a918");
//    _SaleCreditNote.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("41f6f46c-f112-4637-917e-dbdc89c9bae5");
    _SaleCreditNote.Click_SalesTab();
    

    TestModellerLogger.SetLastNodeGuid("a1dedc7e-b8d5-4e5d-8d02-93387c7d697a");
    _SaleCreditNote.Click_NewButton();
    

    TestModellerLogger.SetLastNodeGuid("1d0f5c26-1f07-4ad5-8953-adfe5634232b");
    _SaleCreditNote.Click_NewCreditNote();
    

    TestModellerLogger.SetLastNodeGuid("8f0ac483-4b81-4ec8-b63a-c9243e4da070");
    _SaleCreditNote.Select_CustomerName(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("1062d571-8265-4c35-b27d-4d4ef9dad8d7");
    _SaleCreditNote.Enter_CreditNoteNo("");
    

    TestModellerLogger.SetLastNodeGuid("783d5ff9-7311-4812-8e73-f0e433fdc8a4");
    _SaleCreditNote.Enter_CreditNoteDate("");
    
    

    TestModellerLogger.SetLastNodeGuid("749d2d39-5d01-4ef9-ad4d-6af022daeea6");
    _SaleCreditNote.Select_IncomeType1(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("91d673df-2732-4b8e-8bd9-2ade1408cd1b");
    _SaleCreditNote.Enter_InvoiceNo(data[7]);
    

    TestModellerLogger.SetLastNodeGuid("410b9063-8412-49e5-b62c-950ec76f591d");
    _SaleCreditNote.Enter_CreditDescription("Testing");
    

    TestModellerLogger.SetLastNodeGuid("10a0cb0a-3cf3-483a-bcee-368d1ddad071");
    _SaleCreditNote.Enter_UnitPrice("1000");
    

    TestModellerLogger.SetLastNodeGuid("93095997-7b8d-4e46-8903-a2a5b64060d3");
    _SaleCreditNote.Enter_Quantity("1");
    

    TestModellerLogger.SetLastNodeGuid("f454ded6-253b-491a-9317-c1ad823e1c7c");
    _SaleCreditNote.Select_VATRateType("Out of Scope");
    

  //  TestModellerLogger.SetLastNodeGuid("11492876-0446-47ae-87a0-3d0d8f753fd8");
 //  _SaleCreditNote.Click_Tickformorelineitems();
    

 //   TestModellerLogger.SetLastNodeGuid("fa3946b2-757a-40c9-9974-911d0544a386");
  //  _SaleCreditNote.Enter_Note("");
    
    
     TestModellerLogger.SetLastNodeGuid("ff1a8f18-679c-4fbe-b321-b4eb48b484a1");
    _SaleCreditNote.Click_SaveButton();
     
    _SaleCreditNote.TC04GetMsg();
 
//  TestModellerLogger.SetLastNodeGuid("4a368791-50ba-4762-9daa-e6881663c7c5");
//  _SaleCreditNote.GoToUrl();
//  
//  
//
//  TestModellerLogger.SetLastNodeGuid("86a841d0-4d6c-4c47-9128-fdf96874a918");
//  _SaleCreditNote.AssertUrl();
  

 
  
//
//  TestModellerLogger.SetLastNodeGuid("a1dedc7e-b8d5-4e5d-8d02-93387c7d697a");
//  _SaleCreditNote.Click_NewButton();
//  
//
//  TestModellerLogger.SetLastNodeGuid("1d0f5c26-1f07-4ad5-8953-adfe5634232b");
//  _SaleCreditNote.Click_NewCreditNote();
//  
//
//  TestModellerLogger.SetLastNodeGuid("8f0ac483-4b81-4ec8-b63a-c9243e4da070");
//  _SaleCreditNote.Select_CustomerName(data[5]);
//  
//
//  TestModellerLogger.SetLastNodeGuid("1062d571-8265-4c35-b27d-4d4ef9dad8d7");
//  _SaleCreditNote.Enter_CreditNoteNo("");
//  
//
//  TestModellerLogger.SetLastNodeGuid("783d5ff9-7311-4812-8e73-f0e433fdc8a4");
//  _SaleCreditNote.Enter_CreditNoteDate("");
//  
//  
//
//  TestModellerLogger.SetLastNodeGuid("749d2d39-5d01-4ef9-ad4d-6af022daeea6");
//  _SaleCreditNote.Select_IncomeType1(data[6]);
//  
//
//  TestModellerLogger.SetLastNodeGuid("91d673df-2732-4b8e-8bd9-2ade1408cd1b");
//  _SaleCreditNote.Enter_InvoiceNo(data[7]);
//  
//
//  TestModellerLogger.SetLastNodeGuid("410b9063-8412-49e5-b62c-950ec76f591d");
//  _SaleCreditNote.Enter_CreditDescription("Testing");
//  
//
//  TestModellerLogger.SetLastNodeGuid("10a0cb0a-3cf3-483a-bcee-368d1ddad071");
//  _SaleCreditNote.Enter_UnitPrice("1000");
//  
//
//  TestModellerLogger.SetLastNodeGuid("93095997-7b8d-4e46-8903-a2a5b64060d3");
//  _SaleCreditNote.Enter_Quantity("1");
//  
//
//  TestModellerLogger.SetLastNodeGuid("f454ded6-253b-491a-9317-c1ad823e1c7c");
//  _SaleCreditNote.Select_VATRateType("Out of Scope");
//  
//
////  TestModellerLogger.SetLastNodeGuid("11492876-0446-47ae-87a0-3d0d8f753fd8");
////  _SaleCreditNote.Click_Tickformorelineitems();
//  
//
////   TestModellerLogger.SetLastNodeGuid("fa3946b2-757a-40c9-9974-911d0544a386");
////  _SaleCreditNote.Enter_Note("");
//  
//  
//   TestModellerLogger.SetLastNodeGuid("ff1a8f18-679c-4fbe-b321-b4eb48b484a1");
//  _SaleCreditNote.Click_SaveButton();
//  
//  _SaleCreditNote.TC002GetMsg();
//  
//  pages.PartialReconciledCases.SaleInvoice _SaleInvoice = new pages.PartialReconciledCases.SaleInvoice(driver);
//
//  TestModellerLogger.SetLastNodeGuid("38510c8a-daac-4ff8-83f3-54b176440787");
//  _SaleInvoice.Click_SalesTab();
//  
//  
//  Pages_Income.SalesThreeDot SalesThreedot=new Pages_Income.SalesThreeDot(driver);
//  
//  SalesThreedot.click_Edit();
//  
//  SalesThreedot.verifyCraditEdit();
  
  }
    
    
    

//    @Test  (groups= {"SaleCreditNote","SaleCreditNote - Default Profile"})
//    @TestModellerPath(guid = "83b294e3-da03-43ab-844c-aaed87e0f5db")
//    public void GoToUrlAssertUrlClickSalesTabClickNewButtonClickNewCreditNotePositiveSelectCustomerNamePositi2() throws InterruptedException, IOException, HeadlessException, AWTException
//    {
//        
//        pages.SaleCreditNote _SaleCreditNote = new pages.SaleCreditNote(driver);
//    TestModellerLogger.SetLastNodeGuid("4a368791-50ba-4762-9daa-e6881663c7c5");
//    _SaleCreditNote.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("86a841d0-4d6c-4c47-9128-fdf96874a918");
//    _SaleCreditNote.AssertUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("41f6f46c-f112-4637-917e-dbdc89c9bae5");
//    _SaleCreditNote.Click_SalesTab();
//    
//
//    TestModellerLogger.SetLastNodeGuid("a1dedc7e-b8d5-4e5d-8d02-93387c7d697a");
//    _SaleCreditNote.Click_NewButton();
//    
//
//    TestModellerLogger.SetLastNodeGuid("1d0f5c26-1f07-4ad5-8953-adfe5634232b");
//    _SaleCreditNote.Click_NewCreditNote();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8f0ac483-4b81-4ec8-b63a-c9243e4da070");
//    _SaleCreditNote.Select_CustomerName("abc");
//    
//
//    TestModellerLogger.SetLastNodeGuid("1062d571-8265-4c35-b27d-4d4ef9dad8d7");
//    _SaleCreditNote.Enter_CreditNoteNo("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("783d5ff9-7311-4812-8e73-f0e433fdc8a4");
//    _SaleCreditNote.Enter_CreditNoteDate("44211");
//    
//
//    TestModellerLogger.SetLastNodeGuid("749d2d39-5d01-4ef9-ad4d-6af022daeea6");
//    _SaleCreditNote.Select_IncomeType1("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("91d673df-2732-4b8e-8bd9-2ade1408cd1b");
//    _SaleCreditNote.Enter_InvoiceNo("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("410b9063-8412-49e5-b62c-950ec76f591d");
//    _SaleCreditNote.Enter_CreditDescription("pop");
//    
//
//    TestModellerLogger.SetLastNodeGuid("10a0cb0a-3cf3-483a-bcee-368d1ddad071");
//    _SaleCreditNote.Enter_UnitPrice("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("93095997-7b8d-4e46-8903-a2a5b64060d3");
//    _SaleCreditNote.Enter_Quantity("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("f454ded6-253b-491a-9317-c1ad823e1c7c");
//    _SaleCreditNote.Select_VATRateType("Standard Rate");
//    
//
//    TestModellerLogger.SetLastNodeGuid("11492876-0446-47ae-87a0-3d0d8f753fd8");
//    _SaleCreditNote.Click_Tickformorelineitems();
//    
//
//    TestModellerLogger.SetLastNodeGuid("fa3946b2-757a-40c9-9974-911d0544a386");
//    _SaleCreditNote.Enter_Note("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("ff1a8f18-679c-4fbe-b321-b4eb48b484a1");
//    _SaleCreditNote.Click_SaveButton();
//    
//
//    }
//
//    @Test  (groups= {"SaleCreditNote","SaleCreditNote - Default Profile"})
//    @TestModellerPath(guid = "f970f0f0-c7f2-40cb-a539-bf202528083d")
//    public void GoToUrlAssertUrlClickSalesTabClickNewButtonClickNewCreditNotePositiveSelectCustomerNamePositi3() throws InterruptedException, IOException, HeadlessException, AWTException
//    {
//        
//        pages.SaleCreditNote _SaleCreditNote = new pages.SaleCreditNote(driver);
//    TestModellerLogger.SetLastNodeGuid("4a368791-50ba-4762-9daa-e6881663c7c5");
//    _SaleCreditNote.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("86a841d0-4d6c-4c47-9128-fdf96874a918");
//    _SaleCreditNote.AssertUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("41f6f46c-f112-4637-917e-dbdc89c9bae5");
//    _SaleCreditNote.Click_SalesTab();
//    
//
//    TestModellerLogger.SetLastNodeGuid("a1dedc7e-b8d5-4e5d-8d02-93387c7d697a");
//    _SaleCreditNote.Click_NewButton();
//    
//
//    TestModellerLogger.SetLastNodeGuid("1d0f5c26-1f07-4ad5-8953-adfe5634232b");
//    _SaleCreditNote.Click_NewCreditNote();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8f0ac483-4b81-4ec8-b63a-c9243e4da070");
//    _SaleCreditNote.Select_CustomerName("abc");
//    
//
//    TestModellerLogger.SetLastNodeGuid("1062d571-8265-4c35-b27d-4d4ef9dad8d7");
//    _SaleCreditNote.Enter_CreditNoteNo("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("783d5ff9-7311-4812-8e73-f0e433fdc8a4");
//    _SaleCreditNote.Enter_CreditNoteDate("44211");
//    
//
//    TestModellerLogger.SetLastNodeGuid("749d2d39-5d01-4ef9-ad4d-6af022daeea6");
//    _SaleCreditNote.Select_IncomeType1("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("91d673df-2732-4b8e-8bd9-2ade1408cd1b");
//    _SaleCreditNote.Enter_InvoiceNo("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("410b9063-8412-49e5-b62c-950ec76f591d");
//    _SaleCreditNote.Enter_CreditDescription("ioi");
//    
//
//    TestModellerLogger.SetLastNodeGuid("10a0cb0a-3cf3-483a-bcee-368d1ddad071");
//    _SaleCreditNote.Enter_UnitPrice("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("93095997-7b8d-4e46-8903-a2a5b64060d3");
//    _SaleCreditNote.Enter_Quantity("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("f454ded6-253b-491a-9317-c1ad823e1c7c");
//    _SaleCreditNote.Select_VATRateType("Zero Rate");
//    
//
//    TestModellerLogger.SetLastNodeGuid("11492876-0446-47ae-87a0-3d0d8f753fd8");
//    _SaleCreditNote.Click_Tickformorelineitems();
//    
//
//    TestModellerLogger.SetLastNodeGuid("fa3946b2-757a-40c9-9974-911d0544a386");
//    _SaleCreditNote.Enter_Note("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("ff1a8f18-679c-4fbe-b321-b4eb48b484a1");
//    _SaleCreditNote.Click_SaveButton();
//    
//
//    }
//
//    @Test  (groups= {"SaleCreditNote","SaleCreditNote - Default Profile"})
//    @TestModellerPath(guid = "ef557e1b-529f-4d8d-b4b2-577a9967babe")
//    public void GoToUrlAssertUrlClickSalesTabClickNewButtonClickNewCreditNotePositiveSelectCustomerNamePositi4() throws InterruptedException, IOException, HeadlessException, AWTException
//    {
//        
//        pages.SaleCreditNote _SaleCreditNote = new pages.SaleCreditNote(driver);
//    TestModellerLogger.SetLastNodeGuid("4a368791-50ba-4762-9daa-e6881663c7c5");
//    _SaleCreditNote.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("86a841d0-4d6c-4c47-9128-fdf96874a918");
//    _SaleCreditNote.AssertUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("41f6f46c-f112-4637-917e-dbdc89c9bae5");
//    _SaleCreditNote.Click_SalesTab();
//    
//
//    TestModellerLogger.SetLastNodeGuid("a1dedc7e-b8d5-4e5d-8d02-93387c7d697a");
//    _SaleCreditNote.Click_NewButton();
//    
//
//    TestModellerLogger.SetLastNodeGuid("1d0f5c26-1f07-4ad5-8953-adfe5634232b");
//    _SaleCreditNote.Click_NewCreditNote();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8f0ac483-4b81-4ec8-b63a-c9243e4da070");
//    _SaleCreditNote.Select_CustomerName("abc");
//    
//
//    TestModellerLogger.SetLastNodeGuid("1062d571-8265-4c35-b27d-4d4ef9dad8d7");
//    _SaleCreditNote.Enter_CreditNoteNo("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("783d5ff9-7311-4812-8e73-f0e433fdc8a4");
//    _SaleCreditNote.Enter_CreditNoteDate("44211");
//    
//
//    TestModellerLogger.SetLastNodeGuid("749d2d39-5d01-4ef9-ad4d-6af022daeea6");
//    _SaleCreditNote.Select_IncomeType1("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("91d673df-2732-4b8e-8bd9-2ade1408cd1b");
//    _SaleCreditNote.Enter_InvoiceNo("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("410b9063-8412-49e5-b62c-950ec76f591d");
//    _SaleCreditNote.Enter_CreditDescription("poi");
//    
//
//    TestModellerLogger.SetLastNodeGuid("10a0cb0a-3cf3-483a-bcee-368d1ddad071");
//    _SaleCreditNote.Enter_UnitPrice("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("93095997-7b8d-4e46-8903-a2a5b64060d3");
//    _SaleCreditNote.Enter_Quantity("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("f454ded6-253b-491a-9317-c1ad823e1c7c");
//    _SaleCreditNote.Select_VATRateType("Reduced Rate");
//    
//
//    TestModellerLogger.SetLastNodeGuid("11492876-0446-47ae-87a0-3d0d8f753fd8");
//    _SaleCreditNote.Click_Tickformorelineitems();
//    
//
//    TestModellerLogger.SetLastNodeGuid("fa3946b2-757a-40c9-9974-911d0544a386");
//    _SaleCreditNote.Enter_Note("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("ff1a8f18-679c-4fbe-b321-b4eb48b484a1");
//    _SaleCreditNote.Click_SaveButton();
//    
//
//    }
//
//    @Test  (groups= {"SaleCreditNote","SaleCreditNote - Default Profile"})
//    @TestModellerPath(guid = "580316db-0f56-4178-88dd-50d474de62e6")
//    public void GoToUrlAssertUrlClickSalesTabClickNewButtonClickNewCreditNotePositiveSelectCustomerNamePositi5() throws InterruptedException, IOException, HeadlessException, AWTException
//    {
//        
//        pages.SaleCreditNote _SaleCreditNote = new pages.SaleCreditNote(driver);
//    TestModellerLogger.SetLastNodeGuid("4a368791-50ba-4762-9daa-e6881663c7c5");
//    _SaleCreditNote.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("86a841d0-4d6c-4c47-9128-fdf96874a918");
//    _SaleCreditNote.AssertUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("41f6f46c-f112-4637-917e-dbdc89c9bae5");
//    _SaleCreditNote.Click_SalesTab();
//    
//
//    TestModellerLogger.SetLastNodeGuid("a1dedc7e-b8d5-4e5d-8d02-93387c7d697a");
//    _SaleCreditNote.Click_NewButton();
//    
//
//    TestModellerLogger.SetLastNodeGuid("1d0f5c26-1f07-4ad5-8953-adfe5634232b");
//    _SaleCreditNote.Click_NewCreditNote();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8f0ac483-4b81-4ec8-b63a-c9243e4da070");
//    _SaleCreditNote.Select_CustomerName("abc");
//    
//
//    TestModellerLogger.SetLastNodeGuid("1062d571-8265-4c35-b27d-4d4ef9dad8d7");
//    _SaleCreditNote.Enter_CreditNoteNo("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("783d5ff9-7311-4812-8e73-f0e433fdc8a4");
//    _SaleCreditNote.Enter_CreditNoteDate("44211");
//    
//
//    TestModellerLogger.SetLastNodeGuid("749d2d39-5d01-4ef9-ad4d-6af022daeea6");
//    _SaleCreditNote.Select_IncomeType1("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("91d673df-2732-4b8e-8bd9-2ade1408cd1b");
//    _SaleCreditNote.Enter_InvoiceNo("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("410b9063-8412-49e5-b62c-950ec76f591d");
//    _SaleCreditNote.Enter_CreditDescription("ghj");
//    
//
//    TestModellerLogger.SetLastNodeGuid("10a0cb0a-3cf3-483a-bcee-368d1ddad071");
//    _SaleCreditNote.Enter_UnitPrice("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("93095997-7b8d-4e46-8903-a2a5b64060d3");
//    _SaleCreditNote.Enter_Quantity("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("f454ded6-253b-491a-9317-c1ad823e1c7c");
//    _SaleCreditNote.Select_VATRateType("No VAT");
//    
//
//    TestModellerLogger.SetLastNodeGuid("11492876-0446-47ae-87a0-3d0d8f753fd8");
//    _SaleCreditNote.Click_Tickformorelineitems();
//    
//
//    TestModellerLogger.SetLastNodeGuid("fa3946b2-757a-40c9-9974-911d0544a386");
//    _SaleCreditNote.Enter_Note("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("ff1a8f18-679c-4fbe-b321-b4eb48b484a1");
//    _SaleCreditNote.Click_SaveButton();
//    
//
//    }
//    @Test  (groups= {"SaleCreditNote","SaleCreditNote - Default Profile"})
//    @TestModellerPath(guid = "a85117ae-ae54-4a30-bc53-57d038b18638")
//    public void GoToUrlAssertUrlClickSalesTabClickNewButtonClickNewCreditNotePositiveSelectCustomerNamePositi6() throws InterruptedException, IOException, HeadlessException, AWTException
//    {
//        
//        pages.SaleCreditNote _SaleCreditNote = new pages.SaleCreditNote(driver);
//    TestModellerLogger.SetLastNodeGuid("4a368791-50ba-4762-9daa-e6881663c7c5");
//    _SaleCreditNote.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("86a841d0-4d6c-4c47-9128-fdf96874a918");
//    _SaleCreditNote.AssertUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("41f6f46c-f112-4637-917e-dbdc89c9bae5");
//    _SaleCreditNote.Click_SalesTab();
//    
//
//    TestModellerLogger.SetLastNodeGuid("a1dedc7e-b8d5-4e5d-8d02-93387c7d697a");
//    _SaleCreditNote.Click_NewButton();
//    
//
//    TestModellerLogger.SetLastNodeGuid("1d0f5c26-1f07-4ad5-8953-adfe5634232b");
//    _SaleCreditNote.Click_NewCreditNote();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8f0ac483-4b81-4ec8-b63a-c9243e4da070");
//    _SaleCreditNote.Select_CustomerName("abc");
//    
//
//    TestModellerLogger.SetLastNodeGuid("1062d571-8265-4c35-b27d-4d4ef9dad8d7");
//    _SaleCreditNote.Enter_CreditNoteNo("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("783d5ff9-7311-4812-8e73-f0e433fdc8a4");
//    _SaleCreditNote.Enter_CreditNoteDate("44211");
//    
//
//    TestModellerLogger.SetLastNodeGuid("749d2d39-5d01-4ef9-ad4d-6af022daeea6");
//    _SaleCreditNote.Select_IncomeType1("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("91d673df-2732-4b8e-8bd9-2ade1408cd1b");
//    _SaleCreditNote.Enter_InvoiceNo("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("410b9063-8412-49e5-b62c-950ec76f591d");
//    _SaleCreditNote.Enter_CreditDescription("dsd");
//    
//
//    TestModellerLogger.SetLastNodeGuid("10a0cb0a-3cf3-483a-bcee-368d1ddad071");
//    _SaleCreditNote.Enter_UnitPrice("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("93095997-7b8d-4e46-8903-a2a5b64060d3");
//    _SaleCreditNote.Enter_Quantity("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("f454ded6-253b-491a-9317-c1ad823e1c7c");
//    _SaleCreditNote.Select_VATRateType("Exempt");
//    
//
//    TestModellerLogger.SetLastNodeGuid("11492876-0446-47ae-87a0-3d0d8f753fd8");
//    _SaleCreditNote.Click_Tickformorelineitems();
//    
//
//    TestModellerLogger.SetLastNodeGuid("fa3946b2-757a-40c9-9974-911d0544a386");
//    _SaleCreditNote.Enter_Note("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("ff1a8f18-679c-4fbe-b321-b4eb48b484a1");
//    _SaleCreditNote.Click_SaveButton();
//    
//
//    }
//
// /*   @Test  (groups= {"SaleCreditNote","SaleCreditNote - Default Profile"})
//    @TestModellerPath(guid = "5de5af1d-8ff5-4073-9d38-1a3b54841310")
//    public void GoToUrlAssertUrlClickSalesTabClickNewButtonClickNewCreditNotePositiveSelectCustomerNamePositi9() throws InterruptedException
//    {
//        
//        pages.SaleCreditNote _SaleCreditNote = new pages.SaleCreditNote(driver);
//    TestModellerLogger.SetLastNodeGuid("4a368791-50ba-4762-9daa-e6881663c7c5");
//    _SaleCreditNote.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("86a841d0-4d6c-4c47-9128-fdf96874a918");
//    _SaleCreditNote.AssertUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("41f6f46c-f112-4637-917e-dbdc89c9bae5");
//    _SaleCreditNote.Click_SalesTab();
//    
//
//    TestModellerLogger.SetLastNodeGuid("a1dedc7e-b8d5-4e5d-8d02-93387c7d697a");
//    _SaleCreditNote.Click_NewButton();
//    
//
//    TestModellerLogger.SetLastNodeGuid("1d0f5c26-1f07-4ad5-8953-adfe5634232b");
//    _SaleCreditNote.Click_NewCreditNote();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8f0ac483-4b81-4ec8-b63a-c9243e4da070");
//    _SaleCreditNote.Select_CustomerName("abc");
//    
//
//    TestModellerLogger.SetLastNodeGuid("1062d571-8265-4c35-b27d-4d4ef9dad8d7");
//    _SaleCreditNote.Enter_CreditNoteNo("");
//    
//
 }
//
//}
