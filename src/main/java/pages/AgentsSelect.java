package pages;

import pages.BasePage;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.ChangeWindow;
import utilities.ClosePopup;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/cb912fd2-43f9-4c12-828e-48c03b99d515
@TestModellerModule(guid = "cb912fd2-43f9-4c12-828e-48c03b99d515")
public class AgentsSelect extends BasePage
{
	public AgentsSelect (WebDriver driver)
	{
		super(driver);
	}


	
	private By AgentsTabElem = By.xpath("//SPAN[text()='Agents']");

	private By AgentNameElem = By.id("ctl00_cPHFilter_txtAgentName");
	

	private By SearchButtonElem = By.id("ctl00_cPHFilter_btnSearch");
	//private By SearchButtonElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_btnSearch']");

	//private By SelectAgentElem = By.xpath("/html/body/form/main/div[2]/div[3]/div/div[3]/div/div/table/tbody/tr[2]/td[1]");
//	private By SelectAgentElem= By.xpath("//*[@id='ctl00_divSubContent"]/div[3]/div/div/div/div/table/tbody/tr[2]/td[1]");
	private By SelectAgentElem= By.xpath("//TD[@style='cursor: pointer;']");
	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AgentUI/Default.aspx?p=true");
		
		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AgentUI/Default.aspx?p=true");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AgentUI/Default.aspx?p=true");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/AgentUI/Default.aspx?p=true";
       
        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/AgentUI/Default.aspx?p=true")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click Agents_Tab
	 * @throws InterruptedException 
     * @name Click Agents_Tab
     */
	public void Click_AgentsTab() throws InterruptedException
	{
		System.out.println("AgentTab");
        
		WebElement elem = getWebElement(AgentsTabElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_AgentsTab", "Click_AgentsTab failed. Unable to locate object: " + AgentsTabElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_AgentsTab", "Click_AgentsTab failed. Unable to locate object: " + AgentsTabElem.toString());

			Assert.fail("Unable to locate object: " + AgentsTabElem.toString());
        }
		
		//elem.click();
		
	//	Thread.sleep(15000);
		//ClosePopup.ValidateAndPopUp(m_Driver);

		ExtentReportManager.passStep(m_Driver, "Click_AgentsTab");

		TestModellerLogger.PassStep(m_Driver, "Click_AgentsTab");
	}

     
	/**
 	 * Enter AgentName
	 * @throws InterruptedException 
     * @name Enter AgentName
     */
 	public void Enter_AgentName(String AgentName) throws InterruptedException
 	{
 		System.out.println("AgentName");
 		WebElement elem = getWebElement(AgentNameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_AgentName", "Enter_AgentName failed. Unable to locate object: " + AgentNameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_AgentName", "Enter_AgentName failed. Unable to locate object: " + AgentNameElem.toString());

 			Assert.fail("Unable to locate object: " + AgentNameElem.toString());
         }
 		Thread.sleep(2000);
 		
 	//	ClosePopup.ValidateAndPopUp(m_Driver);
 		//Thread.sleep(1000);
 		elem.sendKeys(AgentName);
 		
 		
		
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_AgentName " + AgentName);

  		TestModellerLogger.PassStep(m_Driver, "Enter_AgentName " + AgentName);
 	}
 

     
	/**
 	 * Click SearchButton
     * @name Click SearchButton
     */
	public void Click_SearchButton()
	{
        
		WebElement elem = getWebElement(SearchButtonElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SearchButton", "Click_SearchButton failed. Unable to locate object: " + SearchButtonElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SearchButton", "Click_SearchButton failed. Unable to locate object: " + SearchButtonElem.toString());

			Assert.fail("Unable to locate object: " + SearchButtonElem.toString());
        }
		//ValidateAndPopUp();
		//elem.click();
		jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.id("ctl00_cPHFilter_btnSearch")));
		
		ExtentReportManager.passStep(m_Driver, "Click_SearchButton");

		TestModellerLogger.PassStep(m_Driver, "Click_SearchButton");
	}
	
	
	

     
	/**
 	 * Click SelectAgent
     * @name Click SelectAgent
     */
	public void Click_SelectAgent()
	{
        
		WebElement elem = getWebElement(SelectAgentElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SelectAgent", "Click_SelectAgent failed. Unable to locate object: " + SelectAgentElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SelectAgent", "Click_SelectAgent failed. Unable to locate object: " + SelectAgentElem.toString());

			Assert.fail("Unable to locate object: " + SelectAgentElem.toString());
        }

		elem.click();
		ChangeWindow.tabswitch(m_Driver);
          	

		ExtentReportManager.passStep(m_Driver, "Click_SelectAgent");

		TestModellerLogger.PassStep(m_Driver, "Click_SelectAgent");
	}
	
	public static boolean ValidateAndPopUp()
	{
		 boolean data=false;
	        try
	        {
	            Thread.sleep(1000);
	           
	            WebElement ele = m_Driver.findElement(By.xpath("//*[@id='9f000f36-5dbb-78db-58e6-6e9eef1755d5']"));
	          //*[@id="2193a932-f6b3-dd83-7f41-985a4a556f73"]
	          //*[@id='9f000f36-5dbb-78db-58e6-6e9eef1755d5']
	            WebDriverWait wait = new WebDriverWait(m_Driver, 200);
	            wait.until(ExpectedConditions.visibilityOf(ele));
	            
	            ele.click();
	            
	            System.out.println(true);
	            return true;
	        } catch (Exception e)
	        {
	            System.out.println(false);
	            return data;
	        }
	}
}
