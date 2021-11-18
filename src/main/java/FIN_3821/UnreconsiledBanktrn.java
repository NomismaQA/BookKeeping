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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/c3044fb2-2cac-413f-bb47-ffc4fbc4a800
@TestModellerModule(guid = "c3044fb2-2cac-413f-bb47-ffc4fbc4a800")
public class UnreconsiledBanktrn extends BasePage
{
	
	static String unconcileddata="";
	public UnreconsiledBanktrn (WebDriver driver)
	{
		super(driver);
	}


	
	private By Unreconsiled_Bnk_trnElem = By.xpath("/html/body/form/main/div[5]/div[3]/div/div[5]/div[2]/div[1]/div/div/div[3]");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/AgentUI/Default.aspx?p=true");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AgentUI/Default.aspx?p=true");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AgentUI/Default.aspx?p=true");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AgentUI/Default.aspx?p=true";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AgentUI/Default.aspx?p=true")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click Unreconsiled_Bnk_trn
     * @name Click Unreconsiled_Bnk_trn
     */
	public void Click_Unreconsiled_Bnk_trn()
	{
        
		WebElement elem = getWebElement(Unreconsiled_Bnk_trnElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Unreconsiled_Bnk_trn", "Click_Unreconsiled_Bnk_trn failed. Unable to locate object: " + Unreconsiled_Bnk_trnElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Unreconsiled_Bnk_trn", "Click_Unreconsiled_Bnk_trn failed. Unable to locate object: " + Unreconsiled_Bnk_trnElem.toString());

			Assert.fail("Unable to locate object: " + Unreconsiled_Bnk_trnElem.toString());
        }

		String txt = elem.getText();
		System.out.println("txt"+txt);
		unconcileddata = txt.replaceAll("[^0-9]", "");
		System.out.println("txt"+unconcileddata);
		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Unreconsiled_Bnk_trn");

		TestModellerLogger.PassStep(m_Driver, "Click_Unreconsiled_Bnk_trn");
		
	}
	public String unreconciledataf()
	{
		return unconcileddata;
	}
}