package Supplier_test;

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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/6d47a07d-45ee-4033-88d8-db00322a9f8d
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1117, profileId = 101011)
public class SubcontractorBill_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"SubcontractorBill","SubcontractorBill - Default Profile"})
    @TestModellerPath(guid = "6ef9821f-c4e1-46e7-9833-cf5d63ed1f74")
    public void GoToUrlAssertUrlClickExpenditureTABClickNewTABClickNewSubcontractorBillPositiveSelectSupplierN() throws HeadlessException, InterruptedException, IOException, AWTException
    {
        
//        Supplier_pages.SubcontractorBill _SubcontractorBill = new Supplier_pages.SubcontractorBill(driver);
//    TestModellerLogger.SetLastNodeGuid("355a9f96-5c6e-472d-8244-fc4e783d33da");
//    _SubcontractorBill.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("b9a9b49e-0aaa-427e-87a4-19884938463b");
//    _SubcontractorBill.AssertUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("4796aef3-8477-4275-b4bb-6d6a3ebba61c");
//    _SubcontractorBill.Click_ExpenditureTAB();
//    
//
//    TestModellerLogger.SetLastNodeGuid("78a64503-4448-4f57-9eb6-742843d999ad");
//    _SubcontractorBill.Click_NewTAB();
//    
//
//    TestModellerLogger.SetLastNodeGuid("21157931-04de-463a-90f4-ba56626d317f");
//    _SubcontractorBill.Click_NewSubcontractorBill();
//    
//
//    TestModellerLogger.SetLastNodeGuid("b1860480-a11d-4594-a0bc-88b7617e0124");
//    _SubcontractorBill.Select_SupplierName("ABCSupplier");
//    
//
//    TestModellerLogger.SetLastNodeGuid("63b23bd0-6a37-42bd-9464-4f7a93d29413");
//    _SubcontractorBill.Enter_BillNo(null);
//    
//
//    TestModellerLogger.SetLastNodeGuid("19378d60-a3bc-4743-9a34-44f4274e1b54");
//    _SubcontractorBill.Enter_Date("44251");
//    
//
//    TestModellerLogger.SetLastNodeGuid("18384de8-0044-4ae4-b91e-19ae43f17ae2");
//    _SubcontractorBill.Enter_Total_Amount("100");
//    
//
//    TestModellerLogger.SetLastNodeGuid("4b405988-6083-4403-bb8e-a9dd93cc4cb6");
//    _SubcontractorBill.Enter_VATAmount("100");
//    
//
//    TestModellerLogger.SetLastNodeGuid("392e3777-3641-4c73-b42f-46449b31f81a");
//    _SubcontractorBill.Click__Save_();
    

    }

}
