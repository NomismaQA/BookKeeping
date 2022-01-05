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

 //http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/7008e93e-d855-4afe-9ece-da0e56161b81
 @TestModellerModule(guid = "7008e93e-d855-4afe-9ece-da0e56161b81")
 public class verifyBS extends BasePage
{
	public verifyBS (WebDriver driver)
	{		super(driver);
	}


	
	private By Reports_tabElem = By.xpath("//LI[@id='ctl00_SideMenu1_reportMenu']/A/SPAN[@class='side_nav_text']");

	private By Balance_Sheet_linkElem = By.xpath("//div[@id='FincReports']//tbody/tr//a[text()='Balance Sheet']");

	private By selectFinancialYearElem = By.xpath("//*[@id=\"ctl00_ddlFinancialYear\"]");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandboxpre.nomismasolution.co.uk/AccountUI/ReportBalanceSheet.aspx?FYCode=8510&CompanyCode=6600");

	ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandboxpre.nomismasolution.co.uk/AccountUI/ReportBalanceSheet.aspx?FYCode=8510&CompanyCode=6600");
		
	TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandboxpre.nomismasolution.co.uk/AccountUI/ReportBalanceSheet.aspx?FYCode=8510&CompanyCode=6600");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandboxpre.nomismasolution.co.uk/AccountUI/ReportBalanceSheet.aspx?FYCode=8510&CompanyCode=6600";

        if (!currentUrl.equals("http://sandboxpre.nomismasolution.co.uk/AccountUI/ReportBalanceSheet.aspx?FYCode=8510&CompanyCode=6600")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click Reports tab
     * @name Click Reports tab
     */
	public void Click_Reports_tab()
	{
        
		WebElement elem = getWebElement(Reports_tabElem);

	if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Reports_tab", "Click_Reports_tab failed. Unable to locate object: " + Reports_tabElem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Reports_tab", "Click_Reports_tab failed. Unable to locate object: " + Reports_tabElem.toString());

			Assert.fail("Unable to locate object: " + Reports_tabElem.toString());
        }

		elem.click();
          	

	ExtentReportManager.passStep(m_Driver, "Click_Reports_tab");

	TestModellerLogger.PassStep(m_Driver, "Click_Reports_tab");
	}

     
	/**
 	 * Click Balance Sheet link
     * @name Click Balance Sheet link
     */
	public void Click_Balance_Sheet_link()
	{
        
		WebElement elem = getWebElement(Balance_Sheet_linkElem);

	if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Balance_Sheet_link", "Click_Balance_Sheet_link failed. Unable to locate object: " + Balance_Sheet_linkElem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Balance_Sheet_link", "Click_Balance_Sheet_link failed. Unable to locate object: " + Balance_Sheet_linkElem.toString());

			Assert.fail("Unable to locate object: " + Balance_Sheet_linkElem.toString());
        }

		elem.click();
          	

	ExtentReportManager.passStep(m_Driver, "Click_Balance_Sheet_link");

	TestModellerLogger.PassStep(m_Driver, "Click_Balance_Sheet_link");
	}

	public void CSVDownload()
	{
		m_Driver.findElement(By.xpath("//*[@id='ctl00_cPHFilter_btnExport']/i")).click();
	}
    

	
		/**
	}
 	 * Select selectFinancialYear
     * @name Select selectFinancialYear
     */
    public void Select_selectFinancialYear(String selectFinancialYear)
 	{
 	    
 		WebElement elem = getWebElement(selectFinancialYearElem);

 		if (elem == null) {
    	ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_selectFinancialYear", "Select_selectFinancialYear failed. Unable to locate object: " + selectFinancialYearElem.toString());

    	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_selectFinancialYear", "Select_selectFinancialYear failed. Unable to locate object: " + selectFinancialYearElem.toString());

 			Assert.fail("Unable to locate object: " + selectFinancialYearElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(selectFinancialYear);
 		
 		
	ExtentReportManager.passStep(m_Driver, "Select_selectFinancialYear " + selectFinancialYear);

	TestModellerLogger.PassStep(m_Driver, "Select_selectFinancialYear " + selectFinancialYear);
 	}
}