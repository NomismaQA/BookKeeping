package Pages_Income;

import pages.BasePage;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/71292d8f-e05f-496a-8301-f1611e96786d
@TestModellerModule(guid = "71292d8f-e05f-496a-8301-f1611e96786d")
public class selectionfordashboard extends BasePage
{
	public selectionfordashboard (WebDriver driver)
	{
		super(driver);
	}


	
	private By selectCustomerElem = By.xpath("//label[normalize-space()= 'Customer:']/../div/select");

	private By SearchcategoryElem = By.xpath("//label[normalize-space()= 'Search Category:']/../div/select");

	private By Select_All_Elem = By.xpath("//BUTTON[@title='UnPaid, Paid, Partially Paid']");

	private By Due_StatusElem = By.xpath("//SELECT[@name='ctl00$cPHFilter$dd_due']");

	private By DateFromElem = By.xpath("//INPUT[@name='ctl00$cPHFilter$txtDateFrom']");

	private By DateToElem = By.xpath("//INPUT[@name='ctl00$cPHFilter$txtDateTo']");

	private By Update_Elem = By.xpath("//label[normalize-space()= '']/../div/a");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=116991&CompanyCode=16668&IsFirstRequest=1");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=116991&CompanyCode=16668&IsFirstRequest=1");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=116991&CompanyCode=16668&IsFirstRequest=1");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=116991&CompanyCode=16668&IsFirstRequest=1";

        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=116991&CompanyCode=16668&IsFirstRequest=1")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

    
	/**
 	 * Select selectCustomer
     * @name Select selectCustomer
     */
    public void Select_selectCustomer(String selectCustomer)
 	{
 	    
 		WebElement elem = getWebElement(selectCustomerElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_selectCustomer", "Select_selectCustomer failed. Unable to locate object: " + selectCustomerElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_selectCustomer", "Select_selectCustomer failed. Unable to locate object: " + selectCustomerElem.toString());

 			Assert.fail("Unable to locate object: " + selectCustomerElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(selectCustomer);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_selectCustomer " + selectCustomer);

 		TestModellerLogger.PassStep(m_Driver, "Select_selectCustomer " + selectCustomer);
 	}

    
	/**
 	 * Select Searchcategory
     * @name Select Searchcategory
     */
    public void Select_Searchcategory(String Searchcategory)
 	{
 	    
 		WebElement elem = getWebElement(SearchcategoryElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Searchcategory", "Select_Searchcategory failed. Unable to locate object: " + SearchcategoryElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Searchcategory", "Select_Searchcategory failed. Unable to locate object: " + SearchcategoryElem.toString());

 			Assert.fail("Unable to locate object: " + SearchcategoryElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Searchcategory);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Searchcategory " + Searchcategory);

 		TestModellerLogger.PassStep(m_Driver, "Select_Searchcategory " + Searchcategory);
 	}

     
	/**
 	 * Click Select All 
     * @name Click Select All 
     */
	public void Click_Select_All_()
	{
        
		WebElement elem = getWebElement(Select_All_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Select_All_", "Click_Select_All_ failed. Unable to locate object: " + Select_All_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Select_All_", "Click_Select_All_ failed. Unable to locate object: " + Select_All_Elem.toString());

			Assert.fail("Unable to locate object: " + Select_All_Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Select_All_");

		TestModellerLogger.PassStep(m_Driver, "Click_Select_All_");
	}

    
	/**
 	 * Select Due_Status
     * @name Select Due_Status
     */
    public void Select_Due_Status(String Due_Status)
 	{
 	    
 		WebElement elem = getWebElement(Due_StatusElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Due_Status", "Select_Due_Status failed. Unable to locate object: " + Due_StatusElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Due_Status", "Select_Due_Status failed. Unable to locate object: " + Due_StatusElem.toString());

 			Assert.fail("Unable to locate object: " + Due_StatusElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Due_Status);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Due_Status " + Due_Status);

 		TestModellerLogger.PassStep(m_Driver, "Select_Due_Status " + Due_Status);
 	}

      
	/**
 	 * Enter DateFrom
     * @name Enter DateFrom
     */
 	public void Enter_DateFrom(String DateFrom)
 	{
 	    
 		WebElement elem = getWebElement(DateFromElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_DateFrom", "Enter_DateFrom failed. Unable to locate object: " + DateFromElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_DateFrom", "Enter_DateFrom failed. Unable to locate object: " + DateFromElem.toString());

 			Assert.fail("Unable to locate object: " + DateFromElem.toString());
         }
 		for(int i=0;i<10;i++)
 		{
 			elem.sendKeys(Keys.BACK_SPACE);
 		}
 		elem.sendKeys(DateFrom);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_DateFrom " + DateFrom);

  		TestModellerLogger.PassStep(m_Driver, "Enter_DateFrom " + DateFrom);
 	}

      
	/**
 	 * Enter DateTo
     * @name Enter DateTo
     */
 	public void Enter_DateTo(String DateTo)
 	{
 	    
 		WebElement elem = getWebElement(DateToElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_DateTo", "Enter_DateTo failed. Unable to locate object: " + DateToElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_DateTo", "Enter_DateTo failed. Unable to locate object: " + DateToElem.toString());

 			Assert.fail("Unable to locate object: " + DateToElem.toString());
         }

 		for(int i=0;i<10;i++)
 		{
 			elem.sendKeys(Keys.BACK_SPACE);
 		}
 		elem.sendKeys(DateTo);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_DateTo " + DateTo);

  		TestModellerLogger.PassStep(m_Driver, "Enter_DateTo " + DateTo);
 	}

     
	/**
 	 * Click Update 
	 * @throws InterruptedException 
     * @name Click Update 
     */
	public void Click_Update_() throws InterruptedException
	{
        
		WebElement elem = getWebElement(Update_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Update_", "Click_Update_ failed. Unable to locate object: " + Update_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Update_", "Click_Update_ failed. Unable to locate object: " + Update_Elem.toString());

			Assert.fail("Unable to locate object: " + Update_Elem.toString());
        }

		elem.click();
          	Thread.sleep(3000);

		ExtentReportManager.passStep(m_Driver, "Click_Update_");

		TestModellerLogger.PassStep(m_Driver, "Click_Update_");
	}
	
	public void Customer(String CusName)
	{
		
		WebElement Cus=m_Driver.findElement(By.xpath("//SELECT[@id='ctl00_cPHFilter_ddlCustomer']"));
		Select sl=new Select(Cus);
		sl.selectByVisibleText(CusName);
		
	}
	
	public void VerifyCus(String CusName1)
	{
		List<WebElement>list=m_Driver.findElements(By.xpath("//*[@id='ctl00_cPH_filtrec']/div/div/table/tbody/tr"));
		int size=list.size();
		
		for(int i=1;i<=size-1;i++)
		{
			String CusName=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_filtrec']/div/div/table/tbody/tr["+i+"]/td[6]")).getText();
			Assert.assertEquals(CusName,CusName1 );
	    	
		}
		Reporter.log("Customer verified: "+CusName1);
	}
	
	public void SearchCategory(String CatType,String CatName )
	{
		
	WebElement	CatTY=m_Driver.findElement(By.xpath("//SELECT[@id='ctl00_cPHFilter_dd_Search']"));
		
	Select sl=new Select(CatTY);
	sl.selectByVisibleText(CatType);
	
	WebElement CatNM=m_Driver.findElement(By.xpath("//INPUT[@id='ctl00_cPHFilter_txtSearch']"));
	CatNM.sendKeys(CatName);
	
	
	
	}
	public void VerifySearchCategoryCust(String CusName1)
	{
		List<WebElement>list=m_Driver.findElements(By.xpath("//*[@id='ctl00_cPH_filtrec']/div/div/table/tbody/tr"));
		int size=list.size();
		
		for(int i=1;i<=size-1;i++)
		{
			String CusName=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_filtrec']/div/div/table/tbody/tr["+i+"]/td[6]")).getText();
			Assert.assertEquals(CusName,CusName1 );
	    	
		}
		Reporter.log("Search Category Customer verified: "+CusName1);
	}
	public void VerifySearchCategoryTrnsNO(String TrnsNo)
	{
		List<WebElement>list=m_Driver.findElements(By.xpath("//*[@id='ctl00_cPH_filtrec']/div/div/table/tbody/tr"));
		int size=list.size();
		
		for(int i=1;i>=2;i++)
		{
			String ActualTrnsNo=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_filtrec']/div/div/table/tbody/tr["+i+"]/td[2]")).getText();
			Assert.assertEquals(ActualTrnsNo,TrnsNo );
	    
		}
		Reporter.log("Search Category Trns_No verified: "+TrnsNo);
	}
	public void VerifySearchCategoryInvNO(String InvNo)
	{
		List<WebElement>list=m_Driver.findElements(By.xpath("//*[@id='ctl00_cPH_filtrec']/div/div/table/tbody/tr"));
		int size=list.size();
		
		for(int i=1;i<=size-1;i++)
		{
			String ActualInvNO=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_filtrec']/div/div/table/tbody/tr["+i+"]/td[5]")).getText();
			Assert.assertEquals(ActualInvNO,InvNo );
	    	
		}
		Reporter.log("Search Category Inv_NO verified: "+InvNo);
	}
	public void VerifySearchCategoryType(String type)
	{
		List<WebElement>list=m_Driver.findElements(By.xpath("//*[@id='ctl00_cPH_filtrec']/div/div/table/tbody/tr"));
		int size=list.size();
		
		for(int i=1;i<=size-1;i++)
		{
			String ActualType=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_filtrec']/div/div/table/tbody/tr["+i+"]/td[4]")).getText();
			Assert.assertEquals(ActualType,type );
	    	
		}
		Reporter.log("Search Category Type verified: "+type);
	}
	
	
	
	public void PaymentStatus(String PaySta)
	{
		m_Driver.findElement(By.xpath("//*[@id='ctl00_cPHFilter_divFilter']/div/div/div/div[4]/div/span/div/button")).click();
		List<WebElement> list=m_Driver.findElements(By.xpath("//*[@id='ctl00_cPHFilter_divFilter']/div/div/div/div[4]/div/span/div/ul/li/a/label/input"));
		int size=list.size();
		for(int i=0;i<=size-1;i++)
		{
			List<WebElement> list1=m_Driver.findElements(By.xpath("//*[@id='ctl00_cPHFilter_divFilter']/div/div/div/div[4]/div/span/div/ul/li/a/label/input"));
			
			 if(0==i)
			 {
		      list1.get(i).click();
			 }
		      
		      String ChkName=m_Driver.findElements(By.xpath("//*[@id='ctl00_cPHFilter_divFilter']/div/div/div/div[4]/div/span/div/ul/li/a/label")).get(i).getText();
		      
		 System.out.println(ChkName);
		 if(ChkName.equals(PaySta))
		 {
			list.get(i).click();
			break;
		 }
		}
	}
	
	public void verifypaymentStatusUnpaid()
	{
		String GrossAmount=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_filtrec']/div/div/table/tbody/tr[1]/td[9]")).getText();
		String DueAmount=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_filtrec']/div/div/table/tbody/tr[1]/td[10]")).getText();
		
		
		Assert.assertEquals(GrossAmount,DueAmount );
		Reporter.log("verifypaymentStatusUnpaid: "+"="+"GrossAmount="+GrossAmount+"Amount Due ="+DueAmount);
		
	}
	public void verifypaymentStatusPaid()
	{
		String GrossAmount=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_filtrec']/div/div/table/tbody/tr[1]/td[9]")).getText();
		String DueAmount=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_filtrec']/div/div/table/tbody/tr[1]/td[10]")).getText();
		
		
		Assert.assertEquals("£0.00",DueAmount );
		Reporter.log("verifypaymentStatusPaid: "+"="+"GrossAmount="+GrossAmount+"Amount Due ="+DueAmount);
		
	}
	public void verifypaymentStatusPartially()
	{
		String GrossAmount=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_filtrec']/div/div/table/tbody/tr[1]/td[9]")).getText();
		String DueAmount=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_filtrec']/div/div/table/tbody/tr[1]/td[10]")).getText();
		
		
		Assert.assertEquals("£800.00",DueAmount );
		Reporter.log("verifypaymentStatusPartially: "+"="+"GrossAmount="+GrossAmount+"Amount Due ="+DueAmount);
		
	}
	
	
	public void DueSatatus_Due() throws InterruptedException
	{
		List<WebElement>list=m_Driver.findElements(By.xpath("//*[@id='ctl00_cPHFilter_dd_due']/option"));
	
		int size=list.size();
		for(int i=1;i<=size-1;i++)
		{
			List<WebElement>list2=m_Driver.findElements(By.xpath("//*[@id='ctl00_cPHFilter_dd_due']/option"));
        	String Name=	list2.get(i).getText();
        	WebElement DropDown=m_Driver.findElement(By.xpath("//SELECT[@id='ctl00_cPHFilter_dd_due']"));
        	Select sl=new Select(DropDown);
        	sl.selectByVisibleText(Name);
        	m_Driver.findElement(By.xpath("//*[@id='btnSearch']")).click();
        	
        	if("Due".equals(Name))
        	{
        	List<WebElement>list3=m_Driver.findElements(By.xpath("//*[@id='ctl00_cPH_filtrec']/div/div/table/tbody/tr/td[13]/a"));
        	for(int j=0;j<=list3.size()-1;j++)
        	{
        		List<WebElement>list4=m_Driver.findElements(By.xpath("//*[@id='ctl00_cPH_filtrec']/div/div/table/tbody/tr/td[13]/a"));
        		
        		list4.get(j).click();
        		String DueDate=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_txtDueDate']")).getAttribute("value");
        
        		 utilities.Screenshotcapture.Getscreenshot("verifyDueDate"+DueDate+"_"+j, "Sales filters");
        		
        		 jsExec.executeScript("arguments[0].scrollIntoView(true);", m_Driver.findElement(By.xpath("//*[@id='ctl00_cpHFooter_btnCancel']")));
        		 jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//*[@id='ctl00_cpHFooter_btnCancel']")));
        		 
        		 Reporter.log("DueSatatus_DueDate: "+DueDate);
                 Thread.sleep(3000);

        	}
        	
        	}
//        	if("Not Due".equals(Name))
//        	{
//        	List<WebElement>list5=m_Driver.findElements(By.xpath("//*[@id='ctl00_cPH_filtrec']/div/div/table/tbody/tr/td[13]/a"));
//        	for(int k=0;k<=list5.size()-1;k++)
//        	{
//        		List<WebElement>list6=m_Driver.findElements(By.xpath("//*[@id='ctl00_cPH_filtrec']/div/div/table/tbody/tr/td[13]/a"));
//        		
//        		list6.get(k).click();
//        		String DueDate=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_txtDueDate']")).getAttribute("value");
//        		 utilities.Screenshotcapture.Getscreenshot("verifyNoDueDate"+DueDate+"_"+k, "Sales filters");
//        		
//        		 jsExec.executeScript("arguments[0].scrollIntoView(true);", m_Driver.findElement(By.xpath("//*[@id='ctl00_cpHFooter_btnCancel']")));
//        		 jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//*[@id='ctl00_cpHFooter_btnCancel']")));
//        		 
//                 Thread.sleep(3000);
//
//        	}
//        	
//        	}
		}
	
		
	}
	
	public void DueSatatus_NotDue() throws InterruptedException
	{
		List<WebElement>list=m_Driver.findElements(By.xpath("//*[@id='ctl00_cPHFilter_dd_due']/option"));
	
		int size=list.size();
		for(int i=1;i<=size-1;i++)
		{
			List<WebElement>list2=m_Driver.findElements(By.xpath("//*[@id='ctl00_cPHFilter_dd_due']/option"));
        	String Name=	list2.get(i).getText();
        	WebElement DropDown=m_Driver.findElement(By.xpath("//SELECT[@id='ctl00_cPHFilter_dd_due']"));
        	Select sl=new Select(DropDown);
        	sl.selectByVisibleText(Name);
        	m_Driver.findElement(By.xpath("//*[@id='btnSearch']")).click();
        	
//        	if("Due".equals(Name))
//        	{
//        	List<WebElement>list3=m_Driver.findElements(By.xpath("//*[@id='ctl00_cPH_filtrec']/div/div/table/tbody/tr/td[13]/a"));
//        	for(int j=0;j<=list3.size()-1;j++)
//        	{
//        		List<WebElement>list4=m_Driver.findElements(By.xpath("//*[@id='ctl00_cPH_filtrec']/div/div/table/tbody/tr/td[13]/a"));
//        		
//        		list4.get(j).click();
//        		String DueDate=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_txtDueDate']")).getAttribute("value");
//        		 utilities.Screenshotcapture.Getscreenshot("verifyDueDate"+DueDate+"_"+j, "Sales filters");
//        		
//        		 jsExec.executeScript("arguments[0].scrollIntoView(true);", m_Driver.findElement(By.xpath("//*[@id='ctl00_cpHFooter_btnCancel']")));
//        		 jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//*[@id='ctl00_cpHFooter_btnCancel']")));
//        		 
//                 Thread.sleep(3000);
//
//        	}
//        	
//        	}
        	if("Not Due".equals(Name))
        	{
        	List<WebElement>list5=m_Driver.findElements(By.xpath("//*[@id='ctl00_cPH_filtrec']/div/div/table/tbody/tr/td[13]/a"));
        	for(int k=0;k<=list5.size()-1;k++)
        	{
        		List<WebElement>list6=m_Driver.findElements(By.xpath("//*[@id='ctl00_cPH_filtrec']/div/div/table/tbody/tr/td[13]/a"));
        		
        		list6.get(k).click();
        		String DueDate=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_txtDueDate']")).getAttribute("value");
        		 utilities.Screenshotcapture.Getscreenshot("verifyNoDueDate"+DueDate+"_"+k, "Sales filters");
        		
        		 jsExec.executeScript("arguments[0].scrollIntoView(true);", m_Driver.findElement(By.xpath("//*[@id='ctl00_cpHFooter_btnCancel']")));
        		 jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//*[@id='ctl00_cpHFooter_btnCancel']")));
        		 
        		 Reporter.log("DueSatatus_NotDue: "+DueDate);
                 Thread.sleep(3000);

        	}
        	
        	}
		}
	
		
	}
	
	
	
	
	
	
	}
	
	
