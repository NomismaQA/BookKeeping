package Pages_Reconcilation_TC;

import pages.BasePage;
import pages.JournalEntry;
import pages.PartialReconciledCases.Library;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.Screenshotcapture;
import pages.JournalEntry;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/6f59ce92-7385-4e36-bcdc-94fff4539e1f
@TestModellerModule(guid = "6f59ce92-7385-4e36-bcdc-94fff4539e1f")
public class PartialReconcilationLAtestInvoice_JonralEntry extends BasePage
{
	Library s1;
	String Rpno=" ";
	public PartialReconcilationLAtestInvoice_JonralEntry (WebDriver driver)
	{
		super(driver);
		s1=new Library(m_Driver);
	}


	private By AccountType_4__8Elem = By.xpath("//SELECT[@name='ctl00$cPHFilter$ddlAccountType']");
	private By SelectALLElem = By.xpath("//INPUT[@id='ctl00_cPH_chkReconcileUngroupSelected']");

	private By ReconcileSelectedElem = By.xpath("//A[@id='ctl00_cPH_lnkReconcileSelected']");

	private By UngroupSelectedElem = By.xpath("//A[@id='ctl00_cPH_lnkUngroupSelected']");

	private By R1Elem = By.xpath("//INPUT[@id='ctl00_cPH_rptrReconcile_ctl00_rptrDebitCredit_ctl00_cbSelect']");

	private By R2Elem = By.xpath("//INPUT[@id='ctl00_cPH_rptrReconcile_ctl00_rptrDebitCredit_ctl01_cbSelect']");
	private By R3Elem = By.xpath("//INPUT[@id='ctl00_cPH_rptrReconcile_ctl00_rptrDebitCredit_ctl02_cbSelect']");

	private By ReconcileLinkElem = By.xpath("//A[@id='ctl00_cPH_rptrReconcile_ctl00_lnkReconcile']");

	private By SelectReconcileTypeElem = By.xpath("//SELECT[@name='ctl00$cPH$ddReconcileType']");

	private By ReconcileButtonElem = By.xpath("//A[@id='ctl00_cphFooter_btnReconcile']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/AccountUI/Reconcile.aspx?FYCode=52604&CompanyCode=13371&s=3");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AccountUI/Reconcile.aspx?FYCode=52604&CompanyCode=13371&s=3");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AccountUI/Reconcile.aspx?FYCode=52604&CompanyCode=13371&s=3");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AccountUI/Reconcile.aspx?FYCode=52604&CompanyCode=13371&s=3";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AccountUI/Reconcile.aspx?FYCode=52604&CompanyCode=13371&s=3")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click SelectALL
     * @name Click SelectALL
     */
	public void Click_SelectALL()
	{
        
		WebElement elem = getWebElement(SelectALLElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SelectALL", "Click_SelectALL failed. Unable to locate object: " + SelectALLElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SelectALL", "Click_SelectALL failed. Unable to locate object: " + SelectALLElem.toString());

			Assert.fail("Unable to locate object: " + SelectALLElem.toString());
        }

//		elem.click();
          	jsExec.executeScript("arguments[0].click();",elem);

		ExtentReportManager.passStep(m_Driver, "Click_SelectALL");

		TestModellerLogger.PassStep(m_Driver, "Click_SelectALL");
	}

     
	/**
 	 * Click ReconcileSelected
     * @name Click ReconcileSelected
     */
	public void Click_ReconcileSelected()
	{
        
		WebElement elem = getWebElement(ReconcileSelectedElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ReconcileSelected", "Click_ReconcileSelected failed. Unable to locate object: " + ReconcileSelectedElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ReconcileSelected", "Click_ReconcileSelected failed. Unable to locate object: " + ReconcileSelectedElem.toString());

			Assert.fail("Unable to locate object: " + ReconcileSelectedElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_ReconcileSelected");

		TestModellerLogger.PassStep(m_Driver, "Click_ReconcileSelected");
	}

     
	/**
 	 * Click UngroupSelected
     * @name Click UngroupSelected
     */
	public void Click_UngroupSelected()
	{
        
		WebElement elem = getWebElement(UngroupSelectedElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_UngroupSelected", "Click_UngroupSelected failed. Unable to locate object: " + UngroupSelectedElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_UngroupSelected", "Click_UngroupSelected failed. Unable to locate object: " + UngroupSelectedElem.toString());

			Assert.fail("Unable to locate object: " + UngroupSelectedElem.toString());
        }

		//elem.click();
		jsExec.executeScript("arguments[0].click();",elem);
          	

		ExtentReportManager.passStep(m_Driver, "Click_UngroupSelected");

		TestModellerLogger.PassStep(m_Driver, "Click_UngroupSelected");
	}

     
	/**
 	 * Click R1
	 * @throws InterruptedException 
	 * @throws AWTException 
	 * @throws IOException 
	 * @throws HeadlessException 
     * @name Click R1
     */
	public void Click_R1() throws InterruptedException, HeadlessException, IOException, AWTException
	{
        
//		WebElement elem = getWebElement(R1Elem);
//
//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_R1", "Click_R1 failed. Unable to locate object: " + R1Elem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_R1", "Click_R1 failed. Unable to locate object: " + R1Elem.toString());
//
//			Assert.fail("Unable to locate object: " + R1Elem.toString());
//        }
//
//		//elem.click();
		 JournalEntry t=new JournalEntry(m_Driver);
		   // pages.JournalEntry = new pages.JournalEntry(m_Driver);
		    Thread.sleep(1000);

		    
	          Rpno=t.message();
	       //  String InvoiceNo = in.message(); 
	         int rowcount = m_Driver.findElements(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[3]/div/div/div/table/tbody/tr[2]/td/div[2]/table/tbody/tr[1]/td/div/table/tbody/tr")).size();
	         int cl = rowcount-1;
	         System.out.println("Row Count"+rowcount);
	         System.out.println("BankTR no"   +Rpno);
	      //   System.out.println("InvoiceNO "+InvoiceNo);
	         
		    System.out.println(rowcount);
		
		   for(int i=1;i<=rowcount;i++)
		   {
		    	  int j = i-1;
		    	  int jj=i-3;
		    	  System.out.println("i value "+i);
		    	  
		    	  /*column path to get data which is like bank trans number */
		    		WebElement m = m_Driver.findElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[3]/div/div/div/table/tbody/tr[2]/td/div[2]/table/tbody/tr[1]/td/div/table/tbody/tr["+i+"]/td[2]"));
		   
		    		String p=m.getText();
	    	  System.out.println("what is in p"   +p);
	    	 /*check bank transaction if there in aboeve xpath or not*/
	          if(Rpno.equalsIgnoreCase(p))
	         {   
	        	  
	       System.out.println("in loop");
	   
	     Thread.sleep(1000);
	    
	  System.out.println("i valuejjjj "+i+"   j "+j); 
		if(j>9)
			{
				WebElement ele= m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrReconcile_ctl00_rptrDebitCredit_ctl"+j+"_cbSelect']"));
				 jsExec.executeScript("arguments[0].scrollIntoView();", ele);
			
				 System.out.println("//*[@id='ctl00_cPH_rptrReconcile_ctl00_rptrDebitCredit_ctl"+j+"_cbSelect']");
				jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrReconcile_ctl00_rptrDebitCredit_ctl"+j+"_cbSelect']")));
				  
//				 WebElement ele1= m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrReconcile_ctl00_rptrDebitCredit_ctl"+j+"_cbSelect']"));
//				 String link = ele1.getText();
//				 System.out.println("link   "+ link);
//				 m_Driver.findElement(By.xpath("//*[contains(text(), '"+link+"')]")).click();
//				 m_Driver.findElement(By.xpath(" //*[@id='ctl00_cPH_rptrReconcile_ctl00_rptrDebitCredit_ctl0"+cl+"_cbSelect']")).click();
//				 								//*[@id="ctl00_cPH_rptrReconcile_ctl00_rptrDebitCredit_ctl11_cbSelect"]
				 break; 
		}
			
		else
			{ 
			WebElement ele= m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrReconcile_ctl00_rptrDebitCredit_ctl0"+j+"_cbSelect']"));
			 jsExec.executeScript("arguments[0].scrollIntoView();", ele);
			System.out.println("//*[@id='ctl00_cPH_rptrReconcile_ctl00_rptrDebitCredit_ctl0"+j+"_cbSelect']");
			int k=j-2;
			  jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrReconcile_ctl00_rptrDebitCredit_ctl0"+j+"_cbSelect']")));
			//  Screenshotcapture.captureAsImage(m_Driver, InvoiceNo);
//			  
//		 WebElement ele1= m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrReconcile_ctl00_rptrDebitCredit_ctl0"+j+"_cbSelect']"));
//		 String link = ele1.getText();
//			 System.out.println("link   "+ link);
//		 m_Driver.findElement(By.xpath("//*[contains(text(), '"+link+"')]")).click();
//		 m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrReconcile_ctl00_rptrDebitCredit_ctl0"+cl+"_cbSelect']")).click();
//		 break;
		
	}	
   }
}
//          	
//
//		ExtentReportManager.passStep(m_Driver, "Click_R1");
//
//		TestModellerLogger.PassStep(m_Driver, "Click_R1");
	}

     
	/**
 	 * Click R2
	 * @throws InterruptedException 
	 * @throws AWTException 
	 * @throws IOException 
	 * @throws HeadlessException 
     * @name Click R2
     */
	public void Click_R2() throws InterruptedException, HeadlessException, IOException, AWTException
	{
        

		System.out.println("R2");
//    
	    pages.PartialReconciledCases.SaleInvoice in = new pages.PartialReconciledCases.SaleInvoice(m_Driver);
	     int num = Integer.parseInt(Rpno)-1;
	    String InvoiceNo = String.valueOf(num);

   //   String InvoiceNo = in.message(); 
	int rowcount = m_Driver.findElements(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[3]/div/div/div/table/tbody/tr[2]/td/div[2]/table/tbody/tr[1]/td/div/table/tbody/tr")).size();

      System.out.println("Row Count2  "+rowcount);
      //System.out.println("BankTR no"   +Rpno);
      System.out.println("InvoiceNO2  "+InvoiceNo);
      

	    System.out.println(rowcount);
	      for(int i=1;i<=rowcount;i++)
	      {
	    	  int j = i-1;
	    	  System.out.println("i 2 value "+i);
	    	 
	    		WebElement m = m_Driver.findElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[3]/div/div/div/table/tbody/tr[2]/td/div[2]/table/tbody/tr[1]/td/div/table/tbody/tr["+i+"]/td[2]"));
	   
	    		String p=m.getText();
	    	  System.out.println("what is in 2 p"   +p);
	    	// check bank transaction if there in aboeve xpath or not
       if(InvoiceNo.equalsIgnoreCase(p))
      {   
     	  
    System.out.println("in loop2");

  Thread.sleep(1000);
 
System.out.println("i valuejjjj "+i+"   j "+j); 

////*[@id="ctl00_cPH_rptrReconcile_ctl00_rptrDebitCredit_ctl02_cbSelect"]


		if(j>9)
		{
			WebElement ele= m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrReconcile_ctl00_rptrDebitCredit_ctl"+j+"_cbSelect']"));
			 jsExec.executeScript("arguments[0].scrollIntoView();", ele);
			 
		
			 System.out.println("//*[@id='ctl00_cPH_rptrReconcile_ctl00_rptrDebitCredit_ctl"+j+"_cbSelect']");
			jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrReconcile_ctl00_rptrDebitCredit_ctl"+j+"_cbSelect']")));
			  

	}
		else
		{ 
		WebElement ele= m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrReconcile_ctl00_rptrDebitCredit_ctl0"+j+"_cbSelect']"));
		 jsExec.executeScript("arguments[0].scrollIntoView();", ele);
		System.out.println("//*[@id='ctl00_cPH_rptrReconcile_ctl00_rptrDebitCredit_ctl0"+j+"_cbSelect']");
		  jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrReconcile_ctl00_rptrDebitCredit_ctl0"+j+"_cbSelect']")));
		}	
		  
	   }
 }
}
	public void Click_R3() throws InterruptedException, HeadlessException, IOException, AWTException
	{
        

		System.out.println("R3");
//    
	    pages.PartialReconciledCases.SaleInvoice in = new pages.PartialReconciledCases.SaleInvoice(m_Driver);
	     int num = Integer.parseInt(Rpno)-2;
	    String InvoiceNo = String.valueOf(num);

   //   String InvoiceNo = in.message(); 
	int rowcount = m_Driver.findElements(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[3]/div/div/div/table/tbody/tr[2]/td/div[2]/table/tbody/tr[1]/td/div/table/tbody/tr")).size();

      System.out.println("Row Count2  "+rowcount);
      //System.out.println("BankTR no"   +Rpno);
      System.out.println("InvoiceNO3 "+InvoiceNo);
      

	    System.out.println(rowcount);
	      for(int i=1;i<=rowcount;i++)
	      {
	    	  int j = i-1;
	    	  System.out.println("i 2 value "+i);
	    	 
	    		WebElement m = m_Driver.findElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[3]/div/div/div/table/tbody/tr[2]/td/div[2]/table/tbody/tr[1]/td/div/table/tbody/tr["+i+"]/td[2]"));
	   
	    		String p=m.getText();
	    	  System.out.println("what is in 2 p"   +p);
	    	// check bank transaction if there in aboeve xpath or not
       if(InvoiceNo.equalsIgnoreCase(p))
      {   
     	  
    System.out.println("in loop2");

  Thread.sleep(1000);
 
System.out.println("i valuejjjj "+i+"   j "+j); 

////*[@id="ctl00_cPH_rptrReconcile_ctl00_rptrDebitCredit_ctl02_cbSelect"]


		if(j>9)
		{
			WebElement ele= m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrReconcile_ctl00_rptrDebitCredit_ctl"+j+"_cbSelect']"));
			 jsExec.executeScript("arguments[0].scrollIntoView();", ele);
			 
		
			 System.out.println("//*[@id='ctl00_cPH_rptrReconcile_ctl00_rptrDebitCredit_ctl"+j+"_cbSelect']");
			jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrReconcile_ctl00_rptrDebitCredit_ctl"+j+"_cbSelect']")));
			  

	}
		else
		{ 
		WebElement ele= m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrReconcile_ctl00_rptrDebitCredit_ctl0"+j+"_cbSelect']"));
		 jsExec.executeScript("arguments[0].scrollIntoView();", ele);
		System.out.println("//*[@id='ctl00_cPH_rptrReconcile_ctl00_rptrDebitCredit_ctl0"+j+"_cbSelect']");
		  jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrReconcile_ctl00_rptrDebitCredit_ctl0"+j+"_cbSelect']")));
		}	
		  
	   }
 }
}
     
	/**
 	 * Click ReconcileLink
     * @name Click ReconcileLink
     */
	public void Click_ReconcileLink()
	{
        
		WebElement elem = getWebElement(ReconcileLinkElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ReconcileLink", "Click_ReconcileLink failed. Unable to locate object: " + ReconcileLinkElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ReconcileLink", "Click_ReconcileLink failed. Unable to locate object: " + ReconcileLinkElem.toString());

			Assert.fail("Unable to locate object: " + ReconcileLinkElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_ReconcileLink");

		TestModellerLogger.PassStep(m_Driver, "Click_ReconcileLink");
	}

    
	/**
 	 * Select SelectReconcileType
     * @name Select SelectReconcileType
     */
    public void Select_SelectReconcileType(String SelectReconcileType)
 	{
    	m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div/div/div[2]/iframe")));
		//m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(SelectReconcileTypeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_SelectReconcileType", "Select_SelectReconcileType failed. Unable to locate object: " + SelectReconcileTypeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_SelectReconcileType", "Select_SelectReconcileType failed. Unable to locate object: " + SelectReconcileTypeElem.toString());

 			Assert.fail("Unable to locate object: " + SelectReconcileTypeElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(SelectReconcileType);
 		
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_SelectReconcileType " + SelectReconcileType);

 		TestModellerLogger.PassStep(m_Driver, "Select_SelectReconcileType " + SelectReconcileType);
 	}

     
	/**
 	 * Click ReconcileButton
	 * @throws AWTException 
	 * @throws IOException 
	 * @throws HeadlessException 
     * @name Click ReconcileButton
     */
	public void Click_ReconcileButton() throws HeadlessException, IOException, AWTException
	{
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div/div/div[2]/iframe")));
		WebElement elem = getWebElement(ReconcileButtonElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ReconcileButton", "Click_ReconcileButton failed. Unable to locate object: " + ReconcileButtonElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ReconcileButton", "Click_ReconcileButton failed. Unable to locate object: " + ReconcileButtonElem.toString());

			Assert.fail("Unable to locate object: " + ReconcileButtonElem.toString());
        }
		 Screenshotcapture.captureAsImage(m_Driver, Rpno);
		//elem.click();
		 jsExec.executeScript("arguments[0].scrollIntoView();", elem);
	        jsExec.executeScript("arguments[0].click();",elem);
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_ReconcileButton");

		TestModellerLogger.PassStep(m_Driver, "Click_ReconcileButton");
	}
	public void click_Adem() throws InterruptedException
	{
		
		WebElement ClickRecPulsBtn=m_Driver.findElement(By.xpath("//*[@id='ctl00_SideMenu1_accountantMenu']/a/span"));
		ClickRecPulsBtn.click();
		Thread.sleep(2000);
	}
	
	public void click_ReconBtn() throws InterruptedException
	{
		
		WebElement ClickRecPulsBtn=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_Divtab']/div/div[2]/div/div/div/table[2]/tbody/tr/td/table[1]/tbody/tr/td/a"));
		ClickRecPulsBtn.click();
		Thread.sleep(2000);
		   Library.Switchwindow(3, m_Driver);
	}
	 public void Select_AccountType_4__8(String AccountType_4__8) throws InterruptedException
	 	{
	 	    
	 		WebElement elem = getWebElement(AccountType_4__8Elem);

	 		if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_AccountType_4__8", "Select_AccountType_4__8 failed. Unable to locate object: " + AccountType_4__8Elem.toString());

	    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_AccountType_4__8", "Select_AccountType_4__8 failed. Unable to locate object: " + AccountType_4__8Elem.toString());

	 			Assert.fail("Unable to locate object: " + AccountType_4__8Elem.toString());
	         }
	 	
	 		Select dropdown = new Select(elem);

	 		dropdown.selectByVisibleText(AccountType_4__8);
	 		
	 		Thread.sleep(3000);
	 		ExtentReportManager.passStep(m_Driver, "Select_AccountType_4__8 " + AccountType_4__8);

	 		TestModellerLogger.PassStep(m_Driver, "Select_AccountType_4__8 " + AccountType_4__8);
	 	}

//	public void Select_Accounttype(String Acc) throws InterruptedException
//	{
//		Thread.sleep(3000);
//		WebElement Accounttype=m_Driver.findElement(By.xpath("//SELECT[@name='ctl00$cPHFilter$ddlAccountType']"));
//		
//		Select dropdown = new Select(Accounttype);
//
// 		dropdown.selectByVisibleText(Acc);
//	}
	public void Select_Account(String Acc) throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement Accounttype=m_Driver.findElement(By.xpath("//select[@id='ctl00_cPHFilter_ddlAccount']"));
		
		Select sl=new Select(Accounttype);
				sl.selectByVisibleText(Acc);
	}
	
	public void Fullreconcilation()
	{
		m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_chkReconcileUngroupSelected']")).click();
		m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_lnkUngroupSelected']")).click();
		m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_chkReconcileUngroupSelected']")).click();
		m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrReconcile_ctl00_lnkReconcile']")).click();
	}
	public void Advance_Reconcilation1(String Recontype) throws InterruptedException
	{
		Thread.sleep(2000);
	//	WebElement ClickInvoice=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrReconcilePendingSummary_ctl00_lnkReconcileAccount']"));
	//	ClickInvoice.click();
		WebElement SalectAllBtn=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_chkReconcileUngroupSelected']"));
		SalectAllBtn.click();
		
		WebElement ReconcileBtn=m_Driver.findElement(By.xpath("	//*[@id='ctl00_cPH_rptrReconcile_ctl00_lnkReconcile']"));
		ReconcileBtn.click();
		Thread.sleep(2000);
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='ctl00_cPH_modalReconcileFrame']")));
		
		WebElement  SelectReconType =m_Driver.findElement(By.xpath("//select[@id='ctl00_cPH_ddReconcileType']"));
		
		Select Dropdown=new Select(SelectReconType);
				Dropdown.selectByVisibleText(Recontype);
				
		
		
		WebElement ReconBtn=m_Driver.findElement(By.xpath("//*[@id='ctl00_cphFooter_btnReconcile']"));
		ReconBtn.click();
		m_Driver.switchTo().defaultContent();
		
	
	}
	public void ViewRecon(String CusAcc,String Acc) throws InterruptedException
	{
		
		m_Driver.findElement(By.xpath("//*[@id='ctl00_cpHeaderRight_btnReconciled']")).click();
		WebElement Accounttype=m_Driver.findElement(By.xpath("//SELECT[@name='ctl00$cPHFilter$ddlAccountType']"));
	
		Select dropdown = new Select(Accounttype);

 		dropdown.selectByVisibleText(CusAcc);
		
		Thread.sleep(2000);
		WebElement Accounttype1=m_Driver.findElement(By.xpath("//select[@id='ctl00_cPHFilter_ddlAccount']"));
		
		Select sl=new Select(Accounttype1);
				sl.selectByVisibleText(Acc);
				Thread.sleep(2000);
	}
	
	public void SS() throws InterruptedException
	{
		Thread.sleep(6000);
		 utilities.Screenshotcapture.Getscreenshot("Advance Reconcile of Invoice With jouranl Entry", "Reconcile");
	}
	public void SS1() throws InterruptedException
	{
		Thread.sleep(6000);
		 utilities.Screenshotcapture.Getscreenshot("Credit Note Advance Reconcile With Journal Entry", "Reconcile");
	}
	public void Advance_Credit_Rec_screenshot2() throws InterruptedException
	{
		Thread.sleep(6000);
		utilities.Screenshotcapture.Getscreenshot("Credit Note Advance reconililation With Bank", "Reconcile");
	}
	
	public void SS3() throws InterruptedException
	{
		Thread.sleep(6000);
		 utilities.Screenshotcapture.Getscreenshot("Credit Note Partial Reconcile With Journal Entry", "Reconcile");
	}
	public void Partial_Credit_Rec_screenshot2() throws InterruptedException
	{
		Thread.sleep(6000);
		utilities.Screenshotcapture.Getscreenshot("Credit Note Partial Reconcile With Bank", "Reconcile");
	}
	public void Advance_Supplier_Reconcilation() throws InterruptedException
	{
		Thread.sleep(6000);
		utilities.Screenshotcapture.Getscreenshot("Supplier Bil Advance Reconililation With Bank", "Supplier Reconcile");
	}
	public void Advance_Supplier_Reconcilation_Journal() throws InterruptedException
	{
		Thread.sleep(6000);
		utilities.Screenshotcapture.Getscreenshot("Supplier Bil Advance Reconililation With Journal Entry", "Supplier Reconcile");
	}
	
	public void Full_Supplier_Reconcilation_With_DebitNote() throws InterruptedException
	{
		Thread.sleep(6000);
		utilities.Screenshotcapture.Getscreenshot("full reconililation of Supplier bill and Debit Note", "Supplier Reconcile");
	}
	public void Advance_DebitNote_Reconcilation() throws InterruptedException
	{
		Thread.sleep(6000);
		utilities.Screenshotcapture.Getscreenshot("Debit Note Advance Reconililation With Bank", "Supplier Reconcile");
	}
	
	public void Advance_DebitNote_Journal_Reconcilation() throws InterruptedException
	{
		Thread.sleep(6000);
		utilities.Screenshotcapture.Getscreenshot("Debit Note_Advance reconililation With Journal Entry", "Supplier Reconcile");
	}
	
	public void Partial_DebitNote_Reconcilation() throws InterruptedException
	{
		Thread.sleep(6000);
		utilities.Screenshotcapture.Getscreenshot("Debit Note_Partial reconililation With Bank", "Supplier Reconcile");
	}
	public void Partial_DebitNote_Journal_Reconcilation() throws InterruptedException
	{
		Thread.sleep(6000);
		utilities.Screenshotcapture.Getscreenshot("Debit Note_Partial reconililation With Journal Entry", "Supplier Reconcile");
	}
	
}