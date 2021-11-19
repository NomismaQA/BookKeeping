package pages.Sales_customer_add;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/77aafcea-a13d-4e8f-9821-73195ffacab5
@TestModellerModule(guid = "77aafcea-a13d-4e8f-9821-73195ffacab5")
public class EmailFunction extends BasePage
{
	public EmailFunction (WebDriver driver)
	{
		super(driver);
	}


	
	private By Select_Banks_1Elem = By.xpath("//label[normalize-space()= 'Bank Name:']/../div/select");

	private By Enter_DateFrom_2Elem = By.xpath("//label[normalize-space()= 'Date Range:']/../div/input[1]");

	private By Enter_DateTo_3Elem = By.xpath("//label[normalize-space()= 'Date Range:']/../div/input[2]");

	private By Select__lEmailTemplate_4Elem = By.xpath("//label[normalize-space()= 'Email Template:']/../div/select");

	private By Enter_Mail_id_5Elem = By.xpath("//label[normalize-space()= 'f9g303@gmail.com']/../input");

	private By Enter_Subject_6Elem = By.xpath("//label[normalize-space()= 'Subject:']/../div/input");

	private By Enter_Body_7Elem = By.xpath("//BODY[contains(text(),'Please find attached the Customer Report')]");

	private By Enter_Send_8Elem = By.xpath("//A[contains(text(),'Send')]");

	private By Email_Confirmation_MesageElem = By.xpath("//DIV[@class='alert alert-danger alert-dismissible el-selection']");
	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AccountUI/Customer.aspx?FYCode=117199&CompanyCode=16862&menuid=0");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/Customer.aspx?FYCode=117199&CompanyCode=16862&menuid=0");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/Customer.aspx?FYCode=117199&CompanyCode=16862&menuid=0");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/AccountUI/Customer.aspx?FYCode=117199&CompanyCode=16862&menuid=0";

        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/AccountUI/Customer.aspx?FYCode=117199&CompanyCode=16862&menuid=0")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

    
	/**
 	 * Select Select_Banks_1
     * @name Select Select_Banks_1
     */
    public void Select_Select_Banks_1(String Select_Banks_1)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[3]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Select_Banks_1Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Select_Banks_1", "Select_Select_Banks_1 failed. Unable to locate object: " + Select_Banks_1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Select_Banks_1", "Select_Select_Banks_1 failed. Unable to locate object: " + Select_Banks_1Elem.toString());

 			Assert.fail("Unable to locate object: " + Select_Banks_1Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Select_Banks_1);
 		
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_Select_Banks_1 " + Select_Banks_1);

 		TestModellerLogger.PassStep(m_Driver, "Select_Select_Banks_1 " + Select_Banks_1);
 	}

      
	/**
 	 * Enter Enter_DateFrom_2
     * @name Enter Enter_DateFrom_2
     */
 	public void Enter_Enter_DateFrom_2(String Enter_DateFrom_2)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[3]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Enter_DateFrom_2Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_DateFrom_2", "Enter_Enter_DateFrom_2 failed. Unable to locate object: " + Enter_DateFrom_2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_DateFrom_2", "Enter_Enter_DateFrom_2 failed. Unable to locate object: " + Enter_DateFrom_2Elem.toString());

 			Assert.fail("Unable to locate object: " + Enter_DateFrom_2Elem.toString());
         }

 		elem.sendKeys(Enter_DateFrom_2);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_DateFrom_2 " + Enter_DateFrom_2);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_DateFrom_2 " + Enter_DateFrom_2);
 	}

      
	/**
 	 * Enter Enter_DateTo_3
     * @name Enter Enter_DateTo_3
     */
 	public void Enter_Enter_DateTo_3(String Enter_DateTo_3)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[3]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Enter_DateTo_3Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_DateTo_3", "Enter_Enter_DateTo_3 failed. Unable to locate object: " + Enter_DateTo_3Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_DateTo_3", "Enter_Enter_DateTo_3 failed. Unable to locate object: " + Enter_DateTo_3Elem.toString());

 			Assert.fail("Unable to locate object: " + Enter_DateTo_3Elem.toString());
         }

 		elem.sendKeys(Enter_DateTo_3);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_DateTo_3 " + Enter_DateTo_3);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_DateTo_3 " + Enter_DateTo_3);
 	}

    
	/**
 	 * Select Select _lEmailTemplate_4
	 * @throws InterruptedException 
     * @name Select Select _lEmailTemplate_4
     */
    public void Select_Select__lEmailTemplate_4(String Select__lEmailTemplate_4) throws InterruptedException
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[3]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Select__lEmailTemplate_4Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Select__lEmailTemplate_4", "Select_Select__lEmailTemplate_4 failed. Unable to locate object: " + Select__lEmailTemplate_4Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Select__lEmailTemplate_4", "Select_Select__lEmailTemplate_4 failed. Unable to locate object: " + Select__lEmailTemplate_4Elem.toString());

 			Assert.fail("Unable to locate object: " + Select__lEmailTemplate_4Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Select__lEmailTemplate_4);
 		
		m_Driver.switchTo().defaultContent();
		Thread.sleep(9000);
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Select__lEmailTemplate_4 " + Select__lEmailTemplate_4);

 		TestModellerLogger.PassStep(m_Driver, "Select_Select__lEmailTemplate_4 " + Select__lEmailTemplate_4);
 	}

     
	/**
 	 * Click Enter_Mail_id_5
     * @name Click Enter_Mail_id_5
     */
	public void Click_Enter_Mail_id_5()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[3]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(Enter_Mail_id_5Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Enter_Mail_id_5", "Click_Enter_Mail_id_5 failed. Unable to locate object: " + Enter_Mail_id_5Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Enter_Mail_id_5", "Click_Enter_Mail_id_5 failed. Unable to locate object: " + Enter_Mail_id_5Elem.toString());

			Assert.fail("Unable to locate object: " + Enter_Mail_id_5Elem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_Enter_Mail_id_5");

		TestModellerLogger.PassStep(m_Driver, "Click_Enter_Mail_id_5");
	}

      
	/**
 	 * Enter Enter_Subject_6
     * @name Enter Enter_Subject_6
     */
 	public void Enter_Enter_Subject_6(String Enter_Subject_6)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[3]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Enter_Subject_6Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_Subject_6", "Enter_Enter_Subject_6 failed. Unable to locate object: " + Enter_Subject_6Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_Subject_6", "Enter_Enter_Subject_6 failed. Unable to locate object: " + Enter_Subject_6Elem.toString());

 			Assert.fail("Unable to locate object: " + Enter_Subject_6Elem.toString());
         }

 		elem.sendKeys(Enter_Subject_6);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_Subject_6 " + Enter_Subject_6);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_Subject_6 " + Enter_Subject_6);
 	}

     
	/**
 	 * Click Enter_Body_7
     * @name Click Enter_Body_7
     */
	public void Click_Enter_Body_7()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[3]/div/div/div[2]/iframe")));

		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/div[3]/div[1]/div/div[7]/div/div/table/tbody/tr[2]/td/div/iframe[1]")));

		WebElement elem = getWebElement(Enter_Body_7Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Enter_Body_7", "Click_Enter_Body_7 failed. Unable to locate object: " + Enter_Body_7Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Enter_Body_7", "Click_Enter_Body_7 failed. Unable to locate object: " + Enter_Body_7Elem.toString());

			Assert.fail("Unable to locate object: " + Enter_Body_7Elem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
		
  	
       
		ExtentReportManager.passStep(m_Driver, "Click_Enter_Body_7");

		TestModellerLogger.PassStep(m_Driver, "Click_Enter_Body_7");
	}

     
	/**
 	 * Click Enter_Send_8
	 * @throws InterruptedException 
     * @name Click Enter_Send_8
     */
	public void Click_Enter_Send_8() throws InterruptedException
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[3]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(Enter_Send_8Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Enter_Send_8", "Click_Enter_Send_8 failed. Unable to locate object: " + Enter_Send_8Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Enter_Send_8", "Click_Enter_Send_8 failed. Unable to locate object: " + Enter_Send_8Elem.toString());

			Assert.fail("Unable to locate object: " + Enter_Send_8Elem.toString());
        }
		System.out.println("enter button clicked");
           elem.click();
		
		utilities.PassScreenshot.Getscreenshot11("MAIL SENT", "Sendbutton clicked");
        
		m_Driver.switchTo().defaultContent();
			ExtentReportManager.passStep(m_Driver, "Click_Enter_Send_8");

		TestModellerLogger.PassStep(m_Driver, "Click_Enter_Send_8");
	}
	/**
 	 * Click Email_Confirmation_Mesage
     * @name Click Email_Confirmation_Mesage
     */
	public void Click_Email_Confirmation_Mesage()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[3]/div/div/div[2]/iframe")));

	WebElement elem = getWebElement(Email_Confirmation_MesageElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Email_Confirmation_Mesage", "Click_Email_Confirmation_Mesage failed. Unable to locate object: " + Email_Confirmation_MesageElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Email_Confirmation_Mesage", "Click_Email_Confirmation_Mesage failed. Unable to locate object: " + Email_Confirmation_MesageElem.toString());

			Assert.fail("Unable to locate object: " + Email_Confirmation_MesageElem.toString());
        }

	String confirmactionmsg=elem.getText();
	
	boolean msg=confirmactionmsg.contains("Success! Your email is in a queue to be sent.");
	
	 Assert.assertTrue(msg);
	 utilities.PassScreenshot.Getscreenshot11("confirmation message", "confirmation message");
		m_Driver.switchTo().defaultContent();
		
		ExtentReportManager.passStep(m_Driver, "Click_Email_Confirmation_Mesage");

		TestModellerLogger.PassStep(m_Driver, "Click_Email_Confirmation_Mesage");
	}
}
	
	
	
	
	
	
