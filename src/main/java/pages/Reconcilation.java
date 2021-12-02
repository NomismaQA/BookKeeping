package pages;

import pages.BasePage;

import java.awt.ContainerOrderFocusTraversalPolicy;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.ClosePopup;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/ae1a1fe9-2c6b-4b2b-9008-59046981bac7
@TestModellerModule(guid = "ae1a1fe9-2c6b-4b2b-9008-59046981bac7")
public class Reconcilation extends BasePage
{
	public Reconcilation (WebDriver driver)
	{
		super(driver);
	}

	//private By AcntantleftmenuElem = By.xpath("//LI[@id='ctl00_SideMenu1_accountantMenu']/A");
	
	private By AcntantleftmenuElem=By.xpath("//*[@id='ctl00_SideMenu1_accountantMenu']/a/span");
	private By Reconcilationlink1Elem = By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div/div[1]/div/div/div/div[2]/div/div/div/table[1]/thead/tr/td/table[1]/tbody/tr/td/a");

//	private By plussignElem = By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div/div[1]/div/div/div/div[2]/div/div/div/table[1]/thead/tr/td/table[2]/tbody/tr/td/a");
	private By plussignElem = By.xpath("//*[@id='ctl00_cPH_Divtab']/div/div[2]/div/div/div/table[2]/tbody/tr/td/table[2]/tbody/tr/td/a/i");
	private By SelectAccountType1Elem = By.xpath("//SELECT[@name='ctl00$cPHFilter$ddlAccountType']");

	private By SelectAccount1Elem = By.xpath("//SELECT[@id='ctl00_cPHFilter_ddlAccount']");

	private By View_Reconciled_button1Elem = By.xpath("//A[@id='ctl00_cpHeaderRight_btnReconciled']");

	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AccountUI/Reconcile.aspx?FYCode=52444&CompanyCode=13236&s=3");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/Reconcile.aspx?FYCode=52444&CompanyCode=13236&s=3");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/Reconcile.aspx?FYCode=52444&CompanyCode=13236&s=3");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
//   public void AssertUrl()
//    {
//        String currentUrl = m_Driver.getCurrentUrl();
//        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AccountUI/Reconcile.aspx?FYCode=52444&CompanyCode=13236&s=3";
//
//        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AccountUI/Reconcile.aspx?FYCode=52444&CompanyCode=13236&s=3")) {
//            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
//        }
//    }

     
	/**
 	 * Click Acntantleftmenu
     * @name Click Acntantleftmenu
     */
	public void Click_Acntantleftmenu()
	{
        
		WebElement elem = getWebElement(AcntantleftmenuElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Acntantleftmenu", "Click_Acntantleftmenu failed. Unable to locate object: " + AcntantleftmenuElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Acntantleftmenu", "Click_Acntantleftmenu failed. Unable to locate object: " + AcntantleftmenuElem.toString());

			Assert.fail("Unable to locate object: " + AcntantleftmenuElem.toString());
        }
		ClosePopup.ValidateAndPopUp(m_Driver);
		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Acntantleftmenu");

		TestModellerLogger.PassStep(m_Driver, "Click_Acntantleftmenu");
	}

     
	/**
 	 * Click Reconcilationlink1
	 * @throws InterruptedException 
     * @name Click Reconcilationlink1
     */
//	public void Click_Reconcilationlink1() throws InterruptedException
//	{
//        
//		WebElement elem = getWebElement(Reconcilationlink1Elem);
//
//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Reconcilationlink1", "Click_Reconcilationlink1 failed. Unable to locate object: " + Reconcilationlink1Elem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Reconcilationlink1", "Click_Reconcilationlink1 failed. Unable to locate object: " + Reconcilationlink1Elem.toString());
//
//			Assert.fail("Unable to locate object: " + Reconcilationlink1Elem.toString());
//        }
//
//		elem.click();
//		Thread.sleep(2000);
//
//		ExtentReportManager.passStep(m_Driver, "Click_Reconcilationlink1");
//
//		TestModellerLogger.PassStep(m_Driver, "Click_Reconcilationlink1");
//	}

     
	/**
 	 * Click plussign
	 * @throws InterruptedException 
     * @name Click plussign
     */
	public void Click_plussign() throws InterruptedException
	{
        
		WebElement elem = getWebElement(plussignElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_plussign", "Click_plussign failed. Unable to locate object: " + plussignElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_plussign", "Click_plussign failed. Unable to locate object: " + plussignElem.toString());

			Assert.fail("Unable to locate object: " + plussignElem.toString());
        }

		
		jsExec.executeScript("arguments[0].click()", elem);
		Library.tabswitch1(m_Driver);

	ExtentReportManager.passStep(m_Driver, "Click_plussign");

		TestModellerLogger.PassStep(m_Driver, "Click_plussign");
	}

    
	/**
 	 * Select SelectAccountType1
	 * @throws InterruptedException 
     * @name Select SelectAccountType1
     */
    public void Select_SelectAccountType1(String SelectAccountType1) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(SelectAccountType1Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_SelectAccountType1", "Select_SelectAccountType1 failed. Unable to locate object: " + SelectAccountType1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_SelectAccountType1", "Select_SelectAccountType1 failed. Unable to locate object: " + SelectAccountType1Elem.toString());

 			Assert.fail("Unable to locate object: " + SelectAccountType1Elem.toString());
         }
 		elem.sendKeys(Keys.ENTER);
 		Thread.sleep(1000);
 	
 	 		//String v=SelectAccountType1;
 		//m_Driver.findElement(By.xpath("//*[contains(text(),'" +v+ "')]")).click();
	Select dropdown = new Select(elem);
//
dropdown.selectByVisibleText(SelectAccountType1);
 		
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_SelectAccountType1 " + SelectAccountType1);

 		TestModellerLogger.PassStep(m_Driver, "Select_SelectAccountType1 " + SelectAccountType1);
 	}

    
	/**
 	 * Select SelectAccount1
	 * @throws InterruptedException 
     * @name Select SelectAccount1
     */
    public void Select_SelectAccount1(String SelectAccount1) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(SelectAccount1Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_SelectAccount1", "Select_SelectAccount1 failed. Unable to locate object: " + SelectAccount1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_SelectAccount1", "Select_SelectAccount1 failed. Unable to locate object: " + SelectAccount1Elem.toString());

 			Assert.fail("Unable to locate object: " + SelectAccount1Elem.toString());
         }
 		
// 		elem.sendKeys(Keys.ENTER);
// 		Thread.sleep(1000);
// 		
// 		Select dropdown = new Select(elem);
//
// 		dropdown.selectByVisibleText(SelectAccount1);
 		
 		
	elem.sendKeys(Keys.ENTER);
	
	elem.sendKeys(Keys.DOWN);
	
	elem.sendKeys(Keys.ARROW_DOWN,Keys.RETURN);
//	
//	Thread.sleep(1000);
//	elem.sendKeys(Keys.ARROW_DOWN);
//String k=SelectAccount1;
//m_Driver.findElement(By.xpath("//*[contains(text(),'" +k+ "')]")).click();
//   Select dropdown = new Select(elem);
//   
//
// 		dropdown.selectByVisibleText(SelectAccount1);
		


 	
 		
 		ExtentReportManager.passStep(m_Driver, "Select_SelectAccount1 " + SelectAccount1);

 		TestModellerLogger.PassStep(m_Driver, "Select_SelectAccount1 " + SelectAccount1);
 	}

     
	private String Contains(Object text, String string) {
		// TODO Auto-generated method stub
		return null;
	}


	private Object text() {
		// TODO Auto-generated method stub
		return null;
	}


	/**
 	 * Click View Reconciled button1
     * @name Click View Reconciled button1
     */
	public void Click_View_Reconciled_button1()
	{
        
		WebElement elem = getWebElement(View_Reconciled_button1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_View_Reconciled_button1", "Click_View_Reconciled_button1 failed. Unable to locate object: " + View_Reconciled_button1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_View_Reconciled_button1", "Click_View_Reconciled_button1 failed. Unable to locate object: " + View_Reconciled_button1Elem.toString());

			Assert.fail("Unable to locate object: " + View_Reconciled_button1Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_View_Reconciled_button1");

		TestModellerLogger.PassStep(m_Driver, "Click_View_Reconciled_button1");
	}
}