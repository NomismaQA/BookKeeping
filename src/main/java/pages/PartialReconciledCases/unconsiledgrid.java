package pages.PartialReconciledCases;

import pages.BasePage;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/791629da-4bd8-4064-8043-d912669c07bd
@TestModellerModule(guid = "791629da-4bd8-4064-8043-d912669c07bd")
public class unconsiledgrid extends BasePage
{
	public unconsiledgrid (WebDriver driver)
	{
		super(driver);
	}


	
	//private By checkbox1Elem = By.cssSelector("html>body>form>main>div:nth-of-type(11)>div:nth-of-type(3)>div>div:nth-of-type(4)>div:nth-of-type(1)>div>div>div>table>tbody>tr:nth-of-type(12)>td:nth-of-type(1)");
	private By checkbox1Elem =By.xpath("//*[@id='ctl00_cPH_rptrDisplayRecords_ctl00_cbSelect']");
	//private By Select_an_option3Elem = By.xpath("//SPAN[@id='select2-ctl00_cPH_rptrDisplayRecords_ctl11_ltAccount-container']/SPAN[@class='select2-selection__placeholder']");
	
	private By Select_an_option3Elem=By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div[1]/div/div/div/table/tbody/tr[1]/td[11]/span/span[1]/span/span[1]/span");
	//private By innerboxElem = By.cssSelector("INPUT[aria-autocomplete='list']");
	private By innerboxElem= By.xpath("/html/body/span/span/span[1]/input");

	//private By Reconcile_btn1Elem = By.xpath("//A[@id='ctl00_cPHFilter_LinkButtonEx1']");

	private By Reconcile_btn1Elem=By.xpath("//*[@id='ctl00_cPHFilter_LinkButtonEx1']");
	//private By Reconcile_btn1Elem=By.xpath("//h3[contains(text(),'Reconcile')")
	
	public void GoToUrl() throws InterruptedException
	{
		Thread.sleep(3000);
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/AccountUI/UnprocessedBankTran.aspx?FYCode=52444&CompanyCode=13236");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AccountUI/UnprocessedBankTran.aspx?FYCode=52444&CompanyCode=13236");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AccountUI/UnprocessedBankTran.aspx?FYCode=52444&CompanyCode=13236");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
//   public void AssertUrl()
//    {
//        String currentUrl = m_Driver.getCurrentUrl();
//        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AccountUI/UnprocessedBankTran.aspx?FYCode=52444&CompanyCode=13236";
//
//        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AccountUI/UnprocessedBankTran.aspx?FYCode=52444&CompanyCode=13236")) {
//            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
//        }
//    }

     
	/**
 	 * Click checkbox1
     * @name Click checkbox1
     */
	public void Click_checkbox1()
	{
        
		WebElement elem = getWebElement(checkbox1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_checkbox1", "Click_checkbox1 failed. Unable to locate object: " + checkbox1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_checkbox1", "Click_checkbox1 failed. Unable to locate object: " + checkbox1Elem.toString());

			Assert.fail("Unable to locate object: " + checkbox1Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_checkbox1");

		TestModellerLogger.PassStep(m_Driver, "Click_checkbox1");
	}

     
	/**
 	 * Click Select an option3
     * @name Click Select an option3
     */
	public void Click_Select_an_option3()
	{
        
		WebElement elem = getWebElement(Select_an_option3Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Select_an_option3", "Click_Select_an_option3 failed. Unable to locate object: " + Select_an_option3Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Select_an_option3", "Click_Select_an_option3 failed. Unable to locate object: " + Select_an_option3Elem.toString());

			Assert.fail("Unable to locate object: " + Select_an_option3Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Select_an_option3");

		TestModellerLogger.PassStep(m_Driver, "Click_Select_an_option3");
	}

      
	/**
 	 * Enter innerbox
	 * @throws InterruptedException 
     * @name Enter innerbox
     */
 	public void Enter_innerbox(String innerbox) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(innerboxElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_innerbox", "Enter_innerbox failed. Unable to locate object: " + innerboxElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_innerbox", "Enter_innerbox failed. Unable to locate object: " + innerboxElem.toString());

 			Assert.fail("Unable to locate object: " + innerboxElem.toString());
         }

 		elem.sendKeys(innerbox);
 		elem.sendKeys(Keys.ENTER);
 				
 		Thread.sleep(3000);
  		ExtentReportManager.passStep(m_Driver, "Enter_innerbox " + innerbox);

  		TestModellerLogger.PassStep(m_Driver, "Enter_innerbox " + innerbox);
 	}

     
	/**
 	 * Click Reconcile btn1
	 * @throws InterruptedException 
	 * @throws IOException 
     * @name Click Reconcile btn1
     */
	public void Click_Reconcile_btn1() throws InterruptedException, IOException
	{
        
		WebElement elem = getWebElement(Reconcile_btn1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Reconcile_btn1", "Click_Reconcile_btn1 failed. Unable to locate object: " + Reconcile_btn1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Reconcile_btn1", "Click_Reconcile_btn1 failed. Unable to locate object: " + Reconcile_btn1Elem.toString());

			Assert.fail("Unable to locate object: " + Reconcile_btn1Elem.toString());
        }

		//elem.click();
		JavascriptExecutor jse = (JavascriptExecutor)m_Driver;
		jse.executeScript("arguments[0].click()", elem);
          	
        Thread.sleep(1000);
		ExtentReportManager.passStep(m_Driver, "Click_Reconcile_btn1");

		TestModellerLogger.PassStep(m_Driver, "Click_Reconcile_btn1");
		
		  File screenshot = ((TakesScreenshot) m_Driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(screenshot, new File("C:\\Users\\Outbooks\\Desktop\\new\\TestModeller-JavaSeleniumFramework-master\\TestModeller-JavaSeleniumFramework-master\\Framework\\report\\ErrorScreenshots\\test1.png"));
	        
		
	}
}