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

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/14ebbe11-8969-416a-9eb1-b05bbfd51641
@TestModellerModule(guid = "14ebbe11-8969-416a-9eb1-b05bbfd51641")
public class StandardToNoVAT extends BasePage
{
	public StandardToNoVAT (WebDriver driver)
	{
		super(driver);
	}


	
	private By SettingsTABElem = By.xpath("/html/body/form/main/div[11]/div[2]/ul/li[12]/a");

	
	private By VATTABElem = By.xpath("//SPAN[@id='ctl00_cPH_tbContainer_TbVat_tab']/SPAN[@class='ajax__tab_outer']/SPAN[@class='ajax__tab_inner']");

	private By EditTabElem = By.xpath("//A[@id='ctl00_cpHeaderRight_btnEdit']");

	private By AddButtonElem = By.xpath("//A[@id='ctl00_cPH_tbContainer_TbVat_vatadd']");

	private By VATTypeElem = By.xpath("//SELECT[@name='ctl00$cPH$ddVATStatus']");

	private By SchemeEffectiveDateElem = By.xpath("//INPUT[@name='ctl00$cPH$txtDate']");

	private By SaveButtonElem = By.xpath("//A[@id='ctl00_cphFooter_btnSave']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/AccountUI/CompanyInfo.aspx?FYCode=52455&CompanyCode=13259");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AccountUI/CompanyInfo.aspx?FYCode=52455&CompanyCode=13259");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AccountUI/CompanyInfo.aspx?FYCode=52455&CompanyCode=13259");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AccountUI/CompanyInfo.aspx?FYCode=52455&CompanyCode=13259";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AccountUI/CompanyInfo.aspx?FYCode=52455&CompanyCode=13259")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click SettingsTAB
     * @name Click SettingsTAB
     */
	public void Click_SettingsTAB()
	{
        
		WebElement elem = getWebElement(SettingsTABElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SettingsTAB", "Click_SettingsTAB failed. Unable to locate object: " + SettingsTABElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SettingsTAB", "Click_SettingsTAB failed. Unable to locate object: " + SettingsTABElem.toString());

			Assert.fail("Unable to locate object: " + SettingsTABElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_SettingsTAB");

		TestModellerLogger.PassStep(m_Driver, "Click_SettingsTAB");
	}

     
	/**
 	 * Click VATTAB
     * @name Click VATTAB
     */
	public void Click_VATTAB()
	{
        
		WebElement elem = getWebElement(VATTABElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_VATTAB", "Click_VATTAB failed. Unable to locate object: " + VATTABElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_VATTAB", "Click_VATTAB failed. Unable to locate object: " + VATTABElem.toString());

			Assert.fail("Unable to locate object: " + VATTABElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_VATTAB");

		TestModellerLogger.PassStep(m_Driver, "Click_VATTAB");
	}

     
	/**
 	 * Click EditTab
     * @name Click EditTab
     */
	public void Click_EditTab()
	{
        
		WebElement elem = getWebElement(EditTabElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_EditTab", "Click_EditTab failed. Unable to locate object: " + EditTabElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_EditTab", "Click_EditTab failed. Unable to locate object: " + EditTabElem.toString());

			Assert.fail("Unable to locate object: " + EditTabElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_EditTab");

		TestModellerLogger.PassStep(m_Driver, "Click_EditTab");
	}

     
	/**
 	 * Click AddButton
     * @name Click AddButton
     */
	public void Click_AddButton()
	{
        
		WebElement elem = getWebElement(AddButtonElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_AddButton", "Click_AddButton failed. Unable to locate object: " + AddButtonElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_AddButton", "Click_AddButton failed. Unable to locate object: " + AddButtonElem.toString());

			Assert.fail("Unable to locate object: " + AddButtonElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_AddButton");

		TestModellerLogger.PassStep(m_Driver, "Click_AddButton");
	}

    
	/**
 	 * Select VATType
     * @name Select VATType
     */
    public void Select_VATType(String VATType)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[6]/div/div/div/div[2]/div[2]/div/div/div/div[2]/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(VATTypeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_VATType", "Select_VATType failed. Unable to locate object: " + VATTypeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_VATType", "Select_VATType failed. Unable to locate object: " + VATTypeElem.toString());

 			Assert.fail("Unable to locate object: " + VATTypeElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(VATType);
 		
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_VATType " + VATType);

 		TestModellerLogger.PassStep(m_Driver, "Select_VATType " + VATType);
 	}

      
	/**
 	 * Enter SchemeEffectiveDate
     * @name Enter SchemeEffectiveDate
     */
 	public void Enter_SchemeEffectiveDate(String SchemeEffectiveDate)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[6]/div/div/div/div[2]/div[2]/div/div/div/div[2]/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(SchemeEffectiveDateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_SchemeEffectiveDate", "Enter_SchemeEffectiveDate failed. Unable to locate object: " + SchemeEffectiveDateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_SchemeEffectiveDate", "Enter_SchemeEffectiveDate failed. Unable to locate object: " + SchemeEffectiveDateElem.toString());

 			Assert.fail("Unable to locate object: " + SchemeEffectiveDateElem.toString());
         }

 		elem.sendKeys(SchemeEffectiveDate);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_SchemeEffectiveDate " + SchemeEffectiveDate);

  		TestModellerLogger.PassStep(m_Driver, "Enter_SchemeEffectiveDate " + SchemeEffectiveDate);
 	}

     
	/**
 	 * Click SaveButton
     * @name Click SaveButton
     */
	public void Click_SaveButton()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[6]/div/div/div/div[2]/div[2]/div/div/div/div[2]/div[2]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(SaveButtonElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SaveButton", "Click_SaveButton failed. Unable to locate object: " + SaveButtonElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SaveButton", "Click_SaveButton failed. Unable to locate object: " + SaveButtonElem.toString());

			Assert.fail("Unable to locate object: " + SaveButtonElem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_SaveButton");

		TestModellerLogger.PassStep(m_Driver, "Click_SaveButton");
	}
}