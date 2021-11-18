package pages.PartialReconciledCases;

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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/b7a8cac9-7e47-4cfc-a56b-b498e7bcb701
@TestModellerModule(guid = "b7a8cac9-7e47-4cfc-a56b-b498e7bcb701")
public class NewReconcilation extends BasePage
{
	public NewReconcilation (WebDriver driver)
	{
		super(driver);
	}


	
	private By SelectALLElem = By.xpath("//INPUT[@id='ctl00_cPH_chkReconcileUngroupSelected']");

	private By ReconcileSelectedElem = By.xpath("//A[@id='ctl00_cPH_lnkReconcileSelected']");

	private By UngroupSelectedElem = By.xpath("//A[@id='ctl00_cPH_lnkUngroupSelected']");

	private By R1Elem = By.xpath("//INPUT[@id='ctl00_cPH_rptrReconcile_ctl00_rptrDebitCredit_ctl00_cbSelect']");

	private By R2Elem = By.xpath("//INPUT[@id='ctl00_cPH_rptrReconcile_ctl00_rptrDebitCredit_ctl01_cbSelect']");

	private By ReconcileLinkElem = By.xpath("//A[@id='ctl00_cPH_rptrReconcile_ctl00_lnkReconcile']");

	private By ReconcileTypeElem = By.xpath("//SELECT[@name='ctl00$cPH$ddReconcileType']");

	private By ReconcileButtonElem = By.xpath("//A[@id='ctl00_cphFooter_btnReconcile']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/AccountUI/Reconcile.aspx?FYCode=52604&CompanyCode=13371&s=3");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AccountUI/Reconcile.aspx?FYCode=52604&CompanyCode=13371&s=3");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AccountUI/Reconcile.aspx?FYCode=52604&CompanyCode=13371&s=3");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AccountUI/Reconcile.aspx?FYCode=52604&CompanyCode=13371&s=3";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AccountUI/Reconcile.aspx?FYCode=52604&CompanyCode=13371&s=3")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click SelectALL
     * @name Click SelectALL
     */
	public void Click_SelectALL()
	{
        
		WebElement elem = getWebElement(SelectALLElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SelectALL", "Click_SelectALL failed. Unable to locate object: " + SelectALLElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SelectALL", "Click_SelectALL failed. Unable to locate object: " + SelectALLElem.toString());

			Assert.fail("Unable to locate object: " + SelectALLElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_SelectALL");

		TestModellerLogger.PassStep(m_Driver, "Click_SelectALL");
	}

     
	/**
 	 * Click ReconcileSelected
     * @name Click ReconcileSelected
     */
	public void Click_ReconcileSelected()
	{
        
		WebElement elem = getWebElement(ReconcileSelectedElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ReconcileSelected", "Click_ReconcileSelected failed. Unable to locate object: " + ReconcileSelectedElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ReconcileSelected", "Click_ReconcileSelected failed. Unable to locate object: " + ReconcileSelectedElem.toString());

			Assert.fail("Unable to locate object: " + ReconcileSelectedElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_ReconcileSelected");

		TestModellerLogger.PassStep(m_Driver, "Click_ReconcileSelected");
	}

     
	/**
 	 * Click UngroupSelected
     * @name Click UngroupSelected
     */
	public void Click_UngroupSelected()
	{
        
		WebElement elem = getWebElement(UngroupSelectedElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_UngroupSelected", "Click_UngroupSelected failed. Unable to locate object: " + UngroupSelectedElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_UngroupSelected", "Click_UngroupSelected failed. Unable to locate object: " + UngroupSelectedElem.toString());

			Assert.fail("Unable to locate object: " + UngroupSelectedElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_UngroupSelected");

		TestModellerLogger.PassStep(m_Driver, "Click_UngroupSelected");
	}

     
	/**
 	 * Click R1
     * @name Click R1
     */
	public void Click_R1()
	{
        
		WebElement elem = getWebElement(R1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_R1", "Click_R1 failed. Unable to locate object: " + R1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_R1", "Click_R1 failed. Unable to locate object: " + R1Elem.toString());

			Assert.fail("Unable to locate object: " + R1Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_R1");

		TestModellerLogger.PassStep(m_Driver, "Click_R1");
	}

     
	/**
 	 * Click R2
     * @name Click R2
     */
	public void Click_R2()
	{
        
		WebElement elem = getWebElement(R2Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_R2", "Click_R2 failed. Unable to locate object: " + R2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_R2", "Click_R2 failed. Unable to locate object: " + R2Elem.toString());

			Assert.fail("Unable to locate object: " + R2Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_R2");

		TestModellerLogger.PassStep(m_Driver, "Click_R2");
	}

     
	/**
 	 * Click ReconcileLink
     * @name Click ReconcileLink
     */
	public void Click_ReconcileLink()
	{
        
		WebElement elem = getWebElement(ReconcileLinkElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ReconcileLink", "Click_ReconcileLink failed. Unable to locate object: " + ReconcileLinkElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ReconcileLink", "Click_ReconcileLink failed. Unable to locate object: " + ReconcileLinkElem.toString());

			Assert.fail("Unable to locate object: " + ReconcileLinkElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_ReconcileLink");

		TestModellerLogger.PassStep(m_Driver, "Click_ReconcileLink");
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
}