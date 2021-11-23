package pages.VAT3;

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

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/2fb18ad9-c37d-4b99-adf7-2141b87ace1d
@TestModellerModule(guid = "2fb18ad9-c37d-4b99-adf7-2141b87ace1d")
public class VATReturn2stVATReturnReport extends BasePage
{
	public VATReturn2stVATReturnReport (WebDriver driver)
	{
		super(driver);
	}
	//private By VATReturnsTAB2Elem = By.xpath("//A[@href='../AccountUI/VATReturn.aspx?FYCode=52455&CompanyCode=13259']");

	private By VATReturnsTAB2Elem = By.xpath("//span[contains(text(),'VAT Returns')]");
	private By SettingTab2Elem = By.xpath("//A[@class='toggleSettings']");

	private By VATReturnBackupReportElem = By.xpath("//A[@id='ctl00_cPH_rptrDisplayRecords_ctl00_lnkNewVATbackup']");

	private By DownloadVATReturnBackupReportElem = By.xpath("//A[@id='ctl00_cPH_btnExportToExcel']");
	

	private By _VATReturnBackupReportCloseElem = By.xpath("//BUTTON[@id='EditPopUpClose']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AccountUI/VATReturn.aspx?FYCode=52455&CompanyCode=13259");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/VATReturn.aspx?FYCode=52455&CompanyCode=13259");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/VATReturn.aspx?FYCode=52455&CompanyCode=13259");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
//   public void AssertUrl()
//    {
//        String currentUrl = m_Driver.getCurrentUrl();
//        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AccountUI/VATReturn.aspx?FYCode=52455&CompanyCode=13259";
//
//        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AccountUI/VATReturn.aspx?FYCode=52455&CompanyCode=13259")) {
//            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
//        }
//    }

     
	/**
 	 * Click VATReturnsTAB2
     * @name Click VATReturnsTAB2
     */
	public void Click_VATReturnsTAB2()
	{
        
		WebElement elem = getWebElement(VATReturnsTAB2Elem);
		

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_VATReturnsTAB2", "Click_VATReturnsTAB2 failed. Unable to locate object: " + VATReturnsTAB2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_VATReturnsTAB2", "Click_VATReturnsTAB2 failed. Unable to locate object: " + VATReturnsTAB2Elem.toString());

			Assert.fail("Unable to locate object: " + VATReturnsTAB2Elem.toString());
        }

		elem.click();
          	
		//ChangeWindow.tabswitch(m_Driver);
		ExtentReportManager.passStep(m_Driver, "Click_VATReturnsTAB2");

		TestModellerLogger.PassStep(m_Driver, "Click_VATReturnsTAB2");
	}

     
	/**
 	 * Click SettingTab2
     * @name Click SettingTab2
     */
	public void Click_SettingTab2()
	{
        
		WebElement elem = getWebElement(SettingTab2Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SettingTab2", "Click_SettingTab2 failed. Unable to locate object: " + SettingTab2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SettingTab2", "Click_SettingTab2 failed. Unable to locate object: " + SettingTab2Elem.toString());

			Assert.fail("Unable to locate object: " + SettingTab2Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_SettingTab2");

		TestModellerLogger.PassStep(m_Driver, "Click_SettingTab2");
	}

     
	/**
 	 * Click VATReturnBackupReport
     * @name Click VATReturnBackupReport
     */
	public void Click_VATReturnBackupReport()
	{
        
		WebElement elem = getWebElement(VATReturnBackupReportElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_VATReturnBackupReport", "Click_VATReturnBackupReport failed. Unable to locate object: " + VATReturnBackupReportElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_VATReturnBackupReport", "Click_VATReturnBackupReport failed. Unable to locate object: " + VATReturnBackupReportElem.toString());

			Assert.fail("Unable to locate object: " + VATReturnBackupReportElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_VATReturnBackupReport");

		TestModellerLogger.PassStep(m_Driver, "Click_VATReturnBackupReport");
	}

     
	/**
 	 * Click DownloadVATReturnBackupReport
     * @name Click DownloadVATReturnBackupReport
     */
	public void Click_DownloadVATReturnBackupReport()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[5]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(DownloadVATReturnBackupReportElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_DownloadVATReturnBackupReport", "Click_DownloadVATReturnBackupReport failed. Unable to locate object: " + DownloadVATReturnBackupReportElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_DownloadVATReturnBackupReport", "Click_DownloadVATReturnBackupReport failed. Unable to locate object: " + DownloadVATReturnBackupReportElem.toString());

			Assert.fail("Unable to locate object: " + DownloadVATReturnBackupReportElem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_DownloadVATReturnBackupReport");

		TestModellerLogger.PassStep(m_Driver, "Click_DownloadVATReturnBackupReport");
	}

     
	/**
 	 * Click × VATReturnBackupReportClose
     * @name Click × VATReturnBackupReportClose
     */
	public void Click__VATReturnBackupReportClose()
	{
        
		WebElement elem = getWebElement(_VATReturnBackupReportCloseElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__VATReturnBackupReportClose", "Click__VATReturnBackupReportClose failed. Unable to locate object: " + _VATReturnBackupReportCloseElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__VATReturnBackupReportClose", "Click__VATReturnBackupReportClose failed. Unable to locate object: " + _VATReturnBackupReportCloseElem.toString());

			Assert.fail("Unable to locate object: " + _VATReturnBackupReportCloseElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__VATReturnBackupReportClose");

		TestModellerLogger.PassStep(m_Driver, "Click__VATReturnBackupReportClose");
	}
}