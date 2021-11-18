package Pages_Income;

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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/3be8527b-6d9c-4364-95ff-d4fe684cd4c2
@TestModellerModule(guid = "3be8527b-6d9c-4364-95ff-d4fe684cd4c2")
public class New_Quotes extends BasePage
{
	public New_Quotes (WebDriver driver)
	{
		super(driver);
	}


	
	private By New_1Elem = By.xpath("//*[@id='ctl00_divMainContent']/header/div/div[4]/a");

	private By New_Quote_2Elem = By.xpath("//A[@id='ctl00_cpHeaderRight_btnAddQuote']");

	private By Select_Customer_3Elem = By.xpath("//label[normalize-space()= 'Customer']/../../div[2]/div/select");

	private By Enter_InvoiceNo_4Elem = By.xpath("//label[normalize-space()= 'Quote No *']/../../div[2]/input");

	private By Enter_InvoiceDate_5Elem = By.xpath("//label[normalize-space()= 'Quote Date']/../../div[2]/input");

	private By Click_chk_AutoEmail_6Elem = By.xpath("//label[normalize-space()= 'Auto Email']/../../div[2]/input");

	private By Click_Chk_Non_Vat_Quote7Elem = By.xpath("//label[normalize-space()= 'Non VAT Quote']/../../div[2]/span");

	private By Income_Type_Btn_8Elem = By.xpath("//A[@data-original-title='Add Income Type']");

	private By Enter_IncomeHeadName_9Elem = By.xpath("//label[normalize-space()= 'Income Head Name:*']/../../div[2]/input");

	private By Selete_VatType_10Elem = By.xpath("//label[normalize-space()= 'Type:']/../../div[2]/select");

	private By Click_More_Details_11Elem = By.xpath("//A[@id='toentry']");

	private By Save_13Elem = By.xpath("//A[@id='ctl00_cphFooter_btnSave']");

	private By Click_chk_CIS12Elem = By.xpath("//label[normalize-space()= 'CIS Item:']/../../div[2]/input");

	private By Select_Income_type_14Elem = By.xpath("//SELECT[@name='ctl00$cPH$rptrProduct$ctl00$ddProduct']");

	private By Enter_Description_15Elem = By.xpath("//TEXTAREA[@name='ctl00$cPH$rptrProduct$ctl00$txtDescription']");

	private By Enter_UnitPrice_16Elem = By.xpath("//INPUT[@name='ctl00$cPH$rptrProduct$ctl00$txtUnitPrice']");

	private By Enter_Quantity_17Elem = By.xpath("//INPUT[@name='ctl00$cPH$rptrProduct$ctl00$txtQuantity']");

	private By Enter_DiscountRate_18Elem = By.xpath("//INPUT[@name='ctl00$cPH$rptrProduct$ctl00$txtDiscountRate']");

	private By Select_VATRate_19Elem = By.xpath("//SELECT[@name='ctl00$cPH$rptrProduct$ctl00$ddVATRate']");

	private By Save_20Elem = By.xpath("//A[@id='ctl00_cpHFooter_btnSave']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AccountUI/InvoiceQuotationEditor.aspx?FYCode=117655&CompanyCode=17318");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/InvoiceQuotationEditor.aspx?FYCode=117655&CompanyCode=17318");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/InvoiceQuotationEditor.aspx?FYCode=117655&CompanyCode=17318");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/AccountUI/InvoiceQuotationEditor.aspx?FYCode=117655&CompanyCode=17318";

        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/AccountUI/InvoiceQuotationEditor.aspx?FYCode=117655&CompanyCode=17318")) {
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
 	 * Click New Quote 2
     * @name Click New Quote 2
     */
	public void Click_New_Quote_2()
	{
        
		WebElement elem = getWebElement(New_Quote_2Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_New_Quote_2", "Click_New_Quote_2 failed. Unable to locate object: " + New_Quote_2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_New_Quote_2", "Click_New_Quote_2 failed. Unable to locate object: " + New_Quote_2Elem.toString());

			Assert.fail("Unable to locate object: " + New_Quote_2Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_New_Quote_2");

		TestModellerLogger.PassStep(m_Driver, "Click_New_Quote_2");
	}

    
	/**
 	 * Select Select Customer 3
     * @name Select Select Customer 3
     */
    public void Select_Select_Customer_3(String Select_Customer_3)
 	{
 	    
 		WebElement elem = getWebElement(Select_Customer_3Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Select_Customer_3", "Select_Select_Customer_3 failed. Unable to locate object: " + Select_Customer_3Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Select_Customer_3", "Select_Select_Customer_3 failed. Unable to locate object: " + Select_Customer_3Elem.toString());

 			Assert.fail("Unable to locate object: " + Select_Customer_3Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Select_Customer_3);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Select_Customer_3 " + Select_Customer_3);

 		TestModellerLogger.PassStep(m_Driver, "Select_Select_Customer_3 " + Select_Customer_3);
 	}

      
	/**
 	 * Enter Enter InvoiceNo 4
     * @name Enter Enter InvoiceNo 4
     */
 	public void Enter_Enter_InvoiceNo_4(String Enter_InvoiceNo_4)
 	{
 	    
 		WebElement elem = getWebElement(Enter_InvoiceNo_4Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_InvoiceNo_4", "Enter_Enter_InvoiceNo_4 failed. Unable to locate object: " + Enter_InvoiceNo_4Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_InvoiceNo_4", "Enter_Enter_InvoiceNo_4 failed. Unable to locate object: " + Enter_InvoiceNo_4Elem.toString());

 			Assert.fail("Unable to locate object: " + Enter_InvoiceNo_4Elem.toString());
         }

 		elem.sendKeys(Enter_InvoiceNo_4);
 		elem.sendKeys(Keys.TAB);
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_InvoiceNo_4 " + Enter_InvoiceNo_4);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_InvoiceNo_4 " + Enter_InvoiceNo_4);
 	}

      
	/**
 	 * Enter Enter InvoiceDate 5
     * @name Enter Enter InvoiceDate 5
     */
 	public void Enter_Enter_InvoiceDate_5(String Enter_InvoiceDate_5)
 	{
 	    
 		WebElement elem = getWebElement(Enter_InvoiceDate_5Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_InvoiceDate_5", "Enter_Enter_InvoiceDate_5 failed. Unable to locate object: " + Enter_InvoiceDate_5Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_InvoiceDate_5", "Enter_Enter_InvoiceDate_5 failed. Unable to locate object: " + Enter_InvoiceDate_5Elem.toString());

 			Assert.fail("Unable to locate object: " + Enter_InvoiceDate_5Elem.toString());
         }

 		elem.sendKeys(Enter_InvoiceDate_5);
 		elem.sendKeys(Keys.TAB);
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_InvoiceDate_5 " + Enter_InvoiceDate_5);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_InvoiceDate_5 " + Enter_InvoiceDate_5);
 	}

     
	/**
 	 * Click Click chk_AutoEmail 6
     * @name Click Click chk_AutoEmail 6
     */
	public void Click_Click_chk_AutoEmail_6()
	{
        
		WebElement elem = getWebElement(Click_chk_AutoEmail_6Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Click_chk_AutoEmail_6", "Click_Click_chk_AutoEmail_6 failed. Unable to locate object: " + Click_chk_AutoEmail_6Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Click_chk_AutoEmail_6", "Click_Click_chk_AutoEmail_6 failed. Unable to locate object: " + Click_chk_AutoEmail_6Elem.toString());

			Assert.fail("Unable to locate object: " + Click_chk_AutoEmail_6Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Click_chk_AutoEmail_6");

		TestModellerLogger.PassStep(m_Driver, "Click_Click_chk_AutoEmail_6");
	}

     
	/**
 	 * Click Click Chk_Non Vat Quote7
     * @name Click Click Chk_Non Vat Quote7
     */
	public void Click_Click_Chk_Non_Vat_Quote7()
	{
        
		WebElement elem = getWebElement(Click_Chk_Non_Vat_Quote7Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Click_Chk_Non_Vat_Quote7", "Click_Click_Chk_Non_Vat_Quote7 failed. Unable to locate object: " + Click_Chk_Non_Vat_Quote7Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Click_Chk_Non_Vat_Quote7", "Click_Click_Chk_Non_Vat_Quote7 failed. Unable to locate object: " + Click_Chk_Non_Vat_Quote7Elem.toString());

			Assert.fail("Unable to locate object: " + Click_Chk_Non_Vat_Quote7Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Click_Chk_Non_Vat_Quote7");

		TestModellerLogger.PassStep(m_Driver, "Click_Click_Chk_Non_Vat_Quote7");
	}

     
	/**
 	 * Click Income Type + Btn 8
     * @name Click Income Type + Btn 8
     */
	public void Click_Income_Type_Btn_8()
	{
        
		WebElement elem = getWebElement(Income_Type_Btn_8Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Income_Type_Btn_8", "Click_Income_Type_Btn_8 failed. Unable to locate object: " + Income_Type_Btn_8Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Income_Type_Btn_8", "Click_Income_Type_Btn_8 failed. Unable to locate object: " + Income_Type_Btn_8Elem.toString());

			Assert.fail("Unable to locate object: " + Income_Type_Btn_8Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Income_Type_Btn_8");

		TestModellerLogger.PassStep(m_Driver, "Click_Income_Type_Btn_8");
	}

      
	/**
 	 * Enter Enter IncomeHeadName 9
     * @name Enter Enter IncomeHeadName 9
     */
 	public void Enter_Enter_IncomeHeadName_9(String Enter_IncomeHeadName_9)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div[1]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Enter_IncomeHeadName_9Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_IncomeHeadName_9", "Enter_Enter_IncomeHeadName_9 failed. Unable to locate object: " + Enter_IncomeHeadName_9Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_IncomeHeadName_9", "Enter_Enter_IncomeHeadName_9 failed. Unable to locate object: " + Enter_IncomeHeadName_9Elem.toString());

 			Assert.fail("Unable to locate object: " + Enter_IncomeHeadName_9Elem.toString());
         }

 		elem.sendKeys(Enter_IncomeHeadName_9);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_IncomeHeadName_9 " + Enter_IncomeHeadName_9);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_IncomeHeadName_9 " + Enter_IncomeHeadName_9);
 	}

    
	/**
 	 * Select Selete VatType 10
     * @name Select Selete VatType 10
     */
    public void Select_Selete_VatType_10(String Selete_VatType_10)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div[1]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Selete_VatType_10Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Selete_VatType_10", "Select_Selete_VatType_10 failed. Unable to locate object: " + Selete_VatType_10Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Selete_VatType_10", "Select_Selete_VatType_10 failed. Unable to locate object: " + Selete_VatType_10Elem.toString());

 			Assert.fail("Unable to locate object: " + Selete_VatType_10Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Selete_VatType_10);
 		
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_Selete_VatType_10 " + Selete_VatType_10);

 		TestModellerLogger.PassStep(m_Driver, "Select_Selete_VatType_10 " + Selete_VatType_10);
 	}

     
	/**
 	 * Click Click More Details 11
     * @name Click Click More Details 11
     */
	public void Click_Click_More_Details_11()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div[1]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(Click_More_Details_11Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Click_More_Details_11", "Click_Click_More_Details_11 failed. Unable to locate object: " + Click_More_Details_11Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Click_More_Details_11", "Click_Click_More_Details_11 failed. Unable to locate object: " + Click_More_Details_11Elem.toString());

			Assert.fail("Unable to locate object: " + Click_More_Details_11Elem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_Click_More_Details_11");

		TestModellerLogger.PassStep(m_Driver, "Click_Click_More_Details_11");
	}

     
	/**
 	 * Click Save 13
     * @name Click Save 13
     */
	public void Click_Save_13()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div[1]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(Save_13Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Save_13", "Click_Save_13 failed. Unable to locate object: " + Save_13Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Save_13", "Click_Save_13 failed. Unable to locate object: " + Save_13Elem.toString());

			Assert.fail("Unable to locate object: " + Save_13Elem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_Save_13");

		TestModellerLogger.PassStep(m_Driver, "Click_Save_13");
	}

     
	/**
 	 * Click Click chk_CIS12
     * @name Click Click chk_CIS12
     */
	public void Click_Click_chk_CIS12()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div[1]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(Click_chk_CIS12Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Click_chk_CIS12", "Click_Click_chk_CIS12 failed. Unable to locate object: " + Click_chk_CIS12Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Click_chk_CIS12", "Click_Click_chk_CIS12 failed. Unable to locate object: " + Click_chk_CIS12Elem.toString());

			Assert.fail("Unable to locate object: " + Click_chk_CIS12Elem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_Click_chk_CIS12");

		TestModellerLogger.PassStep(m_Driver, "Click_Click_chk_CIS12");
	}
	
	public void Click_chk_ServiceProductItem()
	{
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div[1]/div/div/div[2]/iframe")));
		m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_chkIsServiceProduct']")).click();
		m_Driver.switchTo().defaultContent();
	}

    
	/**
 	 * Select Select Income type 14
     * @name Select Select Income type 14
     */
    public void Select_Select_Income_type_14(String Select_Income_type_14)
 	{
 	    
 		WebElement elem = getWebElement(Select_Income_type_14Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Select_Income_type_14", "Select_Select_Income_type_14 failed. Unable to locate object: " + Select_Income_type_14Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Select_Income_type_14", "Select_Select_Income_type_14 failed. Unable to locate object: " + Select_Income_type_14Elem.toString());

 			Assert.fail("Unable to locate object: " + Select_Income_type_14Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Select_Income_type_14);
 		elem.sendKeys(Keys.TAB);
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Select_Income_type_14 " + Select_Income_type_14);

 		TestModellerLogger.PassStep(m_Driver, "Select_Select_Income_type_14 " + Select_Income_type_14);
 	}

      
	/**
 	 * Enter Enter Description 15
     * @name Enter Enter Description 15
     */
 	public void Enter_Enter_Description_15(String Enter_Description_15)
 	{
 	    
 		WebElement elem = getWebElement(Enter_Description_15Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_Description_15", "Enter_Enter_Description_15 failed. Unable to locate object: " + Enter_Description_15Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_Description_15", "Enter_Enter_Description_15 failed. Unable to locate object: " + Enter_Description_15Elem.toString());

 			Assert.fail("Unable to locate object: " + Enter_Description_15Elem.toString());
         }

 		elem.sendKeys(Enter_Description_15);
 		elem.sendKeys(Keys.TAB);
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_Description_15 " + Enter_Description_15);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_Description_15 " + Enter_Description_15);
 	}

      
	/**
 	 * Enter Enter UnitPrice 16
     * @name Enter Enter UnitPrice 16
     */
 	public void Enter_Enter_UnitPrice_16(String Enter_UnitPrice_16)
 	{
 	    
 		WebElement elem = getWebElement(Enter_UnitPrice_16Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_UnitPrice_16", "Enter_Enter_UnitPrice_16 failed. Unable to locate object: " + Enter_UnitPrice_16Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_UnitPrice_16", "Enter_Enter_UnitPrice_16 failed. Unable to locate object: " + Enter_UnitPrice_16Elem.toString());

 			Assert.fail("Unable to locate object: " + Enter_UnitPrice_16Elem.toString());
         }

 		elem.sendKeys(Enter_UnitPrice_16);
 		elem.sendKeys(Keys.TAB);
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_UnitPrice_16 " + Enter_UnitPrice_16);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_UnitPrice_16 " + Enter_UnitPrice_16);
 	}

      
	/**
 	 * Enter Enter Quantity 17
     * @name Enter Enter Quantity 17
     */
 	public void Enter_Enter_Quantity_17(String Enter_Quantity_17)
 	{
 	    
 		WebElement elem = getWebElement(Enter_Quantity_17Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_Quantity_17", "Enter_Enter_Quantity_17 failed. Unable to locate object: " + Enter_Quantity_17Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_Quantity_17", "Enter_Enter_Quantity_17 failed. Unable to locate object: " + Enter_Quantity_17Elem.toString());

 			Assert.fail("Unable to locate object: " + Enter_Quantity_17Elem.toString());
         }

 		elem.sendKeys(Enter_Quantity_17);
 		elem.sendKeys(Keys.TAB);
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_Quantity_17 " + Enter_Quantity_17);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_Quantity_17 " + Enter_Quantity_17);
 	}

      
	/**
 	 * Enter Enter DiscountRate% 18
     * @name Enter Enter DiscountRate% 18
     */
 	public void Enter_Enter_DiscountRate_18(String Enter_DiscountRate_18)
 	{
 	    
 		WebElement elem = getWebElement(Enter_DiscountRate_18Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_DiscountRate_18", "Enter_Enter_DiscountRate_18 failed. Unable to locate object: " + Enter_DiscountRate_18Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_DiscountRate_18", "Enter_Enter_DiscountRate_18 failed. Unable to locate object: " + Enter_DiscountRate_18Elem.toString());

 			Assert.fail("Unable to locate object: " + Enter_DiscountRate_18Elem.toString());
         }

 		elem.sendKeys(Enter_DiscountRate_18);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_DiscountRate_18 " + Enter_DiscountRate_18);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_DiscountRate_18 " + Enter_DiscountRate_18);
 	}
    
	/**
 	 * Select Select VATRate 19
     * @name Select Select VATRate 19
     */
    public void Select_Select_VATRate_19(String Select_VATRate_19)
 	{
 	    
 		WebElement elem = getWebElement(Select_VATRate_19Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Select_VATRate_19", "Select_Select_VATRate_19 failed. Unable to locate object: " + Select_VATRate_19Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Select_VATRate_19", "Select_Select_VATRate_19 failed. Unable to locate object: " + Select_VATRate_19Elem.toString());

 			Assert.fail("Unable to locate object: " + Select_VATRate_19Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Select_VATRate_19);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Select_VATRate_19 " + Select_VATRate_19);

 		TestModellerLogger.PassStep(m_Driver, "Select_Select_VATRate_19 " + Select_VATRate_19);
 	}

     
	/**
 	 * Click Save 20
	 * @throws InterruptedException 
     * @name Click Save 20
     */
	public void Click_Save_20() throws InterruptedException
	{
        
		WebElement elem = getWebElement(Save_20Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Save_20", "Click_Save_20 failed. Unable to locate object: " + Save_20Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Save_20", "Click_Save_20 failed. Unable to locate object: " + Save_20Elem.toString());

			Assert.fail("Unable to locate object: " + Save_20Elem.toString());
        }
       Thread.sleep(2000);
       jsExec.executeScript("arguments[0].scrollIntoView(true);",elem );
      elem.click();
		 Thread.sleep(2000);

		ExtentReportManager.passStep(m_Driver, "Click_Save_20");

		TestModellerLogger.PassStep(m_Driver, "Click_Save_20");
	}
	
	
	public void Delete() throws InterruptedException
	{
		Thread.sleep(2000);
		m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrProduct_ctl00_hrefClear']/i")).click();
		
		
	}
	
	
	public void clear_Qunt_Unt()
	{
		WebElement elemQ = getWebElement(Enter_UnitPrice_16Elem);
		WebElement elemU = getWebElement(Enter_Quantity_17Elem);
		
		
		elemQ.clear();
		elemQ.sendKeys("0");
		elemQ.sendKeys(Keys.TAB);
		elemU.clear();
		elemU.sendKeys("0");
		elemU.sendKeys(Keys.TAB);
	
	}
	
	public void success_message() throws InterruptedException
	{
		Thread.sleep(2000);
		String msg=m_Driver.findElement(By.xpath("//*[@id='ctl00_divSubContent']/div[1]/div")).getText();
		String []a=msg.split(" ");
		
		
		boolean b=msg.contains("Success! Quote# "+a[2]+" added successfully");
		Assert.assertTrue(b);
		
		utilities.Screenshotcapture.Getscreenshot("Success Message On Top Of The Screen With Quote No", "New Quotes");
	}
	
	public void WithoutQuoteNo_message() throws InterruptedException
	{
		Thread.sleep(2000);
		String msg=m_Driver.findElement(By.xpath("//*[@id='ctl00_divSubContent']/div[2]/div")).getText();
		
		boolean b=msg.contains("Information! Please enter Quote number");
		Assert.assertTrue(b);
		
		utilities.Screenshotcapture.Getscreenshot("New Quote Without Quote No (Msg)", "New Quotes");
	}
	
	public void EnteruniqueNoWithoutQ_message() throws InterruptedException
	{
		Thread.sleep(2000);
		String msg=m_Driver.findElement(By.xpath("//*[@id='ctl00_divSubContent']/div[2]/div")).getText();
		
		boolean b=msg.contains("Information! Please enter unique Quote number and can be start from 'Q'");
		Assert.assertTrue(b);
		
		utilities.Screenshotcapture.Getscreenshot("New Quote Unique No Without Q (Msg)", "New Quotes");
	}
	public void DefaultCurrentDate() throws InterruptedException
	
	{
		Thread.sleep(2000);
		utilities.Screenshotcapture.Getscreenshot("Default Current Date", "New Quotes");
	}
	
	
	public void IncomeTypeList() throws InterruptedException
	{
		WebElement elem = getWebElement(Select_Income_type_14Elem);
		
		elem.click();
		Thread.sleep(1000);
		utilities.Screenshotcapture.Getscreenshot(" All existing sales should be in Income type dropdown", "New Quotes");
	}
	
	public void AddNewIncomeType() throws InterruptedException
	{
		WebElement elem = getWebElement(Select_Income_type_14Elem);
		
		elem.click();
		Thread.sleep(1000);
		utilities.Screenshotcapture.Getscreenshot(" Add New Income Type ", "New Quotes");
	}
	
public void NewIncomeTypePopUp() throws InterruptedException
	
	{
		Thread.sleep(2000);
		utilities.Screenshotcapture.Getscreenshot(" New Income Type PopUp", "New Quotes");
	}
	
public void multiply1() throws InterruptedException

{
	Thread.sleep(2000);
	utilities.Screenshotcapture.Getscreenshot("Unit Price box must be multiply with the quantity", "New Quotes");
}
public void multiply2() throws InterruptedException

{
	Thread.sleep(2000);
	utilities.Screenshotcapture.Getscreenshot("Quantity  box must be multiply with the quantity", "New Quotes");
}
	
public void Qunt_Unt_Enter_0() throws InterruptedException
{
	Thread.sleep(2000);
	String msg=m_Driver.findElement(By.xpath("//*[@id='ctl00_divSubContent']/div[2]/div")).getText();
	boolean b=msg.contains("Information! Please enter a valid unit price and quantity for Sale");
	Assert.assertTrue(b);
	utilities.Screenshotcapture.Getscreenshot("Quatity & unit price Enter As Zero", "New Quotes");
}
	
public void Discount() throws InterruptedException

{
	Thread.sleep(2000);
	utilities.Screenshotcapture.Getscreenshot("Discount Calculate with total Amount After the Sub Total", "New Quotes");
}
	
public void CIS() throws InterruptedException

{
	Thread.sleep(2000);
	utilities.Screenshotcapture.Getscreenshot("CIS  highlight only when CIS income type selected", "New Quotes");
}
	
	public void VatList() throws InterruptedException
	{
		utilities.Screenshotcapture.Getscreenshot("Always Set No VAT As Default", "New Quotes");
		WebElement elem = getWebElement(Select_VATRate_19Elem);
		elem.click();
		//Thread.sleep(1000);
		utilities.Screenshotcapture.Getscreenshot("Vat Rate List", "New Quotes");
	}
	public void Select_VatRate() throws InterruptedException

	{
		Thread.sleep(2000);
		utilities.Screenshotcapture.Getscreenshot("Once any rate selected it should apply without refresh", "New Quotes");
	}
	
	public void VAT_Show_only_VAT_value_Line() throws InterruptedException

	{
		Thread.sleep(2000);
		utilities.Screenshotcapture.Getscreenshot("VAT Show Only VAT Value Line", "New Quotes");
	}
	
	
	public void Delete_Icon() throws InterruptedException

	{
		Thread.sleep(2000);
		utilities.Screenshotcapture.Getscreenshot("Delete Icon  When clicking it delete the line items", "New Quotes");
	}
	
	public void success_messageViewQuotes() throws InterruptedException
	{
		Thread.sleep(2000);
		String msg=m_Driver.findElement(By.xpath("//*[@id='ctl00_divSubContent']/div[1]/div")).getText();
		String []a=msg.split(" ");
		
		
		boolean b=msg.contains("Success! Quote# "+a[2]+" added successfully");
		Assert.assertTrue(b);
		
		utilities.Screenshotcapture.Getscreenshot("Success Message On Top Of The Screen With Quote No 1", "View Quote");
				
	}
	
	
}