package FIN_3821;

import pages.BasePage;

import java.net.http.WebSocketHandshakeException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.sun.xml.bind.v2.schemagen.xmlschema.List;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/5a7432c2-4cd5-43b5-8289-8017ac44aae7
@TestModellerModule(guid = "5a7432c2-4cd5-43b5-8289-8017ac44aae7")
public class Pendingrcpt extends BasePage
{
	static public String prcptcount="";
	public Pendingrcpt (WebDriver driver)
	{
		super(driver);
	}

	static public int total;
	
	private By Pending_ReceiptElem = By.xpath("/html/body/form/main/div[5]/div[3]/div/div[5]/div[2]/div[1]/div/div/div[2]");


	
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
//   public void AssertUrl()
//    {
//        String currentUrl = m_Driver.getCurrentUrl();
//        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AgentUI/Default.aspx?p=true";
//
//        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AgentUI/Default.aspx?p=true")) {
//            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
//        }
//    }

     
	/**
 	 * Click Pending_Receipt
     * @name Click Pending_Receipt
     */
	public void Click_Pending_Receipt()
	{
		System.out.println("Click_Pending_Receipt");
        
		WebElement elem = getWebElement(Pending_ReceiptElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Pending_Receipt", "Click_Pending_Receipt failed. Unable to locate object: " + Pending_ReceiptElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Pending_Receipt", "Click_Pending_Receipt failed. Unable to locate object: " + Pending_ReceiptElem.toString());

			Assert.fail("Unable to locate object: " + Pending_ReceiptElem.toString());
        }

		WebElement prcpt=m_Driver.findElement(By.xpath("//*[@id='DivMoreopt']/div[2]/div[1]/div/div/div[2]/div/div/a[1]/div[1]/h3"));
		prcptcount=prcpt.getText();
		prcpt.click();
		
		System.out.println("dasboard count of pending receipt is :" +prcptcount);
		
		
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
				for(int j=1; j<=reccount;j++)
				{
					int p=j+1;
				System.out.println("for2");
				String rectext=m_Driver.findElement(By.xpath("//tbody/tr["+p+"]/td[4]")).getText();
				System.out.println("rectext"+rectext);
				int value = Integer.parseInt(rectext);
				total=total+value;
				}
				
			}
		}
		System.out.println("Total "+total);
		
	
		ExtentReportManager.passStep(m_Driver, "Click_Pending_Receipt");

		TestModellerLogger.PassStep(m_Driver, "Click_Pending_Receipt");
	}
	
	public  static int ret()
	{
	//	return prcptcount;
		return total;
	}
	public  static String ret1()
	{
		return prcptcount;
		
	}
	
}