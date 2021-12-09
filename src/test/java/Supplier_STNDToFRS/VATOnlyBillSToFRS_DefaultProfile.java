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

import Supplier_pages.VATOnlyBillSToFRS;
import ie.curiositysoftware.allocation.dto.ResultMergeMethod;
import ie.curiositysoftware.allocation.dto.DataAllocationRow;
import reports.ExtentTestListener;
import ie.curiositysoftware.allocation.dto.DataAllocationResult;
import ie.curiositysoftware.allocation.engine.DataAllocation;
import utilities.testmodeller.TestModellerLogger;

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/42972976-9ec0-4311-b059-9165283cd411
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1109, profileId = 101006)
public class VATOnlyBillSToFRS_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"VATOnlyBillSToFRS","VATOnlyBillSToFRS - Default Profile"})
    @TestModellerPath(guid = "6b06c5b6-7b9a-4f00-8db3-806778f7303a")
    public void GoToUrlAssertUrlClickExpenditureTABClickNewTABClickVATOnlyBillPositiveSelectSupplierNameEnter1() throws HeadlessException, IOException, AWTException, InterruptedException
    {
        
    	Supplier_pages.VATOnlyBillSToFRS _VATOnlyBillSToFRS = new Supplier_pages.VATOnlyBillSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("43b71837-169a-4003-8f22-a676f3b67070");
    _VATOnlyBillSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("0984096e-2d45-4d04-8694-0425ef32eba0");
    _VATOnlyBillSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c417c41a-8713-4207-87ff-9e40aaa5b5dd");
    _VATOnlyBillSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("c9060188-9c7f-4b7d-b4de-189d420922e0");
    _VATOnlyBillSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("0f8e7c26-8531-4862-a7d6-2c0652fee79e");
    _VATOnlyBillSToFRS.Click_VATOnlyBill();
    

    TestModellerLogger.SetLastNodeGuid("67342eec-57d7-4a58-b4f5-43beeda93632");
    _VATOnlyBillSToFRS.Select_SupplierName("");
    

    TestModellerLogger.SetLastNodeGuid("b8f5e167-8590-4e61-9e2a-a0ef55e1317f");
    _VATOnlyBillSToFRS.Enter_InvoiceNo(null);
    

    TestModellerLogger.SetLastNodeGuid("13f1744c-b332-4c44-a0ae-1468bbef2b1b");
    _VATOnlyBillSToFRS.Enter_InvoiceDate("44251");
    

    TestModellerLogger.SetLastNodeGuid("9b3cc656-f690-47a5-bb04-95921b8cd7ad");
    _VATOnlyBillSToFRS.Enter_SubTotal(null);
    

    TestModellerLogger.SetLastNodeGuid("75fcc555-aa18-4673-8841-61cd4a7bf1a7");
    _VATOnlyBillSToFRS.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("c9a1d57b-b2d4-4f32-a2de-15fc9d1eb7e1");
    _VATOnlyBillSToFRS.Enter_VatRate(null);
    

    TestModellerLogger.SetLastNodeGuid("c1931af2-592a-456b-b6ee-4196c4d2a512");
    _VATOnlyBillSToFRS.Enter_VAT(null);
    

    TestModellerLogger.SetLastNodeGuid("725f4abb-1b5c-4fe1-874f-fa21b9133e51");
    _VATOnlyBillSToFRS.Enter_GrossTotal(null);
    

    TestModellerLogger.SetLastNodeGuid("40701513-cd33-4fbf-9230-e580a1c49022");
    _VATOnlyBillSToFRS.Click_SaveButton();
    

    }

    @Test  (groups= {"VATOnlyBillSToFRS","VATOnlyBillSToFRS - Default Profile"})
    @TestModellerPath(guid = "cdfd5e17-871f-432f-a0d1-3950b0baa5bd")
    public void GoToUrlAssertUrlClickExpenditureTABClickNewTABClickVATOnlyBillPositiveSelectSupplierNameEnter2() throws HeadlessException, IOException, AWTException, InterruptedException
    {
        
    	Supplier_pages.VATOnlyBillSToFRS _VATOnlyBillSToFRS = new Supplier_pages.VATOnlyBillSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("43b71837-169a-4003-8f22-a676f3b67070");
    _VATOnlyBillSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("0984096e-2d45-4d04-8694-0425ef32eba0");
    _VATOnlyBillSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c417c41a-8713-4207-87ff-9e40aaa5b5dd");
    _VATOnlyBillSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("c9060188-9c7f-4b7d-b4de-189d420922e0");
    _VATOnlyBillSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("0f8e7c26-8531-4862-a7d6-2c0652fee79e");
    _VATOnlyBillSToFRS.Click_VATOnlyBill();
    

    TestModellerLogger.SetLastNodeGuid("67342eec-57d7-4a58-b4f5-43beeda93632");
    _VATOnlyBillSToFRS.Select_SupplierName("");
    

    TestModellerLogger.SetLastNodeGuid("b8f5e167-8590-4e61-9e2a-a0ef55e1317f");
    _VATOnlyBillSToFRS.Enter_InvoiceNo(null);
    

    TestModellerLogger.SetLastNodeGuid("13f1744c-b332-4c44-a0ae-1468bbef2b1b");
    _VATOnlyBillSToFRS.Enter_InvoiceDate("44251");
    

    TestModellerLogger.SetLastNodeGuid("9b3cc656-f690-47a5-bb04-95921b8cd7ad");
    _VATOnlyBillSToFRS.Enter_SubTotal(null);
    

    TestModellerLogger.SetLastNodeGuid("75fcc555-aa18-4673-8841-61cd4a7bf1a7");
    _VATOnlyBillSToFRS.Select_VATRateType("Zero Rate");
    

    TestModellerLogger.SetLastNodeGuid("c9a1d57b-b2d4-4f32-a2de-15fc9d1eb7e1");
    _VATOnlyBillSToFRS.Enter_VatRate(null);
    

    TestModellerLogger.SetLastNodeGuid("c1931af2-592a-456b-b6ee-4196c4d2a512");
    _VATOnlyBillSToFRS.Enter_VAT(null);
    

    TestModellerLogger.SetLastNodeGuid("725f4abb-1b5c-4fe1-874f-fa21b9133e51");
    _VATOnlyBillSToFRS.Enter_GrossTotal(null);
    

    TestModellerLogger.SetLastNodeGuid("40701513-cd33-4fbf-9230-e580a1c49022");
    _VATOnlyBillSToFRS.Click_SaveButton();
    

    }

 /*   @Test  (groups= {"VATOnlyBillSToFRS","VATOnlyBillSToFRS - Default Profile"})
    @TestModellerPath(guid = "c427361c-9ab6-4fd5-905c-458032559b1a")
    public void GoToUrlAssertUrlClickExpenditureTABClickNewTABClickVATOnlyBillPositiveSelectSupplierNameEnter3()
    {
        
    	Supplier_pages.VATOnlyBillSToFRS _VATOnlyBillSToFRS = new Supplier_pages.VATOnlyBillSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("43b71837-169a-4003-8f22-a676f3b67070");
    _VATOnlyBillSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("0984096e-2d45-4d04-8694-0425ef32eba0");
    _VATOnlyBillSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c417c41a-8713-4207-87ff-9e40aaa5b5dd");
    _VATOnlyBillSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("c9060188-9c7f-4b7d-b4de-189d420922e0");
    _VATOnlyBillSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("0f8e7c26-8531-4862-a7d6-2c0652fee79e");
    _VATOnlyBillSToFRS.Click_VATOnlyBill();
    

    TestModellerLogger.SetLastNodeGuid("67342eec-57d7-4a58-b4f5-43beeda93632");
    _VATOnlyBillSToFRS.Select_SupplierName("");
    

    TestModellerLogger.SetLastNodeGuid("b8f5e167-8590-4e61-9e2a-a0ef55e1317f");
    _VATOnlyBillSToFRS.Enter_InvoiceNo(null);
    

    TestModellerLogger.SetLastNodeGuid("13f1744c-b332-4c44-a0ae-1468bbef2b1b");
    _VATOnlyBillSToFRS.Enter_InvoiceDate("44251");
    

    TestModellerLogger.SetLastNodeGuid("9b3cc656-f690-47a5-bb04-95921b8cd7ad");
    _VATOnlyBillSToFRS.Enter_SubTotal(null);
    

    TestModellerLogger.SetLastNodeGuid("75fcc555-aa18-4673-8841-61cd4a7bf1a7");
    _VATOnlyBillSToFRS.Select_VATRateType("Reduced Rate");
    

    TestModellerLogger.SetLastNodeGuid("c9a1d57b-b2d4-4f32-a2de-15fc9d1eb7e1");
    _VATOnlyBillSToFRS.Enter_VatRate(null);
    

    TestModellerLogger.SetLastNodeGuid("c1931af2-592a-456b-b6ee-4196c4d2a512");
    _VATOnlyBillSToFRS.Enter_VAT(null);
    

    TestModellerLogger.SetLastNodeGuid("725f4abb-1b5c-4fe1-874f-fa21b9133e51");
    _VATOnlyBillSToFRS.Enter_GrossTotal(null);
    

    TestModellerLogger.SetLastNodeGuid("40701513-cd33-4fbf-9230-e580a1c49022");
    _VATOnlyBillSToFRS.Click_SaveButton();
    

    }

    @Test  (groups= {"VATOnlyBillSToFRS","VATOnlyBillSToFRS - Default Profile"})
    @TestModellerPath(guid = "cf3685d4-77d1-4581-97ab-bf1465e27d9f")
    public void GoToUrlAssertUrlClickExpenditureTABClickNewTABClickVATOnlyBillPositiveSelectSupplierNameEnter4()
    {
        
    	Supplier_pages.VATOnlyBillSToFRS _VATOnlyBillSToFRS = new Supplier_pages.VATOnlyBillSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("43b71837-169a-4003-8f22-a676f3b67070");
    _VATOnlyBillSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("0984096e-2d45-4d04-8694-0425ef32eba0");
    _VATOnlyBillSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c417c41a-8713-4207-87ff-9e40aaa5b5dd");
    _VATOnlyBillSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("c9060188-9c7f-4b7d-b4de-189d420922e0");
    _VATOnlyBillSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("0f8e7c26-8531-4862-a7d6-2c0652fee79e");
    _VATOnlyBillSToFRS.Click_VATOnlyBill();
    

    TestModellerLogger.SetLastNodeGuid("67342eec-57d7-4a58-b4f5-43beeda93632");
    _VATOnlyBillSToFRS.Select_SupplierName("");
    

    TestModellerLogger.SetLastNodeGuid("b8f5e167-8590-4e61-9e2a-a0ef55e1317f");
    _VATOnlyBillSToFRS.Enter_InvoiceNo(null);
    

    TestModellerLogger.SetLastNodeGuid("13f1744c-b332-4c44-a0ae-1468bbef2b1b");
    _VATOnlyBillSToFRS.Enter_InvoiceDate("44251");
    

    TestModellerLogger.SetLastNodeGuid("9b3cc656-f690-47a5-bb04-95921b8cd7ad");
    _VATOnlyBillSToFRS.Enter_SubTotal(null);
    

    TestModellerLogger.SetLastNodeGuid("75fcc555-aa18-4673-8841-61cd4a7bf1a7");
    _VATOnlyBillSToFRS.Select_VATRateType("No VAT");
    

    TestModellerLogger.SetLastNodeGuid("c9a1d57b-b2d4-4f32-a2de-15fc9d1eb7e1");
    _VATOnlyBillSToFRS.Enter_VatRate(null);
    

    TestModellerLogger.SetLastNodeGuid("c1931af2-592a-456b-b6ee-4196c4d2a512");
    _VATOnlyBillSToFRS.Enter_VAT(null);
    

    TestModellerLogger.SetLastNodeGuid("725f4abb-1b5c-4fe1-874f-fa21b9133e51");
    _VATOnlyBillSToFRS.Enter_GrossTotal(null);
    

    TestModellerLogger.SetLastNodeGuid("40701513-cd33-4fbf-9230-e580a1c49022");
    _VATOnlyBillSToFRS.Click_SaveButton();
    

    }

    @Test  (groups= {"VATOnlyBillSToFRS","VATOnlyBillSToFRS - Default Profile"})
    @TestModellerPath(guid = "31b5e67e-aa7e-4ee0-a376-e0ebf10de8dd")
    public void GoToUrlAssertUrlClickExpenditureTABClickNewTABClickVATOnlyBillPositiveSelectSupplierNameEnter5()
    {
        
    	Supplier_pages.VATOnlyBillSToFRS _VATOnlyBillSToFRS = new Supplier_pages.VATOnlyBillSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("43b71837-169a-4003-8f22-a676f3b67070");
    _VATOnlyBillSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("0984096e-2d45-4d04-8694-0425ef32eba0");
    _VATOnlyBillSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c417c41a-8713-4207-87ff-9e40aaa5b5dd");
    _VATOnlyBillSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("c9060188-9c7f-4b7d-b4de-189d420922e0");
    _VATOnlyBillSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("0f8e7c26-8531-4862-a7d6-2c0652fee79e");
    _VATOnlyBillSToFRS.Click_VATOnlyBill();
    

    TestModellerLogger.SetLastNodeGuid("67342eec-57d7-4a58-b4f5-43beeda93632");
    _VATOnlyBillSToFRS.Select_SupplierName("");
    

    TestModellerLogger.SetLastNodeGuid("b8f5e167-8590-4e61-9e2a-a0ef55e1317f");
    _VATOnlyBillSToFRS.Enter_InvoiceNo(null);
    

    TestModellerLogger.SetLastNodeGuid("13f1744c-b332-4c44-a0ae-1468bbef2b1b");
    _VATOnlyBillSToFRS.Enter_InvoiceDate("44251");
    

    TestModellerLogger.SetLastNodeGuid("9b3cc656-f690-47a5-bb04-95921b8cd7ad");
    _VATOnlyBillSToFRS.Enter_SubTotal(null);
    

    TestModellerLogger.SetLastNodeGuid("75fcc555-aa18-4673-8841-61cd4a7bf1a7");
    _VATOnlyBillSToFRS.Select_VATRateType("Exempt");
    

    TestModellerLogger.SetLastNodeGuid("c9a1d57b-b2d4-4f32-a2de-15fc9d1eb7e1");
    _VATOnlyBillSToFRS.Enter_VatRate(null);
    

    TestModellerLogger.SetLastNodeGuid("c1931af2-592a-456b-b6ee-4196c4d2a512");
    _VATOnlyBillSToFRS.Enter_VAT(null);
    

    TestModellerLogger.SetLastNodeGuid("725f4abb-1b5c-4fe1-874f-fa21b9133e51");
    _VATOnlyBillSToFRS.Enter_GrossTotal(null);
    

    TestModellerLogger.SetLastNodeGuid("40701513-cd33-4fbf-9230-e580a1c49022");
    _VATOnlyBillSToFRS.Click_SaveButton();
    

    }

    @Test  (groups= {"VATOnlyBillSToFRS","VATOnlyBillSToFRS - Default Profile"})
    @TestModellerPath(guid = "a46885a5-1f41-4923-87bc-09269651f8d4")
    public void GoToUrlAssertUrlClickExpenditureTABClickNewTABClickVATOnlyBillPositiveSelectSupplierNameEnter6()
    {
        
    	Supplier_pages.VATOnlyBillSToFRS _VATOnlyBillSToFRS = new Supplier_pages.VATOnlyBillSToFRS(driver);
    TestModellerLogger.SetLastNodeGuid("43b71837-169a-4003-8f22-a676f3b67070");
    _VATOnlyBillSToFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("0984096e-2d45-4d04-8694-0425ef32eba0");
    _VATOnlyBillSToFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c417c41a-8713-4207-87ff-9e40aaa5b5dd");
    _VATOnlyBillSToFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("c9060188-9c7f-4b7d-b4de-189d420922e0");
    _VATOnlyBillSToFRS.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("0f8e7c26-8531-4862-a7d6-2c0652fee79e");
    _VATOnlyBillSToFRS.Click_VATOnlyBill();
    

    TestModellerLogger.SetLastNodeGuid("67342eec-57d7-4a58-b4f5-43beeda93632");
    _VATOnlyBillSToFRS.Select_SupplierName("");
    

    TestModellerLogger.SetLastNodeGuid("b8f5e167-8590-4e61-9e2a-a0ef55e1317f");
    _VATOnlyBillSToFRS.Enter_InvoiceNo(null);
    

    TestModellerLogger.SetLastNodeGuid("13f1744c-b332-4c44-a0ae-1468bbef2b1b");
    _VATOnlyBillSToFRS.Enter_InvoiceDate("44251");
    

    TestModellerLogger.SetLastNodeGuid("9b3cc656-f690-47a5-bb04-95921b8cd7ad");
    _VATOnlyBillSToFRS.Enter_SubTotal(null);
    

    TestModellerLogger.SetLastNodeGuid("75fcc555-aa18-4673-8841-61cd4a7bf1a7");
    _VATOnlyBillSToFRS.Select_VATRateType("Out of Scope");
    

    TestModellerLogger.SetLastNodeGuid("c9a1d57b-b2d4-4f32-a2de-15fc9d1eb7e1");
    _VATOnlyBillSToFRS.Enter_VatRate(null);
    

    TestModellerLogger.SetLastNodeGuid("c1931af2-592a-456b-b6ee-4196c4d2a512");
    _VATOnlyBillSToFRS.Enter_VAT(null);
    

    TestModellerLogger.SetLastNodeGuid("725f4abb-1b5c-4fe1-874f-fa21b9133e51");
    _VATOnlyBillSToFRS.Enter_GrossTotal(null);
    

    TestModellerLogger.SetLastNodeGuid("40701513-cd33-4fbf-9230-e580a1c49022");
    _VATOnlyBillSToFRS.Click_SaveButton();
    

    }*/

}
