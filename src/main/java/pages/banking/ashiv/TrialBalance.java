package pages.banking.ashiv;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/53faca68-b6ca-4e9a-abee-034b2840fc9d
@TestModellerModule(guid = "53faca68-b6ca-4e9a-abee-034b2840fc9d")
public class TrialBalance extends BasePage
{
	public TrialBalance (WebDriver driver)
	{
		super(driver);
	}


	
	private By Advisor_Tools_1Elem = By.xpath("//A[@href='../AccountUI/AccountantDashboard.aspx?FYCode=117380&CompanyCode=17043&IsFirstRequest=1']");

	private By Import_Trial_Balance2Elem = By.xpath("//A[contains(text(),'Import Trial Balance')]");

	private By FileUpload3Elem = By.xpath("//*[normalize-space()= 'Upload CSV:']/div/input");

	private By Upload4Elem = By.xpath("//label[normalize-space()= '']/../div/input");

	private By LadgerCode5Elem = By.xpath("//SELECT[@name='ctl00$cPH$gvCSVColumn$ctl02$ddlMappedCol']");

	private By AccountName6Elem = By.xpath("//SELECT[@name='ctl00$cPH$gvCSVColumn$ctl03$ddlMappedCol']");

	private By Balance7Elem = By.xpath("//SELECT[@name='ctl00$cPH$gvCSVColumn$ctl04$ddlMappedCol']");

	private By Next8Elem = By.xpath("//A[@id='btnUpload']");

	private By Mas9Elem = By.xpath("//label[normalize-space()= 'Posting Date:']/../../../../../../../../div[1]/div");

	private By Addentry10Elem = By.xpath("//A[@id='ctl00_cPH_rptRecord_ctl01_lnkAdd']");

	private By RemoveEntry11Elem = By.xpath("//A[@id='ctl00_cPH_rptRecord_ctl02_lnkClear']");

	private By Import12Elem = By.xpath("//A[@id='ctl00_cpHFooter_btnImport']");

	private By Msg13Elem = By.xpath("//DIV[@class='tableDashboard py-0 el-selection']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AccountUI/ImportTrialBalance.aspx?FYCode=117380&CompanyCode=17043&redirectfrom=AccountantDashboard&menuid=0");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/ImportTrialBalance.aspx?FYCode=117380&CompanyCode=17043&redirectfrom=AccountantDashboard&menuid=0");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/ImportTrialBalance.aspx?FYCode=117380&CompanyCode=17043&redirectfrom=AccountantDashboard&menuid=0");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/AccountUI/ImportTrialBalance.aspx?FYCode=117380&CompanyCode=17043&redirectfrom=AccountantDashboard&menuid=0";

        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/AccountUI/ImportTrialBalance.aspx?FYCode=117380&CompanyCode=17043&redirectfrom=AccountantDashboard&menuid=0")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click Advisor Tools 1
     * @name Click Advisor Tools 1
     */
	public void Click_Advisor_Tools_1()
	{
        
		WebElement elem = getWebElement(Advisor_Tools_1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Advisor_Tools_1", "Click_Advisor_Tools_1 failed. Unable to locate object: " + Advisor_Tools_1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Advisor_Tools_1", "Click_Advisor_Tools_1 failed. Unable to locate object: " + Advisor_Tools_1Elem.toString());

			Assert.fail("Unable to locate object: " + Advisor_Tools_1Elem.toString());
        }

		     elem.click();
          	System.out.println("Click_Advisor_Tools_1");

		ExtentReportManager.passStep(m_Driver, "Click_Advisor_Tools_1");

		TestModellerLogger.PassStep(m_Driver, "Click_Advisor_Tools_1");
	}

     
	/**
 	 * Click Import Trial Balance2
	 * @throws InterruptedException 
     * @name Click Import Trial Balance2
     */
	public void Click_Import_Trial_Balance2() throws InterruptedException
	{
        
		WebElement elem = getWebElement(Import_Trial_Balance2Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Import_Trial_Balance2", "Click_Import_Trial_Balance2 failed. Unable to locate object: " + Import_Trial_Balance2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Import_Trial_Balance2", "Click_Import_Trial_Balance2 failed. Unable to locate object: " + Import_Trial_Balance2Elem.toString());

			Assert.fail("Unable to locate object: " + Import_Trial_Balance2Elem.toString());
        }

		     elem.click();
		     Thread.sleep(4000);
				System.out.println("Start");
				m_Driver.findElement(By.xpath("//*[@id='bankingMenu']/a/span")).click();
			//	m_Driver.findElement(By.xpath("//*[@id=\"divSubContent\"]/div[4]/div/div/div/div[1]/div/input")).click();
          	System.out.println("Click_Import_Trial_Balance2");

		ExtentReportManager.passStep(m_Driver, "Click_Import_Trial_Balance2");

		TestModellerLogger.PassStep(m_Driver, "Click_Import_Trial_Balance2");
	}

      
	public void ClickUploadFile(String path) throws InterruptedException
	{
	//	WebElement elem = getWebElement(FileUpload3Elem);
		
	//
		Thread.sleep(4000);
		System.out.println("Start");
		m_Driver.findElement(By.xpath("//*[@id='LinkButton1']")).click();
		//data.click();
	//	data.sendKeys(path);
		//WebElement ele=m_Driver.findElement(By.xpath("//input[@id='FileUpload1']"));
		//jsExec.executeScript("arguments[0].click();",elem);
		//elem.click();
		
     //   WebElement ele=m_Driver.findElement(By.xpath("//*[normalize-space()= 'Upload CSV:']/div/input"));
      //  ele.click();
        		System.out.println("ClickUploadFile");
		//jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//*[@id='FileUpload1']")));
		
		//Upload.click();
		
		
		
	}
	/**
 	 * Enter FileUpload3
	 * @throws InterruptedException 
     * @name Enter FileUpload3
     */
 	public void FileUpload3() throws InterruptedException
 	{
 	    
 	//	WebElement elem = getWebElement(FileUpload3Elem);

 	//	if (elem == null) {
    	//	ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_FileUpload3", "Enter_FileUpload3 failed. Unable to locate object: " + FileUpload3Elem.toString());

    	//	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_FileUpload3", "Enter_FileUpload3 failed. Unable to locate object: " + FileUpload3Elem.toString());

 		//	Assert.fail("Unable to locate object: " + FileUpload3Elem.toString());
 		Thread.sleep(2000);
         WebElement ele=m_Driver.findElement(By.xpath("//input[@id='FileUpload1']"));
         ele.click();
 		//jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//*[@id='FileUpload1']")));
 		//WebElement Upload =jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='FileUpload1']")));
 		//Upload.click();
 		
 		utilities.UploadFile.UploadFile1("D:\\TrialBalanceImportSample.csv");
 		
 		
  	//	ExtentReportManager.passStep(m_Driver, "Enter_FileUpload3 " + FileUpload3);

  		//TestModellerLogger.PassStep(m_Driver, "Enter_FileUpload3 " + FileUpload3);
 	}

     
	/**
 	 * Click Upload4
     * @name Click Upload4
     */
	public void Click_Upload4()
	{
        
		WebElement elem = getWebElement(Upload4Elem);

		
		elem.click();
         	
		

	
	}

    
	/**
 	 * Select LadgerCode5
     * @name Select LadgerCode5
     */
    public void Select_LadgerCode5(String LadgerCode5)
 	{
 	    
 		WebElement elem = getWebElement(LadgerCode5Elem);


 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(LadgerCode5);
 		
 		
 	
 	}

    
	/**
 	 * Select AccountName6
     * @name Select AccountName6
     */
    public void Select_AccountName6(String AccountName6)
 	{
 	    
 		WebElement elem = getWebElement(AccountName6Elem);

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(AccountName6);
 		
 		
 	
 	
 	}

    
	/**
 	 * Select Balance7
     * @name Select Balance7
     */
    public void Select_Balance7(String Balance7)
 	{
 	    
 		WebElement elem = getWebElement(Balance7Elem);

 	
 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Balance7);
 		
 		
 	
 	}

     
	/**
 	 * Click Next8
     * @name Click Next8
     */
	public void Click_Next8()
	{
        
		WebElement elem = getWebElement(Next8Elem);

	

		elem.click();
          	

		
	}

     
	/**
 	 * Click Mas9
     * @name Click Mas9
     */
	public void Click_Mas9()
	{
        
		WebElement elem = getWebElement(Mas9Elem);

	

		elem.click();
          	

		
	}

     
	/**
 	 * Click Addentry10
     * @name Click Addentry10
     */
	public void Add_RemoveEntry()
	{
        
		WebElement elemA = getWebElement(Addentry10Elem);


		elemA.click();
          	
		WebElement elemR = getWebElement(RemoveEntry11Elem);




		elemR.click();
		
	}

     
	/**
 	 * Click RemoveEntry11
     * @name Click RemoveEntry11
     */
	public void Click_RemoveEntry11()
	{
        
	
          	



	}

     
	/**
 	 * Click Import12
     * @name Click Import12
     */
	public void Click_Import12()
	{
        
		WebElement elem = getWebElement(Import12Elem);

		
		elem.click();
          	

	
	}

     
	/**
 	 * Click Msg13
     * @name Click Msg13
     */
	public void Click_Msg13()
	{
        
		WebElement elem = getWebElement(Msg13Elem);

		

		elem.click();
          	

	}
}