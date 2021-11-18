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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/a4939bc3-94e7-4a72-89a4-6857d021667e
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1454, profileId = 101299)
public class Email_DefaultProfiletest extends TestBase
{
    

    
    @Test  (groups= {"E_mail","E_mail - Default Profile"})
    @TestModellerPath(guid = "d30f948f-9e30-4024-9c2a-1abf2f80cd8e")
    public void GoToUrlAssertUrlPositiveSelectSelectInvoiceTempPositiveSelectEmailTemplateEnterEntermailidEnte1() throws HeadlessException, IOException, AWTException, InterruptedException
    {
        
    	Pages_Income.mailspage _mails = new Pages_Income.mailspage(driver);
    TestModellerLogger.SetLastNodeGuid("a51e0f3b-19dd-45ae-9370-d3609e2e0894");
    _mails.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3660f942-cc68-4cef-bb82-82cb35bc37d8");
    _mails.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("42ab91d4-7379-4404-a11e-6a50d2ca8760");
    _mails.Select_Select_InvoiceTemp("Standard Invoice Template");
    

    TestModellerLogger.SetLastNodeGuid("3a1cbf88-20ac-48ea-be7c-61c45d03bf6e");
    _mails.Select_Email_Template("Send Invoice");
    

    TestModellerLogger.SetLastNodeGuid("2192c6c5-80e8-48b1-8207-cd86f583f7c6");
    _mails.Enter_Enter_mailid(null);
    

    TestModellerLogger.SetLastNodeGuid("9942e2fa-2b79-4968-876b-4883effef066");
    _mails.Enter_Enter_Subject("");
    

    TestModellerLogger.SetLastNodeGuid("f8d8b4d0-e489-4043-8848-c64ac08e4975");
    _mails.Click_Sendbtn_clicked();
    

    TestModellerLogger.SetLastNodeGuid("cff924d0-3f00-4dd0-abb5-64fbf61324ee");
    _mails.Click_confirmation_msges();
    

    }

    @Test  (groups= {"E_mail","E_mail - Default Profile"})
    @TestModellerPath(guid = "1b269799-d5d3-422d-8165-520c9902105b")
    public void GoToUrlAssertUrlPositiveSelectSelectInvoiceTempPositiveSelectEmailTemplateEnterEntermailidEnte2() throws HeadlessException, IOException, AWTException, InterruptedException
    {
        
    	Pages_Income.mailspage _mails = new Pages_Income.mailspage(driver);
    TestModellerLogger.SetLastNodeGuid("a51e0f3b-19dd-45ae-9370-d3609e2e0894");
    _mails.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3660f942-cc68-4cef-bb82-82cb35bc37d8");
    _mails.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("42ab91d4-7379-4404-a11e-6a50d2ca8760");
    _mails.Select_Select_InvoiceTemp("Standard Invoice Template");
    

    TestModellerLogger.SetLastNodeGuid("3a1cbf88-20ac-48ea-be7c-61c45d03bf6e");
    _mails.Select_Email_Template("Send Credit Note");
    

    TestModellerLogger.SetLastNodeGuid("2192c6c5-80e8-48b1-8207-cd86f583f7c6");
    _mails.Enter_Enter_mailid("");
    

    TestModellerLogger.SetLastNodeGuid("9942e2fa-2b79-4968-876b-4883effef066");
    _mails.Enter_Enter_Subject("");
    

    TestModellerLogger.SetLastNodeGuid("f8d8b4d0-e489-4043-8848-c64ac08e4975");
    _mails.Click_Sendbtn_clicked();
    

    TestModellerLogger.SetLastNodeGuid("cff924d0-3f00-4dd0-abb5-64fbf61324ee");
    _mails.Click_confirmation_msges();
    

    }

    @Test  (groups= {"E_mail","E_mail - Default Profile"})
    @TestModellerPath(guid = "3be8b341-88bb-4bf5-8b1f-73736ac03cb7")
    public void GoToUrlAssertUrlPositiveSelectSelectInvoiceTempPositiveSelectEmailTemplateEnterEntermailidEnte3() throws HeadlessException, IOException, AWTException, InterruptedException
    {
        
    	Pages_Income.mailspage _mails = new Pages_Income.mailspage(driver);
    TestModellerLogger.SetLastNodeGuid("a51e0f3b-19dd-45ae-9370-d3609e2e0894");
    _mails.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3660f942-cc68-4cef-bb82-82cb35bc37d8");
    _mails.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("42ab91d4-7379-4404-a11e-6a50d2ca8760");
    _mails.Select_Select_InvoiceTemp("Header Footer Image Template");
    

    TestModellerLogger.SetLastNodeGuid("3a1cbf88-20ac-48ea-be7c-61c45d03bf6e");
    _mails.Select_Email_Template("Send Invoice");
    

    TestModellerLogger.SetLastNodeGuid("2192c6c5-80e8-48b1-8207-cd86f583f7c6");
    _mails.Enter_Enter_mailid("");
    

    TestModellerLogger.SetLastNodeGuid("9942e2fa-2b79-4968-876b-4883effef066");
    _mails.Enter_Enter_Subject("");
    

    TestModellerLogger.SetLastNodeGuid("f8d8b4d0-e489-4043-8848-c64ac08e4975");
    _mails.Click_Sendbtn_clicked();
    

    TestModellerLogger.SetLastNodeGuid("cff924d0-3f00-4dd0-abb5-64fbf61324ee");
    _mails.Click_confirmation_msges();
    

    }

    @Test  (groups= {"E_mail","E_mail - Default Profile"})
    @TestModellerPath(guid = "aaf5463f-6950-4e0c-b092-910a781e93f8")
    public void GoToUrlAssertUrlPositiveSelectSelectInvoiceTempPositiveSelectEmailTemplateEnterEntermailidEnte4() throws HeadlessException, IOException, AWTException, InterruptedException
    {
        
    	Pages_Income.mailspage _mails = new Pages_Income.mailspage(driver);
    TestModellerLogger.SetLastNodeGuid("a51e0f3b-19dd-45ae-9370-d3609e2e0894");
    _mails.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3660f942-cc68-4cef-bb82-82cb35bc37d8");
    _mails.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("42ab91d4-7379-4404-a11e-6a50d2ca8760");
    _mails.Select_Select_InvoiceTemp("Portal Invoice Template#1");
    

    TestModellerLogger.SetLastNodeGuid("3a1cbf88-20ac-48ea-be7c-61c45d03bf6e");
    _mails.Select_Email_Template("Send Invoice");
    

    TestModellerLogger.SetLastNodeGuid("2192c6c5-80e8-48b1-8207-cd86f583f7c6");
    _mails.Enter_Enter_mailid("");
    

    TestModellerLogger.SetLastNodeGuid("9942e2fa-2b79-4968-876b-4883effef066");
    _mails.Enter_Enter_Subject("");
    

    TestModellerLogger.SetLastNodeGuid("f8d8b4d0-e489-4043-8848-c64ac08e4975");
    _mails.Click_Sendbtn_clicked();
    

    TestModellerLogger.SetLastNodeGuid("cff924d0-3f00-4dd0-abb5-64fbf61324ee");
    _mails.Click_confirmation_msges();
    

    }

    @Test  (groups= {"E_mail","E_mail - Default Profile"})
    @TestModellerPath(guid = "220f693c-e07b-45b8-867e-f7263fd25f73")
    public void GoToUrlAssertUrlPositiveSelectSelectInvoiceTempPositiveSelectEmailTemplateEnterEntermailidEnte5() throws HeadlessException, IOException, AWTException, InterruptedException
    {
        
    	Pages_Income.mailspage _mails = new Pages_Income.mailspage(driver);
    TestModellerLogger.SetLastNodeGuid("a51e0f3b-19dd-45ae-9370-d3609e2e0894");
    _mails.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3660f942-cc68-4cef-bb82-82cb35bc37d8");
    _mails.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("42ab91d4-7379-4404-a11e-6a50d2ca8760");
    _mails.Select_Select_InvoiceTemp("Custom Template");
    

    TestModellerLogger.SetLastNodeGuid("3a1cbf88-20ac-48ea-be7c-61c45d03bf6e");
    _mails.Select_Email_Template("Send Invoice");
    

    TestModellerLogger.SetLastNodeGuid("2192c6c5-80e8-48b1-8207-cd86f583f7c6");
    _mails.Enter_Enter_mailid("");
    

    TestModellerLogger.SetLastNodeGuid("9942e2fa-2b79-4968-876b-4883effef066");
    _mails.Enter_Enter_Subject("");
    

    TestModellerLogger.SetLastNodeGuid("f8d8b4d0-e489-4043-8848-c64ac08e4975");
    _mails.Click_Sendbtn_clicked();
    

    TestModellerLogger.SetLastNodeGuid("cff924d0-3f00-4dd0-abb5-64fbf61324ee");
    _mails.Click_confirmation_msges();
    

    }

    @Test  (groups= {"E_mail","E_mail - Default Profile"})
    @TestModellerPath(guid = "783d3af3-11ce-4aa5-a3a3-1105402094c2")
    public void GoToUrlAssertUrlPositiveSelectSelectInvoiceTempPositiveSelectEmailTemplateEnterEntermailidEnte6() throws HeadlessException, IOException, AWTException, InterruptedException
    {
        
    	Pages_Income.mailspage _mails = new Pages_Income.mailspage(driver);
    TestModellerLogger.SetLastNodeGuid("a51e0f3b-19dd-45ae-9370-d3609e2e0894");
    _mails.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3660f942-cc68-4cef-bb82-82cb35bc37d8");
    _mails.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("42ab91d4-7379-4404-a11e-6a50d2ca8760");
    _mails.Select_Select_InvoiceTemp("Legacy Invoice Template");
    

    TestModellerLogger.SetLastNodeGuid("3a1cbf88-20ac-48ea-be7c-61c45d03bf6e");
    _mails.Select_Email_Template("Send Invoice");
    

    TestModellerLogger.SetLastNodeGuid("2192c6c5-80e8-48b1-8207-cd86f583f7c6");
    _mails.Enter_Enter_mailid("");
    

    TestModellerLogger.SetLastNodeGuid("9942e2fa-2b79-4968-876b-4883effef066");
    _mails.Enter_Enter_Subject("");
    

    TestModellerLogger.SetLastNodeGuid("f8d8b4d0-e489-4043-8848-c64ac08e4975");
    _mails.Click_Sendbtn_clicked();
    

    TestModellerLogger.SetLastNodeGuid("cff924d0-3f00-4dd0-abb5-64fbf61324ee");
    _mails.Click_confirmation_msges();
    

    }

    @Test  (groups= {"E_mail","E_mail - Default Profile"})
    @TestModellerPath(guid = "2bff1dd7-ec5e-4cef-8fda-e48e469a861d")
    public void GoToUrlAssertUrlPositiveSelectSelectInvoiceTempPositiveSelectEmailTemplateEnterEntermailidEnte7() throws HeadlessException, IOException, AWTException, InterruptedException
    {
        
    	Pages_Income.mailspage _mails = new Pages_Income.mailspage(driver);
    TestModellerLogger.SetLastNodeGuid("a51e0f3b-19dd-45ae-9370-d3609e2e0894");
    _mails.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3660f942-cc68-4cef-bb82-82cb35bc37d8");
    _mails.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("42ab91d4-7379-4404-a11e-6a50d2ca8760");
    _mails.Select_Select_InvoiceTemp("New Generic Invoice Template");
    

    TestModellerLogger.SetLastNodeGuid("3a1cbf88-20ac-48ea-be7c-61c45d03bf6e");
    _mails.Select_Email_Template("Send Invoice");
    

    TestModellerLogger.SetLastNodeGuid("2192c6c5-80e8-48b1-8207-cd86f583f7c6");
    _mails.Enter_Enter_mailid("");
    

    TestModellerLogger.SetLastNodeGuid("9942e2fa-2b79-4968-876b-4883effef066");
    _mails.Enter_Enter_Subject("");
    

    TestModellerLogger.SetLastNodeGuid("f8d8b4d0-e489-4043-8848-c64ac08e4975");
    _mails.Click_Sendbtn_clicked();
    

    TestModellerLogger.SetLastNodeGuid("cff924d0-3f00-4dd0-abb5-64fbf61324ee");
    _mails.Click_confirmation_msges();
    

    }

}
