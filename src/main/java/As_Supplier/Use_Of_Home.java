package As_Supplier;

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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/e55da922-3f20-49f2-b165-77bacd74c69c
@TestModellerModule(guid = "e55da922-3f20-49f2-b165-77bacd74c69c")
public class Use_Of_Home extends BasePage
{
	public Use_Of_Home (WebDriver driver)
	{
		super(driver);
	}


	
	private By ExpenditureElem = By.xpath("//*[@id='ctl00_SideMenu1_ExpensesMenu']/a/span");

	private By View_Elem = By.xpath("//*[@id='ctl00_divMainContent']/header/div/div[3]/a");

	private By Use_of_Home_as_OfficeElem = By.xpath("//A[contains(text(),'Use of Home as Office')]");

	private By SelectPersonElem = By.xpath("//label[normalize-space()= 'Employee:']/../div/select");

	private By SelectStatusElem = By.xpath("//label[normalize-space()= 'Status:']/../div/select");

	private By Enter_AddressElem = By.xpath("//label[normalize-space()= 'Address:']/../div/input");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AccountUI/HomeAsOfficeConfig.aspx?FYCode=117466&CompanyCode=17129");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/HomeAsOfficeConfig.aspx?FYCode=117466&CompanyCode=17129");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/HomeAsOfficeConfig.aspx?FYCode=117466&CompanyCode=17129");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/AccountUI/HomeAsOfficeConfig.aspx?FYCode=117466&CompanyCode=17129";

        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/AccountUI/HomeAsOfficeConfig.aspx?FYCode=117466&CompanyCode=17129")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click Expenditure
     * @name Click Expenditure
     */
	public void Click_Expenditure()
	{
        
		WebElement elem = getWebElement(ExpenditureElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Expenditure", "Click_Expenditure failed. Unable to locate object: " + ExpenditureElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Expenditure", "Click_Expenditure failed. Unable to locate object: " + ExpenditureElem.toString());

			Assert.fail("Unable to locate object: " + ExpenditureElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Expenditure");

		TestModellerLogger.PassStep(m_Driver, "Click_Expenditure");
	}

     
	/**
 	 * Click View 
     * @name Click View 
     */
	public void Click_View_()
	{
        
		WebElement elem = getWebElement(View_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_View_", "Click_View_ failed. Unable to locate object: " + View_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_View_", "Click_View_ failed. Unable to locate object: " + View_Elem.toString());

			Assert.fail("Unable to locate object: " + View_Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_View_");

		TestModellerLogger.PassStep(m_Driver, "Click_View_");
	}

     
	/**
 	 * Click Use of Home as Office
     * @name Click Use of Home as Office
     */
	public void Click_Use_of_Home_as_Office()
	{
        
		WebElement elem = getWebElement(Use_of_Home_as_OfficeElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Use_of_Home_as_Office", "Click_Use_of_Home_as_Office failed. Unable to locate object: " + Use_of_Home_as_OfficeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Use_of_Home_as_Office", "Click_Use_of_Home_as_Office failed. Unable to locate object: " + Use_of_Home_as_OfficeElem.toString());

			Assert.fail("Unable to locate object: " + Use_of_Home_as_OfficeElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Use_of_Home_as_Office");

		TestModellerLogger.PassStep(m_Driver, "Click_Use_of_Home_as_Office");
	}

    
	/**
 	 * Select SelectPerson
     * @name Select SelectPerson
     */
    public void Select_SelectPerson(String SelectPerson)
 	{
 	    
 		WebElement elem = getWebElement(SelectPersonElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_SelectPerson", "Select_SelectPerson failed. Unable to locate object: " + SelectPersonElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_SelectPerson", "Select_SelectPerson failed. Unable to locate object: " + SelectPersonElem.toString());

 			Assert.fail("Unable to locate object: " + SelectPersonElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(SelectPerson);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_SelectPerson " + SelectPerson);

 		TestModellerLogger.PassStep(m_Driver, "Select_SelectPerson " + SelectPerson);
 	}

    
	/**
 	 * Select SelectStatus
     * @name Select SelectStatus
     */
    public void Select_SelectStatus(String SelectStatus)
 	{
 	    
 		WebElement elem = getWebElement(SelectStatusElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_SelectStatus", "Select_SelectStatus failed. Unable to locate object: " + SelectStatusElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_SelectStatus", "Select_SelectStatus failed. Unable to locate object: " + SelectStatusElem.toString());

 			Assert.fail("Unable to locate object: " + SelectStatusElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(SelectStatus);
 		
 		String Msg=elem.getText();
 		System.out.println(Msg);
 		
 		ExtentReportManager.passStep(m_Driver, "Select_SelectStatus " + SelectStatus);

 		TestModellerLogger.PassStep(m_Driver, "Select_SelectStatus " + SelectStatus);
 	}

      
	/**
 	 * Enter Enter Address
     * @name Enter Enter Address
     */
 	public void Enter_Enter_Address(String Enter_Address)
 	{
 	    
 		WebElement elem = getWebElement(Enter_AddressElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_Address", "Enter_Enter_Address failed. Unable to locate object: " + Enter_AddressElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_Address", "Enter_Enter_Address failed. Unable to locate object: " + Enter_AddressElem.toString());

 			Assert.fail("Unable to locate object: " + Enter_AddressElem.toString());
         }

 		elem.sendKeys(Enter_Address);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_Address " + Enter_Address);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_Address " + Enter_Address);
 	}
 	
 	 public void Select_SelectStatusCheak() throws InterruptedException
  	{
  	    
  		WebElement elem = getWebElement(SelectStatusElem);
  		
  		elem.click();
  		Thread.sleep(3000);
  		System.out.println("Click ");
  		utilities.Screenshotcapture.Getscreenshot("Active & In-Active both should be in the dropdown", "Use of Home");
  		
 	
  	}
}