package Pages_Income;

import pages.BasePage;

import java.awt.Dimension;

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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/c784f12f-111a-4e89-a4df-ea5f7296a316
@TestModellerModule(guid = "c784f12f-111a-4e89-a4df-ea5f7296a316")
public class New_Batch_entry extends BasePage
{
	public New_Batch_entry (WebDriver driver)
	{
		super(driver);
	}


	
	private By New_1Elem = By.xpath("//*[@id='ctl00_divMainContent']/header/div/div[4]/a");

	private By New_Batch_Entry_2Elem = By.xpath("//A[@id='ctl00_cpHeaderRight_btnAddBatch']");

	private By InvoiceDate_3Elem = By.xpath("//INPUT[@name='ctl00$cPH$rptrProduct$ctl00$txtInvoiceDate']");

	private By Select_Customer_4Elem = By.xpath("//SELECT[@name='ctl00$cPH$rptrProduct$ctl00$ddlCustomer']");

	private By Select_InvoiceType_5Elem = By.xpath("//SELECT[@name='ctl00$cPH$rptrProduct$ctl00$ddInvoiceType']");

	private By EnterInvoiceNo_6Elem = By.xpath("//INPUT[@name='ctl00$cPH$rptrProduct$ctl00$txtInvoiceNo']");

	private By Seletc_Income_Type7Elem = By.xpath("//SELECT[@name='ctl00$cPH$rptrProduct$ctl00$ddProduct']");

	private By Enter_Description_8Elem = By.xpath("//TEXTAREA[@name='ctl00$cPH$rptrProduct$ctl00$txtDescription']");

	private By Enter_Amount_9Elem = By.xpath("//INPUT[@name='ctl00$cPH$rptrProduct$ctl00$txtAmount']");

	private By Select_VATRate_10Elem = By.xpath("//SELECT[@name='ctl00$cPH$rptrProduct$ctl00$ddVATRate']");

	private By Save_Add_More_11Elem = By.xpath("//*[@id='ctl00_cpHFooter_btnSaveAdd']");

	private By Save_12Elem = By.xpath("//A[@id='ctl00_cpHFooter_btnSave']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AccountUI/InvoiceEditorBatch.aspx?FYCode=117652&CompanyCode=17315");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/InvoiceEditorBatch.aspx?FYCode=117652&CompanyCode=17315");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/InvoiceEditorBatch.aspx?FYCode=117652&CompanyCode=17315");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/AccountUI/InvoiceEditorBatch.aspx?FYCode=117652&CompanyCode=17315";

        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/AccountUI/InvoiceEditorBatch.aspx?FYCode=117652&CompanyCode=17315")) {
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
 	 * Click New Batch Entry 2
     * @name Click New Batch Entry 2
     */
	public void Click_New_Batch_Entry_2()
	{
        
		WebElement elem = getWebElement(New_Batch_Entry_2Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_New_Batch_Entry_2", "Click_New_Batch_Entry_2 failed. Unable to locate object: " + New_Batch_Entry_2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_New_Batch_Entry_2", "Click_New_Batch_Entry_2 failed. Unable to locate object: " + New_Batch_Entry_2Elem.toString());

			Assert.fail("Unable to locate object: " + New_Batch_Entry_2Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_New_Batch_Entry_2");

		TestModellerLogger.PassStep(m_Driver, "Click_New_Batch_Entry_2");
	}

      
	/**
 	 * Enter InvoiceDate 3
     * @name Enter InvoiceDate 3
     */
 	public void Enter_InvoiceDate_3(String InvoiceDate_3)
 	{
 	    
 		WebElement elem = getWebElement(InvoiceDate_3Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_InvoiceDate_3", "Enter_InvoiceDate_3 failed. Unable to locate object: " + InvoiceDate_3Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_InvoiceDate_3", "Enter_InvoiceDate_3 failed. Unable to locate object: " + InvoiceDate_3Elem.toString());

 			Assert.fail("Unable to locate object: " + InvoiceDate_3Elem.toString());
         }

 		elem.sendKeys(InvoiceDate_3);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_InvoiceDate_3 " + InvoiceDate_3);

  		TestModellerLogger.PassStep(m_Driver, "Enter_InvoiceDate_3 " + InvoiceDate_3);
 	}

    
	/**
 	 * Select Select Customer 4
     * @name Select Select Customer 4
     */
    public void Select_Select_Customer_4(String Select_Customer_4)
 	{
 	    
 		WebElement elem = getWebElement(Select_Customer_4Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Select_Customer_4", "Select_Select_Customer_4 failed. Unable to locate object: " + Select_Customer_4Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Select_Customer_4", "Select_Select_Customer_4 failed. Unable to locate object: " + Select_Customer_4Elem.toString());

 			Assert.fail("Unable to locate object: " + Select_Customer_4Elem.toString());
         }

 		
 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Select_Customer_4);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Select_Customer_4 " + Select_Customer_4);

 		TestModellerLogger.PassStep(m_Driver, "Select_Select_Customer_4 " + Select_Customer_4);
 	}

    
	/**
 	 * Select Select InvoiceType 5
     * @name Select Select InvoiceType 5
     */
    public void Select_Select_InvoiceType_5(String Select_InvoiceType_5)
 	{
 	    
 		WebElement elem = getWebElement(Select_InvoiceType_5Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Select_InvoiceType_5", "Select_Select_InvoiceType_5 failed. Unable to locate object: " + Select_InvoiceType_5Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Select_InvoiceType_5", "Select_Select_InvoiceType_5 failed. Unable to locate object: " + Select_InvoiceType_5Elem.toString());

 			Assert.fail("Unable to locate object: " + Select_InvoiceType_5Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Select_InvoiceType_5);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Select_InvoiceType_5 " + Select_InvoiceType_5);

 		TestModellerLogger.PassStep(m_Driver, "Select_Select_InvoiceType_5 " + Select_InvoiceType_5);
 	}

      
	/**
 	 * Enter EnterInvoiceNo 6
     * @name Enter EnterInvoiceNo 6
     */
 	public void Enter_EnterInvoiceNo_6(String EnterInvoiceNo_6)
 	{
 	    
 		WebElement elem = getWebElement(EnterInvoiceNo_6Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_EnterInvoiceNo_6", "Enter_EnterInvoiceNo_6 failed. Unable to locate object: " + EnterInvoiceNo_6Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_EnterInvoiceNo_6", "Enter_EnterInvoiceNo_6 failed. Unable to locate object: " + EnterInvoiceNo_6Elem.toString());

 			Assert.fail("Unable to locate object: " + EnterInvoiceNo_6Elem.toString());
         }

 		elem.sendKeys(EnterInvoiceNo_6);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_EnterInvoiceNo_6 " + EnterInvoiceNo_6);

  		TestModellerLogger.PassStep(m_Driver, "Enter_EnterInvoiceNo_6 " + EnterInvoiceNo_6);
 	}

    
	/**
 	 * Select Seletc Income Type7
     * @name Select Seletc Income Type7
     */
    public void Select_Seletc_Income_Type7(String Seletc_Income_Type7)
 	{
 	    
 		WebElement elem = getWebElement(Seletc_Income_Type7Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Seletc_Income_Type7", "Select_Seletc_Income_Type7 failed. Unable to locate object: " + Seletc_Income_Type7Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Seletc_Income_Type7", "Select_Seletc_Income_Type7 failed. Unable to locate object: " + Seletc_Income_Type7Elem.toString());

 			Assert.fail("Unable to locate object: " + Seletc_Income_Type7Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Seletc_Income_Type7);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Seletc_Income_Type7 " + Seletc_Income_Type7);

 		TestModellerLogger.PassStep(m_Driver, "Select_Seletc_Income_Type7 " + Seletc_Income_Type7);
 	}

      
	/**
 	 * Enter Enter Description 8
     * @name Enter Enter Description 8
     */
 	public void Enter_Enter_Description_8(String Enter_Description_8)
 	{
 	    
 		WebElement elem = getWebElement(Enter_Description_8Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_Description_8", "Enter_Enter_Description_8 failed. Unable to locate object: " + Enter_Description_8Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_Description_8", "Enter_Enter_Description_8 failed. Unable to locate object: " + Enter_Description_8Elem.toString());

 			Assert.fail("Unable to locate object: " + Enter_Description_8Elem.toString());
         }

 		elem.sendKeys(Enter_Description_8);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_Description_8 " + Enter_Description_8);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_Description_8 " + Enter_Description_8);
 	}

      
	/**
 	 * Enter Enter Amount 9
     * @name Enter Enter Amount 9
     */
 	public void Enter_Enter_Amount_9(String Enter_Amount_9)
 	{
 	    
 		WebElement elem = getWebElement(Enter_Amount_9Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_Amount_9", "Enter_Enter_Amount_9 failed. Unable to locate object: " + Enter_Amount_9Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_Amount_9", "Enter_Enter_Amount_9 failed. Unable to locate object: " + Enter_Amount_9Elem.toString());

 			Assert.fail("Unable to locate object: " + Enter_Amount_9Elem.toString());
         }

 		elem.sendKeys(Enter_Amount_9);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_Amount_9 " + Enter_Amount_9);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_Amount_9 " + Enter_Amount_9);
 	}

    
	/**
 	 * Select Select VATRate 10
	 * @throws InterruptedException 
     * @name Select Select VATRate 10
     */
    public void Select_Select_VATRate_10(String Select_VATRate_10) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(Select_VATRate_10Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Select_VATRate_10", "Select_Select_VATRate_10 failed. Unable to locate object: " + Select_VATRate_10Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Select_VATRate_10", "Select_Select_VATRate_10 failed. Unable to locate object: " + Select_VATRate_10Elem.toString());

 			Assert.fail("Unable to locate object: " + Select_VATRate_10Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Select_VATRate_10);
 		Thread.sleep(2000);
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Select_VATRate_10 " + Select_VATRate_10);

 		TestModellerLogger.PassStep(m_Driver, "Select_Select_VATRate_10 " + Select_VATRate_10);
 	}

     
	/**
 	 * Click Save & Add More  11
	 * @throws InterruptedException 
     * @name Click Save & Add More  11
     */
	public void Click_Save_Add_More_11() throws InterruptedException
	{
        
		WebElement elem = getWebElement(Save_Add_More_11Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Save_Add_More_11", "Click_Save_Add_More_11 failed. Unable to locate object: " + Save_Add_More_11Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Save_Add_More_11", "Click_Save_Add_More_11 failed. Unable to locate object: " + Save_Add_More_11Elem.toString());

			Assert.fail("Unable to locate object: " + Save_Add_More_11Elem.toString());
        }
          
		jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//*[@id='ctl00_cpHFooter_btnSaveAdd']")));
	     	//elem.click();
	     	Thread.sleep(5000);

		ExtentReportManager.passStep(m_Driver, "Click_Save_Add_More_11");

		TestModellerLogger.PassStep(m_Driver, "Click_Save_Add_More_11");
	}

     
	/**
 	 * Click Save 12
     * @name Click Save 12
     */
	public void Click_Save_12()
	{
        
		WebElement elem = getWebElement(Save_12Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Save_12", "Click_Save_12 failed. Unable to locate object: " + Save_12Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Save_12", "Click_Save_12 failed. Unable to locate object: " + Save_12Elem.toString());

			Assert.fail("Unable to locate object: " + Save_12Elem.toString());
        }
		jsExec.executeScript("arguments[0].click();", elem);
		
          	

		ExtentReportManager.passStep(m_Driver, "Click_Save_12");

		TestModellerLogger.PassStep(m_Driver, "Click_Save_12");
	}
	
	
	public void CustomerList() throws InterruptedException
	{
		WebElement elem = getWebElement(Select_Customer_4Elem);
		
		elem.click();
		Thread.sleep(1000);
//		Dimension d = new Dimension(300,1080);
//		m_Driver.manage().window().setSize(d);
        utilities.Screenshotcapture.Getscreenshot("Customer List", "New Batch Entry");
		String CusLst=elem.getText();
		System.out.println("Customer List = "+CusLst);
	}
	
	
	public void DefaultDate() throws InterruptedException
	{
		
		utilities.Screenshotcapture.Getscreenshot("Default Date", "New Batch Entry");
	
	}
	
	public void Sussmsg() throws InterruptedException
	{
		String Sussmsg=m_Driver.findElement(By.xpath("//*[@id='ctl00_divSubContent']/div[1]/div")).getText();
		
		
		boolean b=Sussmsg.contains("Success! Batch Invoice/Credit Notes added successfully");
		Assert.assertTrue(b);

		utilities.Screenshotcapture.Getscreenshot("success message on top of the screen", "New Batch Entry");
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}