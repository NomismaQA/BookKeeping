package pages.PartialReconciledCases;

import pages.BasePage;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.google.errorprone.annotations.SuppressPackageLocation;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.Screenshotcapture;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;
import Supplier_pages.SupplierBillSToFRS;
import pages.PartialReconciledCases.nBANKTRN_Subcontractor;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/6f59ce92-7385-4e36-bcdc-94fff4539e1f
@TestModellerModule(guid = "6f59ce92-7385-4e36-bcdc-94fff4539e1f")
public class PartialReconcilationLAtestForSubcontractor extends BasePage
{
	String Rpno=" ";
	String InvoiceNo=" ";
	public PartialReconcilationLAtestForSubcontractor (WebDriver driver)
	{
		super(driver);
	}


	
	private By SelectALLElem = By.xpath("//INPUT[@id='ctl00_cPH_chkReconcileUngroupSelected']");

	private By ReconcileSelectedElem = By.xpath("//A[@id='ctl00_cPH_lnkReconcileSelected']");

	private By UngroupSelectedElem = By.xpath("//A[@id='ctl00_cPH_lnkUngroupSelected']");

	private By R1Elem = By.xpath("//INPUT[@id='ctl00_cPH_rptrReconcile_ctl00_rptrDebitCredit_ctl00_cbSelect']");

	private By R2Elem = By.xpath("//INPUT[@id='ctl00_cPH_rptrReconcile_ctl00_rptrDebitCredit_ctl01_cbSelect']");

	private By ReconcileLinkElem = By.xpath("//A[@id='ctl00_cPH_rptrReconcile_ctl00_lnkReconcile']");

	//private By SelectReconcileTypeElem = By.xpath("//SELECT[@name='ctl00$cPH$ddReconcileType']");
	private By SelectReconcileTypeElem = By.xpath("//*[@id='ctl00_cPH_ddReconcileType']");

	//private By ReconcileButtonElem = By.xpath("//A[@id='ctl00_cphFooter_btnReconcile']");
	
	private By ReconcileButtonElem = By.xpath("//label[contains(.,'Reconcile Type:')]/../div/select");
	//private By ctl00cPHddReconcileTypeElem = By.xpath("//label[contains(.,'Reconcile Type:')]/../div/select");



	
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
		//pages.SaleCreditNote in = new pages.SaleCreditNote(m_Driver);
      System.out.println("R1");
		 nBANKTRN_Subcontractor t=new nBANKTRN_Subcontractor(m_Driver);
		   
		    Thread.sleep(1000);
//		  
		    
	          Rpno=t.confirmation();
	       // InvoiceNo = in.message();
	    //     int rowcount = m_Driver.findElements(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[3]/div/div/div/table/tbody/tr[2]/td/div[2]/table/tbody/tr[1]/td/div/table/tbody/tr")).size();
	         int rowcount = m_Driver.findElements(By.xpath("//*[@id='ctl00_divSubContent']/div[7]/div/table/tbody/tr")).size();
	         int cl = rowcount-1;
	         System.out.println("Row Count"+rowcount);
	         System.out.println("BankTR no"   +Rpno);
	        // System.out.println("InvoiceNO "+InvoiceNo);
	         
		    System.out.println(rowcount);
		
		   for(int i=1;i<=rowcount;i++)
		   {
		    	  int j = i-1;
		    	  int jj=i-3;
		    	  System.out.println("i value "+i);
		    	  
		    	  /*column path to get data which is like bank trans number */
		    	//	WebElement m = m_Driver.findElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[3]/div/div/div/table/tbody/tr[2]/td/div[2]/table/tbody/tr[1]/td/div/table/tbody/tr["+i+"]/td[2]"));
		    		WebElement m = m_Driver.findElement(By.xpath("//*[@id='ctl00_divSubContent']/div[7]/div/table/tbody/tr["+i+"]/td[2]"));
		    		
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
			System.out.println("graterthan 10 R1");
			//*[@id="ctl00_cPH_rptrReconcile_ctl00_rptrDebitCredit_ct"+j+"_tr1"]/td[2]
			
			WebElement ele= m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrReconcile_ctl00_rptrDebitCredit_ctl"+j+"_tr1']/td[2]"));
			 jsExec.executeScript("arguments[0].scrollIntoView();", ele);
		
			 System.out.println("//*[@id='ctl00_cPH_rptrReconcile_ctl00_rptrDebitCredit_ctl"+j+"_cbSelect']");
			 jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrReconcile_ctl00_rptrDebitCredit_ctl"+j+"_cbSelect']")));
			 
			//jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrReconcile_ctl00_rptrDebitCredit_ctl"+j+"_tr1']/td[1]")));
//			  
//				WebElement ele= m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrReconcile_ctl00_rptrDebitCredit_ctl"+j+"_cbSelect']"));
//				 jsExec.executeScript("arguments[0].scrollIntoView();", ele);
//			
//				 System.out.println("//*[@id='ctl00_cPH_rptrReconcile_ctl00_rptrDebitCredit_ctl"+j+"_cbSelect']");
//				 
//				jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrReconcile_ctl00_rptrDebitCredit_ctl"+j+"_cbSelect']")));
//				  
	
			 break; 
		}
			
		else
			{ 
			System.out.println("lessthan 10 R2");
			
			WebElement ele= m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrReconcile_ctl00_rptrDebitCredit_ctl0"+j+"_tr1']/td[1]"));
			 jsExec.executeScript("arguments[0].scrollIntoView();", ele);
		
			 System.out.println("//*[@id='ctl00_cPH_rptrReconcile_ctl00_rptrDebitCredit_ctl0"+j+"_cbSelect']");
			 jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrReconcile_ctl00_rptrDebitCredit_ctl0"+j+"_cbSelect']")));
			
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

	   
	//  Supplier_pages.SupplierBillSToFRS in = new Supplier_pages.SupplierBillSToFRS(m_Driver);

		//InvoiceNo = in.message();
		int num = Integer.parseInt(Rpno)-1;
		InvoiceNo = String.valueOf(num);
		
//	int rowcount = m_Driver.findElements(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[3]/div/div/div/table/tbody/tr[2]/td/div[2]/table/tbody/tr[1]/td/div/table/tbody/tr")).size();
	 int rowcount = m_Driver.findElements(By.xpath("//*[@id='ctl00_divSubContent']/div[7]/div/table/tbody/tr")).size();
      System.out.println("Row Count2  "+rowcount);
      //System.out.println("BankTR no"   +Rpno);
     System.out.println("InvoiceNO2 in R2:: "+InvoiceNo);
//      int num = Integer.parseInt(Rpno)-1;
//      String InvoiceNo = String.valueOf(num);
//      

	    System.out.println(rowcount);
	      for(int i=1;i<=rowcount;i++)
	      {
	    	  int j = i-1;
	    	  System.out.println("i 2 value "+i);
	    	 
	    //		WebElement m = m_Driver.findElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[3]/div/div/div/table/tbody/tr[2]/td/div[2]/table/tbody/tr[1]/td/div/table/tbody/tr["+i+"]/td[2]"));
	    		WebElement m = m_Driver.findElement(By.xpath("//*[@id='ctl00_divSubContent']/div[7]/div/table/tbody/tr["+i+"]/td[2]"));
	    		
	    		String p=m.getText();
	    	  System.out.println("what is in 2 p"   +p);
	    	 /*check bank transaction if there in aboeve xpath or not*/
       if(InvoiceNo.equalsIgnoreCase(p))
      {   
     	  
    System.out.println("in loop2");

  Thread.sleep(1000);
 
System.out.println("i valuejjjj "+i+"   j "+j); 

//[@id="ctl00_cPH_rptrReconcile_ctl00_rptrDebitCredit_ctl02_cbSelect"]


if(j>9)
{
	System.out.println("graterthan 10 R2");
//*[@id="ctl00_cPH_rptrReconcile_ctl00_rptrDebitCredit_ct"+j+"_tr1"]/td[2]

WebElement ele= m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrReconcile_ctl00_rptrDebitCredit_ctl"+j+"_tr1']/td[2]"));
//jsExec.executeScript("arguments[0].scrollIntoView();", ele);

 System.out.println("//*[@id='ctl00_cPH_rptrReconcile_ctl00_rptrDebitCredit_ctl"+j+"_cbSelect']");
//*[@id='ctl00_cPH_rptrReconcile_ctl00_rptrDebitCredit_ctl04_cbSelect']
 jsExec.executeScript("arguments[0].scrollIntoView();", m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrReconcile_ctl00_rptrDebitCredit_ctl"+j+"_cbSelect']")));
 
 jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrReconcile_ctl00_rptrDebitCredit_ctl"+j+"_cbSelect']")));



}

else
{ 

	System.out.println("graterthan 10 R2");
WebElement ele= m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrReconcile_ctl00_rptrDebitCredit_ctl0"+j+"_tr1']/td[1]"));
 jsExec.executeScript("arguments[0].scrollIntoView();", ele);

 System.out.println("//*[@id='ctl00_cPH_rptrReconcile_ctl00_rptrDebitCredit_ctl0"+j+"_cbSelect']");
 
//jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrReconcile_ctl00_rptrDebitCredit_ctl0"+j+"_tr1']/td[1]")));
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
	 * @throws InterruptedException 
     * @name Select SelectReconcileType
     */
    public void Select_SelectReconcileType(String SelectReconcileType) throws InterruptedException
 	{
    //	m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div/div/div[2]/iframe")));
    	m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='ctl00_cPH_modalReconcileFrame']")));
 	    
	//	m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(SelectReconcileTypeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_SelectReconcileType", "Select_SelectReconcileType failed. Unable to locate object: " + SelectReconcileTypeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_SelectReconcileType", "Select_SelectReconcileType failed. Unable to locate object: " + SelectReconcileTypeElem.toString());

 			Assert.fail("Unable to locate object: " + SelectReconcileTypeElem.toString());
         }
 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(SelectReconcileType);
 		//jsExec.executeScript("arguments[0].click();", elem);
 		//jsExec.executeScript("arguments[0].scrollIntoView();", elem);
 		//elem.click();
        //System.out.println("1111."+SelectReconcileType);
 		//WebElement elem1 =
 				//m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_ddReconcileType']/option[1]")).click();
 		//m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/div[1]/div[2]/div/div")).sendKeys(Keys.ENTER);
 	//	elem1.sendKeys(Keys.ENTER);
 	//	elem1.sendKeys(Keys.ARROW_DOWN);
 		//Thread.sleep(2000);
// 		Select dropdown = new Select(elem);
//
// 		dropdown.selectByVisibleText(SelectReconcileType);
 		
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
//		 m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div/div/div[2]/iframe")));
		//m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div/div/div[2]/iframe")));
		//m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));
		//ReconcileButtonElem
		 m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='ctl00_cPH_modalReconcileFrame']")));
		 
		WebElement elem = getWebElement(ReconcileButtonElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ReconcileButton", "Click_ReconcileButton failed. Unable to locate object: " + ReconcileButtonElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ReconcileButton", "Click_ReconcileButton failed. Unable to locate object: " + ReconcileButtonElem.toString());

			Assert.fail("Unable to locate object: " + ReconcileButtonElem.toString());
        }
		Screenshotcapture.captureAsImage(m_Driver, InvoiceNo);
		//elem.click();
		jsExec.executeScript("arguments[0].scrollIntoView();", elem	);
        jsExec.executeScript("arguments[0].click();",elem );
     //   m_Driver.findElement(By.xpath("//a[contains(text(), 'Reconcile')]"
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_ReconcileButton");

		TestModellerLogger.PassStep(m_Driver, "Click_ReconcileButton");
	}
}