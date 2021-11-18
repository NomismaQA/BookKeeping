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

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/7f1f71f8-06c0-4765-bb49-ade149e17dc0
@TestModellerModule(guid = "7f1f71f8-06c0-4765-bb49-ade149e17dc0")
public class nlogin extends BasePage
{
	public nlogin (WebDriver driver)
	{
		super(driver);
	}
           
	
	private By nLOGINElem = By.xpath("//INPUT[@placeholder='Email or username']");

	private By nPASSElem = By.xpath("//INPUT[@placeholder='Password']");

	 private By LoginElem = By.xpath("//a[@id='ctl00_cPH_btnLogin']");
	
    // private By LoginElem = By.xpath("//A[text()='Login']");

	//private By LoginElem = By.xpath("*[@id='ctl00_cPH_btnLogin']");
	public void GoToUrl() throws InterruptedException
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/ssoui/Signin.aspx?token=8e14a0e8-5c7d-4f7d-8889-4487f962ed5a");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL","Go to URL - http://sandbox3.nomismasolution.co.uk/ssoui/Signin.aspx?token=8e14a0e8-5c7d-4f7d-8889-4487f962ed5a");
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL","Go to URL - http://sandbox3.nomismasolution.co.uk/ssoui/Signin.aspx?token=8e14a0e8-5c7d-4f7d-8889-4487f962ed5a");
		
	Thread.sleep(1000);
			}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
	
// public void AssertUrl() { String currentUrl = m_Driver.getCurrentUrl();
//	  String expectedUrl =
//	  "http://sandbox4.nomismasolution.co.uk/ssoui/Signin.aspx?token=8e14a0e8-5c7d-4f7d-8889-4487f962ed5a";
//	  
//	  if (!currentUrl.equals(
//	  "http://sandbox4.nomismasolution.co.uk/ssoui/Signin.aspx?token=8e14a0e8-5c7d-4f7d-8889-4487f962ed5a"
//	  )) { Assert.fail("Expecting URL - " + expectedUrl + " Found " + currentUrl);
//	  } }
	 

      
	/**
 	 * Enter nLOGIN
     * @name Enter nLOGIN
     */
 	public void Enter_nLOGIN(String nLOGIN)
 	{
 	    
 		WebElement elem = getWebElement(nLOGINElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_nLOGIN", "Enter_nLOGIN failed. Unable to locate object: " + nLOGINElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_nLOGIN", "Enter_nLOGIN failed. Unable to locate object: " + nLOGINElem.toString());

 			Assert.fail("Unable to locate object: " + nLOGINElem.toString());
         }

 		elem.sendKeys(nLOGIN);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_nLOGIN " + nLOGIN);

  		TestModellerLogger.PassStep(m_Driver, "Enter_nLOGIN " + nLOGIN);
 	}

      
	/**
 	 * Enter nPASS
     * @name Enter nPASS
     */
 	public void Enter_nPASS(String nPASS)
 	{
 	    
 		WebElement elem = getWebElement(nPASSElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_nPASS", "Enter_nPASS failed. Unable to locate object: " + nPASSElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_nPASS", "Enter_nPASS failed. Unable to locate object: " + nPASSElem.toString());

 			Assert.fail("Unable to locate object: " + nPASSElem.toString());
         }

 		elem.sendKeys(nPASS);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_nPASS " + nPASS);

  		TestModellerLogger.PassStep(m_Driver, "Enter_nPASS " + nPASS);
 	}

     
	/**
 	 * Click Login
     * @name Click Login
     */
	public void Click_Login()
	{
        
		WebElement elem = getWebElement(LoginElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Login", "Click_Login failed. Unable to locate object: " + LoginElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Login", "Click_Login failed. Unable to locate object: " + LoginElem.toString());

			Assert.fail("Unable to locate object: " + LoginElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Login");

		TestModellerLogger.PassStep(m_Driver, "Click_Login");
	}
}