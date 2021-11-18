package Ashiv_Demo_Pages;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.Screenshotcapture;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;

import java.util.regex.Matcher;
import java.util.regex.Pattern;



// https://ashiv.cloud.testinsights.io/app/#!/module-collection/guid/ac58cfb7-c9e6-4f7e-8751-9ad772c355fa
@TestModellerModule(guid = "ac58cfb7-c9e6-4f7e-8751-9ad772c355fa")
public class LoginSendbox4 extends BasePage
{
	public LoginSendbox4 (WebDriver driver)
	{
		super(driver);
	}
String Pass=null;

	
	private By User_NameElem = By.xpath("//label[normalize-space()= 'Remember me on this computer']/../../../../div[1]/div/input");

	private By passwordElem = By.xpath("//label[normalize-space()= 'Remember me on this computer']/../../../../div[2]/div/input");

	private By Log_inElem = By.xpath("//label[normalize-space()= 'Remember me on this computer']/../../../../div[4]/a");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/ssoui/Signin.aspx?token=668f28ac-236f-4d7a-9aa3-2a9457140633");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/ssoui/Signin.aspx?token=668f28ac-236f-4d7a-9aa3-2a9457140633");

		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/ssoui/Signin.aspx?token=668f28ac-236f-4d7a-9aa3-2a9457140633");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/ssoui/Signin.aspx?token=668f28ac-236f-4d7a-9aa3-2a9457140633";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/ssoui/Signin.aspx?token=668f28ac-236f-4d7a-9aa3-2a9457140633")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

      
	/**
 	 * Enter User Name
     * @name Enter User Name
     */
 	public void Enter_User_Name(String User_Name)
 	{
 	    
 		WebElement elem = getWebElement(User_NameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_User_Name", "Enter_User_Name failed. Unable to locate object: " + User_NameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_User_Name", "Enter_User_Name failed. Unable to locate object: " + User_NameElem.toString());

 			Assert.fail("Unable to locate object: " + User_NameElem.toString());
         }

 		elem.sendKeys("admin");
 		

  		ExtentReportManager.passStep(m_Driver, "Enter_User_Name " + User_Name);

  		TestModellerLogger.PassStep(m_Driver, "Enter_User_Name " + User_Name);
 	}

      
	/**
 	 * Enter password
     * @name Enter password
     */
 	public void Enter_password(String password)
 	{
 	    
 		WebElement elem = getWebElement(passwordElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_password", "Enter_password failed. Unable to locate object: " + passwordElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_password", "Enter_password failed. Unable to locate object: " + passwordElem.toString());

 			Assert.fail("Unable to locate object: " + passwordElem.toString());
         }

 		elem.sendKeys("admin1@1");
 		

  		ExtentReportManager.passStep(m_Driver, "Enter_password " + password);

  		TestModellerLogger.PassStep(m_Driver, "Enter_password " + password);
 	}

      
	/**
 	 * Click Log in
	 * @throws AWTException 
	 * @throws IOException 
	 * @throws HeadlessException 
	 * @throws InterruptedException 
     * @name Click Log in
     */
    public void Click_Log_in() throws HeadlessException, IOException, AWTException, InterruptedException
    {
         
        WebElement elem = getWebElement(Log_inElem);

        if (elem == null) {
            ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Log_in", "Click_Log_in failed. Unable to locate object: " + Log_inElem.toString());

            TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Log_in", "Click_Log_in failed. Unable to locate object: " + Log_inElem.toString());

            Assert.fail("Unable to locate object: " + Log_inElem.toString());
         }
 Screenshotcapture.captureAsImage(m_Driver, Pass);
 

	
	
	
     
        elem.click();
         

        ExtentReportManager.passStepWithScreenshot(m_Driver, "Click_Log_in");

        TestModellerLogger.PassStepWithScreenshot(m_Driver, "Click_Log_in");
    }}