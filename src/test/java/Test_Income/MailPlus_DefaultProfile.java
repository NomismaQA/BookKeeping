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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/3ac18957-7867-4610-8d7d-2bdb5fa3884a
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1778, profileId = 102225)
public class MailPlus_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"MailPlus","MailPlus - Default Profile"})
    @TestModellerPath(guid = "0794371d-d2e8-40eb-a60f-012c48a133a3")
    public void GoToUrlAssertUrlClickPlusSignPositiveSelectInvoiceTemplateEnterHeaderLine1EnterHeaderLine2Ent() throws InterruptedException
    {
        
    	Pages_Income.MailPlus _MailPlus = new Pages_Income.MailPlus(driver);
    TestModellerLogger.SetLastNodeGuid("af1e3e3f-a66b-4397-afdb-2b2dc2734325");
    _MailPlus.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("a249bd4d-efff-4dd8-b352-f74cc0b15a3b");
    _MailPlus.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("df98e0de-b4de-42a8-bef8-4d76827c39e9");
    _MailPlus.Click_Plus_Sign();
    

    TestModellerLogger.SetLastNodeGuid("cde98790-4e81-4ee7-9612-3bd6c8188e38");
    _MailPlus.Select_InvoiceTemplate("Header Footer Image Template");
    

    TestModellerLogger.SetLastNodeGuid("7c1d29d8-df32-42a3-9c7b-6af469add329");
    _MailPlus.Enter_HeaderLine1("");
    

    TestModellerLogger.SetLastNodeGuid("5bd4ae7a-e3d2-46ef-bc5c-e4f2b6f2770a");
    _MailPlus.Enter_HeaderLine2("");
    

    TestModellerLogger.SetLastNodeGuid("c58edab4-653a-415f-a41f-f916b9f21be5");
    _MailPlus.Enter_FooterLine1("");
    

    TestModellerLogger.SetLastNodeGuid("f5ff114f-f3af-45ee-8cf6-416395746302");
    _MailPlus.Enter_FooterLine2("");
    

    TestModellerLogger.SetLastNodeGuid("209bb10c-4604-40ed-8329-89b989c895a9");
    _MailPlus.Click_ValidTags();
    

    TestModellerLogger.SetLastNodeGuid("5b958c13-72ff-4278-80e1-9b4b86f73b61");
    _MailPlus.Click_SaveButton();
    

    }

}