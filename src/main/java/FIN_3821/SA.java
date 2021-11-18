package FIN_3821;

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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/84b39b47-8db5-4406-9fc2-4ad305f0557e
@TestModellerModule(guid = "84b39b47-8db5-4406-9fc2-4ad305f0557e")
public class SA extends BasePage
{
	public SA (WebDriver driver)
	{
		super(driver);
	}


	
	private By SAElem = By.xpath("/html/body/form/main/div[5]/div[3]/div/div[5]/div[2]/div[1]/div/div/div[4]");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/AgentUI/Default.aspx?p=true");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AgentUI/Default.aspx?p=true");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AgentUI/Default.aspx?p=true");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AgentUI/Default.aspx?p=true";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AgentUI/Default.aspx?p=true")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click SA
     * @name Click SA
     */
	public void Click_SA()
	{
        
		WebElement elem = getWebElement(SAElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SA", "Click_SA failed. Unable to locate object: " + SAElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SA", "Click_SA failed. Unable to locate object: " + SAElem.toString());

			Assert.fail("Unable to locate object: " + SAElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_SA");

		TestModellerLogger.PassStep(m_Driver, "Click_SA");
	}
}