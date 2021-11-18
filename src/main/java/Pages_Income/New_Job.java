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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/f060cef1-4535-4dc6-be7b-a6625da3216e
@TestModellerModule(guid = "f060cef1-4535-4dc6-be7b-a6625da3216e")
public class New_Job extends BasePage
{
	public New_Job (WebDriver driver)
	{
		super(driver);
	}


	
	private By New_1Elem = By.xpath("//*[@id='ctl00_divMainContent']/header/div/div[4]/a");

	private By New_Job_2Elem = By.xpath("//A[contains(text(),'New Job')]");

	private By Add_Job_3Elem = By.xpath("//A[@id='ctl00_cpHeaderRight_btnAdd']");

	private By Job_Name_4Elem = By.xpath("//label[normalize-space()= 'Job Name']/../../div[2]/input");

	private By JobNo_5Elem = By.xpath("//label[normalize-space()= 'Job No']/../../div[2]/input");

	private By JobStatus_6Elem = By.xpath("//label[normalize-space()= 'Job Status']/../../div[2]/select");

	private By Save_8Elem = By.xpath("//A[@id='ctl00_cphFooter_btnSave']");

	private By Edit_9Elem = By.xpath("//A[@id='ctl00_cPH_rptrDisplayRecords_ctl00_lnkEdit']");

	private By Delete_10Elem = By.xpath("//A[@id='ctl00_cPH_rptrDisplayRecords_ctl00_lnkDelete']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AccountUI/Job.aspx?FYCode=117652&CompanyCode=17315");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/Job.aspx?FYCode=117652&CompanyCode=17315");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/Job.aspx?FYCode=117652&CompanyCode=17315");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/AccountUI/Job.aspx?FYCode=117652&CompanyCode=17315";

        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/AccountUI/Job.aspx?FYCode=117652&CompanyCode=17315")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click New 1
     * @name Click New 1
     */
	public void Click_New_1()
	{
        
		WebElement elem = getWebElement(New_1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_New_1", "Click_New_1 failed. Unable to locate object: " + New_1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_New_1", "Click_New_1 failed. Unable to locate object: " + New_1Elem.toString());

			Assert.fail("Unable to locate object: " + New_1Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_New_1");

		TestModellerLogger.PassStep(m_Driver, "Click_New_1");
	}

     
	/**
 	 * Click New Job 2
     * @name Click New Job 2
     */
	public void Click_New_Job_2()
	{
        
		WebElement elem = getWebElement(New_Job_2Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_New_Job_2", "Click_New_Job_2 failed. Unable to locate object: " + New_Job_2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_New_Job_2", "Click_New_Job_2 failed. Unable to locate object: " + New_Job_2Elem.toString());

			Assert.fail("Unable to locate object: " + New_Job_2Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_New_Job_2");

		TestModellerLogger.PassStep(m_Driver, "Click_New_Job_2");
	}

     
	/**
 	 * Click Add Job 3
     * @name Click Add Job 3
     */
	public void Click_Add_Job_3()
	{
        
		WebElement elem = getWebElement(Add_Job_3Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Add_Job_3", "Click_Add_Job_3 failed. Unable to locate object: " + Add_Job_3Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Add_Job_3", "Click_Add_Job_3 failed. Unable to locate object: " + Add_Job_3Elem.toString());

			Assert.fail("Unable to locate object: " + Add_Job_3Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Add_Job_3");

		TestModellerLogger.PassStep(m_Driver, "Click_Add_Job_3");
	}

      
	/**
 	 * Enter Job Name 4
     * @name Enter Job Name 4
     */
 	public void Enter_Job_Name_4(String Job_Name_4)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(Job_Name_4Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Job_Name_4", "Enter_Job_Name_4 failed. Unable to locate object: " + Job_Name_4Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Job_Name_4", "Enter_Job_Name_4 failed. Unable to locate object: " + Job_Name_4Elem.toString());

 			Assert.fail("Unable to locate object: " + Job_Name_4Elem.toString());
         }

 		elem.sendKeys(Job_Name_4);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Job_Name_4 " + Job_Name_4);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Job_Name_4 " + Job_Name_4);
 	}

      
	/**
 	 * Enter JobNo 5
     * @name Enter JobNo 5
     */
 	public void Enter_JobNo_5(String JobNo_5)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(JobNo_5Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_JobNo_5", "Enter_JobNo_5 failed. Unable to locate object: " + JobNo_5Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_JobNo_5", "Enter_JobNo_5 failed. Unable to locate object: " + JobNo_5Elem.toString());

 			Assert.fail("Unable to locate object: " + JobNo_5Elem.toString());
         }

 		elem.sendKeys(JobNo_5);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_JobNo_5 " + JobNo_5);

  		TestModellerLogger.PassStep(m_Driver, "Enter_JobNo_5 " + JobNo_5);
 	}

    
	/**
 	 * Select JobStatus 6
     * @name Select JobStatus 6
     */
    public void Select_JobStatus_6(String JobStatus_6)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(JobStatus_6Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_JobStatus_6", "Select_JobStatus_6 failed. Unable to locate object: " + JobStatus_6Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_JobStatus_6", "Select_JobStatus_6 failed. Unable to locate object: " + JobStatus_6Elem.toString());

 			Assert.fail("Unable to locate object: " + JobStatus_6Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(JobStatus_6);
 		
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_JobStatus_6 " + JobStatus_6);

 		TestModellerLogger.PassStep(m_Driver, "Select_JobStatus_6 " + JobStatus_6);
 	}

     
	/**
 	 * Click Save 8
	 * @throws InterruptedException 
     * @name Click Save 8
     */
	public void Click_Save_8() throws InterruptedException
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(Save_8Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Save_8", "Click_Save_8 failed. Unable to locate object: " + Save_8Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Save_8", "Click_Save_8 failed. Unable to locate object: " + Save_8Elem.toString());

			Assert.fail("Unable to locate object: " + Save_8Elem.toString());
        }
		Thread.sleep(2000);
		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_Save_8");

		TestModellerLogger.PassStep(m_Driver, "Click_Save_8");
	}

     
	/**
 	 * Click Edit 9
     * @name Click Edit 9
     */
	public void Click_Edit_9()
	{
        
		WebElement elem = getWebElement(Edit_9Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Edit_9", "Click_Edit_9 failed. Unable to locate object: " + Edit_9Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Edit_9", "Click_Edit_9 failed. Unable to locate object: " + Edit_9Elem.toString());

			Assert.fail("Unable to locate object: " + Edit_9Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Edit_9");

		TestModellerLogger.PassStep(m_Driver, "Click_Edit_9");
	}

     
	/**
 	 * Click Delete 10
     * @name Click Delete 10
     */
	public void Click_Delete_10()
	{
        
		WebElement elem = getWebElement(Delete_10Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Delete_10", "Click_Delete_10 failed. Unable to locate object: " + Delete_10Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Delete_10", "Click_Delete_10 failed. Unable to locate object: " + Delete_10Elem.toString());

			Assert.fail("Unable to locate object: " + Delete_10Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Delete_10");

		TestModellerLogger.PassStep(m_Driver, "Click_Delete_10");
	}
	
	public void Delete_Job() throws InterruptedException
	{
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='cboxLoadedContent']/iframe")));
		Thread.sleep(2000);
		m_Driver.findElement(By.xpath("//*[@id='ctl00_cphFooter_btnDelete']")).click();
		
		
	}
	
	
	
	
	
	
	
	
	
}