package pages.Company_Settings;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import pages.BasePage;
import pages.Library;
import utilities.ClosePopup;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/97286268-6e54-4353-9da1-1e43b40fcd0d
@TestModellerModule(guid = "97286268-6e54-4353-9da1-1e43b40fcd0d")
public class Search_Inactiveclient extends BasePage
{
	
	Library s1;
	String client2;
	public Search_Inactiveclient (WebDriver driver)
	{
		super(driver);
		s1=new Library(m_Driver);
	}
	

	
	////*[@id="ctl00_ctl00_ParentContent_cPHFilter_txtSearchCompany"]
////*[@id="ctl00_ctl00_ParentContent_cPHFilter_btnSearch"]
	private By _Clients_Elem = By.xpath("//LI[@id='ctl00_ctl00_ParentContent_SideMenu1_businessMenu']/A");
	//private By ctl00ctl00ParentContentcPHFiltertxtSearchCompanyElem=By.xpath("/html/body/form/main/div[5]/div[3]/div/div[2]/div/div/div/div/div/div/div[1]/div/input");
private By ctl00ctl00ParentContentcPHFiltertxtSearchCompanyElem=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_txtSearchCompany']");
	//private By SearchbtnElem=By.xpath("/html/body/form/main/div[3]/div[3]/div/div[2]/div/div/div/div/div/div/div[6]/div/a");
	private By SearchbtnElem=By.xpath("/html/body/form/main/div[5]/div[3]/div/div[2]/div/div/div/div/div/div/div[6]/div/a");
	//private By _NidhiEntElem = By.xpath("/html/body/form/main/div[3]/div[3]/div/div[3]/div/div/table/tbody/tr[2]/td[1]/span");
	//private By _NidhiEntElem = By.xpath("/html/body/form/main/div[5]/div[3]/div/div[3]/div/div/table/tbody/tr[2]/td[1]/span");
	//private By _NidhiEntElem=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_rowCompany']/td[1]/span");
	private By _NidhiEntElem=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_rowCompany']/td[1]/span");
	////*[@id="ctl00_ctl00_ParentContent_cPH_RptClient_ctl00_lnkClientEdit"]

	private By Service_BookeepingElem = By.xpath("//SELECT[@id='ctl00_ctl00_ParentContent_cPHFilter_ddlService']");

	private By TypeElem = By.xpath("//label[contains(.,'Status:')]/../select[1]");

	private By statusElem = By.xpath("//label[contains(.,'Status:')]/../select[2]");

	private By Act_mgrElem = By.xpath("//label[contains(.,'Account manager:')]/../div/select");
	
	////*[@id="ctl00_ctl00_ParentContent_cPHFilter_btnSearch"]
	
	
	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AgentUI/Company.aspx");
		//m_Driver.get("http://sandbox4.nomismasolution.co.uk/AgentUI/Company.aspx");
		//m_Driver.get("http://sandbox4.nomismasolution.co.uk/AgentUI/Company.aspx?ddtype=1&service=0&status=1");
		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL -http://sandbox3.nomismasolution.co.uk/AgentUI/Company.aspx?ddtype=1&service=0&status=1");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL -http://sandbox3.nomismasolution.co.uk/AgentUI/Company.aspx?ddtype=1&service=0&status=1");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
//   public void AssertUrl()
//    {
//        String currentUrl = m_Driver.getCurrentUrl();
//        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AgentUI/Company.aspx?ddtype=1&service=0&status=1";
//
//        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AgentUI/Company.aspx?ddtype=1&service=0&status=1")) {
//            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
//        }
//    }

     
	/**
 	 * Click  Clients 
     * @name Click  Clients 
     */
	public void Click__Clients_()
	{
        
		WebElement elem = getWebElement(_Clients_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Clients_", "Click__Clients_ failed. Unable to locate object: " + _Clients_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Clients_", "Click__Clients_ failed. Unable to locate object: " + _Clients_Elem.toString());

			Assert.fail("Unable to locate object: " + _Clients_Elem.toString());
        }
		
	 ClosePopup.ValidateAndPopUp(m_Driver);

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__Clients_");

		TestModellerLogger.PassStep(m_Driver, "Click__Clients_");
	}

      
	/**
 	 * Enter ctl00$ctl00$ParentContent$cPHFilter$txtSearchCompany
	 * @throws InterruptedException 
     * @name Enter ctl00$ctl00$ParentContent$cPHFilter$txtSearchCompany
     */
 	public void Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(String ctl00ctl00ParentContentcPHFiltertxtSearchCompany) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(ctl00ctl00ParentContentcPHFiltertxtSearchCompanyElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany", "Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany failed. Unable to locate object: " + ctl00ctl00ParentContentcPHFiltertxtSearchCompanyElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany", "Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany failed. Unable to locate object: " + ctl00ctl00ParentContentcPHFiltertxtSearchCompanyElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00ctl00ParentContentcPHFiltertxtSearchCompanyElem.toString());
         }

 		elem.sendKeys(ctl00ctl00ParentContentcPHFiltertxtSearchCompany);
 		
 		//Thread.sleep(2000);
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany " + ctl00ctl00ParentContentcPHFiltertxtSearchCompany);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany " + ctl00ctl00ParentContentcPHFiltertxtSearchCompany);
 	}

 	
 	public void Select_Service_Bookeeping(String Service_Bookeeping)
 	{
 	    
 		WebElement elem = getWebElement(Service_BookeepingElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Service_Bookeeping", "Select_Service_Bookeeping failed. Unable to locate object: " + Service_BookeepingElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Service_Bookeeping", "Select_Service_Bookeeping failed. Unable to locate object: " + Service_BookeepingElem.toString());

 			Assert.fail("Unable to locate object: " + Service_BookeepingElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Service_Bookeeping);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Service_Bookeeping " + Service_Bookeeping);

 		TestModellerLogger.PassStep(m_Driver, "Select_Service_Bookeeping " + Service_Bookeeping);
 	}
 	  public void Select_Type(String Type)
 	 	{
 	 	    
 	 		WebElement elem = getWebElement(TypeElem);

 	 		if (elem == null) {
 	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Type", "Select_Type failed. Unable to locate object: " + TypeElem.toString());

 	    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Type", "Select_Type failed. Unable to locate object: " + TypeElem.toString());

 	 			Assert.fail("Unable to locate object: " + TypeElem.toString());
 	         }

 	 		Select dropdown = new Select(elem);

 	 		dropdown.selectByVisibleText(Type);
 	 		
 	 		
 	 		ExtentReportManager.passStep(m_Driver, "Select_Type " + Type);

 	 		TestModellerLogger.PassStep(m_Driver, "Select_Type " + Type);
 	 	}
 	  
 	  
 	 public void Select_status(String status)
  	{
  	    
  		WebElement elem = getWebElement(statusElem);

  		if (elem == null) {
     		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_status", "Select_status failed. Unable to locate object: " + statusElem.toString());

     		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_status", "Select_status failed. Unable to locate object: " + statusElem.toString());

  			Assert.fail("Unable to locate object: " + statusElem.toString());
          }

  		Select dropdown = new Select(elem);

  		dropdown.selectByVisibleText(status);
  		
  		
  		ExtentReportManager.passStep(m_Driver, "Select_status " + status);

  		TestModellerLogger.PassStep(m_Driver, "Select_status " + status);
  	}
 	 
 	 
 	 public void Select_Act_mgr(String Act_mgr)
  	{
  	    
  		WebElement elem = getWebElement(Act_mgrElem);

  		if (elem == null) {
     		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Act_mgr", "Select_Act_mgr failed. Unable to locate object: " + Act_mgrElem.toString());

     		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Act_mgr", "Select_Act_mgr failed. Unable to locate object: " + Act_mgrElem.toString());

  			Assert.fail("Unable to locate object: " + Act_mgrElem.toString());
          }

  		Select dropdown = new Select(elem);

  		dropdown.selectByVisibleText(Act_mgr);
  		elem.sendKeys(Keys.TAB);
  		
  		ExtentReportManager.passStep(m_Driver, "Select_Act_mgr " + Act_mgr);

  		TestModellerLogger.PassStep(m_Driver, "Select_Act_mgr " + Act_mgr);
  	}

	/**
 	 * Click Searchbtn
	 * @throws InterruptedException 
     * @name Click Searchbtn
     */
	public void Click_Searchbtn() throws InterruptedException
	{
        
		WebElement elem = getWebElement(SearchbtnElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Searchbtn", "Click_Searchbtn failed. Unable to locate object: " + SearchbtnElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Searchbtn", "Click_Searchbtn failed. Unable to locate object: " + SearchbtnElem.toString());

			Assert.fail("Unable to locate object: " + SearchbtnElem.toString());
        }
	
		//elem.click();
		
		jsExec.executeScript("arguments[0].click();", elem);
		Thread.sleep(2000);
		WebElement c=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_rowCompany']/td[1]/span"));
		client2=c.getText();
		System.out.println("client:"   +client2);
		
		
		ExtentReportManager.passStep(m_Driver, "Click_Searchbtn");

		TestModellerLogger.PassStep(m_Driver, "Click_Searchbtn");
	}

     
	/**
 	 * Click  NidhiEnt
	 * @throws InterruptedException 
     * @name Click  NidhiEnt
     */
	public void Click__NidhiEnt() throws InterruptedException
	{
        
		WebElement elem = getWebElement(_NidhiEntElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__NidhiEnt", "Click__NidhiEnt failed. Unable to locate object: " + _NidhiEntElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__NidhiEnt", "Click__NidhiEnt failed. Unable to locate object: " + _NidhiEntElem.toString());

			Assert.fail("Unable to locate object: " + _NidhiEntElem.toString());
		
			//s1.switchwindowForward(m_Driver);
		
        }

		elem.click();
		//Thread.sleep(1000);
		s1.switchwindowForward(m_Driver);
		ClosePopup.ValidateAndPopUp(m_Driver);
	
		//ExtentReportManager.passStep(m_Driver, "Click__NidhiEnt");

		//TestModellerLogger.PassStep(m_Driver, "Click__NidhiEnt");
	}
	public String client1()
	{
		// TODO Auto-generated method stub
		return client2;
	}
	

	
	
	
}