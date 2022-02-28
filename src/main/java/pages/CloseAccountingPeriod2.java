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

 //http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/05458796-65e3-419d-81aa-2975b5da031b
 @TestModellerModule(guid = "05458796-65e3-419d-81aa-2975b5da031b")
 public class CloseAccountingPeriod2 extends BasePage
{
	public CloseAccountingPeriod2 (WebDriver driver)
	{		super(driver);
	}


	
	//private By SettingsTabElem = By.xpath("//SPAN[text()='Settings']");
	
	private By SettingsTabElem = By.xpath("//SPAN[text()='Settings']");

	private By Accounting_Period_LinkElem = By.xpath("//SPAN[@id='__tab_ctl00_cPH_tbContainer_TbAccPeriod']");

	private By Edit_LinkElem = By.xpath("//A[text()='\n            Edit']");

	private By Edit_imgElem = By.xpath("//A[@id='ctl00_cPH_tbContainer_TbAccPeriod_rptrPreiodRecords_ctl01_lnperiodkEdit']/IMG");

	private By _Close_Accounting_Period_Elem = By.xpath("//*[@id='ctl00_cpHeaderRight_btnCloseAccountingPeriod']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandboxpre.nomismasolution.co.uk/AccountUI/AccountingPeriodEditor.aspx?FYCode=8512&CompanyCode=6600&menuid=0");

	ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandboxpre.nomismasolution.co.uk/AccountUI/AccountingPeriodEditor.aspx?FYCode=8512&CompanyCode=6600&menuid=0");
		
	TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandboxpre.nomismasolution.co.uk/AccountUI/AccountingPeriodEditor.aspx?FYCode=8512&CompanyCode=6600&menuid=0");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandboxpre.nomismasolution.co.uk/AccountUI/AccountingPeriodEditor.aspx?FYCode=8512&CompanyCode=6600&menuid=0";

        if (!currentUrl.equals("http://sandboxpre.nomismasolution.co.uk/AccountUI/AccountingPeriodEditor.aspx?FYCode=8512&CompanyCode=6600&menuid=0")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click SettingsTab
	 * @throws InterruptedException 
     * @name Click SettingsTab
     */
	public void Click_SettingsTab() throws InterruptedException
	{
        Thread.sleep(1000);
		WebElement elem = getWebElement(SettingsTabElem);

	if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "SettingsTabElem", "Click_SettingsTab failed. Unable to locate object: " + SettingsTabElem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "SettingsTabElem", "Click_SettingsTab failed. Unable to locate object: " + SettingsTabElem.toString());

			Assert.fail("Unable to locate object: " + SettingsTabElem.toString());
        }

		elem.click();
          	

	ExtentReportManager.passStep(m_Driver, "SettingsTabElem");

	TestModellerLogger.PassStep(m_Driver, "SettingsTabElem");
	}

     
	/**
 	 * Click Accounting Period Link
     * @name Click Accounting Period Link
     */
	public void Click_Accounting_Period_Link()
	{
        
		WebElement elem = getWebElement(Accounting_Period_LinkElem);

	if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Accounting_Period_Link", "Click_Accounting_Period_Link failed. Unable to locate object: " + Accounting_Period_LinkElem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Accounting_Period_Link", "Click_Accounting_Period_Link failed. Unable to locate object: " + Accounting_Period_LinkElem.toString());

			Assert.fail("Unable to locate object: " + Accounting_Period_LinkElem.toString());
        }

		elem.click();
          	

	ExtentReportManager.passStep(m_Driver, "Click_Accounting_Period_Link");

	TestModellerLogger.PassStep(m_Driver, "Click_Accounting_Period_Link");
	}

     
	/**
 	 * Click Edit Link
     * @name Click Edit Link
     */
	public void Click_Edit_Link()
	{
        
		WebElement elem = getWebElement(Edit_LinkElem);

	if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Edit_Link", "Click_Edit_Link failed. Unable to locate object: " + Edit_LinkElem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Edit_Link", "Click_Edit_Link failed. Unable to locate object: " + Edit_LinkElem.toString());

			Assert.fail("Unable to locate object: " + Edit_LinkElem.toString());
        }

		elem.click();
          	

	ExtentReportManager.passStep(m_Driver, "Click_Edit_Link");

	TestModellerLogger.PassStep(m_Driver, "Click_Edit_Link");
	}

     
	/**
 	 * Click Edit img
     * @name Click Edit img
     */
	public void Click_Edit_img()
	{
        
		WebElement elem = getWebElement(Edit_imgElem);

	if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Edit_img", "Click_Edit_img failed. Unable to locate object: " + Edit_imgElem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Edit_img", "Click_Edit_img failed. Unable to locate object: " + Edit_imgElem.toString());

			Assert.fail("Unable to locate object: " + Edit_imgElem.toString());
        }

		elem.click();
          	

	ExtentReportManager.passStep(m_Driver, "Click_Edit_img");

	TestModellerLogger.PassStep(m_Driver, "Click_Edit_img");
	}

     
	/**
 	 * Click  Close Accounting Period 
     * @name Click  Close Accounting Period 
     */
	public void Click__Close_Accounting_Period_()
	{
        
		WebElement elem = getWebElement(_Close_Accounting_Period_Elem);

	if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Close_Accounting_Period_", "Click__Close_Accounting_Period_ failed. Unable to locate object: " + _Close_Accounting_Period_Elem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Close_Accounting_Period_", "Click__Close_Accounting_Period_ failed. Unable to locate object: " + _Close_Accounting_Period_Elem.toString());

			Assert.fail("Unable to locate object: " + _Close_Accounting_Period_Elem.toString());
        }

		elem.click();
		Reporter.log("Accounting Period Status :- Account period closed", true);	

	ExtentReportManager.passStep(m_Driver, "Click__Close_Accounting_Period_");

	TestModellerLogger.PassStep(m_Driver, "Click__Close_Accounting_Period_");
	}
}