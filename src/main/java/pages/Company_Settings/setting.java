package pages.Company_Settings;

import pages.BasePage;

import java.awt.Dimension;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.exec.util.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.model.Test;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/8ed9a95f-9863-4597-b9c9-c62d9062ad28
@TestModellerModule(guid = "8ed9a95f-9863-4597-b9c9-c62d9062ad28")
public class setting extends BasePage
{
	List<WebElement> service;
	String date1,date2;
	int i;
	String listdata;
	public setting (WebDriver driver)
	{
		super(driver);
	}


	//private By Click_Settings__1Elem=By.xpath("//span[text()=’Setting’]");
	private By Click_Settings__1Elem = By.xpath("/html/body/form/main/div[11]/div[2]/ul/li[12]/a/span");

	private By Click_General_tab_2Elem = By.xpath("//*[@id='ctl00_cPH_tbContainer_TbGeneral_tab']");

	private By Click_Right_Edit_btn_3Elem = By.xpath("//*[@id='ctl00_cpHeaderRight_btnEdit']");

	private By Select_Services_4Elem = By.xpath("//label[normalize-space()= 'Services']/../../div[2]/select");

	private By Click_CompanyName_5Elem = By.xpath("//INPUT[@name='ctl00$cPH$tbContainer$TbGeneral$txtCompanyName']");

	private By Click_TradingName_6Elem = By.xpath("//INPUT[@name='ctl00$cPH$tbContainer$TbGeneral$txtTradingName']");

	private By Enter_Phone_7Elem = By.xpath("//INPUT[@name='ctl00$cPH$tbContainer$TbGeneral$txtPhone']");

	private By Enter_Email_address_8Elem = By.xpath("//label[normalize-space()= 'Email']/../../div[2]/input");

	private By Select_ACT_MGR_9Elem = By.xpath("//SELECT[@name='ctl00$cPH$tbContainer$TbGeneral$ddPrimaryUser']");

	private By Select_BusinessType_10Elem = By.xpath("//SELECT[@name='ctl00$cPH$tbContainer$TbGeneral$ddBusinessType']");

	private By Enter_Accountant_11Elem = By.xpath("//SELECT[@name='ctl00$cPH$tbContainer$TbGeneral$ddSecondaryUser']");

	private By Browse_FileUpload_12Elem = By.xpath("//INPUT[@name='ctl00$cPH$tbContainer$TbGeneral$FileUpload1']");

	private By Enter_RegNo_13Elem = By.xpath("//*[@id='ctl00_cPH_tbContainer_TbGeneral_txtRegNo']");

	private By Enter_RegDate_14Elem = By.xpath("//INPUT[@name='ctl00$cPH$tbContainer$TbGeneral$txtCRegDate']");

	private By Ennter_Address_15Elem = By.xpath("//*[@id='ctl00_cPH_tbContainer_TbGeneral_txtAddress1']");

	private By Enter_PostCode_16Elem = By.xpath("//*[@id='ctl00_cPH_tbContainer_TbGeneral_txtPostCode']");

	private By Enter_TradingDate_17Elem = By.xpath("//INPUT[@name='ctl00$cPH$tbContainer$TbGeneral$txtTradingDate']");

	private By Click_CeaseDate_18Elem = By.xpath("//*[@id='ctl00_cPH_tbContainer_TbGeneral_txtTradingDate']");

	private By Click_Save__bttn_19Elem = By.xpath("//*[@id='ctl00_cPH_tbContainer_TbGeneral_btnGSave']");


	
	public void GoToUrl()
	{
		m_Driver.get("chrome-extension://chjoanbbbllaihmkkcokfkaojegehmaa/main_page.html#");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - chrome-extension://chjoanbbbllaihmkkcokfkaojegehmaa/main_page.html#");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - chrome-extension://chjoanbbbllaihmkkcokfkaojegehmaa/main_page.html#");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "chrome-extension://chjoanbbbllaihmkkcokfkaojegehmaa/main_page.html#";

        if (!currentUrl.equals("chrome-extension://chjoanbbbllaihmkkcokfkaojegehmaa/main_page.html#")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click Click_Settings _1
     * @name Click Click_Settings _1
     */
	public void Click_Click_Settings__1()
	{
        
		WebElement elem = getWebElement(Click_Settings__1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Click_Settings__1", "Click_Click_Settings__1 failed. Unable to locate object: " + Click_Settings__1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Click_Settings__1", "Click_Click_Settings__1 failed. Unable to locate object: " + Click_Settings__1Elem.toString());

			Assert.fail("Unable to locate object: " + Click_Settings__1Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Click_Settings__1");

		TestModellerLogger.PassStep(m_Driver, "Click_Click_Settings__1");
	}

     
	/**
 	 * Click Click_General_tab_2
     * @name Click Click_General_tab_2
     */
	public void Click_Click_General_tab_2()
	{
        
		WebElement elem = getWebElement(Click_General_tab_2Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Click_General_tab_2", "Click_Click_General_tab_2 failed. Unable to locate object: " + Click_General_tab_2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Click_General_tab_2", "Click_Click_General_tab_2 failed. Unable to locate object: " + Click_General_tab_2Elem.toString());

			Assert.fail("Unable to locate object: " + Click_General_tab_2Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Click_General_tab_2");

		TestModellerLogger.PassStep(m_Driver, "Click_Click_General_tab_2");
	}

     
	/**
 	 * Click Click_Right_Edit_btn_3
     * @name Click Click_Right_Edit_btn_3
     */
	public void Click_Click_Right_Edit_btn_3()
	{
        
		WebElement elem = getWebElement(Click_Right_Edit_btn_3Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Click_Right_Edit_btn_3", "Click_Click_Right_Edit_btn_3 failed. Unable to locate object: " + Click_Right_Edit_btn_3Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Click_Right_Edit_btn_3", "Click_Click_Right_Edit_btn_3 failed. Unable to locate object: " + Click_Right_Edit_btn_3Elem.toString());

			Assert.fail("Unable to locate object: " + Click_Right_Edit_btn_3Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Click_Right_Edit_btn_3");

		TestModellerLogger.PassStep(m_Driver, "Click_Click_Right_Edit_btn_3");
	}

    
	/**
 	 * Select Select_Services_4
	 * @throws InterruptedException 
     * @name Select Select_Services_4
     */
    public void Select_Select_Services_4(String Select_Services_4) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(Select_Services_4Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Select_Services_4", "Select_Select_Services_4 failed. Unable to locate object: " + Select_Services_4Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Select_Services_4", "Select_Select_Services_4 failed. Unable to locate object: " + Select_Services_4Elem.toString());

 			Assert.fail("Unable to locate object: " + Select_Services_4Elem.toString());
         }
 		elem.sendKeys(Keys.ARROW_DOWN);

// 		Select dropdown = new Select(elem);
//
// 		dropdown.selectByVisibleText(Select_Services_4);

 		
 		ExtentReportManager.passStep(m_Driver, "Select_Select_Services_4 " + Select_Services_4);

 		TestModellerLogger.PassStep(m_Driver, "Select_Select_Services_4 " + Select_Services_4);
 	}

      
	/**
 	 * Enter Click_CompanyName_5
     * @name Enter Click_CompanyName_5
     */
 	public void Enter_Click_CompanyName_5(String Click_CompanyName_5)
 	{
 	    
 		WebElement elem = getWebElement(Click_CompanyName_5Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Click_CompanyName_5", "Enter_Click_CompanyName_5 failed. Unable to locate object: " + Click_CompanyName_5Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Click_CompanyName_5", "Enter_Click_CompanyName_5 failed. Unable to locate object: " + Click_CompanyName_5Elem.toString());

 			Assert.fail("Unable to locate object: " + Click_CompanyName_5Elem.toString());
         }

 		elem.sendKeys(Click_CompanyName_5);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Click_CompanyName_5 " + Click_CompanyName_5);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Click_CompanyName_5 " + Click_CompanyName_5);
 	}

      
	/**
 	 * Enter Click_TradingName_6
     * @name Enter Click_TradingName_6
     */
 	public void Enter_Click_TradingName_6(String Click_TradingName_6)
 	{
 	    
 		WebElement elem = getWebElement(Click_TradingName_6Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Click_TradingName_6", "Enter_Click_TradingName_6 failed. Unable to locate object: " + Click_TradingName_6Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Click_TradingName_6", "Enter_Click_TradingName_6 failed. Unable to locate object: " + Click_TradingName_6Elem.toString());

 			Assert.fail("Unable to locate object: " + Click_TradingName_6Elem.toString());
         }

 		elem.sendKeys(Click_TradingName_6);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Click_TradingName_6 " + Click_TradingName_6);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Click_TradingName_6 " + Click_TradingName_6);
 	}

      
	/**
 	 * Enter Enter_Phone_7
     * @name Enter Enter_Phone_7
     */
 	public void Enter_Enter_Phone_7(String Enter_Phone_7)
 	{
 	    
 		WebElement elem = getWebElement(Enter_Phone_7Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_Phone_7", "Enter_Enter_Phone_7 failed. Unable to locate object: " + Enter_Phone_7Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_Phone_7", "Enter_Enter_Phone_7 failed. Unable to locate object: " + Enter_Phone_7Elem.toString());

 			Assert.fail("Unable to locate object: " + Enter_Phone_7Elem.toString());
         }

 		elem.sendKeys(Enter_Phone_7);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_Phone_7 " + Enter_Phone_7);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_Phone_7 " + Enter_Phone_7);
 	}

      
	/**
 	 * Enter Enter_Email_address_8
     * @name Enter Enter_Email_address_8
     */
 	public void Enter_Enter_Email_address_8(String Enter_Email_address_8)
 	{
 	    
 		WebElement elem = getWebElement(Enter_Email_address_8Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_Email_address_8", "Enter_Enter_Email_address_8 failed. Unable to locate object: " + Enter_Email_address_8Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_Email_address_8", "Enter_Enter_Email_address_8 failed. Unable to locate object: " + Enter_Email_address_8Elem.toString());

 			Assert.fail("Unable to locate object: " + Enter_Email_address_8Elem.toString());
         }

 		elem.sendKeys(Enter_Email_address_8);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_Email_address_8 " + Enter_Email_address_8);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_Email_address_8 " + Enter_Email_address_8);
 	}

    
	/**
 	 * Select Select_ACT_MGR_9
     * @name Select Select_ACT_MGR_9
     */
    public void Select_Select_ACT_MGR_9(String Select_ACT_MGR_9)
 	{
 	    
 		WebElement elem = getWebElement(Select_ACT_MGR_9Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Select_ACT_MGR_9", "Select_Select_ACT_MGR_9 failed. Unable to locate object: " + Select_ACT_MGR_9Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Select_ACT_MGR_9", "Select_Select_ACT_MGR_9 failed. Unable to locate object: " + Select_ACT_MGR_9Elem.toString());

 			Assert.fail("Unable to locate object: " + Select_ACT_MGR_9Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Select_ACT_MGR_9);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Select_ACT_MGR_9 " + Select_ACT_MGR_9);

 		TestModellerLogger.PassStep(m_Driver, "Select_Select_ACT_MGR_9 " + Select_ACT_MGR_9);
 	}

    
	/**
 	 * Select Select_BusinessType_10
     * @name Select Select_BusinessType_10
     */
    public void Select_Select_BusinessType_10(String Select_BusinessType_10)
 	{
 	    
 		WebElement elem = getWebElement(Select_BusinessType_10Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Select_BusinessType_10", "Select_Select_BusinessType_10 failed. Unable to locate object: " + Select_BusinessType_10Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Select_BusinessType_10", "Select_Select_BusinessType_10 failed. Unable to locate object: " + Select_BusinessType_10Elem.toString());

 			Assert.fail("Unable to locate object: " + Select_BusinessType_10Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Select_BusinessType_10);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Select_BusinessType_10 " + Select_BusinessType_10);

 		TestModellerLogger.PassStep(m_Driver, "Select_Select_BusinessType_10 " + Select_BusinessType_10);
 	}

    
	/**
 	 * Select Enter_Accountant_11
     * @name Select Enter_Accountant_11
     */
    public void Select_Enter_Accountant_11(String Enter_Accountant_11)
 	{
 	    
 		WebElement elem = getWebElement(Enter_Accountant_11Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Enter_Accountant_11", "Select_Enter_Accountant_11 failed. Unable to locate object: " + Enter_Accountant_11Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Enter_Accountant_11", "Select_Enter_Accountant_11 failed. Unable to locate object: " + Enter_Accountant_11Elem.toString());

 			Assert.fail("Unable to locate object: " + Enter_Accountant_11Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Enter_Accountant_11);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Enter_Accountant_11 " + Enter_Accountant_11);

 		TestModellerLogger.PassStep(m_Driver, "Select_Enter_Accountant_11 " + Enter_Accountant_11);
 	}

      
	/**
 	 * Enter Browse_FileUpload_12
     * @name Enter Browse_FileUpload_12
     */
 	public void Enter_Browse_FileUpload_12(String Browse_FileUpload_12)
 	{
 	    
 		WebElement elem = getWebElement(Browse_FileUpload_12Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Browse_FileUpload_12", "Enter_Browse_FileUpload_12 failed. Unable to locate object: " + Browse_FileUpload_12Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Browse_FileUpload_12", "Enter_Browse_FileUpload_12 failed. Unable to locate object: " + Browse_FileUpload_12Elem.toString());

 			Assert.fail("Unable to locate object: " + Browse_FileUpload_12Elem.toString());
         }

 		elem.sendKeys(Browse_FileUpload_12);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Browse_FileUpload_12 " + Browse_FileUpload_12);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Browse_FileUpload_12 " + Browse_FileUpload_12);
 	}

      
	/**
 	 * Enter Enter_RegNo_13
     * @name Enter Enter_RegNo_13
     */
 	public void Enter_Enter_RegNo_13(String Enter_RegNo_13)
 	{
 	    
 		WebElement elem = getWebElement(Enter_RegNo_13Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_RegNo_13", "Enter_Enter_RegNo_13 failed. Unable to locate object: " + Enter_RegNo_13Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_RegNo_13", "Enter_Enter_RegNo_13 failed. Unable to locate object: " + Enter_RegNo_13Elem.toString());

 			Assert.fail("Unable to locate object: " + Enter_RegNo_13Elem.toString());
         }
 		elem.click();
 		elem.sendKeys(Keys.CONTROL,"a",Keys.DELETE);
 		elem.sendKeys(Enter_RegNo_13);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_RegNo_13 " + Enter_RegNo_13);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_RegNo_13 " + Enter_RegNo_13);
 	}

      
	/**
 	 * Enter Enter_RegDate_14
	 * @throws InterruptedException 
     * @name Enter Enter_RegDate_14
     */
 	public void Enter_Enter_RegDate_14(String Enter_RegDate_14) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(Enter_RegDate_14Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_RegDate_14", "Enter_Enter_RegDate_14 failed. Unable to locate object: " + Enter_RegDate_14Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_RegDate_14", "Enter_Enter_RegDate_14 failed. Unable to locate object: " + Enter_RegDate_14Elem.toString());

 			Assert.fail("Unable to locate object: " + Enter_RegDate_14Elem.toString());
         }
    elem.sendKeys(Keys.CONTROL,"a",Keys.DELETE);
    Thread.sleep(1000);
 		elem.sendKeys(Enter_RegDate_14);
 		utilities.PassScreenshot.Getscreenshot11("Enter regdate", "Edit Setting");
		elem.sendKeys(Keys.TAB);
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_RegDate_14 " + Enter_RegDate_14);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_RegDate_14 " + Enter_RegDate_14);
 	}

      
	/**
 	 * Enter Ennter_Address_15
     * @name Enter Ennter_Address_15
     */
 	public void Enter_Ennter_Address_15(String Ennter_Address_15)
 	{
 	    
 		WebElement elem = getWebElement(Ennter_Address_15Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Ennter_Address_15", "Enter_Ennter_Address_15 failed. Unable to locate object: " + Ennter_Address_15Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Ennter_Address_15", "Enter_Ennter_Address_15 failed. Unable to locate object: " + Ennter_Address_15Elem.toString());

 			Assert.fail("Unable to locate object: " + Ennter_Address_15Elem.toString());
         }

 		elem.sendKeys(Ennter_Address_15);
 		elem.sendKeys(Keys.TAB);
 		elem.sendKeys(Keys.TAB);
 		elem.sendKeys(Keys.TAB);
 		elem.sendKeys(Keys.TAB);
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Ennter_Address_15 " + Ennter_Address_15);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Ennter_Address_15 " + Ennter_Address_15);
 	}

      
	/**
 	 * Enter Enter_PostCode_16
     * @name Enter Enter_PostCode_16
     */
 	public void Enter_Enter_PostCode_16(String Enter_PostCode_16)
 	{
 	    
 		WebElement elem = getWebElement(Enter_PostCode_16Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_PostCode_16", "Enter_Enter_PostCode_16 failed. Unable to locate object: " + Enter_PostCode_16Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_PostCode_16", "Enter_Enter_PostCode_16 failed. Unable to locate object: " + Enter_PostCode_16Elem.toString());

 			Assert.fail("Unable to locate object: " + Enter_PostCode_16Elem.toString());
         }

 		//elem.click();
 		elem.sendKeys(Keys.CONTROL,"a",Keys.DELETE);
 		elem.sendKeys(Enter_PostCode_16);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_PostCode_16 " + Enter_PostCode_16);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_PostCode_16 " + Enter_PostCode_16);
 	}

      
	/**
 	 * Enter Enter_TradingDate_17
     * @name Enter Enter_TradingDate_17
     */
 	public void Enter_Enter_TradingDate_17(String Enter_TradingDate_17)
 	{
 	    
 		WebElement elem = getWebElement(Enter_TradingDate_17Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_TradingDate_17", "Enter_Enter_TradingDate_17 failed. Unable to locate object: " + Enter_TradingDate_17Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_TradingDate_17", "Enter_Enter_TradingDate_17 failed. Unable to locate object: " + Enter_TradingDate_17Elem.toString());

 			Assert.fail("Unable to locate object: " + Enter_TradingDate_17Elem.toString());
         }

 		elem.sendKeys(Enter_TradingDate_17);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_TradingDate_17 " + Enter_TradingDate_17);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_TradingDate_17 " + Enter_TradingDate_17);
 	}

     
	/**
 	 * Click Click_CeaseDate_18
	 * @throws InterruptedException 
     * @name Click Click_CeaseDate_18
     */
	public void Click_Click_CeaseDate_18(String nomismadate) throws InterruptedException
	{
        
		WebElement elem = getWebElement(Click_CeaseDate_18Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Click_CeaseDate_18", "Click_Click_CeaseDate_18 failed. Unable to locate object: " + Click_CeaseDate_18Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Click_CeaseDate_18", "Click_Click_CeaseDate_18 failed. Unable to locate object: " + Click_CeaseDate_18Elem.toString());

			Assert.fail("Unable to locate object: " + Click_CeaseDate_18Elem.toString());
        }
		 elem.sendKeys(Keys.CONTROL,"a",Keys.DELETE);
		    Thread.sleep(1000);
		elem.sendKeys(nomismadate);
		utilities.PassScreenshot.Getscreenshot11("Enter nomismadate", "Edit Setting");
		elem.sendKeys(Keys.TAB);
          	

		ExtentReportManager.passStep(m_Driver, "Click_Click_CeaseDate_18");

		TestModellerLogger.PassStep(m_Driver, "Click_Click_CeaseDate_18");
	}

     
	/**
 	 * Click Click_Save _bttn_19
	 * @throws InterruptedException 
     * @name Click Click_Save _bttn_19
     */
	public void Click_Click_Save__bttn_19() throws InterruptedException
	{
        
		WebElement elem = getWebElement(Click_Save__bttn_19Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Click_Save__bttn_19", "Click_Click_Save__bttn_19 failed. Unable to locate object: " + Click_Save__bttn_19Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Click_Save__bttn_19", "Click_Click_Save__bttn_19 failed. Unable to locate object: " + Click_Save__bttn_19Elem.toString());

			Assert.fail("Unable to locate object: " + Click_Save__bttn_19Elem.toString());
        }

		//elem.click();
		jsExec.executeScript("arguments[0].click()",elem);
		Thread.sleep(1000);
	
		ExtentReportManager.passStep(m_Driver, "Click_Click_Save__bttn_19");

		TestModellerLogger.PassStep(m_Driver, "Click_Click_Save__bttn_19");
	}
	
	public void editservice() throws InterruptedException
	{
	    WebElement edit=m_Driver.findElement(By.xpath("//*[@id='ctl00_cpHeaderRight_btnEdit']"));
	    edit.click();
	    /*//label[normalize-space()= 'Services']/../../div[2]/select/option*/
		m_Driver.findElement(By.xpath("//label[normalize-space()= 'Services']/../../div[2]/select")).click();
		service= m_Driver.findElements(By.xpath("//label[normalize-space()= 'Services']/../../div[2]/select/option"));
		ArrayList<String> pageDd = new ArrayList<String>();
		int j=0;
		for(WebElement eachelement:service)
		{
			
		//pageDd.add(eachelement.get
			pageDd.add(j, eachelement.getText());
		 System.out.print("\n "   +eachelement.getText());
		 j++;
	}

		i=0;
		
		for(String eachVal:pageDd)
		{
			if(i!=0)
			{
		edit=m_Driver.findElement(By.xpath("//*[@id='ctl00_cpHeaderRight_btnEdit']"));
		    edit.click();
			}
			System.out.print("helllo"+eachVal);
			new Select(m_Driver.findElement(By.xpath("//label[normalize-space()= 'Services']/../../div[2]/select"))).selectByVisibleText(eachVal);
			//new Select(m_Driver.findElement(By.xpath("//label[normalize-space()= 'Services']/../../div[2]/select"))).selectByVisibleText("Bookkeeping");
			//Thread.sleep(400);
		    m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_tbContainer_TbGeneral_btnGSave']")).click();//Click on go
		
		    utilities.PassScreenshot.Getscreenshot11("L.H.S menu remove as per selection"+i+"shot","EDIT Setting");
		 	    	
		    i++;
		    	  		      Thread.sleep(1000);
		}
					}
	
	public void Enter_Negative_RegNo_13() throws InterruptedException
 	{
 	    
 		WebElement elem =m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_tbContainer_TbGeneral_txtPostCode']"));
 		String code=elem.getAttribute("value");
 		 if(code.isBlank() || code.length()<8)
 		 { 
 			System.out.println("Check RegNo either blank or length less than 8");
	    	  utilities.PassScreenshot.Getscreenshot11(" blank reg number", "Edit Setting");
	    	  Thread.sleep(1000);
	    	  elem.sendKeys("90909890");
	    	  
	    	  utilities.PassScreenshot.Getscreenshot11(" Enter 8 digit number", "Edit Setting");
 			 
 		 }
 		
 		
 	}
	public void Enter_Negative_Address_15() throws InterruptedException
 	{
 	    
 		WebElement elem=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_tbContainer_TbGeneral_txtAddress1']"));
 		String add=elem.getAttribute("value");
 	       if (add.isEmpty())
 	       {
 	    	 
 	    	   System.out.println("Address field is empty currenly");
 	    	  utilities.PassScreenshot.Getscreenshot11(" address currenly empty", "Edit Setting");
 	    	 Thread.sleep(1000);
 	    		elem.sendKeys(Keys.CONTROL,"a",Keys.DELETE);
 	    	   elem.sendKeys("adress1adress");
 				utilities.PassScreenshot.Getscreenshot11("Address is enter now in address filed", "Edit Setting");
 	       }
 	}
 		
 	      public void Enter_postcode_RegNo_13() throws InterruptedException
 	  	{
 	  	    
 	  		WebElement elem =m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_tbContainer_TbGeneral_txtPostCode']"));
 	  		String code=elem.getAttribute("value");
 	  		 if(code.isBlank())
 	  		 {
 	  			System.out.println("Post code is blank");
 	 	    	  utilities.PassScreenshot.Getscreenshot11(" blank postcode field", "Edit Setting");
 	 	    	  Thread.sleep(1000);
 	 	    	elem.sendKeys(Keys.CONTROL,"a",Keys.DELETE);
 	 	    	  elem.sendKeys("SW1W 0NY");
 	 	    	  
 	 	    	  utilities.PassScreenshot.Getscreenshot11("postcode entereed now in postcode field", "Edit Setting");
 	  			 
 	  		 }
 	  	}

 	  		public void Enter_Negative_Email_address_8() throws InterruptedException
 	  	 	{
 	  			WebElement edit=m_Driver.findElement(By.xpath("//*[@id='ctl00_cpHeaderRight_btnEdit']"));
 	  		    edit.click();
 	  		    
 	  		 WebElement elem=m_Driver.findElement(By.xpath("//label[normalize-space()= 'Services']/../../div[2]/select"));
 	  		 elem.sendKeys(Keys.TAB);
 	  		elem.sendKeys(Keys.TAB);
 	  		elem.sendKeys(Keys.TAB);
 	  		 m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_tbContainer_TbGeneral_txtEmail']"));
 	  		    /*//label[normalize-space()= 'Services']/../../div[2]/select/option*/
 	  			
 	  			//service= m_Driver.findElements(By.xpath("//label[normalize-space()= 'Services']/../../div[2]/select/option"));
 	  			ArrayList<String> pageDd = new ArrayList<String>();
 	  						//pageDd.add(j, eachelement.getText());
 	  				pageDd.add(1,"nidhi.sharamh@nomisma.co.uk");  
 	  				pageDd.add(2,"nidhi@gmail.com");  
 	  				pageDd.add(3,"nidhi@cous");  
 	  		    i=0;
 	  			
 	  			for(String eachVal:pageDd)
 	  			{
 	  				
 	  				if(i!=0)
 	  				{
 	  			edit=m_Driver.findElement(By.xpath("//*[@id='ctl00_cpHeaderRight_btnEdit']"));
 	  			    edit.click();
 	  				}
 	  				System.out.print("helllo"+eachVal);
// 	  				WebElement elem=m_Driver.findElement(By.xpath("//label[normalize-space()= 'Services']/../../div[2]/select"));
// 	  				elem.click();
// 	  			   elem.sendKeys(Keys.ARROW_DOWN);
 	  				
 	  		m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_tbContainer_TbGeneral_txtEmail']")).sendKeys("eachvalue");
 	  				//new Select(m_Driver.findElement(By.xpath("//label[normalize-space()= 'Services']/../../div[2]/select"))).selectByVisibleText("Bookkeeping");
 	  				//Thread.sleep(400);
 	  			    m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_tbContainer_TbGeneral_btnGSave']")).click();//Click on go
 	  			
 	  			    utilities.PassScreenshot.Getscreenshot11("L.H.S menu remove as per selection"+i+"shot","EDIT Setting");
 	  			 	    	
 	  			    i++;
 	  			    	  		      Thread.sleep(1000);
 	  			}
 	  	 	}
 	  		
 	  		public void date_validation() throws ParseException, InterruptedException
 	  		{
 	  			WebElement elem1=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_tbContainer_TbGeneral_txtCRegDate']"));/*registration date*/
 	  			
 	  			WebElement elem2=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_tbContainer_TbGeneral_txtTradingDate']"));/*nomisma startdate date*/
 	  			
 	  			date1=elem1.getText();
 	  			
 	  			date2=elem2.getText();
 	  					Thread.sleep(2000);
 	  			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
 	  			Date d1 = sdf.parse(date1);
 	  			Date d2=sdf.parse(date2);
 	  		    
                    Assert.assertTrue(d2.after(d1));

 	  			utilities.PassScreenshot.Getscreenshot11("nomisma date should be less then reg date", "Date Validation");
 	  			
 	  			
 	  			
 	  			 	  			
 	  		}
 	  		
 	  		
 	  		
 	  		
}

 	  	