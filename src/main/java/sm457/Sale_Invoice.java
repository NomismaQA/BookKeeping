package sm457;

import pages.BasePage;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.GetScreenShot;
import utilities.testmodeller.TestModellerLogger;

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/ac366805-bd68-464a-a499-36c6930ef129
@TestModellerModule(guid = "ac366805-bd68-464a-a499-36c6930ef129")
public class Sale_Invoice extends BasePage
{

	public  String inel;
	public String inv2;

	public Sale_Invoice (WebDriver driver)
	{
		super(driver);
	}

	
	private By SalesTabElem = By.xpath("//LI[@id='ctl00_SideMenu1_incomeMenu']/A/SPAN[@class='side_nav_text']");

	private By NewButtonElem = By.xpath("//A[@class='text-white']/I[@class='fa fa-plus']");

	private By NewInvoiceElem = By.id("ctl00_cpHeaderRight_btnAdd");

	private By CustomerNameElem = By.id("ctl00_cPH_ddlCustomer");

	private By InvoiceNoElem = By.id("ctl00_cPH_txtInvoiceNo");

	private By InvoiceDateElem = By.id("ctl00_cPH_txtInvoiceDate");

	private By IncomeTypeElem = By.id("ctl00_cPH_rptrProduct_ctl00_ddProduct");

	private By DescriptionElem = By.id("ctl00_cPH_rptrProduct_ctl00_txtDescription");
	//private By DescriptionElem = By.id("/html/body/form/main/div[11]/div[3]/div/div[4]/div[2]/div[1]/div[1]/div/div/div/div/table/tbody[2]/tr[1]/td[3]/input");
	    
	private By UnitPriceElem = By.id("ctl00_cPH_rptrProduct_ctl00_txtUnitPrice");
	//private By UnitPriceElem = By.id("");

	private By QuantityElem = By.id("ctl00_cPH_rptrProduct_ctl00_txtQuantity");
	//private By QuantityElem = By.id("");

	private By VATRateElem = By.id("ctl00_cPH_rptrProduct_ctl00_ddVATRate");

	//private By TickformorelineitemsElem = By.xpath("//DIV[@class='col-sm-12 col-md-12']/SPAN/LABEL");

	private By NoteElem = By.id("ctl00_cPH_txtNote");

	private By SaveButtonElem = By.id("ctl00_cpHFooter_btnSave");
	private By Select_customerElem = By.xpath("//*[@id='ctl00_cPHFilter_ddlAccount']");

	private By Enter_transcodeElem=By.xpath("//*[@id='ctl00_cPHFilter_txtSearch']");

	private By Click_Update_btnElem = By.xpath("//*[@id='ctl00_cPHFilter_btnSearch\']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/AccountUI/InvoiceEditor.aspx?FYCode=52444&CompanyCode=13236&id=0&action=Add&it=I&menuid=0");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AccountUI/InvoiceEditor.aspx?FYCode=52444&CompanyCode=13236&id=0&action=Add&it=I&menuid=0");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AccountUI/InvoiceEditor.aspx?FYCode=52444&CompanyCode=13236&id=0&action=Add&it=I&menuid=0");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
//   public void AssertUrl()
//    {
//        String currentUrl = m_Driver.getCurrentUrl();
//        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AccountUI/InvoiceEditor.aspx?FYCode=52444&CompanyCode=13236&id=0&action=Add&it=I&menuid=0";
//
//        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AccountUI/InvoiceEditor.aspx?FYCode=52444&CompanyCode=13236&id=0&action=Add&it=I&menuid=0")) {
//            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
//        }
//    }

     
	/**
 	 * Click SalesTab
     * @name Click SalesTab
     */
	public void Click_SalesTab()
	{
        
		WebElement elem = getWebElement(SalesTabElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SalesTab", "Click_SalesTab failed. Unable to locate object: " + SalesTabElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SalesTab", "Click_SalesTab failed. Unable to locate object: " + SalesTabElem.toString());

			Assert.fail("Unable to locate object: " + SalesTabElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_SalesTab");

		TestModellerLogger.PassStep(m_Driver, "Click_SalesTab");
	}

     
	/**
 	 * Click NewButton
     * @name Click NewButton
     */
	public void Click_NewButton()
	{
        
		WebElement elem = getWebElement(NewButtonElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_NewButton", "Click_NewButton failed. Unable to locate object: " + NewButtonElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_NewButton", "Click_NewButton failed. Unable to locate object: " + NewButtonElem.toString());

			Assert.fail("Unable to locate object: " + NewButtonElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_NewButton");

		TestModellerLogger.PassStep(m_Driver, "Click_NewButton");
	}

     
	/**
 	 * Click NewInvoice
     * @name Click NewInvoice
     */
	public void Click_NewInvoice()
	{
        
		WebElement elem = getWebElement(NewInvoiceElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_NewInvoice", "Click_NewInvoice failed. Unable to locate object: " + NewInvoiceElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_NewInvoice", "Click_NewInvoice failed. Unable to locate object: " + NewInvoiceElem.toString());

			Assert.fail("Unable to locate object: " + NewInvoiceElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_NewInvoice");

		TestModellerLogger.PassStep(m_Driver, "Click_NewInvoice");
	}

    
	/**
 	 * Select CustomerName
     * @name Select CustomerName
     */
    public void Select_CustomerName(String CustomerName)
 	{
 	    
 		WebElement elem = getWebElement(CustomerNameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_CustomerName", "Select_CustomerName failed. Unable to locate object: " + CustomerNameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_CustomerName", "Select_CustomerName failed. Unable to locate object: " + CustomerNameElem.toString());

 			Assert.fail("Unable to locate object: " + CustomerNameElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(CustomerName);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_CustomerName " + CustomerName);

 		TestModellerLogger.PassStep(m_Driver, "Select_CustomerName " + CustomerName);
 	}

      
	/**
 	 * Enter InvoiceNo
     * @name Enter InvoiceNo
     */
 	public void Enter_InvoiceNo(String InvoiceNo)
 	{
 	    
 		WebElement elem = getWebElement(InvoiceNoElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_InvoiceNo", "Enter_InvoiceNo failed. Unable to locate object: " + InvoiceNoElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_InvoiceNo", "Enter_InvoiceNo failed. Unable to locate object: " + InvoiceNoElem.toString());

 			Assert.fail("Unable to locate object: " + InvoiceNoElem.toString());
         }
 		//elem.clear();
 		elem.sendKeys(InvoiceNo);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_InvoiceNo " + InvoiceNo);

  		TestModellerLogger.PassStep(m_Driver, "Enter_InvoiceNo " + InvoiceNo);
 	}

      
	/**
 	 * Enter InvoiceDate
     * @name Enter InvoiceDate
     */
 	public void Enter_InvoiceDate(String InvoiceDate)
 	{
 	    
 		WebElement elem = getWebElement(InvoiceDateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_InvoiceDate", "Enter_InvoiceDate failed. Unable to locate object: " + InvoiceDateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_InvoiceDate", "Enter_InvoiceDate failed. Unable to locate object: " + InvoiceDateElem.toString());

 			Assert.fail("Unable to locate object: " + InvoiceDateElem.toString());
         }
 		//elem.clear();

 		elem.sendKeys(InvoiceDate);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_InvoiceDate " + InvoiceDate);

  		TestModellerLogger.PassStep(m_Driver, "Enter_InvoiceDate " + InvoiceDate);
 	}

    
	/**
 	 * Select IncomeType
     * @name Select IncomeType
     */
    public void Select_IncomeType(String IncomeType)
 	{
 	    
 		WebElement elem = getWebElement(IncomeTypeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_IncomeType", "Select_IncomeType failed. Unable to locate object: " + IncomeTypeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_IncomeType", "Select_IncomeType failed. Unable to locate object: " + IncomeTypeElem.toString());

 			Assert.fail("Unable to locate object: " + IncomeTypeElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(IncomeType);
 		
 		//elem.sendKeys(Keys.TAB);
 		ExtentReportManager.passStep(m_Driver, "Select_IncomeType " + IncomeType);

 		TestModellerLogger.PassStep(m_Driver, "Select_IncomeType " + IncomeType);
 	}

      
	/**
 	 * Enter Description
	 * @throws InterruptedException 
     * @name Enter Description
     */
 	public void Enter_Description(String Description) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(DescriptionElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Description", "Enter_Description failed. Unable to locate object: " + DescriptionElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Description", "Enter_Description failed. Unable to locate object: " + DescriptionElem.toString());

 			Assert.fail("Unable to locate object: " + DescriptionElem.toString());
         }

 		elem.sendKeys(Description);
 		//Thread.sleep(1000);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Description " + Description);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Description " + Description);
 	}

      
	/**
 	 * Enter UnitPrice
     * @name Enter UnitPrice
     */
 	public void Enter_UnitPrice(String UnitPrice)
 	{
 	    
 		WebElement elem = getWebElement(UnitPriceElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_UnitPrice", "Enter_UnitPrice failed. Unable to locate object: " + UnitPriceElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_UnitPrice", "Enter_UnitPrice failed. Unable to locate object: " + UnitPriceElem.toString());

 			Assert.fail("Unable to locate object: " + UnitPriceElem.toString());
         }

 		elem.sendKeys(UnitPrice);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_UnitPrice " + UnitPrice);

  		TestModellerLogger.PassStep(m_Driver, "Enter_UnitPrice " + UnitPrice);
 	}

      
	/**
 	 * Enter Quantity
     * @name Enter Quantity
     */
 	public void Enter_Quantity(String Quantity)
 	{
 	    
 		WebElement elem = getWebElement(QuantityElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Quantity", "Enter_Quantity failed. Unable to locate object: " + QuantityElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Quantity", "Enter_Quantity failed. Unable to locate object: " + QuantityElem.toString());

 			Assert.fail("Unable to locate object: " + QuantityElem.toString());
         }

 		elem.sendKeys(Quantity);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Quantity " + Quantity);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Quantity " + Quantity);
 	}

    
	/**
 	 * Select VATRate
	 * @throws InterruptedException 
     * @name Select VATRate
     */
    public void Select_VATRate(String VATRate) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(VATRateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_VATRate", "Select_VATRate failed. Unable to locate object: " + VATRateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_VATRate", "Select_VATRate failed. Unable to locate object: " + VATRateElem.toString());

 			Assert.fail("Unable to locate object: " + VATRateElem.toString());
         }

 		Select dropdown = new Select(elem);
              
 		dropdown.selectByVisibleText(VATRate);
 		
 			 
 		Thread.sleep(3000);
 		ExtentReportManager.passStep(m_Driver, "Select_VATRate " + VATRate);

 		TestModellerLogger.PassStep(m_Driver, "Select_VATRate " + VATRate);
 	}

     
	/**
 	 * Click Tickformorelineitems
     * @name Click Tickformorelineitems
     */
//	public void Click_Tickformorelineitems()
//	{
//        
//		WebElement elem = getWebElement(TickformorelineitemsElem);
//
//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Tickformorelineitems", "Click_Tickformorelineitems failed. Unable to locate object: " + TickformorelineitemsElem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Tickformorelineitems", "Click_Tickformorelineitems failed. Unable to locate object: " + TickformorelineitemsElem.toString());
//
//			Assert.fail("Unable to locate object: " + TickformorelineitemsElem.toString());
//        }
//
//		elem.click();
//          	
//
//		ExtentReportManager.passStep(m_Driver, "Click_Tickformorelineitems");
//
//		TestModellerLogger.PassStep(m_Driver, "Click_Tickformorelineitems");
//	}

      
	/**
 	 * Enter Note
     * @name Enter Note
     */
 	public void Enter_Note(String Note)
 	{
 	    
 		WebElement elem = getWebElement(NoteElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Note", "Enter_Note failed. Unable to locate object: " + NoteElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Note", "Enter_Note failed. Unable to locate object: " + NoteElem.toString());

 			Assert.fail("Unable to locate object: " + NoteElem.toString());
         }

 		elem.sendKeys(Note);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Note " + Note);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Note " + Note);
 	}

     
	/**
 	 * Click SaveButton
	 * @throws IOException 
	 * @throws InterruptedException 
     * @name Click SaveButton
     */
	public void Click_SaveButton() throws IOException, InterruptedException
	{
        
		WebElement elem = getWebElement(SaveButtonElem);

//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SaveButton", "Click_SaveButton failed. Unable to locate object: " + SaveButtonElem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SaveButton", "Click_SaveButton failed. Unable to locate object: " + SaveButtonElem.toString());
//
//			Assert.fail("Unable to locate object: " + SaveButtonElem.toString());
//        }

		//elem.click();
          		//Success! Invoice# 340 added successfully
		//Success! Transaction #341 inserted successfully
		JavascriptExecutor jse = (JavascriptExecutor)m_Driver;
		jse.executeScript("arguments[0].click()", elem);
   //Success! Invoice# 1098 added successfully
		WebElement inv1=m_Driver.findElement(By.xpath("//*[@id='ctl00_divSubContent']/div[1]/div"));
		System.out.println("confirmationmeasge dispplayed" +2);
		//WebElement inv1=m_Driver.findElement(By.xpath("//*[@id='ctl00_divSubContent']/div[1]/div"));
	     String invoicetransno=inv1.getText();
	     String arr[]=invoicetransno.split(" ");
	   inel=arr[2];
	 inv2=inel.substring(1);
	   System.out.println("invoiceno number is "   +inv2);	
  
	}
	public String message()
	{
	
		return inv2;
		}
	
}
