package tests;

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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/c4949ec6-1ffd-43f1-82e3-87ad94a0bbfd
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1013, profileId = 100739)
public class EditSettingToStandard_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"EditSettingToStandard","EditSettingToStandard - Default Profile"})
    @TestModellerPath(guid = "e4fba99a-c7f0-4af7-ab98-cc9277b9c819")
    public void GoToUrlAssertUrlClickSettingsTabClickVATTabClickEditButtonClickVATTypeEditPositiveSelectSelec1() throws InterruptedException, HeadlessException, IOException, AWTException
    {
        
        pages.EditSettingToStandard _EditSettingToStandard = new pages.EditSettingToStandard(driver);
    TestModellerLogger.SetLastNodeGuid("be5994ab-08fc-491b-93e9-7e0d982cadb3");
    _EditSettingToStandard.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("fce56750-e722-4b5b-a6b4-a88c3fc2a3f7");
    _EditSettingToStandard.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f503a66c-5a3a-4197-b3ae-159ed01aa52c");
    _EditSettingToStandard.Click_SettingsTab();
    

    TestModellerLogger.SetLastNodeGuid("c92f0a95-9832-4576-a4fb-7c5179e2bd74");
    _EditSettingToStandard.Click_VATTab();
    

    TestModellerLogger.SetLastNodeGuid("af7a0151-5ddf-4c3a-9108-d2ee93cf17fd");
    _EditSettingToStandard.Click_EditButton();
    

    TestModellerLogger.SetLastNodeGuid("6d5eefd9-4f52-460d-a46c-cee2ff36ecef");
    _EditSettingToStandard.Click_VATTypeEdit();
    

    TestModellerLogger.SetLastNodeGuid("caa4ec7f-5c3f-4dc5-a5a0-b798ccb83a18");
    _EditSettingToStandard.Select_SelectVATType("NO VAT");
    

    TestModellerLogger.SetLastNodeGuid("e4d8d7c9-bc58-407d-bc46-cbb6f678bad3");
    _EditSettingToStandard.Click_SaveButton();
    

    }

    @Test  (groups= {"EditSettingToStandard","EditSettingToStandard - Default Profile"})
    @TestModellerPath(guid = "52e615fa-8b5b-45ec-bea4-e457d50117a6")
    public void GoToUrlAssertUrlClickSettingsTabClickVATTabClickEditButtonClickVATTypeEditPositiveSelectSelec2() throws InterruptedException, HeadlessException, IOException, AWTException
    {
        
        pages.EditSettingToStandard _EditSettingToStandard = new pages.EditSettingToStandard(driver);
    TestModellerLogger.SetLastNodeGuid("be5994ab-08fc-491b-93e9-7e0d982cadb3");
    _EditSettingToStandard.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("fce56750-e722-4b5b-a6b4-a88c3fc2a3f7");
    _EditSettingToStandard.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f503a66c-5a3a-4197-b3ae-159ed01aa52c");
    _EditSettingToStandard.Click_SettingsTab();
    

    TestModellerLogger.SetLastNodeGuid("c92f0a95-9832-4576-a4fb-7c5179e2bd74");
    _EditSettingToStandard.Click_VATTab();
    

    TestModellerLogger.SetLastNodeGuid("af7a0151-5ddf-4c3a-9108-d2ee93cf17fd");
    _EditSettingToStandard.Click_EditButton();
    

    TestModellerLogger.SetLastNodeGuid("6d5eefd9-4f52-460d-a46c-cee2ff36ecef");
    _EditSettingToStandard.Click_VATTypeEdit();
    

    TestModellerLogger.SetLastNodeGuid("caa4ec7f-5c3f-4dc5-a5a0-b798ccb83a18");
    _EditSettingToStandard.Select_SelectVATType("STANDARD VAT");
    

    TestModellerLogger.SetLastNodeGuid("e4d8d7c9-bc58-407d-bc46-cbb6f678bad3");
    _EditSettingToStandard.Click_SaveButton();
    

    }

    @Test  (groups= {"EditSettingToStandard","EditSettingToStandard - Default Profile"})
    @TestModellerPath(guid = "cb127064-3d43-4f1b-8807-3dcaebf2ecb2")
    public void GoToUrlAssertUrlClickSettingsTabClickVATTabClickEditButtonClickVATTypeEditPositiveSelectSelec3() throws InterruptedException, HeadlessException, IOException, AWTException
    {
        
        pages.EditSettingToStandard _EditSettingToStandard = new pages.EditSettingToStandard(driver);
    TestModellerLogger.SetLastNodeGuid("be5994ab-08fc-491b-93e9-7e0d982cadb3");
    _EditSettingToStandard.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("fce56750-e722-4b5b-a6b4-a88c3fc2a3f7");
    _EditSettingToStandard.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f503a66c-5a3a-4197-b3ae-159ed01aa52c");
    _EditSettingToStandard.Click_SettingsTab();
    

    TestModellerLogger.SetLastNodeGuid("c92f0a95-9832-4576-a4fb-7c5179e2bd74");
    _EditSettingToStandard.Click_VATTab();
    

    TestModellerLogger.SetLastNodeGuid("af7a0151-5ddf-4c3a-9108-d2ee93cf17fd");
    _EditSettingToStandard.Click_EditButton();
    

    TestModellerLogger.SetLastNodeGuid("6d5eefd9-4f52-460d-a46c-cee2ff36ecef");
    _EditSettingToStandard.Click_VATTypeEdit();
    

    TestModellerLogger.SetLastNodeGuid("caa4ec7f-5c3f-4dc5-a5a0-b798ccb83a18");
    _EditSettingToStandard.Select_SelectVATType("FLATRATE VAT");
    

    TestModellerLogger.SetLastNodeGuid("e4d8d7c9-bc58-407d-bc46-cbb6f678bad3");
    _EditSettingToStandard.Click_SaveButton();
    

    }

}
