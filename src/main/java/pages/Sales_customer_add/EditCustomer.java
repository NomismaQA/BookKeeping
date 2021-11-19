package pages.Sales_customer_add;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/7a2aab53-663e-4bcc-88fd-f33062a25964
@TestModellerModule(guid = "7a2aab53-663e-4bcc-88fd-f33062a25964")
public class EditCustomer extends BasePage
{
	public EditCustomer (WebDriver driver)
	{
		super(driver);
	}


	private By Delete_btn_after_del_ClickElem = By.xpath("//A[@id='ctl00_cphFooter_btnDelete']");
	private By Edit_Icon_Clicked1Elem = By.xpath("//*[@id='ctl00_cPH_divLimited']/div/table/tbody/tr[2]/td[7]");

	private By Delete_Icon_ClickedElem = By.xpath("//*[@id='ctl00_cPH_divLimited']/div/table/tbody/tr[1]/td[8]");

	private By Edit_CustomerName1Elem = By.xpath("//label[normalize-space()= 'Business Name: *']/../../div[2]/div/input");

	private By Edit_ContactName2Elem = By.xpath("//label[normalize-space()= 'First Name:']/../../div[2]/input");

	private By Edit_ContactLastName3Elem = By.xpath("//label[normalize-space()= 'Last Name:']/../../div[2]/input");

	private By Edit_Phone4Elem = By.xpath("//label[normalize-space()= 'Phone:']/../../div[2]/input");

	private By Edit_Email5Elem = By.xpath("//label[normalize-space()= 'Email:']/../../div[2]/textarea");

	private By Edit_6_Address1Elem = By.xpath("//label[normalize-space()= 'Address Line 1:']/../../div[2]/input");

	private By Edit_6_Address2Elem = By.xpath("//label[normalize-space()= 'Address Line 2:']/../../div[2]/input");

	private By Edit_6_Address1_1Elem = By.xpath("//label[normalize-space()= 'City:']/../../div[2]/input");

	private By Edit_7_CountyElem = By.xpath("//label[normalize-space()= 'County:']/../../div[2]/input");

	private By Edit_PostCode_8Elem = By.xpath("//label[normalize-space()= 'Postcode:']/../../div[2]/input");

	private By Edit__Save9Elem = By.xpath("//A[@id='ctl00_cphFooter_btnSave']");

	private By Edit_Click_Image_more10Elem = By.xpath("//IMG[@id='imgMore']");

	private By Edit_Click_Ref11Elem = By.xpath("//label[normalize-space()= 'Ref No:']/../../div[2]/input");

	private By Edit_Click_check_box_no12Elem = By.xpath("//label[normalize-space()= 'No']/../input");

	private By Edit_Click_check_box_yes12Elem = By.xpath("//LABEL[@for='ctl00_cPH_rblVatNoSupplied_1']");

	private By Edit_Click_Vat13Elem = By.xpath("//label[normalize-space()= 'VAT No:*']/../../div[2]/input");

	private By Edit_select_CustomerType14Elem = By.xpath("//label[normalize-space()= 'Customer Type:']/../../div[2]/select");

	private By Edit_Select_Cust_Busi_Type15Elem = By.xpath("//label[normalize-space()= 'Business Type:']/../../div[2]/select");

	private By Edit_Enter_Note16Elem = By.xpath("//label[normalize-space()= 'Notes:']/../../div[2]/textarea");

	private By Edit_enter_Payment17Elem = By.xpath("//SELECT[@name='ctl00$cPH$ddPayment']");

	private By Edit_edger18Elem = By.xpath("//label[normalize-space()= 'Ledger:']/../../div[2]/select");

	private By Edit_Credit_ControlStatusType19Elem = By.xpath("//SELECT[@name='ctl00$cPH$ddlCreditControlStatusType']");

	private By Edit_Currency20Elem = By.xpath("//label[normalize-space()= 'Currency:']/../../div[2]/select");

	private By Edit_closecorss21Elem = By.xpath("//BUTTON[@id='cboxClose']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AccountUI/Customer.aspx?FYCode=54391&CompanyCode=13312&menuid=0&cn=&at=&dd=CustomerName&do=%3e&pt=0&crm=0&ccst=0");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/Customer.aspx?FYCode=54391&CompanyCode=13312&menuid=0&cn=&at=&dd=CustomerName&do=%3e&pt=0&crm=0&ccst=0");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/Customer.aspx?FYCode=54391&CompanyCode=13312&menuid=0&cn=&at=&dd=CustomerName&do=%3e&pt=0&crm=0&ccst=0");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/AccountUI/Customer.aspx?FYCode=54391&CompanyCode=13312&menuid=0&cn=&at=&dd=CustomerName&do=%3e&pt=0&crm=0&ccst=0";

        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/AccountUI/Customer.aspx?FYCode=54391&CompanyCode=13312&menuid=0&cn=&at=&dd=CustomerName&do=%3e&pt=0&crm=0&ccst=0")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click Edit_Icon_Clicked1
     * @name Click Edit_Icon_Clicked1
     */
	public void Click_Edit_Icon_Clicked1()
	{
        
		WebElement elem = getWebElement(Edit_Icon_Clicked1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Edit_Icon_Clicked1", "Click_Edit_Icon_Clicked1 failed. Unable to locate object: " + Edit_Icon_Clicked1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Edit_Icon_Clicked1", "Click_Edit_Icon_Clicked1 failed. Unable to locate object: " + Edit_Icon_Clicked1Elem.toString());

			Assert.fail("Unable to locate object: " + Edit_Icon_Clicked1Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Edit_Icon_Clicked1");

		TestModellerLogger.PassStep(m_Driver, "Click_Edit_Icon_Clicked1");
	}

     
	/**
 	 * Click Delete_Icon_Clicked
	 * @throws InterruptedException 
     * @name Click Delete_Icon_Clicked
     */
	public void Click_Delete_Icon_Clicked() throws InterruptedException
	{
        
		WebElement elem = getWebElement(Delete_Icon_ClickedElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Delete_Icon_Clicked", "Click_Delete_Icon_Clicked failed. Unable to locate object: " + Delete_Icon_ClickedElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Delete_Icon_Clicked", "Click_Delete_Icon_Clicked failed. Unable to locate object: " + Delete_Icon_ClickedElem.toString());

			Assert.fail("Unable to locate object: " + Delete_Icon_ClickedElem.toString());
        }

		elem.click();
		Thread.sleep(2000);
		//		m_Driver.findElement(By.xpath("//*[@id='ctl00_cphFooter_btnDelete']")).click();
		
          	

		ExtentReportManager.passStep(m_Driver, "Click_Delete_Icon_Clicked");

		TestModellerLogger.PassStep(m_Driver, "Click_Delete_Icon_Clicked");
	}
	/**
 	 * Click Delete_btn_after_del_Click
     * @name Click Delete_btn_after_del_Click
     */
	public void Click_Delete_btn_after_del_Click()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(Delete_btn_after_del_ClickElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Delete_btn_after_del_Click", "Click_Delete_btn_after_del_Click failed. Unable to locate object: " + Delete_btn_after_del_ClickElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Delete_btn_after_del_Click", "Click_Delete_btn_after_del_Click failed. Unable to locate object: " + Delete_btn_after_del_ClickElem.toString());

			Assert.fail("Unable to locate object: " + Delete_btn_after_del_ClickElem.toString());
        }

		elem.click();
        
		utilities.PassScreenshot.Getscreenshot11("Delete busineess", "Delete Business");
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_Delete_btn_after_del_Click");

		TestModellerLogger.PassStep(m_Driver, "Click_Delete_btn_after_del_Click");
	}


      
	/**
 	 * Enter Edit_CustomerName1
     * @name Enter Edit_CustomerName1
     */
 	public void Enter_Edit_CustomerName1(String Edit_CustomerName1)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(Edit_CustomerName1Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Edit_CustomerName1", "Enter_Edit_CustomerName1 failed. Unable to locate object: " + Edit_CustomerName1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Edit_CustomerName1", "Enter_Edit_CustomerName1 failed. Unable to locate object: " + Edit_CustomerName1Elem.toString());

 			Assert.fail("Unable to locate object: " + Edit_CustomerName1Elem.toString());
         }
 		
 		
 		
 		elem.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
 	
       		elem.sendKeys(Edit_CustomerName1);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Edit_CustomerName1 " + Edit_CustomerName1);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Edit_CustomerName1 " + Edit_CustomerName1);
 	}

      
	/**
 	 * Enter Edit_ContactName2
     * @name Enter Edit_ContactName2
     */
 	public void Enter_Edit_ContactName2(String Edit_ContactName2)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(Edit_ContactName2Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Edit_ContactName2", "Enter_Edit_ContactName2 failed. Unable to locate object: " + Edit_ContactName2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Edit_ContactName2", "Enter_Edit_ContactName2 failed. Unable to locate object: " + Edit_ContactName2Elem.toString());

 			Assert.fail("Unable to locate object: " + Edit_ContactName2Elem.toString());
         }
 		elem.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
 		elem.sendKeys(Edit_ContactName2);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Edit_ContactName2 " + Edit_ContactName2);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Edit_ContactName2 " + Edit_ContactName2);
 	}

      
	/**
 	 * Enter Edit_ContactLastName3
     * @name Enter Edit_ContactLastName3
     */
 	public void Enter_Edit_ContactLastName3(String Edit_ContactLastName3)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(Edit_ContactLastName3Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Edit_ContactLastName3", "Enter_Edit_ContactLastName3 failed. Unable to locate object: " + Edit_ContactLastName3Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Edit_ContactLastName3", "Enter_Edit_ContactLastName3 failed. Unable to locate object: " + Edit_ContactLastName3Elem.toString());

 			Assert.fail("Unable to locate object: " + Edit_ContactLastName3Elem.toString());
         }
 		elem.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
 		elem.sendKeys(Edit_ContactLastName3);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Edit_ContactLastName3 " + Edit_ContactLastName3);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Edit_ContactLastName3 " + Edit_ContactLastName3);
 	}

      
	/**
 	 * Enter Edit_Phone4
     * @name Enter Edit_Phone4
     */
 	public void Enter_Edit_Phone4(String Edit_Phone4)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(Edit_Phone4Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Edit_Phone4", "Enter_Edit_Phone4 failed. Unable to locate object: " + Edit_Phone4Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Edit_Phone4", "Enter_Edit_Phone4 failed. Unable to locate object: " + Edit_Phone4Elem.toString());

 			Assert.fail("Unable to locate object: " + Edit_Phone4Elem.toString());
         }
 		elem.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
 		elem.sendKeys(Edit_Phone4);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Edit_Phone4 " + Edit_Phone4);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Edit_Phone4 " + Edit_Phone4);
 	}

      
	/**
 	 * Enter Edit_Email5
     * @name Enter Edit_Email5
     */
 	public void Enter_Edit_Email5(String Edit_Email5)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(Edit_Email5Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Edit_Email5", "Enter_Edit_Email5 failed. Unable to locate object: " + Edit_Email5Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Edit_Email5", "Enter_Edit_Email5 failed. Unable to locate object: " + Edit_Email5Elem.toString());

 			Assert.fail("Unable to locate object: " + Edit_Email5Elem.toString());
         }
 		elem.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
 		elem.sendKeys(Edit_Email5);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Edit_Email5 " + Edit_Email5);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Edit_Email5 " + Edit_Email5);
 	}

      
	/**
 	 * Enter Edit_6_Address1
     * @name Enter Edit_6_Address1
     */
 	public void Enter_Edit_6_Address1(String Edit_6_Address1)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(Edit_6_Address1Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Edit_6_Address1", "Enter_Edit_6_Address1 failed. Unable to locate object: " + Edit_6_Address1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Edit_6_Address1", "Enter_Edit_6_Address1 failed. Unable to locate object: " + Edit_6_Address1Elem.toString());

 			Assert.fail("Unable to locate object: " + Edit_6_Address1Elem.toString());
         }
 		elem.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
 		elem.sendKeys(Edit_6_Address1);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Edit_6_Address1 " + Edit_6_Address1);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Edit_6_Address1 " + Edit_6_Address1);
 	}

      
	/**
 	 * Enter Edit_6_Address2
     * @name Enter Edit_6_Address2
     */
 	public void Enter_Edit_6_Address2(String Edit_6_Address2)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(Edit_6_Address2Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Edit_6_Address2", "Enter_Edit_6_Address2 failed. Unable to locate object: " + Edit_6_Address2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Edit_6_Address2", "Enter_Edit_6_Address2 failed. Unable to locate object: " + Edit_6_Address2Elem.toString());

 			Assert.fail("Unable to locate object: " + Edit_6_Address2Elem.toString());
         }
 		elem.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
 		elem.sendKeys(Edit_6_Address2);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Edit_6_Address2 " + Edit_6_Address2);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Edit_6_Address2 " + Edit_6_Address2);
 	}

      
	/**
 	 * Enter Edit_6_Address1
     * @name Enter Edit_6_Address1
     */
 	public void Enter_Edit_6_Address1_1(String Edit_6_Address1)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(Edit_6_Address1_1Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Edit_6_Address1_1", "Enter_Edit_6_Address1_1 failed. Unable to locate object: " + Edit_6_Address1_1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Edit_6_Address1_1", "Enter_Edit_6_Address1_1 failed. Unable to locate object: " + Edit_6_Address1_1Elem.toString());

 			Assert.fail("Unable to locate object: " + Edit_6_Address1_1Elem.toString());
         }
 		elem.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
 		elem.sendKeys(Edit_6_Address1);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Edit_6_Address1_1 " + Edit_6_Address1);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Edit_6_Address1_1 " + Edit_6_Address1);
 	}

      
	/**
 	 * Enter Edit_7_County
     * @name Enter Edit_7_County
     */
 	public void Enter_Edit_7_County(String Edit_7_County)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(Edit_7_CountyElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Edit_7_County", "Enter_Edit_7_County failed. Unable to locate object: " + Edit_7_CountyElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Edit_7_County", "Enter_Edit_7_County failed. Unable to locate object: " + Edit_7_CountyElem.toString());

 			Assert.fail("Unable to locate object: " + Edit_7_CountyElem.toString());
         }
 		elem.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
 		elem.sendKeys(Edit_7_County);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Edit_7_County " + Edit_7_County);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Edit_7_County " + Edit_7_County);
 	}

      
	/**
 	 * Enter Edit_PostCode_8
     * @name Enter Edit_PostCode_8
     */
 	public void Enter_Edit_PostCode_8(String Edit_PostCode_8)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(Edit_PostCode_8Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Edit_PostCode_8", "Enter_Edit_PostCode_8 failed. Unable to locate object: " + Edit_PostCode_8Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Edit_PostCode_8", "Enter_Edit_PostCode_8 failed. Unable to locate object: " + Edit_PostCode_8Elem.toString());

 			Assert.fail("Unable to locate object: " + Edit_PostCode_8Elem.toString());
         }
 		elem.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
 		elem.sendKeys(Edit_PostCode_8);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Edit_PostCode_8 " + Edit_PostCode_8);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Edit_PostCode_8 " + Edit_PostCode_8);
 	}

     
	/**
 	 * Click Edit__Save9
     * @name Click Edit__Save9
     */
	public void Click_Edit__Save9()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(Edit__Save9Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Edit__Save9", "Click_Edit__Save9 failed. Unable to locate object: " + Edit__Save9Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Edit__Save9", "Click_Edit__Save9 failed. Unable to locate object: " + Edit__Save9Elem.toString());

			Assert.fail("Unable to locate object: " + Edit__Save9Elem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_Edit__Save9");

		TestModellerLogger.PassStep(m_Driver, "Click_Edit__Save9");
	}

     
	/**
 	 * Click Edit_Click_Image_more10
     * @name Click Edit_Click_Image_more10
     */
	public void Click_Edit_Click_Image_more10()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(Edit_Click_Image_more10Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Edit_Click_Image_more10", "Click_Edit_Click_Image_more10 failed. Unable to locate object: " + Edit_Click_Image_more10Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Edit_Click_Image_more10", "Click_Edit_Click_Image_more10 failed. Unable to locate object: " + Edit_Click_Image_more10Elem.toString());

			Assert.fail("Unable to locate object: " + Edit_Click_Image_more10Elem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_Edit_Click_Image_more10");

		TestModellerLogger.PassStep(m_Driver, "Click_Edit_Click_Image_more10");
	}

      
	/**
 	 * Enter Edit_Click_Ref11
     * @name Enter Edit_Click_Ref11
     */
 	public void Enter_Edit_Click_Ref11(String Edit_Click_Ref11)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(Edit_Click_Ref11Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Edit_Click_Ref11", "Enter_Edit_Click_Ref11 failed. Unable to locate object: " + Edit_Click_Ref11Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Edit_Click_Ref11", "Enter_Edit_Click_Ref11 failed. Unable to locate object: " + Edit_Click_Ref11Elem.toString());

 			Assert.fail("Unable to locate object: " + Edit_Click_Ref11Elem.toString());
         }
 		elem.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
 		elem.sendKeys(Edit_Click_Ref11);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Edit_Click_Ref11 " + Edit_Click_Ref11);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Edit_Click_Ref11 " + Edit_Click_Ref11);
 	}

     
	/**
 	 * Click Edit_Click_check_box_no12
     * @name Click Edit_Click_check_box_no12
     */
	public void Click_Edit_Click_check_box_no12()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(Edit_Click_check_box_no12Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Edit_Click_check_box_no12", "Click_Edit_Click_check_box_no12 failed. Unable to locate object: " + Edit_Click_check_box_no12Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Edit_Click_check_box_no12", "Click_Edit_Click_check_box_no12 failed. Unable to locate object: " + Edit_Click_check_box_no12Elem.toString());

			Assert.fail("Unable to locate object: " + Edit_Click_check_box_no12Elem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_Edit_Click_check_box_no12");

		TestModellerLogger.PassStep(m_Driver, "Click_Edit_Click_check_box_no12");
	}

     
	/**
 	 * Click Edit_Click_check_box_yes12
     * @name Click Edit_Click_check_box_yes12
     */
	public void Click_Edit_Click_check_box_yes12()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(Edit_Click_check_box_yes12Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Edit_Click_check_box_yes12", "Click_Edit_Click_check_box_yes12 failed. Unable to locate object: " + Edit_Click_check_box_yes12Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Edit_Click_check_box_yes12", "Click_Edit_Click_check_box_yes12 failed. Unable to locate object: " + Edit_Click_check_box_yes12Elem.toString());

			Assert.fail("Unable to locate object: " + Edit_Click_check_box_yes12Elem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_Edit_Click_check_box_yes12");

		TestModellerLogger.PassStep(m_Driver, "Click_Edit_Click_check_box_yes12");
	}

      
	/**
 	 * Enter Edit_Click_Vat13
     * @name Enter Edit_Click_Vat13
     */
 	public void Enter_Edit_Click_Vat13(String Edit_Click_Vat13)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(Edit_Click_Vat13Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Edit_Click_Vat13", "Enter_Edit_Click_Vat13 failed. Unable to locate object: " + Edit_Click_Vat13Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Edit_Click_Vat13", "Enter_Edit_Click_Vat13 failed. Unable to locate object: " + Edit_Click_Vat13Elem.toString());

 			Assert.fail("Unable to locate object: " + Edit_Click_Vat13Elem.toString());
         }
 		elem.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
 		elem.sendKeys(Edit_Click_Vat13);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Edit_Click_Vat13 " + Edit_Click_Vat13);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Edit_Click_Vat13 " + Edit_Click_Vat13);
 	}

    
	/**
 	 * Select Edit_select_CustomerType14
     * @name Select Edit_select_CustomerType14
     */
    public void Select_Edit_select_CustomerType14(String Edit_select_CustomerType14)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(Edit_select_CustomerType14Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Edit_select_CustomerType14", "Select_Edit_select_CustomerType14 failed. Unable to locate object: " + Edit_select_CustomerType14Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Edit_select_CustomerType14", "Select_Edit_select_CustomerType14 failed. Unable to locate object: " + Edit_select_CustomerType14Elem.toString());

 			Assert.fail("Unable to locate object: " + Edit_select_CustomerType14Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Edit_select_CustomerType14);
 		
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_Edit_select_CustomerType14 " + Edit_select_CustomerType14);

 		TestModellerLogger.PassStep(m_Driver, "Select_Edit_select_CustomerType14 " + Edit_select_CustomerType14);
 	}

    
	/**
 	 * Select Edit_Select_Cust_Busi_Type15
     * @name Select Edit_Select_Cust_Busi_Type15
     */
    public void Select_Edit_Select_Cust_Busi_Type15(String Edit_Select_Cust_Busi_Type15)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(Edit_Select_Cust_Busi_Type15Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Edit_Select_Cust_Busi_Type15", "Select_Edit_Select_Cust_Busi_Type15 failed. Unable to locate object: " + Edit_Select_Cust_Busi_Type15Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Edit_Select_Cust_Busi_Type15", "Select_Edit_Select_Cust_Busi_Type15 failed. Unable to locate object: " + Edit_Select_Cust_Busi_Type15Elem.toString());

 			Assert.fail("Unable to locate object: " + Edit_Select_Cust_Busi_Type15Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Edit_Select_Cust_Busi_Type15);
 		
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_Edit_Select_Cust_Busi_Type15 " + Edit_Select_Cust_Busi_Type15);

 		TestModellerLogger.PassStep(m_Driver, "Select_Edit_Select_Cust_Busi_Type15 " + Edit_Select_Cust_Busi_Type15);
 	}

      
	/**
 	 * Enter Edit_Enter_Note16
     * @name Enter Edit_Enter_Note16
     */
 	public void Enter_Edit_Enter_Note16(String Edit_Enter_Note16)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(Edit_Enter_Note16Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Edit_Enter_Note16", "Enter_Edit_Enter_Note16 failed. Unable to locate object: " + Edit_Enter_Note16Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Edit_Enter_Note16", "Enter_Edit_Enter_Note16 failed. Unable to locate object: " + Edit_Enter_Note16Elem.toString());

 			Assert.fail("Unable to locate object: " + Edit_Enter_Note16Elem.toString());
         }
 		elem.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
 		elem.sendKeys(Edit_Enter_Note16);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Edit_Enter_Note16 " + Edit_Enter_Note16);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Edit_Enter_Note16 " + Edit_Enter_Note16);
 	}

    
	/**
 	 * Select Edit_enter_Payment17
     * @name Select Edit_enter_Payment17
     */
    public void Select_Edit_enter_Payment17(String Edit_enter_Payment17)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(Edit_enter_Payment17Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Edit_enter_Payment17", "Select_Edit_enter_Payment17 failed. Unable to locate object: " + Edit_enter_Payment17Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Edit_enter_Payment17", "Select_Edit_enter_Payment17 failed. Unable to locate object: " + Edit_enter_Payment17Elem.toString());

 			Assert.fail("Unable to locate object: " + Edit_enter_Payment17Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Edit_enter_Payment17);
 		
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_Edit_enter_Payment17 " + Edit_enter_Payment17);

 		TestModellerLogger.PassStep(m_Driver, "Select_Edit_enter_Payment17 " + Edit_enter_Payment17);
 	}

    
	/**
 	 * Select Edit_edger18
     * @name Select Edit_edger18
     */
    public void Select_Edit_edger18(String Edit_edger18)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(Edit_edger18Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Edit_edger18", "Select_Edit_edger18 failed. Unable to locate object: " + Edit_edger18Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Edit_edger18", "Select_Edit_edger18 failed. Unable to locate object: " + Edit_edger18Elem.toString());

 			Assert.fail("Unable to locate object: " + Edit_edger18Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Edit_edger18);
 		
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_Edit_edger18 " + Edit_edger18);

 		TestModellerLogger.PassStep(m_Driver, "Select_Edit_edger18 " + Edit_edger18);
 	}

    
	/**
 	 * Select Edit_Credit_ControlStatusType19
     * @name Select Edit_Credit_ControlStatusType19
     */
    public void Select_Edit_Credit_ControlStatusType19(String Edit_Credit_ControlStatusType19)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(Edit_Credit_ControlStatusType19Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Edit_Credit_ControlStatusType19", "Select_Edit_Credit_ControlStatusType19 failed. Unable to locate object: " + Edit_Credit_ControlStatusType19Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Edit_Credit_ControlStatusType19", "Select_Edit_Credit_ControlStatusType19 failed. Unable to locate object: " + Edit_Credit_ControlStatusType19Elem.toString());

 			Assert.fail("Unable to locate object: " + Edit_Credit_ControlStatusType19Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Edit_Credit_ControlStatusType19);
 		
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_Edit_Credit_ControlStatusType19 " + Edit_Credit_ControlStatusType19);

 		TestModellerLogger.PassStep(m_Driver, "Select_Edit_Credit_ControlStatusType19 " + Edit_Credit_ControlStatusType19);
 	}

    
	/**
 	 * Select Edit_Currency20
     * @name Select Edit_Currency20
     */
    public void Select_Edit_Currency20(String Edit_Currency20)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(Edit_Currency20Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Edit_Currency20", "Select_Edit_Currency20 failed. Unable to locate object: " + Edit_Currency20Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Edit_Currency20", "Select_Edit_Currency20 failed. Unable to locate object: " + Edit_Currency20Elem.toString());

 			Assert.fail("Unable to locate object: " + Edit_Currency20Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Edit_Currency20);
 		
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_Edit_Currency20 " + Edit_Currency20);

 		TestModellerLogger.PassStep(m_Driver, "Select_Edit_Currency20 " + Edit_Currency20);
 	}

     
	/**
 	 * Click Edit_closecorss21
     * @name Click Edit_closecorss21
     */
	public void Click_Edit_closecorss21()
	{
        
		WebElement elem = getWebElement(Edit_closecorss21Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Edit_closecorss21", "Click_Edit_closecorss21 failed. Unable to locate object: " + Edit_closecorss21Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Edit_closecorss21", "Click_Edit_closecorss21 failed. Unable to locate object: " + Edit_closecorss21Elem.toString());

			Assert.fail("Unable to locate object: " + Edit_closecorss21Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Edit_closecorss21");

		TestModellerLogger.PassStep(m_Driver, "Click_Edit_closecorss21");
	}
}