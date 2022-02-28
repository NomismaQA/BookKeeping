package pages.Receive_Payment;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/12901704-51ce-4ae3-8a49-646458988ec0
@TestModellerModule(guid = "12901704-51ce-4ae3-8a49-646458988ec0")
public class SDSearch extends BasePage
{
	Dimension d = new Dimension(300,1080);
	String str,str3,str2;
	public SDSearch (WebDriver driver)
	{
		super(driver);
	}


	
	private By Sd_Search_Customer_1Elem = By.xpath("//label[normalize-space()= 'Customer:']/../div/select");

	private By Sd_Search_Category_2Elem = By.xpath("//*[@id='ctl00_cPHFilter_dd_Search']");

	private By Sd_Search_input_3Elem = By.xpath("//*[@id='ctl00_cPHFilter_txtSearch']");

	private By Sd_Search_paymentstatus_4Elem = By.xpath("//BUTTON[@title='UnPaid, Paid, Partially Paid']");

	private By Sd_Search__due_5Elem = By.xpath("//SELECT[@name='ctl00$cPHFilter$dd_due']");

	private By Sd_Search_DateFrom_6Elem = By.xpath("//INPUT[@name='ctl00$cPHFilter$txtDateFrom']");

	private By Sd_Search_DateTo_7Elem = By.xpath("//INPUT[@name='ctl00$cPHFilter$txtDateTo']");

	private By Sd_Search_Update_8Elem = By.xpath("//*[@id='btnSearch']");
			private By Download_CsvElem=By.xpath("//*[@id='ctl00_cPH_btnExportToExcel']/i");

	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=117421&CompanyCode=17084&IsFirstRequest=1");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=117421&CompanyCode=17084&IsFirstRequest=1");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=117421&CompanyCode=17084&IsFirstRequest=1");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=117421&CompanyCode=17084&IsFirstRequest=1";

        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=117421&CompanyCode=17084&IsFirstRequest=1")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

    
	/**
 	 * Select Sd_Search_Customer_1
     * @name Select Sd_Search_Customer_1
     */
    public void Select_Sd_Search_Customer_1(String Sd_Search_Customer_1)
 	{
 	    
 		WebElement elem = getWebElement(Sd_Search_Customer_1Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Sd_Search_Customer_1", "Select_Sd_Search_Customer_1 failed. Unable to locate object: " + Sd_Search_Customer_1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Sd_Search_Customer_1", "Select_Sd_Search_Customer_1 failed. Unable to locate object: " + Sd_Search_Customer_1Elem.toString());

 			Assert.fail("Unable to locate object: " + Sd_Search_Customer_1Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Sd_Search_Customer_1);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Sd_Search_Customer_1 " + Sd_Search_Customer_1);

 		TestModellerLogger.PassStep(m_Driver, "Select_Sd_Search_Customer_1 " + Sd_Search_Customer_1);
 	}

    
	/**
 	 * Select Sd_Search_Category_2
	 * @throws InterruptedException 
     * @name Select Sd_Search_Category_2
     */
    public void Select_Sd_Search_Category_2(String Sd_Search_Category_2) throws InterruptedException
 	{
	    
	WebElement elem = getWebElement(Sd_Search_Category_2Elem);
  
		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Sd_Search_Category_2", "Select_Sd_Search_Category_2 failed. Unable to locate object: " + Sd_Search_Category_2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Sd_Search_Category_2", "Select_Sd_Search_Category_2 failed. Unable to locate object: " + Sd_Search_Category_2Elem.toString());

 			Assert.fail("Unable to locate object: " + Sd_Search_Category_2Elem.toString());
         }
         elem.sendKeys(Sd_Search_Category_2);
         elem.sendKeys(Keys.TAB);
       
//         elem.sendKeys(Keys.ARROW_DOWN);
//         elem.sendKeys(Keys.ARROW_DOWN);
//         elem.sendKeys(Keys.ARROW_DOWN);
//         elem.sendKeys(Keys.ARROW_DOWN);
         
// 		Select dropdown = new Select(elem);
// 	
//
// 		dropdown.selectByVisibleText(Sd_Search_Category_2);
 	 		
 		ExtentReportManager.passStep(m_Driver, "Select_Sd_Search_Category_2 " + Sd_Search_Category_2);

 		TestModellerLogger.PassStep(m_Driver, "Select_Sd_Search_Category_2 " + Sd_Search_Category_2);
    	
   
 	}

      
	/**
 	 * Enter Sd_Search_input_3
	 * @throws InterruptedException 
     * @name Enter Sd_Search_input_3
     */
 	//public void Enter_Sd_Search_input_3(String Sd_Search_input_3)
public void Enter_Sd_Search_input_3() throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(Sd_Search_input_3Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Sd_Search_input_3", "Enter_Sd_Search_input_3 failed. Unable to locate object: " + Sd_Search_input_3Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Sd_Search_input_3", "Enter_Sd_Search_input_3 failed. Unable to locate object: " + Sd_Search_input_3Elem.toString());

 			Assert.fail("Unable to locate object: " + Sd_Search_input_3Elem.toString());
         }
 		
 		
	SaleInvoices si=new SaleInvoices(m_Driver);
	str=si.invoiceno();
		System.out.println("Search page get invoice no" +str);
 	//Thread.sleep(2000);
 		 		elem.sendKeys(str);
 		 		elem.click();
 		 		Thread.sleep(1000);
// 		
//  		ExtentReportManager.passStep(m_Driver, "Enter_Sd_Search_input_3 " + Sd_Search_input_3);
//
//  		TestModellerLogger.PassStep(m_Driver, "Enter_Sd_Search_input_3 " + Sd_Search_input_3);
 	}

     
	/**
 	 * Click Sd_Search_paymentstatus_4
     * @name Click Sd_Search_paymentstatus_4
     */
	public void Click_Sd_Search_paymentstatus_4()
	{
        
		WebElement elem = getWebElement(Sd_Search_paymentstatus_4Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Sd_Search_paymentstatus_4", "Click_Sd_Search_paymentstatus_4 failed. Unable to locate object: " + Sd_Search_paymentstatus_4Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Sd_Search_paymentstatus_4", "Click_Sd_Search_paymentstatus_4 failed. Unable to locate object: " + Sd_Search_paymentstatus_4Elem.toString());

			Assert.fail("Unable to locate object: " + Sd_Search_paymentstatus_4Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Sd_Search_paymentstatus_4");

		TestModellerLogger.PassStep(m_Driver, "Click_Sd_Search_paymentstatus_4");
	}

    
	/**
 	 * Select Sd_Search__due_5
     * @name Select Sd_Search__due_5
     */
    public void Select_Sd_Search__due_5(String Sd_Search__due_5)
 	{
 	    
 		WebElement elem = getWebElement(Sd_Search__due_5Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Sd_Search__due_5", "Select_Sd_Search__due_5 failed. Unable to locate object: " + Sd_Search__due_5Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Sd_Search__due_5", "Select_Sd_Search__due_5 failed. Unable to locate object: " + Sd_Search__due_5Elem.toString());

 			Assert.fail("Unable to locate object: " + Sd_Search__due_5Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Sd_Search__due_5);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Sd_Search__due_5 " + Sd_Search__due_5);

 		TestModellerLogger.PassStep(m_Driver, "Select_Sd_Search__due_5 " + Sd_Search__due_5);
 	}

      
	/**
 	 * Enter Sd_Search_DateFrom_6
     * @name Enter Sd_Search_DateFrom_6
     */
 	public void Enter_Sd_Search_DateFrom_6(String Sd_Search_DateFrom_6)
 	{
 	    
 		WebElement elem = getWebElement(Sd_Search_DateFrom_6Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Sd_Search_DateFrom_6", "Enter_Sd_Search_DateFrom_6 failed. Unable to locate object: " + Sd_Search_DateFrom_6Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Sd_Search_DateFrom_6", "Enter_Sd_Search_DateFrom_6 failed. Unable to locate object: " + Sd_Search_DateFrom_6Elem.toString());

 			Assert.fail("Unable to locate object: " + Sd_Search_DateFrom_6Elem.toString());
         }

 		elem.sendKeys(Sd_Search_DateFrom_6);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Sd_Search_DateFrom_6 " + Sd_Search_DateFrom_6);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Sd_Search_DateFrom_6 " + Sd_Search_DateFrom_6);
 	}

      
	/**
 	 * Enter Sd_Search_DateTo_7
     * @name Enter Sd_Search_DateTo_7
     */
 	public void Enter_Sd_Search_DateTo_7(String Sd_Search_DateTo_7)
 	{
 	    
 		WebElement elem = getWebElement(Sd_Search_DateTo_7Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Sd_Search_DateTo_7", "Enter_Sd_Search_DateTo_7 failed. Unable to locate object: " + Sd_Search_DateTo_7Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Sd_Search_DateTo_7", "Enter_Sd_Search_DateTo_7 failed. Unable to locate object: " + Sd_Search_DateTo_7Elem.toString());

 			Assert.fail("Unable to locate object: " + Sd_Search_DateTo_7Elem.toString());
         }

 		elem.sendKeys(Sd_Search_DateTo_7);
 	
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Sd_Search_DateTo_7 " + Sd_Search_DateTo_7);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Sd_Search_DateTo_7 " + Sd_Search_DateTo_7);
 	}

     
	/**
 	 * Click Sd_Search_Update_8
	 * @throws InterruptedException 
     * @name Click Sd_Search_Update_8
     */
	public void Click_Sd_Search_Update_8() throws InterruptedException
	{
        
		WebElement elem = getWebElement(Sd_Search_Update_8Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Sd_Search_Update_8", "Click_Sd_Search_Update_8 failed. Unable to locate object: " + Sd_Search_Update_8Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Sd_Search_Update_8", "Click_Sd_Search_Update_8 failed. Unable to locate object: " + Sd_Search_Update_8Elem.toString());

			Assert.fail("Unable to locate object: " + Sd_Search_Update_8Elem.toString());
        }

		  elem.click();
      	Thread.sleep(1000);
      //  m_Driver.manage().window().setSize(d);
        
//          	/*click on 3 dots*/
          //	m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_filtrec']/div/div/table/tbody/tr[1]/td[15]")).click();
//		m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_filtrec'/div/div/table/tbody/tr[1]/td[15]/div/a")).click();
          //  Thread.sleep(1000);
		ExtentReportManager.passStep(m_Driver, "Click_Sd_Search_Update_8");

		TestModellerLogger.PassStep(m_Driver, "Click_Sd_Search_Update_8");
	}
	public void Enter_Credit_Search_input_3() throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(Sd_Search_input_3Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Sd_Search_input_3", "Enter_Sd_Search_input_3 failed. Unable to locate object: " + Sd_Search_input_3Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Sd_Search_input_3", "Enter_Sd_Search_input_3 failed. Unable to locate object: " + Sd_Search_input_3Elem.toString());

 			Assert.fail("Unable to locate object: " + Sd_Search_input_3Elem.toString());
         }
 		
 		
	SaleInvoices si=new SaleInvoices(m_Driver);
	str2=si.creditnum_capture();
		System.out.println("Search page get invoice no" +str2);
 	Thread.sleep(2000);
 		 		elem.sendKeys(str2);
 		 		
 		 		
 		 		
 	
 	
 		
// 		
//  		ExtentReportManager.passStep(m_Driver, "Enter_Sd_Search_input_3 " + Sd_Search_input_3);
//
//  		TestModellerLogger.PassStep(m_Driver, "Enter_Sd_Search_input_3 " + Sd_Search_input_3);
 	}
	public void Click_credit_Update_8() throws InterruptedException
	{
        
		WebElement elem = getWebElement(Sd_Search_Update_8Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Sd_Search_Update_8", "Click_Sd_Search_Update_8 failed. Unable to locate object: " + Sd_Search_Update_8Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Sd_Search_Update_8", "Click_Sd_Search_Update_8 failed. Unable to locate object: " + Sd_Search_Update_8Elem.toString());

			Assert.fail("Unable to locate object: " + Sd_Search_Update_8Elem.toString());
        }

		elem.click();
          	Thread.sleep(1000);
          	//m_Driver.manage().window().setSize(d);
          	utilities.PassScreenshot.Getscreenshot11("search grid","Credit Number" );
          	Thread.sleep(1000);
          	/*click on 3 dots for credit payment*/
          	 WebElement elem2=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_filtrec']/div/div/table/tbody/tr[1]/td[15]"));
          	 elem2.click();
          
		ExtentReportManager.passStep(m_Driver, "Click_Sd_Search_Update_8");

		TestModellerLogger.PassStep(m_Driver, "Click_Sd_Search_Update_8");
	}
	public void download_CsvElem()
	{
		
		
		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_btnExportToExcel']/i"));
		elem.click();
		
		
		
		
	}
	
	
	public void Enter_VALTONLYINV_Search_input_3() throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(Sd_Search_input_3Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Sd_Search_input_3", "Enter_Sd_Search_input_3 failed. Unable to locate object: " + Sd_Search_input_3Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Sd_Search_input_3", "Enter_Sd_Search_input_3 failed. Unable to locate object: " + Sd_Search_input_3Elem.toString());

 			Assert.fail("Unable to locate object: " + Sd_Search_input_3Elem.toString());
         }
 		
 		
	SaleInvoices si=new SaleInvoices(m_Driver);
	str3=si.vatonlyinvoicereturn();
		System.out.println("Search page get invoice no" +str3);
 	Thread.sleep(2000);
 		 		elem.sendKeys(str3);
 		 		
	
}
	
	 
    public void transaction_click() throws InterruptedException
    {
    	
    	WebElement elem=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrDisplayRecords_ctl00_lnkTranDetail']"));
    	jsExec.executeScript("arguments[0].click()",elem);
    	
    	Thread.sleep(1000);
    	
    
    }
    public void griddata_click() throws InterruptedException
    {
    	m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_filtrec']/div/div/table/tbody/tr[1]/td[15]")).click();
        Thread.sleep(1000);
    }
	
}