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

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/28736bb1-da41-44c5-851d-43caf072821b
@TestModellerModule(guid = "28736bb1-da41-44c5-851d-43caf072821b")
public class VATReturn3rdVATRetrunReport extends BasePage
{
	public VATReturn3rdVATRetrunReport (WebDriver driver)
	{
		super(driver);
	}


	
	//private By _VAT_Returns_Elem = By.xpath("//A[@href='../AccountUI/VATReturn.aspx?FYCode=52455&CompanyCode=13259']");
	private By _VAT_Returns_Elem = By.xpath("//span[contains(text(),'VAT Returns')]");
	private By SettingsTABElem = By.xpath("//A[@class='toggleSettings']");

	private By VATReturnReportTABElem = By.xpath("//A[@id='ctl00_cPH_rptrDisplayRecords_ctl00_lnkVATReturnReport']");

	private By DownLoadLinkElem = By.xpath("//A[@title='Export drop down menu']");

	private By PDFOptionElem = By.xpath("//A[@title='PDF']");

	private By _VATReturnReportCloseElem = By.xpath("//BUTTON[@id='EditPopUpClose']");


	
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
//        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/AccountUI/VATReturn.aspx?FYCode=52455&CompanyCode=13259";
//
//        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/AccountUI/VATReturn.aspx?FYCode=52455&CompanyCode=13259")) {
//            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
//        }
//    }

     
	/**
 	 * Click  VAT Returns 
     * @name Click  VAT Returns 
     */
	public void Click__VAT_Returns_()
	{
        
		WebElement elem = getWebElement(_VAT_Returns_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__VAT_Returns_", "Click__VAT_Returns_ failed. Unable to locate object: " + _VAT_Returns_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__VAT_Returns_", "Click__VAT_Returns_ failed. Unable to locate object: " + _VAT_Returns_Elem.toString());

			Assert.fail("Unable to locate object: " + _VAT_Returns_Elem.toString());
        }

		elem.click();
		//ChangeWindow.tabswitch(m_Driver);      	

		ExtentReportManager.passStep(m_Driver, "Click__VAT_Returns_");

		TestModellerLogger.PassStep(m_Driver, "Click__VAT_Returns_");
	}

     
	/**
 	 * Click SettingsTAB
     * @name Click SettingsTAB
     */
	public void Click_SettingsTAB()
	{
        
		WebElement elem = getWebElement(SettingsTABElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SettingsTAB", "Click_SettingsTAB failed. Unable to locate object: " + SettingsTABElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SettingsTAB", "Click_SettingsTAB failed. Unable to locate object: " + SettingsTABElem.toString());

			Assert.fail("Unable to locate object: " + SettingsTABElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_SettingsTAB");

		TestModellerLogger.PassStep(m_Driver, "Click_SettingsTAB");
	}

     
	/**
 	 * Click VATReturnReportTAB
     * @name Click VATReturnReportTAB
     */
	public void Click_VATReturnReportTAB()
	{
        
		WebElement elem = getWebElement(VATReturnReportTABElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_VATReturnReportTAB", "Click_VATReturnReportTAB failed. Unable to locate object: " + VATReturnReportTABElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_VATReturnReportTAB", "Click_VATReturnReportTAB failed. Unable to locate object: " + VATReturnReportTABElem.toString());

			Assert.fail("Unable to locate object: " + VATReturnReportTABElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_VATReturnReportTAB");

		TestModellerLogger.PassStep(m_Driver, "Click_VATReturnReportTAB");
	}

     
	/**
 	 * Click DownLoadLink
     * @name Click DownLoadLink
     */
	public void Click_DownLoadLink()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[5]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(DownLoadLinkElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_DownLoadLink", "Click_DownLoadLink failed. Unable to locate object: " + DownLoadLinkElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_DownLoadLink", "Click_DownLoadLink failed. Unable to locate object: " + DownLoadLinkElem.toString());

			Assert.fail("Unable to locate object: " + DownLoadLinkElem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_DownLoadLink");

		TestModellerLogger.PassStep(m_Driver, "Click_DownLoadLink");
	}

     
	/**
 	 * Click PDFOption
     * @name Click PDFOption
     */
	public void Click_PDFOption()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[5]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(PDFOptionElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_PDFOption", "Click_PDFOption failed. Unable to locate object: " + PDFOptionElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_PDFOption", "Click_PDFOption failed. Unable to locate object: " + PDFOptionElem.toString());

			Assert.fail("Unable to locate object: " + PDFOptionElem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_PDFOption");

		TestModellerLogger.PassStep(m_Driver, "Click_PDFOption");
	}

     
	/**
 	 * Click × VATReturnReportClose
     * @name Click × VATReturnReportClose
     */
	public void Click__VATReturnReportClose()
	{
        
		WebElement elem = getWebElement(_VATReturnReportCloseElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__VATReturnReportClose", "Click__VATReturnReportClose failed. Unable to locate object: " + _VATReturnReportCloseElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__VATReturnReportClose", "Click__VATReturnReportClose failed. Unable to locate object: " + _VATReturnReportCloseElem.toString());

			Assert.fail("Unable to locate object: " + _VATReturnReportCloseElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__VATReturnReportClose");

		TestModellerLogger.PassStep(m_Driver, "Click__VATReturnReportClose");
	}
}