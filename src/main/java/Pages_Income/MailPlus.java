package Pages_Income;

import pages.BasePage;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.IOException;
import java.util.List;

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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/eb994b4f-40dd-4a3b-b6f2-d4660cf6fd73
@TestModellerModule(guid = "eb994b4f-40dd-4a3b-b6f2-d4660cf6fd73")
public class MailPlus extends BasePage
{
	public MailPlus (WebDriver driver)
	{
		super(driver);
	}

	List<WebElement>list;
	List<WebElement>list2;
	
	private By Plus_SignElem = By.xpath("//*[@id='ctl00_cPH_Panel1']");

	private By InvoiceTemplateElem = By.xpath("//SELECT[@name='ctl00$cPH$ddInvoiceTemplate']");

	private By HeaderLine1Elem = By.xpath("//INPUT[@name='ctl00$cPH$txtHeaderLine1']");

	private By HeaderLine2Elem = By.xpath("//INPUT[@name='ctl00$cPH$txtHeaderLine2']");

	private By FooterLine1Elem = By.xpath("//INPUT[@name='ctl00$cPH$txtFooterLine1']");

	private By FooterLine2Elem = By.xpath("//INPUT[@name='ctl00$cPH$txtFooterLine2']");

	private By ValidTagsElem = By.xpath("//DIV[@class='form-horizontal el-selection']");

	private By SaveButtonElem = By.xpath("//A[@id='ctl00_cphFooter_btnSave']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=117008&CompanyCode=16685&IsFirstRequest=1");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=117008&CompanyCode=16685&IsFirstRequest=1");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=117008&CompanyCode=16685&IsFirstRequest=1");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=117008&CompanyCode=16685&IsFirstRequest=1";

        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=117008&CompanyCode=16685&IsFirstRequest=1")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click Plus_Sign
	 * @throws InterruptedException 
     * @name Click Plus_Sign
     */
	public void Click_Plus_Sign() throws InterruptedException
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[5]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(Plus_SignElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Plus_Sign", "Click_Plus_Sign failed. Unable to locate object: " + Plus_SignElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Plus_Sign", "Click_Plus_Sign failed. Unable to locate object: " + Plus_SignElem.toString());

			Assert.fail("Unable to locate object: " + Plus_SignElem.toString());
        }
Thread.sleep(2000);
		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_Plus_Sign");

		TestModellerLogger.PassStep(m_Driver, "Click_Plus_Sign");
	}

    
	/**
 	 * Select InvoiceTemplate
     * @name Select InvoiceTemplate
     */
    public void Select_InvoiceTemplate(String InvoiceTemplate)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[5]/div/div/div[2]/iframe")));

		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/div[3]/div[2]/div[2]/div/div[1]/div[2]/div/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(InvoiceTemplateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_InvoiceTemplate", "Select_InvoiceTemplate failed. Unable to locate object: " + InvoiceTemplateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_InvoiceTemplate", "Select_InvoiceTemplate failed. Unable to locate object: " + InvoiceTemplateElem.toString());

 			Assert.fail("Unable to locate object: " + InvoiceTemplateElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(InvoiceTemplate);
 		
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_InvoiceTemplate " + InvoiceTemplate);

 		TestModellerLogger.PassStep(m_Driver, "Select_InvoiceTemplate " + InvoiceTemplate);
 	}

      
	/**
 	 * Enter HeaderLine1
     * @name Enter HeaderLine1
     */
 	public void Enter_HeaderLine1(String HeaderLine1)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[5]/div/div/div[2]/iframe")));

		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/div[3]/div[2]/div[2]/div/div[1]/div[2]/div/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(HeaderLine1Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_HeaderLine1", "Enter_HeaderLine1 failed. Unable to locate object: " + HeaderLine1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_HeaderLine1", "Enter_HeaderLine1 failed. Unable to locate object: " + HeaderLine1Elem.toString());

 			Assert.fail("Unable to locate object: " + HeaderLine1Elem.toString());
         }

 		elem.sendKeys(HeaderLine1);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_HeaderLine1 " + HeaderLine1);

  		TestModellerLogger.PassStep(m_Driver, "Enter_HeaderLine1 " + HeaderLine1);
 	}

      
	/**
 	 * Enter HeaderLine2
     * @name Enter HeaderLine2
     */
 	public void Enter_HeaderLine2(String HeaderLine2)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[5]/div/div/div[2]/iframe")));

		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/div[3]/div[2]/div[2]/div/div[1]/div[2]/div/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(HeaderLine2Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_HeaderLine2", "Enter_HeaderLine2 failed. Unable to locate object: " + HeaderLine2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_HeaderLine2", "Enter_HeaderLine2 failed. Unable to locate object: " + HeaderLine2Elem.toString());

 			Assert.fail("Unable to locate object: " + HeaderLine2Elem.toString());
         }

 		elem.sendKeys(HeaderLine2);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_HeaderLine2 " + HeaderLine2);

  		TestModellerLogger.PassStep(m_Driver, "Enter_HeaderLine2 " + HeaderLine2);
 	}

      
	/**
 	 * Enter FooterLine1
     * @name Enter FooterLine1
     */
 	public void Enter_FooterLine1(String FooterLine1)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[5]/div/div/div[2]/iframe")));

		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/div[3]/div[2]/div[2]/div/div[1]/div[2]/div/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(FooterLine1Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_FooterLine1", "Enter_FooterLine1 failed. Unable to locate object: " + FooterLine1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_FooterLine1", "Enter_FooterLine1 failed. Unable to locate object: " + FooterLine1Elem.toString());

 			Assert.fail("Unable to locate object: " + FooterLine1Elem.toString());
         }

 		elem.sendKeys(FooterLine1);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_FooterLine1 " + FooterLine1);

  		TestModellerLogger.PassStep(m_Driver, "Enter_FooterLine1 " + FooterLine1);
 	}

      
	/**
 	 * Enter FooterLine2
     * @name Enter FooterLine2
     */
 	public void Enter_FooterLine2(String FooterLine2)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[5]/div/div/div[2]/iframe")));

		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/div[3]/div[2]/div[2]/div/div[1]/div[2]/div/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(FooterLine2Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_FooterLine2", "Enter_FooterLine2 failed. Unable to locate object: " + FooterLine2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_FooterLine2", "Enter_FooterLine2 failed. Unable to locate object: " + FooterLine2Elem.toString());

 			Assert.fail("Unable to locate object: " + FooterLine2Elem.toString());
         }

 		elem.sendKeys(FooterLine2);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_FooterLine2 " + FooterLine2);

  		TestModellerLogger.PassStep(m_Driver, "Enter_FooterLine2 " + FooterLine2);
 	}

     
	/**
 	 * Click ValidTags
     * @name Click ValidTags
     */
	public void Click_ValidTags()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[5]/div/div/div[2]/iframe")));

		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/div[3]/div[2]/div[2]/div/div[1]/div[2]/div/div[2]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(ValidTagsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ValidTags", "Click_ValidTags failed. Unable to locate object: " + ValidTagsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ValidTags", "Click_ValidTags failed. Unable to locate object: " + ValidTagsElem.toString());

			Assert.fail("Unable to locate object: " + ValidTagsElem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_ValidTags");

		TestModellerLogger.PassStep(m_Driver, "Click_ValidTags");
	}

     
	/**
 	 * Click SaveButton
     * @name Click SaveButton
     */
	public void Click_SaveButton()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[5]/div/div/div[2]/iframe")));

		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/div[3]/div[2]/div[2]/div/div[1]/div[2]/div/div[2]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(SaveButtonElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SaveButton", "Click_SaveButton failed. Unable to locate object: " + SaveButtonElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SaveButton", "Click_SaveButton failed. Unable to locate object: " + SaveButtonElem.toString());

			Assert.fail("Unable to locate object: " + SaveButtonElem.toString());
        }
  	jsExec.executeScript("arguments[0].scrollIntoView(true);", elem);
		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_SaveButton");

		TestModellerLogger.PassStep(m_Driver, "Click_SaveButton");
	}


	public void plusSignPopup() throws InterruptedException, HeadlessException, IOException, AWTException {
		
		Thread.sleep(2000);
		Screenshotcapture.captureAsImage(m_Driver, "plusSignPopup");  	
	}
	
	
	
	public void SelectTemplate(String TempName) throws InterruptedException
	
	{
		
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[5]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(Plus_SignElem);
		
		 elem.click();
		
		 m_Driver.switchTo().defaultContent();
		 
		 
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[5]/div/div/div[2]/iframe")));

		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/div[3]/div[2]/div[2]/div/div[1]/div[2]/div/div[2]/div/div/div[2]/iframe")));
		
		WebElement SelectTemp=m_Driver.findElement(By.xpath("//select[@id='ctl00_cPH_ddInvoiceTemplate']"));
		
	    Select dropdown = new Select(SelectTemp);

	     dropdown.selectByVisibleText(TempName);
     	//System.out.println(a[p]);
	     
	    WebElement SaveBtn= m_Driver.findElement(By.xpath("//*[@id='ctl00_cphFooter_btnSave']"));
	     
		jsExec.executeScript("arguments[0].scrollIntoView(true);", SaveBtn);
		SaveBtn.click();
		Thread.sleep(4000);
      m_Driver.switchTo().defaultContent();
		
		
//		int p=1;
//	String out="";
//	
//	m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[5]/div/div/div[2]/iframe")));
//
//	WebElement elem = getWebElement(Plus_SignElem);
//	
//	 elem.click();
//	
//	 m_Driver.switchTo().defaultContent();
//	 
//	 
//	m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[5]/div/div/div[2]/iframe")));
//
//	m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/div[3]/div[2]/div[2]/div/div[1]/div[2]/div/div[2]/div/div/div[2]/iframe")));
//
//	
//		
//	
//	
//	
//	list=m_Driver.findElements(By.xpath("//*[@id='ctl00_cPH_ddInvoiceTemplate']/option"));
//		int size=list.size();
//		System.out.println(size);
//		for(int k=0;k<size;k++)
//		{
//			out=out+"-"+list.get(k).getText();
//		}
//		
//		String[]a=out.split("-");
//		for(int i=0;i<size;i++)
//		{
//			
//			if(i!=0)
//			{
//				m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[5]/div/div/div[2]/iframe")));
//
//				WebElement elem1 = getWebElement(Plus_SignElem);
//				
//				 elem1.click();
//			Thread.sleep(2000);	 
//				 m_Driver.switchTo().defaultContent();
//				 
//					m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[5]/div/div/div[2]/iframe")));
//
//					m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/div[3]/div[2]/div[2]/div/div[1]/div[2]/div/div[2]/div/div/div[2]/iframe")));
//				
//			}
//			
//			
//		//	list=m_Driver.findElements(By.xpath("//*[@id='ctl00_cPH_ddInvoiceTemplate']/option"));
//			//String temp=list.get(i).getText();
//			WebElement SelectTemp=m_Driver.findElement(By.xpath("//select[@id='ctl00_cPH_ddInvoiceTemplate']"));
//					
//		    Select dropdown = new Select(SelectTemp);
//
//		     dropdown.selectByVisibleText(a[p]);
//	     	System.out.println(a[p]);
//		     
//		    WebElement SaveBtn= m_Driver.findElement(By.xpath("//*[@id='ctl00_cphFooter_btnSave']"));
//		     
//			jsExec.executeScript("arguments[0].scrollIntoView(true);", SaveBtn);
//			SaveBtn.click();
//			Thread.sleep(2000);
//	      m_Driver.switchTo().defaultContent();
//       p++;
//	
//	
//	
//		}
	
	}
public void SelectTemplateAll() throws InterruptedException
	
	{
		int k=0;
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[5]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(Plus_SignElem);
		
		 elem.click();
		
		 m_Driver.switchTo().defaultContent();
		 
		 
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[5]/div/div/div[2]/iframe")));

		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/div[3]/div[2]/div[2]/div/div[1]/div[2]/div/div[2]/div/div/div[2]/iframe")));
		
		
		List<WebElement>list=m_Driver.findElements(By.xpath("//*[@id='ctl00_cPH_ddInvoiceTemplate']/option"));
		int size=list.size();
		
		if(size!=0)
		{
			for(int j=0;j<=size;j++)
			{
			
				 
	
				
				List<WebElement>list2=m_Driver.findElements(By.xpath("//*[@id='ctl00_cPH_ddInvoiceTemplate']/option"));;//List of Email formet
				
				WebElement SelectTemp=m_Driver.findElement(By.xpath("//select[@id='ctl00_cPH_ddInvoiceTemplate']"));// Select any email formet
				
			    Select dropdown = new Select(SelectTemp);

			     dropdown.selectByVisibleText(list2.get(j).getText());
		     	//System.out.println(a[p]);
			     
			    WebElement SaveBtn= m_Driver.findElement(By.xpath("//*[@id='ctl00_cphFooter_btnSave']"));
			     
				jsExec.executeScript("arguments[0].scrollIntoView(true);", SaveBtn);
				SaveBtn.click();
				Thread.sleep(2000);
		            m_Driver.switchTo().defaultContent();
		            
		        if(j!=size-1)
		        {
		        	m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[5]/div/div/div[2]/iframe")));

					WebElement elem2 = getWebElement(Plus_SignElem);
					
					 elem2.click();
					
					 m_Driver.switchTo().defaultContent();
					      m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[5]/div/div/div[2]/iframe")));

						m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/div[3]/div[2]/div[2]/div/div[1]/div[2]/div/div[2]/div/div/div[2]/iframe")));
						
						break;
		        }
					 
			}
			
		}
	
	}

	public void SendEmail(String EmailID,String TempName2) throws InterruptedException
	{
		
		
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[5]/div/div/div[2]/iframe")));
		
		
		WebElement Selecttemp=m_Driver.findElement(By.xpath("//select[@id='ctl00_cPH_ddlTemplate']"));
		
		 Select dropdown = new Select(Selecttemp);

	     dropdown.selectByVisibleText(TempName2);
	   //  System.out.println(a[p]);
	     Thread.sleep(2000);
	     m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_chkMarkMySelf']")).click();
	     m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_txtEmail']")).sendKeys(EmailID);
	     m_Driver.findElement(By.xpath("//*[@id='ctl00_cphFooter_btnSave']")).click();
	     Thread.sleep(2000);
	    
	utilities.Screenshotcapture.Getscreenshot("Success! Your email is in a queue to be sent", "Sales Dashboard");
	m_Driver.switchTo().defaultContent();
//	m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[5]/div/div/div[2]/iframe")));
	 WebElement CancelBtn=m_Driver.findElement(By.xpath("//*[@id='AddCustomerModalCenter']/div/div/div/button"));
	 jsExec.executeScript("arguments[0].click();",CancelBtn );
//	p++;
	//	m_Driver.switchTo().defaultContent();
	 m_Driver.navigate().refresh();
	Thread.sleep(2000);
		
		
		
		
		
		
//		int p=1;
//		String out="";
//		System.out.println("Send Email");
//		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[5]/div/div/div[2]/iframe")));
//		list2=m_Driver.findElements(By.xpath("//*[@id='ctl00_cPH_ddlTemplate']/option"));
//		int Size=list2.size();
//		System.out.println(Size);
//		
//		for(int k=0;k<Size;k++)
//		{
//			out=out+"-"+list2.get(k).getText();
//		}
//		String[]a=out.split("-");
//		
//		for(int i=0;i<Size;i++)
//		{
//			
//			if(i!=0)
//			{
//				Thread.sleep(3000);
//				m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrDisplayRecords_ctl00_lnkSend']/i")).click();
//				m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[5]/div/div/div[2]/iframe")));
//				Thread.sleep(2000);
//			}
//	
//		
//			
//		//	list2=m_Driver.findElements(By.xpath("//*[@id='ctl00_cPH_ddlTemplate']/option"));
//		//	String temp=list2.get(i).getText();
//			WebElement Selecttemp=m_Driver.findElement(By.xpath("//select[@id='ctl00_cPH_ddlTemplate']"));
//			
//			 Select dropdown = new Select(Selecttemp);
//
//		     dropdown.selectByVisibleText(a[p]);
//		     System.out.println(a[p]);
//		     m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_chkMarkMySelf']")).click();
//		     m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_txtEmail']")).sendKeys(EmailID);
//		     m_Driver.findElement(By.xpath("//*[@id='ctl00_cphFooter_btnSave']")).click();
//		     Thread.sleep(2000);
//		    
//		utilities.Screenshotcapture.Getscreenshot("Success! Your email is in a queue to be sent"+i, "Sales Dashboard");
//		m_Driver.switchTo().defaultContent();
//	//	m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[5]/div/div/div[2]/iframe")));
//		 WebElement CancelBtn=m_Driver.findElement(By.xpath("//*[@id='AddCustomerModalCenter']/div/div/div/button"));
//		 jsExec.executeScript("arguments[0].click();",CancelBtn );
//		p++;
//		//	m_Driver.switchTo().defaultContent();
//		Thread.sleep(2000);
//		
//		//m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrDisplayRecords_ctl00_lnkSend']/i")).click();
//		//*[@id="ctl00_cPH_ddlTemplate"]/option
//		}
//		
	}
	
	public void SendEmail2(String EmailID) throws InterruptedException
	{
		
		
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[5]/div/div/div[2]/iframe")));
		
		
		WebElement Selecttemp=m_Driver.findElement(By.xpath("//select[@id='ctl00_cPH_ddlTemplate']"));
		
		 Select dropdown = new Select(Selecttemp);

	     dropdown.selectByVisibleText("Custom Template #9");
	   //  System.out.println(a[p]);
	     m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_chkMarkMySelf']")).click();
	     m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_txtEmail']")).sendKeys(EmailID);
	     m_Driver.findElement(By.xpath("//*[@id='ctl00_cphFooter_btnSave']")).click();
	     Thread.sleep(2000);
	    
	utilities.Screenshotcapture.Getscreenshot("Success! Your email is in a queue to be sent", "Other Invoice Template");
	m_Driver.switchTo().defaultContent();
//	m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[5]/div/div/div[2]/iframe")));
	 WebElement CancelBtn=m_Driver.findElement(By.xpath("//*[@id='AddCustomerModalCenter']/div/div/div/button"));
	 jsExec.executeScript("arguments[0].click();",CancelBtn );
//	p++;
	//	m_Driver.switchTo().defaultContent();
	Thread.sleep(2000);
	
	
	
	
	}
	
	
	public void SendEmail3(String EmailID) throws InterruptedException
	{
		
		
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[5]/div/div/div[2]/iframe")));
		
		
		WebElement Selecttemp=m_Driver.findElement(By.xpath("//select[@id='ctl00_cPH_ddlTemplate']"));
		
		 Select dropdown = new Select(Selecttemp);

	     dropdown.selectByVisibleText("Custom Template #9");
	   //  System.out.println(a[p]);
	     m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_chkMarkMySelf']")).click();
	     m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_txtEmail']")).sendKeys(EmailID);
	  //   m_Driver.findElement(By.xpath("//*[@id='ctl00_cphFooter_btnSave']")).click();
	    
	   
	   
	    
	
	
	m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_cPH_txtBody_ctl02_ctl00']")));
	WebElement body= m_Driver.findElement(By.xpath("/html/body"));
    body.clear();
    body.sendKeys("This Text Body use For Testing");
    Thread.sleep(3000);
    m_Driver.switchTo().defaultContent();
    utilities.Screenshotcapture.Getscreenshot("Email Functionality should work Properly", "Other Invoice Template");
    
//	m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[5]/div/div/div[2]/iframe")));
	// WebElement CancelBtn=m_Driver.findElement(By.xpath("//*[@id='AddCustomerModalCenter']/div/div/div/button"));
	// jsExec.executeScript("arguments[0].click();",CancelBtn );
//	p++;
	//	m_Driver.switchTo().defaultContent();
//	Thread.sleep(2000);
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
}