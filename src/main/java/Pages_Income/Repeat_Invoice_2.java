package Pages_Income;

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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/1e6daff9-c099-4f03-9a2f-3a46b6f556e8
@TestModellerModule(guid = "1e6daff9-c099-4f03-9a2f-3a46b6f556e8")
public class Repeat_Invoice_2 extends BasePage
{
	public Repeat_Invoice_2 (WebDriver driver)
	{
		super(driver);
	}


	
	private By ThreeDot_1Elem = By.xpath("//*[@id='ctl00_divSubContent']/div[4]/div[2]/div/div/div/div/table/tbody/tr[1]/td[13]/div");

	private By Copy_2Elem = By.xpath("//A[@id='ctl00_cPH_rptrDisplayRecords_ctl00_lnkCopy']");

	private By Edit_3Elem = By.xpath("//A[@id='ctl00_cPH_rptrDisplayRecords_ctl00_lnkEdit']");

	private By Delete_4_t0_8Elem = By.xpath("//A[@id='ctl00_cPH_rptrDisplayRecords_ctl00_lnkDelete']");

	private By Save_2_6Elem = By.xpath("//A[@id='ctl00_cPH_btnSave']");

	private By Description_2_7Elem = By.xpath("//INPUT[@name='ctl00$cPH$rptrProduct$ctl00$txtDescription']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AccountUI/RecurringInvoice.aspx?FYCode=117652&CompanyCode=17315");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/RecurringInvoice.aspx?FYCode=117652&CompanyCode=17315");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/RecurringInvoice.aspx?FYCode=117652&CompanyCode=17315");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/AccountUI/RecurringInvoice.aspx?FYCode=117652&CompanyCode=17315";

        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/AccountUI/RecurringInvoice.aspx?FYCode=117652&CompanyCode=17315")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click ThreeDot 1
     * @name Click ThreeDot 1
     */
	public void Click_ThreeDot_1()
	{
        
		WebElement elem = getWebElement(ThreeDot_1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ThreeDot_1", "Click_ThreeDot_1 failed. Unable to locate object: " + ThreeDot_1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ThreeDot_1", "Click_ThreeDot_1 failed. Unable to locate object: " + ThreeDot_1Elem.toString());

			Assert.fail("Unable to locate object: " + ThreeDot_1Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_ThreeDot_1");

		TestModellerLogger.PassStep(m_Driver, "Click_ThreeDot_1");
	}

     
	/**
 	 * Click Copy 2
     * @name Click Copy 2
     */
	public void Click_Copy_2()
	{
        
		WebElement elem = getWebElement(Copy_2Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Copy_2", "Click_Copy_2 failed. Unable to locate object: " + Copy_2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Copy_2", "Click_Copy_2 failed. Unable to locate object: " + Copy_2Elem.toString());

			Assert.fail("Unable to locate object: " + Copy_2Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Copy_2");

		TestModellerLogger.PassStep(m_Driver, "Click_Copy_2");
	}

     
	/**
 	 * Click Edit 3
     * @name Click Edit 3
     */
	public void Click_Edit_3()
	{
        
		WebElement elem = getWebElement(Edit_3Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Edit_3", "Click_Edit_3 failed. Unable to locate object: " + Edit_3Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Edit_3", "Click_Edit_3 failed. Unable to locate object: " + Edit_3Elem.toString());

			Assert.fail("Unable to locate object: " + Edit_3Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Edit_3");

		TestModellerLogger.PassStep(m_Driver, "Click_Edit_3");
	}

     
	/**
 	 * Click Delete 4 t0 8
	 * @throws InterruptedException 
     * @name Click Delete 4 t0 8
     */
	public void Click_Delete_4_t0_8() throws InterruptedException
	{
        
		WebElement elem = getWebElement(Delete_4_t0_8Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Delete_4_t0_8", "Click_Delete_4_t0_8 failed. Unable to locate object: " + Delete_4_t0_8Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Delete_4_t0_8", "Click_Delete_4_t0_8 failed. Unable to locate object: " + Delete_4_t0_8Elem.toString());

			Assert.fail("Unable to locate object: " + Delete_4_t0_8Elem.toString());
        }

		elem.click();
          	Thread.sleep(2000);

		ExtentReportManager.passStep(m_Driver, "Click_Delete_4_t0_8");

		TestModellerLogger.PassStep(m_Driver, "Click_Delete_4_t0_8");
	}

     
	/**
 	 * Click Save 2_6
	 * @throws InterruptedException 
     * @name Click Save 2_6
     */
	public void Click_Save_2_6() throws InterruptedException
	{
        
		WebElement elem = getWebElement(Save_2_6Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Save_2_6", "Click_Save_2_6 failed. Unable to locate object: " + Save_2_6Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Save_2_6", "Click_Save_2_6 failed. Unable to locate object: " + Save_2_6Elem.toString());

			Assert.fail("Unable to locate object: " + Save_2_6Elem.toString());
        }

		elem.click();
		Thread.sleep(2000);

		ExtentReportManager.passStep(m_Driver, "Click_Save_2_6");

		TestModellerLogger.PassStep(m_Driver, "Click_Save_2_6");
	}

      
	/**
 	 * Enter Description 2_7
     * @name Enter Description 2_7
     */
 	public void Enter_Description_2_7(String Description_2_7)
 	{
 	    
 		WebElement elem = getWebElement(Description_2_7Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Description_2_7", "Enter_Description_2_7 failed. Unable to locate object: " + Description_2_7Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Description_2_7", "Enter_Description_2_7 failed. Unable to locate object: " + Description_2_7Elem.toString());

 			Assert.fail("Unable to locate object: " + Description_2_7Elem.toString());
         }

 		elem.sendKeys(Description_2_7);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Description_2_7 " + Description_2_7);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Description_2_7 " + Description_2_7);
 	}
 	
 	public void deleteBtn() throws InterruptedException
 	{
 		WebElement DelBtn=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_btnDelete']"));
 		Thread.sleep(2000);
 		DelBtn.click();
 	}
 	
 	public void Screenshot_Edit_Page()
 	{
 		utilities.Screenshotcapture.Getscreenshot("Edit Page", "Repeat Invoice");
 	}
 	
 	public void Screenshot_Edit_Page_Suss_Msg()
 	{
 		utilities.Screenshotcapture.Getscreenshot("Edit Success", "Repeat Invoice");
 	}
 	
	public void Screenshot_Copy_Page()
 	{
 		utilities.Screenshotcapture.Getscreenshot("Copy Page", "Repeat Invoice");
 	}
 	
 	public void Screenshot_Copy_Page_Suss_Msg()
 	{
 		utilities.Screenshotcapture.Getscreenshot("Copy Success", "Repeat Invoice");
 	}
 	
 	
 	public void Screenshot_Del_Page()
 	{
 		utilities.Screenshotcapture.Getscreenshot("Delete Page", "Repeat Invoice");
 	}
 	
 	public void Screenshot_Del_Page_Suss_Msg()
 	{
 		utilities.Screenshotcapture.Getscreenshot("Delete Success", "Repeat Invoice");
 	}
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
}