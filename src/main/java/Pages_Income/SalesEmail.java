package Pages_Income;

import pages.BasePage;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.Screenshotcapture;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/6d5a6767-f104-4cc0-b86f-0d89057eac93
@TestModellerModule(guid = "6d5a6767-f104-4cc0-b86f-0d89057eac93")
public class SalesEmail extends BasePage
{
	public SalesEmail (WebDriver driver)
	{
		super(driver);
	}


	
	private By EmailIconElem = By.xpath("//A[@id='ctl00_cPH_rptrDisplayRecords_ctl00_lnkSend']");

	private By previewButtonElem = By.xpath("//label[normalize-space()= 'Invoice Template']/../../div[3]/a");

	private By clicksignElem = By.xpath("//A[@id='tmpmodal']");

	private By InvoiceTemplateElem = By.xpath("//label[normalize-space()= 'Invoice/Credit Note Template:']/../div/select");

	private By clickSaveElem = By.xpath("//A[@id='ctl00_cphFooter_btnSave']");

	private By HeaderLine1Elem = By.xpath("//label[normalize-space()= 'Header Line#1:']/../div/input");

	private By HeaderLine2Elem = By.xpath("//label[normalize-space()= 'Header Line#2:']/../div/input");

	private By FooterLine1Elem = By.xpath("//label[normalize-space()= 'Footer Line#1:']/../div/input");

	private By FooterLine2Elem = By.xpath("//label[normalize-space()= 'Footer Line#2:']/../div/input");

	private By checkMyselfElem = By.xpath("//label[normalize-space()= 'Myself ( @gmail.com )']/../input");

	private By EnterEmailElem = By.xpath("//label[normalize-space()= 'Myself ( @gmail.com )']/../../input");

	private By EmailBodyElem = By.cssSelector("BODY[marginwidth='\\30 ']");

	private By clickSend2Elem = By.xpath("//A[@id='ctl00_cphFooter_btnSave']");

	private By EmailTemplateElem = By.xpath("//label[normalize-space()= 'Email Template']/../../div[2]/select");

	private By TemplateElem = By.xpath("//label[normalize-space()= 'Invoice Template']/../../div[2]/div/select");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=117146&CompanyCode=16819&IsFirstRequest=1");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=117146&CompanyCode=16819&IsFirstRequest=1");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=117146&CompanyCode=16819&IsFirstRequest=1");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=117146&CompanyCode=16819&IsFirstRequest=1";

        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=117146&CompanyCode=16819&IsFirstRequest=1")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click EmailIcon
     * @name Click EmailIcon
     */
	public void Click_EmailIcon()
	{
        
		WebElement elem = getWebElement(EmailIconElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_EmailIcon", "Click_EmailIcon failed. Unable to locate object: " + EmailIconElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_EmailIcon", "Click_EmailIcon failed. Unable to locate object: " + EmailIconElem.toString());

			Assert.fail("Unable to locate object: " + EmailIconElem.toString());
        }

		boolean value=elem.isDisplayed();
		System.out.println("boolean="+value);
		Assert.assertTrue(value);
		elem.click();
		
		
          	

		ExtentReportManager.passStep(m_Driver, "Click_EmailIcon");

		TestModellerLogger.PassStep(m_Driver, "Click_EmailIcon");
	}
	
	/**
	 * Take screen shot when email logo click
	 * @throws AWTException 
	 * @throws IOException 
	 * @throws HeadlessException 
	 */
	public void emaillogoclicksc() throws HeadlessException, IOException, AWTException
	{
		
		Screenshotcapture.captureAsImage(m_Driver, "Popup when clicked on Email");
			}
	
	
	/**
	 * Take screen shot when email logo click
	 * @throws AWTException 
	 * @throws IOException 
	 * @throws HeadlessException 
	 */
	public void plusclicksc() throws HeadlessException, IOException, AWTException
	{
		
		Screenshotcapture.captureAsImage(m_Driver, "Popup when clicked on Plus");
			}
	

     
	/**
 	 * Click previewButton
     * @name Click previewButton
     */
	public void Click_previewButton()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[5]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(previewButtonElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_previewButton", "Click_previewButton failed. Unable to locate object: " + previewButtonElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_previewButton", "Click_previewButton failed. Unable to locate object: " + previewButtonElem.toString());

			Assert.fail("Unable to locate object: " + previewButtonElem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_previewButton");

		TestModellerLogger.PassStep(m_Driver, "Click_previewButton");
	}

     
	/**
 	 * Click click+sign
     * @name Click click+sign
     */
	public void Click_clicksign()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[5]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(clicksignElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clicksign", "Click_clicksign failed. Unable to locate object: " + clicksignElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clicksign", "Click_clicksign failed. Unable to locate object: " + clicksignElem.toString());

			Assert.fail("Unable to locate object: " + clicksignElem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_clicksign");

		TestModellerLogger.PassStep(m_Driver, "Click_clicksign");
	}

    
	/**
 	 * Select InvoiceTemplate
     * @name Select InvoiceTemplate
     */
    public void Select_InvoiceTemplate(String InvoiceTemplate)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[5]/div/div/div[2]/iframe")));

		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/div[3]/div[2]/div[2]/div/div[1]/div[2]/div/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(InvoiceTemplateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_InvoiceTemplate", "Select_InvoiceTemplate failed. Unable to locate object: " + InvoiceTemplateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_InvoiceTemplate", "Select_InvoiceTemplate failed. Unable to locate object: " + InvoiceTemplateElem.toString());

 			Assert.fail("Unable to locate object: " + InvoiceTemplateElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(InvoiceTemplate);
 		
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_InvoiceTemplate " + InvoiceTemplate);

 		TestModellerLogger.PassStep(m_Driver, "Select_InvoiceTemplate " + InvoiceTemplate);
 	}

     
	/**
 	 * Click clickSave
     * @name Click clickSave
     */
	public void Click_clickSave()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[5]/div/div/div[2]/iframe")));

		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/div[3]/div[2]/div[2]/div/div[1]/div[2]/div/div[2]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(clickSaveElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickSave", "Click_clickSave failed. Unable to locate object: " + clickSaveElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickSave", "Click_clickSave failed. Unable to locate object: " + clickSaveElem.toString());

			Assert.fail("Unable to locate object: " + clickSaveElem.toString());
        }

		jsExec.executeScript("arguments[0].scrollIntoView()", elem);
		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_clickSave");

		TestModellerLogger.PassStep(m_Driver, "Click_clickSave");
	}

      
	/**
 	 * Enter HeaderLine1
     * @name Enter HeaderLine1
     */
 	public void Enter_HeaderLine1(String HeaderLine1)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[5]/div/div/div[2]/iframe")));

		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/div[3]/div[2]/div[2]/div/div[1]/div[2]/div/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(HeaderLine1Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_HeaderLine1", "Enter_HeaderLine1 failed. Unable to locate object: " + HeaderLine1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_HeaderLine1", "Enter_HeaderLine1 failed. Unable to locate object: " + HeaderLine1Elem.toString());

 			Assert.fail("Unable to locate object: " + HeaderLine1Elem.toString());
         }

 		elem.sendKeys(HeaderLine1);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_HeaderLine1 " + HeaderLine1);

  		TestModellerLogger.PassStep(m_Driver, "Enter_HeaderLine1 " + HeaderLine1);
 	}

      
	/**
 	 * Enter HeaderLine2
     * @name Enter HeaderLine2
     */
 	public void Enter_HeaderLine2(String HeaderLine2)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[5]/div/div/div[2]/iframe")));

		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/div[3]/div[2]/div[2]/div/div[1]/div[2]/div/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(HeaderLine2Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_HeaderLine2", "Enter_HeaderLine2 failed. Unable to locate object: " + HeaderLine2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_HeaderLine2", "Enter_HeaderLine2 failed. Unable to locate object: " + HeaderLine2Elem.toString());

 			Assert.fail("Unable to locate object: " + HeaderLine2Elem.toString());
         }

 		elem.sendKeys(HeaderLine2);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_HeaderLine2 " + HeaderLine2);

  		TestModellerLogger.PassStep(m_Driver, "Enter_HeaderLine2 " + HeaderLine2);
 	}

      
	/**
 	 * Enter FooterLine1
     * @name Enter FooterLine1
     */
 	public void Enter_FooterLine1(String FooterLine1)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[5]/div/div/div[2]/iframe")));

		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/div[3]/div[2]/div[2]/div/div[1]/div[2]/div/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(FooterLine1Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_FooterLine1", "Enter_FooterLine1 failed. Unable to locate object: " + FooterLine1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_FooterLine1", "Enter_FooterLine1 failed. Unable to locate object: " + FooterLine1Elem.toString());

 			Assert.fail("Unable to locate object: " + FooterLine1Elem.toString());
         }

 		elem.sendKeys(FooterLine1);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_FooterLine1 " + FooterLine1);

  		TestModellerLogger.PassStep(m_Driver, "Enter_FooterLine1 " + FooterLine1);
 	}

      
	/**
 	 * Enter FooterLine2
     * @name Enter FooterLine2
     */
 	public void Enter_FooterLine2(String FooterLine2)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[5]/div/div/div[2]/iframe")));

		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/div[3]/div[2]/div[2]/div/div[1]/div[2]/div/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(FooterLine2Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_FooterLine2", "Enter_FooterLine2 failed. Unable to locate object: " + FooterLine2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_FooterLine2", "Enter_FooterLine2 failed. Unable to locate object: " + FooterLine2Elem.toString());

 			Assert.fail("Unable to locate object: " + FooterLine2Elem.toString());
         }

 		elem.sendKeys(FooterLine2);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_FooterLine2 " + FooterLine2);

  		TestModellerLogger.PassStep(m_Driver, "Enter_FooterLine2 " + FooterLine2);
 	}

     
	/**
 	 * Click checkMyself
     * @name Click checkMyself
     */
	public void Click_checkMyself()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[5]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(checkMyselfElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_checkMyself", "Click_checkMyself failed. Unable to locate object: " + checkMyselfElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_checkMyself", "Click_checkMyself failed. Unable to locate object: " + checkMyselfElem.toString());

			Assert.fail("Unable to locate object: " + checkMyselfElem.toString());
        }

	//	elem.click();
		
		boolean chkboxvalue=elem.isSelected();
		
		System.out.println("chkbox="+chkboxvalue);
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_checkMyself");

		TestModellerLogger.PassStep(m_Driver, "Click_checkMyself");
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
 	 * Click EmailBody
     * @name Click EmailBody
     */
	public void Click_EmailBody()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[5]/div/div/div[2]/iframe")));

		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/div[3]/div[2]/div[2]/div/div[7]/div[2]/div/table/tbody/tr[2]/td/div/iframe[1]")));

		WebElement elem = getWebElement(EmailBodyElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_EmailBody", "Click_EmailBody failed. Unable to locate object: " + EmailBodyElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_EmailBody", "Click_EmailBody failed. Unable to locate object: " + EmailBodyElem.toString());

			Assert.fail("Unable to locate object: " + EmailBodyElem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_EmailBody");

		TestModellerLogger.PassStep(m_Driver, "Click_EmailBody");
	}

     
	/**
 	 * Click clickSend2
     * @name Click clickSend2
     */
	public void Click_clickSend2()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[5]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(clickSend2Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickSend2", "Click_clickSend2 failed. Unable to locate object: " + clickSend2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickSend2", "Click_clickSend2 failed. Unable to locate object: " + clickSend2Elem.toString());

			Assert.fail("Unable to locate object: " + clickSend2Elem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_clickSend2");

		TestModellerLogger.PassStep(m_Driver, "Click_clickSend2");
	}

    
	/**
 	 * Select EmailTemplate
     * @name Select EmailTemplate
     */
    public void Select_EmailTemplate(String EmailTemplate)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[5]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(EmailTemplateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_EmailTemplate", "Select_EmailTemplate failed. Unable to locate object: " + EmailTemplateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_EmailTemplate", "Select_EmailTemplate failed. Unable to locate object: " + EmailTemplateElem.toString());

 			Assert.fail("Unable to locate object: " + EmailTemplateElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(EmailTemplate);
 		
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_EmailTemplate " + EmailTemplate);

 		TestModellerLogger.PassStep(m_Driver, "Select_EmailTemplate " + EmailTemplate);
 	}

    
	/**
 	 * Select Template
     * @name Select Template
     */
    public void Select_Template(String Template)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[5]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(TemplateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Template", "Select_Template failed. Unable to locate object: " + TemplateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Template", "Select_Template failed. Unable to locate object: " + TemplateElem.toString());

 			Assert.fail("Unable to locate object: " + TemplateElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Template);
 		
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_Template " + Template);

 		TestModellerLogger.PassStep(m_Driver, "Select_Template " + Template);
 	}
}