package pages.banking.ashiv;

import pages.BasePage;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import java.awt.Image;
import java.io.File;
import java.util.List;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;

import com.mongodb.MapReduceCommand.OutputType;
import com.mongodb.util.Util;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.ScreenShot;
import utilities.Screenshotcapture;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/f6b1118a-3b66-4df2-bf05-e543b783157f
@TestModellerModule(guid = "f6b1118a-3b66-4df2-bf05-e543b783157f")
public class Repeat_Invoice extends BasePage
{
	public Repeat_Invoice (WebDriver driver)
	{
		super(driver);
	}


	
	private By View_1Elem = By.xpath("//*[@id='ctl00_divMainContent']/header/div/div[3]/a");

	private By Repeat_Invoice_2Elem = By.xpath("//A[@id='ctl00_cpHeaderRight_btnViewRepeatInvoice']");

	private By Add_Repeat_Invoice_3Elem = By.xpath("//A[@id='ctl00_cpHeaderRight_btnAdd']");

	private By Select_Customer_4Elem = By.xpath("//label[normalize-space()= 'Customer']/../../../div[2]/div/select");

	private By EnterStartDate5Elem = By.xpath("//INPUT[@name='ctl00$cPH$txtStartDt']");

	private By EnterEndDt6Elem = By.xpath("//INPUT[@name='ctl00$cPH$txtEndDt']");

	private By Select_IncomeType_7Elem = By.xpath("//SELECT[@name='ctl00$cPH$rptrProduct$ctl00$ddProduct']");

	private By Enter_Description_8Elem = By.xpath("//*[@id='ctl00_cPH_rptrProduct_ctl00_txtDescription']");

	private By EnterUnitPrice9Elem = By.xpath("//INPUT[@name='ctl00$cPH$rptrProduct$ctl00$txtUnitPrice']");

	private By EnterQuantity10Elem = By.xpath("//INPUT[@name='ctl00$cPH$rptrProduct$ctl00$txtQuantity']");

	private By SelectVATRate11Elem = By.xpath("//SELECT[@name='ctl00$cPH$rptrProduct$ctl00$ddVATRate']");

	private By Advance_12Elem = By.xpath("//A[@id='toentry']");

	private By SelectBank_13Elem = By.xpath("//label[normalize-space()= 'Bank']/../../div[2]/div/select");

	private By EnterPaymentTerm14Elem = By.xpath("//label[normalize-space()= 'Payment Terms']/../../div[2]/input");

	private By EnterdueDays15Elem = By.xpath("//label[normalize-space()= 'Due in (No.of Days)']/../../div[2]/input");

	private By SelectFrequency16Elem = By.xpath("//label[normalize-space()= 'Frequency']/../../div[2]/select");

	private By EnterTotalOccurance17Elem = By.xpath("//label[normalize-space()= 'Total Occurrance *']/../../div[2]/input");

	private By SelectInvoiceTemplate18Elem = By.xpath("//label[normalize-space()= 'Template']/../../div[2]/div/select");

	private By Click_AutoEmail_19Elem = By.xpath("//label[normalize-space()= 'Auto Email']/../../div[2]/input");

	private By Click_NonVATInvoice_20Elem = By.xpath("//label[normalize-space()= 'Non VAT Invoice']/../../div[2]/input");

	private By Click_AutoProcess_21Elem = By.xpath("//label[normalize-space()= 'Auto Process']/../../div[2]/input");

	private By Save_22Elem = By.xpath("//A[@id='ctl00_cPH_btnSave']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AccountUI/RecurringInvoiceEditor.aspx?FYCode=117652&CompanyCode=17315&id=0&action=Add&it=I");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/RecurringInvoiceEditor.aspx?FYCode=117652&CompanyCode=17315&id=0&action=Add&it=I");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/RecurringInvoiceEditor.aspx?FYCode=117652&CompanyCode=17315&id=0&action=Add&it=I");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/AccountUI/RecurringInvoiceEditor.aspx?FYCode=117652&CompanyCode=17315&id=0&action=Add&it=I";

        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/AccountUI/RecurringInvoiceEditor.aspx?FYCode=117652&CompanyCode=17315&id=0&action=Add&it=I")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click View 1
     * @name Click View 1
     */
	public void Click_View_1()
	{
        
		WebElement elem = getWebElement(View_1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_View_1", "Click_View_1 failed. Unable to locate object: " + View_1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_View_1", "Click_View_1 failed. Unable to locate object: " + View_1Elem.toString());

			Assert.fail("Unable to locate object: " + View_1Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_View_1");

		TestModellerLogger.PassStep(m_Driver, "Click_View_1");
	}

     
	/**
 	 * Click Repeat Invoice 2
     * @name Click Repeat Invoice 2
     */
	public void Click_Repeat_Invoice_2()
	{
        
		WebElement elem = getWebElement(Repeat_Invoice_2Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Repeat_Invoice_2", "Click_Repeat_Invoice_2 failed. Unable to locate object: " + Repeat_Invoice_2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Repeat_Invoice_2", "Click_Repeat_Invoice_2 failed. Unable to locate object: " + Repeat_Invoice_2Elem.toString());

			Assert.fail("Unable to locate object: " + Repeat_Invoice_2Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Repeat_Invoice_2");

		TestModellerLogger.PassStep(m_Driver, "Click_Repeat_Invoice_2");
	}

     
	/**
 	 * Click Add Repeat Invoice 3
     * @name Click Add Repeat Invoice 3
     */
	public void Click_Add_Repeat_Invoice_3()
	{
        
		WebElement elem = getWebElement(Add_Repeat_Invoice_3Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Add_Repeat_Invoice_3", "Click_Add_Repeat_Invoice_3 failed. Unable to locate object: " + Add_Repeat_Invoice_3Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Add_Repeat_Invoice_3", "Click_Add_Repeat_Invoice_3 failed. Unable to locate object: " + Add_Repeat_Invoice_3Elem.toString());

			Assert.fail("Unable to locate object: " + Add_Repeat_Invoice_3Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Add_Repeat_Invoice_3");

		TestModellerLogger.PassStep(m_Driver, "Click_Add_Repeat_Invoice_3");
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
 	 * Enter EnterStartDate5
	 * @throws InterruptedException 
     * @name Enter EnterStartDate5
     */
 	public void Enter_EnterStartDate5(String EnterStartDate5) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(EnterStartDate5Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_EnterStartDate5", "Enter_EnterStartDate5 failed. Unable to locate object: " + EnterStartDate5Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_EnterStartDate5", "Enter_EnterStartDate5 failed. Unable to locate object: " + EnterStartDate5Elem.toString());

 			Assert.fail("Unable to locate object: " + EnterStartDate5Elem.toString());
         }

 		elem.sendKeys(EnterStartDate5);
 	elem.sendKeys(Keys.TAB);
 		 Thread.sleep(2000);
  		ExtentReportManager.passStep(m_Driver, "Enter_EnterStartDate5 " + EnterStartDate5);

  		TestModellerLogger.PassStep(m_Driver, "Enter_EnterStartDate5 " + EnterStartDate5);
 	}

      
	/**
 	 * Enter EnterEndDt6
	 * @throws InterruptedException 
     * @name Enter EnterEndDt6
     */
 	public void Enter_EnterEndDt6(String EnterEndDt6) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(EnterEndDt6Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_EnterEndDt6", "Enter_EnterEndDt6 failed. Unable to locate object: " + EnterEndDt6Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_EnterEndDt6", "Enter_EnterEndDt6 failed. Unable to locate object: " + EnterEndDt6Elem.toString());

 			Assert.fail("Unable to locate object: " + EnterEndDt6Elem.toString());
         }
 		
        
 		for(int i=0;i<=9;i++)
 		{
			m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_txtEndDt']")).sendKeys(Keys.BACK_SPACE);
 		}
 		elem.sendKeys(EnterEndDt6);
 		  Thread.sleep(2000);
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_EnterEndDt6 " + EnterEndDt6);

  		TestModellerLogger.PassStep(m_Driver, "Enter_EnterEndDt6 " + EnterEndDt6);
 	}

    
	/**
 	 * Select Select IncomeType 7
     * @name Select Select IncomeType 7
     */
    public void Select_Select_IncomeType_7(String Select_IncomeType_7)
 	{
 	    
 		WebElement elem = getWebElement(Select_IncomeType_7Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Select_IncomeType_7", "Select_Select_IncomeType_7 failed. Unable to locate object: " + Select_IncomeType_7Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Select_IncomeType_7", "Select_Select_IncomeType_7 failed. Unable to locate object: " + Select_IncomeType_7Elem.toString());

 			Assert.fail("Unable to locate object: " + Select_IncomeType_7Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Select_IncomeType_7);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Select_IncomeType_7 " + Select_IncomeType_7);

 		TestModellerLogger.PassStep(m_Driver, "Select_Select_IncomeType_7 " + Select_IncomeType_7);
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
 		elem.sendKeys(Keys.TAB);
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_Description_8 " + Enter_Description_8);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_Description_8 " + Enter_Description_8);
 	}

      
	/**
 	 * Enter EnterUnitPrice9
     * @name Enter EnterUnitPrice9
     */
 	public void Enter_EnterUnitPrice9(String EnterUnitPrice9)
 	{
 	    
 		WebElement elem = getWebElement(EnterUnitPrice9Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_EnterUnitPrice9", "Enter_EnterUnitPrice9 failed. Unable to locate object: " + EnterUnitPrice9Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_EnterUnitPrice9", "Enter_EnterUnitPrice9 failed. Unable to locate object: " + EnterUnitPrice9Elem.toString());

 			Assert.fail("Unable to locate object: " + EnterUnitPrice9Elem.toString());
         }
         elem.clear();
 		elem.sendKeys(EnterUnitPrice9);
 		elem.sendKeys(Keys.TAB);
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_EnterUnitPrice9 " + EnterUnitPrice9);

  		TestModellerLogger.PassStep(m_Driver, "Enter_EnterUnitPrice9 " + EnterUnitPrice9);
 	}

      
	/**
 	 * Enter EnterQuantity10
     * @name Enter EnterQuantity10
     */
 	public void Enter_EnterQuantity10(String EnterQuantity10)
 	{
 	    
 		WebElement elem = getWebElement(EnterQuantity10Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_EnterQuantity10", "Enter_EnterQuantity10 failed. Unable to locate object: " + EnterQuantity10Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_EnterQuantity10", "Enter_EnterQuantity10 failed. Unable to locate object: " + EnterQuantity10Elem.toString());

 			Assert.fail("Unable to locate object: " + EnterQuantity10Elem.toString());
         }
 		 elem.clear();
 		elem.sendKeys(EnterQuantity10);
 		//elem.sendKeys(Keys.TAB);
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_EnterQuantity10 " + EnterQuantity10);

  		TestModellerLogger.PassStep(m_Driver, "Enter_EnterQuantity10 " + EnterQuantity10);
 	}

    
 	public void Discount(String Discount)
 	{
 		m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrProduct_ctl00_txtDiscountRate']")).sendKeys(Discount);
 		
 	}
	/**
 	 * Select SelectVATRate11
     * @name Select SelectVATRate11
     */
    public void Select_SelectVATRate11(String SelectVATRate11)
 	{
 	    
 		WebElement elem = getWebElement(SelectVATRate11Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_SelectVATRate11", "Select_SelectVATRate11 failed. Unable to locate object: " + SelectVATRate11Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_SelectVATRate11", "Select_SelectVATRate11 failed. Unable to locate object: " + SelectVATRate11Elem.toString());

 			Assert.fail("Unable to locate object: " + SelectVATRate11Elem.toString());
         }
 		elem.sendKeys(Keys.ENTER);
 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(SelectVATRate11);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_SelectVATRate11 " + SelectVATRate11);

 		TestModellerLogger.PassStep(m_Driver, "Select_SelectVATRate11 " + SelectVATRate11);
 	}

     
	/**
 	 * Click Advance 12
     * @name Click Advance 12
     */
	public void Click_Advance_12()
	{
        
		WebElement elem = getWebElement(Advance_12Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Advance_12", "Click_Advance_12 failed. Unable to locate object: " + Advance_12Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Advance_12", "Click_Advance_12 failed. Unable to locate object: " + Advance_12Elem.toString());

			Assert.fail("Unable to locate object: " + Advance_12Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Advance_12");

		TestModellerLogger.PassStep(m_Driver, "Click_Advance_12");
	}

    
	/**
 	 * Select SelectBank 13
     * @name Select SelectBank 13
     */
    public void Select_SelectBank_13(String SelectBank_13)
 	{
 	    
 		WebElement elem = getWebElement(SelectBank_13Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_SelectBank_13", "Select_SelectBank_13 failed. Unable to locate object: " + SelectBank_13Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_SelectBank_13", "Select_SelectBank_13 failed. Unable to locate object: " + SelectBank_13Elem.toString());

 			Assert.fail("Unable to locate object: " + SelectBank_13Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(SelectBank_13);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_SelectBank_13 " + SelectBank_13);

 		TestModellerLogger.PassStep(m_Driver, "Select_SelectBank_13 " + SelectBank_13);
 	}

      
	/**
 	 * Enter EnterPaymentTerm14
     * @name Enter EnterPaymentTerm14
     */
 	public void Enter_EnterPaymentTerm14(String EnterPaymentTerm14)
 	{
 	    
 		WebElement elem = getWebElement(EnterPaymentTerm14Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_EnterPaymentTerm14", "Enter_EnterPaymentTerm14 failed. Unable to locate object: " + EnterPaymentTerm14Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_EnterPaymentTerm14", "Enter_EnterPaymentTerm14 failed. Unable to locate object: " + EnterPaymentTerm14Elem.toString());

 			Assert.fail("Unable to locate object: " + EnterPaymentTerm14Elem.toString());
         }

 		elem.sendKeys(EnterPaymentTerm14);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_EnterPaymentTerm14 " + EnterPaymentTerm14);

  		TestModellerLogger.PassStep(m_Driver, "Enter_EnterPaymentTerm14 " + EnterPaymentTerm14);
 	}

      
	/**
 	 * Enter EnterdueDays15
     * @name Enter EnterdueDays15
     */
 	public void Enter_EnterdueDays15(String EnterdueDays15)
 	{
 	    
 		WebElement elem = getWebElement(EnterdueDays15Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_EnterdueDays15", "Enter_EnterdueDays15 failed. Unable to locate object: " + EnterdueDays15Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_EnterdueDays15", "Enter_EnterdueDays15 failed. Unable to locate object: " + EnterdueDays15Elem.toString());

 			Assert.fail("Unable to locate object: " + EnterdueDays15Elem.toString());
         }

 		elem.sendKeys(EnterdueDays15);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_EnterdueDays15 " + EnterdueDays15);

  		TestModellerLogger.PassStep(m_Driver, "Enter_EnterdueDays15 " + EnterdueDays15);
 	}

    
	/**
 	 * Select SelectFrequency16
     * @name Select SelectFrequency16
     */
    public void Select_SelectFrequency16(String SelectFrequency16)
 	{
 	    
 		WebElement elem = getWebElement(SelectFrequency16Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_SelectFrequency16", "Select_SelectFrequency16 failed. Unable to locate object: " + SelectFrequency16Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_SelectFrequency16", "Select_SelectFrequency16 failed. Unable to locate object: " + SelectFrequency16Elem.toString());

 			Assert.fail("Unable to locate object: " + SelectFrequency16Elem.toString());
         }

 		jsExec.executeScript("arguments[0].scrollIntoView(true);", elem);
 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(SelectFrequency16);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_SelectFrequency16 " + SelectFrequency16);

 		TestModellerLogger.PassStep(m_Driver, "Select_SelectFrequency16 " + SelectFrequency16);
 	}

      
	/**
 	 * Enter EnterTotalOccurance17
     * @name Enter EnterTotalOccurance17
     */
 	public void Enter_EnterTotalOccurance17(String EnterTotalOccurance17)
 	{
 	    
 		WebElement elem = getWebElement(EnterTotalOccurance17Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_EnterTotalOccurance17", "Enter_EnterTotalOccurance17 failed. Unable to locate object: " + EnterTotalOccurance17Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_EnterTotalOccurance17", "Enter_EnterTotalOccurance17 failed. Unable to locate object: " + EnterTotalOccurance17Elem.toString());

 			Assert.fail("Unable to locate object: " + EnterTotalOccurance17Elem.toString());
         }

 		elem.sendKeys(EnterTotalOccurance17);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_EnterTotalOccurance17 " + EnterTotalOccurance17);

  		TestModellerLogger.PassStep(m_Driver, "Enter_EnterTotalOccurance17 " + EnterTotalOccurance17);
 	}

    
	/**
 	 * Select SelectInvoiceTemplate18
     * @name Select SelectInvoiceTemplate18
     */
    public void Select_SelectInvoiceTemplate18(String SelectInvoiceTemplate18)
 	{
 	    
 		WebElement elem = getWebElement(SelectInvoiceTemplate18Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_SelectInvoiceTemplate18", "Select_SelectInvoiceTemplate18 failed. Unable to locate object: " + SelectInvoiceTemplate18Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_SelectInvoiceTemplate18", "Select_SelectInvoiceTemplate18 failed. Unable to locate object: " + SelectInvoiceTemplate18Elem.toString());

 			Assert.fail("Unable to locate object: " + SelectInvoiceTemplate18Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(SelectInvoiceTemplate18);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_SelectInvoiceTemplate18 " + SelectInvoiceTemplate18);

 		TestModellerLogger.PassStep(m_Driver, "Select_SelectInvoiceTemplate18 " + SelectInvoiceTemplate18);
 	}

     
	/**
 	 * Click Click_AutoEmail 19
     * @name Click Click_AutoEmail 19
     */
	public void Click_Click_AutoEmail_19()
	{
        
		WebElement elem = getWebElement(Click_AutoEmail_19Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Click_AutoEmail_19", "Click_Click_AutoEmail_19 failed. Unable to locate object: " + Click_AutoEmail_19Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Click_AutoEmail_19", "Click_Click_AutoEmail_19 failed. Unable to locate object: " + Click_AutoEmail_19Elem.toString());

			Assert.fail("Unable to locate object: " + Click_AutoEmail_19Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Click_AutoEmail_19");

		TestModellerLogger.PassStep(m_Driver, "Click_Click_AutoEmail_19");
	}

     
	/**
 	 * Click Click NonVATInvoice 20
     * @name Click Click NonVATInvoice 20
     */
	public void Click_Click_NonVATInvoice_20()
	{
        
		WebElement elem = getWebElement(Click_NonVATInvoice_20Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Click_NonVATInvoice_20", "Click_Click_NonVATInvoice_20 failed. Unable to locate object: " + Click_NonVATInvoice_20Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Click_NonVATInvoice_20", "Click_Click_NonVATInvoice_20 failed. Unable to locate object: " + Click_NonVATInvoice_20Elem.toString());

			Assert.fail("Unable to locate object: " + Click_NonVATInvoice_20Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Click_NonVATInvoice_20");

		TestModellerLogger.PassStep(m_Driver, "Click_Click_NonVATInvoice_20");
	}

     
	/**
 	 * Click Click_AutoProcess 21
     * @name Click Click_AutoProcess 21
     */
	public void Click_Click_AutoProcess_21()
	{
        
		WebElement elem = getWebElement(Click_AutoProcess_21Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Click_AutoProcess_21", "Click_Click_AutoProcess_21 failed. Unable to locate object: " + Click_AutoProcess_21Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Click_AutoProcess_21", "Click_Click_AutoProcess_21 failed. Unable to locate object: " + Click_AutoProcess_21Elem.toString());

			Assert.fail("Unable to locate object: " + Click_AutoProcess_21Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Click_AutoProcess_21");

		TestModellerLogger.PassStep(m_Driver, "Click_Click_AutoProcess_21");
	}

     
	/**
 	 * Click Save 22
	 * @throws InterruptedException 
     * @name Click Save 22
     */
	public void Click_Save_22() throws InterruptedException
	{
        
		WebElement elem = getWebElement(Save_22Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Save_22", "Click_Save_22 failed. Unable to locate object: " + Save_22Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Save_22", "Click_Save_22 failed. Unable to locate object: " + Save_22Elem.toString());

			Assert.fail("Unable to locate object: " + Save_22Elem.toString());
        }
		Thread.sleep(2000);
		jsExec.executeScript("arguments[0].click();",elem);
		//elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Save_22");

		TestModellerLogger.PassStep(m_Driver, "Click_Save_22");
	}
	
	
	
	
//	public void UploadFile(String Path) throws InterruptedException
//	{
//		m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_btnUpload']/i")).click();    //UploadBtn
//		Thread.sleep(2000);
//		m_Driver.findElement(By.xpath("//*[@id='ctl00_cpHeaderRight_btnExportSample']/i")).click();    //Download Sample File
//		
//	WebElement UploadPath=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_FileUpload1']"));
//	UploadPath.sendKeys(Path);
//	Thread.sleep(2000);
//	m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_btnUploadeCSV']")).click();     //UploadBtn 2
//	
//	
//	
//	
//	}
	
	public void downloadCSV() throws InterruptedException
	{
		m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_LinkButton1']/i")).click();
		Thread.sleep(3000);
	}
	
	
	public void Raise_selected_Invoices() throws InterruptedException
	{
		m_Driver.findElement(By.xpath("//*[@id='ctl00_cpHeaderRight_btnProcess']")).click();
		Thread.sleep(2000);
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='cboxLoadedContent']/iframe")));
		m_Driver.findElement(By.xpath("//*[@id='selAll']")).click();
		
		WebElement ClickRaise=m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/div[2]/table/tbody/tr[2]/td[1]/label"));
		jsExec.executeScript("arguments[0].scrollIntoView(true);",ClickRaise);
		ClickRaise.click();
		WebElement ProcessBtn=m_Driver.findElement(By.xpath("//*[@id='ctl00_cphFooter_btnProcess']"));
		ProcessBtn.click();
		m_Driver.switchTo().defaultContent();
		utilities.Screenshotcapture.Getscreenshot("Raise selected invoices on next run date", "Repeat Invoice");
		Thread.sleep(2000);
		
	}
	
	public void IncomeType() throws InterruptedException
	{
		WebElement elem = getWebElement(Select_IncomeType_7Elem);
		List<WebElement>list = m_Driver.findElements(By.xpath("//*[@id='ctl00_cPH_rptrProduct_ctl00_ddProduct']/option"));
		int size= list.size();
		for(int i=1;i<=size-1;i++)
		{
			List<WebElement>list2 = m_Driver.findElements(By.xpath("//*[@id='ctl00_cPH_rptrProduct_ctl00_ddProduct']/option"));
			String List3=list2.get(i).getText();
			Reporter.log("Income type dropdown: "+List3);
		}
	//	utilities.Screenshotcapture.Getscreenshot("All existing sales should be in Income type dropdown", "New Repeat Invoice");
		
	}
	
	public void BlankDis_Screenshot() throws InterruptedException
	{
		Thread.sleep(2000);
		utilities.Screenshotcapture.Getscreenshot("Blank line should be set as default for description", "New Repeat Invoice");
	}
	
	
	public void HighLightPlusBtn() throws InterruptedException
	{
		WebElement ele=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_divtype']"));
		//WebElement ele = driver. findElement(By.id("email"));
		JavascriptExecutor jsExecutor = (JavascriptExecutor) m_Driver;
		jsExecutor. executeScript("arguments[0]. setAttribute('style', 'border:2px solid red; background:yellow')", ele);
		utilities.Screenshotcapture.Getscreenshot("Option for add any new Income Type should be there as + button", "New Repeat Invoice");
		Thread.sleep(3000);
		
	}
	
	public void NewIComeType(String NewIncomeName) throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement ele=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_divtype']"));  //Click PulsBtn
		
		ele.click();
		Thread.sleep(2000);
		utilities.Screenshotcapture.Getscreenshot("When clicking + button open Popup", "New Repeat Invoice");
		
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='recurrinvoicemodalIFrame']")));
      	Thread.sleep(2000);
		WebElement Name=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_txtIncomeHeadName']"));
		Name.sendKeys(NewIncomeName);
		
		m_Driver.findElement(By.xpath("//*[@id='imgentry']")).click();     //Click MoreBtn
		
		m_Driver.findElement(By.xpath("//*[@id='ctl00_cphFooter_btnSave']")).click();   // Click SaveBtn
		
		m_Driver.switchTo().defaultContent();
		
		//WebElement ele = driver. findElement(By.id("email"));
	//	JavascriptExecutor jsExecutor = (JavascriptExecutor) m_Driver;
	//	jsExecutor. executeScript("arguments[0]. setAttribute('style', 'border:2px solid red; background:yellow')", ele);
	//	utilities.Screenshotcapture.Getscreenshot("Option for add any new Income Type should be there as + button", "New Repeat Invoice");
		Thread.sleep(2000);
		
	}
	
	
	public void multiply() throws InterruptedException
	{
		Thread.sleep(1000);
		utilities.Screenshotcapture.Getscreenshot("Unit Price- box must be multiply with the quantity", "New Repeat Invoice");
	}
	
	public void multiply2() throws InterruptedException
	{
		Thread.sleep(1000);
		utilities.Screenshotcapture.Getscreenshot("Quantity-  box must be multiply with the quantity", "New Repeat Invoice");
	}
	
	public void PriceEnterZeno() throws InterruptedException
	{
		Thread.sleep(3000);
		String Text=m_Driver.findElement(By.xpath("//*[@id='ctl00_divSubContent']/div[2]/div")).getText();
		
		boolean b=Text.contains("Information! Please enter a valid unit price and quantity for Sale");
		Assert.assertTrue(b);
		
		Thread.sleep(1000);
		utilities.Screenshotcapture.Getscreenshot("quatity & unit price enter as zero show an information", "New Repeat Invoice");
	}
	
public void DiscountScreenshot()
{
	utilities.Screenshotcapture.FullShot("Discount should be calculate", "New Repeat Invoice");
}
public void CISScreenshot()
{
	utilities.Screenshotcapture.FullShot("CIS- highlight only when CIS income type selected", "New Repeat Invoice");
}
	
public void DefaultNoVatScreenshot() throws InterruptedException
{
	utilities.Screenshotcapture.FullShot("Always set No VAT as Default", "New Repeat Invoice");
	Thread.sleep(2000);
}
	
//public void AllVatRateScreenshot() throws InterruptedException
//{
//	m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrProduct_ctl00_ddVATRate']")).click();
//	Thread.sleep(2000);
//	utilities.Screenshotcapture.Getscreenshot("All VAT rates should be in dropdown", "New Repeat Invoice");
//}
	
public void SelectVatRateScreenshot() throws InterruptedException
{
	
	utilities.Screenshotcapture.Getscreenshot("All Vat Rate And Once any rate selected it should apply without refresh", "New Repeat Invoice");
}	
	
	
public void HighLightVat() throws InterruptedException
{
	Thread.sleep(2000);
	WebElement ele=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrProduct_ctl00_ltVATAmount']"));
	//WebElement ele = driver. findElement(By.id("email"));
	JavascriptExecutor jsExecutor = (JavascriptExecutor) m_Driver;
	jsExecutor. executeScript("arguments[0]. setAttribute('style', 'border:2px solid red; background:yellow')", ele);
	utilities.Screenshotcapture.Getscreenshot(" VAT- Show only VAT value", "New Repeat Invoice");
	Thread.sleep(3000);
	
}
	
public void HighLightDeleteLine() throws InterruptedException
{
	Thread.sleep(2000);
	m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrProduct_ctl00_hrefClear']")).click();
	
	Thread.sleep(2000);
	WebElement ele=m_Driver.findElement(By.xpath("//*[@id=\"myTable\"]/tbody[2]/tr[1]"));
	//WebElement ele = driver. findElement(By.id("email"));
	JavascriptExecutor jsExecutor = (JavascriptExecutor) m_Driver;
	jsExecutor. executeScript("arguments[0]. setAttribute('style', 'border:2px solid red; background:yellow')", ele);
	utilities.Screenshotcapture.Getscreenshot(" VAT- Show only VAT value", "New Repeat Invoice");
	Thread.sleep(3000);
	
}
	
	
	
	
	
	public void AllVerifyFilters(String CusName)
	{
		List<WebElement>list=m_Driver.findElements(By.xpath("//*[@id='ctl00_cPHFilter_ddlCustomer']/option"));
		int size=list.size();
		
		for(int i=1;i<size;i++)
		{
			List<WebElement>list2=m_Driver.findElements(By.xpath("//*[@id='ctl00_cPHFilter_ddlCustomer']/option"));
			String Name=list2.get(i).getText();
			
			WebElement dpd=m_Driver.findElement(By.xpath("//SELECT[@id='ctl00_cPHFilter_ddlCustomer']"));
			Select sl=new Select(dpd);
			sl.selectByVisibleText(Name);
			
			if(CusName.equals(Name))
			{
				List<WebElement>list3=m_Driver.findElements(By.xpath("//*[@id='ctl00_divSubContent']/div[4]/div[2]/div/div/div/div/table/tbody/tr/td[1]"));
				
				for(int k=0;k<=list3.size();k++)
				{
					List<WebElement>list4=m_Driver.findElements(By.xpath("//*[@id='ctl00_divSubContent']/div[4]/div[2]/div/div/div/div/table/tbody/tr/td[1]"));
					String CName=list4.get(i).getText();
				Assert.assertEquals(CName,CusName );
				Reporter.log("Default Customer  verified Under the Repeat Invoice "+CName);
				}
			
			}
			
		}
		
	
		
		
		
		
	}
	public void AllVerifyFilters1(String CusName)
	{
		List<WebElement>list=m_Driver.findElements(By.xpath("//*[@id='ctl00_cPHFilter_ddlCustomer']/option"));
		int size=list.size();
		
		for(int i=1;i<size;i++)
		{
			List<WebElement>list2=m_Driver.findElements(By.xpath("//*[@id='ctl00_cPHFilter_ddlCustomer']/option"));
			String Name=list2.get(i).getText();
			
			WebElement dpd=m_Driver.findElement(By.xpath("//SELECT[@id='ctl00_cPHFilter_ddlCustomer']"));
			Select sl=new Select(dpd);
			sl.selectByVisibleText(Name);
			
			if(CusName.equals(Name))
			{
				List<WebElement>list3=m_Driver.findElements(By.xpath("//*[@id='ctl00_divSubContent']/div[4]/div[2]/div/div/div/div/table/tbody/tr/td[1]"));
				
				for(int k=0;k<list3.size();k++)
				{
					List<WebElement>list4=m_Driver.findElements(By.xpath("//*[@id='ctl00_divSubContent']/div[4]/div[2]/div/div/div/div/table/tbody/tr/td[1]"));
					String CName=list4.get(k).getText();
				Assert.assertEquals(CName,CusName );
				Reporter.log("Invoices_001 Customer  verified Under the Repeat Invoice "+CName);
				}
			
			}
			
		}
		
	
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}