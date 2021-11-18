package sm457;

import pages.BasePage;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.ChangeWindow;
import utilities.Screenshotcapture;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/65dd0c1e-67eb-4b24-9aa4-3c214b0c97f8
@TestModellerModule(guid = "65dd0c1e-67eb-4b24-9aa4-3c214b0c97f8")
public class NewPreviewPage extends BasePage
{
	public NewPreviewPage (WebDriver driver)
	{
		super(driver);
	}

String previewDump = null;
	
	private By ClickOnPreviewElem = By.xpath("//A[@id='ctl00_cPH_rptrDisplayRecords_ctl00_lnkPreview']");

	private By SaveButtonElem = By.xpath("//A[@title='Export drop down menu']");

	private By PDFDumpElem = By.xpath("//A[@title='PDF']");

	private By CancelButtonElem = By.xpath("//BUTTON[@id='EditPopUpClose1']");

	private By ClickOnMailElem = By.xpath("//A[@id='ctl00_cPH_rptrDisplayRecords_ctl00_lnkSend']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=52517&CompanyCode=13302&IsFirstRequest=1");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=52517&CompanyCode=13302&IsFirstRequest=1");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=52517&CompanyCode=13302&IsFirstRequest=1");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=52517&CompanyCode=13302&IsFirstRequest=1";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=52517&CompanyCode=13302&IsFirstRequest=1")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click ClickOnPreview
	 * @throws InterruptedException 
	 * @throws AWTException 
	 * @throws IOException 
	 * @throws HeadlessException 
     * @name Click ClickOnPreview
     */
	public void Click_ClickOnPreview() throws InterruptedException, HeadlessException, IOException, AWTException
	{
        
		WebElement elem = getWebElement(ClickOnPreviewElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClickOnPreview", "Click_ClickOnPreview failed. Unable to locate object: " + ClickOnPreviewElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClickOnPreview", "Click_ClickOnPreview failed. Unable to locate object: " + ClickOnPreviewElem.toString());

			Assert.fail("Unable to locate object: " + ClickOnPreviewElem.toString());
        }

		elem.click();
		  pages.SaleInvoice s=new pages.SaleInvoice(m_Driver);
	        String kt=s.message();
	        System.out.println("Preview c  " +kt);
	        Screenshotcapture.captureAsImage(m_Driver, kt);
		m_Driver.switchTo().defaultContent();
		ExtentReportManager.passStep(m_Driver, "Click_ClickOnPreview");

		TestModellerLogger.PassStep(m_Driver, "Click_ClickOnPreview");
	}

     
 	/* * Click SaveButton
     * @name Click SaveButton
     */
	public void Click_SaveButton()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[6]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(SaveButtonElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SaveButton", "Click_SaveButton failed. Unable to locate object: " + SaveButtonElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SaveButton", "Click_SaveButton failed. Unable to locate object: " + SaveButtonElem.toString());

			Assert.fail("Unable to locate object: " + SaveButtonElem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_SaveButton");

		TestModellerLogger.PassStep(m_Driver, "Click_SaveButton");
	}

     
	/**
 	 * Click PDFDump
	 * @throws InterruptedException 
     * @name Click PDFDump
     */
	public void Click_PDFDump() throws InterruptedException
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[6]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(PDFDumpElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_PDFDump", "Click_PDFDump failed. Unable to locate object: " + PDFDumpElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_PDFDump", "Click_PDFDump failed. Unable to locate object: " + PDFDumpElem.toString());

			Assert.fail("Unable to locate object: " + PDFDumpElem.toString());
        }

		elem.click();
		Thread.sleep(1000);
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_PDFDump");

		TestModellerLogger.PassStep(m_Driver, "Click_PDFDump");
	}

     
	/**
 	 * Click CancelButton
     * @name Click CancelButton
     */
	public void Click_CancelButton()
	{
        
		WebElement elem = getWebElement(CancelButtonElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_CancelButton", "Click_CancelButton failed. Unable to locate object: " + CancelButtonElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_CancelButton", "Click_CancelButton failed. Unable to locate object: " + CancelButtonElem.toString());

			Assert.fail("Unable to locate object: " + CancelButtonElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_CancelButton");

		TestModellerLogger.PassStep(m_Driver, "Click_CancelButton");
	}

     
	/**
 	 * Click ClickOnMail
	 * @throws InterruptedException 
     * @name Click ClickOnMail
     */
	public void Click_ClickOnMail() throws InterruptedException
	{
        System.out.println("inside ClickonMail Method.");
		WebElement elem = getWebElement(ClickOnMailElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClickOnMail", "Click_ClickOnMail failed. Unable to locate object: " + ClickOnMailElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClickOnMail", "Click_ClickOnMail failed. Unable to locate object: " + ClickOnMailElem.toString());

			Assert.fail("Unable to locate object: " + ClickOnMailElem.toString());
        }
		
		Thread.sleep(1000);
		//ChangeWindow.tabswitch(m_Driver);
		m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrDisplayRecords_ctl00_lnkSend']/i")).click();
		//waitForLoaded(ClickOnMailElem, 2000);
		//elem.click();
        //  jsExec.executeScript("arguments.click();", elem);	

		ExtentReportManager.passStep(m_Driver, "Click_ClickOnMail");

		TestModellerLogger.PassStep(m_Driver, "Click_ClickOnMail");
	}
}