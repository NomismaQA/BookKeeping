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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/6ed4682b-85da-4bba-a470-d1786165fc39
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 993, profileId = 100888)
public class VATReturn3rdVATRetrunReport_DefaultProfile extends TestBase
{
	
	String sTestCaseID=null;
	String[] data=null;
	String Sheet = null;
	

    
    @Test  (groups= {"VATReturn3rdVATRetrunReport","VATReturn3rdVATRetrunReport - Default Profile"})
    @TestModellerPath(guid = "688505f0-99b7-45f8-bbfd-70d31ba514a2")
    public void GoToUrlAssertUrlClickVATReturnsClickSettingsTABClickVATReturnReportTABClickDownLoadLinkClickP() throws InvalidFormatException
    {
        
    	sTestCaseID="TC1";
    	Sheet="Sale_NewInvoice";
    	data = ExcelUtility.toReadExcelData(sTestCaseID, Sheet);
    	
        pages.VATReturn3rdVATRetrunReport _VATReturn3rdVATRetrunReport = new pages.VATReturn3rdVATRetrunReport(driver);
    TestModellerLogger.SetLastNodeGuid("4def1fd0-159a-438c-923f-b533feef9558");
    _VATReturn3rdVATRetrunReport.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("8c630d5c-8762-4ec9-9817-4841428a2bb8");
    _VATReturn3rdVATRetrunReport.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("b9664ea4-797d-42b0-aaa5-91e5e63868e5");
    _VATReturn3rdVATRetrunReport.Click__VAT_Returns_();
    

    TestModellerLogger.SetLastNodeGuid("c9648fad-a8df-454a-b978-f289b2d9ad43");
    _VATReturn3rdVATRetrunReport.Click_SettingsTAB();
    

    TestModellerLogger.SetLastNodeGuid("0fbe2754-ff07-48b5-9eba-62d27ad2c158");
    _VATReturn3rdVATRetrunReport.Click_VATReturnReportTAB();
    

    TestModellerLogger.SetLastNodeGuid("aa0261eb-3bee-45f1-8d96-b15ed02c4bdc");
    _VATReturn3rdVATRetrunReport.Click_DownLoadLink();
    

    TestModellerLogger.SetLastNodeGuid("c2605320-1dd6-42c3-aca6-d07eb87b9080");
    _VATReturn3rdVATRetrunReport.Click_PDFOption();
    

    TestModellerLogger.SetLastNodeGuid("ac28e009-0bef-4304-b299-83ae3b2bcbb3");
    _VATReturn3rdVATRetrunReport.Click__VATReturnReportClose();
    

    }

}
