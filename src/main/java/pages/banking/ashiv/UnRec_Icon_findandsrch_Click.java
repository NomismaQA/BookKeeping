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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/9fe5997b-bf5d-40ce-a838-01956298f4f0
@TestModellerModule(guid = "9fe5997b-bf5d-40ce-a838-01956298f4f0")
public class UnRec_Icon_findandsrch_Click extends BasePage
{
	public UnRec_Icon_findandsrch_Click (WebDriver driver)
	{
		super(driver);
	}


	
	private By Icon_fndSrch_ClickElem = By.xpath("//A[@id='ctl00_cPH_rptrDisplayRecords_ctl00_lnkFindMatch']");

	private By Enter_Refernce_noElem = By.xpath("//label[normalize-space()= 'Reference']/../../div[2]/input");

	private By Enter_Amt_SearchElem = By.xpath("//label[normalize-space()= 'Amount']/../../div[2]/input");

	private By Select_Dte_From1Elem = By.xpath("//label[normalize-space()= 'Date From']/../../div[2]/input");

	private By Select_Dte_ToElem = By.xpath("//label[normalize-space()= 'Date To']/../../div[2]/input");

	private By Click_Search_btn1Elem = By.xpath("//label[normalize-space()= '']/../../div[2]/a");

	private By Click_cncl_btnElem = By.xpath("//A[@id='ctl00_cphFooter_btnCancel']");

	private By Amout_VerificationElem = By.xpath("//INPUT[@name='ctl00$cphFooter$hdnDifference']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/AccountUI/UnprocessedBankTran.aspx?FYCode=52444&CompanyCode=13236&ItemsPerPageFstReq=1&vATReturnCodeM=0&VATReturnActionM=&fychanged=t");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AccountUI/UnprocessedBankTran.aspx?FYCode=52444&CompanyCode=13236&ItemsPerPageFstReq=1&vATReturnCodeM=0&VATReturnActionM=&fychanged=t");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AccountUI/UnprocessedBankTran.aspx?FYCode=52444&CompanyCode=13236&ItemsPerPageFstReq=1&vATReturnCodeM=0&VATReturnActionM=&fychanged=t");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AccountUI/UnprocessedBankTran.aspx?FYCode=52444&CompanyCode=13236&ItemsPerPageFstReq=1&vATReturnCodeM=0&VATReturnActionM=&fychanged=t";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AccountUI/UnprocessedBankTran.aspx?FYCode=52444&CompanyCode=13236&ItemsPerPageFstReq=1&vATReturnCodeM=0&VATReturnActionM=&fychanged=t")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click Icon_fndSrch_Click
     * @name Click Icon_fndSrch_Click
     */
	public void Click_Icon_fndSrch_Click()
	{
        
		WebElement elem = getWebElement(Icon_fndSrch_ClickElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Icon_fndSrch_Click", "Click_Icon_fndSrch_Click failed. Unable to locate object: " + Icon_fndSrch_ClickElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Icon_fndSrch_Click", "Click_Icon_fndSrch_Click failed. Unable to locate object: " + Icon_fndSrch_ClickElem.toString());

			Assert.fail("Unable to locate object: " + Icon_fndSrch_ClickElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Icon_fndSrch_Click");

		TestModellerLogger.PassStep(m_Driver, "Click_Icon_fndSrch_Click");
	}

      
	/**
 	 * Enter Enter_Refernce_no
     * @name Enter Enter_Refernce_no
     */
 	public void Enter_Enter_Refernce_no(String Enter_Refernce_no)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Enter_Refernce_noElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_Refernce_no", "Enter_Enter_Refernce_no failed. Unable to locate object: " + Enter_Refernce_noElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_Refernce_no", "Enter_Enter_Refernce_no failed. Unable to locate object: " + Enter_Refernce_noElem.toString());

 			Assert.fail("Unable to locate object: " + Enter_Refernce_noElem.toString());
         }

 		elem.sendKeys(Enter_Refernce_no);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_Refernce_no " + Enter_Refernce_no);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_Refernce_no " + Enter_Refernce_no);
 	}

      
	/**
 	 * Enter Enter_Amt_Search
     * @name Enter Enter_Amt_Search
     */
 	public void Enter_Enter_Amt_Search(String Enter_Amt_Search)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Enter_Amt_SearchElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_Amt_Search", "Enter_Enter_Amt_Search failed. Unable to locate object: " + Enter_Amt_SearchElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_Amt_Search", "Enter_Enter_Amt_Search failed. Unable to locate object: " + Enter_Amt_SearchElem.toString());

 			Assert.fail("Unable to locate object: " + Enter_Amt_SearchElem.toString());
         }

 		elem.sendKeys(Enter_Amt_Search);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_Amt_Search " + Enter_Amt_Search);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_Amt_Search " + Enter_Amt_Search);
 	}

      
	/**
 	 * Enter Select_Dte_From1
     * @name Enter Select_Dte_From1
     */
 	public void Enter_Select_Dte_From1(String Select_Dte_From1)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Select_Dte_From1Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Select_Dte_From1", "Enter_Select_Dte_From1 failed. Unable to locate object: " + Select_Dte_From1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Select_Dte_From1", "Enter_Select_Dte_From1 failed. Unable to locate object: " + Select_Dte_From1Elem.toString());

 			Assert.fail("Unable to locate object: " + Select_Dte_From1Elem.toString());
         }

 		elem.sendKeys(Select_Dte_From1);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Select_Dte_From1 " + Select_Dte_From1);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Select_Dte_From1 " + Select_Dte_From1);
 	}

      
	/**
 	 * Enter Select_Dte_To
     * @name Enter Select_Dte_To
     */
 	public void Enter_Select_Dte_To(String Select_Dte_To)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Select_Dte_ToElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Select_Dte_To", "Enter_Select_Dte_To failed. Unable to locate object: " + Select_Dte_ToElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Select_Dte_To", "Enter_Select_Dte_To failed. Unable to locate object: " + Select_Dte_ToElem.toString());

 			Assert.fail("Unable to locate object: " + Select_Dte_ToElem.toString());
         }

 		elem.sendKeys(Select_Dte_To);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Select_Dte_To " + Select_Dte_To);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Select_Dte_To " + Select_Dte_To);
 	}

     
	/**
 	 * Click Click_Search_btn1
     * @name Click Click_Search_btn1
     */
	public void Click_Click_Search_btn1()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div[2]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(Click_Search_btn1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Click_Search_btn1", "Click_Click_Search_btn1 failed. Unable to locate object: " + Click_Search_btn1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Click_Search_btn1", "Click_Click_Search_btn1 failed. Unable to locate object: " + Click_Search_btn1Elem.toString());

			Assert.fail("Unable to locate object: " + Click_Search_btn1Elem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_Click_Search_btn1");

		TestModellerLogger.PassStep(m_Driver, "Click_Click_Search_btn1");
	}

     
	/**
 	 * Click Click_cncl_btn
     * @name Click Click_cncl_btn
     */
	public void Click_Click_cncl_btn()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div[2]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(Click_cncl_btnElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Click_cncl_btn", "Click_Click_cncl_btn failed. Unable to locate object: " + Click_cncl_btnElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Click_cncl_btn", "Click_Click_cncl_btn failed. Unable to locate object: " + Click_cncl_btnElem.toString());

			Assert.fail("Unable to locate object: " + Click_cncl_btnElem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_Click_cncl_btn");

		TestModellerLogger.PassStep(m_Driver, "Click_Click_cncl_btn");
	}

      
	/**
 	 * Enter Amout_Verification
     * @name Enter Amout_Verification
     */
 	public void Enter_Amout_Verification(String Amout_Verification)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Amout_VerificationElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Amout_Verification", "Enter_Amout_Verification failed. Unable to locate object: " + Amout_VerificationElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Amout_Verification", "Enter_Amout_Verification failed. Unable to locate object: " + Amout_VerificationElem.toString());

 			Assert.fail("Unable to locate object: " + Amout_VerificationElem.toString());
         }

 		elem.sendKeys(Amout_Verification);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Amout_Verification " + Amout_Verification);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Amout_Verification " + Amout_Verification);
 	}
}