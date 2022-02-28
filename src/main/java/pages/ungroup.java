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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/fbd40af2-127d-4d31-9a12-4462d4a6d4e3
@TestModellerModule(guid = "fbd40af2-127d-4d31-9a12-4462d4a6d4e3")
public class ungroup extends BasePage
{
	public ungroup (WebDriver driver)
	{
		super(driver);
	}


	/////html/body/form/main/div[11]/div[3]/div/div[3]/div/div/div/table/tbody/tr[2]/td/div[1]/input
	//private By selectallcheckbboxElem = By.xpath("//INPUT[@id='ctl00_cPH_chkReconcileUngroupSelected']");
	private By selectallcheckbboxElem =By.xpath("//INPUT[@id='ctl00_cPH_chkReconcileUngroupSelected']");

	private By downcheckboxElem = By.xpath("/html/body/form/main/div[11]/div[3]/div/div[3]/div/div/div/table/tbody/tr[2]/td/div[2]/table/tbody/tr[1]/td/div/table/tfoot/tr/td[1]/table/tbody/tr/td[1]");

	private By Ungroup_linkselectedElem = By.xpath("//A[@id='ctl00_cPH_lnkUngroupSelected']");

	private By Checkbox2Elem = By.xpath("//INPUT[@id='ctl00_cPH_rptrReconcile_ctl00_chkReconcileUngroup']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AccountUI/Reconcile.aspx?FYCode=116999&CompanyCode=16676");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/Reconcile.aspx?FYCode=116999&CompanyCode=16676");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/Reconcile.aspx?FYCode=116999&CompanyCode=16676");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
////   public void AssertUrl()
//    {
//        String currentUrl = m_Driver.getCurrentUrl();
//        String expectedUrl = "https://nomisma.cloud.testinsights.io/app/#!/test-modeller/100330";
//
//        if (!currentUrl.equals("https://nomisma.cloud.testinsights.io/app/#!/test-modeller/100330")) {
//            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
//        }
//    }

     
	/**
 	 * Click selectallcheckbbox
     * @name Click selectallcheckbbox
     */
	public void Click_selectallcheckbbox()
	{
        
		WebElement elem = getWebElement(selectallcheckbboxElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_selectallcheckbbox", "Click_selectallcheckbbox failed. Unable to locate object: " + selectallcheckbboxElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_selectallcheckbbox", "Click_selectallcheckbbox failed. Unable to locate object: " + selectallcheckbboxElem.toString());

			Assert.fail("Unable to locate object: " + selectallcheckbboxElem.toString());
        }

		jsExec.executeScript("arguments[0].click();",elem);
          	

		ExtentReportManager.passStep(m_Driver, "Click_selectallcheckbbox");

		TestModellerLogger.PassStep(m_Driver, "Click_selectallcheckbbox");
	}

     
	/**
 	 * Click downcheckbox
     * @name Click downcheckbox
     */
	public void Click_downcheckbox()
	{
        
		WebElement elem = getWebElement(downcheckboxElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_downcheckbox", "Click_downcheckbox failed. Unable to locate object: " + downcheckboxElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_downcheckbox", "Click_downcheckbox failed. Unable to locate object: " + downcheckboxElem.toString());

			Assert.fail("Unable to locate object: " + downcheckboxElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_downcheckbox");

		TestModellerLogger.PassStep(m_Driver, "Click_downcheckbox");
	}
//
     
	/**
 	 * Click Ungroup linkselected
     * @name Click Ungroup linkselected
     */
	public void Click_Ungroup_linkselected()
	{
        
		WebElement elem = getWebElement(Ungroup_linkselectedElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Ungroup_linkselected", "Click_Ungroup_linkselected failed. Unable to locate object: " + Ungroup_linkselectedElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Ungroup_linkselected", "Click_Ungroup_linkselected failed. Unable to locate object: " + Ungroup_linkselectedElem.toString());

			Assert.fail("Unable to locate object: " + Ungroup_linkselectedElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Ungroup_linkselected");

		TestModellerLogger.PassStep(m_Driver, "Click_Ungroup_linkselected");
	}

     
	/**
 	 * Click Checkbox2
     * @name Click Checkbox2
     */
	public void Click_Checkbox2()
	{
        
		WebElement elem = getWebElement(Checkbox2Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Checkbox2", "Click_Checkbox2 failed. Unable to locate object: " + Checkbox2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Checkbox2", "Click_Checkbox2 failed. Unable to locate object: " + Checkbox2Elem.toString());

			Assert.fail("Unable to locate object: " + Checkbox2Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Checkbox2");

		TestModellerLogger.PassStep(m_Driver, "Click_Checkbox2");
	}
}