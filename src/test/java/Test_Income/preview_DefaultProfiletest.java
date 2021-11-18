package Test_Income;

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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/652fe7f8-c057-4d4d-97ab-4076a128fbfd
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1455, profileId = 101335)
public class preview_DefaultProfiletest extends TestBase
{
    
    
    @Test  (groups= {"preview","preview - Default Profile"})
    @TestModellerPath(guid = "4bfb0521-cd16-4c39-8951-0a0814f8df14")
    public void GoToUrlAssertUrlClickClickeyeiconClicksaveicon() throws InterruptedException
    {
        
    	Pages_Income.preview _preview = new  Pages_Income.preview (driver);
    TestModellerLogger.SetLastNodeGuid("58360469-e285-4b81-88e5-161658be4bbb");
    _preview.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("ba5b548d-d4bc-40f8-b170-d1600beb12c6");
    _preview.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c8fe61d-dd6a-4afb-b3bc-dbc9989b820c");
    _preview.Click_Clickeyeicon();
    

    TestModellerLogger.SetLastNodeGuid("74271fdb-c684-467b-9fb4-2789c62a2612");
    _preview.Click_save_icon();
    

    }

}
