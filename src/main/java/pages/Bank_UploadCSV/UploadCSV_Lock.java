package pages.Bank_UploadCSV;

import pages.BasePage;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.ScreenshotException;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.GetScreenShot;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/33789c62-41ad-4cb7-833c-4042adae60c9
@TestModellerModule(guid = "33789c62-41ad-4cb7-833c-4042adae60c9")
public class UploadCSV_Lock extends BasePage
{
	

	public UploadCSV_Lock (WebDriver driver)
	{
		super(driver);
	}

	private By Tab_Nu_Rule_btnElem1= By.xpath("//A[@id='hrefAddFormula']");
	
	private By bank_menu_1Elem = By.xpath("//A[@href='../AccountUI/BankTran.aspx?FYCode=116991&CompanyCode=16668&IsFirstRequest=1']");

	private By Upload_CSV2Elem = By.xpath("//A[@id='ctl00_cPHFilter_btnUpload']");

	private By Select_Bank4Elem = By.xpath("//label[normalize-space()= 'Account:']/../../div[2]/select");

	private By Choose_Upload_CSV4Elem = By.xpath("//label[normalize-space()= 'CSV File:']/../../div[2]/input");

	private By Upload_btn_CSV5Elem = By.xpath("//label[normalize-space()= '']/../../div[2]/a[1]");

	private By Cancel_btn_CSV6Elem = By.xpath("//label[normalize-space()= '']/../../div[2]/a[2]");

	private By Download_CSV3Elem = By.xpath("//A[@id='ctl00_cpHeaderRight_btnExportSample']");

	private By Dt_CSV_Colum_map7Elem = By.xpath("//SELECT[@name='ctl00$cPH$gvCSVColumn$ctl02$ddlMappedCol']");

	private By Des_CSV_Colum_map8Elem = By.xpath("//SELECT[@name='ctl00$cPH$gvCSVColumn$ctl03$ddlMappedCol']");

	private By Amt_CSV_Colum_map9Elem = By.xpath("//SELECT[@name='ctl00$cPH$gvCSVColumn$ctl04$ddlMappedCol']");
private By Money_csv_outElem=By.xpath("//*[@id='ctl00_cPH_gvCSVColumn_ctl05_ddlMappedCol']");

	private By Submit_Map_btn_CSV10Elem = By.xpath("//INPUT[@name='ctl00$cPH$btnUploadeCSV']");

	private By Import__btn11Elem = By.xpath("//A[@id='ctl00_cPH_btnImport']");

	private By _2_Transactions_have_been_imported_Elem = By.xpath("//B[contains(text(),'2 Transactions have been imported.')]");

	private By Start_Reconciliation_btn12Elem = By.xpath("//INPUT[@name='ctl00$cPH$btnStarReconciliation']");

	private By Export_CSV__btn13Elem = By.xpath("//BUTTON[@id='ctl00_cPH_btnexport']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AccountUI/UploadBankTran.aspx?FYCode=116991&CompanyCode=16668&menuid=0");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/UploadBankTran.aspx?FYCode=116991&CompanyCode=16668&menuid=0");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/UploadBankTran.aspx?FYCode=116991&CompanyCode=16668&menuid=0");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/AccountUI/UploadBankTran.aspx?FYCode=116991&CompanyCode=16668&menuid=0";

        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/AccountUI/UploadBankTran.aspx?FYCode=116991&CompanyCode=16668&menuid=0")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click bank_menu_1
     * @name Click bank_menu_1
     */
	public void Click_bank_menu_1()
	{
        
		WebElement elem = getWebElement(bank_menu_1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_bank_menu_1", "Click_bank_menu_1 failed. Unable to locate object: " + bank_menu_1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_bank_menu_1", "Click_bank_menu_1 failed. Unable to locate object: " + bank_menu_1Elem.toString());

			Assert.fail("Unable to locate object: " + bank_menu_1Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_bank_menu_1");

		TestModellerLogger.PassStep(m_Driver, "Click_bank_menu_1");
	}

     
	/**
 	 * Click Upload_CSV2
     * @name Click Upload_CSV2
     */
	public void Click_Upload_CSV2()
	{
        
		WebElement elem = getWebElement(Upload_CSV2Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Upload_CSV2", "Click_Upload_CSV2 failed. Unable to locate object: " + Upload_CSV2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Upload_CSV2", "Click_Upload_CSV2 failed. Unable to locate object: " + Upload_CSV2Elem.toString());

			Assert.fail("Unable to locate object: " + Upload_CSV2Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Upload_CSV2");

		TestModellerLogger.PassStep(m_Driver, "Click_Upload_CSV2");
	}

    
	/**
 	 * Select Select_Bank4
     * @name Select Select_Bank4
     */
    public void Select_Select_Bank4(String Select_Bank4)
 	{
 	    
 		WebElement elem = getWebElement(Select_Bank4Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Select_Bank4", "Select_Select_Bank4 failed. Unable to locate object: " + Select_Bank4Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Select_Bank4", "Select_Select_Bank4 failed. Unable to locate object: " + Select_Bank4Elem.toString());

 			Assert.fail("Unable to locate object: " + Select_Bank4Elem.toString());
         }
       elem.sendKeys(Keys.ENTER);
 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Select_Bank4);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Select_Bank4 " + Select_Bank4);

 		TestModellerLogger.PassStep(m_Driver, "Select_Select_Bank4 " + Select_Bank4);
 	}

      
	/**
 	 * Enter Choose_Upload_CSV4
	 * @throws InterruptedException 
     * @name Enter Choose_Upload_CSV4
     */
 	public void Enter_Choose_Upload_CSV4(String Choose_Upload_CSV4) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(Choose_Upload_CSV4Elem);

 		if (elem == null) 
 		{
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Choose_Upload_CSV4", "Enter_Choose_Upload_CSV4 failed. Unable to locate object: " + Choose_Upload_CSV4Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Choose_Upload_CSV4", "Enter_Choose_Upload_CSV4 failed. Unable to locate object: " + Choose_Upload_CSV4Elem.toString());

 			Assert.fail("Unable to locate object: " + Choose_Upload_CSV4Elem.toString());
         }
    
 		elem.sendKeys(Choose_Upload_CSV4);
 		
 	
  		ExtentReportManager.passStep(m_Driver, "Enter_Choose_Upload_CSV4 " + Choose_Upload_CSV4);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Choose_Upload_CSV4 " + Choose_Upload_CSV4);
 	}

     
	/**
 	 * Click Upload_btn_CSV5
	 * @throws InterruptedException 
     * @name Click Upload_btn_CSV5
     */
	public void Click_Upload_btn_CSV5() throws InterruptedException
	{
        
		WebElement elem = getWebElement(Upload_btn_CSV5Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Upload_btn_CSV5", "Click_Upload_btn_CSV5 failed. Unable to locate object: " + Upload_btn_CSV5Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Upload_btn_CSV5", "Click_Upload_btn_CSV5 failed. Unable to locate object: " + Upload_btn_CSV5Elem.toString());

			Assert.fail("Unable to locate object: " + Upload_btn_CSV5Elem.toString());
        }

		elem.click();


		ExtentReportManager.passStep(m_Driver, "Click_Upload_btn_CSV5");

		TestModellerLogger.PassStep(m_Driver, "Click_Upload_btn_CSV5");
	}

     
	/**
 	 * Click Cancel_btn_CSV6
     * @name Click Cancel_btn_CSV6
     */
	public void Click_Cancel_btn_CSV6()
	{
        
		WebElement elem = getWebElement(Cancel_btn_CSV6Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Cancel_btn_CSV6", "Click_Cancel_btn_CSV6 failed. Unable to locate object: " + Cancel_btn_CSV6Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Cancel_btn_CSV6", "Click_Cancel_btn_CSV6 failed. Unable to locate object: " + Cancel_btn_CSV6Elem.toString());

			Assert.fail("Unable to locate object: " + Cancel_btn_CSV6Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Cancel_btn_CSV6");

		TestModellerLogger.PassStep(m_Driver, "Click_Cancel_btn_CSV6");
	}

     
	/**
 	 * Click Download_CSV3
	 * @throws InterruptedException 
     * @name Click Download_CSV3
     */
	public void Click_Download_CSV3() throws InterruptedException
	{
        
		WebElement elem = getWebElement(Download_CSV3Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Download_CSV3", "Click_Download_CSV3 failed. Unable to locate object: " + Download_CSV3Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Download_CSV3", "Click_Download_CSV3 failed. Unable to locate object: " + Download_CSV3Elem.toString());

			Assert.fail("Unable to locate object: " + Download_CSV3Elem.toString());
        }

		elem.click();
		

		ExtentReportManager.passStep(m_Driver, "Click_Download_CSV3");

		TestModellerLogger.PassStep(m_Driver, "Click_Download_CSV3");
	}

    
	/**
 	 * Select Dt_CSV_Colum_map7
     * @name Select Dt_CSV_Colum_map7
     */
    public void Select_Dt_CSV_Colum_map7(String Dt_CSV_Colum_map7)
 	{
 	    
 		WebElement elem = getWebElement(Dt_CSV_Colum_map7Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Dt_CSV_Colum_map7", "Select_Dt_CSV_Colum_map7 failed. Unable to locate object: " + Dt_CSV_Colum_map7Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Dt_CSV_Colum_map7", "Select_Dt_CSV_Colum_map7 failed. Unable to locate object: " + Dt_CSV_Colum_map7Elem.toString());

 			Assert.fail("Unable to locate object: " + Dt_CSV_Colum_map7Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Dt_CSV_Colum_map7);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Dt_CSV_Colum_map7 " + Dt_CSV_Colum_map7);

 		TestModellerLogger.PassStep(m_Driver, "Select_Dt_CSV_Colum_map7 " + Dt_CSV_Colum_map7);
 	}

    
	/**
 	 * Select Des_CSV_Colum_map8
     * @name Select Des_CSV_Colum_map8
     */
    public void Select_Des_CSV_Colum_map8(String Des_CSV_Colum_map8)
 	{
 	    
 		WebElement elem = getWebElement(Des_CSV_Colum_map8Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Des_CSV_Colum_map8", "Select_Des_CSV_Colum_map8 failed. Unable to locate object: " + Des_CSV_Colum_map8Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Des_CSV_Colum_map8", "Select_Des_CSV_Colum_map8 failed. Unable to locate object: " + Des_CSV_Colum_map8Elem.toString());

 			Assert.fail("Unable to locate object: " + Des_CSV_Colum_map8Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Des_CSV_Colum_map8);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Des_CSV_Colum_map8 " + Des_CSV_Colum_map8);

 		TestModellerLogger.PassStep(m_Driver, "Select_Des_CSV_Colum_map8 " + Des_CSV_Colum_map8);
 	}

    
	/**
 	 * Select Amt_CSV_Colum_map9
     * @name Select Amt_CSV_Colum_map9
     */
    public void Select_Amt_CSV_Colum_map9(String Amt_CSV_Colum_map9)
 	{
 	    
 		WebElement elem = getWebElement(Amt_CSV_Colum_map9Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Amt_CSV_Colum_map9", "Select_Amt_CSV_Colum_map9 failed. Unable to locate object: " + Amt_CSV_Colum_map9Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Amt_CSV_Colum_map9", "Select_Amt_CSV_Colum_map9 failed. Unable to locate object: " + Amt_CSV_Colum_map9Elem.toString());

 			Assert.fail("Unable to locate object: " + Amt_CSV_Colum_map9Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Amt_CSV_Colum_map9);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Amt_CSV_Colum_map9 " + Amt_CSV_Colum_map9);

 		TestModellerLogger.PassStep(m_Driver, "Select_Amt_CSV_Colum_map9 " + Amt_CSV_Colum_map9);
 	}

    public void Select_Moneyout_CSV_Colum(String Money_csv_out)
 	{
 	    
 		WebElement elem = getWebElement(Money_csv_outElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Amt_CSV_Colum_map9", "Select_Amt_CSV_Colum_map9 failed. Unable to locate object: " + Money_csv_outElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Amt_CSV_Colum_map9", "Select_Amt_CSV_Colum_map9 failed. Unable to locate object: " + Money_csv_outElem.toString());

 			Assert.fail("Unable to locate object: " + Amt_CSV_Colum_map9Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Money_csv_out);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Amt_CSV_Colum_map9 " + Money_csv_out);

 		TestModellerLogger.PassStep(m_Driver, "Select_Amt_CSV_Colum_map9 " + Money_csv_out);
 	}

     
	/**
 	 * Click Submit_Map_btn_CSV10
	 * @throws InterruptedException 
	 * @throws IOException 
     * @name Click Submit_Map_btn_CSV10
     */
	public void Click_Submit_Map_btn_CSV10() throws InterruptedException, IOException
	{
        
		WebElement elem = getWebElement(Submit_Map_btn_CSV10Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Submit_Map_btn_CSV10", "Click_Submit_Map_btn_CSV10 failed. Unable to locate object: " + Submit_Map_btn_CSV10Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Submit_Map_btn_CSV10", "Click_Submit_Map_btn_CSV10 failed. Unable to locate object: " + Submit_Map_btn_CSV10Elem.toString());

			Assert.fail("Unable to locate object: " + Submit_Map_btn_CSV10Elem.toString());
        }
	
		jsExec.executeScript("arguments[0].click();", elem);
	}

	/*	List<WebElement> pass=m_Driver.findElements(By.xpath("//*[@id='ctl00_divSubContent']/div[4]/div[4]/div/div"));
		int count=pass.size();
		System.out.println("list of count"+count);

		for(WebElement c:pass)
		{
			System.out.println("list of elements"+c.getText());
		}
		if(count!=0)
		{
			System.out.println("uploaded"+pass.get(0).getText());
		 if(pass.get(1).getText().contains("Issues"))
			{
				
				System.out.println("uploaded"+pass.get(1).getText());
				Thread.sleep(2000);
				
	   WebElement chkbox= m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_chkcol']"));
				jsExec.executeScript("arguments[0].click();",chkbox);
				
				
			}
	
		}
		
		
			
//			System.out.println("uploaded"+pass.get(1).getText());
//			Thread.sleep(2000);
//			
//   WebElement chkbox= m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_chkcol']"));
//			jsExec.executeScript("arguments[0].click();",chkbox);
			
	
		else
		{
			
			
			System.out.println("No is file uploaded"); 
			Assert.assertEquals(count,1,"incorect file format");
			
		}
}*/
		
	
		
		
		
		

	

    	
    	
    	
    	
    	
    	
    	
    	
    	
	

		
		
		/*Thread.sleep(1000);
		 String msg=m_Driver.findElement(By.xpath("//*[@id='ctl00_divSubContent']/div[2]/div")).getText();
		
         	Assert.assertFalse(false, "msg");*/
		
		
//		Boolean c=true;
//		if(c==true)
//		{
//		 String we=m_Driver.findElement(By.xpath("//*[@id='ctl00_divSubContent']/div[4]/div[4]/div")).getText();
//		 System.out.println("Confirmation message is  "  +we);
//		}
//		else
//		{
			
	
//	GetScreenShot.captureAsImage(m_Driver, "Failreson");
//	GetScreenShot.captureAsImage(m_Driver, "UPLOADED");
//	
//			
//	
//		ExtentReportManager.passStep(m_Driver, "Click_Submit_Map_btn_CSV10");
//
//		TestModellerLogger.PassStep(m_Driver, "Click_Submit_Map_btn_CSV10");
//	}
	

	public void verifyuploaddata()
	{
		
		
		
		List<WebElement> lst=m_Driver.findElements(By.xpath("//*[@id='tblCSVdata']/tbody/tr"));
				
		for(WebElement row:lst)
			
		{
//			
		    System.out.println(row.getText());
			
		    }
	}

	
	

     
	/**
 	 * Click Import _btn11
     * @name Click Import _btn11
     */
	public void Click_Import__btn11()
	{
        
		WebElement elem = getWebElement(Import__btn11Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Import__btn11", "Click_Import__btn11 failed. Unable to locate object: " + Import__btn11Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Import__btn11", "Click_Import__btn11 failed. Unable to locate object: " + Import__btn11Elem.toString());

			Assert.fail("Unable to locate object: " + Import__btn11Elem.toString());
        }

		elem.click();
          	
		String imprt=m_Driver.findElement(By.xpath("//*[@id='ctl00_divSubContent']/div[4]/div[2]/div/div[1]/b")).getText();
		System.out.println("Confirmation Message after import :" +imprt);

		ExtentReportManager.passStep(m_Driver, "Click_Import__btn11");

		TestModellerLogger.PassStep(m_Driver, "Click_Import__btn11");
	}

     
	/**
 	 * Click 2 Transactions have been imported. 
     * @name Click 2 Transactions have been imported. 
     */
	public void Click__2_Transactions_have_been_imported_()
	{
        
		WebElement elem = getWebElement(_2_Transactions_have_been_imported_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__2_Transactions_have_been_imported_", "Click__2_Transactions_have_been_imported_ failed. Unable to locate object: " + _2_Transactions_have_been_imported_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__2_Transactions_have_been_imported_", "Click__2_Transactions_have_been_imported_ failed. Unable to locate object: " + _2_Transactions_have_been_imported_Elem.toString());

			Assert.fail("Unable to locate object: " + _2_Transactions_have_been_imported_Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__2_Transactions_have_been_imported_");

		TestModellerLogger.PassStep(m_Driver, "Click__2_Transactions_have_been_imported_");
	}

     
	/**
 	 * Click Start_Reconciliation_btn12
     * @name Click Start_Reconciliation_btn12
     */
	public void Click_Start_Reconciliation_btn12()
	{
        
		WebElement elem = getWebElement(Start_Reconciliation_btn12Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Start_Reconciliation_btn12", "Click_Start_Reconciliation_btn12 failed. Unable to locate object: " + Start_Reconciliation_btn12Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Start_Reconciliation_btn12", "Click_Start_Reconciliation_btn12 failed. Unable to locate object: " + Start_Reconciliation_btn12Elem.toString());

			Assert.fail("Unable to locate object: " + Start_Reconciliation_btn12Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Start_Reconciliation_btn12");

		TestModellerLogger.PassStep(m_Driver, "Click_Start_Reconciliation_btn12");
	}

	
	
	public void Click_Tab_RunRules1_btn() throws InterruptedException
	{
        
		WebElement elem = getWebElement(Tab_Nu_Rule_btnElem1);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Tab_RunRules1_btn", "Click_Tab_RunRules1_btn failed. Unable to locate object: " + Tab_Nu_Rule_btnElem1.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Tab_RunRules1_btn", "Click_Tab_RunRules1_btn failed. Unable to locate object: " + Tab_Nu_Rule_btnElem1.toString());

			Assert.fail("Unable to locate object: " + Tab_Nu_Rule_btnElem1.toString());
        }

		elem.click();
          	

		
		ExtentReportManager.passStep(m_Driver, "Click_Tab_RunRules1_btn");

		TestModellerLogger.PassStep(m_Driver, "Click_Tab_RunRules1_btn");
	}
     
	/**
 	 * Click Export_CSV _btn13
     * @name Click Export_CSV _btn13
     */
	public void Click_Export_CSV__btn13()
	{
        
		WebElement elem = getWebElement(Export_CSV__btn13Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Export_CSV__btn13", "Click_Export_CSV__btn13 failed. Unable to locate object: " + Export_CSV__btn13Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Export_CSV__btn13", "Click_Export_CSV__btn13 failed. Unable to locate object: " + Export_CSV__btn13Elem.toString());

			Assert.fail("Unable to locate object: " + Export_CSV__btn13Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Export_CSV__btn13");

		TestModellerLogger.PassStep(m_Driver, "Click_Export_CSV__btn13");
	}
	
	public void runrule()
	{
		
		m_Driver.findElement(By.xpath("//*[@id='hrefAutoAllocate']")).click();
	}
}