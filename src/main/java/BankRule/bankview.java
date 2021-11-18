package BankRule;

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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/e3da3cc4-632f-4bf3-b467-62e08e06a8ca
@TestModellerModule(guid = "e3da3cc4-632f-4bf3-b467-62e08e06a8ca")
public class bankview extends BasePage
{
	public bankview (WebDriver driver)
	{
		super(driver);
	}


	
	private By Bank_Menu_ViewElem = By.xpath("//*[@id=\'ctl00_divMainContent']/header/div/div[1]/a");

	private By Bank__Rules_dropdownElem = By.xpath("//A[@id='ctl00_cpHeaderRight_LinkButtonEx3']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AccountUI/BankTran.aspx?FYCode=117008&CompanyCode=16685&IsFirstRequest=1");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/BankTran.aspx?FYCode=117008&CompanyCode=16685&IsFirstRequest=1");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/BankTran.aspx?FYCode=117008&CompanyCode=16685&IsFirstRequest=1");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/AccountUI/BankTran.aspx?FYCode=117008&CompanyCode=16685&IsFirstRequest=1";

        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/AccountUI/BankTran.aspx?FYCode=117008&CompanyCode=16685&IsFirstRequest=1")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click Bank_Menu_View
     * @name Click Bank_Menu_View
     */
	public void Click_Bank_Menu_View()
	{
        
		WebElement elem = getWebElement(Bank_Menu_ViewElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Bank_Menu_View", "Click_Bank_Menu_View failed. Unable to locate object: " + Bank_Menu_ViewElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Bank_Menu_View", "Click_Bank_Menu_View failed. Unable to locate object: " + Bank_Menu_ViewElem.toString());

			Assert.fail("Unable to locate object: " + Bank_Menu_ViewElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Bank_Menu_View");

		TestModellerLogger.PassStep(m_Driver, "Click_Bank_Menu_View");
	}

     
	/**
 	 * Click Bank _Rules_dropdown
	 * @throws InterruptedException 
     * @name Click Bank _Rules_dropdown
     */
	public void Click_Bank__Rules_dropdown() throws InterruptedException
	{
        
		WebElement elem = getWebElement(Bank__Rules_dropdownElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Bank__Rules_dropdown", "Click_Bank__Rules_dropdown failed. Unable to locate object: " + Bank__Rules_dropdownElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Bank__Rules_dropdown", "Click_Bank__Rules_dropdown failed. Unable to locate object: " + Bank__Rules_dropdownElem.toString());

			Assert.fail("Unable to locate object: " + Bank__Rules_dropdownElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Bank__Rules_dropdown");

		TestModellerLogger.PassStep(m_Driver, "Click_Bank__Rules_dropdown");
	}
}