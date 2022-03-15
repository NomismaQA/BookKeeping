package As_Supplier;

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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/b6e200b1-774a-455e-ad9c-719bb59d8551
@TestModellerModule(guid = "b6e200b1-774a-455e-ad9c-719bb59d8551")
public class Expense_Reimbursement extends BasePage
{
	public Expense_Reimbursement (WebDriver driver)
	{
		super(driver);
	}


	
	private By Expenditure1Elem = By.xpath("//*[@id='ctl00_SideMenu1_ExpensesMenu']/a/span");

	private By View_2Elem = By.xpath("//*[@id='ctl00_divMainContent']/header/div/div[3]/a");

	private By Expense_Reimbursement_3Elem = By.xpath("//A[contains(text(),'Expense Reimbursement')]");

	private By Select_Months_4Elem = By.xpath("//SELECT[@name='ctl00$cPHFilter$ddlMonths']");

	private By Enter_Date_From_5Elem = By.xpath("//INPUT[@name='ctl00$cPHFilter$txtDateFrom']");

	private By Enter_DateTo_6Elem = By.xpath("//INPUT[@name='ctl00$cPHFilter$txtDateTo']");

	private By Select_Any_7Elem = By.xpath("//*[@id=\"ctl00_divMainContent\"]/header/div/div[1]/div");

	private By Allowance_Btn_8Elem = By.xpath("//A[@id='ctl00_cpHeaderRight_lnkAddAllowance']");

	private By Select_Employee_9Elem = By.xpath("//label[normalize-space()= 'Employee*']/../../div[2]/select");

	private By Enter_Date_10Elem = By.xpath("//label[normalize-space()= 'Date*']/../../div[2]/input");

	private By Enter_Description_11Elem = By.xpath("//label[normalize-space()= 'Description*']/../../div[2]/input");

	private By Select_ExpenseHead_12Elem = By.xpath("//label[normalize-space()= 'Expense Type*']/../../div[2]/select");

	private By Enter_Amount_13Elem = By.xpath("//label[normalize-space()= 'Total*']/../../div[2]/input");

	private By Save_14Elem = By.xpath("//A[@id='ctl00_cphFooter_btnSave']");

	private By Click_Expense_15Elem = By.xpath("//A[@id='ctl00_cpHeaderRight_lnkAddExpense']");

	private By Select_Employee_16Elem = By.xpath("//label[normalize-space()= 'Employee*']/../../div[2]/select");

	private By Enter_Date_17Elem = By.xpath("//label[normalize-space()= 'Date*']/../../div[2]/input");

	private By Select_VATRate_19Elem = By.xpath("//select[@id='ctl00_cPH_ddVATRate']");

	private By Select_ExpenseHead_20Elem = By.xpath("//label[normalize-space()= 'Expense Head*']/../../div[2]/select");

	private By Enter_Amount_21Elem = By.xpath("//label[normalize-space()= 'Total Amount*']/../../div[2]/input");

	private By Save_22Elem = By.xpath("//*[@id='ctl00_cphFooter_btnSave']");

	private By Mileage_23Elem = By.xpath("//A[@id='ctl00_cpHeaderRight_lnkAddMileage']");

	private By Employee_24Elem = By.xpath("//label[normalize-space()= 'Employee*']/../../div[2]/select");

	private By Enter_Description25Elem = By.xpath("//label[normalize-space()= 'Description*']/../../div[2]/input");

	private By EnterDate_26Elem = By.xpath("//label[normalize-space()= 'Date*']/../../div[2]/input");

	private By SelectVehicleType_27Elem = By.xpath("//label[normalize-space()= 'Vehicle Type*']/../../div[2]/select");

	private By EnterMileage_28Elem = By.xpath("//label[normalize-space()= 'Total Mileage*']/../../div[2]/input");

	private By EnterVATAmount_29Elem = By.xpath("//label[normalize-space()= 'VAT Amount']/../../div[2]/input");

	private By Save_30Elem = By.xpath("//A[@id='ctl00_cphFooter_btnSave']");

	private By Click_Payment_31Elem = By.xpath("//A[@id='ctl00_cpHeaderRight_lnkAddPayment']");

	private By Employee_32Elem = By.xpath("//label[normalize-space()= 'Employee*']/../../div[2]/select");

	private By Enter_Description_33Elem = By.xpath("//label[normalize-space()= 'Description*']/../../div[2]/input");

	private By Enter_Date_34Elem = By.xpath("//label[normalize-space()= 'Date*']/../../div[2]/input");

	private By Select_Paid_to_35Elem = By.xpath("//label[normalize-space()= 'Paid To*']/../../div[2]/select");

	private By Enter_Amount_36Elem = By.xpath("//label[normalize-space()= 'Total Amount*']/../../div[2]/input");

	private By Save_37Elem = By.xpath("//A[@id='ctl00_cphFooter_btnSave']");

	private By Download_CSV_38Elem = By.xpath("//A[@id='ctl00_cpHeaderRight_btnExportCSV']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AccountUI/Reimbursement.aspx?FYCode=117536&CompanyCode=17199&menuid=0&p=18400&mo=2");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/Reimbursement.aspx?FYCode=117536&CompanyCode=17199&menuid=0&p=18400&mo=2");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/Reimbursement.aspx?FYCode=117536&CompanyCode=17199&menuid=0&p=18400&mo=2");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/AccountUI/Reimbursement.aspx?FYCode=117536&CompanyCode=17199&menuid=0&p=18400&mo=2";

        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/AccountUI/Reimbursement.aspx?FYCode=117536&CompanyCode=17199&menuid=0&p=18400&mo=2")) {
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
 	 * Click View 2
     * @name Click View 2
     */
	public void Click_View_2()
	{
        
		WebElement elem = getWebElement(View_2Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_View_2", "Click_View_2 failed. Unable to locate object: " + View_2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_View_2", "Click_View_2 failed. Unable to locate object: " + View_2Elem.toString());

			Assert.fail("Unable to locate object: " + View_2Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_View_2");

		TestModellerLogger.PassStep(m_Driver, "Click_View_2");
	}

     
	/**
 	 * Click Expense Reimbursement 3
     * @name Click Expense Reimbursement 3
     */
	public void Click_Expense_Reimbursement_3()
	{
        
		WebElement elem = getWebElement(Expense_Reimbursement_3Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Expense_Reimbursement_3", "Click_Expense_Reimbursement_3 failed. Unable to locate object: " + Expense_Reimbursement_3Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Expense_Reimbursement_3", "Click_Expense_Reimbursement_3 failed. Unable to locate object: " + Expense_Reimbursement_3Elem.toString());

			Assert.fail("Unable to locate object: " + Expense_Reimbursement_3Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Expense_Reimbursement_3");

		TestModellerLogger.PassStep(m_Driver, "Click_Expense_Reimbursement_3");
	}

    
	/**
 	 * Select Select Months 4
     * @name Select Select Months 4
     */
    public void Select_Select_Months_4(String Select_Months_4)
 	{
 	    
 		WebElement elem = getWebElement(Select_Months_4Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Select_Months_4", "Select_Select_Months_4 failed. Unable to locate object: " + Select_Months_4Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Select_Months_4", "Select_Select_Months_4 failed. Unable to locate object: " + Select_Months_4Elem.toString());

 			Assert.fail("Unable to locate object: " + Select_Months_4Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Select_Months_4);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Select_Months_4 " + Select_Months_4);

 		TestModellerLogger.PassStep(m_Driver, "Select_Select_Months_4 " + Select_Months_4);
 	}

      
	/**
 	 * Enter Enter Date From 5
	 * @throws InterruptedException 
     * @name Enter Enter Date From 5
     */
 	public void Enter_Enter_Date_From_5(String Enter_Date_From_5) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(Enter_Date_From_5Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_Date_From_5", "Enter_Enter_Date_From_5 failed. Unable to locate object: " + Enter_Date_From_5Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_Date_From_5", "Enter_Enter_Date_From_5 failed. Unable to locate object: " + Enter_Date_From_5Elem.toString());

 			Assert.fail("Unable to locate object: " + Enter_Date_From_5Elem.toString());
         }
 		for(int i=0; i<10;i++)
 	 		{
 	 			elem.sendKeys(Keys.BACK_SPACE);
	 		}
      
 		elem.sendKeys(Enter_Date_From_5);
 		elem.sendKeys(Keys.TAB);
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_Date_From_5 " + Enter_Date_From_5);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_Date_From_5 " + Enter_Date_From_5);
 	}

      
	/**
 	 * Enter Enter DateTo 6
	 * @throws InterruptedException 
     * @name Enter Enter DateTo 6
     */
 	public void Enter_Enter_DateTo_6(String Enter_DateTo_6) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(Enter_DateTo_6Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_DateTo_6", "Enter_Enter_DateTo_6 failed. Unable to locate object: " + Enter_DateTo_6Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_DateTo_6", "Enter_Enter_DateTo_6 failed. Unable to locate object: " + Enter_DateTo_6Elem.toString());

 			Assert.fail("Unable to locate object: " + Enter_DateTo_6Elem.toString());
         }
 		
 		for(int i=0; i<10;i++)
	 		{
	 			elem.sendKeys(Keys.BACK_SPACE);
 		   }
 		elem.sendKeys(Enter_DateTo_6);
 		elem.sendKeys(Keys.TAB);
 		Thread.sleep(2000);
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_DateTo_6 " + Enter_DateTo_6);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_DateTo_6 " + Enter_DateTo_6);
 	}

     
	/**
 	 * Click Select Any 7
     * @name Click Select Any 7
     */
	public void Click_Select_Any_7()
	{
        
		WebElement elem = getWebElement(Select_Any_7Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Select_Any_7", "Click_Select_Any_7 failed. Unable to locate object: " + Select_Any_7Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Select_Any_7", "Click_Select_Any_7 failed. Unable to locate object: " + Select_Any_7Elem.toString());

			Assert.fail("Unable to locate object: " + Select_Any_7Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Select_Any_7");

		TestModellerLogger.PassStep(m_Driver, "Click_Select_Any_7");
	}

     
	/**
 	 * Click Allowance +Btn 8
     * @name Click Allowance +Btn 8
     */
	public void Click_Allowance_Btn_8()
	{
        
		WebElement elem = getWebElement(Allowance_Btn_8Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Allowance_Btn_8", "Click_Allowance_Btn_8 failed. Unable to locate object: " + Allowance_Btn_8Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Allowance_Btn_8", "Click_Allowance_Btn_8 failed. Unable to locate object: " + Allowance_Btn_8Elem.toString());

			Assert.fail("Unable to locate object: " + Allowance_Btn_8Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Allowance_Btn_8");

		TestModellerLogger.PassStep(m_Driver, "Click_Allowance_Btn_8");
	}

    
	/**
 	 * Select Select Employee 9
     * @name Select Select Employee 9
     */
    public void Select_Select_Employee_9(String Select_Employee_9)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Select_Employee_9Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Select_Employee_9", "Select_Select_Employee_9 failed. Unable to locate object: " + Select_Employee_9Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Select_Employee_9", "Select_Select_Employee_9 failed. Unable to locate object: " + Select_Employee_9Elem.toString());

 			Assert.fail("Unable to locate object: " + Select_Employee_9Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Select_Employee_9);
 		
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_Select_Employee_9 " + Select_Employee_9);

 		TestModellerLogger.PassStep(m_Driver, "Select_Select_Employee_9 " + Select_Employee_9);
 	}

      
	/**
 	 * Enter Enter Date 10
     * @name Enter Enter Date 10
     */
 	public void Enter_Enter_Date_10(String Enter_Date_10)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Enter_Date_10Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_Date_10", "Enter_Enter_Date_10 failed. Unable to locate object: " + Enter_Date_10Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_Date_10", "Enter_Enter_Date_10 failed. Unable to locate object: " + Enter_Date_10Elem.toString());

 			Assert.fail("Unable to locate object: " + Enter_Date_10Elem.toString());
         }

 		elem.sendKeys(Enter_Date_10);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_Date_10 " + Enter_Date_10);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_Date_10 " + Enter_Date_10);
 	}

      
	/**
 	 * Enter Enter Description 11
     * @name Enter Enter Description 11
     */
 	public void Enter_Enter_Description_11(String Enter_Description_11)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Enter_Description_11Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_Description_11", "Enter_Enter_Description_11 failed. Unable to locate object: " + Enter_Description_11Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_Description_11", "Enter_Enter_Description_11 failed. Unable to locate object: " + Enter_Description_11Elem.toString());

 			Assert.fail("Unable to locate object: " + Enter_Description_11Elem.toString());
         }

 		elem.sendKeys(Enter_Description_11);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_Description_11 " + Enter_Description_11);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_Description_11 " + Enter_Description_11);
 	}

    
	/**
 	 * Select Select ExpenseHead 12
     * @name Select Select ExpenseHead 12
     */
    public void Select_Select_ExpenseHead_12(String Select_ExpenseHead_12)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Select_ExpenseHead_12Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Select_ExpenseHead_12", "Select_Select_ExpenseHead_12 failed. Unable to locate object: " + Select_ExpenseHead_12Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Select_ExpenseHead_12", "Select_Select_ExpenseHead_12 failed. Unable to locate object: " + Select_ExpenseHead_12Elem.toString());

 			Assert.fail("Unable to locate object: " + Select_ExpenseHead_12Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Select_ExpenseHead_12);
 		
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_Select_ExpenseHead_12 " + Select_ExpenseHead_12);

 		TestModellerLogger.PassStep(m_Driver, "Select_Select_ExpenseHead_12 " + Select_ExpenseHead_12);
 	}

      
	/**
 	 * Enter Enter Amount 13
     * @name Enter Enter Amount 13
     */
 	public void Enter_Enter_Amount_13(String Enter_Amount_13)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Enter_Amount_13Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_Amount_13", "Enter_Enter_Amount_13 failed. Unable to locate object: " + Enter_Amount_13Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_Amount_13", "Enter_Enter_Amount_13 failed. Unable to locate object: " + Enter_Amount_13Elem.toString());

 			Assert.fail("Unable to locate object: " + Enter_Amount_13Elem.toString());
         }

 		elem.sendKeys(Enter_Amount_13);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_Amount_13 " + Enter_Amount_13);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_Amount_13 " + Enter_Amount_13);
 	}

     
	/**
 	 * Click Save 14
	 * @throws InterruptedException 
     * @name Click Save 14
     */
	public void Click_Save_14() throws InterruptedException
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[2]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(Save_14Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Save_14", "Click_Save_14 failed. Unable to locate object: " + Save_14Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Save_14", "Click_Save_14 failed. Unable to locate object: " + Save_14Elem.toString());

			Assert.fail("Unable to locate object: " + Save_14Elem.toString());
        }

		elem.click();
		
        Thread.sleep(2000);
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_Save_14");

		TestModellerLogger.PassStep(m_Driver, "Click_Save_14");
	}

     
	/**
 	 * Click Click Expense 15
     * @name Click Click Expense 15
     */
	public void Click_Click_Expense_15()
	{
        
		WebElement elem = getWebElement(Click_Expense_15Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Click_Expense_15", "Click_Click_Expense_15 failed. Unable to locate object: " + Click_Expense_15Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Click_Expense_15", "Click_Click_Expense_15 failed. Unable to locate object: " + Click_Expense_15Elem.toString());

			Assert.fail("Unable to locate object: " + Click_Expense_15Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Click_Expense_15");

		TestModellerLogger.PassStep(m_Driver, "Click_Click_Expense_15");
	}

    
	/**
 	 * Select Select Employee 16
     * @name Select Select Employee 16
     */
    public void Select_Select_Employee_16(String Select_Employee_16)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[3]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Select_Employee_16Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Select_Employee_16", "Select_Select_Employee_16 failed. Unable to locate object: " + Select_Employee_16Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Select_Employee_16", "Select_Select_Employee_16 failed. Unable to locate object: " + Select_Employee_16Elem.toString());

 			Assert.fail("Unable to locate object: " + Select_Employee_16Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Select_Employee_16);
 		
 		
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_Select_Employee_16 " + Select_Employee_16);

 		TestModellerLogger.PassStep(m_Driver, "Select_Select_Employee_16 " + Select_Employee_16);
 	}

      
	/**
 	 * Enter Enter Date 17
     * @name Enter Enter Date 17
     */
 	public void Enter_Enter_Date_17(String Enter_Date_17)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[3]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Enter_Date_17Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_Date_17", "Enter_Enter_Date_17 failed. Unable to locate object: " + Enter_Date_17Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_Date_17", "Enter_Enter_Date_17 failed. Unable to locate object: " + Enter_Date_17Elem.toString());

 			Assert.fail("Unable to locate object: " + Enter_Date_17Elem.toString());
         }

 		elem.sendKeys(Enter_Date_17);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_Date_17 " + Enter_Date_17);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_Date_17 " + Enter_Date_17);
 	}

 	
 	public void Enter_Enter_Description_18(String Dis)
 	{
 		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[3]/div/div/div[2]/iframe")));
 		m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_txtDescription']")).sendKeys(Dis);
 		
 		m_Driver.switchTo().defaultContent();

 	}
    
	/**
 	 * Select Select VATRate 19
	 * @throws InterruptedException 
     * @name Select Select VATRate 19
     */
    public void Select_Select_VATRate_19(String Select_VATRate_19) throws InterruptedException
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[3]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Select_VATRate_19Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Select_VATRate_19", "Select_Select_VATRate_19 failed. Unable to locate object: " + Select_VATRate_19Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Select_VATRate_19", "Select_Select_VATRate_19 failed. Unable to locate object: " + Select_VATRate_19Elem.toString());

 			Assert.fail("Unable to locate object: " + Select_VATRate_19Elem.toString());
         }
 	
 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Select_VATRate_19);
 		
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_Select_VATRate_19 " + Select_VATRate_19);

 		TestModellerLogger.PassStep(m_Driver, "Select_Select_VATRate_19 " + Select_VATRate_19);
 	}

    
	/**
 	 * Select Select ExpenseHead 20
	 * @throws InterruptedException 
     * @name Select Select ExpenseHead 20
     */
    public void Select_Select_ExpenseHead_20(String Select_ExpenseHead_20) throws InterruptedException
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[3]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Select_ExpenseHead_20Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Select_ExpenseHead_20", "Select_Select_ExpenseHead_20 failed. Unable to locate object: " + Select_ExpenseHead_20Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Select_ExpenseHead_20", "Select_Select_ExpenseHead_20 failed. Unable to locate object: " + Select_ExpenseHead_20Elem.toString());

 			Assert.fail("Unable to locate object: " + Select_ExpenseHead_20Elem.toString());
         }
 		
 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Select_ExpenseHead_20);
 		
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_Select_ExpenseHead_20 " + Select_ExpenseHead_20);

 		TestModellerLogger.PassStep(m_Driver, "Select_Select_ExpenseHead_20 " + Select_ExpenseHead_20);
 	}

      
	/**
 	 * Enter Enter Amount 21
	 * @throws InterruptedException 
     * @name Enter Enter Amount 21
     */
 	public void Enter_Enter_Amount_21(String Enter_Amount_21) throws InterruptedException
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[3]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Enter_Amount_21Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_Amount_21", "Enter_Enter_Amount_21 failed. Unable to locate object: " + Enter_Amount_21Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_Amount_21", "Enter_Enter_Amount_21 failed. Unable to locate object: " + Enter_Amount_21Elem.toString());

 			Assert.fail("Unable to locate object: " + Enter_Amount_21Elem.toString());
         }
 		
 		elem.sendKeys(Enter_Amount_21);
 		elem.sendKeys(Keys.TAB);
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_Amount_21 " + Enter_Amount_21);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_Amount_21 " + Enter_Amount_21);
 	}

     
	/**
 	 * Click Save 22
	 * @throws InterruptedException 
     * @name Click Save 22
     */
	public void Click_Save_22() throws InterruptedException
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='ctl00_cpHeaderRight_AddExpenseframe']")));

		WebElement elem = getWebElement(Save_22Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Save_22", "Click_Save_22 failed. Unable to locate object: " + Save_22Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Save_22", "Click_Save_22 failed. Unable to locate object: " + Save_22Elem.toString());

			Assert.fail("Unable to locate object: " + Save_22Elem.toString());
        }
		
		elem.click();
		Thread.sleep(2000);
		m_Driver.switchTo().defaultContent();
		

		ExtentReportManager.passStep(m_Driver, "Click_Save_22");

		TestModellerLogger.PassStep(m_Driver, "Click_Save_22");
	}

     
	/**
 	 * Click Mileage 23
     * @name Click Mileage 23
     */
	public void Click_Mileage_23()
	{
        
		WebElement elem = getWebElement(Mileage_23Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Mileage_23", "Click_Mileage_23 failed. Unable to locate object: " + Mileage_23Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Mileage_23", "Click_Mileage_23 failed. Unable to locate object: " + Mileage_23Elem.toString());

			Assert.fail("Unable to locate object: " + Mileage_23Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Mileage_23");

		TestModellerLogger.PassStep(m_Driver, "Click_Mileage_23");
	}

    
	/**
 	 * Select Employee 24
     * @name Select Employee 24
     */
    public void Select_Employee_24(String Employee_24)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[4]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Employee_24Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Employee_24", "Select_Employee_24 failed. Unable to locate object: " + Employee_24Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Employee_24", "Select_Employee_24 failed. Unable to locate object: " + Employee_24Elem.toString());

 			Assert.fail("Unable to locate object: " + Employee_24Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Employee_24);
 		
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_Employee_24 " + Employee_24);

 		TestModellerLogger.PassStep(m_Driver, "Select_Employee_24 " + Employee_24);
 	}

      
	/**
 	 * Enter Enter Description25
     * @name Enter Enter Description25
     */
 	public void Enter_Enter_Description25(String Enter_Description25)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[4]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Enter_Description25Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_Description25", "Enter_Enter_Description25 failed. Unable to locate object: " + Enter_Description25Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_Description25", "Enter_Enter_Description25 failed. Unable to locate object: " + Enter_Description25Elem.toString());

 			Assert.fail("Unable to locate object: " + Enter_Description25Elem.toString());
         }

 		elem.sendKeys(Enter_Description25);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_Description25 " + Enter_Description25);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_Description25 " + Enter_Description25);
 	}

      
	/**
 	 * Enter EnterDate 26
     * @name Enter EnterDate 26
     */
 	public void Enter_EnterDate_26(String EnterDate_26)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[4]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(EnterDate_26Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_EnterDate_26", "Enter_EnterDate_26 failed. Unable to locate object: " + EnterDate_26Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_EnterDate_26", "Enter_EnterDate_26 failed. Unable to locate object: " + EnterDate_26Elem.toString());

 			Assert.fail("Unable to locate object: " + EnterDate_26Elem.toString());
         }

 		elem.sendKeys(EnterDate_26);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_EnterDate_26 " + EnterDate_26);

  		TestModellerLogger.PassStep(m_Driver, "Enter_EnterDate_26 " + EnterDate_26);
 	}

    
	/**
 	 * Select SelectVehicleType 27
     * @name Select SelectVehicleType 27
     */
    public void Select_SelectVehicleType_27(String SelectVehicleType_27)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[4]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(SelectVehicleType_27Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_SelectVehicleType_27", "Select_SelectVehicleType_27 failed. Unable to locate object: " + SelectVehicleType_27Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_SelectVehicleType_27", "Select_SelectVehicleType_27 failed. Unable to locate object: " + SelectVehicleType_27Elem.toString());

 			Assert.fail("Unable to locate object: " + SelectVehicleType_27Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(SelectVehicleType_27);
 		
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_SelectVehicleType_27 " + SelectVehicleType_27);

 		TestModellerLogger.PassStep(m_Driver, "Select_SelectVehicleType_27 " + SelectVehicleType_27);
 	}

      
	/**
 	 * Enter EnterMileage 28
     * @name Enter EnterMileage 28
     */
 	public void Enter_EnterMileage_28(String EnterMileage_28)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[4]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(EnterMileage_28Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_EnterMileage_28", "Enter_EnterMileage_28 failed. Unable to locate object: " + EnterMileage_28Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_EnterMileage_28", "Enter_EnterMileage_28 failed. Unable to locate object: " + EnterMileage_28Elem.toString());

 			Assert.fail("Unable to locate object: " + EnterMileage_28Elem.toString());
         }

 		elem.sendKeys(EnterMileage_28);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_EnterMileage_28 " + EnterMileage_28);

  		TestModellerLogger.PassStep(m_Driver, "Enter_EnterMileage_28 " + EnterMileage_28);
 	}

      
	/**
 	 * Enter EnterVATAmount 29
     * @name Enter EnterVATAmount 29
     */
 	public void Enter_EnterVATAmount_29(String EnterVATAmount_29)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[4]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(EnterVATAmount_29Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_EnterVATAmount_29", "Enter_EnterVATAmount_29 failed. Unable to locate object: " + EnterVATAmount_29Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_EnterVATAmount_29", "Enter_EnterVATAmount_29 failed. Unable to locate object: " + EnterVATAmount_29Elem.toString());

 			Assert.fail("Unable to locate object: " + EnterVATAmount_29Elem.toString());
         }

 		elem.sendKeys(EnterVATAmount_29);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_EnterVATAmount_29 " + EnterVATAmount_29);

  		TestModellerLogger.PassStep(m_Driver, "Enter_EnterVATAmount_29 " + EnterVATAmount_29);
 	}

     
	/**
 	 * Click Save 30
	 * @throws InterruptedException 
     * @name Click Save 30
     */
	public void Click_Save_30() throws InterruptedException
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[4]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(Save_30Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Save_30", "Click_Save_30 failed. Unable to locate object: " + Save_30Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Save_30", "Click_Save_30 failed. Unable to locate object: " + Save_30Elem.toString());

			Assert.fail("Unable to locate object: " + Save_30Elem.toString());
        }

		elem.click();
		Thread.sleep(2000);
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_Save_30");

		TestModellerLogger.PassStep(m_Driver, "Click_Save_30");
	}

     
	/**
 	 * Click Click Payment 31
     * @name Click Click Payment 31
     */
	public void Click_Click_Payment_31()
	{
        
		WebElement elem = getWebElement(Click_Payment_31Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Click_Payment_31", "Click_Click_Payment_31 failed. Unable to locate object: " + Click_Payment_31Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Click_Payment_31", "Click_Click_Payment_31 failed. Unable to locate object: " + Click_Payment_31Elem.toString());

			Assert.fail("Unable to locate object: " + Click_Payment_31Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Click_Payment_31");

		TestModellerLogger.PassStep(m_Driver, "Click_Click_Payment_31");
	}

    
	/**
 	 * Select Employee 32
     * @name Select Employee 32
     */
    public void Select_Employee_32(String Employee_32)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[5]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Employee_32Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Employee_32", "Select_Employee_32 failed. Unable to locate object: " + Employee_32Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Employee_32", "Select_Employee_32 failed. Unable to locate object: " + Employee_32Elem.toString());

 			Assert.fail("Unable to locate object: " + Employee_32Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Employee_32);
 		
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_Employee_32 " + Employee_32);

 		TestModellerLogger.PassStep(m_Driver, "Select_Employee_32 " + Employee_32);
 	}

      
	/**
 	 * Enter Enter Description 33
     * @name Enter Enter Description 33
     */
 	public void Enter_Enter_Description_33(String Enter_Description_33)
 	{
 		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='ctl00_cpHeaderRight_AddPaymentframe']")));
	//	m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[5]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Enter_Description_33Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_Description_33", "Enter_Enter_Description_33 failed. Unable to locate object: " + Enter_Description_33Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_Description_33", "Enter_Enter_Description_33 failed. Unable to locate object: " + Enter_Description_33Elem.toString());

 			Assert.fail("Unable to locate object: " + Enter_Description_33Elem.toString());
         }

 		elem.sendKeys(Enter_Description_33);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_Description_33 " + Enter_Description_33);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_Description_33 " + Enter_Description_33);
 	}

      
	/**
 	 * Enter Enter Date 34
     * @name Enter Enter Date 34
     */
 	public void Enter_Enter_Date_34(String Enter_Date_34)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='ctl00_cpHeaderRight_AddPaymentframe']")));

 		WebElement elem = getWebElement(Enter_Date_34Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_Date_34", "Enter_Enter_Date_34 failed. Unable to locate object: " + Enter_Date_34Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_Date_34", "Enter_Enter_Date_34 failed. Unable to locate object: " + Enter_Date_34Elem.toString());

 			Assert.fail("Unable to locate object: " + Enter_Date_34Elem.toString());
         }

 		elem.sendKeys(Enter_Date_34);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_Date_34 " + Enter_Date_34);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_Date_34 " + Enter_Date_34);
 	}

    
	/**
 	 * Select Select Paid to 35
     * @name Select Select Paid to 35
     */
    public void Select_Select_Paid_to_35(String Select_Paid_to_35)
 	{
    	m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='ctl00_cpHeaderRight_AddPaymentframe']")));
	//	m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[5]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Select_Paid_to_35Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Select_Paid_to_35", "Select_Select_Paid_to_35 failed. Unable to locate object: " + Select_Paid_to_35Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Select_Paid_to_35", "Select_Select_Paid_to_35 failed. Unable to locate object: " + Select_Paid_to_35Elem.toString());

 			Assert.fail("Unable to locate object: " + Select_Paid_to_35Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Select_Paid_to_35);
 		
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_Select_Paid_to_35 " + Select_Paid_to_35);

 		TestModellerLogger.PassStep(m_Driver, "Select_Select_Paid_to_35 " + Select_Paid_to_35);
 	}

      
	/**
 	 * Enter Enter Amount 36
     * @name Enter Enter Amount 36
     */
 	public void Enter_Enter_Amount_36(String Enter_Amount_36)
 	{
 		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='ctl00_cpHeaderRight_AddPaymentframe']")));
	//	m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[5]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Enter_Amount_36Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_Amount_36", "Enter_Enter_Amount_36 failed. Unable to locate object: " + Enter_Amount_36Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_Amount_36", "Enter_Enter_Amount_36 failed. Unable to locate object: " + Enter_Amount_36Elem.toString());

 			Assert.fail("Unable to locate object: " + Enter_Amount_36Elem.toString());
         }

 		elem.sendKeys(Enter_Amount_36);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_Amount_36 " + Enter_Amount_36);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_Amount_36 " + Enter_Amount_36);
 	}

     
	/**
 	 * Click Save 37
	 * @throws InterruptedException 
     * @name Click Save 37
     */
	public void Click_Save_37() throws InterruptedException
	{
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='ctl00_cpHeaderRight_AddPaymentframe']")));
	//	m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[5]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(Save_37Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Save_37", "Click_Save_37 failed. Unable to locate object: " + Save_37Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Save_37", "Click_Save_37 failed. Unable to locate object: " + Save_37Elem.toString());

			Assert.fail("Unable to locate object: " + Save_37Elem.toString());
        }

		elem.click();
		Thread.sleep(2000);
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_Save_37");

		TestModellerLogger.PassStep(m_Driver, "Click_Save_37");
	}

     
	/**
 	 * Click Download CSV 38
     * @name Click Download CSV 38
     */
	public void Click_Download_CSV_38()
	{
        
		WebElement elem = getWebElement(Download_CSV_38Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Download_CSV_38", "Click_Download_CSV_38 failed. Unable to locate object: " + Download_CSV_38Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Download_CSV_38", "Click_Download_CSV_38 failed. Unable to locate object: " + Download_CSV_38Elem.toString());

			Assert.fail("Unable to locate object: " + Download_CSV_38Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Download_CSV_38");

		TestModellerLogger.PassStep(m_Driver, "Click_Download_CSV_38");
	}
	
	
	public void Upload_File (String FilePath) throws InterruptedException
	{
		m_Driver.findElement(By.xpath("//*[@id='ctl00_cpHeaderRight_btnUploadMain']/i")).click();
		Thread.sleep(2000);
		m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_fuExpenseList']")).sendKeys(FilePath);
		Thread.sleep(1000);
		m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_lnkBtn_Upload']")).click();
		Thread.sleep(2000);
		String Upload_File_Information=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_divGridData']/div/div/div/table/tbody")).getText();
		System.out.println(Upload_File_Information);
		
		m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_btnSave']/i")).click();
		
		Thread.sleep(2000);
		
		
		
		
		
	}
	
	
	
	public void click_Mileage() throws InterruptedException
	{
		m_Driver.findElement(By.xpath("//*[@id='ctl00_divMainContent']/header/div/div[1]/div/div/div[3]/ul/li[1]/a")).click();
		Thread.sleep(2000);
		utilities.Screenshotcapture.Getscreenshot("Mileage Data Information All vehicle", "Expense Reimbursement");
	}

	
	
	public void Expence() throws InterruptedException
		{
			
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[3]/div/div/div[2]/iframe")));

		WebElement elem=m_Driver.findElement(By.xpath("//select[@id='ctl00_cPH_ddlPerson']"));
		
		
 	
 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText("Mohd Ashiv");
 		elem.sendKeys(Keys.TAB);
 		//
 		
 		WebElement Date=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_txtDate']"));
 		Date.sendKeys("14/10/2021");
 		Date.sendKeys(Keys.TAB);
 		//
 		
 		WebElement Dis=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_txtDescription']"));
 		Dis.sendKeys(Keys.TAB);
 		//
		WebElement VateR=m_Driver.findElement(By.xpath("//select[@id='ctl00_cPH_ddVATRate']"));
		

 		Select dropdown1 = new Select(VateR);

 		dropdown1.selectByVisibleText("Out of Scope");
 		elem.sendKeys(Keys.TAB);
 		Thread.sleep(2000);
 		//
		WebElement Expence=m_Driver.findElement(By.xpath("//select[@id='ctl00_cPH_ddExpenseHead']"));
		
		Select dropdown2 = new Select(Expence);

 		dropdown2.selectByVisibleText("Accountancy, Bookkeeping and Auditing Fe");
 		Thread.sleep(2000);
 		
 		//
		m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_txtAmount']")).sendKeys("1000");
		//
		
		WebElement savebtn=m_Driver.findElement(By.xpath("//*[@id='ctl00_cphFooter_btnSave']"));
		 Thread.sleep(2000);
		 
	    savebtn.click();
	    
	  
	   
	    Dis.sendKeys("Expense");
	    savebtn.click();
	    m_Driver.switchTo().defaultContent();
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}