package tests;

import reports.TestNGListener;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;
import pages.VerifyByTrialBalance;

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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/69b94e99-8842-426a-89be-8c6ca6404a61
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1046, profileId = 100948)
public class VerifyByTrialBalance_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"VerifyByTrialBalance","VerifyByTrialBalance - Default Profile"})
    @TestModellerPath(guid = "011288f2-fe59-4e62-b16c-21b54384299a")
    public void GoToUrlAssertUrlClickReportsTABClickTrialBalanceTABClickCSVDump1() throws HeadlessException, IOException, AWTException, InterruptedException
    {
        
        pages.VerifyByTrialBalance _VerifyByTrialBalance = new pages.VerifyByTrialBalance(driver);
    TestModellerLogger.SetLastNodeGuid("264edf50-375e-4e3b-bf48-0b0d78ecec16");
    _VerifyByTrialBalance.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("48dbc598-c20b-4456-b887-4f451bcc64d3");
    _VerifyByTrialBalance.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("b9b0321f-0a01-4d51-98e8-964513aba025");
    _VerifyByTrialBalance.Click_ReportsTAB();
    

    TestModellerLogger.SetLastNodeGuid("1b2f2967-82e7-429c-932a-d571aef95fc3");
    _VerifyByTrialBalance.Click_TrialBalanceTAB();
    

    TestModellerLogger.SetLastNodeGuid("4e339e9a-c3e6-400d-9671-cd34c0967c10");
    _VerifyByTrialBalance.Click_CSVDump1();
    

    }

}
