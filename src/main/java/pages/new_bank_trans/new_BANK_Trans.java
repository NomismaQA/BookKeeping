package pages.new_bank_trans;

import pages.BasePage;
import pages.SaleCreditNote;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
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
import utilities.PassScreenshot;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.GetScreenShot;
import utilities.testmodeller.TestModellerLogger;

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/a226b6d2-34bc-4f26-b18a-f50616deb4ed
@TestModellerModule(guid = "a226b6d2-34bc-4f26-b18a-f50616deb4ed")
public class new_BANK_Trans extends BasePage
{
     public static String krno1;
     public static List<String>trasno;
     List<WebElement> l1;
     int i;
     public static String krno2;
     FileInputStream fis;
     Workbook wb;
     Sheet sht;
     String[] arr;
     int iRowNum;
   
     
	public new_BANK_Trans (WebDriver driver)
	{
		super(driver);
	}
	
	private By BK_SELECTElem = By.xpath("//*[@id='ctl00_cPH_ddlAccount']");

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

 		elem.sendKeys(NDate);
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
	 * @throws Exception 
	 * @name Enter cal_amt
     */
 	public void Standard_scheme() throws Exception
 	 	{
 	    fis = new FileInputStream("D:\\testdata07oct.xlsx");
 	   wb = WorkbookFactory.create(fis);
       sht = wb.getSheet("51ledgercode");
      iRowNum = sht.getLastRowNum();
       System.out.println("Excel data :"+iRowNum);
        arr=new String[iRowNum];
        for(int j=1; j<=iRowNum; j++)
	       {
	       String ste=sht.getRow(j).getCell(1).toString();
	      System.out.println("LedgerCode :" +ste);
	      if(j!=0)
	      {
		jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//*[@id='ctl00_divMainContent']/header/div/div[2]/a")));
 		jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//A[contains(text(),'New Transaction')]")));
	  
		WebElement elem2=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_ddlAccount']")); 
        Select bnkdropdown2 = new Select(elem2);
        bnkdropdown2.selectByVisibleText("AA@Ashiv");
        elem2.sendKeys(Keys.TAB);
       
            WebElement date=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDate']")));
        	date.sendKeys("05/11/2021");
        	date.sendKeys(Keys.TAB);
       
	WebElement des=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDescription']")));
	des.sendKeys("oct10"+j+"st");

	des=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDescription']")));
	des.sendKeys(Keys.TAB);
		WebElement amt=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDbAmount']")));
amt.sendKeys("1000");	
des.sendKeys(Keys.TAB);
WebElement vt= jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//SELECT[@id='ctl00_cPH_rptRecord_ctl00_ddVATRate']")));
vt.click();
Select dropdown1 = new Select(vt);
dropdown1.selectByVisibleText("Standard Rate");
             Thread.sleep(3000);//updated data from 3000 to 1000
  m_Driver.findElement(By.xpath("//*[@id='tableID']/tbody/tr[1]/td[14]/span")).click();
Thread.sleep(1000);
WebElement elem3=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/span/span/span[1]/input")));
elem3.sendKeys(ste);
WebElement elem4=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/span/span/span[1]/input")));
elem4.sendKeys(Keys.ENTER);
Thread.sleep(3000);//change from 5000 to 1000
String vattype=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_ddVATRate']//option[@selected='selected']")).getText();
System.out.println("Refreshed Vat Type:=" +vattype);
WebElement save=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cpHeaderRight_btnSave']")));
jsExec.executeScript("arguments[0].click()", save);
Thread.sleep(1000);

WebElement s=m_Driver.findElement(By.xpath("html/body/form/main/div[11]/div[3]/div/div[1]/div"));
String transnno1=s.getText();
String arr[]=transnno1.split(" ");

String stn=arr[2];
 krno2=stn.substring(1);

System.out.println("Transaction number is"    +krno2);
/*Click on Back Button*/
m_Driver.findElement(By.xpath("//*[@id='ctl00_cpHeaderRight_btnCancel']")).click();
pages.new_bank_trans.src_Trans_num _t=new pages.new_bank_trans.src_Trans_num(m_Driver);
_t.Select_Sbnk_act("AA@Ashiv");
		_t.Select_Search_category("Transaction No");
				_t.Enter_Enter_code(krno2);
		_t.Click_Update_btn();
        }
	       }
 	 	}
 	
	      public void Flaterate_scheme() throws Exception
	 	 	{
	 	    fis = new FileInputStream("D:\\testdata07oct.xlsx");
	 	   wb = WorkbookFactory.create(fis);
	       sht = wb.getSheet("51ledgercode");
	      iRowNum = sht.getLastRowNum();
	       System.out.println("Excel data :"+iRowNum);
	        arr=new String[iRowNum];
	        for(int j=1; j<=iRowNum; j++)
		       {
		       String ste=sht.getRow(j).getCell(1).toString();
		      System.out.println("LedgerCode :" +ste);
		      if(j!=0)
		      {
			jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//*[@id='ctl00_divMainContent']/header/div/div[2]/a")));
	 		jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//A[contains(text(),'New Transaction')]")));
	 		 Thread.sleep(2000);
			WebElement elem2=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_ddlAccount']")); 
	        Select bnkdropdown2 = new Select(elem2);
	        bnkdropdown2.selectByVisibleText("Bank_Flat");
	        elem2.sendKeys(Keys.TAB);
		   
	            WebElement date=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDate']")));
	        	date.sendKeys("05/11/2021");
	        	date.sendKeys(Keys.TAB);
	        	
		WebElement des=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDescription']")));
		des.sendKeys("oct10"+j+"flt");

		des=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDescription']")));
		des.sendKeys(Keys.TAB);
			WebElement amt=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDbAmount']")));
	amt.sendKeys("1000");	
	des.sendKeys(Keys.TAB);
	WebElement vt= jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//SELECT[@id='ctl00_cPH_rptRecord_ctl00_ddVATRate']")));
	vt.click();
	Select dropdown1 = new Select(vt);
	dropdown1.selectByVisibleText("Reduced Rate");
	             Thread.sleep(3000);//updated data from 3000 to 1000
	  m_Driver.findElement(By.xpath("//*[@id='tableID']/tbody/tr[1]/td[14]/span")).click();
	Thread.sleep(1000);
	WebElement elem3=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/span/span/span[1]/input")));
	elem3.sendKeys(ste);
	WebElement elem4=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/span/span/span[1]/input")));
	elem4.sendKeys(Keys.ENTER);
	Thread.sleep(3000);//change from 5000 to 1000
	String vattype=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_ddVATRate']//option[@selected='selected']")).getText();
	System.out.println("Refreshed Vat Type:=" +vattype);
	WebElement save=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cpHeaderRight_btnSave']")));
	jsExec.executeScript("arguments[0].click()", save);
	Thread.sleep(1000);

	WebElement s=m_Driver.findElement(By.xpath("html/body/form/main/div[11]/div[3]/div/div[1]/div"));
	String transnno1=s.getText();
	String arr[]=transnno1.split(" ");

	String stn=arr[2];
	 krno2=stn.substring(1);

	System.out.println("Transaction number is"    +krno2);
	/*Click on Back Button*/
	m_Driver.findElement(By.xpath("//*[@id='ctl00_cpHeaderRight_btnCancel']")).click();
	pages.new_bank_trans.src_Trans_num _t=new pages.new_bank_trans.src_Trans_num(m_Driver);
	_t.Select_Sbnk_act("Bank_Flat");
			_t.Select_Search_category("Transaction No");
					_t.Enter_Enter_code(krno2);
			_t.Click_Update_btn();
	        }
		       }
	 	 	}
		      public void novat_scheme_NoVAT() throws Exception
		 	 	{
		 	    fis = new FileInputStream("D:\\testdata07oct.xlsx");
		 	   wb = WorkbookFactory.create(fis);
		       sht = wb.getSheet("51ledgercode");
		      iRowNum = sht.getLastRowNum();
		       System.out.println("Excel data :"+iRowNum);
		        arr=new String[iRowNum];
		        for(int j=1; j<=iRowNum; j++)
			       {
			       String ste=sht.getRow(j).getCell(1).toString();
			      System.out.println("LedgerCode :" +ste);
			      if(j!=0)
			      {
				jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//*[@id='ctl00_divMainContent']/header/div/div[2]/a")));
		 		jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//A[contains(text(),'New Transaction')]")));
			  
				WebElement elem2=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_ddlAccount']")); 
		        Select bnkdropdown2 = new Select(elem2);
		        bnkdropdown2.selectByVisibleText("Bank_novat");
		        elem2.sendKeys(Keys.TAB);
		      
		            WebElement date=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDate']")));
		        	date.sendKeys("05/11/2021");
		        	date.sendKeys(Keys.TAB);
		        	Thread.sleep(2000);
			WebElement des=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDescription']")));
			des.sendKeys("oct10"+j+"nvt");
			des=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDescription']")));
			des.sendKeys(Keys.TAB);
				WebElement amt=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDbAmount']")));
		amt.sendKeys("1000");	
		Thread.sleep(1000);
		amt.sendKeys(Keys.TAB);
		amt.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		m_Driver.findElement(By.xpath("//*[@id='tableID']/tbody/tr[1]/td[12]/span")).click();
				Thread.sleep(1000);
	WebElement elem3=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/span/span/span[1]/input")));
		elem3.sendKeys(ste);
		//Thread.sleep(4000);
		WebElement elem4=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/span/span/span[1]/input")));
		elem4.sendKeys(Keys.ENTER);
		Thread.sleep(1000);//change from 5000 to 1000
		WebElement save=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cpHeaderRight_btnSave']")));
		jsExec.executeScript("arguments[0].click()", save);
		Thread.sleep(1000);

		WebElement s=m_Driver.findElement(By.xpath("html/body/form/main/div[11]/div[3]/div/div[1]/div"));
		String transnno1=s.getText();
		String arr[]=transnno1.split(" ");

		String stn=arr[2];
		 krno2=stn.substring(1);

		System.out.println("Transaction number is"    +krno2);
		/*Click on Back Button*/
		m_Driver.findElement(By.xpath("//*[@id='ctl00_cpHeaderRight_btnCancel']")).click();
		pages.new_bank_trans.src_Trans_num _t=new pages.new_bank_trans.src_Trans_num(m_Driver);
		_t.Select_Sbnk_act("Bank_novat");
				_t.Select_Search_category("Transaction No");
						_t.Enter_Enter_code(krno2);
				_t.Click_Update_btn();
			
		        }
	      
	      
	      
	      
	      
	       }
 	 	}
		      public void Standard_scheme_ZeroRate() throws Exception
		 	 	{
		 	    fis = new FileInputStream("D:\\testdata07oct.xlsx");
		 	   wb = WorkbookFactory.create(fis);
		       sht = wb.getSheet("51ledgercode");
		      iRowNum = sht.getLastRowNum();
		       System.out.println("Excel data :"+iRowNum);
		        arr=new String[iRowNum];
		        for(int j=1; j<=iRowNum; j++)
			       {
			       String ste=sht.getRow(j).getCell(5).toString();
			      System.out.println("LedgerCode :" +ste);
			      if(j!=0)
			      {
				jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//*[@id='ctl00_divMainContent']/header/div/div[2]/a")));
		 		jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//A[contains(text(),'New Transaction')]")));
			    
				WebElement elem2=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_ddlAccount']")); 
		        Select bnkdropdown2 = new Select(elem2);
		        bnkdropdown2.selectByVisibleText("Bank_st");
		        elem2.sendKeys(Keys.TAB);
			    
		            WebElement date=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDate']")));
		        	date.sendKeys("05/11/2021");
		        	date.sendKeys(Keys.TAB);
		        	Thread.sleep(2000);
			WebElement des=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDescription']")));
			des.sendKeys("oct10"+j+"9");

			des=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDescription']")));
			des.sendKeys(Keys.TAB);
				WebElement amt=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDbAmount']")));
		amt.sendKeys("1000");	
		des.sendKeys(Keys.TAB);
		WebElement vt= jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//SELECT[@id='ctl00_cPH_rptRecord_ctl00_ddVATRate']")));
		vt.click();
		Select dropdown1 = new Select(vt);
		dropdown1.selectByVisibleText("Zero Rate");
		             Thread.sleep(3000);//updated data from 3000 to 1000
		  m_Driver.findElement(By.xpath("//*[@id='tableID']/tbody/tr[1]/td[14]/span")).click();
		Thread.sleep(1000);
		WebElement elem3=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/span/span/span[1]/input")));
		elem3.sendKeys(ste);
		WebElement elem4=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/span/span/span[1]/input")));
		elem4.sendKeys(Keys.ENTER);
		Thread.sleep(3000);//change from 5000 to 1000
		String vattype=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_ddVATRate']//option[@selected='selected']")).getText();
		System.out.println("Refreshed Vat Type:=" +vattype);
		WebElement save=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cpHeaderRight_btnSave']")));
		jsExec.executeScript("arguments[0].click()", save);
		Thread.sleep(1000);

		WebElement s=m_Driver.findElement(By.xpath("html/body/form/main/div[11]/div[3]/div/div[1]/div"));
		String transnno1=s.getText();
		String arr[]=transnno1.split(" ");

		String stn=arr[2];
		 krno2=stn.substring(1);

		System.out.println("Transaction number is"    +krno2);
		/*Click on Back Button*/
		m_Driver.findElement(By.xpath("//*[@id='ctl00_cpHeaderRight_btnCancel']")).click();
		pages.new_bank_trans.src_Trans_num _t=new pages.new_bank_trans.src_Trans_num(m_Driver);
		_t.Select_Sbnk_act("bank_2");
				_t.Select_Search_category("Transaction No");
						_t.Enter_Enter_code(krno2);
				_t.Click_Update_btn();
			      }
			       }
		 	 	}
		      public void Standard_scheme_Exempt() throws Exception
		 	 	{
		 	    fis = new FileInputStream("D:\\testdata07oct.xlsx");
		 	   wb = WorkbookFactory.create(fis);
		       sht = wb.getSheet("51ledgercode");
		      iRowNum = sht.getLastRowNum();
		       System.out.println("Excel data :"+iRowNum);
		        arr=new String[iRowNum];
		        for(int j=1; j<=iRowNum; j++)
			       {
			       String ste=sht.getRow(j).getCell(5).toString();
			      System.out.println("LedgerCode :" +ste);
			      if(j!=0)
			      {
				jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//*[@id='ctl00_divMainContent']/header/div/div[2]/a")));
		 		jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//A[contains(text(),'New Transaction')]")));
			    
				WebElement elem2=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_ddlAccount']")); 
		        Select bnkdropdown2 = new Select(elem2);
		        bnkdropdown2.selectByVisibleText("Bank_st");
		        elem2.sendKeys(Keys.TAB);
			    
		            WebElement date=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDate']")));
		        	date.sendKeys("05/11/2021");
		        	date.sendKeys(Keys.TAB);
		        	Thread.sleep(2000);
			WebElement des=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDescription']")));
			des.sendKeys("oct10"+j+"exm");

			des=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDescription']")));
			des.sendKeys(Keys.TAB);
				WebElement amt=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDbAmount']")));
		amt.sendKeys("1000");	
		des.sendKeys(Keys.TAB);
		WebElement vt= jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//SELECT[@id='ctl00_cPH_rptRecord_ctl00_ddVATRate']")));
		vt.click();
		Select dropdown1 = new Select(vt);
		dropdown1.selectByVisibleText("Exempt");
		             Thread.sleep(3000);//updated data from 3000 to 1000
		  m_Driver.findElement(By.xpath("//*[@id='tableID']/tbody/tr[1]/td[14]/span")).click();
		Thread.sleep(1000);
		WebElement elem3=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/span/span/span[1]/input")));
		elem3.sendKeys(ste);
		WebElement elem4=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/span/span/span[1]/input")));
		elem4.sendKeys(Keys.ENTER);
		Thread.sleep(3000);//change from 5000 to 1000
		String vattype=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_ddVATRate']//option[@selected='selected']")).getText();
		System.out.println("Refreshed Vat Type:=" +vattype);
		WebElement save=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cpHeaderRight_btnSave']")));
		jsExec.executeScript("arguments[0].click()", save);
		Thread.sleep(1000);

		WebElement s=m_Driver.findElement(By.xpath("html/body/form/main/div[11]/div[3]/div/div[1]/div"));
		String transnno1=s.getText();
		String arr[]=transnno1.split(" ");

		String stn=arr[2];
		 krno2=stn.substring(1);

		System.out.println("Transaction number is"    +krno2);
		/*Click on Back Button*/
		m_Driver.findElement(By.xpath("//*[@id='ctl00_cpHeaderRight_btnCancel']")).click();
		pages.new_bank_trans.src_Trans_num _t=new pages.new_bank_trans.src_Trans_num(m_Driver);
		_t.Select_Sbnk_act("bank_2");
				_t.Select_Search_category("Transaction No");
						_t.Enter_Enter_code(krno2);
				_t.Click_Update_btn();
			      }
			       }
		 	 	}
		         
		      
		      public void Standard_scheme_OutofScope() throws Exception
		 	 	{
		 	    fis = new FileInputStream("D:\\testdata17.xlsx");
		 	   wb = WorkbookFactory.create(fis);
		       sht = wb.getSheet("51ledgercode");
		      iRowNum = sht.getLastRowNum();
		       System.out.println("Excel data :"+iRowNum);
		        arr=new String[iRowNum];
		        for(int j=1; j<=iRowNum; j++)
			       {
			       String ste=sht.getRow(j).getCell(5).toString();
			      System.out.println("LedgerCode :" +ste);
			      if(j!=0)
			      {
				jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//*[@id='ctl00_divMainContent']/header/div/div[2]/a")));
		 		jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//A[contains(text(),'New Transaction')]")));
			    
				WebElement elem2=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_ddlAccount']")); 
		        Select bnkdropdown2 = new Select(elem2);
		        bnkdropdown2.selectByVisibleText("Bank_st");
		        elem2.sendKeys(Keys.TAB);
			    
		            WebElement date=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDate']")));
		        	date.sendKeys("05/11/2021");
		        	date.sendKeys(Keys.TAB);
		        	Thread.sleep(2000);
			WebElement des=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDescription']")));
			des.sendKeys("oct10"+j+"27");

			des=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDescription']")));
			des.sendKeys(Keys.TAB);
				WebElement amt=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDbAmount']")));
		amt.sendKeys("1000");	
		des.sendKeys(Keys.TAB);
		WebElement vt= jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//SELECT[@id='ctl00_cPH_rptRecord_ctl00_ddVATRate']")));
		vt.click();
		Select dropdown1 = new Select(vt);
		dropdown1.selectByVisibleText(">Out of Scope");
		             Thread.sleep(3000);//updated data from 3000 to 1000
		  m_Driver.findElement(By.xpath("//*[@id='tableID']/tbody/tr[1]/td[14]/span")).click();
		Thread.sleep(1000);
		WebElement elem3=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/span/span/span[1]/input")));
		elem3.sendKeys(ste);
		WebElement elem4=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/span/span/span[1]/input")));
		elem4.sendKeys(Keys.ENTER);
		Thread.sleep(3000);//change from 5000 to 1000
		String vattype=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_ddVATRate']//option[@selected='selected']")).getText();
		System.out.println("Refreshed Vat Type:=" +vattype);
		WebElement save=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cpHeaderRight_btnSave']")));
		jsExec.executeScript("arguments[0].click()", save);
		Thread.sleep(1000);

		WebElement s=m_Driver.findElement(By.xpath("html/body/form/main/div[11]/div[3]/div/div[1]/div"));
		String transnno1=s.getText();
		String arr[]=transnno1.split(" ");

		String stn=arr[2];
		 krno2=stn.substring(1);

		System.out.println("Transaction number is"    +krno2);
		/*Click on Back Button*/
		m_Driver.findElement(By.xpath("//*[@id='ctl00_cpHeaderRight_btnCancel']")).click();
		pages.new_bank_trans.src_Trans_num _t=new pages.new_bank_trans.src_Trans_num(m_Driver);
		_t.Select_Sbnk_act("bank_2");
				_t.Select_Search_category("Transaction No");
						_t.Enter_Enter_code(krno2);
				_t.Click_Update_btn();
			      }
			       }
		 	 	}
		           
		      
		      public void Standard_scheme_Drc20()throws Exception
		 	 	{
		 	    fis = new FileInputStream("D:\\testdata07oct.xlsx");
		 	   wb = WorkbookFactory.create(fis);
		       sht = wb.getSheet("51ledgercode");
		      iRowNum = sht.getLastRowNum();
		       System.out.println("Excel data :"+iRowNum);
		        arr=new String[iRowNum];
		        for(int j=1; j<=iRowNum; j++)
			       {
			       String ste=sht.getRow(j).getCell(5).toString();
			      System.out.println("LedgerCode :" +ste);
			      if(j!=0)
			      {
				jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//*[@id='ctl00_divMainContent']/header/div/div[2]/a")));
		 		jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//A[contains(text(),'New Transaction')]")));
			    
				WebElement elem2=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_ddlAccount']")); 
		        Select bnkdropdown2 = new Select(elem2);
		        bnkdropdown2.selectByVisibleText("Bank_st");
		        elem2.sendKeys(Keys.TAB);
			    
		            WebElement date=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDate']")));
		        	date.sendKeys("05/11/2021");
		        	date.sendKeys(Keys.TAB);
		        	Thread.sleep(2000);
			WebElement des=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDescription']")));
			des.sendKeys("oct10"+j+"27");

			des=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDescription']")));
			des.sendKeys(Keys.TAB);
				WebElement amt=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDbAmount']")));
		amt.sendKeys("1000");	
		des.sendKeys(Keys.TAB);
		WebElement vt= jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//SELECT[@id='ctl00_cPH_rptRecord_ctl00_ddVATRate']")));
		vt.click();
		Select dropdown1 = new Select(vt);
		dropdown1.selectByVisibleText("Domestic Reverse Charge - 20%");
		             Thread.sleep(3000);//updated data from 3000 to 1000
		  m_Driver.findElement(By.xpath("//*[@id='tableID']/tbody/tr[1]/td[14]/span")).click();
		Thread.sleep(1000);
		WebElement elem3=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/span/span/span[1]/input")));
		elem3.sendKeys(ste);
		WebElement elem4=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/span/span/span[1]/input")));
		elem4.sendKeys(Keys.ENTER);
		Thread.sleep(3000);//change from 5000 to 1000
		String vattype=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_ddVATRate']//option[@selected='selected']")).getText();
		System.out.println("Refreshed Vat Type:=" +vattype);
		WebElement save=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cpHeaderRight_btnSave']")));
		jsExec.executeScript("arguments[0].click()", save);
		Thread.sleep(1000);

		WebElement s=m_Driver.findElement(By.xpath("html/body/form/main/div[11]/div[3]/div/div[1]/div"));
		String transnno1=s.getText();
		String arr[]=transnno1.split(" ");

		String stn=arr[2];
		 krno2=stn.substring(1);

		System.out.println("Transaction number is"    +krno2);
		/*Click on Back Button*/
		m_Driver.findElement(By.xpath("//*[@id='ctl00_cpHeaderRight_btnCancel']")).click();
		pages.new_bank_trans.src_Trans_num _t=new pages.new_bank_trans.src_Trans_num(m_Driver);
		_t.Select_Sbnk_act("bank_2");
				_t.Select_Search_category("Transaction No");
						_t.Enter_Enter_code(krno2);
				_t.Click_Update_btn();
			      }
			       }
		 	 	}
		      public void Standard_scheme_Drc5()throws Exception
		 	 	{
		 	    fis = new FileInputStream("D:\\testdata07oct.xlsx");
		 	   wb = WorkbookFactory.create(fis);
		       sht = wb.getSheet("51ledgercode");
		      iRowNum = sht.getLastRowNum();
		       System.out.println("Excel data :"+iRowNum);
		        arr=new String[iRowNum];
		        for(int j=1; j<=iRowNum; j++)
			       {
			       String ste=sht.getRow(j).getCell(5).toString();
			      System.out.println("LedgerCode :" +ste);
			      if(j!=0)
			      {
				jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//*[@id='ctl00_divMainContent']/header/div/div[2]/a")));
		 		jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//A[contains(text(),'New Transaction')]")));
			    
				WebElement elem2=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_ddlAccount']")); 
		        Select bnkdropdown2 = new Select(elem2);
		        bnkdropdown2.selectByVisibleText("Bank_st");
		        elem2.sendKeys(Keys.TAB);
			    
		            WebElement date=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDate']")));
		        	date.sendKeys("05/11/2021");
		        	date.sendKeys(Keys.TAB);
		        	Thread.sleep(2000);
			WebElement des=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDescription']")));
			des.sendKeys("oct12"+j+"27");

			des=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDescription']")));
			des.sendKeys(Keys.TAB);
				WebElement amt=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDbAmount']")));
		amt.sendKeys("1000");	
		des.sendKeys(Keys.TAB);
		WebElement vt= jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//SELECT[@id='ctl00_cPH_rptRecord_ctl00_ddVATRate']")));
		vt.click();
		Select dropdown1 = new Select(vt);
		dropdown1.selectByVisibleText("Domestic Reverse Charge - 5%");
		             Thread.sleep(3000);//updated data from 3000 to 1000
		  m_Driver.findElement(By.xpath("//*[@id='tableID']/tbody/tr[1]/td[14]/span")).click();
		Thread.sleep(1000);
		WebElement elem3=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/span/span/span[1]/input")));
		elem3.sendKeys(ste);
		WebElement elem4=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/span/span/span[1]/input")));
		elem4.sendKeys(Keys.ENTER);
		Thread.sleep(3000);//change from 5000 to 1000
		String vattype=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_ddVATRate']//option[@selected='selected']")).getText();
		System.out.println("Refreshed Vat Type:=" +vattype);
		WebElement save=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cpHeaderRight_btnSave']")));
		jsExec.executeScript("arguments[0].click()", save);
		Thread.sleep(1000);

		WebElement s=m_Driver.findElement(By.xpath("html/body/form/main/div[11]/div[3]/div/div[1]/div"));
		String transnno1=s.getText();
		String arr[]=transnno1.split(" ");

		String stn=arr[2];
		 krno2=stn.substring(1);

		System.out.println("Transaction number is"    +krno2);
		/*Click on Back Button*/
		m_Driver.findElement(By.xpath("//*[@id='ctl00_cpHeaderRight_btnCancel']")).click();
		pages.new_bank_trans.src_Trans_num _t=new pages.new_bank_trans.src_Trans_num(m_Driver);
		_t.Select_Sbnk_act("bank_2");
				_t.Select_Search_category("Transaction No");
						_t.Enter_Enter_code(krno2);
				_t.Click_Update_btn();
			      }
			       }
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
	      krno2=stn.substring(1);
	    System.out.println("Transaction number is"    +krno2);	
		
			       
			
	}
	
	public  static String msgconfirmation() 
	{
		System.out.println("Confirmation "    +krno2);	
		return krno2;
		
		

	
	
	
	}
	
	public void Standard_scheme_Spentamt() throws Exception
	 	{
	    fis = new FileInputStream("D:\\testdata07oct.xlsx");
	   wb = WorkbookFactory.create(fis);
   sht = wb.getSheet("51ledgercode");
  iRowNum = sht.getLastRowNum();
   System.out.println("Excel data :"+iRowNum);
    arr=new String[iRowNum];
    for(int j=1; j<=iRowNum; j++)
       {
       String ste=sht.getRow(j).getCell(1).toString();
      System.out.println("LedgerCode :" +ste);
      if(j!=0)
      {
	jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//*[@id='ctl00_divMainContent']/header/div/div[2]/a")));
		jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//A[contains(text(),'New Transaction')]")));
    
	WebElement elem2=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_ddlAccount']")); 
    Select bnkdropdown2 = new Select(elem2);
    bnkdropdown2.selectByVisibleText("AA@Ashiv");
    elem2.sendKeys(Keys.TAB);
    
        WebElement date=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDate']")));
    	date.sendKeys("05/11/2021");
    	date.sendKeys(Keys.TAB);
    	Thread.sleep(2000);
WebElement des=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDescription']")));
des.sendKeys("oct10"+j+"spt");

des=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDescription']")));
des.sendKeys(Keys.TAB);
des.sendKeys(Keys.TAB);
	//WebElement amt=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDbAmount']")));
WebElement spntamt=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtAmount']")));
spntamt.sendKeys("1000");	
des.sendKeys(Keys.TAB);
WebElement vt= jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//SELECT[@id='ctl00_cPH_rptRecord_ctl00_ddVATRate']")));
vt.click();
Select dropdown1 = new Select(vt);
dropdown1.selectByVisibleText("Standard Rate");
         Thread.sleep(3000);//updated data from 3000 to 1000
m_Driver.findElement(By.xpath("//*[@id='tableID']/tbody/tr[1]/td[14]/span")).click();
Thread.sleep(1000);
WebElement elem3=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/span/span/span[1]/input")));
elem3.sendKeys(ste);
WebElement elem4=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/span/span/span[1]/input")));
elem4.sendKeys(Keys.ENTER);
Thread.sleep(3000);//change from 5000 to 1000
String vattype=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_ddVATRate']//option[@selected='selected']")).getText();
System.out.println("Refreshed Vat Type:=" +vattype);
WebElement save=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cpHeaderRight_btnSave']")));
jsExec.executeScript("arguments[0].click()", save);
Thread.sleep(1000);

WebElement s=m_Driver.findElement(By.xpath("html/body/form/main/div[11]/div[3]/div/div[1]/div"));
String transnno1=s.getText();
String arr[]=transnno1.split(" ");

String stn=arr[2];
krno2=stn.substring(1);

System.out.println("Transaction number is"    +krno2);
/*Click on Back Button*/
m_Driver.findElement(By.xpath("//*[@id='ctl00_cpHeaderRight_btnCancel']")).click();
pages.new_bank_trans.src_Trans_num _t=new pages.new_bank_trans.src_Trans_num(m_Driver);
_t.Select_Sbnk_act("Bank_st");
	_t.Select_Search_category("Transaction No");
			_t.Enter_Enter_code(krno2);
	_t.Click_Update_btn();
    }
       }
	 	}
      
      public void Flaterate_scheme_spent() throws Exception
	 	{
	    fis = new FileInputStream("D:\\testdata07oct.xlsx");
	   wb = WorkbookFactory.create(fis);
     sht = wb.getSheet("51ledgercode");
    iRowNum = sht.getLastRowNum();
     System.out.println("Excel data :"+iRowNum);
      arr=new String[iRowNum];
      for(int j=1; j<=iRowNum; j++)
	       {
	       String ste=sht.getRow(j).getCell(1).toString();
	      System.out.println("LedgerCode :" +ste);
	      if(j!=0)
	      {
		jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//*[@id='ctl00_divMainContent']/header/div/div[2]/a")));
		jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//A[contains(text(),'New Transaction')]")));
	    
		WebElement elem2=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_ddlAccount']")); 
      Select bnkdropdown2 = new Select(elem2);
      bnkdropdown2.selectByVisibleText("AA@Ashiv");
      elem2.sendKeys(Keys.TAB);
	    
          WebElement date=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDate']")));
      	date.sendKeys("05/11/2021");
      	date.sendKeys(Keys.TAB);
      	Thread.sleep(2000);
	WebElement des=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDescription']")));
	des.sendKeys("oct10"+j+"spnt");

	des=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDescription']")));
	des.sendKeys(Keys.TAB);
	des.sendKeys(Keys.TAB);
		WebElement spentamt=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtAmount']")));
		spentamt.sendKeys("1000");	
des.sendKeys(Keys.TAB);
WebElement vt= jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//SELECT[@id='ctl00_cPH_rptRecord_ctl00_ddVATRate']")));
vt.click();
Select dropdown1 = new Select(vt);
dropdown1.selectByVisibleText("Reduced Rate");
           Thread.sleep(3000);//updated data from 3000 to 1000
m_Driver.findElement(By.xpath("//*[@id='tableID']/tbody/tr[1]/td[14]/span")).click();
Thread.sleep(1000);
WebElement elem3=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/span/span/span[1]/input")));
elem3.sendKeys(ste);
WebElement elem4=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/span/span/span[1]/input")));
elem4.sendKeys(Keys.ENTER);
Thread.sleep(3000);//change from 5000 to 1000
String vattype=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_ddVATRate']//option[@selected='selected']")).getText();
System.out.println("Refreshed Vat Type:=" +vattype);
WebElement save=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cpHeaderRight_btnSave']")));
jsExec.executeScript("arguments[0].click()", save);
Thread.sleep(1000);

WebElement s=m_Driver.findElement(By.xpath("html/body/form/main/div[11]/div[3]/div/div[1]/div"));
String transnno1=s.getText();
String arr[]=transnno1.split(" ");

String stn=arr[2];
krno2=stn.substring(1);

System.out.println("Transaction number is"    +krno2);
/*Click on Back Button*/
m_Driver.findElement(By.xpath("//*[@id='ctl00_cpHeaderRight_btnCancel']")).click();
pages.new_bank_trans.src_Trans_num _t=new pages.new_bank_trans.src_Trans_num(m_Driver);
_t.Select_Sbnk_act("AA@Ashiv");
		_t.Select_Search_category("Transaction No");
				_t.Enter_Enter_code(krno2);
		_t.Click_Update_btn();
      }
	       }
      
	 	}
      
      
      public void novat_scheme_NoVAT_spent() throws Exception
	 	{
    	  fis = new FileInputStream("D:\\testdata07oct.xlsx");
	 	   wb = WorkbookFactory.create(fis);
	       sht = wb.getSheet("51ledgercode");
	      iRowNum = sht.getLastRowNum();
	       System.out.println("Excel data :"+iRowNum);
	        arr=new String[iRowNum];
	        for(int j=1; j<=iRowNum; j++)
		       {
		       String ste=sht.getRow(j).getCell(1).toString();
		      System.out.println("LedgerCode :" +ste);
		      if(j!=0)
		      {
			jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//*[@id='ctl00_divMainContent']/header/div/div[2]/a")));
	 		jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//A[contains(text(),'New Transaction')]")));
		    
			WebElement elem2=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_ddlAccount']")); 
	        Select bnkdropdown2 = new Select(elem2);
	        bnkdropdown2.selectByVisibleText("Bank_novat");
	        elem2.sendKeys(Keys.TAB);
		    
	            WebElement date=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDate']")));
	        	date.sendKeys("05/11/2021");
	        	date.sendKeys(Keys.TAB);
	        	Thread.sleep(2000);
		WebElement des=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDescription']")));
		des.sendKeys("oct10"+j+"nvtspt");
		des=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDescription']")));
		des.sendKeys(Keys.TAB);
			WebElement spamt=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtAmount']")));
			spamt.sendKeys("1000");	
	Thread.sleep(1000);
	spamt.sendKeys(Keys.TAB);
	spamt.sendKeys(Keys.TAB);
	Thread.sleep(1000);
	m_Driver.findElement(By.xpath("//*[@id='tableID']/tbody/tr[1]/td[12]/span")).click();
			Thread.sleep(1000);
WebElement elem3=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/span/span/span[1]/input")));
	elem3.sendKeys(ste);
	//Thread.sleep(4000);
	WebElement elem4=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/span/span/span[1]/input")));
	elem4.sendKeys(Keys.ENTER);
	Thread.sleep(1000);//change from 5000 to 1000
	WebElement save=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cpHeaderRight_btnSave']")));
	jsExec.executeScript("arguments[0].click()", save);
	Thread.sleep(1000);

	WebElement s=m_Driver.findElement(By.xpath("html/body/form/main/div[11]/div[3]/div/div[1]/div"));
	String transnno1=s.getText();
	String arr[]=transnno1.split(" ");

	String stn=arr[2];
	 krno2=stn.substring(1);

	System.out.println("Transaction number is"    +krno2);
	/*Click on Back Button*/
	m_Driver.findElement(By.xpath("//*[@id='ctl00_cpHeaderRight_btnCancel']")).click();
	pages.new_bank_trans.src_Trans_num _t=new pages.new_bank_trans.src_Trans_num(m_Driver);
	_t.Select_Sbnk_act("Bank_novat");
			_t.Select_Search_category("Transaction No");
					_t.Enter_Enter_code(krno2);
			_t.Click_Update_btn();
			utilities.PassScreenshot.Getscreenshot11("nubank", "Banktransaction");
			System.out.println("shot taken");
	
	
	 	}
		       }
	
	
		       }
}
	
	
	
