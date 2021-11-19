package pages.Sales_customer_add;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/665e28c9-8d9f-4e99-80a0-49aa7e791bd1
@TestModellerModule(guid = "665e28c9-8d9f-4e99-80a0-49aa7e791bd1")
public class Sendstatement extends BasePage
{
	public Sendstatement (WebDriver driver)
	{
		super(driver);
	}


	
	private By Send_Statement_1Elem = By.xpath("//A[@id='ctl00_cPH_rptrRecordsLimited_ctl00_lnkmail']");

	private By Export_To_Excel_2Elem = By.xpath("//A[@id='ctl00_cPH_btnExportToExcel']");

	private By Sent_Mail_icon_3Elem = By.xpath("//A[@title='Send Mail']");

	private By Select_Banks_Details_4Elem = By.xpath("//SELECT[@name='ctl00$cPH$ddlBanks']");

	private By Select_DateFrom_5Elem = By.xpath("//INPUT[@name='ctl00$cPH$txtDateFrom']");

	private By Select_DateTo_6Elem = By.xpath("//INPUT[@name='ctl00$cPH$txtDateTo']");

	private By Click_Search_btn_7Elem = By.xpath("//A[@id='ctl00_cPH_btnUpdate']");

	private By Click_on__PDF_8Elem = By.xpath("//A[@id='ctl00_cPH_btnExportToPdf']");

	private By Export_to_PDF_With_Cover_LetterElem = By.xpath("//A[@id='ctl00_cPH_btnExportToPdf_Cover']");

	private By Click_lEmailTemplate_3_1Elem = By.xpath("//label[normalize-space()= 'Email Template']/../div/select");

	private By Enter_Email_id_3_2Elem = By.xpath("//*[@id='ctl00_cPH_chkCustomerEmail']");

	private By Enter_tEmail_id3_3Elem = By.xpath("//INPUT[@name='ctl00$cPH$txtEmail']");

	private By Enter_Subject_3_4Elem = By.xpath("//label[normalize-space()= 'Subject']/../div/input");

	private By Click__Send__bttn_3_5Elem = By.xpath("//A[@id='ctl00_cphFooter_btnSave']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AccountUI/Customer.aspx?FYCode=117199&CompanyCode=16862&menuid=0&cn=Editname4&at=&dd=CustomerName&do=%3E&pt=0&crm=0&ccst=0");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/Customer.aspx?FYCode=117199&CompanyCode=16862&menuid=0&cn=Editname4&at=&dd=CustomerName&do=%3E&pt=0&crm=0&ccst=0");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/Customer.aspx?FYCode=117199&CompanyCode=16862&menuid=0&cn=Editname4&at=&dd=CustomerName&do=%3E&pt=0&crm=0&ccst=0");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/AccountUI/Customer.aspx?FYCode=117199&CompanyCode=16862&menuid=0&cn=Editname4&at=&dd=CustomerName&do=%3E&pt=0&crm=0&ccst=0";

        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/AccountUI/Customer.aspx?FYCode=117199&CompanyCode=16862&menuid=0&cn=Editname4&at=&dd=CustomerName&do=%3E&pt=0&crm=0&ccst=0")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click Send_Statement_1
     * @name Click Send_Statement_1
     */
	public void Click_Send_Statement_1()
	{
        
		WebElement elem = getWebElement(Send_Statement_1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Send_Statement_1", "Click_Send_Statement_1 failed. Unable to locate object: " + Send_Statement_1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Send_Statement_1", "Click_Send_Statement_1 failed. Unable to locate object: " + Send_Statement_1Elem.toString());

			Assert.fail("Unable to locate object: " + Send_Statement_1Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Send_Statement_1");

		TestModellerLogger.PassStep(m_Driver, "Click_Send_Statement_1");
	}

     
	/**
 	 * Click Export_To_Excel_2
     * @name Click Export_To_Excel_2
     */
	public void Click_Export_To_Excel_2()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(Export_To_Excel_2Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Export_To_Excel_2", "Click_Export_To_Excel_2 failed. Unable to locate object: " + Export_To_Excel_2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Export_To_Excel_2", "Click_Export_To_Excel_2 failed. Unable to locate object: " + Export_To_Excel_2Elem.toString());

			Assert.fail("Unable to locate object: " + Export_To_Excel_2Elem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_Export_To_Excel_2");

		TestModellerLogger.PassStep(m_Driver, "Click_Export_To_Excel_2");
	}

     
	/**
 	 * Click Sent_Mail_icon_3
     * @name Click Sent_Mail_icon_3
     */
	public void Click_Sent_Mail_icon_3()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(Sent_Mail_icon_3Elem);

//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Sent_Mail_icon_3", "Click_Sent_Mail_icon_3 failed. Unable to locate object: " + Sent_Mail_icon_3Elem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Sent_Mail_icon_3", "Click_Sent_Mail_icon_3 failed. Unable to locate object: " + Sent_Mail_icon_3Elem.toString());
//
//			Assert.fail("Unable to locate object: " + Sent_Mail_icon_3Elem.toString());
//        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();

		ExtentReportManager.passStep(m_Driver, "Click_Sent_Mail_icon_3");

		TestModellerLogger.PassStep(m_Driver, "Click_Sent_Mail_icon_3");
	}

    
	/**
 	 * Select Select_Banks_Details_4
     * @name Select Select_Banks_Details_4
     */
    public void Select_Select_Banks_Details_4(String Select_Banks_Details_4)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(Select_Banks_Details_4Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Select_Banks_Details_4", "Select_Select_Banks_Details_4 failed. Unable to locate object: " + Select_Banks_Details_4Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Select_Banks_Details_4", "Select_Select_Banks_Details_4 failed. Unable to locate object: " + Select_Banks_Details_4Elem.toString());

 			Assert.fail("Unable to locate object: " + Select_Banks_Details_4Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Select_Banks_Details_4);
 		
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_Select_Banks_Details_4 " + Select_Banks_Details_4);

 		TestModellerLogger.PassStep(m_Driver, "Select_Select_Banks_Details_4 " + Select_Banks_Details_4);
 	}

      
	/**
 	 * Enter Select_DateFrom_5
     * @name Enter Select_DateFrom_5
     */
 	public void Enter_Select_DateFrom_5(String Select_DateFrom_5)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(Select_DateFrom_5Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Select_DateFrom_5", "Enter_Select_DateFrom_5 failed. Unable to locate object: " + Select_DateFrom_5Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Select_DateFrom_5", "Enter_Select_DateFrom_5 failed. Unable to locate object: " + Select_DateFrom_5Elem.toString());

 			Assert.fail("Unable to locate object: " + Select_DateFrom_5Elem.toString());
         }

 		elem.sendKeys(Select_DateFrom_5);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Select_DateFrom_5 " + Select_DateFrom_5);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Select_DateFrom_5 " + Select_DateFrom_5);
 	}

      
	/**
 	 * Enter Select_DateTo_6
     * @name Enter Select_DateTo_6
     */
 	public void Enter_Select_DateTo_6(String Select_DateTo_6)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(Select_DateTo_6Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Select_DateTo_6", "Enter_Select_DateTo_6 failed. Unable to locate object: " + Select_DateTo_6Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Select_DateTo_6", "Enter_Select_DateTo_6 failed. Unable to locate object: " + Select_DateTo_6Elem.toString());

 			Assert.fail("Unable to locate object: " + Select_DateTo_6Elem.toString());
         }

 		elem.sendKeys(Select_DateTo_6);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Select_DateTo_6 " + Select_DateTo_6);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Select_DateTo_6 " + Select_DateTo_6);
 	}

     
	/**
 	 * Click Click_Search_btn_7
     * @name Click Click_Search_btn_7
     */
	public void Click_Click_Search_btn_7()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(Click_Search_btn_7Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Click_Search_btn_7", "Click_Click_Search_btn_7 failed. Unable to locate object: " + Click_Search_btn_7Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Click_Search_btn_7", "Click_Click_Search_btn_7 failed. Unable to locate object: " + Click_Search_btn_7Elem.toString());

			Assert.fail("Unable to locate object: " + Click_Search_btn_7Elem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_Click_Search_btn_7");

		TestModellerLogger.PassStep(m_Driver, "Click_Click_Search_btn_7");
	}

     
	/**
 	 * Click Click_on _PDF_8
     * @name Click Click_on _PDF_8
     */
	public void Click_Click_on__PDF_8()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(Click_on__PDF_8Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Click_on__PDF_8", "Click_Click_on__PDF_8 failed. Unable to locate object: " + Click_on__PDF_8Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Click_on__PDF_8", "Click_Click_on__PDF_8 failed. Unable to locate object: " + Click_on__PDF_8Elem.toString());

			Assert.fail("Unable to locate object: " + Click_on__PDF_8Elem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_Click_on__PDF_8");

		TestModellerLogger.PassStep(m_Driver, "Click_Click_on__PDF_8");
	}

     
	/**
 	 * Click Export to PDF With Cover Letter
     * @name Click Export to PDF With Cover Letter
     */
	public void Click_Export_to_PDF_With_Cover_Letter()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(Export_to_PDF_With_Cover_LetterElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Export_to_PDF_With_Cover_Letter", "Click_Export_to_PDF_With_Cover_Letter failed. Unable to locate object: " + Export_to_PDF_With_Cover_LetterElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Export_to_PDF_With_Cover_Letter", "Click_Export_to_PDF_With_Cover_Letter failed. Unable to locate object: " + Export_to_PDF_With_Cover_LetterElem.toString());

			Assert.fail("Unable to locate object: " + Export_to_PDF_With_Cover_LetterElem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_Export_to_PDF_With_Cover_Letter");

		TestModellerLogger.PassStep(m_Driver, "Click_Export_to_PDF_With_Cover_Letter");
	}

    
	/**
 	 * Select Click_lEmailTemplate_3_1
     * @name Select Click_lEmailTemplate_3_1
     */
    public void Select_Click_lEmailTemplate_3_1(String Click_lEmailTemplate_3_1)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(Click_lEmailTemplate_3_1Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Click_lEmailTemplate_3_1", "Select_Click_lEmailTemplate_3_1 failed. Unable to locate object: " + Click_lEmailTemplate_3_1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Click_lEmailTemplate_3_1", "Select_Click_lEmailTemplate_3_1 failed. Unable to locate object: " + Click_lEmailTemplate_3_1Elem.toString());

 			Assert.fail("Unable to locate object: " + Click_lEmailTemplate_3_1Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Click_lEmailTemplate_3_1);
 		
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_Click_lEmailTemplate_3_1 " + Click_lEmailTemplate_3_1);

 		TestModellerLogger.PassStep(m_Driver, "Select_Click_lEmailTemplate_3_1 " + Click_lEmailTemplate_3_1);
 	}

     
	/**
 	 * Click Enter_Email_id_3_2
     * @name Click Enter_Email_id_3_2
     */
	public void Click_Enter_Email_id_3_2()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(Enter_Email_id_3_2Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Enter_Email_id_3_2", "Click_Enter_Email_id_3_2 failed. Unable to locate object: " + Enter_Email_id_3_2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Enter_Email_id_3_2", "Click_Enter_Email_id_3_2 failed. Unable to locate object: " + Enter_Email_id_3_2Elem.toString());

			Assert.fail("Unable to locate object: " + Enter_Email_id_3_2Elem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));
WebElement elem2=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_chkMarkMySelf']"));
elem2.click();
m_Driver.switchTo().defaultContent();
		ExtentReportManager.passStep(m_Driver, "Click_Enter_Email_id_3_2");

		TestModellerLogger.PassStep(m_Driver, "Click_Enter_Email_id_3_2");
	}

      
	/**
 	 * Enter Enter_tEmail_id3_3
     * @name Enter Enter_tEmail_id3_3
     */
 	public void Enter_Enter_tEmail_id3_3(String Enter_tEmail_id3_3)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(Enter_tEmail_id3_3Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_tEmail_id3_3", "Enter_Enter_tEmail_id3_3 failed. Unable to locate object: " + Enter_tEmail_id3_3Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_tEmail_id3_3", "Enter_Enter_tEmail_id3_3 failed. Unable to locate object: " + Enter_tEmail_id3_3Elem.toString());

 			Assert.fail("Unable to locate object: " + Enter_tEmail_id3_3Elem.toString());
         }

 		elem.sendKeys(Enter_tEmail_id3_3);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_tEmail_id3_3 " + Enter_tEmail_id3_3);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_tEmail_id3_3 " + Enter_tEmail_id3_3);
 	}

      
	/**
 	 * Enter Enter_Subject_3_4
     * @name Enter Enter_Subject_3_4
     */
 	public void Enter_Enter_Subject_3_4(String Enter_Subject_3_4)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(Enter_Subject_3_4Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_Subject_3_4", "Enter_Enter_Subject_3_4 failed. Unable to locate object: " + Enter_Subject_3_4Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_Subject_3_4", "Enter_Enter_Subject_3_4 failed. Unable to locate object: " + Enter_Subject_3_4Elem.toString());

 			Assert.fail("Unable to locate object: " + Enter_Subject_3_4Elem.toString());
         }

 		elem.sendKeys(Enter_Subject_3_4);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_Subject_3_4 " + Enter_Subject_3_4);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_Subject_3_4 " + Enter_Subject_3_4);
 	}

     
	/**
 	 * Click Click_ Send _bttn_3_5
     * @name Click Click_ Send _bttn_3_5
     */
	public void Click_Click__Send__bttn_3_5()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(Click__Send__bttn_3_5Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Click__Send__bttn_3_5", "Click_Click__Send__bttn_3_5 failed. Unable to locate object: " + Click__Send__bttn_3_5Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Click__Send__bttn_3_5", "Click_Click__Send__bttn_3_5 failed. Unable to locate object: " + Click__Send__bttn_3_5Elem.toString());

			Assert.fail("Unable to locate object: " + Click__Send__bttn_3_5Elem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
		
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));
		String exp="Success! Your email is in a queue to be sent.";
		String act=m_Driver.findElement(By.xpath("/html/body/form/div[3]/div[1]")).getText();
		
		System.out.println("confirmationmessage" +act);
		utilities.PassScreenshot.Getscreenshot11("confimationmessage","Statement mail");
		SoftAssert st=new SoftAssert();
		st.assertEquals(act,exp);
		st.assertAll();
				utilities.PassScreenshot.Getscreenshot11("mail sent","Statment mail");
		m_Driver.switchTo().defaultContent();
		ExtentReportManager.passStep(m_Driver, "Click_Click__Send__bttn_3_5");

		TestModellerLogger.PassStep(m_Driver, "Click_Click__Send__bttn_3_5");
	}
}