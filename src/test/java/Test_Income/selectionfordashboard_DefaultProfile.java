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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/2390ff4c-42ef-4dc3-8e06-de72e2a1dadd
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1800, profileId = 102273)
public class selectionfordashboard_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"selectionfordashboard","selectionfordashboard - Default Profile"})
    @TestModellerPath(guid = "fc1df780-7d5f-49a6-8086-5e89acc3df35")
    public void GoToUrlAssertUrlPositiveSelectselectCustomerPositiveSelectSearchcategoryClickSelectAllPositive() throws InterruptedException
    {
        
    	Pages_Income.selectionfordashboard _selectionfordashboard = new Pages_Income.selectionfordashboard(driver);
    TestModellerLogger.SetLastNodeGuid("85a32d47-d31d-4b26-a831-a242fce9dde5");
    _selectionfordashboard.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("9fe8e556-0a60-41c8-b173-da064c2a89c2");
    _selectionfordashboard.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("634f438f-bc4a-4129-b016-345a82baa51b");
    _selectionfordashboard.Select_selectCustomer("cust1");
    

    TestModellerLogger.SetLastNodeGuid("eb58f6d8-10d9-48bb-8e14-40d2fcf301f4");
    _selectionfordashboard.Select_Searchcategory("Tran#");
    

    TestModellerLogger.SetLastNodeGuid("3d2e0873-38c4-4c0d-95ce-37a7d926b30a");
    _selectionfordashboard.Click_Select_All_();
    

    TestModellerLogger.SetLastNodeGuid("84978a99-01c0-4a17-bffc-39d9b9bc16d9");
    _selectionfordashboard.Select_Due_Status("All");
    

    TestModellerLogger.SetLastNodeGuid("bbc8b2fa-4807-4c9a-8aee-71a2ad73b247");
    _selectionfordashboard.Enter_DateFrom("44440");
    

    TestModellerLogger.SetLastNodeGuid("ad183bfe-0b4d-42b2-8a0e-5fe8fd263317");
    _selectionfordashboard.Enter_DateTo("44440");
    

    TestModellerLogger.SetLastNodeGuid("929122f7-0132-4c0e-9eae-d33a3fa657dc");
    _selectionfordashboard.Click_Update_();
    

    }

}