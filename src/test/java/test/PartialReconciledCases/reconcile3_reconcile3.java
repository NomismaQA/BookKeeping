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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/4c220504-b0ce-48d9-bd9a-9c698b0bbe93
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1171, profileId = 101059)
public class reconcile3_reconcile3 extends TestBase
{
    

    
    @Test  (groups= {"reconcile3","reconcile3 - reconcile3"})
    @TestModellerPath(guid = "17d034a3-fea1-4157-942e-5b244f058f78")
    public void reconcile3GoToUrlAssertUrlAssertUrlClickchkboxnkClickchkboxinvoClickReconcilebutnkclickClick() throws InterruptedException
    {
        
        pages.PartialReconciledCases.reconcile3 _reconcile3 = new pages.PartialReconciledCases.reconcile3(driver);
    TestModellerLogger.SetLastNodeGuid("dace31b5-84b6-4040-92cd-9bd76f1caf49");
    _reconcile3.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("983f6bf0-94a1-4ae1-9aed-9946e8ab2973");
//    _reconcile3.AssertUrl();
    

//    TestModellerLogger.SetLastNodeGuid("490d94b5-c6f2-40ab-ace7-afb642ac2ec0");
//    _reconcile3.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("8c77647d-754b-41bd-9250-a55a0a8c834b");
    _reconcile3.Click_chkboxnk();
    

    TestModellerLogger.SetLastNodeGuid("1d8ba62e-7a94-42f5-a82f-b516b1969f0f");
    _reconcile3.Click_chkboxinvo();
    

    TestModellerLogger.SetLastNodeGuid("a955dd75-16e5-49d9-906f-9ba9d6cb645e");
    _reconcile3.Click_Reconcilebutnkclick();
    

    TestModellerLogger.SetLastNodeGuid("e74efccc-cb27-4370-9243-202653cee670");
    _reconcile3.Click_Successmsg();
    

    }

}