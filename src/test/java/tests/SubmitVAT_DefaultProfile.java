package tests;

import reports.TestNGListener;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ie.curiositysoftware.allocation.dto.ResultMergeMethod;
import ie.curiositysoftware.allocation.dto.DataAllocationRow;
import reports.ExtentTestListener;
import ie.curiositysoftware.allocation.dto.DataAllocationResult;
import ie.curiositysoftware.allocation.engine.DataAllocation;
import utilities.ExcelUtility;
import utilities.testmodeller.TestModellerLogger;

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/72348cb5-7b70-4bf2-b08b-7e14a89bcc7c
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1505, profileId = 101448)
public class SubmitVAT_DefaultProfile extends TestBase
{
	String sTestCaseID=null;
	String[] data=null;
	String Sheet = null;
    

    
    @Test  (groups= {"SubmitVAT","SubmitVAT - Default Profile"})
    @TestModellerPath(guid = "7e571dd2-3fd0-4cfd-80a7-d6b4edee55c6")
    public void GoToUrlAssertUrlClickClickOnEditLinkClickVATReturnsTABClickSaveContinueClickMarkasFiled() throws InvalidFormatException
    {
    	sTestCaseID="TC204";
    	Sheet="VAT3_ExpenseRein";
    	data = ExcelUtility.toReadExcelData(sTestCaseID, Sheet);
        
        pages.SubmitVAT _SubmitVAT = new pages.SubmitVAT(driver);
    TestModellerLogger.SetLastNodeGuid("15f9fa4a-8532-4032-b0bf-cafbb3b4e392");
    _SubmitVAT.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("935de893-b654-454a-b8a7-b14007778b92");
    _SubmitVAT.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("0f96de08-35de-4dce-970d-0a6ddc281f00");
    _SubmitVAT.Click_ClickOnEditLink();
    

    TestModellerLogger.SetLastNodeGuid("e82ad76f-ea2f-4a04-943b-aaf520f978d0");
    _SubmitVAT.Click_VATReturnsTAB();
    

    TestModellerLogger.SetLastNodeGuid("e82d1a89-7cd9-4dd7-87c2-1c9887ff7252");
    _SubmitVAT.Click_SaveContinue();
    

    TestModellerLogger.SetLastNodeGuid("39a36972-765d-4cda-8ecb-33e496954625");
    _SubmitVAT.Click_MarkasFiled();
    

    }

}
