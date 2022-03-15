package Test_Trial_Balance_Report;

import reports.TestNGListener;
import tests.TestBase;
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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/62a87ffb-80db-485a-85db-d57723865202
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1899, profileId = 102492)
public class TrailBalanceReport_TestCases extends TestBase
{
    

    
    @Test  (groups= {"Test_Trail_Balance_Report","Test_Trail_Balance_Report - Test Cases"})
    @TestModellerPath(guid = "3da25f43-b63b-4724-8b16-553439ac19e0")
    public void ClickReportsClickTrialBalancePositiveSelectSelectCompareTo3PositiveEnterEnterDateFrom4EnterEnte() throws InterruptedException
    {
        
    	Trial_Balance.Pages_TrailBalancereport _Pages_TrailBalancereport = new Trial_Balance.Pages_TrailBalancereport(driver);
    TestModellerLogger.SetLastNodeGuid("863019ea-a567-4a80-818a-de09361d2451");
    _Pages_TrailBalancereport.Click__Reports_();
    

    TestModellerLogger.SetLastNodeGuid("f852c836-f8c0-4074-9e4e-97622dcbba0e");
    _Pages_TrailBalancereport.Click_Trial_Balance();
    

    TestModellerLogger.SetLastNodeGuid("abc4a879-d2a9-488f-810e-9389b3abf07d");
    _Pages_TrailBalancereport.Select_Select_CompareTo_3("End of This Financial Year");
    

    TestModellerLogger.SetLastNodeGuid("591564cd-f922-49a8-845f-d0d27a343127");
    _Pages_TrailBalancereport.Enter_Enter_DateFrom_4("44545");
    

    TestModellerLogger.SetLastNodeGuid("56fee559-eaff-416c-adbf-f3568aaa7ac9");
    _Pages_TrailBalancereport.Enter_Enter_CompareWith_5("1122");
    

    TestModellerLogger.SetLastNodeGuid("8f279cda-136e-460b-8de5-4bf9479dd92e");
    _Pages_TrailBalancereport.Click_Update_6();
    

    TestModellerLogger.SetLastNodeGuid("82ef5f23-22a7-4088-97b1-0b115f4cd94a");
    _Pages_TrailBalancereport.Click_Show_Detail_7();
    

    TestModellerLogger.SetLastNodeGuid("2afd176b-6534-4f2a-92e0-ad9abd52ad58");
    _Pages_TrailBalancereport.Click_Export_CSV_8();
    

    TestModellerLogger.SetLastNodeGuid("76293cf2-9e97-404e-bc1d-1a8e5cb06826");
    _Pages_TrailBalancereport.Click_Exports_PDF_9();
    

    }

}