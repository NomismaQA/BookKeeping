package Pages_Income;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/71292d8f-e05f-496a-8301-f1611e96786d
@TestModellerModule(guid = "71292d8f-e05f-496a-8301-f1611e96786d")
public class selectionfordashboard extends BasePage
{
	public selectionfordashboard (WebDriver driver)
	{
		super(driver);
	}


	
	private By selectCustomerElem = By.xpath("//label[normalize-space()= 'Customer:']/../div/select");

	private By SearchcategoryElem = By.xpath("//label[normalize-space()= 'Search Category:']/../div/select");

	private By Select_All_Elem = By.xpath("//BUTTON[@title='UnPaid, Paid, Partially Paid']");

	private By Due_StatusElem = By.xpath("//SELECT[@name='ctl00$cPHFilter$dd_due']");

	private By DateFromElem = By.xpath("//INPUT[@name='ctl00$cPHFilter$txtDateFrom']");

	private By DateToElem = By.xpath("//INPUT[@name='ctl00$cPHFilter$txtDateTo']");

	private By Update_Elem = By.xpath("//label[normalize-space()= '']/../div/a");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=116991&CompanyCode=16668&IsFirstRequest=1");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=116991&CompanyCode=16668&IsFirstRequest=1");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=116991&CompanyCode=16668&IsFirstRequest=1");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=116991&CompanyCode=16668&IsFirstRequest=1";

        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=116991&CompanyCode=16668&IsFirstRequest=1")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

    
	/**
 	 * Select selectCustomer
     * @name Select selectCustomer
     */
    public void Select_selectCustomer(String selectCustomer)
 	{
 	    
 		WebElement elem = getWebElement(selectCustomerElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_selectCustomer", "Select_selectCustomer failed. Unable to locate object: " + selectCustomerElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_selectCustomer", "Select_selectCustomer failed. Unable to locate object: " + selectCustomerElem.toString());

 			Assert.fail("Unable to locate object: " + selectCustomerElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(selectCustomer);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_selectCustomer " + selectCustomer);

 		TestModellerLogger.PassStep(m_Driver, "Select_selectCustomer " + selectCustomer);
 	}

    
	/**
 	 * Select Searchcategory
     * @name Select Searchcategory
     */
    public void Select_Searchcategory(String Searchcategory)
 	{
 	    
 		WebElement elem = getWebElement(SearchcategoryElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Searchcategory", "Select_Searchcategory failed. Unable to locate object: " + SearchcategoryElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Searchcategory", "Select_Searchcategory failed. Unable to locate object: " + SearchcategoryElem.toString());

 			Assert.fail("Unable to locate object: " + SearchcategoryElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Searchcategory);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Searchcategory " + Searchcategory);

 		TestModellerLogger.PassStep(m_Driver, "Select_Searchcategory " + Searchcategory);
 	}

     
	/**
 	 * Click Select All 
     * @name Click Select All 
     */
	public void Click_Select_All_()
	{
        
		WebElement elem = getWebElement(Select_All_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Select_All_", "Click_Select_All_ failed. Unable to locate object: " + Select_All_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Select_All_", "Click_Select_All_ failed. Unable to locate object: " + Select_All_Elem.toString());

			Assert.fail("Unable to locate object: " + Select_All_Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Select_All_");

		TestModellerLogger.PassStep(m_Driver, "Click_Select_All_");
	}

    
	/**
 	 * Select Due_Status
     * @name Select Due_Status
     */
    public void Select_Due_Status(String Due_Status)
 	{
 	    
 		WebElement elem = getWebElement(Due_StatusElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Due_Status", "Select_Due_Status failed. Unable to locate object: " + Due_StatusElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Due_Status", "Select_Due_Status failed. Unable to locate object: " + Due_StatusElem.toString());

 			Assert.fail("Unable to locate object: " + Due_StatusElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Due_Status);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Due_Status " + Due_Status);

 		TestModellerLogger.PassStep(m_Driver, "Select_Due_Status " + Due_Status);
 	}

      
	/**
 	 * Enter DateFrom
     * @name Enter DateFrom
     */
 	public void Enter_DateFrom(String DateFrom)
 	{
 	    
 		WebElement elem = getWebElement(DateFromElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_DateFrom", "Enter_DateFrom failed. Unable to locate object: " + DateFromElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_DateFrom", "Enter_DateFrom failed. Unable to locate object: " + DateFromElem.toString());

 			Assert.fail("Unable to locate object: " + DateFromElem.toString());
         }
 		for(int i=0;i<10;i++)
 		{
 			elem.sendKeys(Keys.BACK_SPACE);
 		}
 		elem.sendKeys(DateFrom);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_DateFrom " + DateFrom);

  		TestModellerLogger.PassStep(m_Driver, "Enter_DateFrom " + DateFrom);
 	}

      
	/**
 	 * Enter DateTo
     * @name Enter DateTo
     */
 	public void Enter_DateTo(String DateTo)
 	{
 	    
 		WebElement elem = getWebElement(DateToElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_DateTo", "Enter_DateTo failed. Unable to locate object: " + DateToElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_DateTo", "Enter_DateTo failed. Unable to locate object: " + DateToElem.toString());

 			Assert.fail("Unable to locate object: " + DateToElem.toString());
         }

 		for(int i=0;i<10;i++)
 		{
 			elem.sendKeys(Keys.BACK_SPACE);
 		}
 		elem.sendKeys(DateTo);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_DateTo " + DateTo);

  		TestModellerLogger.PassStep(m_Driver, "Enter_DateTo " + DateTo);
 	}

     
	/**
 	 * Click Update 
	 * @throws InterruptedException 
     * @name Click Update 
     */
	public void Click_Update_() throws InterruptedException
	{
        
		WebElement elem = getWebElement(Update_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Update_", "Click_Update_ failed. Unable to locate object: " + Update_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Update_", "Click_Update_ failed. Unable to locate object: " + Update_Elem.toString());

			Assert.fail("Unable to locate object: " + Update_Elem.toString());
        }

		elem.click();
          	Thread.sleep(3000);

		ExtentReportManager.passStep(m_Driver, "Click_Update_");

		TestModellerLogger.PassStep(m_Driver, "Click_Update_");
	}
}