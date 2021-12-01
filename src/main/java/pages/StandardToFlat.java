package pages;

import pages.BasePage;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.Screenshotcapture;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/0ed3ccde-0995-41ab-95a5-aa51c8cdcd08
@TestModellerModule(guid = "0ed3ccde-0995-41ab-95a5-aa51c8cdcd08")
public class StandardToFlat extends BasePage
{
	public StandardToFlat (WebDriver driver)
	{
		super(driver);
		
	}


	
	
	private By SettingsTabElem = By.xpath("/html/body/form/main/div[11]/div[2]/ul/li[12]/a/span");

	private By VATTABElem = By.xpath("//SPAN[@id='__tab_ctl00_cPH_tbContainer_TbVat']");

	
	private By EditButtonElem = By.xpath("//A[@id='ctl00_cpHeaderRight_btnEdit']");

	private By AddTabElem = By.xpath("//A[@id='ctl00_cPH_tbContainer_TbVat_vatadd']");

	private By VATStatusElem = By.xpath("//SELECT[@name='ctl00$cPH$ddVATStatus']");

	private By SchemeEffectiveDateElem = By.xpath("//INPUT[@name='ctl00$cPH$txtDate']");

	private By DefaultFlatRateElem = By.xpath("//INPUT[@id='ctl00_cPH_chkUseDefaultRate']");

	private By OverrideFlatRateElem = By.xpath("//INPUT[@name='ctl00$cPH$txtRate']");

	private By SaveButtonElem = By.xpath("//A[@id='ctl00_cphFooter_btnSave']");

	//ctl00_cpHFooter_btnSave
	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/AccountUI/CompanyInfo.aspx?FYCode=52445&CompanyCode=13250");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AccountUI/CompanyInfo.aspx?FYCode=52445&CompanyCode=13250");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AccountUI/CompanyInfo.aspx?FYCode=52445&CompanyCode=13250");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AccountUI/CompanyInfo.aspx?FYCode=52445&CompanyCode=13250";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AccountUI/CompanyInfo.aspx?FYCode=52445&CompanyCode=13250")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click SettingsTab
     * @name Click SettingsTab
     */
	public void Click_SettingsTab()
	{
        
		WebElement elem = getWebElement(SettingsTabElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SettingsTab", "Click_SettingsTab failed. Unable to locate object: " + SettingsTabElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SettingsTab", "Click_SettingsTab failed. Unable to locate object: " + SettingsTabElem.toString());

			Assert.fail("Unable to locate object: " + SettingsTabElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_SettingsTab");

		TestModellerLogger.PassStep(m_Driver, "Click_SettingsTab");
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
 	 * Click EditButton
     * @name Click EditButton
     */
	public void Click_EditButton()
	{
        
		WebElement elem = getWebElement(EditButtonElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_EditButton", "Click_EditButton failed. Unable to locate object: " + EditButtonElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_EditButton", "Click_EditButton failed. Unable to locate object: " + EditButtonElem.toString());

			Assert.fail("Unable to locate object: " + EditButtonElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_EditButton");

		TestModellerLogger.PassStep(m_Driver, "Click_EditButton");
	}

     
	/**
 	 * Click AddTab
     * @name Click AddTab
     */
	public void Click_AddTab()
	{
        
		WebElement elem = getWebElement(AddTabElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_AddTab", "Click_AddTab failed. Unable to locate object: " + AddTabElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_AddTab", "Click_AddTab failed. Unable to locate object: " + AddTabElem.toString());

			Assert.fail("Unable to locate object: " + AddTabElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_AddTab");

		TestModellerLogger.PassStep(m_Driver, "Click_AddTab");
	}

    
	/**
 	 * Select VATStatus
     * @name Select VATStatus
     */
    public void Select_VATStatus(String VATStatus)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[6]/div/div/div/div[2]/div[2]/div/div/div/div[2]/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(VATStatusElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_VATStatus", "Select_VATStatus failed. Unable to locate object: " + VATStatusElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_VATStatus", "Select_VATStatus failed. Unable to locate object: " + VATStatusElem.toString());

 			Assert.fail("Unable to locate object: " + VATStatusElem.toString());
         }

 		Select dropdown = new Select(elem);
 		
 		dropdown.selectByVisibleText(VATStatus);
 		
// 		elem.sendKeys(Keys.TAB);
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_VATStatus " + VATStatus);

 		TestModellerLogger.PassStep(m_Driver, "Select_VATStatus " + VATStatus);
 	}

      
	/**
 	 * Enter SchemeEffectiveDate
     * @name Enter SchemeEffectiveDate
     */
 	public void Enter_SchemeEffectiveDate(String SchemeEffectiveDate)
 	{
 	    
		//m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[6]/div/div/div/div[2]/div[2]/div/div/div/div[2]/div[2]/div/div/div[2]/iframe")));
		//m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[6]/div/div/div/div[2]/div[2]/div/div/div/div[4]/div/div/div[2]/iframe")));
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[6]/div/div/div/div[2]/div[2]/div/div/div/div[2]/div[2]/div/div/div[2]/iframe")));


		WebElement elem = getWebElement(SchemeEffectiveDateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_SchemeEffectiveDate", "Enter_SchemeEffectiveDate failed. Unable to locate object: " + SchemeEffectiveDateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_SchemeEffectiveDate", "Enter_SchemeEffectiveDate failed. Unable to locate object: " + SchemeEffectiveDateElem.toString());

 			Assert.fail("Unable to locate object: " + SchemeEffectiveDateElem.toString());
         }
 		
 	//	for(int i=0;i<=9;i++)
 //		{
	//		m_Driver.findElement(By.xpath("//INPUT[@name='ctl00$cPH$txtDate']")).sendKeys(Keys.BACK_SPACE);
 	//	}
		
 		elem.sendKeys(SchemeEffectiveDate);
		m_Driver.findElement(By.xpath("//INPUT[@name='ctl00$cPH$txtDate']")).sendKeys(Keys.TAB);
		
 		//elem.sendKeys(SchemeEffectiveDate);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_SchemeEffectiveDate " + SchemeEffectiveDate);

  		TestModellerLogger.PassStep(m_Driver, "Enter_SchemeEffectiveDate " + SchemeEffectiveDate);
 	}

     
	/**
 	 * Click DefaultFlatRate
     * @name Click DefaultFlatRate
     */
	public void Click_DefaultFlatRate()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[6]/div/div/div/div[2]/div[2]/div/div/div/div[2]/div[2]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(DefaultFlatRateElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_DefaultFlatRate", "Click_DefaultFlatRate failed. Unable to locate object: " + DefaultFlatRateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_DefaultFlatRate", "Click_DefaultFlatRate failed. Unable to locate object: " + DefaultFlatRateElem.toString());

			Assert.fail("Unable to locate object: " + DefaultFlatRateElem.toString());
        }
//jsExec.executeScript("arguments", null)
		//elem.click();
		//m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_chkUseDefaultRate']")).click();
        
		//*[@id="ctl00_cPH_chkUseDefaultRate"]
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_DefaultFlatRate");

		TestModellerLogger.PassStep(m_Driver, "Click_DefaultFlatRate");
	}

      
	/**
 	 * Enter OverrideFlatRate
     * @name Enter OverrideFlatRate
     */
 	public void Enter_OverrideFlatRate(String OverrideFlatRate)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[6]/div/div/div/div[2]/div[2]/div/div/div/div[2]/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(OverrideFlatRateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_OverrideFlatRate", "Enter_OverrideFlatRate failed. Unable to locate object: " + OverrideFlatRateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_OverrideFlatRate", "Enter_OverrideFlatRate failed. Unable to locate object: " + OverrideFlatRateElem.toString());

 			Assert.fail("Unable to locate object: " + OverrideFlatRateElem.toString());
         }
 		//elem.clear();
 		elem.sendKeys(Keys.DELETE);
 		elem.sendKeys(OverrideFlatRate);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_OverrideFlatRate " + OverrideFlatRate);

  		TestModellerLogger.PassStep(m_Driver, "Enter_OverrideFlatRate " + OverrideFlatRate);
 	}

     
	/**
 	 * Click SaveButton
	 * @throws AWTException 
	 * @throws IOException 
	 * @throws HeadlessException 
	 * @throws InterruptedException 
     * @name Click SaveButton
     */
	public void Click_SaveButton() throws HeadlessException, IOException, AWTException, InterruptedException
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[6]/div/div/div/div[2]/div[2]/div/div/div/div[2]/div[2]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(SaveButtonElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SaveButton", "Click_SaveButton failed. Unable to locate object: " + SaveButtonElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SaveButton", "Click_SaveButton failed. Unable to locate object: " + SaveButtonElem.toString());

			Assert.fail("Unable to locate object: " + SaveButtonElem.toString());
        }

//	elem.click();
	//	m_Driver.navigate().refresh();
		Thread.sleep(2000);
		jsExec.executeScript("arguments[0].scrollIntoView(true);",  elem);
		
		jsExec.executeScript("arguments[0].click();", elem);
				//m_Driver.findElement(By.xpath("//A[@id='ctl00_cphFooter_btnSave']")));
		
		Screenshotcapture.captureAsImage(m_Driver, "VATTypeAfter");
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_SaveButton");

		TestModellerLogger.PassStep(m_Driver, "Click_SaveButton");
	}


	
}