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

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/1a974bd2-aacf-4515-b9de-9a68ff6cca48
@TestModellerModule(guid = "1a974bd2-aacf-4515-b9de-9a68ff6cca48")
public class VerifyByTrialBalanceReportNew extends BasePage
{
	public VerifyByTrialBalanceReportNew (WebDriver driver)
	{
		super(driver);
	}


	private By ReportsTABElem = By.xpath("//span[contains(text(), 'Reports')]");
	//private By ReportsTABElem = By.xpath("//A[@href='../AccountUI/Report.aspx?FYCode=52520&CompanyCode=13305']");

	private By TrialBalanceElem = By.xpath("/html/body/form/main/div[11]/div[3]/div/div[3]/div/div/div[1]/div/div/div/div/div[1]/table/tbody/tr[3]/td/a");

	private By _31_Dec_2021Elem = By.xpath("//SPAN[@id='ctl00_cPH_rptrPeriod1_ctl00_lnkAccountHeadName']");

	private By _280000_Elem = By.xpath("//TR[@id='trSale']/TD[@class='profit_reg_price text-right']");

	//private By _25000Elem = By.xpath("//A[contains(text(),'(£250.00)')]");
	private By _25000Elem = By.xpath("//*[@id='table1']/tbody[2]/tr[34]/td[1]/div[2]");

	
	
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
 	 * Click TrialBalance
	 * @throws AWTException 
	 * @throws IOException 
	 * @throws HeadlessException 
     * @name Click TrialBalance
     */
	public void Click_TrialBalance() throws HeadlessException, IOException, AWTException
	{
        
		WebElement elem = getWebElement(TrialBalanceElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_TrialBalance", "Click_TrialBalance failed. Unable to locate object: " + TrialBalanceElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_TrialBalance", "Click_TrialBalance failed. Unable to locate object: " + TrialBalanceElem.toString());

			Assert.fail("Unable to locate object: " + TrialBalanceElem.toString());
        }

		elem.click();
		
		WebElement cliname =m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/header/div/div[1]/span[3]"));
		String str = cliname.getText();
		System.out.println(str);
		String strname = "Trial"+str;
		System.out.println(strname);
		jsExec.executeScript("window.scrollBy(0,250)","");
	
	//	jsExec.executeScript("arguments[0].scrollIntoView(true);", m_Driver.findElement(By.xpath("//*[@id='table1']/tbody[2]/tr[25]/td[5]")));
		Screenshotcapture.captureAsImage(m_Driver,strname);
          	

		ExtentReportManager.passStep(m_Driver, "Click_TrialBalance");

		TestModellerLogger.PassStep(m_Driver, "Click_TrialBalance");
	}

     
	/**
 	 * Click 31 Dec 2021
     * @name Click 31 Dec 2021
     */
	public void Click__31_Dec_2021()
	{
        
		WebElement elem = getWebElement(_31_Dec_2021Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__31_Dec_2021", "Click__31_Dec_2021 failed. Unable to locate object: " + _31_Dec_2021Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__31_Dec_2021", "Click__31_Dec_2021 failed. Unable to locate object: " + _31_Dec_2021Elem.toString());

			Assert.fail("Unable to locate object: " + _31_Dec_2021Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__31_Dec_2021");

		TestModellerLogger.PassStep(m_Driver, "Click__31_Dec_2021");
	}

     
	/**
 	 * Click  (£2,800.00) 
     * @name Click  (£2,800.00) 
     */
	public void Click__280000_()
	{
        
		WebElement elem = getWebElement(_280000_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__280000_", "Click__280000_ failed. Unable to locate object: " + _280000_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__280000_", "Click__280000_ failed. Unable to locate object: " + _280000_Elem.toString());

			Assert.fail("Unable to locate object: " + _280000_Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__280000_");

		TestModellerLogger.PassStep(m_Driver, "Click__280000_");
	}

     
	/**
 	 * Click (£250.00)
	 * @throws AWTException 
	 * @throws IOException 
	 * @throws HeadlessException 
     * @name Click (£250.00)
     */
	public void Click__25000() throws HeadlessException, IOException, AWTException
	{
        
		WebElement elem = getWebElement(_25000Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__25000", "Click__25000 failed. Unable to locate object: " + _25000Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__25000", "Click__25000 failed. Unable to locate object: " + _25000Elem.toString());

			Assert.fail("Unable to locate object: " + _25000Elem.toString());
        }

		//elem.click();
		WebElement cliname =m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/header/div/div[1]/span[3]"));
		String str = cliname.getText();
		System.out.println(str);
		String strname = "Trial"+str;
		jsExec.executeScript("arguments[0].scrollIntoView(true);", m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrCPSupplier_ctl01_lnkView']")));
		Screenshotcapture.captureAsImage(m_Driver, "'+strname+'");
          	

		ExtentReportManager.passStep(m_Driver, "Click__25000");

		TestModellerLogger.PassStep(m_Driver, "Click__25000");
	}
}