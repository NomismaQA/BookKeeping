package pages.PartialReconciledCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.ChangeWindow;
import utilities.ClosePopup;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/97286268-6e54-4353-9da1-1e43b40fcd0d
@TestModellerModule(guid = "97286268-6e54-4353-9da1-1e43b40fcd0d")
public class Searchclient extends BasePage
{
	public static String cl;
	Library s1;
	public Searchclient (WebDriver driver)
	{
		super(driver);
		s1=new Library(m_Driver);
		
	}

	private By _Clients_Elem = By.xpath("//LI[@id='ctl00_ctl00_ParentContent_SideMenu1_businessMenu']/A");
	//private By ctl00ctl00ParentContentcPHFiltertxtSearchCompanyElem=By.xpath("/html/body/form/main/div[3]/div[3]/div/div[2]/div/div/div/div/div/div/div[1]/div/input");
	private By ctl00ctl00ParentContentcPHFiltertxtSearchCompanyElem=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_txtSearchCompany']");
	//private By SearchbtnElem=By.xpath("/html/body/form/main/div[3]/div[3]/div/div[2]/div/div/div/div/div/div/div[6]/div/a");
	private By SearchbtnElem=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_btnSearch']");
	//private By _NidhiEntElem = By.xpath("/html/body/form/main/div[3]/div[3]/div/div[3]/div/div/table/tbody/tr[2]/td[1]/span");
	private By _NidhiEntElem = By.xpath("/html/body/form/main/div[5]/div[3]/div/div[3]/div/div/table/tbody/tr[2]/td[1]/span");
	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/AgentUI/Company.aspx");
		//m_Driver.get("http://sandbox4.nomismasolution.co.uk/AgentUI/Company.aspx");
		//m_Driver.get("http://sandbox4.nomismasolution.co.uk/AgentUI/Company.aspx?ddtype=1&service=0&status=1");
		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL -http://sandbox4.nomismasolution.co.uk/AgentUI/Company.aspx?ddtype=1&service=0&status=1");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL -http://sandbox4.nomismasolution.co.uk/AgentUI/Company.aspx?ddtype=1&service=0&status=1");
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
	 * @throws InterruptedException 
     * @name Click  Clients 
     */
	public void Click__Clients_() throws InterruptedException
	{
        
		WebElement elem = getWebElement(_Clients_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Clients_", "Click__Clients_ failed. Unable to locate object: " + _Clients_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Clients_", "Click__Clients_ failed. Unable to locate object: " + _Clients_Elem.toString());

			Assert.fail("Unable to locate object: " + _Clients_Elem.toString());
        }
//		Thread.sleep(1000);
//		ClosePopup.ValidateAndPopUp(m_Driver);
	//	elem.click();
		m_Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
        jsExec.executeScript("arguments[0].click();", elem);
	 //	ClosePopup.ValidateAndPopUp(m_Driver);
		ExtentReportManager.passStep(m_Driver, "Click__Clients_");

		TestModellerLogger.PassStep(m_Driver, "Click__Clients_");
	}

      
	/**
 	 * Enter ctl00$ctl00$ParentContent$cPHFilter$txtSearchCompany
     * @name Enter ctl00$ctl00$ParentContent$cPHFilter$txtSearchCompany
     */
 	public void Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(String ctl00ctl00ParentContentcPHFiltertxtSearchCompany)
 	{
 		cl=ctl00ctl00ParentContentcPHFiltertxtSearchCompany;
 		WebElement elem = getWebElement(ctl00ctl00ParentContentcPHFiltertxtSearchCompanyElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany", "Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany failed. Unable to locate object: " + ctl00ctl00ParentContentcPHFiltertxtSearchCompanyElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany", "Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany failed. Unable to locate object: " + ctl00ctl00ParentContentcPHFiltertxtSearchCompanyElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00ctl00ParentContentcPHFiltertxtSearchCompanyElem.toString());
         }

 		elem.sendKeys(ctl00ctl00ParentContentcPHFiltertxtSearchCompany);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany " + ctl00ctl00ParentContentcPHFiltertxtSearchCompany);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany " + ctl00ctl00ParentContentcPHFiltertxtSearchCompany);
 	}

     
	/**
 	 * Click Searchbtn
     * @name Click Searchbtn
     */
	public void Click_Searchbtn()
	{
        
		WebElement elem = getWebElement(SearchbtnElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Searchbtn", "Click_Searchbtn failed. Unable to locate object: " + SearchbtnElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Searchbtn", "Click_Searchbtn failed. Unable to locate object: " + SearchbtnElem.toString());

			Assert.fail("Unable to locate object: " + SearchbtnElem.toString());
        }

	//	elem.click();
		 jsExec.executeScript("arguments[0].click();", elem);
          	

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
Thread.sleep(1000);
		elem.click();
		Thread.sleep(1000);
	ChangeWindow.tabswitch(m_Driver);
//		s1.switchwindowForward(m_Driver);

		ExtentReportManager.passStep(m_Driver, "Click__NidhiEnt");

		TestModellerLogger.PassStep(m_Driver, "Click__NidhiEnt");
	}


	public String client1() {
		// TODO Auto-generated method stub
		return null;
	}

}