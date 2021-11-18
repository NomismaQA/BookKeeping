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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/3ab1e0b6-4b5f-434b-adfa-ab7e87651948
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 975, profileId = 100867)
public class VATReturn1stVATReturnReport_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"VATReturn1stVATReturnReport","VATReturn1stVATReturnReport - Default Profile"})
    @TestModellerPath(guid = "44e89d87-1b1b-402e-8e69-7c454a01c36b")
    public void GoToUrlAssertUrlClickVATReturnsTABClickSettingTABClickVATReturnReportClickDownloadReturnReport() throws InterruptedException, HeadlessException, IOException, AWTException
    {
        
        pages.VATReturn1stVATReturnReport _VATReturn1stVATReturnReport = new pages.VATReturn1stVATReturnReport(driver);
    TestModellerLogger.SetLastNodeGuid("1f9cfbdc-c35f-4a18-b1be-f70e9bb456c8");
    _VATReturn1stVATReturnReport.GoToUrl();
    
    

    TestModellerLogger.SetLastNodeGuid("30fb0358-7a58-4e43-8013-f8cdaf9914d0");
    _VATReturn1stVATReturnReport.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("7c81e8c0-e177-491c-a441-a01d789ff0fa");
    _VATReturn1stVATReturnReport.Click_VATReturnsTAB();
    

    TestModellerLogger.SetLastNodeGuid("cb9cd54f-a2b2-40b3-b845-54c49d333854");
    _VATReturn1stVATReturnReport.Click_SettingTAB();
    

    TestModellerLogger.SetLastNodeGuid("df3f386c-b63c-44ff-b704-acbd9eeaf56b");
    _VATReturn1stVATReturnReport.Click_VATReturnReport();
    

    TestModellerLogger.SetLastNodeGuid("5f8d8e85-edcc-47c9-a904-c82deec4e161");
    _VATReturn1stVATReturnReport.Click_DownloadReturnReportPDF();
    

    TestModellerLogger.SetLastNodeGuid("651ce399-df59-49c6-9332-d68d27008348");
    _VATReturn1stVATReturnReport.Click_PDF();
    

    TestModellerLogger.SetLastNodeGuid("83a931cb-c9bc-4447-9488-90d6ad08bb2e");
    _VATReturn1stVATReturnReport.Click__VATReturnReportClose();
    

    }

}
