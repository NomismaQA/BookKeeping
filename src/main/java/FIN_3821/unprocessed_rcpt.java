package FIN_3821;

import pages.BasePage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/3310643c-e8a7-42d5-aebf-7f595bd63c74
@TestModellerModule(guid = "3310643c-e8a7-42d5-aebf-7f595bd63c74")
public class unprocessed_rcpt extends BasePage
{
	public unprocessed_rcpt (WebDriver driver)
	{
		super(driver);
	}


	
	private By Reports_menu2Elem = By.xpath("//A[@href='AdminReports.aspx']");

	private By Unprocessed_ReceiptslinkElem = By.xpath("/html/body/form/main/div[5]/div[3]/div/div[2]/div/div[1]/div/div/div/div/div/table/tbody/tr[16]/td/a");

	private By pdf_iconElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHeaderRight_hrefDownload']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/AgentUI/ReportUnprocessedReceipt.aspx");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AgentUI/ReportUnprocessedReceipt.aspx");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AgentUI/ReportUnprocessedReceipt.aspx");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
//   public void AssertUrl()
//    {
//        String currentUrl = m_Driver.getCurrentUrl();
//        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AgentUI/ReportUnprocessedReceipt.aspx";
//
//        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AgentUI/ReportUnprocessedReceipt.aspx")) {
//            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
//        }
//    }

     
	/**
 	 * Click Reports_menu2
     * @name Click Reports_menu2
     */
	public void Click_Reports_menu2()
	{
        
		WebElement elem = getWebElement(Reports_menu2Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Reports_menu2", "Click_Reports_menu2 failed. Unable to locate object: " + Reports_menu2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Reports_menu2", "Click_Reports_menu2 failed. Unable to locate object: " + Reports_menu2Elem.toString());

			Assert.fail("Unable to locate object: " + Reports_menu2Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Reports_menu2");

		TestModellerLogger.PassStep(m_Driver, "Click_Reports_menu2");
	}

     
	/**
 	 * Click Unprocessed_Receiptslink
	 * @throws IOException 
	 * @throws InterruptedException 
     * @name Click Unprocessed_Receiptslink
     */
	public void Click_Unprocessed_Receiptslink() throws IOException, InterruptedException
	{
        
		WebElement elem = getWebElement(Unprocessed_ReceiptslinkElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Unprocessed_Receiptslink", "Click_Unprocessed_Receiptslink failed. Unable to locate object: " + Unprocessed_ReceiptslinkElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Unprocessed_Receiptslink", "Click_Unprocessed_Receiptslink failed. Unable to locate object: " + Unprocessed_ReceiptslinkElem.toString());

			Assert.fail("Unable to locate object: " + Unprocessed_ReceiptslinkElem.toString());
        }

		
		
		elem.click();
		Thread.sleep(2000);
		GetScreenShot.captureAsImage(m_Driver,"pendingrecept");
		Thread.sleep(2000);
		
		
		
		ExtentReportManager.passStep(m_Driver, "Click_Unprocessed_Receiptslink");

		TestModellerLogger.PassStep(m_Driver, "Click_Unprocessed_Receiptslink");
	}

     
	/**
 	 * Click pdf_icon
	 * @throws IOException 
     * @name Click pdf_icon
     */
	public void Click_pdf_icon() throws IOException
	{
		
        
		WebElement elem = getWebElement(pdf_iconElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_pdf_icon", "Click_pdf_icon failed. Unable to locate object: " + pdf_iconElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_pdf_icon", "Click_pdf_icon failed. Unable to locate object: " + pdf_iconElem.toString());

			Assert.fail("Unable to locate object: " + pdf_iconElem.toString());
        }

		
		//String Actual = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_LinkUnProcessTotal']")).getText();
		int value = Pendingrcpt.ret();
		String Actual = Pendingrcpt.ret1();
		String Expected = String.valueOf(value);
		
		System.out.println("Actual"+Actual);
		System.out.println("Expected"+Expected);
		Assert.assertEquals(Actual, Expected);
		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_pdf_icon");

		TestModellerLogger.PassStep(m_Driver, "Click_pdf_icon");
	}
	
}