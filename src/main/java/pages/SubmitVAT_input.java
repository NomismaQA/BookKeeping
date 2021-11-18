package pages;

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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/f93e46af-02e0-499c-b29b-67e344c4f34f
@TestModellerModule(guid = "f93e46af-02e0-499c-b29b-67e344c4f34f")
public class SubmitVAT_input extends BasePage
{
	public SubmitVAT_input (WebDriver driver)
	{
		super(driver);
	}


	
//	private By VATReturnsTABElem = By.xpath("//A[@href='../AccountUI/VATReturn.aspx?FYCode=53148&CompanyCode=13727']");
	private By VATReturnsTABElem = By.xpath("//span[contains(text(),'VAT Returns')]");
	
	private By ClickOnEditLinkElem = By.xpath("//*[@id='ctl00_cPH_rptrDisplayRecords_ctl00_lnkEdit']/img");
	//private By ClickOnEditLinkElem = By.xpath("//A[@class='toggleSettings']");
	//private By ClickOnEditLinkElem = By.xpath("//A[@id='ctl00_cPH_rptrDisplayRecords_ctl00_lnkEdit']");

	private By VATTypeCategoryElem = By.xpath("//SELECT[@name='ctl00$cPHFilter$ddlVATTypeCategory']");

	private By SaveContinueElem = By.xpath("//A[@id='ctl00_cpHeaderRight_btnSaveContinue']");

	private By MarkasFiledElem = By.xpath("//A[@id='ctl00_cPH_btnManualSubmit']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/AdminUI/Agents.aspx?p=true");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AdminUI/Agents.aspx?p=true");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AdminUI/Agents.aspx?p=true");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AdminUI/Agents.aspx?p=true";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AdminUI/Agents.aspx?p=true")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click VATReturnsTAB
     * @name Click VATReturnsTAB
     */
	public void Click_VATReturnsTAB()
	{
        
		WebElement elem = getWebElement(VATReturnsTABElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_VATReturnsTAB", "Click_VATReturnsTAB failed. Unable to locate object: " + VATReturnsTABElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_VATReturnsTAB", "Click_VATReturnsTAB failed. Unable to locate object: " + VATReturnsTABElem.toString());

			Assert.fail("Unable to locate object: " + VATReturnsTABElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_VATReturnsTAB");

		TestModellerLogger.PassStep(m_Driver, "Click_VATReturnsTAB");
	}

     
	/**
 	 * Click ClickOnEditLink
     * @name Click ClickOnEditLink
     */
	public void Click_ClickOnEditLink()
	{
        
		WebElement elem = getWebElement(ClickOnEditLinkElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClickOnEditLink", "Click_ClickOnEditLink failed. Unable to locate object: " + ClickOnEditLinkElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClickOnEditLink", "Click_ClickOnEditLink failed. Unable to locate object: " + ClickOnEditLinkElem.toString());

			Assert.fail("Unable to locate object: " + ClickOnEditLinkElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_ClickOnEditLink");

		TestModellerLogger.PassStep(m_Driver, "Click_ClickOnEditLink");
	}

    
	/**
 	 * Select VATTypeCategory
	 * @throws InterruptedException 
     * @name Select VATTypeCategory
     */
    public void Select_VATTypeCategory(String VATTypeCategory) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(VATTypeCategoryElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_VATTypeCategory", "Select_VATTypeCategory failed. Unable to locate object: " + VATTypeCategoryElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_VATTypeCategory", "Select_VATTypeCategory failed. Unable to locate object: " + VATTypeCategoryElem.toString());

 			Assert.fail("Unable to locate object: " + VATTypeCategoryElem.toString());
         }

 		Select dropdown = new Select(elem);
 		elem.click();
		Thread.sleep(1000);
	elem.sendKeys(Keys.ARROW_DOWN);
		elem.sendKeys(Keys.ENTER);

 		//dropdown.selectByVisibleText(VATTypeCategory);
 	
 		WebElement elem1= m_Driver.findElement(By.xpath("//*[@id='ctl00_cPHFilter_ddlRecords']"));
 		Thread.sleep(2000);
 		elem1.click();
 		Thread.sleep(1000);
 		elem1.sendKeys(Keys.ARROW_DOWN);
 		elem1.sendKeys(Keys.ENTER);
// 		Select dropdown1 = new Select(elem1);
// 		dropdown1.deselectByVisibleText("Current Period");
// 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_VATTypeCategory " + VATTypeCategory);

 		TestModellerLogger.PassStep(m_Driver, "Select_VATTypeCategory " + VATTypeCategory);
 	}

     
	/**
 	 * Click Save&Continue
     * @name Click Save&Continue
     */
	public void Click_SaveContinue()
	{
        
		WebElement elem = getWebElement(SaveContinueElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SaveContinue", "Click_SaveContinue failed. Unable to locate object: " + SaveContinueElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SaveContinue", "Click_SaveContinue failed. Unable to locate object: " + SaveContinueElem.toString());

			Assert.fail("Unable to locate object: " + SaveContinueElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_SaveContinue");

		TestModellerLogger.PassStep(m_Driver, "Click_SaveContinue");
	}

     
	/**
 	 * Click MarkasFiled
     * @name Click MarkasFiled
     */
	public void Click_MarkasFiled()
	{
        
		WebElement elem = getWebElement(MarkasFiledElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_MarkasFiled", "Click_MarkasFiled failed. Unable to locate object: " + MarkasFiledElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_MarkasFiled", "Click_MarkasFiled failed. Unable to locate object: " + MarkasFiledElem.toString());

			Assert.fail("Unable to locate object: " + MarkasFiledElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_MarkasFiled");

		TestModellerLogger.PassStep(m_Driver, "Click_MarkasFiled");
	}
}