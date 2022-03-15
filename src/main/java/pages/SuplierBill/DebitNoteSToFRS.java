package pages.SuplierBill;
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
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;

import utilities.reports.ExtentReportManager;
import utilities.testmodeller.GetScreenShot;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/9b76fd86-6edb-454e-b5d9-d380fbdf2dde
@TestModellerModule(guid = "9b76fd86-6edb-454e-b5d9-d380fbdf2dde")
public class DebitNoteSToFRS extends BasePage
{
	public DebitNoteSToFRS (WebDriver driver)
	{
		super(driver);
	}
////SELECT[@name='ctl00$cPH$rptrProduct$ctl00$ddExpenseHead']
String BNO;
	
	//private By ExpenditureTABElem = By.xpath("//A[@href='../AccountUI/SupplierBill.aspx?FYCode=52552&CompanyCode=13326']");

     private By ExpenditureTABElem = By.xpath("//span[contains(text(), 'Expenditure')]");

	private By NewTABElem = By.xpath("//*[@id='ctl00_divMainContent']/header/div/div[4]/a");

	private By NewDebitNoteElem = By.xpath("//A[contains(text(),'New Debit Note')]");

	private By SupplierNameElem = By.xpath("//SELECT[@name='ctl00$cPH$ddlSupplier']");

	private By BillNoElem = By.xpath("//INPUT[@name='ctl00$cPH$txtBillNo']");

	private By DateElem = By.xpath("//INPUT[@name='ctl00$cPH$txtDate']");

	private By ExpenseTypeElem = By.xpath("//*[@id='select2-ctl00_cPH_rptrProduct_ctl00_ltAccount-container']");

	private By DescriptionElem = By.xpath("//TEXTAREA[@name='ctl00$cPH$rptrProduct$ctl00$txtDescription']");

	private By UnitPriceElem = By.xpath("//INPUT[@name='ctl00$cPH$rptrProduct$ctl00$txtUnitPrice']");

	private By VATRateTypeElem = By.xpath("//SELECT[@name='ctl00$cPH$rptrProduct$ctl00$ddVATRate']");

	private By VATRateElem = By.xpath("//INPUT[@name='ctl00$cPH$rptrProduct$ctl00$ltVATRate']");

	private By VATAmountElem = By.xpath("//INPUT[@name='ctl00$cPH$rptrProduct$ctl00$ltVATAmount']");

	private By Amount_NetElem = By.xpath("//INPUT[@name='ctl00$cPH$rptrProduct$ctl00$ltAmount']");

	private By TickformorelineitemsElem = By.xpath("//INPUT[@id='ctl00_cPH_chkAddMore']");

	private By _Save_Elem = By.xpath("//A[@id='ctl00_cPH_btnSave']");
	private By BOX22Elem= By.xpath("//INPUT[@class='select2-search__field el-selection']");

	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AccountUI/SupplierBillEditor.aspx?FYCode=52552&CompanyCode=13326&id=0&action=Add&bt=D");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/SupplierBillEditor.aspx?FYCode=52552&CompanyCode=13326&id=0&action=Add&bt=D");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/SupplierBillEditor.aspx?FYCode=52552&CompanyCode=13326&id=0&action=Add&bt=D");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/AccountUI/SupplierBillEditor.aspx?FYCode=52552&CompanyCode=13326&id=0&action=Add&bt=D";

        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/AccountUI/SupplierBillEditor.aspx?FYCode=52552&CompanyCode=13326&id=0&action=Add&bt=D")) {
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
          	

		ExtentReportManager.passStep(m_Driver, "Click_ExpenditureTAB");

		TestModellerLogger.PassStep(m_Driver, "Click_ExpenditureTAB");
	}

     
	/**
 	 * Click NewTAB
     * @name Click NewTAB
     */
	public void Click_NewTAB()
	{
        
		WebElement elem = getWebElement(NewTABElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_NewTAB", "Click_NewTAB failed. Unable to locate object: " + NewTABElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_NewTAB", "Click_NewTAB failed. Unable to locate object: " + NewTABElem.toString());

			Assert.fail("Unable to locate object: " + NewTABElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_NewTAB");

		TestModellerLogger.PassStep(m_Driver, "Click_NewTAB");
	}

     
	/**
 	 * Click NewDebitNote
     * @name Click NewDebitNote
     */
	public void Click_NewDebitNote()
	{
        
		WebElement elem = getWebElement(NewDebitNoteElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_NewDebitNote", "Click_NewDebitNote failed. Unable to locate object: " + NewDebitNoteElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_NewDebitNote", "Click_NewDebitNote failed. Unable to locate object: " + NewDebitNoteElem.toString());

			Assert.fail("Unable to locate object: " + NewDebitNoteElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_NewDebitNote");

		TestModellerLogger.PassStep(m_Driver, "Click_NewDebitNote");
	}

	/**
 	 * Enter BillNo
     * @name Enter BillNo
     */
 	public void Enter_BillNo(String BillNo)
 	{
 	    
 		WebElement elem = getWebElement(BillNoElem);
 		BNO = BillNo;

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_BillNo", "Enter_BillNo failed. Unable to locate object: " + BillNoElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_BillNo", "Enter_BillNo failed. Unable to locate object: " + BillNoElem.toString());

 			Assert.fail("Unable to locate object: " + BillNoElem.toString());
         }
 		//elem.sendKeys(Keys.ENTER);

 		elem.sendKeys(BillNo);
 		System.out.println("debit Bill no enter");
 	
  		ExtentReportManager.passStep(m_Driver, "Enter_BillNo " + BillNo);

  		TestModellerLogger.PassStep(m_Driver, "Enter_BillNo " + BillNo);
 	}
    
	/**
 	 * Select SupplierName
     * @name Select SupplierName
     */
    public void Select_SupplierName(String SupplierName)
 	{
 	    
 		WebElement elem = getWebElement(SupplierNameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_SupplierName", "Select_SupplierName failed. Unable to locate object: " + SupplierNameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_SupplierName", "Select_SupplierName failed. Unable to locate object: " + SupplierNameElem.toString());

 			Assert.fail("Unable to locate object: " + SupplierNameElem.toString());
         }
 
 		  WebElement ele =m_Driver.findElement(By.xpath("//Select[@id='ctl00_cPH_ddlSupplier']"));
          Select dropdown = new Select(ele);
//
     		dropdown.selectByVisibleText(SupplierName);
     		System.out.println(SupplierName);
// 		elem.sendKeys(Keys.UP);
 		
// 	elem.sendKeys(Keys.ENTER);
// 		String sup=SupplierName;
// 		
// 		System.out.println(" " +sup);
// 		m_Driver.findElement(By.xpath("//*[contains(text(),'"+sup+"')]")).click();
// 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_SupplierName " + SupplierName);

 		TestModellerLogger.PassStep(m_Driver, "Select_SupplierName " + SupplierName);
 	}

      
	

      
	/**
 	 * Enter Date
     * @name Enter Date
     */
 	public void Enter_Date(String Date)
 	{
 	    
 		WebElement elem = getWebElement(DateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Date", "Enter_Date failed. Unable to locate object: " + DateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Date", "Enter_Date failed. Unable to locate object: " + DateElem.toString());

 			Assert.fail("Unable to locate object: " + DateElem.toString());
         }
System.out.println("enter date");
      for(int i=0; i<10;i++)
	{
		elem.sendKeys(Keys.BACK_SPACE);
	}
	   elem.sendKeys(Date);
	   elem.sendKeys(Keys.TAB);
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Date " + Date);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Date " + Date);
 	}

    
	/**
 	 * Select ExpenseType
     * @name Select ExpenseType
     */
    public void click_ExpenseType()
 	{
 	    
 		WebElement elem = getWebElement(ExpenseTypeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_ExpenseType", "Select_ExpenseType failed. Unable to locate object: " + ExpenseTypeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_ExpenseType", "Select_ExpenseType failed. Unable to locate object: " + ExpenseTypeElem.toString());

 			Assert.fail("Unable to locate object: " + ExpenseTypeElem.toString());
         }

 		elem.click();
 		
 		

 		//INPUT[@class='select2-search__field el-selection']
 		
 		
// 		Select dropdown = new Select(elem);
//
// 		dropdown.selectByVisibleText(ExpenseType);
// 		
// 		System.out.println("expentype selection");
// 		ExtentReportManager.passStep(m_Driver, "Select_ExpenseType " + ExpenseType);
//
// 		TestModellerLogger.PassStep(m_Driver, "Select_ExpenseType " + ExpenseType);
// 		elem.sendKeys(Keys.DOWN);
 		
 	}
 	public void Enter_BOX22(String BOX22) throws InterruptedException
 	{
 	    
 		//WebElement elem = getWebElement(BOX2Elem);

// 		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_BOX2", "Enter_BOX2 failed. Unable to locate object: " + BOX2Elem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_BOX2", "Enter_BOX2 failed. Unable to locate object: " + BOX2Elem.toString());
//
// 			Assert.fail("Unable to locate object: " + BOX2Elem.toString());
//         }
 		

 	        //elem.sendKeys(BOX2);
 	       // elem.sendKeys(Keys.ENTER);
 	         String p =BOX22;
 	         System.out.print("box2"   +p );
 	        //m_Driver.findElement(By.xpath("//*[Contains(text(),'" +p+ "')]")).click();
 	         ////*[contains(text(),'ABC')]
 	         m_Driver.findElement(By.xpath("//*[contains(text(),'" +p+ "')]")).click();
 	         Thread.sleep(5000);
 	        
// 	        WebDriverWait wait = new WebDriverWait(m_Driver, 10);
// 	       wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("INPUT[aria-autocomplete='list']"))).click();
 			
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
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_UnitPrice " + UnitPrice);

  		TestModellerLogger.PassStep(m_Driver, "Enter_UnitPrice " + UnitPrice);
 	}

    
	/**
 	 * Select VATRateType
     * @name Select VATRateType
     */
    public void Select_VATRateType(String VATRateType)
 	{
 	    
 		WebElement elem = getWebElement(VATRateTypeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_VATRateType", "Select_VATRateType failed. Unable to locate object: " + VATRateTypeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_VATRateType", "Select_VATRateType failed. Unable to locate object: " + VATRateTypeElem.toString());

 			Assert.fail("Unable to locate object: " + VATRateTypeElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(VATRateType);
 		
 		
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
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_VATAmount " + VATAmount);

  		TestModellerLogger.PassStep(m_Driver, "Enter_VATAmount " + VATAmount);
 	}

      
	/**
 	 * Enter Amount_Net
     * @name Enter Amount_Net
     */
 	public void Enter_Amount_Net(String Amount_Net)
 	{
 	    
 		WebElement elem = getWebElement(Amount_NetElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Amount_Net", "Enter_Amount_Net failed. Unable to locate object: " + Amount_NetElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Amount_Net", "Enter_Amount_Net failed. Unable to locate object: " + Amount_NetElem.toString());

 			Assert.fail("Unable to locate object: " + Amount_NetElem.toString());
         }

 		elem.sendKeys(Amount_Net);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Amount_Net " + Amount_Net);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Amount_Net " + Amount_Net);
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
 	 * Click  Save 
	 * @throws InterruptedException 
	 * @throws AWTException 
	 * @throws IOException 
	 * @throws HeadlessException 
     * @name Click  Save 
     */
	public void Click__Save_() throws HeadlessException, IOException, AWTException, InterruptedException
	{
        
		WebElement elem = getWebElement(_Save_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Save_", "Click__Save_ failed. Unable to locate object: " + _Save_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Save_", "Click__Save_ failed. Unable to locate object: " + _Save_Elem.toString());

			Assert.fail("Unable to locate object: " + _Save_Elem.toString());
        }

		//elem.click();
		jsExec.executeScript("arguments[0].scrollIntoView(true);", elem);
		jsExec.executeScript("arguments[0].click();", elem);
		GetSuccessText();

		ExtentReportManager.passStep(m_Driver, "Click__Save_");

		TestModellerLogger.PassStep(m_Driver, "Click__Save_");
	}
	
	public void GetSuccessText() throws IOException, HeadlessException, AWTException, InterruptedException
	{
		//WebElement elem1 = m_Driver.findElement(By.xpath("//*[@id='ctl00_divSubContent']/div[1]/div"));
		
		//*[@id="ctl00_divSubContent"]/div[1]/div
		
	int rowcount = m_Driver.findElements(By.xpath("//*[@id='ctl00_cPH_divfiltrec']/div/div/table/tbody/tr")).size();
	System.out.println(rowcount);
	
	for(int i=1; i<rowcount; i++)
	{
		int j=i-1;
		System.out.println("Hi loop"+i);
		//*[@id="ctl00_cPH_divfiltrec"]/div/div/table/tbody/tr[1]/td[2]
		
		WebElement dd= m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_divfiltrec']/div/div/table/tbody/tr["+ i +"]/td[5]"));

		String str =dd.getText();
		
		System.out.println("123"+str);
		System.out.println("bill no"+BNO);
		System.out.println("2i :"+i);
		if(BNO.equalsIgnoreCase(str))
		{
			
			System.out.print("Hi Enter in if Loop");
					String st= m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_divfiltrec']/div/div/table/tbody/tr["+ i +"]/td[2]")).getText();
					Thread.sleep(1000);
					System.out.println("sdfsfdsfdsfdsfds"+st);
				
					GetScreenShot.captureAsImage(m_Driver, BNO);
				
			break;
		}
		
	}
	
	}
}