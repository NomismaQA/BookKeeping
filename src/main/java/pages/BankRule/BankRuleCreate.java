package pages.BankRule;

import pages.BasePage;

import java.io.IOException;
import java.util.List;

import org.apache.xmlbeans.impl.xb.xsdschema.AllDocument;
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
public class BankRuleCreate extends BasePage
{
	int i;
    int size;
	public BankRuleCreate (WebDriver driver)
	{
		super(driver);
	}

	
	private By Menu_BankRulesElem = By.xpath("//A[@id='ctl00_cpHeaderRight_LinkButtonEx3']");

	//private By Add_Bank_rule_btnElem = By.xpath("//A[@id='ctl00_cpHeaderRight_btnAdd']");
	private By Add_Bank_rule_btnElem = By.xpath("//*[@id='ctl00_cpHeaderRight_btnAdd\']");

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
	 * @throws InterruptedException 
     * @name Click Add_Bank_rule_btn
     */
	public void Click_Add_Bank_rule_btn() throws InterruptedException
	{

            
//            m_Driver.findElement(By.xpath("//A[@id='ctl00_cpHeaderRight_btnAdd']")).click();    
//            
//            m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div/div/div/div[2]/iframe")));
//            
//            System.out.println("switched");
//            
//            Thread.sleep(1000);
//            
//            m_Driver.findElement(By.xpath("/html/body/form/div[3]/div[1]/div[2]/div/div/div/table/tbody/tr[2]/td[2]/span")).click();
//            
//        List<WebElement> data1=m_Driver.findElements(By.xpath("//*[@id='select2-ctl00_cPH_rptrParam_ctl01_ltAccount-results']/li/ul/li"));
//      System.out.println(data1.get(0).getText());
//                		size=data1.size();
//        
//        System.out.println("size is="+size);
//        String[] a=new String [size];
//        
//        for(i=0;i<size;i++)
//        {
////            System.out.println("i=="+i);
//        a[i]=data1.get(i).getText();
//        System.out.println("date is="+a[i]);
//        }
//        
//        WebElement save=m_Driver.findElement(By.xpath("//A[@id='ctl00_cphFooter_btnSave']")); 
////         jsExec.executeScript("arguments[0].click();", save);
////         Thread.sleep(1000);
////         save.click();
////         
//        m_Driver.switchTo().defaultContent();
//           for(i=size;i>=1;i--)
//                        {
//                            
//                            m_Driver.findElement(By.xpath("/html/body/form/div[3]/div[1]/div[2]/div/div/div/table/tbody/tr[2]/td[2]/span")).click();
//                            System.out.println("value of i="+i);
//                        
//                            //Description
//                            m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrParam_ctl00_txtParamValue']")).sendKeys("Rule"+a[i-1]);
//
// 
//
//                            
//                        //Account selection    
//                            WebElement PeriodEnd=m_Driver.findElement(By.xpath("/html/body/form/div[3]/div[1]/div[2]/div/div/div/table/tbody/tr[2]/td[2]/span")); 
//                      
//                           Select date=new Select(PeriodEnd); 
//                           Thread.sleep(1000);
//                  
//                            date.selectByVisibleText(a[i-1]);
//                            
//                           //Vat Rate Type Selection
//                           WebElement elem1=m_Driver.findElement(By.xpath("//SELECT[@name='ctl00$cPH$rptrParam$ctl02$ddVatRateType']")); 
//                          Select dropdown = new Select(elem1);
//
// 
//
//                         dropdown.selectByVisibleText("Standard Rate");
//                         
//                         //Transaction Type Code
//                         
//                         WebElement elem2=m_Driver.findElement(By.xpath("//SELECT[@name='ctl00$cPH$rptrParam$ctl03$ddType']")); 
//                          Select dropdown2 = new Select(elem2);
//
// 
//
//                         dropdown.selectByVisibleText("Both");
//                         
//                         //Click Save
//                         
//                     //    WebElement save=m_Driver.findElement(By.xpath("//A[@id='ctl00_cphFooter_btnSave']")); 
//                         jsExec.executeScript("arguments[0].click();", save);
//                         Thread.sleep(1000);
//                         save.click();
//                         
//                        m_Driver.switchTo().defaultContent();

      
            
            m_Driver.findElement(By.xpath("//A[@id='ctl00_cpHeaderRight_btnAdd']")).click();    
            
            m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div/div/div/div[2]/iframe")));
            
            System.out.println("switched");
            
            Thread.sleep(1000);
            
            m_Driver.findElement(By.xpath("//*[@id='select2-ctl00_cPH_rptrParam_ctl01_ltAccount-container']")).click();
            
        List<WebElement> data1=m_Driver.findElements(By.xpath("//*[@id='select2-ctl00_cPH_rptrParam_ctl01_ltAccount-results']/li/ul/li"));
        size=data1.size();
        System.out.println("total in dropdown" +size);
        System.out.println(data1.get(0).getText());
               
        String[] a=new String [size];
        
        for(i=0;i<size;i++)
        {
        a[i]=data1.get(i).getText();
        System.out.println(""+a[i]);
        }
        
        WebElement save=m_Driver.findElement(By.xpath("//A[@id='ctl00_cphFooter_btnSave']")); 
        
        m_Driver.switchTo().defaultContent();
                    for(i=size;i>=1;i--)
                        {
                            /* to add description*/
                            m_Driver.findElement(By.xpath("//*[@id='select2-ctl00_cPH_rptrParam_ctl01_ltAccount-container']")).click();
                            System.out.println("value of i="+i);
                        
                            //Description
                            m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrParam_ctl00_txtParamValue']")).sendKeys("Ruly"+a[i-1]);
 
                        //Account selection    
                          // WebElement PeriodEnd=m_Driver.findElement(By.xpath("/html/body/form/div[3]/div[1]/div[2]/div/div/div/table/tbody/tr[2]/td[2]/span")); 
                         //  WebDriverWait wait = new WebDriverWait(m_Driver,10);
                         // wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//li[normalize-space(.) = '1070 - cust']"))).click();
                            m_Driver.findElement(By.xpath("//*[@id='select2-ctl00_cPH_rptrParam_ctl01_ltAccount-container']")).click();
                            m_Driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(data1.get(i).getText());
                            m_Driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
//                                                      
                           //Vat Rate Type Selection
                           WebElement elem1=m_Driver.findElement(By.xpath("//SELECT[@name='ctl00$cPH$rptrParam$ctl02$ddVatRateType']")); 
                          Select dropdown = new Select(elem1);
                         dropdown.selectByVisibleText("Standard Rate");
                         
                         //Transaction Type Code
                         
                         WebElement elem2=m_Driver.findElement(By.xpath("//SELECT[@name='ctl00$cPH$rptrParam$ctl03$ddType']")); 
                          Select dropdown2 = new Select(elem2);
                         dropdown2.selectByVisibleText("Both");
                         
                         //Click Save
                         
                     //    WebElement save=m_Driver.findElement(By.xpath("//A[@id='ctl00_cphFooter_btnSave']")); 
                         jsExec.executeScript("arguments[0].click();", save);
                         Thread.sleep(1000);
                         save.click();
                         
                        m_Driver.switchTo().defaultContent();
                            
                            
                        }
                        
                        
                        
        }
        
        
     
        
    }







		
		
                           
                      
                     
                        
                        
                        
        
        
        
    
        







   
		
	

    
	/**
 	 * Select Condition_Formula
     * @name Select Condition_Formula
     */
   /* public void Select_Condition_Formula(String Condition_Formula)
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
// /*	public void Enter_Rule_Desc(String Rule_Desc)
// 	{
// 	    
//		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div/div/div/div[2]/iframe")));
//
// 		WebElement elem = getWebElement(Rule_DescElem);
//
// 		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Rule_Desc", "Enter_Rule_Desc failed. Unable to locate object: " + Rule_DescElem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Rule_Desc", "Enter_Rule_Desc failed. Unable to locate object: " + Rule_DescElem.toString());
//
// 			Assert.fail("Unable to locate object: " + Rule_DescElem.toString());
//         }
//
// 		elem.sendKeys(Rule_Desc);
// 		 		
//		m_Driver.switchTo().defaultContent();
//		
//  		ExtentReportManager.passStep(m_Driver, "Enter_Rule_Desc " + Rule_Desc);
//
//  		TestModellerLogger.PassStep(m_Driver, "Enter_Rule_Desc " + Rule_Desc);
// 	}*/
     
	/**
 	 * Click Account_Select_code
     * @name Click Account_Select_code
     */
 	

//  public void Click_Account_Select_code()
//	{
//        
//		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div/div/div/div[2]/iframe")));
//
//		WebElement elem = getWebElement(Account_Select_codeElem);
//
//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Account_Select_code", "Click_Account_Select_code failed. Unable to locate object: " + Account_Select_codeElem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Account_Select_code", "Click_Account_Select_code failed. Unable to locate object: " + Account_Select_codeElem.toString());
//
//			Assert.fail("Unable to locate object: " + Account_Select_codeElem.toString());
//        }
//
//		elem.click();
//	       
//		//m_Driver.switchTo().defaultContent();
//  	
//
//		ExtentReportManager.passStep(m_Driver, "Click_Account_Select_code");
//
//		TestModellerLogger.PassStep(m_Driver, "Click_Account_Select_code");
//	}
	
  
		/**
	 	 * Enter box0
		 * @throws InterruptedException 
		 * @throws IOException 
	     * @name Enter box0
	     */
	 /*	public void Enter_box0(String box0) throws InterruptedException, IOException
	 	{
	 		
	 		List<WebElement>lt=m_Driver.findElements(By.xpath("//*[@id='select2-ctl00_cPH_rptrParam_ctl01_ltAccount-results']/li/ul/li"));
	 		int sx=lt.size();

	 		System.out.println("" +sx);
	 		
	 		for(WebElement wt:lt)
	 		{
	 			

	 		System.out.println("" +wt.getText());
	 		}*/
 		
//	 		String pt =box0;
//	         System.out.print("box2"   +pt );
//	            m_Driver.findElement(By.xpath("//*[contains(text(),'" +pt+ "')]")).click();
//	         GetScreenShot.captureAsImage(m_Driver, pt);
//	         m_Driver.switchTo().defaultContent();
// 		
//	  		ExtentReportManager.passStep(m_Driver, "Enter_box0 " + box0);
//	  		TestModellerLogger.PassStep(m_Driver, "Enter_box0 " + box0);
	 	
	
	/**
 	 * Select Select_VateRate_Type
     * @name Select Select_VateRate_Type
     */
  /*  public void Select_Select_VateRate_Type(String Select_VateRate_Type)
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
 	}*/

    
	/**
 	 * Select Tran_Type_Code
     * @name Select Tran_Type_Code
     */
  /*  public void Select_Tran_Type_Code(String Tran_Type_Code)
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
 	}*/

     
	/**
 	 * Click Save _Btn_Click
     * @name Click Save _Btn_Click
     */
	/*public void Click_Save__Btn_Click()
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
	}*/
