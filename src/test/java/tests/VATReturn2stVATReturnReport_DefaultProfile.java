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
import utilities.ChangeWindow;
import utilities.ExcelUtility;
import utilities.testmodeller.TestModellerLogger;

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/5c4abe96-7c17-4c6f-a857-bd7bc158292b
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 977, profileId = 100868)
public class VATReturn2stVATReturnReport_DefaultProfile extends TestBase
{
	

    
    @Test  (groups= {"VATReturn2stVATReturnReport","VATReturn2stVATReturnReport - Default Profile"})
    @TestModellerPath(guid = "2d5d4fe6-ec11-406e-a789-03b86b2e6ce0")
    public void GoToUrlAssertUrlClickVATReturnsTAB2ClickSettingTab2ClickVATReturnBackupReportClickDownloadVATR() throws InvalidFormatException
    {
    	
        
        pages.VATReturn2stVATReturnReport _VATReturn2stVATReturnReport = new pages.VATReturn2stVATReturnReport(driver);
    TestModellerLogger.SetLastNodeGuid("575d6d54-f8f3-46ae-86f4-44bbb4110820");
    
    _VATReturn2stVATReturnReport.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("5783c53f-8aa4-434c-9fda-b7cf007f2190");
    _VATReturn2stVATReturnReport.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("21719f97-70cf-400b-841d-fcd475e03ef5");
    _VATReturn2stVATReturnReport.Click_VATReturnsTAB2();
    

    TestModellerLogger.SetLastNodeGuid("49135dbe-f8dd-4acd-9409-1debc577f7b8");
    _VATReturn2stVATReturnReport.Click_SettingTab2();
    

    TestModellerLogger.SetLastNodeGuid("b488bec7-fb80-418d-8dc7-0900b85c7edc");
    _VATReturn2stVATReturnReport.Click_VATReturnBackupReport();
    

    TestModellerLogger.SetLastNodeGuid("0c8031b0-9c4a-476d-bbe8-18cc99d8d3f9");
    _VATReturn2stVATReturnReport.Click_DownloadVATReturnBackupReport();
    

    TestModellerLogger.SetLastNodeGuid("c52ffb87-ef26-4e2f-8f01-55c75ec823b6");
    _VATReturn2stVATReturnReport.Click__VATReturnBackupReportClose();
    

    }

}
