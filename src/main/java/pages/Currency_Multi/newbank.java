package pages.Currency_Multi;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import pages.BasePage;
import pages.Library;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/216c2ad5-22ab-4c2d-99f2-1e59073b0892
@TestModellerModule(guid = "216c2ad5-22ab-4c2d-99f2-1e59073b0892")
public class newbank extends BasePage
{
	Library s1;
	public newbank (WebDriver driver)
	{
		super(driver);
		s1=new Library(m_Driver);
	}


	
	private By BankingElem = By.xpath("//LI[@id='ctl00_SideMenu1_bankingMenu']/A/SPAN[@class='side_nav_text']");

	private By New_Elem = By.xpath("//A[@class='text-white']");

	private By New_Bank_AccountElem = By.xpath("//A[text()='New Bank Account']");

	private By BankMasterElem = By.xpath("//label[normalize-space()= 'Bank Name*']/../../div[2]/select");

	private By BankAccountNameElem = By.xpath("//*[@id='ctl00_cPH_txtBankAccountName']");

	private By AccTypeElem = By.xpath("//*[@id='ctl00_cPH_dd_AccType']");

	private By AccNoElem = By.xpath("//*[@id='ctl00_cPH_txt_AccNo']");

	private By SortCodeElem = By.xpath("//INPUT[@name='ctl00$cPH$txt_SortCode']");

	private By AddressElem = By.xpath("//TEXTAREA[@name='ctl00$cPH$TxtAddress']");

	private By CurrencyElem = By.xpath("//SELECT[@name='ctl00$cPH$ddCurrency']");

	private By SaveElem = By.xpath("//A[text()='Save']");


	
	public void GoToUrl()
	{
		//m_Driver.get("http://sandbox4.nomismasolution.co.uk/AccountUI/BankTran.aspx?FYCode=52408&CompanyCode=13236&IsFirstRequest=1");
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AccountUI/BankTran.aspx?FYCode=52408&CompanyCode=13236&IsFirstRequest=1");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/BankTran.aspx?FYCode=52408&CompanyCode=13236&IsFirstRequest=1");

		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/BankTran.aspx?FYCode=52408&CompanyCode=13236&IsFirstRequest=1");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
	 public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AccountUI/BankTran.aspx?FYCode=52408&CompanyCode=13236&IsFirstRequest=1";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AccountUI/BankTran.aspx?FYCode=52408&CompanyCode=13236&IsFirstRequest=1")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click Banking
     * @name Click Banking
     */
	public void Click_Banking()
	{
        
		WebElement elem = getWebElement(BankingElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Banking", "Click_Banking failed. Unable to locate object: " + BankingElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Banking", "Click_Banking failed. Unable to locate object: " + BankingElem.toString());

			Assert.fail("Unable to locate object: " + BankingElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Banking");

		TestModellerLogger.PassStep(m_Driver, "Click_Banking");
	}

     
	/**
 	 * Click New 
     * @name Click New 
     */
	public void Click_New_()
	{
        
		WebElement elem = getWebElement(New_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_New_", "Click_New_ failed. Unable to locate object: " + New_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_New_", "Click_New_ failed. Unable to locate object: " + New_Elem.toString());

			Assert.fail("Unable to locate object: " + New_Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_New_");

		TestModellerLogger.PassStep(m_Driver, "Click_New_");
	}

     
	/**
 	 * Click New Bank Account
     * @name Click New Bank Account
     */
	public void Click_New_Bank_Account()
	{
        
		WebElement elem = getWebElement(New_Bank_AccountElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_New_Bank_Account", "Click_New_Bank_Account failed. Unable to locate object: " + New_Bank_AccountElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_New_Bank_Account", "Click_New_Bank_Account failed. Unable to locate object: " + New_Bank_AccountElem.toString());

			Assert.fail("Unable to locate object: " + New_Bank_AccountElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_New_Bank_Account");

		TestModellerLogger.PassStep(m_Driver, "Click_New_Bank_Account");
	}

    
	/**
 	 * Select BankMaster
	 * @throws InterruptedException 
     * @name Select BankMaster
     */
    public void Select_BankMaster(String BankMaster) throws InterruptedException
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[3]/div/div/div[2]/iframe")));
		m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_UpdatePanel1']/div[1]/label")).click();

 		WebElement elem = getWebElement(BankMasterElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_BankMaster", "Select_BankMaster failed. Unable to locate object: " + BankMasterElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_BankMaster", "Select_BankMaster failed. Unable to locate object: " + BankMasterElem.toString());

 			Assert.fail("Unable to locate object: " + BankMasterElem.toString());
         }
 		//m_Driver.navigate().refresh();
       jsExec.executeScript("arguments[0].click()", elem);
       
 		Select dropdown = new Select(elem);
               elem.sendKeys(Keys.ARROW_DOWN);
 		dropdown.selectByVisibleText(BankMaster);
 		
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_BankMaster " + BankMaster);

 		TestModellerLogger.PassStep(m_Driver, "Select_BankMaster " + BankMaster);
 	}

      
	/**
 	 * Enter BankAccountName
     * @name Enter BankAccountName
     */
 	public void Enter_BankAccountName(String BankAccountName)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(BankAccountNameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_BankAccountName", "Enter_BankAccountName failed. Unable to locate object: " + BankAccountNameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_BankAccountName", "Enter_BankAccountName failed. Unable to locate object: " + BankAccountNameElem.toString());

 			Assert.fail("Unable to locate object: " + BankAccountNameElem.toString());
         }

 		elem.sendKeys(BankAccountName);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_BankAccountName " + BankAccountName);

  		TestModellerLogger.PassStep(m_Driver, "Enter_BankAccountName " + BankAccountName);
 	}

    
	/**
 	 * Select AccType
     * @name Select AccType
     */
    public void Select_AccType(String AccType)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(AccTypeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_AccType", "Select_AccType failed. Unable to locate object: " + AccTypeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_AccType", "Select_AccType failed. Unable to locate object: " + AccTypeElem.toString());

 			Assert.fail("Unable to locate object: " + AccTypeElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(AccType);
 		
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_AccType " + AccType);

 		TestModellerLogger.PassStep(m_Driver, "Select_AccType " + AccType);
 	}

      
	/**
 	 * Enter AccNo
     * @name Enter AccNo
     */
 	public void Enter_AccNo(String AccNo)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(AccNoElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_AccNo", "Enter_AccNo failed. Unable to locate object: " + AccNoElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_AccNo", "Enter_AccNo failed. Unable to locate object: " + AccNoElem.toString());

 			Assert.fail("Unable to locate object: " + AccNoElem.toString());
         }

 		elem.sendKeys(AccNo);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_AccNo " + AccNo);

  		TestModellerLogger.PassStep(m_Driver, "Enter_AccNo " + AccNo);
 	}

      
	/**
 	 * Enter SortCode
     * @name Enter SortCode
     */
 	public void Enter_SortCode(String SortCode)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(SortCodeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_SortCode", "Enter_SortCode failed. Unable to locate object: " + SortCodeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_SortCode", "Enter_SortCode failed. Unable to locate object: " + SortCodeElem.toString());

 			Assert.fail("Unable to locate object: " + SortCodeElem.toString());
         }

 		elem.sendKeys(SortCode);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_SortCode " + SortCode);

  		TestModellerLogger.PassStep(m_Driver, "Enter_SortCode " + SortCode);
 	}

      
	/**
 	 * Enter Address
     * @name Enter Address
     */
 	public void Enter_Address(String Address)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(AddressElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Address", "Enter_Address failed. Unable to locate object: " + AddressElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Address", "Enter_Address failed. Unable to locate object: " + AddressElem.toString());

 			Assert.fail("Unable to locate object: " + AddressElem.toString());
         }

 		elem.sendKeys(Address);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Address " + Address);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Address " + Address);
 	}

    
	/**
 	 * Select Currency
     * @name Select Currency
     */
    public void Select_Currency(String Currency)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(CurrencyElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Currency", "Select_Currency failed. Unable to locate object: " + CurrencyElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Currency", "Select_Currency failed. Unable to locate object: " + CurrencyElem.toString());

 			Assert.fail("Unable to locate object: " + CurrencyElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Currency);
 		
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_Currency " + Currency);

 		TestModellerLogger.PassStep(m_Driver, "Select_Currency " + Currency);
 	}

     
	/**
 	 * Click Save
     * @name Click Save
     */
	public void Click_Save()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[2]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(SaveElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Save", "Click_Save failed. Unable to locate object: " + SaveElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Save", "Click_Save failed. Unable to locate object: " + SaveElem.toString());

			Assert.fail("Unable to locate object: " + SaveElem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_Save");

		TestModellerLogger.PassStep(m_Driver, "Click_Save");
	}
}