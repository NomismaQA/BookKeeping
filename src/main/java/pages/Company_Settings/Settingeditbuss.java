package pages.Company_Settings;

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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/f5887ea1-0f50-4e05-b30f-67fac991d18e
@TestModellerModule(guid = "f5887ea1-0f50-4e05-b30f-67fac991d18e")
public class Settingeditbuss extends BasePage
{
	public Settingeditbuss (WebDriver driver)
	{
		super(driver);
	}


	
	private By Src_edit_icon_click_1Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_hrefEditClient']");

	private By Select_Services_Click_2Elem = By.xpath("//label[normalize-space()= 'Services']/../../div[2]/select");

	private By Enter_Reg_No_3Elem = By.xpath("//INPUT[@id='ctl00_cPH_tbContainer_TbGeneral_txtRegNo']");

	private By Enter_Address_4Elem = By.xpath("//INPUT[@id='ctl00_cPH_tbContainer_TbGeneral_txtAddress1']");

	private By Enter_Post_Code_5Elem = By.xpath("//INPUT[@id='ctl00_cPH_tbContainer_TbGeneral_txtPostCode']");

	private By Click_Save__btn_6Elem = By.xpath("//A[@id='ctl00_cPH_tbContainer_TbGeneral_btnGSave']");

	private By Click_Back_btn_7Elem = By.xpath("//A[@id='ctl00_cpHeaderRight_btneditcancel']");

	private By Cross_close_clickElem = By.xpath("//BUTTON[@id='cboxClose']");


	
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
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/AgentUI/Company.aspx";

        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/AgentUI/Company.aspx")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click Src_edit_icon_click_1
     * @name Click Src_edit_icon_click_1
     */
	public void Click_Src_edit_icon_click_1()
	{
        
		WebElement elem = getWebElement(Src_edit_icon_click_1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Src_edit_icon_click_1", "Click_Src_edit_icon_click_1 failed. Unable to locate object: " + Src_edit_icon_click_1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Src_edit_icon_click_1", "Click_Src_edit_icon_click_1 failed. Unable to locate object: " + Src_edit_icon_click_1Elem.toString());

			Assert.fail("Unable to locate object: " + Src_edit_icon_click_1Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Src_edit_icon_click_1");

		TestModellerLogger.PassStep(m_Driver, "Click_Src_edit_icon_click_1");
	}

    
	/**
 	 * Select Select_Services_Click_2
     * @name Select Select_Services_Click_2
     */
    public void Select_Select_Services_Click_2(String Select_Services_Click_2)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(Select_Services_Click_2Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Select_Services_Click_2", "Select_Select_Services_Click_2 failed. Unable to locate object: " + Select_Services_Click_2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Select_Services_Click_2", "Select_Select_Services_Click_2 failed. Unable to locate object: " + Select_Services_Click_2Elem.toString());

 			Assert.fail("Unable to locate object: " + Select_Services_Click_2Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Select_Services_Click_2);
 		
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_Select_Services_Click_2 " + Select_Services_Click_2);

 		TestModellerLogger.PassStep(m_Driver, "Select_Select_Services_Click_2 " + Select_Services_Click_2);
 	}

      
	/**
 	 * Enter Enter_Reg_No_3
     * @name Enter Enter_Reg_No_3
     */
 	public void Enter_Enter_Reg_No_3(String Enter_Reg_No_3)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(Enter_Reg_No_3Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_Reg_No_3", "Enter_Enter_Reg_No_3 failed. Unable to locate object: " + Enter_Reg_No_3Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_Reg_No_3", "Enter_Enter_Reg_No_3 failed. Unable to locate object: " + Enter_Reg_No_3Elem.toString());

 			Assert.fail("Unable to locate object: " + Enter_Reg_No_3Elem.toString());
         }
 		 elem.sendKeys(Enter_Reg_No_3);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_Reg_No_3 " + Enter_Reg_No_3);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_Reg_No_3 " + Enter_Reg_No_3);
 	}

      
	/**
 	 * Enter Enter_Address_4
     * @name Enter Enter_Address_4
     */
 	public void Enter_Enter_Address_4(String Enter_Address_4)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(Enter_Address_4Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_Address_4", "Enter_Enter_Address_4 failed. Unable to locate object: " + Enter_Address_4Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_Address_4", "Enter_Enter_Address_4 failed. Unable to locate object: " + Enter_Address_4Elem.toString());

 			Assert.fail("Unable to locate object: " + Enter_Address_4Elem.toString());
         }

 		elem.sendKeys(Enter_Address_4);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_Address_4 " + Enter_Address_4);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_Address_4 " + Enter_Address_4);
 	}

      
	/**
 	 * Enter Enter_Post_Code_5
     * @name Enter Enter_Post_Code_5
     */
 	public void Enter_Enter_Post_Code_5(String Enter_Post_Code_5)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(Enter_Post_Code_5Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_Post_Code_5", "Enter_Enter_Post_Code_5 failed. Unable to locate object: " + Enter_Post_Code_5Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_Post_Code_5", "Enter_Enter_Post_Code_5 failed. Unable to locate object: " + Enter_Post_Code_5Elem.toString());

 			Assert.fail("Unable to locate object: " + Enter_Post_Code_5Elem.toString());
         }

 		elem.sendKeys(Enter_Post_Code_5);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_Post_Code_5 " + Enter_Post_Code_5);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_Post_Code_5 " + Enter_Post_Code_5);
 	}

     
	/**
 	 * Click Click_Save _btn_6
     * @name Click Click_Save _btn_6
     */
	public void Click_Click_Save__btn_6()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(Click_Save__btn_6Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Click_Save__btn_6", "Click_Click_Save__btn_6 failed. Unable to locate object: " + Click_Save__btn_6Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Click_Save__btn_6", "Click_Click_Save__btn_6 failed. Unable to locate object: " + Click_Save__btn_6Elem.toString());

			Assert.fail("Unable to locate object: " + Click_Save__btn_6Elem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_Click_Save__btn_6");

		TestModellerLogger.PassStep(m_Driver, "Click_Click_Save__btn_6");
	}

     
	/**
 	 * Click Click_Back_btn_7
     * @name Click Click_Back_btn_7
     */
	public void Click_Click_Back_btn_7()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(Click_Back_btn_7Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Click_Back_btn_7", "Click_Click_Back_btn_7 failed. Unable to locate object: " + Click_Back_btn_7Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Click_Back_btn_7", "Click_Click_Back_btn_7 failed. Unable to locate object: " + Click_Back_btn_7Elem.toString());

			Assert.fail("Unable to locate object: " + Click_Back_btn_7Elem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_Click_Back_btn_7");

		TestModellerLogger.PassStep(m_Driver, "Click_Click_Back_btn_7");
	}

     
	/**
 	 * Click Cross_close_click
     * @name Click Cross_close_click
     */
	public void Click_Cross_close_click()
	{
        
		WebElement elem = getWebElement(Cross_close_clickElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Cross_close_click", "Click_Cross_close_click failed. Unable to locate object: " + Cross_close_clickElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Cross_close_click", "Click_Cross_close_click failed. Unable to locate object: " + Cross_close_clickElem.toString());

			Assert.fail("Unable to locate object: " + Cross_close_clickElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Cross_close_click");

		TestModellerLogger.PassStep(m_Driver, "Click_Cross_close_click");
	}
}