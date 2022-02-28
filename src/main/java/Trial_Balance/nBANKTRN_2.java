package Trial_Balance;

import pages.BasePage;
import pages.ClientSelect;
import pages.Reinbursment;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.IOException;
import java.time.Duration;
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

import Generic.WaitStatementLib;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.Screenshotcapture;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/a226b6d2-34bc-4f26-b18a-f50616deb4ed
@TestModellerModule(guid = "a226b6d2-34bc-4f26-b18a-f50616deb4ed")
public class nBANKTRN_2 extends BasePage
{
     public static String krno1;
     public static String savemassg;
     
	public nBANKTRN_2 (WebDriver driver)
	{
		super(driver);
	}
 
	private By BK_SELECTElem = By.xpath("//SELECT[@id='ctl00_cPH_ddlAccount']");
	//*[@id='ctl00_cPH_rptRecord_ctl00_txtDate']

	//*[@id="ctl00_cPH_rptRecord_ctl00_txtDate"]
	private By NDateElem = By.xpath("//input[@id='ctl00_cPH_rptRecord_ctl00_txtDate']");

	private By n_descElem = By.cssSelector("INPUT[id='ctl00_cPH_rptRecord_ctl00_txtDescription']");
	
	
	private By Recived_amtElem = By.xpath("//INPUT[@id='ctl00_cPH_rptRecord_ctl00_txtDbAmount']");

	private By spnt_amtElem = By.cssSelector("INPUT[id='ctl00_cPH_rptRecord_ctl00_txtAmount']");

	private By Select_VATRateElem = By.cssSelector("SELECT[id='ctl00_cPH_rptRecord_ctl00_ddVATRate']");

	private By cal_amtElem = By.xpath("//INPUT[@id='ctl00_cPH_rptRecord_ctl00_ltVATAmount']");

	private By Select_Option1Elem = By.xpath("//SPAN[@id='select2-ctl00_cPH_rptRecord_ctl00_ltAccount-container']");
	//private By Select_Option1Elem=By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div[1]/div/div/div/table/tbody/tr[1]/td[11]/span/span[1]/span/span[1]/span");
	//private By BOX2Elem = By.cssSelector("INPUT[aria-autocomplete='list']");
	//private By BOX2Elem=By.xpath("/html/body/span/span/span[1]/input");

	private By Select_an_option3Elem=By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div[1]/div/div/div/table/tbody/tr[1]/td[11]/span/span[1]/span/span[1]/span");

	private By BOX2Elem= By.xpath("/html/body/span/span/span[1]/input");

      

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
	 * @throws InterruptedException 
     * @name Enter NDate
     */
 	public void Enter_NDate(String NDate) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(NDateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_NDate", "Enter_NDate failed. Unable to locate object: " + NDateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_NDate", "Enter_NDate failed. Unable to locate object: " + NDateElem.toString());

 			Assert.fail("Unable to locate object: " + NDateElem.toString());
         }
 		
 		//elem.sendKeys(Keys.ENTER);
 		WaitStatementLib wt=new WaitStatementLib();
		wt.explicitWait_elementToBeClickable(m_Driver, 20, elem);
 		
 		elem.sendKeys(NDate);
 		elem.sendKeys(Keys.TAB);
 		
 		
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

 		elem.sendKeys(Recived_amt);
 		
 		
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

 		elem.sendKeys(spnt_amt);
 			
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_spnt_amt " + spnt_amt);

  		TestModellerLogger.PassStep(m_Driver, "Enter_spnt_amt " + spnt_amt);
 	}

    
	/**
 	 * Select Select_VATRate
	 * @throws InterruptedException 
     * @name Select Select_VATRate
     */
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

      
	/**
 	 * Enter cal_amt
     * @name Enter cal_amt
     */
 	public void Enter_cal_amt(String cal_amt)
 	{
 	    
 		WebElement elem = getWebElement(cal_amtElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_cal_amt", "Enter_cal_amt failed. Unable to locate object: " + cal_amtElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_cal_amt", "Enter_cal_amt failed. Unable to locate object: " + cal_amtElem.toString());

 			Assert.fail("Unable to locate object: " + cal_amtElem.toString());
         }

 		elem.sendKeys(cal_amt);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_cal_amt " + cal_amt);

  		TestModellerLogger.PassStep(m_Driver, "Enter_cal_amt " + cal_amt);
 	}

     
	/**
 	 * Click Select_Option1
	 * @throws InterruptedException 
     * @name Click Select_Option1
     */
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
	//	m_Driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("1322 - Default Employee");
	//	m_Driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	Thread.sleep(5000);
    	
      		
	}

      
	/**
 	 * Enter BOX2
	 * @throws InterruptedException 
     * @name Enter BOX2
     */
 	public void Enter_BOX2(String BOX2) throws InterruptedException
 	{
 	    
 		//WebElement elem = getWebElement(BOX2Elem);

// 		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_BOX2", "Enter_BOX2 failed. Unable to locate object: " + BOX2Elem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_BOX2", "Enter_BOX2 failed. Unable to locate object: " + BOX2Elem.toString());
//
// 			Assert.fail("Unable to locate object: " + BOX2Elem.toString());
//         }
 	
 		
 		WebElement elem=m_Driver.findElement(By.xpath("//*[@id='select2-ctl00_cPH_rptRecord_ctl00_ltAccount-container']"));
 		WaitStatementLib wt=new WaitStatementLib();
		wt.explicitWait_elementToBeClickable(m_Driver, 20, elem);
		elem.click();
 		m_Driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(BOX2);
 		m_Driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);

// 	        //elem.sendKeys(BOX2);
// 	       // elem.sendKeys(Keys.ENTER);
// 	         String p =BOX2;
// 	         System.out.print("box2"   +p );
// 	        //m_Driver.findElement(By.xpath("//*[Contains(text(),'" +p+ "')]")).click();
// 	         ////*[contains(text(),'ABC')]
// 	         m_Driver.findElement(By.xpath("//*[contains(text(),'" +p+ "')]")).click();
// 	         Thread.sleep(1000);
 	        
// 	        WebDriverWait wait = new WebDriverWait(m_Driver, 10);
// 	       wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("INPUT[aria-autocomplete='list']"))).click();
 			
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
//		pages.PartialReconciledCases.Searchclient c =new pages.PartialReconciledCases.Searchclient(m_Driver);
//		//ClientSelect c = new ClientSelect(m_Driver);
//		Supplier_pages.SupplierBillSToFRS re= new Supplier_pages.SupplierBillSToFRS(m_Driver);
//		String client = c.client1();
//		
//		String Remv = re.vatrate1();
//		savemassg=client+Remv;
//		System.out.println("save"+savemassg);
//		Screenshotcapture.captureAsImage(m_Driver, savemassg);
//		 WebElement s=m_Driver.findElement(By.xpath("//*[@id='ctl00_divSubContent']/div[1]/div"));
//	     String transnno=s.getText();
//	     String arr[]=transnno.split(" ");
//	     String stn=arr[2];
//	      krno1=stn.substring(1);
//	    System.out.println("Transaction number is"    +krno1);	
//		ExtentReportManager.passStep(m_Driver, "Click__Save_");

	    TestModellerLogger.PassStep(m_Driver, "Click__Save_");
			                
			
	}
	
	public String confirmation() 
	{
		System.out.println("Confirmation "    +krno1);	
		return krno1;
		
		
	}
	
	public void Savemorebtn() throws InterruptedException
	{
		
		m_Driver.findElement(By.xpath("//*[@id='ctl00_cpHeaderRight_btnSave']")).click();
		Thread.sleep(6000);
	}

	}
	
