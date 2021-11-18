package Pages_Income;

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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/63c7accf-8354-498f-9d68-c2959fc7b5f2
@TestModellerModule(guid = "63c7accf-8354-498f-9d68-c2959fc7b5f2")
public class Customer_LIst extends BasePage
{
	public Customer_LIst (WebDriver driver)
	{
		super(driver);
	}


	
	private By View1Elem = By.xpath("//*[@id='ctl00_divMainContent']/header/div/div[3]/a");

	private By Customer_List2Elem = By.xpath("//A[@id='ctl00_cpHeaderRight_btnCustomer']");

	private By Select_Category_Search3Elem = By.xpath("//label[normalize-space()= 'Search Category:']/../div/select");

	private By Enter_Name4Elem = By.xpath("//label[normalize-space()= 'Search Category:']/../div/input");

	private By EnterDate5Elem = By.xpath("//label[normalize-space()= 'As On:']/../div/input");

	private By SelectPayment6Elem = By.xpath("//label[normalize-space()= 'Payment Method:']/../div/select");

	private By Select_Status7Elem = By.xpath("//label[normalize-space()= 'Status:']/../div/select");

	private By Select_Account_Notes_8Elem = By.xpath("//label[normalize-space()= 'Account Notes:']/../div/select");

	private By SearchBtn_9Elem = By.xpath("//label[normalize-space()= '']/../div/a");

	private By Add_CustomerBtn_10Elem = By.xpath("//A[@id='ctl00_cpHeaderRight_btnAdd']");

	private By Enter_CustomerName_11Elem = By.xpath("//label[normalize-space()= 'Business Name: *']/../../div[2]/div/input");

	private By Enter_FirstName_12Elem = By.xpath("//label[normalize-space()= 'First Name:']/../../div[2]/input");

	private By Enter_LastName_13Elem = By.xpath("//label[normalize-space()= 'Last Name:']/../../div[2]/input");

	private By Enter_Phone_14Elem = By.xpath("//label[normalize-space()= 'Phone:']/../../div[2]/input");

	private By Save_15Elem = By.xpath("//A[@id='ctl00_cphFooter_btnSave']");

	private By Get_Msg_16Elem = By.xpath("//*[@id='ctl00_divSubContent']/div[1]/div");

	private By Select_AllCheakBoxBtn17Elem = By.xpath("//*[@id='ctl00_cPH_divLimited']/div/table/thead/tr/th[1]/input");

	private By Send_Mail_18Elem = By.xpath("//A[@title='Send Mail']");

	private By Select_Banks_19Elem = By.xpath("//label[normalize-space()= 'Bank Name:']/../div/select");

	private By Enter_DateFrom_20Elem = By.xpath("//label[normalize-space()= 'Date Range:']/../div/input[1]");

	private By Enter_DateTo_21Elem = By.xpath("//label[normalize-space()= 'Date Range:']/../div/input[2]");

	private By Select_EmailTemplate_22Elem = By.xpath("//label[normalize-space()= 'Email Template:']/../div/select");

	private By Enter_EmailID_23Elem = By.xpath("//label[normalize-space()= '']/../div/input");

	private By SendBtn_24Elem = By.xpath("//A[@id='ctl00_cphFooter_btnSave']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AgentUI/Company.aspx");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AgentUI/Company.aspx");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AgentUI/Company.aspx");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/AgentUI/Company.aspx";

        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/AgentUI/Company.aspx")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click View1
     * @name Click View1
     */
	public void Click_View1()
	{
        
		WebElement elem = getWebElement(View1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_View1", "Click_View1 failed. Unable to locate object: " + View1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_View1", "Click_View1 failed. Unable to locate object: " + View1Elem.toString());

			Assert.fail("Unable to locate object: " + View1Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_View1");

		TestModellerLogger.PassStep(m_Driver, "Click_View1");
	}

     
	/**
 	 * Click Customer List2
     * @name Click Customer List2
     */
	public void Click_Customer_List2()
	{
        
		WebElement elem = getWebElement(Customer_List2Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Customer_List2", "Click_Customer_List2 failed. Unable to locate object: " + Customer_List2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Customer_List2", "Click_Customer_List2 failed. Unable to locate object: " + Customer_List2Elem.toString());

			Assert.fail("Unable to locate object: " + Customer_List2Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Customer_List2");

		TestModellerLogger.PassStep(m_Driver, "Click_Customer_List2");
	}

    
	/**
 	 * Select Select_Category_Search3
     * @name Select Select_Category_Search3
     */
    public void Select_Select_Category_Search3(String Select_Category_Search3)
 	{
 	    
 		WebElement elem = getWebElement(Select_Category_Search3Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Select_Category_Search3", "Select_Select_Category_Search3 failed. Unable to locate object: " + Select_Category_Search3Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Select_Category_Search3", "Select_Select_Category_Search3 failed. Unable to locate object: " + Select_Category_Search3Elem.toString());

 			Assert.fail("Unable to locate object: " + Select_Category_Search3Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Select_Category_Search3);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Select_Category_Search3 " + Select_Category_Search3);

 		TestModellerLogger.PassStep(m_Driver, "Select_Select_Category_Search3 " + Select_Category_Search3);
 	}

      
	/**
 	 * Enter Enter_Name4
     * @name Enter Enter_Name4
     */
 	public void Enter_Enter_Name4(String Enter_Name4)
 	{
 	    
 		WebElement elem = getWebElement(Enter_Name4Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_Name4", "Enter_Enter_Name4 failed. Unable to locate object: " + Enter_Name4Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_Name4", "Enter_Enter_Name4 failed. Unable to locate object: " + Enter_Name4Elem.toString());

 			Assert.fail("Unable to locate object: " + Enter_Name4Elem.toString());
         }

 		elem.sendKeys(Enter_Name4);
 		elem.sendKeys(Keys.TAB);
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_Name4 " + Enter_Name4);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_Name4 " + Enter_Name4);
 	}

      
	/**
 	 * Enter EnterDate5
     * @name Enter EnterDate5
     */
 	public void Enter_EnterDate5(String EnterDate5)
 	{
 	    
 		WebElement elem = getWebElement(EnterDate5Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_EnterDate5", "Enter_EnterDate5 failed. Unable to locate object: " + EnterDate5Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_EnterDate5", "Enter_EnterDate5 failed. Unable to locate object: " + EnterDate5Elem.toString());

 			Assert.fail("Unable to locate object: " + EnterDate5Elem.toString());
         }

 		elem.sendKeys(EnterDate5);
 		elem.sendKeys(Keys.TAB);
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_EnterDate5 " + EnterDate5);

  		TestModellerLogger.PassStep(m_Driver, "Enter_EnterDate5 " + EnterDate5);
 	}

    
	/**
 	 * Select SelectPayment6
     * @name Select SelectPayment6
     */
    public void Select_SelectPayment6(String SelectPayment6)
 	{
 	    
 		WebElement elem = getWebElement(SelectPayment6Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_SelectPayment6", "Select_SelectPayment6 failed. Unable to locate object: " + SelectPayment6Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_SelectPayment6", "Select_SelectPayment6 failed. Unable to locate object: " + SelectPayment6Elem.toString());

 			Assert.fail("Unable to locate object: " + SelectPayment6Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(SelectPayment6);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_SelectPayment6 " + SelectPayment6);

 		TestModellerLogger.PassStep(m_Driver, "Select_SelectPayment6 " + SelectPayment6);
 	}

    
	/**
 	 * Select Select_Status7
     * @name Select Select_Status7
     */
    public void Select_Select_Status7(String Select_Status7)
 	{
 	    
 		WebElement elem = getWebElement(Select_Status7Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Select_Status7", "Select_Select_Status7 failed. Unable to locate object: " + Select_Status7Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Select_Status7", "Select_Select_Status7 failed. Unable to locate object: " + Select_Status7Elem.toString());

 			Assert.fail("Unable to locate object: " + Select_Status7Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Select_Status7);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Select_Status7 " + Select_Status7);

 		TestModellerLogger.PassStep(m_Driver, "Select_Select_Status7 " + Select_Status7);
 	}

    
	/**
 	 * Select Select_Account_Notes 8
     * @name Select Select_Account_Notes 8
     */
    public void Select_Select_Account_Notes_8(String Select_Account_Notes_8)
 	{
 	    
 		WebElement elem = getWebElement(Select_Account_Notes_8Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Select_Account_Notes_8", "Select_Select_Account_Notes_8 failed. Unable to locate object: " + Select_Account_Notes_8Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Select_Account_Notes_8", "Select_Select_Account_Notes_8 failed. Unable to locate object: " + Select_Account_Notes_8Elem.toString());

 			Assert.fail("Unable to locate object: " + Select_Account_Notes_8Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Select_Account_Notes_8);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Select_Account_Notes_8 " + Select_Account_Notes_8);

 		TestModellerLogger.PassStep(m_Driver, "Select_Select_Account_Notes_8 " + Select_Account_Notes_8);
 	}

     
	/**
 	 * Click SearchBtn 9
     * @name Click SearchBtn 9
     */
	public void Click_SearchBtn_9()
	{
        
		WebElement elem = getWebElement(SearchBtn_9Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SearchBtn_9", "Click_SearchBtn_9 failed. Unable to locate object: " + SearchBtn_9Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SearchBtn_9", "Click_SearchBtn_9 failed. Unable to locate object: " + SearchBtn_9Elem.toString());

			Assert.fail("Unable to locate object: " + SearchBtn_9Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_SearchBtn_9");

		TestModellerLogger.PassStep(m_Driver, "Click_SearchBtn_9");
	}

     
	/**
 	 * Click Add CustomerBtn 10
     * @name Click Add CustomerBtn 10
     */
	public void Click_Add_CustomerBtn_10()
	{
        
		WebElement elem = getWebElement(Add_CustomerBtn_10Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Add_CustomerBtn_10", "Click_Add_CustomerBtn_10 failed. Unable to locate object: " + Add_CustomerBtn_10Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Add_CustomerBtn_10", "Click_Add_CustomerBtn_10 failed. Unable to locate object: " + Add_CustomerBtn_10Elem.toString());

			Assert.fail("Unable to locate object: " + Add_CustomerBtn_10Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Add_CustomerBtn_10");

		TestModellerLogger.PassStep(m_Driver, "Click_Add_CustomerBtn_10");
	}

      
	/**
 	 * Enter Enter_CustomerName 11
     * @name Enter Enter_CustomerName 11
     */
 	public void Enter_Enter_CustomerName_11(String Enter_CustomerName_11)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Enter_CustomerName_11Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_CustomerName_11", "Enter_Enter_CustomerName_11 failed. Unable to locate object: " + Enter_CustomerName_11Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_CustomerName_11", "Enter_Enter_CustomerName_11 failed. Unable to locate object: " + Enter_CustomerName_11Elem.toString());

 			Assert.fail("Unable to locate object: " + Enter_CustomerName_11Elem.toString());
         }

 		elem.sendKeys(Enter_CustomerName_11);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_CustomerName_11 " + Enter_CustomerName_11);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_CustomerName_11 " + Enter_CustomerName_11);
 	}

      
	/**
 	 * Enter Enter_FirstName 12
     * @name Enter Enter_FirstName 12
     */
 	public void Enter_Enter_FirstName_12(String Enter_FirstName_12)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Enter_FirstName_12Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_FirstName_12", "Enter_Enter_FirstName_12 failed. Unable to locate object: " + Enter_FirstName_12Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_FirstName_12", "Enter_Enter_FirstName_12 failed. Unable to locate object: " + Enter_FirstName_12Elem.toString());

 			Assert.fail("Unable to locate object: " + Enter_FirstName_12Elem.toString());
         }

 		elem.sendKeys(Enter_FirstName_12);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_FirstName_12 " + Enter_FirstName_12);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_FirstName_12 " + Enter_FirstName_12);
 	}

      
	/**
 	 * Enter Enter_LastName 13
     * @name Enter Enter_LastName 13
     */
 	public void Enter_Enter_LastName_13(String Enter_LastName_13)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Enter_LastName_13Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_LastName_13", "Enter_Enter_LastName_13 failed. Unable to locate object: " + Enter_LastName_13Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_LastName_13", "Enter_Enter_LastName_13 failed. Unable to locate object: " + Enter_LastName_13Elem.toString());

 			Assert.fail("Unable to locate object: " + Enter_LastName_13Elem.toString());
         }

 		elem.sendKeys(Enter_LastName_13);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_LastName_13 " + Enter_LastName_13);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_LastName_13 " + Enter_LastName_13);
 	}

      
	/**
 	 * Enter Enter_Phone 14
     * @name Enter Enter_Phone 14
     */
 	public void Enter_Enter_Phone_14(String Enter_Phone_14)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Enter_Phone_14Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_Phone_14", "Enter_Enter_Phone_14 failed. Unable to locate object: " + Enter_Phone_14Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_Phone_14", "Enter_Enter_Phone_14 failed. Unable to locate object: " + Enter_Phone_14Elem.toString());

 			Assert.fail("Unable to locate object: " + Enter_Phone_14Elem.toString());
         }

 		elem.sendKeys(Enter_Phone_14);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_Phone_14 " + Enter_Phone_14);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_Phone_14 " + Enter_Phone_14);
 	}

     
	/**
 	 * Click Save 15
     * @name Click Save 15
     */
	public void Click_Save_15()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[2]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(Save_15Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Save_15", "Click_Save_15 failed. Unable to locate object: " + Save_15Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Save_15", "Click_Save_15 failed. Unable to locate object: " + Save_15Elem.toString());

			Assert.fail("Unable to locate object: " + Save_15Elem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_Save_15");

		TestModellerLogger.PassStep(m_Driver, "Click_Save_15");
	}

     
	/**
 	 * Click Get_Msg 16
     * @name Click Get_Msg 16
     */
	public void Click_Get_Msg_16()
	{
        
		WebElement elem = getWebElement(Get_Msg_16Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Get_Msg_16", "Click_Get_Msg_16 failed. Unable to locate object: " + Get_Msg_16Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Get_Msg_16", "Click_Get_Msg_16 failed. Unable to locate object: " + Get_Msg_16Elem.toString());

			Assert.fail("Unable to locate object: " + Get_Msg_16Elem.toString());
        }

		String msg=elem.getText();
		boolean b=msg.contains("Success! New Customer added successfully");
		Assert.assertTrue(b);
		utilities.Screenshotcapture.Getscreenshot("New Customer added successfully", "Customer List (Income)");
          	

		ExtentReportManager.passStep(m_Driver, "Click_Get_Msg_16");

		TestModellerLogger.PassStep(m_Driver, "Click_Get_Msg_16");
	}

     
	/**
 	 * Click Select_AllCheakBoxBtn17
     * @name Click Select_AllCheakBoxBtn17
     */
	public void Click_Select_AllCheakBoxBtn17()
	{
        
		WebElement elem = getWebElement(Select_AllCheakBoxBtn17Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Select_AllCheakBoxBtn17", "Click_Select_AllCheakBoxBtn17 failed. Unable to locate object: " + Select_AllCheakBoxBtn17Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Select_AllCheakBoxBtn17", "Click_Select_AllCheakBoxBtn17 failed. Unable to locate object: " + Select_AllCheakBoxBtn17Elem.toString());

			Assert.fail("Unable to locate object: " + Select_AllCheakBoxBtn17Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Select_AllCheakBoxBtn17");

		TestModellerLogger.PassStep(m_Driver, "Click_Select_AllCheakBoxBtn17");
	}

     
	/**
 	 * Click Send Mail 18
     * @name Click Send Mail 18
     */
	public void Click_Send_Mail_18()
	{
        
		WebElement elem = getWebElement(Send_Mail_18Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Send_Mail_18", "Click_Send_Mail_18 failed. Unable to locate object: " + Send_Mail_18Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Send_Mail_18", "Click_Send_Mail_18 failed. Unable to locate object: " + Send_Mail_18Elem.toString());

			Assert.fail("Unable to locate object: " + Send_Mail_18Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Send_Mail_18");

		TestModellerLogger.PassStep(m_Driver, "Click_Send_Mail_18");
	}

    
	/**
 	 * Select Select_Banks 19
     * @name Select Select_Banks 19
     */
    public void Select_Select_Banks_19(String Select_Banks_19)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[3]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Select_Banks_19Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Select_Banks_19", "Select_Select_Banks_19 failed. Unable to locate object: " + Select_Banks_19Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Select_Banks_19", "Select_Select_Banks_19 failed. Unable to locate object: " + Select_Banks_19Elem.toString());

 			Assert.fail("Unable to locate object: " + Select_Banks_19Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Select_Banks_19);
 		
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_Select_Banks_19 " + Select_Banks_19);

 		TestModellerLogger.PassStep(m_Driver, "Select_Select_Banks_19 " + Select_Banks_19);
 	}

      
	/**
 	 * Enter Enter_DateFrom 20
     * @name Enter Enter_DateFrom 20
     */
 	public void Enter_Enter_DateFrom_20(String Enter_DateFrom_20)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[3]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Enter_DateFrom_20Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_DateFrom_20", "Enter_Enter_DateFrom_20 failed. Unable to locate object: " + Enter_DateFrom_20Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_DateFrom_20", "Enter_Enter_DateFrom_20 failed. Unable to locate object: " + Enter_DateFrom_20Elem.toString());

 			Assert.fail("Unable to locate object: " + Enter_DateFrom_20Elem.toString());
         }

 		elem.sendKeys(Enter_DateFrom_20);
 		elem.sendKeys(Keys.TAB);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_DateFrom_20 " + Enter_DateFrom_20);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_DateFrom_20 " + Enter_DateFrom_20);
 	}

      
	/**
 	 * Enter Enter_DateTo 21
     * @name Enter Enter_DateTo 21
     */
 	public void Enter_Enter_DateTo_21(String Enter_DateTo_21)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[3]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Enter_DateTo_21Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_DateTo_21", "Enter_Enter_DateTo_21 failed. Unable to locate object: " + Enter_DateTo_21Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_DateTo_21", "Enter_Enter_DateTo_21 failed. Unable to locate object: " + Enter_DateTo_21Elem.toString());

 			Assert.fail("Unable to locate object: " + Enter_DateTo_21Elem.toString());
         }

 		elem.sendKeys(Enter_DateTo_21);
 		elem.sendKeys(Keys.TAB);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_DateTo_21 " + Enter_DateTo_21);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_DateTo_21 " + Enter_DateTo_21);
 	}

    
	/**
 	 * Select Select_EmailTemplate 22
     * @name Select Select_EmailTemplate 22
     */
    public void Select_Select_EmailTemplate_22(String Select_EmailTemplate_22)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[3]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Select_EmailTemplate_22Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Select_EmailTemplate_22", "Select_Select_EmailTemplate_22 failed. Unable to locate object: " + Select_EmailTemplate_22Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Select_EmailTemplate_22", "Select_Select_EmailTemplate_22 failed. Unable to locate object: " + Select_EmailTemplate_22Elem.toString());

 			Assert.fail("Unable to locate object: " + Select_EmailTemplate_22Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Select_EmailTemplate_22);
 		
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_Select_EmailTemplate_22 " + Select_EmailTemplate_22);

 		TestModellerLogger.PassStep(m_Driver, "Select_Select_EmailTemplate_22 " + Select_EmailTemplate_22);
 	}

      
	/**
 	 * Enter Enter_EmailID 23
     * @name Enter Enter_EmailID 23
     */
 	public void Enter_Enter_EmailID_23(String Enter_EmailID_23)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[3]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Enter_EmailID_23Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_EmailID_23", "Enter_Enter_EmailID_23 failed. Unable to locate object: " + Enter_EmailID_23Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_EmailID_23", "Enter_Enter_EmailID_23 failed. Unable to locate object: " + Enter_EmailID_23Elem.toString());

 			Assert.fail("Unable to locate object: " + Enter_EmailID_23Elem.toString());
         }

 		elem.sendKeys(Enter_EmailID_23);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_EmailID_23 " + Enter_EmailID_23);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_EmailID_23 " + Enter_EmailID_23);
 	}

     
	/**
 	 * Click SendBtn 24
	 * @throws InterruptedException 
     * @name Click SendBtn 24
     */
	public void Click_SendBtn_24() throws InterruptedException
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[3]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(SendBtn_24Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SendBtn_24", "Click_SendBtn_24 failed. Unable to locate object: " + SendBtn_24Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SendBtn_24", "Click_SendBtn_24 failed. Unable to locate object: " + SendBtn_24Elem.toString());

			Assert.fail("Unable to locate object: " + SendBtn_24Elem.toString());
        }
//Thread.sleep(4000);
		elem.click();
		Thread.sleep(4000);
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_SendBtn_24");

		TestModellerLogger.PassStep(m_Driver, "Click_SendBtn_24");
	}
	
	
	
	public void Tc01GetMsg() throws InterruptedException
	{
		Thread.sleep(2000);
		utilities.Screenshotcapture.Getscreenshot("Search Box Working Proper", "Customer List (Income)");
		
		
		
	}
	
	public void TC03GetMsg() throws InterruptedException
	{
		Thread.sleep(2000);
		utilities.Screenshotcapture.Getscreenshot("Customer List Send To  Emails", "Customer List (Income)");
		
	}
	
	
	
}