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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/9c09f22f-0df2-4fa8-87ff-cd3423cb46cb
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1874, profileId = 102441)
public class New_Repeat_Invoice extends TestBase
{
    
	public String sTestCaseID=null;
    String[] data=null;
    String Sheet = null;
    
    
    @Test  (groups= {"Test_Repeat_Invoice","Test_Repeat_Invoice - Test Cases"})
    @TestModellerPath(guid = "eb210160-0381-42a7-b04b-f1b4909af9e1")
    public void GoToUrlClickView1ClickRepeatInvoice2ClickAddRepeatInvoice3PositiveSelectSelectCustomer4Positi_TC12() throws InvalidFormatException, InterruptedException, HeadlessException, IOException, AWTException
    {
    	
    	
   	 sTestCaseID="TC01_New Repeat Invoice";
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
        
        pages.SaleCreditNote _SaleCreditNote = new pages.SaleCreditNote(driver);
        

    TestModellerLogger.SetLastNodeGuid("41f6f46c-f112-4637-917e-dbdc89c9bae5");
    _SaleCreditNote.Click_SalesTab();
        
        pages.banking.ashiv.Repeat_Invoice _Repeat_Invoice = new  pages.banking.ashiv.Repeat_Invoice(driver);

    TestModellerLogger.SetLastNodeGuid("c151a6a7-f304-4d5f-be5b-c3c07fd0bf8c");
    _Repeat_Invoice.Click_View_1();
    

    TestModellerLogger.SetLastNodeGuid("394c947a-245b-4589-9310-3d02182bcf0b");
    _Repeat_Invoice.Click_Repeat_Invoice_2();
    
        _Repeat_Invoice.AllVerifyFilters(data[9]);
        
        _Repeat_Invoice.AllVerifyFilters1(data[10]); 
        
  

    }
    
   
    @Test  (groups= {"Test_Repeat_Invoice","Test_Repeat_Invoice - Test Cases"})
    @TestModellerPath(guid = "eb210160-0381-42a7-b04b-f1b4909af9e1")
    public void GoToUrlClickView1ClickRepeatInvoice2ClickAddRepeatInvoice3PositiveSelectSelectCustomer4Positi_TC01() throws InvalidFormatException, InterruptedException, HeadlessException, IOException, AWTException
    {
    	
    	
   	 sTestCaseID="TC01_New Repeat Invoice";
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
        
        pages.SaleCreditNote _SaleCreditNote = new pages.SaleCreditNote(driver);
        

    TestModellerLogger.SetLastNodeGuid("41f6f46c-f112-4637-917e-dbdc89c9bae5");
    _SaleCreditNote.Click_SalesTab();
        
        pages.banking.ashiv.Repeat_Invoice _Repeat_Invoice = new  pages.banking.ashiv.Repeat_Invoice(driver);

    TestModellerLogger.SetLastNodeGuid("c151a6a7-f304-4d5f-be5b-c3c07fd0bf8c");
    _Repeat_Invoice.Click_View_1();
    

    TestModellerLogger.SetLastNodeGuid("394c947a-245b-4589-9310-3d02182bcf0b");
    _Repeat_Invoice.Click_Repeat_Invoice_2();
    

       TestModellerLogger.SetLastNodeGuid("d9ba9b36-8311-4a59-9152-1a3d2921f4e3");
      _Repeat_Invoice.Click_Add_Repeat_Invoice_3();

        _Repeat_Invoice.IncomeType();
        
  

    }
    
    @Test  (groups= {"Test_Repeat_Invoice","Test_Repeat_Invoice - Test Cases"})
    @TestModellerPath(guid = "eb210160-0381-42a7-b04b-f1b4909af9e1")
    public void GoToUrlClickView1ClickRepeatInvoice2ClickAddRepeatInvoice3PositiveSelectSelectCustomer4Positi_TC02() throws InvalidFormatException, InterruptedException, HeadlessException, IOException, AWTException
    {
    	
    	
   	 sTestCaseID="TC01_New Repeat Invoice";
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
        
        pages.SaleCreditNote _SaleCreditNote = new pages.SaleCreditNote(driver);
        

    TestModellerLogger.SetLastNodeGuid("41f6f46c-f112-4637-917e-dbdc89c9bae5");
    _SaleCreditNote.Click_SalesTab();
        
        pages.banking.ashiv.Repeat_Invoice _Repeat_Invoice = new  pages.banking.ashiv.Repeat_Invoice(driver);

    TestModellerLogger.SetLastNodeGuid("c151a6a7-f304-4d5f-be5b-c3c07fd0bf8c");
    _Repeat_Invoice.Click_View_1();
    

    TestModellerLogger.SetLastNodeGuid("394c947a-245b-4589-9310-3d02182bcf0b");
    _Repeat_Invoice.Click_Repeat_Invoice_2();
    

       TestModellerLogger.SetLastNodeGuid("d9ba9b36-8311-4a59-9152-1a3d2921f4e3");
      _Repeat_Invoice.Click_Add_Repeat_Invoice_3();
//    
//
      TestModellerLogger.SetLastNodeGuid("ccf70a83-8187-487b-b3a5-eceb4aac5534");
      _Repeat_Invoice.Select_Select_Customer_4(data[7]);
    

     TestModellerLogger.SetLastNodeGuid("6cf9bd87-f527-4624-af81-220e41a1c4a8");
      _Repeat_Invoice.Enter_EnterStartDate5(data[5]);
    
       TestModellerLogger.SetLastNodeGuid("346e921e-22de-475c-b126-1dbebe605082");
       _Repeat_Invoice.Enter_EnterEndDt6(data[6]);
//    
     //   _Repeat_Invoice.IncomeType();
        
      TestModellerLogger.SetLastNodeGuid("9cc49f34-1866-4f9d-9bea-5982a5ac68bc");
      _Repeat_Invoice.Select_Select_IncomeType_7(data[8]);
    
      _Repeat_Invoice.BlankDis_Screenshot();
      
//    TestModellerLogger.SetLastNodeGuid("f3a4bb1e-fc4f-4e15-9a7b-3b9c1a310aa7");
//    _Repeat_Invoice.Enter_Enter_Description_8("Testing");
//    
//
//    TestModellerLogger.SetLastNodeGuid("0f465ac6-f2e3-4f24-8ae7-e78786461337");
//    _Repeat_Invoice.Enter_EnterUnitPrice9("1000");
//    
//
//    TestModellerLogger.SetLastNodeGuid("942a7022-a179-4647-9703-dc3a3709ebcf");
//    _Repeat_Invoice.Enter_EnterQuantity10("2");
//    
//
//    TestModellerLogger.SetLastNodeGuid("d9663229-7722-4652-a445-16c996b94d02");
//    _Repeat_Invoice.Select_SelectVATRate11("No VAT");
//    
//
//    TestModellerLogger.SetLastNodeGuid("b144a919-adaa-4207-9409-4a5187a2a356");
//    _Repeat_Invoice.Click_Advance_12();
//    
//
//    TestModellerLogger.SetLastNodeGuid("57c1db67-0a8f-4544-a985-dc3a9f40b062");
//    _Repeat_Invoice.Select_SelectBank_13("Default Bank");
//    
//
//    
//
//    TestModellerLogger.SetLastNodeGuid("96b1019e-7ee1-4d1f-95fb-aa54cec8d337");
//    _Repeat_Invoice.Select_SelectFrequency16("Weekly");
//    
//
//
//    TestModellerLogger.SetLastNodeGuid("78800cd5-c273-4318-8b6c-211404dccc8c");
//    _Repeat_Invoice.Click_Save_22();
//    

//    Pages_Income.Repeat_Invoice_2 _Repeat_Invoice_2 = new Pages_Income.Repeat_Invoice_2(driver);
//    
//TestModellerLogger.SetLastNodeGuid("bd89ca1f-cde4-447f-93af-976edb6d3ef0");
//_Repeat_Invoice_2.Click_ThreeDot_1();
//
//
//TestModellerLogger.SetLastNodeGuid("1c7b2677-e278-4380-9064-be2dae7c6465");
//_Repeat_Invoice_2.Click_Copy_2();
//
//_Repeat_Invoice_2.Screenshot_Copy_Page();
//
//
//TestModellerLogger.SetLastNodeGuid("4c91ae49-e651-47d2-ab5b-532a50b59031");
//_Repeat_Invoice_2.Click_Save_2_6();
//
//_Repeat_Invoice_2.Screenshot_Copy_Page_Suss_Msg();
//TestModellerLogger.SetLastNodeGuid("f08aecce-b6b7-4bbf-a12e-87f6f4309eb7");
//_Repeat_Invoice_2.Click_Edit_3();


//TestModellerLogger.SetLastNodeGuid("381e4814-ea6d-4357-94ae-b1579724b2b4");
//_Repeat_Invoice_2.Enter_Description_2_7("Ashiv");
//
//TestModellerLogger.SetLastNodeGuid("4c91ae49-e651-47d2-ab5b-532a50b59031");
//_Repeat_Invoice_2.Click_Save_2_6();
//
//
//TestModellerLogger.SetLastNodeGuid("efecdfc1-a74d-485c-84ac-265f9f696851");
//_Repeat_Invoice_2.Click_Delete_4_t0_8();
//
//
//TestModellerLogger.SetLastNodeGuid("8b47e0a3-2ec5-4cc5-9752-345b9ed36dd1");
//_Repeat_Invoice_2.Click_Delete_4_t0_8();

    }
    
    @Test  (groups= {"Test_Repeat_Invoice","Test_Repeat_Invoice - Test Cases"})
    @TestModellerPath(guid = "eb210160-0381-42a7-b04b-f1b4909af9e1")
    public void GoToUrlClickView1ClickRepeatInvoice2ClickAddRepeatInvoice3PositiveSelectSelectCustomer4Positi_TC03() throws InvalidFormatException, InterruptedException, HeadlessException, IOException, AWTException
    {
    	
    	
   	 sTestCaseID="TC01_New Repeat Invoice";
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
        
        pages.SaleCreditNote _SaleCreditNote = new pages.SaleCreditNote(driver);
        

    TestModellerLogger.SetLastNodeGuid("41f6f46c-f112-4637-917e-dbdc89c9bae5");
    _SaleCreditNote.Click_SalesTab();
        
        pages.banking.ashiv.Repeat_Invoice _Repeat_Invoice = new  pages.banking.ashiv.Repeat_Invoice(driver);

    TestModellerLogger.SetLastNodeGuid("c151a6a7-f304-4d5f-be5b-c3c07fd0bf8c");
    _Repeat_Invoice.Click_View_1();
    

    TestModellerLogger.SetLastNodeGuid("394c947a-245b-4589-9310-3d02182bcf0b");
    _Repeat_Invoice.Click_Repeat_Invoice_2();
    

       TestModellerLogger.SetLastNodeGuid("d9ba9b36-8311-4a59-9152-1a3d2921f4e3");
      _Repeat_Invoice.Click_Add_Repeat_Invoice_3();
//    
//
      TestModellerLogger.SetLastNodeGuid("ccf70a83-8187-487b-b3a5-eceb4aac5534");
      _Repeat_Invoice.Select_Select_Customer_4(data[7]);
    

     TestModellerLogger.SetLastNodeGuid("6cf9bd87-f527-4624-af81-220e41a1c4a8");
      _Repeat_Invoice.Enter_EnterStartDate5(data[5]);
    
       TestModellerLogger.SetLastNodeGuid("346e921e-22de-475c-b126-1dbebe605082");
       _Repeat_Invoice.Enter_EnterEndDt6(data[6]);
       
       _Repeat_Invoice.HighLightPlusBtn();
      
    
        
//      TestModellerLogger.SetLastNodeGuid("9cc49f34-1866-4f9d-9bea-5982a5ac68bc");
 //     _Repeat_Invoice.Select_Select_IncomeType_7(data[8]);
    
  
      
//    TestModellerLogger.SetLastNodeGuid("f3a4bb1e-fc4f-4e15-9a7b-3b9c1a310aa7");
//    _Repeat_Invoice.Enter_Enter_Description_8("Testing");
//    
//
//    TestModellerLogger.SetLastNodeGuid("0f465ac6-f2e3-4f24-8ae7-e78786461337");
//    _Repeat_Invoice.Enter_EnterUnitPrice9("1000");
//    
//
//    TestModellerLogger.SetLastNodeGuid("942a7022-a179-4647-9703-dc3a3709ebcf");
//    _Repeat_Invoice.Enter_EnterQuantity10("2");
//    
//
//    TestModellerLogger.SetLastNodeGuid("d9663229-7722-4652-a445-16c996b94d02");
//    _Repeat_Invoice.Select_SelectVATRate11("No VAT");
//    
//
//    TestModellerLogger.SetLastNodeGuid("b144a919-adaa-4207-9409-4a5187a2a356");
//    _Repeat_Invoice.Click_Advance_12();
//    
//
//    TestModellerLogger.SetLastNodeGuid("57c1db67-0a8f-4544-a985-dc3a9f40b062");
//    _Repeat_Invoice.Select_SelectBank_13("Default Bank");
//    
//
//    
//
//    TestModellerLogger.SetLastNodeGuid("96b1019e-7ee1-4d1f-95fb-aa54cec8d337");
//    _Repeat_Invoice.Select_SelectFrequency16("Weekly");
//    
//
//
//    TestModellerLogger.SetLastNodeGuid("78800cd5-c273-4318-8b6c-211404dccc8c");
//    _Repeat_Invoice.Click_Save_22();
//    

//    Pages_Income.Repeat_Invoice_2 _Repeat_Invoice_2 = new Pages_Income.Repeat_Invoice_2(driver);
//    
//TestModellerLogger.SetLastNodeGuid("bd89ca1f-cde4-447f-93af-976edb6d3ef0");
//_Repeat_Invoice_2.Click_ThreeDot_1();
//
//
//TestModellerLogger.SetLastNodeGuid("1c7b2677-e278-4380-9064-be2dae7c6465");
//_Repeat_Invoice_2.Click_Copy_2();
//
//_Repeat_Invoice_2.Screenshot_Copy_Page();
//
//
//TestModellerLogger.SetLastNodeGuid("4c91ae49-e651-47d2-ab5b-532a50b59031");
//_Repeat_Invoice_2.Click_Save_2_6();
//
//_Repeat_Invoice_2.Screenshot_Copy_Page_Suss_Msg();
//TestModellerLogger.SetLastNodeGuid("f08aecce-b6b7-4bbf-a12e-87f6f4309eb7");
//_Repeat_Invoice_2.Click_Edit_3();


//TestModellerLogger.SetLastNodeGuid("381e4814-ea6d-4357-94ae-b1579724b2b4");
//_Repeat_Invoice_2.Enter_Description_2_7("Ashiv");
//
//TestModellerLogger.SetLastNodeGuid("4c91ae49-e651-47d2-ab5b-532a50b59031");
//_Repeat_Invoice_2.Click_Save_2_6();
//
//
//TestModellerLogger.SetLastNodeGuid("efecdfc1-a74d-485c-84ac-265f9f696851");
//_Repeat_Invoice_2.Click_Delete_4_t0_8();
//
//
//TestModellerLogger.SetLastNodeGuid("8b47e0a3-2ec5-4cc5-9752-345b9ed36dd1");
//_Repeat_Invoice_2.Click_Delete_4_t0_8();

    }
    
    
    @Test  (groups= {"Test_Repeat_Invoice","Test_Repeat_Invoice - Test Cases"})
    @TestModellerPath(guid = "eb210160-0381-42a7-b04b-f1b4909af9e1")
    public void GoToUrlClickView1ClickRepeatInvoice2ClickAddRepeatInvoice3PositiveSelectSelectCustomer4Positi_TC04() throws InvalidFormatException, InterruptedException, HeadlessException, IOException, AWTException
    {
    	
    	
   	 sTestCaseID="TC01_New Repeat Invoice";
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
        
        pages.SaleCreditNote _SaleCreditNote = new pages.SaleCreditNote(driver);
        

    TestModellerLogger.SetLastNodeGuid("41f6f46c-f112-4637-917e-dbdc89c9bae5");
    _SaleCreditNote.Click_SalesTab();
        
        pages.banking.ashiv.Repeat_Invoice _Repeat_Invoice = new  pages.banking.ashiv.Repeat_Invoice(driver);

    TestModellerLogger.SetLastNodeGuid("c151a6a7-f304-4d5f-be5b-c3c07fd0bf8c");
    _Repeat_Invoice.Click_View_1();
    

    TestModellerLogger.SetLastNodeGuid("394c947a-245b-4589-9310-3d02182bcf0b");
    _Repeat_Invoice.Click_Repeat_Invoice_2();
    

       TestModellerLogger.SetLastNodeGuid("d9ba9b36-8311-4a59-9152-1a3d2921f4e3");
      _Repeat_Invoice.Click_Add_Repeat_Invoice_3();
//    
      _Repeat_Invoice.NewIComeType("Cis");
//
      TestModellerLogger.SetLastNodeGuid("ccf70a83-8187-487b-b3a5-eceb4aac5534");
      _Repeat_Invoice.Select_Select_Customer_4(data[7]);
    

     TestModellerLogger.SetLastNodeGuid("6cf9bd87-f527-4624-af81-220e41a1c4a8");
      _Repeat_Invoice.Enter_EnterStartDate5(data[5]);
    
       TestModellerLogger.SetLastNodeGuid("346e921e-22de-475c-b126-1dbebe605082");
       _Repeat_Invoice.Enter_EnterEndDt6(data[6]);
       
       
    		
      
    
        
//      TestModellerLogger.SetLastNodeGuid("9cc49f34-1866-4f9d-9bea-5982a5ac68bc");
 //     _Repeat_Invoice.Select_Select_IncomeType_7(data[8]);
    
  
      
//    TestModellerLogger.SetLastNodeGuid("f3a4bb1e-fc4f-4e15-9a7b-3b9c1a310aa7");
//    _Repeat_Invoice.Enter_Enter_Description_8("Testing");
//    
//
//    TestModellerLogger.SetLastNodeGuid("0f465ac6-f2e3-4f24-8ae7-e78786461337");
//    _Repeat_Invoice.Enter_EnterUnitPrice9("1000");
//    
//
//    TestModellerLogger.SetLastNodeGuid("942a7022-a179-4647-9703-dc3a3709ebcf");
//    _Repeat_Invoice.Enter_EnterQuantity10("2");
//    
//
//    TestModellerLogger.SetLastNodeGuid("d9663229-7722-4652-a445-16c996b94d02");
//    _Repeat_Invoice.Select_SelectVATRate11("No VAT");
//    
//
//    TestModellerLogger.SetLastNodeGuid("b144a919-adaa-4207-9409-4a5187a2a356");
//    _Repeat_Invoice.Click_Advance_12();
//    
//
//    TestModellerLogger.SetLastNodeGuid("57c1db67-0a8f-4544-a985-dc3a9f40b062");
//    _Repeat_Invoice.Select_SelectBank_13("Default Bank");
//    
//
//    
//
//    TestModellerLogger.SetLastNodeGuid("96b1019e-7ee1-4d1f-95fb-aa54cec8d337");
//    _Repeat_Invoice.Select_SelectFrequency16("Weekly");
//    
//
//
//    TestModellerLogger.SetLastNodeGuid("78800cd5-c273-4318-8b6c-211404dccc8c");
//    _Repeat_Invoice.Click_Save_22();
//    

//    Pages_Income.Repeat_Invoice_2 _Repeat_Invoice_2 = new Pages_Income.Repeat_Invoice_2(driver);
//    
//TestModellerLogger.SetLastNodeGuid("bd89ca1f-cde4-447f-93af-976edb6d3ef0");
//_Repeat_Invoice_2.Click_ThreeDot_1();
//
//
//TestModellerLogger.SetLastNodeGuid("1c7b2677-e278-4380-9064-be2dae7c6465");
//_Repeat_Invoice_2.Click_Copy_2();
//
//_Repeat_Invoice_2.Screenshot_Copy_Page();
//
//
//TestModellerLogger.SetLastNodeGuid("4c91ae49-e651-47d2-ab5b-532a50b59031");
//_Repeat_Invoice_2.Click_Save_2_6();
//
//_Repeat_Invoice_2.Screenshot_Copy_Page_Suss_Msg();
//TestModellerLogger.SetLastNodeGuid("f08aecce-b6b7-4bbf-a12e-87f6f4309eb7");
//_Repeat_Invoice_2.Click_Edit_3();


//TestModellerLogger.SetLastNodeGuid("381e4814-ea6d-4357-94ae-b1579724b2b4");
//_Repeat_Invoice_2.Enter_Description_2_7("Ashiv");
//
//TestModellerLogger.SetLastNodeGuid("4c91ae49-e651-47d2-ab5b-532a50b59031");
//_Repeat_Invoice_2.Click_Save_2_6();
//
//
//TestModellerLogger.SetLastNodeGuid("efecdfc1-a74d-485c-84ac-265f9f696851");
//_Repeat_Invoice_2.Click_Delete_4_t0_8();
//
//
//TestModellerLogger.SetLastNodeGuid("8b47e0a3-2ec5-4cc5-9752-345b9ed36dd1");
//_Repeat_Invoice_2.Click_Delete_4_t0_8();

    }
    @Test  (groups= {"Test_Repeat_Invoice","Test_Repeat_Invoice - Test Cases"})
    @TestModellerPath(guid = "eb210160-0381-42a7-b04b-f1b4909af9e1")
    public void GoToUrlClickView1ClickRepeatInvoice2ClickAddRepeatInvoice3PositiveSelectSelectCustomer4Positi_TC05() throws InvalidFormatException, InterruptedException, HeadlessException, IOException, AWTException
    {
    	
    	
   	 sTestCaseID="TC01_New Repeat Invoice";
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
        
        pages.SaleCreditNote _SaleCreditNote = new pages.SaleCreditNote(driver);
        

    TestModellerLogger.SetLastNodeGuid("41f6f46c-f112-4637-917e-dbdc89c9bae5");
    _SaleCreditNote.Click_SalesTab();
        
        pages.banking.ashiv.Repeat_Invoice _Repeat_Invoice = new  pages.banking.ashiv.Repeat_Invoice(driver);

    TestModellerLogger.SetLastNodeGuid("c151a6a7-f304-4d5f-be5b-c3c07fd0bf8c");
    _Repeat_Invoice.Click_View_1();
    

    TestModellerLogger.SetLastNodeGuid("394c947a-245b-4589-9310-3d02182bcf0b");
    _Repeat_Invoice.Click_Repeat_Invoice_2();
    

       TestModellerLogger.SetLastNodeGuid("d9ba9b36-8311-4a59-9152-1a3d2921f4e3");
      _Repeat_Invoice.Click_Add_Repeat_Invoice_3();
//    
//
      TestModellerLogger.SetLastNodeGuid("ccf70a83-8187-487b-b3a5-eceb4aac5534");
      _Repeat_Invoice.Select_Select_Customer_4(data[7]);
    

     TestModellerLogger.SetLastNodeGuid("6cf9bd87-f527-4624-af81-220e41a1c4a8");
      _Repeat_Invoice.Enter_EnterStartDate5(data[5]);
    
       TestModellerLogger.SetLastNodeGuid("346e921e-22de-475c-b126-1dbebe605082");
       _Repeat_Invoice.Enter_EnterEndDt6(data[6]);
       

    		
      
    
        
      TestModellerLogger.SetLastNodeGuid("9cc49f34-1866-4f9d-9bea-5982a5ac68bc");
      _Repeat_Invoice.Select_Select_IncomeType_7(data[8]);
    
  
      
   TestModellerLogger.SetLastNodeGuid("f3a4bb1e-fc4f-4e15-9a7b-3b9c1a310aa7");
    _Repeat_Invoice.Enter_Enter_Description_8("Testing");
//    
//
       TestModellerLogger.SetLastNodeGuid("0f465ac6-f2e3-4f24-8ae7-e78786461337");
      _Repeat_Invoice.Enter_EnterUnitPrice9("1000");
    

      TestModellerLogger.SetLastNodeGuid("942a7022-a179-4647-9703-dc3a3709ebcf");
      _Repeat_Invoice.Enter_EnterQuantity10("2");
   
      _Repeat_Invoice.multiply();
      
//    TestModellerLogger.SetLastNodeGuid("d9663229-7722-4652-a445-16c996b94d02");
//    _Repeat_Invoice.Select_SelectVATRate11("No VAT");
//    
//
//    TestModellerLogger.SetLastNodeGuid("b144a919-adaa-4207-9409-4a5187a2a356");
//    _Repeat_Invoice.Click_Advance_12();
//    
//
//    TestModellerLogger.SetLastNodeGuid("57c1db67-0a8f-4544-a985-dc3a9f40b062");
//    _Repeat_Invoice.Select_SelectBank_13("Default Bank");
//    
//
//    
//
//    TestModellerLogger.SetLastNodeGuid("96b1019e-7ee1-4d1f-95fb-aa54cec8d337");
//    _Repeat_Invoice.Select_SelectFrequency16("Weekly");
//    
//
//
//    TestModellerLogger.SetLastNodeGuid("78800cd5-c273-4318-8b6c-211404dccc8c");
//    _Repeat_Invoice.Click_Save_22();
//    

//    Pages_Income.Repeat_Invoice_2 _Repeat_Invoice_2 = new Pages_Income.Repeat_Invoice_2(driver);
//    
//TestModellerLogger.SetLastNodeGuid("bd89ca1f-cde4-447f-93af-976edb6d3ef0");
//_Repeat_Invoice_2.Click_ThreeDot_1();
//
//
//TestModellerLogger.SetLastNodeGuid("1c7b2677-e278-4380-9064-be2dae7c6465");
//_Repeat_Invoice_2.Click_Copy_2();
//
//_Repeat_Invoice_2.Screenshot_Copy_Page();
//
//
//TestModellerLogger.SetLastNodeGuid("4c91ae49-e651-47d2-ab5b-532a50b59031");
//_Repeat_Invoice_2.Click_Save_2_6();
//
//_Repeat_Invoice_2.Screenshot_Copy_Page_Suss_Msg();
//TestModellerLogger.SetLastNodeGuid("f08aecce-b6b7-4bbf-a12e-87f6f4309eb7");
//_Repeat_Invoice_2.Click_Edit_3();


//TestModellerLogger.SetLastNodeGuid("381e4814-ea6d-4357-94ae-b1579724b2b4");
//_Repeat_Invoice_2.Enter_Description_2_7("Ashiv");
//
//TestModellerLogger.SetLastNodeGuid("4c91ae49-e651-47d2-ab5b-532a50b59031");
//_Repeat_Invoice_2.Click_Save_2_6();
//
//
//TestModellerLogger.SetLastNodeGuid("efecdfc1-a74d-485c-84ac-265f9f696851");
//_Repeat_Invoice_2.Click_Delete_4_t0_8();
//
//
//TestModellerLogger.SetLastNodeGuid("8b47e0a3-2ec5-4cc5-9752-345b9ed36dd1");
//_Repeat_Invoice_2.Click_Delete_4_t0_8();

    }
    
    @Test  (groups= {"Test_Repeat_Invoice","Test_Repeat_Invoice - Test Cases"})
    @TestModellerPath(guid = "eb210160-0381-42a7-b04b-f1b4909af9e1")
    public void GoToUrlClickView1ClickRepeatInvoice2ClickAddRepeatInvoice3PositiveSelectSelectCustomer4Positi_TC06() throws InvalidFormatException, InterruptedException, HeadlessException, IOException, AWTException
    {
    	
    	
   	 sTestCaseID="TC01_New Repeat Invoice";
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
        
        pages.SaleCreditNote _SaleCreditNote = new pages.SaleCreditNote(driver);
        

    TestModellerLogger.SetLastNodeGuid("41f6f46c-f112-4637-917e-dbdc89c9bae5");
    _SaleCreditNote.Click_SalesTab();
        
        pages.banking.ashiv.Repeat_Invoice _Repeat_Invoice = new  pages.banking.ashiv.Repeat_Invoice(driver);

    TestModellerLogger.SetLastNodeGuid("c151a6a7-f304-4d5f-be5b-c3c07fd0bf8c");
    _Repeat_Invoice.Click_View_1();
    

    TestModellerLogger.SetLastNodeGuid("394c947a-245b-4589-9310-3d02182bcf0b");
    _Repeat_Invoice.Click_Repeat_Invoice_2();
    

       TestModellerLogger.SetLastNodeGuid("d9ba9b36-8311-4a59-9152-1a3d2921f4e3");
      _Repeat_Invoice.Click_Add_Repeat_Invoice_3();
//    
//
      TestModellerLogger.SetLastNodeGuid("ccf70a83-8187-487b-b3a5-eceb4aac5534");
      _Repeat_Invoice.Select_Select_Customer_4(data[7]);
    

     TestModellerLogger.SetLastNodeGuid("6cf9bd87-f527-4624-af81-220e41a1c4a8");
      _Repeat_Invoice.Enter_EnterStartDate5(data[5]);
    
       TestModellerLogger.SetLastNodeGuid("346e921e-22de-475c-b126-1dbebe605082");
       _Repeat_Invoice.Enter_EnterEndDt6(data[6]);
       

    		
      
    
        
      TestModellerLogger.SetLastNodeGuid("9cc49f34-1866-4f9d-9bea-5982a5ac68bc");
      _Repeat_Invoice.Select_Select_IncomeType_7(data[8]);
    
  
      
   TestModellerLogger.SetLastNodeGuid("f3a4bb1e-fc4f-4e15-9a7b-3b9c1a310aa7");
    _Repeat_Invoice.Enter_Enter_Description_8("Testing");
//    
//
       TestModellerLogger.SetLastNodeGuid("0f465ac6-f2e3-4f24-8ae7-e78786461337");
      _Repeat_Invoice.Enter_EnterUnitPrice9("1");
    

      TestModellerLogger.SetLastNodeGuid("942a7022-a179-4647-9703-dc3a3709ebcf");
      _Repeat_Invoice.Enter_EnterQuantity10("2000");
   
      _Repeat_Invoice.multiply2();
      
      TestModellerLogger.SetLastNodeGuid("0f465ac6-f2e3-4f24-8ae7-e78786461337");
      _Repeat_Invoice.Enter_EnterUnitPrice9("0");
    

      TestModellerLogger.SetLastNodeGuid("942a7022-a179-4647-9703-dc3a3709ebcf");
      _Repeat_Invoice.Enter_EnterQuantity10("0");
      
      
      TestModellerLogger.SetLastNodeGuid("78800cd5-c273-4318-8b6c-211404dccc8c");
      _Repeat_Invoice.Click_Save_22();
//    
    _Repeat_Invoice.PriceEnterZeno();


    }
    
   

    
    
    @Test  (groups= {"Test_Repeat_Invoice","Test_Repeat_Invoice - Test Cases"})
    @TestModellerPath(guid = "eb210160-0381-42a7-b04b-f1b4909af9e1")
    public void GoToUrlClickView1ClickRepeatInvoice2ClickAddRepeatInvoice3PositiveSelectSelectCustomer4Positi_TC07() throws InvalidFormatException, InterruptedException, HeadlessException, IOException, AWTException
    {
    	
    	
   	 sTestCaseID="TC01_New Repeat Invoice";
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
        
        pages.SaleCreditNote _SaleCreditNote = new pages.SaleCreditNote(driver);
        

    TestModellerLogger.SetLastNodeGuid("41f6f46c-f112-4637-917e-dbdc89c9bae5");
    _SaleCreditNote.Click_SalesTab();
        
        pages.banking.ashiv.Repeat_Invoice _Repeat_Invoice = new  pages.banking.ashiv.Repeat_Invoice(driver);

    TestModellerLogger.SetLastNodeGuid("c151a6a7-f304-4d5f-be5b-c3c07fd0bf8c");
    _Repeat_Invoice.Click_View_1();
    

    TestModellerLogger.SetLastNodeGuid("394c947a-245b-4589-9310-3d02182bcf0b");
    _Repeat_Invoice.Click_Repeat_Invoice_2();
    

       TestModellerLogger.SetLastNodeGuid("d9ba9b36-8311-4a59-9152-1a3d2921f4e3");
      _Repeat_Invoice.Click_Add_Repeat_Invoice_3();
//    
//
      TestModellerLogger.SetLastNodeGuid("ccf70a83-8187-487b-b3a5-eceb4aac5534");
      _Repeat_Invoice.Select_Select_Customer_4(data[7]);
    

     TestModellerLogger.SetLastNodeGuid("6cf9bd87-f527-4624-af81-220e41a1c4a8");
      _Repeat_Invoice.Enter_EnterStartDate5(data[5]);
    
       TestModellerLogger.SetLastNodeGuid("346e921e-22de-475c-b126-1dbebe605082");
       _Repeat_Invoice.Enter_EnterEndDt6(data[6]);
       

    		
      
    
        
      TestModellerLogger.SetLastNodeGuid("9cc49f34-1866-4f9d-9bea-5982a5ac68bc");
      _Repeat_Invoice.Select_Select_IncomeType_7(data[8]);
    
  
      
   TestModellerLogger.SetLastNodeGuid("f3a4bb1e-fc4f-4e15-9a7b-3b9c1a310aa7");
    _Repeat_Invoice.Enter_Enter_Description_8("Testing");
//    
//
       TestModellerLogger.SetLastNodeGuid("0f465ac6-f2e3-4f24-8ae7-e78786461337");
      _Repeat_Invoice.Enter_EnterUnitPrice9("1000");
    

      TestModellerLogger.SetLastNodeGuid("942a7022-a179-4647-9703-dc3a3709ebcf");
      _Repeat_Invoice.Enter_EnterQuantity10("1");
   
      _Repeat_Invoice.Discount("5");
      
      TestModellerLogger.SetLastNodeGuid("d9663229-7722-4652-a445-16c996b94d02");
      _Repeat_Invoice.Select_SelectVATRate11("No VAT");
    
      _Repeat_Invoice.DiscountScreenshot();
      
//
//    TestModellerLogger.SetLastNodeGuid("b144a919-adaa-4207-9409-4a5187a2a356");
//    _Repeat_Invoice.Click_Advance_12();
//    
//
//    TestModellerLogger.SetLastNodeGuid("57c1db67-0a8f-4544-a985-dc3a9f40b062");
//    _Repeat_Invoice.Select_SelectBank_13("Default Bank");
//    
//
//    
//
//    TestModellerLogger.SetLastNodeGuid("96b1019e-7ee1-4d1f-95fb-aa54cec8d337");
//    _Repeat_Invoice.Select_SelectFrequency16("Weekly");
//    
//
//
   //   TestModellerLogger.SetLastNodeGuid("78800cd5-c273-4318-8b6c-211404dccc8c");
 //     _Repeat_Invoice.Click_Save_22();
//    
 


    }
    
    @Test  (groups= {"Test_Repeat_Invoice","Test_Repeat_Invoice - Test Cases"})
    @TestModellerPath(guid = "eb210160-0381-42a7-b04b-f1b4909af9e1")
    public void GoToUrlClickView1ClickRepeatInvoice2ClickAddRepeatInvoice3PositiveSelectSelectCustomer4Positi_TC08() throws InvalidFormatException, InterruptedException, HeadlessException, IOException, AWTException
    {
    	
    	
   	 sTestCaseID="TC01_New Repeat Invoice";
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
        
        pages.SaleCreditNote _SaleCreditNote = new pages.SaleCreditNote(driver);
        

    TestModellerLogger.SetLastNodeGuid("41f6f46c-f112-4637-917e-dbdc89c9bae5");
    _SaleCreditNote.Click_SalesTab();
        
        pages.banking.ashiv.Repeat_Invoice _Repeat_Invoice = new  pages.banking.ashiv.Repeat_Invoice(driver);

    TestModellerLogger.SetLastNodeGuid("c151a6a7-f304-4d5f-be5b-c3c07fd0bf8c");
    _Repeat_Invoice.Click_View_1();
    

    TestModellerLogger.SetLastNodeGuid("394c947a-245b-4589-9310-3d02182bcf0b");
    _Repeat_Invoice.Click_Repeat_Invoice_2();
    

       TestModellerLogger.SetLastNodeGuid("d9ba9b36-8311-4a59-9152-1a3d2921f4e3");
      _Repeat_Invoice.Click_Add_Repeat_Invoice_3();
//    
//
      TestModellerLogger.SetLastNodeGuid("ccf70a83-8187-487b-b3a5-eceb4aac5534");
      _Repeat_Invoice.Select_Select_Customer_4(data[7]);
    

     TestModellerLogger.SetLastNodeGuid("6cf9bd87-f527-4624-af81-220e41a1c4a8");
      _Repeat_Invoice.Enter_EnterStartDate5(data[5]);
    
       TestModellerLogger.SetLastNodeGuid("346e921e-22de-475c-b126-1dbebe605082");
       _Repeat_Invoice.Enter_EnterEndDt6(data[6]);
       

    		
      
    
        
      TestModellerLogger.SetLastNodeGuid("9cc49f34-1866-4f9d-9bea-5982a5ac68bc");
      _Repeat_Invoice.Select_Select_IncomeType_7("CIS");
    
  
      
   TestModellerLogger.SetLastNodeGuid("f3a4bb1e-fc4f-4e15-9a7b-3b9c1a310aa7");
    _Repeat_Invoice.Enter_Enter_Description_8("Testing");
//    
//
       TestModellerLogger.SetLastNodeGuid("0f465ac6-f2e3-4f24-8ae7-e78786461337");
      _Repeat_Invoice.Enter_EnterUnitPrice9("1000");
    

      TestModellerLogger.SetLastNodeGuid("942a7022-a179-4647-9703-dc3a3709ebcf");
      _Repeat_Invoice.Enter_EnterQuantity10("1");
   
      _Repeat_Invoice.Discount("5");
      
      TestModellerLogger.SetLastNodeGuid("d9663229-7722-4652-a445-16c996b94d02");
      _Repeat_Invoice.Select_SelectVATRate11("No VAT");
    
      _Repeat_Invoice.CISScreenshot();
      
//
//    TestModellerLogger.SetLastNodeGuid("b144a919-adaa-4207-9409-4a5187a2a356");
//    _Repeat_Invoice.Click_Advance_12();
//    
//
//    TestModellerLogger.SetLastNodeGuid("57c1db67-0a8f-4544-a985-dc3a9f40b062");
//    _Repeat_Invoice.Select_SelectBank_13("Default Bank");
//    
//
//    
//
//    TestModellerLogger.SetLastNodeGuid("96b1019e-7ee1-4d1f-95fb-aa54cec8d337");
//    _Repeat_Invoice.Select_SelectFrequency16("Weekly");
//    
//
//
   //   TestModellerLogger.SetLastNodeGuid("78800cd5-c273-4318-8b6c-211404dccc8c");
 //     _Repeat_Invoice.Click_Save_22();
//    
 


    }
    
    @Test  (groups= {"Test_Repeat_Invoice","Test_Repeat_Invoice - Test Cases"})
    @TestModellerPath(guid = "eb210160-0381-42a7-b04b-f1b4909af9e1")
    public void GoToUrlClickView1ClickRepeatInvoice2ClickAddRepeatInvoice3PositiveSelectSelectCustomer4Positi_TC09() throws InvalidFormatException, InterruptedException, HeadlessException, IOException, AWTException
    {
    	
    	
   	 sTestCaseID="TC01_New Repeat Invoice";
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
        
        pages.SaleCreditNote _SaleCreditNote = new pages.SaleCreditNote(driver);
        

    TestModellerLogger.SetLastNodeGuid("41f6f46c-f112-4637-917e-dbdc89c9bae5");
    _SaleCreditNote.Click_SalesTab();
        
        pages.banking.ashiv.Repeat_Invoice _Repeat_Invoice = new  pages.banking.ashiv.Repeat_Invoice(driver);

    TestModellerLogger.SetLastNodeGuid("c151a6a7-f304-4d5f-be5b-c3c07fd0bf8c");
    _Repeat_Invoice.Click_View_1();
    

    TestModellerLogger.SetLastNodeGuid("394c947a-245b-4589-9310-3d02182bcf0b");
    _Repeat_Invoice.Click_Repeat_Invoice_2();
    

       TestModellerLogger.SetLastNodeGuid("d9ba9b36-8311-4a59-9152-1a3d2921f4e3");
      _Repeat_Invoice.Click_Add_Repeat_Invoice_3();
//    
//
      TestModellerLogger.SetLastNodeGuid("ccf70a83-8187-487b-b3a5-eceb4aac5534");
      _Repeat_Invoice.Select_Select_Customer_4(data[7]);
    

     TestModellerLogger.SetLastNodeGuid("6cf9bd87-f527-4624-af81-220e41a1c4a8");
      _Repeat_Invoice.Enter_EnterStartDate5(data[5]);
    
       TestModellerLogger.SetLastNodeGuid("346e921e-22de-475c-b126-1dbebe605082");
       _Repeat_Invoice.Enter_EnterEndDt6(data[6]);
       

    		
      
    
        
      TestModellerLogger.SetLastNodeGuid("9cc49f34-1866-4f9d-9bea-5982a5ac68bc");
      _Repeat_Invoice.Select_Select_IncomeType_7(data[8]);
    
  
      
   TestModellerLogger.SetLastNodeGuid("f3a4bb1e-fc4f-4e15-9a7b-3b9c1a310aa7");
    _Repeat_Invoice.Enter_Enter_Description_8("Testing");
//    
//
       TestModellerLogger.SetLastNodeGuid("0f465ac6-f2e3-4f24-8ae7-e78786461337");
      _Repeat_Invoice.Enter_EnterUnitPrice9("1000");
    

      TestModellerLogger.SetLastNodeGuid("942a7022-a179-4647-9703-dc3a3709ebcf");
      _Repeat_Invoice.Enter_EnterQuantity10("1");
   
 
      _Repeat_Invoice.DefaultNoVatScreenshot();
      
      TestModellerLogger.SetLastNodeGuid("d9663229-7722-4652-a445-16c996b94d02");
      _Repeat_Invoice.Select_SelectVATRate11("Standard Rate");
    
   _Repeat_Invoice.SelectVatRateScreenshot();
      
   //   TestModellerLogger.SetLastNodeGuid("d9663229-7722-4652-a445-16c996b94d02");
   //   _Repeat_Invoice.Select_SelectVATRate11("No VAT");
    
   
      
//
//    TestModellerLogger.SetLastNodeGuid("b144a919-adaa-4207-9409-4a5187a2a356");
//    _Repeat_Invoice.Click_Advance_12();
//    
//
//    TestModellerLogger.SetLastNodeGuid("57c1db67-0a8f-4544-a985-dc3a9f40b062");
//    _Repeat_Invoice.Select_SelectBank_13("Default Bank");
//    
//
//    
//
//    TestModellerLogger.SetLastNodeGuid("96b1019e-7ee1-4d1f-95fb-aa54cec8d337");
//    _Repeat_Invoice.Select_SelectFrequency16("Weekly");
//    
//
//
   //   TestModellerLogger.SetLastNodeGuid("78800cd5-c273-4318-8b6c-211404dccc8c");
 //     _Repeat_Invoice.Click_Save_22();
//    
 


    }
   
    
    @Test  (groups= {"Test_Repeat_Invoice","Test_Repeat_Invoice - Test Cases"})
    @TestModellerPath(guid = "eb210160-0381-42a7-b04b-f1b4909af9e1")
    public void GoToUrlClickView1ClickRepeatInvoice2ClickAddRepeatInvoice3PositiveSelectSelectCustomer4Positi_TC10() throws InvalidFormatException, InterruptedException, HeadlessException, IOException, AWTException
    {
    	
    	
   	 sTestCaseID="TC01_New Repeat Invoice";
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
        
        pages.SaleCreditNote _SaleCreditNote = new pages.SaleCreditNote(driver);
        

    TestModellerLogger.SetLastNodeGuid("41f6f46c-f112-4637-917e-dbdc89c9bae5");
    _SaleCreditNote.Click_SalesTab();
        
        pages.banking.ashiv.Repeat_Invoice _Repeat_Invoice = new  pages.banking.ashiv.Repeat_Invoice(driver);

    TestModellerLogger.SetLastNodeGuid("c151a6a7-f304-4d5f-be5b-c3c07fd0bf8c");
    _Repeat_Invoice.Click_View_1();
    

    TestModellerLogger.SetLastNodeGuid("394c947a-245b-4589-9310-3d02182bcf0b");
    _Repeat_Invoice.Click_Repeat_Invoice_2();
    

       TestModellerLogger.SetLastNodeGuid("d9ba9b36-8311-4a59-9152-1a3d2921f4e3");
      _Repeat_Invoice.Click_Add_Repeat_Invoice_3();
//    
//
      TestModellerLogger.SetLastNodeGuid("ccf70a83-8187-487b-b3a5-eceb4aac5534");
      _Repeat_Invoice.Select_Select_Customer_4(data[7]);
    

     TestModellerLogger.SetLastNodeGuid("6cf9bd87-f527-4624-af81-220e41a1c4a8");
      _Repeat_Invoice.Enter_EnterStartDate5(data[5]);
    
       TestModellerLogger.SetLastNodeGuid("346e921e-22de-475c-b126-1dbebe605082");
       _Repeat_Invoice.Enter_EnterEndDt6(data[6]);
       

    		
      
    
        
      TestModellerLogger.SetLastNodeGuid("9cc49f34-1866-4f9d-9bea-5982a5ac68bc");
      _Repeat_Invoice.Select_Select_IncomeType_7(data[8]);
    
  
      
   TestModellerLogger.SetLastNodeGuid("f3a4bb1e-fc4f-4e15-9a7b-3b9c1a310aa7");
    _Repeat_Invoice.Enter_Enter_Description_8("Testing");
//    
//
       TestModellerLogger.SetLastNodeGuid("0f465ac6-f2e3-4f24-8ae7-e78786461337");
      _Repeat_Invoice.Enter_EnterUnitPrice9("1000");
    

      TestModellerLogger.SetLastNodeGuid("942a7022-a179-4647-9703-dc3a3709ebcf");
      _Repeat_Invoice.Enter_EnterQuantity10("1");
   
 
    
      
      TestModellerLogger.SetLastNodeGuid("d9663229-7722-4652-a445-16c996b94d02");
      _Repeat_Invoice.Select_SelectVATRate11("Standard Rate");
    
  _Repeat_Invoice.HighLightVat();
      
//
//    TestModellerLogger.SetLastNodeGuid("b144a919-adaa-4207-9409-4a5187a2a356");
//    _Repeat_Invoice.Click_Advance_12();
//    
//
//    TestModellerLogger.SetLastNodeGuid("57c1db67-0a8f-4544-a985-dc3a9f40b062");
//    _Repeat_Invoice.Select_SelectBank_13("Default Bank");
//    
//
//    
//
//    TestModellerLogger.SetLastNodeGuid("96b1019e-7ee1-4d1f-95fb-aa54cec8d337");
//    _Repeat_Invoice.Select_SelectFrequency16("Weekly");
//    
//
//
   //   TestModellerLogger.SetLastNodeGuid("78800cd5-c273-4318-8b6c-211404dccc8c");
 //     _Repeat_Invoice.Click_Save_22();
//    
 


    }
    
    @Test  (groups= {"Test_Repeat_Invoice","Test_Repeat_Invoice - Test Cases"})
    @TestModellerPath(guid = "eb210160-0381-42a7-b04b-f1b4909af9e1")
    public void GoToUrlClickView1ClickRepeatInvoice2ClickAddRepeatInvoice3PositiveSelectSelectCustomer4Positi_TC11() throws InvalidFormatException, InterruptedException, HeadlessException, IOException, AWTException
    {
    	
    	
   	 sTestCaseID="TC01_New Repeat Invoice";
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
        
        pages.SaleCreditNote _SaleCreditNote = new pages.SaleCreditNote(driver);
        

    TestModellerLogger.SetLastNodeGuid("41f6f46c-f112-4637-917e-dbdc89c9bae5");
    _SaleCreditNote.Click_SalesTab();
        
        pages.banking.ashiv.Repeat_Invoice _Repeat_Invoice = new  pages.banking.ashiv.Repeat_Invoice(driver);

    TestModellerLogger.SetLastNodeGuid("c151a6a7-f304-4d5f-be5b-c3c07fd0bf8c");
    _Repeat_Invoice.Click_View_1();
    

    TestModellerLogger.SetLastNodeGuid("394c947a-245b-4589-9310-3d02182bcf0b");
    _Repeat_Invoice.Click_Repeat_Invoice_2();
    

       TestModellerLogger.SetLastNodeGuid("d9ba9b36-8311-4a59-9152-1a3d2921f4e3");
      _Repeat_Invoice.Click_Add_Repeat_Invoice_3();
//    
//
      TestModellerLogger.SetLastNodeGuid("ccf70a83-8187-487b-b3a5-eceb4aac5534");
      _Repeat_Invoice.Select_Select_Customer_4(data[7]);
    

     TestModellerLogger.SetLastNodeGuid("6cf9bd87-f527-4624-af81-220e41a1c4a8");
      _Repeat_Invoice.Enter_EnterStartDate5(data[5]);
    
       TestModellerLogger.SetLastNodeGuid("346e921e-22de-475c-b126-1dbebe605082");
       _Repeat_Invoice.Enter_EnterEndDt6(data[6]);
       

    		
      
    
        
      TestModellerLogger.SetLastNodeGuid("9cc49f34-1866-4f9d-9bea-5982a5ac68bc");
      _Repeat_Invoice.Select_Select_IncomeType_7(data[8]);
    
  
      
   TestModellerLogger.SetLastNodeGuid("f3a4bb1e-fc4f-4e15-9a7b-3b9c1a310aa7");
    _Repeat_Invoice.Enter_Enter_Description_8("Testing");
//    
//
       TestModellerLogger.SetLastNodeGuid("0f465ac6-f2e3-4f24-8ae7-e78786461337");
      _Repeat_Invoice.Enter_EnterUnitPrice9("1000");
    

      TestModellerLogger.SetLastNodeGuid("942a7022-a179-4647-9703-dc3a3709ebcf");
      _Repeat_Invoice.Enter_EnterQuantity10("1");
   
 
    
      
      TestModellerLogger.SetLastNodeGuid("d9663229-7722-4652-a445-16c996b94d02");
      _Repeat_Invoice.Select_SelectVATRate11("Standard Rate");
    
  _Repeat_Invoice.HighLightDeleteLine();
      
//
//    TestModellerLogger.SetLastNodeGuid("b144a919-adaa-4207-9409-4a5187a2a356");
//    _Repeat_Invoice.Click_Advance_12();
//    
//
//    TestModellerLogger.SetLastNodeGuid("57c1db67-0a8f-4544-a985-dc3a9f40b062");
//    _Repeat_Invoice.Select_SelectBank_13("Default Bank");
//    
//
//    
//
//    TestModellerLogger.SetLastNodeGuid("96b1019e-7ee1-4d1f-95fb-aa54cec8d337");
//    _Repeat_Invoice.Select_SelectFrequency16("Weekly");
//    
//
//
   //   TestModellerLogger.SetLastNodeGuid("78800cd5-c273-4318-8b6c-211404dccc8c");
 //     _Repeat_Invoice.Click_Save_22();
//    
 


    }
}

    