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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/67118568-b8ae-45f8-8f07-ae07d72b5731
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1008, profileId = 100907)
public class VerifyAddRecord_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"VerifyAddRecord","VerifyAddRecord - Default Profile"})
    @TestModellerPath(guid = "13447e0f-1569-4b3f-9ac3-1bef8340661b")
    public void GoToUrlAssertUrlClickSalesTabClickRecordsClickRecordClose() throws HeadlessException, IOException, AWTException, InterruptedException
    {
        
        pages.VerifyAddRecord _VerifyAddRecord = new pages.VerifyAddRecord(driver);
    TestModellerLogger.SetLastNodeGuid("c1af006d-61b4-4851-b1fa-af01732a458f");
    _VerifyAddRecord.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("0ca83340-b6b0-4893-abfc-033879ff0154");
    _VerifyAddRecord.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("540a5336-360c-41f2-a645-3089bfec0071");
    _VerifyAddRecord.Click_SalesTab();
    

    TestModellerLogger.SetLastNodeGuid("a8340616-6c9e-40ed-bd92-1fd8427819e5");
    _VerifyAddRecord.Click_Records();
    

//    TestModellerLogger.SetLastNodeGuid("9ddbe8c6-38e2-4aa8-8620-02c94744a128");
//    _VerifyAddRecord.Click__RecordClose();
//    

    }

}
