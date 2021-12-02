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
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/981aeb6f-2758-48df-8a73-bb6063b6955e
@TestModellerModule(guid = "981aeb6f-2758-48df-8a73-bb6063b6955e")
public class Login1VAT extends BasePage
{
	public Login1VAT (WebDriver driver)
	{
		super(driver);
	}


	
	private By UserNameElem = By.xpath("//*[@id=\"ctl00_cPH_login\"]");

	private By PasswordElem = By.id("ctl00_cPH_pass");

	private By LoginButtonElem = By.id("ctl00_cPH_btnLogin");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/ssoui/Signin.aspx?token=668f28ac-236f-4d7a-9aa3-2a9457140633");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/ssoui/Signin.aspx?token=668f28ac-236f-4d7a-9aa3-2a9457140633");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/ssoui/Signin.aspx?token=668f28ac-236f-4d7a-9aa3-2a9457140633");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/ssoui/Signin.aspx?token=668f28ac-236f-4d7a-9aa3-2a9457140633";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/ssoui/Signin.aspx?token=668f28ac-236f-4d7a-9aa3-2a9457140633")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

      
	/**
 	 * Enter UserName
     * @name Enter UserName
     */
 	public void Enter_UserName(String UserName)
 	{
 	    
 		WebElement elem = getWebElement(UserNameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_UserName", "Enter_UserName failed. Unable to locate object: " + UserNameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_UserName", "Enter_UserName failed. Unable to locate object: " + UserNameElem.toString());

 			Assert.fail("Unable to locate object: " + UserNameElem.toString());
         }

 		elem.sendKeys(UserName);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_UserName " + UserName);

  		TestModellerLogger.PassStep(m_Driver, "Enter_UserName " + UserName);
 	}

      
	/**
 	 * Enter Password
     * @name Enter Password
     */
 	public void Enter_Password(String Password)
 	{
 	    
 		WebElement elem = getWebElement(PasswordElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Password", "Enter_Password failed. Unable to locate object: " + PasswordElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Password", "Enter_Password failed. Unable to locate object: " + PasswordElem.toString());

 			Assert.fail("Unable to locate object: " + PasswordElem.toString());
         }

 		elem.sendKeys(Password);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Password " + Password);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Password " + Password);
 	}

     
	/**
 	 * Click LoginButton
     * @name Click LoginButton
     */
	public void Click_LoginButton()
	{
        
		WebElement elem = getWebElement(LoginButtonElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_LoginButton", "Click_LoginButton failed. Unable to locate object: " + LoginButtonElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_LoginButton", "Click_LoginButton failed. Unable to locate object: " + LoginButtonElem.toString());

			Assert.fail("Unable to locate object: " + LoginButtonElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_LoginButton");

		TestModellerLogger.PassStep(m_Driver, "Click_LoginButton");
	}
}