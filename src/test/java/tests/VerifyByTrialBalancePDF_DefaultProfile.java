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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/51f18dcd-1e31-4f06-ae83-3a5374b47dd9
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1050, profileId = 100951)
public class VerifyByTrialBalancePDF_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"VerifyByTrialBalancePDF","VerifyByTrialBalancePDF - Default Profile"})
    @TestModellerPath(guid = "f06fe423-e313-4cc3-b249-4f95877f489e")
    public void GoToUrlAssertUrlClickReportsTABClickTrialBalanceTABClickPDFDump()
    {
        
        pages.VerifyByTrialBalancePDF _VerifyByTrialBalancePDF = new pages.VerifyByTrialBalancePDF(driver);
    TestModellerLogger.SetLastNodeGuid("3236d61f-0767-4e97-973b-94eaa34a189d");
    _VerifyByTrialBalancePDF.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("cb6f9056-9ec0-4678-9e74-ecd325a37b65");
    _VerifyByTrialBalancePDF.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("565ebe39-4204-4fa5-9f4c-25070f6c687b");
    _VerifyByTrialBalancePDF.Click_ReportsTAB();
    

    TestModellerLogger.SetLastNodeGuid("38736f1c-ac82-44de-b6ea-ffaacc8fec85");
    _VerifyByTrialBalancePDF.Click_TrialBalanceTAB();
    

    TestModellerLogger.SetLastNodeGuid("4d4cdbcb-fd4d-4b02-ab19-6c424e232674");
    _VerifyByTrialBalancePDF.Click_PDFDump();
    

    }

}
