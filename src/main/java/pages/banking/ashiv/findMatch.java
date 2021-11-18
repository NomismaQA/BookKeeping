package pages.banking.ashiv;

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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/dd4c29ae-6bab-40f9-ae5b-6efdd23b4dac
@TestModellerModule(guid = "dd4c29ae-6bab-40f9-ae5b-6efdd23b4dac")
public class findMatch extends BasePage
{
	public findMatch (WebDriver driver)
	{
		super(driver);
	}


	
	private By AmountElem = By.xpath("//label[normalize-space()= 'Amount']/../../div[2]/input");

	private By SearchElem = By.xpath("//label[normalize-space()= '']/../../div[2]/a");

	private By _Elem = By.xpath("//TD[@id='ctl00_cPH_rptrFindMatch_ctl00_tdAmountDue']");

	private By InvoiceNoElem = By.xpath("//label[normalize-space()= 'Reference']/../../div[2]/input");

	private By DateFromElem = By.xpath("//label[normalize-space()= 'Date From']/../../div[2]/input");

	private By DateToElem = By.xpath("//label[normalize-space()= 'Date To']/../../div[2]/input");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AccountUI/UnprocessedBankTran.aspx?FYCode=117338&CompanyCode=17001&ItemsPerPageFstReq=1");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/UnprocessedBankTran.aspx?FYCode=117338&CompanyCode=17001&ItemsPerPageFstReq=1");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/UnprocessedBankTran.aspx?FYCode=117338&CompanyCode=17001&ItemsPerPageFstReq=1");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/AccountUI/UnprocessedBankTran.aspx?FYCode=117338&CompanyCode=17001&ItemsPerPageFstReq=1";

        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/AccountUI/UnprocessedBankTran.aspx?FYCode=117338&CompanyCode=17001&ItemsPerPageFstReq=1")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

      
	/**
 	 * Enter Amount
     * @name Enter Amount
     */
 	public void Enter_Amount(String Amount)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(AmountElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Amount", "Enter_Amount failed. Unable to locate object: " + AmountElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Amount", "Enter_Amount failed. Unable to locate object: " + AmountElem.toString());

 			Assert.fail("Unable to locate object: " + AmountElem.toString());
         }

 		elem.sendKeys(Amount);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Amount " + Amount);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Amount " + Amount);
 	}

     
	/**
 	 * Click Search
     * @name Click Search
     */
	public void Click_Search()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div[2]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(SearchElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Search", "Click_Search failed. Unable to locate object: " + SearchElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Search", "Click_Search failed. Unable to locate object: " + SearchElem.toString());

			Assert.fail("Unable to locate object: " + SearchElem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_Search");

		TestModellerLogger.PassStep(m_Driver, "Click_Search");
	}

     
	/**
 	 * Click  
     * @name Click  
     */
	public void Click__()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div[2]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__", "Click__ failed. Unable to locate object: " + _Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__", "Click__ failed. Unable to locate object: " + _Elem.toString());

			Assert.fail("Unable to locate object: " + _Elem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click__");

		TestModellerLogger.PassStep(m_Driver, "Click__");
	}

      
	/**
 	 * Enter InvoiceNo
     * @name Enter InvoiceNo
     */
 	public void Enter_InvoiceNo(String InvoiceNo)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(InvoiceNoElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_InvoiceNo", "Enter_InvoiceNo failed. Unable to locate object: " + InvoiceNoElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_InvoiceNo", "Enter_InvoiceNo failed. Unable to locate object: " + InvoiceNoElem.toString());

 			Assert.fail("Unable to locate object: " + InvoiceNoElem.toString());
         }

 		elem.sendKeys(InvoiceNo);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_InvoiceNo " + InvoiceNo);

  		TestModellerLogger.PassStep(m_Driver, "Enter_InvoiceNo " + InvoiceNo);
 	}

      
	/**
 	 * Enter DateFrom
     * @name Enter DateFrom
     */
 	public void Enter_DateFrom(String DateFrom)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(DateFromElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_DateFrom", "Enter_DateFrom failed. Unable to locate object: " + DateFromElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_DateFrom", "Enter_DateFrom failed. Unable to locate object: " + DateFromElem.toString());

 			Assert.fail("Unable to locate object: " + DateFromElem.toString());
         }

 		elem.sendKeys(DateFrom);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_DateFrom " + DateFrom);

  		TestModellerLogger.PassStep(m_Driver, "Enter_DateFrom " + DateFrom);
 	}

      
	/**
 	 * Enter DateTo
     * @name Enter DateTo
     */
 	public void Enter_DateTo(String DateTo)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(DateToElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_DateTo", "Enter_DateTo failed. Unable to locate object: " + DateToElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_DateTo", "Enter_DateTo failed. Unable to locate object: " + DateToElem.toString());

 			Assert.fail("Unable to locate object: " + DateToElem.toString());
         }

 		elem.sendKeys(DateTo);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_DateTo " + DateTo);

  		TestModellerLogger.PassStep(m_Driver, "Enter_DateTo " + DateTo);
 	}
}