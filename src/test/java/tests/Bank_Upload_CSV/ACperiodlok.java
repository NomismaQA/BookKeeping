package tests.Bank_Upload_CSV;

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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/15c2efa1-bc37-4e94-9f5f-b54aea9b2f0f
@TestModellerModule(guid = "15c2efa1-bc37-4e94-9f5f-b54aea9b2f0f")
public class ACperiodlok extends BasePage
{
	public ACperiodlok (WebDriver driver)
	{
		super(driver);
	}


	
	private By _st0fillFFFFFF_Settings_Elem = By.xpath("//LI[@class='active']/A[@class='']");

	private By Accounting_PeriodElem = By.xpath("//SPAN[@id='__tab_ctl00_cPH_tbContainer_TbAccPeriod']");

	private By _EditElem = By.xpath("//A[@id='ctl00_cpHeaderRight_btnEdit']");

	private By _Elem = By.xpath("//A[@id='ctl00_cPH_tbContainer_TbAccPeriod_rptrPreiodRecords_ctl00_lnperiodkEdit']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/AccountUI/AccountingPeriodList.aspx?FYCode=54090&CompanyCode=14315&menuid=0");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AccountUI/AccountingPeriodList.aspx?FYCode=54090&CompanyCode=14315&menuid=0");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AccountUI/AccountingPeriodList.aspx?FYCode=54090&CompanyCode=14315&menuid=0");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AccountUI/AccountingPeriodList.aspx?FYCode=54090&CompanyCode=14315&menuid=0";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AccountUI/AccountingPeriodList.aspx?FYCode=54090&CompanyCode=14315&menuid=0")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click  .st0{fill:#FFFFFF;} Settings 
     * @name Click  .st0{fill:#FFFFFF;} Settings 
     */
	public void Click__st0fillFFFFFF_Settings_()
	{
        
		WebElement elem = getWebElement(_st0fillFFFFFF_Settings_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__st0fillFFFFFF_Settings_", "Click__st0fillFFFFFF_Settings_ failed. Unable to locate object: " + _st0fillFFFFFF_Settings_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__st0fillFFFFFF_Settings_", "Click__st0fillFFFFFF_Settings_ failed. Unable to locate object: " + _st0fillFFFFFF_Settings_Elem.toString());

			Assert.fail("Unable to locate object: " + _st0fillFFFFFF_Settings_Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__st0fillFFFFFF_Settings_");

		TestModellerLogger.PassStep(m_Driver, "Click__st0fillFFFFFF_Settings_");
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
 	 * Click  
     * @name Click  
     */
	public void Click__()
	{
        
		WebElement elem = getWebElement(_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__", "Click__ failed. Unable to locate object: " + _Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__", "Click__ failed. Unable to locate object: " + _Elem.toString());

			Assert.fail("Unable to locate object: " + _Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__");

		TestModellerLogger.PassStep(m_Driver, "Click__");
	}
}