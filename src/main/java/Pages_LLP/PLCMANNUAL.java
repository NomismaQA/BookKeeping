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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/19251225-91df-42c4-be6b-92b78e4c4098
@TestModellerModule(guid = "19251225-91df-42c4-be6b-92b78e4c4098")
public class PLCMANNUAL extends BasePage
{
	public PLCMANNUAL (WebDriver driver)
	{
		super(driver);
	}


	
	private By PLC_Clicked_1Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_btnPLC']");

	private By PLC_Manual_clicked_2Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_ltBussinessName']");

	private By Enter_Com_Name_3Elem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtCompanyName']");

	private By Enter_RegNo_4Elem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtRegNo']");

	private By Enter_Buss_RegDate_5Elem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtCRegDate']");

	private By Enter_dir_FN_6Elem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtFirstName1']");

	private By Enter_dir_LN_7Elem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtLastName1']");

	private By Enter_Save_Click9Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_btnSave']");

	private By Enter_Cancel_click10Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_btnCancel']");

	private By Cr_Payroll__Profile_chkbox_8Elem = By.xpath("//label[normalize-space()= 'Create Payroll Profile']/../input");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AgentUI/CompanyAdd.aspx?menuid=0&ct=5");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AgentUI/CompanyAdd.aspx?menuid=0&ct=5");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AgentUI/CompanyAdd.aspx?menuid=0&ct=5");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/AgentUI/CompanyAdd.aspx?menuid=0&ct=5";

        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/AgentUI/CompanyAdd.aspx?menuid=0&ct=5")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click PLC_Clicked_1
     * @name Click PLC_Clicked_1
     */
	public void Click_PLC_Clicked_1()
	{
        
		WebElement elem = getWebElement(PLC_Clicked_1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_PLC_Clicked_1", "Click_PLC_Clicked_1 failed. Unable to locate object: " + PLC_Clicked_1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_PLC_Clicked_1", "Click_PLC_Clicked_1 failed. Unable to locate object: " + PLC_Clicked_1Elem.toString());

			Assert.fail("Unable to locate object: " + PLC_Clicked_1Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_PLC_Clicked_1");

		TestModellerLogger.PassStep(m_Driver, "Click_PLC_Clicked_1");
	}

     
	/**
 	 * Click PLC_Manual_clicked_2
     * @name Click PLC_Manual_clicked_2
     */
	public void Click_PLC_Manual_clicked_2()
	{
        
		WebElement elem = getWebElement(PLC_Manual_clicked_2Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_PLC_Manual_clicked_2", "Click_PLC_Manual_clicked_2 failed. Unable to locate object: " + PLC_Manual_clicked_2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_PLC_Manual_clicked_2", "Click_PLC_Manual_clicked_2 failed. Unable to locate object: " + PLC_Manual_clicked_2Elem.toString());

			Assert.fail("Unable to locate object: " + PLC_Manual_clicked_2Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_PLC_Manual_clicked_2");

		TestModellerLogger.PassStep(m_Driver, "Click_PLC_Manual_clicked_2");
	}

      
	/**
 	 * Enter Enter_Com_Name_3
     * @name Enter Enter_Com_Name_3
     */
 	public void Enter_Enter_Com_Name_3(String Enter_Com_Name_3)
 	{
 	    
 		WebElement elem = getWebElement(Enter_Com_Name_3Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_Com_Name_3", "Enter_Enter_Com_Name_3 failed. Unable to locate object: " + Enter_Com_Name_3Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_Com_Name_3", "Enter_Enter_Com_Name_3 failed. Unable to locate object: " + Enter_Com_Name_3Elem.toString());

 			Assert.fail("Unable to locate object: " + Enter_Com_Name_3Elem.toString());
         }

 		elem.sendKeys(Enter_Com_Name_3);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_Com_Name_3 " + Enter_Com_Name_3);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_Com_Name_3 " + Enter_Com_Name_3);
 	}

      
	/**
 	 * Enter Enter_RegNo_4
     * @name Enter Enter_RegNo_4
     */
 	public void Enter_Enter_RegNo_4(String Enter_RegNo_4)
 	{
 	    
 		WebElement elem = getWebElement(Enter_RegNo_4Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_RegNo_4", "Enter_Enter_RegNo_4 failed. Unable to locate object: " + Enter_RegNo_4Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_RegNo_4", "Enter_Enter_RegNo_4 failed. Unable to locate object: " + Enter_RegNo_4Elem.toString());

 			Assert.fail("Unable to locate object: " + Enter_RegNo_4Elem.toString());
         }

 		elem.sendKeys(Enter_RegNo_4);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_RegNo_4 " + Enter_RegNo_4);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_RegNo_4 " + Enter_RegNo_4);
 	}

      
	/**
 	 * Enter Enter_Buss_RegDate_5
     * @name Enter Enter_Buss_RegDate_5
     */
 	public void Enter_Enter_Buss_RegDate_5(String Enter_Buss_RegDate_5)
 	{
 	    
 		WebElement elem = getWebElement(Enter_Buss_RegDate_5Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_Buss_RegDate_5", "Enter_Enter_Buss_RegDate_5 failed. Unable to locate object: " + Enter_Buss_RegDate_5Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_Buss_RegDate_5", "Enter_Enter_Buss_RegDate_5 failed. Unable to locate object: " + Enter_Buss_RegDate_5Elem.toString());

 			Assert.fail("Unable to locate object: " + Enter_Buss_RegDate_5Elem.toString());
         }

 		elem.sendKeys(Enter_Buss_RegDate_5);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_Buss_RegDate_5 " + Enter_Buss_RegDate_5);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_Buss_RegDate_5 " + Enter_Buss_RegDate_5);
 	}

      
	/**
 	 * Enter Enter_dir_FN_6
     * @name Enter Enter_dir_FN_6
     */
 	public void Enter_Enter_dir_FN_6(String Enter_dir_FN_6)
 	{
 	    
 		WebElement elem = getWebElement(Enter_dir_FN_6Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_dir_FN_6", "Enter_Enter_dir_FN_6 failed. Unable to locate object: " + Enter_dir_FN_6Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_dir_FN_6", "Enter_Enter_dir_FN_6 failed. Unable to locate object: " + Enter_dir_FN_6Elem.toString());

 			Assert.fail("Unable to locate object: " + Enter_dir_FN_6Elem.toString());
         }

 		elem.sendKeys(Enter_dir_FN_6);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_dir_FN_6 " + Enter_dir_FN_6);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_dir_FN_6 " + Enter_dir_FN_6);
 	}

      
	/**
 	 * Enter Enter_dir_LN_7
     * @name Enter Enter_dir_LN_7
     */
 	public void Enter_Enter_dir_LN_7(String Enter_dir_LN_7)
 	{
 	    
 		WebElement elem = getWebElement(Enter_dir_LN_7Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_dir_LN_7", "Enter_Enter_dir_LN_7 failed. Unable to locate object: " + Enter_dir_LN_7Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_dir_LN_7", "Enter_Enter_dir_LN_7 failed. Unable to locate object: " + Enter_dir_LN_7Elem.toString());

 			Assert.fail("Unable to locate object: " + Enter_dir_LN_7Elem.toString());
         }

 		elem.sendKeys(Enter_dir_LN_7);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_dir_LN_7 " + Enter_dir_LN_7);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_dir_LN_7 " + Enter_dir_LN_7);
 	}

     
	/**
 	 * Click Enter_Save_Click9
     * @name Click Enter_Save_Click9
     */
	public void Click_Enter_Save_Click9()
	{
        
		WebElement elem = getWebElement(Enter_Save_Click9Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Enter_Save_Click9", "Click_Enter_Save_Click9 failed. Unable to locate object: " + Enter_Save_Click9Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Enter_Save_Click9", "Click_Enter_Save_Click9 failed. Unable to locate object: " + Enter_Save_Click9Elem.toString());

			Assert.fail("Unable to locate object: " + Enter_Save_Click9Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Enter_Save_Click9");

		TestModellerLogger.PassStep(m_Driver, "Click_Enter_Save_Click9");
	}

     
	/**
 	 * Click Enter_Cancel_click10
     * @name Click Enter_Cancel_click10
     */
	public void Click_Enter_Cancel_click10()
	{
        
		WebElement elem = getWebElement(Enter_Cancel_click10Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Enter_Cancel_click10", "Click_Enter_Cancel_click10 failed. Unable to locate object: " + Enter_Cancel_click10Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Enter_Cancel_click10", "Click_Enter_Cancel_click10 failed. Unable to locate object: " + Enter_Cancel_click10Elem.toString());

			Assert.fail("Unable to locate object: " + Enter_Cancel_click10Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Enter_Cancel_click10");

		TestModellerLogger.PassStep(m_Driver, "Click_Enter_Cancel_click10");
	}

     
	/**
 	 * Click Cr_Payroll_ Profile_chkbox_8
     * @name Click Cr_Payroll_ Profile_chkbox_8
     */
	public void Click_Cr_Payroll__Profile_chkbox_8()
	{
        
		WebElement elem = getWebElement(Cr_Payroll__Profile_chkbox_8Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Cr_Payroll__Profile_chkbox_8", "Click_Cr_Payroll__Profile_chkbox_8 failed. Unable to locate object: " + Cr_Payroll__Profile_chkbox_8Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Cr_Payroll__Profile_chkbox_8", "Click_Cr_Payroll__Profile_chkbox_8 failed. Unable to locate object: " + Cr_Payroll__Profile_chkbox_8Elem.toString());

			Assert.fail("Unable to locate object: " + Cr_Payroll__Profile_chkbox_8Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Cr_Payroll__Profile_chkbox_8");

		TestModellerLogger.PassStep(m_Driver, "Click_Cr_Payroll__Profile_chkbox_8");
	}
}