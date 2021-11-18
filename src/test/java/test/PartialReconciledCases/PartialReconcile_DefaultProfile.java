package test.PartialReconciledCases;

import reports.TestNGListener;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ie.curiositysoftware.allocation.dto.ResultMergeMethod;
import ie.curiositysoftware.allocation.dto.DataAllocationRow;
import reports.ExtentTestListener;
import ie.curiositysoftware.allocation.dto.DataAllocationResult;
import ie.curiositysoftware.allocation.engine.DataAllocation;
import utilities.testmodeller.TestModellerLogger;

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/48fd99d2-0fc1-4325-b2b4-b7a66d0ef5c4
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1178, profileId = 101067)
public class PartialReconcile_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"PartialReconcile","PartialReconcile - Default Profile"})
    @TestModellerPath(guid = "21612c1b-065d-428e-97eb-d76c3a1956d0")
    public void GoToUrlAssertUrlPositiveSelectReconcileTypePositiveEnterJournalEntryDateClickReconcileButtonCl1()
    {
        
        pages.PartialReconciledCases.PartialReconcile _PartialReconcile = new pages.PartialReconciledCases.PartialReconcile(driver);
    TestModellerLogger.SetLastNodeGuid("f67ffba5-ec67-46d2-8ebd-65fdb025ce84");
    _PartialReconcile.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("33029659-f393-4821-a675-eb9df693929b");
    _PartialReconcile.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5ee9d925-3721-430b-9f6f-5eafce62d376");
    _PartialReconcile.Select_ReconcileType("Partial Reconcile");
    

    TestModellerLogger.SetLastNodeGuid("440246cd-81a9-411b-a2e6-28d5bdea44b0");
    _PartialReconcile.Enter_JournalEntryDate("44266");
    

    TestModellerLogger.SetLastNodeGuid("e00ca56f-1d37-40c4-a078-8b15528218e6");
    _PartialReconcile.Click_ReconcileButton();
    

    TestModellerLogger.SetLastNodeGuid("fe197e4d-42b7-4cfe-9998-66882ca87527");
    _PartialReconcile.Click_CancelButton();
    

    TestModellerLogger.SetLastNodeGuid("63bea835-3d17-4f45-80ef-16a88daf75b6");
    _PartialReconcile.Click_CloseFramebutton();
    
    

    }

   /* @Test  (groups= {"PartialReconcile","PartialReconcile - Default Profile"})
    @TestModellerPath(guid = "9027f059-0fb0-4168-82db-bd3d38ac4342")
    public void GoToUrlAssertUrlPositiveSelectReconcileTypePositiveEnterJournalEntryDateClickReconcileButtonCl2()
    {
        
        test.PartialReconciledCases.Goraji _PartialReconcile = new test.PartialReconciledCases.Goraji(driver);
    TestModellerLogger.SetLastNodeGuid("f67ffba5-ec67-46d2-8ebd-65fdb025ce84");
    _PartialReconcile.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("33029659-f393-4821-a675-eb9df693929b");
    _PartialReconcile.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5ee9d925-3721-430b-9f6f-5eafce62d376");
    _PartialReconcile.Select_ReconcileType("Reconcile with Journal Entry");
    

    TestModellerLogger.SetLastNodeGuid("440246cd-81a9-411b-a2e6-28d5bdea44b0");
    _PartialReconcile.Enter_JournalEntryDate("44266");
    

    TestModellerLogger.SetLastNodeGuid("e00ca56f-1d37-40c4-a078-8b15528218e6");
    _PartialReconcile.Click_ReconcileButton();
    

    TestModellerLogger.SetLastNodeGuid("fe197e4d-42b7-4cfe-9998-66882ca87527");
    _PartialReconcile.Click_CancelButton();
    

    TestModellerLogger.SetLastNodeGuid("63bea835-3d17-4f45-80ef-16a88daf75b6");
    _PartialReconcile.Click_CloseFramebutton();
    

    }

    @Test  (groups= {"PartialReconcile","PartialReconcile - Default Profile"})
    @TestModellerPath(guid = "483ea217-5450-4040-9c82-3c2e9141e8cb")
    public void GoToUrlAssertUrlPositiveSelectReconcileTypePositiveEnterJournalEntryDateClickReconcileButtonCl3()
    {
        
        test.PartialReconciledCases.Goraji _PartialReconcile = new test.PartialReconciledCases.Goraji(driver);
    TestModellerLogger.SetLastNodeGuid("f67ffba5-ec67-46d2-8ebd-65fdb025ce84");
    _PartialReconcile.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("33029659-f393-4821-a675-eb9df693929b");
    _PartialReconcile.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5ee9d925-3721-430b-9f6f-5eafce62d376");
    _PartialReconcile.Select_ReconcileType("Reconcile with Write Off");
    

    TestModellerLogger.SetLastNodeGuid("440246cd-81a9-411b-a2e6-28d5bdea44b0");
    _PartialReconcile.Enter_JournalEntryDate("44266");
    

    TestModellerLogger.SetLastNodeGuid("e00ca56f-1d37-40c4-a078-8b15528218e6");
    _PartialReconcile.Click_ReconcileButton();
    

    TestModellerLogger.SetLastNodeGuid("fe197e4d-42b7-4cfe-9998-66882ca87527");
    _PartialReconcile.Click_CancelButton();
    

    TestModellerLogger.SetLastNodeGuid("63bea835-3d17-4f45-80ef-16a88daf75b6");
    _PartialReconcile.Click_CloseFramebutton();
    

    }

    @Test  (groups= {"PartialReconcile","PartialReconcile - Default Profile"})
    @TestModellerPath(guid = "0b964b55-03b1-4ea5-9609-ea6625e13e23")
    public void GoToUrlAssertUrlPositiveSelectReconcileTypePositiveEnterJournalEntryDateClickReconcileButtonCl4()
    {
        
        test.PartialReconciledCases.Goraji _PartialReconcile = new test.PartialReconciledCases.Goraji(driver);
    TestModellerLogger.SetLastNodeGuid("f67ffba5-ec67-46d2-8ebd-65fdb025ce84");
    _PartialReconcile.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("33029659-f393-4821-a675-eb9df693929b");
    _PartialReconcile.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5ee9d925-3721-430b-9f6f-5eafce62d376");
    _PartialReconcile.Select_ReconcileType("Reconcile with Advance");
    

    TestModellerLogger.SetLastNodeGuid("440246cd-81a9-411b-a2e6-28d5bdea44b0");
    _PartialReconcile.Enter_JournalEntryDate("44266");
    

    TestModellerLogger.SetLastNodeGuid("e00ca56f-1d37-40c4-a078-8b15528218e6");
    _PartialReconcile.Click_ReconcileButton();
    

    TestModellerLogger.SetLastNodeGuid("fe197e4d-42b7-4cfe-9998-66882ca87527");
    _PartialReconcile.Click_CancelButton();
    

    TestModellerLogger.SetLastNodeGuid("63bea835-3d17-4f45-80ef-16a88daf75b6");
    _PartialReconcile.Click_CloseFramebutton();
    

    }*/

}
