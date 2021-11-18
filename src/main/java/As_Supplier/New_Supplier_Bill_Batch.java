package As_Supplier;

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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/5914549a-f67f-4fb6-8807-c68be7fec2fe
@TestModellerModule(guid = "5914549a-f67f-4fb6-8807-c68be7fec2fe")
public class New_Supplier_Bill_Batch extends BasePage
{
	public New_Supplier_Bill_Batch (WebDriver driver)
	{
		super(driver);
	}


	
	private By Expenditure1Elem = By.xpath("//*[@id='ctl00_SideMenu1_ExpensesMenu']/a/span");

	private By View_New_2Elem = By.xpath("//*[@id='ctl00_divMainContent']/header/div/div[4]/a");

	private By New_Supplier_Bill_Batch_3Elem = By.xpath("//A[@id='ctl00_cpHeaderRight_btnAddBatch']");

	private By Save_4Elem = By.xpath("//A[@id='ctl00_cpHFooter_btnSave']");

	private By Select_Supplier_5Elem = By.xpath("//SELECT[@name='ctl00$cPH$rptrProduct$ctl00$ddlSupplier']");

	private By Select_Supplier_Bill_Type_6Elem = By.xpath("//SELECT[@name='ctl00$cPH$rptrProduct$ctl00$ddSupplierBillType']");

	private By Enter_Bill_No_7Elem = By.xpath("//INPUT[@name='ctl00$cPH$rptrProduct$ctl00$txtBillNo']");

	private By Description_8Elem = By.xpath("//INPUT[@name='ctl00$cPH$rptrProduct$ctl00$txtDescription']");

	private By Enter_NetTotal_9Elem = By.xpath("//INPUT[@name='ctl00$cPH$rptrProduct$ctl00$txtNetTotal']");

	private By Select_VATRate_10Elem = By.xpath("//SELECT[@name='ctl00$cPH$rptrProduct$ctl00$ddVATRate']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AccountUI/SupplierBillEditorBatch.aspx?FYCode=117425&CompanyCode=17088");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/SupplierBillEditorBatch.aspx?FYCode=117425&CompanyCode=17088");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/SupplierBillEditorBatch.aspx?FYCode=117425&CompanyCode=17088");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/AccountUI/SupplierBillEditorBatch.aspx?FYCode=117425&CompanyCode=17088";

        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/AccountUI/SupplierBillEditorBatch.aspx?FYCode=117425&CompanyCode=17088")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click Expenditure1
     * @name Click Expenditure1
     */
	public void Click_Expenditure1()
	{
        
		WebElement elem = getWebElement(Expenditure1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Expenditure1", "Click_Expenditure1 failed. Unable to locate object: " + Expenditure1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Expenditure1", "Click_Expenditure1 failed. Unable to locate object: " + Expenditure1Elem.toString());

			Assert.fail("Unable to locate object: " + Expenditure1Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Expenditure1");

		TestModellerLogger.PassStep(m_Driver, "Click_Expenditure1");
	}

     
	/**
 	 * Click View New 2
     * @name Click View New 2
     */
	public void Click_View_New_2()
	{
        
		WebElement elem = getWebElement(View_New_2Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_View_New_2", "Click_View_New_2 failed. Unable to locate object: " + View_New_2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_View_New_2", "Click_View_New_2 failed. Unable to locate object: " + View_New_2Elem.toString());

			Assert.fail("Unable to locate object: " + View_New_2Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_View_New_2");

		TestModellerLogger.PassStep(m_Driver, "Click_View_New_2");
	}

     
	/**
 	 * Click New Supplier Bill Batch 3
     * @name Click New Supplier Bill Batch 3
     */
	public void Click_New_Supplier_Bill_Batch_3()
	{
        
		WebElement elem = getWebElement(New_Supplier_Bill_Batch_3Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_New_Supplier_Bill_Batch_3", "Click_New_Supplier_Bill_Batch_3 failed. Unable to locate object: " + New_Supplier_Bill_Batch_3Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_New_Supplier_Bill_Batch_3", "Click_New_Supplier_Bill_Batch_3 failed. Unable to locate object: " + New_Supplier_Bill_Batch_3Elem.toString());

			Assert.fail("Unable to locate object: " + New_Supplier_Bill_Batch_3Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_New_Supplier_Bill_Batch_3");

		TestModellerLogger.PassStep(m_Driver, "Click_New_Supplier_Bill_Batch_3");
	}

     
	/**
 	 * Click Save 4
	 * @throws InterruptedException 
     * @name Click Save 4
     */
	public void Click_Save_4() throws InterruptedException
	{
        
		WebElement elem = getWebElement(Save_4Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Save_4", "Click_Save_4 failed. Unable to locate object: " + Save_4Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Save_4", "Click_Save_4 failed. Unable to locate object: " + Save_4Elem.toString());

			Assert.fail("Unable to locate object: " + Save_4Elem.toString());
        }
			utilities.Screenshotcapture.Getscreenshot("Current day date should be set as default ", "New Supplier Bill Batch");
			Thread.sleep(1000);
		    elem.click();
          	utilities.Screenshotcapture.Getscreenshot("Information! Please add atleast one record", "New Supplier Bill Batch");

		ExtentReportManager.passStep(m_Driver, "Click_Save_4");

		TestModellerLogger.PassStep(m_Driver, "Click_Save_4");
	}

    
	/**
 	 * Select Select Supplier 5
     * @name Select Select Supplier 5
     */
    public void Select_Select_Supplier_5(String Select_Supplier_5)
 	{
 	    
 		WebElement elem = getWebElement(Select_Supplier_5Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Select_Supplier_5", "Select_Select_Supplier_5 failed. Unable to locate object: " + Select_Supplier_5Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Select_Supplier_5", "Select_Select_Supplier_5 failed. Unable to locate object: " + Select_Supplier_5Elem.toString());

 			Assert.fail("Unable to locate object: " + Select_Supplier_5Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Select_Supplier_5);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Select_Supplier_5 " + Select_Supplier_5);

 		TestModellerLogger.PassStep(m_Driver, "Select_Select_Supplier_5 " + Select_Supplier_5);
 	}

    
	/**
 	 * Select Select Supplier Bill Type 6
     * @name Select Select Supplier Bill Type 6
     */
    public void Select_Select_Supplier_Bill_Type_6(String Select_Supplier_Bill_Type_6)
 	{
 	    
 		WebElement elem = getWebElement(Select_Supplier_Bill_Type_6Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Select_Supplier_Bill_Type_6", "Select_Select_Supplier_Bill_Type_6 failed. Unable to locate object: " + Select_Supplier_Bill_Type_6Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Select_Supplier_Bill_Type_6", "Select_Select_Supplier_Bill_Type_6 failed. Unable to locate object: " + Select_Supplier_Bill_Type_6Elem.toString());

 			Assert.fail("Unable to locate object: " + Select_Supplier_Bill_Type_6Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Select_Supplier_Bill_Type_6);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Select_Supplier_Bill_Type_6 " + Select_Supplier_Bill_Type_6);

 		TestModellerLogger.PassStep(m_Driver, "Select_Select_Supplier_Bill_Type_6 " + Select_Supplier_Bill_Type_6);
 	}

      
	/**
 	 * Enter Enter Bill No 7
     * @name Enter Enter Bill No 7
     */
 	public void Enter_Enter_Bill_No_7(String Enter_Bill_No_7)
 	{
 	    
 		WebElement elem = getWebElement(Enter_Bill_No_7Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_Bill_No_7", "Enter_Enter_Bill_No_7 failed. Unable to locate object: " + Enter_Bill_No_7Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_Bill_No_7", "Enter_Enter_Bill_No_7 failed. Unable to locate object: " + Enter_Bill_No_7Elem.toString());

 			Assert.fail("Unable to locate object: " + Enter_Bill_No_7Elem.toString());
         }

 		elem.sendKeys(Enter_Bill_No_7);
 		elem.sendKeys(Keys.TAB);
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_Bill_No_7 " + Enter_Bill_No_7);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_Bill_No_7 " + Enter_Bill_No_7);
 	}

      
	/**
 	 * Enter Description 8
     * @name Enter Description 8
     */
 	public void Enter_Description_8(String Description_8)
 	{
 	    
 		WebElement elem = getWebElement(Description_8Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Description_8", "Enter_Description_8 failed. Unable to locate object: " + Description_8Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Description_8", "Enter_Description_8 failed. Unable to locate object: " + Description_8Elem.toString());

 			Assert.fail("Unable to locate object: " + Description_8Elem.toString());
         }

 		elem.sendKeys(Description_8);
 		elem.sendKeys(Keys.TAB);
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Description_8 " + Description_8);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Description_8 " + Description_8);
 	}

      
	/**
 	 * Enter Enter NetTotal 9
     * @name Enter Enter NetTotal 9
     */
 	public void Enter_Enter_NetTotal_9(String Enter_NetTotal_9)
 	{
 	    
 		WebElement elem = getWebElement(Enter_NetTotal_9Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_NetTotal_9", "Enter_Enter_NetTotal_9 failed. Unable to locate object: " + Enter_NetTotal_9Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_NetTotal_9", "Enter_Enter_NetTotal_9 failed. Unable to locate object: " + Enter_NetTotal_9Elem.toString());

 			Assert.fail("Unable to locate object: " + Enter_NetTotal_9Elem.toString());
         }

 		elem.sendKeys(Enter_NetTotal_9);
 		elem.sendKeys(Keys.TAB);
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_NetTotal_9 " + Enter_NetTotal_9);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_NetTotal_9 " + Enter_NetTotal_9);
 	}

    
	/**
 	 * Select Select VATRate 10
     * @name Select Select VATRate 10
     */
    public void Select_Select_VATRate_10(String Select_VATRate_10)
 	{
 	    
 		WebElement elem = getWebElement(Select_VATRate_10Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Select_VATRate_10", "Select_Select_VATRate_10 failed. Unable to locate object: " + Select_VATRate_10Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Select_VATRate_10", "Select_Select_VATRate_10 failed. Unable to locate object: " + Select_VATRate_10Elem.toString());

 			Assert.fail("Unable to locate object: " + Select_VATRate_10Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Select_VATRate_10);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Select_VATRate_10 " + Select_VATRate_10);

 		TestModellerLogger.PassStep(m_Driver, "Select_Select_VATRate_10 " + Select_VATRate_10);
 	}
    
    public void ExpenceType(String ExpenceType) throws InterruptedException
    {
    	Thread.sleep(3000);
    	m_Driver.findElement(By.xpath("//*[@id='select2-ctl00_cPH_rptrProduct_ctl00_ltAccount-container']/span")).click();
    	m_Driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(ExpenceType);
    	m_Driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
    	
    	Thread.sleep(2000);
    }
    
    
    
    
    
    
    public void Click_Save()
	{
        
		WebElement elem = getWebElement(Save_4Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Save_4", "Click_Save_4 failed. Unable to locate object: " + Save_4Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Save_4", "Click_Save_4 failed. Unable to locate object: " + Save_4Elem.toString());

			Assert.fail("Unable to locate object: " + Save_4Elem.toString());
        }

		elem.click();
          utilities.Screenshotcapture.Getscreenshot("success message on top of the screen.", "New Supplier Bill Batch");

		ExtentReportManager.passStep(m_Driver, "Click_Save_4");

		TestModellerLogger.PassStep(m_Driver, "Click_Save_4");
	}
    
    public void CancelBtn() throws InterruptedException
    {
    	Thread.sleep(2000);
    	m_Driver.findElement(By.xpath("//*[@id='ctl00_cpHFooter_btnCancel']")).click();
    	Thread.sleep(2000);
    	 utilities.Screenshotcapture.Getscreenshot("Click Cancel Btn Retrieve The Previous Page", "New Supplier Bill Batch");
    }
    
    
    
    
    
}