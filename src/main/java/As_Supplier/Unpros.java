package As_Supplier;

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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/02a8f437-356b-40a9-ad44-07d2c94d7bb9
@TestModellerModule(guid = "02a8f437-356b-40a9-ad44-07d2c94d7bb9")
public class Unpros extends BasePage
{
	public Unpros (WebDriver driver)
	{
		super(driver);
	}


	
	private By Expen1Elem = By.xpath("//*[@id='ctl00_SideMenu1_ExpensesMenu']/a/span");

	private By View_2Elem = By.xpath("//*[@id='ctl00_divMainContent']/header/div/div[3]/a");

	private By Unprocessed_Receipts_3Elem = By.xpath("//A[contains(text(),'Unprocessed Receipts')]");

	private By Upload_Receipt_4Elem = By.xpath("//A[@id='ctl00_cpHeaderRight_btnUpload']");

	private By ctl00cPHFileUpload_5Elem = By.xpath("//label[normalize-space()= 'Receipt:']/../../div[2]/input");

	private By Upload_6Elem = By.xpath("//A[@id='ctl00_cphFooter_btnUpload']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AccountUI/ReceiptFileList.aspx?FYCode=117536&CompanyCode=17199");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/ReceiptFileList.aspx?FYCode=117536&CompanyCode=17199");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/ReceiptFileList.aspx?FYCode=117536&CompanyCode=17199");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/AccountUI/ReceiptFileList.aspx?FYCode=117536&CompanyCode=17199";

        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/AccountUI/ReceiptFileList.aspx?FYCode=117536&CompanyCode=17199")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click Expen1
     * @name Click Expen1
     */
	public void Click_Expen1()
	{
        
		WebElement elem = getWebElement(Expen1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Expen1", "Click_Expen1 failed. Unable to locate object: " + Expen1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Expen1", "Click_Expen1 failed. Unable to locate object: " + Expen1Elem.toString());

			Assert.fail("Unable to locate object: " + Expen1Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Expen1");

		TestModellerLogger.PassStep(m_Driver, "Click_Expen1");
	}

     
	/**
 	 * Click View 2
     * @name Click View 2
     */
	public void Click_View_2()
	{
        
		WebElement elem = getWebElement(View_2Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_View_2", "Click_View_2 failed. Unable to locate object: " + View_2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_View_2", "Click_View_2 failed. Unable to locate object: " + View_2Elem.toString());

			Assert.fail("Unable to locate object: " + View_2Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_View_2");

		TestModellerLogger.PassStep(m_Driver, "Click_View_2");
	}

     
	/**
 	 * Click Unprocessed Receipts 3
     * @name Click Unprocessed Receipts 3
     */
	public void Click_Unprocessed_Receipts_3()
	{
        
		WebElement elem = getWebElement(Unprocessed_Receipts_3Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Unprocessed_Receipts_3", "Click_Unprocessed_Receipts_3 failed. Unable to locate object: " + Unprocessed_Receipts_3Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Unprocessed_Receipts_3", "Click_Unprocessed_Receipts_3 failed. Unable to locate object: " + Unprocessed_Receipts_3Elem.toString());

			Assert.fail("Unable to locate object: " + Unprocessed_Receipts_3Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Unprocessed_Receipts_3");

		TestModellerLogger.PassStep(m_Driver, "Click_Unprocessed_Receipts_3");
	}

     
	/**
 	 * Click Upload Receipt 4
     * @name Click Upload Receipt 4
     */
	public void Click_Upload_Receipt_4()
	{
        
		WebElement elem = getWebElement(Upload_Receipt_4Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Upload_Receipt_4", "Click_Upload_Receipt_4 failed. Unable to locate object: " + Upload_Receipt_4Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Upload_Receipt_4", "Click_Upload_Receipt_4 failed. Unable to locate object: " + Upload_Receipt_4Elem.toString());

			Assert.fail("Unable to locate object: " + Upload_Receipt_4Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Upload_Receipt_4");

		TestModellerLogger.PassStep(m_Driver, "Click_Upload_Receipt_4");
	}

      
	/**
 	 * Enter ctl00$cPH$FileUpload 5
     * @name Enter ctl00$cPH$FileUpload 5
     */
 	public void Enter_ctl00cPHFileUpload_5(String ctl00cPHFileUpload_5)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(ctl00cPHFileUpload_5Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHFileUpload_5", "Enter_ctl00cPHFileUpload_5 failed. Unable to locate object: " + ctl00cPHFileUpload_5Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHFileUpload_5", "Enter_ctl00cPHFileUpload_5 failed. Unable to locate object: " + ctl00cPHFileUpload_5Elem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHFileUpload_5Elem.toString());
         }

 		elem.sendKeys(ctl00cPHFileUpload_5);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHFileUpload_5 " + ctl00cPHFileUpload_5);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHFileUpload_5 " + ctl00cPHFileUpload_5);
 	}

     
	/**
 	 * Click Upload 6
	 * @throws InterruptedException 
     * @name Click Upload 6
     */
	public void Click_Upload_6() throws InterruptedException
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(Upload_6Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Upload_6", "Click_Upload_6 failed. Unable to locate object: " + Upload_6Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Upload_6", "Click_Upload_6 failed. Unable to locate object: " + Upload_6Elem.toString());

			Assert.fail("Unable to locate object: " + Upload_6Elem.toString());
        }

		elem.click();
		
		Thread.sleep(100000);
		m_Driver.navigate().refresh();
	String Msg=	m_Driver.findElement(By.xpath("//*[@id='ctl00_divSubContent']/div[4]/div/table/tbody")).getText();
	System.out.println(Msg);
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_Upload_6");

		TestModellerLogger.PassStep(m_Driver, "Click_Upload_6");
	}
}