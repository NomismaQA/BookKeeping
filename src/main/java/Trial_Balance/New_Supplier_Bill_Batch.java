package Trial_Balance;

import pages.BasePage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;

import Generic.SeleniumLib;
import Generic.WaitStatementLib;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/5914549a-f67f-4fb6-8807-c68be7fec2fe
@TestModellerModule(guid = "5914549a-f67f-4fb6-8807-c68be7fec2fe")
public class New_Supplier_Bill_Batch extends BasePage
{
	SeleniumLib sl;
	public New_Supplier_Bill_Batch (WebDriver driver)
	{
		
		super(driver);
		sl= new SeleniumLib(driver);
	}


	
	private By Expenditure1Elem = By.xpath("//*[@id='ctl00_SideMenu1_ExpensesMenu']/a/span");

	private By View_New_2Elem = By.xpath("//*[@id='ctl00_divMainContent']/header/div/div[4]/a");

	private By New_Supplier_Bill_Batch_3Elem = By.xpath("//A[@id='ctl00_cpHeaderRight_btnAddBatch']");

	private By Save_4Elem = By.xpath("//A[@id='ctl00_cpHFooter_btnSave']");
	private By Save_More_Elem = By.xpath("//*[@id='ctl00_cpHFooter_btnSaveAddMore']");
	
	private By Date_Elem = By.xpath("//Input[@id='ctl00_cPH_rptrProduct_ctl00_txtDate']");
	private By Date_Elem1 = By.xpath("//Input[@id='ctl00_cPH_rptrProduct_ctl01_txtDate']");
	private By Date_Elem2 = By.xpath("//Input[@id='ctl00_cPH_rptrProduct_ctl02_txtDate']");
	private By Date_Elem3 = By.xpath("//Input[@id='ctl00_cPH_rptrProduct_ctl03_txtDate']");
	private By Date_Elem4 = By.xpath("//Input[@id='ctl00_cPH_rptrProduct_ctl04_txtDate']");
	

	private By Select_Supplier_0Elem = By.xpath("//SELECT[@name='ctl00$cPH$rptrProduct$ctl00$ddlSupplier']");
	private By Select_Supplier_1Elem = By.xpath("//SELECT[@name='ctl00$cPH$rptrProduct$ctl01$ddlSupplier']");
	private By Select_Supplier_2Elem = By.xpath("//SELECT[@name='ctl00$cPH$rptrProduct$ctl02$ddlSupplier']");
	private By Select_Supplier_3Elem = By.xpath("//SELECT[@name='ctl00$cPH$rptrProduct$ctl03$ddlSupplier']");
	private By Select_Supplier_4Elem = By.xpath("//SELECT[@name='ctl00$cPH$rptrProduct$ctl04$ddlSupplier']");
	

	private By Select_Supplier_Bill_Type_0Elem = By.xpath("//SELECT[@name='ctl00$cPH$rptrProduct$ctl00$ddSupplierBillType']");
	private By Select_Supplier_Bill_Type_1Elem = By.xpath("//SELECT[@name='ctl00$cPH$rptrProduct$ctl01$ddSupplierBillType']");
	private By Select_Supplier_Bill_Type_2Elem = By.xpath("//SELECT[@name='ctl00$cPH$rptrProduct$ctl02$ddSupplierBillType']");
	private By Select_Supplier_Bill_Type_3Elem = By.xpath("//SELECT[@name='ctl00$cPH$rptrProduct$ctl03$ddSupplierBillType']");
	private By Select_Supplier_Bill_Type_4Elem = By.xpath("//SELECT[@name='ctl00$cPH$rptrProduct$ctl04$ddSupplierBillType']");
	
	private By Enter_Bill_No_0Elem = By.xpath("//INPUT[@name='ctl00$cPH$rptrProduct$ctl00$txtBillNo']");
	private By Enter_Bill_No_1Elem = By.xpath("//INPUT[@name='ctl00$cPH$rptrProduct$ctl01$txtBillNo']");
	private By Enter_Bill_No_2Elem = By.xpath("//INPUT[@name='ctl00$cPH$rptrProduct$ctl02$txtBillNo']");
	private By Enter_Bill_No_3Elem = By.xpath("//INPUT[@name='ctl00$cPH$rptrProduct$ctl03$txtBillNo']");
	private By Enter_Bill_No_4Elem = By.xpath("//INPUT[@name='ctl00$cPH$rptrProduct$ctl04$txtBillNo']");

	private By Description_0Elem = By.xpath("//INPUT[@name='ctl00$cPH$rptrProduct$ctl00$txtDescription']");
	private By Description_1Elem = By.xpath("//INPUT[@name='ctl00$cPH$rptrProduct$ctl01$txtDescription']");
	private By Description_2Elem = By.xpath("//INPUT[@name='ctl00$cPH$rptrProduct$ctl02$txtDescription']");
	private By Description_3Elem = By.xpath("//INPUT[@name='ctl00$cPH$rptrProduct$ctl03$txtDescription']");
	private By Description_4Elem = By.xpath("//INPUT[@name='ctl00$cPH$rptrProduct$ctl04$txtDescription']");

	private By Enter_NetTotal_0Elem = By.xpath("//INPUT[@name='ctl00$cPH$rptrProduct$ctl00$txtNetTotal']");
	private By Enter_NetTotal_1Elem = By.xpath("//INPUT[@name='ctl00$cPH$rptrProduct$ctl01$txtNetTotal']");
	private By Enter_NetTotal_2Elem = By.xpath("//INPUT[@name='ctl00$cPH$rptrProduct$ctl02$txtNetTotal']");
	private By Enter_NetTotal_3Elem = By.xpath("//INPUT[@name='ctl00$cPH$rptrProduct$ctl03$txtNetTotal']");
	private By Enter_NetTotal_4Elem = By.xpath("//INPUT[@name='ctl00$cPH$rptrProduct$ctl04$txtNetTotal']");

	private By Select_VATRate_10Elem = By.xpath("//SELECT[@name='ctl00$cPH$rptrProduct$ctl00$ddVATRate']");
	
	
	private By Expense_0 = By.xpath("//*[@id='select2-ctl00_cPH_rptrProduct_ctl00_ltAccount-container']");
	private By Expense_1 = By.xpath("//*[@id='select2-ctl00_cPH_rptrProduct_ctl01_ltAccount-container']");
	private By Expense_2 = By.xpath("//*[@id='select2-ctl00_cPH_rptrProduct_ctl02_ltAccount-container']");
	private By Expense_3 = By.xpath("//*[@id='select2-ctl00_cPH_rptrProduct_ctl03_ltAccount-container']");
	private By Expense_4 = By.xpath("//*[@id='select2-ctl00_cPH_rptrProduct_ctl04_ltAccount-container']");
	
	
	
	private By Expense_Get1 = By.xpath("//*[@id='select2-ctl00_cPH_rptrProduct_ctl00_ltAccount-container']");
	private By Expense_Get2 = By.xpath("//*[@id='select2-ctl00_cPH_rptrProduct_ctl01_ltAccount-container']");
	private By Expense_Get3 = By.xpath("//*[@id='select2-ctl00_cPH_rptrProduct_ctl02_ltAccount-container']");
	private By Expense_Get4 = By.xpath("//*[@id='select2-ctl00_cPH_rptrProduct_ctl03_ltAccount-container']");
	private By Expense_Get5 = By.xpath("//*[@id='select2-ctl00_cPH_rptrProduct_ctl04_ltAccount-container']");
	
	private String LedgerEntered_1;
	private String LedgerEntered_2;
	private String LedgerEntered_3;
	private String LedgerEntered_4;
	private String LedgerEntered_5;
	private String LedgerEntered_6;
	private String LedgerEntered_7;
	private String LedgerEntered_8;
	private String LedgerEntered_9;
	private String LedgerEntered_10;
	private String LedgerEntered_11;

	private ArrayList<String> ledger=new ArrayList<String>();
	private ArrayList<String> expected_entry= new ArrayList<String>();
	private ArrayList<String> amt=new ArrayList<String>();
	
	
	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AccountUI/SupplierBillEditorBatch.aspx?FYCode=117425&CompanyCode=17088");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/SupplierBillEditorBatch.aspx?FYCode=117425&CompanyCode=17088");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/SupplierBillEditorBatch.aspx?FYCode=117425&CompanyCode=17088");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/AccountUI/SupplierBillEditorBatch.aspx?FYCode=117425&CompanyCode=17088";

        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/AccountUI/SupplierBillEditorBatch.aspx?FYCode=117425&CompanyCode=17088")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click Expenditure1
     * @name Click Expenditure1
     */
	public void Click_Expenditure1()
	{
        
		WebElement elem = getWebElement(Expenditure1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Expenditure1", "Click_Expenditure1 failed. Unable to locate object: " + Expenditure1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Expenditure1", "Click_Expenditure1 failed. Unable to locate object: " + Expenditure1Elem.toString());

			Assert.fail("Unable to locate object: " + Expenditure1Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Expenditure1");

		TestModellerLogger.PassStep(m_Driver, "Click_Expenditure1");
	}

     
	/**
 	 * Click View New 2
     * @name Click View New 2
     */
	public void Click_View_New_2()
	{
        
		WebElement elem = getWebElement(View_New_2Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_View_New_2", "Click_View_New_2 failed. Unable to locate object: " + View_New_2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_View_New_2", "Click_View_New_2 failed. Unable to locate object: " + View_New_2Elem.toString());

			Assert.fail("Unable to locate object: " + View_New_2Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_View_New_2");

		TestModellerLogger.PassStep(m_Driver, "Click_View_New_2");
	}

     
	/**
 	 * Click New Supplier Bill Batch 3
     * @name Click New Supplier Bill Batch 3
     */
	public void Click_New_Supplier_Bill_Batch_3()
	{
        
		WebElement elem = getWebElement(New_Supplier_Bill_Batch_3Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_New_Supplier_Bill_Batch_3", "Click_New_Supplier_Bill_Batch_3 failed. Unable to locate object: " + New_Supplier_Bill_Batch_3Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_New_Supplier_Bill_Batch_3", "Click_New_Supplier_Bill_Batch_3 failed. Unable to locate object: " + New_Supplier_Bill_Batch_3Elem.toString());

			Assert.fail("Unable to locate object: " + New_Supplier_Bill_Batch_3Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_New_Supplier_Bill_Batch_3");

		TestModellerLogger.PassStep(m_Driver, "Click_New_Supplier_Bill_Batch_3");
	}

     
	/**
 	 * Click Save 4
	 * @throws InterruptedException 
     * @name Click Save 4
     */
	public void Click_Save_4() throws InterruptedException
	{
        
		WebElement elem = getWebElement(Save_4Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Save_4", "Click_Save_4 failed. Unable to locate object: " + Save_4Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Save_4", "Click_Save_4 failed. Unable to locate object: " + Save_4Elem.toString());

			Assert.fail("Unable to locate object: " + Save_4Elem.toString());
        }
			utilities.Screenshotcapture.Getscreenshot("Current day date should be set as default ", "New Supplier Bill Batch");
			Thread.sleep(1000);
		    elem.click();
          	utilities.Screenshotcapture.Getscreenshot("Information! Please add atleast one record", "New Supplier Bill Batch");

		ExtentReportManager.passStep(m_Driver, "Click_Save_4");

		TestModellerLogger.PassStep(m_Driver, "Click_Save_4");
	}

	public void Enter_Date(String Date) throws InterruptedException
	{
        
		WebElement elem = getWebElement(Date_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Date", "Enter_Date failed. Unable to locate object: " + Date_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Date", "Enter_Date failed. Unable to locate object: " + Date_Elem.toString());

			Assert.fail("Unable to locate object: " + Date_Elem.toString());
        }
		WaitStatementLib wt=new WaitStatementLib();
		wt.explicitWait_elementToBeClickable(m_Driver, 20, elem);
		
		for(int i=0; i<10;i++)
 		{
 			elem.sendKeys(Keys.BACK_SPACE);
 		}
 		elem.sendKeys(Date);
 		elem.sendKeys(Keys.TAB);
 		Thread.sleep(2000);

		ExtentReportManager.passStep(m_Driver, "Enter_Date");

		TestModellerLogger.PassStep(m_Driver, "Enter_Date");
	}

    
	/**
 	 * Select Select Supplier 5
     * @name Select Select Supplier 5
     */
    public void Select_Select_Supplier_0(String Select_Supplier_0)
 	{
 	    
 		WebElement elem = getWebElement(Select_Supplier_0Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Select_Supplier_0", "Select_Select_Supplier_5 failed. Unable to locate object: " + Select_Supplier_0Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Select_Supplier_0", "Select_Select_Supplier_5 failed. Unable to locate object: " + Select_Supplier_0Elem.toString());

 			Assert.fail("Unable to locate object: " + Select_Supplier_0Elem.toString());
         }
 		WaitStatementLib wt=new WaitStatementLib();
		wt.explicitWait_elementToBeClickable(m_Driver, 20, elem);
		
 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Select_Supplier_0);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Select_Supplier_0 " + Select_Supplier_0);

 		TestModellerLogger.PassStep(m_Driver, "Select_Select_Supplier_0 " + Select_Supplier_0);
 	}

    
	/**
 	 * Select Select Supplier Bill Type 6
     * @name Select Select Supplier Bill Type 6
     */
    public void Select_Select_Supplier_Bill_Type_0(String Select_Supplier_Bill_Type_0)
 	{
 	    
 		WebElement elem = getWebElement(Select_Supplier_Bill_Type_0Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Select_Supplier_Bill_Type_0", "Select_Select_Supplier_Bill_Type_6 failed. Unable to locate object: " + Select_Supplier_Bill_Type_0Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Select_Supplier_Bill_Type_0", "Select_Select_Supplier_Bill_Type_6 failed. Unable to locate object: " + Select_Supplier_Bill_Type_0Elem.toString());

 			Assert.fail("Unable to locate object: " + Select_Supplier_Bill_Type_0Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Select_Supplier_Bill_Type_0);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Select_Supplier_Bill_Type_0 " + Select_Supplier_Bill_Type_0);

 		TestModellerLogger.PassStep(m_Driver, "Select_Select_Supplier_Bill_Type_0 " + Select_Supplier_Bill_Type_0);
 	}

      
	/**
 	 * Enter Enter Bill No 7
     * @name Enter Enter Bill No 7
     */
 	public void Enter_Enter_Bill_No_0(String Enter_Bill_No_0)
 	{
 	    
 		WebElement elem = getWebElement(Enter_Bill_No_0Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_Bill_No_0", "Enter_Enter_Bill_No_7 failed. Unable to locate object: " + Enter_Bill_No_0Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_Bill_No_0", "Enter_Enter_Bill_No_7 failed. Unable to locate object: " + Enter_Bill_No_0Elem.toString());

 			Assert.fail("Unable to locate object: " + Enter_Bill_No_0Elem.toString());
         }
 		WaitStatementLib wt=new WaitStatementLib();
		wt.explicitWait_elementToBeClickable(m_Driver, 20, elem);
 		elem.sendKeys(Enter_Bill_No_0);
 		elem.sendKeys(Keys.TAB);
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_Bill_No_0 " + Enter_Bill_No_0);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_Bill_No_0 " + Enter_Bill_No_0);
 	}

      
	/**
 	 * Enter Description 8
     * @name Enter Description 8
     */
 	public void Enter_Description_0(String Description_0)
 	{
 	    
 		WebElement elem = getWebElement(Description_0Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Description_0", "Enter_Description_8 failed. Unable to locate object: " + Description_0Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Description_0", "Enter_Description_8 failed. Unable to locate object: " + Description_0Elem.toString());

 			Assert.fail("Unable to locate object: " + Description_0Elem.toString());
         }
 		WaitStatementLib wt=new WaitStatementLib();
		wt.explicitWait_elementToBeClickable(m_Driver, 20, elem);
 		elem.sendKeys(Description_0);
 		elem.sendKeys(Keys.TAB);
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Description_0 " + Description_0);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Description_0 " + Description_0);
 	}

      
	/**
 	 * Enter Enter NetTotal 9
	 * @throws InterruptedException 
     * @name Enter Enter NetTotal 9
     */
 	public void Enter_Enter_NetTotal_0(String Enter_NetTotal_0) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(Enter_NetTotal_0Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_NetTotal_0", "Enter_Enter_NetTotal_9 failed. Unable to locate object: " + Enter_NetTotal_0Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_NetTotal_0", "Enter_Enter_NetTotal_9 failed. Unable to locate object: " + Enter_NetTotal_0Elem.toString());

 			Assert.fail("Unable to locate object: " + Enter_NetTotal_0Elem.toString());
         }
 		WaitStatementLib wt=new WaitStatementLib();
		wt.explicitWait_elementToBeClickable(m_Driver, 20, elem);
 		elem.sendKeys(Enter_NetTotal_0);
 		amt.add(0,Enter_NetTotal_0);
 		
 		elem.sendKeys(Keys.TAB);
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_NetTotal_0 " + Enter_NetTotal_0);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_NetTotal_0 " + Enter_NetTotal_0);
 	}

    
	/**
 	 * Select Select VATRate 10
     * @name Select Select VATRate 10
     */
    public void Select_Select_VATRate_10(String Select_VATRate_10)
 	{
 	    
 		WebElement elem = getWebElement(Select_VATRate_10Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Select_VATRate_10", "Select_Select_VATRate_10 failed. Unable to locate object: " + Select_VATRate_10Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Select_VATRate_10", "Select_Select_VATRate_10 failed. Unable to locate object: " + Select_VATRate_10Elem.toString());

 			Assert.fail("Unable to locate object: " + Select_VATRate_10Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Select_VATRate_10);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Select_VATRate_10 " + Select_VATRate_10);

 		TestModellerLogger.PassStep(m_Driver, "Select_Select_VATRate_10 " + Select_VATRate_10);
 	}
    
    public void ExpenceType(String ExpenceType) throws InterruptedException
    {
    //	ledger.add(0, ExpenceType);
    	
    	WebElement elem = getWebElement(Expense_0);
    	if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "ExpenceType", "ExpenceType failed. Unable to locate object: " + Expense_0.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "ExpenceType", "ExpenceType failed. Unable to locate object: " + Expense_0.toString());

    	}
    	
    	
    	WaitStatementLib wt=new WaitStatementLib();
		wt.explicitWait_elementToBeClickable(m_Driver, 20, elem);
		elem.click();
		
		m_Driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(ExpenceType);
		m_Driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
		
//		wt.explicitiWait_presenceOfElementLocated(m_Driver, 20, By.xpath("//ul[@id='select2-ctl00_cPH_rptrProduct_ctl00_ltAccount-results']/li/ul/li[starts-with(text(), '"+ExpenceType+" - "+"')]"));
//		
//		//wt.explicitWait_elementToBeClickable(m_Driver, 20, m_Driver.findElement(By.xpath("//ul[@id='ctl00_cPH_rptRecord_ctl06_AccountUC1_AutoCompleteExtender1_completionListElem']/li[starts-with(text(), '"+Account7+" -"+"')]")));
//		WebElement elemc= m_Driver.findElement(By.xpath("//ul[@id='select2-ctl00_cPH_rptrProduct_ctl00_ltAccount-results']/li/ul/li[starts-with(text(), '"+ExpenceType+" - "+"')]"));
//		elemc.click();
    	
		
//		WebElement ele1=getWebElement(Expense_Get1);
// 		LedgerEntered_1=ele1.getAttribute("title");
// 		expected_entry.add(0, ele1.getAttribute("title"));
// 	    //System.out.println(LedgerEntered_7);
// 	   Reporter.log("ledger 1 entered :"+LedgerEntered_1, true);
    	
    	 ExtentReportManager.passStep(m_Driver, "ExpenceType " + ExpenceType);

  		 TestModellerLogger.PassStep(m_Driver, "ExpenceType " + ExpenceType);
  		 
    }
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public void Enter_Date1(String Date1) throws InterruptedException
	{
        
		WebElement elem = getWebElement(Date_Elem1);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Date1", "Enter_Date1 failed. Unable to locate object: " + Date_Elem1.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Date1", "Enter_Date1 failed. Unable to locate object: " + Date_Elem1.toString());

			Assert.fail("Unable to locate object: " + Date_Elem1.toString());
        }
		WaitStatementLib wt=new WaitStatementLib();
		wt.explicitWait_elementToBeClickable(m_Driver, 20, elem);
		
		for(int i=0; i<10;i++)
 		{
 			elem.sendKeys(Keys.BACK_SPACE);
 		}
 		elem.sendKeys(Date1);
 		elem.sendKeys(Keys.TAB);
 		Thread.sleep(2000);

		ExtentReportManager.passStep(m_Driver, "Enter_Date1" +Date1);

		TestModellerLogger.PassStep(m_Driver, "Enter_Date1" + Date1);
	}

    
	/**
 	 * Select Select Supplier 5
     * @name Select Select Supplier 5
     */
    public void Select_Select_Supplier_1(String Select_Supplier_1)
 	{
 	    
 		WebElement elem = getWebElement(Select_Supplier_1Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Select_Supplier_1", "Select_Select_Supplier_1 failed. Unable to locate object: " + Select_Supplier_1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Select_Supplier_1", "Select_Select_Supplier_1 failed. Unable to locate object: " + Select_Supplier_1Elem.toString());

 			Assert.fail("Unable to locate object: " + Select_Supplier_1Elem.toString());
         }
 		WaitStatementLib wt=new WaitStatementLib();
		wt.explicitWait_elementToBeClickable(m_Driver, 20, elem);
 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Select_Supplier_1);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Select_Supplier_1 " + Select_Supplier_1);

 		TestModellerLogger.PassStep(m_Driver, "Select_Select_Supplier_1 " + Select_Supplier_1);
 	}

    
	/**
 	 * Select Select Supplier Bill Type 6
     * @name Select Select Supplier Bill Type 6
     */
    public void Select_Select_Supplier_Bill_Type_1(String Select_Supplier_Bill_Type_1)
 	{
 	    
 		WebElement elem = getWebElement(Select_Supplier_Bill_Type_1Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Select_Supplier_Bill_Type_1", "Select_Select_Supplier_Bill_Type_1 failed. Unable to locate object: " + Select_Supplier_Bill_Type_1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Select_Supplier_Bill_Type_1", "Select_Select_Supplier_Bill_Type_1 failed. Unable to locate object: " + Select_Supplier_Bill_Type_1Elem.toString());

 			Assert.fail("Unable to locate object: " + Select_Supplier_Bill_Type_1Elem.toString());
         }
 		WaitStatementLib wt=new WaitStatementLib();
		wt.explicitWait_elementToBeClickable(m_Driver, 20, elem);

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Select_Supplier_Bill_Type_1);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Select_Supplier_Bill_Type_1 " + Select_Supplier_Bill_Type_1);

 		TestModellerLogger.PassStep(m_Driver, "Select_Select_Supplier_Bill_Type_1 " + Select_Supplier_Bill_Type_1);
 	}

      
	/**
 	 * Enter Enter Bill No 7
     * @name Enter Enter Bill No 7
     */
 	public void Enter_Enter_Bill_No_1(String Enter_Bill_No_1)
 	{
 	    
 		WebElement elem = getWebElement(Enter_Bill_No_1Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_Bill_No_1", "Enter_Enter_Bill_No_1 failed. Unable to locate object: " + Enter_Bill_No_1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_Bill_No_1", "Enter_Enter_Bill_No_1 failed. Unable to locate object: " + Enter_Bill_No_1Elem.toString());

 			Assert.fail("Unable to locate object: " + Enter_Bill_No_1Elem.toString());
         }
 		WaitStatementLib wt=new WaitStatementLib();
		wt.explicitWait_elementToBeClickable(m_Driver, 20, elem);

 		elem.sendKeys(Enter_Bill_No_1);
 		elem.sendKeys(Keys.TAB);
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_Bill_No_7 " + Enter_Bill_No_1);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_Bill_No_7 " + Enter_Bill_No_1);
 	}

      
	/**
 	 * Enter Description 8
     * @name Enter Description 8
     */
 	public void Enter_Description_1(String Description_1)
 	{
 	    
 		WebElement elem = getWebElement(Description_1Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Description_1", "Enter_Description_1 failed. Unable to locate object: " + Description_1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Description_1", "Enter_Description_1 failed. Unable to locate object: " + Description_1Elem.toString());

 			Assert.fail("Unable to locate object: " + Description_1Elem.toString());
         }
 		WaitStatementLib wt=new WaitStatementLib();
		wt.explicitWait_elementToBeClickable(m_Driver, 20, elem);

 		elem.sendKeys(Description_1);
 		elem.sendKeys(Keys.TAB);
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Description_1 " + Description_1);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Description_1 " + Description_1);
 	}

      
	/**
 	 * Enter Enter NetTotal 9
	 * @throws InterruptedException 
     * @name Enter Enter NetTotal 9
     */
 	public void Enter_Enter_NetTotal_1(String Enter_NetTotal_1) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(Enter_NetTotal_1Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_NetTotal_1", "Enter_Enter_NetTotal_1 failed. Unable to locate object: " + Enter_NetTotal_1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_NetTotal_1", "Enter_Enter_NetTotal_1 failed. Unable to locate object: " + Enter_NetTotal_1Elem.toString());

 			Assert.fail("Unable to locate object: " + Enter_NetTotal_1Elem.toString());
         }
 		WaitStatementLib wt=new WaitStatementLib();
		wt.explicitWait_elementToBeClickable(m_Driver, 20, elem);
		
 		elem.sendKeys(Enter_NetTotal_1);
 		amt.add(1,Enter_NetTotal_1);
 		
 		elem.sendKeys(Keys.TAB);
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_NetTotal_1 " + Enter_NetTotal_1);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_NetTotal_1 " + Enter_NetTotal_1);
 	}

    
	/**
 	 * Select Select VATRate 10
     * @name Select Select VATRate 10
     */
   
    
    public void ExpenceType_1(String ExpenceType1) throws InterruptedException
    {
//    	ledger.add(1, ExpenceType1);
    	
    	WebElement elem = getWebElement(Expense_1);
    	if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "ExpenceType_1", "ExpenceType_1 failed. Unable to locate object: " + Expense_1.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "ExpenceType_1", "ExpenceType_1 failed. Unable to locate object: " + Expense_1.toString());
    		
    		Assert.fail("Unable to locate object: " + Expense_1.toString());
    	}
    	
    	
    	WaitStatementLib wt=new WaitStatementLib();
		wt.explicitWait_elementToBeClickable(m_Driver, 20, elem);
		elem.click();
		
//		m_Driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(ExpenceType1);
//		m_Driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
		
		wt.explicitiWait_presenceOfElementLocated(m_Driver, 20, By.xpath("//ul[@id='select2-ctl00_cPH_rptrProduct_ctl01_ltAccount-results']/li/ul/li[starts-with(text(), '"+ExpenceType1+" - "+"')]"));
		
		//wt.explicitWait_elementToBeClickable(m_Driver, 20, m_Driver.findElement(By.xpath("//ul[@id='ctl00_cPH_rptRecord_ctl06_AccountUC1_AutoCompleteExtender1_completionListElem']/li[starts-with(text(), '"+Account7+" -"+"')]")));
		WebElement elemc= m_Driver.findElement(By.xpath("//ul[@id='select2-ctl00_cPH_rptrProduct_ctl01_ltAccount-results']/li/ul/li[starts-with(text(), '"+ExpenceType1+" - "+"')]"));
		elemc.click();
    	
//		WebElement ele1=getWebElement(Expense_Get2);
// 		LedgerEntered_2=ele1.getAttribute("title");
// 		expected_entry.add(1, ele1.getAttribute("title"));
// 	    //System.out.println(LedgerEntered_7);
// 	   Reporter.log("ledger 2 entered :"+LedgerEntered_2, true);
    	
    	 ExtentReportManager.passStep(m_Driver, "ExpenceType_1 " + ExpenceType1);

  		 TestModellerLogger.PassStep(m_Driver, "ExpenceType_1 " + ExpenceType1);
  		 
    }
    
    
   ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
    
    public void Enter_Date2(String Date2) throws InterruptedException
	{
        
		WebElement elem = getWebElement(Date_Elem2);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Date2", "Enter_Date2 failed. Unable to locate object: " + Date_Elem2.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Date2", "Enter_Date2 failed. Unable to locate object: " + Date_Elem2.toString());

			Assert.fail("Unable to locate object: " + Date_Elem2.toString());
        }
		WaitStatementLib wt=new WaitStatementLib();
		wt.explicitWait_elementToBeClickable(m_Driver, 20, elem);
		
		for(int i=0; i<10;i++)
 		{
 			elem.sendKeys(Keys.BACK_SPACE);
 		}
 		elem.sendKeys(Date2);
 		elem.sendKeys(Keys.TAB);
 		Thread.sleep(2000);

		ExtentReportManager.passStep(m_Driver, "Enter_Date2" +Date2);

		TestModellerLogger.PassStep(m_Driver, "Enter_Date2" + Date2);
	}

    
	/**
 	 * Select Select Supplier 5
     * @name Select Select Supplier 5
     */
    public void Select_Select_Supplier_2(String Select_Supplier_2)
 	{
 	    
 		WebElement elem = getWebElement(Select_Supplier_2Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Select_Supplier_2", "Select_Select_Supplier_2 failed. Unable to locate object: " + Select_Supplier_2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Select_Supplier_2", "Select_Select_Supplier_2 failed. Unable to locate object: " + Select_Supplier_2Elem.toString());

 			Assert.fail("Unable to locate object: " + Select_Supplier_2Elem.toString());
         }
 		WaitStatementLib wt=new WaitStatementLib();
		wt.explicitWait_elementToBeClickable(m_Driver, 20, elem);
		
 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Select_Supplier_2);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Select_Supplier_2 " + Select_Supplier_2);

 		TestModellerLogger.PassStep(m_Driver, "Select_Select_Supplier_2 " + Select_Supplier_2);
 	}

    
	/**
 	 * Select Select Supplier Bill Type 6
     * @name Select Select Supplier Bill Type 6
     */
    public void Select_Select_Supplier_Bill_Type_2(String Select_Supplier_Bill_Type_2)
 	{
 	    
 		WebElement elem = getWebElement(Select_Supplier_Bill_Type_2Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Select_Supplier_Bill_Type_2", "Select_Select_Supplier_Bill_Type_2 failed. Unable to locate object: " + Select_Supplier_Bill_Type_2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Select_Supplier_Bill_Type_2", "Select_Select_Supplier_Bill_Type_2 failed. Unable to locate object: " + Select_Supplier_Bill_Type_2Elem.toString());

 			Assert.fail("Unable to locate object: " + Select_Supplier_Bill_Type_2Elem.toString());
         }
 		WaitStatementLib wt=new WaitStatementLib();
		wt.explicitWait_elementToBeClickable(m_Driver, 20, elem);
		
 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Select_Supplier_Bill_Type_2);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Select_Supplier_Bill_Type_1 " + Select_Supplier_Bill_Type_2);

 		TestModellerLogger.PassStep(m_Driver, "Select_Select_Supplier_Bill_Type_1 " + Select_Supplier_Bill_Type_2);
 	}

      
	/**
 	 * Enter Enter Bill No 7
     * @name Enter Enter Bill No 7
     */
 	public void Enter_Enter_Bill_No_2(String Enter_Bill_No_2)
 	{
 	    
 		WebElement elem = getWebElement(Enter_Bill_No_2Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_Bill_No_2", "Enter_Enter_Bill_No_2 failed. Unable to locate object: " + Enter_Bill_No_2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_Bill_No_2", "Enter_Enter_Bill_No_2 failed. Unable to locate object: " + Enter_Bill_No_2Elem.toString());

 			Assert.fail("Unable to locate object: " + Enter_Bill_No_2Elem.toString());
         }
 		WaitStatementLib wt=new WaitStatementLib();
		wt.explicitWait_elementToBeClickable(m_Driver, 20, elem);
		
 		elem.sendKeys(Enter_Bill_No_2);
 		elem.sendKeys(Keys.TAB);
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_Bill_No_2 " + Enter_Bill_No_2);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_Bill_No_2 " + Enter_Bill_No_2);
 	}

      
	/**
 	 * Enter Description 8
     * @name Enter Description 8
     */
 	public void Enter_Description_2(String Description_2)
 	{
 	    
 		WebElement elem = getWebElement(Description_2Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Description_2", "Enter_Description_2 failed. Unable to locate object: " + Description_2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Description_2", "Enter_Description_2 failed. Unable to locate object: " + Description_2Elem.toString());

 			Assert.fail("Unable to locate object: " + Description_2Elem.toString());
         }
 		WaitStatementLib wt=new WaitStatementLib();
		wt.explicitWait_elementToBeClickable(m_Driver, 20, elem);

 		elem.sendKeys(Description_2);
 		elem.sendKeys(Keys.TAB);
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Description_2 " + Description_2);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Description_2 " + Description_2);
 	}

      
	/**
 	 * Enter Enter NetTotal 9
	 * @throws InterruptedException 
     * @name Enter Enter NetTotal 9
     */
 	public void Enter_Enter_NetTotal_2(String Enter_NetTotal_2) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(Enter_NetTotal_2Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_NetTotal_2", "Enter_Enter_NetTotal_2 failed. Unable to locate object: " + Enter_NetTotal_2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_NetTotal_2", "Enter_Enter_NetTotal_2 failed. Unable to locate object: " + Enter_NetTotal_2Elem.toString());

 			Assert.fail("Unable to locate object: " + Enter_NetTotal_2Elem.toString());
         }
 		WaitStatementLib wt=new WaitStatementLib();
		wt.explicitWait_elementToBeClickable(m_Driver, 20, elem);

 		elem.sendKeys(Enter_NetTotal_2);
 		amt.add(2,Enter_NetTotal_2);
 		
 		elem.sendKeys(Keys.TAB);
 	
  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_NetTotal_2 " + Enter_NetTotal_2);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_NetTotal_2 " + Enter_NetTotal_2);
 	}

    
	/**
 	 * Select Select VATRate 10
     * @name Select Select VATRate 10
     */
   
    
    public void ExpenceType_2(String ExpenceType_2) throws InterruptedException
    {
    //	ledger.add(2, ExpenceType_2);
    	
    	WebElement elem = getWebElement(Expense_2);
    	if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "ExpenceType_2", "ExpenceType_2 failed. Unable to locate object: " + Expense_2.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "ExpenceType_2", "ExpenceType_2 failed. Unable to locate object: " + Expense_2.toString());

    	}
    	
    	
    	WaitStatementLib wt=new WaitStatementLib();
		wt.explicitWait_elementToBeClickable(m_Driver, 20, elem);
		elem.click();
//		m_Driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(ExpenceType_2);
//		m_Driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
		wt.explicitiWait_presenceOfElementLocated(m_Driver, 20, By.xpath("//ul[@id='select2-ctl00_cPH_rptrProduct_ctl02_ltAccount-results']/li/ul/li[starts-with(text(), '"+ExpenceType_2+" - "+"')]"));
		
		//wt.explicitWait_elementToBeClickable(m_Driver, 20, m_Driver.findElement(By.xpath("//ul[@id='ctl00_cPH_rptRecord_ctl06_AccountUC1_AutoCompleteExtender1_completionListElem']/li[starts-with(text(), '"+Account7+" -"+"')]")));
		WebElement elemc= m_Driver.findElement(By.xpath("//ul[@id='select2-ctl00_cPH_rptrProduct_ctl02_ltAccount-results']/li/ul/li[starts-with(text(), '"+ExpenceType_2+" - "+"')]"));
		elemc.click();
    	
//		WebElement ele1=getWebElement(Expense_Get3);
// 		LedgerEntered_3=ele1.getAttribute("title");
// 		expected_entry.add(2, ele1.getAttribute("title"));
// 	    //System.out.println(LedgerEntered_7);
// 	   Reporter.log("ledger 3 entered :"+LedgerEntered_3, true);
 	   
    	 ExtentReportManager.passStep(m_Driver, "ExpenceType_2 " + ExpenceType_2);

  		 TestModellerLogger.PassStep(m_Driver, "ExpenceType_2 " + ExpenceType_2);
  		 
    }
    
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public void Enter_Date3(String Date3) throws InterruptedException
   	{
           
   		WebElement elem = getWebElement(Date_Elem3);

   		if (elem == null) {
       		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Date3", "Enter_Date3 failed. Unable to locate object: " + Date_Elem3.toString());

       		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Date3", "Enter_Date3 failed. Unable to locate object: " + Date_Elem3.toString());

   			Assert.fail("Unable to locate object: " + Date_Elem3.toString());
           }
   		WaitStatementLib wt=new WaitStatementLib();
		wt.explicitWait_elementToBeClickable(m_Driver, 20, elem);
		
   		for(int i=0; i<10;i++)
    		{
    			elem.sendKeys(Keys.BACK_SPACE);
    		}
    		elem.sendKeys(Date3);
    		elem.sendKeys(Keys.TAB);
    		Thread.sleep(2000);

   		ExtentReportManager.passStep(m_Driver, "Enter_Date3" +Date3);

   		TestModellerLogger.PassStep(m_Driver, "Enter_Date3" + Date3);
   	}

       
   	/**
    	 * Select Select Supplier 5
        * @name Select Select Supplier 5
        */
       public void Select_Select_Supplier_3(String Select_Supplier_3)
    	{
    	    
    		WebElement elem = getWebElement(Select_Supplier_3Elem);

    		if (elem == null) {
       		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Select_Supplier_3", "Select_Select_Supplier_3 failed. Unable to locate object: " + Select_Supplier_3Elem.toString());

       		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Select_Supplier_3", "Select_Select_Supplier_3 failed. Unable to locate object: " + Select_Supplier_3Elem.toString());

    			Assert.fail("Unable to locate object: " + Select_Supplier_3Elem.toString());
            }
    		WaitStatementLib wt=new WaitStatementLib();
    		wt.explicitWait_elementToBeClickable(m_Driver, 20, elem);

    		Select dropdown = new Select(elem);

    		dropdown.selectByVisibleText(Select_Supplier_3);
    		
    		
    		ExtentReportManager.passStep(m_Driver, "Select_Select_Supplier_3 " + Select_Supplier_3);

    		TestModellerLogger.PassStep(m_Driver, "Select_Select_Supplier_3 " + Select_Supplier_3);
    	}

       
   	/**
    	 * Select Select Supplier Bill Type 6
        * @name Select Select Supplier Bill Type 6
        */
       public void Select_Select_Supplier_Bill_Type_3(String Select_Supplier_Bill_Type_3)
    	{
    	    
    		WebElement elem = getWebElement(Select_Supplier_Bill_Type_3Elem);

    		if (elem == null) {
       		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Select_Supplier_Bill_Type_3", "Select_Select_Supplier_Bill_Type_3 failed. Unable to locate object: " + Select_Supplier_Bill_Type_3Elem.toString());

       		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Select_Supplier_Bill_Type_3", "Select_Select_Supplier_Bill_Type_3 failed. Unable to locate object: " + Select_Supplier_Bill_Type_3Elem.toString());

    			Assert.fail("Unable to locate object: " + Select_Supplier_Bill_Type_3Elem.toString());
            }
    		WaitStatementLib wt=new WaitStatementLib();
    		wt.explicitWait_elementToBeClickable(m_Driver, 20, elem);
    		
    		Select dropdown = new Select(elem);

    		dropdown.selectByVisibleText(Select_Supplier_Bill_Type_3);
    		
    		
    		ExtentReportManager.passStep(m_Driver, "Select_Select_Supplier_Bill_Type_3 " + Select_Supplier_Bill_Type_3);

    		TestModellerLogger.PassStep(m_Driver, "Select_Select_Supplier_Bill_Type_3 " + Select_Supplier_Bill_Type_3);
    	}

         
   	/**
    	 * Enter Enter Bill No 7
        * @name Enter Enter Bill No 7
        */
    	public void Enter_Enter_Bill_No_3(String Enter_Bill_No_3)
    	{
    	    
    		WebElement elem = getWebElement(Enter_Bill_No_3Elem);

    		if (elem == null) {
       		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_Bill_No_3", "Enter_Enter_Bill_No_3 failed. Unable to locate object: " + Enter_Bill_No_3Elem.toString());

       		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_Bill_No_3", "Enter_Enter_Bill_No_3 failed. Unable to locate object: " + Enter_Bill_No_3Elem.toString());

    			Assert.fail("Unable to locate object: " + Enter_Bill_No_3Elem.toString());
            }
    		WaitStatementLib wt=new WaitStatementLib();
    		wt.explicitWait_elementToBeClickable(m_Driver, 20, elem);
    		
    		elem.sendKeys(Enter_Bill_No_3);
    		elem.sendKeys(Keys.TAB);
    		
     		ExtentReportManager.passStep(m_Driver, "Enter_Enter_Bill_No_3 " + Enter_Bill_No_3);

     		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_Bill_No_3 " + Enter_Bill_No_3);
    	}

         
   	/**
    	 * Enter Description 8
        * @name Enter Description 8
        */
    	public void Enter_Description_3(String Description_3)
    	{
    	    
    		WebElement elem = getWebElement(Description_3Elem);

    		if (elem == null) {
       		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Description_3", "Enter_Description_3 failed. Unable to locate object: " + Description_3Elem.toString());

       		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Description_3", "Enter_Description_3 failed. Unable to locate object: " + Description_3Elem.toString());

    			Assert.fail("Unable to locate object: " + Description_3Elem.toString());
            }
    		WaitStatementLib wt=new WaitStatementLib();
    		wt.explicitWait_elementToBeClickable(m_Driver, 20, elem);
    		
    		elem.sendKeys(Description_3);
    		elem.sendKeys(Keys.TAB);
    		
     		ExtentReportManager.passStep(m_Driver, "Enter_Description_3 " + Description_3);

     		TestModellerLogger.PassStep(m_Driver, "Enter_Description_3 " + Description_3);
    	}

         
   	/**
    	 * Enter Enter NetTotal 9
   	 * @throws InterruptedException 
        * @name Enter Enter NetTotal 9
        */
    	public void Enter_Enter_NetTotal_3(String Enter_NetTotal_3) throws InterruptedException
    	{
    	    
    		WebElement elem = getWebElement(Enter_NetTotal_3Elem);

    		if (elem == null) {
       		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_NetTotal_3", "Enter_Enter_NetTotal_3 failed. Unable to locate object: " + Enter_NetTotal_3Elem.toString());

       		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_NetTotal_3", "Enter_Enter_NetTotal_3 failed. Unable to locate object: " + Enter_NetTotal_3Elem.toString());

    			Assert.fail("Unable to locate object: " + Enter_NetTotal_3Elem.toString());
            }
    		WaitStatementLib wt=new WaitStatementLib();
    		wt.explicitWait_elementToBeClickable(m_Driver, 20, elem);
    		
    		elem.sendKeys(Enter_NetTotal_3);
    		amt.add(3,Enter_NetTotal_3);
    		
    		elem.sendKeys(Keys.TAB);
    	
     		ExtentReportManager.passStep(m_Driver, "Enter_Enter_NetTotal_3 " + Enter_NetTotal_3);

     		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_NetTotal_3 " + Enter_NetTotal_3);
    	}

       
   	/**
    	 * Select Select VATRate 10
        * @name Select Select VATRate 10
        */
      
       
       public void ExpenceType_3(String ExpenceType_3) throws InterruptedException
       {
  //     	ledger.add(3, ExpenceType_3);
       	
       	WebElement elem = getWebElement(Expense_3);
       	if (elem == null) {
       		ExtentReportManager.failStepWithScreenshot(m_Driver, "ExpenceType_3", "ExpenceType_3 failed. Unable to locate object: " + Expense_3.toString());

       		TestModellerLogger.FailStepWithScreenshot(m_Driver, "ExpenceType_3", "ExpenceType_3 failed. Unable to locate object: " + Expense_3.toString());

       	}
       	
       	
       	WaitStatementLib wt=new WaitStatementLib();
   		wt.explicitWait_elementToBeClickable(m_Driver, 20, elem);
   		elem.click();
   		
//   		m_Driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(ExpenceType_3);
//		m_Driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
   		
   		wt.explicitiWait_presenceOfElementLocated(m_Driver, 20, By.xpath("//ul[@id='select2-ctl00_cPH_rptrProduct_ctl03_ltAccount-results']/li/ul/li[starts-with(text(), '"+ExpenceType_3+" - "+"')]"));
   		
   		//wt.explicitWait_elementToBeClickable(m_Driver, 20, m_Driver.findElement(By.xpath("//ul[@id='ctl00_cPH_rptRecord_ctl06_AccountUC1_AutoCompleteExtender1_completionListElem']/li[starts-with(text(), '"+Account7+" -"+"')]")));
   		WebElement elemc= m_Driver.findElement(By.xpath("//ul[@id='select2-ctl00_cPH_rptrProduct_ctl03_ltAccount-results']/li/ul/li[starts-with(text(), '"+ExpenceType_3+" - "+"')]"));
   		elemc.click();
//       	
//   		WebElement ele1=getWebElement(Expense_Get4);
//    		LedgerEntered_4=ele1.getAttribute("title");
//    		expected_entry.add(3, ele1.getAttribute("title"));
//    	    //System.out.println(LedgerEntered_7);
//    	   Reporter.log("ledger 4 entered :"+LedgerEntered_4, true);
    	  
       	 ExtentReportManager.passStep(m_Driver, "ExpenceType_3 " + ExpenceType_3);

     		 TestModellerLogger.PassStep(m_Driver, "ExpenceType_3 " + ExpenceType_3);
     		 
       }
       
       ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
       
       public void Enter_Date4(String Date4) throws InterruptedException
      	{
              
      		WebElement elem = getWebElement(Date_Elem4);

      		if (elem == null) {
          		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Date4", "Enter_Date4 failed. Unable to locate object: " + Date_Elem4.toString());

          		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Date4", "Enter_Date4 failed. Unable to locate object: " + Date_Elem4.toString());

      			Assert.fail("Unable to locate object: " + Date_Elem4.toString());
              }
      		WaitStatementLib wt=new WaitStatementLib();
    		wt.explicitWait_elementToBeClickable(m_Driver, 20, elem);
    		
      		for(int i=0; i<10;i++)
       		{
       			elem.sendKeys(Keys.BACK_SPACE);
       		}
       		elem.sendKeys(Date4);
       		elem.sendKeys(Keys.TAB);
       		Thread.sleep(2000);

      		ExtentReportManager.passStep(m_Driver, "Enter_Date4" +Date4);

      		TestModellerLogger.PassStep(m_Driver, "Enter_Date4" + Date4);
      	}

          
      	/**
       	 * Select Select Supplier 5
           * @name Select Select Supplier 5
           */
          public void Select_Select_Supplier_4(String Select_Supplier_4)
       	{
       	    
       		WebElement elem = getWebElement(Select_Supplier_4Elem);

       		if (elem == null) {
          		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Select_Supplier_4", "Select_Select_Supplier_4 failed. Unable to locate object: " + Select_Supplier_4Elem.toString());

          		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Select_Supplier_4", "Select_Select_Supplier_4 failed. Unable to locate object: " + Select_Supplier_4Elem.toString());

       			Assert.fail("Unable to locate object: " + Select_Supplier_4Elem.toString());
               }
       		WaitStatementLib wt=new WaitStatementLib();
    		wt.explicitWait_elementToBeClickable(m_Driver, 20, elem);
    		
       		Select dropdown = new Select(elem);

       		dropdown.selectByVisibleText(Select_Supplier_4);
       		
       		
       		ExtentReportManager.passStep(m_Driver, "Select_Select_Supplier_4 " + Select_Supplier_4);

       		TestModellerLogger.PassStep(m_Driver, "Select_Select_Supplier_4 " + Select_Supplier_4);
       	}

          
      	/**
       	 * Select Select Supplier Bill Type 6
           * @name Select Select Supplier Bill Type 6
           */
          public void Select_Select_Supplier_Bill_Type_4(String Select_Supplier_Bill_Type_4)
       	{
       	    
       		WebElement elem = getWebElement(Select_Supplier_Bill_Type_4Elem);

       		if (elem == null) {
          		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Select_Supplier_Bill_Type_4", "Select_Select_Supplier_Bill_Type_4 failed. Unable to locate object: " + Select_Supplier_Bill_Type_4Elem.toString());

          		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Select_Supplier_Bill_Type_4", "Select_Select_Supplier_Bill_Type_4 failed. Unable to locate object: " + Select_Supplier_Bill_Type_4Elem.toString());

       			Assert.fail("Unable to locate object: " + Select_Supplier_Bill_Type_4Elem.toString());
               }
       		WaitStatementLib wt=new WaitStatementLib();
    		wt.explicitWait_elementToBeClickable(m_Driver, 20, elem);
    		
       		Select dropdown = new Select(elem);

       		dropdown.selectByVisibleText(Select_Supplier_Bill_Type_4);
       		
       		
       		ExtentReportManager.passStep(m_Driver, "Select_Select_Supplier_Bill_Type_4 " + Select_Supplier_Bill_Type_4);

       		TestModellerLogger.PassStep(m_Driver, "Select_Select_Supplier_Bill_Type_4 " + Select_Supplier_Bill_Type_4);
       	}

            
      	/**
       	 * Enter Enter Bill No 7
           * @name Enter Enter Bill No 7
           */
       	public void Enter_Enter_Bill_No_4(String Enter_Bill_No_4)
       	{
       	    
       		WebElement elem = getWebElement(Enter_Bill_No_4Elem);

       		if (elem == null) {
          		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_Bill_No_4", "Enter_Enter_Bill_No_4 failed. Unable to locate object: " + Enter_Bill_No_4Elem.toString());

          		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_Bill_No_4", "Enter_Enter_Bill_No_4 failed. Unable to locate object: " + Enter_Bill_No_4Elem.toString());

       			Assert.fail("Unable to locate object: " + Enter_Bill_No_4Elem.toString());
               }
       		WaitStatementLib wt=new WaitStatementLib();
    		wt.explicitWait_elementToBeClickable(m_Driver, 20, elem);
    		
       		elem.sendKeys(Enter_Bill_No_4);
       		elem.sendKeys(Keys.TAB);
       		
        		ExtentReportManager.passStep(m_Driver, "Enter_Enter_Bill_No_4 " + Enter_Bill_No_4);

        		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_Bill_No_4 " + Enter_Bill_No_4);
       	}

            
      	/**
       	 * Enter Description 8
           * @name Enter Description 8
           */
       	public void Enter_Description_4(String Description_4)
       	{
       	    
       		WebElement elem = getWebElement(Description_4Elem);

       		if (elem == null) {
          		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Description_4", "Enter_Description_4 failed. Unable to locate object: " + Description_4Elem.toString());

          		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Description_4", "Enter_Description_4 failed. Unable to locate object: " + Description_4Elem.toString());

       			Assert.fail("Unable to locate object: " + Description_4Elem.toString());
               }
       		WaitStatementLib wt=new WaitStatementLib();
    		wt.explicitWait_elementToBeClickable(m_Driver, 20, elem);
    		
       		elem.sendKeys(Description_4);
       		elem.sendKeys(Keys.TAB);
       		
        		ExtentReportManager.passStep(m_Driver, "Enter_Description_4 " + Description_4);

        		TestModellerLogger.PassStep(m_Driver, "Enter_Description_4 " + Description_4);
       	}

            
      	/**
       	 * Enter Enter NetTotal 9
      	 * @throws InterruptedException 
           * @name Enter Enter NetTotal 9
           */
       	public void Enter_Enter_NetTotal_4(String Enter_NetTotal_4) throws InterruptedException
       	{
       	    
       		WebElement elem = getWebElement(Enter_NetTotal_4Elem);

       		if (elem == null) {
          		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_NetTotal_4", "Enter_Enter_NetTotal_4 failed. Unable to locate object: " + Enter_NetTotal_4Elem.toString());

          		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_NetTotal_4", "Enter_Enter_NetTotal_4 failed. Unable to locate object: " + Enter_NetTotal_4Elem.toString());

       			Assert.fail("Unable to locate object: " + Enter_NetTotal_4Elem.toString());
               }
       		WaitStatementLib wt=new WaitStatementLib();
    		wt.explicitWait_elementToBeClickable(m_Driver, 20, elem);

       		elem.sendKeys(Enter_NetTotal_4);
       		amt.add(4,Enter_NetTotal_4);
       		
       		elem.sendKeys(Keys.TAB);
       		
        		ExtentReportManager.passStep(m_Driver, "Enter_Enter_NetTotal_4" + Enter_NetTotal_4);

        		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_NetTotal_4 " + Enter_NetTotal_4);
       	}

          
      	/**
       	 * Select Select VATRate 10
           * @name Select Select VATRate 10
           */
         
          
          public void ExpenceType_4(String ExpenceType_4) throws InterruptedException
          {
      //    	ledger.add(4, ExpenceType_4);
          	
          	WebElement elem = getWebElement(Expense_4);
          	if (elem == null) {
          		ExtentReportManager.failStepWithScreenshot(m_Driver, "ExpenceType_4", "ExpenceType_4 failed. Unable to locate object: " + Expense_4.toString());

          		TestModellerLogger.FailStepWithScreenshot(m_Driver, "ExpenceType_4", "ExpenceType_4 failed. Unable to locate object: " + Expense_4.toString());

          	}
          	
          	
          	WaitStatementLib wt=new WaitStatementLib();
      		wt.explicitWait_elementToBeClickable(m_Driver, 20, elem);
      		elem.click();
      		
//      		m_Driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(ExpenceType_4);
//    		m_Driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
      		wt.explicitiWait_presenceOfElementLocated(m_Driver, 20, By.xpath("//ul[@id='select2-ctl00_cPH_rptrProduct_ctl04_ltAccount-results']/li/ul/li[starts-with(text(), '"+ExpenceType_4+" - "+"')]"));
      		
      		//wt.explicitWait_elementToBeClickable(m_Driver, 20, m_Driver.findElement(By.xpath("//ul[@id='ctl00_cPH_rptRecord_ctl06_AccountUC1_AutoCompleteExtender1_completionListElem']/li[starts-with(text(), '"+Account7+" -"+"')]")));
      		WebElement elemc= m_Driver.findElement(By.xpath("//ul[@id='select2-ctl00_cPH_rptrProduct_ctl04_ltAccount-results']/li/ul/li[starts-with(text(), '"+ExpenceType_4+" - "+"')]"));
      		elemc.click();
          	
//      		WebElement ele1=getWebElement(Expense_Get5);
//       		LedgerEntered_5=ele1.getAttribute("title");
//       		expected_entry.add(4, ele1.getAttribute("title"));
//       	    //System.out.println(LedgerEntered_7);
//       	   Reporter.log("ledger 5 entered :"+LedgerEntered_5, true);
//       	   
       
       	   
          	 ExtentReportManager.passStep(m_Driver, "ExpenceType_4 " + ExpenceType_4);

        		 TestModellerLogger.PassStep(m_Driver, "ExpenceType_4 " + ExpenceType_4);
        		 
          }
    public void Click_Save() throws InterruptedException
	{
        
		WebElement elem = getWebElement(Save_4Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Save_4", "Click_Save_4 failed. Unable to locate object: " + Save_4Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Save_4", "Click_Save_4 failed. Unable to locate object: " + Save_4Elem.toString());

			Assert.fail("Unable to locate object: " + Save_4Elem.toString());
        }

		Thread.sleep(2000);
		elem.click();
          utilities.Screenshotcapture.Getscreenshot("success message on top of the screen.", "New Supplier Bill Batch");

		ExtentReportManager.passStep(m_Driver, "Click_Save_4");

		TestModellerLogger.PassStep(m_Driver, "Click_Save_4");
	}
    
    public void Click_SaveMoreBtn() throws InterruptedException
  	{
          
  		WebElement elem = getWebElement(Save_More_Elem);

  		if (elem == null) {
      		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SaveMoreBtn", "Click_SaveMoreBtn failed. Unable to locate object: " + Save_More_Elem.toString());

      		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SaveMoreBtn", "Click_SaveMoreBtn failed. Unable to locate object: " + Save_More_Elem.toString());

  			Assert.fail("Unable to locate object: " + Save_More_Elem.toString());
          }

  		
  		elem.click();
  		
  		Thread.sleep(5000);
          

  		ExtentReportManager.passStep(m_Driver, "Click_SaveMoreBtn");

  		TestModellerLogger.PassStep(m_Driver, "Click_SaveMoreBtn");
  	}
    public void verify_BS_FixedAsset_10_19_Supplier(){
		List<WebElement> elements = m_Driver.findElements(By.xpath("//tbody/tr/td[2]/span[contains(text(),'')]/following-sibling::a"));
	    int size = elements.size();
	    System.out.println(size);
	    for (int i = 0; i <size-1; i++) {
	    	WebElement ele2=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+ledger.get(i)+"')]/following-sibling::a"));
	    	String led_text = ele2.getText().trim();
	    	System.out.println(led_text);
	    	String[] ledgersplit = expected_entry.get(i).split("-");
	    	String expectedledger = ledgersplit[1].trim();
	    	Assert.assertEquals(ele2.getText().replaceAll("-", " "), expectedledger.replaceAll("-"," "));
	    	Reporter.log("Ledger code verified: "+led_text);
	    	
	    	WebElement amount=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+ledger.get(i)+"')]/parent::td/following-sibling::td/a/span"));
	    	String ActAmt = amount.getText();
	    	String ExpAmt1 = amt.get(i);
	    	int a=Integer.parseInt(ExpAmt1);
	    	int c=a+a;
	    	String exp=Integer.toString(c);
	    	String ExpAmt = exp+".00";
	    	//System.out.println(xx);
	    	//System.out.println(yy);
	    	String[] z = amount.getText().split("", 3);
	    	if (z[0].equals("(")) {
	    		String amttt=amount.getText().replaceAll(",", "").substring(1,9);
	    		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,9), ExpAmt);
			} else {
				Assert.assertEquals(amount.getText().replaceAll(",", ""), ExpAmt);
			}
	    	Reporter.log("Amount enter verified: "+ActAmt);
	    	sl.ScrollToElement(m_Driver, ele2);
		}
	    Reporter.log("Enteries are Verified on Balance Sheet Report page :", true);
	}
    
    
    
}