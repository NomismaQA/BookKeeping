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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/dbfbea7c-c1ea-406c-82b2-563d18a622ad
@TestModellerModule(guid = "dbfbea7c-c1ea-406c-82b2-563d18a622ad")
public class Settingsciscustomer extends BasePage
{
	public Settingsciscustomer (WebDriver driver)
	{
		super(driver);
	}


	
	private By Click_Settings__1Elem = By.xpath("//*[@id='ctl00_SideMenu1_AccountMenu']/li[12]/a/span");

	private By Click_Edit_btn_2Elem = By.xpath("//A[@id='ctl00_cpHeaderRight_btnEdit']");

	private By Click_SalesInvoice_tab_3Elem = By.xpath("//SPAN[@id='__tab_ctl00_cPH_tbContainer_TbSalesInvoice']");

	private By Cis_invoice_dropdown_4Elem = By.xpath("//SELECT[@name='ctl00$cPH$tbContainer$TbSalesInvoice$ddCISRate']");

	private By Enable_SalesInvoice_5Elem = By.xpath("//label[normalize-space()= 'Enable Invoice Discount']/../input");

	private By Enable_SalesInvoice_Retention_6Elem = By.xpath("//label[normalize-space()= 'Enable Invoice Retention']/../input");

	private By Enable_SalesInvoice_MultiCurrency_7Elem = By.xpath("//label[normalize-space()= 'Enable Multi Currency']/../input");

	private By Enable_SalesInvoice_rDeduction_8Elem = By.xpath("//label[normalize-space()= 'Enable Other Deduction']/../input");

	private By Enable_SalesInvoice_SubcontractorCIS_9Elem = By.xpath("//label[normalize-space()= 'Activate']/../input");

	private By Click__Save__btn_10Elem = By.xpath("//A[@id='ctl00_cPH_tbContainer_TbSalesInvoice_btnSSave']");

	private By Confirmation_Message_11Elem = By.xpath("//DIV[@class='alert alert-success el-selection']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AccountUI/Companyinfo.aspx?FYCode=117199&CompanyCode=16862&mopt=12&menuid=0&p=true");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/Companyinfo.aspx?FYCode=117199&CompanyCode=16862&mopt=12&menuid=0&p=true");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/Companyinfo.aspx?FYCode=117199&CompanyCode=16862&mopt=12&menuid=0&p=true");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/AccountUI/Companyinfo.aspx?FYCode=117199&CompanyCode=16862&mopt=12&menuid=0&p=true";

        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/AccountUI/Companyinfo.aspx?FYCode=117199&CompanyCode=16862&mopt=12&menuid=0&p=true")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click Click_Settings _1
     * @name Click Click_Settings _1
     */
	public void Click_Click_Settings__1()
	{
        
		WebElement elem = getWebElement(Click_Settings__1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Click_Settings__1", "Click_Click_Settings__1 failed. Unable to locate object: " + Click_Settings__1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Click_Settings__1", "Click_Click_Settings__1 failed. Unable to locate object: " + Click_Settings__1Elem.toString());

			Assert.fail("Unable to locate object: " + Click_Settings__1Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Click_Settings__1");

		TestModellerLogger.PassStep(m_Driver, "Click_Click_Settings__1");
	}

     
	/**
 	 * Click Click_Edit_btn_2
     * @name Click Click_Edit_btn_2
     */
	public void Click_Click_Edit_btn_2()
	{
        
		WebElement elem = getWebElement(Click_Edit_btn_2Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Click_Edit_btn_2", "Click_Click_Edit_btn_2 failed. Unable to locate object: " + Click_Edit_btn_2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Click_Edit_btn_2", "Click_Click_Edit_btn_2 failed. Unable to locate object: " + Click_Edit_btn_2Elem.toString());

			Assert.fail("Unable to locate object: " + Click_Edit_btn_2Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Click_Edit_btn_2");

		TestModellerLogger.PassStep(m_Driver, "Click_Click_Edit_btn_2");
	}

     
	/**
 	 * Click Click_Sales/Invoice_tab_3
     * @name Click Click_Sales/Invoice_tab_3
     */
	public void Click_Click_SalesInvoice_tab_3()
	{
        
		WebElement elem = getWebElement(Click_SalesInvoice_tab_3Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Click_SalesInvoice_tab_3", "Click_Click_SalesInvoice_tab_3 failed. Unable to locate object: " + Click_SalesInvoice_tab_3Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Click_SalesInvoice_tab_3", "Click_Click_SalesInvoice_tab_3 failed. Unable to locate object: " + Click_SalesInvoice_tab_3Elem.toString());

			Assert.fail("Unable to locate object: " + Click_SalesInvoice_tab_3Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Click_SalesInvoice_tab_3");

		TestModellerLogger.PassStep(m_Driver, "Click_Click_SalesInvoice_tab_3");
	}

    
	/**
 	 * Select Cis_invoice_dropdown_4
     * @name Select Cis_invoice_dropdown_4
     */
    public void Select_Cis_invoice_dropdown_4(String Cis_invoice_dropdown_4)
 	{
 	    
 		WebElement elem = getWebElement(Cis_invoice_dropdown_4Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Cis_invoice_dropdown_4", "Select_Cis_invoice_dropdown_4 failed. Unable to locate object: " + Cis_invoice_dropdown_4Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Cis_invoice_dropdown_4", "Select_Cis_invoice_dropdown_4 failed. Unable to locate object: " + Cis_invoice_dropdown_4Elem.toString());

 			Assert.fail("Unable to locate object: " + Cis_invoice_dropdown_4Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Cis_invoice_dropdown_4);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Cis_invoice_dropdown_4 " + Cis_invoice_dropdown_4);

 		TestModellerLogger.PassStep(m_Driver, "Select_Cis_invoice_dropdown_4 " + Cis_invoice_dropdown_4);
 	}

     
	/**
 	 * Click Enable_SalesInvoice_5
     * @name Click Enable_SalesInvoice_5
     */
	public void Click_Enable_SalesInvoice_5()
	{
        
		WebElement elem = getWebElement(Enable_SalesInvoice_5Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Enable_SalesInvoice_5", "Click_Enable_SalesInvoice_5 failed. Unable to locate object: " + Enable_SalesInvoice_5Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Enable_SalesInvoice_5", "Click_Enable_SalesInvoice_5 failed. Unable to locate object: " + Enable_SalesInvoice_5Elem.toString());

			Assert.fail("Unable to locate object: " + Enable_SalesInvoice_5Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Enable_SalesInvoice_5");

		TestModellerLogger.PassStep(m_Driver, "Click_Enable_SalesInvoice_5");
	}

     
	/**
 	 * Click Enable_SalesInvoice_Retention_6
     * @name Click Enable_SalesInvoice_Retention_6
     */
	public void Click_Enable_SalesInvoice_Retention_6()
	{
        
		WebElement elem = getWebElement(Enable_SalesInvoice_Retention_6Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Enable_SalesInvoice_Retention_6", "Click_Enable_SalesInvoice_Retention_6 failed. Unable to locate object: " + Enable_SalesInvoice_Retention_6Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Enable_SalesInvoice_Retention_6", "Click_Enable_SalesInvoice_Retention_6 failed. Unable to locate object: " + Enable_SalesInvoice_Retention_6Elem.toString());

			Assert.fail("Unable to locate object: " + Enable_SalesInvoice_Retention_6Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Enable_SalesInvoice_Retention_6");

		TestModellerLogger.PassStep(m_Driver, "Click_Enable_SalesInvoice_Retention_6");
	}

     
	/**
 	 * Click Enable_SalesInvoice_MultiCurrency_7
     * @name Click Enable_SalesInvoice_MultiCurrency_7
     */
	public void Click_Enable_SalesInvoice_MultiCurrency_7()
	{
        
		WebElement elem = getWebElement(Enable_SalesInvoice_MultiCurrency_7Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Enable_SalesInvoice_MultiCurrency_7", "Click_Enable_SalesInvoice_MultiCurrency_7 failed. Unable to locate object: " + Enable_SalesInvoice_MultiCurrency_7Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Enable_SalesInvoice_MultiCurrency_7", "Click_Enable_SalesInvoice_MultiCurrency_7 failed. Unable to locate object: " + Enable_SalesInvoice_MultiCurrency_7Elem.toString());

			Assert.fail("Unable to locate object: " + Enable_SalesInvoice_MultiCurrency_7Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Enable_SalesInvoice_MultiCurrency_7");

		TestModellerLogger.PassStep(m_Driver, "Click_Enable_SalesInvoice_MultiCurrency_7");
	}

     
	/**
 	 * Click Enable_SalesInvoice_rDeduction_8
     * @name Click Enable_SalesInvoice_rDeduction_8
     */
	public void Click_Enable_SalesInvoice_rDeduction_8()
	{
        
		WebElement elem = getWebElement(Enable_SalesInvoice_rDeduction_8Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Enable_SalesInvoice_rDeduction_8", "Click_Enable_SalesInvoice_rDeduction_8 failed. Unable to locate object: " + Enable_SalesInvoice_rDeduction_8Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Enable_SalesInvoice_rDeduction_8", "Click_Enable_SalesInvoice_rDeduction_8 failed. Unable to locate object: " + Enable_SalesInvoice_rDeduction_8Elem.toString());

			Assert.fail("Unable to locate object: " + Enable_SalesInvoice_rDeduction_8Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Enable_SalesInvoice_rDeduction_8");

		TestModellerLogger.PassStep(m_Driver, "Click_Enable_SalesInvoice_rDeduction_8");
	}

     
	/**
 	 * Click Enable_SalesInvoice_SubcontractorCIS_9
     * @name Click Enable_SalesInvoice_SubcontractorCIS_9
     */
	public void Click_Enable_SalesInvoice_SubcontractorCIS_9()
	{
        
		WebElement elem = getWebElement(Enable_SalesInvoice_SubcontractorCIS_9Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Enable_SalesInvoice_SubcontractorCIS_9", "Click_Enable_SalesInvoice_SubcontractorCIS_9 failed. Unable to locate object: " + Enable_SalesInvoice_SubcontractorCIS_9Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Enable_SalesInvoice_SubcontractorCIS_9", "Click_Enable_SalesInvoice_SubcontractorCIS_9 failed. Unable to locate object: " + Enable_SalesInvoice_SubcontractorCIS_9Elem.toString());

			Assert.fail("Unable to locate object: " + Enable_SalesInvoice_SubcontractorCIS_9Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Enable_SalesInvoice_SubcontractorCIS_9");

		TestModellerLogger.PassStep(m_Driver, "Click_Enable_SalesInvoice_SubcontractorCIS_9");
	}

     
	/**
 	 * Click Click_ Save _btn_10
     * @name Click Click_ Save _btn_10
     */
	public void Click_Click__Save__btn_10()
	{
        
		WebElement elem = getWebElement(Click__Save__btn_10Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Click__Save__btn_10", "Click_Click__Save__btn_10 failed. Unable to locate object: " + Click__Save__btn_10Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Click__Save__btn_10", "Click_Click__Save__btn_10 failed. Unable to locate object: " + Click__Save__btn_10Elem.toString());

			Assert.fail("Unable to locate object: " + Click__Save__btn_10Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Click__Save__btn_10");

		TestModellerLogger.PassStep(m_Driver, "Click_Click__Save__btn_10");
	}

     
	/**
 	 * Click Confirmation_Message_11
     * @name Click Confirmation_Message_11
     */
	public void Click_Confirmation_Message_11()
	{
        
		WebElement elem = getWebElement(Confirmation_Message_11Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Confirmation_Message_11", "Click_Confirmation_Message_11 failed. Unable to locate object: " + Confirmation_Message_11Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Confirmation_Message_11", "Click_Confirmation_Message_11 failed. Unable to locate object: " + Confirmation_Message_11Elem.toString());

			Assert.fail("Unable to locate object: " + Confirmation_Message_11Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Confirmation_Message_11");

		TestModellerLogger.PassStep(m_Driver, "Click_Confirmation_Message_11");
	}
}