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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/c5d8e968-2609-40d5-9f33-c3cd1221de32
@TestModellerModule(guid = "c5d8e968-2609-40d5-9f33-c3cd1221de32")
public class Clientbnkact extends BasePage
{
	public Clientbnkact (WebDriver driver)
	{
		super(driver);
	}


	
	private By Client_NameElem = By.xpath("//label[contains(.,'Client Name:')]/../div/input");

	private By Client_Type1Elem = By.xpath("//label[contains(.,'Client Type:')]/../div/select");

	private By Withou_FeedsElem = By.xpath("//label[contains(.,'Without Feeds:')]/../div/select");

	private By Unreconciled_TransactionsElem = By.xpath("//label[contains(.,'Unreconciled Transactions:')]/../div/select");

	private By UpdateElem = By.xpath("//label[contains(.,'')]/../div/a");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/AgentUI/ReportClientBankAccounts.aspx");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AgentUI/ReportClientBankAccounts.aspx");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AgentUI/ReportClientBankAccounts.aspx");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AgentUI/ReportClientBankAccounts.aspx";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AgentUI/ReportClientBankAccounts.aspx")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

      
	/**
 	 * Enter Client_Name
     * @name Enter Client_Name
     */
 	public void Enter_Client_Name(String Client_Name)
 	{
 	    
 		WebElement elem = getWebElement(Client_NameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Client_Name", "Enter_Client_Name failed. Unable to locate object: " + Client_NameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Client_Name", "Enter_Client_Name failed. Unable to locate object: " + Client_NameElem.toString());

 			Assert.fail("Unable to locate object: " + Client_NameElem.toString());
         }

 		elem.sendKeys(Client_Name);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Client_Name " + Client_Name);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Client_Name " + Client_Name);
 	}

    
	/**
 	 * Select Client_Type1
     * @name Select Client_Type1
     */
    public void Select_Client_Type1(String Client_Type1)
 	{
 	    
 		WebElement elem = getWebElement(Client_Type1Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Client_Type1", "Select_Client_Type1 failed. Unable to locate object: " + Client_Type1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Client_Type1", "Select_Client_Type1 failed. Unable to locate object: " + Client_Type1Elem.toString());

 			Assert.fail("Unable to locate object: " + Client_Type1Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Client_Type1);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Client_Type1 " + Client_Type1);

 		TestModellerLogger.PassStep(m_Driver, "Select_Client_Type1 " + Client_Type1);
 	}

    
	/**
 	 * Select Withou_Feeds
     * @name Select Withou_Feeds
     */
    public void Select_Withou_Feeds(String Withou_Feeds)
 	{
 	    
 		WebElement elem = getWebElement(Withou_FeedsElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Withou_Feeds", "Select_Withou_Feeds failed. Unable to locate object: " + Withou_FeedsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Withou_Feeds", "Select_Withou_Feeds failed. Unable to locate object: " + Withou_FeedsElem.toString());

 			Assert.fail("Unable to locate object: " + Withou_FeedsElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Withou_Feeds);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Withou_Feeds " + Withou_Feeds);

 		TestModellerLogger.PassStep(m_Driver, "Select_Withou_Feeds " + Withou_Feeds);
 	}

    
	/**
 	 * Select Unreconciled_Transactions
     * @name Select Unreconciled_Transactions
     */
    public void Select_Unreconciled_Transactions(String Unreconciled_Transactions)
 	{
 	    
 		WebElement elem = getWebElement(Unreconciled_TransactionsElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Unreconciled_Transactions", "Select_Unreconciled_Transactions failed. Unable to locate object: " + Unreconciled_TransactionsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Unreconciled_Transactions", "Select_Unreconciled_Transactions failed. Unable to locate object: " + Unreconciled_TransactionsElem.toString());

 			Assert.fail("Unable to locate object: " + Unreconciled_TransactionsElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Unreconciled_Transactions);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Unreconciled_Transactions " + Unreconciled_Transactions);

 		TestModellerLogger.PassStep(m_Driver, "Select_Unreconciled_Transactions " + Unreconciled_Transactions);
 	}

     
	/**
 	 * Click Update
     * @name Click Update
     */
	public void Click_Update()
	{
        
		WebElement elem = getWebElement(UpdateElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Update", "Click_Update failed. Unable to locate object: " + UpdateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Update", "Click_Update failed. Unable to locate object: " + UpdateElem.toString());

			Assert.fail("Unable to locate object: " + UpdateElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Update");

		TestModellerLogger.PassStep(m_Driver, "Click_Update");
	}
}