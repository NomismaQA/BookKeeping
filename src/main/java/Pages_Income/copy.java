package Pages_Income;

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
import utilities.Screenshotcapture;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/0526c3a9-1675-4a5e-8540-8b14257bd1e2
@TestModellerModule(guid = "0526c3a9-1675-4a5e-8540-8b14257bd1e2")
public class copy extends BasePage
{
	public copy (WebDriver driver)
	{
		super(driver);
	}

	String InvNo="";
	
	private By EneternvoiceNoElem = By.xpath(" //*[@id='ctl00_cPH_txtInvoiceNo']");

	private By CopySave2Elem = By.xpath("//*[@id='ctl00_cpHFooter_btnPreviewOnsave']");

	private By getMsgElem = By.xpath("//*[@id='ctl00_divSubContent']/div[1]/div");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AccountUI/InvoiceEditor.aspx?FYCode=116991&CompanyCode=16668&id=201093&it=I&action=Copy");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/InvoiceEditor.aspx?FYCode=116991&CompanyCode=16668&id=201093&it=I&action=Copy");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/InvoiceEditor.aspx?FYCode=116991&CompanyCode=16668&id=201093&it=I&action=Copy");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/AccountUI/InvoiceEditor.aspx?FYCode=116991&CompanyCode=16668&id=201093&it=I&action=Copy";

        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/AccountUI/InvoiceEditor.aspx?FYCode=116991&CompanyCode=16668&id=201093&it=I&action=Copy")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

      
	/**
 	 * Enter EneternvoiceNo
	 * @throws AWTException 
	 * @throws IOException 
	 * @throws HeadlessException 
	 * @throws InterruptedException 
     * @name Enter EneternvoiceNo
     */
 	public void Enter_EneternvoiceNo(String EneternvoiceNo) throws HeadlessException, IOException, AWTException, InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(EneternvoiceNoElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_EneternvoiceNo", "Enter_EneternvoiceNo failed. Unable to locate object: " + EneternvoiceNoElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_EneternvoiceNo", "Enter_EneternvoiceNo failed. Unable to locate object: " + EneternvoiceNoElem.toString());

 			Assert.fail("Unable to locate object: " + EneternvoiceNoElem.toString());
         }

 		Thread.sleep(2000);
 		Screenshotcapture.captureAsImage(m_Driver, "copy page");
 		
 		//elem.clear();
 		elem.sendKeys(EneternvoiceNo);
 		 InvNo=elem.getText();
 		
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_EneternvoiceNo " + EneternvoiceNo);

  		TestModellerLogger.PassStep(m_Driver, "Enter_EneternvoiceNo " + EneternvoiceNo);
 	}

     
	/**
 	 * Click CopySave2
	 * @throws InterruptedException 
     * @name Click CopySave2
     */
	public void Click_CopySave2() throws InterruptedException
	{
        
		WebElement elem = getWebElement(CopySave2Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_CopySave2", "Click_CopySave2 failed. Unable to locate object: " + CopySave2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_CopySave2", "Click_CopySave2 failed. Unable to locate object: " + CopySave2Elem.toString());

			Assert.fail("Unable to locate object: " + CopySave2Elem.toString());
        }
		jsExec.executeScript("arguments[0].scrollIntoView();", elem);
		Thread.sleep(2000);
		elem.click();
          	Thread.sleep(2000);
          	m_Driver.findElement(By.xpath("//*[@id='ctl00_cphError_btnSaveinvoice']")).click();

		ExtentReportManager.passStep(m_Driver, "Click_CopySave2");

		TestModellerLogger.PassStep(m_Driver, "Click_CopySave2");
	}

     
	/**
 	 * Click getMsg
	 * @throws InterruptedException 
     * @name Click getMsg
     */
	public void Click_getMsg() throws InterruptedException
	{
        
		WebElement elem = getWebElement(getMsgElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_getMsg", "Click_getMsg failed. Unable to locate object: " + getMsgElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_getMsg", "Click_getMsg failed. Unable to locate object: " + getMsgElem.toString());

			Assert.fail("Unable to locate object: " + getMsgElem.toString());
        }
		//*[@id='ctl00_divSubContent']/div[1]/div
	//	WebElement scroll=m_Driver.findElement(By.xpath("//*[@id='ctl00_SideMenu1_dashboardMenu']/a/span"));
	//	jsExec.executeScript("arguments[0].scrollIntoView();", scroll);
	//	Thread.sleep(2000);
		
		String msg=elem.getText();
		String []a=msg.split(" ");
		boolean b=msg.contains("Success! Invoice Number "+a[3]+" saved successfully");
		Assert.assertTrue(b);
		System.out.println(msg);
		utilities.Screenshotcapture.Getscreenshot("Copy", "Sales Dashboard");
          	

		ExtentReportManager.passStep(m_Driver, "Click_getMsg");

		TestModellerLogger.PassStep(m_Driver, "Click_getMsg");
	}
}