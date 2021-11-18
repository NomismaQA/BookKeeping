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


import java.util.regex.Matcher;
import java.util.regex.Pattern;



// https://ashiv.cloud.testinsights.io/app/#!/module-collection/guid/65870f5a-224d-4fa2-9fd6-59f8dc50a077
@TestModellerModule(guid = "65870f5a-224d-4fa2-9fd6-59f8dc50a077")
public class CreateSelectAgent extends BasePage
{
	public CreateSelectAgent (WebDriver driver)
	{
		super(driver);
	}


	private By User_NameElem = By.xpath("//label[normalize-space()= 'Remember me on this computer']/../../../../div[1]/div/input");

	private By passwordElem = By.xpath("//label[normalize-space()= 'Remember me on this computer']/../../../../div[2]/div/input");

	private By Log_inElem = By.xpath("//label[normalize-space()= 'Remember me on this computer']/../../../../div[4]/a");
	
	private By _Add_Agent_Elem = By.xpath("//A[@id='ctl00_cpHeaderRight_btnAdd']");

	private By Agent_NameElem = By.xpath("//label[normalize-space()= 'Name:']/../../div[2]/input");

	private By ActiveElem = By.xpath("//label[normalize-space()= 'Active:']/../../div[2]/input");

	private By Save_AgentElem = By.xpath("//A[@id='ctl00_cPH_btnSave']");

	private By SearchAgentNameElem = By.xpath("//label[normalize-space()= 'Name:']/../div/input");

	private By SearchElem = By.xpath("//label[normalize-space()= '']/../div/a");

	private By Select_AgentElem = By.xpath("//TD[@style=\"cursor: pointer;\"]");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/AdminUI/Agents.aspx?menuid=0");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AdminUI/Agents.aspx?menuid=0");

		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AdminUI/Agents.aspx?menuid=0");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AdminUI/Agents.aspx?menuid=0";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AdminUI/Agents.aspx?menuid=0")) {
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

    
       elem.click();
        

       ExtentReportManager.passStepWithScreenshot(m_Driver, "Click_Log_in");

       TestModellerLogger.PassStepWithScreenshot(m_Driver, "Click_Log_in");
   }
   

      
	/**
 	 * Click  Add Agent 
     * @name Click  Add Agent 
     */
    public void Click__Add_Agent_()
    {
         
        WebElement elem = getWebElement(_Add_Agent_Elem);

        if (elem == null) {
            ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Add_Agent_", "Click__Add_Agent_ failed. Unable to locate object: " + _Add_Agent_Elem.toString());

            TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Add_Agent_", "Click__Add_Agent_ failed. Unable to locate object: " + _Add_Agent_Elem.toString());

            Assert.fail("Unable to locate object: " + _Add_Agent_Elem.toString());
         }

        elem.click();
         

        ExtentReportManager.passStepWithScreenshot(m_Driver, "Click__Add_Agent_");

        TestModellerLogger.PassStepWithScreenshot(m_Driver, "Click__Add_Agent_");
    }
      
	/**
 	 * Enter Agent Name
     * @name Enter Agent Name
     */
 	public void Enter_Agent_Name(String Agent_Name)
 	{
 	    
 		WebElement elem = getWebElement(Agent_NameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Agent_Name", "Enter_Agent_Name failed. Unable to locate object: " + Agent_NameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Agent_Name", "Enter_Agent_Name failed. Unable to locate object: " + Agent_NameElem.toString());

 			Assert.fail("Unable to locate object: " + Agent_NameElem.toString());
         }

 		elem.sendKeys(Agent_Name);
 		

  		ExtentReportManager.passStep(m_Driver, "Enter_Agent_Name " + Agent_Name);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Agent_Name " + Agent_Name);
 	}

      
	/**
 	 * Click Active
     * @name Click Active
     */
    public void Click_Active()
    {
         
        WebElement elem = getWebElement(ActiveElem);

        if (elem == null) {
            ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Active", "Click_Active failed. Unable to locate object: " + ActiveElem.toString());

            TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Active", "Click_Active failed. Unable to locate object: " + ActiveElem.toString());

            Assert.fail("Unable to locate object: " + ActiveElem.toString());
         }

        elem.click();
         

        ExtentReportManager.passStepWithScreenshot(m_Driver, "Click_Active");

        TestModellerLogger.PassStepWithScreenshot(m_Driver, "Click_Active");
    }
      
	/**
 	 * Click Save Agent
	 * @throws InterruptedException 
     * @name Click Save Agent
     */
    public void Click_Save_Agent() throws InterruptedException
    {
         
        WebElement elem = getWebElement(Save_AgentElem);

        if (elem == null) {
            ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Save_Agent", "Click_Save_Agent failed. Unable to locate object: " + Save_AgentElem.toString());

            TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Save_Agent", "Click_Save_Agent failed. Unable to locate object: " + Save_AgentElem.toString());

            Assert.fail("Unable to locate object: " + Save_AgentElem.toString());
         }
        Thread.sleep(2000);
        elem.click();
         

        ExtentReportManager.passStepWithScreenshot(m_Driver, "Click_Save_Agent");

        TestModellerLogger.PassStepWithScreenshot(m_Driver, "Click_Save_Agent");
    }
      
	/**
 	 * Enter SearchAgentName
	 * @throws InterruptedException 
     * @name Enter SearchAgentName
     */
 	public void Enter_SearchAgentName(String SearchAgentName) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(SearchAgentNameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_SearchAgentName", "Enter_SearchAgentName failed. Unable to locate object: " + SearchAgentNameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_SearchAgentName", "Enter_SearchAgentName failed. Unable to locate object: " + SearchAgentNameElem.toString());

 			Assert.fail("Unable to locate object: " + SearchAgentNameElem.toString());
         }
          Thread.sleep(2000);
 		elem.sendKeys(SearchAgentName);
 		

  		ExtentReportManager.passStep(m_Driver, "Enter_SearchAgentName " + SearchAgentName);

  		TestModellerLogger.PassStep(m_Driver, "Enter_SearchAgentName " + SearchAgentName);
 	}

      
	/**
 	 * Click Search
     * @name Click Search
     */
    public void Click_Search()
    {
         
        WebElement elem = getWebElement(SearchElem);

        if (elem == null) {
            ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Search", "Click_Search failed. Unable to locate object: " + SearchElem.toString());

            TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Search", "Click_Search failed. Unable to locate object: " + SearchElem.toString());

            Assert.fail("Unable to locate object: " + SearchElem.toString());
         }

        elem.click();
         

        ExtentReportManager.passStepWithScreenshot(m_Driver, "Click_Search");

        TestModellerLogger.PassStepWithScreenshot(m_Driver, "Click_Search");
    }
      
	/**
 	 * Click Select Agent
     * @name Click Select Agent
     */
    public void Click_Select_Agent()
    {
         
        WebElement elem = getWebElement(Select_AgentElem);

        if (elem == null) {
            ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Select_Agent", "Click_Select_Agent failed. Unable to locate object: " + Select_AgentElem.toString());

            TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Select_Agent", "Click_Select_Agent failed. Unable to locate object: " + Select_AgentElem.toString());

            Assert.fail("Unable to locate object: " + Select_AgentElem.toString());
         }

        elem.click();
         

        ExtentReportManager.passStepWithScreenshot(m_Driver, "Click_Select_Agent");

        TestModellerLogger.PassStepWithScreenshot(m_Driver, "Click_Select_Agent");
    }}