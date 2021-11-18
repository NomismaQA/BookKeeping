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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/b1d3583a-c7fc-4e27-a033-7395081f1c00
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 902, profileId = 100794)
public class StandardToNoVAT_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"StandardToNoVAT","StandardToNoVAT - Default Profile"})
    @TestModellerPath(guid = "ff60cc81-4dc6-4230-bb9f-aa40d9a118ba")
    public void GoToUrlAssertUrlClickSettingsTABClickVATTABClickEditTabClickAddButtonPositiveSelectVATTypePo1()
    {
        
        pages.StandardToNoVAT _StandardToNoVAT = new pages.StandardToNoVAT(driver);
    TestModellerLogger.SetLastNodeGuid("966dec01-c823-4135-808e-d24eb2d03157");
    
    _StandardToNoVAT.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("6e094f84-0e86-4a07-a5eb-3e7cae1d42e1");
    _StandardToNoVAT.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("9cfa961e-ba07-4816-92ec-6f23c7648601");
    _StandardToNoVAT.Click_SettingsTAB();
    

    TestModellerLogger.SetLastNodeGuid("ff070664-6141-4cf4-8ae0-43351679f732");
    _StandardToNoVAT.Click_VATTAB();
    

    TestModellerLogger.SetLastNodeGuid("e90f4267-7405-4b6f-970b-8eb23a0d807a");
    _StandardToNoVAT.Click_EditTab();
    

    TestModellerLogger.SetLastNodeGuid("4b98baf8-36fd-4519-815e-ce754903d415");
    _StandardToNoVAT.Click_AddButton();
    

    TestModellerLogger.SetLastNodeGuid("d2bfe41d-3a6b-4f9e-80c7-ef10fda3ee16");
    _StandardToNoVAT.Select_VATType("NO VAT");
    

    TestModellerLogger.SetLastNodeGuid("91008dff-a94d-4433-a631-10a33f0b4411");
    _StandardToNoVAT.Enter_SchemeEffectiveDate("44221");
    

    TestModellerLogger.SetLastNodeGuid("865846cd-f217-40e2-97ae-9b8616f6e984");
    _StandardToNoVAT.Click_SaveButton();
    

    }

    @Test  (groups= {"StandardToNoVAT","StandardToNoVAT - Default Profile"})
    @TestModellerPath(guid = "82f16676-acb2-4fb8-a5f1-68ea4230256b")
    public void GoToUrlAssertUrlClickSettingsTABClickVATTABClickEditTabClickAddButtonPositiveSelectVATTypePo2()
    {
        
        pages.StandardToNoVAT _StandardToNoVAT = new pages.StandardToNoVAT(driver);
    TestModellerLogger.SetLastNodeGuid("966dec01-c823-4135-808e-d24eb2d03157");
    _StandardToNoVAT.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("6e094f84-0e86-4a07-a5eb-3e7cae1d42e1");
    _StandardToNoVAT.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("9cfa961e-ba07-4816-92ec-6f23c7648601");
    _StandardToNoVAT.Click_SettingsTAB();
    

    TestModellerLogger.SetLastNodeGuid("ff070664-6141-4cf4-8ae0-43351679f732");
    _StandardToNoVAT.Click_VATTAB();
    

    TestModellerLogger.SetLastNodeGuid("e90f4267-7405-4b6f-970b-8eb23a0d807a");
    _StandardToNoVAT.Click_EditTab();
    

    TestModellerLogger.SetLastNodeGuid("4b98baf8-36fd-4519-815e-ce754903d415");
    _StandardToNoVAT.Click_AddButton();
    

    TestModellerLogger.SetLastNodeGuid("d2bfe41d-3a6b-4f9e-80c7-ef10fda3ee16");
    _StandardToNoVAT.Select_VATType("STANDARD VAT");
    

    TestModellerLogger.SetLastNodeGuid("91008dff-a94d-4433-a631-10a33f0b4411");
    _StandardToNoVAT.Enter_SchemeEffectiveDate("44221");
    

    TestModellerLogger.SetLastNodeGuid("865846cd-f217-40e2-97ae-9b8616f6e984");
    _StandardToNoVAT.Click_SaveButton();
    

    }

    @Test  (groups= {"StandardToNoVAT","StandardToNoVAT - Default Profile"})
    @TestModellerPath(guid = "92c6bae7-a25d-4b59-9f87-e6a1840b6574")
    public void GoToUrlAssertUrlClickSettingsTABClickVATTABClickEditTabClickAddButtonPositiveSelectVATTypePo3()
    {
        
        pages.StandardToNoVAT _StandardToNoVAT = new pages.StandardToNoVAT(driver);
    TestModellerLogger.SetLastNodeGuid("966dec01-c823-4135-808e-d24eb2d03157");
    _StandardToNoVAT.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("6e094f84-0e86-4a07-a5eb-3e7cae1d42e1");
    _StandardToNoVAT.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("9cfa961e-ba07-4816-92ec-6f23c7648601");
    _StandardToNoVAT.Click_SettingsTAB();
    

    TestModellerLogger.SetLastNodeGuid("ff070664-6141-4cf4-8ae0-43351679f732");
    _StandardToNoVAT.Click_VATTAB();
    

    TestModellerLogger.SetLastNodeGuid("e90f4267-7405-4b6f-970b-8eb23a0d807a");
    _StandardToNoVAT.Click_EditTab();
    

    TestModellerLogger.SetLastNodeGuid("4b98baf8-36fd-4519-815e-ce754903d415");
    _StandardToNoVAT.Click_AddButton();
    

    TestModellerLogger.SetLastNodeGuid("d2bfe41d-3a6b-4f9e-80c7-ef10fda3ee16");
    _StandardToNoVAT.Select_VATType("FLATRATE VAT");
    

    TestModellerLogger.SetLastNodeGuid("91008dff-a94d-4433-a631-10a33f0b4411");
    _StandardToNoVAT.Enter_SchemeEffectiveDate("44221");
    

    TestModellerLogger.SetLastNodeGuid("865846cd-f217-40e2-97ae-9b8616f6e984");
    _StandardToNoVAT.Click_SaveButton();
    

    }

}
