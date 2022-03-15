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

 //http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/a69dff54-39a0-4f6d-bd63-ee552502ccb0
 @TestModellerModule(guid = "a69dff54-39a0-4f6d-bd63-ee552502ccb0")
 public class UnlockAccountingPeriod2 extends BasePage
{
	public UnlockAccountingPeriod2 (WebDriver driver)
	{		super(driver);
	}


	
	private By SettingsElem = By.xpath("/html/body/form/main/div[11]/div[2]/ul/li[12]/a/span");

	private By Accounting_PeriodElem = By.xpath("//*[@id=\"__tab_ctl00_cPH_tbContainer_TbAccPeriod\"]");

	private By _EditElem = By.xpath("//*[@id=\"ctl00_cpHeaderRight_btnEdit\"]");

	private By EditElem = By.xpath("//A[@id='ctl00_cPH_tbContainer_TbAccPeriod_rptrPreiodRecords_ctl02_lnperiodkEdit']/IMG");

	private By UnlockPeriod = By.xpath("//a[@id='ctl00_cpHeaderRight_btnUnLock']");

	
	public void GoToUrl()
	{
		m_Driver.get("http://sandboxpre.nomismasolution.co.uk/AccountUI/AccountingPeriodEditor.aspx?FYCode=8512&CompanyCode=6600&");

	ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandboxpre.nomismasolution.co.uk/AccountUI/AccountingPeriodEditor.aspx?FYCode=8512&CompanyCode=6600&");
		
	TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandboxpre.nomismasolution.co.uk/AccountUI/AccountingPeriodEditor.aspx?FYCode=8512&CompanyCode=6600&");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandboxpre.nomismasolution.co.uk/AccountUI/AccountingPeriodEditor.aspx?FYCode=8512&CompanyCode=6600&";

        if (!currentUrl.equals("http://sandboxpre.nomismasolution.co.uk/AccountUI/AccountingPeriodEditor.aspx?FYCode=8512&CompanyCode=6600&")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click Settings
     * @name Click Settings
     */
	public void Click_Settings()
	{
        
		WebElement elem = getWebElement(SettingsElem);

	if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Settings", "Click_Settings failed. Unable to locate object: " + SettingsElem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Settings", "Click_Settings failed. Unable to locate object: " + SettingsElem.toString());

			Assert.fail("Unable to locate object: " + SettingsElem.toString());
        }

		elem.click();
          	

	ExtentReportManager.passStep(m_Driver, "Click_Settings");

	TestModellerLogger.PassStep(m_Driver, "Click_Settings");
	}

     
	/**
 	 * Click Accounting Period
     * @name Click Accounting Period
     */
	public void Click_Accounting_Period()
	{
        
		WebElement elem = getWebElement(Accounting_PeriodElem);

	if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Accounting_Period", "Click_Accounting_Period failed. Unable to locate object: " + Accounting_PeriodElem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Accounting_Period", "Click_Accounting_Period failed. Unable to locate object: " + Accounting_PeriodElem.toString());

			Assert.fail("Unable to locate object: " + Accounting_PeriodElem.toString());
        }

		elem.click();
          	

	ExtentReportManager.passStep(m_Driver, "Click_Accounting_Period");

	TestModellerLogger.PassStep(m_Driver, "Click_Accounting_Period");
	}

     
	/**
 	 * Click  Edit
     * @name Click  Edit
     */
	public void Click__Edit()
	{
        
		WebElement elem = getWebElement(_EditElem);

	if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Edit", "Click__Edit failed. Unable to locate object: " + _EditElem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Edit", "Click__Edit failed. Unable to locate object: " + _EditElem.toString());

			Assert.fail("Unable to locate object: " + _EditElem.toString());
        }

		elem.click();
          	

	ExtentReportManager.passStep(m_Driver, "Click__Edit");

	TestModellerLogger.PassStep(m_Driver, "Click__Edit");
	}

     
	/**
 	 * Click Edit
     * @name Click Edit
     */
	public void Click_Edit()
	{
        
		WebElement elem = getWebElement(EditElem);

	if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Edit", "Click_Edit failed. Unable to locate object: " + EditElem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Edit", "Click_Edit failed. Unable to locate object: " + EditElem.toString());

			Assert.fail("Unable to locate object: " + EditElem.toString());
        }

		elem.click();
          	

	ExtentReportManager.passStep(m_Driver, "Click_Edit");

	TestModellerLogger.PassStep(m_Driver, "Click_Edit");
	}
	
	public void Click_UnlockPeriod()
	{
        
		WebElement elem = getWebElement(UnlockPeriod);

	if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "UnlockPeriod", "Click_Edit failed. Unable to locate object: " + UnlockPeriod.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "UnlockPeriod", "Click_Edit failed. Unable to locate object: " + UnlockPeriod.toString());

			Assert.fail("Unable to locate object: " + UnlockPeriod.toString());
        }

		elem.click();
          	

	ExtentReportManager.passStep(m_Driver, "UnlockPeriod");

	TestModellerLogger.PassStep(m_Driver, "UnlockPeriod");
	}
}