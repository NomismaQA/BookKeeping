package FIN_3821;

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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/e29cc2d2-a611-4f6e-aaab-6b60e967331d
@TestModellerModule(guid = "e29cc2d2-a611-4f6e-aaab-6b60e967331d")
public class SA2 extends BasePage
{
	public SA2 (WebDriver driver)
	{
		super(driver);
	}


	
	private By Clients_Left_menuElem = By.xpath("//A[@href='Company.aspx']");
	//*[@id="ctl00_ctl00_ParentContent_cPHFilter_ddlService"]
	//private By Client_name2Elem = By.xpath("//label[contains(.,'Client Name:')]/../div/input");
	private By Client_name2Elem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_ddlService']");

	private By Client_type2Elem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_ddlService']");

	//private By Client_type2Elem = By.xpath("//label[contains(.,'Client Type:')]/../div/select");

	private By Without_Feeds3Elem = By.xpath("//label[contains(.,'Without Feeds:')]/../div/select");

	private By Unreco_Trans4Elem = By.xpath("//label[contains(.,'Unreconciled Transactions:')]/../div/select");

//	private By Update_btt5Elem = By.xpath("//label[contains(.,'')]/../div/a");
	private By Update_btt5Elem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_ddlService']");
	//*[@id="ctl00_ctl00_ParentContent_cPHFilter_ddlService"]

	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/AgentUI/ReportClientBankAccounts.aspx");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AgentUI/ReportClientBankAccounts.aspx");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AgentUI/ReportClientBankAccounts.aspx");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AgentUI/ReportClientBankAccounts.aspx";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AgentUI/ReportClientBankAccounts.aspx")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click Clients_Left_menu
     * @name Click Clients_Left_menu
     */
	public void Click_Clients_Left_menu()
	{
        
		WebElement elem = getWebElement(Clients_Left_menuElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Clients_Left_menu", "Click_Clients_Left_menu failed. Unable to locate object: " + Clients_Left_menuElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Clients_Left_menu", "Click_Clients_Left_menu failed. Unable to locate object: " + Clients_Left_menuElem.toString());

			Assert.fail("Unable to locate object: " + Clients_Left_menuElem.toString());
        }

		
		String txt = m_Driver.findElement(By.xpath("//*[@id='DivMoreopt']/div[2]/div[1]/div/div/div[4]/div/div/a[1]/div[1]/h3")).getText();
		System.out.println("txt"+txt);
		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Clients_Left_menu");

		TestModellerLogger.PassStep(m_Driver, "Click_Clients_Left_menu");
	}

      
	/**
 	 * Enter Client_name2
     * @name Enter Client_name2
     */
 	public void Enter_Client_name2(String Client_name2)
 	{
 	    
 		WebElement elem = getWebElement(Client_name2Elem);

 	//	if (elem == null) {
    		//ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Client_name2", "Enter_Client_name2 failed. Unable to locate object: " + Client_name2Elem.toString());

    	//	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Client_name2", "Enter_Client_name2 failed. Unable to locate object: " + Client_name2Elem.toString());

 		//	Assert.fail("Unable to locate object: " + Client_name2Elem.toString());
        // }

 		elem.sendKeys(Client_name2);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Client_name2 " + Client_name2);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Client_name2 " + Client_name2);
 	}

    
	/**
 	 * Select Client_type2
     * @name Select Client_type2
     */
    public void Select_Client_type2(String Client_type2)
 	{
 	    
 		WebElement elem = getWebElement(Client_type2Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Client_type2", "Select_Client_type2 failed. Unable to locate object: " + Client_type2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Client_type2", "Select_Client_type2 failed. Unable to locate object: " + Client_type2Elem.toString());

 			Assert.fail("Unable to locate object: " + Client_type2Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Client_type2);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Client_type2 " + Client_type2);

 		TestModellerLogger.PassStep(m_Driver, "Select_Client_type2 " + Client_type2);
 	}

    
	/**
 	 * Select Without_Feeds3
     * @name Select Without_Feeds3
     */
    public void Select_Without_Feeds3(String Without_Feeds3)
 	{
 	    
 		WebElement elem = getWebElement(Without_Feeds3Elem);
 		WebElement elem1 = getWebElement(Client_type2Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Without_Feeds3", "Select_Without_Feeds3 failed. Unable to locate object: " + Without_Feeds3Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Without_Feeds3", "Select_Without_Feeds3 failed. Unable to locate object: " + Without_Feeds3Elem.toString());

 			Assert.fail("Unable to locate object: " + Without_Feeds3Elem.toString());
         }
 		elem1.click();
 		Select dropdown = new Select(elem);
//elem.sendKeys(Keys.ARROW_DOWN);
 		dropdown.selectByVisibleText(Without_Feeds3);
 		System.out.println("Select_Without_Feeds3");
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Without_Feeds3 " + Without_Feeds3);

 		TestModellerLogger.PassStep(m_Driver, "Select_Without_Feeds3 " + Without_Feeds3);
 	}

    
	/**
 	 * Select Unreco_Trans4
     * @name Select Unreco_Trans4
     */
    public void Select_Unreco_Trans4(String Unreco_Trans4)
 	{
 	    
 		WebElement elem = getWebElement(Unreco_Trans4Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Unreco_Trans4", "Select_Unreco_Trans4 failed. Unable to locate object: " + Unreco_Trans4Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Unreco_Trans4", "Select_Unreco_Trans4 failed. Unable to locate object: " + Unreco_Trans4Elem.toString());

 			Assert.fail("Unable to locate object: " + Unreco_Trans4Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Unreco_Trans4);
 		System.out.println("Select_Unreco_Trans4");
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Unreco_Trans4 " + Unreco_Trans4);

 		TestModellerLogger.PassStep(m_Driver, "Select_Unreco_Trans4 " + Unreco_Trans4);
 	}

     
	/**
 	 * Click Update_btt5
     * @name Click Update_btt5
     */
	public void Click_Update_btt5()
	{
        
		WebElement elem = getWebElement(Update_btt5Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Update_btt5", "Click_Update_btt5 failed. Unable to locate object: " + Update_btt5Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Update_btt5", "Click_Update_btt5 failed. Unable to locate object: " + Update_btt5Elem.toString());

			Assert.fail("Unable to locate object: " + Update_btt5Elem.toString());
        }

		elem.click();
          	System.out.println("Click_Update_btt5");

		ExtentReportManager.passStep(m_Driver, "Click_Update_btt5");

		TestModellerLogger.PassStep(m_Driver, "Click_Update_btt5");
	}
}