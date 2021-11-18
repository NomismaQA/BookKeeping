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

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/67985d92-9e24-4bea-be0d-176d469b0d47
@TestModellerModule(guid = "67985d92-9e24-4bea-be0d-176d469b0d47")
public class unconcilledbutn extends BasePage
{
	public unconcilledbutn (WebDriver driver)
	{
		super(driver);
	}


	
	private By Unreconciled_Transactions_button1Elem = By.xpath("//DIV[@class='col-md-12 text-right']/A[@class='green_btn manually_add_btn']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/AccountUI/BankTran.aspx?FYCode=52444&CompanyCode=13236&IsFirstRequest=1");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AccountUI/BankTran.aspx?FYCode=52444&CompanyCode=13236&IsFirstRequest=1");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AccountUI/BankTran.aspx?FYCode=52444&CompanyCode=13236&IsFirstRequest=1");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
//   public void AssertUrl()
//    {
//        String currentUrl = m_Driver.getCurrentUrl();
//        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AccountUI/BankTran.aspx?FYCode=52444&CompanyCode=13236&IsFirstRequest=1";
//
//        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AccountUI/BankTran.aspx?FYCode=52444&CompanyCode=13236&IsFirstRequest=1")) {
//            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
//        }
//    }

     
	/**
 	 * Click Unreconciled Transactions button1
	 * @throws InterruptedException 
     * @name Click Unreconciled Transactions button1
     */
	public void Click_Unreconciled_Transactions_button1() throws InterruptedException
	{
        
		WebElement elem = getWebElement(Unreconciled_Transactions_button1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Unreconciled_Transactions_button1", "Click_Unreconciled_Transactions_button1 failed. Unable to locate object: " + Unreconciled_Transactions_button1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Unreconciled_Transactions_button1", "Click_Unreconciled_Transactions_button1 failed. Unable to locate object: " + Unreconciled_Transactions_button1Elem.toString());

			Assert.fail("Unable to locate object: " + Unreconciled_Transactions_button1Elem.toString());
        }
Thread.sleep(2000);
		elem.click();
		Thread.sleep(1000);
          	

		ExtentReportManager.passStep(m_Driver, "Click_Unreconciled_Transactions_button1");

		TestModellerLogger.PassStep(m_Driver, "Click_Unreconciled_Transactions_button1");
	}
}