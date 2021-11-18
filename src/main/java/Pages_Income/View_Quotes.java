package Pages_Income;

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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/267782b2-9fbf-47f4-b818-8dc5371aa92c
@TestModellerModule(guid = "267782b2-9fbf-47f4-b818-8dc5371aa92c")
public class View_Quotes extends BasePage
{
	public View_Quotes (WebDriver driver)
	{
		super(driver);
	}


	
	private By View_1Elem = By.xpath("//*[@id='ctl00_divMainContent']/header/div/div[3]");

	private By View_Quotes_2Elem = By.xpath("//A[@id='ctl00_cpHeaderRight_btnViewQuote']");

	private By Quote_3_Add_New_QuaoteElem = By.xpath("//A[@id='ctl00_cpHeaderRight_btnAdd']");

	private By Three_Dot_4Elem = By.xpath("//*[@id='ctl00_divSubContent']/div[4]/div/div/div/div/div/table/tbody/tr[1]/td[9]/div/a/i");

	private By Email_5Elem = By.xpath("//A[@id='ctl00_cPH_rptrDisplayRecords_ctl00_lnkSend']");

	private By Myself_gmailcom_6Elem = By.xpath("//label[normalize-space()= 'Myself ( @gmail.com )']/../input");

	private By Enter_Email_7Elem = By.xpath("//label[normalize-space()= 'Myself ( @gmail.com )']/../../input");

	private By Enter_Subject_8Elem = By.xpath("//label[normalize-space()= 'Subject']/../../div[2]/input");

	private By Text_Boby_9Elem = By.cssSelector("BODY[marginwidth='\\30 ']");

	private By Send_10Elem = By.xpath("//A[@id='ctl00_cphFooter_btnSave']");

	private By Get_suss_Msg_11Elem = By.xpath("//*[@id='aspnetForm']/div[3]/div[1]/div/div");

	private By Cancel_Btn_12Elem = By.xpath("//BUTTON[@id='mailClose']");

	private By Preview_Btn_13Elem = By.xpath("//A[@id='ctl00_cPH_rptrDisplayRecords_ctl00_lnkPreview']");

	private By Save_View_14Elem = By.xpath("//A[@title='Export drop down menu']");

	private By Excel_15Elem = By.xpath("//A[@title='Excel']");

	private By PDF_16Elem = By.xpath("//A[@title='PDF']");

	private By Word_17Elem = By.xpath("//A[@title='Word']");

	private By close_19Elem = By.xpath("//BUTTON[@id='cboxClose']");

	private By Copy_20Elem = By.xpath("//A[@id='ctl00_cPH_rptrDisplayRecords_ctl00_LinkButton1']");

	private By Save_21Elem = By.xpath("//A[@id='ctl00_cpHFooter_btnSave']");

	private By Invoice_22Elem = By.xpath("//A[@id='ctl00_cPH_rptrDisplayRecords_ctl00_lnkCreditNote']");

	private By Save_23Elem = By.xpath("//A[@id='ctl00_cpHFooter_btnPreviewOnsave']");

	private By Save_24Elem = By.xpath("//A[@id='ctl00_cphError_btnSaveinvoice']");

	private By Edit_25Elem = By.xpath("//A[@id='ctl00_cPH_rptrDisplayRecords_ctl00_lnkEdit']");

	private By Enter_Edit_InvoiceNo_26Elem = By.xpath("//label[normalize-space()= 'Quote No *']/../../div[2]/input");

	private By Delete_27Elem = By.xpath("//A[@id='ctl00_cPH_rptrDisplayRecords_ctl00_lnkDelete']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AccountUI/InvoiceQuotation.aspx?FYCode=117655&CompanyCode=17318&vATReturnCodeM=0&VATReturnActionM=&fychanged=t");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/InvoiceQuotation.aspx?FYCode=117655&CompanyCode=17318&vATReturnCodeM=0&VATReturnActionM=&fychanged=t");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/InvoiceQuotation.aspx?FYCode=117655&CompanyCode=17318&vATReturnCodeM=0&VATReturnActionM=&fychanged=t");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/AccountUI/InvoiceQuotation.aspx?FYCode=117655&CompanyCode=17318&vATReturnCodeM=0&VATReturnActionM=&fychanged=t";

        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/AccountUI/InvoiceQuotation.aspx?FYCode=117655&CompanyCode=17318&vATReturnCodeM=0&VATReturnActionM=&fychanged=t")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click View 1
     * @name Click View 1
     */
	public void Click_View_1()
	{
        
		WebElement elem = getWebElement(View_1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_View_1", "Click_View_1 failed. Unable to locate object: " + View_1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_View_1", "Click_View_1 failed. Unable to locate object: " + View_1Elem.toString());

			Assert.fail("Unable to locate object: " + View_1Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_View_1");

		TestModellerLogger.PassStep(m_Driver, "Click_View_1");
	}

     
	/**
 	 * Click View Quotes 2
     * @name Click View Quotes 2
     */
	public void Click_View_Quotes_2()
	{
        
		WebElement elem = getWebElement(View_Quotes_2Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_View_Quotes_2", "Click_View_Quotes_2 failed. Unable to locate object: " + View_Quotes_2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_View_Quotes_2", "Click_View_Quotes_2 failed. Unable to locate object: " + View_Quotes_2Elem.toString());

			Assert.fail("Unable to locate object: " + View_Quotes_2Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_View_Quotes_2");

		TestModellerLogger.PassStep(m_Driver, "Click_View_Quotes_2");
	}

     
	/**
 	 * Click Quote 3 Add New Quaote
	 * @throws InterruptedException 
     * @name Click Quote 3 Add New Quaote
     */
	public void Click_Quote_3_Add_New_Quaote() throws InterruptedException
	{
        
		WebElement elem = getWebElement(Quote_3_Add_New_QuaoteElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Quote_3_Add_New_Quaote", "Click_Quote_3_Add_New_Quaote failed. Unable to locate object: " + Quote_3_Add_New_QuaoteElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Quote_3_Add_New_Quaote", "Click_Quote_3_Add_New_Quaote failed. Unable to locate object: " + Quote_3_Add_New_QuaoteElem.toString());

			Assert.fail("Unable to locate object: " + Quote_3_Add_New_QuaoteElem.toString());
        }

		elem.click();
          	Thread.sleep(2000);

		ExtentReportManager.passStep(m_Driver, "Click_Quote_3_Add_New_Quaote");

		TestModellerLogger.PassStep(m_Driver, "Click_Quote_3_Add_New_Quaote");
	}

     
	/**
 	 * Click Three Dot 4
     * @name Click Three Dot 4
     */
	public void Click_Three_Dot_4()
	{
        
		WebElement elem = getWebElement(Three_Dot_4Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Three_Dot_4", "Click_Three_Dot_4 failed. Unable to locate object: " + Three_Dot_4Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Three_Dot_4", "Click_Three_Dot_4 failed. Unable to locate object: " + Three_Dot_4Elem.toString());

			Assert.fail("Unable to locate object: " + Three_Dot_4Elem.toString());
        }

		jsExec.executeScript("arguments[0].click();",elem);
		
          	

		ExtentReportManager.passStep(m_Driver, "Click_Three_Dot_4");

		TestModellerLogger.PassStep(m_Driver, "Click_Three_Dot_4");
	}

     
	/**
 	 * Click Email 5
     * @name Click Email 5
     */
	public void Click_Email_5()
	{
        
		WebElement elem = getWebElement(Email_5Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Email_5", "Click_Email_5 failed. Unable to locate object: " + Email_5Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Email_5", "Click_Email_5 failed. Unable to locate object: " + Email_5Elem.toString());

			Assert.fail("Unable to locate object: " + Email_5Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Email_5");

		TestModellerLogger.PassStep(m_Driver, "Click_Email_5");
	}

     
	/**
 	 * Click Myself ( @gmail.com ) 6
     * @name Click Myself ( @gmail.com ) 6
     */
	public void Click_Myself_gmailcom_6()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(Myself_gmailcom_6Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Myself_gmailcom_6", "Click_Myself_gmailcom_6 failed. Unable to locate object: " + Myself_gmailcom_6Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Myself_gmailcom_6", "Click_Myself_gmailcom_6 failed. Unable to locate object: " + Myself_gmailcom_6Elem.toString());

			Assert.fail("Unable to locate object: " + Myself_gmailcom_6Elem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_Myself_gmailcom_6");

		TestModellerLogger.PassStep(m_Driver, "Click_Myself_gmailcom_6");
	}

      
	/**
 	 * Enter Enter Email 7
     * @name Enter Enter Email 7
     */
 	public void Enter_Enter_Email_7(String Enter_Email_7)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Enter_Email_7Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_Email_7", "Enter_Enter_Email_7 failed. Unable to locate object: " + Enter_Email_7Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_Email_7", "Enter_Enter_Email_7 failed. Unable to locate object: " + Enter_Email_7Elem.toString());

 			Assert.fail("Unable to locate object: " + Enter_Email_7Elem.toString());
         }

 		elem.sendKeys(Enter_Email_7);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_Email_7 " + Enter_Email_7);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_Email_7 " + Enter_Email_7);
 	}

      
	/**
 	 * Enter Enter Subject 8
     * @name Enter Enter Subject 8
     */
 	public void Enter_Enter_Subject_8(String Enter_Subject_8)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Enter_Subject_8Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_Subject_8", "Enter_Enter_Subject_8 failed. Unable to locate object: " + Enter_Subject_8Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_Subject_8", "Enter_Enter_Subject_8 failed. Unable to locate object: " + Enter_Subject_8Elem.toString());

 			Assert.fail("Unable to locate object: " + Enter_Subject_8Elem.toString());
         }

 		elem.sendKeys(Enter_Subject_8);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_Subject_8 " + Enter_Subject_8);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_Subject_8 " + Enter_Subject_8);
 	}

     
	/**
 	 * Click Text Boby 9
     * @name Click Text Boby 9
     */
	public void Click_Text_Boby_9(String TextMsg)
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div/div/div/div[2]/iframe")));

		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/div[3]/div[2]/div[4]/div[2]/div/table/tbody/tr[2]/td/div/iframe[1]")));

		WebElement elem = getWebElement(Text_Boby_9Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Text_Boby_9", "Click_Text_Boby_9 failed. Unable to locate object: " + Text_Boby_9Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Text_Boby_9", "Click_Text_Boby_9 failed. Unable to locate object: " + Text_Boby_9Elem.toString());

			Assert.fail("Unable to locate object: " + Text_Boby_9Elem.toString());
        }

		elem.sendKeys(TextMsg);
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_Text_Boby_9");

		TestModellerLogger.PassStep(m_Driver, "Click_Text_Boby_9");
	}

     
	/**
 	 * Click Send  10
     * @name Click Send  10
     */
	public void Click_Send_10()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(Send_10Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Send_10", "Click_Send_10 failed. Unable to locate object: " + Send_10Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Send_10", "Click_Send_10 failed. Unable to locate object: " + Send_10Elem.toString());

			Assert.fail("Unable to locate object: " + Send_10Elem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_Send_10");

		TestModellerLogger.PassStep(m_Driver, "Click_Send_10");
	}

     
	/**
 	 * Click Get suss Msg 11
     * @name Click Get suss Msg 11
     */
	public void Click_Get_suss_Msg_11()
	{
        
	m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='mailIFrame']")));

		WebElement elem = getWebElement(Get_suss_Msg_11Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Get_suss_Msg_11", "Click_Get_suss_Msg_11 failed. Unable to locate object: " + Get_suss_Msg_11Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Get_suss_Msg_11", "Click_Get_suss_Msg_11 failed. Unable to locate object: " + Get_suss_Msg_11Elem.toString());

			Assert.fail("Unable to locate object: " + Get_suss_Msg_11Elem.toString());
        }

		String EmailMsg=elem.getText();
		boolean b=EmailMsg.contains("Success! Your email is in a queue to be sent.");
		Assert.assertTrue(b);
		utilities.Screenshotcapture.Getscreenshot("Email Send  Suss Msg", "View Quote");
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_Get_suss_Msg_11");

		TestModellerLogger.PassStep(m_Driver, "Click_Get_suss_Msg_11");
	}

     
	/**
 	 * Click Cancel Btn 12
     * @name Click Cancel Btn 12
     */
	public void Click_Cancel_Btn_12()
	{
        
		WebElement elem = getWebElement(Cancel_Btn_12Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Cancel_Btn_12", "Click_Cancel_Btn_12 failed. Unable to locate object: " + Cancel_Btn_12Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Cancel_Btn_12", "Click_Cancel_Btn_12 failed. Unable to locate object: " + Cancel_Btn_12Elem.toString());

			Assert.fail("Unable to locate object: " + Cancel_Btn_12Elem.toString());
        }
		
		 WebElement CancelBtn=m_Driver.findElement(By.xpath("//*[@id='mailClose']"));
		 jsExec.executeScript("arguments[0].click();",CancelBtn );
		//elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Cancel_Btn_12");

		TestModellerLogger.PassStep(m_Driver, "Click_Cancel_Btn_12");
	}

     
	/**
 	 * Click Preview Btn 13
     * @name Click Preview Btn 13
     */
	public void Click_Preview_Btn_13()
	{
        
		WebElement elem = getWebElement(Preview_Btn_13Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Preview_Btn_13", "Click_Preview_Btn_13 failed. Unable to locate object: " + Preview_Btn_13Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Preview_Btn_13", "Click_Preview_Btn_13 failed. Unable to locate object: " + Preview_Btn_13Elem.toString());

			Assert.fail("Unable to locate object: " + Preview_Btn_13Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Preview_Btn_13");

		TestModellerLogger.PassStep(m_Driver, "Click_Preview_Btn_13");
	}

     
	/**
 	 * Click Save View 14
	 * @throws InterruptedException 
     * @name Click Save View 14
     */
	public void Click_Save_View_14() throws InterruptedException
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(Save_View_14Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Save_View_14", "Click_Save_View_14 failed. Unable to locate object: " + Save_View_14Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Save_View_14", "Click_Save_View_14 failed. Unable to locate object: " + Save_View_14Elem.toString());

			Assert.fail("Unable to locate object: " + Save_View_14Elem.toString());
        }

//		WebElement search = m_Driver.findElement(By.xpath("//*[contains(@id, 'ctl00_cPH_rvReport_ctl10_ctl03_ctl00')]"));
//		search.sendKeys("INV");
//		search.sendKeys(Keys.ENTER);
		
		//Thread.sleep(2000);
	//	WebElement dump = m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rvReport_ctl10_ctl03_ctl03']"));
		//m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rvReport_ctl10_ctl03_ctl03']")).click();
//		dump.click();
	//	dump.sendKeys(Keys.TAB);
	//	dump.sendKeys(Keys.ENTER);
	//	m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rvReport_ctl10_ctl05_ctl00_ctl00_ctl00']")).click();
	//	Screenshotcapture.captureAsImage(m_Driver, "PreviewRefresh");
	//	utilities.Screenshotcapture.Getscreenshot("PreviewRefresh", "Sales Dashboard");
	//	Thread.sleep(2000);
		
		//m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rvReport_ctl10_ctl05_ctl00_ctl00_ctl00']")).click();
	//	m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rvReport_ctl10_ctl03_ctl03']")).click();
		for(int i=1; i<=3;i++)
		{
		elem.click();
		m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rvReport_ctl10_ctl04_ctl00_Menu']/div["+i+"]/a")).click();
		Thread.sleep(1000);
		}
		m_Driver.switchTo().defaultContent();
	//	Screenshotcapture.captureAsImage(m_Driver, "PreviewDumps");
		utilities.Screenshotcapture.Getscreenshot("PreviewDumps", "View Quote");
		Thread.sleep(1000);
//		//*[@id="ctl00_cPH_rvReport_ctl10_ctl05_ctl00_ctl00_ctl00"]
		
		
		
		
//		elem.click();
//        
//		m_Driver.switchTo().defaultContent();
//  	

		ExtentReportManager.passStep(m_Driver, "Click_Save_View_14");

		TestModellerLogger.PassStep(m_Driver, "Click_Save_View_14");
	}

     
	/**
 	 * Click Excel 15
     * @name Click Excel 15
     */
	public void Click_Excel_15()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(Excel_15Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Excel_15", "Click_Excel_15 failed. Unable to locate object: " + Excel_15Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Excel_15", "Click_Excel_15 failed. Unable to locate object: " + Excel_15Elem.toString());

			Assert.fail("Unable to locate object: " + Excel_15Elem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_Excel_15");

		TestModellerLogger.PassStep(m_Driver, "Click_Excel_15");
	}

     
	/**
 	 * Click PDF 16
     * @name Click PDF 16
     */
	public void Click_PDF_16()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(PDF_16Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_PDF_16", "Click_PDF_16 failed. Unable to locate object: " + PDF_16Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_PDF_16", "Click_PDF_16 failed. Unable to locate object: " + PDF_16Elem.toString());

			Assert.fail("Unable to locate object: " + PDF_16Elem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_PDF_16");

		TestModellerLogger.PassStep(m_Driver, "Click_PDF_16");
	}

     
	/**
 	 * Click Word 17
     * @name Click Word 17
     */
	public void Click_Word_17()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(Word_17Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Word_17", "Click_Word_17 failed. Unable to locate object: " + Word_17Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Word_17", "Click_Word_17 failed. Unable to locate object: " + Word_17Elem.toString());

			Assert.fail("Unable to locate object: " + Word_17Elem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_Word_17");

		TestModellerLogger.PassStep(m_Driver, "Click_Word_17");
	}

     
	/**
 	 * Click close 19
	 * @throws InterruptedException 
     * @name Click close 19
     */
	public void Click_close_19() throws InterruptedException
	{
	// m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='cboxLoadedContent']/iframe")));
		
		WebElement elem = getWebElement(close_19Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_close_19", "Click_close_19 failed. Unable to locate object: " + close_19Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_close_19", "Click_close_19 failed. Unable to locate object: " + close_19Elem.toString());

			Assert.fail("Unable to locate object: " + close_19Elem.toString());
        }
		jsExec.executeScript("arguments[0].click();",elem);
	//	elem.click();
          	Thread.sleep(2000);
	//  m_Driver.switchTo().defaultContent();
		ExtentReportManager.passStep(m_Driver, "Click_close_19");

		TestModellerLogger.PassStep(m_Driver, "Click_close_19");
	}

     
	/**
 	 * Click Copy 20
     * @name Click Copy 20
     */
	public void Click_Copy_20()
	{
        
		WebElement elem = getWebElement(Copy_20Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Copy_20", "Click_Copy_20 failed. Unable to locate object: " + Copy_20Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Copy_20", "Click_Copy_20 failed. Unable to locate object: " + Copy_20Elem.toString());

			Assert.fail("Unable to locate object: " + Copy_20Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Copy_20");

		TestModellerLogger.PassStep(m_Driver, "Click_Copy_20");
	}

     
	/**
 	 * Click Save 21
     * @name Click Save 21
     */
	public void Click_Save_21()
	{
        
		WebElement elem = getWebElement(Save_21Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Save_21", "Click_Save_21 failed. Unable to locate object: " + Save_21Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Save_21", "Click_Save_21 failed. Unable to locate object: " + Save_21Elem.toString());

			Assert.fail("Unable to locate object: " + Save_21Elem.toString());
        }
		
		  jsExec.executeScript("arguments[0].scrollIntoView(true);",elem);
		  
		   elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Save_21");

		TestModellerLogger.PassStep(m_Driver, "Click_Save_21");
	}

     
	/**
 	 * Click Invoice  22
     * @name Click Invoice  22
     */
	public void Click_Invoice_22()
	{
        
		WebElement elem = getWebElement(Invoice_22Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Invoice_22", "Click_Invoice_22 failed. Unable to locate object: " + Invoice_22Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Invoice_22", "Click_Invoice_22 failed. Unable to locate object: " + Invoice_22Elem.toString());

			Assert.fail("Unable to locate object: " + Invoice_22Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Invoice_22");

		TestModellerLogger.PassStep(m_Driver, "Click_Invoice_22");
	}

     
	/**
 	 * Click Save  23
     * @name Click Save  23
     */
	public void Click_Save_23()
	{
        
		WebElement elem = getWebElement(Save_23Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Save_23", "Click_Save_23 failed. Unable to locate object: " + Save_23Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Save_23", "Click_Save_23 failed. Unable to locate object: " + Save_23Elem.toString());

			Assert.fail("Unable to locate object: " + Save_23Elem.toString());
        }
		
		 jsExec.executeScript("arguments[0].scrollIntoView(true);",elem);
		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Save_23");

		TestModellerLogger.PassStep(m_Driver, "Click_Save_23");
	}

     
	/**
 	 * Click Save  24
     * @name Click Save  24
     */
	public void Click_Save_24()
	{
        
		WebElement elem = getWebElement(Save_24Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Save_24", "Click_Save_24 failed. Unable to locate object: " + Save_24Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Save_24", "Click_Save_24 failed. Unable to locate object: " + Save_24Elem.toString());

			Assert.fail("Unable to locate object: " + Save_24Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Save_24");

		TestModellerLogger.PassStep(m_Driver, "Click_Save_24");
	}

     
	/**
 	 * Click Edit 25
     * @name Click Edit 25
     */
	public void Click_Edit_25()
	{
        
		WebElement elem = getWebElement(Edit_25Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Edit_25", "Click_Edit_25 failed. Unable to locate object: " + Edit_25Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Edit_25", "Click_Edit_25 failed. Unable to locate object: " + Edit_25Elem.toString());

			Assert.fail("Unable to locate object: " + Edit_25Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Edit_25");

		TestModellerLogger.PassStep(m_Driver, "Click_Edit_25");
	}

      
	/**
 	 * Enter Enter Edit InvoiceNo 26
     * @name Enter Enter Edit InvoiceNo 26
     */
 	public void Enter_Enter_Edit_InvoiceNo_26(String Enter_Edit_InvoiceNo_26)
 	{
 	    
 		WebElement elem = getWebElement(Enter_Edit_InvoiceNo_26Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_Edit_InvoiceNo_26", "Enter_Enter_Edit_InvoiceNo_26 failed. Unable to locate object: " + Enter_Edit_InvoiceNo_26Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_Edit_InvoiceNo_26", "Enter_Enter_Edit_InvoiceNo_26 failed. Unable to locate object: " + Enter_Edit_InvoiceNo_26Elem.toString());

 			Assert.fail("Unable to locate object: " + Enter_Edit_InvoiceNo_26Elem.toString());
         }

 		elem.sendKeys(Enter_Edit_InvoiceNo_26);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_Edit_InvoiceNo_26 " + Enter_Edit_InvoiceNo_26);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_Edit_InvoiceNo_26 " + Enter_Edit_InvoiceNo_26);
 	}

     
	/**
 	 * Click Delete 27
     * @name Click Delete 27
     */
	public void Click_Delete_27()
	{
        
		WebElement elem = getWebElement(Delete_27Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Delete_27", "Click_Delete_27 failed. Unable to locate object: " + Delete_27Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Delete_27", "Click_Delete_27 failed. Unable to locate object: " + Delete_27Elem.toString());

			Assert.fail("Unable to locate object: " + Delete_27Elem.toString());
        }
     
		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Delete_27");

		TestModellerLogger.PassStep(m_Driver, "Click_Delete_27");
	}
	
	public void Click_DeleteBtn_28()
	{
		   WebElement DeleteBtn=m_Driver.findElement(By.xpath("//*[@id='ctl00_cpHFooter_btnDelete']"));
	        jsExec.executeScript("arguments[0].scrollIntoView(true);",DeleteBtn);
	        DeleteBtn.click();
	}
	
	
	
	public void success_Edit_Msg() throws InterruptedException
	{
		Thread.sleep(2000);
		String msg=m_Driver.findElement(By.xpath("//*[@id='ctl00_divSubContent']/div[1]/div")).getText();
		String []a=msg.split(" ");
		
		
		boolean b=msg.contains("Success! Quote# "+a[2]+" updated successfully");
		Assert.assertTrue(b);
		
		utilities.Screenshotcapture.Getscreenshot("Edit Successfully Msg", "View Quote");
				
	}
	
	public void success_Delete_Msg() throws InterruptedException
	{
		Thread.sleep(2000);
		String msg=m_Driver.findElement(By.xpath("//*[@id='ctl00_divSubContent']/div[1]/div")).getText();
		String []a=msg.split(" ");
		
		// Quote# Q22 deleted successfully
		boolean b=msg.contains("Success! Quote# "+a[2]+" deleted successfully");
		Assert.assertTrue(b);
		
		utilities.Screenshotcapture.Getscreenshot("Delete Successfully Msg", "View Quote");
				
	}
	public void success_Copy_Msg() throws InterruptedException
	{
		Thread.sleep(2000);
		String msg=m_Driver.findElement(By.xpath("//*[@id='ctl00_divSubContent']/div[1]/div")).getText();
		String []a=msg.split(" ");
	//	Success! Invoice Number Q11 saved successfully
		boolean b=msg.contains("Success! Quote# "+a[2]+" added successfully");
		Assert.assertTrue(b);
		
		utilities.Screenshotcapture.Getscreenshot("Copy Successfully Msg", "View Quote");
				
	}
	
	public void success_Invoice_Msg() throws InterruptedException
	{
		Thread.sleep(2000);
		String msg=m_Driver.findElement(By.xpath("//*[@id='ctl00_divSubContent']/div[1]/div")).getText();
		String []a=msg.split(" ");
	//	Success! Invoice Number Q11 saved successfully
		boolean b=msg.contains("Success! Invoice Number "+a[3]+" saved successfully");
		Assert.assertTrue(b);
		
		utilities.Screenshotcapture.Getscreenshot("Invoice Successfully Msg", "View Quote");
				
	}
}