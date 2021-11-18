package pages.PartialReconciledCases;

import pages.BasePage;
import pages.SaleInvoice;
import pages.PartialReconciledCases.nBANKTRN;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
//import org.apache.tools.ant.taskdefs.optional.sos.SOS;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.aventstack.extentreports.model.ScreenCapture;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.ChangeWindow;
import utilities.Screenshotcapture;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.GetScreenShot;
import utilities.testmodeller.TestModellerLogger;

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/6bfce450-dd4c-4fef-8e40-4d15577d47bf
@TestModellerModule(guid = "6bfce450-dd4c-4fef-8e40-4d15577d47bf")
public class Reconsilecount<JavaScriptExecutor> extends BasePage 
{
	Library t1;
	//int rowcount;
	
	
	public Reconsilecount (WebDriver driver)
	{
		super(driver);
		t1=new Library(m_Driver);
	}


		//private By R1Elem = By.xpath("/html/body/form/main/div[11]/div[3]/div/div[3]/div/div/div/table/tbody/tr[2]/td/div[2]/table/tbody/tr[1]/td/div/table/tbody/tr[1]/td[1]");

    private By R1Elem = By.xpath("/html/body/form/main/div[11]/div[3]/div/div[3]/div/div/div/table/tbody/tr[2]/td/div[2]/table/tbody/tr[1]/td/div/table/tbody/tr[1]/td[1]/span/input");
	private By R2Elem = By.xpath("/html/body/form/main/div[11]/div[3]/div/div[3]/div/div/div/table/tbody/tr[2]/td/div[2]/table/tbody/tr[1]/td/div/table/tbody/tr[1]/td[2]/a");

	//private By R3Elem = By.xpath("//TD[contains(text(),'01-Jan-2020')]");

	//private By R4Elem = By.xpath("/html/body/form/main/div[11]/div[3]/div/div[3]/div/div/div/table/tbody/tr[2]/td/div[2]/table/tbody/tr[1]/td/div/table/tbody/tr[1]/td[4]");

	//private By R5Elem = By.xpath("//TR[@id='ctl00_cPH_rptrReconcile_ctl00_rptrDebitCredit_ctl00_tr1']/TD[@class='credit']");

	//private By R6Elem = By.xpath("/html/body/form/main/div[11]/div[3]/div/div[3]/div/div/div/table/tbody/tr[2]/td/div[2]/table/tbody/tr[1]/td/div/table/tbody/tr[1]/td[7]");

	private By R7Elem = By.xpath("/html/body/form/main/div[11]/div[3]/div/div[3]/div/div/div/table/tbody/tr[2]/td/div[2]/table/tbody/tr[1]/td/div/table/tbody/tr[9]/td[1]/span/input");

	private By R8Elem = By.xpath("/html/body/form/main/div[11]/div[3]/div/div[3]/div/div/div/table/tbody/tr[2]/td/div[2]/table/tbody/tr[1]/td/div/table/tbody/tr[9]/td[2]/a");

	//private By R9Elem = By.xpath("/html/body/form/main/div[11]/div[3]/div/div[3]/div/div/div/table/tbody/tr[2]/td/div[2]/table/tbody/tr[1]/td/div/table/tbody/tr[11]/td[3]");

	//private By R10Elem = By.xpath("/html/body/form/main/div[11]/div[3]/div/div[3]/div/div/div/table/tbody/tr[2]/td/div[2]/table/tbody/tr[1]/td/div/table/tbody/tr[11]/td[4]");

	//private By R11Elem = By.xpath("//TD[contains(text(),'Â£4555.00')]");

	//private By R100Elem = By.xpath("/html/body/form/main/div[11]/div[3]/div/div[3]/div/div/div/table/tbody/tr[2]/td/div[2]/table/tbody/tr[1]/td/div/table/tbody/tr[11]/td[7]");

	//private By R12Elem = By.xpath("/html/body/form/main/div[11]/div[3]/div/div[3]/div/div/div/table/tbody/tr[2]/td/div[2]/table/tbody/tr[1]/td/div/table/tbody/tr[31]/td[1]/span/input");

	//private By R13Elem = By.xpath("/html/body/form/main/div[11]/div[3]/div/div[3]/div/div/div/table/tbody/tr[2]/td/div[2]/table/tbody/tr[1]/td/div/table/tbody/tr[31]/td[2]");

	//private By R14Elem = By.xpath("//TD[contains(text(),'15-Feb-2021')]");
	///html/body/form/main/div[11]/div[3]/div/div[3]/div/div/div/table/tbody/tr[2]/td/div[2]/table/tb[1]/td/div/table/tfoot/tr/td[1]/table/tbody/tr/td[2]/a

	//private By R15Elem = By.xpath("//TD[contains(text(),'Nidhi - Sales Invoice# INV-107')]");

	//private By R16Elem = By.xpath("//TD[contains(text(),'Â£49500.00')]");
//	/html/body/form/main/div[11]/div[3]/div/div[3]/div/div/div/table/tbody/tr[2]/td/div[2]/table/tbody/tr[1]/td/div/table/tfoot/tr/td[1]/table/tbody/tr/td[2]/a
	private By R17Elem = By.xpath("/html/body/form/main/div[11]/div[3]/div/div[3]/div/div/div/table/tbody/tr[2]/td/div[2]/table/tbody/tr[1]/td/div/table/tbody/tr[31]/td[7]");

	private By R18Elem = By.xpath("/html/body/form/main/div[11]/div[3]/div/div[3]/div/div/div/table/tbody/tr[2]/td/div[2]/table/tbody/tr[1]/td/div/table/tfoot/tr/td[1]/table/tbody/tr/td[2]");

	private By R19Elem = By.xpath("//TD[contains(text(),'Received')]");

	private By R20Elem = By.xpath("//TD[contains(text(),'Â£4000.00')]");

	private By R21Elem = By.xpath("/html/body/form/div[3]/div[1]/div[1]/table/tbody/tr[1]/td[5]");

	private By R22Elem = By.xpath("//TD[contains(text(),'Spent')]");

	private By R23Elem = By.xpath("//TD[contains(text(),'Â£4555.00')]");

	private By R24Elem = By.xpath("/html/body/form/div[3]/div[1]/div[1]/table/tbody/tr[2]/td[5]");

	private By R25Elem = By.xpath("//TD[contains(text(),'Nidhi - Sales Invoice# INV-107')]");

	private By R26Elem = By.xpath("//TD[contains(text(),'Â£49500.00')]");
	

	private By R27Elem = By.xpath("/html/body/form/div[3]/div[1]/div[1]/table/tbody/tr[3]/td[5]");

	private By R28Elem = By.xpath("/html/body/form/div[3]/div[1]/div[1]/table/tbody/tr[5]/td[2]");

	private By R29Elem = By.xpath("//TD[contains(text(),'Total')]");

	private By R30Elem = By.xpath("//TD[@style='font-weight: bold;']");

	private By R31Elem = By.xpath("//SELECT[@name='ctl00$cPH$ddReconcileType']");

	private By R32Elem = By.xpath("//A[@id='ctl00_cphFooter_btnReconcile']");
	private By ReconcileButtonElem = By.xpath("//A[@id='ctl00_cphFooter_btnReconcile']");

	private By Success_Transactions_reconciled_successfullyElem = By.xpath("//DIV[@class='alert alert-success']");

	
	
//	public void GoToUrl()
//	{
//		m_Driver.get("http://sandbox4.nomismasolution.co.uk/AccountUI/Reconcile.aspx?FYCode=52444&CompanyCode=13236");
//
//		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AccountUI/Reconcile.aspx?FYCode=52444&CompanyCode=13236");
//		
//		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AccountUI/Reconcile.aspx?FYCode=52444&CompanyCode=13236");
//	}

//     
//	/**
// 	 * AssertUrl
//     * @name AssertUrl
//     */
//   public void AssertUrl()
//    {
//        String currentUrl = m_Driver.getCurrentUrl();
//        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AccountUI/Reconcile.aspx?FYCode=52444&CompanyCode=13236";
//
//        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AccountUI/Reconcile.aspx?FYCode=52444&CompanyCode=13236")) {
//            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
//        }
//    }

     
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
/*get row count*/
		    nBANKTRN t=new nBANKTRN(m_Driver);
		    pages.PartialReconciledCases.SaleInvoice in = new pages.PartialReconciledCases.SaleInvoice(m_Driver);
		    Thread.sleep(1000);
		     WebElement check=   m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_chkReconcileUngroupSelected']"));
		    WebElement link = m_Driver.findElement(By.xpath("//*[contains (text(), ' Ungroup Selected')]"));
		    jsExec.executeScript("arguments[0].click();", check);
		    jsExec.executeScript("arguments[0].click();", link);
		    Thread.sleep(1000);
		    
	         String Rpno=t.confirmation();
	         String InvoiceNo = in.message(); 
	         int rowcount = m_Driver.findElements(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[3]/div/div/div/table/tbody/tr[2]/td/div[2]/table/tbody/tr[1]/td/div/table/tbody/tr")).size();
	         int cl = rowcount-1;
	         System.out.println("Row Count"+rowcount);
	         System.out.println("BankTR no"   +Rpno);
	         System.out.println("InvoiceNO "+InvoiceNo);
	         
		    System.out.println(rowcount);
		
		   for(int i=1;i<=rowcount-1;i++)
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
			  jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrReconcile_ctl00_rptrDebitCredit_ctl0"+j+"_cbSelect']")));
			  Screenshotcapture.captureAsImage(m_Driver, InvoiceNo);
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
    }
	          
		      
	


	/**
 	 * Click R2
	 * @throws IOException 
	 * @throws InterruptedException 
	 * @throws AWTException 
	 * @throws HeadlessException 
     * @name Click R2
     */
	public void Click_R2() throws IOException, InterruptedException, HeadlessException, AWTException
	{
		System.out.println("R2");
//         nBANKTRN t=new nBANKTRN(m_Driver);
//	         String tpno=t.confirmation();
//        
//	        System.out.println("Tansaction id is = "  +tpno);
//		          
//		         //WebElement bnktrnno=m_Driver.findElement(By.xpath("//*[contains(text(),'" +tpno+ "')]"));
//	                        
//       m_Driver.findElement(By.xpath("//*[contains(text(),'" +tpno+ "')]")).click();
//     
//		nBANKTRN t=new nBANKTRN(m_Driver);
	    pages.PartialReconciledCases.SaleInvoice in = new pages.PartialReconciledCases.SaleInvoice(m_Driver);
	    

         String InvoiceNo = in.message(); 
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
	    	 /*check bank transaction if there in aboeve xpath or not*/
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
			  
//			 WebElement ele1= m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrReconcile_ctl00_rptrDebitCredit_ctl"+j+"_cbSelect']"));
//			 String link = ele1.getText();
//			 System.out.println("link2   "+ link);
//			 m_Driver.findElement(By.xpath("//*[contains(text(), '"+link+"')]")).click();
//			 
	}
		
		
		else
		{ 
		WebElement ele= m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrReconcile_ctl00_rptrDebitCredit_ctl0"+j+"_cbSelect']"));
		 jsExec.executeScript("arguments[0].scrollIntoView();", ele);
		System.out.println("//*[@id='ctl00_cPH_rptrReconcile_ctl00_rptrDebitCredit_ctl0"+j+"_cbSelect']");
		  jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrReconcile_ctl00_rptrDebitCredit_ctl0"+j+"_cbSelect']")));
		  
//	 WebElement ele1= m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrReconcile_ctl00_rptrDebitCredit_ctl0"+j+"_cbSelect']"));
//	 String link = ele1.getText();
//		 System.out.println("link 2  "+ link);
//	 m_Driver.findElement(By.xpath("//*[contains(text(), '"+link+"')]")).click();
	
		}	
		  
	   }
	   
    }	
	    //*[@id="ctl00_cPH_rptrReconcile_ctl00_rptrDebitCredit_ctl08_cbSelect"]
                Thread.sleep(2000);
	        WebElement rec= m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrReconcile_ctl00_lnkReconcile']"));
	        jsExec.executeScript("arguments[0].click();", rec);
	        
	       
	      //a[@id="ctl00_cphFooter_btnReconcile"]
	      //  m_Driver.switchTo().frame(getWebElement(By.xpath("//a[@id='ctl00_cphFooter_btnReconcile']")));
	        Thread.sleep(1000);
	        Screenshotcapture.captureAsImage(m_Driver, InvoiceNo);
	        m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));
	        WebElement elem = getWebElement(ReconcileButtonElem);
	    	elem.click();
	        
			m_Driver.switchTo().defaultContent();
	     
		
	}

     
	
//	/**
// 	 * Click R3
//     * @name Click R3
//     */
//	public void Click_R3()
//	{
//        
//		WebElement elem = getWebElement(R3Elem);
//
//		if (elem == null)
//		{
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_R3", "Click_R3 failed. Unable to locate object: " + R3Elem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_R3", "Click_R3 failed. Unable to locate object: " + R3Elem.toString());
//
//			Assert.fail("Unable to locate object: " + R3Elem.toString());
//	    }
//			boolean isChecked = elem.isSelected();
//			if ( !isChecked )
//			{
//				//elem.click();
//				JavascriptExecutor jse = (JavascriptExecutor)m_Driver;
//				jse.executeScript("arguments[0].click()", elem);
//			}
//	         	
//
//		ExtentReportManager.passStep(m_Driver, "Click_R3");
//
//		TestModellerLogger.PassStep(m_Driver, "Click_R3");
//	}

     
//	/**
// 	 * Click R4
//	 * @throws InterruptedException 
//	 * @throws IOException 
//     * @name Click R4
//     */
	//public void Click_R4() throws InterruptedException, IOException
	
//	{
//        
//
////		WebElement elem = getWebElement(R4Elem);
////
////		if (elem == null) {
////    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_R4", "Click_R4 failed. Unable to locate object: " + R4Elem.toString());
////
////    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_R4", "Click_R4 failed. Unable to locate object: " + R4Elem.toString());
////
////			Assert.fail("Unable to locate object: " + R4Elem.toString());
//     // }
//
//          	SaleInvoice s=new SaleInvoice(m_Driver);
//		
//	        String in=s.message();
//	        
//	        System.out.println("TRANSACTIONID IN RECON"  +in);
//		          
//		         WebElement p2=m_Driver.findElement(By.xpath("//*[contains(text(),'" +in+ "')]"));
//	              p2.click();
//	            Thread.sleep(2000);
//	           GetScreenShot.captureAsImage(m_Driver," invoiceshot");
//
//		ExtentReportManager.passStep(m_Driver, "Click_R4");
//
//		TestModellerLogger.PassStep(m_Driver, "Click_R4");
//
//		
//	}
//     
//	/**
// 	 * Click R5
//     * @name Click R5
//     */
//	public void Click_R5()
//	{
//        
//		WebElement elem = getWebElement(R5Elem);
//
//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_R5", "Click_R5 failed. Unable to locate object: " + R5Elem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_R5", "Click_R5 failed. Unable to locate object: " + R5Elem.toString());
//
//			Assert.fail("Unable to locate object: " + R5Elem.toString());
//        }
//
//		elem.click();
//          	
//
//		ExtentReportManager.passStep(m_Driver, "Click_R5");
//
//		TestModellerLogger.PassStep(m_Driver, "Click_R5");
//	}
//
//     
//	/**
// 	 * Click R6
//     * @name Click R6
//     */
//	public void Click_R6()
//	{
//        
//		WebElement elem = getWebElement(R6Elem);
//
//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_R6", "Click_R6 failed. Unable to locate object: " + R6Elem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_R6", "Click_R6 failed. Unable to locate object: " + R6Elem.toString());
//
//			Assert.fail("Unable to locate object: " + R6Elem.toString());
//        }
//
//		elem.click();
//          	
//
//		ExtentReportManager.passStep(m_Driver, "Click_R6");
//
//		TestModellerLogger.PassStep(m_Driver, "Click_R6");
//	}
//
//     
	/**
 	 * Click R7
	 * @throws InterruptedException 
     * @name Click R7
     */
//	public void Click_R7() throws InterruptedException
//	{
//        
////		WebElement elem = getWebElement(R7Elem);
////
////		if (elem == null) {
////    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_R7", "Click_R7 failed. Unable to locate object: " + R7Elem.toString());
////
////    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_R7", "Click_R7 failed. Unable to locate object: " + R7Elem.toString());
////
////			Assert.fail("Unable to locate object: " + R7Elem.toString());
////        }
//		SaleInvoice sl=new SaleInvoice(m_Driver);
//        String spno=sl.message();
//	int rowcounttable = m_Driver.findElements(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[3]/div/div/div/table/tbody/tr[2]/td/div[2]/table/tbody/tr[1]/td/div/table/tbody/tr")).size();
//	/*call confirmation function of bank class,rpno having transaction number which we get from bank transaction */
////	   nBANKTRN t=new nBANKTRN(m_Driver);
////        String Rpno=t.confirmation();
//        System.out.println("Row Count"+rowcounttable);
//        System.out.println("spno is"  +spno);
//
//	    System.out.println(spno);
//	      for(int i=1;i<=rowcounttable-1;i++)
//	      {
//	    	  int j = i-1;
//	    	  System.out.println("i value "+i);
//	    	  /*column path to get data which is like bank trans number */
//	    		WebElement m = m_Driver.findElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[3]/div/div/div/table/tbody/tr[2]/td/div[2]/table/tbody/tr[1]/td/div/table/tbody/tr["+i+"]/td[2]"));
//	   
//	    		String pt=m.getText();
//	    	  System.out.println("what is in p"   +pt);
//	    	 /*check bank transaction if there in aboeve xpath or not*/
//         if(spno.equalsIgnoreCase(pt))
//        {   
//
//      System.out.println("in loop");
//    jsExec.executeScript("arguments[0].scrollIntoView(true);", m_Driver.findElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[3]/div/div/div/table/tbody/tr[2]/td/div[2]/table/tbody/tr[1]/td/div/table/tbody/tr["+i+"]/td[2]")));
//     Thread.sleep(1000);
//
// System.out.println("i valuejjjj "+i);
// m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrReconcile_ctl00_rptrDebitCredit_ctl"+j+"_cbSelect']")).click();
//     Thread.sleep(2000);
//            	  break;
//              
//        }
//	      }
//		
//	}
//
//     
//	/**
// 	 * Click R8
//	 * @throws IOException 
//	 * @throws InterruptedException 
//     * @name Click R8
//     */
//	public void Click_R8() throws IOException, InterruptedException
//	{
//        
////		WebElement elem = getWebElement(R8Elem);
////
////		if (elem == null) {
////    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_R8", "Click_R8 failed. Unable to locate object: " + R8Elem.toString());
////
////    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_R8", "Click_R8 failed. Unable to locate object: " + R8Elem.toString());
////
////			Assert.fail("Unable to locate object: " + R8Elem.toString());
////        }
//
//  	SaleInvoice s=new SaleInvoice(m_Driver);
//
//      String rinv1=s.message();
//   System.out.println("TRANSACTIONID IN RECON"  +rinv1);         
//        WebElement p2=m_Driver.findElement(By.xpath("//*[contains(text(),'" +rinv1+ "')]"));      
//        p2.click();
//        Thread.sleep(2000);
//      GetScreenShot.captureAsImage(m_Driver," invoiceshot");
//          	
//
//		ExtentReportManager.passStep(m_Driver, "Click_R8");
//
//		TestModellerLogger.PassStep(m_Driver, "Click_R8");
//	}

     
//	/**
// 	 * Click R9
//     * @name Click R9
  //   */
//	public void Click_R9()
//	{
//        
//		WebElement elem = getWebElement(R9Elem);
//
//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_R9", "Click_R9 failed. Unable to locate object: " + R9Elem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_R9", "Click_R9 failed. Unable to locate object: " + R9Elem.toString());
//
//			Assert.fail("Unable to locate object: " + R9Elem.toString());
//        }
//
//		elem.click();
//          	
//
//		ExtentReportManager.passStep(m_Driver, "Click_R9");
//
//		TestModellerLogger.PassStep(m_Driver, "Click_R9");
//	}

     
////	/**
//// 	 * Click R10
////     * @name Click R10
//     */
//	public void Click_R10()
//	{
//        
//		WebElement elem = getWebElement(R10Elem);
//
//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_R10", "Click_R10 failed. Unable to locate object: " + R10Elem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_R10", "Click_R10 failed. Unable to locate object: " + R10Elem.toString());
//
//			Assert.fail("Unable to locate object: " + R10Elem.toString());
//        }
//
//		elem.click();
//          	
//
//		ExtentReportManager.passStep(m_Driver, "Click_R10");
//
//		TestModellerLogger.PassStep(m_Driver, "Click_R10");
//	}
//
//     
//	/**
// 	 * Click R11
//     * @name Click R11
//     */
//	public void Click_R11()
//	{
//        
//		WebElement elem = getWebElement(R11Elem);
//
//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_R11", "Click_R11 failed. Unable to locate object: " + R11Elem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_R11", "Click_R11 failed. Unable to locate object: " + R11Elem.toString());
//
//			Assert.fail("Unable to locate object: " + R11Elem.toString());
//        }
//
//		elem.click();
//          	
//
//		ExtentReportManager.passStep(m_Driver, "Click_R11");
//
//		TestModellerLogger.PassStep(m_Driver, "Click_R11");
//	}
//
//     
//	/**
// 	 * Click R100
//     * @name Click R100
//     */
//	public void Click_R100()
//	{
//        
//		WebElement elem = getWebElement(R100Elem);
//
//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_R100", "Click_R100 failed. Unable to locate object: " + R100Elem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_R100", "Click_R100 failed. Unable to locate object: " + R100Elem.toString());
//
//			Assert.fail("Unable to locate object: " + R100Elem.toString());
//        }
//
//		elem.click();
//          	
//
//		ExtentReportManager.passStep(m_Driver, "Click_R100");
//
//		TestModellerLogger.PassStep(m_Driver, "Click_R100");
//	}
//
//     
////	/**
// 	 * Click R12
//     * @name Click R12
//     */
//	public void Click_R12()
//	{
//        
//		WebElement elem = getWebElement(R12Elem);
//
//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_R12", "Click_R12 failed. Unable to locate object: " + R12Elem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_R12", "Click_R12 failed. Unable to locate object: " + R12Elem.toString());
//
//			Assert.fail("Unable to locate object: " + R12Elem.toString());
//        }
//
//		elem.click();
//          	
//
//		ExtentReportManager.passStep(m_Driver, "Click_R12");
//
//		TestModellerLogger.PassStep(m_Driver, "Click_R12");
//	}

     
	/**
 	 * Click R13
     * @name Click R13
     */
//	public void Click_R13()
//	{
//        
//		WebElement elem = getWebElement(R13Elem);
//
//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_R13", "Click_R13 failed. Unable to locate object: " + R13Elem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_R13", "Click_R13 failed. Unable to locate object: " + R13Elem.toString());
//
//			Assert.fail("Unable to locate object: " + R13Elem.toString());
//        }
//
//		elem.click();
//          	
//
//		ExtentReportManager.passStep(m_Driver, "Click_R13");
//
//		TestModellerLogger.PassStep(m_Driver, "Click_R13");
//	}

     
//	/**
// 	 * Click R14
//     * @name Click R14
//     */
//	public void Click_R14()
//	{
//        
//		WebElement elem = getWebElement(R14Elem);
//
//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_R14", "Click_R14 failed. Unable to locate object: " + R14Elem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_R14", "Click_R14 failed. Unable to locate object: " + R14Elem.toString());
//
//			Assert.fail("Unable to locate object: " + R14Elem.toString());
//        }
//
//		elem.click();
//          	
//
//		ExtentReportManager.passStep(m_Driver, "Click_R14");
//
//		TestModellerLogger.PassStep(m_Driver, "Click_R14");
//	}
//
////     
//	/**
// 	 * Click R15
//     * @name Click R15
//     */
//	public void Click_R15()
//	{
//        
//		WebElement elem = getWebElement(R15Elem);
//
//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_R15", "Click_R15 failed. Unable to locate object: " + R15Elem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_R15", "Click_R15 failed. Unable to locate object: " + R15Elem.toString());
//
//			Assert.fail("Unable to locate object: " + R15Elem.toString());
//        }
//
//		elem.click();
//          	
//
//		ExtentReportManager.passStep(m_Driver, "Click_R15");
//
//		TestModellerLogger.PassStep(m_Driver, "Click_R15");
//	}

     
////	/**
//// 	 * Click R16
////     * @name Click R16
//     */
//	public void Click_R16()
//	{
//        
//		WebElement elem = getWebElement(R16Elem);
//
//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_R16", "Click_R16 failed. Unable to locate object: " + R16Elem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_R16", "Click_R16 failed. Unable to locate object: " + R16Elem.toString());
//
//			Assert.fail("Unable to locate object: " + R16Elem.toString());
//        }
//
//		elem.click();
//          	
//
//		ExtentReportManager.passStep(m_Driver, "Click_R16");
//
//		TestModellerLogger.PassStep(m_Driver, "Click_R16");
//	}
//
//     
//	/**
// 	 * Click R17
//     * @name Click R17
//     */
//	public void Click_R17()
//	{
//        
//		WebElement elem = getWebElement(R17Elem);
//
//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_R17", "Click_R17 failed. Unable to locate object: " + R17Elem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_R17", "Click_R17 failed. Unable to locate object: " + R17Elem.toString());
//
//			Assert.fail("Unable to locate object: " + R17Elem.toString());
//        }
//
//		elem.click();
//        	
//
//		ExtentReportManager.passStep(m_Driver, "Click_R17");
//
//		TestModellerLogger.PassStep(m_Driver, "Click_R17");
//	}
//
//     
	/**
 	 * Click R18
	 * @throws InterruptedException 
     * @name Click R18
     */
//	public void Click_R18() throws InterruptedException
//	{
//        
//		WebElement elem = getWebElement(R18Elem);
//
//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_R18", "Click_R18 failed. Unable to locate object: " + R18Elem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_R18", "Click_R18 failed. Unable to locate object: " + R18Elem.toString());
//
//			Assert.fail("Unable to locate object: " + R18Elem.toString());
//        }
//
//		elem.click();
//          	
//Thread.sleep(2000);
//		ExtentReportManager.passStep(m_Driver, "Click_R18");
//
//		TestModellerLogger.PassStep(m_Driver, "Click_R18");
//	}
//}
     
	/**
 	 * Click R19
     * @name Click R19
     */
////	public void Click_R19()
////	{
////        
////		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));
////
////		WebElement elem = getWebElement(R19Elem);
////
////		if (elem == null) {
////    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_R19", "Click_R19 failed. Unable to locate object: " + R19Elem.toString());
////
////    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_R19", "Click_R19 failed. Unable to locate object: " + R19Elem.toString());
////
////			Assert.fail("Unable to locate object: " + R19Elem.toString());
////        }
////
//		elem.click();
//        
//		m_Driver.switchTo().defaultContent();
//  	
//
//		ExtentReportManager.passStep(m_Driver, "Click_R19");
//
//		TestModellerLogger.PassStep(m_Driver, "Click_R19");
//	}
//
//     
//	/**
// 	 * Click R20
//     * @name Click R20
//     */
//	public void Click_R20()
//	{
//        
//		
//		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));
//
//		WebElement elem = getWebElement(R20Elem);
//
//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_R20", "Click_R20 failed. Unable to locate object: " + R20Elem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_R20", "Click_R20 failed. Unable to locate object: " + R20Elem.toString());
//
//			Assert.fail("Unable to locate object: " + R20Elem.toString());
//        }
//
//		elem.click();
//        
//		m_Driver.switchTo().defaultContent();
//  	
//
//		ExtentReportManager.passStep(m_Driver, "Click_R20");
//
//		TestModellerLogger.PassStep(m_Driver, "Click_R20");
//	}
//
//     
//	/**
// 	 * Click R21
//     * @name Click R21
//     */
//	public void Click_R21()
//	{
//        
//		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));
//
//		WebElement elem = getWebElement(R21Elem);
//
//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_R21", "Click_R21 failed. Unable to locate object: " + R21Elem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_R21", "Click_R21 failed. Unable to locate object: " + R21Elem.toString());
//
//			Assert.fail("Unable to locate object: " + R21Elem.toString());
//        }
//
//		elem.click();
//        
//		m_Driver.switchTo().defaultContent();
//  	
//
//		ExtentReportManager.passStep(m_Driver, "Click_R21");
//
//		TestModellerLogger.PassStep(m_Driver, "Click_R21");
//	}
//
//     
//	/**
// 	 * Click R22
//     * @name Click R22
//     */
//	public void Click_R22()
//	{
//        
//		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));
//
//		WebElement elem = getWebElement(R22Elem);
//
//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_R22", "Click_R22 failed. Unable to locate object: " + R22Elem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_R22", "Click_R22 failed. Unable to locate object: " + R22Elem.toString());
//
//			Assert.fail("Unable to locate object: " + R22Elem.toString());
//        }
//
//		elem.click();
//        
//		m_Driver.switchTo().defaultContent();
//  	
//
//		ExtentReportManager.passStep(m_Driver, "Click_R22");
//
//		TestModellerLogger.PassStep(m_Driver, "Click_R22");
//	}
//
//     
//	/**
// 	 * Click R23
//     * @name Click R23
//     */
//	public void Click_R23()
//	{
//        
//		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));
//
//		WebElement elem = getWebElement(R23Elem);
//
//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_R23", "Click_R23 failed. Unable to locate object: " + R23Elem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_R23", "Click_R23 failed. Unable to locate object: " + R23Elem.toString());
//
//			Assert.fail("Unable to locate object: " + R23Elem.toString());
//        }
//
//		elem.click();
//        
//		m_Driver.switchTo().defaultContent();
//  	
//
//		ExtentReportManager.passStep(m_Driver, "Click_R23");
//
//		TestModellerLogger.PassStep(m_Driver, "Click_R23");
//	}
//
//     
//	/**
// 	 * Click R24
//     * @name Click R24
//     */
//	public void Click_R24()
//	{
//        
//		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));
//
//		WebElement elem = getWebElement(R24Elem);
//
//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_R24", "Click_R24 failed. Unable to locate object: " + R24Elem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_R24", "Click_R24 failed. Unable to locate object: " + R24Elem.toString());
//
//			Assert.fail("Unable to locate object: " + R24Elem.toString());
//        }
//
//		elem.click();
//        
//		m_Driver.switchTo().defaultContent();
//  	
//
//		ExtentReportManager.passStep(m_Driver, "Click_R24");
//
//		TestModellerLogger.PassStep(m_Driver, "Click_R24");
//	}

     
	/**
 	 * Click R25
     * @name Click R25
     */
//	public void Click_R25()
//	{
//        
//		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));
//
//		WebElement elem = getWebElement(R25Elem);
//
//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_R25", "Click_R25 failed. Unable to locate object: " + R25Elem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_R25", "Click_R25 failed. Unable to locate object: " + R25Elem.toString());
//
//			Assert.fail("Unable to locate object: " + R25Elem.toString());
//        }
//
//		elem.click();
//        
//		m_Driver.switchTo().defaultContent();
//  	
//
//		ExtentReportManager.passStep(m_Driver, "Click_R25");
//
//		TestModellerLogger.PassStep(m_Driver, "Click_R25");
//	}

//     
//	/**
// 	 * Click R26
//     * @name Click R26
//     */
//	public void Click_R26()
//	{
//        
//		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));
//
//		WebElement elem = getWebElement(R26Elem);
//
//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_R26", "Click_R26 failed. Unable to locate object: " + R26Elem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_R26", "Click_R26 failed. Unable to locate object: " + R26Elem.toString());
//
//			Assert.fail("Unable to locate object: " + R26Elem.toString());
//        }
//
//		elem.click();
//        
//		m_Driver.switchTo().defaultContent();
//  	
//
//		ExtentReportManager.passStep(m_Driver, "Click_R26");
//
//		TestModellerLogger.PassStep(m_Driver, "Click_R26");
//	}
//
//     
	/**
 	 * Click R27
     * @name Click R27
     */
	public void Click_R27()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(R27Elem);

		if (elem == null) {
   		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_R27", "Click_R27 failed. Unable to locate object: " + R27Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_R27", "Click_R27 failed. Unable to locate object: " + R27Elem.toString());

			Assert.fail("Unable to locate object: " + R27Elem.toString());
        }

		elem.click();
       
		m_Driver.switchTo().defaultContent();
 	

		ExtentReportManager.passStep(m_Driver, "Click_R27");

		TestModellerLogger.PassStep(m_Driver, "Click_R27");
	}

     
	/**
 	 * Click R28
     * @name Click R28
     */
	public void Click_R28()
	{
       
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(R28Elem);

		if (elem == null) {
   		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_R28", "Click_R28 failed. Unable to locate object: " + R28Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_R28", "Click_R28 failed. Unable to locate object: " + R28Elem.toString());

			Assert.fail("Unable to locate object: " + R28Elem.toString());
       }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_R28");

		TestModellerLogger.PassStep(m_Driver, "Click_R28");
	}

     
//	/**
// 	 * Click R29
//     * @name Click R29
//     */
////	public void Click_R29()
////	{
////        
////		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));
////
////		WebElement elem = getWebElement(R29Elem);
////
////		if (elem == null) {
////    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_R29", "Click_R29 failed. Unable to locate object: " + R29Elem.toString());
////
////    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_R29", "Click_R29 failed. Unable to locate object: " + R29Elem.toString());
////
////			Assert.fail("Unable to locate object: " + R29Elem.toString());
////        }
////
////		elem.click();
////        
////		m_Driver.switchTo().defaultContent();
////  	
////
////		ExtentReportManager.passStep(m_Driver, "Click_R29");
////
////		TestModellerLogger.PassStep(m_Driver, "Click_R29");
////	}
//
//     
//	/**
// 	 * Click R30
//     * @name Click R30
//     */
////	public void Click_R30()
////	{
////        
////		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));
////
////		WebElement elem = getWebElement(R30Elem);
////
////		if (elem == null) {
////    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_R30", "Click_R30 failed. Unable to locate object: " + R30Elem.toString());
////
////    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_R30", "Click_R30 failed. Unable to locate object: " + R30Elem.toString());
////
////			Assert.fail("Unable to locate object: " + R30Elem.toString());
////        }
////
////		elem.click();
////        
////		m_Driver.switchTo().defaultContent();
////  	
////
////		ExtentReportManager.passStep(m_Driver, "Click_R30");
////
////		TestModellerLogger.PassStep(m_Driver, "Click_R30");
////	}
////
////    
////	/**
//// 	 * Select R31
////     * @name Select R31
////     */
    public void Select_R31(String R31)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(R31Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_R31", "Select_R31 failed. Unable to locate object: " + R31Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_R31", "Select_R31 failed. Unable to locate object: " + R31Elem.toString());

 			Assert.fail("Unable to locate object: " + R31Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(R31);
 		
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_R31 " + R31);

 		TestModellerLogger.PassStep(m_Driver, "Select_R31 " + R31);
 	}

//     
//	/**
// 	 * Click R32
//     * @name Click R32
//     */
//	public void Click_R32()
//	{
//        
//		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));
//
//		WebElement elem = getWebElement(R32Elem);
//
//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_R32", "Click_R32 failed. Unable to locate object: " + R32Elem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_R32", "Click_R32 failed. Unable to locate object: " + R32Elem.toString());
//
//			Assert.fail("Unable to locate object: " + R32Elem.toString());
//        }
//
//		elem.click();
//        
//		m_Driver.switchTo().defaultContent();
//  	
//
//		ExtentReportManager.passStep(m_Driver, "Click_R32");
//
//		TestModellerLogger.PassStep(m_Driver, "Click_R32");
//	}
//
//     
	/**
 	 * Click Success! Transactions reconciled successfully
     * @name Click Success! Transactions reconciled successfully
    */
	public void Click_Success_Transactions_reconciled_successfully()
	{
       
		WebElement elem = getWebElement(Success_Transactions_reconciled_successfullyElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Success_Transactions_reconciled_successfully", "Click_Success_Transactions_reconciled_successfully failed. Unable to locate object: " + Success_Transactions_reconciled_successfullyElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Success_Transactions_reconciled_successfully", "Click_Success_Transactions_reconciled_successfully failed. Unable to locate object: " + Success_Transactions_reconciled_successfullyElem.toString());

			Assert.fail("Unable to locate object: " + Success_Transactions_reconciled_successfullyElem.toString());
        }

		//elem.click();
		WebElement elem1 = m_Driver.findElement(By.xpath("//*[@id='ctl00_cphFooter_btnReconcile']"));
		jsExec.executeScript("arguments[0].click();", elem1);
          	

		ExtentReportManager.passStep(m_Driver, "Click_Success_Transactions_reconciled_successfully");

		TestModellerLogger.PassStep(m_Driver, "Click_Success_Transactions_reconciled_successfully");
	}
}