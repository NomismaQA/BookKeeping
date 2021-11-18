package pages.PartialReconciledCases;


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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/d4095bc8-6857-431a-a175-27bd6b6e1afd
@TestModellerModule(guid = "d4095bc8-6857-431a-a175-27bd6b6e1afd")
public class Reconcillation2 extends BasePage
{
	public Reconcillation2 (WebDriver driver)
	{
		super(driver);
	}


	/////html/body/form/main/div[11]/div[3]/div/div[3]/div/div/div/table/tbody/tr[2]/td/div[2]/table/tbody/tr[1]/td/div/table/tfoot/tr/td[1]/table/tbody/tr/td[2]/a
	private By RCheckboxElem = By.xpath("//TR[@id='ctl00_cPH_rptrReconcile_ctl00_rptrDebitCredit_ctl00_tr1']/TD/SPAN[@class='Chkbox']");

	private By Trans_invoElem = By.xpath("/html/body/form/main/div[11]/div[3]/div/div[3]/div/div/div/table/tbody/tr[2]/td/div[2]/table/tbody/tr[1]/td/div/table/tbody/tr[1]/td[2]");

//	private By RCheckbnox2Elem = By.xpath("/html/body/form/main/div[11]/div[3]/div/div[3]/div/div/div/table/tbody/tr[2]/td/div[2]/table/tbody/tr[1]/td/div/table/tbody/tr[2]/td[1]");
//
//	private By Trans_invo2Elem = By.xpath("/html/body/form/main/div[11]/div[3]/div/div[3]/div/div/div/table/tbody/tr[2]/td/div[2]/table/tbody/tr[1]/td/div/table/tbody/tr[2]/td[2]");
//
	private By PageReconcilebuttonElem = By.xpath("/html/body/form/main/div[11]/div[3]/div/div[3]/div/div/div/table/tbody/tr[2]/td/div[2]/table/tbody/tr[1]/td/div/table/tfoot/tr/td[1]/table/tbody/tr/td[2]/a");
//
//	private By ctl00cPHddReconcileType1Elem = By.xpath("//SELECT[@name='ctl00$cPH$ddReconcileType']");
//
//	private By _Reconcile_Elem = By.xpath("//A[@id='ctl00_cphFooter_btnReconcile']");
//
//	private By Cancelbutton1Elem = By.xpath("//A[@id='ctl00_cphFooter_btnCancel']");
//
//	private By Confirmationmessag1Elem = By.xpath("//DIV[@class='alert alert-success']");


	
	public void GoToUrl()
	{
		m_Driver.get("https://nomisma.cloud.testinsights.io/app/#!/test-modeller/100401");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://nomisma.cloud.testinsights.io/app/#!/test-modeller/100401");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://nomisma.cloud.testinsights.io/app/#!/test-modeller/100401");
	}

     
//	/**
// 	 * AssertUrl
//     * @name AssertUrl
//     */
//   public void AssertUrl()
//    {
//        String currentUrl = m_Driver.getCurrentUrl();
//        String expectedUrl = "https://nomisma.cloud.testinsights.io/app/#!/test-modeller/100401";
//
//        if (!currentUrl.equals("https://nomisma.cloud.testinsights.io/app/#!/test-modeller/100401")) {
//            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
//        }
//    }
     
	/**
 	 * Click RCheckbox
	 * @throws InterruptedException 
     * @name Click RCheckbox
     */
	public void Click_RCheckbox() throws InterruptedException
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
  	    		    	    		            	  
  	    	    	   
  	  
//	WebElement elem = getWebElement(RCheckboxElem);
//
//	if (elem == null) {
//   		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_RCheckbox", "Click_RCheckbox failed. Unable to locate object: " + RCheckboxElem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_RCheckbox", "Click_RCheckbox failed. Unable to locate object: " + RCheckboxElem.toString());
//
//			Assert.fail("Unable to locate object: " + RCheckboxElem.toString());
//        }
//
//		elem.click();
////          	
////
////		ExtentReportManager.passStep(m_Driver, "Click_RCheckbox");
////
////		TestModellerLogger.PassStep(m_Driver, "Click_RCheckbox");
	
	
	
	
	
	//}
	
	

     
	/**
 	 * Click Trans_invo
     * @name Click Trans_invo
    */
	public void Click_Trans_invo()
	{
		  SaleInvoice sl=new SaleInvoice(m_Driver);
		     String spno=sl.message();
	          System.out.println("Tansaction id is = "  +spno);
	          m_Driver.findElement(By.xpath("//*[contains(text(),'" +spno+ "')]")).click();
	}

//		WebElement elem = getWebElement(Trans_invoElem);
////
////		if (elem == null) {
////    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Trans_invo", "Click_Trans_invo failed. Unable to locate object: " + Trans_invoElem.toString());
////
////    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Trans_invo", "Click_Trans_invo failed. Unable to locate object: " + Trans_invoElem.toString());
////
////			Assert.fail("Unable to locate object: " + Trans_invoElem.toString());
////        }
////
////		elem.click();
////          	
////
////		ExtentReportManager.passStep(m_Driver, "Click_Trans_invo");
////
////		TestModellerLogger.PassStep(m_Driver, "Click_Trans_invo");
//		
//		
//		
//}
//
//     
//	/**
// 	 * Click RCheckbnox2
//     * @name Click RCheckbnox2
//     */
//	public void Click_RCheckbnox2()
//	{
//        
//		WebElement elem = getWebElement(RCheckbnox2Elem);
//
//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_RCheckbnox2", "Click_RCheckbnox2 failed. Unable to locate object: " + RCheckbnox2Elem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_RCheckbnox2", "Click_RCheckbnox2 failed. Unable to locate object: " + RCheckbnox2Elem.toString());
//
//			Assert.fail("Unable to locate object: " + RCheckbnox2Elem.toString());
//        }
//
//		elem.click();
//          	
//
//		ExtentReportManager.passStep(m_Driver, "Click_RCheckbnox2");
//
//		TestModellerLogger.PassStep(m_Driver, "Click_RCheckbnox2");
//	}
//
//     
//	/**
// 	 * Click Trans_invo2
//     * @name Click Trans_invo2
//     */
//	public void Click_Trans_invo2()
//	{
//        
//		WebElement elem = getWebElement(Trans_invo2Elem);
//
//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Trans_invo2", "Click_Trans_invo2 failed. Unable to locate object: " + Trans_invo2Elem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Trans_invo2", "Click_Trans_invo2 failed. Unable to locate object: " + Trans_invo2Elem.toString());
//
//			Assert.fail("Unable to locate object: " + Trans_invo2Elem.toString());
//        }
//
//		elem.click();
//          	
//
//		ExtentReportManager.passStep(m_Driver, "Click_Trans_invo2");
//
//		TestModellerLogger.PassStep(m_Driver, "Click_Trans_invo2");
//	}
//
//     
	/**
 	 * Click PageReconcilebutton
	 * @throws InterruptedException 
     * @name Click PageReconcilebutton
     */
	public void Click_PageReconcilebutton() throws InterruptedException
	{
        
		WebElement elem = getWebElement(PageReconcilebuttonElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_PageReconcilebutton", "Click_PageReconcilebutton failed. Unable to locate object: " + PageReconcilebuttonElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_PageReconcilebutton", "Click_PageReconcilebutton failed. Unable to locate object: " + PageReconcilebuttonElem.toString());

			Assert.fail("Unable to locate object: " + PageReconcilebuttonElem.toString());
        }

		elem.click();
//		jsExec.executeScript("arguments[0].click();",elem);
          	Thread.sleep(1000);

		ExtentReportManager.passStep(m_Driver, "Click_PageReconcilebutton");

		TestModellerLogger.PassStep(m_Driver, "Click_PageReconcilebutton");
		
		
	}

}
//	/**
// 	 * Select ctl00$cPH$ddReconcileType1
//     * @name Select ctl00$cPH$ddReconcileType1
//     */
//    public void Select_ctl00cPHddReconcileType1(String ctl00cPHddReconcileType1)
// 	{
// 	    
//		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));
//
// 		WebElement elem = getWebElement(ctl00cPHddReconcileType1Elem);
//
// 		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_ctl00cPHddReconcileType1", "Select_ctl00cPHddReconcileType1 failed. Unable to locate object: " + ctl00cPHddReconcileType1Elem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_ctl00cPHddReconcileType1", "Select_ctl00cPHddReconcileType1 failed. Unable to locate object: " + ctl00cPHddReconcileType1Elem.toString());
//
// 			Assert.fail("Unable to locate object: " + ctl00cPHddReconcileType1Elem.toString());
//         }
//
// 		Select dropdown = new Select(elem);
//
// 		dropdown.selectByVisibleText(ctl00cPHddReconcileType1);
// 		
//		m_Driver.switchTo().defaultContent();
//
// 		
// 		ExtentReportManager.passStep(m_Driver, "Select_ctl00cPHddReconcileType1 " + ctl00cPHddReconcileType1);
//
// 		TestModellerLogger.PassStep(m_Driver, "Select_ctl00cPHddReconcileType1 " + ctl00cPHddReconcileType1);
// 	}
//
//     
//	/**
// 	 * Click  Reconcile 
//     * @name Click  Reconcile 
//     */
//	public void Click__Reconcile_()
//	{
//        
//		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));
//
//		WebElement elem = getWebElement(_Reconcile_Elem);
//
//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Reconcile_", "Click__Reconcile_ failed. Unable to locate object: " + _Reconcile_Elem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Reconcile_", "Click__Reconcile_ failed. Unable to locate object: " + _Reconcile_Elem.toString());
//
//			Assert.fail("Unable to locate object: " + _Reconcile_Elem.toString());
//        }
//
//		elem.click();
//        
//		m_Driver.switchTo().defaultContent();
//  	
//
//		ExtentReportManager.passStep(m_Driver, "Click__Reconcile_");
//
//		TestModellerLogger.PassStep(m_Driver, "Click__Reconcile_");
//	}
//
//     
//	/**
// 	 * Click Cancelbutton1
//     * @name Click Cancelbutton1
//     */
//	public void Click_Cancelbutton1()
//	{
//        
//		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));
//
//		WebElement elem = getWebElement(Cancelbutton1Elem);
//
//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Cancelbutton1", "Click_Cancelbutton1 failed. Unable to locate object: " + Cancelbutton1Elem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Cancelbutton1", "Click_Cancelbutton1 failed. Unable to locate object: " + Cancelbutton1Elem.toString());
//
//			Assert.fail("Unable to locate object: " + Cancelbutton1Elem.toString());
//        }
//
//		elem.click();
//        
//		m_Driver.switchTo().defaultContent();
//  	
//
//		ExtentReportManager.passStep(m_Driver, "Click_Cancelbutton1");
//
//		TestModellerLogger.PassStep(m_Driver, "Click_Cancelbutton1");
//	}
//
//     
//	/**
// 	 * Click Confirmationmessag1
//     * @name Click Confirmationmessag1
//     */
//	public void Click_Confirmationmessag1()
//	{
//        
//		WebElement elem = getWebElement(Confirmationmessag1Elem);
//
//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Confirmationmessag1", "Click_Confirmationmessag1 failed. Unable to locate object: " + Confirmationmessag1Elem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Confirmationmessag1", "Click_Confirmationmessag1 failed. Unable to locate object: " + Confirmationmessag1Elem.toString());
//
//			Assert.fail("Unable to locate object: " + Confirmationmessag1Elem.toString());
//        }
//
//		elem.click();
//          	
//
//		ExtentReportManager.passStep(m_Driver, "Click_Confirmationmessag1");
//
//		TestModellerLogger.PassStep(m_Driver, "Click_Confirmationmessag1");
//	}
//}