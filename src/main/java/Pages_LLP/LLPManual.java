package Pages_LLP;

import pages.BasePage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.Screenshotcapture;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/530ad722-2f7e-4e9a-8c16-9ff5e636ea46
@TestModellerModule(guid = "530ad722-2f7e-4e9a-8c16-9ff5e636ea46")
public class LLPManual extends BasePage
{
	public LLPManual (WebDriver driver)
	{
		super(driver);
	}
	String companyname;
	 static String businessname;
		List<WebElement> elem2;
		int i;
		 Dimension d = new Dimension(300,1080);
	
	private By LLP_Click_1Elem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnLLP']/div/div");

	private By Mannual_LLP_2Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_ltBussinessName']");

	private By Company_Name_3Elem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtCompanyName']");

	private By RegNo_4Elem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtRegNo']");

	private By UTRNo_LLP_5Elem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtUTRNo_LLP']");

	private By Reg_BUS_Date_6Elem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtCRegDate']");

	private By Member_FN_7Elem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtFirstName1']");

	private By Member_FN_8Elem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtLastName1']");

	private By Member2_FN_9Elem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtFirstName2']");

	private By Member2_FN_10Elem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtLastName2']");

	private By LLP_Save__11Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_btnSave']");

	private By CancelElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_btnCancel']");

	private By Choosefile_touploadElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div/div[3]/div/div[2]/div/div/div/input");

	private By Click_Upload_btnElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnUpload']");
	
	private By Click_CcheckboxElem=By.xpath("//*[@id='chkSingle']");
	
	private By House_SearchElem = By.xpath("//INPUT[@placeholder='Search..']");
	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AgentUI/CompanyAdd.aspx?menuid=0&ct=4");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AgentUI/CompanyAdd.aspx?menuid=0&ct=4");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AgentUI/CompanyAdd.aspx?menuid=0&ct=4");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/AgentUI/CompanyAdd.aspx?menuid=0&ct=4";

        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/AgentUI/CompanyAdd.aspx?menuid=0&ct=4")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click LLP_Click_1
     * @name Click LLP_Click_1
     */
	public void Click_LLP_Click_1()
	{
        
		WebElement elem = getWebElement(LLP_Click_1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_LLP_Click_1", "Click_LLP_Click_1 failed. Unable to locate object: " + LLP_Click_1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_LLP_Click_1", "Click_LLP_Click_1 failed. Unable to locate object: " + LLP_Click_1Elem.toString());

			Assert.fail("Unable to locate object: " + LLP_Click_1Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_LLP_Click_1");

		TestModellerLogger.PassStep(m_Driver, "Click_LLP_Click_1");
	}

     
	/**
 	 * Click Mannual_LLP_2
     * @name Click Mannual_LLP_2
     */
	public void Click_Mannual_LLP_2()
	{
        
		WebElement elem = getWebElement(Mannual_LLP_2Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Mannual_LLP_2", "Click_Mannual_LLP_2 failed. Unable to locate object: " + Mannual_LLP_2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Mannual_LLP_2", "Click_Mannual_LLP_2 failed. Unable to locate object: " + Mannual_LLP_2Elem.toString());

			Assert.fail("Unable to locate object: " + Mannual_LLP_2Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Mannual_LLP_2");

		TestModellerLogger.PassStep(m_Driver, "Click_Mannual_LLP_2");
	}

      
	/**
 	 * Enter Company_Name_3
     * @name Enter Company_Name_3
     */
 	public void Enter_Company_Name_3(String Company_Name_3)
 	{
 	    
 		WebElement elem = getWebElement(Company_Name_3Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Company_Name_3", "Enter_Company_Name_3 failed. Unable to locate object: " + Company_Name_3Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Company_Name_3", "Enter_Company_Name_3 failed. Unable to locate object: " + Company_Name_3Elem.toString());

 			Assert.fail("Unable to locate object: " + Company_Name_3Elem.toString());
         }

 		elem.sendKeys(Company_Name_3);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Company_Name_3 " + Company_Name_3);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Company_Name_3 " + Company_Name_3);
 	}

      
	/**
 	 * Enter RegNo_4
     * @name Enter RegNo_4
     */
 	public void Enter_RegNo_4(String RegNo_4)
 	{
 	    
 		WebElement elem = getWebElement(RegNo_4Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_RegNo_4", "Enter_RegNo_4 failed. Unable to locate object: " + RegNo_4Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_RegNo_4", "Enter_RegNo_4 failed. Unable to locate object: " + RegNo_4Elem.toString());

 			Assert.fail("Unable to locate object: " + RegNo_4Elem.toString());
         }

 		elem.sendKeys(RegNo_4);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_RegNo_4 " + RegNo_4);

  		TestModellerLogger.PassStep(m_Driver, "Enter_RegNo_4 " + RegNo_4);
 	}

      
	/**
 	 * Enter UTRNo_LLP_5
     * @name Enter UTRNo_LLP_5
     */
 	public void Enter_UTRNo_LLP_5(String UTRNo_LLP_5)
 	{
 	    
 		WebElement elem = getWebElement(UTRNo_LLP_5Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_UTRNo_LLP_5", "Enter_UTRNo_LLP_5 failed. Unable to locate object: " + UTRNo_LLP_5Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_UTRNo_LLP_5", "Enter_UTRNo_LLP_5 failed. Unable to locate object: " + UTRNo_LLP_5Elem.toString());

 			Assert.fail("Unable to locate object: " + UTRNo_LLP_5Elem.toString());
         }

 		elem.sendKeys(UTRNo_LLP_5);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_UTRNo_LLP_5 " + UTRNo_LLP_5);

  		TestModellerLogger.PassStep(m_Driver, "Enter_UTRNo_LLP_5 " + UTRNo_LLP_5);
 	}

      
	/**
 	 * Enter Reg_BUS_Date_6
     * @name Enter Reg_BUS_Date_6
     */
 	public void Enter_Reg_BUS_Date_6(String Reg_BUS_Date_6)
 	{
 	    
 		WebElement elem = getWebElement(Reg_BUS_Date_6Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Reg_BUS_Date_6", "Enter_Reg_BUS_Date_6 failed. Unable to locate object: " + Reg_BUS_Date_6Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Reg_BUS_Date_6", "Enter_Reg_BUS_Date_6 failed. Unable to locate object: " + Reg_BUS_Date_6Elem.toString());

 			Assert.fail("Unable to locate object: " + Reg_BUS_Date_6Elem.toString());
         }

 		String dtformat="DD/MM/YYYY";
 		

        String dt1=Reg_BUS_Date_6;

       elem.sendKeys(dt1);


    if(dt1.matches(dtformat))
    {
    	
    	
    	System.out.println("added sucessfully");
    	
    }
    else
    {
    	System.out.println("date needs_formatcheck()");
    	
    }
 		
 		
 		
 		
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Reg_BUS_Date_6 " + Reg_BUS_Date_6);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Reg_BUS_Date_6 " + Reg_BUS_Date_6);
 	}

      
	/**
 	 * Enter Member_FN_7
     * @name Enter Member_FN_7
     */
 	public void Enter_Member_FN_7(String Member_FN_7)
 	{
 	    
 		WebElement elem = getWebElement(Member_FN_7Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Member_FN_7", "Enter_Member_FN_7 failed. Unable to locate object: " + Member_FN_7Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Member_FN_7", "Enter_Member_FN_7 failed. Unable to locate object: " + Member_FN_7Elem.toString());

 			Assert.fail("Unable to locate object: " + Member_FN_7Elem.toString());
         }

 		elem.sendKeys(Member_FN_7);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Member_FN_7 " + Member_FN_7);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Member_FN_7 " + Member_FN_7);
 	}

      
	/**
 	 * Enter Member_FN_8
     * @name Enter Member_FN_8
     */
 	public void Enter_Member_FN_8(String Member_FN_8)
 	{
 	    
 		WebElement elem = getWebElement(Member_FN_8Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Member_FN_8", "Enter_Member_FN_8 failed. Unable to locate object: " + Member_FN_8Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Member_FN_8", "Enter_Member_FN_8 failed. Unable to locate object: " + Member_FN_8Elem.toString());

 			Assert.fail("Unable to locate object: " + Member_FN_8Elem.toString());
         }

 		elem.sendKeys(Member_FN_8);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Member_FN_8 " + Member_FN_8);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Member_FN_8 " + Member_FN_8);
 	}

      
	/**
 	 * Enter Member2_FN_9
     * @name Enter Member2_FN_9
     */
 	public void Enter_Member2_FN_9(String Member2_FN_9)
 	{
 	    
 		WebElement elem = getWebElement(Member2_FN_9Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Member2_FN_9", "Enter_Member2_FN_9 failed. Unable to locate object: " + Member2_FN_9Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Member2_FN_9", "Enter_Member2_FN_9 failed. Unable to locate object: " + Member2_FN_9Elem.toString());

 			Assert.fail("Unable to locate object: " + Member2_FN_9Elem.toString());
         }

 		elem.sendKeys(Member2_FN_9);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Member2_FN_9 " + Member2_FN_9);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Member2_FN_9 " + Member2_FN_9);
 	}

      
	/**
 	 * Enter Member2_FN_10
     * @name Enter Member2_FN_10
     */
 	public void Enter_Member2_FN_10(String Member2_FN_10)
 	{
 	    
 		WebElement elem = getWebElement(Member2_FN_10Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Member2_FN_10", "Enter_Member2_FN_10 failed. Unable to locate object: " + Member2_FN_10Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Member2_FN_10", "Enter_Member2_FN_10 failed. Unable to locate object: " + Member2_FN_10Elem.toString());

 			Assert.fail("Unable to locate object: " + Member2_FN_10Elem.toString());
         }

 		elem.sendKeys(Member2_FN_10);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Member2_FN_10 " + Member2_FN_10);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Member2_FN_10 " + Member2_FN_10);
 	}

 	
 	
 	public void PayrollCompany()
 	{
 		WebElement ChkBtn=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_chkIsEmployee']"));
 		ChkBtn.click();
 	}
     
	/**
 	 * Click LLP_Save _11
	 * @throws InterruptedException 
     * @name Click LLP_Save _11
     */
	public void Click_LLP_Save__11() throws InterruptedException
	{
        
		WebElement elem = getWebElement(LLP_Save__11Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_LLP_Save__11", "Click_LLP_Save__11 failed. Unable to locate object: " + LLP_Save__11Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_LLP_Save__11", "Click_LLP_Save__11 failed. Unable to locate object: " + LLP_Save__11Elem.toString());

			Assert.fail("Unable to locate object: " + LLP_Save__11Elem.toString());
        }

		elem.click();
          	Thread.sleep(2000);

		ExtentReportManager.passStep(m_Driver, "Click_LLP_Save__11");

		TestModellerLogger.PassStep(m_Driver, "Click_LLP_Save__11");
	}

     
	/**
 	 * Click Cancel
     * @name Click Cancel
     */
	public void Click_Cancel()
	{
        
		WebElement elem = getWebElement(CancelElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Cancel", "Click_Cancel failed. Unable to locate object: " + CancelElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Cancel", "Click_Cancel failed. Unable to locate object: " + CancelElem.toString());

			Assert.fail("Unable to locate object: " + CancelElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Cancel");

		TestModellerLogger.PassStep(m_Driver, "Click_Cancel");
	}
 
	public void ClickClientEle() {
		
		WebElement ele=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_SideMenu1_businessMenu']/a/span"));
		ele.click();
	}
	
	public void searchClient(String ClientName)
	{
		WebElement SearchClinet=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_txtSearchCompany']"));
		SearchClinet.sendKeys(ClientName);
		
	}
	
	public void searchClientBtn()
	{
		WebElement SearchClinetBtn=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_btnSearch']"));
		SearchClinetBtn.click();
		
	}
	
	public void AddClient()
	{
		WebElement NewClient=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_btnAdd']"));
		NewClient.click();
	}
	
	
	public void Enter_Choosefile_toupload(String Choosefile_toupload) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(Choosefile_touploadElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Choosefile_toupload", "Enter_Choosefile_toupload failed. Unable to locate object: " + Choosefile_touploadElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Choosefile_toupload", "Enter_Choosefile_toupload failed. Unable to locate object: " + Choosefile_touploadElem.toString());

 			Assert.fail("Unable to locate object: " + Choosefile_touploadElem.toString());
         }

 		elem.sendKeys(Choosefile_toupload);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Choosefile_toupload " + Choosefile_toupload);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Choosefile_toupload " + Choosefile_toupload);
 	}
	
	public void Click_Click_Upload_btn() throws InterruptedException
	{
        
		WebElement elem = getWebElement(Click_Upload_btnElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Click_Upload_btn", "Click_Click_Upload_btn failed. Unable to locate object: " + Click_Upload_btnElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Click_Upload_btn", "Click_Click_Upload_btn failed. Unable to locate object: " + Click_Upload_btnElem.toString());

			Assert.fail("Unable to locate object: " + Click_Upload_btnElem.toString());
        }

		elem.click();
          	Thread.sleep(1000);
		//utilities.PassScreenshot.Getscreenshot11("uploadedbuttonscucessfully","Upload");
		ExtentReportManager.passStep(m_Driver, "Click_Click_Upload_btn");

		TestModellerLogger.PassStep(m_Driver, "Click_Click_Upload_btn");
	}
	
	
	public void Click_CcheckboxElem() throws InterruptedException
	{
        
		WebElement elem = getWebElement(Click_CcheckboxElem);
//
//		if (elem == null) 
//		{
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_CcheckboxElem", "Click_CcheckboxElem failed. Unable to locate object: " + Click_CcheckboxElem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_CcheckboxElem", "Click_CcheckboxElem failed. Unable to locate object: " + Click_CcheckboxElem.toString());
//
//			Assert.fail("Unable to locate object: " +Click_CcheckboxElem.toString());
//        }

		elem.click();
		Thread.sleep(1000);
		m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_btnSave']")).click();
     //  utilities.PassScreenshot.Getscreenshot11("import", "upload");

		ExtentReportManager.passStep(m_Driver, "Click_Click_Plus_Sign1");

		TestModellerLogger.PassStep(m_Driver, "Click_Click_Plus_Sign1");
	}
 	public void Enter_House_Search(String House_Search) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(House_SearchElem);
 		

		if (elem == null) {
  		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_House_Search", "Enter_House_Search failed. Unable to locate object: " + House_SearchElem.toString());

   		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_House_Search", "Enter_House_Search failed. Unable to locate object: " + House_SearchElem.toString());

		Assert.fail("Unable to locate object: " + House_SearchElem.toString());
       }
		elem.sendKeys(House_Search);
		
		Thread.sleep(2000);
 	
//		WebElement el2=m_Driver.findElement(By.xpath("//*[@id='tblCompanies']/tbody/tr[2]/td[1]"));
//		companyname=el2.getText();
//		System.out.println("company name is:"+companyname);
//		jsExec.executeScript("arguments[0].click();",el2);
//		
//		//  utilities.Screenshotcapture.Getscreenshot("Company house Search list display_TC04", "Add LLP Business");
//	    m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));
//	 //   m_Driver.manage().window().setSize(d);
//		  Thread.sleep(1000);
// 		WebElement create=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHFooter_btnSave']")));
//		jsExec.executeScript("arguments[0].scrollIntoView();", create);
// 		create.click();
// 		Thread.sleep(1000);
//	//	utilities.PassScreenshot.Getscreenshot11("CreateCompany", House_Search);
//		/*Search created company name*/
//		
//		m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_txtSearchCompany']")).sendKeys(companyname);
//		WebElement el6=	jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_btnSearch']")));
//		jsExec.executeScript("arguments[0].click()", el6);
//		utilities.PassScreenshot.Getscreenshot11("ComSrh in businessDB", "House_Search");
//		Thread.sleep(1000);
 		
 	
 	}
 	
	public void Enter_House_Search_Popup(String House_Search) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(House_SearchElem);
 		

		if (elem == null) {
  		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_House_Search", "Enter_House_Search failed. Unable to locate object: " + House_SearchElem.toString());

   		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_House_Search", "Enter_House_Search failed. Unable to locate object: " + House_SearchElem.toString());

		Assert.fail("Unable to locate object: " + House_SearchElem.toString());
       }
		elem.sendKeys(House_Search);
		
		Thread.sleep(2000);
 	
		WebElement el2=m_Driver.findElement(By.xpath("//*[@id='tblCompanies']/tbody/tr[2]/td[1]"));
		companyname=el2.getText();
		System.out.println("company name is:"+companyname);
		jsExec.executeScript("arguments[0].click();",el2);
		
		//  utilities.Screenshotcapture.Getscreenshot("Company house Search list display_TC04", "Add LLP Business");
//	    m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));
	 //   m_Driver.manage().window().setSize(d);
//		  Thread.sleep(1000);
 //		WebElement create=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHFooter_btnSave']")));
//		jsExec.executeScript("arguments[0].scrollIntoView();", create);
//		create.click();
 //		Thread.sleep(1000);
	//	utilities.PassScreenshot.Getscreenshot11("CreateCompany", House_Search);
		/*Search created company name*/
		
//		m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_txtSearchCompany']")).sendKeys(companyname);
//		WebElement el6=	jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_btnSearch']")));
//		jsExec.executeScript("arguments[0].click()", el6);
		
		Thread.sleep(2000);
 		
 	
 	}
	
	public void Enter_House_Search_Popup_CreateCp(String House_Search) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(House_SearchElem);
 		

		if (elem == null) {
  		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_House_Search", "Enter_House_Search failed. Unable to locate object: " + House_SearchElem.toString());

   		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_House_Search", "Enter_House_Search failed. Unable to locate object: " + House_SearchElem.toString());

		Assert.fail("Unable to locate object: " + House_SearchElem.toString());
       }
		elem.sendKeys(House_Search);
		
		Thread.sleep(2000);
 	
		WebElement el2=m_Driver.findElement(By.xpath("//*[@id='tblCompanies']/tbody/tr[2]/td[1]"));
		companyname=el2.getText();
		System.out.println("company name is:"+companyname);
		jsExec.executeScript("arguments[0].click();",el2);
		
		//  utilities.Screenshotcapture.Getscreenshot("Company house Search list display_TC04", "Add LLP Business");
	    m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));
	 //   m_Driver.manage().window().setSize(d);
		  Thread.sleep(1000);
 		WebElement create=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHFooter_btnSave']")));
		jsExec.executeScript("arguments[0].scrollIntoView();", create);
 		create.click();
 		Thread.sleep(1000);
	//	utilities.PassScreenshot.Getscreenshot11("CreateCompany", House_Search);
		/*Search created company name*/
		
		m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_txtSearchCompany']")).sendKeys(companyname);
		WebElement el6=	jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_btnSearch']")));
		jsExec.executeScript("arguments[0].click()", el6);
		//utilities.PassScreenshot.Getscreenshot11("ComSrh in businessDB", "House_Search");
		Thread.sleep(1000);
 		
 	
 	}
	
	public void bak_btn() throws InterruptedException
		{
	        
			WebElement elem=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHeaderRight_aBackButton']")));
			jsExec.executeScript("arguments[0].click();",elem);
			
		}
 	
	public void HighlightPayroll()
	{
		WebElement elem=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl02_rowCompany']"));
		jsExec.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", elem);

	}
}