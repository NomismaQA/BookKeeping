package pages;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/6eed474d-6527-425b-870b-ac6ca66a1a07
@TestModellerModule(guid = "6eed474d-6527-425b-870b-ac6ca66a1a07")
public class businessrc extends BasePage
{
	public businessrc (WebDriver driver)
	{
		super(driver);
	}


	
	private By ClientsmenuElem = By.xpath("//LI[@id='ctl00_ctl00_ParentContent_SideMenu1_businessMenu']/A");

	private By SearchCompanybtnElem = By.cssSelector("INPUT[id='ctl00_ctl00_ParentContent_cPHFilter_txtSearchCompany']");

	private By Search_Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPHFilter_btnSearch']");

	private By _NidhiEnt_Elem = By.xpath("//SPAN[contains(text(),'NidhiEnt')]");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AgentUI/Company.aspx");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AgentUI/Company.aspx");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AgentUI/Company.aspx");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AgentUI/Company.aspx";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AgentUI/Company.aspx")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click Clientsmenu
     * @name Click Clientsmenu
     */
	public void Click_Clientsmenu()
	{
        
		WebElement elem = getWebElement(ClientsmenuElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Clientsmenu", "Click_Clientsmenu failed. Unable to locate object: " + ClientsmenuElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Clientsmenu", "Click_Clientsmenu failed. Unable to locate object: " + ClientsmenuElem.toString());

			Assert.fail("Unable to locate object: " + ClientsmenuElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Clientsmenu");

		TestModellerLogger.PassStep(m_Driver, "Click_Clientsmenu");
	}

      
	/**
 	 * Enter SearchCompanybtn
     * @name Enter SearchCompanybtn
     */
 	public void Enter_SearchCompanybtn(String SearchCompanybtn)
 	{
 	    
 		WebElement elem = getWebElement(SearchCompanybtnElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_SearchCompanybtn", "Enter_SearchCompanybtn failed. Unable to locate object: " + SearchCompanybtnElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_SearchCompanybtn", "Enter_SearchCompanybtn failed. Unable to locate object: " + SearchCompanybtnElem.toString());

 			Assert.fail("Unable to locate object: " + SearchCompanybtnElem.toString());
         }

 		elem.sendKeys(SearchCompanybtn);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_SearchCompanybtn " + SearchCompanybtn);

  		TestModellerLogger.PassStep(m_Driver, "Enter_SearchCompanybtn " + SearchCompanybtn);
 	}

     
	/**
 	 * Click Search 
     * @name Click Search 
     */
	public void Click_Search_()
	{
        
		WebElement elem = getWebElement(Search_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Search_", "Click_Search_ failed. Unable to locate object: " + Search_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Search_", "Click_Search_ failed. Unable to locate object: " + Search_Elem.toString());

			Assert.fail("Unable to locate object: " + Search_Elem.toString());
        }

		elem.click();
          	
		System.out.println("ctl00_ctl00_ParentContent_cPHFilter_btnSearch");

		ExtentReportManager.passStep(m_Driver, "Click_Search_");

		TestModellerLogger.PassStep(m_Driver, "Click_Search_");
	}

     
	/**
 	 * Click  NidhiEnt 
     * @name Click  NidhiEnt 
     */
	public void Click__NidhiEnt_()
	{
        
		WebElement elem = getWebElement(_NidhiEnt_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__NidhiEnt_", "Click__NidhiEnt_ failed. Unable to locate object: " + _NidhiEnt_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__NidhiEnt_", "Click__NidhiEnt_ failed. Unable to locate object: " + _NidhiEnt_Elem.toString());

			Assert.fail("Unable to locate object: " + _NidhiEnt_Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__NidhiEnt_");

		TestModellerLogger.PassStep(m_Driver, "Click__NidhiEnt_");
	}
}