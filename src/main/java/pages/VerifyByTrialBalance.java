package pages;

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

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/f83eb83e-be99-41d8-bfbc-0ca252393d34
@TestModellerModule(guid = "f83eb83e-be99-41d8-bfbc-0ca252393d34")
public class VerifyByTrialBalance extends BasePage
{
	WebElement cliname;
	String str=" ";
	public VerifyByTrialBalance (WebDriver driver)
	{
		super(driver);
	}

	//private By TrialBalanceTABElem = By.xpath("//*[@id='FincReports']/table/tbody/tr[3]/td/a");
	
	private By ReportsTABElem = By.xpath("//span[contains(text(), 'Reports')]");
	//private By ReportsTABElem = By.xpath("//A[@href='../AccountUI/Report.aspx?FYCode=52520&CompanyCode=13305']");

	//private By TrialBalanceTABElem = By.xpath("//*[@id='FincReports']/table/tbody/tr[3]/td/a");

	
	//private By TrialBalanceTABElem = By.xpath("//a[contains(text(),'Trial Balance']");
	
//	private By TrialBalanceTABElem = By.cssSelector("#FincReports > table > tbody > tr:nth-child(3) > td > a");
//
//	private By CSVDump1Elem = By.xpath("//A[@id='ctl00_cPHFilter_btnExportComapare']");

	//private By ReportsTABElem = By.xpath("//A[@href='../AccountUI/Report.aspx?FYCode=52520&CompanyCode=13305']");

	private By TrialBalanceTABElem = By.xpath("/html/body/form/main/div[11]/div[3]/div/div[3]/div/div/div[1]/div/div/div/div/div[1]/table/tbody/tr[3]/td/a");

	//private By PDFDumpElem = By.xpath("//A[@id='ctl00_cPHFilter_lkbtnExportPeriodsPdf']");
	
	private By CSVDump1Elem = By.xpath("//A[@id='ctl00_cPHFilter_btnExportComapare']");



	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/AccountUI/ReportTrialBalance.aspx?FYCode=52520&CompanyCode=13305");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AccountUI/ReportTrialBalance.aspx?FYCode=52520&CompanyCode=13305");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AccountUI/ReportTrialBalance.aspx?FYCode=52520&CompanyCode=13305");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AccountUI/ReportTrialBalance.aspx?FYCode=52520&CompanyCode=13305";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AccountUI/ReportTrialBalance.aspx?FYCode=52520&CompanyCode=13305")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click ReportsTAB
     * @name Click ReportsTAB
     */
	public void Click_ReportsTAB()
	{
		
        
		WebElement elem = getWebElement(ReportsTABElem);
		
		System.out.println(ReportsTABElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ReportsTAB", "Click_ReportsTAB failed. Unable to locate object: " + ReportsTABElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ReportsTAB", "Click_ReportsTAB failed. Unable to locate object: " + ReportsTABElem.toString());

			Assert.fail("Unable to locate object: " + ReportsTABElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_ReportsTAB");

		TestModellerLogger.PassStep(m_Driver, "Click_ReportsTAB");
	}

     
	/**
 	 * Click TrialBalanceTAB
	 * @throws AWTException 
	 * @throws IOException 
	 * @throws HeadlessException 
	 * @throws InterruptedException 
     * @name Click TrialBalanceTAB
     */
	public void Click_TrialBalanceTAB() throws HeadlessException, IOException, AWTException, InterruptedException
	{
        
		WebElement elem = getWebElement(TrialBalanceTABElem);
 //System.out.println(TrialBalanceTABElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_TrialBalanceTAB", "Click_TrialBalanceTAB failed. Unable to locate object: " + TrialBalanceTABElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_TrialBalanceTAB", "Click_TrialBalanceTAB failed. Unable to locate object: " + TrialBalanceTABElem.toString());

			Assert.fail("Unable to locate object: " + TrialBalanceTABElem.toString());
        }
		Thread.sleep(1000);
		elem.click();
		
	
//		jsExec.executeScript("arguments[0].scrollIntoView(true);", m_Driver.findElement(By.xpath("//*[@id='table1']/tbody[2]/tr[29]/td[1]/div[2]")));
//	
//		Screenshotcapture.captureAsImage(m_Driver, "'+strname+'");
//		jsExec.executeScript("arguments[0].scrollIntoView(true);", m_Driver.findElement(By.xpath("//*[@id='table1']/tbody[2]/tr[29]/td[1]/div[2]")));
//		Screenshotcapture.captureAsImage(m_Driver, "'+strname+'");
//	
	ExtentReportManager.passStep(m_Driver, "Click_TrialBalanceTAB");

		TestModellerLogger.PassStep(m_Driver, "Click_TrialBalanceTAB");
	}

     
	/**
 	 * Click CSVDump1
	 * @throws AWTException 
	 * @throws IOException 
	 * @throws HeadlessException 
	 * @throws InterruptedException 
     * @name Click CSVDump1
     */
	public void Click_CSVDump1() throws HeadlessException, IOException, AWTException, InterruptedException
	{
        
		WebElement elem = getWebElement(CSVDump1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_CSVDump1", "Click_CSVDump1 failed. Unable to locate object: " + CSVDump1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_CSVDump1", "Click_CSVDump1 failed. Unable to locate object: " + CSVDump1Elem.toString());

			Assert.fail("Unable to locate object: " + CSVDump1Elem.toString());
        }
			
	

   elem.click();
Thread.sleep(1000);
//		jsExec.executeScript("arguments[0].scrollIntoView(true);", "CSVDump1Elem");
////		cliname =m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/header/div/div[1]/span[3]"));
//		String str = cliname.getText();
//		System.out.println(str);
//		String strname = "Trial"+str;
////		jsExec.executeScript("arguments[0].scrollIntoView(true);", m_Driver.findElement(By.xpath("//*[@id='table1']/tbody[2]/tr[29]/td[1]/div[2]")));
//		Screenshotcapture.captureAsImage(m_Driver, "'+strname+'");
//		
//		String strname1 = "Trial2"+str;
//		jsExec.executeScript("arguments[0].scrollIntoView(true);", m_Driver.findElement(By.xpath("//*[@id='table1']/tbody[2]/tr[29]/td[1]/div[2]")));
//		Screenshotcapture.captureAsImage(m_Driver, "'+strname1+'");

		ExtentReportManager.passStep(m_Driver, "Click_CSVDump1");

		TestModellerLogger.PassStep(m_Driver, "Click_CSVDump1");
	}
	

}