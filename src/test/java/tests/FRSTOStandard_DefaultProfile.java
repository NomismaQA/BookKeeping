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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/395d8a26-95b5-4f80-b7b3-12edef170b5c
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 912, profileId = 100806)
public class FRSTOStandard_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"FRSTOStandard","FRSTOStandard - Default Profile"})
    @TestModellerPath(guid = "f0f0c85c-ad4e-4f22-8d73-a6b9f325d5a0")
    public void GoToUrlAssertUrlClickSettingsTABClickVATTABClickEditButtonClickAddButtonPositiveSelectVATStat() throws InterruptedException
    {
        
        pages.FRSTOStandard _FRSTOStandard = new pages.FRSTOStandard(driver);
    TestModellerLogger.SetLastNodeGuid("0ca7f55c-2ba6-41bc-9913-e1bc043f9eb6");
    _FRSTOStandard.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("40188b13-352a-4a07-ba20-767d2f1e3f19");
    _FRSTOStandard.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ba9c4013-bb0a-4aa2-b07e-6d10250d6996");
    _FRSTOStandard.Click_SettingsTAB();
    

    TestModellerLogger.SetLastNodeGuid("61fb1481-b897-43e7-8618-7cd21332b3d5");
    _FRSTOStandard.Click_VATTAB();
    

    TestModellerLogger.SetLastNodeGuid("2b875b67-a4c8-4895-baf1-15bd936fd4ae");
    _FRSTOStandard.Click_EditButton();
    

    TestModellerLogger.SetLastNodeGuid("c2fb97ff-6a3c-4463-b96d-81a1ca82e291");
    _FRSTOStandard.Click_AddButton();
    

    TestModellerLogger.SetLastNodeGuid("fd12b291-9f7c-4722-8708-8d4948b67736");
    _FRSTOStandard.Select_VATStatus("STANDARD VAT");
    

    TestModellerLogger.SetLastNodeGuid("e1b7d37c-3b60-43fb-9d6c-479201ae892c");
    _FRSTOStandard.Enter_Date("44222");
    

    TestModellerLogger.SetLastNodeGuid("e590a803-8a33-4d89-ae28-fb5ecc8577ec");
    _FRSTOStandard.Click_SaveButton();
    

    }

}
