package Trial_Balance;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/231169af-4054-4f78-a13e-5b2978c54202
@TestModellerModule(guid = "231169af-4054-4f78-a13e-5b2978c54202")
public class Pages_TrailBalancereport extends BasePage
{
	public Pages_TrailBalancereport (WebDriver driver)
	{
		super(driver);
	}


	
	private By _Reports_Elem = By.xpath("//*[@id='ctl00_SideMenu1_reportMenu']/a");

	private By Trial_BalanceElem = By.xpath("//*[@id='FincReports']/table/tbody/tr[3]/td/a");

	private By Select_CompareTo_3Elem = By.xpath("//label[normalize-space()= 'As of:']/../select");

	private By Enter_DateFrom_4Elem = By.xpath("//INPUT[@name='ctl00$cPHFilter$txtDateFrom']");

	private By Enter_CompareWith_5Elem = By.xpath("//INPUT[@name='ctl00$cPHFilter$ddlCompareWith']");

	private By Update_6Elem = By.xpath("//A[@id='ctl00_cPHFilter_btnSearchResult']");

	private By Show_Detail_7Elem = By.xpath("//label[normalize-space()= 'Show Detail']/../input");

	private By Export_CSV_8Elem = By.xpath("//A[@id='ctl00_cPHFilter_btnExportComapare']");

	private By Exports_PDF_9Elem = By.xpath("//A[@id='ctl00_cPHFilter_lkbtnExportPeriodsPdf']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/AccountUI/ReportTrialBalance.aspx?FYCode=54743&CompanyCode=14763");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AccountUI/ReportTrialBalance.aspx?FYCode=54743&CompanyCode=14763");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AccountUI/ReportTrialBalance.aspx?FYCode=54743&CompanyCode=14763");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AccountUI/ReportTrialBalance.aspx?FYCode=54743&CompanyCode=14763";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AccountUI/ReportTrialBalance.aspx?FYCode=54743&CompanyCode=14763")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click  Reports 
	 * @throws InterruptedException 
     * @name Click  Reports 
     */
	public void Click__Reports_() throws InterruptedException
	{
        
		WebElement elem = getWebElement(_Reports_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Reports_", "Click__Reports_ failed. Unable to locate object: " + _Reports_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Reports_", "Click__Reports_ failed. Unable to locate object: " + _Reports_Elem.toString());

			Assert.fail("Unable to locate object: " + _Reports_Elem.toString());
        }

		elem.click();
          	Thread.sleep(2000);

		ExtentReportManager.passStep(m_Driver, "Click__Reports_");

		TestModellerLogger.PassStep(m_Driver, "Click__Reports_");
	}

     
	/**
 	 * Click Trial Balance
	 * @throws InterruptedException 
     * @name Click Trial Balance
     */
	public void Click_Trial_Balance() throws InterruptedException
	{
        
		WebElement elem = getWebElement(Trial_BalanceElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Trial_Balance", "Click_Trial_Balance failed. Unable to locate object: " + Trial_BalanceElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Trial_Balance", "Click_Trial_Balance failed. Unable to locate object: " + Trial_BalanceElem.toString());

			Assert.fail("Unable to locate object: " + Trial_BalanceElem.toString());
        }

		elem.click();
          	Thread.sleep(2000);

		ExtentReportManager.passStep(m_Driver, "Click_Trial_Balance");

		TestModellerLogger.PassStep(m_Driver, "Click_Trial_Balance");
	}

    
	/**
 	 * Select Select_CompareTo_3
     * @name Select Select_CompareTo_3
     */
    public void Select_Select_CompareTo_3(String Select_CompareTo_3)
 	{
 	    
 		WebElement elem = getWebElement(Select_CompareTo_3Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Select_CompareTo_3", "Select_Select_CompareTo_3 failed. Unable to locate object: " + Select_CompareTo_3Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Select_CompareTo_3", "Select_Select_CompareTo_3 failed. Unable to locate object: " + Select_CompareTo_3Elem.toString());

 			Assert.fail("Unable to locate object: " + Select_CompareTo_3Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Select_CompareTo_3);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Select_CompareTo_3 " + Select_CompareTo_3);

 		TestModellerLogger.PassStep(m_Driver, "Select_Select_CompareTo_3 " + Select_CompareTo_3);
 	}

      
	/**
 	 * Enter Enter_DateFrom_4
     * @name Enter Enter_DateFrom_4
     */
 	public void Enter_Enter_DateFrom_4(String Enter_DateFrom_4)
 	{
 	    
 		WebElement elem = getWebElement(Enter_DateFrom_4Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_DateFrom_4", "Enter_Enter_DateFrom_4 failed. Unable to locate object: " + Enter_DateFrom_4Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_DateFrom_4", "Enter_Enter_DateFrom_4 failed. Unable to locate object: " + Enter_DateFrom_4Elem.toString());

 			Assert.fail("Unable to locate object: " + Enter_DateFrom_4Elem.toString());
         }

 		elem.sendKeys(Enter_DateFrom_4);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_DateFrom_4 " + Enter_DateFrom_4);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_DateFrom_4 " + Enter_DateFrom_4);
 	}

      
	/**
 	 * Enter Enter_CompareWith_5
     * @name Enter Enter_CompareWith_5
     */
 	public void Enter_Enter_CompareWith_5(String Enter_CompareWith_5)
 	{
 	    
 		WebElement elem = getWebElement(Enter_CompareWith_5Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_CompareWith_5", "Enter_Enter_CompareWith_5 failed. Unable to locate object: " + Enter_CompareWith_5Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_CompareWith_5", "Enter_Enter_CompareWith_5 failed. Unable to locate object: " + Enter_CompareWith_5Elem.toString());

 			Assert.fail("Unable to locate object: " + Enter_CompareWith_5Elem.toString());
         }

 		elem.sendKeys(Enter_CompareWith_5);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_CompareWith_5 " + Enter_CompareWith_5);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_CompareWith_5 " + Enter_CompareWith_5);
 	}

     
	/**
 	 * Click Update_6
     * @name Click Update_6
     */
	public void Click_Update_6()
	{
        
		WebElement elem = getWebElement(Update_6Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Update_6", "Click_Update_6 failed. Unable to locate object: " + Update_6Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Update_6", "Click_Update_6 failed. Unable to locate object: " + Update_6Elem.toString());

			Assert.fail("Unable to locate object: " + Update_6Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Update_6");

		TestModellerLogger.PassStep(m_Driver, "Click_Update_6");
	}

     
	/**
 	 * Click Show Detail_7
     * @name Click Show Detail_7
     */
	public void Click_Show_Detail_7()
	{
        
		WebElement elem = getWebElement(Show_Detail_7Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Show_Detail_7", "Click_Show_Detail_7 failed. Unable to locate object: " + Show_Detail_7Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Show_Detail_7", "Click_Show_Detail_7 failed. Unable to locate object: " + Show_Detail_7Elem.toString());

			Assert.fail("Unable to locate object: " + Show_Detail_7Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Show_Detail_7");

		TestModellerLogger.PassStep(m_Driver, "Click_Show_Detail_7");
	}

     
	/**
 	 * Click Export_CSV_8
     * @name Click Export_CSV_8
     */
	public void Click_Export_CSV_8()
	{
        
		WebElement elem = getWebElement(Export_CSV_8Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Export_CSV_8", "Click_Export_CSV_8 failed. Unable to locate object: " + Export_CSV_8Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Export_CSV_8", "Click_Export_CSV_8 failed. Unable to locate object: " + Export_CSV_8Elem.toString());

			Assert.fail("Unable to locate object: " + Export_CSV_8Elem.toString());
        }

		elem.click();
          	
		
		
		ExtentReportManager.passStep(m_Driver, "Click_Export_CSV_8");

		TestModellerLogger.PassStep(m_Driver, "Click_Export_CSV_8");
	}

     
	/**
 	 * Click Exports_PDF_9
	 * @throws InterruptedException 
     * @name Click Exports_PDF_9
     */
	public void Click_Exports_PDF_9() throws InterruptedException
	{
        
		WebElement elem = getWebElement(Exports_PDF_9Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Exports_PDF_9", "Click_Exports_PDF_9 failed. Unable to locate object: " + Exports_PDF_9Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Exports_PDF_9", "Click_Exports_PDF_9 failed. Unable to locate object: " + Exports_PDF_9Elem.toString());

			Assert.fail("Unable to locate object: " + Exports_PDF_9Elem.toString());
        }

		elem.click();
          	Thread.sleep(2000);
	
		
		ExtentReportManager.passStep(m_Driver, "Click_Exports_PDF_9");

		TestModellerLogger.PassStep(m_Driver, "Click_Exports_PDF_9");
	}
	public void pagesize()
	{
		JavascriptExecutor js = (JavascriptExecutor)m_Driver;
		
		


		js.executeScript("document.body.style.zoom = '50%';");
		
	}
}