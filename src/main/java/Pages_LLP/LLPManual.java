package Pages_LLP;

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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/530ad722-2f7e-4e9a-8c16-9ff5e636ea46
@TestModellerModule(guid = "530ad722-2f7e-4e9a-8c16-9ff5e636ea46")
public class LLPManual extends BasePage
{
	public LLPManual (WebDriver driver)
	{
		super(driver);
	}


	
	private By LLP_Click_1Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_btnLLP']");

	private By Mannual_LLP_2Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_ltBussinessName']");

	private By Company_Name_3Elem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtCompanyName']");

	private By RegNo_4Elem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtRegNo']");

	private By UTRNo_LLP_5Elem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtUTRNo_LLP']");

	private By Reg_BUS_Date_6Elem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtCRegDate']");

	private By Member_FN_7Elem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtFirstName1']");

	private By Member_FN_8Elem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtLastName1']");

	private By Member2_FN_9Elem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtFirstName2']");

	private By Member2_FN_10Elem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtLastName2']");

	private By LLP_Save__11Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_btnSave']");

	private By CancelElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_btnCancel']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AgentUI/CompanyAdd.aspx?menuid=0&ct=4");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AgentUI/CompanyAdd.aspx?menuid=0&ct=4");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AgentUI/CompanyAdd.aspx?menuid=0&ct=4");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/AgentUI/CompanyAdd.aspx?menuid=0&ct=4";

        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/AgentUI/CompanyAdd.aspx?menuid=0&ct=4")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click LLP_Click_1
     * @name Click LLP_Click_1
     */
	public void Click_LLP_Click_1()
	{
        
		WebElement elem = getWebElement(LLP_Click_1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_LLP_Click_1", "Click_LLP_Click_1 failed. Unable to locate object: " + LLP_Click_1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_LLP_Click_1", "Click_LLP_Click_1 failed. Unable to locate object: " + LLP_Click_1Elem.toString());

			Assert.fail("Unable to locate object: " + LLP_Click_1Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_LLP_Click_1");

		TestModellerLogger.PassStep(m_Driver, "Click_LLP_Click_1");
	}

     
	/**
 	 * Click Mannual_LLP_2
     * @name Click Mannual_LLP_2
     */
	public void Click_Mannual_LLP_2()
	{
        
		WebElement elem = getWebElement(Mannual_LLP_2Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Mannual_LLP_2", "Click_Mannual_LLP_2 failed. Unable to locate object: " + Mannual_LLP_2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Mannual_LLP_2", "Click_Mannual_LLP_2 failed. Unable to locate object: " + Mannual_LLP_2Elem.toString());

			Assert.fail("Unable to locate object: " + Mannual_LLP_2Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Mannual_LLP_2");

		TestModellerLogger.PassStep(m_Driver, "Click_Mannual_LLP_2");
	}

      
	/**
 	 * Enter Company_Name_3
     * @name Enter Company_Name_3
     */
 	public void Enter_Company_Name_3(String Company_Name_3)
 	{
 	    
 		WebElement elem = getWebElement(Company_Name_3Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Company_Name_3", "Enter_Company_Name_3 failed. Unable to locate object: " + Company_Name_3Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Company_Name_3", "Enter_Company_Name_3 failed. Unable to locate object: " + Company_Name_3Elem.toString());

 			Assert.fail("Unable to locate object: " + Company_Name_3Elem.toString());
         }

 		elem.sendKeys(Company_Name_3);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Company_Name_3 " + Company_Name_3);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Company_Name_3 " + Company_Name_3);
 	}

      
	/**
 	 * Enter RegNo_4
     * @name Enter RegNo_4
     */
 	public void Enter_RegNo_4(String RegNo_4)
 	{
 	    
 		WebElement elem = getWebElement(RegNo_4Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_RegNo_4", "Enter_RegNo_4 failed. Unable to locate object: " + RegNo_4Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_RegNo_4", "Enter_RegNo_4 failed. Unable to locate object: " + RegNo_4Elem.toString());

 			Assert.fail("Unable to locate object: " + RegNo_4Elem.toString());
         }

 		elem.sendKeys(RegNo_4);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_RegNo_4 " + RegNo_4);

  		TestModellerLogger.PassStep(m_Driver, "Enter_RegNo_4 " + RegNo_4);
 	}

      
	/**
 	 * Enter UTRNo_LLP_5
     * @name Enter UTRNo_LLP_5
     */
 	public void Enter_UTRNo_LLP_5(String UTRNo_LLP_5)
 	{
 	    
 		WebElement elem = getWebElement(UTRNo_LLP_5Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_UTRNo_LLP_5", "Enter_UTRNo_LLP_5 failed. Unable to locate object: " + UTRNo_LLP_5Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_UTRNo_LLP_5", "Enter_UTRNo_LLP_5 failed. Unable to locate object: " + UTRNo_LLP_5Elem.toString());

 			Assert.fail("Unable to locate object: " + UTRNo_LLP_5Elem.toString());
         }

 		elem.sendKeys(UTRNo_LLP_5);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_UTRNo_LLP_5 " + UTRNo_LLP_5);

  		TestModellerLogger.PassStep(m_Driver, "Enter_UTRNo_LLP_5 " + UTRNo_LLP_5);
 	}

      
	/**
 	 * Enter Reg_BUS_Date_6
     * @name Enter Reg_BUS_Date_6
     */
 	public void Enter_Reg_BUS_Date_6(String Reg_BUS_Date_6)
 	{
 	    
 		WebElement elem = getWebElement(Reg_BUS_Date_6Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Reg_BUS_Date_6", "Enter_Reg_BUS_Date_6 failed. Unable to locate object: " + Reg_BUS_Date_6Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Reg_BUS_Date_6", "Enter_Reg_BUS_Date_6 failed. Unable to locate object: " + Reg_BUS_Date_6Elem.toString());

 			Assert.fail("Unable to locate object: " + Reg_BUS_Date_6Elem.toString());
         }

 		elem.sendKeys(Reg_BUS_Date_6);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Reg_BUS_Date_6 " + Reg_BUS_Date_6);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Reg_BUS_Date_6 " + Reg_BUS_Date_6);
 	}

      
	/**
 	 * Enter Member_FN_7
     * @name Enter Member_FN_7
     */
 	public void Enter_Member_FN_7(String Member_FN_7)
 	{
 	    
 		WebElement elem = getWebElement(Member_FN_7Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Member_FN_7", "Enter_Member_FN_7 failed. Unable to locate object: " + Member_FN_7Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Member_FN_7", "Enter_Member_FN_7 failed. Unable to locate object: " + Member_FN_7Elem.toString());

 			Assert.fail("Unable to locate object: " + Member_FN_7Elem.toString());
         }

 		elem.sendKeys(Member_FN_7);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Member_FN_7 " + Member_FN_7);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Member_FN_7 " + Member_FN_7);
 	}

      
	/**
 	 * Enter Member_FN_8
     * @name Enter Member_FN_8
     */
 	public void Enter_Member_FN_8(String Member_FN_8)
 	{
 	    
 		WebElement elem = getWebElement(Member_FN_8Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Member_FN_8", "Enter_Member_FN_8 failed. Unable to locate object: " + Member_FN_8Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Member_FN_8", "Enter_Member_FN_8 failed. Unable to locate object: " + Member_FN_8Elem.toString());

 			Assert.fail("Unable to locate object: " + Member_FN_8Elem.toString());
         }

 		elem.sendKeys(Member_FN_8);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Member_FN_8 " + Member_FN_8);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Member_FN_8 " + Member_FN_8);
 	}

      
	/**
 	 * Enter Member2_FN_9
     * @name Enter Member2_FN_9
     */
 	public void Enter_Member2_FN_9(String Member2_FN_9)
 	{
 	    
 		WebElement elem = getWebElement(Member2_FN_9Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Member2_FN_9", "Enter_Member2_FN_9 failed. Unable to locate object: " + Member2_FN_9Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Member2_FN_9", "Enter_Member2_FN_9 failed. Unable to locate object: " + Member2_FN_9Elem.toString());

 			Assert.fail("Unable to locate object: " + Member2_FN_9Elem.toString());
         }

 		elem.sendKeys(Member2_FN_9);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Member2_FN_9 " + Member2_FN_9);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Member2_FN_9 " + Member2_FN_9);
 	}

      
	/**
 	 * Enter Member2_FN_10
     * @name Enter Member2_FN_10
     */
 	public void Enter_Member2_FN_10(String Member2_FN_10)
 	{
 	    
 		WebElement elem = getWebElement(Member2_FN_10Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Member2_FN_10", "Enter_Member2_FN_10 failed. Unable to locate object: " + Member2_FN_10Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Member2_FN_10", "Enter_Member2_FN_10 failed. Unable to locate object: " + Member2_FN_10Elem.toString());

 			Assert.fail("Unable to locate object: " + Member2_FN_10Elem.toString());
         }

 		elem.sendKeys(Member2_FN_10);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Member2_FN_10 " + Member2_FN_10);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Member2_FN_10 " + Member2_FN_10);
 	}

     
	/**
 	 * Click LLP_Save _11
     * @name Click LLP_Save _11
     */
	public void Click_LLP_Save__11()
	{
        
		WebElement elem = getWebElement(LLP_Save__11Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_LLP_Save__11", "Click_LLP_Save__11 failed. Unable to locate object: " + LLP_Save__11Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_LLP_Save__11", "Click_LLP_Save__11 failed. Unable to locate object: " + LLP_Save__11Elem.toString());

			Assert.fail("Unable to locate object: " + LLP_Save__11Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_LLP_Save__11");

		TestModellerLogger.PassStep(m_Driver, "Click_LLP_Save__11");
	}

     
	/**
 	 * Click Cancel
     * @name Click Cancel
     */
	public void Click_Cancel()
	{
        
		WebElement elem = getWebElement(CancelElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Cancel", "Click_Cancel failed. Unable to locate object: " + CancelElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Cancel", "Click_Cancel failed. Unable to locate object: " + CancelElem.toString());

			Assert.fail("Unable to locate object: " + CancelElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Cancel");

		TestModellerLogger.PassStep(m_Driver, "Click_Cancel");
	}
}