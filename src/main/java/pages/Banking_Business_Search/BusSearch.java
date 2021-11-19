package pages.Banking_Business_Search;

import pages.BasePage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.ClosePopup;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/47a41e94-b0ee-4928-9354-7ac313d74598
@TestModellerModule(guid = "47a41e94-b0ee-4928-9354-7ac313d74598")
public class BusSearch extends BasePage
{
	String p;
	public BusSearch (WebDriver driver)
	{
		super(driver);
	}


	private By Clients__click_2Elem = By.xpath("/html/body/form/main/div[5]/div[2]/ul/li[2]/a");
	private By Enter_Client_Name1Elem = By.xpath("//label[normalize-space()= 'Client name:']/../div/input");

	private By Select_Service2Elem = By.xpath("//label[normalize-space()= 'Service:']/../div/select");

	private By Select_Type4Elem = By.xpath("//SELECT[@name='ctl00$ctl00$ParentContent$cPHFilter$ddlType']");

	private By Select_Status5Elem = By.xpath("//SELECT[@name='ctl00$ctl00$ParentContent$cPHFilter$ddStatus']");

	private By Select_Acmgr6Elem = By.xpath("//label[normalize-space()= 'Account manager:']/../div/select");

	private By Click_Search_btn7Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPHFilter_btnSearch']");

	private By Add__New_Client_btn8Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHeaderRight_btnAdd']");

	private By TD_Client_name9Elem = By.xpath("//SPAN[@class='border-btm-dotted el-selection']");

	private By TF_Service_type10Elem = By.xpath("//TD[contains(text(),'Bookkeeping')]");

	private By TD_Statis11Elem = By.xpath("//TD[@class='text-center el-selection']");

	private By TD_Eye_icon12Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_hrefImpersonate']");

	private By TD_Edit_icon13Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_hrefEditClient']");

	
	/**
 	 * Click Clients _click_2
     * @name Click Clients _click_2
     */
	public void Click_Clients__click_2()
	{
        
		WebElement elem = getWebElement(Clients__click_2Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Clients__click_2", "Click_Clients__click_2 failed. Unable to locate object: " + Clients__click_2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Clients__click_2", "Click_Clients__click_2 failed. Unable to locate object: " + Clients__click_2Elem.toString());

			Assert.fail("Unable to locate object: " + Clients__click_2Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Clients__click_2");

		TestModellerLogger.PassStep(m_Driver, "Click_Clients__click_2");
	}

	
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
 	 * Enter Enter_Client_Name1
     * @name Enter Enter_Client_Name1
     */
 	public void Enter_Enter_Client_Name1(String Enter_Client_Name1)
 	{
 	    
 		WebElement elem = getWebElement(Enter_Client_Name1Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_Client_Name1", "Enter_Enter_Client_Name1 failed. Unable to locate object: " + Enter_Client_Name1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_Client_Name1", "Enter_Enter_Client_Name1 failed. Unable to locate object: " + Enter_Client_Name1Elem.toString());

 			Assert.fail("Unable to locate object: " + Enter_Client_Name1Elem.toString());
         }

 		elem.sendKeys(Enter_Client_Name1);
 		
 		 ClosePopup.ValidateAndPopUp(m_Driver);
  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_Client_Name1 " + Enter_Client_Name1);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_Client_Name1 " + Enter_Client_Name1);
 	}

    
	/**
 	 * Select Select_Service2
     * @name Select Select_Service2
     */
    public void Select_Select_Service2(String Select_Service2)
 	{
 	    
 		WebElement elem = getWebElement(Select_Service2Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Select_Service2", "Select_Select_Service2 failed. Unable to locate object: " + Select_Service2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Select_Service2", "Select_Select_Service2 failed. Unable to locate object: " + Select_Service2Elem.toString());

 			Assert.fail("Unable to locate object: " + Select_Service2Elem.toString());
         }


 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Select_Service2);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Select_Service2 " + Select_Service2);

 		TestModellerLogger.PassStep(m_Driver, "Select_Select_Service2 " + Select_Service2);
 	}

    
	/**
 	 * Select Select_Type4
     * @name Select Select_Type4
     */
    public void Select_Select_Type4(String Select_Type4)
 	{
 	    
 		WebElement elem = getWebElement(Select_Type4Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Select_Type4", "Select_Select_Type4 failed. Unable to locate object: " + Select_Type4Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Select_Type4", "Select_Select_Type4 failed. Unable to locate object: " + Select_Type4Elem.toString());

 			Assert.fail("Unable to locate object: " + Select_Type4Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Select_Type4);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Select_Type4 " + Select_Type4);

 		TestModellerLogger.PassStep(m_Driver, "Select_Select_Type4 " + Select_Type4);
 	}

    
	/**
 	 * Select Select_Status5
     * @name Select Select_Status5
     */
    public void Select_Select_Status5(String Select_Status5)
 	{
 	    
 		WebElement elem = getWebElement(Select_Status5Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Select_Status5", "Select_Select_Status5 failed. Unable to locate object: " + Select_Status5Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Select_Status5", "Select_Select_Status5 failed. Unable to locate object: " + Select_Status5Elem.toString());

 			Assert.fail("Unable to locate object: " + Select_Status5Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Select_Status5);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Select_Status5 " + Select_Status5);

 		TestModellerLogger.PassStep(m_Driver, "Select_Select_Status5 " + Select_Status5);
 	}

    
	/**
 	 * Select Select_Acmgr6
     * @name Select Select_Acmgr6
     */
    public void Select_Select_Acmgr6(String Select_Acmgr6)
 	{
 	    
 		WebElement elem = getWebElement(Select_Acmgr6Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Select_Acmgr6", "Select_Select_Acmgr6 failed. Unable to locate object: " + Select_Acmgr6Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Select_Acmgr6", "Select_Select_Acmgr6 failed. Unable to locate object: " + Select_Acmgr6Elem.toString());

 			Assert.fail("Unable to locate object: " + Select_Acmgr6Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Select_Acmgr6);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Select_Acmgr6 " + Select_Acmgr6);

 		TestModellerLogger.PassStep(m_Driver, "Select_Select_Acmgr6 " + Select_Acmgr6);
 	}

     
	/**
 	 * Click Click_Search_btn7
     * @name Click Click_Search_btn7
     */
	public void Click_Click_Search_btn7()
	{
        
		WebElement elem = getWebElement(Click_Search_btn7Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Click_Search_btn7", "Click_Click_Search_btn7 failed. Unable to locate object: " + Click_Search_btn7Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Click_Search_btn7", "Click_Click_Search_btn7 failed. Unable to locate object: " + Click_Search_btn7Elem.toString());

			Assert.fail("Unable to locate object: " + Click_Search_btn7Elem.toString());
        }

		elem.click();
          	
		
		
		
		

		ExtentReportManager.passStep(m_Driver, "Click_Click_Search_btn7");

		TestModellerLogger.PassStep(m_Driver, "Click_Click_Search_btn7");
	}

     
	/**
 	 * Click Add _New_Client_btn8
     * @name Click Add _New_Client_btn8
     */
	public void Click_Add__New_Client_btn8()
	{
        
		WebElement elem = getWebElement(Add__New_Client_btn8Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Add__New_Client_btn8", "Click_Add__New_Client_btn8 failed. Unable to locate object: " + Add__New_Client_btn8Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Add__New_Client_btn8", "Click_Add__New_Client_btn8 failed. Unable to locate object: " + Add__New_Client_btn8Elem.toString());

			Assert.fail("Unable to locate object: " + Add__New_Client_btn8Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Add__New_Client_btn8");

		TestModellerLogger.PassStep(m_Driver, "Click_Add__New_Client_btn8");
	}

     
	/**
 	 * Click TD_Client_name9
     * @name Click TD_Client_name9
     */
	public void Click_TD_Client_name9()
	{
        
	List<WebElement> list1=m_Driver.findElements(By.xpath("/html/body/form/main/div[5]/div[3]/div/div[3]/div/div/table/tbody/tr"));
	
	System.out.println("List sized" +list1.size());
		 if(list1.size()>1)
		 {
	for (WebElement row : list1) 
	{ 
	    List<WebElement> cells = row.findElements(By.tagName("td")); 

	    for (WebElement cell : cells) 
	    {         

	    System.out.println(cell.getText());
	 
	    }
	   
	}
		 }
	
	else
	{
		System.out.println("no data found");
		
	}
		 
	}

	/**
 	 * Click TF_Service_type10
     * @name Click TF_Service_type10
     */
	public void Click_TF_Service_type10()
	{
        
		WebElement elem = getWebElement(TF_Service_type10Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_TF_Service_type10", "Click_TF_Service_type10 failed. Unable to locate object: " + TF_Service_type10Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_TF_Service_type10", "Click_TF_Service_type10 failed. Unable to locate object: " + TF_Service_type10Elem.toString());

			Assert.fail("Unable to locate object: " + TF_Service_type10Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_TF_Service_type10");

		TestModellerLogger.PassStep(m_Driver, "Click_TF_Service_type10");
	}

     
	/**
 	 * Click TD_Statis11
     * @name Click TD_Statis11
     */
	public void Click_TD_Statis11()
	{
        
		WebElement elem = getWebElement(TD_Statis11Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_TD_Statis11", "Click_TD_Statis11 failed. Unable to locate object: " + TD_Statis11Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_TD_Statis11", "Click_TD_Statis11 failed. Unable to locate object: " + TD_Statis11Elem.toString());

			Assert.fail("Unable to locate object: " + TD_Statis11Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_TD_Statis11");

		TestModellerLogger.PassStep(m_Driver, "Click_TD_Statis11");
	}

     
	/**
 	 * Click TD_Eye_icon12
     * @name Click TD_Eye_icon12
     */
	public void Click_TD_Eye_icon12()
	{
        
		WebElement elem = getWebElement(TD_Eye_icon12Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_TD_Eye_icon12", "Click_TD_Eye_icon12 failed. Unable to locate object: " + TD_Eye_icon12Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_TD_Eye_icon12", "Click_TD_Eye_icon12 failed. Unable to locate object: " + TD_Eye_icon12Elem.toString());

			Assert.fail("Unable to locate object: " + TD_Eye_icon12Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_TD_Eye_icon12");

		TestModellerLogger.PassStep(m_Driver, "Click_TD_Eye_icon12");
	}

     
	/**
 	 * Click TD_Edit_icon13
     * @name Click TD_Edit_icon13
     */
	public void Click_TD_Edit_icon13()
	{
        
		WebElement elem = getWebElement(TD_Edit_icon13Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_TD_Edit_icon13", "Click_TD_Edit_icon13 failed. Unable to locate object: " + TD_Edit_icon13Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_TD_Edit_icon13", "Click_TD_Edit_icon13 failed. Unable to locate object: " + TD_Edit_icon13Elem.toString());

			Assert.fail("Unable to locate object: " + TD_Edit_icon13Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_TD_Edit_icon13");

		TestModellerLogger.PassStep(m_Driver, "Click_TD_Edit_icon13");
	}
}