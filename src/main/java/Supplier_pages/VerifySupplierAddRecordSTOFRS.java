package Supplier_pages;

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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/32071078-fd64-4360-bc2a-218004f62b17
@TestModellerModule(guid = "32071078-fd64-4360-bc2a-218004f62b17")
public class VerifySupplierAddRecordSTOFRS extends BasePage
{
	public VerifySupplierAddRecordSTOFRS (WebDriver driver)
	{
		super(driver);
	}


	
	//private By ExpenditureTABElem = By.xpath("//A[@href='../AccountUI/SupplierBill.aspx?FYCode=52552&CompanyCode=13326']");
	private By ExpenditureTABElem = By.xpath("//span[contains(text(), 'Expenditure')]");
	private By RecordClickElem = By.xpath("//A[@id='ctl00_cPH_rptrDisplayRecords_ctl00_lnkTranDetail']");

	private By RecordCloseElem = By.xpath("//BUTTON[@id='EditPopUpClose']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/AccountUI/SupplierBill.aspx?FYCode=52552&CompanyCode=13326");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AccountUI/SupplierBill.aspx?FYCode=52552&CompanyCode=13326");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AccountUI/SupplierBill.aspx?FYCode=52552&CompanyCode=13326");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AccountUI/SupplierBill.aspx?FYCode=52552&CompanyCode=13326";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AccountUI/SupplierBill.aspx?FYCode=52552&CompanyCode=13326")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click ExpenditureTAB
     * @name Click ExpenditureTAB
     */
	public void Click_ExpenditureTAB()
	{
        
		WebElement elem = getWebElement(ExpenditureTABElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ExpenditureTAB", "Click_ExpenditureTAB failed. Unable to locate object: " + ExpenditureTABElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ExpenditureTAB", "Click_ExpenditureTAB failed. Unable to locate object: " + ExpenditureTABElem.toString());

			Assert.fail("Unable to locate object: " + ExpenditureTABElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_ExpenditureTAB");

		TestModellerLogger.PassStep(m_Driver, "Click_ExpenditureTAB");
	}

     
	/**
 	 * Click RecordClick
	 * @throws InterruptedException 
	 * @throws AWTException 
	 * @throws IOException 
	 * @throws HeadlessException 
     * @name Click RecordClick
     */
	public void Click_RecordClick() throws InterruptedException, HeadlessException, IOException, AWTException
	{
		int rowcount = m_Driver.findElements(By.xpath("//*[@id='ctl00_cPH_divfiltrec']/div/div/table/tbody/tr")).size();
		System.out.println(rowcount);
	
		for(int i=1; i<rowcount; i++)
		{
			//int j=i-1;
			System.out.println("Hi loop"+i);
			
			WebElement dd= m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_divfiltrec']/div/div/table/tbody/tr["+ i +"]/td[5]"));

			String str =dd.getText();
			String str1 ="Post";
			str1=str1+str;
			System.out.println("ÏnvoiceNO"+str1);
//		System.out.println("Ïnn"+inno);
//			System.out.println("2i"+i);
//		if(inno.equalsIgnoreCase(str))
//		{
			//jsExec.executeScript("arguments[0].scrollIntoView(true);",  m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_filtrec']/div/div/table/tbody/tr["+ i +"]/td[2]")));
						String st= m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_divfiltrec']/div/div/table/tbody/tr["+ i +"]/td[2]")).getText();
						Thread.sleep(1500);
						m_Driver.findElement(By.xpath("//a[text()=" +st+ "]")).click();
						Screenshotcapture.captureAsImage(m_Driver, str1);
						m_Driver.findElement(By.xpath("//*[@id='EditPopUpClose']/span")).click();
						jsExec.executeScript("arguments[0].scrollIntoView(true);",  m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_divfiltrec']/div/div/table/tbody/tr["+ i +"]/td[2]")));
						//*[@id="EditPopUpClose"]/span
		
			}
			
		WebElement elem = getWebElement(RecordClickElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_RecordClick", "Click_RecordClick failed. Unable to locate object: " + RecordClickElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_RecordClick", "Click_RecordClick failed. Unable to locate object: " + RecordClickElem.toString());

			Assert.fail("Unable to locate object: " + RecordClickElem.toString());
        }

		//elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_RecordClick");

		TestModellerLogger.PassStep(m_Driver, "Click_RecordClick");
	}

     
	/**
 	 * Click RecordClose
     * @name Click RecordClose
     */
	public void Click_RecordClose()
	{
        
		WebElement elem = getWebElement(RecordCloseElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_RecordClose", "Click_RecordClose failed. Unable to locate object: " + RecordCloseElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_RecordClose", "Click_RecordClose failed. Unable to locate object: " + RecordCloseElem.toString());

			Assert.fail("Unable to locate object: " + RecordCloseElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_RecordClose");

		TestModellerLogger.PassStep(m_Driver, "Click_RecordClose");
	}
}