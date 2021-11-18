package pages.PartialReconciledCases;

import pages.BasePage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.GetScreenShot;
import utilities.testmodeller.TestModellerLogger;

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/6181ca7e-f9c4-46de-bc82-6aea695ca81f
@TestModellerModule(guid = "6181ca7e-f9c4-46de-bc82-6aea695ca81f")
public class UnreconciledSearch extends BasePage
{
	
	GetScreenShot GC;
	public UnreconciledSearch (WebDriver driver)
	{
		super(driver);
	}


	
	private By Unreconciled_Tran_BTNElem = By.xpath("//DIV[@class='col-md-12 text-right']/A[@class='green_btn manually_add_btn']");

	private By BNK_AccountElem = By.xpath("//SELECT[@id='ctl00_cPHFilter_ddlAccount']");

	private By Date_RangeElem = By.xpath("//SELECT[@id='ctl00_cPHFilter_ddlCompareWithByDateRange']");

	private By DateFrom11Elem = By.xpath("//INPUT[@id='ctl00_cPHFilter_txtDateFrom11']");

	private By DateTo12Elem = By.xpath("//INPUT[@id='ctl00_cPHFilter_txtDateTo11']");

	private By Update_BTNNElem = By.xpath("//INPUT[@id='ctl00_cPHFilter_btnUpdate']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/AccountUI/UnprocessedBankTran.aspx?FYCode=52444&CompanyCode=13236");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AccountUI/UnprocessedBankTran.aspx?FYCode=52444&CompanyCode=13236");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AccountUI/UnprocessedBankTran.aspx?FYCode=52444&CompanyCode=13236");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
//   public void AssertUrl()
//    {
//        String currentUrl = m_Driver.getCurrentUrl();
//        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AccountUI/UnprocessedBankTran.aspx?FYCode=52444&CompanyCode=13236";
//
//        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AccountUI/UnprocessedBankTran.aspx?FYCode=52444&CompanyCode=13236")) {
//            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
//        }
//    }

     
	/**
 	 * Click Unreconciled Tran BTN
	 * @throws InterruptedException 
     * @name Click Unreconciled Tran BTN
     */
	public void Click_Unreconciled_Tran_BTN() throws InterruptedException
	{
        
		WebElement elem = getWebElement(Unreconciled_Tran_BTNElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Unreconciled_Tran_BTN", "Click_Unreconciled_Tran_BTN failed. Unable to locate object: " + Unreconciled_Tran_BTNElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Unreconciled_Tran_BTN", "Click_Unreconciled_Tran_BTN failed. Unable to locate object: " + Unreconciled_Tran_BTNElem.toString());

			Assert.fail("Unable to locate object: " + Unreconciled_Tran_BTNElem.toString());
        }

		elem.click();
          	Thread.sleep(1000);

		ExtentReportManager.passStep(m_Driver, "Click_Unreconciled_Tran_BTN");

		TestModellerLogger.PassStep(m_Driver, "Click_Unreconciled_Tran_BTN");
	}

    
	/**
 	 * Select BNK_Account
     * @name Select BNK_Account
     */
    public void Select_BNK_Account(String BNK_Account)
 	{
 	    
 		WebElement elem = getWebElement(BNK_AccountElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_BNK_Account", "Select_BNK_Account failed. Unable to locate object: " + BNK_AccountElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_BNK_Account", "Select_BNK_Account failed. Unable to locate object: " + BNK_AccountElem.toString());

 			Assert.fail("Unable to locate object: " + BNK_AccountElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(BNK_Account);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_BNK_Account " + BNK_Account);

 		TestModellerLogger.PassStep(m_Driver, "Select_BNK_Account " + BNK_Account);
 	}

    
	/**
 	 * Select Date_Range
     * @name Select Date_Range
     */
    public void Select_Date_Range(String Date_Range)
 	{
 	    
 		WebElement elem = getWebElement(Date_RangeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Date_Range", "Select_Date_Range failed. Unable to locate object: " + Date_RangeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Date_Range", "Select_Date_Range failed. Unable to locate object: " + Date_RangeElem.toString());

 			Assert.fail("Unable to locate object: " + Date_RangeElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Date_Range);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Date_Range " + Date_Range);

 		TestModellerLogger.PassStep(m_Driver, "Select_Date_Range " + Date_Range);
 	}

      
	/**
 	 * Enter DateFrom11
	 * @throws IOException 
     * @name Enter DateFrom11
     */
 	public void Enter_DateFrom11(String DateFrom11) throws IOException
 	{
 	    
 		WebElement elem = getWebElement(DateFrom11Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_DateFrom11", "Enter_DateFrom11 failed. Unable to locate object: " + DateFrom11Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_DateFrom11", "Enter_DateFrom11 failed. Unable to locate object: " + DateFrom11Elem.toString());

 			Assert.fail("Unable to locate object: " + DateFrom11Elem.toString());
         }

 		elem.sendKeys(DateFrom11);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_DateFrom11 " + DateFrom11);

  		TestModellerLogger.PassStep(m_Driver, "Enter_DateFrom11 " + DateFrom11);
  		GetScreenShot.captureAsImage(m_Driver, "NIHDI");
 	}

      
	/**
 	 * Enter DateTo12
	 * @throws IOException 
     * @name Enter DateTo12
     */
 	public void Enter_DateTo12(String DateTo12) throws IOException
 	{
 	    
 		WebElement elem = getWebElement(DateTo12Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_DateTo12", "Enter_DateTo12 failed. Unable to locate object: " + DateTo12Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_DateTo12", "Enter_DateTo12 failed. Unable to locate object: " + DateTo12Elem.toString());

 			Assert.fail("Unable to locate object: " + DateTo12Elem.toString());
         }

 		elem.sendKeys(DateTo12);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_DateTo12 " + DateTo12);

  		TestModellerLogger.PassStep(m_Driver, "Enter_DateTo12 " + DateTo12);
  		GetScreenShot.captureAsImage(m_Driver, "nidhi2");
  		
 	}

     
	/**
 	 * Click Update_BTNN
	 * @throws InterruptedException 
     * @name Click Update_BTNN
     */
	public void Click_Update_BTNN() throws InterruptedException
	{
        
		WebElement elem = getWebElement(Update_BTNNElem);

		if (elem == null) 
		{
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Update_BTNN", "Click_Update_BTNN failed. Unable to locate object: " + Update_BTNNElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Update_BTNN", "Click_Update_BTNN failed. Unable to locate object: " + Update_BTNNElem.toString());

			Assert.fail("Unable to locate object: " + Update_BTNNElem.toString());
        }

		elem.click();
          	
		ExtentReportManager.passStep(m_Driver, "Click_Update_BTNN");

		TestModellerLogger.PassStep(m_Driver, "Click_Update_BTNN");
	}
}