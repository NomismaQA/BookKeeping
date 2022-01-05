package pages;

import pages.BasePage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

import Generic.SeleniumLib;
import Generic.WaitStatementLib;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

 //http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/2ec50f60-5843-43c6-9168-2c06cd89cec9
 @TestModellerModule(guid = "2ec50f60-5843-43c6-9168-2c06cd89cec9")
 public class VerifyTrialBalance extends BasePage
{
	 SeleniumLib sl;
	 double d1 ;
	 double d2 ;
     double d3 ;
     double total;
     double vat;
     int i1 ;
 	 int i2 ;
 	 double STDrate = .20;
 	 double total1;
 	double total2;
 	WaitStatementLib wt;
	public VerifyTrialBalance (WebDriver driver)
	{		super(driver);
	     sl= new SeleniumLib(driver);
	     wt =new WaitStatementLib();
	}


	
	private By AccountantElem = By.xpath("//LI[@id='ctl00_SideMenu1_accountantMenu']/A/SPAN[@class='side_nav_text']");

	private By ClickJournalPlusElem = By.xpath("//A[@id='ctl00_cPH_btnAddJournalEntry']/I[@class='fa fa-plus hav_tooltip btn']");

	private By DateElem = By.xpath("//*[@id='ctl00_cPH_txtDate']");

	private By Slect_CurrencyElem = By.xpath("//SELECT[@name='ctl00$cPH$ddCurrency']");
	
	private By DescriptionElem = By.xpath("//*[@id='ctl00_cPH_txtDescription']");

	private By Account1Elem = By.xpath("//*[@id='select2-ctl00_cPH_rptRecord_ctl00_ltAccount-container']");

	private By Debit1Elem = By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDebit']");

	private By Credit1Elem = By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtCredit']");

	private By Account2Elem = By.xpath("//*[@id='select2-ctl00_cPH_rptRecord_ctl01_ltAccount-container']");

	private By Debit2Elem = By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl01_txtDebit']");

	private By Credit2Elem = By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl01_txtCredit']");

	private By Account3Elem = By.xpath("//*[@id='select2-ctl00_cPH_rptRecord_ctl02_ltAccount-container']");

	private By Debit3Elem = By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl02_txtDebit']");

	private By Credit3Elem = By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl02_txtCredit']");

	private By Account4Elem = By.xpath("//*[@id='select2-ctl00_cPH_rptRecord_ctl03_ltAccount-container']");

	private By Debit4Elem = By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl03_txtDebit']");

	private By Credit4Elem = By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl03_txtCredit']");

	private By Account5Elem = By.xpath("//*[@id='select2-ctl00_cPH_rptRecord_ctl04_ltAccount-container']");

	private By Debit5Elem = By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl04_txtDebit']");

	private By Credit5Elem = By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl04_txtCredit']");

	private By Tick_for_more_line_itemsElem = By.xpath("//DIV[@class='exp_tick']/LABEL");

	private By Account6Elem =By.xpath("//*[@id='select2-ctl00_cPH_rptRecord_ctl05_ltAccount-container']");

	private By Debit6Elem = By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl05_txtDebit']");

	private By Credit6Elem = By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl05_txtCredit']");

	private By Account7Elem =By.xpath("//*[@id='select2-ctl00_cPH_rptRecord_ctl06_ltAccount-container']");

	private By Debit7Elem = By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl06_txtDebit']");

	private By Credit7Elem = By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl06_txtCredit']");

	private By Account8Elem = By.xpath("//*[@id='select2-ctl00_cPH_rptRecord_ctl07_ltAccount-container']");

	private By Debit8Elem = By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl07_txtDebit']");

	private By Credit8Elem = By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl07_txtCredit']");

	private By Account9Elem = By.xpath("//*[@id='select2-ctl00_cPH_rptRecord_ctl08_ltAccount-container']");

	private By Debit9Elem = By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl08_txtDebit']");

	private By Credit9Elem = By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl08_txtCredit']");

	private By Account10Elem = By.xpath("//*[@id='select2-ctl00_cPH_rptRecord_ctl09_ltAccount-container']");

	private By Debit10Elem = By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl09_txtDebit']");

	private By Credit10Elem = By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl09_txtCredit']");

	private By Account11Elem = By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl10_AccountUC1_txtAccount']");

	private By Debit11Elem = By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl10_txtDebit']");

	private By Credit11Elem = By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl10_txtCredit']");

	private By _Save_Elem = By.xpath("//*[@id='ctl00_cphFooter_btnSave']");

	private By ClickReportsElem = By.xpath("//LI[@id='ctl00_SideMenu1_reportMenu']/A/SPAN[@class='side_nav_text']");

	private By Click_Trial_BalanceElem = By.xpath("//tr/td/a[text()='Trial Balance']");

	private By Select_Financial_YearElem = By.xpath("//*[@id='ctl00_ddlFinancialYear']");

	private By entry1xpath=By.xpath("//*[@id='select2-ctl00_cPH_rptRecord_ctl00_ltAccount-container']");
	private By entry2xpath=By.xpath("//*[@id='select2-ctl00_cPH_rptRecord_ctl01_ltAccount-container']");
	private By entry3xpath=By.xpath("//*[@id='select2-ctl00_cPH_rptRecord_ctl02_ltAccount-container']");
	private By entry4xpath=By.xpath("//*[@id='select2-ctl00_cPH_rptRecord_ctl03_ltAccount-container']");
	private By entry5xpath=By.xpath("//*[@id='select2-ctl00_cPH_rptRecord_ctl04_ltAccount-container']");
	private By entry6xpath=By.xpath("//*[@id='select2-ctl00_cPH_rptRecord_ctl05_ltAccount-container']");
	private By entry7xpath=By.xpath("//*[@id='select2-ctl00_cPH_rptRecord_ctl06_ltAccount-container']");
	private By entry8xpath=By.xpath("//*[@id='select2-ctl00_cPH_rptRecord_ctl07_ltAccount-container']");
	private By entry9xpath=By.xpath("//*[@id='select2-ctl00_cPH_rptRecord_ctl08_ltAccount-container']");
	private By entry10xpath=By.xpath("//*[@id='select2-ctl00_cPH_rptRecord_ctl09_ltAccount-container']");
	private By entry11xpath=By.xpath("//*[@id='select2-ctl00_cPH_rptRecord_ctl02_ltAccount-container']");
	
	
	private By debit1xpath=By.xpath("//input[@id='ctl00_cPH_rptRecord_ctl00_txtDebit']");
	private By debit2xpath=By.xpath("//input[@id='ctl00_cPH_rptRecord_ctl01_txtDebit']");
	private By debit3xpath=By.xpath("//input[@id='ctl00_cPH_rptRecord_ctl02_txtDebit']");
	private By debit4xpath=By.xpath("//input[@id='ctl00_cPH_rptRecord_ctl03_txtDebit']");
	private By debit5xpath=By.xpath("//input[@id='ctl00_cPH_rptRecord_ctl04_txtDebit']");
	private By debit6xpath=By.xpath("//input[@id='ctl00_cPH_rptRecord_ctl05_txtDebit']");
	private By debit7xpath=By.xpath("//input[@id='ctl00_cPH_rptRecord_ctl06_txtDebit']");
	private By debit8xpath=By.xpath("//input[@id='ctl00_cPH_rptRecord_ctl07_txtDebit']");
	private By debit9xpath=By.xpath("//input[@id='ctl00_cPH_rptRecord_ctl08_txtDebit']");
	private By debit10xpath=By.xpath("//input[@id='ctl00_cPH_rptRecord_ctl09_txtDebit']");
	private By debit11xpath=By.xpath("//input[@id='ctl00_cPH_rptRecord_ctl10_txtDebit']");
	
	
	private By credit1xpath=By.xpath("//input[@id='ctl00_cPH_rptRecord_ctl00_txtCredit']");
	private By credit2xpath=By.xpath("//input[@id='ctl00_cPH_rptRecord_ctl01_txtCredit']");
	private By credit3xpath=By.xpath("//input[@id='ctl00_cPH_rptRecord_ctl02_txtCredit']");
	private By credit4xpath=By.xpath("//input[@id='ctl00_cPH_rptRecord_ctl03_txtCredit']");
	private By credit5xpath=By.xpath("//input[@id='ctl00_cPH_rptRecord_ctl04_txtCredit']");
	private By credit6xpath=By.xpath("//input[@id='ctl00_cPH_rptRecord_ctl05_txtCredit']");
	private By credit7xpath=By.xpath("//input[@id='ctl00_cPH_rptRecord_ctl06_txtCredit']");
	private By credit8xpath=By.xpath("//input[@id='ctl00_cPH_rptRecord_ctl07_txtCredit']");
	private By credit9xpath=By.xpath("//input[@id='ctl00_cPH_rptRecord_ctl08_txtCredit']");
	private By credit10xpath=By.xpath("//input[@id='ctl00_cPH_rptRecord_ctl09_txtCredit']");
	private By credit11xpath=By.xpath("//input[@id='ctl00_cPH_rptRecord_ctl10_txtCredit']");
	
	//private By totaldebit_xpath=By.xpath("(//div[@id='plprofit_table_wrap1']/div/div/div/table/tbody/tr/th[2])[2]");
	//private By totalcredit_xpath=By.xpath("(//div[@id='plprofit_table_wrap1']/div/div/div/table/tbody/tr/th[3])[2]");
	
	
	//private String ledger11;
	//private String ledger12;
	//private String ledger13;
	//private String ledger14;
	//private String ledger15;
	//private String ledger16;
	//private String ledger17;
	//private String ledger18;
	//private String ledger19;
	//private String ledger110;
	//private String ledger111;
	
	
	private String ledger1Entered_1;
	private String ledger1Entered_2;
	private String ledger1Entered_3;
	private String ledger1Entered_4;
	private String ledger1Entered_5;
	private String ledger1Entered_6;
	private String ledger1Entered_7;
	private String ledger1Entered_8;
	private String ledger1Entered_9;
	private String ledger1Entered_10;
	private String ledger1Entered_11;
	
	//private Double debit1;
	//private Double debit2;
	//private Double debit3;
	//private Double debit4;
	//private Double debit5;
	///private Double debit6;
	//private Double debit7;
	//private Double debit8;
	//private Double debit9;
	//private Double debit10;
	//private Double debit11;
	
	//private Double credit1;
	//private Double credit2;
	//private Double credit3;
	//private Double credit4;
	//private Double credit5;
	//private Double credit6;
	//private Double credit7;
	//private Double credit8;
	//private Double credit9;
	///private Double credit10;
	//private Double credit11;
	
	//private Double debit_total;
	//private Double credit_total;
	
	public Robot robot;
	
	private ArrayList<String> ledger1=new ArrayList<String>();
	private ArrayList<String> expected_entry1= new ArrayList<String>();
	private ArrayList<String> amt1=new ArrayList<String>();

	
	public void GoToUrl()
	{
		m_Driver.get("http://sandboxpre.nomismasolution.co.uk/AccountUI/ReportTrialBalance.aspx?FYCode=8512&CompanyCode=6600");

	ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandboxpre.nomismasolution.co.uk/AccountUI/ReportTrialBalance.aspx?FYCode=8512&CompanyCode=6600");
		
	TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandboxpre.nomismasolution.co.uk/AccountUI/ReportTrialBalance.aspx?FYCode=8512&CompanyCode=6600");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandboxpre.nomismasolution.co.uk/AccountUI/ReportTrialBalance.aspx?FYCode=8512&CompanyCode=6600";

        if (!currentUrl.equals("http://sandboxpre.nomismasolution.co.uk/AccountUI/ReportTrialBalance.aspx?FYCode=8512&CompanyCode=6600")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click Accountant
     * @name Click Accountant
     */
	public void Click_Accountant()
	{
        
		WebElement elem = getWebElement(AccountantElem);

	if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Accountant", "Click_Accountant failed. Unable to locate object: " + AccountantElem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Accountant", "Click_Accountant failed. Unable to locate object: " + AccountantElem.toString());

			Assert.fail("Unable to locate object: " + AccountantElem.toString());
        }

		elem.click();
          	

	ExtentReportManager.passStep(m_Driver, "Click_Accountant");

	TestModellerLogger.PassStep(m_Driver, "Click_Accountant");
	}

     
	/**
 	 * Click ClickJournalPlus
     * @name Click ClickJournalPlus
     */
	public void Click_ClickJournalPlus()
	{
        
		WebElement elem = getWebElement(ClickJournalPlusElem);

	if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClickJournalPlus", "Click_ClickJournalPlus failed. Unable to locate object: " + ClickJournalPlusElem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClickJournalPlus", "Click_ClickJournalPlus failed. Unable to locate object: " + ClickJournalPlusElem.toString());

			Assert.fail("Unable to locate object: " + ClickJournalPlusElem.toString());
        }

		elem.click();
          	

	ExtentReportManager.passStep(m_Driver, "Click_ClickJournalPlus");

	TestModellerLogger.PassStep(m_Driver, "Click_ClickJournalPlus");
	}

      
	/**
 	 * Enter Date
     * @name Enter Date
     */
 	public void Enter_Date(String Date)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_cPH_journalmodal1Iframe1']")));

 		WebElement elem = getWebElement(DateElem);

		if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Date", "Enter_Date failed. Unable to locate object: " + DateElem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Date", "Enter_Date failed. Unable to locate object: " + DateElem.toString());

 			Assert.fail("Unable to locate object: " + DateElem.toString());
         }

 		elem.sendKeys(Date);
 	
		m_Driver.switchTo().defaultContent();

 		
  		 ExtentReportManager.passStep(m_Driver, "Enter_Date " + Date);

  		 TestModellerLogger.PassStep(m_Driver, "Enter_Date " + Date);
 	}
	/**
 	 * Select Slect_Currency
	 * @throws InterruptedException 
     * @name Select Slect_Currency
     */
    public void Select_Slect_Currency(String Slect_Currency) throws InterruptedException
 	{
 	    
		//m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div/div[1]/div/div/div/div[1]/div/div/div/div[1]/div/div/div[2]/iframe")));
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='ctl00_cPH_journalmodal1Iframe1']")));
 		WebElement elem = getWebElement(Slect_CurrencyElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Slect_Currency", "Select_Slect_Currency failed. Unable to locate object: " + Slect_CurrencyElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Slect_Currency", "Select_Slect_Currency failed. Unable to locate object: " + Slect_CurrencyElem.toString());

 			Assert.fail("Unable to locate object: " + Slect_CurrencyElem.toString());
         }

 		Select dropdown = new Select(elem);
        //elem.sendKeys(Keys.ENTER);
 		dropdown.selectByVisibleText(Slect_Currency);
 		elem.sendKeys(Keys.TAB);
 		m_Driver.switchTo().defaultContent();
		//elem.sendKeys(Keys.TAB);
		//Thread.sleep((2000));
	 		ExtentReportManager.passStep(m_Driver, "Select_Slect_Currency " + Slect_Currency);

 		TestModellerLogger.PassStep(m_Driver, "Select_Slect_Currency " + Slect_Currency);
 	}
      
	/**
 	 * Enter Description
     * @name Enter Description
     */
 	public void Enter_Description(String Description)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_cPH_journalmodal1Iframe1']")));

 		WebElement elem = getWebElement(DescriptionElem);

		if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Description", "Enter_Description failed. Unable to locate object: " + DescriptionElem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Description", "Enter_Description failed. Unable to locate object: " + DescriptionElem.toString());

 			Assert.fail("Unable to locate object: " + DescriptionElem.toString());
         }

 		elem.sendKeys(Description);
 		jsExec.executeScript("arguments[0].scrollIntoView(true);", elem);
 		
		m_Driver.switchTo().defaultContent();

 		
  		 ExtentReportManager.passStep(m_Driver, "Enter_Description " + Description);

  		 TestModellerLogger.PassStep(m_Driver, "Enter_Description " + Description);
 	}

      
	/**
 	 * Enter Account_1
	 * @throws Exception 
     * @name Enter Account_1
     */
 	public void Enter_Account1(String Account1) throws Exception
 	{
 		//robot = new Robot();
 	    //ledger11=Account1; 
 	    ledger1.add(0, Account1);
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_cPH_journalmodal1Iframe1']")));

 		WebElement elem = getWebElement(Account1Elem);

		if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Account1", "Enter_Account1 failed. Unable to locate object: " + Account1Elem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Account1", "Enter_Account1 failed. Unable to locate object: " + Account1Elem.toString());

 			Assert.fail("Unable to locate object: " + Account1Elem.toString());
         }
		
 		//elem.sendKeys(Account1);
		//SeleniumLib sl= new SeleniumLib(m_Driver);
 		//sl.ArrowDownSelect(m_Driver, elem, Account1);
		//ArrayList<Integer> xx = new ArrayList<Integer>();
		
		wt.explicitWait_elementToBeClickable(m_Driver, 20, elem);
		elem.click();
		wt.explicitiWait_presenceOfElementLocated(m_Driver, 20, By.xpath("//ul[@id='select2-ctl00_cPH_rptRecord_ctl00_ltAccount-results']/li/ul/li[starts-with(text(), '"+Account1+" - "+"')]"));
		
		//wt.explicitWait_elementToBeClickable(m_Driver, 20, m_Driver.findElement(By.xpath("//ul[@id='ctl00_cPH_rptRecord_ctl00_AccountUC1_AutoCompleteExtender1_completionListElem']/li[starts-with(text(), '"+Account1+" -"+"')]")));
		WebElement elemc= m_Driver.findElement(By.xpath("//ul[@id='select2-ctl00_cPH_rptRecord_ctl00_ltAccount-results']/li/ul/li[starts-with(text(), '"+Account1+" - "+"')]"));
		elemc.click();
	
		
	
		
		
 		WebElement ele1=getWebElement(entry1xpath);
 		ledger1Entered_1=ele1.getAttribute("title");
 		expected_entry1.add(0, ledger1Entered_1);
 	    //System.out.println(ledger1Entered_1);
 	    Reporter.log("ledger1 1 Entered :"+ledger1Entered_1, true); 
		m_Driver.switchTo().defaultContent();

 		
  		 ExtentReportManager.passStep(m_Driver, "Enter_Account1 " + Account1);

  		 TestModellerLogger.PassStep(m_Driver, "Enter_Account1 " + Account1);
 	}
 	public void Enter_Account1_way3(String Account1) throws AWTException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, InterruptedException
 	{
 		//robot = new Robot();
 	    
 	    ledger1.add(0, Account1);
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_cPH_journalmodal1Iframe1']")));

 		WebElement elem = getWebElement(Account1Elem);

		if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Account1", "Enter_Account1 failed. Unable to locate object: " + Account1Elem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Account1", "Enter_Account1 failed. Unable to locate object: " + Account1Elem.toString());

 			Assert.fail("Unable to locate object: " + Account1Elem.toString());
         }
		WaitStatementLib wt=new WaitStatementLib();
		wt.explicitWait_elementToBeClickable(m_Driver, 20, elem);
		elem.click();
		
		wt.explicitiWait_presenceOfElementLocated(m_Driver, 20, By.xpath("//ul[@id='ctl00_cPH_rptRecord_ctl00_AccountUC1_AutoCompleteExtender1_completionListElem']/li[starts-with(text(), '"+Account1+"')]"));
		
		//wt.explicitWait_elementToBeClickable(m_Driver, 20, m_Driver.findElement(By.xpath("//ul[@id='ctl00_cPH_rptRecord_ctl00_AccountUC1_AutoCompleteExtender1_completionListElem']/li[starts-with(text(), '"+Account1+" -"+"')]")));
		WebElement elemc= m_Driver.findElement(By.xpath("//ul[@id='ctl00_cPH_rptRecord_ctl00_AccountUC1_AutoCompleteExtender1_completionListElem']/li[starts-with(text(), '"+Account1+"')]"));
		elemc.click();
		
 		WebElement ele1=getWebElement(entry1xpath);
 		ledger1Entered_1=ele1.getAttribute("value");
 		expected_entry1.add(0, ledger1Entered_1);
 	    Reporter.log("Ledger 1 Entered :"+expected_entry1, true); 
		m_Driver.switchTo().defaultContent();

 		
  		 ExtentReportManager.passStep(m_Driver, "Enter_Account1 " + Account1);

  		 TestModellerLogger.PassStep(m_Driver, "Enter_Account1 " + Account1);
 	}
 	
 	public void Enter_Account1_select2(String Account1) throws Exception
 	{
 		robot = new Robot();
 	    //ledger11=Account1; 
 	    ledger1.add(0, Account1);
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_cPH_journalmodal1Iframe1']")));

 		WebElement elem = getWebElement(Account1Elem);

		if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Account1", "Enter_Account1 failed. Unable to locate object: " + Account1Elem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Account1", "Enter_Account1 failed. Unable to locate object: " + Account1Elem.toString());

 			Assert.fail("Unable to locate object: " + Account1Elem.toString());
         }
		
 		//elem.sendKeys(Account1);
		//SeleniumLib sl= new SeleniumLib(m_Driver);
 		//sl.ArrowDownSelect(m_Driver, elem, Account1);
		//ArrayList<Integer> xx = new ArrayList<Integer>();
		elem.click();
		String[] splited_ledger1 = Account1.split("");
		for (String string : splited_ledger1) {
			String Robot_cmd = "VK_" + string;

            Class<KeyEvent> clazz = KeyEvent.class;
            Field field = clazz.getField( Robot_cmd );
            int keyCode = field.getInt(null);
            
            robot.setAutoDelay(200);
            robot.keyPress( keyCode );
            robot.setAutoDelay(200);
            robot.keyRelease( keyCode );
            
		}
		robot.setAutoDelay(200);
		/*robot.keyPress(KeyEvent.VK_DOWN);
		robot.setAutoDelay(200);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(200);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.setAutoDelay(200);
		robot.keyRelease(KeyEvent.VK_ENTER);*/
		//m_Driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		/*List<WebElement> All_List_elements = m_Driver.findElements(By.xpath("//ul[@id='ctl00_cPH_rptRecord_ctl00_AccountUC1_AutoCompleteExtender1_completionListElem']/li"));
		int size = All_List_elements.size();
		System.out.println(size);
		for (int i = 0; i <size; i++) {
			WebElement element = All_List_elements.get(i);
			String[] led = element.getText().split("-");
			//System.out.println(led[0].trim());
			//System.out.println(Account1);
			if (led[0].trim().equals(Account1)) {
				//robot.setAutoDelay(200);
				//Thread.sleep(5000);
				element.click();
				break;
			}
		}*/
		
  	//wt.explicitWait_attributeToBeNotEmpty(driver, 5, element, "value");
  	 Actions act = new Actions(m_Driver);
  	 act.sendKeys(Keys.ARROW_DOWN).perform();
  	 act.sendKeys(Keys.ARROW_DOWN).perform();
  	 act.sendKeys(Keys.ENTER).perform();	
		
		
 		WebElement ele1=getWebElement(entry1xpath);
 		ledger1Entered_1=ele1.getAttribute("value");
 		expected_entry1.add(0, ledger1Entered_1);
 	    //System.out.println(ledger1Entered_1);
 	    Reporter.log("ledger1 1 Entered :"+ledger1Entered_1, true); 
		m_Driver.switchTo().defaultContent();

 		
  		 ExtentReportManager.passStep(m_Driver, "Enter_Account1 " + Account1);

  		 TestModellerLogger.PassStep(m_Driver, "Enter_Account1 " + Account1);
 	}

      
	/**
 	 * Enter Debit_1
     * @name Enter Debit_1
     */
 	public void Enter_Debit1(String Debit1)
 	{
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_cPH_journalmodal1Iframe1']")));

 		WebElement elem = getWebElement(Debit1Elem);

		if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Debit1", "Enter_Debit1 failed. Unable to locate object: " + Debit1Elem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Debit1", "Enter_Debit1 failed. Unable to locate object: " + Debit1Elem.toString());

 			Assert.fail("Unable to locate object: " + Debit1Elem.toString());
         }

 		elem.sendKeys(Debit1);
 	//	WebElement ele1=getWebElement(debit1xpath);
 		//debit1=Double.parseDouble(ele1.getAttribute("value"));
 		//amt1.add(ele1.getAttribute("value"));
 		amt1.add(0,Debit1);
 		//double debit_c = Double.parseDouble(Debit1);
 		//Assert.assertEquals(debit_c, debit1);
 	
		m_Driver.switchTo().defaultContent();

 		
  		 ExtentReportManager.passStep(m_Driver, "Enter_Debit1 " + Debit1);

  		 TestModellerLogger.PassStep(m_Driver, "Enter_Debit1 " + Debit1);
 	}

      
	/**
 	 * Enter Credit_1
     * @name Enter Credit_1
     */
 	public void Enter_Credit1(String Credit1)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_cPH_journalmodal1Iframe1']")));

 		WebElement elem = getWebElement(Credit1Elem);

		if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Credit1", "Enter_Credit1 failed. Unable to locate object: " + Credit1Elem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Credit1", "Enter_Credit1 failed. Unable to locate object: " + Credit1Elem.toString());

 			Assert.fail("Unable to locate object: " + Credit1Elem.toString());
         }

 		elem.sendKeys(Credit1);
 		WebElement ele1=getWebElement(credit1xpath);
 		//credit1=Double.parseDouble(ele1.getAttribute("value"));
 		amt1.add(0, ele1.getAttribute("value"));
 		//Assert.assertEquals(String.valueOf(credit11), Credit11);
 	
		m_Driver.switchTo().defaultContent();

 		
  		 ExtentReportManager.passStep(m_Driver, "Enter_Credit1 " + Credit1);

  		 TestModellerLogger.PassStep(m_Driver, "Enter_Credit1 " + Credit1);
 	}

      
	/**
 	 * Enter Account_2
	 * @throws Exception 
	 * @throws NoSuchFieldException 
     * @name Enter Account_2
     */
 	public void Enter_Account2(String Account2) throws Exception
 	{
 		//ledger12=Account2;
 		ledger1.add(1, Account2);
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_cPH_journalmodal1Iframe1']")));

 		WebElement elem = getWebElement(Account2Elem);

		if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Account2", "Enter_Account2 failed. Unable to locate object: " + Account2Elem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Account2", "Enter_Account2 failed. Unable to locate object: " + Account2Elem.toString());

 			Assert.fail("Unable to locate object: " + Account2Elem.toString());
         }

 		//elem.sendKeys(Account2);
		
		wt.explicitWait_elementToBeClickable(m_Driver, 20, elem);
		elem.click();
		Thread.sleep(2000);
		wt.explicitiWait_presenceOfElementLocated(m_Driver, 20, By.xpath("//*[@id='select2-ctl00_cPH_rptRecord_ctl01_ltAccount-results']/li/ul/li[starts-with(text(), '"+Account2+" - "+"')]"));
		

		//wt.explicitWait_elementToBeClickable(m_Driver, 20, m_Driver.findElement(By.xpath("//ul[@id='ctl00_cPH_rptRecord_ctl01_AccountUC1_AutoCompleteExtender1_completionListElem']/li[starts-with(text(), '"+Account2+" -"+"')]")));
		WebElement elemc= m_Driver.findElement(By.xpath("//*[@id='select2-ctl00_cPH_rptRecord_ctl01_ltAccount-results']/li/ul/li[starts-with(text(), '"+Account2+" - "+"')]"));
		elemc.click();
		
		
 		WebElement ele1=getWebElement(entry2xpath);
 		ledger1Entered_2=ele1.getAttribute("title");
 		expected_entry1.add(1, ele1.getAttribute("title"));
 	    //System.out.println(ledger1Entered_2);
 	   Reporter.log("ledger1 2 Entered :"+ledger1Entered_2, true);
		m_Driver.switchTo().defaultContent();

 		
  		 ExtentReportManager.passStep(m_Driver, "Enter_Account2 " + Account2);

  		 TestModellerLogger.PassStep(m_Driver, "Enter_Account2 " + Account2);
 	}
 	public void Enter_Account2_way3(String Account2) throws NoSuchFieldException, Exception
 	{
 		//ledger2=Account2;
 		ledger1.add(1, Account2);
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_cPH_journalmodal1Iframe1']")));

 		WebElement elem = getWebElement(Account2Elem);

		if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Account2", "Enter_Account2 failed. Unable to locate object: " + Account2Elem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Account2", "Enter_Account2 failed. Unable to locate object: " + Account2Elem.toString());

 			Assert.fail("Unable to locate object: " + Account2Elem.toString());
         }

 		//elem.sendKeys(Account2);
		WaitStatementLib wt=new WaitStatementLib();
		wt.explicitWait_elementToBeClickable(m_Driver, 20, elem);
		elem.click();
		//Thread.sleep(1000);
		wt.explicitiWait_presenceOfElementLocated(m_Driver, 20, By.xpath("//ul[@id='ctl00_cPH_rptRecord_ctl01_AccountUC1_AutoCompleteExtender1_completionListElem']/li[starts-with(text(), '"+Account2+"')]"));
		

		//wt.explicitWait_elementToBeClickable(m_Driver, 20, m_Driver.findElement(By.xpath("//ul[@id='ctl00_cPH_rptRecord_ctl01_AccountUC1_AutoCompleteExtender1_completionListElem']/li[starts-with(text(), '"+Account2+" -"+"')]")));
		WebElement elemc= m_Driver.findElement(By.xpath("//ul[@id='ctl00_cPH_rptRecord_ctl01_AccountUC1_AutoCompleteExtender1_completionListElem']/li[starts-with(text(), '"+Account2+"')]"));
		elemc.click();
		
		
 		WebElement ele1=getWebElement(entry2xpath);
 		ledger1Entered_2=ele1.getAttribute("value");
 		expected_entry1.add(1, ele1.getAttribute("value"));
 	    //System.out.println(LedgerEntered_2);
 	   Reporter.log("Ledger 2 Entered :"+ledger1Entered_2, true);
		m_Driver.switchTo().defaultContent();
  		 ExtentReportManager.passStep(m_Driver, "Enter_Account2 " + Account2);

  		 TestModellerLogger.PassStep(m_Driver, "Enter_Account2 " + Account2);
 	}

      
	/**
 	 * Enter Debit_2
     * @name Enter Debit_2
     */
 	public void Enter_Debit2(String Debit2)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_cPH_journalmodal1Iframe1']")));

 		WebElement elem = getWebElement(Debit2Elem);

		if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Debit2", "Enter_Debit2 failed. Unable to locate object: " + Debit2Elem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Debit2", "Enter_Debit2 failed. Unable to locate object: " + Debit2Elem.toString());

 			Assert.fail("Unable to locate object: " + Debit2Elem.toString());
         }

 		elem.sendKeys(Debit2);
 		//WebElement ele1=getWebElement(debit2xpath);
 		//debit2=Double.parseDouble(ele1.getAttribute("value"));
 		//amt1.add(ele1.getAttribute("value"));
 		amt1.add(1, Debit2);
 		//Assert.assertEquals(String.valueOf(debit2), Debit2);
 	
		m_Driver.switchTo().defaultContent();

 		
  		 ExtentReportManager.passStep(m_Driver, "Enter_Debit2 " + Debit2);

  		 TestModellerLogger.PassStep(m_Driver, "Enter_Debit2 " + Debit2);
 	}

      
	/**
 	 * Enter Credit_2
     * @name Enter Credit_2
     */
 	public void Enter_Credit2(String Credit2)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_cPH_journalmodal1Iframe1']")));

 		WebElement elem = getWebElement(Credit2Elem);

		if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Credit2", "Enter_Credit2 failed. Unable to locate object: " + Credit2Elem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Credit2", "Enter_Credit2 failed. Unable to locate object: " + Credit2Elem.toString());

 			Assert.fail("Unable to locate object: " + Credit2Elem.toString());
         }

 		elem.sendKeys(Credit2);
 	//	WebElement ele1=getWebElement(credit2xpath);
 		//credit2=Double.parseDouble(ele1.getAttribute("value"));
 		amt1.add(1, Credit2);
 		//Assert.assertEquals(String.valueOf(credit11), Credit11);
 	
		m_Driver.switchTo().defaultContent();

 		
  		 ExtentReportManager.passStep(m_Driver, "Enter_Credit2 " + Credit2);

  		 TestModellerLogger.PassStep(m_Driver, "Enter_Credit2 " + Credit2);
 	}

      
	/**
 	 * Enter Account_3
	 * @throws Exception 
	 * @throws IllegalArgumentException 
     * @name Enter Account_3
     */
 	public void Enter_Account3(String Account3) throws Exception
 	{
 		//ledger13=Account3;
 		ledger1.add(2, Account3);
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_cPH_journalmodal1Iframe1']")));

 		WebElement elem = getWebElement(Account3Elem);

		if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Account3", "Enter_Account3 failed. Unable to locate object: " + Account3Elem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Account3", "Enter_Account3 failed. Unable to locate object: " + Account3Elem.toString());

 			Assert.fail("Unable to locate object: " + Account3Elem.toString());
         }

 		//elem.sendKeys(Account3);
		
		wt.explicitWait_elementToBeClickable(m_Driver, 20, elem);
		elem.click();
		wt.explicitiWait_presenceOfElementLocated(m_Driver, 20, By.xpath("//*[@id='select2-ctl00_cPH_rptRecord_ctl02_ltAccount-results']/li/ul/li[starts-with(text(), '"+Account3+" - "+"')]"));
		
		
		//wt.explicitWait_elementToBeClickable(m_Driver, 20, m_Driver.findElement(By.xpath("//ul[@id='ctl00_cPH_rptRecord_ctl03_AccountUC1_AutoCompleteExtender1_completionListElem']/li[starts-with(text(), '"+Account4+" -"+"')]")));
		WebElement elemc= m_Driver.findElement(By.xpath("//*[@id='select2-ctl00_cPH_rptRecord_ctl02_ltAccount-results']/li/ul/li[starts-with(text(), '"+Account3+" -"+"')]"));
		elemc.click();
	
 		WebElement ele1=getWebElement(entry3xpath);
 		ledger1Entered_3=ele1.getAttribute("title");
 		expected_entry1.add(2, ele1.getAttribute("title"));
 	    //System.out.println(ledger1Entered_3);
 	   Reporter.log("ledger1 3 Entered :"+ledger1Entered_3, true);
		m_Driver.switchTo().defaultContent();

 		
  		 ExtentReportManager.passStep(m_Driver, "Enter_Account3 " + Account3);

  		 TestModellerLogger.PassStep(m_Driver, "Enter_Account3 " + Account3);
 	}
 	public void Enter_Account3_way3(String Account3) throws NoSuchFieldException, Exception
 	{
 		//ledger3=Account3;
 		ledger1.add(2, Account3);
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_cPH_journalmodal1Iframe1']")));

 		WebElement elem = getWebElement(Account3Elem);

		if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Account3", "Enter_Account3 failed. Unable to locate object: " + Account3Elem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Account3", "Enter_Account3 failed. Unable to locate object: " + Account3Elem.toString());

 			Assert.fail("Unable to locate object: " + Account3Elem.toString());
         }

		WaitStatementLib wt=new WaitStatementLib();
		wt.explicitWait_elementToBeClickable(m_Driver, 20, elem);
		elem.click();
		//Thread.sleep(1000);
		wt.explicitiWait_presenceOfElementLocated(m_Driver, 20, By.xpath("//ul[@id='ctl00_cPH_rptRecord_ctl02_AccountUC1_AutoCompleteExtender1_completionListElem']/li[starts-with(text(), '"+Account3+"')]"));
		
		//wt.explicitWait_elementToBeClickable(m_Driver, 20, m_Driver.findElement(By.xpath("//ul[@id='ctl00_cPH_rptRecord_ctl02_AccountUC1_AutoCompleteExtender1_completionListElem']/li[starts-with(text(), '"+Account3+" -"+"')]")));
		WebElement elemc= m_Driver.findElement(By.xpath("//ul[@id='ctl00_cPH_rptRecord_ctl02_AccountUC1_AutoCompleteExtender1_completionListElem']/li[starts-with(text(), '"+Account3+"')]"));
		elemc.click();
		
 		WebElement ele1=getWebElement(entry3xpath);
 		ledger1Entered_3=ele1.getAttribute("value");
 		expected_entry1.add(2, ele1.getAttribute("value"));
 	    //System.out.println(LedgerEntered_3);
 	   Reporter.log("Ledger 3 Entered :"+ledger1Entered_3, true);
		m_Driver.switchTo().defaultContent();

 		
  		 ExtentReportManager.passStep(m_Driver, "Enter_Account3 " + Account3);

  		 TestModellerLogger.PassStep(m_Driver, "Enter_Account3 " + Account3);
 	}
      
	/**
 	 * Enter Debit_3
     * @name Enter Debit_3
     */
 	public void Enter_Debit3(String Debit3)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_cPH_journalmodal1Iframe1']")));

 		WebElement elem = getWebElement(Debit3Elem);

		if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Debit3", "Enter_Debit3 failed. Unable to locate object: " + Debit3Elem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Debit3", "Enter_Debit3 failed. Unable to locate object: " + Debit3Elem.toString());

 			Assert.fail("Unable to locate object: " + Debit3Elem.toString());
         }

 		elem.sendKeys(Debit3);
 		WebElement ele1=getWebElement(debit3xpath);
 		//debit3=Double.parseDouble(ele1.getAttribute("value"));
 		//amt1.add(ele1.getAttribute("value"));
 		amt1.add(2, ele1.getAttribute("value"));
 		//Assert.assertEquals(String.valueOf(debit3), Debit3);
 	
		m_Driver.switchTo().defaultContent();

 		
  		 ExtentReportManager.passStep(m_Driver, "Enter_Debit3 " + Debit3);

  		 TestModellerLogger.PassStep(m_Driver, "Enter_Debit3 " + Debit3);
 	}

      
	/**
 	 * Enter Credit_3
     * @name Enter Credit_3
     */
 	public void Enter_Credit3(String Credit3)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_cPH_journalmodal1Iframe1']")));

 		WebElement elem = getWebElement(Credit3Elem);

		if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Credit3", "Enter_Credit3 failed. Unable to locate object: " + Credit3Elem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Credit3", "Enter_Credit3 failed. Unable to locate object: " + Credit3Elem.toString());

 			Assert.fail("Unable to locate object: " + Credit3Elem.toString());
         }

 		elem.sendKeys(Credit3);
 		WebElement ele1=getWebElement(credit3xpath);
 		//credit3=Double.parseDouble(ele1.getAttribute("value"));
 		amt1.add(2, ele1.getAttribute("value"));
 		//Assert.assertEquals(String.valueOf(credit11), Credit11);
 	
		m_Driver.switchTo().defaultContent();

 		
  		 ExtentReportManager.passStep(m_Driver, "Enter_Credit3 " + Credit3);

  		 TestModellerLogger.PassStep(m_Driver, "Enter_Credit3 " + Credit3);
 	}

      
	/**
 	 * Enter Account_4
	 * @throws Exception 
	 * @throws NoSuchFieldException 
     * @name Enter Account_4
     */
 	public void Enter_Account4(String Account4 ) throws Exception
 	{
 		//ledger14=Account4;
 		ledger1.add(3, Account4);
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_cPH_journalmodal1Iframe1']")));

 		WebElement elem = getWebElement(Account4Elem);

		if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Account4", "Enter_Account4 failed. Unable to locate object: " + Account4Elem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Account4", "Enter_Account4 failed. Unable to locate object: " + Account4Elem.toString());

 			Assert.fail("Unable to locate object: " + Account4Elem.toString());
         }

 		//elem.sendKeys(Account4);
		
		wt.explicitWait_elementToBeClickable(m_Driver, 20, elem);
		elem.click();
		
		wt.explicitiWait_presenceOfElementLocated(m_Driver, 20, By.xpath("//ul[@id='ctl00_cPH_rptRecord_ctl03_AccountUC1_AutoCompleteExtender1_completionListElem']/li[starts-with(text(), '"+Account4+" -"+"')]"));
		
		
		//wt.explicitWait_elementToBeClickable(m_Driver, 20, m_Driver.findElement(By.xpath("//ul[@id='ctl00_cPH_rptRecord_ctl03_AccountUC1_AutoCompleteExtender1_completionListElem']/li[starts-with(text(), '"+Account4+" -"+"')]")));
		WebElement elemc= m_Driver.findElement(By.xpath("//ul[@id='ctl00_cPH_rptRecord_ctl03_AccountUC1_AutoCompleteExtender1_completionListElem']/li[starts-with(text(), '"+Account4+" -"+"')]"));
		elemc.click();
		/*String[] yy = Account4.split("");
		for (String string : yy) {
			String variableName = "VK_" + string;

            Class<KeyEvent> clazz = KeyEvent.class;
            Field field = clazz.getField( variableName );
            int keyCode = field.getInt(null);

            robot.setAutoDelay(200);
            robot.keyPress( keyCode );
            robot.setAutoDelay(200);
            robot.keyRelease( keyCode );
            
		}
		
		robot.setAutoDelay(200);*/
		
		/*robot.keyPress(KeyEvent.VK_DOWN);
		robot.setAutoDelay(200);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(200);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.setAutoDelay(200);
		robot.keyRelease(KeyEvent.VK_ENTER);*/
		
		/*List<WebElement> All_List_elements = m_Driver.findElements(By.xpath("//ul[@id='ctl00_cPH_rptRecord_ctl03_AccountUC1_AutoCompleteExtender1_completionListElem']/li"));
		int size = All_List_elements.size();
		System.out.println(size);
		for (int i = 0; i <size; i++) {
			WebElement element = All_List_elements.get(i);
			String[] led = element.getText().split("-");
			//System.out.println(led[0].trim());
			//System.out.println(Account11);
			if (led[0].trim().equals(Account4)) {
				element.click();
				break;
			}
		}*/
		//System.out.println(led[0].trim());
		//System.out.println(Account3);
		
		//SeleniumLib sl= new SeleniumLib(m_Driver);
 		//sl.ArrowDownSelect(m_Driver, elem, Account4);
 		WebElement ele1=getWebElement(entry4xpath);
 		ledger1Entered_4=ele1.getAttribute("value");
 		expected_entry1.add(3, ele1.getAttribute("value"));
 	    //System.out.println(ledger1Entered_4);
 	    Reporter.log("ledger1 4 entered :"+ledger1Entered_4, true);
		m_Driver.switchTo().defaultContent();

 		
  		 ExtentReportManager.passStep(m_Driver, "Enter_Account4 " + Account4);

  		 TestModellerLogger.PassStep(m_Driver, "Enter_Account4 " + Account4);
 	}

 	public void Enter_Account4_way3(String Account4) throws NoSuchFieldException, Exception
 	{
 		//ledger4=Account4;
 		ledger1.add(3, Account4);
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_cPH_journalmodal1Iframe1']")));

 		WebElement elem = getWebElement(Account4Elem);

		if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Account4", "Enter_Account4 failed. Unable to locate object: " + Account4Elem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Account4", "Enter_Account4 failed. Unable to locate object: " + Account4Elem.toString());

 			Assert.fail("Unable to locate object: " + Account4Elem.toString());
         }

 		//elem.sendKeys(Account4);
		WaitStatementLib wt=new WaitStatementLib();
		wt.explicitWait_elementToBeClickable(m_Driver, 20, elem);
		elem.click();
		//Thread.sleep(1000);
		wt.explicitiWait_presenceOfElementLocated(m_Driver, 20, By.xpath("//ul[@id='ctl00_cPH_rptRecord_ctl03_AccountUC1_AutoCompleteExtender1_completionListElem']/li[starts-with(text(), '"+Account4+"')]"));
		
		
		//wt.explicitWait_elementToBeClickable(m_Driver, 20, m_Driver.findElement(By.xpath("//ul[@id='ctl00_cPH_rptRecord_ctl03_AccountUC1_AutoCompleteExtender1_completionListElem']/li[starts-with(text(), '"+Account4+" -"+"')]")));
		WebElement elemc= m_Driver.findElement(By.xpath("//ul[@id='ctl00_cPH_rptRecord_ctl03_AccountUC1_AutoCompleteExtender1_completionListElem']/li[starts-with(text(), '"+Account4+"')]"));
		elemc.click();
		
 		WebElement ele1=getWebElement(entry4xpath);
 		ledger1Entered_4=ele1.getAttribute("value");
 		expected_entry1.add(3, ele1.getAttribute("value"));
 	    //System.out.println(LedgerEntered_4);
 	    Reporter.log("ledger 4 entered :"+ledger1Entered_4, true);
		m_Driver.switchTo().defaultContent();
 		
  		 ExtentReportManager.passStep(m_Driver, "Enter_Account4 " + Account4);

  		 TestModellerLogger.PassStep(m_Driver, "Enter_Account4 " + Account4);
 	}      
	/**
 	 * Enter Debit_4
     * @name Enter Debit_4
     */
 	public void Enter_Debit4(String Debit4)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_cPH_journalmodal1Iframe1']")));

 		WebElement elem = getWebElement(Debit4Elem);

		if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Debit4", "Enter_Debit4 failed. Unable to locate object: " + Debit4Elem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Debit4", "Enter_Debit4 failed. Unable to locate object: " + Debit4Elem.toString());

 			Assert.fail("Unable to locate object: " + Debit4Elem.toString());
         }

 		elem.sendKeys(Debit4);
 		WebElement ele1=getWebElement(debit4xpath);
 		//debit4=Double.parseDouble(ele1.getAttribute("value"));
 		//amt1.add(ele1.getAttribute("value"));
 		amt1.add(3, ele1.getAttribute("value"));
 		//Assert.assertEquals(String.valueOf(debit4), Debit4);
 	
		m_Driver.switchTo().defaultContent();

 		
  		 ExtentReportManager.passStep(m_Driver, "Enter_Debit4 " + Debit4);

  		 TestModellerLogger.PassStep(m_Driver, "Enter_Debit4 " + Debit4);
 	}

      
	/**
 	 * Enter Credit_4
     * @name Enter Credit_4
     */
 	public void Enter_Credit4(String Credit4)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_cPH_journalmodal1Iframe1']")));

 		WebElement elem = getWebElement(Credit4Elem);

		if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Credit4", "Enter_Credit4 failed. Unable to locate object: " + Credit4Elem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Credit4", "Enter_Credit4 failed. Unable to locate object: " + Credit4Elem.toString());

 			Assert.fail("Unable to locate object: " + Credit4Elem.toString());
         }

 		elem.sendKeys(Credit4);
 		WebElement ele1=getWebElement(credit4xpath);
 		//credit4=Double.parseDouble(ele1.getAttribute("value"));
 		amt1.add(3, ele1.getAttribute("value"));
 		//Assert.assertEquals(String.valueOf(credit11), Credit11);
 	
		m_Driver.switchTo().defaultContent();

 		
  		 ExtentReportManager.passStep(m_Driver, "Enter_Credit4 " + Credit4);

  		 TestModellerLogger.PassStep(m_Driver, "Enter_Credit4 " + Credit4);
 	}

      
	/**
 	 * Enter Account_5
	 * @throws SecurityException 
	 * @throws NoSuchFieldException 
     * @name Enter Account_5
     */
 	public void Enter_Account5(String Account5) throws Exception
 	{
 		//ledger15=Account5;
 		ledger1.add(4, Account5);
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_cPH_journalmodal1Iframe1']")));

 		WebElement elem = getWebElement(Account5Elem);

		if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Account5", "Enter_Account5 failed. Unable to locate object: " + Account5Elem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Account5", "Enter_Account5 failed. Unable to locate object: " + Account5Elem.toString());

 			Assert.fail("Unable to locate object: " + Account5Elem.toString());
         }

 		//elem.sendKeys(Account5);
		
		wt.explicitWait_elementToBeClickable(m_Driver, 20, elem);
		elem.click();
		
		wt.explicitiWait_presenceOfElementLocated(m_Driver, 20, By.xpath("//ul[@id='ctl00_cPH_rptRecord_ctl04_AccountUC1_AutoCompleteExtender1_completionListElem']/li[starts-with(text(), '"+Account5+" -"+"')]"));
		
		//wt.explicitWait_elementToBeClickable(m_Driver, 20, m_Driver.findElement(By.xpath("//ul[@id='ctl00_cPH_rptRecord_ctl04_AccountUC1_AutoCompleteExtender1_completionListElem']/li[starts-with(text(), '"+Account5+" -"+"')]")));
		WebElement elemc= m_Driver.findElement(By.xpath("//ul[@id='ctl00_cPH_rptRecord_ctl04_AccountUC1_AutoCompleteExtender1_completionListElem']/li[starts-with(text(), '"+Account5+" -"+"')]"));
		elemc.click();
		/*String[] yy = Account5.split("");
		for (String string : yy) {
			String variableName = "VK_" + string;

            Class<KeyEvent> clazz = KeyEvent.class;
            Field field = clazz.getField( variableName );
            int keyCode = field.getInt(null);
            robot.setAutoDelay(200);
            robot.keyPress( keyCode );
            robot.setAutoDelay(200);
            robot.keyRelease( keyCode );
            
		}
		
		robot.setAutoDelay(200);*/
		
		/*robot.keyPress(KeyEvent.VK_DOWN);
		robot.setAutoDelay(200);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(200);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.setAutoDelay(200);
		robot.keyRelease(KeyEvent.VK_ENTER);*/
		
		/*List<WebElement> All_List_elements = m_Driver.findElements(By.xpath("//ul[@id='ctl00_cPH_rptRecord_ctl04_AccountUC1_AutoCompleteExtender1_completionListElem']/li"));
		int size = All_List_elements.size();
		System.out.println(size);
		for (int i = 0; i <size; i++) {
			WebElement element = All_List_elements.get(i);
			String[] led = element.getText().split("-");
			//System.out.println(led[0].trim());
			//System.out.println(Account11);
			if (led[0].trim().equals(Account5)) {
				element.click();
				break;
			}
		}*/
		//System.out.println(led[0].trim());
		//System.out.println(Account4);
		
		//SeleniumLib sl= new SeleniumLib(m_Driver);
 		//sl.ArrowDownSelect(m_Driver, elem, Account5);
 		WebElement ele1=getWebElement(entry5xpath);
 		ledger1Entered_5=ele1.getAttribute("value");
 		expected_entry1.add(4, ele1.getAttribute("value"));
 	    //System.out.println(ledger1Entered_5);
 	   Reporter.log("ledger1 5 entered :"+ledger1Entered_5, true);
		m_Driver.switchTo().defaultContent();

 		
  		 ExtentReportManager.passStep(m_Driver, "Enter_Account5 " + Account5);

  		 TestModellerLogger.PassStep(m_Driver, "Enter_Account5 " + Account5);
 	}
 	public void Enter_Account5_way3(String Account5) throws IllegalArgumentException, Exception
 	{
 		//ledger5=Account5;
 		ledger1.add(4, Account5);
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_cPH_journalmodal1Iframe1']")));

 		WebElement elem = getWebElement(Account5Elem);

		if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Account5", "Enter_Account5 failed. Unable to locate object: " + Account5Elem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Account5", "Enter_Account5 failed. Unable to locate object: " + Account5Elem.toString());

 			Assert.fail("Unable to locate object: " + Account5Elem.toString());
         }

 		//elem.sendKeys(Account5);
		WaitStatementLib wt=new WaitStatementLib();
		wt.explicitWait_elementToBeClickable(m_Driver, 20, elem);
		elem.click();
		//Thread.sleep(1000);
		wt.explicitiWait_presenceOfElementLocated(m_Driver, 20, By.xpath("//ul[@id='ctl00_cPH_rptRecord_ctl04_AccountUC1_AutoCompleteExtender1_completionListElem']/li[starts-with(text(), '"+Account5+"')]"));
		
		//wt.explicitWait_elementToBeClickable(m_Driver, 20, m_Driver.findElement(By.xpath("//ul[@id='ctl00_cPH_rptRecord_ctl04_AccountUC1_AutoCompleteExtender1_completionListElem']/li[starts-with(text(), '"+Account5+" -"+"')]")));
		WebElement elemc= m_Driver.findElement(By.xpath("//ul[@id='ctl00_cPH_rptRecord_ctl04_AccountUC1_AutoCompleteExtender1_completionListElem']/li[starts-with(text(), '"+Account5+"')]"));
		elemc.click();
		
 		WebElement ele1=getWebElement(entry5xpath);
 		ledger1Entered_5=ele1.getAttribute("value");
 		expected_entry1.add(4, ele1.getAttribute("value"));
 	    //System.out.println(LedgerEntered_5);
 	   Reporter.log("ledger 5 entered :"+ledger1Entered_5, true);
		m_Driver.switchTo().defaultContent();

 		
  		 ExtentReportManager.passStep(m_Driver, "Enter_Account5 " + Account5);

  		 TestModellerLogger.PassStep(m_Driver, "Enter_Account5 " + Account5);
 	}
      
	/**
 	 * Enter Debit_5
     * @name Enter Debit_5
     */
 	public void Enter_Debit5(String Debit5)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_cPH_journalmodal1Iframe1']")));

 		WebElement elem = getWebElement(Debit5Elem);

		if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Debit5", "Enter_Debit5 failed. Unable to locate object: " + Debit5Elem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Debit5", "Enter_Debit5 failed. Unable to locate object: " + Debit5Elem.toString());

 			Assert.fail("Unable to locate object: " + Debit5Elem.toString());
         }

 		elem.sendKeys(Debit5);
 		WebElement ele1=getWebElement(debit5xpath);
 		//debit5=Double.parseDouble(ele1.getAttribute("value"));;
 		//amt1.add(ele1.getAttribute("value"));
 		amt1.add(4, ele1.getAttribute("value"));
 		//Assert.assertEquals(String.valueOf(debit5), Debit5);
 	
		m_Driver.switchTo().defaultContent();

 		
  		 ExtentReportManager.passStep(m_Driver, "Enter_Debit5 " + Debit5);

  		 TestModellerLogger.PassStep(m_Driver, "Enter_Debit5 " + Debit5);
 	}

      
	/**
 	 * Enter Credit_5
     * @name Enter Credit_5
     */
 	public void Enter_Credit5(String Credit5)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_cPH_journalmodal1Iframe1']")));

 		WebElement elem = getWebElement(Credit5Elem);

		if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Credit5", "Enter_Credit5 failed. Unable to locate object: " + Credit5Elem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Credit5", "Enter_Credit5 failed. Unable to locate object: " + Credit5Elem.toString());

 			Assert.fail("Unable to locate object: " + Credit5Elem.toString());
         }

 		elem.sendKeys(Credit5);
 		WebElement ele1=getWebElement(credit5xpath);
 		//credit5=Double.parseDouble(ele1.getAttribute("value"));
 		amt1.add(4, ele1.getAttribute("value"));
 		//Assert.assertEquals(String.valueOf(credit11), Credit11);
 	
		m_Driver.switchTo().defaultContent();

 		
  		 ExtentReportManager.passStep(m_Driver, "Enter_Credit5 " + Credit5);

  		 TestModellerLogger.PassStep(m_Driver, "Enter_Credit5 " + Credit5);
 	}

     
	/**
 	 * Click Tick for more line items
     * @name Click Tick for more line items
     */
	public void Click_Tick_for_more_line_items()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_cPH_journalmodal1Iframe1']")));

		WebElement elem = getWebElement(Tick_for_more_line_itemsElem);

	if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Tick_for_more_line_items", "Click_Tick_for_more_line_items failed. Unable to locate object: " + Tick_for_more_line_itemsElem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Tick_for_more_line_items", "Click_Tick_for_more_line_items failed. Unable to locate object: " + Tick_for_more_line_itemsElem.toString());

			Assert.fail("Unable to locate object: " + Tick_for_more_line_itemsElem.toString());
        }

		elem.click();
		sl.ScrollHeight(m_Driver);
		m_Driver.switchTo().defaultContent();
  	

	ExtentReportManager.passStep(m_Driver, "Click_Tick_for_more_line_items");

	TestModellerLogger.PassStep(m_Driver, "Click_Tick_for_more_line_items");
	}

      
	/**
 	 * Enter Account_6
     * @name Enter Account_6
     */
 	public void Enter_Account6(String Account6) throws Exception
 	{
 		//ledger16=Account6;
 		ledger1.add(5, Account6);
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_cPH_journalmodal1Iframe1']")));

 		WebElement elem = getWebElement(Account6Elem);

		if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Account6", "Enter_Account6 failed. Unable to locate object: " + Account6Elem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Account6", "Enter_Account6 failed. Unable to locate object: " + Account6Elem.toString());

 			Assert.fail("Unable to locate object: " + Account6Elem.toString());
         }

 		//elem.sendKeys(Account6);
		
		wt.explicitWait_elementToBeClickable(m_Driver, 20, elem);
		elem.click();
		wt.explicitiWait_presenceOfElementLocated(m_Driver, 20, By.xpath("//ul[@id='ctl00_cPH_rptRecord_ctl05_AccountUC1_AutoCompleteExtender1_completionListElem']/li[starts-with(text(), '"+Account6+" -"+"')]"));
		
		
		//wt.explicitWait_elementToBeClickable(m_Driver, 20, m_Driver.findElement(By.xpath("//ul[@id='ctl00_cPH_rptRecord_ctl05_AccountUC1_AutoCompleteExtender1_completionListElem']/li[starts-with(text(), '"+Account6+" -"+"')]")));
		WebElement elemc= m_Driver.findElement(By.xpath("//ul[@id='ctl00_cPH_rptRecord_ctl05_AccountUC1_AutoCompleteExtender1_completionListElem']/li[starts-with(text(), '"+Account6+" -"+"')]"));
		elemc.click();
		/*String[] yy = Account6.split("");
		//Thread.sleep(1000);
		for (String string : yy) {
			String variableName = "VK_" + string;

            Class<KeyEvent> clazz = KeyEvent.class;
            Field field = clazz.getField( variableName );
            int keyCode = field.getInt(null);
            robot.setAutoDelay(200);
            robot.keyPress( keyCode );
            robot.setAutoDelay(200);
            robot.keyRelease( keyCode );
            
		}
		
		robot.setAutoDelay(200);*/
		
		/*robot.keyPress(KeyEvent.VK_DOWN);
		robot.setAutoDelay(200);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(200);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.setAutoDelay(200);
		robot.keyRelease(KeyEvent.VK_ENTER);*/
		
		/*List<WebElement> All_List_elements = m_Driver.findElements(By.xpath("//ul[@id='ctl00_cPH_rptRecord_ctl05_AccountUC1_AutoCompleteExtender1_completionListElem']/li"));
		int size = All_List_elements.size();
		System.out.println(size);
		for (int i = 0; i <size; i++) {
			WebElement element = All_List_elements.get(i);
			String[] led = element.getText().split("-");
			//System.out.println(led[0].trim());
			//System.out.println(Account11);
			if (led[0].trim().equals(Account6)) {
				element.click();
				break;
			}
		}*/
		//SeleniumLib sl= new SeleniumLib(m_Driver);
 		//sl.ArrowDownSelect(m_Driver, elem, Account6);
 		WebElement ele1=getWebElement(entry6xpath);
 		ledger1Entered_6=ele1.getAttribute("value");
 		expected_entry1.add(5, ele1.getAttribute("value"));
 	    //System.out.println(ledger1Entered_6);
 		Reporter.log("ledger1 6 entered :"+ledger1Entered_6, true);
		
		m_Driver.switchTo().defaultContent();

 		
  		 ExtentReportManager.passStep(m_Driver, "Enter_Account6 " + Account6);

  		 TestModellerLogger.PassStep(m_Driver, "Enter_Account6 " + Account6);
 	}

      
	/**
 	 * Enter Debit_6
     * @name Enter Debit_6
     */
 	public void Enter_Debit6(String Debit6)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_cPH_journalmodal1Iframe1']")));

 		WebElement elem = getWebElement(Debit6Elem);

		if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Debit6", "Enter_Debit6 failed. Unable to locate object: " + Debit6Elem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Debit6", "Enter_Debit6 failed. Unable to locate object: " + Debit6Elem.toString());

 			Assert.fail("Unable to locate object: " + Debit6Elem.toString());
         }

 		elem.sendKeys(Debit6);
 		WebElement ele1=getWebElement(debit6xpath);
 		//debit6=Double.parseDouble(ele1.getAttribute("value"));;
 		//amt1.add(ele1.getAttribute("value"));
 		amt1.add(5, ele1.getAttribute("value"));
 		//Assert.assertEquals(String.valueOf(debit6), Debit6);
 	
		m_Driver.switchTo().defaultContent();

 		
  		 ExtentReportManager.passStep(m_Driver, "Enter_Debit6 " + Debit6);

  		 TestModellerLogger.PassStep(m_Driver, "Enter_Debit6 " + Debit6);
 	}

      
	/**
 	 * Enter Credit_6
     * @name Enter Credit_6
     */
 	public void Enter_Credit6(String Credit6)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_cPH_journalmodal1Iframe1']")));

 		WebElement elem = getWebElement(Credit6Elem);

		if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Credit6", "Enter_Credit6 failed. Unable to locate object: " + Credit6Elem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Credit6", "Enter_Credit6 failed. Unable to locate object: " + Credit6Elem.toString());

 			Assert.fail("Unable to locate object: " + Credit6Elem.toString());
         }

 		elem.sendKeys(Credit6);
 		WebElement ele1=getWebElement(credit6xpath);
 		//credit6=Double.parseDouble(ele1.getAttribute("value"));
 		amt1.add(5, ele1.getAttribute("value"));
 		//Assert.assertEquals(String.valueOf(credit11), Credit11);
 	
		m_Driver.switchTo().defaultContent();

 		
  		 ExtentReportManager.passStep(m_Driver, "Enter_Credit6 " + Credit6);

  		 TestModellerLogger.PassStep(m_Driver, "Enter_Credit6 " + Credit6);
 	}

      
	/**
 	 * Enter Account_7
     * @name Enter Account_7
     */
 	public void Enter_Account7(String Account7) throws Exception
 	{
 		//ledger17=Account7;
 		ledger1.add(6, Account7);
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_cPH_journalmodal1Iframe1']")));

 		WebElement elem = getWebElement(Account7Elem);

		if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Account7", "Enter_Account7 failed. Unable to locate object: " + Account7Elem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Account7", "Enter_Account7 failed. Unable to locate object: " + Account7Elem.toString());

 			Assert.fail("Unable to locate object: " + Account7Elem.toString());
         }

 		//elem.sendKeys(Account7);
		
		wt.explicitWait_elementToBeClickable(m_Driver, 20, elem);
		elem.click();
		wt.explicitiWait_presenceOfElementLocated(m_Driver, 20, By.xpath("//ul[@id='ctl00_cPH_rptRecord_ctl06_AccountUC1_AutoCompleteExtender1_completionListElem']/li[starts-with(text(), '"+Account7+" -"+"')]"));
		
		//wt.explicitWait_elementToBeClickable(m_Driver, 20, m_Driver.findElement(By.xpath("//ul[@id='ctl00_cPH_rptRecord_ctl06_AccountUC1_AutoCompleteExtender1_completionListElem']/li[starts-with(text(), '"+Account7+" -"+"')]")));
		WebElement elemc= m_Driver.findElement(By.xpath("//ul[@id='ctl00_cPH_rptRecord_ctl06_AccountUC1_AutoCompleteExtender1_completionListElem']/li[starts-with(text(), '"+Account7+" -"+"')]"));
		elemc.click();
		/*String[] yy = Account7.split("");
		for (String string : yy) {
			String variableName = "VK_" + string;

            Class<KeyEvent> clazz = KeyEvent.class;
            Field field = clazz.getField( variableName );
            int keyCode = field.getInt(null);
            robot.setAutoDelay(200);
            robot.keyPress( keyCode );
            robot.setAutoDelay(200);
            robot.keyRelease( keyCode );
            
		}
		
		robot.setAutoDelay(200);*/
		
		/*robot.keyPress(KeyEvent.VK_DOWN);
		robot.setAutoDelay(200);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(200);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.setAutoDelay(200);
		robot.keyRelease(KeyEvent.VK_ENTER);*/
		
		/*List<WebElement> All_List_elements = m_Driver.findElements(By.xpath("//ul[@id='ctl00_cPH_rptRecord_ctl06_AccountUC1_AutoCompleteExtender1_completionListElem']/li"));
		int size = All_List_elements.size();
		System.out.println(size);
		for (int i = 0; i <size; i++) {
			WebElement element = All_List_elements.get(i);
			String[] led = element.getText().split("-");
			//System.out.println(led[0].trim());
			//System.out.println(Account11);
			if (led[0].trim().equals(Account7)) {
				element.click();
				break;
			}
		}*/
		//SeleniumLib sl= new SeleniumLib(m_Driver);
 		//sl.ArrowDownSelect(m_Driver, elem, Account7);
 		WebElement ele1=getWebElement(entry7xpath);
 		ledger1Entered_7=ele1.getAttribute("value");
 		expected_entry1.add(6, ele1.getAttribute("value"));
 	    //System.out.println(ledger1Entered_7);
 	   Reporter.log("ledger1 7 entered :"+ledger1Entered_7, true);
		m_Driver.switchTo().defaultContent();

 		
  		 ExtentReportManager.passStep(m_Driver, "Enter_Account7 " + Account7);

  		 TestModellerLogger.PassStep(m_Driver, "Enter_Account7 " + Account7);
 	}

      
	/**
 	 * Enter Debit_7
     * @name Enter Debit_7
     */
 	public void Enter_Debit7(String Debit7)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_cPH_journalmodal1Iframe1']")));

 		WebElement elem = getWebElement(Debit7Elem);

		if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Debit7", "Enter_Debit7 failed. Unable to locate object: " + Debit7Elem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Debit7", "Enter_Debit7 failed. Unable to locate object: " + Debit7Elem.toString());

 			Assert.fail("Unable to locate object: " + Debit7Elem.toString());
         }

 		elem.sendKeys(Debit7);
 		WebElement ele1=getWebElement(debit7xpath);
 		//debit7=Double.parseDouble(ele1.getAttribute("value"));;
 		amt1.add(ele1.getAttribute("value"));
 		//Assert.assertEquals(String.valueOf(debit7), Debit7);
 	
		m_Driver.switchTo().defaultContent();

 		
  		 ExtentReportManager.passStep(m_Driver, "Enter_Debit7 " + Debit7);

  		 TestModellerLogger.PassStep(m_Driver, "Enter_Debit7 " + Debit7);
 	}

      
	/**
 	 * Enter Credit_7
     * @name Enter Credit_7
     */
 	public void Enter_Credit7(String Credit7)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_cPH_journalmodal1Iframe1']")));

 		WebElement elem = getWebElement(Credit7Elem);

		if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Credit7", "Enter_Credit7 failed. Unable to locate object: " + Credit7Elem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Credit7", "Enter_Credit7 failed. Unable to locate object: " + Credit7Elem.toString());

 			Assert.fail("Unable to locate object: " + Credit7Elem.toString());
         }

 		elem.sendKeys(Credit7);
 		WebElement ele1=getWebElement(credit7xpath);
 		//credit7=Double.parseDouble(ele1.getAttribute("value"));
 		amt1.add(6, ele1.getAttribute("value"));
 		//Assert.assertEquals(String.valueOf(credit11), Credit11);
 	
		m_Driver.switchTo().defaultContent();

 		
  		 ExtentReportManager.passStep(m_Driver, "Enter_Credit7 " + Credit7);

  		 TestModellerLogger.PassStep(m_Driver, "Enter_Credit7 " + Credit7);
 	}

      
	/**
 	 * Enter Account_8
     * @name Enter Account_8
     */
 	public void Enter_Account8(String Account8) throws Exception
 	{
 		//ledger18=Account8;
 		ledger1.add(7, Account8);
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_cPH_journalmodal1Iframe1']")));

 		WebElement elem = getWebElement(Account8Elem);

		if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Account8", "Enter_Account8 failed. Unable to locate object: " + Account8Elem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Account8", "Enter_Account8 failed. Unable to locate object: " + Account8Elem.toString());

 			Assert.fail("Unable to locate object: " + Account8Elem.toString());
         }

 		//elem.sendKeys(Account8);
		
		wt.explicitWait_elementToBeClickable(m_Driver, 20, elem);
		elem.click();
		wt.explicitiWait_presenceOfElementLocated(m_Driver, 20, By.xpath("//ul[@id='ctl00_cPH_rptRecord_ctl07_AccountUC1_AutoCompleteExtender1_completionListElem']/li[starts-with(text(), '"+Account8+" -"+"')]"));
		
		//wt.explicitWait_elementToBeClickable(m_Driver, 20, m_Driver.findElement(By.xpath("//ul[@id='ctl00_cPH_rptRecord_ctl00_AccountUC1_AutoCompleteExtender1_completionListElem']/li[starts-with(text(), '"+Account8+" -"+"')]")));
		WebElement elemc= m_Driver.findElement(By.xpath("//ul[@id='ctl00_cPH_rptRecord_ctl07_AccountUC1_AutoCompleteExtender1_completionListElem']/li[starts-with(text(), '"+Account8+" -"+"')]"));
		elemc.click();
		/*String[] yy = Account8.split("");
		for (String string : yy) {
			String variableName = "VK_" + string;

            Class<KeyEvent> clazz = KeyEvent.class;
            Field field = clazz.getField( variableName );
            int keyCode = field.getInt(null);
            robot.setAutoDelay(200);
            robot.keyPress( keyCode );
            robot.setAutoDelay(200);
            robot.keyRelease( keyCode );
            
		}
		
		robot.setAutoDelay(200);*/
		
		/*robot.keyPress(KeyEvent.VK_DOWN);
		robot.setAutoDelay(200);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(200);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.setAutoDelay(200);
		robot.keyRelease(KeyEvent.VK_ENTER);*/
		
		/*List<WebElement> All_List_elements = m_Driver.findElements(By.xpath("//ul[@id='ctl00_cPH_rptRecord_ctl07_AccountUC1_AutoCompleteExtender1_completionListElem']/li"));
		int size = All_List_elements.size();
		System.out.println(size);
		for (int i = 0; i <size; i++) {
			WebElement element = All_List_elements.get(i);
			String[] led = element.getText().split("-");
			//System.out.println(led[0].trim());
			//System.out.println(Account11);
			if (led[0].trim().equals(Account8)) {
				element.click();
				break;
			}
		}*/
		//SeleniumLib sl= new SeleniumLib(m_Driver);
 		//sl.ArrowDownSelect(m_Driver, elem, Account8);
 		WebElement ele1=getWebElement(entry8xpath);
 		ledger1Entered_8=ele1.getAttribute("value");
 		expected_entry1.add(7, ele1.getAttribute("value"));
 	   //System.out.println(ledger1Entered_8);
 	   Reporter.log("ledger1 8 entered :"+ledger1Entered_8, true);
		m_Driver.switchTo().defaultContent();

 		
  		 ExtentReportManager.passStep(m_Driver, "Enter_Account8 " + Account8);

  		 TestModellerLogger.PassStep(m_Driver, "Enter_Account8 " + Account8);
 	}

      
	/**
 	 * Enter Debit_8
     * @name Enter Debit_8
     */
 	public void Enter_Debit8(String Debit8)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_cPH_journalmodal1Iframe1']")));

 		WebElement elem = getWebElement(Debit8Elem);

		if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Debit8", "Enter_Debit8 failed. Unable to locate object: " + Debit8Elem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Debit8", "Enter_Debit8 failed. Unable to locate object: " + Debit8Elem.toString());

 			Assert.fail("Unable to locate object: " + Debit8Elem.toString());
         }

 		elem.sendKeys(Debit8);
 		WebElement ele1=getWebElement(debit8xpath);
 		//debit8=Double.parseDouble(ele1.getAttribute("value"));;
 		amt1.add(ele1.getAttribute("value"));
 		//Assert.assertEquals(String.valueOf(debit8), Debit8);
 	
		m_Driver.switchTo().defaultContent();

 		
  		 ExtentReportManager.passStep(m_Driver, "Enter_Debit8 " + Debit8);

  		 TestModellerLogger.PassStep(m_Driver, "Enter_Debit8 " + Debit8);
 	}

      
	/**
 	 * Enter Credit_8
     * @name Enter Credit_8
     */
 	public void Enter_Credit8(String Credit8)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_cPH_journalmodal1Iframe1']")));

 		WebElement elem = getWebElement(Credit8Elem);

		if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Credit8", "Enter_Credit8 failed. Unable to locate object: " + Credit8Elem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Credit8", "Enter_Credit8 failed. Unable to locate object: " + Credit8Elem.toString());

 			Assert.fail("Unable to locate object: " + Credit8Elem.toString());
         }

 		elem.sendKeys(Credit8);
 		WebElement ele1=getWebElement(credit8xpath);
 		//credit8=Double.parseDouble(ele1.getAttribute("value"));
 		amt1.add(7, ele1.getAttribute("value"));
 		//Assert.assertEquals(String.valueOf(credit11), Credit11);
 	
		m_Driver.switchTo().defaultContent();

 		
  		 ExtentReportManager.passStep(m_Driver, "Enter_Credit8 " + Credit8);

  		 TestModellerLogger.PassStep(m_Driver, "Enter_Credit8 " + Credit8);
 	}

      
	/**
 	 * Enter Account_9
     * @name Enter Account_9
     */
 	public void Enter_Account9(String Account9) throws Exception
 	{
 		//ledger19=Account9;
 		ledger1.add(8, Account9);
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_cPH_journalmodal1Iframe1']")));

 		WebElement elem = getWebElement(Account9Elem);

		if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Account9", "Enter_Account9 failed. Unable to locate object: " + Account9Elem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Account9", "Enter_Account9 failed. Unable to locate object: " + Account9Elem.toString());

 			Assert.fail("Unable to locate object: " + Account9Elem.toString());
         }

 		//elem.sendKeys(Account9);
		
		wt.explicitWait_elementToBeClickable(m_Driver, 20, elem);
		elem.click();
		wt.explicitiWait_presenceOfElementLocated(m_Driver, 20, By.xpath("//ul[@id='ctl00_cPH_rptRecord_ctl08_AccountUC1_AutoCompleteExtender1_completionListElem']/li[starts-with(text(), '"+Account9+" -"+"')]"));
		
		
		//wt.explicitWait_elementToBeClickable(m_Driver, 20, m_Driver.findElement(By.xpath("//ul[@id='ctl00_cPH_rptRecord_ctl00_AccountUC1_AutoCompleteExtender1_completionListElem']/li[starts-with(text(), '"+Account9+" -"+"')]")));
		WebElement elemc= m_Driver.findElement(By.xpath("//ul[@id='ctl00_cPH_rptRecord_ctl08_AccountUC1_AutoCompleteExtender1_completionListElem']/li[starts-with(text(), '"+Account9+" -"+"')]"));
		elemc.click();
		/*String[] yy = Account9.split("");
		for (String string : yy) {
			String variableName = "VK_" + string;

            Class<KeyEvent> clazz = KeyEvent.class;
            Field field = clazz.getField( variableName );
            int keyCode = field.getInt(null);
            robot.setAutoDelay(200);
            robot.keyPress( keyCode );
            robot.setAutoDelay(200);
            robot.keyRelease( keyCode );
            
		}
		
		robot.setAutoDelay(200);*/
		
		/*robot.keyPress(KeyEvent.VK_DOWN);
		robot.setAutoDelay(200);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(200);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.setAutoDelay(200);
		robot.keyRelease(KeyEvent.VK_ENTER);*/
		
		/*List<WebElement> All_List_elements = m_Driver.findElements(By.xpath("//ul[@id='ctl00_cPH_rptRecord_ctl08_AccountUC1_AutoCompleteExtender1_completionListElem']/li"));
		int size = All_List_elements.size();
		System.out.println(size);
		for (int i = 0; i <size; i++) {
			WebElement element = All_List_elements.get(i);
			String[] led = element.getText().split("-");
			//System.out.println(led[0].trim());
			//System.out.println(Account11);
			if (led[0].trim().equals(Account9)) {
				element.click();
				break;
			}
		}*/
		//SeleniumLib sl= new SeleniumLib(m_Driver);
 		//sl.ArrowDownSelect(m_Driver, elem, Account9);
 		WebElement ele1=getWebElement(entry9xpath);
 		ledger1Entered_9=ele1.getAttribute("value");
 		expected_entry1.add(8, ele1.getAttribute("value"));
 	    //System.out.println(ledger1Entered_9);
 	   Reporter.log("ledger1 9 entered :"+ledger1Entered_9, true);
		m_Driver.switchTo().defaultContent();

 		
  		 ExtentReportManager.passStep(m_Driver, "Enter_Account9 " + Account9);

  		 TestModellerLogger.PassStep(m_Driver, "Enter_Account9 " + Account9);
 	}

      
	/**
 	 * Enter Debit_9
     * @name Enter Debit_9
     */
 	public void Enter_Debit9(String Debit9)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_cPH_journalmodal1Iframe1']")));

 		WebElement elem = getWebElement(Debit9Elem);

		if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Debit9", "Enter_Debit9 failed. Unable to locate object: " + Debit9Elem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Debit9", "Enter_Debit9 failed. Unable to locate object: " + Debit9Elem.toString());

 			Assert.fail("Unable to locate object: " + Debit9Elem.toString());
         }

 		elem.sendKeys(Debit9);
 		WebElement ele1=getWebElement(debit9xpath);
 		//debit9=Double.parseDouble(ele1.getAttribute("value"));;
 		//amt1.add(ele1.getAttribute("value"));
 		amt1.add(8, ele1.getAttribute("value"));
 		//Assert.assertEquals(String.valueOf(debit9), Debit9);
 	
		m_Driver.switchTo().defaultContent();

 		
  		 ExtentReportManager.passStep(m_Driver, "Enter_Debit9 " + Debit9);

  		 TestModellerLogger.PassStep(m_Driver, "Enter_Debit9 " + Debit9);
 	}

      
	/**
 	 * Enter Credit_9
     * @name Enter Credit_9
     */
 	public void Enter_Credit9(String Credit9)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_cPH_journalmodal1Iframe1']")));

 		WebElement elem = getWebElement(Credit9Elem);

		if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Credit9", "Enter_Credit9 failed. Unable to locate object: " + Credit9Elem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Credit9", "Enter_Credit9 failed. Unable to locate object: " + Credit9Elem.toString());

 			Assert.fail("Unable to locate object: " + Credit9Elem.toString());
         }

 		elem.sendKeys(Credit9);
 		WebElement ele1=getWebElement(credit9xpath);
 		//credit9=Double.parseDouble(ele1.getAttribute("value"));
 		amt1.add(8, ele1.getAttribute("value"));
 		//Assert.assertEquals(String.valueOf(credit11), Credit11);
 	
		m_Driver.switchTo().defaultContent();

 		
  		 ExtentReportManager.passStep(m_Driver, "Enter_Credit9 " + Credit9);

  		 TestModellerLogger.PassStep(m_Driver, "Enter_Credit9 " + Credit9);
 	}

      
	/**
 	 * Enter Account_10
     * @name Enter Account_10
     */
 	public void Enter_Account10(String Account10) throws Exception
 	{
 		//ledger110=Account10;
 		ledger1.add(9, Account10);
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_cPH_journalmodal1Iframe1']")));

 		WebElement elem = getWebElement(Account10Elem);

		if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Account10", "Enter_Account10 failed. Unable to locate object: " + Account10Elem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Account10", "Enter_Account10 failed. Unable to locate object: " + Account10Elem.toString());

 			Assert.fail("Unable to locate object: " + Account10Elem.toString());
         }

 		//elem.sendKeys(Account10);
		
		wt.explicitWait_elementToBeClickable(m_Driver, 20, elem);
		elem.click();
		
		wt.explicitiWait_presenceOfElementLocated(m_Driver, 20, By.xpath("//ul[@id='ctl00_cPH_rptRecord_ctl09_AccountUC1_AutoCompleteExtender1_completionListElem']/li[starts-with(text(), '"+Account10+" -"+"')]"));
		
		
		//wt.explicitWait_elementToBeClickable(m_Driver, 20, m_Driver.findElement(By.xpath("//ul[@id='ctl00_cPH_rptRecord_ctl00_AccountUC1_AutoCompleteExtender1_completionListElem']/li[starts-with(text(), '"+Account9+" -"+"')]")));
		WebElement elemc= m_Driver.findElement(By.xpath("//ul[@id='ctl00_cPH_rptRecord_ctl09_AccountUC1_AutoCompleteExtender1_completionListElem']/li[starts-with(text(), '"+Account10+" -"+"')]"));
		elemc.click();
		/*String[] yy = Account10.split("");
		for (String string : yy) {
			String variableName = "VK_" + string;

            Class<KeyEvent> clazz = KeyEvent.class;
            Field field = clazz.getField( variableName );
            int keyCode = field.getInt(null);
            robot.setAutoDelay(200);
            robot.keyPress( keyCode );
            robot.setAutoDelay(200);
            robot.keyRelease( keyCode );
            
		}
		
		robot.setAutoDelay(200);*/
		
		/*robot.keyPress(KeyEvent.VK_DOWN);
		robot.setAutoDelay(200);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(200);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.setAutoDelay(200);
		robot.keyRelease(KeyEvent.VK_ENTER);*/
		
		/*List<WebElement> All_List_elements = m_Driver.findElements(By.xpath("//ul[@id='ctl00_cPH_rptRecord_ctl09_AccountUC1_AutoCompleteExtender1_completionListElem']/li"));
		int size = All_List_elements.size();
		System.out.println(size);
		for (int i = 0; i <size; i++) {
			WebElement element = All_List_elements.get(i);
			String[] led = element.getText().split("-");
			//System.out.println(led[0].trim());
			//System.out.println(Account11);
			if (led[0].trim().equals(Account10)) {
				element.click();
				break;
			}
		}*/
		//SeleniumLib sl= new SeleniumLib(m_Driver);
 		//sl.ArrowDownSelect(m_Driver, elem, Account10);
 		WebElement ele1=getWebElement(entry10xpath);
 		ledger1Entered_10=ele1.getAttribute("value");
 		expected_entry1.add(9, ele1.getAttribute("value"));
 	    //System.out.println(ledger1Entered_10);
 	   Reporter.log("ledger1 10 entered :"+ledger1Entered_10, true);
		m_Driver.switchTo().defaultContent();

 		
  		 ExtentReportManager.passStep(m_Driver, "Enter_Account10 " + Account10);

  		 TestModellerLogger.PassStep(m_Driver, "Enter_Account10 " + Account10);
 	}

      
	/**
 	 * Enter Debit_10
     * @name Enter Debit_10
     */
 	public void Enter_Debit10(String Debit10)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_cPH_journalmodal1Iframe1']")));

 		WebElement elem = getWebElement(Debit10Elem);

		if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Debit10", "Enter_Debit10 failed. Unable to locate object: " + Debit10Elem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Debit10", "Enter_Debit10 failed. Unable to locate object: " + Debit10Elem.toString());

 			Assert.fail("Unable to locate object: " + Debit10Elem.toString());
         }

 		elem.sendKeys(Debit10);
 		WebElement ele1=getWebElement(debit10xpath);
 		//debit10=Double.parseDouble(ele1.getAttribute("value"));;
 		amt1.add(ele1.getAttribute("value"));
 		//Assert.assertEquals(String.valueOf(debit10), Debit10);
 	
		m_Driver.switchTo().defaultContent();

 		
  		 ExtentReportManager.passStep(m_Driver, "Enter_Debit10 " + Debit10);

  		 TestModellerLogger.PassStep(m_Driver, "Enter_Debit10 " + Debit10);
 	}

      
	/**
 	 * Enter Credit_10
     * @name Enter Credit_10
     */
 	public void Enter_Credit10(String Credit10)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_cPH_journalmodal1Iframe1']")));

 		WebElement elem = getWebElement(Credit10Elem);

		if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Credit10", "Enter_Credit10 failed. Unable to locate object: " + Credit10Elem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Credit10", "Enter_Credit10 failed. Unable to locate object: " + Credit10Elem.toString());

 			Assert.fail("Unable to locate object: " + Credit10Elem.toString());
         }

 		elem.sendKeys(Credit10);
 		WebElement ele1=getWebElement(credit10xpath);
 		//credit10=Double.parseDouble(ele1.getAttribute("value"));
 		amt1.add(9, ele1.getAttribute("value"));
 		//Assert.assertEquals(String.valueOf(credit11), Credit11);
 	
		m_Driver.switchTo().defaultContent();

 		
  		 ExtentReportManager.passStep(m_Driver, "Enter_Credit10 " + Credit10);

  		 TestModellerLogger.PassStep(m_Driver, "Enter_Credit10 " + Credit10);
 	}

      
	/**
 	 * Enter Account_11
     * @name Enter Account_11
     */
 	public void Enter_Account11(String Account11) throws Exception
 	{
 		//ledger111=Account11;
 		ledger1.add(10, Account11);
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_cPH_journalmodal1Iframe1']")));

 		WebElement elem = getWebElement(Account11Elem);

		if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Account11", "Enter_Account11 failed. Unable to locate object: " + Account11Elem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Account11", "Enter_Account11 failed. Unable to locate object: " + Account11Elem.toString());

 			Assert.fail("Unable to locate object: " + Account11Elem.toString());
         }

 		//elem.sendKeys(Account11);
		wt.explicitWait_elementToBeClickable(m_Driver, 20, elem);
		elem.click();
		
		wt.explicitiWait_presenceOfElementLocated(m_Driver, 20, By.xpath("//ul[@id='ctl00_cPH_rptRecord_ctl10_AccountUC1_AutoCompleteExtender1_completionListElem']/li[starts-with(text(), '"+Account11+" -"+"')]"));
		
		
		//wt.explicitWait_elementToBeClickable(m_Driver, 20, m_Driver.findElement(By.xpath("//ul[@id='ctl00_cPH_rptRecord_ctl00_AccountUC1_AutoCompleteExtender1_completionListElem']/li[starts-with(text(), '"+Account9+" -"+"')]")));
		WebElement elemc= m_Driver.findElement(By.xpath("//ul[@id='ctl00_cPH_rptRecord_ctl10_AccountUC1_AutoCompleteExtender1_completionListElem']/li[starts-with(text(), '"+Account11+" -"+"')]"));
		elemc.click();
		/*elem.click();
		String[] yy = Account11.split("");
		for (String string : yy) {
			String variableName = "VK_" + string;

            Class<KeyEvent> clazz = KeyEvent.class;
            Field field = clazz.getField( variableName );
            int keyCode = field.getInt(null);
            robot.setAutoDelay(200);
            robot.keyPress( keyCode );
            robot.setAutoDelay(200);
            robot.keyRelease( keyCode );
            
		}
		
		robot.setAutoDelay(200);*/
		
		/*robot.keyPress(KeyEvent.VK_DOWN);
		robot.setAutoDelay(200);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(200);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.setAutoDelay(200);
		robot.keyRelease(KeyEvent.VK_ENTER);*/
		/*List<WebElement> All_List_elements = m_Driver.findElements(By.xpath("//ul[@id='ctl00_cPH_rptRecord_ctl10_AccountUC1_AutoCompleteExtender1_completionListElem']/li"));
		int size = All_List_elements.size();
		System.out.println(size);
		for (int i = 0; i <size; i++) {
			WebElement element = All_List_elements.get(i);
			String[] led = element.getText().split("-");
			//System.out.println(led[0].trim());
			//System.out.println(Account11);
			if (led[0].trim().equals(Account11)) {
				element.click();
				break;
			}
		}*/
		//SeleniumLib sl= new SeleniumLib(m_Driver);
 		//sl.ArrowDownSelect(m_Driver, elem, Account11);
 		WebElement ele1=getWebElement(entry11xpath);
 		ledger1Entered_11=ele1.getAttribute("value");
 		expected_entry1.add(10, ele1.getAttribute("value"));
 	    //System.out.println(ledger1Entered_11);
 	    Reporter.log("ledger1 11 entered :"+ledger1Entered_11, true);
		m_Driver.switchTo().defaultContent();

 		
  		 ExtentReportManager.passStep(m_Driver, "Enter_Account11 " + Account11);

  		 TestModellerLogger.PassStep(m_Driver, "Enter_Account11 " + Account11);
 	}

      
	/**
 	 * Enter Debit_11
     * @name Enter Debit_11
     */
 	public void Enter_Debit11(String Debit11)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_cPH_journalmodal1Iframe1']")));

 		WebElement elem = getWebElement(Debit11Elem);

		if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Debit11", "Enter_Debit11 failed. Unable to locate object: " + Debit11Elem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Debit11", "Enter_Debit11 failed. Unable to locate object: " + Debit11Elem.toString());

 			Assert.fail("Unable to locate object: " + Debit11Elem.toString());
         }

 		elem.sendKeys(Debit11);
 		WebElement ele1=getWebElement(debit10xpath);
 		//=Double.parseDouble(ele1.getAttribute("value"));
 		amt1.add(ele1.getAttribute("value"));
 		//Assert.assertEquals(String.valueOf(credit11), Credit11);
 	
		m_Driver.switchTo().defaultContent();

 		
  		 ExtentReportManager.passStep(m_Driver, "Enter_Debit11 " + Debit11);

  		 TestModellerLogger.PassStep(m_Driver, "Enter_Debit11 " + Debit11);
 	}

      
	/**
 	 * Enter Credit_11
     * @name Enter Credit_11
     */
 	public void Enter_Credit11(String Credit11)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_cPH_journalmodal1Iframe1']")));

 		WebElement elem = getWebElement(Credit11Elem);

		if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Credit11", "Enter_Credit11 failed. Unable to locate object: " + Credit11Elem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Credit11", "Enter_Credit11 failed. Unable to locate object: " + Credit11Elem.toString());

 			Assert.fail("Unable to locate object: " + Credit11Elem.toString());
         }

 		elem.sendKeys(Credit11);
 		WebElement ele1=getWebElement(credit11xpath);
 		//credit11=Double.parseDouble(ele1.getAttribute("value"));
 		amt1.add(ele1.getAttribute("value"));
 		//Assert.assertEquals(String.valueOf(credit11), Credit11);
 	
		m_Driver.switchTo().defaultContent();

 		
  		 ExtentReportManager.passStep(m_Driver, "Enter_Credit11 " + Credit11);

  		 TestModellerLogger.PassStep(m_Driver, "Enter_Credit11 " + Credit11);
 	}

     
	/**
 	 * Click  Save 
     * @name Click  Save 
     */
	public void Click__Save_()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_cPH_journalmodal1Iframe1']")));

		WebElement elem = getWebElement(_Save_Elem);

	if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Save_", "Click__Save_ failed. Unable to locate object: " + _Save_Elem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Save_", "Click__Save_ failed. Unable to locate object: " + _Save_Elem.toString());

			Assert.fail("Unable to locate object: " + _Save_Elem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	    Reporter.log("Journal entries is saved : ", true);

	ExtentReportManager.passStep(m_Driver, "Click__Save_");

	TestModellerLogger.PassStep(m_Driver, "Click__Save_");
	}

     
	/**
 	 * Click ClickReports
     * @name Click ClickReports
     */
	public void Click_ClickReports()
	{
        
		WebElement elem = getWebElement(ClickReportsElem);

	if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClickReports", "Click_ClickReports failed. Unable to locate object: " + ClickReportsElem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClickReports", "Click_ClickReports failed. Unable to locate object: " + ClickReportsElem.toString());

			Assert.fail("Unable to locate object: " + ClickReportsElem.toString());
        }

		elem.click();
          	

	ExtentReportManager.passStep(m_Driver, "Click_ClickReports");

	TestModellerLogger.PassStep(m_Driver, "Click_ClickReports");
	}

     
	/**
 	 * Click Click Trial Balance
     * @name Click Click Trial Balance
     */
	public void Click_Click_Trial_Balance()
	{
        
		WebElement elem = getWebElement(Click_Trial_BalanceElem);

	if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Click_Trial_Balance", "Click_Click_Trial_Balance failed. Unable to locate object: " + Click_Trial_BalanceElem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Click_Trial_Balance", "Click_Click_Trial_Balance failed. Unable to locate object: " + Click_Trial_BalanceElem.toString());

			Assert.fail("Unable to locate object: " + Click_Trial_BalanceElem.toString());
        }

		elem.click();
          	
    Reporter.log("Trial Balance Report page open :", true);
	ExtentReportManager.passStep(m_Driver, "Click_Click_Trial_Balance");

	TestModellerLogger.PassStep(m_Driver, "Click_Click_Trial_Balance");
	}

    
	/**
 	 * Select Select Financial Year
     * @name Select Select Financial Year
     */
    public void Select_Select_Financial_Year(String Select_Financial_Year)
 	{
 	    
 		WebElement elem = getWebElement(Select_Financial_YearElem);

 		if (elem == null) {
    	ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Select_Financial_Year", "Select_Select_Financial_Year failed. Unable to locate object: " + Select_Financial_YearElem.toString());

    	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Select_Financial_Year", "Select_Select_Financial_Year failed. Unable to locate object: " + Select_Financial_YearElem.toString());

 			Assert.fail("Unable to locate object: " + Select_Financial_YearElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Select_Financial_Year);
 		
 		Reporter.log("Financial Year Selected :"+Select_Financial_Year, true);
	ExtentReportManager.passStep(m_Driver, "Select_Select_Financial_Year " + Select_Financial_Year);

	TestModellerLogger.PassStep(m_Driver, "Select_Select_Financial_Year " + Select_Financial_Year);
 	}
    
    public void journalentry_way2(String Account, int no) throws Exception, SecurityException {
		//List<WebElement> elements = m_Driver.findElements(By.xpath("//div/div/div/div/div/div/table/tbody[2]/tr/td[1]"));
		//int size = elements.size();
    	Thread.sleep(2000);
    	
		for (int i = 0; i < no; i++) {
			int j=i+1;
			m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_cPH_journalmodal1Iframe1']")));

			By Accountele = By.xpath("//input[@id='ctl00_cPH_rptRecord_ctl0"+i+"_AccountUC1_txtAccount']");
			//robot = new Robot();
	 	    //ledger11=Account; 
	 	    ledger1.add(0, Account);
	 	   //m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_cPH_journalmodal1Iframe1']")));

	 		WebElement elem = getWebElement(Accountele);

			if (elem == null) {
		ExtentReportManager.failStepWithScreenshot(m_Driver, "journalentry_way2", "journalentry_way2 failed. Unable to locate object: " + Accountele.toString());

		TestModellerLogger.FailStepWithScreenshot(m_Driver, "journalentry_way2", "journalentry_way2 failed. Unable to locate object: " + Accountele.toString());

	 			Assert.fail("Unable to locate object: " + Accountele.toString());
	         }
			//WebElement row = m_Driver.findElement(By.xpath("//input[@id='ctl00_cPH_rptRecord_ctl0"+i+"_AccountUC1_txtAccount']"));
			String[] yy = Account.split("");
			for (String string : yy) {
				String variableName = "VK_" + string;

	            Class<KeyEvent> clazz = KeyEvent.class;
	            Field field = clazz.getField( variableName );
	            int keyCode = field.getInt(null);

	            elem.click();
	            robot.keyPress( keyCode );
	            robot.setAutoDelay(200);
	            robot.keyRelease( keyCode );
	            robot.setAutoDelay(200);
			}
			
			robot.setAutoDelay(300);
			List<WebElement> list = m_Driver.findElements(By.xpath("//input[@id='hiddenInputToUpdateATBuffer_CommonToolkitScripts']/preceding::script/following-sibling::ul["+j+"]/li"));
			list.get(i).click();
			
			//private By entry1xpath=By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_AccountUC1_txtAccount']");
			//WebElement ele1=getWebElement(entry1xpath);
	 		//ledger1Entered=;
			By Accountele1 = By.xpath("//input[@id='ctl00_cPH_rptRecord_ctl0"+i+"_AccountUC1_txtAccount' and @disabled='disabled']");
			WebElement elem1 = getWebElement(Accountele1);
	 		expected_entry1.add(i, elem1.getAttribute("value"));
	 	    //System.out.println(expected_entry1.get(i));
	 	    Reporter.log("ledger1 code entered : "+expected_entry1.get(i),true);
			m_Driver.switchTo().defaultContent();

	 		
	  		 //ExtentReportManager.passStep(m_Driver, "Enter_Account1 " + Account1);

	  		 //TestModellerLogger.PassStep(m_Driver, "Enter_Account1 " + Account1);
			
		}
		
	}
    
    public void verifyTrialBalance_7500_7527(){
    	List<WebElement> elements = m_Driver.findElements(By.xpath("//table[@id='table1']/tbody[2]/tr/td[2][contains(text(),'')]/following-sibling::td[1]/a/parent::td/preceding-sibling::td[1]"));
        int size = elements.size();
        for (int i = 0; i <size-1; i++) {
        	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]"));
        	String led = ele1.getText();
        	WebElement ele2=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[1]/a"));
        	String led_text = ele2.getText();
        	String actualledger1=led+"   "+led_text;
        	System.out.println(actualledger1);
        	String expectedledger1 = expected_entry1.get(i);
        	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
        	Reporter.log("ledger1 code verified: "+actualledger1);
        	
        	WebElement amount=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[5]/span/a"));
        	String xx = amount.getText();
        	String yy = amt1.get(i)+".00";
        	System.out.println(xx);
        	System.out.println(yy);
        	String[] z = amount.getText().split("", 3);
        	if (z[0].equals("(")) {
        		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(2,10), yy);
    		} else {
    			Assert.assertEquals(amount.getText().substring(1).replaceAll(",", ""), yy);
    		}
        	Reporter.log("Amount enter verified: "+amount.getText());
        	sl.ScrollToElement(m_Driver, ele1);
    	}
        	/*debit_total=(debit1+debit2+debit3+debit4+debit5+debit6+debit7+debit8+debit9+debit10);
            WebElement td = getWebElement(totaldebit_xpath);
            Assert.assertEquals(td.getText().substring(1).replaceAll(",", ""), String.format("%.2f",debit_total));
            Reporter.log("Total debit verified: "+td.getText().substring(1).replaceAll(",", ""));
            
            credit_total=credit11;
            WebElement tc = getWebElement(totalcredit_xpath);
            Assert.assertEquals(tc.getText().substring(1).replaceAll(",", ""), String.format("%.2f",credit_total));
            Reporter.log("Total credit verified: "+tc.getText().substring(1).replaceAll(",", ""));	*/
    }
    

    
    
    
    
    
    
    
    public void verify_TrialBalance_7001_7020() {
    	List<WebElement> elements = m_Driver.findElements(By.xpath("//table[@id='table1']/tbody[2]/tr/td[2][contains(text(),'')]/following-sibling::td[1]/a/parent::td/preceding-sibling::td[1]"));
    int size = elements.size();
    for (int i = 0; i <size-1; i++) {
    	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]"));
    	//(//table[@id='table1']/tbody[2]/tr/td[2][contains(text(),'')]/following-sibling::td[1]/a/parent::td/preceding-sibling::td[1])[]
    	//div/div/div/table/tbody/tr/td[contains(text(),'2095')]/following-sibling::td[1]/a
    	//WebElement ele1=m_Driver.findElement(By.xpath("(//table[@id='table1']/tbody[2]/tr/td[2][contains(text(),'')]/following-sibling::td[1]/a/parent::td/preceding-sibling::td[1])["+i+"]"));
    	String led = ele1.getText();
    	WebElement ele2=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[1]/a"));
    	String led_text = ele2.getText();
    	String actualledger1=led+"   "+led_text;
    	System.out.println(actualledger1);
    	String expectedledger1 = expected_entry1.get(i);
    	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
    	Reporter.log("ledger1 code verified: "+actualledger1);
    	
    	WebElement ele3=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[5]/span/a"));
    	String xx = ele3.getText();
    	String yy = amt1.get(i)+".00";
    	System.out.println(xx);
    	System.out.println(yy);
    	String[] z = ele3.getText().split("", 3);
    	if (z[0].equals("(")) {
    		Assert.assertEquals(ele3.getText().replaceAll(",", "").substring(2,10), yy);
		} else {
			Assert.assertEquals(ele3.getText().substring(1).replaceAll(",", ""), yy);
		}
    	Reporter.log("Amount enter verified: "+ele3.getText());
    	sl.ScrollToElement(m_Driver, ele1);
	}
    Reporter.log("Enteries are Verified on TrialBalance Report page :", true);
} 	
    	
    	
     
    
    public void verify_TrialBalance_7021_7203() {
    	List<WebElement> elements = m_Driver.findElements(By.xpath("//table[@id='table1']/tbody[2]/tr/td[2][contains(text(),'')]/following-sibling::td[1]/a/parent::td/preceding-sibling::td[1]"));
    int size = elements.size();
    for (int i = 0; i <size-1; i++) {
    	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]"));
    	String led = ele1.getText();
    	WebElement ele2=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[1]/a"));
    	String led_text = ele2.getText();
    	String actualledger1=led+"   "+led_text;
    	System.out.println(actualledger1);
    	String expectedledger1 = expected_entry1.get(i);
    	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
    	Reporter.log("ledger1 code verified: "+actualledger1);
    	
    	WebElement amount=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[5]/span/a"));
    	String xx = amount.getText();
    	String yy = amt1.get(i)+".00";
    	System.out.println(xx);
    	System.out.println(yy);
    	String[] z = amount.getText().split("", 3);
    	if (z[0].equals("(")) {
    		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(2,10), yy);
		} else {
			Assert.assertEquals(amount.getText().substring(1).replaceAll(",", ""), yy);
		}
    	Reporter.log("Amount enter verified: "+amount.getText());
    	sl.ScrollToElement(m_Driver, ele1);
	}
    Reporter.log("Enteries are Verified on TrialBalance Report page :", true);
}
    public void verify_TrialBalance_7204_7254() {
    	List<WebElement> elements = m_Driver.findElements(By.xpath("//table[@id='table1']/tbody[2]/tr/td[2][contains(text(),'')]/following-sibling::td[1]/a/parent::td/preceding-sibling::td[1]"));
    int size = elements.size();
    for (int i = 0; i <size-1; i++) {
    	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]"));
    	String led = ele1.getText();
    	WebElement ele2=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[1]/a"));
    	String led_text = ele2.getText();
    	String actualledger1=led+"   "+led_text;
    	System.out.println(actualledger1);
    	String expectedledger1 = expected_entry1.get(i);
    	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
    	Reporter.log("ledger1 code verified: "+actualledger1);
    	
    	WebElement amount=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[5]/span/a"));
    	String xx = amount.getText();
    	String yy = amt1.get(i)+".00";
    	System.out.println(xx);
    	System.out.println(yy);
    	String[] z = amount.getText().split("", 3);
    	if (z[0].equals("(")) {
    		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(2,10), yy);
		} else {
			Assert.assertEquals(amount.getText().substring(1).replaceAll(",", ""), yy);
		}
    	Reporter.log("Amount enter verified: "+amount.getText());
    	sl.ScrollToElement(m_Driver, ele1);
	}
    Reporter.log("Enteries are Verified on TrialBalance Report page :", true);
}
    public void verify_TrialBalance_7255_7268() {
    	List<WebElement> elements = m_Driver.findElements(By.xpath("//table[@id='table1']/tbody[2]/tr/td[2][contains(text(),'')]/following-sibling::td[1]/a/parent::td/preceding-sibling::td[1]"));
    int size = elements.size();
    for (int i = 0; i <size-1; i++) {
    	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]"));
    	String led = ele1.getText();
    	WebElement ele2=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[1]/a"));
    	String led_text = ele2.getText();
    	String actualledger1=led+"   "+led_text;
    	System.out.println(actualledger1);
    	String expectedledger1 = expected_entry1.get(i);
    	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
    	Reporter.log("ledger1 code verified: "+actualledger1);
    	
    	WebElement amount=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[5]/span/a"));
    	String xx = amount.getText();
    	String yy = amt1.get(i)+".00";
    	System.out.println(xx);
    	System.out.println(yy);
    	String[] z = amount.getText().split("", 3);
    	if (z[0].equals("(")) {
    		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(2,10), yy);
		} else {
			Assert.assertEquals(amount.getText().substring(1).replaceAll(",", ""), yy);
		}
    	Reporter.log("Amount enter verified: "+amount.getText());
    	sl.ScrollToElement(m_Driver, ele1);
	}
    	/*debit_total=(debit1+debit2+debit3+debit4+debit5+debit6+debit7+debit8+debit9+debit10);
        WebElement td = getWebElement(totaldebit_xpath);
        Assert.assertEquals(td.getText().substring(1).replaceAll(",", ""), String.format("%.2f",debit_total));
        Reporter.log("Total debit verified: "+td.getText().substring(1).replaceAll(",", ""));
        
        credit_total=credit11;
        WebElement tc = getWebElement(totalcredit_xpath);
        Assert.assertEquals(tc.getText().substring(1).replaceAll(",", ""), String.format("%.2f",credit_total));
        Reporter.log("Total credit verified: "+tc.getText().substring(1).replaceAll(",", ""));	*/
}
    public void verify_TrialBalance_7270_7402() {
    	List<WebElement> elements = m_Driver.findElements(By.xpath("//table[@id='table1']/tbody[2]/tr/td[2][contains(text(),'')]/following-sibling::td[1]/a/parent::td/preceding-sibling::td[1]"));
    int size = elements.size();
    for (int i = 0; i <size-1; i++) {
    	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]"));
    	String led = ele1.getText();
    	WebElement ele2=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[1]/a"));
    	String led_text = ele2.getText();
    	String actualledger1=led+"   "+led_text;
    	System.out.println(actualledger1);
    	String expectedledger1 = expected_entry1.get(i);
    	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
    	Reporter.log("ledger1 code verified: "+actualledger1);
    	
    	WebElement amount=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[5]/span/a"));
    	String xx = amount.getText();
    	String yy = amt1.get(i)+".00";
    	System.out.println(xx);
    	System.out.println(yy);
    	String[] z = amount.getText().split("", 3);
    	if (z[0].equals("(")) {
    		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(2,10), yy);
		} else {
			Assert.assertEquals(amount.getText().substring(1).replaceAll(",", ""), yy);
		}
    	Reporter.log("Amount enter verified: "+amount.getText());
    	sl.ScrollToElement(m_Driver, ele1);
	}
    	/*debit_total=(debit1+debit2+debit3+debit4+debit5+debit6+debit7+debit8+debit9+debit10);
        WebElement td = getWebElement(totaldebit_xpath);
        Assert.assertEquals(td.getText().substring(1).replaceAll(",", ""), String.format("%.2f",debit_total));
        Reporter.log("Total debit verified: "+td.getText().substring(1).replaceAll(",", ""));
        
        credit_total=credit11;
        WebElement tc = getWebElement(totalcredit_xpath);
        Assert.assertEquals(tc.getText().substring(1).replaceAll(",", ""), String.format("%.2f",credit_total));
        Reporter.log("Total credit verified: "+tc.getText().substring(1).replaceAll(",", ""));	*/
}
    
    public void verify_TrialBalance_7603_7903() {
    	List<WebElement> elements = m_Driver.findElements(By.xpath("//table[@id='table1']/tbody[2]/tr/td[2][contains(text(),'')]/following-sibling::td[1]/a/parent::td/preceding-sibling::td[1]"));
    int size = elements.size();
    for (int i = 0; i <size-1; i++) {
    	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]"));
    	String led = ele1.getText();
    	WebElement ele2=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[1]/a"));
    	String led_text = ele2.getText();
    	String actualledger1=led+"   "+led_text;
    	System.out.println(actualledger1);
    	String expectedledger1 = expected_entry1.get(i);
    	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
    	Reporter.log("ledger1 code verified: "+actualledger1);
    	
    	WebElement amount=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[5]/span/a"));
    	String xx = amount.getText();
    	String yy = amt1.get(i)+".00";
    	System.out.println(xx);
    	System.out.println(yy);
    	String[] z = amount.getText().split("", 3);
    	if (z[0].equals("(")) {
    		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(2,10), yy);
		} else {
			Assert.assertEquals(amount.getText().substring(1).replaceAll(",", ""), yy);
		}
    	Reporter.log("Amount enter verified: "+amount.getText());
    	sl.ScrollToElement(m_Driver, ele1);
	}
    	/*debit_total=(debit1+debit2+debit3+debit4+debit5+debit6+debit7+debit8+debit9+debit10);
        WebElement td = getWebElement(totaldebit_xpath);
        Assert.assertEquals(td.getText().substring(1).replaceAll(",", ""), String.format("%.2f",debit_total));
        Reporter.log("Total debit verified: "+td.getText().substring(1).replaceAll(",", ""));
        
        credit_total=credit11;
        WebElement tc = getWebElement(totalcredit_xpath);
        Assert.assertEquals(tc.getText().substring(1).replaceAll(",", ""), String.format("%.2f",credit_total));
        Reporter.log("Total credit verified: "+tc.getText().substring(1).replaceAll(",", ""));	*/
}
    public void verifyTrialBalance_7906_7926(){
    	List<WebElement> elements = m_Driver.findElements(By.xpath("//table[@id='table1']/tbody[2]/tr/td[2][contains(text(),'')]/following-sibling::td[1]/a/parent::td/preceding-sibling::td[1]"));
        int size = elements.size();
        for (int i = 0; i <size-1; i++) {
        	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]"));
        	String led = ele1.getText();
        	WebElement ele2=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[1]/a"));
        	String led_text = ele2.getText();
        	String actualledger1=led+"   "+led_text;
        	System.out.println(actualledger1);
        	String expectedledger1 = expected_entry1.get(i);
        	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
        	Reporter.log("ledger1 code verified: "+actualledger1);
        	
        	WebElement amount=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[5]/span/a"));
        	String xx = amount.getText();
        	String yy = amt1.get(i)+".00";
        	System.out.println(xx);
        	System.out.println(yy);
        	String[] z = amount.getText().split("", 3);
        	if (z[0].equals("(")) {
        		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(2,9), yy);
    		} else {
    			Assert.assertEquals(amount.getText().substring(1).replaceAll(",", ""), yy);
    		}
        	Reporter.log("Amount enter verified: "+amount.getText());
        	sl.ScrollToElement(m_Driver, ele1);
    	}
        	/*debit_total=(debit1+debit2+debit3+debit4+debit5+debit6+debit7+debit8+debit9+debit10);
            WebElement td = getWebElement(totaldebit_xpath);
            Assert.assertEquals(td.getText().substring(1).replaceAll(",", ""), String.format("%.2f",debit_total));
            Reporter.log("Total debit verified: "+td.getText().substring(1).replaceAll(",", ""));
            
            credit_total=credit11;
            WebElement tc = getWebElement(totalcredit_xpath);
            Assert.assertEquals(tc.getText().substring(1).replaceAll(",", ""), String.format("%.2f",credit_total));
            Reporter.log("Total credit verified: "+tc.getText().substring(1).replaceAll(",", ""));	*/
    }
    public void verify_TrialBalance4100_4112()
    {
    	List<WebElement> elements = m_Driver.findElements(By.xpath("//table[@id='table1']/tbody[2]/tr/td[2][contains(text(),'')]/following-sibling::td[1]/a/parent::td/preceding-sibling::td[1]"));
        int size = elements.size();
        for (int i = 0; i <size-1; i++) {
        	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]"));
        	String led = ele1.getText();
        	WebElement ele2=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[1]/a"));
        	String led_text = ele2.getText();
        	String actualledger1=led+"   "+led_text;
        	System.out.println(actualledger1);
        	String expectedledger1 = expected_entry1.get(i);
        	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
        	Reporter.log("ledger1 code verified: "+actualledger1);
        	
        	WebElement amount=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[5]/span/a"));
        	String xx = amount.getText();
        	String yy = amt1.get(i)+".00";
        	System.out.println(xx);
        	System.out.println(yy);
        	String[] z = amount.getText().split("", 3);
        	if (z[0].equals("(")) {
        		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(2,9), yy);
    		} else {
    			Assert.assertEquals(amount.getText().substring(1).replaceAll(",", ""), yy);
    		}
        	Reporter.log("Amount enter verified: "+amount.getText());
        	sl.ScrollToElement(m_Driver, ele1);
    	}
        	/*debit_total=(debit1+debit2+debit3+debit4+debit5+debit6+debit7+debit8+debit9+debit10);
            WebElement td = getWebElement(totaldebit_xpath);
            Assert.assertEquals(td.getText().substring(1).replaceAll(",", ""), String.format("%.2f",debit_total));
            Reporter.log("Total debit verified: "+td.getText().substring(1).replaceAll(",", ""));
            
            credit_total=credit11;
            WebElement tc = getWebElement(totalcredit_xpath);
            Assert.assertEquals(tc.getText().substring(1).replaceAll(",", ""), String.format("%.2f",credit_total));
            Reporter.log("Total credit verified: "+tc.getText().substring(1).replaceAll(",", ""));	*/
    }
    public void verify_TrialBalance_NonTradingItem()
    {
    	List<WebElement> elements = m_Driver.findElements(By.xpath("//table[@id='table1']/tbody[2]/tr/td[2][contains(text(),'')]/following-sibling::td[1]/a/parent::td/preceding-sibling::td[1]"));
        int size = elements.size();
        for (int i = 0; i <size-1; i++) {
        	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]"));
        	String led = ele1.getText();
        	WebElement ele2=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[1]/a"));
        	String led_text = ele2.getText();
        	String actualledger1=led+"   "+led_text;
        	System.out.println(actualledger1);
        	String expectedledger1 = expected_entry1.get(i);
        	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
        	Reporter.log("ledger1 code verified: "+actualledger1);
        	
        	WebElement amount=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[5]/span/a"));
        	String xx = amount.getText();
        	String yy = amt1.get(i)+".00";
        	System.out.println(xx);
        	System.out.println(yy);
        	String[] z = amount.getText().split("", 3);
        	if (z[0].equals("(")) {
        		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(2,10), yy);
    		} else {
    			Assert.assertEquals(amount.getText().substring(1).replaceAll(",", ""), yy);
    		}
        	Reporter.log("Amount enter verified: "+amount.getText());
        	sl.ScrollToElement(m_Driver, ele1);
    	}
        	/*debit_total=(debit1+debit2+debit3+debit4+debit5+debit6+debit7+debit8+debit9+debit10);
            WebElement td = getWebElement(totaldebit_xpath);
            Assert.assertEquals(td.getText().substring(1).replaceAll(",", ""), String.format("%.2f",debit_total));
            Reporter.log("Total debit verified: "+td.getText().substring(1).replaceAll(",", ""));
            
            credit_total=credit11;
            WebElement tc = getWebElement(totalcredit_xpath);
            Assert.assertEquals(tc.getText().substring(1).replaceAll(",", ""), String.format("%.2f",credit_total));
            Reporter.log("Total credit verified: "+tc.getText().substring(1).replaceAll(",", ""));	*/
    }
    public void verify_TrialBalance_ShareCapital3000_3001() {
    	List<WebElement> elements = m_Driver.findElements(By.xpath("//table[@id='table1']/tbody[2]/tr/td[2][contains(text(),'')]/following-sibling::td[1]/a/parent::td/preceding-sibling::td[1]"));
        int size = elements.size();
        for (int i = 0; i <size-1; i++) {
        	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]"));
        	String led = ele1.getText();
        	WebElement ele2=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[1]/a"));
        	String led_text = ele2.getText();
        	String actualledger1=led+"   "+led_text;
        	System.out.println(actualledger1);
        	String expectedledger1 = expected_entry1.get(i);
        	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
        	Reporter.log("ledger1 code verified: "+actualledger1);
        	
        	WebElement amount=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[5]/span/a"));
        	String xx = amount.getText();
        	String yy = amt1.get(i)+".00";
        	System.out.println(xx);
        	System.out.println(yy);
        	String[] z = amount.getText().split("", 3);
        	if (z[0].equals("(")) {
        		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(2,9), yy);
    		} else {
    			Assert.assertEquals(amount.getText().substring(1).replaceAll(",", ""), yy);
    		}
        	Reporter.log("Amount enter verified: "+amount.getText());
        	sl.ScrollToElement(m_Driver, ele1);
    	
    	} 
    	/*debit_total=(debit2);
        WebElement td = getWebElement(totaldebit_xpath);
        Assert.assertEquals(td.getText().substring(1).replaceAll(",", ""), String.format("%.2f",debit_total));
        Reporter.log("Total debit verified: "+td.getText().substring(1).replaceAll(",", ""));
        
        credit_total=credit1;
        WebElement tc = getWebElement(totalcredit_xpath);
        Assert.assertEquals(tc.getText().substring(1).replaceAll(",", ""), String.format("%.2f",credit_total));
        Reporter.log("Total credit verified: "+tc.getText().substring(1).replaceAll(",", ""));	*/
   }
    public void verify_TrialBalance_CostOfSale5000_5200()
    {
    	List<WebElement> elements = m_Driver.findElements(By.xpath("//table[@id='table1']/tbody[2]/tr/td[2][contains(text(),'')]/following-sibling::td[1]/a/parent::td/preceding-sibling::td[1]"));
        int size = elements.size();
        for (int i = 0; i <size-1; i++) {
        	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]"));
        	String led = ele1.getText();
        	WebElement ele2=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[1]/a"));
        	String led_text = ele2.getText();
        	String actualledger1=led+"   "+led_text;
        	System.out.println(actualledger1);
        	String expectedledger1 = expected_entry1.get(i);
        	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
        	Reporter.log("ledger1 code verified: "+actualledger1);
        	
        	WebElement amount=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[5]/span/a"));
        	String xx = amount.getText();
        	String yy = amt1.get(i)+".00";
        	System.out.println(xx);
        	System.out.println(yy);
        	String[] z = amount.getText().split("", 3);
        	if (z[0].equals("(")) {
        		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(2,9), yy);
    		} else {
    			Assert.assertEquals(amount.getText().substring(1).replaceAll(",", ""), yy);
    		}
        	Reporter.log("Amount enter verified: "+amount.getText());
        	sl.ScrollToElement(m_Driver, ele1);
	}
        Reporter.log("Enteries are Verified on TrialBalance Report page :", true);
}
    public void verify_TrialBalance_CostOfSale_6000_6090() {
    	List<WebElement> elements = m_Driver.findElements(By.xpath("//table[@id='table1']/tbody[2]/tr/td[2][contains(text(),'')]/following-sibling::td[1]/a/parent::td/preceding-sibling::td[1]"));
        int size = elements.size();
        for (int i = 0; i <size-1; i++) {
        	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]"));
        	String led = ele1.getText();
        	WebElement ele2=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[1]/a"));
        	String led_text = ele2.getText();
        	String actualledger1=led+"   "+led_text;
        	System.out.println(actualledger1);
        	String expectedledger1 = expected_entry1.get(i);
        	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
        	Reporter.log("ledger1 code verified: "+actualledger1);
        	
        	WebElement amount=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[5]/span/a"));
        	String xx = amount.getText();
        	String yy = amt1.get(i)+".00";
        	System.out.println(xx);
        	System.out.println(yy);
        	String[] z = amount.getText().split("", 3);
        	if (z[0].equals("(")) {
        		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(2,9), yy);
    		} else {
    			Assert.assertEquals(amount.getText().substring(1).replaceAll(",", ""), yy);
    		}
        	Reporter.log("Amount enter verified: "+amount.getText());
        	sl.ScrollToElement(m_Driver, ele1);
    	} 
        Reporter.log("Enteries are Verified on TrialBalance Report page :", true);
   }
    public void verify_TrialBalance_CreditorDueWithinYear_2000_2070() {
    	List<WebElement> elements = m_Driver.findElements(By.xpath("//table[@id='table1']/tbody[2]/tr/td[2][contains(text(),'')]/following-sibling::td[1]/a/parent::td/preceding-sibling::td[1]"));
        int size = elements.size();
        for (int i = 0; i <size-1; i++) {
        	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]"));
        	String led = ele1.getText();
        	WebElement ele2=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[1]/a"));
        	String led_text = ele2.getText();
        	String actualledger1=led+"   "+led_text;
        	System.out.println(actualledger1);
        	String expectedledger1 = expected_entry1.get(i);
        	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
        	Reporter.log("ledger1 code verified: "+actualledger1);
        	
        	WebElement amount=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[5]/span/a"));
        	String xx = amount.getText();
        	String yy = amt1.get(i)+".00";
        	System.out.println(xx);
        	System.out.println(yy);
        	String[] z = amount.getText().split("", 3);
        	if (z[0].equals("(")) {
        		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(2,9), yy);
    		} else {
    			Assert.assertEquals(amount.getText().substring(1).replaceAll(",", ""), yy);
    		}
        	Reporter.log("Amount enter verified: "+amount.getText());
        	sl.ScrollToElement(m_Driver, ele1);
    	} 
        Reporter.log("Enteries are Verified on TrialBalance Report page :", true);
   }
    public void verify_TrialBalance_CreditorDueWithinYear_2080_2095() {
    	List<WebElement> elements = m_Driver.findElements(By.xpath("//table[@id='table1']/tbody[2]/tr/td[2][contains(text(),'')]/following-sibling::td[1]/a/parent::td/preceding-sibling::td[1]"));
        int size = elements.size();
        for (int i = 0; i <size-1; i++) {
        	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]"));
        	String led = ele1.getText();
        	WebElement ele2=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[1]/a"));
        	String led_text = ele2.getText();
        	String actualledger1=led+"   "+led_text;
        	System.out.println(actualledger1);
        	String expectedledger1 = expected_entry1.get(i);
        	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
        	Reporter.log("ledger1 code verified: "+actualledger1);
        	
        	WebElement amount=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[5]/span/a"));
        	String xx = amount.getText();
        	String yy = amt1.get(i)+".00";
        	System.out.println(xx);
        	System.out.println(yy);
        	String[] z = amount.getText().split("", 3);
        	if (z[0].equals("(")) {
        		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(2,9), yy);
    		} else {
    			Assert.assertEquals(amount.getText().substring(1).replaceAll(",", ""), yy);
    		}
        	Reporter.log("Amount enter verified: "+amount.getText());
        	sl.ScrollToElement(m_Driver, ele1);
    	}
        Reporter.log("Enteries are Verified on TrialBalance Report page :", true);
   }  
    public void verify_TrialBalance_CreditorDueAfterYear_2300_2330() {
    	List<WebElement> elements = m_Driver.findElements(By.xpath("//table[@id='table1']/tbody[2]/tr/td[2][contains(text(),'')]/following-sibling::td[1]/a/parent::td/preceding-sibling::td[1]"));
        int size = elements.size();
        for (int i = 0; i <size-1; i++) {
        	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]"));
        	String led = ele1.getText();
        	WebElement ele2=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[1]/a"));
        	String led_text = ele2.getText();
        	String actualledger1=led+"   "+led_text;
        	System.out.println(actualledger1);
        	String expectedledger1 = expected_entry1.get(i);
        	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
        	Reporter.log("ledger1 code verified: "+actualledger1);
        	
        	WebElement amount=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[5]/span/a"));
        	String xx = amount.getText();
        	String yy = amt1.get(i)+".00";
        	System.out.println(xx);
        	System.out.println(yy);
        	String[] z = amount.getText().split("", 3);
        	if (z[0].equals("(")) {
        		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(2,9), yy);
    		} else {
    			Assert.assertEquals(amount.getText().substring(1).replaceAll(",", ""), yy);
    		}
        	Reporter.log("Amount enter verified: "+amount.getText());
        	sl.ScrollToElement(m_Driver, ele1);
    	}
        Reporter.log("Enteries are Verified on TrialBalance Report page :", true);
   }
    public void verify_TrialBalance_CreditorDueAfterYear_2331_2339() {
    	List<WebElement> elements = m_Driver.findElements(By.xpath("//table[@id='table1']/tbody[2]/tr/td[2][contains(text(),'')]/following-sibling::td[1]/a/parent::td/preceding-sibling::td[1]"));
        int size = elements.size();
        for (int i = 0; i <size-1; i++) {
        	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]"));
        	String led = ele1.getText();
        	WebElement ele2=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[1]/a"));
        	String led_text = ele2.getText();
        	String actualledger1=led+"   "+led_text;
        	System.out.println(actualledger1);
        	String expectedledger1 = expected_entry1.get(i);
        	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
        	Reporter.log("ledger1 code verified: "+actualledger1);
        	
        	WebElement amount=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[5]/span/a"));
        	String xx = amount.getText();
        	String yy = amt1.get(i)+".00";
        	System.out.println(xx);
        	System.out.println(yy);
        	String[] z = amount.getText().split("", 3);
        	if (z[0].equals("(")) {
        		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(2,10), yy);
    		} else {
    			Assert.assertEquals(amount.getText().substring(1).replaceAll(",", ""), yy);
    		}
        	Reporter.log("Amount enter verified: "+amount.getText());
        	sl.ScrollToElement(m_Driver, ele1);
    	}
        Reporter.log("Enteries are Verified on TrialBalance Report page :", true);
   }
    public void verify_TrialBalance_1000_1450() {
    	List<WebElement> elements = m_Driver.findElements(By.xpath("//table[@id='table1']/tbody[2]/tr/td[2][contains(text(),'')]/following-sibling::td[1]/a/parent::td/preceding-sibling::td[1]"));
        int size = elements.size();
        for (int i = 0; i <size-1; i++) {
        	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]"));
        	String led = ele1.getText();
        	WebElement ele2=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[1]/a"));
        	String led_text = ele2.getText();
        	String actualledger1=led+"   "+led_text;
        	System.out.println(actualledger1);
        	String expectedledger1 = expected_entry1.get(i);
        	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
        	Reporter.log("ledger1 code verified: "+actualledger1);
        	
        	WebElement amount=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[5]/span/a"));
        	String xx = amount.getText();
        	String yy = amt1.get(i)+".00";
        	System.out.println(xx);
        	System.out.println(yy);
        	String[] z = amount.getText().split("", 3);
        	if (z[0].equals("(")) {
        		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(2,9), yy);
    		} else {
    			Assert.assertEquals(amount.getText().substring(1).replaceAll(",", ""), yy);
    		}
        	Reporter.log("Amount enter verified: "+amount.getText());
        	sl.ScrollToElement(m_Driver, ele1);
    	}
        Reporter.log("Enteries are Verified on TrialBalance Report page :", true);
   }
    public void verify_TrialBalance_Debtor_1000_1310() {
    	List<WebElement> elements = m_Driver.findElements(By.xpath("//table[@id='table1']/tbody[2]/tr/td[2][contains(text(),'')]/following-sibling::td[1]/a/parent::td/preceding-sibling::td[1]"));
        int size = elements.size();
        for (int i = 0; i <size-1; i++) {
        	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]"));
        	String led = ele1.getText();
        	WebElement ele2=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[1]/a"));
        	String led_text = ele2.getText();
        	String actualledger1=led+"   "+led_text;
        	System.out.println(actualledger1);
        	String expectedledger1 = expected_entry1.get(i);
        	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
        	Reporter.log("ledger1 code verified: "+actualledger1);
        	try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	WebElement amount=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[5]//a"));
        	String xx = amount.getText();
        	String yy = amt1.get(i)+".00";
        	System.out.println(xx);
        	System.out.println(yy);
        	String[] z = amount.getText().split("", 3);
        	if (z[0].equals("(")) {
        		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(2,9), yy);
    		} else {
    			Assert.assertEquals(amount.getText().substring(1).replaceAll(",", ""), yy);
    		}
        	Reporter.log("Amount enter verified: "+amount.getText());
        	sl.ScrollToElement(m_Driver, ele1);
    	}
        Reporter.log("Enteries are Verified on TrialBalance Report page :", true);
   }
    public void verify_TrialBalance_Debtot_1320_1420() {
    	List<WebElement> elements = m_Driver.findElements(By.xpath("//table[@id='table1']/tbody[2]/tr/td[2][contains(text(),'')]/following-sibling::td[1]/a/parent::td/preceding-sibling::td[1]"));
        int size = elements.size();
        for (int i = 0; i <size-1; i++) {
        	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]"));
        	String led = ele1.getText();
        	WebElement ele2=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[1]/a"));
        	String led_text = ele2.getText();
        	String actualledger1=led+"   "+led_text;
        	System.out.println(actualledger1);
        	String expectedledger1 = expected_entry1.get(i);
        	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
        	Reporter.log("ledger1 code verified: "+actualledger1);
        	
        	WebElement amount=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[5]/span/a"));
        	String xx = amount.getText();
        	String yy = amt1.get(i)+".00";
        	System.out.println(xx);
        	System.out.println(yy);
        	String[] z = amount.getText().split("", 3);
        	if (z[0].equals("(")) {
        		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(2,9), yy);
    		} else {
    			Assert.assertEquals(amount.getText().substring(1).replaceAll(",", ""), yy);
    		}
        	Reporter.log("Amount enter verified: "+amount.getText());
        	sl.ScrollToElement(m_Driver, ele1);
    	}
        Reporter.log("Enteries are Verified on TrialBalance Report page :", true);
   }
    public void verify_TrialBalance_FixedAsset_11_20() {
    	List<WebElement> elements = m_Driver.findElements(By.xpath("//table[@id='table1']/tbody[2]/tr/td[2][contains(text(),'')]/following-sibling::td[1]/a/parent::td/preceding-sibling::td[1]"));
        int size = elements.size();
        for (int i = 0; i <size-1; i++) {
        	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]"));
        	String led = ele1.getText();
        	WebElement ele2=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[1]/a"));
        	String led_text = ele2.getText();
        	String actualledger1=led+"   "+led_text;
        	System.out.println(actualledger1);
        	String expectedledger1 = expected_entry1.get(i);
        	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
        	Reporter.log("ledger1 code verified: "+actualledger1);
        	
        	WebElement amount=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[5]/span/a"));
        	String xx = amount.getText();
        	String yy = amt1.get(i)+".00";
        	System.out.println(xx);
        	System.out.println(yy);
        	String[] z = amount.getText().split("", 3);
        	
        	if (z[0].equals("(")) {
        		String ammmm=amount.getText().replaceAll(",", "").substring(2,9);
        		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(2,9), yy);
    		} else {
    			Assert.assertEquals(amount.getText().substring(1).replaceAll(",", ""), yy);
    		}
        	Reporter.log("Amount enter verified: "+amount.getText());
        	sl.ScrollToElement(m_Driver, ele1);
    	}
        Reporter.log("Enteries are Verified on TrialBalance Report page :", true);
   }
    public void verify_TrialBalance_FixedAsset_20_29() {
    	List<WebElement> elements = m_Driver.findElements(By.xpath("//table[@id='table1']/tbody[2]/tr/td[2][contains(text(),'')]/following-sibling::td[1]/a/parent::td/preceding-sibling::td[1]"));
        int size = elements.size();
        for (int i = 0; i <size-1; i++) {
        	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]"));
        	String led = ele1.getText();
        	WebElement ele2=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[1]/a"));
        	String led_text = ele2.getText();
        	String actualledger1=led+"   "+led_text;
        	System.out.println(actualledger1);
        	String expectedledger1 = expected_entry1.get(i);
        	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
        	Reporter.log("ledger1 code verified: "+actualledger1);
        	
        	WebElement amount=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[5]/span/a"));
        	String xx = amount.getText();
        	String yy = amt1.get(i)+".00";
        	System.out.println(xx);
        	System.out.println(yy);
        	String[] z = amount.getText().split("", 3);
        	if (z[0].equals("(")) {
        		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(2,10), yy);
    		} else {
    			Assert.assertEquals(amount.getText().substring(1).replaceAll(",", ""), yy);
    		}
        	Reporter.log("Amount enter verified: "+amount.getText());
        	sl.ScrollToElement(m_Driver, ele1);
    	}
        Reporter.log("Enteries are Verified on TrialBalance Report page :", true);
   }
    public void verify_TrialBalance_FixedAsset_30_39() {
    	List<WebElement> elements = m_Driver.findElements(By.xpath("//table[@id='table1']/tbody[2]/tr/td[2][contains(text(),'')]/following-sibling::td[1]/a/parent::td/preceding-sibling::td[1]"));
        int size = elements.size();
        for (int i = 0; i <size-1; i++) {
        	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]"));
        	String led = ele1.getText();
        	WebElement ele2=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[1]/a"));
        	String led_text = ele2.getText();
        	String actualledger1=led+"   "+led_text;
        	System.out.println(actualledger1);
        	String expectedledger1 = expected_entry1.get(i);
        	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
        	Reporter.log("ledger1 code verified: "+actualledger1);
        	
        	WebElement amount=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[5]/span/a"));
        	String xx = amount.getText();
        	String yy = amt1.get(i)+".00";
        	System.out.println(xx);
        	System.out.println(yy);
        	String[] z = amount.getText().split("", 3);
        	if (z[0].equals("(")) {
        		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(2,10), yy);
    		} else {
    			Assert.assertEquals(amount.getText().substring(1).replaceAll(",", ""), yy);
    		}
        	Reporter.log("Amount enter verified: "+amount.getText());
        	sl.ScrollToElement(m_Driver, ele1);
    	}
        Reporter.log("Enteries are Verified on TrialBalance Report page :", true);
   }
    public void verify_TrialBalance_FixedAsset_40_49() {
    	List<WebElement> elements = m_Driver.findElements(By.xpath("//table[@id='table1']/tbody[2]/tr/td[2][contains(text(),'')]/following-sibling::td[1]/a/parent::td/preceding-sibling::td[1]"));
        int size = elements.size();
        for (int i = 0; i <size-1; i++) {
        	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]"));
        	String led = ele1.getText();
        	WebElement ele2=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[1]/a"));
        	String led_text = ele2.getText();
        	String actualledger1=led+"   "+led_text;
        	System.out.println(actualledger1);
        	String expectedledger1 = expected_entry1.get(i);
        	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
        	Reporter.log("ledger1 code verified: "+actualledger1);
        	
        	WebElement amount=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[5]/span/a"));
        	String xx = amount.getText();
        	String yy = amt1.get(i)+".00";
        	System.out.println(xx);
        	System.out.println(yy);
        	String[] z = amount.getText().split("", 3);
        	if (z[0].equals("(")) {
        		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(2,10), yy);
    		} else {
    			Assert.assertEquals(amount.getText().substring(1).replaceAll(",", ""), yy);
    		}
        	Reporter.log("Amount enter verified: "+amount.getText());
        	sl.ScrollToElement(m_Driver, ele1);
    	}
        Reporter.log("Enteries are Verified on TrialBalance Report page :", true);
        	/*debit_total=(debit1+debit2+debit3+debit4+debit5+debit6+debit7+debit8+debit9+debit10);
            WebElement td = getWebElement(totaldebit_xpath);
            Assert.assertEquals(td.getText().substring(1).replaceAll(",", ""), String.format("%.2f",debit_total));
            Reporter.log("Total debit verified: "+td.getText().substring(1).replaceAll(",", ""));
            
            credit_total=credit11;
            WebElement tc = getWebElement(totalcredit_xpath);
            Assert.assertEquals(tc.getText().substring(1).replaceAll(",", ""), String.format("%.2f",credit_total));
            Reporter.log("Total credit verified: "+tc.getText().substring(1).replaceAll(",", ""));	*/	
   }
    public void verify_TrialBalance_FixedAsset_200_209() {
    	List<WebElement> elements = m_Driver.findElements(By.xpath("//table[@id='table1']/tbody[2]/tr/td[2][contains(text(),'')]/following-sibling::td[1]/a/parent::td/preceding-sibling::td[1]"));
        int size = elements.size();
        for (int i = 0; i <size-1; i++) {
        	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]"));
        	String led = ele1.getText();
        	WebElement ele2=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[1]/a"));
        	String led_text = ele2.getText();
        	String actualledger1=led+"   "+led_text;
        	System.out.println(actualledger1);
        	String expectedledger1 = expected_entry1.get(i);
        	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
        	Reporter.log("ledger1 code verified: "+actualledger1);
        	
        	WebElement amount=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[5]/span/a"));
        	String xx = amount.getText();
        	String yy = amt1.get(i)+".00";
        	System.out.println(xx);
        	System.out.println(yy);
        	String[] z = amount.getText().split("", 3);
        	if (z[0].equals("(")) {
        		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(2,10), yy);
    		} else {
    			Assert.assertEquals(amount.getText().substring(1).replaceAll(",", ""), yy);
    		}
        	Reporter.log("Amount enter verified: "+amount.getText());
        	sl.ScrollToElement(m_Driver, ele1);
    	}
        Reporter.log("Enteries are Verified on TrialBalance Report page :", true);
   }
    public void verify_TrialBalance_FixedAsset_210_219() {
    	List<WebElement> elements = m_Driver.findElements(By.xpath("//table[@id='table1']/tbody[2]/tr/td[2][contains(text(),'')]/following-sibling::td[1]/a/parent::td/preceding-sibling::td[1]"));
        int size = elements.size();
        for (int i = 0; i <size-1; i++) {
        	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]"));
        	String led = ele1.getText();
        	WebElement ele2=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[1]/a"));
        	String led_text = ele2.getText();
        	String actualledger1=led+"   "+led_text;
        	System.out.println(actualledger1);
        	String expectedledger1 = expected_entry1.get(i);
        	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
        	Reporter.log("ledger1 code verified: "+actualledger1);
        	
        	WebElement amount=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[5]/span/a"));
        	String xx = amount.getText();
        	String yy = amt1.get(i)+".00";
        	System.out.println(xx);
        	System.out.println(yy);
        	String[] z = amount.getText().split("", 3);
        	if (z[0].equals("(")) {
        		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(2,10), yy);
    		} else {
    			Assert.assertEquals(amount.getText().substring(1).replaceAll(",", ""), yy);
    		}
        	Reporter.log("Amount enter verified: "+amount.getText());
        	sl.ScrollToElement(m_Driver, ele1);
    	}
        Reporter.log("Enteries are Verified on TrialBalance Report page :", true);
   }
    public void verify_TrialBalance_FixedAsset_220_229() {
    	List<WebElement> elements = m_Driver.findElements(By.xpath("//table[@id='table1']/tbody[2]/tr/td[2][contains(text(),'')]/following-sibling::td[1]/a/parent::td/preceding-sibling::td[1]"));
        int size = elements.size();
        for (int i = 0; i <size-1; i++) {
        	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]"));
        	String led = ele1.getText();
        	WebElement ele2=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[1]/a"));
        	String led_text = ele2.getText();
        	String actualledger1=led+"   "+led_text;
        	System.out.println(actualledger1);
        	String expectedledger1 = expected_entry1.get(i);
        	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
        	Reporter.log("ledger1 code verified: "+actualledger1);
        	
        	WebElement amount=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[5]//a"));
        	String xx = amount.getText();
        	String yy = amt1.get(i)+".00";
        	System.out.println(xx);
        	System.out.println(yy);
        	String[] z = amount.getText().split("", 3);
        	if (z[0].equals("(")) {
        		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(2,10), yy);
    		} else {
    			Assert.assertEquals(amount.getText().substring(1).replaceAll(",", ""), yy);
    		}
        	Reporter.log("Amount enter verified: "+amount.getText());
        	sl.ScrollToElement(m_Driver, ele1);
    	}
        Reporter.log("Enteries are Verified on TrialBalance Report page :", true);
   }
    public void verify_TrialBalance_fixedAsset_230_239() {
    	List<WebElement> elements = m_Driver.findElements(By.xpath("//table[@id='table1']/tbody[2]/tr/td[2][contains(text(),'')]/following-sibling::td[1]/a/parent::td/preceding-sibling::td[1]"));
        int size = elements.size();
        for (int i = 0; i <size-1; i++) {
        	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]"));
        	String led = ele1.getText();
        	WebElement ele2=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[1]/a"));
        	String led_text = ele2.getText();
        	String actualledger1=led+"   "+led_text;
        	System.out.println(actualledger1);
        	String expectedledger1 = expected_entry1.get(i);
        	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
        	Reporter.log("ledger1 code verified: "+actualledger1);
        	
        	WebElement amount=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[5]//a"));
        	String xx = amount.getText();
        	String yy = amt1.get(i)+".00";
        	System.out.println(xx);
        	System.out.println(yy);
        	String[] z = amount.getText().split("", 3);
        	if (z[0].equals("(")) {
        		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(2,10), yy);
    		} else {
    			Assert.assertEquals(amount.getText().substring(1).replaceAll(",", ""), yy);
    		}
        	Reporter.log("Amount enter verified: "+amount.getText());
        	sl.ScrollToElement(m_Driver, ele1);
    	}
        Reporter.log("Enteries are Verified on TrialBalance Report page :", true);
   }
    public void verify_TrialBalance_fixedAsset_240_249() {
    	List<WebElement> elements = m_Driver.findElements(By.xpath("//table[@id='table1']/tbody[2]/tr/td[2][contains(text(),'')]/following-sibling::td[1]/a/parent::td/preceding-sibling::td[1]"));
        int size = elements.size();
        for (int i = 0; i <size-1; i++) {
        	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]"));
        	String led = ele1.getText();
        	WebElement ele2=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[1]/a"));
        	String led_text = ele2.getText();
        	String actualledger1=led+"   "+led_text;
        	System.out.println(actualledger1);
        	String expectedledger1 = expected_entry1.get(i);
        	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
        	Reporter.log("ledger1 code verified: "+actualledger1);
        	
        	WebElement amount=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[5]//a"));
        	String xx = amount.getText();
        	String yy = amt1.get(i)+".00";
        	System.out.println(xx);
        	System.out.println(yy);
        	String[] z = amount.getText().split("", 3);
        	if (z[0].equals("(")) {
        		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(2,10), yy);
    		} else {
    			Assert.assertEquals(amount.getText().substring(1).replaceAll(",", ""), yy);
    		}
        	Reporter.log("Amount enter verified: "+amount.getText());
        	sl.ScrollToElement(m_Driver, ele1);
    	}
        Reporter.log("Enteries are Verified on TrialBalance Report page :", true);
   }
    public void verify_TrialBalance_FixedAsset_250_259() {
    	List<WebElement> elements = m_Driver.findElements(By.xpath("//table[@id='table1']/tbody[2]/tr/td[2][contains(text(),'')]/following-sibling::td[1]/a/parent::td/preceding-sibling::td[1]"));
        int size = elements.size();
        for (int i = 0; i <size-1; i++) {
        	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]"));
        	String led = ele1.getText();
        	WebElement ele2=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[1]/a"));
        	String led_text = ele2.getText();
        	String actualledger1=led+"   "+led_text;
        	System.out.println(actualledger1);
        	String expectedledger1 = expected_entry1.get(i);
        	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
        	Reporter.log("ledger1 code verified: "+actualledger1);
        	
        	WebElement amount=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[5]//a"));
        	String xx = amount.getText();
        	String yy = amt1.get(i)+".00";
        	System.out.println(xx);
        	System.out.println(yy);
        	String[] z = amount.getText().split("", 3);
        	if (z[0].equals("(")) {
        		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(2,10), yy);
    		} else {
    			Assert.assertEquals(amount.getText().substring(1).replaceAll(",", ""), yy);
    		}
        	Reporter.log("Amount enter verified: "+amount.getText());
        	sl.ScrollToElement(m_Driver, ele1);
    	}
        Reporter.log("Enteries are Verified on TrialBalance Report page :", true);
   }
    public void verify_TrialBalance_FixedAsset_260_269() {
    	List<WebElement> elements = m_Driver.findElements(By.xpath("//table[@id='table1']/tbody[2]/tr/td[2][contains(text(),'')]/following-sibling::td[1]/a/parent::td/preceding-sibling::td[1]"));
        int size = elements.size();
        for (int i = 0; i <size-1; i++) {
        	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]"));
        	String led = ele1.getText();
        	WebElement ele2=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[1]/a"));
        	String led_text = ele2.getText();
        	String actualledger1=led+"   "+led_text;
        	System.out.println(actualledger1);
        	String expectedledger1 = expected_entry1.get(i);
        	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
        	Reporter.log("ledger1 code verified: "+actualledger1);
        	
        	WebElement amount=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[5]//a"));
        	String xx = amount.getText();
        	String yy = amt1.get(i)+".00";
        	System.out.println(xx);
        	System.out.println(yy);
        	String[] z = amount.getText().split("", 3);
        	if (z[0].equals("(")) {
        		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(2,10), yy);
    		} else {
    			Assert.assertEquals(amount.getText().substring(1).replaceAll(",", ""), yy);
    		}
        	Reporter.log("Amount enter verified: "+amount.getText());
        	sl.ScrollToElement(m_Driver, ele1);
    	}
        Reporter.log("Enteries are Verified on TrialBalance Report page :", true);
   }
    public void verify_TrialBalance_FixedAsset_270_279() {
    	List<WebElement> elements = m_Driver.findElements(By.xpath("//table[@id='table1']/tbody[2]/tr/td[2][contains(text(),'')]/following-sibling::td[1]/a/parent::td/preceding-sibling::td[1]"));
        int size = elements.size();
        for (int i = 0; i <size-1; i++) {
        	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]"));
        	String led = ele1.getText();
        	WebElement ele2=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[1]/a"));
        	String led_text = ele2.getText();
        	String actualledger1=led+"   "+led_text;
        	System.out.println(actualledger1);
        	String expectedledger1 = expected_entry1.get(i);
        	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
        	Reporter.log("ledger1 code verified: "+actualledger1);
        	
        	WebElement amount=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[5]//a"));
        	String xx = amount.getText();
        	String yy = amt1.get(i)+".00";
        	System.out.println(xx);
        	System.out.println(yy);
        	String[] z = amount.getText().split("", 3);
        	if (z[0].equals("(")) {
        		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(2,10), yy);
    		} else {
    			Assert.assertEquals(amount.getText().substring(1).replaceAll(",", ""), yy);
    		}
        	Reporter.log("Amount enter verified: "+amount.getText());
        	sl.ScrollToElement(m_Driver, ele1);
    	}
        Reporter.log("Enteries are Verified on TrialBalance Report page :", true);
   }
    public void verify_TrialBalance_FixedAsset_280_289() {
    	List<WebElement> elements = m_Driver.findElements(By.xpath("//table[@id='table1']/tbody[2]/tr/td[2][contains(text(),'')]/following-sibling::td[1]/a/parent::td/preceding-sibling::td[1]"));
        int size = elements.size();
        for (int i = 0; i <size-1; i++) {
        	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]"));
        	String led = ele1.getText();
        	WebElement ele2=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[1]/a"));
        	String led_text = ele2.getText();
        	String actualledger1=led+"   "+led_text;
        	System.out.println(actualledger1);
        	String expectedledger1 = expected_entry1.get(i);
        	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
        	Reporter.log("ledger1 code verified: "+actualledger1);
        	
        	WebElement amount=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[5]//a"));
        	String xx = amount.getText();
        	String yy = amt1.get(i)+".00";
        	System.out.println(xx);
        	System.out.println(yy);
        	String[] z = amount.getText().split("", 3);
        	if (z[0].equals("(")) {
        		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(2,10), yy);
    		} else {
    			Assert.assertEquals(amount.getText().substring(1).replaceAll(",", ""), yy);
    		}
        	Reporter.log("Amount enter verified: "+amount.getText());
        	sl.ScrollToElement(m_Driver, ele1);
    	}
        Reporter.log("Enteries are Verified on TrialBalance Report page :", true);
   }
    public void verify_TrialBalance_FixedAsset_600_609() {
    	List<WebElement> elements = m_Driver.findElements(By.xpath("//table[@id='table1']/tbody[2]/tr/td[2][contains(text(),'')]/following-sibling::td[1]/a/parent::td/preceding-sibling::td[1]"));
        int size = elements.size();
        for (int i = 0; i <size-1; i++) {
        	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]"));
        	String led = ele1.getText();
        	WebElement ele2=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[1]/a"));
        	String led_text = ele2.getText();
        	String actualledger1=led+"   "+led_text;
        	System.out.println(actualledger1);
        	String expectedledger1 = expected_entry1.get(i);
        	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
        	Reporter.log("ledger1 code verified: "+actualledger1);
        	
        	WebElement amount=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[5]//a"));
        	String xx = amount.getText();
        	String yy = amt1.get(i)+".00";
        	System.out.println(xx);
        	System.out.println(yy);
        	String[] z = amount.getText().split("", 3);
        	if (z[0].equals("(")) {
        		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(2,9), yy);
    		} else {
    			Assert.assertEquals(amount.getText().substring(1).replaceAll(",", ""), yy);
    		}
        	Reporter.log("Amount enter verified: "+amount.getText());
        	sl.ScrollToElement(m_Driver, ele1);
    	}
        Reporter.log("Enteries are Verified on TrialBalance Report page :", true);
   }
    public void verify_TrialBalance_FixedAsset_630_639() {
    	List<WebElement> elements = m_Driver.findElements(By.xpath("//table[@id='table1']/tbody[2]/tr/td[2][contains(text(),'')]/following-sibling::td[1]/a/parent::td/preceding-sibling::td[1]"));
        int size = elements.size();
        for (int i = 0; i <size-1; i++) {
        	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]"));
        	String led = ele1.getText();
        	WebElement ele2=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[1]/a"));
        	String led_text = ele2.getText();
        	String actualledger1=led+"   "+led_text;
        	System.out.println(actualledger1);
        	String expectedledger1 = expected_entry1.get(i);
        	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
        	Reporter.log("ledger1 code verified: "+actualledger1);
        	
        	WebElement amount=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[5]//a"));
        	String xx = amount.getText();
        	String yy = amt1.get(i)+".00";
        	System.out.println(xx);
        	System.out.println(yy);
        	String[] z = amount.getText().split("", 3);
        	if (z[0].equals("(")) {
        		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(2,9), yy);
    		} else {
    			Assert.assertEquals(amount.getText().substring(1).replaceAll(",", ""), yy);
    		}
        	Reporter.log("Amount enter verified: "+amount.getText());
        	sl.ScrollToElement(m_Driver, ele1);
    	}
        Reporter.log("Enteries are Verified on TrialBalance Report page :", true);
   }
    public void verify_TrialBalance_IncomeType_4000_4021() {
    	List<WebElement> elements = m_Driver.findElements(By.xpath("//table[@id='table1']/tbody[2]/tr/td[2][contains(text(),'')]/following-sibling::td[1]/a/parent::td/preceding-sibling::td[1]"));
        int size = elements.size();
        for (int i = 0; i <size-1; i++) {
        	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]"));
        	String led = ele1.getText();
        	WebElement ele2=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[1]/a"));
        	String led_text = ele2.getText();
        	String actualledger1=led+"   "+led_text;
        	System.out.println(actualledger1);
        	String expectedledger1 = expected_entry1.get(i);
        	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
        	Reporter.log("ledger1 code verified: "+actualledger1);
        	
        	WebElement amount=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[5]//a"));
        	String xx = amount.getText();
        	String yy = amt1.get(i)+".00";
        	System.out.println(xx);
        	System.out.println(yy);
        	String[] z = amount.getText().split("", 3);
        	if (z[0].equals("(")) {
        		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(2,9), yy);
    		} else {
    			Assert.assertEquals(amount.getText().substring(1).replaceAll(",", ""), yy);
    		}
        	Reporter.log("Amount enter verified: "+amount.getText());
        	sl.ScrollToElement(m_Driver, ele1);
    	}
        Reporter.log("Enteries are Verified on TrialBalance Report page :", true);
   }
    public void verify_TrialBalance_Supplier_2060() {
    	List<WebElement> elements = m_Driver.findElements(By.xpath("//table[@id='table1']/tbody[2]/tr/td[2][contains(text(),'')]/following-sibling::td[1]/a/parent::td/preceding-sibling::td[1]"));
        int size = elements.size();
        for (int i = 0; i <size-1; i++) {
        	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]"));
        	String led = ele1.getText();
        	WebElement ele2=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[1]/a"));
        	String led_text = ele2.getText();
        	String actualledger1=led+"   "+led_text;
        	System.out.println(actualledger1);
        	String expectedledger1 = expected_entry1.get(i);
        	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
        	Reporter.log("ledger1 code verified: "+actualledger1);
        	
        	WebElement amount=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[5]//a"));
        	String xx = amount.getText();
        	String yy = amt1.get(i)+".00";
        	System.out.println(xx);
        	System.out.println(yy);
        	String[] z = amount.getText().split("", 3);
        	if (z[0].equals("(")) {
        		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(2,9), yy);
    		} else {
    			Assert.assertEquals(amount.getText().substring(1).replaceAll(",", ""), yy);
    		}
        	Reporter.log("Amount enter verified: "+amount.getText());
        	sl.ScrollToElement(m_Driver, ele1);
    	}
        Reporter.log("Enteries are Verified on TrialBalance Report page :", true);
   }
    public void verify_TrialBalance_Bank_1400() {
    	List<WebElement> elements = m_Driver.findElements(By.xpath("//table[@id='table1']/tbody[2]/tr/td[2][contains(text(),'')]/following-sibling::td[1]/a/parent::td/preceding-sibling::td[1]"));
        int size = elements.size();
        for (int i = 0; i <size-1; i++) {
        	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]"));
        	String led = ele1.getText();
        	WebElement ele2=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[1]/a"));
        	String led_text = ele2.getText();
        	String actualledger1=led+"   "+led_text;
        	System.out.println(actualledger1);
        	String expectedledger1 = expected_entry1.get(i);
        	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
        	Reporter.log("ledger1 code verified: "+actualledger1);
        	
        	WebElement amount=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[5]//a"));
        	String xx = amount.getText();
        	String yy = amt1.get(i)+".00";
        	System.out.println(xx);
        	System.out.println(yy);
        	String[] z = amount.getText().split("", 3);
        	if (z[0].equals("(")) {
        		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(2,9), yy);
    		} else {
    			Assert.assertEquals(amount.getText().substring(1).replaceAll(",", ""), yy);
    		}
        	Reporter.log("Amount enter verified: "+amount.getText());
        	sl.ScrollToElement(m_Driver, ele1);
    	}
        Reporter.log("Enteries are Verified on TrialBalance Report page :", true);
   }
    public void verify_TrialBalance_Director_1321() {
    	for (String string : expected_entry1) {
			System.out.println(string);
		}
    	String[] ledger2= {"1321","1321","1321","1321","1321"};
    	List<WebElement> elements = m_Driver.findElements(By.xpath("//table[@id='table1']/tbody[2]/tr/td[2][contains(text(),'')]/following-sibling::td[1]/a/parent::td/preceding-sibling::td[1]"));
        int size = elements.size();
        for (int i = 0; i <size-2; i++) {
        	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger2[i]+"')]"));
        	String led = ele1.getText();
        	int j=i+1;
        	 
        	if (i==0 || i==5) {
        		WebElement ele2 = m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger2[i]+"')]/following-sibling::td[1]/a"));
        		String led_text = ele2.getText();
            	String actualledger1=led+"   "+led_text;
            	System.out.println(actualledger1);
            	for (String expected_entr : expected_entry1) {
            		System.out.println(expected_entr);
				}
            	String expectedledger1 = expected_entry1.get(i);
            	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
            	Reporter.log("ledger1 code verified: "+actualledger1);
			} else {
				WebElement ele2 = m_Driver.findElement(By.xpath("(//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger2[i]+"')]/following-sibling::td[1]/a)["+j+"]"));
				String led_text = ele2.getText();
            	String actualledger1=led+"  "+led_text;
            	System.out.println(actualledger1);
            	String expectedledger1 = expected_entry1.get(i).replace("- Default director -", "");
            	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
            	Reporter.log("ledger1 code verified: "+actualledger1);

			}
        	
        	
        	if (i==5) {
        		WebElement amount=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger2[i]+"')]/following-sibling::td[5]//a"));
	        	String xx = amount.getText();
	        	String yy = amt1.get(i)+".00";
	        	System.out.println(xx);
	        	System.out.println(yy);
	        	String[] z = amount.getText().split("", 3);
	        	if (z[0].equals("(")) {
	        		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(2,9), yy);
	    		} else {
	    			Assert.assertEquals(amount.getText().substring(1).replaceAll(",", ""), yy);
	    		}
	        	Reporter.log("Amount enter verified: "+amount.getText());
	        	sl.ScrollToElement(m_Driver, ele1);	
				
			} else {
				WebElement amount = m_Driver.findElement(By.xpath("(//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger2[i]+"')]/following-sibling::td[5]//a)["+j+"]"));
				String xx = amount.getText();
	        	String yy = amt1.get(i)+".00";
	        	System.out.println(xx);
	        	System.out.println(yy);
	        	String[] z = amount.getText().split("", 3);
	        	if (z[0].equals("(")) {
	        		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(2,9), yy);
	    		} else {
	    			Assert.assertEquals(amount.getText().substring(1).replaceAll(",", ""), yy);
	    		}
	        	Reporter.log("Amount enter verified: "+amount.getText());
	        	sl.ScrollToElement(m_Driver, ele1);	

			}
        	
    	}
        Reporter.log("Enteries are Verified on TrialBalance Report page :", true);
   }
    
    public void verify_TrialBalance_employee_1322() {
    	
    	List<WebElement> elements = m_Driver.findElements(By.xpath("//table[@id='table1']/tbody[2]/tr/td[2][contains(text(),'')]/following-sibling::td[1]/a/parent::td/preceding-sibling::td[1]"));
        int size = elements.size();
        for (int i = 0; i <size-3; i++) {
        	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]"));
        	String led = ele1.getText();
        	int j=i+1;
        	 
        	if (i==0) {
        		WebElement ele2 = m_Driver.findElement(By.xpath("(//div/div/div/table/tbody/tr/td[contains(text(),'1322')]/following-sibling::td[1]/a)[2]"));
        		String led_text = ele2.getText();
            	String actualledger1=led+"   "+led_text;
            	//System.out.println(actualledger1);
            	String expectedledger1 = expected_entry1.get(0);
            	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
            	Reporter.log("ledger1 code verified: "+actualledger1,true);
			}else if (i==1) {
				WebElement ele2 = m_Driver.findElement(By.xpath("(//div/div/div/table/tbody/tr/td[contains(text(),'1322')]/following-sibling::td[1]/a)[1]"));
        		String led_text = ele2.getText();
            	String actualledger1=led+"   "+led_text;
            	//System.out.println(actualledger1);
            	String expectedledger1 = expected_entry1.get(1).replace("- Default employee -", " ");
            	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
            	Reporter.log("ledger1 code verified: "+actualledger1,true);
			}
			else if (i==4) {
				WebElement ele2 = m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'2080')]/following-sibling::td[1]/a"));
        		String led_text = ele2.getText();
            	String actualledger1=led+"   "+led_text;
            	//System.out.println(actualledger1);
            	String expectedledger1 = expected_entry1.get(4).replace("- Default employee -", " ");
            	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
            	Reporter.log("ledger1 code verified: "+actualledger1,true);
			}
        	else {
				WebElement ele2 = m_Driver.findElement(By.xpath("(//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[1]/a)["+j+"]"));
				String led_text = ele2.getText();
            	String actualledger1=led+"   "+led_text;
            	//System.out.println(actualledger1);
            	String expectedledger1 = expected_entry1.get(i).replace("- Default employee -", " ");
            	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
            	Reporter.log("ledger1 code verified: "+actualledger1,true);

			}
        	
        	
        	if (i==5) {
        		WebElement amount=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[5]//a"));
	        	String xx = amount.getText();
	        	String yy = amt1.get(i)+".00";
	        	//System.out.println(xx);
	        	//System.out.println(yy);
	        	String[] z = amount.getText().split("", 3);
	        	if (z[0].equals("(")) {
	        		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(2,9), yy);
	    		} else {
	    			Assert.assertEquals(amount.getText().substring(1).replaceAll(",", ""), yy);
	    		}
	        	Reporter.log("Amount enter verified: "+amount.getText(),true);
	        	sl.ScrollToElement(m_Driver, ele1);	
				
			}else if (i==0) {
				WebElement amount = m_Driver.findElement(By.xpath("(//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[5]//a)[2]"));
				String xx = amount.getText();
	        	String yy = amt1.get(i)+".00";
	        	//System.out.println(xx);
	        	//System.out.println(yy);
	        	String[] z = amount.getText().split("", 3);
	        	if (z[0].equals("(")) {
	        		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(2,9), yy);
	    		} else {
	    			Assert.assertEquals(amount.getText().substring(1).replaceAll(",", ""), yy);
	    		}
	        	Reporter.log("Amount enter verified: "+amount.getText(), true);
	        	sl.ScrollToElement(m_Driver, ele1);	
			} 
			else if (i==1) {
				WebElement amount = m_Driver.findElement(By.xpath("(//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[5]//a)[1]"));
				String xx = amount.getText();
	        	String yy = amt1.get(i)+".00";
	        	//System.out.println(xx);
	        	//System.out.println(yy);
	        	String[] z = amount.getText().split("", 3);
	        	if (z[0].equals("(")) {
	        		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(2,9), yy);
	    		} else {
	    			Assert.assertEquals(amount.getText().substring(1).replaceAll(",", ""), yy);
	    		}
	        	Reporter.log("Amount enter verified: "+amount.getText(), true);
	        	sl.ScrollToElement(m_Driver, ele1);	
			}
			else if (i==4) {
				WebElement amount = m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'2080')]/following-sibling::td[5]//a"));
				String xx = amount.getText();
	        	String yy = amt1.get(i)+".00";
	        	//System.out.println(xx);
	        	//System.out.println(yy);
	        	String[] z = amount.getText().split("", 3);
	        	if (z[0].equals("(")) {
	        		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(2,9), yy);
	    		} else {
	    			Assert.assertEquals(amount.getText().substring(1).replaceAll(",", ""), yy);
	    		}
	        	Reporter.log("Amount enter verified: "+amount.getText(), true);
	        	sl.ScrollToElement(m_Driver, ele1);	
			}else {
				WebElement amount = m_Driver.findElement(By.xpath("(//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[5]//a)["+j+"]"));
				String xx = amount.getText();
	        	String yy = amt1.get(i)+".00";
	        	//System.out.println(xx);
	        	//System.out.println(yy);
	        	String[] z = amount.getText().split("", 3);
	        	if (z[0].equals("(")) {
	        		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(2,9), yy);
	    		} else {
	    			Assert.assertEquals(amount.getText().substring(1).replaceAll(",", ""), yy);
	    		}
	        	Reporter.log("Amount enter verified: "+amount.getText(), true);
	        	sl.ScrollToElement(m_Driver, ele1);	

			}
        	
    	}
        Reporter.log("Enteries are Verified on TrialBalance Report page :", true);
   }
    public void verify_TrialBalance_PaymentType_1071_1201() {
    	List<WebElement> elements = m_Driver.findElements(By.xpath("//table[@id='table1']/tbody[2]/tr/td[2][contains(text(),'')]/following-sibling::td[1]/a/parent::td/preceding-sibling::td[1]"));
        int size = elements.size();
        for (int i = 0; i <size-1; i++) {
        	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]"));
        	String led = ele1.getText();
        	WebElement ele2=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[1]/a"));
        	String led_text = ele2.getText();
        	String actualledger1=led+"   "+led_text;
        	System.out.println(actualledger1);
        	String expectedledger1 = expected_entry1.get(i);
        	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
        	Reporter.log("ledger1 code verified: "+actualledger1);
        	
        	WebElement amount=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[5]//a"));
        	String xx = amount.getText();
        	String yy = amt1.get(i)+".00";
        	System.out.println(xx);
        	System.out.println(yy);
        	String[] z = amount.getText().split("", 3);
        	if (z[0].equals("(")) {
        		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(2,9), yy);
    		} else {
    			Assert.assertEquals(amount.getText().substring(1).replaceAll(",", ""), yy);
    		}
        	Reporter.log("Amount enter verified: "+amount.getText());
        	sl.ScrollToElement(m_Driver, ele1);
    	}
        	/*debit_total=(debit1+debit2+debit3+debit4+debit5+debit6+debit7+debit8+debit9+debit10);
            WebElement td = getWebElement(totaldebit_xpath);
            Assert.assertEquals(td.getText().substring(1).replaceAll(",", ""), String.format("%.2f",debit_total));
            Reporter.log("Total debit verified: "+td.getText().substring(1).replaceAll(",", ""));
            
            credit_total=credit11;
            WebElement tc = getWebElement(totalcredit_xpath);
            Assert.assertEquals(tc.getText().substring(1).replaceAll(",", ""), String.format("%.2f",credit_total));
            Reporter.log("Total credit verified: "+tc.getText().substring(1).replaceAll(",", ""));	*/	
   }
    
    public void verify_TrialBalance_Bf_FixedAsset_10_14(String BF_ledger1_No , String Bf_ledger1) {
    	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'"+BF_ledger1_No+"')]"));
    	String led = ele1.getText();
    	WebElement ele2=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'"+BF_ledger1_No+"')]/following-sibling::td[1]/a"));
    	String led_text = ele2.getText();
    	String actualledger1=led+"   "+led_text;
    	System.out.println(actualledger1);
    	String expectedledger1 = Bf_ledger1;
    	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
    	Reporter.log("ledger1 code verified: "+actualledger1);
    	
    	WebElement ele3=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'1400')]"));
    	String led2 = ele3.getText();
    	WebElement ele4=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'1400')]/following-sibling::td[1]/a"));
    	String led_text1 = ele4.getText();
    	String actualledger11=led2+"   "+led_text1;
    	System.out.println(actualledger11);
    	String expectedledger11 = expected_entry1.get(4);
    	Assert.assertEquals(actualledger11.trim().replaceAll("-", " "), expectedledger11.replaceAll("-"," ").trim());
    	Reporter.log("ledger1 code verified: "+actualledger1);
    	
    	double amount2 = 0.00;
    	for (int i = 0; i < amt1.size()-1; i++) {
    		double amt11 = Double.parseDouble(amt1.get(i));
    		amount2=amount2+amt11;
    		
		}
    	
        List<WebElement> amounts = m_Driver.findElements(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'')]/following-sibling::td[5]//a"));
        for (int j = 0; j < amounts.size()-2; j++) {
			WebElement amount1 = amounts.get(j);	
			String[] z = amount1.getText().split("", 3);
	        if (z[0].equals("(")) {
	        	Assert.assertEquals(amount1.getText().replaceAll(",", "").substring(2,9), String.format("%.2f",amount2));
	        	Reporter.log("entered Credit Amount verified: "+amount1.getText());
	    	} else {
	    		Assert.assertEquals(amount1.getText().substring(1).replaceAll(",", ""), String.format("%.2f",amount2));
	    		Reporter.log("Amount forwarded in next year verified: "+amount1.getText());
	    	}
	        //Reporter.log("Amount enter verified: "+amount1.getText());
	        sl.ScrollToElement(m_Driver, ele1);		
		}
   }
    public void verify_TrialBalance_Bf_FixedAsset_15_19(String BF_ledger1_No , String Bf_ledger1) {
    	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'"+BF_ledger1_No+"')]"));
    	String led = ele1.getText();
    	WebElement ele2=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'"+BF_ledger1_No+"')]/following-sibling::td[1]/a"));
    	String led_text = ele2.getText();
    	String actualledger1=led+"   "+led_text;
    	System.out.println(actualledger1);
    	String expectedledger1 = "15   Development costs amortisation b/f";
    	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
    	Reporter.log("ledger1 code verified: "+actualledger1);
    	
    	WebElement ele3=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'1400')]"));
    	String led2 = ele3.getText();
    	WebElement ele4=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'1400')]/following-sibling::td[1]/a"));
    	String led_text1 = ele4.getText();
    	String actualledger11=led2+"   "+led_text1;
    	System.out.println(actualledger11);
    	String expectedledger11 = expected_entry1.get(4);
    	Assert.assertEquals(actualledger11.trim().replaceAll("-", " "), expectedledger11.replaceAll("-"," ").trim());
    	Reporter.log("ledger1 code verified: "+actualledger1);
    	
    	double amount2 = 0.00;
    	for (int i = 0; i < amt1.size()-1; i++) {
    		double amt11 = Double.parseDouble(amt1.get(i));
    		amount2=amount2+amt11;	
		}
        List<WebElement> amounts = m_Driver.findElements(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'')]/following-sibling::td[5]//a"));
        for (int j = 0; j < amounts.size()-2; j++) {
			WebElement amount1 = amounts.get(j);
			String[] z = amount1.getText().split("", 3);
	        if (z[0].equals("(")) {
	        	Assert.assertEquals(amount1.getText().replaceAll(",", "").substring(2,9), String.format("%.2f",amount2));
	        	Reporter.log("entered Credit Amount verified: "+amount1.getText());
	    	} else {
	    		Assert.assertEquals(amount1.getText().substring(1).replaceAll(",", ""), String.format("%.2f",amount2));
	    		Reporter.log("Amount forwarded in next year verified: "+amount1.getText());
	    	}
	        //Reporter.log("Amount enter verified: "+amount1.getText());
	        sl.ScrollToElement(m_Driver, ele1);
			}
   }
    public void verify_TrialBalance_Bf_FixedAsset_20_24(String BF_ledger1_No , String Bf_ledger1) {
    	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'"+BF_ledger1_No+"')]"));
    	String led = ele1.getText();
    	WebElement ele2=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'"+BF_ledger1_No+"')]/following-sibling::td[1]/a"));
    	String led_text = ele2.getText();
    	String actualledger1=led+"   "+led_text;
    	System.out.println(actualledger1);
    	String expectedledger1 = "20   Patents cost b/f";
    	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
    	Reporter.log("ledger1 code verified: "+actualledger1);
    	
    	WebElement ele3=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'1400')]"));
    	String led2 = ele3.getText();
    	WebElement ele4=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'1400')]/following-sibling::td[1]/a"));
    	String led_text1 = ele4.getText();
    	String actualledger11=led2+"   "+led_text1;
    	System.out.println(actualledger11);
    	String expectedledger11 = expected_entry1.get(4);
    	Assert.assertEquals(actualledger11.trim().replaceAll("-", " "), expectedledger11.replaceAll("-"," ").trim());
    	Reporter.log("ledger1 code verified: "+actualledger1);
    	
    	double amount2 = 0.00;
    	for (int i = 0; i < amt1.size()-1; i++) {
    		double amt11 = Double.parseDouble(amt1.get(i));
    		amount2=amount2+amt11;
		}
        List<WebElement> amounts = m_Driver.findElements(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'')]/following-sibling::td[5]//a"));
        for (int j = 0; j < amounts.size()-2; j++) {
			WebElement amount1 = amounts.get(j);	
			String[] z = amount1.getText().split("", 3);
	        if (z[0].equals("(")) {
	        	Assert.assertEquals(amount1.getText().replaceAll(",", "").substring(2,9), String.format("%.2f",amount2));
	        	Reporter.log("entered Credit Amount verified: "+amount1.getText());
	    	} else {
	    	Assert.assertEquals(amount1.getText().substring(1).replaceAll(",", ""), String.format("%.2f",amount2));
	    	Reporter.log("Amount forwarded in next year verified: "+amount1.getText());
	    	}
	        //Reporter.log("Amount enter verified: "+amount1.getText());
	        sl.ScrollToElement(m_Driver, ele1);
		}
   }
    public void verify_TrialBalance_Bf_FixedAsset_25_29(String BF_ledger1_No , String Bf_ledger1) {
    	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'"+BF_ledger1_No+"')]"));
    	String led = ele1.getText();
    	WebElement ele2=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'"+BF_ledger1_No+"')]/following-sibling::td[1]/a"));
    	String led_text = ele2.getText();
    	String actualledger1=led+"   "+led_text;
    	System.out.println(actualledger1);
    	String expectedledger1 = "25   Patents amortisation b/f";
    	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
    	Reporter.log("ledger1 code verified: "+actualledger1);
    	
    	WebElement ele3=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'1400')]"));
    	String led2 = ele3.getText();
    	WebElement ele4=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'1400')]/following-sibling::td[1]/a"));
    	String led_text1 = ele4.getText();
    	String actualledger11=led2+"   "+led_text1;
    	System.out.println(actualledger11);
    	String expectedledger11 = expected_entry1.get(4);
    	Assert.assertEquals(actualledger11.trim().replaceAll("-", " "), expectedledger11.replaceAll("-"," ").trim());
    	Reporter.log("ledger1 code verified: "+actualledger11);
    	
    	double amount2 = 0.00;
    	for (int i = 0; i < amt1.size()-1; i++) {
    		double amt11 = Double.parseDouble(amt1.get(i));
    		amount2=amount2+amt11;
		}
        List<WebElement> amounts = m_Driver.findElements(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'')]/following-sibling::td[5]//a"));
        for (int j = 0; j < amounts.size()-2; j++) {
			WebElement amount1 = amounts.get(j);	
			String[] z = amount1.getText().split("", 3);
	        if (z[0].equals("(")) {
	        	Assert.assertEquals(amount1.getText().replaceAll(",", "").substring(2,9), String.format("%.2f",amount2));
	        	Reporter.log("entered Credit Amount verified: "+amount1.getText());
	    	} else {
	    	Assert.assertEquals(amount1.getText().substring(1).replaceAll(",", ""), String.format("%.2f",amount2));
	    	Reporter.log("Amount forwarded in next year verified: "+amount1.getText());
	    	}
	        //Reporter.log("Amount enter verified: "+amount1.getText());
	        sl.ScrollToElement(m_Driver, ele1);
		}
   }
    public void verify_TrialBalance_Bf_FixedAsset_30_34(String BF_ledger1_No , String Bf_ledger1) {
    	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'"+BF_ledger1_No+"')]"));
    	String led = ele1.getText();
    	WebElement ele2=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'"+BF_ledger1_No+"')]/following-sibling::td[1]/a"));
    	String led_text = ele2.getText();
    	String actualledger1=led+"   "+led_text;
    	System.out.println(actualledger1);
    	String expectedledger1 = "30   Purchased goodwill cost b/f";
    	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
    	Reporter.log("ledger1 code verified: "+actualledger1);
    	
    	WebElement ele3=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'1400')]"));
    	String led2 = ele3.getText();
    	WebElement ele4=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'1400')]/following-sibling::td[1]/a"));
    	String led_text1 = ele4.getText();
    	String actualledger11=led2+"   "+led_text1;
    	System.out.println(actualledger11);
    	String expectedledger11 = expected_entry1.get(4);
    	Assert.assertEquals(actualledger11.trim().replaceAll("-", " "), expectedledger11.replaceAll("-"," ").trim());
    	Reporter.log("ledger1 code verified: "+actualledger11);
    	
    	double amount2 = 0.00;
    	for (int i = 0; i < amt1.size()-1; i++) {
    		double amt11 = Double.parseDouble(amt1.get(i));
    		amount2=amount2+amt11;
		}
        List<WebElement> amounts = m_Driver.findElements(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'')]/following-sibling::td[5]//a"));
        for (int j = 0; j < amounts.size()-2; j++) {
			WebElement amount1 = amounts.get(j);	
			String[] z = amount1.getText().split("", 3);
	        if (z[0].equals("(")) {
	        	Assert.assertEquals(amount1.getText().replaceAll(",", "").substring(2,9), String.format("%.2f",amount2));
	        	Reporter.log("entered Credit Amount verified: "+amount1.getText());
	    	} else {
	    	Assert.assertEquals(amount1.getText().substring(1).replaceAll(",", ""), String.format("%.2f",amount2));
	    	Reporter.log("Amount forwarded in next year verified: "+amount1.getText());
	    	}
	        //Reporter.log("Amount enter verified: "+amount1.getText());
	        sl.ScrollToElement(m_Driver, ele1);
		}
   }
    
    public void verify_TrialBalance_Bf_FixedAsset_35_39(String BF_ledger1_No , String Bf_ledger1) {
    	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'"+BF_ledger1_No+"')]"));
    	String led = ele1.getText();
    	WebElement ele2=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'"+BF_ledger1_No+"')]/following-sibling::td[1]/a"));
    	String led_text = ele2.getText();
    	String actualledger1=led+"   "+led_text;
    	System.out.println(actualledger1);
    	String expectedledger1 = "35   Purchased goodwill amortisation b/f";
    	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
    	Reporter.log("ledger1 code verified: "+actualledger1);
    	
    	WebElement ele3=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'1400')]"));
    	String led2 = ele3.getText();
    	WebElement ele4=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'1400')]/following-sibling::td[1]/a"));
    	String led_text1 = ele4.getText();
    	String actualledger11=led2+"   "+led_text1;
    	System.out.println(actualledger11);
    	String expectedledger11 = expected_entry1.get(4);
    	Assert.assertEquals(actualledger11.trim().replaceAll("-", " "), expectedledger11.replaceAll("-"," ").trim());
    	Reporter.log("ledger1 code verified: "+actualledger11);
    	
    	double amount2 = 0.00;
    	for (int i = 0; i < amt1.size()-1; i++) {
    		double amt11 = Double.parseDouble(amt1.get(i));
    		amount2=amount2+amt11;
		}
        List<WebElement> amounts = m_Driver.findElements(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'')]/following-sibling::td[5]//a"));
        for (int j = 0; j < amounts.size()-2; j++) {
			WebElement amount1 = amounts.get(j);	
			String[] z = amount1.getText().split("", 3);
	        if (z[0].equals("(")) {
	        	Assert.assertEquals(amount1.getText().replaceAll(",", "").substring(2,9), String.format("%.2f",amount2));
	        	Reporter.log("entered Credit Amount verified: "+amount1.getText());
	    	} else {
	    	Assert.assertEquals(amount1.getText().substring(1).replaceAll(",", ""), String.format("%.2f",amount2));
	    	Reporter.log("Amount forwarded in next year verified: "+amount1.getText());
	    	}
	        //Reporter.log("Amount enter verified: "+amount1.getText());
	        sl.ScrollToElement(m_Driver, ele1);
		}
   }
    public void verify_TrialBalance_Bf_FixedAsset_40_44(String BF_ledger1_No , String Bf_ledger1) {
    	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'"+BF_ledger1_No+"')]"));
    	String led = ele1.getText();
    	WebElement ele2=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'"+BF_ledger1_No+"')]/following-sibling::td[1]/a"));
    	String led_text = ele2.getText();
    	String actualledger1=led+"   "+led_text;
    	System.out.println(actualledger1);
    	String expectedledger1 = "40   Payments on account cost b/f";
    	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
    	Reporter.log("ledger1 code verified: "+actualledger1);
    	
    	WebElement ele3=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'1400')]"));
    	String led2 = ele3.getText();
    	WebElement ele4=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'1400')]/following-sibling::td[1]/a"));
    	String led_text1 = ele4.getText();
    	String actualledger11=led2+"   "+led_text1;
    	System.out.println(actualledger11);
    	String expectedledger11 = expected_entry1.get(4);
    	Assert.assertEquals(actualledger11.trim().replaceAll("-", " "), expectedledger11.replaceAll("-"," ").trim());
    	Reporter.log("ledger1 code verified: "+actualledger11);
    	
    	double amount2 = 0.00;
    	for (int i = 0; i < amt1.size()-1; i++) {
    		double amt11 = Double.parseDouble(amt1.get(i));
    		amount2=amount2+amt11;
		}
        List<WebElement> amounts = m_Driver.findElements(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'')]/following-sibling::td[5]//a"));
        for (int j = 0; j < amounts.size()-2; j++) {
			WebElement amount1 = amounts.get(j);	
			String[] z = amount1.getText().split("", 3);
	        if (z[0].equals("(")) {
	        	Assert.assertEquals(amount1.getText().replaceAll(",", "").substring(2,9), String.format("%.2f",amount2));
	        	Reporter.log("entered Credit Amount verified: "+amount1.getText());
	    	} else {
	    	Assert.assertEquals(amount1.getText().substring(1).replaceAll(",", ""), String.format("%.2f",amount2));
	    	Reporter.log("Amount forwarded in next year verified: "+amount1.getText());
	    	}
	        //Reporter.log("Amount enter verified: "+amount1.getText());
	        sl.ScrollToElement(m_Driver, ele1);
		}
   }
    public void verify_TrialBalance_Bf_FixedAsset_45_49(String BF_ledger1_No , String Bf_ledger1) {
    	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'"+BF_ledger1_No+"')]"));
    	String led = ele1.getText();
    	WebElement ele2=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'"+BF_ledger1_No+"')]/following-sibling::td[1]/a"));
    	String led_text = ele2.getText();
    	String actualledger1=led+"   "+led_text;
    	System.out.println(actualledger1);
    	String expectedledger1 = "45   Payments on account amortisation b/f";
    	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
    	Reporter.log("ledger1 code verified: "+actualledger1);
    	
    	WebElement ele3=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'1400')]"));
    	String led2 = ele3.getText();
    	WebElement ele4=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'1400')]/following-sibling::td[1]/a"));
    	String led_text1 = ele4.getText();
    	String actualledger11=led2+"   "+led_text1;
    	System.out.println(actualledger11);
    	String expectedledger11 = expected_entry1.get(4);
    	Assert.assertEquals(actualledger11.trim().replaceAll("-", " "), expectedledger11.replaceAll("-"," ").trim());
    	Reporter.log("ledger1 code verified: "+actualledger11);
    	
    	double amount2 = 0.00;
    	for (int i = 0; i < amt1.size()-1; i++) {
    		double amt11 = Double.parseDouble(amt1.get(i));
    		amount2=amount2+amt11;
		}
        List<WebElement> amounts = m_Driver.findElements(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'')]/following-sibling::td[5]//a"));
        for (int j = 0; j < amounts.size()-2; j++) {
			WebElement amount1 = amounts.get(j);	
			String[] z = amount1.getText().split("", 3);
	        if (z[0].equals("(")) {
	        	Assert.assertEquals(amount1.getText().replaceAll(",", "").substring(2,9), String.format("%.2f",amount2));
	        	Reporter.log("entered Credit Amount verified: "+amount1.getText());
	    	} else {
	    	Assert.assertEquals(amount1.getText().substring(1).replaceAll(",", ""), String.format("%.2f",amount2));
	    	Reporter.log("Amount forwarded in next year verified: "+amount1.getText());
	    	}
	        //Reporter.log("Amount enter verified: "+amount1.getText());
	        sl.ScrollToElement(m_Driver, ele1);
		}
   }
    
    public void verify_TrialBalance_Bf_FixedAsset_200_204(String BF_ledger1_No , String Bf_ledger1) {
    	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'"+BF_ledger1_No+"')]"));
    	String led = ele1.getText();
    	WebElement ele2=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'"+BF_ledger1_No+"')]/following-sibling::td[1]/a"));
    	String led_text = ele2.getText();
    	String actualledger1=led+"   "+led_text;
    	System.out.println(actualledger1);
    	String expectedledger1 = Bf_ledger1;
    	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
    	Reporter.log("ledger1 code verified: "+actualledger1);
    	
    	WebElement ele3=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'1400')]"));
    	String led2 = ele3.getText();
    	WebElement ele4=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'1400')]/following-sibling::td[1]/a"));
    	String led_text1 = ele4.getText();
    	String actualledger11=led2+"   "+led_text1;
    	System.out.println(actualledger11);
    	String expectedledger11 = expected_entry1.get(4);
    	Assert.assertEquals(actualledger11.trim().replaceAll("-", " "), expectedledger11.replaceAll("-"," ").trim());
    	Reporter.log("ledger1 code verified: "+actualledger11);
    	
    	double amount2 = 0.00;
    	for (int i = 0; i < amt1.size()-1; i++) {
    		double amt11 = Double.parseDouble(amt1.get(i));
    		amount2=amount2+amt11;
		}
        List<WebElement> amounts = m_Driver.findElements(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'')]/following-sibling::td[5]//a"));
        for (int j = 0; j < amounts.size()-2; j++) {
			WebElement amount1 = amounts.get(j);	
			String[] z = amount1.getText().split("", 3);
	        if (z[0].equals("(")) {
	        	Assert.assertEquals(amount1.getText().replaceAll(",", "").substring(2,9), String.format("%.2f",amount2));
	        	Reporter.log("entered Credit Amount verified: "+amount1.getText());
	    	} else {
	    	Assert.assertEquals(amount1.getText().substring(1).replaceAll(",", ""), String.format("%.2f",amount2));
	    	Reporter.log("Amount forwarded in next year verified: "+amount1.getText());
	    	}
	        //Reporter.log("Amount enter verified: "+amount1.getText());
	        sl.ScrollToElement(m_Driver, ele1);
		}
   }
    
    public void verify_TrialBalance_Bf_FixedAsset_205_209(String BF_ledger1_No , String Bf_ledger1) {
    	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'"+BF_ledger1_No+"')]"));
    	String led = ele1.getText();
    	WebElement ele2=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'"+BF_ledger1_No+"')]/following-sibling::td[1]/a"));
    	String led_text = ele2.getText();
    	String actualledger1=led+"   "+led_text;
    	System.out.println(actualledger1);
    	String expectedledger1 = Bf_ledger1;
    	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
    	Reporter.log("ledger1 code verified: "+actualledger1);
    	
    	WebElement ele3=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'1400')]"));
    	String led2 = ele3.getText();
    	WebElement ele4=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'1400')]/following-sibling::td[1]/a"));
    	String led_text1 = ele4.getText();
    	String actualledger11=led2+"   "+led_text1;
    	System.out.println(actualledger11);
    	String expectedledger11 = expected_entry1.get(4);
    	Assert.assertEquals(actualledger11.trim().replaceAll("-", " "), expectedledger11.replaceAll("-"," ").trim());
    	Reporter.log("ledger1 code verified: "+actualledger11);
    	
    	double amount2 = 0.00;
    	for (int i = 0; i < amt1.size()-1; i++) {
    		double amt11 = Double.parseDouble(amt1.get(i));
    		amount2=amount2+amt11;
		}
        List<WebElement> amounts = m_Driver.findElements(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'')]/following-sibling::td[5]//a"));
        for (int j = 0; j < amounts.size()-2; j++) {
			WebElement amount1 = amounts.get(j);	
			String[] z = amount1.getText().split("", 3);
	        if (z[0].equals("(")) {
	        	Assert.assertEquals(amount1.getText().replaceAll(",", "").substring(2,9), String.format("%.2f",amount2));
	        	Reporter.log("entered Credit Amount verified: "+amount1.getText());
	    	} else {
	    	Assert.assertEquals(amount1.getText().substring(1).replaceAll(",", ""), String.format("%.2f",amount2));
	    	Reporter.log("Amount forwarded in next year verified: "+amount1.getText());
	    	}
	        //Reporter.log("Amount enter verified: "+amount1.getText());
	        sl.ScrollToElement(m_Driver, ele1);
		}
        Reporter.log("Enteries are Verified on TrialBalance Report page :", true);
   }
    public void verify_TrialBalance_Bf_FixedAsset_210_214(String BF_ledger1_No , String Bf_ledger1) {
    	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'"+BF_ledger1_No+"')]"));
    	String led = ele1.getText();
    	WebElement ele2=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'"+BF_ledger1_No+"')]/following-sibling::td[1]/a"));
    	String led_text = ele2.getText();
    	String actualledger1=led+"   "+led_text;
    	System.out.println(actualledger1);
    	String expectedledger1 = Bf_ledger1;
    	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
    	Reporter.log("ledger1 code verified: "+actualledger1);
    	
    	WebElement ele3=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'1400')]"));
    	String led2 = ele3.getText();
    	WebElement ele4=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'1400')]/following-sibling::td[1]/a"));
    	String led_text1 = ele4.getText();
    	String actualledger11=led2+"   "+led_text1;
    	System.out.println(actualledger11);
    	String expectedledger11 = expected_entry1.get(4);
    	Assert.assertEquals(actualledger11.trim().replaceAll("-", " "), expectedledger11.replaceAll("-"," ").trim());
    	Reporter.log("ledger1 code verified: "+actualledger11);
    	
    	double amount2 = 0.00;
    	for (int i = 0; i < amt1.size()-1; i++) {
    		double amt11 = Double.parseDouble(amt1.get(i));
    		amount2=amount2+amt11;
		}
        List<WebElement> amounts = m_Driver.findElements(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'')]/following-sibling::td[5]//a"));
        for (int j = 0; j < amounts.size()-2; j++) {
			WebElement amount1 = amounts.get(j);	
			String[] z = amount1.getText().split("", 3);
	        if (z[0].equals("(")) {
	        	Assert.assertEquals(amount1.getText().replaceAll(",", "").substring(2,9), String.format("%.2f",amount2));
	        	Reporter.log("entered Credit Amount verified: "+amount1.getText());
	    	} else {
	    	Assert.assertEquals(amount1.getText().substring(1).replaceAll(",", ""), String.format("%.2f",amount2));
	    	Reporter.log("Amount forwarded in next year verified: "+amount1.getText());
	    	}
	        //Reporter.log("Amount enter verified: "+amount1.getText());
	        sl.ScrollToElement(m_Driver, ele1);
		}
        Reporter.log("Enteries are Verified on TrialBalance Report page :", true);
   }
    public void verify_TrialBalance_Bf_FixedAsset_215_219(String BF_ledger1_No , String Bf_ledger1) {
    	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'"+BF_ledger1_No+"')]"));
    	String led = ele1.getText();
    	WebElement ele2=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'"+BF_ledger1_No+"')]/following-sibling::td[1]/a"));
    	String led_text = ele2.getText();
    	String actualledger1=led+"   "+led_text;
    	System.out.println(actualledger1);
    	String expectedledger1 = Bf_ledger1;
    	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
    	Reporter.log("ledger1 code verified: "+actualledger1);
    	
    	WebElement ele3=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'1400')]"));
    	String led2 = ele3.getText();
    	WebElement ele4=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'1400')]/following-sibling::td[1]/a"));
    	String led_text1 = ele4.getText();
    	String actualledger11=led2+"   "+led_text1;
    	System.out.println(actualledger11);
    	String expectedledger11 = expected_entry1.get(4);
    	Assert.assertEquals(actualledger11.trim().replaceAll("-", " "), expectedledger11.replaceAll("-"," ").trim());
    	Reporter.log("ledger1 code verified: "+actualledger11);
    	
    	double amount2 = 0.00;
    	for (int i = 0; i < amt1.size()-1; i++) {
    		double amt11 = Double.parseDouble(amt1.get(i));
    		amount2=amount2+amt11;
		}
        List<WebElement> amounts = m_Driver.findElements(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'')]/following-sibling::td[5]//a"));
        for (int j = 0; j < amounts.size()-2; j++) {
			WebElement amount1 = amounts.get(j);	
			String[] z = amount1.getText().split("", 3);
	        if (z[0].equals("(")) {
	        	Assert.assertEquals(amount1.getText().replaceAll(",", "").substring(2,9), String.format("%.2f",amount2));
	        	Reporter.log("entered Credit Amount verified: "+amount1.getText());
	    	} else {
	    	Assert.assertEquals(amount1.getText().substring(1).replaceAll(",", ""), String.format("%.2f",amount2));
	    	Reporter.log("Amount forwarded in next year verified: "+amount1.getText());
	    	}
	        //Reporter.log("Amount enter verified: "+amount1.getText());
	        sl.ScrollToElement(m_Driver, ele1);
		}
        Reporter.log("Enteries are Verified on TrialBalance Report page :", true);
   }
    
    public void verify_TrialBalance_Bf_FixedAsset_220_224(String BF_ledger1_No , String Bf_ledger1) {
    	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'"+BF_ledger1_No+"')]"));
    	String led = ele1.getText();
    	WebElement ele2=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'"+BF_ledger1_No+"')]/following-sibling::td[1]/a"));
    	String led_text = ele2.getText();
    	String actualledger1=led+"   "+led_text;
    	System.out.println(actualledger1);
    	String expectedledger1 = Bf_ledger1;
    	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
    	Reporter.log("ledger1 code verified: "+actualledger1);
    	
    	WebElement ele3=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'1400')]"));
    	String led2 = ele3.getText();
    	WebElement ele4=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'1400')]/following-sibling::td[1]/a"));
    	String led_text1 = ele4.getText();
    	String actualledger11=led2+"   "+led_text1;
    	System.out.println(actualledger11);
    	String expectedledger11 = expected_entry1.get(4);
    	Assert.assertEquals(actualledger11.trim().replaceAll("-", " "), expectedledger11.replaceAll("-"," ").trim());
    	Reporter.log("ledger1 code verified: "+actualledger11);
    	
    	double amount2 = 0.00;
    	for (int i = 0; i < amt1.size()-1; i++) {
    		double amt11 = Double.parseDouble(amt1.get(i));
    		amount2=amount2+amt11;
		}
        List<WebElement> amounts = m_Driver.findElements(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'')]/following-sibling::td[5]//a"));
        for (int j = 0; j < amounts.size()-2; j++) {
			WebElement amount1 = amounts.get(j);	
			String[] z = amount1.getText().split("", 3);
	        if (z[0].equals("(")) {
	        	Assert.assertEquals(amount1.getText().replaceAll(",", "").substring(2,9), String.format("%.2f",amount2));
	        	Reporter.log("entered Credit Amount verified: "+amount1.getText());
	    	} else {
	    	Assert.assertEquals(amount1.getText().substring(1).replaceAll(",", ""), String.format("%.2f",amount2));
	    	Reporter.log("Amount forwarded in next year verified: "+amount1.getText());
	    	}
	        //Reporter.log("Amount enter verified: "+amount1.getText());
	        sl.ScrollToElement(m_Driver, ele1);
		}
        Reporter.log("Enteries are Verified on TrialBalance Report page :", true);
   }
    
    public void verify_TrialBalance_Bf_FixedAsset_225_229(String BF_ledger1_No , String Bf_ledger1) {
    	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'"+BF_ledger1_No+"')]"));
    	String led = ele1.getText();
    	WebElement ele2=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'"+BF_ledger1_No+"')]/following-sibling::td[1]/a"));
    	String led_text = ele2.getText();
    	String actualledger1=led+"   "+led_text;
    	System.out.println(actualledger1);
    	String expectedledger1 = Bf_ledger1;
    	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
    	Reporter.log("ledger1 code verified: "+actualledger1);
    	
    	WebElement ele3=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'1400')]"));
    	String led2 = ele3.getText();
    	WebElement ele4=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'1400')]/following-sibling::td[1]/a"));
    	String led_text1 = ele4.getText();
    	String actualledger11=led2+"   "+led_text1;
    	System.out.println(actualledger11);
    	String expectedledger11 = expected_entry1.get(4);
    	Assert.assertEquals(actualledger11.trim().replaceAll("-", " "), expectedledger11.replaceAll("-"," ").trim());
    	Reporter.log("ledger1 code verified: "+actualledger11);
    	
    	double amount2 = 0.00;
    	for (int i = 0; i < amt1.size()-1; i++) {
    		double amt11 = Double.parseDouble(amt1.get(i));
    		amount2=amount2+amt11;
		}
        List<WebElement> amounts = m_Driver.findElements(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'')]/following-sibling::td[5]//a"));
        for (int j = 0; j < amounts.size()-2; j++) {
			WebElement amount1 = amounts.get(j);	
			String[] z = amount1.getText().split("", 3);
	        if (z[0].equals("(")) {
	        	Assert.assertEquals(amount1.getText().replaceAll(",", "").substring(2,9), String.format("%.2f",amount2));
	        	Reporter.log("entered Credit Amount verified: "+amount1.getText());
	    	} else {
	    	Assert.assertEquals(amount1.getText().substring(1).replaceAll(",", ""), String.format("%.2f",amount2));
	    	Reporter.log("Amount forwarded in next year verified: "+amount1.getText());
	    	}
	        //Reporter.log("Amount enter verified: "+amount1.getText());
	        sl.ScrollToElement(m_Driver, ele1);
		}
        Reporter.log("Enteries are Verified on TrialBalance Report page :", true);
   }
    
    public void verify_TrialBalance_Bf_FixedAsset_230_234(String BF_ledger1_No , String Bf_ledger1) {
    	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'"+BF_ledger1_No+"')]"));
    	String led = ele1.getText();
    	WebElement ele2=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'"+BF_ledger1_No+"')]/following-sibling::td[1]/a"));
    	String led_text = ele2.getText();
    	String actualledger1=led+"   "+led_text;
    	System.out.println(actualledger1);
    	String expectedledger1 = Bf_ledger1;
    	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
    	Reporter.log("ledger1 code verified: "+actualledger1);
    	
    	WebElement ele3=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'1400')]"));
    	String led2 = ele3.getText();
    	WebElement ele4=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'1400')]/following-sibling::td[1]/a"));
    	String led_text1 = ele4.getText();
    	String actualledger11=led2+"   "+led_text1;
    	System.out.println(actualledger11);
    	String expectedledger11 = expected_entry1.get(4);
    	Assert.assertEquals(actualledger11.trim().replaceAll("-", " "), expectedledger11.replaceAll("-"," ").trim());
    	Reporter.log("ledger1 code verified: "+actualledger11);
    	
    	double amount2 = 0.00;
    	for (int i = 0; i < amt1.size()-1; i++) {
    		double amt11 = Double.parseDouble(amt1.get(i));
    		amount2=amount2+amt11;
		}
        List<WebElement> amounts = m_Driver.findElements(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'')]/following-sibling::td[5]//a"));
        for (int j = 0; j < amounts.size()-2; j++) {
			WebElement amount1 = amounts.get(j);	
			String[] z = amount1.getText().split("", 3);
	        if (z[0].equals("(")) {
	        	Assert.assertEquals(amount1.getText().replaceAll(",", "").substring(2,9), String.format("%.2f",amount2));
	        	Reporter.log("entered Credit Amount verified: "+amount1.getText());
	    	} else {
	    	Assert.assertEquals(amount1.getText().substring(1).replaceAll(",", ""), String.format("%.2f",amount2));
	    	Reporter.log("Amount forwarded in next year verified: "+amount1.getText());
	    	}
	        //Reporter.log("Amount enter verified: "+amount1.getText());
	        sl.ScrollToElement(m_Driver, ele1);
		}
        Reporter.log("Enteries are Verified on TrialBalance Report page :", true);
   }
    public void verify_TrialBalance_Bf_FixedAsset_235_239(String BF_ledger1_No , String Bf_ledger1) {
    	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'"+BF_ledger1_No+"')]"));
    	String led = ele1.getText();
    	WebElement ele2=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'"+BF_ledger1_No+"')]/following-sibling::td[1]/a"));
    	String led_text = ele2.getText();
    	String actualledger1=led+"   "+led_text;
    	System.out.println(actualledger1);
    	String expectedledger1 = Bf_ledger1;
    	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
    	Reporter.log("ledger1 code verified: "+actualledger1);
    	
    	WebElement ele3=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'1400')]"));
    	String led2 = ele3.getText();
    	WebElement ele4=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'1400')]/following-sibling::td[1]/a"));
    	String led_text1 = ele4.getText();
    	String actualledger11=led2+"   "+led_text1;
    	System.out.println(actualledger11);
    	String expectedledger11 = expected_entry1.get(4);
    	Assert.assertEquals(actualledger11.trim().replaceAll("-", " "), expectedledger11.replaceAll("-"," ").trim());
    	Reporter.log("ledger1 code verified: "+actualledger11);
    	
    	double amount2 = 0.00;
    	for (int i = 0; i < amt1.size()-1; i++) {
    		double amt11 = Double.parseDouble(amt1.get(i));
    		amount2=amount2+amt11;
		}
        List<WebElement> amounts = m_Driver.findElements(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'')]/following-sibling::td[5]//a"));
        for (int j = 0; j < amounts.size()-2; j++) {
			WebElement amount1 = amounts.get(j);	
			String[] z = amount1.getText().split("", 3);
	        if (z[0].equals("(")) {
	        	Assert.assertEquals(amount1.getText().replaceAll(",", "").substring(2,9), String.format("%.2f",amount2));
	        	Reporter.log("entered Credit Amount verified: "+amount1.getText());
	    	} else {
	    	Assert.assertEquals(amount1.getText().substring(1).replaceAll(",", ""), String.format("%.2f",amount2));
	    	Reporter.log("Amount forwarded in next year verified: "+amount1.getText());
	    	}
	        //Reporter.log("Amount enter verified: "+amount1.getText());
	        sl.ScrollToElement(m_Driver, ele1);
		}
        Reporter.log("Enteries are Verified on TrialBalance Report page :", true);
   }
    
    public void verify_TrialBalance_Bf_FixedAsset_240_245(String BF_ledger1_No , String Bf_ledger1) {
    	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'"+BF_ledger1_No+"')]"));
    	String led = ele1.getText();
    	WebElement ele2=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'"+BF_ledger1_No+"')]/following-sibling::td[1]/a"));
    	String led_text = ele2.getText();
    	String actualledger1=led+"   "+led_text;
    	System.out.println(actualledger1);
    	String expectedledger1 = Bf_ledger1;
    	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
    	Reporter.log("ledger1 code verified: "+actualledger1);
    	
    	WebElement ele3=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'1400')]"));
    	String led2 = ele3.getText();
    	WebElement ele4=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'1400')]/following-sibling::td[1]/a"));
    	String led_text1 = ele4.getText();
    	String actualledger11=led2+"   "+led_text1;
    	System.out.println(actualledger11);
    	String expectedledger11 = expected_entry1.get(4);
    	Assert.assertEquals(actualledger11.trim().replaceAll("-", " "), expectedledger11.replaceAll("-"," ").trim());
    	Reporter.log("ledger1 code verified: "+actualledger11);
    	
    	double amount2 = 0.00;
    	for (int i = 0; i < amt1.size()-1; i++) {
    		double amt11 = Double.parseDouble(amt1.get(i));
    		amount2=amount2+amt11;
		}
        List<WebElement> amounts = m_Driver.findElements(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'')]/following-sibling::td[5]//a"));
        for (int j = 0; j < amounts.size()-2; j++) {
			WebElement amount1 = amounts.get(j);	
			String[] z = amount1.getText().split("", 3);
	        if (z[0].equals("(")) {
	        	Assert.assertEquals(amount1.getText().replaceAll(",", "").substring(2,9), String.format("%.2f",amount2));
	        	Reporter.log("entered Credit Amount verified: "+amount1.getText());
	    	} else {
	    	Assert.assertEquals(amount1.getText().substring(1).replaceAll(",", ""), String.format("%.2f",amount2));
	    	Reporter.log("Amount forwarded in next year verified: "+amount1.getText());
	    	}
	        //Reporter.log("Amount enter verified: "+amount1.getText());
	        sl.ScrollToElement(m_Driver, ele1);
		}
        Reporter.log("Enteries are Verified on TrialBalance Report page :", true);
   }
    
    public void verify_TrialBalance_Bf_FixedAsset_245_249(String BF_ledger1_No , String Bf_ledger1) {
    	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'"+BF_ledger1_No+"')]"));
    	String led = ele1.getText();
    	WebElement ele2=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'"+BF_ledger1_No+"')]/following-sibling::td[1]/a"));
    	String led_text = ele2.getText();
    	String actualledger1=led+"   "+led_text;
    	System.out.println(actualledger1);
    	String expectedledger1 = Bf_ledger1;
    	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
    	Reporter.log("ledger1 code verified: "+actualledger1);
    	
    	WebElement ele3=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'1400')]"));
    	String led2 = ele3.getText();
    	WebElement ele4=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'1400')]/following-sibling::td[1]/a"));
    	String led_text1 = ele4.getText();
    	String actualledger11=led2+"   "+led_text1;
    	System.out.println(actualledger11);
    	String expectedledger11 = expected_entry1.get(4);
    	Assert.assertEquals(actualledger11.trim().replaceAll("-", " "), expectedledger11.replaceAll("-"," ").trim());
    	Reporter.log("ledger1 code verified: "+actualledger11);
    	
    	double amount2 = 0.00;
    	for (int i = 0; i < amt1.size()-1; i++) {
    		double amt11 = Double.parseDouble(amt1.get(i));
    		amount2=amount2+amt11;
		}
        List<WebElement> amounts = m_Driver.findElements(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'')]/following-sibling::td[5]//a"));
        for (int j = 0; j < amounts.size()-2; j++) {
			WebElement amount1 = amounts.get(j);	
			String[] z = amount1.getText().split("", 3);
	        if (z[0].equals("(")) {
	        	Assert.assertEquals(amount1.getText().replaceAll(",", "").substring(2,9), String.format("%.2f",amount2));
	        	Reporter.log("entered Credit Amount verified: "+amount1.getText());
	    	} else {
	    	Assert.assertEquals(amount1.getText().substring(1).replaceAll(",", ""), String.format("%.2f",amount2));
	    	Reporter.log("Amount forwarded in next year verified: "+amount1.getText());
	    	}
	        //Reporter.log("Amount enter verified: "+amount1.getText());
	        sl.ScrollToElement(m_Driver, ele1);
		}
        Reporter.log("Enteries are Verified on TrialBalance Report page :", true);
   }
    
    public void verify_TrialBalance_Bf_FixedAsset_250_254(String BF_ledger1_No , String Bf_ledger1) {
    	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'"+BF_ledger1_No+"')]"));
    	String led = ele1.getText();
    	WebElement ele2=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'"+BF_ledger1_No+"')]/following-sibling::td[1]/a"));
    	String led_text = ele2.getText();
    	String actualledger1=led+"   "+led_text;
    	System.out.println(actualledger1);
    	String expectedledger1 = Bf_ledger1;
    	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
    	Reporter.log("ledger1 code verified: "+actualledger1);
    	
    	WebElement ele3=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'1400')]"));
    	String led2 = ele3.getText();
    	WebElement ele4=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'1400')]/following-sibling::td[1]/a"));
    	String led_text1 = ele4.getText();
    	String actualledger11=led2+"   "+led_text1;
    	System.out.println(actualledger11);
    	String expectedledger11 = expected_entry1.get(4);
    	Assert.assertEquals(actualledger11.trim().replaceAll("-", " "), expectedledger11.replaceAll("-"," ").trim());
    	Reporter.log("ledger1 code verified: "+actualledger11);
    	
    	double amount2 = 0.00;
    	for (int i = 0; i < amt1.size()-1; i++) {
    		double amt11 = Double.parseDouble(amt1.get(i));
    		amount2=amount2+amt11;
		}
        List<WebElement> amounts = m_Driver.findElements(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'')]/following-sibling::td[5]//a"));
        for (int j = 0; j < amounts.size()-2; j++) {
			WebElement amount1 = amounts.get(j);	
			String[] z = amount1.getText().split("", 3);
	        if (z[0].equals("(")) {
	        	Assert.assertEquals(amount1.getText().replaceAll(",", "").substring(2,9), String.format("%.2f",amount2));
	        	Reporter.log("entered Credit Amount verified: "+amount1.getText());
	    	} else {
	    	Assert.assertEquals(amount1.getText().substring(1).replaceAll(",", ""), String.format("%.2f",amount2));
	    	Reporter.log("Amount forwarded in next year verified: "+amount1.getText());
	    	}
	        //Reporter.log("Amount enter verified: "+amount1.getText());
	        sl.ScrollToElement(m_Driver, ele1);
		}
        Reporter.log("Enteries are Verified on TrialBalance Report page :", true);
   }
    public void verify_TrialBalance_Bf_FixedAsset_255_259(String BF_ledger1_No , String Bf_ledger1) {
    	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'"+BF_ledger1_No+"')]"));
    	String led = ele1.getText();
    	WebElement ele2=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'"+BF_ledger1_No+"')]/following-sibling::td[1]/a"));
    	String led_text = ele2.getText();
    	String actualledger1=led+"   "+led_text;
    	System.out.println(actualledger1);
    	String expectedledger1 = Bf_ledger1;
    	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
    	Reporter.log("ledger1 code verified: "+actualledger1);
    	
    	WebElement ele3=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'1420')]"));
    	String led2 = ele3.getText();
    	WebElement ele4=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'1420')]/following-sibling::td[1]/a"));
    	String led_text1 = ele4.getText();
    	String actualledger11=led2+"   "+led_text1;
    	System.out.println(actualledger11);
    	String expectedledger11 = expected_entry1.get(4);
    	Assert.assertEquals(actualledger11.trim().replaceAll("-", " "), expectedledger11.replaceAll("-"," ").trim());
    	Reporter.log("ledger1 code verified: "+actualledger11);
    	
    	double amount2 = 0.00;
    	for (int i = 0; i < amt1.size()-1; i++) {
    		double amt11 = Double.parseDouble(amt1.get(i));
    		amount2=amount2+amt11;
		}
        List<WebElement> amounts = m_Driver.findElements(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'')]/following-sibling::td[5]//a"));
        for (int j = 0; j < amounts.size()-2; j++) {
			WebElement amount1 = amounts.get(j);	
			String[] z = amount1.getText().split("", 3);
	        if (z[0].equals("(")) {
	        	Assert.assertEquals(amount1.getText().replaceAll(",", "").substring(2,9), String.format("%.2f",amount2));
	        	Reporter.log("entered Credit Amount verified: "+amount1.getText());
	    	} else {
	    	Assert.assertEquals(amount1.getText().substring(1).replaceAll(",", ""), String.format("%.2f",amount2));
	    	Reporter.log("Amount forwarded in next year verified: "+amount1.getText());
	    	}
	        //Reporter.log("Amount enter verified: "+amount1.getText());
	        sl.ScrollToElement(m_Driver, ele1);
		}
        Reporter.log("Enteries are Verified on TrialBalance Report page :", true);
   }
    public void verify_TrialBalance_Bf_FixedAsset_260_264(String BF_ledger1_No , String Bf_ledger1) {
    	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'"+BF_ledger1_No+"')]"));
    	String led = ele1.getText();
    	WebElement ele2=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'"+BF_ledger1_No+"')]/following-sibling::td[1]/a"));
    	String led_text = ele2.getText();
    	String actualledger1=led+"   "+led_text;
    	System.out.println(actualledger1);
    	String expectedledger1 = Bf_ledger1;
    	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
    	Reporter.log("ledger1 code verified: "+actualledger1);
    	
    	WebElement ele3=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'1420')]"));
    	String led2 = ele3.getText();
    	WebElement ele4=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'1420')]/following-sibling::td[1]/a"));
    	String led_text1 = ele4.getText();
    	String actualledger11=led2+"   "+led_text1;
    	System.out.println(actualledger11);
    	String expectedledger11 = expected_entry1.get(4);
    	Assert.assertEquals(actualledger11.trim().replaceAll("-", " "), expectedledger11.replaceAll("-"," ").trim());
    	Reporter.log("ledger1 code verified: "+actualledger11);
    	
    	double amount2 = 0.00;
    	for (int i = 0; i < amt1.size()-1; i++) {
    		double amt11 = Double.parseDouble(amt1.get(i));
    		amount2=amount2+amt11;
		}
        List<WebElement> amounts = m_Driver.findElements(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'')]/following-sibling::td[5]//a"));
        for (int j = 0; j < amounts.size()-2; j++) {
			WebElement amount1 = amounts.get(j);	
			String[] z = amount1.getText().split("", 3);
	        if (z[0].equals("(")) {
	        	Assert.assertEquals(amount1.getText().replaceAll(",", "").substring(2,9), String.format("%.2f",amount2));
	        	Reporter.log("entered Credit Amount verified: "+amount1.getText());
	    	} else {
	    	Assert.assertEquals(amount1.getText().substring(1).replaceAll(",", ""), String.format("%.2f",amount2));
	    	Reporter.log("Amount forwarded in next year verified: "+amount1.getText());
	    	}
	        //Reporter.log("Amount enter verified: "+amount1.getText());
	        sl.ScrollToElement(m_Driver, ele1);
		}
        Reporter.log("Enteries are Verified on TrialBalance Report page :", true);
   }
    public void verify_TrialBalance_Bf_FixedAsset_265_269(String BF_ledger1_No , String Bf_ledger1) {
    	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'"+BF_ledger1_No+"')]"));
    	String led = ele1.getText();
    	WebElement ele2=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'"+BF_ledger1_No+"')]/following-sibling::td[1]/a"));
    	String led_text = ele2.getText();
    	String actualledger1=led+"   "+led_text;
    	System.out.println(actualledger1);
    	String expectedledger1 = Bf_ledger1;
    	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
    	Reporter.log("ledger1 code verified: "+actualledger1);
    	
    	WebElement ele3=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'1420')]"));
    	String led2 = ele3.getText();
    	WebElement ele4=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'1420')]/following-sibling::td[1]/a"));
    	String led_text1 = ele4.getText();
    	String actualledger11=led2+"   "+led_text1;
    	System.out.println(actualledger11);
    	String expectedledger11 = expected_entry1.get(4);
    	Assert.assertEquals(actualledger11.trim().replaceAll("-", " "), expectedledger11.replaceAll("-"," ").trim());
    	Reporter.log("ledger1 code verified: "+actualledger11);
    	
    	double amount2 = 0.00;
    	for (int i = 0; i < amt1.size()-1; i++) {
    		double amt11 = Double.parseDouble(amt1.get(i));
    		amount2=amount2+amt11;
		}
        List<WebElement> amounts = m_Driver.findElements(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'')]/following-sibling::td[5]//a"));
        for (int j = 0; j < amounts.size()-2; j++) {
			WebElement amount1 = amounts.get(j);	
			String[] z = amount1.getText().split("", 3);
	        if (z[0].equals("(")) {
	        	Assert.assertEquals(amount1.getText().replaceAll(",", "").substring(2,9), String.format("%.2f",amount2));
	        	Reporter.log("entered Credit Amount verified: "+amount1.getText());
	    	} else {
	    	Assert.assertEquals(amount1.getText().substring(1).replaceAll(",", ""), String.format("%.2f",amount2));
	    	Reporter.log("Amount forwarded in next year verified: "+amount1.getText());
	    	}
	        //Reporter.log("Amount enter verified: "+amount1.getText());
	        sl.ScrollToElement(m_Driver, ele1);
		}
        Reporter.log("Enteries are Verified on TrialBalance Report page :", true);
   }
    public void verify_TrialBalance_Bf_FixedAsset_270_274(String BF_ledger1_No , String Bf_ledger1) {
    	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'"+BF_ledger1_No+"')]"));
    	String led = ele1.getText();
    	WebElement ele2=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'"+BF_ledger1_No+"')]/following-sibling::td[1]/a"));
    	String led_text = ele2.getText();
    	String actualledger1=led+"   "+led_text;
    	System.out.println(actualledger1);
    	String expectedledger1 = Bf_ledger1;
    	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
    	Reporter.log("ledger1 code verified: "+actualledger1);
    	
    	WebElement ele3=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'1420')]"));
    	String led2 = ele3.getText();
    	WebElement ele4=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'1420')]/following-sibling::td[1]/a"));
    	String led_text1 = ele4.getText();
    	String actualledger11=led2+"   "+led_text1;
    	System.out.println(actualledger11);
    	String expectedledger11 = expected_entry1.get(4);
    	Assert.assertEquals(actualledger11.trim().replaceAll("-", " "), expectedledger11.replaceAll("-"," ").trim());
    	Reporter.log("ledger1 code verified: "+actualledger11);
    	
    	double amount2 = 0.00;
    	for (int i = 0; i < amt1.size()-1; i++) {
    		double amt11 = Double.parseDouble(amt1.get(i));
    		amount2=amount2+amt11;
		}
        List<WebElement> amounts = m_Driver.findElements(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'')]/following-sibling::td[5]//a"));
        for (int j = 0; j < amounts.size()-2; j++) {
			WebElement amount1 = amounts.get(j);	
			String[] z = amount1.getText().split("", 3);
	        if (z[0].equals("(")) {
	        	Assert.assertEquals(amount1.getText().replaceAll(",", "").substring(2,9), String.format("%.2f",amount2));
	        	Reporter.log("entered Credit Amount verified: "+amount1.getText());
	    	} else {
	    	Assert.assertEquals(amount1.getText().substring(1).replaceAll(",", ""), String.format("%.2f",amount2));
	    	Reporter.log("Amount forwarded in next year verified: "+amount1.getText());
	    	}
	        //Reporter.log("Amount enter verified: "+amount1.getText());
	        sl.ScrollToElement(m_Driver, ele1);
		}
        Reporter.log("Enteries are Verified on TrialBalance Report page :", true);
   }
    public void verify_TrialBalance_Bf_FixedAsset_275_279(String BF_ledger1_No , String Bf_ledger1) {
    	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'"+BF_ledger1_No+"')]"));
    	String led = ele1.getText();
    	WebElement ele2=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'"+BF_ledger1_No+"')]/following-sibling::td[1]/a"));
    	String led_text = ele2.getText();
    	String actualledger1=led+"   "+led_text;
    	System.out.println(actualledger1);
    	String expectedledger1 = Bf_ledger1;
    	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
    	Reporter.log("ledger1 code verified: "+actualledger1);
    	
    	WebElement ele3=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'1420')]"));
    	String led2 = ele3.getText();
    	WebElement ele4=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'1420')]/following-sibling::td[1]/a"));
    	String led_text1 = ele4.getText();
    	String actualledger11=led2+"   "+led_text1;
    	System.out.println(actualledger11);
    	String expectedledger11 = expected_entry1.get(4);
    	Assert.assertEquals(actualledger11.trim().replaceAll("-", " "), expectedledger11.replaceAll("-"," ").trim());
    	Reporter.log("ledger1 code verified: "+actualledger11);
    	
    	double amount2 = 0.00;
    	for (int i = 0; i < amt1.size()-1; i++) {
    		double amt11 = Double.parseDouble(amt1.get(i));
    		amount2=amount2+amt11;
		}
        List<WebElement> amounts = m_Driver.findElements(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'')]/following-sibling::td[5]//a"));
        for (int j = 0; j < amounts.size()-2; j++) {
			WebElement amount1 = amounts.get(j);	
			String[] z = amount1.getText().split("", 3);
	        if (z[0].equals("(")) {
	        	Assert.assertEquals(amount1.getText().replaceAll(",", "").substring(2,9), String.format("%.2f",amount2));
	        	Reporter.log("entered Credit Amount verified: "+amount1.getText());
	    	} else {
	    	Assert.assertEquals(amount1.getText().substring(1).replaceAll(",", ""), String.format("%.2f",amount2));
	    	Reporter.log("Amount forwarded in next year verified: "+amount1.getText());
	    	}
	        //Reporter.log("Amount enter verified: "+amount1.getText());
	        sl.ScrollToElement(m_Driver, ele1);
		}
        Reporter.log("Enteries are Verified on TrialBalance Report page :", true);
   }
    public void verify_TrialBalance_Bf_FixedAsset_280_284(String BF_ledger1_No , String Bf_ledger1) {
    	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'"+BF_ledger1_No+"')]"));
    	String led = ele1.getText();
    	WebElement ele2=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'"+BF_ledger1_No+"')]/following-sibling::td[1]/a"));
    	String led_text = ele2.getText();
    	String actualledger1=led+"   "+led_text;
    	System.out.println(actualledger1);
    	String expectedledger1 = Bf_ledger1;
    	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
    	Reporter.log("ledger1 code verified: "+actualledger1);
    	
    	WebElement ele3=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'1420')]"));
    	String led2 = ele3.getText();
    	WebElement ele4=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'1420')]/following-sibling::td[1]/a"));
    	String led_text1 = ele4.getText();
    	String actualledger11=led2+"   "+led_text1;
    	System.out.println(actualledger11);
    	String expectedledger11 = expected_entry1.get(4);
    	Assert.assertEquals(actualledger11.trim().replaceAll("-", " "), expectedledger11.replaceAll("-"," ").trim());
    	Reporter.log("ledger1 code verified: "+actualledger11);
    	
    	double amount2 = 0.00;
    	for (int i = 0; i < amt1.size()-1; i++) {
    		double amt11 = Double.parseDouble(amt1.get(i));
    		amount2=amount2+amt11;
		}
        List<WebElement> amounts = m_Driver.findElements(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'')]/following-sibling::td[5]//a"));
        for (int j = 0; j < amounts.size()-2; j++) {
			WebElement amount1 = amounts.get(j);	
			String[] z = amount1.getText().split("", 3);
	        if (z[0].equals("(")) {
	        	Assert.assertEquals(amount1.getText().replaceAll(",", "").substring(2,9), String.format("%.2f",amount2));
	        	Reporter.log("entered Credit Amount verified: "+amount1.getText());
	    	} else {
	    	Assert.assertEquals(amount1.getText().substring(1).replaceAll(",", ""), String.format("%.2f",amount2));
	    	Reporter.log("Amount forwarded in next year verified: "+amount1.getText());
	    	}
	        //Reporter.log("Amount enter verified: "+amount1.getText());
	        sl.ScrollToElement(m_Driver, ele1);
		}
        Reporter.log("Enteries are Verified on TrialBalance Report page :", true);
   }
    public void verify_TrialBalance_Bf_FixedAsset_285_289(String BF_ledger1_No , String Bf_ledger1) {
    	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'"+BF_ledger1_No+"')]"));
    	String led = ele1.getText();
    	WebElement ele2=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'"+BF_ledger1_No+"')]/following-sibling::td[1]/a"));
    	String led_text = ele2.getText();
    	String actualledger1=led+"   "+led_text;
    	System.out.println(actualledger1);
    	String expectedledger1 = Bf_ledger1;
    	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
    	Reporter.log("ledger1 code verified: "+actualledger1);
    	
    	WebElement ele3=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'1420')]"));
    	String led2 = ele3.getText();
    	WebElement ele4=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'1420')]/following-sibling::td[1]/a"));
    	String led_text1 = ele4.getText();
    	String actualledger11=led2+"   "+led_text1;
    	System.out.println(actualledger11);
    	String expectedledger11 = expected_entry1.get(4);
    	Assert.assertEquals(actualledger11.trim().replaceAll("-", " "), expectedledger11.replaceAll("-"," ").trim());
    	Reporter.log("ledger1 code verified: "+actualledger11);
    	
    	double amount2 = 0.00;
    	for (int i = 0; i < amt1.size()-1; i++) {
    		double amt11 = Double.parseDouble(amt1.get(i));
    		amount2=amount2+amt11;
		}
        List<WebElement> amounts = m_Driver.findElements(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'')]/following-sibling::td[5]//a"));
        for (int j = 0; j < amounts.size()-2; j++) {
			WebElement amount1 = amounts.get(j);	
			String[] z = amount1.getText().split("", 3);
	        if (z[0].equals("(")) {
	        	Assert.assertEquals(amount1.getText().replaceAll(",", "").substring(2,9), String.format("%.2f",amount2));
	        	Reporter.log("entered Credit Amount verified: "+amount1.getText());
	    	} else {
	    	Assert.assertEquals(amount1.getText().substring(1).replaceAll(",", ""), String.format("%.2f",amount2));
	    	Reporter.log("Amount forwarded in next year verified: "+amount1.getText());
	    	}
	        //Reporter.log("Amount enter verified: "+amount1.getText());
	        sl.ScrollToElement(m_Driver, ele1);
		}
        Reporter.log("Enteries are Verified on TrialBalance Report page :", true);
   }
    public void verify_TrialBalance_Bf_FixedAsset_600_602(String BF_ledger1_No , String Bf_ledger1) {
    	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'"+BF_ledger1_No+"')]"));
    	String led = ele1.getText();
    	WebElement ele2=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'"+BF_ledger1_No+"')]/following-sibling::td[1]/a"));
    	String led_text = ele2.getText();
    	String actualledger1=led+"   "+led_text;
    	System.out.println(actualledger1);
    	String expectedledger1 = Bf_ledger1;
    	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
    	Reporter.log("ledger1 code verified: "+actualledger1);
    	
    	WebElement ele3=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'1420')]"));
    	String led2 = ele3.getText();
    	WebElement ele4=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'1420')]/following-sibling::td[1]/a"));
    	String led_text1 = ele4.getText();
    	String actualledger11=led2+"   "+led_text1;
    	System.out.println(actualledger11);
    	String expectedledger11 = expected_entry1.get(2);
    	Assert.assertEquals(actualledger11.trim().replaceAll("-", " "), expectedledger11.replaceAll("-"," ").trim());
    	Reporter.log("ledger1 code verified: "+actualledger11);
    	
    	double amount2 = 0.00;
    	for (int i = 0; i < amt1.size()-1; i++) {
    		double amt11 = Double.parseDouble(amt1.get(i));
    		amount2=amount2+amt11;
		}
        List<WebElement> amounts = m_Driver.findElements(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'')]/following-sibling::td[5]//a"));
        for (int j = 0; j < amounts.size()-2; j++) {
			WebElement amount1 = amounts.get(j);	
			String[] z = amount1.getText().split("", 3);
	        if (z[0].equals("(")) {
	        	Assert.assertEquals(amount1.getText().replaceAll(",", "").substring(2,9), String.format("%.2f",amount2));
	        	Reporter.log("entered Credit Amount verified: "+amount1.getText());
	    	} else {
	    	Assert.assertEquals(amount1.getText().substring(1).replaceAll(",", ""), String.format("%.2f",amount2));
	    	Reporter.log("Amount forwarded in next year verified: "+amount1.getText());
	    	}
	        //Reporter.log("Amount enter verified: "+amount1.getText());
	        sl.ScrollToElement(m_Driver, ele1);
		}
        Reporter.log("Enteries are Verified on TrialBalance Report page :", true);
   }
    public void verify_TrialBalance_Bf_FixedAsset_605_609(String BF_ledger1_No , String Bf_ledger1) {
    	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'"+BF_ledger1_No+"')]"));
    	String led = ele1.getText();
    	WebElement ele2=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'"+BF_ledger1_No+"')]/following-sibling::td[1]/a"));
    	String led_text = ele2.getText();
    	String actualledger1=led+"   "+led_text;
    	System.out.println(actualledger1);
    	String expectedledger1 = Bf_ledger1;
    	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
    	Reporter.log("ledger1 code verified: "+actualledger1);
    	
    	WebElement ele3=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'1420')]"));
    	String led2 = ele3.getText();
    	WebElement ele4=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'1420')]/following-sibling::td[1]/a"));
    	String led_text1 = ele4.getText();
    	String actualledger11=led2+"   "+led_text1;
    	System.out.println(actualledger11);
    	String expectedledger11 = expected_entry1.get(3);
    	Assert.assertEquals(actualledger11.trim().replaceAll("-", " "), expectedledger11.replaceAll("-"," ").trim());
    	Reporter.log("ledger1 code verified: "+actualledger11);
    	
    	double amount2 = 0.00;
    	for (int i = 0; i < amt1.size()-1; i++) {
    		double amt11 = Double.parseDouble(amt1.get(i));
    		amount2=amount2+amt11;
		}
        List<WebElement> amounts = m_Driver.findElements(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'')]/following-sibling::td[5]//a"));
        for (int j = 0; j < amounts.size()-2; j++) {
			WebElement amount1 = amounts.get(j);	
			String[] z = amount1.getText().split("", 3);
	        if (z[0].equals("(")) {
	        	Assert.assertEquals(amount1.getText().replaceAll(",", "").substring(2,9), String.format("%.2f",amount2));
	        	Reporter.log("entered Credit Amount verified: "+amount1.getText());
	    	} else {
	    	Assert.assertEquals(amount1.getText().substring(1).replaceAll(",", ""), String.format("%.2f",amount2));
	    	Reporter.log("Amount forwarded in next year verified: "+amount1.getText());
	    	}
	        //Reporter.log("Amount enter verified: "+amount1.getText());
	        sl.ScrollToElement(m_Driver, ele1);
		}
        Reporter.log("Enteries are Verified on TrialBalance Report page :", true);
   }
    public void verify_TrialBalance_Bf_FixedAsset_1000_1060(String BF_ledger1_No , String Bf_ledger1) {
    	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'"+BF_ledger1_No+"')]"));
    	String led = ele1.getText();
    	WebElement ele2=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'"+BF_ledger1_No+"')]/following-sibling::td[1]/a"));
    	String led_text = ele2.getText();
    	String actualledger1=led+"   "+led_text;
    	System.out.println(actualledger1);
    	String expectedledger1 = Bf_ledger1;
    	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
    	Reporter.log("ledger1 code verified: "+actualledger1);
    	
    	WebElement ele3=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'1420')]"));
    	String led2 = ele3.getText();
    	WebElement ele4=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'1420')]/following-sibling::td[1]/a"));
    	String led_text1 = ele4.getText();
    	String actualledger11=led2+"   "+led_text1;
    	System.out.println(actualledger11);
    	String expectedledger11 = expected_entry1.get(2);
    	Assert.assertEquals(actualledger11.trim().replaceAll("-", " "), expectedledger11.replaceAll("-"," ").trim());
    	Reporter.log("ledger1 code verified: "+actualledger11);
    	
    	double amount2 = 0.00;
    	for (int i = 0; i < amt1.size()-1; i++) {
    		double amt11 = Double.parseDouble(amt1.get(i));
    		amount2=amount2+amt11;
		}
        List<WebElement> amounts = m_Driver.findElements(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'')]/following-sibling::td[5]//a"));
        for (int j = 0; j < amounts.size()-2; j++) {
			WebElement amount1 = amounts.get(j);	
			String[] z = amount1.getText().split("", 3);
	        if (z[0].equals("(")) {
	        	Assert.assertEquals(amount1.getText().replaceAll(",", "").substring(2,9), String.format("%.2f",amount2));
	        	Reporter.log("entered Credit Amount verified: "+amount1.getText());
	    	} else {
	    	Assert.assertEquals(amount1.getText().substring(1).replaceAll(",", ""), String.format("%.2f",amount2));
	    	Reporter.log("Amount forwarded in next year verified: "+amount1.getText());
	    	}
	        //Reporter.log("Amount enter verified: "+amount1.getText());
	        sl.ScrollToElement(m_Driver, ele1);
		}
        Reporter.log("Enteries are Verified on TrialBalance Report page :", true);
   }
    
    public void verify_TrialBalance_Bf_Current_Asset_1410_1450()
    {
    	List<WebElement> elements = m_Driver.findElements(By.xpath("//table[@id='table1']/tbody[2]/tr/td[2][contains(text(),'')]/following-sibling::td[1]/a/parent::td/preceding-sibling::td[1]"));
        int size = elements.size();
        for (int i = 0; i <size-2; i++) {
        	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]"));
        	String led = ele1.getText();
        	WebElement ele2=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[1]/a"));
        	String led_text = ele2.getText();
        	String actualledger1=led+"   "+led_text;
        	System.out.println(actualledger1);
        	String expectedledger1 = expected_entry1.get(i);
        	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
        	Reporter.log("ledger1 code verified: "+actualledger1);
        	
        	WebElement amount=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[5]/span/a"));
        	String xx = amount.getText();
        	String yy = amt1.get(i)+".00";
        	System.out.println(xx);
        	System.out.println(yy);
        	String[] z = amount.getText().split("", 3);
        	if (z[0].equals("(")) {
        		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(2,9), yy);
    		} else {
    			Assert.assertEquals(amount.getText().substring(1).replaceAll(",", ""), yy);
    		}
        	Reporter.log("Amount enter verified: "+amount.getText());
        	sl.ScrollToElement(m_Driver, ele1);
	}
        Reporter.log("Enteries are Verified on TrialBalance Report page :", true);
}
    public void verify_TrialBalance_Bf_Customer_1070(String retainedledger)
    {
    	List<WebElement> elements = m_Driver.findElements(By.xpath("//table[@id='table1']/tbody[2]/tr/td[2][contains(text(),'')]/following-sibling::td[1]/a/parent::td/preceding-sibling::td[1]"));
        int size = elements.size();
        for (int i = 0; i <size-1; i++) {
        	if(i==0) {
        	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+3100+"')]"));
        	String led = ele1.getText();
        	WebElement ele2=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+3100+"')]/following-sibling::td[1]/a"));
        	String led_text = ele2.getText();
        	String actualledger1=led+"   "+led_text;
        	System.out.println(actualledger1);
        	String expectedledger1 = retainedledger;
        	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
        	Reporter.log("ledger1 code verified: "+actualledger1);
        	
        	WebElement amount=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+3100+"')]/following-sibling::td[5]/span/a"));
        	String xx = amount.getText();
        	String yy = amt1.get(i)+".00";
        	System.out.println(xx);
        	System.out.println(yy);
        	String[] z = amount.getText().split("", 3);
        	if (z[0].equals("(")) {
        		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(2,9), yy);
    		} else {
    			Assert.assertEquals(amount.getText().substring(1).replaceAll(",", ""), yy);
    		}
        	Reporter.log("Amount enter verified: "+amount.getText());
        	sl.ScrollToElement(m_Driver, ele1);
        	}
        	else {
        		WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]"));
            	String led = ele1.getText();
            	WebElement ele2=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[1]/a"));
            	String led_text = ele2.getText();
            	String actualledger1=led+"   "+led_text;
            	System.out.println(actualledger1);
            	String expectedledger1 = expected_entry1.get(i);
            	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
            	Reporter.log("ledger1 code verified: "+actualledger1);
            	
            	WebElement amount=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[5]/span/a"));
            	String xx = amount.getText();
            	String yy = amt1.get(i)+".00";
            	System.out.println(xx);
            	System.out.println(yy);
            	String[] z = amount.getText().split("", 3);
            	if (z[0].equals("(")) {
            		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(2,9), yy);
        		} else {
        			Assert.assertEquals(amount.getText().substring(1).replaceAll(",", ""), yy);
        		}
            	Reporter.log("Amount enter verified: "+amount.getText());
            	sl.ScrollToElement(m_Driver, ele1);
            	}
        	}
        Reporter.log("Enteries are Verified on TrialBalance Report page :", true);
}
    public void verify_TrialBalance_Bf_Payment_Type_1071_1073()
    {
    	List<WebElement> elements = m_Driver.findElements(By.xpath("//table[@id='table1']/tbody[2]/tr/td[2][contains(text(),'')]/following-sibling::td[1]/a/parent::td/preceding-sibling::td[1]"));
        int size = elements.size();
        for (int i = 0; i <size-2; i++) {
        	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]"));
        	String led = ele1.getText();
        	WebElement ele2=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[1]/a"));
        	String led_text = ele2.getText();
        	String actualledger1=led+"   "+led_text;
        	System.out.println(actualledger1);
        	String expectedledger1 = expected_entry1.get(i);
        	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
        	Reporter.log("ledger1 code verified: "+actualledger1);
        	
        	WebElement amount=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[5]/span/a"));
        	String xx = amount.getText();
        	String yy = amt1.get(i)+".00";
        	System.out.println(xx);
        	System.out.println(yy);
        	String[] z = amount.getText().split("", 3);
        	if (z[0].equals("(")) {
        		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(2,9), yy);
    		} else {
    			Assert.assertEquals(amount.getText().substring(1).replaceAll(",", ""), yy);
    		}
        	Reporter.log("Amount enter verified: "+amount.getText());
        	sl.ScrollToElement(m_Driver, ele1);
	}
        Reporter.log("Enteries are Verified on TrialBalance Report page :", true);
}
    public void verify_TrialBalance_Bf_Taxation109091110102()
    {
    	List<WebElement> elements = m_Driver.findElements(By.xpath("//table[@id='table1']/tbody[2]/tr/td[2][contains(text(),'')]/following-sibling::td[1]/a/parent::td/preceding-sibling::td[1]"));
        int size = elements.size();
        for (int i = 0; i <size-2; i++) {
        	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]"));
        	String led = ele1.getText();
        	WebElement ele2=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[1]/a"));
        	String led_text = ele2.getText();
        	String actualledger1=led+"   "+led_text;
        	System.out.println(actualledger1);
        	String expectedledger1 = expected_entry1.get(i);
        	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
        	Reporter.log("ledger1 code verified: "+actualledger1);
        	
        	WebElement amount=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[5]/span/a"));
        	String xx = amount.getText();
        	String yy = amt1.get(i)+".00";
        	System.out.println(xx);
        	System.out.println(yy);
        	String[] z = amount.getText().split("", 3);
        	if (z[0].equals("(")) {
        		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(2,9), yy);
    		} else {
    			Assert.assertEquals(amount.getText().substring(1).replaceAll(",", ""), yy);
    		}
        	Reporter.log("Amount enter verified: "+amount.getText());
        	sl.ScrollToElement(m_Driver, ele1);
	}
        Reporter.log("Enteries are Verified on TrialBalance Report page :", true);
}
    public void verify_TrialBalance_Bf_Taxation_1103_1104(String ledger1no_1 , String Bf_ledger11, String ledger1no_2,  String Bf_ledger12,String unitprice,String quantity ,String GrossBill) {
    	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'"+ledger1no_1+"')]"));
    	String led = ele1.getText();
    	WebElement ele2=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'"+ledger1no_1+"')]/following-sibling::td[1]/a"));
    	String led_text = ele2.getText();
    	String actualledger1=led+"   "+led_text;
    	System.out.println(actualledger1);
    	String expectedledger1 = Bf_ledger11;
    	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
    	//Reporter.log("ledger1 code verified: "+actualledger1);
    	Reporter.log("ledger1 code verified: "+actualledger1, true);
    	
    	WebElement ele3=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'"+ledger1no_2+"')]"));
    	String led2 = ele3.getText();
    	WebElement ele4=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'"+ledger1no_2+"')]/following-sibling::td[1]/a"));
    	String led_text1 = ele4.getText();
    	String actualledger11=led2+"   "+led_text1;
    	System.out.println(actualledger11);
    	String expectedledger11 = Bf_ledger12;
    	Assert.assertEquals(actualledger11.trim().replaceAll("-", " "), expectedledger11.replaceAll("-"," ").trim());
    	Reporter.log("ledger1 code verified: "+actualledger11, true);
    	 d1= Double.parseDouble(unitprice);
         i1 = Integer.parseInt(quantity);
         total = d1*i1;
         vat = ((d1*i1)*STDrate);
         
         d1= Double.parseDouble(GrossBill);//1000
         double netamt1 = ((d1*100)/120);
         double vat1 = d1-netamt1;
         
        List<WebElement> amounts = m_Driver.findElements(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'')]/following-sibling::td[5]//a"));
        for (int j = 2; j < amounts.size()-2; j++) {
        	if (j==2) {
        		WebElement amount1 = amounts.get(j);	
    			//String[] z = amount1.getText().split("", 3);
    			Assert.assertEquals(amount1.getText().substring(1).replaceAll(",", ""), String.format("%.2f",vat1));
    	    	Reporter.log("Deffered input Vat amount verified: "+amount1.getText());
			}
			
	        if (j==3) {
	        	WebElement amount1 = amounts.get(j);
	        	Assert.assertEquals(amount1.getText().replaceAll(",", "").substring(2,8), String.format("%.2f",vat));
	        	Reporter.log("Deffered output Vat Amount verified: "+amount1.getText());
	    	} 
	        //Reporter.log("Amount enter verified: "+amount1.getText());
	        //sl.ScrollToElement(m_Driver, ele1);
		}
        Reporter.log("Enteries are Verified on TrialBalance Report page :", true);
   }
    public void verify_TrialBalance_Bf_Debtor_1300_1339()
    {
    	List<WebElement> elements = m_Driver.findElements(By.xpath("//table[@id='table1']/tbody[2]/tr/td[2][contains(text(),'')]/following-sibling::td[1]/a/parent::td/preceding-sibling::td[1]"));
        int size = elements.size();
        for (int i = 0; i <size-2; i++) {
        	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]"));
        	String led = ele1.getText();
        	WebElement ele2=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[1]/a"));
        	String led_text = ele2.getText();
        	String actualledger1=led+"   "+led_text;
        	System.out.println(actualledger1);
        	String expectedledger1 = expected_entry1.get(i);
        	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
        	Reporter.log("ledger1 code verified: "+actualledger1);
        	
        	WebElement amount=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[5]/span/a"));
        	String xx = amount.getText();
        	String yy = amt1.get(i)+".00";
        	System.out.println(xx);
        	System.out.println(yy);
        	String[] z = amount.getText().split("", 3);
        	if (z[0].equals("(")) {
        		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(2,9), yy);
    		} else {
    			Assert.assertEquals(amount.getText().substring(1).replaceAll(",", ""), yy);
    		}
        	Reporter.log("Amount enter verified: "+amount.getText());
        	sl.ScrollToElement(m_Driver, ele1);
	}
        Reporter.log("Enteries are Verified on TrialBalance Report page :", true);
}
    public void verify_TrialBalance_Bf_Debtor_1401to1420_1092()
    {
    	List<WebElement> elements = m_Driver.findElements(By.xpath("//table[@id='table1']/tbody[2]/tr/td[2][contains(text(),'')]/following-sibling::td[1]/a/parent::td/preceding-sibling::td[1]"));
        int size = elements.size();
        for (int i = 0; i <size-2; i++) {
        	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]"));
        	String led = ele1.getText();
        	WebElement ele2=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[1]/a"));
        	String led_text = ele2.getText();
        	String actualledger1=led+"   "+led_text;
        	System.out.println(actualledger1);
        	String expectedledger1 = expected_entry1.get(i);
        	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
        	Reporter.log("ledger1 code verified: "+actualledger1);
        	
        	WebElement amount=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[5]/span/a"));
        	String xx = amount.getText();
        	String yy = amt1.get(i)+".00";
        	System.out.println(xx);
        	System.out.println(yy);
        	String[] z = amount.getText().split("", 3);
        	if (z[0].equals("(")) {
        		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(2,9), yy);
    		} else {
    			Assert.assertEquals(amount.getText().substring(1).replaceAll(",", ""), yy);
    		}
        	Reporter.log("Amount enter verified: "+amount.getText());
        	sl.ScrollToElement(m_Driver, ele1);
	}
        Reporter.log("Enteries are Verified on TrialBalance Report page :", true);
}
    public void verify_TrialBalance_Bf_Director_1321() {
    	
    	String[] ledger2= {"1321","1321","1321","1321","1321"};
    	List<WebElement> elements = m_Driver.findElements(By.xpath("//table[@id='table1']/tbody[2]/tr/td[2][contains(text(),'')]/following-sibling::td[1]/a/parent::td/preceding-sibling::td[1]"));
        int size = elements.size();
        for (int i = 0; i <size-3; i++) {
        	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger2[i]+"')]"));
        	String led = ele1.getText();
        	int j=i+1;
        	 
        	if (i==0 || i==5) {
        		WebElement ele2 = m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger2[i]+"')]/following-sibling::td[1]/a"));
        		String led_text = ele2.getText();
            	String actualledger1=led+"   "+led_text;
            	System.out.println(actualledger1);
            	String expectedledger1 = expected_entry1.get(i);
            	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
            	Reporter.log("ledger1 code verified: "+actualledger1);
			} else {
				WebElement ele2 = m_Driver.findElement(By.xpath("(//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger2[i]+"')]/following-sibling::td[1]/a)["+j+"]"));
				String led_text = ele2.getText();
            	String actualledger1=led+"  "+led_text;
            	System.out.println(actualledger1);
            	String expectedledger1 = expected_entry1.get(i).replace("- Default director -", "");
            	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
            	Reporter.log("ledger1 code verified: "+actualledger1);

			}
        	
        	
        	if (i==5) {
        		WebElement amount=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger2[i]+"')]/following-sibling::td[5]//a"));
	        	String xx = amount.getText();
	        	String yy = amt1.get(i)+".00";
	        	System.out.println(xx);
	        	System.out.println(yy);
	        	String[] z = amount.getText().split("", 3);
	        	if (z[0].equals("(")) {
	        		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(2,9), yy);
	    		} else {
	    			Assert.assertEquals(amount.getText().substring(1).replaceAll(",", ""), yy);
	    		}
	        	Reporter.log("Amount enter verified: "+amount.getText());
	        	sl.ScrollToElement(m_Driver, ele1);	
				
			} else {
				WebElement amount = m_Driver.findElement(By.xpath("(//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger2[i]+"')]/following-sibling::td[5]//a)["+j+"]"));
				String xx = amount.getText();
	        	String yy = amt1.get(i)+".00";
	        	System.out.println(xx);
	        	System.out.println(yy);
	        	String[] z = amount.getText().split("", 3);
	        	if (z[0].equals("(")) {
	        		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(2,9), yy);
	    		} else {
	    			Assert.assertEquals(amount.getText().substring(1).replaceAll(",", ""), yy);
	    		}
	        	Reporter.log("Amount enter verified: "+amount.getText());
	        	sl.ScrollToElement(m_Driver, ele1);	

			}
        	
    	}
        Reporter.log("Enteries are Verified on TrialBalance Report page :", true);
   }
    public void verify_TrialBalance_Bf_Employee_1322() {
    	
    	String[] ledger2= {"1322","1322","1322","1322","1322"};
    	List<WebElement> elements = m_Driver.findElements(By.xpath("//table[@id='table1']/tbody[2]/tr/td[2][contains(text(),'')]/following-sibling::td[1]/a/parent::td/preceding-sibling::td[1]"));
        int size = elements.size();
        for (int i = 0; i <size-3; i++) {
        	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger2[i]+"')]"));
        	String led = ele1.getText();
        	int j=i+1;
        	 
        	if (i==0) {
        		WebElement ele2 = m_Driver.findElement(By.xpath("(//div/div/div/table/tbody/tr/td[contains(text(),'1322')]/following-sibling::td[1]/a)[2]"));
        		String led_text = ele2.getText();
            	String actualledger1=led+"   "+led_text;
            	//System.out.println(actualledger1);
            	String expectedledger1 = expected_entry1.get(0);
            	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
            	Reporter.log("ledger1 code verified: "+actualledger1,true);
			}else if (i==1) {
				WebElement ele2 = m_Driver.findElement(By.xpath("(//div/div/div/table/tbody/tr/td[contains(text(),'1322')]/following-sibling::td[1]/a)[1]"));
        		String led_text = ele2.getText();
            	String actualledger1=led+"   "+led_text;
            	//System.out.println(actualledger1);
            	String expectedledger1 = expected_entry1.get(1).replace("- Default employee -", " ");
            	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
            	Reporter.log("ledger1 code verified: "+actualledger1,true);
			}
			else if (i==4) {
				WebElement ele2 = m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'2080')]/following-sibling::td[1]/a"));
        		String led_text = ele2.getText();
            	String actualledger1=led+"   "+led_text;
            	//System.out.println(actualledger1);
            	String expectedledger1 = expected_entry1.get(4).replace("- Default employee -", " ");
            	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
            	Reporter.log("ledger1 code verified: "+actualledger1,true);
			}
        	else {
				WebElement ele2 = m_Driver.findElement(By.xpath("(//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger2[i]+"')]/following-sibling::td[1]/a)["+j+"]"));
				String led_text = ele2.getText();
            	String actualledger1=led+"   "+led_text;
            	//System.out.println(actualledger1);
            	String expectedledger1 = expected_entry1.get(i).replace("- Default employee -", " ");
            	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
            	Reporter.log("ledger1 code verified: "+actualledger1,true);

			}
        	
        	
        	if (i==5) {
        		WebElement amount=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger2[i]+"')]/following-sibling::td[5]//a"));
	        	String xx = amount.getText();
	        	String yy = amt1.get(i)+".00";
	        	//System.out.println(xx);
	        	//System.out.println(yy);
	        	String[] z = amount.getText().split("", 3);
	        	if (z[0].equals("(")) {
	        		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(2,9), yy);
	    		} else {
	    			Assert.assertEquals(amount.getText().substring(1).replaceAll(",", ""), yy);
	    		}
	        	Reporter.log("Amount enter verified: "+amount.getText(),true);
	        	sl.ScrollToElement(m_Driver, ele1);	
				
			}else if (i==0) {
				WebElement amount = m_Driver.findElement(By.xpath("(//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger2[i]+"')]/following-sibling::td[5]//a)[2]"));
				String xx = amount.getText();
	        	String yy = amt1.get(i)+".00";
	        	//System.out.println(xx);
	        	//System.out.println(yy);
	        	String[] z = amount.getText().split("", 3);
	        	if (z[0].equals("(")) {
	        		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(2,9), yy);
	    		} else {
	    			Assert.assertEquals(amount.getText().substring(1).replaceAll(",", ""), yy);
	    		}
	        	Reporter.log("Amount enter verified: "+amount.getText(), true);
	        	sl.ScrollToElement(m_Driver, ele1);	
			} 
			else if (i==1) {
				WebElement amount = m_Driver.findElement(By.xpath("(//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger2[i]+"')]/following-sibling::td[5]//a)[1]"));
				String xx = amount.getText();
	        	String yy = amt1.get(i)+".00";
	        	//System.out.println(xx);
	        	//System.out.println(yy);
	        	String[] z = amount.getText().split("", 3);
	        	if (z[0].equals("(")) {
	        		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(2,9), yy);
	    		} else {
	    			Assert.assertEquals(amount.getText().substring(1).replaceAll(",", ""), yy);
	    		}
	        	Reporter.log("Amount enter verified: "+amount.getText(), true);
	        	sl.ScrollToElement(m_Driver, ele1);	
			}
			else if (i==4) {
				WebElement amount = m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'2080')]/following-sibling::td[5]//a"));
				String xx = amount.getText();
	        	String yy = amt1.get(i)+".00";
	        	//System.out.println(xx);
	        	//System.out.println(yy);
	        	String[] z = amount.getText().split("", 3);
	        	if (z[0].equals("(")) {
	        		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(2,9), yy);
	    		} else {
	    			Assert.assertEquals(amount.getText().substring(1).replaceAll(",", ""), yy);
	    		}
	        	Reporter.log("Amount enter verified: "+amount.getText(), true);
	        	sl.ScrollToElement(m_Driver, ele1);	
			}else {
				WebElement amount = m_Driver.findElement(By.xpath("(//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger2[i]+"')]/following-sibling::td[5]//a)["+j+"]"));
				String xx = amount.getText();
	        	String yy = amt1.get(i)+".00";
	        	//System.out.println(xx);
	        	//System.out.println(yy);
	        	String[] z = amount.getText().split("", 3);
	        	if (z[0].equals("(")) {
	        		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(2,9), yy);
	    		} else {
	    			Assert.assertEquals(amount.getText().substring(1).replaceAll(",", ""), yy);
	    		}
	        	Reporter.log("Amount enter verified: "+amount.getText(), true);
	        	sl.ScrollToElement(m_Driver, ele1);	

			}
        	
    	}
        Reporter.log("Enteries are Verified on TrialBalance Report page :", true);
   }
    public void verify_TrialBalance_Bf_Bank_1400(String ledger_no,String ledger,String amt)
    {
        	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger_no+"')]"));
        	String led = ele1.getText();
        	WebElement ele2=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger_no+"')]/following-sibling::td[1]/a"));
        	String led_text = ele2.getText();
        	String actualledger1=led+"   "+led_text;
        	System.out.println(actualledger1);
        	String expectedledger1 = ledger;
        	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
        	Reporter.log("ledger1 code verified: "+actualledger1);
        	
        	WebElement amount=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger_no+"')]/following-sibling::td[5]/span/a"));
        	//String xx = amount.getText();
        	String expAmt = amt+".00";
        	String[] z = amount.getText().split("", 3);
        	if (z[0].equals("(")) {
        		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(2,9), expAmt);
    		} else {
    			Assert.assertEquals(amount.getText().substring(1).replaceAll(",", ""), expAmt);
    		}
        	Reporter.log("Amount enter verified: "+amount.getText());
        	//sl.ScrollToElement(m_Driver, ele1);
	
        Reporter.log("Enteries are Verified on TrialBalance Report page :", true);
}
    public void verify_TrialBalance_Bf_Creditorduewithinyear2000_2070()
    {
    	List<WebElement> elements = m_Driver.findElements(By.xpath("//table[@id='table1']/tbody[2]/tr/td[2][contains(text(),'')]/following-sibling::td[1]/a/parent::td/preceding-sibling::td[1]"));
        int size = elements.size();
        for (int i = 0; i <size-2; i++) {
        	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]"));
        	String led = ele1.getText();
        	WebElement ele2=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[1]/a"));
        	String led_text = ele2.getText();
        	String actualledger1=led+"   "+led_text;
        	System.out.println(actualledger1);
        	String expectedledger1 = expected_entry1.get(i);
        	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
        	Reporter.log("ledger1 code verified: "+actualledger1);
        	
        	WebElement amount=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[5]/span/a"));
        	String xx = amount.getText();
        	String yy = amt1.get(i)+".00";
        	System.out.println(xx);
        	System.out.println(yy);
        	String[] z = amount.getText().split("", 3);
        	if (z[0].equals("(")) {
        		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(2,9), yy);
    		} else {
    			Assert.assertEquals(amount.getText().substring(1).replaceAll(",", ""), yy);
    		}
        	Reporter.log("Amount enter verified: "+amount.getText());
        	sl.ScrollToElement(m_Driver, ele1);
	}
        Reporter.log("Enteries are Verified on TrialBalance Report page :", true);
}
    public void verify_TrialBalance_TBBfCreditorduewithinyear20802095()
    {
    	List<WebElement> elements = m_Driver.findElements(By.xpath("//table[@id='table1']/tbody[2]/tr/td[2][contains(text(),'')]/following-sibling::td[1]/a/parent::td/preceding-sibling::td[1]"));
        int size = elements.size();
        for (int i = 0; i <size-2; i++) {
        	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]"));
        	String led = ele1.getText();
        	WebElement ele2=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[1]/a"));
        	String led_text = ele2.getText();
        	String actualledger1=led+"   "+led_text;
        	System.out.println(actualledger1);
        	String expectedledger1 = expected_entry1.get(i);
        	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
        	Reporter.log("ledger1 code verified: "+actualledger1);
        	
        	WebElement amount=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[5]/span/a"));
        	String xx = amount.getText();
        	String yy = amt1.get(i)+".00";
        	System.out.println(xx);
        	System.out.println(yy);
        	String[] z = amount.getText().split("", 3);
        	if (z[0].equals("(")) {
        		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(2,9), yy);
    		} else {
    			Assert.assertEquals(amount.getText().substring(1).replaceAll(",", ""), yy);
    		}
        	Reporter.log("Amount enter verified: "+amount.getText());
        	sl.ScrollToElement(m_Driver, ele1);
	}
        Reporter.log("Enteries are Verified on TrialBalance Report page :", true);
}
    public void verify_TrialBalance_Bf_Person_1323() {
    	
    	List<WebElement> elements = m_Driver.findElements(By.xpath("//table[@id='table1']/tbody[2]/tr/td[2][contains(text(),'')]/following-sibling::td[1]/a/parent::td/preceding-sibling::td[1]"));
        int size = elements.size();
        for (int i = 0; i <size-3; i++) {
        	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'1323')]"));
        	String led = ele1.getText();
        	int j=i+1;
        	 
        	if (i==0 || i==5) {
        		WebElement ele2 = m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'1323')]/following-sibling::td[1]/a"));
        		String led_text = ele2.getText();
            	String actualledger1=led+"   "+led_text;
            	System.out.println(actualledger1);
            	String expectedledger1 = expected_entry1.get(i);
            	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
            	Reporter.log("ledger1 code verified: "+actualledger1);
			} else {
				WebElement ele2 = m_Driver.findElement(By.xpath("(//div/div/div/table/tbody/tr/td[contains(text(),'1323')]/following-sibling::td[1]/a)["+j+"]"));
				String led_text = ele2.getText();
            	String actualledger1=led+"  "+led_text;
            	System.out.println(actualledger1);
            	String expectedledger1 = expected_entry1.get(i).replace("- Ankit Rana -", "");
            	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
            	Reporter.log("ledger1 code verified: "+actualledger1);

			}
        	
        	
        	if (i==5) {
        		WebElement amount=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'1323')]/following-sibling::td[5]//a"));
	        	String xx = amount.getText();
	        	String yy = amt1.get(i)+".00";
	        	System.out.println(xx);
	        	System.out.println(yy);
	        	String[] z = amount.getText().split("", 3);
	        	if (z[0].equals("(")) {
	        		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(2,9), yy);
	    		} else {
	    			Assert.assertEquals(amount.getText().substring(1).replaceAll(",", ""), yy);
	    		}
	        	Reporter.log("Amount enter verified: "+amount.getText());
	        	sl.ScrollToElement(m_Driver, ele1);	
				
			} else {
				WebElement amount = m_Driver.findElement(By.xpath("(//div/div/div/table/tbody/tr/td[contains(text(),'1323')]/following-sibling::td[5]//a)["+j+"]"));
				String xx = amount.getText();
	        	String yy = amt1.get(i)+".00";
	        	System.out.println(xx);
	        	System.out.println(yy);
	        	String[] z = amount.getText().split("", 3);
	        	if (z[0].equals("(")) {
	        		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(2,9), yy);
	    		} else {
	    			Assert.assertEquals(amount.getText().substring(1).replaceAll(",", ""), yy);
	    		}
	        	Reporter.log("Amount enter verified: "+amount.getText());
	        	sl.ScrollToElement(m_Driver, ele1);	

			}
        	
    	}
        Reporter.log("Enteries are Verified on TrialBalance Report page :", true);
   }
    public void verify_TBBfCreditordueAfteryear2300_2330()
    {
    	List<WebElement> elements = m_Driver.findElements(By.xpath("//table[@id='table1']/tbody[2]/tr/td[2][contains(text(),'')]/following-sibling::td[1]/a/parent::td/preceding-sibling::td[1]"));
        int size = elements.size();
        for (int i = 0; i <size-2; i++) {
        	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]"));
        	String led = ele1.getText();
        	WebElement ele2=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[1]/a"));
        	String led_text = ele2.getText();
        	String actualledger1=led+"   "+led_text;
        	System.out.println(actualledger1);
        	String expectedledger1 = expected_entry1.get(i);
        	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
        	Reporter.log("ledger1 code verified: "+actualledger1);
        	
        	WebElement amount=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[5]/span/a"));
        	String xx = amount.getText();
        	String yy = amt1.get(i)+".00";
        	System.out.println(xx);
        	System.out.println(yy);
        	String[] z = amount.getText().split("", 3);
        	if (z[0].equals("(")) {
        		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(2,9), yy);
    		} else {
    			Assert.assertEquals(amount.getText().substring(1).replaceAll(",", ""), yy);
    		}
        	Reporter.log("Amount enter verified: "+amount.getText());
        	sl.ScrollToElement(m_Driver, ele1);
	}
        Reporter.log("Enteries are Verified on TrialBalance Report page :", true);
}
    public void verify_TBBfCreditordueAfteryear2331_2339()
    {
    	List<WebElement> elements = m_Driver.findElements(By.xpath("//table[@id='table1']/tbody[2]/tr/td[2][contains(text(),'')]/following-sibling::td[1]/a/parent::td/preceding-sibling::td[1]"));
        int size = elements.size();
        for (int i = 0; i <size-2; i++) {
        	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]"));
        	String led = ele1.getText();
        	WebElement ele2=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[1]/a"));
        	String led_text = ele2.getText();
        	String actualledger1=led+"   "+led_text;
        	System.out.println(actualledger1);
        	String expectedledger1 = expected_entry1.get(i);
        	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
        	Reporter.log("ledger1 code verified: "+actualledger1);
        	
        	WebElement amount=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[5]/span/a"));
        	String xx = amount.getText();
        	String yy = amt1.get(i)+".00";
        	System.out.println(xx);
        	System.out.println(yy);
        	String[] z = amount.getText().split("", 3);
        	if (z[0].equals("(")) {
        		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(2,10), yy);
    		} else {
    			Assert.assertEquals(amount.getText().substring(1).replaceAll(",", ""), yy);
    		}
        	Reporter.log("Amount enter verified: "+amount.getText());
        	sl.ScrollToElement(m_Driver, ele1);
	}
        Reporter.log("Enteries are Verified on TrialBalance Report page :", true);
}
    public void verify_TBBfSupplier2060()
    {
    	List<WebElement> elements = m_Driver.findElements(By.xpath("//table[@id='table1']/tbody[2]/tr/td[2][contains(text(),'')]/following-sibling::td[1]/a/parent::td/preceding-sibling::td[1]"));
        int size = elements.size();
        for (int i = 0; i <size-2; i++) {
        	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]"));
        	String led = ele1.getText();
        	WebElement ele2=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[1]/a"));
        	String led_text = ele2.getText();
        	String actualledger1=led+"   "+led_text;
        	System.out.println(actualledger1);
        	String expectedledger1 = expected_entry1.get(i);
        	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
        	Reporter.log("ledger1 code verified: "+actualledger1);
        	
        	WebElement amount=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[5]/span/a"));
        	String xx = amount.getText();
        	String yy = amt1.get(i)+".00";
        	System.out.println(xx);
        	System.out.println(yy);
        	String[] z = amount.getText().split("", 3);
        	if (z[0].equals("(")) {
        		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(2,9), yy);
    		} else {
    			Assert.assertEquals(amount.getText().substring(1).replaceAll(",", ""), yy);
    		}
        	Reporter.log("Amount enter verified: "+amount.getText());
        	sl.ScrollToElement(m_Driver, ele1);
	}
        Reporter.log("Enteries are Verified on TrialBalance Report page :", true);
}
    public void verify_TrialBalance_Bf_ShareCapital_605_609()
    {
    	List<WebElement> elements = m_Driver.findElements(By.xpath("//table[@id='table1']/tbody[2]/tr/td[2][contains(text(),'')]/following-sibling::td[1]/a/parent::td/preceding-sibling::td[1]"));
        int size = elements.size();
        for (int i = 0; i <size-2; i++) {
        	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]"));
        	String led = ele1.getText();
        	WebElement ele2=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[1]/a"));
        	String led_text = ele2.getText();
        	String actualledger1=led+"   "+led_text;
        	System.out.println(actualledger1);
        	String expectedledger1 = expected_entry1.get(i);
        	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
        	Reporter.log("ledger1 code verified: "+actualledger1);
        	
        	WebElement amount=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[5]/span/a"));
        	String xx = amount.getText();
        	String yy = amt1.get(i)+".00";
        	System.out.println(xx);
        	System.out.println(yy);
        	String[] z = amount.getText().split("", 3);
        	if (z[0].equals("(")) {
        		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(2,9), yy);
    		} else {
    			Assert.assertEquals(amount.getText().substring(1).replaceAll(",", ""), yy);
    		}
        	Reporter.log("Amount enter verified: "+amount.getText());
        	sl.ScrollToElement(m_Driver, ele1);
	}
        Reporter.log("Enteries are Verified on TrialBalance Report page :", true);
}
    public void verify_TrialBalance_TBBf_Provision_for_liability(String retainedcode,String retainedtext)
    {
    	List<WebElement> elements = m_Driver.findElements(By.xpath("//table[@id='table1']/tbody[2]/tr/td[2][contains(text(),'')]/following-sibling::td[1]/a/parent::td/preceding-sibling::td[1]"));
        int size = elements.size();
        for (int i = 0; i <=size-2; i++) {
        	if (i==(size-2)) {
        		WebElement ele3=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+retainedcode+"')]"));
            	String led1 = ele3.getText();
            	WebElement ele4=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+retainedcode+"')]/following-sibling::td[1]/a"));
            	String led_text1 = ele4.getText();
            	String actualledger11=led1+"   "+led_text1;
            	System.out.println(actualledger11);
            	String expectedledger11 = retainedtext;
            	Assert.assertEquals(actualledger11.trim().replaceAll("-", " "), expectedledger11.replaceAll("-"," ").trim());
            	Reporter.log("ledger1 code verified: "+actualledger11);
            	
            	WebElement amount=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+retainedcode+"')]/following-sibling::td[5]/span/a"));
            	String xx = amount.getText();
            	String yy = amt1.get(i)+".00";
            	System.out.println(xx);
            	System.out.println(yy);
            	String[] z = amount.getText().split("", 3);
            	if (z[0].equals("(")) {
            		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(2,9), yy);
        		} else {
        			Assert.assertEquals(amount.getText().substring(1).replaceAll(",", ""), yy);
        		}
            	Reporter.log("Amount enter verified: "+amount.getText());
            	sl.ScrollToElement(m_Driver, amount);
			}
        else {
        	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]"));
        	String led = ele1.getText();
        	WebElement ele2=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[1]/a"));
        	String led_text = ele2.getText();
        	String actualledger1=led+"   "+led_text;
        	System.out.println(actualledger1);
        	String expectedledger1 = expected_entry1.get(i);;
        	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
        	Reporter.log("ledger1 code verified: "+actualledger1);
        	
        	WebElement amount=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[5]/span/a"));
        	String xx = amount.getText();
        	String yy = amt1.get(i)+".00";
        	System.out.println(xx);
        	System.out.println(yy);
        	String[] z = amount.getText().split("", 3);
        	if (z[0].equals("(")) {
        		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(2,9), yy);
    		} else {
    			Assert.assertEquals(amount.getText().substring(1).replaceAll(",", ""), yy);
    		}
        	Reporter.log("Amount enter verified: "+amount.getText());
        	sl.ScrollToElement(m_Driver, amount);
        	
		}
        	
        	
	}
        Reporter.log("Enteries are Verified on TrialBalance Report page :", true);
}
    public void verify_TrialBalance_profitloss_3007_10()
    {
    	List<WebElement> elements = m_Driver.findElements(By.xpath("//table[@id='table1']/tbody[2]/tr/td[2][contains(text(),'')]/following-sibling::td[1]/a/parent::td/preceding-sibling::td[1]"));
        int size = elements.size();
        for (int i = 0; i <size-2; i++) {
        	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]"));
        	String led = ele1.getText();
        	WebElement ele2=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[1]/a"));
        	String led_text = ele2.getText();
        	String actualledger1=led+"   "+led_text;
        	System.out.println(actualledger1);
        	String expectedledger1 = expected_entry1.get(i);
        	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
        	Reporter.log("ledger1 code verified: "+actualledger1);
        	
        	WebElement amount=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1.get(i)+"')]/following-sibling::td[5]/span/a"));
        	String xx = amount.getText();
        	String yy = amt1.get(i)+".00";
        	System.out.println(xx);
        	System.out.println(yy);
        	String[] z = amount.getText().split("", 3);
        	if (z[0].equals("(")) {
        		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(2,9), yy);
    		} else {
    			Assert.assertEquals(amount.getText().substring(1).replaceAll(",", ""), yy);
    		}
        	Reporter.log("Amount enter verified: "+amount.getText());
        	sl.ScrollToElement(m_Driver, ele1);
	}
        Reporter.log("Enteries are Verified on TrialBalance Report page :", true);
}
    
    public void verify_TrialBalance_Bf_3103(String ledger1no_1 , String Bf_ledger11,String unitprice,String quantity ,String GrossBill) {
    	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'"+ledger1no_1+"')]"));
    	String led = ele1.getText();
    	WebElement ele2=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'"+ledger1no_1+"')]/following-sibling::td[1]/a"));
    	String led_text = ele2.getText();
    	String actualledger1=led+"   "+led_text;
    	System.out.println(actualledger1);
    	String expectedledger1 = Bf_ledger11;
    	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
    	//Reporter.log("ledger1 code verified: "+actualledger1);
    	Reporter.log("ledger1 code verified: "+actualledger1, true);
    
    	 d1= Double.parseDouble(unitprice);
         i1 = Integer.parseInt(quantity);
         total = d1*i1;
         vat = ((d1*i1)*STDrate);
         //total2= total+vat;
         
         d1= Double.parseDouble(GrossBill);//1000
         double netamt1 = ((d1*100)/120);
         double vat1 = d1-netamt1;
         total2=((total+vat)-d1)-(vat-vat1);
         WebElement amount = m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+ledger1no_1+"')]/following-sibling::td[5]//a"));
         
 			String[] z = amount.getText().split("", 3);
 	        if (z[0].equals("(")) {
 	        	Assert.assertEquals(amount.getText().replaceAll(",", "").substring(2,9), String.format("%.2f",total2));
 	        	Reporter.log("entered Credit Amount verified: "+amount.getText());
 	    	} else {
 	    	Assert.assertEquals(amount.getText().substring(1).replaceAll(",", ""), String.format("%.2f",total2));
 	    	Reporter.log("Amount forwarded in next year verified: "+amount.getText());
 	    	}
 	        //Reporter.log("Amount enter verified: "+amount1.getText());
 	        //sl.ScrollToElement(m_Driver, ele1);
         Reporter.log("Enteries are Verified on TrialBalance Report page :", true);
   }
    public void verify_TrialBalance_Bf_3100(String BF_ledger1_No , String Bf_ledger1) {
    	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'"+BF_ledger1_No+"')]"));
    	String led = ele1.getText();
    	WebElement ele2=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[starts-with(text(),'"+BF_ledger1_No+"')]/following-sibling::td[1]/a"));
    	String led_text = ele2.getText();
    	String actualledger1=led+"   "+led_text;
    	System.out.println(actualledger1);
    	String expectedledger1 = Bf_ledger1;
    	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
    	Reporter.log("ledger1 code verified: "+actualledger1);
    	
  
        WebElement amount = m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+BF_ledger1_No+"')]/following-sibling::td[5]//a"));
	
			String[] z = amount.getText().split("", 3);
	        if (z[0].equals("(")) {
	        	Assert.assertEquals(amount.getText().replaceAll(",", "").substring(2,9), String.format("%.2f",total2));
	        	Reporter.log("entered Credit Amount verified: "+amount.getText());
	    	} else {
	    	Assert.assertEquals(amount.getText().substring(1).replaceAll(",", ""), String.format("%.2f",total2));
	    	Reporter.log("Amount forwarded in next year verified under retained profit/loss b/f: "+amount.getText());
	    	}
	        //Reporter.log("Amount enter verified: "+amount1.getText());
	        //sl.ScrollToElement(m_Driver, ele1);
		
        Reporter.log("Enteries are Verified on TrialBalance Report page :", true);
   }
    
    
/*Profit and Loss*/
    public void verify_ProfitLoss_IncomeType_4000_4021() {
    	List<WebElement> elements = m_Driver.findElements(By.xpath("//tbody/tr/td/a/span[1][contains(text(),'')]"));
        int size = elements.size();
        for (int i = 0; i <size-1; i++) {
        	WebElement ele1=m_Driver.findElement(By.xpath("//tbody/tr/td/a/span[1][contains(text(),'"+ledger1.get(i)+"')]"));
        	String led = ele1.getText();
        	WebElement ele2=m_Driver.findElement(By.xpath("//tbody/tr/td/a/span[1][contains(text(),'"+ledger1.get(i)+"')]/following-sibling::span"));
        	String led_text = ele2.getText();
        	String actualledger1=led+"   "+led_text;
        	System.out.println(actualledger1);
        	String expectedledger1 = expected_entry1.get(i);
        	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
        	Reporter.log("ledger1 code verified: "+actualledger1);
        	
        	WebElement amount=m_Driver.findElement(By.xpath("//tbody/tr/td/a/span[1][contains(text(),'"+ledger1.get(i)+"')]/ancestor::td/following-sibling::td[2]"));
        	String xx = amount.getText();
        	String yy = amt1.get(i)+".00";
        	System.out.println(xx);
        	System.out.println(yy);
        	String[] z = amount.getText().split("", 3);
        	if (z[0].equals("(")) {
        		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(2,9), yy);
    		} else {
    			Assert.assertEquals(amount.getText().replaceAll(",", ""), yy);
    		}
        	Reporter.log("Amount enter verified: "+amount.getText());
        	sl.ScrollToElement(m_Driver, ele1);
    	}
        Reporter.log("Enteries are Verified on Profit and loss Report page :", true);
   }
    public void verify_ProfitLoss_CostOfSale5000_5200() {
    	List<WebElement> elements = m_Driver.findElements(By.xpath("//tbody/tr/td/a/span[1][contains(text(),'')]"));
        int size = elements.size();
        for (int i = 0; i <size-1; i++) {
        	WebElement ele1=m_Driver.findElement(By.xpath("//tbody/tr/td/a/span[1][contains(text(),'"+ledger1.get(i)+"')]"));
        	String led = ele1.getText();
        	WebElement ele2=m_Driver.findElement(By.xpath("//tbody/tr/td/a/span[1][contains(text(),'"+ledger1.get(i)+"')]/following-sibling::span"));
        	String led_text = ele2.getText();
        	String actualledger1=led+"   "+led_text;
        	System.out.println(actualledger1);
        	String expectedledger1 = expected_entry1.get(i);
        	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
        	Reporter.log("ledger1 code verified: "+actualledger1);
        	
        	WebElement amount=m_Driver.findElement(By.xpath("//tbody/tr/td/a/span[1][contains(text(),'"+ledger1.get(i)+"')]/ancestor::td/following-sibling::td[2]"));
        	String xx = amount.getText();
        	String yy = amt1.get(i)+".00";
        	System.out.println(xx);
        	System.out.println(yy);
        	String[] z = amount.getText().split("", 3);
        	if (z[0].equals("(")) {
        		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(2,9), yy);
    		} else {
    			Assert.assertEquals(amount.getText().replaceAll(",", ""), yy);
    		}
        	Reporter.log("Amount enter verified: "+amount.getText());
        	sl.ScrollToElement(m_Driver, ele1);
    	}
        Reporter.log("Enteries are Verified on Profit and loss Report page :", true);
   }
    public void verify_ProfitLoss_Expense_7001_7020() {
    	List<WebElement> elements = m_Driver.findElements(By.xpath("//tbody/tr/td/a/span[1][contains(text(),'')]"));
        int size = elements.size();
        System.out.println(size);
        for (int i = 0; i <size-1; i++) {
        	System.out.println(ledger1.get(i));
        	WebElement ele1=m_Driver.findElement(By.xpath("//tbody/tr/td/a/span[1][contains(text(),'"+ledger1.get(i)+"')]"));
        	String led = ele1.getText();
        	WebElement ele2=m_Driver.findElement(By.xpath("//tbody/tr/td/a/span[1][contains(text(),'"+ledger1.get(i)+"')]/following-sibling::span"));
        	String led_text = ele2.getText();
        	String actualledger1=led+"   "+led_text;
        	System.out.println(actualledger1);
        	String expectedledger1 = expected_entry1.get(i);
        	Assert.assertEquals(actualledger1.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
        	Reporter.log("ledger1 code verified: "+actualledger1);
        	
        	WebElement amount=m_Driver.findElement(By.xpath("//tbody/tr/td/a/span[1][contains(text(),'"+ledger1.get(i)+"')]/ancestor::td/following-sibling::td[2]"));
        	String xx = amount.getText();
        	String yy = amt1.get(i)+".00";
        	System.out.println(xx);
        	System.out.println(yy);
        	String[] z = amount.getText().split("", 3);
        	if (z[0].equals("(")) {
        		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(2,9), yy);
    		} else {
    			Assert.assertEquals(amount.getText().replaceAll(",", ""), yy);
    		}
        	Reporter.log("Amount enter verified: "+amount.getText());
        	sl.ScrollToElement(m_Driver, ele1);
    	}
        Reporter.log("Enteries are Verified on Profit and loss Report page :", true);
   }
    	
}