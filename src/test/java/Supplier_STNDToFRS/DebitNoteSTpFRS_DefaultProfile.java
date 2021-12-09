package Supplier_STNDToFRS;

import reports.TestNGListener;
import tests.TestBase;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ie.curiositysoftware.allocation.dto.ResultMergeMethod;
import ie.curiositysoftware.allocation.dto.DataAllocationRow;
import reports.ExtentTestListener;
import ie.curiositysoftware.allocation.dto.DataAllocationResult;
import ie.curiositysoftware.allocation.engine.DataAllocation;
import utilities.testmodeller.TestModellerLogger;

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/529887cf-426f-4d76-9c38-339fd84eb5ba
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1104, profileId = 101004)
public class DebitNoteSTpFRS_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"DebitNoteSTpFRS","DebitNoteSTpFRS - Default Profile"})
    @TestModellerPath(guid = "d8b1aa26-1fa1-4a71-bb92-8326e4ddb2d4")
    public void GoToUrlAssertUrlClickExpenditureTABClickNewTABClickNewDebitNotePositiveSelectSupplierNameEnte1() throws HeadlessException, IOException, AWTException, InterruptedException
    {
        
        Supplier_pages.DebitNoteSToFRS _DebitNoteSToFRS = new Supplier_pages.DebitNoteSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("a9ac356a-1ff8-48d1-98c6-5613b1e1ba5a");
    _DebitNoteSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("281ed0ae-1966-4313-83f9-f02959a1af8f");
    _DebitNoteSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f4ead229-e1a6-4686-9726-2a8d72975380");
    _DebitNoteSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("13d7978e-e074-45d2-8c0b-01b123aa6311");
    _DebitNoteSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("e0eca6d7-6b04-416d-855d-2a9e825dcd28");
    _DebitNoteSToFRS.Click_NewDebitNote();
    

    TestModellerLogger.SetLastNodeGuid("190c6323-be0b-4dd1-b552-dbe6423a4af8");
    _DebitNoteSToFRS.Select_SupplierName("ABCSupplier");
    

    TestModellerLogger.SetLastNodeGuid("c9f1fef7-60b9-4d4b-a4a0-825e5638fb6e");
    _DebitNoteSToFRS.Enter_BillNo(null);
    

    TestModellerLogger.SetLastNodeGuid("a8f7d6e5-89f8-4f36-a154-0755a90aa5e9");
    _DebitNoteSToFRS.Enter_Date("44250");
    

    TestModellerLogger.SetLastNodeGuid("d0e22573-153e-435a-8026-8e497c35f9ee");
    _DebitNoteSToFRS.Select_ExpenseType("");
    

    TestModellerLogger.SetLastNodeGuid("3f663a04-c82a-4f31-a2c8-3238da8ddb0c");
    _DebitNoteSToFRS.Enter_Description("asdsa");
    

    TestModellerLogger.SetLastNodeGuid("3b383dc0-235e-4780-9859-f151196feb92");
    _DebitNoteSToFRS.Enter_UnitPrice(null);
    

    TestModellerLogger.SetLastNodeGuid("62f8964d-0533-4137-b19f-ed7484c16874");
    _DebitNoteSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("0c1c1062-a24e-491f-b466-c4f25be009dc");
    _DebitNoteSToFRS.Enter_VATRate(null);
    

    TestModellerLogger.SetLastNodeGuid("df34f121-e6c7-4386-b83d-071d26d7877e");
    _DebitNoteSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("d9ad9e73-0fa4-4130-8856-5d6c154b68b4");
    _DebitNoteSToFRS.Enter_Amount_Net("100");
    

    TestModellerLogger.SetLastNodeGuid("afe47079-aab8-40ac-8075-8edfd92c146a");
    _DebitNoteSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("093d78cf-a676-401c-9139-02e7e7db005f");
    _DebitNoteSToFRS.Click__Save_();
    

    }

    @Test  (groups= {"DebitNoteSTpFRS","DebitNoteSTpFRS - Default Profile"})
    @TestModellerPath(guid = "a2fb3d9d-258b-49f4-9651-3f73538a63a9")
    public void GoToUrlAssertUrlClickExpenditureTABClickNewTABClickNewDebitNotePositiveSelectSupplierNameEnte2() throws HeadlessException, IOException, AWTException, InterruptedException
    {
        
    	Supplier_pages.DebitNoteSToFRS _DebitNoteSToFRS = new Supplier_pages.DebitNoteSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("a9ac356a-1ff8-48d1-98c6-5613b1e1ba5a");
    _DebitNoteSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("281ed0ae-1966-4313-83f9-f02959a1af8f");
    _DebitNoteSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f4ead229-e1a6-4686-9726-2a8d72975380");
    _DebitNoteSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("13d7978e-e074-45d2-8c0b-01b123aa6311");
    _DebitNoteSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("e0eca6d7-6b04-416d-855d-2a9e825dcd28");
    _DebitNoteSToFRS.Click_NewDebitNote();
    

    TestModellerLogger.SetLastNodeGuid("190c6323-be0b-4dd1-b552-dbe6423a4af8");
    _DebitNoteSToFRS.Select_SupplierName("ABCSupplier");
    

    TestModellerLogger.SetLastNodeGuid("c9f1fef7-60b9-4d4b-a4a0-825e5638fb6e");
    _DebitNoteSToFRS.Enter_BillNo(null);
    

    TestModellerLogger.SetLastNodeGuid("a8f7d6e5-89f8-4f36-a154-0755a90aa5e9");
    _DebitNoteSToFRS.Enter_Date("44250");
    

    TestModellerLogger.SetLastNodeGuid("d0e22573-153e-435a-8026-8e497c35f9ee");
    _DebitNoteSToFRS.Select_ExpenseType("");
    

    TestModellerLogger.SetLastNodeGuid("3f663a04-c82a-4f31-a2c8-3238da8ddb0c");
    _DebitNoteSToFRS.Enter_Description("asdasd");
    

    TestModellerLogger.SetLastNodeGuid("3b383dc0-235e-4780-9859-f151196feb92");
    _DebitNoteSToFRS.Enter_UnitPrice(null);
    

    TestModellerLogger.SetLastNodeGuid("62f8964d-0533-4137-b19f-ed7484c16874");
    _DebitNoteSToFRS.Select_VATRateType("Zero Rate");
    

    TestModellerLogger.SetLastNodeGuid("0c1c1062-a24e-491f-b466-c4f25be009dc");
    _DebitNoteSToFRS.Enter_VATRate(null);
    

    TestModellerLogger.SetLastNodeGuid("df34f121-e6c7-4386-b83d-071d26d7877e");
    _DebitNoteSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("d9ad9e73-0fa4-4130-8856-5d6c154b68b4");
    _DebitNoteSToFRS.Enter_Amount_Net("100");
    

    TestModellerLogger.SetLastNodeGuid("afe47079-aab8-40ac-8075-8edfd92c146a");
    _DebitNoteSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("093d78cf-a676-401c-9139-02e7e7db005f");
    _DebitNoteSToFRS.Click__Save_();
    

    }

    @Test  (groups= {"DebitNoteSTpFRS","DebitNoteSTpFRS - Default Profile"})
    @TestModellerPath(guid = "1186b487-52ee-4a15-b01f-9f33310e6c0c")
    public void GoToUrlAssertUrlClickExpenditureTABClickNewTABClickNewDebitNotePositiveSelectSupplierNameEnte3() throws HeadlessException, IOException, AWTException, InterruptedException
    {
        
    	Supplier_pages.DebitNoteSToFRS _DebitNoteSToFRS = new Supplier_pages.DebitNoteSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("a9ac356a-1ff8-48d1-98c6-5613b1e1ba5a");
    _DebitNoteSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("281ed0ae-1966-4313-83f9-f02959a1af8f");
    _DebitNoteSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f4ead229-e1a6-4686-9726-2a8d72975380");
    _DebitNoteSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("13d7978e-e074-45d2-8c0b-01b123aa6311");
    _DebitNoteSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("e0eca6d7-6b04-416d-855d-2a9e825dcd28");
    _DebitNoteSToFRS.Click_NewDebitNote();
    

    TestModellerLogger.SetLastNodeGuid("190c6323-be0b-4dd1-b552-dbe6423a4af8");
    _DebitNoteSToFRS.Select_SupplierName("ABCSupplier");
    

    TestModellerLogger.SetLastNodeGuid("c9f1fef7-60b9-4d4b-a4a0-825e5638fb6e");
    _DebitNoteSToFRS.Enter_BillNo(null);
    

    TestModellerLogger.SetLastNodeGuid("a8f7d6e5-89f8-4f36-a154-0755a90aa5e9");
    _DebitNoteSToFRS.Enter_Date("44250");
    

    TestModellerLogger.SetLastNodeGuid("d0e22573-153e-435a-8026-8e497c35f9ee");
    _DebitNoteSToFRS.Select_ExpenseType("");
    

    TestModellerLogger.SetLastNodeGuid("3f663a04-c82a-4f31-a2c8-3238da8ddb0c");
    _DebitNoteSToFRS.Enter_Description("dsadsa");
    

    TestModellerLogger.SetLastNodeGuid("3b383dc0-235e-4780-9859-f151196feb92");
    _DebitNoteSToFRS.Enter_UnitPrice(null);
    

    TestModellerLogger.SetLastNodeGuid("62f8964d-0533-4137-b19f-ed7484c16874");
    _DebitNoteSToFRS.Select_VATRateType("Reduced Rate");
    

    TestModellerLogger.SetLastNodeGuid("0c1c1062-a24e-491f-b466-c4f25be009dc");
    _DebitNoteSToFRS.Enter_VATRate(null);
    

    TestModellerLogger.SetLastNodeGuid("df34f121-e6c7-4386-b83d-071d26d7877e");
    _DebitNoteSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("d9ad9e73-0fa4-4130-8856-5d6c154b68b4");
    _DebitNoteSToFRS.Enter_Amount_Net("100");
    

    TestModellerLogger.SetLastNodeGuid("afe47079-aab8-40ac-8075-8edfd92c146a");
    _DebitNoteSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("093d78cf-a676-401c-9139-02e7e7db005f");
    _DebitNoteSToFRS.Click__Save_();
    

    }

    @Test  (groups= {"DebitNoteSTpFRS","DebitNoteSTpFRS - Default Profile"})
    @TestModellerPath(guid = "ddcb45fb-bd27-4025-a2d2-b969dac6e3a9")
    public void GoToUrlAssertUrlClickExpenditureTABClickNewTABClickNewDebitNotePositiveSelectSupplierNameEnte4() throws HeadlessException, IOException, AWTException, InterruptedException
    {
        
    	Supplier_pages.DebitNoteSToFRS _DebitNoteSToFRS = new Supplier_pages.DebitNoteSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("a9ac356a-1ff8-48d1-98c6-5613b1e1ba5a");
    _DebitNoteSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("281ed0ae-1966-4313-83f9-f02959a1af8f");
    _DebitNoteSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f4ead229-e1a6-4686-9726-2a8d72975380");
    _DebitNoteSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("13d7978e-e074-45d2-8c0b-01b123aa6311");
    _DebitNoteSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("e0eca6d7-6b04-416d-855d-2a9e825dcd28");
    _DebitNoteSToFRS.Click_NewDebitNote();
    

    TestModellerLogger.SetLastNodeGuid("190c6323-be0b-4dd1-b552-dbe6423a4af8");
    _DebitNoteSToFRS.Select_SupplierName("ABCSupplier");
    

    TestModellerLogger.SetLastNodeGuid("c9f1fef7-60b9-4d4b-a4a0-825e5638fb6e");
    _DebitNoteSToFRS.Enter_BillNo(null);
    

    TestModellerLogger.SetLastNodeGuid("a8f7d6e5-89f8-4f36-a154-0755a90aa5e9");
    _DebitNoteSToFRS.Enter_Date("44250");
    

    TestModellerLogger.SetLastNodeGuid("d0e22573-153e-435a-8026-8e497c35f9ee");
    _DebitNoteSToFRS.Select_ExpenseType("");
    

    TestModellerLogger.SetLastNodeGuid("3f663a04-c82a-4f31-a2c8-3238da8ddb0c");
    _DebitNoteSToFRS.Enter_Description("sdasd");
    

    TestModellerLogger.SetLastNodeGuid("3b383dc0-235e-4780-9859-f151196feb92");
    _DebitNoteSToFRS.Enter_UnitPrice(null);
    

    TestModellerLogger.SetLastNodeGuid("62f8964d-0533-4137-b19f-ed7484c16874");
    _DebitNoteSToFRS.Select_VATRateType("No VAT");
    

    TestModellerLogger.SetLastNodeGuid("0c1c1062-a24e-491f-b466-c4f25be009dc");
    _DebitNoteSToFRS.Enter_VATRate(null);
    

    TestModellerLogger.SetLastNodeGuid("df34f121-e6c7-4386-b83d-071d26d7877e");
    _DebitNoteSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("d9ad9e73-0fa4-4130-8856-5d6c154b68b4");
    _DebitNoteSToFRS.Enter_Amount_Net("100");
    

    TestModellerLogger.SetLastNodeGuid("afe47079-aab8-40ac-8075-8edfd92c146a");
    _DebitNoteSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("093d78cf-a676-401c-9139-02e7e7db005f");
    _DebitNoteSToFRS.Click__Save_();
    

    }

    @Test  (groups= {"DebitNoteSTpFRS","DebitNoteSTpFRS - Default Profile"})
    @TestModellerPath(guid = "57461ecb-d74e-4a6b-8a0c-0f64382ebf83")
    public void GoToUrlAssertUrlClickExpenditureTABClickNewTABClickNewDebitNotePositiveSelectSupplierNameEnte5() throws HeadlessException, IOException, AWTException, InterruptedException
    {
        
    	Supplier_pages.DebitNoteSToFRS _DebitNoteSToFRS = new Supplier_pages.DebitNoteSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("a9ac356a-1ff8-48d1-98c6-5613b1e1ba5a");
    _DebitNoteSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("281ed0ae-1966-4313-83f9-f02959a1af8f");
    _DebitNoteSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f4ead229-e1a6-4686-9726-2a8d72975380");
    _DebitNoteSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("13d7978e-e074-45d2-8c0b-01b123aa6311");
    _DebitNoteSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("e0eca6d7-6b04-416d-855d-2a9e825dcd28");
    _DebitNoteSToFRS.Click_NewDebitNote();
    

    TestModellerLogger.SetLastNodeGuid("190c6323-be0b-4dd1-b552-dbe6423a4af8");
    _DebitNoteSToFRS.Select_SupplierName("ABCSupplier");
    

    TestModellerLogger.SetLastNodeGuid("c9f1fef7-60b9-4d4b-a4a0-825e5638fb6e");
    _DebitNoteSToFRS.Enter_BillNo(null);
    

    TestModellerLogger.SetLastNodeGuid("a8f7d6e5-89f8-4f36-a154-0755a90aa5e9");
    _DebitNoteSToFRS.Enter_Date("44250");
    

    TestModellerLogger.SetLastNodeGuid("d0e22573-153e-435a-8026-8e497c35f9ee");
    _DebitNoteSToFRS.Select_ExpenseType("");
    

    TestModellerLogger.SetLastNodeGuid("3f663a04-c82a-4f31-a2c8-3238da8ddb0c");
    _DebitNoteSToFRS.Enter_Description("fdsfds");
    

    TestModellerLogger.SetLastNodeGuid("3b383dc0-235e-4780-9859-f151196feb92");
    _DebitNoteSToFRS.Enter_UnitPrice(null);
    

    TestModellerLogger.SetLastNodeGuid("62f8964d-0533-4137-b19f-ed7484c16874");
    _DebitNoteSToFRS.Select_VATRateType("Exempt");
    

    TestModellerLogger.SetLastNodeGuid("0c1c1062-a24e-491f-b466-c4f25be009dc");
    _DebitNoteSToFRS.Enter_VATRate(null);
    

    TestModellerLogger.SetLastNodeGuid("df34f121-e6c7-4386-b83d-071d26d7877e");
    _DebitNoteSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("d9ad9e73-0fa4-4130-8856-5d6c154b68b4");
    _DebitNoteSToFRS.Enter_Amount_Net("100");
    

    TestModellerLogger.SetLastNodeGuid("afe47079-aab8-40ac-8075-8edfd92c146a");
    _DebitNoteSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("093d78cf-a676-401c-9139-02e7e7db005f");
    _DebitNoteSToFRS.Click__Save_();
    

    }

    @Test  (groups= {"DebitNoteSTpFRS","DebitNoteSTpFRS - Default Profile"})
    @TestModellerPath(guid = "eeae2a53-be8a-4404-886a-489cd632ca18")
    public void GoToUrlAssertUrlClickExpenditureTABClickNewTABClickNewDebitNotePositiveSelectSupplierNameEnte6() throws HeadlessException, IOException, AWTException, InterruptedException
    {
        
    	Supplier_pages.DebitNoteSToFRS _DebitNoteSToFRS = new Supplier_pages.DebitNoteSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("a9ac356a-1ff8-48d1-98c6-5613b1e1ba5a");
    _DebitNoteSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("281ed0ae-1966-4313-83f9-f02959a1af8f");
    _DebitNoteSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f4ead229-e1a6-4686-9726-2a8d72975380");
    _DebitNoteSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("13d7978e-e074-45d2-8c0b-01b123aa6311");
    _DebitNoteSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("e0eca6d7-6b04-416d-855d-2a9e825dcd28");
    _DebitNoteSToFRS.Click_NewDebitNote();
    

    TestModellerLogger.SetLastNodeGuid("190c6323-be0b-4dd1-b552-dbe6423a4af8");
    _DebitNoteSToFRS.Select_SupplierName("ABCSupplier");
    

    TestModellerLogger.SetLastNodeGuid("c9f1fef7-60b9-4d4b-a4a0-825e5638fb6e");
    _DebitNoteSToFRS.Enter_BillNo(null);
    

    TestModellerLogger.SetLastNodeGuid("a8f7d6e5-89f8-4f36-a154-0755a90aa5e9");
    _DebitNoteSToFRS.Enter_Date("44250");
    

    TestModellerLogger.SetLastNodeGuid("d0e22573-153e-435a-8026-8e497c35f9ee");
    _DebitNoteSToFRS.Select_ExpenseType("");
    

    TestModellerLogger.SetLastNodeGuid("3f663a04-c82a-4f31-a2c8-3238da8ddb0c");
    _DebitNoteSToFRS.Enter_Description("dafa");
    

    TestModellerLogger.SetLastNodeGuid("3b383dc0-235e-4780-9859-f151196feb92");
    _DebitNoteSToFRS.Enter_UnitPrice(null);
    

    TestModellerLogger.SetLastNodeGuid("62f8964d-0533-4137-b19f-ed7484c16874");
    _DebitNoteSToFRS.Select_VATRateType("Out of Scope");
    

    TestModellerLogger.SetLastNodeGuid("0c1c1062-a24e-491f-b466-c4f25be009dc");
    _DebitNoteSToFRS.Enter_VATRate(null);
    

    TestModellerLogger.SetLastNodeGuid("df34f121-e6c7-4386-b83d-071d26d7877e");
    _DebitNoteSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("d9ad9e73-0fa4-4130-8856-5d6c154b68b4");
    _DebitNoteSToFRS.Enter_Amount_Net("100");
    

    TestModellerLogger.SetLastNodeGuid("afe47079-aab8-40ac-8075-8edfd92c146a");
    _DebitNoteSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("093d78cf-a676-401c-9139-02e7e7db005f");
    _DebitNoteSToFRS.Click__Save_();
    

    }

   /* @Test  (groups= {"DebitNoteSTpFRS","DebitNoteSTpFRS - Default Profile"})
    @TestModellerPath(guid = "38feb6b9-ca4e-49f2-bb31-1dcd46118cd1")
    public void GoToUrlAssertUrlClickExpenditureTABClickNewTABClickNewDebitNotePositiveSelectSupplierNameEnte7()
    {
        
        pages.DebitNoteSToFRS _DebitNoteSToFRS = new pages.DebitNoteSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("a9ac356a-1ff8-48d1-98c6-5613b1e1ba5a");
    _DebitNoteSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("281ed0ae-1966-4313-83f9-f02959a1af8f");
    _DebitNoteSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f4ead229-e1a6-4686-9726-2a8d72975380");
    _DebitNoteSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("13d7978e-e074-45d2-8c0b-01b123aa6311");
    _DebitNoteSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("e0eca6d7-6b04-416d-855d-2a9e825dcd28");
    _DebitNoteSToFRS.Click_NewDebitNote();
    

    TestModellerLogger.SetLastNodeGuid("190c6323-be0b-4dd1-b552-dbe6423a4af8");
    _DebitNoteSToFRS.Select_SupplierName("ABCSupplier");
    

    TestModellerLogger.SetLastNodeGuid("c9f1fef7-60b9-4d4b-a4a0-825e5638fb6e");
    _DebitNoteSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("a8f7d6e5-89f8-4f36-a154-0755a90aa5e9");
    _DebitNoteSToFRS.Enter_Date("44250");
    

    TestModellerLogger.SetLastNodeGuid("d0e22573-153e-435a-8026-8e497c35f9ee");
    _DebitNoteSToFRS.Select_ExpenseType("Purchases");
    

    TestModellerLogger.SetLastNodeGuid("3f663a04-c82a-4f31-a2c8-3238da8ddb0c");
    _DebitNoteSToFRS.Enter_Description("Sint asperiores sed non libero deleniti quis est saepe distinctio.
Quibusdam inventore ipsum adipisci nobis velit alias.
Dolorem voluptatem quo.
Tempora est eaque ipsa necessitatibus consequuntur cupiditate.
Nostrum doloribus molestiae amet.
Voluptas explicabo vitae repudiandae ex non repellendus assumenda.
Molestiae ullam voluptas iusto.
Sed ut amet dicta.
Beatae qui reiciendis voluptas et iusto atque.
Consequatur dignissimos veniam aut magni maiores ut ex.");
    

    TestModellerLogger.SetLastNodeGuid("3b383dc0-235e-4780-9859-f151196feb92");
    _DebitNoteSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("62f8964d-0533-4137-b19f-ed7484c16874");
    _DebitNoteSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("0c1c1062-a24e-491f-b466-c4f25be009dc");
    _DebitNoteSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("df34f121-e6c7-4386-b83d-071d26d7877e");
    _DebitNoteSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("d9ad9e73-0fa4-4130-8856-5d6c154b68b4");
    _DebitNoteSToFRS.Enter_Amount_Net("100");
    

    TestModellerLogger.SetLastNodeGuid("afe47079-aab8-40ac-8075-8edfd92c146a");
    _DebitNoteSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("093d78cf-a676-401c-9139-02e7e7db005f");
    _DebitNoteSToFRS.Click__Save_();
    

    }

    @Test  (groups= {"DebitNoteSTpFRS","DebitNoteSTpFRS - Default Profile"})
    @TestModellerPath(guid = "8d0c0599-b157-448b-9ff8-096193a4aab7")
    public void GoToUrlAssertUrlClickExpenditureTABClickNewTABClickNewDebitNotePositiveSelectSupplierNameEnte8()
    {
        
        pages.DebitNoteSToFRS _DebitNoteSToFRS = new pages.DebitNoteSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("a9ac356a-1ff8-48d1-98c6-5613b1e1ba5a");
    _DebitNoteSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("281ed0ae-1966-4313-83f9-f02959a1af8f");
    _DebitNoteSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f4ead229-e1a6-4686-9726-2a8d72975380");
    _DebitNoteSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("13d7978e-e074-45d2-8c0b-01b123aa6311");
    _DebitNoteSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("e0eca6d7-6b04-416d-855d-2a9e825dcd28");
    _DebitNoteSToFRS.Click_NewDebitNote();
    

    TestModellerLogger.SetLastNodeGuid("190c6323-be0b-4dd1-b552-dbe6423a4af8");
    _DebitNoteSToFRS.Select_SupplierName("ABCSupplier");
    

    TestModellerLogger.SetLastNodeGuid("c9f1fef7-60b9-4d4b-a4a0-825e5638fb6e");
    _DebitNoteSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("a8f7d6e5-89f8-4f36-a154-0755a90aa5e9");
    _DebitNoteSToFRS.Enter_Date("44250");
    

    TestModellerLogger.SetLastNodeGuid("d0e22573-153e-435a-8026-8e497c35f9ee");
    _DebitNoteSToFRS.Select_ExpenseType("Subcontractors");
    

    TestModellerLogger.SetLastNodeGuid("3f663a04-c82a-4f31-a2c8-3238da8ddb0c");
    _DebitNoteSToFRS.Enter_Description("Sint sequi consequatur.
Ab eum illo.
Quod velit qui repudiandae doloribus magnam odit ut ea.
Quaerat aliquid aliquam.
Voluptatum officiis natus quam quia necessitatibus.
Ipsum at eveniet.
Et ab doloremque ad blanditiis doloremque similique et vitae.
Labore aperiam minus vel adipisci dolor ut assumenda aut minima.
Pariatur praesentium soluta.
Unde harum quas neque rerum similique nisi iste inventore iste.");
    

    TestModellerLogger.SetLastNodeGuid("3b383dc0-235e-4780-9859-f151196feb92");
    _DebitNoteSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("62f8964d-0533-4137-b19f-ed7484c16874");
    _DebitNoteSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("0c1c1062-a24e-491f-b466-c4f25be009dc");
    _DebitNoteSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("df34f121-e6c7-4386-b83d-071d26d7877e");
    _DebitNoteSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("d9ad9e73-0fa4-4130-8856-5d6c154b68b4");
    _DebitNoteSToFRS.Enter_Amount_Net("100");
    

    TestModellerLogger.SetLastNodeGuid("afe47079-aab8-40ac-8075-8edfd92c146a");
    _DebitNoteSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("093d78cf-a676-401c-9139-02e7e7db005f");
    _DebitNoteSToFRS.Click__Save_();
    

    }

    @Test  (groups= {"DebitNoteSTpFRS","DebitNoteSTpFRS - Default Profile"})
    @TestModellerPath(guid = "9960987d-2c49-4ec5-8fe4-3ae20945ed9f")
    public void GoToUrlAssertUrlClickExpenditureTABClickNewTABClickNewDebitNotePositiveSelectSupplierNameEnte9()
    {
        
        pages.DebitNoteSToFRS _DebitNoteSToFRS = new pages.DebitNoteSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("a9ac356a-1ff8-48d1-98c6-5613b1e1ba5a");
    _DebitNoteSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("281ed0ae-1966-4313-83f9-f02959a1af8f");
    _DebitNoteSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f4ead229-e1a6-4686-9726-2a8d72975380");
    _DebitNoteSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("13d7978e-e074-45d2-8c0b-01b123aa6311");
    _DebitNoteSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("e0eca6d7-6b04-416d-855d-2a9e825dcd28");
    _DebitNoteSToFRS.Click_NewDebitNote();
    

    TestModellerLogger.SetLastNodeGuid("190c6323-be0b-4dd1-b552-dbe6423a4af8");
    _DebitNoteSToFRS.Select_SupplierName("ABCSupplier");
    

    TestModellerLogger.SetLastNodeGuid("c9f1fef7-60b9-4d4b-a4a0-825e5638fb6e");
    _DebitNoteSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("a8f7d6e5-89f8-4f36-a154-0755a90aa5e9");
    _DebitNoteSToFRS.Enter_Date("44250");
    

    TestModellerLogger.SetLastNodeGuid("d0e22573-153e-435a-8026-8e497c35f9ee");
    _DebitNoteSToFRS.Select_ExpenseType("Accountancy fee");
    

    TestModellerLogger.SetLastNodeGuid("3f663a04-c82a-4f31-a2c8-3238da8ddb0c");
    _DebitNoteSToFRS.Enter_Description("Architecto et et beatae.
Molestiae ipsum similique labore quo eum ipsa magni.
Eius in aut et pariatur culpa deserunt aliquid.
Voluptates qui veritatis possimus odio.
Saepe deleniti cum qui repellat.
Ad et aut.
Culpa cum saepe odio aspernatur quisquam deserunt.
Blanditiis nihil ipsum quis itaque quia.
Est quisquam nostrum asperiores soluta et libero minus magnam ut.
Sequi eius magni animi earum.");
    

    TestModellerLogger.SetLastNodeGuid("3b383dc0-235e-4780-9859-f151196feb92");
    _DebitNoteSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("62f8964d-0533-4137-b19f-ed7484c16874");
    _DebitNoteSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("0c1c1062-a24e-491f-b466-c4f25be009dc");
    _DebitNoteSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("df34f121-e6c7-4386-b83d-071d26d7877e");
    _DebitNoteSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("d9ad9e73-0fa4-4130-8856-5d6c154b68b4");
    _DebitNoteSToFRS.Enter_Amount_Net("100");
    

    TestModellerLogger.SetLastNodeGuid("afe47079-aab8-40ac-8075-8edfd92c146a");
    _DebitNoteSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("093d78cf-a676-401c-9139-02e7e7db005f");
    _DebitNoteSToFRS.Click__Save_();
    

    }

    @Test  (groups= {"DebitNoteSTpFRS","DebitNoteSTpFRS - Default Profile"})
    @TestModellerPath(guid = "74afbfd8-f5c0-44ca-b281-8211c5fc4b7e")
    public void GoToUrlAssertUrlClickExpenditureTABClickNewTABClickNewDebitNotePositiveSelectSupplierNameEnt10()
    {
        
        pages.DebitNoteSToFRS _DebitNoteSToFRS = new pages.DebitNoteSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("a9ac356a-1ff8-48d1-98c6-5613b1e1ba5a");
    _DebitNoteSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("281ed0ae-1966-4313-83f9-f02959a1af8f");
    _DebitNoteSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f4ead229-e1a6-4686-9726-2a8d72975380");
    _DebitNoteSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("13d7978e-e074-45d2-8c0b-01b123aa6311");
    _DebitNoteSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("e0eca6d7-6b04-416d-855d-2a9e825dcd28");
    _DebitNoteSToFRS.Click_NewDebitNote();
    

    TestModellerLogger.SetLastNodeGuid("190c6323-be0b-4dd1-b552-dbe6423a4af8");
    _DebitNoteSToFRS.Select_SupplierName("ABCSupplier");
    

    TestModellerLogger.SetLastNodeGuid("c9f1fef7-60b9-4d4b-a4a0-825e5638fb6e");
    _DebitNoteSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("a8f7d6e5-89f8-4f36-a154-0755a90aa5e9");
    _DebitNoteSToFRS.Enter_Date("44250");
    

    TestModellerLogger.SetLastNodeGuid("d0e22573-153e-435a-8026-8e497c35f9ee");
    _DebitNoteSToFRS.Select_ExpenseType("Advertising, sales promotion, marketing");
    

    TestModellerLogger.SetLastNodeGuid("3f663a04-c82a-4f31-a2c8-3238da8ddb0c");
    _DebitNoteSToFRS.Enter_Description("Ipsum doloremque enim ut cumque voluptates labore.
Aut est corporis sit.
Occaecati perspiciatis totam pariatur.
Iure maiores accusamus quia a voluptates.
Rerum explicabo quod similique quis et at deleniti rerum sed.
Itaque quasi voluptates consequatur ab consequatur officiis earum commodi quo.
Dolorem illum nobis.
Quod numquam a distinctio quae.
Commodi tenetur inventore.
Dolores dolorum et dignissimos qui ut molestias voluptatem quidem.");
    

    TestModellerLogger.SetLastNodeGuid("3b383dc0-235e-4780-9859-f151196feb92");
    _DebitNoteSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("62f8964d-0533-4137-b19f-ed7484c16874");
    _DebitNoteSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("0c1c1062-a24e-491f-b466-c4f25be009dc");
    _DebitNoteSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("df34f121-e6c7-4386-b83d-071d26d7877e");
    _DebitNoteSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("d9ad9e73-0fa4-4130-8856-5d6c154b68b4");
    _DebitNoteSToFRS.Enter_Amount_Net("100");
    

    TestModellerLogger.SetLastNodeGuid("afe47079-aab8-40ac-8075-8edfd92c146a");
    _DebitNoteSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("093d78cf-a676-401c-9139-02e7e7db005f");
    _DebitNoteSToFRS.Click__Save_();
    

    }

    @Test  (groups= {"DebitNoteSTpFRS","DebitNoteSTpFRS - Default Profile"})
    @TestModellerPath(guid = "4f8ff351-652e-49d7-9a2e-f74fa988ffc1")
    public void GoToUrlAssertUrlClickExpenditureTABClickNewTABClickNewDebitNotePositiveSelectSupplierNameEnt11()
    {
        
        pages.DebitNoteSToFRS _DebitNoteSToFRS = new pages.DebitNoteSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("a9ac356a-1ff8-48d1-98c6-5613b1e1ba5a");
    _DebitNoteSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("281ed0ae-1966-4313-83f9-f02959a1af8f");
    _DebitNoteSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f4ead229-e1a6-4686-9726-2a8d72975380");
    _DebitNoteSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("13d7978e-e074-45d2-8c0b-01b123aa6311");
    _DebitNoteSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("e0eca6d7-6b04-416d-855d-2a9e825dcd28");
    _DebitNoteSToFRS.Click_NewDebitNote();
    

    TestModellerLogger.SetLastNodeGuid("190c6323-be0b-4dd1-b552-dbe6423a4af8");
    _DebitNoteSToFRS.Select_SupplierName("ABCSupplier");
    

    TestModellerLogger.SetLastNodeGuid("c9f1fef7-60b9-4d4b-a4a0-825e5638fb6e");
    _DebitNoteSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("a8f7d6e5-89f8-4f36-a154-0755a90aa5e9");
    _DebitNoteSToFRS.Enter_Date("44250");
    

    TestModellerLogger.SetLastNodeGuid("d0e22573-153e-435a-8026-8e497c35f9ee");
    _DebitNoteSToFRS.Select_ExpenseType("Bank, card and overdraft charges");
    

    TestModellerLogger.SetLastNodeGuid("3f663a04-c82a-4f31-a2c8-3238da8ddb0c");
    _DebitNoteSToFRS.Enter_Description("Omnis deleniti in recusandae veritatis dolore perferendis.
Ut sed ut et aut alias et.
Occaecati reiciendis sequi fugiat in fugit pariatur asperiores.
Amet dignissimos et repudiandae ipsum mollitia quas.
Sequi deserunt quaerat rerum.
Animi quibusdam illo.
Quisquam cupiditate unde in quod molestiae earum vel sit.
Dolorem et tenetur nam harum culpa vel.
Aut sint et veritatis itaque omnis quod est velit.
Asperiores dolores autem ex.");
    

    TestModellerLogger.SetLastNodeGuid("3b383dc0-235e-4780-9859-f151196feb92");
    _DebitNoteSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("62f8964d-0533-4137-b19f-ed7484c16874");
    _DebitNoteSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("0c1c1062-a24e-491f-b466-c4f25be009dc");
    _DebitNoteSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("df34f121-e6c7-4386-b83d-071d26d7877e");
    _DebitNoteSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("d9ad9e73-0fa4-4130-8856-5d6c154b68b4");
    _DebitNoteSToFRS.Enter_Amount_Net("100");
    

    TestModellerLogger.SetLastNodeGuid("afe47079-aab8-40ac-8075-8edfd92c146a");
    _DebitNoteSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("093d78cf-a676-401c-9139-02e7e7db005f");
    _DebitNoteSToFRS.Click__Save_();
    

    }

    @Test  (groups= {"DebitNoteSTpFRS","DebitNoteSTpFRS - Default Profile"})
    @TestModellerPath(guid = "8608c7e3-b9d5-425d-93a2-7d998c5f4f9a")
    public void GoToUrlAssertUrlClickExpenditureTABClickNewTABClickNewDebitNotePositiveSelectSupplierNameEnt12()
    {
        
        pages.DebitNoteSToFRS _DebitNoteSToFRS = new pages.DebitNoteSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("a9ac356a-1ff8-48d1-98c6-5613b1e1ba5a");
    _DebitNoteSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("281ed0ae-1966-4313-83f9-f02959a1af8f");
    _DebitNoteSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f4ead229-e1a6-4686-9726-2a8d72975380");
    _DebitNoteSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("13d7978e-e074-45d2-8c0b-01b123aa6311");
    _DebitNoteSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("e0eca6d7-6b04-416d-855d-2a9e825dcd28");
    _DebitNoteSToFRS.Click_NewDebitNote();
    

    TestModellerLogger.SetLastNodeGuid("190c6323-be0b-4dd1-b552-dbe6423a4af8");
    _DebitNoteSToFRS.Select_SupplierName("ABCSupplier");
    

    TestModellerLogger.SetLastNodeGuid("c9f1fef7-60b9-4d4b-a4a0-825e5638fb6e");
    _DebitNoteSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("a8f7d6e5-89f8-4f36-a154-0755a90aa5e9");
    _DebitNoteSToFRS.Enter_Date("44250");
    

    TestModellerLogger.SetLastNodeGuid("d0e22573-153e-435a-8026-8e497c35f9ee");
    _DebitNoteSToFRS.Select_ExpenseType("Business entertaining");
    

    TestModellerLogger.SetLastNodeGuid("3f663a04-c82a-4f31-a2c8-3238da8ddb0c");
    _DebitNoteSToFRS.Enter_Description("Possimus qui voluptas dignissimos reiciendis ducimus perferendis iste aut.
Et laboriosam vel sed.
Et inventore facilis est asperiores ut amet expedita qui repellendus.
Perferendis sit cumque illum occaecati sequi consequatur voluptatem velit.
Corporis eos in nihil autem.
Non voluptates accusamus nihil commodi cupiditate atque laborum itaque at.
Commodi labore similique id quod distinctio ratione iusto.
At veniam harum repudiandae provident ex alias distinctio quia et.
Corporis velit culpa distinctio.
Quo commodi rem quos provident sunt aut libero.");
    

    TestModellerLogger.SetLastNodeGuid("3b383dc0-235e-4780-9859-f151196feb92");
    _DebitNoteSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("62f8964d-0533-4137-b19f-ed7484c16874");
    _DebitNoteSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("0c1c1062-a24e-491f-b466-c4f25be009dc");
    _DebitNoteSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("df34f121-e6c7-4386-b83d-071d26d7877e");
    _DebitNoteSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("d9ad9e73-0fa4-4130-8856-5d6c154b68b4");
    _DebitNoteSToFRS.Enter_Amount_Net("100");
    

    TestModellerLogger.SetLastNodeGuid("afe47079-aab8-40ac-8075-8edfd92c146a");
    _DebitNoteSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("093d78cf-a676-401c-9139-02e7e7db005f");
    _DebitNoteSToFRS.Click__Save_();
    

    }

    @Test  (groups= {"DebitNoteSTpFRS","DebitNoteSTpFRS - Default Profile"})
    @TestModellerPath(guid = "db9522de-3eea-4ee5-8a61-7875e203b6ad")
    public void GoToUrlAssertUrlClickExpenditureTABClickNewTABClickNewDebitNotePositiveSelectSupplierNameEnt13()
    {
        
        pages.DebitNoteSToFRS _DebitNoteSToFRS = new pages.DebitNoteSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("a9ac356a-1ff8-48d1-98c6-5613b1e1ba5a");
    _DebitNoteSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("281ed0ae-1966-4313-83f9-f02959a1af8f");
    _DebitNoteSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f4ead229-e1a6-4686-9726-2a8d72975380");
    _DebitNoteSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("13d7978e-e074-45d2-8c0b-01b123aa6311");
    _DebitNoteSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("e0eca6d7-6b04-416d-855d-2a9e825dcd28");
    _DebitNoteSToFRS.Click_NewDebitNote();
    

    TestModellerLogger.SetLastNodeGuid("190c6323-be0b-4dd1-b552-dbe6423a4af8");
    _DebitNoteSToFRS.Select_SupplierName("ABCSupplier");
    

    TestModellerLogger.SetLastNodeGuid("c9f1fef7-60b9-4d4b-a4a0-825e5638fb6e");
    _DebitNoteSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("a8f7d6e5-89f8-4f36-a154-0755a90aa5e9");
    _DebitNoteSToFRS.Enter_Date("44250");
    

    TestModellerLogger.SetLastNodeGuid("d0e22573-153e-435a-8026-8e497c35f9ee");
    _DebitNoteSToFRS.Select_ExpenseType("Equipment expensed");
    

    TestModellerLogger.SetLastNodeGuid("3f663a04-c82a-4f31-a2c8-3238da8ddb0c");
    _DebitNoteSToFRS.Enter_Description("Dignissimos repellendus et provident error voluptatum aliquam.
Quibusdam odit dolore ad a necessitatibus consequatur occaecati qui quis.
Est ut neque.
Voluptates doloribus doloremque exercitationem tempore earum laudantium voluptas.
Delectus velit dicta sunt autem magni.
Dignissimos doloribus enim ea voluptatum esse rem possimus voluptatum.
Aut impedit et accusamus inventore sequi.
Quia quisquam ut sed sit.
Quae suscipit laboriosam nulla enim perspiciatis et.
Ratione eligendi non similique dolorum eaque.");
    

    TestModellerLogger.SetLastNodeGuid("3b383dc0-235e-4780-9859-f151196feb92");
    _DebitNoteSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("62f8964d-0533-4137-b19f-ed7484c16874");
    _DebitNoteSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("0c1c1062-a24e-491f-b466-c4f25be009dc");
    _DebitNoteSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("df34f121-e6c7-4386-b83d-071d26d7877e");
    _DebitNoteSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("d9ad9e73-0fa4-4130-8856-5d6c154b68b4");
    _DebitNoteSToFRS.Enter_Amount_Net("100");
    

    TestModellerLogger.SetLastNodeGuid("afe47079-aab8-40ac-8075-8edfd92c146a");
    _DebitNoteSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("093d78cf-a676-401c-9139-02e7e7db005f");
    _DebitNoteSToFRS.Click__Save_();
    

    }

    @Test  (groups= {"DebitNoteSTpFRS","DebitNoteSTpFRS - Default Profile"})
    @TestModellerPath(guid = "79fa0eef-0b47-49c6-8be4-b1625456057a")
    public void GoToUrlAssertUrlClickExpenditureTABClickNewTABClickNewDebitNotePositiveSelectSupplierNameEnt14()
    {
        
        pages.DebitNoteSToFRS _DebitNoteSToFRS = new pages.DebitNoteSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("a9ac356a-1ff8-48d1-98c6-5613b1e1ba5a");
    _DebitNoteSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("281ed0ae-1966-4313-83f9-f02959a1af8f");
    _DebitNoteSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f4ead229-e1a6-4686-9726-2a8d72975380");
    _DebitNoteSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("13d7978e-e074-45d2-8c0b-01b123aa6311");
    _DebitNoteSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("e0eca6d7-6b04-416d-855d-2a9e825dcd28");
    _DebitNoteSToFRS.Click_NewDebitNote();
    

    TestModellerLogger.SetLastNodeGuid("190c6323-be0b-4dd1-b552-dbe6423a4af8");
    _DebitNoteSToFRS.Select_SupplierName("ABCSupplier");
    

    TestModellerLogger.SetLastNodeGuid("c9f1fef7-60b9-4d4b-a4a0-825e5638fb6e");
    _DebitNoteSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("a8f7d6e5-89f8-4f36-a154-0755a90aa5e9");
    _DebitNoteSToFRS.Enter_Date("44250");
    

    TestModellerLogger.SetLastNodeGuid("d0e22573-153e-435a-8026-8e497c35f9ee");
    _DebitNoteSToFRS.Select_ExpenseType("Insurance");
    

    TestModellerLogger.SetLastNodeGuid("3f663a04-c82a-4f31-a2c8-3238da8ddb0c");
    _DebitNoteSToFRS.Enter_Description("Amet dolores sint enim qui non ut facere sapiente.
Et quaerat aut ducimus expedita officia tempora.
Voluptate voluptatem quasi dolores similique.
Non tempore aperiam dolorem.
Ad corporis odio.
Occaecati itaque modi.
Voluptatem ea quis.
Culpa autem ipsam.
Quis asperiores voluptatibus corrupti aut ullam.
Numquam est est ab molestiae.");
    

    TestModellerLogger.SetLastNodeGuid("3b383dc0-235e-4780-9859-f151196feb92");
    _DebitNoteSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("62f8964d-0533-4137-b19f-ed7484c16874");
    _DebitNoteSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("0c1c1062-a24e-491f-b466-c4f25be009dc");
    _DebitNoteSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("df34f121-e6c7-4386-b83d-071d26d7877e");
    _DebitNoteSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("d9ad9e73-0fa4-4130-8856-5d6c154b68b4");
    _DebitNoteSToFRS.Enter_Amount_Net("100");
    

    TestModellerLogger.SetLastNodeGuid("afe47079-aab8-40ac-8075-8edfd92c146a");
    _DebitNoteSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("093d78cf-a676-401c-9139-02e7e7db005f");
    _DebitNoteSToFRS.Click__Save_();
    

    }

    @Test  (groups= {"DebitNoteSTpFRS","DebitNoteSTpFRS - Default Profile"})
    @TestModellerPath(guid = "ba9569fb-48b3-434d-93af-35dacbd4678f")
    public void GoToUrlAssertUrlClickExpenditureTABClickNewTABClickNewDebitNotePositiveSelectSupplierNameEnt15()
    {
        
        pages.DebitNoteSToFRS _DebitNoteSToFRS = new pages.DebitNoteSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("a9ac356a-1ff8-48d1-98c6-5613b1e1ba5a");
    _DebitNoteSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("281ed0ae-1966-4313-83f9-f02959a1af8f");
    _DebitNoteSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f4ead229-e1a6-4686-9726-2a8d72975380");
    _DebitNoteSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("13d7978e-e074-45d2-8c0b-01b123aa6311");
    _DebitNoteSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("e0eca6d7-6b04-416d-855d-2a9e825dcd28");
    _DebitNoteSToFRS.Click_NewDebitNote();
    

    TestModellerLogger.SetLastNodeGuid("190c6323-be0b-4dd1-b552-dbe6423a4af8");
    _DebitNoteSToFRS.Select_SupplierName("ABCSupplier");
    

    TestModellerLogger.SetLastNodeGuid("c9f1fef7-60b9-4d4b-a4a0-825e5638fb6e");
    _DebitNoteSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("a8f7d6e5-89f8-4f36-a154-0755a90aa5e9");
    _DebitNoteSToFRS.Enter_Date("44250");
    

    TestModellerLogger.SetLastNodeGuid("d0e22573-153e-435a-8026-8e497c35f9ee");
    _DebitNoteSToFRS.Select_ExpenseType("Membership and subscriptions");
    

    TestModellerLogger.SetLastNodeGuid("3f663a04-c82a-4f31-a2c8-3238da8ddb0c");
    _DebitNoteSToFRS.Enter_Description("Veritatis voluptatem quia qui minus.
Tempora totam qui quis excepturi et error sapiente.
Aperiam amet corrupti possimus magnam facere molestiae cum ab laboriosam.
Aut repellat modi nisi fugiat rerum ullam libero sed non.
Recusandae pariatur est sunt.
Qui impedit rem inventore ut laboriosam in dolor qui velit.
Tempore id eos rem consequuntur.
Qui porro tempora et et qui fuga magni eveniet.
Eligendi quo magnam rerum quasi neque vel dolor delectus.
Minima autem quidem animi quae possimus harum.");
    

    TestModellerLogger.SetLastNodeGuid("3b383dc0-235e-4780-9859-f151196feb92");
    _DebitNoteSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("62f8964d-0533-4137-b19f-ed7484c16874");
    _DebitNoteSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("0c1c1062-a24e-491f-b466-c4f25be009dc");
    _DebitNoteSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("df34f121-e6c7-4386-b83d-071d26d7877e");
    _DebitNoteSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("d9ad9e73-0fa4-4130-8856-5d6c154b68b4");
    _DebitNoteSToFRS.Enter_Amount_Net("100");
    

    TestModellerLogger.SetLastNodeGuid("afe47079-aab8-40ac-8075-8edfd92c146a");
    _DebitNoteSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("093d78cf-a676-401c-9139-02e7e7db005f");
    _DebitNoteSToFRS.Click__Save_();
    

    }

    @Test  (groups= {"DebitNoteSTpFRS","DebitNoteSTpFRS - Default Profile"})
    @TestModellerPath(guid = "4b7f0eb1-37d2-4cbc-9cdd-9e5f5596f7de")
    public void GoToUrlAssertUrlClickExpenditureTABClickNewTABClickNewDebitNotePositiveSelectSupplierNameEnt16()
    {
        
        pages.DebitNoteSToFRS _DebitNoteSToFRS = new pages.DebitNoteSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("a9ac356a-1ff8-48d1-98c6-5613b1e1ba5a");
    _DebitNoteSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("281ed0ae-1966-4313-83f9-f02959a1af8f");
    _DebitNoteSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f4ead229-e1a6-4686-9726-2a8d72975380");
    _DebitNoteSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("13d7978e-e074-45d2-8c0b-01b123aa6311");
    _DebitNoteSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("e0eca6d7-6b04-416d-855d-2a9e825dcd28");
    _DebitNoteSToFRS.Click_NewDebitNote();
    

    TestModellerLogger.SetLastNodeGuid("190c6323-be0b-4dd1-b552-dbe6423a4af8");
    _DebitNoteSToFRS.Select_SupplierName("ABCSupplier");
    

    TestModellerLogger.SetLastNodeGuid("c9f1fef7-60b9-4d4b-a4a0-825e5638fb6e");
    _DebitNoteSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("a8f7d6e5-89f8-4f36-a154-0755a90aa5e9");
    _DebitNoteSToFRS.Enter_Date("44250");
    

    TestModellerLogger.SetLastNodeGuid("d0e22573-153e-435a-8026-8e497c35f9ee");
    _DebitNoteSToFRS.Select_ExpenseType("Postage, stationery, office supplies");
    

    TestModellerLogger.SetLastNodeGuid("3f663a04-c82a-4f31-a2c8-3238da8ddb0c");
    _DebitNoteSToFRS.Enter_Description("Fuga veritatis et quod quasi magni accusantium.
Eos cumque nisi quaerat nulla molestiae rerum in impedit laboriosam.
Iste modi molestias autem ex.
Unde cupiditate ducimus beatae et adipisci ipsa.
Aperiam molestias fugiat optio tenetur assumenda quia et aspernatur.
Aut iusto impedit qui ex.
Inventore necessitatibus nihil nihil architecto consequatur sed enim.
Ut occaecati id culpa saepe incidunt quas ullam.
Vel quam consequatur aut possimus sunt.
Earum consequuntur quia soluta.");
    

    TestModellerLogger.SetLastNodeGuid("3b383dc0-235e-4780-9859-f151196feb92");
    _DebitNoteSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("62f8964d-0533-4137-b19f-ed7484c16874");
    _DebitNoteSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("0c1c1062-a24e-491f-b466-c4f25be009dc");
    _DebitNoteSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("df34f121-e6c7-4386-b83d-071d26d7877e");
    _DebitNoteSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("d9ad9e73-0fa4-4130-8856-5d6c154b68b4");
    _DebitNoteSToFRS.Enter_Amount_Net("100");
    

    TestModellerLogger.SetLastNodeGuid("afe47079-aab8-40ac-8075-8edfd92c146a");
    _DebitNoteSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("093d78cf-a676-401c-9139-02e7e7db005f");
    _DebitNoteSToFRS.Click__Save_();
    

    }

    @Test  (groups= {"DebitNoteSTpFRS","DebitNoteSTpFRS - Default Profile"})
    @TestModellerPath(guid = "a097ea39-5f1a-4534-89a8-355b41494473")
    public void GoToUrlAssertUrlClickExpenditureTABClickNewTABClickNewDebitNotePositiveSelectSupplierNameEnt17()
    {
        
        pages.DebitNoteSToFRS _DebitNoteSToFRS = new pages.DebitNoteSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("a9ac356a-1ff8-48d1-98c6-5613b1e1ba5a");
    _DebitNoteSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("281ed0ae-1966-4313-83f9-f02959a1af8f");
    _DebitNoteSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f4ead229-e1a6-4686-9726-2a8d72975380");
    _DebitNoteSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("13d7978e-e074-45d2-8c0b-01b123aa6311");
    _DebitNoteSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("e0eca6d7-6b04-416d-855d-2a9e825dcd28");
    _DebitNoteSToFRS.Click_NewDebitNote();
    

    TestModellerLogger.SetLastNodeGuid("190c6323-be0b-4dd1-b552-dbe6423a4af8");
    _DebitNoteSToFRS.Select_SupplierName("ABCSupplier");
    

    TestModellerLogger.SetLastNodeGuid("c9f1fef7-60b9-4d4b-a4a0-825e5638fb6e");
    _DebitNoteSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("a8f7d6e5-89f8-4f36-a154-0755a90aa5e9");
    _DebitNoteSToFRS.Enter_Date("44250");
    

    TestModellerLogger.SetLastNodeGuid("d0e22573-153e-435a-8026-8e497c35f9ee");
    _DebitNoteSToFRS.Select_ExpenseType("Professional, consultancy and legal fees");
    

    TestModellerLogger.SetLastNodeGuid("3f663a04-c82a-4f31-a2c8-3238da8ddb0c");
    _DebitNoteSToFRS.Enter_Description("Autem qui ipsum quo voluptatem quod quos dolorum maxime nam.
Error doloribus porro magnam occaecati aperiam.
Quasi est dolores enim.
Itaque et dolor dolores dolores numquam magni et voluptates officia.
Odio cumque iusto et officiis quos perferendis soluta eligendi.
Doloremque et saepe eaque.
Est voluptates et dolores architecto.
Cupiditate et incidunt autem voluptas id ea voluptate laborum.
Deleniti aut sed minima omnis vitae.
Suscipit culpa mollitia blanditiis.");
    

    TestModellerLogger.SetLastNodeGuid("3b383dc0-235e-4780-9859-f151196feb92");
    _DebitNoteSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("62f8964d-0533-4137-b19f-ed7484c16874");
    _DebitNoteSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("0c1c1062-a24e-491f-b466-c4f25be009dc");
    _DebitNoteSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("df34f121-e6c7-4386-b83d-071d26d7877e");
    _DebitNoteSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("d9ad9e73-0fa4-4130-8856-5d6c154b68b4");
    _DebitNoteSToFRS.Enter_Amount_Net("100");
    

    TestModellerLogger.SetLastNodeGuid("afe47079-aab8-40ac-8075-8edfd92c146a");
    _DebitNoteSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("093d78cf-a676-401c-9139-02e7e7db005f");
    _DebitNoteSToFRS.Click__Save_();
    

    }

    @Test  (groups= {"DebitNoteSTpFRS","DebitNoteSTpFRS - Default Profile"})
    @TestModellerPath(guid = "c73a9210-bd31-4df4-96da-27cb1486749e")
    public void GoToUrlAssertUrlClickExpenditureTABClickNewTABClickNewDebitNotePositiveSelectSupplierNameEnt18()
    {
        
        pages.DebitNoteSToFRS _DebitNoteSToFRS = new pages.DebitNoteSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("a9ac356a-1ff8-48d1-98c6-5613b1e1ba5a");
    _DebitNoteSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("281ed0ae-1966-4313-83f9-f02959a1af8f");
    _DebitNoteSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f4ead229-e1a6-4686-9726-2a8d72975380");
    _DebitNoteSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("13d7978e-e074-45d2-8c0b-01b123aa6311");
    _DebitNoteSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("e0eca6d7-6b04-416d-855d-2a9e825dcd28");
    _DebitNoteSToFRS.Click_NewDebitNote();
    

    TestModellerLogger.SetLastNodeGuid("190c6323-be0b-4dd1-b552-dbe6423a4af8");
    _DebitNoteSToFRS.Select_SupplierName("ABCSupplier");
    

    TestModellerLogger.SetLastNodeGuid("c9f1fef7-60b9-4d4b-a4a0-825e5638fb6e");
    _DebitNoteSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("a8f7d6e5-89f8-4f36-a154-0755a90aa5e9");
    _DebitNoteSToFRS.Enter_Date("44250");
    

    TestModellerLogger.SetLastNodeGuid("d0e22573-153e-435a-8026-8e497c35f9ee");
    _DebitNoteSToFRS.Select_ExpenseType("Staff welfare");
    

    TestModellerLogger.SetLastNodeGuid("3f663a04-c82a-4f31-a2c8-3238da8ddb0c");
    _DebitNoteSToFRS.Enter_Description("Omnis voluptates cum quis aspernatur vel cupiditate.
Quia omnis sint alias.
Autem sed architecto doloremque rerum et enim vitae minus unde.
Est possimus assumenda id quod.
Omnis deleniti voluptas earum qui quia fugit.
Molestias perspiciatis rerum reprehenderit explicabo cumque praesentium.
Ea possimus aut explicabo.
Optio earum amet et doloremque.
Voluptate mollitia laboriosam ipsa sint.
Id modi eaque tempore aut est.");
    

    TestModellerLogger.SetLastNodeGuid("3b383dc0-235e-4780-9859-f151196feb92");
    _DebitNoteSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("62f8964d-0533-4137-b19f-ed7484c16874");
    _DebitNoteSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("0c1c1062-a24e-491f-b466-c4f25be009dc");
    _DebitNoteSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("df34f121-e6c7-4386-b83d-071d26d7877e");
    _DebitNoteSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("d9ad9e73-0fa4-4130-8856-5d6c154b68b4");
    _DebitNoteSToFRS.Enter_Amount_Net("100");
    

    TestModellerLogger.SetLastNodeGuid("afe47079-aab8-40ac-8075-8edfd92c146a");
    _DebitNoteSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("093d78cf-a676-401c-9139-02e7e7db005f");
    _DebitNoteSToFRS.Click__Save_();
    

    }

    @Test  (groups= {"DebitNoteSTpFRS","DebitNoteSTpFRS - Default Profile"})
    @TestModellerPath(guid = "6aec75e9-d63a-46a7-af5e-9d816b248107")
    public void GoToUrlAssertUrlClickExpenditureTABClickNewTABClickNewDebitNotePositiveSelectSupplierNameEnt19()
    {
        
        pages.DebitNoteSToFRS _DebitNoteSToFRS = new pages.DebitNoteSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("a9ac356a-1ff8-48d1-98c6-5613b1e1ba5a");
    _DebitNoteSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("281ed0ae-1966-4313-83f9-f02959a1af8f");
    _DebitNoteSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f4ead229-e1a6-4686-9726-2a8d72975380");
    _DebitNoteSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("13d7978e-e074-45d2-8c0b-01b123aa6311");
    _DebitNoteSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("e0eca6d7-6b04-416d-855d-2a9e825dcd28");
    _DebitNoteSToFRS.Click_NewDebitNote();
    

    TestModellerLogger.SetLastNodeGuid("190c6323-be0b-4dd1-b552-dbe6423a4af8");
    _DebitNoteSToFRS.Select_SupplierName("ABCSupplier");
    

    TestModellerLogger.SetLastNodeGuid("c9f1fef7-60b9-4d4b-a4a0-825e5638fb6e");
    _DebitNoteSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("a8f7d6e5-89f8-4f36-a154-0755a90aa5e9");
    _DebitNoteSToFRS.Enter_Date("44250");
    

    TestModellerLogger.SetLastNodeGuid("d0e22573-153e-435a-8026-8e497c35f9ee");
    _DebitNoteSToFRS.Select_ExpenseType("Sundry expenses");
    

    TestModellerLogger.SetLastNodeGuid("3f663a04-c82a-4f31-a2c8-3238da8ddb0c");
    _DebitNoteSToFRS.Enter_Description("Sapiente rem autem aut iure eligendi quidem nulla consequatur corrupti.
Perferendis est facilis veniam vero sed.
Dignissimos fugit delectus nihil.
Ipsum quas delectus voluptates ex deleniti nihil non iure odit.
Dolores fugiat voluptatem.
Quibusdam aut reprehenderit excepturi mollitia aut itaque doloremque consectetur.
Blanditiis consequatur et non non sed repudiandae aliquam excepturi.
Id quam repellendus veniam.
Iure a aut et quisquam.
Qui sed nihil ut quidem quisquam blanditiis.");
    

    TestModellerLogger.SetLastNodeGuid("3b383dc0-235e-4780-9859-f151196feb92");
    _DebitNoteSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("62f8964d-0533-4137-b19f-ed7484c16874");
    _DebitNoteSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("0c1c1062-a24e-491f-b466-c4f25be009dc");
    _DebitNoteSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("df34f121-e6c7-4386-b83d-071d26d7877e");
    _DebitNoteSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("d9ad9e73-0fa4-4130-8856-5d6c154b68b4");
    _DebitNoteSToFRS.Enter_Amount_Net("100");
    

    TestModellerLogger.SetLastNodeGuid("afe47079-aab8-40ac-8075-8edfd92c146a");
    _DebitNoteSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("093d78cf-a676-401c-9139-02e7e7db005f");
    _DebitNoteSToFRS.Click__Save_();
    

    }

    @Test  (groups= {"DebitNoteSTpFRS","DebitNoteSTpFRS - Default Profile"})
    @TestModellerPath(guid = "f87263c5-6cb3-4686-87d5-fa6f4c87dfd2")
    public void GoToUrlAssertUrlClickExpenditureTABClickNewTABClickNewDebitNotePositiveSelectSupplierNameEnt20()
    {
        
        pages.DebitNoteSToFRS _DebitNoteSToFRS = new pages.DebitNoteSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("a9ac356a-1ff8-48d1-98c6-5613b1e1ba5a");
    _DebitNoteSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("281ed0ae-1966-4313-83f9-f02959a1af8f");
    _DebitNoteSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f4ead229-e1a6-4686-9726-2a8d72975380");
    _DebitNoteSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("13d7978e-e074-45d2-8c0b-01b123aa6311");
    _DebitNoteSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("e0eca6d7-6b04-416d-855d-2a9e825dcd28");
    _DebitNoteSToFRS.Click_NewDebitNote();
    

    TestModellerLogger.SetLastNodeGuid("190c6323-be0b-4dd1-b552-dbe6423a4af8");
    _DebitNoteSToFRS.Select_SupplierName("ABCSupplier");
    

    TestModellerLogger.SetLastNodeGuid("c9f1fef7-60b9-4d4b-a4a0-825e5638fb6e");
    _DebitNoteSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("a8f7d6e5-89f8-4f36-a154-0755a90aa5e9");
    _DebitNoteSToFRS.Enter_Date("44250");
    

    TestModellerLogger.SetLastNodeGuid("d0e22573-153e-435a-8026-8e497c35f9ee");
    _DebitNoteSToFRS.Select_ExpenseType("Telephone, internet and broadband");
    

    TestModellerLogger.SetLastNodeGuid("3f663a04-c82a-4f31-a2c8-3238da8ddb0c");
    _DebitNoteSToFRS.Enter_Description("Pariatur incidunt rem.
Architecto ut aut molestiae repellat vero sunt sunt debitis.
Sed tempora vel voluptatem aut.
Non voluptatem non quia.
Quia consequatur fugiat autem sit saepe.
Praesentium ratione nam ut magni facilis impedit vel aliquam.
A sequi suscipit harum quidem dolores.
Deleniti ut laborum laborum enim eveniet.
Corporis aliquid nemo placeat eveniet minima magni illum.
Possimus harum qui et ratione explicabo minus ipsam qui rerum.");
    

    TestModellerLogger.SetLastNodeGuid("3b383dc0-235e-4780-9859-f151196feb92");
    _DebitNoteSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("62f8964d-0533-4137-b19f-ed7484c16874");
    _DebitNoteSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("0c1c1062-a24e-491f-b466-c4f25be009dc");
    _DebitNoteSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("df34f121-e6c7-4386-b83d-071d26d7877e");
    _DebitNoteSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("d9ad9e73-0fa4-4130-8856-5d6c154b68b4");
    _DebitNoteSToFRS.Enter_Amount_Net("100");
    

    TestModellerLogger.SetLastNodeGuid("afe47079-aab8-40ac-8075-8edfd92c146a");
    _DebitNoteSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("093d78cf-a676-401c-9139-02e7e7db005f");
    _DebitNoteSToFRS.Click__Save_();
    

    }

    @Test  (groups= {"DebitNoteSTpFRS","DebitNoteSTpFRS - Default Profile"})
    @TestModellerPath(guid = "2cac7242-e5dc-4d16-a9cf-88534c78688d")
    public void GoToUrlAssertUrlClickExpenditureTABClickNewTABClickNewDebitNotePositiveSelectSupplierNameEnt21()
    {
        
        pages.DebitNoteSToFRS _DebitNoteSToFRS = new pages.DebitNoteSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("a9ac356a-1ff8-48d1-98c6-5613b1e1ba5a");
    _DebitNoteSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("281ed0ae-1966-4313-83f9-f02959a1af8f");
    _DebitNoteSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f4ead229-e1a6-4686-9726-2a8d72975380");
    _DebitNoteSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("13d7978e-e074-45d2-8c0b-01b123aa6311");
    _DebitNoteSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("e0eca6d7-6b04-416d-855d-2a9e825dcd28");
    _DebitNoteSToFRS.Click_NewDebitNote();
    

    TestModellerLogger.SetLastNodeGuid("190c6323-be0b-4dd1-b552-dbe6423a4af8");
    _DebitNoteSToFRS.Select_SupplierName("ABCSupplier");
    

    TestModellerLogger.SetLastNodeGuid("c9f1fef7-60b9-4d4b-a4a0-825e5638fb6e");
    _DebitNoteSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("a8f7d6e5-89f8-4f36-a154-0755a90aa5e9");
    _DebitNoteSToFRS.Enter_Date("44250");
    

    TestModellerLogger.SetLastNodeGuid("d0e22573-153e-435a-8026-8e497c35f9ee");
    _DebitNoteSToFRS.Select_ExpenseType("Travel and overseas travelling");
    

    TestModellerLogger.SetLastNodeGuid("3f663a04-c82a-4f31-a2c8-3238da8ddb0c");
    _DebitNoteSToFRS.Enter_Description("Consectetur est temporibus quo nobis officiis esse enim.
Minima sed ratione magnam.
Libero dolor suscipit a atque reiciendis sit qui consectetur culpa.
Et deleniti enim.
Ut ullam aut nihil sequi molestias.
Natus rem veritatis accusantium et illum animi.
Iste atque deleniti est deleniti enim in ex.
Voluptates velit quae qui.
Quo dolor reprehenderit qui.
Voluptatibus reiciendis voluptatem est explicabo blanditiis eos modi et saepe.");
    

    TestModellerLogger.SetLastNodeGuid("3b383dc0-235e-4780-9859-f151196feb92");
    _DebitNoteSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("62f8964d-0533-4137-b19f-ed7484c16874");
    _DebitNoteSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("0c1c1062-a24e-491f-b466-c4f25be009dc");
    _DebitNoteSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("df34f121-e6c7-4386-b83d-071d26d7877e");
    _DebitNoteSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("d9ad9e73-0fa4-4130-8856-5d6c154b68b4");
    _DebitNoteSToFRS.Enter_Amount_Net("100");
    

    TestModellerLogger.SetLastNodeGuid("afe47079-aab8-40ac-8075-8edfd92c146a");
    _DebitNoteSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("093d78cf-a676-401c-9139-02e7e7db005f");
    _DebitNoteSToFRS.Click__Save_();
    

    }

    @Test  (groups= {"DebitNoteSTpFRS","DebitNoteSTpFRS - Default Profile"})
    @TestModellerPath(guid = "f35dc1a9-4841-4424-b661-ee3c0f8225d9")
    public void GoToUrlAssertUrlClickExpenditureTABClickNewTABClickNewDebitNotePositiveSelectSupplierNameEnt22()
    {
        
        pages.DebitNoteSToFRS _DebitNoteSToFRS = new pages.DebitNoteSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("a9ac356a-1ff8-48d1-98c6-5613b1e1ba5a");
    _DebitNoteSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("281ed0ae-1966-4313-83f9-f02959a1af8f");
    _DebitNoteSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f4ead229-e1a6-4686-9726-2a8d72975380");
    _DebitNoteSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("13d7978e-e074-45d2-8c0b-01b123aa6311");
    _DebitNoteSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("e0eca6d7-6b04-416d-855d-2a9e825dcd28");
    _DebitNoteSToFRS.Click_NewDebitNote();
    

    TestModellerLogger.SetLastNodeGuid("190c6323-be0b-4dd1-b552-dbe6423a4af8");
    _DebitNoteSToFRS.Select_SupplierName("ABCSupplier");
    

    TestModellerLogger.SetLastNodeGuid("c9f1fef7-60b9-4d4b-a4a0-825e5638fb6e");
    _DebitNoteSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("a8f7d6e5-89f8-4f36-a154-0755a90aa5e9");
    _DebitNoteSToFRS.Enter_Date("44250");
    

    TestModellerLogger.SetLastNodeGuid("d0e22573-153e-435a-8026-8e497c35f9ee");
    _DebitNoteSToFRS.Select_ExpenseType("Commercial vehicles additions");
    

    TestModellerLogger.SetLastNodeGuid("3f663a04-c82a-4f31-a2c8-3238da8ddb0c");
    _DebitNoteSToFRS.Enter_Description("Aut sint ut quas accusantium occaecati.
Autem autem architecto quo rerum quidem.
Quod laudantium earum aliquid quidem veniam harum.
Necessitatibus dolorum nihil ut possimus eum incidunt laboriosam.
Provident praesentium temporibus.
Eveniet quas vitae amet voluptatem ex animi ut pariatur.
Aperiam soluta non ex.
Adipisci officiis incidunt laborum dolorem iure fuga et quibusdam temporibus.
Ipsa natus blanditiis doloribus corporis corrupti pariatur porro voluptas.
Eos neque voluptatem molestiae aperiam autem ipsa deleniti tempore omnis.");
    

    TestModellerLogger.SetLastNodeGuid("3b383dc0-235e-4780-9859-f151196feb92");
    _DebitNoteSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("62f8964d-0533-4137-b19f-ed7484c16874");
    _DebitNoteSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("0c1c1062-a24e-491f-b466-c4f25be009dc");
    _DebitNoteSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("df34f121-e6c7-4386-b83d-071d26d7877e");
    _DebitNoteSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("d9ad9e73-0fa4-4130-8856-5d6c154b68b4");
    _DebitNoteSToFRS.Enter_Amount_Net("100");
    

    TestModellerLogger.SetLastNodeGuid("afe47079-aab8-40ac-8075-8edfd92c146a");
    _DebitNoteSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("093d78cf-a676-401c-9139-02e7e7db005f");
    _DebitNoteSToFRS.Click__Save_();
    

    }

    @Test  (groups= {"DebitNoteSTpFRS","DebitNoteSTpFRS - Default Profile"})
    @TestModellerPath(guid = "c2928d4d-c590-471b-9d92-8e3acbcea062")
    public void GoToUrlAssertUrlClickExpenditureTABClickNewTABClickNewDebitNotePositiveSelectSupplierNameEnt23()
    {
        
        pages.DebitNoteSToFRS _DebitNoteSToFRS = new pages.DebitNoteSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("a9ac356a-1ff8-48d1-98c6-5613b1e1ba5a");
    _DebitNoteSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("281ed0ae-1966-4313-83f9-f02959a1af8f");
    _DebitNoteSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f4ead229-e1a6-4686-9726-2a8d72975380");
    _DebitNoteSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("13d7978e-e074-45d2-8c0b-01b123aa6311");
    _DebitNoteSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("e0eca6d7-6b04-416d-855d-2a9e825dcd28");
    _DebitNoteSToFRS.Click_NewDebitNote();
    

    TestModellerLogger.SetLastNodeGuid("190c6323-be0b-4dd1-b552-dbe6423a4af8");
    _DebitNoteSToFRS.Select_SupplierName("ABCSupplier");
    

    TestModellerLogger.SetLastNodeGuid("c9f1fef7-60b9-4d4b-a4a0-825e5638fb6e");
    _DebitNoteSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("a8f7d6e5-89f8-4f36-a154-0755a90aa5e9");
    _DebitNoteSToFRS.Enter_Date("44250");
    

    TestModellerLogger.SetLastNodeGuid("d0e22573-153e-435a-8026-8e497c35f9ee");
    _DebitNoteSToFRS.Select_ExpenseType("Commercial vehicles cost b/f");
    

    TestModellerLogger.SetLastNodeGuid("3f663a04-c82a-4f31-a2c8-3238da8ddb0c");
    _DebitNoteSToFRS.Enter_Description("Doloremque labore qui numquam ullam nulla delectus.
Ad qui quis qui iste ipsam.
Saepe eos quo.
Fugiat quos excepturi eaque suscipit impedit repudiandae.
Temporibus aut qui odio consequuntur ut non aut.
Enim est alias rerum aut.
Similique quis in voluptas omnis.
Asperiores atque dolor rerum consequuntur porro inventore.
Sed aut quas iure neque quia in.
Qui neque neque ut corporis porro culpa dicta.");
    

    TestModellerLogger.SetLastNodeGuid("3b383dc0-235e-4780-9859-f151196feb92");
    _DebitNoteSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("62f8964d-0533-4137-b19f-ed7484c16874");
    _DebitNoteSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("0c1c1062-a24e-491f-b466-c4f25be009dc");
    _DebitNoteSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("df34f121-e6c7-4386-b83d-071d26d7877e");
    _DebitNoteSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("d9ad9e73-0fa4-4130-8856-5d6c154b68b4");
    _DebitNoteSToFRS.Enter_Amount_Net("100");
    

    TestModellerLogger.SetLastNodeGuid("afe47079-aab8-40ac-8075-8edfd92c146a");
    _DebitNoteSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("093d78cf-a676-401c-9139-02e7e7db005f");
    _DebitNoteSToFRS.Click__Save_();
    

    }

    @Test  (groups= {"DebitNoteSTpFRS","DebitNoteSTpFRS - Default Profile"})
    @TestModellerPath(guid = "769e4c41-43ca-49e0-bb9e-42911c99ba5c")
    public void GoToUrlAssertUrlClickExpenditureTABClickNewTABClickNewDebitNotePositiveSelectSupplierNameEnt24()
    {
        
        pages.DebitNoteSToFRS _DebitNoteSToFRS = new pages.DebitNoteSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("a9ac356a-1ff8-48d1-98c6-5613b1e1ba5a");
    _DebitNoteSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("281ed0ae-1966-4313-83f9-f02959a1af8f");
    _DebitNoteSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f4ead229-e1a6-4686-9726-2a8d72975380");
    _DebitNoteSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("13d7978e-e074-45d2-8c0b-01b123aa6311");
    _DebitNoteSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("e0eca6d7-6b04-416d-855d-2a9e825dcd28");
    _DebitNoteSToFRS.Click_NewDebitNote();
    

    TestModellerLogger.SetLastNodeGuid("190c6323-be0b-4dd1-b552-dbe6423a4af8");
    _DebitNoteSToFRS.Select_SupplierName("ABCSupplier");
    

    TestModellerLogger.SetLastNodeGuid("c9f1fef7-60b9-4d4b-a4a0-825e5638fb6e");
    _DebitNoteSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("a8f7d6e5-89f8-4f36-a154-0755a90aa5e9");
    _DebitNoteSToFRS.Enter_Date("44250");
    

    TestModellerLogger.SetLastNodeGuid("d0e22573-153e-435a-8026-8e497c35f9ee");
    _DebitNoteSToFRS.Select_ExpenseType("Commercial vehicles depreciation");
    

    TestModellerLogger.SetLastNodeGuid("3f663a04-c82a-4f31-a2c8-3238da8ddb0c");
    _DebitNoteSToFRS.Enter_Description("Et hic sit earum nam omnis earum sequi architecto.
Non ea et repellat sint sequi dolores quia molestias.
Et deleniti impedit voluptates debitis.
Velit id velit nemo.
Ut sunt aut eius voluptas.
Sunt sed ipsa error ut dicta autem accusamus quis.
Neque facilis consectetur consequatur mollitia.
Qui eius molestiae.
Enim veritatis iusto ut.
Quod assumenda occaecati fuga enim.");
    

    TestModellerLogger.SetLastNodeGuid("3b383dc0-235e-4780-9859-f151196feb92");
    _DebitNoteSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("62f8964d-0533-4137-b19f-ed7484c16874");
    _DebitNoteSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("0c1c1062-a24e-491f-b466-c4f25be009dc");
    _DebitNoteSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("df34f121-e6c7-4386-b83d-071d26d7877e");
    _DebitNoteSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("d9ad9e73-0fa4-4130-8856-5d6c154b68b4");
    _DebitNoteSToFRS.Enter_Amount_Net("100");
    

    TestModellerLogger.SetLastNodeGuid("afe47079-aab8-40ac-8075-8edfd92c146a");
    _DebitNoteSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("093d78cf-a676-401c-9139-02e7e7db005f");
    _DebitNoteSToFRS.Click__Save_();
    

    }

    @Test  (groups= {"DebitNoteSTpFRS","DebitNoteSTpFRS - Default Profile"})
    @TestModellerPath(guid = "1326a330-18db-4cce-a161-285db25d3a30")
    public void GoToUrlAssertUrlClickExpenditureTABClickNewTABClickNewDebitNotePositiveSelectSupplierNameEnt25()
    {
        
        pages.DebitNoteSToFRS _DebitNoteSToFRS = new pages.DebitNoteSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("a9ac356a-1ff8-48d1-98c6-5613b1e1ba5a");
    _DebitNoteSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("281ed0ae-1966-4313-83f9-f02959a1af8f");
    _DebitNoteSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f4ead229-e1a6-4686-9726-2a8d72975380");
    _DebitNoteSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("13d7978e-e074-45d2-8c0b-01b123aa6311");
    _DebitNoteSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("e0eca6d7-6b04-416d-855d-2a9e825dcd28");
    _DebitNoteSToFRS.Click_NewDebitNote();
    

    TestModellerLogger.SetLastNodeGuid("190c6323-be0b-4dd1-b552-dbe6423a4af8");
    _DebitNoteSToFRS.Select_SupplierName("ABCSupplier");
    

    TestModellerLogger.SetLastNodeGuid("c9f1fef7-60b9-4d4b-a4a0-825e5638fb6e");
    _DebitNoteSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("a8f7d6e5-89f8-4f36-a154-0755a90aa5e9");
    _DebitNoteSToFRS.Enter_Date("44250");
    

    TestModellerLogger.SetLastNodeGuid("d0e22573-153e-435a-8026-8e497c35f9ee");
    _DebitNoteSToFRS.Select_ExpenseType("Commercial vehicles depreciation b/f");
    

    TestModellerLogger.SetLastNodeGuid("3f663a04-c82a-4f31-a2c8-3238da8ddb0c");
    _DebitNoteSToFRS.Enter_Description("Dolor facere minima molestiae qui laudantium nihil eum reprehenderit sit.
Deserunt rerum magnam.
Modi et soluta eum enim qui temporibus cupiditate animi molestias.
Eligendi tempora quos.
Vero dolore aut nisi vel.
Repudiandae aut aut laborum fugit fugiat eaque voluptates incidunt rem.
Aspernatur autem occaecati ut quo autem ipsa.
Doloribus tempora cum esse corrupti assumenda.
Necessitatibus architecto voluptatum autem dolorum ut.
Quasi enim et libero numquam sequi placeat facere et.");
    

    TestModellerLogger.SetLastNodeGuid("3b383dc0-235e-4780-9859-f151196feb92");
    _DebitNoteSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("62f8964d-0533-4137-b19f-ed7484c16874");
    _DebitNoteSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("0c1c1062-a24e-491f-b466-c4f25be009dc");
    _DebitNoteSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("df34f121-e6c7-4386-b83d-071d26d7877e");
    _DebitNoteSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("d9ad9e73-0fa4-4130-8856-5d6c154b68b4");
    _DebitNoteSToFRS.Enter_Amount_Net("100");
    

    TestModellerLogger.SetLastNodeGuid("afe47079-aab8-40ac-8075-8edfd92c146a");
    _DebitNoteSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("093d78cf-a676-401c-9139-02e7e7db005f");
    _DebitNoteSToFRS.Click__Save_();
    

    }

    @Test  (groups= {"DebitNoteSTpFRS","DebitNoteSTpFRS - Default Profile"})
    @TestModellerPath(guid = "8d8aaeb1-0b8b-46e0-959a-ed4e0347d4a0")
    public void GoToUrlAssertUrlClickExpenditureTABClickNewTABClickNewDebitNotePositiveSelectSupplierNameEnt26()
    {
        
        pages.DebitNoteSToFRS _DebitNoteSToFRS = new pages.DebitNoteSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("a9ac356a-1ff8-48d1-98c6-5613b1e1ba5a");
    _DebitNoteSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("281ed0ae-1966-4313-83f9-f02959a1af8f");
    _DebitNoteSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f4ead229-e1a6-4686-9726-2a8d72975380");
    _DebitNoteSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("13d7978e-e074-45d2-8c0b-01b123aa6311");
    _DebitNoteSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("e0eca6d7-6b04-416d-855d-2a9e825dcd28");
    _DebitNoteSToFRS.Click_NewDebitNote();
    

    TestModellerLogger.SetLastNodeGuid("190c6323-be0b-4dd1-b552-dbe6423a4af8");
    _DebitNoteSToFRS.Select_SupplierName("ABCSupplier");
    

    TestModellerLogger.SetLastNodeGuid("c9f1fef7-60b9-4d4b-a4a0-825e5638fb6e");
    _DebitNoteSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("a8f7d6e5-89f8-4f36-a154-0755a90aa5e9");
    _DebitNoteSToFRS.Enter_Date("44250");
    

    TestModellerLogger.SetLastNodeGuid("d0e22573-153e-435a-8026-8e497c35f9ee");
    _DebitNoteSToFRS.Select_ExpenseType("Commercial vehicles depreciation disposals");
    

    TestModellerLogger.SetLastNodeGuid("3f663a04-c82a-4f31-a2c8-3238da8ddb0c");
    _DebitNoteSToFRS.Enter_Description("Eaque unde mollitia at aut.
Sit qui non.
Iure nam ut laudantium cupiditate nulla quidem rerum sapiente et.
Pariatur aut tempora corporis non et.
Culpa rerum distinctio labore.
Nemo vel earum ipsum fuga repudiandae voluptatem.
Nisi est est atque ea architecto.
Ratione quis sint aut.
Sit recusandae amet sed quis unde voluptas in pariatur.
Quae ad voluptatem illo molestiae dicta qui tempore perferendis.");
    

    TestModellerLogger.SetLastNodeGuid("3b383dc0-235e-4780-9859-f151196feb92");
    _DebitNoteSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("62f8964d-0533-4137-b19f-ed7484c16874");
    _DebitNoteSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("0c1c1062-a24e-491f-b466-c4f25be009dc");
    _DebitNoteSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("df34f121-e6c7-4386-b83d-071d26d7877e");
    _DebitNoteSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("d9ad9e73-0fa4-4130-8856-5d6c154b68b4");
    _DebitNoteSToFRS.Enter_Amount_Net("100");
    

    TestModellerLogger.SetLastNodeGuid("afe47079-aab8-40ac-8075-8edfd92c146a");
    _DebitNoteSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("093d78cf-a676-401c-9139-02e7e7db005f");
    _DebitNoteSToFRS.Click__Save_();
    

    }

    @Test  (groups= {"DebitNoteSTpFRS","DebitNoteSTpFRS - Default Profile"})
    @TestModellerPath(guid = "37ff47a0-4705-4cdd-ac9e-ad4290fcabea")
    public void GoToUrlAssertUrlClickExpenditureTABClickNewTABClickNewDebitNotePositiveSelectSupplierNameEnt27()
    {
        
        pages.DebitNoteSToFRS _DebitNoteSToFRS = new pages.DebitNoteSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("a9ac356a-1ff8-48d1-98c6-5613b1e1ba5a");
    _DebitNoteSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("281ed0ae-1966-4313-83f9-f02959a1af8f");
    _DebitNoteSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f4ead229-e1a6-4686-9726-2a8d72975380");
    _DebitNoteSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("13d7978e-e074-45d2-8c0b-01b123aa6311");
    _DebitNoteSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("e0eca6d7-6b04-416d-855d-2a9e825dcd28");
    _DebitNoteSToFRS.Click_NewDebitNote();
    

    TestModellerLogger.SetLastNodeGuid("190c6323-be0b-4dd1-b552-dbe6423a4af8");
    _DebitNoteSToFRS.Select_SupplierName("ABCSupplier");
    

    TestModellerLogger.SetLastNodeGuid("c9f1fef7-60b9-4d4b-a4a0-825e5638fb6e");
    _DebitNoteSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("a8f7d6e5-89f8-4f36-a154-0755a90aa5e9");
    _DebitNoteSToFRS.Enter_Date("44250");
    

    TestModellerLogger.SetLastNodeGuid("d0e22573-153e-435a-8026-8e497c35f9ee");
    _DebitNoteSToFRS.Select_ExpenseType("Commercial vehicles depreciation revaluation");
    

    TestModellerLogger.SetLastNodeGuid("3f663a04-c82a-4f31-a2c8-3238da8ddb0c");
    _DebitNoteSToFRS.Enter_Description("Itaque reiciendis explicabo.
Ea maxime ut dolores.
Voluptatem quia consequatur at ducimus molestiae quis.
Ea et beatae voluptatem.
Id totam facilis suscipit sit ut voluptatem et.
Cumque quas est at sed voluptas voluptatem.
Fuga facilis harum eveniet.
Libero cum quam cumque et iste necessitatibus dolor accusamus.
Aut ipsam autem fuga occaecati quasi velit omnis maiores iusto.
Quas eos beatae mollitia modi non.");
    

    TestModellerLogger.SetLastNodeGuid("3b383dc0-235e-4780-9859-f151196feb92");
    _DebitNoteSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("62f8964d-0533-4137-b19f-ed7484c16874");
    _DebitNoteSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("0c1c1062-a24e-491f-b466-c4f25be009dc");
    _DebitNoteSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("df34f121-e6c7-4386-b83d-071d26d7877e");
    _DebitNoteSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("d9ad9e73-0fa4-4130-8856-5d6c154b68b4");
    _DebitNoteSToFRS.Enter_Amount_Net("100");
    

    TestModellerLogger.SetLastNodeGuid("afe47079-aab8-40ac-8075-8edfd92c146a");
    _DebitNoteSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("093d78cf-a676-401c-9139-02e7e7db005f");
    _DebitNoteSToFRS.Click__Save_();
    

    }

    @Test  (groups= {"DebitNoteSTpFRS","DebitNoteSTpFRS - Default Profile"})
    @TestModellerPath(guid = "9d289a24-86d6-44ff-871e-41798d1dd02a")
    public void GoToUrlAssertUrlClickExpenditureTABClickNewTABClickNewDebitNotePositiveSelectSupplierNameEnt28()
    {
        
        pages.DebitNoteSToFRS _DebitNoteSToFRS = new pages.DebitNoteSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("a9ac356a-1ff8-48d1-98c6-5613b1e1ba5a");
    _DebitNoteSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("281ed0ae-1966-4313-83f9-f02959a1af8f");
    _DebitNoteSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f4ead229-e1a6-4686-9726-2a8d72975380");
    _DebitNoteSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("13d7978e-e074-45d2-8c0b-01b123aa6311");
    _DebitNoteSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("e0eca6d7-6b04-416d-855d-2a9e825dcd28");
    _DebitNoteSToFRS.Click_NewDebitNote();
    

    TestModellerLogger.SetLastNodeGuid("190c6323-be0b-4dd1-b552-dbe6423a4af8");
    _DebitNoteSToFRS.Select_SupplierName("ABCSupplier");
    

    TestModellerLogger.SetLastNodeGuid("c9f1fef7-60b9-4d4b-a4a0-825e5638fb6e");
    _DebitNoteSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("a8f7d6e5-89f8-4f36-a154-0755a90aa5e9");
    _DebitNoteSToFRS.Enter_Date("44250");
    

    TestModellerLogger.SetLastNodeGuid("d0e22573-153e-435a-8026-8e497c35f9ee");
    _DebitNoteSToFRS.Select_ExpenseType("Commercial vehicles depreciation transfers");
    

    TestModellerLogger.SetLastNodeGuid("3f663a04-c82a-4f31-a2c8-3238da8ddb0c");
    _DebitNoteSToFRS.Enter_Description("Enim quia et sint.
Omnis et delectus repudiandae et quisquam deserunt quia.
Eum sunt saepe ut eum numquam.
Veritatis non explicabo est laudantium consequatur neque.
Laboriosam odit ea accusantium porro voluptates optio et commodi.
Animi dolorem omnis sequi repellendus eum reprehenderit.
Vitae cum nostrum amet inventore.
Enim libero quia sapiente laboriosam accusamus.
Voluptate quidem voluptatem in occaecati.
Error blanditiis rem dolores quasi.");
    

    TestModellerLogger.SetLastNodeGuid("3b383dc0-235e-4780-9859-f151196feb92");
    _DebitNoteSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("62f8964d-0533-4137-b19f-ed7484c16874");
    _DebitNoteSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("0c1c1062-a24e-491f-b466-c4f25be009dc");
    _DebitNoteSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("df34f121-e6c7-4386-b83d-071d26d7877e");
    _DebitNoteSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("d9ad9e73-0fa4-4130-8856-5d6c154b68b4");
    _DebitNoteSToFRS.Enter_Amount_Net("100");
    

    TestModellerLogger.SetLastNodeGuid("afe47079-aab8-40ac-8075-8edfd92c146a");
    _DebitNoteSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("093d78cf-a676-401c-9139-02e7e7db005f");
    _DebitNoteSToFRS.Click__Save_();
    

    }

    @Test  (groups= {"DebitNoteSTpFRS","DebitNoteSTpFRS - Default Profile"})
    @TestModellerPath(guid = "3aa960d7-3835-49aa-9452-e665fce5836a")
    public void GoToUrlAssertUrlClickExpenditureTABClickNewTABClickNewDebitNotePositiveSelectSupplierNameEnt29()
    {
        
        pages.DebitNoteSToFRS _DebitNoteSToFRS = new pages.DebitNoteSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("a9ac356a-1ff8-48d1-98c6-5613b1e1ba5a");
    _DebitNoteSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("281ed0ae-1966-4313-83f9-f02959a1af8f");
    _DebitNoteSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f4ead229-e1a6-4686-9726-2a8d72975380");
    _DebitNoteSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("13d7978e-e074-45d2-8c0b-01b123aa6311");
    _DebitNoteSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("e0eca6d7-6b04-416d-855d-2a9e825dcd28");
    _DebitNoteSToFRS.Click_NewDebitNote();
    

    TestModellerLogger.SetLastNodeGuid("190c6323-be0b-4dd1-b552-dbe6423a4af8");
    _DebitNoteSToFRS.Select_SupplierName("ABCSupplier");
    

    TestModellerLogger.SetLastNodeGuid("c9f1fef7-60b9-4d4b-a4a0-825e5638fb6e");
    _DebitNoteSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("a8f7d6e5-89f8-4f36-a154-0755a90aa5e9");
    _DebitNoteSToFRS.Enter_Date("44250");
    

    TestModellerLogger.SetLastNodeGuid("d0e22573-153e-435a-8026-8e497c35f9ee");
    _DebitNoteSToFRS.Select_ExpenseType("Commercial vehicles disposals");
    

    TestModellerLogger.SetLastNodeGuid("3f663a04-c82a-4f31-a2c8-3238da8ddb0c");
    _DebitNoteSToFRS.Enter_Description("Tenetur tempora reprehenderit hic voluptates molestiae voluptatem.
Sed veniam corrupti cupiditate voluptatem.
Consequatur quo quae.
Minus neque dolores quia consectetur amet ea culpa.
Molestias dolorem et laborum ut.
Distinctio odit dolorem sint.
Exercitationem sed architecto laborum veritatis quia voluptatem et.
Rem ipsam at voluptate voluptas ea.
Aperiam harum eaque quia perspiciatis voluptas dolorem possimus et in.
Hic corporis quos rerum quo autem quia voluptate.");
    

    TestModellerLogger.SetLastNodeGuid("3b383dc0-235e-4780-9859-f151196feb92");
    _DebitNoteSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("62f8964d-0533-4137-b19f-ed7484c16874");
    _DebitNoteSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("0c1c1062-a24e-491f-b466-c4f25be009dc");
    _DebitNoteSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("df34f121-e6c7-4386-b83d-071d26d7877e");
    _DebitNoteSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("d9ad9e73-0fa4-4130-8856-5d6c154b68b4");
    _DebitNoteSToFRS.Enter_Amount_Net("100");
    

    TestModellerLogger.SetLastNodeGuid("afe47079-aab8-40ac-8075-8edfd92c146a");
    _DebitNoteSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("093d78cf-a676-401c-9139-02e7e7db005f");
    _DebitNoteSToFRS.Click__Save_();
    

    }

    @Test  (groups= {"DebitNoteSTpFRS","DebitNoteSTpFRS - Default Profile"})
    @TestModellerPath(guid = "7fc4e361-aa6d-4498-a43a-80cf4154668b")
    public void GoToUrlAssertUrlClickExpenditureTABClickNewTABClickNewDebitNotePositiveSelectSupplierNameEnt30()
    {
        
        pages.DebitNoteSToFRS _DebitNoteSToFRS = new pages.DebitNoteSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("a9ac356a-1ff8-48d1-98c6-5613b1e1ba5a");
    _DebitNoteSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("281ed0ae-1966-4313-83f9-f02959a1af8f");
    _DebitNoteSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f4ead229-e1a6-4686-9726-2a8d72975380");
    _DebitNoteSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("13d7978e-e074-45d2-8c0b-01b123aa6311");
    _DebitNoteSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("e0eca6d7-6b04-416d-855d-2a9e825dcd28");
    _DebitNoteSToFRS.Click_NewDebitNote();
    

    TestModellerLogger.SetLastNodeGuid("190c6323-be0b-4dd1-b552-dbe6423a4af8");
    _DebitNoteSToFRS.Select_SupplierName("ABCSupplier");
    

    TestModellerLogger.SetLastNodeGuid("c9f1fef7-60b9-4d4b-a4a0-825e5638fb6e");
    _DebitNoteSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("a8f7d6e5-89f8-4f36-a154-0755a90aa5e9");
    _DebitNoteSToFRS.Enter_Date("44250");
    

    TestModellerLogger.SetLastNodeGuid("d0e22573-153e-435a-8026-8e497c35f9ee");
    _DebitNoteSToFRS.Select_ExpenseType("Commercial vehicles revaluation");
    

    TestModellerLogger.SetLastNodeGuid("3f663a04-c82a-4f31-a2c8-3238da8ddb0c");
    _DebitNoteSToFRS.Enter_Description("Sunt rerum voluptatem et.
Est sequi temporibus.
Aut reprehenderit nulla dolores.
Fuga voluptatum magni quo dolor.
Consequatur voluptatem dolor distinctio qui velit voluptas non non voluptatum.
Dicta ea quia.
Ratione quis ut ipsum est quia autem natus praesentium.
Dolorem vel maiores.
Rem impedit vitae ratione odio eum est nihil animi.
Quo dignissimos tempora voluptatem porro repudiandae nemo.");
    

    TestModellerLogger.SetLastNodeGuid("3b383dc0-235e-4780-9859-f151196feb92");
    _DebitNoteSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("62f8964d-0533-4137-b19f-ed7484c16874");
    _DebitNoteSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("0c1c1062-a24e-491f-b466-c4f25be009dc");
    _DebitNoteSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("df34f121-e6c7-4386-b83d-071d26d7877e");
    _DebitNoteSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("d9ad9e73-0fa4-4130-8856-5d6c154b68b4");
    _DebitNoteSToFRS.Enter_Amount_Net("100");
    

    TestModellerLogger.SetLastNodeGuid("afe47079-aab8-40ac-8075-8edfd92c146a");
    _DebitNoteSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("093d78cf-a676-401c-9139-02e7e7db005f");
    _DebitNoteSToFRS.Click__Save_();
    

    }*/

}
