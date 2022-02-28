package pages.Receive_Payment;

import pages.BasePage;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/8abf97c9-ed0c-4a75-bd41-087ae120fb51
@TestModellerModule(guid = "8abf97c9-ed0c-4a75-bd41-087ae120fb51")
public class SaleInvoices extends BasePage
{
	 Dimension d = new Dimension(300,1080);
	public static String krno2;
	
	static String invoiceno;
	static String Creditno;
	static String vatonlyinvoic;
	public SaleInvoices (WebDriver driver)
	{
		super(driver);
	}


	
	private By Sale_New_menu1Elem = By.xpath("//*[@id='ctl00_SideMenu1_incomeMenu']/a/span");

	private By Click_Create_Nu_Invoice_2Elem = By.xpath("//A[@id='ctl00_cpHeaderRight_btnAdd']");

	private By Click_Create_Credit_Note_3Elem = By.xpath("//A[@id='ctl00_cpHeaderRight_btnAddCreditNote']");

	private By Click_Create_New__VATOnlyInvoice_4Elem = By.xpath("//A[@id='ctl00_cpHeaderRight_btnAddVATInvoice']");

	private By Nu_Inv_Customer_1Elem = By.xpath("//label[normalize-space()= 'Customer:']/../div/div/select");

	private By Nu_Inv_InvoiceDate_2Elem = By.xpath("//label[normalize-space()= 'Invoice Date:']/../div/input");

	private By Nu_Inv_DueDate_3Elem = By.xpath("//label[normalize-space()= 'Due Date:']/../div/div/input");

	private By Nu_Inv_InvoiceNo_4Elem = By.xpath("//label[normalize-space()= 'Invoice No:']/../div/input");

	private By Nu_Inv_Select_Bank_5Elem = By.xpath("//label[normalize-space()= 'Bank:']/../div/div/select");

	private By Nu_Inv_PaymentTerm_6Elem = By.xpath("//label[normalize-space()= 'Payment Terms:']/../div/input");

	private By Nu_Inv_ReferenceNo_7Elem = By.xpath("//label[normalize-space()= 'Reference No:']/../div/input");

	private By Nu_Inv_Product_8Elem = By.xpath("//SELECT[@name='ctl00$cPH$rptrProduct$ctl00$ddProduct']");

	private By Nu_Inv_Description_8Elem = By.xpath("//TEXTAREA[@name='ctl00$cPH$rptrProduct$ctl00$txtDescription']");

	private By Nu_Inv_UnitPrice_9Elem = By.xpath("//INPUT[@name='ctl00$cPH$rptrProduct$ctl00$txtUnitPrice']");

	private By Nu_Inv_Quantity_10Elem = By.xpath("//INPUT[@name='ctl00$cPH$rptrProduct$ctl00$txtQuantity']");

	private By Nu_Inv_chk_AutoEmail_11Elem = By.xpath("//label[normalize-space()= 'Chaser Email :']/../div/div/input");

	private By Nu_Inv_Template_12Elem = By.xpath("//label[normalize-space()= 'Template:']/../div/div/select");

	private By Nu_Inv_Note_13Elem = By.xpath("//label[normalize-space()= 'Additional Notes:']/../div/textarea");

	private By Nu_Inv_FileUpload1_14Elem = By.xpath("//label[normalize-space()= 'Attachment:']/../div/input");

	private By Nu_Inv__Save__15Elem = By.xpath("//*[@id='ctl00_cpHFooter_btnPreviewOnsave']");

	private By Nu_Inv_Cancel_15Elem = By.xpath("//A[@id='ctl00_cpHFooter_btnCancel']");

	private By Nu_Inv__RecalLastEntry__16Elem = By.xpath("//A[@id='ctl00_cpHFooter_btnRecall']");

	private By Credit_note_ReferenceNo1Elem = By.xpath("//label[normalize-space()= 'Reference No:']/../div/input");

	private By Credit_note_Description_2Elem = By.xpath("//TEXTAREA[@name='ctl00$cPH$rptrProduct$ctl00$txtDescription']");

	private By Credit_note_InvoiceTemplate_3Elem = By.xpath("//label[normalize-space()= 'Template:']/../div/div/select");

	private By Credit_note_txtNote_4Elem = By.xpath("//label[normalize-space()= 'Additional Notes:']/../div/textarea");

	private By Credit_note_FileUpload1_5Elem = By.xpath("//label[normalize-space()= 'Attachment:']/../div/input");

	private By Vat_only_inovice_Customer_1Elem = By.xpath("//*[@id='ctl00_cPH_ddlCustomer']");

	private By Vat_only_inovice_nvoiceNo_2Elem = By.xpath("//*[@id='ctl00_cPH_txtInvoiceNo']");

	private By Vat_only_inovice_nvoiceDate_3Elem = By.xpath("//label[normalize-space()= 'Invoice Date *']/../../div[2]/input");

	private By Vat_only_inovice_SubTotal_4Elem = By.xpath("/html/body/form/main/div[11]/div[3]/div/div[5]/div/div/div[1]/div[1]/div/div[4]/div[2]/input");

	private By Vat_only_inovice_VATRate_5Elem = By.xpath("//label[normalize-space()= 'VAT Rate Type *']/../../div[2]/select");

	private By Vat_only_inovice_VAT_6Elem = By.xpath("//label[normalize-space()= 'VAT (+)']/../../div[2]/input[1]");

	private By Vat_only_inovice_NetTotal_7Elem = By.xpath("//label[normalize-space()= 'Gross Total']/../../div[2]/input");

	private By Vat_only_inovice_NetTotal_8Elem = By.xpath("//label[normalize-space()= 'Converted Amt.']/../../div[2]/input");

	private By Vat_only_inovice_Bank_9Elem = By.xpath("//*[@id='ctl00_cPH_ddBank']");

	private By Vat_only_inovice_PaymentTerm_10Elem = By.xpath("//label[normalize-space()= 'Payment Terms']/../../div[2]/input");

	private By Vat_only_inovice_Note_11Elem = By.xpath("//label[normalize-space()= 'Notes']/../../div[2]/textarea");

	private By Vat_only_inovice_Template_12Elem = By.xpath("//label[normalize-space()= 'Template']/../../div[2]/select");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=117421&CompanyCode=17084&IsFirstRequest=1");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=117421&CompanyCode=17084&IsFirstRequest=1");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=117421&CompanyCode=17084&IsFirstRequest=1");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=117421&CompanyCode=17084&IsFirstRequest=1";

        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=117421&CompanyCode=17084&IsFirstRequest=1")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click Sale_New_menu1
	 * @throws InterruptedException 
     * @name Click Sale_New_menu1
     */
	public void Click_Sale_New_menu1() throws InterruptedException
	{
        
		WebElement elem = getWebElement(Sale_New_menu1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Sale_New_menu1", "Click_Sale_New_menu1 failed. Unable to locate object: " + Sale_New_menu1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Sale_New_menu1", "Click_Sale_New_menu1 failed. Unable to locate object: " + Sale_New_menu1Elem.toString());

			Assert.fail("Unable to locate object: " + Sale_New_menu1Elem.toString());
        }

		
		elem.click();
		
          	Thread.sleep(1000);
          	/*cLICK ON NEW MENU*/
		m_Driver.findElement(By.xpath("//*[@id='ctl00_divMainContent']/header/div/div[4]/a")).click();
		ExtentReportManager.passStep(m_Driver, "Click_Sale_New_menu1");

		TestModellerLogger.PassStep(m_Driver, "Click_Sale_New_menu1");
		
		
		
	}

     
	/**
 	 * Click Click_Create_Nu Invoice_2
     * @name Click Click_Create_Nu Invoice_2
     */
	public void Click_Click_Create_Nu_Invoice_2()
	{
        
		WebElement elem = getWebElement(Click_Create_Nu_Invoice_2Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Click_Create_Nu_Invoice_2", "Click_Click_Create_Nu_Invoice_2 failed. Unable to locate object: " + Click_Create_Nu_Invoice_2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Click_Create_Nu_Invoice_2", "Click_Click_Create_Nu_Invoice_2 failed. Unable to locate object: " + Click_Create_Nu_Invoice_2Elem.toString());

			Assert.fail("Unable to locate object: " + Click_Create_Nu_Invoice_2Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Click_Create_Nu_Invoice_2");

		TestModellerLogger.PassStep(m_Driver, "Click_Click_Create_Nu_Invoice_2");
	}

     
	/**
 	 * Click Click_Create_Credit Note_3
     * @name Click Click_Create_Credit Note_3
     */
	public void Click_Click_Create_Credit_Note_3()
	{
        
		WebElement elem = getWebElement(Click_Create_Credit_Note_3Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Click_Create_Credit_Note_3", "Click_Click_Create_Credit_Note_3 failed. Unable to locate object: " + Click_Create_Credit_Note_3Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Click_Create_Credit_Note_3", "Click_Click_Create_Credit_Note_3 failed. Unable to locate object: " + Click_Create_Credit_Note_3Elem.toString());

			Assert.fail("Unable to locate object: " + Click_Create_Credit_Note_3Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Click_Create_Credit_Note_3");

		TestModellerLogger.PassStep(m_Driver, "Click_Click_Create_Credit_Note_3");
	}

     
	/**
 	 * Click Click_Create_New_ VATOnlyInvoice_4
     * @name Click Click_Create_New_ VATOnlyInvoice_4
     */
	public void Click_Click_Create_New__VATOnlyInvoice_4()
	{
        
		WebElement elem = getWebElement(Click_Create_New__VATOnlyInvoice_4Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Click_Create_New__VATOnlyInvoice_4", "Click_Click_Create_New__VATOnlyInvoice_4 failed. Unable to locate object: " + Click_Create_New__VATOnlyInvoice_4Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Click_Create_New__VATOnlyInvoice_4", "Click_Click_Create_New__VATOnlyInvoice_4 failed. Unable to locate object: " + Click_Create_New__VATOnlyInvoice_4Elem.toString());

			Assert.fail("Unable to locate object: " + Click_Create_New__VATOnlyInvoice_4Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Click_Create_New__VATOnlyInvoice_4");

		TestModellerLogger.PassStep(m_Driver, "Click_Click_Create_New__VATOnlyInvoice_4");
	}

    
	/**
 	 * Select Nu_Inv_Customer_1
     * @name Select Nu_Inv_Customer_1
     */
    public void Select_Nu_Inv_Customer_1(String Nu_Inv_Customer_1)
 	{
 	    
 		WebElement elem = getWebElement(Nu_Inv_Customer_1Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Nu_Inv_Customer_1", "Select_Nu_Inv_Customer_1 failed. Unable to locate object: " + Nu_Inv_Customer_1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Nu_Inv_Customer_1", "Select_Nu_Inv_Customer_1 failed. Unable to locate object: " + Nu_Inv_Customer_1Elem.toString());

 			Assert.fail("Unable to locate object: " + Nu_Inv_Customer_1Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Nu_Inv_Customer_1);
 		
          System.out.println("hello customer");
 		ExtentReportManager.passStep(m_Driver, "Select_Nu_Inv_Customer_1 " + Nu_Inv_Customer_1);

 		TestModellerLogger.PassStep(m_Driver, "Select_Nu_Inv_Customer_1 " + Nu_Inv_Customer_1);
 	}

      
	/**
 	 * Enter Nu_Inv_InvoiceDate_2
     * @name Enter Nu_Inv_InvoiceDate_2
     */
 	public void Enter_Nu_Inv_InvoiceDate_2(String Nu_Inv_InvoiceDate_2)
 	{
 	    
 		WebElement elem = getWebElement(Nu_Inv_InvoiceDate_2Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Nu_Inv_InvoiceDate_2", "Enter_Nu_Inv_InvoiceDate_2 failed. Unable to locate object: " + Nu_Inv_InvoiceDate_2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Nu_Inv_InvoiceDate_2", "Enter_Nu_Inv_InvoiceDate_2 failed. Unable to locate object: " + Nu_Inv_InvoiceDate_2Elem.toString());

 			Assert.fail("Unable to locate object: " + Nu_Inv_InvoiceDate_2Elem.toString());
         }
 		elem.click();

 		elem.sendKeys(Nu_Inv_InvoiceDate_2);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Nu_Inv_InvoiceDate_2 " + Nu_Inv_InvoiceDate_2);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Nu_Inv_InvoiceDate_2 " + Nu_Inv_InvoiceDate_2);
 	}

      
	/**
 	 * Enter Nu_Inv_DueDate_3
     * @name Enter Nu_Inv_DueDate_3
     */
 	public void Enter_Nu_Inv_DueDate_3(String Nu_Inv_DueDate_3)
 	{
 	    
 		WebElement elem = getWebElement(Nu_Inv_DueDate_3Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Nu_Inv_DueDate_3", "Enter_Nu_Inv_DueDate_3 failed. Unable to locate object: " + Nu_Inv_DueDate_3Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Nu_Inv_DueDate_3", "Enter_Nu_Inv_DueDate_3 failed. Unable to locate object: " + Nu_Inv_DueDate_3Elem.toString());

 			Assert.fail("Unable to locate object: " + Nu_Inv_DueDate_3Elem.toString());
         }

 		elem.sendKeys(Nu_Inv_DueDate_3);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Nu_Inv_DueDate_3 " + Nu_Inv_DueDate_3);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Nu_Inv_DueDate_3 " + Nu_Inv_DueDate_3);
 	}

      
	/**
 	 * Enter Nu_Inv_InvoiceNo_4
	 * @throws InterruptedException 
     * @name Enter Nu_Inv_InvoiceNo_4
     */
//public void Enter_Nu_Inv_InvoiceNo_4(String Nu_Inv_InvoiceNo_4)
public void Enter_Nu_Inv_InvoiceNo_4( ) throws InterruptedException

 	{
 	    
 		WebElement elem = getWebElement(Nu_Inv_InvoiceNo_4Elem);

// 		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Nu_Inv_InvoiceNo_4", "Enter_Nu_Inv_InvoiceNo_4 failed. Unable to locate object: " + Nu_Inv_InvoiceNo_4Elem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Nu_Inv_InvoiceNo_4", "Enter_Nu_Inv_InvoiceNo_4 failed. Unable to locate object: " + Nu_Inv_InvoiceNo_4Elem.toString());
//
// 			Assert.fail("Unable to locate object: " + Nu_Inv_InvoiceNo_4Elem.toString());
//         }
// 		
//	invoiceno=Nu_Inv_InvoiceNo_4;
//// 		System.out.println("Invoice number capture"+invoiceno);
//    	elem.click();
//	elem.sendKeys(Keys.CONTROL,"a",Keys.DELETE);
// 		elem.sendKeys(invoiceno);
 	
 		
//  		ExtentReportManager.passStep(m_Driver, "Enter_Nu_Inv_InvoiceNo_4 " + Nu_Inv_InvoiceNo_4);
//
//  		TestModellerLogger.PassStep(m_Driver, "Enter_Nu_Inv_InvoiceNo_4 " + Nu_Inv_InvoiceNo_4);
 		
 		
//		invoiceno=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_txtInvoiceNo']")).getCssValue(invoiceno);
//		
 		
//		System.out.println("invoicenoumber is :" +invoiceno);

 invoiceno=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_txtInvoiceNo']")).getAttribute("value");
 utilities.PassScreenshot.Getscreenshot11("Invoice number", "Sale Invoice Number");
 			
 		System.out.print("String invoice number" +invoiceno);
	
 	}
 
public String invoiceno()
{
	System.out.println("Return invoice number function1");
	return invoiceno;

}
    
	/**
 	 * Select Nu_Inv_Select_Bank_5
     * @name Select Nu_Inv_Select_Bank_5
     */
    public void Select_Nu_Inv_Select_Bank_5(String Nu_Inv_Select_Bank_5)
 	{
 	    
 		WebElement elem = getWebElement(Nu_Inv_Select_Bank_5Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Nu_Inv_Select_Bank_5", "Select_Nu_Inv_Select_Bank_5 failed. Unable to locate object: " + Nu_Inv_Select_Bank_5Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Nu_Inv_Select_Bank_5", "Select_Nu_Inv_Select_Bank_5 failed. Unable to locate object: " + Nu_Inv_Select_Bank_5Elem.toString());

 			Assert.fail("Unable to locate object: " + Nu_Inv_Select_Bank_5Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Nu_Inv_Select_Bank_5);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Nu_Inv_Select_Bank_5 " + Nu_Inv_Select_Bank_5);

 		TestModellerLogger.PassStep(m_Driver, "Select_Nu_Inv_Select_Bank_5 " + Nu_Inv_Select_Bank_5);
 	}

      
	/**
 	 * Enter Nu_Inv_PaymentTerm_6
     * @name Enter Nu_Inv_PaymentTerm_6
     */
 	public void Enter_Nu_Inv_PaymentTerm_6(String Nu_Inv_PaymentTerm_6)
 	{
 	    
 		WebElement elem = getWebElement(Nu_Inv_PaymentTerm_6Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Nu_Inv_PaymentTerm_6", "Enter_Nu_Inv_PaymentTerm_6 failed. Unable to locate object: " + Nu_Inv_PaymentTerm_6Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Nu_Inv_PaymentTerm_6", "Enter_Nu_Inv_PaymentTerm_6 failed. Unable to locate object: " + Nu_Inv_PaymentTerm_6Elem.toString());

 			Assert.fail("Unable to locate object: " + Nu_Inv_PaymentTerm_6Elem.toString());
         }

 		elem.sendKeys(Nu_Inv_PaymentTerm_6);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Nu_Inv_PaymentTerm_6 " + Nu_Inv_PaymentTerm_6);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Nu_Inv_PaymentTerm_6 " + Nu_Inv_PaymentTerm_6);
 	}

      
	/**
 	 * Enter Nu_Inv_ReferenceNo_7
     * @name Enter Nu_Inv_ReferenceNo_7
     */
 	public void Enter_Nu_Inv_ReferenceNo_7(String Nu_Inv_ReferenceNo_7)
 	{
 	    
 		WebElement elem = getWebElement(Nu_Inv_ReferenceNo_7Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Nu_Inv_ReferenceNo_7", "Enter_Nu_Inv_ReferenceNo_7 failed. Unable to locate object: " + Nu_Inv_ReferenceNo_7Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Nu_Inv_ReferenceNo_7", "Enter_Nu_Inv_ReferenceNo_7 failed. Unable to locate object: " + Nu_Inv_ReferenceNo_7Elem.toString());

 			Assert.fail("Unable to locate object: " + Nu_Inv_ReferenceNo_7Elem.toString());
         }

 		elem.sendKeys(Nu_Inv_ReferenceNo_7);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Nu_Inv_ReferenceNo_7 " + Nu_Inv_ReferenceNo_7);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Nu_Inv_ReferenceNo_7 " + Nu_Inv_ReferenceNo_7);
 	}

    
	/**
 	 * Select Nu_Inv_Product_8
	 * @throws InterruptedException 
     * @name Select Nu_Inv_Product_8
     */
    public void Select_Nu_Inv_Product_8(String Nu_Inv_Product_8) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(Nu_Inv_Product_8Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Nu_Inv_Product_8", "Select_Nu_Inv_Product_8 failed. Unable to locate object: " + Nu_Inv_Product_8Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Nu_Inv_Product_8", "Select_Nu_Inv_Product_8 failed. Unable to locate object: " + Nu_Inv_Product_8Elem.toString());

 			Assert.fail("Unable to locate object: " + Nu_Inv_Product_8Elem.toString());
         }

 		Select dropdown = new Select(elem);
//
 		dropdown.selectByVisibleText(Nu_Inv_Product_8);
 	//	elem.sendKeys(Keys.ARROW_DOWN);
 		
 	//	Thread.sleep(2000);
 	//	elem.sendKeys(Keys.TAB);
 		ExtentReportManager.passStep(m_Driver, "Select_Nu_Inv_Product_8 " + Nu_Inv_Product_8);

 		TestModellerLogger.PassStep(m_Driver, "Select_Nu_Inv_Product_8 " + Nu_Inv_Product_8);
 	}

      
	/**
 	 * Enter Nu_Inv_Description_8
     * @name Enter Nu_Inv_Description_8
     */
 	public void Enter_Nu_Inv_Description_8(String Nu_Inv_Description_8)
 	{
 	    
 		WebElement elem = getWebElement(Nu_Inv_Description_8Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Nu_Inv_Description_8", "Enter_Nu_Inv_Description_8 failed. Unable to locate object: " + Nu_Inv_Description_8Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Nu_Inv_Description_8", "Enter_Nu_Inv_Description_8 failed. Unable to locate object: " + Nu_Inv_Description_8Elem.toString());

 			Assert.fail("Unable to locate object: " + Nu_Inv_Description_8Elem.toString());
         }

 		elem.sendKeys(Nu_Inv_Description_8);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Nu_Inv_Description_8 " + Nu_Inv_Description_8);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Nu_Inv_Description_8 " + Nu_Inv_Description_8);
 	}

      
	/**
 	 * Enter Nu_Inv_UnitPrice_9
     * @name Enter Nu_Inv_UnitPrice_9
     */
 	public void Enter_Nu_Inv_UnitPrice_9(String Nu_Inv_UnitPrice_9)
 	{
 	    
 		WebElement elem = getWebElement(Nu_Inv_UnitPrice_9Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Nu_Inv_UnitPrice_9", "Enter_Nu_Inv_UnitPrice_9 failed. Unable to locate object: " + Nu_Inv_UnitPrice_9Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Nu_Inv_UnitPrice_9", "Enter_Nu_Inv_UnitPrice_9 failed. Unable to locate object: " + Nu_Inv_UnitPrice_9Elem.toString());

 			Assert.fail("Unable to locate object: " + Nu_Inv_UnitPrice_9Elem.toString());
         }

 		elem.sendKeys(Nu_Inv_UnitPrice_9);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Nu_Inv_UnitPrice_9 " + Nu_Inv_UnitPrice_9);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Nu_Inv_UnitPrice_9 " + Nu_Inv_UnitPrice_9);
 	}

      
	/**
 	 * Enter Nu_Inv_Quantity_10
     * @name Enter Nu_Inv_Quantity_10
     */
 	public void Enter_Nu_Inv_Quantity_10(String Nu_Inv_Quantity_10)
 	{
 	    
 		WebElement elem = getWebElement(Nu_Inv_Quantity_10Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Nu_Inv_Quantity_10", "Enter_Nu_Inv_Quantity_10 failed. Unable to locate object: " + Nu_Inv_Quantity_10Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Nu_Inv_Quantity_10", "Enter_Nu_Inv_Quantity_10 failed. Unable to locate object: " + Nu_Inv_Quantity_10Elem.toString());

 			Assert.fail("Unable to locate object: " + Nu_Inv_Quantity_10Elem.toString());
         }

 		elem.sendKeys(Nu_Inv_Quantity_10);
 		elem.sendKeys(Keys.TAB);
 		WebElement elem2=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrProduct_ctl00_ddVATRate']"));
 		Select dropdown=new Select(elem2);
 		dropdown.selectByVisibleText("Standard Rate");

 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Nu_Inv_Quantity_10 " + Nu_Inv_Quantity_10);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Nu_Inv_Quantity_10 " + Nu_Inv_Quantity_10);
 	}

     
	/**
 	 * Click Nu_Inv_chk_AutoEmail_11
     * @name Click Nu_Inv_chk_AutoEmail_11
     */
	public void Click_Nu_Inv_chk_AutoEmail_11()
	{
        
		WebElement elem = getWebElement(Nu_Inv_chk_AutoEmail_11Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Nu_Inv_chk_AutoEmail_11", "Click_Nu_Inv_chk_AutoEmail_11 failed. Unable to locate object: " + Nu_Inv_chk_AutoEmail_11Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Nu_Inv_chk_AutoEmail_11", "Click_Nu_Inv_chk_AutoEmail_11 failed. Unable to locate object: " + Nu_Inv_chk_AutoEmail_11Elem.toString());

			Assert.fail("Unable to locate object: " + Nu_Inv_chk_AutoEmail_11Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Nu_Inv_chk_AutoEmail_11");

		TestModellerLogger.PassStep(m_Driver, "Click_Nu_Inv_chk_AutoEmail_11");
	}

    
	/**
 	 * Select Nu_Inv_Template_12
     * @name Select Nu_Inv_Template_12
     */
    public void Select_Nu_Inv_Template_12(String Nu_Inv_Template_12)
 	{
 	    
 		WebElement elem = getWebElement(Nu_Inv_Template_12Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Nu_Inv_Template_12", "Select_Nu_Inv_Template_12 failed. Unable to locate object: " + Nu_Inv_Template_12Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Nu_Inv_Template_12", "Select_Nu_Inv_Template_12 failed. Unable to locate object: " + Nu_Inv_Template_12Elem.toString());

 			Assert.fail("Unable to locate object: " + Nu_Inv_Template_12Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Nu_Inv_Template_12);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Nu_Inv_Template_12 " + Nu_Inv_Template_12);

 		TestModellerLogger.PassStep(m_Driver, "Select_Nu_Inv_Template_12 " + Nu_Inv_Template_12);
 	}

      
	/**
 	 * Enter Nu_Inv_Note_13
     * @name Enter Nu_Inv_Note_13
     */
 	public void Enter_Nu_Inv_Note_13(String Nu_Inv_Note_13)
 	{
 	    
 		WebElement elem = getWebElement(Nu_Inv_Note_13Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Nu_Inv_Note_13", "Enter_Nu_Inv_Note_13 failed. Unable to locate object: " + Nu_Inv_Note_13Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Nu_Inv_Note_13", "Enter_Nu_Inv_Note_13 failed. Unable to locate object: " + Nu_Inv_Note_13Elem.toString());

 			Assert.fail("Unable to locate object: " + Nu_Inv_Note_13Elem.toString());
         }

 		elem.sendKeys(Nu_Inv_Note_13);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Nu_Inv_Note_13 " + Nu_Inv_Note_13);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Nu_Inv_Note_13 " + Nu_Inv_Note_13);
 	}

      
	/**
 	 * Enter Nu_Inv_FileUpload1_14
     * @name Enter Nu_Inv_FileUpload1_14
     */
 	public void Enter_Nu_Inv_FileUpload1_14(String Nu_Inv_FileUpload1_14)
 	{
 	    
 		WebElement elem = getWebElement(Nu_Inv_FileUpload1_14Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Nu_Inv_FileUpload1_14", "Enter_Nu_Inv_FileUpload1_14 failed. Unable to locate object: " + Nu_Inv_FileUpload1_14Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Nu_Inv_FileUpload1_14", "Enter_Nu_Inv_FileUpload1_14 failed. Unable to locate object: " + Nu_Inv_FileUpload1_14Elem.toString());

 			Assert.fail("Unable to locate object: " + Nu_Inv_FileUpload1_14Elem.toString());
         }

 		elem.sendKeys(Nu_Inv_FileUpload1_14);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Nu_Inv_FileUpload1_14 " + Nu_Inv_FileUpload1_14);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Nu_Inv_FileUpload1_14 " + Nu_Inv_FileUpload1_14);
 	}

     
	/**
 	 * Click Nu_Inv_ Save _15
	 * @throws InterruptedException 
     * @name Click Nu_Inv_ Save _15
     */
	public void Click_Nu_Inv__Save__15() throws InterruptedException
	{
        
//		WebElement elem = getWebElement(Nu_Inv__Save__15Elem);
//
//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Nu_Inv__Save__15", "Click_Nu_Inv__Save__15 failed. Unable to locate object: " + Nu_Inv__Save__15Elem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Nu_Inv__Save__15", "Click_Nu_Inv__Save__15 failed. Unable to locate object: " + Nu_Inv__Save__15Elem.toString());
//
//			Assert.fail("Unable to locate object: " + Nu_Inv__Save__15Elem.toString());
//        }

		//elem.click();
		WebElement savebtn=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cpHFooter_btnPreviewOnsave']")));
		
		JavascriptExecutor jse = (JavascriptExecutor)m_Driver;
		jse.executeScript("arguments[0].click()", savebtn);
	Thread.sleep(1000);
//
//		ExtentReportManager.passStep(m_Driver, "Click_Nu_Inv__Save__15");
//
//		TestModellerLogger.PassStep(m_Driver, "Click_Nu_Inv__Save__15");
	}

     
	/**
 	 * Click Nu_Inv_Cancel_15
     * @name Click Nu_Inv_Cancel_15
     */
	public void Click_Nu_Inv_Savepopup()
	{
//        
//		WebElement elem = getWebElement(Nu_Inv_Cancel_15Elem);
//
//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Nu_Inv_Cancel_15", "Click_Nu_Inv_Cancel_15 failed. Unable to locate object: " + Nu_Inv_Cancel_15Elem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Nu_Inv_Cancel_15", "Click_Nu_Inv_Cancel_15 failed. Unable to locate object: " + Nu_Inv_Cancel_15Elem.toString());
//
//			Assert.fail("Unable to locate object: " + Nu_Inv_Cancel_15Elem.toString());
//        }
//
//		elem.click();
//          	
//
//		ExtentReportManager.passStep(m_Driver, "Click_Nu_Inv_Cancel_15");
//
//		TestModellerLogger.PassStep(m_Driver, "Click_Nu_Inv_Cancel_15");
		WebElement savebtnpopup=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cphError_btnSaveinvoice']")));
		savebtnpopup.click();
		//m_Driver.findElement(By.xpath("//*[@id='ctl00_cphError_btnSaveinvoice']")).click();
	}

     
	/**
 	 * Click Nu_Inv_ RecalLastEntry _16
     * @name Click Nu_Inv_ RecalLastEntry _16
     */
	public void Click_Nu_Inv__RecalLastEntry__16()
	{
        
		WebElement elem = getWebElement(Nu_Inv__RecalLastEntry__16Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Nu_Inv__RecalLastEntry__16", "Click_Nu_Inv__RecalLastEntry__16 failed. Unable to locate object: " + Nu_Inv__RecalLastEntry__16Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Nu_Inv__RecalLastEntry__16", "Click_Nu_Inv__RecalLastEntry__16 failed. Unable to locate object: " + Nu_Inv__RecalLastEntry__16Elem.toString());

			Assert.fail("Unable to locate object: " + Nu_Inv__RecalLastEntry__16Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Nu_Inv__RecalLastEntry__16");

		TestModellerLogger.PassStep(m_Driver, "Click_Nu_Inv__RecalLastEntry__16");
	}

      
	/**
 	 * Enter Credit_note_ReferenceNo1
     * @name Enter Credit_note_ReferenceNo1
     */
 	public void Enter_Credit_note_ReferenceNo1(String Credit_note_ReferenceNo1)
 	{
 	    
 		WebElement elem = getWebElement(Credit_note_ReferenceNo1Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Credit_note_ReferenceNo1", "Enter_Credit_note_ReferenceNo1 failed. Unable to locate object: " + Credit_note_ReferenceNo1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Credit_note_ReferenceNo1", "Enter_Credit_note_ReferenceNo1 failed. Unable to locate object: " + Credit_note_ReferenceNo1Elem.toString());

 			Assert.fail("Unable to locate object: " + Credit_note_ReferenceNo1Elem.toString());
         }

 		elem.sendKeys(Credit_note_ReferenceNo1);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Credit_note_ReferenceNo1 " + Credit_note_ReferenceNo1);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Credit_note_ReferenceNo1 " + Credit_note_ReferenceNo1);
 	}

      
	/**
 	 * Enter Credit_note_Description_2
     * @name Enter Credit_note_Description_2
     */
 	public void Enter_Credit_note_Description_2(String Credit_note_Description_2)
 	{
 	    
 		WebElement elem = getWebElement(Credit_note_Description_2Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Credit_note_Description_2", "Enter_Credit_note_Description_2 failed. Unable to locate object: " + Credit_note_Description_2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Credit_note_Description_2", "Enter_Credit_note_Description_2 failed. Unable to locate object: " + Credit_note_Description_2Elem.toString());

 			Assert.fail("Unable to locate object: " + Credit_note_Description_2Elem.toString());
         }

 		elem.sendKeys(Credit_note_Description_2);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Credit_note_Description_2 " + Credit_note_Description_2);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Credit_note_Description_2 " + Credit_note_Description_2);
 	}

    
	/**
 	 * Select Credit_note_InvoiceTemplate_3
     * @name Select Credit_note_InvoiceTemplate_3
     */
    public void Select_Credit_note_InvoiceTemplate_3(String Credit_note_InvoiceTemplate_3)
 	{
 	    
 		WebElement elem = getWebElement(Credit_note_InvoiceTemplate_3Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Credit_note_InvoiceTemplate_3", "Select_Credit_note_InvoiceTemplate_3 failed. Unable to locate object: " + Credit_note_InvoiceTemplate_3Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Credit_note_InvoiceTemplate_3", "Select_Credit_note_InvoiceTemplate_3 failed. Unable to locate object: " + Credit_note_InvoiceTemplate_3Elem.toString());

 			Assert.fail("Unable to locate object: " + Credit_note_InvoiceTemplate_3Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Credit_note_InvoiceTemplate_3);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Credit_note_InvoiceTemplate_3 " + Credit_note_InvoiceTemplate_3);

 		TestModellerLogger.PassStep(m_Driver, "Select_Credit_note_InvoiceTemplate_3 " + Credit_note_InvoiceTemplate_3);
 	}

      
	/**
 	 * Enter Credit_note_txtNote_4
     * @name Enter Credit_note_txtNote_4
     */
 	public void Enter_Credit_note_txtNote_4(String Credit_note_txtNote_4)
 	{
 	    
 		WebElement elem = getWebElement(Credit_note_txtNote_4Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Credit_note_txtNote_4", "Enter_Credit_note_txtNote_4 failed. Unable to locate object: " + Credit_note_txtNote_4Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Credit_note_txtNote_4", "Enter_Credit_note_txtNote_4 failed. Unable to locate object: " + Credit_note_txtNote_4Elem.toString());

 			Assert.fail("Unable to locate object: " + Credit_note_txtNote_4Elem.toString());
         }

 		elem.sendKeys(Credit_note_txtNote_4);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Credit_note_txtNote_4 " + Credit_note_txtNote_4);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Credit_note_txtNote_4 " + Credit_note_txtNote_4);
 	}

      
	/**
 	 * Enter Credit_note_FileUpload1_5
     * @name Enter Credit_note_FileUpload1_5
     */
 	public void Enter_Credit_note_FileUpload1_5(String Credit_note_FileUpload1_5)
 	{
 	    
 		WebElement elem = getWebElement(Credit_note_FileUpload1_5Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Credit_note_FileUpload1_5", "Enter_Credit_note_FileUpload1_5 failed. Unable to locate object: " + Credit_note_FileUpload1_5Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Credit_note_FileUpload1_5", "Enter_Credit_note_FileUpload1_5 failed. Unable to locate object: " + Credit_note_FileUpload1_5Elem.toString());

 			Assert.fail("Unable to locate object: " + Credit_note_FileUpload1_5Elem.toString());
         }

 		elem.sendKeys(Credit_note_FileUpload1_5);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Credit_note_FileUpload1_5 " + Credit_note_FileUpload1_5);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Credit_note_FileUpload1_5 " + Credit_note_FileUpload1_5);
 	}

    
	/**
 	 * Select Vat_only_inovice_Customer_1
     * @name Select Vat_only_inovice_Customer_1
     */
 public void Select_Vat_only_inovice_Customer_1(String Vat_only_inovice_Customer_1)
 	
 	{
 	    
 		WebElement elem = getWebElement(Vat_only_inovice_Customer_1Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Vat_only_inovice_Customer_1", "Select_Vat_only_inovice_Customer_1 failed. Unable to locate object: " + Vat_only_inovice_Customer_1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Vat_only_inovice_Customer_1", "Select_Vat_only_inovice_Customer_1 failed. Unable to locate object: " + Vat_only_inovice_Customer_1Elem.toString());

 			Assert.fail("Unable to locate object: " + Vat_only_inovice_Customer_1Elem.toString());
         }

	Select dropdown = new Select(elem);

	dropdown.selectByVisibleText(Vat_only_inovice_Customer_1);
		
		
 		ExtentReportManager.passStep(m_Driver, "Select_Vat_only_inovice_Customer_1 " + Vat_only_inovice_Customer_1);

 		TestModellerLogger.PassStep(m_Driver, "Select_Vat_only_inovice_Customer_1 " + Vat_only_inovice_Customer_1);
 	}

      
	/**
 	 * Enter Vat_only_inovice_nvoiceNo_2
     * @name Enter Vat_only_inovice_nvoiceNo_2
     */
 	//public void Enter_Vat_only_inovice_nvoiceNo_2(String Vat_only_inovice_nvoiceNo_2)
 public void Enter_Vat_only_inovice_nvoiceNo_2()
 	{
 	    
 		WebElement elem = getWebElement(Vat_only_inovice_nvoiceNo_2Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Vat_only_inovice_nvoiceNo_2", "Enter_Vat_only_inovice_nvoiceNo_2 failed. Unable to locate object: " + Vat_only_inovice_nvoiceNo_2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Vat_only_inovice_nvoiceNo_2", "Enter_Vat_only_inovice_nvoiceNo_2 failed. Unable to locate object: " + Vat_only_inovice_nvoiceNo_2Elem.toString());

 			Assert.fail("Unable to locate object: " + Vat_only_inovice_nvoiceNo_2Elem.toString());
         }

 	
 		vatonlyinvoic=elem.getAttribute("value");
 		System.out.println("vatonly invoice number is =" +vatonlyinvoic);
 		elem.sendKeys(Keys.TAB);
 		
  		//ExtentReportManager.passStep(m_Driver, "Enter_Vat_only_inovice_nvoiceNo_2 " + Vat_only_inovice_nvoiceNo_2);

  		//TestModellerLogger.PassStep(m_Driver, "Enter_Vat_only_inovice_nvoiceNo_2 " + Vat_only_inovice_nvoiceNo_2);
 	}
public String vatonlyinvoicereturn()

{
	System.out.println("vatonly returned invoice number is =" +vatonlyinvoic);
	
	return vatonlyinvoic;
}
      
	/**
 	 * Enter Vat_only_inovice_nvoiceDate_3
     * @name Enter Vat_only_inovice_nvoiceDate_3
     */
 	public void Enter_Vat_only_inovice_nvoiceDate_3(String Vat_only_inovice_nvoiceDate_3)
 	{
 	    
 		WebElement elem = getWebElement(Vat_only_inovice_nvoiceDate_3Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Vat_only_inovice_nvoiceDate_3", "Enter_Vat_only_inovice_nvoiceDate_3 failed. Unable to locate object: " + Vat_only_inovice_nvoiceDate_3Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Vat_only_inovice_nvoiceDate_3", "Enter_Vat_only_inovice_nvoiceDate_3 failed. Unable to locate object: " + Vat_only_inovice_nvoiceDate_3Elem.toString());

 			Assert.fail("Unable to locate object: " + Vat_only_inovice_nvoiceDate_3Elem.toString());
         }

 		elem.sendKeys(Vat_only_inovice_nvoiceDate_3);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Vat_only_inovice_nvoiceDate_3 " + Vat_only_inovice_nvoiceDate_3);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Vat_only_inovice_nvoiceDate_3 " + Vat_only_inovice_nvoiceDate_3);
 	}

      
	/**
 	 * Enter Vat_only_inovice_SubTotal_4
	 * @throws InterruptedException 
     * @name Enter Vat_only_inovice_SubTotal_4
     */
 	public void Enter_Vat_only_inovice_SubTotal_4(String Vat_only_inovice_SubTotal_4) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(Vat_only_inovice_SubTotal_4Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Vat_only_inovice_SubTotal_4", "Enter_Vat_only_inovice_SubTotal_4 failed. Unable to locate object: " + Vat_only_inovice_SubTotal_4Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Vat_only_inovice_SubTotal_4", "Enter_Vat_only_inovice_SubTotal_4 failed. Unable to locate object: " + Vat_only_inovice_SubTotal_4Elem.toString());

 			Assert.fail("Unable to locate object: " + Vat_only_inovice_SubTotal_4Elem.toString());
         }

 		
 		elem.sendKeys(Vat_only_inovice_SubTotal_4);
 		Thread.sleep(4000);
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Vat_only_inovice_SubTotal_4 " + Vat_only_inovice_SubTotal_4);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Vat_only_inovice_SubTotal_4 " + Vat_only_inovice_SubTotal_4);
 	}

    
	/**
 	 * Select Vat_only_inovice_VATRate_5
     * @name Select Vat_only_inovice_VATRate_5
     */
    public void Select_Vat_only_inovice_VATRate_5(String Vat_only_inovice_VATRate_5)
 	{
 	    
 		WebElement elem = getWebElement(Vat_only_inovice_VATRate_5Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Vat_only_inovice_VATRate_5", "Select_Vat_only_inovice_VATRate_5 failed. Unable to locate object: " + Vat_only_inovice_VATRate_5Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Vat_only_inovice_VATRate_5", "Select_Vat_only_inovice_VATRate_5 failed. Unable to locate object: " + Vat_only_inovice_VATRate_5Elem.toString());

 			Assert.fail("Unable to locate object: " + Vat_only_inovice_VATRate_5Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Vat_only_inovice_VATRate_5);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Vat_only_inovice_VATRate_5 " + Vat_only_inovice_VATRate_5);

 		TestModellerLogger.PassStep(m_Driver, "Select_Vat_only_inovice_VATRate_5 " + Vat_only_inovice_VATRate_5);
 	}

      
	/**
 	 * Enter Vat_only_inovice_VAT_6
     * @name Enter Vat_only_inovice_VAT_6
     */
 	public void Enter_Vat_only_inovice_VAT_6(String Vat_only_inovice_VAT_6)
 	{
 	    
 		WebElement elem = getWebElement(Vat_only_inovice_VAT_6Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Vat_only_inovice_VAT_6", "Enter_Vat_only_inovice_VAT_6 failed. Unable to locate object: " + Vat_only_inovice_VAT_6Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Vat_only_inovice_VAT_6", "Enter_Vat_only_inovice_VAT_6 failed. Unable to locate object: " + Vat_only_inovice_VAT_6Elem.toString());

 			Assert.fail("Unable to locate object: " + Vat_only_inovice_VAT_6Elem.toString());
         }

 		elem.sendKeys(Vat_only_inovice_VAT_6);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Vat_only_inovice_VAT_6 " + Vat_only_inovice_VAT_6);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Vat_only_inovice_VAT_6 " + Vat_only_inovice_VAT_6);
 	}

      
	/**
 	 * Enter Vat_only_inovice_NetTotal_7
     * @name Enter Vat_only_inovice_NetTotal_7
     */
 	public void Enter_Vat_only_inovice_NetTotal_7(String Vat_only_inovice_NetTotal_7)
 	{
 	    
 		WebElement elem = getWebElement(Vat_only_inovice_NetTotal_7Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Vat_only_inovice_NetTotal_7", "Enter_Vat_only_inovice_NetTotal_7 failed. Unable to locate object: " + Vat_only_inovice_NetTotal_7Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Vat_only_inovice_NetTotal_7", "Enter_Vat_only_inovice_NetTotal_7 failed. Unable to locate object: " + Vat_only_inovice_NetTotal_7Elem.toString());

 			Assert.fail("Unable to locate object: " + Vat_only_inovice_NetTotal_7Elem.toString());
         }

 		elem.sendKeys(Vat_only_inovice_NetTotal_7);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Vat_only_inovice_NetTotal_7 " + Vat_only_inovice_NetTotal_7);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Vat_only_inovice_NetTotal_7 " + Vat_only_inovice_NetTotal_7);
 	}

      
	/**
 	 * Enter Vat_only_inovice_NetTotal_8
     * @name Enter Vat_only_inovice_NetTotal_8
     */
 	public void Enter_Vat_only_inovice_NetTotal_8(String Vat_only_inovice_NetTotal_8)
 	{
 	    
 		WebElement elem = getWebElement(Vat_only_inovice_NetTotal_8Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Vat_only_inovice_NetTotal_8", "Enter_Vat_only_inovice_NetTotal_8 failed. Unable to locate object: " + Vat_only_inovice_NetTotal_8Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Vat_only_inovice_NetTotal_8", "Enter_Vat_only_inovice_NetTotal_8 failed. Unable to locate object: " + Vat_only_inovice_NetTotal_8Elem.toString());

 			Assert.fail("Unable to locate object: " + Vat_only_inovice_NetTotal_8Elem.toString());
         }

 		elem.sendKeys(Vat_only_inovice_NetTotal_8);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Vat_only_inovice_NetTotal_8 " + Vat_only_inovice_NetTotal_8);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Vat_only_inovice_NetTotal_8 " + Vat_only_inovice_NetTotal_8);
 	}

    
	/**
 	 * Select Vat_only_inovice_Bank_9
     * @name Select Vat_only_inovice_Bank_9
     */
    public void Select_Vat_only_inovice_Bank_9(String Vat_only_inovice_Bank_9)
 	{
 	    
 		WebElement elem = getWebElement(Vat_only_inovice_Bank_9Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Vat_only_inovice_Bank_9", "Select_Vat_only_inovice_Bank_9 failed. Unable to locate object: " + Vat_only_inovice_Bank_9Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Vat_only_inovice_Bank_9", "Select_Vat_only_inovice_Bank_9 failed. Unable to locate object: " + Vat_only_inovice_Bank_9Elem.toString());

 			Assert.fail("Unable to locate object: " + Vat_only_inovice_Bank_9Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Vat_only_inovice_Bank_9);
 		elem.sendKeys(Keys.TAB);
 		elem.sendKeys(Keys.TAB);
 		elem.sendKeys(Keys.TAB);
 	
 	
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Vat_only_inovice_Bank_9 " + Vat_only_inovice_Bank_9);

 		TestModellerLogger.PassStep(m_Driver, "Select_Vat_only_inovice_Bank_9 " + Vat_only_inovice_Bank_9);
 	}

      
	/**
 	 * Enter Vat_only_inovice_PaymentTerm_10
     * @name Enter Vat_only_inovice_PaymentTerm_10
     */
 	public void Enter_Vat_only_inovice_PaymentTerm_10(String Vat_only_inovice_PaymentTerm_10)
 	{
 	    
 		WebElement elem = getWebElement(Vat_only_inovice_PaymentTerm_10Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Vat_only_inovice_PaymentTerm_10", "Enter_Vat_only_inovice_PaymentTerm_10 failed. Unable to locate object: " + Vat_only_inovice_PaymentTerm_10Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Vat_only_inovice_PaymentTerm_10", "Enter_Vat_only_inovice_PaymentTerm_10 failed. Unable to locate object: " + Vat_only_inovice_PaymentTerm_10Elem.toString());

 			Assert.fail("Unable to locate object: " + Vat_only_inovice_PaymentTerm_10Elem.toString());
         }

 		elem.sendKeys(Vat_only_inovice_PaymentTerm_10);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Vat_only_inovice_PaymentTerm_10 " + Vat_only_inovice_PaymentTerm_10);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Vat_only_inovice_PaymentTerm_10 " + Vat_only_inovice_PaymentTerm_10);
 	}

      
	/**
 	 * Enter Vat_only_inovice_Note_11
     * @name Enter Vat_only_inovice_Note_11
     */
 	public void Enter_Vat_only_inovice_Note_11(String Vat_only_inovice_Note_11)
 	{
 	    
 		WebElement elem = getWebElement(Vat_only_inovice_Note_11Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Vat_only_inovice_Note_11", "Enter_Vat_only_inovice_Note_11 failed. Unable to locate object: " + Vat_only_inovice_Note_11Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Vat_only_inovice_Note_11", "Enter_Vat_only_inovice_Note_11 failed. Unable to locate object: " + Vat_only_inovice_Note_11Elem.toString());

 			Assert.fail("Unable to locate object: " + Vat_only_inovice_Note_11Elem.toString());
         }

 		elem.sendKeys(Vat_only_inovice_Note_11);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Vat_only_inovice_Note_11 " + Vat_only_inovice_Note_11);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Vat_only_inovice_Note_11 " + Vat_only_inovice_Note_11);
 	}

    
	/**
 	 * Select Vat_only_inovice_Template_12
     * @name Select Vat_only_inovice_Template_12
     */
    public void Select_Vat_only_inovice_Template_12(String Vat_only_inovice_Template_12)
 	{
 	    
 		WebElement elem = getWebElement(Vat_only_inovice_Template_12Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Vat_only_inovice_Template_12", "Select_Vat_only_inovice_Template_12 failed. Unable to locate object: " + Vat_only_inovice_Template_12Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Vat_only_inovice_Template_12", "Select_Vat_only_inovice_Template_12 failed. Unable to locate object: " + Vat_only_inovice_Template_12Elem.toString());

 			Assert.fail("Unable to locate object: " + Vat_only_inovice_Template_12Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Vat_only_inovice_Template_12);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Vat_only_inovice_Template_12 " + Vat_only_inovice_Template_12);

 		TestModellerLogger.PassStep(m_Driver, "Select_Vat_only_inovice_Template_12 " + Vat_only_inovice_Template_12);
 	}
    
    
    public void confirmationmsg()
    {
    	String msg=m_Driver.findElement(By.xpath("//DIV[@class='alert alert-success el-selection']")).getText();
    	System.out.println("confirmation message" +msg);
    	String k[]=msg.split(" ");
    		     String stn=k[3];
	      ///krno2=stn.substring(1);
    	System.out.println("Confirmation" +stn);
    	
    	//DIV[@class='alert alert-success el-selection']
    	
    	
    	
    }
    public void Enter_Creditno()throws InterruptedException

 	{
    	
    	WebElement elem=m_Driver.findElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[5]/div[1]/div/div/div/div/div/div[1]/div/div[5]/div/input"));
 	   
 Creditno=elem.getAttribute("value");
 
 			elem.sendKeys(Keys.TAB);
 		System.out.print("String invoice number :   " +Creditno);
 		
 	}
    public String creditnum_capture()
    {
    	System.out.print("Returned credit number");
    	
    	return Creditno;
    }
    
    
 	public void Enter_Crediit_UnitPrice_9(String credit_UnitPrice)
 	{
 	    
 		WebElement elem = m_Driver.findElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[5]/div[2]/div[1]/div[1]/div/div/div/div/table/tbody[2]/tr[1]/td[4]/input"));
 		
 		elem.sendKeys(credit_UnitPrice);
 		elem.sendKeys(Keys.TAB);
 	}
 	public void Enter_Credit_Quantity_10(String credit_Quantity) throws InterruptedException
 	{
 	    
 		WebElement elem = m_Driver.findElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[5]/div[2]/div[1]/div[1]/div/div/div/div/table/tbody[2]/tr[1]/td[5]/input"));
 		
 		elem.sendKeys(credit_Quantity);
 	//	Thread.sleep(3000);
 		elem.sendKeys(Keys.TAB);
 		WebElement elem2=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrProduct_ctl00_ddVATRate']"));
 		Select dropdown=new Select(elem2);
 		dropdown.selectByVisibleText("Standard Rate");
 		
 		//m_Driver.findElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[6]/div/div/div/a[1]"));
 	}
 	public void Enter_Credit_invoicenumber(String crinvoice) throws InterruptedException
 	{
 	    
 		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrProduct_ctl00_txtInvoiceNo']"));
 		
 		elem.sendKeys("crinvoice");
 	//	Thread.sleep(2000);
 		elem.sendKeys(Keys.TAB);
  	
 	}
 	
	public void Enter_Credit_Desc(String Desc) throws InterruptedException
 	{
 	    
 		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrProduct_ctl00_txtDescription']"));
 		
 		elem.sendKeys("Desc");
 //		Thread.sleep(3000);
 		elem.sendKeys(Keys.TAB);
  	
 	}
	
	public void Click_Credit__Save() throws InterruptedException
	{
        

	WebElement savebtn=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[6]/div/div/div/a[1]")));
		//WebElement savebtn=m_Driver.findElement(By.xpath("//*[@id='ctl00_cpHFooter_btnPreviewOnsave']"));
		
		JavascriptExecutor jse = (JavascriptExecutor)m_Driver;
		jsExec.executeScript("arguments[0].click()", savebtn);
Thread.sleep(1000);
	}

     
	/**
 	 * Click Nu_Inv_Cancel_15
     * @name Click Nu_Inv_Cancel_15
     */
	public void Click_Credit_Savepopup()
	{
		WebElement savebtnpopup=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cphError_btnSaveinvoice']")));
		//WebElement savebtnpopup=m_Driver.findElement(By.xpath("//*[@id='ctl00_cphError_btnSaveinvoice']"));
		//savebtnpopup.click();
		jsExec.executeScript("arguments[0].click()", savebtnpopup);
	
	}

	public void Click_vatonlyinvoice_Save_15() throws InterruptedException
	{

		WebElement savebtn2=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[5]/div/div/div[2]/a[1]")));
//		savebtn2.click();

	jsExec.executeScript("arguments[0].click()", savebtn2);
	Thread.sleep(1000);

	}
	
	
 	
}