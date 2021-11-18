package pages;

import pages.BasePage;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.Screenshotcapture;
import utilities.VATVerification;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/10b74f0a-8068-43a9-ade1-40393a9b5318
@TestModellerModule(guid = "10b74f0a-8068-43a9-ade1-40393a9b5318")
public class SaleCreditNote extends BasePage
{
	public SaleCreditNote (WebDriver driver)
	{
		super(driver);
	}

	String InvDate1=null;
	String actPrice=null;
	String actQuan=null;
	String actVatTy =null;
	String creno=null;
	static String  crno1=null;
	static String  st=null;
	static String inel =null;
	

	
	//private By SalesTabElem = By.xpath("//A[@href='../AccountUI/Invoice.aspx?FYCode=52445&CompanyCode=13250&IsFirstRequest=1']");
	
	private By SalesTabElem = By.xpath("//*[@id='ctl00_SideMenu1_incomeMenu']/a/span");

	//private By NewButtonElem = By.xpath("//A[@class='text-white']/I[@class='fa fa-plus']");
	
	
	
	private By NewButtonElem = By.xpath("//A[@class='text-white']/I[@class='fa fa-plus']");
	//*[@id="ctl00_divMainContent"]/header/div/div[3]/a/i
	
	private By NewCreditNoteElem = By.xpath("//A[@id='ctl00_cpHeaderRight_btnAddCreditNote']");

	private By CustomerNameElem = By.xpath("//SELECT[@name='ctl00$cPH$ddlCustomer']");

	private By CreditNoteNoElem = By.xpath("//INPUT[@name='ctl00$cPH$txtInvoiceNo']");

	private By CreditNoteDateElem = By.xpath("//INPUT[@name='ctl00$cPH$txtInvoiceDate']");

	private By IncomeType1Elem = By.xpath("//SELECT[@name='ctl00$cPH$rptrProduct$ctl00$ddProduct']");

	private By InvoiceNoElem = By.xpath("//*[@id='ctl00_cPH_rptrProduct_ctl00_txtInvoiceNo']");

	private By CreditDescriptionElem = By.xpath("//TEXTAREA[@name='ctl00$cPH$rptrProduct$ctl00$txtDescription']");

	private By UnitPriceElem = By.xpath("//INPUT[@name='ctl00$cPH$rptrProduct$ctl00$txtUnitPrice']");

	
	private By QuantityElem = By.xpath("//*[@id='ctl00_cPH_rptrProduct_ctl00_txtQuantity']");
	//private By QuantityElem = By.xpath("//INPUT[@name='ctl00$cPH$rptrProduct$ctl00$txtQuantity']");

	//private By VATRateTypeElem = By.xpath("//SELECT[@name='ctl00$cPH$rptrProduct$ctl00$ddVATRate']");
	
	private By VATRateTypeElem = By.id("ctl00_cPH_rptrProduct_ctl00_ddVATRate");

	private By VATAmountElem = By.xpath("//INPUT[@name='ctl00$cPH$rptrProduct$ctl00$ltVATAmount']");

	private By SubTotalElem = By.xpath("//INPUT[@name='ctl00$cPH$ltSubTotal']");

	private By TotalWithVATElem = By.xpath("//INPUT[@name='ctl00$cPH$ltTotalDue']");

	private By TickformorelineitemsElem = By.xpath("//LABEL[@for='ctl00_cPH_chkAddMore']");

	private By NoteElem = By.xpath("//TEXTAREA[@name='ctl00$cPH$txtNote']");

	private By SaveButtonElem = By.xpath("//A[@id='ctl00_cpHFooter_btnSave']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/AccountUI/InvoiceEditor.aspx?FYCode=52445&CompanyCode=13250&id=0&action=Add&it=C");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AccountUI/InvoiceEditor.aspx?FYCode=52445&CompanyCode=13250&id=0&action=Add&it=C");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AccountUI/InvoiceEditor.aspx?FYCode=52445&CompanyCode=13250&id=0&action=Add&it=C");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AccountUI/InvoiceEditor.aspx?FYCode=52445&CompanyCode=13250&id=0&action=Add&it=C";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AccountUI/InvoiceEditor.aspx?FYCode=52445&CompanyCode=13250&id=0&action=Add&it=C")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
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
 	 * Click New_Button
	 * @throws InterruptedException 
     * @name Click New_Button
     */
	public void Click_NewButton() throws InterruptedException
	{
        
		WebElement elem = getWebElement(NewButtonElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_NewButton", "Click_NewButton failed. Unable to locate object: " + NewButtonElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_NewButton", "Click_NewButton failed. Unable to locate object: " + NewButtonElem.toString());

			Assert.fail("Unable to locate object: " + NewButtonElem.toString());
        }
		Thread.sleep(1000);
		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_NewButton");

		TestModellerLogger.PassStep(m_Driver, "Click_NewButton");
	}

     
	/**
 	 * Click NewCreditNote
     * @name Click NewCreditNote
     */
	public void Click_NewCreditNote()
	{
        
		WebElement elem = getWebElement(NewCreditNoteElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_NewCreditNote", "Click_NewCreditNote failed. Unable to locate object: " + NewCreditNoteElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_NewCreditNote", "Click_NewCreditNote failed. Unable to locate object: " + NewCreditNoteElem.toString());

			Assert.fail("Unable to locate object: " + NewCreditNoteElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_NewCreditNote");

		TestModellerLogger.PassStep(m_Driver, "Click_NewCreditNote");
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

 	      String CustomerList=	elem.getText();
 	     System.out.println("Customer List = "+CustomerList);
 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(CustomerName);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_CustomerName " + CustomerName);

 		TestModellerLogger.PassStep(m_Driver, "Select_CustomerName " + CustomerName);
 	}

      
	/**
 	 * Enter CreditNoteNo
     * @name Enter CreditNoteNo
     */
 	public void Enter_CreditNoteNo(String CreditNoteNo)
 	{
 		creno=CreditNoteNo;
 		WebElement elem = getWebElement(CreditNoteNoElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_CreditNoteNo", "Enter_CreditNoteNo failed. Unable to locate object: " + CreditNoteNoElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_CreditNoteNo", "Enter_CreditNoteNo failed. Unable to locate object: " + CreditNoteNoElem.toString());

 			Assert.fail("Unable to locate object: " + CreditNoteNoElem.toString());
         }
 		
 		//elem.clear();
 		elem.sendKeys(CreditNoteNo);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_CreditNoteNo " + CreditNoteNo);

  		TestModellerLogger.PassStep(m_Driver, "Enter_CreditNoteNo " + CreditNoteNo);
 	}

      
	/**
 	 * Enter CreditNoteDate
     * @name Enter CreditNoteDate
     */
 	public void Enter_CreditNoteDate(String CreditNoteDate)
 	{
 		System.out.println("Creditnotedate");
 		WebElement elem = getWebElement(CreditNoteDateElem);
 		
 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_CreditNoteDate", "Enter_CreditNoteDate failed. Unable to locate object: " + CreditNoteDateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_CreditNoteDate", "Enter_CreditNoteDate failed. Unable to locate object: " + CreditNoteDateElem.toString());

 			Assert.fail("Unable to locate object: " + CreditNoteDateElem.toString());
         }

 		elem.sendKeys(CreditNoteDate);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_CreditNoteDate " + CreditNoteDate);

  		TestModellerLogger.PassStep(m_Driver, "Enter_CreditNoteDate " + CreditNoteDate);
 	}

    
	/**
 	 * Select IncomeType1
	 * @throws InterruptedException 
     * @name Select IncomeType1
     */
    public void Select_IncomeType1(String IncomeType1) throws InterruptedException
 	{
 	    
    	System.out.println("InvoiceType1");
 		WebElement elem = getWebElement(IncomeType1Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_IncomeType1", "Select_IncomeType1 failed. Unable to locate object: " + IncomeType1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_IncomeType1", "Select_IncomeType1 failed. Unable to locate object: " + IncomeType1Elem.toString());

 			Assert.fail("Unable to locate object: " + IncomeType1Elem.toString());
         }
         String IncomeType=elem.getText();
 		Select dropdown = new Select(elem);
 		System.out.println("Income Type List ="+IncomeType);

 		dropdown.selectByVisibleText(IncomeType1);
 		//elem.sendKeys(Keys.TAB);
 		Thread.sleep(1000);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_IncomeType1 " + IncomeType1);

 		TestModellerLogger.PassStep(m_Driver, "Select_IncomeType1 " + IncomeType1);
 	}

      
	/**
 	 * Enter InvoiceNo
	 * @throws InterruptedException 
     * @name Enter InvoiceNo
     */
 	public void Enter_InvoiceNo(String InvoiceNo) throws InterruptedException
 	{
 		System.out.println("InvoiceNo");
 	    
 		WebElement elem = getWebElement(InvoiceNoElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_InvoiceNo", "Enter_InvoiceNo failed. Unable to locate object: " + InvoiceNoElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_InvoiceNo", "Enter_InvoiceNo failed. Unable to locate object: " + InvoiceNoElem.toString());

 			Assert.fail("Unable to locate object: " + InvoiceNoElem.toString());
         }

 		elem.sendKeys(InvoiceNo);
 		
 		Thread.sleep(1000);
 		Thread.sleep(1000);
  		ExtentReportManager.passStep(m_Driver, "Enter_InvoiceNo " + InvoiceNo);

  		TestModellerLogger.PassStep(m_Driver, "Enter_InvoiceNo " + InvoiceNo);
 	}

      
	/**
 	 * Enter CreditDescription
	 * @throws InterruptedException 
     * @name Enter CreditDescription
     */
 	public void Enter_CreditDescription(String CreditDescription) throws InterruptedException
 	{
 		System.out.println("Description");
 		WebElement elem = getWebElement(CreditDescriptionElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_CreditDescription", "Enter_CreditDescription failed. Unable to locate object: " + CreditDescriptionElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_CreditDescription", "Enter_CreditDescription failed. Unable to locate object: " + CreditDescriptionElem.toString());

 			Assert.fail("Unable to locate object: " + CreditDescriptionElem.toString());
         }

 		elem.sendKeys(CreditDescription);
 		Thread.sleep(1000);
 		//jsExec.executeScript("arguments[0].value(CreditDescription);", elem);
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_CreditDescription " + CreditDescription);

  		TestModellerLogger.PassStep(m_Driver, "Enter_CreditDescription " + CreditDescription);
 	}

      
	/**
 	 * Enter UnitPrice
	 * @throws InterruptedException 
     * @name Enter UnitPrice
     */
 	public void Enter_UnitPrice(String UnitPrice) throws InterruptedException
 	{
 		System.out.println("UnitPrice");
 		WebElement elem = getWebElement(UnitPriceElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_UnitPrice", "Enter_UnitPrice failed. Unable to locate object: " + UnitPriceElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_UnitPrice", "Enter_UnitPrice failed. Unable to locate object: " + UnitPriceElem.toString());

 			Assert.fail("Unable to locate object: " + UnitPriceElem.toString());
         }
         elem.clear();
 		elem.sendKeys(UnitPrice);
 	//	jsExec.executeScript("arguments[0].value(Quantity);", elem);
 		actPrice = (String) jsExec.executeScript("return document.getElementById('ctl00_cPH_rptrProduct_ctl00_txtUnitPrice').value"); 
 		System.out.println(actPrice);
 		Thread.sleep(1000);
  		ExtentReportManager.passStep(m_Driver, "Enter_UnitPrice " + UnitPrice);

  		TestModellerLogger.PassStep(m_Driver, "Enter_UnitPrice " + UnitPrice);
 	}

	/**
 	 * Enter Quantity
	 * @throws InterruptedException 
     * @name Enter Quantity
     */
 	public void Enter_Quantity(String Quantity) throws InterruptedException
 	{
 		
 		System.out.println("Quantity");
 	    
 		WebElement elem = getWebElement(QuantityElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Quantity", "Enter_Quantity failed. Unable to locate object: " + QuantityElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Quantity", "Enter_Quantity failed. Unable to locate object: " + QuantityElem.toString());

 			Assert.fail("Unable to locate object: " + QuantityElem.toString());
         }
 		elem.sendKeys(Keys.ENTER);
 		elem.clear();
 		elem.sendKeys(Quantity);
 		
 		//m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrProduct_ctl00_txtQuantity']")).sendKeys(Quantity);
 	
 		//jsExec.executeScript("arguments[0].value(Quantity);", elem);
 		//Thread.sleep(1000);
 		//actQuan = (String) jsExec.executeScript("return document.getElementById(//*[@id='ctl00_cPH_rptrProduct_ctl00_txtQuantity']).value");  

 		//*[@id='ctl00_cPH_rptrProduct_ctl00_txtQuantity']
 		System.out.println("Quant"+actQuan);
  		ExtentReportManager.passStep(m_Driver, "Enter_Quantity " + Quantity);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Quantity " + Quantity);
 	}

    
	/**
 	 * Select VATRateType
	 * @throws InterruptedException 
     * @name Select VATRateType
     */
    public void Select_VATRateType(String VATRateType) throws InterruptedException
 	{
 	    System.out.println("VATType");
 		WebElement elem = getWebElement(VATRateTypeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_VATRateType", "Select_VATRateType failed. Unable to locate object: " + VATRateTypeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_VATRateType", "Select_VATRateType failed. Unable to locate object: " + VATRateTypeElem.toString());

 			Assert.fail("Unable to locate object: " + VATRateTypeElem.toString());
         }
 		String VatType=elem.getText();
 		System.out.println("VatType List="+VatType);
 		
 		//elem.click();
 		Thread.sleep(2000);
 		elem.sendKeys(Keys.ENTER);
 		Select dropdown = new Select(elem);
 		
 		// jsExec.executeScript("arguments[0].click();", elem);

 		
 		dropdown.selectByVisibleText(VATRateType);
 		
 		//elem.sendKeys(Keys.TAB);
// 		VATVerification verify = new VATVerification(m_Driver);
// 		int TRate = (int) verify.VatVerify(VATRateType, actPrice, actQuan);
// 		
// 		SoftAssert ass = new SoftAssert();
// 		ass.assertEquals(str, ttotal);
	ExtentReportManager.passStep(m_Driver, "Select_VATRateType " + VATRateType);

 		TestModellerLogger.PassStep(m_Driver, "Select_VATRateType " + VATRateType);
 	}

      
	/**
 	 * Enter VATAmount
     * @name Enter VATAmount
     */
 	public void Enter_VATAmount(String VATAmount)
 	{
 	    
 		WebElement elem = getWebElement(VATAmountElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_VATAmount", "Enter_VATAmount failed. Unable to locate object: " + VATAmountElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_VATAmount", "Enter_VATAmount failed. Unable to locate object: " + VATAmountElem.toString());

 			Assert.fail("Unable to locate object: " + VATAmountElem.toString());
         }
 		
 		elem.sendKeys(VATAmount);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_VATAmount " + VATAmount);

  		TestModellerLogger.PassStep(m_Driver, "Enter_VATAmount " + VATAmount);
 	}

      
	/**
 	 * Enter SubTotal
     * @name Enter SubTotal
     */
 	public void Enter_SubTotal(String SubTotal)
 	{
 	    
 		WebElement elem = getWebElement(SubTotalElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_SubTotal", "Enter_SubTotal failed. Unable to locate object: " + SubTotalElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_SubTotal", "Enter_SubTotal failed. Unable to locate object: " + SubTotalElem.toString());

 			Assert.fail("Unable to locate object: " + SubTotalElem.toString());
         }

 		elem.sendKeys(SubTotal);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_SubTotal " + SubTotal);

  		TestModellerLogger.PassStep(m_Driver, "Enter_SubTotal " + SubTotal);
 	}

      
	/**
 	 * Enter TotalWithVAT
     * @name Enter TotalWithVAT
     */
 	public void Enter_TotalWithVAT(String TotalWithVAT)
 	{
 	    
 		WebElement elem = getWebElement(TotalWithVATElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_TotalWithVAT", "Enter_TotalWithVAT failed. Unable to locate object: " + TotalWithVATElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_TotalWithVAT", "Enter_TotalWithVAT failed. Unable to locate object: " + TotalWithVATElem.toString());

 			Assert.fail("Unable to locate object: " + TotalWithVATElem.toString());
         }

 		elem.sendKeys(TotalWithVAT);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_TotalWithVAT " + TotalWithVAT);

  		TestModellerLogger.PassStep(m_Driver, "Enter_TotalWithVAT " + TotalWithVAT);
 	}

     
	/**
 	 * Click Tick_for_more_line_items
     * @name Click Tick_for_more_line_items
     */
	public void Click_Tickformorelineitems()
	{
        
		WebElement elem = getWebElement(TickformorelineitemsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Tickformorelineitems", "Click_Tickformorelineitems failed. Unable to locate object: " + TickformorelineitemsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Tickformorelineitems", "Click_Tickformorelineitems failed. Unable to locate object: " + TickformorelineitemsElem.toString());

			Assert.fail("Unable to locate object: " + TickformorelineitemsElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Tickformorelineitems");

		TestModellerLogger.PassStep(m_Driver, "Click_Tickformorelineitems");
	}

      
	/**
 	 * Enter Note
     * @name Enter Note
     */
 	public void Enter_Note(String Note)
 	{
 	    System.out.print("Note");
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
	 * @throws InterruptedException 
	 * @throws IOException 
	 * @throws AWTException 
	 * @throws HeadlessException 
     * @name Click SaveButton
     */
	public void Click_SaveButton() throws InterruptedException, IOException, HeadlessException, AWTException
	{
        
		WebElement elem = getWebElement(SaveButtonElem);
		

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SaveButton", "Click_SaveButton failed. Unable to locate object: " + SaveButtonElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SaveButton", "Click_SaveButton failed. Unable to locate object: " + SaveButtonElem.toString());

			Assert.fail("Unable to locate object: " + SaveButtonElem.toString());
        }

		//elem.click();
		//*[@id='ctl00_cpHFooter_btnSave']
	  
		jsExec.executeScript("arguments[0].scrollIntoView(true);",  m_Driver.findElement(By.xpath("//*[@id='ctl00_cpHFooter_btnSave']")));
		  Thread.sleep(3000);
		jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//*[@id='ctl00_cpHFooter_btnSave']")));
		Thread.sleep(6000);
		
//		WebElement StatusWin=m_Driver.findElement(By.xpath("//*[@id='EditPopUpClose']"));
//		if(StatusWin.isDisplayed())
//		{
//			StatusWin.click();
//		}
//		
//		
//		GetSuccessText();
		
//		 WebElement inv1=m_Driver.findElement(By.xpath("//*[@id='ctl00_divSubContent']/div[1]/div"));
//
//	     String invoicetransno=inv1.getText();
//	     
//		String arr[]=invoicetransno.split(" ");
//	    inel=arr[2];
//	    System.out.println("Message"+inel);
		
//		BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
//		 ImageIO.write(image, "png", new File(System.getProperty("user.dir")+"\\"+creno+".png"));
//		
//	
          //	GetSuccessText();

		ExtentReportManager.passStep(m_Driver, "Click_SaveButton");

		TestModellerLogger.PassStep(m_Driver, "Click_SaveButton");
	}
	public  void GetSuccessText() throws IOException, HeadlessException, AWTException, InterruptedException
	{
		
		System.out.println("Inside GetSuccess");
	int rowcount = m_Driver.findElements(By.xpath("//*[@id='ctl00_cPH_filtrec']/div/div/table/tbody/tr")).size();
	//*[@id="ctl00_cPH_filtrec"]/div/div/table/tbody/tr
	System.out.println(rowcount);
	
	for(int i=1; i<rowcount; i++)
	{
		int j=i-1;
		System.out.println("Hi loop"+i);
		
		WebElement dd= m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_filtrec']/div/div/table/tbody/tr["+ i +"]/td[5]"));

		String str =dd.getText();
		
		System.out.println("Ã�nvo"+str);
		System.out.println("Ã�nn"+creno);
		
		System.out.println("2i"+i);
		if(creno.equalsIgnoreCase(str))
		{
			//System.out.println("string"+st);
			System.out.println("HI IF");
					st= m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_filtrec']/div/div/table/tbody/tr["+ i +"]/td[2]")).getText();
					System.out.println("string"+st);
					//Thread.sleep(1500);
					//*[@id="ctl00_cPH_filtrec"]/div/div/table/tbody/tr[5]/td[2]
					//WebElement bak=m_Driver.findElement(By.xpath("//*[contains(text(), 'Banking')]"));
					System.out.println("string:"+st);
				m_Driver.findElement(By.xpath("//a[text()='"+st+"']")).click();
			
			//m_Driver.findElement(By.xpath("//*[@id='EditPopUpClose']")).click();
				Thread.sleep(500);
				Screenshotcapture.captureAsImage(m_Driver, str);
				crno1=m_Driver.findElement(By.xpath("//a[text()='"+st+"']")).getText();
					System.out.println("Rerun"+crno1);
					
					//jsExec.executeScript("arguments[0].scrollIntoView(true);", m_Driver.findElement(By.xpath("//*[@id='ctl00_SideMenu1_bankingMenu']")));
//					BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
//					 ImageIO.write(image, "png", new File(System.getProperty("user.dir")+"\\"+inno+".png"));
					
			break;
		}
	
	}
	Thread.sleep(1000);	
}
	public String message() 
	{
		System.out.println("Confirmation "+inel);	
		return inel;
		
	}
	
	

		public void TC01GetMsg() throws InterruptedException
		{
			Thread.sleep(2000);
			utilities.Screenshotcapture.Getscreenshot("started with Alpha no.'CN' & numeric(1) ", "Credit Note (Income)");
			
		}
		public void TC002GetMsg() throws InterruptedException
		{
			Thread.sleep(2000);
			utilities.Screenshotcapture.Getscreenshot("started with Alpha no.'CN' & numeric(2) ", "Credit Note (Income)");
			
		}
		public void TC04GetMsg() throws InterruptedException
		{
			Thread.sleep(2000);
			utilities.Screenshotcapture.Getscreenshot("success message on top of the screen with invoice no ", "Credit Note (Income)");
			
		}
		
		   public void Cheack_CustomerName(String CustomerName) throws InterruptedException
		 	{
		 	    
		 		WebElement elem = getWebElement(CustomerNameElem);

		 		if (elem == null) {
		    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_CustomerName", "Select_CustomerName failed. Unable to locate object: " + CustomerNameElem.toString());

		    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_CustomerName", "Select_CustomerName failed. Unable to locate object: " + CustomerNameElem.toString());

		 			Assert.fail("Unable to locate object: " + CustomerNameElem.toString());
		         }
		 	
		 	String CustomerList=elem.getText();
		 	System.out.println("Customer List ="+CustomerList);

		 		Select dropdown = new Select(elem);
               
              
		 		dropdown.selectByVisibleText(CustomerName);
		 		
		 	   utilities.Screenshotcapture.Getscreenshot("Invoice should be book in selected customer ", "Credit Note (Income)");
		 		ExtentReportManager.passStep(m_Driver, "Select_CustomerName " + CustomerName);

		 		TestModellerLogger.PassStep(m_Driver, "Select_CustomerName " + CustomerName);
		 	}
		
		   public void AddExpancetype(String HeadName) throws InterruptedException
			{
				Thread.sleep(2000);
				m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_divtype']/i")).click();//Click Puls Btn
				
				Thread.sleep(2000);
				
				m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='AddinvoicemodalplusIFrame']"))); //Switch Frame 
				Thread.sleep(2000);
				utilities.Screenshotcapture.Getscreenshot(" New Expense Type Popup", "Credit Note (Income)");
				
				m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_txtIncomeHeadName']")).sendKeys(HeadName);//Send Name
				Thread.sleep(1000);
				m_Driver.findElement(By.xpath("//*[@id='ctl00_cphFooter_btnSave']")).click();    //Save Btn
				System.out.println("AddExpancetype ="+HeadName);
				}
			
			public void AddRemoveEntry() throws InterruptedException
			{
				Thread.sleep(1000);
				m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrProduct_ctl01_btnRemoveRow']/i")).click();
				Thread.sleep(1000);
				m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrProduct_ctl01_btnRemoveRow']/i")).click();
				Thread.sleep(1000);
				m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrProduct_ctl00_btnaddMore']/i")).click();// AddEntry
				Thread.sleep(1000);

		 		System.out.println("Btn Add");
		 		
		 		m_Driver.findElement(By.xpath("//*[@id='select2-ctl00_cPH_rptrProduct_ctl01_ltAccount-container']")).click();
		 		m_Driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("Purchases");
		 		m_Driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
		 		//*[@id="select2-ctl00_cPH_rptrProduct_ctl00_ltAccount-container"]
		 		
		 		System.out.println("Fill Entry");
		 		WebElement Dis=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrProduct_ctl01_txtDescription']"));  //Description;
		 		Dis.sendKeys("Temp");
		 		Dis.sendKeys(Keys.TAB);
		 		WebElement Gross=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrProduct_ctl01_txtUnitPrice']"));  //Gross;
		 		Gross.sendKeys("3000");
		 		Gross.sendKeys(Keys.TAB);
		 		Thread.sleep(1000);
		 		WebElement Vat=m_Driver.findElement(By.xpath("//select[@id='ctl00_cPH_rptrProduct_ctl01_ddVATRate']")); //Vat Type
		 		
		 		Select dropdown = new Select(Vat);
		 		

		 		dropdown.selectByVisibleText("Zero Rate");
		 		utilities.Screenshotcapture.Getscreenshot("Add Entry And Fill Data", "Credit Note (Income)");
				Thread.sleep(1000);
				m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrProduct_ctl01_btnRemoveRow']/i")).click();
				Thread.sleep(1000);
				System.out.println("Add & Fill From Afterthat RemoveEntry");
				utilities.Screenshotcapture.Getscreenshot("Add Entry And Delete entry", "Credit Note (Income)");
				
				
				
			}
			
			public void TotalAmount(String Unt,String Qut) throws InterruptedException
			{
					Thread.sleep(2000);
//				WebElement Ele=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_txtSubTotal']"));
//				String TotalAmt=Ele.getText();
	//			System.out.println(Unt+"*"+Qut+"="+TotalAmt);
				if(Unt=="1000")
				{
					utilities.Screenshotcapture.Getscreenshot("multiply1", "Credit Note (Income)");
				}
				if(Unt=="2000")
				{
					utilities.Screenshotcapture.Getscreenshot("multiply2", "Credit Note (Income)");
				}
				
			}
			public void ScreenShot()
			{
				utilities.Screenshotcapture.Getscreenshot("Default Blank line for 'Description & Always set 'No VAT' as default", "Credit Note (Income)");
			}
			
			public void ScreenShot2()
			{
				utilities.Screenshotcapture.Getscreenshot(" Show only VAT value In Vat Line ", "Credit Note (Income)");

			}
			
			
			
			
			
			
			
			
			
			
			
			
			
		}