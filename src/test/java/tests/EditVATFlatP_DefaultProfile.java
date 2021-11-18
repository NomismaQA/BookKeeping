package tests;

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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/b33ddb11-f418-4cf2-99b5-9d69fb3a369d
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1079, profileId = 100979)
public class EditVATFlatP_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"EditVATFlatP","EditVATFlatP - Default Profile"})
    @TestModellerPath(guid = "dcf12d5c-ab89-453f-9fc7-c4ed6dfbe5a1")
    public void GoToUrlAssertUrlClickSettingsTABClickVATTABClickEditButtonClickEditButton2PositiveSelectVATSt1() throws HeadlessException, IOException, AWTException
    {
        
        pages.EditVATFlatP _EditVATFlatP = new pages.EditVATFlatP(driver);
    TestModellerLogger.SetLastNodeGuid("dd1e0200-f5fc-4cc1-ac8c-c3f3f54ef89a");
    _EditVATFlatP.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("19cbed58-237a-4425-9611-58873165753f");
    _EditVATFlatP.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("abe69003-cc9b-4fe2-bbc2-c91a09307cee");
    _EditVATFlatP.Click_SettingsTAB();
    

    TestModellerLogger.SetLastNodeGuid("20f7cfd4-2457-438d-a422-4da939a89fbb");
    _EditVATFlatP.Click_VATTAB();
    

    TestModellerLogger.SetLastNodeGuid("54505770-a1e8-4377-ac49-541fb0a1966a");
    _EditVATFlatP.Click_EditButton();
    

    TestModellerLogger.SetLastNodeGuid("f2dbde37-f5f4-4a6b-9d62-e6abd0838d7f");
    _EditVATFlatP.Click_EditButton2();
    

    TestModellerLogger.SetLastNodeGuid("24de4095-7d42-45e1-8736-b89e52159258");
    _EditVATFlatP.Select_VATStatus("NO VAT");
    

    TestModellerLogger.SetLastNodeGuid("be7c6bc8-01b6-47f4-8c1e-d0f3eb10f652");
    _EditVATFlatP.Enter_Date("44245");
    

    TestModellerLogger.SetLastNodeGuid("63f4ddd4-cb02-49f7-829f-adc6ad538cba");
    _EditVATFlatP.Click_UseDefaultRate();
    

    TestModellerLogger.SetLastNodeGuid("d8142d91-2dbf-4e7f-a99e-b52e2ea1b76b");
    _EditVATFlatP.Enter_OverrideFLATRate(null);
    

    TestModellerLogger.SetLastNodeGuid("21d0d0a3-6097-481d-b1e2-bde9881160a0");
    _EditVATFlatP.Click_SaveButton();
    

    }

    @Test  (groups= {"EditVATFlatP","EditVATFlatP - Default Profile"})
    @TestModellerPath(guid = "3be6dcd9-710b-4daf-80c2-2cd905674dc0")
    public void GoToUrlAssertUrlClickSettingsTABClickVATTABClickEditButtonClickEditButton2PositiveSelectVATSt2() throws HeadlessException, IOException, AWTException
    {
        
        pages.EditVATFlatP _EditVATFlatP = new pages.EditVATFlatP(driver);
    TestModellerLogger.SetLastNodeGuid("dd1e0200-f5fc-4cc1-ac8c-c3f3f54ef89a");
    _EditVATFlatP.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("19cbed58-237a-4425-9611-58873165753f");
    _EditVATFlatP.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("abe69003-cc9b-4fe2-bbc2-c91a09307cee");
    _EditVATFlatP.Click_SettingsTAB();
    

    TestModellerLogger.SetLastNodeGuid("20f7cfd4-2457-438d-a422-4da939a89fbb");
    _EditVATFlatP.Click_VATTAB();
    

    TestModellerLogger.SetLastNodeGuid("54505770-a1e8-4377-ac49-541fb0a1966a");
    _EditVATFlatP.Click_EditButton();
    

    TestModellerLogger.SetLastNodeGuid("f2dbde37-f5f4-4a6b-9d62-e6abd0838d7f");
    _EditVATFlatP.Click_EditButton2();
    

    TestModellerLogger.SetLastNodeGuid("24de4095-7d42-45e1-8736-b89e52159258");
    _EditVATFlatP.Select_VATStatus("STANDARD VAT");
    

    TestModellerLogger.SetLastNodeGuid("be7c6bc8-01b6-47f4-8c1e-d0f3eb10f652");
    _EditVATFlatP.Enter_Date("44245");
    

    TestModellerLogger.SetLastNodeGuid("63f4ddd4-cb02-49f7-829f-adc6ad538cba");
    _EditVATFlatP.Click_UseDefaultRate();
    

    TestModellerLogger.SetLastNodeGuid("d8142d91-2dbf-4e7f-a99e-b52e2ea1b76b");
    _EditVATFlatP.Enter_OverrideFLATRate(null);
    

    TestModellerLogger.SetLastNodeGuid("21d0d0a3-6097-481d-b1e2-bde9881160a0");
    _EditVATFlatP.Click_SaveButton();
    

    }

    @Test  (groups= {"EditVATFlatP","EditVATFlatP - Default Profile"})
    @TestModellerPath(guid = "5cdec866-1ec0-4a76-9160-b5de35890469")
    public void GoToUrlAssertUrlClickSettingsTABClickVATTABClickEditButtonClickEditButton2PositiveSelectVATSt3() throws HeadlessException, IOException, AWTException
    {
        
        pages.EditVATFlatP _EditVATFlatP = new pages.EditVATFlatP(driver);
    TestModellerLogger.SetLastNodeGuid("dd1e0200-f5fc-4cc1-ac8c-c3f3f54ef89a");
    _EditVATFlatP.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("19cbed58-237a-4425-9611-58873165753f");
    _EditVATFlatP.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("abe69003-cc9b-4fe2-bbc2-c91a09307cee");
    _EditVATFlatP.Click_SettingsTAB();
    

    TestModellerLogger.SetLastNodeGuid("20f7cfd4-2457-438d-a422-4da939a89fbb");
    _EditVATFlatP.Click_VATTAB();
    

    TestModellerLogger.SetLastNodeGuid("54505770-a1e8-4377-ac49-541fb0a1966a");
    _EditVATFlatP.Click_EditButton();
    

    TestModellerLogger.SetLastNodeGuid("f2dbde37-f5f4-4a6b-9d62-e6abd0838d7f");
    _EditVATFlatP.Click_EditButton2();
    

    TestModellerLogger.SetLastNodeGuid("24de4095-7d42-45e1-8736-b89e52159258");
    _EditVATFlatP.Select_VATStatus("FLATRATE VAT");
    

    TestModellerLogger.SetLastNodeGuid("be7c6bc8-01b6-47f4-8c1e-d0f3eb10f652");
    _EditVATFlatP.Enter_Date("44245");
    

    TestModellerLogger.SetLastNodeGuid("63f4ddd4-cb02-49f7-829f-adc6ad538cba");
    _EditVATFlatP.Click_UseDefaultRate();
    

    TestModellerLogger.SetLastNodeGuid("d8142d91-2dbf-4e7f-a99e-b52e2ea1b76b");
    _EditVATFlatP.Enter_OverrideFLATRate(null);
    

    TestModellerLogger.SetLastNodeGuid("21d0d0a3-6097-481d-b1e2-bde9881160a0");
    _EditVATFlatP.Click_SaveButton();
    

    }

}
