package pages;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import Generic.SeleniumLib;
import Generic.WaitStatementLib;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

 //http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/a78c6a52-963d-4560-81b3-be32aca10ee2
 @TestModellerModule(guid = "a78c6a52-963d-4560-81b3-be32aca10ee2")
 public class UncloseAccountingPeriod extends BasePage
{
	 WaitStatementLib wt;
	public UncloseAccountingPeriod (WebDriver driver)
	{		super(driver);
	   wt = new WaitStatementLib();
	}


	private By PeriodEditElem = By.xpath("//A[@id='ctl00_cPH_rptrDisplayRecords_ctl02_lnkEdit']/IMG");

	private By _Unlock_Accounting_Period_Elem = By.xpath("//*[@id=\"ctl00_cpHeaderRight_btnUnLock\"]");

	private By Setting_ImgElem = By.xpath("//SPAN[@class='fa fa-cogs']");

	private By Accounting_Period_TabElem = By.xpath("//A[text()='Accounting Period']");

	private By Accounting_Period_EditElem = By.xpath("//A[@id='ctl00_cPH_rptrDisplayRecords_ctl02_lnkEdit']/IMG");

	private By _Unclose_Accounting_Period_Elem = By.xpath("//*[@id=\"ctl00_cpHeaderRight_btnUnCloseAccountingPeriod\"]");

	private By _Unclose_close_Accounting_Period_Elem = By.xpath("//a[contains(text(),'lose Accounting Period')] ");

	
	public void GoToUrl()
	{
		m_Driver.get("http://sandboxpre.nomismasolution.co.uk/AccountUI/AccountingPeriodList.aspx?FYCode=8511&CompanyCode=6600&menuid=0");

	ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandboxpre.nomismasolution.co.uk/AccountUI/AccountingPeriodList.aspx?FYCode=8511&CompanyCode=6600&menuid=0");
		
	TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandboxpre.nomismasolution.co.uk/AccountUI/AccountingPeriodList.aspx?FYCode=8511&CompanyCode=6600&menuid=0");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandboxpre.nomismasolution.co.uk/AccountUI/AccountingPeriodList.aspx?FYCode=8511&CompanyCode=6600&menuid=0";

        if (!currentUrl.equals("http://sandboxpre.nomismasolution.co.uk/AccountUI/AccountingPeriodList.aspx?FYCode=8511&CompanyCode=6600&menuid=0")) {
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
 	 * Click  Unclose Accounting Period 
     * @name Click  Unclose Accounting Period 
     */
	public void Click__Unclose_Accounting_Period_()
	{
		WebElement elm5 = getWebElement(_Unclose_close_Accounting_Period_Elem);
        if (elm5.getText().equalsIgnoreCase(" Unclose Accounting Period ")) {
        	WebElement elem = getWebElement(_Unclose_Accounting_Period_Elem);
        	elem.click();
        	WebElement elem1 = getWebElement(PeriodEditElem);
        	elem1.click();
        	WebElement elem2 = getWebElement(_Unlock_Accounting_Period_Elem);
        	elem2.click();

		}
	/*if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Unclose_Accounting_Period_", "Click__Unclose_Accounting_Period_ failed. Unable to locate object: " + _Unclose_Accounting_Period_Elem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Unclose_Accounting_Period_", "Click__Unclose_Accounting_Period_ failed. Unable to locate object: " + _Unclose_Accounting_Period_Elem.toString());

			Assert.fail("Unable to locate object: " + _Unclose_Accounting_Period_Elem.toString());
        }*/

		
	}
}