package Pages_Income;

import pages.BasePage;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
	private By ClickOnpriviewElemSecend = By.xpath("//*[@id='ctl00_cPH_rptrDisplayRecords_ctl01_lnkPreview']/i");

	private By SaveButtonElem = By.xpath("//A[@title='Export drop down menu']");

	private By PDFDumpElem = By.xpath("//A[@title='PDF']");

	private By CancelButtonElem = By.xpath("//BUTTON[@id='EditPopUpClose1']");

	private By ClickOnMailElem = By.xpath("//A[@id='ctl00_cPH_rptrDisplayRecords_ctl00_lnkSend']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=52517&CompanyCode=13302&IsFirstRequest=1");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=52517&CompanyCode=13302&IsFirstRequest=1");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=52517&CompanyCode=13302&IsFirstRequest=1");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=52517&CompanyCode=13302&IsFirstRequest=1";

        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=52517&CompanyCode=13302&IsFirstRequest=1")) {
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
		//m_Driver.findElement(By.xpath("//*[contains(text(), 'Sale')]")).click();
		elem.click();
	//	WebElement search = m_Driver.findElement(By.xpath("//*[contains(@id, 'ctl00_cPH_rvReport_ctl10_ctl03_ctl00')]"));
//		search.sendKeys("VAT");
//		search.sendKeys(Keys.ENTER);
		//m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rvReport_ctl10_ctl03_ctl03']")).click();
		
	//	m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rvReport_ctl10_ctl03_ctl03']")).click();

		
		 // pages.SaleInvoice s=new pages.SaleInvoice(m_Driver);
	       // String kt=s.message();
	       // System.out.println("Preview c  " +kt);
//		Sales Dashboard PreviewDump
	        utilities.Screenshotcapture.Getscreenshot("previewDump", "Sales Dashboard");
		m_Driver.switchTo().defaultContent();
		ExtentReportManager.passStep(m_Driver, "Click_ClickOnPreview");

		TestModellerLogger.PassStep(m_Driver, "Click_ClickOnPreview");
	}
	



     
 	/* * Click SaveButton
     * @name Click SaveButton
     */
	public void Click_SaveButton() throws InterruptedException, HeadlessException, IOException, AWTException
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[6]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(SaveButtonElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SaveButton", "Click_SaveButton failed. Unable to locate object: " + SaveButtonElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SaveButton", "Click_SaveButton failed. Unable to locate object: " + SaveButtonElem.toString());

			Assert.fail("Unable to locate object: " + SaveButtonElem.toString());
        }

		
		WebElement search = m_Driver.findElement(By.xpath("//*[contains(@id, 'ctl00_cPH_rvReport_ctl10_ctl03_ctl00')]"));
		search.sendKeys("INV");
		search.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		WebElement dump = m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rvReport_ctl10_ctl03_ctl03']"));
		//m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rvReport_ctl10_ctl03_ctl03']")).click();
		dump.click();
		dump.sendKeys(Keys.TAB);
		dump.sendKeys(Keys.ENTER);
		m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rvReport_ctl10_ctl05_ctl00_ctl00_ctl00']")).click();
	//	Screenshotcapture.captureAsImage(m_Driver, "PreviewRefresh");
		utilities.Screenshotcapture.Getscreenshot("PreviewRefresh", "Sales Dashboard");
		Thread.sleep(2000);
		
		//m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rvReport_ctl10_ctl05_ctl00_ctl00_ctl00']")).click();
	//	m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rvReport_ctl10_ctl03_ctl03']")).click();
		for(int i=1; i<=3;i++)
		{
		elem.click();
		m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rvReport_ctl10_ctl04_ctl00_Menu']/div["+i+"]/a")).click();
		Thread.sleep(1000);
		}
	//	Screenshotcapture.captureAsImage(m_Driver, "PreviewDumps");
		utilities.Screenshotcapture.Getscreenshot("PreviewDumps", "Sales Dashboard");
		Thread.sleep(1000);
//		//*[@id="ctl00_cPH_rvReport_ctl10_ctl05_ctl00_ctl00_ctl00"]

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
	//	m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[6]/div/div/div[2]/iframe")));  
		WebElement elem = getWebElement(CancelButtonElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_CancelButton", "Click_CancelButton failed. Unable to locate object: " + CancelButtonElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_CancelButton", "Click_CancelButton failed. Unable to locate object: " + CancelButtonElem.toString());

			Assert.fail("Unable to locate object: " + CancelButtonElem.toString());
        }

		elem.click();
          	
	//	m_Driver.switchTo().defaultContent();
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
		
		Thread.sleep(2000);
		//ChangeWindow.tabswitch(m_Driver);
		//m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='AddCustomerModalFrame']")));
		m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrDisplayRecords_ctl00_lnkSend']/i")).click();
		//waitForLoaded(ClickOnMailElem, 2000);
		//elem.click();
        //  jsExec.executeScript("arguments.click();", elem);	
	//	   m_Driver.switchTo().defaultContent();
		ExtentReportManager.passStep(m_Driver, "Click_ClickOnMail");

		TestModellerLogger.PassStep(m_Driver, "Click_ClickOnMail");
	}


	public void popupOfEmail() throws InterruptedException, HeadlessException, IOException, AWTException {
		
		Thread.sleep(2000);
		utilities.Screenshotcapture.Getscreenshot("popup Of Email Icon", "Sales Dashboard");
		System.out.println("Screenshot");
	}
	
	public void Click_ClickOnPreview2() throws InterruptedException, HeadlessException, IOException, AWTException
	{
        
		WebElement elem = getWebElement(ClickOnPreviewElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClickOnPreview", "Click_ClickOnPreview failed. Unable to locate object: " + ClickOnPreviewElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClickOnPreview", "Click_ClickOnPreview failed. Unable to locate object: " + ClickOnPreviewElem.toString());

			Assert.fail("Unable to locate object: " + ClickOnPreviewElem.toString());
        }
		//m_Driver.findElement(By.xpath("//*[contains(text(), 'Sale')]")).click();
		elem.click();
	//	WebElement search = m_Driver.findElement(By.xpath("//*[contains(@id, 'ctl00_cPH_rvReport_ctl10_ctl03_ctl00')]"));
//		search.sendKeys("VAT");
//		search.sendKeys(Keys.ENTER);
		//m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rvReport_ctl10_ctl03_ctl03']")).click();
		
	//	m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rvReport_ctl10_ctl03_ctl03']")).click();

		
		 // pages.SaleInvoice s=new pages.SaleInvoice(m_Driver);
	       // String kt=s.message();
	       // System.out.println("Preview c  " +kt);
//		Sales Dashboard PreviewDump
	        utilities.Screenshotcapture.Getscreenshot("previewDump(Custom Template #9)", "Other Invoice Template");
		m_Driver.switchTo().defaultContent();
		ExtentReportManager.passStep(m_Driver, "Click_ClickOnPreview");

		TestModellerLogger.PassStep(m_Driver, "Click_ClickOnPreview");
	}
	
	public void Click_SaveButton2() throws InterruptedException, HeadlessException, IOException, AWTException
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[6]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(SaveButtonElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SaveButton", "Click_SaveButton failed. Unable to locate object: " + SaveButtonElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SaveButton", "Click_SaveButton failed. Unable to locate object: " + SaveButtonElem.toString());

			Assert.fail("Unable to locate object: " + SaveButtonElem.toString());
        }

		
		WebElement search = m_Driver.findElement(By.xpath("//*[contains(@id, 'ctl00_cPH_rvReport_ctl10_ctl03_ctl00')]"));
		search.sendKeys("INV");
		search.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		WebElement dump = m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rvReport_ctl10_ctl03_ctl03']"));
		//m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rvReport_ctl10_ctl03_ctl03']")).click();
		dump.click();
		dump.sendKeys(Keys.TAB);
		dump.sendKeys(Keys.ENTER);
		m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rvReport_ctl10_ctl05_ctl00_ctl00_ctl00']")).click();
	//Screenshotcapture.captureAsImage(m_Driver, "PreviewRefresh");
		utilities.Screenshotcapture.Getscreenshot("PreviewRefresh(Custom Template #9)", "Other Invoice Template");
		Thread.sleep(2000);
		
		//m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rvReport_ctl10_ctl05_ctl00_ctl00_ctl00']")).click();
	//	m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rvReport_ctl10_ctl03_ctl03']")).click();
		for(int i=1; i<=3;i++)
		{
		elem.click();
		m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rvReport_ctl10_ctl04_ctl00_Menu']/div["+i+"]/a")).click();
		Thread.sleep(1000);
		}
		//Screenshotcapture.captureAsImage(m_Driver, "PreviewDumps");
		utilities.Screenshotcapture.Getscreenshot("PreviewDumps(Custom Template #9)", "Other Invoice Template");
		Thread.sleep(1000);
//		//*[@id="ctl00_cPH_rvReport_ctl10_ctl05_ctl00_ctl00_ctl00"]

		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_SaveButton");

		TestModellerLogger.PassStep(m_Driver, "Click_SaveButton");
	}
	
	public void Click_ClickOnPreview3() throws InterruptedException, HeadlessException, IOException, AWTException
	{
        
		WebElement elem = getWebElement(ClickOnpriviewElemSecend);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClickOnPreview", "Click_ClickOnPreview failed. Unable to locate object: " + ClickOnPreviewElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClickOnPreview", "Click_ClickOnPreview failed. Unable to locate object: " + ClickOnPreviewElem.toString());

			Assert.fail("Unable to locate object: " + ClickOnPreviewElem.toString());
        }
		//m_Driver.findElement(By.xpath("//*[contains(text(), 'Sale')]")).click();
		elem.click();
	//	WebElement search = m_Driver.findElement(By.xpath("//*[contains(@id, 'ctl00_cPH_rvReport_ctl10_ctl03_ctl00')]"));
//		search.sendKeys("VAT");
//		search.sendKeys(Keys.ENTER);
		//m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rvReport_ctl10_ctl03_ctl03']")).click();
		
	//	m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rvReport_ctl10_ctl03_ctl03']")).click();

		
		 // pages.SaleInvoice s=new pages.SaleInvoice(m_Driver);
	       // String kt=s.message();
	       // System.out.println("Preview c  " +kt);
//		Sales Dashboard PreviewDump
	        utilities.Screenshotcapture.Getscreenshot("previewDump(Standard Invoice Template)", "Other Invoice Template");
	//	m_Driver.switchTo().defaultContent();
		ExtentReportManager.passStep(m_Driver, "Click_ClickOnPreview");

		TestModellerLogger.PassStep(m_Driver, "Click_ClickOnPreview");
	}
	
	public void Click_SaveButton3() throws InterruptedException, HeadlessException, IOException, AWTException
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[6]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(SaveButtonElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SaveButton", "Click_SaveButton failed. Unable to locate object: " + SaveButtonElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SaveButton", "Click_SaveButton failed. Unable to locate object: " + SaveButtonElem.toString());

			Assert.fail("Unable to locate object: " + SaveButtonElem.toString());
        }

		
		WebElement search = m_Driver.findElement(By.xpath("//*[contains(@id, 'ctl00_cPH_rvReport_ctl10_ctl03_ctl00')]"));
	//	search.sendKeys("INV");
	//	search.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		WebElement dump = m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rvReport_ctl10_ctl03_ctl03']"));
		//m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rvReport_ctl10_ctl03_ctl03']")).click();
		dump.click();
		dump.sendKeys(Keys.TAB);
		dump.sendKeys(Keys.ENTER);
		m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rvReport_ctl10_ctl05_ctl00_ctl00_ctl00']")).click();
	//Screenshotcapture.captureAsImage(m_Driver, "PreviewRefresh");
		utilities.Screenshotcapture.Getscreenshot("PreviewRefresh(Standard Invoice Template)", "Other Invoice Template");
		Thread.sleep(2000);
		
		//m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rvReport_ctl10_ctl05_ctl00_ctl00_ctl00']")).click();
	//	m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rvReport_ctl10_ctl03_ctl03']")).click();
		for(int i=1; i<=3;i++)
		{
		elem.click();
		m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rvReport_ctl10_ctl04_ctl00_Menu']/div["+i+"]/a")).click();
		Thread.sleep(1000);
		}
		//Screenshotcapture.captureAsImage(m_Driver, "PreviewDumps");
		utilities.Screenshotcapture.Getscreenshot("PreviewDumps(Standard Invoice Template)", "Other Invoice Template");
		Thread.sleep(1000);
//		//*[@id="ctl00_cPH_rvReport_ctl10_ctl05_ctl00_ctl00_ctl00"]

		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_SaveButton");

		TestModellerLogger.PassStep(m_Driver, "Click_SaveButton");
	}

}