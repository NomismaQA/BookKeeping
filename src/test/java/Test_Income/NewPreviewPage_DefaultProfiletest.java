package Test_Income;

import reports.TestNGListener;
import tests.TestBase;
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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/a56d7f52-12d3-469f-ad9d-f752870e8379
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1469, profileId = 101341)
public class NewPreviewPage_DefaultProfiletest extends TestBase
{
    

    
    @Test  (groups= {"NewPreviewPage","NewPreviewPage - Default Profile"})
    @TestModellerPath(guid = "5de2b20b-b8d1-41d8-9713-d3be134556c9")
    public void GoToUrlAssertUrlClickClickOnPreviewClickSaveButtonClickPDFDumpClickCancelButtonClickClickOnMa() throws InterruptedException, HeadlessException, IOException, AWTException
    {
        
    	Pages_Income.NewPreviewPage _NewPreviewPage = new Pages_Income.NewPreviewPage (driver);
    TestModellerLogger.SetLastNodeGuid("dbbb77d9-da5b-418b-8bf9-81bcb95327cf");
    _NewPreviewPage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("d7e4fdde-c2c7-46a8-83a5-5be45ffa1225");
    _NewPreviewPage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("715cfaaf-aba7-40a9-82e6-410e09784e97");
    _NewPreviewPage.Click_ClickOnPreview();
    

    TestModellerLogger.SetLastNodeGuid("23d6006a-2648-4df5-a3f3-c2e17c157827");
    _NewPreviewPage.Click_SaveButton();
    

    TestModellerLogger.SetLastNodeGuid("54b70d53-1986-4341-b00c-5f332860cd9d");
    _NewPreviewPage.Click_PDFDump();
    

    TestModellerLogger.SetLastNodeGuid("c672a06c-43df-4da3-b0e6-c89aec1ad026");
    _NewPreviewPage.Click_CancelButton();
    

    TestModellerLogger.SetLastNodeGuid("ad68166f-4045-401c-85cf-3a60a429becd");
    _NewPreviewPage.Click_ClickOnMail();
    

    }

}
