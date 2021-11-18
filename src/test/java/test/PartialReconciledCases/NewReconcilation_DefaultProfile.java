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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/3f170c13-e5db-4b2b-9f59-3a70db648afd
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1194, profileId = 101083)
public class NewReconcilation_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"NewReconcilation","NewReconcilation - Default Profile"})
    @TestModellerPath(guid = "d303dfc1-121f-4eac-90e4-799e7bf25d28")
    public void GoToUrlAssertUrlClickSelectALLClickReconcileSelectedClickUngroupSelectedClickR1ClickR2ClickR()
    {
        
        pages.PartialReconciledCases.NewReconcilation _NewReconcilation = new pages.PartialReconciledCases.NewReconcilation(driver);
    TestModellerLogger.SetLastNodeGuid("bbe7a97c-15fc-4611-9e47-f14f55bffb3b");
    _NewReconcilation.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("0af819f5-0abc-41e0-8eff-1bf98dab01c9");
    _NewReconcilation.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f1b33771-15d8-4347-ad18-fea5f14dd383");
    _NewReconcilation.Click_SelectALL();
    

    TestModellerLogger.SetLastNodeGuid("ce437d0b-29fb-4cff-8383-68954db1b785");
    _NewReconcilation.Click_ReconcileSelected();
    

    TestModellerLogger.SetLastNodeGuid("8dce4e28-1e26-4114-9093-3e3599ab0a41");
    _NewReconcilation.Click_UngroupSelected();
    

    TestModellerLogger.SetLastNodeGuid("75e9b385-bad2-4041-9c64-292a10fdb288");
    _NewReconcilation.Click_R1();
    

    TestModellerLogger.SetLastNodeGuid("e7488808-6155-4159-be7d-a5a452dd8967");
    _NewReconcilation.Click_R2();
    

    TestModellerLogger.SetLastNodeGuid("c36c390d-cb9d-4cc5-91c3-b0d1b67e3b3b");
    _NewReconcilation.Click_ReconcileLink();
    

    }

}
