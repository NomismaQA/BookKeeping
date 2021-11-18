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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/ac13d6d3-c19b-486e-a52b-266f9bdf8472
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 864, profileId = 100742)
public class StandardToFlat_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"StandardToFlat","StandardToFlat - Default Profile"})
    @TestModellerPath(guid = "4923edeb-b307-4bee-9747-d3cf73293236")
    public void GoToUrlAssertUrlClickSettingsTabClickVATTABClickEditButtonClickAddTabPositiveSelectVATStatus1() throws HeadlessException, IOException, AWTException, InterruptedException
    {
        
        pages.StandardToFlat _StandardToFlat = new pages.StandardToFlat(driver);
    TestModellerLogger.SetLastNodeGuid("78f4e742-ca7d-4c20-a6ad-983318b03b31");
    _StandardToFlat.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("9f7475c5-36e8-4718-896c-b46054d5e5f0");
    _StandardToFlat.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("37ef2e2b-f555-487e-a068-0cfe5139f16d");
    _StandardToFlat.Click_SettingsTab();
    

    TestModellerLogger.SetLastNodeGuid("0ce13996-b4ad-44b0-a53e-37086e66ad21");
    _StandardToFlat.Click_VATTAB();
    

    TestModellerLogger.SetLastNodeGuid("8d57d627-56c2-4987-b91e-0232c689faa0");
    _StandardToFlat.Click_EditButton();
    

    TestModellerLogger.SetLastNodeGuid("7908546c-882d-4070-a1f5-93887407b27b");
    _StandardToFlat.Click_AddTab();
    

    TestModellerLogger.SetLastNodeGuid("4aeed1f7-ac65-4327-843e-31ab2119f7ba");
    _StandardToFlat.Select_VATStatus("NO VAT");
    

    TestModellerLogger.SetLastNodeGuid("514df5f7-6f52-45a6-a507-9859d88e21ca");
    _StandardToFlat.Enter_SchemeEffectiveDate("44213");
    

    TestModellerLogger.SetLastNodeGuid("dbb0d99a-73dd-4431-80dd-1b5b97944c00");
    _StandardToFlat.Click_DefaultFlatRate();
    

    TestModellerLogger.SetLastNodeGuid("eae0b017-1107-4fd4-9e16-1b5f073c567d");
    _StandardToFlat.Enter_OverrideFlatRate("");
    

    TestModellerLogger.SetLastNodeGuid("48636868-2074-45b3-80b7-74db27e7a625");
    _StandardToFlat.Click_SaveButton();
    

    }

    @Test  (groups= {"StandardToFlat","StandardToFlat - Default Profile"})
    @TestModellerPath(guid = "c0e96084-cab1-4437-b72a-9f3cd85895db")
    public void GoToUrlAssertUrlClickSettingsTabClickVATTABClickEditButtonClickAddTabPositiveSelectVATStatus2() throws HeadlessException, IOException, AWTException, InterruptedException
    {
        
        pages.StandardToFlat _StandardToFlat = new pages.StandardToFlat(driver);
    TestModellerLogger.SetLastNodeGuid("78f4e742-ca7d-4c20-a6ad-983318b03b31");
    _StandardToFlat.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("9f7475c5-36e8-4718-896c-b46054d5e5f0");
    _StandardToFlat.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("37ef2e2b-f555-487e-a068-0cfe5139f16d");
    _StandardToFlat.Click_SettingsTab();
    

    TestModellerLogger.SetLastNodeGuid("0ce13996-b4ad-44b0-a53e-37086e66ad21");
    _StandardToFlat.Click_VATTAB();
    

    TestModellerLogger.SetLastNodeGuid("8d57d627-56c2-4987-b91e-0232c689faa0");
    _StandardToFlat.Click_EditButton();
    

    TestModellerLogger.SetLastNodeGuid("7908546c-882d-4070-a1f5-93887407b27b");
    _StandardToFlat.Click_AddTab();
    

    TestModellerLogger.SetLastNodeGuid("4aeed1f7-ac65-4327-843e-31ab2119f7ba");
    _StandardToFlat.Select_VATStatus("STANDARD VAT");
    

    TestModellerLogger.SetLastNodeGuid("514df5f7-6f52-45a6-a507-9859d88e21ca");
    _StandardToFlat.Enter_SchemeEffectiveDate("44213");
    

    TestModellerLogger.SetLastNodeGuid("dbb0d99a-73dd-4431-80dd-1b5b97944c00");
    _StandardToFlat.Click_DefaultFlatRate();
    

    TestModellerLogger.SetLastNodeGuid("eae0b017-1107-4fd4-9e16-1b5f073c567d");
    _StandardToFlat.Enter_OverrideFlatRate("");
    

    TestModellerLogger.SetLastNodeGuid("48636868-2074-45b3-80b7-74db27e7a625");
    _StandardToFlat.Click_SaveButton();
    

    }

   /* @Test  (groups= {"StandardToFlat","StandardToFlat - Default Profile"})
    @TestModellerPath(guid = "d4bbff9c-8627-4f07-869e-aee32805da44")
    public void GoToUrlAssertUrlClickSettingsTabClickVATTABClickEditButtonClickAddTabPositiveSelectVATStatus3()
    {
        
        pages.StandardToFlat _StandardToFlat = new pages.StandardToFlat(driver);
    TestModellerLogger.SetLastNodeGuid("78f4e742-ca7d-4c20-a6ad-983318b03b31");
    _StandardToFlat.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("9f7475c5-36e8-4718-896c-b46054d5e5f0");
    _StandardToFlat.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("37ef2e2b-f555-487e-a068-0cfe5139f16d");
    _StandardToFlat.Click_SettingsTab();
    

    TestModellerLogger.SetLastNodeGuid("0ce13996-b4ad-44b0-a53e-37086e66ad21");
    _StandardToFlat.Click_VATTAB();
    

    TestModellerLogger.SetLastNodeGuid("8d57d627-56c2-4987-b91e-0232c689faa0");
    _StandardToFlat.Click_EditButton();
    

    TestModellerLogger.SetLastNodeGuid("7908546c-882d-4070-a1f5-93887407b27b");
    _StandardToFlat.Click_AddTab();
    

    TestModellerLogger.SetLastNodeGuid("4aeed1f7-ac65-4327-843e-31ab2119f7ba");
    _StandardToFlat.Select_VATStatus("FLATRATE VAT");
    

    TestModellerLogger.SetLastNodeGuid("514df5f7-6f52-45a6-a507-9859d88e21ca");
    _StandardToFlat.Enter_SchemeEffectiveDate("44213");
    

    TestModellerLogger.SetLastNodeGuid("dbb0d99a-73dd-4431-80dd-1b5b97944c00");
    _StandardToFlat.Click_DefaultFlatRate();
    

    TestModellerLogger.SetLastNodeGuid("eae0b017-1107-4fd4-9e16-1b5f073c567d");
    _StandardToFlat.Enter_OverrideFlatRate("");
    

    TestModellerLogger.SetLastNodeGuid("48636868-2074-45b3-80b7-74db27e7a625");
    _StandardToFlat.Click_SaveButton();
    

    }*/

}
