package pages.Receive_Payment;

import pages.BasePage;

import javax.swing.text.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/6889e15d-a1ca-44b5-bacf-d975d423be2b
@TestModellerModule(guid = "6889e15d-a1ca-44b5-bacf-d975d423be2b")
public class ReceivePayment extends BasePage
{
	Dimension d = new Dimension(300,1080);
	public ReceivePayment (WebDriver driver)
	{
		super(driver);
	}


	
	private By Lft_Sales_menu_1Elem = By.xpath("//LI[@id='ctl00_SideMenu1_incomeMenu']/A[@class='']");

	private By dotelem= By.xpath("//*[@id='ctl00_cPH_filtrec']/div/div/table/tbody/tr[1]/td[16]");

	private By Click_Receive_payment_2Elem = By.xpath("//*[@id='ctl00_cPH_rptrDisplayRecords_ctl00_lnkReceivePayment']");

	private By Enter_AmtPaid_3Elem = By.xpath("//*[@id='ctl00_cPH_txtAmtPaid']");

	private By Enter_DatePaid_4Elem = By.xpath("//label[normalize-space()= 'Date Paid*']/../../div[2]/input");

	private By Enter_Account_5Elem = By.xpath("//label[normalize-space()= 'Paid To*']/../../div[2]/select");

	private By Enter_Des_6Elem = By.xpath("//label[normalize-space()= 'Description']/../../div[2]/input");

	private By Click_Sve__btn_7Elem = By.xpath("//A[@id='ctl00_cphFooter_btnSave']");

	private By Click_Cancel_btn_8Elem = By.xpath("//A[@id='ctl00_cphFooter_btnCancelModal']");

	private By Click_Cross_image_9Elem = By.xpath("//BUTTON[contains(text(),'×')]");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AccountUI/InvoiceEditor.aspx?FYCode=117421&CompanyCode=17084&id=201565&it=C&action=Copy");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/InvoiceEditor.aspx?FYCode=117421&CompanyCode=17084&id=201565&it=C&action=Copy");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/InvoiceEditor.aspx?FYCode=117421&CompanyCode=17084&id=201565&it=C&action=Copy");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/AccountUI/InvoiceEditor.aspx?FYCode=117421&CompanyCode=17084&id=201565&it=C&action=Copy";

        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/AccountUI/InvoiceEditor.aspx?FYCode=117421&CompanyCode=17084&id=201565&it=C&action=Copy")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click Lft_Sales_menu_1
     * @name Click Lft_Sales_menu_1
     */
	public void Click_Lft_Sales_menu_1()
	{
        
		WebElement elem = getWebElement(Lft_Sales_menu_1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Lft_Sales_menu_1", "Click_Lft_Sales_menu_1 failed. Unable to locate object: " + Lft_Sales_menu_1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Lft_Sales_menu_1", "Click_Lft_Sales_menu_1 failed. Unable to locate object: " + Lft_Sales_menu_1Elem.toString());

			Assert.fail("Unable to locate object: " + Lft_Sales_menu_1Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Lft_Sales_menu_1");

		TestModellerLogger.PassStep(m_Driver, "Click_Lft_Sales_menu_1");
	}

     
	/**
 	 * Click xPath: '/html/body/form/main/div[11]/div[3]/div/div[4]/div[3]/div/div/table/tbody/tr[1]/td[15]/div/
     * @name Click xPath: '/html/body/form/main/div[11]/div[3]/div/div[4]/div[3]/div/div/table/tbody/tr[1]/td[15]/div/
     */
	public void click_3dot()
	{
        
	//	WebElement elem = getWebElement(3dot);

//	//	if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_xPath_htmlbodyformmaindiv11div3divdiv4div3divdivtabletbodytr1td15div", "Click_xPath_htmlbodyformmaindiv11div3divdiv4div3divdivtabletbodytr1td15div failed. Unable to locate object: " + 3dot.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_xPath_htmlbodyformmaindiv11div3divdiv4div3divdivtabletbodytr1td15div", "Click_xPath_htmlbodyformmaindiv11div3divdiv4div3divdivtabletbodytr1td15div failed. Unable to locate object: " + 3dot.toString());
//
//			Assert.fail("Unable to locate object: " + 3dot.toString());
//        }
//
//		elem.click();
		WebElement elem=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_filtrec']/div/div/table/tbody/tr[1]/td[15]/div/a/i"));
		elem.click();

	//ExtentReportManager.passStep(m_Driver, "Click_xPath_htmlbodyformmaindiv11div3divdiv4div3divdivtabletbodytr1td15div");

		//TestModellerLogger.PassStep(m_Driver, "Click_xPath_htmlbodyformmaindiv11div3divdiv4div3divdivtabletbodytr1td15div");
	}

     
	/**
 	 * Click Click_Receive_payment_2
	 * @throws InterruptedException 
     * @name Click Click_Receive_payment_2
     */
	public void Click_Click_Receive_payment_2() throws InterruptedException
	{
		
		WebElement elem = getWebElement(Click_Receive_payment_2Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Click_Receive_payment_2", "Click_Click_Receive_payment_2 failed. Unable to locate object: " + Click_Receive_payment_2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Click_Receive_payment_2", "Click_Click_Receive_payment_2 failed. Unable to locate object: " + Click_Receive_payment_2Elem.toString());

			Assert.fail("Unable to locate object: " + Click_Receive_payment_2Elem.toString());
        }

		elem.click();
		
		utilities.PassScreenshot.Getscreenshot11("click on receive payment","ReceivePayment");
		ExtentReportManager.passStep(m_Driver, "Rec");

		TestModellerLogger.PassStep(m_Driver, "Click_Click_Receive_payment_2");
	}

      
	/**
 	 * Enter Enter_AmtPaid_3
     * @name Enter Enter_AmtPaid_3
     */
 	public void Enter_Enter_AmtPaid_3(String Enter_AmtPaid_3)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[5]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Enter_AmtPaid_3Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_AmtPaid_3", "Enter_Enter_AmtPaid_3 failed. Unable to locate object: " + Enter_AmtPaid_3Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_AmtPaid_3", "Enter_Enter_AmtPaid_3 failed. Unable to locate object: " + Enter_AmtPaid_3Elem.toString());

 			Assert.fail("Unable to locate object: " + Enter_AmtPaid_3Elem.toString());
         }
 	 	elem.click();
	  elem.sendKeys(Keys.CONTROL,"a",Keys.DELETE);
 		elem.sendKeys(Enter_AmtPaid_3);
 		jsExec.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", elem);
		//utilities.PassScreenshot.Getscreenshot11("amont paid","ReceivePayment");
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_AmtPaid_3 " + Enter_AmtPaid_3);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_AmtPaid_3 " + Enter_AmtPaid_3);
 	}

      
	/**
 	 * Enter Enter_DatePaid_4
     * @name Enter Enter_DatePaid_4
     */
 	public void Enter_Enter_DatePaid_4(String Enter_DatePaid_4)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[5]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Enter_DatePaid_4Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_DatePaid_4", "Enter_Enter_DatePaid_4 failed. Unable to locate object: " + Enter_DatePaid_4Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_DatePaid_4", "Enter_Enter_DatePaid_4 failed. Unable to locate object: " + Enter_DatePaid_4Elem.toString());

 			Assert.fail("Unable to locate object: " + Enter_DatePaid_4Elem.toString());
         }

 		elem.sendKeys(Enter_DatePaid_4);

		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_DatePaid_4 " + Enter_DatePaid_4);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_DatePaid_4 " + Enter_DatePaid_4);
 	}

    
	/**
 	 * Select Enter_Account_5
     * @name Select Enter_Account_5
     */
    public void Select_Enter_Account_5(String Enter_Account_5)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[5]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Enter_Account_5Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Enter_Account_5", "Select_Enter_Account_5 failed. Unable to locate object: " + Enter_Account_5Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Enter_Account_5", "Select_Enter_Account_5 failed. Unable to locate object: " + Enter_Account_5Elem.toString());

 			Assert.fail("Unable to locate object: " + Enter_Account_5Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Enter_Account_5);
 		
 		
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_Enter_Account_5 " + Enter_Account_5);

 		TestModellerLogger.PassStep(m_Driver, "Select_Enter_Account_5 " + Enter_Account_5);
 	}

      
	/**
 	 * Enter Enter_Des_6
     * @name Enter Enter_Des_6
     */
 	public void Enter_Enter_Des_6(String Enter_Des_6)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[5]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Enter_Des_6Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_Des_6", "Enter_Enter_Des_6 failed. Unable to locate object: " + Enter_Des_6Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_Des_6", "Enter_Enter_Des_6 failed. Unable to locate object: " + Enter_Des_6Elem.toString());

 			Assert.fail("Unable to locate object: " + Enter_Des_6Elem.toString());
         }

 		elem.sendKeys("Paid");
		utilities.PassScreenshot.Getscreenshot11("Desc","ReceivePayment");
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_Des_6 " + Enter_Des_6);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_Des_6 " + Enter_Des_6);
 	}

     
	/**
 	 * Click Click_Sve _btn_7
	 * @throws InterruptedException 
     * @name Click Click_Sve _btn_7
     */
	public void Click_Click_Sve__btn_7() throws InterruptedException
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[5]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(Click_Sve__btn_7Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Click_Sve__btn_7", "Click_Click_Sve__btn_7 failed. Unable to locate object: " + Click_Sve__btn_7Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Click_Sve__btn_7", "Click_Click_Sve__btn_7 failed. Unable to locate object: " + Click_Sve__btn_7Elem.toString());

			Assert.fail("Unable to locate object: " + Click_Sve__btn_7Elem.toString());
        }

		elem.click();
	
		
		m_Driver.switchTo().defaultContent();
				Thread.sleep(3000);
				//m_Driver.manage().window().setSize(d);
		
		ExtentReportManager.passStep(m_Driver, "Click_Click_Sve__btn_7");

		TestModellerLogger.PassStep(m_Driver, "Click_Click_Sve__btn_7");
	}

     
	/**
 	 * Click Click_Cancel_btn_8
     * @name Click Click_Cancel_btn_8
     */
	public void Click_Click_Cancel_btn_8()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[5]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(Click_Cancel_btn_8Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Click_Cancel_btn_8", "Click_Click_Cancel_btn_8 failed. Unable to locate object: " + Click_Cancel_btn_8Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Click_Cancel_btn_8", "Click_Click_Cancel_btn_8 failed. Unable to locate object: " + Click_Cancel_btn_8Elem.toString());

			Assert.fail("Unable to locate object: " + Click_Cancel_btn_8Elem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_Click_Cancel_btn_8");

		TestModellerLogger.PassStep(m_Driver, "Click_Click_Cancel_btn_8");
	}

     
	/**
 	 * Click Click_Cross_image_9
     * @name Click Click_Cross_image_9
     */
	public void Click_Click_Cross_image_9()
	{
        
		WebElement elem = getWebElement(Click_Cross_image_9Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Click_Cross_image_9", "Click_Click_Cross_image_9 failed. Unable to locate object: " + Click_Cross_image_9Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Click_Cross_image_9", "Click_Click_Cross_image_9 failed. Unable to locate object: " + Click_Cross_image_9Elem.toString());

			Assert.fail("Unable to locate object: " + Click_Cross_image_9Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Click_Cross_image_9");

		TestModellerLogger.PassStep(m_Driver, "Click_Click_Cross_image_9");
	}
}