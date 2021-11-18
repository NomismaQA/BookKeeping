package As_Supplier;

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
import utilities.Screenshotcapture;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/9b76fd86-6edb-454e-b5d9-d380fbdf2dde
@TestModellerModule(guid = "9b76fd86-6edb-454e-b5d9-d380fbdf2dde")
public class DebitNoteSToFRS extends BasePage
{
	public static String vatrate;
	public DebitNoteSToFRS (WebDriver driver)
	{
		super(driver);
	}

String BNO;
	
	//private By ExpenditureTABElem = By.xpath("//A[@href='../AccountUI/SupplierBill.aspx?FYCode=52552&CompanyCode=13326']");

//@id='ctl00_cPH_rptrReconcile_ctl00_rptrDebitCredit_ctl124_cbSelect
     private By ExpenditureTABElem = By.xpath("//span[contains(text(), 'Expenditure')]");

	private By NewTABElem = By.xpath("//*[@id='ctl00_divMainContent']/header/div/div[4]/a");

	private By NewDebitNoteElem = By.xpath("//A[@id='ctl00_cpHeaderRight_btnAddDebitNote']");

	private By SupplierNameElem = By.xpath("//SELECT[@name='ctl00$cPH$ddlSupplier']");

	private By BillNoElem = By.xpath("//INPUT[@name='ctl00$cPH$txtBillNo']");

	private By DateElem = By.xpath("//INPUT[@name='ctl00$cPH$txtDate']");

	private By ExpenseTypeElem = By.xpath("//SELECT[@name='ctl00$cPH$rptrProduct$ctl00$ddExpenseHead']");

	private By DescriptionElem = By.xpath("//TEXTAREA[@name='ctl00$cPH$rptrProduct$ctl00$txtDescription']");

	private By UnitPriceElem = By.xpath("//INPUT[@name='ctl00$cPH$rptrProduct$ctl00$txtUnitPrice']");

	private By VATRateTypeElem = By.xpath("//SELECT[@name='ctl00$cPH$rptrProduct$ctl00$ddVATRate']");

	private By VATRateElem = By.xpath("//INPUT[@name='ctl00$cPH$rptrProduct$ctl00$ltVATRate']");

	private By VATAmountElem = By.xpath("//INPUT[@name='ctl00$cPH$rptrProduct$ctl00$ltVATAmount']");

	private By Amount_NetElem = By.xpath("//INPUT[@name='ctl00$cPH$rptrProduct$ctl00$ltAmount']");

	private By TickformorelineitemsElem = By.xpath("//INPUT[@id='ctl00_cPH_chkAddMore']");

	private By _Save_Elem = By.xpath("//A[@id='ctl00_cPH_btnSave']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/AccountUI/SupplierBillEditor.aspx?FYCode=52552&CompanyCode=13326&id=0&action=Add&bt=D");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AccountUI/SupplierBillEditor.aspx?FYCode=52552&CompanyCode=13326&id=0&action=Add&bt=D");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AccountUI/SupplierBillEditor.aspx?FYCode=52552&CompanyCode=13326&id=0&action=Add&bt=D");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AccountUI/SupplierBillEditor.aspx?FYCode=52552&CompanyCode=13326&id=0&action=Add&bt=D";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AccountUI/SupplierBillEditor.aspx?FYCode=52552&CompanyCode=13326&id=0&action=Add&bt=D")) {
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
          	System.out.println("Click_NewTAB");

		ExtentReportManager.passStep(m_Driver, "Click_NewTAB");

		TestModellerLogger.PassStep(m_Driver, "Click_NewTAB");
	}

     
	/**
 	 * Click NewDebitNote
	 * @throws InterruptedException 
     * @name Click NewDebitNote
     */
	public void Click_NewDebitNote() throws InterruptedException
	{
        
		WebElement elem = getWebElement(NewDebitNoteElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_NewDebitNote", "Click_NewDebitNote failed. Unable to locate object: " + NewDebitNoteElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_NewDebitNote", "Click_NewDebitNote failed. Unable to locate object: " + NewDebitNoteElem.toString());

			Assert.fail("Unable to locate object: " + NewDebitNoteElem.toString());
        }

		elem.click();
          	System.out.println("Click_NewDebitNote");
          	Thread.sleep(1000);
         // 	utilities.Screenshotcapture.Getscreenshot("Blank line default Current  date default", "New Debit Note ");
          	utilities.Screenshotcapture.Getscreenshot("Blank line default Current  date default", "New Debit Note");

		ExtentReportManager.passStep(m_Driver, "Click_NewDebitNote");

		TestModellerLogger.PassStep(m_Driver, "Click_NewDebitNote");
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

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(SupplierName);
 		
System.out.println("Select_SupplierName ="+SupplierName);
 		ExtentReportManager.passStep(m_Driver, "Select_SupplierName " + SupplierName);

 		TestModellerLogger.PassStep(m_Driver, "Select_SupplierName " + SupplierName);
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

 		elem.sendKeys(BillNo);
 		System.out.println("Enter_BillNo = "+BillNo);
 		
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

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Date", "Enter_Date failed. Unable to locate object: " + DateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Date", "Enter_Date failed. Unable to locate object: " + DateElem.toString());

 			Assert.fail("Unable to locate object: " + DateElem.toString());
         }

 		elem.sendKeys(Date);
 		System.out.println("Enter_Date");
 		
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
   // 	String expence=m_Driver.findElement(By.xpath("//*[@id='select2-ctl00_cPH_rptrProduct_ctl00_ltAccount-container']")).getText();
	//	System.out.println(expence);
	//	System.out.println("Select_ExpenseType ="+ExpenseType);
 	
 		System.out.println(ExpenseType);
 		Thread.sleep(2000);
 		m_Driver.findElement(By.xpath("//*[@id='select2-ctl00_cPH_rptrProduct_ctl00_ltAccount-container']")).click();
 		m_Driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(ExpenseType);
 		m_Driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
 		//*[@id="select2-ctl00_cPH_rptrProduct_ctl00_ltAccount-container"]
		//elem.click();
		//Select dropdown = new Select(elem);
		//Thread.sleep(2000);
		//Select dropdown = new Select(elem);

		//dropdown.selectByVisibleText("Purchases");
 	//	String expence=m_Driver.findElement(By.xpath("//*[@id='select2-ctl00_cPH_rptrProduct_ctl00_ltAccount-container']")).getText();
	//	System.out.println(expence);
		System.out.println("Select_ExpenseType ="+ExpenseType);
 		//Select dropdown = new Select(elem);

 	//	dropdown.selectByVisibleText(ExpenseType);
 		
 		
 		
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
 		vatrate=VATRateType;
 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(VATRateType);
 		
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
		//GetSuccessText();
		System.out.println("Click__Save_");
		Thread.sleep(2000);
		
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
		System.out.println("Ã�nn"+BNO);
		System.out.println("2i"+i);
		if(BNO.equalsIgnoreCase(str))
		{
			
			System.out.print("Hi Enter in if Loop");
					String st= m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_divfiltrec']/div/div/table/tbody/tr["+ i +"]/td[2]")).getText();
					Thread.sleep(1000);
					System.out.println("sdfsfdsfdsfdsfds"+st);
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
	
	
	public void AddRemoveEntry() throws InterruptedException
	{
		Thread.sleep(2000);
		m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrProduct_ctl01_btnRemoveRow']/i")).click();
		Thread.sleep(2000);
		m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrProduct_ctl01_btnRemoveRow']/i")).click();
		Thread.sleep(2000);
		m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrProduct_ctl00_btnaddMore']/i")).click();// AddEntry
		Thread.sleep(2000);

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
 		utilities.Screenshotcapture.Getscreenshot("Add Entry And Fill Data", "New Debit Note");
		Thread.sleep(2000);
		m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrProduct_ctl01_btnRemoveRow']/i")).click();
		Thread.sleep(2000);
		System.out.println("Add & Fill From Afterthat RemoveEntry");
		utilities.Screenshotcapture.Getscreenshot("Add Entry And Delete entry", "New Debit Note");
		
		
		
	}
	
	public void AddExpancetype(String HeadName) throws InterruptedException
	{
		Thread.sleep(2000);
		m_Driver.findElement(By.xpath("//*[@id=\"modal\"]/i")).click();//Click Puls Btn
		
		Thread.sleep(2000);
		
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='supplierbilleditormodalIFrame']"))); //Switch Frame 
		Thread.sleep(2000);
		utilities.Screenshotcapture.Getscreenshot(" New Expense Type Popup", "New Debit Note");
		
		m_Driver.findElement(By.xpath("//*[@id=\"ctl00_cPH_txtExpenseHeadName\"]")).sendKeys(HeadName);//Send Name
		Thread.sleep(1000);
		m_Driver.findElement(By.xpath("//*[@id='ctl00_cphFooter_btnSave']")).click();    //Save Btn
		System.out.println("AddExpancetype ="+HeadName);
		}

		
		
		
		
		
	public void Click_CancelBtn() throws InterruptedException
	{
		
		Thread.sleep(2000);
		
		WebElement CancelBtn=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_btnCancel']"));
		
		jsExec.executeScript("arguments[0].scrollIntoView(true);", CancelBtn);
		jsExec.executeScript("arguments[0].click();", CancelBtn);
		System.out.println("Click_CancelBtn");
		utilities.Screenshotcapture.Getscreenshot("After CancelBtn Previous Page.", "New Debit Note");
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
	
	
	
	
	
	
	
	
	
	
	
}