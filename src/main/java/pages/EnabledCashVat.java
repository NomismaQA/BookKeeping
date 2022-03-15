package pages;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import Generic.WaitStatementLib;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

 //http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/ce906fcb-4c99-4139-89d2-11ec9ddb1e72
 @TestModellerModule(guid = "ce906fcb-4c99-4139-89d2-11ec9ddb1e72")
 public class EnabledCashVat extends BasePage
{
	public EnabledCashVat (WebDriver driver)
	{		super(driver);
	}


	
	private By Setting_imgElem = By.xpath("//SPAN[@class='fa fa-cogs']");

	private By Settings_tabElem = By.xpath("//A[text()='Settings']");

	private By VAT_tabElem = By.xpath("//span[@id='__tab_ctl00_cPH_tbContainer_TbVat']");

	private By _EditElem = By.xpath("//a[@id='ctl00_cpHeaderRight_btnEdit']");

	private By chkEnableVATCashSchemeElem = By.xpath("//input[@id='ctl00_cPH_tbContainer_TbVat_chkEnableVATCashScheme']");

	private By EffectiveStartDateElem = By.xpath("//*[@id=\"ctl00_cPH_tbContainer_TbVat_txtEffectiveStartDate\"]");

	private By EffectiveEndDateElem = By.xpath("//*[@id=\"ctl00_cPH_tbContainer_TbVat_txtEffectiveEndDate\"]");

	private By Save_btnElem = By.xpath("//*[@id=\"ctl00_cPH_tbContainer_TbVat_btnVATSave\"]");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandboxpre.nomismasolution.co.uk/AccountUI/Companyinfo.aspx?FYCode=8511&CompanyCode=6600&mopt=3&menuid=0&p=true");

	ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandboxpre.nomismasolution.co.uk/AccountUI/Companyinfo.aspx?FYCode=8511&CompanyCode=6600&mopt=3&menuid=0&p=true");
		
	TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandboxpre.nomismasolution.co.uk/AccountUI/Companyinfo.aspx?FYCode=8511&CompanyCode=6600&mopt=3&menuid=0&p=true");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandboxpre.nomismasolution.co.uk/AccountUI/Companyinfo.aspx?FYCode=8511&CompanyCode=6600&mopt=3&menuid=0&p=true";

        if (!currentUrl.equals("http://sandboxpre.nomismasolution.co.uk/AccountUI/Companyinfo.aspx?FYCode=8511&CompanyCode=6600&mopt=3&menuid=0&p=true")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click Setting img
     * @name Click Setting img
     */
	public void Click_Setting_img()
	{
        
		WebElement elem = getWebElement(Setting_imgElem);

	if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Setting_img", "Click_Setting_img failed. Unable to locate object: " + Setting_imgElem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Setting_img", "Click_Setting_img failed. Unable to locate object: " + Setting_imgElem.toString());

			Assert.fail("Unable to locate object: " + Setting_imgElem.toString());
        }

		elem.click();
          	

	ExtentReportManager.passStep(m_Driver, "Click_Setting_img");

	TestModellerLogger.PassStep(m_Driver, "Click_Setting_img");
	}

     
	/**
 	 * Click Settings tab
     * @name Click Settings tab
     */
	public void Click_Settings_tab()
	{
        
		WebElement elem = getWebElement(Settings_tabElem);

	if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Settings_tab", "Click_Settings_tab failed. Unable to locate object: " + Settings_tabElem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Settings_tab", "Click_Settings_tab failed. Unable to locate object: " + Settings_tabElem.toString());

			Assert.fail("Unable to locate object: " + Settings_tabElem.toString());
        }

		elem.click();
          	

	ExtentReportManager.passStep(m_Driver, "Click_Settings_tab");

	TestModellerLogger.PassStep(m_Driver, "Click_Settings_tab");
	}

     
	/**
 	 * Click VAT tab
     * @name Click VAT tab
     */
	public void Click_VAT_tab()
	{
        
		WebElement elem = getWebElement(VAT_tabElem);

	if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_VAT_tab", "Click_VAT_tab failed. Unable to locate object: " + VAT_tabElem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_VAT_tab", "Click_VAT_tab failed. Unable to locate object: " + VAT_tabElem.toString());

			Assert.fail("Unable to locate object: " + VAT_tabElem.toString());
        }

		elem.click();
          	

	ExtentReportManager.passStep(m_Driver, "Click_VAT_tab");

	TestModellerLogger.PassStep(m_Driver, "Click_VAT_tab");
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
 	 * Click chkEnableVATCashScheme
     * @name Click chkEnableVATCashScheme
     */
	public void Click_chkEnableVATCashScheme()
	{
        
		WebElement elem = getWebElement(chkEnableVATCashSchemeElem);

	if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_chkEnableVATCashScheme", "Click_chkEnableVATCashScheme failed. Unable to locate object: " + chkEnableVATCashSchemeElem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_chkEnableVATCashScheme", "Click_chkEnableVATCashScheme failed. Unable to locate object: " + chkEnableVATCashSchemeElem.toString());

			Assert.fail("Unable to locate object: " + chkEnableVATCashSchemeElem.toString());
        }

		elem.click();
          	

	ExtentReportManager.passStep(m_Driver, "Click_chkEnableVATCashScheme");

	TestModellerLogger.PassStep(m_Driver, "Click_chkEnableVATCashScheme");
	}

      
	/**
 	 * Enter EffectiveStartDate
     * @name Enter EffectiveStartDate
     */
 	public void Enter_EffectiveStartDate(String EffectiveStartDate)
 	{
 	    
 		WebElement elem = getWebElement(EffectiveStartDateElem);

		if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_EffectiveStartDate", "Enter_EffectiveStartDate failed. Unable to locate object: " + EffectiveStartDateElem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_EffectiveStartDate", "Enter_EffectiveStartDate failed. Unable to locate object: " + EffectiveStartDateElem.toString());

 			Assert.fail("Unable to locate object: " + EffectiveStartDateElem.toString());
         }
		WaitStatementLib wt=new WaitStatementLib();
		wt.explicitWait_elementToBeClickable(m_Driver, 20, elem);
        elem.click();
 		elem.sendKeys(EffectiveStartDate);
 	
 		
  		 ExtentReportManager.passStep(m_Driver, "Enter_EffectiveStartDate " + EffectiveStartDate);

  		 TestModellerLogger.PassStep(m_Driver, "Enter_EffectiveStartDate " + EffectiveStartDate);
 	}

      
	/**
 	 * Enter EffectiveEndDate
     * @name Enter EffectiveEndDate
     */
 	public void Enter_EffectiveEndDate(String EffectiveEndDate)
 	{
 	    
 		WebElement elem = getWebElement(EffectiveEndDateElem);

		if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_EffectiveEndDate", "Enter_EffectiveEndDate failed. Unable to locate object: " + EffectiveEndDateElem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_EffectiveEndDate", "Enter_EffectiveEndDate failed. Unable to locate object: " + EffectiveEndDateElem.toString());

 			Assert.fail("Unable to locate object: " + EffectiveEndDateElem.toString());
         }
		
 		elem.sendKeys(EffectiveEndDate);
 	
 		
  		 ExtentReportManager.passStep(m_Driver, "Enter_EffectiveEndDate " + EffectiveEndDate);

  		 TestModellerLogger.PassStep(m_Driver, "Enter_EffectiveEndDate " + EffectiveEndDate);
 	}

     
	/**
 	 * Click Save btn
     * @name Click Save btn
     */
	public void Click_Save_btn()
	{
        
		WebElement elem = getWebElement(Save_btnElem);

	if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Save_btn", "Click_Save_btn failed. Unable to locate object: " + Save_btnElem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Save_btn", "Click_Save_btn failed. Unable to locate object: " + Save_btnElem.toString());

			Assert.fail("Unable to locate object: " + Save_btnElem.toString());
        }

		elem.click();
          	

	ExtentReportManager.passStep(m_Driver, "Click_Save_btn");

	TestModellerLogger.PassStep(m_Driver, "Click_Save_btn");
	}
}