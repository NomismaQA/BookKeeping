package pages.Sales_customer_add;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/8d62765a-d5c9-4572-b003-34f696989591
@TestModellerModule(guid = "8d62765a-d5c9-4572-b003-34f696989591")
public class SalesDB extends BasePage
{
	String st1= null;
String template = null;
	public SalesDB(WebDriver driver) 
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}

	String searchname;
	private By DownloadCsv= By.xpath("//*[@id='ctl00_cPH_btnExportToExcel']/i");
	private By Select_Cust_Drpdwn1Elem = By.xpath("//label[normalize-space()= 'Customer:']/../div/select");

	private By Search_bY_Cat2Elem = By.xpath("//label[normalize-space()= 'Search Category:']/../div/select");

	private By Select_Payment_Status3Elem = By.xpath("//BUTTON[@title='UnPaid, Paid, Partially Paid']");

	private By Select_Due_Status4Elem = By.xpath("//SELECT[@name='ctl00$cPHFilter$dd_due']");

	private By Select_Date_From6Elem = By.xpath("//INPUT[@name='ctl00$cPHFilter$txtDateFrom']");

	private By ctl00cPHFiltertxtDateToElem = By.xpath("//INPUT[@name='ctl00$cPHFilter$txtDateTo']");

	//private By Click_Update__btnElem = By.xpath("//label[normalize-space()= '']/../div/a");

	private By Click_Update__btnElem =By.xpath("//*[@id='ctl00_cPHFilter_btnSearch']");
	
	//private By Select_Bank = By.xpath("//*[@id='ctl00_cPH_ddlTemplate']");
	
	private By Enter_BankElem = By.xpath("//*[@id='ctl00_cPH_ddlBanks']");

	
	
	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=117239&CompanyCode=16902&IsFirstRequest=1");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=117239&CompanyCode=16902&IsFirstRequest=1");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=117239&CompanyCode=16902&IsFirstRequest=1");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=117239&CompanyCode=16902&IsFirstRequest=1";

        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=117239&CompanyCode=16902&IsFirstRequest=1")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

    
	/**
 	 * Select Select_Cust_Drpdwn1
     * @name Select Select_Cust_Drpdwn1
     */
    public void Select_Select_Cust_Drpdwn1(String Select_Cust_Drpdwn1)
 	{
 	    
 		WebElement elem = getWebElement(Select_Cust_Drpdwn1Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Select_Cust_Drpdwn1", "Select_Select_Cust_Drpdwn1 failed. Unable to locate object: " + Select_Cust_Drpdwn1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Select_Cust_Drpdwn1", "Select_Select_Cust_Drpdwn1 failed. Unable to locate object: " + Select_Cust_Drpdwn1Elem.toString());

 			Assert.fail("Unable to locate object: " + Select_Cust_Drpdwn1Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Select_Cust_Drpdwn1);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Select_Cust_Drpdwn1 " + Select_Cust_Drpdwn1);

 		TestModellerLogger.PassStep(m_Driver, "Select_Select_Cust_Drpdwn1 " + Select_Cust_Drpdwn1);
 	}

 

    
	/**
 	 * Select Search_bY_Cat2
     * @name Select Search_bY_Cat2
     */
    public void Select_Search_bY_Cat2(String Search_bY_Cat2)
 	{
 	    
 		WebElement elem = getWebElement(Search_bY_Cat2Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Search_bY_Cat2", "Select_Search_bY_Cat2 failed. Unable to locate object: " + Search_bY_Cat2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Search_bY_Cat2", "Select_Search_bY_Cat2 failed. Unable to locate object: " + Search_bY_Cat2Elem.toString());

 			Assert.fail("Unable to locate object: " + Search_bY_Cat2Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Search_bY_Cat2);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Search_bY_Cat2 " + Search_bY_Cat2);

 		TestModellerLogger.PassStep(m_Driver, "Select_Search_bY_Cat2 " + Search_bY_Cat2);
 	}

     
	/**
 	 * Click Select_Payment_Status3
     * @name Click Select_Payment_Status3
     */
	public void Click_Select_Payment_Status3()
	{
        
		WebElement elem = getWebElement(Select_Payment_Status3Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Select_Payment_Status3", "Click_Select_Payment_Status3 failed. Unable to locate object: " + Select_Payment_Status3Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Select_Payment_Status3", "Click_Select_Payment_Status3 failed. Unable to locate object: " + Select_Payment_Status3Elem.toString());

			Assert.fail("Unable to locate object: " + Select_Payment_Status3Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Select_Payment_Status3");

		TestModellerLogger.PassStep(m_Driver, "Click_Select_Payment_Status3");
	}

    
	/**
 	 * Select Select_Due_Status4
     * @name Select Select_Due_Status4
     */
    public void Select_Select_Due_Status4(String Select_Due_Status4)
 	{
 	    
 		WebElement elem = getWebElement(Select_Due_Status4Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Select_Due_Status4", "Select_Select_Due_Status4 failed. Unable to locate object: " + Select_Due_Status4Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Select_Due_Status4", "Select_Select_Due_Status4 failed. Unable to locate object: " + Select_Due_Status4Elem.toString());

 			Assert.fail("Unable to locate object: " + Select_Due_Status4Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Select_Due_Status4);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Select_Due_Status4 " + Select_Due_Status4);

 		TestModellerLogger.PassStep(m_Driver, "Select_Select_Due_Status4 " + Select_Due_Status4);
 	}

      
	/**
 	 * Enter Select_Date_From6
     * @name Enter Select_Date_From6
     */
 	public void Enter_Select_Date_From6(String Select_Date_From6)
 	{
 	    
 		WebElement elem = getWebElement(Select_Date_From6Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Select_Date_From6", "Enter_Select_Date_From6 failed. Unable to locate object: " + Select_Date_From6Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Select_Date_From6", "Enter_Select_Date_From6 failed. Unable to locate object: " + Select_Date_From6Elem.toString());

 			Assert.fail("Unable to locate object: " + Select_Date_From6Elem.toString());
         }

 		elem.sendKeys(Select_Date_From6);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Select_Date_From6 " + Select_Date_From6);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Select_Date_From6 " + Select_Date_From6);
 	}

      
	/**
 	 * Enter ctl00$cPHFilter$txtDateTo
     * @name Enter ctl00$cPHFilter$txtDateTo
     */
 	public void Enter_ctl00cPHFiltertxtDateTo(String ctl00cPHFiltertxtDateTo)
 	{
 	    
 		WebElement elem = getWebElement(ctl00cPHFiltertxtDateToElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHFiltertxtDateTo", "Enter_ctl00cPHFiltertxtDateTo failed. Unable to locate object: " + ctl00cPHFiltertxtDateToElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHFiltertxtDateTo", "Enter_ctl00cPHFiltertxtDateTo failed. Unable to locate object: " + ctl00cPHFiltertxtDateToElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHFiltertxtDateToElem.toString());
         }

 		elem.sendKeys(ctl00cPHFiltertxtDateTo);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHFiltertxtDateTo " + ctl00cPHFiltertxtDateTo);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHFiltertxtDateTo " + ctl00cPHFiltertxtDateTo);
 	}

     
	/**
 	 * Click Click_Update _btn
     * @name Click Click_Update _btn
     */
	public void Click_Click_Update__btn()
	{
        
		WebElement elem = getWebElement(Click_Update__btnElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Click_Update__btn", "Click_Click_Update__btn failed. Unable to locate object: " + Click_Update__btnElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Click_Update__btn", "Click_Click_Update__btn failed. Unable to locate object: " + Click_Update__btnElem.toString());

			Assert.fail("Unable to locate object: " + Click_Update__btnElem.toString());
        }

		//jsExec.executeScript("arguments[0].click()",elem);
		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Click_Update__btn");

		TestModellerLogger.PassStep(m_Driver, "Click_Click_Update__btn");
	}
	public void DownloadCsv()
	{
		
		WebElement elem=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_btnExportToExcel']/i"));
		elem.click();
		utilities.PassScreenshot.Getscreenshot11("csv download", "Customer list Download csv");
		
	}
	public void UploadCsv()
	{
		WebElement elem=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_btnUpload']/i"));
		jsExec.executeScript("arguments[0].click()",elem);
		
		
	}
	public void Enter_Choose_Upload_CSV(String uploadcsv) throws InterruptedException
 	{
 	    
 		WebElement efileupload=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_FileUpload1']"));
    
 		efileupload.sendKeys(uploadcsv);
 		Thread.sleep(1000);
 		utilities.PassScreenshot.Getscreenshot11("Browse File","UploadCSV");
 		WebElement ebrowse=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_btnUploadBatch']"));
 		ebrowse.click();
 		Thread.sleep(1000);
 		 		
 		WebElement eimport=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_btnImport']"));
 		eimport.click();
 		Thread.sleep(1000);
 		
 		utilities.PassScreenshot.Getscreenshot11("sucessfuly uploaded","uploadcs");
 	}
	
	public void Click_Checbox() throws InterruptedException
	{
		
		m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_divLimited']/div/table/thead/tr/th[1]")).click();
		System.out.println("mail to click");
		WebElement elem3=m_Driver.findElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/a[1]"));
		elem3.click();


	}
	
	
	
}
