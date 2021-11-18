package Pages_Reconcilation_TC;

import pages.BasePage;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
//import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.ChangeWindow;
import utilities.Screenshotcapture;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/c29beaa8-f2fc-4329-9277-5fccdf3338c6
@TestModellerModule(guid = "c29beaa8-f2fc-4329-9277-5fccdf3338c6")
public class SupplierBillSToFRS extends BasePage
{
	public static String vatrate;
	String BNO;
	String inel=" ";
	String SupNo=" ";
	public SupplierBillSToFRS (WebDriver driver)
	{
		super(driver);
	}


	
	//private By ExpenditureTABElem = By.xpath("//A[@href='../AccountUI/SupplierBill.aspx?FYCode=52550&CompanyCode=13324']");

	private By ExpenditureTABElem = By.xpath("//span[contains(text(), 'Expenditure')]");
	
	private By NewTABElem = By.xpath("//*[@id='ctl00_divMainContent']/header/div/div[4]/a");

	private By NewSupplierBillElem = By.xpath("//A[@id='ctl00_cpHeaderRight_btnAdd']");

	private By SupplierNameElem = By.xpath("//SELECT[@name='ctl00$cPH$ddlSupplier']");

	private By DefaultCurrencyElem = By.xpath("//INPUT[@name='ctl00$cPH$txtDefaultCurrency']");

	//private By BillNoElem = By.xpath("//INPUT[@name='ctl00$cPH$txtBillNo']");
	
	private By BillNoElem = By.id("ctl00_cPH_txtBillNo");

	private By DateElem = By.xpath("//INPUT[@name='ctl00$cPH$txtDate']");

	private By ExpenseTypeElem = By.xpath("//SELECT[@name='ctl00$cPH$rptrProduct$ctl00$ddExpenseHead']");

	private By DescriptionElem = By.xpath("//TEXTAREA[@name='ctl00$cPH$rptrProduct$ctl00$txtDescription']");

	private By UnitPriceElem = By.xpath("//INPUT[@name='ctl00$cPH$rptrProduct$ctl00$txtUnitPrice']");

	private By VATRateTypeElem = By.xpath("//SELECT[@name='ctl00$cPH$rptrProduct$ctl00$ddVATRate']");

	private By VATRateElem = By.xpath("//INPUT[@name='ctl00$cPH$rptrProduct$ctl00$ltVATRate']");

	private By VATAmountElem = By.xpath("//INPUT[@name='ctl00$cPH$rptrProduct$ctl00$ltVATAmount']");

	private By AmountElem = By.xpath("//INPUT[@name='ctl00$cPH$rptrProduct$ctl00$ltAmount']");

	private By TickformorelineitemsElem = By.cssSelector("SPAN[onfocus='document\\.getElementById\\(\\'__LASTFOCUS\\'\\)\\.value\\=this\\.id']");

	private By SaveButtonElem = By.xpath("//A[@id='ctl00_cPH_btnSave']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/AccountUI/SupplierBillEditor.aspx?FYCode=52550&CompanyCode=13324&id=0&action=Add&bt=Bmenuid=0");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AccountUI/SupplierBillEditor.aspx?FYCode=52550&CompanyCode=13324&id=0&action=Add&bt=Bmenuid=0");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AccountUI/SupplierBillEditor.aspx?FYCode=52550&CompanyCode=13324&id=0&action=Add&bt=Bmenuid=0");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AccountUI/SupplierBillEditor.aspx?FYCode=52550&CompanyCode=13324&id=0&action=Add&bt=Bmenuid=0";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AccountUI/SupplierBillEditor.aspx?FYCode=52550&CompanyCode=13324&id=0&action=Add&bt=Bmenuid=0")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click ExpenditureTAB
     * @name Click ExpenditureTAB
     */
	public void Click_ExpenditureTAB()
	{
        
		WebElement elem = getWebElement(ExpenditureTABElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ExpenditureTAB", "Click_ExpenditureTAB failed. Unable to locate object: " + ExpenditureTABElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ExpenditureTAB", "Click_ExpenditureTAB failed. Unable to locate object: " + ExpenditureTABElem.toString());

			Assert.fail("Unable to locate object: " + ExpenditureTABElem.toString());
        }

		elem.click();
          	
		System.out.println("Click_ExpenditureTAB");
		ExtentReportManager.passStep(m_Driver, "Click_ExpenditureTAB");

		TestModellerLogger.PassStep(m_Driver, "Click_ExpenditureTAB");
	}

     
	/**
 	 * Click NewTAB
	 * @throws InterruptedException 
     * @name Click NewTAB
     */
	public void Click_NewTAB() throws InterruptedException
	{
        
		WebElement elem = getWebElement(NewTABElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_NewTAB", "Click_NewTAB failed. Unable to locate object: " + NewTABElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_NewTAB", "Click_NewTAB failed. Unable to locate object: " + NewTABElem.toString());

			Assert.fail("Unable to locate object: " + NewTABElem.toString());
        }
		Thread.sleep(2000);
		elem.click();
          	
		System.out.println("Click_NewTAB");
		ExtentReportManager.passStep(m_Driver, "Click_NewTAB");

		TestModellerLogger.PassStep(m_Driver, "Click_NewTAB");
	}

     
	/**
 	 * Click NewSupplierBill
     * @name Click NewSupplierBill
     */
	public void Click_NewSupplierBill()
	{
        
		WebElement elem = getWebElement(NewSupplierBillElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_NewSupplierBill", "Click_NewSupplierBill failed. Unable to locate object: " + NewSupplierBillElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_NewSupplierBill", "Click_NewSupplierBill failed. Unable to locate object: " + NewSupplierBillElem.toString());

			Assert.fail("Unable to locate object: " + NewSupplierBillElem.toString());
        }

		elem.click();
          	
		System.out.println("Click_NewSupplierBill");
		ExtentReportManager.passStep(m_Driver, "Click_NewSupplierBill");

		TestModellerLogger.PassStep(m_Driver, "Click_NewSupplierBill");
	}

    
	/**
 	 * Select SupplierName
     * @name Select SupplierName
     */
    public void Select_SupplierName(String SupplierName)
 	{
 	    
 		WebElement elem = getWebElement(SupplierNameElem);
 		System.out.println("dfdfd"+SupplierName);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_SupplierName", "Select_SupplierName failed. Unable to locate object: " + SupplierNameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_SupplierName", "Select_SupplierName failed. Unable to locate object: " + SupplierNameElem.toString());

 			Assert.fail("Unable to locate object: " + SupplierNameElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(SupplierName);
 		
 		System.out.println("Select_SupplierName ="+ SupplierName);
 		ExtentReportManager.passStep(m_Driver, "Select_SupplierName " + SupplierName);

 		TestModellerLogger.PassStep(m_Driver, "Select_SupplierName " + SupplierName);
 	}

      
	/**
 	 * Enter DefaultCurrency
     * @name Enter DefaultCurrency
     */
 	public void Enter_DefaultCurrency(String DefaultCurrency)
 	{
 	    
 		WebElement elem = getWebElement(DefaultCurrencyElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_DefaultCurrency", "Enter_DefaultCurrency failed. Unable to locate object: " + DefaultCurrencyElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_DefaultCurrency", "Enter_DefaultCurrency failed. Unable to locate object: " + DefaultCurrencyElem.toString());

 			Assert.fail("Unable to locate object: " + DefaultCurrencyElem.toString());
         }
 	
 		elem.sendKeys(DefaultCurrency);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_DefaultCurrency " + DefaultCurrency);

  		TestModellerLogger.PassStep(m_Driver, "Enter_DefaultCurrency " + DefaultCurrency);
 	}

      
	/**
 	 * Enter BillNo
	 * @throws InterruptedException 
     * @name Enter BillNo
     */
 	public void Enter_BillNo(String BillNo) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(BillNoElem);

 		System.out.println("BillNO"+BillNo);
 		BNO = BillNo;
 		
 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_BillNo", "Enter_BillNo failed. Unable to locate object: " + BillNoElem.toString());
    		
    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_BillNo", "Enter_BillNo failed. Unable to locate object: " + BillNoElem.toString());

 			Assert.fail("Unable to locate object: " + BillNoElem.toString());
         }
 		
 		elem.sendKeys(BillNo);
 	
 	System.out.println("Enter_BillNo ="+BillNo);
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_BillNo " + BillNo);

  		TestModellerLogger.PassStep(m_Driver, "Enter_BillNo " + BillNo);
 	}

      
	/**
 	 * Enter Date
     * @name Enter Date
     */
 	public void Enter_Date(String Date)
 	{
 	    
 		WebElement elem = getWebElement(DateElem);

// 		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Date", "Enter_Date failed. Unable to locate object: " + DateElem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Date", "Enter_Date failed. Unable to locate object: " + DateElem.toString());
//
// 			Assert.fail("Unable to locate object: " + DateElem.toString());
//         }
// 		for(int i=0; i<10;i++)
// 		{
// 			elem.sendKeys(Keys.BACK_SPACE);
// 		}
 		elem.sendKeys(Date);
 		//elem.sendKeys(Keys.TAB);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Date " + Date);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Date " + Date);
 	}

    
	/**
 	 * Select ExpenseType
	 * @throws InterruptedException 
     * @name Select ExpenseType
     */
    public void Select_ExpenseType(String ExpenseType) throws InterruptedException
 	{
 	    
 	//	WebElement elem = getWebElement(ExpenseTypeElem);

 		
 	
     		System.out.println(ExpenseType);
     		Thread.sleep(2000);
     		m_Driver.findElement(By.xpath("//*[@id='select2-ctl00_cPH_rptrProduct_ctl00_ltAccount-container']")).click();
     		Thread.sleep(1000);
     		m_Driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(ExpenseType);
     		m_Driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
     		//*[@id="select2-ctl00_cPH_rptrProduct_ctl00_ltAccount-container"]
 		//elem.click();
 		//Select dropdown = new Select(elem);
 		//Thread.sleep(2000);
 		//Select dropdown = new Select(elem);

 		//dropdown.selectByVisibleText("Purchases");
 		
 		System.out.println("Select_ExpenseType ="+ExpenseType);
 	
 	}

      
	/**
 	 * Enter Description
     * @name Enter Description
     */
 	public void Enter_Description(String Description)
 	{
 	    
 		WebElement elem = getWebElement(DescriptionElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Description", "Enter_Description failed. Unable to locate object: " + DescriptionElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Description", "Enter_Description failed. Unable to locate object: " + DescriptionElem.toString());

 			Assert.fail("Unable to locate object: " + DescriptionElem.toString());
         }

 		elem.sendKeys(Description);
 		
 		System.out.println("Enter_Description ="+Description);
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
 		elem.clear();
 		elem.sendKeys(UnitPrice);
 		
 		System.out.println("Enter_UnitPrice = "+UnitPrice);
  		ExtentReportManager.passStep(m_Driver, "Enter_UnitPrice " + UnitPrice);

  		TestModellerLogger.PassStep(m_Driver, "Enter_UnitPrice " + UnitPrice);
 	}

    
	/**
 	 * Select VATRateType
	 * @throws InterruptedException 
     * @name Select VATRateType
     */
    public void Select_VATRateType(String VATRateType) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(VATRateTypeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_VATRateType", "Select_VATRateType failed. Unable to locate object: " + VATRateTypeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_VATRateType", "Select_VATRateType failed. Unable to locate object: " + VATRateTypeElem.toString());

 			Assert.fail("Unable to locate object: " + VATRateTypeElem.toString());
         }
 		vatrate=VATRateType;
 		Select dropdown = new Select(elem);
 

 		dropdown.selectByVisibleText(VATRateType);
 		
 		System.out.println(VATRateType);
 		
 		System.out.println("Select_VATRateType ="+VATRateType);
 		ExtentReportManager.passStep(m_Driver, "Select_VATRateType " + VATRateType);

 		TestModellerLogger.PassStep(m_Driver, "Select_VATRateType " + VATRateType);
 	}

      
	/**
 	 * Enter VATRate
     * @name Enter VATRate
     */
 	public void Enter_VATRate(String VATRate)
 	{
 	    
 		WebElement elem = getWebElement(VATRateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_VATRate", "Enter_VATRate failed. Unable to locate object: " + VATRateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_VATRate", "Enter_VATRate failed. Unable to locate object: " + VATRateElem.toString());

 			Assert.fail("Unable to locate object: " + VATRateElem.toString());
         }

 		elem.sendKeys(VATRate);
 		
 		System.out.println("Enter_VATRate ="+VATRate);
  		ExtentReportManager.passStep(m_Driver, "Enter_VATRate " + VATRate);

  		TestModellerLogger.PassStep(m_Driver, "Enter_VATRate " + VATRate);
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
 		
 		System.out.println("Enter_VATAmount ="+VATAmount);
  		ExtentReportManager.passStep(m_Driver, "Enter_VATAmount " + VATAmount);

  		TestModellerLogger.PassStep(m_Driver, "Enter_VATAmount " + VATAmount);
 	}

      
	/**
 	 * Enter Amount
     * @name Enter Amount
     */
 	public void Enter_Amount(String Amount)
 	{
 	    
 		WebElement elem = getWebElement(AmountElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Amount", "Enter_Amount failed. Unable to locate object: " + AmountElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Amount", "Enter_Amount failed. Unable to locate object: " + AmountElem.toString());

 			Assert.fail("Unable to locate object: " + AmountElem.toString());
         }

 		elem.sendKeys(Amount);
 		
 		System.out.println("Enter_Amount ="+Amount);
  		ExtentReportManager.passStep(m_Driver, "Enter_Amount " + Amount);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Amount " + Amount);
 	}

     
	/**
 	 * Click Tickformorelineitems
     * @name Click Tickformorelineitems
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
 	 * Click SaveButton
	 * @throws InterruptedException 
	 * @throws AWTException 
	 * @throws IOException 
	 * @throws HeadlessException 
     * @name Click SaveButton
     */
	public void Click_SaveButton() throws InterruptedException, HeadlessException, IOException, AWTException
	{
		System.out.println("In Save");
        
		WebElement elem = getWebElement(SaveButtonElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SaveButton", "Click_SaveButton failed. Unable to locate object: " + SaveButtonElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SaveButton", "Click_SaveButton failed. Unable to locate object: " + SaveButtonElem.toString());

			Assert.fail("Unable to locate object: " + SaveButtonElem.toString());
        }
		//*[@id="ctl00_divSubContent"]/div[1]/div
		//elem.click();
		jsExec.executeScript("arguments[0].scrollIntoView(true);", elem);
		jsExec.executeScript("arguments[0].click();", elem);
		//Thread.sleep(4000);
		//Thread.sleep(1000);
	// WebElement inv1=m_Driver.findElement(By.xpath("//*[@id='ctl00_divSubContent']/div[1]/div"));
	   //  String invoicetransno=inv1.getText();
	   //  System.out.println(invoicetransno);
	//     String arr[]=invoicetransno.split(" ");
//	    inel=arr[3];
	   
	   // inel = invoicetransno.substring(24, 27);

	   // System.out.println(inel);
	//	GetSuccessText();
		System.out.println("Click_SaveButton");
		ExtentReportManager.passStep(m_Driver, "Click_SaveButton");

		TestModellerLogger.PassStep(m_Driver, "Click_SaveButton");
	}
//	public String message() 
//	{
//		System.out.println("message of invoive "    +inel);	
//		return inel;
//		
//		
//	}
	
	
	public void AddExpancetype(String HeadName) throws InterruptedException
	{
		Thread.sleep(2000);
		m_Driver.findElement(By.xpath("//*[@id=\"modal\"]/i")).click();//Click Puls Btn
		
		Thread.sleep(2000);
		
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='supplierbilleditormodalIFrame']"))); //Switch Frame 
		Thread.sleep(2000);
		utilities.Screenshotcapture.Getscreenshot(" New Expense Type Popup", "New Supplier");
		
		m_Driver.findElement(By.xpath("//*[@id=\"ctl00_cPH_txtExpenseHeadName\"]")).sendKeys(HeadName);//Send Name
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
 		utilities.Screenshotcapture.Getscreenshot("Add Entry And Fill Data", "New Supplier");
		Thread.sleep(1000);
		m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrProduct_ctl01_btnRemoveRow']/i")).click();
		Thread.sleep(1000);
		System.out.println("Add & Fill From Afterthat RemoveEntry");
		utilities.Screenshotcapture.Getscreenshot("Add Entry And Delete entry", "New Supplier");
		
		
		
	}
	
	
	public void  Recall_Last_Entry (String ChangeBillNum) throws InterruptedException
	{
		
		WebElement Recall=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_btnRecall']"));
		jsExec.executeScript("arguments[0].scrollIntoView(true);", Recall);
		jsExec.executeScript("arguments[0].click();", Recall);
		Thread.sleep(2000);
		WebElement ReBillNum=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_txtBillNo']"));
		jsExec.executeScript("arguments[0].scrollIntoView(true);", ReBillNum);
		ReBillNum.clear();
		ReBillNum.sendKeys(ChangeBillNum);
		Thread.sleep(1000);
		System.out.println("Recall_Last_Entry & ChangeBillNum ="+ChangeBillNum);
}
	
	public void CancelBtn()
	{
		WebElement CancelBtn=m_Driver.findElement(By.xpath("//*[@id=\"ctl00_cPH_btnCancel\"]"));
		jsExec.executeScript("arguments[0].scrollIntoView(true);", CancelBtn);
		
		jsExec.executeScript("arguments[0].click();", CancelBtn);
		System.out.println("CancelBtn");
	}
	
	
	public void ClickNewSupplierinDashboard() throws InterruptedException
	{
		
		m_Driver.findElement(By.xpath("//*[@id='ctl00_SideMenu1_dashboardMenu']/a/span")).click();   //Click Dashboard Btn
		Thread.sleep(1000);
		m_Driver.findElement(By.xpath("//*[@id='ctl00_divSubContent']/div[8]/a")).click();      //click AdvanceBtn
		Thread.sleep(1000);
		m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_AddSupplierDetailsl']/i")).click(); //Click +Btn Open New Supplier From
		//ChangeWindow.tabswitch(m_Driver);
		System.out.println("ClickNewSupplierinDashboard");
		
		
		
		
	}
	
		public void GetSuccessText() throws IOException, HeadlessException, AWTException, InterruptedException
	{
		
	int rowcount = m_Driver.findElements(By.xpath("//*[@id='ctl00_cPH_divfiltrec']/div/div/table/tbody/tr")).size();
	System.out.println(rowcount);
	
	for(int i=1; i<rowcount; i++)
	{
		int j=i-1;
		System.out.println("Hi loop"+i);
				
		WebElement dd= m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_divfiltrec']/div/div/table/tbody/tr["+ i +"]/td[5]"));

		String str =dd.getText();
		
		if(BNO.equalsIgnoreCase(str))
		{
			
			
			System.out.print("Hi Enter in if Loop");
					String st= m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_divfiltrec']/div/div/table/tbody/tr["+ i +"]/td[2]")).getText();
					Thread.sleep(1000);
					System.out.println("sdfsfd"+st);
					m_Driver.findElement(By.xpath("//a[text()='"+st+"']")).click();
					Screenshotcapture.captureAsImage(m_Driver, BNO);
				
			break;
		}
		
	}
	
	}
		public String vatrate1()
		{
			return vatrate;
		}
		public void Threedotcopy() throws InterruptedException
		{
			m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_divfiltrec']/div/div/table/tbody/tr[1]/td[14]/div/a")).click();
			m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrDisplayRecords_ctl00_lnkCopy']")).click();
			
			Thread.sleep(2000);
			m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_txtBillNo']")).sendKeys("Copy");
			
	        jsExec.executeScript("arguments[0].scrollIntoView(true);", m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_btnSave']")));
			
			jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_btnSave']")));
			
			
			Thread.sleep(2000);
		
			
		}
		
		public void HilightCopyDebitNoteBanking() throws InterruptedException
		{
			Thread.sleep(2000);
			WebElement elem=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_divfiltrec']/div/div/table/tbody/tr[2]/td[5]"));
			jsExec.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", elem);
			utilities.Screenshotcapture.Getscreenshot("Copy Debit Note Partial With Banking", "Supplier Reconcile");

		}
		public void HilightCopyDebitNoteJournal() throws InterruptedException
		{
			Thread.sleep(2000);
			WebElement elem=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_divfiltrec']/div/div/table/tbody/tr[2]/td[5]"));
			jsExec.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", elem);
			utilities.Screenshotcapture.Getscreenshot("Copy Debit Note Partial With Journal Entry", "Supplier Reconcile");

		}
		public void Search(String Select,String SelName)
		{
			WebElement SelectCetegary=m_Driver.findElement(By.xpath("//select[@id='ctl00_cPHFilter_dd_Search']"));
			Select sl=new Select(SelectCetegary);
					sl.selectByVisibleText(Select);
			
			m_Driver.findElement(By.xpath("//*[@id='ctl00_cPHFilter_txtSearch']")).sendKeys(SelName);
			
			m_Driver.findElement(By.xpath("//*[@id='ctl00_cPHFilter_btnSearch']")).click();
			
			
		}
		public void SupplierScreenshot () throws InterruptedException
		{
			Thread.sleep(4000);
			WebElement elem=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrDisplayRecords_ctl00_tdCol1']"));
			jsExec.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", elem);
			utilities.Screenshotcapture.Getscreenshot("Supplier Bil Advance Reconililation With Bank Amount Due Zero", "Supplier Reconcile");
		}
		public void SupplierScreenshot_1() throws InterruptedException
		{
			Thread.sleep(4000);
			WebElement elem=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrDisplayRecords_ctl00_tdCol1']"));
			jsExec.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", elem);
			utilities.Screenshotcapture.Getscreenshot("Supplier Bil Advance Reconililation With Journal Entry Amount Due Zero", "Supplier Reconcile");
		}
		
		public void SupplierReconWithDebitNote () throws InterruptedException
		{
			Thread.sleep(4000);
			WebElement elem=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrDisplayRecords_ctl00_tdCol1']"));
			jsExec.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", elem);
			WebElement elem1=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrDisplayRecords_ctl01_tdCol1']"));
			jsExec.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", elem1);
			utilities.Screenshotcapture.Getscreenshot("Supplier bill and Debit Note  Amount Due Column should be Zer0", "Supplier Reconcile");
		}
		
		public void AdvanceDebitNoteScreenshot () throws InterruptedException
		{
			Thread.sleep(4000);
			WebElement elem=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrDisplayRecords_ctl00_tdCol1']"));
			jsExec.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", elem);
			utilities.Screenshotcapture.Getscreenshot("Debit Note Advance Reconililation With Bank Amount Due Zero", "Supplier Reconcile");
		}
		public void AdvanceDebitNoteJournalScreenshot () throws InterruptedException
		{
			Thread.sleep(4000);
			WebElement elem=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrDisplayRecords_ctl00_tdCol1']"));
			jsExec.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", elem);
			utilities.Screenshotcapture.Getscreenshot("Advance Reconcile DebitNote With Journal Entry Dashboard Amount Due  Zero", "Supplier Reconcile");
		}
		public void PartialDebitNoteScreenshot () throws InterruptedException
		{
			Thread.sleep(4000);
			WebElement elem=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrDisplayRecords_ctl00_tdCol1']"));
			jsExec.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", elem);
			utilities.Screenshotcapture.Getscreenshot("Partial Reconcile DebitNote With Bank Dashboard Due Amount  ", "Supplier Reconcile");
		}
		public void PartialDebitNoteJournalScreenshot () throws InterruptedException
		{
			Thread.sleep(4000);
			WebElement elem=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrDisplayRecords_ctl00_tdCol1']"));
			jsExec.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", elem);
			utilities.Screenshotcapture.Getscreenshot("Partial Reconcile DebitNote With Jouranl Entry Dashboard  Due Amount ", "Supplier Reconcile");
		}
}