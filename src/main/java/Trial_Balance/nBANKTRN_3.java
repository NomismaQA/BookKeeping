package Trial_Balance;

import pages.BasePage;
import pages.ClientSelect;
import pages.Reinbursment;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;

import Generic.SeleniumLib;
import Generic.WaitStatementLib;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.Screenshotcapture;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/a226b6d2-34bc-4f26-b18a-f50616deb4ed
@TestModellerModule(guid = "a226b6d2-34bc-4f26-b18a-f50616deb4ed")
public class nBANKTRN_3 extends BasePage
{
	SeleniumLib sl;
     public static String krno1;
     public static String savemassg;
     
	public nBANKTRN_3 (WebDriver driver)
	{
		super(driver);
		sl= new SeleniumLib(driver);
	}
 
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
	
	private By BK_SELECTElem = By.xpath("//SELECT[@id='ctl00_cPH_ddlAccount']");
	//*[@id='ctl00_cPH_rptRecord_ctl00_txtDate']

	//*[@id="ctl00_cPH_rptRecord_ctl00_txtDate"]
	private By NDateElem = By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDate']");
	private By NDateElem1 = By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl01_txtDate']");
	private By NDateElem2 = By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl02_txtDate']");
	private By NDateElem3 = By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl03_txtDate']");
	private By NDateElem4 = By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl04_txtDate']");
	private By NDateElem5 = By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl05_txtDate']");
	private By NDateElem6 = By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl06_txtDate']");
	private By NDateElem7 = By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl07_txtDate']");
	private By NDateElem8 = By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl08_txtDate']");
	private By NDateElem9 = By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl09_txtDate']");

	private By n_descElem = By.cssSelector("INPUT[id='ctl00_cPH_rptRecord_ctl00_txtDescription']");
	private By n_descElem1 = By.cssSelector("INPUT[id='ctl00_cPH_rptRecord_ctl01_txtDescription']");
	private By n_descElem2 = By.cssSelector("INPUT[id='ctl00_cPH_rptRecord_ctl02_txtDescription']");
	private By n_descElem3 = By.cssSelector("INPUT[id='ctl00_cPH_rptRecord_ctl03_txtDescription']");
	private By n_descElem4 = By.cssSelector("INPUT[id='ctl00_cPH_rptRecord_ctl04_txtDescription']");
	private By n_descElem5 = By.cssSelector("INPUT[id='ctl00_cPH_rptRecord_ctl05_txtDescription']");
	private By n_descElem6 = By.cssSelector("INPUT[id='ctl00_cPH_rptRecord_ctl06_txtDescription']");
	private By n_descElem7 = By.cssSelector("INPUT[id='ctl00_cPH_rptRecord_ctl07_txtDescription']");
	private By n_descElem8 = By.cssSelector("INPUT[id='ctl00_cPH_rptRecord_ctl08_txtDescription']");
	private By n_descElem9 = By.cssSelector("INPUT[id='ctl00_cPH_rptRecord_ctl09_txtDescription']");
	
	
	private By Recived_amtElem = By.xpath("//INPUT[@id='ctl00_cPH_rptRecord_ctl00_txtDbAmount']");
	private By Recived_amtElem1 = By.xpath("//INPUT[@id='ctl00_cPH_rptRecord_ctl01_txtDbAmount']");
	private By Recived_amtElem2= By.xpath("//INPUT[@id='ctl00_cPH_rptRecord_ctl02_txtDbAmount']");
	private By Recived_amtElem3 = By.xpath("//INPUT[@id='ctl00_cPH_rptRecord_ctl03_txtDbAmount']");
	private By Recived_amtElem4 = By.xpath("//INPUT[@id='ctl00_cPH_rptRecord_ctl04_txtDbAmount']");
	private By Recived_amtElem5 = By.xpath("//INPUT[@id='ctl00_cPH_rptRecord_ctl05_txtDbAmount']");
	private By Recived_amtElem6 = By.xpath("//INPUT[@id='ctl00_cPH_rptRecord_ctl06_txtDbAmount']");
	private By Recived_amtElem7 = By.xpath("//INPUT[@id='ctl00_cPH_rptRecord_ctl07_txtDbAmount']");
	private By Recived_amtElem8 = By.xpath("//INPUT[@id='ctl00_cPH_rptRecord_ctl08_txtDbAmount']");
	private By Recived_amtElem9 = By.xpath("//INPUT[@id='ctl00_cPH_rptRecord_ctl09_txtDbAmount']");
	

	private By spnt_amtElem = By.cssSelector("INPUT[id='ctl00_cPH_rptRecord_ctl00_txtAmount']");
	private By spnt_amtElem1 = By.cssSelector("INPUT[id='ctl00_cPH_rptRecord_ctl01_txtAmount']");
	private By spnt_amtElem2 = By.cssSelector("INPUT[id='ctl00_cPH_rptRecord_ctl02_txtAmount']");
	private By spnt_amtElem3 = By.cssSelector("INPUT[id='ctl00_cPH_rptRecord_ctl03_txtAmount']");
	private By spnt_amtElem4 = By.cssSelector("INPUT[id='ctl00_cPH_rptRecord_ctl04_txtAmount']");
	private By spnt_amtElem5 = By.cssSelector("INPUT[id='ctl00_cPH_rptRecord_ctl05_txtAmount']");
	private By spnt_amtElem6 = By.cssSelector("INPUT[id='ctl00_cPH_rptRecord_ctl06_txtAmount']");
	private By spnt_amtElem7 = By.cssSelector("INPUT[id='ctl00_cPH_rptRecord_ctl07_txtAmount']");
	private By spnt_amtElem8 = By.cssSelector("INPUT[id='ctl00_cPH_rptRecord_ctl08_txtAmount']");
	private By spnt_amtElem9 = By.cssSelector("INPUT[id='ctl00_cPH_rptRecord_ctl09_txtAmount']");

	private By Select_VATRateElem = By.cssSelector("SELECT[id='ctl00_cPH_rptRecord_ctl00_ddVATRate']");

	private By cal_amtElem = By.xpath("//INPUT[@id='ctl00_cPH_rptRecord_ctl00_ltVATAmount']");

	private By Select_Option1Elem = By.xpath("//SPAN[@id='select2-ctl00_cPH_rptRecord_ctl00_ltAccount-container']");
	private By Select_Option2Elem = By.xpath("//SPAN[@id='select2-ctl00_cPH_rptRecord_ctl01_ltAccount-container']");
	private By Select_Option3Elem = By.xpath("//SPAN[@id='select2-ctl00_cPH_rptRecord_ctl02_ltAccount-container']");
	private By Select_Option4Elem = By.xpath("//SPAN[@id='select2-ctl00_cPH_rptRecord_ctl03_ltAccount-container']");
	private By Select_Option5Elem = By.xpath("//SPAN[@id='select2-ctl00_cPH_rptRecord_ctl04_ltAccount-container']");
	private By Select_Option6Elem = By.xpath("//SPAN[@id='select2-ctl00_cPH_rptRecord_ctl05_ltAccount-container']");
	private By Select_Option7Elem = By.xpath("//SPAN[@id='select2-ctl00_cPH_rptRecord_ctl06_ltAccount-container']");
	private By Select_Option8Elem = By.xpath("//SPAN[@id='select2-ctl00_cPH_rptRecord_ctl07_ltAccount-container']");
	private By Select_Option9Elem = By.xpath("//SPAN[@id='select2-ctl00_cPH_rptRecord_ctl08_ltAccount-container']");
	private By Select_Option10Elem = By.xpath("//SPAN[@id='select2-ctl00_cPH_rptRecord_ctl10_ltAccount-container']");

	//private By Select_Option1Elem=By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div[1]/div/div/div/table/tbody/tr[1]/td[11]/span/span[1]/span/span[1]/span");
	//private By BOX2Elem = By.cssSelector("INPUT[aria-autocomplete='list']");
	//private By BOX2Elem=By.xpath("/html/body/span/span/span[1]/input");

	private By Select_an_option3Elem=By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div[1]/div/div/div/table/tbody/tr[1]/td[11]/span/span[1]/span/span[1]/span");

	private By BOXElem= By.xpath("//*[@id='tableID']/tbody/tr[1]/td[12]/span/span[1]/span/span[1]");
	private By BOXElem1= By.xpath("//*[@id='select2-ctl00_cPH_rptRecord_ctl01_ltAccount-container']");
	private By BOXElem2= By.xpath("//*[@id='select2-ctl00_cPH_rptRecord_ctl02_ltAccount-container']");
	private By BOXElem3= By.xpath("//*[@id='select2-ctl00_cPH_rptRecord_ctl03_ltAccount-container']");
	private By BOXElem4= By.xpath("//*[@id='select2-ctl00_cPH_rptRecord_ctl04_ltAccount-container']");
	private By BOXElem5= By.xpath("//*[@id='select2-ctl00_cPH_rptRecord_ctl05_ltAccount-container']");
	private By BOXElem6= By.xpath("//*[@id='select2-ctl00_cPH_rptRecord_ctl06_ltAccount-container']");
	private By BOXElem7= By.xpath("//*[@id='select2-ctl00_cPH_rptRecord_ctl07_ltAccount-container']");
	private By BOXElem8= By.xpath("//*[@id='select2-ctl00_cPH_rptRecord_ctl08_ltAccount-container']");
	private By BOXElem9= By.xpath("//*[@id='select2-ctl00_cPH_rptRecord_ctl09_ltAccount-container']");
	

	private By BOXGet= By.xpath("//*[@id='select2-ctl00_cPH_rptRecord_ctl00_ltAccount-container']");
	private By BOXGet1= By.xpath("//*[@id='select2-ctl00_cPH_rptRecord_ctl01_ltAccount-container']");
	private By BOXGet2= By.xpath("//*[@id='select2-ctl00_cPH_rptRecord_ctl02_ltAccount-container']");
	private By BOXGet3= By.xpath("//*[@id='select2-ctl00_cPH_rptRecord_ctl03_ltAccount-container']");
	private By BOXGet4= By.xpath("//*[@id='select2-ctl00_cPH_rptRecord_ctl04_ltAccount-container']");
	private By BOXGet5= By.xpath("//*[@id='select2-ctl00_cPH_rptRecord_ctl05_ltAccount-container']");
	private By BOXGet6= By.xpath("//*[@id='select2-ctl00_cPH_rptRecord_ctl06_ltAccount-container']");
	private By BOXGet7= By.xpath("//*[@id='select2-ctl00_cPH_rptRecord_ctl07_ltAccount-container']");
	private By BOXGet8= By.xpath("//*[@id='select2-ctl00_cPH_rptRecord_ctl08_ltAccount-container']");
	private By BOXGet9= By.xpath("//*[@id='select2-ctl00_cPH_rptRecord_ctl09_ltAccount-container']");
	

	private By _Save_Elem = By.xpath("//*[@id='ctl00_cpHeaderRight_btnSaveAndOpenDashbord']");
	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AccountUI/BankTranEditor.aspx?FYCode=52444&CompanyCode=13236&menuid=0");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AccountUI/BankTranEditor.aspx?FYCode=52444&CompanyCode=13236&menuid=0");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AccountUI/BankTranEditor.aspx?FYCode=52444&CompanyCode=13236&menuid=0");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
//   public void AssertUrl()
//    {
//        String currentUrl = m_Driver.getCurrentUrl();
//        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AccountUI/BankTranEditor.aspx?FYCode=52444&CompanyCode=13236&menuid=0";
//
//        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AccountUI/BankTranEditor.aspx?FYCode=52444&CompanyCode=13236&menuid=0")) {
//            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
//        }
//    }

    
	/**
 	 * Select BK_SELECT
	 * @throws InterruptedException 
     * @name Select BK_SELECT
     */
    public void Select_BK_SELECT(String BK_SELECT) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(BK_SELECTElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_BK_SELECT", "Select_BK_SELECT failed. Unable to locate object: " + BK_SELECTElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_BK_SELECT", "Select_BK_SELECT failed. Unable to locate object: " + BK_SELECTElem.toString());

 			Assert.fail("Unable to locate object: " + BK_SELECTElem.toString());
         }
 		System.out.println("1"+BK_SELECT);
 		elem.sendKeys(Keys.ENTER);
 		Select dropdown = new Select(elem);
 		
 		Thread.sleep(1000);

 		dropdown.selectByVisibleText(BK_SELECT);
 		
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_BK_SELECT " + BK_SELECT);

 		TestModellerLogger.PassStep(m_Driver, "Select_BK_SELECT " + BK_SELECT);
 	}

      
	/**
 	 * Enter NDate
     * @name Enter NDate
     */
 	public void Enter_NDate(String NDate)
 	{
 	    
 		WebElement elem = getWebElement(NDateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_NDate", "Enter_NDate failed. Unable to locate object: " + NDateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_NDate", "Enter_NDate failed. Unable to locate object: " + NDateElem.toString());

 			Assert.fail("Unable to locate object: " + NDateElem.toString());
         }
 		WaitStatementLib wt=new WaitStatementLib();
		wt.explicitWait_elementToBeClickable(m_Driver, 20, elem);
		elem.click();
 		elem.sendKeys(Keys.ENTER);
 		elem.sendKeys(NDate);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_NDate " + NDate);

  		TestModellerLogger.PassStep(m_Driver, "Enter_NDate " + NDate);
 	}

      
	/**
 	 * Enter n_desc
     * @name Enter n_desc
     */
 	public void Enter_n_desc(String n_desc)
 	{
 	    
 		WebElement elem = getWebElement(n_descElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_n_desc", "Enter_n_desc failed. Unable to locate object: " + n_descElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_n_desc", "Enter_n_desc failed. Unable to locate object: " + n_descElem.toString());

 			Assert.fail("Unable to locate object: " + n_descElem.toString());
         }
 		WaitStatementLib wt=new WaitStatementLib();
		wt.explicitWait_elementToBeClickable(m_Driver, 20, elem);
		elem.click();
 		elem.sendKeys(n_desc);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_n_desc " + n_desc);

  		TestModellerLogger.PassStep(m_Driver, "Enter_n_desc " + n_desc);
 	}

      
	/**
 	 * Enter Recived_amt
     * @name Enter Recived_amt
     */
 	public void Enter_Recived_amt(String Recived_amt)
 	{
 	    
 		WebElement elem = getWebElement(Recived_amtElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Recived_amt", "Enter_Recived_amt failed. Unable to locate object: " + Recived_amtElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Recived_amt", "Enter_Recived_amt failed. Unable to locate object: " + Recived_amtElem.toString());

 			Assert.fail("Unable to locate object: " + Recived_amtElem.toString());
         }
 		WaitStatementLib wt=new WaitStatementLib();
		wt.explicitWait_elementToBeClickable(m_Driver, 20, elem);
		elem.click();
 		elem.sendKeys(Recived_amt);
 		amt.add(0,Recived_amt);
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Recived_amt " + Recived_amt);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Recived_amt " + Recived_amt);
 	}

      
	/**
 	 * Enter spnt_amt
     * @name Enter spnt_amt
     */
 	public void Enter_spnt_amt(String spnt_amt)
 	{
 	    
 		WebElement elem = getWebElement(spnt_amtElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_spnt_amt", "Enter_spnt_amt failed. Unable to locate object: " + spnt_amtElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_spnt_amt", "Enter_spnt_amt failed. Unable to locate object: " + spnt_amtElem.toString());

 			Assert.fail("Unable to locate object: " + spnt_amtElem.toString());
         }
 		WaitStatementLib wt=new WaitStatementLib();
		wt.explicitWait_elementToBeClickable(m_Driver, 20, elem);
		elem.click();
 		elem.sendKeys(spnt_amt);
 			
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_spnt_amt " + spnt_amt);

  		TestModellerLogger.PassStep(m_Driver, "Enter_spnt_amt " + spnt_amt);
 	}
 	 public void Select_Select_VATRate(String Select_VATRate) throws InterruptedException
  	{
  	    
  		WebElement elem = getWebElement(Select_VATRateElem);

  		if (elem == null) {
     		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Select_VATRate", "Select_Select_VATRate failed. Unable to locate object: " + Select_VATRateElem.toString());

     		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Select_VATRate", "Select_Select_VATRate failed. Unable to locate object: " + Select_VATRateElem.toString());

  			Assert.fail("Unable to locate object: " + Select_VATRateElem.toString());
          }

  		Select dropdown = new Select(elem);
   		dropdown.selectByVisibleText(Select_VATRate);
  			
  		ExtentReportManager.passStep(m_Driver, "Select_Select_VATRate " + Select_VATRate);

  		TestModellerLogger.PassStep(m_Driver, "Select_Select_VATRate " + Select_VATRate);
  	}

    
	public void Click_Select_Option1() throws InterruptedException
	{
        		WebElement elem = getWebElement(Select_Option1Elem);

		if (elem == null) 
		{
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Select_Option1", "Click_Select_Option1 failed. Unable to locate object: " + Select_Option1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Select_Option1", "Click_Select_Option1 failed. Unable to locate object: " + Select_Option1Elem.toString());

			Assert.fail("Unable to locate object: " + Select_Option1Elem.toString());
        }
//	WebDriverWait wait = new WebDriverWait(m_Driver,20);
//		WebElement t = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("INPUT[aria-autocomplete='list']")));
//				
//		
//			t.click();	
	elem.click();
	Thread.sleep(300);
    	
      		
	}
      
	/**
 	 * Enter BOX2
	 * @throws InterruptedException 
     * @name Enter BOX2
     */
 	public void Enter_BOX(String BOX) throws InterruptedException
 	{
 		ledger.add(0, BOX);
 		WebElement elem = getWebElement(BOXElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_BOX", "Enter_BOX failed. Unable to locate object: " + BOXElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_BOX", "Enter_BOX failed. Unable to locate object: " + BOXElem.toString());

 			Assert.fail("Unable to locate object: " + BOXElem.toString());
         }
 		
 	//	WaitStatementLib wt=new WaitStatementLib();
	//	wt.explicitWait_elementToBeClickable(m_Driver, 20, elem);
	
		//elem.click();
		m_Driver.findElement(By.xpath("//*[@id='select2-ctl00_cPH_rptRecord_ctl00_ltAccount-container']")).click();
		m_Driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("10 - i");
		m_Driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
//		wt.explicitiWait_presenceOfElementLocated(m_Driver, 20, By.xpath("//*[@id='select2-ctl00_cPH_rptRecord_ctl00_ltAccount-results']/li/ul/li[starts-with(text(), '"+BOX+" - "+"')]"));
//		
//		//wt.explicitWait_elementToBeClickable(m_Driver, 20, m_Driver.findElement(By.xpath("//ul[@id='ctl00_cPH_rptRecord_ctl06_AccountUC1_AutoCompleteExtender1_completionListElem']/li[starts-with(text(), '"+Account7+" -"+"')]")));
//		WebElement elemc= m_Driver.findElement(By.xpath("//*[@id='select2-ctl00_cPH_rptRecord_ctl00_ltAccount-results']/li/ul/li[starts-with(text(), '"+BOX+" - "+"')]"));
//		elemc.click();
    	
		WebElement ele1=getWebElement(BOXGet);
 		LedgerEntered_1=ele1.getAttribute("title");
 		expected_entry.add(0, ele1.getAttribute("title"));
 	    //System.out.println(LedgerEntered_7);
 	   Reporter.log("ledger 1 entered :"+LedgerEntered_1, true);
    	
 		 ExtentReportManager.passStep(m_Driver, "Enter_BOX " + BOX);

  		 TestModellerLogger.PassStep(m_Driver, "Enter_BOX " + BOX);
 		
 		
 			
 	}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 	
 	public void Enter_NDate1(String NDate1)
 	{
 	    
 		WebElement elem = getWebElement(NDateElem1);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_NDate1", "Enter_NDate1 failed. Unable to locate object: " + NDateElem1.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_NDate1", "Enter_NDate1 failed. Unable to locate object: " + NDateElem1.toString());

 			Assert.fail("Unable to locate object: " + NDateElem1.toString());
         }
 		WaitStatementLib wt=new WaitStatementLib();
		wt.explicitWait_elementToBeClickable(m_Driver, 20, elem);
 		elem.sendKeys(Keys.ENTER);
 		elem.sendKeys(NDate1);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_NDate1 " + NDate1);

  		TestModellerLogger.PassStep(m_Driver, "Enter_NDate1 " + NDate1);
 	}

      
	/**
 	 * Enter n_desc
     * @name Enter n_desc
     */
 	public void Enter_n_desc1(String n_desc1)
 	{
 	    
 		WebElement elem = getWebElement(n_descElem1);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_n_desc1", "Enter_n_desc1 failed. Unable to locate object: " + n_descElem1.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_n_desc1", "Enter_n_desc1 failed. Unable to locate object: " + n_descElem1.toString());

 			Assert.fail("Unable to locate object: " + n_descElem1.toString());
         }
 		WaitStatementLib wt=new WaitStatementLib();
		wt.explicitWait_elementToBeClickable(m_Driver, 20, elem);
		
 		elem.sendKeys(n_desc1);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_n_desc1 " + n_desc1);

  		TestModellerLogger.PassStep(m_Driver, "Enter_n_desc1 " + n_desc1);
 	}

      
	/**
 	 * Enter Recived_amt
     * @name Enter Recived_amt
     */
 	public void Enter_Recived_amt1(String Recived_amt1)
 	{
 	    
 		WebElement elem = getWebElement(Recived_amtElem1);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Recived_amt1", "Enter_Recived_amt1 failed. Unable to locate object: " + Recived_amtElem1.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Recived_amt1", "Enter_Recived_amt1 failed. Unable to locate object: " + Recived_amtElem1.toString());

 			Assert.fail("Unable to locate object: " + Recived_amtElem1.toString());
         }
 		WaitStatementLib wt=new WaitStatementLib();
		wt.explicitWait_elementToBeClickable(m_Driver, 20, elem);
		
 		elem.sendKeys(Recived_amt1);
 		amt.add(1,Recived_amt1);
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Recived_amt1 " + Recived_amt1);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Recived_amt1 " + Recived_amt1);
 	}
 	public void Enter_spnt_amt1(String spnt_amt1)
 	{
 	    
 		WebElement elem = getWebElement(spnt_amtElem1);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_spnt_amt1", "Enter_spnt_amt1 failed. Unable to locate object: " + spnt_amtElem1.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_spnt_amt1", "Enter_spnt_amt1 failed. Unable to locate object: " + spnt_amtElem1.toString());

 			Assert.fail("Unable to locate object: " + spnt_amtElem1.toString());
         }
 		WaitStatementLib wt=new WaitStatementLib();
		wt.explicitWait_elementToBeClickable(m_Driver, 20, elem);
		elem.click();
 		elem.sendKeys(spnt_amt1);
 			
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_spnt_amt1 " + spnt_amt1);

  		TestModellerLogger.PassStep(m_Driver, "Enter_spnt_amt1 " + spnt_amt1);
 	}
      
	
	/**
 	 * Enter BOX2
	 * @throws InterruptedException 
     * @name Enter BOX2
     */
 	public void Enter_BOX1(String BOX1) throws InterruptedException
 	{
 		ledger.add(1, BOX1);
 		WebElement elem = getWebElement(BOXElem1);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_BOX1", "Enter_BOX1 failed. Unable to locate object: " + BOXElem1.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_BOX1", "Enter_BOX1 failed. Unable to locate object: " + BOXElem1.toString());

 			Assert.fail("Unable to locate object: " + BOXElem1.toString());
         }
 		
 		WaitStatementLib wt=new WaitStatementLib();
		wt.explicitWait_elementToBeClickable(m_Driver, 20, elem);
		elem.click();
		
		wt.explicitiWait_presenceOfElementLocated(m_Driver, 20, By.xpath("//*[@id='select2-ctl00_cPH_rptRecord_ctl01_ltAccount-results']/li/ul/li[starts-with(text(), '"+BOX1+" - "+"')]"));
		
		//wt.explicitWait_elementToBeClickable(m_Driver, 20, m_Driver.findElement(By.xpath("//ul[@id='ctl00_cPH_rptRecord_ctl06_AccountUC1_AutoCompleteExtender1_completionListElem']/li[starts-with(text(), '"+Account7+" -"+"')]")));
		WebElement elemc= m_Driver.findElement(By.xpath("//*[@id='select2-ctl00_cPH_rptRecord_ctl01_ltAccount-results']/li/ul/li[starts-with(text(), '"+BOX1+" - "+"')]"));
		elemc.click();
    	
		WebElement ele1=getWebElement(BOXGet1);
 		LedgerEntered_2=ele1.getAttribute("title");
 		expected_entry.add(1, ele1.getAttribute("title"));
 	    //System.out.println(LedgerEntered_7);
 	   Reporter.log("ledger 2 entered :"+LedgerEntered_2, true);
    	
 		 ExtentReportManager.passStep(m_Driver, "Enter_BOX1 " + BOX1);

  		 TestModellerLogger.PassStep(m_Driver, "Enter_BOX1 " + BOX1);
 		
 		
 			
 	}

     ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 	
 	
 	public void Enter_NDate2(String NDate2)
 	{
 	    
 		WebElement elem = getWebElement(NDateElem2);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_NDate2", "Enter_NDate2 failed. Unable to locate object: " + NDateElem2.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_NDate2", "Enter_NDate2 failed. Unable to locate object: " + NDateElem2.toString());

 			Assert.fail("Unable to locate object: " + NDateElem2.toString());
         }
 		WaitStatementLib wt=new WaitStatementLib();
		wt.explicitWait_elementToBeClickable(m_Driver, 20, elem);
 		elem.sendKeys(Keys.ENTER);
 		elem.sendKeys(NDate2);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_NDate2 " + NDate2);

  		TestModellerLogger.PassStep(m_Driver, "Enter_NDate2 " + NDate2);
 	}

      
	/**
 	 * Enter n_desc
     * @name Enter n_desc
     */
 	public void Enter_n_desc2(String n_desc2)
 	{
 	    
 		WebElement elem = getWebElement(n_descElem2);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_n_desc2", "Enter_n_desc2 failed. Unable to locate object: " + n_descElem2.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_n_desc2", "Enter_n_desc2 failed. Unable to locate object: " + n_descElem2.toString());

 			Assert.fail("Unable to locate object: " + n_descElem2.toString());
         }
 		WaitStatementLib wt=new WaitStatementLib();
		wt.explicitWait_elementToBeClickable(m_Driver, 20, elem);
		
 		elem.sendKeys(n_desc2);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_n_desc2 " + n_desc2);

  		TestModellerLogger.PassStep(m_Driver, "Enter_n_desc2 " + n_desc2);
 	}

      
	/**
 	 * Enter Recived_amt
     * @name Enter Recived_amt
     */
 	public void Enter_Recived_amt2(String Recived_amt2)
 	{
 	    
 		WebElement elem = getWebElement(Recived_amtElem2);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Recived_amt2", "Enter_Recived_amt2 failed. Unable to locate object: " + Recived_amtElem2.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Recived_amt2", "Enter_Recived_amt2 failed. Unable to locate object: " + Recived_amtElem2.toString());

 			Assert.fail("Unable to locate object: " + Recived_amtElem2.toString());
         }
 		WaitStatementLib wt=new WaitStatementLib();
		wt.explicitWait_elementToBeClickable(m_Driver, 20, elem);
		
 		elem.sendKeys(Recived_amt2);
 		amt.add(2,Recived_amt2);
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Recived_amt2 " + Recived_amt2);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Recived_amt2 " + Recived_amt2);
 	}
 	public void Enter_spnt_amt2(String spnt_amt2)
 	{
 	    
 		WebElement elem = getWebElement(spnt_amtElem2);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_spnt_amt2", "Enter_spnt_amt2 failed. Unable to locate object: " + spnt_amtElem2.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_spnt_amt2", "Enter_spnt_amt2 failed. Unable to locate object: " + spnt_amtElem2.toString());

 			Assert.fail("Unable to locate object: " + spnt_amtElem2.toString());
         }
 		WaitStatementLib wt=new WaitStatementLib();
		wt.explicitWait_elementToBeClickable(m_Driver, 20, elem);
		elem.click();
 		elem.sendKeys(spnt_amt2);
 			
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_spnt_amt2 " + spnt_amt2);

  		TestModellerLogger.PassStep(m_Driver, "Enter_spnt_amt2 " + spnt_amt2);
 	}
      
	
	/**
 	 * Enter BOX2
	 * @throws InterruptedException 
     * @name Enter BOX2
     */
 	public void Enter_BOX2(String BOX2) throws InterruptedException
 	{
 		ledger.add(2, BOX2);
 		WebElement elem = getWebElement(BOXElem2);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_BOX2", "Enter_BOX2 failed. Unable to locate object: " + BOXElem2.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_BOX2", "Enter_BOX2 failed. Unable to locate object: " + BOXElem2.toString());

 			Assert.fail("Unable to locate object: " + BOXElem2.toString());
         }
 		
 		WaitStatementLib wt=new WaitStatementLib();
		wt.explicitWait_elementToBeClickable(m_Driver, 20, elem);
		elem.click();
		
		wt.explicitiWait_presenceOfElementLocated(m_Driver, 20, By.xpath("//*[@id='select2-ctl00_cPH_rptRecord_ctl02_ltAccount-results']/li/ul/li[starts-with(text(), '"+BOX2+" - "+"')]"));
		
		//wt.explicitWait_elementToBeClickable(m_Driver, 20, m_Driver.findElement(By.xpath("//ul[@id='ctl00_cPH_rptRecord_ctl06_AccountUC1_AutoCompleteExtender1_completionListElem']/li[starts-with(text(), '"+Account7+" -"+"')]")));
		WebElement elemc= m_Driver.findElement(By.xpath("//*[@id='select2-ctl00_cPH_rptRecord_ctl02_ltAccount-results']/li/ul/li[starts-with(text(), '"+BOX2+" - "+"')]"));
		elemc.click();
    	
		WebElement ele1=getWebElement(BOXGet2);
 		LedgerEntered_3=ele1.getAttribute("title");
 		expected_entry.add(2, ele1.getAttribute("title"));
 	    //System.out.println(LedgerEntered_7);
 	   Reporter.log("ledger 3 entered :"+LedgerEntered_3, true);
    	
 		 ExtentReportManager.passStep(m_Driver, "Enter_BOX2 " + BOX2);

  		 TestModellerLogger.PassStep(m_Driver, "Enter_BOX2 " + BOX2);
 		
 	}
 	
 	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 	
 	public void Enter_NDate3(String NDate3)
 	{
 	    
 		WebElement elem = getWebElement(NDateElem3);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_NDate3", "Enter_NDate3 failed. Unable to locate object: " + NDateElem3.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_NDate3", "Enter_NDate3 failed. Unable to locate object: " + NDateElem3.toString());

 			Assert.fail("Unable to locate object: " + NDateElem3.toString());
         }
 		WaitStatementLib wt=new WaitStatementLib();
		wt.explicitWait_elementToBeClickable(m_Driver, 20, elem);
 		elem.sendKeys(Keys.ENTER);
 		elem.sendKeys(NDate3);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_NDate3 " + NDate3);

  		TestModellerLogger.PassStep(m_Driver, "Enter_NDate3 " + NDate3);
 	}

      
	/**
 	 * Enter n_desc
     * @name Enter n_desc
     */
 	public void Enter_n_desc3(String n_desc3)
 	{
 	    
 		WebElement elem = getWebElement(n_descElem3);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_n_desc3", "Enter_n_desc3 failed. Unable to locate object: " + n_descElem3.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_n_desc3", "Enter_n_desc3 failed. Unable to locate object: " + n_descElem3.toString());

 			Assert.fail("Unable to locate object: " + n_descElem3.toString());
         }
 		WaitStatementLib wt=new WaitStatementLib();
		wt.explicitWait_elementToBeClickable(m_Driver, 20, elem);
		
 		elem.sendKeys(n_desc3);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_n_desc3 " + n_desc3);

  		TestModellerLogger.PassStep(m_Driver, "Enter_n_desc3 " + n_desc3);
 	}

      
	/**
 	 * Enter Recived_amt
     * @name Enter Recived_amt
     */
 	public void Enter_Recived_amt3(String Recived_amt3)
 	{
 	    
 		WebElement elem = getWebElement(Recived_amtElem3);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Recived_amt3", "Enter_Recived_amt3 failed. Unable to locate object: " + Recived_amtElem3.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Recived_amt3", "Enter_Recived_amt3 failed. Unable to locate object: " + Recived_amtElem3.toString());

 			Assert.fail("Unable to locate object: " + Recived_amtElem3.toString());
         }
 		WaitStatementLib wt=new WaitStatementLib();
		wt.explicitWait_elementToBeClickable(m_Driver, 20, elem);
		
 		elem.sendKeys(Recived_amt3);
 		amt.add(3,Recived_amt3);
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Recived_amt3 " + Recived_amt3);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Recived_amt3 " + Recived_amt3);
 	}
	public void Enter_spnt_amt3(String spnt_amt3)
 	{
 	    
 		WebElement elem = getWebElement(spnt_amtElem3);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_spnt_amt3", "Enter_spnt_amt3 failed. Unable to locate object: " + spnt_amtElem3.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_spnt_amt3", "Enter_spnt_amt3 failed. Unable to locate object: " + spnt_amtElem3.toString());

 			Assert.fail("Unable to locate object: " + spnt_amtElem3.toString());
         }
 		WaitStatementLib wt=new WaitStatementLib();
		wt.explicitWait_elementToBeClickable(m_Driver, 20, elem);
		elem.click();
 		elem.sendKeys(spnt_amt3);
 			
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_spnt_amt3 " + spnt_amt3);

  		TestModellerLogger.PassStep(m_Driver, "Enter_spnt_amt3 " + spnt_amt3);
 	}
      
	
	/**
 	 * Enter BOX2
	 * @throws InterruptedException 
     * @name Enter BOX2
     */
 	public void Enter_BOX3(String BOX3) throws InterruptedException
 	{
 		ledger.add(3, BOX3);
 		WebElement elem = getWebElement(BOXElem3);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_BOX3", "Enter_BOX3 failed. Unable to locate object: " + BOXElem3.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_BOX3", "Enter_BOX3 failed. Unable to locate object: " + BOXElem3.toString());

 			Assert.fail("Unable to locate object: " + BOXElem3.toString());
         }
 		
 		WaitStatementLib wt=new WaitStatementLib();
		wt.explicitWait_elementToBeClickable(m_Driver, 20, elem);
		elem.click();
		
		wt.explicitiWait_presenceOfElementLocated(m_Driver, 20, By.xpath("//*[@id='select2-ctl00_cPH_rptRecord_ctl03_ltAccount-results']/li/ul/li[starts-with(text(), '"+BOX3+" - "+"')]"));
		
		//wt.explicitWait_elementToBeClickable(m_Driver, 20, m_Driver.findElement(By.xpath("//ul[@id='ctl00_cPH_rptRecord_ctl06_AccountUC1_AutoCompleteExtender1_completionListElem']/li[starts-with(text(), '"+Account7+" -"+"')]")));
		WebElement elemc= m_Driver.findElement(By.xpath("//*[@id='select2-ctl00_cPH_rptRecord_ctl03_ltAccount-results']/li/ul/li[starts-with(text(), '"+BOX3+" - "+"')]"));
		elemc.click();
    	
		WebElement ele1=getWebElement(BOXGet3);
 		LedgerEntered_4=ele1.getAttribute("title");
 		expected_entry.add(3, ele1.getAttribute("title"));
 	    //System.out.println(LedgerEntered_7);
 	   Reporter.log("ledger 4 entered :"+LedgerEntered_4, true);
    	
 		 ExtentReportManager.passStep(m_Driver, "Enter_BOX3 " + BOX3);

  		 TestModellerLogger.PassStep(m_Driver, "Enter_BOX3 " + BOX3);
 		
 	}
	/**
 	 * Click 1400 - DATA
     * @name Click 1400 - DATA
     */
//	public void Click__1400_DATA()
//	{
//        
//		WebElement elem = getWebElement(_1400_DATAElem);
//
//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__1400_DATA", "Click__1400_DATA failed. Unable to locate object: " + _1400_DATAElem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__1400_DATA", "Click__1400_DATA failed. Unable to locate object: " + _1400_DATAElem.toString());
//
//			Assert.fail("Unable to locate object: " + _1400_DATAElem.toString());
//        }
//
//		elem.click();
//          	
//
//		ExtentReportManager.passStep(m_Driver, "Click__1400_DATA");
//
//		TestModellerLogger.PassStep(m_Driver, "Click__1400_DATA");
//	}
	/**
 	 * Click  Save 
	 * @throws InterruptedException 
	 * @throws AWTException 
	 * @throws IOException 
	 * @throws HeadlessException 
     * @name Click  Save 
     */
	public void Click__Save_() throws InterruptedException, HeadlessException, IOException, AWTException
	{
        
		WebElement elem = getWebElement(_Save_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Save_", "Click__Save_ failed. Unable to locate object: " + _Save_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Save_", "Click__Save_ failed. Unable to locate object: " + _Save_Elem.toString());

			Assert.fail("Unable to locate object: " + _Save_Elem.toString());
        }
		
//		elem.click();
		JavascriptExecutor jse = (JavascriptExecutor)m_Driver;
		jse.executeScript("arguments[0].click()", elem);
		Thread.sleep(2000);
		pages.PartialReconciledCases.Searchclient c =new pages.PartialReconciledCases.Searchclient(m_Driver);
		//ClientSelect c = new ClientSelect(m_Driver);
		Supplier_pages.SupplierBillSToFRS re= new Supplier_pages.SupplierBillSToFRS(m_Driver);
		String client = c.client1();
		
		String Remv = re.vatrate1();
		savemassg=client+Remv;
		System.out.println("save"+savemassg);
		Screenshotcapture.captureAsImage(m_Driver, savemassg);
		 WebElement s=m_Driver.findElement(By.xpath("//*[@id='ctl00_divSubContent']/div[1]/div"));
	     String transnno=s.getText();
	     String arr[]=transnno.split(" ");
	     String stn=arr[2];
	      krno1=stn.substring(1);
	    System.out.println("Transaction number is"    +krno1);	
		ExtentReportManager.passStep(m_Driver, "Click__Save_");

	    TestModellerLogger.PassStep(m_Driver, "Click__Save_");
			                
			
	}
	
	public String confirmation() 
	{
		System.out.println("Confirmation "    +krno1);	
		return krno1;
		
		
	}
	

	}
	
