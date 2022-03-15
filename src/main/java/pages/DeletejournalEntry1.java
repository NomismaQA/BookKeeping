package pages;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;

import Generic.SeleniumLib;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

 //http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/773bbe1f-ece7-4f01-b87c-bcaf59ca2c72
 @TestModellerModule(guid = "773bbe1f-ece7-4f01-b87c-bcaf59ca2c72")
 public class DeletejournalEntry1 extends BasePage
{
	 SeleniumLib sl;
	public DeletejournalEntry1 (WebDriver driver)
	{		super(driver);
	sl= new SeleniumLib(m_Driver);
	}


	
	private By AccountantElem = By.xpath("//*[@id='ctl00_SideMenu1_accountantMenu']/a/span");

	private By JournalsElem = By.xpath("//*[@id='ctl00_cPH_Divtab']/div/div[1]/div/div/div/table[2]/tbody/tr/td/table[1]/tbody/tr/td/a");

	private By ctl00ddlFinancialYearElem = By.xpath("//*[@id='ctl00_ddlFinancialYear']");

	private By xPath_idchAllRTIElem = By.xpath("//*[@id='chAllRTI']");

	private By xPath_htmlbodyformmaindiv10div3headerdiva1iElem = By.xpath("//I[@class='dashOpt-e_fa fa fa-trash  ']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandboxpre.nomismasolution.co.uk/AccountUI/Journal.aspx?FYCode=8512&CompanyCode=6600&IsFirstRequest=1");

	ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandboxpre.nomismasolution.co.uk/AccountUI/Journal.aspx?FYCode=8512&CompanyCode=6600&IsFirstRequest=1");
		
	TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandboxpre.nomismasolution.co.uk/AccountUI/Journal.aspx?FYCode=8512&CompanyCode=6600&IsFirstRequest=1");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandboxpre.nomismasolution.co.uk/AccountUI/Journal.aspx?FYCode=8512&CompanyCode=6600&IsFirstRequest=1";

        if (!currentUrl.equals("http://sandboxpre.nomismasolution.co.uk/AccountUI/Journal.aspx?FYCode=8512&CompanyCode=6600&IsFirstRequest=1")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click Accountant
     * @name Click Accountant
     */
	public void Click_Accountant()
	{
        
		WebElement elem = getWebElement(AccountantElem);

	if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Accountant", "Click_Accountant failed. Unable to locate object: " + AccountantElem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Accountant", "Click_Accountant failed. Unable to locate object: " + AccountantElem.toString());

			Assert.fail("Unable to locate object: " + AccountantElem.toString());
        }

		elem.click();
          	

	ExtentReportManager.passStep(m_Driver, "Click_Accountant");

	TestModellerLogger.PassStep(m_Driver, "Click_Accountant");
	}

     
	/**
 	 * Click Journals
     * @name Click Journals
     */
	public void Click_Journals()
	{
        
		WebElement elem = getWebElement(JournalsElem);

	if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Journals", "Click_Journals failed. Unable to locate object: " + JournalsElem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Journals", "Click_Journals failed. Unable to locate object: " + JournalsElem.toString());

			Assert.fail("Unable to locate object: " + JournalsElem.toString());
        }
	jsExec.executeScript("arguments[0].click();",elem);

	//	elem.click();
          	

	ExtentReportManager.passStep(m_Driver, "Click_Journals");

	TestModellerLogger.PassStep(m_Driver, "Click_Journals");
	}

    
	/**
 	 * Select ctl00$ddlFinancialYear
     * @name Select ctl00$ddlFinancialYear
     */
    public void Select_ctl00ddlFinancialYear(String ctl00ddlFinancialYear)
 	{
 	    
 		WebElement elem = getWebElement(ctl00ddlFinancialYearElem);

 		if (elem == null) {
    	ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_ctl00ddlFinancialYear", "Select_ctl00ddlFinancialYear failed. Unable to locate object: " + ctl00ddlFinancialYearElem.toString());

    	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_ctl00ddlFinancialYear", "Select_ctl00ddlFinancialYear failed. Unable to locate object: " + ctl00ddlFinancialYearElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00ddlFinancialYearElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(ctl00ddlFinancialYear);
 		
 		
	ExtentReportManager.passStep(m_Driver, "Select_ctl00ddlFinancialYear " + ctl00ddlFinancialYear);

	TestModellerLogger.PassStep(m_Driver, "Select_ctl00ddlFinancialYear " + ctl00ddlFinancialYear);
 	}

     
	/**
 	 * Click xPath: '//*[@id="chAllRTI"]'
     * @name Click xPath: '//*[@id="chAllRTI"]'
     */
	public void Click_xPath_idchAllRTI()
	{
        
		WebElement elem = getWebElement(xPath_idchAllRTIElem);

	if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_xPath_idchAllRTI", "Click_xPath_idchAllRTI failed. Unable to locate object: " + xPath_idchAllRTIElem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_xPath_idchAllRTI", "Click_xPath_idchAllRTI failed. Unable to locate object: " + xPath_idchAllRTIElem.toString());

			Assert.fail("Unable to locate object: " + xPath_idchAllRTIElem.toString());
        }

		elem.click();
          	

	ExtentReportManager.passStep(m_Driver, "Click_xPath_idchAllRTI");

	TestModellerLogger.PassStep(m_Driver, "Click_xPath_idchAllRTI");
	}

     
	/**
 	 * Click xPath: '/html/body/form/main/div[10]/div[3]/header/div/a[1]/i'
     * @name Click xPath: '/html/body/form/main/div[10]/div[3]/header/div/a[1]/i'
     */
	public void Click_xPath_htmlbodyformmaindiv10div3headerdiva1i()
	{
        
		WebElement elem = getWebElement(xPath_htmlbodyformmaindiv10div3headerdiva1iElem);

	if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_xPath_htmlbodyformmaindiv10div3headerdiva1i", "Click_xPath_htmlbodyformmaindiv10div3headerdiva1i failed. Unable to locate object: " + xPath_htmlbodyformmaindiv10div3headerdiva1iElem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_xPath_htmlbodyformmaindiv10div3headerdiva1i", "Click_xPath_htmlbodyformmaindiv10div3headerdiva1i failed. Unable to locate object: " + xPath_htmlbodyformmaindiv10div3headerdiva1iElem.toString());

			Assert.fail("Unable to locate object: " + xPath_htmlbodyformmaindiv10div3headerdiva1iElem.toString());
        }

		elem.click();
		
		sl.popUpHandlingOk(m_Driver);

	ExtentReportManager.passStep(m_Driver, "Click_xPath_htmlbodyformmaindiv10div3headerdiva1i");

	TestModellerLogger.PassStep(m_Driver, "Click_xPath_htmlbodyformmaindiv10div3headerdiva1i");
	}
}