package As_Supplier;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/f86763a3-02ed-4a6c-9dd9-72acbfcd1d3a
@TestModellerModule(guid = "f86763a3-02ed-4a6c-9dd9-72acbfcd1d3a")
public class SupplierList extends BasePage
{
	public SupplierList (WebDriver driver)
	{
		super(driver);
	}


	
	private By Expenditure1Elem = By.xpath("//*[@id='ctl00_SideMenu1_ExpensesMenu']/a/span");

	private By View2Elem = By.xpath("//*[@id='ctl00_divMainContent']/header/div/div[3]/a");

	private By Supplier_List_3Elem = By.xpath("//A[@id='ctl00_cpHeaderRight_btnAddSupplier']");

	private By Category_Search4Elem = By.xpath("//label[normalize-space()= 'Search Category:']/../select");

	private By Enter_Test_to_Search5Elem = By.xpath("//label[normalize-space()= 'Search Category:']/../../div[2]/input");

	private By SearchBtn_6Elem = By.xpath("//label[normalize-space()= 'Search Category:']/../../div[3]/a");

	private By Add_SupplierBtn7Elem = By.xpath("//label[normalize-space()= 'Search Category:']/../../../../../../header/div/a[1]");

	private By EnterSupplierName8Elem = By.xpath("//label[normalize-space()= 'Business Name:*']/../div/div/input");

	private By SaveBtn9Elem = By.xpath("//A[@id='ctl00_cphFooter_btnSave']");

	private By Edit_SupplierBtn10Elem = By.xpath("//A[@id='ctl00_cPH_rptrRecordsLimited_ctl00_lnkEdit']");

	private By Enter_Edit_Supplier_Name11Elem = By.xpath("//label[normalize-space()= 'Business Name:*']/../div/div/input");

	private By SaveBtn12Elem = By.xpath("//A[@id='ctl00_cphFooter_btnSave']");

	private By DeleteBtn13Elem = By.xpath("//*[@id='ctl00_cPH_rptrRecordsLimited_ctl05_lnkDelete']");

	private By Download_Csv14Elem = By.xpath("//label[normalize-space()= 'Search Category:']/../../../../../../header/div/a[4]");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AccountUI/Supplier.aspx?FYCode=117396&CompanyCode=17059");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/Supplier.aspx?FYCode=117396&CompanyCode=17059");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/Supplier.aspx?FYCode=117396&CompanyCode=17059");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/AccountUI/Supplier.aspx?FYCode=117396&CompanyCode=17059";

        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/AccountUI/Supplier.aspx?FYCode=117396&CompanyCode=17059")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click Expenditure1
     * @name Click Expenditure1
     */
	public void Click_Expenditure1()
	{
        
		WebElement elem = getWebElement(Expenditure1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Expenditure1", "Click_Expenditure1 failed. Unable to locate object: " + Expenditure1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Expenditure1", "Click_Expenditure1 failed. Unable to locate object: " + Expenditure1Elem.toString());

			Assert.fail("Unable to locate object: " + Expenditure1Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Expenditure1");

		TestModellerLogger.PassStep(m_Driver, "Click_Expenditure1");
	}

     
	/**
 	 * Click View2
     * @name Click View2
     */
	public void Click_View2()
	{
        
		WebElement elem = getWebElement(View2Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_View2", "Click_View2 failed. Unable to locate object: " + View2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_View2", "Click_View2 failed. Unable to locate object: " + View2Elem.toString());

			Assert.fail("Unable to locate object: " + View2Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_View2");

		TestModellerLogger.PassStep(m_Driver, "Click_View2");
	}

     
	/**
 	 * Click Supplier List 3
     * @name Click Supplier List 3
     */
	public void Click_Supplier_List_3()
	{
        
		WebElement elem = getWebElement(Supplier_List_3Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Supplier_List_3", "Click_Supplier_List_3 failed. Unable to locate object: " + Supplier_List_3Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Supplier_List_3", "Click_Supplier_List_3 failed. Unable to locate object: " + Supplier_List_3Elem.toString());

			Assert.fail("Unable to locate object: " + Supplier_List_3Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Supplier_List_3");

		TestModellerLogger.PassStep(m_Driver, "Click_Supplier_List_3");
	}

    
	/**
 	 * Select Category_Search4
     * @name Select Category_Search4
     */
    public void Select_Category_Search4(String Category_Search4)
 	{
 	    
 		WebElement elem = getWebElement(Category_Search4Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Category_Search4", "Select_Category_Search4 failed. Unable to locate object: " + Category_Search4Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Category_Search4", "Select_Category_Search4 failed. Unable to locate object: " + Category_Search4Elem.toString());

 			Assert.fail("Unable to locate object: " + Category_Search4Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Category_Search4);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Category_Search4 " + Category_Search4);

 		TestModellerLogger.PassStep(m_Driver, "Select_Category_Search4 " + Category_Search4);
 	}

 
      
	/**
 	 * Enter Enter Test to Search5
     * @name Enter Enter Test to Search5
     */
 	public void Enter_Enter_Test_to_Search5(String Enter_Test_to_Search5)
 	{
 	    
 		WebElement elem = getWebElement(Enter_Test_to_Search5Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_Test_to_Search5", "Enter_Enter_Test_to_Search5 failed. Unable to locate object: " + Enter_Test_to_Search5Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_Test_to_Search5", "Enter_Enter_Test_to_Search5 failed. Unable to locate object: " + Enter_Test_to_Search5Elem.toString());

 			Assert.fail("Unable to locate object: " + Enter_Test_to_Search5Elem.toString());
         }

 		elem.sendKeys(Enter_Test_to_Search5);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_Test_to_Search5 " + Enter_Test_to_Search5);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_Test_to_Search5 " + Enter_Test_to_Search5);
 	}

     
	/**
 	 * Click SearchBtn 6
     * @name Click SearchBtn 6
     */
	public void Click_SearchBtn_6()
	{
        
		WebElement elem = getWebElement(SearchBtn_6Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SearchBtn_6", "Click_SearchBtn_6 failed. Unable to locate object: " + SearchBtn_6Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SearchBtn_6", "Click_SearchBtn_6 failed. Unable to locate object: " + SearchBtn_6Elem.toString());

			Assert.fail("Unable to locate object: " + SearchBtn_6Elem.toString());
        }

		elem.click();
         System.out.println("Click Search Btn ");
         utilities.Screenshotcapture.Getscreenshot("Search Supplier", "Supplier List");

		ExtentReportManager.passStep(m_Driver, "Click_SearchBtn_6");

		TestModellerLogger.PassStep(m_Driver, "Click_SearchBtn_6");
	}
	

	
	 public void All_Supplier() throws InterruptedException
	    {
		 WebElement elem = getWebElement(Enter_Test_to_Search5Elem);
		 WebElement elemSaveBtn = getWebElement(SearchBtn_6Elem);
		 elem.clear();
		 elemSaveBtn.click();
		 Thread.sleep(1000);
	    }
	 
	 
	 
	 
	/**
 	 * Click Add SupplierBtn7
     * @name Click Add SupplierBtn7
     */
	public void Click_Add_SupplierBtn7()
	{
        
		WebElement elem = getWebElement(Add_SupplierBtn7Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Add_SupplierBtn7", "Click_Add_SupplierBtn7 failed. Unable to locate object: " + Add_SupplierBtn7Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Add_SupplierBtn7", "Click_Add_SupplierBtn7 failed. Unable to locate object: " + Add_SupplierBtn7Elem.toString());

			Assert.fail("Unable to locate object: " + Add_SupplierBtn7Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Add_SupplierBtn7");

		TestModellerLogger.PassStep(m_Driver, "Click_Add_SupplierBtn7");
	}

      
	/**
 	 * Enter EnterSupplierName8
     * @name Enter EnterSupplierName8
     */
 	public void Enter_EnterSupplierName8(String EnterSupplierName8)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(EnterSupplierName8Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_EnterSupplierName8", "Enter_EnterSupplierName8 failed. Unable to locate object: " + EnterSupplierName8Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_EnterSupplierName8", "Enter_EnterSupplierName8 failed. Unable to locate object: " + EnterSupplierName8Elem.toString());

 			Assert.fail("Unable to locate object: " + EnterSupplierName8Elem.toString());
         }

 		elem.sendKeys(EnterSupplierName8);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_EnterSupplierName8 " + EnterSupplierName8);

  		TestModellerLogger.PassStep(m_Driver, "Enter_EnterSupplierName8 " + EnterSupplierName8);
 	}

     
	/**
 	 * Click SaveBtn9
     * @name Click SaveBtn9
     */
	public void Click_SaveBtn9()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(SaveBtn9Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SaveBtn9", "Click_SaveBtn9 failed. Unable to locate object: " + SaveBtn9Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SaveBtn9", "Click_SaveBtn9 failed. Unable to locate object: " + SaveBtn9Elem.toString());

			Assert.fail("Unable to locate object: " + SaveBtn9Elem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
		utilities.Screenshotcapture.Getscreenshot("Add New  Supplier ", "Supplier List");

		ExtentReportManager.passStep(m_Driver, "Click_SaveBtn9");

		TestModellerLogger.PassStep(m_Driver, "Click_SaveBtn9");
	}

     
	/**
 	 * Click Edit_SupplierBtn10
     * @name Click Edit_SupplierBtn10
     */
	public void Click_Edit_SupplierBtn10()
	{
        
		WebElement elem = getWebElement(Edit_SupplierBtn10Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Edit_SupplierBtn10", "Click_Edit_SupplierBtn10 failed. Unable to locate object: " + Edit_SupplierBtn10Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Edit_SupplierBtn10", "Click_Edit_SupplierBtn10 failed. Unable to locate object: " + Edit_SupplierBtn10Elem.toString());

			Assert.fail("Unable to locate object: " + Edit_SupplierBtn10Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Edit_SupplierBtn10");

		TestModellerLogger.PassStep(m_Driver, "Click_Edit_SupplierBtn10");
	}

      
	/**
 	 * Enter Enter_Edit_Supplier_Name11
     * @name Enter Enter_Edit_Supplier_Name11
     */
 	public void Enter_Enter_Edit_Supplier_Name11(String Enter_Edit_Supplier_Name11)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div[1]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Enter_Edit_Supplier_Name11Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_Edit_Supplier_Name11", "Enter_Enter_Edit_Supplier_Name11 failed. Unable to locate object: " + Enter_Edit_Supplier_Name11Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_Edit_Supplier_Name11", "Enter_Enter_Edit_Supplier_Name11 failed. Unable to locate object: " + Enter_Edit_Supplier_Name11Elem.toString());

 			Assert.fail("Unable to locate object: " + Enter_Edit_Supplier_Name11Elem.toString());
         }
 		elem.clear();
 		elem.sendKeys(Enter_Edit_Supplier_Name11);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_Edit_Supplier_Name11 " + Enter_Edit_Supplier_Name11);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_Edit_Supplier_Name11 " + Enter_Edit_Supplier_Name11);
 	}

     
	/**
 	 * Click SaveBtn12
     * @name Click SaveBtn12
     */
	public void Click_SaveBtn12()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div[1]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(SaveBtn12Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SaveBtn12", "Click_SaveBtn12 failed. Unable to locate object: " + SaveBtn12Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SaveBtn12", "Click_SaveBtn12 failed. Unable to locate object: " + SaveBtn12Elem.toString());

			Assert.fail("Unable to locate object: " + SaveBtn12Elem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
		utilities.Screenshotcapture.Getscreenshot("Edit Supplier ", "Supplier List");

		ExtentReportManager.passStep(m_Driver, "Click_SaveBtn12");

		TestModellerLogger.PassStep(m_Driver, "Click_SaveBtn12");
	}

     
	/**
 	 * Click DeleteBtn13
	 * @throws InterruptedException 
     * @name Click DeleteBtn13
     */
	public void Click_DeleteBtn13() throws InterruptedException
	{
        
		WebElement elem = getWebElement(DeleteBtn13Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_DeleteBtn13", "Click_DeleteBtn13 failed. Unable to locate object: " + DeleteBtn13Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_DeleteBtn13", "Click_DeleteBtn13 failed. Unable to locate object: " + DeleteBtn13Elem.toString());

			Assert.fail("Unable to locate object: " + DeleteBtn13Elem.toString());
        }

		elem.click();
		Thread.sleep(2000);
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='LoadSupplierModalFrame']")));
		m_Driver.findElement(By.xpath("//*[@id='ctl00_cphFooter_btnDelete']")).click();
		m_Driver.switchTo().defaultContent();
		utilities.Screenshotcapture.Getscreenshot("Delete Supplier", "Supplier List");
		ExtentReportManager.passStep(m_Driver, "Click_DeleteBtn13");

		TestModellerLogger.PassStep(m_Driver, "Click_DeleteBtn13");
	}

     
	/**
 	 * Click Download Csv14
	 * @throws InterruptedException 
     * @name Click Download Csv14
     */
	public void Click_Download_Csv14() throws InterruptedException
	{
        
		WebElement elem = getWebElement(Download_Csv14Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Download_Csv14", "Click_Download_Csv14 failed. Unable to locate object: " + Download_Csv14Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Download_Csv14", "Click_Download_Csv14 failed. Unable to locate object: " + Download_Csv14Elem.toString());

			Assert.fail("Unable to locate object: " + Download_Csv14Elem.toString());
        }

			elem.click();
			
          	Thread.sleep(3000);

		ExtentReportManager.passStep(m_Driver, "Click_Download_Csv14");

		TestModellerLogger.PassStep(m_Driver, "Click_Download_Csv14");
	}
	
	
	public void UploadFile(String FilePath) throws InterruptedException
	{
		m_Driver.findElement(By.xpath("//*[@id='ctl00_cpHeaderRight_btnUploadCSV']/i")).click(); 	//Click UploadBtn
		Thread.sleep(1000);
		WebElement FileChooseBtn=m_Driver.findElement(By.xpath("//*[@id=\"ctl00_cPH_FileUpload1\"]"));  //Choose File
		FileChooseBtn.sendKeys(FilePath);
		Thread.sleep(2000);
		utilities.Screenshotcapture.Getscreenshot("File Upload ", "Supplier List");    // Screen Shot
		m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_btnUploadBatch']")).click();  //Click UploadBtn
		
		WebElement ImportBtn=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_btnImport']"));
		jsExec.executeScript("arguments[0].scrollIntoView(true);", ImportBtn);
		utilities.Screenshotcapture.Getscreenshot("Csv File Information", "Supplier List");
		ImportBtn.click();
		Thread.sleep(1000);
		utilities.Screenshotcapture.Getscreenshot("Csv File  record(s) added successfully", "Supplier List");
		
	}
	
	
	public void AlreadyExistsSupplierDel() throws InterruptedException
	{
		m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrRecordsLimited_ctl00_spnSelect']")).click();//Select Supllier
		Thread.sleep(1000);
		m_Driver.findElement(By.xpath("//*[@id='ctl00_cpHeaderRight_btnDeleteAllSupp']/i")).click();//DeleteBtn
		Thread.sleep(1000);
		utilities.Screenshotcapture.Getscreenshot(" This supplier is already exists It can't be deleted.", "Supplier List");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}