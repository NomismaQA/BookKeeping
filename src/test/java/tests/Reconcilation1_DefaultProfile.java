package tests;

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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/02926477-eb15-431d-9044-b08ca7d7ce4d
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1093, profileId = 100993)
public class Reconcilation1_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"Reconcilation1","Reconcilation1 - Default Profile"})
    @TestModellerPath(guid = "6ffcd3de-871d-4a37-a087-bc7a974612c4")
    public void GoToUrlAssertUrlClickAccountantTABClickReconciledTABClickReconcilationPlus1PositiveSelectAccou()
    {
        
        pages.Reconcilation1 _Reconcilation1 = new pages.Reconcilation1(driver);
    TestModellerLogger.SetLastNodeGuid("fa2fbd69-b20c-499d-aab8-a028282e1c7d");
    _Reconcilation1.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c3f2362d-da03-41a2-b0f1-a5d4c27eaf3d");
    _Reconcilation1.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("d3a4fea0-340e-411b-bd7e-df22c1bc2a4c");
    _Reconcilation1.Click_AccountantTAB();
    

    TestModellerLogger.SetLastNodeGuid("45e9b458-be61-46fe-ae0e-ce9cf6653294");
    _Reconcilation1.Click_ReconciledTAB();
    

    TestModellerLogger.SetLastNodeGuid("cebdd3f7-5fb6-4db3-af96-64efcd5380b2");
    _Reconcilation1.Click_ReconcilationPlus1();
    

    TestModellerLogger.SetLastNodeGuid("6f4fed47-23f4-40d3-9e2e-528a977e6a18");
    _Reconcilation1.Select_AccountType1("Customer");
    

    TestModellerLogger.SetLastNodeGuid("cafc0994-25a6-4b15-87d2-7e36c8d6a011");
    _Reconcilation1.Select_Account1("No Available Accounts to Reconcile");
    

    TestModellerLogger.SetLastNodeGuid("c7ed949d-10df-430a-8c1e-dbeb92d7b3da");
    _Reconcilation1.Click_SelectCheck1();
    

    TestModellerLogger.SetLastNodeGuid("dbe69ad3-4479-4704-bedc-0b689b0bcf62");
    _Reconcilation1.Click_ClickRecord();
    

    TestModellerLogger.SetLastNodeGuid("da11af47-6864-43c2-aae3-eb9924ae2002");
    _Reconcilation1.Click_SelectCheck2();
    

    TestModellerLogger.SetLastNodeGuid("ee929282-b3bf-406b-9f71-c1eff3f93b9b");
    _Reconcilation1.Click_ClickRecord2();
    

    TestModellerLogger.SetLastNodeGuid("38250a23-50c5-4021-82d9-f58af153d40b");
    _Reconcilation1.Click_ReconcileLink();
    

    TestModellerLogger.SetLastNodeGuid("96760120-28d1-4314-871a-d9c5f3fc77c8");
    _Reconcilation1.Select_ReconcileType("Partial Reconcile");
    

    TestModellerLogger.SetLastNodeGuid("4be2e433-bded-42dc-99a2-7cedb07674b0");
    _Reconcilation1.Click_ReconcileButton2();
    

    TestModellerLogger.SetLastNodeGuid("a1af2e76-606b-4212-8605-726133cd5ce1");
    _Reconcilation1.Click_closeButton();
    

    TestModellerLogger.SetLastNodeGuid("c32a3b0c-a198-4505-b33a-fc3581499a80");
    _Reconcilation1.Click_ReconciledTAB();
    

    }

}
