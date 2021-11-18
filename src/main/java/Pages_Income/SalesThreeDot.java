package Pages_Income;

import pages.BasePage;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
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
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/91eb0ac6-98f2-42cd-a940-7c1066c576d0
@TestModellerModule(guid = "91eb0ac6-98f2-42cd-a940-7c1066c576d0")
public class SalesThreeDot extends BasePage
{
	public SalesThreeDot (WebDriver driver)
	{
		super(driver);
	}


	
	private By clickThreeDotElem = By.xpath("//*[@id='ctl00_cPH_filtrec']/div/div/table/tbody/tr[1]/td[15]/div/a");

	private By Invoice_LinkElem = By.xpath("//A[@id='ctl00_cPH_rptrDisplayRecords_ctl00_lnlSend_InvoiceLink']");

	private By CopyElem = By.xpath("//A[@id='ctl00_cPH_rptrDisplayRecords_ctl00_LinkButton1']");

	private By Credit_NoteElem = By.xpath("//A[@id='ctl00_cPH_rptrDisplayRecords_ctl00_lnkCreditNote']");

	private By Chase_PaymentElem = By.xpath("//A[@id='ctl00_cPH_rptrDisplayRecords_ctl00_btnemailInvoiceDetails']");

	private By Receive_a_paymentElem = By.xpath("//A[@id='ctl00_cPH_rptrDisplayRecords_ctl00_lnkReceivePayment']");

	private By MyselfCheckBoxElem = By.xpath("//label[normalize-space()= 'Myself ( @gmail.com )']/../input");

	private By EnterEmailElem = By.xpath("//label[normalize-space()= 'Myself ( @gmail.com )']/../../input");

	private By _Send_Elem = By.xpath("//A[@id='ctl00_cphFooter_btnSave']");

	private By getMsgElem = By.xpath("//DIV[@class='alert alert-info el-selection']");
	
	private By DeleteIconElem = By.xpath("//A[@id='ctl00_cPH_rptrDisplayRecords_ctl00_lnkDelete']");

	private By GetHeaderElem = By.xpath("//*[@id='ctl00_divMainContent']/header/h2");

	private By _Delete_Elem = By.xpath("//A[@id='ctl00_cpHFooter_btnDelete']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=116991&CompanyCode=16668&IsFirstRequest=1");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=116991&CompanyCode=16668&IsFirstRequest=1");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=116991&CompanyCode=16668&IsFirstRequest=1");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=116991&CompanyCode=16668&IsFirstRequest=1";

        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=116991&CompanyCode=16668&IsFirstRequest=1")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click clickThreeDot
     * @name Click clickThreeDot
     */
	public void Click_clickThreeDot()
	{
        
		WebElement elem = getWebElement(clickThreeDotElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickThreeDot", "Click_clickThreeDot failed. Unable to locate object: " + clickThreeDotElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickThreeDot", "Click_clickThreeDot failed. Unable to locate object: " + clickThreeDotElem.toString());

			Assert.fail("Unable to locate object: " + clickThreeDotElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickThreeDot");

		TestModellerLogger.PassStep(m_Driver, "Click_clickThreeDot");
	}

     
	/**
 	 * Click Invoice Link
     * @name Click Invoice Link
     */
	public void Click_Invoice_Link()
	{
        
		WebElement elem = getWebElement(Invoice_LinkElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Invoice_Link", "Click_Invoice_Link failed. Unable to locate object: " + Invoice_LinkElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Invoice_Link", "Click_Invoice_Link failed. Unable to locate object: " + Invoice_LinkElem.toString());

			Assert.fail("Unable to locate object: " + Invoice_LinkElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Invoice_Link");

		TestModellerLogger.PassStep(m_Driver, "Click_Invoice_Link");
	}

     
	/**
 	 * Click Copy
     * @name Click Copy
     */
	public void Click_Copy()
	{
        
		WebElement elem = getWebElement(CopyElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Copy", "Click_Copy failed. Unable to locate object: " + CopyElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Copy", "Click_Copy failed. Unable to locate object: " + CopyElem.toString());

			Assert.fail("Unable to locate object: " + CopyElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Copy");

		TestModellerLogger.PassStep(m_Driver, "Click_Copy");
	}

     
	/**
 	 * Click Credit Note
     * @name Click Credit Note
     */
	public void Click_Credit_Note()
	{
        
		WebElement elem = getWebElement(Credit_NoteElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Credit_Note", "Click_Credit_Note failed. Unable to locate object: " + Credit_NoteElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Credit_Note", "Click_Credit_Note failed. Unable to locate object: " + Credit_NoteElem.toString());

			Assert.fail("Unable to locate object: " + Credit_NoteElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Credit_Note");

		TestModellerLogger.PassStep(m_Driver, "Click_Credit_Note");
	}

     
	/**
 	 * Click Chase Payment
	 * @throws InterruptedException 
	 * @throws AWTException 
	 * @throws IOException 
	 * @throws HeadlessException 
     * @name Click Chase Payment
     */
	public void Click_Chase_Payment() throws InterruptedException, HeadlessException, IOException, AWTException
	{
        
		WebElement elem = getWebElement(Chase_PaymentElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Chase_Payment", "Click_Chase_Payment failed. Unable to locate object: " + Chase_PaymentElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Chase_Payment", "Click_Chase_Payment failed. Unable to locate object: " + Chase_PaymentElem.toString());

			Assert.fail("Unable to locate object: " + Chase_PaymentElem.toString());
        }

		elem.click();
		
		Thread.sleep(2000);
		
		//Screenshotcapture.captureAsImage(m_Driver, "Chase Payment Popup");
          	utilities.Screenshotcapture.Getscreenshot("Chase Payment Popup", "Sales Dashboard");

		ExtentReportManager.passStep(m_Driver, "Click_Chase_Payment");

		TestModellerLogger.PassStep(m_Driver, "Click_Chase_Payment");
	}

     
	/**
 	 * Click Receive a payment
	 * @throws InterruptedException 
	 * @throws AWTException 
	 * @throws IOException 
	 * @throws HeadlessException 
     * @name Click Receive a payment
     */
	public void Click_Receive_a_payment() throws InterruptedException, HeadlessException, IOException, AWTException
	{
        
		WebElement elem = getWebElement(Receive_a_paymentElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Receive_a_payment", "Click_Receive_a_payment failed. Unable to locate object: " + Receive_a_paymentElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Receive_a_payment", "Click_Receive_a_payment failed. Unable to locate object: " + Receive_a_paymentElem.toString());

			Assert.fail("Unable to locate object: " + Receive_a_paymentElem.toString());
        }

		elem.click();
		
Thread.sleep(2000);
		
		//Screenshotcapture.captureAsImage(m_Driver, "Recieve Payment Popup");
          	utilities.Screenshotcapture.Getscreenshot("Recieve Payment Popup", "Sales Dashboard");

		ExtentReportManager.passStep(m_Driver, "Click_Receive_a_payment");

		TestModellerLogger.PassStep(m_Driver, "Click_Receive_a_payment");
	}

     
	/**
 	 * Click MyselfCheckBox
     * @name Click MyselfCheckBox
     */
	public void Click_MyselfCheckBox()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[5]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(MyselfCheckBoxElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_MyselfCheckBox", "Click_MyselfCheckBox failed. Unable to locate object: " + MyselfCheckBoxElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_MyselfCheckBox", "Click_MyselfCheckBox failed. Unable to locate object: " + MyselfCheckBoxElem.toString());

			Assert.fail("Unable to locate object: " + MyselfCheckBoxElem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_MyselfCheckBox");

		TestModellerLogger.PassStep(m_Driver, "Click_MyselfCheckBox");
	}

      
	/**
 	 * Enter EnterEmail
     * @name Enter EnterEmail
     */
 	public void Enter_EnterEmail(String EnterEmail)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[5]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(EnterEmailElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_EnterEmail", "Enter_EnterEmail failed. Unable to locate object: " + EnterEmailElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_EnterEmail", "Enter_EnterEmail failed. Unable to locate object: " + EnterEmailElem.toString());

 			Assert.fail("Unable to locate object: " + EnterEmailElem.toString());
         }

 		elem.sendKeys(EnterEmail);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_EnterEmail " + EnterEmail);

  		TestModellerLogger.PassStep(m_Driver, "Enter_EnterEmail " + EnterEmail);
 	}

     
	/**
 	 * Click  Send 
     * @name Click  Send 
     */
	public void Click__Send_()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[5]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(_Send_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Send_", "Click__Send_ failed. Unable to locate object: " + _Send_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Send_", "Click__Send_ failed. Unable to locate object: " + _Send_Elem.toString());

			Assert.fail("Unable to locate object: " + _Send_Elem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click__Send_");

		TestModellerLogger.PassStep(m_Driver, "Click__Send_");
	}

     
	/**
 	 * Click getMsg
	 * @throws AWTException 
	 * @throws IOException 
	 * @throws HeadlessException 
     * @name Click getMsg
     */
	public void Click_getMsg() throws HeadlessException, IOException, AWTException
	{
//        
//		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[5]/div/div/div[2]/iframe")));
//
//		WebElement elem = getWebElement(getMsgElem);
//
//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_getMsg", "Click_getMsg failed. Unable to locate object: " + getMsgElem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_getMsg", "Click_getMsg failed. Unable to locate object: " + getMsgElem.toString());
//
//			Assert.fail("Unable to locate object: " + getMsgElem.toString());
//        }
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[5]/div/div/div[2]/iframe")));
		List<WebElement> len=m_Driver.findElements(By.xpath("//*[@id='aspnetForm']/div[3]/div[1]/div/div"));
//		String Successmsg=elem.getText();
		System.out.println("Success msg=" +len.get(0).getText());
	//	System.out.println("Success msg="+len.size());
		
		//Screenshotcapture.captureAsImage(m_Driver, "Success Msg Invoice Link");
        utilities.Screenshotcapture.Getscreenshot("Success Msg Invoice Link", "Sales Dashboard");
		m_Driver.switchTo().defaultContent();
  	

//		ExtentReportManager.passStep(m_Driver, "Click_getMsg");
//
//		TestModellerLogger.PassStep(m_Driver, "Click_getMsg");
	}


	public void frameScreenSchot() throws HeadlessException, IOException, AWTException, InterruptedException {
	
		
		Thread.sleep(3000);
		Screenshotcapture.captureAsImage(m_Driver, "Frame Open of Invoice Link");
		
	}


	public void successMsgSS() throws HeadlessException, IOException, AWTException, InterruptedException {
		
		
		Thread.sleep(3000);
		Screenshotcapture.captureAsImage(m_Driver, "Success Msg of Invoice created");
		
	}


	public void creditNotePage() throws InterruptedException, HeadlessException, IOException, AWTException {
	
		Thread.sleep(3000);
		WebElement elem=m_Driver.findElement(By.xpath("//*[@id='ctl00_divMainContent']/header/h2"));
//		jsExec.executeScript("arguments[0].scrollIntoView();", scroll);
//		Thread.sleep(2000);
		String msg=elem.getText();
		boolean b=msg.contains("New Credit Note");
		Assert.assertTrue(b);
		//Screenshotcapture.captureAsImage(m_Driver, "Credit Note Page");
		utilities.Screenshotcapture.Getscreenshot("Credit Note Page", "Sales Dashboard");
	}


	public void click_Edit() {
	
		
		m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrDisplayRecords_ctl00_lnkEdit']/i")).click();
		
	}


	public void verifyEdit() throws InterruptedException, HeadlessException, IOException, AWTException {
	
		
		Thread.sleep(2000);
		
		WebElement elem=m_Driver.findElement(By.xpath("//*[@id='ctl00_divMainContent']/header/h2"));
//		jsExec.executeScript("arguments[0].scrollIntoView();", scroll);
//		Thread.sleep(2000);
		String msg=elem.getText();
		boolean b=msg.contains("Edit Invoice");
		Assert.assertTrue(b);
		//Screenshotcapture.captureAsImage(m_Driver, "Edit Invoice page");
		utilities.Screenshotcapture.Getscreenshot("Edit Invoice page", "Sales Dashboard");
		
		
	}
	
	/**
 	 * Click DeleteIcon
     * @name Click DeleteIcon
     */
	public void Click_DeleteIcon()
	{
        
		WebElement elem = getWebElement(DeleteIconElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_DeleteIcon", "Click_DeleteIcon failed. Unable to locate object: " + DeleteIconElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_DeleteIcon", "Click_DeleteIcon failed. Unable to locate object: " + DeleteIconElem.toString());

			Assert.fail("Unable to locate object: " + DeleteIconElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_DeleteIcon");

		TestModellerLogger.PassStep(m_Driver, "Click_DeleteIcon");
	}

     
	/**
 	 * Click GetHeader
	 * @throws AWTException 
	 * @throws IOException 
	 * @throws HeadlessException 
     * @name Click GetHeader
     */
	public void Click_GetHeader() throws HeadlessException, IOException, AWTException
	{
        
		WebElement elem = getWebElement(GetHeaderElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_GetHeader", "Click_GetHeader failed. Unable to locate object: " + GetHeaderElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_GetHeader", "Click_GetHeader failed. Unable to locate object: " + GetHeaderElem.toString());

			Assert.fail("Unable to locate object: " + GetHeaderElem.toString());
        }

		String msg=elem.getText();
		boolean b=msg.contains("Delete Invoice");
		Assert.assertTrue(b);
		//Screenshotcapture.captureAsImage(m_Driver, "Delete Invoice");
          	utilities.Screenshotcapture.Getscreenshot("Delete Invoice", "Sales Dashboard");

		ExtentReportManager.passStep(m_Driver, "Click_GetHeader");

		TestModellerLogger.PassStep(m_Driver, "Click_GetHeader");
	}

     
	/**
 	 * Click  Delete 
	 * @throws InterruptedException 
	 * @throws AWTException 
	 * @throws IOException 
	 * @throws HeadlessException 
     * @name Click  Delete 
     */
	public void Click__Delete_() throws InterruptedException, HeadlessException, IOException, AWTException
	{
        
		WebElement elem = getWebElement(_Delete_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Delete_", "Click__Delete_ failed. Unable to locate object: " + _Delete_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Delete_", "Click__Delete_ failed. Unable to locate object: " + _Delete_Elem.toString());

			Assert.fail("Unable to locate object: " + _Delete_Elem.toString());
        }
		jsExec.executeScript("arguments[0].scrollIntoView();", elem);
		elem.click();
		Thread.sleep(2000);
		//Screenshotcapture.captureAsImage(m_Driver, "Delete Invoice msg");  	
		utilities.Screenshotcapture.Getscreenshot("Delete Invoice msg", "Sales Dashboard");
		ExtentReportManager.passStep(m_Driver, "Click__Delete_");

		TestModellerLogger.PassStep(m_Driver, "Click__Delete_");
	}
	
public void verifyCraditEdit() throws InterruptedException, HeadlessException, IOException, AWTException {
	
		
		Thread.sleep(2000);
		
		WebElement elem=m_Driver.findElement(By.xpath("//*[@id='ctl00_divMainContent']/header/h2"));
//		jsExec.executeScript("arguments[0].scrollIntoView();", scroll);
//		Thread.sleep(2000);
		String msg=elem.getText();
		boolean b=msg.contains("Edit Credit Note");
		Assert.assertTrue(b);
		//Screenshotcapture.captureAsImage(m_Driver, "Edit Invoice page");
		utilities.Screenshotcapture.Getscreenshot("Edit Cradit Note  page", "Credit Note (Income)");
		
		
	}
}