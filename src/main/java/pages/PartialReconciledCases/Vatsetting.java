package pages.PartialReconciledCases;

import pages.BasePage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.aventstack.extentreports.model.ScreenCapture;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.GetScreenShot;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/5a8474ae-6f1e-4f7f-bea2-cf799e13a964
@TestModellerModule(guid = "5a8474ae-6f1e-4f7f-bea2-cf799e13a964")
public class Vatsetting extends BasePage
{
	public Vatsetting (WebDriver driver)
	{
		super(driver);
	}

	private By VATSettingsElem = By.xpath("/html/body/form/main/div[11]/div[2]/ul/li[12]/a");

	private By VATMenuElem = By.xpath("//SPAN[@id='__tab_ctl00_cPH_tbContainer_TbVat']");

	private By TopEditbuttonElem = By.xpath("//A[@data-original-title='Edit']");

	private By EditiconElem = By.xpath("/html/body/form/main/div[11]/div[3]/div/div[6]/div/div/div/div[2]/div[2]/div/div/div/div[3]/div/table/tbody/tr[1]/td[3]");

	private By VATStatusElem = By.xpath("//SELECT[@name='ctl00$cPH$ddVATStatus']");

	private By ctl00cPHtxtDateElem = By.xpath("//INPUT[@name='ctl00$cPH$txtDate']");

	private By _Save_Elem = By.xpath("//A[@id='ctl00_cphFooter_btnSave']");

	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/AccountUI/CompanyInfo.aspx?FYCode=52444&CompanyCode=13236");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AccountUI/CompanyInfo.aspx?FYCode=52444&CompanyCode=13236");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AccountUI/CompanyInfo.aspx?FYCode=52444&CompanyCode=13236");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
//     */
//   public void AssertUrl()
//    {
//        String currentUrl = m_Driver.getCurrentUrl();
//        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AccountUI/CompanyInfo.aspx?FYCode=52444&CompanyCode=13236";
//
//        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AccountUI/CompanyInfo.aspx?FYCode=52444&CompanyCode=13236")) {
//            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
//        }
//    }

     
	/**
 	 * Click VATSettings
     * @name Click VATSettings
     */
	public void Click_VATSettings()
	{
        
		WebElement elem = getWebElement(VATSettingsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_VATSettings", "Click_VATSettings failed. Unable to locate object: " + VATSettingsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_VATSettings", "Click_VATSettings failed. Unable to locate object: " + VATSettingsElem.toString());

			Assert.fail("Unable to locate object: " + VATSettingsElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_VATSettings");

		TestModellerLogger.PassStep(m_Driver, "Click_VATSettings");
	}

     
	/**
 	 * Click VATMenu
     * @name Click VATMenu
     */
	public void Click_VATMenu()
	{
        
		WebElement elem = getWebElement(VATMenuElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_VATMenu", "Click_VATMenu failed. Unable to locate object: " + VATMenuElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_VATMenu", "Click_VATMenu failed. Unable to locate object: " + VATMenuElem.toString());

			Assert.fail("Unable to locate object: " + VATMenuElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_VATMenu");

		TestModellerLogger.PassStep(m_Driver, "Click_VATMenu");
	}

     
	/**
 	 * Click TopEditbutton
     * @name Click TopEditbutton
     */
	public void Click_TopEditbutton()
	{
        
		WebElement elem = getWebElement(TopEditbuttonElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_TopEditbutton", "Click_TopEditbutton failed. Unable to locate object: " + TopEditbuttonElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_TopEditbutton", "Click_TopEditbutton failed. Unable to locate object: " + TopEditbuttonElem.toString());

			Assert.fail("Unable to locate object: " + TopEditbuttonElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_TopEditbutton");

		TestModellerLogger.PassStep(m_Driver, "Click_TopEditbutton");
	}

     
	/**
 	 * Click Editicon
     * @name Click Editicon
     */
	public void Click_Editicon()
	{
        
		WebElement elem = getWebElement(EditiconElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Editicon", "Click_Editicon failed. Unable to locate object: " + EditiconElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Editicon", "Click_Editicon failed. Unable to locate object: " + EditiconElem.toString());

			Assert.fail("Unable to locate object: " + EditiconElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Editicon");

		TestModellerLogger.PassStep(m_Driver, "Click_Editicon");
	}

    
	/**
 	 * Select VATStatus
	 * @throws InterruptedException 
     * @name Select VATStatus
     */
    public void Select_VATStatus(String VATStatus) throws InterruptedException
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[6]/div/div/div/div[2]/div[2]/div/div/div/div[4]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(VATStatusElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_VATStatus", "Select_VATStatus failed. Unable to locate object: " + VATStatusElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_VATStatus", "Select_VATStatus failed. Unable to locate object: " + VATStatusElem.toString());

 			Assert.fail("Unable to locate object: " + VATStatusElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(VATStatus);
 		Thread.sleep(1000);
 		
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_VATStatus " + VATStatus);

 		TestModellerLogger.PassStep(m_Driver, "Select_VATStatus " + VATStatus);
 	}

      
	/**
 	 * Enter ctl00$cPH$txtDate
     * @name Enter ctl00$cPH$txtDate
     */
 	public void Enter_ctl00cPHtxtDate(String ctl00cPHtxtDate)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[6]/div/div/div/div[2]/div[2]/div/div/div/div[4]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(ctl00cPHtxtDateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtDate", "Enter_ctl00cPHtxtDate failed. Unable to locate object: " + ctl00cPHtxtDateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtDate", "Enter_ctl00cPHtxtDate failed. Unable to locate object: " + ctl00cPHtxtDateElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtxtDateElem.toString());
         }

 		elem.sendKeys(ctl00cPHtxtDate);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtxtDate " + ctl00cPHtxtDate);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtxtDate " + ctl00cPHtxtDate);
 	}

     
	/**
 	 * Click  Save 
	 * @throws IOException 
     * @name Click  Save 
     */
	public void Click__Save_() throws IOException
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[6]/div/div/div/div[2]/div[2]/div/div/div/div[4]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(_Save_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Save_", "Click__Save_ failed. Unable to locate object: " + _Save_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Save_", "Click__Save_ failed. Unable to locate object: " + _Save_Elem.toString());

			Assert.fail("Unable to locate object: " + _Save_Elem.toString());
        }

		elem.click();
		GetScreenShot.captureAsImage(m_Driver,"elem");
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click__Save_");

		TestModellerLogger.PassStep(m_Driver, "Click__Save_");
	}
}