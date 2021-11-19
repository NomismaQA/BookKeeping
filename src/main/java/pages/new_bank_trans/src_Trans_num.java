package pages.new_bank_trans;

import pages.BasePage;

import javax.swing.text.TabableView;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.PassScreenshot;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.GetScreenShot;
import utilities.testmodeller.TestModellerLogger;
import pages.nBANKTRN;

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/6a9a7248-1b26-4de8-9315-155fa569a810
@TestModellerModule(guid = "6a9a7248-1b26-4de8-9315-155fa569a810")
public class src_Trans_num extends BasePage
{
	public src_Trans_num (WebDriver driver)
	{
		super(driver);
	}
	
	///html/body/form/main/div[5]/div[3]/div/div[3]/div/div/table/tbody/tr[2]/td[1]/span

	//private By Sbnk_actElem = By.xpath("//SELECT[@id='ctl00_cPHFilter_ddlAccount']");

	private By Sbnk_actElem =By.xpath("//*[@id='ctl00_cPHFilter_ddlAccount']");

	private By Search_categoryElem = By.xpath("//SELECT[@id='ctl00_cPHFilter_dd_Search']");

	private By Enter_codeElem = By.xpath("//INPUT[@placeholder='Enter Text']");

	private By Select_MonthsElem = By.xpath("//SELECT[@id='ctl00_cPHFilter_ddlMonths']");

	private By DATE_TOElem = By.xpath("//INPUT[@name='ctl00$cPHFilter$txtDateFrom']");

	private By Date_FromElem = By.xpath("//INPUT[@id='ctl00_cPHFilter_txtDateTo']");

	private By Update_btnElem = By.xpath("//A[contains(text(),'Update')]");

	private By _39Elem = By.xpath("//A[@id='ctl00_cPH_rptrDisplayRecords_ctl01_LnkTranDetail']");

	//"ctl00_cPHFilter_btnSearchprivate By _UnreconciledElem = By.xpath("//TD[@class='text-left']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AccountUI/BankTran.aspx?FYCode=52444&CompanyCode=13236&IsFirstRequest=1");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/BankTran.aspx?FYCode=52444&CompanyCode=13236&IsFirstRequest=1");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/BankTran.aspx?FYCode=52444&CompanyCode=13236&IsFirstRequest=1");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
//   public void AssertUrl()
//    {
//        String currentUrl = m_Driver.getCurrentUrl();
//        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AccountUI/BankTran.aspx?FYCode=52444&CompanyCode=13236&IsFirstRequest=1";
//
//        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AccountUI/BankTran.aspx?FYCode=52444&CompanyCode=13236&IsFirstRequest=1")) {
//            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
//        }
//    }

    
	/**
 	 * Select Sbnk_act
     * @name Select Sbnk_act
     */
    public void Select_Sbnk_act(String Sbnk_act)
 	{
 	    
 		WebElement elem = getWebElement(Sbnk_actElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Sbnk_act", "Select_Sbnk_act failed. Unable to locate object: " + Sbnk_actElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Sbnk_act", "Select_Sbnk_act failed. Unable to locate object: " + Sbnk_actElem.toString());

 			Assert.fail("Unable to locate object: " + Sbnk_actElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Sbnk_act);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Sbnk_act " + Sbnk_act);

 		TestModellerLogger.PassStep(m_Driver, "Select_Sbnk_act " + Sbnk_act);
 	}

    
	/**
 	 * Select Search_category
	 * @throws InterruptedException 
     * @name Select Search_category
     */
    public void Select_Search_category(String Search_category) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(Search_categoryElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Search_category", "Select_Search_category failed. Unable to locate object: " + Search_categoryElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Search_category", "Select_Search_category failed. Unable to locate object: " + Search_categoryElem.toString());

 			Assert.fail("Unable to locate object: " + Search_categoryElem.toString());
         }

 		Select dropdown = new Select(elem);
 	      
 		dropdown.selectByVisibleText("Transaction No");
			
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Search_category " + Search_category);

 		TestModellerLogger.PassStep(m_Driver, "Select_Search_category " + Search_category);
 	}

      
	/**
 	 * Enter Enter_code
	 * @throws InterruptedException 
     * @name Enter Enter_code
     */
 	public void Enter_Enter_code(String Enter_code ) throws InterruptedException
 	{
 	    
	WebElement elem = getWebElement(Enter_codeElem);

		if (elem == null) 
		{
   		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_code", "Enter_Enter_code failed. Unable to locate object: " + Enter_codeElem.toString());
   		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_code", "Enter_Enter_code failed. Unable to locate object: " + Enter_codeElem.toString());
			Assert.fail("Unable to locate object: " + Enter_codeElem.toString());
         }
   // m_Driver.findElement(By.xpath("//*[@id='ctl00_cPHFilter_btnSearch']")).clear();
// 		Thread.sleep(1000);
 		for(int ptr=1;ptr<13;ptr++)
 		{
 			elem.sendKeys(Keys.BACK_SPACE);
 		}
 		
		elem.sendKeys(Enter_code);
	
		elem.sendKeys(Keys.TAB);
		elem.sendKeys(Keys.TAB);
		elem.sendKeys(Keys.TAB);
		elem.sendKeys(Keys.TAB);
 		}
 		       
	/**
 	 * Enter DATE_TO
     * @name Enter DATE_TO
     */
 	public void Enter_DATE_TO(String DATE_TO)
 	{
 	    
 		WebElement elem = getWebElement(DATE_TOElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_DATE_TO", "Enter_DATE_TO failed. Unable to locate object: " + DATE_TOElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_DATE_TO", "Enter_DATE_TO failed. Unable to locate object: " + DATE_TOElem.toString());

 			Assert.fail("Unable to locate object: " + DATE_TOElem.toString());
         }

 		elem.sendKeys(DATE_TO);
 		elem.sendKeys(Keys.TAB);

		
  		ExtentReportManager.passStep(m_Driver, "Enter_DATE_TO " + DATE_TO);

  		TestModellerLogger.PassStep(m_Driver, "Enter_DATE_TO " + DATE_TO);
 	}
  
	/**
 	 * Enter Date_From
     * @name Enter Date_From
     */
 	public void Enter_Date_From(String Date_From)
 	{
 	 	WebElement elem = getWebElement(Date_FromElem);
 		if (elem == null) 
 		{
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Date_From", "Enter_Date_From failed. Unable to locate object: " + Date_FromElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Date_From", "Enter_Date_From failed. Unable to locate object: " + Date_FromElem.toString());

 			Assert.fail("Unable to locate object: " + Date_FromElem.toString());
         }
 	 		elem.sendKeys(Date_From);
 	 		ExtentReportManager.passStep(m_Driver, "Enter_Date_From " + Date_From);
 	 		TestModellerLogger.PassStep(m_Driver, "Enter_Date_From " + Date_From);
  		}
	/**
 	 * Click Update_btn
	 * @throws Exception 
	 * @name Click Update_btn
     */
	public void Click_Update_btn() throws Exception
	{

		WebElement update=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPHFilter_btnSearch']")));
		jsExec.executeScript("arguments[0].click()",update);

		Thread.sleep(1000);
		
//		m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrDisplayRecords_ctl01_LnkTranDetail']")).click();
//		
//	
//		m_Driver.findElement(By.xpath("//*[@id='EditPopUpClose']")).click();
//			GetScreenShot.captureAsImage(m_Driver,"poup");
		
		

	
	}
     
	/**
 	 * Click 39
     * @name Click 39
     */
	public void Click__39()
	{
        
		WebElement elem = getWebElement(_39Elem);

		elem.click();
		
		WebElement test=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrDisplayRecords_ctl01_LnkTranDetail']"));
          	
		
		ExtentReportManager.passStep(m_Driver, "Click__39");

		TestModellerLogger.PassStep(m_Driver, "Click__39");
	}
	}
     
	/**
 	 * Click  Unreconciled
     * @name Click  Unreconciled
     */
//	public void Click__Unreconciled()
//	{
//        
//		WebElement elem = getWebElement(_UnreconciledElem);
//
//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Unreconciled", "Click__Unreconciled failed. Unable to locate object: " + _UnreconciledElem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Unreconciled", "Click__Unreconciled failed. Unable to locate object: " + _UnreconciledElem.toString());
//
//			Assert.fail("Unable to locate object: " + _UnreconciledElem.toString());
//        }
//
//		elem.click();
//          	
//
//		ExtentReportManager.passStep(m_Driver, "Click__Unreconciled");
//
//		TestModellerLogger.PassStep(m_Driver, "Click__Unreconciled");
//	}


