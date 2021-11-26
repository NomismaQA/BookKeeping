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

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/6bab3ade-7290-4563-9438-64c373ec0568
@TestModellerModule(guid = "6bab3ade-7290-4563-9438-64c373ec0568")
public class FRSTOStandard extends BasePage
{
	public FRSTOStandard (WebDriver driver)
	{
		super(driver);
	}


	
	private By SettingsTABElem = By.xpath("/html/body/form/main/div[11]/div[2]/ul/li[12]/a");

	private By VATTABElem = By.xpath("//SPAN[@id='__tab_ctl00_cPH_tbContainer_TbVat']");

	private By EditButtonElem = By.xpath("//A[@id='ctl00_cpHeaderRight_btnEdit']");

	private By AddButtonElem = By.xpath("//A[@id='ctl00_cPH_tbContainer_TbVat_vatadd']");

	//private By VATStatusElem = By.xpath("//SELECT[@name='ctl00$cPH$ddVATStatus']");
	private By VATStatusElem = By.xpath("//*[@id='ctl00_cPH_ddVATStatus']");

	private By DateElem = By.xpath("//INPUT[@name='ctl00$cPH$txtDate']");

	private By SaveButtonElem = By.xpath("//A[@id='ctl00_cphFooter_btnSave']");


	
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
 	 * Select VATStatus
	 * @throws InterruptedException 
     * @name Select VATStatus
     */
    public void Select_VATStatus(String VATStatus) throws InterruptedException
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[6]/div/div/div/div[2]/div[2]/div/div/div/div[2]/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(VATStatusElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_VATStatus", "Select_VATStatus failed. Unable to locate object: " + VATStatusElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_VATStatus", "Select_VATStatus failed. Unable to locate object: " + VATStatusElem.toString());

 			Assert.fail("Unable to locate object: " + VATStatusElem.toString());
         } 
 		
 		System.out.println("lllll"+VATStatus);
 		m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_ddVATStatus']")).click();
 		Thread.sleep(1000);
 		Select dropdown = new Select(elem);
 		Thread.sleep(1000);
 		dropdown.selectByVisibleText(VATStatus);
 		
		m_Driver.switchTo().defaultContent();
		Thread.sleep(1000);

 		
 		ExtentReportManager.passStep(m_Driver, "Select_VATStatus " + VATStatus);

 		TestModellerLogger.PassStep(m_Driver, "Select_VATStatus " + VATStatus);
 	}

      
	/**
 	 * Enter Date
     * @name Enter Date
     */
 	public void Enter_Date(String Date)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[6]/div/div/div/div[2]/div[2]/div/div/div/div[2]/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(DateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Date", "Enter_Date failed. Unable to locate object: " + DateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Date", "Enter_Date failed. Unable to locate object: " + DateElem.toString());

 			Assert.fail("Unable to locate object: " + DateElem.toString());
         }

 		elem.sendKeys(Date);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Date " + Date);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Date " + Date);
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
		jsExec.executeScript("arguments[0].click();",elem);

		//elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_SaveButton");

		TestModellerLogger.PassStep(m_Driver, "Click_SaveButton");
	}
}