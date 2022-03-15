package pages.banking.ashiv;

import pages.BasePage;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/2574888a-907d-482f-b4c3-c810e31bec71
@TestModellerModule(guid = "2574888a-907d-482f-b4c3-c810e31bec71")
public class BankRuleCr_ZroRate_Both extends BasePage
{
    HashMap<String, String>hm=new HashMap<String,String>();
   	public static String out_ZR_Both="";
   	public static String out2_ZR_Both="";
	List<WebElement> data1;
	int i,size;
	public BankRuleCr_ZroRate_Both (WebDriver driver)
	{
		super(driver);
	}
	private By Menu_BankRulesElem = By.xpath("//A[@id='ctl00_cpHeaderRight_LinkButtonEx3']");

	private By Add_Bank_rule_btnElem = By.xpath("//A[@id='ctl00_cpHeaderRight_btnAdd']");

	private By Condition_FormulaElem = By.xpath("//label[normalize-space()= 'Condition:']/../div/select");

	private By Rule_DescElem = By.xpath("//INPUT[@name='ctl00$cPH$rptrParam$ctl00$txtParamValue']");

	private By Account_Select_codeElem = By.xpath("//SPAN[@id='select2-ctl00_cPH_rptrParam_ctl01_ltAccount-container']");

	private By Select_VateRate_TypeElem = By.xpath("//SELECT[@name='ctl00$cPH$rptrParam$ctl02$ddVatRateType']");

	private By Tran_Type_CodeElem = By.xpath("//SELECT[@name='ctl00$cPH$rptrParam$ctl03$ddType']");

	private By Save__Btn_ClickElem = By.xpath("//A[@id='ctl00_cphFooter_btnSave']");


	
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
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/AccountUI/CompanyFormulaList.aspx?FYCode=117001&CompanyCode=16678";

        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/AccountUI/CompanyFormulaList.aspx?FYCode=117001&CompanyCode=16678")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
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
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_Account_Select_code");

		TestModellerLogger.PassStep(m_Driver, "Click_Account_Select_code");
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
	/**
     * Save rule data
     */
    public void enterFrsmedata() throws InterruptedException
    {
        
           WebElement elem5= m_Driver.findElement(By.xpath("//A[@id='ctl00_cpHeaderRight_btnAdd']"));
           jsExec.executeScript("arguments[0].click();", elem5);
        
            m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div/div/div/div[2]/iframe")));
            
            System.out.println("switched");
            
            Thread.sleep(1000);
            m_Driver.findElement(By.xpath("//*[@id='select2-ctl00_cPH_rptrParam_ctl01_ltAccount-container']")).click();
            
           // WebElement elem6= m_Driver.findElement(By.xpath("//*[@id='select2-ctl00_cPH_rptrParam_ctl01_ltAccount-container']"));
           // jsExec.executeScript("arguments[0].click();",elem6);
            
            data1=m_Driver.findElements(By.xpath("//*[@id='select2-ctl00_cPH_rptrParam_ctl01_ltAccount-results']/li/ul/li"));

            size=data1.size();
            System.out.println("list size:" +size);
            //System.out.println(size+"list size");
        
            for(i=0;i<size;i++)
        {
 
            	System.out.println(data1.get(i).getText());

        }
        
         System.out.println("Hello1");
 
         m_Driver.findElement(By.xpath("//*[contains(text(),'VATRateType')]")).click();
        
         m_Driver.switchTo().defaultContent();
               for(i=0;i<size;i++)
                        {
                            
                            if(i!=0)
                            {
                        
                                jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//A[@id='ctl00_cpHeaderRight_btnAdd']")));
                            
                            }
                            
                            System.out.println("value of i="+i);
                            m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div/div/div/div[2]/iframe")));
                            
                            System.out.println("value of i after switched="+i);
//                           
                            m_Driver.findElement(By.xpath("//*[@id='select2-ctl00_cPH_rptrParam_ctl01_ltAccount-container']")).click();
                            
                            data1=m_Driver.findElements(By.xpath("//*[@id='select2-ctl00_cPH_rptrParam_ctl01_ltAccount-results']/li/ul/li"));
                           
                      String p =data1.get(i).getText();
                        System.out.print("box2==" +p );
        //                
                           m_Driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(p); 
        //                  
                          m_Driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
        //                                         
                    m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrParam_ctl00_txtParamValue']")).sendKeys("Zrate"+i+"both");
        //            
                            m_Driver.findElement(By.xpath("//*[contains(text(),'VATRateType')]")).click();
        //                
                           WebElement elem1=m_Driver.findElement(By.xpath("//SELECT[@name='ctl00$cPH$rptrParam$ctl02$ddVatRateType']")); 
                          Select dropdown1 = new Select(elem1);

 

                         dropdown1.selectByVisibleText("Zero Rate");
        //               
                         System.out.println("Zero rate");
                     
                         
                         WebElement elem2=m_Driver.findElement(By.xpath("//SELECT[@name='ctl00$cPH$rptrParam$ctl03$ddType']")); 
                          Select dropdown2 = new Select(elem2);

 

                         dropdown2.selectByVisibleText("Both");
                         
                         System.out.println("both");
                
                         WebElement save1=m_Driver.findElement(By.xpath("//A[@id='ctl00_cphFooter_btnSave']")); 
                         jsExec.executeScript("arguments[0].scrollIntoView();", save1);
                         
                         System.out.println("save clicked");
                 
                         save1.click();
                         
                         Thread.sleep(2000);
                         
                        m_Driver.switchTo().defaultContent();
                            
                            
                        }
    }
    String jste="";
    public void ASEnterRuleData() throws Exception
    {
    	
    	FileInputStream fis = new FileInputStream("D:\\Ashiv.xlsx");
    	XSSFWorkbook wb =new XSSFWorkbook(fis);
    	XSSFSheet sht = wb.getSheetAt(0);
    	int iRowNum= sht.getLastRowNum();
    	System.out.println("Excel totoal records :"+iRowNum);
    	String[] arr=new String[iRowNum];
    	for(int j=1; j<=iRowNum; j++)
    	{
    		String jste=sht.getRow(j).getCell(1).toString();
    	

    		System.out.println(jste);
    	    if(j!=0)
            {
        
                jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//A[@id='ctl00_cpHeaderRight_btnAdd']")));
            
            }
               
                   m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div/div/div/div[2]/iframe")));
                   
                   System.out.println("switched");
                   
                   m_Driver.findElement(By.xpath("//*[@id=\"select2-ctl00_cPH_rptrParam_ctl01_ltAccount-container\"]")).click();
            	   m_Driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(jste);
            	   m_Driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
                	   
            	   m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrParam_ctl00_txtParamValue']")).sendKeys("ZR"+j+"Both");
                   
                	
            	   WebElement elem1=m_Driver.findElement(By.xpath("//SELECT[@name='ctl00$cPH$rptrParam$ctl02$ddVatRateType']")); 
            	   
                   Select dropdown1 = new Select(elem1);

                   dropdown1.selectByVisibleText("Zero Rate");   

                   System.out.println("Zero Rate");
                	  
                   
                   WebElement elem2=m_Driver.findElement(By.xpath("//SELECT[@name='ctl00$cPH$rptrParam$ctl03$ddType']")); 
                   Select dropdown2 = new Select(elem2);                 
                      

                   dropdown2.selectByVisibleText("Both");
                   
                   System.out.println("Save clicked");
                	

                   WebElement save1=m_Driver.findElement(By.xpath("//A[@id='ctl00_cphFooter_btnSave']")); 
                   jsExec.executeScript("arguments[0].scrollIntoView();", save1);
                   
                   System.out.println("Successfully Data ="+j);
           
                   save1.click();
                   
                   Thread.sleep(2000);
                   
                  m_Driver.switchTo().defaultContent();
             	   
             	   
             	   
                }
    }
    
         
           	
           	public void GetTData() throws InterruptedException
           	{
                 
           		List <WebElement> Pages=m_Driver.findElements(By.xpath("//*[@id='ctl00_divSubContent']/div[6]/div/ul/li"));
           		int size3=Pages.size();
           		for(int l=1;l<size3-1;l++)
           		{
           			Pages=m_Driver.findElements(By.xpath("//*[@id='ctl00_divSubContent']/div[6]/div/ul/li"));
           			m_Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
           			//WebElement pg =m_Driver.findElement(By.xpath("//*[@id='ctl00_divSubContent']/div[4]/div[3]/div/ul/li"));
           			jsExec.executeScript("arguments[0].scrollIntoView();",Pages.get(l));
           			Thread.sleep(1000);
           			Pages.get(l).click();


           			System.out.println(l);
           			List <WebElement>  dataa=m_Driver.findElements(By.xpath("//*[@id='ctl00_divSubContent']/div[4]/div[3]/div/div/div/div/table/tbody/tr"));
           		int Size1=dataa.size();
           			for(int t=0;t<Size1;t++)

           			{

           				String [] p=dataa.get(t).getText().split("'");
           				HashMap<String, String>hm=new HashMap<String,String>();
           				hm.put(p[1], p[3]);
           				System.out.println(hm);
           				for(Map.Entry<String , String>dd:hm.entrySet())
           				{
           					out_ZR_Both=out_ZR_Both+"~"+dd.getKey();
           					out2_ZR_Both=out2_ZR_Both+"~"+dd.getValue();
           				
           				}
           				
           				
           			}
           System.out.println("Done ");


           		}
           	


           	}
           	public String out_ZR_Both()
           	{
           		return out_ZR_Both;
           		
           	}
           	public String out2_ZR_Both()
           	{
           		return out2_ZR_Both;
           		
           	}
           	
           	
                        
                        
                        
    
    
}