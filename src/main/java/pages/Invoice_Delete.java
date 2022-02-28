package pages;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import Generic.SeleniumLib;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

 //http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/32d541de-e13c-45a3-be45-fa37751333bc
 @TestModellerModule(guid = "32d541de-e13c-45a3-be45-fa37751333bc")
 public class Invoice_Delete extends BasePage
{
	 SeleniumLib sl;
	public Invoice_Delete (WebDriver driver)
	{		super(driver);
	 sl=new SeleniumLib(m_Driver);
	
	}


	
	private By Sales_tabElem1 = By.xpath("//span[text()='Sales']");

	private By SelectFinancialYearElem = By.xpath("//*[@id=\"ctl00_ddlFinancialYear\"]");

	private By checkNtodelElem = By.xpath("//td[@id='ctl00_cPH_rptrDisplayRecords_ctl00_tdChk']/input");

	private By DelImgElem = By.xpath("//I[@class='fa fa-trash report_icon']");

	private By Delete_tabElem = By.xpath("//*[@id=\"ctl00_cpHFooter_btnDelete\"]");

	private By Success_msgElem = By.xpath("//DIV[@class='alert alert-success']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandboxpre.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=8512&CompanyCode=6600&IsFirstRequest=1&vATReturnCodeM=0&VATReturnActionM=&fychanged=t");

	ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandboxpre.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=8512&CompanyCode=6600&IsFirstRequest=1&vATReturnCodeM=0&VATReturnActionM=&fychanged=t");
		
	TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandboxpre.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=8512&CompanyCode=6600&IsFirstRequest=1&vATReturnCodeM=0&VATReturnActionM=&fychanged=t");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandboxpre.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=8512&CompanyCode=6600&IsFirstRequest=1&vATReturnCodeM=0&VATReturnActionM=&fychanged=t";

        if (!currentUrl.equals("http://sandboxpre.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=8512&CompanyCode=6600&IsFirstRequest=1&vATReturnCodeM=0&VATReturnActionM=&fychanged=t")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click Sales tab
     * @name Click Sales tab
     */
	public void Click_Sales_tab()
	{
		JavascriptExecutor js = (JavascriptExecutor)m_Driver;
 		js.executeScript("window.scrollBy(0,-400)");
		WebElement elem = getWebElement(Sales_tabElem1);

	if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Sales_tab", "Click_Sales_tab failed. Unable to locate object: " + Sales_tabElem1.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Sales_tab", "Click_Sales_tab failed. Unable to locate object: " + Sales_tabElem1.toString());

			Assert.fail("Unable to locate object: " + Sales_tabElem1.toString());
        }

		elem.click();
          	

	ExtentReportManager.passStep(m_Driver, "Click_Sales_tab");

	TestModellerLogger.PassStep(m_Driver, "Click_Sales_tab");
	}

    
	/**
 	 * Select SelectFinancialYear
     * @name Select SelectFinancialYear
     */
    public void Select_SelectFinancialYear(String SelectFinancialYear)
 	{
 	    
 		WebElement elem = getWebElement(SelectFinancialYearElem);

 		if (elem == null) {
    	ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_SelectFinancialYear", "Select_SelectFinancialYear failed. Unable to locate object: " + SelectFinancialYearElem.toString());

    	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_SelectFinancialYear", "Select_SelectFinancialYear failed. Unable to locate object: " + SelectFinancialYearElem.toString());

 			Assert.fail("Unable to locate object: " + SelectFinancialYearElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(SelectFinancialYear);
 		
 		
	ExtentReportManager.passStep(m_Driver, "Select_SelectFinancialYear " + SelectFinancialYear);

	TestModellerLogger.PassStep(m_Driver, "Select_SelectFinancialYear " + SelectFinancialYear);
 	sl.ScrollHeight(m_Driver);
 	}

     
	/**
 	 * Click checkNtodel
     * @name Click checkNtodel
     */
	public void Click_checkNtodel()
	{
        
		WebElement elem = getWebElement(checkNtodelElem);

	if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_checkNtodel", "Click_checkNtodel failed. Unable to locate object: " + checkNtodelElem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_checkNtodel", "Click_checkNtodel failed. Unable to locate object: " + checkNtodelElem.toString());

			Assert.fail("Unable to locate object: " + checkNtodelElem.toString());
        }

		elem.click();
          	

	ExtentReportManager.passStep(m_Driver, "Click_checkNtodel");

	TestModellerLogger.PassStep(m_Driver, "Click_checkNtodel");
	}

     
	/**
 	 * Click DelImg
     * @name Click DelImg
     */
	public void Click_DelImg()
	{
        
		WebElement elem = getWebElement(DelImgElem);

	if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_DelImg", "Click_DelImg failed. Unable to locate object: " + DelImgElem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_DelImg", "Click_DelImg failed. Unable to locate object: " + DelImgElem.toString());

			Assert.fail("Unable to locate object: " + DelImgElem.toString());
        }

		elem.click();
          	

	ExtentReportManager.passStep(m_Driver, "Click_DelImg");

	TestModellerLogger.PassStep(m_Driver, "Click_DelImg");
	
	sl.ScrollHeight(m_Driver);
	}

     
	/**
 	 * Click Delete tab
     * @name Click Delete tab
     */
	public void Click_Delete_tab()
	{
        
		WebElement elem = getWebElement(Delete_tabElem);

	if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Delete_tab", "Click_Delete_tab failed. Unable to locate object: " + Delete_tabElem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Delete_tab", "Click_Delete_tab failed. Unable to locate object: " + Delete_tabElem.toString());

			Assert.fail("Unable to locate object: " + Delete_tabElem.toString());
        }

		elem.click();
          	

	ExtentReportManager.passStep(m_Driver, "Click_Delete_tab");

	TestModellerLogger.PassStep(m_Driver, "Click_Delete_tab");
	}

     
	/**
 	 * Click Success! msg
     * @name Click Success! msg
     */
	public void Click_Success_msg()
	{
        
		WebElement elem = getWebElement(Success_msgElem);

	if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Success_msg", "Click_Success_msg failed. Unable to locate object: " + Success_msgElem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Success_msg", "Click_Success_msg failed. Unable to locate object: " + Success_msgElem.toString());

			Assert.fail("Unable to locate object: " + Success_msgElem.toString());
        }

		elem.click();
          	

	ExtentReportManager.passStep(m_Driver, "Click_Success_msg");

	TestModellerLogger.PassStep(m_Driver, "Click_Success_msg");
	}
}