package tests.Bank_Upload_CSV;

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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/5deb9402-a322-4e32-808b-acc08a1bb80a
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1830, profileId = 102327)
public class acperioidlock_Lock extends TestBase
{
    

    
    @Test  (groups= {"ac_perioid_lock","ac_perioid_lock - Lock"})
    @TestModellerPath(guid = "3e5cc029-c02e-426b-85e2-f12033eb0fc4")
    public void GoToUrlClicksSettingsClickAccountingPeriodClickEditClick()
    {
        
        pages.Bank_UploadCSV.ACperiodlok _ACperiodlok = new pages.Bank_UploadCSV.ACperiodlok(driver);
    TestModellerLogger.SetLastNodeGuid("b4831f90-b5f1-443a-be26-c5bb7f9c01a1");
    _ACperiodlok.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3459d144-fb00-498b-9858-a1d091b2872f");
    _ACperiodlok.Click_SettingsTab();
    

    TestModellerLogger.SetLastNodeGuid("32f01c04-fd5d-478c-bdeb-f5315efc8514");
    _ACperiodlok.Click_Accounting_Period();
    

    TestModellerLogger.SetLastNodeGuid("c04631d8-2cc9-463c-b235-32dbb645effa");
    _ACperiodlok.Click__Editbutton();
    

    TestModellerLogger.SetLastNodeGuid("8539b4b1-6840-400c-9f41-3a25ee9ada98");
    _ACperiodlok.Click__LAP_TAB();
    

    }

}