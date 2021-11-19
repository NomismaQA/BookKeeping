package pages.Currency_Multi;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.ClosePopup;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/30e6e990-19ba-4a1f-a3c9-6836aa561091
@TestModellerModule(guid = "30e6e990-19ba-4a1f-a3c9-6836aa561091")
public class bankmenu extends BasePage
{
	public bankmenu (WebDriver driver)
	{
		super(driver);
	}
	private By New_TransactionclickElem = By.xpath("//A[contains(text(),'New Transaction')]");

	
	private By BankingmenuElem = By.xpath("//*[@id='ctl00_SideMenu1_bankingMenu']/a");
	
	private By NewmenuElem = By.xpath("//*[@id='ctl00_divMainContent']/header/div/div[2]/a");
	

	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/AccountUI/BankTran.aspx?FYCode=52408&CompanyCode=13236&IsFirstRequest=1");
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AccountUI/BankTran.aspx?FYCode=52444&CompanyCode=13236&IsFirstRequest=1");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/BankTran.aspx?FYCode=52408&CompanyCode=13236&IsFirstRequest=1");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/BankTran.aspx?FYCode=52408&CompanyCode=13236&IsFirstRequest=1");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
//   public void AssertUrl()
//    {
//        String currentUrl = m_Driver.getCurrentUrl();
//        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AccountUI/BankTran.aspx?FYCode=52408&CompanyCode=13236&IsFirstRequest=1";
//
//        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AccountUI/BankTran.aspx?FYCode=52408&CompanyCode=13236&IsFirstRequest=1")) {
//            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
//        }
//    }

     
	/**
 	 * Click Bankingmenu
	 * @throws InterruptedException 
     * @name Click Bankingmenu
     */
	public void Click_Bankingmenu() throws InterruptedException
	{
        
		WebElement elem = getWebElement(BankingmenuElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Bankingmenu", "Click_Bankingmenu failed. Unable to locate object: " + BankingmenuElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Bankingmenu", "Click_Bankingmenu failed. Unable to locate object: " + BankingmenuElem.toString());

			Assert.fail("Unable to locate object: " + BankingmenuElem.toString());
        }
		
		ClosePopup.ValidateAndPopUp(m_Driver);
		 
		elem.click();
		
          	

		ExtentReportManager.passStep(m_Driver, "Click_Bankingmenu");

		TestModellerLogger.PassStep(m_Driver, "Click_Bankingmenu");
	}

     
	/**
 	 * Click Newmenu
	 * @throws InterruptedException 
     * @name Click Newmenu
     */
	public void Click_Newmenu() throws InterruptedException
	{
        
		WebElement elem = getWebElement(NewmenuElem);

//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Newmenu", "Click_Newmenu failed. Unable to locate object: " + NewmenuElem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Newmenu", "Click_Newmenu failed. Unable to locate object: " + NewmenuElem.toString());
//
//			Assert.fail("Unable to locate object: " + NewmenuElem.toString());
//        }

	elem.click();
		Actions action = new Actions(m_Driver);
WebElement ele2=m_Driver.findElement(By.xpath("//*[@id='ctl00_cpHeaderRight_btnAdd']"));

action.moveToElement(ele2).perform();

		ExtentReportManager.passStep(m_Driver, "Click_Newmenu");

		TestModellerLogger.PassStep(m_Driver, "Click_Newmenu");
			}
	
	public void Click_New_Transactionclick() throws InterruptedException
	{
        
		WebElement elem = getWebElement(New_TransactionclickElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_New_Transactionclick", "Click_New_Transactionclick failed. Unable to locate object: " + New_TransactionclickElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_New_Transactionclick", "Click_New_Transactionclick failed. Unable to locate object: " + New_TransactionclickElem.toString());

			Assert.fail("Unable to locate object: " + New_TransactionclickElem.toString());
        }
		
	JavascriptExecutor jse = (JavascriptExecutor)m_Driver;
	jse.executeScript("arguments[0].click()", elem);
          	

		ExtentReportManager.passStep(m_Driver, "Click_New_Transactionclick");

		TestModellerLogger.PassStep(m_Driver, "Click_New_Transactionclick");
	}
}