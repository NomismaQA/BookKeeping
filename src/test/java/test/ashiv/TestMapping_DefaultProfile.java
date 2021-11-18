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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/c3f92296-d5f5-46ac-9ad3-94ec0c045020
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1840, profileId = 102360)
public class TestMapping_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"Test_Mapping","Test_Mapping - Default Profile"})
    @TestModellerPath(guid = "f089585f-76c8-4a2a-8a04-7d3931f3da41")
    public void ClickAdvisorTools1ClickImportTrialBalance2ClickUpload4ClickNext8ClickMas9ClickAddentry10Click() throws InterruptedException
    {
        
        pages.banking.ashiv.TrialBalance _TrialBalance = new  pages.banking.ashiv.TrialBalance(driver);
    TestModellerLogger.SetLastNodeGuid("5923dbf4-8fbb-41f4-8513-9225273ef446");
    _TrialBalance.Click_Advisor_Tools_1();
    

    TestModellerLogger.SetLastNodeGuid("97bc4db5-06c4-442f-b325-9ae6fd93052a");
    _TrialBalance.Click_Import_Trial_Balance2();
    

    TestModellerLogger.SetLastNodeGuid("09526522-582d-4f13-8e40-c19a0eaf927e");
    _TrialBalance.Click_Upload4();
    

    TestModellerLogger.SetLastNodeGuid("6e9d1b1e-9f00-4122-8c82-7995952f8442");
    _TrialBalance.Click_Next8();
    

    TestModellerLogger.SetLastNodeGuid("86986ecc-c97d-4f38-adf8-3134538f27e4");
    _TrialBalance.Click_Mas9();
    

    
    

    TestModellerLogger.SetLastNodeGuid("6e522f40-af05-4d89-bf8d-9eb1b476a33d");
    _TrialBalance.Click_RemoveEntry11();
    

    TestModellerLogger.SetLastNodeGuid("7f979133-b62d-4d2d-8968-e56b28f21f0a");
    _TrialBalance.Click_Import12();
    

    TestModellerLogger.SetLastNodeGuid("b2882e60-da8e-4923-b370-36050cefe656");
    _TrialBalance.Click_Msg13();
    

    }

}