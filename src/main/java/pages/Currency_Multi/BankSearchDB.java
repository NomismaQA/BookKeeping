package pages.Currency_Multi;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/98cf4146-1204-4eda-a52f-78070baeb4ff
@TestModellerModule(guid = "98cf4146-1204-4eda-a52f-78070baeb4ff")
public class BankSearchDB extends BasePage
{
	  public static String krno1;
	public static String Nub;
	public BankSearchDB (WebDriver driver)
	{
		super(driver);
	}

	
	private By Search_bnk_nameElem = By.xpath("//label[normalize-space()= 'Bank name']/../div/select");

	private By Searach_catElem = By.xpath("//label[normalize-space()= 'Search category']/../div/select");

	private By Search_Enter_SearchnoElem = By.xpath("//label[normalize-space()= 'Search category']/../div/input");

	private By search_years_monthElem = By.xpath("//label[normalize-space()= 'Month']/../div/select");

	private By date_range_FromElem = By.xpath("//label[normalize-space()= 'Date range']/../div/input[1]");

	private By date_range_ToElem = By.xpath("//label[normalize-space()= 'Date range']/../div/input[2]");

	private By Search_Update__ClickElem = By.xpath("//A[@id='ctl00_cPHFilter_btnSearch']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AccountUI/BankTran.aspx?FYCode=117199&CompanyCode=16862&IsFirstRequest=1");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/BankTran.aspx?FYCode=117199&CompanyCode=16862&IsFirstRequest=1");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/BankTran.aspx?FYCode=117199&CompanyCode=16862&IsFirstRequest=1");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void confirmationmsg()
    {
	   WebElement s=m_Driver.findElement(By.xpath("//*[@id='ctl00_divSubContent']/div[1]/div"));
	   String Ts=s.getText();
		     
	     System.out.println("Transaction number is="    +Ts);	
   
        String[] arr = Ts.split(" ");
	        String stn=arr[2];
        krno1=stn.substring(1);
        System.out.println("substring no is:"    +krno1);	
	    
	    
		ExtentReportManager.passStep(m_Driver, "Click__Save_");

	    TestModellerLogger.PassStep(m_Driver, "Click__Save_");
	   // GetScreenShot.captureAsImage(m_Driver, stn);
    }

    
	/**
 	 * Select Search_bnk_name
     * @name Select Search_bnk_name
     */
    public void Select_Search_bnk_name(String Search_bnk_name)
 	{
 	    
 		WebElement elem = getWebElement(Search_bnk_nameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Search_bnk_name", "Select_Search_bnk_name failed. Unable to locate object: " + Search_bnk_nameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Search_bnk_name", "Select_Search_bnk_name failed. Unable to locate object: " + Search_bnk_nameElem.toString());

 			Assert.fail("Unable to locate object: " + Search_bnk_nameElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Search_bnk_name);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Search_bnk_name " + Search_bnk_name);

 		TestModellerLogger.PassStep(m_Driver, "Select_Search_bnk_name " + Search_bnk_name);
 	}

    
	/**
 	 * Select Searach_cat
     * @name Select Searach_cat
     */
    public void Select_Searach_cat(String Searach_cat)
 	{
 	    
 		WebElement elem = getWebElement(Searach_catElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Searach_cat", "Select_Searach_cat failed. Unable to locate object: " + Searach_catElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Searach_cat", "Select_Searach_cat failed. Unable to locate object: " + Searach_catElem.toString());

 			Assert.fail("Unable to locate object: " + Searach_catElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Searach_cat);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Searach_cat " + Searach_cat);

 		TestModellerLogger.PassStep(m_Driver, "Select_Searach_cat " + Searach_cat);
 	}

      
	/**
 	 * Enter Search_Enter_Searchno
     * @name Enter Search_Enter_Searchno
     */
 	public void Enter_Search_Enter_Searchno()
 	{
 	    
 		WebElement elem = getWebElement(Search_Enter_SearchnoElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Search_Enter_Searchno", "Enter_Search_Enter_Searchno failed. Unable to locate object: " + Search_Enter_SearchnoElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Search_Enter_Searchno", "Enter_Search_Enter_Searchno failed. Unable to locate object: " + Search_Enter_SearchnoElem.toString());

 			Assert.fail("Unable to locate object: " + Search_Enter_SearchnoElem.toString());
         }

 		
	//	System.out.println("refernce no received =" +Nub);
		
	elem.sendKeys(krno1);
// 		
// 		
  		//ExtentReportManager.passStep(m_Driver, "Enter_Search_Enter_Searchno " + _Search_Enter_Searchno);

 		//TestModellerLogger.PassStep(m_Driver, "Enter_Search_Enter_Searchno " + _Search_Enter_Searchno);
 	}

    
	/**
 	 * Select search_years_month
     * @name Select search_years_month
     */
    public void Select_search_years_month(String search_years_month)
 	{
 	    
 		WebElement elem = getWebElement(search_years_monthElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_search_years_month", "Select_search_years_month failed. Unable to locate object: " + search_years_monthElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_search_years_month", "Select_search_years_month failed. Unable to locate object: " + search_years_monthElem.toString());

 			Assert.fail("Unable to locate object: " + search_years_monthElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(search_years_month);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_search_years_month " + search_years_month);

 		TestModellerLogger.PassStep(m_Driver, "Select_search_years_month " + search_years_month);
 	}

      
	/**
 	 * Enter date_range_From
     * @name Enter date_range_From
     */
 	public void Enter_date_range_From(String date_range_From)
 	{
 	    
 		WebElement elem = getWebElement(date_range_FromElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_date_range_From", "Enter_date_range_From failed. Unable to locate object: " + date_range_FromElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_date_range_From", "Enter_date_range_From failed. Unable to locate object: " + date_range_FromElem.toString());

 			Assert.fail("Unable to locate object: " + date_range_FromElem.toString());
         }

 		elem.sendKeys(date_range_From);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_date_range_From " + date_range_From);

  		TestModellerLogger.PassStep(m_Driver, "Enter_date_range_From " + date_range_From);
 	}

      
	/**
 	 * Enter date_range_To
     * @name Enter date_range_To
     */
 	public void Enter_date_range_To(String date_range_To)
 	{
 	    
 		WebElement elem = getWebElement(date_range_ToElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_date_range_To", "Enter_date_range_To failed. Unable to locate object: " + date_range_ToElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_date_range_To", "Enter_date_range_To failed. Unable to locate object: " + date_range_ToElem.toString());

 			Assert.fail("Unable to locate object: " + date_range_ToElem.toString());
         }

 		elem.sendKeys(date_range_To);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_date_range_To " + date_range_To);

  		TestModellerLogger.PassStep(m_Driver, "Enter_date_range_To " + date_range_To);
 	}

     
	/**
 	 * Click Search_Update _Click
	 * @throws InterruptedException 
     * @name Click Search_Update _Click
     */
	public void Click_Search_Update__Click() throws InterruptedException
	{
        
		WebElement elem = getWebElement(Search_Update__ClickElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Search_Update__Click", "Click_Search_Update__Click failed. Unable to locate object: " + Search_Update__ClickElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Search_Update__Click", "Click_Search_Update__Click failed. Unable to locate object: " + Search_Update__ClickElem.toString());

			Assert.fail("Unable to locate object: " + Search_Update__ClickElem.toString());
        }

		//elem.click();
jsExec.executeScript("arguments[0].click()",elem);
          	Thread.sleep(3000);

		ExtentReportManager.passStep(m_Driver, "Click_Search_Update__Click");

		TestModellerLogger.PassStep(m_Driver, "Click_Search_Update__Click");
	}
}