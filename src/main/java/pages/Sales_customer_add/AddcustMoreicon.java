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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/3d6a7e97-9eb7-4ddd-827d-499769fa4362
@TestModellerModule(guid = "3d6a7e97-9eb7-4ddd-827d-499769fa4362")
public class AddcustMoreicon extends BasePage
{
	public AddcustMoreicon (WebDriver driver)
	{
		super(driver);
	}


	
	private By imgMore_Clicked1Elem = By.xpath("//IMG[@alt='More Details']");

	private By Eneter_Ref_num2Elem = By.xpath("//label[normalize-space()= 'Ref No:']/../../div[2]/input");

	private By Vat_no_Applied_Yes3Elem = By.xpath("//label[normalize-space()= 'Yes']/../input");

	private By Vat_no_Applied_No3Elem = By.xpath("//label[normalize-space()= 'No']/../input");

	private By Enter_Vat_Number4Elem = By.xpath("//label[normalize-space()= 'VAT No:*']/../../div[2]/input");

	private By Select_Customer_Type5Elem = By.xpath("//*[@id='ctl00_cPH_ddCustomerType']");

	private By Select_Cust_Bus_Type6Elem = By.xpath("//label[normalize-space()= 'Business Type:']/../../div[2]/select");

	private By Enter_Note_7Elem = By.xpath("//label[normalize-space()= 'Notes:']/../../div[2]/textarea");

	private By Select_Payment_8Elem = By.xpath("//SELECT[@name='ctl00$cPH$ddPayment']");

	private By Enter_Ledger_9Elem = By.xpath("//label[normalize-space()= 'Ledger:']/../../div[2]/select");

	private By Select_Credit_Control_Status_Type_10Elem = By.xpath("//*[@id='ctl00_cPH_ddlCreditControlStatusType']");

	private By Select_Currency_11Elem = By.xpath("//*[@id='ctl00_cPH_ddCurrency']");

	private By Click_Save_btn_12Elem = By.xpath("//A[@id='ctl00_cphFooter_btnSave']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AccountUI/Customer.aspx?FYCode=117202&CompanyCode=16865&menuid=0");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/Customer.aspx?FYCode=117202&CompanyCode=16865&menuid=0");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/Customer.aspx?FYCode=117202&CompanyCode=16865&menuid=0");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/AccountUI/Customer.aspx?FYCode=117202&CompanyCode=16865&menuid=0";

        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/AccountUI/Customer.aspx?FYCode=117202&CompanyCode=16865&menuid=0")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click imgMore_Clicked1
     * @name Click imgMore_Clicked1
     */
	public void Click_imgMore_Clicked1()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[2]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(imgMore_Clicked1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_imgMore_Clicked1", "Click_imgMore_Clicked1 failed. Unable to locate object: " + imgMore_Clicked1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_imgMore_Clicked1", "Click_imgMore_Clicked1 failed. Unable to locate object: " + imgMore_Clicked1Elem.toString());

			Assert.fail("Unable to locate object: " + imgMore_Clicked1Elem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_imgMore_Clicked1");

		TestModellerLogger.PassStep(m_Driver, "Click_imgMore_Clicked1");
	}

      
	/**
 	 * Enter Eneter_Ref_num2
     * @name Enter Eneter_Ref_num2
     */
 	public void Enter_Eneter_Ref_num2(String Eneter_Ref_num2)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Eneter_Ref_num2Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Eneter_Ref_num2", "Enter_Eneter_Ref_num2 failed. Unable to locate object: " + Eneter_Ref_num2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Eneter_Ref_num2", "Enter_Eneter_Ref_num2 failed. Unable to locate object: " + Eneter_Ref_num2Elem.toString());

 			Assert.fail("Unable to locate object: " + Eneter_Ref_num2Elem.toString());
         }

 		elem.sendKeys(Eneter_Ref_num2);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Eneter_Ref_num2 " + Eneter_Ref_num2);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Eneter_Ref_num2 " + Eneter_Ref_num2);
 	}

     
	/**
 	 * Click Vat_no_Applied_Yes3
     * @name Click Vat_no_Applied_Yes3
     */
	public void Click_Vat_no_Applied_Yes3()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[2]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(Vat_no_Applied_Yes3Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Vat_no_Applied_Yes3", "Click_Vat_no_Applied_Yes3 failed. Unable to locate object: " + Vat_no_Applied_Yes3Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Vat_no_Applied_Yes3", "Click_Vat_no_Applied_Yes3 failed. Unable to locate object: " + Vat_no_Applied_Yes3Elem.toString());

			Assert.fail("Unable to locate object: " + Vat_no_Applied_Yes3Elem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_Vat_no_Applied_Yes3");

		TestModellerLogger.PassStep(m_Driver, "Click_Vat_no_Applied_Yes3");
	}

     
	/**
 	 * Click Vat_no_Applied_No3
     * @name Click Vat_no_Applied_No3
     */
	public void Click_Vat_no_Applied_No3()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[2]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(Vat_no_Applied_No3Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Vat_no_Applied_No3", "Click_Vat_no_Applied_No3 failed. Unable to locate object: " + Vat_no_Applied_No3Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Vat_no_Applied_No3", "Click_Vat_no_Applied_No3 failed. Unable to locate object: " + Vat_no_Applied_No3Elem.toString());

			Assert.fail("Unable to locate object: " + Vat_no_Applied_No3Elem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_Vat_no_Applied_No3");

		TestModellerLogger.PassStep(m_Driver, "Click_Vat_no_Applied_No3");
	}

      
	/**
 	 * Enter Enter_Vat_Number4
     * @name Enter Enter_Vat_Number4
     */
 	public void Enter_Enter_Vat_Number4(String Enter_Vat_Number4)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Enter_Vat_Number4Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_Vat_Number4", "Enter_Enter_Vat_Number4 failed. Unable to locate object: " + Enter_Vat_Number4Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_Vat_Number4", "Enter_Enter_Vat_Number4 failed. Unable to locate object: " + Enter_Vat_Number4Elem.toString());

 			Assert.fail("Unable to locate object: " + Enter_Vat_Number4Elem.toString());
         }

 		elem.sendKeys(Enter_Vat_Number4);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_Vat_Number4 " + Enter_Vat_Number4);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_Vat_Number4 " + Enter_Vat_Number4);
 	}

    
	/**
 	 * Select Select_Customer_Type5
     * @name Select Select_Customer_Type5
     */
    public void Select_Select_Customer_Type5(String Select_Customer_Type5)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Select_Customer_Type5Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Select_Customer_Type5", "Select_Select_Customer_Type5 failed. Unable to locate object: " + Select_Customer_Type5Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Select_Customer_Type5", "Select_Select_Customer_Type5 failed. Unable to locate object: " + Select_Customer_Type5Elem.toString());

 			Assert.fail("Unable to locate object: " + Select_Customer_Type5Elem.toString());
         }

		//Select dropdown = new Select(elem);
   elem.sendKeys(Keys.ARROW_DOWN);
// 		dropdown.selectByVisibleText(Select_Customer_Type5);
 		
 		utilities.PassScreenshot.Getscreenshot11("Selected cutommer EU Type", "Customer Type");
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_Select_Customer_Type5 " + Select_Customer_Type5);

 		TestModellerLogger.PassStep(m_Driver, "Select_Select_Customer_Type5 " + Select_Customer_Type5);
 	}

    
	/**
 	 * Select Select_Cust_Bus_Type6
     * @name Select Select_Cust_Bus_Type6
     */
    public void Select_Select_Cust_Bus_Type6(String Select_Cust_Bus_Type6)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Select_Cust_Bus_Type6Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Select_Cust_Bus_Type6", "Select_Select_Cust_Bus_Type6 failed. Unable to locate object: " + Select_Cust_Bus_Type6Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Select_Cust_Bus_Type6", "Select_Select_Cust_Bus_Type6 failed. Unable to locate object: " + Select_Cust_Bus_Type6Elem.toString());

 			Assert.fail("Unable to locate object: " + Select_Cust_Bus_Type6Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Select_Cust_Bus_Type6);
 		
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_Select_Cust_Bus_Type6 " + Select_Cust_Bus_Type6);

 		TestModellerLogger.PassStep(m_Driver, "Select_Select_Cust_Bus_Type6 " + Select_Cust_Bus_Type6);
 	}

      
	/**
 	 * Enter Enter_Note_7
     * @name Enter Enter_Note_7
     */
 	public void Enter_Enter_Note_7(String Enter_Note_7)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Enter_Note_7Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_Note_7", "Enter_Enter_Note_7 failed. Unable to locate object: " + Enter_Note_7Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_Note_7", "Enter_Enter_Note_7 failed. Unable to locate object: " + Enter_Note_7Elem.toString());

 			Assert.fail("Unable to locate object: " + Enter_Note_7Elem.toString());
         }

 		elem.sendKeys(Enter_Note_7);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_Note_7 " + Enter_Note_7);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_Note_7 " + Enter_Note_7);
 	}

    
	/**
 	 * Select Select_Payment_8
     * @name Select Select_Payment_8
     */
    public void Select_Select_Payment_8(String Select_Payment_8)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Select_Payment_8Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Select_Payment_8", "Select_Select_Payment_8 failed. Unable to locate object: " + Select_Payment_8Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Select_Payment_8", "Select_Select_Payment_8 failed. Unable to locate object: " + Select_Payment_8Elem.toString());

 			Assert.fail("Unable to locate object: " + Select_Payment_8Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Select_Payment_8);
 		
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_Select_Payment_8 " + Select_Payment_8);

 		TestModellerLogger.PassStep(m_Driver, "Select_Select_Payment_8 " + Select_Payment_8);
 	}

    
	/**
 	 * Select Enter_Ledger_9
     * @name Select Enter_Ledger_9
     */
    public void Select_Enter_Ledger_9(String Enter_Ledger_9)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Enter_Ledger_9Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Enter_Ledger_9", "Select_Enter_Ledger_9 failed. Unable to locate object: " + Enter_Ledger_9Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Enter_Ledger_9", "Select_Enter_Ledger_9 failed. Unable to locate object: " + Enter_Ledger_9Elem.toString());

 			Assert.fail("Unable to locate object: " + Enter_Ledger_9Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Enter_Ledger_9);
 		
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_Enter_Ledger_9 " + Enter_Ledger_9);

 		TestModellerLogger.PassStep(m_Driver, "Select_Enter_Ledger_9 " + Enter_Ledger_9);
 	}

    
	/**
 	 * Select Select_Credit_Control_Status_Type_10
     * @name Select Select_Credit_Control_Status_Type_10
     */
    public void Select_Select_Credit_Control_Status_Type_10(String Select_Credit_Control_Status_Type_10)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Select_Credit_Control_Status_Type_10Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Select_Credit_Control_Status_Type_10", "Select_Select_Credit_Control_Status_Type_10 failed. Unable to locate object: " + Select_Credit_Control_Status_Type_10Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Select_Credit_Control_Status_Type_10", "Select_Select_Credit_Control_Status_Type_10 failed. Unable to locate object: " + Select_Credit_Control_Status_Type_10Elem.toString());

 			Assert.fail("Unable to locate object: " + Select_Credit_Control_Status_Type_10Elem.toString());
         }
 		elem.sendKeys(Keys.ARROW_DOWN);

// 		Select dropdown = new Select(elem);
// 		
//
// 		dropdown.selectByVisibleText(Select_Credit_Control_Status_Type_10);
 		
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_Select_Credit_Control_Status_Type_10 " + Select_Credit_Control_Status_Type_10);

 		TestModellerLogger.PassStep(m_Driver, "Select_Select_Credit_Control_Status_Type_10 " + Select_Credit_Control_Status_Type_10);
 	}

    
	/**
 	 * Select Select_Currency_11
     * @name Select Select_Currency_11
     */
    public void Select_Select_Currency_11(String Select_Currency_11)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Select_Currency_11Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Select_Currency_11", "Select_Select_Currency_11 failed. Unable to locate object: " + Select_Currency_11Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Select_Currency_11", "Select_Select_Currency_11 failed. Unable to locate object: " + Select_Currency_11Elem.toString());

 			Assert.fail("Unable to locate object: " + Select_Currency_11Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Select_Currency_11);
 		
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_Select_Currency_11 " + Select_Currency_11);

 		TestModellerLogger.PassStep(m_Driver, "Select_Select_Currency_11 " + Select_Currency_11);
 	}

     
	/**
 	 * Click Click_Save_btn_12
	 * @throws InterruptedException 
     * @name Click Click_Save_btn_12
     */
	public void Click_Click_Save_btn_12() throws InterruptedException
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[2]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(Click_Save_btn_12Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Click_Save_btn_12", "Click_Click_Save_btn_12 failed. Unable to locate object: " + Click_Save_btn_12Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Click_Save_btn_12", "Click_Click_Save_btn_12 failed. Unable to locate object: " + Click_Save_btn_12Elem.toString());

			Assert.fail("Unable to locate object: " + Click_Save_btn_12Elem.toString());
        }

		jsExec.executeScript("arguments[0].click()", elem);
		
        
		m_Driver.switchTo().defaultContent();
  	Thread.sleep(3000);

		ExtentReportManager.passStep(m_Driver, "Click_Click_Save_btn_12");

		TestModellerLogger.PassStep(m_Driver, "Click_Click_Save_btn_12");
	}
}