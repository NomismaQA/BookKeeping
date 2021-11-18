package pages;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/fe039b25-c122-43bc-bd16-62dc32d8d8bb
@TestModellerModule(guid = "fe039b25-c122-43bc-bd16-62dc32d8d8bb")
public class VerifyByTrialBalancePDF extends BasePage
{
	
	
	public VerifyByTrialBalancePDF (WebDriver driver)
	{
		super(driver);
	}

	private By ReportsTABElem = By.xpath("//span[contains(text(), 'Reports')]");
	
//	private By ReportsTABElem = By.xpath("//A[@href='../AccountUI/Report.aspx?FYCode=52520&CompanyCode=13305']");

	private By TrialBalanceTABElem = By.xpath("/html/body/form/main/div[11]/div[3]/div/div[3]/div/div/div[1]/div/div/div/div/div[1]/table/tbody/tr[3]/td/a");

	private By PDFDumpElem = By.xpath("//A[@id='ctl00_cPHFilter_lkbtnExportPeriodsPdf']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/AccountUI/ReportTrialBalance.aspx?FYCode=52520&CompanyCode=13305");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AccountUI/ReportTrialBalance.aspx?FYCode=52520&CompanyCode=13305");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AccountUI/ReportTrialBalance.aspx?FYCode=52520&CompanyCode=13305");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AccountUI/ReportTrialBalance.aspx?FYCode=52520&CompanyCode=13305";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AccountUI/ReportTrialBalance.aspx?FYCode=52520&CompanyCode=13305")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click ReportsTAB
     * @name Click ReportsTAB
     */
	public void Click_ReportsTAB()
	{
        
		WebElement elem = getWebElement(ReportsTABElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ReportsTAB", "Click_ReportsTAB failed. Unable to locate object: " + ReportsTABElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ReportsTAB", "Click_ReportsTAB failed. Unable to locate object: " + ReportsTABElem.toString());

			Assert.fail("Unable to locate object: " + ReportsTABElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_ReportsTAB");

		TestModellerLogger.PassStep(m_Driver, "Click_ReportsTAB");
	}

     
	/**
 	 * Click TrialBalanceTAB
     * @name Click TrialBalanceTAB
     */
	public void Click_TrialBalanceTAB()
	{
        
		WebElement elem = getWebElement(TrialBalanceTABElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_TrialBalanceTAB", "Click_TrialBalanceTAB failed. Unable to locate object: " + TrialBalanceTABElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_TrialBalanceTAB", "Click_TrialBalanceTAB failed. Unable to locate object: " + TrialBalanceTABElem.toString());

			Assert.fail("Unable to locate object: " + TrialBalanceTABElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_TrialBalanceTAB");

		TestModellerLogger.PassStep(m_Driver, "Click_TrialBalanceTAB");
	}

     
	/**
 	 * Click PDFDump
     * @name Click PDFDump
     */
	public void Click_PDFDump()
	{
        
		WebElement elem = getWebElement(PDFDumpElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_PDFDump", "Click_PDFDump failed. Unable to locate object: " + PDFDumpElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_PDFDump", "Click_PDFDump failed. Unable to locate object: " + PDFDumpElem.toString());

			Assert.fail("Unable to locate object: " + PDFDumpElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_PDFDump");

		TestModellerLogger.PassStep(m_Driver, "Click_PDFDump");
	}
}