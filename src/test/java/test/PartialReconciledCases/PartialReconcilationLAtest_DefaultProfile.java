package test.PartialReconciledCases;

import reports.TestNGListener;
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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/08e2f730-8ddb-41c4-8048-3324153e4007
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1211, profileId = 101097)
public class PartialReconcilationLAtest_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"PartialReconcilationLAtest","PartialReconcilationLAtest - Default Profile"})
    @TestModellerPath(guid = "5f9b3a5e-27f2-4d34-93dc-69b1923ec71e")
    public void GoToUrlAssertUrlClickSelectALLClickReconcileSelectedClickUngroupSelectedClickR1ClickR2ClickR() throws HeadlessException, InterruptedException, IOException, AWTException
    {
        
       pages.PartialReconciledCases.PartialReconcilationLAtest _PartialReconcilationLAtest = new pages.PartialReconciledCases.PartialReconcilationLAtest(driver);
    TestModellerLogger.SetLastNodeGuid("511bd3c6-4bfe-44f1-85bd-d9c919623efb");
    _PartialReconcilationLAtest.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("6e247121-1606-4c0e-beb4-b3e6cb7495a3");
    _PartialReconcilationLAtest.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("af0c7fbd-9d1e-4a30-9e46-78b9d63e1c8f");
    _PartialReconcilationLAtest.Click_SelectALL();
    

    TestModellerLogger.SetLastNodeGuid("d60148fa-f80f-4012-b7db-ab2180373216");
    _PartialReconcilationLAtest.Click_ReconcileSelected();
    

    TestModellerLogger.SetLastNodeGuid("56eb2524-f022-46bb-bfc6-e57cfeaf10b8");
    _PartialReconcilationLAtest.Click_UngroupSelected();
    

    TestModellerLogger.SetLastNodeGuid("ca75e642-3957-4d56-af81-a254557876ea");
    _PartialReconcilationLAtest.Click_R1();
    

    TestModellerLogger.SetLastNodeGuid("4be1345f-a7ab-4379-ac1b-071bba6eebd1");
    _PartialReconcilationLAtest.Click_R2();
    

    TestModellerLogger.SetLastNodeGuid("0a7bb1d7-72ea-4dd0-9b74-37bf18c628a1");
    _PartialReconcilationLAtest.Click_ReconcileLink();
    

    TestModellerLogger.SetLastNodeGuid("f4325ab9-a0c9-4fd8-a969-0b4fa579e258");
    _PartialReconcilationLAtest.Select_SelectReconcileType("Partial Reconcile");
    

    TestModellerLogger.SetLastNodeGuid("fca7e12e-3436-4301-8150-392d2dcdc819");
    _PartialReconcilationLAtest.Click_ReconcileButton();
    

    }

}
