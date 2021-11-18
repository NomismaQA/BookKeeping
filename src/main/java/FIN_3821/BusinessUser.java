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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/4238b4f5-7100-472a-a953-2aa91269b2da
@TestModellerModule(guid = "4238b4f5-7100-472a-a953-2aa91269b2da")
public class BusinessUser extends BasePage
{
	public BusinessUser (WebDriver driver)
	{
		super(driver);
	}

	static public String prcptcount="";
	
	private By Without_Bussiness_usrElem = By.xpath("/html/body/form/main/div[5]/div[3]/div/div[5]/div[2]/div[1]/div/div/div[5]");


	
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
 	 * Click Without_Bussiness_usr
     * @name Click Without_Bussiness_usr
     */
	public void Click_Without_Bussiness_usr()
	{
        
		WebElement elem = getWebElement(Without_Bussiness_usrElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Without_Bussiness_usr", "Click_Without_Bussiness_usr failed. Unable to locate object: " + Without_Bussiness_usrElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Without_Bussiness_usr", "Click_Without_Bussiness_usr failed. Unable to locate object: " + Without_Bussiness_usrElem.toString());

			Assert.fail("Unable to locate object: " + Without_Bussiness_usrElem.toString());
        }
		WebElement prcpt=m_Driver.findElement(By.xpath("//*[@id='DivMoreopt']/div[2]/div[1]/div/div/div[5]/div/div/a[1]/div[1]/h3"));
		prcptcount=prcpt.getText();
		System.out.println("dasboard count of pending receipt is :" +prcptcount);
		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Without_Bussiness_usr");

		TestModellerLogger.PassStep(m_Driver, "Click_Without_Bussiness_usr");
	}
	
	public String mes()
	{
		System.out.println("mes "+prcptcount);
		return prcptcount;
	}
}