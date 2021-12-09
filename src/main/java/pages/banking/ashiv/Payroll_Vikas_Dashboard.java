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
import utilities.ChangeWindow;
import utilities.ClosePopup;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/48c31222-7a95-4e2c-8e30-ea0a532a125c
@TestModellerModule(guid = "48c31222-7a95-4e2c-8e30-ea0a532a125c")
public class Payroll_Vikas_Dashboard extends BasePage
{
	public static String cl;
	public Payroll_Vikas_Dashboard (WebDriver driver)
	{
		super(driver);
	}

	private By ClientsTABElem = By.xpath("//*[text()='Clients']");
	private By ClientNameElem = By.id("ctl00_ctl00_ParentContent_cPHFilter_txtSearchCompany");
	private By SearchButtonElem = By.id("ctl00_ctl00_ParentContent_cPHFilter_btnSearch");
	private By SelectClientElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_rowCompany']/td[1]/span");
	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AccountUI/Default.aspx?FYCode=52444&CompanyCode=13236&menuid=0&p=true");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/Default.aspx?FYCode=52444&CompanyCode=13236&menuid=0&p=true");
		
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/Default.aspx?FYCode=52444&CompanyCode=13236&menuid=0&p=true");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/AccountUI/Default.aspx?FYCode=52444&CompanyCode=13236&menuid=0&p=true";

        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/AccountUI/Default.aspx?FYCode=52444&CompanyCode=13236&menuid=0&p=true")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click ClientsTAB
	 * @throws InterruptedException 
     * @name Click ClientsTAB
     */
	public void Click_ClientsTAB() throws InterruptedException
	{
        
		WebElement elem = getWebElement(ClientsTABElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClientsTAB", "Click_ClientsTAB failed. Unable to locate object: " + ClientsTABElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClientsTAB", "Click_ClientsTAB failed. Unable to locate object: " + ClientsTABElem.toString());

			Assert.fail("Unable to locate object: " + ClientsTABElem.toString());
        }

		//elem.click();
          	Thread.sleep(2000);
		jsExec.executeScript("arguments[0].click();",elem);
		//Thread.sleep(5000);
	//	ClosePopup.ValidateAndPopUp(m_Driver);
		/// m_Driver.findElement(By.xpath("//*[text()='Clients']")));
		ExtentReportManager.passStep(m_Driver, "Click_ClientsTAB");

		TestModellerLogger.PassStep(m_Driver, "Click_ClientsTAB");
	}

      
	/**
 	 * Enter ClientName
	 * @throws InterruptedException 
     * @name Enter ClientName
     */
 	public void Enter_ClientName(String ClientName) throws InterruptedException
 	{
 		
 		WebElement elem = getWebElement(ClientNameElem);
 		cl=ClientName;
 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ClientName", "Enter_ClientName failed. Unable to locate object: " + ClientNameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ClientName", "Enter_ClientName failed. Unable to locate object: " + ClientNameElem.toString());

 			Assert.fail("Unable to locate object: " + ClientNameElem.toString());
         }
Thread.sleep(1000);
 		elem.sendKeys(ClientName);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ClientName " + ClientName);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ClientName " + ClientName);
 	}

     
	/**
 	 * Click SearchButton
	 * @throws InterruptedException 
     * @name Click SearchButton
     */
	public void Click_SearchButton() throws InterruptedException
	{
        
		WebElement elem = getWebElement(SearchButtonElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SearchButton", "Click_SearchButton failed. Unable to locate object: " + SearchButtonElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SearchButton", "Click_SearchButton failed. Unable to locate object: " + SearchButtonElem.toString());

			Assert.fail("Unable to locate object: " + SearchButtonElem.toString());
        }
		//elem.ValidateAndPopUp(m_Driver);
		Thread.sleep(2000);
	//	elem.click();
		jsExec.executeScript("arguments[0].click();", elem);
		
		ExtentReportManager.passStep(m_Driver, "Click_SearchButton");

		TestModellerLogger.PassStep(m_Driver, "Click_SearchButton");
	}

     
	/**
 	 * Click SelectClient
	 * @throws InterruptedException 
     * @name Click SelectClient
     */
	public void Click_SelectClient() throws InterruptedException
	{
        
		WebElement elem = getWebElement(SelectClientElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SelectClient", "Click_SelectClient failed. Unable to locate object: " + SelectClientElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SelectClient", "Click_SelectClient failed. Unable to locate object: " + SelectClientElem.toString());

			Assert.fail("Unable to locate object: " + SelectClientElem.toString());
        }
		
		elem.click();
		System.out.println("Click Client");
		ChangeWindow.tabswitch(m_Driver);
          	

		ExtentReportManager.passStep(m_Driver, "Click_SelectClient");

		TestModellerLogger.PassStep(m_Driver, "Click_SelectClient");
	}
	public String client1()
	{
		return cl;
	}
	
	
	
	
	public void payroll()
	{
		m_Driver.findElement(By.xpath("//*[@id='payrollMenu']/a/span")).click();
		
		m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_SideMenu1_PRMenuChildren']/li[1]/a")).click();
		
		
		
	}
	public void dashboard(String data,String data2) throws InterruptedException
	{
	//	WebElement row =m_Driver.findElement(By.xpath("(//tr[@class='head'])["+data+"]"));
		WebElement RC=m_Driver.findElement(By.xpath("(//tr[@class='head']/td["+data+"])["+data2+"]/span/a"));
	//	jsExec.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", RC);
		
		jsExec.executeScript("arguments[0].click();",RC);


		
		
		Thread.sleep(2000);
	}
	
	
	
	
	
}