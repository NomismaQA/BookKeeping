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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/35977acf-0051-4561-86d0-264d320bec94
@TestModellerModule(guid = "35977acf-0051-4561-86d0-264d320bec94")
public class EXPMENU extends BasePage
{
	public EXPMENU (WebDriver driver)
	{
		super(driver);
	}


	
	//private By ExpendituremenuElem = By.xpath("//A[@href='../AccountUI/SupplierBill.aspx?FYCode=52444&CompanyCode=13236']");
	private By ExpendituremenuElem = By.xpath("//*[@id='ctl00_SideMenu1_ExpensesMenu']/a/span");
	private By Newplus_ClickElem = By.xpath("//*[@id='ctl00_divMainContent']/header/div/div[3]/a");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/AccountUI/SupplierBill.aspx?FYCode=52444&CompanyCode=13236");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AccountUI/SupplierBill.aspx?FYCode=52444&CompanyCode=13236");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AccountUI/SupplierBill.aspx?FYCode=52444&CompanyCode=13236");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AccountUI/SupplierBill.aspx?FYCode=52444&CompanyCode=13236";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AccountUI/SupplierBill.aspx?FYCode=52444&CompanyCode=13236")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click Expendituremenu
     * @name Click Expendituremenu
     */
	public void Click_Expendituremenu()
	{
        
		WebElement elem = getWebElement(ExpendituremenuElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Expendituremenu", "Click_Expendituremenu failed. Unable to locate object: " + ExpendituremenuElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Expendituremenu", "Click_Expendituremenu failed. Unable to locate object: " + ExpendituremenuElem.toString());

			Assert.fail("Unable to locate object: " + ExpendituremenuElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Expendituremenu");

		TestModellerLogger.PassStep(m_Driver, "Click_Expendituremenu");
	}

     
	/**
 	 * Click Newplus_Click
     * @name Click Newplus_Click
     */
	public void Click_Newplus_Click()
	{
        
		WebElement elem = getWebElement(Newplus_ClickElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Newplus_Click", "Click_Newplus_Click failed. Unable to locate object: " + Newplus_ClickElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Newplus_Click", "Click_Newplus_Click failed. Unable to locate object: " + Newplus_ClickElem.toString());

			Assert.fail("Unable to locate object: " + Newplus_ClickElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Newplus_Click");

		TestModellerLogger.PassStep(m_Driver, "Click_Newplus_Click");
	}
}