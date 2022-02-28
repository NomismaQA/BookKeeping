package pages;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import Generic.SeleniumLib;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

 //http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/96522e07-f899-4ab9-ab12-584549ae1f2d
 @TestModellerModule(guid = "96522e07-f899-4ab9-ab12-584549ae1f2d")
 public class Del_Bill extends BasePage
{
	 SeleniumLib sl;
	public Del_Bill (WebDriver driver)
	{		super(driver);
	sl=new SeleniumLib(m_Driver);
	}


	
	private By Expenditure_tabElem = By.xpath("//LI[@id='ctl00_SideMenu1_ExpensesMenu']/A/SPAN[@class='side_nav_text']");

	private By SelectFinancialYearElem = By.xpath("//*[@id=\"ctl00_ddlFinancialYear\"]");

	private By ChkboxbillElem = By.xpath("//td[@id='ctl00_cPH_rptrDisplayRecords_ctl00_tdChk']/span/input");

	private By DelimgBillElem = By.xpath("//A[@id='ctl00_cPH_rptrDisplayRecords_ctl00_lnkDelete']/I[@class='fa fa-trash']");

	private By Delete_tabElem = By.xpath("//*[@id=\"ctl00_cPH_btnDelete\"]");

	private By Success_msgElem = By.xpath("//DIV[@class='alert alert-success']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandboxpre.nomismasolution.co.uk/AccountUI/SupplierBill.aspx?FYCode=8512&CompanyCode=6600&vATReturnCodeM=0&VATReturnActionM=&fychanged=t");

	ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandboxpre.nomismasolution.co.uk/AccountUI/SupplierBill.aspx?FYCode=8512&CompanyCode=6600&vATReturnCodeM=0&VATReturnActionM=&fychanged=t");
		
	TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandboxpre.nomismasolution.co.uk/AccountUI/SupplierBill.aspx?FYCode=8512&CompanyCode=6600&vATReturnCodeM=0&VATReturnActionM=&fychanged=t");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandboxpre.nomismasolution.co.uk/AccountUI/SupplierBill.aspx?FYCode=8512&CompanyCode=6600&vATReturnCodeM=0&VATReturnActionM=&fychanged=t";

        if (!currentUrl.equals("http://sandboxpre.nomismasolution.co.uk/AccountUI/SupplierBill.aspx?FYCode=8512&CompanyCode=6600&vATReturnCodeM=0&VATReturnActionM=&fychanged=t")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click Expenditure tab
     * @name Click Expenditure tab
     */
	public void Click_Expenditure_tab()
	{
        
		WebElement elem = getWebElement(Expenditure_tabElem);

	if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Expenditure_tab", "Click_Expenditure_tab failed. Unable to locate object: " + Expenditure_tabElem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Expenditure_tab", "Click_Expenditure_tab failed. Unable to locate object: " + Expenditure_tabElem.toString());

			Assert.fail("Unable to locate object: " + Expenditure_tabElem.toString());
        }

		elem.click();
          	

	ExtentReportManager.passStep(m_Driver, "Click_Expenditure_tab");

	TestModellerLogger.PassStep(m_Driver, "Click_Expenditure_tab");
	}

    
	/**
 	 * Select SelectFinancialYear
     * @name Select SelectFinancialYear
     */
    public void Select_SelectFinancialYear(String SelectFinancialYear)
 	{
 	    
 		WebElement elem = getWebElement(SelectFinancialYearElem);

 		if (elem == null) {
    	ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_SelectFinancialYear", "Select_SelectFinancialYear failed. Unable to locate object: " + SelectFinancialYearElem.toString());

    	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_SelectFinancialYear", "Select_SelectFinancialYear failed. Unable to locate object: " + SelectFinancialYearElem.toString());

 			Assert.fail("Unable to locate object: " + SelectFinancialYearElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(SelectFinancialYear);
 		
 		
	ExtentReportManager.passStep(m_Driver, "Select_SelectFinancialYear " + SelectFinancialYear);

	TestModellerLogger.PassStep(m_Driver, "Select_SelectFinancialYear " + SelectFinancialYear);
 	}

     
	/**
 	 * Click Chkboxbill
     * @name Click Chkboxbill
     */
	public void Click_Chkboxbill()
	{
        
		WebElement elem = getWebElement(ChkboxbillElem);

	if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Chkboxbill", "Click_Chkboxbill failed. Unable to locate object: " + ChkboxbillElem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Chkboxbill", "Click_Chkboxbill failed. Unable to locate object: " + ChkboxbillElem.toString());

			Assert.fail("Unable to locate object: " + ChkboxbillElem.toString());
        }

		elem.click();
          	

	ExtentReportManager.passStep(m_Driver, "Click_Chkboxbill");

	TestModellerLogger.PassStep(m_Driver, "Click_Chkboxbill");
	}

     
	/**
 	 * Click DelimgBill
     * @name Click DelimgBill
     */
	public void Click_DelimgBill()
	{
        
		WebElement elem = getWebElement(DelimgBillElem);

	if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_DelimgBill", "Click_DelimgBill failed. Unable to locate object: " + DelimgBillElem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_DelimgBill", "Click_DelimgBill failed. Unable to locate object: " + DelimgBillElem.toString());

			Assert.fail("Unable to locate object: " + DelimgBillElem.toString());
        }

		elem.click();
          	

	ExtentReportManager.passStep(m_Driver, "Click_DelimgBill");

	TestModellerLogger.PassStep(m_Driver, "Click_DelimgBill");
	sl.ScrollHeight(m_Driver);
	}

     
	/**
 	 * Click Delete tab
     * @name Click Delete tab
     */
	public void Click_Delete_tab()
	{
        
		WebElement elem = getWebElement(Delete_tabElem);

	if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Delete_tab", "Click_Delete_tab failed. Unable to locate object: " + Delete_tabElem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Delete_tab", "Click_Delete_tab failed. Unable to locate object: " + Delete_tabElem.toString());

			Assert.fail("Unable to locate object: " + Delete_tabElem.toString());
        }

		elem.click();
          	

	ExtentReportManager.passStep(m_Driver, "Click_Delete_tab");

	TestModellerLogger.PassStep(m_Driver, "Click_Delete_tab");
	}

     
	/**
 	 * Click Success! msg
     * @name Click Success! msg
     */
	public void Click_Success_msg()
	{
        
		WebElement elem = getWebElement(Success_msgElem);

	if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Success_msg", "Click_Success_msg failed. Unable to locate object: " + Success_msgElem.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Success_msg", "Click_Success_msg failed. Unable to locate object: " + Success_msgElem.toString());

			Assert.fail("Unable to locate object: " + Success_msgElem.toString());
        }

		elem.click();
          	

	ExtentReportManager.passStep(m_Driver, "Click_Success_msg");

	TestModellerLogger.PassStep(m_Driver, "Click_Success_msg");
	}
}