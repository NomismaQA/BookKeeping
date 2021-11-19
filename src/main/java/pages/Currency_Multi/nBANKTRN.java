package pages.Currency_Multi;

import pages.BasePage;
import pages.Library;
import pages.SaleCreditNote;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
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
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.GetScreenShot;
import utilities.testmodeller.TestModellerLogger;

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/a226b6d2-34bc-4f26-b18a-f50616deb4ed
@TestModellerModule(guid = "a226b6d2-34bc-4f26-b18a-f50616deb4ed")
public class nBANKTRN extends BasePage
{
     public static String krno1;
     
	public nBANKTRN (WebDriver driver)
	{
		super(driver);
	}
	

	private By BK_SELECTElem = By.xpath("//*[@id='ctl00_cPH_ddlAccount']");
	
	//private By BK_SELECTElem=By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div/div/div/div/div/div/div/select");
	////*[@id="ctl00_cPH_ddlAccount"];
	private By NDateElem = By.xpath("//INPUT[@id='ctl00_cPH_rptRecord_ctl00_txtDate']");

	private By n_descElem = By.cssSelector("INPUT[id='ctl00_cPH_rptRecord_ctl00_txtDescription']");
	
	private By Recived_amtElem = By.xpath("//INPUT[@id='ctl00_cPH_rptRecord_ctl00_txtDbAmount']");

	private By spnt_amtElem = By.cssSelector("INPUT[id='ctl00_cPH_rptRecord_ctl00_txtAmount']");

	private By Select_VATRateElem = By.xpath("//SELECT[@id='ctl00_cPH_rptRecord_ctl00_ddVATRate']");

	private By cal_amtElem = By.xpath("//INPUT[@id='ctl00_cPH_rptRecord_ctl00_ltVATAmount']");

	private By Select_Option1Elem = By.xpath("//*[@id='select2-ctl00_cPH_rptRecord_ctl00_ltAccount-container']");
	
	private By BOX2Elem= By.xpath("/html/body/span/span/span[1]/input");
	
	private By amt_gbpElem = By.xpath("//TD[@class='text-center ExchangeRateColumn el-selection']");

	private By GBPElem = By.xpath("//INPUT[@name='ctl00$cPH$rptRecord$ctl00$txtAmountGBP']");

	private By ExchangeRateElem = By.xpath("//INPUT[@name='ctl00$cPH$rptRecord$ctl00$txtExchangeRate']");

      

	private By _Save_Elem = By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div/a[1]");
	
	public void GoToUrl()
	{
	
		m_Driver.get("	http://sandbox3.nomismasolution.co.uk/AccountUI/BankTranEditor.aspx?FYCode=116996&CompanyCode=16673&menuid=0");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL -	http://sandbox3.nomismasolution.co.uk/AccountUI/BankTranEditor.aspx?FYCode=116996&CompanyCode=16673&menuid=0");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL -	http://sandbox3.nomismasolution.co.uk/AccountUI/BankTranEditor.aspx?FYCode=116996&CompanyCode=16673&menuid=0");
	}
   
	/**
 	 * Select BK_SELECT
	 * @throws InterruptedException 
	 * @throws IOException 
     * @name Select BK_SELECT
     */
    public void Select_BK_SELECT(String BK_SELECT) throws InterruptedException, IOException
 	{
 	    
 		WebElement elem = getWebElement(BK_SELECTElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_BK_SELECT", "Select_BK_SELECT failed. Unable to locate object: " + BK_SELECTElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_BK_SELECT", "Select_BK_SELECT failed. Unable to locate object: " + BK_SELECTElem.toString());

 			Assert.fail("Unable to locate object: " + BK_SELECTElem.toString());
         }
 		   Select dropdown = new Select(elem);

			dropdown.selectByVisibleText(BK_SELECT);
 
 	
 		
 		GetScreenShot.captureAsImage(m_Driver, BK_SELECT);
 		
 		ExtentReportManager.passStep(m_Driver, "Select_BK_SELECT " + BK_SELECT);

 		TestModellerLogger.PassStep(m_Driver, "Select_BK_SELECT " + BK_SELECT);
 		
 		//elem.sendKeys(Keys.TAB); 		
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
 		elem.sendKeys(NDate);
 		 		
 		elem.sendKeys(Keys.TAB); 	
  		ExtentReportManager.passStep(m_Driver, "Enter_NDate " + NDate);

  		TestModellerLogger.PassStep(m_Driver, "Enter_NDate " + NDate);
 	}

      
	/**
 	 * Enter n_desc
	 * @throws InterruptedException 
     * @name Enter n_desc
     */
 	public void Enter_n_desc(String n_desc) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(n_descElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_n_desc", "Enter_n_desc failed. Unable to locate object: " + n_descElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_n_desc", "Enter_n_desc failed. Unable to locate object: " + n_descElem.toString());

 			Assert.fail("Unable to locate object: " + n_descElem.toString());
         }

 		elem.sendKeys(n_desc);
 		elem.sendKeys(Keys.TAB); 	
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_n_desc " + n_desc);

  		TestModellerLogger.PassStep(m_Driver, "Enter_n_desc " + n_desc);
 	}

      
	/**
 	 * Enter Recived_amt
	 * @throws InterruptedException 
     * @name Enter Recived_amt
     */
 	public void Enter_Recived_amt(String Recived_amt) throws InterruptedException
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
  		//elem.sendKeys(Keys.TAB); 	
 	}

      
	/**
 	 * Enter spnt_amt
	 * @throws InterruptedException 
     * @name Enter spnt_amt
     */
 	public void Enter_spnt_amt(String spnt_amt) throws InterruptedException
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
  		//elem.sendKeys(Keys.TAB); 	
 	}
 	/**
 	 * Click amt_gbp
     * @name Click amt_gbp
     */
	public void Click_amt_gbp()
	{
        
		WebElement elem = getWebElement(amt_gbpElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_amt_gbp", "Click_amt_gbp failed. Unable to locate object: " + amt_gbpElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_amt_gbp", "Click_amt_gbp failed. Unable to locate object: " + amt_gbpElem.toString());

			Assert.fail("Unable to locate object: " + amt_gbpElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_amt_gbp");

		TestModellerLogger.PassStep(m_Driver, "Click_amt_gbp");
	}

      
	/**
 	 * Enter GBP
	 * @throws InterruptedException 
	 * @throws IOException 
     * @name Enter GBP
     */
 	public void Enter_GBP(String GBP) throws InterruptedException, IOException
 	{
 	    
 		WebElement elem = getWebElement(GBPElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_GBP", "Enter_GBP failed. Unable to locate object: " + GBPElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_GBP", "Enter_GBP failed. Unable to locate object: " + GBPElem.toString());

 			Assert.fail("Unable to locate object: " + GBPElem.toString());
         }

 		elem.sendKeys(GBP);
 		
 		
 		  String GBP1=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtAmountGBP']")).getText();
	    	String exrt=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtExchangeRate']")).getText();
	 		String VTRate=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_ltVATAmount']")).getText();
	 		GetScreenShot.captureAsImage(m_Driver,GBP1);
	 		GetScreenShot.captureAsImage(m_Driver,exrt);
	 		GetScreenShot.captureAsImage(m_Driver,VTRate);
	 		System.out.println("GBP=" +GBP);
	 		System.out.println("VTRate:=" +VTRate);
	 		System.out.println("exchange Rate:=" +exrt);
  		ExtentReportManager.passStep(m_Driver, "Enter_GBP " + GBP);

  		TestModellerLogger.PassStep(m_Driver, "Enter_GBP " + GBP);
 	}

      
	/**
 	 * Enter ExchangeRate
     * @name Enter ExchangeRate
     */
 	public void Enter_ExchangeRate(String ExchangeRate)
 	{
 	    
 		WebElement elem = getWebElement(ExchangeRateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ExchangeRate", "Enter_ExchangeRate failed. Unable to locate object: " + ExchangeRateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ExchangeRate", "Enter_ExchangeRate failed. Unable to locate object: " + ExchangeRateElem.toString());

 			Assert.fail("Unable to locate object: " + ExchangeRateElem.toString());
         }

 		elem.sendKeys(ExchangeRate);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ExchangeRate " + ExchangeRate);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ExchangeRate " + ExchangeRate);
 	}
    
	/**
 	 * Select Select_VATRate
	 * @throws InterruptedException 
	 * @throws IOException 
     * @name Select Select_VATRate
     */
    public void Select_Select_VATRate(String Select_VATRate) throws InterruptedException, IOException
 	{
 	    
 		WebElement elem = getWebElement(Select_VATRateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Select_VATRate", "Select_Select_VATRate failed. Unable to locate object: " + Select_VATRateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Select_VATRate", "Select_Select_VATRate failed. Unable to locate object: " + Select_VATRateElem.toString());

 			Assert.fail("Unable to locate object: " + Select_VATRateElem.toString());
         }
 	
 		System.out.println("vat selected");
 	
		Select dropdown = new Select(elem);
		
 		dropdown.selectByVisibleText(Select_VATRate);
 		
 		
 		
 	
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Select_VATRate " + Select_VATRate);

 		TestModellerLogger.PassStep(m_Driver, "Select_Select_VATRate " + Select_VATRate);
 		
 	
 	}

      
	/**
 	 * Enter cal_amt
	 * @throws InterruptedException 
     * @name Enter cal_amt
     */
 	public void Enter_cal_amt(String cal_amt) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(cal_amtElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_cal_amt", "Enter_cal_amt failed. Unable to locate object: " + cal_amtElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_cal_amt", "Enter_cal_amt failed. Unable to locate object: " + cal_amtElem.toString());

 			Assert.fail("Unable to locate object: " + cal_amtElem.toString());
         }

 		elem.sendKeys(cal_amt);
 		System.out.println("amount:=");
 		
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
	
	elem.click();
	Thread.sleep(1000);
    	
      		
	}

      
	/**
 	 * Enter BOX2
	 * @throws InterruptedException 
	 * @throws IOException 
     * @name Enter BOX2
     */
 	public void Enter_BOX2(String BOX2) throws InterruptedException, IOException
 	{
 	      String p =BOX2;
 	         System.out.print("box2"   +p );
 	    
 	         m_Driver.findElement(By.xpath("//*[contains(text(),'" +p+ "')]")).click();
 	         Thread.sleep(2000);
 	         
 	      
 			
 	}

    
	/**
 	 * Click  Save 
	 * @throws InterruptedException 
	 * @throws IOException 
     * @name Click  Save 
     */
	public void Click__Save_() throws InterruptedException, IOException
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
	}
	public void Click__newSave_1() throws InterruptedException
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
		 WebElement s=m_Driver.findElement(By.xpath("//*[@id='ctl00_divSubContent']/div[1]/div"));
	     String transnno=s.getText();
	     String arr[]=transnno.split(" ");
	     String stn=arr[2];
	      krno1=stn.substring(1);
	    System.out.println("nidhi Transaction number is"    +krno1);	
	 
		ExtentReportManager.passStep(m_Driver, "Click__Save_");

	    TestModellerLogger.PassStep(m_Driver, "Click__Save_");
			       
			
	}
	
	public static String confirmation() 
	{
		System.out.println("Confirmation "    +krno1);	
		return krno1;
		
		
	}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	      
//		
	}