package Pages_Income;

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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/8c410cf1-3dd5-4dbf-913d-e10ae9d8cbd6
@TestModellerModule(guid = "8c410cf1-3dd5-4dbf-913d-e10ae9d8cbd6")
public class preview extends BasePage
{
	public preview (WebDriver driver)
	{
		super(driver);
	}


	
	//private By ClickeyeiconElem = By.xpath("//A[@id='ctl00_cPH_rptrDisplayRecords_ctl00_lnkPreview']");

	private By ClickeyeiconElem = By.xpath("(//a[contains(@onclick, 'showModal1')])[1]");
	private By save_iconElem = By.xpath("//A[@title='Export drop down menu']");

	private By cross_clikedElem = By.xpath("//BUTTON[@id='EditPopUpClose1']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=52444&CompanyCode=13236&IsFirstRequest=1");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=52444&CompanyCode=13236&IsFirstRequest=1");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=52444&CompanyCode=13236&IsFirstRequest=1");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=52444&CompanyCode=13236&IsFirstRequest=1";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=52444&CompanyCode=13236&IsFirstRequest=1")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click Click-eyeicon
     * @name Click Click-eyeicon
     */
	public void Click_Clickeyeicon()
	{
        
		WebElement elem = getWebElement(ClickeyeiconElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Clickeyeicon", "Click_Clickeyeicon failed. Unable to locate object: " + ClickeyeiconElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Clickeyeicon", "Click_Clickeyeicon failed. Unable to locate object: " + ClickeyeiconElem.toString());

			Assert.fail("Unable to locate object: " + ClickeyeiconElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Clickeyeicon");

		TestModellerLogger.PassStep(m_Driver, "Click_Clickeyeicon");
	}

     
	/**
 	 * Click save_icon
	 * @throws InterruptedException 
     * @name Click save_icon
     */
	public void Click_save_icon() throws InterruptedException
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[6]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(save_iconElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_save_icon", "Click_save_icon failed. Unable to locate object: " + save_iconElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_save_icon", "Click_save_icon failed. Unable to locate object: " + save_iconElem.toString());

			Assert.fail("Unable to locate object: " + save_iconElem.toString());
        }

		elem.click();
		//Thread.sleep(2000);
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_save_icon");

		TestModellerLogger.PassStep(m_Driver, "Click_save_icon");
	}

     
	/**
 	 * Click cross_cliked
	 * @throws InterruptedException 
     * @name Click cross_cliked
     */
	public void Click_cross_cliked() throws InterruptedException
	{
        
		WebElement elem = getWebElement(cross_clikedElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_cross_cliked", "Click_cross_cliked failed. Unable to locate object: " + cross_clikedElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_cross_cliked", "Click_cross_cliked failed. Unable to locate object: " + cross_clikedElem.toString());

			Assert.fail("Unable to locate object: " + cross_clikedElem.toString());
        }

		elem.click();
          	//Thread.sleep(2000);
		m_Driver.switchTo().defaultContent();
		//Thread.sleep(2000);
//m_Driver.//	jsExec.executeScript("arguments.click();", docu)
			m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrDisplayRecords_ctl00_lnkSend']/i")).click();

		ExtentReportManager.passStep(m_Driver, "Click_cross_cliked");

		TestModellerLogger.PassStep(m_Driver, "Click_cross_cliked");
	}
}