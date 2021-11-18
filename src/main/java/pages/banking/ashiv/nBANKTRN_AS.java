package pages.banking.ashiv;

import pages.BasePage;
import pages.SaleCreditNote;

import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.GetScreenShot;
import utilities.testmodeller.TestModellerLogger;

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/a226b6d2-34bc-4f26-b18a-f50616deb4ed
@TestModellerModule(guid = "a226b6d2-34bc-4f26-b18a-f50616deb4ed")
public class nBANKTRN_AS extends BasePage
{
     public static String krno1;
     public int t=1;
     HashMap<String, String>hm=new HashMap<String,String>();
 	public static String out="";
 	public static String out2="";
     
	public nBANKTRN_AS (WebDriver driver)
	{
		super(driver);
	}
	


	private By BK_SELECTElem = By.xpath("//*[@id='ctl00_cPH_ddlAccount']");
	
	//private By BK_SELECTElem=By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div/div/div/div/div/div/div/select");
	////*[@id="ctl00_cPH_ddlAccount"];
	private By NDateElem = By.xpath("//INPUT[@id='ctl00_cPH_rptRecord_ctl00_txtDate']");

	private By n_descElem = By.cssSelector("INPUT[id='ctl00_cPH_rptRecord_ctl00_txtDescription']");
	
	private By Recived_amtElem = By.xpath("//INPUT[@id='ctl00_cPH_rptRecord_ctl00_txtDbAmount']");

	private By spnt_amtElem = By.cssSelector("INPUT[id='ctl00_cPH_rptRecord_ctl00_txtAmount']");

	private By Select_VATRateElem = By.xpath("//SELECT[@id='ctl00_cPH_rptRecord_ctl00_ddVATRate']");

	private By cal_amtElem = By.xpath("//INPUT[@id='ctl00_cPH_rptRecord_ctl00_ltVATAmount']");

	private By Select_Option1Elem = By.xpath("//*[@id='select2-ctl00_cPH_rptRecord_ctl00_ltAccount-container']");
	
	private By BOX2Elem= By.xpath("/html/body/span/span/span[1]/input");

      

	private By _Save_Elem = By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div/a[1]");
	
	public void GoToUrl()
	{
	
		m_Driver.get("	http://sandbox3.nomismasolution.co.uk/AccountUI/BankTranEditor.aspx?FYCode=116996&CompanyCode=16673&menuid=0");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL -	http://sandbox3.nomismasolution.co.uk/AccountUI/BankTranEditor.aspx?FYCode=116996&CompanyCode=16673&menuid=0");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL -	http://sandbox3.nomismasolution.co.uk/AccountUI/BankTranEditor.aspx?FYCode=116996&CompanyCode=16673&menuid=0");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
//   public void AssertUrl()
//    {
//        String currentUrl = m_Driver.getCurrentUrl();
//        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AccountUI/BankTranEditor.aspx?FYCode=52444&CompanyCode=13236&menuid=0";
//
//        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AccountUI/BankTranEditor.aspx?FYCode=52444&CompanyCode=13236&menuid=0")) {
//            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
//        }
//    }

    
	/**
 	 * Select BK_SELECT
	 * @throws InterruptedException 
	 * @throws IOException 
     * @name Select BK_SELECT
     */
    public void Select_BK_SELECT(String BK_SELECT) throws InterruptedException, IOException
 	{
 	    
 		WebElement elem = getWebElement(BK_SELECTElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_BK_SELECT", "Select_BK_SELECT failed. Unable to locate object: " + BK_SELECTElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_BK_SELECT", "Select_BK_SELECT failed. Unable to locate object: " + BK_SELECTElem.toString());

 			Assert.fail("Unable to locate object: " + BK_SELECTElem.toString());
         }
 		System.out.println("1"+BK_SELECT);
			Select dropdown = new Select(elem);

			dropdown.selectByVisibleText(BK_SELECT);
 
 	
 		
 		GetScreenShot.captureAsImage(m_Driver, BK_SELECT);
 		
 		ExtentReportManager.passStep(m_Driver, "Select_BK_SELECT " + BK_SELECT);

 		TestModellerLogger.PassStep(m_Driver, "Select_BK_SELECT " + BK_SELECT);
 		
 		//elem.sendKeys(Keys.TAB); 		
 	}

      
	/**
 	 * Enter NDate
	 * @throws InterruptedException 
     * @name Enter NDate
     */
 	public void Enter_NDate(String NDate) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(NDateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_NDate", "Enter_NDate failed. Unable to locate object: " + NDateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_NDate", "Enter_NDate failed. Unable to locate object: " + NDateElem.toString());

 			Assert.fail("Unable to locate object: " + NDateElem.toString());
         }
 		//elem.sendKeys(Keys.ENTER);
 		elem.sendKeys(NDate);
 		 		
 		elem.sendKeys(Keys.TAB); 	
  		ExtentReportManager.passStep(m_Driver, "Enter_NDate " + NDate);

  		TestModellerLogger.PassStep(m_Driver, "Enter_NDate " + NDate);
 	}

      
	/**
 	 * Enter n_desc
	 * @throws InterruptedException 
     * @name Enter n_desc
     */
 	public void Enter_n_desc(String n_desc) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(n_descElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_n_desc", "Enter_n_desc failed. Unable to locate object: " + n_descElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_n_desc", "Enter_n_desc failed. Unable to locate object: " + n_descElem.toString());

 			Assert.fail("Unable to locate object: " + n_descElem.toString());
         }

 		elem.sendKeys(n_desc);
 	//	Thread.sleep(2000);
 		elem.sendKeys(Keys.TAB); 	
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_n_desc " + n_desc);

  		TestModellerLogger.PassStep(m_Driver, "Enter_n_desc " + n_desc);
 	}
 	public void Fill_Recnl_Bank_ST() throws InterruptedException

	{
		GetData ob=new GetData(m_Driver);

		String out2=ob.out2();

		String[]data2=out2.split("~");

		System.out.println(data2.length);


		{

		}
	//	WebElement Select_Bank_Name=m_Driver.findElement(By.xpath("//SELECT[@name='ctl00$cPH$ddlAccount']"));
	//	Select dropdown3 = new Select(Select_Bank_Name);

	//	dropdown3.selectByVisibleText("AA@Ashiv");


		for(int p=0;p<data2.length-1;p++)
		{


			for(int i=0;i<1;i++)
			{
				WebElement date =jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDate']")));

				date.sendKeys("14/09/2021");


				WebElement Received=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDbAmount']")));

				Received.sendKeys("400");

				WebElement spent=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtAmount']")));

				spent.sendKeys("0");

				WebElement Vat=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_ddVATRate']")));

				Select dropdown = new Select(Vat);

				dropdown.selectByVisibleText("Standard Rate");

				WebElement dist=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDescription']")));

				dist.sendKeys(data2[t]);

				t++;
				m_Driver.findElement(By.xpath("//*[@id='ctl00_cpHeaderRight_btnSave']")).click();
				Thread.sleep(2000);


			}
		}
	}
		public void Fill_Recnl_Bank_NV() throws InterruptedException

		{
			GetData ob=new GetData(m_Driver);

			String out2=ob.out2();

			String[]data2=out2.split("~");

			System.out.println(data2.length);


			{

			}
			WebElement Select_Bank_Name=m_Driver.findElement(By.xpath("//SELECT[@name='ctl00$cPH$ddlAccount']"));
			Select dropdown3 = new Select(Select_Bank_Name);

			dropdown3.selectByVisibleText("AA@Ashiv");


			for(int p=0;p<data2.length-1;p++)
			{


				for(int i=0;i<1;i++)
				{
					WebElement date =jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDate']")));

					date.sendKeys("14/09/2021");


					WebElement Received=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDbAmount']")));

					Received.sendKeys("400");

					WebElement spent=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtAmount']")));

					spent.sendKeys("0");

					WebElement Vat=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_ddVATRate']")));

					Select dropdown = new Select(Vat);

					dropdown.selectByVisibleText("No VAT");

					WebElement dist=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDescription']")));

					dist.sendKeys(data2[t]);



					t++;
					m_Driver.findElement(By.xpath("//*[@id='ctl00_cpHeaderRight_btnSave']")).click();
					Thread.sleep(2000);


				}
			}


		}

      
	/**
 	 * Enter Recived_amt
	 * @throws InterruptedException 
     * @name Enter Recived_amt
     */
 	public void Enter_Recived_amt(String Recived_amt) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(Recived_amtElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Recived_amt", "Enter_Recived_amt failed. Unable to locate object: " + Recived_amtElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Recived_amt", "Enter_Recived_amt failed. Unable to locate object: " + Recived_amtElem.toString());

 			Assert.fail("Unable to locate object: " + Recived_amtElem.toString());
         }

 		elem.sendKeys(Recived_amt);
 			
 				ExtentReportManager.passStep(m_Driver, "Enter_Recived_amt " + Recived_amt);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Recived_amt " + Recived_amt);
  		elem.sendKeys(Keys.TAB); 	
 	}

      
	/**
 	 * Enter spnt_amt
	 * @throws InterruptedException 
     * @name Enter spnt_amt
     */
 	public void Enter_spnt_amt(String spnt_amt) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(spnt_amtElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_spnt_amt", "Enter_spnt_amt failed. Unable to locate object: " + spnt_amtElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_spnt_amt", "Enter_spnt_amt failed. Unable to locate object: " + spnt_amtElem.toString());

 			Assert.fail("Unable to locate object: " + spnt_amtElem.toString());
         }

 		elem.sendKeys(spnt_amt);
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_spnt_amt " + spnt_amt);

  		TestModellerLogger.PassStep(m_Driver, "Enter_spnt_amt " + spnt_amt);
  		elem.sendKeys(Keys.TAB); 	
 	}

    
	/**
 	 * Select Select_VATRate
	 * @throws InterruptedException 
     * @name Select Select_VATRate
     */
    public void Select_Select_VATRate(String Select_VATRate) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(Select_VATRateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Select_VATRate", "Select_Select_VATRate failed. Unable to locate object: " + Select_VATRateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Select_VATRate", "Select_Select_VATRate failed. Unable to locate object: " + Select_VATRateElem.toString());

 			Assert.fail("Unable to locate object: " + Select_VATRateElem.toString());
         }
 		//elem.sendKeys(Keys.ENTER);
 		System.out.println("vat selected");
 		//elem.sendKeys(Keys.ARROW_DOWN);
		Select dropdown = new Select(elem);
		
 		dropdown.selectByVisibleText(Select_VATRate);

 		ExtentReportManager.passStep(m_Driver, "Select_Select_VATRate " + Select_VATRate);

 		TestModellerLogger.PassStep(m_Driver, "Select_Select_VATRate " + Select_VATRate);
 	}

      
	/**
 	 * Enter cal_amt
	 * @throws InterruptedException 
     * @name Enter cal_amt
     */
 	public void Enter_cal_amt(String cal_amt) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(cal_amtElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_cal_amt", "Enter_cal_amt failed. Unable to locate object: " + cal_amtElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_cal_amt", "Enter_cal_amt failed. Unable to locate object: " + cal_amtElem.toString());

 			Assert.fail("Unable to locate object: " + cal_amtElem.toString());
         }

 		elem.sendKeys(cal_amt);
 		System.out.println("amount:");
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_cal_amt " + cal_amt);

  		TestModellerLogger.PassStep(m_Driver, "Enter_cal_amt " + cal_amt);
 	}

     
	/**
 	 * Click Select_Option1
	 * @throws InterruptedException 
     * @name Click Select_Option1
     */
	public void Click_Select_Option1() throws InterruptedException
	{
        		WebElement elem = getWebElement(Select_Option1Elem);

		if (elem == null) 
		{
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Select_Option1", "Click_Select_Option1 failed. Unable to locate object: " + Select_Option1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Select_Option1", "Click_Select_Option1 failed. Unable to locate object: " + Select_Option1Elem.toString());

			Assert.fail("Unable to locate object: " + Select_Option1Elem.toString());
        }
//	WebDriverWait wait = new WebDriverWait(m_Driver,20);
//		WebElement t = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("INPUT[aria-autocomplete='list']")));
//				
//		
//			t.click();	
	elem.click();
	Thread.sleep(1000);
    	
      		
	}
	public void FillTrns() throws InterruptedException

	{
		GetData ob=new GetData(m_Driver);
		//HashMap<String, String>hm1=new HashMap<String, String>();
		String out=ob.out();
		String out2=ob.out2();
		String[]data1=out.split("~");
		String[]data2=out2.split("~");
		System.out.println(data1.length);
		System.out.println(data2.length);

		}

      
	/**
 	 * Enter BOX2
	 * @throws InterruptedException 
     * @name Enter BOX2
     */
 	public void Enter_BOX2(String BOX2) throws InterruptedException
 	{
 	    
 		//WebElement elem = getWebElement(BOX2Elem);

// 		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_BOX2", "Enter_BOX2 failed. Unable to locate object: " + BOX2Elem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_BOX2", "Enter_BOX2 failed. Unable to locate object: " + BOX2Elem.toString());
//
// 			Assert.fail("Unable to locate object: " + BOX2Elem.toString());
//         }
 		

 	         String p =BOX2;
 	         System.out.print("box2"   +p );
 	         m_Driver.findElement(By.xpath("//*[contains(text(),'" +p+ "')]")).click();
 	         Thread.sleep(2000);
 
 	}

     
	/**
 	 * Click 1400 - DATA
     * @name Click 1400 - DATA
     */
//	public void Click__1400_DATA()
//	{
//        
//		WebElement elem = getWebElement(_1400_DATAElem);
//
//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__1400_DATA", "Click__1400_DATA failed. Unable to locate object: " + _1400_DATAElem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__1400_DATA", "Click__1400_DATA failed. Unable to locate object: " + _1400_DATAElem.toString());
//
//			Assert.fail("Unable to locate object: " + _1400_DATAElem.toString());
//        }
//
//		elem.click();
//          	
//
//		ExtentReportManager.passStep(m_Driver, "Click__1400_DATA");
//
//		TestModellerLogger.PassStep(m_Driver, "Click__1400_DATA");
//	}
 	
 	public void GetTData() throws InterruptedException
	{
         int Size1=0;
		List <WebElement> Pages=m_Driver.findElements(By.xpath("//*[@id='ctl00_divSubContent']/div[4]/div[3]/div/ul/li"));
		int size3=Pages.size();
		for(int l=1;l<size3-1;l++)
		{
			Pages=m_Driver.findElements(By.xpath("//*[@id='ctl00_divSubContent']/div[4]/div[3]/div/ul/li"));
			m_Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//WebElement pg =m_Driver.findElement(By.xpath("//*[@id='ctl00_divSubContent']/div[4]/div[3]/div/ul/li"));
			jsExec.executeScript("arguments[0].scrollIntoView();",Pages.get(l));
			Thread.sleep(1000);
			Pages.get(l).click();


			System.out.println(l);
			List <WebElement>  dataa=m_Driver.findElements(By.xpath("//*[@class='table table-bordered']/tbody/tr/td[1]"));
			Size1=dataa.size();
			for(int t=0;t<Size1;t++)

			{

				String [] p=dataa.get(t).getText().split("'");
				HashMap<String, String>hm=new HashMap<String,String>();
				hm.put(p[1], p[3]);
				System.out.println(hm);
				for(Map.Entry<String , String>dd:hm.entrySet())
				{
				out=out+"~"+dd.getKey();
				out2=out2+"~"+dd.getValue();
				
				}
				
				
			}
System.out.println("Done ");


		}
	


	}
	public String out()
	{
		return out;
		
	}
	public String out2()
	{
		return out2;
		
	}
	
	/**
 	 * Click  Save 
	 * @throws InterruptedException 
     * @name Click  Save 
     */
	public void Click__Save_() throws InterruptedException
	{
        
		WebElement elem = getWebElement(_Save_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Save_", "Click__Save_ failed. Unable to locate object: " + _Save_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Save_", "Click__Save_ failed. Unable to locate object: " + _Save_Elem.toString());

			Assert.fail("Unable to locate object: " + _Save_Elem.toString());
        }
		
//		elem.click();
		JavascriptExecutor jse = (JavascriptExecutor)m_Driver;
		jse.executeScript("arguments[0].click()", elem);
		Thread.sleep(2000);
		 WebElement s=m_Driver.findElement(By.xpath("html/body/form/main/div[11]/div[3]/div/div[1]/div"));
	     String transnno=s.getText();
	     String arr[]=transnno.split(" ");
	     String stn=arr[2];
	      krno1=stn.substring(1);
	    System.out.println("Transaction number is"    +krno1);	
		ExtentReportManager.passStep(m_Driver, "Click__Save_");

	    TestModellerLogger.PassStep(m_Driver, "Click__Save_");
			       
			
	}
	
	public String confirmation() 
	{
		System.out.println("Confirmation "    +krno1);	
		return krno1;
		
		
	}
	
}