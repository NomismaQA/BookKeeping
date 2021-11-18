package pages.PartialReconciledCases;

import pages.BasePage;
import pages.PartialReconciledCases.nBANKTRN;
import pages.PartialReconciledCases.Reconsilecount;
import pages.PartialReconciledCases.Reconcillation2;
import pages.PartialReconciledCases.SaleInvoice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/7002b0f1-4c9a-4e72-a774-2fb2e5b2ed10
@TestModellerModule(guid = "7002b0f1-4c9a-4e72-a774-2fb2e5b2ed10")
public class reconcile3 extends BasePage
{
	public reconcile3 (WebDriver driver)
	{
		super(driver);
	}


	
	private By chkboxnkElem = By.xpath("//TR[@id='ctl00_cPH_rptrReconcile_ctl00_rptrDebitCredit_ctl01_tr1']/TD/SPAN[@class='Chkbox']");

	private By chkboxinvoElem = By.xpath("//TR[@id='ctl00_cPH_rptrReconcile_ctl00_rptrDebitCredit_ctl22_tr1']/TD/SPAN[@class='Chkbox']");

	private By ReconcilebutnkclickElem = By.xpath("//A[@id='ctl00_cPH_rptrReconcile_ctl00_lnkReconcile']");

	private By AutomatchlinkElem = By.xpath("//TD[@width='28%']");

	private By SuccessmsgElem = By.xpath("//DIV[@class='alert alert-success']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/AccountUI/Reconcile.aspx?FYCode=52444&CompanyCode=13236&s=3");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AccountUI/Reconcile.aspx?FYCode=52444&CompanyCode=13236&s=3");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AccountUI/Reconcile.aspx?FYCode=52444&CompanyCode=13236&s=3");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
//   public void AssertUrl()
//    {
//        String currentUrl = m_Driver.getCurrentUrl();
//        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AccountUI/Reconcile.aspx?FYCode=52444&CompanyCode=13236&s=3";
//
//        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AccountUI/Reconcile.aspx?FYCode=52444&CompanyCode=13236&s=3")) {
//            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
//        }
//    }

     
	/**
 	 * Click chkboxnk
	 * @throws InterruptedException 
     * @name Click chkboxnk
     */
	public void Click_chkboxnk() throws InterruptedException
	{
        
		nBANKTRN t=new nBANKTRN(m_Driver);
        String Rpno=t.confirmation();
	int rowcount = m_Driver.findElements(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[3]/div/div/div/table/tbody/tr[2]/td/div[2]/table/tbody/tr[1]/td/div/table/tbody/tr")).size();
	/*call confirmation function of bank class,rpno having transaction number which we get from bank transaction */
//	   nBANKTRN t=new nBANKTRN(m_Driver);
       // String Rpno=t.confirmation();
        System.out.println("Row Count"+rowcount);
        System.out.println("Rpno is"    +Rpno);

	    System.out.println(rowcount);
	      for(int i=1;i<=rowcount-1;i++)
	      {
	    	  int j = i-1;
	    	  System.out.println("i value "+i);
	    	  /*column path to get data which is like bank trans number */
	    		WebElement m = m_Driver.findElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[3]/div/div/div/table/tbody/tr[2]/td/div[2]/table/tbody/tr[1]/td/div/table/tbody/tr["+i+"]/td[2]"));
	   
	    		String p=m.getText();
	    	  System.out.println("what is in p"   +p);
	    	 /*check bank transaction if there in aboeve xpath or not*/
         if(Rpno.equalsIgnoreCase(p))
        {   

      System.out.println("in loop");
   // jsExec.executeScript("arguments[0].scrollIntoView(true);", m_Driver.findElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[3]/div/div/div/table/tbody/tr[2]/td/div[2]/table/tbody/tr[1]/td/div/table/tbody/tr["+i+"]/td[2]")));
     
      
    //  js.executeScript("arguments[0].scrollIntoView();", Element);
      ////@id='ctl00_cPH_rptrReconcile_ctl00_rptrDebitCredit_ctl0_cbSelect
      
      WebElement ele= m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrReconcile_ctl00_rptrDebitCredit_ctl"+j+"_cbSelect']"));
     
      jsExec.executeScript("arguments[0].scrollIntoView();", ele);
      Thread.sleep(1000);
   
 System.out.println("i valuejjjj "+i+"   j "+j); 


 System.out.println("//*[@id='ctl00_cPH_rptrReconcile_ctl00_rptrDebitCredit_ctl"+j+"_cbSelect']");
 
		
		  jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrReconcile_ctl00_rptrDebitCredit_ctl"+j+"_cbSelect']")));
		  
		 WebElement ele1= m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrReconcile_ctl00_rptrDebitCredit_ctl"+j+"_tr1']/td[2]"));
		 String link = ele1.getText();
		 System.out.println("link   "+ link);
		 m_Driver.findElement(By.xpath("//*[contains(text(), '"+link+"')]")).click();
		  
		 // m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrReconcile_ctl00_rptrDebitCredit_ct"+j+"_tr1']/td[2]")).click();
 Thread.sleep(2000);
 
           	  break;
        }
	}
	}
     
	/**
 	 * Click chkboxinvo
	 * @throws InterruptedException 
     * @name Click chkboxinvo
     */
	public void Click_chkboxinvo() throws InterruptedException
	{
        
		SaleInvoice sl=new SaleInvoice(m_Driver);
        String spno=sl.message();
	   int rowcounttable = m_Driver.findElements(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[3]/div/div/div/table/tbody/tr[2]/td/div[2]/table/tbody/tr[1]/td/div/table/tbody/tr")).size();
	      System.out.println("Row Count"   +rowcounttable);
        System.out.println("spno is"  +spno);
	       for(int i=1;i<=rowcounttable-1;i++)
	      {
	    	  int j = i-1;
	    	  System.out.println("i value "+i);
	    	  /*column path to get data which is like invoice trans number */
	    		WebElement m = m_Driver.findElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[3]/div/div/div/table/tbody/tr[2]/td/div[2]/table/tbody/tr[1]/td/div/table/tbody/tr["+i+"]/td[2]"));
	       		String pt=m.getText();
	    	  System.out.println("what is in p"   +pt);
	    	 /*check bank transaction if there in above xpath or not*/
         if(spno.equalsIgnoreCase(pt))
        {   

      System.out.println("in loop");
    jsExec.executeScript("arguments[0].scrollIntoView(true);", m_Driver.findElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[3]/div/div/div/table/tbody/tr[2]/td/div[2]/table/tbody/tr[1]/td/div/table/tbody/tr["+i+"]/td[2]")));
     Thread.sleep(1000);
 System.out.println("i valuejjjj "+i);
//jsExec.executeScript("arguments[0].click();",
		m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrReconcile_ctl00_rptrDebitCredit_ctl"+j+"_cbSelect']")).click();
     Thread.sleep(1000);
            	break;
        }
	      }
	}

     
	/**
 	 * Click Reconcilebutnkclick
     * @name Click Reconcilebutnkclick
     */
	public void Click_Reconcilebutnkclick()
	{
        
		WebElement elem = getWebElement(ReconcilebutnkclickElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Reconcilebutnkclick", "Click_Reconcilebutnkclick failed. Unable to locate object: " + ReconcilebutnkclickElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Reconcilebutnkclick", "Click_Reconcilebutnkclick failed. Unable to locate object: " + ReconcilebutnkclickElem.toString());

			Assert.fail("Unable to locate object: " + ReconcilebutnkclickElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Reconcilebutnkclick");

		TestModellerLogger.PassStep(m_Driver, "Click_Reconcilebutnkclick");
	}

     
	/**
 	 * Click Automatchlink
     * @name Click Automatchlink
     */
//	public void Click_Automatchlink()
//	{
//        
//		WebElement elem = getWebElement(AutomatchlinkElem);
//
//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Automatchlink", "Click_Automatchlink failed. Unable to locate object: " + AutomatchlinkElem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Automatchlink", "Click_Automatchlink failed. Unable to locate object: " + AutomatchlinkElem.toString());
//
//			Assert.fail("Unable to locate object: " + AutomatchlinkElem.toString());
//        }
//
//		elem.click();
//          	
//
//		ExtentReportManager.passStep(m_Driver, "Click_Automatchlink");
//
//		TestModellerLogger.PassStep(m_Driver, "Click_Automatchlink");
//	}

     
	/**
 	 * Click Successmsg
     * @name Click Successmsg
     */
	public void Click_Successmsg()
	{
        
		WebElement elem = getWebElement(SuccessmsgElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Successmsg", "Click_Successmsg failed. Unable to locate object: " + SuccessmsgElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Successmsg", "Click_Successmsg failed. Unable to locate object: " + SuccessmsgElem.toString());

			Assert.fail("Unable to locate object: " + SuccessmsgElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Successmsg");

		TestModellerLogger.PassStep(m_Driver, "Click_Successmsg");
	}
}