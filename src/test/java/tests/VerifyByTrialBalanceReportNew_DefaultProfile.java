package tests;

import reports.TestNGListener;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.IOException;

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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/dd69c0cd-784a-4704-b513-230bfc4c7d2c
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1055, profileId = 100957)
public class VerifyByTrialBalanceReportNew_DefaultProfile extends TestBase
{
	

    
    @Test  (groups= {"VerifyByTrialBalanceReportNew","VerifyByTrialBalanceReportNew - Default Profile"})
    @TestModellerPath(guid = "74e15931-9b2f-42a0-894f-9a8509a77e3e")
    public void GoToUrlAssertUrlClickReportsTABClickTrialBalanceClick31Dec2021Click280000Click25000() throws InvalidFormatException, HeadlessException, IOException, AWTException
    {
    
        
        pages.VerifyByTrialBalanceReportNew _VerifyByTrialBalanceReportNew = new pages.VerifyByTrialBalanceReportNew(driver);
    TestModellerLogger.SetLastNodeGuid("32edf43e-eef8-4b1b-b476-c73e31c0e0dd");
    _VerifyByTrialBalanceReportNew.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("11ba86a1-94b2-4ea4-aa97-bebc328dcf80");
    _VerifyByTrialBalanceReportNew.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8131f2a6-1cd7-4563-977a-53240d99ed78");
    _VerifyByTrialBalanceReportNew.Click_ReportsTAB();
    

    TestModellerLogger.SetLastNodeGuid("00ae12e0-ffa4-4cc0-a12a-958c710c501f");
    _VerifyByTrialBalanceReportNew.Click_TrialBalance();
    

    TestModellerLogger.SetLastNodeGuid("96e2ddcb-6ea4-48d5-ae86-c778ba30cfb8");
    _VerifyByTrialBalanceReportNew.Click__31_Dec_2021();
    

    TestModellerLogger.SetLastNodeGuid("ac8428f1-2dc1-4e70-ba10-840c3a9077ef");
    _VerifyByTrialBalanceReportNew.Click__280000_();
    

    TestModellerLogger.SetLastNodeGuid("9d0944cd-d4f3-46eb-beb0-95a34ea0b0ca");
    _VerifyByTrialBalanceReportNew.Click__25000();
    

    }

}
