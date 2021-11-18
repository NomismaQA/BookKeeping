package Pages_Reconcilation_TC;

import pages.BasePage;

import java.util.List;

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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/d990eaf8-d9d4-44fd-9c06-462a93222990
@TestModellerModule(guid = "d990eaf8-d9d4-44fd-9c06-462a93222990")
public class Advance_Reconcilation extends BasePage
{
	public Advance_Reconcilation (WebDriver driver)
	{
		super(driver);
	}


	
	
	private By Sale_1Elem = By.xpath("//*[@id='ctl00_SideMenu1_incomeMenu']/a/span");

	private By View_2Elem = By.xpath("//*[@id='ctl00_divMainContent']/header/div/div[3]");

	private By Ledger_Reconciliation_3Elem = By.xpath("//A[contains(text(),'Ledger Reconciliation')]");

	private By AccountType_4__8Elem = By.xpath("//SELECT[@name='ctl00$cPHFilter$ddlAccountType']");

	private By Account_5__9Elem = By.xpath("//SELECT[@name='ctl00$cPHFilter$ddlAccount']");

	private By Reconcile_All_6Elem = By.xpath("//A[@id='ctl00_cPH_lnkReconcileAll']");

	private By View_Reconciled_7Elem = By.xpath("//A[@id='ctl00_cpHeaderRight_btnReconciled']");

	private By Months_10Elem = By.xpath("//label[normalize-space()= 'Month:']/../select");

	private By DateFrom_11Elem = By.xpath("//label[normalize-space()= 'Date From:']/../input");

	private By DateTo_12Elem = By.xpath("//label[normalize-space()= 'To:']/../input");

	private By Undo_Reconcile_13Elem = By.xpath("//*[@id='ctl00_cPH_lnkUnDoReconcileSelected']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AccountUI/ReconcileUndo.aspx?FYCode=117466&CompanyCode=17129&menuid=0&s=2");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/ReconcileUndo.aspx?FYCode=117466&CompanyCode=17129&menuid=0&s=2");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/ReconcileUndo.aspx?FYCode=117466&CompanyCode=17129&menuid=0&s=2");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/AccountUI/ReconcileUndo.aspx?FYCode=117466&CompanyCode=17129&menuid=0&s=2";

        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/AccountUI/ReconcileUndo.aspx?FYCode=117466&CompanyCode=17129&menuid=0&s=2")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click Expenditure 1
     * @name Click Expenditure 1
     */
	public void Click_Sale_1()
	{
        
		WebElement elem = getWebElement(Sale_1Elem);

	
  	elem.click();
          	

	}

     
	/**
 	 * Click View 2
     * @name Click View 2
     */
	public void Click_View_2()
	{
        
		WebElement elem = getWebElement(View_2Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_View_2", "Click_View_2 failed. Unable to locate object: " + View_2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_View_2", "Click_View_2 failed. Unable to locate object: " + View_2Elem.toString());

			Assert.fail("Unable to locate object: " + View_2Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_View_2");

		TestModellerLogger.PassStep(m_Driver, "Click_View_2");
	}

     
	/**
 	 * Click Ledger Reconciliation 3
     * @name Click Ledger Reconciliation 3
     */
	public void Click_Ledger_Reconciliation_3()
	{
        
		WebElement elem = getWebElement(Ledger_Reconciliation_3Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Ledger_Reconciliation_3", "Click_Ledger_Reconciliation_3 failed. Unable to locate object: " + Ledger_Reconciliation_3Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Ledger_Reconciliation_3", "Click_Ledger_Reconciliation_3 failed. Unable to locate object: " + Ledger_Reconciliation_3Elem.toString());

			Assert.fail("Unable to locate object: " + Ledger_Reconciliation_3Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Ledger_Reconciliation_3");

		TestModellerLogger.PassStep(m_Driver, "Click_Ledger_Reconciliation_3");
	}

    
	/**
 	 * Select AccountType 4 _8
	 * @throws InterruptedException 
     * @name Select AccountType 4 _8
     */
    public void Select_AccountType_4__8(String AccountType_4__8) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(AccountType_4__8Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_AccountType_4__8", "Select_AccountType_4__8 failed. Unable to locate object: " + AccountType_4__8Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_AccountType_4__8", "Select_AccountType_4__8 failed. Unable to locate object: " + AccountType_4__8Elem.toString());

 			Assert.fail("Unable to locate object: " + AccountType_4__8Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(AccountType_4__8);
 		
 		Thread.sleep(3000);
 		ExtentReportManager.passStep(m_Driver, "Select_AccountType_4__8 " + AccountType_4__8);

 		TestModellerLogger.PassStep(m_Driver, "Select_AccountType_4__8 " + AccountType_4__8);
 	}

    
	/**
 	 * Select Account 5 _9
     * @name Select Account 5 _9
     */
    public void Select_Account_5__9(String Account_5__9)
 	{
 	    
 		WebElement elem = getWebElement(Account_5__9Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Account_5__9", "Select_Account_5__9 failed. Unable to locate object: " + Account_5__9Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Account_5__9", "Select_Account_5__9 failed. Unable to locate object: " + Account_5__9Elem.toString());

 			Assert.fail("Unable to locate object: " + Account_5__9Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Account_5__9);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Account_5__9 " + Account_5__9);

 		TestModellerLogger.PassStep(m_Driver, "Select_Account_5__9 " + Account_5__9);
 	}

     
	/**
 	 * Click Reconcile All 6
     * @name Click Reconcile All 6
     */
	public void Click_Reconcile_All_6()
	{
        
		WebElement elem = getWebElement(Reconcile_All_6Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Reconcile_All_6", "Click_Reconcile_All_6 failed. Unable to locate object: " + Reconcile_All_6Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Reconcile_All_6", "Click_Reconcile_All_6 failed. Unable to locate object: " + Reconcile_All_6Elem.toString());

			Assert.fail("Unable to locate object: " + Reconcile_All_6Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Reconcile_All_6");

		TestModellerLogger.PassStep(m_Driver, "Click_Reconcile_All_6");
	}

     
	/**
 	 * Click View Reconciled 7
     * @name Click View Reconciled 7
     */
	public void Click_View_Reconciled_7()
	{
        
		WebElement elem = getWebElement(View_Reconciled_7Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_View_Reconciled_7", "Click_View_Reconciled_7 failed. Unable to locate object: " + View_Reconciled_7Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_View_Reconciled_7", "Click_View_Reconciled_7 failed. Unable to locate object: " + View_Reconciled_7Elem.toString());

			Assert.fail("Unable to locate object: " + View_Reconciled_7Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_View_Reconciled_7");

		TestModellerLogger.PassStep(m_Driver, "Click_View_Reconciled_7");
	}

    
	/**
 	 * Select Months 10
     * @name Select Months 10
     */
    public void Select_Months_10(String Months_10)
 	{
 	    
 		WebElement elem = getWebElement(Months_10Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Months_10", "Select_Months_10 failed. Unable to locate object: " + Months_10Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Months_10", "Select_Months_10 failed. Unable to locate object: " + Months_10Elem.toString());

 			Assert.fail("Unable to locate object: " + Months_10Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Months_10);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Months_10 " + Months_10);

 		TestModellerLogger.PassStep(m_Driver, "Select_Months_10 " + Months_10);
 	}

      
	/**
 	 * Enter DateFrom 11
     * @name Enter DateFrom 11
     */
 	public void Enter_DateFrom_11(String DateFrom_11)
 	{
 	    
 		WebElement elem = getWebElement(DateFrom_11Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_DateFrom_11", "Enter_DateFrom_11 failed. Unable to locate object: " + DateFrom_11Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_DateFrom_11", "Enter_DateFrom_11 failed. Unable to locate object: " + DateFrom_11Elem.toString());

 			Assert.fail("Unable to locate object: " + DateFrom_11Elem.toString());
         }

 		
 		for(int i=0;i<=9;i++)
 		{
			m_Driver.findElement(By.xpath("//*[@id='ctl00_cPHFilter_txtDateFrom']")).sendKeys(Keys.BACK_SPACE);
 		}
 		
 		elem.sendKeys(DateFrom_11);
 		elem.sendKeys(Keys.TAB);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_DateFrom_11 " + DateFrom_11);

  		TestModellerLogger.PassStep(m_Driver, "Enter_DateFrom_11 " + DateFrom_11);
 	}

      
	/**
 	 * Enter DateTo 12
     * @name Enter DateTo 12
     */
 	public void Enter_DateTo_12(String DateTo_12)
 	{
 	    
 		WebElement elem = getWebElement(DateTo_12Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_DateTo_12", "Enter_DateTo_12 failed. Unable to locate object: " + DateTo_12Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_DateTo_12", "Enter_DateTo_12 failed. Unable to locate object: " + DateTo_12Elem.toString());

 			Assert.fail("Unable to locate object: " + DateTo_12Elem.toString());
         }
 		for(int i=0;i<=9;i++)
 		{
			m_Driver.findElement(By.xpath("//*[@id='ctl00_cPHFilter_txtDateTo']")).sendKeys(Keys.BACK_SPACE);
 		}
 		elem.sendKeys(DateTo_12);
 		elem.sendKeys(Keys.ENTER);
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_DateTo_12 " + DateTo_12);

  		TestModellerLogger.PassStep(m_Driver, "Enter_DateTo_12 " + DateTo_12);
 	}

     
	/**
 	 * Click Undo Reconcile 13
	 * @throws InterruptedException 
     * @name Click Undo Reconcile 13
     */
	public void Click_Undo_Reconcile_13() throws InterruptedException
	{
        
		WebElement elem = getWebElement(Undo_Reconcile_13Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Undo_Reconcile_13", "Click_Undo_Reconcile_13 failed. Unable to locate object: " + Undo_Reconcile_13Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Undo_Reconcile_13", "Click_Undo_Reconcile_13 failed. Unable to locate object: " + Undo_Reconcile_13Elem.toString());

			Assert.fail("Unable to locate object: " + Undo_Reconcile_13Elem.toString());
        }
Thread.sleep(2000);
		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Undo_Reconcile_13");

		TestModellerLogger.PassStep(m_Driver, "Click_Undo_Reconcile_13");
	}
	
	
	public void Advance_Reconcilation1(String Recontype) throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement ClickInvoice=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrReconcilePendingSummary_ctl00_lnkReconcileAccount']"));
		ClickInvoice.click();
		WebElement SalectAllBtn=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_chkReconcileUngroupSelected']"));
		SalectAllBtn.click();
		
		WebElement ReconcileBtn=m_Driver.findElement(By.xpath("	//*[@id='ctl00_cPH_rptrReconcile_ctl00_lnkReconcile']"));
		ReconcileBtn.click();
		Thread.sleep(2000);
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='ctl00_cPH_modalReconcileFrame']")));
		
		WebElement  SelectReconType =m_Driver.findElement(By.xpath("//select[@id='ctl00_cPH_ddReconcileType']"));
		
		Select Dropdown=new Select(SelectReconType);
				Dropdown.selectByVisibleText(Recontype);
				
		
		
		WebElement ReconBtn=m_Driver.findElement(By.xpath("//*[@id='ctl00_cphFooter_btnReconcile']"));
		ReconBtn.click();
		m_Driver.switchTo().defaultContent();
		
		
		
		
		
	
		
		
	}
	
	public void Advance_ReconcilationCreditNote1(String Recontype) throws InterruptedException
	{
		Thread.sleep(2000);
	//	WebElement ClickInvoice=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrReconcilePendingSummary_ctl00_lnkReconcileAccount']"));
	//	ClickInvoice.click();
		WebElement SalectAllBtn=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_chkReconcileUngroupSelected']"));
		SalectAllBtn.click();
		
		WebElement ReconcileBtn=m_Driver.findElement(By.xpath("	//*[@id='ctl00_cPH_rptrReconcile_ctl00_lnkReconcile']"));
		ReconcileBtn.click();
		Thread.sleep(2000);
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='ctl00_cPH_modalReconcileFrame']")));
		
		WebElement  SelectReconType =m_Driver.findElement(By.xpath("//select[@id='ctl00_cPH_ddReconcileType']"));
		
		Select Dropdown=new Select(SelectReconType);
				Dropdown.selectByVisibleText(Recontype);
				
		
		
		WebElement ReconBtn=m_Driver.findElement(By.xpath("//*[@id='ctl00_cphFooter_btnReconcile']"));
		ReconBtn.click();
		m_Driver.switchTo().defaultContent();
		
		
		
		
		
	
		
		
	}
	
	public void Advance_Rec_screenshot()
	{
		utilities.Screenshotcapture.Getscreenshot("Advance Reconcile of Invoice With Bank", "Reconcile");
	}
	public void Full_Credit_Rec_screenshot() throws InterruptedException
	{
		Thread.sleep(3000);
		utilities.Screenshotcapture.Getscreenshot("full reconililation of Credit Note With Bank", "Reconcile");
	}
	public void Advance_Credit_Rec_screenshot() throws InterruptedException
	{
		Thread.sleep(3000);
		utilities.Screenshotcapture.Getscreenshot("Advance reconililation With  Credit Note", "Advance Reconcile");
	}
	
	public void dsbBlanceZero()
	{
		WebElement Amountdue=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrDisplayRecords_ctl00_tdCol11']"));
		jsExec.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", Amountdue);
		utilities.Screenshotcapture.Getscreenshot("Advance Reconcile of Invoice With Bank Amount Due column Zero", "Reconcile");
	}
	public void dsbBlanceZero1()
	{
		WebElement Amountdue=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrDisplayRecords_ctl00_tdCol11']"));
		jsExec.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", Amountdue);
		utilities.Screenshotcapture.Getscreenshot("Advance Reconcile of Invoice With jouranl Entry Amount Due  Zero", "Reconcile");
	}
	
	public void Advance_ReconcilationCreditNote() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement ClickInvoice=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrReconcilePendingSummary_ctl01_lnkReconcileAccount']"));
		ClickInvoice.click();
		
		
		WebElement SalectAllBtn=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_chkReconcileUngroupSelected']"));
		SalectAllBtn.click();
		
		WebElement Ungroup=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_lnkUngroupSelected']"));
		Ungroup.click();
		Thread.sleep(2000);
		WebElement SalectAllBtn2=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_chkReconcileUngroupSelected']"));
		SalectAllBtn2.click();
		
		WebElement ReconcileBtn=m_Driver.findElement(By.xpath("	//*[@id='ctl00_cPH_rptrReconcile_ctl00_lnkReconcile']"));
		ReconcileBtn.click();
		Thread.sleep(2000);
//		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='ctl00_cPH_modalReconcileFrame']")));
//		
//		WebElement  SelectReconType =m_Driver.findElement(By.xpath("//select[@id='ctl00_cPH_ddReconcileType']"));
//		
//		Select Dropdown=new Select(SelectReconType);
//				Dropdown.selectByVisibleText(Recontype);
//				
//		
//		
//		WebElement ReconBtn=m_Driver.findElement(By.xpath("//*[@id='ctl00_cphFooter_btnReconcile']"));
//		ReconBtn.click();
//		m_Driver.switchTo().defaultContent();
		
		
		}
	
	
	public void Threedotcopy() throws InterruptedException
	{
		m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_filtrec']/div/div/table/tbody/tr[1]/td[15]/div/a/i")).click();
		m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrDisplayRecords_ctl00_LinkButton1']")).click();
		
		Thread.sleep(2000);
		m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_txtInvoiceNo']")).sendKeys("Copy");
		
        jsExec.executeScript("arguments[0].scrollIntoView(true);", m_Driver.findElement(By.xpath("//*[@id='ctl00_cpHFooter_btnSave']")));
		
		jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//*[@id='ctl00_cpHFooter_btnSave']")));
		
		
		Thread.sleep(2000);
	
		
	}
	
	public void ThreedotcopyScreeshot() throws InterruptedException
	{
		Thread.sleep(2000);
		utilities.Screenshotcapture.Getscreenshot("Just Create Credit Note in Three Dot Advnace", "Reconcile");
	}
	public void ThreedotcopyScreeshot1() throws InterruptedException
	{
		Thread.sleep(2000);
		utilities.Screenshotcapture.Getscreenshot("Just Create Credit Note in Three Dot Partial", "Reconcile");
	}
	
	public void Search(String InvNo)
	{
		WebElement selectSearchCat=m_Driver.findElement(By.xpath("//select[@id='ctl00_cPHFilter_dd_Search']"));
		Select sel=new Select(selectSearchCat);
		sel.selectByVisibleText("Inv#");
		m_Driver.findElement(By.xpath("//input[@id='ctl00_cPHFilter_txtSearch']")).sendKeys(InvNo);
		m_Driver.findElement(By.xpath("//*[@id='btnSearch']")).click();
	}
	
	public void clickTrn()
	{
		m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrDisplayRecords_ctl00_lnkTranDetail']")).click();
	}
	public void screenshot()
	{
		WebElement hightlight =m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_filtrec']/div/div/table/tbody/tr[1]"));
		jsExec.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", hightlight);
		utilities.Screenshotcapture.Getscreenshot("Advance Reconcile of Invoice With Bank Effect should be in every Invoices", "Reconcile");
	}
	public void screenshot3()
	{
		WebElement hightlight =m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_filtrec']/div/div/table/tbody/tr[1]"));
		jsExec.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", hightlight);
		utilities.Screenshotcapture.Getscreenshot("Advance Reconcile of Invoice With jouranl Entry Effect should be in every Invoices", "Reconcile");
	}
	
	public void screenshot2() throws InterruptedException
	{
		Thread.sleep(2000);
		utilities.Screenshotcapture.Getscreenshot("Advance Reconcile of Invoice With Bank Effect should be in Every Invoices2", "Reconcile");
	}
	public void screenshot4() throws InterruptedException
	{
		Thread.sleep(2000);
		utilities.Screenshotcapture.Getscreenshot("Advance Reconcile of Invoice With Journal Entry Effect should be in Every Invoices2", "Reconcile");
	}
	public void dsbBlanceZeroCredit() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement Amountdue=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrDisplayRecords_ctl00_tdCol11']"));
		jsExec.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", Amountdue);
		utilities.Screenshotcapture.Getscreenshot("full reconililation of Credit Note With Bank Amount Due Column Zero", "Reconcile");
	}
	public void dsbBlanceZeroCreditNote() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement Amountdue=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrDisplayRecords_ctl00_tdCol11']"));
		jsExec.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", Amountdue);
		utilities.Screenshotcapture.Getscreenshot("Advance Reconililation Credit Note Amount Due Column should be Zero", "Reconcile");
	}
	public void dsbBlanceZeroCreditNotejour() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement Amountdue=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrDisplayRecords_ctl00_tdCol11']"));
		jsExec.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", Amountdue);
		utilities.Screenshotcapture.Getscreenshot("Credit Note Advance Reconcile With Journal Entry Amount Due Zero", "Reconcile");
	}
	public void dsbBlanceZeroCreditWithBnk() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement Amountdue=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrDisplayRecords_ctl00_tdCol11']"));
		jsExec.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", Amountdue);
		utilities.Screenshotcapture.Getscreenshot("Credit Note Advance reconililation With Bank Amount Due Zero", "Reconcile");
	}
	public void dsbBlanceZeroPCreditNotejour() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement Amountdue=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrDisplayRecords_ctl00_tdCol11']"));
		jsExec.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", Amountdue);
		utilities.Screenshotcapture.Getscreenshot("Credit Note Partial Reconcile With Journal Entry Amount Due As Per Expected", "Reconcile");
	}
	public void dsbBlanceZeroPCreditNoteBank() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement Amountdue=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrDisplayRecords_ctl00_tdCol11']"));
		jsExec.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", Amountdue);
		utilities.Screenshotcapture.Getscreenshot("Credit Note Partial Reconcile With Bank Amount Due As Per Expected", "Reconcile");
	}
}