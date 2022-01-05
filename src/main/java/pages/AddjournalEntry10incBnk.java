package pages;

import pages.BasePage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/35c25301-c275-453f-8ba5-2f511ca979b7
 @TestModellerModule(guid = "35c25301-c275-453f-8ba5-2f511ca979b7")
 public class AddjournalEntry10incBnk extends BasePage
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
	public AddjournalEntry10incBnk (WebDriver driver)
	{		super(driver);
	sl= new SeleniumLib(driver);
	}


	
	private By AccountantElem = By.xpath("//*[@id='ctl00_SideMenu1_accountantMenu']/a/span");

	private By clickjournalplusElem = By.xpath("//A[@id='ctl00_cPH_btnAddJournalEntry']/I[@class='fa fa-plus hav_tooltip btn']");

	private By ctl00cPHtxtDateElem = By.xpath("//*[@id='ctl00_cPH_txtDate']");
	
	private By Slect_CurrencyElem = By.xpath("//SELECT[@name='ctl00$cPH$ddCurrency']");

	private By ctl00cPHtxtDescriptionElem = By.xpath("//*[@id='ctl00_cPH_txtDescription']");

	private By Account1Elem = By.xpath("//*[@id='select2-ctl00_cPH_rptRecord_ctl00_ltAccount-container']");

	private By Debit1Elem = By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDebit']");

	private By Credit1Elem = By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtCredit']");

	private By Note1Elem = By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtNote']");

	private By Account2Elem = By.xpath("//*[@id='select2-ctl00_cPH_rptRecord_ctl01_ltAccount-container']");

	private By Debit2Elem = By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl01_txtDebit']");

	private By Credit2Elem = By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl01_txtCredit']");

	private By Note2Elem = By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl01_txtNote']");

	private By Account3Elem = By.xpath("//*[@id='select2-ctl00_cPH_rptRecord_ctl02_ltAccount-container']");

	private By Debit3Elem = By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl02_txtDebit']");

	private By Credit3Elem = By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl02_txtCredit']");

	private By Note3Elem = By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl02_txtNote']");

	private By Account4Elem = By.xpath("//*[@id='select2-ctl00_cPH_rptRecord_ctl03_ltAccount-container']");

	private By Debit4Elem = By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl03_txtDebit']");

	private By Credit4Elem = By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl03_txtCredit']");

	private By Note4Elem = By.xpath("//*[@id=\"ctl00_cPH_rptRecord_ctl03_txtNote\"]");

	private By Account5Elem = By.xpath("//*[@id='select2-ctl00_cPH_rptRecord_ctl04_ltAccount-container']");

	private By Debit5Elem = By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl04_txtDebit']");

	private By Credit5Elem = By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl04_txtCredit']");

	private By Note5Elem = By.xpath("//*[@id=\"ctl00_cPH_rptRecord_ctl04_txtNote\"]");

	private By Tick_for_more_line_itemsElem = By.xpath("//DIV[@class='exp_tick']/LABEL");

	private By Account6Elem = By.xpath("//*[@id='select2-ctl00_cPH_rptRecord_ctl05_ltAccount-container']");

	private By Debit6Elem = By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl05_txtDebit']");

	private By Credit6Elem = By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl05_txtCredit']");

	private By Note6Elem = By.xpath("//*[@id=\"ctl00_cPH_rptRecord_ctl05_txtNote\"]");

	private By Account7Elem = By.xpath("//*[@id='select2-ctl00_cPH_rptRecord_ctl06_ltAccount-container']");

	private By Debit7Elem = By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl06_txtDebit']");

	private By Credit7Elem = By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl06_txtCredit']");

	private By Note7Elem = By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl06_txtNote']");

	private By Account8Elem = By.xpath("//*[@id='select2-ctl00_cPH_rptRecord_ctl07_ltAccount-container']");

	private By Debit8Elem = By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl07_txtDebit']");

	private By Credit8Elem = By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl07_txtCredit']");

	private By Note8Elem = By.xpath("//*[@id=\"ctl00_cPH_rptRecord_ctl07_txtNote\"]");

	private By Account9Elem = By.xpath("//*[@id='select2-ctl00_cPH_rptRecord_ctl08_ltAccount-container']");

	private By Debit9Elem = By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl08_txtDebit']");

	private By Credit9Elem = By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl08_txtCredit']");

	private By Note9Elem = By.xpath("//*[@id=\"ctl00_cPH_rptRecord_ctl08_txtNote\"]");

	private By Account10Elem = By.xpath("//*[@id='select2-ctl00_cPH_rptRecord_ctl09_ltAccount-container']");

	private By Debit10Elem = By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl09_txtDebit']");

	private By Credit10Elem = By.xpath("//*[@id=\"ctl00_cPH_rptRecord_ctl09_txtCredit\"]");

	private By Note10Elem = By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl09_txtNote']");

	private By Account11Elem = By.xpath("//*[@id='select2-ctl00_cPH_rptRecord_ctl10_ltAccount-container']");

	private By Debit11Elem = By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl10_txtDebit']");

	private By Credit11Elem = By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl10_txtCredit']");

	private By Note11Elem = By.xpath("//*[@id=\"ctl00_cPH_rptRecord_ctl10_txtNote\"]");

	private By _Save_Elem = By.xpath("//*[@id=\"ctl00_cphFooter_btnSave\"]");
	
	private By ctl00ddlFinancialYearElem = By.xpath("//*[@id=\"ctl00_ddlFinancialYear\"]");

	private By ledger1Elem = By.xpath("/html/body/form/main/div[10]/div[3]/div/div[2]/div/div/div/table/tbody/tr[10]/td[2]");

	private By debit1Elem = By.xpath("/html/body/form/main/div[10]/div[3]/div/div[2]/div/div/div/table/tbody/tr[10]/td[3]");

	private By credit1Elem = By.xpath("/html/body/form/main/div[10]/div[3]/div/div[2]/div/div/div/table/tbody/tr[10]/td[4]");

	private By ledger2Elem = By.xpath("/html/body/form/main/div[10]/div[3]/div/div[2]/div/div/div/table/tbody/tr[11]/td[2]");

	private By debit2Elem = By.xpath("/html/body/form/main/div[10]/div[3]/div/div[2]/div/div/div/table/tbody/tr[11]/td[3]");

	private By credit2Elem = By.xpath("/html/body/form/main/div[10]/div[3]/div/div[2]/div/div/div/table/tbody/tr[11]/td[4]");

	private By ledger3Elem = By.xpath("/html/body/form/main/div[10]/div[3]/div/div[2]/div/div/div/table/tbody/tr[12]/td[2]");

	private By debit3Elem = By.xpath("/html/body/form/main/div[10]/div[3]/div/div[2]/div/div/div/table/tbody/tr[12]/td[3]");

	private By credit3Elem = By.xpath("/html/body/form/main/div[10]/div[3]/div/div[2]/div/div/div/table/tbody/tr[12]/td[4]");

	private By ledger4Elem = By.xpath("/html/body/form/main/div[10]/div[3]/div/div[2]/div/div/div/table/tbody/tr[13]/td[2]");

	private By debit4Elem = By.xpath("/html/body/form/main/div[10]/div[3]/div/div[2]/div/div/div/table/tbody/tr[13]/td[3]");

	private By credit4Elem = By.xpath("/html/body/form/main/div[10]/div[3]/div/div[2]/div/div/div/table/tbody/tr[13]/td[4]");

	private By ledger5Elem = By.xpath("/html/body/form/main/div[10]/div[3]/div/div[2]/div/div/div/table/tbody/tr[14]/td[2]");

	private By debit5Elem = By.xpath("/html/body/form/main/div[10]/div[3]/div/div[2]/div/div/div/table/tbody/tr[14]/td[3]");

	private By credit5Elem = By.xpath("/html/body/form/main/div[10]/div[3]/div/div[2]/div/div/div/table/tbody/tr[14]/td[4]");

	private By ledger6Elem = By.xpath("/html/body/form/main/div[10]/div[3]/div/div[2]/div/div/div/table/tbody/tr[15]/td[2]");

	private By debit6Elem = By.xpath("/html/body/form/main/div[10]/div[3]/div/div[2]/div/div/div/table/tbody/tr[15]/td[3]");

	private By credit6Elem = By.xpath("/html/body/form/main/div[10]/div[3]/div/div[2]/div/div/div/table/tbody/tr[15]/td[4]");

	private By ledger7Elem = By.xpath("/html/body/form/main/div[10]/div[3]/div/div[2]/div/div/div/table/tbody/tr[16]/td[2]");

	private By debit7Elem = By.xpath("/html/body/form/main/div[10]/div[3]/div/div[2]/div/div/div/table/tbody/tr[16]/td[3]");

	private By credit7Elem = By.xpath("/html/body/form/main/div[10]/div[3]/div/div[2]/div/div/div/table/tbody/tr[16]/td[4]");

	private By ledger8Elem = By.xpath("/html/body/form/main/div[10]/div[3]/div/div[2]/div/div/div/table/tbody/tr[17]/td[2]");

	private By debit8Elem = By.xpath("/html/body/form/main/div[10]/div[3]/div/div[2]/div/div/div/table/tbody/tr[17]/td[3]");

	private By credit8Elem = By.xpath("/html/body/form/main/div[10]/div[3]/div/div[2]/div/div/div/table/tbody/tr[17]/td[4]");

	private By ledger9Elem = By.xpath("/html/body/form/main/div[10]/div[3]/div/div[2]/div/div/div/table/tbody/tr[18]/td[2]");

	private By debit9Elem = By.xpath("/html/body/form/main/div[10]/div[3]/div/div[2]/div/div/div/table/tbody/tr[18]/td[3]");

	private By credit9Elem = By.xpath("/html/body/form/main/div[10]/div[3]/div/div[2]/div/div/div/table/tbody/tr[18]/td[4]");

	private By ledger10Elem = By.xpath("/html/body/form/main/div[10]/div[3]/div/div[2]/div/div/div/table/tbody/tr[19]/td[2]");

	private By debit10Elem = By.xpath("/html/body/form/main/div[10]/div[3]/div/div[2]/div/div/div/table/tbody/tr[19]/td[3]");

	private By credit10Elem = By.xpath("/html/body/form/main/div[10]/div[3]/div/div[2]/div/div/div/table/tbody/tr[19]/td[4]");

	private By ledger11Elem = By.xpath("/html/body/form/main/div[10]/div[3]/div/div[2]/div/div/div/table/tbody/tr[29]/td[2]");

	private By debit11Elem = By.xpath("/html/body/form/main/div[10]/div[3]/div/div[2]/div/div/div/table/tbody/tr[29]/td[3]");

	private By credit11Elem = By.xpath("/html/body/form/main/div[10]/div[3]/div/div[2]/div/div/div/table/tbody/tr[29]/td[4]");

	private By total_debitElem = By.xpath("/html/body/form/main/div[10]/div[3]/div/div[2]/div/div/div/table/tbody/tr[47]/th[2]");

	private By total_creditElem = By.xpath("/html/body/form/main/div[10]/div[3]/div/div[2]/div/div/div/table/tbody/tr[47]/th[3]");
    
	private By ReportsElem = By.xpath("//span[text()='Reports']");

	private By Trial_BalanceElem = By.xpath("//a[text()='Trial Balance']");
	
	private By Entry = By.xpath("//div/div/table/tbody/tr/td[1]");
	private By Ledger1=By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_AccountUC1_txtAccount']");
    private By verifyReport1 = By.xpath("//*[@id='plprofit_table_wrap1']/div/div/div/table/tbody/tr[10]/td[2]");
	String LedgerEle1;
	String report1;
	
	
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
	private By entry11xpath=By.xpath("//*[@id='select2-ctl00_cPH_rptRecord_ctl10_ltAccount-container']");
	
	
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
	
	
	//private String ledger1;
	//private String ledger2;
	//private String ledger3;
	//private String ledger4;
	//private String ledger5;
	//private String ledger6;
	//private String ledger7;
	//private String ledger8;
	//private String ledger9;
	//private String ledger10;
	//private String ledger11;
	
	
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
	
	private ArrayList<String> ledger=new ArrayList<String>();
	private ArrayList<String> expected_entry= new ArrayList<String>();
	private ArrayList<String> amt=new ArrayList<String>();

	
public void verifyReport()
{
	WebElement ele1=m_Driver.findElement(By.xpath("//div/div/div/table/tbody/tr/td[contains(text(),'"+report1+"')]"));
String reportText=ele1.getText();
System.out.println(reportText);

Assert.assertEquals(LedgerEle1.replaceAll("-"," "),reportText);
Reporter.log("Ledger code verified: "+reportText);


}



	/*public void AddJournalEntry() {
		int j=0;
		String actualText;
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_cPH_journalmodal1Iframe1']")));
		List<WebElement> ele = getWebElements(Entry);
		int size=ele.size();
		System.out.println(size);
		for(int i=1;i<ele.size()-1;i++)
		{
			String txt_1;
			WebElement ele1;
			
			if (j<10) {
				ele1= m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+j+"_AccountUC1_txtAccount']"));
				WaitStatementLib wt = new WaitStatementLib();
				wt.explicitWait(m_Driver, 20, ele1);		
			}
			else {
				ele1= m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl"+j+"_AccountUC1_txtAccount']"));
				WaitStatementLib wt = new WaitStatementLib();
				wt.explicitWait(m_Driver, 20, ele1);		
			}
			txt_1 = ele1.getAttribute("value");
			System.out.println(txt_1);
		    int length=txt_1.length();
		if(length!=0)
		{
			actualText=txt_1;
			System.out.println(actualText);
		}
		j++;
		}
		WebElement elem = getWebElement(_Save_Elem);
		elem.click();
		m_Driver.switchTo().defaultContent();
	}	*/	

	 public void Select_ctl00ddlFinancialYear(String ctl00ddlFinancialYear)
	 	{
	 	    
	 		WebElement elem = getWebElement(ctl00ddlFinancialYearElem);

	 		if (elem == null) {
	    	ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_ctl00ddlFinancialYear", "Select_ctl00ddlFinancialYear failed. Unable to locate object: " + ctl00ddlFinancialYearElem.toString());

	    	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_ctl00ddlFinancialYear", "Select_ctl00ddlFinancialYear failed. Unable to locate object: " + ctl00ddlFinancialYearElem.toString());

	 			Assert.fail("Unable to locate object: " + ctl00ddlFinancialYearElem.toString());
	         }

	 		Select dropdown = new Select(elem);

	 		dropdown.selectByVisibleText(ctl00ddlFinancialYear);
	 		
	 		
		ExtentReportManager.passStep(m_Driver, "Select_ctl00ddlFinancialYear " + ctl00ddlFinancialYear);

		TestModellerLogger.PassStep(m_Driver, "Select_ctl00ddlFinancialYear " + ctl00ddlFinancialYear);
	 	}

	 public void Click_Reports()
		{
	        
			WebElement elem = getWebElement(ReportsElem);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Reports", "Click_Reports failed. Unable to locate object: " + ReportsElem.toString());

	    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Reports", "Click_Reports failed. Unable to locate object: " + ReportsElem.toString());

				Assert.fail("Unable to locate object: " + ReportsElem.toString());
	        }

			elem.click();
	          	

			ExtentReportManager.passStep(m_Driver, "Click_Reports");

			TestModellerLogger.PassStep(m_Driver, "Click_Reports");
		}

	     
		/**
	 	 * Click Trial Balance
	     * @name Click Trial Balance
	     */
		public void Click_Trial_Balance()
		{
	        
			WebElement elem = getWebElement(Trial_BalanceElem);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Trial_Balance", "Click_Trial_Balance failed. Unable to locate object: " + Trial_BalanceElem.toString());

	    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Trial_Balance", "Click_Trial_Balance failed. Unable to locate object: " + Trial_BalanceElem.toString());

				Assert.fail("Unable to locate object: " + Trial_BalanceElem.toString());
	        }

			elem.click();
	          	

			ExtentReportManager.passStep(m_Driver, "Click_Trial_Balance");

			TestModellerLogger.PassStep(m_Driver, "Click_Trial_Balance");
		}
	 
	
	public void GoToUrl()
	{
		m_Driver.get("https://live.nomismasolution.co.uk/AccountUI/AccountantDashboard.aspx?FYCode=37329&CompanyCode=11999&IsFirstRequest=1");

	ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://live.nomismasolution.co.uk/AccountUI/AccountantDashboard.aspx?FYCode=37329&CompanyCode=11999&IsFirstRequest=1");
		
	TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://live.nomismasolution.co.uk/AccountUI/AccountantDashboard.aspx?FYCode=37329&CompanyCode=11999&IsFirstRequest=1");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "https://live.nomismasolution.co.uk/AccountUI/AccountantDashboard.aspx?FYCode=37329&CompanyCode=11999&IsFirstRequest=1";

        if (!currentUrl.equals("https://live.nomismasolution.co.uk/AccountUI/AccountantDashboard.aspx?FYCode=37329&CompanyCode=11999&IsFirstRequest=1")) {
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
 	 * Click click_journal_plus
     * @name Click click_journal_plus
     */
	public void Click_clickjournalplus()
	{
        
		WebElement elem = getWebElement(clickjournalplusElem);

	if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickjournalplus", "Click_clickjournalplus failed. Unable to locate object: " + clickjournalplusElem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickjournalplus", "Click_clickjournalplus failed. Unable to locate object: " + clickjournalplusElem.toString());

			Assert.fail("Unable to locate object: " + clickjournalplusElem.toString());
        }

		elem.click();
          	

	ExtentReportManager.passStep(m_Driver, "Click_clickjournalplus");

	TestModellerLogger.PassStep(m_Driver, "Click_clickjournalplus");
	}

      
	/**
 	 * Enter ctl00$cPH$txtDate
     * @name Enter ctl00$cPH$txtDate
     */
 	public void Enter_ctl00cPHtxtDate(String ctl00cPHtxtDate)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_cPH_journalmodal1Iframe1']")));

 		WebElement elem = getWebElement(ctl00cPHtxtDateElem);

		if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtDate", "Enter_ctl00cPHtxtDate failed. Unable to locate object: " + ctl00cPHtxtDateElem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtDate", "Enter_ctl00cPHtxtDate failed. Unable to locate object: " + ctl00cPHtxtDateElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtxtDateElem.toString());
         }

 		elem.sendKeys(ctl00cPHtxtDate);
 	
		m_Driver.switchTo().defaultContent();

 		
  		 ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtxtDate " + ctl00cPHtxtDate);

  		 TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtxtDate " + ctl00cPHtxtDate);
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
 	 * Enter ctl00$cPH$txtDescription
	 * @throws InterruptedException 
     * @name Enter ctl00$cPH$txtDescription
     */
 	public void Enter_ctl00cPHtxtDescription(String ctl00cPHtxtDescription) throws InterruptedException
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_cPH_journalmodal1Iframe1']")));

 		WebElement elem = getWebElement(ctl00cPHtxtDescriptionElem);

		if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtDescription", "Enter_ctl00cPHtxtDescription failed. Unable to locate object: " + ctl00cPHtxtDescriptionElem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtDescription", "Enter_ctl00cPHtxtDescription failed. Unable to locate object: " + ctl00cPHtxtDescriptionElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtxtDescriptionElem.toString());
         }

		elem.sendKeys(ctl00cPHtxtDescription);
 		jsExec.executeScript("arguments[0].scrollIntoView(true);", elem);
 		Thread.sleep(2000);
		//elem.sendKeys(Keys.TAB);
		m_Driver.switchTo().defaultContent();

 		
  		 ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtxtDescription " + ctl00cPHtxtDescription);

  		 TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtxtDescription " + ctl00cPHtxtDescription);
 	}

      
	/**
 	 * Enter Account_1
	 * @throws AWTException 
	 * @throws SecurityException 
	 * @throws NoSuchFieldException 
	 * @throws IllegalAccessException 
	 * @throws IllegalArgumentException 
	 * @throws InterruptedException 
     * @name Enter Account_1
     */
 	public void Enter_Account1(String Account1) throws AWTException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, InterruptedException
 	{
 		ledger.add(0, Account1);
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
		
		wt.explicitiWait_presenceOfElementLocated(m_Driver, 20, By.xpath("//ul[@id='select2-ctl00_cPH_rptRecord_ctl00_ltAccount-results']/li/ul/li[starts-with(text(), '"+Account1+" - "+"')]"));
		
		//wt.explicitWait_elementToBeClickable(m_Driver, 20, m_Driver.findElement(By.xpath("//ul[@id='ctl00_cPH_rptRecord_ctl06_AccountUC1_AutoCompleteExtender1_completionListElem']/li[starts-with(text(), '"+Account7+" -"+"')]")));
		WebElement elemc= m_Driver.findElement(By.xpath("//ul[@id='select2-ctl00_cPH_rptRecord_ctl00_ltAccount-results']/li/ul/li[starts-with(text(), '"+Account1+" - "+"')]"));
		elemc.click();
	
		WebElement ele1=getWebElement(entry1xpath);
 		LedgerEntered_1=ele1.getAttribute("title");
 		expected_entry.add(0, ele1.getAttribute("title"));
 	    //System.out.println(LedgerEntered_7);
 	   Reporter.log("ledger 1 entered :"+LedgerEntered_1, true);

 		m_Driver.switchTo().defaultContent();
  		 ExtentReportManager.passStep(m_Driver, "Enter_Account1 " + Account1);

  		 TestModellerLogger.PassStep(m_Driver, "Enter_Account1 " + Account1);
 	}
 	public void Enter_Account1_way3(String Account1) throws AWTException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, InterruptedException
 	{
 		//robot = new Robot();
 	    
 	    ledger.add(0, Account1);
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
 		LedgerEntered_1=ele1.getAttribute("value");
 		expected_entry.add(0, LedgerEntered_1);
 	    Reporter.log("Ledger 1 Entered :"+LedgerEntered_1, true); 
		m_Driver.switchTo().defaultContent();

 		
  		 ExtentReportManager.passStep(m_Driver, "Enter_Account1 " + Account1);

  		 TestModellerLogger.PassStep(m_Driver, "Enter_Account1 " + Account1);
 	}
 	
 	
 	
 	
 	
 	public void Enter_Account1select2(String Account1) throws AWTException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException
 	{
 		String a=Account1.replaceAll(" ", "");
 		System.out.println(a);
 		String ab[]=a.split("-");
 		System.out.println(ab[0]);
 		robot = new Robot();
 	    //ledger1=Account1; 
 	    ledger.add(0, ab[0]);
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_cPH_journalmodal1Iframe1']")));

 		WebElement elem = getWebElement(Account1Elem);

		if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Account1", "Enter_Account1 failed. Unable to locate object: " + Account1Elem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Account1", "Enter_Account1 failed. Unable to locate object: " + Account1Elem.toString());

 			Assert.fail("Unable to locate object: " + Account1Elem.toString());
         }


		elem.click();
		m_Driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Account1);
		
		WebElement ele2=m_Driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
		ele2.sendKeys(Keys.ENTER);
	//	WebElement ele4=m_Driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
		//ele4.getAttribute("value");
//		String[] splited_ledger = Account1.split("");
//		for (String string : splited_ledger) {
//			String Robot_cmd = "VK_" + string;
//
//            Class<KeyEvent> clazz = KeyEvent.class;
//            Field field = clazz.getField( Robot_cmd );
//            int keyCode = field.getInt(null);
//            
//            robot.setAutoDelay(250);
//         robot.keyPress( keyCode );
//            robot.setAutoDelay(250);
//            robot.keyRelease( keyCode );
//            
//		}
//		robot.setAutoDelay(250);
//		
//		
//		Actions act = new Actions(m_Driver);
//	  	act.sendKeys(Keys.ARROW_DOWN).perform();
//	  	act.sendKeys(Keys.ARROW_DOWN).perform();
//	  	act.sendKeys(Keys.ENTER).perform();
//	  	
 	//	WebElement ele1=getWebElement(entry1xpath);
		
		
 		LedgerEntered_1=Account1;
 		expected_entry.add(0, LedgerEntered_1);
 	    //System.out.println(LedgerEntered_1);
 	   Reporter.log("Ledger 1 Entered :"+LedgerEntered_1, true); 
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
 		//WebElement ele1=getWebElement(debit1xpath);
 		//amt.add(0, ele1.getAttribute("value"));
		amt.add(0, Debit1);
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
	//	jsExec.executeScript("arguments[0].click();",elem);
		System.out.println("Click Credit");
		elem.sendKeys(Credit1);	
		WebElement ele1=getWebElement(credit1xpath);
 		//credit1=Double.parseDouble(ele1.getAttribute("value"));
 		amt.add(0, ele1.getAttribute("value"));
 		//Assert.assertEquals(String.valueOf(credit11), Credit11);
 	
		m_Driver.switchTo().defaultContent();
 		
  		 ExtentReportManager.passStep(m_Driver, "Enter_Credit1 " + Credit1);

  		 TestModellerLogger.PassStep(m_Driver, "Enter_Credit1 " + Credit1);
 	}

      
	/**
 	 * Enter Note_1
     * @name Enter Note_1
     */
 	public void Enter_Note1(String Note1)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_cPH_journalmodal1Iframe1']")));

 		WebElement elem = getWebElement(Note1Elem);

		if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Note1", "Enter_Note1 failed. Unable to locate object: " + Note1Elem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Note1", "Enter_Note1 failed. Unable to locate object: " + Note1Elem.toString());

 			Assert.fail("Unable to locate object: " + Note1Elem.toString());
         }

 		elem.sendKeys(Note1);
 	
		m_Driver.switchTo().defaultContent();

 		
  		 ExtentReportManager.passStep(m_Driver, "Enter_Note1 " + Note1);

  		 TestModellerLogger.PassStep(m_Driver, "Enter_Note1 " + Note1);
 	}

      
	/**
 	 * Enter Account_2
	 * @throws Exception 
	 * @throws NoSuchFieldException 
     * @name Enter Account_2
     */
 	public void Enter_Account2(String Account2) throws NoSuchFieldException, Exception
 	{
 		ledger.add(1, Account2);
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_cPH_journalmodal1Iframe1']")));

 		WebElement elem = getWebElement(Account2Elem);

		if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Account2", "Enter_Account2 failed. Unable to locate object: " + Account2Elem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Account2", "Enter_Account2 failed. Unable to locate object: " + Account2Elem.toString());

 			Assert.fail("Unable to locate object: " + Account2Elem.toString());
         }

		WaitStatementLib wt=new WaitStatementLib();
		wt.explicitWait_elementToBeClickable(m_Driver, 20, elem);
		elem.click();
		
		wt.explicitiWait_presenceOfElementLocated(m_Driver, 20, By.xpath("//ul[@id='select2-ctl00_cPH_rptRecord_ctl01_ltAccount-results']/li/ul/li[starts-with(text(), '"+Account2+" - "+"')]"));
		
		//wt.explicitWait_elementToBeClickable(m_Driver, 20, m_Driver.findElement(By.xpath("//ul[@id='ctl00_cPH_rptRecord_ctl06_AccountUC1_AutoCompleteExtender1_completionListElem']/li[starts-with(text(), '"+Account7+" -"+"')]")));
		WebElement elemc= m_Driver.findElement(By.xpath("//ul[@id='select2-ctl00_cPH_rptRecord_ctl01_ltAccount-results']/li/ul/li[starts-with(text(), '"+Account2+" - "+"')]"));
		elemc.click();
 	  
		WebElement ele1=getWebElement(entry2xpath);
 		LedgerEntered_2=ele1.getAttribute("title");
 		expected_entry.add(1, ele1.getAttribute("title"));
 	    //System.out.println(LedgerEntered_7);
 	   Reporter.log("ledger 2 entered :"+LedgerEntered_2, true);
 	   
 	   m_Driver.switchTo().defaultContent();
 	   
  		 ExtentReportManager.passStep(m_Driver, "Enter_Account2 " + Account2);

  		 TestModellerLogger.PassStep(m_Driver, "Enter_Account2 " + Account2);
 	}
 	public void Enter_Account2_way3(String Account2) throws NoSuchFieldException, Exception
 	{
 		//ledger2=Account2;
 		ledger.add(1, Account2);
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
 		LedgerEntered_2=ele1.getAttribute("value");
 		expected_entry.add(1, ele1.getAttribute("value"));
 	    //System.out.println(LedgerEntered_2);
 	   Reporter.log("Ledger 2 Entered :"+LedgerEntered_2, true);
		m_Driver.switchTo().defaultContent();
  		 ExtentReportManager.passStep(m_Driver, "Enter_Account2 " + Account2);

  		 TestModellerLogger.PassStep(m_Driver, "Enter_Account2 " + Account2);
 	}
 	public void Enter_Account2select3(String Account2) throws NoSuchFieldException, Exception
 	{
 		//ledger2=Account2;
 		ledger.add(1, Account2);
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_cPH_journalmodal1Iframe1']")));

 		WebElement elem = getWebElement(Account2Elem);

		if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Account2", "Enter_Account2 failed. Unable to locate object: " + Account2Elem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Account2", "Enter_Account2 failed. Unable to locate object: " + Account2Elem.toString());

 			Assert.fail("Unable to locate object: " + Account2Elem.toString());
         }

 		//elem.sendKeys(Account2);
		elem.click();
		String[] yy = Account2.split("");
		for (String string : yy) {
			String variableName = "VK_" + string;

            Class<KeyEvent> clazz = KeyEvent.class;
            Field field = clazz.getField( variableName );
            int keyCode = field.getInt(null);

            
            robot.setAutoDelay(250);
            robot.keyPress( keyCode );
            robot.setAutoDelay(250);
            robot.keyRelease( keyCode );
            
		}
		
		robot.setAutoDelay(250);
		Actions act = new Actions(m_Driver);
	  	act.sendKeys(Keys.ARROW_DOWN).perform();
	  	act.sendKeys(Keys.ARROW_DOWN).perform();
	  	act.sendKeys(Keys.ARROW_DOWN).perform();
	  	act.sendKeys(Keys.ENTER).perform();
		/*robot.keyPress(KeyEvent.VK_DOWN);
		robot.setAutoDelay(200);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(200);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.setAutoDelay(200);
		robot.keyRelease(KeyEvent.VK_ENTER);*/
		/*List<WebElement> All_List_elements = m_Driver.findElements(By.xpath("//ul[@id='ctl00_cPH_rptRecord_ctl01_AccountUC1_AutoCompleteExtender1_completionListElem']/li"));
		int size = All_List_elements.size();
		System.out.println(size);
		for (int i = 0; i <size; i++) {
			WebElement element = All_List_elements.get(i);
			String[] led = element.getText().split("-");
			//System.out.println(led[0].trim());
			//System.out.println(Account11);
			if (led[0].trim().equals(Account2)) {
				element.click();
				break;
			}
		}*/
		
 		WebElement ele1=getWebElement(entry2xpath);
 		LedgerEntered_2=ele1.getAttribute("value");
 		expected_entry.add(1, ele1.getAttribute("value"));
 	    //System.out.println(LedgerEntered_2);
 	   Reporter.log("Ledger 2 Entered :"+LedgerEntered_2, true);
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
 		//amt.add(ele1.getAttribute("value"));
 		amt.add(1, Debit2);
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
 	//	amt.add(1, ele1.getAttribute("value"));
		amt.add(1, Credit2);
 		//Assert.assertEquals(String.valueOf(credit11), Credit11);
 	
		m_Driver.switchTo().defaultContent();
 		
  		 ExtentReportManager.passStep(m_Driver, "Enter_Credit2 " + Credit2);

  		 TestModellerLogger.PassStep(m_Driver, "Enter_Credit2 " + Credit2);
 	}

      
	/**
 	 * Enter Note_2
     * @name Enter Note_2
     */
 	public void Enter_Note2(String Note2)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_cPH_journalmodal1Iframe1']")));

 		WebElement elem = getWebElement(Note2Elem);

		if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Note2", "Enter_Note2 failed. Unable to locate object: " + Note2Elem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Note2", "Enter_Note2 failed. Unable to locate object: " + Note2Elem.toString());

 			Assert.fail("Unable to locate object: " + Note2Elem.toString());
         }

 		elem.sendKeys(Note2);
 	
		m_Driver.switchTo().defaultContent();

 		
  		 ExtentReportManager.passStep(m_Driver, "Enter_Note2 " + Note2);

  		 TestModellerLogger.PassStep(m_Driver, "Enter_Note2 " + Note2);
 	}

      
	/**
 	 * Enter Account_3
	 * @throws Exception 
	 * @throws NoSuchFieldException 
     * @name Enter Account_3
     */
 	public void Enter_Account3(String Account3) throws NoSuchFieldException, Exception
 	{
 		

 		ledger.add(2, Account3);
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
		
		wt.explicitiWait_presenceOfElementLocated(m_Driver, 20, By.xpath("//ul[@id='select2-ctl00_cPH_rptRecord_ctl02_ltAccount-results']/li/ul/li[starts-with(text(), '"+Account3+" - "+"')]"));
		
		//wt.explicitWait_elementToBeClickable(m_Driver, 20, m_Driver.findElement(By.xpath("//ul[@id='ctl00_cPH_rptRecord_ctl06_AccountUC1_AutoCompleteExtender1_completionListElem']/li[starts-with(text(), '"+Account7+" -"+"')]")));
		WebElement elemc= m_Driver.findElement(By.xpath("//ul[@id='select2-ctl00_cPH_rptRecord_ctl02_ltAccount-results']/li/ul/li[starts-with(text(), '"+Account3+" - "+"')]"));
		elemc.click();
 	  
		WebElement ele1=getWebElement(entry3xpath);
 		LedgerEntered_3=ele1.getAttribute("title");
 		expected_entry.add(2, ele1.getAttribute("title"));
 	    //System.out.println(LedgerEntered_7);
 	   Reporter.log("ledger 3 entered :"+LedgerEntered_3, true);
		m_Driver.switchTo().defaultContent();

 		
  		 ExtentReportManager.passStep(m_Driver, "Enter_Account3 " + Account3);

  		 TestModellerLogger.PassStep(m_Driver, "Enter_Account3 " + Account3);
 	}
 	
 	public void Enter_Account3_way3(String Account3) throws NoSuchFieldException, Exception
 	{
 		//ledger3=Account3;
 		ledger.add(2, Account3);
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
 		LedgerEntered_3=ele1.getAttribute("value");
 		expected_entry.add(2, ele1.getAttribute("value"));
 	    //System.out.println(LedgerEntered_3);
 	   Reporter.log("Ledger 3 Entered :"+LedgerEntered_3, true);
		m_Driver.switchTo().defaultContent();

 		
  		 ExtentReportManager.passStep(m_Driver, "Enter_Account3 " + Account3);

  		 TestModellerLogger.PassStep(m_Driver, "Enter_Account3 " + Account3);
 	}
 	public void Enter_Account3select4(String Account3) throws NoSuchFieldException, Exception
 	{
 		//ledger3=Account3;
 		ledger.add(2, Account3);
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_cPH_journalmodal1Iframe1']")));

 		WebElement elem = getWebElement(Account3Elem);

		if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Account3", "Enter_Account3 failed. Unable to locate object: " + Account3Elem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Account3", "Enter_Account3 failed. Unable to locate object: " + Account3Elem.toString());

 			Assert.fail("Unable to locate object: " + Account3Elem.toString());
         }

 		//elem.sendKeys(Account3);
		elem.click();
		String[] yy = Account3.split("");
		for (String string : yy) {
			String variableName = "VK_" + string;

            Class<KeyEvent> clazz = KeyEvent.class;
            Field field = clazz.getField( variableName );
            int keyCode = field.getInt(null);

            
            robot.setAutoDelay(250);
            robot.keyPress( keyCode );
            robot.setAutoDelay(250);
            robot.keyRelease( keyCode );
            
		}
		
		robot.setAutoDelay(250);
		Actions act = new Actions(m_Driver);
	  	act.sendKeys(Keys.ARROW_DOWN).perform();
	  	act.sendKeys(Keys.ARROW_DOWN).perform();
	  	act.sendKeys(Keys.ARROW_DOWN).perform();
	  	act.sendKeys(Keys.ARROW_DOWN).perform();
	  	act.sendKeys(Keys.ENTER).perform();
		/*robot.keyPress(KeyEvent.VK_DOWN);
		robot.setAutoDelay(200);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(200);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.setAutoDelay(200);
		robot.keyRelease(KeyEvent.VK_ENTER);*/
		
		/*List<WebElement> All_List_elements = m_Driver.findElements(By.xpath("//ul[@id='ctl00_cPH_rptRecord_ctl02_AccountUC1_AutoCompleteExtender1_completionListElem']/li"));
		int size = All_List_elements.size();
		System.out.println(size);
		
		for (int i = 0; i <size; i++) {
			WebElement element = All_List_elements.get(i);
			String[] led = element.getText().split("-");
			//System.out.println(led[0].trim());
			//System.out.println(Account11);
			if (led[0].trim().equals(Account3)) {
				element.click();
				break;
			}
		}*/
		//System.out.println(led[0].trim());
		//System.out.println(Account2);
		
		//SeleniumLib sl= new SeleniumLib(m_Driver);
 		//sl.ArrowDownSelect(m_Driver, elem, Account3);
 		WebElement ele1=getWebElement(entry3xpath);
 		LedgerEntered_3=ele1.getAttribute("value");
 		expected_entry.add(2, ele1.getAttribute("value"));
 	    //System.out.println(LedgerEntered_3);
 	   Reporter.log("Ledger 3 Entered :"+LedgerEntered_3, true);
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
 	//	WebElement ele1=getWebElement(debit3xpath);
 		//debit3=Double.parseDouble(ele1.getAttribute("value"));
 		//amt.add(ele1.getAttribute("value"));
 	//	amt.add(2, ele1.getAttribute("value"));
 		amt.add(2, Debit3);
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
 		amt.add(2, ele1.getAttribute("value"));
 		//Assert.assertEquals(String.valueOf(credit11), Credit11);
 	
		m_Driver.switchTo().defaultContent();

 		
  		 ExtentReportManager.passStep(m_Driver, "Enter_Credit3 " + Credit3);

  		 TestModellerLogger.PassStep(m_Driver, "Enter_Credit3 " + Credit3);
 	}

      
	/**
 	 * Enter Note_3
     * @name Enter Note_3
     */
 	public void Enter_Note3(String Note3)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_cPH_journalmodal1Iframe1']")));

 		WebElement elem = getWebElement(Note3Elem);

		if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Note3", "Enter_Note3 failed. Unable to locate object: " + Note3Elem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Note3", "Enter_Note3 failed. Unable to locate object: " + Note3Elem.toString());

 			Assert.fail("Unable to locate object: " + Note3Elem.toString());
         }

 		elem.sendKeys(Note3);
 	
		m_Driver.switchTo().defaultContent();

 		
  		 ExtentReportManager.passStep(m_Driver, "Enter_Note3 " + Note3);

  		 TestModellerLogger.PassStep(m_Driver, "Enter_Note3 " + Note3);
 	}

      
	/**
 	 * Enter Account_4
	 * @throws Exception 
	 * @throws NoSuchFieldException 
     * @name Enter Account_4
     */
 	public void Enter_Account4(String Account4) throws NoSuchFieldException, Exception
 	{
 		//ledger4=Account4;
 		ledger.add(3, Account4);
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_cPH_journalmodal1Iframe1']")));

 		WebElement elem = getWebElement(Account4Elem);

		if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Account4", "Enter_Account4 failed. Unable to locate object: " + Account4Elem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Account4", "Enter_Account4 failed. Unable to locate object: " + Account4Elem.toString());

 			Assert.fail("Unable to locate object: " + Account4Elem.toString());
         }

		WaitStatementLib wt=new WaitStatementLib();
		wt.explicitWait_elementToBeClickable(m_Driver, 20, elem);
		elem.click();
		
		wt.explicitiWait_presenceOfElementLocated(m_Driver, 20, By.xpath("//ul[@id='select2-ctl00_cPH_rptRecord_ctl03_ltAccount-results']/li/ul/li[starts-with(text(), '"+Account4+" - "+"')]"));
		
		//wt.explicitWait_elementToBeClickable(m_Driver, 20, m_Driver.findElement(By.xpath("//ul[@id='ctl00_cPH_rptRecord_ctl06_AccountUC1_AutoCompleteExtender1_completionListElem']/li[starts-with(text(), '"+Account7+" -"+"')]")));
		WebElement elemc= m_Driver.findElement(By.xpath("//ul[@id='select2-ctl00_cPH_rptRecord_ctl03_ltAccount-results']/li/ul/li[starts-with(text(), '"+Account4+" - "+"')]"));
		elemc.click();
 	  
		WebElement ele1=getWebElement(entry4xpath);
 		LedgerEntered_4=ele1.getAttribute("title");
 		expected_entry.add(3, ele1.getAttribute("title"));
 	    //System.out.println(LedgerEntered_7);
 	   Reporter.log("ledger 4 entered :"+LedgerEntered_4, true);
		m_Driver.switchTo().defaultContent();
 		
  		 ExtentReportManager.passStep(m_Driver, "Enter_Account4 " + Account4);

  		 TestModellerLogger.PassStep(m_Driver, "Enter_Account4 " + Account4);
 	}
 	public void Enter_Account4_way3(String Account4) throws NoSuchFieldException, Exception
 	{
 		//ledger4=Account4;
 		ledger.add(3, Account4);
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
 		LedgerEntered_4=ele1.getAttribute("value");
 		expected_entry.add(3, ele1.getAttribute("value"));
 	    //System.out.println(LedgerEntered_4);
 	    Reporter.log("ledger 4 entered :"+LedgerEntered_4, true);
		m_Driver.switchTo().defaultContent();
 		
  		 ExtentReportManager.passStep(m_Driver, "Enter_Account4 " + Account4);

  		 TestModellerLogger.PassStep(m_Driver, "Enter_Account4 " + Account4);
 	}
 	public void Enter_Account4select5(String Account4) throws NoSuchFieldException, Exception
 	{
 		//ledger4=Account4;
 		ledger.add(3, Account4);
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_cPH_journalmodal1Iframe1']")));

 		WebElement elem = getWebElement(Account4Elem);

		if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Account4", "Enter_Account4 failed. Unable to locate object: " + Account4Elem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Account4", "Enter_Account4 failed. Unable to locate object: " + Account4Elem.toString());

 			Assert.fail("Unable to locate object: " + Account4Elem.toString());
         }

 		//elem.sendKeys(Account4);
		elem.click();
		String[] yy = Account4.split("");
		for (String string : yy) {
			String variableName = "VK_" + string;

            Class<KeyEvent> clazz = KeyEvent.class;
            Field field = clazz.getField( variableName );
            int keyCode = field.getInt(null);

            robot.setAutoDelay(250);
            robot.keyPress( keyCode );
            robot.setAutoDelay(250);
            robot.keyRelease( keyCode );
            
		}
		
		robot.setAutoDelay(250);
		Actions act = new Actions(m_Driver);
	  	act.sendKeys(Keys.ARROW_DOWN).perform();
	  	act.sendKeys(Keys.ARROW_DOWN).perform();
	  	act.sendKeys(Keys.ARROW_DOWN).perform();
	  	act.sendKeys(Keys.ARROW_DOWN).perform();
	  	act.sendKeys(Keys.ARROW_DOWN).perform();
	  	act.sendKeys(Keys.ENTER).perform();
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
 		LedgerEntered_4=ele1.getAttribute("value");
 		expected_entry.add(3, ele1.getAttribute("value"));
 	    //System.out.println(LedgerEntered_4);
 	    Reporter.log("ledger 4 entered :"+LedgerEntered_4, true);
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
 		//amt.add(ele1.getAttribute("value"));
 		amt.add(3, ele1.getAttribute("value"));
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
 		amt.add(3, ele1.getAttribute("value"));
 		//Assert.assertEquals(String.valueOf(credit11), Credit11);
 	
		m_Driver.switchTo().defaultContent();
 		
  		 ExtentReportManager.passStep(m_Driver, "Enter_Credit4 " + Credit4);

  		 TestModellerLogger.PassStep(m_Driver, "Enter_Credit4 " + Credit4);
 	}

      
	/**
 	 * Enter Note_4
     * @name Enter Note_4
     */
 	public void Enter_Note4(String Note4)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_cPH_journalmodal1Iframe1']")));

 		WebElement elem = getWebElement(Note4Elem);

		if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Note4", "Enter_Note4 failed. Unable to locate object: " + Note4Elem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Note4", "Enter_Note4 failed. Unable to locate object: " + Note4Elem.toString());

 			Assert.fail("Unable to locate object: " + Note4Elem.toString());
         }

 		elem.sendKeys(Note4);
 	
		m_Driver.switchTo().defaultContent();

 		
  		 ExtentReportManager.passStep(m_Driver, "Enter_Note4 " + Note4);

  		 TestModellerLogger.PassStep(m_Driver, "Enter_Note4 " + Note4);
 	}

      
	/**
 	 * Enter Account_5
	 * @throws Exception 
	 * @throws IllegalArgumentException 
     * @name Enter Account_5
     */
 	public void Enter_Account5(String Account5) throws IllegalArgumentException, Exception
 	{
 		//ledger5=Account5;
 		ledger.add(4, Account5);
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_cPH_journalmodal1Iframe1']")));

 		WebElement elem = getWebElement(Account5Elem);

		if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Account5", "Enter_Account5 failed. Unable to locate object: " + Account5Elem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Account5", "Enter_Account5 failed. Unable to locate object: " + Account5Elem.toString());

 			Assert.fail("Unable to locate object: " + Account5Elem.toString());
         }

		WaitStatementLib wt=new WaitStatementLib();
		wt.explicitWait_elementToBeClickable(m_Driver, 20, elem);
		elem.click();
		
		wt.explicitiWait_presenceOfElementLocated(m_Driver, 20, By.xpath("//ul[@id='select2-ctl00_cPH_rptRecord_ctl04_ltAccount-results']/li/ul/li[starts-with(text(), '"+Account5+" - "+"')]"));
		
		//wt.explicitWait_elementToBeClickable(m_Driver, 20, m_Driver.findElement(By.xpath("//ul[@id='ctl00_cPH_rptRecord_ctl06_AccountUC1_AutoCompleteExtender1_completionListElem']/li[starts-with(text(), '"+Account7+" -"+"')]")));
		WebElement elemc= m_Driver.findElement(By.xpath("//ul[@id='select2-ctl00_cPH_rptRecord_ctl04_ltAccount-results']/li/ul/li[starts-with(text(), '"+Account5+" - "+"')]"));
		elemc.click();
 	  
		WebElement ele1=getWebElement(entry5xpath);
 		LedgerEntered_5=ele1.getAttribute("title");
 		expected_entry.add(4, ele1.getAttribute("title"));
 	    //System.out.println(LedgerEntered_7);
 	   Reporter.log("ledger 5 entered :"+LedgerEntered_5, true);
		m_Driver.switchTo().defaultContent();

 		
  		 ExtentReportManager.passStep(m_Driver, "Enter_Account5 " + Account5);

  		 TestModellerLogger.PassStep(m_Driver, "Enter_Account5 " + Account5);
 	}
 	public void Enter_Account5_way3(String Account5) throws IllegalArgumentException, Exception
 	{
 		//ledger5=Account5;
 		ledger.add(4, Account5);
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
 		LedgerEntered_5=ele1.getAttribute("value");
 		expected_entry.add(4, ele1.getAttribute("value"));
 	    //System.out.println(LedgerEntered_5);
 	   Reporter.log("ledger 5 entered :"+LedgerEntered_5, true);
		m_Driver.switchTo().defaultContent();

 		
  		 ExtentReportManager.passStep(m_Driver, "Enter_Account5 " + Account5);

  		 TestModellerLogger.PassStep(m_Driver, "Enter_Account5 " + Account5);
 	}
 	public void Enter_Account5select6(String Account5) throws IllegalArgumentException, Exception
 	{
 		//ledger5=Account5;
 		ledger.add(4, Account5);
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_cPH_journalmodal1Iframe1']")));

 		WebElement elem = getWebElement(Account5Elem);

		if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Account5", "Enter_Account5 failed. Unable to locate object: " + Account5Elem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Account5", "Enter_Account5 failed. Unable to locate object: " + Account5Elem.toString());

 			Assert.fail("Unable to locate object: " + Account5Elem.toString());
         }

 		//elem.sendKeys(Account5);
		elem.click();
		String[] yy = Account5.split("");
		for (String string : yy) {
			String variableName = "VK_" + string;

            Class<KeyEvent> clazz = KeyEvent.class;
            Field field = clazz.getField( variableName );
            int keyCode = field.getInt(null);
            robot.setAutoDelay(250);
            robot.keyPress( keyCode );
            robot.setAutoDelay(250);
            robot.keyRelease( keyCode );
            
		}
		
		robot.setAutoDelay(250);
		
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
		Actions act = new Actions(m_Driver);
	  	act.sendKeys(Keys.ARROW_DOWN).perform();
	  	act.sendKeys(Keys.ARROW_DOWN).perform();
	  	act.sendKeys(Keys.ARROW_DOWN).perform();
	  	act.sendKeys(Keys.ARROW_DOWN).perform();
	  	act.sendKeys(Keys.ARROW_DOWN).perform();
	  	act.sendKeys(Keys.ARROW_DOWN).perform();
	  	act.sendKeys(Keys.ENTER).perform();
 		WebElement ele1=getWebElement(entry5xpath);
 		LedgerEntered_5=ele1.getAttribute("value");
 		expected_entry.add(4, ele1.getAttribute("value"));
 	    //System.out.println(LedgerEntered_5);
 	   Reporter.log("ledger 5 entered :"+LedgerEntered_5, true);
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
 		//amt.add(ele1.getAttribute("value"));
 		amt.add(4, ele1.getAttribute("value"));
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
 		amt.add(4, ele1.getAttribute("value"));
 		//Assert.assertEquals(String.valueOf(credit11), Credit11);
 	
		m_Driver.switchTo().defaultContent();


 		
  		 ExtentReportManager.passStep(m_Driver, "Enter_Credit5 " + Credit5);

  		 TestModellerLogger.PassStep(m_Driver, "Enter_Credit5 " + Credit5);
 	}

      
	/**
 	 * Enter Note_5
     * @name Enter Note_5
     */
 	public void Enter_Note5(String Note5)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_cPH_journalmodal1Iframe1']")));

 		WebElement elem = getWebElement(Note5Elem);

		if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Note5", "Enter_Note5 failed. Unable to locate object: " + Note5Elem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Note5", "Enter_Note5 failed. Unable to locate object: " + Note5Elem.toString());

 			Assert.fail("Unable to locate object: " + Note5Elem.toString());
         }

 		elem.sendKeys(Note5);
 	
		m_Driver.switchTo().defaultContent();

 		
  		 ExtentReportManager.passStep(m_Driver, "Enter_Note5 " + Note5);

  		 TestModellerLogger.PassStep(m_Driver, "Enter_Note5 " + Note5);
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
        
		m_Driver.switchTo().defaultContent();
  	

	ExtentReportManager.passStep(m_Driver, "Click_Tick_for_more_line_items");

	TestModellerLogger.PassStep(m_Driver, "Click_Tick_for_more_line_items");
	}

      
	/**
 	 * Enter Account_6
	 * @throws Exception 
	 * @throws NoSuchFieldException 
     * @name Enter Account_6
     */
 	public void Enter_Account6(String Account6) throws NoSuchFieldException, Exception
 	{
 		//ledger6=Account6;
 		ledger.add(5, Account6);
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_cPH_journalmodal1Iframe1']")));

 		WebElement elem = getWebElement(Account6Elem);

		if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Account6", "Enter_Account6 failed. Unable to locate object: " + Account6Elem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Account6", "Enter_Account6 failed. Unable to locate object: " + Account6Elem.toString());

 			Assert.fail("Unable to locate object: " + Account6Elem.toString());
         }

		WaitStatementLib wt=new WaitStatementLib();
		wt.explicitWait_elementToBeClickable(m_Driver, 20, elem);
		elem.click();
		
		wt.explicitiWait_presenceOfElementLocated(m_Driver, 20, By.xpath("//ul[@id='select2-ctl00_cPH_rptRecord_ctl05_ltAccount-results']/li/ul/li[starts-with(text(), '"+Account6+" - "+"')]"));
		
		//wt.explicitWait_elementToBeClickable(m_Driver, 20, m_Driver.findElement(By.xpath("//ul[@id='ctl00_cPH_rptRecord_ctl06_AccountUC1_AutoCompleteExtender1_completionListElem']/li[starts-with(text(), '"+Account7+" -"+"')]")));
		WebElement elemc= m_Driver.findElement(By.xpath("//ul[@id='select2-ctl00_cPH_rptRecord_ctl05_ltAccount-results']/li/ul/li[starts-with(text(), '"+Account6+" - "+"')]"));
		elemc.click();
 	  
		WebElement ele1=getWebElement(entry6xpath);
 		LedgerEntered_5=ele1.getAttribute("title");
 		expected_entry.add(5, ele1.getAttribute("title"));
 	    //System.out.println(LedgerEntered_7);
 	   Reporter.log("ledger 5 entered :"+LedgerEntered_5, true);
		
		m_Driver.switchTo().defaultContent();
 		
  		 ExtentReportManager.passStep(m_Driver, "Enter_Account6 " + Account6);

  		 TestModellerLogger.PassStep(m_Driver, "Enter_Account6 " + Account6);
 	}
 	
 	public void Enter_Account6_way3(String Account6) throws IllegalArgumentException, Exception
 	{
 		//ledger5=Account5;
 		ledger.add(5, Account6);
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_cPH_journalmodal1Iframe1']")));

 		WebElement elem = getWebElement(Account6Elem);

		if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Account6", "Enter_Account6 failed. Unable to locate object: " + Account6Elem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Account6", "Enter_Account6 failed. Unable to locate object: " + Account6Elem.toString());

 			Assert.fail("Unable to locate object: " + Account6Elem.toString());
         }

 		//elem.sendKeys(Account5);
		WaitStatementLib wt=new WaitStatementLib();
		wt.explicitWait_elementToBeClickable(m_Driver, 20, elem);
		elem.click();
		//Thread.sleep(1000);
		wt.explicitiWait_presenceOfElementLocated(m_Driver, 20, By.xpath("//ul[@id='ctl00_cPH_rptRecord_ctl05_AccountUC1_AutoCompleteExtender1_completionListElem']/li[starts-with(text(), '"+Account6+"')]"));
		
		//wt.explicitWait_elementToBeClickable(m_Driver, 20, m_Driver.findElement(By.xpath("//ul[@id='ctl00_cPH_rptRecord_ctl04_AccountUC1_AutoCompleteExtender1_completionListElem']/li[starts-with(text(), '"+Account5+" -"+"')]")));
		WebElement elemc= m_Driver.findElement(By.xpath("//ul[@id='ctl00_cPH_rptRecord_ctl05_AccountUC1_AutoCompleteExtender1_completionListElem']/li[starts-with(text(), '"+Account6+"')]"));
		elemc.click();
		
 		WebElement ele1=getWebElement(entry6xpath);
 		LedgerEntered_6=ele1.getAttribute("value");
 		expected_entry.add(5, ele1.getAttribute("value"));
 	    //System.out.println(LedgerEntered_5);
 	   Reporter.log("ledger 6 entered :"+LedgerEntered_6, true);
		m_Driver.switchTo().defaultContent();

 		
  		 ExtentReportManager.passStep(m_Driver, "Enter_Account6 " + Account6);

  		 TestModellerLogger.PassStep(m_Driver, "Enter_Account6 " + Account6);
 	}
 	public void Enter_Account6select2(String Account6) throws NoSuchFieldException, Exception
 	{
 		//ledger6=Account6;
 		ledger.add(5, Account6);
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_cPH_journalmodal1Iframe1']")));

 		WebElement elem = getWebElement(Account6Elem);

		if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Account6", "Enter_Account6 failed. Unable to locate object: " + Account6Elem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Account6", "Enter_Account6 failed. Unable to locate object: " + Account6Elem.toString());

 			Assert.fail("Unable to locate object: " + Account6Elem.toString());
         }

 		//elem.sendKeys(Account6);
		elem.click();
		String[] yy = Account6.split("");
		//Thread.sleep(1000);
		for (String string : yy) {
			String variableName = "VK_" + string;

            Class<KeyEvent> clazz = KeyEvent.class;
            Field field = clazz.getField( variableName );
            int keyCode = field.getInt(null);
            robot.setAutoDelay(250);
            robot.keyPress( keyCode );
            robot.setAutoDelay(250);
            robot.keyRelease( keyCode );
            
		}
		
		robot.setAutoDelay(250);
		Actions act = new Actions(m_Driver);
	  	act.sendKeys(Keys.ARROW_DOWN).perform();
	  	act.sendKeys(Keys.ARROW_DOWN).perform();
	  	
	  	act.sendKeys(Keys.ENTER).perform();
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
 		LedgerEntered_6=ele1.getAttribute("value");
 		expected_entry.add(5, ele1.getAttribute("value"));
 	    //System.out.println(LedgerEntered_6);
 		Reporter.log("ledger 6 entered :"+LedgerEntered_6, true);
		
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
 	//	WebElement ele1=getWebElement(debit6xpath);
 		//debit6=Double.parseDouble(ele1.getAttribute("value"));;
 		//amt.add(ele1.getAttribute("value"));
 		amt.add(5,Debit6);
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
 		amt.add(5, ele1.getAttribute("value"));
 		//Assert.assertEquals(String.valueOf(credit11), Credit11);
 	
		m_Driver.switchTo().defaultContent();

 		
  		 ExtentReportManager.passStep(m_Driver, "Enter_Credit6 " + Credit6);

  		 TestModellerLogger.PassStep(m_Driver, "Enter_Credit6 " + Credit6);
 	}

      
	/**
 	 * Enter Note_6
     * @name Enter Note_6
     */
 	public void Enter_Note6(String Note6)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_cPH_journalmodal1Iframe1']")));

 		WebElement elem = getWebElement(Note6Elem);

		if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Note6", "Enter_Note6 failed. Unable to locate object: " + Note6Elem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Note6", "Enter_Note6 failed. Unable to locate object: " + Note6Elem.toString());

 			Assert.fail("Unable to locate object: " + Note6Elem.toString());
         }

 		elem.sendKeys(Note6);
 	
		m_Driver.switchTo().defaultContent();

 		
  		 ExtentReportManager.passStep(m_Driver, "Enter_Note6 " + Note6);

  		 TestModellerLogger.PassStep(m_Driver, "Enter_Note6 " + Note6);
 	}

      
	/**
 	 * Enter Account_7
	 * @throws Exception 
	 * @throws IllegalArgumentException 
     * @name Enter Account_7
     */
 	public void Enter_Account7(String Account7) throws IllegalArgumentException, Exception
 	{
 		//ledger7=Account7;
 		ledger.add(6, Account7);
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_cPH_journalmodal1Iframe1']")));

 		WebElement elem = getWebElement(Account7Elem);

		if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Account7", "Enter_Account7 failed. Unable to locate object: " + Account7Elem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Account7", "Enter_Account7 failed. Unable to locate object: " + Account7Elem.toString());

 			Assert.fail("Unable to locate object: " + Account7Elem.toString());
         }

		WaitStatementLib wt=new WaitStatementLib();
		wt.explicitWait_elementToBeClickable(m_Driver, 20, elem);
		elem.click();
		
		wt.explicitiWait_presenceOfElementLocated(m_Driver, 20, By.xpath("//ul[@id='select2-ctl00_cPH_rptRecord_ctl06_ltAccount-results']/li/ul/li[starts-with(text(), '"+Account7+" - "+"')]"));
		
		//wt.explicitWait_elementToBeClickable(m_Driver, 20, m_Driver.findElement(By.xpath("//ul[@id='ctl00_cPH_rptRecord_ctl06_AccountUC1_AutoCompleteExtender1_completionListElem']/li[starts-with(text(), '"+Account7+" -"+"')]")));
		WebElement elemc= m_Driver.findElement(By.xpath("//ul[@id='select2-ctl00_cPH_rptRecord_ctl06_ltAccount-results']/li/ul/li[starts-with(text(), '"+Account7+" - "+"')]"));
		elemc.click();
 	  
		WebElement ele1=getWebElement(entry7xpath);
 		LedgerEntered_7=ele1.getAttribute("title");
 		expected_entry.add(6, ele1.getAttribute("title"));
 	    //System.out.println(LedgerEntered_7);
 	   Reporter.log("ledger 7 entered :"+LedgerEntered_7, true);
		m_Driver.switchTo().defaultContent();

 		
  		 ExtentReportManager.passStep(m_Driver, "Enter_Account7 " + Account7);

  		 TestModellerLogger.PassStep(m_Driver, "Enter_Account7 " + Account7);
 	}
 	public void Enter_Account7select2(String Account7) throws IllegalArgumentException, Exception
 	{
 		//ledger7=Account7;
 		ledger.add(6, Account7);
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_cPH_journalmodal1Iframe1']")));

 		WebElement elem = getWebElement(Account7Elem);

		if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Account7", "Enter_Account7 failed. Unable to locate object: " + Account7Elem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Account7", "Enter_Account7 failed. Unable to locate object: " + Account7Elem.toString());

 			Assert.fail("Unable to locate object: " + Account7Elem.toString());
         }

 		//elem.sendKeys(Account7);
		elem.click();
		String[] yy = Account7.split("");
		for (String string : yy) {
			String variableName = "VK_" + string;

            Class<KeyEvent> clazz = KeyEvent.class;
            Field field = clazz.getField( variableName );
            int keyCode = field.getInt(null);
            robot.setAutoDelay(250);
            robot.keyPress( keyCode );
            robot.setAutoDelay(250);
            robot.keyRelease( keyCode );
            
		}
		
		robot.setAutoDelay(250);
		
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
		Actions act = new Actions(m_Driver);
	  	act.sendKeys(Keys.ARROW_DOWN).perform();
	  	act.sendKeys(Keys.ARROW_DOWN).perform();
	  	act.sendKeys(Keys.ENTER).perform();
	  	
 		WebElement ele1=getWebElement(entry7xpath);
 		LedgerEntered_7=ele1.getAttribute("value");
 		expected_entry.add(6, ele1.getAttribute("value"));
 	    //System.out.println(LedgerEntered_7);
 	   Reporter.log("ledger 7 entered :"+LedgerEntered_7, true);
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
 		//WebElement ele1=getWebElement(debit7xpath);
 		//debit7=Double.parseDouble(ele1.getAttribute("value"));;
 		//amt.add(ele1.getAttribute("value"));
 		amt.add(6,Debit7);
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
 		amt.add(6, ele1.getAttribute("value"));
 		//Assert.assertEquals(String.valueOf(credit11), Credit11);
 	
		m_Driver.switchTo().defaultContent();

 		
  		 ExtentReportManager.passStep(m_Driver, "Enter_Credit7 " + Credit7);

  		 TestModellerLogger.PassStep(m_Driver, "Enter_Credit7 " + Credit7);
 	}

      
	/**
 	 * Enter Note_7
     * @name Enter Note_7
     */
 	public void Enter_Note7(String Note7)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_cPH_journalmodal1Iframe1']")));

 		WebElement elem = getWebElement(Note7Elem);

		if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Note7", "Enter_Note7 failed. Unable to locate object: " + Note7Elem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Note7", "Enter_Note7 failed. Unable to locate object: " + Note7Elem.toString());

 			Assert.fail("Unable to locate object: " + Note7Elem.toString());
         }

 		elem.sendKeys(Note7);
 	
		m_Driver.switchTo().defaultContent();

 		
  		 ExtentReportManager.passStep(m_Driver, "Enter_Note7 " + Note7);

  		 TestModellerLogger.PassStep(m_Driver, "Enter_Note7 " + Note7);
 	}

      
	/**
 	 * Enter Account_8
	 * @throws Exception 
	 * @throws NoSuchFieldException 
     * @name Enter Account_8
     */
 	public void Enter_Account8(String Account8) throws NoSuchFieldException, Exception
 	{
 		//ledger8=Account8;
 		ledger.add(7, Account8);
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_cPH_journalmodal1Iframe1']")));

 		WebElement elem = getWebElement(Account8Elem);

		if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Account8", "Enter_Account8 failed. Unable to locate object: " + Account8Elem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Account8", "Enter_Account8 failed. Unable to locate object: " + Account8Elem.toString());

 			Assert.fail("Unable to locate object: " + Account8Elem.toString());
         }

		WaitStatementLib wt=new WaitStatementLib();
		wt.explicitWait_elementToBeClickable(m_Driver, 20, elem);
		elem.click();
		
		wt.explicitiWait_presenceOfElementLocated(m_Driver, 20, By.xpath("//ul[@id='select2-ctl00_cPH_rptRecord_ctl07_ltAccount-results']/li/ul/li[starts-with(text(), '"+Account8+" - "+"')]"));
		
		//wt.explicitWait_elementToBeClickable(m_Driver, 20, m_Driver.findElement(By.xpath("//ul[@id='ctl00_cPH_rptRecord_ctl06_AccountUC1_AutoCompleteExtender1_completionListElem']/li[starts-with(text(), '"+Account7+" -"+"')]")));
		WebElement elemc= m_Driver.findElement(By.xpath("//ul[@id='select2-ctl00_cPH_rptRecord_ctl07_ltAccount-results']/li/ul/li[starts-with(text(), '"+Account8+" - "+"')]"));
		elemc.click();
 	  
		WebElement ele1=getWebElement(entry8xpath);
 		LedgerEntered_8=ele1.getAttribute("title");
 		expected_entry.add(7, ele1.getAttribute("title"));
 	    //System.out.println(LedgerEntered_7);
 	   Reporter.log("ledger 8 entered :"+LedgerEntered_8, true);
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
 		amt.add(ele1.getAttribute("value"));
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
 		amt.add(7, ele1.getAttribute("value"));
 		//Assert.assertEquals(String.valueOf(credit11), Credit11);
 	
		m_Driver.switchTo().defaultContent();
 		
  		 ExtentReportManager.passStep(m_Driver, "Enter_Credit8 " + Credit8);

  		 TestModellerLogger.PassStep(m_Driver, "Enter_Credit8 " + Credit8);
 	}

      
	/**
 	 * Enter Note_8
     * @name Enter Note_8
     */
 	public void Enter_Note8(String Note8)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_cPH_journalmodal1Iframe1']")));

 		WebElement elem = getWebElement(Note8Elem);

		if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Note8", "Enter_Note8 failed. Unable to locate object: " + Note8Elem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Note8", "Enter_Note8 failed. Unable to locate object: " + Note8Elem.toString());

 			Assert.fail("Unable to locate object: " + Note8Elem.toString());
         }

 		elem.sendKeys(Note8);
 	
		m_Driver.switchTo().defaultContent();

 		
  		 ExtentReportManager.passStep(m_Driver, "Enter_Note8 " + Note8);

  		 TestModellerLogger.PassStep(m_Driver, "Enter_Note8 " + Note8);
 	}

      
	/**
 	 * Enter Account_9
	 * @throws Exception 
	 * @throws IllegalArgumentException 
     * @name Enter Account_9
     */
 	public void Enter_Account9(String Account9) throws IllegalArgumentException, Exception
 	{
 		//ledger9=Account9;
 		ledger.add(8, Account9);
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_cPH_journalmodal1Iframe1']")));

 		WebElement elem = getWebElement(Account9Elem);

		if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Account9", "Enter_Account9 failed. Unable to locate object: " + Account9Elem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Account9", "Enter_Account9 failed. Unable to locate object: " + Account9Elem.toString());

 			Assert.fail("Unable to locate object: " + Account9Elem.toString());
         }

		WaitStatementLib wt=new WaitStatementLib();
		wt.explicitWait_elementToBeClickable(m_Driver, 20, elem);
		elem.click();
		
		wt.explicitiWait_presenceOfElementLocated(m_Driver, 20, By.xpath("//ul[@id='select2-ctl00_cPH_rptRecord_ctl08_ltAccount-results']/li/ul/li[starts-with(text(), '"+Account9+" - "+"')]"));
		
		//wt.explicitWait_elementToBeClickable(m_Driver, 20, m_Driver.findElement(By.xpath("//ul[@id='ctl00_cPH_rptRecord_ctl06_AccountUC1_AutoCompleteExtender1_completionListElem']/li[starts-with(text(), '"+Account7+" -"+"')]")));
		WebElement elemc= m_Driver.findElement(By.xpath("//ul[@id='select2-ctl00_cPH_rptRecord_ctl08_ltAccount-results']/li/ul/li[starts-with(text(), '"+Account9+" - "+"')]"));
		elemc.click();
 	  
		WebElement ele1=getWebElement(entry9xpath);
 		LedgerEntered_9=ele1.getAttribute("title");
 		expected_entry.add(8, ele1.getAttribute("title"));
 	    //System.out.println(LedgerEntered_7);
 	   Reporter.log("ledger 9 entered :"+LedgerEntered_9, true);
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
 	//	WebElement ele1=getWebElement(debit9xpath);
 		//debit9=Double.parseDouble(ele1.getAttribute("value"));;
 		//amt.add(ele1.getAttribute("value"));
 		amt.add(8,Debit9);
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
 		amt.add(8, ele1.getAttribute("value"));
 		//Assert.assertEquals(String.valueOf(credit11), Credit11);
 	
		m_Driver.switchTo().defaultContent();

 		
  		 ExtentReportManager.passStep(m_Driver, "Enter_Credit9 " + Credit9);

  		 TestModellerLogger.PassStep(m_Driver, "Enter_Credit9 " + Credit9);
 	}

      
	/**
 	 * Enter Note_9
     * @name Enter Note_9
     */
 	public void Enter_Note9(String Note9)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_cPH_journalmodal1Iframe1']")));

 		WebElement elem = getWebElement(Note9Elem);

		if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Note9", "Enter_Note9 failed. Unable to locate object: " + Note9Elem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Note9", "Enter_Note9 failed. Unable to locate object: " + Note9Elem.toString());

 			Assert.fail("Unable to locate object: " + Note9Elem.toString());
         }

 		elem.sendKeys(Note9);
 	
		m_Driver.switchTo().defaultContent();

 		
  		 ExtentReportManager.passStep(m_Driver, "Enter_Note9 " + Note9);

  		 TestModellerLogger.PassStep(m_Driver, "Enter_Note9 " + Note9);
 	}

      
	/**
 	 * Enter Account_10
	 * @throws Exception 
	 * @throws NoSuchFieldException 
     * @name Enter Account_10
     */
 	public void Enter_Account10(String Account10) throws NoSuchFieldException, Exception
 	{
 		//ledger10=Account10;
 		ledger.add(9, Account10);
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_cPH_journalmodal1Iframe1']")));

 		WebElement elem = getWebElement(Account10Elem);

		if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Account10", "Enter_Account10 failed. Unable to locate object: " + Account10Elem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Account10", "Enter_Account10 failed. Unable to locate object: " + Account10Elem.toString());

 			Assert.fail("Unable to locate object: " + Account10Elem.toString());
         }

		WaitStatementLib wt=new WaitStatementLib();
		wt.explicitWait_elementToBeClickable(m_Driver, 20, elem);
		elem.click();
		
		wt.explicitiWait_presenceOfElementLocated(m_Driver, 20, By.xpath("//ul[@id='select2-ctl00_cPH_rptRecord_ctl09_ltAccount-results']/li/ul/li[starts-with(text(), '"+Account10+" - "+"')]"));
		
		//wt.explicitWait_elementToBeClickable(m_Driver, 20, m_Driver.findElement(By.xpath("//ul[@id='ctl00_cPH_rptRecord_ctl06_AccountUC1_AutoCompleteExtender1_completionListElem']/li[starts-with(text(), '"+Account7+" -"+"')]")));
		WebElement elemc= m_Driver.findElement(By.xpath("//ul[@id='select2-ctl00_cPH_rptRecord_ctl09_ltAccount-results']/li/ul/li[starts-with(text(), '"+Account10+" - "+"')]"));
		elemc.click();
 	  
		WebElement ele1=getWebElement(entry10xpath);
 		LedgerEntered_10=ele1.getAttribute("title");
 		expected_entry.add(9, ele1.getAttribute("title"));
 	    //System.out.println(LedgerEntered_7);
 	   Reporter.log("ledger 10 entered :"+LedgerEntered_10, true);
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
 		amt.add(ele1.getAttribute("value"));
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
 	//	WebElement ele1=getWebElement(credit10xpath);
 		//credit10=Double.parseDouble(ele1.getAttribute("value"));
 	//	amt.add(9, ele1.getAttribute("value"));
 		amt.add(9,Credit10);
 		//Assert.assertEquals(String.valueOf(credit11), Credit11);
 	
		m_Driver.switchTo().defaultContent();
 		
  		 ExtentReportManager.passStep(m_Driver, "Enter_Credit10 " + Credit10);

  		 TestModellerLogger.PassStep(m_Driver, "Enter_Credit10 " + Credit10);
 	}

      
	/**
 	 * Enter Note_10
     * @name Enter Note_10
     */
 	public void Enter_Note10(String Note10)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_cPH_journalmodal1Iframe1']")));

 		WebElement elem = getWebElement(Note10Elem);

		if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Note10", "Enter_Note10 failed. Unable to locate object: " + Note10Elem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Note10", "Enter_Note10 failed. Unable to locate object: " + Note10Elem.toString());

 			Assert.fail("Unable to locate object: " + Note10Elem.toString());
         }

 		elem.sendKeys(Note10);
 	
		m_Driver.switchTo().defaultContent();

 		
  		 ExtentReportManager.passStep(m_Driver, "Enter_Note10 " + Note10);

  		 TestModellerLogger.PassStep(m_Driver, "Enter_Note10 " + Note10);
 	}

      
	/**
 	 * Enter Account_11
	 * @throws SecurityException 
	 * @throws NoSuchFieldException 
	 * @throws Exception 
	 * @throws IllegalArgumentException 
     * @name Enter Account_11
     */
 	public void Enter_Account11(String Account11) throws NoSuchFieldException, SecurityException, IllegalArgumentException, Exception
 	{
 		//ledger11=Account11;
 		ledger.add(10, Account11);
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_cPH_journalmodal1Iframe1']")));

 		WebElement elem = getWebElement(Account11Elem);

		if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Account11", "Enter_Account11 failed. Unable to locate object: " + Account11Elem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Account11", "Enter_Account11 failed. Unable to locate object: " + Account11Elem.toString());

 			Assert.fail("Unable to locate object: " + Account11Elem.toString());
         }

 		//elem.sendKeys(Account11);
		WaitStatementLib wt=new WaitStatementLib();
		wt.explicitWait_elementToBeClickable(m_Driver, 20, elem);
		elem.click();
		wt.explicitiWait_presenceOfElementLocated(m_Driver, 20, By.xpath("//ul[@id='ctl00_cPH_rptRecord_ctl10_AccountUC1_AutoCompleteExtender1_completionListElem']/li[starts-with(text(), '"+Account11+" -"+"')]"));
		
		
		//wt.explicitWait_elementToBeClickable(m_Driver, 20, m_Driver.findElement(By.xpath("//ul[@id='ctl00_cPH_rptRecord_ctl00_AccountUC1_AutoCompleteExtender1_completionListElem']/li[starts-with(text(), '"+Account9+" -"+"')]")));
		WebElement elemc= m_Driver.findElement(By.xpath("//ul[@id='ctl00_cPH_rptRecord_ctl10_AccountUC1_AutoCompleteExtender1_completionListElem']/li[starts-with(text(), '"+Account11+" -"+"')]"));
		elemc.click();
		/*String[] yy = Account11.split("");
		for (String string : yy) {
			String variableName = "VK_" + string;

            Class<KeyEvent> clazz = KeyEvent.class;
            Field field = clazz.getField( variableName );
            int keyCode = field.getInt(null);
            robot.setAutoDelay(250);
            robot.keyPress( keyCode );
            robot.setAutoDelay(250);
            robot.keyRelease( keyCode );
            
		}
		
		robot.setAutoDelay(250);*/
		
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
 		LedgerEntered_11=ele1.getAttribute("value");
 		expected_entry.add(10, ele1.getAttribute("value"));
 	    //System.out.println(LedgerEntered_11);
 	    Reporter.log("ledger 11 entered :"+LedgerEntered_11, true);
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
 		amt.add(ele1.getAttribute("value"));
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
 		amt.add(ele1.getAttribute("value"));
 		//Assert.assertEquals(String.valueOf(credit11), Credit11);
 	
		m_Driver.switchTo().defaultContent();

 		
  		 ExtentReportManager.passStep(m_Driver, "Enter_Credit11 " + Credit11);

  		 TestModellerLogger.PassStep(m_Driver, "Enter_Credit11 " + Credit11);
 	}

      
	/**
 	 * Enter Note_11
     * @name Enter Note_11
     */
 	public void Enter_Note11(String Note11)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_cPH_journalmodal1Iframe1']")));

 		WebElement elem = getWebElement(Note11Elem);

		if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Note11", "Enter_Note11 failed. Unable to locate object: " + Note11Elem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Note11", "Enter_Note11 failed. Unable to locate object: " + Note11Elem.toString());

 			Assert.fail("Unable to locate object: " + Note11Elem.toString());
         }

 		elem.sendKeys(Note11);
 	
		m_Driver.switchTo().defaultContent();

 		
  		 ExtentReportManager.passStep(m_Driver, "Enter_Note11 " + Note11);

  		 TestModellerLogger.PassStep(m_Driver, "Enter_Note11 " + Note11);
 	}

     
	/**
 	 * Click  Save 
	 * @throws InterruptedException 
     * @name Click  Save 
     */
public void Click__Save_() throws InterruptedException	{
	m_Driver.switchTo().frame(getWebElement(By.id("ctl00_cPH_journalmodal1Iframe1")));

	WebElement elem = getWebElement(_Save_Elem);

	if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Save_", "Click__Save_ failed. Unable to locate object: " + _Save_Elem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Save_", "Click__Save_ failed. Unable to locate object: " + _Save_Elem.toString());

			Assert.fail("Unable to locate object: " + _Save_Elem.toString());
        }
    sl.ScrollHeight(m_Driver);
    elem.click();
        
    m_Driver.switchTo().defaultContent();
  	Thread.sleep(2000);

	ExtentReportManager.passStep(m_Driver, "Click__Save_");

	TestModellerLogger.PassStep(m_Driver, "Click__Save_");
}

public void journalentry2_way2(String Account, int no) throws Exception, SecurityException {
	//List<WebElement> elements = m_Driver.findElements(By.xpath("//div/div/div/div/div/div/table/tbody[2]/tr/td[1]"));
	//int size = elements.size();
	Thread.sleep(2000);
	
	for (int i = 0; i < no; i++) {
		int j=i+1;
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_cPH_journalmodal1Iframe1']")));

		By Accountele = By.xpath("//*[@id=\"ctl00_cPH_rptRecord_ctl0"+i+"_AccountUC1_txtAccount\"]");
		robot = new Robot();
 	    //ledger11=Account; 
 	    ledger.add(0, Account);
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
		By Accountele1 = By.xpath("//*[@id=\"ctl00_cPH_rptRecord_ctl0"+i+"_AccountUC1_txtAccount\"]");
		WebElement elem1 = getWebElement(Accountele1);
		expected_entry.add(i, elem1.getAttribute("value"));
 	    //System.out.println(expected_entry1.get(i));
 	    Reporter.log("ledger1 code entered : "+expected_entry.get(i),true);
		m_Driver.switchTo().defaultContent();

 		
  		 //ExtentReportManager.passStep(m_Driver, "Enter_Account1 " + Account1);

  		 //TestModellerLogger.PassStep(m_Driver, "Enter_Account1 " + Account1);
		
	}
	
}

public void verify_ProfitLoss_CostOfSale_6000_6090() {
	List<WebElement> elements = m_Driver.findElements(By.xpath("//tbody/tr/td/a/span[1][contains(text(),'')]"));
    int size = elements.size();
    System.out.println(size);
    for (int i = 0; i <size-1; i++) {
    	WebElement ele1=m_Driver.findElement(By.xpath("//tbody/tr/td/a/span[1][contains(text(),'"+ledger.get(i)+"')]"));
    	String led = ele1.getText();
    	WebElement ele2=m_Driver.findElement(By.xpath("//tbody/tr/td/a/span[1][contains(text(),'"+ledger.get(i)+"')]/following-sibling::span"));
    	String led_text = ele2.getText();
    	String actualledger=led+"   "+led_text;
    	System.out.println(actualledger);
    	String expectedledger = expected_entry.get(i);
    	Assert.assertEquals(actualledger.trim().replaceAll("-", " "), expectedledger.replaceAll("-"," ").trim());
    	Reporter.log("Ledger code verified: "+actualledger);
    	
    	WebElement amount=m_Driver.findElement(By.xpath("//tbody/tr/td/a/span[1][contains(text(),'"+ledger.get(i)+"')]/ancestor::td/following-sibling::td[2]"));
    	String xx = amount.getText();
    	String yy = amt.get(i)+".00";
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
public void verify_ProfitLoss_NonTradingIncome41004112() {
	List<WebElement> elements = m_Driver.findElements(By.xpath("//tbody/tr/td/a/span[1][contains(text(),'')]"));
    int size = elements.size();
    System.out.println(size);
    for (int i = 0; i <size-1; i++) {
    	WebElement ele1=m_Driver.findElement(By.xpath("//tbody/tr/td/a/span[1][contains(text(),'"+ledger.get(i)+"')]"));
    	String led = ele1.getText();
    	WebElement ele2=m_Driver.findElement(By.xpath("//tbody/tr/td/a/span[1][contains(text(),'"+ledger.get(i)+"')]/following-sibling::span"));
    	String led_text = ele2.getText();
    	String actualledger=led+"   "+led_text;
    	System.out.println(actualledger);
    	String expectedledger = expected_entry.get(i);
    	Assert.assertEquals(actualledger.trim().replaceAll("-", " "), expectedledger.replaceAll("-"," ").trim());
    	Reporter.log("Ledger code verified: "+actualledger);
    	
    	WebElement amount=m_Driver.findElement(By.xpath("//tbody/tr/td/a/span[1][contains(text(),'"+ledger.get(i)+"')]/ancestor::td/following-sibling::td[2]"));
    	String xx = amount.getText();
    	String yy = amt.get(i)+".00";
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
    	WebElement ele1=m_Driver.findElement(By.xpath("//tbody/tr/td/a/span[1][contains(text(),'"+ledger.get(i)+"')]"));
    	String led = ele1.getText();
    	WebElement ele2=m_Driver.findElement(By.xpath("//tbody/tr/td/a/span[1][contains(text(),'"+ledger.get(i)+"')]/following-sibling::span"));
    	String led_text = ele2.getText();
    	String actualledger=led+"   "+led_text;
    	System.out.println(actualledger);
    	String expectedledger = expected_entry.get(i);
    	Assert.assertEquals(actualledger.trim().replaceAll("-", " "), expectedledger.replaceAll("-"," ").trim());
    	Reporter.log("Ledger code verified: "+actualledger);
    	
    	WebElement amount=m_Driver.findElement(By.xpath("//tbody/tr/td/a/span[1][contains(text(),'"+ledger.get(i)+"')]/ancestor::td/following-sibling::td[2]"));
    	String xx = amount.getText();
    	String yy = amt.get(i)+".00";
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
public void verify_ProfitLoss_ExpenseType_7021_7203(){
	List<WebElement> elements = m_Driver.findElements(By.xpath("//tbody/tr/td/a/span[1][contains(text(),'')]"));
    int size = elements.size();
    System.out.println(size);
    for (int i = 0; i <size-1; i++) {
    	WebElement ele1=m_Driver.findElement(By.xpath("//tbody/tr/td/a/span[1][contains(text(),'"+ledger.get(i)+"')]"));
    	String led = ele1.getText();
    	WebElement ele2=m_Driver.findElement(By.xpath("//tbody/tr/td/a/span[1][contains(text(),'"+ledger.get(i)+"')]/following-sibling::span"));
    	String led_text = ele2.getText();
    	String actualledger=led+"   "+led_text;
    	System.out.println(actualledger);
    	String expectedledger = expected_entry.get(i);
    	Assert.assertEquals(actualledger.trim().replaceAll("-", " "), expectedledger.replaceAll("-"," ").trim());
    	Reporter.log("Ledger code verified: "+actualledger);
    	
    	WebElement amount=m_Driver.findElement(By.xpath("//tbody/tr/td/a/span[1][contains(text(),'"+ledger.get(i)+"')]/ancestor::td/following-sibling::td[2]"));
    	String xx = amount.getText();
    	String yy = amt.get(i)+".00";
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
public void verify_ProfitLoss_ExpenseType_7204_7254(){
	List<WebElement> elements = m_Driver.findElements(By.xpath("//tbody/tr/td/a/span[1][contains(text(),'')]"));
    int size = elements.size();
    System.out.println(size);
    for (int i = 0; i <size-1; i++) {
    	WebElement ele1=m_Driver.findElement(By.xpath("//tbody/tr/td/a/span[1][contains(text(),'"+ledger.get(i)+"')]"));
    	String led = ele1.getText();
    	WebElement ele2=m_Driver.findElement(By.xpath("//tbody/tr/td/a/span[1][contains(text(),'"+ledger.get(i)+"')]/following-sibling::span"));
    	String led_text = ele2.getText();
    	String actualledger=led+"   "+led_text;
    	System.out.println(actualledger);
    	String expectedledger = expected_entry.get(i);
    	Assert.assertEquals(actualledger.trim().replaceAll("-", " "), expectedledger.replaceAll("-"," ").trim());
    	Reporter.log("Ledger code verified: "+actualledger);
    	
    	WebElement amount=m_Driver.findElement(By.xpath("//tbody/tr/td/a/span[1][contains(text(),'"+ledger.get(i)+"')]/ancestor::td/following-sibling::td[2]"));
    	String xx = amount.getText();
    	String yy = amt.get(i)+".00";
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
public void verify_ProfitLoss_Expense_7255_7267() {
	List<WebElement> elements = m_Driver.findElements(By.xpath("//tbody/tr/td/a/span[1][contains(text(),'')]"));
    int size = elements.size();
    System.out.println(size);
    for (int i = 0; i <size-1; i++) {
    	
    	if (i==5) {
    		int j = i+1;
    		WebElement ele1=m_Driver.findElement(By.xpath("//tbody/tr/td/a/span[1][contains(text(),'"+ledger.get(i)+"')]"));
        	String led = ele1.getText();
        	WebElement ele2=m_Driver.findElement(By.xpath("//tbody/tr/td/a/span[1][contains(text(),'"+ledger.get(i)+"')]/following-sibling::span"));
        	String led_text = ele2.getText();
        	String actualledger=led+"   "+led_text;
        	System.out.println(actualledger);
        	String expectedledger = expected_entry.get(i);
        	Assert.assertEquals(actualledger.trim().replaceAll("-", " "), expectedledger.replaceAll("-"," ").trim());
        	Reporter.log("Ledger code verified: "+actualledger);
        	
        	WebElement amount=m_Driver.findElement(By.xpath("//tbody/tr/td/a/span[1][contains(text(),'"+ledger.get(i)+"')]/ancestor::td/following-sibling::td[2]"));
        	String xx = amount.getText();
        	double mAmt = Double.parseDouble(amt.get(i))+Double.parseDouble(amt.get(j));
        	//String yy = +".00";
        	//System.out.println(xx);
        	//System.out.println(yy);
        	String[] z = amount.getText().split("", 3);
        	if (z[0].equals("(")) {
        		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(2,9),  String.format("%.2f",mAmt));
    		} else {
    			Assert.assertEquals(amount.getText().replaceAll(",", ""), String.format("%.2f",mAmt));
    		}
        	Reporter.log("Amount enter verified: "+amount.getText());
        	sl.ScrollToElement(m_Driver, ele1);
		} 
    	else if (i==6) {
			break;
		}else {
			WebElement ele1=m_Driver.findElement(By.xpath("//tbody/tr/td/a/span[1][contains(text(),'"+ledger.get(i)+"')]"));
	    	String led = ele1.getText();
	    	WebElement ele2=m_Driver.findElement(By.xpath("//tbody/tr/td/a/span[1][contains(text(),'"+ledger.get(i)+"')]/following-sibling::span"));
	    	String led_text = ele2.getText();
	    	String actualledger=led+"   "+led_text;
	    	System.out.println(actualledger);
	    	String expectedledger = expected_entry.get(i);
	    	Assert.assertEquals(actualledger.trim().replaceAll("-", " "), expectedledger.replaceAll("-"," ").trim());
	    	Reporter.log("Ledger code verified: "+actualledger);
	    	
	    	WebElement amount=m_Driver.findElement(By.xpath("//tbody/tr/td/a/span[1][contains(text(),'"+ledger.get(i)+"')]/ancestor::td/following-sibling::td[2]"));
	    	String xx = amount.getText();
	    	String yy = amt.get(i)+".00";
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
	}
    Reporter.log("Enteries are Verified on Profit and loss Report page :", true);
}
public void verify_ProfitLoss_ExpenseType_7268_7401(){
	List<WebElement> elements = m_Driver.findElements(By.xpath("//tbody/tr/td/a/span[1][contains(text(),'')]"));
    int size = elements.size();
    System.out.println(size);
    int cnt = expected_entry.size();
    String[] req_led=new String[10];
    for (int i = 0; i < cnt-1; i++) {
    	String vent=expected_entry.get(i);
    	System.out.println(vent);
		String[] xxx = vent.split("-", 2);
	    req_led[i] = xxx[1].replaceFirst(" ", "");
	}
    for (int i = 0; i <size-1; i++) {
    	if (i==0) {
    		//String led = eles1.get(i).getText();
        	WebElement eles2 = m_Driver.findElement(By.xpath("//tbody/tr/td/a/span[2][contains(text(),'"+req_led[i]+"')]"));
        	//String led_text = eles2.get(i).getText();
        	//String actualledger=led+"   "+led_text;
        	String actualledger=eles2.getText();
        	System.out.println(actualledger);
        	String expectedledger = expected_entry.get(i).split("-", 2)[1].replaceFirst(" ", "");
        	Assert.assertEquals(actualledger.trim().replaceAll("-", " "), expectedledger.replaceAll("-"," ").trim());
        	Reporter.log("Ledger code verified: "+actualledger);
        	
        	 WebElement amounts = m_Driver.findElement(By.xpath("//tbody/tr/td/a/span[2][contains(text(),'"+req_led[i]+"')]/ancestor::td/following-sibling::td[2]/a"));
        	String xx = amounts.getText();
        	String yy = amt.get(i)+".00";
        	
        	String[] z = amounts.getText().split("", 3);
        	if (z[0].equals("(")) {
        		Assert.assertEquals(amounts.getText().replaceAll(",", "").substring(2,9), yy);
    		} else {
    			Assert.assertEquals(amounts.getText().replaceAll(",", ""), yy);
    		}
        	Reporter.log("Amount enter verified: "+amounts.getText(),true);
        	sl.ScrollToElement(m_Driver, amounts);
		} else {
			WebElement ele1=m_Driver.findElement(By.xpath("//tbody/tr/td/a/span[1][contains(text(),'"+ledger.get(i)+"')]"));
	    	String led = ele1.getText();
	    	WebElement ele2=m_Driver.findElement(By.xpath("//tbody/tr/td/a/span[1][contains(text(),'"+ledger.get(i)+"')]/following-sibling::span"));
	    	String led_text = ele2.getText();
	    	String actualledger=led+"   "+led_text;
	    	System.out.println(actualledger);
	    	String expectedledger = expected_entry.get(i);
	    	Assert.assertEquals(actualledger.trim().replaceAll("-", " "), expectedledger.replaceAll("-"," ").trim());
	    	Reporter.log("Ledger code verified: "+actualledger);
	    	
	    	WebElement amount=m_Driver.findElement(By.xpath("//tbody/tr/td/a/span[1][contains(text(),'"+ledger.get(i)+"')]/ancestor::td/following-sibling::td[2]"));
	    	String xx = amount.getText();
	    	String yy = amt.get(i)+".00";
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
	}	
    Reporter.log("Enteries are Verified on Profit and loss Report page :", true);
}
public void verify_ProfitLoss_ExpenseType_7402_7525(){
	List<WebElement> elements = m_Driver.findElements(By.xpath("//tbody/tr/td/a/span[1][contains(text(),'')]"));
    int size = elements.size();
    System.out.println(size);
    for (int i = 0; i <size-1; i++) {
    	WebElement ele1=m_Driver.findElement(By.xpath("//tbody/tr/td/a/span[1][contains(text(),'"+ledger.get(i)+"')]"));
    	String led = ele1.getText();
    	WebElement ele2=m_Driver.findElement(By.xpath("//tbody/tr/td/a/span[1][contains(text(),'"+ledger.get(i)+"')]/following-sibling::span"));
    	String led_text = ele2.getText();
    	String actualledger=led+"   "+led_text;
    	System.out.println(actualledger);
    	String expectedledger = expected_entry.get(i);
    	Assert.assertEquals(actualledger.trim().replaceAll("-", " "), expectedledger.replaceAll("-"," ").trim());
    	Reporter.log("Ledger code verified: "+actualledger);
    	
    	WebElement amount=m_Driver.findElement(By.xpath("//tbody/tr/td/a/span[1][contains(text(),'"+ledger.get(i)+"')]/ancestor::td/following-sibling::td[2]"));
    	String xx = amount.getText();
    	String yy = amt.get(i)+".00";
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

public void verify_ProfitLoss_ExpenseType_7628_7925(){
	List<WebElement> elements = m_Driver.findElements(By.xpath("//tbody/tr/td/a/span[1][contains(text(),'')]"));
    int size = elements.size();
    System.out.println(size);
    for (int i = 0; i <size-1; i++) {
    	WebElement ele1=m_Driver.findElement(By.xpath("//tbody/tr/td/a/span[1][contains(text(),'"+ledger.get(i)+"')]"));
    	String led = ele1.getText();
    	WebElement ele2=m_Driver.findElement(By.xpath("//tbody/tr/td/a/span[1][contains(text(),'"+ledger.get(i)+"')]/following-sibling::span"));
    	String led_text = ele2.getText();
    	String actualledger=led+"   "+led_text;
    	System.out.println(actualledger);
    	String expectedledger = expected_entry.get(i);
    	Assert.assertEquals(actualledger.trim().replaceAll("-", " "), expectedledger.replaceAll("-"," ").trim());
    	Reporter.log("Ledger code verified: "+actualledger);
    	
    	WebElement amount=m_Driver.findElement(By.xpath("//tbody/tr/td/a/span[1][contains(text(),'"+ledger.get(i)+"')]/ancestor::td/following-sibling::td[2]"));
    	String xx = amount.getText();
    	String yy = amt.get(i)+".00";
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
public void verify_ProfitLoss_ExpenseType_7525_7627(){
	List<WebElement> elements = m_Driver.findElements(By.xpath("//tbody/tr/td/a/span[1][contains(text(),'')]"));
    int size = elements.size();
    System.out.println(size);
    for (int i = 0; i <size-1; i++) {
    	if (i<=3) {
    		 List<WebElement> eles1 = m_Driver.findElements(By.xpath("//tbody/tr/td/a/span[1][contains(text(),'"+ledger.get(i)+"')]"));
        	String led = eles1.get(i).getText();
        	 List<WebElement> eles2 = m_Driver.findElements(By.xpath("//tbody/tr/td/a/span[1][contains(text(),'"+ledger.get(i)+"')]/following-sibling::span"));
        	String led_text = eles2.get(i).getText();
        	String actualledger=led+"   "+led_text;
        	System.out.println(actualledger);
        	String expectedledger = expected_entry.get(i);
        	Assert.assertEquals(actualledger.trim().replaceAll("-", " "), expectedledger.replaceAll("-"," ").trim());
        	Reporter.log("Ledger code verified: "+actualledger);
        	
        	 List<WebElement> amounts = m_Driver.findElements(By.xpath("//tbody/tr/td/a/span[1][contains(text(),'"+ledger.get(i)+"')]/ancestor::td/following-sibling::td[2]"));
        	String xx = amounts.get(i).getText();
        	String yy = amt.get(i)+".00";
        	System.out.println(xx);
        	System.out.println(yy);
        	String[] z = amounts.get(i).getText().split("", 3);
        	if (z[0].equals("(")) {
        		Assert.assertEquals(amounts.get(i).getText().replaceAll(",", "").substring(2,9), yy);
    		} else {
    			Assert.assertEquals(amounts.get(i).getText().replaceAll(",", ""), yy);
    		}
        	Reporter.log("Amount enter verified: "+amounts.get(i).getText());
        	sl.ScrollToElement(m_Driver, amounts.get(i));
		}else {
			WebElement ele1=m_Driver.findElement(By.xpath("//tbody/tr/td/a/span[1][contains(text(),'"+ledger.get(i)+"')]"));
	    	String led = ele1.getText();
	    	WebElement ele2=m_Driver.findElement(By.xpath("//tbody/tr/td/a/span[1][contains(text(),'"+ledger.get(i)+"')]/following-sibling::span"));
	    	String led_text = ele2.getText();
	    	String actualledger=led+"   "+led_text;
	    	System.out.println(actualledger);
	    	String expectedledger = expected_entry.get(i);
	    	Assert.assertEquals(actualledger.trim().replaceAll("-", " "), expectedledger.replaceAll("-"," ").trim());
	    	Reporter.log("Ledger code verified: "+actualledger);
	    	
	    	WebElement amount=m_Driver.findElement(By.xpath("//tbody/tr/td/a/span[1][contains(text(),'"+ledger.get(i)+"')]/ancestor::td/following-sibling::td[2]"));
	    	String xx = amount.getText();
	    	String yy = amt.get(i)+".00";
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
		}
    	
    Reporter.log("Enteries are Verified on Profit and loss Report page :", true);
}

public void verify_ProfitLoss_ExpenseType_7015_7016_7926(){
	//List<WebElement> elements = m_Driver.findElements(By.xpath("//tbody/tr/td/a/span[1][contains(text(),'')]"));
    //int size = elements.size();
    //System.out.println(size);
    int cnt = expected_entry.size();
    String[] req_led=new String[10];
    for (int i = 0; i < cnt; i++) {
    	String vent=expected_entry.get(i);
    	System.out.println(vent);
		String[] xxx = vent.split("-", 2);
	    req_led[i] = xxx[1].replaceFirst(" ", "");
	}
    
    for (int i = 0; i <cnt-1; i++) {
    	//if (i<=4) {
    		 //List<WebElement> eles1 = m_Driver.findElements(By.xpath("//tbody/tr/td/a/span[1][contains(text(),'"+req_led[i]+"')]"));
//for (WebElement webElement : eles1) {
	//System.out.println(webElement);
//}
        	//String led = eles1.get(i).getText();
        	WebElement eles2 = m_Driver.findElement(By.xpath("//tbody/tr/td/a/span[2][contains(text(),'"+req_led[i]+"')]"));
        	//String led_text = eles2.get(i).getText();
        	//String actualledger=led+"   "+led_text;
        	String actualledger=eles2.getText();
        	System.out.println(actualledger);
        	String expectedledger = expected_entry.get(i).split("-", 2)[1].replaceFirst(" ", "");
        	Assert.assertEquals(actualledger.trim().replaceAll("-", " "), expectedledger.replaceAll("-"," ").trim());
        	Reporter.log("Ledger code verified: "+actualledger);
        	
        	 WebElement amounts = m_Driver.findElement(By.xpath("//tbody/tr/td/a/span[2][contains(text(),'"+req_led[i]+"')]/ancestor::td/following-sibling::td[2]/a"));
        	String xx = amounts.getText();
        	String yy = amt.get(i)+".00";
        	
        	String[] z = amounts.getText().split("", 3);
        	if (z[0].equals("(")) {
        		Assert.assertEquals(amounts.getText().replaceAll(",", "").substring(2,9), yy);
    		} else {
    			Assert.assertEquals(amounts.getText().replaceAll(",", ""), yy);
    		}
        	Reporter.log("Amount enter verified: "+amounts.getText(),true);
        	sl.ScrollToElement(m_Driver, amounts);
		//}
    	/*else {
			WebElement ele1=m_Driver.findElement(By.xpath("//tbody/tr/td/a/span[1][contains(text(),'"+expected_entry.get(i)+"')]"));
	    	String led = ele1.getText();
	    	WebElement ele2=m_Driver.findElement(By.xpath("//tbody/tr/td/a/span[1][contains(text(),'"+expected_entry.get(i)+"')]/following-sibling::span"));
	    	String led_text = ele2.getText();
	    	String actualledger=led+"   "+led_text;
	    	System.out.println(actualledger);
	    	String expectedledger = expected_entry.get(i);
	    	Assert.assertEquals(actualledger.trim().replaceAll("-", " "), expectedledger.replaceAll("-"," ").trim());
	    	Reporter.log("Ledger code verified: "+actualledger);
	    	
	    	WebElement amount=m_Driver.findElement(By.xpath("//tbody/tr/td/a/span[1][contains(text(),'"+expected_entry.get(i)+"')]/ancestor::td/following-sibling::td[2]"));
	    	String xx = amount.getText();
	    	String yy = amt.get(i)+".00";
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
		   }*/
		}
    	
    Reporter.log("Enteries are Verified on Profit and loss Report page :", true);
}

public void verify_ProfitLoss_NonTradingItem_7950_7962(){
	List<WebElement> elements = m_Driver.findElements(By.xpath("//tbody/tr/td/a/span[1][contains(text(),'')]"));
    int size = elements.size();
    System.out.println(size);
    for (int i = 0; i <size-1; i++) {
    	WebElement ele1=m_Driver.findElement(By.xpath("//tbody/tr/td/a/span[1][contains(text(),'"+ledger.get(i)+"')]"));
    	String led = ele1.getText();
    	WebElement ele2=m_Driver.findElement(By.xpath("//tbody/tr/td/a/span[1][contains(text(),'"+ledger.get(i)+"')]/following-sibling::span"));
    	String led_text = ele2.getText();
    	String actualledger=led+"   "+led_text;
    	System.out.println(actualledger);
    	String expectedledger = expected_entry.get(i);
    	Assert.assertEquals(actualledger.trim().replaceAll("-", " "), expectedledger.replaceAll("-"," ").trim());
    	Reporter.log("Ledger code verified: "+actualledger);
    	
    	WebElement amount=m_Driver.findElement(By.xpath("//tbody/tr/td/a/span[1][contains(text(),'"+ledger.get(i)+"')]/ancestor::td/following-sibling::td[2]"));
    	String xx = amount.getText();
    	String yy = amt.get(i)+".00";
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


/*BALANCE SHEET*/

 public void verify_BS_FixedAsset_10_19(){
		List<WebElement> elements = m_Driver.findElements(By.xpath("//tbody/tr/td[2]/span[contains(text(),'')]/following-sibling::a"));
	    int size = elements.size();
	    System.out.println(size);
//	    if(size==11)
//	    {
	    for (int i = 0; i <10; i++) {
	    	WebElement ele2=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+ledger.get(i)+"')]/following-sibling::a"));
	    	String led_text = ele2.getText().trim();
	    	System.out.println(led_text);
	    	String[] ledgersplit = expected_entry.get(i).split("-");
	    	String expectedledger = ledgersplit[1].trim();
	    	Assert.assertEquals(ele2.getText().replaceAll("-", " "), expectedledger.replaceAll("-"," "));
	    	Reporter.log("Ledger code verified: "+led_text);
	    	
	    	WebElement amount=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+ledger.get(i)+"')]/parent::td/following-sibling::td/a/span"));
	    	String ActAmt = amount.getText();
	    	String ExpAmt = amt.get(i)+".00";
	    	//System.out.println(xx);
	    	//System.out.println(yy);
	    	String[] z = amount.getText().split("", 3);
	    	if (z[0].equals("(")) {
	    		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,8), ExpAmt);
			} else {
				Assert.assertEquals(amount.getText().replaceAll(",", ""), ExpAmt);
			}
	    	Reporter.log("Amount enter verified: "+ActAmt);
	    	sl.ScrollToElement(m_Driver, ele2);
		}
	    Reporter.log("Enteries are Verified on Balance Sheet Report page :", true);
//	}
//	    else
//	    {
//	    	System.out.println("Error in Code 10-19");
//	    }
 }
 public void verify_BS_FixedAsset_20_29(){
		List<WebElement> elements = m_Driver.findElements(By.xpath("//tbody/tr/td[2]/span[contains(text(),'')]/following-sibling::a"));
	    int size = elements.size();
	    System.out.println(size);
//	    if(size==21)
//	    {
	    for (int i = 0; i <10; i++) {
	    	WebElement ele2=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+ledger.get(i)+"')]/following-sibling::a"));
	    	String led_text = ele2.getText().trim();
	    	System.out.println(led_text);
	    	String[] ledgersplit = expected_entry.get(i).split("-");
	    	String expectedledger = ledgersplit[1].trim();
	    	Assert.assertEquals(ele2.getText().replaceAll("-", " "), expectedledger.replaceAll("-"," "));
	    	Reporter.log("Ledger code verified: "+led_text);
	    	
	    	WebElement amount=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+ledger.get(i)+"')]/parent::td/following-sibling::td/a/span"));
	    	String ActAmt = amount.getText();
	    	String ExpAmt = amt.get(i)+".00";
	    	//System.out.println(xx);
	    	//System.out.println(yy);
	    	String[] z = amount.getText().split("", 3);
	    	if (z[0].equals("(")) {
	    		String amttt=amount.getText().replaceAll(",", "").substring(1,8);
	    		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,8), ExpAmt);
			} else {
				Assert.assertEquals(amount.getText().replaceAll(",", ""), ExpAmt);
			}
	    	Reporter.log("Amount enter verified: "+ActAmt);
	    	sl.ScrollToElement(m_Driver, ele2);
		}
	    Reporter.log("Enteries are Verified on Balance Sheet Report page :", true);
//	}
//	    else
//	    {
//	    	System.out.println("Error in code 20-29");
//	    }
 }
 
 public void verify_BS_FixedAsset_30_39(){
		List<WebElement> elements = m_Driver.findElements(By.xpath("//tbody/tr/td[2]/span[contains(text(),'')]/following-sibling::a"));
	    int size = elements.size();
	    System.out.println(size);
//	    if(size==31)
//	    {
	    for (int i = 0; i <10; i++) {
	    	WebElement ele2=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+ledger.get(i)+"')]/following-sibling::a"));
	    	String led_text = ele2.getText().trim();
	    	System.out.println(led_text);
	    	String[] ledgersplit = expected_entry.get(i).split("-");
	    	String expectedledger = ledgersplit[1].trim();
	    	Assert.assertEquals(ele2.getText().replaceAll("-", " "), expectedledger.replaceAll("-"," "));
	    	Reporter.log("Ledger code verified: "+led_text);
	    	
	    	WebElement amount=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+ledger.get(i)+"')]/parent::td/following-sibling::td/a/span"));
	    	String ActAmt = amount.getText();
	    	String ExpAmt = amt.get(i)+".00";
	    	//System.out.println(xx);
	    	//System.out.println(yy);
	    	String[] z = amount.getText().split("", 3);
	    	if (z[0].equals("(")) {
	    		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,8), ExpAmt);
			} else {
				Assert.assertEquals(amount.getText().replaceAll(",", ""), ExpAmt);
			}
	    	Reporter.log("Amount enter verified: "+ActAmt);
	    	sl.ScrollToElement(m_Driver, ele2);
		}
	    Reporter.log("Enteries are Verified on Balance Sheet Report page :", true);
//	}
// 
// else
// {
//	 System.out.println("Error in Code 30-39");
// }
 
 }
 
 
 public void verify_BS_FixedAsset_40_49(){
		List<WebElement> elements = m_Driver.findElements(By.xpath("//tbody/tr/td[2]/span[contains(text(),'')]/following-sibling::a"));
	    int size = elements.size();
	    System.out.println(size);
//	    if(size==38)
//	    {
	    for (int i = 0; i <7; i++) {
	    	WebElement ele2=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+ledger.get(i)+"')]/following-sibling::a"));
	    	String led_text = ele2.getText().trim();
	    	System.out.println(led_text);
	    	String[] ledgersplit = expected_entry.get(i).split("-");
	    	String expectedledger = ledgersplit[1].trim();
	    	Assert.assertEquals(ele2.getText().replaceAll("-", " "), expectedledger.replaceAll("-"," "));
	    	Reporter.log("Ledger code verified: "+led_text);
	    	
	    	WebElement amount=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+ledger.get(i)+"')]/parent::td/following-sibling::td/a/span"));
	    	String ActAmt = amount.getText();
	    	String ExpAmt = amt.get(i)+".00";
	    	//System.out.println(xx);
	    	//System.out.println(yy);
	    	String[] z = amount.getText().split("", 3);
	    	if (z[0].equals("(")) {
	    		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,8), ExpAmt);
			} else {
				Assert.assertEquals(amount.getText().replaceAll(",", ""), ExpAmt);
			}
	    	Reporter.log("Amount enter verified: "+ActAmt);
	    	sl.ScrollToElement(m_Driver, ele2);
		}
	    Reporter.log("Enteries are Verified on Balance Sheet Report page :", true);
//	    }
//	    else
//	    {
//	    	System.out.println("Error in Code 40-49");
//	    }
	    		
	}
 public void verify_BS_FixedAsset_200_209(){
		List<WebElement> elements = m_Driver.findElements(By.xpath("//tbody/tr/td[2]/span[contains(text(),'')]/following-sibling::a"));
	    int size = elements.size();
	    System.out.println(size);
//	    if(size==48)
//	    {
	    for (int i = 0; i <10; i++) {
	    	WebElement ele2=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+ledger.get(i)+"')]/following-sibling::a"));
	    	String led_text = ele2.getText().trim();
	    	System.out.println(led_text);
	    	String[] ledgersplit = expected_entry.get(i).split("-");
	    	String expectedledger = ledgersplit[1].trim();
	    	Assert.assertEquals(ele2.getText().replaceAll("-", " "), expectedledger.replaceAll("-"," "));
	    	Reporter.log("Ledger code verified: "+led_text);
	    	
	    	WebElement amount=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+ledger.get(i)+"')]/parent::td/following-sibling::td/a/span"));
	    	String ActAmt = amount.getText();
	    	String ExpAmt = amt.get(i)+".00";
	    	//System.out.println(xx);
	    	//System.out.println(yy);
	    	String[] z = amount.getText().split("", 3);
	    	if (z[0].equals("(")) {
	    		String amttt=amount.getText().replaceAll(",", "").substring(1,8);
	    		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,8), ExpAmt);
			} else {
				Assert.assertEquals(amount.getText().replaceAll(",", ""), ExpAmt);
			}
	    	Reporter.log("Amount enter verified: "+ActAmt);
	    	sl.ScrollToElement(m_Driver, ele2);
		}
	    Reporter.log("Enteries are Verified on Balance Sheet Report page :", true);
//	    }
//	    else
//	    {
//	    	System.out.println("Error in Code 200-209");
//	    }
	}
 
 public void verify_BS_FixedAsset_210_219(){
		List<WebElement> elements = m_Driver.findElements(By.xpath("//tbody/tr/td[2]/span[contains(text(),'')]/following-sibling::a"));
	    int size = elements.size();
	    System.out.println(size);
//	    if(size==58)
//	    {
	    for (int i = 0; i <10; i++) {
	    	WebElement ele2=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+ledger.get(i)+"')]/following-sibling::a"));
	    	String led_text = ele2.getText().trim();
	    	System.out.println(led_text);
	    	String[] ledgersplit = expected_entry.get(i).split("-");
	    	String expectedledger = ledgersplit[1].trim();
	    	Assert.assertEquals(ele2.getText().replaceAll("-", " "), expectedledger.replaceAll("-"," "));
	    	Reporter.log("Ledger code verified: "+led_text);
	    	
	    	WebElement amount=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+ledger.get(i)+"')]/parent::td/following-sibling::td/a/span"));
	    	String ActAmt = amount.getText();
	    	String ExpAmt = amt.get(i)+".00";
	    	//System.out.println(xx);
	    	//System.out.println(yy);
	    	String[] z = amount.getText().split("", 3);
	    	if (z[0].equals("(")) {
	    		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,8), ExpAmt);
			} else {
				Assert.assertEquals(amount.getText().replaceAll(",", ""), ExpAmt);
			}
	    	Reporter.log("Amount enter verified: "+ActAmt);
	    	sl.ScrollToElement(m_Driver, ele2);
		}
	    Reporter.log("Enteries are Verified on Balance Sheet Report page :", true);
//	    }
//	    else{
//	    	System.out.println("Error in Code 210-219");
//	    }
	}
 
 public void verify_BS_FixedAsset_220_229(){
		List<WebElement> elements = m_Driver.findElements(By.xpath("//tbody/tr/td[2]/span[contains(text(),'')]/following-sibling::a"));
	    int size = elements.size();
	    System.out.println(size);
	    for (int i = 0; i <10; i++) {
	    	WebElement ele2=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+ledger.get(i)+"')]/following-sibling::a"));
	    	String led_text = ele2.getText().trim();
	    	System.out.println(led_text);
	    	String[] ledgersplit = expected_entry.get(i).split("-");
	    	String expectedledger = ledgersplit[1].trim();
	    	Assert.assertEquals(ele2.getText().replaceAll("-", " "), expectedledger.replaceAll("-"," "));
	    	Reporter.log("Ledger code verified: "+led_text);
	    	
	    	WebElement amount=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+ledger.get(i)+"')]/parent::td/following-sibling::td/a/span"));
	    	String ActAmt = amount.getText();
	    	String ExpAmt = amt.get(i)+".00";
	    	//System.out.println(xx);
	    	//System.out.println(yy);
	    	String[] z = amount.getText().split("", 3);
	    	if (z[0].equals("(")) {
	    		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,8), ExpAmt);
			} else {
				Assert.assertEquals(amount.getText().replaceAll(",", ""), ExpAmt);
			}
	    	Reporter.log("Amount enter verified: "+ActAmt);
	    	sl.ScrollToElement(m_Driver, ele2);
		}
	    Reporter.log("Enteries are Verified on Balance Sheet Report page :", true);
	}
 
 public void verify_BS_FixedAsset_230_239(){
		List<WebElement> elements = m_Driver.findElements(By.xpath("//tbody/tr/td[2]/span[contains(text(),'')]/following-sibling::a"));
	    int size = elements.size();
	    System.out.println(size);
	    for (int i = 0; i <10; i++) {
	    	WebElement ele2=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+ledger.get(i)+"')]/following-sibling::a"));
	    	String led_text = ele2.getText().trim();
	    	System.out.println(led_text);
	    	String[] ledgersplit = expected_entry.get(i).split("-");
	    	String expectedledger = ledgersplit[1].trim();
	    	Assert.assertEquals(led_text.replaceAll("-", " "), expectedledger.replaceAll("-"," "));
	    	Reporter.log("Ledger code verified: "+led_text);
	    	
	    	WebElement amount=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+ledger.get(i)+"')]/parent::td/following-sibling::td/a/span"));
	    	String ActAmt = amount.getText();
	    	String ExpAmt = amt.get(i)+".00";
	    	//System.out.println(xx);
	    	//System.out.println(yy);
	    	String[] z = amount.getText().split("", 3);
	    	if (z[0].equals("(")) {
	    		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,8), ExpAmt);
			} else {
				Assert.assertEquals(amount.getText().replaceAll(",", ""), ExpAmt);
			}
	    	Reporter.log("Amount enter verified: "+ActAmt);
	    	sl.ScrollToElement(m_Driver, ele2);
		}
	    Reporter.log("Enteries are Verified on Balance Sheet Report page :", true);
	}
 public void verify_BS_FixedAsset_240_249(){
		List<WebElement> elements = m_Driver.findElements(By.xpath("//tbody/tr/td[2]/span[contains(text(),'')]/following-sibling::a"));
	    int size = elements.size();
	    System.out.println(size);
	    for (int i = 0; i <10; i++) {
	    	WebElement ele2=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+ledger.get(i)+"')]/following-sibling::a"));
	    	String led_text = ele2.getText().trim();
	    	System.out.println(led_text);
	    	String[] ledgersplit = expected_entry.get(i).split("-");
	    	String expectedledger = ledgersplit[1].trim();
	    	Assert.assertEquals(ele2.getText().replaceAll("-", " "), expectedledger.replaceAll("-"," "));
	    	Reporter.log("Ledger code verified: "+led_text);
	    	
	    	WebElement amount=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+ledger.get(i)+"')]/parent::td/following-sibling::td/a/span"));
	    	String ActAmt = amount.getText();
	    	String ExpAmt = amt.get(i)+".00";
	    	//System.out.println(xx);
	    	//System.out.println(yy);
	    	String[] z = amount.getText().split("", 3);
	    	if (z[0].equals("(")) {
	    		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,8), ExpAmt);
			} else {
				Assert.assertEquals(amount.getText().replaceAll(",", ""), ExpAmt);
			}
	    	Reporter.log("Amount enter verified: "+ActAmt);
	    	sl.ScrollToElement(m_Driver, ele2);
		}
	    Reporter.log("Enteries are Verified on Balance Sheet Report page :", true);
	}
 public void verify_BS_FixedAsset_250_259(){
		List<WebElement> elements = m_Driver.findElements(By.xpath("//tbody/tr/td[2]/span[contains(text(),'')]/following-sibling::a"));
	    int size = elements.size();
	    System.out.println(size);
	    for (int i = 0; i <10; i++) {
	    	WebElement ele2=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+ledger.get(i)+"')]/following-sibling::a"));
	    	String led_text = ele2.getText().trim();
	    	System.out.println(led_text);
	    	String[] ledgersplit = expected_entry.get(i).split("-");
	    	String expectedledger = ledgersplit[1].trim();
	    	Assert.assertEquals(ele2.getText().replaceAll("-", " "), expectedledger.replaceAll("-"," "));
	    	Reporter.log("Ledger code verified: "+led_text);
	    	
	    	WebElement amount=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+ledger.get(i)+"')]/parent::td/following-sibling::td/a/span"));
	    	String ActAmt = amount.getText();
	    	String ExpAmt = amt.get(i)+".00";
	    	//System.out.println(xx);
	    	//System.out.println(yy);
	    	String[] z = amount.getText().split("", 3);
	    	if (z[0].equals("(")) {
	    		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,8), ExpAmt);
			} else {
				Assert.assertEquals(amount.getText().replaceAll(",", ""), ExpAmt);
			}
	    	Reporter.log("Amount enter verified: "+ActAmt);
	    	sl.ScrollToElement(m_Driver, ele2);
		}
	    Reporter.log("Enteries are Verified on Balance Sheet Report page :", true);
	}

 public void verify_BS_FixedAsset_260_269(){
		List<WebElement> elements = m_Driver.findElements(By.xpath("//tbody/tr/td[2]/span[contains(text(),'')]/following-sibling::a"));
	    int size = elements.size();
	    System.out.println(size);
	    for (int i = 0; i <10; i++) {
	    	WebElement ele2=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+ledger.get(i)+"')]/following-sibling::a"));
	    	String led_text = ele2.getText().trim();
	    	System.out.println(led_text);
	    	String[] ledgersplit = expected_entry.get(i).split("-");
	    	String expectedledger = ledgersplit[1].trim();
	    	Assert.assertEquals(ele2.getText().replaceAll("-", " "), expectedledger.replaceAll("-"," "));
	    	Reporter.log("Ledger code verified: "+led_text);
	    	
	    	WebElement amount=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+ledger.get(i)+"')]/parent::td/following-sibling::td/a/span"));
	    	String ActAmt = amount.getText();
	    	String ExpAmt = amt.get(i)+".00";
	    	//System.out.println(xx);
	    	//System.out.println(yy);
	    	String[] z = amount.getText().split("", 3);
	    	if (z[0].equals("(")) {
	    		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,8), ExpAmt);
			} else {
				Assert.assertEquals(amount.getText().replaceAll(",", ""), ExpAmt);
			}
	    	Reporter.log("Amount enter verified: "+ActAmt);
	    	sl.ScrollToElement(m_Driver, ele2);
		}
	    Reporter.log("Enteries are Verified on Balance Sheet Report page :", true);
	}
 public void verify_BS_CurrentAsset_1000_1450(){
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
	    	String ExpAmt = amt.get(i)+".00";
	    	//System.out.println(xx);
	    	//System.out.println(yy);
	    	String[] z = amount.getText().split("", 3);
	    	if (z[0].equals("(")) {
	    		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,8), ExpAmt);
			} else {
				Assert.assertEquals(amount.getText().replaceAll(",", ""), ExpAmt);
			}
	    	Reporter.log("Amount enter verified: "+ActAmt);
	    	sl.ScrollToElement(m_Driver, ele2);
		}
	    Reporter.log("Enteries are Verified on Balance Sheet Report page :", true);
	}
 
 public void verify_BS_Customer_1070(){
	 
	// m_Driver.findElement(By.xpath("//*[@class='rotateiconsvg10']")).click();
		List<WebElement> elements = m_Driver.findElements(By.xpath("//tbody/tr/td[2]/span[contains(text(),'')]/following-sibling::a"));
	    int size = elements.size();
	    System.out.println(size);
	    for (int i = 0; i <size-1; i++) {
	    	WebElement ele2=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+ledger.get(i)+"')]/following-sibling::a"));
	    	String led_text = ele2.getText().trim();
	    	System.out.println(led_text);
	    	String[] ledgersplit =expected_entry.get(i).split("-");
	    	String expectedledger = ledgersplit[1].trim();
	    	Assert.assertEquals(ele2.getText().replaceAll("-", " "), expectedledger.replaceAll("-"," "));
	    	Reporter.log("Ledger code verified: "+led_text);
	    	
	    	WebElement amount=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+ledger.get(i)+"')]/parent::td/following-sibling::td/a/span"));
	    	String ActAmt = amount.getText();
	    	String ExpAmt = amt.get(i)+".00";
	    	//System.out.println(xx);
	    	//System.out.println(yy);
	    	String[] z = amount.getText().split("", 3);
	    	if (z[0].equals("(")) {
	    		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,8), ExpAmt);
			} else {
				Assert.assertEquals(amount.getText().replaceAll(",", ""), ExpAmt);
			}
	    	Reporter.log("Amount enter verified: "+ActAmt);
	    	sl.ScrollToElement(m_Driver, ele2);
		}
	    Reporter.log("Enteries are Verified on Balance Sheet Report page :", true);
	}
 
 public void verify_BS_Debtor_1000_1310(){
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
	    	String ExpAmt = amt.get(i)+".00";
	    	//System.out.println(xx);
	    	//System.out.println(yy);
	    	String[] z = amount.getText().split("", 3);
	    	if (z[0].equals("(")) {
	    		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,8), ExpAmt);
			} else {
				Assert.assertEquals(amount.getText().replaceAll(",", ""), ExpAmt);
			}
	    	Reporter.log("Amount enter verified: "+ActAmt);
	    	sl.ScrollToElement(m_Driver, ele2);
		}
	    Reporter.log("Enteries are Verified on Balance Sheet Report page :", true);
	}
 
 public void verify_BS_Debtor_1320_1420(){
		List<WebElement> elements = m_Driver.findElements(By.xpath("//tbody/tr/td[2]/span[contains(text(),'')]/following-sibling::a"));
	    int size = elements.size();
	    System.out.println(size);
	    for (int i = 0; i <size-1; i++) {
	    	WebElement ele2=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+ledger.get(i)+"')]/following-sibling::a"));
	    	String led_text = ele2.getText().trim();
	    	System.out.println(led_text);
	    	String[] ledgersplit = expected_entry.get(i).split("-", 2);
	    	String expectedledger = ledgersplit[1].trim();
	    	Assert.assertEquals(ele2.getText().replaceAll("-", " "), expectedledger.replaceAll("-"," "));
	    	Reporter.log("Ledger code verified: "+led_text);
	    	
	    	WebElement amount=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+ledger.get(i)+"')]/parent::td/following-sibling::td/a/span"));
	    	String ActAmt = amount.getText();
	    	String ExpAmt = amt.get(i)+".00";
	    	String[] z = amount.getText().split("", 3);
	    	if (z[0].equals("(")) {
	    		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,8), ExpAmt);
			} else {
				Assert.assertEquals(amount.getText().replaceAll(",", ""), ExpAmt);
			}
	    	Reporter.log("Amount enter verified: "+ActAmt);
	    	sl.ScrollToElement(m_Driver, ele2);
		}
	    Reporter.log("Enteries are Verified on Balance Sheet Report page :", true);
	}
 
 public void verify_BS_CreditorDueWithinYear_2000_2080(){
		List<WebElement> elements = m_Driver.findElements(By.xpath("//tbody/tr/td[2]/span[contains(text(),'')]/following-sibling::a"));
	    int size = elements.size();
	    System.out.println(size);
	    for (int i = 0; i <size-1; i++) {
	    	WebElement ele2=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+ledger.get(i)+"')]/following-sibling::a"));
	    	String led_text = ele2.getText().trim();
	    	System.out.println(led_text);
	    	String[] ledgersplit = expected_entry.get(i).split("-", 2);
	    	String expectedledger = ledgersplit[1].trim();
	    	Assert.assertEquals(ele2.getText().replaceAll("-", " "), expectedledger.replaceAll("-"," "));
	    	Reporter.log("Ledger code verified: "+led_text);
	    	
	    	WebElement amount=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+ledger.get(i)+"')]/parent::td/following-sibling::td/a/span"));
	    	String ActAmt = amount.getText();
	    	String ExpAmt = amt.get(i)+".00";
	    	//System.out.println(xx);
	    	//System.out.println(yy);
	    	String[] z = amount.getText().split("", 3);
	    	if (z[0].equals("(")) {
	    		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,8), ExpAmt);
			} else {
				Assert.assertEquals(amount.getText().replaceAll(",", ""), ExpAmt);
			}
	    	Reporter.log("Amount enter verified: "+ActAmt);
	    	sl.ScrollToElement(m_Driver, ele2);
		}
	    Reporter.log("Enteries are Verified on Balance Sheet Report page :", true);
	}
 
 public void verify_BS_CreditorDueWithinYear_2080_2095(){
		List<WebElement> elements = m_Driver.findElements(By.xpath("//tbody/tr/td[2]/span[contains(text(),'')]/following-sibling::a"));
	    int size = elements.size();
	    System.out.println(size);
	    for (int i = 0; i <size-1; i++) {
	    	WebElement ele2=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+ledger.get(i)+"')]/following-sibling::a"));
	    	String led_text = ele2.getText().trim();
	    	System.out.println(led_text);
	    	String[] ledgersplit = expected_entry.get(i).split("-", 2);
	    	String expectedledger = ledgersplit[1].trim();
	    	Assert.assertEquals(ele2.getText().replaceAll("-", " "), expectedledger.replaceAll("-"," "));
	    	Reporter.log("Ledger code verified: "+led_text);
	    	
	    	WebElement amount=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+ledger.get(i)+"')]/parent::td/following-sibling::td/a/span"));
	    	String ActAmt = amount.getText();
	    	String ExpAmt = amt.get(i)+".00";
	    	//System.out.println(xx);
	    	//System.out.println(yy);
	    	String[] z = amount.getText().split("", 3);
	    	if (z[0].equals("(")) {
	    		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,8), ExpAmt);
			} else {
				Assert.assertEquals(amount.getText().replaceAll(",", ""), ExpAmt);
			}
	    	Reporter.log("Amount enter verified: "+ActAmt);
	    	sl.ScrollToElement(m_Driver, ele2);
		}
	    Reporter.log("Enteries are Verified on Balance Sheet Report page :", true);
	}
 public void verify_TrialBalance_BS_Bank_1400(String ledger_no,String ledger,String amt)
 {
	 List<WebElement> elements = m_Driver.findElements(By.xpath("//tbody/tr/td[2]/span[contains(text(),'')]/following-sibling::a"));
	    int size = elements.size();
	    System.out.println(size);
	 for (int i = 0; i <size-1; i++) {
		WebElement ele2=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+ledger_no+"')]/following-sibling::a"));
	    String led_text = ele2.getText().trim();
	    System.out.println(led_text);
     	String expectedledger1 = ledger;
     	Assert.assertEquals(led_text.replaceAll("-", " "), expectedledger1.replaceAll("-"," "));
    	Reporter.log("Ledger code verified: "+led_text);
     	
    	WebElement amount=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+ledger_no+"')]/parent::td/following-sibling::td/a/span"));
    	String ActAmt = amount.getText();
    	String ExpAmt = amt+".00";
    	
    	String[] z = amount.getText().split("", 3);
    	if (z[0].equals("(")) {
    		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,8), ExpAmt);
		} else {
			Assert.assertEquals(amount.getText().replaceAll(",", ""), ExpAmt);
		}
    	Reporter.log("Amount enter verified: "+ActAmt);
    	sl.ScrollToElement(m_Driver, ele2);
	}
    Reporter.log("Enteries are Verified on Balance Sheet Report page :", true);
    JavascriptExecutor js = (JavascriptExecutor)m_Driver;
		js.executeScript("window.scrollBy(0,-400)");
		//Thread.sleep(2000);
	    
}
 public void verify_BS_CreditorDueAfterYear_2300_2331(){
		List<WebElement> elements = m_Driver.findElements(By.xpath("//tbody/tr/td[2]/span[contains(text(),'')]/following-sibling::a"));
	    int size = elements.size();
	    System.out.println(size);
	    for (int i = 0; i <size-1; i++) {
	    	WebElement ele2=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+ledger.get(i)+"')]/following-sibling::a"));
	    	String led_text = ele2.getText().trim();
	    	System.out.println(led_text);
	    	String[] ledgersplit = expected_entry.get(i).split("-", 2);
	    	String expectedledger = ledgersplit[1].trim();
	    	Assert.assertEquals(ele2.getText().replaceAll("-", " "), expectedledger.replaceAll("-"," "));
	    	Reporter.log("Ledger code verified: "+led_text);
	    	
	    	WebElement amount=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+ledger.get(i)+"')]/parent::td/following-sibling::td/a/span"));
	    	String ActAmt = amount.getText();
	    	String ExpAmt = amt.get(i)+".00";
	    	//System.out.println(xx);
	    	//System.out.println(yy);
	    	String[] z = amount.getText().split("", 3);
	    	if (z[0].equals("(")) {
	    		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,8), ExpAmt);
			} else {
				Assert.assertEquals(amount.getText().replaceAll(",", ""), ExpAmt);
			}
	    	Reporter.log("Amount enter verified: "+ActAmt);
	    	sl.ScrollToElement(m_Driver, ele2);
		}
	    Reporter.log("Enteries are Verified on Balance Sheet Report page :", true);
	}
 
 public void verify_BS_CreditorDueAfterYear_2332_2339(){
		List<WebElement> elements = m_Driver.findElements(By.xpath("//tbody/tr/td[2]/span[contains(text(),'')]/following-sibling::a"));
	    int size = elements.size();
	    System.out.println(size);
	    for (int i = 0; i <size-1; i++) {
	    	WebElement ele2=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+ledger.get(i)+"')]/following-sibling::a"));
	    	String led_text = ele2.getText().trim();
	    	System.out.println(led_text);
	    	String[] ledgersplit = expected_entry.get(i).split("-", 2);
	    	String expectedledger = ledgersplit[1].trim();
	    	Assert.assertEquals(ele2.getText().replaceAll("-", " "), expectedledger.replaceAll("-"," "));
	    	Reporter.log("Ledger code verified: "+led_text);
	    	
	    	WebElement amount=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+ledger.get(i)+"')]/parent::td/following-sibling::td/a/span"));
	    	String ActAmt = amount.getText();
	    	String ExpAmt = amt.get(i)+".00";
	    	//System.out.println(xx);
	    	//System.out.println(yy);
	    	String[] z = amount.getText().split("", 3);
	    	if (z[0].equals("(")) {
	    		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,9), ExpAmt);
			} else {
				Assert.assertEquals(amount.getText().replaceAll(",", ""), ExpAmt);
			}
	    	Reporter.log("Amount enter verified: "+ActAmt);
	    	sl.ScrollToElement(m_Driver, ele2);
		}
	    Reporter.log("Enteries are Verified on Balance Sheet Report page :", true);
	}
 
 public void verify_BS_FixedAsset_270_279(){
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
	    	String ExpAmt = amt.get(i)+".00";
	    	//System.out.println(xx);
	    	//System.out.println(yy);
	    	String[] z = amount.getText().split("", 3);
	    	if (z[0].equals("(")) {
	    		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,9), ExpAmt);
			} else {
				Assert.assertEquals(amount.getText().replaceAll(",", ""), ExpAmt);
			}
	    	Reporter.log("Amount enter verified: "+ActAmt);
	    	sl.ScrollToElement(m_Driver, ele2);
		}
	    Reporter.log("Enteries are Verified on Balance Sheet Report page :", true);
	}
 
 public void verify_BS_FixedAsset_280_289(){
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
	    	String ExpAmt = amt.get(i)+".00";
	    	//System.out.println(xx);
	    	//System.out.println(yy);
	    	String[] z = amount.getText().split("", 3);
	    	if (z[0].equals("(")) {
	    		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,9), ExpAmt);
			} else {
				Assert.assertEquals(amount.getText().replaceAll(",", ""), ExpAmt);
			}
	    	Reporter.log("Amount enter verified: "+ActAmt);
	    	sl.ScrollToElement(m_Driver, ele2);
		}
	    Reporter.log("Enteries are Verified on Balance Sheet Report page :", true);
	}
 
 public void verify_BS_FixedAsset_600_609(){
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
	    	String ExpAmt = amt.get(i)+".00";
	    	//System.out.println(xx);
	    	//System.out.println(yy);
	    	String[] z = amount.getText().split("", 3);
	    	if (z[0].equals("(")) {
	    		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,9), ExpAmt);
			} else {
				Assert.assertEquals(amount.getText().replaceAll(",", ""), ExpAmt);
			}
	    	Reporter.log("Amount enter verified: "+ActAmt);
	    	sl.ScrollToElement(m_Driver, ele2);
		}
	    Reporter.log("Enteries are Verified on Balance Sheet Report page :", true);
	}
 public void verify_BS_FixedAsset_630_639(){
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
	    	String ExpAmt = amt.get(i)+".00";
	    	//System.out.println(xx);
	    	//System.out.println(yy);
	    	String[] z = amount.getText().split("", 3);
	    	if (z[0].equals("(")) {
	    		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,9), ExpAmt);
			} else {
				Assert.assertEquals(amount.getText().replaceAll(",", ""), ExpAmt);
			}
	    	Reporter.log("Amount enter verified: "+ActAmt);
	    	sl.ScrollToElement(m_Driver, ele2);
		}
	    Reporter.log("Enteries are Verified on Balance Sheet Report page :", true);
	}
 
 public void verify_BS_ProvisionForLiability(){
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
	    	String ExpAmt = amt.get(i)+".00";
	    	//System.out.println(xx);
	    	//System.out.println(yy);
	    	String[] z = amount.getText().split("", 3);
	    	if (z[0].equals("(")) {
	    		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,9), ExpAmt);
			} else {
				Assert.assertEquals(amount.getText().replaceAll(",", ""), ExpAmt);
			}
	    	Reporter.log("Amount enter verified: "+ActAmt);
	    	sl.ScrollToElement(m_Driver, ele2);
		}
	    Reporter.log("Enteries are Verified on Balance Sheet Report page :", true);
	}
 
 
 public void verify_BS_Director_1321() {
 	for (String string : expected_entry) {
			System.out.println(string);
		}
 	List<WebElement> elements = m_Driver.findElements(By.xpath("//tbody/tr/td[2]/span[contains(text(),'')]/following-sibling::a"));
     int size = elements.size();
     for (int i = 0; i <size-2; i++) {
     	if (i==0) {
     		WebElement ele2 = m_Driver.findElement(By.xpath("(//tbody/tr/td[2]/span[contains(text(),'1321')]/following-sibling::a)[5]"));
     		String led_text = ele2.getText();
         	System.out.println(led_text);
         	String[] ledgersplit = expected_entry.get(i).split("-", 2);
	    	String expectedledger1 = ledgersplit[1].trim();
         	Assert.assertEquals(led_text.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
         	Reporter.log("ledger code verified: "+led_text);
			} else {
				WebElement ele2 = m_Driver.findElement(By.xpath("(//tbody/tr/td[2]/span[contains(text(),'1321')]/following-sibling::a)["+i+"]"));
				String led_text = ele2.getText();
         	System.out.println(led_text);
         	String[] ledgersplit = expected_entry.get(i).split("-", 2);
	    	String expectedledger = ledgersplit[1].trim();
         	String expectedledger1 = expectedledger.replace("Default director -", "");
         	Assert.assertEquals(led_text.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
         	Reporter.log("ledger code verified: "+led_text);

			}
     	
     	
     	if (i==0) {
     		WebElement amount=m_Driver.findElement(By.xpath("(//tbody/tr/td/span[contains(text(),'1321')]/parent::td/following-sibling::td/a/span)[5]"));
	        	String Amount = amount.getText();
	        	String yy = amt.get(i)+".00";
	        	System.out.println(Amount);
	        	System.out.println(yy);
	        	String[] z = amount.getText().split("", 3);
	        	if (z[0].equals("(")) {
	        		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,9), yy);
	    		} else {
	    			Assert.assertEquals(amount.getText().replaceAll(",", ""), yy);
	    		}
	        	Reporter.log("Amount enter verified: "+amount.getText());
	        	sl.ScrollToElement(m_Driver, amount);	
				
			} else {
				WebElement amount = m_Driver.findElement(By.xpath("(//tbody/tr/td/span[contains(text(),'1321')]/parent::td/following-sibling::td/a/span)["+i+"]"));
				String xx = amount.getText();
	        	String yy = amt.get(i)+".00";
	        	System.out.println(xx);
	        	System.out.println(yy);
	        	String[] z = amount.getText().split("", 3);
	        	if (z[0].equals("(")) {
	        		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,9), yy);
	    		} else {
	    			Assert.assertEquals(amount.getText().replaceAll(",", ""), yy);
	    		}
	        	Reporter.log("Amount enter verified: "+amount.getText());
	        	sl.ScrollToElement(m_Driver, amount);	

			}
     	
 	}
     Reporter.log("Enteries are Verified on TrialBalance Report page :", true);
}
 
 public void verify_BS_Person_1323() {
	 	for (String string : expected_entry) {
				System.out.println(string);
			}
	 	List<WebElement> elements = m_Driver.findElements(By.xpath("//tbody/tr/td[2]/span[contains(text(),'')]/following-sibling::a"));
	     int size = elements.size();
	     for (int i = 0; i <size-2; i++) {
	     	if (i==0) {
	     		WebElement ele2 = m_Driver.findElement(By.xpath("(//tbody/tr/td[2]/span[contains(text(),'1323')]/following-sibling::a)[5]"));
	     		String led_text = ele2.getText();
	         	System.out.println(led_text);
	         	String[] ledgersplit = expected_entry.get(i).split("-", 2);
		    	String expectedledger1 = ledgersplit[1].trim();
	         	Assert.assertEquals(led_text.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
	         	Reporter.log("ledger code verified: "+led_text);
				} else {
					WebElement ele2 = m_Driver.findElement(By.xpath("(//tbody/tr/td[2]/span[contains(text(),'1323')]/following-sibling::a)["+i+"]"));
					String led_text = ele2.getText();
	         	System.out.println(led_text);
	         	String[] ledgersplit = expected_entry.get(i).split("-", 2);
		    	String expectedledger = ledgersplit[1].trim();
	         	String expectedledger1 = expectedledger.replace("Ankit Rana -", "");
	         	Assert.assertEquals(led_text.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
	         	Reporter.log("ledger code verified: "+led_text);

				}
	     	
	     	
	     	if (i==0) {
	     		WebElement amount=m_Driver.findElement(By.xpath("(//tbody/tr/td/span[contains(text(),'1323')]/parent::td/following-sibling::td/a/span)[5]"));
		        	String Amount = amount.getText();
		        	String yy = amt.get(i)+".00";
		        	System.out.println(Amount);
		        	System.out.println(yy);
		        	String[] z = amount.getText().split("", 3);
		        	if (z[0].equals("(")) {
		        		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,9), yy);
		    		} else {
		    			Assert.assertEquals(amount.getText().replaceAll(",", ""), yy);
		    		}
		        	Reporter.log("Amount enter verified: "+amount.getText());
		        	sl.ScrollToElement(m_Driver, amount);	
					
				} else {
					WebElement amount = m_Driver.findElement(By.xpath("(//tbody/tr/td/span[contains(text(),'1323')]/parent::td/following-sibling::td/a/span)["+i+"]"));
					String xx = amount.getText();
		        	String yy = amt.get(i)+".00";
		        	System.out.println(xx);
		        	System.out.println(yy);
		        	String[] z = amount.getText().split("", 3);
		        	if (z[0].equals("(")) {
		        		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,9), yy);
		    		} else {
		    			Assert.assertEquals(amount.getText().replaceAll(",", ""), yy);
		    		}
		        	Reporter.log("Amount enter verified: "+amount.getText());
		        	sl.ScrollToElement(m_Driver, amount);	

				}
	     	
	 	}
	     Reporter.log("Enteries are Verified on TrialBalance Report page :", true);
	}
 
 public void verify_BS_ShareCapital_3000(){
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
	    	String ExpAmt = amt.get(i)+".00";
	    	//System.out.println(xx);
	    	//System.out.println(yy);
	    	String[] z = amount.getText().split("", 3);
	    	if (z[0].equals("(")) {
	    		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,8), ExpAmt);
			} else {
				Assert.assertEquals(amount.getText().replaceAll(",", ""), ExpAmt);
			}
	    	Reporter.log("Amount enter verified: "+ActAmt);
	    	sl.ScrollToElement(m_Driver, ele2);
		}
	    Reporter.log("Enteries are Verified on Balance Sheet Report page :", true);
	}
 
 public void verify_BS_Bank1400(){
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
	    	String ExpAmt = amt.get(i)+".00";
	    	//System.out.println(xx);
	    	//System.out.println(yy);
	    	String[] z = amount.getText().split("", 3);
	    	if (z[0].equals("(")) {
	    		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,8), ExpAmt);
			} else {
				Assert.assertEquals(amount.getText().replaceAll(",", ""), ExpAmt);
			}
	    	Reporter.log("Amount enter verified: "+ActAmt);
	    	sl.ScrollToElement(m_Driver, ele2);
		}
	    Reporter.log("Enteries are Verified on Balance Sheet Report page :", true);
	}
 
 
 public void verify_BS_Employee_1322(String ledNo){
	 	for (String string : expected_entry) {
				System.out.println(string);
			}
	 	List<WebElement> elements = m_Driver.findElements(By.xpath("//tbody/tr/td[2]/span[contains(text(),'')]/following-sibling::a"));
	     int size = elements.size();
	     for (int i = 0; i <size-2; i++) {
	     	if (i==0) {
	     		WebElement ele2 = m_Driver.findElement(By.xpath("(//tbody/tr/td[2]/span[contains(text(),'1322')]/following-sibling::a)[4]"));
	     		String led_text = ele2.getText();
	         	System.out.println(led_text);
	         	String[] ledgersplit = expected_entry.get(i).split("-", 2);
		    	String expectedledger1 = ledgersplit[1].trim();
	         	Assert.assertEquals(led_text.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
	         	Reporter.log("ledger code verified: "+led_text);
				} else if (i==4) {
					WebElement ele2 = m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+ledNo+"')]/following-sibling::a"));
		     		String led_text = ele2.getText();
		         	System.out.println(led_text);
		         	String[] ledgersplit = expected_entry.get(i).split("-", 2);
			    	String expectedledger = ledgersplit[1].trim();
			    	String expectedledger1 = expectedledger.replace("Default employee -", "");
		         	Assert.assertEquals(led_text.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
		         	Reporter.log("ledger code verified: "+led_text);	
				} 
				else {
					WebElement ele2 = m_Driver.findElement(By.xpath("(//tbody/tr/td[2]/span[contains(text(),'1322')]/following-sibling::a)["+i+"]"));
					String led_text = ele2.getText();
	         	System.out.println(led_text);
	         	String[] ledgersplit = expected_entry.get(i).split("-", 2);
		    	String expectedledger = ledgersplit[1].trim();
	         	String expectedledger1 = expectedledger.replace("Default employee -", "");
	         	Assert.assertEquals(led_text.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
	         	Reporter.log("ledger code verified: "+led_text);

				}
	     	
	     	
	     	if (i==0) {
	     		WebElement amount=m_Driver.findElement(By.xpath("(//tbody/tr/td/span[contains(text(),'1322')]/parent::td/following-sibling::td/a/span)[4]"));
		        	String Amount = amount.getText();
		        	String yy = amt.get(i)+".00";
		        	System.out.println(Amount);
		        	System.out.println(yy);
		        	String[] z = amount.getText().split("", 3);
		        	if (z[0].equals("(")) {
		        		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,9), yy);
		    		} else {
		    			Assert.assertEquals(amount.getText().replaceAll(",", ""), yy);
		    		}
		        	Reporter.log("Amount enter verified: "+amount.getText());
		        	sl.ScrollToElement(m_Driver, amount);	
					
				} else if (i==4) {
					WebElement amount=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+ledNo+"')]/parent::td/following-sibling::td/a/span"));
		        	String Amount = amount.getText();
		        	String yy = amt.get(i)+".00";
		        	System.out.println(Amount);
		        	System.out.println(yy);
		        	String[] z = amount.getText().split("", 3);
		        	if (z[0].equals("(")) {
		        		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,9), yy);
		    		} else {
		    			Assert.assertEquals(amount.getText().replaceAll(",", ""), yy);
		    		}
		        	Reporter.log("Amount enter verified: "+amount.getText());
		        	sl.ScrollToElement(m_Driver, amount);	
				}
	     	
	     	else {
					WebElement amount = m_Driver.findElement(By.xpath("(//tbody/tr/td/span[contains(text(),'1322')]/parent::td/following-sibling::td/a/span)["+i+"]"));
					String xx = amount.getText();
		        	String yy = amt.get(i)+".00";
		        	System.out.println(xx);
		        	System.out.println(yy);
		        	String[] z = amount.getText().split("", 3);
		        	if (z[0].equals("(")) {
		        		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,9), yy);
		    		} else {
		    			Assert.assertEquals(amount.getText().replaceAll(",", ""), yy);
		    		}
		        	Reporter.log("Amount enter verified: "+amount.getText());
		        	sl.ScrollToElement(m_Driver, amount);	

				}
	     	
	 	}
	     Reporter.log("Enteries are Verified on TrialBalance Report page :", true);
	}
 
 public void verify_BS_Taxation_109091110102(){
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
	    	String ExpAmt = amt.get(i)+".00";
	    	//System.out.println(xx);
	    	//System.out.println(yy);
	    	String[] z = amount.getText().split("", 3);
	    	if (z[0].equals("(")) {
	    		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,8), ExpAmt);
			} else {
				Assert.assertEquals(amount.getText().replaceAll(",", ""), ExpAmt);
			}
	    	Reporter.log("Amount enter verified: "+ActAmt);
	    	sl.ScrollToElement(m_Driver, ele2);
		}
	    Reporter.log("Enteries are Verified on Balance Sheet Report page :", true);
	}
 
 public void verify_BS_SupplierAccount_2060(){
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
	    	String ExpAmt = amt.get(i)+".00";
	    	//System.out.println(xx);
	    	//System.out.println(yy);
	    	String[] z = amount.getText().split("", 3);
	    	if (z[0].equals("(")) {
	    		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,8), ExpAmt);
			} else {
				Assert.assertEquals(amount.getText().replaceAll(",", ""), ExpAmt);
			}
	    	Reporter.log("Amount enter verified: "+ActAmt);
	    	sl.ScrollToElement(m_Driver, ele2);
		}
	    Reporter.log("Enteries are Verified on Balance Sheet Report page :", true);
	}
 
 public void verify_BS_DefferedTaxation_1103_1104(String ledger1no_1 , String Bf_ledger11, String ledger1no_2,  String Bf_ledger12,String unitprice,String quantity ,String GrossBill)
 {
		List<WebElement> elements = m_Driver.findElements(By.xpath("//tbody/tr/td[2]/span[contains(text(),'')]/following-sibling::a"));
	    int size = elements.size();
	    System.out.println(size);
	    for (int i = 0; i <size-4; i++) {
	    	WebElement ele2=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+ledger1no_1+"')]/following-sibling::a"));
	    	String led_text = ele2.getText().trim();
	    	System.out.println(led_text);
	    	String expectedledger = Bf_ledger11.trim();
	    	Assert.assertEquals(ele2.getText().replaceAll("-", " "), expectedledger.replaceAll("-"," "));
	    	Reporter.log("Ledger code verified: "+led_text);
	    	
	    	WebElement ele3=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+ledger1no_2+"')]/following-sibling::a"));
	    	String led_text1 = ele3.getText().trim();
	    	System.out.println(led_text1);
	    	String expectedledger1 = Bf_ledger12.trim();
	    	Assert.assertEquals(led_text1.replaceAll("-", " "), expectedledger1.replaceAll("-"," "));
	    	Reporter.log("Ledger code verified: "+led_text1);
	    	
	    	d1= Double.parseDouble(unitprice);
	         i1 = Integer.parseInt(quantity);
	         total = d1*i1;
	         vat = ((d1*i1)*STDrate);
	         
	         d1= Double.parseDouble(GrossBill);//1000
	         double netamt1 = ((d1*100)/120);
	         double vat1 = d1-netamt1;
	    	
	    	WebElement amount1=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+ledger1no_1+"')]/parent::td/following-sibling::td/a/span"));
	    	
	    	String[] z = amount1.getText().split("", 3);
	    	if (z[0].equals("(")) {
	    		Assert.assertEquals(amount1.getText().substring(1,7).replaceAll(",", ""), String.format("%.2f",vat1));
			} else {
				Assert.assertEquals(amount1.getText().replaceAll(",", ""), String.format("%.2f",vat1));
			}
	    	Reporter.log("Deffered input Vat amount verified: "+amount1.getText());
	    	//sl.ScrollToElement(m_Driver, ele2);
	    	
            WebElement amount2=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+ledger1no_2+"')]/parent::td/following-sibling::td/a/span"));
	    	
	    	String[] z2 = amount2.getText().split("", 3);
	    	if (z2[0].equals("(")) {
	    		Assert.assertEquals(amount2.getText().substring(1,7).replaceAll(",", ""), String.format("%.2f",vat));
			} else {
				Assert.assertEquals(amount2.getText().replaceAll(",", ""), String.format("%.2f",vat));
			}
	    	Reporter.log("Deffered Output Vat amount verified: "+amount2.getText());
	    	//sl.ScrollToElement(m_Driver, ele2);
	    	
	    	
		}
	    Reporter.log("Enteries are Verified on Balance Sheet Report page :", true);
	}
 
 public void verify_BS_ProfitLoss_3007_10(){
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
	    	String ExpAmt = amt.get(i)+".00";
	    	//System.out.println(xx);
	    	//System.out.println(yy);
	    	String[] z = amount.getText().split("", 3);
	    	if (z[0].equals("(")) {
	    		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,8), ExpAmt);
			} else {
				Assert.assertEquals(amount.getText().replaceAll(",", ""), ExpAmt);
			}
	    	Reporter.log("Amount enter verified: "+ActAmt);
	    	sl.ScrollToElement(m_Driver, ele2);
		}
	    Reporter.log("Enteries are Verified on Balance Sheet Report page :", true);
	}
 
 public void verify_BS_ProfitLoss_3103(String ledger1no_1 , String Bf_ledger11,String unitprice,String quantity ,String GrossBill){
		List<WebElement> elements = m_Driver.findElements(By.xpath("//tbody/tr/td[2]/span[contains(text(),'')]/following-sibling::a"));
	    int size = elements.size();
	    System.out.println(size);
	    for (int i = 0; i <size-1; i++) {
	    	WebElement ele2=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+ledger1no_1+"')]/following-sibling::a"));
	    	String led_text = ele2.getText().trim();
	    	System.out.println(led_text);
	    	//String[] ledgersplit = expected_entry.get(i).split("-");
	    	String expectedledger = Bf_ledger11;
	    	Assert.assertEquals(ele2.getText().replaceAll("-", " "), expectedledger.replaceAll("-"," "));
	    	Reporter.log("Ledger code verified: "+led_text);
	    	
	    	d1= Double.parseDouble(unitprice);
	         i1 = Integer.parseInt(quantity);
	         total = d1*i1;
	         vat = ((d1*i1)*STDrate);
	         //total2= total+vat;
	         
	         
	         d2= Double.parseDouble(GrossBill);//1000
	         double netamt1 = ((d2*100)/120);
	         double vat1 = d2-netamt1;
	         total2=((total+vat)-d2)-(vat-vat1);
	         System.out.println(total2);
	    	
	    	WebElement amount=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+ledger1no_1+"')]/parent::td/following-sibling::td/a/span"));
	    	String ActAmt = amount.getText();
	    	//String ExpAmt = amt.get(i)+".00";
	    	//System.out.println(xx);
	    	//System.out.println(yy);
	    	String[] z = amount.getText().split("", 3);
	    	if (z[0].equals("(")) {
	    		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,8), String.format("%.2f",total2));
			} else {
				Assert.assertEquals(amount.getText().replaceAll(",", ""), String.format("%.2f",total2));
			}
	    	Reporter.log("Amount enter verified: "+ActAmt);
	    	//sl.ScrollToElement(m_Driver, ele2);
		}
	    Reporter.log("Enteries are Verified on Balance Sheet Report page :", true);
	    
	    
	}
 
 public void verify_BS_ProfitLoss_3100(String ledger1no_1 , String Bf_ledger11,String unitprice,String quantity ,String GrossBill){
		List<WebElement> elements = m_Driver.findElements(By.xpath("//tbody/tr/td[2]/span[contains(text(),'')]/following-sibling::a"));
	    int size = elements.size();
	    System.out.println(size);
	    for (int i = 0; i <size-1; i++) {
	    	WebElement ele2=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+ledger1no_1+"')]/following-sibling::a"));
	    	String led_text = ele2.getText().trim();
	    	System.out.println(led_text);
	    	String expectedledger = Bf_ledger11;
	    	Assert.assertEquals(ele2.getText().replaceAll("-", " "), expectedledger.replaceAll("-"," "));
	    	Reporter.log("Ledger code verified: "+led_text);
	    	
	    	d1= Double.parseDouble(unitprice);
	         i1 = Integer.parseInt(quantity);
	         total = d1*i1;
	         vat = ((d1*i1)*STDrate);
	         //total2= total+vat;
            d2= Double.parseDouble(GrossBill);//1000
	         double netamt1 = ((d2*100)/120);
	         double vat1 = d2-netamt1;
	         total2=((total+vat)-d2)-(vat-vat1);
	         System.out.println(total2);
	    	
	    	WebElement amount=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+ledger1no_1+"')]/parent::td/following-sibling::td/a/span"));
	    	String ActAmt = amount.getText();
	    	//String ExpAmt = amt.get(i)+".00";
	    	//System.out.println(xx);
	    	//System.out.println(yy);
	    	String[] z = amount.getText().split("", 3);
	    	if (z[0].equals("(")) {
	    		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,8), String.format("%.2f",total2));
			} else {
				Assert.assertEquals(amount.getText().replaceAll(",", ""), String.format("%.2f",total2));
			}
	    	Reporter.log("Amount enter verified: "+ActAmt);
	    	//sl.ScrollToElement(m_Driver, ele2);
		}
	    Reporter.log("Enteries are Verified on Balance Sheet Report page :", true);
	    
	    
	}
 
 
   public void verify_BS_BF_FixedAsset_10_14(String BF_ledger1_No , String Bf_ledger1){
	    	WebElement ele2=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+BF_ledger1_No+"')]/following-sibling::a"));
	    	String led_text = ele2.getText().trim();
	    	System.out.println(led_text);
	    	//String[] ledgersplit = expected_entry.get(i).split("-");
	    	String expectedledger = Bf_ledger1.trim();
	    	Assert.assertEquals(led_text.replaceAll("-", " "), expectedledger.replaceAll("-"," "));
	    	Reporter.log("Ledger code verified: "+led_text);
	    	
	    	WebElement ele3=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+ledger.get(4)+"')]/following-sibling::a"));
	    	String led_text1 = ele3.getText().trim();
	    	System.out.println(led_text1);
	    	String[] ledgersplit = expected_entry.get(4).split("-");
	    	String expectedledger1 = ledgersplit[1].trim();
	    	Assert.assertEquals(led_text1.replaceAll("-", " "), expectedledger1.replaceAll("-"," "));
	    	Reporter.log("Ledger code verified: "+led_text1);
	    	
	    	double amount2 = 0.00;
	    	for (int i = 0; i < amt.size()-1; i++) {
	    		double amt11 = Double.parseDouble(amt.get(i));
	    		amount2=amount2+amt11;
	    		
			}
	    	
	    	WebElement amount=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+BF_ledger1_No+"')]/parent::td/following-sibling::td/a/span"));
	    	String ActAmt = amount.getText();
	    	//String ExpAmt = amt.get(4)+".00";
	    	//System.out.println(xx);
	    	//System.out.println(yy);
	    	String[] z = amount.getText().split("", 3);
	    	if (z[0].equals("(")) {
	    		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,8), String.format("%.2f",amount2));
			} else {
				Assert.assertEquals(amount.getText().replaceAll(",", ""), String.format("%.2f",amount2));
			}
	    	Reporter.log("Amount enter verified: "+ActAmt);
	    	
	    	WebElement amount1=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+ledger.get(4)+"')]/parent::td/following-sibling::td/a/span"));
	    	String ActAmt1 = amount1.getText();
	    	String ExpAmt1 = amt.get(4)+".00";
	    	//System.out.println(xx);
	    	//System.out.println(yy);
	    	String[] z1 = amount1.getText().split("", 3);
	    	if (z1[0].equals("(")) {
	    		Assert.assertEquals(amount1.getText().replaceAll(",", "").substring(1,8), ExpAmt1);
			} else {
				Assert.assertEquals(amount1.getText().replaceAll(",", ""), ExpAmt1);
			}
	    	Reporter.log("Amount enter verified: "+ActAmt1);
	    	sl.ScrollToElement(m_Driver, ele2);
	    	
	    	 Reporter.log("Enteries are Verified on Balance Sheet Report page :", true);
		}
   
 public void verify_BS_BF_FixedAsset_15_19(String BF_ledger1_No , String Bf_ledger1){
   	WebElement ele2=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+BF_ledger1_No+"')]/following-sibling::a"));
   	String led_text = ele2.getText().trim();
   	System.out.println(led_text);
   	//String[] ledgersplit = expected_entry.get(i).split("-");
   	String expectedledger = Bf_ledger1.trim();
   	Assert.assertEquals(led_text.replaceAll("-", " "), expectedledger.replaceAll("-"," "));
   	Reporter.log("Ledger code verified: "+led_text);
   	
   	WebElement ele3=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+ledger.get(4)+"')]/following-sibling::a"));
   	String led_text1 = ele3.getText().trim();
   	System.out.println(led_text1);
   	String[] ledgersplit = expected_entry.get(4).split("-");
   	String expectedledger1 = ledgersplit[1].trim();
   	Assert.assertEquals(led_text1.replaceAll("-", " "), expectedledger1.replaceAll("-"," "));
   	Reporter.log("Ledger code verified: "+led_text1);
   	
   	double amount2 = 0.00;
   	for (int i = 0; i < amt.size()-1; i++) {
   		double amt11 = Double.parseDouble(amt.get(i));
   		amount2=amount2+amt11;
   		
		}
   	
   	WebElement amount=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+BF_ledger1_No+"')]/parent::td/following-sibling::td/a/span"));
   	String ActAmt = amount.getText();
   	//String ExpAmt = amt.get(4)+".00";
   	//System.out.println(xx);
   	//System.out.println(yy);
   	String[] z = amount.getText().split("", 3);
   	if (z[0].equals("(")) {
   		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,8), String.format("%.2f",amount2));
		} else {
			Assert.assertEquals(amount.getText().replaceAll(",", ""), String.format("%.2f",amount2));
		}
   	Reporter.log("Amount enter verified: "+ActAmt);
   	
   	WebElement amount1=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+ledger.get(4)+"')]/parent::td/following-sibling::td/a/span"));
   	String ActAmt1 = amount1.getText();
   	String ExpAmt1 = amt.get(4)+".00";
   	//System.out.println(xx);
   	//System.out.println(yy);
   	String[] z1 = amount1.getText().split("", 3);
   	if (z1[0].equals("(")) {
   		Assert.assertEquals(amount1.getText().replaceAll(",", "").substring(1,8), ExpAmt1);
		} else {
			Assert.assertEquals(amount1.getText().replaceAll(",", ""), ExpAmt1);
		}
   	Reporter.log("Amount enter verified: "+ActAmt1);
   	sl.ScrollToElement(m_Driver, ele2);
   	
   	 Reporter.log("Enteries are Verified on Balance Sheet Report page :", true);
	}
 
 public void verify_BS_BF_FixedAsset_20_24(String BF_ledger1_No , String Bf_ledger1){
	   	WebElement ele2=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+BF_ledger1_No+"')]/following-sibling::a"));
	   	String led_text = ele2.getText().trim();
	   	System.out.println(led_text);
	   	//String[] ledgersplit = expected_entry.get(i).split("-");
	   	String expectedledger = Bf_ledger1.trim();
	   	Assert.assertEquals(led_text.replaceAll("-", " "), expectedledger.replaceAll("-"," "));
	   	Reporter.log("Ledger code verified: "+led_text);
	   	
	   	WebElement ele3=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+ledger.get(4)+"')]/following-sibling::a"));
	   	String led_text1 = ele3.getText().trim();
	   	System.out.println(led_text1);
	   	String[] ledgersplit = expected_entry.get(4).split("-");
	   	String expectedledger1 = ledgersplit[1].trim();
	   	Assert.assertEquals(led_text1.replaceAll("-", " "), expectedledger1.replaceAll("-"," "));
	   	Reporter.log("Ledger code verified: "+led_text1);
	   	
	   	double amount2 = 0.00;
	   	for (int i = 0; i < amt.size()-1; i++) {
	   		double amt11 = Double.parseDouble(amt.get(i));
	   		amount2=amount2+amt11;
	   		
			}
	   	
	   	WebElement amount=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+BF_ledger1_No+"')]/parent::td/following-sibling::td/a/span"));
	   	String ActAmt = amount.getText();
	   	//String ExpAmt = amt.get(4)+".00";
	   	//System.out.println(xx);
	   	//System.out.println(yy);
	   	String[] z = amount.getText().split("", 3);
	   	if (z[0].equals("(")) {
	   		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,8), String.format("%.2f",amount2));
			} else {
				Assert.assertEquals(amount.getText().replaceAll(",", ""), String.format("%.2f",amount2));
			}
	   	Reporter.log("Amount enter verified: "+ActAmt);
	   	
	   	WebElement amount1=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+ledger.get(4)+"')]/parent::td/following-sibling::td/a/span"));
	   	String ActAmt1 = amount1.getText();
	   	String ExpAmt1 = amt.get(4)+".00";
	   	//System.out.println(xx);
	   	//System.out.println(yy);
	   	String[] z1 = amount1.getText().split("", 3);
	   	if (z1[0].equals("(")) {
	   		Assert.assertEquals(amount1.getText().replaceAll(",", "").substring(1,8), ExpAmt1);
			} else {
				Assert.assertEquals(amount1.getText().replaceAll(",", ""), ExpAmt1);
			}
	   	Reporter.log("Amount enter verified: "+ActAmt1);
	   	sl.ScrollToElement(m_Driver, ele2);
	   	
	   	 Reporter.log("Enteries are Verified on Balance Sheet Report page :", true);
		}
 
 public void verify_BS_BF_FixedAsset_25_29(String BF_ledger1_No , String Bf_ledger1){
	   	WebElement ele2=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+BF_ledger1_No+"')]/following-sibling::a"));
	   	String led_text = ele2.getText().trim();
	   	System.out.println(led_text);
	   	//String[] ledgersplit = expected_entry.get(i).split("-");
	   	String expectedledger = Bf_ledger1.trim();
	   	Assert.assertEquals(led_text.replaceAll("-", " "), expectedledger.replaceAll("-"," "));
	   	Reporter.log("Ledger code verified: "+led_text);
	   	
	   	WebElement ele3=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+ledger.get(4)+"')]/following-sibling::a"));
	   	String led_text1 = ele3.getText().trim();
	   	System.out.println(led_text1);
	   	String[] ledgersplit = expected_entry.get(4).split("-");
	   	String expectedledger1 = ledgersplit[1].trim();
	   	Assert.assertEquals(led_text1.replaceAll("-", " "), expectedledger1.replaceAll("-"," "));
	   	Reporter.log("Ledger code verified: "+led_text1);
	   	
	   	double amount2 = 0.00;
	   	for (int i = 0; i < amt.size()-1; i++) {
	   		double amt11 = Double.parseDouble(amt.get(i));
	   		amount2=amount2+amt11;
	   		
			}
	   	
	   	WebElement amount=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+BF_ledger1_No+"')]/parent::td/following-sibling::td/a/span"));
	   	String ActAmt = amount.getText();
	   	//String ExpAmt = amt.get(4)+".00";
	   	//System.out.println(xx);
	   	//System.out.println(yy);
	   	String[] z = amount.getText().split("", 3);
	   	if (z[0].equals("(")) {
	   		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,8), String.format("%.2f",amount2));
			} else {
				Assert.assertEquals(amount.getText().replaceAll(",", ""), String.format("%.2f",amount2));
			}
	   	Reporter.log("Amount enter verified: "+ActAmt);
	   	
	   	WebElement amount1=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+ledger.get(4)+"')]/parent::td/following-sibling::td/a/span"));
	   	String ActAmt1 = amount1.getText();
	   	String ExpAmt1 = amt.get(4)+".00";
	   	//System.out.println(xx);
	   	//System.out.println(yy);
	   	String[] z1 = amount1.getText().split("", 3);
	   	if (z1[0].equals("(")) {
	   		Assert.assertEquals(amount1.getText().replaceAll(",", "").substring(1,8), ExpAmt1);
			} else {
				Assert.assertEquals(amount1.getText().replaceAll(",", ""), ExpAmt1);
			}
	   	Reporter.log("Amount enter verified: "+ActAmt1);
	   	sl.ScrollToElement(m_Driver, ele2);
	   	
	   	 Reporter.log("Enteries are Verified on Balance Sheet Report page :", true);
		}
 
 public void verify_BS_BF_FixedAsset_30_34(String BF_ledger1_No , String Bf_ledger1){
	   	WebElement ele2=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+BF_ledger1_No+"')]/following-sibling::a"));
	   	String led_text = ele2.getText().trim();
	   	System.out.println(led_text);
	   	//String[] ledgersplit = expected_entry.get(i).split("-");
	   	String expectedledger = Bf_ledger1.trim();
	   	Assert.assertEquals(led_text.replaceAll("-", " "), expectedledger.replaceAll("-"," "));
	   	Reporter.log("Ledger code verified: "+led_text);
	   	
	   	WebElement ele3=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+ledger.get(4)+"')]/following-sibling::a"));
	   	String led_text1 = ele3.getText().trim();
	   	System.out.println(led_text1);
	   	String[] ledgersplit = expected_entry.get(4).split("-");
	   	String expectedledger1 = ledgersplit[1].trim();
	   	Assert.assertEquals(led_text1.replaceAll("-", " "), expectedledger1.replaceAll("-"," "));
	   	Reporter.log("Ledger code verified: "+led_text1);
	   	
	   	double amount2 = 0.00;
	   	for (int i = 0; i < amt.size()-1; i++) {
	   		double amt11 = Double.parseDouble(amt.get(i));
	   		amount2=amount2+amt11;
	   		
			}
	   	
	   	WebElement amount=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+BF_ledger1_No+"')]/parent::td/following-sibling::td/a/span"));
	   	String ActAmt = amount.getText();
	   	//String ExpAmt = amt.get(4)+".00";
	   	//System.out.println(xx);
	   	//System.out.println(yy);
	   	String[] z = amount.getText().split("", 3);
	   	if (z[0].equals("(")) {
	   		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,8), String.format("%.2f",amount2));
			} else {
				Assert.assertEquals(amount.getText().replaceAll(",", ""), String.format("%.2f",amount2));
			}
	   	Reporter.log("Amount enter verified: "+ActAmt);
	   	
	   	WebElement amount1=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+ledger.get(4)+"')]/parent::td/following-sibling::td/a/span"));
	   	String ActAmt1 = amount1.getText();
	   	String ExpAmt1 = amt.get(4)+".00";
	   	//System.out.println(xx);
	   	//System.out.println(yy);
	   	String[] z1 = amount1.getText().split("", 3);
	   	if (z1[0].equals("(")) {
	   		Assert.assertEquals(amount1.getText().replaceAll(",", "").substring(1,8), ExpAmt1);
			} else {
				Assert.assertEquals(amount1.getText().replaceAll(",", ""), ExpAmt1);
			}
	   	Reporter.log("Amount enter verified: "+ActAmt1);
	   	sl.ScrollToElement(m_Driver, ele2);
	   	
	   	 Reporter.log("Enteries are Verified on Balance Sheet Report page :", true);
		}
 
 public void verify_BS_BF_FixedAsset_35_39(String BF_ledger1_No , String Bf_ledger1){
	   	WebElement ele2=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+BF_ledger1_No+"')]/following-sibling::a"));
	   	String led_text = ele2.getText().trim();
	   	System.out.println(led_text);
	   	//String[] ledgersplit = expected_entry.get(i).split("-");
	   	String expectedledger = Bf_ledger1.trim();
	   	Assert.assertEquals(led_text.replaceAll("-", " "), expectedledger.replaceAll("-"," "));
	   	Reporter.log("Ledger code verified: "+led_text);
	   	
	   	WebElement ele3=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+ledger.get(4)+"')]/following-sibling::a"));
	   	String led_text1 = ele3.getText().trim();
	   	System.out.println(led_text1);
	   	String[] ledgersplit = expected_entry.get(4).split("-");
	   	String expectedledger1 = ledgersplit[1].trim();
	   	Assert.assertEquals(led_text1.replaceAll("-", " "), expectedledger1.replaceAll("-"," "));
	   	Reporter.log("Ledger code verified: "+led_text1);
	   	
	   	double amount2 = 0.00;
	   	for (int i = 0; i < amt.size()-1; i++) {
	   		double amt11 = Double.parseDouble(amt.get(i));
	   		amount2=amount2+amt11;
	   		
			}
	   	
	   	WebElement amount=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+BF_ledger1_No+"')]/parent::td/following-sibling::td/a/span"));
	   	String ActAmt = amount.getText();
	   	//String ExpAmt = amt.get(4)+".00";
	   	//System.out.println(xx);
	   	//System.out.println(yy);
	   	String[] z = amount.getText().split("", 3);
	   	if (z[0].equals("(")) {
	   		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,8), String.format("%.2f",amount2));
			} else {
				Assert.assertEquals(amount.getText().replaceAll(",", ""), String.format("%.2f",amount2));
			}
	   	Reporter.log("Amount enter verified: "+ActAmt);
	   	
	   	WebElement amount1=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+ledger.get(4)+"')]/parent::td/following-sibling::td/a/span"));
	   	String ActAmt1 = amount1.getText();
	   	String ExpAmt1 = amt.get(4)+".00";
	   	//System.out.println(xx);
	   	//System.out.println(yy);
	   	String[] z1 = amount1.getText().split("", 3);
	   	if (z1[0].equals("(")) {
	   		Assert.assertEquals(amount1.getText().replaceAll(",", "").substring(1,8), ExpAmt1);
			} else {
				Assert.assertEquals(amount1.getText().replaceAll(",", ""), ExpAmt1);
			}
	   	Reporter.log("Amount enter verified: "+ActAmt1);
	   	sl.ScrollToElement(m_Driver, ele2);
	   	
	   	 Reporter.log("Enteries are Verified on Balance Sheet Report page :", true);
		}
 
 public void verify_BS_BF_FixedAsset_40_44(String BF_ledger1_No , String Bf_ledger1){
	   	WebElement ele2=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+BF_ledger1_No+"')]/following-sibling::a"));
	   	String led_text = ele2.getText().trim();
	   	System.out.println(led_text);
	   	//String[] ledgersplit = expected_entry.get(i).split("-");
	   	String expectedledger = Bf_ledger1.trim();
	   	Assert.assertEquals(led_text.replaceAll("-", " "), expectedledger.replaceAll("-"," "));
	   	Reporter.log("Ledger code verified: "+led_text);
	   	
	   	WebElement ele3=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+ledger.get(4)+"')]/following-sibling::a"));
	   	String led_text1 = ele3.getText().trim();
	   	System.out.println(led_text1);
	   	String[] ledgersplit = expected_entry.get(4).split("-");
	   	String expectedledger1 = ledgersplit[1].trim();
	   	Assert.assertEquals(led_text1.replaceAll("-", " "), expectedledger1.replaceAll("-"," "));
	   	Reporter.log("Ledger code verified: "+led_text1);
	   	
	   	double amount2 = 0.00;
	   	for (int i = 0; i < amt.size()-1; i++) {
	   		double amt11 = Double.parseDouble(amt.get(i));
	   		amount2=amount2+amt11;
	   		
			}
	   	
	   	WebElement amount=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+BF_ledger1_No+"')]/parent::td/following-sibling::td/a/span"));
	   	String ActAmt = amount.getText();
	   	//String ExpAmt = amt.get(4)+".00";
	   	//System.out.println(xx);
	   	//System.out.println(yy);
	   	String[] z = amount.getText().split("", 3);
	   	if (z[0].equals("(")) {
	   		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,8), String.format("%.2f",amount2));
			} else {
				Assert.assertEquals(amount.getText().replaceAll(",", ""), String.format("%.2f",amount2));
			}
	   	Reporter.log("Amount enter verified: "+ActAmt);
	   	
	   	WebElement amount1=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+ledger.get(4)+"')]/parent::td/following-sibling::td/a/span"));
	   	String ActAmt1 = amount1.getText();
	   	String ExpAmt1 = amt.get(4)+".00";
	   	//System.out.println(xx);
	   	//System.out.println(yy);
	   	String[] z1 = amount1.getText().split("", 3);
	   	if (z1[0].equals("(")) {
	   		Assert.assertEquals(amount1.getText().replaceAll(",", "").substring(1,8), ExpAmt1);
			} else {
				Assert.assertEquals(amount1.getText().replaceAll(",", ""), ExpAmt1);
			}
	   	Reporter.log("Amount enter verified: "+ActAmt1);
	   	sl.ScrollToElement(m_Driver, ele2);
	   	
	   	 Reporter.log("Enteries are Verified on Balance Sheet Report page :", true);
		}
 
 public void verify_BS_BF_FixedAsset_45_49(String BF_ledger1_No , String Bf_ledger1){
	   	WebElement ele2=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+BF_ledger1_No+"')]/following-sibling::a"));
	   	String led_text = ele2.getText().trim();
	   	System.out.println(led_text);
	   	//String[] ledgersplit = expected_entry.get(i).split("-");
	   	String expectedledger = Bf_ledger1.trim();
	   	Assert.assertEquals(led_text.replaceAll("-", " "), expectedledger.replaceAll("-"," "));
	   	Reporter.log("Ledger code verified: "+led_text);
	   	
	   	WebElement ele3=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+ledger.get(4)+"')]/following-sibling::a"));
	   	String led_text1 = ele3.getText().trim();
	   	System.out.println(led_text1);
	   	String[] ledgersplit = expected_entry.get(4).split("-");
	   	String expectedledger1 = ledgersplit[1].trim();
	   	Assert.assertEquals(led_text1.replaceAll("-", " "), expectedledger1.replaceAll("-"," "));
	   	Reporter.log("Ledger code verified: "+led_text1);
	   	
	   	double amount2 = 0.00;
	   	for (int i = 0; i < amt.size()-1; i++) {
	   		double amt11 = Double.parseDouble(amt.get(i));
	   		amount2=amount2+amt11;
	   		
			}
	   	
	   	WebElement amount=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+BF_ledger1_No+"')]/parent::td/following-sibling::td/a/span"));
	   	String ActAmt = amount.getText();
	   	//String ExpAmt = amt.get(4)+".00";
	   	//System.out.println(xx);
	   	//System.out.println(yy);
	   	String[] z = amount.getText().split("", 3);
	   	if (z[0].equals("(")) {
	   		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,8), String.format("%.2f",amount2));
			} else {
				Assert.assertEquals(amount.getText().replaceAll(",", ""), String.format("%.2f",amount2));
			}
	   	Reporter.log("Amount enter verified: "+ActAmt);
	   	
	   	WebElement amount1=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+ledger.get(4)+"')]/parent::td/following-sibling::td/a/span"));
	   	String ActAmt1 = amount1.getText();
	   	String ExpAmt1 = amt.get(4)+".00";
	   	//System.out.println(xx);
	   	//System.out.println(yy);
	   	String[] z1 = amount1.getText().split("", 3);
	   	if (z1[0].equals("(")) {
	   		Assert.assertEquals(amount1.getText().replaceAll(",", "").substring(1,8), ExpAmt1);
			} else {
				Assert.assertEquals(amount1.getText().replaceAll(",", ""), ExpAmt1);
			}
	   	Reporter.log("Amount enter verified: "+ActAmt1);
	   	sl.ScrollToElement(m_Driver, ele2);
	   	
	   	 Reporter.log("Enteries are Verified on Balance Sheet Report page :", true);
		}
 
 public void verify_BS_BF_FixedAsset_200_204(String BF_ledger1_No , String Bf_ledger1){
	   	WebElement ele2=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+BF_ledger1_No+"')]/following-sibling::a"));
	   	String led_text = ele2.getText().trim();
	   	System.out.println(led_text);
	   	//String[] ledgersplit = expected_entry.get(i).split("-");
	   	String expectedledger = Bf_ledger1.trim();
	   	Assert.assertEquals(led_text.replaceAll("-", " "), expectedledger.replaceAll("-"," "));
	   	Reporter.log("Ledger code verified: "+led_text);
	   	
	   	WebElement ele3=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+ledger.get(4)+"')]/following-sibling::a"));
	   	String led_text1 = ele3.getText().trim();
	   	System.out.println(led_text1);
	   	String[] ledgersplit = expected_entry.get(4).split("-");
	   	String expectedledger1 = ledgersplit[1].trim();
	   	Assert.assertEquals(led_text1.replaceAll("-", " "), expectedledger1.replaceAll("-"," "));
	   	Reporter.log("Ledger code verified: "+led_text1);
	   	
	   	double amount2 = 0.00;
	   	for (int i = 0; i < amt.size()-1; i++) {
	   		double amt11 = Double.parseDouble(amt.get(i));
	   		amount2=amount2+amt11;
	   		
			}
	   	
	   	WebElement amount=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+BF_ledger1_No+"')]/parent::td/following-sibling::td/a/span"));
	   	String ActAmt = amount.getText();
	   	//String ExpAmt = amt.get(4)+".00";
	   	//System.out.println(xx);
	   	//System.out.println(yy);
	   	String[] z = amount.getText().split("", 3);
	   	if (z[0].equals("(")) {
	   		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,8), String.format("%.2f",amount2));
			} else {
				Assert.assertEquals(amount.getText().replaceAll(",", ""), String.format("%.2f",amount2));
			}
	   	Reporter.log("Amount enter verified: "+ActAmt);
	   	
	   	WebElement amount1=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+ledger.get(4)+"')]/parent::td/following-sibling::td/a/span"));
	   	String ActAmt1 = amount1.getText();
	   	String ExpAmt1 = amt.get(4)+".00";
	   	//System.out.println(xx);
	   	//System.out.println(yy);
	   	String[] z1 = amount1.getText().split("", 3);
	   	if (z1[0].equals("(")) {
	   		Assert.assertEquals(amount1.getText().replaceAll(",", "").substring(1,8), ExpAmt1);
			} else {
				Assert.assertEquals(amount1.getText().replaceAll(",", ""), ExpAmt1);
			}
	   	Reporter.log("Amount enter verified: "+ActAmt1);
	   	sl.ScrollToElement(m_Driver, ele2);
	   	
	   	 Reporter.log("Enteries are Verified on Balance Sheet Report page :", true);
		}
 
 public void verify_BS_BF_FixedAsset_205_209(String BF_ledger1_No , String Bf_ledger1){
	   	WebElement ele2=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+BF_ledger1_No+"')]/following-sibling::a"));
	   	String led_text = ele2.getText().trim();
	   	System.out.println(led_text);
	   	//String[] ledgersplit = expected_entry.get(i).split("-");
	   	String expectedledger = Bf_ledger1.trim();
	   	Assert.assertEquals(led_text.replaceAll("-", " "), expectedledger.replaceAll("-"," "));
	   	Reporter.log("Ledger code verified: "+led_text);
	   	
	   	WebElement ele3=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+ledger.get(4)+"')]/following-sibling::a"));
	   	String led_text1 = ele3.getText().trim();
	   	System.out.println(led_text1);
	   	String[] ledgersplit = expected_entry.get(4).split("-");
	   	String expectedledger1 = ledgersplit[1].trim();
	   	Assert.assertEquals(led_text1.replaceAll("-", " "), expectedledger1.replaceAll("-"," "));
	   	Reporter.log("Ledger code verified: "+led_text1);
	   	
	   	double amount2 = 0.00;
	   	for (int i = 0; i < amt.size()-1; i++) {
	   		double amt11 = Double.parseDouble(amt.get(i));
	   		amount2=amount2+amt11;
	   		
			}
	   	
	   	WebElement amount=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+BF_ledger1_No+"')]/parent::td/following-sibling::td/a/span"));
	   	String ActAmt = amount.getText();
	   	//String ExpAmt = amt.get(4)+".00";
	   	//System.out.println(xx);
	   	//System.out.println(yy);
	   	String[] z = amount.getText().split("", 3);
	   	if (z[0].equals("(")) {
	   		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,8), String.format("%.2f",amount2));
			} else {
				Assert.assertEquals(amount.getText().replaceAll(",", ""), String.format("%.2f",amount2));
			}
	   	Reporter.log("Amount enter verified: "+ActAmt);
	   	
	   	WebElement amount1=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+ledger.get(4)+"')]/parent::td/following-sibling::td/a/span"));
	   	String ActAmt1 = amount1.getText();
	   	String ExpAmt1 = amt.get(4)+".00";
	   	//System.out.println(xx);
	   	//System.out.println(yy);
	   	String[] z1 = amount1.getText().split("", 3);
	   	if (z1[0].equals("(")) {
	   		Assert.assertEquals(amount1.getText().replaceAll(",", "").substring(1,8), ExpAmt1);
			} else {
				Assert.assertEquals(amount1.getText().replaceAll(",", ""), ExpAmt1);
			}
	   	Reporter.log("Amount enter verified: "+ActAmt1);
	   	sl.ScrollToElement(m_Driver, ele2);
	   	
	   	 Reporter.log("Enteries are Verified on Balance Sheet Report page :", true);
		}
 
 public void verify_BS_BF_FixedAsset_210_214(String BF_ledger1_No , String Bf_ledger1){
	   	WebElement ele2=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+BF_ledger1_No+"')]/following-sibling::a"));
	   	String led_text = ele2.getText().trim();
	   	System.out.println(led_text);
	   	//String[] ledgersplit = expected_entry.get(i).split("-");
	   	String expectedledger = Bf_ledger1.trim();
	   	Assert.assertEquals(led_text.replaceAll("-", " "), expectedledger.replaceAll("-"," "));
	   	Reporter.log("Ledger code verified: "+led_text);
	   	
	   	WebElement ele3=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+ledger.get(4)+"')]/following-sibling::a"));
	   	String led_text1 = ele3.getText().trim();
	   	System.out.println(led_text1);
	   	String[] ledgersplit = expected_entry.get(4).split("-");
	   	String expectedledger1 = ledgersplit[1].trim();
	   	Assert.assertEquals(led_text1.replaceAll("-", " "), expectedledger1.replaceAll("-"," "));
	   	Reporter.log("Ledger code verified: "+led_text1);
	   	
	   	double amount2 = 0.00;
	   	for (int i = 0; i < amt.size()-1; i++) {
	   		double amt11 = Double.parseDouble(amt.get(i));
	   		amount2=amount2+amt11;
	   		
			}
	   	
	   	WebElement amount=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+BF_ledger1_No+"')]/parent::td/following-sibling::td/a/span"));
	   	String ActAmt = amount.getText();
	   	//String ExpAmt = amt.get(4)+".00";
	   	//System.out.println(xx);
	   	//System.out.println(yy);
	   	String[] z = amount.getText().split("", 3);
	   	if (z[0].equals("(")) {
	   		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,8), String.format("%.2f",amount2));
			} else {
				Assert.assertEquals(amount.getText().replaceAll(",", ""), String.format("%.2f",amount2));
			}
	   	Reporter.log("Amount enter verified: "+ActAmt);
	   	
	   	WebElement amount1=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+ledger.get(4)+"')]/parent::td/following-sibling::td/a/span"));
	   	String ActAmt1 = amount1.getText();
	   	String ExpAmt1 = amt.get(4)+".00";
	   	//System.out.println(xx);
	   	//System.out.println(yy);
	   	String[] z1 = amount1.getText().split("", 3);
	   	if (z1[0].equals("(")) {
	   		Assert.assertEquals(amount1.getText().replaceAll(",", "").substring(1,8), ExpAmt1);
			} else {
				Assert.assertEquals(amount1.getText().replaceAll(",", ""), ExpAmt1);
			}
	   	Reporter.log("Amount enter verified: "+ActAmt1);
	   	sl.ScrollToElement(m_Driver, ele2);
	   	
	   	 Reporter.log("Enteries are Verified on Balance Sheet Report page :", true);
		}
	   
 public void verify_BS_BF_FixedAsset_215_219(String BF_ledger1_No , String Bf_ledger1){
	   	WebElement ele2=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+BF_ledger1_No+"')]/following-sibling::a"));
	   	String led_text = ele2.getText().trim();
	   	System.out.println(led_text);
	   	//String[] ledgersplit = expected_entry.get(i).split("-");
	   	String expectedledger = Bf_ledger1.trim();
	   	Assert.assertEquals(led_text.replaceAll("-", " "), expectedledger.replaceAll("-"," "));
	   	Reporter.log("Ledger code verified: "+led_text);
	   	
	   	WebElement ele3=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+ledger.get(4)+"')]/following-sibling::a"));
	   	String led_text1 = ele3.getText().trim();
	   	System.out.println(led_text1);
	   	String[] ledgersplit = expected_entry.get(4).split("-");
	   	String expectedledger1 = ledgersplit[1].trim();
	   	Assert.assertEquals(led_text1.replaceAll("-", " "), expectedledger1.replaceAll("-"," "));
	   	Reporter.log("Ledger code verified: "+led_text1);
	   	
	   	double amount2 = 0.00;
	   	for (int i = 0; i < amt.size()-1; i++) {
	   		double amt11 = Double.parseDouble(amt.get(i));
	   		amount2=amount2+amt11;
	   		
			}
	   	
	   	WebElement amount=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+BF_ledger1_No+"')]/parent::td/following-sibling::td/a/span"));
	   	String ActAmt = amount.getText();
	   	//String ExpAmt = amt.get(4)+".00";
	   	//System.out.println(xx);
	   	//System.out.println(yy);
	   	String[] z = amount.getText().split("", 3);
	   	if (z[0].equals("(")) {
	   		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,8), String.format("%.2f",amount2));
			} else {
				Assert.assertEquals(amount.getText().replaceAll(",", ""), String.format("%.2f",amount2));
			}
	   	Reporter.log("Amount enter verified: "+ActAmt);
	   	
	   	WebElement amount1=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+ledger.get(4)+"')]/parent::td/following-sibling::td/a/span"));
	   	String ActAmt1 = amount1.getText();
	   	String ExpAmt1 = amt.get(4)+".00";
	   	//System.out.println(xx);
	   	//System.out.println(yy);
	   	String[] z1 = amount1.getText().split("", 3);
	   	if (z1[0].equals("(")) {
	   		Assert.assertEquals(amount1.getText().replaceAll(",", "").substring(1,8), ExpAmt1);
			} else {
				Assert.assertEquals(amount1.getText().replaceAll(",", ""), ExpAmt1);
			}
	   	Reporter.log("Amount enter verified: "+ActAmt1);
	   	sl.ScrollToElement(m_Driver, ele2);
	   	
	   	 Reporter.log("Enteries are Verified on Balance Sheet Report page :", true);
		}
 
 public void verify_BS_BF_FixedAsset_220_224(String BF_ledger1_No , String Bf_ledger1){
	   	WebElement ele2=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+BF_ledger1_No+"')]/following-sibling::a"));
	   	String led_text = ele2.getText().trim();
	   	System.out.println(led_text);
	   	//String[] ledgersplit = expected_entry.get(i).split("-");
	   	String expectedledger = Bf_ledger1.trim();
	   	Assert.assertEquals(led_text.replaceAll("-", " "), expectedledger.replaceAll("-"," "));
	   	Reporter.log("Ledger code verified: "+led_text);
	   	
	   	WebElement ele3=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+ledger.get(4)+"')]/following-sibling::a"));
	   	String led_text1 = ele3.getText().trim();
	   	System.out.println(led_text1);
	   	String[] ledgersplit = expected_entry.get(4).split("-");
	   	String expectedledger1 = ledgersplit[1].trim();
	   	Assert.assertEquals(led_text1.replaceAll("-", " "), expectedledger1.replaceAll("-"," "));
	   	Reporter.log("Ledger code verified: "+led_text1);
	   	
	   	double amount2 = 0.00;
	   	for (int i = 0; i < amt.size()-1; i++) {
	   		double amt11 = Double.parseDouble(amt.get(i));
	   		amount2=amount2+amt11;
	   		
			}
	   	
	   	WebElement amount=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+BF_ledger1_No+"')]/parent::td/following-sibling::td/a/span"));
	   	String ActAmt = amount.getText();
	   	//String ExpAmt = amt.get(4)+".00";
	   	//System.out.println(xx);
	   	//System.out.println(yy);
	   	String[] z = amount.getText().split("", 3);
	   	if (z[0].equals("(")) {
	   		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,8), String.format("%.2f",amount2));
			} else {
				Assert.assertEquals(amount.getText().replaceAll(",", ""), String.format("%.2f",amount2));
			}
	   	Reporter.log("Amount enter verified: "+ActAmt);
	   	
	   	WebElement amount1=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+ledger.get(4)+"')]/parent::td/following-sibling::td/a/span"));
	   	String ActAmt1 = amount1.getText();
	   	String ExpAmt1 = amt.get(4)+".00";
	   	//System.out.println(xx);
	   	//System.out.println(yy);
	   	String[] z1 = amount1.getText().split("", 3);
	   	if (z1[0].equals("(")) {
	   		Assert.assertEquals(amount1.getText().replaceAll(",", "").substring(1,8), ExpAmt1);
			} else {
				Assert.assertEquals(amount1.getText().replaceAll(",", ""), ExpAmt1);
			}
	   	Reporter.log("Amount enter verified: "+ActAmt1);
	   	sl.ScrollToElement(m_Driver, ele2);
	   	
	   	 Reporter.log("Enteries are Verified on Balance Sheet Report page :", true);
		}
 
 public void verify_BS_BF_FixedAsset_225_229(String BF_ledger1_No , String Bf_ledger1){
	   	WebElement ele2=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+BF_ledger1_No+"')]/following-sibling::a"));
	   	String led_text = ele2.getText().trim();
	   	System.out.println(led_text);
	   	//String[] ledgersplit = expected_entry.get(i).split("-");
	   	String expectedledger = Bf_ledger1.trim();
	   	Assert.assertEquals(led_text.replaceAll("-", " "), expectedledger.replaceAll("-"," "));
	   	Reporter.log("Ledger code verified: "+led_text);
	   	
	   	WebElement ele3=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+ledger.get(4)+"')]/following-sibling::a"));
	   	String led_text1 = ele3.getText().trim();
	   	System.out.println(led_text1);
	   	String[] ledgersplit = expected_entry.get(4).split("-");
	   	String expectedledger1 = ledgersplit[1].trim();
	   	Assert.assertEquals(led_text1.replaceAll("-", " "), expectedledger1.replaceAll("-"," "));
	   	Reporter.log("Ledger code verified: "+led_text1);
	   	
	   	double amount2 = 0.00;
	   	for (int i = 0; i < amt.size()-1; i++) {
	   		double amt11 = Double.parseDouble(amt.get(i));
	   		amount2=amount2+amt11;
	   		
			}
	   	
	   	WebElement amount=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+BF_ledger1_No+"')]/parent::td/following-sibling::td/a/span"));
	   	String ActAmt = amount.getText();
	   	//String ExpAmt = amt.get(4)+".00";
	   	//System.out.println(xx);
	   	//System.out.println(yy);
	   	String[] z = amount.getText().split("", 3);
	   	if (z[0].equals("(")) {
	   		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,8), String.format("%.2f",amount2));
			} else {
				Assert.assertEquals(amount.getText().replaceAll(",", ""), String.format("%.2f",amount2));
			}
	   	Reporter.log("Amount enter verified: "+ActAmt);
	   	
	   	WebElement amount1=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+ledger.get(4)+"')]/parent::td/following-sibling::td/a/span"));
	   	String ActAmt1 = amount1.getText();
	   	String ExpAmt1 = amt.get(4)+".00";
	   	//System.out.println(xx);
	   	//System.out.println(yy);
	   	String[] z1 = amount1.getText().split("", 3);
	   	if (z1[0].equals("(")) {
	   		Assert.assertEquals(amount1.getText().replaceAll(",", "").substring(1,8), ExpAmt1);
			} else {
				Assert.assertEquals(amount1.getText().replaceAll(",", ""), ExpAmt1);
			}
	   	Reporter.log("Amount enter verified: "+ActAmt1);
	   	sl.ScrollToElement(m_Driver, ele2);
	   	
	   	 Reporter.log("Enteries are Verified on Balance Sheet Report page :", true);
		}
 
 public void verify_BS_BF_FixedAsset_230_234(String BF_ledger1_No , String Bf_ledger1){
	   	WebElement ele2=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+BF_ledger1_No+"')]/following-sibling::a"));
	   	String led_text = ele2.getText().trim();
	   	System.out.println(led_text);
	   	//String[] ledgersplit = expected_entry.get(i).split("-");
	   	String expectedledger = Bf_ledger1.trim();
	   	Assert.assertEquals(led_text.replaceAll("-", " "), expectedledger.replaceAll("-"," "));
	   	Reporter.log("Ledger code verified: "+led_text);
	   	
	   	WebElement ele3=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+ledger.get(4)+"')]/following-sibling::a"));
	   	String led_text1 = ele3.getText().trim();
	   	System.out.println(led_text1);
	   	String[] ledgersplit = expected_entry.get(4).split("-");
	   	String expectedledger1 = ledgersplit[1].trim();
	   	Assert.assertEquals(led_text1.replaceAll("-", " "), expectedledger1.replaceAll("-"," "));
	   	Reporter.log("Ledger code verified: "+led_text1);
	   	
	   	double amount2 = 0.00;
	   	for (int i = 0; i < amt.size()-1; i++) {
	   		double amt11 = Double.parseDouble(amt.get(i));
	   		amount2=amount2+amt11;
	   		
			}
	   	
	   	WebElement amount=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+BF_ledger1_No+"')]/parent::td/following-sibling::td/a/span"));
	   	String ActAmt = amount.getText();
	   	//String ExpAmt = amt.get(4)+".00";
	   	//System.out.println(xx);
	   	//System.out.println(yy);
	   	String[] z = amount.getText().split("", 3);
	   	if (z[0].equals("(")) {
	   		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,8), String.format("%.2f",amount2));
			} else {
				Assert.assertEquals(amount.getText().replaceAll(",", ""), String.format("%.2f",amount2));
			}
	   	Reporter.log("Amount enter verified: "+ActAmt);
	   	
	   	WebElement amount1=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+ledger.get(4)+"')]/parent::td/following-sibling::td/a/span"));
	   	String ActAmt1 = amount1.getText();
	   	String ExpAmt1 = amt.get(4)+".00";
	   	//System.out.println(xx);
	   	//System.out.println(yy);
	   	String[] z1 = amount1.getText().split("", 3);
	   	if (z1[0].equals("(")) {
	   		Assert.assertEquals(amount1.getText().replaceAll(",", "").substring(1,8), ExpAmt1);
			} else {
				Assert.assertEquals(amount1.getText().replaceAll(",", ""), ExpAmt1);
			}
	   	Reporter.log("Amount enter verified: "+ActAmt1);
	   	sl.ScrollToElement(m_Driver, ele2);
	   	
	   	 Reporter.log("Enteries are Verified on Balance Sheet Report page :", true);
		}
 public void verify_BS_BF_FixedAsset_235_239(String BF_ledger1_No , String Bf_ledger1){
	   	WebElement ele2=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+BF_ledger1_No+"')]/following-sibling::a"));
	   	String led_text = ele2.getText().trim();
	   	System.out.println(led_text);
	   	//String[] ledgersplit = expected_entry.get(i).split("-");
	   	String expectedledger = Bf_ledger1.trim();
	   	Assert.assertEquals(led_text.replaceAll("-", " "), expectedledger.replaceAll("-"," "));
	   	Reporter.log("Ledger code verified: "+led_text);
	   	
	   	WebElement ele3=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+ledger.get(4)+"')]/following-sibling::a"));
	   	String led_text1 = ele3.getText().trim();
	   	System.out.println(led_text1);
	   	String[] ledgersplit = expected_entry.get(4).split("-");
	   	String expectedledger1 = ledgersplit[1].trim();
	   	Assert.assertEquals(led_text1.replaceAll("-", " "), expectedledger1.replaceAll("-"," "));
	   	Reporter.log("Ledger code verified: "+led_text1);
	   	
	   	double amount2 = 0.00;
	   	for (int i = 0; i < amt.size()-1; i++) {
	   		double amt11 = Double.parseDouble(amt.get(i));
	   		amount2=amount2+amt11;
	   		
			}
	   	
	   	WebElement amount=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+BF_ledger1_No+"')]/parent::td/following-sibling::td/a/span"));
	   	String ActAmt = amount.getText();
	   	//String ExpAmt = amt.get(4)+".00";
	   	//System.out.println(xx);
	   	//System.out.println(yy);
	   	String[] z = amount.getText().split("", 3);
	   	if (z[0].equals("(")) {
	   		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,8), String.format("%.2f",amount2));
			} else {
				Assert.assertEquals(amount.getText().replaceAll(",", ""), String.format("%.2f",amount2));
			}
	   	Reporter.log("Amount enter verified: "+ActAmt);
	   	
	   	WebElement amount1=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+ledger.get(4)+"')]/parent::td/following-sibling::td/a/span"));
	   	String ActAmt1 = amount1.getText();
	   	String ExpAmt1 = amt.get(4)+".00";
	   	//System.out.println(xx);
	   	//System.out.println(yy);
	   	String[] z1 = amount1.getText().split("", 3);
	   	if (z1[0].equals("(")) {
	   		Assert.assertEquals(amount1.getText().replaceAll(",", "").substring(1,8), ExpAmt1);
			} else {
				Assert.assertEquals(amount1.getText().replaceAll(",", ""), ExpAmt1);
			}
	   	Reporter.log("Amount enter verified: "+ActAmt1);
	   	sl.ScrollToElement(m_Driver, ele2);
	   	
	   	 Reporter.log("Enteries are Verified on Balance Sheet Report page :", true);
		}
 
 public void verify_BS_BF_FixedAsset_240_244(String BF_ledger1_No , String Bf_ledger1){
	   	WebElement ele2=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+BF_ledger1_No+"')]/following-sibling::a"));
	   	String led_text = ele2.getText().trim();
	   	System.out.println(led_text);
	   	//String[] ledgersplit = expected_entry.get(i).split("-");
	   	String expectedledger = Bf_ledger1.trim();
	   	Assert.assertEquals(led_text.replaceAll("-", " "), expectedledger.replaceAll("-"," "));
	   	Reporter.log("Ledger code verified: "+led_text);
	   	
	   	WebElement ele3=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+ledger.get(4)+"')]/following-sibling::a"));
	   	String led_text1 = ele3.getText().trim();
	   	System.out.println(led_text1);
	   	String[] ledgersplit = expected_entry.get(4).split("-");
	   	String expectedledger1 = ledgersplit[1].trim();
	   	Assert.assertEquals(led_text1.replaceAll("-", " "), expectedledger1.replaceAll("-"," "));
	   	Reporter.log("Ledger code verified: "+led_text1);
	   	
	   	double amount2 = 0.00;
	   	for (int i = 0; i < amt.size()-1; i++) {
	   		double amt11 = Double.parseDouble(amt.get(i));
	   		amount2=amount2+amt11;
	   		
			}
	   	
	   	WebElement amount=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+BF_ledger1_No+"')]/parent::td/following-sibling::td/a/span"));
	   	String ActAmt = amount.getText();
	   	//String ExpAmt = amt.get(4)+".00";
	   	//System.out.println(xx);
	   	//System.out.println(yy);
	   	String[] z = amount.getText().split("", 3);
	   	if (z[0].equals("(")) {
	   		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,8), String.format("%.2f",amount2));
			} else {
				Assert.assertEquals(amount.getText().replaceAll(",", ""), String.format("%.2f",amount2));
			}
	   	Reporter.log("Amount enter verified: "+ActAmt);
	   	
	   	WebElement amount1=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+ledger.get(4)+"')]/parent::td/following-sibling::td/a/span"));
	   	String ActAmt1 = amount1.getText();
	   	String ExpAmt1 = amt.get(4)+".00";
	   	//System.out.println(xx);
	   	//System.out.println(yy);
	   	String[] z1 = amount1.getText().split("", 3);
	   	if (z1[0].equals("(")) {
	   		Assert.assertEquals(amount1.getText().replaceAll(",", "").substring(1,8), ExpAmt1);
			} else {
				Assert.assertEquals(amount1.getText().replaceAll(",", ""), ExpAmt1);
			}
	   	Reporter.log("Amount enter verified: "+ActAmt1);
	   	sl.ScrollToElement(m_Driver, ele2);
	   	
	   	 Reporter.log("Enteries are Verified on Balance Sheet Report page :", true);
		}
 
 public void verify_BS_BF_FixedAsset_245_249(String BF_ledger1_No , String Bf_ledger1){
	   	WebElement ele2=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+BF_ledger1_No+"')]/following-sibling::a"));
	   	String led_text = ele2.getText().trim();
	   	System.out.println(led_text);
	   	//String[] ledgersplit = expected_entry.get(i).split("-");
	   	String expectedledger = Bf_ledger1.trim();
	   	Assert.assertEquals(led_text.replaceAll("-", " "), expectedledger.replaceAll("-"," "));
	   	Reporter.log("Ledger code verified: "+led_text);
	   	
	   	WebElement ele3=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+ledger.get(4)+"')]/following-sibling::a"));
	   	String led_text1 = ele3.getText().trim();
	   	System.out.println(led_text1);
	   	String[] ledgersplit = expected_entry.get(4).split("-");
	   	String expectedledger1 = ledgersplit[1].trim();
	   	Assert.assertEquals(led_text1.replaceAll("-", " "), expectedledger1.replaceAll("-"," "));
	   	Reporter.log("Ledger code verified: "+led_text1);
	   	
	   	double amount2 = 0.00;
	   	for (int i = 0; i < amt.size()-1; i++) {
	   		double amt11 = Double.parseDouble(amt.get(i));
	   		amount2=amount2+amt11;
	   		
			}
	   	
	   	WebElement amount=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+BF_ledger1_No+"')]/parent::td/following-sibling::td/a/span"));
	   	String ActAmt = amount.getText();
	   	//String ExpAmt = amt.get(4)+".00";
	   	//System.out.println(xx);
	   	//System.out.println(yy);
	   	String[] z = amount.getText().split("", 3);
	   	if (z[0].equals("(")) {
	   		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,8), String.format("%.2f",amount2));
			} else {
				Assert.assertEquals(amount.getText().replaceAll(",", ""), String.format("%.2f",amount2));
			}
	   	Reporter.log("Amount enter verified: "+ActAmt);
	   	
	   	WebElement amount1=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+ledger.get(4)+"')]/parent::td/following-sibling::td/a/span"));
	   	String ActAmt1 = amount1.getText();
	   	String ExpAmt1 = amt.get(4)+".00";
	   	//System.out.println(xx);
	   	//System.out.println(yy);
	   	String[] z1 = amount1.getText().split("", 3);
	   	if (z1[0].equals("(")) {
	   		Assert.assertEquals(amount1.getText().replaceAll(",", "").substring(1,8), ExpAmt1);
			} else {
				Assert.assertEquals(amount1.getText().replaceAll(",", ""), ExpAmt1);
			}
	   	Reporter.log("Amount enter verified: "+ActAmt1);
	   	sl.ScrollToElement(m_Driver, ele2);
	   	
	   	 Reporter.log("Enteries are Verified on Balance Sheet Report page :", true);
		}
 
 public void verify_BS_BF_FixedAsset_250_254(String BF_ledger1_No , String Bf_ledger1){
	   	WebElement ele2=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+BF_ledger1_No+"')]/following-sibling::a"));
	   	String led_text = ele2.getText().trim();
	   	System.out.println(led_text);
	   	//String[] ledgersplit = expected_entry.get(i).split("-");
	   	String expectedledger = Bf_ledger1.trim();
	   	Assert.assertEquals(led_text.replaceAll("-", " "), expectedledger.replaceAll("-"," "));
	   	Reporter.log("Ledger code verified: "+led_text);
	   	
	   	WebElement ele3=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+ledger.get(4)+"')]/following-sibling::a"));
	   	String led_text1 = ele3.getText().trim();
	   	System.out.println(led_text1);
	   	String[] ledgersplit = expected_entry.get(4).split("-");
	   	String expectedledger1 = ledgersplit[1].trim();
	   	Assert.assertEquals(led_text1.replaceAll("-", " "), expectedledger1.replaceAll("-"," "));
	   	Reporter.log("Ledger code verified: "+led_text1);
	   	
	   	double amount2 = 0.00;
	   	for (int i = 0; i < amt.size()-1; i++) {
	   		double amt11 = Double.parseDouble(amt.get(i));
	   		amount2=amount2+amt11;
	   		
			}
	   	
	   	WebElement amount=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+BF_ledger1_No+"')]/parent::td/following-sibling::td/a/span"));
	   	String ActAmt = amount.getText();
	   	//String ExpAmt = amt.get(4)+".00";
	   	//System.out.println(xx);
	   	//System.out.println(yy);
	   	String[] z = amount.getText().split("", 3);
	   	if (z[0].equals("(")) {
	   		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,8), String.format("%.2f",amount2));
			} else {
				Assert.assertEquals(amount.getText().replaceAll(",", ""), String.format("%.2f",amount2));
			}
	   	Reporter.log("Amount enter verified: "+ActAmt);
	   	
	   	WebElement amount1=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+ledger.get(4)+"')]/parent::td/following-sibling::td/a/span"));
	   	String ActAmt1 = amount1.getText();
	   	String ExpAmt1 = amt.get(4)+".00";
	   	//System.out.println(xx);
	   	//System.out.println(yy);
	   	String[] z1 = amount1.getText().split("", 3);
	   	if (z1[0].equals("(")) {
	   		Assert.assertEquals(amount1.getText().replaceAll(",", "").substring(1,8), ExpAmt1);
			} else {
				Assert.assertEquals(amount1.getText().replaceAll(",", ""), ExpAmt1);
			}
	   	Reporter.log("Amount enter verified: "+ActAmt1);
	   	sl.ScrollToElement(m_Driver, ele2);
	   	
	   	 Reporter.log("Enteries are Verified on Balance Sheet Report page :", true);
		}
 
 public void verify_BS_BF_FixedAsset_255_259(String BF_ledger1_No , String Bf_ledger1){
	   	WebElement ele2=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+BF_ledger1_No+"')]/following-sibling::a"));
	   	String led_text = ele2.getText().trim();
	   	System.out.println(led_text);
	   	//String[] ledgersplit = expected_entry.get(i).split("-");
	   	String expectedledger = Bf_ledger1.trim();
	   	Assert.assertEquals(led_text.replaceAll("-", " "), expectedledger.replaceAll("-"," "));
	   	Reporter.log("Ledger code verified: "+led_text);
	   	
	   	WebElement ele3=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+ledger.get(4)+"')]/following-sibling::a"));
	   	String led_text1 = ele3.getText().trim();
	   	System.out.println(led_text1);
	   	String[] ledgersplit = expected_entry.get(4).split("-");
	   	String expectedledger1 = ledgersplit[1].trim();
	   	Assert.assertEquals(led_text1.replaceAll("-", " "), expectedledger1.replaceAll("-"," "));
	   	Reporter.log("Ledger code verified: "+led_text1);
	   	
	   	double amount2 = 0.00;
	   	for (int i = 0; i < amt.size()-1; i++) {
	   		double amt11 = Double.parseDouble(amt.get(i));
	   		amount2=amount2+amt11;
	   		
			}
	   	
	   	WebElement amount=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+BF_ledger1_No+"')]/parent::td/following-sibling::td/a/span"));
	   	String ActAmt = amount.getText();
	   	//String ExpAmt = amt.get(4)+".00";
	   	//System.out.println(xx);
	   	//System.out.println(yy);
	   	String[] z = amount.getText().split("", 3);
	   	if (z[0].equals("(")) {
	   		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,8), String.format("%.2f",amount2));
			} else {
				Assert.assertEquals(amount.getText().replaceAll(",", ""), String.format("%.2f",amount2));
			}
	   	Reporter.log("Amount enter verified: "+ActAmt);
	   	
	   	WebElement amount1=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+ledger.get(4)+"')]/parent::td/following-sibling::td/a/span"));
	   	String ActAmt1 = amount1.getText();
	   	String ExpAmt1 = amt.get(4)+".00";
	   	//System.out.println(xx);
	   	//System.out.println(yy);
	   	String[] z1 = amount1.getText().split("", 3);
	   	if (z1[0].equals("(")) {
	   		Assert.assertEquals(amount1.getText().replaceAll(",", "").substring(1,8), ExpAmt1);
			} else {
				Assert.assertEquals(amount1.getText().replaceAll(",", ""), ExpAmt1);
			}
	   	Reporter.log("Amount enter verified: "+ActAmt1);
	   	sl.ScrollToElement(m_Driver, ele2);
	   	
	   	 Reporter.log("Enteries are Verified on Balance Sheet Report page :", true);
		}
 
 public void verify_BS_BF_FixedAsset_260_264(String BF_ledger1_No , String Bf_ledger1){
	   	WebElement ele2=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+BF_ledger1_No+"')]/following-sibling::a"));
	   	String led_text = ele2.getText().trim();
	   	System.out.println(led_text);
	   	//String[] ledgersplit = expected_entry.get(i).split("-");
	   	String expectedledger = Bf_ledger1.trim();
	   	Assert.assertEquals(led_text.replaceAll("-", " "), expectedledger.replaceAll("-"," "));
	   	Reporter.log("Ledger code verified: "+led_text);
	   	
	   	WebElement ele3=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+ledger.get(4)+"')]/following-sibling::a"));
	   	String led_text1 = ele3.getText().trim();
	   	System.out.println(led_text1);
	   	String[] ledgersplit = expected_entry.get(4).split("-");
	   	String expectedledger1 = ledgersplit[1].trim();
	   	Assert.assertEquals(led_text1.replaceAll("-", " "), expectedledger1.replaceAll("-"," "));
	   	Reporter.log("Ledger code verified: "+led_text1);
	   	
	   	double amount2 = 0.00;
	   	for (int i = 0; i < amt.size()-1; i++) {
	   		double amt11 = Double.parseDouble(amt.get(i));
	   		amount2=amount2+amt11;
	   		
			}
	   	
	   	WebElement amount=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+BF_ledger1_No+"')]/parent::td/following-sibling::td/a/span"));
	   	String ActAmt = amount.getText();
	   	//String ExpAmt = amt.get(4)+".00";
	   	//System.out.println(xx);
	   	//System.out.println(yy);
	   	String[] z = amount.getText().split("", 3);
	   	if (z[0].equals("(")) {
	   		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,8), String.format("%.2f",amount2));
			} else {
				Assert.assertEquals(amount.getText().replaceAll(",", ""), String.format("%.2f",amount2));
			}
	   	Reporter.log("Amount enter verified: "+ActAmt);
	   	
	   	WebElement amount1=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+ledger.get(4)+"')]/parent::td/following-sibling::td/a/span"));
	   	String ActAmt1 = amount1.getText();
	   	String ExpAmt1 = amt.get(4)+".00";
	   	//System.out.println(xx);
	   	//System.out.println(yy);
	   	String[] z1 = amount1.getText().split("", 3);
	   	if (z1[0].equals("(")) {
	   		Assert.assertEquals(amount1.getText().replaceAll(",", "").substring(1,8), ExpAmt1);
			} else {
				Assert.assertEquals(amount1.getText().replaceAll(",", ""), ExpAmt1);
			}
	   	Reporter.log("Amount enter verified: "+ActAmt1);
	   	sl.ScrollToElement(m_Driver, ele2);
	   	
	   	 Reporter.log("Enteries are Verified on Balance Sheet Report page :", true);
		}
 
 public void verify_BS_BF_FixedAsset_265_269(String BF_ledger1_No , String Bf_ledger1){
	   	WebElement ele2=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+BF_ledger1_No+"')]/following-sibling::a"));
	   	String led_text = ele2.getText().trim();
	   	System.out.println(led_text);
	   	//String[] ledgersplit = expected_entry.get(i).split("-");
	   	String expectedledger = Bf_ledger1.trim();
	   	Assert.assertEquals(led_text.replaceAll("-", " "), expectedledger.replaceAll("-"," "));
	   	Reporter.log("Ledger code verified: "+led_text);
	   	
	   	WebElement ele3=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+ledger.get(4)+"')]/following-sibling::a"));
	   	String led_text1 = ele3.getText().trim();
	   	System.out.println(led_text1);
	   	String[] ledgersplit = expected_entry.get(4).split("-");
	   	String expectedledger1 = ledgersplit[1].trim();
	   	Assert.assertEquals(led_text1.replaceAll("-", " "), expectedledger1.replaceAll("-"," "));
	   	Reporter.log("Ledger code verified: "+led_text1);
	   	
	   	double amount2 = 0.00;
	   	for (int i = 0; i < amt.size()-1; i++) {
	   		double amt11 = Double.parseDouble(amt.get(i));
	   		amount2=amount2+amt11;
	   		
			}
	   	
	   	WebElement amount=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+BF_ledger1_No+"')]/parent::td/following-sibling::td/a/span"));
	   	String ActAmt = amount.getText();
	   	//String ExpAmt = amt.get(4)+".00";
	   	//System.out.println(xx);
	   	//System.out.println(yy);
	   	String[] z = amount.getText().split("", 3);
	   	if (z[0].equals("(")) {
	   		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,8), String.format("%.2f",amount2));
			} else {
				Assert.assertEquals(amount.getText().replaceAll(",", ""), String.format("%.2f",amount2));
			}
	   	Reporter.log("Amount enter verified: "+ActAmt);
	   	
	   	WebElement amount1=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+ledger.get(4)+"')]/parent::td/following-sibling::td/a/span"));
	   	String ActAmt1 = amount1.getText();
	   	String ExpAmt1 = amt.get(4)+".00";
	   	//System.out.println(xx);
	   	//System.out.println(yy);
	   	String[] z1 = amount1.getText().split("", 3);
	   	if (z1[0].equals("(")) {
	   		Assert.assertEquals(amount1.getText().replaceAll(",", "").substring(1,8), ExpAmt1);
			} else {
				Assert.assertEquals(amount1.getText().replaceAll(",", ""), ExpAmt1);
			}
	   	Reporter.log("Amount enter verified: "+ActAmt1);
	   	sl.ScrollToElement(m_Driver, ele2);
	   	
	   	 Reporter.log("Enteries are Verified on Balance Sheet Report page :", true);
		}
 
 public void verify_BS_BF_FixedAsset_270_274(String BF_ledger1_No , String Bf_ledger1){
	   	WebElement ele2=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+BF_ledger1_No+"')]/following-sibling::a"));
	   	String led_text = ele2.getText().trim();
	   	System.out.println(led_text);
	   	//String[] ledgersplit = expected_entry.get(i).split("-");
	   	String expectedledger = Bf_ledger1.trim();
	   	Assert.assertEquals(led_text.replaceAll("-", " "), expectedledger.replaceAll("-"," "));
	   	Reporter.log("Ledger code verified: "+led_text);
	   	
	   	WebElement ele3=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+ledger.get(4)+"')]/following-sibling::a"));
	   	String led_text1 = ele3.getText().trim();
	   	System.out.println(led_text1);
	   	String[] ledgersplit = expected_entry.get(4).split("-");
	   	String expectedledger1 = ledgersplit[1].trim();
	   	Assert.assertEquals(led_text1.replaceAll("-", " "), expectedledger1.replaceAll("-"," "));
	   	Reporter.log("Ledger code verified: "+led_text1);
	   	
	   	double amount2 = 0.00;
	   	for (int i = 0; i < amt.size()-1; i++) {
	   		double amt11 = Double.parseDouble(amt.get(i));
	   		amount2=amount2+amt11;
	   		
			}
	   	
	   	WebElement amount=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+BF_ledger1_No+"')]/parent::td/following-sibling::td/a/span"));
	   	String ActAmt = amount.getText();
	   	//String ExpAmt = amt.get(4)+".00";
	   	//System.out.println(xx);
	   	//System.out.println(yy);
	   	String[] z = amount.getText().split("", 3);
	   	if (z[0].equals("(")) {
	   		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,8), String.format("%.2f",amount2));
			} else {
				Assert.assertEquals(amount.getText().replaceAll(",", ""), String.format("%.2f",amount2));
			}
	   	Reporter.log("Amount enter verified: "+ActAmt);
	   	
	   	WebElement amount1=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+ledger.get(4)+"')]/parent::td/following-sibling::td/a/span"));
	   	String ActAmt1 = amount1.getText();
	   	String ExpAmt1 = amt.get(4)+".00";
	   	//System.out.println(xx);
	   	//System.out.println(yy);
	   	String[] z1 = amount1.getText().split("", 3);
	   	if (z1[0].equals("(")) {
	   		Assert.assertEquals(amount1.getText().replaceAll(",", "").substring(1,8), ExpAmt1);
			} else {
				Assert.assertEquals(amount1.getText().replaceAll(",", ""), ExpAmt1);
			}
	   	Reporter.log("Amount enter verified: "+ActAmt1);
	   	sl.ScrollToElement(m_Driver, ele2);
	   	
	   	 Reporter.log("Enteries are Verified on Balance Sheet Report page :", true);
		}
 
 public void verify_BS_BF_FixedAsset_275_279(String BF_ledger1_No , String Bf_ledger1){
	   	WebElement ele2=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+BF_ledger1_No+"')]/following-sibling::a"));
	   	String led_text = ele2.getText().trim();
	   	System.out.println(led_text);
	   	//String[] ledgersplit = expected_entry.get(i).split("-");
	   	String expectedledger = Bf_ledger1.trim();
	   	Assert.assertEquals(led_text.replaceAll("-", " "), expectedledger.replaceAll("-"," "));
	   	Reporter.log("Ledger code verified: "+led_text);
	   	
	   	WebElement ele3=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+ledger.get(4)+"')]/following-sibling::a"));
	   	String led_text1 = ele3.getText().trim();
	   	System.out.println(led_text1);
	   	String[] ledgersplit = expected_entry.get(4).split("-");
	   	String expectedledger1 = ledgersplit[1].trim();
	   	Assert.assertEquals(led_text1.replaceAll("-", " "), expectedledger1.replaceAll("-"," "));
	   	Reporter.log("Ledger code verified: "+led_text1);
	   	
	   	double amount2 = 0.00;
	   	for (int i = 0; i < amt.size()-1; i++) {
	   		double amt11 = Double.parseDouble(amt.get(i));
	   		amount2=amount2+amt11;
	   		
			}
	   	
	   	WebElement amount=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+BF_ledger1_No+"')]/parent::td/following-sibling::td/a/span"));
	   	String ActAmt = amount.getText();
	   	//String ExpAmt = amt.get(4)+".00";
	   	//System.out.println(xx);
	   	//System.out.println(yy);
	   	String[] z = amount.getText().split("", 3);
	   	if (z[0].equals("(")) {
	   		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,8), String.format("%.2f",amount2));
			} else {
				Assert.assertEquals(amount.getText().replaceAll(",", ""), String.format("%.2f",amount2));
			}
	   	Reporter.log("Amount enter verified: "+ActAmt);
	   	
	   	WebElement amount1=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+ledger.get(4)+"')]/parent::td/following-sibling::td/a/span"));
	   	String ActAmt1 = amount1.getText();
	   	String ExpAmt1 = amt.get(4)+".00";
	   	//System.out.println(xx);
	   	//System.out.println(yy);
	   	String[] z1 = amount1.getText().split("", 3);
	   	if (z1[0].equals("(")) {
	   		Assert.assertEquals(amount1.getText().replaceAll(",", "").substring(1,8), ExpAmt1);
			} else {
				Assert.assertEquals(amount1.getText().replaceAll(",", ""), ExpAmt1);
			}
	   	Reporter.log("Amount enter verified: "+ActAmt1);
	   	sl.ScrollToElement(m_Driver, ele2);
	   	
	   	 Reporter.log("Enteries are Verified on Balance Sheet Report page :", true);
		}
 
 public void verify_BS_BF_FixedAsset_280_284(String BF_ledger1_No , String Bf_ledger1){
	   	WebElement ele2=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+BF_ledger1_No+"')]/following-sibling::a"));
	   	String led_text = ele2.getText().trim();
	   	System.out.println(led_text);
	   	//String[] ledgersplit = expected_entry.get(i).split("-");
	   	String expectedledger = Bf_ledger1.trim();
	   	Assert.assertEquals(led_text.replaceAll("-", " "), expectedledger.replaceAll("-"," "));
	   	Reporter.log("Ledger code verified: "+led_text);
	   	
	   	WebElement ele3=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+ledger.get(4)+"')]/following-sibling::a"));
	   	String led_text1 = ele3.getText().trim();
	   	System.out.println(led_text1);
	   	String[] ledgersplit = expected_entry.get(4).split("-");
	   	String expectedledger1 = ledgersplit[1].trim();
	   	Assert.assertEquals(led_text1.replaceAll("-", " "), expectedledger1.replaceAll("-"," "));
	   	Reporter.log("Ledger code verified: "+led_text1);
	   	
	   	double amount2 = 0.00;
	   	for (int i = 0; i < amt.size()-1; i++) {
	   		double amt11 = Double.parseDouble(amt.get(i));
	   		amount2=amount2+amt11;
	   		
			}
	   	
	   	WebElement amount=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+BF_ledger1_No+"')]/parent::td/following-sibling::td/a/span"));
	   	String ActAmt = amount.getText();
	   	//String ExpAmt = amt.get(4)+".00";
	   	//System.out.println(xx);
	   	//System.out.println(yy);
	   	String[] z = amount.getText().split("", 3);
	   	if (z[0].equals("(")) {
	   		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,8), String.format("%.2f",amount2));
			} else {
				Assert.assertEquals(amount.getText().replaceAll(",", ""), String.format("%.2f",amount2));
			}
	   	Reporter.log("Amount enter verified: "+ActAmt);
	   	
	   	WebElement amount1=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+ledger.get(4)+"')]/parent::td/following-sibling::td/a/span"));
	   	String ActAmt1 = amount1.getText();
	   	String ExpAmt1 = amt.get(4)+".00";
	   	//System.out.println(xx);
	   	//System.out.println(yy);
	   	String[] z1 = amount1.getText().split("", 3);
	   	if (z1[0].equals("(")) {
	   		Assert.assertEquals(amount1.getText().replaceAll(",", "").substring(1,8), ExpAmt1);
			} else {
				Assert.assertEquals(amount1.getText().replaceAll(",", ""), ExpAmt1);
			}
	   	Reporter.log("Amount enter verified: "+ActAmt1);
	   	sl.ScrollToElement(m_Driver, ele2);
	   	
	   	 Reporter.log("Enteries are Verified on Balance Sheet Report page :", true);
		}
 
 public void verify_BS_BF_FixedAsset_285_289(String BF_ledger1_No , String Bf_ledger1){
	   	WebElement ele2=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+BF_ledger1_No+"')]/following-sibling::a"));
	   	String led_text = ele2.getText().trim();
	   	System.out.println(led_text);
	   	//String[] ledgersplit = expected_entry.get(i).split("-");
	   	String expectedledger = Bf_ledger1.trim();
	   	Assert.assertEquals(led_text.replaceAll("-", " "), expectedledger.replaceAll("-"," "));
	   	Reporter.log("Ledger code verified: "+led_text);
	   	
	   	WebElement ele3=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+ledger.get(4)+"')]/following-sibling::a"));
	   	String led_text1 = ele3.getText().trim();
	   	System.out.println(led_text1);
	   	String[] ledgersplit = expected_entry.get(4).split("-");
	   	String expectedledger1 = ledgersplit[1].trim();
	   	Assert.assertEquals(led_text1.replaceAll("-", " "), expectedledger1.replaceAll("-"," "));
	   	Reporter.log("Ledger code verified: "+led_text1);
	   	
	   	double amount2 = 0.00;
	   	for (int i = 0; i < amt.size()-1; i++) {
	   		double amt11 = Double.parseDouble(amt.get(i));
	   		amount2=amount2+amt11;
	   		
			}
	   	
	   	WebElement amount=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+BF_ledger1_No+"')]/parent::td/following-sibling::td/a/span"));
	   	String ActAmt = amount.getText();
	   	//String ExpAmt = amt.get(4)+".00";
	   	//System.out.println(xx);
	   	//System.out.println(yy);
	   	String[] z = amount.getText().split("", 3);
	   	if (z[0].equals("(")) {
	   		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,8), String.format("%.2f",amount2));
			} else {
				Assert.assertEquals(amount.getText().replaceAll(",", ""), String.format("%.2f",amount2));
			}
	   	Reporter.log("Amount enter verified: "+ActAmt);
	   	
	   	WebElement amount1=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+ledger.get(4)+"')]/parent::td/following-sibling::td/a/span"));
	   	String ActAmt1 = amount1.getText();
	   	String ExpAmt1 = amt.get(4)+".00";
	   	//System.out.println(xx);
	   	//System.out.println(yy);
	   	String[] z1 = amount1.getText().split("", 3);
	   	if (z1[0].equals("(")) {
	   		Assert.assertEquals(amount1.getText().replaceAll(",", "").substring(1,8), ExpAmt1);
			} else {
				Assert.assertEquals(amount1.getText().replaceAll(",", ""), ExpAmt1);
			}
	   	Reporter.log("Amount enter verified: "+ActAmt1);
	   	sl.ScrollToElement(m_Driver, ele2);
	   	
	   	 Reporter.log("Enteries are Verified on Balance Sheet Report page :", true);
		}
 
 public void verify_BS_BF_TradeDebtor_1070(){
		List<WebElement> elements = m_Driver.findElements(By.xpath("//tbody/tr/td[2]/span[contains(text(),'')]/following-sibling::a"));
	    int size = elements.size();
	    System.out.println(size);
	    for (int i = 0; i <size-2; i++) {
	    	WebElement ele2=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+ledger.get(i)+"')]/following-sibling::a"));
	    	String led_text = ele2.getText().trim();
	    	System.out.println(led_text);
	    	String[] ledgersplit = expected_entry.get(i).split("-");
	    	String expectedledger = ledgersplit[1].trim();
	    	Assert.assertEquals(ele2.getText().replaceAll("-", " "), expectedledger.replaceAll("-"," "));
	    	Reporter.log("Ledger code verified: "+led_text);
	    	
	    	WebElement amount=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+ledger.get(i)+"')]/parent::td/following-sibling::td/a/span"));
	    	String ActAmt = amount.getText();
	    	String ExpAmt = amt.get(i)+".00";
	    	//System.out.println(xx);
	    	//System.out.println(yy);
	    	String[] z = amount.getText().split("", 3);
	    	if (z[0].equals("(")) {
	    		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,8), ExpAmt);
			} else {
				Assert.assertEquals(amount.getText().replaceAll(",", ""), ExpAmt);
			}
	    	Reporter.log("Amount enter verified: "+ActAmt);
	    	sl.ScrollToElement(m_Driver, ele2);
		}
	    Reporter.log("Enteries are Verified on Balance Sheet Report page after closing accounting period:", true);
	}
 public void verify_BS_BF_ProfitLoss_3007_10(){
		List<WebElement> elements = m_Driver.findElements(By.xpath("//tbody/tr/td[2]/span[contains(text(),'')]/following-sibling::a"));
	    int size = elements.size();
	    System.out.println(size);
	    for (int i = 0; i <size-2; i++) {
	    	WebElement ele2=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+ledger.get(i)+"')]/following-sibling::a"));
	    	String led_text = ele2.getText().trim();
	    	System.out.println(led_text);
	    	String[] ledgersplit = expected_entry.get(i).split("-");
	    	String expectedledger = ledgersplit[1].trim();
	    	Assert.assertEquals(ele2.getText().replaceAll("-", " "), expectedledger.replaceAll("-"," "));
	    	Reporter.log("Ledger code verified: "+led_text);
	    	
	    	WebElement amount=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+ledger.get(i)+"')]/parent::td/following-sibling::td/a/span"));
	    	String ActAmt = amount.getText();
	    	String ExpAmt = amt.get(i)+".00";
	    	//System.out.println(xx);
	    	//System.out.println(yy);
	    	String[] z = amount.getText().split("", 3);
	    	if (z[0].equals("(")) {
	    		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,8), ExpAmt);
			} else {
				Assert.assertEquals(amount.getText().replaceAll(",", ""), ExpAmt);
			}
	    	Reporter.log("Amount enter verified: "+ActAmt);
	    	sl.ScrollToElement(m_Driver, ele2);
		}
	    Reporter.log("Enteries are Verified on Balance Sheet Report page :", true);
	}
 
 public void verify_BS_BF_Debtor_1000_1310(){
		List<WebElement> elements = m_Driver.findElements(By.xpath("//tbody/tr/td[2]/span[contains(text(),'')]/following-sibling::a"));
	    int size = elements.size();
	    System.out.println(size);
	    for (int i = 0; i <size-2; i++) {
	    	WebElement ele2=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+ledger.get(i)+"')]/following-sibling::a"));
	    	String led_text = ele2.getText().trim();
	    	System.out.println(led_text);
	    	String[] ledgersplit = expected_entry.get(i).split("-");
	    	String expectedledger = ledgersplit[1].trim();
	    	Assert.assertEquals(ele2.getText().replaceAll("-", " "), expectedledger.replaceAll("-"," "));
	    	Reporter.log("Ledger code verified: "+led_text);
	    	
	    	WebElement amount=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+ledger.get(i)+"')]/parent::td/following-sibling::td/a/span"));
	    	String ActAmt = amount.getText();
	    	String ExpAmt = amt.get(i)+".00";
	    	//System.out.println(xx);
	    	//System.out.println(yy);
	    	String[] z = amount.getText().split("", 3);
	    	if (z[0].equals("(")) {
	    		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,8), ExpAmt);
			} else {
				Assert.assertEquals(amount.getText().replaceAll(",", ""), ExpAmt);
			}
	    	Reporter.log("Amount enter verified: "+ActAmt);
	    	sl.ScrollToElement(m_Driver, ele2);
		}
	    Reporter.log("Enteries are Verified on Balance Sheet Report page :", true);
	}
 
 public void verify_BS_BF_FixedAsset_600_602(String BF_ledger1_No , String Bf_ledger1){
	   	WebElement ele2=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+BF_ledger1_No+"')]/following-sibling::a"));
	   	String led_text = ele2.getText().trim();
	   	System.out.println(led_text);
	   	//String[] ledgersplit = expected_entry.get(i).split("-");
	   	String expectedledger = Bf_ledger1.trim();
	   	Assert.assertEquals(led_text.replaceAll("-", " "), expectedledger.replaceAll("-"," "));
	   	Reporter.log("Ledger code verified: "+led_text);
	   	
	   	WebElement ele3=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+ledger.get(2)+"')]/following-sibling::a"));
	   	String led_text1 = ele3.getText().trim();
	   	System.out.println(led_text1);
	   	String[] ledgersplit = expected_entry.get(2).split("-");
	   	String expectedledger1 = ledgersplit[1].trim();
	   	Assert.assertEquals(led_text1.replaceAll("-", " "), expectedledger1.replaceAll("-"," "));
	   	Reporter.log("Ledger code verified: "+led_text1);
	   	
	   	double amount2 = 0.00;
	   	for (int i = 0; i < amt.size()-1; i++) {
	   		double amt11 = Double.parseDouble(amt.get(i));
	   		amount2=amount2+amt11;
	   		
			}
	   	
	   	WebElement amount=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+BF_ledger1_No+"')]/parent::td/following-sibling::td/a/span"));
	   	String ActAmt = amount.getText();
	   	//String ExpAmt = amt.get(4)+".00";
	   	//System.out.println(xx);
	   	//System.out.println(yy);
	   	String[] z = amount.getText().split("", 3);
	   	if (z[0].equals("(")) {
	   		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,8), String.format("%.2f",amount2));
			} else {
				Assert.assertEquals(amount.getText().replaceAll(",", ""), String.format("%.2f",amount2));
			}
	   	Reporter.log("Amount enter verified: "+ActAmt);
	   	
	   	WebElement amount1=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+ledger.get(2)+"')]/parent::td/following-sibling::td/a/span"));
	   	String ActAmt1 = amount1.getText();
	   	String ExpAmt1 = amt.get(2)+".00";
	   	//System.out.println(xx);
	   	//System.out.println(yy);
	   	String[] z1 = amount1.getText().split("", 3);
	   	if (z1[0].equals("(")) {
	   		Assert.assertEquals(amount1.getText().replaceAll(",", "").substring(1,8), ExpAmt1);
			} else {
				Assert.assertEquals(amount1.getText().replaceAll(",", ""), ExpAmt1);
			}
	   	Reporter.log("Amount enter verified: "+ActAmt1);
	   	sl.ScrollToElement(m_Driver, ele2);
	   	
	   	 Reporter.log("Enteries are Verified on Balance Sheet Report page :", true);
		}
 public void verify_BS_BF_PaymentType_1071_1073(){
		List<WebElement> elements = m_Driver.findElements(By.xpath("//tbody/tr/td[2]/span[contains(text(),'')]/following-sibling::a"));
	    int size = elements.size();
	    System.out.println(size);
	    for (int i = 0; i <size-2; i++) {
	    	WebElement ele2=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+ledger.get(i)+"')]/following-sibling::a"));
	    	String led_text = ele2.getText().trim();
	    	System.out.println(led_text);
	    	String[] ledgersplit = expected_entry.get(i).split("-");
	    	String expectedledger = ledgersplit[1].trim();
	    	Assert.assertEquals(ele2.getText().replaceAll("-", " "), expectedledger.replaceAll("-"," "));
	    	Reporter.log("Ledger code verified: "+led_text);
	    	
	    	WebElement amount=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+ledger.get(i)+"')]/parent::td/following-sibling::td/a/span"));
	    	String ActAmt = amount.getText();
	    	String ExpAmt = amt.get(i)+".00";
	    	//System.out.println(xx);
	    	//System.out.println(yy);
	    	String[] z = amount.getText().split("", 3);
	    	if (z[0].equals("(")) {
	    		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,8), ExpAmt);
			} else {
				Assert.assertEquals(amount.getText().replaceAll(",", ""), ExpAmt);
			}
	    	Reporter.log("Amount enter verified: "+ActAmt);
	    	sl.ScrollToElement(m_Driver, ele2);
		}
	    Reporter.log("Enteries are Verified on Balance Sheet Report page :", true);
	}
 
 public void verify_BS_BF_FixedAsset_605_609(String BF_ledger1_No , String Bf_ledger1){
	   	WebElement ele2=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+BF_ledger1_No+"')]/following-sibling::a"));
	   	String led_text = ele2.getText().trim();
	   	System.out.println(led_text);
	   	//String[] ledgersplit = expected_entry.get(i).split("-");
	   	String expectedledger = Bf_ledger1.trim();
	   	Assert.assertEquals(led_text.replaceAll("-", " "), expectedledger.replaceAll("-"," "));
	   	Reporter.log("Ledger code verified: "+led_text);
	   	
	   	WebElement ele3=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+ledger.get(3)+"')]/following-sibling::a"));
	   	String led_text1 = ele3.getText().trim();
	   	System.out.println(led_text1);
	   	String[] ledgersplit = expected_entry.get(3).split("-");
	   	String expectedledger1 = ledgersplit[1].trim();
	   	Assert.assertEquals(led_text1.replaceAll("-", " "), expectedledger1.replaceAll("-"," "));
	   	Reporter.log("Ledger code verified: "+led_text1);
	   	
	   	double amount2 = 0.00;
	   	for (int i = 0; i < amt.size()-1; i++) {
	   		double amt11 = Double.parseDouble(amt.get(i));
	   		amount2=amount2+amt11;
	   		
			}
	   	
	   	WebElement amount=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+BF_ledger1_No+"')]/parent::td/following-sibling::td/a/span"));
	   	String ActAmt = amount.getText();
	   	//String ExpAmt = amt.get(4)+".00";
	   	//System.out.println(xx);
	   	//System.out.println(yy);
	   	String[] z = amount.getText().split("", 3);
	   	if (z[0].equals("(")) {
	   		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,8), String.format("%.2f",amount2));
			} else {
				Assert.assertEquals(amount.getText().replaceAll(",", ""), String.format("%.2f",amount2));
			}
	   	Reporter.log("Amount enter verified: "+ActAmt);
	   	
	   	WebElement amount1=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+ledger.get(3)+"')]/parent::td/following-sibling::td/a/span"));
	   	String ActAmt1 = amount1.getText();
	   	String ExpAmt1 = amt.get(3)+".00";
	   	//System.out.println(xx);
	   	//System.out.println(yy);
	   	String[] z1 = amount1.getText().split("", 3);
	   	if (z1[0].equals("(")) {
	   		Assert.assertEquals(amount1.getText().replaceAll(",", "").substring(1,8), ExpAmt1);
			} else {
				Assert.assertEquals(amount1.getText().replaceAll(",", ""), ExpAmt1);
			}
	   	Reporter.log("Amount enter verified: "+ActAmt1);
	   	sl.ScrollToElement(m_Driver, ele2);
	   	
	   	 Reporter.log("Enteries are Verified on Balance Sheet Report page :", true);
		}
 
 public void verify_BS_BF_Director_1321() {
	 	
	 	List<WebElement> elements = m_Driver.findElements(By.xpath("//tbody/tr/td[2]/span[contains(text(),'')]/following-sibling::a"));
	     int size = elements.size();
	     for (int i = 0; i <size-3; i++) {
	     	if (i==0) {
	     		WebElement ele2 = m_Driver.findElement(By.xpath("(//tbody/tr/td[2]/span[contains(text(),'1321')]/following-sibling::a)[5]"));
	     		String led_text = ele2.getText();
	         	//System.out.println(led_text);
	         	String[] ledgersplit = expected_entry.get(i).split("-", 2);
		    	String expectedledger1 = ledgersplit[1].trim();
	         	Assert.assertEquals(led_text.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
	         	Reporter.log("ledger code verified: "+led_text);
				} else {
					WebElement ele2 = m_Driver.findElement(By.xpath("(//tbody/tr/td[2]/span[contains(text(),'1321')]/following-sibling::a)["+i+"]"));
					String led_text = ele2.getText();
	         	//System.out.println(led_text);
	         	String[] ledgersplit = expected_entry.get(i).split("-", 2);
		    	String expectedledger = ledgersplit[1].trim();
	         	String expectedledger1 = expectedledger.replace("Default director -", "");
	         	Assert.assertEquals(led_text.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
	         	Reporter.log("ledger code verified: "+led_text);

				}
	     	
	     	
	     	if (i==0) {
	     		WebElement amount=m_Driver.findElement(By.xpath("(//tbody/tr/td/span[contains(text(),'1321')]/parent::td/following-sibling::td/a/span)[5]"));
		        	String Amount = amount.getText();
		        	String yy = amt.get(i)+".00";
		        	//System.out.println(Amount);
		        	//System.out.println(yy);
		        	String[] z = amount.getText().split("", 3);
		        	if (z[0].equals("(")) {
		        		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,9), yy);
		    		} else {
		    			Assert.assertEquals(amount.getText().replaceAll(",", ""), yy);
		    		}
		        	Reporter.log("Amount enter verified: "+amount.getText());
		        	sl.ScrollToElement(m_Driver, amount);	
					
				} else {
					WebElement amount = m_Driver.findElement(By.xpath("(//tbody/tr/td/span[contains(text(),'1321')]/parent::td/following-sibling::td/a/span)["+i+"]"));
					String xx = amount.getText();
		        	String yy = amt.get(i)+".00";
		        	//System.out.println(xx);
		        	//System.out.println(yy);
		        	String[] z = amount.getText().split("", 3);
		        	if (z[0].equals("(")) {
		        		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,9), yy);
		    		} else {
		    			Assert.assertEquals(amount.getText().replaceAll(",", ""), yy);
		    		}
		        	Reporter.log("Amount enter verified: "+amount.getText());
		        	sl.ScrollToElement(m_Driver, amount);	

				}
	     	
	 	}
	     Reporter.log("Enteries are Verified on TrialBalance Report page :", true);
	}
 
 public void verify_BS_BF_CreditorDueWithinYear_2000_2080(){
		List<WebElement> elements = m_Driver.findElements(By.xpath("//tbody/tr/td[2]/span[contains(text(),'')]/following-sibling::a"));
	    int size = elements.size();
	    System.out.println(size);
	    for (int i = 0; i <size-2; i++) {
	    	WebElement ele2=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+ledger.get(i)+"')]/following-sibling::a"));
	    	String led_text = ele2.getText().trim();
	    	System.out.println(led_text);
	    	String[] ledgersplit = expected_entry.get(i).split("-", 2);
	    	String expectedledger = ledgersplit[1].trim();
	    	Assert.assertEquals(ele2.getText().replaceAll("-", " "), expectedledger.replaceAll("-"," "));
	    	Reporter.log("Ledger code verified: "+led_text);
	    	
	    	WebElement amount=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+ledger.get(i)+"')]/parent::td/following-sibling::td/a/span"));
	    	String ActAmt = amount.getText();
	    	String ExpAmt = amt.get(i)+".00";
	    	String[] z = amount.getText().split("", 3);
	    	if (z[0].equals("(")) {
	    		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,8), ExpAmt);
			} else {
				Assert.assertEquals(amount.getText().replaceAll(",", ""), ExpAmt);
			}
	    	Reporter.log("Amount enter verified: "+ActAmt);
	    	sl.ScrollToElement(m_Driver, ele2);
		}
	    Reporter.log("Enteries are Verified on Balance Sheet Report page :", true);
	}
 public void verify_BS_BF_Debtor_1320_1420(){
		List<WebElement> elements = m_Driver.findElements(By.xpath("//tbody/tr/td[2]/span[contains(text(),'')]/following-sibling::a"));
	    int size = elements.size();
	    System.out.println(size);
	    for (int i = 0; i <size-2; i++) {
	    	WebElement ele2=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+ledger.get(i)+"')]/following-sibling::a"));
	    	String led_text = ele2.getText().trim();
	    	System.out.println(led_text);
	    	String[] ledgersplit = expected_entry.get(i).split("-", 2);
	    	String expectedledger = ledgersplit[1].trim();
	    	Assert.assertEquals(ele2.getText().replaceAll("-", " "), expectedledger.replaceAll("-"," "));
	    	Reporter.log("Ledger code verified: "+led_text);
	    	
	    	WebElement amount=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+ledger.get(i)+"')]/parent::td/following-sibling::td/a/span"));
	    	String ActAmt = amount.getText();
	    	String ExpAmt = amt.get(i)+".00";
	    	String[] z = amount.getText().split("", 3);
	    	if (z[0].equals("(")) {
	    		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,8), ExpAmt);
			} else {
				Assert.assertEquals(amount.getText().replaceAll(",", ""), ExpAmt);
			}
	    	Reporter.log("Amount enter verified: "+ActAmt);
	    	sl.ScrollToElement(m_Driver, ele2);
		}
	    Reporter.log("Enteries are Verified on Balance Sheet Report page :", true);
	}
 public void verify_BS_BF_TradeCreditor_2060(){
		List<WebElement> elements = m_Driver.findElements(By.xpath("//tbody/tr/td[2]/span[contains(text(),'')]/following-sibling::a"));
	    int size = elements.size();
	    System.out.println(size);
	    for (int i = 0; i <size-3; i++) {
	    	WebElement ele2=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+ledger.get(i)+"')]/following-sibling::a"));
	    	String led_text = ele2.getText().trim();
	    	System.out.println(led_text);
	    	String[] ledgersplit = expected_entry.get(i).split("-");
	    	String expectedledger = ledgersplit[1].trim();
	    	Assert.assertEquals(ele2.getText().replaceAll("-", " "), expectedledger.replaceAll("-"," "));
	    	Reporter.log("Ledger code verified: "+led_text);
	    	
	    	WebElement amount=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+ledger.get(i)+"')]/parent::td/following-sibling::td/a/span"));
	    	String ActAmt = amount.getText();
	    	String ExpAmt = amt.get(i)+".00";
	    	//System.out.println(xx);
	    	//System.out.println(yy);
	    	String[] z = amount.getText().split("", 3);
	    	if (z[0].equals("(")) {
	    		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,8), ExpAmt);
			} else {
				Assert.assertEquals(amount.getText().replaceAll(",", ""), ExpAmt);
			}
	    	Reporter.log("Amount enter verified: "+ActAmt);
	    	sl.ScrollToElement(m_Driver, ele2);
		}
	    Reporter.log("Enteries are Verified on Balance Sheet Report page after closing accounting period:", true);
	}

 public void verify_BS_BF_Employee_1322(String ledNo){
	 	
	 	List<WebElement> elements = m_Driver.findElements(By.xpath("//tbody/tr/td[2]/span[contains(text(),'')]/following-sibling::a"));
	     int size = elements.size();
	     for (int i = 0; i <size-3; i++) {
	     	if (i==0) {
	     		WebElement ele2 = m_Driver.findElement(By.xpath("(//tbody/tr/td[2]/span[contains(text(),'"+ledNo+"')]/following-sibling::a)[4]"));
	     		String led_text = ele2.getText();
	         	//System.out.println(led_text);
	         	String[] ledgersplit = expected_entry.get(i).split("-", 2);
		    	String expectedledger1 = ledgersplit[1].trim();
	         	Assert.assertEquals(led_text.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
	         	Reporter.log("ledger code verified: "+led_text);
				} else if (i==4) {
					WebElement ele2 = m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'2080')]/following-sibling::a"));
		     		String led_text = ele2.getText();
		         	//System.out.println(led_text);
		         	String[] ledgersplit = expected_entry.get(i).split("-", 2);
			    	String expectedledger = ledgersplit[1].trim();
			    	String expectedledger1 = expectedledger.replace("Default employee -", "");
		         	Assert.assertEquals(led_text.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
		         	Reporter.log("ledger code verified: "+led_text);	
				} 
				else {
					WebElement ele2 = m_Driver.findElement(By.xpath("(//tbody/tr/td[2]/span[contains(text(),'"+ledNo+"')]/following-sibling::a)["+i+"]"));
					String led_text = ele2.getText();
	         	//System.out.println(led_text);
	         	String[] ledgersplit = expected_entry.get(i).split("-", 2);
		    	String expectedledger = ledgersplit[1].trim();
	         	String expectedledger1 = expectedledger.replace("Default employee -", "");
	         	Assert.assertEquals(led_text.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
	         	Reporter.log("ledger code verified: "+led_text);

				}
	     	
	     	
	     	if (i==0) {
	     		WebElement amount=m_Driver.findElement(By.xpath("(//tbody/tr/td/span[contains(text(),'"+ledNo+"')]/parent::td/following-sibling::td/a/span)[4]"));
		        	//String Amount = amount.getText();
		        	String yy = amt.get(i)+".00";
		        	//System.out.println(Amount);
		        	//System.out.println(yy);
		        	String[] z = amount.getText().split("", 3);
		        	if (z[0].equals("(")) {
		        		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,9), yy);
		    		} else {
		    			Assert.assertEquals(amount.getText().replaceAll(",", ""), yy);
		    		}
		        	Reporter.log("Amount enter verified: "+amount.getText());
		        	sl.ScrollToElement(m_Driver, amount);	
					
				} else if (i==4) {
					WebElement amount=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'2080')]/parent::td/following-sibling::td/a/span"));
		        	String Amount = amount.getText();
		        	String yy = amt.get(i)+".00";
		        	//System.out.println(Amount);
		        	//System.out.println(yy);
		        	String[] z = amount.getText().split("", 3);
		        	if (z[0].equals("(")) {
		        		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,9), yy);
		    		} else {
		    			Assert.assertEquals(amount.getText().replaceAll(",", ""), yy);
		    		}
		        	Reporter.log("Amount enter verified: "+amount.getText());
		        	sl.ScrollToElement(m_Driver, amount);	
				}
	     	
	     	else {
					WebElement amount = m_Driver.findElement(By.xpath("(//tbody/tr/td/span[contains(text(),'"+ledNo+"')]/parent::td/following-sibling::td/a/span)["+i+"]"));
					String xx = amount.getText();
		        	String yy = amt.get(i)+".00";
		        	//System.out.println(xx);
		        	//System.out.println(yy);
		        	String[] z = amount.getText().split("", 3);
		        	if (z[0].equals("(")) {
		        		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,9), yy);
		    		} else {
		    			Assert.assertEquals(amount.getText().replaceAll(",", ""), yy);
		    		}
		        	Reporter.log("Amount enter verified: "+amount.getText());
		        	sl.ScrollToElement(m_Driver, amount);	

				}
	     	
	 	}
	     Reporter.log("Enteries are Verified on TrialBalance Report page :", true);
	}
 
 public void verify_BS_BF_FixedAsset_630_632(String BF_ledger1_No , String Bf_ledger1){
	   	WebElement ele2=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+BF_ledger1_No+"')]/following-sibling::a"));
	   	String led_text = ele2.getText().trim();
	   	System.out.println(led_text);
	   	//String[] ledgersplit = expected_entry.get(i).split("-");
	   	String expectedledger = Bf_ledger1.trim();
	   	Assert.assertEquals(led_text.replaceAll("-", " "), expectedledger.replaceAll("-"," "));
	   	Reporter.log("Ledger code verified: "+led_text);
	   	
	   	WebElement ele3=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+ledger.get(2)+"')]/following-sibling::a"));
	   	String led_text1 = ele3.getText().trim();
	   	System.out.println(led_text1);
	   	String[] ledgersplit = expected_entry.get(2).split("-");
	   	String expectedledger1 = ledgersplit[1].trim();
	   	Assert.assertEquals(led_text1.replaceAll("-", " "), expectedledger1.replaceAll("-"," "));
	   	Reporter.log("Ledger code verified: "+led_text1);
	   	
	   	double amount2 = 0.00;
	   	for (int i = 0; i < amt.size()-1; i++) {
	   		double amt11 = Double.parseDouble(amt.get(i));
	   		amount2=amount2+amt11;
	   		
			}
	   	
	   	WebElement amount=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+BF_ledger1_No+"')]/parent::td/following-sibling::td/a/span"));
	   	String ActAmt = amount.getText();
	   	//String ExpAmt = amt.get(4)+".00";
	   	//System.out.println(xx);
	   	//System.out.println(yy);
	   	String[] z = amount.getText().split("", 3);
	   	if (z[0].equals("(")) {
	   		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,8), String.format("%.2f",amount2));
			} else {
				Assert.assertEquals(amount.getText().replaceAll(",", ""), String.format("%.2f",amount2));
			}
	   	Reporter.log("Amount enter verified: "+ActAmt);
	   	
	   	WebElement amount1=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+ledger.get(2)+"')]/parent::td/following-sibling::td/a/span"));
	   	String ActAmt1 = amount1.getText();
	   	String ExpAmt1 = amt.get(2)+".00";
	   	//System.out.println(xx);
	   	//System.out.println(yy);
	   	String[] z1 = amount1.getText().split("", 3);
	   	if (z1[0].equals("(")) {
	   		Assert.assertEquals(amount1.getText().replaceAll(",", "").substring(1,8), ExpAmt1);
			} else {
				Assert.assertEquals(amount1.getText().replaceAll(",", ""), ExpAmt1);
			}
	   	Reporter.log("Amount enter verified: "+ActAmt1);
	   	sl.ScrollToElement(m_Driver, ele2);
	   	
	   	 Reporter.log("Enteries are Verified on Balance Sheet Report page :", true);
		}
 
 public void verify_BS_BF_FixedAsset_635_639(String BF_ledger1_No , String Bf_ledger1){
	   	WebElement ele2=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+BF_ledger1_No+"')]/following-sibling::a"));
	   	String led_text = ele2.getText().trim();
	   	System.out.println(led_text);
	   	//String[] ledgersplit = expected_entry.get(i).split("-");
	   	String expectedledger = Bf_ledger1.trim();
	   	Assert.assertEquals(led_text.replaceAll("-", " "), expectedledger.replaceAll("-"," "));
	   	Reporter.log("Ledger code verified: "+led_text);
	   	
	   	WebElement ele3=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+ledger.get(3)+"')]/following-sibling::a"));
	   	String led_text1 = ele3.getText().trim();
	   	System.out.println(led_text1);
	   	String[] ledgersplit = expected_entry.get(3).split("-");
	   	String expectedledger1 = ledgersplit[1].trim();
	   	Assert.assertEquals(led_text1.replaceAll("-", " "), expectedledger1.replaceAll("-"," "));
	   	Reporter.log("Ledger code verified: "+led_text1);
	   	
	   	double amount2 = 0.00;
	   	for (int i = 0; i < amt.size()-1; i++) {
	   		double amt11 = Double.parseDouble(amt.get(i));
	   		amount2=amount2+amt11;
	   		
			}
	   	
	   	WebElement amount=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+BF_ledger1_No+"')]/parent::td/following-sibling::td/a/span"));
	   	String ActAmt = amount.getText();
	   	//String ExpAmt = amt.get(4)+".00";
	   	//System.out.println(xx);
	   	//System.out.println(yy);
	   	String[] z = amount.getText().split("", 3);
	   	if (z[0].equals("(")) {
	   		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,8), String.format("%.2f",amount2));
			} else {
				Assert.assertEquals(amount.getText().replaceAll(",", ""), String.format("%.2f",amount2));
			}
	   	Reporter.log("Amount enter verified: "+ActAmt);
	   	
	   	WebElement amount1=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+ledger.get(3)+"')]/parent::td/following-sibling::td/a/span"));
	   	String ActAmt1 = amount1.getText();
	   	String ExpAmt1 = amt.get(3)+".00";
	   	//System.out.println(xx);
	   	//System.out.println(yy);
	   	String[] z1 = amount1.getText().split("", 3);
	   	if (z1[0].equals("(")) {
	   		Assert.assertEquals(amount1.getText().replaceAll(",", "").substring(1,8), ExpAmt1);
			} else {
				Assert.assertEquals(amount1.getText().replaceAll(",", ""), ExpAmt1);
			}
	   	Reporter.log("Amount enter verified: "+ActAmt1);
	   	sl.ScrollToElement(m_Driver, ele2);
	   	
	   	 Reporter.log("Enteries are Verified on Balance Sheet Report page :", true);
		}
 
 public void verify_BS_BF_CreditorDueWithinYear_2080_2095(){
		List<WebElement> elements = m_Driver.findElements(By.xpath("//tbody/tr/td[2]/span[contains(text(),'')]/following-sibling::a"));
	    int size = elements.size();
	    System.out.println(size);
	    for (int i = 0; i <size-2; i++) {
	    	WebElement ele2=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+ledger.get(i)+"')]/following-sibling::a"));
	    	String led_text = ele2.getText().trim();
	    	System.out.println(led_text);
	    	String[] ledgersplit = expected_entry.get(i).split("-", 2);
	    	String expectedledger = ledgersplit[1].trim();
	    	Assert.assertEquals(ele2.getText().replaceAll("-", " "), expectedledger.replaceAll("-"," "));
	    	Reporter.log("Ledger code verified: "+led_text);
	    	
	    	WebElement amount=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+ledger.get(i)+"')]/parent::td/following-sibling::td/a/span"));
	    	String ActAmt = amount.getText();
	    	String ExpAmt = amt.get(i)+".00";
	    	String[] z = amount.getText().split("", 3);
	    	if (z[0].equals("(")) {
	    		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,8), ExpAmt);
			} else {
				Assert.assertEquals(amount.getText().replaceAll(",", ""), ExpAmt);
			}
	    	Reporter.log("Amount enter verified: "+ActAmt);
	    	sl.ScrollToElement(m_Driver, ele2);
		}
	    Reporter.log("Enteries are Verified on Balance Sheet Report page :", true);
	}
 
 public void verify_BS_Bf_Person_1323() {
	 	
	 	List<WebElement> elements = m_Driver.findElements(By.xpath("//tbody/tr/td[2]/span[contains(text(),'')]/following-sibling::a"));
	     int size = elements.size();
	     for (int i = 0; i <size-3; i++) {
	     	if (i==0) {
	     		WebElement ele2 = m_Driver.findElement(By.xpath("(//tbody/tr/td[2]/span[contains(text(),'1323')]/following-sibling::a)[5]"));
	     		String led_text = ele2.getText();
	         	//System.out.println(led_text);
	         	String[] ledgersplit = expected_entry.get(i).split("-", 2);
		    	String expectedledger1 = ledgersplit[1].trim();
	         	Assert.assertEquals(led_text.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
	         	Reporter.log("ledger code verified: "+led_text);
				} else {
					WebElement ele2 = m_Driver.findElement(By.xpath("(//tbody/tr/td[2]/span[contains(text(),'1323')]/following-sibling::a)["+i+"]"));
					String led_text = ele2.getText();
	         	//System.out.println(led_text);
	         	String[] ledgersplit = expected_entry.get(i).split("-", 2);
		    	String expectedledger = ledgersplit[1].trim();
	         	String expectedledger1 = expectedledger.replace("Ankit Rana -", "");
	         	Assert.assertEquals(led_text.trim().replaceAll("-", " "), expectedledger1.replaceAll("-"," ").trim());
	         	Reporter.log("ledger code verified: "+led_text);

				}
	     	
	     	
	     	if (i==0) {
	     		WebElement amount=m_Driver.findElement(By.xpath("(//tbody/tr/td/span[contains(text(),'1323')]/parent::td/following-sibling::td/a/span)[5]"));
		        	//String Amount = amount.getText();
		        	String yy = amt.get(i)+".00";
		        	//System.out.println(Amount);
		        	//System.out.println(yy);
		        	String[] z = amount.getText().split("", 3);
		        	if (z[0].equals("(")) {
		        		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,9), yy);
		    		} else {
		    			Assert.assertEquals(amount.getText().replaceAll(",", ""), yy);
		    		}
		        	Reporter.log("Amount enter verified: "+amount.getText());
		        	sl.ScrollToElement(m_Driver, amount);	
					
				} else {
					WebElement amount = m_Driver.findElement(By.xpath("(//tbody/tr/td/span[contains(text(),'1323')]/parent::td/following-sibling::td/a/span)["+i+"]"));
					String xx = amount.getText();
		        	String yy = amt.get(i)+".00";
		        	//System.out.println(xx);
		        	//System.out.println(yy);
		        	String[] z = amount.getText().split("", 3);
		        	if (z[0].equals("(")) {
		        		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,9), yy);
		    		} else {
		    			Assert.assertEquals(amount.getText().replaceAll(",", ""), yy);
		    		}
		        	Reporter.log("Amount enter verified: "+amount.getText());
		        	sl.ScrollToElement(m_Driver, amount);	

				}
	     	
	 	}
	     Reporter.log("Enteries are Verified on TrialBalance Report page :", true);
	}
 
 public void verify_BS_BF_Taxation_109091110102(){
		List<WebElement> elements = m_Driver.findElements(By.xpath("//tbody/tr/td[2]/span[contains(text(),'')]/following-sibling::a"));
	    int size = elements.size();
	    System.out.println(size);
	    for (int i = 0; i <size-2; i++) {
	    	WebElement ele2=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+ledger.get(i)+"')]/following-sibling::a"));
	    	String led_text = ele2.getText().trim();
	    	System.out.println(led_text);
	    	String[] ledgersplit = expected_entry.get(i).split("-");
	    	String expectedledger = ledgersplit[1].trim();
	    	Assert.assertEquals(ele2.getText().replaceAll("-", " "), expectedledger.replaceAll("-"," "));
	    	Reporter.log("Ledger code verified: "+led_text);
	    	
	    	WebElement amount=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+ledger.get(i)+"')]/parent::td/following-sibling::td/a/span"));
	    	String ActAmt = amount.getText();
	    	String ExpAmt = amt.get(i)+".00";
	    	//System.out.println(xx);
	    	//System.out.println(yy);
	    	String[] z = amount.getText().split("", 3);
	    	if (z[0].equals("(")) {
	    		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,8), ExpAmt);
			} else {
				Assert.assertEquals(amount.getText().replaceAll(",", ""), ExpAmt);
			}
	    	Reporter.log("Amount enter verified: "+ActAmt);
	    	sl.ScrollToElement(m_Driver, ele2);
		}
	    Reporter.log("Enteries are Verified on Balance Sheet Report page :", true);
	}
 
 public void verify_BS_BF_CreditorDueAfterYear_2300_2331(){
		List<WebElement> elements = m_Driver.findElements(By.xpath("//tbody/tr/td[2]/span[contains(text(),'')]/following-sibling::a"));
	    int size = elements.size();
	    System.out.println(size);
	    for (int i = 0; i <size-2; i++) {
	    	WebElement ele2=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+ledger.get(i)+"')]/following-sibling::a"));
	    	String led_text = ele2.getText().trim();
	    	System.out.println(led_text);
	    	String[] ledgersplit = expected_entry.get(i).split("-", 2);
	    	String expectedledger = ledgersplit[1].trim();
	    	Assert.assertEquals(ele2.getText().replaceAll("-", " "), expectedledger.replaceAll("-"," "));
	    	Reporter.log("Ledger code verified: "+led_text);
	    	
	    	WebElement amount=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+ledger.get(i)+"')]/parent::td/following-sibling::td/a/span"));
	    	String ActAmt = amount.getText();
	    	String ExpAmt = amt.get(i)+".00";
	    	//System.out.println(xx);
	    	//System.out.println(yy);
	    	String[] z = amount.getText().split("", 3);
	    	if (z[0].equals("(")) {
	    		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,8), ExpAmt);
			} else {
				Assert.assertEquals(amount.getText().replaceAll(",", ""), ExpAmt);
			}
	    	Reporter.log("Amount enter verified: "+ActAmt);
	    	sl.ScrollToElement(m_Driver, ele2);
		}
	    Reporter.log("Enteries are Verified on Balance Sheet Report page :", true);
	}
 
 public void verify_BS_BF_CurrentAsset_1410_1450(){
		List<WebElement> elements = m_Driver.findElements(By.xpath("//tbody/tr/td[2]/span[contains(text(),'')]/following-sibling::a"));
	    int size = elements.size();
	    System.out.println(size);
	    for (int i = 0; i <size-2; i++) {
	    	WebElement ele2=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+ledger.get(i)+"')]/following-sibling::a"));
	    	String led_text = ele2.getText().trim();
	    	System.out.println(led_text);
	    	String[] ledgersplit = expected_entry.get(i).split("-", 2);
	    	String expectedledger = ledgersplit[1].trim();
	    	Assert.assertEquals(ele2.getText().replaceAll("-", " "), expectedledger.replaceAll("-"," "));
	    	Reporter.log("Ledger code verified: "+led_text);
	    	
	    	WebElement amount=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+ledger.get(i)+"')]/parent::td/following-sibling::td/a/span"));
	    	String ActAmt = amount.getText();
	    	String ExpAmt = amt.get(i)+".00";
	    	//System.out.println(xx);
	    	//System.out.println(yy);
	    	String[] z = amount.getText().split("", 3);
	    	if (z[0].equals("(")) {
	    		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,8), ExpAmt);
			} else {
				Assert.assertEquals(amount.getText().replaceAll(",", ""), ExpAmt);
			}
	    	Reporter.log("Amount enter verified: "+ActAmt);
	    	sl.ScrollToElement(m_Driver, ele2);
		}
	    Reporter.log("Enteries are Verified on Balance Sheet Report page :", true);
	}
 
 public void verify_BS_BF_ShareCapital_3000(){
		List<WebElement> elements = m_Driver.findElements(By.xpath("//tbody/tr/td[2]/span[contains(text(),'')]/following-sibling::a"));
	    int size = elements.size();
	    System.out.println(size);
	    for (int i = 0; i <size-2; i++) {
	    	WebElement ele2=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+ledger.get(i)+"')]/following-sibling::a"));
	    	String led_text = ele2.getText().trim();
	    	System.out.println(led_text);
	    	String[] ledgersplit = expected_entry.get(i).split("-");
	    	String expectedledger = ledgersplit[1].trim();
	    	Assert.assertEquals(ele2.getText().replaceAll("-", " "), expectedledger.replaceAll("-"," "));
	    	Reporter.log("Ledger code verified: "+led_text);
	    	
	    	WebElement amount=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+ledger.get(i)+"')]/parent::td/following-sibling::td/a/span"));
	    	String ActAmt = amount.getText();
	    	String ExpAmt = amt.get(i)+".00";
	    	//System.out.println(xx);
	    	//System.out.println(yy);
	    	String[] z = amount.getText().split("", 3);
	    	if (z[0].equals("(")) {
	    		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,8), ExpAmt);
			} else {
				Assert.assertEquals(amount.getText().replaceAll(",", ""), ExpAmt);
			}
	    	Reporter.log("Amount enter verified: "+ActAmt);
	    	sl.ScrollToElement(m_Driver, ele2);
		}
	    Reporter.log("Enteries are Verified on Balance Sheet Report page :", true);
	}
 
 public void verify_BS_BF_ProvisionForLiability(){
		List<WebElement> elements = m_Driver.findElements(By.xpath("//tbody/tr/td[2]/span[contains(text(),'')]/following-sibling::a"));
	    int size = elements.size();
	    System.out.println(size);
	    for (int i = 0; i <size-2; i++) {
	    	WebElement ele2=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+ledger.get(i)+"')]/following-sibling::a"));
	    	String led_text = ele2.getText().trim();
	    	System.out.println(led_text);
	    	String[] ledgersplit = expected_entry.get(i).split("-");
	    	String expectedledger = ledgersplit[1].trim();
	    	Assert.assertEquals(ele2.getText().replaceAll("-", " "), expectedledger.replaceAll("-"," "));
	    	Reporter.log("Ledger code verified: "+led_text);
	    	
	    	WebElement amount=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+ledger.get(i)+"')]/parent::td/following-sibling::td/a/span"));
	    	String ActAmt = amount.getText();
	    	String ExpAmt = amt.get(i)+".00";
	    	//System.out.println(xx);
	    	//System.out.println(yy);
	    	String[] z = amount.getText().split("", 3);
	    	if (z[0].equals("(")) {
	    		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,9), ExpAmt);
			} else {
				Assert.assertEquals(amount.getText().replaceAll(",", ""), ExpAmt);
			}
	    	Reporter.log("Amount enter verified: "+ActAmt);
	    	sl.ScrollToElement(m_Driver, ele2);
		}
	    Reporter.log("Enteries are Verified on Balance Sheet Report page :", true);
	}
 
 public void verify_BS_BF_CreditorDueAfterYear_2332_2339(){
		List<WebElement> elements = m_Driver.findElements(By.xpath("//tbody/tr/td[2]/span[contains(text(),'')]/following-sibling::a"));
	    int size = elements.size();
	    System.out.println(size);
	    for (int i = 0; i <size-2; i++) {
	    	WebElement ele2=m_Driver.findElement(By.xpath("//tbody/tr/td[2]/span[contains(text(),'"+ledger.get(i)+"')]/following-sibling::a"));
	    	String led_text = ele2.getText().trim();
	    	System.out.println(led_text);
	    	String[] ledgersplit = expected_entry.get(i).split("-");
	    	String expectedledger = ledgersplit[1].trim();
	    	Assert.assertEquals(ele2.getText().replaceAll("-", " "), expectedledger.replaceAll("-"," "));
	    	Reporter.log("Ledger code verified: "+led_text);
	    	
	    	WebElement amount=m_Driver.findElement(By.xpath("//tbody/tr/td/span[contains(text(),'"+ledger.get(i)+"')]/parent::td/following-sibling::td/a/span"));
	    	String ActAmt = amount.getText();
	    	String ExpAmt = amt.get(i)+".00";
	    	//System.out.println(xx);
	    	//System.out.println(yy);
	    	String[] z = amount.getText().split("", 3);
	    	if (z[0].equals("(")) {
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
