package pages.new_bank_trans;

import pages.BasePage;

import java.awt.Window;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.ClosePopup;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/c92661fa-2508-46e5-9da9-d5450b86a628
@TestModellerModule(guid = "c92661fa-2508-46e5-9da9-d5450b86a628")
public class Addltdbus extends BasePage
{  static String businessname;
	List<WebElement> elem2;
	int i;
	 Dimension d = new Dimension(300,1080);
	String companyname;
	public Addltdbus (WebDriver driver)
	{
		super(driver);
	}

	private By CreateElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHFooter_btnSave']");

	private By click_arrow_downloadElem = By.xpath("//A[@class='text-center downloadfile']");

	private By Click_Upload_btnElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnUpload']");

	private By Choosefile_touploadElem = By.xpath("/html/body/form/main/div[5]/div[3]/div/div[3]/div/div[3]/div/div[2]/div/div/div[2]/input");
	private By Click_Plus_Sign1Elem = By.xpath("//*[@id='aspnetForm']/main/header/div/div[2]/ul/li[3]");

	private By Click_New_Client2Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_btnAdd']");

	private By Click_on_Limited3Elem = By.xpath("/html/body/form/main/div[5]/div[3]/div/div[2]/div[1]");

	private By House_SearchElem = By.xpath("//INPUT[@placeholder='Search..']");
	

	private By Limited_CompanyElem = By.xpath("/html/body/form/main/div[5]/div[3]/div/div[3]/div/div[2]");
	
	private By Enter_Business_Name1Elem = By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_cPH_txtCompanyName\"]");

	private By Upload_BuissnessElem = By.xpath("//INPUT[@id='ctl00_ctl00_ParentContent_cPH_fuBusinessList']");

	private By upload_button_clickedElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnUpload']");

	private By Enter_Reg_Num2Elem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtRegNo']");

	private By Enter_Reg_Date3Elem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtCRegDate']");

	private By Enter_First_Name4Elem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtFirstName1']");

	private By Enter_Last_Name5Elem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtLastName1']");

	private By Create__Payroll__ProfileElem = By.xpath("//LABEL[contains(text(),'Create Payroll Profile')]");

	private By Checkbox__Payroll__ProfileElem = By.xpath("//label[normalize-space()= 'Create Payroll Profile']/../input");

	private By Click_buss_Save__btnElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnSave']");

	private By Click_Cancel_btnElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_btnCancel']");
	private By Click_CcheckboxElem=By.xpath("//*[@id='chkSingle']");
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AgentUI/CompanyAdd.aspx?menuid=0&ct=1");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AgentUI/CompanyAdd.aspx?menuid=0&ct=1");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AgentUI/CompanyAdd.aspx?menuid=0&ct=1");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
//   public void AssertUrl()
//    {
//        String currentUrl = m_Driver.getCurrentUrl();
//        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/AgentUI/CompanyAdd.aspx?menuid=0&ct=1";
//
//        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/AgentUI/CompanyAdd.aspx?menuid=0&ct=1")) {
//            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
//        }
//    }

     
	/**
 	 * Click Click_Plus_Sign1
	 * @throws IOException 
	 * @throws InterruptedException 
     * @name Click Click_Plus_Sign1
     */
	public void Click_Click_Plus_Sign1() throws IOException, InterruptedException
	{
        
		WebElement elem = getWebElement(Click_Plus_Sign1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Click_Plus_Sign1", "Click_Click_Plus_Sign1 failed. Unable to locate object: " + Click_Plus_Sign1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Click_Plus_Sign1", "Click_Click_Plus_Sign1 failed. Unable to locate object: " + Click_Plus_Sign1Elem.toString());

			Assert.fail("Unable to locate object: " + Click_Plus_Sign1Elem.toString());
        }

		ClosePopup.ValidateAndPopUp(m_Driver);
		
		
		elem.click();
		Thread.sleep(1000);
       utilities.PassScreenshot.Getscreenshot11("plusign clicked", "plusign");

		ExtentReportManager.passStep(m_Driver, "Click_Click_Plus_Sign1");

		TestModellerLogger.PassStep(m_Driver, "Click_Click_Plus_Sign1");
	}

     
	/**
 	 * Click Click_New_Client2
     * @name Click Click_New_Client2
     */
	public void Click_Click_New_Client2()
	{
        
		WebElement elem = getWebElement(Click_New_Client2Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Click_New_Client2", "Click_Click_New_Client2 failed. Unable to locate object: " + Click_New_Client2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Click_New_Client2", "Click_Click_New_Client2 failed. Unable to locate object: " + Click_New_Client2Elem.toString());

			Assert.fail("Unable to locate object: " + Click_New_Client2Elem.toString());
        }

		elem.click();
		utilities.PassScreenshot.Getscreenshot11("click on newclient" ,"NewClient");
          	

		ExtentReportManager.passStep(m_Driver, "Click_Click_New_Client2");

		TestModellerLogger.PassStep(m_Driver, "Click_Click_New_Client2");
	}

     
	/**
 	 * Click Click_on_Limited3
	 * @throws IOException 
	 * @throws InterruptedException 
     * @name Click Click_on_Limited3
     */
	public void Click_Click_on_Limited3() throws IOException, InterruptedException
	{
        
		WebElement elem = getWebElement(Click_on_Limited3Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Click_on_Limited3", "Click_Click_on_Limited3 failed. Unable to locate object: " + Click_on_Limited3Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Click_on_Limited3", "Click_Click_on_Limited3 failed. Unable to locate object: " + Click_on_Limited3Elem.toString());

			Assert.fail("Unable to locate object: " + Click_on_Limited3Elem.toString());
        }
      
			elem.click();
          
      
			
          	utilities.PassScreenshot.Getscreenshot11("limitedvisiblee", "Client type");
          	
          	
		ExtentReportManager.passStep(m_Driver, "Click_Click_on_Limited3");

		
	}

	public void Businessurl() throws InterruptedException
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AgentUI/chooseBusinessOptions.aspx?menuid=0&ct=1&import=0");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL","Go to URL - http://sandbox3.nomismasolution.co.uk/AgentUI/chooseBusinessOptions.aspx?menuid=0&ct=1&import=0");
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL","Go to URL -http://sandbox3.nomismasolution.co.uk/AgentUI/chooseBusinessOptions.aspx?menuid=0&ct=1&import=0");
					}
      
	/**
 	 * Enter House_Search
	 * @throws InterruptedException 
     * @name Enter House_Search
     */
 	public void Enter_House_Search(String House_Search) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(House_SearchElem);
 		

		if (elem == null) {
  		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_House_Search", "Enter_House_Search failed. Unable to locate object: " + House_SearchElem.toString());

   		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_House_Search", "Enter_House_Search failed. Unable to locate object: " + House_SearchElem.toString());

		Assert.fail("Unable to locate object: " + House_SearchElem.toString());
       }
		elem.sendKeys(House_Search);
		
		Thread.sleep(2000);
 	
		WebElement el2=m_Driver.findElement(By.xpath("//*[@id='tblCompanies']/tbody/tr[2]/td[1]"));
		companyname=el2.getText();
		System.out.println("company name is:"+companyname);
		jsExec.executeScript("arguments[0].click();",el2);
		
 	 		utilities.PassScreenshot.Getscreenshot11("companyclick", House_Search);
	    m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));
	    m_Driver.manage().window().setSize(d);
		  Thread.sleep(1000);
 		WebElement create=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHFooter_btnSave']")));
		jsExec.executeScript("arguments[0].scrollIntoView();", create);
 		create.click();
 		Thread.sleep(1000);
		utilities.PassScreenshot.Getscreenshot11("CreateCompany", House_Search);
		/*Search created company name*/
		
		m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_txtSearchCompany']")).sendKeys(companyname);
		WebElement el6=	jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_btnSearch']")));
		jsExec.executeScript("arguments[0].click()", el6);
		utilities.PassScreenshot.Getscreenshot11("ComSrh in businessDB", "House_Search");
		Thread.sleep(1000);
 		
 	
 	}
 	
 	
     
	/**
 	 * Click Limited Company
     * @name Click Limited Company
     */
	public void Click_Limited_Company()
	{
        
	WebElement elem = getWebElement(Limited_CompanyElem);

         
	        jsExec.executeScript("arguments[0].click()",elem);
           	m_Driver.findElement(By.xpath("/html/body/form/main/div[5]/div[3]/div/div[3]/div/div[2]/div/div[2]/div/a")).click();
           	utilities.PassScreenshot.Getscreenshot11("add company screen", "Addcompany");
	}

      
	/**
 	 * Enter Enter_Business_Name1
	 * @throws InterruptedException 
     * @name Enter Enter_Business_Name1
     */
 	public void Enter_Enter_Business_Name1(String Enter_Business_Name1) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(Enter_Business_Name1Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_Business_Name1", "Enter_Enter_Business_Name1 failed. Unable to locate object: " + Enter_Business_Name1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_Business_Name1", "Enter_Enter_Business_Name1 failed. Unable to locate object: " + Enter_Business_Name1Elem.toString());

 			Assert.fail("Unable to locate object: " + Enter_Business_Name1Elem.toString());
         }
 		
      businessname=Enter_Business_Name1;

 		elem.sendKeys(businessname);
 		Thread.sleep(1000);
    	utilities.PassScreenshot.Getscreenshot11("add LTD Comp screen", "Mannual");

  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_Business_Name1 " + Enter_Business_Name1);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_Business_Name1 " + Enter_Business_Name1);
		
 	}
 	
 	public static String business_rtn()
 	{
 		System.out.println("Return business");
 		return businessname;
 	}

     
	/**
 	 * Click Upload_Buissness
     * @name Click Upload_Buissness
     */
	public void Enter_Upload_Buissness(String Upload_Buissness)
	{
        
		WebElement elem = getWebElement(Upload_BuissnessElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Upload_Buissness", "Click_Upload_Buissness failed. Unable to locate object: " + Upload_BuissnessElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Upload_Buissness", "Click_Upload_Buissness failed. Unable to locate object: " + Upload_BuissnessElem.toString());

			Assert.fail("Unable to locate object: " + Upload_BuissnessElem.toString());
        }

		elem.sendKeys("Upload_Buissness");
		utilities.PassScreenshot.Getscreenshot11("Ltd company", "Uploadbusiness");

		ExtentReportManager.passStep(m_Driver, "Click_Upload_Buissness");

		TestModellerLogger.PassStep(m_Driver, "Click_Upload_Buissness");
	}

     
	/**
 	 * Click upload_button_clicked
     * @name Click upload_button_clicked
     */
	public void Click_upload_button_clicked()
	{
        
		WebElement elem = getWebElement(upload_button_clickedElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_upload_button_clicked", "Click_upload_button_clicked failed. Unable to locate object: " + upload_button_clickedElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_upload_button_clicked", "Click_upload_button_clicked failed. Unable to locate object: " + upload_button_clickedElem.toString());

			Assert.fail("Unable to locate object: " + upload_button_clickedElem.toString());
        }

		//elem.click();
		jsExec.executeScript("arguments[0].click()",elem);
          	
		utilities.PassScreenshot.Getscreenshot11("uploadedbuttn", "Uploadbusiness");
		ExtentReportManager.passStep(m_Driver, "Click_upload_button_clicked");

		TestModellerLogger.PassStep(m_Driver, "Click_upload_button_clicked");
	}

      
	/**
 	 * Enter Enter_Reg_Num2
     * @name Enter Enter_Reg_Num2
     */
 	public void Enter_Enter_Reg_Num2(String Enter_Reg_Num2)
 	{
 	    
 		WebElement elem = getWebElement(Enter_Reg_Num2Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_Reg_Num2", "Enter_Enter_Reg_Num2 failed. Unable to locate object: " + Enter_Reg_Num2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_Reg_Num2", "Enter_Enter_Reg_Num2 failed. Unable to locate object: " + Enter_Reg_Num2Elem.toString());

 			Assert.fail("Unable to locate object: " + Enter_Reg_Num2Elem.toString());
         }
 		elem.sendKeys(Enter_Reg_Num2);
//        if(c==8)
//        {
//       
// 	
//        	elem.sendKeys(reg);
//        }
//        else
//        {
//        	System.out.println("length is incorrect not 8");
//        }
    	utilities.PassScreenshot.Getscreenshot11("add 8 digitreg", "Mannual");

  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_Reg_Num2 " + Enter_Reg_Num2);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_Reg_Num2 " + Enter_Reg_Num2);
  		 		 	}

      
	/**
 	 * Enter Enter_Reg_Date3
     * @name Enter Enter_Reg_Date3
     */
 	public void Enter_Enter_Reg_Date3(String Enter_Reg_Date3)
 	{
 	    
 		WebElement elem = getWebElement(Enter_Reg_Date3Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_Reg_Date3", "Enter_Enter_Reg_Date3 failed. Unable to locate object: " + Enter_Reg_Date3Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_Reg_Date3", "Enter_Enter_Reg_Date3 failed. Unable to locate object: " + Enter_Reg_Date3Elem.toString());

 			Assert.fail("Unable to locate object: " + Enter_Reg_Date3Elem.toString());
         }

 		elem.sendKeys(Enter_Reg_Date3);
    	utilities.PassScreenshot.Getscreenshot11("add date", "Mannual");

  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_Reg_Date3 " + Enter_Reg_Date3);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_Reg_Date3 " + Enter_Reg_Date3);
 	}

      
	/**
 	 * Enter Enter_First_Name4
     * @name Enter Enter_First_Name4
     */
 	public void Enter_Enter_First_Name4(String Enter_First_Name4)
 	{
 	    
 		WebElement elem = getWebElement(Enter_First_Name4Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_First_Name4", "Enter_Enter_First_Name4 failed. Unable to locate object: " + Enter_First_Name4Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_First_Name4", "Enter_Enter_First_Name4 failed. Unable to locate object: " + Enter_First_Name4Elem.toString());

 			Assert.fail("Unable to locate object: " + Enter_First_Name4Elem.toString());
         }

 		elem.sendKeys(Enter_First_Name4);
 		
    	utilities.PassScreenshot.Getscreenshot11("Fname", "Mannual");

  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_First_Name4 " + Enter_First_Name4);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_First_Name4 " + Enter_First_Name4);
 	}

      
	/**
 	 * Enter Enter_Last_Name5
     * @name Enter Enter_Last_Name5
     */
 	public void Enter_Enter_Last_Name5(String Enter_Last_Name5)
 	{
 	    
 		WebElement elem = getWebElement(Enter_Last_Name5Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_Last_Name5", "Enter_Enter_Last_Name5 failed. Unable to locate object: " + Enter_Last_Name5Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_Last_Name5", "Enter_Enter_Last_Name5 failed. Unable to locate object: " + Enter_Last_Name5Elem.toString());

 			Assert.fail("Unable to locate object: " + Enter_Last_Name5Elem.toString());
         }

 		elem.sendKeys(Enter_Last_Name5);
    	utilities.PassScreenshot.Getscreenshot11("addLname", "Mannual");

  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_Last_Name5 " + Enter_Last_Name5);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_Last_Name5 " + Enter_Last_Name5);
 	}

     
	/**
 	 * Click Create _Payroll_ Profile
     * @name Click Create _Payroll_ Profile
     */
	public void Click_Create__Payroll__Profile()
	{
        
		WebElement elem = getWebElement(Create__Payroll__ProfileElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Create__Payroll__Profile", "Click_Create__Payroll__Profile failed. Unable to locate object: " + Create__Payroll__ProfileElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Create__Payroll__Profile", "Click_Create__Payroll__Profile failed. Unable to locate object: " + Create__Payroll__ProfileElem.toString());

			Assert.fail("Unable to locate object: " + Create__Payroll__ProfileElem.toString());
        }

		elem.click();
          	
    	utilities.PassScreenshot.Getscreenshot11("add payrolecompany", "Mannual");

		ExtentReportManager.passStep(m_Driver, "Click_Create__Payroll__Profile");

		TestModellerLogger.PassStep(m_Driver, "Click_Create__Payroll__Profile");
	}

     
	/**
 	 * Click Checkbox _Payroll_ Profile
     * @name Click Checkbox _Payroll_ Profile
     */
	public void Click_Checkbox__Payroll__Profile()
	{
        
		WebElement elem = getWebElement(Checkbox__Payroll__ProfileElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Checkbox__Payroll__Profile", "Click_Checkbox__Payroll__Profile failed. Unable to locate object: " + Checkbox__Payroll__ProfileElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Checkbox__Payroll__Profile", "Click_Checkbox__Payroll__Profile failed. Unable to locate object: " + Checkbox__Payroll__ProfileElem.toString());

			Assert.fail("Unable to locate object: " + Checkbox__Payroll__ProfileElem.toString());
        }

		elem.click();
    	utilities.PassScreenshot.Getscreenshot11("payrole chkbox", "Mannual");


		ExtentReportManager.passStep(m_Driver, "Click_Checkbox__Payroll__Profile");

		TestModellerLogger.PassStep(m_Driver, "Click_Checkbox__Payroll__Profile");
	}

     
	/**
 	 * Click Click_buss_Save _btn
	 * @throws InterruptedException 
	 * @throws IOException 
     * @name Click Click_buss_Save _btn
     */
	public void Click_Click_buss_Save__btn() throws InterruptedException, IOException
	{
        
		WebElement elem = getWebElement(Click_buss_Save__btnElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Click_buss_Save__btn", "Click_Click_buss_Save__btn failed. Unable to locate object: " + Click_buss_Save__btnElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Click_buss_Save__btn", "Click_Click_buss_Save__btn failed. Unable to locate object: " + Click_buss_Save__btnElem.toString());

			Assert.fail("Unable to locate object: " + Click_buss_Save__btnElem.toString());
        }

		//elem.click();
		jsExec.executeScript("arguments[0].click()", elem);
		Thread.sleep(2000);
		utilities.PassScreenshot.Getscreenshot11("comp added scucessfully","Mannual");
          	
			ExtentReportManager.passStep(m_Driver, "Click_Click_buss_Save__btn");

		TestModellerLogger.PassStep(m_Driver, "Click_Click_buss_Save__btn");
	}

     
	/**
 	 * Click Click_Cancel_btn
     * @name Click Click_Cancel_btn
     */
	public void Click_Click_Cancel_btn()
	{
        
		WebElement elem = getWebElement(Click_Cancel_btnElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Click_Cancel_btn", "Click_Click_Cancel_btn failed. Unable to locate object: " + Click_Cancel_btnElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Click_Cancel_btn", "Click_Click_Cancel_btn failed. Unable to locate object: " + Click_Cancel_btnElem.toString());

			Assert.fail("Unable to locate object: " + Click_Cancel_btnElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Click_Cancel_btn");

		TestModellerLogger.PassStep(m_Driver, "Click_Click_Cancel_btn");
	}
	
		public void Enter_Choosefile_toupload(String Choosefile_toupload) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(Choosefile_touploadElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Choosefile_toupload", "Enter_Choosefile_toupload failed. Unable to locate object: " + Choosefile_touploadElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Choosefile_toupload", "Enter_Choosefile_toupload failed. Unable to locate object: " + Choosefile_touploadElem.toString());

 			Assert.fail("Unable to locate object: " + Choosefile_touploadElem.toString());
         }
WebElement ele1=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div/div[3]/div/div[2]/div/div/div/input"));

 		ele1.sendKeys(Choosefile_toupload);
 		
 	//	utilities.PassScreenshot.Getscreenshot11("browsefile","Upload");
  		ExtentReportManager.passStep(m_Driver, "Enter_Choosefile_toupload " + Choosefile_toupload);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Choosefile_toupload " + Choosefile_toupload);
 	}
	public void Click_Click_Upload_btn() throws InterruptedException
	{
        
		WebElement elem = getWebElement(Click_Upload_btnElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Click_Upload_btn", "Click_Click_Upload_btn failed. Unable to locate object: " + Click_Upload_btnElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Click_Upload_btn", "Click_Click_Upload_btn failed. Unable to locate object: " + Click_Upload_btnElem.toString());

			Assert.fail("Unable to locate object: " + Click_Upload_btnElem.toString());
        }

		elem.click();
          	Thread.sleep(1000);
		utilities.PassScreenshot.Getscreenshot11("uploadedbuttonscucessfully","Upload");
		ExtentReportManager.passStep(m_Driver, "Click_Click_Upload_btn");

		TestModellerLogger.PassStep(m_Driver, "Click_Click_Upload_btn");
	}
	 
		/**
	 	 * Click click_arrow_download
	     * @name Click click_arrow_download
	     */
		public void Click_click_arrow_download()
		{
	        
			WebElement elem = getWebElement(click_arrow_downloadElem);

			if (elem == null) 
			{
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_click_arrow_download", "Click_click_arrow_download failed. Unable to locate object: " + click_arrow_downloadElem.toString());

	    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_click_arrow_download", "Click_click_arrow_download failed. Unable to locate object: " + click_arrow_downloadElem.toString());

				Assert.fail("Unable to locate object: " + click_arrow_downloadElem.toString());
	        }

			 elem.click();
	          	ExtentReportManager.passStep(m_Driver, "Click_click_arrow_download");

			TestModellerLogger.PassStep(m_Driver, "Click_click_arrow_download");
		}

		public void Click_CcheckboxElem() throws InterruptedException
		{
	        
			WebElement elem = getWebElement(Click_CcheckboxElem);
//
//			if (elem == null) 
//			{
//	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_CcheckboxElem", "Click_CcheckboxElem failed. Unable to locate object: " + Click_CcheckboxElem.toString());
//
//	    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_CcheckboxElem", "Click_CcheckboxElem failed. Unable to locate object: " + Click_CcheckboxElem.toString());
//
//				Assert.fail("Unable to locate object: " +Click_CcheckboxElem.toString());
//	        }

			elem.click();
			Thread.sleep(1000);
			m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_btnSave']")).click();
	       utilities.PassScreenshot.Getscreenshot11("import", "upload");

			ExtentReportManager.passStep(m_Driver, "Click_Click_Plus_Sign1");

			TestModellerLogger.PassStep(m_Driver, "Click_Click_Plus_Sign1");
		}
		
		public void Click_Createcompany() throws InterruptedException
		{
			m_Driver.findElement(By.xpath("//*[@id=\"aspnetForm\"]/main/header/div/div[2]/ul/li[1]/a")).click();
	 	 	m_Driver.findElement(By.xpath("//A[@id='ctl00_ctl00_ParentContent_btnAdd']")).click();
	 	 	m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnLimitedCompany']/div/div")).click();
	 	 	m_Driver.findElement(By.xpath("//INPUT[@placeholder='Search..']")).sendKeys("k");
	 	 	Thread.sleep(1000);
	 	   elem2=m_Driver.findElements(By.xpath("//*[@id='tblCompanies']/tbody/tr/td[1]"));
	 		int size=elem2.size();
	 		 System.out.println("list size is :" +size);
	 		for(i=2;i<size+1;i++)
	 		{
	 	 	
	 	 	m_Driver.findElement(By.xpath("//INPUT[@placeholder='Search..']")).sendKeys("k");
	 	 	
	   WebElement elem4=m_Driver.findElement(By.xpath("//*[@id='tblCompanies']/tbody/tr["+i+"]/td[1]"));
	  String comname=elem4.getText();

	 System.out.println("elements in grid" +comname);
	 jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//*[@id='tblCompanies']/tbody/tr["+i+"]/td[1]")));
	 	 		utilities.PassScreenshot.Getscreenshot11("companyclick"," House_Search");
	 	 		
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));
	 		WebElement create=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHFooter_btnSave']")));
			jsExec.executeScript("arguments[0].scrollIntoView();", create);
	 		create.click();
			utilities.PassScreenshot.Getscreenshot11("CreateCompany", "House_Search");
		}
		}
	 		public void bak_btn() throws InterruptedException
	 		{
	 	        
	 			WebElement elem=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHeaderRight_aBackButton']")));
	 			jsExec.executeScript("arguments[0].click();",elem);
	 			utilities.PassScreenshot.Getscreenshot11("back screen", "Back button click");
	 		}
	 		
	 		public void Click_Click_buss_Save__btn_payrol() throws InterruptedException, IOException
	 		{
	 	        
	 			WebElement elem = getWebElement(Click_buss_Save__btnElem);

	 			if (elem == null) {
	 	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Click_buss_Save__btn", "Click_Click_buss_Save__btn failed. Unable to locate object: " + Click_buss_Save__btnElem.toString());

	 	    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Click_buss_Save__btn", "Click_Click_buss_Save__btn failed. Unable to locate object: " + Click_buss_Save__btnElem.toString());

	 				Assert.fail("Unable to locate object: " + Click_buss_Save__btnElem.toString());
	 	        }
 			   jsExec.executeScript("arguments[0].click()", elem);
	 			Thread.sleep(2000);
	 			String businesearach=business_rtn();
	 			
	 				m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_txtSearchCompany']")).sendKeys(businesearach);
	 				Thread.sleep(2000);
	 			WebElement el7=	jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_btnSearch']")));
	 			jsExec.executeScript("arguments[0].click()", el7);
	 			utilities.PassScreenshot.Getscreenshot11("payroll created company search", "Payroll");
	 			
	 			ExtentReportManager.passStep(m_Driver, "Click_Click_buss_Save__btn_payrol");

	 			TestModellerLogger.PassStep(m_Driver, "Click_Click_buss_Save__btn_payrol");
	 		}
	 			
public void client_menu_housesearch() throws InterruptedException

{
		
WebElement e3=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_SideMenu1_businessMenu']/a/span"));
e3.click();
Thread.sleep(2000);
utilities.PassScreenshot.Getscreenshot11("Client clicked", "Leftside menu");
	
}
public void client_menu_newclienttab() throws InterruptedException

{
		
WebElement e3=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_btnAdd']"));
e3.click();
Thread.sleep(3000);
utilities.PassScreenshot.Getscreenshot11("New Client tab", "Leftside menu");
	
}

public void house_search1(String keywords) throws InterruptedException

{
	
	m_Driver.findElement(By.xpath("//*[@id='txtSearchCompany']")).sendKeys(keywords);
	Thread.sleep(2000);
	WebElement el2=m_Driver.findElement(By.xpath("//*[@id='tblCompanies']/tbody/tr[2]/td[1]"));
	el2.click();
	Thread.sleep(1000);
	utilities.PassScreenshot.Getscreenshot11("company cliclked", "Company House_Search");
	
	  m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));
	 
	  m_Driver.manage().window().setSize(d);
	  Thread.sleep(1000);
		WebElement create=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHFooter_btnSave']")));
		jsExec.executeScript("arguments[0].scrollIntoView();", create);
	
		utilities.PassScreenshot.Getscreenshot11("company information in popup", "Company detail popup");

     	
	
}
	 	
public void Enter_House_Search3(String House_Search) throws InterruptedException 
	{
	    
		WebElement elem = getWebElement(House_SearchElem);
		

	if (elem == null) {
		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_House_Search", "Enter_House_Search failed. Unable to locate object: " + House_SearchElem.toString());

		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_House_Search", "Enter_House_Search failed. Unable to locate object: " + House_SearchElem.toString());

	Assert.fail("Unable to locate object: " + House_SearchElem.toString());
   }
	elem.sendKeys(House_Search);
	
	Thread.sleep(2000);
	
	WebElement el2=m_Driver.findElement(By.xpath("//*[@id='tblCompanies']/tbody/tr[2]/td[1]"));
	companyname=el2.getText();
	System.out.println("company name is:"+companyname);
	jsExec.executeScript("arguments[0].click();",el2);
	
	 		utilities.PassScreenshot.Getscreenshot11("companyclick", House_Search);
   		
	
	}
	




}


	
