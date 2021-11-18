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
public class TestRepeatInvoice_TC01 extends TestBase
{
    
	public String sTestCaseID=null;
    String[] data=null;
    String Sheet = null;
    
    @Test  (groups= {"Test_Repeat_Invoice","Test_Repeat_Invoice - Test Cases"})
    @TestModellerPath(guid = "eb210160-0381-42a7-b04b-f1b4909af9e1")
    public void GoToUrlClickView1ClickRepeatInvoice2ClickAddRepeatInvoice3PositiveSelectSelectCustomer4PosititClickThreeDot1ClickCopy_TC01() throws InvalidFormatException, InterruptedException, HeadlessException, IOException, AWTException
    {
    	
    	
   	 sTestCaseID="TC01_Repeat Invoice";
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
        
        pages.banking.ashiv.Repeat_Invoice _Repeat_Invoice = new  pages.banking.ashiv.Repeat_Invoice(driver);
        
//    TestModellerLogger.SetLastNodeGuid("36f7dcf5-75c6-44ac-a870-2696de786c06");
//    _Repeat_Invoice.GoToUrl();
//    

    TestModellerLogger.SetLastNodeGuid("c151a6a7-f304-4d5f-be5b-c3c07fd0bf8c");
    _Repeat_Invoice.Click_View_1();
    

    TestModellerLogger.SetLastNodeGuid("394c947a-245b-4589-9310-3d02182bcf0b");
    _Repeat_Invoice.Click_Repeat_Invoice_2();
    

//    TestModellerLogger.SetLastNodeGuid("d9ba9b36-8311-4a59-9152-1a3d2921f4e3");
//    _Repeat_Invoice.Click_Add_Repeat_Invoice_3();
//    
//
//    TestModellerLogger.SetLastNodeGuid("ccf70a83-8187-487b-b3a5-eceb4aac5534");
//    _Repeat_Invoice.Select_Select_Customer_4("Invoices_001");
//    
//
//    TestModellerLogger.SetLastNodeGuid("6cf9bd87-f527-4624-af81-220e41a1c4a8");
//    _Repeat_Invoice.Enter_EnterStartDate5("25/10/2021");
//    
//
//    TestModellerLogger.SetLastNodeGuid("346e921e-22de-475c-b126-1dbebe605082");
//    _Repeat_Invoice.Enter_EnterEndDt6("25/11/2021");
//    
//
//    TestModellerLogger.SetLastNodeGuid("9cc49f34-1866-4f9d-9bea-5982a5ac68bc");
//    _Repeat_Invoice.Select_Select_IncomeType_7("Sale");
//    
//
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

    Pages_Income.Repeat_Invoice_2 _Repeat_Invoice_2 = new Pages_Income.Repeat_Invoice_2(driver);
    
TestModellerLogger.SetLastNodeGuid("bd89ca1f-cde4-447f-93af-976edb6d3ef0");
_Repeat_Invoice_2.Click_ThreeDot_1();


TestModellerLogger.SetLastNodeGuid("1c7b2677-e278-4380-9064-be2dae7c6465");
_Repeat_Invoice_2.Click_Copy_2();

_Repeat_Invoice_2.Screenshot_Copy_Page();


TestModellerLogger.SetLastNodeGuid("4c91ae49-e651-47d2-ab5b-532a50b59031");
_Repeat_Invoice_2.Click_Save_2_6();

_Repeat_Invoice_2.Screenshot_Copy_Page_Suss_Msg();
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
//    
    
    
    }

//    @Test  (groups= {"Test_Repeat_Invoice","Test_Repeat_Invoice - Test Cases"})
//    @TestModellerPath(guid = "0c8cf789-719f-41ee-bf44-dcbb64a5c8b4")
//    public void GoToUrlClickView1ClickRepeatInvoice2ClickAddRepeatInvoice3PositiveSelectSelectCustomer4Positiv1()
//    {
//        
//        pages.Repeat_Invoice _Repeat_Invoice = new pages.Repeat_Invoice(driver);
//    TestModellerLogger.SetLastNodeGuid("36f7dcf5-75c6-44ac-a870-2696de786c06");
//    _Repeat_Invoice.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("c151a6a7-f304-4d5f-be5b-c3c07fd0bf8c");
//    _Repeat_Invoice.Click_View_1();
//    
//
//    TestModellerLogger.SetLastNodeGuid("394c947a-245b-4589-9310-3d02182bcf0b");
//    _Repeat_Invoice.Click_Repeat_Invoice_2();
//    
//
//    TestModellerLogger.SetLastNodeGuid("d9ba9b36-8311-4a59-9152-1a3d2921f4e3");
//    _Repeat_Invoice.Click_Add_Repeat_Invoice_3();
//    
//
//    TestModellerLogger.SetLastNodeGuid("ccf70a83-8187-487b-b3a5-eceb4aac5534");
//    _Repeat_Invoice.Select_Select_Customer_4("Default Customer");
//    
//
//    TestModellerLogger.SetLastNodeGuid("6cf9bd87-f527-4624-af81-220e41a1c4a8");
//    _Repeat_Invoice.Enter_EnterStartDate5("44494");
//    
//
//    TestModellerLogger.SetLastNodeGuid("346e921e-22de-475c-b126-1dbebe605082");
//    _Repeat_Invoice.Enter_EnterEndDt6("3333");
//    
//
//    TestModellerLogger.SetLastNodeGuid("9cc49f34-1866-4f9d-9bea-5982a5ac68bc");
//    _Repeat_Invoice.Select_Select_IncomeType_7("Sale");
//    
//
//    TestModellerLogger.SetLastNodeGuid("f3a4bb1e-fc4f-4e15-9a7b-3b9c1a310aa7");
//    _Repeat_Invoice.Enter_Enter_Description_8("Earum quis reprehenderit aut veniam sed sed sequi placeat totam.
//Aspernatur autem natus aut culpa sequi asperiores sapiente.
//Aspernatur saepe neque sed accusantium.
//Tempore enim repellendus voluptas quaerat vel enim adipisci.
//In vitae cupiditate ullam velit soluta enim praesentium.
//Necessitatibus voluptatem consequatur architecto fugit eligendi.
//Possimus et possimus aut quae.
//At architecto unde.
//Aut quis nihil quia ipsam temporibus animi.
//Sunt dolores harum optio omnis facilis repellendus et omnis.");
//    
//
//    TestModellerLogger.SetLastNodeGuid("0f465ac6-f2e3-4f24-8ae7-e78786461337");
//    _Repeat_Invoice.Enter_EnterUnitPrice9("2222");
//    
//
//    TestModellerLogger.SetLastNodeGuid("942a7022-a179-4647-9703-dc3a3709ebcf");
//    _Repeat_Invoice.Enter_EnterQuantity10("222");
//    
//
//    TestModellerLogger.SetLastNodeGuid("d9663229-7722-4652-a445-16c996b94d02");
//    _Repeat_Invoice.Select_SelectVATRate11("Domestic Reverse Charge - 20%");
//    
//
//    TestModellerLogger.SetLastNodeGuid("b144a919-adaa-4207-9409-4a5187a2a356");
//    _Repeat_Invoice.Click_Advance_12();
//    
//
//    TestModellerLogger.SetLastNodeGuid("57c1db67-0a8f-4544-a985-dc3a9f40b062");
//    _Repeat_Invoice.Select_SelectBank_13("--Select Bank--");
//    
//
//    TestModellerLogger.SetLastNodeGuid("43633ce9-eaff-4a39-a50c-c3fd95d93092");
//    _Repeat_Invoice.Enter_EnterPaymentTerm14("33");
//    
//
//    TestModellerLogger.SetLastNodeGuid("54f5627c-8dbb-4f10-84c6-e00b55839dbd");
//    _Repeat_Invoice.Enter_EnterdueDays15("22");
//    
//
//    TestModellerLogger.SetLastNodeGuid("96b1019e-7ee1-4d1f-95fb-aa54cec8d337");
//    _Repeat_Invoice.Select_SelectFrequency16("Weekly");
//    
//
//    TestModellerLogger.SetLastNodeGuid("27abdf11-8e5b-45c6-a5d9-4f4ccef39557");
//    _Repeat_Invoice.Enter_EnterTotalOccurance17("3");
//    
//
//    TestModellerLogger.SetLastNodeGuid("8d0ae3ad-db66-4f85-8aba-3bbf2d18d724");
//    _Repeat_Invoice.Select_SelectInvoiceTemplate18("Simple Invoice Template");
//    
//
//    TestModellerLogger.SetLastNodeGuid("4b45015e-9988-46eb-b087-88b912eeaee2");
//    _Repeat_Invoice.Click_Click_AutoEmail_19();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5c3e9dcf-7bf5-4905-a7b7-2b0b0ca7ad09");
//    _Repeat_Invoice.Click_Click_NonVATInvoice_20();
//    
//
//    TestModellerLogger.SetLastNodeGuid("006b9ad8-5971-4737-922b-ec0a7fad3126");
//    _Repeat_Invoice.Click_Click_AutoProcess_21();
//    
//
//    TestModellerLogger.SetLastNodeGuid("78800cd5-c273-4318-8b6c-211404dccc8c");
//    _Repeat_Invoice.Click_Save_22();
//    
//
//    }
//
//    @Test  (groups= {"Test_Repeat_Invoice","Test_Repeat_Invoice - Test Cases"})
//    @TestModellerPath(guid = "468a29dc-f736-4d0f-b97f-12913aef5515")
//    public void GoToUrlClickView1ClickRepeatInvoice2ClickAddRepeatInvoice3PositiveSelectSelectCustomer4Positiv2()
//    {
//        
//        pages.Repeat_Invoice _Repeat_Invoice = new pages.Repeat_Invoice(driver);
//    TestModellerLogger.SetLastNodeGuid("36f7dcf5-75c6-44ac-a870-2696de786c06");
//    _Repeat_Invoice.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("c151a6a7-f304-4d5f-be5b-c3c07fd0bf8c");
//    _Repeat_Invoice.Click_View_1();
//    
//
//    TestModellerLogger.SetLastNodeGuid("394c947a-245b-4589-9310-3d02182bcf0b");
//    _Repeat_Invoice.Click_Repeat_Invoice_2();
//    
//
//    TestModellerLogger.SetLastNodeGuid("d9ba9b36-8311-4a59-9152-1a3d2921f4e3");
//    _Repeat_Invoice.Click_Add_Repeat_Invoice_3();
//    
//
//    TestModellerLogger.SetLastNodeGuid("ccf70a83-8187-487b-b3a5-eceb4aac5534");
//    _Repeat_Invoice.Select_Select_Customer_4("Invoices_001");
//    
//
//    TestModellerLogger.SetLastNodeGuid("6cf9bd87-f527-4624-af81-220e41a1c4a8");
//    _Repeat_Invoice.Enter_EnterStartDate5("44494");
//    
//
//    TestModellerLogger.SetLastNodeGuid("346e921e-22de-475c-b126-1dbebe605082");
//    _Repeat_Invoice.Enter_EnterEndDt6("3333");
//    
//
//    TestModellerLogger.SetLastNodeGuid("9cc49f34-1866-4f9d-9bea-5982a5ac68bc");
//    _Repeat_Invoice.Select_Select_IncomeType_7("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("f3a4bb1e-fc4f-4e15-9a7b-3b9c1a310aa7");
//    _Repeat_Invoice.Enter_Enter_Description_8("Impedit molestiae animi velit sunt tenetur quas voluptas.
//Enim nam ad incidunt qui placeat libero.
//Earum eaque adipisci in provident quia modi ut velit quod.
//At fugit explicabo.
//Commodi quia consequatur fuga non est minima.
//Nihil omnis ut nostrum amet ullam.
//Dolor rerum explicabo assumenda nulla.
//Similique quasi quia porro autem expedita.
//Non odio voluptates iusto numquam ab repudiandae accusantium dicta consequuntur.
//Ut distinctio similique quos voluptatem exercitationem sint eaque.");
//    
//
//    TestModellerLogger.SetLastNodeGuid("0f465ac6-f2e3-4f24-8ae7-e78786461337");
//    _Repeat_Invoice.Enter_EnterUnitPrice9("2222");
//    
//
//    TestModellerLogger.SetLastNodeGuid("942a7022-a179-4647-9703-dc3a3709ebcf");
//    _Repeat_Invoice.Enter_EnterQuantity10("222");
//    
//
//    TestModellerLogger.SetLastNodeGuid("d9663229-7722-4652-a445-16c996b94d02");
//    _Repeat_Invoice.Select_SelectVATRate11("Domestic Reverse Charge - 20%");
//    
//
//    TestModellerLogger.SetLastNodeGuid("b144a919-adaa-4207-9409-4a5187a2a356");
//    _Repeat_Invoice.Click_Advance_12();
//    
//
//    TestModellerLogger.SetLastNodeGuid("57c1db67-0a8f-4544-a985-dc3a9f40b062");
//    _Repeat_Invoice.Select_SelectBank_13("--Select Bank--");
//    
//
//    TestModellerLogger.SetLastNodeGuid("43633ce9-eaff-4a39-a50c-c3fd95d93092");
//    _Repeat_Invoice.Enter_EnterPaymentTerm14("33");
//    
//
//    TestModellerLogger.SetLastNodeGuid("54f5627c-8dbb-4f10-84c6-e00b55839dbd");
//    _Repeat_Invoice.Enter_EnterdueDays15("22");
//    
//
//    TestModellerLogger.SetLastNodeGuid("96b1019e-7ee1-4d1f-95fb-aa54cec8d337");
//    _Repeat_Invoice.Select_SelectFrequency16("Monthly");
//    
//
//    TestModellerLogger.SetLastNodeGuid("27abdf11-8e5b-45c6-a5d9-4f4ccef39557");
//    _Repeat_Invoice.Enter_EnterTotalOccurance17("3");
//    
//
//    TestModellerLogger.SetLastNodeGuid("8d0ae3ad-db66-4f85-8aba-3bbf2d18d724");
//    _Repeat_Invoice.Select_SelectInvoiceTemplate18("Simple Invoice Template");
//    
//
//    TestModellerLogger.SetLastNodeGuid("4b45015e-9988-46eb-b087-88b912eeaee2");
//    _Repeat_Invoice.Click_Click_AutoEmail_19();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5c3e9dcf-7bf5-4905-a7b7-2b0b0ca7ad09");
//    _Repeat_Invoice.Click_Click_NonVATInvoice_20();
//    
//
//    TestModellerLogger.SetLastNodeGuid("006b9ad8-5971-4737-922b-ec0a7fad3126");
//    _Repeat_Invoice.Click_Click_AutoProcess_21();
//    
//
//    TestModellerLogger.SetLastNodeGuid("78800cd5-c273-4318-8b6c-211404dccc8c");
//    _Repeat_Invoice.Click_Save_22();
//    
//
//    }
//
//    @Test  (groups= {"Test_Repeat_Invoice","Test_Repeat_Invoice - Test Cases"})
//    @TestModellerPath(guid = "de467d43-d787-424b-bb4b-bb5e7939d0cc")
//    public void GoToUrlClickView1ClickRepeatInvoice2ClickAddRepeatInvoice3PositiveSelectSelectCustomer4Positiv3()
//    {
//        
//        pages.Repeat_Invoice _Repeat_Invoice = new pages.Repeat_Invoice(driver);
//    TestModellerLogger.SetLastNodeGuid("36f7dcf5-75c6-44ac-a870-2696de786c06");
//    _Repeat_Invoice.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("c151a6a7-f304-4d5f-be5b-c3c07fd0bf8c");
//    _Repeat_Invoice.Click_View_1();
//    
//
//    TestModellerLogger.SetLastNodeGuid("394c947a-245b-4589-9310-3d02182bcf0b");
//    _Repeat_Invoice.Click_Repeat_Invoice_2();
//    
//
//    TestModellerLogger.SetLastNodeGuid("d9ba9b36-8311-4a59-9152-1a3d2921f4e3");
//    _Repeat_Invoice.Click_Add_Repeat_Invoice_3();
//    
//
//    TestModellerLogger.SetLastNodeGuid("ccf70a83-8187-487b-b3a5-eceb4aac5534");
//    _Repeat_Invoice.Select_Select_Customer_4("Invoices_001");
//    
//
//    TestModellerLogger.SetLastNodeGuid("6cf9bd87-f527-4624-af81-220e41a1c4a8");
//    _Repeat_Invoice.Enter_EnterStartDate5("44494");
//    
//
//    TestModellerLogger.SetLastNodeGuid("346e921e-22de-475c-b126-1dbebe605082");
//    _Repeat_Invoice.Enter_EnterEndDt6("3333");
//    
//
//    TestModellerLogger.SetLastNodeGuid("9cc49f34-1866-4f9d-9bea-5982a5ac68bc");
//    _Repeat_Invoice.Select_Select_IncomeType_7("Sale");
//    
//
//    TestModellerLogger.SetLastNodeGuid("f3a4bb1e-fc4f-4e15-9a7b-3b9c1a310aa7");
//    _Repeat_Invoice.Enter_Enter_Description_8("Non error sed omnis.
//Magnam eius autem dolores consectetur.
//Iste tenetur eum voluptatem voluptatem facilis quibusdam architecto eos eum.
//Explicabo illum ex quas.
//Eum beatae ab debitis.
//Suscipit velit sapiente est quia ratione sunt delectus eum.
//Necessitatibus saepe eius.
//Enim ad corporis tempora.
//Et nulla ut vero est totam.
//Ea nulla et reprehenderit porro.");
//    
//
//    TestModellerLogger.SetLastNodeGuid("0f465ac6-f2e3-4f24-8ae7-e78786461337");
//    _Repeat_Invoice.Enter_EnterUnitPrice9("2222");
//    
//
//    TestModellerLogger.SetLastNodeGuid("942a7022-a179-4647-9703-dc3a3709ebcf");
//    _Repeat_Invoice.Enter_EnterQuantity10("222");
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
//    _Repeat_Invoice.Select_SelectBank_13("--Select Bank--");
//    
//
//    TestModellerLogger.SetLastNodeGuid("43633ce9-eaff-4a39-a50c-c3fd95d93092");
//    _Repeat_Invoice.Enter_EnterPaymentTerm14("33");
//    
//
//    TestModellerLogger.SetLastNodeGuid("54f5627c-8dbb-4f10-84c6-e00b55839dbd");
//    _Repeat_Invoice.Enter_EnterdueDays15("22");
//    
//
//    TestModellerLogger.SetLastNodeGuid("96b1019e-7ee1-4d1f-95fb-aa54cec8d337");
//    _Repeat_Invoice.Select_SelectFrequency16("Quarterly");
//    
//
//    TestModellerLogger.SetLastNodeGuid("27abdf11-8e5b-45c6-a5d9-4f4ccef39557");
//    _Repeat_Invoice.Enter_EnterTotalOccurance17("3");
//    
//
//    TestModellerLogger.SetLastNodeGuid("8d0ae3ad-db66-4f85-8aba-3bbf2d18d724");
//    _Repeat_Invoice.Select_SelectInvoiceTemplate18("Simple Invoice Template");
//    
//
//    TestModellerLogger.SetLastNodeGuid("4b45015e-9988-46eb-b087-88b912eeaee2");
//    _Repeat_Invoice.Click_Click_AutoEmail_19();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5c3e9dcf-7bf5-4905-a7b7-2b0b0ca7ad09");
//    _Repeat_Invoice.Click_Click_NonVATInvoice_20();
//    
//
//    TestModellerLogger.SetLastNodeGuid("006b9ad8-5971-4737-922b-ec0a7fad3126");
//    _Repeat_Invoice.Click_Click_AutoProcess_21();
//    
//
//    TestModellerLogger.SetLastNodeGuid("78800cd5-c273-4318-8b6c-211404dccc8c");
//    _Repeat_Invoice.Click_Save_22();
//    
//
//    }
//
//    @Test  (groups= {"Test_Repeat_Invoice","Test_Repeat_Invoice - Test Cases"})
//    @TestModellerPath(guid = "da002c60-0478-47be-a4ab-78978f750a75")
//    public void GoToUrlClickView1ClickRepeatInvoice2ClickAddRepeatInvoice3PositiveSelectSelectCustomer4Positiv4()
//    {
//        
//        pages.Repeat_Invoice _Repeat_Invoice = new pages.Repeat_Invoice(driver);
//    TestModellerLogger.SetLastNodeGuid("36f7dcf5-75c6-44ac-a870-2696de786c06");
//    _Repeat_Invoice.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("c151a6a7-f304-4d5f-be5b-c3c07fd0bf8c");
//    _Repeat_Invoice.Click_View_1();
//    
//
//    TestModellerLogger.SetLastNodeGuid("394c947a-245b-4589-9310-3d02182bcf0b");
//    _Repeat_Invoice.Click_Repeat_Invoice_2();
//    
//
//    TestModellerLogger.SetLastNodeGuid("d9ba9b36-8311-4a59-9152-1a3d2921f4e3");
//    _Repeat_Invoice.Click_Add_Repeat_Invoice_3();
//    
//
//    TestModellerLogger.SetLastNodeGuid("ccf70a83-8187-487b-b3a5-eceb4aac5534");
//    _Repeat_Invoice.Select_Select_Customer_4("Invoices_001");
//    
//
//    TestModellerLogger.SetLastNodeGuid("6cf9bd87-f527-4624-af81-220e41a1c4a8");
//    _Repeat_Invoice.Enter_EnterStartDate5("44494");
//    
//
//    TestModellerLogger.SetLastNodeGuid("346e921e-22de-475c-b126-1dbebe605082");
//    _Repeat_Invoice.Enter_EnterEndDt6("3333");
//    
//
//    TestModellerLogger.SetLastNodeGuid("9cc49f34-1866-4f9d-9bea-5982a5ac68bc");
//    _Repeat_Invoice.Select_Select_IncomeType_7("Sale");
//    
//
//    TestModellerLogger.SetLastNodeGuid("f3a4bb1e-fc4f-4e15-9a7b-3b9c1a310aa7");
//    _Repeat_Invoice.Enter_Enter_Description_8("Ipsam aut modi.
//Nihil laborum itaque et impedit odit nemo.
//Aliquid velit animi dolor consectetur.
//Cupiditate pariatur tempore vel tenetur iusto omnis ad dolor accusantium.
//Dolore ut odio ea aut culpa aut a.
//At eligendi nostrum debitis temporibus id deserunt deserunt laboriosam.
//Cumque tempora et sequi et.
//Velit recusandae sequi repellendus maiores ratione iusto voluptates possimus.
//Quia et et perspiciatis dolorum corrupti.
//Quam illo fugiat iste.");
//    
//
//    TestModellerLogger.SetLastNodeGuid("0f465ac6-f2e3-4f24-8ae7-e78786461337");
//    _Repeat_Invoice.Enter_EnterUnitPrice9("2222");
//    
//
//    TestModellerLogger.SetLastNodeGuid("942a7022-a179-4647-9703-dc3a3709ebcf");
//    _Repeat_Invoice.Enter_EnterQuantity10("222");
//    
//
//    TestModellerLogger.SetLastNodeGuid("d9663229-7722-4652-a445-16c996b94d02");
//    _Repeat_Invoice.Select_SelectVATRate11("Reduced Rate");
//    
//
//    TestModellerLogger.SetLastNodeGuid("b144a919-adaa-4207-9409-4a5187a2a356");
//    _Repeat_Invoice.Click_Advance_12();
//    
//
//    TestModellerLogger.SetLastNodeGuid("57c1db67-0a8f-4544-a985-dc3a9f40b062");
//    _Repeat_Invoice.Select_SelectBank_13("--Select Bank--");
//    
//
//    TestModellerLogger.SetLastNodeGuid("43633ce9-eaff-4a39-a50c-c3fd95d93092");
//    _Repeat_Invoice.Enter_EnterPaymentTerm14("33");
//    
//
//    TestModellerLogger.SetLastNodeGuid("54f5627c-8dbb-4f10-84c6-e00b55839dbd");
//    _Repeat_Invoice.Enter_EnterdueDays15("22");
//    
//
//    TestModellerLogger.SetLastNodeGuid("96b1019e-7ee1-4d1f-95fb-aa54cec8d337");
//    _Repeat_Invoice.Select_SelectFrequency16("2 Weeks");
//    
//
//    TestModellerLogger.SetLastNodeGuid("27abdf11-8e5b-45c6-a5d9-4f4ccef39557");
//    _Repeat_Invoice.Enter_EnterTotalOccurance17("3");
//    
//
//    TestModellerLogger.SetLastNodeGuid("8d0ae3ad-db66-4f85-8aba-3bbf2d18d724");
//    _Repeat_Invoice.Select_SelectInvoiceTemplate18("Simple Invoice Template");
//    
//
//    TestModellerLogger.SetLastNodeGuid("4b45015e-9988-46eb-b087-88b912eeaee2");
//    _Repeat_Invoice.Click_Click_AutoEmail_19();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5c3e9dcf-7bf5-4905-a7b7-2b0b0ca7ad09");
//    _Repeat_Invoice.Click_Click_NonVATInvoice_20();
//    
//
//    TestModellerLogger.SetLastNodeGuid("006b9ad8-5971-4737-922b-ec0a7fad3126");
//    _Repeat_Invoice.Click_Click_AutoProcess_21();
//    
//
//    TestModellerLogger.SetLastNodeGuid("78800cd5-c273-4318-8b6c-211404dccc8c");
//    _Repeat_Invoice.Click_Save_22();
//    
//
//    }
//
//    @Test  (groups= {"Test_Repeat_Invoice","Test_Repeat_Invoice - Test Cases"})
//    @TestModellerPath(guid = "506bf674-c84b-442f-b157-145167513319")
//    public void GoToUrlClickView1ClickRepeatInvoice2ClickAddRepeatInvoice3PositiveSelectSelectCustomer4Positiv5()
//    {
//        
//        pages.Repeat_Invoice _Repeat_Invoice = new pages.Repeat_Invoice(driver);
//    TestModellerLogger.SetLastNodeGuid("36f7dcf5-75c6-44ac-a870-2696de786c06");
//    _Repeat_Invoice.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("c151a6a7-f304-4d5f-be5b-c3c07fd0bf8c");
//    _Repeat_Invoice.Click_View_1();
//    
//
//    TestModellerLogger.SetLastNodeGuid("394c947a-245b-4589-9310-3d02182bcf0b");
//    _Repeat_Invoice.Click_Repeat_Invoice_2();
//    
//
//    TestModellerLogger.SetLastNodeGuid("d9ba9b36-8311-4a59-9152-1a3d2921f4e3");
//    _Repeat_Invoice.Click_Add_Repeat_Invoice_3();
//    
//
//    TestModellerLogger.SetLastNodeGuid("ccf70a83-8187-487b-b3a5-eceb4aac5534");
//    _Repeat_Invoice.Select_Select_Customer_4("Invoices_001");
//    
//
//    TestModellerLogger.SetLastNodeGuid("6cf9bd87-f527-4624-af81-220e41a1c4a8");
//    _Repeat_Invoice.Enter_EnterStartDate5("44494");
//    
//
//    TestModellerLogger.SetLastNodeGuid("346e921e-22de-475c-b126-1dbebe605082");
//    _Repeat_Invoice.Enter_EnterEndDt6("3333");
//    
//
//    TestModellerLogger.SetLastNodeGuid("9cc49f34-1866-4f9d-9bea-5982a5ac68bc");
//    _Repeat_Invoice.Select_Select_IncomeType_7("Sale");
//    
//
//    TestModellerLogger.SetLastNodeGuid("f3a4bb1e-fc4f-4e15-9a7b-3b9c1a310aa7");
//    _Repeat_Invoice.Enter_Enter_Description_8("Officia eius voluptas sapiente recusandae voluptates voluptas excepturi mollitia.
//Sunt provident qui facilis a ipsum repellendus nihil.
//Vel quia sit provident qui.
//Autem est non aut ut aspernatur aperiam enim.
//Ut recusandae rerum accusantium numquam cupiditate qui.
//Et praesentium exercitationem sit.
//Aut provident quae harum.
//In dolor tempore quaerat est.
//Incidunt eos voluptatem.
//Quas ea est.");
//    
//
//    TestModellerLogger.SetLastNodeGuid("0f465ac6-f2e3-4f24-8ae7-e78786461337");
//    _Repeat_Invoice.Enter_EnterUnitPrice9("2222");
//    
//
//    TestModellerLogger.SetLastNodeGuid("942a7022-a179-4647-9703-dc3a3709ebcf");
//    _Repeat_Invoice.Enter_EnterQuantity10("222");
//    
//
//    TestModellerLogger.SetLastNodeGuid("d9663229-7722-4652-a445-16c996b94d02");
//    _Repeat_Invoice.Select_SelectVATRate11("Domestic Reverse Charge - 5%");
//    
//
//    TestModellerLogger.SetLastNodeGuid("b144a919-adaa-4207-9409-4a5187a2a356");
//    _Repeat_Invoice.Click_Advance_12();
//    
//
//    TestModellerLogger.SetLastNodeGuid("57c1db67-0a8f-4544-a985-dc3a9f40b062");
//    _Repeat_Invoice.Select_SelectBank_13("--Select Bank--");
//    
//
//    TestModellerLogger.SetLastNodeGuid("43633ce9-eaff-4a39-a50c-c3fd95d93092");
//    _Repeat_Invoice.Enter_EnterPaymentTerm14("33");
//    
//
//    TestModellerLogger.SetLastNodeGuid("54f5627c-8dbb-4f10-84c6-e00b55839dbd");
//    _Repeat_Invoice.Enter_EnterdueDays15("22");
//    
//
//    TestModellerLogger.SetLastNodeGuid("96b1019e-7ee1-4d1f-95fb-aa54cec8d337");
//    _Repeat_Invoice.Select_SelectFrequency16("Yearly");
//    
//
//    TestModellerLogger.SetLastNodeGuid("27abdf11-8e5b-45c6-a5d9-4f4ccef39557");
//    _Repeat_Invoice.Enter_EnterTotalOccurance17("3");
//    
//
//    TestModellerLogger.SetLastNodeGuid("8d0ae3ad-db66-4f85-8aba-3bbf2d18d724");
//    _Repeat_Invoice.Select_SelectInvoiceTemplate18("Simple Invoice Template");
//    
//
//    TestModellerLogger.SetLastNodeGuid("4b45015e-9988-46eb-b087-88b912eeaee2");
//    _Repeat_Invoice.Click_Click_AutoEmail_19();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5c3e9dcf-7bf5-4905-a7b7-2b0b0ca7ad09");
//    _Repeat_Invoice.Click_Click_NonVATInvoice_20();
//    
//
//    TestModellerLogger.SetLastNodeGuid("006b9ad8-5971-4737-922b-ec0a7fad3126");
//    _Repeat_Invoice.Click_Click_AutoProcess_21();
//    
//
//    TestModellerLogger.SetLastNodeGuid("78800cd5-c273-4318-8b6c-211404dccc8c");
//    _Repeat_Invoice.Click_Save_22();
//    
//
//    }
//
//    @Test  (groups= {"Test_Repeat_Invoice","Test_Repeat_Invoice - Test Cases"})
//    @TestModellerPath(guid = "0b0c0326-8908-45c5-9992-4167bffaccc3")
//    public void GoToUrlClickView1ClickRepeatInvoice2ClickAddRepeatInvoice3PositiveSelectSelectCustomer4Positiv6()
//    {
//        
//        pages.Repeat_Invoice _Repeat_Invoice = new pages.Repeat_Invoice(driver);
//    TestModellerLogger.SetLastNodeGuid("36f7dcf5-75c6-44ac-a870-2696de786c06");
//    _Repeat_Invoice.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("c151a6a7-f304-4d5f-be5b-c3c07fd0bf8c");
//    _Repeat_Invoice.Click_View_1();
//    
//
//    TestModellerLogger.SetLastNodeGuid("394c947a-245b-4589-9310-3d02182bcf0b");
//    _Repeat_Invoice.Click_Repeat_Invoice_2();
//    
//
//    TestModellerLogger.SetLastNodeGuid("d9ba9b36-8311-4a59-9152-1a3d2921f4e3");
//    _Repeat_Invoice.Click_Add_Repeat_Invoice_3();
//    
//
//    TestModellerLogger.SetLastNodeGuid("ccf70a83-8187-487b-b3a5-eceb4aac5534");
//    _Repeat_Invoice.Select_Select_Customer_4("Invoices_001");
//    
//
//    TestModellerLogger.SetLastNodeGuid("6cf9bd87-f527-4624-af81-220e41a1c4a8");
//    _Repeat_Invoice.Enter_EnterStartDate5("44494");
//    
//
//    TestModellerLogger.SetLastNodeGuid("346e921e-22de-475c-b126-1dbebe605082");
//    _Repeat_Invoice.Enter_EnterEndDt6("3333");
//    
//
//    TestModellerLogger.SetLastNodeGuid("9cc49f34-1866-4f9d-9bea-5982a5ac68bc");
//    _Repeat_Invoice.Select_Select_IncomeType_7("Sale");
//    
//
//    TestModellerLogger.SetLastNodeGuid("f3a4bb1e-fc4f-4e15-9a7b-3b9c1a310aa7");
//    _Repeat_Invoice.Enter_Enter_Description_8("Modi dolor ullam voluptatem tempora omnis quos.
//Autem aut totam quasi iusto in est cum.
//Sapiente animi placeat praesentium magni earum sunt dolore.
//Autem architecto quaerat rem id quas consequatur possimus odit.
//Tempore molestias illum officiis vero.
//Eum autem temporibus et soluta eum quos officia et.
//Possimus eveniet beatae sunt voluptas non omnis.
//Delectus esse voluptatum quia qui sapiente.
//Cum exercitationem veniam alias quia.
//Qui necessitatibus dolorum placeat.");
//    
//
//    TestModellerLogger.SetLastNodeGuid("0f465ac6-f2e3-4f24-8ae7-e78786461337");
//    _Repeat_Invoice.Enter_EnterUnitPrice9("2222");
//    
//
//    TestModellerLogger.SetLastNodeGuid("942a7022-a179-4647-9703-dc3a3709ebcf");
//    _Repeat_Invoice.Enter_EnterQuantity10("222");
//    
//
//    TestModellerLogger.SetLastNodeGuid("d9663229-7722-4652-a445-16c996b94d02");
//    _Repeat_Invoice.Select_SelectVATRate11("Zero Rate");
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
//    TestModellerLogger.SetLastNodeGuid("43633ce9-eaff-4a39-a50c-c3fd95d93092");
//    _Repeat_Invoice.Enter_EnterPaymentTerm14("33");
//    
//
//    TestModellerLogger.SetLastNodeGuid("54f5627c-8dbb-4f10-84c6-e00b55839dbd");
//    _Repeat_Invoice.Enter_EnterdueDays15("22");
//    
//
//    TestModellerLogger.SetLastNodeGuid("96b1019e-7ee1-4d1f-95fb-aa54cec8d337");
//    _Repeat_Invoice.Select_SelectFrequency16("4 Weeks");
//    
//
//    TestModellerLogger.SetLastNodeGuid("27abdf11-8e5b-45c6-a5d9-4f4ccef39557");
//    _Repeat_Invoice.Enter_EnterTotalOccurance17("3");
//    
//
//    TestModellerLogger.SetLastNodeGuid("8d0ae3ad-db66-4f85-8aba-3bbf2d18d724");
//    _Repeat_Invoice.Select_SelectInvoiceTemplate18("Simple Invoice Template");
//    
//
//    TestModellerLogger.SetLastNodeGuid("4b45015e-9988-46eb-b087-88b912eeaee2");
//    _Repeat_Invoice.Click_Click_AutoEmail_19();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5c3e9dcf-7bf5-4905-a7b7-2b0b0ca7ad09");
//    _Repeat_Invoice.Click_Click_NonVATInvoice_20();
//    
//
//    TestModellerLogger.SetLastNodeGuid("006b9ad8-5971-4737-922b-ec0a7fad3126");
//    _Repeat_Invoice.Click_Click_AutoProcess_21();
//    
//
//    TestModellerLogger.SetLastNodeGuid("78800cd5-c273-4318-8b6c-211404dccc8c");
//    _Repeat_Invoice.Click_Save_22();
//    
//
//    }
//
//    @Test  (groups= {"Test_Repeat_Invoice","Test_Repeat_Invoice - Test Cases"})
//    @TestModellerPath(guid = "65fba5ad-7a96-463c-b089-511e63d77092")
//    public void GoToUrlClickView1ClickRepeatInvoice2ClickAddRepeatInvoice3PositiveSelectSelectCustomer4Positiv7()
//    {
//        
//        pages.Repeat_Invoice _Repeat_Invoice = new pages.Repeat_Invoice(driver);
//    TestModellerLogger.SetLastNodeGuid("36f7dcf5-75c6-44ac-a870-2696de786c06");
//    _Repeat_Invoice.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("c151a6a7-f304-4d5f-be5b-c3c07fd0bf8c");
//    _Repeat_Invoice.Click_View_1();
//    
//
//    TestModellerLogger.SetLastNodeGuid("394c947a-245b-4589-9310-3d02182bcf0b");
//    _Repeat_Invoice.Click_Repeat_Invoice_2();
//    
//
//    TestModellerLogger.SetLastNodeGuid("d9ba9b36-8311-4a59-9152-1a3d2921f4e3");
//    _Repeat_Invoice.Click_Add_Repeat_Invoice_3();
//    
//
//    TestModellerLogger.SetLastNodeGuid("ccf70a83-8187-487b-b3a5-eceb4aac5534");
//    _Repeat_Invoice.Select_Select_Customer_4("Invoices_001");
//    
//
//    TestModellerLogger.SetLastNodeGuid("6cf9bd87-f527-4624-af81-220e41a1c4a8");
//    _Repeat_Invoice.Enter_EnterStartDate5("44494");
//    
//
//    TestModellerLogger.SetLastNodeGuid("346e921e-22de-475c-b126-1dbebe605082");
//    _Repeat_Invoice.Enter_EnterEndDt6("3333");
//    
//
//    TestModellerLogger.SetLastNodeGuid("9cc49f34-1866-4f9d-9bea-5982a5ac68bc");
//    _Repeat_Invoice.Select_Select_IncomeType_7("Sale");
//    
//
//    TestModellerLogger.SetLastNodeGuid("f3a4bb1e-fc4f-4e15-9a7b-3b9c1a310aa7");
//    _Repeat_Invoice.Enter_Enter_Description_8("Ullam et voluptatem delectus.
//Tempore eaque adipisci placeat repudiandae soluta perferendis.
//Praesentium minus quam voluptates odio commodi inventore.
//Eum ex alias sed non qui quaerat qui.
//Consequatur blanditiis nisi.
//Repudiandae ratione dolore alias fugiat aut veniam rerum.
//Ut repellat minima possimus.
//Odio est qui qui quaerat est dolores.
//Enim ratione molestiae quis dicta dolor.
//Quisquam et modi tempore eum unde qui ipsum voluptates.");
//    
//
//    TestModellerLogger.SetLastNodeGuid("0f465ac6-f2e3-4f24-8ae7-e78786461337");
//    _Repeat_Invoice.Enter_EnterUnitPrice9("2222");
//    
//
//    TestModellerLogger.SetLastNodeGuid("942a7022-a179-4647-9703-dc3a3709ebcf");
//    _Repeat_Invoice.Enter_EnterQuantity10("222");
//    
//
//    TestModellerLogger.SetLastNodeGuid("d9663229-7722-4652-a445-16c996b94d02");
//    _Repeat_Invoice.Select_SelectVATRate11("Exempt");
//    
//
//    TestModellerLogger.SetLastNodeGuid("b144a919-adaa-4207-9409-4a5187a2a356");
//    _Repeat_Invoice.Click_Advance_12();
//    
//
//    TestModellerLogger.SetLastNodeGuid("57c1db67-0a8f-4544-a985-dc3a9f40b062");
//    _Repeat_Invoice.Select_SelectBank_13("--Select Bank--");
//    
//
//    TestModellerLogger.SetLastNodeGuid("43633ce9-eaff-4a39-a50c-c3fd95d93092");
//    _Repeat_Invoice.Enter_EnterPaymentTerm14("33");
//    
//
//    TestModellerLogger.SetLastNodeGuid("54f5627c-8dbb-4f10-84c6-e00b55839dbd");
//    _Repeat_Invoice.Enter_EnterdueDays15("22");
//    
//
//    TestModellerLogger.SetLastNodeGuid("96b1019e-7ee1-4d1f-95fb-aa54cec8d337");
//    _Repeat_Invoice.Select_SelectFrequency16("4 Weeks");
//    
//
//    TestModellerLogger.SetLastNodeGuid("27abdf11-8e5b-45c6-a5d9-4f4ccef39557");
//    _Repeat_Invoice.Enter_EnterTotalOccurance17("3");
//    
//
//    TestModellerLogger.SetLastNodeGuid("8d0ae3ad-db66-4f85-8aba-3bbf2d18d724");
//    _Repeat_Invoice.Select_SelectInvoiceTemplate18("Simple Invoice Template");
//    
//
//    TestModellerLogger.SetLastNodeGuid("4b45015e-9988-46eb-b087-88b912eeaee2");
//    _Repeat_Invoice.Click_Click_AutoEmail_19();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5c3e9dcf-7bf5-4905-a7b7-2b0b0ca7ad09");
//    _Repeat_Invoice.Click_Click_NonVATInvoice_20();
//    
//
//    TestModellerLogger.SetLastNodeGuid("006b9ad8-5971-4737-922b-ec0a7fad3126");
//    _Repeat_Invoice.Click_Click_AutoProcess_21();
//    
//
//    TestModellerLogger.SetLastNodeGuid("78800cd5-c273-4318-8b6c-211404dccc8c");
//    _Repeat_Invoice.Click_Save_22();
//    
//
//    }
//
//    @Test  (groups= {"Test_Repeat_Invoice","Test_Repeat_Invoice - Test Cases"})
//    @TestModellerPath(guid = "805405bd-06c6-4ca1-9c95-a30341b24b77")
//    public void GoToUrlClickView1ClickRepeatInvoice2ClickAddRepeatInvoice3PositiveSelectSelectCustomer4Positiv8()
//    {
//        
//        pages.Repeat_Invoice _Repeat_Invoice = new pages.Repeat_Invoice(driver);
//    TestModellerLogger.SetLastNodeGuid("36f7dcf5-75c6-44ac-a870-2696de786c06");
//    _Repeat_Invoice.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("c151a6a7-f304-4d5f-be5b-c3c07fd0bf8c");
//    _Repeat_Invoice.Click_View_1();
//    
//
//    TestModellerLogger.SetLastNodeGuid("394c947a-245b-4589-9310-3d02182bcf0b");
//    _Repeat_Invoice.Click_Repeat_Invoice_2();
//    
//
//    TestModellerLogger.SetLastNodeGuid("d9ba9b36-8311-4a59-9152-1a3d2921f4e3");
//    _Repeat_Invoice.Click_Add_Repeat_Invoice_3();
//    
//
//    TestModellerLogger.SetLastNodeGuid("ccf70a83-8187-487b-b3a5-eceb4aac5534");
//    _Repeat_Invoice.Select_Select_Customer_4("Invoices_001");
//    
//
//    TestModellerLogger.SetLastNodeGuid("6cf9bd87-f527-4624-af81-220e41a1c4a8");
//    _Repeat_Invoice.Enter_EnterStartDate5("44494");
//    
//
//    TestModellerLogger.SetLastNodeGuid("346e921e-22de-475c-b126-1dbebe605082");
//    _Repeat_Invoice.Enter_EnterEndDt6("3333");
//    
//
//    TestModellerLogger.SetLastNodeGuid("9cc49f34-1866-4f9d-9bea-5982a5ac68bc");
//    _Repeat_Invoice.Select_Select_IncomeType_7("Sale");
//    
//
//    TestModellerLogger.SetLastNodeGuid("f3a4bb1e-fc4f-4e15-9a7b-3b9c1a310aa7");
//    _Repeat_Invoice.Enter_Enter_Description_8("Natus est nihil laborum aut alias aliquam.
//Ipsa illum libero quia iste velit.
//Velit dignissimos debitis aspernatur sunt laudantium porro quas.
//Dolores odio est est.
//Asperiores vero omnis repudiandae voluptas optio sint temporibus vero voluptatem.
//Ipsum sint quae sapiente.
//Excepturi aliquid accusantium sit.
//Aut impedit quasi suscipit ratione nulla enim error.
//Similique tempora facilis.
//Quae a fugit exercitationem quo et id.");
//    
//
//    TestModellerLogger.SetLastNodeGuid("0f465ac6-f2e3-4f24-8ae7-e78786461337");
//    _Repeat_Invoice.Enter_EnterUnitPrice9("2222");
//    
//
//    TestModellerLogger.SetLastNodeGuid("942a7022-a179-4647-9703-dc3a3709ebcf");
//    _Repeat_Invoice.Enter_EnterQuantity10("222");
//    
//
//    TestModellerLogger.SetLastNodeGuid("d9663229-7722-4652-a445-16c996b94d02");
//    _Repeat_Invoice.Select_SelectVATRate11("Standard Rate");
//    
//
//    TestModellerLogger.SetLastNodeGuid("b144a919-adaa-4207-9409-4a5187a2a356");
//    _Repeat_Invoice.Click_Advance_12();
//    
//
//    TestModellerLogger.SetLastNodeGuid("57c1db67-0a8f-4544-a985-dc3a9f40b062");
//    _Repeat_Invoice.Select_SelectBank_13("--Select Bank--");
//    
//
//    TestModellerLogger.SetLastNodeGuid("43633ce9-eaff-4a39-a50c-c3fd95d93092");
//    _Repeat_Invoice.Enter_EnterPaymentTerm14("33");
//    
//
//    TestModellerLogger.SetLastNodeGuid("54f5627c-8dbb-4f10-84c6-e00b55839dbd");
//    _Repeat_Invoice.Enter_EnterdueDays15("22");
//    
//
//    TestModellerLogger.SetLastNodeGuid("96b1019e-7ee1-4d1f-95fb-aa54cec8d337");
//    _Repeat_Invoice.Select_SelectFrequency16("4 Weeks");
//    
//
//    TestModellerLogger.SetLastNodeGuid("27abdf11-8e5b-45c6-a5d9-4f4ccef39557");
//    _Repeat_Invoice.Enter_EnterTotalOccurance17("3");
//    
//
//    TestModellerLogger.SetLastNodeGuid("8d0ae3ad-db66-4f85-8aba-3bbf2d18d724");
//    _Repeat_Invoice.Select_SelectInvoiceTemplate18("Simple Invoice Template");
//    
//
//    TestModellerLogger.SetLastNodeGuid("4b45015e-9988-46eb-b087-88b912eeaee2");
//    _Repeat_Invoice.Click_Click_AutoEmail_19();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5c3e9dcf-7bf5-4905-a7b7-2b0b0ca7ad09");
//    _Repeat_Invoice.Click_Click_NonVATInvoice_20();
//    
//
//    TestModellerLogger.SetLastNodeGuid("006b9ad8-5971-4737-922b-ec0a7fad3126");
//    _Repeat_Invoice.Click_Click_AutoProcess_21();
//    
//
//    TestModellerLogger.SetLastNodeGuid("78800cd5-c273-4318-8b6c-211404dccc8c");
//    _Repeat_Invoice.Click_Save_22();
//    
//
//    }
//
//    @Test  (groups= {"Test_Repeat_Invoice","Test_Repeat_Invoice - Test Cases"})
//    @TestModellerPath(guid = "7000cc74-22bb-4069-8668-e64d37fb77f3")
//    public void GoToUrlClickView1ClickRepeatInvoice2ClickAddRepeatInvoice3PositiveSelectSelectCustomer4Positi()
//    {
//        
//        pages.Repeat_Invoice _Repeat_Invoice = new pages.Repeat_Invoice(driver);
//    TestModellerLogger.SetLastNodeGuid("36f7dcf5-75c6-44ac-a870-2696de786c06");
//    _Repeat_Invoice.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("c151a6a7-f304-4d5f-be5b-c3c07fd0bf8c");
//    _Repeat_Invoice.Click_View_1();
//    
//
//    TestModellerLogger.SetLastNodeGuid("394c947a-245b-4589-9310-3d02182bcf0b");
//    _Repeat_Invoice.Click_Repeat_Invoice_2();
//    
//
//    TestModellerLogger.SetLastNodeGuid("d9ba9b36-8311-4a59-9152-1a3d2921f4e3");
//    _Repeat_Invoice.Click_Add_Repeat_Invoice_3();
//    
//
//    TestModellerLogger.SetLastNodeGuid("ccf70a83-8187-487b-b3a5-eceb4aac5534");
//    _Repeat_Invoice.Select_Select_Customer_4("Invoices_001");
//    
//
//    TestModellerLogger.SetLastNodeGuid("6cf9bd87-f527-4624-af81-220e41a1c4a8");
//    _Repeat_Invoice.Enter_EnterStartDate5("44494");
//    
//
//    TestModellerLogger.SetLastNodeGuid("346e921e-22de-475c-b126-1dbebe605082");
//    _Repeat_Invoice.Enter_EnterEndDt6("3333");
//    
//
//    TestModellerLogger.SetLastNodeGuid("9cc49f34-1866-4f9d-9bea-5982a5ac68bc");
//    _Repeat_Invoice.Select_Select_IncomeType_7("Sale");
//    
//
//    TestModellerLogger.SetLastNodeGuid("f3a4bb1e-fc4f-4e15-9a7b-3b9c1a310aa7");
//    _Repeat_Invoice.Enter_Enter_Description_8("Qui laborum tenetur in perspiciatis tempore.
//Perferendis maiores sunt placeat deserunt nostrum saepe.
//Atque in optio at.
//Tempora quod optio sint cupiditate reprehenderit repellat alias.
//Numquam quidem non.
//Modi sint explicabo sed recusandae.
//Ipsum qui unde dolores voluptatum deleniti illo.
//Sequi consequatur harum quisquam.
//Facilis sunt sit.
//Sint eaque debitis voluptatem tempore ut repellat assumenda qui.");
//    
//
//    TestModellerLogger.SetLastNodeGuid("0f465ac6-f2e3-4f24-8ae7-e78786461337");
//    _Repeat_Invoice.Enter_EnterUnitPrice9("2222");
//    
//
//    TestModellerLogger.SetLastNodeGuid("942a7022-a179-4647-9703-dc3a3709ebcf");
//    _Repeat_Invoice.Enter_EnterQuantity10("222");
//    
//
//    TestModellerLogger.SetLastNodeGuid("d9663229-7722-4652-a445-16c996b94d02");
//    _Repeat_Invoice.Select_SelectVATRate11("Out of Scope");
//    
//
//    TestModellerLogger.SetLastNodeGuid("b144a919-adaa-4207-9409-4a5187a2a356");
//    _Repeat_Invoice.Click_Advance_12();
//    
//
//    TestModellerLogger.SetLastNodeGuid("57c1db67-0a8f-4544-a985-dc3a9f40b062");
//    _Repeat_Invoice.Select_SelectBank_13("--Select Bank--");
//    
//
//    TestModellerLogger.SetLastNodeGuid("43633ce9-eaff-4a39-a50c-c3fd95d93092");
//    _Repeat_Invoice.Enter_EnterPaymentTerm14("33");
//    
//
//    TestModellerLogger.SetLastNodeGuid("54f5627c-8dbb-4f10-84c6-e00b55839dbd");
//    _Repeat_Invoice.Enter_EnterdueDays15("22");
//    
//
//    TestModellerLogger.SetLastNodeGuid("96b1019e-7ee1-4d1f-95fb-aa54cec8d337");
//    _Repeat_Invoice.Select_SelectFrequency16("4 Weeks");
//    
//
//    TestModellerLogger.SetLastNodeGuid("27abdf11-8e5b-45c6-a5d9-4f4ccef39557");
//    _Repeat_Invoice.Enter_EnterTotalOccurance17("3");
//    
//
//    TestModellerLogger.SetLastNodeGuid("8d0ae3ad-db66-4f85-8aba-3bbf2d18d724");
//    _Repeat_Invoice.Select_SelectInvoiceTemplate18("Simple Invoice Template");
//    
//
//    TestModellerLogger.SetLastNodeGuid("4b45015e-9988-46eb-b087-88b912eeaee2");
//    _Repeat_Invoice.Click_Click_AutoEmail_19();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5c3e9dcf-7bf5-4905-a7b7-2b0b0ca7ad09");
//    _Repeat_Invoice.Click_Click_NonVATInvoice_20();
//    
//
//    TestModellerLogger.SetLastNodeGuid("006b9ad8-5971-4737-922b-ec0a7fad3126");
//    _Repeat_Invoice.Click_Click_AutoProcess_21();
//    
//
//    TestModellerLogger.SetLastNodeGuid("78800cd5-c273-4318-8b6c-211404dccc8c");
//    _Repeat_Invoice.Click_Save_22();
//    
//
//    }

}