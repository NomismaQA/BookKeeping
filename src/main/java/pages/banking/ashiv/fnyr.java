package pages.banking.ashiv;

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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/5350e122-4238-4a42-a86f-bec6c1608cf2
@TestModellerModule(guid = "5350e122-4238-4a42-a86f-bec6c1608cf2")
public class fnyr extends BasePage
{
	public fnyr (WebDriver driver)
	{
		super(driver);
	}


	
	private By Financial_yr_dropdownElem = By.xpath("//SELECT[@name='ctl00$ddlFinancialYear']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AccountUI/UnprocessedBankTran.aspx?FYCode=117008&CompanyCode=16685&ItemsPerPageFstReq=1");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/UnprocessedBankTran.aspx?FYCode=117008&CompanyCode=16685&ItemsPerPageFstReq=1");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/UnprocessedBankTran.aspx?FYCode=117008&CompanyCode=16685&ItemsPerPageFstReq=1");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/AccountUI/UnprocessedBankTran.aspx?FYCode=117008&CompanyCode=16685&ItemsPerPageFstReq=1";

        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/AccountUI/UnprocessedBankTran.aspx?FYCode=117008&CompanyCode=16685&ItemsPerPageFstReq=1")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

    
	/**
 	 * Select Financial_yr_dropdown
     * @name Select Financial_yr_dropdown
     */
    public void Select_Financial_yr_dropdown(String Financial_yr_dropdown)
 	{
 	    
 		WebElement elem = getWebElement(Financial_yr_dropdownElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Financial_yr_dropdown", "Select_Financial_yr_dropdown failed. Unable to locate object: " + Financial_yr_dropdownElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Financial_yr_dropdown", "Select_Financial_yr_dropdown failed. Unable to locate object: " + Financial_yr_dropdownElem.toString());

 			Assert.fail("Unable to locate object: " + Financial_yr_dropdownElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Financial_yr_dropdown);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Financial_yr_dropdown " + Financial_yr_dropdown);

 		TestModellerLogger.PassStep(m_Driver, "Select_Financial_yr_dropdown " + Financial_yr_dropdown);
 	}
}