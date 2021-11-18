package test.ashiv;

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
import utilities.ExcelUtility;
import utilities.testmodeller.TestModellerLogger;

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/a540a5f4-14e8-4982-b991-f2415f5addfc
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1845, profileId = 102372)
public class TestNewSupplierBillBatch_UserStories extends TestBase
{
	String sTestCaseID=null;
	String[] data=null;
	String Sheet = null;

    
    @Test  (groups= {"Test_New_Supplier_Bill_Batch","Test_New_Supplier_Bill_Batch - User Stories"})
    @TestModellerPath(guid = "8747910e-0597-4f2b-b1f4-237fed741004")
    public void GoToUrlAssertUrlClickExpenditure1ClickViewNew2ClickNewSupplierBillBatch3ClickSave4PositiveSel() throws InvalidFormatException, InterruptedException
    {
        
    	
    	sTestCaseID="TC20";
       	Sheet="BankingBank";
        data = ExcelUtility.toReadExcelData(sTestCaseID, Sheet);
        
        pages.banking.ashiv.Login1VAT _Login1VAT = new pages.banking.ashiv.Login1VAT(driver);
    TestModellerLogger.SetLastNodeGuid("93e4a214-3f97-41d2-8063-dd91c879e847");
    _Login1VAT.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7eff8b4c-1e47-48a4-bcad-b3639d0cdfd5");
    _Login1VAT.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ceaa193b-d8c0-48f9-911f-018e2571da20");
    _Login1VAT.Enter_UserName(data[1]);
    

    TestModellerLogger.SetLastNodeGuid("95b31ed9-af0a-49e7-8bfa-8471d379cdff");
    _Login1VAT.Enter_Password(data[2]);
    

    TestModellerLogger.SetLastNodeGuid("942414e4-1d0e-45ba-bdd1-43293b97e0ff");
    _Login1VAT.Click_LoginButton();
    

    pages.banking.ashiv.AgentsSelect _AgentsSelect = new pages.banking.ashiv.AgentsSelect(driver);
//    TestModellerLogger.SetLastNodeGuid("69016c4b-a736-45bf-a682-5c03ee8d17cd");
//    _AgentsSelect.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("bd071d41-148c-42e8-8300-984c9dd4df87");
//    _AgentsSelect.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("bd031a68-650a-4b8c-8e7c-0ce87415e17e");
    _AgentsSelect.Click_AgentsTab();
    

    TestModellerLogger.SetLastNodeGuid("d5b61053-e5d4-479f-87c7-e4be6b5f054a");
    _AgentsSelect.Enter_AgentName(data[3]);
    

    TestModellerLogger.SetLastNodeGuid("2bae82eb-0e45-434c-b1bd-7336f304d4f9");
    _AgentsSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("be317b25-3125-4191-86a5-e8ffee0d0334");
    _AgentsSelect.Click_SelectAgent();
    

    pages.banking.ashiv.ClientSelect _ClientSelect = new pages.banking.ashiv.ClientSelect(driver);

    

    TestModellerLogger.SetLastNodeGuid("ff5edd38-07b0-452b-95d6-f33e07e1e975");
    _ClientSelect.Click_ClientsTAB();
    

    TestModellerLogger.SetLastNodeGuid("14a94a5a-c1ac-4e4f-afd4-69a84ffa5a24");
    _ClientSelect.Enter_ClientName(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("ed3e4750-33a4-4d75-a14c-9d75935c79c7");
    _ClientSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("e537c9d6-4166-4745-b27e-a178d69d2884");
    _ClientSelect.Click_SelectClient();
    	
    	
    	
    	
        As_Supplier.New_Supplier_Bill_Batch _New_Supplier_Bill_Batch = new As_Supplier.New_Supplier_Bill_Batch(driver);
        
//    TestModellerLogger.SetLastNodeGuid("b9ff0052-ab6e-40b3-bb6b-a778b44aac5c");
//    _New_Supplier_Bill_Batch.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("088b664d-2d27-42e0-853a-5cfda9fa4a37");
//    _New_Supplier_Bill_Batch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("72db8227-6f33-4f8e-8d1c-30e36fb107f4");
    _New_Supplier_Bill_Batch.Click_Expenditure1();
    

    TestModellerLogger.SetLastNodeGuid("bd937bf1-f7d1-46bc-938f-d2207258bb2b");
    _New_Supplier_Bill_Batch.Click_View_New_2();
    

    TestModellerLogger.SetLastNodeGuid("58262663-7da0-4ebc-b6ce-addbefb83e25");
    _New_Supplier_Bill_Batch.Click_New_Supplier_Bill_Batch_3();
    

    TestModellerLogger.SetLastNodeGuid("7d689181-b6a0-4283-b384-0fee7dbfbd56");
    _New_Supplier_Bill_Batch.Click_Save_4();
    

    TestModellerLogger.SetLastNodeGuid("29dd302b-2f78-4f4a-bada-9d003c6cfc4a");
    _New_Supplier_Bill_Batch.Select_Select_Supplier_5(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("3a80b267-ec05-45cc-ad71-f20b9d59ad8e");
    _New_Supplier_Bill_Batch.Select_Select_Supplier_Bill_Type_6(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("aaeb0de0-e38e-4288-8b58-c3b26a63b5aa");
    _New_Supplier_Bill_Batch.Enter_Enter_Bill_No_7(data[7]);
    

    TestModellerLogger.SetLastNodeGuid("032dd099-ac7a-4797-959b-9f5522973eaf");
    _New_Supplier_Bill_Batch.Enter_Description_8(data[8]);
    

    TestModellerLogger.SetLastNodeGuid("b599506c-7a34-438a-bc21-9664c91b9162");
    _New_Supplier_Bill_Batch.Enter_Enter_NetTotal_9(data[9]);
    

    TestModellerLogger.SetLastNodeGuid("aa35da43-8007-4d5b-9873-08aac9250d5e");
    _New_Supplier_Bill_Batch.Select_Select_VATRate_10(data[10]);
    
    _New_Supplier_Bill_Batch.ExpenceType(data[11]);
    
    TestModellerLogger.SetLastNodeGuid("a88557d3-8751-4d6c-ae45-76caba6b5868");
    _New_Supplier_Bill_Batch.Click_Save();
    
    TestModellerLogger.SetLastNodeGuid("bd937bf1-f7d1-46bc-938f-d2207258bb2b");
    _New_Supplier_Bill_Batch.Click_View_New_2();
    

    TestModellerLogger.SetLastNodeGuid("58262663-7da0-4ebc-b6ce-addbefb83e25");
    _New_Supplier_Bill_Batch.Click_New_Supplier_Bill_Batch_3();
    
    _New_Supplier_Bill_Batch.CancelBtn();

    }
//
//    @Test  (groups= {"Test_New_Supplier_Bill_Batch","Test_New_Supplier_Bill_Batch - User Stories"})
//    @TestModellerPath(guid = "7be86476-b98d-48b0-91bd-2e9d86ea86f5")
//    public void GoToUrlAssertUrlClickExpenditure1ClickViewNew2ClickNewSupplierBillBatch3ClickSave4PositiveSel1()
//    {
//        
//        pages.New_Supplier_Bill_Batch _New_Supplier_Bill_Batch = new pages.New_Supplier_Bill_Batch(driver);
//    TestModellerLogger.SetLastNodeGuid("b9ff0052-ab6e-40b3-bb6b-a778b44aac5c");
//    _New_Supplier_Bill_Batch.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("088b664d-2d27-42e0-853a-5cfda9fa4a37");
//    _New_Supplier_Bill_Batch.AssertUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("72db8227-6f33-4f8e-8d1c-30e36fb107f4");
//    _New_Supplier_Bill_Batch.Click_Expenditure1();
//    
//
//    TestModellerLogger.SetLastNodeGuid("bd937bf1-f7d1-46bc-938f-d2207258bb2b");
//    _New_Supplier_Bill_Batch.Click_View_New_2();
//    
//
//    TestModellerLogger.SetLastNodeGuid("58262663-7da0-4ebc-b6ce-addbefb83e25");
//    _New_Supplier_Bill_Batch.Click_New_Supplier_Bill_Batch_3();
//    
//
//    TestModellerLogger.SetLastNodeGuid("7d689181-b6a0-4283-b384-0fee7dbfbd56");
//    _New_Supplier_Bill_Batch.Click_Save_4();
//    
//
//    TestModellerLogger.SetLastNodeGuid("29dd302b-2f78-4f4a-bada-9d003c6cfc4a");
//    _New_Supplier_Bill_Batch.Select_Select_Supplier_5("ABCSupplier");
//    
//
//    TestModellerLogger.SetLastNodeGuid("3a80b267-ec05-45cc-ad71-f20b9d59ad8e");
//    _New_Supplier_Bill_Batch.Select_Select_Supplier_Bill_Type_6("DNote");
//    
//
//    TestModellerLogger.SetLastNodeGuid("aaeb0de0-e38e-4288-8b58-c3b26a63b5aa");
//    _New_Supplier_Bill_Batch.Enter_Enter_Bill_No_7("aaaa");
//    
//
//    TestModellerLogger.SetLastNodeGuid("032dd099-ac7a-4797-959b-9f5522973eaf");
//    _New_Supplier_Bill_Batch.Enter_Description_8("A esse eaque debitis eos assumenda est fugiat dolores.
//Et ipsum adipisci autem.
//Et sit nisi impedit occaecati fuga in.
//Libero nostrum cupiditate ipsum occaecati dolorem unde ipsum quia perspiciatis.
//Animi non reiciendis voluptas vitae voluptate.
//Doloribus consequatur itaque eum doloribus optio voluptatibus cumque quos neque.
//Ullam non non iste.
//Consequatur qui laboriosam mollitia ipsum nam.
//Alias odit fuga consequatur est et voluptatem quam quaerat corporis.
//Harum officia reiciendis veniam corporis dolorem amet.");
//    
//
//    TestModellerLogger.SetLastNodeGuid("b599506c-7a34-438a-bc21-9664c91b9162");
//    _New_Supplier_Bill_Batch.Enter_Enter_NetTotal_9("3000");
//    
//
//    TestModellerLogger.SetLastNodeGuid("aa35da43-8007-4d5b-9873-08aac9250d5e");
//    _New_Supplier_Bill_Batch.Select_Select_VATRate_10("Standard Rate");
//    
//
//    TestModellerLogger.SetLastNodeGuid("a88557d3-8751-4d6c-ae45-76caba6b5868");
//    _New_Supplier_Bill_Batch.Click_Save_4();
//    
//
//    }
//
//    @Test  (groups= {"Test_New_Supplier_Bill_Batch","Test_New_Supplier_Bill_Batch - User Stories"})
//    @TestModellerPath(guid = "983bb4bd-c88d-49db-b5b2-746ebc6f09e0")
//    public void GoToUrlAssertUrlClickExpenditure1ClickViewNew2ClickNewSupplierBillBatch3ClickSave4PositiveSel2()
//    {
//        
//        pages.New_Supplier_Bill_Batch _New_Supplier_Bill_Batch = new pages.New_Supplier_Bill_Batch(driver);
//    TestModellerLogger.SetLastNodeGuid("b9ff0052-ab6e-40b3-bb6b-a778b44aac5c");
//    _New_Supplier_Bill_Batch.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("088b664d-2d27-42e0-853a-5cfda9fa4a37");
//    _New_Supplier_Bill_Batch.AssertUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("72db8227-6f33-4f8e-8d1c-30e36fb107f4");
//    _New_Supplier_Bill_Batch.Click_Expenditure1();
//    
//
//    TestModellerLogger.SetLastNodeGuid("bd937bf1-f7d1-46bc-938f-d2207258bb2b");
//    _New_Supplier_Bill_Batch.Click_View_New_2();
//    
//
//    TestModellerLogger.SetLastNodeGuid("58262663-7da0-4ebc-b6ce-addbefb83e25");
//    _New_Supplier_Bill_Batch.Click_New_Supplier_Bill_Batch_3();
//    
//
//    TestModellerLogger.SetLastNodeGuid("7d689181-b6a0-4283-b384-0fee7dbfbd56");
//    _New_Supplier_Bill_Batch.Click_Save_4();
//    
//
//    TestModellerLogger.SetLastNodeGuid("29dd302b-2f78-4f4a-bada-9d003c6cfc4a");
//    _New_Supplier_Bill_Batch.Select_Select_Supplier_5("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("3a80b267-ec05-45cc-ad71-f20b9d59ad8e");
//    _New_Supplier_Bill_Batch.Select_Select_Supplier_Bill_Type_6("DNote");
//    
//
//    TestModellerLogger.SetLastNodeGuid("aaeb0de0-e38e-4288-8b58-c3b26a63b5aa");
//    _New_Supplier_Bill_Batch.Enter_Enter_Bill_No_7("aaaa");
//    
//
//    TestModellerLogger.SetLastNodeGuid("032dd099-ac7a-4797-959b-9f5522973eaf");
//    _New_Supplier_Bill_Batch.Enter_Description_8("Tempore eum asperiores accusantium sit quia quae doloremque est.
//Maxime consequatur quod quia.
//Itaque ad commodi rerum non harum incidunt quod sint.
//Sint culpa ut occaecati dicta veniam excepturi voluptate ut asperiores.
//Consequatur vitae est quidem qui eaque et.
//Sint dolores accusamus nemo.
//Ipsa consequatur itaque itaque reiciendis amet dignissimos rerum.
//Aperiam aspernatur mollitia.
//Molestias cupiditate eveniet.
//In reprehenderit sit corporis.");
//    
//
//    TestModellerLogger.SetLastNodeGuid("b599506c-7a34-438a-bc21-9664c91b9162");
//    _New_Supplier_Bill_Batch.Enter_Enter_NetTotal_9("3000");
//    
//
//    TestModellerLogger.SetLastNodeGuid("aa35da43-8007-4d5b-9873-08aac9250d5e");
//    _New_Supplier_Bill_Batch.Select_Select_VATRate_10("Domestic Reverse Charge - 5%");
//    
//
//    TestModellerLogger.SetLastNodeGuid("a88557d3-8751-4d6c-ae45-76caba6b5868");
//    _New_Supplier_Bill_Batch.Click_Save_4();
//    
//
//    }
//
//    @Test  (groups= {"Test_New_Supplier_Bill_Batch","Test_New_Supplier_Bill_Batch - User Stories"})
//    @TestModellerPath(guid = "ecabb6ad-7baf-4d24-a577-4c9fcf957ed8")
//    public void GoToUrlAssertUrlClickExpenditure1ClickViewNew2ClickNewSupplierBillBatch3ClickSave4PositiveSel3()
//    {
//        
//        pages.New_Supplier_Bill_Batch _New_Supplier_Bill_Batch = new pages.New_Supplier_Bill_Batch(driver);
//    TestModellerLogger.SetLastNodeGuid("b9ff0052-ab6e-40b3-bb6b-a778b44aac5c");
//    _New_Supplier_Bill_Batch.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("088b664d-2d27-42e0-853a-5cfda9fa4a37");
//    _New_Supplier_Bill_Batch.AssertUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("72db8227-6f33-4f8e-8d1c-30e36fb107f4");
//    _New_Supplier_Bill_Batch.Click_Expenditure1();
//    
//
//    TestModellerLogger.SetLastNodeGuid("bd937bf1-f7d1-46bc-938f-d2207258bb2b");
//    _New_Supplier_Bill_Batch.Click_View_New_2();
//    
//
//    TestModellerLogger.SetLastNodeGuid("58262663-7da0-4ebc-b6ce-addbefb83e25");
//    _New_Supplier_Bill_Batch.Click_New_Supplier_Bill_Batch_3();
//    
//
//    TestModellerLogger.SetLastNodeGuid("7d689181-b6a0-4283-b384-0fee7dbfbd56");
//    _New_Supplier_Bill_Batch.Click_Save_4();
//    
//
//    TestModellerLogger.SetLastNodeGuid("29dd302b-2f78-4f4a-bada-9d003c6cfc4a");
//    _New_Supplier_Bill_Batch.Select_Select_Supplier_5("Default Supplier");
//    
//
//    TestModellerLogger.SetLastNodeGuid("3a80b267-ec05-45cc-ad71-f20b9d59ad8e");
//    _New_Supplier_Bill_Batch.Select_Select_Supplier_Bill_Type_6("Bill VAT");
//    
//
//    TestModellerLogger.SetLastNodeGuid("aaeb0de0-e38e-4288-8b58-c3b26a63b5aa");
//    _New_Supplier_Bill_Batch.Enter_Enter_Bill_No_7("aaaa");
//    
//
//    TestModellerLogger.SetLastNodeGuid("032dd099-ac7a-4797-959b-9f5522973eaf");
//    _New_Supplier_Bill_Batch.Enter_Description_8("Adipisci possimus magnam deleniti mollitia in et ea et quae.
//Et deleniti beatae nisi sunt.
//Nesciunt omnis et recusandae quae molestias.
//Et provident consequuntur.
//Minima explicabo deleniti aut nihil.
//Consequatur sit est.
//Deserunt et eos libero provident ab.
//Fugiat doloremque ducimus omnis distinctio.
//Incidunt dolor vel asperiores ratione dolore numquam eum veritatis ducimus.
//Quia ea similique exercitationem.");
//    
//
//    TestModellerLogger.SetLastNodeGuid("b599506c-7a34-438a-bc21-9664c91b9162");
//    _New_Supplier_Bill_Batch.Enter_Enter_NetTotal_9("3000");
//    
//
//    TestModellerLogger.SetLastNodeGuid("aa35da43-8007-4d5b-9873-08aac9250d5e");
//    _New_Supplier_Bill_Batch.Select_Select_VATRate_10("Exempt");
//    
//
//    TestModellerLogger.SetLastNodeGuid("a88557d3-8751-4d6c-ae45-76caba6b5868");
//    _New_Supplier_Bill_Batch.Click_Save_4();
//    
//
//    }
//
//    @Test  (groups= {"Test_New_Supplier_Bill_Batch","Test_New_Supplier_Bill_Batch - User Stories"})
//    @TestModellerPath(guid = "9604af74-d853-402e-a269-ea4367bb4408")
//    public void GoToUrlAssertUrlClickExpenditure1ClickViewNew2ClickNewSupplierBillBatch3ClickSave4PositiveSel4()
//    {
//        
//        pages.New_Supplier_Bill_Batch _New_Supplier_Bill_Batch = new pages.New_Supplier_Bill_Batch(driver);
//    TestModellerLogger.SetLastNodeGuid("b9ff0052-ab6e-40b3-bb6b-a778b44aac5c");
//    _New_Supplier_Bill_Batch.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("088b664d-2d27-42e0-853a-5cfda9fa4a37");
//    _New_Supplier_Bill_Batch.AssertUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("72db8227-6f33-4f8e-8d1c-30e36fb107f4");
//    _New_Supplier_Bill_Batch.Click_Expenditure1();
//    
//
//    TestModellerLogger.SetLastNodeGuid("bd937bf1-f7d1-46bc-938f-d2207258bb2b");
//    _New_Supplier_Bill_Batch.Click_View_New_2();
//    
//
//    TestModellerLogger.SetLastNodeGuid("58262663-7da0-4ebc-b6ce-addbefb83e25");
//    _New_Supplier_Bill_Batch.Click_New_Supplier_Bill_Batch_3();
//    
//
//    TestModellerLogger.SetLastNodeGuid("7d689181-b6a0-4283-b384-0fee7dbfbd56");
//    _New_Supplier_Bill_Batch.Click_Save_4();
//    
//
//    TestModellerLogger.SetLastNodeGuid("29dd302b-2f78-4f4a-bada-9d003c6cfc4a");
//    _New_Supplier_Bill_Batch.Select_Select_Supplier_5("Default Supplier");
//    
//
//    TestModellerLogger.SetLastNodeGuid("3a80b267-ec05-45cc-ad71-f20b9d59ad8e");
//    _New_Supplier_Bill_Batch.Select_Select_Supplier_Bill_Type_6("Bill");
//    
//
//    TestModellerLogger.SetLastNodeGuid("aaeb0de0-e38e-4288-8b58-c3b26a63b5aa");
//    _New_Supplier_Bill_Batch.Enter_Enter_Bill_No_7("aaaa");
//    
//
//    TestModellerLogger.SetLastNodeGuid("032dd099-ac7a-4797-959b-9f5522973eaf");
//    _New_Supplier_Bill_Batch.Enter_Description_8("Commodi ut neque rerum recusandae similique nobis dolor voluptatem.
//Blanditiis quo qui et soluta autem dolorum.
//Dolore adipisci ipsa.
//Distinctio recusandae voluptatum.
//Non esse voluptatibus perspiciatis consequuntur atque doloremque perferendis.
//Dolor iure omnis eaque nam aspernatur animi minus.
//Temporibus et consequatur error voluptas commodi quas minima.
//Aut omnis dolore id incidunt.
//Voluptatem eaque ut quibusdam porro iure.
//Nobis aut fugiat quas voluptate voluptas dicta culpa aspernatur odio.");
//    
//
//    TestModellerLogger.SetLastNodeGuid("b599506c-7a34-438a-bc21-9664c91b9162");
//    _New_Supplier_Bill_Batch.Enter_Enter_NetTotal_9("3000");
//    
//
//    TestModellerLogger.SetLastNodeGuid("aa35da43-8007-4d5b-9873-08aac9250d5e");
//    _New_Supplier_Bill_Batch.Select_Select_VATRate_10("Zero Rate");
//    
//
//    TestModellerLogger.SetLastNodeGuid("a88557d3-8751-4d6c-ae45-76caba6b5868");
//    _New_Supplier_Bill_Batch.Click_Save_4();
//    
//
//    }
//
//    @Test  (groups= {"Test_New_Supplier_Bill_Batch","Test_New_Supplier_Bill_Batch - User Stories"})
//    @TestModellerPath(guid = "450090af-4a41-423e-8666-56c41ca6adc4")
//    public void GoToUrlAssertUrlClickExpenditure1ClickViewNew2ClickNewSupplierBillBatch3ClickSave4PositiveSel5()
//    {
//        
//        pages.New_Supplier_Bill_Batch _New_Supplier_Bill_Batch = new pages.New_Supplier_Bill_Batch(driver);
//    TestModellerLogger.SetLastNodeGuid("b9ff0052-ab6e-40b3-bb6b-a778b44aac5c");
//    _New_Supplier_Bill_Batch.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("088b664d-2d27-42e0-853a-5cfda9fa4a37");
//    _New_Supplier_Bill_Batch.AssertUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("72db8227-6f33-4f8e-8d1c-30e36fb107f4");
//    _New_Supplier_Bill_Batch.Click_Expenditure1();
//    
//
//    TestModellerLogger.SetLastNodeGuid("bd937bf1-f7d1-46bc-938f-d2207258bb2b");
//    _New_Supplier_Bill_Batch.Click_View_New_2();
//    
//
//    TestModellerLogger.SetLastNodeGuid("58262663-7da0-4ebc-b6ce-addbefb83e25");
//    _New_Supplier_Bill_Batch.Click_New_Supplier_Bill_Batch_3();
//    
//
//    TestModellerLogger.SetLastNodeGuid("7d689181-b6a0-4283-b384-0fee7dbfbd56");
//    _New_Supplier_Bill_Batch.Click_Save_4();
//    
//
//    TestModellerLogger.SetLastNodeGuid("29dd302b-2f78-4f4a-bada-9d003c6cfc4a");
//    _New_Supplier_Bill_Batch.Select_Select_Supplier_5("Default Supplier");
//    
//
//    TestModellerLogger.SetLastNodeGuid("3a80b267-ec05-45cc-ad71-f20b9d59ad8e");
//    _New_Supplier_Bill_Batch.Select_Select_Supplier_Bill_Type_6("DNote");
//    
//
//    TestModellerLogger.SetLastNodeGuid("aaeb0de0-e38e-4288-8b58-c3b26a63b5aa");
//    _New_Supplier_Bill_Batch.Enter_Enter_Bill_No_7("aaaa");
//    
//
//    TestModellerLogger.SetLastNodeGuid("032dd099-ac7a-4797-959b-9f5522973eaf");
//    _New_Supplier_Bill_Batch.Enter_Description_8("Accusantium ratione aut distinctio delectus et.
//Eaque nulla nesciunt non ut quam sunt.
//Commodi est et eum.
//Perferendis dolore vel vel velit qui voluptatem a distinctio.
//Quod consequatur laboriosam eos.
//Vitae iusto animi quasi et quia cum.
//Vel possimus sunt esse non dolore voluptatum.
//Hic ut harum quis dolor.
//Neque praesentium ut iure nam.
//Et esse molestiae eveniet natus asperiores.");
//    
//
//    TestModellerLogger.SetLastNodeGuid("b599506c-7a34-438a-bc21-9664c91b9162");
//    _New_Supplier_Bill_Batch.Enter_Enter_NetTotal_9("3000");
//    
//
//    TestModellerLogger.SetLastNodeGuid("aa35da43-8007-4d5b-9873-08aac9250d5e");
//    _New_Supplier_Bill_Batch.Select_Select_VATRate_10("Reduced Rate");
//    
//
//    TestModellerLogger.SetLastNodeGuid("a88557d3-8751-4d6c-ae45-76caba6b5868");
//    _New_Supplier_Bill_Batch.Click_Save_4();
//    
//
//    }
//
//    @Test  (groups= {"Test_New_Supplier_Bill_Batch","Test_New_Supplier_Bill_Batch - User Stories"})
//    @TestModellerPath(guid = "5b4dbbbc-8fc6-44e5-a14b-d66e61beeb1a")
//    public void GoToUrlAssertUrlClickExpenditure1ClickViewNew2ClickNewSupplierBillBatch3ClickSave4PositiveSel6()
//    {
//        
//        pages.New_Supplier_Bill_Batch _New_Supplier_Bill_Batch = new pages.New_Supplier_Bill_Batch(driver);
//    TestModellerLogger.SetLastNodeGuid("b9ff0052-ab6e-40b3-bb6b-a778b44aac5c");
//    _New_Supplier_Bill_Batch.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("088b664d-2d27-42e0-853a-5cfda9fa4a37");
//    _New_Supplier_Bill_Batch.AssertUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("72db8227-6f33-4f8e-8d1c-30e36fb107f4");
//    _New_Supplier_Bill_Batch.Click_Expenditure1();
//    
//
//    TestModellerLogger.SetLastNodeGuid("bd937bf1-f7d1-46bc-938f-d2207258bb2b");
//    _New_Supplier_Bill_Batch.Click_View_New_2();
//    
//
//    TestModellerLogger.SetLastNodeGuid("58262663-7da0-4ebc-b6ce-addbefb83e25");
//    _New_Supplier_Bill_Batch.Click_New_Supplier_Bill_Batch_3();
//    
//
//    TestModellerLogger.SetLastNodeGuid("7d689181-b6a0-4283-b384-0fee7dbfbd56");
//    _New_Supplier_Bill_Batch.Click_Save_4();
//    
//
//    TestModellerLogger.SetLastNodeGuid("29dd302b-2f78-4f4a-bada-9d003c6cfc4a");
//    _New_Supplier_Bill_Batch.Select_Select_Supplier_5("Default Supplier");
//    
//
//    TestModellerLogger.SetLastNodeGuid("3a80b267-ec05-45cc-ad71-f20b9d59ad8e");
//    _New_Supplier_Bill_Batch.Select_Select_Supplier_Bill_Type_6("DNote");
//    
//
//    TestModellerLogger.SetLastNodeGuid("aaeb0de0-e38e-4288-8b58-c3b26a63b5aa");
//    _New_Supplier_Bill_Batch.Enter_Enter_Bill_No_7("aaaa");
//    
//
//    TestModellerLogger.SetLastNodeGuid("032dd099-ac7a-4797-959b-9f5522973eaf");
//    _New_Supplier_Bill_Batch.Enter_Description_8("Non quia natus.
//Harum suscipit impedit alias.
//Et ipsam sit.
//Amet aut autem id nihil corrupti quibusdam facere.
//Eos fugiat tempora excepturi ullam.
//Qui fugiat tempore vero itaque quia unde eos reprehenderit ab.
//Eaque quasi sit.
//Fugiat et inventore.
//Consectetur est fuga amet adipisci quasi adipisci quia expedita aperiam.
//Maiores sed aperiam dolorem id tempora tenetur praesentium.");
//    
//
//    TestModellerLogger.SetLastNodeGuid("b599506c-7a34-438a-bc21-9664c91b9162");
//    _New_Supplier_Bill_Batch.Enter_Enter_NetTotal_9("3000");
//    
//
//    TestModellerLogger.SetLastNodeGuid("aa35da43-8007-4d5b-9873-08aac9250d5e");
//    _New_Supplier_Bill_Batch.Select_Select_VATRate_10("Out of Scope");
//    
//
//    TestModellerLogger.SetLastNodeGuid("a88557d3-8751-4d6c-ae45-76caba6b5868");
//    _New_Supplier_Bill_Batch.Click_Save_4();
//    
//
//    }
//
//    @Test  (groups= {"Test_New_Supplier_Bill_Batch","Test_New_Supplier_Bill_Batch - User Stories"})
//    @TestModellerPath(guid = "77be7adb-4478-4119-bd4a-f6aa5ec9ec09")
//    public void GoToUrlAssertUrlClickExpenditure1ClickViewNew2ClickNewSupplierBillBatch3ClickSave4PositiveSel7()
//    {
//        
//        pages.New_Supplier_Bill_Batch _New_Supplier_Bill_Batch = new pages.New_Supplier_Bill_Batch(driver);
//    TestModellerLogger.SetLastNodeGuid("b9ff0052-ab6e-40b3-bb6b-a778b44aac5c");
//    _New_Supplier_Bill_Batch.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("088b664d-2d27-42e0-853a-5cfda9fa4a37");
//    _New_Supplier_Bill_Batch.AssertUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("72db8227-6f33-4f8e-8d1c-30e36fb107f4");
//    _New_Supplier_Bill_Batch.Click_Expenditure1();
//    
//
//    TestModellerLogger.SetLastNodeGuid("bd937bf1-f7d1-46bc-938f-d2207258bb2b");
//    _New_Supplier_Bill_Batch.Click_View_New_2();
//    
//
//    TestModellerLogger.SetLastNodeGuid("58262663-7da0-4ebc-b6ce-addbefb83e25");
//    _New_Supplier_Bill_Batch.Click_New_Supplier_Bill_Batch_3();
//    
//
//    TestModellerLogger.SetLastNodeGuid("7d689181-b6a0-4283-b384-0fee7dbfbd56");
//    _New_Supplier_Bill_Batch.Click_Save_4();
//    
//
//    TestModellerLogger.SetLastNodeGuid("29dd302b-2f78-4f4a-bada-9d003c6cfc4a");
//    _New_Supplier_Bill_Batch.Select_Select_Supplier_5("Default Supplier");
//    
//
//    TestModellerLogger.SetLastNodeGuid("3a80b267-ec05-45cc-ad71-f20b9d59ad8e");
//    _New_Supplier_Bill_Batch.Select_Select_Supplier_Bill_Type_6("DNote");
//    
//
//    TestModellerLogger.SetLastNodeGuid("aaeb0de0-e38e-4288-8b58-c3b26a63b5aa");
//    _New_Supplier_Bill_Batch.Enter_Enter_Bill_No_7("aaaa");
//    
//
//    TestModellerLogger.SetLastNodeGuid("032dd099-ac7a-4797-959b-9f5522973eaf");
//    _New_Supplier_Bill_Batch.Enter_Description_8("Provident quidem quod in nobis cumque.
//Qui nihil dolorem nemo voluptates ipsum.
//Odit fugit est facilis deleniti repellendus quod.
//Necessitatibus odit libero et rerum alias dolore est aut.
//Laudantium nam nihil iste doloremque tempora et dolores dolorum totam.
//Corrupti qui vel illum error molestiae quo eum culpa voluptatum.
//Et nobis maxime harum qui dolorum illum ducimus.
//Optio quis molestiae ducimus molestias magni.
//Vitae perspiciatis qui maiores neque enim hic.
//Vel vero magnam voluptatem architecto sed.");
//    
//
//    TestModellerLogger.SetLastNodeGuid("b599506c-7a34-438a-bc21-9664c91b9162");
//    _New_Supplier_Bill_Batch.Enter_Enter_NetTotal_9("3000");
//    
//
//    TestModellerLogger.SetLastNodeGuid("aa35da43-8007-4d5b-9873-08aac9250d5e");
//    _New_Supplier_Bill_Batch.Select_Select_VATRate_10("Domestic Reverse Charge - 20%");
//    
//
//    TestModellerLogger.SetLastNodeGuid("a88557d3-8751-4d6c-ae45-76caba6b5868");
//    _New_Supplier_Bill_Batch.Click_Save_4();
//    
//
//    }
//
}