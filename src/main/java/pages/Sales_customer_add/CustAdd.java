package pages.Sales_customer_add;

import pages.BasePage;
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
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/4b4f4e69-c169-43d7-a76e-89818a7737c7
@TestModellerModule(guid = "4b4f4e69-c169-43d7-a76e-89818a7737c7")
public class CustAdd extends BasePage
{
	public static String fname;
public  static String  searchname;
public  static String  name;
	public CustAdd (WebDriver driver)
	{
		super(driver);
	}


	//private By Select_Cust_Drpdwn1Elem = By.xpath("//*[@id='ctl00_cPHFilter_dd_Search']");
	private By Buss_Name_1Elem = By.xpath("//label[normalize-space()= 'Business Name: *']/../../div[2]/div/input");

	private By Cust_Fname_2Elem = By.xpath("//label[normalize-space()= 'First Name:']/../../div[2]/input");

	private By Cust_Lname_3Elem = By.xpath("//label[normalize-space()= 'Last Name:']/../../div[2]/input");

	private By Customer_Phone_4Elem = By.xpath("//label[normalize-space()= 'Phone:']/../../div[2]/input");

	private By Cust_Customer_email_5Elem = By.xpath("//label[normalize-space()= 'Email:']/../../div[2]/textarea");

	private By Cust_Address1Elem = By.xpath("//label[normalize-space()= 'Address Line 1:']/../../div[2]/input");

	private By Cust_Address2Elem = By.xpath("//label[normalize-space()= 'Address Line 2:']/../../div[2]/input");

	private By Cust_City_7Elem = By.xpath("//label[normalize-space()= 'City:']/../../div[2]/input");

	private By Cust_County_8Elem = By.xpath("//label[normalize-space()= 'County:']/../../div[2]/input");

	private By C_PostCode_9Elem = By.xpath("//label[normalize-space()= 'Postcode:']/../../div[2]/input");

	private By CCountry_10Elem = By.xpath("//label[normalize-space()= 'Country:']/../../div[2]/select");

	private By Enter_Note11Elem = By.xpath("//label[normalize-space()= 'Notes:']/../../div[2]/textarea");

	private By C_dPayment_12Elem = By.xpath("//SELECT[@name='ctl00$cPH$ddPayment']");

	private By C_ddLedger_13Elem = By.xpath("//label[normalize-space()= 'Ledger:']/../../div[2]/select");

	private By C_Credit_Control_StatusTypeElem = By.xpath("//label[normalize-space()= 'Select']/select");

	private By Click_Form_Save_Elem = By.xpath("/html/body/form/main/div[11]/div[3]/div/div[3]/div/div/div/div/div[7]/div/a");

	private By C_Cancel_btnElem = By.xpath("//A[@id='ctl00_cphFooter_btnCancelModal']");

	private By Click_Cross_popupElem = By.xpath("//BUTTON[contains(text(),'×')]");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AccountUI/Customer.aspx?FYCode=117243&CompanyCode=16906&menuid=0");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/Customer.aspx?FYCode=117243&CompanyCode=16906&menuid=0");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/Customer.aspx?FYCode=117243&CompanyCode=16906&menuid=0");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/AccountUI/Customer.aspx?FYCode=117243&CompanyCode=16906&menuid=0";

        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/AccountUI/Customer.aspx?FYCode=117243&CompanyCode=16906&menuid=0")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

      
	/**
 	 * Enter Buss_Name_1
     * @name Enter Buss_Name_1
     */
 	public String Enter_Buss_Name_1(String Buss_Name_1)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Buss_Name_1Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Buss_Name_1", "Enter_Buss_Name_1 failed. Unable to locate object: " + Buss_Name_1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Buss_Name_1", "Enter_Buss_Name_1 failed. Unable to locate object: " + Buss_Name_1Elem.toString());

 			Assert.fail("Unable to locate object: " + Buss_Name_1Elem.toString());
         }
 		name=Buss_Name_1;
 		elem.sendKeys(name);
 		System.out.println("customer name is " +name);
 		
		m_Driver.switchTo().defaultContent();
  		ExtentReportManager.passStep(m_Driver, "Enter_Buss_Name_1 " + Buss_Name_1);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Buss_Name_1 " + Buss_Name_1);
		return Buss_Name_1;
		
 	}


 
      
	/**
 	 * Enter Cust_Fname_2
     * @name Enter Cust_Fname_2
     */
 	public void Enter_Cust_Fname_2(String Cust_Fname_2)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Cust_Fname_2Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Cust_Fname_2", "Enter_Cust_Fname_2 failed. Unable to locate object: " + Cust_Fname_2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Cust_Fname_2", "Enter_Cust_Fname_2 failed. Unable to locate object: " + Cust_Fname_2Elem.toString());

 			Assert.fail("Unable to locate object: " + Cust_Fname_2Elem.toString());
         }
       fname=Cust_Fname_2;
 		elem.sendKeys(fname);
 		elem.sendKeys(Keys.TAB);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Cust_Fname_2 " + Cust_Fname_2);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Cust_Fname_2 " + Cust_Fname_2);
 	}
public String customername_re()
{
	
	return fname;
}
      
	/**
 	 * Enter Cust_Lname_3
     * @name Enter Cust_Lname_3
     */
 	public void Enter_Cust_Lname_3(String Cust_Lname_3)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Cust_Lname_3Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Cust_Lname_3", "Enter_Cust_Lname_3 failed. Unable to locate object: " + Cust_Lname_3Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Cust_Lname_3", "Enter_Cust_Lname_3 failed. Unable to locate object: " + Cust_Lname_3Elem.toString());

 			Assert.fail("Unable to locate object: " + Cust_Lname_3Elem.toString());
         }

 		elem.sendKeys(Cust_Lname_3);
 		elem.sendKeys(Keys.TAB);
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Cust_Lname_3 " + Cust_Lname_3);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Cust_Lname_3 " + Cust_Lname_3);
 	}

      
	/**
 	 * Enter Customer_Phone_4
     * @name Enter Customer_Phone_4
     */
 	public void Enter_Customer_Phone_4(String Customer_Phone_4)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Customer_Phone_4Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Customer_Phone_4", "Enter_Customer_Phone_4 failed. Unable to locate object: " + Customer_Phone_4Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Customer_Phone_4", "Enter_Customer_Phone_4 failed. Unable to locate object: " + Customer_Phone_4Elem.toString());

 			Assert.fail("Unable to locate object: " + Customer_Phone_4Elem.toString());
         }

 		elem.sendKeys(Customer_Phone_4);
 		elem.sendKeys(Keys.TAB);
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Customer_Phone_4 " + Customer_Phone_4);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Customer_Phone_4 " + Customer_Phone_4);
 	}

      
	/**
 	 * Enter Cust_Customer_email_5
     * @name Enter Cust_Customer_email_5
     */
 	public void Enter_Cust_Customer_email_5(String Cust_Customer_email_5)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Cust_Customer_email_5Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Cust_Customer_email_5", "Enter_Cust_Customer_email_5 failed. Unable to locate object: " + Cust_Customer_email_5Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Cust_Customer_email_5", "Enter_Cust_Customer_email_5 failed. Unable to locate object: " + Cust_Customer_email_5Elem.toString());

 			Assert.fail("Unable to locate object: " + Cust_Customer_email_5Elem.toString());
         }

 		elem.sendKeys(Cust_Customer_email_5);
 		elem.sendKeys(Keys.TAB);
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Cust_Customer_email_5 " + Cust_Customer_email_5);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Cust_Customer_email_5 " + Cust_Customer_email_5);
 	}

      
	/**
 	 * Enter Cust_Address1
     * @name Enter Cust_Address1
     */
 	public void Enter_Cust_Address1(String Cust_Address1)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Cust_Address1Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Cust_Address1", "Enter_Cust_Address1 failed. Unable to locate object: " + Cust_Address1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Cust_Address1", "Enter_Cust_Address1 failed. Unable to locate object: " + Cust_Address1Elem.toString());

 			Assert.fail("Unable to locate object: " + Cust_Address1Elem.toString());
         }

 		elem.sendKeys(Cust_Address1);
 		elem.sendKeys(Keys.TAB);
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Cust_Address1 " + Cust_Address1);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Cust_Address1 " + Cust_Address1);
 	}

      
	/**
 	 * Enter Cust_Address2
     * @name Enter Cust_Address2
     */
 	public void Enter_Cust_Address2(String Cust_Address2)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Cust_Address2Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Cust_Address2", "Enter_Cust_Address2 failed. Unable to locate object: " + Cust_Address2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Cust_Address2", "Enter_Cust_Address2 failed. Unable to locate object: " + Cust_Address2Elem.toString());

 			Assert.fail("Unable to locate object: " + Cust_Address2Elem.toString());
         }

 		elem.sendKeys(Cust_Address2);
 		elem.sendKeys(Keys.TAB);
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Cust_Address2 " + Cust_Address2);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Cust_Address2 " + Cust_Address2);
 	}

      
	/**
 	 * Enter Cust_City_7
     * @name Enter Cust_City_7
     */
 	public void Enter_Cust_City_7(String Cust_City_7)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Cust_City_7Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Cust_City_7", "Enter_Cust_City_7 failed. Unable to locate object: " + Cust_City_7Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Cust_City_7", "Enter_Cust_City_7 failed. Unable to locate object: " + Cust_City_7Elem.toString());

 			Assert.fail("Unable to locate object: " + Cust_City_7Elem.toString());
         }

 		elem.sendKeys(Cust_City_7);
 		elem.sendKeys(Keys.TAB);
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Cust_City_7 " + Cust_City_7);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Cust_City_7 " + Cust_City_7);
 	}

      
	/**
 	 * Enter Cust_County_8
     * @name Enter Cust_County_8
     */
 	public void Enter_Cust_County_8(String Cust_County_8)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Cust_County_8Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Cust_County_8", "Enter_Cust_County_8 failed. Unable to locate object: " + Cust_County_8Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Cust_County_8", "Enter_Cust_County_8 failed. Unable to locate object: " + Cust_County_8Elem.toString());

 			Assert.fail("Unable to locate object: " + Cust_County_8Elem.toString());
         }

 		elem.sendKeys(Cust_County_8);
 		elem.sendKeys(Keys.TAB);
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Cust_County_8 " + Cust_County_8);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Cust_County_8 " + Cust_County_8);
 	}

      
	/**
 	 * Enter C_PostCode_9
     * @name Enter C_PostCode_9
     */
 	public void Enter_C_PostCode_9(String C_PostCode_9)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(C_PostCode_9Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_C_PostCode_9", "Enter_C_PostCode_9 failed. Unable to locate object: " + C_PostCode_9Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_C_PostCode_9", "Enter_C_PostCode_9 failed. Unable to locate object: " + C_PostCode_9Elem.toString());

 			Assert.fail("Unable to locate object: " + C_PostCode_9Elem.toString());
         }

 		elem.sendKeys(C_PostCode_9);
 		elem.sendKeys(Keys.TAB);
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_C_PostCode_9 " + C_PostCode_9);

  		TestModellerLogger.PassStep(m_Driver, "Enter_C_PostCode_9 " + C_PostCode_9);
 	}

    
	/**
 	 * Select C-Country_10
     * @name Select C-Country_10
     */
    public void Select_CCountry_10(String CCountry_10)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(CCountry_10Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_CCountry_10", "Select_CCountry_10 failed. Unable to locate object: " + CCountry_10Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_CCountry_10", "Select_CCountry_10 failed. Unable to locate object: " + CCountry_10Elem.toString());

 			Assert.fail("Unable to locate object: " + CCountry_10Elem.toString());
         }

 		Select dropdown = new Select(elem);
 		elem.sendKeys(Keys.TAB);
 		dropdown.selectByVisibleText(CCountry_10);
 		
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_CCountry_10 " + CCountry_10);

 		TestModellerLogger.PassStep(m_Driver, "Select_CCountry_10 " + CCountry_10);
 	}

      
	/**
 	 * Enter Enter_Note11
     * @name Enter Enter_Note11
     */
 	public void Enter_Enter_Note11(String Enter_Note11)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Enter_Note11Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_Note11", "Enter_Enter_Note11 failed. Unable to locate object: " + Enter_Note11Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_Note11", "Enter_Enter_Note11 failed. Unable to locate object: " + Enter_Note11Elem.toString());

 			Assert.fail("Unable to locate object: " + Enter_Note11Elem.toString());
         }

 		elem.sendKeys(Enter_Note11);
 		elem.sendKeys(Keys.TAB);
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_Note11 " + Enter_Note11);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_Note11 " + Enter_Note11);
 	}

    
	/**
 	 * Select C_dPayment_12
     * @name Select C_dPayment_12
     */
    public void Select_C_dPayment_12(String C_dPayment_12)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(C_dPayment_12Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_C_dPayment_12", "Select_C_dPayment_12 failed. Unable to locate object: " + C_dPayment_12Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_C_dPayment_12", "Select_C_dPayment_12 failed. Unable to locate object: " + C_dPayment_12Elem.toString());

 			Assert.fail("Unable to locate object: " + C_dPayment_12Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(C_dPayment_12);
 		elem.sendKeys(Keys.TAB);
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_C_dPayment_12 " + C_dPayment_12);

 		TestModellerLogger.PassStep(m_Driver, "Select_C_dPayment_12 " + C_dPayment_12);
 	}

    
	/**
 	 * Select C_ddLedger_13
     * @name Select C_ddLedger_13
     */
    public void Select_C_ddLedger_13(String C_ddLedger_13)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(C_ddLedger_13Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_C_ddLedger_13", "Select_C_ddLedger_13 failed. Unable to locate object: " + C_ddLedger_13Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_C_ddLedger_13", "Select_C_ddLedger_13 failed. Unable to locate object: " + C_ddLedger_13Elem.toString());

 			Assert.fail("Unable to locate object: " + C_ddLedger_13Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(C_ddLedger_13);
 		elem.sendKeys(Keys.TAB);
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_C_ddLedger_13 " + C_ddLedger_13);

 		TestModellerLogger.PassStep(m_Driver, "Select_C_ddLedger_13 " + C_ddLedger_13);
 	}

    
	/**
 	 * Select C_Credit_Control_StatusType
     * @name Select C_Credit_Control_StatusType
     */
    public void Select_C_Credit_Control_StatusType(String C_Credit_Control_StatusType)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(C_Credit_Control_StatusTypeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_C_Credit_Control_StatusType", "Select_C_Credit_Control_StatusType failed. Unable to locate object: " + C_Credit_Control_StatusTypeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_C_Credit_Control_StatusType", "Select_C_Credit_Control_StatusType failed. Unable to locate object: " + C_Credit_Control_StatusTypeElem.toString());

 			Assert.fail("Unable to locate object: " + C_Credit_Control_StatusTypeElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(C_Credit_Control_StatusType);
 		elem.sendKeys(Keys.TAB);
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_C_Credit_Control_StatusType " + C_Credit_Control_StatusType);

 		TestModellerLogger.PassStep(m_Driver, "Select_C_Credit_Control_StatusType " + C_Credit_Control_StatusType);
 	}

     
	/**
 	 * Click Click_Form_Save_
	 * @throws InterruptedException 
     * @name Click Click_Form_Save_
     */
	public void Click_Click_Form_Save_() throws InterruptedException
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[2]/div/div/div[2]/iframe")));
		
		WebElement elem = getWebElement(Click_Form_Save_Elem);

		if (elem == null) {
   		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Click_Form_Save_", "Click_Click_Form_Save_ failed. Unable to locate object: " + Click_Form_Save_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Click_Form_Save_", "Click_Click_Form_Save_ failed. Unable to locate object: " + Click_Form_Save_Elem.toString());

			Assert.fail("Unable to locate object: " + Click_Form_Save_Elem.toString());
        }
	          jsExec.executeScript("arguments[0].click()",elem); 
	
	          //elem.click();
	
		utilities.PassScreenshot.Getscreenshot11("Click on save", "AddCustomer_SaveBtn");
		//elem.sendKeys(Keys.TAB);
		m_Driver.switchTo().defaultContent();
     	Thread.sleep(3000);
  	

		ExtentReportManager.passStep(m_Driver, "Click_Click_Form_Save_");

		TestModellerLogger.PassStep(m_Driver, "Click_Click_Form_Save_");
	}

     
	/**
 	 * Click C_Cancel_btn
     * @name Click C_Cancel_btn
     */
	public void Click_C_Cancel_btn()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[2]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(C_Cancel_btnElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_C_Cancel_btn", "Click_C_Cancel_btn failed. Unable to locate object: " + C_Cancel_btnElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_C_Cancel_btn", "Click_C_Cancel_btn failed. Unable to locate object: " + C_Cancel_btnElem.toString());

			Assert.fail("Unable to locate object: " + C_Cancel_btnElem.toString());
        }

		elem.click();
		elem.sendKeys(Keys.TAB);
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_C_Cancel_btn");

		TestModellerLogger.PassStep(m_Driver, "Click_C_Cancel_btn");
	}

     
	/**
 	 * Click Click_Cross_popup
     * @name Click Click_Cross_popup
     */
	public void Click_Click_Cross_popup()
	{
        
		WebElement elem = getWebElement(Click_Cross_popupElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Click_Cross_popup", "Click_Click_Cross_popup failed. Unable to locate object: " + Click_Cross_popupElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Click_Cross_popup", "Click_Click_Cross_popup failed. Unable to locate object: " + Click_Cross_popupElem.toString());

			Assert.fail("Unable to locate object: " + Click_Cross_popupElem.toString());
        }

		elem.click();
		elem.sendKeys(Keys.TAB);

		ExtentReportManager.passStep(m_Driver, "Click_Click_Cross_popup");

		TestModellerLogger.PassStep(m_Driver, "Click_Click_Cross_popup");
	}
	
	
	 public void Select_Select_Cust_Drpdwn1() throws InterruptedException
	 	{
		
		 searchname=name;
		 System.out.println("retrun name"+searchname);

		 WebElement namelem=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPHFilter_txtSearch']"));
	 		namelem.click();
	 		namelem.sendKeys(searchname);

	
	 		utilities.PassScreenshot.Getscreenshot11("Search by business name", "CustomerList");
	 	
	 		
	 	}
	 public void AsonDate(String dat) throws InterruptedException
	 {
		 
		 WebElement dt=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPHFilter_txtDateTo']"));
		 dt.click();
	 dt.sendKeys(dat);
jsExec.executeScript("arguments[0].click()", dt);
	 			Thread.sleep(3000);
		 
	 }
	 public void Enter_Buss_Name_2(String Buss_Name_2)
	 	{
	 	    
			m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[2]/div/div/div[2]/iframe")));

	 		WebElement elem = getWebElement(Buss_Name_1Elem);

	 		if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Buss_Name_1", "Enter_Buss_Name_1 failed. Unable to locate object: " + Buss_Name_1Elem.toString());

	    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Buss_Name_1", "Enter_Buss_Name_1 failed. Unable to locate object: " + Buss_Name_1Elem.toString());

	 			Assert.fail("Unable to locate object: " + Buss_Name_1Elem.toString());
	         }
	 		name=Buss_Name_2;
	 		
	 		elem.sendKeys(name);
	 		System.out.println("customer name is " +name);
	 		
			m_Driver.switchTo().defaultContent();
	  		ExtentReportManager.passStep(m_Driver, "Enter_Buss_Name_1 " + Buss_Name_2);

	  		TestModellerLogger.PassStep(m_Driver, "Enter_Buss_Name_1 " + Buss_Name_2);
			
			
			
	 	}
	 
	 
	 public String business_rt()
	 {
		 return name;
	 }
}