package pages.PartialReconciledCases;

import pages.BasePage;

import javax.swing.text.TabableView;

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
import pages.PartialReconciledCases.nBANKTRN;

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/6a9a7248-1b26-4de8-9315-155fa569a810
@TestModellerModule(guid = "6a9a7248-1b26-4de8-9315-155fa569a810")
public class ForSearching extends BasePage
{
	public ForSearching (WebDriver driver)
	{
		super(driver);
	}

	//private By Sbnk_actElem = By.xpath("//SELECT[@id='ctl00_cPHFilter_ddlAccount']");

	private By Sbnk_actElem =By.xpath("//*[@id='ctl00_cPHFilter_ddlAccount']");

	private By Search_categoryElem = By.xpath("//SELECT[@id='ctl00_cPHFilter_dd_Search']");

	private By Enter_codeElem = By.xpath("//INPUT[@placeholder='Enter Text']");

	private By Select_MonthsElem = By.xpath("//SELECT[@id='ctl00_cPHFilter_ddlMonths']");

	private By DATE_TOElem = By.xpath("//INPUT[@name='ctl00$cPHFilter$txtDateFrom']");

	private By Date_FromElem = By.xpath("//INPUT[@id='ctl00_cPHFilter_txtDateTo']");

	private By Update_btnElem = By.xpath("//A[contains(text(),'Update')]");

	//private By _39Elem = By.xpath("//A[@id='ctl00_cPH_rptrDisplayRecords_ctl01_LnkTranDetail']");

	//"ctl00_cPHFilter_btnSearchprivate By _UnreconciledElem = By.xpath("//TD[@class='text-left']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/AccountUI/BankTran.aspx?FYCode=52444&CompanyCode=13236&IsFirstRequest=1");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AccountUI/BankTran.aspx?FYCode=52444&CompanyCode=13236&IsFirstRequest=1");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AccountUI/BankTran.aspx?FYCode=52444&CompanyCode=13236&IsFirstRequest=1");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
//   public void AssertUrl()
//    {
//        String currentUrl = m_Driver.getCurrentUrl();
//        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AccountUI/BankTran.aspx?FYCode=52444&CompanyCode=13236&IsFirstRequest=1";
//
//        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AccountUI/BankTran.aspx?FYCode=52444&CompanyCode=13236&IsFirstRequest=1")) {
//            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
//        }
//    }

    
	/**
 	 * Select Sbnk_act
     * @name Select Sbnk_act
     */
    public void Select_Sbnk_act(String Sbnk_act)
 	{
 	    
 		WebElement elem = getWebElement(Sbnk_actElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Sbnk_act", "Select_Sbnk_act failed. Unable to locate object: " + Sbnk_actElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Sbnk_act", "Select_Sbnk_act failed. Unable to locate object: " + Sbnk_actElem.toString());

 			Assert.fail("Unable to locate object: " + Sbnk_actElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Sbnk_act);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Sbnk_act " + Sbnk_act);

 		TestModellerLogger.PassStep(m_Driver, "Select_Sbnk_act " + Sbnk_act);
 	}

    
	/**
 	 * Select Search_category
	 * @throws InterruptedException 
     * @name Select Search_category
     */
    public void Select_Search_category(String Search_category) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(Search_categoryElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Search_category", "Select_Search_category failed. Unable to locate object: " + Search_categoryElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Search_category", "Select_Search_category failed. Unable to locate object: " + Search_categoryElem.toString());

 			Assert.fail("Unable to locate object: " + Search_categoryElem.toString());
         }

 		Select dropdown = new Select(elem);
 	          elem.sendKeys(Keys.ARROW_DOWN);
 		dropdown.selectByVisibleText(Search_category);
 		Thread.sleep(1000);
 			
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Search_category " + Search_category);

 		TestModellerLogger.PassStep(m_Driver, "Select_Search_category " + Search_category);
 	}

      
	/**
 	 * Enter Enter_code
	 * @throws InterruptedException 
     * @name Enter Enter_code
     */
 	public void Enter_Enter_code(String Enter_code) throws InterruptedException
 	{
 	    
	WebElement elem = getWebElement(Enter_codeElem);

		if (elem == null) 
		{
   		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_code", "Enter_Enter_code failed. Unable to locate object: " + Enter_codeElem.toString());
   		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_code", "Enter_Enter_code failed. Unable to locate object: " + Enter_codeElem.toString());
			Assert.fail("Unable to locate object: " + Enter_codeElem.toString());
         }
		nBANKTRN t=new nBANKTRN(m_Driver);
 		String lp=t.confirmation();
 		System.out.println("the code is " + lp);
 		elem.sendKeys(lp);
 		Thread.sleep(1000);
 		
 	}

 		
// 	int count1=m_Driver.findElements(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div/div/div/div[1]/div/table/tbody/tr[3]")).size();
// 	System.out.println("Row Count"  +count1);
// 	
//	   for(int i=1;i<=count1-1;i++)
//	   {
//	    	  int j = i-1;
//	    	 // int jj=i-3;
//	    	  System.out.println("i value "+i);
//	    	  /*column path to get data which is like bank trans number */
//	    		WebElement mt = m_Driver.findElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[3]/div/div/div/table/tbody/tr[2]/td/div[2]/table/tbody/tr[1]/td/div/table/tbody/tr["+i+"]/td[2]/a"));
//	    					    				
//	    		String po=mt.getText();
//   	  System.out.println("what is in p0"   +po);
//   	 /*check bank transaction if there in aboeve xpath or not*/
//       if(po.equalsIgnoreCase(lp))
//      {   
//     	  
//    System.out.println("in loop");
//    
//	    Thread.sleep(1000);
//   
// System.out.println("i valuejjjj "+i+"   j "+j); 
//	if(j>9)
//		{
//		//ctl00_cPH_rptrDisplayRecords_ctl29_LnkTranDetail
//		
//			WebElement ele= m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrDisplayRecords_ctl"+j+"_LnkTranDetail']"));
//			 jsExec.executeScript("arguments[0].scrollIntoView();", ele);
//		
//			 System.out.println("//*[@id='"+j+"_LnkTranDetail']");
//			jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//*[@id=ctl00_cPH_rptrDisplayRecords_ctl00_ctl"+j+"_LnkTranDetail']")));
			  
////			 WebElement ele1= m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrReconcile_ctl00_rptrDebitCredit_ctl"+j+"_cbSelect']"));
////			 String link = ele1.getText();
////			 System.out.println("link   "+ link);
////			 m_Driver.findElement(By.xpath("//*[contains(text(), '"+link+"')]")).click();
////			 m_Driver.findElement(By.xpath(" //*[@id='ctl00_cPH_rptrReconcile_ctl00_rptrDebitCredit_ctl0"+cl+"_cbSelect']")).click();
////			 								//*[@id="ctl00_cPH_rptrReconcile_ctl00_rptrDebitCredit_ctl11_cbSelect"]
//			 break; 
//	}
//		
//	else
//		{ 
//		WebElement ele= m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrDisplayRecords_ctl"+j+"_LnkTranDetail']"));
//		 jsExec.executeScript("arguments[0].scrollIntoView();", ele);
//		//System.out.println("//*[@id='ctl00_cPH_rptrReconcile_ctl00_rptrDebitCredit_ctl0"+j+"_cbSelect']");
//		  jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrDisplayRecords_ctl00_ctl"+j+"LnkTranDetail']")));
//		}
//      }
//	   }
//}

		
 		
 		  		//ExtentReportManager.passStep(m_Driver, "Enter_Enter_code " + Enter_code);
//
////  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_code " + Enter_code);
//  		
//  		
//  		
//  		
//  		
//  		
//  		//row coumnt  /html/body/form/main/div[11]/div[3]/div/div[4]/div/div/div/div[1]/div/table/tbody/tr[3]
//  		
//  		////*[@id="ctl00_cPH_rptrDisplayRecords_ctl11_LnkTranDetail"]
// 	}*/
    
	/**
 	 * Select Select_Months
     * @name Select Select_Months
//     */
//    public void Select_Select_Months(String Select_Months)
// 	{
// 	    
// 		WebElement elem = getWebElement(Select_MonthsElem);
//
// 		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Select_Months", "Select_Select_Months failed. Unable to locate object: " + Select_MonthsElem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Select_Months", "Select_Select_Months failed. Unable to locate object: " + Select_MonthsElem.toString());
//
// 			Assert.fail("Unable to locate object: " + Select_MonthsElem.toString());
//         }
//
// 		Select dropdown = new Select(elem);
//
// 		dropdown.selectByVisibleText(Select_Months);
// 		
// 		
// 		ExtentReportManager.passStep(m_Driver, "Select_Select_Months " + Select_Months);
//
// 		TestModellerLogger.PassStep(m_Driver, "Select_Select_Months " + Select_Months);
// 	}

      
	/**
 	 * Enter DATE_TO
     * @name Enter DATE_TO
     */
 	public void Enter_DATE_TO(String DATE_TO)
 	{
 	    
 		WebElement elem = getWebElement(DATE_TOElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_DATE_TO", "Enter_DATE_TO failed. Unable to locate object: " + DATE_TOElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_DATE_TO", "Enter_DATE_TO failed. Unable to locate object: " + DATE_TOElem.toString());

 			Assert.fail("Unable to locate object: " + DATE_TOElem.toString());
         }

 		elem.sendKeys(DATE_TO);
 		elem.sendKeys(Keys.TAB);

		
  		ExtentReportManager.passStep(m_Driver, "Enter_DATE_TO " + DATE_TO);

  		TestModellerLogger.PassStep(m_Driver, "Enter_DATE_TO " + DATE_TO);
 	}
  
	/**
 	 * Enter Date_From
     * @name Enter Date_From
     */
 	public void Enter_Date_From(String Date_From)
 	{
 	 	WebElement elem = getWebElement(Date_FromElem);
 		if (elem == null) 
 		{
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Date_From", "Enter_Date_From failed. Unable to locate object: " + Date_FromElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Date_From", "Enter_Date_From failed. Unable to locate object: " + Date_FromElem.toString());

 			Assert.fail("Unable to locate object: " + Date_FromElem.toString());
         }
 	 		elem.sendKeys(Date_From);
 	 		ExtentReportManager.passStep(m_Driver, "Enter_Date_From " + Date_From);
 	 		TestModellerLogger.PassStep(m_Driver, "Enter_Date_From " + Date_From);
  		}
	/**
 	 * Click Update_btn
	 * @throws InterruptedException 
     * @name Click Update_btn
     */
	public void Click_Update_btn() throws InterruptedException
	{
        
		WebElement elem = getWebElement(Update_btnElem);

		if (elem == null) 
		{
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Update_btn", "Click_Update_btn failed. Unable to locate object: " + Update_btnElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Update_btn", "Click_Update_btn failed. Unable to locate object: " + Update_btnElem.toString());

			Assert.fail("Unable to locate object: " + Update_btnElem.toString());
        }
			elem.click();
		
			m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrDisplayRecords_ctl01_LnkTranDetail']")).click();
	 		Thread.sleep(1000);
	 		m_Driver.findElement(By.xpath("//*[@id='EditPopUpClose']/span")).click();
	//	jsExec.executeScript("arguments[0].Click", elem);
        

//		ExtentReportManager.passStep(m_Driver, "Click_Update_btn");
//
//		TestModellerLogger.PassStep(m_Driver, "Click_Update_btn");
		
//			nBANKTRN t=new nBANKTRN(m_Driver);
//	 		String lp=t.confirmation();
//	 		System.out.println("the code is " + lp);
//	 		elem.sendKeys(lp);
//	 	int count1=m_Driver.findElements(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div/div/div/div[1]/div/table/tbody/tr[3]")).size();
//	 	System.out.println("Row Count"  +count1);
//	 	
//		   for(int i=1;i<=count1-1;i++)
//		   {
//		    	  int j = i-1;
//		    	 // int jj=i-3;
//		    	  System.out.println("i value "+i);
//		    	  /*column path to get data which is like bank trans number */
//		    		WebElement mt = m_Driver.findElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[3]/div/div/div/table/tbody/tr[2]/td/div[2]/table/tbody/tr[1]/td/div/table/tbody/tr["+i+"]/td[2]/a"));
//		    					    				
//		    		String po=mt.getText();
//	   	  System.out.println("what is in p0"   +po);
//	   	 /*check bank transaction if there in aboeve xpath or not*/
//	       if(po.equalsIgnoreCase(lp))
//	      {   
//	     	  
//	    System.out.println("in loop");
//	    
//		    Thread.sleep(1000);
//	   
//	 System.out.println("i valuejjjj "+i+"   j "+j); 
//		if(j>9)
//			{
//			//ctl00_cPH_rptrDisplayRecords_ctl29_LnkTranDetail
//			
//				WebElement ele= m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrDisplayRecords_ctl"+j+"_LnkTranDetail']"));
//				 jsExec.executeScript("arguments[0].scrollIntoView();", ele);
//			
//				 System.out.println("//*[@id='"+j+"_LnkTranDetail']");
//				jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//*[@id=ctl00_cPH_rptrDisplayRecords_ctl00_ctl"+j+"_LnkTranDetail']")));
//				  
////				 WebElement ele1= m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrReconcile_ctl00_rptrDebitCredit_ctl"+j+"_cbSelect']"));
////				 String link = ele1.getText();
////				 System.out.println("link   "+ link);
////				 m_Driver.findElement(By.xpath("//*[contains(text(), '"+link+"')]")).click();
////				 m_Driver.findElement(By.xpath(" //*[@id='ctl00_cPH_rptrReconcile_ctl00_rptrDebitCredit_ctl0"+cl+"_cbSelect']")).click();
////				 								//*[@id="ctl00_cPH_rptrReconcile_ctl00_rptrDebitCredit_ctl11_cbSelect"]
//				 break; 
//		}
//			
//		else
//			{ 
//			WebElement ele= m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrDisplayRecords_ctl"+j+"_LnkTranDetail']"));
//			 jsExec.executeScript("arguments[0].scrollIntoView();", ele);
//			//System.out.println("//*[@id='ctl00_cPH_rptrReconcile_ctl00_rptrDebitCredit_ctl0"+j+"_cbSelect']");
//			  jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrDisplayRecords_ctl00_ctl"+j+"LnkTranDetail']")));
//			}
//	      }
//		   }
	}
}
//			  
//		 WebElement ele1= m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrReconcile_ctl00_rptrDebitCredit_ctl0"+j+"_cbSelect']"));
	      
		  
	      
		   
	//  Thread.sleep(1000);
	// 
	//System.out.println("i valuejjjj "+i+"   j "+j); 
//		if(j>9)
	 		
	 		
//	 		  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_code " + Enter_code);

//	  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_code " + Enter_code);
	  		
	  		
	  		
	  		
	  		
	  		
	  		//row coumnt  /html/body/form/main/div[11]/div[3]/div/div[4]/div/div/div/div[1]/div/table/tbody/tr[3]
	  		
	  		////*[@id="ctl00_cPH_rptrDisplayRecords_ctl11_LnkTranDetail"]
	 	
		
	

     
	/**
 	 * Click 39
     * @name Click 39
     */
//	public void Click__39()
//	{
//        
//		WebElement elem = getWebElement(_39Elem);
//
////		if (elem == null) {
////    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__39", "Click__39 failed. Unable to locate object: " + _39Elem.toString());
////
////    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__39", "Click__39 failed. Unable to locate object: " + _39Elem.toString());
////
////			Assert.fail("Unable to locate object: " + _39Elem.toString());
////        }
////
////		elem.click();
//		
//		WebElement test=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrDisplayRecords_ctl01_LnkTranDetail']");
//          	
//
//		ExtentReportManager.passStep(m_Driver, "Click__39");
//
//		TestModellerLogger.PassStep(m_Driver, "Click__39");
//	}
//
//     
	/**
 	 * Click  Unreconciled
     * @name Click  Unreconciled
     */
//	public void Click__Unreconciled()
//	{
//        
//		WebElement elem = getWebElement(_UnreconciledElem);
//
//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Unreconciled", "Click__Unreconciled failed. Unable to locate object: " + _UnreconciledElem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Unreconciled", "Click__Unreconciled failed. Unable to locate object: " + _UnreconciledElem.toString());
//
//			Assert.fail("Unable to locate object: " + _UnreconciledElem.toString());
//        }
//
//		elem.click();
//          	
//
//		ExtentReportManager.passStep(m_Driver, "Click__Unreconciled");
//
//		TestModellerLogger.PassStep(m_Driver, "Click__Unreconciled");
//	}


