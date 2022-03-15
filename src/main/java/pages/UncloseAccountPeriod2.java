package pages;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;

import Generic.WaitStatementLib;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

 //http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/a889b956-b080-4c24-8083-fe4d207e982e
 @TestModellerModule(guid = "a889b956-b080-4c24-8083-fe4d207e982e")
 public class UncloseAccountPeriod2 extends BasePage
{
	public UncloseAccountPeriod2 (WebDriver driver)
	{		super(driver);
	}


	
	private By SettingsTabElem = By.xpath("//SPAN[text()='Settings']");

	private By Accounting_PeriodLinkElem = By.xpath("//SPAN[text()='Accounting Period']");

	private By EditLinkElem = By.xpath("//A[@id='ctl00_cpHeaderRight_btnEdit']");

	private By EditImgElem = By.xpath("//A[@id='ctl00_cPH_tbContainer_TbAccPeriod_rptrPreiodRecords_ctl01_lnperiodkEdit']/IMG");

	private By UnClosePeriod = By.xpath("//a[@id='ctl00_cpHeaderRight_btnUnCloseAccountingPeriod']");

	
	
	private By PeriodEditElem = By.xpath("//a[@id='ctl00_cPH_rptrDisplayRecords_ctl01_lnkEdit']/img");

	private By _Unlock_Accounting_Period_Elem = By.xpath("//*[@id='ctl00_cpHeaderRight_btnUnLock']");

	private By Setting_ImgElem = By.xpath("//SPAN[@class='fa fa-cogs']");

	private By Accounting_Period_TabElem = By.xpath("//A[text()='Accounting Period']");

	private By Accounting_Period_EditElem = By.xpath("//A[@id='ctl00_cPH_rptrDisplayRecords_ctl02_lnkEdit']/IMG");

	private By _Unclose_Accounting_Period_Elem = By.xpath("//*[@id='ctl00_cpHeaderRight_btnUnCloseAccountingPeriod']");

	private By _Unclose_close_Accounting_Period_Elem = By.xpath("//a[contains(text(),'lose Accounting Period')] ");

	
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
 	 * Click SettingsTab
     * @name Click SettingsTab
     */
	public void Click_SettingsTab()
	{
        
		WebElement elem = getWebElement(SettingsTabElem);

	if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SettingsTab", "Click_SettingsTab failed. Unable to locate object: " + SettingsTabElem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SettingsTab", "Click_SettingsTab failed. Unable to locate object: " + SettingsTabElem.toString());

			Assert.fail("Unable to locate object: " + SettingsTabElem.toString());
        }

		elem.click();
          	

	ExtentReportManager.passStep(m_Driver, "Click_SettingsTab");

	TestModellerLogger.PassStep(m_Driver, "Click_SettingsTab");
	}

     
	/**
 	 * Click Accounting PeriodLink
     * @name Click Accounting PeriodLink
     */
	public void Click_Accounting_PeriodLink()
	{
        
		WebElement elem = getWebElement(Accounting_PeriodLinkElem);

	if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Accounting_PeriodLink", "Click_Accounting_PeriodLink failed. Unable to locate object: " + Accounting_PeriodLinkElem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Accounting_PeriodLink", "Click_Accounting_PeriodLink failed. Unable to locate object: " + Accounting_PeriodLinkElem.toString());

			Assert.fail("Unable to locate object: " + Accounting_PeriodLinkElem.toString());
        }

		elem.click();
          	

	ExtentReportManager.passStep(m_Driver, "Click_Accounting_PeriodLink");

	TestModellerLogger.PassStep(m_Driver, "Click_Accounting_PeriodLink");
	}

     
	/**
 	 * Click EditLink
     * @name Click EditLink
     */
	public void Click_EditLink()
	{
        
		WebElement elem = getWebElement(EditLinkElem);

	if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_EditLink", "Click_EditLink failed. Unable to locate object: " + EditLinkElem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_EditLink", "Click_EditLink failed. Unable to locate object: " + EditLinkElem.toString());

			Assert.fail("Unable to locate object: " + EditLinkElem.toString());
        }

		elem.click();
          	

	ExtentReportManager.passStep(m_Driver, "Click_EditLink");

	TestModellerLogger.PassStep(m_Driver, "Click_EditLink");
	}

     
	/**
 	 * Click EditImg
     * @name Click EditImg
     */
	public void Click_EditImg()
	{
        
		WebElement elem = getWebElement(EditImgElem);

	if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_EditImg", "Click_EditImg failed. Unable to locate object: " + EditImgElem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_EditImg", "Click_EditImg failed. Unable to locate object: " + EditImgElem.toString());

			Assert.fail("Unable to locate object: " + EditImgElem.toString());
        }

		elem.click();
          	

	ExtentReportManager.passStep(m_Driver, "Click_EditImg");

	TestModellerLogger.PassStep(m_Driver, "Click_EditImg");
	}
	
	public void Click_UnClosePeriod() throws InterruptedException
	{
		WaitStatementLib wt =new WaitStatementLib();
		WebElement elm5 = getWebElement(_Unclose_close_Accounting_Period_Elem);
		/*if (getWebElement(_Unlock_Accounting_Period_Elem).getText().equalsIgnoreCase(" Unlock Accounting Period ") && elm5.getText().equalsIgnoreCase(" Close Accounting Period ") ) {
        	wt.explicitWait_elementToBeClickable(m_Driver, 20, getWebElement(_Unlock_Accounting_Period_Elem));
        	WebElement elem2 = getWebElement(_Unlock_Accounting_Period_Elem);
        	elem2.click();
        	Reporter.log("Accounting Period Status : "+getWebElement(_Unlock_Accounting_Period_Elem).getText()+" :", true);
		} */
	 if (elm5.getText().equalsIgnoreCase("Close Accounting Period ")) {
        	
        	//Thread.sleep(1000);
        	Reporter.log("Accounting Period Status : Not Closed", true);
        	
        }
		else if (elm5.getText().equalsIgnoreCase(" Unclose Accounting Period ")) {
        	WebElement elem = getWebElement(_Unclose_Accounting_Period_Elem);
        	elem.click();
        	//Thread.sleep(1000);
        	Reporter.log("Accounting Period Status : Account UnClosed ", true);
        	wt.explicitWait_elementToBeClickable(m_Driver, 20, getWebElement(PeriodEditElem));
        	WebElement elem1 = getWebElement(PeriodEditElem);
        	elem1.click();
        	//Thread.sleep(1000);
        	wt.explicitWait_elementToBeClickable(m_Driver, 20, getWebElement(_Unlock_Accounting_Period_Elem));
        	WebElement elem2 = getWebElement(_Unlock_Accounting_Period_Elem);
        	elem2.click();
        	Thread.sleep(1000);
        	Reporter.log("Accounting Period Status : Account UnLocked", true);
        	//Thread.sleep(1000);
        	
        }
        /*else if (getWebElement(_Unlock_Accounting_Period_Elem).getText().equalsIgnoreCase(" Unclose Accounting Period ")) {
        	wt.explicitWait_elementToBeClickable(m_Driver, 20, getWebElement(_Unlock_Accounting_Period_Elem));
        	WebElement elem2 = getWebElement(_Unlock_Accounting_Period_Elem);
        	elem2.click();
        	Reporter.log("Accounting Period Status : "+elem2.getText()+" :", true);
		}*/
	/*if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "UnClosePeriod", "Click_EditImg failed. Unable to locate object: " + UnClosePeriod.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "UnClosePeriod", "Click_EditImg failed. Unable to locate object: " + UnClosePeriod.toString());

			Assert.fail("Unable to locate object: " + UnClosePeriod.toString());
        }

		elem.click();
          	

	ExtentReportManager.passStep(m_Driver, "UnClosePeriod");

	TestModellerLogger.PassStep(m_Driver, "UnClosePeriod");*/
	}
}