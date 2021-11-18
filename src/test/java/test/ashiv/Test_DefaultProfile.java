package test.ashiv;

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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/afe751c4-4a69-458e-97b6-8c49178e1b83
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1836, profileId = 102342)
public class Test_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"Test","Test - Default Profile"})
    @TestModellerPath(guid = "11a2e65f-6dc9-475f-a009-462410efd04a")
    public void ClickClickSearchClickSearchClickSearch()
    {
        
        pages.banking.ashiv.findMatch _findMatch = new pages.banking.ashiv.findMatch(driver);
        
      TestModellerLogger.SetLastNodeGuid("325f9c0f-2f1f-48ea-91ad-39c11a0a6640");
    _findMatch.Click__();
    

    TestModellerLogger.SetLastNodeGuid("0e179d2c-583c-4554-8540-595d2b10891d");
    _findMatch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("be41c6ce-d702-4e0a-902f-32f7d6ee03e1");
    _findMatch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("526f9221-668c-4ba3-a003-6e02ad21b30c");
    _findMatch.Click_Search();
    

    }

}