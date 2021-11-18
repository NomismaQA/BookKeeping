package Supplier_test;

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
import utilities.ExcelUtility;
import utilities.testmodeller.TestModellerLogger;

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/8346cb86-1ea8-4cff-b2e0-60aa27fc00e1
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1099, profileId = 100998)
public class SupplierBillSToFRS_DefaultProfile extends TestBase
{
	
    
    @Test  (groups= {"SupplierBillSToFRS","SupplierBillSToFRS - Default Profile"})
    @TestModellerPath(guid = "610a4bb6-bdf4-4116-b035-24b8633d42cb")
    public void GoToUrlAssertUrlClickExpenditureTABClickNewTABClickNewSupplierBillPositiveSelectSupplierNameE1() throws InvalidFormatException, InterruptedException, HeadlessException, IOException, AWTException
    {
    	
        
        Supplier_pages.SupplierBillSToFRS _SupplierBillSToFRS = new Supplier_pages.SupplierBillSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("7b21b860-8f6c-4e5e-8f4d-0ef9aedf75e5");
    _SupplierBillSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3d11c569-a0da-4838-a238-3d3cd071f91d");
    _SupplierBillSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5c30d940-2a3c-4ce2-9f6d-f491e71a1755");
    _SupplierBillSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("02bea7d1-9589-4278-8c66-58e376721799");
    _SupplierBillSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("fc395eef-59ac-4e0c-8092-d11ecdb61b84");
    _SupplierBillSToFRS.Click_NewSupplierBill();
    

    TestModellerLogger.SetLastNodeGuid("9ed916b8-79f8-4b59-a274-ed9c520242c8");
    _SupplierBillSToFRS.Select_SupplierName("Generic Purchase Supplier");
    

    TestModellerLogger.SetLastNodeGuid("6cbb598e-673a-45cd-9f0a-ec53cb56f09d");
    _SupplierBillSToFRS.Enter_DefaultCurrency(null);
    

    TestModellerLogger.SetLastNodeGuid("6516ccf8-ae24-42b1-b271-2bb390a6f8c3");
    _SupplierBillSToFRS.Enter_BillNo(null);
    

    TestModellerLogger.SetLastNodeGuid("12466744-0bd3-4135-9300-e044e7148e58");
    _SupplierBillSToFRS.Enter_Date("44249");
    

    TestModellerLogger.SetLastNodeGuid("7ea52093-1dd7-4979-8034-aeaef336d945");
    _SupplierBillSToFRS.Select_ExpenseType("");
    

    TestModellerLogger.SetLastNodeGuid("de8f87b1-ff3a-421c-9290-6ddaef339bf2");
    _SupplierBillSToFRS.Enter_Description("ppp");
    

    TestModellerLogger.SetLastNodeGuid("31e40f93-4cb6-45b2-bb91-cdd42e0f2f68");
    _SupplierBillSToFRS.Enter_UnitPrice(null);
    

    TestModellerLogger.SetLastNodeGuid("956a775c-cdf6-4d7d-949f-76ac35f8991c");
    _SupplierBillSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("5be5550e-c06b-4dbd-bcbf-748aedd3b634");
    _SupplierBillSToFRS.Enter_VATRate(null);
    

    TestModellerLogger.SetLastNodeGuid("1721e266-7328-4f01-8af9-62c60f672a82");
    _SupplierBillSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("86be5d84-b080-4b00-b39a-57ef6d127c84");
    _SupplierBillSToFRS.Enter_Amount("");
    

    TestModellerLogger.SetLastNodeGuid("d76e980e-6867-446d-a13a-3bbe2cc719a9");
    _SupplierBillSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("9720f223-ad75-48cf-9a78-a8a001ca0dfb");
    _SupplierBillSToFRS.Click_SaveButton();
    

    }

  /* @Test  (groups= {"SupplierBillSToFRS","SupplierBillSToFRS - Default Profile"})
    @TestModellerPath(guid = "d0e67865-969a-437a-9e98-11f8c365ac96")
    public void GoToUrlAssertUrlClickExpenditureTABClickNewTABClickNewSupplierBillPositiveSelectSupplierNameE2()
    {
        
        pages.SupplierBillSToFRS _SupplierBillSToFRS = new pages.SupplierBillSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("7b21b860-8f6c-4e5e-8f4d-0ef9aedf75e5");
    _SupplierBillSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3d11c569-a0da-4838-a238-3d3cd071f91d");
    _SupplierBillSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5c30d940-2a3c-4ce2-9f6d-f491e71a1755");
    _SupplierBillSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("02bea7d1-9589-4278-8c66-58e376721799");
    _SupplierBillSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("fc395eef-59ac-4e0c-8092-d11ecdb61b84");
    _SupplierBillSToFRS.Click_NewSupplierBill();
    

    TestModellerLogger.SetLastNodeGuid("9ed916b8-79f8-4b59-a274-ed9c520242c8");
    _SupplierBillSToFRS.Select_SupplierName("Generic Purchase Supplier");
    

    TestModellerLogger.SetLastNodeGuid("6cbb598e-673a-45cd-9f0a-ec53cb56f09d");
    _SupplierBillSToFRS.Enter_DefaultCurrency();
    

    TestModellerLogger.SetLastNodeGuid("6516ccf8-ae24-42b1-b271-2bb390a6f8c3");
    _SupplierBillSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("12466744-0bd3-4135-9300-e044e7148e58");
    _SupplierBillSToFRS.Enter_Date("44249");
    

    TestModellerLogger.SetLastNodeGuid("7ea52093-1dd7-4979-8034-aeaef336d945");
    _SupplierBillSToFRS.Select_ExpenseType("");
    

    TestModellerLogger.SetLastNodeGuid("de8f87b1-ff3a-421c-9290-6ddaef339bf2");
    _SupplierBillSToFRS.Enter_Description("Exercitationem blanditiis quasi qui aut corporis cumque deserunt aspernatur quidem.
Sunt veritatis nobis voluptas possimus nihil in.
Consequatur enim natus voluptatem dolorem.
Cum qui non asperiores dolor voluptatem natus culpa rerum in.
Quasi et ipsa praesentium totam sed sit ut laudantium vitae.
Dolor voluptas pariatur enim sapiente sed.
Et id adipisci et eius quia neque corrupti mollitia.
Voluptatem a excepturi fugit veniam qui nobis enim sed eveniet.
Aut incidunt repudiandae cumque voluptas magnam sapiente consequatur ratione et.
Ex consequatur voluptatem nam id.");
    

    TestModellerLogger.SetLastNodeGuid("31e40f93-4cb6-45b2-bb91-cdd42e0f2f68");
    _SupplierBillSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("956a775c-cdf6-4d7d-949f-76ac35f8991c");
    _SupplierBillSToFRS.Select_VATRateType("Zero Rate");
    

    TestModellerLogger.SetLastNodeGuid("5be5550e-c06b-4dbd-bcbf-748aedd3b634");
    _SupplierBillSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("1721e266-7328-4f01-8af9-62c60f672a82");
    _SupplierBillSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("86be5d84-b080-4b00-b39a-57ef6d127c84");
    _SupplierBillSToFRS.Enter_Amount("");
    

    TestModellerLogger.SetLastNodeGuid("d76e980e-6867-446d-a13a-3bbe2cc719a9");
    _SupplierBillSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("9720f223-ad75-48cf-9a78-a8a001ca0dfb");
    _SupplierBillSToFRS.Click_SaveButton();
    

    }

    @Test  (groups= {"SupplierBillSToFRS","SupplierBillSToFRS - Default Profile"})
    @TestModellerPath(guid = "8dc5a95e-4e3f-47a4-b5d2-edde1fa949df")
    public void GoToUrlAssertUrlClickExpenditureTABClickNewTABClickNewSupplierBillPositiveSelectSupplierNameE3()
    {
        
        pages.SupplierBillSToFRS _SupplierBillSToFRS = new pages.SupplierBillSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("7b21b860-8f6c-4e5e-8f4d-0ef9aedf75e5");
    _SupplierBillSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3d11c569-a0da-4838-a238-3d3cd071f91d");
    _SupplierBillSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5c30d940-2a3c-4ce2-9f6d-f491e71a1755");
    _SupplierBillSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("02bea7d1-9589-4278-8c66-58e376721799");
    _SupplierBillSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("fc395eef-59ac-4e0c-8092-d11ecdb61b84");
    _SupplierBillSToFRS.Click_NewSupplierBill();
    

    TestModellerLogger.SetLastNodeGuid("9ed916b8-79f8-4b59-a274-ed9c520242c8");
    _SupplierBillSToFRS.Select_SupplierName("Generic Purchase Supplier");
    

    TestModellerLogger.SetLastNodeGuid("6cbb598e-673a-45cd-9f0a-ec53cb56f09d");
    _SupplierBillSToFRS.Enter_DefaultCurrency();
    

    TestModellerLogger.SetLastNodeGuid("6516ccf8-ae24-42b1-b271-2bb390a6f8c3");
    _SupplierBillSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("12466744-0bd3-4135-9300-e044e7148e58");
    _SupplierBillSToFRS.Enter_Date("44249");
    

    TestModellerLogger.SetLastNodeGuid("7ea52093-1dd7-4979-8034-aeaef336d945");
    _SupplierBillSToFRS.Select_ExpenseType("");
    

    TestModellerLogger.SetLastNodeGuid("de8f87b1-ff3a-421c-9290-6ddaef339bf2");
    _SupplierBillSToFRS.Enter_Description("Numquam fugiat exercitationem voluptatibus.
Velit doloremque molestias sunt nemo eveniet ducimus.
Alias molestiae corporis officiis.
Molestias veniam sed vel tenetur sed sed.
Perferendis a animi cumque quibusdam dolorum.
Occaecati inventore cumque animi sint molestias qui aut.
Ut rerum et et.
Et recusandae illo recusandae et nesciunt qui sapiente fugiat aut.
Eos voluptatem qui.
Et accusamus excepturi.");
    

    TestModellerLogger.SetLastNodeGuid("31e40f93-4cb6-45b2-bb91-cdd42e0f2f68");
    _SupplierBillSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("956a775c-cdf6-4d7d-949f-76ac35f8991c");
    _SupplierBillSToFRS.Select_VATRateType("Reduced Rate");
    

    TestModellerLogger.SetLastNodeGuid("5be5550e-c06b-4dbd-bcbf-748aedd3b634");
    _SupplierBillSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("1721e266-7328-4f01-8af9-62c60f672a82");
    _SupplierBillSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("86be5d84-b080-4b00-b39a-57ef6d127c84");
    _SupplierBillSToFRS.Enter_Amount("");
    

    TestModellerLogger.SetLastNodeGuid("d76e980e-6867-446d-a13a-3bbe2cc719a9");
    _SupplierBillSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("9720f223-ad75-48cf-9a78-a8a001ca0dfb");
    _SupplierBillSToFRS.Click_SaveButton();
    

    }

    @Test  (groups= {"SupplierBillSToFRS","SupplierBillSToFRS - Default Profile"})
    @TestModellerPath(guid = "fd6c6d94-ffeb-41e7-ab5d-a017f0090f83")
    public void GoToUrlAssertUrlClickExpenditureTABClickNewTABClickNewSupplierBillPositiveSelectSupplierNameE4()
    {
        
        pages.SupplierBillSToFRS _SupplierBillSToFRS = new pages.SupplierBillSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("7b21b860-8f6c-4e5e-8f4d-0ef9aedf75e5");
    _SupplierBillSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3d11c569-a0da-4838-a238-3d3cd071f91d");
    _SupplierBillSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5c30d940-2a3c-4ce2-9f6d-f491e71a1755");
    _SupplierBillSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("02bea7d1-9589-4278-8c66-58e376721799");
    _SupplierBillSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("fc395eef-59ac-4e0c-8092-d11ecdb61b84");
    _SupplierBillSToFRS.Click_NewSupplierBill();
    

    TestModellerLogger.SetLastNodeGuid("9ed916b8-79f8-4b59-a274-ed9c520242c8");
    _SupplierBillSToFRS.Select_SupplierName("Generic Purchase Supplier");
    

    TestModellerLogger.SetLastNodeGuid("6cbb598e-673a-45cd-9f0a-ec53cb56f09d");
    _SupplierBillSToFRS.Enter_DefaultCurrency();
    

    TestModellerLogger.SetLastNodeGuid("6516ccf8-ae24-42b1-b271-2bb390a6f8c3");
    _SupplierBillSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("12466744-0bd3-4135-9300-e044e7148e58");
    _SupplierBillSToFRS.Enter_Date("44249");
    

    TestModellerLogger.SetLastNodeGuid("7ea52093-1dd7-4979-8034-aeaef336d945");
    _SupplierBillSToFRS.Select_ExpenseType("");
    

    TestModellerLogger.SetLastNodeGuid("de8f87b1-ff3a-421c-9290-6ddaef339bf2");
    _SupplierBillSToFRS.Enter_Description("Repellendus facilis earum est nihil.
Aut est in consequatur aut aut dolores adipisci rem aut.
Unde assumenda asperiores.
Quia iste tempora illum molestias inventore.
Nihil consequatur nostrum in iusto.
Eos suscipit delectus quia aliquid reiciendis autem rem illo.
Quisquam officiis a nam cum quis quae ex aspernatur sint.
Culpa dicta porro voluptates adipisci eveniet est voluptatem deserunt.
Impedit in ut inventore dolores qui qui velit.
Sed doloribus sequi animi quas rerum unde reprehenderit soluta.");
    

    TestModellerLogger.SetLastNodeGuid("31e40f93-4cb6-45b2-bb91-cdd42e0f2f68");
    _SupplierBillSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("956a775c-cdf6-4d7d-949f-76ac35f8991c");
    _SupplierBillSToFRS.Select_VATRateType("No VAT");
    

    TestModellerLogger.SetLastNodeGuid("5be5550e-c06b-4dbd-bcbf-748aedd3b634");
    _SupplierBillSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("1721e266-7328-4f01-8af9-62c60f672a82");
    _SupplierBillSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("86be5d84-b080-4b00-b39a-57ef6d127c84");
    _SupplierBillSToFRS.Enter_Amount("");
    

    TestModellerLogger.SetLastNodeGuid("d76e980e-6867-446d-a13a-3bbe2cc719a9");
    _SupplierBillSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("9720f223-ad75-48cf-9a78-a8a001ca0dfb");
    _SupplierBillSToFRS.Click_SaveButton();
    

    }

    @Test  (groups= {"SupplierBillSToFRS","SupplierBillSToFRS - Default Profile"})
    @TestModellerPath(guid = "a989b8af-e76a-4030-b338-418d457f2778")
    public void GoToUrlAssertUrlClickExpenditureTABClickNewTABClickNewSupplierBillPositiveSelectSupplierNameE5()
    {
        
        pages.SupplierBillSToFRS _SupplierBillSToFRS = new pages.SupplierBillSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("7b21b860-8f6c-4e5e-8f4d-0ef9aedf75e5");
    _SupplierBillSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3d11c569-a0da-4838-a238-3d3cd071f91d");
    _SupplierBillSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5c30d940-2a3c-4ce2-9f6d-f491e71a1755");
    _SupplierBillSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("02bea7d1-9589-4278-8c66-58e376721799");
    _SupplierBillSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("fc395eef-59ac-4e0c-8092-d11ecdb61b84");
    _SupplierBillSToFRS.Click_NewSupplierBill();
    

    TestModellerLogger.SetLastNodeGuid("9ed916b8-79f8-4b59-a274-ed9c520242c8");
    _SupplierBillSToFRS.Select_SupplierName("Generic Purchase Supplier");
    

    TestModellerLogger.SetLastNodeGuid("6cbb598e-673a-45cd-9f0a-ec53cb56f09d");
    _SupplierBillSToFRS.Enter_DefaultCurrency();
    

    TestModellerLogger.SetLastNodeGuid("6516ccf8-ae24-42b1-b271-2bb390a6f8c3");
    _SupplierBillSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("12466744-0bd3-4135-9300-e044e7148e58");
    _SupplierBillSToFRS.Enter_Date("44249");
    

    TestModellerLogger.SetLastNodeGuid("7ea52093-1dd7-4979-8034-aeaef336d945");
    _SupplierBillSToFRS.Select_ExpenseType("");
    

    TestModellerLogger.SetLastNodeGuid("de8f87b1-ff3a-421c-9290-6ddaef339bf2");
    _SupplierBillSToFRS.Enter_Description("Omnis recusandae corporis sint.
Iste magnam dolore ullam sequi vitae qui quia praesentium labore.
Exercitationem est est.
Qui tempora sequi nemo ipsam dolorem nihil.
Numquam sapiente facilis quas ut consequuntur.
Dolor voluptate distinctio autem et rerum eveniet occaecati quae.
Inventore dolor optio commodi quos et earum repellendus.
Asperiores provident dolor asperiores.
Qui dolores assumenda aperiam laboriosam molestias in.
Vitae fuga praesentium id.");
    

    TestModellerLogger.SetLastNodeGuid("31e40f93-4cb6-45b2-bb91-cdd42e0f2f68");
    _SupplierBillSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("956a775c-cdf6-4d7d-949f-76ac35f8991c");
    _SupplierBillSToFRS.Select_VATRateType("Exempt");
    

    TestModellerLogger.SetLastNodeGuid("5be5550e-c06b-4dbd-bcbf-748aedd3b634");
    _SupplierBillSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("1721e266-7328-4f01-8af9-62c60f672a82");
    _SupplierBillSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("86be5d84-b080-4b00-b39a-57ef6d127c84");
    _SupplierBillSToFRS.Enter_Amount("");
    

    TestModellerLogger.SetLastNodeGuid("d76e980e-6867-446d-a13a-3bbe2cc719a9");
    _SupplierBillSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("9720f223-ad75-48cf-9a78-a8a001ca0dfb");
    _SupplierBillSToFRS.Click_SaveButton();
    

    }

    @Test  (groups= {"SupplierBillSToFRS","SupplierBillSToFRS - Default Profile"})
    @TestModellerPath(guid = "f3c3f181-e3b7-4d74-aef4-7eb19092fdcd")
    public void GoToUrlAssertUrlClickExpenditureTABClickNewTABClickNewSupplierBillPositiveSelectSupplierNameE6()
    {
        
        pages.SupplierBillSToFRS _SupplierBillSToFRS = new pages.SupplierBillSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("7b21b860-8f6c-4e5e-8f4d-0ef9aedf75e5");
    _SupplierBillSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3d11c569-a0da-4838-a238-3d3cd071f91d");
    _SupplierBillSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5c30d940-2a3c-4ce2-9f6d-f491e71a1755");
    _SupplierBillSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("02bea7d1-9589-4278-8c66-58e376721799");
    _SupplierBillSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("fc395eef-59ac-4e0c-8092-d11ecdb61b84");
    _SupplierBillSToFRS.Click_NewSupplierBill();
    

    TestModellerLogger.SetLastNodeGuid("9ed916b8-79f8-4b59-a274-ed9c520242c8");
    _SupplierBillSToFRS.Select_SupplierName("Generic Purchase Supplier");
    

    TestModellerLogger.SetLastNodeGuid("6cbb598e-673a-45cd-9f0a-ec53cb56f09d");
    _SupplierBillSToFRS.Enter_DefaultCurrency();
    

    TestModellerLogger.SetLastNodeGuid("6516ccf8-ae24-42b1-b271-2bb390a6f8c3");
    _SupplierBillSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("12466744-0bd3-4135-9300-e044e7148e58");
    _SupplierBillSToFRS.Enter_Date("44249");
    

    TestModellerLogger.SetLastNodeGuid("7ea52093-1dd7-4979-8034-aeaef336d945");
    _SupplierBillSToFRS.Select_ExpenseType("");
    

    TestModellerLogger.SetLastNodeGuid("de8f87b1-ff3a-421c-9290-6ddaef339bf2");
    _SupplierBillSToFRS.Enter_Description("Incidunt odit et dolore nihil aut animi quaerat.
Qui quia est.
Nihil quisquam dolorem magni corporis.
Esse inventore incidunt.
Sed eos sit sed magni.
Cumque quasi et rerum perferendis impedit cum corrupti placeat dolorem.
Reprehenderit nisi aspernatur ea est enim accusantium aut.
Ut hic quia blanditiis amet culpa repellat quod sed.
Occaecati in rem quis ut distinctio.
Quo exercitationem repellat quae.");
    

    TestModellerLogger.SetLastNodeGuid("31e40f93-4cb6-45b2-bb91-cdd42e0f2f68");
    _SupplierBillSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("956a775c-cdf6-4d7d-949f-76ac35f8991c");
    _SupplierBillSToFRS.Select_VATRateType("Out of Scope");
    

    TestModellerLogger.SetLastNodeGuid("5be5550e-c06b-4dbd-bcbf-748aedd3b634");
    _SupplierBillSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("1721e266-7328-4f01-8af9-62c60f672a82");
    _SupplierBillSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("86be5d84-b080-4b00-b39a-57ef6d127c84");
    _SupplierBillSToFRS.Enter_Amount("");
    

    TestModellerLogger.SetLastNodeGuid("d76e980e-6867-446d-a13a-3bbe2cc719a9");
    _SupplierBillSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("9720f223-ad75-48cf-9a78-a8a001ca0dfb");
    _SupplierBillSToFRS.Click_SaveButton();
    

    }

    @Test  (groups= {"SupplierBillSToFRS","SupplierBillSToFRS - Default Profile"})
    @TestModellerPath(guid = "c7f96ef1-ca33-40ad-84c3-f7bbd4046005")
    public void GoToUrlAssertUrlClickExpenditureTABClickNewTABClickNewSupplierBillPositiveSelectSupplierNameE7()
    {
        
        pages.SupplierBillSToFRS _SupplierBillSToFRS = new pages.SupplierBillSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("7b21b860-8f6c-4e5e-8f4d-0ef9aedf75e5");
    _SupplierBillSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3d11c569-a0da-4838-a238-3d3cd071f91d");
    _SupplierBillSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5c30d940-2a3c-4ce2-9f6d-f491e71a1755");
    _SupplierBillSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("02bea7d1-9589-4278-8c66-58e376721799");
    _SupplierBillSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("fc395eef-59ac-4e0c-8092-d11ecdb61b84");
    _SupplierBillSToFRS.Click_NewSupplierBill();
    

    TestModellerLogger.SetLastNodeGuid("9ed916b8-79f8-4b59-a274-ed9c520242c8");
    _SupplierBillSToFRS.Select_SupplierName("Generic Purchase Supplier");
    

    TestModellerLogger.SetLastNodeGuid("6cbb598e-673a-45cd-9f0a-ec53cb56f09d");
    _SupplierBillSToFRS.Enter_DefaultCurrency();
    

    TestModellerLogger.SetLastNodeGuid("6516ccf8-ae24-42b1-b271-2bb390a6f8c3");
    _SupplierBillSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("12466744-0bd3-4135-9300-e044e7148e58");
    _SupplierBillSToFRS.Enter_Date("44249");
    

    TestModellerLogger.SetLastNodeGuid("7ea52093-1dd7-4979-8034-aeaef336d945");
    _SupplierBillSToFRS.Select_ExpenseType("Purchases");
    

    TestModellerLogger.SetLastNodeGuid("de8f87b1-ff3a-421c-9290-6ddaef339bf2");
    _SupplierBillSToFRS.Enter_Description("Eum voluptatum suscipit accusantium porro.
Sapiente rem omnis sequi.
Ad sed placeat maxime ducimus cumque iusto impedit.
Hic commodi corporis sunt et ut facere maxime et voluptatum.
Consequatur consequatur aut error pariatur quia nesciunt et.
Dolor et fugiat commodi nulla velit quo mollitia repudiandae.
Dolores eos quis aut iure voluptatem ipsum et odit.
Vel eius eaque beatae nihil et laudantium non.
Eveniet quia ut similique.
Sequi rerum non itaque et est magni sequi eum.");
    

    TestModellerLogger.SetLastNodeGuid("31e40f93-4cb6-45b2-bb91-cdd42e0f2f68");
    _SupplierBillSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("956a775c-cdf6-4d7d-949f-76ac35f8991c");
    _SupplierBillSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("5be5550e-c06b-4dbd-bcbf-748aedd3b634");
    _SupplierBillSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("1721e266-7328-4f01-8af9-62c60f672a82");
    _SupplierBillSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("86be5d84-b080-4b00-b39a-57ef6d127c84");
    _SupplierBillSToFRS.Enter_Amount("");
    

    TestModellerLogger.SetLastNodeGuid("d76e980e-6867-446d-a13a-3bbe2cc719a9");
    _SupplierBillSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("9720f223-ad75-48cf-9a78-a8a001ca0dfb");
    _SupplierBillSToFRS.Click_SaveButton();
    

    }

    @Test  (groups= {"SupplierBillSToFRS","SupplierBillSToFRS - Default Profile"})
    @TestModellerPath(guid = "c09d099f-cd1f-47b2-90fc-3daf2b6c5bac")
    public void GoToUrlAssertUrlClickExpenditureTABClickNewTABClickNewSupplierBillPositiveSelectSupplierNameE8()
    {
        
        pages.SupplierBillSToFRS _SupplierBillSToFRS = new pages.SupplierBillSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("7b21b860-8f6c-4e5e-8f4d-0ef9aedf75e5");
    _SupplierBillSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3d11c569-a0da-4838-a238-3d3cd071f91d");
    _SupplierBillSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5c30d940-2a3c-4ce2-9f6d-f491e71a1755");
    _SupplierBillSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("02bea7d1-9589-4278-8c66-58e376721799");
    _SupplierBillSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("fc395eef-59ac-4e0c-8092-d11ecdb61b84");
    _SupplierBillSToFRS.Click_NewSupplierBill();
    

    TestModellerLogger.SetLastNodeGuid("9ed916b8-79f8-4b59-a274-ed9c520242c8");
    _SupplierBillSToFRS.Select_SupplierName("Generic Purchase Supplier");
    

    TestModellerLogger.SetLastNodeGuid("6cbb598e-673a-45cd-9f0a-ec53cb56f09d");
    _SupplierBillSToFRS.Enter_DefaultCurrency();
    

    TestModellerLogger.SetLastNodeGuid("6516ccf8-ae24-42b1-b271-2bb390a6f8c3");
    _SupplierBillSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("12466744-0bd3-4135-9300-e044e7148e58");
    _SupplierBillSToFRS.Enter_Date("44249");
    

    TestModellerLogger.SetLastNodeGuid("7ea52093-1dd7-4979-8034-aeaef336d945");
    _SupplierBillSToFRS.Select_ExpenseType("Subcontractors");
    

    TestModellerLogger.SetLastNodeGuid("de8f87b1-ff3a-421c-9290-6ddaef339bf2");
    _SupplierBillSToFRS.Enter_Description("Laboriosam accusamus occaecati cumque dolorum ut cum aut.
Sed atque natus.
Possimus earum molestiae.
Enim velit sit dignissimos mollitia nostrum ducimus a.
Quos ut repellat eum laborum tempora iure.
Id iste ea voluptas et rerum.
Dignissimos atque qui ex.
Eos est repellat voluptatem doloribus qui quod.
Eius maxime in architecto quod quia ab dignissimos aut.
Quas quaerat quia est sit eum occaecati ut.");
    

    TestModellerLogger.SetLastNodeGuid("31e40f93-4cb6-45b2-bb91-cdd42e0f2f68");
    _SupplierBillSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("956a775c-cdf6-4d7d-949f-76ac35f8991c");
    _SupplierBillSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("5be5550e-c06b-4dbd-bcbf-748aedd3b634");
    _SupplierBillSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("1721e266-7328-4f01-8af9-62c60f672a82");
    _SupplierBillSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("86be5d84-b080-4b00-b39a-57ef6d127c84");
    _SupplierBillSToFRS.Enter_Amount("");
    

    TestModellerLogger.SetLastNodeGuid("d76e980e-6867-446d-a13a-3bbe2cc719a9");
    _SupplierBillSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("9720f223-ad75-48cf-9a78-a8a001ca0dfb");
    _SupplierBillSToFRS.Click_SaveButton();
    

    }

    @Test  (groups= {"SupplierBillSToFRS","SupplierBillSToFRS - Default Profile"})
    @TestModellerPath(guid = "7400859f-df94-4053-921d-a001ec8e136d")
    public void GoToUrlAssertUrlClickExpenditureTABClickNewTABClickNewSupplierBillPositiveSelectSupplierNameE9()
    {
        
        pages.SupplierBillSToFRS _SupplierBillSToFRS = new pages.SupplierBillSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("7b21b860-8f6c-4e5e-8f4d-0ef9aedf75e5");
    _SupplierBillSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3d11c569-a0da-4838-a238-3d3cd071f91d");
    _SupplierBillSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5c30d940-2a3c-4ce2-9f6d-f491e71a1755");
    _SupplierBillSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("02bea7d1-9589-4278-8c66-58e376721799");
    _SupplierBillSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("fc395eef-59ac-4e0c-8092-d11ecdb61b84");
    _SupplierBillSToFRS.Click_NewSupplierBill();
    

    TestModellerLogger.SetLastNodeGuid("9ed916b8-79f8-4b59-a274-ed9c520242c8");
    _SupplierBillSToFRS.Select_SupplierName("Generic Purchase Supplier");
    

    TestModellerLogger.SetLastNodeGuid("6cbb598e-673a-45cd-9f0a-ec53cb56f09d");
    _SupplierBillSToFRS.Enter_DefaultCurrency();
    

    TestModellerLogger.SetLastNodeGuid("6516ccf8-ae24-42b1-b271-2bb390a6f8c3");
    _SupplierBillSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("12466744-0bd3-4135-9300-e044e7148e58");
    _SupplierBillSToFRS.Enter_Date("44249");
    

    TestModellerLogger.SetLastNodeGuid("7ea52093-1dd7-4979-8034-aeaef336d945");
    _SupplierBillSToFRS.Select_ExpenseType("Accountancy fee");
    

    TestModellerLogger.SetLastNodeGuid("de8f87b1-ff3a-421c-9290-6ddaef339bf2");
    _SupplierBillSToFRS.Enter_Description("Assumenda quibusdam repellat aut voluptas sunt.
Rerum quisquam ut cum qui.
Atque in sequi doloribus reiciendis sit voluptatem repellendus deserunt.
Natus vel rerum aspernatur quam non facere laborum quibusdam.
Quam ut perferendis.
Quidem id voluptatibus autem.
Voluptas quia sed minima quo omnis.
Quos accusantium voluptate consectetur hic dolorum dolor.
Iusto exercitationem saepe.
Rerum molestiae delectus fuga aut autem quis excepturi error recusandae.");
    

    TestModellerLogger.SetLastNodeGuid("31e40f93-4cb6-45b2-bb91-cdd42e0f2f68");
    _SupplierBillSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("956a775c-cdf6-4d7d-949f-76ac35f8991c");
    _SupplierBillSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("5be5550e-c06b-4dbd-bcbf-748aedd3b634");
    _SupplierBillSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("1721e266-7328-4f01-8af9-62c60f672a82");
    _SupplierBillSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("86be5d84-b080-4b00-b39a-57ef6d127c84");
    _SupplierBillSToFRS.Enter_Amount("");
    

    TestModellerLogger.SetLastNodeGuid("d76e980e-6867-446d-a13a-3bbe2cc719a9");
    _SupplierBillSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("9720f223-ad75-48cf-9a78-a8a001ca0dfb");
    _SupplierBillSToFRS.Click_SaveButton();
    

    }

    @Test  (groups= {"SupplierBillSToFRS","SupplierBillSToFRS - Default Profile"})
    @TestModellerPath(guid = "04312709-8e86-45fe-9cb1-4e501e0ebaa1")
    public void GoToUrlAssertUrlClickExpenditureTABClickNewTABClickNewSupplierBillPositiveSelectSupplierName10()
    {
        
        pages.SupplierBillSToFRS _SupplierBillSToFRS = new pages.SupplierBillSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("7b21b860-8f6c-4e5e-8f4d-0ef9aedf75e5");
    _SupplierBillSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3d11c569-a0da-4838-a238-3d3cd071f91d");
    _SupplierBillSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5c30d940-2a3c-4ce2-9f6d-f491e71a1755");
    _SupplierBillSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("02bea7d1-9589-4278-8c66-58e376721799");
    _SupplierBillSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("fc395eef-59ac-4e0c-8092-d11ecdb61b84");
    _SupplierBillSToFRS.Click_NewSupplierBill();
    

    TestModellerLogger.SetLastNodeGuid("9ed916b8-79f8-4b59-a274-ed9c520242c8");
    _SupplierBillSToFRS.Select_SupplierName("Generic Purchase Supplier");
    

    TestModellerLogger.SetLastNodeGuid("6cbb598e-673a-45cd-9f0a-ec53cb56f09d");
    _SupplierBillSToFRS.Enter_DefaultCurrency();
    

    TestModellerLogger.SetLastNodeGuid("6516ccf8-ae24-42b1-b271-2bb390a6f8c3");
    _SupplierBillSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("12466744-0bd3-4135-9300-e044e7148e58");
    _SupplierBillSToFRS.Enter_Date("44249");
    

    TestModellerLogger.SetLastNodeGuid("7ea52093-1dd7-4979-8034-aeaef336d945");
    _SupplierBillSToFRS.Select_ExpenseType("Advertising, sales promotion, marketing");
    

    TestModellerLogger.SetLastNodeGuid("de8f87b1-ff3a-421c-9290-6ddaef339bf2");
    _SupplierBillSToFRS.Enter_Description("Et ut est corporis voluptatem.
Ea sed ut voluptatem dolorem quisquam qui.
Id quasi quibusdam autem.
Repellendus nisi voluptas doloribus molestiae illo commodi culpa quia ut.
Voluptatem doloremque natus tempore neque.
Ullam voluptatem repudiandae ducimus beatae possimus distinctio tempore quia.
Labore esse ad nemo in porro sunt ratione.
In ea eius.
Ut doloribus aperiam quidem.
Inventore quibusdam neque illo ipsa omnis assumenda deleniti aut perspiciatis.");
    

    TestModellerLogger.SetLastNodeGuid("31e40f93-4cb6-45b2-bb91-cdd42e0f2f68");
    _SupplierBillSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("956a775c-cdf6-4d7d-949f-76ac35f8991c");
    _SupplierBillSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("5be5550e-c06b-4dbd-bcbf-748aedd3b634");
    _SupplierBillSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("1721e266-7328-4f01-8af9-62c60f672a82");
    _SupplierBillSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("86be5d84-b080-4b00-b39a-57ef6d127c84");
    _SupplierBillSToFRS.Enter_Amount("");
    

    TestModellerLogger.SetLastNodeGuid("d76e980e-6867-446d-a13a-3bbe2cc719a9");
    _SupplierBillSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("9720f223-ad75-48cf-9a78-a8a001ca0dfb");
    _SupplierBillSToFRS.Click_SaveButton();
    

    }

    @Test  (groups= {"SupplierBillSToFRS","SupplierBillSToFRS - Default Profile"})
    @TestModellerPath(guid = "398085e9-dff8-4ea0-9994-4118831a022e")
    public void GoToUrlAssertUrlClickExpenditureTABClickNewTABClickNewSupplierBillPositiveSelectSupplierName11()
    {
        
        pages.SupplierBillSToFRS _SupplierBillSToFRS = new pages.SupplierBillSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("7b21b860-8f6c-4e5e-8f4d-0ef9aedf75e5");
    _SupplierBillSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3d11c569-a0da-4838-a238-3d3cd071f91d");
    _SupplierBillSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5c30d940-2a3c-4ce2-9f6d-f491e71a1755");
    _SupplierBillSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("02bea7d1-9589-4278-8c66-58e376721799");
    _SupplierBillSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("fc395eef-59ac-4e0c-8092-d11ecdb61b84");
    _SupplierBillSToFRS.Click_NewSupplierBill();
    

    TestModellerLogger.SetLastNodeGuid("9ed916b8-79f8-4b59-a274-ed9c520242c8");
    _SupplierBillSToFRS.Select_SupplierName("Generic Purchase Supplier");
    

    TestModellerLogger.SetLastNodeGuid("6cbb598e-673a-45cd-9f0a-ec53cb56f09d");
    _SupplierBillSToFRS.Enter_DefaultCurrency();
    

    TestModellerLogger.SetLastNodeGuid("6516ccf8-ae24-42b1-b271-2bb390a6f8c3");
    _SupplierBillSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("12466744-0bd3-4135-9300-e044e7148e58");
    _SupplierBillSToFRS.Enter_Date("44249");
    

    TestModellerLogger.SetLastNodeGuid("7ea52093-1dd7-4979-8034-aeaef336d945");
    _SupplierBillSToFRS.Select_ExpenseType("Bank, card and overdraft charges");
    

    TestModellerLogger.SetLastNodeGuid("de8f87b1-ff3a-421c-9290-6ddaef339bf2");
    _SupplierBillSToFRS.Enter_Description("Qui sit ipsam nemo nisi consequuntur neque ab.
Voluptas perspiciatis blanditiis velit distinctio omnis corrupti.
Quasi perferendis blanditiis.
Quia voluptas et.
Unde sit autem excepturi sed.
Quo doloremque odio.
Eius ipsa voluptates et est eum.
Ipsa magni excepturi nisi placeat qui veniam enim est velit.
Sunt distinctio laudantium esse cumque voluptatibus quibusdam earum temporibus.
Inventore libero impedit molestiae ut incidunt ut.");
    

    TestModellerLogger.SetLastNodeGuid("31e40f93-4cb6-45b2-bb91-cdd42e0f2f68");
    _SupplierBillSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("956a775c-cdf6-4d7d-949f-76ac35f8991c");
    _SupplierBillSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("5be5550e-c06b-4dbd-bcbf-748aedd3b634");
    _SupplierBillSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("1721e266-7328-4f01-8af9-62c60f672a82");
    _SupplierBillSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("86be5d84-b080-4b00-b39a-57ef6d127c84");
    _SupplierBillSToFRS.Enter_Amount("");
    

    TestModellerLogger.SetLastNodeGuid("d76e980e-6867-446d-a13a-3bbe2cc719a9");
    _SupplierBillSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("9720f223-ad75-48cf-9a78-a8a001ca0dfb");
    _SupplierBillSToFRS.Click_SaveButton();
    

    }

    @Test  (groups= {"SupplierBillSToFRS","SupplierBillSToFRS - Default Profile"})
    @TestModellerPath(guid = "ca915127-04ea-4c7c-b8f9-01b5028eaf88")
    public void GoToUrlAssertUrlClickExpenditureTABClickNewTABClickNewSupplierBillPositiveSelectSupplierName12()
    {
        
        pages.SupplierBillSToFRS _SupplierBillSToFRS = new pages.SupplierBillSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("7b21b860-8f6c-4e5e-8f4d-0ef9aedf75e5");
    _SupplierBillSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3d11c569-a0da-4838-a238-3d3cd071f91d");
    _SupplierBillSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5c30d940-2a3c-4ce2-9f6d-f491e71a1755");
    _SupplierBillSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("02bea7d1-9589-4278-8c66-58e376721799");
    _SupplierBillSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("fc395eef-59ac-4e0c-8092-d11ecdb61b84");
    _SupplierBillSToFRS.Click_NewSupplierBill();
    

    TestModellerLogger.SetLastNodeGuid("9ed916b8-79f8-4b59-a274-ed9c520242c8");
    _SupplierBillSToFRS.Select_SupplierName("Generic Purchase Supplier");
    

    TestModellerLogger.SetLastNodeGuid("6cbb598e-673a-45cd-9f0a-ec53cb56f09d");
    _SupplierBillSToFRS.Enter_DefaultCurrency();
    

    TestModellerLogger.SetLastNodeGuid("6516ccf8-ae24-42b1-b271-2bb390a6f8c3");
    _SupplierBillSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("12466744-0bd3-4135-9300-e044e7148e58");
    _SupplierBillSToFRS.Enter_Date("44249");
    

    TestModellerLogger.SetLastNodeGuid("7ea52093-1dd7-4979-8034-aeaef336d945");
    _SupplierBillSToFRS.Select_ExpenseType("Business entertaining");
    

    TestModellerLogger.SetLastNodeGuid("de8f87b1-ff3a-421c-9290-6ddaef339bf2");
    _SupplierBillSToFRS.Enter_Description("Ipsum neque labore et et beatae.
Odit voluptatibus quibusdam repellendus explicabo et pariatur nobis.
Itaque dolor delectus aut laboriosam molestiae odit fugiat eaque dignissimos.
Laudantium et repudiandae dolor dolorem quod dolorem sint dolore et.
Mollitia eum omnis mollitia alias alias.
Optio exercitationem non voluptatibus.
Corrupti consectetur ut id odit et inventore voluptate.
Dolorum aspernatur quia corporis et perferendis dolorum.
Esse sit odio laboriosam voluptatum.
Culpa accusantium maxime molestiae.");
    

    TestModellerLogger.SetLastNodeGuid("31e40f93-4cb6-45b2-bb91-cdd42e0f2f68");
    _SupplierBillSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("956a775c-cdf6-4d7d-949f-76ac35f8991c");
    _SupplierBillSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("5be5550e-c06b-4dbd-bcbf-748aedd3b634");
    _SupplierBillSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("1721e266-7328-4f01-8af9-62c60f672a82");
    _SupplierBillSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("86be5d84-b080-4b00-b39a-57ef6d127c84");
    _SupplierBillSToFRS.Enter_Amount("");
    

    TestModellerLogger.SetLastNodeGuid("d76e980e-6867-446d-a13a-3bbe2cc719a9");
    _SupplierBillSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("9720f223-ad75-48cf-9a78-a8a001ca0dfb");
    _SupplierBillSToFRS.Click_SaveButton();
    

    }

    @Test  (groups= {"SupplierBillSToFRS","SupplierBillSToFRS - Default Profile"})
    @TestModellerPath(guid = "418ee8f7-67f1-4a73-85d8-0bb57f178e2e")
    public void GoToUrlAssertUrlClickExpenditureTABClickNewTABClickNewSupplierBillPositiveSelectSupplierName13()
    {
        
        pages.SupplierBillSToFRS _SupplierBillSToFRS = new pages.SupplierBillSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("7b21b860-8f6c-4e5e-8f4d-0ef9aedf75e5");
    _SupplierBillSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3d11c569-a0da-4838-a238-3d3cd071f91d");
    _SupplierBillSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5c30d940-2a3c-4ce2-9f6d-f491e71a1755");
    _SupplierBillSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("02bea7d1-9589-4278-8c66-58e376721799");
    _SupplierBillSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("fc395eef-59ac-4e0c-8092-d11ecdb61b84");
    _SupplierBillSToFRS.Click_NewSupplierBill();
    

    TestModellerLogger.SetLastNodeGuid("9ed916b8-79f8-4b59-a274-ed9c520242c8");
    _SupplierBillSToFRS.Select_SupplierName("Generic Purchase Supplier");
    

    TestModellerLogger.SetLastNodeGuid("6cbb598e-673a-45cd-9f0a-ec53cb56f09d");
    _SupplierBillSToFRS.Enter_DefaultCurrency();
    

    TestModellerLogger.SetLastNodeGuid("6516ccf8-ae24-42b1-b271-2bb390a6f8c3");
    _SupplierBillSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("12466744-0bd3-4135-9300-e044e7148e58");
    _SupplierBillSToFRS.Enter_Date("44249");
    

    TestModellerLogger.SetLastNodeGuid("7ea52093-1dd7-4979-8034-aeaef336d945");
    _SupplierBillSToFRS.Select_ExpenseType("Equipment expensed");
    

    TestModellerLogger.SetLastNodeGuid("de8f87b1-ff3a-421c-9290-6ddaef339bf2");
    _SupplierBillSToFRS.Enter_Description("Cum laboriosam ratione.
Deleniti veritatis molestiae deserunt ut alias porro enim amet.
Accusamus reiciendis quis id.
Recusandae maiores sed nisi debitis.
Perspiciatis in aut consequatur nobis impedit commodi ipsam tenetur minus.
Rem quia eligendi labore rerum.
Quisquam ut cumque inventore magnam sed.
Quia exercitationem nihil ducimus asperiores sed eos.
Enim eveniet itaque nam esse officia numquam exercitationem aliquid tenetur.
Quos dolorum quas sapiente.");
    

    TestModellerLogger.SetLastNodeGuid("31e40f93-4cb6-45b2-bb91-cdd42e0f2f68");
    _SupplierBillSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("956a775c-cdf6-4d7d-949f-76ac35f8991c");
    _SupplierBillSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("5be5550e-c06b-4dbd-bcbf-748aedd3b634");
    _SupplierBillSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("1721e266-7328-4f01-8af9-62c60f672a82");
    _SupplierBillSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("86be5d84-b080-4b00-b39a-57ef6d127c84");
    _SupplierBillSToFRS.Enter_Amount("");
    

    TestModellerLogger.SetLastNodeGuid("d76e980e-6867-446d-a13a-3bbe2cc719a9");
    _SupplierBillSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("9720f223-ad75-48cf-9a78-a8a001ca0dfb");
    _SupplierBillSToFRS.Click_SaveButton();
    

    }

    @Test  (groups= {"SupplierBillSToFRS","SupplierBillSToFRS - Default Profile"})
    @TestModellerPath(guid = "20b040c4-bbf7-4ccc-a79b-c85c7f78d607")
    public void GoToUrlAssertUrlClickExpenditureTABClickNewTABClickNewSupplierBillPositiveSelectSupplierName14()
    {
        
        pages.SupplierBillSToFRS _SupplierBillSToFRS = new pages.SupplierBillSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("7b21b860-8f6c-4e5e-8f4d-0ef9aedf75e5");
    _SupplierBillSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3d11c569-a0da-4838-a238-3d3cd071f91d");
    _SupplierBillSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5c30d940-2a3c-4ce2-9f6d-f491e71a1755");
    _SupplierBillSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("02bea7d1-9589-4278-8c66-58e376721799");
    _SupplierBillSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("fc395eef-59ac-4e0c-8092-d11ecdb61b84");
    _SupplierBillSToFRS.Click_NewSupplierBill();
    

    TestModellerLogger.SetLastNodeGuid("9ed916b8-79f8-4b59-a274-ed9c520242c8");
    _SupplierBillSToFRS.Select_SupplierName("Generic Purchase Supplier");
    

    TestModellerLogger.SetLastNodeGuid("6cbb598e-673a-45cd-9f0a-ec53cb56f09d");
    _SupplierBillSToFRS.Enter_DefaultCurrency();
    

    TestModellerLogger.SetLastNodeGuid("6516ccf8-ae24-42b1-b271-2bb390a6f8c3");
    _SupplierBillSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("12466744-0bd3-4135-9300-e044e7148e58");
    _SupplierBillSToFRS.Enter_Date("44249");
    

    TestModellerLogger.SetLastNodeGuid("7ea52093-1dd7-4979-8034-aeaef336d945");
    _SupplierBillSToFRS.Select_ExpenseType("Insurance");
    

    TestModellerLogger.SetLastNodeGuid("de8f87b1-ff3a-421c-9290-6ddaef339bf2");
    _SupplierBillSToFRS.Enter_Description("Illo nostrum error illum asperiores dolor illum nostrum minima ea.
Reprehenderit quis repudiandae quia quo deserunt aliquam sed molestiae.
In modi fugiat quas illo ut aut perferendis et.
Cumque sit excepturi qui nihil omnis quia repellat sunt beatae.
Eum perferendis temporibus dolorem consequatur iusto harum in.
Commodi corporis sed sequi deleniti et qui enim earum fugiat.
Minima est esse aspernatur inventore omnis occaecati dolorum.
Ut aliquam fugit aliquid aut.
Non quae cum ab.
Rem et qui dolorum in quibusdam ex repudiandae quidem qui.");
    

    TestModellerLogger.SetLastNodeGuid("31e40f93-4cb6-45b2-bb91-cdd42e0f2f68");
    _SupplierBillSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("956a775c-cdf6-4d7d-949f-76ac35f8991c");
    _SupplierBillSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("5be5550e-c06b-4dbd-bcbf-748aedd3b634");
    _SupplierBillSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("1721e266-7328-4f01-8af9-62c60f672a82");
    _SupplierBillSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("86be5d84-b080-4b00-b39a-57ef6d127c84");
    _SupplierBillSToFRS.Enter_Amount("");
    

    TestModellerLogger.SetLastNodeGuid("d76e980e-6867-446d-a13a-3bbe2cc719a9");
    _SupplierBillSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("9720f223-ad75-48cf-9a78-a8a001ca0dfb");
    _SupplierBillSToFRS.Click_SaveButton();
    

    }

    @Test  (groups= {"SupplierBillSToFRS","SupplierBillSToFRS - Default Profile"})
    @TestModellerPath(guid = "b311cd88-9b57-43d9-b5c3-2f8749a5d0dc")
    public void GoToUrlAssertUrlClickExpenditureTABClickNewTABClickNewSupplierBillPositiveSelectSupplierName15()
    {
        
        pages.SupplierBillSToFRS _SupplierBillSToFRS = new pages.SupplierBillSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("7b21b860-8f6c-4e5e-8f4d-0ef9aedf75e5");
    _SupplierBillSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3d11c569-a0da-4838-a238-3d3cd071f91d");
    _SupplierBillSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5c30d940-2a3c-4ce2-9f6d-f491e71a1755");
    _SupplierBillSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("02bea7d1-9589-4278-8c66-58e376721799");
    _SupplierBillSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("fc395eef-59ac-4e0c-8092-d11ecdb61b84");
    _SupplierBillSToFRS.Click_NewSupplierBill();
    

    TestModellerLogger.SetLastNodeGuid("9ed916b8-79f8-4b59-a274-ed9c520242c8");
    _SupplierBillSToFRS.Select_SupplierName("Generic Purchase Supplier");
    

    TestModellerLogger.SetLastNodeGuid("6cbb598e-673a-45cd-9f0a-ec53cb56f09d");
    _SupplierBillSToFRS.Enter_DefaultCurrency();
    

    TestModellerLogger.SetLastNodeGuid("6516ccf8-ae24-42b1-b271-2bb390a6f8c3");
    _SupplierBillSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("12466744-0bd3-4135-9300-e044e7148e58");
    _SupplierBillSToFRS.Enter_Date("44249");
    

    TestModellerLogger.SetLastNodeGuid("7ea52093-1dd7-4979-8034-aeaef336d945");
    _SupplierBillSToFRS.Select_ExpenseType("Membership and subscriptions");
    

    TestModellerLogger.SetLastNodeGuid("de8f87b1-ff3a-421c-9290-6ddaef339bf2");
    _SupplierBillSToFRS.Enter_Description("Inventore aliquam commodi.
Id mollitia est assumenda tempora.
Perferendis fugit harum aut consectetur amet ipsa nostrum at nobis.
Necessitatibus molestiae et distinctio et autem cumque voluptatem.
Id voluptatibus laudantium aliquam adipisci vero.
Maxime blanditiis et ea voluptates qui asperiores blanditiis quas aspernatur.
Quia est ipsam fuga dolor eos vel.
Sit quia nihil illum.
Doloribus molestias aut enim doloremque est autem repudiandae suscipit.
Ullam quo labore quia.");
    

    TestModellerLogger.SetLastNodeGuid("31e40f93-4cb6-45b2-bb91-cdd42e0f2f68");
    _SupplierBillSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("956a775c-cdf6-4d7d-949f-76ac35f8991c");
    _SupplierBillSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("5be5550e-c06b-4dbd-bcbf-748aedd3b634");
    _SupplierBillSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("1721e266-7328-4f01-8af9-62c60f672a82");
    _SupplierBillSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("86be5d84-b080-4b00-b39a-57ef6d127c84");
    _SupplierBillSToFRS.Enter_Amount("");
    

    TestModellerLogger.SetLastNodeGuid("d76e980e-6867-446d-a13a-3bbe2cc719a9");
    _SupplierBillSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("9720f223-ad75-48cf-9a78-a8a001ca0dfb");
    _SupplierBillSToFRS.Click_SaveButton();
    

    }

    @Test  (groups= {"SupplierBillSToFRS","SupplierBillSToFRS - Default Profile"})
    @TestModellerPath(guid = "ec6230a1-dc03-46c3-a5d5-53c35f0a427e")
    public void GoToUrlAssertUrlClickExpenditureTABClickNewTABClickNewSupplierBillPositiveSelectSupplierName16()
    {
        
        pages.SupplierBillSToFRS _SupplierBillSToFRS = new pages.SupplierBillSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("7b21b860-8f6c-4e5e-8f4d-0ef9aedf75e5");
    _SupplierBillSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3d11c569-a0da-4838-a238-3d3cd071f91d");
    _SupplierBillSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5c30d940-2a3c-4ce2-9f6d-f491e71a1755");
    _SupplierBillSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("02bea7d1-9589-4278-8c66-58e376721799");
    _SupplierBillSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("fc395eef-59ac-4e0c-8092-d11ecdb61b84");
    _SupplierBillSToFRS.Click_NewSupplierBill();
    

    TestModellerLogger.SetLastNodeGuid("9ed916b8-79f8-4b59-a274-ed9c520242c8");
    _SupplierBillSToFRS.Select_SupplierName("Generic Purchase Supplier");
    

    TestModellerLogger.SetLastNodeGuid("6cbb598e-673a-45cd-9f0a-ec53cb56f09d");
    _SupplierBillSToFRS.Enter_DefaultCurrency();
    

    TestModellerLogger.SetLastNodeGuid("6516ccf8-ae24-42b1-b271-2bb390a6f8c3");
    _SupplierBillSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("12466744-0bd3-4135-9300-e044e7148e58");
    _SupplierBillSToFRS.Enter_Date("44249");
    

    TestModellerLogger.SetLastNodeGuid("7ea52093-1dd7-4979-8034-aeaef336d945");
    _SupplierBillSToFRS.Select_ExpenseType("Postage, stationery, office supplies");
    

    TestModellerLogger.SetLastNodeGuid("de8f87b1-ff3a-421c-9290-6ddaef339bf2");
    _SupplierBillSToFRS.Enter_Description("Quasi recusandae repellendus sequi qui veniam quos et.
Voluptatibus sed voluptas.
Accusantium cupiditate et eaque rerum vel consequatur ea perferendis soluta.
At quisquam animi officiis velit perferendis.
Ut vel expedita aspernatur in suscipit omnis asperiores occaecati.
At cumque voluptas eum quia et.
Consequatur suscipit quaerat velit molestiae tenetur voluptatem illo magnam ea.
Aspernatur soluta et et sunt.
Distinctio sint eius non.
Non corrupti facilis.");
    

    TestModellerLogger.SetLastNodeGuid("31e40f93-4cb6-45b2-bb91-cdd42e0f2f68");
    _SupplierBillSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("956a775c-cdf6-4d7d-949f-76ac35f8991c");
    _SupplierBillSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("5be5550e-c06b-4dbd-bcbf-748aedd3b634");
    _SupplierBillSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("1721e266-7328-4f01-8af9-62c60f672a82");
    _SupplierBillSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("86be5d84-b080-4b00-b39a-57ef6d127c84");
    _SupplierBillSToFRS.Enter_Amount("");
    

    TestModellerLogger.SetLastNodeGuid("d76e980e-6867-446d-a13a-3bbe2cc719a9");
    _SupplierBillSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("9720f223-ad75-48cf-9a78-a8a001ca0dfb");
    _SupplierBillSToFRS.Click_SaveButton();
    

    }

    @Test  (groups= {"SupplierBillSToFRS","SupplierBillSToFRS - Default Profile"})
    @TestModellerPath(guid = "3028ba2f-0746-4f97-88e1-7f38fa901403")
    public void GoToUrlAssertUrlClickExpenditureTABClickNewTABClickNewSupplierBillPositiveSelectSupplierName17()
    {
        
        pages.SupplierBillSToFRS _SupplierBillSToFRS = new pages.SupplierBillSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("7b21b860-8f6c-4e5e-8f4d-0ef9aedf75e5");
    _SupplierBillSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3d11c569-a0da-4838-a238-3d3cd071f91d");
    _SupplierBillSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5c30d940-2a3c-4ce2-9f6d-f491e71a1755");
    _SupplierBillSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("02bea7d1-9589-4278-8c66-58e376721799");
    _SupplierBillSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("fc395eef-59ac-4e0c-8092-d11ecdb61b84");
    _SupplierBillSToFRS.Click_NewSupplierBill();
    

    TestModellerLogger.SetLastNodeGuid("9ed916b8-79f8-4b59-a274-ed9c520242c8");
    _SupplierBillSToFRS.Select_SupplierName("Generic Purchase Supplier");
    

    TestModellerLogger.SetLastNodeGuid("6cbb598e-673a-45cd-9f0a-ec53cb56f09d");
    _SupplierBillSToFRS.Enter_DefaultCurrency();
    

    TestModellerLogger.SetLastNodeGuid("6516ccf8-ae24-42b1-b271-2bb390a6f8c3");
    _SupplierBillSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("12466744-0bd3-4135-9300-e044e7148e58");
    _SupplierBillSToFRS.Enter_Date("44249");
    

    TestModellerLogger.SetLastNodeGuid("7ea52093-1dd7-4979-8034-aeaef336d945");
    _SupplierBillSToFRS.Select_ExpenseType("Professional, consultancy and legal fees");
    

    TestModellerLogger.SetLastNodeGuid("de8f87b1-ff3a-421c-9290-6ddaef339bf2");
    _SupplierBillSToFRS.Enter_Description("Officiis unde ipsam aliquid mollitia.
Eius quo veritatis architecto possimus officia fugit.
Suscipit quae voluptatem reiciendis magnam saepe quo aut laborum.
Dolores ipsum consequatur veniam a est aut.
Omnis dolores vitae assumenda quod eveniet omnis assumenda aut.
Omnis dolorem suscipit id perspiciatis expedita aut aut aut omnis.
Facere blanditiis doloribus itaque.
Eius molestiae est itaque possimus autem ut voluptatibus.
Voluptatibus est error.
Magnam numquam atque perferendis officiis.");
    

    TestModellerLogger.SetLastNodeGuid("31e40f93-4cb6-45b2-bb91-cdd42e0f2f68");
    _SupplierBillSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("956a775c-cdf6-4d7d-949f-76ac35f8991c");
    _SupplierBillSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("5be5550e-c06b-4dbd-bcbf-748aedd3b634");
    _SupplierBillSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("1721e266-7328-4f01-8af9-62c60f672a82");
    _SupplierBillSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("86be5d84-b080-4b00-b39a-57ef6d127c84");
    _SupplierBillSToFRS.Enter_Amount("");
    

    TestModellerLogger.SetLastNodeGuid("d76e980e-6867-446d-a13a-3bbe2cc719a9");
    _SupplierBillSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("9720f223-ad75-48cf-9a78-a8a001ca0dfb");
    _SupplierBillSToFRS.Click_SaveButton();
    

    }

    @Test  (groups= {"SupplierBillSToFRS","SupplierBillSToFRS - Default Profile"})
    @TestModellerPath(guid = "b618b59e-1354-43ce-9350-fd7f2c016cd1")
    public void GoToUrlAssertUrlClickExpenditureTABClickNewTABClickNewSupplierBillPositiveSelectSupplierName18()
    {
        
        pages.SupplierBillSToFRS _SupplierBillSToFRS = new pages.SupplierBillSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("7b21b860-8f6c-4e5e-8f4d-0ef9aedf75e5");
    _SupplierBillSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3d11c569-a0da-4838-a238-3d3cd071f91d");
    _SupplierBillSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5c30d940-2a3c-4ce2-9f6d-f491e71a1755");
    _SupplierBillSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("02bea7d1-9589-4278-8c66-58e376721799");
    _SupplierBillSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("fc395eef-59ac-4e0c-8092-d11ecdb61b84");
    _SupplierBillSToFRS.Click_NewSupplierBill();
    

    TestModellerLogger.SetLastNodeGuid("9ed916b8-79f8-4b59-a274-ed9c520242c8");
    _SupplierBillSToFRS.Select_SupplierName("Generic Purchase Supplier");
    

    TestModellerLogger.SetLastNodeGuid("6cbb598e-673a-45cd-9f0a-ec53cb56f09d");
    _SupplierBillSToFRS.Enter_DefaultCurrency();
    

    TestModellerLogger.SetLastNodeGuid("6516ccf8-ae24-42b1-b271-2bb390a6f8c3");
    _SupplierBillSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("12466744-0bd3-4135-9300-e044e7148e58");
    _SupplierBillSToFRS.Enter_Date("44249");
    

    TestModellerLogger.SetLastNodeGuid("7ea52093-1dd7-4979-8034-aeaef336d945");
    _SupplierBillSToFRS.Select_ExpenseType("Staff welfare");
    

    TestModellerLogger.SetLastNodeGuid("de8f87b1-ff3a-421c-9290-6ddaef339bf2");
    _SupplierBillSToFRS.Enter_Description("Dignissimos enim provident fuga voluptatem.
Architecto porro aliquam sed et cum.
Fugiat aperiam soluta.
Ipsa earum non dolor ut.
Similique natus rerum voluptatem in.
Laboriosam facere id qui nam quos iusto nobis.
In ut soluta expedita perferendis ducimus ut corporis soluta.
Ad similique debitis odio quasi distinctio ratione perspiciatis.
Sapiente veritatis voluptatem vitae et repellat repudiandae dolor veritatis explicabo.
Nisi animi repellat sed totam in.");
    

    TestModellerLogger.SetLastNodeGuid("31e40f93-4cb6-45b2-bb91-cdd42e0f2f68");
    _SupplierBillSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("956a775c-cdf6-4d7d-949f-76ac35f8991c");
    _SupplierBillSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("5be5550e-c06b-4dbd-bcbf-748aedd3b634");
    _SupplierBillSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("1721e266-7328-4f01-8af9-62c60f672a82");
    _SupplierBillSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("86be5d84-b080-4b00-b39a-57ef6d127c84");
    _SupplierBillSToFRS.Enter_Amount("");
    

    TestModellerLogger.SetLastNodeGuid("d76e980e-6867-446d-a13a-3bbe2cc719a9");
    _SupplierBillSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("9720f223-ad75-48cf-9a78-a8a001ca0dfb");
    _SupplierBillSToFRS.Click_SaveButton();
    

    }

    @Test  (groups= {"SupplierBillSToFRS","SupplierBillSToFRS - Default Profile"})
    @TestModellerPath(guid = "fd5583aa-834f-4378-b8e8-9d338c220941")
    public void GoToUrlAssertUrlClickExpenditureTABClickNewTABClickNewSupplierBillPositiveSelectSupplierName19()
    {
        
        pages.SupplierBillSToFRS _SupplierBillSToFRS = new pages.SupplierBillSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("7b21b860-8f6c-4e5e-8f4d-0ef9aedf75e5");
    _SupplierBillSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3d11c569-a0da-4838-a238-3d3cd071f91d");
    _SupplierBillSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5c30d940-2a3c-4ce2-9f6d-f491e71a1755");
    _SupplierBillSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("02bea7d1-9589-4278-8c66-58e376721799");
    _SupplierBillSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("fc395eef-59ac-4e0c-8092-d11ecdb61b84");
    _SupplierBillSToFRS.Click_NewSupplierBill();
    

    TestModellerLogger.SetLastNodeGuid("9ed916b8-79f8-4b59-a274-ed9c520242c8");
    _SupplierBillSToFRS.Select_SupplierName("Generic Purchase Supplier");
    

    TestModellerLogger.SetLastNodeGuid("6cbb598e-673a-45cd-9f0a-ec53cb56f09d");
    _SupplierBillSToFRS.Enter_DefaultCurrency();
    

    TestModellerLogger.SetLastNodeGuid("6516ccf8-ae24-42b1-b271-2bb390a6f8c3");
    _SupplierBillSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("12466744-0bd3-4135-9300-e044e7148e58");
    _SupplierBillSToFRS.Enter_Date("44249");
    

    TestModellerLogger.SetLastNodeGuid("7ea52093-1dd7-4979-8034-aeaef336d945");
    _SupplierBillSToFRS.Select_ExpenseType("Sundry expenses");
    

    TestModellerLogger.SetLastNodeGuid("de8f87b1-ff3a-421c-9290-6ddaef339bf2");
    _SupplierBillSToFRS.Enter_Description("Cupiditate rerum et sit quaerat quia qui.
Voluptatem laudantium enim nam et.
Rerum excepturi quisquam id enim praesentium sit.
Aspernatur nam ipsum non magnam reprehenderit cum sunt.
Aut libero dolores dolorum expedita.
Harum aut inventore.
Velit nulla qui totam in quia.
Qui dicta ad quibusdam sequi earum nisi et repellendus labore.
Quae tenetur adipisci fuga.
Sed suscipit asperiores repellendus eveniet quis dolores.");
    

    TestModellerLogger.SetLastNodeGuid("31e40f93-4cb6-45b2-bb91-cdd42e0f2f68");
    _SupplierBillSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("956a775c-cdf6-4d7d-949f-76ac35f8991c");
    _SupplierBillSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("5be5550e-c06b-4dbd-bcbf-748aedd3b634");
    _SupplierBillSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("1721e266-7328-4f01-8af9-62c60f672a82");
    _SupplierBillSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("86be5d84-b080-4b00-b39a-57ef6d127c84");
    _SupplierBillSToFRS.Enter_Amount("");
    

    TestModellerLogger.SetLastNodeGuid("d76e980e-6867-446d-a13a-3bbe2cc719a9");
    _SupplierBillSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("9720f223-ad75-48cf-9a78-a8a001ca0dfb");
    _SupplierBillSToFRS.Click_SaveButton();
    

    }

    @Test  (groups= {"SupplierBillSToFRS","SupplierBillSToFRS - Default Profile"})
    @TestModellerPath(guid = "164f7aeb-6633-4f4a-bb2d-d2623804a1eb")
    public void GoToUrlAssertUrlClickExpenditureTABClickNewTABClickNewSupplierBillPositiveSelectSupplierName20()
    {
        
        pages.SupplierBillSToFRS _SupplierBillSToFRS = new pages.SupplierBillSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("7b21b860-8f6c-4e5e-8f4d-0ef9aedf75e5");
    _SupplierBillSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3d11c569-a0da-4838-a238-3d3cd071f91d");
    _SupplierBillSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5c30d940-2a3c-4ce2-9f6d-f491e71a1755");
    _SupplierBillSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("02bea7d1-9589-4278-8c66-58e376721799");
    _SupplierBillSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("fc395eef-59ac-4e0c-8092-d11ecdb61b84");
    _SupplierBillSToFRS.Click_NewSupplierBill();
    

    TestModellerLogger.SetLastNodeGuid("9ed916b8-79f8-4b59-a274-ed9c520242c8");
    _SupplierBillSToFRS.Select_SupplierName("Generic Purchase Supplier");
    

    TestModellerLogger.SetLastNodeGuid("6cbb598e-673a-45cd-9f0a-ec53cb56f09d");
    _SupplierBillSToFRS.Enter_DefaultCurrency();
    

    TestModellerLogger.SetLastNodeGuid("6516ccf8-ae24-42b1-b271-2bb390a6f8c3");
    _SupplierBillSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("12466744-0bd3-4135-9300-e044e7148e58");
    _SupplierBillSToFRS.Enter_Date("44249");
    

    TestModellerLogger.SetLastNodeGuid("7ea52093-1dd7-4979-8034-aeaef336d945");
    _SupplierBillSToFRS.Select_ExpenseType("Telephone, internet and broadband");
    

    TestModellerLogger.SetLastNodeGuid("de8f87b1-ff3a-421c-9290-6ddaef339bf2");
    _SupplierBillSToFRS.Enter_Description("Non magnam sapiente.
Illum est adipisci est aperiam nisi asperiores officia ullam perspiciatis.
Qui autem possimus accusamus omnis voluptatum possimus odit ullam.
Voluptatem sit dolores ea reprehenderit perferendis odit.
Sit accusamus ut reiciendis ea quae eos.
Eum perferendis laborum.
Aperiam minima in sint.
Asperiores eos esse porro et.
Ratione nam velit omnis.
Veritatis quis facilis sit rerum.");
    

    TestModellerLogger.SetLastNodeGuid("31e40f93-4cb6-45b2-bb91-cdd42e0f2f68");
    _SupplierBillSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("956a775c-cdf6-4d7d-949f-76ac35f8991c");
    _SupplierBillSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("5be5550e-c06b-4dbd-bcbf-748aedd3b634");
    _SupplierBillSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("1721e266-7328-4f01-8af9-62c60f672a82");
    _SupplierBillSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("86be5d84-b080-4b00-b39a-57ef6d127c84");
    _SupplierBillSToFRS.Enter_Amount("");
    

    TestModellerLogger.SetLastNodeGuid("d76e980e-6867-446d-a13a-3bbe2cc719a9");
    _SupplierBillSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("9720f223-ad75-48cf-9a78-a8a001ca0dfb");
    _SupplierBillSToFRS.Click_SaveButton();
    

    }

    @Test  (groups= {"SupplierBillSToFRS","SupplierBillSToFRS - Default Profile"})
    @TestModellerPath(guid = "ede3bd42-526a-454b-8d38-55b0836eff23")
    public void GoToUrlAssertUrlClickExpenditureTABClickNewTABClickNewSupplierBillPositiveSelectSupplierName21()
    {
        
        pages.SupplierBillSToFRS _SupplierBillSToFRS = new pages.SupplierBillSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("7b21b860-8f6c-4e5e-8f4d-0ef9aedf75e5");
    _SupplierBillSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3d11c569-a0da-4838-a238-3d3cd071f91d");
    _SupplierBillSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5c30d940-2a3c-4ce2-9f6d-f491e71a1755");
    _SupplierBillSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("02bea7d1-9589-4278-8c66-58e376721799");
    _SupplierBillSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("fc395eef-59ac-4e0c-8092-d11ecdb61b84");
    _SupplierBillSToFRS.Click_NewSupplierBill();
    

    TestModellerLogger.SetLastNodeGuid("9ed916b8-79f8-4b59-a274-ed9c520242c8");
    _SupplierBillSToFRS.Select_SupplierName("Generic Purchase Supplier");
    

    TestModellerLogger.SetLastNodeGuid("6cbb598e-673a-45cd-9f0a-ec53cb56f09d");
    _SupplierBillSToFRS.Enter_DefaultCurrency();
    

    TestModellerLogger.SetLastNodeGuid("6516ccf8-ae24-42b1-b271-2bb390a6f8c3");
    _SupplierBillSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("12466744-0bd3-4135-9300-e044e7148e58");
    _SupplierBillSToFRS.Enter_Date("44249");
    

    TestModellerLogger.SetLastNodeGuid("7ea52093-1dd7-4979-8034-aeaef336d945");
    _SupplierBillSToFRS.Select_ExpenseType("Travel and overseas travelling");
    

    TestModellerLogger.SetLastNodeGuid("de8f87b1-ff3a-421c-9290-6ddaef339bf2");
    _SupplierBillSToFRS.Enter_Description("Fugit cum sint.
Et impedit minus id sunt maxime quos aspernatur.
Maiores possimus et dolores qui officiis est.
Similique optio possimus ipsam hic dolores qui reiciendis perferendis.
Veniam ipsam aperiam dolorem ut.
Occaecati natus molestiae nobis voluptatibus cupiditate molestiae.
Error officiis error natus ducimus ut dolore blanditiis.
Magni unde reiciendis neque.
Atque numquam repudiandae omnis beatae autem.
Repellendus quas qui vero.");
    

    TestModellerLogger.SetLastNodeGuid("31e40f93-4cb6-45b2-bb91-cdd42e0f2f68");
    _SupplierBillSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("956a775c-cdf6-4d7d-949f-76ac35f8991c");
    _SupplierBillSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("5be5550e-c06b-4dbd-bcbf-748aedd3b634");
    _SupplierBillSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("1721e266-7328-4f01-8af9-62c60f672a82");
    _SupplierBillSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("86be5d84-b080-4b00-b39a-57ef6d127c84");
    _SupplierBillSToFRS.Enter_Amount("");
    

    TestModellerLogger.SetLastNodeGuid("d76e980e-6867-446d-a13a-3bbe2cc719a9");
    _SupplierBillSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("9720f223-ad75-48cf-9a78-a8a001ca0dfb");
    _SupplierBillSToFRS.Click_SaveButton();
    

    }

    @Test  (groups= {"SupplierBillSToFRS","SupplierBillSToFRS - Default Profile"})
    @TestModellerPath(guid = "fc0ed322-6f76-4847-9ea3-19d3f720efe7")
    public void GoToUrlAssertUrlClickExpenditureTABClickNewTABClickNewSupplierBillPositiveSelectSupplierName22()
    {
        
        pages.SupplierBillSToFRS _SupplierBillSToFRS = new pages.SupplierBillSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("7b21b860-8f6c-4e5e-8f4d-0ef9aedf75e5");
    _SupplierBillSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3d11c569-a0da-4838-a238-3d3cd071f91d");
    _SupplierBillSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5c30d940-2a3c-4ce2-9f6d-f491e71a1755");
    _SupplierBillSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("02bea7d1-9589-4278-8c66-58e376721799");
    _SupplierBillSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("fc395eef-59ac-4e0c-8092-d11ecdb61b84");
    _SupplierBillSToFRS.Click_NewSupplierBill();
    

    TestModellerLogger.SetLastNodeGuid("9ed916b8-79f8-4b59-a274-ed9c520242c8");
    _SupplierBillSToFRS.Select_SupplierName("Generic Purchase Supplier");
    

    TestModellerLogger.SetLastNodeGuid("6cbb598e-673a-45cd-9f0a-ec53cb56f09d");
    _SupplierBillSToFRS.Enter_DefaultCurrency();
    

    TestModellerLogger.SetLastNodeGuid("6516ccf8-ae24-42b1-b271-2bb390a6f8c3");
    _SupplierBillSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("12466744-0bd3-4135-9300-e044e7148e58");
    _SupplierBillSToFRS.Enter_Date("44249");
    

    TestModellerLogger.SetLastNodeGuid("7ea52093-1dd7-4979-8034-aeaef336d945");
    _SupplierBillSToFRS.Select_ExpenseType("Commercial vehicles additions");
    

    TestModellerLogger.SetLastNodeGuid("de8f87b1-ff3a-421c-9290-6ddaef339bf2");
    _SupplierBillSToFRS.Enter_Description("Et fugiat ducimus.
Necessitatibus ipsa enim.
Facere architecto non.
Non omnis sed dolorem fugit.
Et et iusto dicta beatae numquam est modi ducimus ab.
Dolor quis maxime nihil molestiae dolorum.
Aut adipisci labore quas nihil inventore.
Voluptate veniam est incidunt corporis aliquam iure libero.
Sed recusandae culpa provident possimus incidunt incidunt.
Deserunt modi distinctio aut cumque amet iste aspernatur.");
    

    TestModellerLogger.SetLastNodeGuid("31e40f93-4cb6-45b2-bb91-cdd42e0f2f68");
    _SupplierBillSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("956a775c-cdf6-4d7d-949f-76ac35f8991c");
    _SupplierBillSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("5be5550e-c06b-4dbd-bcbf-748aedd3b634");
    _SupplierBillSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("1721e266-7328-4f01-8af9-62c60f672a82");
    _SupplierBillSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("86be5d84-b080-4b00-b39a-57ef6d127c84");
    _SupplierBillSToFRS.Enter_Amount("");
    

    TestModellerLogger.SetLastNodeGuid("d76e980e-6867-446d-a13a-3bbe2cc719a9");
    _SupplierBillSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("9720f223-ad75-48cf-9a78-a8a001ca0dfb");
    _SupplierBillSToFRS.Click_SaveButton();
    

    }

    @Test  (groups= {"SupplierBillSToFRS","SupplierBillSToFRS - Default Profile"})
    @TestModellerPath(guid = "a1acdf84-85c4-4332-8eb1-419a3962e9f0")
    public void GoToUrlAssertUrlClickExpenditureTABClickNewTABClickNewSupplierBillPositiveSelectSupplierName23()
    {
        
        pages.SupplierBillSToFRS _SupplierBillSToFRS = new pages.SupplierBillSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("7b21b860-8f6c-4e5e-8f4d-0ef9aedf75e5");
    _SupplierBillSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3d11c569-a0da-4838-a238-3d3cd071f91d");
    _SupplierBillSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5c30d940-2a3c-4ce2-9f6d-f491e71a1755");
    _SupplierBillSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("02bea7d1-9589-4278-8c66-58e376721799");
    _SupplierBillSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("fc395eef-59ac-4e0c-8092-d11ecdb61b84");
    _SupplierBillSToFRS.Click_NewSupplierBill();
    

    TestModellerLogger.SetLastNodeGuid("9ed916b8-79f8-4b59-a274-ed9c520242c8");
    _SupplierBillSToFRS.Select_SupplierName("Generic Purchase Supplier");
    

    TestModellerLogger.SetLastNodeGuid("6cbb598e-673a-45cd-9f0a-ec53cb56f09d");
    _SupplierBillSToFRS.Enter_DefaultCurrency();
    

    TestModellerLogger.SetLastNodeGuid("6516ccf8-ae24-42b1-b271-2bb390a6f8c3");
    _SupplierBillSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("12466744-0bd3-4135-9300-e044e7148e58");
    _SupplierBillSToFRS.Enter_Date("44249");
    

    TestModellerLogger.SetLastNodeGuid("7ea52093-1dd7-4979-8034-aeaef336d945");
    _SupplierBillSToFRS.Select_ExpenseType("Commercial vehicles cost b/f");
    

    TestModellerLogger.SetLastNodeGuid("de8f87b1-ff3a-421c-9290-6ddaef339bf2");
    _SupplierBillSToFRS.Enter_Description("Nihil illum et nam.
Numquam vel voluptate.
Recusandae quia doloribus ratione autem illo aut est.
Assumenda pariatur sunt expedita dolor sapiente sunt.
Atque qui impedit nihil explicabo explicabo magni ratione omnis similique.
Recusandae dicta porro sed consequuntur dicta exercitationem aut.
Ducimus et est eos non rerum repellendus magnam.
Ab eaque sapiente.
Sed minus voluptatibus.
Delectus quo doloremque eos alias et atque commodi.");
    

    TestModellerLogger.SetLastNodeGuid("31e40f93-4cb6-45b2-bb91-cdd42e0f2f68");
    _SupplierBillSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("956a775c-cdf6-4d7d-949f-76ac35f8991c");
    _SupplierBillSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("5be5550e-c06b-4dbd-bcbf-748aedd3b634");
    _SupplierBillSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("1721e266-7328-4f01-8af9-62c60f672a82");
    _SupplierBillSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("86be5d84-b080-4b00-b39a-57ef6d127c84");
    _SupplierBillSToFRS.Enter_Amount("");
    

    TestModellerLogger.SetLastNodeGuid("d76e980e-6867-446d-a13a-3bbe2cc719a9");
    _SupplierBillSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("9720f223-ad75-48cf-9a78-a8a001ca0dfb");
    _SupplierBillSToFRS.Click_SaveButton();
    

    }

    @Test  (groups= {"SupplierBillSToFRS","SupplierBillSToFRS - Default Profile"})
    @TestModellerPath(guid = "e92b1852-c745-4518-9e5f-294249e19a9f")
    public void GoToUrlAssertUrlClickExpenditureTABClickNewTABClickNewSupplierBillPositiveSelectSupplierName24()
    {
        
        pages.SupplierBillSToFRS _SupplierBillSToFRS = new pages.SupplierBillSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("7b21b860-8f6c-4e5e-8f4d-0ef9aedf75e5");
    _SupplierBillSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3d11c569-a0da-4838-a238-3d3cd071f91d");
    _SupplierBillSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5c30d940-2a3c-4ce2-9f6d-f491e71a1755");
    _SupplierBillSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("02bea7d1-9589-4278-8c66-58e376721799");
    _SupplierBillSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("fc395eef-59ac-4e0c-8092-d11ecdb61b84");
    _SupplierBillSToFRS.Click_NewSupplierBill();
    

    TestModellerLogger.SetLastNodeGuid("9ed916b8-79f8-4b59-a274-ed9c520242c8");
    _SupplierBillSToFRS.Select_SupplierName("Generic Purchase Supplier");
    

    TestModellerLogger.SetLastNodeGuid("6cbb598e-673a-45cd-9f0a-ec53cb56f09d");
    _SupplierBillSToFRS.Enter_DefaultCurrency();
    

    TestModellerLogger.SetLastNodeGuid("6516ccf8-ae24-42b1-b271-2bb390a6f8c3");
    _SupplierBillSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("12466744-0bd3-4135-9300-e044e7148e58");
    _SupplierBillSToFRS.Enter_Date("44249");
    

    TestModellerLogger.SetLastNodeGuid("7ea52093-1dd7-4979-8034-aeaef336d945");
    _SupplierBillSToFRS.Select_ExpenseType("Commercial vehicles depreciation");
    

    TestModellerLogger.SetLastNodeGuid("de8f87b1-ff3a-421c-9290-6ddaef339bf2");
    _SupplierBillSToFRS.Enter_Description("Blanditiis ab facilis delectus sunt atque pariatur saepe laudantium.
Temporibus nulla omnis.
Nemo debitis beatae et provident repellendus.
Rerum maiores modi nihil quia praesentium vitae illum ducimus.
Quia et sunt amet.
Est aut voluptatum omnis aut velit quod cum.
At amet eum quisquam.
Et quod hic culpa asperiores sunt et nihil ut ducimus.
Assumenda beatae sit.
Libero nisi nobis enim sunt enim reiciendis accusantium reiciendis.");
    

    TestModellerLogger.SetLastNodeGuid("31e40f93-4cb6-45b2-bb91-cdd42e0f2f68");
    _SupplierBillSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("956a775c-cdf6-4d7d-949f-76ac35f8991c");
    _SupplierBillSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("5be5550e-c06b-4dbd-bcbf-748aedd3b634");
    _SupplierBillSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("1721e266-7328-4f01-8af9-62c60f672a82");
    _SupplierBillSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("86be5d84-b080-4b00-b39a-57ef6d127c84");
    _SupplierBillSToFRS.Enter_Amount("");
    

    TestModellerLogger.SetLastNodeGuid("d76e980e-6867-446d-a13a-3bbe2cc719a9");
    _SupplierBillSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("9720f223-ad75-48cf-9a78-a8a001ca0dfb");
    _SupplierBillSToFRS.Click_SaveButton();
    

    }

    @Test  (groups= {"SupplierBillSToFRS","SupplierBillSToFRS - Default Profile"})
    @TestModellerPath(guid = "3efa73a1-953e-41de-acf3-2f726ae93fe7")
    public void GoToUrlAssertUrlClickExpenditureTABClickNewTABClickNewSupplierBillPositiveSelectSupplierName25()
    {
        
        pages.SupplierBillSToFRS _SupplierBillSToFRS = new pages.SupplierBillSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("7b21b860-8f6c-4e5e-8f4d-0ef9aedf75e5");
    _SupplierBillSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3d11c569-a0da-4838-a238-3d3cd071f91d");
    _SupplierBillSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5c30d940-2a3c-4ce2-9f6d-f491e71a1755");
    _SupplierBillSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("02bea7d1-9589-4278-8c66-58e376721799");
    _SupplierBillSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("fc395eef-59ac-4e0c-8092-d11ecdb61b84");
    _SupplierBillSToFRS.Click_NewSupplierBill();
    

    TestModellerLogger.SetLastNodeGuid("9ed916b8-79f8-4b59-a274-ed9c520242c8");
    _SupplierBillSToFRS.Select_SupplierName("Generic Purchase Supplier");
    

    TestModellerLogger.SetLastNodeGuid("6cbb598e-673a-45cd-9f0a-ec53cb56f09d");
    _SupplierBillSToFRS.Enter_DefaultCurrency();
    

    TestModellerLogger.SetLastNodeGuid("6516ccf8-ae24-42b1-b271-2bb390a6f8c3");
    _SupplierBillSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("12466744-0bd3-4135-9300-e044e7148e58");
    _SupplierBillSToFRS.Enter_Date("44249");
    

    TestModellerLogger.SetLastNodeGuid("7ea52093-1dd7-4979-8034-aeaef336d945");
    _SupplierBillSToFRS.Select_ExpenseType("Commercial vehicles depreciation b/f");
    

    TestModellerLogger.SetLastNodeGuid("de8f87b1-ff3a-421c-9290-6ddaef339bf2");
    _SupplierBillSToFRS.Enter_Description("Est ratione enim aperiam sunt recusandae beatae ea.
Cupiditate ducimus ipsum et aspernatur laborum tempore amet error.
Provident laboriosam sed.
Consequatur occaecati molestias quas aut voluptatem quo rerum.
Ut ut nisi molestiae facere iure delectus sint.
Velit et quos quam et nihil qui expedita eveniet dicta.
Repellat ducimus suscipit non nihil et.
Veritatis et delectus quia sed in qui.
Sit facere amet sint.
Mollitia excepturi qui non officiis tempora reprehenderit voluptatem dicta.");
    

    TestModellerLogger.SetLastNodeGuid("31e40f93-4cb6-45b2-bb91-cdd42e0f2f68");
    _SupplierBillSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("956a775c-cdf6-4d7d-949f-76ac35f8991c");
    _SupplierBillSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("5be5550e-c06b-4dbd-bcbf-748aedd3b634");
    _SupplierBillSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("1721e266-7328-4f01-8af9-62c60f672a82");
    _SupplierBillSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("86be5d84-b080-4b00-b39a-57ef6d127c84");
    _SupplierBillSToFRS.Enter_Amount("");
    

    TestModellerLogger.SetLastNodeGuid("d76e980e-6867-446d-a13a-3bbe2cc719a9");
    _SupplierBillSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("9720f223-ad75-48cf-9a78-a8a001ca0dfb");
    _SupplierBillSToFRS.Click_SaveButton();
    

    }

    @Test  (groups= {"SupplierBillSToFRS","SupplierBillSToFRS - Default Profile"})
    @TestModellerPath(guid = "c5cc36b6-fe4e-479b-adae-df4d3cfb01f0")
    public void GoToUrlAssertUrlClickExpenditureTABClickNewTABClickNewSupplierBillPositiveSelectSupplierName26()
    {
        
        pages.SupplierBillSToFRS _SupplierBillSToFRS = new pages.SupplierBillSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("7b21b860-8f6c-4e5e-8f4d-0ef9aedf75e5");
    _SupplierBillSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3d11c569-a0da-4838-a238-3d3cd071f91d");
    _SupplierBillSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5c30d940-2a3c-4ce2-9f6d-f491e71a1755");
    _SupplierBillSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("02bea7d1-9589-4278-8c66-58e376721799");
    _SupplierBillSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("fc395eef-59ac-4e0c-8092-d11ecdb61b84");
    _SupplierBillSToFRS.Click_NewSupplierBill();
    

    TestModellerLogger.SetLastNodeGuid("9ed916b8-79f8-4b59-a274-ed9c520242c8");
    _SupplierBillSToFRS.Select_SupplierName("Generic Purchase Supplier");
    

    TestModellerLogger.SetLastNodeGuid("6cbb598e-673a-45cd-9f0a-ec53cb56f09d");
    _SupplierBillSToFRS.Enter_DefaultCurrency();
    

    TestModellerLogger.SetLastNodeGuid("6516ccf8-ae24-42b1-b271-2bb390a6f8c3");
    _SupplierBillSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("12466744-0bd3-4135-9300-e044e7148e58");
    _SupplierBillSToFRS.Enter_Date("44249");
    

    TestModellerLogger.SetLastNodeGuid("7ea52093-1dd7-4979-8034-aeaef336d945");
    _SupplierBillSToFRS.Select_ExpenseType("Commercial vehicles depreciation disposals");
    

    TestModellerLogger.SetLastNodeGuid("de8f87b1-ff3a-421c-9290-6ddaef339bf2");
    _SupplierBillSToFRS.Enter_Description("Blanditiis magnam et provident quisquam cupiditate similique illum alias aliquam.
Et vitae voluptatibus quia consequuntur sint est ullam voluptate.
Totam voluptatibus quis illum atque et voluptate et adipisci.
Quos reiciendis excepturi.
Tenetur quos quae aut cum qui itaque.
Distinctio molestiae est molestiae.
Quisquam placeat enim cumque quisquam soluta sunt.
Enim laboriosam quo ut expedita nesciunt neque consequatur ratione vel.
Sunt rem magnam harum accusamus cum dolorum a saepe quis.
Commodi magni illo voluptatem nobis.");
    

    TestModellerLogger.SetLastNodeGuid("31e40f93-4cb6-45b2-bb91-cdd42e0f2f68");
    _SupplierBillSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("956a775c-cdf6-4d7d-949f-76ac35f8991c");
    _SupplierBillSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("5be5550e-c06b-4dbd-bcbf-748aedd3b634");
    _SupplierBillSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("1721e266-7328-4f01-8af9-62c60f672a82");
    _SupplierBillSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("86be5d84-b080-4b00-b39a-57ef6d127c84");
    _SupplierBillSToFRS.Enter_Amount("");
    

    TestModellerLogger.SetLastNodeGuid("d76e980e-6867-446d-a13a-3bbe2cc719a9");
    _SupplierBillSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("9720f223-ad75-48cf-9a78-a8a001ca0dfb");
    _SupplierBillSToFRS.Click_SaveButton();
    

    }

    @Test  (groups= {"SupplierBillSToFRS","SupplierBillSToFRS - Default Profile"})
    @TestModellerPath(guid = "3b045e48-df7a-4265-84e0-4e1c86ee38f2")
    public void GoToUrlAssertUrlClickExpenditureTABClickNewTABClickNewSupplierBillPositiveSelectSupplierName27()
    {
        
        pages.SupplierBillSToFRS _SupplierBillSToFRS = new pages.SupplierBillSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("7b21b860-8f6c-4e5e-8f4d-0ef9aedf75e5");
    _SupplierBillSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3d11c569-a0da-4838-a238-3d3cd071f91d");
    _SupplierBillSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5c30d940-2a3c-4ce2-9f6d-f491e71a1755");
    _SupplierBillSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("02bea7d1-9589-4278-8c66-58e376721799");
    _SupplierBillSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("fc395eef-59ac-4e0c-8092-d11ecdb61b84");
    _SupplierBillSToFRS.Click_NewSupplierBill();
    

    TestModellerLogger.SetLastNodeGuid("9ed916b8-79f8-4b59-a274-ed9c520242c8");
    _SupplierBillSToFRS.Select_SupplierName("Generic Purchase Supplier");
    

    TestModellerLogger.SetLastNodeGuid("6cbb598e-673a-45cd-9f0a-ec53cb56f09d");
    _SupplierBillSToFRS.Enter_DefaultCurrency();
    

    TestModellerLogger.SetLastNodeGuid("6516ccf8-ae24-42b1-b271-2bb390a6f8c3");
    _SupplierBillSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("12466744-0bd3-4135-9300-e044e7148e58");
    _SupplierBillSToFRS.Enter_Date("44249");
    

    TestModellerLogger.SetLastNodeGuid("7ea52093-1dd7-4979-8034-aeaef336d945");
    _SupplierBillSToFRS.Select_ExpenseType("Commercial vehicles depreciation revaluation");
    

    TestModellerLogger.SetLastNodeGuid("de8f87b1-ff3a-421c-9290-6ddaef339bf2");
    _SupplierBillSToFRS.Enter_Description("Aut voluptate assumenda ullam nihil occaecati nobis sequi sit omnis.
Nostrum omnis autem.
Perspiciatis omnis vero consequuntur rem sed dignissimos.
Aut quisquam adipisci.
Hic aut qui dolor reprehenderit voluptatum quaerat non.
Laborum harum voluptatem tenetur similique voluptatum sed ut.
Nam sed repudiandae aut qui quis velit.
Numquam repellendus odio iure.
In tempora qui id sit placeat mollitia et.
Sint dignissimos omnis recusandae consequuntur impedit quia et rerum.");
    

    TestModellerLogger.SetLastNodeGuid("31e40f93-4cb6-45b2-bb91-cdd42e0f2f68");
    _SupplierBillSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("956a775c-cdf6-4d7d-949f-76ac35f8991c");
    _SupplierBillSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("5be5550e-c06b-4dbd-bcbf-748aedd3b634");
    _SupplierBillSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("1721e266-7328-4f01-8af9-62c60f672a82");
    _SupplierBillSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("86be5d84-b080-4b00-b39a-57ef6d127c84");
    _SupplierBillSToFRS.Enter_Amount("");
    

    TestModellerLogger.SetLastNodeGuid("d76e980e-6867-446d-a13a-3bbe2cc719a9");
    _SupplierBillSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("9720f223-ad75-48cf-9a78-a8a001ca0dfb");
    _SupplierBillSToFRS.Click_SaveButton();
    

    }

    @Test  (groups= {"SupplierBillSToFRS","SupplierBillSToFRS - Default Profile"})
    @TestModellerPath(guid = "aab5d296-4a13-4fda-b40f-da26b6dbfdb2")
    public void GoToUrlAssertUrlClickExpenditureTABClickNewTABClickNewSupplierBillPositiveSelectSupplierName28()
    {
        
        pages.SupplierBillSToFRS _SupplierBillSToFRS = new pages.SupplierBillSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("7b21b860-8f6c-4e5e-8f4d-0ef9aedf75e5");
    _SupplierBillSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3d11c569-a0da-4838-a238-3d3cd071f91d");
    _SupplierBillSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5c30d940-2a3c-4ce2-9f6d-f491e71a1755");
    _SupplierBillSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("02bea7d1-9589-4278-8c66-58e376721799");
    _SupplierBillSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("fc395eef-59ac-4e0c-8092-d11ecdb61b84");
    _SupplierBillSToFRS.Click_NewSupplierBill();
    

    TestModellerLogger.SetLastNodeGuid("9ed916b8-79f8-4b59-a274-ed9c520242c8");
    _SupplierBillSToFRS.Select_SupplierName("Generic Purchase Supplier");
    

    TestModellerLogger.SetLastNodeGuid("6cbb598e-673a-45cd-9f0a-ec53cb56f09d");
    _SupplierBillSToFRS.Enter_DefaultCurrency();
    

    TestModellerLogger.SetLastNodeGuid("6516ccf8-ae24-42b1-b271-2bb390a6f8c3");
    _SupplierBillSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("12466744-0bd3-4135-9300-e044e7148e58");
    _SupplierBillSToFRS.Enter_Date("44249");
    

    TestModellerLogger.SetLastNodeGuid("7ea52093-1dd7-4979-8034-aeaef336d945");
    _SupplierBillSToFRS.Select_ExpenseType("Commercial vehicles depreciation transfers");
    

    TestModellerLogger.SetLastNodeGuid("de8f87b1-ff3a-421c-9290-6ddaef339bf2");
    _SupplierBillSToFRS.Enter_Description("Sed et inventore beatae temporibus qui sequi numquam voluptatibus aliquam.
Rem corrupti aliquid earum inventore.
Magni fugiat exercitationem temporibus corporis aut pariatur animi totam doloremque.
Et quos sapiente enim ratione sed ut ipsum sint voluptatem.
Deserunt doloremque provident.
Autem iste quae a nihil doloribus quasi.
Quae architecto nisi fugit vel non quia deleniti quia.
Voluptatem ut quos.
Hic voluptas tenetur dicta est.
Est aspernatur labore ut aliquam est mollitia.");
    

    TestModellerLogger.SetLastNodeGuid("31e40f93-4cb6-45b2-bb91-cdd42e0f2f68");
    _SupplierBillSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("956a775c-cdf6-4d7d-949f-76ac35f8991c");
    _SupplierBillSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("5be5550e-c06b-4dbd-bcbf-748aedd3b634");
    _SupplierBillSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("1721e266-7328-4f01-8af9-62c60f672a82");
    _SupplierBillSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("86be5d84-b080-4b00-b39a-57ef6d127c84");
    _SupplierBillSToFRS.Enter_Amount("");
    

    TestModellerLogger.SetLastNodeGuid("d76e980e-6867-446d-a13a-3bbe2cc719a9");
    _SupplierBillSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("9720f223-ad75-48cf-9a78-a8a001ca0dfb");
    _SupplierBillSToFRS.Click_SaveButton();
    

    }

    @Test  (groups= {"SupplierBillSToFRS","SupplierBillSToFRS - Default Profile"})
    @TestModellerPath(guid = "000f3bc3-b8e5-47a4-9087-02214868b920")
    public void GoToUrlAssertUrlClickExpenditureTABClickNewTABClickNewSupplierBillPositiveSelectSupplierName29()
    {
        
        pages.SupplierBillSToFRS _SupplierBillSToFRS = new pages.SupplierBillSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("7b21b860-8f6c-4e5e-8f4d-0ef9aedf75e5");
    _SupplierBillSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3d11c569-a0da-4838-a238-3d3cd071f91d");
    _SupplierBillSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5c30d940-2a3c-4ce2-9f6d-f491e71a1755");
    _SupplierBillSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("02bea7d1-9589-4278-8c66-58e376721799");
    _SupplierBillSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("fc395eef-59ac-4e0c-8092-d11ecdb61b84");
    _SupplierBillSToFRS.Click_NewSupplierBill();
    

    TestModellerLogger.SetLastNodeGuid("9ed916b8-79f8-4b59-a274-ed9c520242c8");
    _SupplierBillSToFRS.Select_SupplierName("Generic Purchase Supplier");
    

    TestModellerLogger.SetLastNodeGuid("6cbb598e-673a-45cd-9f0a-ec53cb56f09d");
    _SupplierBillSToFRS.Enter_DefaultCurrency();
    

    TestModellerLogger.SetLastNodeGuid("6516ccf8-ae24-42b1-b271-2bb390a6f8c3");
    _SupplierBillSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("12466744-0bd3-4135-9300-e044e7148e58");
    _SupplierBillSToFRS.Enter_Date("44249");
    

    TestModellerLogger.SetLastNodeGuid("7ea52093-1dd7-4979-8034-aeaef336d945");
    _SupplierBillSToFRS.Select_ExpenseType("Commercial vehicles disposals");
    

    TestModellerLogger.SetLastNodeGuid("de8f87b1-ff3a-421c-9290-6ddaef339bf2");
    _SupplierBillSToFRS.Enter_Description("Omnis molestias id eveniet quia.
Sint labore et quam qui rerum enim tempore.
Deleniti voluptas error consequuntur vitae id quisquam alias.
Eius provident perferendis rerum fugiat.
Vero consequuntur non.
Molestiae vel molestias consequatur quibusdam repellendus autem quo cupiditate provident.
Magni tempora aut iure possimus quas eligendi error.
Est fugiat quas enim cum facilis est.
Ea quisquam natus quia quo qui maxime saepe aut qui.
Laboriosam nihil necessitatibus adipisci totam cumque sunt corporis repudiandae.");
    

    TestModellerLogger.SetLastNodeGuid("31e40f93-4cb6-45b2-bb91-cdd42e0f2f68");
    _SupplierBillSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("956a775c-cdf6-4d7d-949f-76ac35f8991c");
    _SupplierBillSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("5be5550e-c06b-4dbd-bcbf-748aedd3b634");
    _SupplierBillSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("1721e266-7328-4f01-8af9-62c60f672a82");
    _SupplierBillSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("86be5d84-b080-4b00-b39a-57ef6d127c84");
    _SupplierBillSToFRS.Enter_Amount("");
    

    TestModellerLogger.SetLastNodeGuid("d76e980e-6867-446d-a13a-3bbe2cc719a9");
    _SupplierBillSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("9720f223-ad75-48cf-9a78-a8a001ca0dfb");
    _SupplierBillSToFRS.Click_SaveButton();
    

    }

    @Test  (groups= {"SupplierBillSToFRS","SupplierBillSToFRS - Default Profile"})
    @TestModellerPath(guid = "a6c1b2ad-cae3-48a1-8f14-efe306515db4")
    public void GoToUrlAssertUrlClickExpenditureTABClickNewTABClickNewSupplierBillPositiveSelectSupplierName30()
    {
        
        pages.SupplierBillSToFRS _SupplierBillSToFRS = new pages.SupplierBillSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("7b21b860-8f6c-4e5e-8f4d-0ef9aedf75e5");
    _SupplierBillSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3d11c569-a0da-4838-a238-3d3cd071f91d");
    _SupplierBillSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5c30d940-2a3c-4ce2-9f6d-f491e71a1755");
    _SupplierBillSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("02bea7d1-9589-4278-8c66-58e376721799");
    _SupplierBillSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("fc395eef-59ac-4e0c-8092-d11ecdb61b84");
    _SupplierBillSToFRS.Click_NewSupplierBill();
    

    TestModellerLogger.SetLastNodeGuid("9ed916b8-79f8-4b59-a274-ed9c520242c8");
    _SupplierBillSToFRS.Select_SupplierName("Generic Purchase Supplier");
    

    TestModellerLogger.SetLastNodeGuid("6cbb598e-673a-45cd-9f0a-ec53cb56f09d");
    _SupplierBillSToFRS.Enter_DefaultCurrency();
    

    TestModellerLogger.SetLastNodeGuid("6516ccf8-ae24-42b1-b271-2bb390a6f8c3");
    _SupplierBillSToFRS.Enter_BillNo();
    

    TestModellerLogger.SetLastNodeGuid("12466744-0bd3-4135-9300-e044e7148e58");
    _SupplierBillSToFRS.Enter_Date("44249");
    

    TestModellerLogger.SetLastNodeGuid("7ea52093-1dd7-4979-8034-aeaef336d945");
    _SupplierBillSToFRS.Select_ExpenseType("Commercial vehicles revaluation");
    

    TestModellerLogger.SetLastNodeGuid("de8f87b1-ff3a-421c-9290-6ddaef339bf2");
    _SupplierBillSToFRS.Enter_Description("Architecto sunt dolorem natus velit modi sunt.
Labore eligendi sequi aspernatur ea.
Et aut enim esse fugiat.
Dolores repellendus odit molestiae tempora.
Quibusdam quidem aperiam similique qui nisi est esse sit.
Reprehenderit omnis ullam quia.
Officia id nihil laborum et ullam culpa reprehenderit.
Iure tempore totam natus veritatis quis.
Labore suscipit animi nihil blanditiis enim.
Odit vel quia doloribus reiciendis et culpa unde.");
    

    TestModellerLogger.SetLastNodeGuid("31e40f93-4cb6-45b2-bb91-cdd42e0f2f68");
    _SupplierBillSToFRS.Enter_UnitPrice();
    

    TestModellerLogger.SetLastNodeGuid("956a775c-cdf6-4d7d-949f-76ac35f8991c");
    _SupplierBillSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("5be5550e-c06b-4dbd-bcbf-748aedd3b634");
    _SupplierBillSToFRS.Enter_VATRate();
    

    TestModellerLogger.SetLastNodeGuid("1721e266-7328-4f01-8af9-62c60f672a82");
    _SupplierBillSToFRS.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("86be5d84-b080-4b00-b39a-57ef6d127c84");
    _SupplierBillSToFRS.Enter_Amount("");
    

    TestModellerLogger.SetLastNodeGuid("d76e980e-6867-446d-a13a-3bbe2cc719a9");
    _SupplierBillSToFRS.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("9720f223-ad75-48cf-9a78-a8a001ca0dfb");
    _SupplierBillSToFRS.Click_SaveButton();
    

    }*/

}
