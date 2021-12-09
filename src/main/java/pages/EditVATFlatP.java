package pages;

import pages.BasePage;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/61be657a-a2a0-4bef-b25d-93055a00b102
@TestModellerModule(guid = "61be657a-a2a0-4bef-b25d-93055a00b102")
public class EditVATFlatP extends BasePage
{
	public EditVATFlatP (WebDriver driver)
	{
		super(driver);
	}


	
	private By SettingsTABElem = By.xpath("/html/body/form/main/div[11]/div[2]/ul/li[12]/a");

	private By VATTABElem = By.xpath("//SPAN[@id='__tab_ctl00_cPH_tbContainer_TbVat']");

	private By EditButtonElem = By.xpath("//A[@id='ctl00_cpHeaderRight_btnEdit']");

	private By EditButton2Elem = By.xpath("//A[@id='ctl00_cPH_tbContainer_TbVat_rptrVATStatus_ctl00_hrefEditVAT']");

	//private By VATStatusElem = By.xpath("//SELECT[@name='ctl00$cPH$ddVATStatus']");
	
	private By VATStatusElem = By.xpath("//*[@id='ctl00_cPH_ddVATStatus']");

	private By DateElem = By.xpath("//INPUT[@name='ctl00$cPH$txtDate']");

	private By UseDefaultRateElem = By.xpath("//INPUT[@id='ctl00_cPH_chkUseDefaultRate']");
	

	//private By OverrideFLATRateElem = By.xpath("//INPUT[@name='ctl00$cPH$txtRate']");
	
//	private By OverrideFLATRateElem = By.id("ctl00_cPH_chkUseDefaultRate");
	private By OverrideFLATRateElem = By.id("ctl00_cPH_txtRate");
	
	////*[@id="ctl00_cPH_txtRate"]

	private By SaveButtonElem = By.xpath("//A[@id='ctl00_cphFooter_btnSave']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/AgentUI/Company.aspx");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AgentUI/Company.aspx");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AgentUI/Company.aspx");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AgentUI/Company.aspx";
        

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AgentUI/Company.aspx")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click SettingsTAB
     * @name Click SettingsTAB
     */
	public void Click_SettingsTAB()
	{
        
		WebElement elem = getWebElement(SettingsTABElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SettingsTAB", "Click_SettingsTAB failed. Unable to locate object: " + SettingsTABElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SettingsTAB", "Click_SettingsTAB failed. Unable to locate object: " + SettingsTABElem.toString());

			Assert.fail("Unable to locate object: " + SettingsTABElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_SettingsTAB");

		TestModellerLogger.PassStep(m_Driver, "Click_SettingsTAB");
	}

     
	/**
 	 * Click VATTAB
     * @name Click VATTAB
     */
	public void Click_VATTAB()
	{
        
		WebElement elem = getWebElement(VATTABElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_VATTAB", "Click_VATTAB failed. Unable to locate object: " + VATTABElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_VATTAB", "Click_VATTAB failed. Unable to locate object: " + VATTABElem.toString());

			Assert.fail("Unable to locate object: " + VATTABElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_VATTAB");

		TestModellerLogger.PassStep(m_Driver, "Click_VATTAB");
	}

     
	/**
 	 * Click EditButton
     * @name Click EditButton
     */
	public void Click_EditButton()
	{
        
		WebElement elem = getWebElement(EditButtonElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_EditButton", "Click_EditButton failed. Unable to locate object: " + EditButtonElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_EditButton", "Click_EditButton failed. Unable to locate object: " + EditButtonElem.toString());

			Assert.fail("Unable to locate object: " + EditButtonElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_EditButton");

		TestModellerLogger.PassStep(m_Driver, "Click_EditButton");
	}

     
	/**
 	 * Click EditButton2
     * @name Click EditButton2
     */
	public void Click_EditButton2()
	{
        
		WebElement elem = getWebElement(EditButton2Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_EditButton2", "Click_EditButton2 failed. Unable to locate object: " + EditButton2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_EditButton2", "Click_EditButton2 failed. Unable to locate object: " + EditButton2Elem.toString());

			Assert.fail("Unable to locate object: " + EditButton2Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_EditButton2");

		TestModellerLogger.PassStep(m_Driver, "Click_EditButton2");
	}

    
	/**
 	 * Select VATStatus
     * @name Select VATStatus
     */
    public void Select_VATStatus(String VATStatus)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[6]/div/div/div/div[2]/div[2]/div/div/div/div[4]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(VATStatusElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_VATStatus", "Select_VATStatus failed. Unable to locate object: " + VATStatusElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_VATStatus", "Select_VATStatus failed. Unable to locate object: " + VATStatusElem.toString());

 			Assert.fail("Unable to locate object: " + VATStatusElem.toString());
         }
 		elem.click();
 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(VATStatus);
 		
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_VATStatus " + VATStatus);

 		TestModellerLogger.PassStep(m_Driver, "Select_VATStatus " + VATStatus);
 	}

      
	/**
 	 * Enter Date
     * @name Enter Date
     */
 	public void Enter_Date(String Date)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[6]/div/div/div/div[2]/div[2]/div/div/div/div[4]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(DateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Date", "Enter_Date failed. Unable to locate object: " + DateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Date", "Enter_Date failed. Unable to locate object: " + DateElem.toString());

 			Assert.fail("Unable to locate object: " + DateElem.toString());
         }

 		elem.sendKeys(Date);
 		elem.sendKeys(Keys.TAB);
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Date " + Date);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Date " + Date);
 	}

     
	/**
 	 * Click UseDefaultRate
	 * @throws InterruptedException 
     * @name Click UseDefaultRate
     */
	public void Click_UseDefaultRate() throws InterruptedException
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[6]/div/div/div/div[2]/div[2]/div/div/div/div[4]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(UseDefaultRateElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_UseDefaultRate", "Click_UseDefaultRate failed. Unable to locate object: " + UseDefaultRateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_UseDefaultRate", "Click_UseDefaultRate failed. Unable to locate object: " + UseDefaultRateElem.toString());

			Assert.fail("Unable to locate object: " + UseDefaultRateElem.toString());
        }
		Thread.sleep(1000);
		
		
		
		
		WebElement op=m_Driver.findElement(By.xpath("//input[@name='ctl00$cPH$chkUseDefaultRate']"));
		//WebElement chk=m_Driver.findElement(By.xpath("//*[@checked='checked']")).
//		System.out.println(op.isSelected());
		boolean a=op.isSelected();
		
		if (true==a)
		{
			 op.click();
		}
	     if(false==a)
	     {
	    	 System.out.println("ok");
	     }
	      
	      
	      
	      
	      
	    //*[@id="ctl00_cPH_chkUseDefaultRate"][@checked="checked"]
	      
	      
		
//		System.out.println(op.isSelected());
		
//		if(op.)
//		{
//			System.out.println("on");
//		}
//		else
//		{
//			op.click();
//			System.out.println("ok");
//		}

		//elem.click();
		//m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_chkUseDefaultRate']")).click();
		//jsExec.executeScript("arguments[0].click();", elem);
		//*[@id="ctl00_cPH_chkUseDefaultRate"]
	   m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_UseDefaultRate");

		TestModellerLogger.PassStep(m_Driver, "Click_UseDefaultRate");
	}

      
	/**
 	 * Enter OverrideFLATRate
     * @name Enter OverrideFLATRate
     */
 	public void Enter_OverrideFLATRate(String OverrideFLATRate)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[6]/div/div/div/div[2]/div[2]/div/div/div/div[4]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(OverrideFLATRateElem);
 			
 		System.out.println("123"+OverrideFLATRate);
 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_OverrideFLATRate", "Enter_OverrideFLATRate failed. Unable to locate object: " + OverrideFLATRateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_OverrideFLATRate", "Enter_OverrideFLATRate failed. Unable to locate object: " + OverrideFLATRateElem.toString());

 			Assert.fail("Unable to locate object: " + OverrideFLATRateElem.toString());
         }
 		elem.clear();
 		//elem.sendKeys(Keys.BACK_SPACE);
 		//elem.sendKeys(OverrideFLATRate);
 		//elem.clear();
 		elem.sendKeys(OverrideFLATRate);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_OverrideFLATRate " + OverrideFLATRate);

  		TestModellerLogger.PassStep(m_Driver, "Enter_OverrideFLATRate " + OverrideFLATRate);
 	}

     
	/**
 	 * Click SaveButton
	 * @throws AWTException 
	 * @throws IOException 
	 * @throws HeadlessException 
     * @name Click SaveButton
     */
	public void Click_SaveButton() throws HeadlessException, IOException, AWTException
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[6]/div/div/div/div[2]/div[2]/div/div/div/div[4]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(SaveButtonElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SaveButton", "Click_SaveButton failed. Unable to locate object: " + SaveButtonElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SaveButton", "Click_SaveButton failed. Unable to locate object: " + SaveButtonElem.toString());

			Assert.fail("Unable to locate object: " + SaveButtonElem.toString());
        }
		Screenshotcapture.captureAsImage(m_Driver, "VATTypeBefore");
		elem.click();
		ClientSelect c = new ClientSelect(m_Driver);
		String client = c.client1();
		String savnew=client+"VATTypeBefore";
		Screenshotcapture.captureAsImage(m_Driver, savnew);
		//Screenshotcapture.captureAsImage(m_Driver, "VATTypeBefore");
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_SaveButton");

		TestModellerLogger.PassStep(m_Driver, "Click_SaveButton");
	}
}