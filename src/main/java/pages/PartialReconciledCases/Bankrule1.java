package pages.PartialReconciledCases;

import pages.BasePage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/e188f4b2-e09f-45ac-b67c-4d60839a27ad
@TestModellerModule(guid = "e188f4b2-e09f-45ac-b67c-4d60839a27ad")
public class Bankrule1 extends BasePage
{
	public Bankrule1 (WebDriver driver)
	{
		super(driver);
	}

////*[@id="select2-ctl00_cPH_rptrParam_ctl01_ltAccount-container"]/span
	
	private By AddRuleElem = By.xpath("//A[@id='ctl00_cpHeaderRight_btnAdd']");

	private By FormulaElem = By.xpath("//SELECT[@id='ctl00_cPH_ddFormula']");

	private By PriorityElem = By.xpath("//INPUT[@id='ctl00_cPH_txtPriority']");

	private By _1_Elem = By.xpath("//DIV[contains(text(),'1')]");

	private By ActiveElem = By.xpath("//INPUT[@id='ctl00_cPH_chkIsActive']");

	private By DescriptionElem = By.xpath("//INPUT[@id='ctl00_cPH_rptrParam_ctl00_txtParamValue']");

	//private By AccountElem = By.xpath("//SPAN[@id='select2-ctl00_cPH_rptrParam_ctl01_ltAccount-container']");

	private By AccountElem = By.xpath("//*[@id=\"aspnetForm\"]/div[3]/div[1]/div[2]/div/div/table/tbody/tr[2]/td[2]/span/span[1]/span");
	private By AccountElembx=By.xpath("/html/body/span/span/span[1]/input");
	private By VatRateTypeElem = By.xpath("//SELECT[@id='ctl00_cPH_rptrParam_ctl02_ddVatRateType']");
	private By CodeElem = By.xpath("//SELECT[@id='ctl00_cPH_rptrParam_ctl03_ddType']");

	private By _Save_Elem = By.xpath("//A[@id='ctl00_cphFooter_btnSave']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/AccountUI/CompanyFormulaList.aspx?FYCode=52444&CompanyCode=13236");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AccountUI/CompanyFormulaList.aspx?FYCode=52444&CompanyCode=13236");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AccountUI/CompanyFormulaList.aspx?FYCode=52444&CompanyCode=13236");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AccountUI/CompanyFormulaList.aspx?FYCode=52444&CompanyCode=13236";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AccountUI/CompanyFormulaList.aspx?FYCode=52444&CompanyCode=13236")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click AddRule
     * @name Click AddRule
     */
	public void Click_AddRule()
	{
        
		WebElement elem = getWebElement(AddRuleElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_AddRule", "Click_AddRule failed. Unable to locate object: " + AddRuleElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_AddRule", "Click_AddRule failed. Unable to locate object: " + AddRuleElem.toString());

			Assert.fail("Unable to locate object: " + AddRuleElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_AddRule");

		TestModellerLogger.PassStep(m_Driver, "Click_AddRule");
	}

    
	/**
 	 * Select Formula
     * @name Select Formula
     */
    public void Select_Formula(String Formula)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(FormulaElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Formula", "Select_Formula failed. Unable to locate object: " + FormulaElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Formula", "Select_Formula failed. Unable to locate object: " + FormulaElem.toString());

 			Assert.fail("Unable to locate object: " + FormulaElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Formula);
 		
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_Formula " + Formula);

 		TestModellerLogger.PassStep(m_Driver, "Select_Formula " + Formula);
 	}

      
	/**
 	 * Enter Priority
     * @name Enter Priority
     */
 	public void Enter_Priority(String Priority)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(PriorityElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Priority", "Enter_Priority failed. Unable to locate object: " + PriorityElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Priority", "Enter_Priority failed. Unable to locate object: " + PriorityElem.toString());

 			Assert.fail("Unable to locate object: " + PriorityElem.toString());
         }

 		elem.sendKeys(Priority);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Priority " + Priority);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Priority " + Priority);
 	}

     
	/**
 	 * Click  1 
     * @name Click  1 
     */
	public void Click__1_()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(_1_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__1_", "Click__1_ failed. Unable to locate object: " + _1_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__1_", "Click__1_ failed. Unable to locate object: " + _1_Elem.toString());

			Assert.fail("Unable to locate object: " + _1_Elem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click__1_");

		TestModellerLogger.PassStep(m_Driver, "Click__1_");
	}

     
	/**
 	 * Click Active
     * @name Click Active
     */
	public void Click_Active()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(ActiveElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Active", "Click_Active failed. Unable to locate object: " + ActiveElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Active", "Click_Active failed. Unable to locate object: " + ActiveElem.toString());

			Assert.fail("Unable to locate object: " + ActiveElem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_Active");

		TestModellerLogger.PassStep(m_Driver, "Click_Active");
	}

      
	/**
 	 * Enter Description
	 * @throws InterruptedException 
     * @name Enter Description
     */
 	public void Enter_Description(String Description) throws InterruptedException
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(DescriptionElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Description", "Enter_Description failed. Unable to locate object: " + DescriptionElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Description", "Enter_Description failed. Unable to locate object: " + DescriptionElem.toString());

 			Assert.fail("Unable to locate object: " + DescriptionElem.toString());
         }

 		elem.sendKeys(Description);
 		
 		
		m_Driver.switchTo().defaultContent();
		elem.sendKeys(Keys.TAB);
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Description " + Description);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Description " + Description);
 	}

     
	/**
 	 * Click Account
	 * @throws InterruptedException 
     * @name Click Account
     */
	public void Click_Account() throws InterruptedException
	{
		
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div/div/div/div[2]/iframe")));
	//m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/span/span/span[1]/input")));
		WebElement elem = getWebElement(AccountElem);
   

	 {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Account", "Click_Account failed. Unable to locate object: " + AccountElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Account", "Click_Account failed. Unable to locate object: " + AccountElem.toString());

			Assert.fail("Unable to locate object: " + AccountElem.toString());
        }

//		elem.click();
//		elem.sendKeys();
//		Actions act = new Actions(m_Driver);
//	  	act.sendKeys(Keys.ARROW_DOWN).perform();
//	  	act.sendKeys(Keys.ARROW_DOWN).perform();
//	  	act.sendKeys(Keys.ENTER).perform();
	 jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("#select2-ctl00_cPH_rptrParam_ctl01_ltAccount-container > span")));
		
          	
		//elem.sendKeys("select2-ctl00_cPH_rptrParam_ctl01_ltAccount-container");
//		ExtentReportManager.passStep(m_Driver, "Click_Account");
//
//		TestModellerLogger.PassStep(m_Driver, "Click_Account");
	}

    
	/**
 	 * Select VatRateType
     * @name Select VatRateType
     */
    public void Select_VatRateType(String VatRateType)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(VatRateTypeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_VatRateType", "Select_VatRateType failed. Unable to locate object: " + VatRateTypeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_VatRateType", "Select_VatRateType failed. Unable to locate object: " + VatRateTypeElem.toString());

 			Assert.fail("Unable to locate object: " + VatRateTypeElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(VatRateType);
 		
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_VatRateType " + VatRateType);

 		TestModellerLogger.PassStep(m_Driver, "Select_VatRateType " + VatRateType);
 	}

    
	/**
 	 * Select Code
     * @name Select Code
     */
    public void Select_Code(String Code)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(CodeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Code", "Select_Code failed. Unable to locate object: " + CodeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Code", "Select_Code failed. Unable to locate object: " + CodeElem.toString());

 			Assert.fail("Unable to locate object: " + CodeElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Code);
 		
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_Code " + Code);

 		TestModellerLogger.PassStep(m_Driver, "Select_Code " + Code);
 	}

     
	/**
 	 * Click  Save 
     * @name Click  Save 
     */
	public void Click__Save_()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(_Save_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Save_", "Click__Save_ failed. Unable to locate object: " + _Save_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Save_", "Click__Save_ failed. Unable to locate object: " + _Save_Elem.toString());

			Assert.fail("Unable to locate object: " + _Save_Elem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click__Save_");

		TestModellerLogger.PassStep(m_Driver, "Click__Save_");
	}
}