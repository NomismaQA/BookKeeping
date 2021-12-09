package pages.banking.ashiv;

import pages.BankNewTransaction;
import pages.BasePage;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.IOException;
import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.CaptureScreenshot;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.Screenshotcapture;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.GetScreenShot;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/f59d1014-1ec5-4112-8d33-cc23ff5dcfdd
@TestModellerModule(guid = "f59d1014-1ec5-4112-8d33-cc23ff5dcfdd")
public class Search_Find extends BasePage
{
	public Search_Find (WebDriver driver)
	{
		super(driver);
	}


	
	private By Clickon_search_icon1Elem = By.xpath("//*[@id='fasearchicon']");

	private By SearchInvoiceNo2Elem = By.xpath("//label[normalize-space()= 'Reference']/../../div[2]/input");

	private By Search_Amount3Elem = By.xpath("//*[@id='ctl00_cPH_txtAmount']");

	private By Search_DateFrom4Elem = By.xpath("//*[@id='ctl00_cPH_txtDateFrom']");

	private By Search_DateTo5Elem = By.xpath("//*[@id='ctl00_cPH_txtDateTo']");

	private By Search_btn_click6Elem = By.xpath("//label[normalize-space()= '']/../../div[2]/a");

	private By message_Footer_Difference7Elem = By.xpath("//INPUT[@name='ctl00$cphFooter$hdnDifference']");


	
	public void GoToUrl()
	{
		m_Driver.get("https://nomisma.cloud.testinsights.io/app/#!/test-modeller/101048");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://nomisma.cloud.testinsights.io/app/#!/test-modeller/101048");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://nomisma.cloud.testinsights.io/app/#!/test-modeller/101048");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "https://nomisma.cloud.testinsights.io/app/#!/test-modeller/101048";

        if (!currentUrl.equals("https://nomisma.cloud.testinsights.io/app/#!/test-modeller/101048")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click Clickon_search_icon1
     * @name Click Clickon_search_icon1
     */
	public void Click_Clickon_search_icon1()
	{
        
		WebElement elem = getWebElement(Clickon_search_icon1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Clickon_search_icon1", "Click_Clickon_search_icon1 failed. Unable to locate object: " + Clickon_search_icon1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Clickon_search_icon1", "Click_Clickon_search_icon1 failed. Unable to locate object: " + Clickon_search_icon1Elem.toString());

			Assert.fail("Unable to locate object: " + Clickon_search_icon1Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Clickon_search_icon1");

		TestModellerLogger.PassStep(m_Driver, "Click_Clickon_search_icon1");
	}

      
	/**
 	 * Enter Search-InvoiceNo2
     * @name Enter Search-InvoiceNo2
     */
 	public void Enter_SearchInvoiceNo2(String SearchInvoiceNo2)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(SearchInvoiceNo2Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_SearchInvoiceNo2", "Enter_SearchInvoiceNo2 failed. Unable to locate object: " + SearchInvoiceNo2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_SearchInvoiceNo2", "Enter_SearchInvoiceNo2 failed. Unable to locate object: " + SearchInvoiceNo2Elem.toString());

 			Assert.fail("Unable to locate object: " + SearchInvoiceNo2Elem.toString());
         }

 		elem.sendKeys(SearchInvoiceNo2);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_SearchInvoiceNo2 " + SearchInvoiceNo2);

  		TestModellerLogger.PassStep(m_Driver, "Enter_SearchInvoiceNo2 " + SearchInvoiceNo2);
 	}

      
	/**
 	 * Enter Search_Amount3
	 * @throws InterruptedException 
	 * @throws IOException 
     * @name Enter Search_Amount3
     */
 	public void Enter_Search_Amount3(String Search_Amount3) throws InterruptedException, IOException
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Search_Amount3Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Search_Amount3", "Enter_Search_Amount3 failed. Unable to locate object: " + Search_Amount3Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Search_Amount3", "Enter_Search_Amount3 failed. Unable to locate object: " + Search_Amount3Elem.toString());

 			Assert.fail("Unable to locate object: " + Search_Amount3Elem.toString());
         }
Thread.sleep(2000);
 		elem.sendKeys(Search_Amount3);
 		
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Search_Amount3 " + Search_Amount3);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Search_Amount3 " + Search_Amount3);
 	}

 	public void Clear()
 	
 	{
 		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div[2]/div/div/div[2]/iframe")));
 	
 		for(int i=0;i<=3;i++)
 		{
			m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_txtAmount']")).sendKeys(Keys.BACK_SPACE);
 		}
 		
 		m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_txtAmount']")).sendKeys("");
 		}
 	
 	public void Enter_Search_Amount4(String Search_Amount4) throws IOException
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Search_Amount3Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Search_Amount3", "Enter_Search_Amount3 failed. Unable to locate object: " + Search_Amount3Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Search_Amount3", "Enter_Search_Amount3 failed. Unable to locate object: " + Search_Amount3Elem.toString());

 			Assert.fail("Unable to locate object: " + Search_Amount3Elem.toString());
         }
 		for(int i=0;i<=3;i++)
 		{
			m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_txtAmount']")).sendKeys(Keys.BACK_SPACE);
 		}
 		elem.sendKeys(Search_Amount4);
 		
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Search_Amount4 " + Search_Amount4);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Search_Amount4 " + Search_Amount4);
      
 	}
 	
	public void Enter_Search_Amount5(String Search_Amount5)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Search_Amount3Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Search_Amount3", "Enter_Search_Amount3 failed. Unable to locate object: " + Search_Amount3Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Search_Amount3", "Enter_Search_Amount3 failed. Unable to locate object: " + Search_Amount3Elem.toString());

 			Assert.fail("Unable to locate object: " + Search_Amount3Elem.toString());
         }
 		for(int i=0;i<=3;i++)
 		{
			m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_txtAmount']")).sendKeys(Keys.BACK_SPACE);
 		}
 		elem.sendKeys(Search_Amount5);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Search_Amount5 " + Search_Amount5);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Search_Amount5 " + Search_Amount5);
      
 	}
 
	/**
 	 * Enter Search_DateFrom4
     * @name Enter Search_DateFrom4
     */
 	public void Enter_Search_DateFrom4(String Search_DateFrom4)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Search_DateFrom4Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Search_DateFrom4", "Enter_Search_DateFrom4 failed. Unable to locate object: " + Search_DateFrom4Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Search_DateFrom4", "Enter_Search_DateFrom4 failed. Unable to locate object: " + Search_DateFrom4Elem.toString());

 			Assert.fail("Unable to locate object: " + Search_DateFrom4Elem.toString());
         }

 	String	InvDate1=Search_DateFrom4;
 		System.out.println(InvDate1);
 		//elem.clear();
		for(int i=0;i<=9;i++)
 		{
			m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_txtDateFrom']")).sendKeys(Keys.BACK_SPACE);
 		}
 	
 		elem.sendKeys(Search_DateFrom4);
 		elem.sendKeys(Keys.TAB);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Search_DateFrom4 " + Search_DateFrom4);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Search_DateFrom4 " + Search_DateFrom4);
 	}

      
	/**
 	 * Enter Search_DateTo5
     * @name Enter Search_DateTo5
     */
 	public void Enter_Search_DateTo5(String Search_DateTo5)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Search_DateTo5Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Search_DateTo5", "Enter_Search_DateTo5 failed. Unable to locate object: " + Search_DateTo5Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Search_DateTo5", "Enter_Search_DateTo5 failed. Unable to locate object: " + Search_DateTo5Elem.toString());

 			Assert.fail("Unable to locate object: " + Search_DateTo5Elem.toString());
         }
 		String	InvDate1=Search_DateTo5;
 		System.out.println(InvDate1);
 		//elem.clear();
		for(int i=0;i<=9;i++)
 		{
			m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_txtDateTo']")).sendKeys(Keys.BACK_SPACE);
 		}
 	
 		elem.sendKeys(Search_DateTo5);
 		elem.sendKeys(Keys.TAB);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Search_DateTo5 " + Search_DateTo5);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Search_DateTo5 " + Search_DateTo5);
 	}

     
	/**
 	 * Click Search_btn_click6
     * @name Click Search_btn_click6
     */
	public void Click_Search_btn_click6()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div[2]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(Search_btn_click6Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Search_btn_click6", "Click_Search_btn_click6 failed. Unable to locate object: " + Search_btn_click6Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Search_btn_click6", "Click_Search_btn_click6 failed. Unable to locate object: " + Search_btn_click6Elem.toString());

			Assert.fail("Unable to locate object: " + Search_btn_click6Elem.toString());
        }

		elem.click();
		
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_Search_btn_click6");

		TestModellerLogger.PassStep(m_Driver, "Click_Search_btn_click6");
	}
	
	public void Select_Invoice(String Data) throws InterruptedException, HeadlessException, IOException, AWTException

	{
 
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div[2]/div/div/div[2]/iframe")));

		String Out="";
        List<WebElement>list2=m_Driver.findElements(By.xpath("//*[@id='ctl00_cPH_UpdatePanel1']/div[2]/div/div/div/div/table/tbody[2]/tr/td[4]"));
       int size1=  list2.size();
         for(int i=0;i<size1;i++)
         {
         String D=list2.get(i).getText();
               Out=Out+"_"+D;
               
         }
        
         
         String[]a=Out.trim().split("_");
         
         List<WebElement>list =m_Driver.findElements(By.xpath("//*[@id='ctl00_cPH_UpdatePanel1']/div[2]/div/div/div/div/table/tbody[2]/tr/td[1]"));
int size=list.size();
for(int i=0;i<size;i++)
{
	List<WebElement>list3=m_Driver.findElements(By.xpath("//*[@id='ctl00_cPH_UpdatePanel1']/div[2]/div/div/div/div/table/tbody[2]/tr/td[1]"));
	WebElement ele=list3.get(i);
	ele.click();
	int b=i+1;
	String d=a[b];
	String c=d.replaceAll(" ", "");
	if(Data.equals(c))
	{
		List<WebElement>list4=m_Driver.findElements(By.xpath("//*[@id='ctl00_cPH_UpdatePanel1']/div[2]/div/div/div/div/table/tbody[2]/tr/td[1]"));
		WebElement ele2=list4.get(i);
		ele2.click();
	}
}
 		
       

 		WebElement ReconBtn=m_Driver.findElement(By.xpath("//*[@id='ctl00_cphFooter_btnReconcile']"));
 		  jsExec.executeScript("arguments[0].scrollIntoView();", ReconBtn);
 		 String BankAmount=m_Driver.findElement(By.xpath("//*[@id='ctl00_cphFooter_UpdatePanel2']")).getText();
         
  		System.out.println("Total Invoice Trns="+BankAmount);
 		  Thread.sleep(3000);
 		 utilities.Screenshotcapture.Getscreenshot("FullAmt", "BankAmt_InvoiceAmt_Due");
 	     ReconBtn.click();
 	     System.out.println("Click on ReconBtn");
 	     
		m_Driver.switchTo().defaultContent();
		
		Thread.sleep(3000);
		m_Driver.findElement(By.xpath("//*[@id='ctl00_cPHFilter_LinkButtonEx1']")).click();
		Thread.sleep(2000);
		
		
		m_Driver.findElement(By.xpath("//*[@id='ctl00_SideMenu1_bankingMenu']/a/span")).click();
		//m_Driver.findElement(By.xpath("//*[@id='ctl00_cPHFilter_btnSearch']")).click();
//		String Received=m_Driver.findElement(By.xpath("//*[@id='myTable']/tbody/tr[2]/td[5]")).getText();
//		System.out.println("Received Amount = "+Received);
//		String Spent=m_Driver.findElement(By.xpath("//*[@id='myTable']/tbody/tr[3]/td[6]")).getText();
//		System.out.println("Spent Amount = "+Spent);
	//	WebElement SelectTns=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPHFilter_dd_Search']"));
	//	Select dropdown4 = new Select(SelectTns);

 	//	dropdown4.selectByVisibleText("Transaction No");
 	//	WebElement TnsNo=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPHFilter_txtSearch']"));
 	//	int i=Integer.parseInt(tnno);
 	//	int k=i+1;
 	//	String s=Integer.toString(k);
 	//	System.out.println("Trns No ="+s);
 	//	TnsNo.sendKeys(s);
 //		m_Driver.findElement(By.xpath("//*[@id='ctl00_cPHFilter_btnSearch']")).click();
// 	String Info=	m_Driver.findElement(By.xpath("//*[@id='myTable']/tbody/tr[2]")).getText();
// 	System.out.println(Info);
 
 //	m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrDisplayRecords_ctl01_LnkTranDetail']")).click();
 	//Screenshotcapture.captureAsImage(m_Driver, "BankTrnsInfo1");
 	 utilities.Screenshotcapture.Getscreenshot("FullAmt", "Banktrns");
	Thread.sleep(2000);
//	m_Driver.findElement(By.xpath("//*[@id='EditPopUpClose']/span")).click();
//	Thread.sleep(2000);
	m_Driver.findElement(By.xpath("//*[@id='ctl00_cPHFilter_btnExportToExcel']/i")).click();
	
 		Thread.sleep(4000);
		
		

 		
  		
 	}
	
	public void Select_Invoicepartial(String Data) throws InterruptedException, HeadlessException, IOException, AWTException

	{
 	
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div[2]/div/div/div[2]/iframe")));

		String Out="";
        List<WebElement>list2=m_Driver.findElements(By.xpath("//*[@id='ctl00_cPH_UpdatePanel1']/div[2]/div/div/div/div/table/tbody[2]/tr/td[4]"));
       int size1=  list2.size();
         for(int i=0;i<size1;i++)
         {
         String D=list2.get(i).getText();
               Out=Out+"_"+D;
               
         }
        
         
         String[]a=Out.trim().split("_");
         
         List<WebElement>list =m_Driver.findElements(By.xpath("//*[@id='ctl00_cPH_UpdatePanel1']/div[2]/div/div/div/div/table/tbody[2]/tr/td[1]"));
int size=list.size();
for(int i=0;i<size;i++)
{
	List<WebElement>list3=m_Driver.findElements(By.xpath("//*[@id='ctl00_cPH_UpdatePanel1']/div[2]/div/div/div/div/table/tbody[2]/tr/td[1]"));
	WebElement ele=list3.get(i);
	ele.click();
	int b=i+1;
	String d=a[b];
	String c=d.replaceAll(" ", "");
	if(Data.equals(c))
	{
		List<WebElement>list4=m_Driver.findElements(By.xpath("//*[@id='ctl00_cPH_UpdatePanel1']/div[2]/div/div/div/div/table/tbody[2]/tr/td[1]"));
		WebElement ele2=list4.get(i);
		ele2.click();
	}
}
 		
       

        
 		
 		   WebElement ReconBtn=m_Driver.findElement(By.xpath("//*[@id='ctl00_cphFooter_btnReconcile']"));
 		  jsExec.executeScript("arguments[0].scrollIntoView();", ReconBtn);
 		  
 		   WebElement SelcectPartial=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_ddReconcileType']"));
           
 	       	Select dropdown = new Select(SelcectPartial);

 	 		dropdown.selectByVisibleText("Partial Reconcile");
 	 		System.out.println("Select Partial Reconcile");
 		  
 		 String BankAmount=m_Driver.findElement(By.xpath("//*[@id='ctl00_cphFooter_UpdatePanel2']")).getText();
         
  		System.out.println("Total Invoice Trns="+BankAmount);
 		  Thread.sleep(3000);
 		 utilities.Screenshotcapture.Getscreenshot("Partial", "BankAmt_InvoiceAmt_Due");
 		 
 	     ReconBtn.click();
 	     System.out.println("Click on ReconBtn");
 	     
		m_Driver.switchTo().defaultContent();
		
		Thread.sleep(3000);
		m_Driver.findElement(By.xpath("//*[@id='ctl00_cPHFilter_LinkButtonEx1']")).click();
		Thread.sleep(2000);
		Fill_Bank_tran ob=new Fill_Bank_tran(m_Driver);
		String tnno=ob.OutInvP();
		
		m_Driver.findElement(By.xpath("//*[@id='ctl00_SideMenu1_bankingMenu']/a/span")).click();
		//m_Driver.findElement(By.xpath("//*[@id='ctl00_cPHFilter_btnSearch']")).click();
//		String Received=m_Driver.findElement(By.xpath("//*[@id='myTable']/tbody/tr[2]/td[5]")).getText();
//		System.out.println("Received Amount = "+Received);
//		String Spent=m_Driver.findElement(By.xpath("//*[@id='myTable']/tbody/tr[3]/td[6]")).getText();
//		System.out.println("Spent Amount = "+Spent);
//		WebElement SelectTns=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPHFilter_dd_Search']"));
//		Select dropdown4 = new Select(SelectTns);
//
// 		dropdown4.selectByVisibleText("Transaction No");
// 		WebElement TnsNo=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPHFilter_txtSearch']"));
// 		int i=Integer.parseInt(tnno);
// 		int k=i+1;
// 		String s=Integer.toString(k);
// 		System.out.println("Trns No ="+s);
// 		TnsNo.sendKeys(s);
// 		m_Driver.findElement(By.xpath("//*[@id='ctl00_cPHFilter_btnSearch']")).click();
// 		String Info=	m_Driver.findElement(By.xpath("//*[@id='myTable']/tbody/tr[2]")).getText();
// 	 	System.out.println(Info);
 	 	
// 	 	m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrDisplayRecords_ctl01_LnkTranDetail']")).click();
 	 	utilities.Screenshotcapture.Getscreenshot("Partial", "Banktrns");
 	 //	GetScreenShot.captureAsImage(m_Driver, "BankTrnsInfo2");
 //	 	Thread.sleep(2000);
 //		m_Driver.findElement(By.xpath("//*[@id='EditPopUpClose']/span")).click();
 		Thread.sleep(2000);
 		m_Driver.findElement(By.xpath("//*[@id='ctl00_cPHFilter_btnExportToExcel']/i")).click();
 		Thread.sleep(4000);
		

 		
  		
 	}
	
	public void Select_InvoiceCrPar() throws InterruptedException, HeadlessException, IOException, AWTException

	{
 	
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div[2]/div/div/div[2]/iframe")));
		Thread.sleep(2000);

        WebElement ele =m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrFindMatch_ctl00_chkSelect']"));


          ele.click();
	
	
	
	

 		
        

 		WebElement ReconBtn=m_Driver.findElement(By.xpath("//*[@id='ctl00_cphFooter_btnReconcile']"));
 		  jsExec.executeScript("arguments[0].scrollIntoView();", ReconBtn);
 		  
 		 WebElement SelcectPartial=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_ddReconcileType']"));
         
	       	Select dropdown = new Select(SelcectPartial);

	 		dropdown.selectByVisibleText("Partial Reconcile");
	 		System.out.println("Select Partial Reconcile");
 		 String BankAmount=m_Driver.findElement(By.xpath("//*[@id='ctl00_cphFooter_UpdatePanel2']")).getText();
         
  		System.out.println("Total CR Trns="+BankAmount);
 		  Thread.sleep(3000);
 		 utilities.Screenshotcapture.Getscreenshot("Partial2", "BankAmt_InvoiceAmt_Due");
 		
 	     ReconBtn.click();
 	     System.out.println("Click on ReconBtn");
 	     
		m_Driver.switchTo().defaultContent();
		
		Thread.sleep(3000);
		m_Driver.findElement(By.xpath("//*[@id='ctl00_cPHFilter_LinkButtonEx1']")).click();
		
		Thread.sleep(2000);
		Fill_Bank_tran ob=new Fill_Bank_tran(m_Driver);
		String tnno=ob.OutInvPCr();
		
		m_Driver.findElement(By.xpath("//*[@id='ctl00_SideMenu1_bankingMenu']/a/span")).click();
	//	m_Driver.findElement(By.xpath("//*[@id='ctl00_cPHFilter_btnSearch']")).click();
//		String Received=m_Driver.findElement(By.xpath("//*[@id='myTable']/tbody/tr[2]/td[5]")).getText();
//		System.out.println("Received Amount = "+Received);
//		String Spent=m_Driver.findElement(By.xpath("//*[@id='myTable']/tbody/tr[3]/td[6]")).getText();
//		System.out.println("Spent Amount = "+Spent);
//		WebElement SelectTns=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPHFilter_dd_Search']"));
//		Select dropdown4 = new Select(SelectTns);
//
// 		dropdown4.selectByVisibleText("Transaction No");
// 		WebElement TnsNo=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPHFilter_txtSearch']"));
// 		int i=Integer.parseInt(tnno);
// 		int k=i+1;
// 		String s=Integer.toString(k);
// 		System.out.println("Trns No ="+s);
// 		TnsNo.sendKeys(s);
// 		m_Driver.findElement(By.xpath("//*[@id='ctl00_cPHFilter_btnSearch']")).click();
// 		String Info=	m_Driver.findElement(By.xpath("//*[@id='myTable']/tbody/tr[2]")).getText();
// 	 	System.out.println(Info);
// 	 	
 	// 	m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrDisplayRecords_ctl01_LnkTranDetail']")).click();
 		utilities.Screenshotcapture.Getscreenshot("Partial1", "Banktrns");
 	 //	GetScreenShot.captureAsImage(m_Driver, "BankTrnsInfo3");
 	 	Thread.sleep(2000);
 //		m_Driver.findElement(By.xpath("//*[@id='EditPopUpClose']/span")).click();
 //		Thread.sleep(2000);
 		m_Driver.findElement(By.xpath("//*[@id='ctl00_cPHFilter_btnExportToExcel']/i")).click();
 		Thread.sleep(4000);
		
		

 		
  		
 	}
	
	public void Select_InvoiceCr() throws InterruptedException, HeadlessException, IOException, AWTException

	{
 	
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div[2]/div/div/div[2]/iframe")));
		Thread.sleep(2000);

        WebElement ele =m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrFindMatch_ctl00_chkSelect']"));


          ele.click();
	
	
	
	

 		
        

 		WebElement ReconBtn=m_Driver.findElement(By.xpath("//*[@id='ctl00_cphFooter_btnReconcile']"));
 		  jsExec.executeScript("arguments[0].scrollIntoView();", ReconBtn);
 		  
 		 String BankAmount=m_Driver.findElement(By.xpath("//*[@id='ctl00_cphFooter_UpdatePanel2']")).getText();
         
  		System.out.println("Total CR Trns="+BankAmount);
 		  Thread.sleep(3000);
 		 utilities.Screenshotcapture.Getscreenshot("Fullamt2", "BankAmt_InvoiceAmt_Due");
 		
 	     ReconBtn.click();
 	     System.out.println("Click on ReconBtn");
 	     
		m_Driver.switchTo().defaultContent();
		
		Thread.sleep(3000);
		m_Driver.findElement(By.xpath("//*[@id='ctl00_cPHFilter_LinkButtonEx1']")).click();
		
	
		Thread.sleep(2000);
		Fill_Bank_tran ob=new Fill_Bank_tran(m_Driver);
		String tnno=ob.OutInvCr();
		
		m_Driver.findElement(By.xpath("//*[@id='ctl00_SideMenu1_bankingMenu']/a/span")).click();
		//m_Driver.findElement(By.xpath("//*[@id='ctl00_cPHFilter_btnSearch']")).click();
//		String Received=m_Driver.findElement(By.xpath("//*[@id='myTable']/tbody/tr[2]/td[5]")).getText();
//		System.out.println("Received Amount = "+Received);
//		String Spent=m_Driver.findElement(By.xpath("//*[@id='myTable']/tbody/tr[3]/td[6]")).getText();
//		System.out.println("Spent Amount = "+Spent);
//		WebElement SelectTns=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPHFilter_dd_Search']"));
//		Select dropdown4 = new Select(SelectTns);
//
// 		dropdown4.selectByVisibleText("Transaction No");
 		//WebElement TnsNo=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPHFilter_txtSearch']"));
// 		int i=Integer.parseInt(tnno);
// 		int k=i+1;
// 		String s=Integer.toString(k);
// 		System.out.println("Trns No ="+s);
// 		TnsNo.sendKeys(s);
 //		m_Driver.findElement(By.xpath("//*[@id='ctl00_cPHFilter_btnSearch']")).click();
// 		String Info=	m_Driver.findElement(By.xpath("//*[@id='myTable']/tbody/tr[2]")).getText();
// 	 	System.out.println(Info);
 	 
 //	 	m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrDisplayRecords_ctl01_LnkTranDetail']")).click();
 		utilities.Screenshotcapture.Getscreenshot("FullAmt1", "Banktrns");
 	 	//GetScreenShot.captureAsImage(m_Driver, "BankTrnsInfo4");
 		Thread.sleep(2000);
 //		m_Driver.findElement(By.xpath("//*[@id='EditPopUpClose']/span")).click();
 		Thread.sleep(2000);
 		m_Driver.findElement(By.xpath("//*[@id='ctl00_cPHFilter_btnExportToExcel']/i")).click();
 		Thread.sleep(4000);
		
		
		

 		
  		
 	}
	
	public void Select_Invoicejou(String Data) throws InterruptedException, HeadlessException, IOException, AWTException

	{
 	
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div[2]/div/div/div[2]/iframe")));

		String Out="";
        List<WebElement>list2=m_Driver.findElements(By.xpath("//*[@id='ctl00_cPH_UpdatePanel1']/div[2]/div/div/div/div/table/tbody[2]/tr/td[4]"));
       int size1=  list2.size();
         for(int i=0;i<size1;i++)
         {
         String D=list2.get(i).getText();
               Out=Out+"_"+D;
               
         }
        
         
         String[]a=Out.trim().split("_");
         
         List<WebElement>list =m_Driver.findElements(By.xpath("//*[@id='ctl00_cPH_UpdatePanel1']/div[2]/div/div/div/div/table/tbody[2]/tr/td[1]"));
int size=list.size();
for(int i=0;i<size;i++)
{
	List<WebElement>list3=m_Driver.findElements(By.xpath("//*[@id='ctl00_cPH_UpdatePanel1']/div[2]/div/div/div/div/table/tbody[2]/tr/td[1]"));
	WebElement ele=list3.get(i);
	ele.click();
	int b=i+1;
	String d=a[b];
	String c=d.replaceAll(" ", "");
	if(Data.equals(c))
	{
		List<WebElement>list4=m_Driver.findElements(By.xpath("//*[@id='ctl00_cPH_UpdatePanel1']/div[2]/div/div/div/div/table/tbody[2]/tr/td[1]"));
		WebElement ele2=list4.get(i);
		ele2.click();
	}
}
 		
       

        
 		
 		
 		  
 		   WebElement SelcectPartial=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_ddReconcileType']"));
 		  jsExec.executeScript("arguments[0].scrollIntoView();", SelcectPartial);
 	       	Select dropdown = new Select(SelcectPartial);

 	 		dropdown.selectByVisibleText("Reconcile with Journal Entry");
 	 		
 	 		System.out.println("Select = Reconcile with Journal Entry");
 	 		
 	 		 WebElement Account=m_Driver.findElement(By.xpath("//*[@id='S-ctl00_cPH_ltAccount']"));
 	 		 jsExec.executeScript("arguments[0].scrollIntoView();", Account);
  	       	Select dropdown1 = new Select(Account);

  	 		dropdown1.selectByVisibleText("Invoices_001 - 1070");
 	 		
 		  
 		 String BankAmount=m_Driver.findElement(By.xpath("//*[@id='ctl00_cphFooter_UpdatePanel2']")).getText();
 		   WebElement ReconBtn=m_Driver.findElement(By.xpath("//*[@id='ctl00_cphFooter_btnReconcile']"));
  		  jsExec.executeScript("arguments[0].scrollIntoView();", ReconBtn);
  		  
  		System.out.println("Total Journal Invoice Trns="+BankAmount);
  		
 		  Thread.sleep(3000);
 		 utilities.Screenshotcapture.Getscreenshot("Journal", "BankAmt_InvoiceAmt_Due");
 		 
 	     ReconBtn.click();
 	     
 	     System.out.println("Click on ReconBtn");
 	     
		m_Driver.switchTo().defaultContent();
		
		Thread.sleep(3000);
		m_Driver.findElement(By.xpath("//*[@id='ctl00_cPHFilter_LinkButtonEx1']")).click();
		Thread.sleep(2000);
		Fill_Bank_tran ob=new Fill_Bank_tran(m_Driver);
		String tnno=ob.OutInvJou();
		
		m_Driver.findElement(By.xpath("//*[@id='ctl00_SideMenu1_bankingMenu']/a/span")).click();
		//m_Driver.findElement(By.xpath("//*[@id='ctl00_cPHFilter_btnSearch']")).click();
//		String Received=m_Driver.findElement(By.xpath("//*[@id='myTable']/tbody/tr[2]/td[5]")).getText();
//		System.out.println("Received Amount = "+Received);
//		String Spent=m_Driver.findElement(By.xpath("//*[@id='myTable']/tbody/tr[3]/td[6]")).getText();
//		System.out.println("Spent Amount = "+Spent);
//		WebElement SelectTns=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPHFilter_dd_Search']"));
//		Select dropdown4 = new Select(SelectTns);
//
// 		dropdown4.selectByVisibleText("Transaction No");
// 		WebElement TnsNo=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPHFilter_txtSearch']"));
// 		int i=Integer.parseInt(tnno);
// 		int k=i+1;
// 		String s=Integer.toString(k);
// 		System.out.println("Trns No ="+s);
// 		TnsNo.sendKeys(s);
 //		m_Driver.findElement(By.xpath("//*[@id='ctl00_cPHFilter_btnSearch']")).click();
 //		String Info=	m_Driver.findElement(By.xpath("//*[@id='myTable']/tbody/tr[2]")).getText();
// 	 	System.out.println(Info);
 	 	
 //	 	m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrDisplayRecords_ctl01_LnkTranDetail']")).click();
 	 	utilities.Screenshotcapture.Getscreenshot("Journal", "Banktns");
 	 	//GetScreenShot.captureAsImage(m_Driver, "BankTrnsInfo5");
 		Thread.sleep(2000);
 //		m_Driver.findElement(By.xpath("//*[@id='EditPopUpClose']/span")).click();
 //		Thread.sleep(2000);
 		m_Driver.findElement(By.xpath("//*[@id='ctl00_cPHFilter_btnExportToExcel']/i")).click();
 		Thread.sleep(4000);
		

 		
  		
 	}
	public void Select_InvoiceCrJou() throws InterruptedException, HeadlessException, IOException, AWTException

	{
 	
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div[2]/div/div/div[2]/iframe")));
		Thread.sleep(2000);

        WebElement ele =m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrFindMatch_ctl00_chkSelect']"));
      //*[@id="ctl00_cPH_rptrFindMatch_ctl01_chkSelect"]


          ele.click();
	
	
	
	

 		
        

 	
 		 Thread.sleep(2000);
 		 WebElement SelcectPartial=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_ddReconcileType']"));
 		  jsExec.executeScript("arguments[0].scrollIntoView();", SelcectPartial);
	       	Select dropdown = new Select(SelcectPartial);

	 		dropdown.selectByVisibleText("Reconcile with Journal Entry");
	 		System.out.println("Select = Reconcile with Journal Entry");
	 		 WebElement Account=m_Driver.findElement(By.xpath("//*[@id='S-ctl00_cPH_ltAccount']"));
	 		 jsExec.executeScript("arguments[0].scrollIntoView();", Account);
	  	       	Select dropdown1 = new Select(Account);

	  	 		dropdown1.selectByVisibleText("Invoices_001 - 1070");
 		 String BankAmount=m_Driver.findElement(By.xpath("//*[@id='ctl00_cphFooter_UpdatePanel2']")).getText();
 		 
 		WebElement ReconBtn=m_Driver.findElement(By.xpath("//*[@id='ctl00_cphFooter_btnReconcile']"));
		  jsExec.executeScript("arguments[0].scrollIntoView();", ReconBtn);
		  
  		System.out.println("Total CR Trns="+BankAmount);
  		
 		  Thread.sleep(3000);
 		 utilities.Screenshotcapture.Getscreenshot("Journal1", "BankAmt_InvoiceAmt_Due");
 		 
 		  
 	     ReconBtn.click();
 	     System.out.println("Click on ReconBtn");
		m_Driver.switchTo().defaultContent();
		
		Thread.sleep(3000);
		m_Driver.findElement(By.xpath("//*[@id='ctl00_cPHFilter_LinkButtonEx1']")).click();
		
		Thread.sleep(2000);
		Fill_Bank_tran ob=new Fill_Bank_tran(m_Driver);
		String tnno=ob.OutInvJouCr();
		
		m_Driver.findElement(By.xpath("//*[@id='ctl00_SideMenu1_bankingMenu']/a/span")).click();
		//m_Driver.findElement(By.xpath("//*[@id='ctl00_cPHFilter_btnSearch']")).click();
//		String Received=m_Driver.findElement(By.xpath("//*[@id='myTable']/tbody/tr[2]/td[5]")).getText();
//		System.out.println("Received Amount = "+Received);
//		String Spent=m_Driver.findElement(By.xpath("//*[@id='myTable']/tbody/tr[3]/td[6]")).getText();
//		System.out.println("Spent Amount = "+Spent);
//		WebElement SelectTns=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPHFilter_dd_Search']"));
//		Select dropdown4 = new Select(SelectTns);
//
// 		dropdown4.selectByVisibleText("Transaction No");
// 		WebElement TnsNo=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPHFilter_txtSearch']"));
// 		int i=Integer.parseInt(tnno);
// 		int k=i+1;
// 		String s=Integer.toString(k);
// 		System.out.println("Trns No ="+s);
// 		TnsNo.sendKeys(s);
// 		m_Driver.findElement(By.xpath("//*[@id='ctl00_cPHFilter_btnSearch']")).click();
// 		String Info=	m_Driver.findElement(By.xpath("//*[@id='myTable']/tbody/tr[2]")).getText();
// 	 	System.out.println(Info);
 	 	
 	// 	m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrDisplayRecords_ctl01_LnkTranDetail']")).click();
 	 	utilities.Screenshotcapture.Getscreenshot("Journal1", "Banktrns");
 	 //	GetScreenShot.captureAsImage(m_Driver, "BankTrnsInfo6");
 	 	Thread.sleep(2000);
 //		m_Driver.findElement(By.xpath("//*[@id='EditPopUpClose']/span")).click();
 //		Thread.sleep(2000);
 		m_Driver.findElement(By.xpath("//*[@id='ctl00_cPHFilter_btnExportToExcel']/i")).click();
 		Thread.sleep(4000);
		
		
		
		

 		
  		
 	}
	
      
	/**
 	 * Enter message_Footer_Difference7
     * @name Enter message_Footer_Difference7
     */
 	public void Enter_message_Footer_Difference7(String message_Footer_Difference7)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(message_Footer_Difference7Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_message_Footer_Difference7", "Enter_message_Footer_Difference7 failed. Unable to locate object: " + message_Footer_Difference7Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_message_Footer_Difference7", "Enter_message_Footer_Difference7 failed. Unable to locate object: " + message_Footer_Difference7Elem.toString());

 			Assert.fail("Unable to locate object: " + message_Footer_Difference7Elem.toString());
         }

 		elem.sendKeys(message_Footer_Difference7);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_message_Footer_Difference7 " + message_Footer_Difference7);

  		TestModellerLogger.PassStep(m_Driver, "Enter_message_Footer_Difference7 " + message_Footer_Difference7);
 	}
}