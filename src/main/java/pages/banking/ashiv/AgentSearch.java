package pages.banking.ashiv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import pages.BasePage;
import pages.PartialReconciledCases.Library;
import utilities.ClosePopup;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/6ad2cfda-e4ca-4d4d-af45-e78001fb1127
@TestModellerModule(guid = "6ad2cfda-e4ca-4d4d-af45-e78001fb1127")
public class AgentSearch extends BasePage
{
	Library s1;
	public AgentSearch (WebDriver driver)
	{
		super(driver);
		s1=new Library(m_Driver);
	}

	private By AgentsElem = By.xpath("//LI[@class='dashboard_nav active']/A/SPAN[@class='side_nav_text']");

	private By ctl00cPHFiltertxtAgentNameElem = By.xpath("//*[@id='ctl00_cPHFilter_txtAgentName']");

	private By SearchElem = By.xpath("//*[@id='ctl00_cPHFilter_btnSearch']");

	private By _Nidhi1_Elem = By.xpath("//TD[@style='cursor: pointer;']");

	
	//By.xpath("//*[@id='ctl00_divSubContent']/div[3]/div/div/table/tbody/tr[2]/td[1]");
	//*[@id="ctl00_divSubContent"]/div[3]/div/div/div/div/table/tbody/tr[2]/td[1]/text()

	//private By _Nidhi1_Elem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_rowCompany']/td[1]/span");

	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AdminUI/Agents.aspx");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AdminUI/Agents.aspx");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AdminUI/Agents.aspx");
	}
	

     
	/**
 	 * AssertUrl
     * @name AssertUrl
   */
// public void AssertUrl()
//    {
//        String currentUrl = m_Driver.getCurrentUrl();
//        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AdminUI/Agents.aspx";
//
//        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AdminUI/Agents.aspx")) {
//            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
//       }
//    }

     
	/**
 	 * Click Agents
	 * @throws InterruptedException 
     * @name Click Agents
     */
	public void Click_Agents() throws InterruptedException
	{
		
        
		WebElement elem = getWebElement(AgentsElem);
System.out.println("Agent");
		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Agents", "Click_Agents failed. Unable to locate object: " + AgentsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Agents", "Click_Agents failed. Unable to locate object: " + AgentsElem.toString());

			Assert.fail("Unable to locate object: " + AgentsElem.toString());
        }
	//	Thread.sleep(13000);
		
		elem.click();
		
		//ClosePopup.ValidateAndPopUp(m_Driver);
          	
      
		ExtentReportManager.passStep(m_Driver, "Click_Agents");

		TestModellerLogger.PassStep(m_Driver, "Click_Agents");
	}

      
	/**
 	 * Enter ctl00$cPHFilter$txtAgentName
	 * @throws InterruptedException 
     * @name Enter ctl00$cPHFilter$txtAgentName
     */
 	public void Enter_ctl00cPHFiltertxtAgentName(String ctl00cPHFiltertxtAgentName) throws InterruptedException
 	{
 	    
 		System.out.println("Agent2");
 		WebElement elem = getWebElement(ctl00cPHFiltertxtAgentNameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHFiltertxtAgentName", "Enter_ctl00cPHFiltertxtAgentName failed. Unable to locate object: " + ctl00cPHFiltertxtAgentNameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHFiltertxtAgentName", "Enter_ctl00cPHFiltertxtAgentName failed. Unable to locate object: " + ctl00cPHFiltertxtAgentNameElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHFiltertxtAgentNameElem.toString());
         }
 		elem.sendKeys(ctl00cPHFiltertxtAgentName);
 		
 		//jsExec.executeScript("arguments[0].value='"+ctl00cPHFiltertxtAgentName+"';",elem);
        //elem.sendKeys(ctl00cPHFiltertxtAgentName);
        System.out.println("hi");
        Thread.sleep(1000);
       
 		
      //	ClosePopup.ValidateAndPopUp(m_Driver);
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHFiltertxtAgentName " + ctl00cPHFiltertxtAgentName);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHFiltertxtAgentName " + ctl00cPHFiltertxtAgentName);
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
		System.out.println("click");
		 
		//ClosePopup.ValidateAndPopUp(m_Driver);
		elem.click();
		System.out.println("click2");
		
          	
		ExtentReportManager.passStep(m_Driver, "Click_Search");

		TestModellerLogger.PassStep(m_Driver, "Click_Search");
	}
   
	/**
 	 * Click  Nidhi1 
	 * @throws InterruptedException 
     * @name Click  Nidhi1 
     */
	public void Click__Nidhi1_() throws InterruptedException
	{
        
		WebElement elem = getWebElement(_Nidhi1_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Nidhi1_", "Click__Nidhi1_ failed. Unable to locate object: " + _Nidhi1_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Nidhi1_", "Click__Nidhi1_ failed. Unable to locate object: " + _Nidhi1_Elem.toString());

			Assert.fail("Unable to locate object: " + _Nidhi1_Elem.toString());
	          }

		//elem.click();
	
		jsExec.executeScript("arguments[0].click();", elem);
		Thread.sleep(1000);
		
	    Library.Switchwindow(1, m_Driver);
//		ExtentReportManager.passStep(m_Driver, "Click__Nidhi1_");
//
//		TestModellerLogger.PassStep(m_Driver, "Click__Nidhi1_");
		
	}
}