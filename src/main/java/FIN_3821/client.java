package FIN_3821;

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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/1816e690-1917-4f61-968c-1ac8af42b4c7
@TestModellerModule(guid = "1816e690-1917-4f61-968c-1ac8af42b4c7")
public class client extends BasePage
{
	public client (WebDriver driver)
	{
		super(driver);
	}
	static public int total;
	static public String txt;

	private By ClientsTABElem = By.xpath("//*[text()='Clients']");
	private By Client_Name2Elem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_txtSearchCompany']");

	//private By Service_SaElem = By.xpath("//label[contains(.,'Service:')]/../div/select");
	private By Service_SaElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_ddlService']");
	private By TypeElem = By.xpath("//label[contains(.,'Status:')]/../select[1]");

	private By Type_StatusElem = By.xpath("//label[contains(.,'Status:')]/../select[2]");

	private By Act_mgr2Elem = By.xpath("//label[contains(.,'Account manager:')]/../div/select");

	private By Search_btnnElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPHFilter_btnSearch']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/AgentUI/Company.aspx?ddtype=6&service=6&Status=1");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AgentUI/Company.aspx?ddtype=6&service=6&Status=1");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AgentUI/Company.aspx?ddtype=6&service=6&Status=1");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AgentUI/Company.aspx?ddtype=6&service=6&Status=1";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AgentUI/Company.aspx?ddtype=6&service=6&Status=1")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

      
	/**
 	 * Enter Client_Name2
     * @name Enter Client_Name2
     */
 	public void Enter_Client_Name2(String Client_Name2)
 	{
 	    
 		WebElement elem = getWebElement(ClientsTABElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Client_Name2", "Enter_Client_Name2 failed. Unable to locate object: " + Client_Name2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Client_Name2", "Enter_Client_Name2 failed. Unable to locate object: " + Client_Name2Elem.toString());

 			Assert.fail("Unable to locate object: " + Client_Name2Elem.toString());
         }
 	//	System.out.println("Enter_Client_Name2");
 		
 		txt = m_Driver.findElement(By.xpath("//*[@id='DivMoreopt']/div[2]/div[1]/div/div/div[4]/div/div/a[1]/div[1]/h3")).getText();
		System.out.println("txt"+txt);
 		elem.click();
 		//m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_SideMenu1_businessMenu']/a/span")).click();
 		//elem.sendKeys(Client_Name2);
 		//System.out.println("Enter_Client_Name2End");
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Client_Name2 " + Client_Name2);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Client_Name2 " + Client_Name2);
 	}

    
	/**
 	 * Select Service_Sa
     * @name Select Service_Sa
     */
    public void Select_Service_Sa(String Service_Sa)
 	{
 	    
 		WebElement elem = getWebElement(Service_SaElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Service_Sa", "Select_Service_Sa failed. Unable to locate object: " + Service_SaElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Service_Sa", "Select_Service_Sa failed. Unable to locate object: " + Service_SaElem.toString());

 			Assert.fail("Unable to locate object: " + Service_SaElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Service_Sa);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Service_Sa " + Service_Sa);

 		TestModellerLogger.PassStep(m_Driver, "Select_Service_Sa " + Service_Sa);
 	}

    
	/**
 	 * Select Type
     * @name Select Type
     */
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

    
	/**
 	 * Select Type_Status
     * @name Select Type_Status
     */
    public void Select_Type_Status(String Type_Status)
 	{
 	    
 		WebElement elem = getWebElement(Type_StatusElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Type_Status", "Select_Type_Status failed. Unable to locate object: " + Type_StatusElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Type_Status", "Select_Type_Status failed. Unable to locate object: " + Type_StatusElem.toString());

 			Assert.fail("Unable to locate object: " + Type_StatusElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Type_Status);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Type_Status " + Type_Status);

 		TestModellerLogger.PassStep(m_Driver, "Select_Type_Status " + Type_Status);
 	}

    
	/**
 	 * Select Act_mgr2
     * @name Select Act_mgr2
     */
    public void Select_Act_mgr2(String Act_mgr2)
 	{
 	    
 		WebElement elem = getWebElement(Act_mgr2Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Act_mgr2", "Select_Act_mgr2 failed. Unable to locate object: " + Act_mgr2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Act_mgr2", "Select_Act_mgr2 failed. Unable to locate object: " + Act_mgr2Elem.toString());

 			Assert.fail("Unable to locate object: " + Act_mgr2Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Act_mgr2);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Act_mgr2 " + Act_mgr2);

 		TestModellerLogger.PassStep(m_Driver, "Select_Act_mgr2 " + Act_mgr2);
 	}

     
	/**
 	 * Click Search_btnn
     * @name Click Search_btnn
     */
	public void Click_Search_btnn()
	{
        
		WebElement elem = getWebElement(Search_btnnElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Search_btnn", "Click_Search_btnn failed. Unable to locate object: " + Search_btnnElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Search_btnn", "Click_Search_btnn failed. Unable to locate object: " + Search_btnnElem.toString());

			Assert.fail("Unable to locate object: " + Search_btnnElem.toString());
        }

		elem.click();
		
		jsExec.executeScript("arguments[0].scrollIntoView(true);",  m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHFooter_PageUC1_rptrPager_ctl01_lblPage']")));
		java.util.List<WebElement> li =m_Driver.findElements(By.xpath("//a[contains(@id, 'ctl00_ctl00_ParentContent_cpHFooter')]"));
		
		int pgcount = li.size();
				
		System.out.println("pgcount"+pgcount);
		
		
		if(pgcount >1)
		{
			System.out.println("pgcount >1");
			
			
			for (int i=1; i<=pgcount;i++)
			{
				int k=i+1;
				System.out.println("for1");
				m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divPagination']/ul/li["+k+"]/a")).click();
				int reccount =m_Driver.findElements(By.xpath("//tbody/tr/td[4]")).size();
				System.out.println("reccount"+reccount);
//				for(int j=1; j<=reccount;j++)
//				{
//					int p=j+1;
				System.out.println("for2");
				int rec=m_Driver.findElements(By.xpath("//tbody/tr/td[1]")).size();
//				System.out.println("rectext"+rectext);
			//	int value = Integer.parseInt(rectext);
				total=total+rec;
				
				
				//}
				
			}
		}
		System.out.println("Total "+total);
		String Expected = String.valueOf(total);
		String Actual =txt;
		System.out.println("Expected"+Expected);
		System.out.println("Actual"+Actual);
		
		Assert.assertEquals(Actual, Expected, "Actual and Expected data is not matched");
          	

		ExtentReportManager.passStep(m_Driver, "Click_Search_btnn");

		TestModellerLogger.PassStep(m_Driver, "Click_Search_btnn");
	}
}