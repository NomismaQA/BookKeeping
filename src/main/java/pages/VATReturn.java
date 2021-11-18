package pages;

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

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/c8c675b0-b38a-4f61-a3c6-6c7d14330ac0
@TestModellerModule(guid = "c8c675b0-b38a-4f61-a3c6-6c7d14330ac0")
public class VATReturn extends BasePage
{
	public VATReturn (WebDriver driver)
	{
		super(driver);
	}


	
	private By VATReturnsTABElem = By.xpath("//A[@href='../AccountUI/VATReturn.aspx?FYCode=52455&CompanyCode=13259']");

	private By VATReturnSettingTABElem = By.xpath("//A[@class='toggleSettings']");
	

	private By NewVATbackupReportElem = By.xpath("//A[@id='ctl00_cPH_rptrDisplayRecords_ctl00_lnkNewVATbackup']");

	private By NewVATBackupExcelElem = By.xpath("//A[@id='ctl00_cPH_btnExportToExcel']");

	private By NewVATBackupExportPDFElem = By.xpath("//A[@id='ctl00_cPH_btnExportPDF']");

	private By VATReturnReportElem = By.xpath("//A[@id='ctl00_cPH_rptrDisplayRecords_ctl00_lnkVATReturnReport']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/AccountUI/VATReturn.aspx?FYCode=52455&CompanyCode=13259");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AccountUI/VATReturn.aspx?FYCode=52455&CompanyCode=13259");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AccountUI/VATReturn.aspx?FYCode=52455&CompanyCode=13259");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AccountUI/VATReturn.aspx?FYCode=52455&CompanyCode=13259";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AccountUI/VATReturn.aspx?FYCode=52455&CompanyCode=13259")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click VATReturnsTAB
	 * @throws InterruptedException 
     * @name Click VATReturnsTAB
     */
	public void Click_VATReturnsTAB() throws InterruptedException
	{
        
		WebElement elem = getWebElement(VATReturnsTABElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_VATReturnsTAB", "Click_VATReturnsTAB failed. Unable to locate object: " + VATReturnsTABElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_VATReturnsTAB", "Click_VATReturnsTAB failed. Unable to locate object: " + VATReturnsTABElem.toString());

			Assert.fail("Unable to locate object: " + VATReturnsTABElem.toString());
        }

		elem.click();
		Thread.sleep(1000);
		m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrDisplayRecords_ctl00_lnkEdit']/img")).click();
		Thread.sleep(2000);
		m_Driver.findElement(By.xpath("/html//form[@id='aspnetForm']//div[@class='body_content']/div[3]//div[@class='dashIn-opt']/a[6]/i[@class='fa fa-download']")).click();
		Thread.sleep(1500);
		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_VATReturnsTAB");

		TestModellerLogger.PassStep(m_Driver, "Click_VATReturnsTAB");
	}

     
	/**
 	 * Click VATReturnSettingTAB
     * @name Click VATReturnSettingTAB
     */
	public void Click_VATReturnSettingTAB()
	{
        
		WebElement elem = getWebElement(VATReturnSettingTABElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_VATReturnSettingTAB", "Click_VATReturnSettingTAB failed. Unable to locate object: " + VATReturnSettingTABElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_VATReturnSettingTAB", "Click_VATReturnSettingTAB failed. Unable to locate object: " + VATReturnSettingTABElem.toString());

			Assert.fail("Unable to locate object: " + VATReturnSettingTABElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_VATReturnSettingTAB");

		TestModellerLogger.PassStep(m_Driver, "Click_VATReturnSettingTAB");
	}

     
	/**
 	 * Click NewVATbackupReport
	 * @throws InterruptedException 
     * @name Click NewVATbackupReport
     */
	public void Click_NewVATbackupReport() throws InterruptedException
	{
        
		WebElement elem = getWebElement(NewVATbackupReportElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_NewVATbackupReport", "Click_NewVATbackupReport failed. Unable to locate object: " + NewVATbackupReportElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_NewVATbackupReport", "Click_NewVATbackupReport failed. Unable to locate object: " + NewVATbackupReportElem.toString());

			Assert.fail("Unable to locate object: " + NewVATbackupReportElem.toString());
        }

		elem.click();
		Thread.sleep(1500);

		ExtentReportManager.passStep(m_Driver, "Click_NewVATbackupReport");

		TestModellerLogger.PassStep(m_Driver, "Click_NewVATbackupReport");
	}

     
	/**
 	 * Click NewVATBackupExcel
	 * @throws InterruptedException 
     * @name Click NewVATBackupExcel
     */
	public void Click_NewVATBackupExcel() throws InterruptedException
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[5]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(NewVATBackupExcelElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_NewVATBackupExcel", "Click_NewVATBackupExcel failed. Unable to locate object: " + NewVATBackupExcelElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_NewVATBackupExcel", "Click_NewVATBackupExcel failed. Unable to locate object: " + NewVATBackupExcelElem.toString());

			Assert.fail("Unable to locate object: " + NewVATBackupExcelElem.toString());
        }

		elem.click();
		Thread.sleep(1500);
		m_Driver.switchTo().defaultContent();
		WebElement elem1 = getWebElement(VATReturnSettingTABElem);
		Thread.sleep(3000);
        
		elem1.click();
		Thread.sleep(1000);
  	

		ExtentReportManager.passStep(m_Driver, "Click_NewVATBackupExcel");

		TestModellerLogger.PassStep(m_Driver, "Click_NewVATBackupExcel");
	}

     
	/**
 	 * Click NewVATBackupExportPDF
	 * @throws InterruptedException 
     * @name Click NewVATBackupExportPDF
     */
	public void Click_NewVATBackupExportPDF() throws InterruptedException
	{
		
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[5]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(NewVATBackupExportPDFElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_NewVATBackupExportPDF", "Click_NewVATBackupExportPDF failed. Unable to locate object: " + NewVATBackupExportPDFElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_NewVATBackupExportPDF", "Click_NewVATBackupExportPDF failed. Unable to locate object: " + NewVATBackupExportPDFElem.toString());

			Assert.fail("Unable to locate object: " + NewVATBackupExportPDFElem.toString());
        }

		elem.click();
		Thread.sleep(1500);
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_NewVATBackupExportPDF");

		TestModellerLogger.PassStep(m_Driver, "Click_NewVATBackupExportPDF");
	}

     
	/**
 	 * Click VATReturnReport
	 * @throws InterruptedException 
     * @name Click VATReturnReport
     */
	public void Click_VATReturnReport() throws InterruptedException
	{
        
		WebElement elem = getWebElement(VATReturnReportElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_VATReturnReport", "Click_VATReturnReport failed. Unable to locate object: " + VATReturnReportElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_VATReturnReport", "Click_VATReturnReport failed. Unable to locate object: " + VATReturnReportElem.toString());

			Assert.fail("Unable to locate object: " + VATReturnReportElem.toString());
        }

		elem.click();
		Thread.sleep(1000);
          	

		ExtentReportManager.passStep(m_Driver, "Click_VATReturnReport");

		TestModellerLogger.PassStep(m_Driver, "Click_VATReturnReport");
	}
}