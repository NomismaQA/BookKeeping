package pages.Sales_customer_add;

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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/9ee211f4-8dfd-48fe-8cf5-468125e6fa82
@TestModellerModule(guid = "9ee211f4-8dfd-48fe-8cf5-468125e6fa82")
public class Salemenu extends BasePage
{
	public Salemenu (WebDriver driver)
	{
		super(driver);
	}


	
	private By Sales_menu1Elem = By.xpath("//*[@id='ctl00_SideMenu1_incomeMenu']/a/span");

	private By Sales_View__menu2Elem = By.xpath("//*[@id='ctl00_divMainContent']/header/div/div[3]/a");

	private By Cust_List_3Elem = By.xpath("//A[@id='ctl00_cpHeaderRight_btnCustomer']");

	private By Add_Customer__4Elem = By.xpath("//A[@id='ctl00_cpHeaderRight_btnAdd']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AccountUI/Customer.aspx?FYCode=117243&CompanyCode=16906&menuid=0");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/Customer.aspx?FYCode=117243&CompanyCode=16906&menuid=0");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/Customer.aspx?FYCode=117243&CompanyCode=16906&menuid=0");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/AccountUI/Customer.aspx?FYCode=117243&CompanyCode=16906&menuid=0";

        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/AccountUI/Customer.aspx?FYCode=117243&CompanyCode=16906&menuid=0")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click Sales_menu1
     * @name Click Sales_menu1
     */
	public void Click_Sales_menu1()
	{
        
		WebElement elem = getWebElement(Sales_menu1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Sales_menu1", "Click_Sales_menu1 failed. Unable to locate object: " + Sales_menu1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Sales_menu1", "Click_Sales_menu1 failed. Unable to locate object: " + Sales_menu1Elem.toString());

			Assert.fail("Unable to locate object: " + Sales_menu1Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Sales_menu1");

		TestModellerLogger.PassStep(m_Driver, "Click_Sales_menu1");
	}

     
	/**
 	 * Click Sales_View _menu2
     * @name Click Sales_View _menu2
     */
	public void Click_Sales_View__menu2()
	{
        
		WebElement elem = getWebElement(Sales_View__menu2Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Sales_View__menu2", "Click_Sales_View__menu2 failed. Unable to locate object: " + Sales_View__menu2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Sales_View__menu2", "Click_Sales_View__menu2 failed. Unable to locate object: " + Sales_View__menu2Elem.toString());

			Assert.fail("Unable to locate object: " + Sales_View__menu2Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Sales_View__menu2");

		TestModellerLogger.PassStep(m_Driver, "Click_Sales_View__menu2");
	}

     
	/**
 	 * Click Cust_List_3
     * @name Click Cust_List_3
     */
	public void Click_Cust_List_3()
	{
        
		WebElement elem = getWebElement(Cust_List_3Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Cust_List_3", "Click_Cust_List_3 failed. Unable to locate object: " + Cust_List_3Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Cust_List_3", "Click_Cust_List_3 failed. Unable to locate object: " + Cust_List_3Elem.toString());

			Assert.fail("Unable to locate object: " + Cust_List_3Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Cust_List_3");

		TestModellerLogger.PassStep(m_Driver, "Click_Cust_List_3");
	}

     
	/**
 	 * Click Add_Customer _4
     * @name Click Add_Customer _4
     */
	public void Click_Add_Customer__4()
	{
        
		WebElement elem = getWebElement(Add_Customer__4Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Add_Customer__4", "Click_Add_Customer__4 failed. Unable to locate object: " + Add_Customer__4Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Add_Customer__4", "Click_Add_Customer__4 failed. Unable to locate object: " + Add_Customer__4Elem.toString());

			Assert.fail("Unable to locate object: " + Add_Customer__4Elem.toString());
        }

		elem.click();
          	
utilities.PassScreenshot.Getscreenshot11("addcustomer screen","Sales");
		ExtentReportManager.passStep(m_Driver, "Click_Add_Customer__4");

		TestModellerLogger.PassStep(m_Driver, "Click_Add_Customer__4");
	}
}