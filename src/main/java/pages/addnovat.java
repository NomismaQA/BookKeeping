package pages;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/f15a5099-b1a1-4d57-8570-5ac7d4f0f7d5
@TestModellerModule(guid = "f15a5099-b1a1-4d57-8570-5ac7d4f0f7d5")
public class addnovat extends BasePage
{
	public addnovat (WebDriver driver)
	{
		super(driver);
	}

	//*[@id="ctl00_cPH_txtRate"]
	
	private By AddVatbtnElem = By.xpath("//*[@id='ctl00_cPH_tbContainer_TbVat_vatadd']");

	private By VAT_Status1Elem = By.xpath("//SELECT[@name='ctl00$cPH$ddVATStatus']");

	private By Effective_DateElem = By.xpath("//INPUT[@name='ctl00$cPH$txtDate']");

//	private By FlatrateBusinesscatElem = By.xpath("//SELECT[@name='ctl00$cPH$ddFlatRateType']");

	private By Flat_Rate_chkboxElem = By.xpath("//*[@id='ctl00_cPH_chkUseDefaultRate']");
	
	private By OverrideFLATRateElem = By.xpath("//*[@id='ctl00_cPH_txtRate']");

	private By btn_Save_1Elem = By.xpath("//A[@id='ctl00_cphFooter_btnSave']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AccountUI/CompanyInfo.aspx?FYCode=52444&CompanyCode=13236");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/CompanyInfo.aspx?FYCode=52444&CompanyCode=13236");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/CompanyInfo.aspx?FYCode=52444&CompanyCode=13236");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
//   public void AssertUrl()
//    {
//        String currentUrl = m_Driver.getCurrentUrl();
//        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AccountUI/CompanyInfo.aspx?FYCode=52444&CompanyCode=13236";
//
//        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AccountUI/CompanyInfo.aspx?FYCode=52444&CompanyCode=13236")) {
//            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
//        }
//    }

     
	/**
 	 * Click AddVatbtn
     * @name Click AddVatbtn
     */
	public void Click_AddVatbtn()
	{
        
		WebElement elem = getWebElement(AddVatbtnElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_AddVatbtn", "Click_AddVatbtn failed. Unable to locate object: " + AddVatbtnElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_AddVatbtn", "Click_AddVatbtn failed. Unable to locate object: " + AddVatbtnElem.toString());

			Assert.fail("Unable to locate object: " + AddVatbtnElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_AddVatbtn");

		TestModellerLogger.PassStep(m_Driver, "Click_AddVatbtn");
	}

    
	/**
 	 * Select VAT_Status1
	 * @throws InterruptedException 
     * @name Select VAT_Status1
     */
    public void Select_VAT_Status1(String VAT_Status1) throws InterruptedException
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[6]/div/div/div/div[2]/div[2]/div/div/div/div[2]/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(VAT_Status1Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_VAT_Status1", "Select_VAT_Status1 failed. Unable to locate object: " + VAT_Status1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_VAT_Status1", "Select_VAT_Status1 failed. Unable to locate object: " + VAT_Status1Elem.toString());

 			Assert.fail("Unable to locate object: " + VAT_Status1Elem.toString());
         }

 		
 		elem.sendKeys(Keys.ENTER);
 		Select dropdown = new Select(elem);
 			
 		System.out.println(VAT_Status1);
 		dropdown.selectByVisibleText(VAT_Status1);
 		Thread.sleep(2000);
 		
 		
 		
// 		Select dropdown = new Select(elem);
//
// 		dropdown.selectByVisibleText(VAT_Status1);
 		
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_VAT_Status1 " + VAT_Status1);

 		TestModellerLogger.PassStep(m_Driver, "Select_VAT_Status1 " + VAT_Status1);
 	}

      
	/**
 	 * Enter Effective_Date
	 * @throws InterruptedException 
     * @name Enter Effective_Date
     */
 	public void Enter_Effective_Date(String Effective_Date) throws InterruptedException
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[6]/div/div/div/div[2]/div[2]/div/div/div/div[2]/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Effective_DateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Effective_Date", "Enter_Effective_Date failed. Unable to locate object: " + Effective_DateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Effective_Date", "Enter_Effective_Date failed. Unable to locate object: " + Effective_DateElem.toString());

 			Assert.fail("Unable to locate object: " + Effective_DateElem.toString());
         }

// 		elem.sendKeys(Effective_Date);
// 		m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_CalendarExtender2_day_0_4']")).click();
// 		elem.sendKeys(Keys.ENTER);
// 		Thread.sleep(1000);
//		m_Driver.switchTo().defaultContent();
//
//		elem.sendKeys(Keys.DOWN);
		
		
 		for(int i=0;i<=9;i++)
 		{
			m_Driver.findElement(By.xpath("//INPUT[@name='ctl00$cPH$txtDate']")).sendKeys(Keys.BACK_SPACE);
 		}
		
 		elem.sendKeys(Effective_Date);
		m_Driver.findElement(By.xpath("//INPUT[@name='ctl00$cPH$txtDate']")).sendKeys(Keys.TAB);
		   m_Driver.switchTo().defaultContent();
				 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Effective_Date " + Effective_Date);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Effective_Date " + Effective_Date);
  		
  	    
 	}

    
	/**
 	 * Select FlatrateBusinesscat
     * @name Select FlatrateBusinesscat
     */
//    public void Select_FlatrateBusinesscat(String FlatrateBusinesscat)
// 	{
// 	    
//		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[6]/div/div/div/div[2]/div[2]/div/div/div/div[2]/div[2]/div/div/div[2]/iframe")));
//
// 		WebElement elem = getWebElement(FlatrateBusinesscatElem);
//
// 		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_FlatrateBusinesscat", "Select_FlatrateBusinesscat failed. Unable to locate object: " + FlatrateBusinesscatElem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_FlatrateBusinesscat", "Select_FlatrateBusinesscat failed. Unable to locate object: " + FlatrateBusinesscatElem.toString());
//
// 			Assert.fail("Unable to locate object: " + FlatrateBusinesscatElem.toString());
//         }
//
// 		Select dropdown = new Select(elem);
//
// 		dropdown.selectByVisibleText(FlatrateBusinesscat);
// 		
//		m_Driver.switchTo().defaultContent();
//
//		elem.sendKeys(Keys.DOWN);
// 		ExtentReportManager.passStep(m_Driver, "Select_FlatrateBusinesscat " + FlatrateBusinesscat);
//
// 		TestModellerLogger.PassStep(m_Driver, "Select_FlatrateBusinesscat " + FlatrateBusinesscat);
// 	}

     
	/**
 	 * Click Flat_Rate chkbox
	 * @throws InterruptedException 
     * @name Click Flat_Rate chkbox
     */
	public void Click_Flat_Rate_chkbox() throws InterruptedException
	{
        
	
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[6]/div/div/div/div[2]/div[2]/div/div/div/div[2]/div[2]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(Flat_Rate_chkboxElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Flat_Rate_chkbox", "Click_Flat_Rate_chkbox failed. Unable to locate object: " + Flat_Rate_chkboxElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Flat_Rate_chkbox", "Click_Flat_Rate_chkbox failed. Unable to locate object: " + Flat_Rate_chkboxElem.toString());

			Assert.fail("Unable to locate object: " + Flat_Rate_chkboxElem.toString());
        }

		//elem.click();
	
		jsExec.executeScript("arguments[0].click();", elem);
		m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_chkUseDefaultRate']")).click();
		   m_Driver.switchTo().defaultContent();
		//m_Driver.switchTo().defaultContent();
  	
		//elem.sendKeys(Keys.DOWN);
		ExtentReportManager.passStep(m_Driver, "Click_Flat_Rate_chkbox");

		TestModellerLogger.PassStep(m_Driver, "Click_Flat_Rate_chkbox");
	}
	public void Enter_OverrideFLATRate(String OverrideFLATRate)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[6]/div/div/div/div[2]/div[2]/div/div/div/div[4]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(OverrideFLATRateElem);
 			
 		System.out.println("123"+OverrideFLATRate);
 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_OverrideFLATRate", "Enter_OverrideFLATRate failed. Unable to locate object: " + OverrideFLATRateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_OverrideFLATRate", "Enter_OverrideFLATRate failed. Unable to locate object: " + OverrideFLATRateElem.toString());

 			Assert.fail("Unable to locate object: " + OverrideFLATRateElem.toString());
         }
         elem.clear();
 		
 		elem.sendKeys(Keys.BACK_SPACE);
 		elem.clear();
 		elem.sendKeys(OverrideFLATRate);
 		
 		//elem.sendKeys(Keys.BACK_SPACE);
 		//elem.sendKeys(OverrideFLATRate);
 		//elem.clear();
 		elem.sendKeys(OverrideFLATRate);
 				m_Driver.switchTo().defaultContent();
		Searchclient c = new Searchclient(m_Driver);
		String client = c.client1();
		String savnew=client+"VATTypeAfter";
  		ExtentReportManager.passStep(m_Driver, "Enter_OverrideFLATRate " + OverrideFLATRate);

  		TestModellerLogger.PassStep(m_Driver, "Enter_OverrideFLATRate " + OverrideFLATRate);
 	}
     
	/**
 	 * Click btn_Save 1
     * @name Click btn_Save 1
     */
	public void Click_btn_Save_1()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[6]/div/div/div/div[2]/div[2]/div/div/div/div[2]/div[2]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(btn_Save_1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_btn_Save_1", "Click_btn_Save_1 failed. Unable to locate object: " + btn_Save_1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_btn_Save_1", "Click_btn_Save_1 failed. Unable to locate object: " + btn_Save_1Elem.toString());

			Assert.fail("Unable to locate object: " + btn_Save_1Elem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_btn_Save_1");

		TestModellerLogger.PassStep(m_Driver, "Click_btn_Save_1");
	}
}