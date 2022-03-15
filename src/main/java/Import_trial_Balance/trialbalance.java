package Import_trial_Balance;

import pages.BasePage;
import pages.PartialReconciledCases.Library;

import static org.junit.Assert.assertEquals;

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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/d913fcd8-7780-4da3-8a26-7c430c7405ae
@TestModellerModule(guid = "d913fcd8-7780-4da3-8a26-7c430c7405ae")
public class trialbalance extends BasePage
{
	public trialbalance (WebDriver driver)
	{
		super(driver);
	}


	
	private By Advisortl1Elem = By.xpath("//BUTTON[@data-toggle='dropdown']");

	private By TrialbalanceEntry2Elem = By.xpath("//A[contains(text(),'Trial Balance Entry')]");

	private By ctl00cPHFileUpload_csv1Elem = By.xpath("//*[@id='FileUpload1']");

	private By Upload_button3Elem = By.xpath("//label[normalize-space()= '']/../div/input");

	private By Upload4Elem = By.xpath("//label[normalize-space()= '']/../div/input");

	private By LadgerCode5Elem = By.xpath("//SELECT[@name='ctl00$cPH$gvCSVColumn$ctl02$ddlMappedCol']");

	private By AccountName6Elem = By.xpath("//SELECT[@name='ctl00$cPH$gvCSVColumn$ctl03$ddlMappedCol']");

	private By Balance7Elem = By.xpath("//SELECT[@name='ctl00$cPH$gvCSVColumn$ctl04$ddlMappedCol']");
	
	private By Credit = By.xpath("//SELECT[@name='ctl00$cPH$gvCSVColumn$ctl04$ddlMappedCol']");
	
	private By Debit = By.xpath("//SELECT[@name='ctl00$cPH$gvCSVColumn$ctl05$ddlMappedCol']");

	private By Next8Elem = By.xpath("//A[@id='btnUpload']");

	private By Mas9Elem = By.xpath("//label[normalize-space()= 'Posting Date:']/../../../../../../../../div[1]/div");

	private By Addentry10Elem = By.xpath("//A[@id='ctl00_cPH_rptRecord_ctl01_lnkAdd']");

	private By RemoveEntry11Elem = By.xpath("//A[@id='ctl00_cPH_rptRecord_ctl02_lnkClear']");

	private By Import12Elem = By.xpath("//*[@id='ctl00_cpHFooter_btnImport']");

	private By Msg13Elem = By.xpath("//*[@id='divSubContent']/div[1]/div");
	
	private By Msg_Error = By.xpath("//*[@id='ltMessage']/div");

	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AccountUI/ImportTrialBalance.aspx?FYCode=117354&CompanyCode=17017");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/ImportTrialBalance.aspx?FYCode=117354&CompanyCode=17017");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/ImportTrialBalance.aspx?FYCode=117354&CompanyCode=17017");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/AccountUI/ImportTrialBalance.aspx?FYCode=117354&CompanyCode=17017";

        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/AccountUI/ImportTrialBalance.aspx?FYCode=117354&CompanyCode=17017")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click Advisortl1
     * @name Click Advisortl1
     */
	public void Click_Advisortl1()
	{
        
		WebElement elem = getWebElement(Advisortl1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Advisortl1", "Click_Advisortl1 failed. Unable to locate object: " + Advisortl1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Advisortl1", "Click_Advisortl1 failed. Unable to locate object: " + Advisortl1Elem.toString());

			Assert.fail("Unable to locate object: " + Advisortl1Elem.toString());
        }
jsExec.executeScript("arguments[0].click()", elem);
	//	//elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Advisortl1");

		TestModellerLogger.PassStep(m_Driver, "Click_Advisortl1");
	}

     
	/**
 	 * Click TrialbalanceEntry2
     * @name Click TrialbalanceEntry2
     */
	public void Click_TrialbalanceEntry2()
	{
        
		WebElement elem = getWebElement(TrialbalanceEntry2Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_TrialbalanceEntry2", "Click_TrialbalanceEntry2 failed. Unable to locate object: " + TrialbalanceEntry2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_TrialbalanceEntry2", "Click_TrialbalanceEntry2 failed. Unable to locate object: " + TrialbalanceEntry2Elem.toString());

			Assert.fail("Unable to locate object: " + TrialbalanceEntry2Elem.toString());
        }

		elem.click();
		Library.Switchwindow(3, m_Driver);

		ExtentReportManager.passStep(m_Driver, "Click_TrialbalanceEntry2");

		TestModellerLogger.PassStep(m_Driver, "Click_TrialbalanceEntry2");
	}

      
	/**
 	 * Enter ctl00$cPH$FileUpload_csv1
     * @name Enter ctl00$cPH$FileUpload_csv1
     */
 	public void Enter_ctl00cPHFileUpload_csv1(String ctl00cPHFileUpload_csv1)
 	{
 	    
 		WebElement elem = getWebElement(ctl00cPHFileUpload_csv1Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHFileUpload_csv1", "Enter_ctl00cPHFileUpload_csv1 failed. Unable to locate object: " + ctl00cPHFileUpload_csv1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHFileUpload_csv1", "Enter_ctl00cPHFileUpload_csv1 failed. Unable to locate object: " + ctl00cPHFileUpload_csv1Elem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHFileUpload_csv1Elem.toString());
         }

 		elem.sendKeys(ctl00cPHFileUpload_csv1);
 		
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHFileUpload_csv1 " + ctl00cPHFileUpload_csv1);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHFileUpload_csv1 " + ctl00cPHFileUpload_csv1);
 	}

     
	/**
 	 * Click Upload_button3
     * @name Click Upload_button3
     */
	public void Click_Upload_button3()
	{
        
		WebElement elem = getWebElement(Upload_button3Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Upload_button3", "Click_Upload_button3 failed. Unable to locate object: " + Upload_button3Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Upload_button3", "Click_Upload_button3 failed. Unable to locate object: " + Upload_button3Elem.toString());

			Assert.fail("Unable to locate object: " + Upload_button3Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Upload_button3");

		TestModellerLogger.PassStep(m_Driver, "Click_Upload_button3");
	}
	
	
	 public void Select_LadgerCode5(String LadgerCode5)
 	{
 	    
 		WebElement elem = getWebElement(LadgerCode5Elem);


 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(LadgerCode5);
 		
 	}
 		
    public void Select_AccountName6(String AccountName6)
 	{
 	    
 		WebElement elem = getWebElement(AccountName6Elem);

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(AccountName6);
 		
 		
 	
 	
 	}
    
    
    public void Select_Balance7(String Balance7)
 	{
 	    
 		WebElement elem = getWebElement(Balance7Elem);

 	
 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Balance7);
 		
 		
 	
 	}
    public void Select_Debit(String DR)
 	{
 	    
 		WebElement elem = getWebElement(Debit);

 	
 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(DR);
 		
 		
 	
 	}
    public void Select_Credit(String CR)
   	{
   	    
   		WebElement elem = getWebElement(Credit);

   	
   		Select dropdown = new Select(elem);

   		dropdown.selectByVisibleText(CR);
   		
   		
   	
   	}

 		
	public void Click_Next8() throws InterruptedException
	{
        
		WebElement elem = getWebElement(Next8Elem);

	
      Thread.sleep(2000);
		elem.click();
          	

		
	}
 		
 		
	public void Click_Mas9(String Actual) throws InterruptedException
	{
        
		WebElement elem = getWebElement(Mas9Elem);

	

		String Msg=elem.getText();
		System.out.println(Msg);
		
		Thread.sleep(2000);
		assertEquals(Msg, Actual);
          	System.out.println(Actual+" = "+Msg);
          	
		
	}
	
 		
	public void Add_RemoveEntry() throws InterruptedException
	{
        Thread.sleep(1000);
		WebElement elemA = getWebElement(Addentry10Elem);
		elemA.click();
		
		Thread.sleep(2000);
		
		WebElement elemR = getWebElement(RemoveEntry11Elem);
		elemR.click();
		
		Thread.sleep(2000);
		
		
		
		
		
		  m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl01_lnkAdd']/i")).click();
			
			
		m_Driver.findElement(By.xpath("//*[@id='select2-S-ctl00_cPH_rptRecord_ctl02_ltAccount-container']")).click();
		m_Driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("7400 - Accountancy, Bookkeeping and Auditing Fees");
		m_Driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		
		m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl02_txtDebit']")).sendKeys("1500");
		Thread.sleep(1000);
		m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl02_txtNote']")).sendKeys("Accountancy fee");
		Thread.sleep(1000);
m_Driver.findElement(By.xpath("//*[@id=\"ctl00_cPH_rptRecord_ctl02_lnkAdd\"]/i")).click();
Thread.sleep(2000);
m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl03_lnkClear']/i")).click();
Thread.sleep(1000);
m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl02_lnkClear']/i")).click();

Thread.sleep(2000);
Thread.sleep(1000);
		WebElement elemAA = getWebElement(Addentry10Elem);
		elemAA.click();
		
		Thread.sleep(2000);
		
		WebElement elemRR = getWebElement(RemoveEntry11Elem);
		elemRR.click();
		
		Thread.sleep(2000);

	}	
 		
	public void Click_Import12() throws InterruptedException
	{
        
		WebElement elem = getWebElement(Import12Elem);

		
		elem.click();
//		Thread.sleep(2000);
//		String msg=m_Driver.findElement(By.xpath("//*[@id='ctl00_divSubContent']/div[1]/div")).getText();
//		System.out.println(msg);
		
		
        }
	public void CancelBtn(String ActualDataCan) throws InterruptedException
	{
		

		WebElement CancelBtn=m_Driver.findElement(By.xpath("//*[@id=\"ctl00_cpHFooter_btnDelete\"]"));
		CancelBtn.click();
		
		m_Driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		WebElement elem = getWebElement(Msg13Elem);
		String Msg2=elem.getText();
		System.out.println(Msg2);
		Thread.sleep(2000);
	assertEquals(Msg2, ActualDataCan);
	System.out.println(Msg2+" = "+ActualDataCan);
	
	}
	
	public void Click_Msg13(String ActualData) throws InterruptedException
	{
        
		WebElement elem = getWebElement(Msg13Elem);

		

		String Msg2=elem.getText();
		System.out.println(Msg2);
		Thread.sleep(2000);
	//assertEquals(Msg2, ActualData);
	//System.out.println(Msg2+" = "+ActualData);
          	

	}
	
	public void Click_Msg_Error(String ActualData) throws InterruptedException
	{
        
		WebElement elem = getWebElement(Msg_Error);

		

		String Msg2=elem.getText();
		System.out.println(Msg2);
		Thread.sleep(2000);
	assertEquals(Msg2, ActualData);
	System.out.println(Msg2+" = "+ActualData);
          	

	}
	public void AllredyImportFile()
	{
	String	Msg=m_Driver.findElement(By.xpath("//*[@id='ltMessage']/div")).getText();
	System.out.println(Msg);
	}
	
	
	public void Debit2(String DR)
	{
		
		WebElement Debit=m_Driver.findElement(By.xpath("//Select[@name='ctl00$cPH$gvCSVColumn$ctl04$ddlMappedCol']"));
		

	 	
 		Select dropdown = new Select(Debit);

 		dropdown.selectByVisibleText(DR);
	}
	
	
	
	
}