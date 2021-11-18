package pages;

import pages.BasePage;

import java.awt.List;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.UtilityForVATTypeVerification1;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/e0220f24-814d-490d-b572-ae9e1a2d88a7
@TestModellerModule(guid = "e0220f24-814d-490d-b572-ae9e1a2d88a7")
public class VerifyVATType extends BasePage
{
	public VerifyVATType (WebDriver driver)
	{
		super(driver);
	}


	
	private By VerifyVATTypeElem = By.xpath("//DIV[@class='alert alert-success']");
	


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=52445&CompanyCode=13250&IsFirstRequest=1");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=52445&CompanyCode=13250&IsFirstRequest=1");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=52445&CompanyCode=13250&IsFirstRequest=1");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=52445&CompanyCode=13250&IsFirstRequest=1";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=52445&CompanyCode=13250&IsFirstRequest=1")) 
        {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click VerifyVATType
	 * @throws InterruptedException 
     * @name Click VerifyVATType
     */
	public void Click_VerifyVATType() throws InterruptedException
	{
		//System.out.println("HIIIIIIII");
        
		WebElement elem = getWebElement(VerifyVATTypeElem);

		if (elem == null) 
		{
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_VerifyVATType", "Click_VerifyVATType failed. Unable to locate object: " + VerifyVATTypeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_VerifyVATType", "Click_VerifyVATType failed. Unable to locate object: " + VerifyVATTypeElem.toString());

			Assert.fail("Unable to locate object: " + VerifyVATTypeElem.toString());
        }

		//String ster
		ExtentReportManager.passStep(m_Driver, "Click_VerifyVATType");

		TestModellerLogger.PassStep(m_Driver, "Click_VerifyVATType");
	}
	
 public static void verification1() throws InterruptedException
		{
			int count;
			String out="";
		//WebElement elem = getWebElement(VerifyVATTypeElem);


			//String str = elem.getText();
			String str= m_Driver.findElement(By.xpath("//DIV[@class='alert alert-success']")).getText();
			System.out.println("str");
			String str1[] = str.split(" ");
			//elem.click();
			String recno = str1[2];
			//java.util.List<WebElement> list = new ArrayList<WebElement>();
			//list = m_Driver.findElements(By .xpath("//*[@id=\"ctl00_cPH_filtrec\"]/div/div/table"));
//			for(WebElement dd:list)
//			{
//				count = list.size();
//				out = dd.getText();
//				System.out.print("dddd"+out);
//			//*[@id="ctl00_cPH_filtrec"]/div/div/table/tbody/tr[1]/td[3]
			Dimension size =m_Driver.findElement(By.xpath("//*[@id=\"ctl00_cPH_filtrec\"]/div/div/table/tbody/tr[1]/td[3]")).getSize();
		
			
			for(int i=1; i<=20; i++)
			{
				
				if(out==recno)
				{
					m_Driver.findElement(By.xpath("//*[@id=\"ctl00_cPH_filtrec\"]/div/div/table/tbody/tr[i]/td[2]")).click();
					Thread.sleep(2000);
				}
			}
			}
			//System.out.println("HIggdfIIIIIII");*/
			
			
		}
