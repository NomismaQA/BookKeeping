package BankRule;

import pages.BasePage;

import java.io.IOException;
import java.util.Random;

import org.apache.commons.math3.util.RandomPivotingStrategy;
import org.assertj.core.internal.bytebuddy.utility.RandomString;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.sun.xml.bind.v2.schemagen.xmlschema.List;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import net.moznion.random.string.RandomStringGenerator;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.GetScreenShot;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/2574888a-907d-482f-b4c3-c810e31bec71
@TestModellerModule(guid = "2574888a-907d-482f-b4c3-c810e31bec71")
public class BankRuleCreate extends BasePage
{
	public BankRuleCreate (WebDriver driver)
	{
		super(driver);
	}

	
	private By Menu_BankRulesElem = By.xpath("//A[@id='ctl00_cpHeaderRight_LinkButtonEx3']");

	private By Add_Bank_rule_btnElem = By.xpath("//A[@id='ctl00_cpHeaderRight_btnAdd']");

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
     * @name Click Menu_BankRules
     */
	public void Click_Menu_BankRules()
	{
        
		WebElement elem = getWebElement(Menu_BankRulesElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Menu_BankRules", "Click_Menu_BankRules failed. Unable to locate object: " + Menu_BankRulesElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Menu_BankRules", "Click_Menu_BankRules failed. Unable to locate object: " + Menu_BankRulesElem.toString());

			Assert.fail("Unable to locate object: " + Menu_BankRulesElem.toString());
        }

		elem.click();
          	
		ExtentReportManager.passStep(m_Driver, "Click_Menu_BankRules");

		TestModellerLogger.PassStep(m_Driver, "Click_Menu_BankRules");
	}

     
	/**
 	 * Click Add_Bank_rule_btn
     * @name Click Add_Bank_rule_btn
     */
	public void Click_Add_Bank_rule_btn()
	{
        
		WebElement elem = getWebElement(Add_Bank_rule_btnElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Add_Bank_rule_btn", "Click_Add_Bank_rule_btn failed. Unable to locate object: " + Add_Bank_rule_btnElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Add_Bank_rule_btn", "Click_Add_Bank_rule_btn failed. Unable to locate object: " + Add_Bank_rule_btnElem.toString());

			Assert.fail("Unable to locate object: " + Add_Bank_rule_btnElem.toString());
        }

		elem.click();
          	

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
     * @name Enter Rule_Desc
     */
    
 	public void Enter_Rule_Desc(String Rule_Desc)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Rule_DescElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Rule_Desc", "Enter_Rule_Desc failed. Unable to locate object: " + Rule_DescElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Rule_Desc", "Enter_Rule_Desc failed. Unable to locate object: " + Rule_DescElem.toString());

 			Assert.fail("Unable to locate object: " + Rule_DescElem.toString());
         }
 		
 		elem.sendKeys(Rule_Desc);
 		 		
		m_Driver.switchTo().defaultContent();
		
  		ExtentReportManager.passStep(m_Driver, "Enter_Rule_Desc " + Rule_Desc);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Rule_Desc " + Rule_Desc);
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
	 	public void Enter_box0() throws InterruptedException, IOException
	 	{
 		
//	 		String pt =box0;
//	         System.out.print("box2"   +pt );
//	            m_Driver.findElement(By.xpath("//*[contains(text(),'" +pt+ "')]")).click();
	 		//for(int i=0; i<=)
	 			java.util.List<WebElement> elem12=m_Driver.findElements(By.xpath("//*[@id='select2-ctl00_cPH_rptrParam_ctl01_ltAccount-results']/li[1]/ul//following::li[@class='select2-results__option']"));
	 			int size = elem12.size();
	 			System.out.println("size"+size);
	 			WebElement elem13 = getWebElement(Account_Select_codeElem);
	 			WebElement desc = getWebElement(Rule_DescElem);
			for(int i=0; i<=size-1;i++)
			{
				System.out.println("hi in for loop");
				//String ss= RandomRandomStringUtils.randomAlpbabetic(8);
				m_Driver.findElement(By.xpath("//*[@id='ctl00_cpHeaderRight_btnAdd']")).click();
				Thread.sleep(1000);
					String strn="Desc"+i;
					desc.sendKeys(strn);
	 				String str = elem12.get(i).getText();
	 				System.out.println("strn  "+strn);
	 				System.out.println("str  "+str);
	 				//m_Driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(strn);
	 				m_Driver.findElement(By.xpath("contains(text(),'"+str+"')"));
	 				m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrParam_ctl02_ddVatRateType']")).sendKeys("Standard Rate");
	 				m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrParam_ctl03_ddType']")).sendKeys("Both");
	 				m_Driver.findElement(By.xpath("//*[@id='ctl00_cphFooter_btnSave']")).click();
	 				elem13.click();
	 			}
	        //String pt ="name"+index;
//	 		GetScreenShot.captureAsImage(m_Driver, pt);
	         m_Driver.switchTo().defaultContent();
 		
//	  		ExtentReportManager.passStep(m_Driver, "Enter_box0 " + box0);
//	  		TestModellerLogger.PassStep(m_Driver, "Enter_box0 " + box0);
	 	}
	
	/**
 	 * Select Select_VateRate_Type
     * @name Select Select_VateRate_Type
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
     * @name Click Save _Btn_Click
     */
	public void Click_Save__Btn_Click()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(Save__Btn_ClickElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Save__Btn_Click", "Click_Save__Btn_Click failed. Unable to locate object: " + Save__Btn_ClickElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Save__Btn_Click", "Click_Save__Btn_Click failed. Unable to locate object: " + Save__Btn_ClickElem.toString());

			Assert.fail("Unable to locate object: " + Save__Btn_ClickElem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_Save__Btn_Click");

		TestModellerLogger.PassStep(m_Driver, "Click_Save__Btn_Click");
	}
}