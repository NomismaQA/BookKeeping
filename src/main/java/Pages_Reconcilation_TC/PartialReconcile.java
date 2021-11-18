package Pages_Reconcilation_TC;

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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/8cd96554-55d6-4464-9295-55c544a83c5d
@TestModellerModule(guid = "8cd96554-55d6-4464-9295-55c544a83c5d")
public class PartialReconcile extends BasePage
{
	public PartialReconcile (WebDriver driver)
	{
		super(driver);
	}


	
	private By ReconcileTypeElem = By.xpath("//SELECT[@name='ctl00$cPH$ddReconcileType']");

	private By ReconcileButtonElem = By.xpath("//A[@id='ctl00_cphFooter_btnReconcile']");
	

	private By CancelButtonElem = By.xpath("//A[@id='ctl00_cphFooter_btnCancel']");

	private By JournalEntryDateElem = By.xpath("//INPUT[@name='ctl00$cPH$txtJEDate']");

	private By CloseFramebuttonElem = By.xpath("//BUTTON[@id='cboxClose']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/AccountUI/Reconcile.aspx?FYCode=52589&CompanyCode=13360&s=3");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AccountUI/Reconcile.aspx?FYCode=52589&CompanyCode=13360&s=3");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AccountUI/Reconcile.aspx?FYCode=52589&CompanyCode=13360&s=3");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AccountUI/Reconcile.aspx?FYCode=52589&CompanyCode=13360&s=3";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AccountUI/Reconcile.aspx?FYCode=52589&CompanyCode=13360&s=3")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

    
	/**
 	 * Select ReconcileType
     * @name Select ReconcileType
     */
    public void Select_ReconcileType(String ReconcileType)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(ReconcileTypeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_ReconcileType", "Select_ReconcileType failed. Unable to locate object: " + ReconcileTypeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_ReconcileType", "Select_ReconcileType failed. Unable to locate object: " + ReconcileTypeElem.toString());

 			Assert.fail("Unable to locate object: " + ReconcileTypeElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(ReconcileType);
 		
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_ReconcileType " + ReconcileType);

 		TestModellerLogger.PassStep(m_Driver, "Select_ReconcileType " + ReconcileType);
 	}

     
	/**
 	 * Click ReconcileButton
     * @name Click ReconcileButton
     */
	public void Click_ReconcileButton()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(ReconcileButtonElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ReconcileButton", "Click_ReconcileButton failed. Unable to locate object: " + ReconcileButtonElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ReconcileButton", "Click_ReconcileButton failed. Unable to locate object: " + ReconcileButtonElem.toString());

			Assert.fail("Unable to locate object: " + ReconcileButtonElem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_ReconcileButton");

		TestModellerLogger.PassStep(m_Driver, "Click_ReconcileButton");
	}

     
	/**
 	 * Click CancelButton
     * @name Click CancelButton
     */
	public void Click_CancelButton()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(CancelButtonElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_CancelButton", "Click_CancelButton failed. Unable to locate object: " + CancelButtonElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_CancelButton", "Click_CancelButton failed. Unable to locate object: " + CancelButtonElem.toString());

			Assert.fail("Unable to locate object: " + CancelButtonElem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_CancelButton");

		TestModellerLogger.PassStep(m_Driver, "Click_CancelButton");
	}

      
	/**
 	 * Enter JournalEntryDate
     * @name Enter JournalEntryDate
     */
 	public void Enter_JournalEntryDate(String JournalEntryDate)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(JournalEntryDateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_JournalEntryDate", "Enter_JournalEntryDate failed. Unable to locate object: " + JournalEntryDateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_JournalEntryDate", "Enter_JournalEntryDate failed. Unable to locate object: " + JournalEntryDateElem.toString());

 			Assert.fail("Unable to locate object: " + JournalEntryDateElem.toString());
         }

 		elem.sendKeys(JournalEntryDate);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_JournalEntryDate " + JournalEntryDate);

  		TestModellerLogger.PassStep(m_Driver, "Enter_JournalEntryDate " + JournalEntryDate);
 	}

     
	/**
 	 * Click CloseFramebutton
     * @name Click CloseFramebutton
     */
	public void Click_CloseFramebutton()
	{
        
		WebElement elem = getWebElement(CloseFramebuttonElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_CloseFramebutton", "Click_CloseFramebutton failed. Unable to locate object: " + CloseFramebuttonElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_CloseFramebutton", "Click_CloseFramebutton failed. Unable to locate object: " + CloseFramebuttonElem.toString());

			Assert.fail("Unable to locate object: " + CloseFramebuttonElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_CloseFramebutton");

		TestModellerLogger.PassStep(m_Driver, "Click_CloseFramebutton");
	}
}