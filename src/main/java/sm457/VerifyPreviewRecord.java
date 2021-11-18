package sm457;



import pages.BasePage;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.Screenshotcapture;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;
import pages.SaleInvoice;

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/33bdcd72-2cad-4502-a4af-85e87b099314
@TestModellerModule(guid = "33bdcd72-2cad-4502-a4af-85e87b099314")
public class VerifyPreviewRecord extends BasePage
{
	public VerifyPreviewRecord (WebDriver driver)
	{
		super(driver);
	}


	
	//private By SalesTabElem = By.xpath("//A[@href='../AccountUI/Invoice.aspx?FYCode=52455&CompanyCode=13259&IsFirstRequest=1']");
	//private By SalesTabElem = By.xpath("//A[@href='../AccountUI/Invoice.aspx?FYCode=52455&CompanyCode=13259&IsFirstRequest=1']");
	private By SalesTabElem = By.xpath("//span[contains(text(),'Sales')]");
	private By RecordsElem = By.xpath("//A[@id='ctl00_cPH_rptrDisplayRecords_ctl00_lnkTranDetail']");

	private By _RecordCloseElem = By.xpath("//BUTTON[@id='EditPopUpClose']");
	


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=52455&CompanyCode=13259&IsFirstRequest=1");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=52455&CompanyCode=13259&IsFirstRequest=1");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=52455&CompanyCode=13259&IsFirstRequest=1");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=52455&CompanyCode=13259&IsFirstRequest=1";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=52455&CompanyCode=13259&IsFirstRequest=1")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click SalesTab
     * @name Click SalesTab
     */
	public void Click_SalesTab()
	{
        
		WebElement elem = getWebElement(SalesTabElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SalesTab", "Click_SalesTab failed. Unable to locate object: " + SalesTabElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SalesTab", "Click_SalesTab failed. Unable to locate object: " + SalesTabElem.toString());

			Assert.fail("Unable to locate object: " + SalesTabElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_SalesTab");

		TestModellerLogger.PassStep(m_Driver, "Click_SalesTab");
	}

     
	/**
 	 * Click Records
	 * @throws AWTException 
	 * @throws IOException 
	 * @throws HeadlessException 
	 * @throws InterruptedException 
     * @name Click Records
     */
	public void Click_Records() throws HeadlessException, IOException, AWTException, InterruptedException
	{
        
		WebElement elem = getWebElement(RecordsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Records", "Click_Records failed. Unable to locate object: " + RecordsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Records", "Click_Records failed. Unable to locate object: " + RecordsElem.toString());

			Assert.fail("Unable to locate object: " + RecordsElem.toString());
        }

		//elem.click();
		
		int rowcount = m_Driver.findElements(By.xpath("//*[@id='ctl00_cPH_filtrec']/div/div/table/tbody/tr")).size();
		System.out.println(rowcount);
	
		for(int i=1; i<rowcount; i++)
		{
			int j=i-1;
			System.out.println("Hi loop"+i);
			
			WebElement dd= m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_filtrec']/div/div/table/tbody/tr["+ i +"]/td[5]"));

			String str =dd.getText();
			String str1 ="Post";
			str1=str1+str;
			System.out.println("ÏnvoiceNO"+str1);
//			System.out.println("Ïnn"+inno);
//			System.out.println("2i"+i);
//			if(inno.equalsIgnoreCase(str))
//			{
			
						String st= m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_filtrec']/div/div/table/tbody/tr["+ i +"]/td[2]")).getText();
						Thread.sleep(1500);
						m_Driver.findElement(By.xpath("//a[text()=" +st+ "]")).click();
						Screenshotcapture.captureAsImage(m_Driver, str1);
						m_Driver.findElement(By.xpath("//*[@id='EditPopUpClose']/span")).click();
						jsExec.executeScript("arguments[0].scrollIntoView(true);",  m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_filtrec']/div/div/table/tbody/tr["+ i +"]/td[2]")));
						
//						BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
//						 ImageIO.write(image, "png", new File(System.getProperty("user.dir")+"\\"+inno+".png"));
						
				
			}
			
          	

		ExtentReportManager.passStep(m_Driver, "Click_Records");

		TestModellerLogger.PassStep(m_Driver, "Click_Records");
	}

     
	/**
 	 * Click × RecordClose
     * @name Click × RecordClose
     */
	public void Click__RecordClose()
	{
        
		WebElement elem = getWebElement(_RecordCloseElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__RecordClose", "Click__RecordClose failed. Unable to locate object: " + _RecordCloseElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__RecordClose", "Click__RecordClose failed. Unable to locate object: " + _RecordCloseElem.toString());

			Assert.fail("Unable to locate object: " + _RecordCloseElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__RecordClose");

		TestModellerLogger.PassStep(m_Driver, "Click__RecordClose");
	}
}