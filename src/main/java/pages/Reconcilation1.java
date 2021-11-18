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
import utilities.ChangeWindow;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/ce558355-3b68-4396-a673-d7fc47a623f4
@TestModellerModule(guid = "ce558355-3b68-4396-a673-d7fc47a623f4")
public class Reconcilation1 extends BasePage
{
	public Reconcilation1 (WebDriver driver)
	{
		super(driver);
	}


	
	//private By AccountantTABElem = By.xpath("//A[@href='../AccountUI/AccountantDashboard.aspx?FYCode=52512&CompanyCode=13298&IsFirstRequest=1']");
	private By AccountantTABElem = By.xpath("//*[contains(text(),'Accountant')]");
	private By ReconciliationTAB1Elem = By.xpath("//h3[contains(text(), 'Reconciliation')]");

	//private By ReconciliationTAB1Elem = By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div/div[1]/div/div/div/div[2]/div/div/div/table[1]/thead/tr/td/table[1]/tbody/tr/td/a");
	//private By ReconciliationTAB1Elem = By.xpath("//*[contains(text(),'Reconciliation')]");
	
	private By ReconcilationPlus1Elem = By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div/div[1]/div/div/div/div[2]/div/div/div/table[1]/thead/tr/td/table[2]/tbody/tr/td/a");

	private By AccountType1Elem = By.xpath("//SELECT[@name='ctl00$cPHFilter$ddlAccountType']");

	private By Account1Elem = By.xpath("//SELECT[@name='ctl00$cPHFilter$ddlAccount']");

	private By SelectCheck1Elem = By.xpath("//TR[@id='ctl00_cPH_rptrReconcile_ctl00_rptrDebitCredit_ctl00_tr1']/TD/SPAN[@class='Chkbox']");

	private By ClickRecordElem = By.xpath("//A[contains(text(),'49')]");

	private By SelectCheck2Elem = By.xpath("//TR[@id='ctl00_cPH_rptrReconcile_ctl00_rptrDebitCredit_ctl01_tr1']/TD/SPAN[@class='Chkbox']");

	private By ClickRecord2Elem = By.xpath("//A[contains(text(),'48')]");

	private By ReconcileLinkElem = By.xpath("//A[@id='ctl00_cPH_rptrReconcile_ctl00_lnkReconcile']");

	private By ReconcileTypeElem = By.xpath("//SELECT[@name='ctl00$cPH$ddReconcileType']");

	private By ReconcileButton2Elem = By.xpath("//A[@id='ctl00_cphFooter_btnReconcile']");

	private By closeButtonElem = By.xpath("//BUTTON[@id='cboxClose']");

	private By ReconciledTABElem = By.xpath("//A[@id='ctl00_cpHeaderRight_btnReconciled']");


	
	public void GoToUrl()
	{
		m_Driver.get("https://nomisma.cloud.testinsights.io/app/#!/test-modeller/100359");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://nomisma.cloud.testinsights.io/app/#!/test-modeller/100359");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://nomisma.cloud.testinsights.io/app/#!/test-modeller/100359");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "https://nomisma.cloud.testinsights.io/app/#!/test-modeller/100359";

        if (!currentUrl.equals("https://nomisma.cloud.testinsights.io/app/#!/test-modeller/100359")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click AccountantTAB
     * @name Click AccountantTAB
     */
	public void Click_AccountantTAB()
	{
        
		WebElement elem = getWebElement(AccountantTABElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_AccountantTAB", "Click_AccountantTAB failed. Unable to locate object: " + AccountantTABElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_AccountantTAB", "Click_AccountantTAB failed. Unable to locate object: " + AccountantTABElem.toString());

			Assert.fail("Unable to locate object: " + AccountantTABElem.toString());
        }

		elem.click();
		
          	

		ExtentReportManager.passStep(m_Driver, "Click_AccountantTAB");

		TestModellerLogger.PassStep(m_Driver, "Click_AccountantTAB");
	}

     
	/**
 	 * Click ReconciliationTAB1
     * @name Click ReconciliationTAB1
     */
	public void Click_ReconciliationTAB1()
	{
        
		WebElement elem = getWebElement(ReconciliationTAB1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ReconciliationTAB1", "Click_ReconciliationTAB1 failed. Unable to locate object: " + ReconciliationTAB1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ReconciliationTAB1", "Click_ReconciliationTAB1 failed. Unable to locate object: " + ReconciliationTAB1Elem.toString());

			Assert.fail("Unable to locate object: " + ReconciliationTAB1Elem.toString());
        }

		elem.click();
		ChangeWindow.tabswitch(m_Driver); 	

		ExtentReportManager.passStep(m_Driver, "Click_ReconciliationTAB1");

		TestModellerLogger.PassStep(m_Driver, "Click_ReconciliationTAB1");
	}

     
	/**
 	 * Click ReconcilationPlus1
     * @name Click ReconcilationPlus1
     */
	public void Click_ReconcilationPlus1()
	{
        
		WebElement elem = getWebElement(ReconcilationPlus1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ReconcilationPlus1", "Click_ReconcilationPlus1 failed. Unable to locate object: " + ReconcilationPlus1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ReconcilationPlus1", "Click_ReconcilationPlus1 failed. Unable to locate object: " + ReconcilationPlus1Elem.toString());

			Assert.fail("Unable to locate object: " + ReconcilationPlus1Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_ReconcilationPlus1");

		TestModellerLogger.PassStep(m_Driver, "Click_ReconcilationPlus1");
	}

    
	/**
 	 * Select AccountType1
     * @name Select AccountType1
     */
    public void Select_AccountType1(String AccountType1)
 	{
 	    
 		WebElement elem = getWebElement(AccountType1Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_AccountType1", "Select_AccountType1 failed. Unable to locate object: " + AccountType1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_AccountType1", "Select_AccountType1 failed. Unable to locate object: " + AccountType1Elem.toString());

 			Assert.fail("Unable to locate object: " + AccountType1Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(AccountType1);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_AccountType1 " + AccountType1);

 		TestModellerLogger.PassStep(m_Driver, "Select_AccountType1 " + AccountType1);
 	}

    
	/**
 	 * Select Account1
     * @name Select Account1
     */
    public void Select_Account1(String Account1)
 	{
 	    
 		WebElement elem = getWebElement(Account1Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Account1", "Select_Account1 failed. Unable to locate object: " + Account1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Account1", "Select_Account1 failed. Unable to locate object: " + Account1Elem.toString());

 			Assert.fail("Unable to locate object: " + Account1Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Account1);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Account1 " + Account1);

 		TestModellerLogger.PassStep(m_Driver, "Select_Account1 " + Account1);
 	}

     
	/**
 	 * Click SelectCheck1
     * @name Click SelectCheck1
     */
	public void Click_SelectCheck1()
	{
        
		WebElement elem = getWebElement(SelectCheck1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SelectCheck1", "Click_SelectCheck1 failed. Unable to locate object: " + SelectCheck1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SelectCheck1", "Click_SelectCheck1 failed. Unable to locate object: " + SelectCheck1Elem.toString());

			Assert.fail("Unable to locate object: " + SelectCheck1Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_SelectCheck1");

		TestModellerLogger.PassStep(m_Driver, "Click_SelectCheck1");
	}

     
	/**
 	 * Click ClickRecord
     * @name Click ClickRecord
     */
	public void Click_ClickRecord()
	{
        
		WebElement elem = getWebElement(ClickRecordElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClickRecord", "Click_ClickRecord failed. Unable to locate object: " + ClickRecordElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClickRecord", "Click_ClickRecord failed. Unable to locate object: " + ClickRecordElem.toString());

			Assert.fail("Unable to locate object: " + ClickRecordElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_ClickRecord");

		TestModellerLogger.PassStep(m_Driver, "Click_ClickRecord");
	}

     
	/**
 	 * Click SelectCheck2
     * @name Click SelectCheck2
     */
	public void Click_SelectCheck2()
	{
        
		WebElement elem = getWebElement(SelectCheck2Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SelectCheck2", "Click_SelectCheck2 failed. Unable to locate object: " + SelectCheck2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SelectCheck2", "Click_SelectCheck2 failed. Unable to locate object: " + SelectCheck2Elem.toString());

			Assert.fail("Unable to locate object: " + SelectCheck2Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_SelectCheck2");

		TestModellerLogger.PassStep(m_Driver, "Click_SelectCheck2");
	}

     
	/**
 	 * Click ClickRecord2
     * @name Click ClickRecord2
     */
	public void Click_ClickRecord2()
	{
        
		WebElement elem = getWebElement(ClickRecord2Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClickRecord2", "Click_ClickRecord2 failed. Unable to locate object: " + ClickRecord2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClickRecord2", "Click_ClickRecord2 failed. Unable to locate object: " + ClickRecord2Elem.toString());

			Assert.fail("Unable to locate object: " + ClickRecord2Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_ClickRecord2");

		TestModellerLogger.PassStep(m_Driver, "Click_ClickRecord2");
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
 	 * Click ReconcileButton2
     * @name Click ReconcileButton2
     */
	public void Click_ReconcileButton2()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(ReconcileButton2Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ReconcileButton2", "Click_ReconcileButton2 failed. Unable to locate object: " + ReconcileButton2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ReconcileButton2", "Click_ReconcileButton2 failed. Unable to locate object: " + ReconcileButton2Elem.toString());

			Assert.fail("Unable to locate object: " + ReconcileButton2Elem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_ReconcileButton2");

		TestModellerLogger.PassStep(m_Driver, "Click_ReconcileButton2");
	}

     
	/**
 	 * Click closeButton
     * @name Click closeButton
     */
	public void Click_closeButton()
	{
        
		WebElement elem = getWebElement(closeButtonElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_closeButton", "Click_closeButton failed. Unable to locate object: " + closeButtonElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_closeButton", "Click_closeButton failed. Unable to locate object: " + closeButtonElem.toString());

			Assert.fail("Unable to locate object: " + closeButtonElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_closeButton");

		TestModellerLogger.PassStep(m_Driver, "Click_closeButton");
	}

     
	/**
 	 * Click ReconciledTAB
     * @name Click ReconciledTAB
     */
	public void Click_ReconciledTAB()
	{
        
		WebElement elem = getWebElement(ReconciledTABElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ReconciledTAB", "Click_ReconciledTAB failed. Unable to locate object: " + ReconciledTABElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ReconciledTAB", "Click_ReconciledTAB failed. Unable to locate object: " + ReconciledTABElem.toString());

			Assert.fail("Unable to locate object: " + ReconciledTABElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_ReconciledTAB");

		TestModellerLogger.PassStep(m_Driver, "Click_ReconciledTAB");
	}
}