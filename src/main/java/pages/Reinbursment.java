package pages;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/2a32ff81-8845-42b8-b1d3-74314fe29f94
@TestModellerModule(guid = "2a32ff81-8845-42b8-b1d3-74314fe29f94")
public class Reinbursment extends BasePage
{
	
	
	public static String vatrate;
	public static String save;
	
	public Reinbursment (WebDriver driver)
	{
		super(driver);
	}


	
	//private By ExpenseReimbursElem = By.xpath("//A[contains(text(),'Expense Reimbursement')]");
	//private By ExpenseReimbursElem = By.xpath("//a[contains(text(), 'Expense Reimbursement')]");
	private By ExpenseReimbursElem = By.xpath("//*[@id='ctl00_divMainContent']/header/div/div[3]/div/div/ul/li[3]/a");

	private By plussgin_clickedElem = By.xpath("//A[@id='ctl00_cPH_btnAdd']");
	
	private By Employee_SelectElem = By.xpath("//*[@id='ctl00_cPH_ddlPerson']");

	private By Date_toselectElem = By.xpath("//label[contains(.,'Date*')]/../../div[2]/input");

	//private By add_DescriptionElem = By.xpath("//label[contains(.,'Description*')]/../../div[2]/input");
	private By add_DescriptionElem = By.xpath("//*[@id='ctl00_cPH_txtDescription']");

	private By Select_VATtypeRatesElem = By.xpath("//label[contains(.,'VAT Rate Type*')]/../../div[2]/select");

	//private By Select_ExpenseHeadElem = By.xpath("//label[contains(.,'Expense Head*')]/../../div[2]/select");
	private By Select_ExpenseHeadElem = By.xpath("//*[@id='ctl00_cPH_ddExpenseHead']");
	private By Enter_AmtsElem = By.xpath("//*[@id='ctl00_cPH_txtAmount']");

	private By Clicked_SaveElem = By.xpath("//A[@id='ctl00_cphFooter_btnSave']");

	private By Cancel_ClickedElem = By.xpath("//A[@id='ctl00_cphFooter_btnCancelModal']");

	private By addmulexp_clickedElem = By.xpath("//A[contains(text(),'Add Multiple Expenses')]");


	
	public void GoToUrl()
	{
		m_Driver.get("https://nomisma.cloud.testinsights.io/app/#!/test-modeller/100610");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://nomisma.cloud.testinsights.io/app/#!/test-modeller/100610");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://nomisma.cloud.testinsights.io/app/#!/test-modeller/100610");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "https://nomisma.cloud.testinsights.io/app/#!/test-modeller/100610";

        if (!currentUrl.equals("https://nomisma.cloud.testinsights.io/app/#!/test-modeller/100610")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

  
     
	/**
 	 * Click ExpenseReimburs
     * @name Click ExpenseReimburs
     */
	public void Click_ExpenseReimburs()
	{
        
		WebElement elem = getWebElement(ExpenseReimbursElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ExpenseReimburs", "Click_ExpenseReimburs failed. Unable to locate object: " + ExpenseReimbursElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ExpenseReimburs", "Click_ExpenseReimburs failed. Unable to locate object: " + ExpenseReimbursElem.toString());

			Assert.fail("Unable to locate object: " + ExpenseReimbursElem.toString());
        }

		//elem.click();
          jsExec.executeScript("arguments[0].click();", elem);	

		ExtentReportManager.passStep(m_Driver, "Click_ExpenseReimburs");

		TestModellerLogger.PassStep(m_Driver, "Click_ExpenseReimburs");
	}

     
	/**
 	 * Click plussgin_clicked
     * @name Click plussgin_clicked
     */
	public void Click_plussgin_clicked()
	{
        
		WebElement elem = getWebElement(plussgin_clickedElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_plussgin_clicked", "Click_plussgin_clicked failed. Unable to locate object: " + plussgin_clickedElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_plussgin_clicked", "Click_plussgin_clicked failed. Unable to locate object: " + plussgin_clickedElem.toString());

			Assert.fail("Unable to locate object: " + plussgin_clickedElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_plussgin_clicked");

		TestModellerLogger.PassStep(m_Driver, "Click_plussgin_clicked");
	}

    
	/**
 	 * Select Employee_Select
     * @name Select Employee_Select
     */
    public void Select_Employee_Select(String Employee_Select)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div[1]/div/div[1]/div[2]/div/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Employee_SelectElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Employee_Select", "Select_Employee_Select failed. Unable to locate object: " + Employee_SelectElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Employee_Select", "Select_Employee_Select failed. Unable to locate object: " + Employee_SelectElem.toString());

 			Assert.fail("Unable to locate object: " + Employee_SelectElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Employee_Select);
 		
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_Employee_Select " + Employee_Select);

 		TestModellerLogger.PassStep(m_Driver, "Select_Employee_Select " + Employee_Select);
 	}

      
	/**
 	 * Enter Date_toselect
     * @name Enter Date_toselect
     */
 	public void Enter_Date_toselect(String Date_toselect)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div[1]/div/div[1]/div[2]/div/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Date_toselectElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Date_toselect", "Enter_Date_toselect failed. Unable to locate object: " + Date_toselectElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Date_toselect", "Enter_Date_toselect failed. Unable to locate object: " + Date_toselectElem.toString());

 			Assert.fail("Unable to locate object: " + Date_toselectElem.toString());
         }

 		elem.sendKeys(Date_toselect);
 		
 		elem.sendKeys(Keys.TAB);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Date_toselect " + Date_toselect);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Date_toselect " + Date_toselect);
 	}

      
	/**
 	 * Enter add_Description
	 * @throws InterruptedException 
     * @name Enter add_Description
     */
 	public void Enter_add_Description(String add_Description) throws InterruptedException
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div[1]/div/div[1]/div[2]/div/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(add_DescriptionElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_add_Description", "Enter_add_Description failed. Unable to locate object: " + add_DescriptionElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_add_Description", "Enter_add_Description failed. Unable to locate object: " + add_DescriptionElem.toString());

 			Assert.fail("Unable to locate object: " + add_DescriptionElem.toString());
         }
 		
 		elem.sendKeys("Standard");
 		elem.sendKeys(Keys.TAB);
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_add_Description " + add_Description);

  		TestModellerLogger.PassStep(m_Driver, "Enter_add_Description " + add_Description);
 	}

    
	/**
 	 * Select Select_VATtypeRates
	 * @throws InterruptedException 
     * @name Select Select_VATtypeRates
     */
    public void Select_Select_VATtypeRates(String Select_VATtypeRates) throws InterruptedException
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div[1]/div/div[1]/div[2]/div/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Select_VATtypeRatesElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Select_VATtypeRates", "Select_Select_VATtypeRates failed. Unable to locate object: " + Select_VATtypeRatesElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Select_VATtypeRates", "Select_Select_VATtypeRates failed. Unable to locate object: " + Select_VATtypeRatesElem.toString());

 			Assert.fail("Unable to locate object: " + Select_VATtypeRatesElem.toString());
         }
 			vatrate=Select_VATtypeRates;
 					
 		Select dropdown = new Select(elem);
 		Thread.sleep(1000);
 		dropdown.selectByVisibleText(Select_VATtypeRates);
 		
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_Select_VATtypeRates " + Select_VATtypeRates);

 		TestModellerLogger.PassStep(m_Driver, "Select_Select_VATtypeRates " + Select_VATtypeRates);
 	}

    
	/**
 	 * Select Select_ExpenseHead
	 * @throws InterruptedException 
     * @name Select Select_ExpenseHead
     */
    public void Select_Select_ExpenseHead(String Select_ExpenseHead) throws InterruptedException
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div[1]/div/div[1]/div[2]/div/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Select_ExpenseHeadElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Select_ExpenseHead", "Select_Select_ExpenseHead failed. Unable to locate object: " + Select_ExpenseHeadElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Select_ExpenseHead", "Select_Select_ExpenseHead failed. Unable to locate object: " + Select_ExpenseHeadElem.toString());

 			Assert.fail("Unable to locate object: " + Select_ExpenseHeadElem.toString());
         }
elem.click();
 		String st=Select_ExpenseHead;
 		//m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_ddExpenseHead']")).click();
 		//elem.sendKeys(Keys.ENTER);
 		//jsExec.executeScript("arguments[0].click();", "//*[contains[text(), '"+st+"']");
 	//	jsExec.executeScript("arguments.click();", null)
 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Select_ExpenseHead);
 		//Thread.sleep(1000);
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_Select_ExpenseHead " + Select_ExpenseHead);

 		TestModellerLogger.PassStep(m_Driver, "Select_Select_ExpenseHead " + Select_ExpenseHead);
 	}

      
	/**
 	 * Enter Enter_Amts
     * @name Enter Enter_Amts
     */
 	public void Enter_Enter_Amts(String Enter_Amts)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div[1]/div/div[1]/div[2]/div/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Enter_AmtsElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_Amts", "Enter_Enter_Amts failed. Unable to locate object: " + Enter_AmtsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_Amts", "Enter_Enter_Amts failed. Unable to locate object: " + Enter_AmtsElem.toString());

 			Assert.fail("Unable to locate object: " + Enter_AmtsElem.toString());
         }
elem.click();
 		elem.sendKeys(Enter_Amts);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_Amts " + Enter_Amts);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_Amts " + Enter_Amts);
 	}

     
	/**
 	 * Click Clicked_Save
     * @name Click Clicked_Save
     */
	public void Click_Clicked_Save()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div[1]/div/div[1]/div[2]/div/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(Clicked_SaveElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Clicked_Save", "Click_Clicked_Save failed. Unable to locate object: " + Clicked_SaveElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Clicked_Save", "Click_Clicked_Save failed. Unable to locate object: " + Clicked_SaveElem.toString());

			Assert.fail("Unable to locate object: " + Clicked_SaveElem.toString());
        }
		jsExec.executeScript("arguments[0].click();", elem);
		//elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_Clicked_Save");

		TestModellerLogger.PassStep(m_Driver, "Click_Clicked_Save");
	}

     
	/**
 	 * Click Cancel_Clicked
     * @name Click Cancel_Clicked
     */
	public void Click_Cancel_Clicked()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div[1]/div/div[1]/div[2]/div/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(Cancel_ClickedElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Cancel_Clicked", "Click_Cancel_Clicked failed. Unable to locate object: " + Cancel_ClickedElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Cancel_Clicked", "Click_Cancel_Clicked failed. Unable to locate object: " + Cancel_ClickedElem.toString());

			Assert.fail("Unable to locate object: " + Cancel_ClickedElem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_Cancel_Clicked");

		TestModellerLogger.PassStep(m_Driver, "Click_Cancel_Clicked");
	}

     
	/**
 	 * Click addmulexp_clicked
     * @name Click addmulexp_clicked
     */
	public void Click_addmulexp_clicked()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div[1]/div/div[1]/div[2]/div/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(addmulexp_clickedElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_addmulexp_clicked", "Click_addmulexp_clicked failed. Unable to locate object: " + addmulexp_clickedElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_addmulexp_clicked", "Click_addmulexp_clicked failed. Unable to locate object: " + addmulexp_clickedElem.toString());

			Assert.fail("Unable to locate object: " + addmulexp_clickedElem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_addmulexp_clicked");

		TestModellerLogger.PassStep(m_Driver, "Click_addmulexp_clicked");
	}
	public String vatrate1()
	{
		return vatrate;
	}
	
}