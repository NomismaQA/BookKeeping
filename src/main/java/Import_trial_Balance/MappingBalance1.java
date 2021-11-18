package Import_trial_Balance;

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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/09991c0f-6180-4ac4-98e5-f81a7781c6ba
@TestModellerModule(guid = "09991c0f-6180-4ac4-98e5-f81a7781c6ba")
public class MappingBalance1 extends BasePage
{
	public MappingBalance1 (WebDriver driver)
	{
		super(driver);
	}


	
	private By _Advisor_Tools_Elem = By.xpath("//*[@id='accountantMenu']");

	private By Import_Trial_BalanceElem = By.xpath("//A[contains(text(),'Import Trial Balance')]");

	private By Choose_FileElem = By.xpath("//*[@id='FileUpload1']");

	private By UploadElem = By.xpath("//*[@id='btnUploadeCSV']");

	private By Ledger_CodeElem = By.xpath("//SELECT[@name='ctl00$cPH$gvCSVColumn$ctl02$ddlMappedCol']");

	private By Account_NameElem = By.xpath("//SELECT[@name='ctl00$cPH$gvCSVColumn$ctl03$ddlMappedCol']");

	private By BalanceElem = By.xpath("//SELECT[@name='ctl00$cPH$gvCSVColumn$ctl04$ddlMappedCol']");

	private By Next_Elem = By.xpath("//A[@id='btnUpload']");

	private By Success_Trial_Balance_uploaded_successfullyElem = By.xpath("//label[normalize-space()= 'Posting Date:']/../../../../../../../../div[1]/div");

	private By _Import_Elem = By.xpath("//A[@id='ctl00_cpHFooter_btnImport']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AccountUI/JournalTBEditor.aspx?FYCode=117379&CompanyCode=17042&&JournalEntryCode=1242&redirectfrom=AccountantDashboard");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/JournalTBEditor.aspx?FYCode=117379&CompanyCode=17042&&JournalEntryCode=1242&redirectfrom=AccountantDashboard");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/JournalTBEditor.aspx?FYCode=117379&CompanyCode=17042&&JournalEntryCode=1242&redirectfrom=AccountantDashboard");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/AccountUI/JournalTBEditor.aspx?FYCode=117379&CompanyCode=17042&&JournalEntryCode=1242&redirectfrom=AccountantDashboard";

        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/AccountUI/JournalTBEditor.aspx?FYCode=117379&CompanyCode=17042&&JournalEntryCode=1242&redirectfrom=AccountantDashboard")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click  Advisor Tools 
     * @name Click  Advisor Tools 
     */
	public void Click__Advisor_Tools_()
	{
        
		WebElement elem = getWebElement(_Advisor_Tools_Elem);

	//	if (elem == null) {
    //		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Advisor_Tools_", "Click__Advisor_Tools_ failed. Unable to locate object: " + _Advisor_Tools_Elem.toString());

    //		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Advisor_Tools_", "Click__Advisor_Tools_ failed. Unable to locate object: " + _Advisor_Tools_Elem.toString());

	//		Assert.fail("Unable to locate object: " + _Advisor_Tools_Elem.toString());
        
m_Driver.findElement(By.xpath("//*[@id='ctl00_SideMenu1_accountantMenu']")).click();
		//elem.click();
          	

	//	ExtentReportManager.passStep(m_Driver, "Click__Advisor_Tools_");

	//	TestModellerLogger.PassStep(m_Driver, "Click__Advisor_Tools_");
	}

     
	/**
 	 * Click Import Trial Balance
     * @name Click Import Trial Balance
     */
	public void Click_Import_Trial_Balance()
	{
        
		WebElement elem = getWebElement(Import_Trial_BalanceElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Import_Trial_Balance", "Click_Import_Trial_Balance failed. Unable to locate object: " + Import_Trial_BalanceElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Import_Trial_Balance", "Click_Import_Trial_Balance failed. Unable to locate object: " + Import_Trial_BalanceElem.toString());

			Assert.fail("Unable to locate object: " + Import_Trial_BalanceElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Import_Trial_Balance");

		TestModellerLogger.PassStep(m_Driver, "Click_Import_Trial_Balance");
	}

     
	/**
 	 * Click Choose File
     * @name Click Choose File
     */
	public void Click_Choose_File()
	{
        
		WebElement elem = getWebElement(Choose_FileElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Choose_File", "Click_Choose_File failed. Unable to locate object: " + Choose_FileElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Choose_File", "Click_Choose_File failed. Unable to locate object: " + Choose_FileElem.toString());

			Assert.fail("Unable to locate object: " + Choose_FileElem.toString());
        }

		//elem.click();
		elem.sendKeys("D:\\TrialBalanceImportSample.csv");
          	

		ExtentReportManager.passStep(m_Driver, "Click_Choose_File");

		TestModellerLogger.PassStep(m_Driver, "Click_Choose_File");
	}

     
	/**
 	 * Click Upload
     * @name Click Upload
     */
	public void Click_Upload()
	{
        
		WebElement elem = getWebElement(UploadElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Upload", "Click_Upload failed. Unable to locate object: " + UploadElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Upload", "Click_Upload failed. Unable to locate object: " + UploadElem.toString());

			Assert.fail("Unable to locate object: " + UploadElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Upload");

		TestModellerLogger.PassStep(m_Driver, "Click_Upload");
	}

    
	/**
 	 * Select Ledger Code
     * @name Select Ledger Code
     */
    public void Select_Ledger_Code(String Ledger_Code)
 	{
 	    
 		WebElement elem = getWebElement(Ledger_CodeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Ledger_Code", "Select_Ledger_Code failed. Unable to locate object: " + Ledger_CodeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Ledger_Code", "Select_Ledger_Code failed. Unable to locate object: " + Ledger_CodeElem.toString());

 			Assert.fail("Unable to locate object: " + Ledger_CodeElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Ledger_Code);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Ledger_Code " + Ledger_Code);

 		TestModellerLogger.PassStep(m_Driver, "Select_Ledger_Code " + Ledger_Code);
 	}

    
	/**
 	 * Select Account Name
     * @name Select Account Name
     */
    public void Select_Account_Name(String Account_Name)
 	{
 	    
 		WebElement elem = getWebElement(Account_NameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Account_Name", "Select_Account_Name failed. Unable to locate object: " + Account_NameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Account_Name", "Select_Account_Name failed. Unable to locate object: " + Account_NameElem.toString());

 			Assert.fail("Unable to locate object: " + Account_NameElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Account_Name);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Account_Name " + Account_Name);

 		TestModellerLogger.PassStep(m_Driver, "Select_Account_Name " + Account_Name);
 	}

    
	/**
 	 * Select Balance
     * @name Select Balance
     */
    public void Select_Balance(String Balance)
 	{
 	    
 		WebElement elem = getWebElement(BalanceElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Balance", "Select_Balance failed. Unable to locate object: " + BalanceElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Balance", "Select_Balance failed. Unable to locate object: " + BalanceElem.toString());

 			Assert.fail("Unable to locate object: " + BalanceElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Balance);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Balance " + Balance);

 		TestModellerLogger.PassStep(m_Driver, "Select_Balance " + Balance);
 	}

     
	/**
 	 * Click Next 
     * @name Click Next 
     */
	public void Click_Next_()
	{
        
		WebElement elem = getWebElement(Next_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Next_", "Click_Next_ failed. Unable to locate object: " + Next_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Next_", "Click_Next_ failed. Unable to locate object: " + Next_Elem.toString());

			Assert.fail("Unable to locate object: " + Next_Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Next_");

		TestModellerLogger.PassStep(m_Driver, "Click_Next_");
	}

     
	/**
 	 * Click Success! Trial Balance uploaded successfully!
     * @name Click Success! Trial Balance uploaded successfully!
     */
	public void Click_Success_Trial_Balance_uploaded_successfully()
	{
        
		WebElement elem = getWebElement(Success_Trial_Balance_uploaded_successfullyElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Success_Trial_Balance_uploaded_successfully", "Click_Success_Trial_Balance_uploaded_successfully failed. Unable to locate object: " + Success_Trial_Balance_uploaded_successfullyElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Success_Trial_Balance_uploaded_successfully", "Click_Success_Trial_Balance_uploaded_successfully failed. Unable to locate object: " + Success_Trial_Balance_uploaded_successfullyElem.toString());

			Assert.fail("Unable to locate object: " + Success_Trial_Balance_uploaded_successfullyElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Success_Trial_Balance_uploaded_successfully");

		TestModellerLogger.PassStep(m_Driver, "Click_Success_Trial_Balance_uploaded_successfully");
	}

     
	/**
 	 * Click  Import 
     * @name Click  Import 
     */
	public void Click__Import_()
	{
        
		WebElement elem = getWebElement(_Import_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Import_", "Click__Import_ failed. Unable to locate object: " + _Import_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Import_", "Click__Import_ failed. Unable to locate object: " + _Import_Elem.toString());

			Assert.fail("Unable to locate object: " + _Import_Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__Import_");

		TestModellerLogger.PassStep(m_Driver, "Click__Import_");
	}
}