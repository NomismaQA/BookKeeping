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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/f2dd9bb2-deee-4f51-9a3a-1bd2adfa99f7
@TestModellerModule(guid = "f2dd9bb2-deee-4f51-9a3a-1bd2adfa99f7")
public class Repeat_Invoice_Upload extends BasePage
{
	public Repeat_Invoice_Upload (WebDriver driver)
	{
		super(driver);
	}


	
	private By UploadBtn_1Elem = By.xpath("//A[@id='ctl00_cPH_btnUpload']");

	private By CSV_Sample_2Elem = By.xpath("//A[@id='ctl00_cpHeaderRight_btnExportSample']");

	private By EnterFileUpload_3Elem = By.xpath("//label[normalize-space()= 'Upload CSV:']/../div/input");

	private By UploadBtn_4Elem = By.xpath("//label[normalize-space()= '']/../div/input");

	private By StartDate_5Elem = By.xpath("//SELECT[@name='ctl00$cPH$gvCSVColumn$ctl02$ddlMappedCol']");

	private By Customer_6Elem = By.xpath("//SELECT[@name='ctl00$cPH$gvCSVColumn$ctl03$ddlMappedCol']");

	private By Income_Type_7Elem = By.xpath("//SELECT[@name='ctl00$cPH$gvCSVColumn$ctl04$ddlMappedCol']");

	private By Dis_8Elem = By.xpath("//SELECT[@name='ctl00$cPH$gvCSVColumn$ctl05$ddlMappedCol']");

	private By Amount_9Elem = By.xpath("//SELECT[@name='ctl00$cPH$gvCSVColumn$ctl06$ddlMappedCol']");

	private By Vat_10Elem = By.xpath("//SELECT[@name='ctl00$cPH$gvCSVColumn$ctl07$ddlMappedCol']");

	private By Vat_Rate_Type_11Elem = By.xpath("//SELECT[@name='ctl00$cPH$gvCSVColumn$ctl08$ddlMappedCol']");

	private By Frequency_12Elem = By.xpath("//SELECT[@name='ctl00$cPH$gvCSVColumn$ctl09$ddlMappedCol']");

	private By Total_Occurence_13Elem = By.xpath("//SELECT[@name='ctl00$cPH$gvCSVColumn$ctl10$ddlMappedCol']");

	private By Submit_14Elem = By.xpath("//A[@id='ctl00_cPH_btnUpload']");

	private By Import_19Elem = By.xpath("//A[@id='ctl00_cPH_btnImport']");

	private By Select_Customer_15Elem = By.xpath("//SELECT[@name='ctl00$cPH$rptrDisplayRecords$ctl00$ddlCustomer']");

	private By Select_Income_Type_16Elem = By.xpath("//SELECT[@name='ctl00$cPH$rptrDisplayRecords$ctl00$ddProduct']");

	private By Select_Customer_17Elem = By.xpath("//SELECT[@name='ctl00$cPH$rptrDisplayRecords$ctl01$ddlCustomer']");

	private By Select_Income_Type_18Elem = By.xpath("//SELECT[@name='ctl00$cPH$rptrDisplayRecords$ctl01$ddProduct']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AccountUI/RepeatingInvoiceBatchUpload.aspx?FYCode=117652&CompanyCode=17315&menuid=0");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/RepeatingInvoiceBatchUpload.aspx?FYCode=117652&CompanyCode=17315&menuid=0");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/RepeatingInvoiceBatchUpload.aspx?FYCode=117652&CompanyCode=17315&menuid=0");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/AccountUI/RepeatingInvoiceBatchUpload.aspx?FYCode=117652&CompanyCode=17315&menuid=0";

        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/AccountUI/RepeatingInvoiceBatchUpload.aspx?FYCode=117652&CompanyCode=17315&menuid=0")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click UploadBtn 1
     * @name Click UploadBtn 1
     */
	public void Click_UploadBtn_1()
	{
        
		WebElement elem = getWebElement(UploadBtn_1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_UploadBtn_1", "Click_UploadBtn_1 failed. Unable to locate object: " + UploadBtn_1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_UploadBtn_1", "Click_UploadBtn_1 failed. Unable to locate object: " + UploadBtn_1Elem.toString());

			Assert.fail("Unable to locate object: " + UploadBtn_1Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_UploadBtn_1");

		TestModellerLogger.PassStep(m_Driver, "Click_UploadBtn_1");
	}

     
	/**
 	 * Click CSV Sample  2
     * @name Click CSV Sample  2
     */
	public void Click_CSV_Sample_2()
	{
        
		WebElement elem = getWebElement(CSV_Sample_2Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_CSV_Sample_2", "Click_CSV_Sample_2 failed. Unable to locate object: " + CSV_Sample_2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_CSV_Sample_2", "Click_CSV_Sample_2 failed. Unable to locate object: " + CSV_Sample_2Elem.toString());

			Assert.fail("Unable to locate object: " + CSV_Sample_2Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_CSV_Sample_2");

		TestModellerLogger.PassStep(m_Driver, "Click_CSV_Sample_2");
	}

      
	/**
 	 * Enter EnterFileUpload 3
     * @name Enter EnterFileUpload 3
     */
 	public void Enter_EnterFileUpload_3(String EnterFileUpload_3)
 	{
 	    
 		WebElement elem = getWebElement(EnterFileUpload_3Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_EnterFileUpload_3", "Enter_EnterFileUpload_3 failed. Unable to locate object: " + EnterFileUpload_3Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_EnterFileUpload_3", "Enter_EnterFileUpload_3 failed. Unable to locate object: " + EnterFileUpload_3Elem.toString());

 			Assert.fail("Unable to locate object: " + EnterFileUpload_3Elem.toString());
         }

 		elem.sendKeys(EnterFileUpload_3);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_EnterFileUpload_3 " + EnterFileUpload_3);

  		TestModellerLogger.PassStep(m_Driver, "Enter_EnterFileUpload_3 " + EnterFileUpload_3);
 	}

     
	/**
 	 * Click UploadBtn 4
     * @name Click UploadBtn 4
     */
	public void Click_UploadBtn_4()
	{
        
		WebElement elem = getWebElement(UploadBtn_4Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_UploadBtn_4", "Click_UploadBtn_4 failed. Unable to locate object: " + UploadBtn_4Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_UploadBtn_4", "Click_UploadBtn_4 failed. Unable to locate object: " + UploadBtn_4Elem.toString());

			Assert.fail("Unable to locate object: " + UploadBtn_4Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_UploadBtn_4");

		TestModellerLogger.PassStep(m_Driver, "Click_UploadBtn_4");
	}

    
	/**
 	 * Select StartDate 5
     * @name Select StartDate 5
     */
    public void Select_StartDate_5(String StartDate_5)
 	{
 	    
 		WebElement elem = getWebElement(StartDate_5Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_StartDate_5", "Select_StartDate_5 failed. Unable to locate object: " + StartDate_5Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_StartDate_5", "Select_StartDate_5 failed. Unable to locate object: " + StartDate_5Elem.toString());

 			Assert.fail("Unable to locate object: " + StartDate_5Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(StartDate_5);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_StartDate_5 " + StartDate_5);

 		TestModellerLogger.PassStep(m_Driver, "Select_StartDate_5 " + StartDate_5);
 	}

    
	/**
 	 * Select Customer 6
     * @name Select Customer 6
     */
    public void Select_Customer_6(String Customer_6)
 	{
 	    
 		WebElement elem = getWebElement(Customer_6Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Customer_6", "Select_Customer_6 failed. Unable to locate object: " + Customer_6Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Customer_6", "Select_Customer_6 failed. Unable to locate object: " + Customer_6Elem.toString());

 			Assert.fail("Unable to locate object: " + Customer_6Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Customer_6);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Customer_6 " + Customer_6);

 		TestModellerLogger.PassStep(m_Driver, "Select_Customer_6 " + Customer_6);
 	}

    
	/**
 	 * Select Income Type 7
     * @name Select Income Type 7
     */
    public void Select_Income_Type_7(String Income_Type_7)
 	{
 	    
 		WebElement elem = getWebElement(Income_Type_7Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Income_Type_7", "Select_Income_Type_7 failed. Unable to locate object: " + Income_Type_7Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Income_Type_7", "Select_Income_Type_7 failed. Unable to locate object: " + Income_Type_7Elem.toString());

 			Assert.fail("Unable to locate object: " + Income_Type_7Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Income_Type_7);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Income_Type_7 " + Income_Type_7);

 		TestModellerLogger.PassStep(m_Driver, "Select_Income_Type_7 " + Income_Type_7);
 	}

    
	/**
 	 * Select Dis 8
     * @name Select Dis 8
     */
    public void Select_Dis_8(String Dis_8)
 	{
 	    
 		WebElement elem = getWebElement(Dis_8Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Dis_8", "Select_Dis_8 failed. Unable to locate object: " + Dis_8Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Dis_8", "Select_Dis_8 failed. Unable to locate object: " + Dis_8Elem.toString());

 			Assert.fail("Unable to locate object: " + Dis_8Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Dis_8);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Dis_8 " + Dis_8);

 		TestModellerLogger.PassStep(m_Driver, "Select_Dis_8 " + Dis_8);
 	}

    
	/**
 	 * Select Amount 9
     * @name Select Amount 9
     */
    public void Select_Amount_9(String Amount_9)
 	{
 	    
 		WebElement elem = getWebElement(Amount_9Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Amount_9", "Select_Amount_9 failed. Unable to locate object: " + Amount_9Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Amount_9", "Select_Amount_9 failed. Unable to locate object: " + Amount_9Elem.toString());

 			Assert.fail("Unable to locate object: " + Amount_9Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Amount_9);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Amount_9 " + Amount_9);

 		TestModellerLogger.PassStep(m_Driver, "Select_Amount_9 " + Amount_9);
 	}

    
	/**
 	 * Select Vat 10
     * @name Select Vat 10
     */
    public void Select_Vat_10(String Vat_10)
 	{
 	    
 		WebElement elem = getWebElement(Vat_10Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Vat_10", "Select_Vat_10 failed. Unable to locate object: " + Vat_10Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Vat_10", "Select_Vat_10 failed. Unable to locate object: " + Vat_10Elem.toString());

 			Assert.fail("Unable to locate object: " + Vat_10Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Vat_10);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Vat_10 " + Vat_10);

 		TestModellerLogger.PassStep(m_Driver, "Select_Vat_10 " + Vat_10);
 	}

    
	/**
 	 * Select Vat Rate Type 11
     * @name Select Vat Rate Type 11
     */
    public void Select_Vat_Rate_Type_11(String Vat_Rate_Type_11)
 	{
 	    
 		WebElement elem = getWebElement(Vat_Rate_Type_11Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Vat_Rate_Type_11", "Select_Vat_Rate_Type_11 failed. Unable to locate object: " + Vat_Rate_Type_11Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Vat_Rate_Type_11", "Select_Vat_Rate_Type_11 failed. Unable to locate object: " + Vat_Rate_Type_11Elem.toString());

 			Assert.fail("Unable to locate object: " + Vat_Rate_Type_11Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Vat_Rate_Type_11);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Vat_Rate_Type_11 " + Vat_Rate_Type_11);

 		TestModellerLogger.PassStep(m_Driver, "Select_Vat_Rate_Type_11 " + Vat_Rate_Type_11);
 	}

    
	/**
 	 * Select Frequency 12
     * @name Select Frequency 12
     */
    public void Select_Frequency_12(String Frequency_12)
 	{
 	    
 		WebElement elem = getWebElement(Frequency_12Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Frequency_12", "Select_Frequency_12 failed. Unable to locate object: " + Frequency_12Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Frequency_12", "Select_Frequency_12 failed. Unable to locate object: " + Frequency_12Elem.toString());

 			Assert.fail("Unable to locate object: " + Frequency_12Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Frequency_12);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Frequency_12 " + Frequency_12);

 		TestModellerLogger.PassStep(m_Driver, "Select_Frequency_12 " + Frequency_12);
 	}

    
	/**
 	 * Select Total Occurence 13
     * @name Select Total Occurence 13
     */
    public void Select_Total_Occurence_13(String Total_Occurence_13)
 	{
 	    
 		WebElement elem = getWebElement(Total_Occurence_13Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Total_Occurence_13", "Select_Total_Occurence_13 failed. Unable to locate object: " + Total_Occurence_13Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Total_Occurence_13", "Select_Total_Occurence_13 failed. Unable to locate object: " + Total_Occurence_13Elem.toString());

 			Assert.fail("Unable to locate object: " + Total_Occurence_13Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Total_Occurence_13);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Total_Occurence_13 " + Total_Occurence_13);

 		TestModellerLogger.PassStep(m_Driver, "Select_Total_Occurence_13 " + Total_Occurence_13);
 	}

     
	/**
 	 * Click Submit 14
	 * @throws InterruptedException 
     * @name Click Submit 14
     */
	public void Click_Submit_14() throws InterruptedException
	{
        
		WebElement elem = getWebElement(Submit_14Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Submit_14", "Click_Submit_14 failed. Unable to locate object: " + Submit_14Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Submit_14", "Click_Submit_14 failed. Unable to locate object: " + Submit_14Elem.toString());

			Assert.fail("Unable to locate object: " + Submit_14Elem.toString());
        }
        Thread.sleep(2000);
		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Submit_14");

		TestModellerLogger.PassStep(m_Driver, "Click_Submit_14");
	}

     
	/**
 	 * Click Import 19
     * @name Click Import 19
     */
	public void Click_Import_19()
	{
        
		WebElement elem = getWebElement(Import_19Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Import_19", "Click_Import_19 failed. Unable to locate object: " + Import_19Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Import_19", "Click_Import_19 failed. Unable to locate object: " + Import_19Elem.toString());

			Assert.fail("Unable to locate object: " + Import_19Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Import_19");

		TestModellerLogger.PassStep(m_Driver, "Click_Import_19");
	}

    
	/**
 	 * Select Select Customer 15
     * @name Select Select Customer 15
     */
    public void Select_Select_Customer_15(String Select_Customer_15)
 	{
 	    
 		WebElement elem = getWebElement(Select_Customer_15Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Select_Customer_15", "Select_Select_Customer_15 failed. Unable to locate object: " + Select_Customer_15Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Select_Customer_15", "Select_Select_Customer_15 failed. Unable to locate object: " + Select_Customer_15Elem.toString());

 			Assert.fail("Unable to locate object: " + Select_Customer_15Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Select_Customer_15);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Select_Customer_15 " + Select_Customer_15);

 		TestModellerLogger.PassStep(m_Driver, "Select_Select_Customer_15 " + Select_Customer_15);
 	}

    
	/**
 	 * Select Select Income Type 16
     * @name Select Select Income Type 16
     */
    public void Select_Select_Income_Type_16(String Select_Income_Type_16)
 	{
 	    
 		WebElement elem = getWebElement(Select_Income_Type_16Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Select_Income_Type_16", "Select_Select_Income_Type_16 failed. Unable to locate object: " + Select_Income_Type_16Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Select_Income_Type_16", "Select_Select_Income_Type_16 failed. Unable to locate object: " + Select_Income_Type_16Elem.toString());

 			Assert.fail("Unable to locate object: " + Select_Income_Type_16Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Select_Income_Type_16);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Select_Income_Type_16 " + Select_Income_Type_16);

 		TestModellerLogger.PassStep(m_Driver, "Select_Select_Income_Type_16 " + Select_Income_Type_16);
 	}

    
	/**
 	 * Select Select Customer 17
     * @name Select Select Customer 17
     */
    public void Select_Select_Customer_17(String Select_Customer_17)
 	{
 	    
 		WebElement elem = getWebElement(Select_Customer_17Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Select_Customer_17", "Select_Select_Customer_17 failed. Unable to locate object: " + Select_Customer_17Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Select_Customer_17", "Select_Select_Customer_17 failed. Unable to locate object: " + Select_Customer_17Elem.toString());

 			Assert.fail("Unable to locate object: " + Select_Customer_17Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Select_Customer_17);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Select_Customer_17 " + Select_Customer_17);

 		TestModellerLogger.PassStep(m_Driver, "Select_Select_Customer_17 " + Select_Customer_17);
 	}

    
	/**
 	 * Select Select Income Type 18
     * @name Select Select Income Type 18
     */
    public void Select_Select_Income_Type_18(String Select_Income_Type_18)
 	{
 	    
 		WebElement elem = getWebElement(Select_Income_Type_18Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Select_Income_Type_18", "Select_Select_Income_Type_18 failed. Unable to locate object: " + Select_Income_Type_18Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Select_Income_Type_18", "Select_Select_Income_Type_18 failed. Unable to locate object: " + Select_Income_Type_18Elem.toString());

 			Assert.fail("Unable to locate object: " + Select_Income_Type_18Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Select_Income_Type_18);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Select_Income_Type_18 " + Select_Income_Type_18);

 		TestModellerLogger.PassStep(m_Driver, "Select_Select_Income_Type_18 " + Select_Income_Type_18);
 	}
    
    public void screenshotupload()
    {
    	utilities.Screenshotcapture.Getscreenshot("Choose File ", "Repeat Invoice");
    	
    }
    
    public void screenshotMapping()
    {
    	utilities.Screenshotcapture.Getscreenshot("Upload File Mapping ", "Repeat Invoice");
    	
    }
    
    public void screenshotsucc()
    {
    	utilities.Screenshotcapture.Getscreenshot("Uploaded Successfully. ", "Repeat Invoice");
    	
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}