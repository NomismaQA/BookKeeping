package Ashiv_Demo_Pages;

import pages.BasePage;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.GetScreenShot;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/2574888a-907d-482f-b4c3-c810e31bec71
@TestModellerModule(guid = "2574888a-907d-482f-b4c3-c810e31bec71")
public class BankRuleUNR_Runrl extends BasePage
{
	int i;
    int size;
    static String f;
	public BankRuleUNR_Runrl (WebDriver driver)
	{
		super(driver);
	}


	
	private By Menu_BankRulesElem = By.xpath("//A[@id='ctl00_cpHeaderRight_LinkButtonEx3']");

	private By Add_Bank_rule_btnElem = By.xpath("//*[@id='ctl00_cpHeaderRight_btnAdd']");

	private By Condition_FormulaElem = By.xpath("//label[normalize-space()= 'Condition:']/../div/select");

	private By Rule_DescElem = By.xpath("//INPUT[@name='ctl00$cPH$rptrParam$ctl00$txtParamValue']");

	private By Account_Select_codeElem = By.xpath("/html/body/form/div[3]/div[1]/div[2]/div/div/div/table/tbody/tr[2]/td[2]/span");

	private By Select_VateRate_TypeElem = By.xpath("//SELECT[@name='ctl00$cPH$rptrParam$ctl02$ddVatRateType']");

	private By Tran_Type_CodeElem = By.xpath("//SELECT[@name='ctl00$cPH$rptrParam$ctl03$ddType']");

	private By Save__Btn_ClickElem = By.xpath("//A[@id='ctl00_cphFooter_btnSave']");
	
	private By box0Elem = By.cssSelector("INPUT[aria-autocomplete='list']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AccountUI/CompanyFormulaList.aspx?FYCode=117001&CompanyCode=16678");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/CompanyFormulaList.aspx?FYCode=117001&CompanyCode=16678");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/CompanyFormulaList.aspx?FYCode=117001&CompanyCode=16678");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
//   public void AssertUrl()
//    {
//        String currentUrl = m_Driver.getCurrentUrl();
//        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/AccountUI/CompanyFormulaList.aspx?FYCode=117001&CompanyCode=16678";
//
//        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/AccountUI/CompanyFormulaList.aspx?FYCode=117001&CompanyCode=16678")) {
//            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
//        }
//    }

     
	/**
 	 * Click Menu_BankRules
	 * @throws InterruptedException 
     * @name Click Menu_BankRules
     */
	public void Click_Menu_BankRules() throws InterruptedException
	{
        
		WebElement elem = getWebElement(Menu_BankRulesElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Menu_BankRules", "Click_Menu_BankRules failed. Unable to locate object: " + Menu_BankRulesElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Menu_BankRules", "Click_Menu_BankRules failed. Unable to locate object: " + Menu_BankRulesElem.toString());

			Assert.fail("Unable to locate object: " + Menu_BankRulesElem.toString());
        }
		//jsExec.executeScript("arguments[0].scrollIntoView(true);",m_Driver.findElement(By.xpath("//A[@id='ctl00_cpHeaderRight_LinkButtonEx3']")));
		elem.click();
		  //jsExec.executeScript("arguments[0].click()",elem)));
		ExtentReportManager.passStep(m_Driver, "Click_Menu_BankRules");

		TestModellerLogger.PassStep(m_Driver, "Click_Menu_BankRules");
		
	}
 
	/**
 	 * Click Add_Bank_rule_btn
	 * @throws InterruptedException 
     * @name Click Add_Bank_rule_btn
     */
	public void Click_Add_Bank_rule_btn() throws InterruptedException
	{
	WebElement elem = getWebElement(Add_Bank_rule_btnElem);

		if (elem == null) {
 		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Add_Bank_rule_btn", "Click_Add_Bank_rule_btn failed. Unable to locate object: " + Add_Bank_rule_btnElem.toString());

   		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Add_Bank_rule_btn", "Click_Add_Bank_rule_btn failed. Unable to locate object: " + Add_Bank_rule_btnElem.toString());

		Assert.fail("Unable to locate object: " + Add_Bank_rule_btnElem.toString());
       }
		//m_Driver.navigate().refresh();
		System.out.println("hello");
Thread.sleep(2000);
 elem=m_Driver.findElement(By.xpath("//*[@id='ctl00_cpHeaderRight_btnAdd']"));
elem.click();
////elem.click();
		//m_Driver.findElement(By.xpath("//*[@id='ctl00_divMainContent']/header")).click();
		
		//jsExec.executeScript("arguments[0].click()", elem);
		
		ExtentReportManager.passStep(m_Driver, "Click_Add_Bank_rule_btn");

		TestModellerLogger.PassStep(m_Driver, "Click_Add_Bank_rule_btn");
	}
    
	/**
 	 * Select Condition_Formula
     * @name Select Condition_Formula
     */
    public void Select_Condition_Formula(String Condition_Formula)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Condition_FormulaElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Condition_Formula", "Select_Condition_Formula failed. Unable to locate object: " + Condition_FormulaElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Condition_Formula", "Select_Condition_Formula failed. Unable to locate object: " + Condition_FormulaElem.toString());

 			Assert.fail("Unable to locate object: " + Condition_FormulaElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Condition_Formula);
 		
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_Condition_Formula " + Condition_Formula);

 		TestModellerLogger.PassStep(m_Driver, "Select_Condition_Formula " + Condition_Formula);
 	}
 
	/**
 	 * Enter Rule_Desc
	 * @return 
	 * @throws InterruptedException 
     * @name Enter Rule_Desc
     */
public void Enter_Rule_Desc(String Rule_Desc)
 
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(Rule_DescElem);

		if (elem == null) 
		{
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Rule_Desc", "Enter_Rule_Desc failed. Unable to locate object: " + Rule_DescElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Rule_Desc", "Enter_Rule_Desc failed. Unable to locate object: " + Rule_DescElem.toString());

 			Assert.fail("Unable to locate object: " + Rule_DescElem.toString());
         }
	       f =Rule_Desc;
 		 		
	     elem.sendKeys(f);
 		 		
m_Driver.switchTo().defaultContent();
		
  		ExtentReportManager.passStep(m_Driver, "Enter_Rule_Desc " + Rule_Desc);

 		TestModellerLogger.PassStep(m_Driver, "Enter_Rule_Desc " + Rule_Desc);
		
 	}
public String desc()

{
	 System.out.println("desc :" +f);
	return f;
 
}
  
	/**
 	 * Click Account_Select_code
     * @name Click Account_Select_code
     */
   public void Click_Account_Select_code()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(Account_Select_codeElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Account_Select_code", "Click_Account_Select_code failed. Unable to locate object: " + Account_Select_codeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Account_Select_code", "Click_Account_Select_code failed. Unable to locate object: " + Account_Select_codeElem.toString());

			Assert.fail("Unable to locate object: " + Account_Select_codeElem.toString());
       }

		elem.click();
	       
		//m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_Account_Select_code");

		TestModellerLogger.PassStep(m_Driver, "Click_Account_Select_code");
	}
  	/**
	 	 * Enter box0
		 * @throws InterruptedException 
		 * @throws IOException 
	     * @name Enter box0
	     */
		public void Enter_box0(String box0) throws InterruptedException, IOException
	 	{
	 		
	 	/*	List<WebElement>lt=m_Driver.findElements(By.xpath("//*[@id='select2-ctl00_cPH_rptrParam_ctl01_ltAccount-results']/li/ul/li"));
	 		int sx=lt.size();

	 		System.out.println("" +sx);
	 		
	 		for(WebElement wt:lt)
	 		{
	 			

	 		System.out.println("" +wt.getText());
	 		}*/
 		
	 		String pt =box0;
	         System.out.print("box2"   +pt );
	            m_Driver.findElement(By.xpath("//*[contains(text(),'" +pt+ "')]")).click();
         GetScreenShot.captureAsImage(m_Driver, pt);
	         m_Driver.switchTo().defaultContent();
 		
	  		ExtentReportManager.passStep(m_Driver, "Enter_box0 " + box0);
	  		TestModellerLogger.PassStep(m_Driver, "Enter_box0 " + box0);
	 	
	 	}
	/**
 	 * Select Select_VateRate_Type
     */
     
    public void Select_Select_VateRate_Type(String Select_VateRate_Type)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Select_VateRate_TypeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Select_VateRate_Type", "Select_Select_VateRate_Type failed. Unable to locate object: " + Select_VateRate_TypeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Select_VateRate_Type", "Select_Select_VateRate_Type failed. Unable to locate object: " + Select_VateRate_TypeElem.toString());

 			Assert.fail("Unable to locate object: " + Select_VateRate_TypeElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Select_VateRate_Type);
 		
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_Select_VateRate_Type " + Select_VateRate_Type);

 		TestModellerLogger.PassStep(m_Driver, "Select_Select_VateRate_Type " + Select_VateRate_Type);
 	}
       
	/**
 	 * Select Tran_Type_Code
     * @name Select Tran_Type_Code
     */
   public void Select_Tran_Type_Code(String Tran_Type_Code)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Tran_Type_CodeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Tran_Type_Code", "Select_Tran_Type_Code failed. Unable to locate object: " + Tran_Type_CodeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Tran_Type_Code", "Select_Tran_Type_Code failed. Unable to locate object: " + Tran_Type_CodeElem.toString());

 			Assert.fail("Unable to locate object: " + Tran_Type_CodeElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Tran_Type_Code);
 		
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_Tran_Type_Code " + Tran_Type_Code);

 		TestModellerLogger.PassStep(m_Driver, "Select_Tran_Type_Code " + Tran_Type_Code);
 	}
 
	/**
 	 * Click Save _Btn_Click
	 * @throws InterruptedException 
     * @name Click Save _Btn_Click
     */
	public void Click_Save__Btn_Click() throws InterruptedException
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(Save__Btn_ClickElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Save__Btn_Click", "Click_Save__Btn_Click failed. Unable to locate object: " + Save__Btn_ClickElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Save__Btn_Click", "Click_Save__Btn_Click failed. Unable to locate object: " + Save__Btn_ClickElem.toString());

			Assert.fail("Unable to locate object: " + Save__Btn_ClickElem.toString());
        }

		elem.click();
        Thread.sleep(2000);
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_Save__Btn_Click");

		TestModellerLogger.PassStep(m_Driver, "Click_Save__Btn_Click");
		
	}
	}
