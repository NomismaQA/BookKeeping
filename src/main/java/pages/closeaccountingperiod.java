package pages;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

 //http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/a9bc7486-c812-464e-9e82-68ca4d774b07
 @TestModellerModule(guid = "a9bc7486-c812-464e-9e82-68ca4d774b07")
 public class closeaccountingperiod extends BasePage
{
	public closeaccountingperiod (WebDriver driver)
	{		super(driver);
	}


	
	private By Setting_ImgElem = By.xpath("//SPAN[@class='fa fa-cogs']");

	private By Accounting_Period_TabElem = By.xpath("//A[text()='Accounting Period']");

	private By Accounting_Period_EditElem = By.xpath("//A[@id='ctl00_cPH_rptrDisplayRecords_ctl02_lnkEdit']/IMG");

	private By Close_Accounting_Period_TabElem = By.xpath("//*[@id=\"ctl00_cpHeaderRight_btnCloseAccountingPeriod\"]");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandboxpre.nomismasolution.co.uk/AccountUI/AccountingPeriodEditor.aspx?FYCode=8510&CompanyCode=6600&menuid=0");

	ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandboxpre.nomismasolution.co.uk/AccountUI/AccountingPeriodEditor.aspx?FYCode=8510&CompanyCode=6600&menuid=0");
		
	TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandboxpre.nomismasolution.co.uk/AccountUI/AccountingPeriodEditor.aspx?FYCode=8510&CompanyCode=6600&menuid=0");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandboxpre.nomismasolution.co.uk/AccountUI/AccountingPeriodEditor.aspx?FYCode=8510&CompanyCode=6600&menuid=0";

        if (!currentUrl.equals("http://sandboxpre.nomismasolution.co.uk/AccountUI/AccountingPeriodEditor.aspx?FYCode=8510&CompanyCode=6600&menuid=0")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click Setting Img
     * @name Click Setting Img
     */
	public void Click_Setting_Img()
	{
        
		WebElement elem = getWebElement(Setting_ImgElem);

	if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Setting_Img", "Click_Setting_Img failed. Unable to locate object: " + Setting_ImgElem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Setting_Img", "Click_Setting_Img failed. Unable to locate object: " + Setting_ImgElem.toString());

			Assert.fail("Unable to locate object: " + Setting_ImgElem.toString());
        }

		elem.click();
          	

	ExtentReportManager.passStep(m_Driver, "Click_Setting_Img");

	TestModellerLogger.PassStep(m_Driver, "Click_Setting_Img");
	}

     
	/**
 	 * Click Accounting Period Tab
     * @name Click Accounting Period Tab
     */
	public void Click_Accounting_Period_Tab()
	{
        
		WebElement elem = getWebElement(Accounting_Period_TabElem);

	if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Accounting_Period_Tab", "Click_Accounting_Period_Tab failed. Unable to locate object: " + Accounting_Period_TabElem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Accounting_Period_Tab", "Click_Accounting_Period_Tab failed. Unable to locate object: " + Accounting_Period_TabElem.toString());

			Assert.fail("Unable to locate object: " + Accounting_Period_TabElem.toString());
        }

		elem.click();
          	

	ExtentReportManager.passStep(m_Driver, "Click_Accounting_Period_Tab");

	TestModellerLogger.PassStep(m_Driver, "Click_Accounting_Period_Tab");
	}

     
	/**
 	 * Click Accounting Period Edit
     * @name Click Accounting Period Edit
     */
	public void Click_Accounting_Period_Edit()
	{
        
		WebElement elem = getWebElement(Accounting_Period_EditElem);

	if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Accounting_Period_Edit", "Click_Accounting_Period_Edit failed. Unable to locate object: " + Accounting_Period_EditElem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Accounting_Period_Edit", "Click_Accounting_Period_Edit failed. Unable to locate object: " + Accounting_Period_EditElem.toString());

			Assert.fail("Unable to locate object: " + Accounting_Period_EditElem.toString());
        }

		elem.click();
          	

	ExtentReportManager.passStep(m_Driver, "Click_Accounting_Period_Edit");

	TestModellerLogger.PassStep(m_Driver, "Click_Accounting_Period_Edit");
	}

     
	/**
 	 * Click Close Accounting Period Tab
     * @name Click Close Accounting Period Tab
     */
	public void Click_Close_Accounting_Period_Tab()
	{
        
		WebElement elem = getWebElement(Close_Accounting_Period_TabElem);

	if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Close_Accounting_Period_Tab", "Click_Close_Accounting_Period_Tab failed. Unable to locate object: " + Close_Accounting_Period_TabElem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Close_Accounting_Period_Tab", "Click_Close_Accounting_Period_Tab failed. Unable to locate object: " + Close_Accounting_Period_TabElem.toString());

			Assert.fail("Unable to locate object: " + Close_Accounting_Period_TabElem.toString());
        }

		elem.click();
		Reporter.log("Current Accounting period is Closed :", true);
          	

	ExtentReportManager.passStep(m_Driver, "Click_Close_Accounting_Period_Tab");

	TestModellerLogger.PassStep(m_Driver, "Click_Close_Accounting_Period_Tab");
	}
}