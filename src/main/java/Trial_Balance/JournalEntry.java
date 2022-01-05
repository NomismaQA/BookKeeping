package Trial_Balance;

import pages.BasePage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;

import Generic.SeleniumLib;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/087dbd85-2fc3-4455-b44e-51aedaf57d47
@TestModellerModule(guid = "087dbd85-2fc3-4455-b44e-51aedaf57d47")
public class JournalEntry extends BasePage
{
	
	static String ret=" ";
	public JournalEntry (WebDriver driver)
	{
		super(driver);
	}
	SeleniumLib sl;
	private ArrayList<String> ledger=new ArrayList<String>();
	private ArrayList<String> expected_entry= new ArrayList<String>();
	private ArrayList<String> amt=new ArrayList<String>();
	int a;
	String Amount="";
	int b;
	String Amount1="";
	int c;
	String Amount2="";
	private By AccountantlefttabElem = By.xpath("//A[@href='../AccountUI/AccountantDashboard.aspx?FYCode=52444&CompanyCode=13236&IsFirstRequest=1']");
	private By plusiconclickElem = By.xpath("//A[@id='ctl00_cPH_btnAddJournalEntry']");
	private By Enter_tDateElem = By.xpath("//*[@id='ctl00_cPH_txtDate']");
	private By Reverse_DateElem = By.xpath("//INPUT[@name='ctl00$cPH$txtReverseDate']");
	//private By Enter_DescriptionElem = By.xpath("//*[@id='ctl00_cPH_txtDescription')");
	private By Enter_DescriptionElem = By.xpath("//*[@name='ctl00$cPH$txtDescription']");
	private By Slect_CurrencyElem = By.xpath("//SELECT[@name='ctl00$cPH$ddCurrency']");

	private By ClickaccountboxElem = By.xpath("//INPUT[@name='ctl00$cPH$rptRecord$ctl00$AccountUC1$txtAccount']");
	//private By ClickaccountboxElem2 = By.xpath("//INPUT[@name='ctl00$cPH$rptRecord$ctl01$AccountUC1$txtAccount']");
	
	private By ClickaccountboxElem2 = By.xpath("//*[@id='select2-ctl00_cPH_rptRecord_ctl01_ltAccount-container']");
	
	private By ClickaccountboxElem3 = By.xpath("//*[@id='select2-ctl00_cPH_rptRecord_ctl02_ltAccount-container']");
	
	private By ClickaccountboxElem4 = By.xpath("//*[@id='select2-ctl00_cPH_rptRecord_ctl03_ltAccount-container']");
	
	private By ClickaccountboxElem5 = By.xpath("//*[@id='select2-ctl00_cPH_rptRecord_ctl04_ltAccount-container']");
	
	private By Enter_DebitElem = By.xpath("//INPUT[@name='ctl00$cPH$rptRecord$ctl00$txtDebit']");
	
	private By Enter_DebitElem2 = By.xpath("//INPUT[@name='ctl00$cPH$rptRecord$ctl01$txtDebit']");
	
	private By Enter_DebitElem3 = By.xpath("//INPUT[@name='ctl00$cPH$rptRecord$ctl02$txtDebit']");
	
	private By Enter_DebitElem4 = By.xpath("//INPUT[@name='ctl00$cPH$rptRecord$ctl03$txtDebit']");
	
	private By Enter_DebitElem5 = By.xpath("//INPUT[@name='ctl00$cPH$rptRecord$ctl04$txtDebit']");

	private By Enter_CreditElem = By.xpath("//INPUT[@name='ctl00$cPH$rptRecord$ctl01$txtCredit']");

	private By Enter_NoteElem = By.xpath("//INPUT[@name='ctl00$cPH$rptRecord$ctl00$txtNote']");

	private By Click_deliconElem = By.xpath("/html/body/form/div[3]/div[1]/div[2]/div/div/div/table/tbody[2]/tr[1]/td[5]");

	private By Click_CheckboxElem = By.xpath("//label[contains(.,'Tick for more line items')]/../input");

	private By Click_Save_btnElem = By.xpath("//A[@id='ctl00_cphFooter_btnSave']");

	private By Click_CancelbtnElem = By.xpath("//A[@id='ctl00_cphFooter_btnCancelmodal']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/AccountUI/AccountantDashboard.aspx?FYCode=52444&CompanyCode=13236&IsFirstRequest=1");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AccountUI/AccountantDashboard.aspx?FYCode=52444&CompanyCode=13236&IsFirstRequest=1");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AccountUI/AccountantDashboard.aspx?FYCode=52444&CompanyCode=13236&IsFirstRequest=1");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
//   public void AssertUrl()
//    {
//        String currentUrl = m_Driver.getCurrentUrl();
//        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AccountUI/AccountantDashboard.aspx?FYCode=52444&CompanyCode=13236&IsFirstRequest=1";
//
//        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AccountUI/AccountantDashboard.aspx?FYCode=52444&CompanyCode=13236&IsFirstRequest=1")) {
//            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
//        }
//    }

     
	/**
 	 * Click Accountantlefttab
     * @name Click Accountantlefttab
     */
	public void Click_Accountantlefttab()
	{
        
		WebElement elem = getWebElement(AccountantlefttabElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Accountantlefttab", "Click_Accountantlefttab failed. Unable to locate object: " + AccountantlefttabElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Accountantlefttab", "Click_Accountantlefttab failed. Unable to locate object: " + AccountantlefttabElem.toString());

			Assert.fail("Unable to locate object: " + AccountantlefttabElem.toString());
        }

		elem.click();
		
		
		//jsExec.executeScript("arguments[0].click()", elem);
          	

		ExtentReportManager.passStep(m_Driver, "Click_Accountantlefttab");

		TestModellerLogger.PassStep(m_Driver, "Click_Accountantlefttab");
	}

     
	/**
 	 * Click plusiconclick
     * @name Click plusiconclick
     */
	public void Click_plusiconclick()
	{
        
		WebElement elem = getWebElement(plusiconclickElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_plusiconclick", "Click_plusiconclick failed. Unable to locate object: " + plusiconclickElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_plusiconclick", "Click_plusiconclick failed. Unable to locate object: " + plusiconclickElem.toString());

			Assert.fail("Unable to locate object: " + plusiconclickElem.toString());
        }

		elem.click();
    
		ExtentReportManager.passStep(m_Driver, "Click_plusiconclick");

		TestModellerLogger.PassStep(m_Driver, "Click_plusiconclick");
	}

      
	/**
 	 * Enter Enter_tDate
	 * @throws InterruptedException 
     * @name Enter Enter_tDate
     */
 	public void Enter_Enter_tDate(String Enter_tDate) throws InterruptedException
 	{
 		//*[@id="ctl00_cPH_journalmodal1Iframe1"]
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='ctl00_cPH_journalmodal1Iframe1']")));

 		WebElement elem = getWebElement(Enter_tDateElem);

// 		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_tDate", "Enter_Enter_tDate failed. Unable to locate object: " + Enter_tDateElem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_tDate", "Enter_Enter_tDate failed. Unable to locate object: " + Enter_tDateElem.toString());
//
// 			Assert.fail("Unable to locate object: " + Enter_tDateElem.toString());
//         }
// 		
 		 
        
 		elem.sendKeys(Enter_tDate);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_tDate " + Enter_tDate);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_tDate " + Enter_tDate);
 	}

 	public void Enter_Reverse_Date(String Reverse_Date)
 	{
 	    
	//	m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div/div[1]/div/div/div/div[1]/div/div/div/div[1]/div/div/div[2]/iframe")));
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='ctl00_cPH_journalmodal1Iframe1']")));
 		WebElement elem = getWebElement(Reverse_DateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Reverse_Date", "Enter_Reverse_Date failed. Unable to locate object: " + Reverse_DateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Reverse_Date", "Enter_Reverse_Date failed. Unable to locate object: " + Reverse_DateElem.toString());

 			Assert.fail("Unable to locate object: " + Reverse_DateElem.toString());
         }

 		elem.sendKeys(Reverse_Date);
 		elem.sendKeys(Keys.ENTER);
 		elem.sendKeys(Keys.TAB);
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Reverse_Date " + Reverse_Date);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Reverse_Date " + Reverse_Date);
 	}
	/**
 	 * Select Slect_Currency
	 * @throws InterruptedException 
     * @name Select Slect_Currency
     */
    public void Select_Slect_Currency(String Slect_Currency) throws InterruptedException
 	{
 	    
		//m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div/div[1]/div/div/div/div[1]/div/div/div/div[1]/div/div/div[2]/iframe")));
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='ctl00_cPH_journalmodal1Iframe1']")));
 		WebElement elem = getWebElement(Slect_CurrencyElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Slect_Currency", "Select_Slect_Currency failed. Unable to locate object: " + Slect_CurrencyElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Slect_Currency", "Select_Slect_Currency failed. Unable to locate object: " + Slect_CurrencyElem.toString());

 			Assert.fail("Unable to locate object: " + Slect_CurrencyElem.toString());
         }

 		Select dropdown = new Select(elem);
        //elem.sendKeys(Keys.ENTER);
 		dropdown.selectByVisibleText(Slect_Currency);
 		elem.sendKeys(Keys.TAB);
 		m_Driver.switchTo().defaultContent();
		//elem.sendKeys(Keys.TAB);
		//Thread.sleep((2000));
	 		ExtentReportManager.passStep(m_Driver, "Select_Slect_Currency " + Slect_Currency);

 		TestModellerLogger.PassStep(m_Driver, "Select_Slect_Currency " + Slect_Currency);
 	}
            /**
 	 * Enter Enter_Description
     * @throws InterruptedException 
     * @name Enter Enter_Description
     */
 	public void Enter_Enter_Description(String Enter_Description) throws InterruptedException
 	{
 	    
		//m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div/div[1]/div/div/div/div[1]/div/div/div/div[1]/div/div/div[2]/iframe")));
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='ctl00_cPH_journalmodal1Iframe1']")));
 		WebElement elem = getWebElement(Enter_DescriptionElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_Description", "Enter_Enter_Description failed. Unable to locate object: " + Enter_DescriptionElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_Description", "Enter_Enter_Description failed. Unable to locate object: " + Enter_DescriptionElem.toString());

 			Assert.fail("Unable to locate object: " + Enter_DescriptionElem.toString());
         }
       
 		
 		elem.sendKeys(Enter_Description);
 		jsExec.executeScript("arguments[0].scrollIntoView(true);", elem);
// 		Thread.sleep(1000);
// 		elem.sendKeys(Keys.TAB);
 		m_Driver.switchTo().defaultContent();
	

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_Description " + Enter_Description);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_Description " + Enter_Description);
 	}
   
	/**
 	 * Enter Clickaccountbox
	 * @throws InterruptedException 
     * @name Enter Clickaccountbox
     */
 	public void Enter_Clickaccountbox(String Clickaccountbox) throws InterruptedException
 	{
 		String a=Clickaccountbox.replaceAll(" ", "");
			String ab[]=a.split("-");
			ledger.add(0, ab[0]);
			String Name[]=Clickaccountbox.split("-");
			String ac=Name[1].trim();
			expected_entry.add(0, ac);
			
	//	m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div/div[1]/div/div/div/div[1]/div/div/div/div[1]/div/div/div[2]/iframe")));
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='ctl00_cPH_journalmodal1Iframe1']")));
 		WebElement elem = getWebElement(ClickaccountboxElem);

// 		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Clickaccountbox", "Enter_Clickaccountbox failed. Unable to locate object: " + ClickaccountboxElem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Clickaccountbox", "Enter_Clickaccountbox failed. Unable to locate object: " + ClickaccountboxElem.toString());
//
// 			Assert.fail("Unable to locate object: " + ClickaccountboxElem.toString());
//     
//}
 String std=Clickaccountbox;
 System.out.print("box"   +std );
 
 //System.out.println("//*[starts-with(text(),'" +std+"')]")");
 //m_Driver.findElement(By.xpath("//*[starts-with(text(),'" +std+ "')]")).click();
 
 //WebElement ele = 
 Thread.sleep(1000);
 m_Driver.findElement(By.xpath("//*[starts-with(text(),'"+std+"')]")).click();
 //ele.click();
 //jsExec.executeScript("arguments[0].click();", elem);
 
// By Accountele1 = By.xpath("//*[@id='select2-ctl00_cPH_rptRecord_ctl00_ltAccount-container']");
//	WebElement elem1 = getWebElement(Accountele1);
//	String aa=elem1.getAttribute("value");
	//expected_entry1.add(0, elem1.getAttribute("value"));
	
 try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	
	e.printStackTrace();
}
 		//elem.sendKeys(Clickaccountbox);
//Thread.sleep(1000);
 //elem.click();
 
		m_Driver.switchTo().defaultContent();

  		ExtentReportManager.passStep(m_Driver, "Enter_Clickaccountbox " + Clickaccountbox);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Clickaccountbox " + Clickaccountbox);
 	}

      
	/**
 	 * Enter Enter_Debit
     * @name Enter Enter_Debit
     */
 	public void Enter_Enter_Debit(String Enter_Debit)
 	{
 	    
	//	m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div/div[1]/div/div/div/div[1]/div/div/div/div[1]/div/div/div[2]/iframe")));
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='ctl00_cPH_journalmodal1Iframe1']")));
 		WebElement elem = getWebElement(Enter_DebitElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_Debit", "Enter_Enter_Debit failed. Unable to locate object: " + Enter_DebitElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_Debit", "Enter_Enter_Debit failed. Unable to locate object: " + Enter_DebitElem.toString());

 			Assert.fail("Unable to locate object: " + Enter_DebitElem.toString());
         }
//elem.click();
 		
 		//m_Driver.findElement(By.name("//*[@name='ctl00$cPH$rptRecord$ctl00$txtDebit']")).click();
 		//jsExec.executeScript("arguments[0].click();", elem);
 		m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDebit']")).click();
 		elem.sendKeys(Enter_Debit);
 		//jsExec.executeScript("arguments[0].click();", elem);
 		int i=Integer.parseInt(Enter_Debit);
 				a=a+i;
 			Amount=String.valueOf(a);
 				
 		amt.add(0, Amount);
		m_Driver.switchTo().defaultContent();
		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_Debit " + Enter_Debit);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_Debit " + Enter_Debit);
 	}
 	public void Enter_Enter_Note(String Enter_Note)
 	{
 	    
	//	m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div/div[1]/div/div/div/div[1]/div/div/div/div[1]/div/div/div[2]/iframe")));
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='ctl00_cPH_journalmodal1Iframe1']")));
 		WebElement elem = getWebElement(Enter_NoteElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_Note", "Enter_Enter_Note failed. Unable to locate object: " + Enter_NoteElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_Note", "Enter_Enter_Note failed. Unable to locate object: " + Enter_NoteElem.toString());

 			Assert.fail("Unable to locate object: " + Enter_NoteElem.toString());
         }

 		elem.sendKeys(Enter_Note);
 		elem.sendKeys(Keys.TAB);
 		elem.sendKeys(Keys.TAB);
 		elem.sendKeys(Keys.ENTER);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_Note " + Enter_Note);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_Note " + Enter_Note);
 	}
 	
 	public void Enter_Clickaccountbox2(String Clickaccountbox2) throws InterruptedException
 	{
 		String a=Clickaccountbox2.replaceAll(" ", "");
		String ab[]=a.split("-");
		ledger.add(1, ab[0]);
		expected_entry.add(1, ab[1]);
 	    
	//	m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div/div[1]/div/div/div/div[1]/div/div/div/div[1]/div/div/div[2]/iframe")));
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='ctl00_cPH_journalmodal1Iframe1']")));
 		WebElement elem = getWebElement(ClickaccountboxElem2);

// 		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Clickaccountbox", "Enter_Clickaccountbox failed. Unable to locate object: " + ClickaccountboxElem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Clickaccountbox", "Enter_Clickaccountbox failed. Unable to locate object: " + ClickaccountboxElem.toString());
//
// 			Assert.fail("Unable to locate object: " + ClickaccountboxElem.toString());
//     
//}
 String std=Clickaccountbox2;
 System.out.println("box"   +std );
elem.click();
 
 //m_Driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Clickaccountbox2);
 //System.out.println("//*[starts-with(text(),'" +std+"')]")");
 //m_Driver.findElement(By.xpath("//*[starts-with(text(),'" +std+ "')]")).click();

 ///elem.sendKeys("Meera");
 Thread.sleep(1000);
m_Driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Clickaccountbox2);
m_Driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
 //WebElement ele = 

//m_Driver.findElement(By.xpath("//*[@id='select2-ctl00_cPH_rptRecord_ctl01_ltAccount-container']")).sendKeys(Clickaccountbox2);
 //m_Driver.findElement(By.xpath("//*[starts-with(text(),'"+std+"')]")).click();
 //ele.click();
 //jsExec.executeScript("arguments[0].click();", elem);
 
 		//elem.sendKeys(Clickaccountbox);
// Thread.sleep(1000);
 //elem.click();
 
		m_Driver.switchTo().defaultContent();

  		ExtentReportManager.passStep(m_Driver, "Enter_Clickaccountbox " + Clickaccountbox2);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Clickaccountbox " + Clickaccountbox2);
 	}
      
	/**
 	 * Enter Enter_Credit
     * @name Enter Enter_Credit
     */
 	public void Enter_Enter_Credit(String Enter_Credit)
 	{
 	    
		//m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div/div[1]/div/div/div/div[1]/div/div/div/div[1]/div/div/div[2]/iframe")));
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='ctl00_cPH_journalmodal1Iframe1']")));
 		WebElement elem = getWebElement(Enter_CreditElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_Credit", "Enter_Enter_Credit failed. Unable to locate object: " + Enter_CreditElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_Credit", "Enter_Enter_Credit failed. Unable to locate object: " + Enter_CreditElem.toString());

 			Assert.fail("Unable to locate object: " + Enter_CreditElem.toString());
         }

 		elem.sendKeys(Enter_Credit);
 		//jsExec.executeScript("arguments[0].click();", elem);
 		elem.sendKeys(Keys.TAB);
 		
 		int i=Integer.parseInt(Enter_Credit);
			b=a+i;
		Amount1=String.valueOf(b);
			
	amt.add(1, Amount1);
		m_Driver.switchTo().defaultContent();
		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_Credit " + Enter_Credit);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_Credit " + Enter_Credit);
 	}

      
	/**
 	 * Enter Enter_Note
     * @name Enter Enter_Note
     */
 	

     
	/**
 	 * Click Click_delicon
     * @name Click Click_delicon
     */
//	public void Click_Click_delicon()
//	{
//        
//		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div/div[1]/div/div/div/div[1]/div/div/div/div[1]/div/div/div[2]/iframe")));
//
//		WebElement elem = getWebElement(Click_deliconElem);
//
//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Click_delicon", "Click_Click_delicon failed. Unable to locate object: " + Click_deliconElem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Click_delicon", "Click_Click_delicon failed. Unable to locate object: " + Click_deliconElem.toString());
//
//			Assert.fail("Unable to locate object: " + Click_deliconElem.toString());
//        }
//
//		elem.click();
//        
//		m_Driver.switchTo().defaultContent();
//  	
//
//		ExtentReportManager.passStep(m_Driver, "Click_Click_delicon");
//
//		TestModellerLogger.PassStep(m_Driver, "Click_Click_delicon");
//	}

     
	/**
 	 * Click Click_Checkbox
     * @name Click Click_Checkbox
     */
	public void Click_Click_Checkbox()
	{
        
	//	m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div/div[1]/div/div/div/div[1]/div/div/div/div[1]/div/div/div[2]/iframe")));
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='ctl00_cPH_journalmodal1Iframe1']")));
		WebElement elem = getWebElement(Click_CheckboxElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Click_Checkbox", "Click_Click_Checkbox failed. Unable to locate object: " + Click_CheckboxElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Click_Checkbox", "Click_Click_Checkbox failed. Unable to locate object: " + Click_CheckboxElem.toString());

			Assert.fail("Unable to locate object: " + Click_CheckboxElem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_Click_Checkbox");

		TestModellerLogger.PassStep(m_Driver, "Click_Click_Checkbox");
	}

     
	/**
 	 * Click Click_Save btn
	 * @throws InterruptedException 
     * @name Click Click_Save btn
     */
	public void Click_Click_Save_btn() throws InterruptedException
	{
        
	//	m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div/div[1]/div/div/div/div[1]/div/div/div/div[1]/div/div/div[2]/iframe")));
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='ctl00_cPH_journalmodal1Iframe1']")));
		WebElement elem = getWebElement(Click_Save_btnElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Click_Save_btn", "Click_Click_Save_btn failed. Unable to locate object: " + Click_Save_btnElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Click_Save_btn", "Click_Click_Save_btn failed. Unable to locate object: " + Click_Save_btnElem.toString());

			Assert.fail("Unable to locate object: " + Click_Save_btnElem.toString());
        }

		//elem.click();
		jsExec.executeScript("arguments[0].click();", elem);
		Thread.sleep(2000);
	//	WebElement mes = m_Driver.findElement(By.xpath("//*[@id='ctl00_divSubContent']/div[1]/div"));
	//	String mes1 = mes.getText();
		
	//	String mess[] =mes1.split(" ");
	//	ret = mess[4];
	//	System.out.println("return"+ret);
		
		m_Driver.switchTo().defaultContent();
	//	Thread.sleep(2000);

		ExtentReportManager.passStep(m_Driver, "Click_Click_Save_btn");

		TestModellerLogger.PassStep(m_Driver, "Click_Click_Save_btn");
	}
public String message()
{
	return ret;
}
	
	
     
	/**
 	 * Click Click_Cancelbtn
     * @name Click Click_Cancelbtn
     */
//	public void Click_Click_Cancelbtn()
//	{
//        
//		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div/div[1]/div/div/div/div[1]/div/div/div/div[1]/div/div/div[2]/iframe")));
//
//		WebElement elem = getWebElement(Click_CancelbtnElem);
//
//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Click_Cancelbtn", "Click_Click_Cancelbtn failed. Unable to locate object: " + Click_CancelbtnElem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Click_Cancelbtn", "Click_Click_Cancelbtn failed. Unable to locate object: " + Click_CancelbtnElem.toString());
//
//			Assert.fail("Unable to locate object: " + Click_CancelbtnElem.toString());
//        }
//
//		elem.click();
//        
//		m_Driver.switchTo().defaultContent();
//  	
//
//		ExtentReportManager.passStep(m_Driver, "Click_Click_Cancelbtn");
//
//		TestModellerLogger.PassStep(m_Driver, "Click_Click_Cancelbtn");
//	}



public void Enter_Clickaccountbox3(String Clickaccountbox3) throws InterruptedException
	{
	String a=Clickaccountbox3.replaceAll(" ", "");
	String ab[]=a.split("-");
	ledger.add(2, ab[0]);
	expected_entry.add(2, ab[1]);
//	m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div/div[1]/div/div/div/div[1]/div/div/div/div[1]/div/div/div[2]/iframe")));
	m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='ctl00_cPH_journalmodal1Iframe1']")));
		WebElement elem = getWebElement(ClickaccountboxElem3);

//		if (elem == null) {
//		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Clickaccountbox", "Enter_Clickaccountbox failed. Unable to locate object: " + ClickaccountboxElem.toString());
//
//		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Clickaccountbox", "Enter_Clickaccountbox failed. Unable to locate object: " + ClickaccountboxElem.toString());
//
//			Assert.fail("Unable to locate object: " + ClickaccountboxElem.toString());
// 
//}
String std=Clickaccountbox3;
System.out.println("box"   +std );
elem.click();

//m_Driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Clickaccountbox2);
//System.out.println("//*[starts-with(text(),'" +std+"')]")");
//m_Driver.findElement(By.xpath("//*[starts-with(text(),'" +std+ "')]")).click();

///elem.sendKeys("Meera");
Thread.sleep(1000);
m_Driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Clickaccountbox3);
m_Driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
//WebElement ele = 

//m_Driver.findElement(By.xpath("//*[@id='select2-ctl00_cPH_rptRecord_ctl01_ltAccount-container']")).sendKeys(Clickaccountbox2);
//m_Driver.findElement(By.xpath("//*[starts-with(text(),'"+std+"')]")).click();
//ele.click();
//jsExec.executeScript("arguments[0].click();", elem);

		//elem.sendKeys(Clickaccountbox);
//Thread.sleep(1000);
//elem.click();

	m_Driver.switchTo().defaultContent();

	}
  
public void Enter_Enter_Debit_3(String Enter_Debit)
	{
	    
//	m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div/div[1]/div/div/div/div[1]/div/div/div/div[1]/div/div/div[2]/iframe")));
	m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='ctl00_cPH_journalmodal1Iframe1']")));
		WebElement elem = getWebElement(Enter_DebitElem3);

	
   
//elem.click();
		
		//m_Driver.findElement(By.name("//*[@name='ctl00$cPH$rptRecord$ctl00$txtDebit']")).click();
		//jsExec.executeScript("arguments[0].click();", elem);
		m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl02_txtDebit']")).click();
		elem.sendKeys(Enter_Debit);

 		int i=Integer.parseInt(Enter_Debit);
			c=a+i;
		Amount2=String.valueOf(c);
			
	amt.add(1, Amount2);
		//jsExec.executeScript("arguments[0].click();", elem);
		
	m_Driver.switchTo().defaultContent();
	
		
	
	}
//*[@id="table1"]/tbody[2]/tr/td[1]//following-sibling::td[1][contains(text(),'7016')]

public void verifyData(){
	 
	// m_Driver.findElement(By.xpath("//*[@class='rotateiconsvg10']")).click();
		List<WebElement> elements = m_Driver.findElements(By.xpath("//tbody/tr/td[3]//following-sibling::a"));
	    int size = elements.size();
	    System.out.println(size);
	    for (int i = 0; i <size-1; i++) {
	    	WebElement ele2=m_Driver.findElement(By.xpath("//tbody/tr/td[3]//following-sibling::a[contains(text(),'"+expected_entry.get(i)+"')]"));
	    	String led_text = ele2.getText().trim();
	    	System.out.println(led_text);
	    	String[] ledgersplit =expected_entry.get(i).split("-");
	    	if(led_text.equals(ledgersplit))
	    	{
	    		Assert.assertEquals(led_text, ledgersplit);
	    		System.out.println(led_text+"="+ledgersplit);
	    	}
	    	else
	    	{
	    		String led_text2 = ele2.getText().trim();
	    		String a[]=led_text2.split("-");
				String []Actual=a[0].trim().split("-");
				Assert.assertEquals(Actual, ledgersplit);
				String Msg=Actual[0];
				String Msg2=ledgersplit[0];
				System.out.println(Msg+"="+Msg2);
	    	
	    	}
	    	
	    	Reporter.log("Ledger code verified: "+led_text);
	    	
	    	WebElement amount=m_Driver.findElement(By.xpath("//tbody/tr/td[7]//following-sibling::a[contains(text(),'"+amt.get(i)+"')]"));
	    	String ActAmt = amount.getText();
	    	String ExpAmt = amt.get(i)+".00";
	    	//System.out.println(xx);
	    	//System.out.println(yy);
	    	String[] z = amount.getText().split("", 3);
	    	if (z[0].equals("(")) {
	    		Assert.assertEquals(amount.getText().replaceAll(",", "").substring(1,8), ExpAmt);
			} else {
				Assert.assertEquals(amount.getText().replaceAll(",", ""), ExpAmt);
			}
	    	Reporter.log("Amount enter verified: "+ActAmt);
	    	sl.ScrollToElement(m_Driver, ele2);
		}
	    Reporter.log("Enteries are Verified on Balance Sheet Report page :", true);
	}







}