package FIN_3821;

import pages.BasePage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.GetScreenShot;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/85b0e8b9-c32f-4afd-aa10-a011e674ca33
@TestModellerModule(guid = "85b0e8b9-c32f-4afd-aa10-a011e674ca33")
public class BankFeed extends BasePage
{
	public static String fdcount;
	public BankFeed (WebDriver driver)
	{
		super(driver);
	}
	private By BNK_FD_LinkElem = By.xpath("/html/body/form/main/div[5]/div[3]/div/div[5]/div[2]/div[1]/div/div/div[1]");
	
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
 	 * Click BNK_FD_Link
	 * @throws IOException 
     * @name Click BNK_FD_Link
     */
	public void Click_BNK_FD_Link() throws IOException
	{
        
		WebElement elem = getWebElement(BNK_FD_LinkElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_BNK_FD_Link", "Click_BNK_FD_Link failed. Unable to locate object: " + BNK_FD_LinkElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_BNK_FD_Link", "Click_BNK_FD_Link failed. Unable to locate object: " + BNK_FD_LinkElem.toString());

			Assert.fail("Unable to locate object: " + BNK_FD_LinkElem.toString());
        }
        GetScreenShot.captureAsImage(m_Driver, "Feedbackcount");
		WebElement bfd=m_Driver.findElement(By.xpath("//*[@id='DivMoreopt']/div[2]/div[1]/div/div/div[1]/div/div/a[1]/div[1]/h3"));
		 fdcount=bfd.getText();
		//int c=Integer.parseInt(fdcount);
		System.out.println("Bank Feedcount in dashbaord :" +fdcount);
//		
//		elem.click();
//          	
//
//		ExtentReportManager.passStep(m_Driver, "Click_BNK_FD_Link");
//
//		TestModellerLogger.PassStep(m_Driver, "Click_BNK_FD_Link");
	}
	public static String bankfeedcount()
	{
		System.out.println("returned");
		return fdcount;
	}
}