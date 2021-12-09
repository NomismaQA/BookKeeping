package Supplier_pages;

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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/60402609-35e8-44ee-a29a-bebb127fd281
@TestModellerModule(guid = "60402609-35e8-44ee-a29a-bebb127fd281")
public class SubcontractorBill extends BasePage
{
	public SubcontractorBill (WebDriver driver)
	{
		super(driver);
	}


	private By ExpenditueTABElem = By.xpath("//span[contains(text(), 'Expenditure')]");
	//private By ExpenditueTABElem = By.xpath("//A[@href='../AccountUI/SupplierBill.aspx?FYCode=52907&CompanyCode=13590']");

	private By NewTABElem =  By.xpath("//*[@id='ctl00_divMainContent']/header/div/div[4]/a/i");

	private By NewSubcontractorBillElem = By.xpath("//A[@id='ctl00_cpHeaderRight_btnAddSubContractorBill']");

	private By BillNoElem = By.xpath("//label[contains(.,'Bill No:')]/../div/input");

	private By SupplierElem = By.xpath("//label[contains(.,'Supplier:Â *')]/../div/div[1]/select");

	private By DateElem = By.xpath("//label[contains(.,'Date:Â *')]/../div/div/input");

	private By DueDateElem = By.xpath("//label[contains(.,'Due Date:')]/../div/div/input");

	private By ExpenseTypeElem = By.xpath("//SELECT[@name='ctl00$cPH$rptrProduct$ctl00$ddExpenseHead']");

	private By DescriptionElem = By.xpath("//TEXTAREA[@name='ctl00$cPH$rptrProduct$ctl00$txtDescription']");

	private By GrossTotalElem = By.xpath("//INPUT[@name='ctl00$cPH$rptrProduct$ctl00$txtNetTotal']");

	private By SelectVATRateElem = By.xpath("//SELECT[@name='ctl00$cPH$rptrProduct$ctl00$ddVATRate']");

	private By VATRateElem = By.xpath("//INPUT[@name='ctl00$cPH$rptrProduct$ctl00$txtVATRate']");

	private By NoteElem = By.xpath("//label[contains(.,'Notes:')]/../textarea");

	private By SaveButtonElem = By.xpath("//A[@id='ctl00_cPH_btnSave']");


	
	public void GoToUrl()
	{
		m_Driver.get("https://nomisma.cloud.testinsights.io/app/#!/test-modeller/100372");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://nomisma.cloud.testinsights.io/app/#!/test-modeller/100372");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://nomisma.cloud.testinsights.io/app/#!/test-modeller/100372");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "https://nomisma.cloud.testinsights.io/app/#!/test-modeller/100372";

        if (!currentUrl.equals("https://nomisma.cloud.testinsights.io/app/#!/test-modeller/100372")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click ExpenditueTAB
	 * @throws InterruptedException 
     * @name Click ExpenditueTAB
     */
	public void Click_ExpenditueTAB() throws InterruptedException
	{
        
		WebElement elem = getWebElement(ExpenditueTABElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ExpenditueTAB", "Click_ExpenditueTAB failed. Unable to locate object: " + ExpenditueTABElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ExpenditueTAB", "Click_ExpenditueTAB failed. Unable to locate object: " + ExpenditueTABElem.toString());

			Assert.fail("Unable to locate object: " + ExpenditueTABElem.toString());
        }
System.out.println("Click_ExpenditueTAB");
	//	elem.click();
	//	Thread.sleep(1000);
      jsExec.executeScript("arguments[0].click();", elem);
      //jsExec.executeScript("arguments[0].click();", elem);
      

		ExtentReportManager.passStep(m_Driver, "Click_ExpenditueTAB");

		TestModellerLogger.PassStep(m_Driver, "Click_ExpenditueTAB");
	}

     
	/**
 	 * Click NewTAB
     * @name Click NewTAB
     */
	public void Click_NewTAB()
	{
        
		WebElement elem = getWebElement(NewTABElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_NewTAB", "Click_NewTAB failed. Unable to locate object: " + NewTABElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_NewTAB", "Click_NewTAB failed. Unable to locate object: " + NewTABElem.toString());

			Assert.fail("Unable to locate object: " + NewTABElem.toString());
        }
		System.out.println("Click_NewTAB");
	//	jsExec.executeScript("arguments[0].click();",elem);
		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_NewTAB");

		TestModellerLogger.PassStep(m_Driver, "Click_NewTAB");
	}

     
	/**
 	 * Click NewSubcontractorBill
     * @name Click NewSubcontractorBill
     */
	public void Click_NewSubcontractorBill()
	{
        
		WebElement elem = getWebElement(NewSubcontractorBillElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_NewSubcontractorBill", "Click_NewSubcontractorBill failed. Unable to locate object: " + NewSubcontractorBillElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_NewSubcontractorBill", "Click_NewSubcontractorBill failed. Unable to locate object: " + NewSubcontractorBillElem.toString());

			Assert.fail("Unable to locate object: " + NewSubcontractorBillElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_NewSubcontractorBill");

		TestModellerLogger.PassStep(m_Driver, "Click_NewSubcontractorBill");
	}

      
	/**
 	 * Enter BillNo
     * @name Enter BillNo
     */
 	public void Enter_BillNo(String BillNo)
 	{
 	    
 		WebElement elem = getWebElement(BillNoElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_BillNo", "Enter_BillNo failed. Unable to locate object: " + BillNoElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_BillNo", "Enter_BillNo failed. Unable to locate object: " + BillNoElem.toString());

 			Assert.fail("Unable to locate object: " + BillNoElem.toString());
         }

 		elem.sendKeys(BillNo);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_BillNo " + BillNo);

  		TestModellerLogger.PassStep(m_Driver, "Enter_BillNo " + BillNo);
 	}

    
	/**
 	 * Select Supplier
     * @name Select Supplier
     */
    public void Select_Supplier(String Supplier)
 	{
 	    
 		WebElement elem = getWebElement(SupplierElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Supplier", "Select_Supplier failed. Unable to locate object: " + SupplierElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Supplier", "Select_Supplier failed. Unable to locate object: " + SupplierElem.toString());

 			Assert.fail("Unable to locate object: " + SupplierElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Supplier);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Supplier " + Supplier);

 		TestModellerLogger.PassStep(m_Driver, "Select_Supplier " + Supplier);
 	}

      
	/**
 	 * Enter Date
     * @name Enter Date
     */
 	public void Enter_Date(String Date)
 	{
 	    
 		WebElement elem = getWebElement(DateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Date", "Enter_Date failed. Unable to locate object: " + DateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Date", "Enter_Date failed. Unable to locate object: " + DateElem.toString());

 			Assert.fail("Unable to locate object: " + DateElem.toString());
         }

 		elem.sendKeys(Date);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Date " + Date);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Date " + Date);
 	}

      
	/**
 	 * Enter DueDate
     * @name Enter DueDate
     */
 	public void Enter_DueDate(String DueDate)
 	{
 	    
 		WebElement elem = getWebElement(DueDateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_DueDate", "Enter_DueDate failed. Unable to locate object: " + DueDateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_DueDate", "Enter_DueDate failed. Unable to locate object: " + DueDateElem.toString());

 			Assert.fail("Unable to locate object: " + DueDateElem.toString());
         }

 		elem.sendKeys(DueDate);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_DueDate " + DueDate);

  		TestModellerLogger.PassStep(m_Driver, "Enter_DueDate " + DueDate);
 	}

    
	/**
 	 * Select ExpenseType
     * @name Select ExpenseType
     */
    public void Select_ExpenseType(String ExpenseType)
 	{
 	    
 		WebElement elem = getWebElement(ExpenseTypeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_ExpenseType", "Select_ExpenseType failed. Unable to locate object: " + ExpenseTypeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_ExpenseType", "Select_ExpenseType failed. Unable to locate object: " + ExpenseTypeElem.toString());

 			Assert.fail("Unable to locate object: " + ExpenseTypeElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(ExpenseType);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_ExpenseType " + ExpenseType);

 		TestModellerLogger.PassStep(m_Driver, "Select_ExpenseType " + ExpenseType);
 	}

      
	/**
 	 * Enter Description
     * @name Enter Description
     */
 	public void Enter_Description(String Description)
 	{
 	    
 		WebElement elem = getWebElement(DescriptionElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Description", "Enter_Description failed. Unable to locate object: " + DescriptionElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Description", "Enter_Description failed. Unable to locate object: " + DescriptionElem.toString());

 			Assert.fail("Unable to locate object: " + DescriptionElem.toString());
         }

 		elem.sendKeys(Description);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Description " + Description);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Description " + Description);
 	}

      
	/**
 	 * Enter GrossTotal
     * @name Enter GrossTotal
     */
 	public void Enter_GrossTotal(String GrossTotal)
 	{
 	    
 		WebElement elem = getWebElement(GrossTotalElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_GrossTotal", "Enter_GrossTotal failed. Unable to locate object: " + GrossTotalElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_GrossTotal", "Enter_GrossTotal failed. Unable to locate object: " + GrossTotalElem.toString());

 			Assert.fail("Unable to locate object: " + GrossTotalElem.toString());
         }

 		elem.sendKeys(GrossTotal);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_GrossTotal " + GrossTotal);

  		TestModellerLogger.PassStep(m_Driver, "Enter_GrossTotal " + GrossTotal);
 	}

    
	/**
 	 * Select SelectVATRate
     * @name Select SelectVATRate
     */
    public void Select_SelectVATRate(String SelectVATRate)
 	{
 	    
 		WebElement elem = getWebElement(SelectVATRateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_SelectVATRate", "Select_SelectVATRate failed. Unable to locate object: " + SelectVATRateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_SelectVATRate", "Select_SelectVATRate failed. Unable to locate object: " + SelectVATRateElem.toString());

 			Assert.fail("Unable to locate object: " + SelectVATRateElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(SelectVATRate);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_SelectVATRate " + SelectVATRate);

 		TestModellerLogger.PassStep(m_Driver, "Select_SelectVATRate " + SelectVATRate);
 	}

      
	/**
 	 * Enter VATRate
     * @name Enter VATRate
     */
 	public void Enter_VATRate(String VATRate)
 	{
 	    
 		WebElement elem = getWebElement(VATRateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_VATRate", "Enter_VATRate failed. Unable to locate object: " + VATRateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_VATRate", "Enter_VATRate failed. Unable to locate object: " + VATRateElem.toString());

 			Assert.fail("Unable to locate object: " + VATRateElem.toString());
         }

 		elem.sendKeys(VATRate);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_VATRate " + VATRate);

  		TestModellerLogger.PassStep(m_Driver, "Enter_VATRate " + VATRate);
 	}

      
	/**
 	 * Enter Note
     * @name Enter Note
     */
 	public void Enter_Note(String Note)
 	{
 	    
 		WebElement elem = getWebElement(NoteElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Note", "Enter_Note failed. Unable to locate object: " + NoteElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Note", "Enter_Note failed. Unable to locate object: " + NoteElem.toString());

 			Assert.fail("Unable to locate object: " + NoteElem.toString());
         }

 		elem.sendKeys(Note);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Note " + Note);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Note " + Note);
 	}

     
	/**
 	 * Click SaveButton
     * @name Click SaveButton
     */
	public void Click_SaveButton()
	{
        
		WebElement elem = getWebElement(SaveButtonElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SaveButton", "Click_SaveButton failed. Unable to locate object: " + SaveButtonElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SaveButton", "Click_SaveButton failed. Unable to locate object: " + SaveButtonElem.toString());

			Assert.fail("Unable to locate object: " + SaveButtonElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_SaveButton");

		TestModellerLogger.PassStep(m_Driver, "Click_SaveButton");
	}
}