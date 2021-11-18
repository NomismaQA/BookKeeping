package sm457;

import pages.BasePage;
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
import pages.SaleInvoice;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/49260580-6356-4f7e-ab75-9b7baae9de8e
@TestModellerModule(guid = "49260580-6356-4f7e-ab75-9b7baae9de8e")
public class saledasboard extends BasePage
{
	public saledasboard (WebDriver driver)
	{
		super(driver);
	}
	
	private By Select_customerElem = By.xpath("//label[contains(.,'Customer:')]/../div/select");

	private By search_cateElem = By.xpath("//label[contains(.,'Search Category:')]/../div/select");

	private By Enter_transcodeElem = By.xpath("//label[contains(.,'Search Category:')]/../div/input");

	private By payment_statusElem = By.xpath("//BUTTON[@title='UnPaid, Paid, Partially Paid']");

	private By select_DuestatusElem = By.xpath("//label[contains(.,'Due Status:')]/../div/select");

	private By daterange_fromElem = By.xpath("//label[contains(.,'')]/../input[1]");

	private By daterange_toElem = By.xpath("//label[contains(.,'')]/../input[2]");

	private By Click_Update_btnElem = By.xpath("//label[contains(.,'')]/../div/a");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=52444&CompanyCode=13236&IsFirstRequest=1");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=52444&CompanyCode=13236&IsFirstRequest=1");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=52444&CompanyCode=13236&IsFirstRequest=1");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=52444&CompanyCode=13236&IsFirstRequest=1";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=52444&CompanyCode=13236&IsFirstRequest=1")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

    
	/**
 	 * Select Select_customer
     * @name Select Select_customer
     */
    public void Select_Select_customer(String Select_customer)
 	{
 	    
 		WebElement elem = getWebElement(Select_customerElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Select_customer", "Select_Select_customer failed. Unable to locate object: " + Select_customerElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Select_customer", "Select_Select_customer failed. Unable to locate object: " + Select_customerElem.toString());

 			Assert.fail("Unable to locate object: " + Select_customerElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Select_customer);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Select_customer " + Select_customer);

 		TestModellerLogger.PassStep(m_Driver, "Select_Select_customer " + Select_customer);
 	}

    
	/**
 	 * Select search_cate
	 * @throws InterruptedException 
     * @name Select search_cate
     */
    public void Select_search_cate(String search_cate) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(search_cateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_search_cate", "Select_search_cate failed. Unable to locate object: " + search_cateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_search_cate", "Select_search_cate failed. Unable to locate object: " + search_cateElem.toString());

 			Assert.fail("Unable to locate object: " + search_cateElem.toString());
         }

 		Select dropdown = new Select(elem);
 		Thread.sleep(1000); 		

 		dropdown.selectByVisibleText(search_cate);
 		elem.sendKeys(Keys.TAB);
 		
 		ExtentReportManager.passStep(m_Driver, "Select_search_cate " + search_cate);

 		TestModellerLogger.PassStep(m_Driver, "Select_search_cate " + search_cate);
 	}

      
	/**
 	 * Enter Enter_transcode
	 * @throws InterruptedException 
     * @name Enter Enter_transcode
     */
 	public void Enter_Enter_transcode(String Enter_transcode) throws InterruptedException
 	{
   
 		WebElement elem = getWebElement(Enter_transcodeElem);
         pages.SaleInvoice s=new pages.SaleInvoice(m_Driver);
        String kt=s.message();
        System.out.println("code returned" +kt);
        elem.sendKeys(kt);
	    //Thread.sleep(2000);
 		
//
// 		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_transcode", "Enter_Enter_transcode failed. Unable to locate object: " + Enter_transcodeElem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_transcode", "Enter_Enter_transcode failed. Unable to locate object: " + Enter_transcodeElem.toString());
//
// 			Assert.fail("Unable to locate object: " + Enter_transcodeElem.toString());
//         }
//            
		
// 		
// 		
//  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_transcode " + Enter_transcode);
//
//  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_transcode " + Enter_transcode);
 	}

     
	/**
 	 * Click payment_status
     * @name Click payment_status
     */
//	public void Click_payment_status()
//	{
//        
//		WebElement elem = getWebElement(payment_statusElem);
//
//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_payment_status", "Click_payment_status failed. Unable to locate object: " + payment_statusElem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_payment_status", "Click_payment_status failed. Unable to locate object: " + payment_statusElem.toString());
//
//			Assert.fail("Unable to locate object: " + payment_statusElem.toString());
//        }
//
//		elem.click();
//          	
//
//		ExtentReportManager.passStep(m_Driver, "Click_payment_status");
//
//		TestModellerLogger.PassStep(m_Driver, "Click_payment_status");
//	}

    
	/**
 	 * Select select_Duestatus
     * @name Select select_Duestatus
     */
//    public void Select_select_Duestatus(String select_Duestatus)
// 	{
// 	    
// 		WebElement elem = getWebElement(select_DuestatusElem);
//
// 		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_select_Duestatus", "Select_select_Duestatus failed. Unable to locate object: " + select_DuestatusElem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_select_Duestatus", "Select_select_Duestatus failed. Unable to locate object: " + select_DuestatusElem.toString());
//
// 			Assert.fail("Unable to locate object: " + select_DuestatusElem.toString());
//         }
//
// 		Select dropdown = new Select(elem);
//
// 		dropdown.selectByVisibleText(select_Duestatus);
// 		
// 		
// 		ExtentReportManager.passStep(m_Driver, "Select_select_Duestatus " + select_Duestatus);
//
// 		TestModellerLogger.PassStep(m_Driver, "Select_select_Duestatus " + select_Duestatus);
// 	}
//
//      
//	/**
// 	 * Enter daterange_from
//     * @name Enter daterange_from
//     */
// 	public void Enter_daterange_from(String daterange_from)
// 	{
// 	    
// 		WebElement elem = getWebElement(daterange_fromElem);
//
// 		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_daterange_from", "Enter_daterange_from failed. Unable to locate object: " + daterange_fromElem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_daterange_from", "Enter_daterange_from failed. Unable to locate object: " + daterange_fromElem.toString());
//
// 			Assert.fail("Unable to locate object: " + daterange_fromElem.toString());
//         }
//
// 		elem.sendKeys(daterange_from);
// 		
// 		
//  		ExtentReportManager.passStep(m_Driver, "Enter_daterange_from " + daterange_from);
//
//  		TestModellerLogger.PassStep(m_Driver, "Enter_daterange_from " + daterange_from);
// 	}
//
//      
//	/**
// 	 * Enter daterange_to
//     * @name Enter daterange_to
//     */
// 	public void Enter_daterange_to(String daterange_to)
// 	{
// 	    
// 		WebElement elem = getWebElement(daterange_toElem);
//
// 		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_daterange_to", "Enter_daterange_to failed. Unable to locate object: " + daterange_toElem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_daterange_to", "Enter_daterange_to failed. Unable to locate object: " + daterange_toElem.toString());
//
// 			Assert.fail("Unable to locate object: " + daterange_toElem.toString());
//         }
//
// 		elem.sendKeys(daterange_to);
// 		
// 		
//  		ExtentReportManager.passStep(m_Driver, "Enter_daterange_to " + daterange_to);
//
//  		TestModellerLogger.PassStep(m_Driver, "Enter_daterange_to " + daterange_to);
// 	}
   
	/**
 	 * Click Click_Update btn
	 * @throws InterruptedException 
     * @name Click Click_Update btn
     */
	public void Click_Click_Update_btn() throws InterruptedException
	{
        
		WebElement elem = getWebElement(Click_Update_btnElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Click_Update_btn", "Click_Click_Update_btn failed. Unable to locate object: " + Click_Update_btnElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Click_Update_btn", "Click_Click_Update_btn failed. Unable to locate object: " + Click_Update_btnElem.toString());

			Assert.fail("Unable to locate object: " + Click_Update_btnElem.toString());
        }

		elem.click();
          	
//m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrDisplayRecords_ctl00_lnkSend']/i")).click();
		ExtentReportManager.passStep(m_Driver, "Click_Click_Update_btn");

		TestModellerLogger.PassStep(m_Driver, "Click_Click_Update_btn");
		
		Thread.sleep(2000);
	}
}